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

/* JADX INFO: loaded from: classes5.dex */
public final class GDIInReachCalls {
    public static final int CONFIG_EXT_FIELD_NUMBER = 105;
    public static final int ITEM_EXT_FIELD_NUMBER = 105;
    public static final int ITEM_REF_EXT_FIELD_NUMBER = 105;
    public static final int STATUS_EXT_FIELD_NUMBER = 105;
    public static final GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.DataTypeConfig, DataTypeConfigExt> configExt;
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachCalls_CallUpdatedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachCalls_CallUpdatedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachCalls_Call_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachCalls_Call_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachCalls_DataTypeConfigExt_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachCalls_DataTypeConfigExt_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachCalls_DataTypeStatusExt_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachCalls_DataTypeStatusExt_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachCalls_DeleteCallRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachCalls_DeleteCallRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachCalls_DeleteCallResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachCalls_DeleteCallResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachCalls_GenericItemExt_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachCalls_GenericItemExt_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachCalls_GenericItemReferenceExt_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachCalls_GenericItemReferenceExt_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachCalls_InReachCallsService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachCalls_InReachCallsService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachCalls_SubscribeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachCalls_SubscribeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachCalls_SubscribeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachCalls_SubscribeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachCalls_SyncRequestInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachCalls_SyncRequestInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachCalls_SyncRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachCalls_SyncRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachCalls_SyncResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachCalls_SyncResponse_fieldAccessorTable;
    public static final GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.GenericItem, GenericItemExt> itemExt;
    public static final GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.GenericItemReference, GenericItemReferenceExt> itemRefExt;
    public static final GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.DataTypeStatus, DataTypeStatusExt> statusExt;

    public interface CallOrBuilder extends MessageOrBuilder {
        long getCallTime();

        Call.Category getCategory();

        int getDuration();

        String getFromDeviceId();

        ByteString getFromDeviceIdBytes();

        String getPhoneNumber();

        ByteString getPhoneNumberBytes();

        String getSipAddress();

        ByteString getSipAddressBytes();

        String getSipCallId();

        ByteString getSipCallIdBytes();

        Call.Source getSource();

        Call.State getState();

        String getToDeviceId();

        ByteString getToDeviceIdBytes();

        long getUpdatedTime();

        boolean hasCallTime();

        boolean hasCategory();

        boolean hasDuration();

        boolean hasFromDeviceId();

        boolean hasPhoneNumber();

        boolean hasSipAddress();

        boolean hasSipCallId();

        boolean hasSource();

        boolean hasState();

        boolean hasToDeviceId();

        boolean hasUpdatedTime();
    }

    public interface CallUpdatedNotificationOrBuilder extends MessageOrBuilder {
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

    public interface DeleteCallRequestOrBuilder extends MessageOrBuilder {
        String getSipCallId();

        ByteString getSipCallIdBytes();

        boolean hasSipCallId();
    }

    public interface DeleteCallResponseOrBuilder extends MessageOrBuilder {
        DeleteCallResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface GenericItemExtOrBuilder extends MessageOrBuilder {
        Call getCall();

        CallOrBuilder getCallOrBuilder();

        boolean hasCall();
    }

    public interface GenericItemReferenceExtOrBuilder extends MessageOrBuilder {
        String getSipCallId();

        ByteString getSipCallIdBytes();

        long getUpdatedTime();

        boolean hasSipCallId();

        boolean hasUpdatedTime();
    }

    public interface InReachCallsServiceOrBuilder extends MessageOrBuilder {
        CallUpdatedNotification getCallUpdatedNotification();

        CallUpdatedNotificationOrBuilder getCallUpdatedNotificationOrBuilder();

        DeleteCallRequest getDeleteCallRequest();

        DeleteCallRequestOrBuilder getDeleteCallRequestOrBuilder();

        DeleteCallResponse getDeleteCallResponse();

        DeleteCallResponseOrBuilder getDeleteCallResponseOrBuilder();

        SubscribeRequest getSubscribeRequest();

        SubscribeRequestOrBuilder getSubscribeRequestOrBuilder();

        SubscribeResponse getSubscribeResponse();

        SubscribeResponseOrBuilder getSubscribeResponseOrBuilder();

        SyncRequest getSyncRequest();

        SyncRequestOrBuilder getSyncRequestOrBuilder();

        SyncResponse getSyncResponse();

        SyncResponseOrBuilder getSyncResponseOrBuilder();

        boolean hasCallUpdatedNotification();

        boolean hasDeleteCallRequest();

        boolean hasDeleteCallResponse();

        boolean hasSubscribeRequest();

        boolean hasSubscribeResponse();

        boolean hasSyncRequest();

        boolean hasSyncResponse();
    }

    public interface SubscribeRequestOrBuilder extends MessageOrBuilder {
        boolean getWantCallUpdated();

        boolean hasWantCallUpdated();
    }

    public interface SubscribeResponseOrBuilder extends MessageOrBuilder {
        SubscribeResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface SyncRequestInfoOrBuilder extends MessageOrBuilder {
        GDIDataTypes.UUID getAppUuid();

        GDIDataTypes.UUIDOrBuilder getAppUuidOrBuilder();

        int getProtocolVersion();

        SyncRequestInfo.SyncType getSyncType();

        boolean hasAppUuid();

        boolean hasProtocolVersion();

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

    static {
        GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.DataTypeConfig, DataTypeConfigExt> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(DataTypeConfigExt.class, DataTypeConfigExt.getDefaultInstance());
        configExt = generatedExtensionNewFileScopedGeneratedExtension;
        GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.DataTypeStatus, DataTypeStatusExt> generatedExtensionNewFileScopedGeneratedExtension2 = GeneratedMessage.newFileScopedGeneratedExtension(DataTypeStatusExt.class, DataTypeStatusExt.getDefaultInstance());
        statusExt = generatedExtensionNewFileScopedGeneratedExtension2;
        GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.GenericItemReference, GenericItemReferenceExt> generatedExtensionNewFileScopedGeneratedExtension3 = GeneratedMessage.newFileScopedGeneratedExtension(GenericItemReferenceExt.class, GenericItemReferenceExt.getDefaultInstance());
        itemRefExt = generatedExtensionNewFileScopedGeneratedExtension3;
        GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.GenericItem, GenericItemExt> generatedExtensionNewFileScopedGeneratedExtension4 = GeneratedMessage.newFileScopedGeneratedExtension(GenericItemExt.class, GenericItemExt.getDefaultInstance());
        itemExt = generatedExtensionNewFileScopedGeneratedExtension4;
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0015GDIInReachCalls.proto\u0012\u0016GDI.Proto.InReachCalls\u001a\u0012GDIDataTypes.proto\u001a\u001cGDIGenericItemTransfer.proto\"ÿ\u0003\n\u0013InReachCallsService\u00129\n\fsync_request\u0018\u0001 \u0001(\u000b2#.GDI.Proto.InReachCalls.SyncRequest\u0012;\n\rsync_response\u0018\u0002 \u0001(\u000b2$.GDI.Proto.InReachCalls.SyncResponse\u0012C\n\u0011subscribe_request\u0018\u0003 \u0001(\u000b2(.GDI.Proto.InReachCalls.SubscribeRequest\u0012E\n\u0012subscribe_response\u0018\u0004 \u0001(\u000b2).GDI.Proto.InReachCalls.SubscribeResponse\u0012F\n\u0013delete_call_request\u0018\u0005 \u0001(\u000b2).GDI.Proto.InReachCalls.DeleteCallRequest\u0012H\n\u0014delete_call_response\u0018\u0006 \u0001(\u000b2*.GDI.Proto.InReachCalls.DeleteCallResponse\u0012R\n\u0019call_updated_notification\u0018\u0007 \u0001(\u000b2/.GDI.Proto.InReachCalls.CallUpdatedNotification\"\u009f\u0004\n\u0004Call\u0012\u0013\n\u000bsip_call_id\u0018\u0001 \u0001(\t\u00123\n\u0006source\u0018\u0002 \u0001(\u000e2#.GDI.Proto.InReachCalls.Call.Source\u00127\n\bcategory\u0018\u0003 \u0001(\u000e2%.GDI.Proto.InReachCalls.Call.Category\u0012\u0013\n\u000bsip_address\u0018\u0004 \u0001(\t\u0012\u0014\n\fphone_number\u0018\u0005 \u0001(\t\u0012\u0016\n\u000efrom_device_id\u0018\u0006 \u0001(\t\u0012\u0014\n\fto_device_id\u0018\u0007 \u0001(\t\u0012\u0011\n\tcall_time\u0018\b \u0001(\u0004\u0012\u0014\n\fupdated_time\u0018\t \u0001(\u0004\u0012\u0010\n\bduration\u0018\n \u0001(\r\u00121\n\u0005state\u0018\u000b \u0001(\u000e2\".GDI.Proto.InReachCalls.Call.State\"0\n\u0006Source\u0012\u0012\n\u000eUNKNOWN_SOURCE\u0010\u0000\u0012\t\n\u0005LOCAL\u0010\u0001\u0012\u0007\n\u0003WEB\u0010\u0002\"<\n\bCategory\u0012\u0014\n\u0010UNKNOWN_CATEGORY\u0010\u0000\u0012\f\n\bINCOMING\u0010\u0001\u0012\f\n\bOUTGOING\u0010\u0002\"]\n\u0005State\u0012\u0011\n\rUNKNOWN_STATE\u0010\u0000\u0012\r\n\tCANCELLED\u0010\u0001\u0012\f\n\bREJECTED\u0010\u0002\u0012\r\n\tCOMPLETED\u0010\u0003\u0012\n\n\u0006MISSED\u0010\u0004\u0012\t\n\u0005ERROR\u0010\u0005\"á\u0001\n\u000fSyncRequestInfo\u0012\u001b\n\u0010protocol_version\u0018\u0001 \u0001(\r:\u00011\u0012+\n\bapp_uuid\u0018\u0002 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\u0012P\n\tsync_type\u0018\u0003 \u0001(\u000e20.GDI.Proto.InReachCalls.SyncRequestInfo.SyncType:\u000bINCREMENTAL\"2\n\bSyncType\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\b\n\u0004FULL\u0010\u0001\u0012\u000f\n\u000bINCREMENTAL\u0010\u0002\"L\n\u000bSyncRequest\u0012=\n\frequest_info\u0018\u0001 \u0001(\u000b2'.GDI.Proto.InReachCalls.SyncRequestInfo\"Ë\u0001\n\fSyncResponse\u0012;\n\u0006status\u0018\u0001 \u0002(\u000e2+.GDI.Proto.InReachCalls.SyncResponse.Status\"~\n\u0006Status\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0011\n\rGENERIC_ERROR\u0010\u0002\u0012\b\n\u0004BUSY\u0010\u0003\u0012 \n\u001cUNSUPPORTED_PROTOCOL_VERSION\u0010\u0004\u0012\u0010\n\fMISSING_INFO\u0010\u0005\u0012\u000e\n\nUP_TO_DATE\u0010\u0006\"(\n\u0011DeleteCallRequest\u0012\u0013\n\u000bsip_call_id\u0018\u0001 \u0001(\t\"\u009d\u0001\n\u0012DeleteCallResponse\u0012A\n\u0006status\u0018\u0001 \u0002(\u000e21.GDI.Proto.InReachCalls.DeleteCallResponse.Status\"D\n\u0006Status\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0011\n\rGENERIC_ERROR\u0010\u0002\u0012\u0012\n\u000eCALL_NOT_FOUND\u0010\u0003\"4\n\u0010SubscribeRequest\u0012 \n\u0011want_call_updated\u0018\u0001 \u0001(\b:\u0005false\"\u008e\u0001\n\u0011SubscribeResponse\u0012@\n\u0006status\u0018\u0001 \u0002(\u000e20.GDI.Proto.InReachCalls.SubscribeResponse.Status\"7\n\u0006Status\u0012\u0012\n\u000eUNKNOWN_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0011\n\rGENERIC_ERROR\u0010\u0002\"/\n\u0017CallUpdatedNotification\u0012\u0014\n\fupdated_time\u0018\u0001 \u0001(\u0004\"\u0080\u0001\n\u0011DataTypeConfigExt\u0012=\n\frequest_info\u0018\u0001 \u0001(\u000b2'.GDI.Proto.InReachCalls.SyncRequestInfo\u0012\u0014\n\fupdated_time\u0018\u0002 \u0001(\u0004\u0012\u0016\n\u000emax_item_count\u0018\u0003 \u0001(\r\"¥\u0001\n\u0011DataTypeStatusExt\u0012@\n\u0006status\u0018\u0001 \u0001(\u000e20.GDI.Proto.InReachCalls.DataTypeStatusExt.Status\"N\n\u0006Status\u0012\u0012\n\u000eUNKNOWN_STATUS\u0010\u0000\u0012 \n\u001cUNSUPPORTED_PROTOCOL_VERSION\u0010\u0001\u0012\u000e\n\nUP_TO_DATE\u0010\u0002\"D\n\u0017GenericItemReferenceExt\u0012\u0013\n\u000bsip_call_id\u0018\u0001 \u0001(\t\u0012\u0014\n\fupdated_time\u0018\u0002 \u0001(\u0004\"<\n\u000eGenericItemExt\u0012*\n\u0004call\u0018\u0001 \u0001(\u000b2\u001c.GDI.Proto.InReachCalls.Call:l\n\nconfig_ext\u0012-.GDI.Proto.GenericItemTransfer.DataTypeConfig\u0018i \u0001(\u000b2).GDI.Proto.InReachCalls.DataTypeConfigExt:l\n\nstatus_ext\u0012-.GDI.Proto.GenericItemTransfer.DataTypeStatus\u0018i \u0001(\u000b2).GDI.Proto.InReachCalls.DataTypeStatusExt:z\n\fitem_ref_ext\u00123.GDI.Proto.GenericItemTransfer.GenericItemReference\u0018i \u0001(\u000b2/.GDI.Proto.InReachCalls.GenericItemReferenceExt:d\n\bitem_ext\u0012*.GDI.Proto.GenericItemTransfer.GenericItem\u0018i \u0001(\u000b2&.GDI.Proto.InReachCalls.GenericItemExtB/\n\u001acom.garmin.proto.generatedB\u000fGDIInReachCallsH\u0003"}, new Descriptors.FileDescriptor[]{GDIDataTypes.getDescriptor(), GDIGenericItemTransferProto.getDescriptor()});
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_InReachCalls_InReachCallsService_descriptor = descriptor2;
        internal_static_GDI_Proto_InReachCalls_InReachCallsService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"SyncRequest", "SyncResponse", "SubscribeRequest", "SubscribeResponse", "DeleteCallRequest", "DeleteCallResponse", "CallUpdatedNotification"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_InReachCalls_Call_descriptor = descriptor3;
        internal_static_GDI_Proto_InReachCalls_Call_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"SipCallId", "Source", "Category", "SipAddress", "PhoneNumber", "FromDeviceId", "ToDeviceId", "CallTime", "UpdatedTime", "Duration", "State"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_InReachCalls_SyncRequestInfo_descriptor = descriptor4;
        internal_static_GDI_Proto_InReachCalls_SyncRequestInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"ProtocolVersion", "AppUuid", "SyncType"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_InReachCalls_SyncRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_InReachCalls_SyncRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"RequestInfo"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_InReachCalls_SyncResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_InReachCalls_SyncResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Status"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_InReachCalls_DeleteCallRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_InReachCalls_DeleteCallRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"SipCallId"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_InReachCalls_DeleteCallResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_InReachCalls_DeleteCallResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Status"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_InReachCalls_SubscribeRequest_descriptor = descriptor9;
        internal_static_GDI_Proto_InReachCalls_SubscribeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"WantCallUpdated"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_InReachCalls_SubscribeResponse_descriptor = descriptor10;
        internal_static_GDI_Proto_InReachCalls_SubscribeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Status"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_InReachCalls_CallUpdatedNotification_descriptor = descriptor11;
        internal_static_GDI_Proto_InReachCalls_CallUpdatedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"UpdatedTime"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_InReachCalls_DataTypeConfigExt_descriptor = descriptor12;
        internal_static_GDI_Proto_InReachCalls_DataTypeConfigExt_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"RequestInfo", "UpdatedTime", "MaxItemCount"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_InReachCalls_DataTypeStatusExt_descriptor = descriptor13;
        internal_static_GDI_Proto_InReachCalls_DataTypeStatusExt_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Status"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_GDI_Proto_InReachCalls_GenericItemReferenceExt_descriptor = descriptor14;
        internal_static_GDI_Proto_InReachCalls_GenericItemReferenceExt_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"SipCallId", "UpdatedTime"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(13);
        internal_static_GDI_Proto_InReachCalls_GenericItemExt_descriptor = descriptor15;
        internal_static_GDI_Proto_InReachCalls_GenericItemExt_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Call"});
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(descriptor.getExtensions().get(0));
        generatedExtensionNewFileScopedGeneratedExtension2.internalInit(descriptor.getExtensions().get(1));
        generatedExtensionNewFileScopedGeneratedExtension3.internalInit(descriptor.getExtensions().get(2));
        generatedExtensionNewFileScopedGeneratedExtension4.internalInit(descriptor.getExtensions().get(3));
        GDIDataTypes.getDescriptor();
        GDIGenericItemTransferProto.getDescriptor();
    }

