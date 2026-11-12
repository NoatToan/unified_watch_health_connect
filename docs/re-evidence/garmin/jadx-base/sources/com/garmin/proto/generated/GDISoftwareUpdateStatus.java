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

/* JADX INFO: loaded from: classes13.dex */
public final class GDISoftwareUpdateStatus {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001dGDISoftwareUpdateStatus.proto\u0012\u001eGDI.Proto.SoftwareUpdateStatus\u001a\u0015GDIEventSharing.proto\"\u009f\n\n\u0007Service\u0012Y\n\u0019check_for_updates_request\u0018\u0001 \u0001(\u000b26.GDI.Proto.SoftwareUpdateStatus.CheckForUpdatesRequest\u0012[\n\u001acheck_for_updates_response\u0018\u0002 \u0001(\u000b27.GDI.Proto.SoftwareUpdateStatus.CheckForUpdatesResponse\u0012X\n\u0018download_updates_request\u0018\u0003 \u0001(\u000b26.GDI.Proto.SoftwareUpdateStatus.DownloadUpdatesRequest\u0012Z\n\u0019download_updates_response\u0018\u0004 \u0001(\u000b27.GDI.Proto.SoftwareUpdateStatus.DownloadUpdatesResponse\u0012d\n\u001edownload_progress_notification\u0018\u0005 \u0001(\u000b2<.GDI.Proto.SoftwareUpdateStatus.DownloadProgressNotification\u0012^\n\u001bdownload_ready_notification\u0018\u0006 \u0001(\u000b29.GDI.Proto.SoftwareUpdateStatus.DownloadReadyNotification\u0012R\n\u0015apply_updates_request\u0018\u0007 \u0001(\u000b23.GDI.Proto.SoftwareUpdateStatus.ApplyUpdatesRequest\u0012T\n\u0016apply_updates_response\u0018\b \u0001(\u000b24.GDI.Proto.SoftwareUpdateStatus.ApplyUpdatesResponse\u0012R\n\u0015update_status_request\u0018\t \u0001(\u000b23.GDI.Proto.SoftwareUpdateStatus.UpdateStatusRequest\u0012T\n\u0016update_status_response\u0018\n \u0001(\u000b24.GDI.Proto.SoftwareUpdateStatus.UpdateStatusResponse\u0012b\n\u001dupdate_completed_notification\u0018\u000b \u0001(\u000b2;.GDI.Proto.SoftwareUpdateStatus.UpdateCompletedNotification\u0012l\n\"acknowledge_completed_notification\u0018\f \u0001(\u000b2@.GDI.Proto.SoftwareUpdateStatus.AcknowledgeCompletedNotification\u0012[\n\u001aauto_update_config_request\u0018\r \u0001(\u000b27.GDI.Proto.SoftwareUpdateStatus.AutoUpdateConfigRequest\u0012]\n\u001bauto_update_config_response\u0018\u000e \u0001(\u000b28.GDI.Proto.SoftwareUpdateStatus.AutoUpdateConfigResponse\"\u0018\n\u0016CheckForUpdatesRequest\"¸\u0001\n\u0017CheckForUpdatesResponse\u0012N\n\u0006status\u0018\u0001 \u0001(\u000e2>.GDI.Proto.SoftwareUpdateStatus.CheckForUpdatesResponse.Status\"M\n\u0006Status\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\f\n\bCHECKING\u0010\u0001\u0012\u0011\n\rUPDATES_FOUND\u0010\u0002\u0012\u0015\n\u0011UPDATES_NOT_FOUND\u0010\u0003\"\u0018\n\u0016DownloadUpdatesRequest\"3\n\u0017DownloadUpdatesResponse\u0012\u0018\n\u0010download_started\u0018\u0001 \u0001(\b\"±\u0001\n\u001cDownloadProgressNotification\u0012\u0019\n\u0011percent_completed\u0018\u0001 \u0001(\r2v\n\u0004data\u0012).GDI.Proto.EventSharing.AlertNotification\u0018\u0084\b \u0001(\u000b2<.GDI.Proto.SoftwareUpdateStatus.DownloadProgressNotification\"È\u0001\n\u0019DownloadReadyNotification\u0012\u0014\n\fupdate_count\u0018\u0001 \u0001(\r\u0012 \n\u0018estimated_install_time_s\u0018\u0002 \u0001(\r2s\n\u0004data\u0012).GDI.Proto.EventSharing.AlertNotification\u0018\u0085\b \u0001(\u000b29.GDI.Proto.SoftwareUpdateStatus.DownloadReadyNotification\"\u0015\n\u0013ApplyUpdatesRequest\"0\n\u0014ApplyUpdatesResponse\u0012\u0018\n\u0010applying_updates\u0018\u0001 \u0001(\b\"\u0015\n\u0013UpdateStatusRequest\"\u0089\u0002\n\u0014UpdateStatusResponse\u0012K\n\u0006status\u0018\u0001 \u0001(\u000e2;.GDI.Proto.SoftwareUpdateStatus.UpdateStatusResponse.Status\u0012\u001f\n\u0017updates_pending_on_disk\u0018\u0002 \u0001(\b\u0012\u001e\n\u0016current_bundle_version\u0018\u0003 \u0001(\r\"c\n\u0006Status\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\b\n\u0004IDLE\u0010\u0001\u0012\f\n\bCHECKING\u0010\u0002\u0012\u000f\n\u000bDOWNLOADING\u0010\u0003\u0012\u0015\n\u0011DOWNLOAD_COMPLETE\u0010\u0004\u0012\f\n\bAPPLYING\u0010\u0005\"á\u0001\n\u001bUpdateCompletedNotification\u0012\u0018\n\u0010previous_version\u0018\u0001 \u0001(\r\u0012\u0013\n\u000bnew_version\u0018\u0002 \u0001(\r\u0012\u001c\n\u0014updated_part_numbers\u0018\u0003 \u0001(\r2u\n\u0004data\u0012).GDI.Proto.EventSharing.AlertNotification\u0018\u0086\b \u0001(\u000b2;.GDI.Proto.SoftwareUpdateStatus.UpdateCompletedNotification\"\"\n AcknowledgeCompletedNotification\"*\n\u0017AutoUpdateConfigMessage\u0012\u000f\n\u0007enabled\u0018\u0001 \u0001(\b\"_\n\u0017AutoUpdateConfigRequest\u0012D\n\u0003msg\u0018\u0001 \u0001(\u000b27.GDI.Proto.SoftwareUpdateStatus.AutoUpdateConfigMessage\"`\n\u0018AutoUpdateConfigResponse\u0012D\n\u0003msg\u0018\u0001 \u0001(\u000b27.GDI.Proto.SoftwareUpdateStatus.AutoUpdateConfigMessageB7\n\u001acom.garmin.proto.generatedB\u0017GDISoftwareUpdateStatusH\u0003"}, new Descriptors.FileDescriptor[]{GDIEventSharingProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SoftwareUpdateStatus_AcknowledgeCompletedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SoftwareUpdateStatus_AcknowledgeCompletedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SoftwareUpdateStatus_ApplyUpdatesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SoftwareUpdateStatus_ApplyUpdatesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SoftwareUpdateStatus_ApplyUpdatesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SoftwareUpdateStatus_ApplyUpdatesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigMessage_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigMessage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SoftwareUpdateStatus_CheckForUpdatesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SoftwareUpdateStatus_CheckForUpdatesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SoftwareUpdateStatus_CheckForUpdatesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SoftwareUpdateStatus_CheckForUpdatesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadProgressNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadProgressNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadReadyNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadReadyNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadUpdatesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadUpdatesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadUpdatesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadUpdatesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SoftwareUpdateStatus_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SoftwareUpdateStatus_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateCompletedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateCompletedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateStatusRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateStatusRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateStatusResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateStatusResponse_fieldAccessorTable;

    public interface AcknowledgeCompletedNotificationOrBuilder extends MessageOrBuilder {
    }

    public interface ApplyUpdatesRequestOrBuilder extends MessageOrBuilder {
    }

    public interface ApplyUpdatesResponseOrBuilder extends MessageOrBuilder {
        boolean getApplyingUpdates();

        boolean hasApplyingUpdates();
    }

    public interface AutoUpdateConfigMessageOrBuilder extends MessageOrBuilder {
        boolean getEnabled();

        boolean hasEnabled();
    }

    public interface AutoUpdateConfigRequestOrBuilder extends MessageOrBuilder {
        AutoUpdateConfigMessage getMsg();

        AutoUpdateConfigMessageOrBuilder getMsgOrBuilder();

        boolean hasMsg();
    }

    public interface AutoUpdateConfigResponseOrBuilder extends MessageOrBuilder {
        AutoUpdateConfigMessage getMsg();

        AutoUpdateConfigMessageOrBuilder getMsgOrBuilder();

        boolean hasMsg();
    }

    public interface CheckForUpdatesRequestOrBuilder extends MessageOrBuilder {
    }

    public interface CheckForUpdatesResponseOrBuilder extends MessageOrBuilder {
        CheckForUpdatesResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface DownloadProgressNotificationOrBuilder extends MessageOrBuilder {
        int getPercentCompleted();

        boolean hasPercentCompleted();
    }

    public interface DownloadReadyNotificationOrBuilder extends MessageOrBuilder {
        int getEstimatedInstallTimeS();

        int getUpdateCount();

        boolean hasEstimatedInstallTimeS();

        boolean hasUpdateCount();
    }

    public interface DownloadUpdatesRequestOrBuilder extends MessageOrBuilder {
    }

    public interface DownloadUpdatesResponseOrBuilder extends MessageOrBuilder {
        boolean getDownloadStarted();

        boolean hasDownloadStarted();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        AcknowledgeCompletedNotification getAcknowledgeCompletedNotification();

        AcknowledgeCompletedNotificationOrBuilder getAcknowledgeCompletedNotificationOrBuilder();

        ApplyUpdatesRequest getApplyUpdatesRequest();

        ApplyUpdatesRequestOrBuilder getApplyUpdatesRequestOrBuilder();

        ApplyUpdatesResponse getApplyUpdatesResponse();

        ApplyUpdatesResponseOrBuilder getApplyUpdatesResponseOrBuilder();

        AutoUpdateConfigRequest getAutoUpdateConfigRequest();

        AutoUpdateConfigRequestOrBuilder getAutoUpdateConfigRequestOrBuilder();

        AutoUpdateConfigResponse getAutoUpdateConfigResponse();

        AutoUpdateConfigResponseOrBuilder getAutoUpdateConfigResponseOrBuilder();

        CheckForUpdatesRequest getCheckForUpdatesRequest();

        CheckForUpdatesRequestOrBuilder getCheckForUpdatesRequestOrBuilder();

        CheckForUpdatesResponse getCheckForUpdatesResponse();

        CheckForUpdatesResponseOrBuilder getCheckForUpdatesResponseOrBuilder();

        DownloadProgressNotification getDownloadProgressNotification();

        DownloadProgressNotificationOrBuilder getDownloadProgressNotificationOrBuilder();

        DownloadReadyNotification getDownloadReadyNotification();

        DownloadReadyNotificationOrBuilder getDownloadReadyNotificationOrBuilder();

        DownloadUpdatesRequest getDownloadUpdatesRequest();

        DownloadUpdatesRequestOrBuilder getDownloadUpdatesRequestOrBuilder();

        DownloadUpdatesResponse getDownloadUpdatesResponse();

        DownloadUpdatesResponseOrBuilder getDownloadUpdatesResponseOrBuilder();

        UpdateCompletedNotification getUpdateCompletedNotification();

        UpdateCompletedNotificationOrBuilder getUpdateCompletedNotificationOrBuilder();

        UpdateStatusRequest getUpdateStatusRequest();

        UpdateStatusRequestOrBuilder getUpdateStatusRequestOrBuilder();

        UpdateStatusResponse getUpdateStatusResponse();

        UpdateStatusResponseOrBuilder getUpdateStatusResponseOrBuilder();

        boolean hasAcknowledgeCompletedNotification();

        boolean hasApplyUpdatesRequest();

        boolean hasApplyUpdatesResponse();

        boolean hasAutoUpdateConfigRequest();

        boolean hasAutoUpdateConfigResponse();

        boolean hasCheckForUpdatesRequest();

        boolean hasCheckForUpdatesResponse();

        boolean hasDownloadProgressNotification();

        boolean hasDownloadReadyNotification();

        boolean hasDownloadUpdatesRequest();

        boolean hasDownloadUpdatesResponse();

        boolean hasUpdateCompletedNotification();

        boolean hasUpdateStatusRequest();

        boolean hasUpdateStatusResponse();
    }

    public interface UpdateCompletedNotificationOrBuilder extends MessageOrBuilder {
        int getNewVersion();

        int getPreviousVersion();

        int getUpdatedPartNumbers();

        boolean hasNewVersion();

        boolean hasPreviousVersion();

        boolean hasUpdatedPartNumbers();
    }

    public interface UpdateStatusRequestOrBuilder extends MessageOrBuilder {
    }

    public interface UpdateStatusResponseOrBuilder extends MessageOrBuilder {
        int getCurrentBundleVersion();

        UpdateStatusResponse.Status getStatus();

        boolean getUpdatesPendingOnDisk();

        boolean hasCurrentBundleVersion();

        boolean hasStatus();

