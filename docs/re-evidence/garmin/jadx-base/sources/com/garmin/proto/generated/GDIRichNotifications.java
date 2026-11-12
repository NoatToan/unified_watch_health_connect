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
import java.util.Iterator;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes6.dex */
public final class GDIRichNotifications {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001aGDIRichNotifications.proto\u0012\u001bGDI.Proto.RichNotifications\u001a\rGDICore.proto\u001a\u0012GDIDataTypes.proto\u001a-GDIRichNotificationEncryptionManagement.proto\"\u0093\u0003\n\u0007Service\u0012H\n\u0011subscribe_request\u0018\u0001 \u0001(\u000b2-.GDI.Proto.RichNotifications.SubscribeRequest\u0012J\n\u0012subscribe_response\u0018\u0002 \u0001(\u000b2..GDI.Proto.RichNotifications.SubscribeResponse\u0012Q\n\u0016encrypted_data_request\u0018\u0003 \u0001(\u000b21.GDI.Proto.RichNotifications.EncryptedDataRequest\u0012S\n\u0017encrypted_data_response\u0018\u0004 \u0001(\u000b22.GDI.Proto.RichNotifications.EncryptedDataResponse\u0012J\n\u0012error_notification\u0018\u0005 \u0001(\u000b2..GDI.Proto.RichNotifications.ErrorNotification\" \u0001\n\u0014EncryptedDataRequest\u0012\u0012\n\nsession_id\u0018\u0001 \u0001(\t\u0012\u0016\n\u000eencrypted_data\u0018\u0002 \u0001(\f\u0012B\n\u0013encrypted_xfer_data\u0018\u0003 \u0001(\u000b2%.GDI.Proto.DataTypes.DataTransferItem\u0012\u0018\n\u0010unencrypted_data\u0018\u0004 \u0001(\f\"¦\u0001\n\u0015EncryptedDataResponse\u0012I\n\u0006status\u0018\u0001 \u0001(\u000e29.GDI.Proto.RichNotifications.EncryptedDataResponse.Status\"B\n\u0006Status\u0012\u0012\n\u000eSTATUS_UNKNOWN\u0010\u0000\u0012\u0012\n\u000eSTATUS_SUCCESS\u0010\u0001\u0012\u0010\n\fSTATUS_ERROR\u0010\u0002\"¦\u0001\n\u0011ErrorNotification\u0012E\n\u0006status\u0018\u0001 \u0001(\u000e25.GDI.Proto.RichNotifications.ErrorNotification.Status\"J\n\u0006Status\u0012\u0012\n\u000eSTATUS_UNKNOWN\u0010\u0000\u0012,\n(STATUS_EU_TIMEOUT_NOTIFICATIONS_DISABLED\u0010\u0001\"Ç\u0001\n\u0013CapabilitiesRequest\u0012\u0017\n\u000fservice_version\u0018\u0001 \u0001(\r\u0012\u001f\n\u0017supports_encrypted_data\u0018\u0002 \u0001(\b2v\n\u0010features_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018( \u0001(\u000b20.GDI.Proto.RichNotifications.CapabilitiesRequest\"ù\u0001\n\u0014CapabilitiesResponse\u0012M\n\rconfiguration\u0018\u0001 \u0001(\u000b26.GDI.Proto.RichNotifications.NotificationConfiguration\u0012\u0017\n\u000fservice_version\u0018\u0002 \u0001(\r2y\n\u0011features_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018( \u0001(\u000b21.GDI.Proto.RichNotifications.CapabilitiesResponse\"#\n\u0010SubscribeRequest\u0012\u000f\n\u0007enabled\u0018\u0001 \u0001(\b\"\u009e\u0001\n\u0011SubscribeResponse\u0012E\n\u0006status\u0018\u0001 \u0001(\u000e25.GDI.Proto.RichNotifications.SubscribeResponse.Status\"B\n\u0006Status\u0012\u0012\n\u000eSTATUS_UNKNOWN\u0010\u0000\u0012\u0012\n\u000eSTATUS_SUCCESS\u0010\u0001\u0012\u0010\n\fSTATUS_ERROR\u0010\u0002\"æ\u0001\n\nActionInfo\u0012@\n\u0004type\u0018\u0001 \u0001(\u000e22.GDI.Proto.RichNotifications.ActionInfo.ActionType\u0012\n\n\u0002id\u0018\u0002 \u0001(\t\u0012\u0014\n\fdisplay_text\u0018\u0003 \u0001(\t\"t\n\nActionType\u0012\u0017\n\u0013ACTION_TYPE_UNKNOWN\u0010\u0000\u0012\u0017\n\u0013ACTION_TYPE_DISMISS\u0010\u0001\u0012\u001a\n\u0016ACTION_TYPE_TEXT_REPLY\u0010\u0002\u0012\u0018\n\u0014ACTION_TYPE_NO_INPUT\u0010\u0003\",\n\u000eNotificationId\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006app_id\u0018\u0002 \u0001(\t\"\u008d\u0001\n\u000eAttachmentItem\u0012\u000e\n\u0006offset\u0018\u0001 \u0001(\r\u0012\f\n\u0004size\u0018\u0002 \u0001(\r\u0012\f\n\u0004data\u0018\u0003 \u0001(\f\u0012:\n\nmedia_type\u0018\u0004 \u0001(\u000e2&.GDI.Proto.RichNotifications.MediaType\u0012\u0013\n\u000btext_offset\u0018\u0005 \u0001(\r\"°\u0007\n\u0010NotificationData\u0012\u0018\n\u0010app_display_name\u0018\u0001 \u0001(\t\u0012\r\n\u0005title\u0018\u0002 \u0001(\t\u0012\u0010\n\bsubtitle\u0018\u0003 \u0001(\t\u0012\f\n\u0004body\u0018\u0004 \u0001(\t\u0012\u0019\n\u0011thread_identifier\u0018\u0005 \u0001(\t\u0012\u0015\n\rdelivery_date\u0018\u0006 \u0001(\r\u0012\u0014\n\fdisplay_date\u0018\u0007 \u0001(\r\u0012O\n\fdisplay_type\u0018\b \u0001(\u000e29.GDI.Proto.RichNotifications.NotificationData.DisplayType\u00128\n\u0007actions\u0018\t \u0003(\u000b2'.GDI.Proto.RichNotifications.ActionInfo\u0012F\n\u0011media_attachments\u0018\n \u0003(\u000b2+.GDI.Proto.RichNotifications.AttachmentItem\u0012=\n\bapp_icon\u0018\u000b \u0001(\u000b2+.GDI.Proto.RichNotifications.AttachmentItem\u0012A\n\fcontact_icon\u0018\f \u0001(\u000b2+.GDI.Proto.RichNotifications.AttachmentItem\u0012@\n\u0004kind\u0018\r \u0001(\u000e22.GDI.Proto.RichNotifications.NotificationData.Kind\u0012D\n\u000fembedded_images\u0018\u000e \u0003(\u000b2+.GDI.Proto.RichNotifications.AttachmentItem\u0012'\n\u001fexpected_media_attachment_count\u0018\u000f \u0001(\r\"Y\n\u000bDisplayType\u0012\u0018\n\u0014DISPLAY_TYPE_UNKNOWN\u0010\u0000\u0012\u0017\n\u0013DISPLAY_TYPE_NORMAL\u0010\u0001\u0012\u0017\n\u0013DISPLAY_TYPE_SILENT\u0010\u0002\"©\u0001\n\u0004Kind\u0012\u0010\n\fKIND_UNKNOWN\u0010\u0000\u0012\u0016\n\u0012KIND_INCOMING_CALL\u0010\u0001\u0012\u0014\n\u0010KIND_MISSED_CALL\u0010\u0002\u0012\u0012\n\u000eKIND_VOICEMAIL\u0010\u0003\u0012\u000e\n\nKIND_ALARM\u0010\u0004\u0012\u0015\n\u0011KIND_NOTIFICATION\u0010\u0005\u0012\u000e\n\nKIND_TIMER\u0010\u0006\u0012\u0016\n\u0012KIND_LIVE_ACTIVITY\u0010\u0007\"ð\u0002\n\u001aNotificationPayloadService\u0012b\n\u001fdata_event_notification_request\u0018\u0001 \u0001(\u000b29.GDI.Proto.RichNotifications.DataEventNotificationRequest\u0012d\n data_event_notification_response\u0018\u0002 \u0001(\u000b2:.GDI.Proto.RichNotifications.DataEventNotificationResponse\u0012B\n\u000eaction_request\u0018\u0003 \u0001(\u000b2*.GDI.Proto.RichNotifications.ActionRequest\u0012D\n\u000faction_response\u0018\u0004 \u0001(\u000b2+.GDI.Proto.RichNotifications.ActionResponse\"\u008e\u0003\n\u001cDataEventNotificationRequest\u0012W\n\nevent_type\u0018\u0001 \u0001(\u000e2C.GDI.Proto.RichNotifications.DataEventNotificationRequest.EventType\u0012D\n\u000fnotification_id\u0018\u0002 \u0001(\u000b2+.GDI.Proto.RichNotifications.NotificationId\u0012H\n\u0011notification_data\u0018\u0003 \u0001(\u000b2-.GDI.Proto.RichNotifications.NotificationData\"\u0084\u0001\n\tEventType\u0012\u0016\n\u0012EVENT_TYPE_UNKNOWN\u0010\u0000\u0012\u0014\n\u0010EVENT_TYPE_ADDED\u0010\u0001\u0012\u0016\n\u0012EVENT_TYPE_REMOVED\u0010\u0002\u0012\u0016\n\u0012EVENT_TYPE_UPDATED\u0010\u0003\u0012\u0019\n\u0015EVENT_TYPE_ATTACHMENT\u0010\u0004\"v\n\u001dDataEventNotificationResponse\u0012\u000f\n\u0007alerted\u0018\u0001 \u0001(\b\u0012D\n\u000fnotification_id\u0018\u0002 \u0001(\u000b2+.GDI.Proto.RichNotifications.NotificationId\"|\n\rActionRequest\u0012D\n\u000fnotification_id\u0018\u0001 \u0001(\u000b2+.GDI.Proto.RichNotifications.NotificationId\u0012\u0011\n\taction_id\u0018\u0002 \u0001(\t\u0012\u0012\n\ntext_reply\u0018\u0003 \u0001(\t\"\u0097\u0001\n\u000eActionResponse\u0012B\n\u0006status\u0018\u0001 \u0001(\u000e22.GDI.Proto.RichNotifications.ActionResponse.Status\"A\n\u0006Status\u0012\u0012\n\u000eSTATUS_UNKNOWN\u0010\u0000\u0012\u0012\n\u000eSTATUS_SUCCESS\u0010\u0001\u0012\u000f\n\u000bSTATUS_FAIL\u0010\u0002\"`\n\u0011DisplayAttributes\u0012\u0010\n\bwidth_px\u0018\u0001 \u0001(\r\u0012\u0011\n\theight_px\u0018\u0002 \u0001(\r\u0012\u0015\n\rmax_byte_size\u0018\u0003 \u0001(\r\u0012\u000f\n\u0007quality\u0018\u0004 \u0001(\r\"ð\u0001\n\u0019NotificationConfiguration\u0012\u0018\n\u0010max_title_length\u0018\u0001 \u0001(\r\u0012\u001b\n\u0013max_subtitle_length\u0018\u0002 \u0001(\r\u0012\u0017\n\u000fmax_body_length\u0018\u0003 \u0001(\r\u0012B\n\nattributes\u0018\u0004 \u0001(\u000b2..GDI.Proto.RichNotifications.DisplayAttributes\u0012?\n\u000fsupported_types\u0018\u0005 \u0003(\u000e2&.GDI.Proto.RichNotifications.MediaType*t\n\tMediaType\u0012\u0016\n\u0012MEDIA_TYPE_UNKNOWN\u0010\u0000\u0012\u0012\n\u000eMEDIA_TYPE_PNG\u0010\u0001\u0012\u0013\n\u000fMEDIA_TYPE_JPEG\u0010\u0002\u0012\u0012\n\u000eMEDIA_TYPE_GIF\u0010\u0003\u0012\u0012\n\u000eMEDIA_TYPE_MP3\u0010\u0004B4\n\u001acom.garmin.proto.generatedB\u0014GDIRichNotificationsH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor(), GDIDataTypes.getDescriptor(), GDIRichNotificationEncryptionManagement.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotifications_ActionInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotifications_ActionInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotifications_ActionRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotifications_ActionRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotifications_ActionResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotifications_ActionResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotifications_AttachmentItem_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotifications_AttachmentItem_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotifications_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotifications_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotifications_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotifications_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotifications_DataEventNotificationRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotifications_DataEventNotificationRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotifications_DataEventNotificationResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotifications_DataEventNotificationResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotifications_DisplayAttributes_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotifications_DisplayAttributes_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotifications_EncryptedDataRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotifications_EncryptedDataRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotifications_EncryptedDataResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotifications_EncryptedDataResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotifications_ErrorNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotifications_ErrorNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotifications_NotificationConfiguration_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotifications_NotificationConfiguration_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotifications_NotificationData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotifications_NotificationData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotifications_NotificationId_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotifications_NotificationId_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotifications_NotificationPayloadService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotifications_NotificationPayloadService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotifications_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotifications_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotifications_SubscribeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotifications_SubscribeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotifications_SubscribeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotifications_SubscribeResponse_fieldAccessorTable;

    public interface ActionInfoOrBuilder extends MessageOrBuilder {
        String getDisplayText();

        ByteString getDisplayTextBytes();

        String getId();

        ByteString getIdBytes();

        ActionInfo.ActionType getType();

        boolean hasDisplayText();

        boolean hasId();

        boolean hasType();
    }

    public interface ActionRequestOrBuilder extends MessageOrBuilder {
        String getActionId();

        ByteString getActionIdBytes();

        NotificationId getNotificationId();

        NotificationIdOrBuilder getNotificationIdOrBuilder();

        String getTextReply();

        ByteString getTextReplyBytes();

        boolean hasActionId();

        boolean hasNotificationId();

        boolean hasTextReply();
    }

    public interface ActionResponseOrBuilder extends MessageOrBuilder {
        ActionResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface AttachmentItemOrBuilder extends MessageOrBuilder {
        ByteString getData();

        MediaType getMediaType();

        int getOffset();

        int getSize();

        int getTextOffset();

        boolean hasData();

        boolean hasMediaType();

        boolean hasOffset();

        boolean hasSize();

        boolean hasTextOffset();
    }

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
        int getServiceVersion();

        boolean getSupportsEncryptedData();

        boolean hasServiceVersion();

        boolean hasSupportsEncryptedData();
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        NotificationConfiguration getConfiguration();

        NotificationConfigurationOrBuilder getConfigurationOrBuilder();

        int getServiceVersion();

        boolean hasConfiguration();

        boolean hasServiceVersion();
    }

    public interface DataEventNotificationRequestOrBuilder extends MessageOrBuilder {
        DataEventNotificationRequest.EventType getEventType();

        NotificationData getNotificationData();

        NotificationDataOrBuilder getNotificationDataOrBuilder();

        NotificationId getNotificationId();

        NotificationIdOrBuilder getNotificationIdOrBuilder();

        boolean hasEventType();

        boolean hasNotificationData();

        boolean hasNotificationId();
    }

    public interface DataEventNotificationResponseOrBuilder extends MessageOrBuilder {
        boolean getAlerted();

        NotificationId getNotificationId();

        NotificationIdOrBuilder getNotificationIdOrBuilder();

        boolean hasAlerted();

        boolean hasNotificationId();
    }

    public interface DisplayAttributesOrBuilder extends MessageOrBuilder {
        int getHeightPx();

        int getMaxByteSize();

        int getQuality();

        int getWidthPx();

        boolean hasHeightPx();

        boolean hasMaxByteSize();

        boolean hasQuality();

        boolean hasWidthPx();
    }

    public interface EncryptedDataRequestOrBuilder extends MessageOrBuilder {
        ByteString getEncryptedData();

        GDIDataTypes.DataTransferItem getEncryptedXferData();

        GDIDataTypes.DataTransferItemOrBuilder getEncryptedXferDataOrBuilder();

        String getSessionId();

        ByteString getSessionIdBytes();

        ByteString getUnencryptedData();

        boolean hasEncryptedData();

        boolean hasEncryptedXferData();

        boolean hasSessionId();

        boolean hasUnencryptedData();
    }

    public interface EncryptedDataResponseOrBuilder extends MessageOrBuilder {
        EncryptedDataResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface ErrorNotificationOrBuilder extends MessageOrBuilder {
        ErrorNotification.Status getStatus();

        boolean hasStatus();
    }

    public interface NotificationConfigurationOrBuilder extends MessageOrBuilder {
        DisplayAttributes getAttributes();

        DisplayAttributesOrBuilder getAttributesOrBuilder();

        int getMaxBodyLength();

        int getMaxSubtitleLength();

        int getMaxTitleLength();

        MediaType getSupportedTypes(int i14);

        int getSupportedTypesCount();

        List<MediaType> getSupportedTypesList();

        boolean hasAttributes();

        boolean hasMaxBodyLength();

        boolean hasMaxSubtitleLength();

        boolean hasMaxTitleLength();
    }

    public interface NotificationDataOrBuilder extends MessageOrBuilder {
        ActionInfo getActions(int i14);

        int getActionsCount();

        List<ActionInfo> getActionsList();

        ActionInfoOrBuilder getActionsOrBuilder(int i14);

        List<? extends ActionInfoOrBuilder> getActionsOrBuilderList();

        String getAppDisplayName();

        ByteString getAppDisplayNameBytes();

        AttachmentItem getAppIcon();

        AttachmentItemOrBuilder getAppIconOrBuilder();

        String getBody();

        ByteString getBodyBytes();

        AttachmentItem getContactIcon();

        AttachmentItemOrBuilder getContactIconOrBuilder();

        int getDeliveryDate();

        int getDisplayDate();

        NotificationData.DisplayType getDisplayType();

        AttachmentItem getEmbeddedImages(int i14);

        int getEmbeddedImagesCount();

        List<AttachmentItem> getEmbeddedImagesList();

        AttachmentItemOrBuilder getEmbeddedImagesOrBuilder(int i14);

        List<? extends AttachmentItemOrBuilder> getEmbeddedImagesOrBuilderList();

        int getExpectedMediaAttachmentCount();

        NotificationData.Kind getKind();

        AttachmentItem getMediaAttachments(int i14);

        int getMediaAttachmentsCount();

        List<AttachmentItem> getMediaAttachmentsList();

        AttachmentItemOrBuilder getMediaAttachmentsOrBuilder(int i14);

        List<? extends AttachmentItemOrBuilder> getMediaAttachmentsOrBuilderList();

        String getSubtitle();

        ByteString getSubtitleBytes();

        String getThreadIdentifier();

        ByteString getThreadIdentifierBytes();

        String getTitle();

        ByteString getTitleBytes();

        boolean hasAppDisplayName();

        boolean hasAppIcon();

        boolean hasBody();

        boolean hasContactIcon();

        boolean hasDeliveryDate();

        boolean hasDisplayDate();

        boolean hasDisplayType();

        boolean hasExpectedMediaAttachmentCount();

        boolean hasKind();

        boolean hasSubtitle();

        boolean hasThreadIdentifier();

        boolean hasTitle();
    }

    public interface NotificationIdOrBuilder extends MessageOrBuilder {
        String getAppId();

        ByteString getAppIdBytes();

        String getId();

        ByteString getIdBytes();

        boolean hasAppId();

        boolean hasId();
    }

    public interface NotificationPayloadServiceOrBuilder extends MessageOrBuilder {
        ActionRequest getActionRequest();

        ActionRequestOrBuilder getActionRequestOrBuilder();

        ActionResponse getActionResponse();

        ActionResponseOrBuilder getActionResponseOrBuilder();

        DataEventNotificationRequest getDataEventNotificationRequest();

        DataEventNotificationRequestOrBuilder getDataEventNotificationRequestOrBuilder();

        DataEventNotificationResponse getDataEventNotificationResponse();

        DataEventNotificationResponseOrBuilder getDataEventNotificationResponseOrBuilder();

        boolean hasActionRequest();

        boolean hasActionResponse();

        boolean hasDataEventNotificationRequest();

        boolean hasDataEventNotificationResponse();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        EncryptedDataRequest getEncryptedDataRequest();

        EncryptedDataRequestOrBuilder getEncryptedDataRequestOrBuilder();

        EncryptedDataResponse getEncryptedDataResponse();

        EncryptedDataResponseOrBuilder getEncryptedDataResponseOrBuilder();

        ErrorNotification getErrorNotification();

        ErrorNotificationOrBuilder getErrorNotificationOrBuilder();

        SubscribeRequest getSubscribeRequest();

        SubscribeRequestOrBuilder getSubscribeRequestOrBuilder();

        SubscribeResponse getSubscribeResponse();

        SubscribeResponseOrBuilder getSubscribeResponseOrBuilder();

        boolean hasEncryptedDataRequest();

        boolean hasEncryptedDataResponse();

        boolean hasErrorNotification();

        boolean hasSubscribeRequest();

        boolean hasSubscribeResponse();
    }

    public interface SubscribeRequestOrBuilder extends MessageOrBuilder {
        boolean getEnabled();

        boolean hasEnabled();
    }

    public interface SubscribeResponseOrBuilder extends MessageOrBuilder {
        SubscribeResponse.Status getStatus();

