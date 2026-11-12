package com.garmin.proto.generated;

import com.garmin.android.apps.connectmobile.f3;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes5.dex */
public final class GDIInReachChatEvents {
    public static final int CONFIG_EXT_FIELD_NUMBER = 106;
    public static final int ITEM_EXT_FIELD_NUMBER = 106;
    public static final int ITEM_REF_EXT_FIELD_NUMBER = 106;
    public static final int STATUS_EXT_FIELD_NUMBER = 106;
    public static final GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.DataTypeConfig, DataTypeConfigExt> configExt;
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachChatEvents_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachChatEvents_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachChatEvents_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachChatEvents_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachChatEvents_Capabilities_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachChatEvents_Capabilities_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachChatEvents_ChatEvent_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachChatEvents_ChatEvent_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachChatEvents_ChatEventsUpdatedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachChatEvents_ChatEventsUpdatedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachChatEvents_DataTypeConfigExt_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachChatEvents_DataTypeConfigExt_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachChatEvents_DataTypeStatusExt_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachChatEvents_DataTypeStatusExt_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachChatEvents_GenericItemExt_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachChatEvents_GenericItemExt_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachChatEvents_GenericItemReferenceExt_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachChatEvents_GenericItemReferenceExt_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachChatEvents_InReachChatEventsService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachChatEvents_InReachChatEventsService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachChatEvents_LiveTrackData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachChatEvents_LiveTrackData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachChatEvents_SubscribeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachChatEvents_SubscribeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachChatEvents_SubscribeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachChatEvents_SubscribeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachChatEvents_SyncRequestInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachChatEvents_SyncRequestInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachChatEvents_SyncRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachChatEvents_SyncRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachChatEvents_SyncResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachChatEvents_SyncResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachChatEvents_UserIdentifier_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachChatEvents_UserIdentifier_fieldAccessorTable;
    public static final GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.GenericItem, GenericItemExt> itemExt;
    public static final GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.GenericItemReference, GenericItemReferenceExt> itemRefExt;
    public static final GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.DataTypeStatus, DataTypeStatusExt> statusExt;

    public interface CapabilitiesOrBuilder extends MessageOrBuilder {
        ChatEvent.Type getChatEventTypes(int i14);

        int getChatEventTypesCount();

        List<ChatEvent.Type> getChatEventTypesList();
    }

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
        Capabilities getCapabilities();

        CapabilitiesOrBuilder getCapabilitiesOrBuilder();

        boolean hasCapabilities();
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        Capabilities getCapabilities();

        CapabilitiesOrBuilder getCapabilitiesOrBuilder();