        boolean hasUpdatesPendingOnDisk();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_SoftwareUpdateStatus_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_SoftwareUpdateStatus_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"CheckForUpdatesRequest", "CheckForUpdatesResponse", "DownloadUpdatesRequest", "DownloadUpdatesResponse", "DownloadProgressNotification", "DownloadReadyNotification", "ApplyUpdatesRequest", "ApplyUpdatesResponse", "UpdateStatusRequest", "UpdateStatusResponse", "UpdateCompletedNotification", "AcknowledgeCompletedNotification", "AutoUpdateConfigRequest", "AutoUpdateConfigResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_SoftwareUpdateStatus_CheckForUpdatesRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_SoftwareUpdateStatus_CheckForUpdatesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_SoftwareUpdateStatus_CheckForUpdatesResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_SoftwareUpdateStatus_CheckForUpdatesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Status"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadUpdatesRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadUpdatesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[0]);
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadUpdatesResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadUpdatesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"DownloadStarted"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadProgressNotification_descriptor = descriptor7;
        internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadProgressNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"PercentCompleted"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadReadyNotification_descriptor = descriptor8;
        internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadReadyNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"UpdateCount", "EstimatedInstallTimeS"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_SoftwareUpdateStatus_ApplyUpdatesRequest_descriptor = descriptor9;
        internal_static_GDI_Proto_SoftwareUpdateStatus_ApplyUpdatesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[0]);
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_SoftwareUpdateStatus_ApplyUpdatesResponse_descriptor = descriptor10;
        internal_static_GDI_Proto_SoftwareUpdateStatus_ApplyUpdatesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"ApplyingUpdates"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateStatusRequest_descriptor = descriptor11;
        internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateStatusRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[0]);
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateStatusResponse_descriptor = descriptor12;
        internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateStatusResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Status", "UpdatesPendingOnDisk", "CurrentBundleVersion"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateCompletedNotification_descriptor = descriptor13;
        internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateCompletedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"PreviousVersion", "NewVersion", "UpdatedPartNumbers"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_GDI_Proto_SoftwareUpdateStatus_AcknowledgeCompletedNotification_descriptor = descriptor14;
        internal_static_GDI_Proto_SoftwareUpdateStatus_AcknowledgeCompletedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[0]);
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(13);
        internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigMessage_descriptor = descriptor15;
        internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Enabled"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(14);
        internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigRequest_descriptor = descriptor16;
        internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Msg"});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(15);
        internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigResponse_descriptor = descriptor17;
        internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"Msg"});
        GDIEventSharingProto.getDescriptor();
    }

    private GDISoftwareUpdateStatus() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(DownloadProgressNotification.data);
        extensionRegistryLite.add(DownloadReadyNotification.data);
        extensionRegistryLite.add(UpdateCompletedNotification.data);
    }

    public static final class AcknowledgeCompletedNotification extends GeneratedMessageV3 implements AcknowledgeCompletedNotificationOrBuilder {
        private static final AcknowledgeCompletedNotification DEFAULT_INSTANCE = new AcknowledgeCompletedNotification();

        @Deprecated
        public static final Parser<AcknowledgeCompletedNotification> PARSER = new AbstractParser<AcknowledgeCompletedNotification>() { // from class: com.garmin.proto.generated.GDISoftwareUpdateStatus.AcknowledgeCompletedNotification.1
            @Override // com.google.protobuf.Parser
            public AcknowledgeCompletedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AcknowledgeCompletedNotification.newBuilder();
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

        private AcknowledgeCompletedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AcknowledgeCompletedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_AcknowledgeCompletedNotification_descriptor;
        }

        public static Builder newBuilder(AcknowledgeCompletedNotification acknowledgeCompletedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(acknowledgeCompletedNotification);
        }

        public static AcknowledgeCompletedNotification parseDelimitedFrom(InputStream inputStream) {
            return (AcknowledgeCompletedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AcknowledgeCompletedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AcknowledgeCompletedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof AcknowledgeCompletedNotification) {
                return getUnknownFields().equals(((AcknowledgeCompletedNotification) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AcknowledgeCompletedNotification> getParserForType() {
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
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_AcknowledgeCompletedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AcknowledgeCompletedNotification.class, Builder.class);
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
            return new AcknowledgeCompletedNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AcknowledgeCompletedNotificationOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_AcknowledgeCompletedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AcknowledgeCompletedNotification build() {
                AcknowledgeCompletedNotification acknowledgeCompletedNotificationBuildPartial = buildPartial();
                if (acknowledgeCompletedNotificationBuildPartial.isInitialized()) {
                    return acknowledgeCompletedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) acknowledgeCompletedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AcknowledgeCompletedNotification buildPartial() {
                AcknowledgeCompletedNotification acknowledgeCompletedNotification = new AcknowledgeCompletedNotification(this);
                onBuilt();
                return acknowledgeCompletedNotification;
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
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_AcknowledgeCompletedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_AcknowledgeCompletedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AcknowledgeCompletedNotification.class, Builder.class);
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
            public AcknowledgeCompletedNotification getDefaultInstanceForType() {
                return AcknowledgeCompletedNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AcknowledgeCompletedNotification) {
                    return mergeFrom((AcknowledgeCompletedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AcknowledgeCompletedNotification acknowledgeCompletedNotification) {
                if (acknowledgeCompletedNotification == AcknowledgeCompletedNotification.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(acknowledgeCompletedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AcknowledgeCompletedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ AcknowledgeCompletedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private AcknowledgeCompletedNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AcknowledgeCompletedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AcknowledgeCompletedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AcknowledgeCompletedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AcknowledgeCompletedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AcknowledgeCompletedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AcknowledgeCompletedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AcknowledgeCompletedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AcknowledgeCompletedNotification parseFrom(InputStream inputStream) {
            return (AcknowledgeCompletedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AcknowledgeCompletedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AcknowledgeCompletedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AcknowledgeCompletedNotification parseFrom(CodedInputStream codedInputStream) {
            return (AcknowledgeCompletedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AcknowledgeCompletedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AcknowledgeCompletedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ApplyUpdatesRequest extends GeneratedMessageV3 implements ApplyUpdatesRequestOrBuilder {
        private static final ApplyUpdatesRequest DEFAULT_INSTANCE = new ApplyUpdatesRequest();

        @Deprecated
        public static final Parser<ApplyUpdatesRequest> PARSER = new AbstractParser<ApplyUpdatesRequest>() { // from class: com.garmin.proto.generated.GDISoftwareUpdateStatus.ApplyUpdatesRequest.1
            @Override // com.google.protobuf.Parser
            public ApplyUpdatesRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ApplyUpdatesRequest.newBuilder();
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

        private ApplyUpdatesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ApplyUpdatesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_ApplyUpdatesRequest_descriptor;
        }

        public static Builder newBuilder(ApplyUpdatesRequest applyUpdatesRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(applyUpdatesRequest);
        }

        public static ApplyUpdatesRequest parseDelimitedFrom(InputStream inputStream) {
            return (ApplyUpdatesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ApplyUpdatesRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ApplyUpdatesRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof ApplyUpdatesRequest) {
                return getUnknownFields().equals(((ApplyUpdatesRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ApplyUpdatesRequest> getParserForType() {
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
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_ApplyUpdatesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyUpdatesRequest.class, Builder.class);
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
            return new ApplyUpdatesRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ApplyUpdatesRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_ApplyUpdatesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ApplyUpdatesRequest build() {
                ApplyUpdatesRequest applyUpdatesRequestBuildPartial = buildPartial();
                if (applyUpdatesRequestBuildPartial.isInitialized()) {
                    return applyUpdatesRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) applyUpdatesRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ApplyUpdatesRequest buildPartial() {
                ApplyUpdatesRequest applyUpdatesRequest = new ApplyUpdatesRequest(this);
                onBuilt();
                return applyUpdatesRequest;
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
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_ApplyUpdatesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_ApplyUpdatesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyUpdatesRequest.class, Builder.class);
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
            public ApplyUpdatesRequest getDefaultInstanceForType() {
                return ApplyUpdatesRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ApplyUpdatesRequest) {
                    return mergeFrom((ApplyUpdatesRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ApplyUpdatesRequest applyUpdatesRequest) {
                if (applyUpdatesRequest == ApplyUpdatesRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(applyUpdatesRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ApplyUpdatesRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ApplyUpdatesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ApplyUpdatesRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ApplyUpdatesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ApplyUpdatesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ApplyUpdatesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ApplyUpdatesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ApplyUpdatesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ApplyUpdatesRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ApplyUpdatesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ApplyUpdatesRequest parseFrom(InputStream inputStream) {
            return (ApplyUpdatesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ApplyUpdatesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ApplyUpdatesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ApplyUpdatesRequest parseFrom(CodedInputStream codedInputStream) {
            return (ApplyUpdatesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ApplyUpdatesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ApplyUpdatesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ApplyUpdatesResponse extends GeneratedMessageV3 implements ApplyUpdatesResponseOrBuilder {
        public static final int APPLYING_UPDATES_FIELD_NUMBER = 1;
        private static final ApplyUpdatesResponse DEFAULT_INSTANCE = new ApplyUpdatesResponse();

        @Deprecated
        public static final Parser<ApplyUpdatesResponse> PARSER = new AbstractParser<ApplyUpdatesResponse>() { // from class: com.garmin.proto.generated.GDISoftwareUpdateStatus.ApplyUpdatesResponse.1
            @Override // com.google.protobuf.Parser
            public ApplyUpdatesResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ApplyUpdatesResponse.newBuilder();
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
        private boolean applyingUpdates_;
        private int bitField0_;
        private byte memoizedIsInitialized;

        private ApplyUpdatesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.applyingUpdates_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ApplyUpdatesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_ApplyUpdatesResponse_descriptor;
        }

        public static Builder newBuilder(ApplyUpdatesResponse applyUpdatesResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(applyUpdatesResponse);
        }

        public static ApplyUpdatesResponse parseDelimitedFrom(InputStream inputStream) {
            return (ApplyUpdatesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ApplyUpdatesResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ApplyUpdatesResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ApplyUpdatesResponse)) {
                return super.equals(obj);
            }
            ApplyUpdatesResponse applyUpdatesResponse = (ApplyUpdatesResponse) obj;
            if (hasApplyingUpdates() != applyUpdatesResponse.hasApplyingUpdates()) {
                return false;
            }
            return (!hasApplyingUpdates() || getApplyingUpdates() == applyUpdatesResponse.getApplyingUpdates()) && getUnknownFields().equals(applyUpdatesResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ApplyUpdatesResponseOrBuilder
        public boolean getApplyingUpdates() {
            return this.applyingUpdates_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ApplyUpdatesResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.applyingUpdates_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ApplyUpdatesResponseOrBuilder
        public boolean hasApplyingUpdates() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasApplyingUpdates()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getApplyingUpdates());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_ApplyUpdatesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyUpdatesResponse.class, Builder.class);
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
            return new ApplyUpdatesResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.applyingUpdates_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ApplyUpdatesResponseOrBuilder {
            private boolean applyingUpdates_;
            private int bitField0_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(ApplyUpdatesResponse applyUpdatesResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    applyUpdatesResponse.applyingUpdates_ = this.applyingUpdates_;
                } else {
                    i14 = 0;
                }
                applyUpdatesResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_ApplyUpdatesResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ApplyUpdatesResponse build() {
                ApplyUpdatesResponse applyUpdatesResponseBuildPartial = buildPartial();
                if (applyUpdatesResponseBuildPartial.isInitialized()) {
                    return applyUpdatesResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) applyUpdatesResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ApplyUpdatesResponse buildPartial() {
                ApplyUpdatesResponse applyUpdatesResponse = new ApplyUpdatesResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(applyUpdatesResponse);
                }
                onBuilt();
                return applyUpdatesResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.applyingUpdates_ = false;
                return this;
            }

            public Builder clearApplyingUpdates() {
                this.bitField0_ &= -2;
                this.applyingUpdates_ = false;
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

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ApplyUpdatesResponseOrBuilder
            public boolean getApplyingUpdates() {
                return this.applyingUpdates_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_ApplyUpdatesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ApplyUpdatesResponseOrBuilder
            public boolean hasApplyingUpdates() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_ApplyUpdatesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyUpdatesResponse.class, Builder.class);
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
                                    this.applyingUpdates_ = codedInputStream.readBool();
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

            public Builder setApplyingUpdates(boolean z14) {
                this.applyingUpdates_ = z14;
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
            public ApplyUpdatesResponse getDefaultInstanceForType() {
                return ApplyUpdatesResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ApplyUpdatesResponse) {
                    return mergeFrom((ApplyUpdatesResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ApplyUpdatesResponse applyUpdatesResponse) {
                if (applyUpdatesResponse == ApplyUpdatesResponse.getDefaultInstance()) {
                    return this;
                }
                if (applyUpdatesResponse.hasApplyingUpdates()) {
                    setApplyingUpdates(applyUpdatesResponse.getApplyingUpdates());
                }
                mergeUnknownFields(applyUpdatesResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ApplyUpdatesResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ApplyUpdatesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ApplyUpdatesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ApplyUpdatesResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ApplyUpdatesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ApplyUpdatesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ApplyUpdatesResponse() {
            this.applyingUpdates_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ApplyUpdatesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ApplyUpdatesResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ApplyUpdatesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ApplyUpdatesResponse parseFrom(InputStream inputStream) {
            return (ApplyUpdatesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ApplyUpdatesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ApplyUpdatesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ApplyUpdatesResponse parseFrom(CodedInputStream codedInputStream) {
            return (ApplyUpdatesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ApplyUpdatesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ApplyUpdatesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AutoUpdateConfigMessage extends GeneratedMessageV3 implements AutoUpdateConfigMessageOrBuilder {
        public static final int ENABLED_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean enabled_;
        private byte memoizedIsInitialized;
        private static final AutoUpdateConfigMessage DEFAULT_INSTANCE = new AutoUpdateConfigMessage();

        @Deprecated
        public static final Parser<AutoUpdateConfigMessage> PARSER = new AbstractParser<AutoUpdateConfigMessage>() { // from class: com.garmin.proto.generated.GDISoftwareUpdateStatus.AutoUpdateConfigMessage.1
            @Override // com.google.protobuf.Parser
            public AutoUpdateConfigMessage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AutoUpdateConfigMessage.newBuilder();
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

        private AutoUpdateConfigMessage(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.enabled_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AutoUpdateConfigMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigMessage_descriptor;
        }

        public static Builder newBuilder(AutoUpdateConfigMessage autoUpdateConfigMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(autoUpdateConfigMessage);
        }

        public static AutoUpdateConfigMessage parseDelimitedFrom(InputStream inputStream) {
            return (AutoUpdateConfigMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AutoUpdateConfigMessage parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AutoUpdateConfigMessage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AutoUpdateConfigMessage)) {
                return super.equals(obj);
            }
            AutoUpdateConfigMessage autoUpdateConfigMessage = (AutoUpdateConfigMessage) obj;
            if (hasEnabled() != autoUpdateConfigMessage.hasEnabled()) {
                return false;
            }
            return (!hasEnabled() || getEnabled() == autoUpdateConfigMessage.getEnabled()) && getUnknownFields().equals(autoUpdateConfigMessage.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.AutoUpdateConfigMessageOrBuilder
        public boolean getEnabled() {
            return this.enabled_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AutoUpdateConfigMessage> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.AutoUpdateConfigMessageOrBuilder
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
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(AutoUpdateConfigMessage.class, Builder.class);
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
            return new AutoUpdateConfigMessage();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AutoUpdateConfigMessageOrBuilder {
            private int bitField0_;
            private boolean enabled_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(AutoUpdateConfigMessage autoUpdateConfigMessage) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    autoUpdateConfigMessage.enabled_ = this.enabled_;
                } else {
                    i14 = 0;
                }
                autoUpdateConfigMessage.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigMessage_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AutoUpdateConfigMessage build() {
                AutoUpdateConfigMessage autoUpdateConfigMessageBuildPartial = buildPartial();
                if (autoUpdateConfigMessageBuildPartial.isInitialized()) {
                    return autoUpdateConfigMessageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) autoUpdateConfigMessageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AutoUpdateConfigMessage buildPartial() {
                AutoUpdateConfigMessage autoUpdateConfigMessage = new AutoUpdateConfigMessage(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(autoUpdateConfigMessage);
                }
                onBuilt();
                return autoUpdateConfigMessage;
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
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigMessage_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.AutoUpdateConfigMessageOrBuilder
            public boolean getEnabled() {
                return this.enabled_;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.AutoUpdateConfigMessageOrBuilder
            public boolean hasEnabled() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(AutoUpdateConfigMessage.class, Builder.class);
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
            public AutoUpdateConfigMessage getDefaultInstanceForType() {
                return AutoUpdateConfigMessage.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AutoUpdateConfigMessage) {
                    return mergeFrom((AutoUpdateConfigMessage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AutoUpdateConfigMessage autoUpdateConfigMessage) {
                if (autoUpdateConfigMessage == AutoUpdateConfigMessage.getDefaultInstance()) {
                    return this;
                }
                if (autoUpdateConfigMessage.hasEnabled()) {
                    setEnabled(autoUpdateConfigMessage.getEnabled());
                }
                mergeUnknownFields(autoUpdateConfigMessage.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AutoUpdateConfigMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AutoUpdateConfigMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AutoUpdateConfigMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AutoUpdateConfigMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ AutoUpdateConfigMessage(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static AutoUpdateConfigMessage parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private AutoUpdateConfigMessage() {
            this.enabled_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AutoUpdateConfigMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AutoUpdateConfigMessage parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AutoUpdateConfigMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AutoUpdateConfigMessage parseFrom(InputStream inputStream) {
            return (AutoUpdateConfigMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AutoUpdateConfigMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AutoUpdateConfigMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AutoUpdateConfigMessage parseFrom(CodedInputStream codedInputStream) {
            return (AutoUpdateConfigMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AutoUpdateConfigMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AutoUpdateConfigMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CheckForUpdatesRequest extends GeneratedMessageV3 implements CheckForUpdatesRequestOrBuilder {
        private static final CheckForUpdatesRequest DEFAULT_INSTANCE = new CheckForUpdatesRequest();

        @Deprecated
        public static final Parser<CheckForUpdatesRequest> PARSER = new AbstractParser<CheckForUpdatesRequest>() { // from class: com.garmin.proto.generated.GDISoftwareUpdateStatus.CheckForUpdatesRequest.1
            @Override // com.google.protobuf.Parser
            public CheckForUpdatesRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CheckForUpdatesRequest.newBuilder();
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

        private CheckForUpdatesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CheckForUpdatesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_CheckForUpdatesRequest_descriptor;
        }

        public static Builder newBuilder(CheckForUpdatesRequest checkForUpdatesRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(checkForUpdatesRequest);
        }

        public static CheckForUpdatesRequest parseDelimitedFrom(InputStream inputStream) {
            return (CheckForUpdatesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CheckForUpdatesRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CheckForUpdatesRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CheckForUpdatesRequest) {
                return getUnknownFields().equals(((CheckForUpdatesRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CheckForUpdatesRequest> getParserForType() {
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
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_CheckForUpdatesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CheckForUpdatesRequest.class, Builder.class);
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
            return new CheckForUpdatesRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CheckForUpdatesRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_CheckForUpdatesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CheckForUpdatesRequest build() {
                CheckForUpdatesRequest checkForUpdatesRequestBuildPartial = buildPartial();
                if (checkForUpdatesRequestBuildPartial.isInitialized()) {
                    return checkForUpdatesRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) checkForUpdatesRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CheckForUpdatesRequest buildPartial() {
                CheckForUpdatesRequest checkForUpdatesRequest = new CheckForUpdatesRequest(this);
                onBuilt();
                return checkForUpdatesRequest;
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
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_CheckForUpdatesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_CheckForUpdatesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CheckForUpdatesRequest.class, Builder.class);
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
            public CheckForUpdatesRequest getDefaultInstanceForType() {
                return CheckForUpdatesRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CheckForUpdatesRequest) {
                    return mergeFrom((CheckForUpdatesRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CheckForUpdatesRequest checkForUpdatesRequest) {
                if (checkForUpdatesRequest == CheckForUpdatesRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(checkForUpdatesRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CheckForUpdatesRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ CheckForUpdatesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CheckForUpdatesRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CheckForUpdatesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CheckForUpdatesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CheckForUpdatesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CheckForUpdatesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CheckForUpdatesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CheckForUpdatesRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CheckForUpdatesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CheckForUpdatesRequest parseFrom(InputStream inputStream) {
            return (CheckForUpdatesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CheckForUpdatesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CheckForUpdatesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CheckForUpdatesRequest parseFrom(CodedInputStream codedInputStream) {
            return (CheckForUpdatesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CheckForUpdatesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CheckForUpdatesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DownloadProgressNotification extends GeneratedMessageV3 implements DownloadProgressNotificationOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1028;
        public static final int PERCENT_COMPLETED_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int percentCompleted_;
        private static final DownloadProgressNotification DEFAULT_INSTANCE = new DownloadProgressNotification();

        @Deprecated
        public static final Parser<DownloadProgressNotification> PARSER = new AbstractParser<DownloadProgressNotification>() { // from class: com.garmin.proto.generated.GDISoftwareUpdateStatus.DownloadProgressNotification.1
            @Override // com.google.protobuf.Parser
            public DownloadProgressNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DownloadProgressNotification.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, DownloadProgressNotification> data = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, DownloadProgressNotification.class, getDefaultInstance());

        private DownloadProgressNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.percentCompleted_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DownloadProgressNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadProgressNotification_descriptor;
        }

        public static Builder newBuilder(DownloadProgressNotification downloadProgressNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(downloadProgressNotification);
        }

        public static DownloadProgressNotification parseDelimitedFrom(InputStream inputStream) {
            return (DownloadProgressNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DownloadProgressNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DownloadProgressNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DownloadProgressNotification)) {
                return super.equals(obj);
            }
            DownloadProgressNotification downloadProgressNotification = (DownloadProgressNotification) obj;
            if (hasPercentCompleted() != downloadProgressNotification.hasPercentCompleted()) {
                return false;
            }
            return (!hasPercentCompleted() || getPercentCompleted() == downloadProgressNotification.getPercentCompleted()) && getUnknownFields().equals(downloadProgressNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DownloadProgressNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.DownloadProgressNotificationOrBuilder
        public int getPercentCompleted() {
            return this.percentCompleted_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.percentCompleted_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.DownloadProgressNotificationOrBuilder
        public boolean hasPercentCompleted() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPercentCompleted()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPercentCompleted();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadProgressNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(DownloadProgressNotification.class, Builder.class);
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
            return new DownloadProgressNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.percentCompleted_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DownloadProgressNotificationOrBuilder {
            private int bitField0_;
            private int percentCompleted_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(DownloadProgressNotification downloadProgressNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    downloadProgressNotification.percentCompleted_ = this.percentCompleted_;
                } else {
                    i14 = 0;
                }
                downloadProgressNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadProgressNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DownloadProgressNotification build() {
                DownloadProgressNotification downloadProgressNotificationBuildPartial = buildPartial();
                if (downloadProgressNotificationBuildPartial.isInitialized()) {
                    return downloadProgressNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) downloadProgressNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DownloadProgressNotification buildPartial() {
                DownloadProgressNotification downloadProgressNotification = new DownloadProgressNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(downloadProgressNotification);
                }
                onBuilt();
                return downloadProgressNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.percentCompleted_ = 0;
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

            public Builder clearPercentCompleted() {
                this.bitField0_ &= -2;
                this.percentCompleted_ = 0;
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
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadProgressNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.DownloadProgressNotificationOrBuilder
            public int getPercentCompleted() {
                return this.percentCompleted_;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.DownloadProgressNotificationOrBuilder
            public boolean hasPercentCompleted() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadProgressNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(DownloadProgressNotification.class, Builder.class);
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
                                    this.percentCompleted_ = codedInputStream.readUInt32();
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

            public Builder setPercentCompleted(int i14) {
                this.percentCompleted_ = i14;
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
            public DownloadProgressNotification getDefaultInstanceForType() {
                return DownloadProgressNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DownloadProgressNotification) {
                    return mergeFrom((DownloadProgressNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DownloadProgressNotification downloadProgressNotification) {
                if (downloadProgressNotification == DownloadProgressNotification.getDefaultInstance()) {
                    return this;
                }
                if (downloadProgressNotification.hasPercentCompleted()) {
                    setPercentCompleted(downloadProgressNotification.getPercentCompleted());
                }
                mergeUnknownFields(downloadProgressNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DownloadProgressNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DownloadProgressNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DownloadProgressNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DownloadProgressNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DownloadProgressNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DownloadProgressNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DownloadProgressNotification() {
            this.percentCompleted_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DownloadProgressNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DownloadProgressNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DownloadProgressNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DownloadProgressNotification parseFrom(InputStream inputStream) {
            return (DownloadProgressNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DownloadProgressNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DownloadProgressNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DownloadProgressNotification parseFrom(CodedInputStream codedInputStream) {
            return (DownloadProgressNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DownloadProgressNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DownloadProgressNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DownloadReadyNotification extends GeneratedMessageV3 implements DownloadReadyNotificationOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1029;
        public static final int ESTIMATED_INSTALL_TIME_S_FIELD_NUMBER = 2;
        public static final int UPDATE_COUNT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int estimatedInstallTimeS_;
        private byte memoizedIsInitialized;
        private int updateCount_;
        private static final DownloadReadyNotification DEFAULT_INSTANCE = new DownloadReadyNotification();

        @Deprecated
        public static final Parser<DownloadReadyNotification> PARSER = new AbstractParser<DownloadReadyNotification>() { // from class: com.garmin.proto.generated.GDISoftwareUpdateStatus.DownloadReadyNotification.1
            @Override // com.google.protobuf.Parser
            public DownloadReadyNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DownloadReadyNotification.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, DownloadReadyNotification> data = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, DownloadReadyNotification.class, getDefaultInstance());

        private DownloadReadyNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.updateCount_ = 0;
            this.estimatedInstallTimeS_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DownloadReadyNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadReadyNotification_descriptor;
        }

        public static Builder newBuilder(DownloadReadyNotification downloadReadyNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(downloadReadyNotification);
        }

        public static DownloadReadyNotification parseDelimitedFrom(InputStream inputStream) {
            return (DownloadReadyNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DownloadReadyNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DownloadReadyNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DownloadReadyNotification)) {
                return super.equals(obj);
            }
            DownloadReadyNotification downloadReadyNotification = (DownloadReadyNotification) obj;
            if (hasUpdateCount() != downloadReadyNotification.hasUpdateCount()) {
                return false;
            }
            if ((!hasUpdateCount() || getUpdateCount() == downloadReadyNotification.getUpdateCount()) && hasEstimatedInstallTimeS() == downloadReadyNotification.hasEstimatedInstallTimeS()) {
                return (!hasEstimatedInstallTimeS() || getEstimatedInstallTimeS() == downloadReadyNotification.getEstimatedInstallTimeS()) && getUnknownFields().equals(downloadReadyNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.DownloadReadyNotificationOrBuilder
        public int getEstimatedInstallTimeS() {
            return this.estimatedInstallTimeS_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DownloadReadyNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.updateCount_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.estimatedInstallTimeS_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.DownloadReadyNotificationOrBuilder
        public int getUpdateCount() {
            return this.updateCount_;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.DownloadReadyNotificationOrBuilder
        public boolean hasEstimatedInstallTimeS() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.DownloadReadyNotificationOrBuilder
        public boolean hasUpdateCount() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUpdateCount()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getUpdateCount();
            }
            if (hasEstimatedInstallTimeS()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getEstimatedInstallTimeS();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadReadyNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(DownloadReadyNotification.class, Builder.class);
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
            return new DownloadReadyNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.updateCount_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.estimatedInstallTimeS_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DownloadReadyNotificationOrBuilder {
            private int bitField0_;
            private int estimatedInstallTimeS_;
            private int updateCount_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(DownloadReadyNotification downloadReadyNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    downloadReadyNotification.updateCount_ = this.updateCount_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    downloadReadyNotification.estimatedInstallTimeS_ = this.estimatedInstallTimeS_;
                    i14 |= 2;
                }
                downloadReadyNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadReadyNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DownloadReadyNotification build() {
                DownloadReadyNotification downloadReadyNotificationBuildPartial = buildPartial();
                if (downloadReadyNotificationBuildPartial.isInitialized()) {
                    return downloadReadyNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) downloadReadyNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DownloadReadyNotification buildPartial() {
                DownloadReadyNotification downloadReadyNotification = new DownloadReadyNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(downloadReadyNotification);
                }
                onBuilt();
                return downloadReadyNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.updateCount_ = 0;
                this.estimatedInstallTimeS_ = 0;
                return this;
            }

            public Builder clearEstimatedInstallTimeS() {
                this.bitField0_ &= -3;
                this.estimatedInstallTimeS_ = 0;
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

            public Builder clearUpdateCount() {
                this.bitField0_ &= -2;
                this.updateCount_ = 0;
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
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadReadyNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.DownloadReadyNotificationOrBuilder
            public int getEstimatedInstallTimeS() {
                return this.estimatedInstallTimeS_;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.DownloadReadyNotificationOrBuilder
            public int getUpdateCount() {
                return this.updateCount_;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.DownloadReadyNotificationOrBuilder
            public boolean hasEstimatedInstallTimeS() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.DownloadReadyNotificationOrBuilder
            public boolean hasUpdateCount() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadReadyNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(DownloadReadyNotification.class, Builder.class);
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
                                    this.updateCount_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.estimatedInstallTimeS_ = codedInputStream.readUInt32();
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

            public Builder setEstimatedInstallTimeS(int i14) {
                this.estimatedInstallTimeS_ = i14;
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

            public Builder setUpdateCount(int i14) {
                this.updateCount_ = i14;
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
            public DownloadReadyNotification getDefaultInstanceForType() {
                return DownloadReadyNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DownloadReadyNotification) {
                    return mergeFrom((DownloadReadyNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DownloadReadyNotification downloadReadyNotification) {
                if (downloadReadyNotification == DownloadReadyNotification.getDefaultInstance()) {
                    return this;
                }
                if (downloadReadyNotification.hasUpdateCount()) {
                    setUpdateCount(downloadReadyNotification.getUpdateCount());
                }
                if (downloadReadyNotification.hasEstimatedInstallTimeS()) {
                    setEstimatedInstallTimeS(downloadReadyNotification.getEstimatedInstallTimeS());
                }
                mergeUnknownFields(downloadReadyNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DownloadReadyNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DownloadReadyNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DownloadReadyNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DownloadReadyNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DownloadReadyNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DownloadReadyNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ DownloadReadyNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DownloadReadyNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private DownloadReadyNotification() {
            this.updateCount_ = 0;
            this.estimatedInstallTimeS_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DownloadReadyNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DownloadReadyNotification parseFrom(InputStream inputStream) {
            return (DownloadReadyNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DownloadReadyNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DownloadReadyNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DownloadReadyNotification parseFrom(CodedInputStream codedInputStream) {
            return (DownloadReadyNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DownloadReadyNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DownloadReadyNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DownloadUpdatesRequest extends GeneratedMessageV3 implements DownloadUpdatesRequestOrBuilder {
        private static final DownloadUpdatesRequest DEFAULT_INSTANCE = new DownloadUpdatesRequest();

        @Deprecated
        public static final Parser<DownloadUpdatesRequest> PARSER = new AbstractParser<DownloadUpdatesRequest>() { // from class: com.garmin.proto.generated.GDISoftwareUpdateStatus.DownloadUpdatesRequest.1
            @Override // com.google.protobuf.Parser
            public DownloadUpdatesRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DownloadUpdatesRequest.newBuilder();
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

        private DownloadUpdatesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DownloadUpdatesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadUpdatesRequest_descriptor;
        }

        public static Builder newBuilder(DownloadUpdatesRequest downloadUpdatesRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(downloadUpdatesRequest);
        }

        public static DownloadUpdatesRequest parseDelimitedFrom(InputStream inputStream) {
            return (DownloadUpdatesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DownloadUpdatesRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DownloadUpdatesRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof DownloadUpdatesRequest) {
                return getUnknownFields().equals(((DownloadUpdatesRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DownloadUpdatesRequest> getParserForType() {
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
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadUpdatesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DownloadUpdatesRequest.class, Builder.class);
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
            return new DownloadUpdatesRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DownloadUpdatesRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadUpdatesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DownloadUpdatesRequest build() {
                DownloadUpdatesRequest downloadUpdatesRequestBuildPartial = buildPartial();
                if (downloadUpdatesRequestBuildPartial.isInitialized()) {
                    return downloadUpdatesRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) downloadUpdatesRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DownloadUpdatesRequest buildPartial() {
                DownloadUpdatesRequest downloadUpdatesRequest = new DownloadUpdatesRequest(this);
                onBuilt();
                return downloadUpdatesRequest;
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
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadUpdatesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadUpdatesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DownloadUpdatesRequest.class, Builder.class);
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
            public DownloadUpdatesRequest getDefaultInstanceForType() {
                return DownloadUpdatesRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DownloadUpdatesRequest) {
                    return mergeFrom((DownloadUpdatesRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DownloadUpdatesRequest downloadUpdatesRequest) {
                if (downloadUpdatesRequest == DownloadUpdatesRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(downloadUpdatesRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DownloadUpdatesRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DownloadUpdatesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DownloadUpdatesRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DownloadUpdatesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DownloadUpdatesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DownloadUpdatesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DownloadUpdatesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DownloadUpdatesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DownloadUpdatesRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DownloadUpdatesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DownloadUpdatesRequest parseFrom(InputStream inputStream) {
            return (DownloadUpdatesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DownloadUpdatesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DownloadUpdatesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DownloadUpdatesRequest parseFrom(CodedInputStream codedInputStream) {
            return (DownloadUpdatesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DownloadUpdatesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DownloadUpdatesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DownloadUpdatesResponse extends GeneratedMessageV3 implements DownloadUpdatesResponseOrBuilder {
        public static final int DOWNLOAD_STARTED_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean downloadStarted_;
        private byte memoizedIsInitialized;
        private static final DownloadUpdatesResponse DEFAULT_INSTANCE = new DownloadUpdatesResponse();

        @Deprecated
        public static final Parser<DownloadUpdatesResponse> PARSER = new AbstractParser<DownloadUpdatesResponse>() { // from class: com.garmin.proto.generated.GDISoftwareUpdateStatus.DownloadUpdatesResponse.1
            @Override // com.google.protobuf.Parser
            public DownloadUpdatesResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DownloadUpdatesResponse.newBuilder();
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

        private DownloadUpdatesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.downloadStarted_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DownloadUpdatesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadUpdatesResponse_descriptor;
        }

        public static Builder newBuilder(DownloadUpdatesResponse downloadUpdatesResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(downloadUpdatesResponse);
        }

        public static DownloadUpdatesResponse parseDelimitedFrom(InputStream inputStream) {
            return (DownloadUpdatesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DownloadUpdatesResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DownloadUpdatesResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DownloadUpdatesResponse)) {
                return super.equals(obj);
            }
            DownloadUpdatesResponse downloadUpdatesResponse = (DownloadUpdatesResponse) obj;
            if (hasDownloadStarted() != downloadUpdatesResponse.hasDownloadStarted()) {
                return false;
            }
            return (!hasDownloadStarted() || getDownloadStarted() == downloadUpdatesResponse.getDownloadStarted()) && getUnknownFields().equals(downloadUpdatesResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.DownloadUpdatesResponseOrBuilder
        public boolean getDownloadStarted() {
            return this.downloadStarted_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DownloadUpdatesResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.downloadStarted_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.DownloadUpdatesResponseOrBuilder
        public boolean hasDownloadStarted() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDownloadStarted()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getDownloadStarted());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadUpdatesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DownloadUpdatesResponse.class, Builder.class);
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
            return new DownloadUpdatesResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.downloadStarted_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DownloadUpdatesResponseOrBuilder {
            private int bitField0_;
            private boolean downloadStarted_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(DownloadUpdatesResponse downloadUpdatesResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    downloadUpdatesResponse.downloadStarted_ = this.downloadStarted_;
                } else {
                    i14 = 0;
                }
                downloadUpdatesResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadUpdatesResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DownloadUpdatesResponse build() {
                DownloadUpdatesResponse downloadUpdatesResponseBuildPartial = buildPartial();
                if (downloadUpdatesResponseBuildPartial.isInitialized()) {
                    return downloadUpdatesResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) downloadUpdatesResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DownloadUpdatesResponse buildPartial() {
                DownloadUpdatesResponse downloadUpdatesResponse = new DownloadUpdatesResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(downloadUpdatesResponse);
                }
                onBuilt();
                return downloadUpdatesResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.downloadStarted_ = false;
                return this;
            }

            public Builder clearDownloadStarted() {
                this.bitField0_ &= -2;
                this.downloadStarted_ = false;
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
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadUpdatesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.DownloadUpdatesResponseOrBuilder
            public boolean getDownloadStarted() {
                return this.downloadStarted_;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.DownloadUpdatesResponseOrBuilder
            public boolean hasDownloadStarted() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_DownloadUpdatesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DownloadUpdatesResponse.class, Builder.class);
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
                                    this.downloadStarted_ = codedInputStream.readBool();
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

            public Builder setDownloadStarted(boolean z14) {
                this.downloadStarted_ = z14;
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
            public DownloadUpdatesResponse getDefaultInstanceForType() {
                return DownloadUpdatesResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DownloadUpdatesResponse) {
                    return mergeFrom((DownloadUpdatesResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DownloadUpdatesResponse downloadUpdatesResponse) {
                if (downloadUpdatesResponse == DownloadUpdatesResponse.getDefaultInstance()) {
                    return this;
                }
                if (downloadUpdatesResponse.hasDownloadStarted()) {
                    setDownloadStarted(downloadUpdatesResponse.getDownloadStarted());
                }
                mergeUnknownFields(downloadUpdatesResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DownloadUpdatesResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DownloadUpdatesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DownloadUpdatesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DownloadUpdatesResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DownloadUpdatesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DownloadUpdatesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DownloadUpdatesResponse() {
            this.downloadStarted_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DownloadUpdatesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DownloadUpdatesResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DownloadUpdatesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DownloadUpdatesResponse parseFrom(InputStream inputStream) {
            return (DownloadUpdatesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DownloadUpdatesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DownloadUpdatesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DownloadUpdatesResponse parseFrom(CodedInputStream codedInputStream) {
            return (DownloadUpdatesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DownloadUpdatesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DownloadUpdatesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class UpdateCompletedNotification extends GeneratedMessageV3 implements UpdateCompletedNotificationOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1030;
        public static final int NEW_VERSION_FIELD_NUMBER = 2;
        public static final int PREVIOUS_VERSION_FIELD_NUMBER = 1;
        public static final int UPDATED_PART_NUMBERS_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int newVersion_;
        private int previousVersion_;
        private int updatedPartNumbers_;
        private static final UpdateCompletedNotification DEFAULT_INSTANCE = new UpdateCompletedNotification();

        @Deprecated
        public static final Parser<UpdateCompletedNotification> PARSER = new AbstractParser<UpdateCompletedNotification>() { // from class: com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateCompletedNotification.1
            @Override // com.google.protobuf.Parser
            public UpdateCompletedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UpdateCompletedNotification.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, UpdateCompletedNotification> data = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, UpdateCompletedNotification.class, getDefaultInstance());

        private UpdateCompletedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.previousVersion_ = 0;
            this.newVersion_ = 0;
            this.updatedPartNumbers_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UpdateCompletedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateCompletedNotification_descriptor;
        }

        public static Builder newBuilder(UpdateCompletedNotification updateCompletedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(updateCompletedNotification);
        }

        public static UpdateCompletedNotification parseDelimitedFrom(InputStream inputStream) {
            return (UpdateCompletedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UpdateCompletedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UpdateCompletedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateCompletedNotification)) {
                return super.equals(obj);
            }
            UpdateCompletedNotification updateCompletedNotification = (UpdateCompletedNotification) obj;
            if (hasPreviousVersion() != updateCompletedNotification.hasPreviousVersion()) {
                return false;
            }
            if ((hasPreviousVersion() && getPreviousVersion() != updateCompletedNotification.getPreviousVersion()) || hasNewVersion() != updateCompletedNotification.hasNewVersion()) {
                return false;
            }
            if ((!hasNewVersion() || getNewVersion() == updateCompletedNotification.getNewVersion()) && hasUpdatedPartNumbers() == updateCompletedNotification.hasUpdatedPartNumbers()) {
                return (!hasUpdatedPartNumbers() || getUpdatedPartNumbers() == updateCompletedNotification.getUpdatedPartNumbers()) && getUnknownFields().equals(updateCompletedNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateCompletedNotificationOrBuilder
        public int getNewVersion() {
            return this.newVersion_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UpdateCompletedNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateCompletedNotificationOrBuilder
        public int getPreviousVersion() {
            return this.previousVersion_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.previousVersion_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.newVersion_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.updatedPartNumbers_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateCompletedNotificationOrBuilder
        public int getUpdatedPartNumbers() {
            return this.updatedPartNumbers_;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateCompletedNotificationOrBuilder
        public boolean hasNewVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateCompletedNotificationOrBuilder
        public boolean hasPreviousVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateCompletedNotificationOrBuilder
        public boolean hasUpdatedPartNumbers() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPreviousVersion()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPreviousVersion();
            }
            if (hasNewVersion()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getNewVersion();
            }
            if (hasUpdatedPartNumbers()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getUpdatedPartNumbers();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateCompletedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateCompletedNotification.class, Builder.class);
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
            return new UpdateCompletedNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.previousVersion_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.newVersion_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.updatedPartNumbers_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UpdateCompletedNotificationOrBuilder {
            private int bitField0_;
            private int newVersion_;
            private int previousVersion_;
            private int updatedPartNumbers_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(UpdateCompletedNotification updateCompletedNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    updateCompletedNotification.previousVersion_ = this.previousVersion_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    updateCompletedNotification.newVersion_ = this.newVersion_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    updateCompletedNotification.updatedPartNumbers_ = this.updatedPartNumbers_;
                    i14 |= 4;
                }
                updateCompletedNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateCompletedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateCompletedNotification build() {
                UpdateCompletedNotification updateCompletedNotificationBuildPartial = buildPartial();
                if (updateCompletedNotificationBuildPartial.isInitialized()) {
                    return updateCompletedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) updateCompletedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateCompletedNotification buildPartial() {
                UpdateCompletedNotification updateCompletedNotification = new UpdateCompletedNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(updateCompletedNotification);
                }
                onBuilt();
                return updateCompletedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.previousVersion_ = 0;
                this.newVersion_ = 0;
                this.updatedPartNumbers_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearNewVersion() {
                this.bitField0_ &= -3;
                this.newVersion_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPreviousVersion() {
                this.bitField0_ &= -2;
                this.previousVersion_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUpdatedPartNumbers() {
                this.bitField0_ &= -5;
                this.updatedPartNumbers_ = 0;
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
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateCompletedNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateCompletedNotificationOrBuilder
            public int getNewVersion() {
                return this.newVersion_;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateCompletedNotificationOrBuilder
            public int getPreviousVersion() {
                return this.previousVersion_;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateCompletedNotificationOrBuilder
            public int getUpdatedPartNumbers() {
                return this.updatedPartNumbers_;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateCompletedNotificationOrBuilder
            public boolean hasNewVersion() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateCompletedNotificationOrBuilder
            public boolean hasPreviousVersion() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateCompletedNotificationOrBuilder
            public boolean hasUpdatedPartNumbers() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateCompletedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateCompletedNotification.class, Builder.class);
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
                                    this.previousVersion_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.newVersion_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.updatedPartNumbers_ = codedInputStream.readUInt32();
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

            public Builder setNewVersion(int i14) {
                this.newVersion_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPreviousVersion(int i14) {
                this.previousVersion_ = i14;
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

            public Builder setUpdatedPartNumbers(int i14) {
                this.updatedPartNumbers_ = i14;
                this.bitField0_ |= 4;
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
            public UpdateCompletedNotification getDefaultInstanceForType() {
                return UpdateCompletedNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UpdateCompletedNotification) {
                    return mergeFrom((UpdateCompletedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UpdateCompletedNotification updateCompletedNotification) {
                if (updateCompletedNotification == UpdateCompletedNotification.getDefaultInstance()) {
                    return this;
                }
                if (updateCompletedNotification.hasPreviousVersion()) {
                    setPreviousVersion(updateCompletedNotification.getPreviousVersion());
                }
                if (updateCompletedNotification.hasNewVersion()) {
                    setNewVersion(updateCompletedNotification.getNewVersion());
                }
                if (updateCompletedNotification.hasUpdatedPartNumbers()) {
                    setUpdatedPartNumbers(updateCompletedNotification.getUpdatedPartNumbers());
                }
                mergeUnknownFields(updateCompletedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UpdateCompletedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UpdateCompletedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateCompletedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateCompletedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UpdateCompletedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UpdateCompletedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UpdateCompletedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UpdateCompletedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ UpdateCompletedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UpdateCompletedNotification parseFrom(InputStream inputStream) {
            return (UpdateCompletedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private UpdateCompletedNotification() {
            this.previousVersion_ = 0;
            this.newVersion_ = 0;
            this.updatedPartNumbers_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UpdateCompletedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateCompletedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateCompletedNotification parseFrom(CodedInputStream codedInputStream) {
            return (UpdateCompletedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UpdateCompletedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateCompletedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class UpdateStatusRequest extends GeneratedMessageV3 implements UpdateStatusRequestOrBuilder {
        private static final UpdateStatusRequest DEFAULT_INSTANCE = new UpdateStatusRequest();

        @Deprecated
        public static final Parser<UpdateStatusRequest> PARSER = new AbstractParser<UpdateStatusRequest>() { // from class: com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateStatusRequest.1
            @Override // com.google.protobuf.Parser
            public UpdateStatusRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UpdateStatusRequest.newBuilder();
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

        private UpdateStatusRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UpdateStatusRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateStatusRequest_descriptor;
        }

        public static Builder newBuilder(UpdateStatusRequest updateStatusRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(updateStatusRequest);
        }

        public static UpdateStatusRequest parseDelimitedFrom(InputStream inputStream) {
            return (UpdateStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UpdateStatusRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UpdateStatusRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof UpdateStatusRequest) {
                return getUnknownFields().equals(((UpdateStatusRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UpdateStatusRequest> getParserForType() {
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
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateStatusRequest.class, Builder.class);
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
            return new UpdateStatusRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UpdateStatusRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateStatusRequest build() {
                UpdateStatusRequest updateStatusRequestBuildPartial = buildPartial();
                if (updateStatusRequestBuildPartial.isInitialized()) {
                    return updateStatusRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) updateStatusRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateStatusRequest buildPartial() {
                UpdateStatusRequest updateStatusRequest = new UpdateStatusRequest(this);
                onBuilt();
                return updateStatusRequest;
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
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateStatusRequest.class, Builder.class);
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
            public UpdateStatusRequest getDefaultInstanceForType() {
                return UpdateStatusRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UpdateStatusRequest) {
                    return mergeFrom((UpdateStatusRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UpdateStatusRequest updateStatusRequest) {
                if (updateStatusRequest == UpdateStatusRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(updateStatusRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UpdateStatusRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ UpdateStatusRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private UpdateStatusRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UpdateStatusRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateStatusRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UpdateStatusRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UpdateStatusRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UpdateStatusRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UpdateStatusRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UpdateStatusRequest parseFrom(InputStream inputStream) {
            return (UpdateStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UpdateStatusRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateStatusRequest parseFrom(CodedInputStream codedInputStream) {
            return (UpdateStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UpdateStatusRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AutoUpdateConfigRequest extends GeneratedMessageV3 implements AutoUpdateConfigRequestOrBuilder {
        public static final int MSG_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private AutoUpdateConfigMessage msg_;
        private static final AutoUpdateConfigRequest DEFAULT_INSTANCE = new AutoUpdateConfigRequest();

        @Deprecated
        public static final Parser<AutoUpdateConfigRequest> PARSER = new AbstractParser<AutoUpdateConfigRequest>() { // from class: com.garmin.proto.generated.GDISoftwareUpdateStatus.AutoUpdateConfigRequest.1
            @Override // com.google.protobuf.Parser
            public AutoUpdateConfigRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AutoUpdateConfigRequest.newBuilder();
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

        private AutoUpdateConfigRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AutoUpdateConfigRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigRequest_descriptor;
        }

        public static Builder newBuilder(AutoUpdateConfigRequest autoUpdateConfigRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(autoUpdateConfigRequest);
        }

        public static AutoUpdateConfigRequest parseDelimitedFrom(InputStream inputStream) {
            return (AutoUpdateConfigRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AutoUpdateConfigRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AutoUpdateConfigRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AutoUpdateConfigRequest)) {
                return super.equals(obj);
            }
            AutoUpdateConfigRequest autoUpdateConfigRequest = (AutoUpdateConfigRequest) obj;
            if (hasMsg() != autoUpdateConfigRequest.hasMsg()) {
                return false;
            }
            return (!hasMsg() || getMsg().equals(autoUpdateConfigRequest.getMsg())) && getUnknownFields().equals(autoUpdateConfigRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.AutoUpdateConfigRequestOrBuilder
        public AutoUpdateConfigMessage getMsg() {
            AutoUpdateConfigMessage autoUpdateConfigMessage = this.msg_;
            return autoUpdateConfigMessage == null ? AutoUpdateConfigMessage.getDefaultInstance() : autoUpdateConfigMessage;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.AutoUpdateConfigRequestOrBuilder
        public AutoUpdateConfigMessageOrBuilder getMsgOrBuilder() {
            AutoUpdateConfigMessage autoUpdateConfigMessage = this.msg_;
            return autoUpdateConfigMessage == null ? AutoUpdateConfigMessage.getDefaultInstance() : autoUpdateConfigMessage;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AutoUpdateConfigRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getMsg()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.AutoUpdateConfigRequestOrBuilder
        public boolean hasMsg() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMsg()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getMsg().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AutoUpdateConfigRequest.class, Builder.class);
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
            return new AutoUpdateConfigRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getMsg());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AutoUpdateConfigRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<AutoUpdateConfigMessage, AutoUpdateConfigMessage.Builder, AutoUpdateConfigMessageOrBuilder> msgBuilder_;
            private AutoUpdateConfigMessage msg_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(AutoUpdateConfigRequest autoUpdateConfigRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<AutoUpdateConfigMessage, AutoUpdateConfigMessage.Builder, AutoUpdateConfigMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                    autoUpdateConfigRequest.msg_ = singleFieldBuilderV3 == null ? this.msg_ : (AutoUpdateConfigMessage) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                autoUpdateConfigRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigRequest_descriptor;
            }

            private SingleFieldBuilderV3<AutoUpdateConfigMessage, AutoUpdateConfigMessage.Builder, AutoUpdateConfigMessageOrBuilder> getMsgFieldBuilder() {
                if (this.msgBuilder_ == null) {
                    this.msgBuilder_ = new SingleFieldBuilderV3<>(getMsg(), getParentForChildren(), isClean());
                    this.msg_ = null;
                }
                return this.msgBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getMsgFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AutoUpdateConfigRequest build() {
                AutoUpdateConfigRequest autoUpdateConfigRequestBuildPartial = buildPartial();
                if (autoUpdateConfigRequestBuildPartial.isInitialized()) {
                    return autoUpdateConfigRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) autoUpdateConfigRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AutoUpdateConfigRequest buildPartial() {
                AutoUpdateConfigRequest autoUpdateConfigRequest = new AutoUpdateConfigRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(autoUpdateConfigRequest);
                }
                onBuilt();
                return autoUpdateConfigRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.msg_ = null;
                SingleFieldBuilderV3<AutoUpdateConfigMessage, AutoUpdateConfigMessage.Builder, AutoUpdateConfigMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.msgBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMsg() {
                this.bitField0_ &= -2;
                this.msg_ = null;
                SingleFieldBuilderV3<AutoUpdateConfigMessage, AutoUpdateConfigMessage.Builder, AutoUpdateConfigMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.msgBuilder_ = null;
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
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.AutoUpdateConfigRequestOrBuilder
            public AutoUpdateConfigMessage getMsg() {
                SingleFieldBuilderV3<AutoUpdateConfigMessage, AutoUpdateConfigMessage.Builder, AutoUpdateConfigMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AutoUpdateConfigMessage) singleFieldBuilderV3.getMessage();
                }
                AutoUpdateConfigMessage autoUpdateConfigMessage = this.msg_;
                return autoUpdateConfigMessage == null ? AutoUpdateConfigMessage.getDefaultInstance() : autoUpdateConfigMessage;
            }

            public AutoUpdateConfigMessage.Builder getMsgBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (AutoUpdateConfigMessage.Builder) getMsgFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.AutoUpdateConfigRequestOrBuilder
            public AutoUpdateConfigMessageOrBuilder getMsgOrBuilder() {
                SingleFieldBuilderV3<AutoUpdateConfigMessage, AutoUpdateConfigMessage.Builder, AutoUpdateConfigMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AutoUpdateConfigMessageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AutoUpdateConfigMessage autoUpdateConfigMessage = this.msg_;
                return autoUpdateConfigMessage == null ? AutoUpdateConfigMessage.getDefaultInstance() : autoUpdateConfigMessage;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.AutoUpdateConfigRequestOrBuilder
            public boolean hasMsg() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AutoUpdateConfigRequest.class, Builder.class);
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
                                    codedInputStream.readMessage(getMsgFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeMsg(AutoUpdateConfigMessage autoUpdateConfigMessage) {
                AutoUpdateConfigMessage autoUpdateConfigMessage2;
                SingleFieldBuilderV3<AutoUpdateConfigMessage, AutoUpdateConfigMessage.Builder, AutoUpdateConfigMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(autoUpdateConfigMessage);
                } else if ((this.bitField0_ & 1) == 0 || (autoUpdateConfigMessage2 = this.msg_) == null || autoUpdateConfigMessage2 == AutoUpdateConfigMessage.getDefaultInstance()) {
                    this.msg_ = autoUpdateConfigMessage;
                } else {
                    getMsgBuilder().mergeFrom(autoUpdateConfigMessage);
                }
                if (this.msg_ != null) {
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

            public Builder setMsg(AutoUpdateConfigMessage.Builder builder) {
                SingleFieldBuilderV3<AutoUpdateConfigMessage, AutoUpdateConfigMessage.Builder, AutoUpdateConfigMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.msg_ = builder.build();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AutoUpdateConfigRequest getDefaultInstanceForType() {
                return AutoUpdateConfigRequest.getDefaultInstance();
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

            public Builder setMsg(AutoUpdateConfigMessage autoUpdateConfigMessage) {
                SingleFieldBuilderV3<AutoUpdateConfigMessage, AutoUpdateConfigMessage.Builder, AutoUpdateConfigMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 == null) {
                    autoUpdateConfigMessage.getClass();
                    this.msg_ = autoUpdateConfigMessage;
                } else {
                    singleFieldBuilderV3.setMessage(autoUpdateConfigMessage);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AutoUpdateConfigRequest) {
                    return mergeFrom((AutoUpdateConfigRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AutoUpdateConfigRequest autoUpdateConfigRequest) {
                if (autoUpdateConfigRequest == AutoUpdateConfigRequest.getDefaultInstance()) {
                    return this;
                }
                if (autoUpdateConfigRequest.hasMsg()) {
                    mergeMsg(autoUpdateConfigRequest.getMsg());
                }
                mergeUnknownFields(autoUpdateConfigRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AutoUpdateConfigRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ AutoUpdateConfigRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private AutoUpdateConfigRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AutoUpdateConfigRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AutoUpdateConfigRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AutoUpdateConfigRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AutoUpdateConfigRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AutoUpdateConfigRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AutoUpdateConfigRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AutoUpdateConfigRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AutoUpdateConfigRequest parseFrom(InputStream inputStream) {
            return (AutoUpdateConfigRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AutoUpdateConfigRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AutoUpdateConfigRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AutoUpdateConfigRequest parseFrom(CodedInputStream codedInputStream) {
            return (AutoUpdateConfigRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AutoUpdateConfigRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AutoUpdateConfigRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AutoUpdateConfigResponse extends GeneratedMessageV3 implements AutoUpdateConfigResponseOrBuilder {
        public static final int MSG_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private AutoUpdateConfigMessage msg_;
        private static final AutoUpdateConfigResponse DEFAULT_INSTANCE = new AutoUpdateConfigResponse();

        @Deprecated
        public static final Parser<AutoUpdateConfigResponse> PARSER = new AbstractParser<AutoUpdateConfigResponse>() { // from class: com.garmin.proto.generated.GDISoftwareUpdateStatus.AutoUpdateConfigResponse.1
            @Override // com.google.protobuf.Parser
            public AutoUpdateConfigResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AutoUpdateConfigResponse.newBuilder();
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

        private AutoUpdateConfigResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AutoUpdateConfigResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigResponse_descriptor;
        }

        public static Builder newBuilder(AutoUpdateConfigResponse autoUpdateConfigResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(autoUpdateConfigResponse);
        }

        public static AutoUpdateConfigResponse parseDelimitedFrom(InputStream inputStream) {
            return (AutoUpdateConfigResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AutoUpdateConfigResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AutoUpdateConfigResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AutoUpdateConfigResponse)) {
                return super.equals(obj);
            }
            AutoUpdateConfigResponse autoUpdateConfigResponse = (AutoUpdateConfigResponse) obj;
            if (hasMsg() != autoUpdateConfigResponse.hasMsg()) {
                return false;
            }
            return (!hasMsg() || getMsg().equals(autoUpdateConfigResponse.getMsg())) && getUnknownFields().equals(autoUpdateConfigResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.AutoUpdateConfigResponseOrBuilder
        public AutoUpdateConfigMessage getMsg() {
            AutoUpdateConfigMessage autoUpdateConfigMessage = this.msg_;
            return autoUpdateConfigMessage == null ? AutoUpdateConfigMessage.getDefaultInstance() : autoUpdateConfigMessage;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.AutoUpdateConfigResponseOrBuilder
        public AutoUpdateConfigMessageOrBuilder getMsgOrBuilder() {
            AutoUpdateConfigMessage autoUpdateConfigMessage = this.msg_;
            return autoUpdateConfigMessage == null ? AutoUpdateConfigMessage.getDefaultInstance() : autoUpdateConfigMessage;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AutoUpdateConfigResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getMsg()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.AutoUpdateConfigResponseOrBuilder
        public boolean hasMsg() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMsg()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getMsg().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AutoUpdateConfigResponse.class, Builder.class);
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
            return new AutoUpdateConfigResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getMsg());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AutoUpdateConfigResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<AutoUpdateConfigMessage, AutoUpdateConfigMessage.Builder, AutoUpdateConfigMessageOrBuilder> msgBuilder_;
            private AutoUpdateConfigMessage msg_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(AutoUpdateConfigResponse autoUpdateConfigResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<AutoUpdateConfigMessage, AutoUpdateConfigMessage.Builder, AutoUpdateConfigMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                    autoUpdateConfigResponse.msg_ = singleFieldBuilderV3 == null ? this.msg_ : (AutoUpdateConfigMessage) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                autoUpdateConfigResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigResponse_descriptor;
            }

            private SingleFieldBuilderV3<AutoUpdateConfigMessage, AutoUpdateConfigMessage.Builder, AutoUpdateConfigMessageOrBuilder> getMsgFieldBuilder() {
                if (this.msgBuilder_ == null) {
                    this.msgBuilder_ = new SingleFieldBuilderV3<>(getMsg(), getParentForChildren(), isClean());
                    this.msg_ = null;
                }
                return this.msgBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getMsgFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AutoUpdateConfigResponse build() {
                AutoUpdateConfigResponse autoUpdateConfigResponseBuildPartial = buildPartial();
                if (autoUpdateConfigResponseBuildPartial.isInitialized()) {
                    return autoUpdateConfigResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) autoUpdateConfigResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AutoUpdateConfigResponse buildPartial() {
                AutoUpdateConfigResponse autoUpdateConfigResponse = new AutoUpdateConfigResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(autoUpdateConfigResponse);
                }
                onBuilt();
                return autoUpdateConfigResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.msg_ = null;
                SingleFieldBuilderV3<AutoUpdateConfigMessage, AutoUpdateConfigMessage.Builder, AutoUpdateConfigMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.msgBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMsg() {
                this.bitField0_ &= -2;
                this.msg_ = null;
                SingleFieldBuilderV3<AutoUpdateConfigMessage, AutoUpdateConfigMessage.Builder, AutoUpdateConfigMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.msgBuilder_ = null;
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
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.AutoUpdateConfigResponseOrBuilder
            public AutoUpdateConfigMessage getMsg() {
                SingleFieldBuilderV3<AutoUpdateConfigMessage, AutoUpdateConfigMessage.Builder, AutoUpdateConfigMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AutoUpdateConfigMessage) singleFieldBuilderV3.getMessage();
                }
                AutoUpdateConfigMessage autoUpdateConfigMessage = this.msg_;
                return autoUpdateConfigMessage == null ? AutoUpdateConfigMessage.getDefaultInstance() : autoUpdateConfigMessage;
            }

            public AutoUpdateConfigMessage.Builder getMsgBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (AutoUpdateConfigMessage.Builder) getMsgFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.AutoUpdateConfigResponseOrBuilder
            public AutoUpdateConfigMessageOrBuilder getMsgOrBuilder() {
                SingleFieldBuilderV3<AutoUpdateConfigMessage, AutoUpdateConfigMessage.Builder, AutoUpdateConfigMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AutoUpdateConfigMessageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AutoUpdateConfigMessage autoUpdateConfigMessage = this.msg_;
                return autoUpdateConfigMessage == null ? AutoUpdateConfigMessage.getDefaultInstance() : autoUpdateConfigMessage;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.AutoUpdateConfigResponseOrBuilder
            public boolean hasMsg() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_AutoUpdateConfigResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AutoUpdateConfigResponse.class, Builder.class);
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
                                    codedInputStream.readMessage(getMsgFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeMsg(AutoUpdateConfigMessage autoUpdateConfigMessage) {
                AutoUpdateConfigMessage autoUpdateConfigMessage2;
                SingleFieldBuilderV3<AutoUpdateConfigMessage, AutoUpdateConfigMessage.Builder, AutoUpdateConfigMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(autoUpdateConfigMessage);
                } else if ((this.bitField0_ & 1) == 0 || (autoUpdateConfigMessage2 = this.msg_) == null || autoUpdateConfigMessage2 == AutoUpdateConfigMessage.getDefaultInstance()) {
                    this.msg_ = autoUpdateConfigMessage;
                } else {
                    getMsgBuilder().mergeFrom(autoUpdateConfigMessage);
                }
                if (this.msg_ != null) {
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

            public Builder setMsg(AutoUpdateConfigMessage.Builder builder) {
                SingleFieldBuilderV3<AutoUpdateConfigMessage, AutoUpdateConfigMessage.Builder, AutoUpdateConfigMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.msg_ = builder.build();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AutoUpdateConfigResponse getDefaultInstanceForType() {
                return AutoUpdateConfigResponse.getDefaultInstance();
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

            public Builder setMsg(AutoUpdateConfigMessage autoUpdateConfigMessage) {
                SingleFieldBuilderV3<AutoUpdateConfigMessage, AutoUpdateConfigMessage.Builder, AutoUpdateConfigMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 == null) {
                    autoUpdateConfigMessage.getClass();
                    this.msg_ = autoUpdateConfigMessage;
                } else {
                    singleFieldBuilderV3.setMessage(autoUpdateConfigMessage);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AutoUpdateConfigResponse) {
                    return mergeFrom((AutoUpdateConfigResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AutoUpdateConfigResponse autoUpdateConfigResponse) {
                if (autoUpdateConfigResponse == AutoUpdateConfigResponse.getDefaultInstance()) {
                    return this;
                }
                if (autoUpdateConfigResponse.hasMsg()) {
                    mergeMsg(autoUpdateConfigResponse.getMsg());
                }
                mergeUnknownFields(autoUpdateConfigResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AutoUpdateConfigResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ AutoUpdateConfigResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private AutoUpdateConfigResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AutoUpdateConfigResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AutoUpdateConfigResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AutoUpdateConfigResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AutoUpdateConfigResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AutoUpdateConfigResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AutoUpdateConfigResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AutoUpdateConfigResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AutoUpdateConfigResponse parseFrom(InputStream inputStream) {
            return (AutoUpdateConfigResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AutoUpdateConfigResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AutoUpdateConfigResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AutoUpdateConfigResponse parseFrom(CodedInputStream codedInputStream) {
            return (AutoUpdateConfigResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AutoUpdateConfigResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AutoUpdateConfigResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CheckForUpdatesResponse extends GeneratedMessageV3 implements CheckForUpdatesResponseOrBuilder {
        private static final CheckForUpdatesResponse DEFAULT_INSTANCE = new CheckForUpdatesResponse();

        @Deprecated
        public static final Parser<CheckForUpdatesResponse> PARSER = new AbstractParser<CheckForUpdatesResponse>() { // from class: com.garmin.proto.generated.GDISoftwareUpdateStatus.CheckForUpdatesResponse.1
            @Override // com.google.protobuf.Parser
            public CheckForUpdatesResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CheckForUpdatesResponse.newBuilder();
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

        private CheckForUpdatesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CheckForUpdatesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_CheckForUpdatesResponse_descriptor;
        }

        public static Builder newBuilder(CheckForUpdatesResponse checkForUpdatesResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(checkForUpdatesResponse);
        }

        public static CheckForUpdatesResponse parseDelimitedFrom(InputStream inputStream) {
            return (CheckForUpdatesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CheckForUpdatesResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CheckForUpdatesResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CheckForUpdatesResponse)) {
                return super.equals(obj);
            }
            CheckForUpdatesResponse checkForUpdatesResponse = (CheckForUpdatesResponse) obj;
            if (hasStatus() != checkForUpdatesResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == checkForUpdatesResponse.status_) && getUnknownFields().equals(checkForUpdatesResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CheckForUpdatesResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.CheckForUpdatesResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.CheckForUpdatesResponseOrBuilder
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
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_CheckForUpdatesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CheckForUpdatesResponse.class, Builder.class);
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
            return new CheckForUpdatesResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CheckForUpdatesResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(CheckForUpdatesResponse checkForUpdatesResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    checkForUpdatesResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                checkForUpdatesResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_CheckForUpdatesResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CheckForUpdatesResponse build() {
                CheckForUpdatesResponse checkForUpdatesResponseBuildPartial = buildPartial();
                if (checkForUpdatesResponseBuildPartial.isInitialized()) {
                    return checkForUpdatesResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) checkForUpdatesResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CheckForUpdatesResponse buildPartial() {
                CheckForUpdatesResponse checkForUpdatesResponse = new CheckForUpdatesResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(checkForUpdatesResponse);
                }
                onBuilt();
                return checkForUpdatesResponse;
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
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_CheckForUpdatesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.CheckForUpdatesResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.CheckForUpdatesResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_CheckForUpdatesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CheckForUpdatesResponse.class, Builder.class);
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
            public CheckForUpdatesResponse getDefaultInstanceForType() {
                return CheckForUpdatesResponse.getDefaultInstance();
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
                if (message instanceof CheckForUpdatesResponse) {
                    return mergeFrom((CheckForUpdatesResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CheckForUpdatesResponse checkForUpdatesResponse) {
                if (checkForUpdatesResponse == CheckForUpdatesResponse.getDefaultInstance()) {
                    return this;
                }
                if (checkForUpdatesResponse.hasStatus()) {
                    setStatus(checkForUpdatesResponse.getStatus());
                }
                mergeUnknownFields(checkForUpdatesResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CheckForUpdatesResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CheckForUpdatesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CheckForUpdatesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CheckForUpdatesResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ CheckForUpdatesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CheckForUpdatesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CheckForUpdatesResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CheckForUpdatesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CheckForUpdatesResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CheckForUpdatesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CheckForUpdatesResponse parseFrom(InputStream inputStream) {
            return (CheckForUpdatesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CheckForUpdatesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CheckForUpdatesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CheckForUpdatesResponse parseFrom(CodedInputStream codedInputStream) {
            return (CheckForUpdatesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CheckForUpdatesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CheckForUpdatesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN(0),
            CHECKING(1),
            UPDATES_FOUND(2),
            UPDATES_NOT_FOUND(3);

            public static final int CHECKING_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            public static final int UPDATES_FOUND_VALUE = 2;
            public static final int UPDATES_NOT_FOUND_VALUE = 3;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDISoftwareUpdateStatus.CheckForUpdatesResponse.Status.1
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
                    return CHECKING;
                }
                if (i14 == 2) {
                    return UPDATES_FOUND;
                }
                if (i14 != 3) {
                    return null;
                }
                return UPDATES_NOT_FOUND;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CheckForUpdatesResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int ACKNOWLEDGE_COMPLETED_NOTIFICATION_FIELD_NUMBER = 12;
        public static final int APPLY_UPDATES_REQUEST_FIELD_NUMBER = 7;
        public static final int APPLY_UPDATES_RESPONSE_FIELD_NUMBER = 8;
        public static final int AUTO_UPDATE_CONFIG_REQUEST_FIELD_NUMBER = 13;
        public static final int AUTO_UPDATE_CONFIG_RESPONSE_FIELD_NUMBER = 14;
        public static final int CHECK_FOR_UPDATES_REQUEST_FIELD_NUMBER = 1;
        public static final int CHECK_FOR_UPDATES_RESPONSE_FIELD_NUMBER = 2;
        public static final int DOWNLOAD_PROGRESS_NOTIFICATION_FIELD_NUMBER = 5;
        public static final int DOWNLOAD_READY_NOTIFICATION_FIELD_NUMBER = 6;
        public static final int DOWNLOAD_UPDATES_REQUEST_FIELD_NUMBER = 3;
        public static final int DOWNLOAD_UPDATES_RESPONSE_FIELD_NUMBER = 4;
        public static final int UPDATE_COMPLETED_NOTIFICATION_FIELD_NUMBER = 11;
        public static final int UPDATE_STATUS_REQUEST_FIELD_NUMBER = 9;
        public static final int UPDATE_STATUS_RESPONSE_FIELD_NUMBER = 10;
        private static final long serialVersionUID = 0;
        private AcknowledgeCompletedNotification acknowledgeCompletedNotification_;
        private ApplyUpdatesRequest applyUpdatesRequest_;
        private ApplyUpdatesResponse applyUpdatesResponse_;
        private AutoUpdateConfigRequest autoUpdateConfigRequest_;
        private AutoUpdateConfigResponse autoUpdateConfigResponse_;
        private int bitField0_;
        private CheckForUpdatesRequest checkForUpdatesRequest_;
        private CheckForUpdatesResponse checkForUpdatesResponse_;
        private DownloadProgressNotification downloadProgressNotification_;
        private DownloadReadyNotification downloadReadyNotification_;
        private DownloadUpdatesRequest downloadUpdatesRequest_;
        private DownloadUpdatesResponse downloadUpdatesResponse_;
        private byte memoizedIsInitialized;
        private UpdateCompletedNotification updateCompletedNotification_;
        private UpdateStatusRequest updateStatusRequest_;
        private UpdateStatusResponse updateStatusResponse_;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDISoftwareUpdateStatus.Service.1
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
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_Service_descriptor;
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
            if (hasCheckForUpdatesRequest() != service.hasCheckForUpdatesRequest()) {
                return false;
            }
            if ((hasCheckForUpdatesRequest() && !getCheckForUpdatesRequest().equals(service.getCheckForUpdatesRequest())) || hasCheckForUpdatesResponse() != service.hasCheckForUpdatesResponse()) {
                return false;
            }
            if ((hasCheckForUpdatesResponse() && !getCheckForUpdatesResponse().equals(service.getCheckForUpdatesResponse())) || hasDownloadUpdatesRequest() != service.hasDownloadUpdatesRequest()) {
                return false;
            }
            if ((hasDownloadUpdatesRequest() && !getDownloadUpdatesRequest().equals(service.getDownloadUpdatesRequest())) || hasDownloadUpdatesResponse() != service.hasDownloadUpdatesResponse()) {
                return false;
            }
            if ((hasDownloadUpdatesResponse() && !getDownloadUpdatesResponse().equals(service.getDownloadUpdatesResponse())) || hasDownloadProgressNotification() != service.hasDownloadProgressNotification()) {
                return false;
            }
            if ((hasDownloadProgressNotification() && !getDownloadProgressNotification().equals(service.getDownloadProgressNotification())) || hasDownloadReadyNotification() != service.hasDownloadReadyNotification()) {
                return false;
            }
            if ((hasDownloadReadyNotification() && !getDownloadReadyNotification().equals(service.getDownloadReadyNotification())) || hasApplyUpdatesRequest() != service.hasApplyUpdatesRequest()) {
                return false;
            }
            if ((hasApplyUpdatesRequest() && !getApplyUpdatesRequest().equals(service.getApplyUpdatesRequest())) || hasApplyUpdatesResponse() != service.hasApplyUpdatesResponse()) {
                return false;
            }
            if ((hasApplyUpdatesResponse() && !getApplyUpdatesResponse().equals(service.getApplyUpdatesResponse())) || hasUpdateStatusRequest() != service.hasUpdateStatusRequest()) {
                return false;
            }
            if ((hasUpdateStatusRequest() && !getUpdateStatusRequest().equals(service.getUpdateStatusRequest())) || hasUpdateStatusResponse() != service.hasUpdateStatusResponse()) {
                return false;
            }
            if ((hasUpdateStatusResponse() && !getUpdateStatusResponse().equals(service.getUpdateStatusResponse())) || hasUpdateCompletedNotification() != service.hasUpdateCompletedNotification()) {
                return false;
            }
            if ((hasUpdateCompletedNotification() && !getUpdateCompletedNotification().equals(service.getUpdateCompletedNotification())) || hasAcknowledgeCompletedNotification() != service.hasAcknowledgeCompletedNotification()) {
                return false;
            }
            if ((hasAcknowledgeCompletedNotification() && !getAcknowledgeCompletedNotification().equals(service.getAcknowledgeCompletedNotification())) || hasAutoUpdateConfigRequest() != service.hasAutoUpdateConfigRequest()) {
                return false;
            }
            if ((!hasAutoUpdateConfigRequest() || getAutoUpdateConfigRequest().equals(service.getAutoUpdateConfigRequest())) && hasAutoUpdateConfigResponse() == service.hasAutoUpdateConfigResponse()) {
                return (!hasAutoUpdateConfigResponse() || getAutoUpdateConfigResponse().equals(service.getAutoUpdateConfigResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public AcknowledgeCompletedNotification getAcknowledgeCompletedNotification() {
            AcknowledgeCompletedNotification acknowledgeCompletedNotification = this.acknowledgeCompletedNotification_;
            return acknowledgeCompletedNotification == null ? AcknowledgeCompletedNotification.getDefaultInstance() : acknowledgeCompletedNotification;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public AcknowledgeCompletedNotificationOrBuilder getAcknowledgeCompletedNotificationOrBuilder() {
            AcknowledgeCompletedNotification acknowledgeCompletedNotification = this.acknowledgeCompletedNotification_;
            return acknowledgeCompletedNotification == null ? AcknowledgeCompletedNotification.getDefaultInstance() : acknowledgeCompletedNotification;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public ApplyUpdatesRequest getApplyUpdatesRequest() {
            ApplyUpdatesRequest applyUpdatesRequest = this.applyUpdatesRequest_;
            return applyUpdatesRequest == null ? ApplyUpdatesRequest.getDefaultInstance() : applyUpdatesRequest;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public ApplyUpdatesRequestOrBuilder getApplyUpdatesRequestOrBuilder() {
            ApplyUpdatesRequest applyUpdatesRequest = this.applyUpdatesRequest_;
            return applyUpdatesRequest == null ? ApplyUpdatesRequest.getDefaultInstance() : applyUpdatesRequest;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public ApplyUpdatesResponse getApplyUpdatesResponse() {
            ApplyUpdatesResponse applyUpdatesResponse = this.applyUpdatesResponse_;
            return applyUpdatesResponse == null ? ApplyUpdatesResponse.getDefaultInstance() : applyUpdatesResponse;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public ApplyUpdatesResponseOrBuilder getApplyUpdatesResponseOrBuilder() {
            ApplyUpdatesResponse applyUpdatesResponse = this.applyUpdatesResponse_;
            return applyUpdatesResponse == null ? ApplyUpdatesResponse.getDefaultInstance() : applyUpdatesResponse;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public AutoUpdateConfigRequest getAutoUpdateConfigRequest() {
            AutoUpdateConfigRequest autoUpdateConfigRequest = this.autoUpdateConfigRequest_;
            return autoUpdateConfigRequest == null ? AutoUpdateConfigRequest.getDefaultInstance() : autoUpdateConfigRequest;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public AutoUpdateConfigRequestOrBuilder getAutoUpdateConfigRequestOrBuilder() {
            AutoUpdateConfigRequest autoUpdateConfigRequest = this.autoUpdateConfigRequest_;
            return autoUpdateConfigRequest == null ? AutoUpdateConfigRequest.getDefaultInstance() : autoUpdateConfigRequest;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public AutoUpdateConfigResponse getAutoUpdateConfigResponse() {
            AutoUpdateConfigResponse autoUpdateConfigResponse = this.autoUpdateConfigResponse_;
            return autoUpdateConfigResponse == null ? AutoUpdateConfigResponse.getDefaultInstance() : autoUpdateConfigResponse;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public AutoUpdateConfigResponseOrBuilder getAutoUpdateConfigResponseOrBuilder() {
            AutoUpdateConfigResponse autoUpdateConfigResponse = this.autoUpdateConfigResponse_;
            return autoUpdateConfigResponse == null ? AutoUpdateConfigResponse.getDefaultInstance() : autoUpdateConfigResponse;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public CheckForUpdatesRequest getCheckForUpdatesRequest() {
            CheckForUpdatesRequest checkForUpdatesRequest = this.checkForUpdatesRequest_;
            return checkForUpdatesRequest == null ? CheckForUpdatesRequest.getDefaultInstance() : checkForUpdatesRequest;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public CheckForUpdatesRequestOrBuilder getCheckForUpdatesRequestOrBuilder() {
            CheckForUpdatesRequest checkForUpdatesRequest = this.checkForUpdatesRequest_;
            return checkForUpdatesRequest == null ? CheckForUpdatesRequest.getDefaultInstance() : checkForUpdatesRequest;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public CheckForUpdatesResponse getCheckForUpdatesResponse() {
            CheckForUpdatesResponse checkForUpdatesResponse = this.checkForUpdatesResponse_;
            return checkForUpdatesResponse == null ? CheckForUpdatesResponse.getDefaultInstance() : checkForUpdatesResponse;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public CheckForUpdatesResponseOrBuilder getCheckForUpdatesResponseOrBuilder() {
            CheckForUpdatesResponse checkForUpdatesResponse = this.checkForUpdatesResponse_;
            return checkForUpdatesResponse == null ? CheckForUpdatesResponse.getDefaultInstance() : checkForUpdatesResponse;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public DownloadProgressNotification getDownloadProgressNotification() {
            DownloadProgressNotification downloadProgressNotification = this.downloadProgressNotification_;
            return downloadProgressNotification == null ? DownloadProgressNotification.getDefaultInstance() : downloadProgressNotification;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public DownloadProgressNotificationOrBuilder getDownloadProgressNotificationOrBuilder() {
            DownloadProgressNotification downloadProgressNotification = this.downloadProgressNotification_;
            return downloadProgressNotification == null ? DownloadProgressNotification.getDefaultInstance() : downloadProgressNotification;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public DownloadReadyNotification getDownloadReadyNotification() {
            DownloadReadyNotification downloadReadyNotification = this.downloadReadyNotification_;
            return downloadReadyNotification == null ? DownloadReadyNotification.getDefaultInstance() : downloadReadyNotification;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public DownloadReadyNotificationOrBuilder getDownloadReadyNotificationOrBuilder() {
            DownloadReadyNotification downloadReadyNotification = this.downloadReadyNotification_;
            return downloadReadyNotification == null ? DownloadReadyNotification.getDefaultInstance() : downloadReadyNotification;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public DownloadUpdatesRequest getDownloadUpdatesRequest() {
            DownloadUpdatesRequest downloadUpdatesRequest = this.downloadUpdatesRequest_;
            return downloadUpdatesRequest == null ? DownloadUpdatesRequest.getDefaultInstance() : downloadUpdatesRequest;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public DownloadUpdatesRequestOrBuilder getDownloadUpdatesRequestOrBuilder() {
            DownloadUpdatesRequest downloadUpdatesRequest = this.downloadUpdatesRequest_;
            return downloadUpdatesRequest == null ? DownloadUpdatesRequest.getDefaultInstance() : downloadUpdatesRequest;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public DownloadUpdatesResponse getDownloadUpdatesResponse() {
            DownloadUpdatesResponse downloadUpdatesResponse = this.downloadUpdatesResponse_;
            return downloadUpdatesResponse == null ? DownloadUpdatesResponse.getDefaultInstance() : downloadUpdatesResponse;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public DownloadUpdatesResponseOrBuilder getDownloadUpdatesResponseOrBuilder() {
            DownloadUpdatesResponse downloadUpdatesResponse = this.downloadUpdatesResponse_;
            return downloadUpdatesResponse == null ? DownloadUpdatesResponse.getDefaultInstance() : downloadUpdatesResponse;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCheckForUpdatesRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getCheckForUpdatesResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getDownloadUpdatesRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getDownloadUpdatesResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getDownloadProgressNotification());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getDownloadReadyNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getApplyUpdatesRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getApplyUpdatesResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getUpdateStatusRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getUpdateStatusResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getUpdateCompletedNotification());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getAcknowledgeCompletedNotification());
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, getAutoUpdateConfigRequest());
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(14, getAutoUpdateConfigResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public UpdateCompletedNotification getUpdateCompletedNotification() {
            UpdateCompletedNotification updateCompletedNotification = this.updateCompletedNotification_;
            return updateCompletedNotification == null ? UpdateCompletedNotification.getDefaultInstance() : updateCompletedNotification;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public UpdateCompletedNotificationOrBuilder getUpdateCompletedNotificationOrBuilder() {
            UpdateCompletedNotification updateCompletedNotification = this.updateCompletedNotification_;
            return updateCompletedNotification == null ? UpdateCompletedNotification.getDefaultInstance() : updateCompletedNotification;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public UpdateStatusRequest getUpdateStatusRequest() {
            UpdateStatusRequest updateStatusRequest = this.updateStatusRequest_;
            return updateStatusRequest == null ? UpdateStatusRequest.getDefaultInstance() : updateStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public UpdateStatusRequestOrBuilder getUpdateStatusRequestOrBuilder() {
            UpdateStatusRequest updateStatusRequest = this.updateStatusRequest_;
            return updateStatusRequest == null ? UpdateStatusRequest.getDefaultInstance() : updateStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public UpdateStatusResponse getUpdateStatusResponse() {
            UpdateStatusResponse updateStatusResponse = this.updateStatusResponse_;
            return updateStatusResponse == null ? UpdateStatusResponse.getDefaultInstance() : updateStatusResponse;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public UpdateStatusResponseOrBuilder getUpdateStatusResponseOrBuilder() {
            UpdateStatusResponse updateStatusResponse = this.updateStatusResponse_;
            return updateStatusResponse == null ? UpdateStatusResponse.getDefaultInstance() : updateStatusResponse;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public boolean hasAcknowledgeCompletedNotification() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public boolean hasApplyUpdatesRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public boolean hasApplyUpdatesResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public boolean hasAutoUpdateConfigRequest() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public boolean hasAutoUpdateConfigResponse() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public boolean hasCheckForUpdatesRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public boolean hasCheckForUpdatesResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public boolean hasDownloadProgressNotification() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public boolean hasDownloadReadyNotification() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public boolean hasDownloadUpdatesRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public boolean hasDownloadUpdatesResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public boolean hasUpdateCompletedNotification() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public boolean hasUpdateStatusRequest() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
        public boolean hasUpdateStatusResponse() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCheckForUpdatesRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCheckForUpdatesRequest().hashCode();
            }
            if (hasCheckForUpdatesResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getCheckForUpdatesResponse().hashCode();
            }
            if (hasDownloadUpdatesRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getDownloadUpdatesRequest().hashCode();
            }
            if (hasDownloadUpdatesResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getDownloadUpdatesResponse().hashCode();
            }
            if (hasDownloadProgressNotification()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getDownloadProgressNotification().hashCode();
            }
            if (hasDownloadReadyNotification()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getDownloadReadyNotification().hashCode();
            }
            if (hasApplyUpdatesRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getApplyUpdatesRequest().hashCode();
            }
            if (hasApplyUpdatesResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getApplyUpdatesResponse().hashCode();
            }
            if (hasUpdateStatusRequest()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getUpdateStatusRequest().hashCode();
            }
            if (hasUpdateStatusResponse()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getUpdateStatusResponse().hashCode();
            }
            if (hasUpdateCompletedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getUpdateCompletedNotification().hashCode();
            }
            if (hasAcknowledgeCompletedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getAcknowledgeCompletedNotification().hashCode();
            }
            if (hasAutoUpdateConfigRequest()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getAutoUpdateConfigRequest().hashCode();
            }
            if (hasAutoUpdateConfigResponse()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + getAutoUpdateConfigResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getCheckForUpdatesRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getCheckForUpdatesResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getDownloadUpdatesRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getDownloadUpdatesResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getDownloadProgressNotification());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getDownloadReadyNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getApplyUpdatesRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getApplyUpdatesResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getUpdateStatusRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getUpdateStatusResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getUpdateCompletedNotification());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(12, getAcknowledgeCompletedNotification());
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeMessage(13, getAutoUpdateConfigRequest());
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeMessage(14, getAutoUpdateConfigResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private SingleFieldBuilderV3<AcknowledgeCompletedNotification, AcknowledgeCompletedNotification.Builder, AcknowledgeCompletedNotificationOrBuilder> acknowledgeCompletedNotificationBuilder_;
            private AcknowledgeCompletedNotification acknowledgeCompletedNotification_;
            private SingleFieldBuilderV3<ApplyUpdatesRequest, ApplyUpdatesRequest.Builder, ApplyUpdatesRequestOrBuilder> applyUpdatesRequestBuilder_;
            private ApplyUpdatesRequest applyUpdatesRequest_;
            private SingleFieldBuilderV3<ApplyUpdatesResponse, ApplyUpdatesResponse.Builder, ApplyUpdatesResponseOrBuilder> applyUpdatesResponseBuilder_;
            private ApplyUpdatesResponse applyUpdatesResponse_;
            private SingleFieldBuilderV3<AutoUpdateConfigRequest, AutoUpdateConfigRequest.Builder, AutoUpdateConfigRequestOrBuilder> autoUpdateConfigRequestBuilder_;
            private AutoUpdateConfigRequest autoUpdateConfigRequest_;
            private SingleFieldBuilderV3<AutoUpdateConfigResponse, AutoUpdateConfigResponse.Builder, AutoUpdateConfigResponseOrBuilder> autoUpdateConfigResponseBuilder_;
            private AutoUpdateConfigResponse autoUpdateConfigResponse_;
            private int bitField0_;
            private SingleFieldBuilderV3<CheckForUpdatesRequest, CheckForUpdatesRequest.Builder, CheckForUpdatesRequestOrBuilder> checkForUpdatesRequestBuilder_;
            private CheckForUpdatesRequest checkForUpdatesRequest_;
            private SingleFieldBuilderV3<CheckForUpdatesResponse, CheckForUpdatesResponse.Builder, CheckForUpdatesResponseOrBuilder> checkForUpdatesResponseBuilder_;
            private CheckForUpdatesResponse checkForUpdatesResponse_;
            private SingleFieldBuilderV3<DownloadProgressNotification, DownloadProgressNotification.Builder, DownloadProgressNotificationOrBuilder> downloadProgressNotificationBuilder_;
            private DownloadProgressNotification downloadProgressNotification_;
            private SingleFieldBuilderV3<DownloadReadyNotification, DownloadReadyNotification.Builder, DownloadReadyNotificationOrBuilder> downloadReadyNotificationBuilder_;
            private DownloadReadyNotification downloadReadyNotification_;
            private SingleFieldBuilderV3<DownloadUpdatesRequest, DownloadUpdatesRequest.Builder, DownloadUpdatesRequestOrBuilder> downloadUpdatesRequestBuilder_;
            private DownloadUpdatesRequest downloadUpdatesRequest_;
            private SingleFieldBuilderV3<DownloadUpdatesResponse, DownloadUpdatesResponse.Builder, DownloadUpdatesResponseOrBuilder> downloadUpdatesResponseBuilder_;
            private DownloadUpdatesResponse downloadUpdatesResponse_;
            private SingleFieldBuilderV3<UpdateCompletedNotification, UpdateCompletedNotification.Builder, UpdateCompletedNotificationOrBuilder> updateCompletedNotificationBuilder_;
            private UpdateCompletedNotification updateCompletedNotification_;
            private SingleFieldBuilderV3<UpdateStatusRequest, UpdateStatusRequest.Builder, UpdateStatusRequestOrBuilder> updateStatusRequestBuilder_;
            private UpdateStatusRequest updateStatusRequest_;
            private SingleFieldBuilderV3<UpdateStatusResponse, UpdateStatusResponse.Builder, UpdateStatusResponseOrBuilder> updateStatusResponseBuilder_;
            private UpdateStatusResponse updateStatusResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<CheckForUpdatesRequest, CheckForUpdatesRequest.Builder, CheckForUpdatesRequestOrBuilder> singleFieldBuilderV3 = this.checkForUpdatesRequestBuilder_;
                    service.checkForUpdatesRequest_ = singleFieldBuilderV3 == null ? this.checkForUpdatesRequest_ : (CheckForUpdatesRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<CheckForUpdatesResponse, CheckForUpdatesResponse.Builder, CheckForUpdatesResponseOrBuilder> singleFieldBuilderV4 = this.checkForUpdatesResponseBuilder_;
                    service.checkForUpdatesResponse_ = singleFieldBuilderV4 == null ? this.checkForUpdatesResponse_ : (CheckForUpdatesResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<DownloadUpdatesRequest, DownloadUpdatesRequest.Builder, DownloadUpdatesRequestOrBuilder> singleFieldBuilderV5 = this.downloadUpdatesRequestBuilder_;
                    service.downloadUpdatesRequest_ = singleFieldBuilderV5 == null ? this.downloadUpdatesRequest_ : (DownloadUpdatesRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<DownloadUpdatesResponse, DownloadUpdatesResponse.Builder, DownloadUpdatesResponseOrBuilder> singleFieldBuilderV6 = this.downloadUpdatesResponseBuilder_;
                    service.downloadUpdatesResponse_ = singleFieldBuilderV6 == null ? this.downloadUpdatesResponse_ : (DownloadUpdatesResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<DownloadProgressNotification, DownloadProgressNotification.Builder, DownloadProgressNotificationOrBuilder> singleFieldBuilderV7 = this.downloadProgressNotificationBuilder_;
                    service.downloadProgressNotification_ = singleFieldBuilderV7 == null ? this.downloadProgressNotification_ : (DownloadProgressNotification) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<DownloadReadyNotification, DownloadReadyNotification.Builder, DownloadReadyNotificationOrBuilder> singleFieldBuilderV8 = this.downloadReadyNotificationBuilder_;
                    service.downloadReadyNotification_ = singleFieldBuilderV8 == null ? this.downloadReadyNotification_ : (DownloadReadyNotification) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<ApplyUpdatesRequest, ApplyUpdatesRequest.Builder, ApplyUpdatesRequestOrBuilder> singleFieldBuilderV9 = this.applyUpdatesRequestBuilder_;
                    service.applyUpdatesRequest_ = singleFieldBuilderV9 == null ? this.applyUpdatesRequest_ : (ApplyUpdatesRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<ApplyUpdatesResponse, ApplyUpdatesResponse.Builder, ApplyUpdatesResponseOrBuilder> singleFieldBuilderV10 = this.applyUpdatesResponseBuilder_;
                    service.applyUpdatesResponse_ = singleFieldBuilderV10 == null ? this.applyUpdatesResponse_ : (ApplyUpdatesResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<UpdateStatusRequest, UpdateStatusRequest.Builder, UpdateStatusRequestOrBuilder> singleFieldBuilderV11 = this.updateStatusRequestBuilder_;
                    service.updateStatusRequest_ = singleFieldBuilderV11 == null ? this.updateStatusRequest_ : (UpdateStatusRequest) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<UpdateStatusResponse, UpdateStatusResponse.Builder, UpdateStatusResponseOrBuilder> singleFieldBuilderV12 = this.updateStatusResponseBuilder_;
                    service.updateStatusResponse_ = singleFieldBuilderV12 == null ? this.updateStatusResponse_ : (UpdateStatusResponse) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<UpdateCompletedNotification, UpdateCompletedNotification.Builder, UpdateCompletedNotificationOrBuilder> singleFieldBuilderV13 = this.updateCompletedNotificationBuilder_;
                    service.updateCompletedNotification_ = singleFieldBuilderV13 == null ? this.updateCompletedNotification_ : (UpdateCompletedNotification) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<AcknowledgeCompletedNotification, AcknowledgeCompletedNotification.Builder, AcknowledgeCompletedNotificationOrBuilder> singleFieldBuilderV14 = this.acknowledgeCompletedNotificationBuilder_;
                    service.acknowledgeCompletedNotification_ = singleFieldBuilderV14 == null ? this.acknowledgeCompletedNotification_ : (AcknowledgeCompletedNotification) singleFieldBuilderV14.build();
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    SingleFieldBuilderV3<AutoUpdateConfigRequest, AutoUpdateConfigRequest.Builder, AutoUpdateConfigRequestOrBuilder> singleFieldBuilderV15 = this.autoUpdateConfigRequestBuilder_;
                    service.autoUpdateConfigRequest_ = singleFieldBuilderV15 == null ? this.autoUpdateConfigRequest_ : (AutoUpdateConfigRequest) singleFieldBuilderV15.build();
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    SingleFieldBuilderV3<AutoUpdateConfigResponse, AutoUpdateConfigResponse.Builder, AutoUpdateConfigResponseOrBuilder> singleFieldBuilderV16 = this.autoUpdateConfigResponseBuilder_;
                    service.autoUpdateConfigResponse_ = singleFieldBuilderV16 == null ? this.autoUpdateConfigResponse_ : (AutoUpdateConfigResponse) singleFieldBuilderV16.build();
                    i14 |= 8192;
                }
                service.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<AcknowledgeCompletedNotification, AcknowledgeCompletedNotification.Builder, AcknowledgeCompletedNotificationOrBuilder> getAcknowledgeCompletedNotificationFieldBuilder() {
                if (this.acknowledgeCompletedNotificationBuilder_ == null) {
                    this.acknowledgeCompletedNotificationBuilder_ = new SingleFieldBuilderV3<>(getAcknowledgeCompletedNotification(), getParentForChildren(), isClean());
                    this.acknowledgeCompletedNotification_ = null;
                }
                return this.acknowledgeCompletedNotificationBuilder_;
            }

            private SingleFieldBuilderV3<ApplyUpdatesRequest, ApplyUpdatesRequest.Builder, ApplyUpdatesRequestOrBuilder> getApplyUpdatesRequestFieldBuilder() {
                if (this.applyUpdatesRequestBuilder_ == null) {
                    this.applyUpdatesRequestBuilder_ = new SingleFieldBuilderV3<>(getApplyUpdatesRequest(), getParentForChildren(), isClean());
                    this.applyUpdatesRequest_ = null;
                }
                return this.applyUpdatesRequestBuilder_;
            }

            private SingleFieldBuilderV3<ApplyUpdatesResponse, ApplyUpdatesResponse.Builder, ApplyUpdatesResponseOrBuilder> getApplyUpdatesResponseFieldBuilder() {
                if (this.applyUpdatesResponseBuilder_ == null) {
                    this.applyUpdatesResponseBuilder_ = new SingleFieldBuilderV3<>(getApplyUpdatesResponse(), getParentForChildren(), isClean());
                    this.applyUpdatesResponse_ = null;
                }
                return this.applyUpdatesResponseBuilder_;
            }

            private SingleFieldBuilderV3<AutoUpdateConfigRequest, AutoUpdateConfigRequest.Builder, AutoUpdateConfigRequestOrBuilder> getAutoUpdateConfigRequestFieldBuilder() {
                if (this.autoUpdateConfigRequestBuilder_ == null) {
                    this.autoUpdateConfigRequestBuilder_ = new SingleFieldBuilderV3<>(getAutoUpdateConfigRequest(), getParentForChildren(), isClean());
                    this.autoUpdateConfigRequest_ = null;
                }
                return this.autoUpdateConfigRequestBuilder_;
            }

            private SingleFieldBuilderV3<AutoUpdateConfigResponse, AutoUpdateConfigResponse.Builder, AutoUpdateConfigResponseOrBuilder> getAutoUpdateConfigResponseFieldBuilder() {
                if (this.autoUpdateConfigResponseBuilder_ == null) {
                    this.autoUpdateConfigResponseBuilder_ = new SingleFieldBuilderV3<>(getAutoUpdateConfigResponse(), getParentForChildren(), isClean());
                    this.autoUpdateConfigResponse_ = null;
                }
                return this.autoUpdateConfigResponseBuilder_;
            }

            private SingleFieldBuilderV3<CheckForUpdatesRequest, CheckForUpdatesRequest.Builder, CheckForUpdatesRequestOrBuilder> getCheckForUpdatesRequestFieldBuilder() {
                if (this.checkForUpdatesRequestBuilder_ == null) {
                    this.checkForUpdatesRequestBuilder_ = new SingleFieldBuilderV3<>(getCheckForUpdatesRequest(), getParentForChildren(), isClean());
                    this.checkForUpdatesRequest_ = null;
                }
                return this.checkForUpdatesRequestBuilder_;
            }

            private SingleFieldBuilderV3<CheckForUpdatesResponse, CheckForUpdatesResponse.Builder, CheckForUpdatesResponseOrBuilder> getCheckForUpdatesResponseFieldBuilder() {
                if (this.checkForUpdatesResponseBuilder_ == null) {
                    this.checkForUpdatesResponseBuilder_ = new SingleFieldBuilderV3<>(getCheckForUpdatesResponse(), getParentForChildren(), isClean());
                    this.checkForUpdatesResponse_ = null;
                }
                return this.checkForUpdatesResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_Service_descriptor;
            }

            private SingleFieldBuilderV3<DownloadProgressNotification, DownloadProgressNotification.Builder, DownloadProgressNotificationOrBuilder> getDownloadProgressNotificationFieldBuilder() {
                if (this.downloadProgressNotificationBuilder_ == null) {
                    this.downloadProgressNotificationBuilder_ = new SingleFieldBuilderV3<>(getDownloadProgressNotification(), getParentForChildren(), isClean());
                    this.downloadProgressNotification_ = null;
                }
                return this.downloadProgressNotificationBuilder_;
            }

            private SingleFieldBuilderV3<DownloadReadyNotification, DownloadReadyNotification.Builder, DownloadReadyNotificationOrBuilder> getDownloadReadyNotificationFieldBuilder() {
                if (this.downloadReadyNotificationBuilder_ == null) {
                    this.downloadReadyNotificationBuilder_ = new SingleFieldBuilderV3<>(getDownloadReadyNotification(), getParentForChildren(), isClean());
                    this.downloadReadyNotification_ = null;
                }
                return this.downloadReadyNotificationBuilder_;
            }

            private SingleFieldBuilderV3<DownloadUpdatesRequest, DownloadUpdatesRequest.Builder, DownloadUpdatesRequestOrBuilder> getDownloadUpdatesRequestFieldBuilder() {
                if (this.downloadUpdatesRequestBuilder_ == null) {
                    this.downloadUpdatesRequestBuilder_ = new SingleFieldBuilderV3<>(getDownloadUpdatesRequest(), getParentForChildren(), isClean());
                    this.downloadUpdatesRequest_ = null;
                }
                return this.downloadUpdatesRequestBuilder_;
            }

            private SingleFieldBuilderV3<DownloadUpdatesResponse, DownloadUpdatesResponse.Builder, DownloadUpdatesResponseOrBuilder> getDownloadUpdatesResponseFieldBuilder() {
                if (this.downloadUpdatesResponseBuilder_ == null) {
                    this.downloadUpdatesResponseBuilder_ = new SingleFieldBuilderV3<>(getDownloadUpdatesResponse(), getParentForChildren(), isClean());
                    this.downloadUpdatesResponse_ = null;
                }
                return this.downloadUpdatesResponseBuilder_;
            }

            private SingleFieldBuilderV3<UpdateCompletedNotification, UpdateCompletedNotification.Builder, UpdateCompletedNotificationOrBuilder> getUpdateCompletedNotificationFieldBuilder() {
                if (this.updateCompletedNotificationBuilder_ == null) {
                    this.updateCompletedNotificationBuilder_ = new SingleFieldBuilderV3<>(getUpdateCompletedNotification(), getParentForChildren(), isClean());
                    this.updateCompletedNotification_ = null;
                }
                return this.updateCompletedNotificationBuilder_;
            }

            private SingleFieldBuilderV3<UpdateStatusRequest, UpdateStatusRequest.Builder, UpdateStatusRequestOrBuilder> getUpdateStatusRequestFieldBuilder() {
                if (this.updateStatusRequestBuilder_ == null) {
                    this.updateStatusRequestBuilder_ = new SingleFieldBuilderV3<>(getUpdateStatusRequest(), getParentForChildren(), isClean());
                    this.updateStatusRequest_ = null;
                }
                return this.updateStatusRequestBuilder_;
            }

            private SingleFieldBuilderV3<UpdateStatusResponse, UpdateStatusResponse.Builder, UpdateStatusResponseOrBuilder> getUpdateStatusResponseFieldBuilder() {
                if (this.updateStatusResponseBuilder_ == null) {
                    this.updateStatusResponseBuilder_ = new SingleFieldBuilderV3<>(getUpdateStatusResponse(), getParentForChildren(), isClean());
                    this.updateStatusResponse_ = null;
                }
                return this.updateStatusResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getCheckForUpdatesRequestFieldBuilder();
                    getCheckForUpdatesResponseFieldBuilder();
                    getDownloadUpdatesRequestFieldBuilder();
                    getDownloadUpdatesResponseFieldBuilder();
                    getDownloadProgressNotificationFieldBuilder();
                    getDownloadReadyNotificationFieldBuilder();
                    getApplyUpdatesRequestFieldBuilder();
                    getApplyUpdatesResponseFieldBuilder();
                    getUpdateStatusRequestFieldBuilder();
                    getUpdateStatusResponseFieldBuilder();
                    getUpdateCompletedNotificationFieldBuilder();
                    getAcknowledgeCompletedNotificationFieldBuilder();
                    getAutoUpdateConfigRequestFieldBuilder();
                    getAutoUpdateConfigResponseFieldBuilder();
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
                this.checkForUpdatesRequest_ = null;
                SingleFieldBuilderV3<CheckForUpdatesRequest, CheckForUpdatesRequest.Builder, CheckForUpdatesRequestOrBuilder> singleFieldBuilderV3 = this.checkForUpdatesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.checkForUpdatesRequestBuilder_ = null;
                }
                this.checkForUpdatesResponse_ = null;
                SingleFieldBuilderV3<CheckForUpdatesResponse, CheckForUpdatesResponse.Builder, CheckForUpdatesResponseOrBuilder> singleFieldBuilderV4 = this.checkForUpdatesResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.checkForUpdatesResponseBuilder_ = null;
                }
                this.downloadUpdatesRequest_ = null;
                SingleFieldBuilderV3<DownloadUpdatesRequest, DownloadUpdatesRequest.Builder, DownloadUpdatesRequestOrBuilder> singleFieldBuilderV5 = this.downloadUpdatesRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.downloadUpdatesRequestBuilder_ = null;
                }
                this.downloadUpdatesResponse_ = null;
                SingleFieldBuilderV3<DownloadUpdatesResponse, DownloadUpdatesResponse.Builder, DownloadUpdatesResponseOrBuilder> singleFieldBuilderV6 = this.downloadUpdatesResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.downloadUpdatesResponseBuilder_ = null;
                }
                this.downloadProgressNotification_ = null;
                SingleFieldBuilderV3<DownloadProgressNotification, DownloadProgressNotification.Builder, DownloadProgressNotificationOrBuilder> singleFieldBuilderV7 = this.downloadProgressNotificationBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.downloadProgressNotificationBuilder_ = null;
                }
                this.downloadReadyNotification_ = null;
                SingleFieldBuilderV3<DownloadReadyNotification, DownloadReadyNotification.Builder, DownloadReadyNotificationOrBuilder> singleFieldBuilderV8 = this.downloadReadyNotificationBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.downloadReadyNotificationBuilder_ = null;
                }
                this.applyUpdatesRequest_ = null;
                SingleFieldBuilderV3<ApplyUpdatesRequest, ApplyUpdatesRequest.Builder, ApplyUpdatesRequestOrBuilder> singleFieldBuilderV9 = this.applyUpdatesRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.applyUpdatesRequestBuilder_ = null;
                }
                this.applyUpdatesResponse_ = null;
                SingleFieldBuilderV3<ApplyUpdatesResponse, ApplyUpdatesResponse.Builder, ApplyUpdatesResponseOrBuilder> singleFieldBuilderV10 = this.applyUpdatesResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.applyUpdatesResponseBuilder_ = null;
                }
                this.updateStatusRequest_ = null;
                SingleFieldBuilderV3<UpdateStatusRequest, UpdateStatusRequest.Builder, UpdateStatusRequestOrBuilder> singleFieldBuilderV11 = this.updateStatusRequestBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.updateStatusRequestBuilder_ = null;
                }
                this.updateStatusResponse_ = null;
                SingleFieldBuilderV3<UpdateStatusResponse, UpdateStatusResponse.Builder, UpdateStatusResponseOrBuilder> singleFieldBuilderV12 = this.updateStatusResponseBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.updateStatusResponseBuilder_ = null;
                }
                this.updateCompletedNotification_ = null;
                SingleFieldBuilderV3<UpdateCompletedNotification, UpdateCompletedNotification.Builder, UpdateCompletedNotificationOrBuilder> singleFieldBuilderV13 = this.updateCompletedNotificationBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.updateCompletedNotificationBuilder_ = null;
                }
                this.acknowledgeCompletedNotification_ = null;
                SingleFieldBuilderV3<AcknowledgeCompletedNotification, AcknowledgeCompletedNotification.Builder, AcknowledgeCompletedNotificationOrBuilder> singleFieldBuilderV14 = this.acknowledgeCompletedNotificationBuilder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.acknowledgeCompletedNotificationBuilder_ = null;
                }
                this.autoUpdateConfigRequest_ = null;
                SingleFieldBuilderV3<AutoUpdateConfigRequest, AutoUpdateConfigRequest.Builder, AutoUpdateConfigRequestOrBuilder> singleFieldBuilderV15 = this.autoUpdateConfigRequestBuilder_;
                if (singleFieldBuilderV15 != null) {
                    singleFieldBuilderV15.dispose();
                    this.autoUpdateConfigRequestBuilder_ = null;
                }
                this.autoUpdateConfigResponse_ = null;
                SingleFieldBuilderV3<AutoUpdateConfigResponse, AutoUpdateConfigResponse.Builder, AutoUpdateConfigResponseOrBuilder> singleFieldBuilderV16 = this.autoUpdateConfigResponseBuilder_;
                if (singleFieldBuilderV16 != null) {
                    singleFieldBuilderV16.dispose();
                    this.autoUpdateConfigResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearAcknowledgeCompletedNotification() {
                this.bitField0_ &= -2049;
                this.acknowledgeCompletedNotification_ = null;
                SingleFieldBuilderV3<AcknowledgeCompletedNotification, AcknowledgeCompletedNotification.Builder, AcknowledgeCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.acknowledgeCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.acknowledgeCompletedNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearApplyUpdatesRequest() {
                this.bitField0_ &= -65;
                this.applyUpdatesRequest_ = null;
                SingleFieldBuilderV3<ApplyUpdatesRequest, ApplyUpdatesRequest.Builder, ApplyUpdatesRequestOrBuilder> singleFieldBuilderV3 = this.applyUpdatesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.applyUpdatesRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearApplyUpdatesResponse() {
                this.bitField0_ &= -129;
                this.applyUpdatesResponse_ = null;
                SingleFieldBuilderV3<ApplyUpdatesResponse, ApplyUpdatesResponse.Builder, ApplyUpdatesResponseOrBuilder> singleFieldBuilderV3 = this.applyUpdatesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.applyUpdatesResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearAutoUpdateConfigRequest() {
                this.bitField0_ &= -4097;
                this.autoUpdateConfigRequest_ = null;
                SingleFieldBuilderV3<AutoUpdateConfigRequest, AutoUpdateConfigRequest.Builder, AutoUpdateConfigRequestOrBuilder> singleFieldBuilderV3 = this.autoUpdateConfigRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.autoUpdateConfigRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearAutoUpdateConfigResponse() {
                this.bitField0_ &= -8193;
                this.autoUpdateConfigResponse_ = null;
                SingleFieldBuilderV3<AutoUpdateConfigResponse, AutoUpdateConfigResponse.Builder, AutoUpdateConfigResponseOrBuilder> singleFieldBuilderV3 = this.autoUpdateConfigResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.autoUpdateConfigResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCheckForUpdatesRequest() {
                this.bitField0_ &= -2;
                this.checkForUpdatesRequest_ = null;
                SingleFieldBuilderV3<CheckForUpdatesRequest, CheckForUpdatesRequest.Builder, CheckForUpdatesRequestOrBuilder> singleFieldBuilderV3 = this.checkForUpdatesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.checkForUpdatesRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCheckForUpdatesResponse() {
                this.bitField0_ &= -3;
                this.checkForUpdatesResponse_ = null;
                SingleFieldBuilderV3<CheckForUpdatesResponse, CheckForUpdatesResponse.Builder, CheckForUpdatesResponseOrBuilder> singleFieldBuilderV3 = this.checkForUpdatesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.checkForUpdatesResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDownloadProgressNotification() {
                this.bitField0_ &= -17;
                this.downloadProgressNotification_ = null;
                SingleFieldBuilderV3<DownloadProgressNotification, DownloadProgressNotification.Builder, DownloadProgressNotificationOrBuilder> singleFieldBuilderV3 = this.downloadProgressNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.downloadProgressNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDownloadReadyNotification() {
                this.bitField0_ &= -33;
                this.downloadReadyNotification_ = null;
                SingleFieldBuilderV3<DownloadReadyNotification, DownloadReadyNotification.Builder, DownloadReadyNotificationOrBuilder> singleFieldBuilderV3 = this.downloadReadyNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.downloadReadyNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDownloadUpdatesRequest() {
                this.bitField0_ &= -5;
                this.downloadUpdatesRequest_ = null;
                SingleFieldBuilderV3<DownloadUpdatesRequest, DownloadUpdatesRequest.Builder, DownloadUpdatesRequestOrBuilder> singleFieldBuilderV3 = this.downloadUpdatesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.downloadUpdatesRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDownloadUpdatesResponse() {
                this.bitField0_ &= -9;
                this.downloadUpdatesResponse_ = null;
                SingleFieldBuilderV3<DownloadUpdatesResponse, DownloadUpdatesResponse.Builder, DownloadUpdatesResponseOrBuilder> singleFieldBuilderV3 = this.downloadUpdatesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.downloadUpdatesResponseBuilder_ = null;
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

            public Builder clearUpdateCompletedNotification() {
                this.bitField0_ &= -1025;
                this.updateCompletedNotification_ = null;
                SingleFieldBuilderV3<UpdateCompletedNotification, UpdateCompletedNotification.Builder, UpdateCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.updateCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.updateCompletedNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUpdateStatusRequest() {
                this.bitField0_ &= -257;
                this.updateStatusRequest_ = null;
                SingleFieldBuilderV3<UpdateStatusRequest, UpdateStatusRequest.Builder, UpdateStatusRequestOrBuilder> singleFieldBuilderV3 = this.updateStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.updateStatusRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUpdateStatusResponse() {
                this.bitField0_ &= -513;
                this.updateStatusResponse_ = null;
                SingleFieldBuilderV3<UpdateStatusResponse, UpdateStatusResponse.Builder, UpdateStatusResponseOrBuilder> singleFieldBuilderV3 = this.updateStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.updateStatusResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public AcknowledgeCompletedNotification getAcknowledgeCompletedNotification() {
                SingleFieldBuilderV3<AcknowledgeCompletedNotification, AcknowledgeCompletedNotification.Builder, AcknowledgeCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.acknowledgeCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AcknowledgeCompletedNotification) singleFieldBuilderV3.getMessage();
                }
                AcknowledgeCompletedNotification acknowledgeCompletedNotification = this.acknowledgeCompletedNotification_;
                return acknowledgeCompletedNotification == null ? AcknowledgeCompletedNotification.getDefaultInstance() : acknowledgeCompletedNotification;
            }

            public AcknowledgeCompletedNotification.Builder getAcknowledgeCompletedNotificationBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (AcknowledgeCompletedNotification.Builder) getAcknowledgeCompletedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public AcknowledgeCompletedNotificationOrBuilder getAcknowledgeCompletedNotificationOrBuilder() {
                SingleFieldBuilderV3<AcknowledgeCompletedNotification, AcknowledgeCompletedNotification.Builder, AcknowledgeCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.acknowledgeCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AcknowledgeCompletedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AcknowledgeCompletedNotification acknowledgeCompletedNotification = this.acknowledgeCompletedNotification_;
                return acknowledgeCompletedNotification == null ? AcknowledgeCompletedNotification.getDefaultInstance() : acknowledgeCompletedNotification;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public ApplyUpdatesRequest getApplyUpdatesRequest() {
                SingleFieldBuilderV3<ApplyUpdatesRequest, ApplyUpdatesRequest.Builder, ApplyUpdatesRequestOrBuilder> singleFieldBuilderV3 = this.applyUpdatesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ApplyUpdatesRequest) singleFieldBuilderV3.getMessage();
                }
                ApplyUpdatesRequest applyUpdatesRequest = this.applyUpdatesRequest_;
                return applyUpdatesRequest == null ? ApplyUpdatesRequest.getDefaultInstance() : applyUpdatesRequest;
            }

            public ApplyUpdatesRequest.Builder getApplyUpdatesRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (ApplyUpdatesRequest.Builder) getApplyUpdatesRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public ApplyUpdatesRequestOrBuilder getApplyUpdatesRequestOrBuilder() {
                SingleFieldBuilderV3<ApplyUpdatesRequest, ApplyUpdatesRequest.Builder, ApplyUpdatesRequestOrBuilder> singleFieldBuilderV3 = this.applyUpdatesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ApplyUpdatesRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ApplyUpdatesRequest applyUpdatesRequest = this.applyUpdatesRequest_;
                return applyUpdatesRequest == null ? ApplyUpdatesRequest.getDefaultInstance() : applyUpdatesRequest;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public ApplyUpdatesResponse getApplyUpdatesResponse() {
                SingleFieldBuilderV3<ApplyUpdatesResponse, ApplyUpdatesResponse.Builder, ApplyUpdatesResponseOrBuilder> singleFieldBuilderV3 = this.applyUpdatesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ApplyUpdatesResponse) singleFieldBuilderV3.getMessage();
                }
                ApplyUpdatesResponse applyUpdatesResponse = this.applyUpdatesResponse_;
                return applyUpdatesResponse == null ? ApplyUpdatesResponse.getDefaultInstance() : applyUpdatesResponse;
            }

            public ApplyUpdatesResponse.Builder getApplyUpdatesResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (ApplyUpdatesResponse.Builder) getApplyUpdatesResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public ApplyUpdatesResponseOrBuilder getApplyUpdatesResponseOrBuilder() {
                SingleFieldBuilderV3<ApplyUpdatesResponse, ApplyUpdatesResponse.Builder, ApplyUpdatesResponseOrBuilder> singleFieldBuilderV3 = this.applyUpdatesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ApplyUpdatesResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ApplyUpdatesResponse applyUpdatesResponse = this.applyUpdatesResponse_;
                return applyUpdatesResponse == null ? ApplyUpdatesResponse.getDefaultInstance() : applyUpdatesResponse;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public AutoUpdateConfigRequest getAutoUpdateConfigRequest() {
                SingleFieldBuilderV3<AutoUpdateConfigRequest, AutoUpdateConfigRequest.Builder, AutoUpdateConfigRequestOrBuilder> singleFieldBuilderV3 = this.autoUpdateConfigRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AutoUpdateConfigRequest) singleFieldBuilderV3.getMessage();
                }
                AutoUpdateConfigRequest autoUpdateConfigRequest = this.autoUpdateConfigRequest_;
                return autoUpdateConfigRequest == null ? AutoUpdateConfigRequest.getDefaultInstance() : autoUpdateConfigRequest;
            }

            public AutoUpdateConfigRequest.Builder getAutoUpdateConfigRequestBuilder() {
                this.bitField0_ |= 4096;
                onChanged();
                return (AutoUpdateConfigRequest.Builder) getAutoUpdateConfigRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public AutoUpdateConfigRequestOrBuilder getAutoUpdateConfigRequestOrBuilder() {
                SingleFieldBuilderV3<AutoUpdateConfigRequest, AutoUpdateConfigRequest.Builder, AutoUpdateConfigRequestOrBuilder> singleFieldBuilderV3 = this.autoUpdateConfigRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AutoUpdateConfigRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AutoUpdateConfigRequest autoUpdateConfigRequest = this.autoUpdateConfigRequest_;
                return autoUpdateConfigRequest == null ? AutoUpdateConfigRequest.getDefaultInstance() : autoUpdateConfigRequest;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public AutoUpdateConfigResponse getAutoUpdateConfigResponse() {
                SingleFieldBuilderV3<AutoUpdateConfigResponse, AutoUpdateConfigResponse.Builder, AutoUpdateConfigResponseOrBuilder> singleFieldBuilderV3 = this.autoUpdateConfigResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AutoUpdateConfigResponse) singleFieldBuilderV3.getMessage();
                }
                AutoUpdateConfigResponse autoUpdateConfigResponse = this.autoUpdateConfigResponse_;
                return autoUpdateConfigResponse == null ? AutoUpdateConfigResponse.getDefaultInstance() : autoUpdateConfigResponse;
            }

            public AutoUpdateConfigResponse.Builder getAutoUpdateConfigResponseBuilder() {
                this.bitField0_ |= 8192;
                onChanged();
                return (AutoUpdateConfigResponse.Builder) getAutoUpdateConfigResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public AutoUpdateConfigResponseOrBuilder getAutoUpdateConfigResponseOrBuilder() {
                SingleFieldBuilderV3<AutoUpdateConfigResponse, AutoUpdateConfigResponse.Builder, AutoUpdateConfigResponseOrBuilder> singleFieldBuilderV3 = this.autoUpdateConfigResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AutoUpdateConfigResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AutoUpdateConfigResponse autoUpdateConfigResponse = this.autoUpdateConfigResponse_;
                return autoUpdateConfigResponse == null ? AutoUpdateConfigResponse.getDefaultInstance() : autoUpdateConfigResponse;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public CheckForUpdatesRequest getCheckForUpdatesRequest() {
                SingleFieldBuilderV3<CheckForUpdatesRequest, CheckForUpdatesRequest.Builder, CheckForUpdatesRequestOrBuilder> singleFieldBuilderV3 = this.checkForUpdatesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CheckForUpdatesRequest) singleFieldBuilderV3.getMessage();
                }
                CheckForUpdatesRequest checkForUpdatesRequest = this.checkForUpdatesRequest_;
                return checkForUpdatesRequest == null ? CheckForUpdatesRequest.getDefaultInstance() : checkForUpdatesRequest;
            }

            public CheckForUpdatesRequest.Builder getCheckForUpdatesRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (CheckForUpdatesRequest.Builder) getCheckForUpdatesRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public CheckForUpdatesRequestOrBuilder getCheckForUpdatesRequestOrBuilder() {
                SingleFieldBuilderV3<CheckForUpdatesRequest, CheckForUpdatesRequest.Builder, CheckForUpdatesRequestOrBuilder> singleFieldBuilderV3 = this.checkForUpdatesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CheckForUpdatesRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CheckForUpdatesRequest checkForUpdatesRequest = this.checkForUpdatesRequest_;
                return checkForUpdatesRequest == null ? CheckForUpdatesRequest.getDefaultInstance() : checkForUpdatesRequest;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public CheckForUpdatesResponse getCheckForUpdatesResponse() {
                SingleFieldBuilderV3<CheckForUpdatesResponse, CheckForUpdatesResponse.Builder, CheckForUpdatesResponseOrBuilder> singleFieldBuilderV3 = this.checkForUpdatesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CheckForUpdatesResponse) singleFieldBuilderV3.getMessage();
                }
                CheckForUpdatesResponse checkForUpdatesResponse = this.checkForUpdatesResponse_;
                return checkForUpdatesResponse == null ? CheckForUpdatesResponse.getDefaultInstance() : checkForUpdatesResponse;
            }

            public CheckForUpdatesResponse.Builder getCheckForUpdatesResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (CheckForUpdatesResponse.Builder) getCheckForUpdatesResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public CheckForUpdatesResponseOrBuilder getCheckForUpdatesResponseOrBuilder() {
                SingleFieldBuilderV3<CheckForUpdatesResponse, CheckForUpdatesResponse.Builder, CheckForUpdatesResponseOrBuilder> singleFieldBuilderV3 = this.checkForUpdatesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CheckForUpdatesResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CheckForUpdatesResponse checkForUpdatesResponse = this.checkForUpdatesResponse_;
                return checkForUpdatesResponse == null ? CheckForUpdatesResponse.getDefaultInstance() : checkForUpdatesResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public DownloadProgressNotification getDownloadProgressNotification() {
                SingleFieldBuilderV3<DownloadProgressNotification, DownloadProgressNotification.Builder, DownloadProgressNotificationOrBuilder> singleFieldBuilderV3 = this.downloadProgressNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DownloadProgressNotification) singleFieldBuilderV3.getMessage();
                }
                DownloadProgressNotification downloadProgressNotification = this.downloadProgressNotification_;
                return downloadProgressNotification == null ? DownloadProgressNotification.getDefaultInstance() : downloadProgressNotification;
            }

            public DownloadProgressNotification.Builder getDownloadProgressNotificationBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (DownloadProgressNotification.Builder) getDownloadProgressNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public DownloadProgressNotificationOrBuilder getDownloadProgressNotificationOrBuilder() {
                SingleFieldBuilderV3<DownloadProgressNotification, DownloadProgressNotification.Builder, DownloadProgressNotificationOrBuilder> singleFieldBuilderV3 = this.downloadProgressNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DownloadProgressNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DownloadProgressNotification downloadProgressNotification = this.downloadProgressNotification_;
                return downloadProgressNotification == null ? DownloadProgressNotification.getDefaultInstance() : downloadProgressNotification;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public DownloadReadyNotification getDownloadReadyNotification() {
                SingleFieldBuilderV3<DownloadReadyNotification, DownloadReadyNotification.Builder, DownloadReadyNotificationOrBuilder> singleFieldBuilderV3 = this.downloadReadyNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DownloadReadyNotification) singleFieldBuilderV3.getMessage();
                }
                DownloadReadyNotification downloadReadyNotification = this.downloadReadyNotification_;
                return downloadReadyNotification == null ? DownloadReadyNotification.getDefaultInstance() : downloadReadyNotification;
            }

            public DownloadReadyNotification.Builder getDownloadReadyNotificationBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (DownloadReadyNotification.Builder) getDownloadReadyNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public DownloadReadyNotificationOrBuilder getDownloadReadyNotificationOrBuilder() {
                SingleFieldBuilderV3<DownloadReadyNotification, DownloadReadyNotification.Builder, DownloadReadyNotificationOrBuilder> singleFieldBuilderV3 = this.downloadReadyNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DownloadReadyNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DownloadReadyNotification downloadReadyNotification = this.downloadReadyNotification_;
                return downloadReadyNotification == null ? DownloadReadyNotification.getDefaultInstance() : downloadReadyNotification;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public DownloadUpdatesRequest getDownloadUpdatesRequest() {
                SingleFieldBuilderV3<DownloadUpdatesRequest, DownloadUpdatesRequest.Builder, DownloadUpdatesRequestOrBuilder> singleFieldBuilderV3 = this.downloadUpdatesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DownloadUpdatesRequest) singleFieldBuilderV3.getMessage();
                }
                DownloadUpdatesRequest downloadUpdatesRequest = this.downloadUpdatesRequest_;
                return downloadUpdatesRequest == null ? DownloadUpdatesRequest.getDefaultInstance() : downloadUpdatesRequest;
            }

            public DownloadUpdatesRequest.Builder getDownloadUpdatesRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (DownloadUpdatesRequest.Builder) getDownloadUpdatesRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public DownloadUpdatesRequestOrBuilder getDownloadUpdatesRequestOrBuilder() {
                SingleFieldBuilderV3<DownloadUpdatesRequest, DownloadUpdatesRequest.Builder, DownloadUpdatesRequestOrBuilder> singleFieldBuilderV3 = this.downloadUpdatesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DownloadUpdatesRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DownloadUpdatesRequest downloadUpdatesRequest = this.downloadUpdatesRequest_;
                return downloadUpdatesRequest == null ? DownloadUpdatesRequest.getDefaultInstance() : downloadUpdatesRequest;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public DownloadUpdatesResponse getDownloadUpdatesResponse() {
                SingleFieldBuilderV3<DownloadUpdatesResponse, DownloadUpdatesResponse.Builder, DownloadUpdatesResponseOrBuilder> singleFieldBuilderV3 = this.downloadUpdatesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DownloadUpdatesResponse) singleFieldBuilderV3.getMessage();
                }
                DownloadUpdatesResponse downloadUpdatesResponse = this.downloadUpdatesResponse_;
                return downloadUpdatesResponse == null ? DownloadUpdatesResponse.getDefaultInstance() : downloadUpdatesResponse;
            }

            public DownloadUpdatesResponse.Builder getDownloadUpdatesResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (DownloadUpdatesResponse.Builder) getDownloadUpdatesResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public DownloadUpdatesResponseOrBuilder getDownloadUpdatesResponseOrBuilder() {
                SingleFieldBuilderV3<DownloadUpdatesResponse, DownloadUpdatesResponse.Builder, DownloadUpdatesResponseOrBuilder> singleFieldBuilderV3 = this.downloadUpdatesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DownloadUpdatesResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DownloadUpdatesResponse downloadUpdatesResponse = this.downloadUpdatesResponse_;
                return downloadUpdatesResponse == null ? DownloadUpdatesResponse.getDefaultInstance() : downloadUpdatesResponse;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public UpdateCompletedNotification getUpdateCompletedNotification() {
                SingleFieldBuilderV3<UpdateCompletedNotification, UpdateCompletedNotification.Builder, UpdateCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.updateCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateCompletedNotification) singleFieldBuilderV3.getMessage();
                }
                UpdateCompletedNotification updateCompletedNotification = this.updateCompletedNotification_;
                return updateCompletedNotification == null ? UpdateCompletedNotification.getDefaultInstance() : updateCompletedNotification;
            }

            public UpdateCompletedNotification.Builder getUpdateCompletedNotificationBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (UpdateCompletedNotification.Builder) getUpdateCompletedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public UpdateCompletedNotificationOrBuilder getUpdateCompletedNotificationOrBuilder() {
                SingleFieldBuilderV3<UpdateCompletedNotification, UpdateCompletedNotification.Builder, UpdateCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.updateCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateCompletedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UpdateCompletedNotification updateCompletedNotification = this.updateCompletedNotification_;
                return updateCompletedNotification == null ? UpdateCompletedNotification.getDefaultInstance() : updateCompletedNotification;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public UpdateStatusRequest getUpdateStatusRequest() {
                SingleFieldBuilderV3<UpdateStatusRequest, UpdateStatusRequest.Builder, UpdateStatusRequestOrBuilder> singleFieldBuilderV3 = this.updateStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateStatusRequest) singleFieldBuilderV3.getMessage();
                }
                UpdateStatusRequest updateStatusRequest = this.updateStatusRequest_;
                return updateStatusRequest == null ? UpdateStatusRequest.getDefaultInstance() : updateStatusRequest;
            }

            public UpdateStatusRequest.Builder getUpdateStatusRequestBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (UpdateStatusRequest.Builder) getUpdateStatusRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public UpdateStatusRequestOrBuilder getUpdateStatusRequestOrBuilder() {
                SingleFieldBuilderV3<UpdateStatusRequest, UpdateStatusRequest.Builder, UpdateStatusRequestOrBuilder> singleFieldBuilderV3 = this.updateStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateStatusRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UpdateStatusRequest updateStatusRequest = this.updateStatusRequest_;
                return updateStatusRequest == null ? UpdateStatusRequest.getDefaultInstance() : updateStatusRequest;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public UpdateStatusResponse getUpdateStatusResponse() {
                SingleFieldBuilderV3<UpdateStatusResponse, UpdateStatusResponse.Builder, UpdateStatusResponseOrBuilder> singleFieldBuilderV3 = this.updateStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateStatusResponse) singleFieldBuilderV3.getMessage();
                }
                UpdateStatusResponse updateStatusResponse = this.updateStatusResponse_;
                return updateStatusResponse == null ? UpdateStatusResponse.getDefaultInstance() : updateStatusResponse;
            }

            public UpdateStatusResponse.Builder getUpdateStatusResponseBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (UpdateStatusResponse.Builder) getUpdateStatusResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public UpdateStatusResponseOrBuilder getUpdateStatusResponseOrBuilder() {
                SingleFieldBuilderV3<UpdateStatusResponse, UpdateStatusResponse.Builder, UpdateStatusResponseOrBuilder> singleFieldBuilderV3 = this.updateStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateStatusResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UpdateStatusResponse updateStatusResponse = this.updateStatusResponse_;
                return updateStatusResponse == null ? UpdateStatusResponse.getDefaultInstance() : updateStatusResponse;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public boolean hasAcknowledgeCompletedNotification() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public boolean hasApplyUpdatesRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public boolean hasApplyUpdatesResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public boolean hasAutoUpdateConfigRequest() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public boolean hasAutoUpdateConfigResponse() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public boolean hasCheckForUpdatesRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public boolean hasCheckForUpdatesResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public boolean hasDownloadProgressNotification() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public boolean hasDownloadReadyNotification() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public boolean hasDownloadUpdatesRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public boolean hasDownloadUpdatesResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public boolean hasUpdateCompletedNotification() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public boolean hasUpdateStatusRequest() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.ServiceOrBuilder
            public boolean hasUpdateStatusResponse() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAcknowledgeCompletedNotification(AcknowledgeCompletedNotification acknowledgeCompletedNotification) {
                AcknowledgeCompletedNotification acknowledgeCompletedNotification2;
                SingleFieldBuilderV3<AcknowledgeCompletedNotification, AcknowledgeCompletedNotification.Builder, AcknowledgeCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.acknowledgeCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(acknowledgeCompletedNotification);
                } else if ((this.bitField0_ & 2048) == 0 || (acknowledgeCompletedNotification2 = this.acknowledgeCompletedNotification_) == null || acknowledgeCompletedNotification2 == AcknowledgeCompletedNotification.getDefaultInstance()) {
                    this.acknowledgeCompletedNotification_ = acknowledgeCompletedNotification;
                } else {
                    getAcknowledgeCompletedNotificationBuilder().mergeFrom(acknowledgeCompletedNotification);
                }
                if (this.acknowledgeCompletedNotification_ != null) {
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                return this;
            }

            public Builder mergeApplyUpdatesRequest(ApplyUpdatesRequest applyUpdatesRequest) {
                ApplyUpdatesRequest applyUpdatesRequest2;
                SingleFieldBuilderV3<ApplyUpdatesRequest, ApplyUpdatesRequest.Builder, ApplyUpdatesRequestOrBuilder> singleFieldBuilderV3 = this.applyUpdatesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(applyUpdatesRequest);
                } else if ((this.bitField0_ & 64) == 0 || (applyUpdatesRequest2 = this.applyUpdatesRequest_) == null || applyUpdatesRequest2 == ApplyUpdatesRequest.getDefaultInstance()) {
                    this.applyUpdatesRequest_ = applyUpdatesRequest;
                } else {
                    getApplyUpdatesRequestBuilder().mergeFrom(applyUpdatesRequest);
                }
                if (this.applyUpdatesRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeApplyUpdatesResponse(ApplyUpdatesResponse applyUpdatesResponse) {
                ApplyUpdatesResponse applyUpdatesResponse2;
                SingleFieldBuilderV3<ApplyUpdatesResponse, ApplyUpdatesResponse.Builder, ApplyUpdatesResponseOrBuilder> singleFieldBuilderV3 = this.applyUpdatesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(applyUpdatesResponse);
                } else if ((this.bitField0_ & 128) == 0 || (applyUpdatesResponse2 = this.applyUpdatesResponse_) == null || applyUpdatesResponse2 == ApplyUpdatesResponse.getDefaultInstance()) {
                    this.applyUpdatesResponse_ = applyUpdatesResponse;
                } else {
                    getApplyUpdatesResponseBuilder().mergeFrom(applyUpdatesResponse);
                }
                if (this.applyUpdatesResponse_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeAutoUpdateConfigRequest(AutoUpdateConfigRequest autoUpdateConfigRequest) {
                AutoUpdateConfigRequest autoUpdateConfigRequest2;
                SingleFieldBuilderV3<AutoUpdateConfigRequest, AutoUpdateConfigRequest.Builder, AutoUpdateConfigRequestOrBuilder> singleFieldBuilderV3 = this.autoUpdateConfigRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(autoUpdateConfigRequest);
                } else if ((this.bitField0_ & 4096) == 0 || (autoUpdateConfigRequest2 = this.autoUpdateConfigRequest_) == null || autoUpdateConfigRequest2 == AutoUpdateConfigRequest.getDefaultInstance()) {
                    this.autoUpdateConfigRequest_ = autoUpdateConfigRequest;
                } else {
                    getAutoUpdateConfigRequestBuilder().mergeFrom(autoUpdateConfigRequest);
                }
                if (this.autoUpdateConfigRequest_ != null) {
                    this.bitField0_ |= 4096;
                    onChanged();
                }
                return this;
            }

            public Builder mergeAutoUpdateConfigResponse(AutoUpdateConfigResponse autoUpdateConfigResponse) {
                AutoUpdateConfigResponse autoUpdateConfigResponse2;
                SingleFieldBuilderV3<AutoUpdateConfigResponse, AutoUpdateConfigResponse.Builder, AutoUpdateConfigResponseOrBuilder> singleFieldBuilderV3 = this.autoUpdateConfigResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(autoUpdateConfigResponse);
                } else if ((this.bitField0_ & 8192) == 0 || (autoUpdateConfigResponse2 = this.autoUpdateConfigResponse_) == null || autoUpdateConfigResponse2 == AutoUpdateConfigResponse.getDefaultInstance()) {
                    this.autoUpdateConfigResponse_ = autoUpdateConfigResponse;
                } else {
                    getAutoUpdateConfigResponseBuilder().mergeFrom(autoUpdateConfigResponse);
                }
                if (this.autoUpdateConfigResponse_ != null) {
                    this.bitField0_ |= 8192;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCheckForUpdatesRequest(CheckForUpdatesRequest checkForUpdatesRequest) {
                CheckForUpdatesRequest checkForUpdatesRequest2;
                SingleFieldBuilderV3<CheckForUpdatesRequest, CheckForUpdatesRequest.Builder, CheckForUpdatesRequestOrBuilder> singleFieldBuilderV3 = this.checkForUpdatesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(checkForUpdatesRequest);
                } else if ((this.bitField0_ & 1) == 0 || (checkForUpdatesRequest2 = this.checkForUpdatesRequest_) == null || checkForUpdatesRequest2 == CheckForUpdatesRequest.getDefaultInstance()) {
                    this.checkForUpdatesRequest_ = checkForUpdatesRequest;
                } else {
                    getCheckForUpdatesRequestBuilder().mergeFrom(checkForUpdatesRequest);
                }
                if (this.checkForUpdatesRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCheckForUpdatesResponse(CheckForUpdatesResponse checkForUpdatesResponse) {
                CheckForUpdatesResponse checkForUpdatesResponse2;
                SingleFieldBuilderV3<CheckForUpdatesResponse, CheckForUpdatesResponse.Builder, CheckForUpdatesResponseOrBuilder> singleFieldBuilderV3 = this.checkForUpdatesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(checkForUpdatesResponse);
                } else if ((this.bitField0_ & 2) == 0 || (checkForUpdatesResponse2 = this.checkForUpdatesResponse_) == null || checkForUpdatesResponse2 == CheckForUpdatesResponse.getDefaultInstance()) {
                    this.checkForUpdatesResponse_ = checkForUpdatesResponse;
                } else {
                    getCheckForUpdatesResponseBuilder().mergeFrom(checkForUpdatesResponse);
                }
                if (this.checkForUpdatesResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDownloadProgressNotification(DownloadProgressNotification downloadProgressNotification) {
                DownloadProgressNotification downloadProgressNotification2;
                SingleFieldBuilderV3<DownloadProgressNotification, DownloadProgressNotification.Builder, DownloadProgressNotificationOrBuilder> singleFieldBuilderV3 = this.downloadProgressNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(downloadProgressNotification);
                } else if ((this.bitField0_ & 16) == 0 || (downloadProgressNotification2 = this.downloadProgressNotification_) == null || downloadProgressNotification2 == DownloadProgressNotification.getDefaultInstance()) {
                    this.downloadProgressNotification_ = downloadProgressNotification;
                } else {
                    getDownloadProgressNotificationBuilder().mergeFrom(downloadProgressNotification);
                }
                if (this.downloadProgressNotification_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDownloadReadyNotification(DownloadReadyNotification downloadReadyNotification) {
                DownloadReadyNotification downloadReadyNotification2;
                SingleFieldBuilderV3<DownloadReadyNotification, DownloadReadyNotification.Builder, DownloadReadyNotificationOrBuilder> singleFieldBuilderV3 = this.downloadReadyNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(downloadReadyNotification);
                } else if ((this.bitField0_ & 32) == 0 || (downloadReadyNotification2 = this.downloadReadyNotification_) == null || downloadReadyNotification2 == DownloadReadyNotification.getDefaultInstance()) {
                    this.downloadReadyNotification_ = downloadReadyNotification;
                } else {
                    getDownloadReadyNotificationBuilder().mergeFrom(downloadReadyNotification);
                }
                if (this.downloadReadyNotification_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDownloadUpdatesRequest(DownloadUpdatesRequest downloadUpdatesRequest) {
                DownloadUpdatesRequest downloadUpdatesRequest2;
                SingleFieldBuilderV3<DownloadUpdatesRequest, DownloadUpdatesRequest.Builder, DownloadUpdatesRequestOrBuilder> singleFieldBuilderV3 = this.downloadUpdatesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(downloadUpdatesRequest);
                } else if ((this.bitField0_ & 4) == 0 || (downloadUpdatesRequest2 = this.downloadUpdatesRequest_) == null || downloadUpdatesRequest2 == DownloadUpdatesRequest.getDefaultInstance()) {
                    this.downloadUpdatesRequest_ = downloadUpdatesRequest;
                } else {
                    getDownloadUpdatesRequestBuilder().mergeFrom(downloadUpdatesRequest);
                }
                if (this.downloadUpdatesRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDownloadUpdatesResponse(DownloadUpdatesResponse downloadUpdatesResponse) {
                DownloadUpdatesResponse downloadUpdatesResponse2;
                SingleFieldBuilderV3<DownloadUpdatesResponse, DownloadUpdatesResponse.Builder, DownloadUpdatesResponseOrBuilder> singleFieldBuilderV3 = this.downloadUpdatesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(downloadUpdatesResponse);
                } else if ((this.bitField0_ & 8) == 0 || (downloadUpdatesResponse2 = this.downloadUpdatesResponse_) == null || downloadUpdatesResponse2 == DownloadUpdatesResponse.getDefaultInstance()) {
                    this.downloadUpdatesResponse_ = downloadUpdatesResponse;
                } else {
                    getDownloadUpdatesResponseBuilder().mergeFrom(downloadUpdatesResponse);
                }
                if (this.downloadUpdatesResponse_ != null) {
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
                            switch (tag) {
                                case 0:
                                    break;
                                case 10:
                                    codedInputStream.readMessage(getCheckForUpdatesRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getCheckForUpdatesResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getDownloadUpdatesRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getDownloadUpdatesResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getDownloadProgressNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getDownloadReadyNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getApplyUpdatesRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getApplyUpdatesResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getUpdateStatusRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getUpdateStatusResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getUpdateCompletedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 98:
                                    codedInputStream.readMessage(getAcknowledgeCompletedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 106:
                                    codedInputStream.readMessage(getAutoUpdateConfigRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 114:
                                    codedInputStream.readMessage(getAutoUpdateConfigResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8192;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder mergeUpdateCompletedNotification(UpdateCompletedNotification updateCompletedNotification) {
                UpdateCompletedNotification updateCompletedNotification2;
                SingleFieldBuilderV3<UpdateCompletedNotification, UpdateCompletedNotification.Builder, UpdateCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.updateCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(updateCompletedNotification);
                } else if ((this.bitField0_ & 1024) == 0 || (updateCompletedNotification2 = this.updateCompletedNotification_) == null || updateCompletedNotification2 == UpdateCompletedNotification.getDefaultInstance()) {
                    this.updateCompletedNotification_ = updateCompletedNotification;
                } else {
                    getUpdateCompletedNotificationBuilder().mergeFrom(updateCompletedNotification);
                }
                if (this.updateCompletedNotification_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUpdateStatusRequest(UpdateStatusRequest updateStatusRequest) {
                UpdateStatusRequest updateStatusRequest2;
                SingleFieldBuilderV3<UpdateStatusRequest, UpdateStatusRequest.Builder, UpdateStatusRequestOrBuilder> singleFieldBuilderV3 = this.updateStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(updateStatusRequest);
                } else if ((this.bitField0_ & 256) == 0 || (updateStatusRequest2 = this.updateStatusRequest_) == null || updateStatusRequest2 == UpdateStatusRequest.getDefaultInstance()) {
                    this.updateStatusRequest_ = updateStatusRequest;
                } else {
                    getUpdateStatusRequestBuilder().mergeFrom(updateStatusRequest);
                }
                if (this.updateStatusRequest_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUpdateStatusResponse(UpdateStatusResponse updateStatusResponse) {
                UpdateStatusResponse updateStatusResponse2;
                SingleFieldBuilderV3<UpdateStatusResponse, UpdateStatusResponse.Builder, UpdateStatusResponseOrBuilder> singleFieldBuilderV3 = this.updateStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(updateStatusResponse);
                } else if ((this.bitField0_ & 512) == 0 || (updateStatusResponse2 = this.updateStatusResponse_) == null || updateStatusResponse2 == UpdateStatusResponse.getDefaultInstance()) {
                    this.updateStatusResponse_ = updateStatusResponse;
                } else {
                    getUpdateStatusResponseBuilder().mergeFrom(updateStatusResponse);
                }
                if (this.updateStatusResponse_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder setAcknowledgeCompletedNotification(AcknowledgeCompletedNotification.Builder builder) {
                SingleFieldBuilderV3<AcknowledgeCompletedNotification, AcknowledgeCompletedNotification.Builder, AcknowledgeCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.acknowledgeCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.acknowledgeCompletedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setApplyUpdatesRequest(ApplyUpdatesRequest.Builder builder) {
                SingleFieldBuilderV3<ApplyUpdatesRequest, ApplyUpdatesRequest.Builder, ApplyUpdatesRequestOrBuilder> singleFieldBuilderV3 = this.applyUpdatesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.applyUpdatesRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setApplyUpdatesResponse(ApplyUpdatesResponse.Builder builder) {
                SingleFieldBuilderV3<ApplyUpdatesResponse, ApplyUpdatesResponse.Builder, ApplyUpdatesResponseOrBuilder> singleFieldBuilderV3 = this.applyUpdatesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.applyUpdatesResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setAutoUpdateConfigRequest(AutoUpdateConfigRequest.Builder builder) {
                SingleFieldBuilderV3<AutoUpdateConfigRequest, AutoUpdateConfigRequest.Builder, AutoUpdateConfigRequestOrBuilder> singleFieldBuilderV3 = this.autoUpdateConfigRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.autoUpdateConfigRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setAutoUpdateConfigResponse(AutoUpdateConfigResponse.Builder builder) {
                SingleFieldBuilderV3<AutoUpdateConfigResponse, AutoUpdateConfigResponse.Builder, AutoUpdateConfigResponseOrBuilder> singleFieldBuilderV3 = this.autoUpdateConfigResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.autoUpdateConfigResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setCheckForUpdatesRequest(CheckForUpdatesRequest.Builder builder) {
                SingleFieldBuilderV3<CheckForUpdatesRequest, CheckForUpdatesRequest.Builder, CheckForUpdatesRequestOrBuilder> singleFieldBuilderV3 = this.checkForUpdatesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.checkForUpdatesRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCheckForUpdatesResponse(CheckForUpdatesResponse.Builder builder) {
                SingleFieldBuilderV3<CheckForUpdatesResponse, CheckForUpdatesResponse.Builder, CheckForUpdatesResponseOrBuilder> singleFieldBuilderV3 = this.checkForUpdatesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.checkForUpdatesResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setDownloadProgressNotification(DownloadProgressNotification.Builder builder) {
                SingleFieldBuilderV3<DownloadProgressNotification, DownloadProgressNotification.Builder, DownloadProgressNotificationOrBuilder> singleFieldBuilderV3 = this.downloadProgressNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.downloadProgressNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setDownloadReadyNotification(DownloadReadyNotification.Builder builder) {
                SingleFieldBuilderV3<DownloadReadyNotification, DownloadReadyNotification.Builder, DownloadReadyNotificationOrBuilder> singleFieldBuilderV3 = this.downloadReadyNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.downloadReadyNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setDownloadUpdatesRequest(DownloadUpdatesRequest.Builder builder) {
                SingleFieldBuilderV3<DownloadUpdatesRequest, DownloadUpdatesRequest.Builder, DownloadUpdatesRequestOrBuilder> singleFieldBuilderV3 = this.downloadUpdatesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.downloadUpdatesRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setDownloadUpdatesResponse(DownloadUpdatesResponse.Builder builder) {
                SingleFieldBuilderV3<DownloadUpdatesResponse, DownloadUpdatesResponse.Builder, DownloadUpdatesResponseOrBuilder> singleFieldBuilderV3 = this.downloadUpdatesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.downloadUpdatesResponse_ = builder.build();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setUpdateCompletedNotification(UpdateCompletedNotification.Builder builder) {
                SingleFieldBuilderV3<UpdateCompletedNotification, UpdateCompletedNotification.Builder, UpdateCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.updateCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.updateCompletedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setUpdateStatusRequest(UpdateStatusRequest.Builder builder) {
                SingleFieldBuilderV3<UpdateStatusRequest, UpdateStatusRequest.Builder, UpdateStatusRequestOrBuilder> singleFieldBuilderV3 = this.updateStatusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.updateStatusRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setUpdateStatusResponse(UpdateStatusResponse.Builder builder) {
                SingleFieldBuilderV3<UpdateStatusResponse, UpdateStatusResponse.Builder, UpdateStatusResponseOrBuilder> singleFieldBuilderV3 = this.updateStatusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.updateStatusResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
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

            public Builder setAcknowledgeCompletedNotification(AcknowledgeCompletedNotification acknowledgeCompletedNotification) {
                SingleFieldBuilderV3<AcknowledgeCompletedNotification, AcknowledgeCompletedNotification.Builder, AcknowledgeCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.acknowledgeCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    acknowledgeCompletedNotification.getClass();
                    this.acknowledgeCompletedNotification_ = acknowledgeCompletedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(acknowledgeCompletedNotification);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setApplyUpdatesRequest(ApplyUpdatesRequest applyUpdatesRequest) {
                SingleFieldBuilderV3<ApplyUpdatesRequest, ApplyUpdatesRequest.Builder, ApplyUpdatesRequestOrBuilder> singleFieldBuilderV3 = this.applyUpdatesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    applyUpdatesRequest.getClass();
                    this.applyUpdatesRequest_ = applyUpdatesRequest;
                } else {
                    singleFieldBuilderV3.setMessage(applyUpdatesRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setApplyUpdatesResponse(ApplyUpdatesResponse applyUpdatesResponse) {
                SingleFieldBuilderV3<ApplyUpdatesResponse, ApplyUpdatesResponse.Builder, ApplyUpdatesResponseOrBuilder> singleFieldBuilderV3 = this.applyUpdatesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    applyUpdatesResponse.getClass();
                    this.applyUpdatesResponse_ = applyUpdatesResponse;
                } else {
                    singleFieldBuilderV3.setMessage(applyUpdatesResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setAutoUpdateConfigRequest(AutoUpdateConfigRequest autoUpdateConfigRequest) {
                SingleFieldBuilderV3<AutoUpdateConfigRequest, AutoUpdateConfigRequest.Builder, AutoUpdateConfigRequestOrBuilder> singleFieldBuilderV3 = this.autoUpdateConfigRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    autoUpdateConfigRequest.getClass();
                    this.autoUpdateConfigRequest_ = autoUpdateConfigRequest;
                } else {
                    singleFieldBuilderV3.setMessage(autoUpdateConfigRequest);
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setAutoUpdateConfigResponse(AutoUpdateConfigResponse autoUpdateConfigResponse) {
                SingleFieldBuilderV3<AutoUpdateConfigResponse, AutoUpdateConfigResponse.Builder, AutoUpdateConfigResponseOrBuilder> singleFieldBuilderV3 = this.autoUpdateConfigResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    autoUpdateConfigResponse.getClass();
                    this.autoUpdateConfigResponse_ = autoUpdateConfigResponse;
                } else {
                    singleFieldBuilderV3.setMessage(autoUpdateConfigResponse);
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setCheckForUpdatesRequest(CheckForUpdatesRequest checkForUpdatesRequest) {
                SingleFieldBuilderV3<CheckForUpdatesRequest, CheckForUpdatesRequest.Builder, CheckForUpdatesRequestOrBuilder> singleFieldBuilderV3 = this.checkForUpdatesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    checkForUpdatesRequest.getClass();
                    this.checkForUpdatesRequest_ = checkForUpdatesRequest;
                } else {
                    singleFieldBuilderV3.setMessage(checkForUpdatesRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCheckForUpdatesResponse(CheckForUpdatesResponse checkForUpdatesResponse) {
                SingleFieldBuilderV3<CheckForUpdatesResponse, CheckForUpdatesResponse.Builder, CheckForUpdatesResponseOrBuilder> singleFieldBuilderV3 = this.checkForUpdatesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    checkForUpdatesResponse.getClass();
                    this.checkForUpdatesResponse_ = checkForUpdatesResponse;
                } else {
                    singleFieldBuilderV3.setMessage(checkForUpdatesResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setDownloadProgressNotification(DownloadProgressNotification downloadProgressNotification) {
                SingleFieldBuilderV3<DownloadProgressNotification, DownloadProgressNotification.Builder, DownloadProgressNotificationOrBuilder> singleFieldBuilderV3 = this.downloadProgressNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    downloadProgressNotification.getClass();
                    this.downloadProgressNotification_ = downloadProgressNotification;
                } else {
                    singleFieldBuilderV3.setMessage(downloadProgressNotification);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setDownloadReadyNotification(DownloadReadyNotification downloadReadyNotification) {
                SingleFieldBuilderV3<DownloadReadyNotification, DownloadReadyNotification.Builder, DownloadReadyNotificationOrBuilder> singleFieldBuilderV3 = this.downloadReadyNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    downloadReadyNotification.getClass();
                    this.downloadReadyNotification_ = downloadReadyNotification;
                } else {
                    singleFieldBuilderV3.setMessage(downloadReadyNotification);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setDownloadUpdatesRequest(DownloadUpdatesRequest downloadUpdatesRequest) {
                SingleFieldBuilderV3<DownloadUpdatesRequest, DownloadUpdatesRequest.Builder, DownloadUpdatesRequestOrBuilder> singleFieldBuilderV3 = this.downloadUpdatesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    downloadUpdatesRequest.getClass();
                    this.downloadUpdatesRequest_ = downloadUpdatesRequest;
                } else {
                    singleFieldBuilderV3.setMessage(downloadUpdatesRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setDownloadUpdatesResponse(DownloadUpdatesResponse downloadUpdatesResponse) {
                SingleFieldBuilderV3<DownloadUpdatesResponse, DownloadUpdatesResponse.Builder, DownloadUpdatesResponseOrBuilder> singleFieldBuilderV3 = this.downloadUpdatesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    downloadUpdatesResponse.getClass();
                    this.downloadUpdatesResponse_ = downloadUpdatesResponse;
                } else {
                    singleFieldBuilderV3.setMessage(downloadUpdatesResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setUpdateCompletedNotification(UpdateCompletedNotification updateCompletedNotification) {
                SingleFieldBuilderV3<UpdateCompletedNotification, UpdateCompletedNotification.Builder, UpdateCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.updateCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    updateCompletedNotification.getClass();
                    this.updateCompletedNotification_ = updateCompletedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(updateCompletedNotification);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setUpdateStatusRequest(UpdateStatusRequest updateStatusRequest) {
                SingleFieldBuilderV3<UpdateStatusRequest, UpdateStatusRequest.Builder, UpdateStatusRequestOrBuilder> singleFieldBuilderV3 = this.updateStatusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    updateStatusRequest.getClass();
                    this.updateStatusRequest_ = updateStatusRequest;
                } else {
                    singleFieldBuilderV3.setMessage(updateStatusRequest);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setUpdateStatusResponse(UpdateStatusResponse updateStatusResponse) {
                SingleFieldBuilderV3<UpdateStatusResponse, UpdateStatusResponse.Builder, UpdateStatusResponseOrBuilder> singleFieldBuilderV3 = this.updateStatusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    updateStatusResponse.getClass();
                    this.updateStatusResponse_ = updateStatusResponse;
                } else {
                    singleFieldBuilderV3.setMessage(updateStatusResponse);
                }
                this.bitField0_ |= 512;
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
                if (service.hasCheckForUpdatesRequest()) {
                    mergeCheckForUpdatesRequest(service.getCheckForUpdatesRequest());
                }
                if (service.hasCheckForUpdatesResponse()) {
                    mergeCheckForUpdatesResponse(service.getCheckForUpdatesResponse());
                }
                if (service.hasDownloadUpdatesRequest()) {
                    mergeDownloadUpdatesRequest(service.getDownloadUpdatesRequest());
                }
                if (service.hasDownloadUpdatesResponse()) {
                    mergeDownloadUpdatesResponse(service.getDownloadUpdatesResponse());
                }
                if (service.hasDownloadProgressNotification()) {
                    mergeDownloadProgressNotification(service.getDownloadProgressNotification());
                }
                if (service.hasDownloadReadyNotification()) {
                    mergeDownloadReadyNotification(service.getDownloadReadyNotification());
                }
                if (service.hasApplyUpdatesRequest()) {
                    mergeApplyUpdatesRequest(service.getApplyUpdatesRequest());
                }
                if (service.hasApplyUpdatesResponse()) {
                    mergeApplyUpdatesResponse(service.getApplyUpdatesResponse());
                }
                if (service.hasUpdateStatusRequest()) {
                    mergeUpdateStatusRequest(service.getUpdateStatusRequest());
                }
                if (service.hasUpdateStatusResponse()) {
                    mergeUpdateStatusResponse(service.getUpdateStatusResponse());
                }
                if (service.hasUpdateCompletedNotification()) {
                    mergeUpdateCompletedNotification(service.getUpdateCompletedNotification());
                }
                if (service.hasAcknowledgeCompletedNotification()) {
                    mergeAcknowledgeCompletedNotification(service.getAcknowledgeCompletedNotification());
                }
                if (service.hasAutoUpdateConfigRequest()) {
                    mergeAutoUpdateConfigRequest(service.getAutoUpdateConfigRequest());
                }
                if (service.hasAutoUpdateConfigResponse()) {
                    mergeAutoUpdateConfigResponse(service.getAutoUpdateConfigResponse());
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

    public static final class UpdateStatusResponse extends GeneratedMessageV3 implements UpdateStatusResponseOrBuilder {
        public static final int CURRENT_BUNDLE_VERSION_FIELD_NUMBER = 3;
        private static final UpdateStatusResponse DEFAULT_INSTANCE = new UpdateStatusResponse();

        @Deprecated
        public static final Parser<UpdateStatusResponse> PARSER = new AbstractParser<UpdateStatusResponse>() { // from class: com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateStatusResponse.1
            @Override // com.google.protobuf.Parser
            public UpdateStatusResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UpdateStatusResponse.newBuilder();
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
        public static final int UPDATES_PENDING_ON_DISK_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int currentBundleVersion_;
        private byte memoizedIsInitialized;
        private int status_;
        private boolean updatesPendingOnDisk_;

        private UpdateStatusResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.updatesPendingOnDisk_ = false;
            this.currentBundleVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UpdateStatusResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateStatusResponse_descriptor;
        }

        public static Builder newBuilder(UpdateStatusResponse updateStatusResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(updateStatusResponse);
        }

        public static UpdateStatusResponse parseDelimitedFrom(InputStream inputStream) {
            return (UpdateStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UpdateStatusResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UpdateStatusResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateStatusResponse)) {
                return super.equals(obj);
            }
            UpdateStatusResponse updateStatusResponse = (UpdateStatusResponse) obj;
            if (hasStatus() != updateStatusResponse.hasStatus()) {
                return false;
            }
            if ((hasStatus() && this.status_ != updateStatusResponse.status_) || hasUpdatesPendingOnDisk() != updateStatusResponse.hasUpdatesPendingOnDisk()) {
                return false;
            }
            if ((!hasUpdatesPendingOnDisk() || getUpdatesPendingOnDisk() == updateStatusResponse.getUpdatesPendingOnDisk()) && hasCurrentBundleVersion() == updateStatusResponse.hasCurrentBundleVersion()) {
                return (!hasCurrentBundleVersion() || getCurrentBundleVersion() == updateStatusResponse.getCurrentBundleVersion()) && getUnknownFields().equals(updateStatusResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateStatusResponseOrBuilder
        public int getCurrentBundleVersion() {
            return this.currentBundleVersion_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UpdateStatusResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeBoolSize(2, this.updatesPendingOnDisk_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(3, this.currentBundleVersion_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateStatusResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateStatusResponseOrBuilder
        public boolean getUpdatesPendingOnDisk() {
            return this.updatesPendingOnDisk_;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateStatusResponseOrBuilder
        public boolean hasCurrentBundleVersion() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateStatusResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateStatusResponseOrBuilder
        public boolean hasUpdatesPendingOnDisk() {
            return (this.bitField0_ & 2) != 0;
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
            if (hasUpdatesPendingOnDisk()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getUpdatesPendingOnDisk());
            }
            if (hasCurrentBundleVersion()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getCurrentBundleVersion();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateStatusResponse.class, Builder.class);
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
            return new UpdateStatusResponse();
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
                codedOutputStream.writeBool(2, this.updatesPendingOnDisk_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.currentBundleVersion_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UpdateStatusResponseOrBuilder {
            private int bitField0_;
            private int currentBundleVersion_;
            private int status_;
            private boolean updatesPendingOnDisk_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(UpdateStatusResponse updateStatusResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    updateStatusResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    updateStatusResponse.updatesPendingOnDisk_ = this.updatesPendingOnDisk_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    updateStatusResponse.currentBundleVersion_ = this.currentBundleVersion_;
                    i14 |= 4;
                }
                updateStatusResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateStatusResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateStatusResponse build() {
                UpdateStatusResponse updateStatusResponseBuildPartial = buildPartial();
                if (updateStatusResponseBuildPartial.isInitialized()) {
                    return updateStatusResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) updateStatusResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateStatusResponse buildPartial() {
                UpdateStatusResponse updateStatusResponse = new UpdateStatusResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(updateStatusResponse);
                }
                onBuilt();
                return updateStatusResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.updatesPendingOnDisk_ = false;
                this.currentBundleVersion_ = 0;
                return this;
            }

            public Builder clearCurrentBundleVersion() {
                this.bitField0_ &= -5;
                this.currentBundleVersion_ = 0;
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

            public Builder clearStatus() {
                this.bitField0_ &= -2;
                this.status_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUpdatesPendingOnDisk() {
                this.bitField0_ &= -3;
                this.updatesPendingOnDisk_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateStatusResponseOrBuilder
            public int getCurrentBundleVersion() {
                return this.currentBundleVersion_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateStatusResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateStatusResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateStatusResponseOrBuilder
            public boolean getUpdatesPendingOnDisk() {
                return this.updatesPendingOnDisk_;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateStatusResponseOrBuilder
            public boolean hasCurrentBundleVersion() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateStatusResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateStatusResponseOrBuilder
            public boolean hasUpdatesPendingOnDisk() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISoftwareUpdateStatus.internal_static_GDI_Proto_SoftwareUpdateStatus_UpdateStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateStatusResponse.class, Builder.class);
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
                                } else if (tag == 16) {
                                    this.updatesPendingOnDisk_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.currentBundleVersion_ = codedInputStream.readUInt32();
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

            public Builder setCurrentBundleVersion(int i14) {
                this.currentBundleVersion_ = i14;
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

            public Builder setUpdatesPendingOnDisk(boolean z14) {
                this.updatesPendingOnDisk_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public UpdateStatusResponse getDefaultInstanceForType() {
                return UpdateStatusResponse.getDefaultInstance();
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
                if (message instanceof UpdateStatusResponse) {
                    return mergeFrom((UpdateStatusResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UpdateStatusResponse updateStatusResponse) {
                if (updateStatusResponse == UpdateStatusResponse.getDefaultInstance()) {
                    return this;
                }
                if (updateStatusResponse.hasStatus()) {
                    setStatus(updateStatusResponse.getStatus());
                }
                if (updateStatusResponse.hasUpdatesPendingOnDisk()) {
                    setUpdatesPendingOnDisk(updateStatusResponse.getUpdatesPendingOnDisk());
                }
                if (updateStatusResponse.hasCurrentBundleVersion()) {
                    setCurrentBundleVersion(updateStatusResponse.getCurrentBundleVersion());
                }
                mergeUnknownFields(updateStatusResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UpdateStatusResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UpdateStatusResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateStatusResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UpdateStatusResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UpdateStatusResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UpdateStatusResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UpdateStatusResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ UpdateStatusResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UpdateStatusResponse parseFrom(InputStream inputStream) {
            return (UpdateStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private UpdateStatusResponse() {
            this.updatesPendingOnDisk_ = false;
            this.currentBundleVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static UpdateStatusResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateStatusResponse parseFrom(CodedInputStream codedInputStream) {
            return (UpdateStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UpdateStatusResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN(0),
            IDLE(1),
            CHECKING(2),
            DOWNLOADING(3),
            DOWNLOAD_COMPLETE(4),
            APPLYING(5);

            public static final int APPLYING_VALUE = 5;
            public static final int CHECKING_VALUE = 2;
            public static final int DOWNLOADING_VALUE = 3;
            public static final int DOWNLOAD_COMPLETE_VALUE = 4;
            public static final int IDLE_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDISoftwareUpdateStatus.UpdateStatusResponse.Status.1
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
                    return IDLE;
                }
                if (i14 == 2) {
                    return CHECKING;
                }
                if (i14 == 3) {
                    return DOWNLOADING;
                }
                if (i14 == 4) {
                    return DOWNLOAD_COMPLETE;
                }
                if (i14 != 5) {
                    return null;
                }
                return APPLYING;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return UpdateStatusResponse.getDescriptor().getEnumTypes().get(0);
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