        boolean hasStatus();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_RichNotifications_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_RichNotifications_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"SubscribeRequest", "SubscribeResponse", "EncryptedDataRequest", "EncryptedDataResponse", "ErrorNotification"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_RichNotifications_EncryptedDataRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_RichNotifications_EncryptedDataRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"SessionId", "EncryptedData", "EncryptedXferData", "UnencryptedData"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_RichNotifications_EncryptedDataResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_RichNotifications_EncryptedDataResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Status"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_RichNotifications_ErrorNotification_descriptor = descriptor5;
        internal_static_GDI_Proto_RichNotifications_ErrorNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Status"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_RichNotifications_CapabilitiesRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_RichNotifications_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"ServiceVersion", "SupportsEncryptedData"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_RichNotifications_CapabilitiesResponse_descriptor = descriptor7;
        internal_static_GDI_Proto_RichNotifications_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Configuration", "ServiceVersion"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_RichNotifications_SubscribeRequest_descriptor = descriptor8;
        internal_static_GDI_Proto_RichNotifications_SubscribeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Enabled"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_RichNotifications_SubscribeResponse_descriptor = descriptor9;
        internal_static_GDI_Proto_RichNotifications_SubscribeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Status"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_RichNotifications_ActionInfo_descriptor = descriptor10;
        internal_static_GDI_Proto_RichNotifications_ActionInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Type", "Id", "DisplayText"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_RichNotifications_NotificationId_descriptor = descriptor11;
        internal_static_GDI_Proto_RichNotifications_NotificationId_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Id", "AppId"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_RichNotifications_AttachmentItem_descriptor = descriptor12;
        internal_static_GDI_Proto_RichNotifications_AttachmentItem_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Offset", "Size", "Data", "MediaType", "TextOffset"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_RichNotifications_NotificationData_descriptor = descriptor13;
        internal_static_GDI_Proto_RichNotifications_NotificationData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"AppDisplayName", "Title", "Subtitle", "Body", "ThreadIdentifier", "DeliveryDate", "DisplayDate", "DisplayType", "Actions", "MediaAttachments", "AppIcon", "ContactIcon", "Kind", "EmbeddedImages", "ExpectedMediaAttachmentCount"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_GDI_Proto_RichNotifications_NotificationPayloadService_descriptor = descriptor14;
        internal_static_GDI_Proto_RichNotifications_NotificationPayloadService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"DataEventNotificationRequest", "DataEventNotificationResponse", "ActionRequest", "ActionResponse"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(13);
        internal_static_GDI_Proto_RichNotifications_DataEventNotificationRequest_descriptor = descriptor15;
        internal_static_GDI_Proto_RichNotifications_DataEventNotificationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"EventType", "NotificationId", "NotificationData"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(14);
        internal_static_GDI_Proto_RichNotifications_DataEventNotificationResponse_descriptor = descriptor16;
        internal_static_GDI_Proto_RichNotifications_DataEventNotificationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Alerted", "NotificationId"});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(15);
        internal_static_GDI_Proto_RichNotifications_ActionRequest_descriptor = descriptor17;
        internal_static_GDI_Proto_RichNotifications_ActionRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"NotificationId", "ActionId", "TextReply"});
        Descriptors.Descriptor descriptor18 = getDescriptor().getMessageTypes().get(16);
        internal_static_GDI_Proto_RichNotifications_ActionResponse_descriptor = descriptor18;
        internal_static_GDI_Proto_RichNotifications_ActionResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"Status"});
        Descriptors.Descriptor descriptor19 = getDescriptor().getMessageTypes().get(17);
        internal_static_GDI_Proto_RichNotifications_DisplayAttributes_descriptor = descriptor19;
        internal_static_GDI_Proto_RichNotifications_DisplayAttributes_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"WidthPx", "HeightPx", "MaxByteSize", "Quality"});
        Descriptors.Descriptor descriptor20 = getDescriptor().getMessageTypes().get(18);
        internal_static_GDI_Proto_RichNotifications_NotificationConfiguration_descriptor = descriptor20;
        internal_static_GDI_Proto_RichNotifications_NotificationConfiguration_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"MaxTitleLength", "MaxSubtitleLength", "MaxBodyLength", "Attributes", "SupportedTypes"});
        GDICore.getDescriptor();
        GDIDataTypes.getDescriptor();
        GDIRichNotificationEncryptionManagement.getDescriptor();
    }

    private GDIRichNotifications() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.featuresRequest);
        extensionRegistryLite.add(CapabilitiesResponse.featuresResponse);
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int FEATURES_REQUEST_FIELD_NUMBER = 40;
        public static final int SERVICE_VERSION_FIELD_NUMBER = 1;
        public static final int SUPPORTS_ENCRYPTED_DATA_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int serviceVersion_;
        private boolean supportsEncryptedData_;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIRichNotifications.CapabilitiesRequest.1
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, CapabilitiesRequest> featuresRequest = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesRequest.class, getDefaultInstance());

        private CapabilitiesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.serviceVersion_ = 0;
            this.supportsEncryptedData_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_CapabilitiesRequest_descriptor;
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
            if ((!hasServiceVersion() || getServiceVersion() == capabilitiesRequest.getServiceVersion()) && hasSupportsEncryptedData() == capabilitiesRequest.hasSupportsEncryptedData()) {
                return (!hasSupportsEncryptedData() || getSupportsEncryptedData() == capabilitiesRequest.getSupportsEncryptedData()) && getUnknownFields().equals(capabilitiesRequest.getUnknownFields());
            }
            return false;
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
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.serviceVersion_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(2, this.supportsEncryptedData_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.CapabilitiesRequestOrBuilder
        public int getServiceVersion() {
            return this.serviceVersion_;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.CapabilitiesRequestOrBuilder
        public boolean getSupportsEncryptedData() {
            return this.supportsEncryptedData_;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.CapabilitiesRequestOrBuilder
        public boolean hasServiceVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.CapabilitiesRequestOrBuilder
        public boolean hasSupportsEncryptedData() {
            return (this.bitField0_ & 2) != 0;
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
            if (hasSupportsEncryptedData()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getSupportsEncryptedData());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.supportsEncryptedData_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesRequestOrBuilder {
            private int bitField0_;
            private int serviceVersion_;
            private boolean supportsEncryptedData_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(CapabilitiesRequest capabilitiesRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    capabilitiesRequest.serviceVersion_ = this.serviceVersion_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    capabilitiesRequest.supportsEncryptedData_ = this.supportsEncryptedData_;
                    i14 |= 2;
                }
                capabilitiesRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_CapabilitiesRequest_descriptor;
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
                this.supportsEncryptedData_ = false;
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

            public Builder clearSupportsEncryptedData() {
                this.bitField0_ &= -3;
                this.supportsEncryptedData_ = false;
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
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_CapabilitiesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.CapabilitiesRequestOrBuilder
            public int getServiceVersion() {
                return this.serviceVersion_;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.CapabilitiesRequestOrBuilder
            public boolean getSupportsEncryptedData() {
                return this.supportsEncryptedData_;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.CapabilitiesRequestOrBuilder
            public boolean hasServiceVersion() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.CapabilitiesRequestOrBuilder
            public boolean hasSupportsEncryptedData() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                                } else if (tag == 16) {
                                    this.supportsEncryptedData_ = codedInputStream.readBool();
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

            public Builder setServiceVersion(int i14) {
                this.serviceVersion_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSupportsEncryptedData(boolean z14) {
                this.supportsEncryptedData_ = z14;
                this.bitField0_ |= 2;
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
                if (capabilitiesRequest.hasSupportsEncryptedData()) {
                    setSupportsEncryptedData(capabilitiesRequest.getSupportsEncryptedData());
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

        public static CapabilitiesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CapabilitiesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ CapabilitiesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CapabilitiesRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private CapabilitiesRequest() {
            this.serviceVersion_ = 0;
            this.supportsEncryptedData_ = false;
            this.memoizedIsInitialized = (byte) -1;
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

    public static final class DisplayAttributes extends GeneratedMessageV3 implements DisplayAttributesOrBuilder {
        public static final int HEIGHT_PX_FIELD_NUMBER = 2;
        public static final int MAX_BYTE_SIZE_FIELD_NUMBER = 3;
        public static final int QUALITY_FIELD_NUMBER = 4;
        public static final int WIDTH_PX_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int heightPx_;
        private int maxByteSize_;
        private byte memoizedIsInitialized;
        private int quality_;
        private int widthPx_;
        private static final DisplayAttributes DEFAULT_INSTANCE = new DisplayAttributes();

        @Deprecated
        public static final Parser<DisplayAttributes> PARSER = new AbstractParser<DisplayAttributes>() { // from class: com.garmin.proto.generated.GDIRichNotifications.DisplayAttributes.1
            @Override // com.google.protobuf.Parser
            public DisplayAttributes parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DisplayAttributes.newBuilder();
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

        private DisplayAttributes(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.widthPx_ = 0;
            this.heightPx_ = 0;
            this.maxByteSize_ = 0;
            this.quality_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DisplayAttributes getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_DisplayAttributes_descriptor;
        }

        public static Builder newBuilder(DisplayAttributes displayAttributes) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(displayAttributes);
        }

        public static DisplayAttributes parseDelimitedFrom(InputStream inputStream) {
            return (DisplayAttributes) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DisplayAttributes parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DisplayAttributes> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DisplayAttributes)) {
                return super.equals(obj);
            }
            DisplayAttributes displayAttributes = (DisplayAttributes) obj;
            if (hasWidthPx() != displayAttributes.hasWidthPx()) {
                return false;
            }
            if ((hasWidthPx() && getWidthPx() != displayAttributes.getWidthPx()) || hasHeightPx() != displayAttributes.hasHeightPx()) {
                return false;
            }
            if ((hasHeightPx() && getHeightPx() != displayAttributes.getHeightPx()) || hasMaxByteSize() != displayAttributes.hasMaxByteSize()) {
                return false;
            }
            if ((!hasMaxByteSize() || getMaxByteSize() == displayAttributes.getMaxByteSize()) && hasQuality() == displayAttributes.hasQuality()) {
                return (!hasQuality() || getQuality() == displayAttributes.getQuality()) && getUnknownFields().equals(displayAttributes.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.DisplayAttributesOrBuilder
        public int getHeightPx() {
            return this.heightPx_;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.DisplayAttributesOrBuilder
        public int getMaxByteSize() {
            return this.maxByteSize_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DisplayAttributes> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.DisplayAttributesOrBuilder
        public int getQuality() {
            return this.quality_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.widthPx_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.heightPx_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.maxByteSize_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.quality_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.DisplayAttributesOrBuilder
        public int getWidthPx() {
            return this.widthPx_;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.DisplayAttributesOrBuilder
        public boolean hasHeightPx() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.DisplayAttributesOrBuilder
        public boolean hasMaxByteSize() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.DisplayAttributesOrBuilder
        public boolean hasQuality() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.DisplayAttributesOrBuilder
        public boolean hasWidthPx() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasWidthPx()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getWidthPx();
            }
            if (hasHeightPx()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getHeightPx();
            }
            if (hasMaxByteSize()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getMaxByteSize();
            }
            if (hasQuality()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getQuality();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_DisplayAttributes_fieldAccessorTable.ensureFieldAccessorsInitialized(DisplayAttributes.class, Builder.class);
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
            return new DisplayAttributes();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.widthPx_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.heightPx_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.maxByteSize_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.quality_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DisplayAttributesOrBuilder {
            private int bitField0_;
            private int heightPx_;
            private int maxByteSize_;
            private int quality_;
            private int widthPx_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(DisplayAttributes displayAttributes) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    displayAttributes.widthPx_ = this.widthPx_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    displayAttributes.heightPx_ = this.heightPx_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    displayAttributes.maxByteSize_ = this.maxByteSize_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    displayAttributes.quality_ = this.quality_;
                    i14 |= 8;
                }
                displayAttributes.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_DisplayAttributes_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DisplayAttributes build() {
                DisplayAttributes displayAttributesBuildPartial = buildPartial();
                if (displayAttributesBuildPartial.isInitialized()) {
                    return displayAttributesBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) displayAttributesBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DisplayAttributes buildPartial() {
                DisplayAttributes displayAttributes = new DisplayAttributes(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(displayAttributes);
                }
                onBuilt();
                return displayAttributes;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.widthPx_ = 0;
                this.heightPx_ = 0;
                this.maxByteSize_ = 0;
                this.quality_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHeightPx() {
                this.bitField0_ &= -3;
                this.heightPx_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxByteSize() {
                this.bitField0_ &= -5;
                this.maxByteSize_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearQuality() {
                this.bitField0_ &= -9;
                this.quality_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWidthPx() {
                this.bitField0_ &= -2;
                this.widthPx_ = 0;
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
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_DisplayAttributes_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.DisplayAttributesOrBuilder
            public int getHeightPx() {
                return this.heightPx_;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.DisplayAttributesOrBuilder
            public int getMaxByteSize() {
                return this.maxByteSize_;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.DisplayAttributesOrBuilder
            public int getQuality() {
                return this.quality_;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.DisplayAttributesOrBuilder
            public int getWidthPx() {
                return this.widthPx_;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.DisplayAttributesOrBuilder
            public boolean hasHeightPx() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.DisplayAttributesOrBuilder
            public boolean hasMaxByteSize() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.DisplayAttributesOrBuilder
            public boolean hasQuality() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.DisplayAttributesOrBuilder
            public boolean hasWidthPx() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_DisplayAttributes_fieldAccessorTable.ensureFieldAccessorsInitialized(DisplayAttributes.class, Builder.class);
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
                                    this.widthPx_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.heightPx_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.maxByteSize_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.quality_ = codedInputStream.readUInt32();
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

            public Builder setHeightPx(int i14) {
                this.heightPx_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMaxByteSize(int i14) {
                this.maxByteSize_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setQuality(int i14) {
                this.quality_ = i14;
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

            public Builder setWidthPx(int i14) {
                this.widthPx_ = i14;
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
            public DisplayAttributes getDefaultInstanceForType() {
                return DisplayAttributes.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DisplayAttributes) {
                    return mergeFrom((DisplayAttributes) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DisplayAttributes displayAttributes) {
                if (displayAttributes == DisplayAttributes.getDefaultInstance()) {
                    return this;
                }
                if (displayAttributes.hasWidthPx()) {
                    setWidthPx(displayAttributes.getWidthPx());
                }
                if (displayAttributes.hasHeightPx()) {
                    setHeightPx(displayAttributes.getHeightPx());
                }
                if (displayAttributes.hasMaxByteSize()) {
                    setMaxByteSize(displayAttributes.getMaxByteSize());
                }
                if (displayAttributes.hasQuality()) {
                    setQuality(displayAttributes.getQuality());
                }
                mergeUnknownFields(displayAttributes.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DisplayAttributes getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DisplayAttributes parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DisplayAttributes) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DisplayAttributes parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DisplayAttributes parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DisplayAttributes parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DisplayAttributes parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DisplayAttributes parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DisplayAttributes parseFrom(InputStream inputStream) {
            return (DisplayAttributes) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ DisplayAttributes(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DisplayAttributes parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DisplayAttributes) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private DisplayAttributes() {
            this.widthPx_ = 0;
            this.heightPx_ = 0;
            this.maxByteSize_ = 0;
            this.quality_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DisplayAttributes parseFrom(CodedInputStream codedInputStream) {
            return (DisplayAttributes) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DisplayAttributes parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DisplayAttributes) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SubscribeRequest extends GeneratedMessageV3 implements SubscribeRequestOrBuilder {
        public static final int ENABLED_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean enabled_;
        private byte memoizedIsInitialized;
        private static final SubscribeRequest DEFAULT_INSTANCE = new SubscribeRequest();

        @Deprecated
        public static final Parser<SubscribeRequest> PARSER = new AbstractParser<SubscribeRequest>() { // from class: com.garmin.proto.generated.GDIRichNotifications.SubscribeRequest.1
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

        private SubscribeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.enabled_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SubscribeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_SubscribeRequest_descriptor;
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
            if (hasEnabled() != subscribeRequest.hasEnabled()) {
                return false;
            }
            return (!hasEnabled() || getEnabled() == subscribeRequest.getEnabled()) && getUnknownFields().equals(subscribeRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.SubscribeRequestOrBuilder
        public boolean getEnabled() {
            return this.enabled_;
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.enabled_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.SubscribeRequestOrBuilder
        public boolean hasEnabled() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getEnabled());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_SubscribeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SubscribeRequest.class, Builder.class);
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
                codedOutputStream.writeBool(1, this.enabled_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SubscribeRequestOrBuilder {
            private int bitField0_;
            private boolean enabled_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(SubscribeRequest subscribeRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    subscribeRequest.enabled_ = this.enabled_;
                } else {
                    i14 = 0;
                }
                subscribeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_SubscribeRequest_descriptor;
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
                this.enabled_ = false;
                return this;
            }

            public Builder clearEnabled() {
                this.bitField0_ &= -2;
                this.enabled_ = false;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_SubscribeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.SubscribeRequestOrBuilder
            public boolean getEnabled() {
                return this.enabled_;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.SubscribeRequestOrBuilder
            public boolean hasEnabled() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_SubscribeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SubscribeRequest.class, Builder.class);
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
                                    this.enabled_ = codedInputStream.readBool();
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

            public Builder setEnabled(boolean z14) {
                this.enabled_ = z14;
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
                if (subscribeRequest.hasEnabled()) {
                    setEnabled(subscribeRequest.getEnabled());
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
            this.enabled_ = false;
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

    public static final class ActionInfo extends GeneratedMessageV3 implements ActionInfoOrBuilder {
        public static final int DISPLAY_TEXT_FIELD_NUMBER = 3;
        public static final int ID_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object displayText_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private int type_;
        private static final ActionInfo DEFAULT_INSTANCE = new ActionInfo();

        @Deprecated
        public static final Parser<ActionInfo> PARSER = new AbstractParser<ActionInfo>() { // from class: com.garmin.proto.generated.GDIRichNotifications.ActionInfo.1
            @Override // com.google.protobuf.Parser
            public ActionInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ActionInfo.newBuilder();
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

        private ActionInfo() {
            this.type_ = 0;
            this.id_ = "";
            this.displayText_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.id_ = "";
            this.displayText_ = "";
        }

        public static ActionInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_ActionInfo_descriptor;
        }

        public static Builder newBuilder(ActionInfo actionInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(actionInfo);
        }

        public static ActionInfo parseDelimitedFrom(InputStream inputStream) {
            return (ActionInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ActionInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ActionInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActionInfo)) {
                return super.equals(obj);
            }
            ActionInfo actionInfo = (ActionInfo) obj;
            if (hasType() != actionInfo.hasType()) {
                return false;
            }
            if ((hasType() && this.type_ != actionInfo.type_) || hasId() != actionInfo.hasId()) {
                return false;
            }
            if ((!hasId() || getId().equals(actionInfo.getId())) && hasDisplayText() == actionInfo.hasDisplayText()) {
                return (!hasDisplayText() || getDisplayText().equals(actionInfo.getDisplayText())) && getUnknownFields().equals(actionInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ActionInfoOrBuilder
        public String getDisplayText() {
            Object obj = this.displayText_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.displayText_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ActionInfoOrBuilder
        public ByteString getDisplayTextBytes() {
            Object obj = this.displayText_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.displayText_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ActionInfoOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.id_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ActionInfoOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ActionInfo> getParserForType() {
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
                iComputeEnumSize += GeneratedMessageV3.computeStringSize(2, this.id_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += GeneratedMessageV3.computeStringSize(3, this.displayText_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ActionInfoOrBuilder
        public ActionType getType() {
            ActionType actionTypeForNumber = ActionType.forNumber(this.type_);
            return actionTypeForNumber == null ? ActionType.ACTION_TYPE_UNKNOWN : actionTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ActionInfoOrBuilder
        public boolean hasDisplayText() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ActionInfoOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ActionInfoOrBuilder
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
            if (hasId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getId().hashCode();
            }
            if (hasDisplayText()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getDisplayText().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_ActionInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionInfo.class, Builder.class);
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
            return new ActionInfo();
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
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.id_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.displayText_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActionInfoOrBuilder {
            private int bitField0_;
            private Object displayText_;
            private Object id_;
            private int type_;

            private Builder() {
                this.type_ = 0;
                this.id_ = "";
                this.displayText_ = "";
            }

            private void buildPartial0(ActionInfo actionInfo) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    actionInfo.type_ = this.type_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    actionInfo.id_ = this.id_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    actionInfo.displayText_ = this.displayText_;
                    i14 |= 4;
                }
                actionInfo.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_ActionInfo_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionInfo build() {
                ActionInfo actionInfoBuildPartial = buildPartial();
                if (actionInfoBuildPartial.isInitialized()) {
                    return actionInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) actionInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionInfo buildPartial() {
                ActionInfo actionInfo = new ActionInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(actionInfo);
                }
                onBuilt();
                return actionInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.type_ = 0;
                this.id_ = "";
                this.displayText_ = "";
                return this;
            }

            public Builder clearDisplayText() {
                this.displayText_ = ActionInfo.getDefaultInstance().getDisplayText();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearId() {
                this.id_ = ActionInfo.getDefaultInstance().getId();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearType() {
                this.bitField0_ &= -2;
                this.type_ = 0;
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
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_ActionInfo_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ActionInfoOrBuilder
            public String getDisplayText() {
                Object obj = this.displayText_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.displayText_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ActionInfoOrBuilder
            public ByteString getDisplayTextBytes() {
                Object obj = this.displayText_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.displayText_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ActionInfoOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.id_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ActionInfoOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ActionInfoOrBuilder
            public ActionType getType() {
                ActionType actionTypeForNumber = ActionType.forNumber(this.type_);
                return actionTypeForNumber == null ? ActionType.ACTION_TYPE_UNKNOWN : actionTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ActionInfoOrBuilder
            public boolean hasDisplayText() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ActionInfoOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ActionInfoOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_ActionInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionInfo.class, Builder.class);
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
                                    if (ActionType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.type_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    this.id_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.displayText_ = codedInputStream.readBytes();
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

            public Builder setDisplayText(String str) {
                str.getClass();
                this.displayText_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setDisplayTextBytes(ByteString byteString) {
                byteString.getClass();
                this.displayText_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setId(String str) {
                str.getClass();
                this.id_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                byteString.getClass();
                this.id_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setType(ActionType actionType) {
                actionType.getClass();
                this.bitField0_ |= 1;
                this.type_ = actionType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ActionInfo getDefaultInstanceForType() {
                return ActionInfo.getDefaultInstance();
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
                this.id_ = "";
                this.displayText_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ActionInfo) {
                    return mergeFrom((ActionInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ActionInfo actionInfo) {
                if (actionInfo == ActionInfo.getDefaultInstance()) {
                    return this;
                }
                if (actionInfo.hasType()) {
                    setType(actionInfo.getType());
                }
                if (actionInfo.hasId()) {
                    this.id_ = actionInfo.id_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (actionInfo.hasDisplayText()) {
                    this.displayText_ = actionInfo.displayText_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                mergeUnknownFields(actionInfo.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ActionInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ActionInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ActionInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ActionInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ActionInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ActionInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ActionInfo parseFrom(InputStream inputStream) {
            return (ActionInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ActionInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionInfo parseFrom(CodedInputStream codedInputStream) {
            return (ActionInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ActionInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private ActionInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.type_ = 0;
            this.id_ = "";
            this.displayText_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public enum ActionType implements ProtocolMessageEnum {
            ACTION_TYPE_UNKNOWN(0),
            ACTION_TYPE_DISMISS(1),
            ACTION_TYPE_TEXT_REPLY(2),
            ACTION_TYPE_NO_INPUT(3);

            public static final int ACTION_TYPE_DISMISS_VALUE = 1;
            public static final int ACTION_TYPE_NO_INPUT_VALUE = 3;
            public static final int ACTION_TYPE_TEXT_REPLY_VALUE = 2;
            public static final int ACTION_TYPE_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ActionType> internalValueMap = new Internal.EnumLiteMap<ActionType>() { // from class: com.garmin.proto.generated.GDIRichNotifications.ActionInfo.ActionType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ActionType findValueByNumber(int i14) {
                    return ActionType.forNumber(i14);
                }
            };
            private static final ActionType[] VALUES = values();

            ActionType(int i14) {
                this.value = i14;
            }

            public static ActionType forNumber(int i14) {
                if (i14 == 0) {
                    return ACTION_TYPE_UNKNOWN;
                }
                if (i14 == 1) {
                    return ACTION_TYPE_DISMISS;
                }
                if (i14 == 2) {
                    return ACTION_TYPE_TEXT_REPLY;
                }
                if (i14 != 3) {
                    return null;
                }
                return ACTION_TYPE_NO_INPUT;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ActionInfo.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ActionType> internalGetValueMap() {
                return internalValueMap;
            }

            public static ActionType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ActionType valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public /* synthetic */ ActionInfo(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class ActionRequest extends GeneratedMessageV3 implements ActionRequestOrBuilder {
        public static final int ACTION_ID_FIELD_NUMBER = 2;
        public static final int NOTIFICATION_ID_FIELD_NUMBER = 1;
        public static final int TEXT_REPLY_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private volatile Object actionId_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private NotificationId notificationId_;
        private volatile Object textReply_;
        private static final ActionRequest DEFAULT_INSTANCE = new ActionRequest();

        @Deprecated
        public static final Parser<ActionRequest> PARSER = new AbstractParser<ActionRequest>() { // from class: com.garmin.proto.generated.GDIRichNotifications.ActionRequest.1
            @Override // com.google.protobuf.Parser
            public ActionRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ActionRequest.newBuilder();
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

        private ActionRequest() {
            this.actionId_ = "";
            this.textReply_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.actionId_ = "";
            this.textReply_ = "";
        }

        public static ActionRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_ActionRequest_descriptor;
        }

        public static Builder newBuilder(ActionRequest actionRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(actionRequest);
        }

        public static ActionRequest parseDelimitedFrom(InputStream inputStream) {
            return (ActionRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ActionRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ActionRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActionRequest)) {
                return super.equals(obj);
            }
            ActionRequest actionRequest = (ActionRequest) obj;
            if (hasNotificationId() != actionRequest.hasNotificationId()) {
                return false;
            }
            if ((hasNotificationId() && !getNotificationId().equals(actionRequest.getNotificationId())) || hasActionId() != actionRequest.hasActionId()) {
                return false;
            }
            if ((!hasActionId() || getActionId().equals(actionRequest.getActionId())) && hasTextReply() == actionRequest.hasTextReply()) {
                return (!hasTextReply() || getTextReply().equals(actionRequest.getTextReply())) && getUnknownFields().equals(actionRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ActionRequestOrBuilder
        public String getActionId() {
            Object obj = this.actionId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.actionId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ActionRequestOrBuilder
        public ByteString getActionIdBytes() {
            Object obj = this.actionId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.actionId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ActionRequestOrBuilder
        public NotificationId getNotificationId() {
            NotificationId notificationId = this.notificationId_;
            return notificationId == null ? NotificationId.getDefaultInstance() : notificationId;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ActionRequestOrBuilder
        public NotificationIdOrBuilder getNotificationIdOrBuilder() {
            NotificationId notificationId = this.notificationId_;
            return notificationId == null ? NotificationId.getDefaultInstance() : notificationId;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ActionRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getNotificationId()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += GeneratedMessageV3.computeStringSize(2, this.actionId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += GeneratedMessageV3.computeStringSize(3, this.textReply_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ActionRequestOrBuilder
        public String getTextReply() {
            Object obj = this.textReply_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.textReply_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ActionRequestOrBuilder
        public ByteString getTextReplyBytes() {
            Object obj = this.textReply_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.textReply_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ActionRequestOrBuilder
        public boolean hasActionId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ActionRequestOrBuilder
        public boolean hasNotificationId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ActionRequestOrBuilder
        public boolean hasTextReply() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasNotificationId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getNotificationId().hashCode();
            }
            if (hasActionId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getActionId().hashCode();
            }
            if (hasTextReply()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getTextReply().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_ActionRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionRequest.class, Builder.class);
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
            return new ActionRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getNotificationId());
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.actionId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.textReply_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActionRequestOrBuilder {
            private Object actionId_;
            private int bitField0_;
            private SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> notificationIdBuilder_;
            private NotificationId notificationId_;
            private Object textReply_;

            private Builder() {
                this.actionId_ = "";
                this.textReply_ = "";
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ActionRequest actionRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                    actionRequest.notificationId_ = singleFieldBuilderV3 == null ? this.notificationId_ : (NotificationId) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    actionRequest.actionId_ = this.actionId_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    actionRequest.textReply_ = this.textReply_;
                    i14 |= 4;
                }
                actionRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_ActionRequest_descriptor;
            }

            private SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> getNotificationIdFieldBuilder() {
                if (this.notificationIdBuilder_ == null) {
                    this.notificationIdBuilder_ = new SingleFieldBuilderV3<>(getNotificationId(), getParentForChildren(), isClean());
                    this.notificationId_ = null;
                }
                return this.notificationIdBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getNotificationIdFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionRequest build() {
                ActionRequest actionRequestBuildPartial = buildPartial();
                if (actionRequestBuildPartial.isInitialized()) {
                    return actionRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) actionRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionRequest buildPartial() {
                ActionRequest actionRequest = new ActionRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(actionRequest);
                }
                onBuilt();
                return actionRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.notificationId_ = null;
                SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.notificationIdBuilder_ = null;
                }
                this.actionId_ = "";
                this.textReply_ = "";
                return this;
            }

            public Builder clearActionId() {
                this.actionId_ = ActionRequest.getDefaultInstance().getActionId();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearNotificationId() {
                this.bitField0_ &= -2;
                this.notificationId_ = null;
                SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.notificationIdBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearTextReply() {
                this.textReply_ = ActionRequest.getDefaultInstance().getTextReply();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ActionRequestOrBuilder
            public String getActionId() {
                Object obj = this.actionId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.actionId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ActionRequestOrBuilder
            public ByteString getActionIdBytes() {
                Object obj = this.actionId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.actionId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_ActionRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ActionRequestOrBuilder
            public NotificationId getNotificationId() {
                SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (NotificationId) singleFieldBuilderV3.getMessage();
                }
                NotificationId notificationId = this.notificationId_;
                return notificationId == null ? NotificationId.getDefaultInstance() : notificationId;
            }

            public NotificationId.Builder getNotificationIdBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (NotificationId.Builder) getNotificationIdFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ActionRequestOrBuilder
            public NotificationIdOrBuilder getNotificationIdOrBuilder() {
                SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (NotificationIdOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                NotificationId notificationId = this.notificationId_;
                return notificationId == null ? NotificationId.getDefaultInstance() : notificationId;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ActionRequestOrBuilder
            public String getTextReply() {
                Object obj = this.textReply_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.textReply_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ActionRequestOrBuilder
            public ByteString getTextReplyBytes() {
                Object obj = this.textReply_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.textReply_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ActionRequestOrBuilder
            public boolean hasActionId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ActionRequestOrBuilder
            public boolean hasNotificationId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ActionRequestOrBuilder
            public boolean hasTextReply() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_ActionRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionRequest.class, Builder.class);
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
                                    codedInputStream.readMessage(getNotificationIdFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.actionId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.textReply_ = codedInputStream.readBytes();
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

            public Builder mergeNotificationId(NotificationId notificationId) {
                NotificationId notificationId2;
                SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(notificationId);
                } else if ((this.bitField0_ & 1) == 0 || (notificationId2 = this.notificationId_) == null || notificationId2 == NotificationId.getDefaultInstance()) {
                    this.notificationId_ = notificationId;
                } else {
                    getNotificationIdBuilder().mergeFrom(notificationId);
                }
                if (this.notificationId_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setActionId(String str) {
                str.getClass();
                this.actionId_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setActionIdBytes(ByteString byteString) {
                byteString.getClass();
                this.actionId_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setNotificationId(NotificationId.Builder builder) {
                SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.notificationId_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTextReply(String str) {
                str.getClass();
                this.textReply_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTextReplyBytes(ByteString byteString) {
                byteString.getClass();
                this.textReply_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ActionRequest getDefaultInstanceForType() {
                return ActionRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.actionId_ = "";
                this.textReply_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder setNotificationId(NotificationId notificationId) {
                SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                if (singleFieldBuilderV3 == null) {
                    notificationId.getClass();
                    this.notificationId_ = notificationId;
                } else {
                    singleFieldBuilderV3.setMessage(notificationId);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ActionRequest) {
                    return mergeFrom((ActionRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ActionRequest actionRequest) {
                if (actionRequest == ActionRequest.getDefaultInstance()) {
                    return this;
                }
                if (actionRequest.hasNotificationId()) {
                    mergeNotificationId(actionRequest.getNotificationId());
                }
                if (actionRequest.hasActionId()) {
                    this.actionId_ = actionRequest.actionId_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (actionRequest.hasTextReply()) {
                    this.textReply_ = actionRequest.textReply_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                mergeUnknownFields(actionRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ActionRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ActionRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ActionRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ActionRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ActionRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ActionRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ActionRequest parseFrom(InputStream inputStream) {
            return (ActionRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ActionRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private ActionRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.actionId_ = "";
            this.textReply_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ActionRequest parseFrom(CodedInputStream codedInputStream) {
            return (ActionRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ActionRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ ActionRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class ActionResponse extends GeneratedMessageV3 implements ActionResponseOrBuilder {
        private static final ActionResponse DEFAULT_INSTANCE = new ActionResponse();

        @Deprecated
        public static final Parser<ActionResponse> PARSER = new AbstractParser<ActionResponse>() { // from class: com.garmin.proto.generated.GDIRichNotifications.ActionResponse.1
            @Override // com.google.protobuf.Parser
            public ActionResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ActionResponse.newBuilder();
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

        private ActionResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ActionResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_ActionResponse_descriptor;
        }

        public static Builder newBuilder(ActionResponse actionResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(actionResponse);
        }

        public static ActionResponse parseDelimitedFrom(InputStream inputStream) {
            return (ActionResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ActionResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ActionResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActionResponse)) {
                return super.equals(obj);
            }
            ActionResponse actionResponse = (ActionResponse) obj;
            if (hasStatus() != actionResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == actionResponse.status_) && getUnknownFields().equals(actionResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ActionResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIRichNotifications.ActionResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ActionResponseOrBuilder
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
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_ActionResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionResponse.class, Builder.class);
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
            return new ActionResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActionResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(ActionResponse actionResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    actionResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                actionResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_ActionResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionResponse build() {
                ActionResponse actionResponseBuildPartial = buildPartial();
                if (actionResponseBuildPartial.isInitialized()) {
                    return actionResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) actionResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ActionResponse buildPartial() {
                ActionResponse actionResponse = new ActionResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(actionResponse);
                }
                onBuilt();
                return actionResponse;
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
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_ActionResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ActionResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ActionResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_ActionResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ActionResponse.class, Builder.class);
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
            public ActionResponse getDefaultInstanceForType() {
                return ActionResponse.getDefaultInstance();
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
                if (message instanceof ActionResponse) {
                    return mergeFrom((ActionResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ActionResponse actionResponse) {
                if (actionResponse == ActionResponse.getDefaultInstance()) {
                    return this;
                }
                if (actionResponse.hasStatus()) {
                    setStatus(actionResponse.getStatus());
                }
                mergeUnknownFields(actionResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ActionResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ActionResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ActionResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ActionResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ActionResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ActionResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ActionResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ActionResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ActionResponse parseFrom(InputStream inputStream) {
            return (ActionResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ActionResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ActionResponse parseFrom(CodedInputStream codedInputStream) {
            return (ActionResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ActionResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ActionResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            STATUS_UNKNOWN(0),
            STATUS_SUCCESS(1),
            STATUS_FAIL(2);

            public static final int STATUS_FAIL_VALUE = 2;
            public static final int STATUS_SUCCESS_VALUE = 1;
            public static final int STATUS_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIRichNotifications.ActionResponse.Status.1
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
                    return STATUS_UNKNOWN;
                }
                if (i14 == 1) {
                    return STATUS_SUCCESS;
                }
                if (i14 != 2) {
                    return null;
                }
                return STATUS_FAIL;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ActionResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class AttachmentItem extends GeneratedMessageV3 implements AttachmentItemOrBuilder {
        public static final int DATA_FIELD_NUMBER = 3;
        public static final int MEDIA_TYPE_FIELD_NUMBER = 4;
        public static final int OFFSET_FIELD_NUMBER = 1;
        public static final int SIZE_FIELD_NUMBER = 2;
        public static final int TEXT_OFFSET_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString data_;
        private int mediaType_;
        private byte memoizedIsInitialized;
        private int offset_;
        private int size_;
        private int textOffset_;
        private static final AttachmentItem DEFAULT_INSTANCE = new AttachmentItem();

        @Deprecated
        public static final Parser<AttachmentItem> PARSER = new AbstractParser<AttachmentItem>() { // from class: com.garmin.proto.generated.GDIRichNotifications.AttachmentItem.1
            @Override // com.google.protobuf.Parser
            public AttachmentItem parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AttachmentItem.newBuilder();
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

        private AttachmentItem(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.offset_ = 0;
            this.size_ = 0;
            this.data_ = ByteString.EMPTY;
            this.mediaType_ = 0;
            this.textOffset_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AttachmentItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_AttachmentItem_descriptor;
        }

        public static Builder newBuilder(AttachmentItem attachmentItem) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(attachmentItem);
        }

        public static AttachmentItem parseDelimitedFrom(InputStream inputStream) {
            return (AttachmentItem) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AttachmentItem parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AttachmentItem> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AttachmentItem)) {
                return super.equals(obj);
            }
            AttachmentItem attachmentItem = (AttachmentItem) obj;
            if (hasOffset() != attachmentItem.hasOffset()) {
                return false;
            }
            if ((hasOffset() && getOffset() != attachmentItem.getOffset()) || hasSize() != attachmentItem.hasSize()) {
                return false;
            }
            if ((hasSize() && getSize() != attachmentItem.getSize()) || hasData() != attachmentItem.hasData()) {
                return false;
            }
            if ((hasData() && !getData().equals(attachmentItem.getData())) || hasMediaType() != attachmentItem.hasMediaType()) {
                return false;
            }
            if ((!hasMediaType() || this.mediaType_ == attachmentItem.mediaType_) && hasTextOffset() == attachmentItem.hasTextOffset()) {
                return (!hasTextOffset() || getTextOffset() == attachmentItem.getTextOffset()) && getUnknownFields().equals(attachmentItem.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.AttachmentItemOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.AttachmentItemOrBuilder
        public MediaType getMediaType() {
            MediaType mediaTypeForNumber = MediaType.forNumber(this.mediaType_);
            return mediaTypeForNumber == null ? MediaType.MEDIA_TYPE_UNKNOWN : mediaTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.AttachmentItemOrBuilder
        public int getOffset() {
            return this.offset_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AttachmentItem> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.offset_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.size_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBytesSize(3, this.data_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(4, this.mediaType_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.textOffset_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.AttachmentItemOrBuilder
        public int getSize() {
            return this.size_;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.AttachmentItemOrBuilder
        public int getTextOffset() {
            return this.textOffset_;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.AttachmentItemOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.AttachmentItemOrBuilder
        public boolean hasMediaType() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.AttachmentItemOrBuilder
        public boolean hasOffset() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.AttachmentItemOrBuilder
        public boolean hasSize() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.AttachmentItemOrBuilder
        public boolean hasTextOffset() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasOffset()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getOffset();
            }
            if (hasSize()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSize();
            }
            if (hasData()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getData().hashCode();
            }
            if (hasMediaType()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + this.mediaType_;
            }
            if (hasTextOffset()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getTextOffset();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_AttachmentItem_fieldAccessorTable.ensureFieldAccessorsInitialized(AttachmentItem.class, Builder.class);
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
            return new AttachmentItem();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.offset_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.size_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBytes(3, this.data_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(4, this.mediaType_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.textOffset_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AttachmentItemOrBuilder {
            private int bitField0_;
            private ByteString data_;
            private int mediaType_;
            private int offset_;
            private int size_;
            private int textOffset_;

            private Builder() {
                this.data_ = ByteString.EMPTY;
                this.mediaType_ = 0;
            }

            private void buildPartial0(AttachmentItem attachmentItem) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    attachmentItem.offset_ = this.offset_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    attachmentItem.size_ = this.size_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    attachmentItem.data_ = this.data_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    attachmentItem.mediaType_ = this.mediaType_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    attachmentItem.textOffset_ = this.textOffset_;
                    i14 |= 16;
                }
                attachmentItem.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_AttachmentItem_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AttachmentItem build() {
                AttachmentItem attachmentItemBuildPartial = buildPartial();
                if (attachmentItemBuildPartial.isInitialized()) {
                    return attachmentItemBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) attachmentItemBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AttachmentItem buildPartial() {
                AttachmentItem attachmentItem = new AttachmentItem(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(attachmentItem);
                }
                onBuilt();
                return attachmentItem;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.offset_ = 0;
                this.size_ = 0;
                this.data_ = ByteString.EMPTY;
                this.mediaType_ = 0;
                this.textOffset_ = 0;
                return this;
            }

            public Builder clearData() {
                this.bitField0_ &= -5;
                this.data_ = AttachmentItem.getDefaultInstance().getData();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMediaType() {
                this.bitField0_ &= -9;
                this.mediaType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearOffset() {
                this.bitField0_ &= -2;
                this.offset_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSize() {
                this.bitField0_ &= -3;
                this.size_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTextOffset() {
                this.bitField0_ &= -17;
                this.textOffset_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.AttachmentItemOrBuilder
            public ByteString getData() {
                return this.data_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_AttachmentItem_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.AttachmentItemOrBuilder
            public MediaType getMediaType() {
                MediaType mediaTypeForNumber = MediaType.forNumber(this.mediaType_);
                return mediaTypeForNumber == null ? MediaType.MEDIA_TYPE_UNKNOWN : mediaTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.AttachmentItemOrBuilder
            public int getOffset() {
                return this.offset_;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.AttachmentItemOrBuilder
            public int getSize() {
                return this.size_;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.AttachmentItemOrBuilder
            public int getTextOffset() {
                return this.textOffset_;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.AttachmentItemOrBuilder
            public boolean hasData() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.AttachmentItemOrBuilder
            public boolean hasMediaType() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.AttachmentItemOrBuilder
            public boolean hasOffset() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.AttachmentItemOrBuilder
            public boolean hasSize() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.AttachmentItemOrBuilder
            public boolean hasTextOffset() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_AttachmentItem_fieldAccessorTable.ensureFieldAccessorsInitialized(AttachmentItem.class, Builder.class);
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
                                    this.offset_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.size_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.data_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    int i14 = codedInputStream.readEnum();
                                    if (MediaType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(4, i14);
                                    } else {
                                        this.mediaType_ = i14;
                                        this.bitField0_ |= 8;
                                    }
                                } else if (tag == 40) {
                                    this.textOffset_ = codedInputStream.readUInt32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setData(ByteString byteString) {
                byteString.getClass();
                this.data_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setMediaType(MediaType mediaType) {
                mediaType.getClass();
                this.bitField0_ |= 8;
                this.mediaType_ = mediaType.getNumber();
                onChanged();
                return this;
            }

            public Builder setOffset(int i14) {
                this.offset_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSize(int i14) {
                this.size_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTextOffset(int i14) {
                this.textOffset_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AttachmentItem getDefaultInstanceForType() {
                return AttachmentItem.getDefaultInstance();
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
                this.mediaType_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AttachmentItem) {
                    return mergeFrom((AttachmentItem) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AttachmentItem attachmentItem) {
                if (attachmentItem == AttachmentItem.getDefaultInstance()) {
                    return this;
                }
                if (attachmentItem.hasOffset()) {
                    setOffset(attachmentItem.getOffset());
                }
                if (attachmentItem.hasSize()) {
                    setSize(attachmentItem.getSize());
                }
                if (attachmentItem.hasData()) {
                    setData(attachmentItem.getData());
                }
                if (attachmentItem.hasMediaType()) {
                    setMediaType(attachmentItem.getMediaType());
                }
                if (attachmentItem.hasTextOffset()) {
                    setTextOffset(attachmentItem.getTextOffset());
                }
                mergeUnknownFields(attachmentItem.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AttachmentItem getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AttachmentItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AttachmentItem) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AttachmentItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AttachmentItem parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AttachmentItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AttachmentItem parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AttachmentItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AttachmentItem parseFrom(InputStream inputStream) {
            return (AttachmentItem) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AttachmentItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AttachmentItem) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AttachmentItem parseFrom(CodedInputStream codedInputStream) {
            return (AttachmentItem) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ AttachmentItem(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static AttachmentItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AttachmentItem) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private AttachmentItem() {
            this.offset_ = 0;
            this.size_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.textOffset_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.data_ = byteString;
            this.mediaType_ = 0;
        }
    }

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int CONFIGURATION_FIELD_NUMBER = 1;
        public static final int FEATURES_RESPONSE_FIELD_NUMBER = 40;
        public static final int SERVICE_VERSION_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private NotificationConfiguration configuration_;
        private byte memoizedIsInitialized;
        private int serviceVersion_;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIRichNotifications.CapabilitiesResponse.1
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, CapabilitiesResponse> featuresResponse = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesResponse.class, getDefaultInstance());

        private CapabilitiesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.serviceVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_CapabilitiesResponse_descriptor;
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
            if (hasConfiguration() != capabilitiesResponse.hasConfiguration()) {
                return false;
            }
            if ((!hasConfiguration() || getConfiguration().equals(capabilitiesResponse.getConfiguration())) && hasServiceVersion() == capabilitiesResponse.hasServiceVersion()) {
                return (!hasServiceVersion() || getServiceVersion() == capabilitiesResponse.getServiceVersion()) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.CapabilitiesResponseOrBuilder
        public NotificationConfiguration getConfiguration() {
            NotificationConfiguration notificationConfiguration = this.configuration_;
            return notificationConfiguration == null ? NotificationConfiguration.getDefaultInstance() : notificationConfiguration;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.CapabilitiesResponseOrBuilder
        public NotificationConfigurationOrBuilder getConfigurationOrBuilder() {
            NotificationConfiguration notificationConfiguration = this.configuration_;
            return notificationConfiguration == null ? NotificationConfiguration.getDefaultInstance() : notificationConfiguration;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getConfiguration()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt32Size(2, this.serviceVersion_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.CapabilitiesResponseOrBuilder
        public int getServiceVersion() {
            return this.serviceVersion_;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.CapabilitiesResponseOrBuilder
        public boolean hasConfiguration() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.CapabilitiesResponseOrBuilder
        public boolean hasServiceVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConfiguration()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConfiguration().hashCode();
            }
            if (hasServiceVersion()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getServiceVersion();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getConfiguration());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.serviceVersion_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<NotificationConfiguration, NotificationConfiguration.Builder, NotificationConfigurationOrBuilder> configurationBuilder_;
            private NotificationConfiguration configuration_;
            private int serviceVersion_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<NotificationConfiguration, NotificationConfiguration.Builder, NotificationConfigurationOrBuilder> singleFieldBuilderV3 = this.configurationBuilder_;
                    capabilitiesResponse.configuration_ = singleFieldBuilderV3 == null ? this.configuration_ : (NotificationConfiguration) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    capabilitiesResponse.serviceVersion_ = this.serviceVersion_;
                    i14 |= 2;
                }
                capabilitiesResponse.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<NotificationConfiguration, NotificationConfiguration.Builder, NotificationConfigurationOrBuilder> getConfigurationFieldBuilder() {
                if (this.configurationBuilder_ == null) {
                    this.configurationBuilder_ = new SingleFieldBuilderV3<>(getConfiguration(), getParentForChildren(), isClean());
                    this.configuration_ = null;
                }
                return this.configurationBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_CapabilitiesResponse_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConfigurationFieldBuilder();
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
                this.configuration_ = null;
                SingleFieldBuilderV3<NotificationConfiguration, NotificationConfiguration.Builder, NotificationConfigurationOrBuilder> singleFieldBuilderV3 = this.configurationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configurationBuilder_ = null;
                }
                this.serviceVersion_ = 0;
                return this;
            }

            public Builder clearConfiguration() {
                this.bitField0_ &= -2;
                this.configuration_ = null;
                SingleFieldBuilderV3<NotificationConfiguration, NotificationConfiguration.Builder, NotificationConfigurationOrBuilder> singleFieldBuilderV3 = this.configurationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configurationBuilder_ = null;
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

            public Builder clearServiceVersion() {
                this.bitField0_ &= -3;
                this.serviceVersion_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.CapabilitiesResponseOrBuilder
            public NotificationConfiguration getConfiguration() {
                SingleFieldBuilderV3<NotificationConfiguration, NotificationConfiguration.Builder, NotificationConfigurationOrBuilder> singleFieldBuilderV3 = this.configurationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (NotificationConfiguration) singleFieldBuilderV3.getMessage();
                }
                NotificationConfiguration notificationConfiguration = this.configuration_;
                return notificationConfiguration == null ? NotificationConfiguration.getDefaultInstance() : notificationConfiguration;
            }

            public NotificationConfiguration.Builder getConfigurationBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (NotificationConfiguration.Builder) getConfigurationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.CapabilitiesResponseOrBuilder
            public NotificationConfigurationOrBuilder getConfigurationOrBuilder() {
                SingleFieldBuilderV3<NotificationConfiguration, NotificationConfiguration.Builder, NotificationConfigurationOrBuilder> singleFieldBuilderV3 = this.configurationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (NotificationConfigurationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                NotificationConfiguration notificationConfiguration = this.configuration_;
                return notificationConfiguration == null ? NotificationConfiguration.getDefaultInstance() : notificationConfiguration;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.CapabilitiesResponseOrBuilder
            public int getServiceVersion() {
                return this.serviceVersion_;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.CapabilitiesResponseOrBuilder
            public boolean hasConfiguration() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.CapabilitiesResponseOrBuilder
            public boolean hasServiceVersion() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeConfiguration(NotificationConfiguration notificationConfiguration) {
                NotificationConfiguration notificationConfiguration2;
                SingleFieldBuilderV3<NotificationConfiguration, NotificationConfiguration.Builder, NotificationConfigurationOrBuilder> singleFieldBuilderV3 = this.configurationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(notificationConfiguration);
                } else if ((this.bitField0_ & 1) == 0 || (notificationConfiguration2 = this.configuration_) == null || notificationConfiguration2 == NotificationConfiguration.getDefaultInstance()) {
                    this.configuration_ = notificationConfiguration;
                } else {
                    getConfigurationBuilder().mergeFrom(notificationConfiguration);
                }
                if (this.configuration_ != null) {
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
                                    codedInputStream.readMessage(getConfigurationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.serviceVersion_ = codedInputStream.readUInt32();
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

            public Builder setConfiguration(NotificationConfiguration.Builder builder) {
                SingleFieldBuilderV3<NotificationConfiguration, NotificationConfiguration.Builder, NotificationConfigurationOrBuilder> singleFieldBuilderV3 = this.configurationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configuration_ = builder.build();
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

            public Builder setServiceVersion(int i14) {
                this.serviceVersion_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
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

            public Builder setConfiguration(NotificationConfiguration notificationConfiguration) {
                SingleFieldBuilderV3<NotificationConfiguration, NotificationConfiguration.Builder, NotificationConfigurationOrBuilder> singleFieldBuilderV3 = this.configurationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    notificationConfiguration.getClass();
                    this.configuration_ = notificationConfiguration;
                } else {
                    singleFieldBuilderV3.setMessage(notificationConfiguration);
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
                if (capabilitiesResponse.hasConfiguration()) {
                    mergeConfiguration(capabilitiesResponse.getConfiguration());
                }
                if (capabilitiesResponse.hasServiceVersion()) {
                    setServiceVersion(capabilitiesResponse.getServiceVersion());
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

        public /* synthetic */ CapabilitiesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CapabilitiesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CapabilitiesResponse() {
            this.serviceVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
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

    public static final class DataEventNotificationRequest extends GeneratedMessageV3 implements DataEventNotificationRequestOrBuilder {
        public static final int EVENT_TYPE_FIELD_NUMBER = 1;
        public static final int NOTIFICATION_DATA_FIELD_NUMBER = 3;
        public static final int NOTIFICATION_ID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int eventType_;
        private byte memoizedIsInitialized;
        private NotificationData notificationData_;
        private NotificationId notificationId_;
        private static final DataEventNotificationRequest DEFAULT_INSTANCE = new DataEventNotificationRequest();

        @Deprecated
        public static final Parser<DataEventNotificationRequest> PARSER = new AbstractParser<DataEventNotificationRequest>() { // from class: com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationRequest.1
            @Override // com.google.protobuf.Parser
            public DataEventNotificationRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DataEventNotificationRequest.newBuilder();
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

        private DataEventNotificationRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.eventType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataEventNotificationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_DataEventNotificationRequest_descriptor;
        }

        public static Builder newBuilder(DataEventNotificationRequest dataEventNotificationRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataEventNotificationRequest);
        }

        public static DataEventNotificationRequest parseDelimitedFrom(InputStream inputStream) {
            return (DataEventNotificationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DataEventNotificationRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DataEventNotificationRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataEventNotificationRequest)) {
                return super.equals(obj);
            }
            DataEventNotificationRequest dataEventNotificationRequest = (DataEventNotificationRequest) obj;
            if (hasEventType() != dataEventNotificationRequest.hasEventType()) {
                return false;
            }
            if ((hasEventType() && this.eventType_ != dataEventNotificationRequest.eventType_) || hasNotificationId() != dataEventNotificationRequest.hasNotificationId()) {
                return false;
            }
            if ((!hasNotificationId() || getNotificationId().equals(dataEventNotificationRequest.getNotificationId())) && hasNotificationData() == dataEventNotificationRequest.hasNotificationData()) {
                return (!hasNotificationData() || getNotificationData().equals(dataEventNotificationRequest.getNotificationData())) && getUnknownFields().equals(dataEventNotificationRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationRequestOrBuilder
        public EventType getEventType() {
            EventType eventTypeForNumber = EventType.forNumber(this.eventType_);
            return eventTypeForNumber == null ? EventType.EVENT_TYPE_UNKNOWN : eventTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationRequestOrBuilder
        public NotificationData getNotificationData() {
            NotificationData notificationData = this.notificationData_;
            return notificationData == null ? NotificationData.getDefaultInstance() : notificationData;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationRequestOrBuilder
        public NotificationDataOrBuilder getNotificationDataOrBuilder() {
            NotificationData notificationData = this.notificationData_;
            return notificationData == null ? NotificationData.getDefaultInstance() : notificationData;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationRequestOrBuilder
        public NotificationId getNotificationId() {
            NotificationId notificationId = this.notificationId_;
            return notificationId == null ? NotificationId.getDefaultInstance() : notificationId;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationRequestOrBuilder
        public NotificationIdOrBuilder getNotificationIdOrBuilder() {
            NotificationId notificationId = this.notificationId_;
            return notificationId == null ? NotificationId.getDefaultInstance() : notificationId;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DataEventNotificationRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.eventType_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getNotificationId());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, getNotificationData());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationRequestOrBuilder
        public boolean hasEventType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationRequestOrBuilder
        public boolean hasNotificationData() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationRequestOrBuilder
        public boolean hasNotificationId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEventType()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.eventType_;
            }
            if (hasNotificationId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getNotificationId().hashCode();
            }
            if (hasNotificationData()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getNotificationData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_DataEventNotificationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DataEventNotificationRequest.class, Builder.class);
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
            return new DataEventNotificationRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.eventType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getNotificationId());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getNotificationData());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataEventNotificationRequestOrBuilder {
            private int bitField0_;
            private int eventType_;
            private SingleFieldBuilderV3<NotificationData, NotificationData.Builder, NotificationDataOrBuilder> notificationDataBuilder_;
            private NotificationData notificationData_;
            private SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> notificationIdBuilder_;
            private NotificationId notificationId_;

            private Builder() {
                this.eventType_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(DataEventNotificationRequest dataEventNotificationRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    dataEventNotificationRequest.eventType_ = this.eventType_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                    dataEventNotificationRequest.notificationId_ = singleFieldBuilderV3 == null ? this.notificationId_ : (NotificationId) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<NotificationData, NotificationData.Builder, NotificationDataOrBuilder> singleFieldBuilderV4 = this.notificationDataBuilder_;
                    dataEventNotificationRequest.notificationData_ = singleFieldBuilderV4 == null ? this.notificationData_ : (NotificationData) singleFieldBuilderV4.build();
                    i14 |= 4;
                }
                dataEventNotificationRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_DataEventNotificationRequest_descriptor;
            }

            private SingleFieldBuilderV3<NotificationData, NotificationData.Builder, NotificationDataOrBuilder> getNotificationDataFieldBuilder() {
                if (this.notificationDataBuilder_ == null) {
                    this.notificationDataBuilder_ = new SingleFieldBuilderV3<>(getNotificationData(), getParentForChildren(), isClean());
                    this.notificationData_ = null;
                }
                return this.notificationDataBuilder_;
            }

            private SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> getNotificationIdFieldBuilder() {
                if (this.notificationIdBuilder_ == null) {
                    this.notificationIdBuilder_ = new SingleFieldBuilderV3<>(getNotificationId(), getParentForChildren(), isClean());
                    this.notificationId_ = null;
                }
                return this.notificationIdBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getNotificationIdFieldBuilder();
                    getNotificationDataFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataEventNotificationRequest build() {
                DataEventNotificationRequest dataEventNotificationRequestBuildPartial = buildPartial();
                if (dataEventNotificationRequestBuildPartial.isInitialized()) {
                    return dataEventNotificationRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataEventNotificationRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataEventNotificationRequest buildPartial() {
                DataEventNotificationRequest dataEventNotificationRequest = new DataEventNotificationRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dataEventNotificationRequest);
                }
                onBuilt();
                return dataEventNotificationRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.eventType_ = 0;
                this.notificationId_ = null;
                SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.notificationIdBuilder_ = null;
                }
                this.notificationData_ = null;
                SingleFieldBuilderV3<NotificationData, NotificationData.Builder, NotificationDataOrBuilder> singleFieldBuilderV4 = this.notificationDataBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.notificationDataBuilder_ = null;
                }
                return this;
            }

            public Builder clearEventType() {
                this.bitField0_ &= -2;
                this.eventType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearNotificationData() {
                this.bitField0_ &= -5;
                this.notificationData_ = null;
                SingleFieldBuilderV3<NotificationData, NotificationData.Builder, NotificationDataOrBuilder> singleFieldBuilderV3 = this.notificationDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.notificationDataBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearNotificationId() {
                this.bitField0_ &= -3;
                this.notificationId_ = null;
                SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.notificationIdBuilder_ = null;
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
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_DataEventNotificationRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationRequestOrBuilder
            public EventType getEventType() {
                EventType eventTypeForNumber = EventType.forNumber(this.eventType_);
                return eventTypeForNumber == null ? EventType.EVENT_TYPE_UNKNOWN : eventTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationRequestOrBuilder
            public NotificationData getNotificationData() {
                SingleFieldBuilderV3<NotificationData, NotificationData.Builder, NotificationDataOrBuilder> singleFieldBuilderV3 = this.notificationDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (NotificationData) singleFieldBuilderV3.getMessage();
                }
                NotificationData notificationData = this.notificationData_;
                return notificationData == null ? NotificationData.getDefaultInstance() : notificationData;
            }

            public NotificationData.Builder getNotificationDataBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (NotificationData.Builder) getNotificationDataFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationRequestOrBuilder
            public NotificationDataOrBuilder getNotificationDataOrBuilder() {
                SingleFieldBuilderV3<NotificationData, NotificationData.Builder, NotificationDataOrBuilder> singleFieldBuilderV3 = this.notificationDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (NotificationDataOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                NotificationData notificationData = this.notificationData_;
                return notificationData == null ? NotificationData.getDefaultInstance() : notificationData;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationRequestOrBuilder
            public NotificationId getNotificationId() {
                SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (NotificationId) singleFieldBuilderV3.getMessage();
                }
                NotificationId notificationId = this.notificationId_;
                return notificationId == null ? NotificationId.getDefaultInstance() : notificationId;
            }

            public NotificationId.Builder getNotificationIdBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (NotificationId.Builder) getNotificationIdFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationRequestOrBuilder
            public NotificationIdOrBuilder getNotificationIdOrBuilder() {
                SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (NotificationIdOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                NotificationId notificationId = this.notificationId_;
                return notificationId == null ? NotificationId.getDefaultInstance() : notificationId;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationRequestOrBuilder
            public boolean hasEventType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationRequestOrBuilder
            public boolean hasNotificationData() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationRequestOrBuilder
            public boolean hasNotificationId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_DataEventNotificationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DataEventNotificationRequest.class, Builder.class);
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
                                    if (EventType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.eventType_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getNotificationIdFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getNotificationDataFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeNotificationData(NotificationData notificationData) {
                NotificationData notificationData2;
                SingleFieldBuilderV3<NotificationData, NotificationData.Builder, NotificationDataOrBuilder> singleFieldBuilderV3 = this.notificationDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(notificationData);
                } else if ((this.bitField0_ & 4) == 0 || (notificationData2 = this.notificationData_) == null || notificationData2 == NotificationData.getDefaultInstance()) {
                    this.notificationData_ = notificationData;
                } else {
                    getNotificationDataBuilder().mergeFrom(notificationData);
                }
                if (this.notificationData_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeNotificationId(NotificationId notificationId) {
                NotificationId notificationId2;
                SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(notificationId);
                } else if ((this.bitField0_ & 2) == 0 || (notificationId2 = this.notificationId_) == null || notificationId2 == NotificationId.getDefaultInstance()) {
                    this.notificationId_ = notificationId;
                } else {
                    getNotificationIdBuilder().mergeFrom(notificationId);
                }
                if (this.notificationId_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setEventType(EventType eventType) {
                eventType.getClass();
                this.bitField0_ |= 1;
                this.eventType_ = eventType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setNotificationData(NotificationData.Builder builder) {
                SingleFieldBuilderV3<NotificationData, NotificationData.Builder, NotificationDataOrBuilder> singleFieldBuilderV3 = this.notificationDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.notificationData_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setNotificationId(NotificationId.Builder builder) {
                SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.notificationId_ = builder.build();
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
            public DataEventNotificationRequest getDefaultInstanceForType() {
                return DataEventNotificationRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.eventType_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setNotificationData(NotificationData notificationData) {
                SingleFieldBuilderV3<NotificationData, NotificationData.Builder, NotificationDataOrBuilder> singleFieldBuilderV3 = this.notificationDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    notificationData.getClass();
                    this.notificationData_ = notificationData;
                } else {
                    singleFieldBuilderV3.setMessage(notificationData);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setNotificationId(NotificationId notificationId) {
                SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                if (singleFieldBuilderV3 == null) {
                    notificationId.getClass();
                    this.notificationId_ = notificationId;
                } else {
                    singleFieldBuilderV3.setMessage(notificationId);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DataEventNotificationRequest) {
                    return mergeFrom((DataEventNotificationRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DataEventNotificationRequest dataEventNotificationRequest) {
                if (dataEventNotificationRequest == DataEventNotificationRequest.getDefaultInstance()) {
                    return this;
                }
                if (dataEventNotificationRequest.hasEventType()) {
                    setEventType(dataEventNotificationRequest.getEventType());
                }
                if (dataEventNotificationRequest.hasNotificationId()) {
                    mergeNotificationId(dataEventNotificationRequest.getNotificationId());
                }
                if (dataEventNotificationRequest.hasNotificationData()) {
                    mergeNotificationData(dataEventNotificationRequest.getNotificationData());
                }
                mergeUnknownFields(dataEventNotificationRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DataEventNotificationRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DataEventNotificationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataEventNotificationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataEventNotificationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DataEventNotificationRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DataEventNotificationRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DataEventNotificationRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.eventType_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DataEventNotificationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DataEventNotificationRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DataEventNotificationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DataEventNotificationRequest parseFrom(InputStream inputStream) {
            return (DataEventNotificationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DataEventNotificationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataEventNotificationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataEventNotificationRequest parseFrom(CodedInputStream codedInputStream) {
            return (DataEventNotificationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DataEventNotificationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataEventNotificationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum EventType implements ProtocolMessageEnum {
            EVENT_TYPE_UNKNOWN(0),
            EVENT_TYPE_ADDED(1),
            EVENT_TYPE_REMOVED(2),
            EVENT_TYPE_UPDATED(3),
            EVENT_TYPE_ATTACHMENT(4);

            public static final int EVENT_TYPE_ADDED_VALUE = 1;
            public static final int EVENT_TYPE_ATTACHMENT_VALUE = 4;
            public static final int EVENT_TYPE_REMOVED_VALUE = 2;
            public static final int EVENT_TYPE_UNKNOWN_VALUE = 0;
            public static final int EVENT_TYPE_UPDATED_VALUE = 3;
            private final int value;
            private static final Internal.EnumLiteMap<EventType> internalValueMap = new Internal.EnumLiteMap<EventType>() { // from class: com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationRequest.EventType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public EventType findValueByNumber(int i14) {
                    return EventType.forNumber(i14);
                }
            };
            private static final EventType[] VALUES = values();

            EventType(int i14) {
                this.value = i14;
            }

            public static EventType forNumber(int i14) {
                if (i14 == 0) {
                    return EVENT_TYPE_UNKNOWN;
                }
                if (i14 == 1) {
                    return EVENT_TYPE_ADDED;
                }
                if (i14 == 2) {
                    return EVENT_TYPE_REMOVED;
                }
                if (i14 == 3) {
                    return EVENT_TYPE_UPDATED;
                }
                if (i14 != 4) {
                    return null;
                }
                return EVENT_TYPE_ATTACHMENT;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return DataEventNotificationRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<EventType> internalGetValueMap() {
                return internalValueMap;
            }

            public static EventType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static EventType valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class DataEventNotificationResponse extends GeneratedMessageV3 implements DataEventNotificationResponseOrBuilder {
        public static final int ALERTED_FIELD_NUMBER = 1;
        public static final int NOTIFICATION_ID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private boolean alerted_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private NotificationId notificationId_;
        private static final DataEventNotificationResponse DEFAULT_INSTANCE = new DataEventNotificationResponse();

        @Deprecated
        public static final Parser<DataEventNotificationResponse> PARSER = new AbstractParser<DataEventNotificationResponse>() { // from class: com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationResponse.1
            @Override // com.google.protobuf.Parser
            public DataEventNotificationResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DataEventNotificationResponse.newBuilder();
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

        private DataEventNotificationResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.alerted_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataEventNotificationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_DataEventNotificationResponse_descriptor;
        }

        public static Builder newBuilder(DataEventNotificationResponse dataEventNotificationResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataEventNotificationResponse);
        }

        public static DataEventNotificationResponse parseDelimitedFrom(InputStream inputStream) {
            return (DataEventNotificationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DataEventNotificationResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DataEventNotificationResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataEventNotificationResponse)) {
                return super.equals(obj);
            }
            DataEventNotificationResponse dataEventNotificationResponse = (DataEventNotificationResponse) obj;
            if (hasAlerted() != dataEventNotificationResponse.hasAlerted()) {
                return false;
            }
            if ((!hasAlerted() || getAlerted() == dataEventNotificationResponse.getAlerted()) && hasNotificationId() == dataEventNotificationResponse.hasNotificationId()) {
                return (!hasNotificationId() || getNotificationId().equals(dataEventNotificationResponse.getNotificationId())) && getUnknownFields().equals(dataEventNotificationResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationResponseOrBuilder
        public boolean getAlerted() {
            return this.alerted_;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationResponseOrBuilder
        public NotificationId getNotificationId() {
            NotificationId notificationId = this.notificationId_;
            return notificationId == null ? NotificationId.getDefaultInstance() : notificationId;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationResponseOrBuilder
        public NotificationIdOrBuilder getNotificationIdOrBuilder() {
            NotificationId notificationId = this.notificationId_;
            return notificationId == null ? NotificationId.getDefaultInstance() : notificationId;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DataEventNotificationResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.alerted_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(2, getNotificationId());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationResponseOrBuilder
        public boolean hasAlerted() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationResponseOrBuilder
        public boolean hasNotificationId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAlerted()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getAlerted());
            }
            if (hasNotificationId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getNotificationId().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_DataEventNotificationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DataEventNotificationResponse.class, Builder.class);
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
            return new DataEventNotificationResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.alerted_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getNotificationId());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataEventNotificationResponseOrBuilder {
            private boolean alerted_;
            private int bitField0_;
            private SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> notificationIdBuilder_;
            private NotificationId notificationId_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(DataEventNotificationResponse dataEventNotificationResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    dataEventNotificationResponse.alerted_ = this.alerted_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                    dataEventNotificationResponse.notificationId_ = singleFieldBuilderV3 == null ? this.notificationId_ : (NotificationId) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                dataEventNotificationResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_DataEventNotificationResponse_descriptor;
            }

            private SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> getNotificationIdFieldBuilder() {
                if (this.notificationIdBuilder_ == null) {
                    this.notificationIdBuilder_ = new SingleFieldBuilderV3<>(getNotificationId(), getParentForChildren(), isClean());
                    this.notificationId_ = null;
                }
                return this.notificationIdBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getNotificationIdFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataEventNotificationResponse build() {
                DataEventNotificationResponse dataEventNotificationResponseBuildPartial = buildPartial();
                if (dataEventNotificationResponseBuildPartial.isInitialized()) {
                    return dataEventNotificationResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataEventNotificationResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataEventNotificationResponse buildPartial() {
                DataEventNotificationResponse dataEventNotificationResponse = new DataEventNotificationResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dataEventNotificationResponse);
                }
                onBuilt();
                return dataEventNotificationResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.alerted_ = false;
                this.notificationId_ = null;
                SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.notificationIdBuilder_ = null;
                }
                return this;
            }

            public Builder clearAlerted() {
                this.bitField0_ &= -2;
                this.alerted_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearNotificationId() {
                this.bitField0_ &= -3;
                this.notificationId_ = null;
                SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.notificationIdBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationResponseOrBuilder
            public boolean getAlerted() {
                return this.alerted_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_DataEventNotificationResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationResponseOrBuilder
            public NotificationId getNotificationId() {
                SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (NotificationId) singleFieldBuilderV3.getMessage();
                }
                NotificationId notificationId = this.notificationId_;
                return notificationId == null ? NotificationId.getDefaultInstance() : notificationId;
            }

            public NotificationId.Builder getNotificationIdBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (NotificationId.Builder) getNotificationIdFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationResponseOrBuilder
            public NotificationIdOrBuilder getNotificationIdOrBuilder() {
                SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (NotificationIdOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                NotificationId notificationId = this.notificationId_;
                return notificationId == null ? NotificationId.getDefaultInstance() : notificationId;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationResponseOrBuilder
            public boolean hasAlerted() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.DataEventNotificationResponseOrBuilder
            public boolean hasNotificationId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_DataEventNotificationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DataEventNotificationResponse.class, Builder.class);
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
                                    this.alerted_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getNotificationIdFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeNotificationId(NotificationId notificationId) {
                NotificationId notificationId2;
                SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(notificationId);
                } else if ((this.bitField0_ & 2) == 0 || (notificationId2 = this.notificationId_) == null || notificationId2 == NotificationId.getDefaultInstance()) {
                    this.notificationId_ = notificationId;
                } else {
                    getNotificationIdBuilder().mergeFrom(notificationId);
                }
                if (this.notificationId_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAlerted(boolean z14) {
                this.alerted_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setNotificationId(NotificationId.Builder builder) {
                SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.notificationId_ = builder.build();
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
            public DataEventNotificationResponse getDefaultInstanceForType() {
                return DataEventNotificationResponse.getDefaultInstance();
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

            public Builder setNotificationId(NotificationId notificationId) {
                SingleFieldBuilderV3<NotificationId, NotificationId.Builder, NotificationIdOrBuilder> singleFieldBuilderV3 = this.notificationIdBuilder_;
                if (singleFieldBuilderV3 == null) {
                    notificationId.getClass();
                    this.notificationId_ = notificationId;
                } else {
                    singleFieldBuilderV3.setMessage(notificationId);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DataEventNotificationResponse) {
                    return mergeFrom((DataEventNotificationResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DataEventNotificationResponse dataEventNotificationResponse) {
                if (dataEventNotificationResponse == DataEventNotificationResponse.getDefaultInstance()) {
                    return this;
                }
                if (dataEventNotificationResponse.hasAlerted()) {
                    setAlerted(dataEventNotificationResponse.getAlerted());
                }
                if (dataEventNotificationResponse.hasNotificationId()) {
                    mergeNotificationId(dataEventNotificationResponse.getNotificationId());
                }
                mergeUnknownFields(dataEventNotificationResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DataEventNotificationResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DataEventNotificationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataEventNotificationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataEventNotificationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DataEventNotificationResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DataEventNotificationResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DataEventNotificationResponse() {
            this.alerted_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DataEventNotificationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DataEventNotificationResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DataEventNotificationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DataEventNotificationResponse parseFrom(InputStream inputStream) {
            return (DataEventNotificationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DataEventNotificationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataEventNotificationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataEventNotificationResponse parseFrom(CodedInputStream codedInputStream) {
            return (DataEventNotificationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DataEventNotificationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataEventNotificationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EncryptedDataRequest extends GeneratedMessageV3 implements EncryptedDataRequestOrBuilder {
        public static final int ENCRYPTED_DATA_FIELD_NUMBER = 2;
        public static final int ENCRYPTED_XFER_DATA_FIELD_NUMBER = 3;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        public static final int UNENCRYPTED_DATA_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString encryptedData_;
        private GDIDataTypes.DataTransferItem encryptedXferData_;
        private byte memoizedIsInitialized;
        private volatile Object sessionId_;
        private ByteString unencryptedData_;
        private static final EncryptedDataRequest DEFAULT_INSTANCE = new EncryptedDataRequest();

        @Deprecated
        public static final Parser<EncryptedDataRequest> PARSER = new AbstractParser<EncryptedDataRequest>() { // from class: com.garmin.proto.generated.GDIRichNotifications.EncryptedDataRequest.1
            @Override // com.google.protobuf.Parser
            public EncryptedDataRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EncryptedDataRequest.newBuilder();
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

        private EncryptedDataRequest() {
            this.sessionId_ = "";
            ByteString byteString = ByteString.EMPTY;
            this.encryptedData_ = byteString;
            this.unencryptedData_ = byteString;
            this.memoizedIsInitialized = (byte) -1;
            this.sessionId_ = "";
            this.encryptedData_ = byteString;
            this.unencryptedData_ = byteString;
        }

        public static EncryptedDataRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_EncryptedDataRequest_descriptor;
        }

        public static Builder newBuilder(EncryptedDataRequest encryptedDataRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(encryptedDataRequest);
        }

        public static EncryptedDataRequest parseDelimitedFrom(InputStream inputStream) {
            return (EncryptedDataRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EncryptedDataRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EncryptedDataRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EncryptedDataRequest)) {
                return super.equals(obj);
            }
            EncryptedDataRequest encryptedDataRequest = (EncryptedDataRequest) obj;
            if (hasSessionId() != encryptedDataRequest.hasSessionId()) {
                return false;
            }
            if ((hasSessionId() && !getSessionId().equals(encryptedDataRequest.getSessionId())) || hasEncryptedData() != encryptedDataRequest.hasEncryptedData()) {
                return false;
            }
            if ((hasEncryptedData() && !getEncryptedData().equals(encryptedDataRequest.getEncryptedData())) || hasEncryptedXferData() != encryptedDataRequest.hasEncryptedXferData()) {
                return false;
            }
            if ((!hasEncryptedXferData() || getEncryptedXferData().equals(encryptedDataRequest.getEncryptedXferData())) && hasUnencryptedData() == encryptedDataRequest.hasUnencryptedData()) {
                return (!hasUnencryptedData() || getUnencryptedData().equals(encryptedDataRequest.getUnencryptedData())) && getUnknownFields().equals(encryptedDataRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataRequestOrBuilder
        public ByteString getEncryptedData() {
            return this.encryptedData_;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataRequestOrBuilder
        public GDIDataTypes.DataTransferItem getEncryptedXferData() {
            GDIDataTypes.DataTransferItem dataTransferItem = this.encryptedXferData_;
            return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataRequestOrBuilder
        public GDIDataTypes.DataTransferItemOrBuilder getEncryptedXferDataOrBuilder() {
            GDIDataTypes.DataTransferItem dataTransferItem = this.encryptedXferData_;
            return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EncryptedDataRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.sessionId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(2, this.encryptedData_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(3, getEncryptedXferData());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(4, this.unencryptedData_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataRequestOrBuilder
        public String getSessionId() {
            Object obj = this.sessionId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.sessionId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataRequestOrBuilder
        public ByteString getSessionIdBytes() {
            Object obj = this.sessionId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataRequestOrBuilder
        public ByteString getUnencryptedData() {
            return this.unencryptedData_;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataRequestOrBuilder
        public boolean hasEncryptedData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataRequestOrBuilder
        public boolean hasEncryptedXferData() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataRequestOrBuilder
        public boolean hasSessionId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataRequestOrBuilder
        public boolean hasUnencryptedData() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSessionId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSessionId().hashCode();
            }
            if (hasEncryptedData()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getEncryptedData().hashCode();
            }
            if (hasEncryptedXferData()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getEncryptedXferData().hashCode();
            }
            if (hasUnencryptedData()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getUnencryptedData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_EncryptedDataRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EncryptedDataRequest.class, Builder.class);
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
            if (!hasEncryptedXferData() || getEncryptedXferData().isInitialized()) {
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
            return new EncryptedDataRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.sessionId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.encryptedData_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getEncryptedXferData());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBytes(4, this.unencryptedData_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EncryptedDataRequestOrBuilder {
            private int bitField0_;
            private ByteString encryptedData_;
            private SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> encryptedXferDataBuilder_;
            private GDIDataTypes.DataTransferItem encryptedXferData_;
            private Object sessionId_;
            private ByteString unencryptedData_;

            private Builder() {
                this.sessionId_ = "";
                ByteString byteString = ByteString.EMPTY;
                this.encryptedData_ = byteString;
                this.unencryptedData_ = byteString;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(EncryptedDataRequest encryptedDataRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    encryptedDataRequest.sessionId_ = this.sessionId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    encryptedDataRequest.encryptedData_ = this.encryptedData_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.encryptedXferDataBuilder_;
                    encryptedDataRequest.encryptedXferData_ = singleFieldBuilderV3 == null ? this.encryptedXferData_ : (GDIDataTypes.DataTransferItem) singleFieldBuilderV3.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    encryptedDataRequest.unencryptedData_ = this.unencryptedData_;
                    i14 |= 8;
                }
                encryptedDataRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_EncryptedDataRequest_descriptor;
            }

            private SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> getEncryptedXferDataFieldBuilder() {
                if (this.encryptedXferDataBuilder_ == null) {
                    this.encryptedXferDataBuilder_ = new SingleFieldBuilderV3<>(getEncryptedXferData(), getParentForChildren(), isClean());
                    this.encryptedXferData_ = null;
                }
                return this.encryptedXferDataBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getEncryptedXferDataFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EncryptedDataRequest build() {
                EncryptedDataRequest encryptedDataRequestBuildPartial = buildPartial();
                if (encryptedDataRequestBuildPartial.isInitialized()) {
                    return encryptedDataRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) encryptedDataRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EncryptedDataRequest buildPartial() {
                EncryptedDataRequest encryptedDataRequest = new EncryptedDataRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(encryptedDataRequest);
                }
                onBuilt();
                return encryptedDataRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sessionId_ = "";
                ByteString byteString = ByteString.EMPTY;
                this.encryptedData_ = byteString;
                this.encryptedXferData_ = null;
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.encryptedXferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.encryptedXferDataBuilder_ = null;
                }
                this.unencryptedData_ = byteString;
                return this;
            }

            public Builder clearEncryptedData() {
                this.bitField0_ &= -3;
                this.encryptedData_ = EncryptedDataRequest.getDefaultInstance().getEncryptedData();
                onChanged();
                return this;
            }

            public Builder clearEncryptedXferData() {
                this.bitField0_ &= -5;
                this.encryptedXferData_ = null;
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.encryptedXferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.encryptedXferDataBuilder_ = null;
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

            public Builder clearSessionId() {
                this.sessionId_ = EncryptedDataRequest.getDefaultInstance().getSessionId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearUnencryptedData() {
                this.bitField0_ &= -9;
                this.unencryptedData_ = EncryptedDataRequest.getDefaultInstance().getUnencryptedData();
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
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_EncryptedDataRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataRequestOrBuilder
            public ByteString getEncryptedData() {
                return this.encryptedData_;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataRequestOrBuilder
            public GDIDataTypes.DataTransferItem getEncryptedXferData() {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.encryptedXferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.DataTransferItem) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.DataTransferItem dataTransferItem = this.encryptedXferData_;
                return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
            }

            public GDIDataTypes.DataTransferItem.Builder getEncryptedXferDataBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (GDIDataTypes.DataTransferItem.Builder) getEncryptedXferDataFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataRequestOrBuilder
            public GDIDataTypes.DataTransferItemOrBuilder getEncryptedXferDataOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.encryptedXferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.DataTransferItemOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.DataTransferItem dataTransferItem = this.encryptedXferData_;
                return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataRequestOrBuilder
            public String getSessionId() {
                Object obj = this.sessionId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.sessionId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataRequestOrBuilder
            public ByteString getSessionIdBytes() {
                Object obj = this.sessionId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sessionId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataRequestOrBuilder
            public ByteString getUnencryptedData() {
                return this.unencryptedData_;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataRequestOrBuilder
            public boolean hasEncryptedData() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataRequestOrBuilder
            public boolean hasEncryptedXferData() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataRequestOrBuilder
            public boolean hasSessionId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataRequestOrBuilder
            public boolean hasUnencryptedData() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_EncryptedDataRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EncryptedDataRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasEncryptedXferData() || getEncryptedXferData().isInitialized();
            }

            public Builder mergeEncryptedXferData(GDIDataTypes.DataTransferItem dataTransferItem) {
                GDIDataTypes.DataTransferItem dataTransferItem2;
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.encryptedXferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dataTransferItem);
                } else if ((this.bitField0_ & 4) == 0 || (dataTransferItem2 = this.encryptedXferData_) == null || dataTransferItem2 == GDIDataTypes.DataTransferItem.getDefaultInstance()) {
                    this.encryptedXferData_ = dataTransferItem;
                } else {
                    getEncryptedXferDataBuilder().mergeFrom(dataTransferItem);
                }
                if (this.encryptedXferData_ != null) {
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
                                if (tag == 10) {
                                    this.sessionId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.encryptedData_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getEncryptedXferDataFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.unencryptedData_ = codedInputStream.readBytes();
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

            public Builder setEncryptedData(ByteString byteString) {
                byteString.getClass();
                this.encryptedData_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setEncryptedXferData(GDIDataTypes.DataTransferItem.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.encryptedXferDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.encryptedXferData_ = builder.build();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionId(String str) {
                str.getClass();
                this.sessionId_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSessionIdBytes(ByteString byteString) {
                byteString.getClass();
                this.sessionId_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUnencryptedData(ByteString byteString) {
                byteString.getClass();
                this.unencryptedData_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EncryptedDataRequest getDefaultInstanceForType() {
                return EncryptedDataRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.sessionId_ = "";
                ByteString byteString = ByteString.EMPTY;
                this.encryptedData_ = byteString;
                this.unencryptedData_ = byteString;
                maybeForceBuilderInitialization();
            }

            public Builder setEncryptedXferData(GDIDataTypes.DataTransferItem dataTransferItem) {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.encryptedXferDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dataTransferItem.getClass();
                    this.encryptedXferData_ = dataTransferItem;
                } else {
                    singleFieldBuilderV3.setMessage(dataTransferItem);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EncryptedDataRequest) {
                    return mergeFrom((EncryptedDataRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EncryptedDataRequest encryptedDataRequest) {
                if (encryptedDataRequest == EncryptedDataRequest.getDefaultInstance()) {
                    return this;
                }
                if (encryptedDataRequest.hasSessionId()) {
                    this.sessionId_ = encryptedDataRequest.sessionId_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (encryptedDataRequest.hasEncryptedData()) {
                    setEncryptedData(encryptedDataRequest.getEncryptedData());
                }
                if (encryptedDataRequest.hasEncryptedXferData()) {
                    mergeEncryptedXferData(encryptedDataRequest.getEncryptedXferData());
                }
                if (encryptedDataRequest.hasUnencryptedData()) {
                    setUnencryptedData(encryptedDataRequest.getUnencryptedData());
                }
                mergeUnknownFields(encryptedDataRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EncryptedDataRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EncryptedDataRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EncryptedDataRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EncryptedDataRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EncryptedDataRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EncryptedDataRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EncryptedDataRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EncryptedDataRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EncryptedDataRequest parseFrom(InputStream inputStream) {
            return (EncryptedDataRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EncryptedDataRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EncryptedDataRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EncryptedDataRequest parseFrom(CodedInputStream codedInputStream) {
            return (EncryptedDataRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EncryptedDataRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EncryptedDataRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private EncryptedDataRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sessionId_ = "";
            ByteString byteString = ByteString.EMPTY;
            this.encryptedData_ = byteString;
            this.unencryptedData_ = byteString;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ EncryptedDataRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class EncryptedDataResponse extends GeneratedMessageV3 implements EncryptedDataResponseOrBuilder {
        private static final EncryptedDataResponse DEFAULT_INSTANCE = new EncryptedDataResponse();

        @Deprecated
        public static final Parser<EncryptedDataResponse> PARSER = new AbstractParser<EncryptedDataResponse>() { // from class: com.garmin.proto.generated.GDIRichNotifications.EncryptedDataResponse.1
            @Override // com.google.protobuf.Parser
            public EncryptedDataResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EncryptedDataResponse.newBuilder();
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

        private EncryptedDataResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EncryptedDataResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_EncryptedDataResponse_descriptor;
        }

        public static Builder newBuilder(EncryptedDataResponse encryptedDataResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(encryptedDataResponse);
        }

        public static EncryptedDataResponse parseDelimitedFrom(InputStream inputStream) {
            return (EncryptedDataResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EncryptedDataResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EncryptedDataResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EncryptedDataResponse)) {
                return super.equals(obj);
            }
            EncryptedDataResponse encryptedDataResponse = (EncryptedDataResponse) obj;
            if (hasStatus() != encryptedDataResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == encryptedDataResponse.status_) && getUnknownFields().equals(encryptedDataResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EncryptedDataResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataResponseOrBuilder
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
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_EncryptedDataResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EncryptedDataResponse.class, Builder.class);
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
            return new EncryptedDataResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EncryptedDataResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(EncryptedDataResponse encryptedDataResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    encryptedDataResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                encryptedDataResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_EncryptedDataResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EncryptedDataResponse build() {
                EncryptedDataResponse encryptedDataResponseBuildPartial = buildPartial();
                if (encryptedDataResponseBuildPartial.isInitialized()) {
                    return encryptedDataResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) encryptedDataResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EncryptedDataResponse buildPartial() {
                EncryptedDataResponse encryptedDataResponse = new EncryptedDataResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(encryptedDataResponse);
                }
                onBuilt();
                return encryptedDataResponse;
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
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_EncryptedDataResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.EncryptedDataResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_EncryptedDataResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EncryptedDataResponse.class, Builder.class);
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
            public EncryptedDataResponse getDefaultInstanceForType() {
                return EncryptedDataResponse.getDefaultInstance();
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
                if (message instanceof EncryptedDataResponse) {
                    return mergeFrom((EncryptedDataResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EncryptedDataResponse encryptedDataResponse) {
                if (encryptedDataResponse == EncryptedDataResponse.getDefaultInstance()) {
                    return this;
                }
                if (encryptedDataResponse.hasStatus()) {
                    setStatus(encryptedDataResponse.getStatus());
                }
                mergeUnknownFields(encryptedDataResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EncryptedDataResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EncryptedDataResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EncryptedDataResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EncryptedDataResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ EncryptedDataResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static EncryptedDataResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private EncryptedDataResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EncryptedDataResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EncryptedDataResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EncryptedDataResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EncryptedDataResponse parseFrom(InputStream inputStream) {
            return (EncryptedDataResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EncryptedDataResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EncryptedDataResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EncryptedDataResponse parseFrom(CodedInputStream codedInputStream) {
            return (EncryptedDataResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EncryptedDataResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EncryptedDataResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            STATUS_UNKNOWN(0),
            STATUS_SUCCESS(1),
            STATUS_ERROR(2);

            public static final int STATUS_ERROR_VALUE = 2;
            public static final int STATUS_SUCCESS_VALUE = 1;
            public static final int STATUS_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIRichNotifications.EncryptedDataResponse.Status.1
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
                    return STATUS_UNKNOWN;
                }
                if (i14 == 1) {
                    return STATUS_SUCCESS;
                }
                if (i14 != 2) {
                    return null;
                }
                return STATUS_ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return EncryptedDataResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class ErrorNotification extends GeneratedMessageV3 implements ErrorNotificationOrBuilder {
        private static final ErrorNotification DEFAULT_INSTANCE = new ErrorNotification();

        @Deprecated
        public static final Parser<ErrorNotification> PARSER = new AbstractParser<ErrorNotification>() { // from class: com.garmin.proto.generated.GDIRichNotifications.ErrorNotification.1
            @Override // com.google.protobuf.Parser
            public ErrorNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ErrorNotification.newBuilder();
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

        private ErrorNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ErrorNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_ErrorNotification_descriptor;
        }

        public static Builder newBuilder(ErrorNotification errorNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(errorNotification);
        }

        public static ErrorNotification parseDelimitedFrom(InputStream inputStream) {
            return (ErrorNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ErrorNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ErrorNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ErrorNotification)) {
                return super.equals(obj);
            }
            ErrorNotification errorNotification = (ErrorNotification) obj;
            if (hasStatus() != errorNotification.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == errorNotification.status_) && getUnknownFields().equals(errorNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ErrorNotification> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIRichNotifications.ErrorNotificationOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ErrorNotificationOrBuilder
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
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_ErrorNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ErrorNotification.class, Builder.class);
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
            return new ErrorNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ErrorNotificationOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(ErrorNotification errorNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    errorNotification.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                errorNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_ErrorNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ErrorNotification build() {
                ErrorNotification errorNotificationBuildPartial = buildPartial();
                if (errorNotificationBuildPartial.isInitialized()) {
                    return errorNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) errorNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ErrorNotification buildPartial() {
                ErrorNotification errorNotification = new ErrorNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(errorNotification);
                }
                onBuilt();
                return errorNotification;
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
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_ErrorNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ErrorNotificationOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ErrorNotificationOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_ErrorNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ErrorNotification.class, Builder.class);
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
            public ErrorNotification getDefaultInstanceForType() {
                return ErrorNotification.getDefaultInstance();
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
                if (message instanceof ErrorNotification) {
                    return mergeFrom((ErrorNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ErrorNotification errorNotification) {
                if (errorNotification == ErrorNotification.getDefaultInstance()) {
                    return this;
                }
                if (errorNotification.hasStatus()) {
                    setStatus(errorNotification.getStatus());
                }
                mergeUnknownFields(errorNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ErrorNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ErrorNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ErrorNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ErrorNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ErrorNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ErrorNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ErrorNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ErrorNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ErrorNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ErrorNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ErrorNotification parseFrom(InputStream inputStream) {
            return (ErrorNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ErrorNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ErrorNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ErrorNotification parseFrom(CodedInputStream codedInputStream) {
            return (ErrorNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ErrorNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ErrorNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            STATUS_UNKNOWN(0),
            STATUS_EU_TIMEOUT_NOTIFICATIONS_DISABLED(1);

            public static final int STATUS_EU_TIMEOUT_NOTIFICATIONS_DISABLED_VALUE = 1;
            public static final int STATUS_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIRichNotifications.ErrorNotification.Status.1
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
                    return STATUS_UNKNOWN;
                }
                if (i14 != 1) {
                    return null;
                }
                return STATUS_EU_TIMEOUT_NOTIFICATIONS_DISABLED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ErrorNotification.getDescriptor().getEnumTypes().get(0);
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

    public static final class NotificationConfiguration extends GeneratedMessageV3 implements NotificationConfigurationOrBuilder {
        public static final int ATTRIBUTES_FIELD_NUMBER = 4;
        public static final int MAX_BODY_LENGTH_FIELD_NUMBER = 3;
        public static final int MAX_SUBTITLE_LENGTH_FIELD_NUMBER = 2;
        public static final int MAX_TITLE_LENGTH_FIELD_NUMBER = 1;
        public static final int SUPPORTED_TYPES_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private DisplayAttributes attributes_;
        private int bitField0_;
        private int maxBodyLength_;
        private int maxSubtitleLength_;
        private int maxTitleLength_;
        private byte memoizedIsInitialized;
        private List<Integer> supportedTypes_;
        private static final Internal.ListAdapter.Converter<Integer, MediaType> supportedTypes_converter_ = new Internal.ListAdapter.Converter<Integer, MediaType>() { // from class: com.garmin.proto.generated.GDIRichNotifications.NotificationConfiguration.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public MediaType convert(Integer num) {
                MediaType mediaTypeForNumber = MediaType.forNumber(num.intValue());
                return mediaTypeForNumber == null ? MediaType.MEDIA_TYPE_UNKNOWN : mediaTypeForNumber;
            }
        };
        private static final NotificationConfiguration DEFAULT_INSTANCE = new NotificationConfiguration();

        @Deprecated
        public static final Parser<NotificationConfiguration> PARSER = new AbstractParser<NotificationConfiguration>() { // from class: com.garmin.proto.generated.GDIRichNotifications.NotificationConfiguration.2
            @Override // com.google.protobuf.Parser
            public NotificationConfiguration parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = NotificationConfiguration.newBuilder();
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

        private NotificationConfiguration() {
            this.maxTitleLength_ = 0;
            this.maxSubtitleLength_ = 0;
            this.maxBodyLength_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.supportedTypes_ = Collections.EMPTY_LIST;
        }

        public static NotificationConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_NotificationConfiguration_descriptor;
        }

        public static Builder newBuilder(NotificationConfiguration notificationConfiguration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(notificationConfiguration);
        }

        public static NotificationConfiguration parseDelimitedFrom(InputStream inputStream) {
            return (NotificationConfiguration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static NotificationConfiguration parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<NotificationConfiguration> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NotificationConfiguration)) {
                return super.equals(obj);
            }
            NotificationConfiguration notificationConfiguration = (NotificationConfiguration) obj;
            if (hasMaxTitleLength() != notificationConfiguration.hasMaxTitleLength()) {
                return false;
            }
            if ((hasMaxTitleLength() && getMaxTitleLength() != notificationConfiguration.getMaxTitleLength()) || hasMaxSubtitleLength() != notificationConfiguration.hasMaxSubtitleLength()) {
                return false;
            }
            if ((hasMaxSubtitleLength() && getMaxSubtitleLength() != notificationConfiguration.getMaxSubtitleLength()) || hasMaxBodyLength() != notificationConfiguration.hasMaxBodyLength()) {
                return false;
            }
            if ((!hasMaxBodyLength() || getMaxBodyLength() == notificationConfiguration.getMaxBodyLength()) && hasAttributes() == notificationConfiguration.hasAttributes()) {
                return (!hasAttributes() || getAttributes().equals(notificationConfiguration.getAttributes())) && this.supportedTypes_.equals(notificationConfiguration.supportedTypes_) && getUnknownFields().equals(notificationConfiguration.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
        public DisplayAttributes getAttributes() {
            DisplayAttributes displayAttributes = this.attributes_;
            return displayAttributes == null ? DisplayAttributes.getDefaultInstance() : displayAttributes;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
        public DisplayAttributesOrBuilder getAttributesOrBuilder() {
            DisplayAttributes displayAttributes = this.attributes_;
            return displayAttributes == null ? DisplayAttributes.getDefaultInstance() : displayAttributes;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
        public int getMaxBodyLength() {
            return this.maxBodyLength_;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
        public int getMaxSubtitleLength() {
            return this.maxSubtitleLength_;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
        public int getMaxTitleLength() {
            return this.maxTitleLength_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<NotificationConfiguration> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int i15 = 0;
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.maxTitleLength_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.maxSubtitleLength_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.maxBodyLength_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(4, getAttributes());
            }
            int iA = 0;
            while (true) {
                int size = this.supportedTypes_.size();
                List<Integer> list = this.supportedTypes_;
                if (i15 >= size) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list.size() + iComputeUInt32Size + iA;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
        public MediaType getSupportedTypes(int i14) {
            return supportedTypes_converter_.convert(this.supportedTypes_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
        public int getSupportedTypesCount() {
            return this.supportedTypes_.size();
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
        public List<MediaType> getSupportedTypesList() {
            return new Internal.ListAdapter(this.supportedTypes_, supportedTypes_converter_);
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
        public boolean hasAttributes() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
        public boolean hasMaxBodyLength() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
        public boolean hasMaxSubtitleLength() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
        public boolean hasMaxTitleLength() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMaxTitleLength()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getMaxTitleLength();
            }
            if (hasMaxSubtitleLength()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getMaxSubtitleLength();
            }
            if (hasMaxBodyLength()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getMaxBodyLength();
            }
            if (hasAttributes()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getAttributes().hashCode();
            }
            if (getSupportedTypesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + this.supportedTypes_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_NotificationConfiguration_fieldAccessorTable.ensureFieldAccessorsInitialized(NotificationConfiguration.class, Builder.class);
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
            return new NotificationConfiguration();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.maxTitleLength_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.maxSubtitleLength_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.maxBodyLength_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getAttributes());
            }
            int iF = 0;
            while (iF < this.supportedTypes_.size()) {
                iF = f3.f(this.supportedTypes_.get(iF), codedOutputStream, 5, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NotificationConfigurationOrBuilder {
            private SingleFieldBuilderV3<DisplayAttributes, DisplayAttributes.Builder, DisplayAttributesOrBuilder> attributesBuilder_;
            private DisplayAttributes attributes_;
            private int bitField0_;
            private int maxBodyLength_;
            private int maxSubtitleLength_;
            private int maxTitleLength_;
            private List<Integer> supportedTypes_;

            private Builder() {
                this.supportedTypes_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(NotificationConfiguration notificationConfiguration) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    notificationConfiguration.maxTitleLength_ = this.maxTitleLength_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    notificationConfiguration.maxSubtitleLength_ = this.maxSubtitleLength_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    notificationConfiguration.maxBodyLength_ = this.maxBodyLength_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<DisplayAttributes, DisplayAttributes.Builder, DisplayAttributesOrBuilder> singleFieldBuilderV3 = this.attributesBuilder_;
                    notificationConfiguration.attributes_ = singleFieldBuilderV3 == null ? this.attributes_ : (DisplayAttributes) singleFieldBuilderV3.build();
                    i14 |= 8;
                }
                notificationConfiguration.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(NotificationConfiguration notificationConfiguration) {
                if ((this.bitField0_ & 16) != 0) {
                    this.supportedTypes_ = Collections.unmodifiableList(this.supportedTypes_);
                    this.bitField0_ &= -17;
                }
                notificationConfiguration.supportedTypes_ = this.supportedTypes_;
            }

            private void ensureSupportedTypesIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.supportedTypes_ = new ArrayList(this.supportedTypes_);
                    this.bitField0_ |= 16;
                }
            }

            private SingleFieldBuilderV3<DisplayAttributes, DisplayAttributes.Builder, DisplayAttributesOrBuilder> getAttributesFieldBuilder() {
                if (this.attributesBuilder_ == null) {
                    this.attributesBuilder_ = new SingleFieldBuilderV3<>(getAttributes(), getParentForChildren(), isClean());
                    this.attributes_ = null;
                }
                return this.attributesBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_NotificationConfiguration_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getAttributesFieldBuilder();
                }
            }

            public Builder addAllSupportedTypes(Iterable<? extends MediaType> iterable) {
                ensureSupportedTypesIsMutable();
                Iterator<? extends MediaType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.supportedTypes_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSupportedTypes(MediaType mediaType) {
                mediaType.getClass();
                ensureSupportedTypesIsMutable();
                this.supportedTypes_.add(Integer.valueOf(mediaType.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NotificationConfiguration build() {
                NotificationConfiguration notificationConfigurationBuildPartial = buildPartial();
                if (notificationConfigurationBuildPartial.isInitialized()) {
                    return notificationConfigurationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) notificationConfigurationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NotificationConfiguration buildPartial() {
                NotificationConfiguration notificationConfiguration = new NotificationConfiguration(this);
                buildPartialRepeatedFields(notificationConfiguration);
                if (this.bitField0_ != 0) {
                    buildPartial0(notificationConfiguration);
                }
                onBuilt();
                return notificationConfiguration;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.maxTitleLength_ = 0;
                this.maxSubtitleLength_ = 0;
                this.maxBodyLength_ = 0;
                this.attributes_ = null;
                SingleFieldBuilderV3<DisplayAttributes, DisplayAttributes.Builder, DisplayAttributesOrBuilder> singleFieldBuilderV3 = this.attributesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.attributesBuilder_ = null;
                }
                this.supportedTypes_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -17;
                return this;
            }

            public Builder clearAttributes() {
                this.bitField0_ &= -9;
                this.attributes_ = null;
                SingleFieldBuilderV3<DisplayAttributes, DisplayAttributes.Builder, DisplayAttributesOrBuilder> singleFieldBuilderV3 = this.attributesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.attributesBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMaxBodyLength() {
                this.bitField0_ &= -5;
                this.maxBodyLength_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxSubtitleLength() {
                this.bitField0_ &= -3;
                this.maxSubtitleLength_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxTitleLength() {
                this.bitField0_ &= -2;
                this.maxTitleLength_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSupportedTypes() {
                this.supportedTypes_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
            public DisplayAttributes getAttributes() {
                SingleFieldBuilderV3<DisplayAttributes, DisplayAttributes.Builder, DisplayAttributesOrBuilder> singleFieldBuilderV3 = this.attributesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DisplayAttributes) singleFieldBuilderV3.getMessage();
                }
                DisplayAttributes displayAttributes = this.attributes_;
                return displayAttributes == null ? DisplayAttributes.getDefaultInstance() : displayAttributes;
            }

            public DisplayAttributes.Builder getAttributesBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (DisplayAttributes.Builder) getAttributesFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
            public DisplayAttributesOrBuilder getAttributesOrBuilder() {
                SingleFieldBuilderV3<DisplayAttributes, DisplayAttributes.Builder, DisplayAttributesOrBuilder> singleFieldBuilderV3 = this.attributesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DisplayAttributesOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DisplayAttributes displayAttributes = this.attributes_;
                return displayAttributes == null ? DisplayAttributes.getDefaultInstance() : displayAttributes;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_NotificationConfiguration_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
            public int getMaxBodyLength() {
                return this.maxBodyLength_;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
            public int getMaxSubtitleLength() {
                return this.maxSubtitleLength_;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
            public int getMaxTitleLength() {
                return this.maxTitleLength_;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
            public MediaType getSupportedTypes(int i14) {
                return (MediaType) NotificationConfiguration.supportedTypes_converter_.convert(this.supportedTypes_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
            public int getSupportedTypesCount() {
                return this.supportedTypes_.size();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
            public List<MediaType> getSupportedTypesList() {
                return new Internal.ListAdapter(this.supportedTypes_, NotificationConfiguration.supportedTypes_converter_);
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
            public boolean hasAttributes() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
            public boolean hasMaxBodyLength() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
            public boolean hasMaxSubtitleLength() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationConfigurationOrBuilder
            public boolean hasMaxTitleLength() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_NotificationConfiguration_fieldAccessorTable.ensureFieldAccessorsInitialized(NotificationConfiguration.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAttributes(DisplayAttributes displayAttributes) {
                DisplayAttributes displayAttributes2;
                SingleFieldBuilderV3<DisplayAttributes, DisplayAttributes.Builder, DisplayAttributesOrBuilder> singleFieldBuilderV3 = this.attributesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(displayAttributes);
                } else if ((this.bitField0_ & 8) == 0 || (displayAttributes2 = this.attributes_) == null || displayAttributes2 == DisplayAttributes.getDefaultInstance()) {
                    this.attributes_ = displayAttributes;
                } else {
                    getAttributesBuilder().mergeFrom(displayAttributes);
                }
                if (this.attributes_ != null) {
                    this.bitField0_ |= 8;
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
                                    this.maxTitleLength_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.maxSubtitleLength_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.maxBodyLength_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getAttributesFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    int i14 = codedInputStream.readEnum();
                                    if (MediaType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(5, i14);
                                    } else {
                                        ensureSupportedTypesIsMutable();
                                        this.supportedTypes_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 42) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (MediaType.forNumber(i15) == null) {
                                            mergeUnknownVarintField(5, i15);
                                        } else {
                                            ensureSupportedTypesIsMutable();
                                            this.supportedTypes_.add(Integer.valueOf(i15));
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

            public Builder setAttributes(DisplayAttributes.Builder builder) {
                SingleFieldBuilderV3<DisplayAttributes, DisplayAttributes.Builder, DisplayAttributesOrBuilder> singleFieldBuilderV3 = this.attributesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.attributes_ = builder.build();
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

            public Builder setMaxBodyLength(int i14) {
                this.maxBodyLength_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMaxSubtitleLength(int i14) {
                this.maxSubtitleLength_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMaxTitleLength(int i14) {
                this.maxTitleLength_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSupportedTypes(int i14, MediaType mediaType) {
                mediaType.getClass();
                ensureSupportedTypesIsMutable();
                this.supportedTypes_.set(i14, Integer.valueOf(mediaType.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public NotificationConfiguration getDefaultInstanceForType() {
                return NotificationConfiguration.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.supportedTypes_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder setAttributes(DisplayAttributes displayAttributes) {
                SingleFieldBuilderV3<DisplayAttributes, DisplayAttributes.Builder, DisplayAttributesOrBuilder> singleFieldBuilderV3 = this.attributesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    displayAttributes.getClass();
                    this.attributes_ = displayAttributes;
                } else {
                    singleFieldBuilderV3.setMessage(displayAttributes);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof NotificationConfiguration) {
                    return mergeFrom((NotificationConfiguration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(NotificationConfiguration notificationConfiguration) {
                if (notificationConfiguration == NotificationConfiguration.getDefaultInstance()) {
                    return this;
                }
                if (notificationConfiguration.hasMaxTitleLength()) {
                    setMaxTitleLength(notificationConfiguration.getMaxTitleLength());
                }
                if (notificationConfiguration.hasMaxSubtitleLength()) {
                    setMaxSubtitleLength(notificationConfiguration.getMaxSubtitleLength());
                }
                if (notificationConfiguration.hasMaxBodyLength()) {
                    setMaxBodyLength(notificationConfiguration.getMaxBodyLength());
                }
                if (notificationConfiguration.hasAttributes()) {
                    mergeAttributes(notificationConfiguration.getAttributes());
                }
                if (!notificationConfiguration.supportedTypes_.isEmpty()) {
                    if (this.supportedTypes_.isEmpty()) {
                        this.supportedTypes_ = notificationConfiguration.supportedTypes_;
                        this.bitField0_ &= -17;
                    } else {
                        ensureSupportedTypesIsMutable();
                        this.supportedTypes_.addAll(notificationConfiguration.supportedTypes_);
                    }
                    onChanged();
                }
                mergeUnknownFields(notificationConfiguration.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public NotificationConfiguration getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static NotificationConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NotificationConfiguration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NotificationConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static NotificationConfiguration parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static NotificationConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static NotificationConfiguration parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static NotificationConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static NotificationConfiguration parseFrom(InputStream inputStream) {
            return (NotificationConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static NotificationConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NotificationConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private NotificationConfiguration(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.maxTitleLength_ = 0;
            this.maxSubtitleLength_ = 0;
            this.maxBodyLength_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NotificationConfiguration parseFrom(CodedInputStream codedInputStream) {
            return (NotificationConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static NotificationConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NotificationConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ NotificationConfiguration(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class NotificationData extends GeneratedMessageV3 implements NotificationDataOrBuilder {
        public static final int ACTIONS_FIELD_NUMBER = 9;
        public static final int APP_DISPLAY_NAME_FIELD_NUMBER = 1;
        public static final int APP_ICON_FIELD_NUMBER = 11;
        public static final int BODY_FIELD_NUMBER = 4;
        public static final int CONTACT_ICON_FIELD_NUMBER = 12;
        public static final int DELIVERY_DATE_FIELD_NUMBER = 6;
        public static final int DISPLAY_DATE_FIELD_NUMBER = 7;
        public static final int DISPLAY_TYPE_FIELD_NUMBER = 8;
        public static final int EMBEDDED_IMAGES_FIELD_NUMBER = 14;
        public static final int EXPECTED_MEDIA_ATTACHMENT_COUNT_FIELD_NUMBER = 15;
        public static final int KIND_FIELD_NUMBER = 13;
        public static final int MEDIA_ATTACHMENTS_FIELD_NUMBER = 10;
        public static final int SUBTITLE_FIELD_NUMBER = 3;
        public static final int THREAD_IDENTIFIER_FIELD_NUMBER = 5;
        public static final int TITLE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private List<ActionInfo> actions_;
        private volatile Object appDisplayName_;
        private AttachmentItem appIcon_;
        private int bitField0_;
        private volatile Object body_;
        private AttachmentItem contactIcon_;
        private int deliveryDate_;
        private int displayDate_;
        private int displayType_;
        private List<AttachmentItem> embeddedImages_;
        private int expectedMediaAttachmentCount_;
        private int kind_;
        private List<AttachmentItem> mediaAttachments_;
        private byte memoizedIsInitialized;
        private volatile Object subtitle_;
        private volatile Object threadIdentifier_;
        private volatile Object title_;
        private static final NotificationData DEFAULT_INSTANCE = new NotificationData();

        @Deprecated
        public static final Parser<NotificationData> PARSER = new AbstractParser<NotificationData>() { // from class: com.garmin.proto.generated.GDIRichNotifications.NotificationData.1
            @Override // com.google.protobuf.Parser
            public NotificationData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = NotificationData.newBuilder();
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

        private NotificationData() {
            this.appDisplayName_ = "";
            this.title_ = "";
            this.subtitle_ = "";
            this.body_ = "";
            this.threadIdentifier_ = "";
            this.deliveryDate_ = 0;
            this.displayDate_ = 0;
            this.displayType_ = 0;
            this.kind_ = 0;
            this.expectedMediaAttachmentCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.appDisplayName_ = "";
            this.title_ = "";
            this.subtitle_ = "";
            this.body_ = "";
            this.threadIdentifier_ = "";
            this.displayType_ = 0;
            List list = Collections.EMPTY_LIST;
            this.actions_ = list;
            this.mediaAttachments_ = list;
            this.kind_ = 0;
            this.embeddedImages_ = list;
        }

        public static NotificationData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_NotificationData_descriptor;
        }

        public static Builder newBuilder(NotificationData notificationData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(notificationData);
        }

        public static NotificationData parseDelimitedFrom(InputStream inputStream) {
            return (NotificationData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static NotificationData parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<NotificationData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NotificationData)) {
                return super.equals(obj);
            }
            NotificationData notificationData = (NotificationData) obj;
            if (hasAppDisplayName() != notificationData.hasAppDisplayName()) {
                return false;
            }
            if ((hasAppDisplayName() && !getAppDisplayName().equals(notificationData.getAppDisplayName())) || hasTitle() != notificationData.hasTitle()) {
                return false;
            }
            if ((hasTitle() && !getTitle().equals(notificationData.getTitle())) || hasSubtitle() != notificationData.hasSubtitle()) {
                return false;
            }
            if ((hasSubtitle() && !getSubtitle().equals(notificationData.getSubtitle())) || hasBody() != notificationData.hasBody()) {
                return false;
            }
            if ((hasBody() && !getBody().equals(notificationData.getBody())) || hasThreadIdentifier() != notificationData.hasThreadIdentifier()) {
                return false;
            }
            if ((hasThreadIdentifier() && !getThreadIdentifier().equals(notificationData.getThreadIdentifier())) || hasDeliveryDate() != notificationData.hasDeliveryDate()) {
                return false;
            }
            if ((hasDeliveryDate() && getDeliveryDate() != notificationData.getDeliveryDate()) || hasDisplayDate() != notificationData.hasDisplayDate()) {
                return false;
            }
            if ((hasDisplayDate() && getDisplayDate() != notificationData.getDisplayDate()) || hasDisplayType() != notificationData.hasDisplayType()) {
                return false;
            }
            if ((hasDisplayType() && this.displayType_ != notificationData.displayType_) || !getActionsList().equals(notificationData.getActionsList()) || !getMediaAttachmentsList().equals(notificationData.getMediaAttachmentsList()) || hasAppIcon() != notificationData.hasAppIcon()) {
                return false;
            }
            if ((hasAppIcon() && !getAppIcon().equals(notificationData.getAppIcon())) || hasContactIcon() != notificationData.hasContactIcon()) {
                return false;
            }
            if ((hasContactIcon() && !getContactIcon().equals(notificationData.getContactIcon())) || hasKind() != notificationData.hasKind()) {
                return false;
            }
            if ((!hasKind() || this.kind_ == notificationData.kind_) && getEmbeddedImagesList().equals(notificationData.getEmbeddedImagesList()) && hasExpectedMediaAttachmentCount() == notificationData.hasExpectedMediaAttachmentCount()) {
                return (!hasExpectedMediaAttachmentCount() || getExpectedMediaAttachmentCount() == notificationData.getExpectedMediaAttachmentCount()) && getUnknownFields().equals(notificationData.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public ActionInfo getActions(int i14) {
            return this.actions_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public int getActionsCount() {
            return this.actions_.size();
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public List<ActionInfo> getActionsList() {
            return this.actions_;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public ActionInfoOrBuilder getActionsOrBuilder(int i14) {
            return this.actions_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public List<? extends ActionInfoOrBuilder> getActionsOrBuilderList() {
            return this.actions_;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public String getAppDisplayName() {
            Object obj = this.appDisplayName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.appDisplayName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public ByteString getAppDisplayNameBytes() {
            Object obj = this.appDisplayName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appDisplayName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public AttachmentItem getAppIcon() {
            AttachmentItem attachmentItem = this.appIcon_;
            return attachmentItem == null ? AttachmentItem.getDefaultInstance() : attachmentItem;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public AttachmentItemOrBuilder getAppIconOrBuilder() {
            AttachmentItem attachmentItem = this.appIcon_;
            return attachmentItem == null ? AttachmentItem.getDefaultInstance() : attachmentItem;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public String getBody() {
            Object obj = this.body_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.body_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public ByteString getBodyBytes() {
            Object obj = this.body_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.body_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public AttachmentItem getContactIcon() {
            AttachmentItem attachmentItem = this.contactIcon_;
            return attachmentItem == null ? AttachmentItem.getDefaultInstance() : attachmentItem;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public AttachmentItemOrBuilder getContactIconOrBuilder() {
            AttachmentItem attachmentItem = this.contactIcon_;
            return attachmentItem == null ? AttachmentItem.getDefaultInstance() : attachmentItem;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public int getDeliveryDate() {
            return this.deliveryDate_;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public int getDisplayDate() {
            return this.displayDate_;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public DisplayType getDisplayType() {
            DisplayType displayTypeForNumber = DisplayType.forNumber(this.displayType_);
            return displayTypeForNumber == null ? DisplayType.DISPLAY_TYPE_UNKNOWN : displayTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public AttachmentItem getEmbeddedImages(int i14) {
            return this.embeddedImages_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public int getEmbeddedImagesCount() {
            return this.embeddedImages_.size();
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public List<AttachmentItem> getEmbeddedImagesList() {
            return this.embeddedImages_;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public AttachmentItemOrBuilder getEmbeddedImagesOrBuilder(int i14) {
            return this.embeddedImages_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public List<? extends AttachmentItemOrBuilder> getEmbeddedImagesOrBuilderList() {
            return this.embeddedImages_;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public int getExpectedMediaAttachmentCount() {
            return this.expectedMediaAttachmentCount_;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public Kind getKind() {
            Kind kindForNumber = Kind.forNumber(this.kind_);
            return kindForNumber == null ? Kind.KIND_UNKNOWN : kindForNumber;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public AttachmentItem getMediaAttachments(int i14) {
            return this.mediaAttachments_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public int getMediaAttachmentsCount() {
            return this.mediaAttachments_.size();
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public List<AttachmentItem> getMediaAttachmentsList() {
            return this.mediaAttachments_;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public AttachmentItemOrBuilder getMediaAttachmentsOrBuilder(int i14) {
            return this.mediaAttachments_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public List<? extends AttachmentItemOrBuilder> getMediaAttachmentsOrBuilderList() {
            return this.mediaAttachments_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<NotificationData> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.appDisplayName_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.title_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.subtitle_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.body_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.threadIdentifier_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(6, this.deliveryDate_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(7, this.displayDate_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(8, this.displayType_);
            }
            for (int i15 = 0; i15 < this.actions_.size(); i15++) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(9, this.actions_.get(i15));
            }
            for (int i16 = 0; i16 < this.mediaAttachments_.size(); i16++) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(10, this.mediaAttachments_.get(i16));
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(11, getAppIcon());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(12, getContactIcon());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(13, this.kind_);
            }
            for (int i17 = 0; i17 < this.embeddedImages_.size(); i17++) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(14, this.embeddedImages_.get(i17));
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(15, this.expectedMediaAttachmentCount_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public String getSubtitle() {
            Object obj = this.subtitle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.subtitle_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public ByteString getSubtitleBytes() {
            Object obj = this.subtitle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.subtitle_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public String getThreadIdentifier() {
            Object obj = this.threadIdentifier_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.threadIdentifier_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public ByteString getThreadIdentifierBytes() {
            Object obj = this.threadIdentifier_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.threadIdentifier_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public String getTitle() {
            Object obj = this.title_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.title_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public ByteString getTitleBytes() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.title_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public boolean hasAppDisplayName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public boolean hasAppIcon() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public boolean hasBody() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public boolean hasContactIcon() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public boolean hasDeliveryDate() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public boolean hasDisplayDate() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public boolean hasDisplayType() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public boolean hasExpectedMediaAttachmentCount() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public boolean hasKind() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public boolean hasSubtitle() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public boolean hasThreadIdentifier() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
        public boolean hasTitle() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAppDisplayName()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getAppDisplayName().hashCode();
            }
            if (hasTitle()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTitle().hashCode();
            }
            if (hasSubtitle()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSubtitle().hashCode();
            }
            if (hasBody()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getBody().hashCode();
            }
            if (hasThreadIdentifier()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getThreadIdentifier().hashCode();
            }
            if (hasDeliveryDate()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getDeliveryDate();
            }
            if (hasDisplayDate()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getDisplayDate();
            }
            if (hasDisplayType()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + this.displayType_;
            }
            if (getActionsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getActionsList().hashCode();
            }
            if (getMediaAttachmentsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getMediaAttachmentsList().hashCode();
            }
            if (hasAppIcon()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getAppIcon().hashCode();
            }
            if (hasContactIcon()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getContactIcon().hashCode();
            }
            if (hasKind()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + this.kind_;
            }
            if (getEmbeddedImagesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + getEmbeddedImagesList().hashCode();
            }
            if (hasExpectedMediaAttachmentCount()) {
                iHashCode = e5.c(iHashCode, 37, 15, 53) + getExpectedMediaAttachmentCount();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_NotificationData_fieldAccessorTable.ensureFieldAccessorsInitialized(NotificationData.class, Builder.class);
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
            return new NotificationData();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.appDisplayName_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.title_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.subtitle_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.body_);
            }
            if ((this.bitField0_ & 16) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.threadIdentifier_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.deliveryDate_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(7, this.displayDate_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeEnum(8, this.displayType_);
            }
            for (int i14 = 0; i14 < this.actions_.size(); i14++) {
                codedOutputStream.writeMessage(9, this.actions_.get(i14));
            }
            for (int i15 = 0; i15 < this.mediaAttachments_.size(); i15++) {
                codedOutputStream.writeMessage(10, this.mediaAttachments_.get(i15));
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(11, getAppIcon());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(12, getContactIcon());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeEnum(13, this.kind_);
            }
            for (int i16 = 0; i16 < this.embeddedImages_.size(); i16++) {
                codedOutputStream.writeMessage(14, this.embeddedImages_.get(i16));
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeUInt32(15, this.expectedMediaAttachmentCount_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NotificationDataOrBuilder {
            private RepeatedFieldBuilderV3<ActionInfo, ActionInfo.Builder, ActionInfoOrBuilder> actionsBuilder_;
            private List<ActionInfo> actions_;
            private Object appDisplayName_;
            private SingleFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> appIconBuilder_;
            private AttachmentItem appIcon_;
            private int bitField0_;
            private Object body_;
            private SingleFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> contactIconBuilder_;
            private AttachmentItem contactIcon_;
            private int deliveryDate_;
            private int displayDate_;
            private int displayType_;
            private RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> embeddedImagesBuilder_;
            private List<AttachmentItem> embeddedImages_;
            private int expectedMediaAttachmentCount_;
            private int kind_;
            private RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> mediaAttachmentsBuilder_;
            private List<AttachmentItem> mediaAttachments_;
            private Object subtitle_;
            private Object threadIdentifier_;
            private Object title_;

            private Builder() {
                this.appDisplayName_ = "";
                this.title_ = "";
                this.subtitle_ = "";
                this.body_ = "";
                this.threadIdentifier_ = "";
                this.displayType_ = 0;
                List list = Collections.EMPTY_LIST;
                this.actions_ = list;
                this.mediaAttachments_ = list;
                this.kind_ = 0;
                this.embeddedImages_ = list;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(NotificationData notificationData) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    notificationData.appDisplayName_ = this.appDisplayName_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    notificationData.title_ = this.title_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    notificationData.subtitle_ = this.subtitle_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    notificationData.body_ = this.body_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    notificationData.threadIdentifier_ = this.threadIdentifier_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    notificationData.deliveryDate_ = this.deliveryDate_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    notificationData.displayDate_ = this.displayDate_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    notificationData.displayType_ = this.displayType_;
                    i14 |= 128;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> singleFieldBuilderV3 = this.appIconBuilder_;
                    notificationData.appIcon_ = singleFieldBuilderV3 == null ? this.appIcon_ : (AttachmentItem) singleFieldBuilderV3.build();
                    i14 |= 256;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> singleFieldBuilderV4 = this.contactIconBuilder_;
                    notificationData.contactIcon_ = singleFieldBuilderV4 == null ? this.contactIcon_ : (AttachmentItem) singleFieldBuilderV4.build();
                    i14 |= 512;
                }
                if ((i15 & 4096) != 0) {
                    notificationData.kind_ = this.kind_;
                    i14 |= 1024;
                }
                if ((i15 & 16384) != 0) {
                    notificationData.expectedMediaAttachmentCount_ = this.expectedMediaAttachmentCount_;
                    i14 |= 2048;
                }
                notificationData.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(NotificationData notificationData) {
                RepeatedFieldBuilderV3<ActionInfo, ActionInfo.Builder, ActionInfoOrBuilder> repeatedFieldBuilderV3 = this.actionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 256) != 0) {
                        this.actions_ = Collections.unmodifiableList(this.actions_);
                        this.bitField0_ &= -257;
                    }
                    notificationData.actions_ = this.actions_;
                } else {
                    notificationData.actions_ = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV4 = this.mediaAttachmentsBuilder_;
                if (repeatedFieldBuilderV4 == null) {
                    if ((this.bitField0_ & 512) != 0) {
                        this.mediaAttachments_ = Collections.unmodifiableList(this.mediaAttachments_);
                        this.bitField0_ &= -513;
                    }
                    notificationData.mediaAttachments_ = this.mediaAttachments_;
                } else {
                    notificationData.mediaAttachments_ = repeatedFieldBuilderV4.build();
                }
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV5 = this.embeddedImagesBuilder_;
                if (repeatedFieldBuilderV5 != null) {
                    notificationData.embeddedImages_ = repeatedFieldBuilderV5.build();
                    return;
                }
                if ((this.bitField0_ & 8192) != 0) {
                    this.embeddedImages_ = Collections.unmodifiableList(this.embeddedImages_);
                    this.bitField0_ &= -8193;
                }
                notificationData.embeddedImages_ = this.embeddedImages_;
            }

            private void ensureActionsIsMutable() {
                if ((this.bitField0_ & 256) == 0) {
                    this.actions_ = new ArrayList(this.actions_);
                    this.bitField0_ |= 256;
                }
            }

            private void ensureEmbeddedImagesIsMutable() {
                if ((this.bitField0_ & 8192) == 0) {
                    this.embeddedImages_ = new ArrayList(this.embeddedImages_);
                    this.bitField0_ |= 8192;
                }
            }

            private void ensureMediaAttachmentsIsMutable() {
                if ((this.bitField0_ & 512) == 0) {
                    this.mediaAttachments_ = new ArrayList(this.mediaAttachments_);
                    this.bitField0_ |= 512;
                }
            }

            private RepeatedFieldBuilderV3<ActionInfo, ActionInfo.Builder, ActionInfoOrBuilder> getActionsFieldBuilder() {
                if (this.actionsBuilder_ == null) {
                    this.actionsBuilder_ = new RepeatedFieldBuilderV3<>(this.actions_, (this.bitField0_ & 256) != 0, getParentForChildren(), isClean());
                    this.actions_ = null;
                }
                return this.actionsBuilder_;
            }

            private SingleFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> getAppIconFieldBuilder() {
                if (this.appIconBuilder_ == null) {
                    this.appIconBuilder_ = new SingleFieldBuilderV3<>(getAppIcon(), getParentForChildren(), isClean());
                    this.appIcon_ = null;
                }
                return this.appIconBuilder_;
            }

            private SingleFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> getContactIconFieldBuilder() {
                if (this.contactIconBuilder_ == null) {
                    this.contactIconBuilder_ = new SingleFieldBuilderV3<>(getContactIcon(), getParentForChildren(), isClean());
                    this.contactIcon_ = null;
                }
                return this.contactIconBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_NotificationData_descriptor;
            }

            private RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> getEmbeddedImagesFieldBuilder() {
                if (this.embeddedImagesBuilder_ == null) {
                    this.embeddedImagesBuilder_ = new RepeatedFieldBuilderV3<>(this.embeddedImages_, (this.bitField0_ & 8192) != 0, getParentForChildren(), isClean());
                    this.embeddedImages_ = null;
                }
                return this.embeddedImagesBuilder_;
            }

            private RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> getMediaAttachmentsFieldBuilder() {
                if (this.mediaAttachmentsBuilder_ == null) {
                    this.mediaAttachmentsBuilder_ = new RepeatedFieldBuilderV3<>(this.mediaAttachments_, (this.bitField0_ & 512) != 0, getParentForChildren(), isClean());
                    this.mediaAttachments_ = null;
                }
                return this.mediaAttachmentsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getActionsFieldBuilder();
                    getMediaAttachmentsFieldBuilder();
                    getAppIconFieldBuilder();
                    getContactIconFieldBuilder();
                    getEmbeddedImagesFieldBuilder();
                }
            }

            public Builder addActions(ActionInfo.Builder builder) {
                RepeatedFieldBuilderV3<ActionInfo, ActionInfo.Builder, ActionInfoOrBuilder> repeatedFieldBuilderV3 = this.actionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureActionsIsMutable();
                this.actions_.add(builder.build());
                onChanged();
                return this;
            }

            public ActionInfo.Builder addActionsBuilder() {
                return (ActionInfo.Builder) getActionsFieldBuilder().addBuilder(ActionInfo.getDefaultInstance());
            }

            public Builder addAllActions(Iterable<? extends ActionInfo> iterable) {
                RepeatedFieldBuilderV3<ActionInfo, ActionInfo.Builder, ActionInfoOrBuilder> repeatedFieldBuilderV3 = this.actionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureActionsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.actions_);
                onChanged();
                return this;
            }

            public Builder addAllEmbeddedImages(Iterable<? extends AttachmentItem> iterable) {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.embeddedImagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureEmbeddedImagesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.embeddedImages_);
                onChanged();
                return this;
            }

            public Builder addAllMediaAttachments(Iterable<? extends AttachmentItem> iterable) {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.mediaAttachmentsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureMediaAttachmentsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.mediaAttachments_);
                onChanged();
                return this;
            }

            public Builder addEmbeddedImages(AttachmentItem.Builder builder) {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.embeddedImagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureEmbeddedImagesIsMutable();
                this.embeddedImages_.add(builder.build());
                onChanged();
                return this;
            }

            public AttachmentItem.Builder addEmbeddedImagesBuilder() {
                return (AttachmentItem.Builder) getEmbeddedImagesFieldBuilder().addBuilder(AttachmentItem.getDefaultInstance());
            }

            public Builder addMediaAttachments(AttachmentItem.Builder builder) {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.mediaAttachmentsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureMediaAttachmentsIsMutable();
                this.mediaAttachments_.add(builder.build());
                onChanged();
                return this;
            }

            public AttachmentItem.Builder addMediaAttachmentsBuilder() {
                return (AttachmentItem.Builder) getMediaAttachmentsFieldBuilder().addBuilder(AttachmentItem.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NotificationData build() {
                NotificationData notificationDataBuildPartial = buildPartial();
                if (notificationDataBuildPartial.isInitialized()) {
                    return notificationDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) notificationDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NotificationData buildPartial() {
                NotificationData notificationData = new NotificationData(this);
                buildPartialRepeatedFields(notificationData);
                if (this.bitField0_ != 0) {
                    buildPartial0(notificationData);
                }
                onBuilt();
                return notificationData;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.appDisplayName_ = "";
                this.title_ = "";
                this.subtitle_ = "";
                this.body_ = "";
                this.threadIdentifier_ = "";
                this.deliveryDate_ = 0;
                this.displayDate_ = 0;
                this.displayType_ = 0;
                RepeatedFieldBuilderV3<ActionInfo, ActionInfo.Builder, ActionInfoOrBuilder> repeatedFieldBuilderV3 = this.actionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.actions_ = Collections.EMPTY_LIST;
                } else {
                    this.actions_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -257;
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV4 = this.mediaAttachmentsBuilder_;
                if (repeatedFieldBuilderV4 == null) {
                    this.mediaAttachments_ = Collections.EMPTY_LIST;
                } else {
                    this.mediaAttachments_ = null;
                    repeatedFieldBuilderV4.clear();
                }
                this.bitField0_ &= -513;
                this.appIcon_ = null;
                SingleFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> singleFieldBuilderV3 = this.appIconBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.appIconBuilder_ = null;
                }
                this.contactIcon_ = null;
                SingleFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> singleFieldBuilderV4 = this.contactIconBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.contactIconBuilder_ = null;
                }
                this.kind_ = 0;
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV5 = this.embeddedImagesBuilder_;
                if (repeatedFieldBuilderV5 == null) {
                    this.embeddedImages_ = Collections.EMPTY_LIST;
                } else {
                    this.embeddedImages_ = null;
                    repeatedFieldBuilderV5.clear();
                }
                this.bitField0_ &= -8193;
                this.expectedMediaAttachmentCount_ = 0;
                return this;
            }

            public Builder clearActions() {
                RepeatedFieldBuilderV3<ActionInfo, ActionInfo.Builder, ActionInfoOrBuilder> repeatedFieldBuilderV3 = this.actionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.actions_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -257;
                onChanged();
                return this;
            }

            public Builder clearAppDisplayName() {
                this.appDisplayName_ = NotificationData.getDefaultInstance().getAppDisplayName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearAppIcon() {
                this.bitField0_ &= -1025;
                this.appIcon_ = null;
                SingleFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> singleFieldBuilderV3 = this.appIconBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.appIconBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearBody() {
                this.body_ = NotificationData.getDefaultInstance().getBody();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearContactIcon() {
                this.bitField0_ &= -2049;
                this.contactIcon_ = null;
                SingleFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> singleFieldBuilderV3 = this.contactIconBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.contactIconBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDeliveryDate() {
                this.bitField0_ &= -33;
                this.deliveryDate_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDisplayDate() {
                this.bitField0_ &= -65;
                this.displayDate_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDisplayType() {
                this.bitField0_ &= -129;
                this.displayType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEmbeddedImages() {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.embeddedImagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.embeddedImages_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -8193;
                onChanged();
                return this;
            }

            public Builder clearExpectedMediaAttachmentCount() {
                this.bitField0_ &= -16385;
                this.expectedMediaAttachmentCount_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearKind() {
                this.bitField0_ &= -4097;
                this.kind_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMediaAttachments() {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.mediaAttachmentsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.mediaAttachments_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -513;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSubtitle() {
                this.subtitle_ = NotificationData.getDefaultInstance().getSubtitle();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearThreadIdentifier() {
                this.threadIdentifier_ = NotificationData.getDefaultInstance().getThreadIdentifier();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearTitle() {
                this.title_ = NotificationData.getDefaultInstance().getTitle();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public ActionInfo getActions(int i14) {
                RepeatedFieldBuilderV3<ActionInfo, ActionInfo.Builder, ActionInfoOrBuilder> repeatedFieldBuilderV3 = this.actionsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.actions_.get(i14) : (ActionInfo) repeatedFieldBuilderV3.getMessage(i14);
            }

            public ActionInfo.Builder getActionsBuilder(int i14) {
                return (ActionInfo.Builder) getActionsFieldBuilder().getBuilder(i14);
            }

            public List<ActionInfo.Builder> getActionsBuilderList() {
                return getActionsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public int getActionsCount() {
                RepeatedFieldBuilderV3<ActionInfo, ActionInfo.Builder, ActionInfoOrBuilder> repeatedFieldBuilderV3 = this.actionsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.actions_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public List<ActionInfo> getActionsList() {
                RepeatedFieldBuilderV3<ActionInfo, ActionInfo.Builder, ActionInfoOrBuilder> repeatedFieldBuilderV3 = this.actionsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.actions_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public ActionInfoOrBuilder getActionsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<ActionInfo, ActionInfo.Builder, ActionInfoOrBuilder> repeatedFieldBuilderV3 = this.actionsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.actions_.get(i14) : (ActionInfoOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public List<? extends ActionInfoOrBuilder> getActionsOrBuilderList() {
                RepeatedFieldBuilderV3<ActionInfo, ActionInfo.Builder, ActionInfoOrBuilder> repeatedFieldBuilderV3 = this.actionsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.actions_);
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public String getAppDisplayName() {
                Object obj = this.appDisplayName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.appDisplayName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public ByteString getAppDisplayNameBytes() {
                Object obj = this.appDisplayName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appDisplayName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public AttachmentItem getAppIcon() {
                SingleFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> singleFieldBuilderV3 = this.appIconBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AttachmentItem) singleFieldBuilderV3.getMessage();
                }
                AttachmentItem attachmentItem = this.appIcon_;
                return attachmentItem == null ? AttachmentItem.getDefaultInstance() : attachmentItem;
            }

            public AttachmentItem.Builder getAppIconBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (AttachmentItem.Builder) getAppIconFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public AttachmentItemOrBuilder getAppIconOrBuilder() {
                SingleFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> singleFieldBuilderV3 = this.appIconBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AttachmentItemOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AttachmentItem attachmentItem = this.appIcon_;
                return attachmentItem == null ? AttachmentItem.getDefaultInstance() : attachmentItem;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public String getBody() {
                Object obj = this.body_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.body_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public ByteString getBodyBytes() {
                Object obj = this.body_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.body_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public AttachmentItem getContactIcon() {
                SingleFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> singleFieldBuilderV3 = this.contactIconBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AttachmentItem) singleFieldBuilderV3.getMessage();
                }
                AttachmentItem attachmentItem = this.contactIcon_;
                return attachmentItem == null ? AttachmentItem.getDefaultInstance() : attachmentItem;
            }

            public AttachmentItem.Builder getContactIconBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (AttachmentItem.Builder) getContactIconFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public AttachmentItemOrBuilder getContactIconOrBuilder() {
                SingleFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> singleFieldBuilderV3 = this.contactIconBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AttachmentItemOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AttachmentItem attachmentItem = this.contactIcon_;
                return attachmentItem == null ? AttachmentItem.getDefaultInstance() : attachmentItem;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public int getDeliveryDate() {
                return this.deliveryDate_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_NotificationData_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public int getDisplayDate() {
                return this.displayDate_;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public DisplayType getDisplayType() {
                DisplayType displayTypeForNumber = DisplayType.forNumber(this.displayType_);
                return displayTypeForNumber == null ? DisplayType.DISPLAY_TYPE_UNKNOWN : displayTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public AttachmentItem getEmbeddedImages(int i14) {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.embeddedImagesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.embeddedImages_.get(i14) : (AttachmentItem) repeatedFieldBuilderV3.getMessage(i14);
            }

            public AttachmentItem.Builder getEmbeddedImagesBuilder(int i14) {
                return (AttachmentItem.Builder) getEmbeddedImagesFieldBuilder().getBuilder(i14);
            }

            public List<AttachmentItem.Builder> getEmbeddedImagesBuilderList() {
                return getEmbeddedImagesFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public int getEmbeddedImagesCount() {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.embeddedImagesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.embeddedImages_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public List<AttachmentItem> getEmbeddedImagesList() {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.embeddedImagesBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.embeddedImages_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public AttachmentItemOrBuilder getEmbeddedImagesOrBuilder(int i14) {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.embeddedImagesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.embeddedImages_.get(i14) : (AttachmentItemOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public List<? extends AttachmentItemOrBuilder> getEmbeddedImagesOrBuilderList() {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.embeddedImagesBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.embeddedImages_);
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public int getExpectedMediaAttachmentCount() {
                return this.expectedMediaAttachmentCount_;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public Kind getKind() {
                Kind kindForNumber = Kind.forNumber(this.kind_);
                return kindForNumber == null ? Kind.KIND_UNKNOWN : kindForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public AttachmentItem getMediaAttachments(int i14) {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.mediaAttachmentsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.mediaAttachments_.get(i14) : (AttachmentItem) repeatedFieldBuilderV3.getMessage(i14);
            }

            public AttachmentItem.Builder getMediaAttachmentsBuilder(int i14) {
                return (AttachmentItem.Builder) getMediaAttachmentsFieldBuilder().getBuilder(i14);
            }

            public List<AttachmentItem.Builder> getMediaAttachmentsBuilderList() {
                return getMediaAttachmentsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public int getMediaAttachmentsCount() {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.mediaAttachmentsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.mediaAttachments_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public List<AttachmentItem> getMediaAttachmentsList() {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.mediaAttachmentsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.mediaAttachments_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public AttachmentItemOrBuilder getMediaAttachmentsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.mediaAttachmentsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.mediaAttachments_.get(i14) : (AttachmentItemOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public List<? extends AttachmentItemOrBuilder> getMediaAttachmentsOrBuilderList() {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.mediaAttachmentsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.mediaAttachments_);
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public String getSubtitle() {
                Object obj = this.subtitle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.subtitle_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public ByteString getSubtitleBytes() {
                Object obj = this.subtitle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.subtitle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public String getThreadIdentifier() {
                Object obj = this.threadIdentifier_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.threadIdentifier_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public ByteString getThreadIdentifierBytes() {
                Object obj = this.threadIdentifier_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.threadIdentifier_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public String getTitle() {
                Object obj = this.title_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.title_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public ByteString getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.title_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public boolean hasAppDisplayName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public boolean hasAppIcon() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public boolean hasBody() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public boolean hasContactIcon() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public boolean hasDeliveryDate() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public boolean hasDisplayDate() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public boolean hasDisplayType() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public boolean hasExpectedMediaAttachmentCount() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public boolean hasKind() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public boolean hasSubtitle() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public boolean hasThreadIdentifier() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationDataOrBuilder
            public boolean hasTitle() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_NotificationData_fieldAccessorTable.ensureFieldAccessorsInitialized(NotificationData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAppIcon(AttachmentItem attachmentItem) {
                AttachmentItem attachmentItem2;
                SingleFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> singleFieldBuilderV3 = this.appIconBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(attachmentItem);
                } else if ((this.bitField0_ & 1024) == 0 || (attachmentItem2 = this.appIcon_) == null || attachmentItem2 == AttachmentItem.getDefaultInstance()) {
                    this.appIcon_ = attachmentItem;
                } else {
                    getAppIconBuilder().mergeFrom(attachmentItem);
                }
                if (this.appIcon_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeContactIcon(AttachmentItem attachmentItem) {
                AttachmentItem attachmentItem2;
                SingleFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> singleFieldBuilderV3 = this.contactIconBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(attachmentItem);
                } else if ((this.bitField0_ & 2048) == 0 || (attachmentItem2 = this.contactIcon_) == null || attachmentItem2 == AttachmentItem.getDefaultInstance()) {
                    this.contactIcon_ = attachmentItem;
                } else {
                    getContactIconBuilder().mergeFrom(attachmentItem);
                }
                if (this.contactIcon_ != null) {
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFrom(NotificationData notificationData) {
                if (notificationData == NotificationData.getDefaultInstance()) {
                    return this;
                }
                if (notificationData.hasAppDisplayName()) {
                    this.appDisplayName_ = notificationData.appDisplayName_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (notificationData.hasTitle()) {
                    this.title_ = notificationData.title_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (notificationData.hasSubtitle()) {
                    this.subtitle_ = notificationData.subtitle_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (notificationData.hasBody()) {
                    this.body_ = notificationData.body_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (notificationData.hasThreadIdentifier()) {
                    this.threadIdentifier_ = notificationData.threadIdentifier_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                if (notificationData.hasDeliveryDate()) {
                    setDeliveryDate(notificationData.getDeliveryDate());
                }
                if (notificationData.hasDisplayDate()) {
                    setDisplayDate(notificationData.getDisplayDate());
                }
                if (notificationData.hasDisplayType()) {
                    setDisplayType(notificationData.getDisplayType());
                }
                if (this.actionsBuilder_ == null) {
                    if (!notificationData.actions_.isEmpty()) {
                        if (this.actions_.isEmpty()) {
                            this.actions_ = notificationData.actions_;
                            this.bitField0_ &= -257;
                        } else {
                            ensureActionsIsMutable();
                            this.actions_.addAll(notificationData.actions_);
                        }
                        onChanged();
                    }
                } else if (!notificationData.actions_.isEmpty()) {
                    boolean zIsEmpty = this.actionsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<ActionInfo, ActionInfo.Builder, ActionInfoOrBuilder> repeatedFieldBuilderV3 = this.actionsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.actionsBuilder_ = null;
                        this.actions_ = notificationData.actions_;
                        this.bitField0_ &= -257;
                        this.actionsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getActionsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(notificationData.actions_);
                    }
                }
                if (this.mediaAttachmentsBuilder_ == null) {
                    if (!notificationData.mediaAttachments_.isEmpty()) {
                        if (this.mediaAttachments_.isEmpty()) {
                            this.mediaAttachments_ = notificationData.mediaAttachments_;
                            this.bitField0_ &= -513;
                        } else {
                            ensureMediaAttachmentsIsMutable();
                            this.mediaAttachments_.addAll(notificationData.mediaAttachments_);
                        }
                        onChanged();
                    }
                } else if (!notificationData.mediaAttachments_.isEmpty()) {
                    boolean zIsEmpty2 = this.mediaAttachmentsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV4 = this.mediaAttachmentsBuilder_;
                    if (zIsEmpty2) {
                        repeatedFieldBuilderV4.dispose();
                        this.mediaAttachmentsBuilder_ = null;
                        this.mediaAttachments_ = notificationData.mediaAttachments_;
                        this.bitField0_ &= -513;
                        this.mediaAttachmentsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getMediaAttachmentsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV4.addAllMessages(notificationData.mediaAttachments_);
                    }
                }
                if (notificationData.hasAppIcon()) {
                    mergeAppIcon(notificationData.getAppIcon());
                }
                if (notificationData.hasContactIcon()) {
                    mergeContactIcon(notificationData.getContactIcon());
                }
                if (notificationData.hasKind()) {
                    setKind(notificationData.getKind());
                }
                if (this.embeddedImagesBuilder_ == null) {
                    if (!notificationData.embeddedImages_.isEmpty()) {
                        if (this.embeddedImages_.isEmpty()) {
                            this.embeddedImages_ = notificationData.embeddedImages_;
                            this.bitField0_ &= -8193;
                        } else {
                            ensureEmbeddedImagesIsMutable();
                            this.embeddedImages_.addAll(notificationData.embeddedImages_);
                        }
                        onChanged();
                    }
                } else if (!notificationData.embeddedImages_.isEmpty()) {
                    boolean zIsEmpty3 = this.embeddedImagesBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV5 = this.embeddedImagesBuilder_;
                    if (zIsEmpty3) {
                        repeatedFieldBuilderV5.dispose();
                        this.embeddedImagesBuilder_ = null;
                        this.embeddedImages_ = notificationData.embeddedImages_;
                        this.bitField0_ &= -8193;
                        this.embeddedImagesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getEmbeddedImagesFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV5.addAllMessages(notificationData.embeddedImages_);
                    }
                }
                if (notificationData.hasExpectedMediaAttachmentCount()) {
                    setExpectedMediaAttachmentCount(notificationData.getExpectedMediaAttachmentCount());
                }
                mergeUnknownFields(notificationData.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeActions(int i14) {
                RepeatedFieldBuilderV3<ActionInfo, ActionInfo.Builder, ActionInfoOrBuilder> repeatedFieldBuilderV3 = this.actionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureActionsIsMutable();
                this.actions_.remove(i14);
                onChanged();
                return this;
            }

            public Builder removeEmbeddedImages(int i14) {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.embeddedImagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureEmbeddedImagesIsMutable();
                this.embeddedImages_.remove(i14);
                onChanged();
                return this;
            }

            public Builder removeMediaAttachments(int i14) {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.mediaAttachmentsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureMediaAttachmentsIsMutable();
                this.mediaAttachments_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setActions(int i14, ActionInfo.Builder builder) {
                RepeatedFieldBuilderV3<ActionInfo, ActionInfo.Builder, ActionInfoOrBuilder> repeatedFieldBuilderV3 = this.actionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureActionsIsMutable();
                this.actions_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setAppDisplayName(String str) {
                str.getClass();
                this.appDisplayName_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAppDisplayNameBytes(ByteString byteString) {
                byteString.getClass();
                this.appDisplayName_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAppIcon(AttachmentItem.Builder builder) {
                SingleFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> singleFieldBuilderV3 = this.appIconBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.appIcon_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setBody(String str) {
                str.getClass();
                this.body_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setBodyBytes(ByteString byteString) {
                byteString.getClass();
                this.body_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setContactIcon(AttachmentItem.Builder builder) {
                SingleFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> singleFieldBuilderV3 = this.contactIconBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.contactIcon_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setDeliveryDate(int i14) {
                this.deliveryDate_ = i14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setDisplayDate(int i14) {
                this.displayDate_ = i14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setDisplayType(DisplayType displayType) {
                displayType.getClass();
                this.bitField0_ |= 128;
                this.displayType_ = displayType.getNumber();
                onChanged();
                return this;
            }

            public Builder setEmbeddedImages(int i14, AttachmentItem.Builder builder) {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.embeddedImagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureEmbeddedImagesIsMutable();
                this.embeddedImages_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setExpectedMediaAttachmentCount(int i14) {
                this.expectedMediaAttachmentCount_ = i14;
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setKind(Kind kind) {
                kind.getClass();
                this.bitField0_ |= 4096;
                this.kind_ = kind.getNumber();
                onChanged();
                return this;
            }

            public Builder setMediaAttachments(int i14, AttachmentItem.Builder builder) {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.mediaAttachmentsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureMediaAttachmentsIsMutable();
                this.mediaAttachments_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSubtitle(String str) {
                str.getClass();
                this.subtitle_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSubtitleBytes(ByteString byteString) {
                byteString.getClass();
                this.subtitle_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setThreadIdentifier(String str) {
                str.getClass();
                this.threadIdentifier_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setThreadIdentifierBytes(ByteString byteString) {
                byteString.getClass();
                this.threadIdentifier_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTitle(String str) {
                str.getClass();
                this.title_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                byteString.getClass();
                this.title_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public NotificationData getDefaultInstanceForType() {
                return NotificationData.getDefaultInstance();
            }

            public ActionInfo.Builder addActionsBuilder(int i14) {
                return (ActionInfo.Builder) getActionsFieldBuilder().addBuilder(i14, ActionInfo.getDefaultInstance());
            }

            public AttachmentItem.Builder addEmbeddedImagesBuilder(int i14) {
                return (AttachmentItem.Builder) getEmbeddedImagesFieldBuilder().addBuilder(i14, AttachmentItem.getDefaultInstance());
            }

            public AttachmentItem.Builder addMediaAttachmentsBuilder(int i14) {
                return (AttachmentItem.Builder) getMediaAttachmentsFieldBuilder().addBuilder(i14, AttachmentItem.getDefaultInstance());
            }

            public Builder addActions(int i14, ActionInfo actionInfo) {
                RepeatedFieldBuilderV3<ActionInfo, ActionInfo.Builder, ActionInfoOrBuilder> repeatedFieldBuilderV3 = this.actionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    actionInfo.getClass();
                    ensureActionsIsMutable();
                    this.actions_.add(i14, actionInfo);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, actionInfo);
                return this;
            }

            public Builder addEmbeddedImages(int i14, AttachmentItem attachmentItem) {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.embeddedImagesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    attachmentItem.getClass();
                    ensureEmbeddedImagesIsMutable();
                    this.embeddedImages_.add(i14, attachmentItem);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, attachmentItem);
                return this;
            }

            public Builder addMediaAttachments(int i14, AttachmentItem attachmentItem) {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.mediaAttachmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    attachmentItem.getClass();
                    ensureMediaAttachmentsIsMutable();
                    this.mediaAttachments_.add(i14, attachmentItem);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, attachmentItem);
                return this;
            }

            public Builder setActions(int i14, ActionInfo actionInfo) {
                RepeatedFieldBuilderV3<ActionInfo, ActionInfo.Builder, ActionInfoOrBuilder> repeatedFieldBuilderV3 = this.actionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    actionInfo.getClass();
                    ensureActionsIsMutable();
                    this.actions_.set(i14, actionInfo);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, actionInfo);
                return this;
            }

            public Builder setAppIcon(AttachmentItem attachmentItem) {
                SingleFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> singleFieldBuilderV3 = this.appIconBuilder_;
                if (singleFieldBuilderV3 == null) {
                    attachmentItem.getClass();
                    this.appIcon_ = attachmentItem;
                } else {
                    singleFieldBuilderV3.setMessage(attachmentItem);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setContactIcon(AttachmentItem attachmentItem) {
                SingleFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> singleFieldBuilderV3 = this.contactIconBuilder_;
                if (singleFieldBuilderV3 == null) {
                    attachmentItem.getClass();
                    this.contactIcon_ = attachmentItem;
                } else {
                    singleFieldBuilderV3.setMessage(attachmentItem);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setEmbeddedImages(int i14, AttachmentItem attachmentItem) {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.embeddedImagesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    attachmentItem.getClass();
                    ensureEmbeddedImagesIsMutable();
                    this.embeddedImages_.set(i14, attachmentItem);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, attachmentItem);
                return this;
            }

            public Builder setMediaAttachments(int i14, AttachmentItem attachmentItem) {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.mediaAttachmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    attachmentItem.getClass();
                    ensureMediaAttachmentsIsMutable();
                    this.mediaAttachments_.set(i14, attachmentItem);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, attachmentItem);
                return this;
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.appDisplayName_ = "";
                this.title_ = "";
                this.subtitle_ = "";
                this.body_ = "";
                this.threadIdentifier_ = "";
                this.displayType_ = 0;
                List list = Collections.EMPTY_LIST;
                this.actions_ = list;
                this.mediaAttachments_ = list;
                this.kind_ = 0;
                this.embeddedImages_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder addActions(ActionInfo actionInfo) {
                RepeatedFieldBuilderV3<ActionInfo, ActionInfo.Builder, ActionInfoOrBuilder> repeatedFieldBuilderV3 = this.actionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    actionInfo.getClass();
                    ensureActionsIsMutable();
                    this.actions_.add(actionInfo);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(actionInfo);
                return this;
            }

            public Builder addEmbeddedImages(AttachmentItem attachmentItem) {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.embeddedImagesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    attachmentItem.getClass();
                    ensureEmbeddedImagesIsMutable();
                    this.embeddedImages_.add(attachmentItem);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(attachmentItem);
                return this;
            }

            public Builder addMediaAttachments(AttachmentItem attachmentItem) {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.mediaAttachmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    attachmentItem.getClass();
                    ensureMediaAttachmentsIsMutable();
                    this.mediaAttachments_.add(attachmentItem);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(attachmentItem);
                return this;
            }

            public Builder addActions(int i14, ActionInfo.Builder builder) {
                RepeatedFieldBuilderV3<ActionInfo, ActionInfo.Builder, ActionInfoOrBuilder> repeatedFieldBuilderV3 = this.actionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureActionsIsMutable();
                    this.actions_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            public Builder addEmbeddedImages(int i14, AttachmentItem.Builder builder) {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.embeddedImagesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEmbeddedImagesIsMutable();
                    this.embeddedImages_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            public Builder addMediaAttachments(int i14, AttachmentItem.Builder builder) {
                RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV3 = this.mediaAttachmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureMediaAttachmentsIsMutable();
                    this.mediaAttachments_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof NotificationData) {
                    return mergeFrom((NotificationData) message);
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
                            switch (tag) {
                                case 0:
                                    break;
                                case 10:
                                    this.appDisplayName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    this.title_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    this.subtitle_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    this.body_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    this.threadIdentifier_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 48:
                                    this.deliveryDate_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 56:
                                    this.displayDate_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 64:
                                    int i14 = codedInputStream.readEnum();
                                    if (DisplayType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(8, i14);
                                    } else {
                                        this.displayType_ = i14;
                                        this.bitField0_ |= 128;
                                        continue;
                                    }
                                    break;
                                case 74:
                                    ActionInfo actionInfo = (ActionInfo) codedInputStream.readMessage(ActionInfo.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<ActionInfo, ActionInfo.Builder, ActionInfoOrBuilder> repeatedFieldBuilderV3 = this.actionsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureActionsIsMutable();
                                        this.actions_.add(actionInfo);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(actionInfo);
                                        continue;
                                    }
                                    break;
                                case 82:
                                    AttachmentItem attachmentItem = (AttachmentItem) codedInputStream.readMessage(AttachmentItem.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV4 = this.mediaAttachmentsBuilder_;
                                    if (repeatedFieldBuilderV4 == null) {
                                        ensureMediaAttachmentsIsMutable();
                                        this.mediaAttachments_.add(attachmentItem);
                                    } else {
                                        repeatedFieldBuilderV4.addMessage(attachmentItem);
                                        continue;
                                    }
                                    break;
                                case 90:
                                    codedInputStream.readMessage(getAppIconFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 98:
                                    codedInputStream.readMessage(getContactIconFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 104:
                                    int i15 = codedInputStream.readEnum();
                                    if (Kind.forNumber(i15) == null) {
                                        mergeUnknownVarintField(13, i15);
                                    } else {
                                        this.kind_ = i15;
                                        this.bitField0_ |= 4096;
                                        continue;
                                    }
                                    break;
                                case 114:
                                    AttachmentItem attachmentItem2 = (AttachmentItem) codedInputStream.readMessage(AttachmentItem.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<AttachmentItem, AttachmentItem.Builder, AttachmentItemOrBuilder> repeatedFieldBuilderV5 = this.embeddedImagesBuilder_;
                                    if (repeatedFieldBuilderV5 == null) {
                                        ensureEmbeddedImagesIsMutable();
                                        this.embeddedImages_.add(attachmentItem2);
                                    } else {
                                        repeatedFieldBuilderV5.addMessage(attachmentItem2);
                                        continue;
                                    }
                                    break;
                                case 120:
                                    this.expectedMediaAttachmentCount_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16384;
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
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public NotificationData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static NotificationData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NotificationData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NotificationData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static NotificationData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static NotificationData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static NotificationData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static NotificationData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static NotificationData parseFrom(InputStream inputStream) {
            return (NotificationData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static NotificationData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NotificationData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NotificationData parseFrom(CodedInputStream codedInputStream) {
            return (NotificationData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static NotificationData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NotificationData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum DisplayType implements ProtocolMessageEnum {
            DISPLAY_TYPE_UNKNOWN(0),
            DISPLAY_TYPE_NORMAL(1),
            DISPLAY_TYPE_SILENT(2);

            public static final int DISPLAY_TYPE_NORMAL_VALUE = 1;
            public static final int DISPLAY_TYPE_SILENT_VALUE = 2;
            public static final int DISPLAY_TYPE_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<DisplayType> internalValueMap = new Internal.EnumLiteMap<DisplayType>() { // from class: com.garmin.proto.generated.GDIRichNotifications.NotificationData.DisplayType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public DisplayType findValueByNumber(int i14) {
                    return DisplayType.forNumber(i14);
                }
            };
            private static final DisplayType[] VALUES = values();

            DisplayType(int i14) {
                this.value = i14;
            }

            public static DisplayType forNumber(int i14) {
                if (i14 == 0) {
                    return DISPLAY_TYPE_UNKNOWN;
                }
                if (i14 == 1) {
                    return DISPLAY_TYPE_NORMAL;
                }
                if (i14 != 2) {
                    return null;
                }
                return DISPLAY_TYPE_SILENT;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return NotificationData.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<DisplayType> internalGetValueMap() {
                return internalValueMap;
            }

            public static DisplayType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static DisplayType valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum Kind implements ProtocolMessageEnum {
            KIND_UNKNOWN(0),
            KIND_INCOMING_CALL(1),
            KIND_MISSED_CALL(2),
            KIND_VOICEMAIL(3),
            KIND_ALARM(4),
            KIND_NOTIFICATION(5),
            KIND_TIMER(6),
            KIND_LIVE_ACTIVITY(7);

            public static final int KIND_ALARM_VALUE = 4;
            public static final int KIND_INCOMING_CALL_VALUE = 1;
            public static final int KIND_LIVE_ACTIVITY_VALUE = 7;
            public static final int KIND_MISSED_CALL_VALUE = 2;
            public static final int KIND_NOTIFICATION_VALUE = 5;
            public static final int KIND_TIMER_VALUE = 6;
            public static final int KIND_UNKNOWN_VALUE = 0;
            public static final int KIND_VOICEMAIL_VALUE = 3;
            private final int value;
            private static final Internal.EnumLiteMap<Kind> internalValueMap = new Internal.EnumLiteMap<Kind>() { // from class: com.garmin.proto.generated.GDIRichNotifications.NotificationData.Kind.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Kind findValueByNumber(int i14) {
                    return Kind.forNumber(i14);
                }
            };
            private static final Kind[] VALUES = values();

            Kind(int i14) {
                this.value = i14;
            }

            public static Kind forNumber(int i14) {
                switch (i14) {
                    case 0:
                        return KIND_UNKNOWN;
                    case 1:
                        return KIND_INCOMING_CALL;
                    case 2:
                        return KIND_MISSED_CALL;
                    case 3:
                        return KIND_VOICEMAIL;
                    case 4:
                        return KIND_ALARM;
                    case 5:
                        return KIND_NOTIFICATION;
                    case 6:
                        return KIND_TIMER;
                    case 7:
                        return KIND_LIVE_ACTIVITY;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return NotificationData.getDescriptor().getEnumTypes().get(1);
            }

            public static Internal.EnumLiteMap<Kind> internalGetValueMap() {
                return internalValueMap;
            }

            public static Kind valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Kind valueOf(int i14) {
                return forNumber(i14);
            }
        }

        private NotificationData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.appDisplayName_ = "";
            this.title_ = "";
            this.subtitle_ = "";
            this.body_ = "";
            this.threadIdentifier_ = "";
            this.deliveryDate_ = 0;
            this.displayDate_ = 0;
            this.displayType_ = 0;
            this.kind_ = 0;
            this.expectedMediaAttachmentCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ NotificationData(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class NotificationId extends GeneratedMessageV3 implements NotificationIdOrBuilder {
        public static final int APP_ID_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object appId_;
        private int bitField0_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private static final NotificationId DEFAULT_INSTANCE = new NotificationId();

        @Deprecated
        public static final Parser<NotificationId> PARSER = new AbstractParser<NotificationId>() { // from class: com.garmin.proto.generated.GDIRichNotifications.NotificationId.1
            @Override // com.google.protobuf.Parser
            public NotificationId parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = NotificationId.newBuilder();
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

        private NotificationId() {
            this.id_ = "";
            this.appId_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.appId_ = "";
        }

        public static NotificationId getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_NotificationId_descriptor;
        }

        public static Builder newBuilder(NotificationId notificationId) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(notificationId);
        }

        public static NotificationId parseDelimitedFrom(InputStream inputStream) {
            return (NotificationId) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static NotificationId parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<NotificationId> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NotificationId)) {
                return super.equals(obj);
            }
            NotificationId notificationId = (NotificationId) obj;
            if (hasId() != notificationId.hasId()) {
                return false;
            }
            if ((!hasId() || getId().equals(notificationId.getId())) && hasAppId() == notificationId.hasAppId()) {
                return (!hasAppId() || getAppId().equals(notificationId.getAppId())) && getUnknownFields().equals(notificationId.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationIdOrBuilder
        public String getAppId() {
            Object obj = this.appId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.appId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationIdOrBuilder
        public ByteString getAppIdBytes() {
            Object obj = this.appId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationIdOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.id_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationIdOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<NotificationId> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.id_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.appId_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationIdOrBuilder
        public boolean hasAppId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationIdOrBuilder
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
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getId().hashCode();
            }
            if (hasAppId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getAppId().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_NotificationId_fieldAccessorTable.ensureFieldAccessorsInitialized(NotificationId.class, Builder.class);
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
            return new NotificationId();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.id_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.appId_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NotificationIdOrBuilder {
            private Object appId_;
            private int bitField0_;
            private Object id_;

            private Builder() {
                this.id_ = "";
                this.appId_ = "";
            }

            private void buildPartial0(NotificationId notificationId) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    notificationId.id_ = this.id_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    notificationId.appId_ = this.appId_;
                    i14 |= 2;
                }
                notificationId.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_NotificationId_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NotificationId build() {
                NotificationId notificationIdBuildPartial = buildPartial();
                if (notificationIdBuildPartial.isInitialized()) {
                    return notificationIdBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) notificationIdBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NotificationId buildPartial() {
                NotificationId notificationId = new NotificationId(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(notificationId);
                }
                onBuilt();
                return notificationId;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.appId_ = "";
                return this;
            }

            public Builder clearAppId() {
                this.appId_ = NotificationId.getDefaultInstance().getAppId();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearId() {
                this.id_ = NotificationId.getDefaultInstance().getId();
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

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationIdOrBuilder
            public String getAppId() {
                Object obj = this.appId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.appId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationIdOrBuilder
            public ByteString getAppIdBytes() {
                Object obj = this.appId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_NotificationId_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationIdOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.id_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationIdOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationIdOrBuilder
            public boolean hasAppId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationIdOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_NotificationId_fieldAccessorTable.ensureFieldAccessorsInitialized(NotificationId.class, Builder.class);
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
                                    this.id_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.appId_ = codedInputStream.readBytes();
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

            public Builder setAppId(String str) {
                str.getClass();
                this.appId_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setAppIdBytes(ByteString byteString) {
                byteString.getClass();
                this.appId_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setId(String str) {
                str.getClass();
                this.id_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                byteString.getClass();
                this.id_ = byteString;
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

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public NotificationId getDefaultInstanceForType() {
                return NotificationId.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.appId_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof NotificationId) {
                    return mergeFrom((NotificationId) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(NotificationId notificationId) {
                if (notificationId == NotificationId.getDefaultInstance()) {
                    return this;
                }
                if (notificationId.hasId()) {
                    this.id_ = notificationId.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (notificationId.hasAppId()) {
                    this.appId_ = notificationId.appId_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(notificationId.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public NotificationId getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static NotificationId parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NotificationId) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NotificationId parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static NotificationId parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static NotificationId parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static NotificationId parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static NotificationId parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static NotificationId parseFrom(InputStream inputStream) {
            return (NotificationId) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static NotificationId parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NotificationId) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private NotificationId(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.id_ = "";
            this.appId_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NotificationId parseFrom(CodedInputStream codedInputStream) {
            return (NotificationId) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static NotificationId parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NotificationId) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ NotificationId(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class NotificationPayloadService extends GeneratedMessageV3 implements NotificationPayloadServiceOrBuilder {
        public static final int ACTION_REQUEST_FIELD_NUMBER = 3;
        public static final int ACTION_RESPONSE_FIELD_NUMBER = 4;
        public static final int DATA_EVENT_NOTIFICATION_REQUEST_FIELD_NUMBER = 1;
        public static final int DATA_EVENT_NOTIFICATION_RESPONSE_FIELD_NUMBER = 2;
        private static final NotificationPayloadService DEFAULT_INSTANCE = new NotificationPayloadService();

        @Deprecated
        public static final Parser<NotificationPayloadService> PARSER = new AbstractParser<NotificationPayloadService>() { // from class: com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadService.1
            @Override // com.google.protobuf.Parser
            public NotificationPayloadService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = NotificationPayloadService.newBuilder();
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
        private ActionRequest actionRequest_;
        private ActionResponse actionResponse_;
        private int bitField0_;
        private DataEventNotificationRequest dataEventNotificationRequest_;
        private DataEventNotificationResponse dataEventNotificationResponse_;
        private byte memoizedIsInitialized;

        private NotificationPayloadService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NotificationPayloadService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_NotificationPayloadService_descriptor;
        }

        public static Builder newBuilder(NotificationPayloadService notificationPayloadService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(notificationPayloadService);
        }

        public static NotificationPayloadService parseDelimitedFrom(InputStream inputStream) {
            return (NotificationPayloadService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static NotificationPayloadService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<NotificationPayloadService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NotificationPayloadService)) {
                return super.equals(obj);
            }
            NotificationPayloadService notificationPayloadService = (NotificationPayloadService) obj;
            if (hasDataEventNotificationRequest() != notificationPayloadService.hasDataEventNotificationRequest()) {
                return false;
            }
            if ((hasDataEventNotificationRequest() && !getDataEventNotificationRequest().equals(notificationPayloadService.getDataEventNotificationRequest())) || hasDataEventNotificationResponse() != notificationPayloadService.hasDataEventNotificationResponse()) {
                return false;
            }
            if ((hasDataEventNotificationResponse() && !getDataEventNotificationResponse().equals(notificationPayloadService.getDataEventNotificationResponse())) || hasActionRequest() != notificationPayloadService.hasActionRequest()) {
                return false;
            }
            if ((!hasActionRequest() || getActionRequest().equals(notificationPayloadService.getActionRequest())) && hasActionResponse() == notificationPayloadService.hasActionResponse()) {
                return (!hasActionResponse() || getActionResponse().equals(notificationPayloadService.getActionResponse())) && getUnknownFields().equals(notificationPayloadService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
        public ActionRequest getActionRequest() {
            ActionRequest actionRequest = this.actionRequest_;
            return actionRequest == null ? ActionRequest.getDefaultInstance() : actionRequest;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
        public ActionRequestOrBuilder getActionRequestOrBuilder() {
            ActionRequest actionRequest = this.actionRequest_;
            return actionRequest == null ? ActionRequest.getDefaultInstance() : actionRequest;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
        public ActionResponse getActionResponse() {
            ActionResponse actionResponse = this.actionResponse_;
            return actionResponse == null ? ActionResponse.getDefaultInstance() : actionResponse;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
        public ActionResponseOrBuilder getActionResponseOrBuilder() {
            ActionResponse actionResponse = this.actionResponse_;
            return actionResponse == null ? ActionResponse.getDefaultInstance() : actionResponse;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
        public DataEventNotificationRequest getDataEventNotificationRequest() {
            DataEventNotificationRequest dataEventNotificationRequest = this.dataEventNotificationRequest_;
            return dataEventNotificationRequest == null ? DataEventNotificationRequest.getDefaultInstance() : dataEventNotificationRequest;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
        public DataEventNotificationRequestOrBuilder getDataEventNotificationRequestOrBuilder() {
            DataEventNotificationRequest dataEventNotificationRequest = this.dataEventNotificationRequest_;
            return dataEventNotificationRequest == null ? DataEventNotificationRequest.getDefaultInstance() : dataEventNotificationRequest;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
        public DataEventNotificationResponse getDataEventNotificationResponse() {
            DataEventNotificationResponse dataEventNotificationResponse = this.dataEventNotificationResponse_;
            return dataEventNotificationResponse == null ? DataEventNotificationResponse.getDefaultInstance() : dataEventNotificationResponse;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
        public DataEventNotificationResponseOrBuilder getDataEventNotificationResponseOrBuilder() {
            DataEventNotificationResponse dataEventNotificationResponse = this.dataEventNotificationResponse_;
            return dataEventNotificationResponse == null ? DataEventNotificationResponse.getDefaultInstance() : dataEventNotificationResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<NotificationPayloadService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getDataEventNotificationRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getDataEventNotificationResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getActionRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getActionResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
        public boolean hasActionRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
        public boolean hasActionResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
        public boolean hasDataEventNotificationRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
        public boolean hasDataEventNotificationResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDataEventNotificationRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDataEventNotificationRequest().hashCode();
            }
            if (hasDataEventNotificationResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDataEventNotificationResponse().hashCode();
            }
            if (hasActionRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getActionRequest().hashCode();
            }
            if (hasActionResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getActionResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_NotificationPayloadService_fieldAccessorTable.ensureFieldAccessorsInitialized(NotificationPayloadService.class, Builder.class);
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
            return new NotificationPayloadService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getDataEventNotificationRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getDataEventNotificationResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getActionRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getActionResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NotificationPayloadServiceOrBuilder {
            private SingleFieldBuilderV3<ActionRequest, ActionRequest.Builder, ActionRequestOrBuilder> actionRequestBuilder_;
            private ActionRequest actionRequest_;
            private SingleFieldBuilderV3<ActionResponse, ActionResponse.Builder, ActionResponseOrBuilder> actionResponseBuilder_;
            private ActionResponse actionResponse_;
            private int bitField0_;
            private SingleFieldBuilderV3<DataEventNotificationRequest, DataEventNotificationRequest.Builder, DataEventNotificationRequestOrBuilder> dataEventNotificationRequestBuilder_;
            private DataEventNotificationRequest dataEventNotificationRequest_;
            private SingleFieldBuilderV3<DataEventNotificationResponse, DataEventNotificationResponse.Builder, DataEventNotificationResponseOrBuilder> dataEventNotificationResponseBuilder_;
            private DataEventNotificationResponse dataEventNotificationResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(NotificationPayloadService notificationPayloadService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<DataEventNotificationRequest, DataEventNotificationRequest.Builder, DataEventNotificationRequestOrBuilder> singleFieldBuilderV3 = this.dataEventNotificationRequestBuilder_;
                    notificationPayloadService.dataEventNotificationRequest_ = singleFieldBuilderV3 == null ? this.dataEventNotificationRequest_ : (DataEventNotificationRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<DataEventNotificationResponse, DataEventNotificationResponse.Builder, DataEventNotificationResponseOrBuilder> singleFieldBuilderV4 = this.dataEventNotificationResponseBuilder_;
                    notificationPayloadService.dataEventNotificationResponse_ = singleFieldBuilderV4 == null ? this.dataEventNotificationResponse_ : (DataEventNotificationResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<ActionRequest, ActionRequest.Builder, ActionRequestOrBuilder> singleFieldBuilderV5 = this.actionRequestBuilder_;
                    notificationPayloadService.actionRequest_ = singleFieldBuilderV5 == null ? this.actionRequest_ : (ActionRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<ActionResponse, ActionResponse.Builder, ActionResponseOrBuilder> singleFieldBuilderV6 = this.actionResponseBuilder_;
                    notificationPayloadService.actionResponse_ = singleFieldBuilderV6 == null ? this.actionResponse_ : (ActionResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                notificationPayloadService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ActionRequest, ActionRequest.Builder, ActionRequestOrBuilder> getActionRequestFieldBuilder() {
                if (this.actionRequestBuilder_ == null) {
                    this.actionRequestBuilder_ = new SingleFieldBuilderV3<>(getActionRequest(), getParentForChildren(), isClean());
                    this.actionRequest_ = null;
                }
                return this.actionRequestBuilder_;
            }

            private SingleFieldBuilderV3<ActionResponse, ActionResponse.Builder, ActionResponseOrBuilder> getActionResponseFieldBuilder() {
                if (this.actionResponseBuilder_ == null) {
                    this.actionResponseBuilder_ = new SingleFieldBuilderV3<>(getActionResponse(), getParentForChildren(), isClean());
                    this.actionResponse_ = null;
                }
                return this.actionResponseBuilder_;
            }

            private SingleFieldBuilderV3<DataEventNotificationRequest, DataEventNotificationRequest.Builder, DataEventNotificationRequestOrBuilder> getDataEventNotificationRequestFieldBuilder() {
                if (this.dataEventNotificationRequestBuilder_ == null) {
                    this.dataEventNotificationRequestBuilder_ = new SingleFieldBuilderV3<>(getDataEventNotificationRequest(), getParentForChildren(), isClean());
                    this.dataEventNotificationRequest_ = null;
                }
                return this.dataEventNotificationRequestBuilder_;
            }

            private SingleFieldBuilderV3<DataEventNotificationResponse, DataEventNotificationResponse.Builder, DataEventNotificationResponseOrBuilder> getDataEventNotificationResponseFieldBuilder() {
                if (this.dataEventNotificationResponseBuilder_ == null) {
                    this.dataEventNotificationResponseBuilder_ = new SingleFieldBuilderV3<>(getDataEventNotificationResponse(), getParentForChildren(), isClean());
                    this.dataEventNotificationResponse_ = null;
                }
                return this.dataEventNotificationResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_NotificationPayloadService_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDataEventNotificationRequestFieldBuilder();
                    getDataEventNotificationResponseFieldBuilder();
                    getActionRequestFieldBuilder();
                    getActionResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NotificationPayloadService build() {
                NotificationPayloadService notificationPayloadServiceBuildPartial = buildPartial();
                if (notificationPayloadServiceBuildPartial.isInitialized()) {
                    return notificationPayloadServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) notificationPayloadServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NotificationPayloadService buildPartial() {
                NotificationPayloadService notificationPayloadService = new NotificationPayloadService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(notificationPayloadService);
                }
                onBuilt();
                return notificationPayloadService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.dataEventNotificationRequest_ = null;
                SingleFieldBuilderV3<DataEventNotificationRequest, DataEventNotificationRequest.Builder, DataEventNotificationRequestOrBuilder> singleFieldBuilderV3 = this.dataEventNotificationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dataEventNotificationRequestBuilder_ = null;
                }
                this.dataEventNotificationResponse_ = null;
                SingleFieldBuilderV3<DataEventNotificationResponse, DataEventNotificationResponse.Builder, DataEventNotificationResponseOrBuilder> singleFieldBuilderV4 = this.dataEventNotificationResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.dataEventNotificationResponseBuilder_ = null;
                }
                this.actionRequest_ = null;
                SingleFieldBuilderV3<ActionRequest, ActionRequest.Builder, ActionRequestOrBuilder> singleFieldBuilderV5 = this.actionRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.actionRequestBuilder_ = null;
                }
                this.actionResponse_ = null;
                SingleFieldBuilderV3<ActionResponse, ActionResponse.Builder, ActionResponseOrBuilder> singleFieldBuilderV6 = this.actionResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.actionResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearActionRequest() {
                this.bitField0_ &= -5;
                this.actionRequest_ = null;
                SingleFieldBuilderV3<ActionRequest, ActionRequest.Builder, ActionRequestOrBuilder> singleFieldBuilderV3 = this.actionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.actionRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearActionResponse() {
                this.bitField0_ &= -9;
                this.actionResponse_ = null;
                SingleFieldBuilderV3<ActionResponse, ActionResponse.Builder, ActionResponseOrBuilder> singleFieldBuilderV3 = this.actionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.actionResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDataEventNotificationRequest() {
                this.bitField0_ &= -2;
                this.dataEventNotificationRequest_ = null;
                SingleFieldBuilderV3<DataEventNotificationRequest, DataEventNotificationRequest.Builder, DataEventNotificationRequestOrBuilder> singleFieldBuilderV3 = this.dataEventNotificationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dataEventNotificationRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDataEventNotificationResponse() {
                this.bitField0_ &= -3;
                this.dataEventNotificationResponse_ = null;
                SingleFieldBuilderV3<DataEventNotificationResponse, DataEventNotificationResponse.Builder, DataEventNotificationResponseOrBuilder> singleFieldBuilderV3 = this.dataEventNotificationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dataEventNotificationResponseBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
            public ActionRequest getActionRequest() {
                SingleFieldBuilderV3<ActionRequest, ActionRequest.Builder, ActionRequestOrBuilder> singleFieldBuilderV3 = this.actionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ActionRequest) singleFieldBuilderV3.getMessage();
                }
                ActionRequest actionRequest = this.actionRequest_;
                return actionRequest == null ? ActionRequest.getDefaultInstance() : actionRequest;
            }

            public ActionRequest.Builder getActionRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (ActionRequest.Builder) getActionRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
            public ActionRequestOrBuilder getActionRequestOrBuilder() {
                SingleFieldBuilderV3<ActionRequest, ActionRequest.Builder, ActionRequestOrBuilder> singleFieldBuilderV3 = this.actionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ActionRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ActionRequest actionRequest = this.actionRequest_;
                return actionRequest == null ? ActionRequest.getDefaultInstance() : actionRequest;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
            public ActionResponse getActionResponse() {
                SingleFieldBuilderV3<ActionResponse, ActionResponse.Builder, ActionResponseOrBuilder> singleFieldBuilderV3 = this.actionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ActionResponse) singleFieldBuilderV3.getMessage();
                }
                ActionResponse actionResponse = this.actionResponse_;
                return actionResponse == null ? ActionResponse.getDefaultInstance() : actionResponse;
            }

            public ActionResponse.Builder getActionResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (ActionResponse.Builder) getActionResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
            public ActionResponseOrBuilder getActionResponseOrBuilder() {
                SingleFieldBuilderV3<ActionResponse, ActionResponse.Builder, ActionResponseOrBuilder> singleFieldBuilderV3 = this.actionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ActionResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ActionResponse actionResponse = this.actionResponse_;
                return actionResponse == null ? ActionResponse.getDefaultInstance() : actionResponse;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
            public DataEventNotificationRequest getDataEventNotificationRequest() {
                SingleFieldBuilderV3<DataEventNotificationRequest, DataEventNotificationRequest.Builder, DataEventNotificationRequestOrBuilder> singleFieldBuilderV3 = this.dataEventNotificationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataEventNotificationRequest) singleFieldBuilderV3.getMessage();
                }
                DataEventNotificationRequest dataEventNotificationRequest = this.dataEventNotificationRequest_;
                return dataEventNotificationRequest == null ? DataEventNotificationRequest.getDefaultInstance() : dataEventNotificationRequest;
            }

            public DataEventNotificationRequest.Builder getDataEventNotificationRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (DataEventNotificationRequest.Builder) getDataEventNotificationRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
            public DataEventNotificationRequestOrBuilder getDataEventNotificationRequestOrBuilder() {
                SingleFieldBuilderV3<DataEventNotificationRequest, DataEventNotificationRequest.Builder, DataEventNotificationRequestOrBuilder> singleFieldBuilderV3 = this.dataEventNotificationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataEventNotificationRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataEventNotificationRequest dataEventNotificationRequest = this.dataEventNotificationRequest_;
                return dataEventNotificationRequest == null ? DataEventNotificationRequest.getDefaultInstance() : dataEventNotificationRequest;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
            public DataEventNotificationResponse getDataEventNotificationResponse() {
                SingleFieldBuilderV3<DataEventNotificationResponse, DataEventNotificationResponse.Builder, DataEventNotificationResponseOrBuilder> singleFieldBuilderV3 = this.dataEventNotificationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataEventNotificationResponse) singleFieldBuilderV3.getMessage();
                }
                DataEventNotificationResponse dataEventNotificationResponse = this.dataEventNotificationResponse_;
                return dataEventNotificationResponse == null ? DataEventNotificationResponse.getDefaultInstance() : dataEventNotificationResponse;
            }

            public DataEventNotificationResponse.Builder getDataEventNotificationResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DataEventNotificationResponse.Builder) getDataEventNotificationResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
            public DataEventNotificationResponseOrBuilder getDataEventNotificationResponseOrBuilder() {
                SingleFieldBuilderV3<DataEventNotificationResponse, DataEventNotificationResponse.Builder, DataEventNotificationResponseOrBuilder> singleFieldBuilderV3 = this.dataEventNotificationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataEventNotificationResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataEventNotificationResponse dataEventNotificationResponse = this.dataEventNotificationResponse_;
                return dataEventNotificationResponse == null ? DataEventNotificationResponse.getDefaultInstance() : dataEventNotificationResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_NotificationPayloadService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
            public boolean hasActionRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
            public boolean hasActionResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
            public boolean hasDataEventNotificationRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.NotificationPayloadServiceOrBuilder
            public boolean hasDataEventNotificationResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_NotificationPayloadService_fieldAccessorTable.ensureFieldAccessorsInitialized(NotificationPayloadService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeActionRequest(ActionRequest actionRequest) {
                ActionRequest actionRequest2;
                SingleFieldBuilderV3<ActionRequest, ActionRequest.Builder, ActionRequestOrBuilder> singleFieldBuilderV3 = this.actionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(actionRequest);
                } else if ((this.bitField0_ & 4) == 0 || (actionRequest2 = this.actionRequest_) == null || actionRequest2 == ActionRequest.getDefaultInstance()) {
                    this.actionRequest_ = actionRequest;
                } else {
                    getActionRequestBuilder().mergeFrom(actionRequest);
                }
                if (this.actionRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeActionResponse(ActionResponse actionResponse) {
                ActionResponse actionResponse2;
                SingleFieldBuilderV3<ActionResponse, ActionResponse.Builder, ActionResponseOrBuilder> singleFieldBuilderV3 = this.actionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(actionResponse);
                } else if ((this.bitField0_ & 8) == 0 || (actionResponse2 = this.actionResponse_) == null || actionResponse2 == ActionResponse.getDefaultInstance()) {
                    this.actionResponse_ = actionResponse;
                } else {
                    getActionResponseBuilder().mergeFrom(actionResponse);
                }
                if (this.actionResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDataEventNotificationRequest(DataEventNotificationRequest dataEventNotificationRequest) {
                DataEventNotificationRequest dataEventNotificationRequest2;
                SingleFieldBuilderV3<DataEventNotificationRequest, DataEventNotificationRequest.Builder, DataEventNotificationRequestOrBuilder> singleFieldBuilderV3 = this.dataEventNotificationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dataEventNotificationRequest);
                } else if ((this.bitField0_ & 1) == 0 || (dataEventNotificationRequest2 = this.dataEventNotificationRequest_) == null || dataEventNotificationRequest2 == DataEventNotificationRequest.getDefaultInstance()) {
                    this.dataEventNotificationRequest_ = dataEventNotificationRequest;
                } else {
                    getDataEventNotificationRequestBuilder().mergeFrom(dataEventNotificationRequest);
                }
                if (this.dataEventNotificationRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDataEventNotificationResponse(DataEventNotificationResponse dataEventNotificationResponse) {
                DataEventNotificationResponse dataEventNotificationResponse2;
                SingleFieldBuilderV3<DataEventNotificationResponse, DataEventNotificationResponse.Builder, DataEventNotificationResponseOrBuilder> singleFieldBuilderV3 = this.dataEventNotificationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dataEventNotificationResponse);
                } else if ((this.bitField0_ & 2) == 0 || (dataEventNotificationResponse2 = this.dataEventNotificationResponse_) == null || dataEventNotificationResponse2 == DataEventNotificationResponse.getDefaultInstance()) {
                    this.dataEventNotificationResponse_ = dataEventNotificationResponse;
                } else {
                    getDataEventNotificationResponseBuilder().mergeFrom(dataEventNotificationResponse);
                }
                if (this.dataEventNotificationResponse_ != null) {
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
                                    codedInputStream.readMessage(getDataEventNotificationRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getDataEventNotificationResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getActionRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getActionResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setActionRequest(ActionRequest.Builder builder) {
                SingleFieldBuilderV3<ActionRequest, ActionRequest.Builder, ActionRequestOrBuilder> singleFieldBuilderV3 = this.actionRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.actionRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setActionResponse(ActionResponse.Builder builder) {
                SingleFieldBuilderV3<ActionResponse, ActionResponse.Builder, ActionResponseOrBuilder> singleFieldBuilderV3 = this.actionResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.actionResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setDataEventNotificationRequest(DataEventNotificationRequest.Builder builder) {
                SingleFieldBuilderV3<DataEventNotificationRequest, DataEventNotificationRequest.Builder, DataEventNotificationRequestOrBuilder> singleFieldBuilderV3 = this.dataEventNotificationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.dataEventNotificationRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDataEventNotificationResponse(DataEventNotificationResponse.Builder builder) {
                SingleFieldBuilderV3<DataEventNotificationResponse, DataEventNotificationResponse.Builder, DataEventNotificationResponseOrBuilder> singleFieldBuilderV3 = this.dataEventNotificationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.dataEventNotificationResponse_ = builder.build();
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
            public NotificationPayloadService getDefaultInstanceForType() {
                return NotificationPayloadService.getDefaultInstance();
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

            public Builder setActionRequest(ActionRequest actionRequest) {
                SingleFieldBuilderV3<ActionRequest, ActionRequest.Builder, ActionRequestOrBuilder> singleFieldBuilderV3 = this.actionRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    actionRequest.getClass();
                    this.actionRequest_ = actionRequest;
                } else {
                    singleFieldBuilderV3.setMessage(actionRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setActionResponse(ActionResponse actionResponse) {
                SingleFieldBuilderV3<ActionResponse, ActionResponse.Builder, ActionResponseOrBuilder> singleFieldBuilderV3 = this.actionResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    actionResponse.getClass();
                    this.actionResponse_ = actionResponse;
                } else {
                    singleFieldBuilderV3.setMessage(actionResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setDataEventNotificationRequest(DataEventNotificationRequest dataEventNotificationRequest) {
                SingleFieldBuilderV3<DataEventNotificationRequest, DataEventNotificationRequest.Builder, DataEventNotificationRequestOrBuilder> singleFieldBuilderV3 = this.dataEventNotificationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dataEventNotificationRequest.getClass();
                    this.dataEventNotificationRequest_ = dataEventNotificationRequest;
                } else {
                    singleFieldBuilderV3.setMessage(dataEventNotificationRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDataEventNotificationResponse(DataEventNotificationResponse dataEventNotificationResponse) {
                SingleFieldBuilderV3<DataEventNotificationResponse, DataEventNotificationResponse.Builder, DataEventNotificationResponseOrBuilder> singleFieldBuilderV3 = this.dataEventNotificationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dataEventNotificationResponse.getClass();
                    this.dataEventNotificationResponse_ = dataEventNotificationResponse;
                } else {
                    singleFieldBuilderV3.setMessage(dataEventNotificationResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof NotificationPayloadService) {
                    return mergeFrom((NotificationPayloadService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(NotificationPayloadService notificationPayloadService) {
                if (notificationPayloadService == NotificationPayloadService.getDefaultInstance()) {
                    return this;
                }
                if (notificationPayloadService.hasDataEventNotificationRequest()) {
                    mergeDataEventNotificationRequest(notificationPayloadService.getDataEventNotificationRequest());
                }
                if (notificationPayloadService.hasDataEventNotificationResponse()) {
                    mergeDataEventNotificationResponse(notificationPayloadService.getDataEventNotificationResponse());
                }
                if (notificationPayloadService.hasActionRequest()) {
                    mergeActionRequest(notificationPayloadService.getActionRequest());
                }
                if (notificationPayloadService.hasActionResponse()) {
                    mergeActionResponse(notificationPayloadService.getActionResponse());
                }
                mergeUnknownFields(notificationPayloadService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public NotificationPayloadService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ NotificationPayloadService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private NotificationPayloadService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NotificationPayloadService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NotificationPayloadService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NotificationPayloadService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static NotificationPayloadService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static NotificationPayloadService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static NotificationPayloadService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static NotificationPayloadService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static NotificationPayloadService parseFrom(InputStream inputStream) {
            return (NotificationPayloadService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static NotificationPayloadService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NotificationPayloadService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NotificationPayloadService parseFrom(CodedInputStream codedInputStream) {
            return (NotificationPayloadService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static NotificationPayloadService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NotificationPayloadService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int ENCRYPTED_DATA_REQUEST_FIELD_NUMBER = 3;
        public static final int ENCRYPTED_DATA_RESPONSE_FIELD_NUMBER = 4;
        public static final int ERROR_NOTIFICATION_FIELD_NUMBER = 5;
        public static final int SUBSCRIBE_REQUEST_FIELD_NUMBER = 1;
        public static final int SUBSCRIBE_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private EncryptedDataRequest encryptedDataRequest_;
        private EncryptedDataResponse encryptedDataResponse_;
        private ErrorNotification errorNotification_;
        private byte memoizedIsInitialized;
        private SubscribeRequest subscribeRequest_;
        private SubscribeResponse subscribeResponse_;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIRichNotifications.Service.1
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
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_Service_descriptor;
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
            if (hasSubscribeRequest() != service.hasSubscribeRequest()) {
                return false;
            }
            if ((hasSubscribeRequest() && !getSubscribeRequest().equals(service.getSubscribeRequest())) || hasSubscribeResponse() != service.hasSubscribeResponse()) {
                return false;
            }
            if ((hasSubscribeResponse() && !getSubscribeResponse().equals(service.getSubscribeResponse())) || hasEncryptedDataRequest() != service.hasEncryptedDataRequest()) {
                return false;
            }
            if ((hasEncryptedDataRequest() && !getEncryptedDataRequest().equals(service.getEncryptedDataRequest())) || hasEncryptedDataResponse() != service.hasEncryptedDataResponse()) {
                return false;
            }
            if ((!hasEncryptedDataResponse() || getEncryptedDataResponse().equals(service.getEncryptedDataResponse())) && hasErrorNotification() == service.hasErrorNotification()) {
                return (!hasErrorNotification() || getErrorNotification().equals(service.getErrorNotification())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
        public EncryptedDataRequest getEncryptedDataRequest() {
            EncryptedDataRequest encryptedDataRequest = this.encryptedDataRequest_;
            return encryptedDataRequest == null ? EncryptedDataRequest.getDefaultInstance() : encryptedDataRequest;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
        public EncryptedDataRequestOrBuilder getEncryptedDataRequestOrBuilder() {
            EncryptedDataRequest encryptedDataRequest = this.encryptedDataRequest_;
            return encryptedDataRequest == null ? EncryptedDataRequest.getDefaultInstance() : encryptedDataRequest;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
        public EncryptedDataResponse getEncryptedDataResponse() {
            EncryptedDataResponse encryptedDataResponse = this.encryptedDataResponse_;
            return encryptedDataResponse == null ? EncryptedDataResponse.getDefaultInstance() : encryptedDataResponse;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
        public EncryptedDataResponseOrBuilder getEncryptedDataResponseOrBuilder() {
            EncryptedDataResponse encryptedDataResponse = this.encryptedDataResponse_;
            return encryptedDataResponse == null ? EncryptedDataResponse.getDefaultInstance() : encryptedDataResponse;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
        public ErrorNotification getErrorNotification() {
            ErrorNotification errorNotification = this.errorNotification_;
            return errorNotification == null ? ErrorNotification.getDefaultInstance() : errorNotification;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
        public ErrorNotificationOrBuilder getErrorNotificationOrBuilder() {
            ErrorNotification errorNotification = this.errorNotification_;
            return errorNotification == null ? ErrorNotification.getDefaultInstance() : errorNotification;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSubscribeRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getSubscribeResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getEncryptedDataRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getEncryptedDataResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getErrorNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
        public SubscribeRequest getSubscribeRequest() {
            SubscribeRequest subscribeRequest = this.subscribeRequest_;
            return subscribeRequest == null ? SubscribeRequest.getDefaultInstance() : subscribeRequest;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
        public SubscribeRequestOrBuilder getSubscribeRequestOrBuilder() {
            SubscribeRequest subscribeRequest = this.subscribeRequest_;
            return subscribeRequest == null ? SubscribeRequest.getDefaultInstance() : subscribeRequest;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
        public SubscribeResponse getSubscribeResponse() {
            SubscribeResponse subscribeResponse = this.subscribeResponse_;
            return subscribeResponse == null ? SubscribeResponse.getDefaultInstance() : subscribeResponse;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
        public SubscribeResponseOrBuilder getSubscribeResponseOrBuilder() {
            SubscribeResponse subscribeResponse = this.subscribeResponse_;
            return subscribeResponse == null ? SubscribeResponse.getDefaultInstance() : subscribeResponse;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
        public boolean hasEncryptedDataRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
        public boolean hasEncryptedDataResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
        public boolean hasErrorNotification() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
        public boolean hasSubscribeRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
        public boolean hasSubscribeResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSubscribeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSubscribeRequest().hashCode();
            }
            if (hasSubscribeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSubscribeResponse().hashCode();
            }
            if (hasEncryptedDataRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getEncryptedDataRequest().hashCode();
            }
            if (hasEncryptedDataResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getEncryptedDataResponse().hashCode();
            }
            if (hasErrorNotification()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getErrorNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
            if (!hasEncryptedDataRequest() || getEncryptedDataRequest().isInitialized()) {
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
                codedOutputStream.writeMessage(1, getSubscribeRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getSubscribeResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getEncryptedDataRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getEncryptedDataResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getErrorNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<EncryptedDataRequest, EncryptedDataRequest.Builder, EncryptedDataRequestOrBuilder> encryptedDataRequestBuilder_;
            private EncryptedDataRequest encryptedDataRequest_;
            private SingleFieldBuilderV3<EncryptedDataResponse, EncryptedDataResponse.Builder, EncryptedDataResponseOrBuilder> encryptedDataResponseBuilder_;
            private EncryptedDataResponse encryptedDataResponse_;
            private SingleFieldBuilderV3<ErrorNotification, ErrorNotification.Builder, ErrorNotificationOrBuilder> errorNotificationBuilder_;
            private ErrorNotification errorNotification_;
            private SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> subscribeRequestBuilder_;
            private SubscribeRequest subscribeRequest_;
            private SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> subscribeResponseBuilder_;
            private SubscribeResponse subscribeResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                    service.subscribeRequest_ = singleFieldBuilderV3 == null ? this.subscribeRequest_ : (SubscribeRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV4 = this.subscribeResponseBuilder_;
                    service.subscribeResponse_ = singleFieldBuilderV4 == null ? this.subscribeResponse_ : (SubscribeResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<EncryptedDataRequest, EncryptedDataRequest.Builder, EncryptedDataRequestOrBuilder> singleFieldBuilderV5 = this.encryptedDataRequestBuilder_;
                    service.encryptedDataRequest_ = singleFieldBuilderV5 == null ? this.encryptedDataRequest_ : (EncryptedDataRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<EncryptedDataResponse, EncryptedDataResponse.Builder, EncryptedDataResponseOrBuilder> singleFieldBuilderV6 = this.encryptedDataResponseBuilder_;
                    service.encryptedDataResponse_ = singleFieldBuilderV6 == null ? this.encryptedDataResponse_ : (EncryptedDataResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<ErrorNotification, ErrorNotification.Builder, ErrorNotificationOrBuilder> singleFieldBuilderV7 = this.errorNotificationBuilder_;
                    service.errorNotification_ = singleFieldBuilderV7 == null ? this.errorNotification_ : (ErrorNotification) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                service.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_Service_descriptor;
            }

            private SingleFieldBuilderV3<EncryptedDataRequest, EncryptedDataRequest.Builder, EncryptedDataRequestOrBuilder> getEncryptedDataRequestFieldBuilder() {
                if (this.encryptedDataRequestBuilder_ == null) {
                    this.encryptedDataRequestBuilder_ = new SingleFieldBuilderV3<>(getEncryptedDataRequest(), getParentForChildren(), isClean());
                    this.encryptedDataRequest_ = null;
                }
                return this.encryptedDataRequestBuilder_;
            }

            private SingleFieldBuilderV3<EncryptedDataResponse, EncryptedDataResponse.Builder, EncryptedDataResponseOrBuilder> getEncryptedDataResponseFieldBuilder() {
                if (this.encryptedDataResponseBuilder_ == null) {
                    this.encryptedDataResponseBuilder_ = new SingleFieldBuilderV3<>(getEncryptedDataResponse(), getParentForChildren(), isClean());
                    this.encryptedDataResponse_ = null;
                }
                return this.encryptedDataResponseBuilder_;
            }

            private SingleFieldBuilderV3<ErrorNotification, ErrorNotification.Builder, ErrorNotificationOrBuilder> getErrorNotificationFieldBuilder() {
                if (this.errorNotificationBuilder_ == null) {
                    this.errorNotificationBuilder_ = new SingleFieldBuilderV3<>(getErrorNotification(), getParentForChildren(), isClean());
                    this.errorNotification_ = null;
                }
                return this.errorNotificationBuilder_;
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

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSubscribeRequestFieldBuilder();
                    getSubscribeResponseFieldBuilder();
                    getEncryptedDataRequestFieldBuilder();
                    getEncryptedDataResponseFieldBuilder();
                    getErrorNotificationFieldBuilder();
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
                this.subscribeRequest_ = null;
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.subscribeRequestBuilder_ = null;
                }
                this.subscribeResponse_ = null;
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV4 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.subscribeResponseBuilder_ = null;
                }
                this.encryptedDataRequest_ = null;
                SingleFieldBuilderV3<EncryptedDataRequest, EncryptedDataRequest.Builder, EncryptedDataRequestOrBuilder> singleFieldBuilderV5 = this.encryptedDataRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.encryptedDataRequestBuilder_ = null;
                }
                this.encryptedDataResponse_ = null;
                SingleFieldBuilderV3<EncryptedDataResponse, EncryptedDataResponse.Builder, EncryptedDataResponseOrBuilder> singleFieldBuilderV6 = this.encryptedDataResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.encryptedDataResponseBuilder_ = null;
                }
                this.errorNotification_ = null;
                SingleFieldBuilderV3<ErrorNotification, ErrorNotification.Builder, ErrorNotificationOrBuilder> singleFieldBuilderV7 = this.errorNotificationBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.errorNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearEncryptedDataRequest() {
                this.bitField0_ &= -5;
                this.encryptedDataRequest_ = null;
                SingleFieldBuilderV3<EncryptedDataRequest, EncryptedDataRequest.Builder, EncryptedDataRequestOrBuilder> singleFieldBuilderV3 = this.encryptedDataRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.encryptedDataRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEncryptedDataResponse() {
                this.bitField0_ &= -9;
                this.encryptedDataResponse_ = null;
                SingleFieldBuilderV3<EncryptedDataResponse, EncryptedDataResponse.Builder, EncryptedDataResponseOrBuilder> singleFieldBuilderV3 = this.encryptedDataResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.encryptedDataResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearErrorNotification() {
                this.bitField0_ &= -17;
                this.errorNotification_ = null;
                SingleFieldBuilderV3<ErrorNotification, ErrorNotification.Builder, ErrorNotificationOrBuilder> singleFieldBuilderV3 = this.errorNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.errorNotificationBuilder_ = null;
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
                this.bitField0_ &= -2;
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
                this.bitField0_ &= -3;
                this.subscribeResponse_ = null;
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.subscribeResponseBuilder_ = null;
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
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
            public EncryptedDataRequest getEncryptedDataRequest() {
                SingleFieldBuilderV3<EncryptedDataRequest, EncryptedDataRequest.Builder, EncryptedDataRequestOrBuilder> singleFieldBuilderV3 = this.encryptedDataRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EncryptedDataRequest) singleFieldBuilderV3.getMessage();
                }
                EncryptedDataRequest encryptedDataRequest = this.encryptedDataRequest_;
                return encryptedDataRequest == null ? EncryptedDataRequest.getDefaultInstance() : encryptedDataRequest;
            }

            public EncryptedDataRequest.Builder getEncryptedDataRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (EncryptedDataRequest.Builder) getEncryptedDataRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
            public EncryptedDataRequestOrBuilder getEncryptedDataRequestOrBuilder() {
                SingleFieldBuilderV3<EncryptedDataRequest, EncryptedDataRequest.Builder, EncryptedDataRequestOrBuilder> singleFieldBuilderV3 = this.encryptedDataRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EncryptedDataRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EncryptedDataRequest encryptedDataRequest = this.encryptedDataRequest_;
                return encryptedDataRequest == null ? EncryptedDataRequest.getDefaultInstance() : encryptedDataRequest;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
            public EncryptedDataResponse getEncryptedDataResponse() {
                SingleFieldBuilderV3<EncryptedDataResponse, EncryptedDataResponse.Builder, EncryptedDataResponseOrBuilder> singleFieldBuilderV3 = this.encryptedDataResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EncryptedDataResponse) singleFieldBuilderV3.getMessage();
                }
                EncryptedDataResponse encryptedDataResponse = this.encryptedDataResponse_;
                return encryptedDataResponse == null ? EncryptedDataResponse.getDefaultInstance() : encryptedDataResponse;
            }

            public EncryptedDataResponse.Builder getEncryptedDataResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (EncryptedDataResponse.Builder) getEncryptedDataResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
            public EncryptedDataResponseOrBuilder getEncryptedDataResponseOrBuilder() {
                SingleFieldBuilderV3<EncryptedDataResponse, EncryptedDataResponse.Builder, EncryptedDataResponseOrBuilder> singleFieldBuilderV3 = this.encryptedDataResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EncryptedDataResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EncryptedDataResponse encryptedDataResponse = this.encryptedDataResponse_;
                return encryptedDataResponse == null ? EncryptedDataResponse.getDefaultInstance() : encryptedDataResponse;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
            public ErrorNotification getErrorNotification() {
                SingleFieldBuilderV3<ErrorNotification, ErrorNotification.Builder, ErrorNotificationOrBuilder> singleFieldBuilderV3 = this.errorNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ErrorNotification) singleFieldBuilderV3.getMessage();
                }
                ErrorNotification errorNotification = this.errorNotification_;
                return errorNotification == null ? ErrorNotification.getDefaultInstance() : errorNotification;
            }

            public ErrorNotification.Builder getErrorNotificationBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (ErrorNotification.Builder) getErrorNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
            public ErrorNotificationOrBuilder getErrorNotificationOrBuilder() {
                SingleFieldBuilderV3<ErrorNotification, ErrorNotification.Builder, ErrorNotificationOrBuilder> singleFieldBuilderV3 = this.errorNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ErrorNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ErrorNotification errorNotification = this.errorNotification_;
                return errorNotification == null ? ErrorNotification.getDefaultInstance() : errorNotification;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
            public SubscribeRequest getSubscribeRequest() {
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SubscribeRequest) singleFieldBuilderV3.getMessage();
                }
                SubscribeRequest subscribeRequest = this.subscribeRequest_;
                return subscribeRequest == null ? SubscribeRequest.getDefaultInstance() : subscribeRequest;
            }

            public SubscribeRequest.Builder getSubscribeRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SubscribeRequest.Builder) getSubscribeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
            public SubscribeRequestOrBuilder getSubscribeRequestOrBuilder() {
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SubscribeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SubscribeRequest subscribeRequest = this.subscribeRequest_;
                return subscribeRequest == null ? SubscribeRequest.getDefaultInstance() : subscribeRequest;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
            public SubscribeResponse getSubscribeResponse() {
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SubscribeResponse) singleFieldBuilderV3.getMessage();
                }
                SubscribeResponse subscribeResponse = this.subscribeResponse_;
                return subscribeResponse == null ? SubscribeResponse.getDefaultInstance() : subscribeResponse;
            }

            public SubscribeResponse.Builder getSubscribeResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SubscribeResponse.Builder) getSubscribeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
            public SubscribeResponseOrBuilder getSubscribeResponseOrBuilder() {
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SubscribeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SubscribeResponse subscribeResponse = this.subscribeResponse_;
                return subscribeResponse == null ? SubscribeResponse.getDefaultInstance() : subscribeResponse;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
            public boolean hasEncryptedDataRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
            public boolean hasEncryptedDataResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
            public boolean hasErrorNotification() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
            public boolean hasSubscribeRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.ServiceOrBuilder
            public boolean hasSubscribeResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasEncryptedDataRequest() || getEncryptedDataRequest().isInitialized();
            }

            public Builder mergeEncryptedDataRequest(EncryptedDataRequest encryptedDataRequest) {
                EncryptedDataRequest encryptedDataRequest2;
                SingleFieldBuilderV3<EncryptedDataRequest, EncryptedDataRequest.Builder, EncryptedDataRequestOrBuilder> singleFieldBuilderV3 = this.encryptedDataRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(encryptedDataRequest);
                } else if ((this.bitField0_ & 4) == 0 || (encryptedDataRequest2 = this.encryptedDataRequest_) == null || encryptedDataRequest2 == EncryptedDataRequest.getDefaultInstance()) {
                    this.encryptedDataRequest_ = encryptedDataRequest;
                } else {
                    getEncryptedDataRequestBuilder().mergeFrom(encryptedDataRequest);
                }
                if (this.encryptedDataRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeEncryptedDataResponse(EncryptedDataResponse encryptedDataResponse) {
                EncryptedDataResponse encryptedDataResponse2;
                SingleFieldBuilderV3<EncryptedDataResponse, EncryptedDataResponse.Builder, EncryptedDataResponseOrBuilder> singleFieldBuilderV3 = this.encryptedDataResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(encryptedDataResponse);
                } else if ((this.bitField0_ & 8) == 0 || (encryptedDataResponse2 = this.encryptedDataResponse_) == null || encryptedDataResponse2 == EncryptedDataResponse.getDefaultInstance()) {
                    this.encryptedDataResponse_ = encryptedDataResponse;
                } else {
                    getEncryptedDataResponseBuilder().mergeFrom(encryptedDataResponse);
                }
                if (this.encryptedDataResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeErrorNotification(ErrorNotification errorNotification) {
                ErrorNotification errorNotification2;
                SingleFieldBuilderV3<ErrorNotification, ErrorNotification.Builder, ErrorNotificationOrBuilder> singleFieldBuilderV3 = this.errorNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(errorNotification);
                } else if ((this.bitField0_ & 16) == 0 || (errorNotification2 = this.errorNotification_) == null || errorNotification2 == ErrorNotification.getDefaultInstance()) {
                    this.errorNotification_ = errorNotification;
                } else {
                    getErrorNotificationBuilder().mergeFrom(errorNotification);
                }
                if (this.errorNotification_ != null) {
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
                                    codedInputStream.readMessage(getSubscribeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getSubscribeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getEncryptedDataRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getEncryptedDataResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getErrorNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSubscribeRequest(SubscribeRequest subscribeRequest) {
                SubscribeRequest subscribeRequest2;
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(subscribeRequest);
                } else if ((this.bitField0_ & 1) == 0 || (subscribeRequest2 = this.subscribeRequest_) == null || subscribeRequest2 == SubscribeRequest.getDefaultInstance()) {
                    this.subscribeRequest_ = subscribeRequest;
                } else {
                    getSubscribeRequestBuilder().mergeFrom(subscribeRequest);
                }
                if (this.subscribeRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSubscribeResponse(SubscribeResponse subscribeResponse) {
                SubscribeResponse subscribeResponse2;
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(subscribeResponse);
                } else if ((this.bitField0_ & 2) == 0 || (subscribeResponse2 = this.subscribeResponse_) == null || subscribeResponse2 == SubscribeResponse.getDefaultInstance()) {
                    this.subscribeResponse_ = subscribeResponse;
                } else {
                    getSubscribeResponseBuilder().mergeFrom(subscribeResponse);
                }
                if (this.subscribeResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setEncryptedDataRequest(EncryptedDataRequest.Builder builder) {
                SingleFieldBuilderV3<EncryptedDataRequest, EncryptedDataRequest.Builder, EncryptedDataRequestOrBuilder> singleFieldBuilderV3 = this.encryptedDataRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.encryptedDataRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setEncryptedDataResponse(EncryptedDataResponse.Builder builder) {
                SingleFieldBuilderV3<EncryptedDataResponse, EncryptedDataResponse.Builder, EncryptedDataResponseOrBuilder> singleFieldBuilderV3 = this.encryptedDataResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.encryptedDataResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setErrorNotification(ErrorNotification.Builder builder) {
                SingleFieldBuilderV3<ErrorNotification, ErrorNotification.Builder, ErrorNotificationOrBuilder> singleFieldBuilderV3 = this.errorNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.errorNotification_ = builder.build();
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

            public Builder setSubscribeRequest(SubscribeRequest.Builder builder) {
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.subscribeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
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
                this.bitField0_ |= 2;
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

            public Builder setEncryptedDataRequest(EncryptedDataRequest encryptedDataRequest) {
                SingleFieldBuilderV3<EncryptedDataRequest, EncryptedDataRequest.Builder, EncryptedDataRequestOrBuilder> singleFieldBuilderV3 = this.encryptedDataRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    encryptedDataRequest.getClass();
                    this.encryptedDataRequest_ = encryptedDataRequest;
                } else {
                    singleFieldBuilderV3.setMessage(encryptedDataRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setEncryptedDataResponse(EncryptedDataResponse encryptedDataResponse) {
                SingleFieldBuilderV3<EncryptedDataResponse, EncryptedDataResponse.Builder, EncryptedDataResponseOrBuilder> singleFieldBuilderV3 = this.encryptedDataResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    encryptedDataResponse.getClass();
                    this.encryptedDataResponse_ = encryptedDataResponse;
                } else {
                    singleFieldBuilderV3.setMessage(encryptedDataResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setErrorNotification(ErrorNotification errorNotification) {
                SingleFieldBuilderV3<ErrorNotification, ErrorNotification.Builder, ErrorNotificationOrBuilder> singleFieldBuilderV3 = this.errorNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    errorNotification.getClass();
                    this.errorNotification_ = errorNotification;
                } else {
                    singleFieldBuilderV3.setMessage(errorNotification);
                }
                this.bitField0_ |= 16;
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
                this.bitField0_ |= 1;
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
                if (service.hasSubscribeRequest()) {
                    mergeSubscribeRequest(service.getSubscribeRequest());
                }
                if (service.hasSubscribeResponse()) {
                    mergeSubscribeResponse(service.getSubscribeResponse());
                }
                if (service.hasEncryptedDataRequest()) {
                    mergeEncryptedDataRequest(service.getEncryptedDataRequest());
                }
                if (service.hasEncryptedDataResponse()) {
                    mergeEncryptedDataResponse(service.getEncryptedDataResponse());
                }
                if (service.hasErrorNotification()) {
                    mergeErrorNotification(service.getErrorNotification());
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

    public static final class SubscribeResponse extends GeneratedMessageV3 implements SubscribeResponseOrBuilder {
        private static final SubscribeResponse DEFAULT_INSTANCE = new SubscribeResponse();

        @Deprecated
        public static final Parser<SubscribeResponse> PARSER = new AbstractParser<SubscribeResponse>() { // from class: com.garmin.proto.generated.GDIRichNotifications.SubscribeResponse.1
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
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_SubscribeResponse_descriptor;
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

        @Override // com.garmin.proto.generated.GDIRichNotifications.SubscribeResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIRichNotifications.SubscribeResponseOrBuilder
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
            return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_SubscribeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SubscribeResponse.class, Builder.class);
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
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_SubscribeResponse_descriptor;
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
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_SubscribeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.SubscribeResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRichNotifications.SubscribeResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotifications.internal_static_GDI_Proto_RichNotifications_SubscribeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SubscribeResponse.class, Builder.class);
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
            STATUS_UNKNOWN(0),
            STATUS_SUCCESS(1),
            STATUS_ERROR(2);

            public static final int STATUS_ERROR_VALUE = 2;
            public static final int STATUS_SUCCESS_VALUE = 1;
            public static final int STATUS_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIRichNotifications.SubscribeResponse.Status.1
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
                    return STATUS_UNKNOWN;
                }
                if (i14 == 1) {
                    return STATUS_SUCCESS;
                }
                if (i14 != 2) {
                    return null;
                }
                return STATUS_ERROR;
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

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public enum MediaType implements ProtocolMessageEnum {
        MEDIA_TYPE_UNKNOWN(0),
        MEDIA_TYPE_PNG(1),
        MEDIA_TYPE_JPEG(2),
        MEDIA_TYPE_GIF(3),
        MEDIA_TYPE_MP3(4);

        public static final int MEDIA_TYPE_GIF_VALUE = 3;
        public static final int MEDIA_TYPE_JPEG_VALUE = 2;
        public static final int MEDIA_TYPE_MP3_VALUE = 4;
        public static final int MEDIA_TYPE_PNG_VALUE = 1;
        public static final int MEDIA_TYPE_UNKNOWN_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<MediaType> internalValueMap = new Internal.EnumLiteMap<MediaType>() { // from class: com.garmin.proto.generated.GDIRichNotifications.MediaType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public MediaType findValueByNumber(int i14) {
                return MediaType.forNumber(i14);
            }
        };
        private static final MediaType[] VALUES = values();

        MediaType(int i14) {
            this.value = i14;
        }

        public static MediaType forNumber(int i14) {
            if (i14 == 0) {
                return MEDIA_TYPE_UNKNOWN;
            }
            if (i14 == 1) {
                return MEDIA_TYPE_PNG;
            }
            if (i14 == 2) {
                return MEDIA_TYPE_JPEG;
            }
            if (i14 == 3) {
                return MEDIA_TYPE_GIF;
            }
            if (i14 != 4) {
                return null;
            }
            return MEDIA_TYPE_MP3;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIRichNotifications.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<MediaType> internalGetValueMap() {
            return internalValueMap;
        }

        public static MediaType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static MediaType valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