    private GDIInReachCalls() {
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

    public static final class CallUpdatedNotification extends GeneratedMessageV3 implements CallUpdatedNotificationOrBuilder {
        private static final CallUpdatedNotification DEFAULT_INSTANCE = new CallUpdatedNotification();

        @Deprecated
        public static final Parser<CallUpdatedNotification> PARSER = new AbstractParser<CallUpdatedNotification>() { // from class: com.garmin.proto.generated.GDIInReachCalls.CallUpdatedNotification.1
            @Override // com.google.protobuf.Parser
            public CallUpdatedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CallUpdatedNotification.newBuilder();
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

        private CallUpdatedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.updatedTime_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CallUpdatedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_CallUpdatedNotification_descriptor;
        }

        public static Builder newBuilder(CallUpdatedNotification callUpdatedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(callUpdatedNotification);
        }

        public static CallUpdatedNotification parseDelimitedFrom(InputStream inputStream) {
            return (CallUpdatedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CallUpdatedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CallUpdatedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CallUpdatedNotification)) {
                return super.equals(obj);
            }
            CallUpdatedNotification callUpdatedNotification = (CallUpdatedNotification) obj;
            if (hasUpdatedTime() != callUpdatedNotification.hasUpdatedTime()) {
                return false;
            }
            return (!hasUpdatedTime() || getUpdatedTime() == callUpdatedNotification.getUpdatedTime()) && getUnknownFields().equals(callUpdatedNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CallUpdatedNotification> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallUpdatedNotificationOrBuilder
        public long getUpdatedTime() {
            return this.updatedTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallUpdatedNotificationOrBuilder
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
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_CallUpdatedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(CallUpdatedNotification.class, Builder.class);
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
            return new CallUpdatedNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CallUpdatedNotificationOrBuilder {
            private int bitField0_;
            private long updatedTime_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(CallUpdatedNotification callUpdatedNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    callUpdatedNotification.updatedTime_ = this.updatedTime_;
                } else {
                    i14 = 0;
                }
                callUpdatedNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_CallUpdatedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CallUpdatedNotification build() {
                CallUpdatedNotification callUpdatedNotificationBuildPartial = buildPartial();
                if (callUpdatedNotificationBuildPartial.isInitialized()) {
                    return callUpdatedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) callUpdatedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CallUpdatedNotification buildPartial() {
                CallUpdatedNotification callUpdatedNotification = new CallUpdatedNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(callUpdatedNotification);
                }
                onBuilt();
                return callUpdatedNotification;
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
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_CallUpdatedNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallUpdatedNotificationOrBuilder
            public long getUpdatedTime() {
                return this.updatedTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallUpdatedNotificationOrBuilder
            public boolean hasUpdatedTime() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_CallUpdatedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(CallUpdatedNotification.class, Builder.class);
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
            public CallUpdatedNotification getDefaultInstanceForType() {
                return CallUpdatedNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CallUpdatedNotification) {
                    return mergeFrom((CallUpdatedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CallUpdatedNotification callUpdatedNotification) {
                if (callUpdatedNotification == CallUpdatedNotification.getDefaultInstance()) {
                    return this;
                }
                if (callUpdatedNotification.hasUpdatedTime()) {
                    setUpdatedTime(callUpdatedNotification.getUpdatedTime());
                }
                mergeUnknownFields(callUpdatedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CallUpdatedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CallUpdatedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CallUpdatedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CallUpdatedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CallUpdatedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ CallUpdatedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CallUpdatedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private CallUpdatedNotification() {
            this.updatedTime_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CallUpdatedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CallUpdatedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CallUpdatedNotification parseFrom(InputStream inputStream) {
            return (CallUpdatedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CallUpdatedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CallUpdatedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CallUpdatedNotification parseFrom(CodedInputStream codedInputStream) {
            return (CallUpdatedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CallUpdatedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CallUpdatedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SubscribeRequest extends GeneratedMessageV3 implements SubscribeRequestOrBuilder {
        private static final SubscribeRequest DEFAULT_INSTANCE = new SubscribeRequest();

        @Deprecated
        public static final Parser<SubscribeRequest> PARSER = new AbstractParser<SubscribeRequest>() { // from class: com.garmin.proto.generated.GDIInReachCalls.SubscribeRequest.1
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
        public static final int WANT_CALL_UPDATED_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private boolean wantCallUpdated_;

        private SubscribeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.wantCallUpdated_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SubscribeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SubscribeRequest_descriptor;
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
            if (hasWantCallUpdated() != subscribeRequest.hasWantCallUpdated()) {
                return false;
            }
            return (!hasWantCallUpdated() || getWantCallUpdated() == subscribeRequest.getWantCallUpdated()) && getUnknownFields().equals(subscribeRequest.getUnknownFields());
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.wantCallUpdated_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.SubscribeRequestOrBuilder
        public boolean getWantCallUpdated() {
            return this.wantCallUpdated_;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.SubscribeRequestOrBuilder
        public boolean hasWantCallUpdated() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasWantCallUpdated()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getWantCallUpdated());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SubscribeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SubscribeRequest.class, Builder.class);
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
                codedOutputStream.writeBool(1, this.wantCallUpdated_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SubscribeRequestOrBuilder {
            private int bitField0_;
            private boolean wantCallUpdated_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(SubscribeRequest subscribeRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    subscribeRequest.wantCallUpdated_ = this.wantCallUpdated_;
                } else {
                    i14 = 0;
                }
                subscribeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SubscribeRequest_descriptor;
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
                this.wantCallUpdated_ = false;
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

            public Builder clearWantCallUpdated() {
                this.bitField0_ &= -2;
                this.wantCallUpdated_ = false;
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
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SubscribeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.SubscribeRequestOrBuilder
            public boolean getWantCallUpdated() {
                return this.wantCallUpdated_;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.SubscribeRequestOrBuilder
            public boolean hasWantCallUpdated() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SubscribeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SubscribeRequest.class, Builder.class);
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
                                    this.wantCallUpdated_ = codedInputStream.readBool();
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

            public Builder setWantCallUpdated(boolean z14) {
                this.wantCallUpdated_ = z14;
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
                if (subscribeRequest.hasWantCallUpdated()) {
                    setWantCallUpdated(subscribeRequest.getWantCallUpdated());
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
            this.wantCallUpdated_ = false;
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

    public static final class Call extends GeneratedMessageV3 implements CallOrBuilder {
        public static final int CALL_TIME_FIELD_NUMBER = 8;
        public static final int CATEGORY_FIELD_NUMBER = 3;
        public static final int DURATION_FIELD_NUMBER = 10;
        public static final int FROM_DEVICE_ID_FIELD_NUMBER = 6;
        public static final int PHONE_NUMBER_FIELD_NUMBER = 5;
        public static final int SIP_ADDRESS_FIELD_NUMBER = 4;
        public static final int SIP_CALL_ID_FIELD_NUMBER = 1;
        public static final int SOURCE_FIELD_NUMBER = 2;
        public static final int STATE_FIELD_NUMBER = 11;
        public static final int TO_DEVICE_ID_FIELD_NUMBER = 7;
        public static final int UPDATED_TIME_FIELD_NUMBER = 9;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long callTime_;
        private int category_;
        private int duration_;
        private volatile Object fromDeviceId_;
        private byte memoizedIsInitialized;
        private volatile Object phoneNumber_;
        private volatile Object sipAddress_;
        private volatile Object sipCallId_;
        private int source_;
        private int state_;
        private volatile Object toDeviceId_;
        private long updatedTime_;
        private static final Call DEFAULT_INSTANCE = new Call();

        @Deprecated
        public static final Parser<Call> PARSER = new AbstractParser<Call>() { // from class: com.garmin.proto.generated.GDIInReachCalls.Call.1
            @Override // com.google.protobuf.Parser
            public Call parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Call.newBuilder();
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

        private Call() {
            this.sipCallId_ = "";
            this.source_ = 0;
            this.category_ = 0;
            this.sipAddress_ = "";
            this.phoneNumber_ = "";
            this.fromDeviceId_ = "";
            this.toDeviceId_ = "";
            this.callTime_ = 0L;
            this.updatedTime_ = 0L;
            this.duration_ = 0;
            this.state_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.sipCallId_ = "";
            this.source_ = 0;
            this.category_ = 0;
            this.sipAddress_ = "";
            this.phoneNumber_ = "";
            this.fromDeviceId_ = "";
            this.toDeviceId_ = "";
            this.state_ = 0;
        }

        public static Call getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_Call_descriptor;
        }

        public static Builder newBuilder(Call call) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(call);
        }

        public static Call parseDelimitedFrom(InputStream inputStream) {
            return (Call) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Call parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Call> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Call)) {
                return super.equals(obj);
            }
            Call call = (Call) obj;
            if (hasSipCallId() != call.hasSipCallId()) {
                return false;
            }
            if ((hasSipCallId() && !getSipCallId().equals(call.getSipCallId())) || hasSource() != call.hasSource()) {
                return false;
            }
            if ((hasSource() && this.source_ != call.source_) || hasCategory() != call.hasCategory()) {
                return false;
            }
            if ((hasCategory() && this.category_ != call.category_) || hasSipAddress() != call.hasSipAddress()) {
                return false;
            }
            if ((hasSipAddress() && !getSipAddress().equals(call.getSipAddress())) || hasPhoneNumber() != call.hasPhoneNumber()) {
                return false;
            }
            if ((hasPhoneNumber() && !getPhoneNumber().equals(call.getPhoneNumber())) || hasFromDeviceId() != call.hasFromDeviceId()) {
                return false;
            }
            if ((hasFromDeviceId() && !getFromDeviceId().equals(call.getFromDeviceId())) || hasToDeviceId() != call.hasToDeviceId()) {
                return false;
            }
            if ((hasToDeviceId() && !getToDeviceId().equals(call.getToDeviceId())) || hasCallTime() != call.hasCallTime()) {
                return false;
            }
            if ((hasCallTime() && getCallTime() != call.getCallTime()) || hasUpdatedTime() != call.hasUpdatedTime()) {
                return false;
            }
            if ((hasUpdatedTime() && getUpdatedTime() != call.getUpdatedTime()) || hasDuration() != call.hasDuration()) {
                return false;
            }
            if ((!hasDuration() || getDuration() == call.getDuration()) && hasState() == call.hasState()) {
                return (!hasState() || this.state_ == call.state_) && getUnknownFields().equals(call.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public long getCallTime() {
            return this.callTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public Category getCategory() {
            Category categoryForNumber = Category.forNumber(this.category_);
            return categoryForNumber == null ? Category.UNKNOWN_CATEGORY : categoryForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public int getDuration() {
            return this.duration_;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public String getFromDeviceId() {
            Object obj = this.fromDeviceId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.fromDeviceId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public ByteString getFromDeviceIdBytes() {
            Object obj = this.fromDeviceId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fromDeviceId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Call> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public String getPhoneNumber() {
            Object obj = this.phoneNumber_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.phoneNumber_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public ByteString getPhoneNumberBytes() {
            Object obj = this.phoneNumber_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.phoneNumber_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.sipCallId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.source_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(3, this.category_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.sipAddress_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.phoneNumber_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.fromDeviceId_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(7, this.toDeviceId_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt64Size(8, this.callTime_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt64Size(9, this.updatedTime_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(10, this.duration_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(11, this.state_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public String getSipAddress() {
            Object obj = this.sipAddress_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.sipAddress_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public ByteString getSipAddressBytes() {
            Object obj = this.sipAddress_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sipAddress_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public String getSipCallId() {
            Object obj = this.sipCallId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.sipCallId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public ByteString getSipCallIdBytes() {
            Object obj = this.sipCallId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sipCallId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public Source getSource() {
            Source sourceForNumber = Source.forNumber(this.source_);
            return sourceForNumber == null ? Source.UNKNOWN_SOURCE : sourceForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public State getState() {
            State stateForNumber = State.forNumber(this.state_);
            return stateForNumber == null ? State.UNKNOWN_STATE : stateForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public String getToDeviceId() {
            Object obj = this.toDeviceId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.toDeviceId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public ByteString getToDeviceIdBytes() {
            Object obj = this.toDeviceId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.toDeviceId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public long getUpdatedTime() {
            return this.updatedTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public boolean hasCallTime() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public boolean hasCategory() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public boolean hasDuration() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public boolean hasFromDeviceId() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public boolean hasPhoneNumber() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public boolean hasSipAddress() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public boolean hasSipCallId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public boolean hasSource() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public boolean hasState() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public boolean hasToDeviceId() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
        public boolean hasUpdatedTime() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSipCallId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSipCallId().hashCode();
            }
            if (hasSource()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.source_;
            }
            if (hasCategory()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.category_;
            }
            if (hasSipAddress()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getSipAddress().hashCode();
            }
            if (hasPhoneNumber()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getPhoneNumber().hashCode();
            }
            if (hasFromDeviceId()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getFromDeviceId().hashCode();
            }
            if (hasToDeviceId()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getToDeviceId().hashCode();
            }
            if (hasCallTime()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + Internal.hashLong(getCallTime());
            }
            if (hasUpdatedTime()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + Internal.hashLong(getUpdatedTime());
            }
            if (hasDuration()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getDuration();
            }
            if (hasState()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + this.state_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_Call_fieldAccessorTable.ensureFieldAccessorsInitialized(Call.class, Builder.class);
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
            return new Call();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.sipCallId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.source_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.category_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.sipAddress_);
            }
            if ((this.bitField0_ & 16) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.phoneNumber_);
            }
            if ((this.bitField0_ & 32) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.fromDeviceId_);
            }
            if ((this.bitField0_ & 64) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.toDeviceId_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeUInt64(8, this.callTime_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeUInt64(9, this.updatedTime_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeUInt32(10, this.duration_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeEnum(11, this.state_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CallOrBuilder {
            private int bitField0_;
            private long callTime_;
            private int category_;
            private int duration_;
            private Object fromDeviceId_;
            private Object phoneNumber_;
            private Object sipAddress_;
            private Object sipCallId_;
            private int source_;
            private int state_;
            private Object toDeviceId_;
            private long updatedTime_;

            private Builder() {
                this.sipCallId_ = "";
                this.source_ = 0;
                this.category_ = 0;
                this.sipAddress_ = "";
                this.phoneNumber_ = "";
                this.fromDeviceId_ = "";
                this.toDeviceId_ = "";
                this.state_ = 0;
            }

            private void buildPartial0(Call call) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    call.sipCallId_ = this.sipCallId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    call.source_ = this.source_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    call.category_ = this.category_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    call.sipAddress_ = this.sipAddress_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    call.phoneNumber_ = this.phoneNumber_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    call.fromDeviceId_ = this.fromDeviceId_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    call.toDeviceId_ = this.toDeviceId_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    call.callTime_ = this.callTime_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    call.updatedTime_ = this.updatedTime_;
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    call.duration_ = this.duration_;
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    call.state_ = this.state_;
                    i14 |= 1024;
                }
                call.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_Call_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Call build() {
                Call callBuildPartial = buildPartial();
                if (callBuildPartial.isInitialized()) {
                    return callBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) callBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Call buildPartial() {
                Call call = new Call(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(call);
                }
                onBuilt();
                return call;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sipCallId_ = "";
                this.source_ = 0;
                this.category_ = 0;
                this.sipAddress_ = "";
                this.phoneNumber_ = "";
                this.fromDeviceId_ = "";
                this.toDeviceId_ = "";
                this.callTime_ = 0L;
                this.updatedTime_ = 0L;
                this.duration_ = 0;
                this.state_ = 0;
                return this;
            }

            public Builder clearCallTime() {
                this.bitField0_ &= -129;
                this.callTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearCategory() {
                this.bitField0_ &= -5;
                this.category_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDuration() {
                this.bitField0_ &= -513;
                this.duration_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFromDeviceId() {
                this.fromDeviceId_ = Call.getDefaultInstance().getFromDeviceId();
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPhoneNumber() {
                this.phoneNumber_ = Call.getDefaultInstance().getPhoneNumber();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearSipAddress() {
                this.sipAddress_ = Call.getDefaultInstance().getSipAddress();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearSipCallId() {
                this.sipCallId_ = Call.getDefaultInstance().getSipCallId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearSource() {
                this.bitField0_ &= -3;
                this.source_ = 0;
                onChanged();
                return this;
            }

            public Builder clearState() {
                this.bitField0_ &= -1025;
                this.state_ = 0;
                onChanged();
                return this;
            }

            public Builder clearToDeviceId() {
                this.toDeviceId_ = Call.getDefaultInstance().getToDeviceId();
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearUpdatedTime() {
                this.bitField0_ &= -257;
                this.updatedTime_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public long getCallTime() {
                return this.callTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public Category getCategory() {
                Category categoryForNumber = Category.forNumber(this.category_);
                return categoryForNumber == null ? Category.UNKNOWN_CATEGORY : categoryForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_Call_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public int getDuration() {
                return this.duration_;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public String getFromDeviceId() {
                Object obj = this.fromDeviceId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.fromDeviceId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public ByteString getFromDeviceIdBytes() {
                Object obj = this.fromDeviceId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fromDeviceId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public String getPhoneNumber() {
                Object obj = this.phoneNumber_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.phoneNumber_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public ByteString getPhoneNumberBytes() {
                Object obj = this.phoneNumber_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.phoneNumber_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public String getSipAddress() {
                Object obj = this.sipAddress_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.sipAddress_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public ByteString getSipAddressBytes() {
                Object obj = this.sipAddress_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sipAddress_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public String getSipCallId() {
                Object obj = this.sipCallId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.sipCallId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public ByteString getSipCallIdBytes() {
                Object obj = this.sipCallId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sipCallId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public Source getSource() {
                Source sourceForNumber = Source.forNumber(this.source_);
                return sourceForNumber == null ? Source.UNKNOWN_SOURCE : sourceForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public State getState() {
                State stateForNumber = State.forNumber(this.state_);
                return stateForNumber == null ? State.UNKNOWN_STATE : stateForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public String getToDeviceId() {
                Object obj = this.toDeviceId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.toDeviceId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public ByteString getToDeviceIdBytes() {
                Object obj = this.toDeviceId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.toDeviceId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public long getUpdatedTime() {
                return this.updatedTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public boolean hasCallTime() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public boolean hasCategory() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public boolean hasDuration() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public boolean hasFromDeviceId() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public boolean hasPhoneNumber() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public boolean hasSipAddress() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public boolean hasSipCallId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public boolean hasSource() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public boolean hasState() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public boolean hasToDeviceId() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.CallOrBuilder
            public boolean hasUpdatedTime() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_Call_fieldAccessorTable.ensureFieldAccessorsInitialized(Call.class, Builder.class);
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
                            switch (tag) {
                                case 0:
                                    break;
                                case 10:
                                    this.sipCallId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 16:
                                    int i14 = codedInputStream.readEnum();
                                    if (Source.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.source_ = i14;
                                        this.bitField0_ |= 2;
                                        continue;
                                    }
                                    break;
                                case 24:
                                    int i15 = codedInputStream.readEnum();
                                    if (Category.forNumber(i15) == null) {
                                        mergeUnknownVarintField(3, i15);
                                    } else {
                                        this.category_ = i15;
                                        this.bitField0_ |= 4;
                                        continue;
                                    }
                                    break;
                                case 34:
                                    this.sipAddress_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    this.phoneNumber_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    this.fromDeviceId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    this.toDeviceId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 64:
                                    this.callTime_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 72:
                                    this.updatedTime_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 256;
                                    continue;
                                case 80:
                                    this.duration_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 512;
                                    continue;
                                case 88:
                                    int i16 = codedInputStream.readEnum();
                                    if (State.forNumber(i16) == null) {
                                        mergeUnknownVarintField(11, i16);
                                    } else {
                                        this.state_ = i16;
                                        this.bitField0_ |= 1024;
                                        continue;
                                    }
                                    break;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setCallTime(long j8) {
                this.callTime_ = j8;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setCategory(Category category) {
                category.getClass();
                this.bitField0_ |= 4;
                this.category_ = category.getNumber();
                onChanged();
                return this;
            }

            public Builder setDuration(int i14) {
                this.duration_ = i14;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setFromDeviceId(String str) {
                str.getClass();
                this.fromDeviceId_ = str;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setFromDeviceIdBytes(ByteString byteString) {
                byteString.getClass();
                this.fromDeviceId_ = byteString;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setPhoneNumber(String str) {
                str.getClass();
                this.phoneNumber_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setPhoneNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.phoneNumber_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSipAddress(String str) {
                str.getClass();
                this.sipAddress_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSipAddressBytes(ByteString byteString) {
                byteString.getClass();
                this.sipAddress_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSipCallId(String str) {
                str.getClass();
                this.sipCallId_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSipCallIdBytes(ByteString byteString) {
                byteString.getClass();
                this.sipCallId_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSource(Source source) {
                source.getClass();
                this.bitField0_ |= 2;
                this.source_ = source.getNumber();
                onChanged();
                return this;
            }

            public Builder setState(State state) {
                state.getClass();
                this.bitField0_ |= 1024;
                this.state_ = state.getNumber();
                onChanged();
                return this;
            }

            public Builder setToDeviceId(String str) {
                str.getClass();
                this.toDeviceId_ = str;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setToDeviceIdBytes(ByteString byteString) {
                byteString.getClass();
                this.toDeviceId_ = byteString;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setUpdatedTime(long j8) {
                this.updatedTime_ = j8;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Call getDefaultInstanceForType() {
                return Call.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.sipCallId_ = "";
                this.source_ = 0;
                this.category_ = 0;
                this.sipAddress_ = "";
                this.phoneNumber_ = "";
                this.fromDeviceId_ = "";
                this.toDeviceId_ = "";
                this.state_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Call) {
                    return mergeFrom((Call) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Call call) {
                if (call == Call.getDefaultInstance()) {
                    return this;
                }
                if (call.hasSipCallId()) {
                    this.sipCallId_ = call.sipCallId_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (call.hasSource()) {
                    setSource(call.getSource());
                }
                if (call.hasCategory()) {
                    setCategory(call.getCategory());
                }
                if (call.hasSipAddress()) {
                    this.sipAddress_ = call.sipAddress_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (call.hasPhoneNumber()) {
                    this.phoneNumber_ = call.phoneNumber_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                if (call.hasFromDeviceId()) {
                    this.fromDeviceId_ = call.fromDeviceId_;
                    this.bitField0_ |= 32;
                    onChanged();
                }
                if (call.hasToDeviceId()) {
                    this.toDeviceId_ = call.toDeviceId_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                if (call.hasCallTime()) {
                    setCallTime(call.getCallTime());
                }
                if (call.hasUpdatedTime()) {
                    setUpdatedTime(call.getUpdatedTime());
                }
                if (call.hasDuration()) {
                    setDuration(call.getDuration());
                }
                if (call.hasState()) {
                    setState(call.getState());
                }
                mergeUnknownFields(call.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Call getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Call parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Call) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Call parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Call parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Call parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Call parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Call parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Call parseFrom(InputStream inputStream) {
            return (Call) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Call parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Call) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Call parseFrom(CodedInputStream codedInputStream) {
            return (Call) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Call parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Call) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Category implements ProtocolMessageEnum {
            UNKNOWN_CATEGORY(0),
            INCOMING(1),
            OUTGOING(2);

            public static final int INCOMING_VALUE = 1;
            public static final int OUTGOING_VALUE = 2;
            public static final int UNKNOWN_CATEGORY_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Category> internalValueMap = new Internal.EnumLiteMap<Category>() { // from class: com.garmin.proto.generated.GDIInReachCalls.Call.Category.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Category findValueByNumber(int i14) {
                    return Category.forNumber(i14);
                }
            };
            private static final Category[] VALUES = values();

            Category(int i14) {
                this.value = i14;
            }

            public static Category forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN_CATEGORY;
                }
                if (i14 == 1) {
                    return INCOMING;
                }
                if (i14 != 2) {
                    return null;
                }
                return OUTGOING;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Call.getDescriptor().getEnumTypes().get(1);
            }

            public static Internal.EnumLiteMap<Category> internalGetValueMap() {
                return internalValueMap;
            }

            public static Category valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Category valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum Source implements ProtocolMessageEnum {
            UNKNOWN_SOURCE(0),
            LOCAL(1),
            WEB(2);

            public static final int LOCAL_VALUE = 1;
            public static final int UNKNOWN_SOURCE_VALUE = 0;
            public static final int WEB_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<Source> internalValueMap = new Internal.EnumLiteMap<Source>() { // from class: com.garmin.proto.generated.GDIInReachCalls.Call.Source.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Source findValueByNumber(int i14) {
                    return Source.forNumber(i14);
                }
            };
            private static final Source[] VALUES = values();

            Source(int i14) {
                this.value = i14;
            }

            public static Source forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN_SOURCE;
                }
                if (i14 == 1) {
                    return LOCAL;
                }
                if (i14 != 2) {
                    return null;
                }
                return WEB;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Call.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Source> internalGetValueMap() {
                return internalValueMap;
            }

            public static Source valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Source valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum State implements ProtocolMessageEnum {
            UNKNOWN_STATE(0),
            CANCELLED(1),
            REJECTED(2),
            COMPLETED(3),
            MISSED(4),
            ERROR(5);

            public static final int CANCELLED_VALUE = 1;
            public static final int COMPLETED_VALUE = 3;
            public static final int ERROR_VALUE = 5;
            public static final int MISSED_VALUE = 4;
            public static final int REJECTED_VALUE = 2;
            public static final int UNKNOWN_STATE_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<State> internalValueMap = new Internal.EnumLiteMap<State>() { // from class: com.garmin.proto.generated.GDIInReachCalls.Call.State.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public State findValueByNumber(int i14) {
                    return State.forNumber(i14);
                }
            };
            private static final State[] VALUES = values();

            State(int i14) {
                this.value = i14;
            }

            public static State forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN_STATE;
                }
                if (i14 == 1) {
                    return CANCELLED;
                }
                if (i14 == 2) {
                    return REJECTED;
                }
                if (i14 == 3) {
                    return COMPLETED;
                }
                if (i14 == 4) {
                    return MISSED;
                }
                if (i14 != 5) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Call.getDescriptor().getEnumTypes().get(2);
            }

            public static Internal.EnumLiteMap<State> internalGetValueMap() {
                return internalValueMap;
            }

            public static State valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static State valueOf(int i14) {
                return forNumber(i14);
            }
        }

        private Call(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sipCallId_ = "";
            this.source_ = 0;
            this.category_ = 0;
            this.sipAddress_ = "";
            this.phoneNumber_ = "";
            this.fromDeviceId_ = "";
            this.toDeviceId_ = "";
            this.callTime_ = 0L;
            this.updatedTime_ = 0L;
            this.duration_ = 0;
            this.state_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ Call(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
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
        public static final Parser<DataTypeConfigExt> PARSER = new AbstractParser<DataTypeConfigExt>() { // from class: com.garmin.proto.generated.GDIInReachCalls.DataTypeConfigExt.1
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
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_DataTypeConfigExt_descriptor;
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

        @Override // com.garmin.proto.generated.GDIInReachCalls.DataTypeConfigExtOrBuilder
        public int getMaxItemCount() {
            return this.maxItemCount_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DataTypeConfigExt> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.DataTypeConfigExtOrBuilder
        public SyncRequestInfo getRequestInfo() {
            SyncRequestInfo syncRequestInfo = this.requestInfo_;
            return syncRequestInfo == null ? SyncRequestInfo.getDefaultInstance() : syncRequestInfo;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.DataTypeConfigExtOrBuilder
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

        @Override // com.garmin.proto.generated.GDIInReachCalls.DataTypeConfigExtOrBuilder
        public long getUpdatedTime() {
            return this.updatedTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.DataTypeConfigExtOrBuilder
        public boolean hasMaxItemCount() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.DataTypeConfigExtOrBuilder
        public boolean hasRequestInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.DataTypeConfigExtOrBuilder
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
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_DataTypeConfigExt_fieldAccessorTable.ensureFieldAccessorsInitialized(DataTypeConfigExt.class, Builder.class);
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
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_DataTypeConfigExt_descriptor;
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
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_DataTypeConfigExt_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.DataTypeConfigExtOrBuilder
            public int getMaxItemCount() {
                return this.maxItemCount_;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.DataTypeConfigExtOrBuilder
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

            @Override // com.garmin.proto.generated.GDIInReachCalls.DataTypeConfigExtOrBuilder
            public SyncRequestInfoOrBuilder getRequestInfoOrBuilder() {
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncRequestInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SyncRequestInfo syncRequestInfo = this.requestInfo_;
                return syncRequestInfo == null ? SyncRequestInfo.getDefaultInstance() : syncRequestInfo;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.DataTypeConfigExtOrBuilder
            public long getUpdatedTime() {
                return this.updatedTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.DataTypeConfigExtOrBuilder
            public boolean hasMaxItemCount() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.DataTypeConfigExtOrBuilder
            public boolean hasRequestInfo() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.DataTypeConfigExtOrBuilder
            public boolean hasUpdatedTime() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_DataTypeConfigExt_fieldAccessorTable.ensureFieldAccessorsInitialized(DataTypeConfigExt.class, Builder.class);
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
        public static final Parser<DataTypeStatusExt> PARSER = new AbstractParser<DataTypeStatusExt>() { // from class: com.garmin.proto.generated.GDIInReachCalls.DataTypeStatusExt.1
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
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_DataTypeStatusExt_descriptor;
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

        @Override // com.garmin.proto.generated.GDIInReachCalls.DataTypeStatusExtOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.DataTypeStatusExtOrBuilder
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
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_DataTypeStatusExt_fieldAccessorTable.ensureFieldAccessorsInitialized(DataTypeStatusExt.class, Builder.class);
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
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_DataTypeStatusExt_descriptor;
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
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_DataTypeStatusExt_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.DataTypeStatusExtOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.DataTypeStatusExtOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_DataTypeStatusExt_fieldAccessorTable.ensureFieldAccessorsInitialized(DataTypeStatusExt.class, Builder.class);
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
            UP_TO_DATE(2);

            public static final int UNKNOWN_STATUS_VALUE = 0;
            public static final int UNSUPPORTED_PROTOCOL_VERSION_VALUE = 1;
            public static final int UP_TO_DATE_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIInReachCalls.DataTypeStatusExt.Status.1
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
                if (i14 != 2) {
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

    public static final class DeleteCallRequest extends GeneratedMessageV3 implements DeleteCallRequestOrBuilder {
        private static final DeleteCallRequest DEFAULT_INSTANCE = new DeleteCallRequest();

        @Deprecated
        public static final Parser<DeleteCallRequest> PARSER = new AbstractParser<DeleteCallRequest>() { // from class: com.garmin.proto.generated.GDIInReachCalls.DeleteCallRequest.1
            @Override // com.google.protobuf.Parser
            public DeleteCallRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DeleteCallRequest.newBuilder();
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
        public static final int SIP_CALL_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object sipCallId_;

        private DeleteCallRequest() {
            this.sipCallId_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.sipCallId_ = "";
        }

        public static DeleteCallRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_DeleteCallRequest_descriptor;
        }

        public static Builder newBuilder(DeleteCallRequest deleteCallRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deleteCallRequest);
        }

        public static DeleteCallRequest parseDelimitedFrom(InputStream inputStream) {
            return (DeleteCallRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeleteCallRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DeleteCallRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeleteCallRequest)) {
                return super.equals(obj);
            }
            DeleteCallRequest deleteCallRequest = (DeleteCallRequest) obj;
            if (hasSipCallId() != deleteCallRequest.hasSipCallId()) {
                return false;
            }
            return (!hasSipCallId() || getSipCallId().equals(deleteCallRequest.getSipCallId())) && getUnknownFields().equals(deleteCallRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeleteCallRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.sipCallId_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.DeleteCallRequestOrBuilder
        public String getSipCallId() {
            Object obj = this.sipCallId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.sipCallId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.DeleteCallRequestOrBuilder
        public ByteString getSipCallIdBytes() {
            Object obj = this.sipCallId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sipCallId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.DeleteCallRequestOrBuilder
        public boolean hasSipCallId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSipCallId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSipCallId().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_DeleteCallRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DeleteCallRequest.class, Builder.class);
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
            return new DeleteCallRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.sipCallId_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeleteCallRequestOrBuilder {
            private int bitField0_;
            private Object sipCallId_;

            private Builder() {
                this.sipCallId_ = "";
            }

            private void buildPartial0(DeleteCallRequest deleteCallRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    deleteCallRequest.sipCallId_ = this.sipCallId_;
                } else {
                    i14 = 0;
                }
                deleteCallRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_DeleteCallRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeleteCallRequest build() {
                DeleteCallRequest deleteCallRequestBuildPartial = buildPartial();
                if (deleteCallRequestBuildPartial.isInitialized()) {
                    return deleteCallRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deleteCallRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeleteCallRequest buildPartial() {
                DeleteCallRequest deleteCallRequest = new DeleteCallRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(deleteCallRequest);
                }
                onBuilt();
                return deleteCallRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sipCallId_ = "";
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

            public Builder clearSipCallId() {
                this.sipCallId_ = DeleteCallRequest.getDefaultInstance().getSipCallId();
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
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_DeleteCallRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.DeleteCallRequestOrBuilder
            public String getSipCallId() {
                Object obj = this.sipCallId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.sipCallId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.DeleteCallRequestOrBuilder
            public ByteString getSipCallIdBytes() {
                Object obj = this.sipCallId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sipCallId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.DeleteCallRequestOrBuilder
            public boolean hasSipCallId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_DeleteCallRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DeleteCallRequest.class, Builder.class);
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
                                    this.sipCallId_ = codedInputStream.readBytes();
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

            public Builder setSipCallId(String str) {
                str.getClass();
                this.sipCallId_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSipCallIdBytes(ByteString byteString) {
                byteString.getClass();
                this.sipCallId_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DeleteCallRequest getDefaultInstanceForType() {
                return DeleteCallRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.sipCallId_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DeleteCallRequest) {
                    return mergeFrom((DeleteCallRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeleteCallRequest deleteCallRequest) {
                if (deleteCallRequest == DeleteCallRequest.getDefaultInstance()) {
                    return this;
                }
                if (deleteCallRequest.hasSipCallId()) {
                    this.sipCallId_ = deleteCallRequest.sipCallId_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                mergeUnknownFields(deleteCallRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeleteCallRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DeleteCallRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeleteCallRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeleteCallRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DeleteCallRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeleteCallRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DeleteCallRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private DeleteCallRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sipCallId_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeleteCallRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DeleteCallRequest parseFrom(InputStream inputStream) {
            return (DeleteCallRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ DeleteCallRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DeleteCallRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeleteCallRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeleteCallRequest parseFrom(CodedInputStream codedInputStream) {
            return (DeleteCallRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeleteCallRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeleteCallRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DeleteCallResponse extends GeneratedMessageV3 implements DeleteCallResponseOrBuilder {
        private static final DeleteCallResponse DEFAULT_INSTANCE = new DeleteCallResponse();

        @Deprecated
        public static final Parser<DeleteCallResponse> PARSER = new AbstractParser<DeleteCallResponse>() { // from class: com.garmin.proto.generated.GDIInReachCalls.DeleteCallResponse.1
            @Override // com.google.protobuf.Parser
            public DeleteCallResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DeleteCallResponse.newBuilder();
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

        private DeleteCallResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeleteCallResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_DeleteCallResponse_descriptor;
        }

        public static Builder newBuilder(DeleteCallResponse deleteCallResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deleteCallResponse);
        }

        public static DeleteCallResponse parseDelimitedFrom(InputStream inputStream) {
            return (DeleteCallResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeleteCallResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DeleteCallResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeleteCallResponse)) {
                return super.equals(obj);
            }
            DeleteCallResponse deleteCallResponse = (DeleteCallResponse) obj;
            if (hasStatus() != deleteCallResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == deleteCallResponse.status_) && getUnknownFields().equals(deleteCallResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeleteCallResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIInReachCalls.DeleteCallResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.DeleteCallResponseOrBuilder
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
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_DeleteCallResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DeleteCallResponse.class, Builder.class);
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
            return new DeleteCallResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeleteCallResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(DeleteCallResponse deleteCallResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    deleteCallResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                deleteCallResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_DeleteCallResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeleteCallResponse build() {
                DeleteCallResponse deleteCallResponseBuildPartial = buildPartial();
                if (deleteCallResponseBuildPartial.isInitialized()) {
                    return deleteCallResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deleteCallResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeleteCallResponse buildPartial() {
                DeleteCallResponse deleteCallResponse = new DeleteCallResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(deleteCallResponse);
                }
                onBuilt();
                return deleteCallResponse;
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
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_DeleteCallResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.DeleteCallResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.DeleteCallResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_DeleteCallResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DeleteCallResponse.class, Builder.class);
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
            public DeleteCallResponse getDefaultInstanceForType() {
                return DeleteCallResponse.getDefaultInstance();
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
                if (message instanceof DeleteCallResponse) {
                    return mergeFrom((DeleteCallResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeleteCallResponse deleteCallResponse) {
                if (deleteCallResponse == DeleteCallResponse.getDefaultInstance()) {
                    return this;
                }
                if (deleteCallResponse.hasStatus()) {
                    setStatus(deleteCallResponse.getStatus());
                }
                mergeUnknownFields(deleteCallResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeleteCallResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DeleteCallResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeleteCallResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeleteCallResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DeleteCallResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DeleteCallResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DeleteCallResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeleteCallResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DeleteCallResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DeleteCallResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DeleteCallResponse parseFrom(InputStream inputStream) {
            return (DeleteCallResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DeleteCallResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeleteCallResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeleteCallResponse parseFrom(CodedInputStream codedInputStream) {
            return (DeleteCallResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeleteCallResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeleteCallResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN(0),
            OK(1),
            GENERIC_ERROR(2),
            CALL_NOT_FOUND(3);

            public static final int CALL_NOT_FOUND_VALUE = 3;
            public static final int GENERIC_ERROR_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIInReachCalls.DeleteCallResponse.Status.1
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
                if (i14 == 2) {
                    return GENERIC_ERROR;
                }
                if (i14 != 3) {
                    return null;
                }
                return CALL_NOT_FOUND;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return DeleteCallResponse.getDescriptor().getEnumTypes().get(0);
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
        public static final int CALL_FIELD_NUMBER = 1;
        private static final GenericItemExt DEFAULT_INSTANCE = new GenericItemExt();

        @Deprecated
        public static final Parser<GenericItemExt> PARSER = new AbstractParser<GenericItemExt>() { // from class: com.garmin.proto.generated.GDIInReachCalls.GenericItemExt.1
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
        private Call call_;
        private byte memoizedIsInitialized;

        private GenericItemExt(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GenericItemExt getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_GenericItemExt_descriptor;
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
            if (hasCall() != genericItemExt.hasCall()) {
                return false;
            }
            return (!hasCall() || getCall().equals(genericItemExt.getCall())) && getUnknownFields().equals(genericItemExt.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.GenericItemExtOrBuilder
        public Call getCall() {
            Call call = this.call_;
            return call == null ? Call.getDefaultInstance() : call;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.GenericItemExtOrBuilder
        public CallOrBuilder getCallOrBuilder() {
            Call call = this.call_;
            return call == null ? Call.getDefaultInstance() : call;
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCall()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.GenericItemExtOrBuilder
        public boolean hasCall() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCall()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCall().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_GenericItemExt_fieldAccessorTable.ensureFieldAccessorsInitialized(GenericItemExt.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getCall());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GenericItemExtOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Call, Call.Builder, CallOrBuilder> callBuilder_;
            private Call call_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(GenericItemExt genericItemExt) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<Call, Call.Builder, CallOrBuilder> singleFieldBuilderV3 = this.callBuilder_;
                    genericItemExt.call_ = singleFieldBuilderV3 == null ? this.call_ : (Call) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                genericItemExt.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<Call, Call.Builder, CallOrBuilder> getCallFieldBuilder() {
                if (this.callBuilder_ == null) {
                    this.callBuilder_ = new SingleFieldBuilderV3<>(getCall(), getParentForChildren(), isClean());
                    this.call_ = null;
                }
                return this.callBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_GenericItemExt_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getCallFieldBuilder();
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
                this.call_ = null;
                SingleFieldBuilderV3<Call, Call.Builder, CallOrBuilder> singleFieldBuilderV3 = this.callBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.callBuilder_ = null;
                }
                return this;
            }

            public Builder clearCall() {
                this.bitField0_ &= -2;
                this.call_ = null;
                SingleFieldBuilderV3<Call, Call.Builder, CallOrBuilder> singleFieldBuilderV3 = this.callBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.callBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIInReachCalls.GenericItemExtOrBuilder
            public Call getCall() {
                SingleFieldBuilderV3<Call, Call.Builder, CallOrBuilder> singleFieldBuilderV3 = this.callBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Call) singleFieldBuilderV3.getMessage();
                }
                Call call = this.call_;
                return call == null ? Call.getDefaultInstance() : call;
            }

            public Call.Builder getCallBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Call.Builder) getCallFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.GenericItemExtOrBuilder
            public CallOrBuilder getCallOrBuilder() {
                SingleFieldBuilderV3<Call, Call.Builder, CallOrBuilder> singleFieldBuilderV3 = this.callBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CallOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Call call = this.call_;
                return call == null ? Call.getDefaultInstance() : call;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_GenericItemExt_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.GenericItemExtOrBuilder
            public boolean hasCall() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_GenericItemExt_fieldAccessorTable.ensureFieldAccessorsInitialized(GenericItemExt.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCall(Call call) {
                Call call2;
                SingleFieldBuilderV3<Call, Call.Builder, CallOrBuilder> singleFieldBuilderV3 = this.callBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(call);
                } else if ((this.bitField0_ & 1) == 0 || (call2 = this.call_) == null || call2 == Call.getDefaultInstance()) {
                    this.call_ = call;
                } else {
                    getCallBuilder().mergeFrom(call);
                }
                if (this.call_ != null) {
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
                                    codedInputStream.readMessage(getCallFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setCall(Call.Builder builder) {
                SingleFieldBuilderV3<Call, Call.Builder, CallOrBuilder> singleFieldBuilderV3 = this.callBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.call_ = builder.build();
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

            public Builder setCall(Call call) {
                SingleFieldBuilderV3<Call, Call.Builder, CallOrBuilder> singleFieldBuilderV3 = this.callBuilder_;
                if (singleFieldBuilderV3 == null) {
                    call.getClass();
                    this.call_ = call;
                } else {
                    singleFieldBuilderV3.setMessage(call);
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
                if (genericItemExt.hasCall()) {
                    mergeCall(genericItemExt.getCall());
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
        public static final Parser<GenericItemReferenceExt> PARSER = new AbstractParser<GenericItemReferenceExt>() { // from class: com.garmin.proto.generated.GDIInReachCalls.GenericItemReferenceExt.1
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
        public static final int SIP_CALL_ID_FIELD_NUMBER = 1;
        public static final int UPDATED_TIME_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object sipCallId_;
        private long updatedTime_;

        private GenericItemReferenceExt() {
            this.sipCallId_ = "";
            this.updatedTime_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
            this.sipCallId_ = "";
        }

        public static GenericItemReferenceExt getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_GenericItemReferenceExt_descriptor;
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
            if (hasSipCallId() != genericItemReferenceExt.hasSipCallId()) {
                return false;
            }
            if ((!hasSipCallId() || getSipCallId().equals(genericItemReferenceExt.getSipCallId())) && hasUpdatedTime() == genericItemReferenceExt.hasUpdatedTime()) {
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
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.sipCallId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt64Size(2, this.updatedTime_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.GenericItemReferenceExtOrBuilder
        public String getSipCallId() {
            Object obj = this.sipCallId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.sipCallId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.GenericItemReferenceExtOrBuilder
        public ByteString getSipCallIdBytes() {
            Object obj = this.sipCallId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sipCallId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.GenericItemReferenceExtOrBuilder
        public long getUpdatedTime() {
            return this.updatedTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.GenericItemReferenceExtOrBuilder
        public boolean hasSipCallId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.GenericItemReferenceExtOrBuilder
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
            if (hasSipCallId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSipCallId().hashCode();
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
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_GenericItemReferenceExt_fieldAccessorTable.ensureFieldAccessorsInitialized(GenericItemReferenceExt.class, Builder.class);
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
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.sipCallId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt64(2, this.updatedTime_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GenericItemReferenceExtOrBuilder {
            private int bitField0_;
            private Object sipCallId_;
            private long updatedTime_;

            private Builder() {
                this.sipCallId_ = "";
            }

            private void buildPartial0(GenericItemReferenceExt genericItemReferenceExt) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    genericItemReferenceExt.sipCallId_ = this.sipCallId_;
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
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_GenericItemReferenceExt_descriptor;
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
                this.sipCallId_ = "";
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

            public Builder clearSipCallId() {
                this.sipCallId_ = GenericItemReferenceExt.getDefaultInstance().getSipCallId();
                this.bitField0_ &= -2;
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
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_GenericItemReferenceExt_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.GenericItemReferenceExtOrBuilder
            public String getSipCallId() {
                Object obj = this.sipCallId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.sipCallId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.GenericItemReferenceExtOrBuilder
            public ByteString getSipCallIdBytes() {
                Object obj = this.sipCallId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sipCallId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.GenericItemReferenceExtOrBuilder
            public long getUpdatedTime() {
                return this.updatedTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.GenericItemReferenceExtOrBuilder
            public boolean hasSipCallId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.GenericItemReferenceExtOrBuilder
            public boolean hasUpdatedTime() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_GenericItemReferenceExt_fieldAccessorTable.ensureFieldAccessorsInitialized(GenericItemReferenceExt.class, Builder.class);
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
                                    this.sipCallId_ = codedInputStream.readBytes();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSipCallId(String str) {
                str.getClass();
                this.sipCallId_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSipCallIdBytes(ByteString byteString) {
                byteString.getClass();
                this.sipCallId_ = byteString;
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
                this.sipCallId_ = "";
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
                if (genericItemReferenceExt.hasSipCallId()) {
                    this.sipCallId_ = genericItemReferenceExt.sipCallId_;
                    this.bitField0_ |= 1;
                    onChanged();
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

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GenericItemReferenceExt parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
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

        private GenericItemReferenceExt(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sipCallId_ = "";
            this.updatedTime_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GenericItemReferenceExt parseFrom(CodedInputStream codedInputStream) {
            return (GenericItemReferenceExt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GenericItemReferenceExt parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GenericItemReferenceExt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ GenericItemReferenceExt(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class InReachCallsService extends GeneratedMessageV3 implements InReachCallsServiceOrBuilder {
        public static final int CALL_UPDATED_NOTIFICATION_FIELD_NUMBER = 7;
        public static final int DELETE_CALL_REQUEST_FIELD_NUMBER = 5;
        public static final int DELETE_CALL_RESPONSE_FIELD_NUMBER = 6;
        public static final int SUBSCRIBE_REQUEST_FIELD_NUMBER = 3;
        public static final int SUBSCRIBE_RESPONSE_FIELD_NUMBER = 4;
        public static final int SYNC_REQUEST_FIELD_NUMBER = 1;
        public static final int SYNC_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private CallUpdatedNotification callUpdatedNotification_;
        private DeleteCallRequest deleteCallRequest_;
        private DeleteCallResponse deleteCallResponse_;
        private byte memoizedIsInitialized;
        private SubscribeRequest subscribeRequest_;
        private SubscribeResponse subscribeResponse_;
        private SyncRequest syncRequest_;
        private SyncResponse syncResponse_;
        private static final InReachCallsService DEFAULT_INSTANCE = new InReachCallsService();

        @Deprecated
        public static final Parser<InReachCallsService> PARSER = new AbstractParser<InReachCallsService>() { // from class: com.garmin.proto.generated.GDIInReachCalls.InReachCallsService.1
            @Override // com.google.protobuf.Parser
            public InReachCallsService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = InReachCallsService.newBuilder();
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

        private InReachCallsService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InReachCallsService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_InReachCallsService_descriptor;
        }

        public static Builder newBuilder(InReachCallsService inReachCallsService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(inReachCallsService);
        }

        public static InReachCallsService parseDelimitedFrom(InputStream inputStream) {
            return (InReachCallsService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InReachCallsService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<InReachCallsService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InReachCallsService)) {
                return super.equals(obj);
            }
            InReachCallsService inReachCallsService = (InReachCallsService) obj;
            if (hasSyncRequest() != inReachCallsService.hasSyncRequest()) {
                return false;
            }
            if ((hasSyncRequest() && !getSyncRequest().equals(inReachCallsService.getSyncRequest())) || hasSyncResponse() != inReachCallsService.hasSyncResponse()) {
                return false;
            }
            if ((hasSyncResponse() && !getSyncResponse().equals(inReachCallsService.getSyncResponse())) || hasSubscribeRequest() != inReachCallsService.hasSubscribeRequest()) {
                return false;
            }
            if ((hasSubscribeRequest() && !getSubscribeRequest().equals(inReachCallsService.getSubscribeRequest())) || hasSubscribeResponse() != inReachCallsService.hasSubscribeResponse()) {
                return false;
            }
            if ((hasSubscribeResponse() && !getSubscribeResponse().equals(inReachCallsService.getSubscribeResponse())) || hasDeleteCallRequest() != inReachCallsService.hasDeleteCallRequest()) {
                return false;
            }
            if ((hasDeleteCallRequest() && !getDeleteCallRequest().equals(inReachCallsService.getDeleteCallRequest())) || hasDeleteCallResponse() != inReachCallsService.hasDeleteCallResponse()) {
                return false;
            }
            if ((!hasDeleteCallResponse() || getDeleteCallResponse().equals(inReachCallsService.getDeleteCallResponse())) && hasCallUpdatedNotification() == inReachCallsService.hasCallUpdatedNotification()) {
                return (!hasCallUpdatedNotification() || getCallUpdatedNotification().equals(inReachCallsService.getCallUpdatedNotification())) && getUnknownFields().equals(inReachCallsService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
        public CallUpdatedNotification getCallUpdatedNotification() {
            CallUpdatedNotification callUpdatedNotification = this.callUpdatedNotification_;
            return callUpdatedNotification == null ? CallUpdatedNotification.getDefaultInstance() : callUpdatedNotification;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
        public CallUpdatedNotificationOrBuilder getCallUpdatedNotificationOrBuilder() {
            CallUpdatedNotification callUpdatedNotification = this.callUpdatedNotification_;
            return callUpdatedNotification == null ? CallUpdatedNotification.getDefaultInstance() : callUpdatedNotification;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
        public DeleteCallRequest getDeleteCallRequest() {
            DeleteCallRequest deleteCallRequest = this.deleteCallRequest_;
            return deleteCallRequest == null ? DeleteCallRequest.getDefaultInstance() : deleteCallRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
        public DeleteCallRequestOrBuilder getDeleteCallRequestOrBuilder() {
            DeleteCallRequest deleteCallRequest = this.deleteCallRequest_;
            return deleteCallRequest == null ? DeleteCallRequest.getDefaultInstance() : deleteCallRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
        public DeleteCallResponse getDeleteCallResponse() {
            DeleteCallResponse deleteCallResponse = this.deleteCallResponse_;
            return deleteCallResponse == null ? DeleteCallResponse.getDefaultInstance() : deleteCallResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
        public DeleteCallResponseOrBuilder getDeleteCallResponseOrBuilder() {
            DeleteCallResponse deleteCallResponse = this.deleteCallResponse_;
            return deleteCallResponse == null ? DeleteCallResponse.getDefaultInstance() : deleteCallResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InReachCallsService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSyncRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getSyncResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getSubscribeRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getSubscribeResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getDeleteCallRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getDeleteCallResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getCallUpdatedNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
        public SubscribeRequest getSubscribeRequest() {
            SubscribeRequest subscribeRequest = this.subscribeRequest_;
            return subscribeRequest == null ? SubscribeRequest.getDefaultInstance() : subscribeRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
        public SubscribeRequestOrBuilder getSubscribeRequestOrBuilder() {
            SubscribeRequest subscribeRequest = this.subscribeRequest_;
            return subscribeRequest == null ? SubscribeRequest.getDefaultInstance() : subscribeRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
        public SubscribeResponse getSubscribeResponse() {
            SubscribeResponse subscribeResponse = this.subscribeResponse_;
            return subscribeResponse == null ? SubscribeResponse.getDefaultInstance() : subscribeResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
        public SubscribeResponseOrBuilder getSubscribeResponseOrBuilder() {
            SubscribeResponse subscribeResponse = this.subscribeResponse_;
            return subscribeResponse == null ? SubscribeResponse.getDefaultInstance() : subscribeResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
        public SyncRequest getSyncRequest() {
            SyncRequest syncRequest = this.syncRequest_;
            return syncRequest == null ? SyncRequest.getDefaultInstance() : syncRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
        public SyncRequestOrBuilder getSyncRequestOrBuilder() {
            SyncRequest syncRequest = this.syncRequest_;
            return syncRequest == null ? SyncRequest.getDefaultInstance() : syncRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
        public SyncResponse getSyncResponse() {
            SyncResponse syncResponse = this.syncResponse_;
            return syncResponse == null ? SyncResponse.getDefaultInstance() : syncResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
        public SyncResponseOrBuilder getSyncResponseOrBuilder() {
            SyncResponse syncResponse = this.syncResponse_;
            return syncResponse == null ? SyncResponse.getDefaultInstance() : syncResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
        public boolean hasCallUpdatedNotification() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
        public boolean hasDeleteCallRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
        public boolean hasDeleteCallResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
        public boolean hasSubscribeRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
        public boolean hasSubscribeResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
        public boolean hasSyncRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
        public boolean hasSyncResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSyncRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSyncRequest().hashCode();
            }
            if (hasSyncResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSyncResponse().hashCode();
            }
            if (hasSubscribeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSubscribeRequest().hashCode();
            }
            if (hasSubscribeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getSubscribeResponse().hashCode();
            }
            if (hasDeleteCallRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getDeleteCallRequest().hashCode();
            }
            if (hasDeleteCallResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getDeleteCallResponse().hashCode();
            }
            if (hasCallUpdatedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getCallUpdatedNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_InReachCallsService_fieldAccessorTable.ensureFieldAccessorsInitialized(InReachCallsService.class, Builder.class);
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
            if (hasSubscribeResponse() && !getSubscribeResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasDeleteCallResponse() || getDeleteCallResponse().isInitialized()) {
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
            return new InReachCallsService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSyncRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getSyncResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getSubscribeRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getSubscribeResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getDeleteCallRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getDeleteCallResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getCallUpdatedNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InReachCallsServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<CallUpdatedNotification, CallUpdatedNotification.Builder, CallUpdatedNotificationOrBuilder> callUpdatedNotificationBuilder_;
            private CallUpdatedNotification callUpdatedNotification_;
            private SingleFieldBuilderV3<DeleteCallRequest, DeleteCallRequest.Builder, DeleteCallRequestOrBuilder> deleteCallRequestBuilder_;
            private DeleteCallRequest deleteCallRequest_;
            private SingleFieldBuilderV3<DeleteCallResponse, DeleteCallResponse.Builder, DeleteCallResponseOrBuilder> deleteCallResponseBuilder_;
            private DeleteCallResponse deleteCallResponse_;
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

            private void buildPartial0(InReachCallsService inReachCallsService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                    inReachCallsService.syncRequest_ = singleFieldBuilderV3 == null ? this.syncRequest_ : (SyncRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV4 = this.syncResponseBuilder_;
                    inReachCallsService.syncResponse_ = singleFieldBuilderV4 == null ? this.syncResponse_ : (SyncResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV5 = this.subscribeRequestBuilder_;
                    inReachCallsService.subscribeRequest_ = singleFieldBuilderV5 == null ? this.subscribeRequest_ : (SubscribeRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV6 = this.subscribeResponseBuilder_;
                    inReachCallsService.subscribeResponse_ = singleFieldBuilderV6 == null ? this.subscribeResponse_ : (SubscribeResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<DeleteCallRequest, DeleteCallRequest.Builder, DeleteCallRequestOrBuilder> singleFieldBuilderV7 = this.deleteCallRequestBuilder_;
                    inReachCallsService.deleteCallRequest_ = singleFieldBuilderV7 == null ? this.deleteCallRequest_ : (DeleteCallRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<DeleteCallResponse, DeleteCallResponse.Builder, DeleteCallResponseOrBuilder> singleFieldBuilderV8 = this.deleteCallResponseBuilder_;
                    inReachCallsService.deleteCallResponse_ = singleFieldBuilderV8 == null ? this.deleteCallResponse_ : (DeleteCallResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<CallUpdatedNotification, CallUpdatedNotification.Builder, CallUpdatedNotificationOrBuilder> singleFieldBuilderV9 = this.callUpdatedNotificationBuilder_;
                    inReachCallsService.callUpdatedNotification_ = singleFieldBuilderV9 == null ? this.callUpdatedNotification_ : (CallUpdatedNotification) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                inReachCallsService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<CallUpdatedNotification, CallUpdatedNotification.Builder, CallUpdatedNotificationOrBuilder> getCallUpdatedNotificationFieldBuilder() {
                if (this.callUpdatedNotificationBuilder_ == null) {
                    this.callUpdatedNotificationBuilder_ = new SingleFieldBuilderV3<>(getCallUpdatedNotification(), getParentForChildren(), isClean());
                    this.callUpdatedNotification_ = null;
                }
                return this.callUpdatedNotificationBuilder_;
            }

            private SingleFieldBuilderV3<DeleteCallRequest, DeleteCallRequest.Builder, DeleteCallRequestOrBuilder> getDeleteCallRequestFieldBuilder() {
                if (this.deleteCallRequestBuilder_ == null) {
                    this.deleteCallRequestBuilder_ = new SingleFieldBuilderV3<>(getDeleteCallRequest(), getParentForChildren(), isClean());
                    this.deleteCallRequest_ = null;
                }
                return this.deleteCallRequestBuilder_;
            }

            private SingleFieldBuilderV3<DeleteCallResponse, DeleteCallResponse.Builder, DeleteCallResponseOrBuilder> getDeleteCallResponseFieldBuilder() {
                if (this.deleteCallResponseBuilder_ == null) {
                    this.deleteCallResponseBuilder_ = new SingleFieldBuilderV3<>(getDeleteCallResponse(), getParentForChildren(), isClean());
                    this.deleteCallResponse_ = null;
                }
                return this.deleteCallResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_InReachCallsService_descriptor;
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
                    getSyncRequestFieldBuilder();
                    getSyncResponseFieldBuilder();
                    getSubscribeRequestFieldBuilder();
                    getSubscribeResponseFieldBuilder();
                    getDeleteCallRequestFieldBuilder();
                    getDeleteCallResponseFieldBuilder();
                    getCallUpdatedNotificationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InReachCallsService build() {
                InReachCallsService inReachCallsServiceBuildPartial = buildPartial();
                if (inReachCallsServiceBuildPartial.isInitialized()) {
                    return inReachCallsServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) inReachCallsServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InReachCallsService buildPartial() {
                InReachCallsService inReachCallsService = new InReachCallsService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(inReachCallsService);
                }
                onBuilt();
                return inReachCallsService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.syncRequest_ = null;
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.syncRequestBuilder_ = null;
                }
                this.syncResponse_ = null;
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV4 = this.syncResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.syncResponseBuilder_ = null;
                }
                this.subscribeRequest_ = null;
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV5 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.subscribeRequestBuilder_ = null;
                }
                this.subscribeResponse_ = null;
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV6 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.subscribeResponseBuilder_ = null;
                }
                this.deleteCallRequest_ = null;
                SingleFieldBuilderV3<DeleteCallRequest, DeleteCallRequest.Builder, DeleteCallRequestOrBuilder> singleFieldBuilderV7 = this.deleteCallRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.deleteCallRequestBuilder_ = null;
                }
                this.deleteCallResponse_ = null;
                SingleFieldBuilderV3<DeleteCallResponse, DeleteCallResponse.Builder, DeleteCallResponseOrBuilder> singleFieldBuilderV8 = this.deleteCallResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.deleteCallResponseBuilder_ = null;
                }
                this.callUpdatedNotification_ = null;
                SingleFieldBuilderV3<CallUpdatedNotification, CallUpdatedNotification.Builder, CallUpdatedNotificationOrBuilder> singleFieldBuilderV9 = this.callUpdatedNotificationBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.callUpdatedNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearCallUpdatedNotification() {
                this.bitField0_ &= -65;
                this.callUpdatedNotification_ = null;
                SingleFieldBuilderV3<CallUpdatedNotification, CallUpdatedNotification.Builder, CallUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.callUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.callUpdatedNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDeleteCallRequest() {
                this.bitField0_ &= -17;
                this.deleteCallRequest_ = null;
                SingleFieldBuilderV3<DeleteCallRequest, DeleteCallRequest.Builder, DeleteCallRequestOrBuilder> singleFieldBuilderV3 = this.deleteCallRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deleteCallRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDeleteCallResponse() {
                this.bitField0_ &= -33;
                this.deleteCallResponse_ = null;
                SingleFieldBuilderV3<DeleteCallResponse, DeleteCallResponse.Builder, DeleteCallResponseOrBuilder> singleFieldBuilderV3 = this.deleteCallResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deleteCallResponseBuilder_ = null;
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
                this.bitField0_ &= -5;
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
                this.bitField0_ &= -9;
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
                this.bitField0_ &= -2;
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
                this.bitField0_ &= -3;
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

            @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
            public CallUpdatedNotification getCallUpdatedNotification() {
                SingleFieldBuilderV3<CallUpdatedNotification, CallUpdatedNotification.Builder, CallUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.callUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CallUpdatedNotification) singleFieldBuilderV3.getMessage();
                }
                CallUpdatedNotification callUpdatedNotification = this.callUpdatedNotification_;
                return callUpdatedNotification == null ? CallUpdatedNotification.getDefaultInstance() : callUpdatedNotification;
            }

            public CallUpdatedNotification.Builder getCallUpdatedNotificationBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (CallUpdatedNotification.Builder) getCallUpdatedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
            public CallUpdatedNotificationOrBuilder getCallUpdatedNotificationOrBuilder() {
                SingleFieldBuilderV3<CallUpdatedNotification, CallUpdatedNotification.Builder, CallUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.callUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CallUpdatedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CallUpdatedNotification callUpdatedNotification = this.callUpdatedNotification_;
                return callUpdatedNotification == null ? CallUpdatedNotification.getDefaultInstance() : callUpdatedNotification;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
            public DeleteCallRequest getDeleteCallRequest() {
                SingleFieldBuilderV3<DeleteCallRequest, DeleteCallRequest.Builder, DeleteCallRequestOrBuilder> singleFieldBuilderV3 = this.deleteCallRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeleteCallRequest) singleFieldBuilderV3.getMessage();
                }
                DeleteCallRequest deleteCallRequest = this.deleteCallRequest_;
                return deleteCallRequest == null ? DeleteCallRequest.getDefaultInstance() : deleteCallRequest;
            }

            public DeleteCallRequest.Builder getDeleteCallRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (DeleteCallRequest.Builder) getDeleteCallRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
            public DeleteCallRequestOrBuilder getDeleteCallRequestOrBuilder() {
                SingleFieldBuilderV3<DeleteCallRequest, DeleteCallRequest.Builder, DeleteCallRequestOrBuilder> singleFieldBuilderV3 = this.deleteCallRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeleteCallRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DeleteCallRequest deleteCallRequest = this.deleteCallRequest_;
                return deleteCallRequest == null ? DeleteCallRequest.getDefaultInstance() : deleteCallRequest;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
            public DeleteCallResponse getDeleteCallResponse() {
                SingleFieldBuilderV3<DeleteCallResponse, DeleteCallResponse.Builder, DeleteCallResponseOrBuilder> singleFieldBuilderV3 = this.deleteCallResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeleteCallResponse) singleFieldBuilderV3.getMessage();
                }
                DeleteCallResponse deleteCallResponse = this.deleteCallResponse_;
                return deleteCallResponse == null ? DeleteCallResponse.getDefaultInstance() : deleteCallResponse;
            }

            public DeleteCallResponse.Builder getDeleteCallResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (DeleteCallResponse.Builder) getDeleteCallResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
            public DeleteCallResponseOrBuilder getDeleteCallResponseOrBuilder() {
                SingleFieldBuilderV3<DeleteCallResponse, DeleteCallResponse.Builder, DeleteCallResponseOrBuilder> singleFieldBuilderV3 = this.deleteCallResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeleteCallResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DeleteCallResponse deleteCallResponse = this.deleteCallResponse_;
                return deleteCallResponse == null ? DeleteCallResponse.getDefaultInstance() : deleteCallResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_InReachCallsService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
            public SubscribeRequest getSubscribeRequest() {
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SubscribeRequest) singleFieldBuilderV3.getMessage();
                }
                SubscribeRequest subscribeRequest = this.subscribeRequest_;
                return subscribeRequest == null ? SubscribeRequest.getDefaultInstance() : subscribeRequest;
            }

            public SubscribeRequest.Builder getSubscribeRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (SubscribeRequest.Builder) getSubscribeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
            public SubscribeRequestOrBuilder getSubscribeRequestOrBuilder() {
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SubscribeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SubscribeRequest subscribeRequest = this.subscribeRequest_;
                return subscribeRequest == null ? SubscribeRequest.getDefaultInstance() : subscribeRequest;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
            public SubscribeResponse getSubscribeResponse() {
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SubscribeResponse) singleFieldBuilderV3.getMessage();
                }
                SubscribeResponse subscribeResponse = this.subscribeResponse_;
                return subscribeResponse == null ? SubscribeResponse.getDefaultInstance() : subscribeResponse;
            }

            public SubscribeResponse.Builder getSubscribeResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (SubscribeResponse.Builder) getSubscribeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
            public SubscribeResponseOrBuilder getSubscribeResponseOrBuilder() {
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SubscribeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SubscribeResponse subscribeResponse = this.subscribeResponse_;
                return subscribeResponse == null ? SubscribeResponse.getDefaultInstance() : subscribeResponse;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
            public SyncRequest getSyncRequest() {
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncRequest) singleFieldBuilderV3.getMessage();
                }
                SyncRequest syncRequest = this.syncRequest_;
                return syncRequest == null ? SyncRequest.getDefaultInstance() : syncRequest;
            }

            public SyncRequest.Builder getSyncRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SyncRequest.Builder) getSyncRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
            public SyncRequestOrBuilder getSyncRequestOrBuilder() {
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SyncRequest syncRequest = this.syncRequest_;
                return syncRequest == null ? SyncRequest.getDefaultInstance() : syncRequest;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
            public SyncResponse getSyncResponse() {
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV3 = this.syncResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncResponse) singleFieldBuilderV3.getMessage();
                }
                SyncResponse syncResponse = this.syncResponse_;
                return syncResponse == null ? SyncResponse.getDefaultInstance() : syncResponse;
            }

            public SyncResponse.Builder getSyncResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SyncResponse.Builder) getSyncResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
            public SyncResponseOrBuilder getSyncResponseOrBuilder() {
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV3 = this.syncResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SyncResponse syncResponse = this.syncResponse_;
                return syncResponse == null ? SyncResponse.getDefaultInstance() : syncResponse;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
            public boolean hasCallUpdatedNotification() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
            public boolean hasDeleteCallRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
            public boolean hasDeleteCallResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
            public boolean hasSubscribeRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
            public boolean hasSubscribeResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
            public boolean hasSyncRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.InReachCallsServiceOrBuilder
            public boolean hasSyncResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_InReachCallsService_fieldAccessorTable.ensureFieldAccessorsInitialized(InReachCallsService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasSyncRequest() && !getSyncRequest().isInitialized()) {
                    return false;
                }
                if (hasSyncResponse() && !getSyncResponse().isInitialized()) {
                    return false;
                }
                if (!hasSubscribeResponse() || getSubscribeResponse().isInitialized()) {
                    return !hasDeleteCallResponse() || getDeleteCallResponse().isInitialized();
                }
                return false;
            }

            public Builder mergeCallUpdatedNotification(CallUpdatedNotification callUpdatedNotification) {
                CallUpdatedNotification callUpdatedNotification2;
                SingleFieldBuilderV3<CallUpdatedNotification, CallUpdatedNotification.Builder, CallUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.callUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(callUpdatedNotification);
                } else if ((this.bitField0_ & 64) == 0 || (callUpdatedNotification2 = this.callUpdatedNotification_) == null || callUpdatedNotification2 == CallUpdatedNotification.getDefaultInstance()) {
                    this.callUpdatedNotification_ = callUpdatedNotification;
                } else {
                    getCallUpdatedNotificationBuilder().mergeFrom(callUpdatedNotification);
                }
                if (this.callUpdatedNotification_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDeleteCallRequest(DeleteCallRequest deleteCallRequest) {
                DeleteCallRequest deleteCallRequest2;
                SingleFieldBuilderV3<DeleteCallRequest, DeleteCallRequest.Builder, DeleteCallRequestOrBuilder> singleFieldBuilderV3 = this.deleteCallRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deleteCallRequest);
                } else if ((this.bitField0_ & 16) == 0 || (deleteCallRequest2 = this.deleteCallRequest_) == null || deleteCallRequest2 == DeleteCallRequest.getDefaultInstance()) {
                    this.deleteCallRequest_ = deleteCallRequest;
                } else {
                    getDeleteCallRequestBuilder().mergeFrom(deleteCallRequest);
                }
                if (this.deleteCallRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDeleteCallResponse(DeleteCallResponse deleteCallResponse) {
                DeleteCallResponse deleteCallResponse2;
                SingleFieldBuilderV3<DeleteCallResponse, DeleteCallResponse.Builder, DeleteCallResponseOrBuilder> singleFieldBuilderV3 = this.deleteCallResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deleteCallResponse);
                } else if ((this.bitField0_ & 32) == 0 || (deleteCallResponse2 = this.deleteCallResponse_) == null || deleteCallResponse2 == DeleteCallResponse.getDefaultInstance()) {
                    this.deleteCallResponse_ = deleteCallResponse;
                } else {
                    getDeleteCallResponseBuilder().mergeFrom(deleteCallResponse);
                }
                if (this.deleteCallResponse_ != null) {
                    this.bitField0_ |= 32;
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
                                    codedInputStream.readMessage(getSyncRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getSyncResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getSubscribeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getSubscribeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getDeleteCallRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(getDeleteCallResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(getCallUpdatedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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
                } else if ((this.bitField0_ & 4) == 0 || (subscribeRequest2 = this.subscribeRequest_) == null || subscribeRequest2 == SubscribeRequest.getDefaultInstance()) {
                    this.subscribeRequest_ = subscribeRequest;
                } else {
                    getSubscribeRequestBuilder().mergeFrom(subscribeRequest);
                }
                if (this.subscribeRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSubscribeResponse(SubscribeResponse subscribeResponse) {
                SubscribeResponse subscribeResponse2;
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(subscribeResponse);
                } else if ((this.bitField0_ & 8) == 0 || (subscribeResponse2 = this.subscribeResponse_) == null || subscribeResponse2 == SubscribeResponse.getDefaultInstance()) {
                    this.subscribeResponse_ = subscribeResponse;
                } else {
                    getSubscribeResponseBuilder().mergeFrom(subscribeResponse);
                }
                if (this.subscribeResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSyncRequest(SyncRequest syncRequest) {
                SyncRequest syncRequest2;
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(syncRequest);
                } else if ((this.bitField0_ & 1) == 0 || (syncRequest2 = this.syncRequest_) == null || syncRequest2 == SyncRequest.getDefaultInstance()) {
                    this.syncRequest_ = syncRequest;
                } else {
                    getSyncRequestBuilder().mergeFrom(syncRequest);
                }
                if (this.syncRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSyncResponse(SyncResponse syncResponse) {
                SyncResponse syncResponse2;
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV3 = this.syncResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(syncResponse);
                } else if ((this.bitField0_ & 2) == 0 || (syncResponse2 = this.syncResponse_) == null || syncResponse2 == SyncResponse.getDefaultInstance()) {
                    this.syncResponse_ = syncResponse;
                } else {
                    getSyncResponseBuilder().mergeFrom(syncResponse);
                }
                if (this.syncResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setCallUpdatedNotification(CallUpdatedNotification.Builder builder) {
                SingleFieldBuilderV3<CallUpdatedNotification, CallUpdatedNotification.Builder, CallUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.callUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.callUpdatedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setDeleteCallRequest(DeleteCallRequest.Builder builder) {
                SingleFieldBuilderV3<DeleteCallRequest, DeleteCallRequest.Builder, DeleteCallRequestOrBuilder> singleFieldBuilderV3 = this.deleteCallRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.deleteCallRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setDeleteCallResponse(DeleteCallResponse.Builder builder) {
                SingleFieldBuilderV3<DeleteCallResponse, DeleteCallResponse.Builder, DeleteCallResponseOrBuilder> singleFieldBuilderV3 = this.deleteCallResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.deleteCallResponse_ = builder.build();
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
                this.bitField0_ |= 4;
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
                this.bitField0_ |= 8;
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
                this.bitField0_ |= 1;
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
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public InReachCallsService getDefaultInstanceForType() {
                return InReachCallsService.getDefaultInstance();
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

            public Builder setCallUpdatedNotification(CallUpdatedNotification callUpdatedNotification) {
                SingleFieldBuilderV3<CallUpdatedNotification, CallUpdatedNotification.Builder, CallUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.callUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    callUpdatedNotification.getClass();
                    this.callUpdatedNotification_ = callUpdatedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(callUpdatedNotification);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setDeleteCallRequest(DeleteCallRequest deleteCallRequest) {
                SingleFieldBuilderV3<DeleteCallRequest, DeleteCallRequest.Builder, DeleteCallRequestOrBuilder> singleFieldBuilderV3 = this.deleteCallRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deleteCallRequest.getClass();
                    this.deleteCallRequest_ = deleteCallRequest;
                } else {
                    singleFieldBuilderV3.setMessage(deleteCallRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setDeleteCallResponse(DeleteCallResponse deleteCallResponse) {
                SingleFieldBuilderV3<DeleteCallResponse, DeleteCallResponse.Builder, DeleteCallResponseOrBuilder> singleFieldBuilderV3 = this.deleteCallResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deleteCallResponse.getClass();
                    this.deleteCallResponse_ = deleteCallResponse;
                } else {
                    singleFieldBuilderV3.setMessage(deleteCallResponse);
                }
                this.bitField0_ |= 32;
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
                this.bitField0_ |= 4;
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
                this.bitField0_ |= 8;
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
                this.bitField0_ |= 1;
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
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InReachCallsService) {
                    return mergeFrom((InReachCallsService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(InReachCallsService inReachCallsService) {
                if (inReachCallsService == InReachCallsService.getDefaultInstance()) {
                    return this;
                }
                if (inReachCallsService.hasSyncRequest()) {
                    mergeSyncRequest(inReachCallsService.getSyncRequest());
                }
                if (inReachCallsService.hasSyncResponse()) {
                    mergeSyncResponse(inReachCallsService.getSyncResponse());
                }
                if (inReachCallsService.hasSubscribeRequest()) {
                    mergeSubscribeRequest(inReachCallsService.getSubscribeRequest());
                }
                if (inReachCallsService.hasSubscribeResponse()) {
                    mergeSubscribeResponse(inReachCallsService.getSubscribeResponse());
                }
                if (inReachCallsService.hasDeleteCallRequest()) {
                    mergeDeleteCallRequest(inReachCallsService.getDeleteCallRequest());
                }
                if (inReachCallsService.hasDeleteCallResponse()) {
                    mergeDeleteCallResponse(inReachCallsService.getDeleteCallResponse());
                }
                if (inReachCallsService.hasCallUpdatedNotification()) {
                    mergeCallUpdatedNotification(inReachCallsService.getCallUpdatedNotification());
                }
                mergeUnknownFields(inReachCallsService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InReachCallsService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ InReachCallsService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private InReachCallsService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InReachCallsService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InReachCallsService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InReachCallsService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static InReachCallsService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InReachCallsService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static InReachCallsService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static InReachCallsService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static InReachCallsService parseFrom(InputStream inputStream) {
            return (InReachCallsService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static InReachCallsService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InReachCallsService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InReachCallsService parseFrom(CodedInputStream codedInputStream) {
            return (InReachCallsService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static InReachCallsService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InReachCallsService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SubscribeResponse extends GeneratedMessageV3 implements SubscribeResponseOrBuilder {
        private static final SubscribeResponse DEFAULT_INSTANCE = new SubscribeResponse();

        @Deprecated
        public static final Parser<SubscribeResponse> PARSER = new AbstractParser<SubscribeResponse>() { // from class: com.garmin.proto.generated.GDIInReachCalls.SubscribeResponse.1
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
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SubscribeResponse_descriptor;
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

        @Override // com.garmin.proto.generated.GDIInReachCalls.SubscribeResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.SubscribeResponseOrBuilder
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
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SubscribeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SubscribeResponse.class, Builder.class);
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
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SubscribeResponse_descriptor;
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
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SubscribeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.SubscribeResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.SubscribeResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SubscribeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SubscribeResponse.class, Builder.class);
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
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIInReachCalls.SubscribeResponse.Status.1
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
        public static final Parser<SyncRequest> PARSER = new AbstractParser<SyncRequest>() { // from class: com.garmin.proto.generated.GDIInReachCalls.SyncRequest.1
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
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SyncRequest_descriptor;
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

        @Override // com.garmin.proto.generated.GDIInReachCalls.SyncRequestOrBuilder
        public SyncRequestInfo getRequestInfo() {
            SyncRequestInfo syncRequestInfo = this.requestInfo_;
            return syncRequestInfo == null ? SyncRequestInfo.getDefaultInstance() : syncRequestInfo;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.SyncRequestOrBuilder
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

        @Override // com.garmin.proto.generated.GDIInReachCalls.SyncRequestOrBuilder
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
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SyncRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncRequest.class, Builder.class);
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
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SyncRequest_descriptor;
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
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SyncRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.SyncRequestOrBuilder
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

            @Override // com.garmin.proto.generated.GDIInReachCalls.SyncRequestOrBuilder
            public SyncRequestInfoOrBuilder getRequestInfoOrBuilder() {
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncRequestInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SyncRequestInfo syncRequestInfo = this.requestInfo_;
                return syncRequestInfo == null ? SyncRequestInfo.getDefaultInstance() : syncRequestInfo;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.SyncRequestOrBuilder
            public boolean hasRequestInfo() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SyncRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncRequest.class, Builder.class);
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
        public static final Parser<SyncRequestInfo> PARSER = new AbstractParser<SyncRequestInfo>() { // from class: com.garmin.proto.generated.GDIInReachCalls.SyncRequestInfo.1
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
        public static final int SYNC_TYPE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private GDIDataTypes.UUID appUuid_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int protocolVersion_;
        private int syncType_;

        private SyncRequestInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.protocolVersion_ = 1;
            this.syncType_ = 2;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SyncRequestInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SyncRequestInfo_descriptor;
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
            if ((!hasAppUuid() || getAppUuid().equals(syncRequestInfo.getAppUuid())) && hasSyncType() == syncRequestInfo.hasSyncType()) {
                return (!hasSyncType() || this.syncType_ == syncRequestInfo.syncType_) && getUnknownFields().equals(syncRequestInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.SyncRequestInfoOrBuilder
        public GDIDataTypes.UUID getAppUuid() {
            GDIDataTypes.UUID uuid = this.appUuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.SyncRequestInfoOrBuilder
        public GDIDataTypes.UUIDOrBuilder getAppUuidOrBuilder() {
            GDIDataTypes.UUID uuid = this.appUuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SyncRequestInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.SyncRequestInfoOrBuilder
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
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.SyncRequestInfoOrBuilder
        public SyncType getSyncType() {
            SyncType syncTypeForNumber = SyncType.forNumber(this.syncType_);
            return syncTypeForNumber == null ? SyncType.INCREMENTAL : syncTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.SyncRequestInfoOrBuilder
        public boolean hasAppUuid() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.SyncRequestInfoOrBuilder
        public boolean hasProtocolVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.SyncRequestInfoOrBuilder
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
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SyncRequestInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncRequestInfo.class, Builder.class);
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
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SyncRequestInfoOrBuilder {
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> appUuidBuilder_;
            private GDIDataTypes.UUID appUuid_;
            private int bitField0_;
            private int protocolVersion_;
            private int syncType_;

            private Builder() {
                this.protocolVersion_ = 1;
                this.syncType_ = 2;
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
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SyncRequestInfo_descriptor;
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

            @Override // com.garmin.proto.generated.GDIInReachCalls.SyncRequestInfoOrBuilder
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

            @Override // com.garmin.proto.generated.GDIInReachCalls.SyncRequestInfoOrBuilder
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
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SyncRequestInfo_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.SyncRequestInfoOrBuilder
            public int getProtocolVersion() {
                return this.protocolVersion_;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.SyncRequestInfoOrBuilder
            public SyncType getSyncType() {
                SyncType syncTypeForNumber = SyncType.forNumber(this.syncType_);
                return syncTypeForNumber == null ? SyncType.INCREMENTAL : syncTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.SyncRequestInfoOrBuilder
            public boolean hasAppUuid() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.SyncRequestInfoOrBuilder
            public boolean hasProtocolVersion() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.SyncRequestInfoOrBuilder
            public boolean hasSyncType() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SyncRequestInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncRequestInfo.class, Builder.class);
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

        public /* synthetic */ SyncRequestInfo(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SyncRequestInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SyncRequestInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.protocolVersion_ = 1;
            this.syncType_ = 2;
        }

        public static SyncRequestInfo parseFrom(InputStream inputStream) {
            return (SyncRequestInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SyncRequestInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncRequestInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SyncRequestInfo parseFrom(CodedInputStream codedInputStream) {
            return (SyncRequestInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SyncRequestInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncRequestInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum SyncType implements ProtocolMessageEnum {
            UNKNOWN(0),
            FULL(1),
            INCREMENTAL(2);

            public static final int FULL_VALUE = 1;
            public static final int INCREMENTAL_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<SyncType> internalValueMap = new Internal.EnumLiteMap<SyncType>() { // from class: com.garmin.proto.generated.GDIInReachCalls.SyncRequestInfo.SyncType.1
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
                    return UNKNOWN;
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
        public static final Parser<SyncResponse> PARSER = new AbstractParser<SyncResponse>() { // from class: com.garmin.proto.generated.GDIInReachCalls.SyncResponse.1
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
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SyncResponse_descriptor;
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

        @Override // com.garmin.proto.generated.GDIInReachCalls.SyncResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachCalls.SyncResponseOrBuilder
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
            return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SyncResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncResponse.class, Builder.class);
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
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SyncResponse_descriptor;
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
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SyncResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.SyncResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachCalls.SyncResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachCalls.internal_static_GDI_Proto_InReachCalls_SyncResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncResponse.class, Builder.class);
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
            MISSING_INFO(5),
            UP_TO_DATE(6);

            public static final int BUSY_VALUE = 3;
            public static final int GENERIC_ERROR_VALUE = 2;
            public static final int MISSING_INFO_VALUE = 5;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            public static final int UNSUPPORTED_PROTOCOL_VERSION_VALUE = 4;
            public static final int UP_TO_DATE_VALUE = 6;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIInReachCalls.SyncResponse.Status.1
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
                        return MISSING_INFO;
                    case 6:
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

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