        boolean hasCapabilities();
    }

    public interface ChatEventOrBuilder extends MessageOrBuilder {
        LiveTrackData getLivetrackData();

        LiveTrackDataOrBuilder getLivetrackDataOrBuilder();

        long getReadTime();

        long getReceivedTime();

        UserIdentifier getRecipient();

        UserIdentifierOrBuilder getRecipientOrBuilder();

        UserIdentifier getSender();

        UserIdentifierOrBuilder getSenderOrBuilder();

        boolean getShouldNotify();

        ChatEvent.Type getType();

        long getUpdatedTime();

        GDIDataTypes.UUID getUuid();

        GDIDataTypes.UUIDOrBuilder getUuidOrBuilder();

        boolean hasLivetrackData();

        boolean hasReadTime();

        boolean hasReceivedTime();

        boolean hasRecipient();

        boolean hasSender();

        boolean hasShouldNotify();

        boolean hasType();

        boolean hasUpdatedTime();

        boolean hasUuid();
    }

    public interface ChatEventsUpdatedNotificationOrBuilder extends MessageOrBuilder {
        long getUpdatedTime();

        boolean hasUpdatedTime();
    }

    public interface DataTypeConfigExtOrBuilder extends MessageOrBuilder {
        int getMaxItemCount();

        SyncRequestInfo getRequestInfo();

        SyncRequestInfoOrBuilder getRequestInfoOrBuilder();

        long getUpdatedTime();

        boolean hasMaxItemCount();

        boolean hasRequestInfo();

        boolean hasUpdatedTime();
    }

    public interface DataTypeStatusExtOrBuilder extends MessageOrBuilder {
        DataTypeStatusExt.Status getStatus();

        boolean hasStatus();
    }

    public interface GenericItemExtOrBuilder extends MessageOrBuilder {
        ChatEvent getChatEvent();

        ChatEventOrBuilder getChatEventOrBuilder();

        boolean hasChatEvent();
    }

    public interface GenericItemReferenceExtOrBuilder extends MessageOrBuilder {
        long getUpdatedTime();

        GDIDataTypes.UUID getUuid();

        GDIDataTypes.UUIDOrBuilder getUuidOrBuilder();

        boolean hasUpdatedTime();

        boolean hasUuid();
    }

    public interface InReachChatEventsServiceOrBuilder extends MessageOrBuilder {
        CapabilitiesRequest getCapabilitiesRequest();

        CapabilitiesRequestOrBuilder getCapabilitiesRequestOrBuilder();

        CapabilitiesResponse getCapabilitiesResponse();

        CapabilitiesResponseOrBuilder getCapabilitiesResponseOrBuilder();

        ChatEventsUpdatedNotification getChatEventsUpdatedNotification();

        ChatEventsUpdatedNotificationOrBuilder getChatEventsUpdatedNotificationOrBuilder();

        SubscribeRequest getSubscribeRequest();

        SubscribeRequestOrBuilder getSubscribeRequestOrBuilder();

        SubscribeResponse getSubscribeResponse();

        SubscribeResponseOrBuilder getSubscribeResponseOrBuilder();

        SyncRequest getSyncRequest();

        SyncRequestOrBuilder getSyncRequestOrBuilder();

        SyncResponse getSyncResponse();

        SyncResponseOrBuilder getSyncResponseOrBuilder();

        boolean hasCapabilitiesRequest();

        boolean hasCapabilitiesResponse();

        boolean hasChatEventsUpdatedNotification();

        boolean hasSubscribeRequest();

        boolean hasSubscribeResponse();

        boolean hasSyncRequest();

        boolean hasSyncResponse();
    }

    public interface LiveTrackDataOrBuilder extends MessageOrBuilder {
        GDIDataTypes.UUID getCustomerUuid();

        GDIDataTypes.UUIDOrBuilder getCustomerUuidOrBuilder();

        long getSessionEndTime();

        String getSessionName();

        ByteString getSessionNameBytes();

        long getSessionStartTime();

        GDIDataTypes.UUID getSessionUuid();

        GDIDataTypes.UUIDOrBuilder getSessionUuidOrBuilder();

        boolean hasCustomerUuid();

        boolean hasSessionEndTime();

        boolean hasSessionName();

        boolean hasSessionStartTime();

        boolean hasSessionUuid();
    }

    public interface SubscribeRequestOrBuilder extends MessageOrBuilder {
        boolean getWantChatEventsUpdated();

        boolean hasWantChatEventsUpdated();
    }

    public interface SubscribeResponseOrBuilder extends MessageOrBuilder {
        SubscribeResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface SyncRequestInfoOrBuilder extends MessageOrBuilder {
        GDIDataTypes.UUID getAppUuid();

        GDIDataTypes.UUIDOrBuilder getAppUuidOrBuilder();

        int getProtocolVersion();

        SyncRequestInfo.SyncDataType getSyncDataType();

        SyncRequestInfo.SyncType getSyncType();

        boolean hasAppUuid();

        boolean hasProtocolVersion();

        boolean hasSyncDataType();

        boolean hasSyncType();
    }

    public interface SyncRequestOrBuilder extends MessageOrBuilder {
        SyncRequestInfo getRequestInfo();

        SyncRequestInfoOrBuilder getRequestInfoOrBuilder();

        boolean hasRequestInfo();
    }

    public interface SyncResponseOrBuilder extends MessageOrBuilder {
        SyncResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface UserIdentifierOrBuilder extends MessageOrBuilder {
        String getAddress();

        ByteString getAddressBytes();

        GDIDataTypes.UUID getUserId();

        GDIDataTypes.UUIDOrBuilder getUserIdOrBuilder();

        boolean hasAddress();

        boolean hasUserId();
    }

    static {
        GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.DataTypeConfig, DataTypeConfigExt> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(DataTypeConfigExt.class, DataTypeConfigExt.getDefaultInstance());
        configExt = generatedExtensionNewFileScopedGeneratedExtension;
        GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.DataTypeStatus, DataTypeStatusExt> generatedExtensionNewFileScopedGeneratedExtension2 = GeneratedMessage.newFileScopedGeneratedExtension(DataTypeStatusExt.class, DataTypeStatusExt.getDefaultInstance());
        statusExt = generatedExtensionNewFileScopedGeneratedExtension2;
        GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.GenericItemReference, GenericItemReferenceExt> generatedExtensionNewFileScopedGeneratedExtension3 = GeneratedMessage.newFileScopedGeneratedExtension(GenericItemReferenceExt.class, GenericItemReferenceExt.getDefaultInstance());
        itemRefExt = generatedExtensionNewFileScopedGeneratedExtension3;
        GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.GenericItem, GenericItemExt> generatedExtensionNewFileScopedGeneratedExtension4 = GeneratedMessage.newFileScopedGeneratedExtension(GenericItemExt.class, GenericItemExt.getDefaultInstance());
        itemExt = generatedExtensionNewFileScopedGeneratedExtension4;
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001aGDIInReachChatEvents.proto\u0012\u001bGDI.Proto.InReachChatEvents\u001a\u0012GDIDataTypes.proto\u001a\u001cGDIGenericItemTransfer.proto\"º\u0004\n\u0018InReachChatEventsService\u0012N\n\u0014capabilities_request\u0018\u0001 \u0001(\u000b20.GDI.Proto.InReachChatEvents.CapabilitiesRequest\u0012P\n\u0015capabilities_response\u0018\u0002 \u0001(\u000b21.GDI.Proto.InReachChatEvents.CapabilitiesResponse\u0012>\n\fsync_request\u0018\u0003 \u0001(\u000b2(.GDI.Proto.InReachChatEvents.SyncRequest\u0012@\n\rsync_response\u0018\u0004 \u0001(\u000b2).GDI.Proto.InReachChatEvents.SyncResponse\u0012H\n\u0011subscribe_request\u0018\u0005 \u0001(\u000b2-.GDI.Proto.InReachChatEvents.SubscribeRequest\u0012J\n\u0012subscribe_response\u0018\u0006 \u0001(\u000b2..GDI.Proto.InReachChatEvents.SubscribeResponse\u0012d\n chat_events_updated_notification\u0018\u0007 \u0001(\u000b2:.GDI.Proto.InReachChatEvents.ChatEventsUpdatedNotification\"U\n\fCapabilities\u0012E\n\u0010chat_event_types\u0018\u0001 \u0003(\u000e2+.GDI.Proto.InReachChatEvents.ChatEvent.Type\"M\n\u000eUserIdentifier\u0012*\n\u0007user_id\u0018\u0001 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\u0012\u000f\n\u0007address\u0018\u0002 \u0001(\t\"¾\u0001\n\rLiveTrackData\u0012/\n\fsession_uuid\u0018\u0001 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\u0012\u0014\n\fsession_name\u0018\u0002 \u0001(\t\u0012\u001a\n\u0012session_start_time\u0018\u0003 \u0001(\u0004\u0012\u0018\n\u0010session_end_time\u0018\u0004 \u0001(\u0004\u00120\n\rcustomer_uuid\u0018\u0005 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\"è\u0003\n\tChatEvent\u0012'\n\u0004uuid\u0018\u0001 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\u0012;\n\u0006sender\u0018\u0002 \u0001(\u000b2+.GDI.Proto.InReachChatEvents.UserIdentifier\u0012>\n\trecipient\u0018\u0003 \u0001(\u000b2+.GDI.Proto.InReachChatEvents.UserIdentifier\u00129\n\u0004type\u0018\u0004 \u0001(\u000e2+.GDI.Proto.InReachChatEvents.ChatEvent.Type\u0012\u0015\n\rshould_notify\u0018\u0005 \u0001(\b\u0012\u0015\n\rreceived_time\u0018\u0006 \u0001(\u0004\u0012\u0011\n\tread_time\u0018\u0007 \u0001(\u0004\u0012\u0014\n\fupdated_time\u0018\b \u0001(\u0004\u0012B\n\u000elivetrack_data\u0018\t \u0001(\u000b2*.GDI.Proto.InReachChatEvents.LiveTrackData\"_\n\u0004Type\u0012\u0010\n\fUNKNOWN_TYPE\u0010\u0000\u0012\r\n\tLIVETRACK\u0010\u0001\u0012\u0019\n\u0015TRUSTED_CONTACT_ADDED\u0010\u0002\u0012\u001b\n\u0017TRUSTED_CONTACT_REMOVED\u0010\u0003\"V\n\u0013CapabilitiesRequest\u0012?\n\fcapabilities\u0018\u0001 \u0001(\u000b2).GDI.Proto.InReachChatEvents.Capabilities\"W\n\u0014CapabilitiesResponse\u0012?\n\fcapabilities\u0018\u0001 \u0001(\u000b2).GDI.Proto.InReachChatEvents.Capabilities\"¿\u0003\n\u000fSyncRequestInfo\u0012\u001b\n\u0010protocol_version\u0018\u0001 \u0001(\r:\u00011\u0012+\n\bapp_uuid\u0018\u0002 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\u0012U\n\tsync_type\u0018\u0003 \u0001(\u000e25.GDI.Proto.InReachChatEvents.SyncRequestInfo.SyncType:\u000bINCREMENTAL\u0012Q\n\u000esync_data_type\u0018\u0004 \u0001(\u000e29.GDI.Proto.InReachChatEvents.SyncRequestInfo.SyncDataType\"<\n\bSyncType\u0012\u0015\n\u0011UNKNOWN_SYNC_TYPE\u0010\u0000\u0012\b\n\u0004FULL\u0010\u0001\u0012\u000f\n\u000bINCREMENTAL\u0010\u0002\"z\n\fSyncDataType\u0012\u001a\n\u0016UNKNOWN_SYNC_DATA_TYPE\u0010\u0000\u0012\u0007\n\u0003ALL\u0010\u0001\u0012\r\n\tLIVETRACK\u0010\u0002\u0012\u0019\n\u0015TRUSTED_CONTACT_ADDED\u0010\u0003\u0012\u001b\n\u0017TRUSTED_CONTACT_REMOVED\u0010\u0004\"Q\n\u000bSyncRequest\u0012B\n\frequest_info\u0018\u0001 \u0001(\u000b2,.GDI.Proto.InReachChatEvents.SyncRequestInfo\"ì\u0001\n\fSyncResponse\u0012@\n\u0006status\u0018\u0001 \u0002(\u000e20.GDI.Proto.InReachChatEvents.SyncResponse.Status\"\u0099\u0001\n\u0006Status\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0011\n\rGENERIC_ERROR\u0010\u0002\u0012\b\n\u0004BUSY\u0010\u0003\u0012 \n\u001cUNSUPPORTED_PROTOCOL_VERSION\u0010\u0004\u0012\u0019\n\u0015UNSUPPORTED_DATA_TYPE\u0010\u0005\u0012\u0010\n\fMISSING_INFO\u0010\u0006\u0012\u000e\n\nUP_TO_DATE\u0010\u0007\";\n\u0010SubscribeRequest\u0012'\n\u0018want_chat_events_updated\u0018\u0001 \u0001(\b:\u0005false\"\u0093\u0001\n\u0011SubscribeResponse\u0012E\n\u0006status\u0018\u0001 \u0002(\u000e25.GDI.Proto.InReachChatEvents.SubscribeResponse.Status\"7\n\u0006Status\u0012\u0012\n\u000eUNKNOWN_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0011\n\rGENERIC_ERROR\u0010\u0002\"5\n\u001dChatEventsUpdatedNotification\u0012\u0014\n\fupdated_time\u0018\u0001 \u0001(\u0004\"\u0085\u0001\n\u0011DataTypeConfigExt\u0012B\n\frequest_info\u0018\u0001 \u0001(\u000b2,.GDI.Proto.InReachChatEvents.SyncRequestInfo\u0012\u0014\n\fupdated_time\u0018\u0002 \u0001(\u0004\u0012\u0016\n\u000emax_item_count\u0018\u0003 \u0001(\r\"Å\u0001\n\u0011DataTypeStatusExt\u0012E\n\u0006status\u0018\u0001 \u0001(\u000e25.GDI.Proto.InReachChatEvents.DataTypeStatusExt.Status\"i\n\u0006Status\u0012\u0012\n\u000eUNKNOWN_STATUS\u0010\u0000\u0012 \n\u001cUNSUPPORTED_PROTOCOL_VERSION\u0010\u0001\u0012\u0019\n\u0015UNSUPPORTED_DATA_TYPE\u0010\u0002\u0012\u000e\n\nUP_TO_DATE\u0010\u0003\"X\n\u0017GenericItemReferenceExt\u0012'\n\u0004uuid\u0018\u0001 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\u0012\u0014\n\fupdated_time\u0018\u0002 \u0001(\u0004\"L\n\u000eGenericItemExt\u0012:\n\nchat_event\u0018\u0001 \u0001(\u000b2&.GDI.Proto.InReachChatEvents.ChatEvent:q\n\nconfig_ext\u0012-.GDI.Proto.GenericItemTransfer.DataTypeConfig\u0018j \u0001(\u000b2..GDI.Proto.InReachChatEvents.DataTypeConfigExt:q\n\nstatus_ext\u0012-.GDI.Proto.GenericItemTransfer.DataTypeStatus\u0018j \u0001(\u000b2..GDI.Proto.InReachChatEvents.DataTypeStatusExt:\u007f\n\fitem_ref_ext\u00123.GDI.Proto.GenericItemTransfer.GenericItemReference\u0018j \u0001(\u000b24.GDI.Proto.InReachChatEvents.GenericItemReferenceExt:i\n\bitem_ext\u0012*.GDI.Proto.GenericItemTransfer.GenericItem\u0018j \u0001(\u000b2+.GDI.Proto.InReachChatEvents.GenericItemExtB4\n\u001acom.garmin.proto.generatedB\u0014GDIInReachChatEventsH\u0003"}, new Descriptors.FileDescriptor[]{GDIDataTypes.getDescriptor(), GDIGenericItemTransferProto.getDescriptor()});
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_InReachChatEvents_InReachChatEventsService_descriptor = descriptor2;
        internal_static_GDI_Proto_InReachChatEvents_InReachChatEventsService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"CapabilitiesRequest", "CapabilitiesResponse", "SyncRequest", "SyncResponse", "SubscribeRequest", "SubscribeResponse", "ChatEventsUpdatedNotification"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_InReachChatEvents_Capabilities_descriptor = descriptor3;
        internal_static_GDI_Proto_InReachChatEvents_Capabilities_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"ChatEventTypes"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_InReachChatEvents_UserIdentifier_descriptor = descriptor4;
        internal_static_GDI_Proto_InReachChatEvents_UserIdentifier_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"UserId", "Address"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_InReachChatEvents_LiveTrackData_descriptor = descriptor5;
        internal_static_GDI_Proto_InReachChatEvents_LiveTrackData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"SessionUuid", "SessionName", "SessionStartTime", "SessionEndTime", "CustomerUuid"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_InReachChatEvents_ChatEvent_descriptor = descriptor6;
        internal_static_GDI_Proto_InReachChatEvents_ChatEvent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Uuid", "Sender", "Recipient", "Type", "ShouldNotify", "ReceivedTime", "ReadTime", "UpdatedTime", "LivetrackData"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_InReachChatEvents_CapabilitiesRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_InReachChatEvents_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Capabilities"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_InReachChatEvents_CapabilitiesResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_InReachChatEvents_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Capabilities"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_InReachChatEvents_SyncRequestInfo_descriptor = descriptor9;
        internal_static_GDI_Proto_InReachChatEvents_SyncRequestInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"ProtocolVersion", "AppUuid", "SyncType", "SyncDataType"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_InReachChatEvents_SyncRequest_descriptor = descriptor10;
        internal_static_GDI_Proto_InReachChatEvents_SyncRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"RequestInfo"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_InReachChatEvents_SyncResponse_descriptor = descriptor11;
        internal_static_GDI_Proto_InReachChatEvents_SyncResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Status"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_InReachChatEvents_SubscribeRequest_descriptor = descriptor12;
        internal_static_GDI_Proto_InReachChatEvents_SubscribeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"WantChatEventsUpdated"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_InReachChatEvents_SubscribeResponse_descriptor = descriptor13;
        internal_static_GDI_Proto_InReachChatEvents_SubscribeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Status"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_GDI_Proto_InReachChatEvents_ChatEventsUpdatedNotification_descriptor = descriptor14;
        internal_static_GDI_Proto_InReachChatEvents_ChatEventsUpdatedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"UpdatedTime"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(13);
        internal_static_GDI_Proto_InReachChatEvents_DataTypeConfigExt_descriptor = descriptor15;
        internal_static_GDI_Proto_InReachChatEvents_DataTypeConfigExt_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"RequestInfo", "UpdatedTime", "MaxItemCount"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(14);
        internal_static_GDI_Proto_InReachChatEvents_DataTypeStatusExt_descriptor = descriptor16;
        internal_static_GDI_Proto_InReachChatEvents_DataTypeStatusExt_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Status"});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(15);
        internal_static_GDI_Proto_InReachChatEvents_GenericItemReferenceExt_descriptor = descriptor17;
        internal_static_GDI_Proto_InReachChatEvents_GenericItemReferenceExt_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"Uuid", "UpdatedTime"});
        Descriptors.Descriptor descriptor18 = getDescriptor().getMessageTypes().get(16);
        internal_static_GDI_Proto_InReachChatEvents_GenericItemExt_descriptor = descriptor18;
        internal_static_GDI_Proto_InReachChatEvents_GenericItemExt_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"ChatEvent"});
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(descriptor.getExtensions().get(0));
        generatedExtensionNewFileScopedGeneratedExtension2.internalInit(descriptor.getExtensions().get(1));
        generatedExtensionNewFileScopedGeneratedExtension3.internalInit(descriptor.getExtensions().get(2));
        generatedExtensionNewFileScopedGeneratedExtension4.internalInit(descriptor.getExtensions().get(3));
        GDIDataTypes.getDescriptor();
        GDIGenericItemTransferProto.getDescriptor();
    }

    private GDIInReachChatEvents() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(configExt);
        extensionRegistryLite.add(statusExt);
        extensionRegistryLite.add(itemRefExt);
        extensionRegistryLite.add(itemExt);
    }

    public static final class ChatEventsUpdatedNotification extends GeneratedMessageV3 implements ChatEventsUpdatedNotificationOrBuilder {
        private static final ChatEventsUpdatedNotification DEFAULT_INSTANCE = new ChatEventsUpdatedNotification();

        @Deprecated
        public static final Parser<ChatEventsUpdatedNotification> PARSER = new AbstractParser<ChatEventsUpdatedNotification>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.ChatEventsUpdatedNotification.1
            @Override // com.google.protobuf.Parser
            public ChatEventsUpdatedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ChatEventsUpdatedNotification.newBuilder();
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
        public static final int UPDATED_TIME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private long updatedTime_;

        private ChatEventsUpdatedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.updatedTime_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ChatEventsUpdatedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_ChatEventsUpdatedNotification_descriptor;
        }

        public static Builder newBuilder(ChatEventsUpdatedNotification chatEventsUpdatedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(chatEventsUpdatedNotification);
        }

        public static ChatEventsUpdatedNotification parseDelimitedFrom(InputStream inputStream) {
            return (ChatEventsUpdatedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ChatEventsUpdatedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ChatEventsUpdatedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChatEventsUpdatedNotification)) {
                return super.equals(obj);
            }
            ChatEventsUpdatedNotification chatEventsUpdatedNotification = (ChatEventsUpdatedNotification) obj;
            if (hasUpdatedTime() != chatEventsUpdatedNotification.hasUpdatedTime()) {
                return false;
            }
            return (!hasUpdatedTime() || getUpdatedTime() == chatEventsUpdatedNotification.getUpdatedTime()) && getUnknownFields().equals(chatEventsUpdatedNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ChatEventsUpdatedNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt64Size(1, this.updatedTime_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventsUpdatedNotificationOrBuilder
        public long getUpdatedTime() {
            return this.updatedTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventsUpdatedNotificationOrBuilder
        public boolean hasUpdatedTime() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUpdatedTime()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashLong(getUpdatedTime());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_ChatEventsUpdatedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ChatEventsUpdatedNotification.class, Builder.class);
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
            return new ChatEventsUpdatedNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt64(1, this.updatedTime_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ChatEventsUpdatedNotificationOrBuilder {
            private int bitField0_;
            private long updatedTime_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(ChatEventsUpdatedNotification chatEventsUpdatedNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    chatEventsUpdatedNotification.updatedTime_ = this.updatedTime_;
                } else {
                    i14 = 0;
                }
                chatEventsUpdatedNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_ChatEventsUpdatedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChatEventsUpdatedNotification build() {
                ChatEventsUpdatedNotification chatEventsUpdatedNotificationBuildPartial = buildPartial();
                if (chatEventsUpdatedNotificationBuildPartial.isInitialized()) {
                    return chatEventsUpdatedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) chatEventsUpdatedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChatEventsUpdatedNotification buildPartial() {
                ChatEventsUpdatedNotification chatEventsUpdatedNotification = new ChatEventsUpdatedNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(chatEventsUpdatedNotification);
                }
                onBuilt();
                return chatEventsUpdatedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.updatedTime_ = 0L;
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

            public Builder clearUpdatedTime() {
                this.bitField0_ &= -2;
                this.updatedTime_ = 0L;
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
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_ChatEventsUpdatedNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventsUpdatedNotificationOrBuilder
            public long getUpdatedTime() {
                return this.updatedTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventsUpdatedNotificationOrBuilder
            public boolean hasUpdatedTime() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_ChatEventsUpdatedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ChatEventsUpdatedNotification.class, Builder.class);
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
                                    this.updatedTime_ = codedInputStream.readUInt64();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setUpdatedTime(long j8) {
                this.updatedTime_ = j8;
                this.bitField0_ |= 1;
                onChanged();
                return this;
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
            public ChatEventsUpdatedNotification getDefaultInstanceForType() {
                return ChatEventsUpdatedNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ChatEventsUpdatedNotification) {
                    return mergeFrom((ChatEventsUpdatedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ChatEventsUpdatedNotification chatEventsUpdatedNotification) {
                if (chatEventsUpdatedNotification == ChatEventsUpdatedNotification.getDefaultInstance()) {
                    return this;
                }
                if (chatEventsUpdatedNotification.hasUpdatedTime()) {
                    setUpdatedTime(chatEventsUpdatedNotification.getUpdatedTime());
                }
                mergeUnknownFields(chatEventsUpdatedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ChatEventsUpdatedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ChatEventsUpdatedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChatEventsUpdatedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChatEventsUpdatedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ChatEventsUpdatedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ ChatEventsUpdatedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ChatEventsUpdatedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private ChatEventsUpdatedNotification() {
            this.updatedTime_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ChatEventsUpdatedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ChatEventsUpdatedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ChatEventsUpdatedNotification parseFrom(InputStream inputStream) {
            return (ChatEventsUpdatedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ChatEventsUpdatedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChatEventsUpdatedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChatEventsUpdatedNotification parseFrom(CodedInputStream codedInputStream) {
            return (ChatEventsUpdatedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ChatEventsUpdatedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChatEventsUpdatedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SubscribeRequest extends GeneratedMessageV3 implements SubscribeRequestOrBuilder {
        private static final SubscribeRequest DEFAULT_INSTANCE = new SubscribeRequest();

        @Deprecated
        public static final Parser<SubscribeRequest> PARSER = new AbstractParser<SubscribeRequest>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.SubscribeRequest.1
            @Override // com.google.protobuf.Parser
            public SubscribeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SubscribeRequest.newBuilder();
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
        public static final int WANT_CHAT_EVENTS_UPDATED_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private boolean wantChatEventsUpdated_;

        private SubscribeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.wantChatEventsUpdated_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SubscribeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SubscribeRequest_descriptor;
        }

        public static Builder newBuilder(SubscribeRequest subscribeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(subscribeRequest);
        }

        public static SubscribeRequest parseDelimitedFrom(InputStream inputStream) {
            return (SubscribeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SubscribeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SubscribeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SubscribeRequest)) {
                return super.equals(obj);
            }
            SubscribeRequest subscribeRequest = (SubscribeRequest) obj;
            if (hasWantChatEventsUpdated() != subscribeRequest.hasWantChatEventsUpdated()) {
                return false;
            }
            return (!hasWantChatEventsUpdated() || getWantChatEventsUpdated() == subscribeRequest.getWantChatEventsUpdated()) && getUnknownFields().equals(subscribeRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SubscribeRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.wantChatEventsUpdated_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.SubscribeRequestOrBuilder
        public boolean getWantChatEventsUpdated() {
            return this.wantChatEventsUpdated_;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.SubscribeRequestOrBuilder
        public boolean hasWantChatEventsUpdated() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasWantChatEventsUpdated()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getWantChatEventsUpdated());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SubscribeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SubscribeRequest.class, Builder.class);
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
            return new SubscribeRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.wantChatEventsUpdated_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SubscribeRequestOrBuilder {
            private int bitField0_;
            private boolean wantChatEventsUpdated_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(SubscribeRequest subscribeRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    subscribeRequest.wantChatEventsUpdated_ = this.wantChatEventsUpdated_;
                } else {
                    i14 = 0;
                }
                subscribeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SubscribeRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SubscribeRequest build() {
                SubscribeRequest subscribeRequestBuildPartial = buildPartial();
                if (subscribeRequestBuildPartial.isInitialized()) {
                    return subscribeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) subscribeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SubscribeRequest buildPartial() {
                SubscribeRequest subscribeRequest = new SubscribeRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(subscribeRequest);
                }
                onBuilt();
                return subscribeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.wantChatEventsUpdated_ = false;
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

            public Builder clearWantChatEventsUpdated() {
                this.bitField0_ &= -2;
                this.wantChatEventsUpdated_ = false;
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
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SubscribeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.SubscribeRequestOrBuilder
            public boolean getWantChatEventsUpdated() {
                return this.wantChatEventsUpdated_;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.SubscribeRequestOrBuilder
            public boolean hasWantChatEventsUpdated() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SubscribeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SubscribeRequest.class, Builder.class);
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
                                    this.wantChatEventsUpdated_ = codedInputStream.readBool();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setWantChatEventsUpdated(boolean z14) {
                this.wantChatEventsUpdated_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
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
            public SubscribeRequest getDefaultInstanceForType() {
                return SubscribeRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SubscribeRequest) {
                    return mergeFrom((SubscribeRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SubscribeRequest subscribeRequest) {
                if (subscribeRequest == SubscribeRequest.getDefaultInstance()) {
                    return this;
                }
                if (subscribeRequest.hasWantChatEventsUpdated()) {
                    setWantChatEventsUpdated(subscribeRequest.getWantChatEventsUpdated());
                }
                mergeUnknownFields(subscribeRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SubscribeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SubscribeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SubscribeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SubscribeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SubscribeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SubscribeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SubscribeRequest() {
            this.wantChatEventsUpdated_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SubscribeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SubscribeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SubscribeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SubscribeRequest parseFrom(InputStream inputStream) {
            return (SubscribeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SubscribeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SubscribeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SubscribeRequest parseFrom(CodedInputStream codedInputStream) {
            return (SubscribeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SubscribeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SubscribeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Capabilities extends GeneratedMessageV3 implements CapabilitiesOrBuilder {
        public static final int CHAT_EVENT_TYPES_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<Integer> chatEventTypes_;
        private byte memoizedIsInitialized;
        private static final Internal.ListAdapter.Converter<Integer, ChatEvent.Type> chatEventTypes_converter_ = new Internal.ListAdapter.Converter<Integer, ChatEvent.Type>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.Capabilities.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public ChatEvent.Type convert(Integer num) {
                ChatEvent.Type typeForNumber = ChatEvent.Type.forNumber(num.intValue());
                return typeForNumber == null ? ChatEvent.Type.UNKNOWN_TYPE : typeForNumber;
            }
        };
        private static final Capabilities DEFAULT_INSTANCE = new Capabilities();

        @Deprecated
        public static final Parser<Capabilities> PARSER = new AbstractParser<Capabilities>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.Capabilities.2
            @Override // com.google.protobuf.Parser
            public Capabilities parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Capabilities.newBuilder();
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

        private Capabilities() {
            this.memoizedIsInitialized = (byte) -1;
            this.chatEventTypes_ = Collections.EMPTY_LIST;
        }

        public static Capabilities getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_Capabilities_descriptor;
        }

        public static Builder newBuilder(Capabilities capabilities) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(capabilities);
        }

        public static Capabilities parseDelimitedFrom(InputStream inputStream) {
            return (Capabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Capabilities parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Capabilities> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Capabilities)) {
                return super.equals(obj);
            }
            Capabilities capabilities = (Capabilities) obj;
            return this.chatEventTypes_.equals(capabilities.chatEventTypes_) && getUnknownFields().equals(capabilities.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.CapabilitiesOrBuilder
        public ChatEvent.Type getChatEventTypes(int i14) {
            return chatEventTypes_converter_.convert(this.chatEventTypes_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.CapabilitiesOrBuilder
        public int getChatEventTypesCount() {
            return this.chatEventTypes_.size();
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.CapabilitiesOrBuilder
        public List<ChatEvent.Type> getChatEventTypesList() {
            return new Internal.ListAdapter(this.chatEventTypes_, chatEventTypes_converter_);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Capabilities> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int i15 = 0;
            int iA = 0;
            while (true) {
                int size = this.chatEventTypes_.size();
                List<Integer> list = this.chatEventTypes_;
                if (i15 >= size) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list.size() + iA;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getChatEventTypesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.chatEventTypes_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_Capabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(Capabilities.class, Builder.class);
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
            return new Capabilities();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iF = 0;
            while (iF < this.chatEventTypes_.size()) {
                iF = f3.f(this.chatEventTypes_.get(iF), codedOutputStream, 1, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesOrBuilder {
            private int bitField0_;
            private List<Integer> chatEventTypes_;

            private Builder() {
                this.chatEventTypes_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(Capabilities capabilities) {
            }

            private void buildPartialRepeatedFields(Capabilities capabilities) {
                if ((this.bitField0_ & 1) != 0) {
                    this.chatEventTypes_ = Collections.unmodifiableList(this.chatEventTypes_);
                    this.bitField0_ &= -2;
                }
                capabilities.chatEventTypes_ = this.chatEventTypes_;
            }

            private void ensureChatEventTypesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.chatEventTypes_ = new ArrayList(this.chatEventTypes_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_Capabilities_descriptor;
            }

            public Builder addAllChatEventTypes(Iterable<? extends ChatEvent.Type> iterable) {
                ensureChatEventTypesIsMutable();
                Iterator<? extends ChatEvent.Type> it = iterable.iterator();
                while (it.hasNext()) {
                    this.chatEventTypes_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addChatEventTypes(ChatEvent.Type type) {
                type.getClass();
                ensureChatEventTypesIsMutable();
                this.chatEventTypes_.add(Integer.valueOf(type.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Capabilities build() {
                Capabilities capabilitiesBuildPartial = buildPartial();
                if (capabilitiesBuildPartial.isInitialized()) {
                    return capabilitiesBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) capabilitiesBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Capabilities buildPartial() {
                Capabilities capabilities = new Capabilities(this);
                buildPartialRepeatedFields(capabilities);
                if (this.bitField0_ != 0) {
                    buildPartial0(capabilities);
                }
                onBuilt();
                return capabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.chatEventTypes_ = Collections.EMPTY_LIST;
                this.bitField0_ = 0;
                return this;
            }

            public Builder clearChatEventTypes() {
                this.chatEventTypes_ = Collections.EMPTY_LIST;
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

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.CapabilitiesOrBuilder
            public ChatEvent.Type getChatEventTypes(int i14) {
                return (ChatEvent.Type) Capabilities.chatEventTypes_converter_.convert(this.chatEventTypes_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.CapabilitiesOrBuilder
            public int getChatEventTypesCount() {
                return this.chatEventTypes_.size();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.CapabilitiesOrBuilder
            public List<ChatEvent.Type> getChatEventTypesList() {
                return new Internal.ListAdapter(this.chatEventTypes_, Capabilities.chatEventTypes_converter_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_Capabilities_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_Capabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(Capabilities.class, Builder.class);
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
                                    if (ChatEvent.Type.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        ensureChatEventTypesIsMutable();
                                        this.chatEventTypes_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (ChatEvent.Type.forNumber(i15) == null) {
                                            mergeUnknownVarintField(1, i15);
                                        } else {
                                            ensureChatEventTypesIsMutable();
                                            this.chatEventTypes_.add(Integer.valueOf(i15));
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit);
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

            public Builder setChatEventTypes(int i14, ChatEvent.Type type) {
                type.getClass();
                ensureChatEventTypesIsMutable();
                this.chatEventTypes_.set(i14, Integer.valueOf(type.getNumber()));
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
            public Capabilities getDefaultInstanceForType() {
                return Capabilities.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.chatEventTypes_ = Collections.EMPTY_LIST;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Capabilities) {
                    return mergeFrom((Capabilities) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Capabilities capabilities) {
                if (capabilities == Capabilities.getDefaultInstance()) {
                    return this;
                }
                if (!capabilities.chatEventTypes_.isEmpty()) {
                    if (this.chatEventTypes_.isEmpty()) {
                        this.chatEventTypes_ = capabilities.chatEventTypes_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureChatEventTypesIsMutable();
                        this.chatEventTypes_.addAll(capabilities.chatEventTypes_);
                    }
                    onChanged();
                }
                mergeUnknownFields(capabilities.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Capabilities getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Capabilities parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Capabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Capabilities parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Capabilities parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private Capabilities(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Capabilities parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Capabilities parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ Capabilities(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Capabilities parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Capabilities parseFrom(InputStream inputStream) {
            return (Capabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Capabilities parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Capabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Capabilities parseFrom(CodedInputStream codedInputStream) {
            return (Capabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Capabilities parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Capabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int CAPABILITIES_FIELD_NUMBER = 1;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.CapabilitiesRequest.1
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
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Capabilities capabilities_;
        private byte memoizedIsInitialized;

        private CapabilitiesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_CapabilitiesRequest_descriptor;
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
            if (hasCapabilities() != capabilitiesRequest.hasCapabilities()) {
                return false;
            }
            return (!hasCapabilities() || getCapabilities().equals(capabilitiesRequest.getCapabilities())) && getUnknownFields().equals(capabilitiesRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.CapabilitiesRequestOrBuilder
        public Capabilities getCapabilities() {
            Capabilities capabilities = this.capabilities_;
            return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.CapabilitiesRequestOrBuilder
        public CapabilitiesOrBuilder getCapabilitiesOrBuilder() {
            Capabilities capabilities = this.capabilities_;
            return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCapabilities()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.CapabilitiesRequestOrBuilder
        public boolean hasCapabilities() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCapabilities()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCapabilities().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getCapabilities());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> capabilitiesBuilder_;
            private Capabilities capabilities_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CapabilitiesRequest capabilitiesRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                    capabilitiesRequest.capabilities_ = singleFieldBuilderV3 == null ? this.capabilities_ : (Capabilities) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                capabilitiesRequest.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> getCapabilitiesFieldBuilder() {
                if (this.capabilitiesBuilder_ == null) {
                    this.capabilitiesBuilder_ = new SingleFieldBuilderV3<>(getCapabilities(), getParentForChildren(), isClean());
                    this.capabilities_ = null;
                }
                return this.capabilitiesBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_CapabilitiesRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getCapabilitiesFieldBuilder();
                }
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
                this.capabilities_ = null;
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.capabilitiesBuilder_ = null;
                }
                return this;
            }

            public Builder clearCapabilities() {
                this.bitField0_ &= -2;
                this.capabilities_ = null;
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.capabilitiesBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.CapabilitiesRequestOrBuilder
            public Capabilities getCapabilities() {
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Capabilities) singleFieldBuilderV3.getMessage();
                }
                Capabilities capabilities = this.capabilities_;
                return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
            }

            public Capabilities.Builder getCapabilitiesBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Capabilities.Builder) getCapabilitiesFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.CapabilitiesRequestOrBuilder
            public CapabilitiesOrBuilder getCapabilitiesOrBuilder() {
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CapabilitiesOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Capabilities capabilities = this.capabilities_;
                return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_CapabilitiesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.CapabilitiesRequestOrBuilder
            public boolean hasCapabilities() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCapabilities(Capabilities capabilities) {
                Capabilities capabilities2;
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(capabilities);
                } else if ((this.bitField0_ & 1) == 0 || (capabilities2 = this.capabilities_) == null || capabilities2 == Capabilities.getDefaultInstance()) {
                    this.capabilities_ = capabilities;
                } else {
                    getCapabilitiesBuilder().mergeFrom(capabilities);
                }
                if (this.capabilities_ != null) {
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
                                    codedInputStream.readMessage(getCapabilitiesFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setCapabilities(Capabilities.Builder builder) {
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.capabilities_ = builder.build();
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
            public CapabilitiesRequest getDefaultInstanceForType() {
                return CapabilitiesRequest.getDefaultInstance();
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

            public Builder setCapabilities(Capabilities capabilities) {
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    capabilities.getClass();
                    this.capabilities_ = capabilities;
                } else {
                    singleFieldBuilderV3.setMessage(capabilities);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
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
                if (capabilitiesRequest.hasCapabilities()) {
                    mergeCapabilities(capabilitiesRequest.getCapabilities());
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

        public /* synthetic */ CapabilitiesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CapabilitiesRequest() {
            this.memoizedIsInitialized = (byte) -1;
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

        public static CapabilitiesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
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
        public static final int CAPABILITIES_FIELD_NUMBER = 1;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.CapabilitiesResponse.1
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
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Capabilities capabilities_;
        private byte memoizedIsInitialized;

        private CapabilitiesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_CapabilitiesResponse_descriptor;
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
            if (!(obj instanceof CapabilitiesResponse)) {
                return super.equals(obj);
            }
            CapabilitiesResponse capabilitiesResponse = (CapabilitiesResponse) obj;
            if (hasCapabilities() != capabilitiesResponse.hasCapabilities()) {
                return false;
            }
            return (!hasCapabilities() || getCapabilities().equals(capabilitiesResponse.getCapabilities())) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.CapabilitiesResponseOrBuilder
        public Capabilities getCapabilities() {
            Capabilities capabilities = this.capabilities_;
            return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.CapabilitiesResponseOrBuilder
        public CapabilitiesOrBuilder getCapabilitiesOrBuilder() {
            Capabilities capabilities = this.capabilities_;
            return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCapabilities()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.CapabilitiesResponseOrBuilder
        public boolean hasCapabilities() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCapabilities()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCapabilities().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getCapabilities());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> capabilitiesBuilder_;
            private Capabilities capabilities_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                    capabilitiesResponse.capabilities_ = singleFieldBuilderV3 == null ? this.capabilities_ : (Capabilities) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                capabilitiesResponse.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> getCapabilitiesFieldBuilder() {
                if (this.capabilitiesBuilder_ == null) {
                    this.capabilitiesBuilder_ = new SingleFieldBuilderV3<>(getCapabilities(), getParentForChildren(), isClean());
                    this.capabilities_ = null;
                }
                return this.capabilitiesBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_CapabilitiesResponse_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getCapabilitiesFieldBuilder();
                }
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
                if (this.bitField0_ != 0) {
                    buildPartial0(capabilitiesResponse);
                }
                onBuilt();
                return capabilitiesResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.capabilities_ = null;
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.capabilitiesBuilder_ = null;
                }
                return this;
            }

            public Builder clearCapabilities() {
                this.bitField0_ &= -2;
                this.capabilities_ = null;
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.capabilitiesBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.CapabilitiesResponseOrBuilder
            public Capabilities getCapabilities() {
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Capabilities) singleFieldBuilderV3.getMessage();
                }
                Capabilities capabilities = this.capabilities_;
                return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
            }

            public Capabilities.Builder getCapabilitiesBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Capabilities.Builder) getCapabilitiesFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.CapabilitiesResponseOrBuilder
            public CapabilitiesOrBuilder getCapabilitiesOrBuilder() {
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CapabilitiesOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Capabilities capabilities = this.capabilities_;
                return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.CapabilitiesResponseOrBuilder
            public boolean hasCapabilities() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCapabilities(Capabilities capabilities) {
                Capabilities capabilities2;
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(capabilities);
                } else if ((this.bitField0_ & 1) == 0 || (capabilities2 = this.capabilities_) == null || capabilities2 == Capabilities.getDefaultInstance()) {
                    this.capabilities_ = capabilities;
                } else {
                    getCapabilitiesBuilder().mergeFrom(capabilities);
                }
                if (this.capabilities_ != null) {
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
                                    codedInputStream.readMessage(getCapabilitiesFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setCapabilities(Capabilities.Builder builder) {
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.capabilities_ = builder.build();
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
            public CapabilitiesResponse getDefaultInstanceForType() {
                return CapabilitiesResponse.getDefaultInstance();
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

            public Builder setCapabilities(Capabilities capabilities) {
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    capabilities.getClass();
                    this.capabilities_ = capabilities;
                } else {
                    singleFieldBuilderV3.setMessage(capabilities);
                }
                this.bitField0_ |= 1;
                onChanged();
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
                if (capabilitiesResponse.hasCapabilities()) {
                    mergeCapabilities(capabilitiesResponse.getCapabilities());
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

    public static final class ChatEvent extends GeneratedMessageV3 implements ChatEventOrBuilder {
        public static final int LIVETRACK_DATA_FIELD_NUMBER = 9;
        public static final int READ_TIME_FIELD_NUMBER = 7;
        public static final int RECEIVED_TIME_FIELD_NUMBER = 6;
        public static final int RECIPIENT_FIELD_NUMBER = 3;
        public static final int SENDER_FIELD_NUMBER = 2;
        public static final int SHOULD_NOTIFY_FIELD_NUMBER = 5;
        public static final int TYPE_FIELD_NUMBER = 4;
        public static final int UPDATED_TIME_FIELD_NUMBER = 8;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private LiveTrackData livetrackData_;
        private byte memoizedIsInitialized;
        private long readTime_;
        private long receivedTime_;
        private UserIdentifier recipient_;
        private UserIdentifier sender_;
        private boolean shouldNotify_;
        private int type_;
        private long updatedTime_;
        private GDIDataTypes.UUID uuid_;
        private static final ChatEvent DEFAULT_INSTANCE = new ChatEvent();

        @Deprecated
        public static final Parser<ChatEvent> PARSER = new AbstractParser<ChatEvent>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.ChatEvent.1
            @Override // com.google.protobuf.Parser
            public ChatEvent parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ChatEvent.newBuilder();
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

        private ChatEvent(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.type_ = 0;
            this.shouldNotify_ = false;
            this.receivedTime_ = 0L;
            this.readTime_ = 0L;
            this.updatedTime_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ChatEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_ChatEvent_descriptor;
        }

        public static Builder newBuilder(ChatEvent chatEvent) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(chatEvent);
        }

        public static ChatEvent parseDelimitedFrom(InputStream inputStream) {
            return (ChatEvent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ChatEvent parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ChatEvent> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChatEvent)) {
                return super.equals(obj);
            }
            ChatEvent chatEvent = (ChatEvent) obj;
            if (hasUuid() != chatEvent.hasUuid()) {
                return false;
            }
            if ((hasUuid() && !getUuid().equals(chatEvent.getUuid())) || hasSender() != chatEvent.hasSender()) {
                return false;
            }
            if ((hasSender() && !getSender().equals(chatEvent.getSender())) || hasRecipient() != chatEvent.hasRecipient()) {
                return false;
            }
            if ((hasRecipient() && !getRecipient().equals(chatEvent.getRecipient())) || hasType() != chatEvent.hasType()) {
                return false;
            }
            if ((hasType() && this.type_ != chatEvent.type_) || hasShouldNotify() != chatEvent.hasShouldNotify()) {
                return false;
            }
            if ((hasShouldNotify() && getShouldNotify() != chatEvent.getShouldNotify()) || hasReceivedTime() != chatEvent.hasReceivedTime()) {
                return false;
            }
            if ((hasReceivedTime() && getReceivedTime() != chatEvent.getReceivedTime()) || hasReadTime() != chatEvent.hasReadTime()) {
                return false;
            }
            if ((hasReadTime() && getReadTime() != chatEvent.getReadTime()) || hasUpdatedTime() != chatEvent.hasUpdatedTime()) {
                return false;
            }
            if ((!hasUpdatedTime() || getUpdatedTime() == chatEvent.getUpdatedTime()) && hasLivetrackData() == chatEvent.hasLivetrackData()) {
                return (!hasLivetrackData() || getLivetrackData().equals(chatEvent.getLivetrackData())) && getUnknownFields().equals(chatEvent.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
        public LiveTrackData getLivetrackData() {
            LiveTrackData liveTrackData = this.livetrackData_;
            return liveTrackData == null ? LiveTrackData.getDefaultInstance() : liveTrackData;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
        public LiveTrackDataOrBuilder getLivetrackDataOrBuilder() {
            LiveTrackData liveTrackData = this.livetrackData_;
            return liveTrackData == null ? LiveTrackData.getDefaultInstance() : liveTrackData;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ChatEvent> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
        public long getReadTime() {
            return this.readTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
        public long getReceivedTime() {
            return this.receivedTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
        public UserIdentifier getRecipient() {
            UserIdentifier userIdentifier = this.recipient_;
            return userIdentifier == null ? UserIdentifier.getDefaultInstance() : userIdentifier;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
        public UserIdentifierOrBuilder getRecipientOrBuilder() {
            UserIdentifier userIdentifier = this.recipient_;
            return userIdentifier == null ? UserIdentifier.getDefaultInstance() : userIdentifier;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
        public UserIdentifier getSender() {
            UserIdentifier userIdentifier = this.sender_;
            return userIdentifier == null ? UserIdentifier.getDefaultInstance() : userIdentifier;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
        public UserIdentifierOrBuilder getSenderOrBuilder() {
            UserIdentifier userIdentifier = this.sender_;
            return userIdentifier == null ? UserIdentifier.getDefaultInstance() : userIdentifier;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getUuid()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getSender());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getRecipient());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(4, this.type_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeBoolSize(5, this.shouldNotify_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt64Size(6, this.receivedTime_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt64Size(7, this.readTime_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt64Size(8, this.updatedTime_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getLivetrackData());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
        public boolean getShouldNotify() {
            return this.shouldNotify_;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.UNKNOWN_TYPE : typeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
        public long getUpdatedTime() {
            return this.updatedTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
        public GDIDataTypes.UUID getUuid() {
            GDIDataTypes.UUID uuid = this.uuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
        public GDIDataTypes.UUIDOrBuilder getUuidOrBuilder() {
            GDIDataTypes.UUID uuid = this.uuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
        public boolean hasLivetrackData() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
        public boolean hasReadTime() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
        public boolean hasReceivedTime() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
        public boolean hasRecipient() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
        public boolean hasSender() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
        public boolean hasShouldNotify() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
        public boolean hasUpdatedTime() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
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
            if (hasSender()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSender().hashCode();
            }
            if (hasRecipient()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getRecipient().hashCode();
            }
            if (hasType()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + this.type_;
            }
            if (hasShouldNotify()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Internal.hashBoolean(getShouldNotify());
            }
            if (hasReceivedTime()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + Internal.hashLong(getReceivedTime());
            }
            if (hasReadTime()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + Internal.hashLong(getReadTime());
            }
            if (hasUpdatedTime()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + Internal.hashLong(getUpdatedTime());
            }
            if (hasLivetrackData()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getLivetrackData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_ChatEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(ChatEvent.class, Builder.class);
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
            if (hasUuid() && !getUuid().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSender() && !getSender().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasRecipient() && !getRecipient().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasLivetrackData() || getLivetrackData().isInitialized()) {
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
            return new ChatEvent();
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
                codedOutputStream.writeMessage(2, getSender());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getRecipient());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(4, this.type_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(5, this.shouldNotify_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt64(6, this.receivedTime_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt64(7, this.readTime_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeUInt64(8, this.updatedTime_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getLivetrackData());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ChatEventOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<LiveTrackData, LiveTrackData.Builder, LiveTrackDataOrBuilder> livetrackDataBuilder_;
            private LiveTrackData livetrackData_;
            private long readTime_;
            private long receivedTime_;
            private SingleFieldBuilderV3<UserIdentifier, UserIdentifier.Builder, UserIdentifierOrBuilder> recipientBuilder_;
            private UserIdentifier recipient_;
            private SingleFieldBuilderV3<UserIdentifier, UserIdentifier.Builder, UserIdentifierOrBuilder> senderBuilder_;
            private UserIdentifier sender_;
            private boolean shouldNotify_;
            private int type_;
            private long updatedTime_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> uuidBuilder_;
            private GDIDataTypes.UUID uuid_;

            private Builder() {
                this.type_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ChatEvent chatEvent) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                    chatEvent.uuid_ = singleFieldBuilderV3 == null ? this.uuid_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<UserIdentifier, UserIdentifier.Builder, UserIdentifierOrBuilder> singleFieldBuilderV4 = this.senderBuilder_;
                    chatEvent.sender_ = singleFieldBuilderV4 == null ? this.sender_ : (UserIdentifier) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<UserIdentifier, UserIdentifier.Builder, UserIdentifierOrBuilder> singleFieldBuilderV5 = this.recipientBuilder_;
                    chatEvent.recipient_ = singleFieldBuilderV5 == null ? this.recipient_ : (UserIdentifier) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    chatEvent.type_ = this.type_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    chatEvent.shouldNotify_ = this.shouldNotify_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    chatEvent.receivedTime_ = this.receivedTime_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    chatEvent.readTime_ = this.readTime_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    chatEvent.updatedTime_ = this.updatedTime_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<LiveTrackData, LiveTrackData.Builder, LiveTrackDataOrBuilder> singleFieldBuilderV6 = this.livetrackDataBuilder_;
                    chatEvent.livetrackData_ = singleFieldBuilderV6 == null ? this.livetrackData_ : (LiveTrackData) singleFieldBuilderV6.build();
                    i14 |= 256;
                }
                chatEvent.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_ChatEvent_descriptor;
            }

            private SingleFieldBuilderV3<LiveTrackData, LiveTrackData.Builder, LiveTrackDataOrBuilder> getLivetrackDataFieldBuilder() {
                if (this.livetrackDataBuilder_ == null) {
                    this.livetrackDataBuilder_ = new SingleFieldBuilderV3<>(getLivetrackData(), getParentForChildren(), isClean());
                    this.livetrackData_ = null;
                }
                return this.livetrackDataBuilder_;
            }

            private SingleFieldBuilderV3<UserIdentifier, UserIdentifier.Builder, UserIdentifierOrBuilder> getRecipientFieldBuilder() {
                if (this.recipientBuilder_ == null) {
                    this.recipientBuilder_ = new SingleFieldBuilderV3<>(getRecipient(), getParentForChildren(), isClean());
                    this.recipient_ = null;
                }
                return this.recipientBuilder_;
            }

            private SingleFieldBuilderV3<UserIdentifier, UserIdentifier.Builder, UserIdentifierOrBuilder> getSenderFieldBuilder() {
                if (this.senderBuilder_ == null) {
                    this.senderBuilder_ = new SingleFieldBuilderV3<>(getSender(), getParentForChildren(), isClean());
                    this.sender_ = null;
                }
                return this.senderBuilder_;
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
                    getSenderFieldBuilder();
                    getRecipientFieldBuilder();
                    getLivetrackDataFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChatEvent build() {
                ChatEvent chatEventBuildPartial = buildPartial();
                if (chatEventBuildPartial.isInitialized()) {
                    return chatEventBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) chatEventBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChatEvent buildPartial() {
                ChatEvent chatEvent = new ChatEvent(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(chatEvent);
                }
                onBuilt();
                return chatEvent;
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
                this.sender_ = null;
                SingleFieldBuilderV3<UserIdentifier, UserIdentifier.Builder, UserIdentifierOrBuilder> singleFieldBuilderV4 = this.senderBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.senderBuilder_ = null;
                }
                this.recipient_ = null;
                SingleFieldBuilderV3<UserIdentifier, UserIdentifier.Builder, UserIdentifierOrBuilder> singleFieldBuilderV5 = this.recipientBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.recipientBuilder_ = null;
                }
                this.type_ = 0;
                this.shouldNotify_ = false;
                this.receivedTime_ = 0L;
                this.readTime_ = 0L;
                this.updatedTime_ = 0L;
                this.livetrackData_ = null;
                SingleFieldBuilderV3<LiveTrackData, LiveTrackData.Builder, LiveTrackDataOrBuilder> singleFieldBuilderV6 = this.livetrackDataBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.livetrackDataBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLivetrackData() {
                this.bitField0_ &= -257;
                this.livetrackData_ = null;
                SingleFieldBuilderV3<LiveTrackData, LiveTrackData.Builder, LiveTrackDataOrBuilder> singleFieldBuilderV3 = this.livetrackDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.livetrackDataBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearReadTime() {
                this.bitField0_ &= -65;
                this.readTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearReceivedTime() {
                this.bitField0_ &= -33;
                this.receivedTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearRecipient() {
                this.bitField0_ &= -5;
                this.recipient_ = null;
                SingleFieldBuilderV3<UserIdentifier, UserIdentifier.Builder, UserIdentifierOrBuilder> singleFieldBuilderV3 = this.recipientBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.recipientBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSender() {
                this.bitField0_ &= -3;
                this.sender_ = null;
                SingleFieldBuilderV3<UserIdentifier, UserIdentifier.Builder, UserIdentifierOrBuilder> singleFieldBuilderV3 = this.senderBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.senderBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearShouldNotify() {
                this.bitField0_ &= -17;
                this.shouldNotify_ = false;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.bitField0_ &= -9;
                this.type_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUpdatedTime() {
                this.bitField0_ &= -129;
                this.updatedTime_ = 0L;
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
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_ChatEvent_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
            public LiveTrackData getLivetrackData() {
                SingleFieldBuilderV3<LiveTrackData, LiveTrackData.Builder, LiveTrackDataOrBuilder> singleFieldBuilderV3 = this.livetrackDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LiveTrackData) singleFieldBuilderV3.getMessage();
                }
                LiveTrackData liveTrackData = this.livetrackData_;
                return liveTrackData == null ? LiveTrackData.getDefaultInstance() : liveTrackData;
            }

            public LiveTrackData.Builder getLivetrackDataBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (LiveTrackData.Builder) getLivetrackDataFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
            public LiveTrackDataOrBuilder getLivetrackDataOrBuilder() {
                SingleFieldBuilderV3<LiveTrackData, LiveTrackData.Builder, LiveTrackDataOrBuilder> singleFieldBuilderV3 = this.livetrackDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LiveTrackDataOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LiveTrackData liveTrackData = this.livetrackData_;
                return liveTrackData == null ? LiveTrackData.getDefaultInstance() : liveTrackData;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
            public long getReadTime() {
                return this.readTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
            public long getReceivedTime() {
                return this.receivedTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
            public UserIdentifier getRecipient() {
                SingleFieldBuilderV3<UserIdentifier, UserIdentifier.Builder, UserIdentifierOrBuilder> singleFieldBuilderV3 = this.recipientBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UserIdentifier) singleFieldBuilderV3.getMessage();
                }
                UserIdentifier userIdentifier = this.recipient_;
                return userIdentifier == null ? UserIdentifier.getDefaultInstance() : userIdentifier;
            }

            public UserIdentifier.Builder getRecipientBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (UserIdentifier.Builder) getRecipientFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
            public UserIdentifierOrBuilder getRecipientOrBuilder() {
                SingleFieldBuilderV3<UserIdentifier, UserIdentifier.Builder, UserIdentifierOrBuilder> singleFieldBuilderV3 = this.recipientBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UserIdentifierOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UserIdentifier userIdentifier = this.recipient_;
                return userIdentifier == null ? UserIdentifier.getDefaultInstance() : userIdentifier;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
            public UserIdentifier getSender() {
                SingleFieldBuilderV3<UserIdentifier, UserIdentifier.Builder, UserIdentifierOrBuilder> singleFieldBuilderV3 = this.senderBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UserIdentifier) singleFieldBuilderV3.getMessage();
                }
                UserIdentifier userIdentifier = this.sender_;
                return userIdentifier == null ? UserIdentifier.getDefaultInstance() : userIdentifier;
            }

            public UserIdentifier.Builder getSenderBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (UserIdentifier.Builder) getSenderFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
            public UserIdentifierOrBuilder getSenderOrBuilder() {
                SingleFieldBuilderV3<UserIdentifier, UserIdentifier.Builder, UserIdentifierOrBuilder> singleFieldBuilderV3 = this.senderBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UserIdentifierOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UserIdentifier userIdentifier = this.sender_;
                return userIdentifier == null ? UserIdentifier.getDefaultInstance() : userIdentifier;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
            public boolean getShouldNotify() {
                return this.shouldNotify_;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
            public Type getType() {
                Type typeForNumber = Type.forNumber(this.type_);
                return typeForNumber == null ? Type.UNKNOWN_TYPE : typeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
            public long getUpdatedTime() {
                return this.updatedTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
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

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
            public GDIDataTypes.UUIDOrBuilder getUuidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.uuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
            public boolean hasLivetrackData() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
            public boolean hasReadTime() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
            public boolean hasReceivedTime() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
            public boolean hasRecipient() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
            public boolean hasSender() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
            public boolean hasShouldNotify() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
            public boolean hasUpdatedTime() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.ChatEventOrBuilder
            public boolean hasUuid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_ChatEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(ChatEvent.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasUuid() && !getUuid().isInitialized()) {
                    return false;
                }
                if (hasSender() && !getSender().isInitialized()) {
                    return false;
                }
                if (!hasRecipient() || getRecipient().isInitialized()) {
                    return !hasLivetrackData() || getLivetrackData().isInitialized();
                }
                return false;
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
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getSenderFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getRecipientFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Type.forNumber(i14) == null) {
                                        mergeUnknownVarintField(4, i14);
                                    } else {
                                        this.type_ = i14;
                                        this.bitField0_ |= 8;
                                    }
                                } else if (tag == 40) {
                                    this.shouldNotify_ = codedInputStream.readBool();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    this.receivedTime_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 32;
                                } else if (tag == 56) {
                                    this.readTime_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 64;
                                } else if (tag == 64) {
                                    this.updatedTime_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 128;
                                } else if (tag == 74) {
                                    codedInputStream.readMessage(getLivetrackDataFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeLivetrackData(LiveTrackData liveTrackData) {
                LiveTrackData liveTrackData2;
                SingleFieldBuilderV3<LiveTrackData, LiveTrackData.Builder, LiveTrackDataOrBuilder> singleFieldBuilderV3 = this.livetrackDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(liveTrackData);
                } else if ((this.bitField0_ & 256) == 0 || (liveTrackData2 = this.livetrackData_) == null || liveTrackData2 == LiveTrackData.getDefaultInstance()) {
                    this.livetrackData_ = liveTrackData;
                } else {
                    getLivetrackDataBuilder().mergeFrom(liveTrackData);
                }
                if (this.livetrackData_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRecipient(UserIdentifier userIdentifier) {
                UserIdentifier userIdentifier2;
                SingleFieldBuilderV3<UserIdentifier, UserIdentifier.Builder, UserIdentifierOrBuilder> singleFieldBuilderV3 = this.recipientBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(userIdentifier);
                } else if ((this.bitField0_ & 4) == 0 || (userIdentifier2 = this.recipient_) == null || userIdentifier2 == UserIdentifier.getDefaultInstance()) {
                    this.recipient_ = userIdentifier;
                } else {
                    getRecipientBuilder().mergeFrom(userIdentifier);
                }
                if (this.recipient_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSender(UserIdentifier userIdentifier) {
                UserIdentifier userIdentifier2;
                SingleFieldBuilderV3<UserIdentifier, UserIdentifier.Builder, UserIdentifierOrBuilder> singleFieldBuilderV3 = this.senderBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(userIdentifier);
                } else if ((this.bitField0_ & 2) == 0 || (userIdentifier2 = this.sender_) == null || userIdentifier2 == UserIdentifier.getDefaultInstance()) {
                    this.sender_ = userIdentifier;
                } else {
                    getSenderBuilder().mergeFrom(userIdentifier);
                }
                if (this.sender_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
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

            public Builder setLivetrackData(LiveTrackData.Builder builder) {
                SingleFieldBuilderV3<LiveTrackData, LiveTrackData.Builder, LiveTrackDataOrBuilder> singleFieldBuilderV3 = this.livetrackDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.livetrackData_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setReadTime(long j8) {
                this.readTime_ = j8;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setReceivedTime(long j8) {
                this.receivedTime_ = j8;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setRecipient(UserIdentifier.Builder builder) {
                SingleFieldBuilderV3<UserIdentifier, UserIdentifier.Builder, UserIdentifierOrBuilder> singleFieldBuilderV3 = this.recipientBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.recipient_ = builder.build();
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

            public Builder setSender(UserIdentifier.Builder builder) {
                SingleFieldBuilderV3<UserIdentifier, UserIdentifier.Builder, UserIdentifierOrBuilder> singleFieldBuilderV3 = this.senderBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sender_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setShouldNotify(boolean z14) {
                this.shouldNotify_ = z14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setType(Type type) {
                type.getClass();
                this.bitField0_ |= 8;
                this.type_ = type.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setUpdatedTime(long j8) {
                this.updatedTime_ = j8;
                this.bitField0_ |= 128;
                onChanged();
                return this;
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
            public ChatEvent getDefaultInstanceForType() {
                return ChatEvent.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.type_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setLivetrackData(LiveTrackData liveTrackData) {
                SingleFieldBuilderV3<LiveTrackData, LiveTrackData.Builder, LiveTrackDataOrBuilder> singleFieldBuilderV3 = this.livetrackDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    liveTrackData.getClass();
                    this.livetrackData_ = liveTrackData;
                } else {
                    singleFieldBuilderV3.setMessage(liveTrackData);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setRecipient(UserIdentifier userIdentifier) {
                SingleFieldBuilderV3<UserIdentifier, UserIdentifier.Builder, UserIdentifierOrBuilder> singleFieldBuilderV3 = this.recipientBuilder_;
                if (singleFieldBuilderV3 == null) {
                    userIdentifier.getClass();
                    this.recipient_ = userIdentifier;
                } else {
                    singleFieldBuilderV3.setMessage(userIdentifier);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSender(UserIdentifier userIdentifier) {
                SingleFieldBuilderV3<UserIdentifier, UserIdentifier.Builder, UserIdentifierOrBuilder> singleFieldBuilderV3 = this.senderBuilder_;
                if (singleFieldBuilderV3 == null) {
                    userIdentifier.getClass();
                    this.sender_ = userIdentifier;
                } else {
                    singleFieldBuilderV3.setMessage(userIdentifier);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
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
                if (message instanceof ChatEvent) {
                    return mergeFrom((ChatEvent) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ChatEvent chatEvent) {
                if (chatEvent == ChatEvent.getDefaultInstance()) {
                    return this;
                }
                if (chatEvent.hasUuid()) {
                    mergeUuid(chatEvent.getUuid());
                }
                if (chatEvent.hasSender()) {
                    mergeSender(chatEvent.getSender());
                }
                if (chatEvent.hasRecipient()) {
                    mergeRecipient(chatEvent.getRecipient());
                }
                if (chatEvent.hasType()) {
                    setType(chatEvent.getType());
                }
                if (chatEvent.hasShouldNotify()) {
                    setShouldNotify(chatEvent.getShouldNotify());
                }
                if (chatEvent.hasReceivedTime()) {
                    setReceivedTime(chatEvent.getReceivedTime());
                }
                if (chatEvent.hasReadTime()) {
                    setReadTime(chatEvent.getReadTime());
                }
                if (chatEvent.hasUpdatedTime()) {
                    setUpdatedTime(chatEvent.getUpdatedTime());
                }
                if (chatEvent.hasLivetrackData()) {
                    mergeLivetrackData(chatEvent.getLivetrackData());
                }
                mergeUnknownFields(chatEvent.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ChatEvent getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ChatEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChatEvent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChatEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ChatEvent parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ChatEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ChatEvent parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ChatEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ChatEvent parseFrom(InputStream inputStream) {
            return (ChatEvent) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ChatEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChatEvent) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChatEvent parseFrom(CodedInputStream codedInputStream) {
            return (ChatEvent) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ ChatEvent(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ChatEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChatEvent) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private ChatEvent() {
            this.shouldNotify_ = false;
            this.receivedTime_ = 0L;
            this.readTime_ = 0L;
            this.updatedTime_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
        }

        public enum Type implements ProtocolMessageEnum {
            UNKNOWN_TYPE(0),
            LIVETRACK(1),
            TRUSTED_CONTACT_ADDED(2),
            TRUSTED_CONTACT_REMOVED(3);

            public static final int LIVETRACK_VALUE = 1;
            public static final int TRUSTED_CONTACT_ADDED_VALUE = 2;
            public static final int TRUSTED_CONTACT_REMOVED_VALUE = 3;
            public static final int UNKNOWN_TYPE_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.ChatEvent.Type.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Type findValueByNumber(int i14) {
                    return Type.forNumber(i14);
                }
            };
            private static final Type[] VALUES = values();

            Type(int i14) {
                this.value = i14;
            }

            public static Type forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN_TYPE;
                }
                if (i14 == 1) {
                    return LIVETRACK;
                }
                if (i14 == 2) {
                    return TRUSTED_CONTACT_ADDED;
                }
                if (i14 != 3) {
                    return null;
                }
                return TRUSTED_CONTACT_REMOVED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ChatEvent.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Type> internalGetValueMap() {
                return internalValueMap;
            }

            public static Type valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Type valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class DataTypeConfigExt extends GeneratedMessageV3 implements DataTypeConfigExtOrBuilder {
        public static final int MAX_ITEM_COUNT_FIELD_NUMBER = 3;
        public static final int REQUEST_INFO_FIELD_NUMBER = 1;
        public static final int UPDATED_TIME_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int maxItemCount_;
        private byte memoizedIsInitialized;
        private SyncRequestInfo requestInfo_;
        private long updatedTime_;
        private static final DataTypeConfigExt DEFAULT_INSTANCE = new DataTypeConfigExt();

        @Deprecated
        public static final Parser<DataTypeConfigExt> PARSER = new AbstractParser<DataTypeConfigExt>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.DataTypeConfigExt.1
            @Override // com.google.protobuf.Parser
            public DataTypeConfigExt parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DataTypeConfigExt.newBuilder();
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

        private DataTypeConfigExt(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.updatedTime_ = 0L;
            this.maxItemCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataTypeConfigExt getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_DataTypeConfigExt_descriptor;
        }

        public static Builder newBuilder(DataTypeConfigExt dataTypeConfigExt) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataTypeConfigExt);
        }

        public static DataTypeConfigExt parseDelimitedFrom(InputStream inputStream) {
            return (DataTypeConfigExt) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DataTypeConfigExt parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DataTypeConfigExt> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataTypeConfigExt)) {
                return super.equals(obj);
            }
            DataTypeConfigExt dataTypeConfigExt = (DataTypeConfigExt) obj;
            if (hasRequestInfo() != dataTypeConfigExt.hasRequestInfo()) {
                return false;
            }
            if ((hasRequestInfo() && !getRequestInfo().equals(dataTypeConfigExt.getRequestInfo())) || hasUpdatedTime() != dataTypeConfigExt.hasUpdatedTime()) {
                return false;
            }
            if ((!hasUpdatedTime() || getUpdatedTime() == dataTypeConfigExt.getUpdatedTime()) && hasMaxItemCount() == dataTypeConfigExt.hasMaxItemCount()) {
                return (!hasMaxItemCount() || getMaxItemCount() == dataTypeConfigExt.getMaxItemCount()) && getUnknownFields().equals(dataTypeConfigExt.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.DataTypeConfigExtOrBuilder
        public int getMaxItemCount() {
            return this.maxItemCount_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DataTypeConfigExt> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.DataTypeConfigExtOrBuilder
        public SyncRequestInfo getRequestInfo() {
            SyncRequestInfo syncRequestInfo = this.requestInfo_;
            return syncRequestInfo == null ? SyncRequestInfo.getDefaultInstance() : syncRequestInfo;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.DataTypeConfigExtOrBuilder
        public SyncRequestInfoOrBuilder getRequestInfoOrBuilder() {
            SyncRequestInfo syncRequestInfo = this.requestInfo_;
            return syncRequestInfo == null ? SyncRequestInfo.getDefaultInstance() : syncRequestInfo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getRequestInfo()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt64Size(2, this.updatedTime_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt32Size(3, this.maxItemCount_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.DataTypeConfigExtOrBuilder
        public long getUpdatedTime() {
            return this.updatedTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.DataTypeConfigExtOrBuilder
        public boolean hasMaxItemCount() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.DataTypeConfigExtOrBuilder
        public boolean hasRequestInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.DataTypeConfigExtOrBuilder
        public boolean hasUpdatedTime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasRequestInfo()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getRequestInfo().hashCode();
            }
            if (hasUpdatedTime()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashLong(getUpdatedTime());
            }
            if (hasMaxItemCount()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getMaxItemCount();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_DataTypeConfigExt_fieldAccessorTable.ensureFieldAccessorsInitialized(DataTypeConfigExt.class, Builder.class);
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
            if (!hasRequestInfo() || getRequestInfo().isInitialized()) {
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
            return new DataTypeConfigExt();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getRequestInfo());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt64(2, this.updatedTime_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.maxItemCount_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataTypeConfigExtOrBuilder {
            private int bitField0_;
            private int maxItemCount_;
            private SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> requestInfoBuilder_;
            private SyncRequestInfo requestInfo_;
            private long updatedTime_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(DataTypeConfigExt dataTypeConfigExt) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                    dataTypeConfigExt.requestInfo_ = singleFieldBuilderV3 == null ? this.requestInfo_ : (SyncRequestInfo) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    dataTypeConfigExt.updatedTime_ = this.updatedTime_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    dataTypeConfigExt.maxItemCount_ = this.maxItemCount_;
                    i14 |= 4;
                }
                dataTypeConfigExt.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_DataTypeConfigExt_descriptor;
            }

            private SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> getRequestInfoFieldBuilder() {
                if (this.requestInfoBuilder_ == null) {
                    this.requestInfoBuilder_ = new SingleFieldBuilderV3<>(getRequestInfo(), getParentForChildren(), isClean());
                    this.requestInfo_ = null;
                }
                return this.requestInfoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getRequestInfoFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataTypeConfigExt build() {
                DataTypeConfigExt dataTypeConfigExtBuildPartial = buildPartial();
                if (dataTypeConfigExtBuildPartial.isInitialized()) {
                    return dataTypeConfigExtBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataTypeConfigExtBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataTypeConfigExt buildPartial() {
                DataTypeConfigExt dataTypeConfigExt = new DataTypeConfigExt(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dataTypeConfigExt);
                }
                onBuilt();
                return dataTypeConfigExt;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.requestInfo_ = null;
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.requestInfoBuilder_ = null;
                }
                this.updatedTime_ = 0L;
                this.maxItemCount_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMaxItemCount() {
                this.bitField0_ &= -5;
                this.maxItemCount_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearRequestInfo() {
                this.bitField0_ &= -2;
                this.requestInfo_ = null;
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.requestInfoBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUpdatedTime() {
                this.bitField0_ &= -3;
                this.updatedTime_ = 0L;
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
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_DataTypeConfigExt_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.DataTypeConfigExtOrBuilder
            public int getMaxItemCount() {
                return this.maxItemCount_;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.DataTypeConfigExtOrBuilder
            public SyncRequestInfo getRequestInfo() {
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncRequestInfo) singleFieldBuilderV3.getMessage();
                }
                SyncRequestInfo syncRequestInfo = this.requestInfo_;
                return syncRequestInfo == null ? SyncRequestInfo.getDefaultInstance() : syncRequestInfo;
            }

            public SyncRequestInfo.Builder getRequestInfoBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SyncRequestInfo.Builder) getRequestInfoFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.DataTypeConfigExtOrBuilder
            public SyncRequestInfoOrBuilder getRequestInfoOrBuilder() {
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncRequestInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SyncRequestInfo syncRequestInfo = this.requestInfo_;
                return syncRequestInfo == null ? SyncRequestInfo.getDefaultInstance() : syncRequestInfo;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.DataTypeConfigExtOrBuilder
            public long getUpdatedTime() {
                return this.updatedTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.DataTypeConfigExtOrBuilder
            public boolean hasMaxItemCount() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.DataTypeConfigExtOrBuilder
            public boolean hasRequestInfo() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.DataTypeConfigExtOrBuilder
            public boolean hasUpdatedTime() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_DataTypeConfigExt_fieldAccessorTable.ensureFieldAccessorsInitialized(DataTypeConfigExt.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasRequestInfo() || getRequestInfo().isInitialized();
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
                                    codedInputStream.readMessage(getRequestInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.updatedTime_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.maxItemCount_ = codedInputStream.readUInt32();
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

            public Builder mergeRequestInfo(SyncRequestInfo syncRequestInfo) {
                SyncRequestInfo syncRequestInfo2;
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(syncRequestInfo);
                } else if ((this.bitField0_ & 1) == 0 || (syncRequestInfo2 = this.requestInfo_) == null || syncRequestInfo2 == SyncRequestInfo.getDefaultInstance()) {
                    this.requestInfo_ = syncRequestInfo;
                } else {
                    getRequestInfoBuilder().mergeFrom(syncRequestInfo);
                }
                if (this.requestInfo_ != null) {
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

            public Builder setMaxItemCount(int i14) {
                this.maxItemCount_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setRequestInfo(SyncRequestInfo.Builder builder) {
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.requestInfo_ = builder.build();
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

            public Builder setUpdatedTime(long j8) {
                this.updatedTime_ = j8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DataTypeConfigExt getDefaultInstanceForType() {
                return DataTypeConfigExt.getDefaultInstance();
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

            public Builder setRequestInfo(SyncRequestInfo syncRequestInfo) {
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    syncRequestInfo.getClass();
                    this.requestInfo_ = syncRequestInfo;
                } else {
                    singleFieldBuilderV3.setMessage(syncRequestInfo);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DataTypeConfigExt) {
                    return mergeFrom((DataTypeConfigExt) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DataTypeConfigExt dataTypeConfigExt) {
                if (dataTypeConfigExt == DataTypeConfigExt.getDefaultInstance()) {
                    return this;
                }
                if (dataTypeConfigExt.hasRequestInfo()) {
                    mergeRequestInfo(dataTypeConfigExt.getRequestInfo());
                }
                if (dataTypeConfigExt.hasUpdatedTime()) {
                    setUpdatedTime(dataTypeConfigExt.getUpdatedTime());
                }
                if (dataTypeConfigExt.hasMaxItemCount()) {
                    setMaxItemCount(dataTypeConfigExt.getMaxItemCount());
                }
                mergeUnknownFields(dataTypeConfigExt.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DataTypeConfigExt getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DataTypeConfigExt parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTypeConfigExt) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataTypeConfigExt parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DataTypeConfigExt parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DataTypeConfigExt parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DataTypeConfigExt parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DataTypeConfigExt parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ DataTypeConfigExt(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DataTypeConfigExt parseFrom(InputStream inputStream) {
            return (DataTypeConfigExt) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private DataTypeConfigExt() {
            this.updatedTime_ = 0L;
            this.maxItemCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataTypeConfigExt parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTypeConfigExt) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataTypeConfigExt parseFrom(CodedInputStream codedInputStream) {
            return (DataTypeConfigExt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DataTypeConfigExt parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTypeConfigExt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DataTypeStatusExt extends GeneratedMessageV3 implements DataTypeStatusExtOrBuilder {
        private static final DataTypeStatusExt DEFAULT_INSTANCE = new DataTypeStatusExt();

        @Deprecated
        public static final Parser<DataTypeStatusExt> PARSER = new AbstractParser<DataTypeStatusExt>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.DataTypeStatusExt.1
            @Override // com.google.protobuf.Parser
            public DataTypeStatusExt parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DataTypeStatusExt.newBuilder();
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

        private DataTypeStatusExt(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataTypeStatusExt getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_DataTypeStatusExt_descriptor;
        }

        public static Builder newBuilder(DataTypeStatusExt dataTypeStatusExt) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataTypeStatusExt);
        }

        public static DataTypeStatusExt parseDelimitedFrom(InputStream inputStream) {
            return (DataTypeStatusExt) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DataTypeStatusExt parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DataTypeStatusExt> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataTypeStatusExt)) {
                return super.equals(obj);
            }
            DataTypeStatusExt dataTypeStatusExt = (DataTypeStatusExt) obj;
            if (hasStatus() != dataTypeStatusExt.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == dataTypeStatusExt.status_) && getUnknownFields().equals(dataTypeStatusExt.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DataTypeStatusExt> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.DataTypeStatusExtOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.DataTypeStatusExtOrBuilder
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
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_DataTypeStatusExt_fieldAccessorTable.ensureFieldAccessorsInitialized(DataTypeStatusExt.class, Builder.class);
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
            return new DataTypeStatusExt();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataTypeStatusExtOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(DataTypeStatusExt dataTypeStatusExt) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    dataTypeStatusExt.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                dataTypeStatusExt.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_DataTypeStatusExt_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataTypeStatusExt build() {
                DataTypeStatusExt dataTypeStatusExtBuildPartial = buildPartial();
                if (dataTypeStatusExtBuildPartial.isInitialized()) {
                    return dataTypeStatusExtBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataTypeStatusExtBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataTypeStatusExt buildPartial() {
                DataTypeStatusExt dataTypeStatusExt = new DataTypeStatusExt(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dataTypeStatusExt);
                }
                onBuilt();
                return dataTypeStatusExt;
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
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_DataTypeStatusExt_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.DataTypeStatusExtOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.DataTypeStatusExtOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_DataTypeStatusExt_fieldAccessorTable.ensureFieldAccessorsInitialized(DataTypeStatusExt.class, Builder.class);
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
            public DataTypeStatusExt getDefaultInstanceForType() {
                return DataTypeStatusExt.getDefaultInstance();
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
                if (message instanceof DataTypeStatusExt) {
                    return mergeFrom((DataTypeStatusExt) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DataTypeStatusExt dataTypeStatusExt) {
                if (dataTypeStatusExt == DataTypeStatusExt.getDefaultInstance()) {
                    return this;
                }
                if (dataTypeStatusExt.hasStatus()) {
                    setStatus(dataTypeStatusExt.getStatus());
                }
                mergeUnknownFields(dataTypeStatusExt.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DataTypeStatusExt getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DataTypeStatusExt parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTypeStatusExt) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataTypeStatusExt parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DataTypeStatusExt(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DataTypeStatusExt parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DataTypeStatusExt() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DataTypeStatusExt parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DataTypeStatusExt parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DataTypeStatusExt parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DataTypeStatusExt parseFrom(InputStream inputStream) {
            return (DataTypeStatusExt) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DataTypeStatusExt parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTypeStatusExt) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataTypeStatusExt parseFrom(CodedInputStream codedInputStream) {
            return (DataTypeStatusExt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DataTypeStatusExt parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTypeStatusExt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN_STATUS(0),
            UNSUPPORTED_PROTOCOL_VERSION(1),
            UNSUPPORTED_DATA_TYPE(2),
            UP_TO_DATE(3);

            public static final int UNKNOWN_STATUS_VALUE = 0;
            public static final int UNSUPPORTED_DATA_TYPE_VALUE = 2;
            public static final int UNSUPPORTED_PROTOCOL_VERSION_VALUE = 1;
            public static final int UP_TO_DATE_VALUE = 3;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.DataTypeStatusExt.Status.1
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
                    return UNKNOWN_STATUS;
                }
                if (i14 == 1) {
                    return UNSUPPORTED_PROTOCOL_VERSION;
                }
                if (i14 == 2) {
                    return UNSUPPORTED_DATA_TYPE;
                }
                if (i14 != 3) {
                    return null;
                }
                return UP_TO_DATE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return DataTypeStatusExt.getDescriptor().getEnumTypes().get(0);
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

    public static final class GenericItemExt extends GeneratedMessageV3 implements GenericItemExtOrBuilder {
        public static final int CHAT_EVENT_FIELD_NUMBER = 1;
        private static final GenericItemExt DEFAULT_INSTANCE = new GenericItemExt();

        @Deprecated
        public static final Parser<GenericItemExt> PARSER = new AbstractParser<GenericItemExt>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.GenericItemExt.1
            @Override // com.google.protobuf.Parser
            public GenericItemExt parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GenericItemExt.newBuilder();
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
        private ChatEvent chatEvent_;
        private byte memoizedIsInitialized;

        private GenericItemExt(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GenericItemExt getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_GenericItemExt_descriptor;
        }

        public static Builder newBuilder(GenericItemExt genericItemExt) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(genericItemExt);
        }

        public static GenericItemExt parseDelimitedFrom(InputStream inputStream) {
            return (GenericItemExt) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GenericItemExt parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GenericItemExt> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GenericItemExt)) {
                return super.equals(obj);
            }
            GenericItemExt genericItemExt = (GenericItemExt) obj;
            if (hasChatEvent() != genericItemExt.hasChatEvent()) {
                return false;
            }
            return (!hasChatEvent() || getChatEvent().equals(genericItemExt.getChatEvent())) && getUnknownFields().equals(genericItemExt.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.GenericItemExtOrBuilder
        public ChatEvent getChatEvent() {
            ChatEvent chatEvent = this.chatEvent_;
            return chatEvent == null ? ChatEvent.getDefaultInstance() : chatEvent;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.GenericItemExtOrBuilder
        public ChatEventOrBuilder getChatEventOrBuilder() {
            ChatEvent chatEvent = this.chatEvent_;
            return chatEvent == null ? ChatEvent.getDefaultInstance() : chatEvent;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GenericItemExt> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getChatEvent()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.GenericItemExtOrBuilder
        public boolean hasChatEvent() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasChatEvent()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getChatEvent().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_GenericItemExt_fieldAccessorTable.ensureFieldAccessorsInitialized(GenericItemExt.class, Builder.class);
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
            if (!hasChatEvent() || getChatEvent().isInitialized()) {
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
            return new GenericItemExt();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getChatEvent());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GenericItemExtOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ChatEvent, ChatEvent.Builder, ChatEventOrBuilder> chatEventBuilder_;
            private ChatEvent chatEvent_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(GenericItemExt genericItemExt) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<ChatEvent, ChatEvent.Builder, ChatEventOrBuilder> singleFieldBuilderV3 = this.chatEventBuilder_;
                    genericItemExt.chatEvent_ = singleFieldBuilderV3 == null ? this.chatEvent_ : (ChatEvent) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                genericItemExt.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ChatEvent, ChatEvent.Builder, ChatEventOrBuilder> getChatEventFieldBuilder() {
                if (this.chatEventBuilder_ == null) {
                    this.chatEventBuilder_ = new SingleFieldBuilderV3<>(getChatEvent(), getParentForChildren(), isClean());
                    this.chatEvent_ = null;
                }
                return this.chatEventBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_GenericItemExt_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getChatEventFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GenericItemExt build() {
                GenericItemExt genericItemExtBuildPartial = buildPartial();
                if (genericItemExtBuildPartial.isInitialized()) {
                    return genericItemExtBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) genericItemExtBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GenericItemExt buildPartial() {
                GenericItemExt genericItemExt = new GenericItemExt(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(genericItemExt);
                }
                onBuilt();
                return genericItemExt;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.chatEvent_ = null;
                SingleFieldBuilderV3<ChatEvent, ChatEvent.Builder, ChatEventOrBuilder> singleFieldBuilderV3 = this.chatEventBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.chatEventBuilder_ = null;
                }
                return this;
            }

            public Builder clearChatEvent() {
                this.bitField0_ &= -2;
                this.chatEvent_ = null;
                SingleFieldBuilderV3<ChatEvent, ChatEvent.Builder, ChatEventOrBuilder> singleFieldBuilderV3 = this.chatEventBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.chatEventBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.GenericItemExtOrBuilder
            public ChatEvent getChatEvent() {
                SingleFieldBuilderV3<ChatEvent, ChatEvent.Builder, ChatEventOrBuilder> singleFieldBuilderV3 = this.chatEventBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ChatEvent) singleFieldBuilderV3.getMessage();
                }
                ChatEvent chatEvent = this.chatEvent_;
                return chatEvent == null ? ChatEvent.getDefaultInstance() : chatEvent;
            }

            public ChatEvent.Builder getChatEventBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ChatEvent.Builder) getChatEventFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.GenericItemExtOrBuilder
            public ChatEventOrBuilder getChatEventOrBuilder() {
                SingleFieldBuilderV3<ChatEvent, ChatEvent.Builder, ChatEventOrBuilder> singleFieldBuilderV3 = this.chatEventBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ChatEventOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ChatEvent chatEvent = this.chatEvent_;
                return chatEvent == null ? ChatEvent.getDefaultInstance() : chatEvent;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_GenericItemExt_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.GenericItemExtOrBuilder
            public boolean hasChatEvent() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_GenericItemExt_fieldAccessorTable.ensureFieldAccessorsInitialized(GenericItemExt.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasChatEvent() || getChatEvent().isInitialized();
            }

            public Builder mergeChatEvent(ChatEvent chatEvent) {
                ChatEvent chatEvent2;
                SingleFieldBuilderV3<ChatEvent, ChatEvent.Builder, ChatEventOrBuilder> singleFieldBuilderV3 = this.chatEventBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(chatEvent);
                } else if ((this.bitField0_ & 1) == 0 || (chatEvent2 = this.chatEvent_) == null || chatEvent2 == ChatEvent.getDefaultInstance()) {
                    this.chatEvent_ = chatEvent;
                } else {
                    getChatEventBuilder().mergeFrom(chatEvent);
                }
                if (this.chatEvent_ != null) {
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
                                    codedInputStream.readMessage(getChatEventFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setChatEvent(ChatEvent.Builder builder) {
                SingleFieldBuilderV3<ChatEvent, ChatEvent.Builder, ChatEventOrBuilder> singleFieldBuilderV3 = this.chatEventBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.chatEvent_ = builder.build();
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
            public GenericItemExt getDefaultInstanceForType() {
                return GenericItemExt.getDefaultInstance();
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

            public Builder setChatEvent(ChatEvent chatEvent) {
                SingleFieldBuilderV3<ChatEvent, ChatEvent.Builder, ChatEventOrBuilder> singleFieldBuilderV3 = this.chatEventBuilder_;
                if (singleFieldBuilderV3 == null) {
                    chatEvent.getClass();
                    this.chatEvent_ = chatEvent;
                } else {
                    singleFieldBuilderV3.setMessage(chatEvent);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GenericItemExt) {
                    return mergeFrom((GenericItemExt) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GenericItemExt genericItemExt) {
                if (genericItemExt == GenericItemExt.getDefaultInstance()) {
                    return this;
                }
                if (genericItemExt.hasChatEvent()) {
                    mergeChatEvent(genericItemExt.getChatEvent());
                }
                mergeUnknownFields(genericItemExt.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GenericItemExt getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ GenericItemExt(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private GenericItemExt() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GenericItemExt parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GenericItemExt) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GenericItemExt parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GenericItemExt parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GenericItemExt parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GenericItemExt parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GenericItemExt parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GenericItemExt parseFrom(InputStream inputStream) {
            return (GenericItemExt) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GenericItemExt parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GenericItemExt) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GenericItemExt parseFrom(CodedInputStream codedInputStream) {
            return (GenericItemExt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GenericItemExt parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GenericItemExt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GenericItemReferenceExt extends GeneratedMessageV3 implements GenericItemReferenceExtOrBuilder {
        private static final GenericItemReferenceExt DEFAULT_INSTANCE = new GenericItemReferenceExt();

        @Deprecated
        public static final Parser<GenericItemReferenceExt> PARSER = new AbstractParser<GenericItemReferenceExt>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.GenericItemReferenceExt.1
            @Override // com.google.protobuf.Parser
            public GenericItemReferenceExt parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GenericItemReferenceExt.newBuilder();
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
        public static final int UPDATED_TIME_FIELD_NUMBER = 2;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private long updatedTime_;
        private GDIDataTypes.UUID uuid_;

        private GenericItemReferenceExt(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.updatedTime_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GenericItemReferenceExt getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_GenericItemReferenceExt_descriptor;
        }

        public static Builder newBuilder(GenericItemReferenceExt genericItemReferenceExt) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(genericItemReferenceExt);
        }

        public static GenericItemReferenceExt parseDelimitedFrom(InputStream inputStream) {
            return (GenericItemReferenceExt) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GenericItemReferenceExt parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GenericItemReferenceExt> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GenericItemReferenceExt)) {
                return super.equals(obj);
            }
            GenericItemReferenceExt genericItemReferenceExt = (GenericItemReferenceExt) obj;
            if (hasUuid() != genericItemReferenceExt.hasUuid()) {
                return false;
            }
            if ((!hasUuid() || getUuid().equals(genericItemReferenceExt.getUuid())) && hasUpdatedTime() == genericItemReferenceExt.hasUpdatedTime()) {
                return (!hasUpdatedTime() || getUpdatedTime() == genericItemReferenceExt.getUpdatedTime()) && getUnknownFields().equals(genericItemReferenceExt.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GenericItemReferenceExt> getParserForType() {
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
                iComputeMessageSize += CodedOutputStream.computeUInt64Size(2, this.updatedTime_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.GenericItemReferenceExtOrBuilder
        public long getUpdatedTime() {
            return this.updatedTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.GenericItemReferenceExtOrBuilder
        public GDIDataTypes.UUID getUuid() {
            GDIDataTypes.UUID uuid = this.uuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.GenericItemReferenceExtOrBuilder
        public GDIDataTypes.UUIDOrBuilder getUuidOrBuilder() {
            GDIDataTypes.UUID uuid = this.uuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.GenericItemReferenceExtOrBuilder
        public boolean hasUpdatedTime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.GenericItemReferenceExtOrBuilder
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
            if (hasUpdatedTime()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashLong(getUpdatedTime());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_GenericItemReferenceExt_fieldAccessorTable.ensureFieldAccessorsInitialized(GenericItemReferenceExt.class, Builder.class);
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
            return new GenericItemReferenceExt();
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
                codedOutputStream.writeUInt64(2, this.updatedTime_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GenericItemReferenceExtOrBuilder {
            private int bitField0_;
            private long updatedTime_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> uuidBuilder_;
            private GDIDataTypes.UUID uuid_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(GenericItemReferenceExt genericItemReferenceExt) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                    genericItemReferenceExt.uuid_ = singleFieldBuilderV3 == null ? this.uuid_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    genericItemReferenceExt.updatedTime_ = this.updatedTime_;
                    i14 |= 2;
                }
                genericItemReferenceExt.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_GenericItemReferenceExt_descriptor;
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
            public GenericItemReferenceExt build() {
                GenericItemReferenceExt genericItemReferenceExtBuildPartial = buildPartial();
                if (genericItemReferenceExtBuildPartial.isInitialized()) {
                    return genericItemReferenceExtBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) genericItemReferenceExtBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GenericItemReferenceExt buildPartial() {
                GenericItemReferenceExt genericItemReferenceExt = new GenericItemReferenceExt(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(genericItemReferenceExt);
                }
                onBuilt();
                return genericItemReferenceExt;
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
                this.updatedTime_ = 0L;
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

            public Builder clearUpdatedTime() {
                this.bitField0_ &= -3;
                this.updatedTime_ = 0L;
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
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_GenericItemReferenceExt_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.GenericItemReferenceExtOrBuilder
            public long getUpdatedTime() {
                return this.updatedTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.GenericItemReferenceExtOrBuilder
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

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.GenericItemReferenceExtOrBuilder
            public GDIDataTypes.UUIDOrBuilder getUuidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.uuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.GenericItemReferenceExtOrBuilder
            public boolean hasUpdatedTime() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.GenericItemReferenceExtOrBuilder
            public boolean hasUuid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_GenericItemReferenceExt_fieldAccessorTable.ensureFieldAccessorsInitialized(GenericItemReferenceExt.class, Builder.class);
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
                                    this.updatedTime_ = codedInputStream.readUInt64();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setUpdatedTime(long j8) {
                this.updatedTime_ = j8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
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
            public GenericItemReferenceExt getDefaultInstanceForType() {
                return GenericItemReferenceExt.getDefaultInstance();
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
                if (message instanceof GenericItemReferenceExt) {
                    return mergeFrom((GenericItemReferenceExt) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GenericItemReferenceExt genericItemReferenceExt) {
                if (genericItemReferenceExt == GenericItemReferenceExt.getDefaultInstance()) {
                    return this;
                }
                if (genericItemReferenceExt.hasUuid()) {
                    mergeUuid(genericItemReferenceExt.getUuid());
                }
                if (genericItemReferenceExt.hasUpdatedTime()) {
                    setUpdatedTime(genericItemReferenceExt.getUpdatedTime());
                }
                mergeUnknownFields(genericItemReferenceExt.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GenericItemReferenceExt getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GenericItemReferenceExt parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GenericItemReferenceExt) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GenericItemReferenceExt parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GenericItemReferenceExt parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ GenericItemReferenceExt(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GenericItemReferenceExt parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private GenericItemReferenceExt() {
            this.updatedTime_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GenericItemReferenceExt parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GenericItemReferenceExt parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GenericItemReferenceExt parseFrom(InputStream inputStream) {
            return (GenericItemReferenceExt) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GenericItemReferenceExt parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GenericItemReferenceExt) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GenericItemReferenceExt parseFrom(CodedInputStream codedInputStream) {
            return (GenericItemReferenceExt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GenericItemReferenceExt parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GenericItemReferenceExt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class InReachChatEventsService extends GeneratedMessageV3 implements InReachChatEventsServiceOrBuilder {
        public static final int CAPABILITIES_REQUEST_FIELD_NUMBER = 1;
        public static final int CAPABILITIES_RESPONSE_FIELD_NUMBER = 2;
        public static final int CHAT_EVENTS_UPDATED_NOTIFICATION_FIELD_NUMBER = 7;
        private static final InReachChatEventsService DEFAULT_INSTANCE = new InReachChatEventsService();

        @Deprecated
        public static final Parser<InReachChatEventsService> PARSER = new AbstractParser<InReachChatEventsService>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsService.1
            @Override // com.google.protobuf.Parser
            public InReachChatEventsService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = InReachChatEventsService.newBuilder();
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
        public static final int SUBSCRIBE_REQUEST_FIELD_NUMBER = 5;
        public static final int SUBSCRIBE_RESPONSE_FIELD_NUMBER = 6;
        public static final int SYNC_REQUEST_FIELD_NUMBER = 3;
        public static final int SYNC_RESPONSE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private CapabilitiesRequest capabilitiesRequest_;
        private CapabilitiesResponse capabilitiesResponse_;
        private ChatEventsUpdatedNotification chatEventsUpdatedNotification_;
        private byte memoizedIsInitialized;
        private SubscribeRequest subscribeRequest_;
        private SubscribeResponse subscribeResponse_;
        private SyncRequest syncRequest_;
        private SyncResponse syncResponse_;

        private InReachChatEventsService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InReachChatEventsService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_InReachChatEventsService_descriptor;
        }

        public static Builder newBuilder(InReachChatEventsService inReachChatEventsService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(inReachChatEventsService);
        }

        public static InReachChatEventsService parseDelimitedFrom(InputStream inputStream) {
            return (InReachChatEventsService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InReachChatEventsService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<InReachChatEventsService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InReachChatEventsService)) {
                return super.equals(obj);
            }
            InReachChatEventsService inReachChatEventsService = (InReachChatEventsService) obj;
            if (hasCapabilitiesRequest() != inReachChatEventsService.hasCapabilitiesRequest()) {
                return false;
            }
            if ((hasCapabilitiesRequest() && !getCapabilitiesRequest().equals(inReachChatEventsService.getCapabilitiesRequest())) || hasCapabilitiesResponse() != inReachChatEventsService.hasCapabilitiesResponse()) {
                return false;
            }
            if ((hasCapabilitiesResponse() && !getCapabilitiesResponse().equals(inReachChatEventsService.getCapabilitiesResponse())) || hasSyncRequest() != inReachChatEventsService.hasSyncRequest()) {
                return false;
            }
            if ((hasSyncRequest() && !getSyncRequest().equals(inReachChatEventsService.getSyncRequest())) || hasSyncResponse() != inReachChatEventsService.hasSyncResponse()) {
                return false;
            }
            if ((hasSyncResponse() && !getSyncResponse().equals(inReachChatEventsService.getSyncResponse())) || hasSubscribeRequest() != inReachChatEventsService.hasSubscribeRequest()) {
                return false;
            }
            if ((hasSubscribeRequest() && !getSubscribeRequest().equals(inReachChatEventsService.getSubscribeRequest())) || hasSubscribeResponse() != inReachChatEventsService.hasSubscribeResponse()) {
                return false;
            }
            if ((!hasSubscribeResponse() || getSubscribeResponse().equals(inReachChatEventsService.getSubscribeResponse())) && hasChatEventsUpdatedNotification() == inReachChatEventsService.hasChatEventsUpdatedNotification()) {
                return (!hasChatEventsUpdatedNotification() || getChatEventsUpdatedNotification().equals(inReachChatEventsService.getChatEventsUpdatedNotification())) && getUnknownFields().equals(inReachChatEventsService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
        public CapabilitiesRequest getCapabilitiesRequest() {
            CapabilitiesRequest capabilitiesRequest = this.capabilitiesRequest_;
            return capabilitiesRequest == null ? CapabilitiesRequest.getDefaultInstance() : capabilitiesRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
        public CapabilitiesRequestOrBuilder getCapabilitiesRequestOrBuilder() {
            CapabilitiesRequest capabilitiesRequest = this.capabilitiesRequest_;
            return capabilitiesRequest == null ? CapabilitiesRequest.getDefaultInstance() : capabilitiesRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
        public CapabilitiesResponse getCapabilitiesResponse() {
            CapabilitiesResponse capabilitiesResponse = this.capabilitiesResponse_;
            return capabilitiesResponse == null ? CapabilitiesResponse.getDefaultInstance() : capabilitiesResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
        public CapabilitiesResponseOrBuilder getCapabilitiesResponseOrBuilder() {
            CapabilitiesResponse capabilitiesResponse = this.capabilitiesResponse_;
            return capabilitiesResponse == null ? CapabilitiesResponse.getDefaultInstance() : capabilitiesResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
        public ChatEventsUpdatedNotification getChatEventsUpdatedNotification() {
            ChatEventsUpdatedNotification chatEventsUpdatedNotification = this.chatEventsUpdatedNotification_;
            return chatEventsUpdatedNotification == null ? ChatEventsUpdatedNotification.getDefaultInstance() : chatEventsUpdatedNotification;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
        public ChatEventsUpdatedNotificationOrBuilder getChatEventsUpdatedNotificationOrBuilder() {
            ChatEventsUpdatedNotification chatEventsUpdatedNotification = this.chatEventsUpdatedNotification_;
            return chatEventsUpdatedNotification == null ? ChatEventsUpdatedNotification.getDefaultInstance() : chatEventsUpdatedNotification;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InReachChatEventsService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCapabilitiesRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getCapabilitiesResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getSyncRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getSyncResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getSubscribeRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getSubscribeResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getChatEventsUpdatedNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
        public SubscribeRequest getSubscribeRequest() {
            SubscribeRequest subscribeRequest = this.subscribeRequest_;
            return subscribeRequest == null ? SubscribeRequest.getDefaultInstance() : subscribeRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
        public SubscribeRequestOrBuilder getSubscribeRequestOrBuilder() {
            SubscribeRequest subscribeRequest = this.subscribeRequest_;
            return subscribeRequest == null ? SubscribeRequest.getDefaultInstance() : subscribeRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
        public SubscribeResponse getSubscribeResponse() {
            SubscribeResponse subscribeResponse = this.subscribeResponse_;
            return subscribeResponse == null ? SubscribeResponse.getDefaultInstance() : subscribeResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
        public SubscribeResponseOrBuilder getSubscribeResponseOrBuilder() {
            SubscribeResponse subscribeResponse = this.subscribeResponse_;
            return subscribeResponse == null ? SubscribeResponse.getDefaultInstance() : subscribeResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
        public SyncRequest getSyncRequest() {
            SyncRequest syncRequest = this.syncRequest_;
            return syncRequest == null ? SyncRequest.getDefaultInstance() : syncRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
        public SyncRequestOrBuilder getSyncRequestOrBuilder() {
            SyncRequest syncRequest = this.syncRequest_;
            return syncRequest == null ? SyncRequest.getDefaultInstance() : syncRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
        public SyncResponse getSyncResponse() {
            SyncResponse syncResponse = this.syncResponse_;
            return syncResponse == null ? SyncResponse.getDefaultInstance() : syncResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
        public SyncResponseOrBuilder getSyncResponseOrBuilder() {
            SyncResponse syncResponse = this.syncResponse_;
            return syncResponse == null ? SyncResponse.getDefaultInstance() : syncResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
        public boolean hasCapabilitiesRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
        public boolean hasCapabilitiesResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
        public boolean hasChatEventsUpdatedNotification() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
        public boolean hasSubscribeRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
        public boolean hasSubscribeResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
        public boolean hasSyncRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
        public boolean hasSyncResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCapabilitiesRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCapabilitiesRequest().hashCode();
            }
            if (hasCapabilitiesResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getCapabilitiesResponse().hashCode();
            }
            if (hasSyncRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSyncRequest().hashCode();
            }
            if (hasSyncResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getSyncResponse().hashCode();
            }
            if (hasSubscribeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getSubscribeRequest().hashCode();
            }
            if (hasSubscribeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getSubscribeResponse().hashCode();
            }
            if (hasChatEventsUpdatedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getChatEventsUpdatedNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_InReachChatEventsService_fieldAccessorTable.ensureFieldAccessorsInitialized(InReachChatEventsService.class, Builder.class);
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
            if (hasSyncRequest() && !getSyncRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSyncResponse() && !getSyncResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSubscribeResponse() || getSubscribeResponse().isInitialized()) {
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
            return new InReachChatEventsService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getCapabilitiesRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getCapabilitiesResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getSyncRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getSyncResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getSubscribeRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getSubscribeResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getChatEventsUpdatedNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InReachChatEventsServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<CapabilitiesRequest, CapabilitiesRequest.Builder, CapabilitiesRequestOrBuilder> capabilitiesRequestBuilder_;
            private CapabilitiesRequest capabilitiesRequest_;
            private SingleFieldBuilderV3<CapabilitiesResponse, CapabilitiesResponse.Builder, CapabilitiesResponseOrBuilder> capabilitiesResponseBuilder_;
            private CapabilitiesResponse capabilitiesResponse_;
            private SingleFieldBuilderV3<ChatEventsUpdatedNotification, ChatEventsUpdatedNotification.Builder, ChatEventsUpdatedNotificationOrBuilder> chatEventsUpdatedNotificationBuilder_;
            private ChatEventsUpdatedNotification chatEventsUpdatedNotification_;
            private SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> subscribeRequestBuilder_;
            private SubscribeRequest subscribeRequest_;
            private SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> subscribeResponseBuilder_;
            private SubscribeResponse subscribeResponse_;
            private SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> syncRequestBuilder_;
            private SyncRequest syncRequest_;
            private SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> syncResponseBuilder_;
            private SyncResponse syncResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(InReachChatEventsService inReachChatEventsService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<CapabilitiesRequest, CapabilitiesRequest.Builder, CapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.capabilitiesRequestBuilder_;
                    inReachChatEventsService.capabilitiesRequest_ = singleFieldBuilderV3 == null ? this.capabilitiesRequest_ : (CapabilitiesRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<CapabilitiesResponse, CapabilitiesResponse.Builder, CapabilitiesResponseOrBuilder> singleFieldBuilderV4 = this.capabilitiesResponseBuilder_;
                    inReachChatEventsService.capabilitiesResponse_ = singleFieldBuilderV4 == null ? this.capabilitiesResponse_ : (CapabilitiesResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV5 = this.syncRequestBuilder_;
                    inReachChatEventsService.syncRequest_ = singleFieldBuilderV5 == null ? this.syncRequest_ : (SyncRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV6 = this.syncResponseBuilder_;
                    inReachChatEventsService.syncResponse_ = singleFieldBuilderV6 == null ? this.syncResponse_ : (SyncResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV7 = this.subscribeRequestBuilder_;
                    inReachChatEventsService.subscribeRequest_ = singleFieldBuilderV7 == null ? this.subscribeRequest_ : (SubscribeRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV8 = this.subscribeResponseBuilder_;
                    inReachChatEventsService.subscribeResponse_ = singleFieldBuilderV8 == null ? this.subscribeResponse_ : (SubscribeResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<ChatEventsUpdatedNotification, ChatEventsUpdatedNotification.Builder, ChatEventsUpdatedNotificationOrBuilder> singleFieldBuilderV9 = this.chatEventsUpdatedNotificationBuilder_;
                    inReachChatEventsService.chatEventsUpdatedNotification_ = singleFieldBuilderV9 == null ? this.chatEventsUpdatedNotification_ : (ChatEventsUpdatedNotification) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                inReachChatEventsService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<CapabilitiesRequest, CapabilitiesRequest.Builder, CapabilitiesRequestOrBuilder> getCapabilitiesRequestFieldBuilder() {
                if (this.capabilitiesRequestBuilder_ == null) {
                    this.capabilitiesRequestBuilder_ = new SingleFieldBuilderV3<>(getCapabilitiesRequest(), getParentForChildren(), isClean());
                    this.capabilitiesRequest_ = null;
                }
                return this.capabilitiesRequestBuilder_;
            }

            private SingleFieldBuilderV3<CapabilitiesResponse, CapabilitiesResponse.Builder, CapabilitiesResponseOrBuilder> getCapabilitiesResponseFieldBuilder() {
                if (this.capabilitiesResponseBuilder_ == null) {
                    this.capabilitiesResponseBuilder_ = new SingleFieldBuilderV3<>(getCapabilitiesResponse(), getParentForChildren(), isClean());
                    this.capabilitiesResponse_ = null;
                }
                return this.capabilitiesResponseBuilder_;
            }

            private SingleFieldBuilderV3<ChatEventsUpdatedNotification, ChatEventsUpdatedNotification.Builder, ChatEventsUpdatedNotificationOrBuilder> getChatEventsUpdatedNotificationFieldBuilder() {
                if (this.chatEventsUpdatedNotificationBuilder_ == null) {
                    this.chatEventsUpdatedNotificationBuilder_ = new SingleFieldBuilderV3<>(getChatEventsUpdatedNotification(), getParentForChildren(), isClean());
                    this.chatEventsUpdatedNotification_ = null;
                }
                return this.chatEventsUpdatedNotificationBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_InReachChatEventsService_descriptor;
            }

            private SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> getSubscribeRequestFieldBuilder() {
                if (this.subscribeRequestBuilder_ == null) {
                    this.subscribeRequestBuilder_ = new SingleFieldBuilderV3<>(getSubscribeRequest(), getParentForChildren(), isClean());
                    this.subscribeRequest_ = null;
                }
                return this.subscribeRequestBuilder_;
            }

            private SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> getSubscribeResponseFieldBuilder() {
                if (this.subscribeResponseBuilder_ == null) {
                    this.subscribeResponseBuilder_ = new SingleFieldBuilderV3<>(getSubscribeResponse(), getParentForChildren(), isClean());
                    this.subscribeResponse_ = null;
                }
                return this.subscribeResponseBuilder_;
            }

            private SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> getSyncRequestFieldBuilder() {
                if (this.syncRequestBuilder_ == null) {
                    this.syncRequestBuilder_ = new SingleFieldBuilderV3<>(getSyncRequest(), getParentForChildren(), isClean());
                    this.syncRequest_ = null;
                }
                return this.syncRequestBuilder_;
            }

            private SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> getSyncResponseFieldBuilder() {
                if (this.syncResponseBuilder_ == null) {
                    this.syncResponseBuilder_ = new SingleFieldBuilderV3<>(getSyncResponse(), getParentForChildren(), isClean());
                    this.syncResponse_ = null;
                }
                return this.syncResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getCapabilitiesRequestFieldBuilder();
                    getCapabilitiesResponseFieldBuilder();
                    getSyncRequestFieldBuilder();
                    getSyncResponseFieldBuilder();
                    getSubscribeRequestFieldBuilder();
                    getSubscribeResponseFieldBuilder();
                    getChatEventsUpdatedNotificationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InReachChatEventsService build() {
                InReachChatEventsService inReachChatEventsServiceBuildPartial = buildPartial();
                if (inReachChatEventsServiceBuildPartial.isInitialized()) {
                    return inReachChatEventsServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) inReachChatEventsServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InReachChatEventsService buildPartial() {
                InReachChatEventsService inReachChatEventsService = new InReachChatEventsService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(inReachChatEventsService);
                }
                onBuilt();
                return inReachChatEventsService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.capabilitiesRequest_ = null;
                SingleFieldBuilderV3<CapabilitiesRequest, CapabilitiesRequest.Builder, CapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.capabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.capabilitiesRequestBuilder_ = null;
                }
                this.capabilitiesResponse_ = null;
                SingleFieldBuilderV3<CapabilitiesResponse, CapabilitiesResponse.Builder, CapabilitiesResponseOrBuilder> singleFieldBuilderV4 = this.capabilitiesResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.capabilitiesResponseBuilder_ = null;
                }
                this.syncRequest_ = null;
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV5 = this.syncRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.syncRequestBuilder_ = null;
                }
                this.syncResponse_ = null;
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV6 = this.syncResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.syncResponseBuilder_ = null;
                }
                this.subscribeRequest_ = null;
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV7 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.subscribeRequestBuilder_ = null;
                }
                this.subscribeResponse_ = null;
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV8 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.subscribeResponseBuilder_ = null;
                }
                this.chatEventsUpdatedNotification_ = null;
                SingleFieldBuilderV3<ChatEventsUpdatedNotification, ChatEventsUpdatedNotification.Builder, ChatEventsUpdatedNotificationOrBuilder> singleFieldBuilderV9 = this.chatEventsUpdatedNotificationBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.chatEventsUpdatedNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearCapabilitiesRequest() {
                this.bitField0_ &= -2;
                this.capabilitiesRequest_ = null;
                SingleFieldBuilderV3<CapabilitiesRequest, CapabilitiesRequest.Builder, CapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.capabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.capabilitiesRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCapabilitiesResponse() {
                this.bitField0_ &= -3;
                this.capabilitiesResponse_ = null;
                SingleFieldBuilderV3<CapabilitiesResponse, CapabilitiesResponse.Builder, CapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.capabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.capabilitiesResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearChatEventsUpdatedNotification() {
                this.bitField0_ &= -65;
                this.chatEventsUpdatedNotification_ = null;
                SingleFieldBuilderV3<ChatEventsUpdatedNotification, ChatEventsUpdatedNotification.Builder, ChatEventsUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.chatEventsUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.chatEventsUpdatedNotificationBuilder_ = null;
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

            public Builder clearSubscribeRequest() {
                this.bitField0_ &= -17;
                this.subscribeRequest_ = null;
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.subscribeRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSubscribeResponse() {
                this.bitField0_ &= -33;
                this.subscribeResponse_ = null;
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.subscribeResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSyncRequest() {
                this.bitField0_ &= -5;
                this.syncRequest_ = null;
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.syncRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSyncResponse() {
                this.bitField0_ &= -9;
                this.syncResponse_ = null;
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV3 = this.syncResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.syncResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
            public CapabilitiesRequest getCapabilitiesRequest() {
                SingleFieldBuilderV3<CapabilitiesRequest, CapabilitiesRequest.Builder, CapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.capabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CapabilitiesRequest) singleFieldBuilderV3.getMessage();
                }
                CapabilitiesRequest capabilitiesRequest = this.capabilitiesRequest_;
                return capabilitiesRequest == null ? CapabilitiesRequest.getDefaultInstance() : capabilitiesRequest;
            }

            public CapabilitiesRequest.Builder getCapabilitiesRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (CapabilitiesRequest.Builder) getCapabilitiesRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
            public CapabilitiesRequestOrBuilder getCapabilitiesRequestOrBuilder() {
                SingleFieldBuilderV3<CapabilitiesRequest, CapabilitiesRequest.Builder, CapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.capabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CapabilitiesRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CapabilitiesRequest capabilitiesRequest = this.capabilitiesRequest_;
                return capabilitiesRequest == null ? CapabilitiesRequest.getDefaultInstance() : capabilitiesRequest;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
            public CapabilitiesResponse getCapabilitiesResponse() {
                SingleFieldBuilderV3<CapabilitiesResponse, CapabilitiesResponse.Builder, CapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.capabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CapabilitiesResponse) singleFieldBuilderV3.getMessage();
                }
                CapabilitiesResponse capabilitiesResponse = this.capabilitiesResponse_;
                return capabilitiesResponse == null ? CapabilitiesResponse.getDefaultInstance() : capabilitiesResponse;
            }

            public CapabilitiesResponse.Builder getCapabilitiesResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (CapabilitiesResponse.Builder) getCapabilitiesResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
            public CapabilitiesResponseOrBuilder getCapabilitiesResponseOrBuilder() {
                SingleFieldBuilderV3<CapabilitiesResponse, CapabilitiesResponse.Builder, CapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.capabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CapabilitiesResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CapabilitiesResponse capabilitiesResponse = this.capabilitiesResponse_;
                return capabilitiesResponse == null ? CapabilitiesResponse.getDefaultInstance() : capabilitiesResponse;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
            public ChatEventsUpdatedNotification getChatEventsUpdatedNotification() {
                SingleFieldBuilderV3<ChatEventsUpdatedNotification, ChatEventsUpdatedNotification.Builder, ChatEventsUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.chatEventsUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ChatEventsUpdatedNotification) singleFieldBuilderV3.getMessage();
                }
                ChatEventsUpdatedNotification chatEventsUpdatedNotification = this.chatEventsUpdatedNotification_;
                return chatEventsUpdatedNotification == null ? ChatEventsUpdatedNotification.getDefaultInstance() : chatEventsUpdatedNotification;
            }

            public ChatEventsUpdatedNotification.Builder getChatEventsUpdatedNotificationBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (ChatEventsUpdatedNotification.Builder) getChatEventsUpdatedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
            public ChatEventsUpdatedNotificationOrBuilder getChatEventsUpdatedNotificationOrBuilder() {
                SingleFieldBuilderV3<ChatEventsUpdatedNotification, ChatEventsUpdatedNotification.Builder, ChatEventsUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.chatEventsUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ChatEventsUpdatedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ChatEventsUpdatedNotification chatEventsUpdatedNotification = this.chatEventsUpdatedNotification_;
                return chatEventsUpdatedNotification == null ? ChatEventsUpdatedNotification.getDefaultInstance() : chatEventsUpdatedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_InReachChatEventsService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
            public SubscribeRequest getSubscribeRequest() {
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SubscribeRequest) singleFieldBuilderV3.getMessage();
                }
                SubscribeRequest subscribeRequest = this.subscribeRequest_;
                return subscribeRequest == null ? SubscribeRequest.getDefaultInstance() : subscribeRequest;
            }

            public SubscribeRequest.Builder getSubscribeRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (SubscribeRequest.Builder) getSubscribeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
            public SubscribeRequestOrBuilder getSubscribeRequestOrBuilder() {
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SubscribeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SubscribeRequest subscribeRequest = this.subscribeRequest_;
                return subscribeRequest == null ? SubscribeRequest.getDefaultInstance() : subscribeRequest;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
            public SubscribeResponse getSubscribeResponse() {
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SubscribeResponse) singleFieldBuilderV3.getMessage();
                }
                SubscribeResponse subscribeResponse = this.subscribeResponse_;
                return subscribeResponse == null ? SubscribeResponse.getDefaultInstance() : subscribeResponse;
            }

            public SubscribeResponse.Builder getSubscribeResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (SubscribeResponse.Builder) getSubscribeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
            public SubscribeResponseOrBuilder getSubscribeResponseOrBuilder() {
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SubscribeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SubscribeResponse subscribeResponse = this.subscribeResponse_;
                return subscribeResponse == null ? SubscribeResponse.getDefaultInstance() : subscribeResponse;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
            public SyncRequest getSyncRequest() {
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncRequest) singleFieldBuilderV3.getMessage();
                }
                SyncRequest syncRequest = this.syncRequest_;
                return syncRequest == null ? SyncRequest.getDefaultInstance() : syncRequest;
            }

            public SyncRequest.Builder getSyncRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (SyncRequest.Builder) getSyncRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
            public SyncRequestOrBuilder getSyncRequestOrBuilder() {
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SyncRequest syncRequest = this.syncRequest_;
                return syncRequest == null ? SyncRequest.getDefaultInstance() : syncRequest;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
            public SyncResponse getSyncResponse() {
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV3 = this.syncResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncResponse) singleFieldBuilderV3.getMessage();
                }
                SyncResponse syncResponse = this.syncResponse_;
                return syncResponse == null ? SyncResponse.getDefaultInstance() : syncResponse;
            }

            public SyncResponse.Builder getSyncResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (SyncResponse.Builder) getSyncResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
            public SyncResponseOrBuilder getSyncResponseOrBuilder() {
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV3 = this.syncResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SyncResponse syncResponse = this.syncResponse_;
                return syncResponse == null ? SyncResponse.getDefaultInstance() : syncResponse;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
            public boolean hasCapabilitiesRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
            public boolean hasCapabilitiesResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
            public boolean hasChatEventsUpdatedNotification() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
            public boolean hasSubscribeRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
            public boolean hasSubscribeResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
            public boolean hasSyncRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.InReachChatEventsServiceOrBuilder
            public boolean hasSyncResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_InReachChatEventsService_fieldAccessorTable.ensureFieldAccessorsInitialized(InReachChatEventsService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasSyncRequest() && !getSyncRequest().isInitialized()) {
                    return false;
                }
                if (!hasSyncResponse() || getSyncResponse().isInitialized()) {
                    return !hasSubscribeResponse() || getSubscribeResponse().isInitialized();
                }
                return false;
            }

            public Builder mergeCapabilitiesRequest(CapabilitiesRequest capabilitiesRequest) {
                CapabilitiesRequest capabilitiesRequest2;
                SingleFieldBuilderV3<CapabilitiesRequest, CapabilitiesRequest.Builder, CapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.capabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(capabilitiesRequest);
                } else if ((this.bitField0_ & 1) == 0 || (capabilitiesRequest2 = this.capabilitiesRequest_) == null || capabilitiesRequest2 == CapabilitiesRequest.getDefaultInstance()) {
                    this.capabilitiesRequest_ = capabilitiesRequest;
                } else {
                    getCapabilitiesRequestBuilder().mergeFrom(capabilitiesRequest);
                }
                if (this.capabilitiesRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCapabilitiesResponse(CapabilitiesResponse capabilitiesResponse) {
                CapabilitiesResponse capabilitiesResponse2;
                SingleFieldBuilderV3<CapabilitiesResponse, CapabilitiesResponse.Builder, CapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.capabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(capabilitiesResponse);
                } else if ((this.bitField0_ & 2) == 0 || (capabilitiesResponse2 = this.capabilitiesResponse_) == null || capabilitiesResponse2 == CapabilitiesResponse.getDefaultInstance()) {
                    this.capabilitiesResponse_ = capabilitiesResponse;
                } else {
                    getCapabilitiesResponseBuilder().mergeFrom(capabilitiesResponse);
                }
                if (this.capabilitiesResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeChatEventsUpdatedNotification(ChatEventsUpdatedNotification chatEventsUpdatedNotification) {
                ChatEventsUpdatedNotification chatEventsUpdatedNotification2;
                SingleFieldBuilderV3<ChatEventsUpdatedNotification, ChatEventsUpdatedNotification.Builder, ChatEventsUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.chatEventsUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(chatEventsUpdatedNotification);
                } else if ((this.bitField0_ & 64) == 0 || (chatEventsUpdatedNotification2 = this.chatEventsUpdatedNotification_) == null || chatEventsUpdatedNotification2 == ChatEventsUpdatedNotification.getDefaultInstance()) {
                    this.chatEventsUpdatedNotification_ = chatEventsUpdatedNotification;
                } else {
                    getChatEventsUpdatedNotificationBuilder().mergeFrom(chatEventsUpdatedNotification);
                }
                if (this.chatEventsUpdatedNotification_ != null) {
                    this.bitField0_ |= 64;
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
                                    codedInputStream.readMessage(getCapabilitiesRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getCapabilitiesResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getSyncRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getSyncResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getSubscribeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(getSubscribeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(getChatEventsUpdatedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
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

            public Builder mergeSubscribeRequest(SubscribeRequest subscribeRequest) {
                SubscribeRequest subscribeRequest2;
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(subscribeRequest);
                } else if ((this.bitField0_ & 16) == 0 || (subscribeRequest2 = this.subscribeRequest_) == null || subscribeRequest2 == SubscribeRequest.getDefaultInstance()) {
                    this.subscribeRequest_ = subscribeRequest;
                } else {
                    getSubscribeRequestBuilder().mergeFrom(subscribeRequest);
                }
                if (this.subscribeRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSubscribeResponse(SubscribeResponse subscribeResponse) {
                SubscribeResponse subscribeResponse2;
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(subscribeResponse);
                } else if ((this.bitField0_ & 32) == 0 || (subscribeResponse2 = this.subscribeResponse_) == null || subscribeResponse2 == SubscribeResponse.getDefaultInstance()) {
                    this.subscribeResponse_ = subscribeResponse;
                } else {
                    getSubscribeResponseBuilder().mergeFrom(subscribeResponse);
                }
                if (this.subscribeResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSyncRequest(SyncRequest syncRequest) {
                SyncRequest syncRequest2;
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(syncRequest);
                } else if ((this.bitField0_ & 4) == 0 || (syncRequest2 = this.syncRequest_) == null || syncRequest2 == SyncRequest.getDefaultInstance()) {
                    this.syncRequest_ = syncRequest;
                } else {
                    getSyncRequestBuilder().mergeFrom(syncRequest);
                }
                if (this.syncRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSyncResponse(SyncResponse syncResponse) {
                SyncResponse syncResponse2;
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV3 = this.syncResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(syncResponse);
                } else if ((this.bitField0_ & 8) == 0 || (syncResponse2 = this.syncResponse_) == null || syncResponse2 == SyncResponse.getDefaultInstance()) {
                    this.syncResponse_ = syncResponse;
                } else {
                    getSyncResponseBuilder().mergeFrom(syncResponse);
                }
                if (this.syncResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setCapabilitiesRequest(CapabilitiesRequest.Builder builder) {
                SingleFieldBuilderV3<CapabilitiesRequest, CapabilitiesRequest.Builder, CapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.capabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.capabilitiesRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCapabilitiesResponse(CapabilitiesResponse.Builder builder) {
                SingleFieldBuilderV3<CapabilitiesResponse, CapabilitiesResponse.Builder, CapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.capabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.capabilitiesResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setChatEventsUpdatedNotification(ChatEventsUpdatedNotification.Builder builder) {
                SingleFieldBuilderV3<ChatEventsUpdatedNotification, ChatEventsUpdatedNotification.Builder, ChatEventsUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.chatEventsUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.chatEventsUpdatedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
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

            public Builder setSubscribeRequest(SubscribeRequest.Builder builder) {
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.subscribeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSubscribeResponse(SubscribeResponse.Builder builder) {
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.subscribeResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setSyncRequest(SyncRequest.Builder builder) {
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.syncRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSyncResponse(SyncResponse.Builder builder) {
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV3 = this.syncResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.syncResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public InReachChatEventsService getDefaultInstanceForType() {
                return InReachChatEventsService.getDefaultInstance();
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

            public Builder setCapabilitiesRequest(CapabilitiesRequest capabilitiesRequest) {
                SingleFieldBuilderV3<CapabilitiesRequest, CapabilitiesRequest.Builder, CapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.capabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    capabilitiesRequest.getClass();
                    this.capabilitiesRequest_ = capabilitiesRequest;
                } else {
                    singleFieldBuilderV3.setMessage(capabilitiesRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCapabilitiesResponse(CapabilitiesResponse capabilitiesResponse) {
                SingleFieldBuilderV3<CapabilitiesResponse, CapabilitiesResponse.Builder, CapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.capabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    capabilitiesResponse.getClass();
                    this.capabilitiesResponse_ = capabilitiesResponse;
                } else {
                    singleFieldBuilderV3.setMessage(capabilitiesResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setChatEventsUpdatedNotification(ChatEventsUpdatedNotification chatEventsUpdatedNotification) {
                SingleFieldBuilderV3<ChatEventsUpdatedNotification, ChatEventsUpdatedNotification.Builder, ChatEventsUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.chatEventsUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    chatEventsUpdatedNotification.getClass();
                    this.chatEventsUpdatedNotification_ = chatEventsUpdatedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(chatEventsUpdatedNotification);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setSubscribeRequest(SubscribeRequest subscribeRequest) {
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    subscribeRequest.getClass();
                    this.subscribeRequest_ = subscribeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(subscribeRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSubscribeResponse(SubscribeResponse subscribeResponse) {
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    subscribeResponse.getClass();
                    this.subscribeResponse_ = subscribeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(subscribeResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setSyncRequest(SyncRequest syncRequest) {
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    syncRequest.getClass();
                    this.syncRequest_ = syncRequest;
                } else {
                    singleFieldBuilderV3.setMessage(syncRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSyncResponse(SyncResponse syncResponse) {
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV3 = this.syncResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    syncResponse.getClass();
                    this.syncResponse_ = syncResponse;
                } else {
                    singleFieldBuilderV3.setMessage(syncResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InReachChatEventsService) {
                    return mergeFrom((InReachChatEventsService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(InReachChatEventsService inReachChatEventsService) {
                if (inReachChatEventsService == InReachChatEventsService.getDefaultInstance()) {
                    return this;
                }
                if (inReachChatEventsService.hasCapabilitiesRequest()) {
                    mergeCapabilitiesRequest(inReachChatEventsService.getCapabilitiesRequest());
                }
                if (inReachChatEventsService.hasCapabilitiesResponse()) {
                    mergeCapabilitiesResponse(inReachChatEventsService.getCapabilitiesResponse());
                }
                if (inReachChatEventsService.hasSyncRequest()) {
                    mergeSyncRequest(inReachChatEventsService.getSyncRequest());
                }
                if (inReachChatEventsService.hasSyncResponse()) {
                    mergeSyncResponse(inReachChatEventsService.getSyncResponse());
                }
                if (inReachChatEventsService.hasSubscribeRequest()) {
                    mergeSubscribeRequest(inReachChatEventsService.getSubscribeRequest());
                }
                if (inReachChatEventsService.hasSubscribeResponse()) {
                    mergeSubscribeResponse(inReachChatEventsService.getSubscribeResponse());
                }
                if (inReachChatEventsService.hasChatEventsUpdatedNotification()) {
                    mergeChatEventsUpdatedNotification(inReachChatEventsService.getChatEventsUpdatedNotification());
                }
                mergeUnknownFields(inReachChatEventsService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InReachChatEventsService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ InReachChatEventsService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private InReachChatEventsService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InReachChatEventsService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InReachChatEventsService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InReachChatEventsService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static InReachChatEventsService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InReachChatEventsService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static InReachChatEventsService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static InReachChatEventsService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static InReachChatEventsService parseFrom(InputStream inputStream) {
            return (InReachChatEventsService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static InReachChatEventsService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InReachChatEventsService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InReachChatEventsService parseFrom(CodedInputStream codedInputStream) {
            return (InReachChatEventsService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static InReachChatEventsService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InReachChatEventsService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LiveTrackData extends GeneratedMessageV3 implements LiveTrackDataOrBuilder {
        public static final int CUSTOMER_UUID_FIELD_NUMBER = 5;
        private static final LiveTrackData DEFAULT_INSTANCE = new LiveTrackData();

        @Deprecated
        public static final Parser<LiveTrackData> PARSER = new AbstractParser<LiveTrackData>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackData.1
            @Override // com.google.protobuf.Parser
            public LiveTrackData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LiveTrackData.newBuilder();
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
        public static final int SESSION_END_TIME_FIELD_NUMBER = 4;
        public static final int SESSION_NAME_FIELD_NUMBER = 2;
        public static final int SESSION_START_TIME_FIELD_NUMBER = 3;
        public static final int SESSION_UUID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private GDIDataTypes.UUID customerUuid_;
        private byte memoizedIsInitialized;
        private long sessionEndTime_;
        private volatile Object sessionName_;
        private long sessionStartTime_;
        private GDIDataTypes.UUID sessionUuid_;

        private LiveTrackData() {
            this.sessionName_ = "";
            this.sessionStartTime_ = 0L;
            this.sessionEndTime_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
            this.sessionName_ = "";
        }

        public static LiveTrackData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_LiveTrackData_descriptor;
        }

        public static Builder newBuilder(LiveTrackData liveTrackData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveTrackData);
        }

        public static LiveTrackData parseDelimitedFrom(InputStream inputStream) {
            return (LiveTrackData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LiveTrackData parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LiveTrackData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LiveTrackData)) {
                return super.equals(obj);
            }
            LiveTrackData liveTrackData = (LiveTrackData) obj;
            if (hasSessionUuid() != liveTrackData.hasSessionUuid()) {
                return false;
            }
            if ((hasSessionUuid() && !getSessionUuid().equals(liveTrackData.getSessionUuid())) || hasSessionName() != liveTrackData.hasSessionName()) {
                return false;
            }
            if ((hasSessionName() && !getSessionName().equals(liveTrackData.getSessionName())) || hasSessionStartTime() != liveTrackData.hasSessionStartTime()) {
                return false;
            }
            if ((hasSessionStartTime() && getSessionStartTime() != liveTrackData.getSessionStartTime()) || hasSessionEndTime() != liveTrackData.hasSessionEndTime()) {
                return false;
            }
            if ((!hasSessionEndTime() || getSessionEndTime() == liveTrackData.getSessionEndTime()) && hasCustomerUuid() == liveTrackData.hasCustomerUuid()) {
                return (!hasCustomerUuid() || getCustomerUuid().equals(liveTrackData.getCustomerUuid())) && getUnknownFields().equals(liveTrackData.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
        public GDIDataTypes.UUID getCustomerUuid() {
            GDIDataTypes.UUID uuid = this.customerUuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
        public GDIDataTypes.UUIDOrBuilder getCustomerUuidOrBuilder() {
            GDIDataTypes.UUID uuid = this.customerUuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LiveTrackData> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSessionUuid()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += GeneratedMessageV3.computeStringSize(2, this.sessionName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt64Size(3, this.sessionStartTime_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt64Size(4, this.sessionEndTime_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getCustomerUuid());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
        public long getSessionEndTime() {
            return this.sessionEndTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
        public String getSessionName() {
            Object obj = this.sessionName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.sessionName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
        public ByteString getSessionNameBytes() {
            Object obj = this.sessionName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
        public long getSessionStartTime() {
            return this.sessionStartTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
        public GDIDataTypes.UUID getSessionUuid() {
            GDIDataTypes.UUID uuid = this.sessionUuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
        public GDIDataTypes.UUIDOrBuilder getSessionUuidOrBuilder() {
            GDIDataTypes.UUID uuid = this.sessionUuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
        public boolean hasCustomerUuid() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
        public boolean hasSessionEndTime() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
        public boolean hasSessionName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
        public boolean hasSessionStartTime() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
        public boolean hasSessionUuid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSessionUuid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSessionUuid().hashCode();
            }
            if (hasSessionName()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSessionName().hashCode();
            }
            if (hasSessionStartTime()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashLong(getSessionStartTime());
            }
            if (hasSessionEndTime()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashLong(getSessionEndTime());
            }
            if (hasCustomerUuid()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getCustomerUuid().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_LiveTrackData_fieldAccessorTable.ensureFieldAccessorsInitialized(LiveTrackData.class, Builder.class);
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
            if (hasSessionUuid() && !getSessionUuid().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasCustomerUuid() || getCustomerUuid().isInitialized()) {
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
            return new LiveTrackData();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSessionUuid());
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.sessionName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt64(3, this.sessionStartTime_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt64(4, this.sessionEndTime_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getCustomerUuid());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LiveTrackDataOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> customerUuidBuilder_;
            private GDIDataTypes.UUID customerUuid_;
            private long sessionEndTime_;
            private Object sessionName_;
            private long sessionStartTime_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> sessionUuidBuilder_;
            private GDIDataTypes.UUID sessionUuid_;

            private Builder() {
                this.sessionName_ = "";
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(LiveTrackData liveTrackData) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                    liveTrackData.sessionUuid_ = singleFieldBuilderV3 == null ? this.sessionUuid_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    liveTrackData.sessionName_ = this.sessionName_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    liveTrackData.sessionStartTime_ = this.sessionStartTime_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    liveTrackData.sessionEndTime_ = this.sessionEndTime_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV4 = this.customerUuidBuilder_;
                    liveTrackData.customerUuid_ = singleFieldBuilderV4 == null ? this.customerUuid_ : (GDIDataTypes.UUID) singleFieldBuilderV4.build();
                    i14 |= 16;
                }
                liveTrackData.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getCustomerUuidFieldBuilder() {
                if (this.customerUuidBuilder_ == null) {
                    this.customerUuidBuilder_ = new SingleFieldBuilderV3<>(getCustomerUuid(), getParentForChildren(), isClean());
                    this.customerUuid_ = null;
                }
                return this.customerUuidBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_LiveTrackData_descriptor;
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getSessionUuidFieldBuilder() {
                if (this.sessionUuidBuilder_ == null) {
                    this.sessionUuidBuilder_ = new SingleFieldBuilderV3<>(getSessionUuid(), getParentForChildren(), isClean());
                    this.sessionUuid_ = null;
                }
                return this.sessionUuidBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSessionUuidFieldBuilder();
                    getCustomerUuidFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LiveTrackData build() {
                LiveTrackData liveTrackDataBuildPartial = buildPartial();
                if (liveTrackDataBuildPartial.isInitialized()) {
                    return liveTrackDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) liveTrackDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LiveTrackData buildPartial() {
                LiveTrackData liveTrackData = new LiveTrackData(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(liveTrackData);
                }
                onBuilt();
                return liveTrackData;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sessionUuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sessionUuidBuilder_ = null;
                }
                this.sessionName_ = "";
                this.sessionStartTime_ = 0L;
                this.sessionEndTime_ = 0L;
                this.customerUuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV4 = this.customerUuidBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.customerUuidBuilder_ = null;
                }
                return this;
            }

            public Builder clearCustomerUuid() {
                this.bitField0_ &= -17;
                this.customerUuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.customerUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.customerUuidBuilder_ = null;
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

            public Builder clearSessionEndTime() {
                this.bitField0_ &= -9;
                this.sessionEndTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearSessionName() {
                this.sessionName_ = LiveTrackData.getDefaultInstance().getSessionName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearSessionStartTime() {
                this.bitField0_ &= -5;
                this.sessionStartTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearSessionUuid() {
                this.bitField0_ &= -2;
                this.sessionUuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sessionUuidBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
            public GDIDataTypes.UUID getCustomerUuid() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.customerUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.customerUuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getCustomerUuidBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getCustomerUuidFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
            public GDIDataTypes.UUIDOrBuilder getCustomerUuidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.customerUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.customerUuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_LiveTrackData_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
            public long getSessionEndTime() {
                return this.sessionEndTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
            public String getSessionName() {
                Object obj = this.sessionName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.sessionName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
            public ByteString getSessionNameBytes() {
                Object obj = this.sessionName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sessionName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
            public long getSessionStartTime() {
                return this.sessionStartTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
            public GDIDataTypes.UUID getSessionUuid() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.sessionUuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getSessionUuidBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getSessionUuidFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
            public GDIDataTypes.UUIDOrBuilder getSessionUuidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.sessionUuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
            public boolean hasCustomerUuid() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
            public boolean hasSessionEndTime() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
            public boolean hasSessionName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
            public boolean hasSessionStartTime() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.LiveTrackDataOrBuilder
            public boolean hasSessionUuid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_LiveTrackData_fieldAccessorTable.ensureFieldAccessorsInitialized(LiveTrackData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasSessionUuid() || getSessionUuid().isInitialized()) {
                    return !hasCustomerUuid() || getCustomerUuid().isInitialized();
                }
                return false;
            }

            public Builder mergeCustomerUuid(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.customerUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 16) == 0 || (uuid2 = this.customerUuid_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.customerUuid_ = uuid;
                } else {
                    getCustomerUuidBuilder().mergeFrom(uuid);
                }
                if (this.customerUuid_ != null) {
                    this.bitField0_ |= 16;
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
                                    codedInputStream.readMessage(getSessionUuidFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.sessionName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.sessionStartTime_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.sessionEndTime_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getCustomerUuidFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSessionUuid(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 1) == 0 || (uuid2 = this.sessionUuid_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.sessionUuid_ = uuid;
                } else {
                    getSessionUuidBuilder().mergeFrom(uuid);
                }
                if (this.sessionUuid_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setCustomerUuid(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.customerUuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.customerUuid_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
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

            public Builder setSessionEndTime(long j8) {
                this.sessionEndTime_ = j8;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSessionName(String str) {
                str.getClass();
                this.sessionName_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSessionNameBytes(ByteString byteString) {
                byteString.getClass();
                this.sessionName_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSessionStartTime(long j8) {
                this.sessionStartTime_ = j8;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSessionUuid(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sessionUuid_ = builder.build();
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
            public LiveTrackData getDefaultInstanceForType() {
                return LiveTrackData.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.sessionName_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder setCustomerUuid(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.customerUuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.customerUuid_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSessionUuid(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.sessionUuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.sessionUuid_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LiveTrackData) {
                    return mergeFrom((LiveTrackData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LiveTrackData liveTrackData) {
                if (liveTrackData == LiveTrackData.getDefaultInstance()) {
                    return this;
                }
                if (liveTrackData.hasSessionUuid()) {
                    mergeSessionUuid(liveTrackData.getSessionUuid());
                }
                if (liveTrackData.hasSessionName()) {
                    this.sessionName_ = liveTrackData.sessionName_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (liveTrackData.hasSessionStartTime()) {
                    setSessionStartTime(liveTrackData.getSessionStartTime());
                }
                if (liveTrackData.hasSessionEndTime()) {
                    setSessionEndTime(liveTrackData.getSessionEndTime());
                }
                if (liveTrackData.hasCustomerUuid()) {
                    mergeCustomerUuid(liveTrackData.getCustomerUuid());
                }
                mergeUnknownFields(liveTrackData.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LiveTrackData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LiveTrackData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveTrackData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LiveTrackData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LiveTrackData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveTrackData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LiveTrackData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LiveTrackData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LiveTrackData parseFrom(InputStream inputStream) {
            return (LiveTrackData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LiveTrackData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveTrackData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LiveTrackData parseFrom(CodedInputStream codedInputStream) {
            return (LiveTrackData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private LiveTrackData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sessionName_ = "";
            this.sessionStartTime_ = 0L;
            this.sessionEndTime_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LiveTrackData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveTrackData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ LiveTrackData(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class SubscribeResponse extends GeneratedMessageV3 implements SubscribeResponseOrBuilder {
        private static final SubscribeResponse DEFAULT_INSTANCE = new SubscribeResponse();

        @Deprecated
        public static final Parser<SubscribeResponse> PARSER = new AbstractParser<SubscribeResponse>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.SubscribeResponse.1
            @Override // com.google.protobuf.Parser
            public SubscribeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SubscribeResponse.newBuilder();
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

        private SubscribeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SubscribeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SubscribeResponse_descriptor;
        }

        public static Builder newBuilder(SubscribeResponse subscribeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(subscribeResponse);
        }

        public static SubscribeResponse parseDelimitedFrom(InputStream inputStream) {
            return (SubscribeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SubscribeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SubscribeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SubscribeResponse)) {
                return super.equals(obj);
            }
            SubscribeResponse subscribeResponse = (SubscribeResponse) obj;
            if (hasStatus() != subscribeResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == subscribeResponse.status_) && getUnknownFields().equals(subscribeResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SubscribeResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.SubscribeResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.SubscribeResponseOrBuilder
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
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SubscribeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SubscribeResponse.class, Builder.class);
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
            return new SubscribeResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SubscribeResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(SubscribeResponse subscribeResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    subscribeResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                subscribeResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SubscribeResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SubscribeResponse build() {
                SubscribeResponse subscribeResponseBuildPartial = buildPartial();
                if (subscribeResponseBuildPartial.isInitialized()) {
                    return subscribeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) subscribeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SubscribeResponse buildPartial() {
                SubscribeResponse subscribeResponse = new SubscribeResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(subscribeResponse);
                }
                onBuilt();
                return subscribeResponse;
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
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SubscribeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.SubscribeResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.SubscribeResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SubscribeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SubscribeResponse.class, Builder.class);
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
            public SubscribeResponse getDefaultInstanceForType() {
                return SubscribeResponse.getDefaultInstance();
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
                if (message instanceof SubscribeResponse) {
                    return mergeFrom((SubscribeResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SubscribeResponse subscribeResponse) {
                if (subscribeResponse == SubscribeResponse.getDefaultInstance()) {
                    return this;
                }
                if (subscribeResponse.hasStatus()) {
                    setStatus(subscribeResponse.getStatus());
                }
                mergeUnknownFields(subscribeResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SubscribeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SubscribeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SubscribeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SubscribeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SubscribeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SubscribeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SubscribeResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SubscribeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SubscribeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SubscribeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SubscribeResponse parseFrom(InputStream inputStream) {
            return (SubscribeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SubscribeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SubscribeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SubscribeResponse parseFrom(CodedInputStream codedInputStream) {
            return (SubscribeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SubscribeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SubscribeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN_STATUS(0),
            OK(1),
            GENERIC_ERROR(2);

            public static final int GENERIC_ERROR_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.SubscribeResponse.Status.1
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
                    return UNKNOWN_STATUS;
                }
                if (i14 == 1) {
                    return OK;
                }
                if (i14 != 2) {
                    return null;
                }
                return GENERIC_ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SubscribeResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class SyncRequest extends GeneratedMessageV3 implements SyncRequestOrBuilder {
        private static final SyncRequest DEFAULT_INSTANCE = new SyncRequest();

        @Deprecated
        public static final Parser<SyncRequest> PARSER = new AbstractParser<SyncRequest>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.SyncRequest.1
            @Override // com.google.protobuf.Parser
            public SyncRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SyncRequest.newBuilder();
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
        public static final int REQUEST_INFO_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SyncRequestInfo requestInfo_;

        private SyncRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SyncRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SyncRequest_descriptor;
        }

        public static Builder newBuilder(SyncRequest syncRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(syncRequest);
        }

        public static SyncRequest parseDelimitedFrom(InputStream inputStream) {
            return (SyncRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SyncRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SyncRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SyncRequest)) {
                return super.equals(obj);
            }
            SyncRequest syncRequest = (SyncRequest) obj;
            if (hasRequestInfo() != syncRequest.hasRequestInfo()) {
                return false;
            }
            return (!hasRequestInfo() || getRequestInfo().equals(syncRequest.getRequestInfo())) && getUnknownFields().equals(syncRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SyncRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestOrBuilder
        public SyncRequestInfo getRequestInfo() {
            SyncRequestInfo syncRequestInfo = this.requestInfo_;
            return syncRequestInfo == null ? SyncRequestInfo.getDefaultInstance() : syncRequestInfo;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestOrBuilder
        public SyncRequestInfoOrBuilder getRequestInfoOrBuilder() {
            SyncRequestInfo syncRequestInfo = this.requestInfo_;
            return syncRequestInfo == null ? SyncRequestInfo.getDefaultInstance() : syncRequestInfo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getRequestInfo()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestOrBuilder
        public boolean hasRequestInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasRequestInfo()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getRequestInfo().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SyncRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncRequest.class, Builder.class);
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
            if (!hasRequestInfo() || getRequestInfo().isInitialized()) {
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
            return new SyncRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getRequestInfo());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SyncRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> requestInfoBuilder_;
            private SyncRequestInfo requestInfo_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SyncRequest syncRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                    syncRequest.requestInfo_ = singleFieldBuilderV3 == null ? this.requestInfo_ : (SyncRequestInfo) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                syncRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SyncRequest_descriptor;
            }

            private SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> getRequestInfoFieldBuilder() {
                if (this.requestInfoBuilder_ == null) {
                    this.requestInfoBuilder_ = new SingleFieldBuilderV3<>(getRequestInfo(), getParentForChildren(), isClean());
                    this.requestInfo_ = null;
                }
                return this.requestInfoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getRequestInfoFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SyncRequest build() {
                SyncRequest syncRequestBuildPartial = buildPartial();
                if (syncRequestBuildPartial.isInitialized()) {
                    return syncRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) syncRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SyncRequest buildPartial() {
                SyncRequest syncRequest = new SyncRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(syncRequest);
                }
                onBuilt();
                return syncRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.requestInfo_ = null;
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.requestInfoBuilder_ = null;
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

            public Builder clearRequestInfo() {
                this.bitField0_ &= -2;
                this.requestInfo_ = null;
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.requestInfoBuilder_ = null;
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
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SyncRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestOrBuilder
            public SyncRequestInfo getRequestInfo() {
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncRequestInfo) singleFieldBuilderV3.getMessage();
                }
                SyncRequestInfo syncRequestInfo = this.requestInfo_;
                return syncRequestInfo == null ? SyncRequestInfo.getDefaultInstance() : syncRequestInfo;
            }

            public SyncRequestInfo.Builder getRequestInfoBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SyncRequestInfo.Builder) getRequestInfoFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestOrBuilder
            public SyncRequestInfoOrBuilder getRequestInfoOrBuilder() {
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncRequestInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SyncRequestInfo syncRequestInfo = this.requestInfo_;
                return syncRequestInfo == null ? SyncRequestInfo.getDefaultInstance() : syncRequestInfo;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestOrBuilder
            public boolean hasRequestInfo() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SyncRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasRequestInfo() || getRequestInfo().isInitialized();
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
                                    codedInputStream.readMessage(getRequestInfoFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeRequestInfo(SyncRequestInfo syncRequestInfo) {
                SyncRequestInfo syncRequestInfo2;
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(syncRequestInfo);
                } else if ((this.bitField0_ & 1) == 0 || (syncRequestInfo2 = this.requestInfo_) == null || syncRequestInfo2 == SyncRequestInfo.getDefaultInstance()) {
                    this.requestInfo_ = syncRequestInfo;
                } else {
                    getRequestInfoBuilder().mergeFrom(syncRequestInfo);
                }
                if (this.requestInfo_ != null) {
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

            public Builder setRequestInfo(SyncRequestInfo.Builder builder) {
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.requestInfo_ = builder.build();
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
            public SyncRequest getDefaultInstanceForType() {
                return SyncRequest.getDefaultInstance();
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

            public Builder setRequestInfo(SyncRequestInfo syncRequestInfo) {
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    syncRequestInfo.getClass();
                    this.requestInfo_ = syncRequestInfo;
                } else {
                    singleFieldBuilderV3.setMessage(syncRequestInfo);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SyncRequest) {
                    return mergeFrom((SyncRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SyncRequest syncRequest) {
                if (syncRequest == SyncRequest.getDefaultInstance()) {
                    return this;
                }
                if (syncRequest.hasRequestInfo()) {
                    mergeRequestInfo(syncRequest.getRequestInfo());
                }
                mergeUnknownFields(syncRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SyncRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SyncRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SyncRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SyncRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SyncRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SyncRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SyncRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SyncRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SyncRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SyncRequest parseFrom(InputStream inputStream) {
            return (SyncRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SyncRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SyncRequest parseFrom(CodedInputStream codedInputStream) {
            return (SyncRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SyncRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SyncRequestInfo extends GeneratedMessageV3 implements SyncRequestInfoOrBuilder {
        public static final int APP_UUID_FIELD_NUMBER = 2;
        private static final SyncRequestInfo DEFAULT_INSTANCE = new SyncRequestInfo();

        @Deprecated
        public static final Parser<SyncRequestInfo> PARSER = new AbstractParser<SyncRequestInfo>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestInfo.1
            @Override // com.google.protobuf.Parser
            public SyncRequestInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SyncRequestInfo.newBuilder();
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
        public static final int PROTOCOL_VERSION_FIELD_NUMBER = 1;
        public static final int SYNC_DATA_TYPE_FIELD_NUMBER = 4;
        public static final int SYNC_TYPE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private GDIDataTypes.UUID appUuid_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int protocolVersion_;
        private int syncDataType_;
        private int syncType_;

        private SyncRequestInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.protocolVersion_ = 1;
            this.syncType_ = 2;
            this.syncDataType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SyncRequestInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SyncRequestInfo_descriptor;
        }

        public static Builder newBuilder(SyncRequestInfo syncRequestInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(syncRequestInfo);
        }

        public static SyncRequestInfo parseDelimitedFrom(InputStream inputStream) {
            return (SyncRequestInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SyncRequestInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SyncRequestInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SyncRequestInfo)) {
                return super.equals(obj);
            }
            SyncRequestInfo syncRequestInfo = (SyncRequestInfo) obj;
            if (hasProtocolVersion() != syncRequestInfo.hasProtocolVersion()) {
                return false;
            }
            if ((hasProtocolVersion() && getProtocolVersion() != syncRequestInfo.getProtocolVersion()) || hasAppUuid() != syncRequestInfo.hasAppUuid()) {
                return false;
            }
            if ((hasAppUuid() && !getAppUuid().equals(syncRequestInfo.getAppUuid())) || hasSyncType() != syncRequestInfo.hasSyncType()) {
                return false;
            }
            if ((!hasSyncType() || this.syncType_ == syncRequestInfo.syncType_) && hasSyncDataType() == syncRequestInfo.hasSyncDataType()) {
                return (!hasSyncDataType() || this.syncDataType_ == syncRequestInfo.syncDataType_) && getUnknownFields().equals(syncRequestInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestInfoOrBuilder
        public GDIDataTypes.UUID getAppUuid() {
            GDIDataTypes.UUID uuid = this.appUuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestInfoOrBuilder
        public GDIDataTypes.UUIDOrBuilder getAppUuidOrBuilder() {
            GDIDataTypes.UUID uuid = this.appUuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SyncRequestInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestInfoOrBuilder
        public int getProtocolVersion() {
            return this.protocolVersion_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.protocolVersion_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(2, getAppUuid());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(3, this.syncType_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(4, this.syncDataType_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestInfoOrBuilder
        public SyncDataType getSyncDataType() {
            SyncDataType syncDataTypeForNumber = SyncDataType.forNumber(this.syncDataType_);
            return syncDataTypeForNumber == null ? SyncDataType.UNKNOWN_SYNC_DATA_TYPE : syncDataTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestInfoOrBuilder
        public SyncType getSyncType() {
            SyncType syncTypeForNumber = SyncType.forNumber(this.syncType_);
            return syncTypeForNumber == null ? SyncType.INCREMENTAL : syncTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestInfoOrBuilder
        public boolean hasAppUuid() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestInfoOrBuilder
        public boolean hasProtocolVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestInfoOrBuilder
        public boolean hasSyncDataType() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestInfoOrBuilder
        public boolean hasSyncType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasProtocolVersion()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getProtocolVersion();
            }
            if (hasAppUuid()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getAppUuid().hashCode();
            }
            if (hasSyncType()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.syncType_;
            }
            if (hasSyncDataType()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + this.syncDataType_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SyncRequestInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncRequestInfo.class, Builder.class);
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
            if (!hasAppUuid() || getAppUuid().isInitialized()) {
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
            return new SyncRequestInfo();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.protocolVersion_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getAppUuid());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.syncType_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(4, this.syncDataType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SyncRequestInfoOrBuilder {
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> appUuidBuilder_;
            private GDIDataTypes.UUID appUuid_;
            private int bitField0_;
            private int protocolVersion_;
            private int syncDataType_;
            private int syncType_;

            private Builder() {
                this.protocolVersion_ = 1;
                this.syncType_ = 2;
                this.syncDataType_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SyncRequestInfo syncRequestInfo) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    syncRequestInfo.protocolVersion_ = this.protocolVersion_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.appUuidBuilder_;
                    syncRequestInfo.appUuid_ = singleFieldBuilderV3 == null ? this.appUuid_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    syncRequestInfo.syncType_ = this.syncType_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    syncRequestInfo.syncDataType_ = this.syncDataType_;
                    i14 |= 8;
                }
                syncRequestInfo.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getAppUuidFieldBuilder() {
                if (this.appUuidBuilder_ == null) {
                    this.appUuidBuilder_ = new SingleFieldBuilderV3<>(getAppUuid(), getParentForChildren(), isClean());
                    this.appUuid_ = null;
                }
                return this.appUuidBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SyncRequestInfo_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getAppUuidFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SyncRequestInfo build() {
                SyncRequestInfo syncRequestInfoBuildPartial = buildPartial();
                if (syncRequestInfoBuildPartial.isInitialized()) {
                    return syncRequestInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) syncRequestInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SyncRequestInfo buildPartial() {
                SyncRequestInfo syncRequestInfo = new SyncRequestInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(syncRequestInfo);
                }
                onBuilt();
                return syncRequestInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.protocolVersion_ = 1;
                this.appUuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.appUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.appUuidBuilder_ = null;
                }
                this.syncType_ = 2;
                this.syncDataType_ = 0;
                return this;
            }

            public Builder clearAppUuid() {
                this.bitField0_ &= -3;
                this.appUuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.appUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.appUuidBuilder_ = null;
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

            public Builder clearProtocolVersion() {
                this.bitField0_ &= -2;
                this.protocolVersion_ = 1;
                onChanged();
                return this;
            }

            public Builder clearSyncDataType() {
                this.bitField0_ &= -9;
                this.syncDataType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSyncType() {
                this.bitField0_ &= -5;
                this.syncType_ = 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestInfoOrBuilder
            public GDIDataTypes.UUID getAppUuid() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.appUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.appUuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getAppUuidBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getAppUuidFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestInfoOrBuilder
            public GDIDataTypes.UUIDOrBuilder getAppUuidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.appUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.appUuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SyncRequestInfo_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestInfoOrBuilder
            public int getProtocolVersion() {
                return this.protocolVersion_;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestInfoOrBuilder
            public SyncDataType getSyncDataType() {
                SyncDataType syncDataTypeForNumber = SyncDataType.forNumber(this.syncDataType_);
                return syncDataTypeForNumber == null ? SyncDataType.UNKNOWN_SYNC_DATA_TYPE : syncDataTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestInfoOrBuilder
            public SyncType getSyncType() {
                SyncType syncTypeForNumber = SyncType.forNumber(this.syncType_);
                return syncTypeForNumber == null ? SyncType.INCREMENTAL : syncTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestInfoOrBuilder
            public boolean hasAppUuid() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestInfoOrBuilder
            public boolean hasProtocolVersion() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestInfoOrBuilder
            public boolean hasSyncDataType() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestInfoOrBuilder
            public boolean hasSyncType() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SyncRequestInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncRequestInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasAppUuid() || getAppUuid().isInitialized();
            }

            public Builder mergeAppUuid(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.appUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 2) == 0 || (uuid2 = this.appUuid_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.appUuid_ = uuid;
                } else {
                    getAppUuidBuilder().mergeFrom(uuid);
                }
                if (this.appUuid_ != null) {
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
                                    this.protocolVersion_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getAppUuidFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i14 = codedInputStream.readEnum();
                                    if (SyncType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(3, i14);
                                    } else {
                                        this.syncType_ = i14;
                                        this.bitField0_ |= 4;
                                    }
                                } else if (tag == 32) {
                                    int i15 = codedInputStream.readEnum();
                                    if (SyncDataType.forNumber(i15) == null) {
                                        mergeUnknownVarintField(4, i15);
                                    } else {
                                        this.syncDataType_ = i15;
                                        this.bitField0_ |= 8;
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

            public Builder setAppUuid(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.appUuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.appUuid_ = builder.build();
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

            public Builder setProtocolVersion(int i14) {
                this.protocolVersion_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSyncDataType(SyncDataType syncDataType) {
                syncDataType.getClass();
                this.bitField0_ |= 8;
                this.syncDataType_ = syncDataType.getNumber();
                onChanged();
                return this;
            }

            public Builder setSyncType(SyncType syncType) {
                syncType.getClass();
                this.bitField0_ |= 4;
                this.syncType_ = syncType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SyncRequestInfo getDefaultInstanceForType() {
                return SyncRequestInfo.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.protocolVersion_ = 1;
                this.syncType_ = 2;
                this.syncDataType_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setAppUuid(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.appUuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.appUuid_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SyncRequestInfo) {
                    return mergeFrom((SyncRequestInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SyncRequestInfo syncRequestInfo) {
                if (syncRequestInfo == SyncRequestInfo.getDefaultInstance()) {
                    return this;
                }
                if (syncRequestInfo.hasProtocolVersion()) {
                    setProtocolVersion(syncRequestInfo.getProtocolVersion());
                }
                if (syncRequestInfo.hasAppUuid()) {
                    mergeAppUuid(syncRequestInfo.getAppUuid());
                }
                if (syncRequestInfo.hasSyncType()) {
                    setSyncType(syncRequestInfo.getSyncType());
                }
                if (syncRequestInfo.hasSyncDataType()) {
                    setSyncDataType(syncRequestInfo.getSyncDataType());
                }
                mergeUnknownFields(syncRequestInfo.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SyncRequestInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SyncRequestInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncRequestInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SyncRequestInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SyncRequestInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SyncRequestInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SyncRequestInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SyncRequestInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SyncRequestInfo parseFrom(InputStream inputStream) {
            return (SyncRequestInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ SyncRequestInfo(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SyncRequestInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncRequestInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private SyncRequestInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.protocolVersion_ = 1;
            this.syncType_ = 2;
            this.syncDataType_ = 0;
        }

        public static SyncRequestInfo parseFrom(CodedInputStream codedInputStream) {
            return (SyncRequestInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SyncRequestInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncRequestInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum SyncDataType implements ProtocolMessageEnum {
            UNKNOWN_SYNC_DATA_TYPE(0),
            ALL(1),
            LIVETRACK(2),
            TRUSTED_CONTACT_ADDED(3),
            TRUSTED_CONTACT_REMOVED(4);

            public static final int ALL_VALUE = 1;
            public static final int LIVETRACK_VALUE = 2;
            public static final int TRUSTED_CONTACT_ADDED_VALUE = 3;
            public static final int TRUSTED_CONTACT_REMOVED_VALUE = 4;
            public static final int UNKNOWN_SYNC_DATA_TYPE_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<SyncDataType> internalValueMap = new Internal.EnumLiteMap<SyncDataType>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestInfo.SyncDataType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SyncDataType findValueByNumber(int i14) {
                    return SyncDataType.forNumber(i14);
                }
            };
            private static final SyncDataType[] VALUES = values();

            SyncDataType(int i14) {
                this.value = i14;
            }

            public static SyncDataType forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN_SYNC_DATA_TYPE;
                }
                if (i14 == 1) {
                    return ALL;
                }
                if (i14 == 2) {
                    return LIVETRACK;
                }
                if (i14 == 3) {
                    return TRUSTED_CONTACT_ADDED;
                }
                if (i14 != 4) {
                    return null;
                }
                return TRUSTED_CONTACT_REMOVED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SyncRequestInfo.getDescriptor().getEnumTypes().get(1);
            }

            public static Internal.EnumLiteMap<SyncDataType> internalGetValueMap() {
                return internalValueMap;
            }

            public static SyncDataType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static SyncDataType valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum SyncType implements ProtocolMessageEnum {
            UNKNOWN_SYNC_TYPE(0),
            FULL(1),
            INCREMENTAL(2);

            public static final int FULL_VALUE = 1;
            public static final int INCREMENTAL_VALUE = 2;
            public static final int UNKNOWN_SYNC_TYPE_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<SyncType> internalValueMap = new Internal.EnumLiteMap<SyncType>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.SyncRequestInfo.SyncType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SyncType findValueByNumber(int i14) {
                    return SyncType.forNumber(i14);
                }
            };
            private static final SyncType[] VALUES = values();

            SyncType(int i14) {
                this.value = i14;
            }

            public static SyncType forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN_SYNC_TYPE;
                }
                if (i14 == 1) {
                    return FULL;
                }
                if (i14 != 2) {
                    return null;
                }
                return INCREMENTAL;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SyncRequestInfo.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<SyncType> internalGetValueMap() {
                return internalValueMap;
            }

            public static SyncType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static SyncType valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class SyncResponse extends GeneratedMessageV3 implements SyncResponseOrBuilder {
        private static final SyncResponse DEFAULT_INSTANCE = new SyncResponse();

        @Deprecated
        public static final Parser<SyncResponse> PARSER = new AbstractParser<SyncResponse>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.SyncResponse.1
            @Override // com.google.protobuf.Parser
            public SyncResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SyncResponse.newBuilder();
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

        private SyncResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SyncResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SyncResponse_descriptor;
        }

        public static Builder newBuilder(SyncResponse syncResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(syncResponse);
        }

        public static SyncResponse parseDelimitedFrom(InputStream inputStream) {
            return (SyncResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SyncResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SyncResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SyncResponse)) {
                return super.equals(obj);
            }
            SyncResponse syncResponse = (SyncResponse) obj;
            if (hasStatus() != syncResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == syncResponse.status_) && getUnknownFields().equals(syncResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SyncResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncResponseOrBuilder
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
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SyncResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncResponse.class, Builder.class);
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
            return new SyncResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SyncResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(SyncResponse syncResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    syncResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                syncResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SyncResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SyncResponse build() {
                SyncResponse syncResponseBuildPartial = buildPartial();
                if (syncResponseBuildPartial.isInitialized()) {
                    return syncResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) syncResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SyncResponse buildPartial() {
                SyncResponse syncResponse = new SyncResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(syncResponse);
                }
                onBuilt();
                return syncResponse;
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
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SyncResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.SyncResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_SyncResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncResponse.class, Builder.class);
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
            public SyncResponse getDefaultInstanceForType() {
                return SyncResponse.getDefaultInstance();
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
                if (message instanceof SyncResponse) {
                    return mergeFrom((SyncResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SyncResponse syncResponse) {
                if (syncResponse == SyncResponse.getDefaultInstance()) {
                    return this;
                }
                if (syncResponse.hasStatus()) {
                    setStatus(syncResponse.getStatus());
                }
                mergeUnknownFields(syncResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SyncResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SyncResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SyncResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SyncResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SyncResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SyncResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SyncResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SyncResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SyncResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SyncResponse parseFrom(InputStream inputStream) {
            return (SyncResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SyncResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SyncResponse parseFrom(CodedInputStream codedInputStream) {
            return (SyncResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SyncResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN(0),
            OK(1),
            GENERIC_ERROR(2),
            BUSY(3),
            UNSUPPORTED_PROTOCOL_VERSION(4),
            UNSUPPORTED_DATA_TYPE(5),
            MISSING_INFO(6),
            UP_TO_DATE(7);

            public static final int BUSY_VALUE = 3;
            public static final int GENERIC_ERROR_VALUE = 2;
            public static final int MISSING_INFO_VALUE = 6;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            public static final int UNSUPPORTED_DATA_TYPE_VALUE = 5;
            public static final int UNSUPPORTED_PROTOCOL_VERSION_VALUE = 4;
            public static final int UP_TO_DATE_VALUE = 7;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.SyncResponse.Status.1
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
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return OK;
                    case 2:
                        return GENERIC_ERROR;
                    case 3:
                        return BUSY;
                    case 4:
                        return UNSUPPORTED_PROTOCOL_VERSION;
                    case 5:
                        return UNSUPPORTED_DATA_TYPE;
                    case 6:
                        return MISSING_INFO;
                    case 7:
                        return UP_TO_DATE;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SyncResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class UserIdentifier extends GeneratedMessageV3 implements UserIdentifierOrBuilder {
        public static final int ADDRESS_FIELD_NUMBER = 2;
        private static final UserIdentifier DEFAULT_INSTANCE = new UserIdentifier();

        @Deprecated
        public static final Parser<UserIdentifier> PARSER = new AbstractParser<UserIdentifier>() { // from class: com.garmin.proto.generated.GDIInReachChatEvents.UserIdentifier.1
            @Override // com.google.protobuf.Parser
            public UserIdentifier parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UserIdentifier.newBuilder();
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
        public static final int USER_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object address_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private GDIDataTypes.UUID userId_;

        private UserIdentifier() {
            this.address_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.address_ = "";
        }

        public static UserIdentifier getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_UserIdentifier_descriptor;
        }

        public static Builder newBuilder(UserIdentifier userIdentifier) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userIdentifier);
        }

        public static UserIdentifier parseDelimitedFrom(InputStream inputStream) {
            return (UserIdentifier) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserIdentifier parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UserIdentifier> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserIdentifier)) {
                return super.equals(obj);
            }
            UserIdentifier userIdentifier = (UserIdentifier) obj;
            if (hasUserId() != userIdentifier.hasUserId()) {
                return false;
            }
            if ((!hasUserId() || getUserId().equals(userIdentifier.getUserId())) && hasAddress() == userIdentifier.hasAddress()) {
                return (!hasAddress() || getAddress().equals(userIdentifier.getAddress())) && getUnknownFields().equals(userIdentifier.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.UserIdentifierOrBuilder
        public String getAddress() {
            Object obj = this.address_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.address_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.UserIdentifierOrBuilder
        public ByteString getAddressBytes() {
            Object obj = this.address_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.address_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UserIdentifier> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getUserId()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += GeneratedMessageV3.computeStringSize(2, this.address_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.UserIdentifierOrBuilder
        public GDIDataTypes.UUID getUserId() {
            GDIDataTypes.UUID uuid = this.userId_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.UserIdentifierOrBuilder
        public GDIDataTypes.UUIDOrBuilder getUserIdOrBuilder() {
            GDIDataTypes.UUID uuid = this.userId_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.UserIdentifierOrBuilder
        public boolean hasAddress() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachChatEvents.UserIdentifierOrBuilder
        public boolean hasUserId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUserId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getUserId().hashCode();
            }
            if (hasAddress()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getAddress().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_UserIdentifier_fieldAccessorTable.ensureFieldAccessorsInitialized(UserIdentifier.class, Builder.class);
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
            if (!hasUserId() || getUserId().isInitialized()) {
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
            return new UserIdentifier();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getUserId());
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.address_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UserIdentifierOrBuilder {
            private Object address_;
            private int bitField0_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> userIdBuilder_;
            private GDIDataTypes.UUID userId_;

            private Builder() {
                this.address_ = "";
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(UserIdentifier userIdentifier) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.userIdBuilder_;
                    userIdentifier.userId_ = singleFieldBuilderV3 == null ? this.userId_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    userIdentifier.address_ = this.address_;
                    i14 |= 2;
                }
                userIdentifier.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_UserIdentifier_descriptor;
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getUserIdFieldBuilder() {
                if (this.userIdBuilder_ == null) {
                    this.userIdBuilder_ = new SingleFieldBuilderV3<>(getUserId(), getParentForChildren(), isClean());
                    this.userId_ = null;
                }
                return this.userIdBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getUserIdFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UserIdentifier build() {
                UserIdentifier userIdentifierBuildPartial = buildPartial();
                if (userIdentifierBuildPartial.isInitialized()) {
                    return userIdentifierBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) userIdentifierBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UserIdentifier buildPartial() {
                UserIdentifier userIdentifier = new UserIdentifier(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(userIdentifier);
                }
                onBuilt();
                return userIdentifier;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.userId_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.userIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.userIdBuilder_ = null;
                }
                this.address_ = "";
                return this;
            }

            public Builder clearAddress() {
                this.address_ = UserIdentifier.getDefaultInstance().getAddress();
                this.bitField0_ &= -3;
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

            public Builder clearUserId() {
                this.bitField0_ &= -2;
                this.userId_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.userIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.userIdBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.UserIdentifierOrBuilder
            public String getAddress() {
                Object obj = this.address_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.address_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.UserIdentifierOrBuilder
            public ByteString getAddressBytes() {
                Object obj = this.address_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.address_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_UserIdentifier_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.UserIdentifierOrBuilder
            public GDIDataTypes.UUID getUserId() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.userIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.userId_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getUserIdBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getUserIdFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.UserIdentifierOrBuilder
            public GDIDataTypes.UUIDOrBuilder getUserIdOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.userIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.userId_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.UserIdentifierOrBuilder
            public boolean hasAddress() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachChatEvents.UserIdentifierOrBuilder
            public boolean hasUserId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachChatEvents.internal_static_GDI_Proto_InReachChatEvents_UserIdentifier_fieldAccessorTable.ensureFieldAccessorsInitialized(UserIdentifier.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasUserId() || getUserId().isInitialized();
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
                                    codedInputStream.readMessage(getUserIdFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.address_ = codedInputStream.readBytes();
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

            public Builder mergeUserId(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.userIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 1) == 0 || (uuid2 = this.userId_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.userId_ = uuid;
                } else {
                    getUserIdBuilder().mergeFrom(uuid);
                }
                if (this.userId_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder setAddress(String str) {
                str.getClass();
                this.address_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setAddressBytes(ByteString byteString) {
                byteString.getClass();
                this.address_ = byteString;
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

            public Builder setUserId(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.userIdBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.userId_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public UserIdentifier getDefaultInstanceForType() {
                return UserIdentifier.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.address_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder setUserId(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.userIdBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.userId_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UserIdentifier) {
                    return mergeFrom((UserIdentifier) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UserIdentifier userIdentifier) {
                if (userIdentifier == UserIdentifier.getDefaultInstance()) {
                    return this;
                }
                if (userIdentifier.hasUserId()) {
                    mergeUserId(userIdentifier.getUserId());
                }
                if (userIdentifier.hasAddress()) {
                    this.address_ = userIdentifier.address_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(userIdentifier.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UserIdentifier getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UserIdentifier parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserIdentifier) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UserIdentifier parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UserIdentifier parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserIdentifier parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UserIdentifier parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private UserIdentifier(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.address_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UserIdentifier parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UserIdentifier parseFrom(InputStream inputStream) {
            return (UserIdentifier) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ UserIdentifier(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UserIdentifier parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserIdentifier) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UserIdentifier parseFrom(CodedInputStream codedInputStream) {
            return (UserIdentifier) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UserIdentifier parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserIdentifier) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
