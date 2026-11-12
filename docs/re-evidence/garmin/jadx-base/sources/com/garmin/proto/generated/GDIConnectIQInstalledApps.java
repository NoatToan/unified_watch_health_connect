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
public final class GDIConnectIQInstalledApps {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001fGDIConnectIQInstalledApps.proto\u0012 GDI.Proto.ConnectIQInstalledApps\u001a\rGDICore.proto\"å\n\n\u001dConnectIQInstalledAppsService\u0012]\n\u001aget_installed_apps_request\u0018\u0001 \u0001(\u000b29.GDI.Proto.ConnectIQInstalledApps.GetInstalledAppsRequest\u0012_\n\u001bget_installed_apps_response\u0018\u0002 \u0001(\u000b2:.GDI.Proto.ConnectIQInstalledApps.GetInstalledAppsResponse\u0012N\n\u0012delete_app_request\u0018\u0003 \u0001(\u000b22.GDI.Proto.ConnectIQInstalledApps.DeleteAppRequest\u0012P\n\u0013delete_app_response\u0018\u0004 \u0001(\u000b23.GDI.Proto.ConnectIQInstalledApps.DeleteAppResponse\u0012b\n\u001cupdate_installed_app_request\u0018\u0005 \u0001(\u000b2<.GDI.Proto.ConnectIQInstalledApps.UpdateInstalledAppsRequest\u0012d\n\u001dupdate_installed_app_response\u0018\u0006 \u0001(\u000b2=.GDI.Proto.ConnectIQInstalledApps.UpdateInstalledAppsResponse\u0012[\n\u0019enable_native_app_request\u0018\u0007 \u0001(\u000b28.GDI.Proto.ConnectIQInstalledApps.EnableNativeAppRequest\u0012]\n\u001aenable_native_app_response\u0018\b \u0001(\u000b29.GDI.Proto.ConnectIQInstalledApps.EnableNativeAppResponse\u0012N\n\u0012launch_app_request\u0018\t \u0001(\u000b22.GDI.Proto.ConnectIQInstalledApps.LaunchAppRequest\u0012P\n\u0013launch_app_response\u0018\n \u0001(\u000b23.GDI.Proto.ConnectIQInstalledApps.LaunchAppResponse\u0012y\n)update_faceit_project_id_mappings_request\u0018\u000b \u0001(\u000b2F.GDI.Proto.ConnectIQInstalledApps.UpdateFaceItProjectIdMappingsRequest\u0012{\n*update_faceit_project_id_mappings_response\u0018\f \u0001(\u000b2G.GDI.Proto.ConnectIQInstalledApps.UpdateFaceItProjectIdMappingsResponse\u0012_\n\u001bpending_app_install_request\u0018\r \u0001(\u000b2:.GDI.Proto.ConnectIQInstalledApps.PendingAppInstallRequest\u0012a\n\u001cpending_app_install_response\u0018\u000e \u0001(\u000b2;.GDI.Proto.ConnectIQInstalledApps.PendingAppInstallResponse\"V\n\u0017GetInstalledAppsRequest\u0012;\n\bapp_type\u0018\u0001 \u0002(\u000e2).GDI.Proto.ConnectIQInstalledApps.AppType\"©\u0003\n\u0018GetInstalledAppsResponse\u0012\u0017\n\u000favailable_space\u0018\u0001 \u0002(\u0004\u0012\u0017\n\u000favailable_slots\u0018\u0002 \u0002(\r\u0012^\n\rinstalled_app\u0018\u0003 \u0003(\u000b2G.GDI.Proto.ConnectIQInstalledApps.GetInstalledAppsResponse.InstalledApp\u001aú\u0001\n\fInstalledApp\u0012\u0014\n\fstore_app_id\u0018\u0001 \u0002(\f\u0012;\n\bapp_type\u0018\u0002 \u0002(\u000e2).GDI.Proto.ConnectIQInstalledApps.AppType\u0012\f\n\u0004name\u0018\u0003 \u0002(\t\u0012\u0010\n\bdisabled\u0018\u0004 \u0002(\b\u0012\u000f\n\u0007version\u0018\u0005 \u0001(\r\u0012\u0010\n\bfilename\u0018\u0006 \u0001(\t\u0012\u0010\n\bfilesize\u0018\u0007 \u0001(\u0004\u0012\u0015\n\rnative_app_id\u0018\b \u0001(\r\u0012\u0010\n\bfavorite\u0018\t \u0001(\b\u0012\u0019\n\u0011faceit_project_id\u0018\n \u0001(\t\"e\n\u0010DeleteAppRequest\u0012\u0014\n\fstore_app_id\u0018\u0001 \u0002(\f\u0012;\n\bapp_type\u0018\u0002 \u0002(\u000e2).GDI.Proto.ConnectIQInstalledApps.AppType\"\u009b\u0001\n\u0011DeleteAppResponse\u0012J\n\u0006status\u0018\u0001 \u0002(\u000e2:.GDI.Proto.ConnectIQInstalledApps.DeleteAppResponse.Status\":\n\u0006Status\u0012\u0012\n\u000eUNKNOWN_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0014\n\u0010FAILED_TO_DELETE\u0010\u0002\"\u0087\u0002\n\u001aUpdateInstalledAppsRequest\u0012`\n\rinstalled_app\u0018\u0001 \u0003(\u000b2I.GDI.Proto.ConnectIQInstalledApps.UpdateInstalledAppsRequest.InstalledApp\u001a\u0086\u0001\n\fInstalledApp\u0012\u000e\n\u0006app_id\u0018\u0001 \u0002(\f\u0012;\n\bapp_type\u0018\u0002 \u0002(\u000e2).GDI.Proto.ConnectIQInstalledApps.AppType\u0012\u0017\n\bdisabled\u0018\u0003 \u0002(\b:\u0005false\u0012\u0010\n\bfavorite\u0018\u0004 \u0001(\b\"¯\u0001\n\u001bUpdateInstalledAppsResponse\u0012T\n\u0006status\u0018\u0001 \u0002(\u000e2D.GDI.Proto.ConnectIQInstalledApps.UpdateInstalledAppsResponse.Status\":\n\u0006Status\u0012\u0012\n\u000eUNKNOWN_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0014\n\u0010FAILED_TO_UPDATE\u0010\u0002\"|\n\u0016EnableNativeAppRequest\u0012\u0015\n\rnative_app_id\u0018\u0001 \u0002(\r\u0012;\n\bapp_type\u0018\u0002 \u0002(\u000e2).GDI.Proto.ConnectIQInstalledApps.AppType\u0012\u000e\n\u0006app_id\u0018\u0003 \u0001(\f\"©\u0001\n\u0017EnableNativeAppResponse\u0012P\n\u0006status\u0018\u0001 \u0002(\u000e2@.GDI.Proto.ConnectIQInstalledApps.EnableNativeAppResponse.Status\"<\n\u0006Status\u0012\u0012\n\u000eUNKNOWN_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0016\n\u0012INVALID_NATIVE_APP\u0010\u0002\"©\u0002\n\u0010LaunchAppRequest\u0012\u0010\n\bapp_uuid\u0018\u0001 \u0002(\f\u0012X\n\u0010app_startup_mode\u0018\u0002 \u0002(\u000e2>.GDI.Proto.ConnectIQInstalledApps.LaunchAppRequest.StartUpMode\"¨\u0001\n\u000bStartUpMode\u0012\u001b\n\u0017APP_STARTUP_MODE_NORMAL\u0010\u0000\u00121\n-APP_STARTUP_MODE_MEDIA_PLAYBACK_CONFIGURATION\u0010\u0001\u0012-\n)APP_STARTUP_MODE_MEDIA_SYNC_CONFIGURATION\u0010\u0002\u0012\u001a\n\u0016APP_STARTUP_MODE_NO_UI\u0010\u0003\"ò\u0001\n\u0011LaunchAppResponse\u0012J\n\u0006status\u0018\u0001 \u0002(\u000e2:.GDI.Proto.ConnectIQInstalledApps.LaunchAppResponse.Status\"\u0090\u0001\n\u0006Status\u0012\u0019\n\u0015LAUNCH_STATUS_SUCCESS\u0010\u0000\u0012%\n!LAUNCH_STATUS_APP_ALREADY_RUNNING\u0010\u0001\u0012#\n\u001fLAUNCH_STATUS_APP_NOT_INSTALLED\u0010\u0002\u0012\u001f\n\u001bLAUNCH_STATUS_UNKNOWN_ERROR\u0010\u0003\"V\n$UpdateFaceItProjectIdMappingsRequest\u0012\u000e\n\u0006slot_1\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006slot_2\u0018\u0002 \u0001(\t\u0012\u000e\n\u0006slot_3\u0018\u0003 \u0001(\t\"\u008c\u0003\n%UpdateFaceItProjectIdMappingsResponse\u0012e\n\rslot_1_status\u0018\u0001 \u0001(\u000e2N.GDI.Proto.ConnectIQInstalledApps.UpdateFaceItProjectIdMappingsResponse.Status\u0012e\n\rslot_2_status\u0018\u0002 \u0001(\u000e2N.GDI.Proto.ConnectIQInstalledApps.UpdateFaceItProjectIdMappingsResponse.Status\u0012e\n\rslot_3_status\u0018\u0003 \u0001(\u000e2N.GDI.Proto.ConnectIQInstalledApps.UpdateFaceItProjectIdMappingsResponse.Status\".\n\u0006Status\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\r\n\tNO_CHANGE\u0010\u0001\u0012\b\n\u0004FAIL\u0010\u0002\"\u008d\u0001\n\u0018PendingAppInstallRequest\u0012;\n\bapp_type\u0018\u0001 \u0001(\u000e2).GDI.Proto.ConnectIQInstalledApps.AppType\u0012\u0014\n\fstore_app_id\u0018\u0002 \u0001(\f\u0012\u0010\n\bapp_uuid\u0018\u0003 \u0001(\f\u0012\f\n\u0004name\u0018\u0004 \u0001(\t\"É\u0001\n\u0019PendingAppInstallResponse\u0012R\n\u0006status\u0018\u0001 \u0001(\u000e2B.GDI.Proto.ConnectIQInstalledApps.PendingAppInstallResponse.Status\"X\n\u0006Status\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\b\n\u0004FAIL\u0010\u0001\u0012\u0012\n\u000eNO_CIQ_SUPPORT\u0010\u0002\u0012\u0015\n\u0011ALREADY_INSTALLED\u0010\u0003\u0012\f\n\bNO_SPACE\u0010\u0004\"¤\u0001\n\u0013CapabilitiesRequest2\u008c\u0001\n!connect_iq_installed_apps_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018\u001d \u0001(\u000b25.GDI.Proto.ConnectIQInstalledApps.CapabilitiesRequest\"\u009f\u0002\n\u0014CapabilitiesResponse\u0012\u001d\n\u0015support_faceit_slot_1\u0018\u0001 \u0001(\b\u0012\u001d\n\u0015support_faceit_slot_2\u0018\u0002 \u0001(\b\u0012\u001d\n\u0015support_faceit_slot_3\u0018\u0003 \u0001(\b\u0012\u0018\n\u0010service_revision\u0018\u0004 \u0001(\r2\u008f\u0001\n\"connect_iq_installed_apps_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018\u001d \u0001(\u000b26.GDI.Proto.ConnectIQInstalledApps.CapabilitiesResponse*\u0097\u0001\n\u0007AppType\u0012\u0014\n\u0010UNKNOWN_APP_TYPE\u0010\u0000\u0012\r\n\tWATCH_APP\u0010\u0001\u0012\n\n\u0006WIDGET\u0010\u0002\u0012\u000e\n\nWATCH_FACE\u0010\u0003\u0012\u000e\n\nDATA_FIELD\u0010\u0004\u0012\u0007\n\u0003ALL\u0010\u0005\u0012\b\n\u0004NONE\u0010\u0006\u0012\u001a\n\u0016AUDIO_CONTENT_PROVIDER\u0010\u0007\u0012\f\n\bACTIVITY\u0010\bB9\n\u001acom.garmin.proto.generatedB\u0019GDIConnectIQInstalledAppsH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQInstalledApps_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQInstalledApps_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQInstalledApps_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQInstalledApps_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQInstalledApps_ConnectIQInstalledAppsService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQInstalledApps_ConnectIQInstalledAppsService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQInstalledApps_DeleteAppRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQInstalledApps_DeleteAppRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQInstalledApps_DeleteAppResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQInstalledApps_DeleteAppResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQInstalledApps_EnableNativeAppRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQInstalledApps_EnableNativeAppRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQInstalledApps_EnableNativeAppResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQInstalledApps_EnableNativeAppResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsResponse_InstalledApp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsResponse_InstalledApp_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQInstalledApps_LaunchAppRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQInstalledApps_LaunchAppRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQInstalledApps_LaunchAppResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQInstalledApps_LaunchAppResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQInstalledApps_PendingAppInstallRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQInstalledApps_PendingAppInstallRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQInstalledApps_PendingAppInstallResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQInstalledApps_PendingAppInstallResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateFaceItProjectIdMappingsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateFaceItProjectIdMappingsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateFaceItProjectIdMappingsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateFaceItProjectIdMappingsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsRequest_InstalledApp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsRequest_InstalledApp_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsResponse_fieldAccessorTable;

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        int getServiceRevision();

        boolean getSupportFaceitSlot1();

        boolean getSupportFaceitSlot2();

        boolean getSupportFaceitSlot3();

        boolean hasServiceRevision();

        boolean hasSupportFaceitSlot1();

        boolean hasSupportFaceitSlot2();

        boolean hasSupportFaceitSlot3();
    }

    public interface ConnectIQInstalledAppsServiceOrBuilder extends MessageOrBuilder {
        DeleteAppRequest getDeleteAppRequest();

        DeleteAppRequestOrBuilder getDeleteAppRequestOrBuilder();

        DeleteAppResponse getDeleteAppResponse();

        DeleteAppResponseOrBuilder getDeleteAppResponseOrBuilder();

        EnableNativeAppRequest getEnableNativeAppRequest();

        EnableNativeAppRequestOrBuilder getEnableNativeAppRequestOrBuilder();

        EnableNativeAppResponse getEnableNativeAppResponse();

        EnableNativeAppResponseOrBuilder getEnableNativeAppResponseOrBuilder();

        GetInstalledAppsRequest getGetInstalledAppsRequest();

        GetInstalledAppsRequestOrBuilder getGetInstalledAppsRequestOrBuilder();

        GetInstalledAppsResponse getGetInstalledAppsResponse();

        GetInstalledAppsResponseOrBuilder getGetInstalledAppsResponseOrBuilder();

        LaunchAppRequest getLaunchAppRequest();

        LaunchAppRequestOrBuilder getLaunchAppRequestOrBuilder();

        LaunchAppResponse getLaunchAppResponse();

        LaunchAppResponseOrBuilder getLaunchAppResponseOrBuilder();

        PendingAppInstallRequest getPendingAppInstallRequest();

        PendingAppInstallRequestOrBuilder getPendingAppInstallRequestOrBuilder();

        PendingAppInstallResponse getPendingAppInstallResponse();

        PendingAppInstallResponseOrBuilder getPendingAppInstallResponseOrBuilder();

        UpdateFaceItProjectIdMappingsRequest getUpdateFaceitProjectIdMappingsRequest();

        UpdateFaceItProjectIdMappingsRequestOrBuilder getUpdateFaceitProjectIdMappingsRequestOrBuilder();

        UpdateFaceItProjectIdMappingsResponse getUpdateFaceitProjectIdMappingsResponse();

        UpdateFaceItProjectIdMappingsResponseOrBuilder getUpdateFaceitProjectIdMappingsResponseOrBuilder();

        UpdateInstalledAppsRequest getUpdateInstalledAppRequest();

        UpdateInstalledAppsRequestOrBuilder getUpdateInstalledAppRequestOrBuilder();

        UpdateInstalledAppsResponse getUpdateInstalledAppResponse();

        UpdateInstalledAppsResponseOrBuilder getUpdateInstalledAppResponseOrBuilder();

        boolean hasDeleteAppRequest();

        boolean hasDeleteAppResponse();

        boolean hasEnableNativeAppRequest();

        boolean hasEnableNativeAppResponse();

        boolean hasGetInstalledAppsRequest();

        boolean hasGetInstalledAppsResponse();

        boolean hasLaunchAppRequest();

        boolean hasLaunchAppResponse();

        boolean hasPendingAppInstallRequest();

        boolean hasPendingAppInstallResponse();

        boolean hasUpdateFaceitProjectIdMappingsRequest();

        boolean hasUpdateFaceitProjectIdMappingsResponse();

        boolean hasUpdateInstalledAppRequest();

        boolean hasUpdateInstalledAppResponse();
    }

    public interface DeleteAppRequestOrBuilder extends MessageOrBuilder {
        AppType getAppType();

        ByteString getStoreAppId();

        boolean hasAppType();

        boolean hasStoreAppId();
    }

    public interface DeleteAppResponseOrBuilder extends MessageOrBuilder {
        DeleteAppResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface EnableNativeAppRequestOrBuilder extends MessageOrBuilder {
        ByteString getAppId();

        AppType getAppType();

        int getNativeAppId();

        boolean hasAppId();

        boolean hasAppType();

        boolean hasNativeAppId();
    }

    public interface EnableNativeAppResponseOrBuilder extends MessageOrBuilder {
        EnableNativeAppResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface GetInstalledAppsRequestOrBuilder extends MessageOrBuilder {
        AppType getAppType();

        boolean hasAppType();
    }

    public interface GetInstalledAppsResponseOrBuilder extends MessageOrBuilder {
        int getAvailableSlots();

        long getAvailableSpace();

        GetInstalledAppsResponse.InstalledApp getInstalledApp(int i14);

        int getInstalledAppCount();

        List<GetInstalledAppsResponse.InstalledApp> getInstalledAppList();

        GetInstalledAppsResponse.InstalledAppOrBuilder getInstalledAppOrBuilder(int i14);

        List<? extends GetInstalledAppsResponse.InstalledAppOrBuilder> getInstalledAppOrBuilderList();

        boolean hasAvailableSlots();

        boolean hasAvailableSpace();
    }

    public interface LaunchAppRequestOrBuilder extends MessageOrBuilder {
        LaunchAppRequest.StartUpMode getAppStartupMode();

        ByteString getAppUuid();

        boolean hasAppStartupMode();

        boolean hasAppUuid();
    }

    public interface LaunchAppResponseOrBuilder extends MessageOrBuilder {
        LaunchAppResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface PendingAppInstallRequestOrBuilder extends MessageOrBuilder {
        AppType getAppType();

        ByteString getAppUuid();

        String getName();

        ByteString getNameBytes();

        ByteString getStoreAppId();

        boolean hasAppType();

        boolean hasAppUuid();

        boolean hasName();

        boolean hasStoreAppId();
    }

    public interface PendingAppInstallResponseOrBuilder extends MessageOrBuilder {
        PendingAppInstallResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface UpdateFaceItProjectIdMappingsRequestOrBuilder extends MessageOrBuilder {
        String getSlot1();

        ByteString getSlot1Bytes();

        String getSlot2();

        ByteString getSlot2Bytes();

        String getSlot3();

        ByteString getSlot3Bytes();

        boolean hasSlot1();

        boolean hasSlot2();

        boolean hasSlot3();
    }

    public interface UpdateFaceItProjectIdMappingsResponseOrBuilder extends MessageOrBuilder {
        UpdateFaceItProjectIdMappingsResponse.Status getSlot1Status();

        UpdateFaceItProjectIdMappingsResponse.Status getSlot2Status();

        UpdateFaceItProjectIdMappingsResponse.Status getSlot3Status();

        boolean hasSlot1Status();

        boolean hasSlot2Status();

        boolean hasSlot3Status();
    }

    public interface UpdateInstalledAppsRequestOrBuilder extends MessageOrBuilder {
        UpdateInstalledAppsRequest.InstalledApp getInstalledApp(int i14);

        int getInstalledAppCount();

        List<UpdateInstalledAppsRequest.InstalledApp> getInstalledAppList();

        UpdateInstalledAppsRequest.InstalledAppOrBuilder getInstalledAppOrBuilder(int i14);

        List<? extends UpdateInstalledAppsRequest.InstalledAppOrBuilder> getInstalledAppOrBuilderList();
    }

    public interface UpdateInstalledAppsResponseOrBuilder extends MessageOrBuilder {
        UpdateInstalledAppsResponse.Status getStatus();

        boolean hasStatus();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_ConnectIQInstalledApps_ConnectIQInstalledAppsService_descriptor = descriptor2;
        internal_static_GDI_Proto_ConnectIQInstalledApps_ConnectIQInstalledAppsService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"GetInstalledAppsRequest", "GetInstalledAppsResponse", "DeleteAppRequest", "DeleteAppResponse", "UpdateInstalledAppRequest", "UpdateInstalledAppResponse", "EnableNativeAppRequest", "EnableNativeAppResponse", "LaunchAppRequest", "LaunchAppResponse", "UpdateFaceitProjectIdMappingsRequest", "UpdateFaceitProjectIdMappingsResponse", "PendingAppInstallRequest", "PendingAppInstallResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"AppType"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"AvailableSpace", "AvailableSlots", "InstalledApp"});
        Descriptors.Descriptor descriptor5 = descriptor4.getNestedTypes().get(0);
        internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsResponse_InstalledApp_descriptor = descriptor5;
        internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsResponse_InstalledApp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"StoreAppId", "AppType", "Name", "Disabled", "Version", "Filename", "Filesize", "NativeAppId", "Favorite", "FaceitProjectId"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_ConnectIQInstalledApps_DeleteAppRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_ConnectIQInstalledApps_DeleteAppRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"StoreAppId", "AppType"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_ConnectIQInstalledApps_DeleteAppResponse_descriptor = descriptor7;
        internal_static_GDI_Proto_ConnectIQInstalledApps_DeleteAppResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Status"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsRequest_descriptor = descriptor8;
        internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"InstalledApp"});
        Descriptors.Descriptor descriptor9 = descriptor8.getNestedTypes().get(0);
        internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsRequest_InstalledApp_descriptor = descriptor9;
        internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsRequest_InstalledApp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"AppId", "AppType", "Disabled", "Favorite"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsResponse_descriptor = descriptor10;
        internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Status"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_ConnectIQInstalledApps_EnableNativeAppRequest_descriptor = descriptor11;
        internal_static_GDI_Proto_ConnectIQInstalledApps_EnableNativeAppRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"NativeAppId", "AppType", "AppId"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_ConnectIQInstalledApps_EnableNativeAppResponse_descriptor = descriptor12;
        internal_static_GDI_Proto_ConnectIQInstalledApps_EnableNativeAppResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Status"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_ConnectIQInstalledApps_LaunchAppRequest_descriptor = descriptor13;
        internal_static_GDI_Proto_ConnectIQInstalledApps_LaunchAppRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"AppUuid", "AppStartupMode"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_ConnectIQInstalledApps_LaunchAppResponse_descriptor = descriptor14;
        internal_static_GDI_Proto_ConnectIQInstalledApps_LaunchAppResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Status"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateFaceItProjectIdMappingsRequest_descriptor = descriptor15;
        internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateFaceItProjectIdMappingsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Slot1", "Slot2", "Slot3"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(12);
        internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateFaceItProjectIdMappingsResponse_descriptor = descriptor16;
        internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateFaceItProjectIdMappingsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Slot1Status", "Slot2Status", "Slot3Status"});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(13);
        internal_static_GDI_Proto_ConnectIQInstalledApps_PendingAppInstallRequest_descriptor = descriptor17;
        internal_static_GDI_Proto_ConnectIQInstalledApps_PendingAppInstallRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"AppType", "StoreAppId", "AppUuid", "Name"});
        Descriptors.Descriptor descriptor18 = getDescriptor().getMessageTypes().get(14);
        internal_static_GDI_Proto_ConnectIQInstalledApps_PendingAppInstallResponse_descriptor = descriptor18;
        internal_static_GDI_Proto_ConnectIQInstalledApps_PendingAppInstallResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"Status"});
        Descriptors.Descriptor descriptor19 = getDescriptor().getMessageTypes().get(15);
        internal_static_GDI_Proto_ConnectIQInstalledApps_CapabilitiesRequest_descriptor = descriptor19;
        internal_static_GDI_Proto_ConnectIQInstalledApps_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[0]);
        Descriptors.Descriptor descriptor20 = getDescriptor().getMessageTypes().get(16);
        internal_static_GDI_Proto_ConnectIQInstalledApps_CapabilitiesResponse_descriptor = descriptor20;
        internal_static_GDI_Proto_ConnectIQInstalledApps_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"SupportFaceitSlot1", "SupportFaceitSlot2", "SupportFaceitSlot3", "ServiceRevision"});
        GDICore.getDescriptor();
    }

    private GDIConnectIQInstalledApps() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.connectIqInstalledAppsRequest);
        extensionRegistryLite.add(CapabilitiesResponse.connectIqInstalledAppsResponse);
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int CONNECT_IQ_INSTALLED_APPS_REQUEST_FIELD_NUMBER = 29;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.CapabilitiesRequest.1
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, CapabilitiesRequest> connectIqInstalledAppsRequest = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesRequest.class, getDefaultInstance());
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        private CapabilitiesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_CapabilitiesRequest_descriptor;
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
            if (obj instanceof CapabilitiesRequest) {
                return getUnknownFields().equals(((CapabilitiesRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
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
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_CapabilitiesRequest_descriptor;
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
                onBuilt();
                return capabilitiesRequest;
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
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_CapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
            public CapabilitiesRequest getDefaultInstanceForType() {
                return CapabilitiesRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
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
        public static final int CONNECT_IQ_INSTALLED_APPS_RESPONSE_FIELD_NUMBER = 29;
        public static final int SERVICE_REVISION_FIELD_NUMBER = 4;
        public static final int SUPPORT_FACEIT_SLOT_1_FIELD_NUMBER = 1;
        public static final int SUPPORT_FACEIT_SLOT_2_FIELD_NUMBER = 2;
        public static final int SUPPORT_FACEIT_SLOT_3_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int serviceRevision_;
        private boolean supportFaceitSlot1_;
        private boolean supportFaceitSlot2_;
        private boolean supportFaceitSlot3_;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.CapabilitiesResponse.1
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, CapabilitiesResponse> connectIqInstalledAppsResponse = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesResponse.class, getDefaultInstance());

        private CapabilitiesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.supportFaceitSlot1_ = false;
            this.supportFaceitSlot2_ = false;
            this.supportFaceitSlot3_ = false;
            this.serviceRevision_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_CapabilitiesResponse_descriptor;
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
            if (hasSupportFaceitSlot1() != capabilitiesResponse.hasSupportFaceitSlot1()) {
                return false;
            }
            if ((hasSupportFaceitSlot1() && getSupportFaceitSlot1() != capabilitiesResponse.getSupportFaceitSlot1()) || hasSupportFaceitSlot2() != capabilitiesResponse.hasSupportFaceitSlot2()) {
                return false;
            }
            if ((hasSupportFaceitSlot2() && getSupportFaceitSlot2() != capabilitiesResponse.getSupportFaceitSlot2()) || hasSupportFaceitSlot3() != capabilitiesResponse.hasSupportFaceitSlot3()) {
                return false;
            }
            if ((!hasSupportFaceitSlot3() || getSupportFaceitSlot3() == capabilitiesResponse.getSupportFaceitSlot3()) && hasServiceRevision() == capabilitiesResponse.hasServiceRevision()) {
                return (!hasServiceRevision() || getServiceRevision() == capabilitiesResponse.getServiceRevision()) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
            }
            return false;
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
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.supportFaceitSlot1_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(2, this.supportFaceitSlot2_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(3, this.supportFaceitSlot3_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt32Size(4, this.serviceRevision_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.CapabilitiesResponseOrBuilder
        public int getServiceRevision() {
            return this.serviceRevision_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.CapabilitiesResponseOrBuilder
        public boolean getSupportFaceitSlot1() {
            return this.supportFaceitSlot1_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.CapabilitiesResponseOrBuilder
        public boolean getSupportFaceitSlot2() {
            return this.supportFaceitSlot2_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.CapabilitiesResponseOrBuilder
        public boolean getSupportFaceitSlot3() {
            return this.supportFaceitSlot3_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.CapabilitiesResponseOrBuilder
        public boolean hasServiceRevision() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.CapabilitiesResponseOrBuilder
        public boolean hasSupportFaceitSlot1() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.CapabilitiesResponseOrBuilder
        public boolean hasSupportFaceitSlot2() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.CapabilitiesResponseOrBuilder
        public boolean hasSupportFaceitSlot3() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSupportFaceitSlot1()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getSupportFaceitSlot1());
            }
            if (hasSupportFaceitSlot2()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getSupportFaceitSlot2());
            }
            if (hasSupportFaceitSlot3()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getSupportFaceitSlot3());
            }
            if (hasServiceRevision()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getServiceRevision();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                codedOutputStream.writeBool(1, this.supportFaceitSlot1_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.supportFaceitSlot2_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.supportFaceitSlot3_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.serviceRevision_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private int bitField0_;
            private int serviceRevision_;
            private boolean supportFaceitSlot1_;
            private boolean supportFaceitSlot2_;
            private boolean supportFaceitSlot3_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    capabilitiesResponse.supportFaceitSlot1_ = this.supportFaceitSlot1_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    capabilitiesResponse.supportFaceitSlot2_ = this.supportFaceitSlot2_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    capabilitiesResponse.supportFaceitSlot3_ = this.supportFaceitSlot3_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    capabilitiesResponse.serviceRevision_ = this.serviceRevision_;
                    i14 |= 8;
                }
                capabilitiesResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_CapabilitiesResponse_descriptor;
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
                this.supportFaceitSlot1_ = false;
                this.supportFaceitSlot2_ = false;
                this.supportFaceitSlot3_ = false;
                this.serviceRevision_ = 0;
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

            public Builder clearServiceRevision() {
                this.bitField0_ &= -9;
                this.serviceRevision_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSupportFaceitSlot1() {
                this.bitField0_ &= -2;
                this.supportFaceitSlot1_ = false;
                onChanged();
                return this;
            }

            public Builder clearSupportFaceitSlot2() {
                this.bitField0_ &= -3;
                this.supportFaceitSlot2_ = false;
                onChanged();
                return this;
            }

            public Builder clearSupportFaceitSlot3() {
                this.bitField0_ &= -5;
                this.supportFaceitSlot3_ = false;
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
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.CapabilitiesResponseOrBuilder
            public int getServiceRevision() {
                return this.serviceRevision_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.CapabilitiesResponseOrBuilder
            public boolean getSupportFaceitSlot1() {
                return this.supportFaceitSlot1_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.CapabilitiesResponseOrBuilder
            public boolean getSupportFaceitSlot2() {
                return this.supportFaceitSlot2_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.CapabilitiesResponseOrBuilder
            public boolean getSupportFaceitSlot3() {
                return this.supportFaceitSlot3_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.CapabilitiesResponseOrBuilder
            public boolean hasServiceRevision() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.CapabilitiesResponseOrBuilder
            public boolean hasSupportFaceitSlot1() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.CapabilitiesResponseOrBuilder
            public boolean hasSupportFaceitSlot2() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.CapabilitiesResponseOrBuilder
            public boolean hasSupportFaceitSlot3() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                                    this.supportFaceitSlot1_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.supportFaceitSlot2_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.supportFaceitSlot3_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.serviceRevision_ = codedInputStream.readUInt32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setServiceRevision(int i14) {
                this.serviceRevision_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSupportFaceitSlot1(boolean z14) {
                this.supportFaceitSlot1_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSupportFaceitSlot2(boolean z14) {
                this.supportFaceitSlot2_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSupportFaceitSlot3(boolean z14) {
                this.supportFaceitSlot3_ = z14;
                this.bitField0_ |= 4;
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
            public CapabilitiesResponse getDefaultInstanceForType() {
                return CapabilitiesResponse.getDefaultInstance();
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
                if (capabilitiesResponse.hasSupportFaceitSlot1()) {
                    setSupportFaceitSlot1(capabilitiesResponse.getSupportFaceitSlot1());
                }
                if (capabilitiesResponse.hasSupportFaceitSlot2()) {
                    setSupportFaceitSlot2(capabilitiesResponse.getSupportFaceitSlot2());
                }
                if (capabilitiesResponse.hasSupportFaceitSlot3()) {
                    setSupportFaceitSlot3(capabilitiesResponse.getSupportFaceitSlot3());
                }
                if (capabilitiesResponse.hasServiceRevision()) {
                    setServiceRevision(capabilitiesResponse.getServiceRevision());
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

        public /* synthetic */ CapabilitiesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CapabilitiesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private CapabilitiesResponse() {
            this.supportFaceitSlot1_ = false;
            this.supportFaceitSlot2_ = false;
            this.supportFaceitSlot3_ = false;
            this.serviceRevision_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse parseFrom(CodedInputStream codedInputStream) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CapabilitiesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetInstalledAppsResponse extends GeneratedMessageV3 implements GetInstalledAppsResponseOrBuilder {
        public static final int AVAILABLE_SLOTS_FIELD_NUMBER = 2;
        public static final int AVAILABLE_SPACE_FIELD_NUMBER = 1;
        public static final int INSTALLED_APP_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int availableSlots_;
        private long availableSpace_;
        private int bitField0_;
        private List<InstalledApp> installedApp_;
        private byte memoizedIsInitialized;
        private static final GetInstalledAppsResponse DEFAULT_INSTANCE = new GetInstalledAppsResponse();

        @Deprecated
        public static final Parser<GetInstalledAppsResponse> PARSER = new AbstractParser<GetInstalledAppsResponse>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.1
            @Override // com.google.protobuf.Parser
            public GetInstalledAppsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetInstalledAppsResponse.newBuilder();
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

        public interface InstalledAppOrBuilder extends MessageOrBuilder {
            AppType getAppType();

            boolean getDisabled();

            String getFaceitProjectId();

            ByteString getFaceitProjectIdBytes();

            boolean getFavorite();

            String getFilename();

            ByteString getFilenameBytes();

            long getFilesize();

            String getName();

            ByteString getNameBytes();

            int getNativeAppId();

            ByteString getStoreAppId();

            int getVersion();

            boolean hasAppType();

            boolean hasDisabled();

            boolean hasFaceitProjectId();

            boolean hasFavorite();

            boolean hasFilename();

            boolean hasFilesize();

            boolean hasName();

            boolean hasNativeAppId();

            boolean hasStoreAppId();

            boolean hasVersion();
        }

        private GetInstalledAppsResponse() {
            this.availableSpace_ = 0L;
            this.availableSlots_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.installedApp_ = Collections.EMPTY_LIST;
        }

        public static GetInstalledAppsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsResponse_descriptor;
        }

        public static Builder newBuilder(GetInstalledAppsResponse getInstalledAppsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getInstalledAppsResponse);
        }

        public static GetInstalledAppsResponse parseDelimitedFrom(InputStream inputStream) {
            return (GetInstalledAppsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetInstalledAppsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetInstalledAppsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetInstalledAppsResponse)) {
                return super.equals(obj);
            }
            GetInstalledAppsResponse getInstalledAppsResponse = (GetInstalledAppsResponse) obj;
            if (hasAvailableSpace() != getInstalledAppsResponse.hasAvailableSpace()) {
                return false;
            }
            if ((!hasAvailableSpace() || getAvailableSpace() == getInstalledAppsResponse.getAvailableSpace()) && hasAvailableSlots() == getInstalledAppsResponse.hasAvailableSlots()) {
                return (!hasAvailableSlots() || getAvailableSlots() == getInstalledAppsResponse.getAvailableSlots()) && getInstalledAppList().equals(getInstalledAppsResponse.getInstalledAppList()) && getUnknownFields().equals(getInstalledAppsResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponseOrBuilder
        public int getAvailableSlots() {
            return this.availableSlots_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponseOrBuilder
        public long getAvailableSpace() {
            return this.availableSpace_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponseOrBuilder
        public InstalledApp getInstalledApp(int i14) {
            return this.installedApp_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponseOrBuilder
        public int getInstalledAppCount() {
            return this.installedApp_.size();
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponseOrBuilder
        public List<InstalledApp> getInstalledAppList() {
            return this.installedApp_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponseOrBuilder
        public InstalledAppOrBuilder getInstalledAppOrBuilder(int i14) {
            return this.installedApp_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponseOrBuilder
        public List<? extends InstalledAppOrBuilder> getInstalledAppOrBuilderList() {
            return this.installedApp_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetInstalledAppsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt64Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt64Size(1, this.availableSpace_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt32Size(2, this.availableSlots_);
            }
            for (int i15 = 0; i15 < this.installedApp_.size(); i15++) {
                iComputeUInt64Size += CodedOutputStream.computeMessageSize(3, this.installedApp_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponseOrBuilder
        public boolean hasAvailableSlots() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponseOrBuilder
        public boolean hasAvailableSpace() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAvailableSpace()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashLong(getAvailableSpace());
            }
            if (hasAvailableSlots()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getAvailableSlots();
            }
            if (getInstalledAppCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getInstalledAppList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetInstalledAppsResponse.class, Builder.class);
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
            if (!hasAvailableSpace()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAvailableSlots()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i14 = 0; i14 < getInstalledAppCount(); i14++) {
                if (!getInstalledApp(i14).isInitialized()) {
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
            return new GetInstalledAppsResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt64(1, this.availableSpace_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.availableSlots_);
            }
            for (int i14 = 0; i14 < this.installedApp_.size(); i14++) {
                codedOutputStream.writeMessage(3, this.installedApp_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class InstalledApp extends GeneratedMessageV3 implements InstalledAppOrBuilder {
            public static final int APP_TYPE_FIELD_NUMBER = 2;
            public static final int DISABLED_FIELD_NUMBER = 4;
            public static final int FACEIT_PROJECT_ID_FIELD_NUMBER = 10;
            public static final int FAVORITE_FIELD_NUMBER = 9;
            public static final int FILENAME_FIELD_NUMBER = 6;
            public static final int FILESIZE_FIELD_NUMBER = 7;
            public static final int NAME_FIELD_NUMBER = 3;
            public static final int NATIVE_APP_ID_FIELD_NUMBER = 8;
            public static final int STORE_APP_ID_FIELD_NUMBER = 1;
            public static final int VERSION_FIELD_NUMBER = 5;
            private static final long serialVersionUID = 0;
            private int appType_;
            private int bitField0_;
            private boolean disabled_;
            private volatile Object faceitProjectId_;
            private boolean favorite_;
            private volatile Object filename_;
            private long filesize_;
            private byte memoizedIsInitialized;
            private volatile Object name_;
            private int nativeAppId_;
            private ByteString storeAppId_;
            private int version_;
            private static final InstalledApp DEFAULT_INSTANCE = new InstalledApp();

            @Deprecated
            public static final Parser<InstalledApp> PARSER = new AbstractParser<InstalledApp>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledApp.1
                @Override // com.google.protobuf.Parser
                public InstalledApp parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = InstalledApp.newBuilder();
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

            private InstalledApp() {
                ByteString byteString = ByteString.EMPTY;
                this.storeAppId_ = byteString;
                this.appType_ = 0;
                this.name_ = "";
                this.disabled_ = false;
                this.version_ = 0;
                this.filename_ = "";
                this.filesize_ = 0L;
                this.nativeAppId_ = 0;
                this.favorite_ = false;
                this.faceitProjectId_ = "";
                this.memoizedIsInitialized = (byte) -1;
                this.storeAppId_ = byteString;
                this.appType_ = 0;
                this.name_ = "";
                this.filename_ = "";
                this.faceitProjectId_ = "";
            }

            public static InstalledApp getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsResponse_InstalledApp_descriptor;
            }

            public static Builder newBuilder(InstalledApp installedApp) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(installedApp);
            }

            public static InstalledApp parseDelimitedFrom(InputStream inputStream) {
                return (InstalledApp) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static InstalledApp parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<InstalledApp> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof InstalledApp)) {
                    return super.equals(obj);
                }
                InstalledApp installedApp = (InstalledApp) obj;
                if (hasStoreAppId() != installedApp.hasStoreAppId()) {
                    return false;
                }
                if ((hasStoreAppId() && !getStoreAppId().equals(installedApp.getStoreAppId())) || hasAppType() != installedApp.hasAppType()) {
                    return false;
                }
                if ((hasAppType() && this.appType_ != installedApp.appType_) || hasName() != installedApp.hasName()) {
                    return false;
                }
                if ((hasName() && !getName().equals(installedApp.getName())) || hasDisabled() != installedApp.hasDisabled()) {
                    return false;
                }
                if ((hasDisabled() && getDisabled() != installedApp.getDisabled()) || hasVersion() != installedApp.hasVersion()) {
                    return false;
                }
                if ((hasVersion() && getVersion() != installedApp.getVersion()) || hasFilename() != installedApp.hasFilename()) {
                    return false;
                }
                if ((hasFilename() && !getFilename().equals(installedApp.getFilename())) || hasFilesize() != installedApp.hasFilesize()) {
                    return false;
                }
                if ((hasFilesize() && getFilesize() != installedApp.getFilesize()) || hasNativeAppId() != installedApp.hasNativeAppId()) {
                    return false;
                }
                if ((hasNativeAppId() && getNativeAppId() != installedApp.getNativeAppId()) || hasFavorite() != installedApp.hasFavorite()) {
                    return false;
                }
                if ((!hasFavorite() || getFavorite() == installedApp.getFavorite()) && hasFaceitProjectId() == installedApp.hasFaceitProjectId()) {
                    return (!hasFaceitProjectId() || getFaceitProjectId().equals(installedApp.getFaceitProjectId())) && getUnknownFields().equals(installedApp.getUnknownFields());
                }
                return false;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public AppType getAppType() {
                AppType appTypeForNumber = AppType.forNumber(this.appType_);
                return appTypeForNumber == null ? AppType.UNKNOWN_APP_TYPE : appTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public boolean getDisabled() {
                return this.disabled_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public String getFaceitProjectId() {
                Object obj = this.faceitProjectId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.faceitProjectId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public ByteString getFaceitProjectIdBytes() {
                Object obj = this.faceitProjectId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.faceitProjectId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public boolean getFavorite() {
                return this.favorite_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public String getFilename() {
                Object obj = this.filename_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.filename_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public ByteString getFilenameBytes() {
                Object obj = this.filename_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.filename_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public long getFilesize() {
                return this.filesize_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public int getNativeAppId() {
                return this.nativeAppId_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<InstalledApp> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i14 = this.memoizedSize;
                if (i14 != -1) {
                    return i14;
                }
                int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.storeAppId_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeBytesSize += CodedOutputStream.computeEnumSize(2, this.appType_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    iComputeBytesSize += GeneratedMessageV3.computeStringSize(3, this.name_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    iComputeBytesSize += CodedOutputStream.computeBoolSize(4, this.disabled_);
                }
                if ((this.bitField0_ & 16) != 0) {
                    iComputeBytesSize += CodedOutputStream.computeUInt32Size(5, this.version_);
                }
                if ((this.bitField0_ & 32) != 0) {
                    iComputeBytesSize += GeneratedMessageV3.computeStringSize(6, this.filename_);
                }
                if ((this.bitField0_ & 64) != 0) {
                    iComputeBytesSize += CodedOutputStream.computeUInt64Size(7, this.filesize_);
                }
                if ((this.bitField0_ & 128) != 0) {
                    iComputeBytesSize += CodedOutputStream.computeUInt32Size(8, this.nativeAppId_);
                }
                if ((this.bitField0_ & 256) != 0) {
                    iComputeBytesSize += CodedOutputStream.computeBoolSize(9, this.favorite_);
                }
                if ((this.bitField0_ & 512) != 0) {
                    iComputeBytesSize += GeneratedMessageV3.computeStringSize(10, this.faceitProjectId_);
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public ByteString getStoreAppId() {
                return this.storeAppId_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public int getVersion() {
                return this.version_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public boolean hasAppType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public boolean hasDisabled() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public boolean hasFaceitProjectId() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public boolean hasFavorite() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public boolean hasFilename() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public boolean hasFilesize() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public boolean hasNativeAppId() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public boolean hasStoreAppId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
            public boolean hasVersion() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i14 = this.memoizedHashCode;
                if (i14 != 0) {
                    return i14;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasStoreAppId()) {
                    iHashCode = e5.c(iHashCode, 37, 1, 53) + getStoreAppId().hashCode();
                }
                if (hasAppType()) {
                    iHashCode = e5.c(iHashCode, 37, 2, 53) + this.appType_;
                }
                if (hasName()) {
                    iHashCode = e5.c(iHashCode, 37, 3, 53) + getName().hashCode();
                }
                if (hasDisabled()) {
                    iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getDisabled());
                }
                if (hasVersion()) {
                    iHashCode = e5.c(iHashCode, 37, 5, 53) + getVersion();
                }
                if (hasFilename()) {
                    iHashCode = e5.c(iHashCode, 37, 6, 53) + getFilename().hashCode();
                }
                if (hasFilesize()) {
                    iHashCode = e5.c(iHashCode, 37, 7, 53) + Internal.hashLong(getFilesize());
                }
                if (hasNativeAppId()) {
                    iHashCode = e5.c(iHashCode, 37, 8, 53) + getNativeAppId();
                }
                if (hasFavorite()) {
                    iHashCode = e5.c(iHashCode, 37, 9, 53) + Internal.hashBoolean(getFavorite());
                }
                if (hasFaceitProjectId()) {
                    iHashCode = e5.c(iHashCode, 37, 10, 53) + getFaceitProjectId().hashCode();
                }
                int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsResponse_InstalledApp_fieldAccessorTable.ensureFieldAccessorsInitialized(InstalledApp.class, Builder.class);
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
                if (!hasStoreAppId()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!hasAppType()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!hasName()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (hasDisabled()) {
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
                return new InstalledApp();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                int i14 = 0;
                return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeBytes(1, this.storeAppId_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeEnum(2, this.appType_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 3, this.name_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    codedOutputStream.writeBool(4, this.disabled_);
                }
                if ((this.bitField0_ & 16) != 0) {
                    codedOutputStream.writeUInt32(5, this.version_);
                }
                if ((this.bitField0_ & 32) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 6, this.filename_);
                }
                if ((this.bitField0_ & 64) != 0) {
                    codedOutputStream.writeUInt64(7, this.filesize_);
                }
                if ((this.bitField0_ & 128) != 0) {
                    codedOutputStream.writeUInt32(8, this.nativeAppId_);
                }
                if ((this.bitField0_ & 256) != 0) {
                    codedOutputStream.writeBool(9, this.favorite_);
                }
                if ((this.bitField0_ & 512) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 10, this.faceitProjectId_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InstalledAppOrBuilder {
                private int appType_;
                private int bitField0_;
                private boolean disabled_;
                private Object faceitProjectId_;
                private boolean favorite_;
                private Object filename_;
                private long filesize_;
                private Object name_;
                private int nativeAppId_;
                private ByteString storeAppId_;
                private int version_;

                private Builder() {
                    this.storeAppId_ = ByteString.EMPTY;
                    this.appType_ = 0;
                    this.name_ = "";
                    this.filename_ = "";
                    this.faceitProjectId_ = "";
                }

                private void buildPartial0(InstalledApp installedApp) {
                    int i14;
                    int i15 = this.bitField0_;
                    if ((i15 & 1) != 0) {
                        installedApp.storeAppId_ = this.storeAppId_;
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    if ((i15 & 2) != 0) {
                        installedApp.appType_ = this.appType_;
                        i14 |= 2;
                    }
                    if ((i15 & 4) != 0) {
                        installedApp.name_ = this.name_;
                        i14 |= 4;
                    }
                    if ((i15 & 8) != 0) {
                        installedApp.disabled_ = this.disabled_;
                        i14 |= 8;
                    }
                    if ((i15 & 16) != 0) {
                        installedApp.version_ = this.version_;
                        i14 |= 16;
                    }
                    if ((i15 & 32) != 0) {
                        installedApp.filename_ = this.filename_;
                        i14 |= 32;
                    }
                    if ((i15 & 64) != 0) {
                        installedApp.filesize_ = this.filesize_;
                        i14 |= 64;
                    }
                    if ((i15 & 128) != 0) {
                        installedApp.nativeAppId_ = this.nativeAppId_;
                        i14 |= 128;
                    }
                    if ((i15 & 256) != 0) {
                        installedApp.favorite_ = this.favorite_;
                        i14 |= 256;
                    }
                    if ((i15 & 512) != 0) {
                        installedApp.faceitProjectId_ = this.faceitProjectId_;
                        i14 |= 512;
                    }
                    installedApp.bitField0_ |= i14;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsResponse_InstalledApp_descriptor;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public InstalledApp build() {
                    InstalledApp installedAppBuildPartial = buildPartial();
                    if (installedAppBuildPartial.isInitialized()) {
                        return installedAppBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) installedAppBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public InstalledApp buildPartial() {
                    InstalledApp installedApp = new InstalledApp(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(installedApp);
                    }
                    onBuilt();
                    return installedApp;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.storeAppId_ = ByteString.EMPTY;
                    this.appType_ = 0;
                    this.name_ = "";
                    this.disabled_ = false;
                    this.version_ = 0;
                    this.filename_ = "";
                    this.filesize_ = 0L;
                    this.nativeAppId_ = 0;
                    this.favorite_ = false;
                    this.faceitProjectId_ = "";
                    return this;
                }

                public Builder clearAppType() {
                    this.bitField0_ &= -3;
                    this.appType_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearDisabled() {
                    this.bitField0_ &= -9;
                    this.disabled_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearFaceitProjectId() {
                    this.faceitProjectId_ = InstalledApp.getDefaultInstance().getFaceitProjectId();
                    this.bitField0_ &= -513;
                    onChanged();
                    return this;
                }

                public Builder clearFavorite() {
                    this.bitField0_ &= -257;
                    this.favorite_ = false;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                public Builder clearFilename() {
                    this.filename_ = InstalledApp.getDefaultInstance().getFilename();
                    this.bitField0_ &= -33;
                    onChanged();
                    return this;
                }

                public Builder clearFilesize() {
                    this.bitField0_ &= -65;
                    this.filesize_ = 0L;
                    onChanged();
                    return this;
                }

                public Builder clearName() {
                    this.name_ = InstalledApp.getDefaultInstance().getName();
                    this.bitField0_ &= -5;
                    onChanged();
                    return this;
                }

                public Builder clearNativeAppId() {
                    this.bitField0_ &= -129;
                    this.nativeAppId_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (Builder) super.clearOneof(oneofDescriptor);
                }

                public Builder clearStoreAppId() {
                    this.bitField0_ &= -2;
                    this.storeAppId_ = InstalledApp.getDefaultInstance().getStoreAppId();
                    onChanged();
                    return this;
                }

                public Builder clearVersion() {
                    this.bitField0_ &= -17;
                    this.version_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo57clone() {
                    return (Builder) super.mo57clone();
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public AppType getAppType() {
                    AppType appTypeForNumber = AppType.forNumber(this.appType_);
                    return appTypeForNumber == null ? AppType.UNKNOWN_APP_TYPE : appTypeForNumber;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsResponse_InstalledApp_descriptor;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public boolean getDisabled() {
                    return this.disabled_;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public String getFaceitProjectId() {
                    Object obj = this.faceitProjectId_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.faceitProjectId_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public ByteString getFaceitProjectIdBytes() {
                    Object obj = this.faceitProjectId_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.faceitProjectId_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public boolean getFavorite() {
                    return this.favorite_;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public String getFilename() {
                    Object obj = this.filename_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.filename_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public ByteString getFilenameBytes() {
                    Object obj = this.filename_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.filename_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public long getFilesize() {
                    return this.filesize_;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.name_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public ByteString getNameBytes() {
                    Object obj = this.name_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public int getNativeAppId() {
                    return this.nativeAppId_;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public ByteString getStoreAppId() {
                    return this.storeAppId_;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public int getVersion() {
                    return this.version_;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public boolean hasAppType() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public boolean hasDisabled() {
                    return (this.bitField0_ & 8) != 0;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public boolean hasFaceitProjectId() {
                    return (this.bitField0_ & 512) != 0;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public boolean hasFavorite() {
                    return (this.bitField0_ & 256) != 0;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public boolean hasFilename() {
                    return (this.bitField0_ & 32) != 0;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public boolean hasFilesize() {
                    return (this.bitField0_ & 64) != 0;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public boolean hasName() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public boolean hasNativeAppId() {
                    return (this.bitField0_ & 128) != 0;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public boolean hasStoreAppId() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledAppOrBuilder
                public boolean hasVersion() {
                    return (this.bitField0_ & 16) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsResponse_InstalledApp_fieldAccessorTable.ensureFieldAccessorsInitialized(InstalledApp.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasStoreAppId() && hasAppType() && hasName() && hasDisabled();
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
                                        this.storeAppId_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 1;
                                        continue;
                                    case 16:
                                        int i14 = codedInputStream.readEnum();
                                        if (AppType.forNumber(i14) == null) {
                                            mergeUnknownVarintField(2, i14);
                                        } else {
                                            this.appType_ = i14;
                                            this.bitField0_ |= 2;
                                            continue;
                                        }
                                        break;
                                    case 26:
                                        this.name_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 4;
                                        continue;
                                    case 32:
                                        this.disabled_ = codedInputStream.readBool();
                                        this.bitField0_ |= 8;
                                        continue;
                                    case 40:
                                        this.version_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 16;
                                        continue;
                                    case 50:
                                        this.filename_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 32;
                                        continue;
                                    case 56:
                                        this.filesize_ = codedInputStream.readUInt64();
                                        this.bitField0_ |= 64;
                                        continue;
                                    case 64:
                                        this.nativeAppId_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 128;
                                        continue;
                                    case 72:
                                        this.favorite_ = codedInputStream.readBool();
                                        this.bitField0_ |= 256;
                                        continue;
                                    case 82:
                                        this.faceitProjectId_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 512;
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

                public Builder setAppType(AppType appType) {
                    appType.getClass();
                    this.bitField0_ |= 2;
                    this.appType_ = appType.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setDisabled(boolean z14) {
                    this.disabled_ = z14;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder setFaceitProjectId(String str) {
                    str.getClass();
                    this.faceitProjectId_ = str;
                    this.bitField0_ |= 512;
                    onChanged();
                    return this;
                }

                public Builder setFaceitProjectIdBytes(ByteString byteString) {
                    byteString.getClass();
                    this.faceitProjectId_ = byteString;
                    this.bitField0_ |= 512;
                    onChanged();
                    return this;
                }

                public Builder setFavorite(boolean z14) {
                    this.favorite_ = z14;
                    this.bitField0_ |= 256;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                public Builder setFilename(String str) {
                    str.getClass();
                    this.filename_ = str;
                    this.bitField0_ |= 32;
                    onChanged();
                    return this;
                }

                public Builder setFilenameBytes(ByteString byteString) {
                    byteString.getClass();
                    this.filename_ = byteString;
                    this.bitField0_ |= 32;
                    onChanged();
                    return this;
                }

                public Builder setFilesize(long j8) {
                    this.filesize_ = j8;
                    this.bitField0_ |= 64;
                    onChanged();
                    return this;
                }

                public Builder setName(String str) {
                    str.getClass();
                    this.name_ = str;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setNameBytes(ByteString byteString) {
                    byteString.getClass();
                    this.name_ = byteString;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setNativeAppId(int i14) {
                    this.nativeAppId_ = i14;
                    this.bitField0_ |= 128;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                    return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
                }

                public Builder setStoreAppId(ByteString byteString) {
                    byteString.getClass();
                    this.storeAppId_ = byteString;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                public Builder setVersion(int i14) {
                    this.version_ = i14;
                    this.bitField0_ |= 16;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public InstalledApp getDefaultInstanceForType() {
                    return InstalledApp.getDefaultInstance();
                }

                public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                    this(builderParent);
                }

                public /* synthetic */ Builder(int i14) {
                    this();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.storeAppId_ = ByteString.EMPTY;
                    this.appType_ = 0;
                    this.name_ = "";
                    this.filename_ = "";
                    this.faceitProjectId_ = "";
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof InstalledApp) {
                        return mergeFrom((InstalledApp) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(InstalledApp installedApp) {
                    if (installedApp == InstalledApp.getDefaultInstance()) {
                        return this;
                    }
                    if (installedApp.hasStoreAppId()) {
                        setStoreAppId(installedApp.getStoreAppId());
                    }
                    if (installedApp.hasAppType()) {
                        setAppType(installedApp.getAppType());
                    }
                    if (installedApp.hasName()) {
                        this.name_ = installedApp.name_;
                        this.bitField0_ |= 4;
                        onChanged();
                    }
                    if (installedApp.hasDisabled()) {
                        setDisabled(installedApp.getDisabled());
                    }
                    if (installedApp.hasVersion()) {
                        setVersion(installedApp.getVersion());
                    }
                    if (installedApp.hasFilename()) {
                        this.filename_ = installedApp.filename_;
                        this.bitField0_ |= 32;
                        onChanged();
                    }
                    if (installedApp.hasFilesize()) {
                        setFilesize(installedApp.getFilesize());
                    }
                    if (installedApp.hasNativeAppId()) {
                        setNativeAppId(installedApp.getNativeAppId());
                    }
                    if (installedApp.hasFavorite()) {
                        setFavorite(installedApp.getFavorite());
                    }
                    if (installedApp.hasFaceitProjectId()) {
                        this.faceitProjectId_ = installedApp.faceitProjectId_;
                        this.bitField0_ |= 512;
                        onChanged();
                    }
                    mergeUnknownFields(installedApp.getUnknownFields());
                    onChanged();
                    return this;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public InstalledApp getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static InstalledApp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (InstalledApp) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static InstalledApp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static InstalledApp parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static InstalledApp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static InstalledApp parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            public static InstalledApp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static InstalledApp parseFrom(InputStream inputStream) {
                return (InstalledApp) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static InstalledApp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (InstalledApp) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static InstalledApp parseFrom(CodedInputStream codedInputStream) {
                return (InstalledApp) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static InstalledApp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (InstalledApp) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            private InstalledApp(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.storeAppId_ = ByteString.EMPTY;
                this.appType_ = 0;
                this.name_ = "";
                this.disabled_ = false;
                this.version_ = 0;
                this.filename_ = "";
                this.filesize_ = 0L;
                this.nativeAppId_ = 0;
                this.favorite_ = false;
                this.faceitProjectId_ = "";
                this.memoizedIsInitialized = (byte) -1;
            }

            public /* synthetic */ InstalledApp(Builder builder) {
                this((GeneratedMessageV3.Builder<?>) builder);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetInstalledAppsResponseOrBuilder {
            private int availableSlots_;
            private long availableSpace_;
            private int bitField0_;
            private RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> installedAppBuilder_;
            private List<InstalledApp> installedApp_;

            private Builder() {
                this.installedApp_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(GetInstalledAppsResponse getInstalledAppsResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    getInstalledAppsResponse.availableSpace_ = this.availableSpace_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    getInstalledAppsResponse.availableSlots_ = this.availableSlots_;
                    i14 |= 2;
                }
                getInstalledAppsResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(GetInstalledAppsResponse getInstalledAppsResponse) {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    getInstalledAppsResponse.installedApp_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 4) != 0) {
                    this.installedApp_ = Collections.unmodifiableList(this.installedApp_);
                    this.bitField0_ &= -5;
                }
                getInstalledAppsResponse.installedApp_ = this.installedApp_;
            }

            private void ensureInstalledAppIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.installedApp_ = new ArrayList(this.installedApp_);
                    this.bitField0_ |= 4;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> getInstalledAppFieldBuilder() {
                if (this.installedAppBuilder_ == null) {
                    this.installedAppBuilder_ = new RepeatedFieldBuilderV3<>(this.installedApp_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.installedApp_ = null;
                }
                return this.installedAppBuilder_;
            }

            public Builder addAllInstalledApp(Iterable<? extends InstalledApp> iterable) {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureInstalledAppIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.installedApp_);
                onChanged();
                return this;
            }

            public Builder addInstalledApp(InstalledApp.Builder builder) {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureInstalledAppIsMutable();
                this.installedApp_.add(builder.build());
                onChanged();
                return this;
            }

            public InstalledApp.Builder addInstalledAppBuilder() {
                return (InstalledApp.Builder) getInstalledAppFieldBuilder().addBuilder(InstalledApp.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetInstalledAppsResponse build() {
                GetInstalledAppsResponse getInstalledAppsResponseBuildPartial = buildPartial();
                if (getInstalledAppsResponseBuildPartial.isInitialized()) {
                    return getInstalledAppsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getInstalledAppsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetInstalledAppsResponse buildPartial() {
                GetInstalledAppsResponse getInstalledAppsResponse = new GetInstalledAppsResponse(this);
                buildPartialRepeatedFields(getInstalledAppsResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(getInstalledAppsResponse);
                }
                onBuilt();
                return getInstalledAppsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.availableSpace_ = 0L;
                this.availableSlots_ = 0;
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.installedApp_ = Collections.EMPTY_LIST;
                } else {
                    this.installedApp_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -5;
                return this;
            }

            public Builder clearAvailableSlots() {
                this.bitField0_ &= -3;
                this.availableSlots_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAvailableSpace() {
                this.bitField0_ &= -2;
                this.availableSpace_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearInstalledApp() {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.installedApp_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
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

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponseOrBuilder
            public int getAvailableSlots() {
                return this.availableSlots_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponseOrBuilder
            public long getAvailableSpace() {
                return this.availableSpace_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponseOrBuilder
            public InstalledApp getInstalledApp(int i14) {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                return repeatedFieldBuilderV3 == null ? this.installedApp_.get(i14) : (InstalledApp) repeatedFieldBuilderV3.getMessage(i14);
            }

            public InstalledApp.Builder getInstalledAppBuilder(int i14) {
                return (InstalledApp.Builder) getInstalledAppFieldBuilder().getBuilder(i14);
            }

            public List<InstalledApp.Builder> getInstalledAppBuilderList() {
                return getInstalledAppFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponseOrBuilder
            public int getInstalledAppCount() {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                return repeatedFieldBuilderV3 == null ? this.installedApp_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponseOrBuilder
            public List<InstalledApp> getInstalledAppList() {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.installedApp_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponseOrBuilder
            public InstalledAppOrBuilder getInstalledAppOrBuilder(int i14) {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                return repeatedFieldBuilderV3 == null ? this.installedApp_.get(i14) : (InstalledAppOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponseOrBuilder
            public List<? extends InstalledAppOrBuilder> getInstalledAppOrBuilderList() {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.installedApp_);
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponseOrBuilder
            public boolean hasAvailableSlots() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsResponseOrBuilder
            public boolean hasAvailableSpace() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetInstalledAppsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasAvailableSpace() || !hasAvailableSlots()) {
                    return false;
                }
                for (int i14 = 0; i14 < getInstalledAppCount(); i14++) {
                    if (!getInstalledApp(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(GetInstalledAppsResponse getInstalledAppsResponse) {
                if (getInstalledAppsResponse == GetInstalledAppsResponse.getDefaultInstance()) {
                    return this;
                }
                if (getInstalledAppsResponse.hasAvailableSpace()) {
                    setAvailableSpace(getInstalledAppsResponse.getAvailableSpace());
                }
                if (getInstalledAppsResponse.hasAvailableSlots()) {
                    setAvailableSlots(getInstalledAppsResponse.getAvailableSlots());
                }
                if (this.installedAppBuilder_ == null) {
                    if (!getInstalledAppsResponse.installedApp_.isEmpty()) {
                        if (this.installedApp_.isEmpty()) {
                            this.installedApp_ = getInstalledAppsResponse.installedApp_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureInstalledAppIsMutable();
                            this.installedApp_.addAll(getInstalledAppsResponse.installedApp_);
                        }
                        onChanged();
                    }
                } else if (!getInstalledAppsResponse.installedApp_.isEmpty()) {
                    boolean zIsEmpty = this.installedAppBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.installedAppBuilder_ = null;
                        this.installedApp_ = getInstalledAppsResponse.installedApp_;
                        this.bitField0_ &= -5;
                        this.installedAppBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getInstalledAppFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(getInstalledAppsResponse.installedApp_);
                    }
                }
                mergeUnknownFields(getInstalledAppsResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeInstalledApp(int i14) {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureInstalledAppIsMutable();
                this.installedApp_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setAvailableSlots(int i14) {
                this.availableSlots_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setAvailableSpace(long j8) {
                this.availableSpace_ = j8;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setInstalledApp(int i14, InstalledApp.Builder builder) {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureInstalledAppIsMutable();
                this.installedApp_.set(i14, builder.build());
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
            public GetInstalledAppsResponse getDefaultInstanceForType() {
                return GetInstalledAppsResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.installedApp_ = Collections.EMPTY_LIST;
            }

            public InstalledApp.Builder addInstalledAppBuilder(int i14) {
                return (InstalledApp.Builder) getInstalledAppFieldBuilder().addBuilder(i14, InstalledApp.getDefaultInstance());
            }

            public Builder addInstalledApp(int i14, InstalledApp installedApp) {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    installedApp.getClass();
                    ensureInstalledAppIsMutable();
                    this.installedApp_.add(i14, installedApp);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, installedApp);
                return this;
            }

            public Builder setInstalledApp(int i14, InstalledApp installedApp) {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    installedApp.getClass();
                    ensureInstalledAppIsMutable();
                    this.installedApp_.set(i14, installedApp);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, installedApp);
                return this;
            }

            public Builder addInstalledApp(InstalledApp installedApp) {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    installedApp.getClass();
                    ensureInstalledAppIsMutable();
                    this.installedApp_.add(installedApp);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(installedApp);
                return this;
            }

            public Builder addInstalledApp(int i14, InstalledApp.Builder builder) {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureInstalledAppIsMutable();
                    this.installedApp_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetInstalledAppsResponse) {
                    return mergeFrom((GetInstalledAppsResponse) message);
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
                                    this.availableSpace_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.availableSlots_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    InstalledApp installedApp = (InstalledApp) codedInputStream.readMessage(InstalledApp.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureInstalledAppIsMutable();
                                        this.installedApp_.add(installedApp);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(installedApp);
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
        public GetInstalledAppsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GetInstalledAppsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetInstalledAppsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetInstalledAppsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetInstalledAppsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetInstalledAppsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetInstalledAppsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetInstalledAppsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetInstalledAppsResponse parseFrom(InputStream inputStream) {
            return (GetInstalledAppsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetInstalledAppsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetInstalledAppsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private GetInstalledAppsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.availableSpace_ = 0L;
            this.availableSlots_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetInstalledAppsResponse parseFrom(CodedInputStream codedInputStream) {
            return (GetInstalledAppsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetInstalledAppsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetInstalledAppsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ GetInstalledAppsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class UpdateInstalledAppsRequest extends GeneratedMessageV3 implements UpdateInstalledAppsRequestOrBuilder {
        public static final int INSTALLED_APP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<InstalledApp> installedApp_;
        private byte memoizedIsInitialized;
        private static final UpdateInstalledAppsRequest DEFAULT_INSTANCE = new UpdateInstalledAppsRequest();

        @Deprecated
        public static final Parser<UpdateInstalledAppsRequest> PARSER = new AbstractParser<UpdateInstalledAppsRequest>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequest.1
            @Override // com.google.protobuf.Parser
            public UpdateInstalledAppsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UpdateInstalledAppsRequest.newBuilder();
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

        public interface InstalledAppOrBuilder extends MessageOrBuilder {
            ByteString getAppId();

            AppType getAppType();

            boolean getDisabled();

            boolean getFavorite();

            boolean hasAppId();

            boolean hasAppType();

            boolean hasDisabled();

            boolean hasFavorite();
        }

        private UpdateInstalledAppsRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.installedApp_ = Collections.EMPTY_LIST;
        }

        public static UpdateInstalledAppsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsRequest_descriptor;
        }

        public static Builder newBuilder(UpdateInstalledAppsRequest updateInstalledAppsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(updateInstalledAppsRequest);
        }

        public static UpdateInstalledAppsRequest parseDelimitedFrom(InputStream inputStream) {
            return (UpdateInstalledAppsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UpdateInstalledAppsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UpdateInstalledAppsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateInstalledAppsRequest)) {
                return super.equals(obj);
            }
            UpdateInstalledAppsRequest updateInstalledAppsRequest = (UpdateInstalledAppsRequest) obj;
            return getInstalledAppList().equals(updateInstalledAppsRequest.getInstalledAppList()) && getUnknownFields().equals(updateInstalledAppsRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequestOrBuilder
        public InstalledApp getInstalledApp(int i14) {
            return this.installedApp_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequestOrBuilder
        public int getInstalledAppCount() {
            return this.installedApp_.size();
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequestOrBuilder
        public List<InstalledApp> getInstalledAppList() {
            return this.installedApp_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequestOrBuilder
        public InstalledAppOrBuilder getInstalledAppOrBuilder(int i14) {
            return this.installedApp_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequestOrBuilder
        public List<? extends InstalledAppOrBuilder> getInstalledAppOrBuilderList() {
            return this.installedApp_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UpdateInstalledAppsRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.installedApp_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.installedApp_.get(i15));
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
            if (getInstalledAppCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getInstalledAppList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateInstalledAppsRequest.class, Builder.class);
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
            for (int i14 = 0; i14 < getInstalledAppCount(); i14++) {
                if (!getInstalledApp(i14).isInitialized()) {
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
            return new UpdateInstalledAppsRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.installedApp_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.installedApp_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class InstalledApp extends GeneratedMessageV3 implements InstalledAppOrBuilder {
            public static final int APP_ID_FIELD_NUMBER = 1;
            public static final int APP_TYPE_FIELD_NUMBER = 2;
            public static final int DISABLED_FIELD_NUMBER = 3;
            public static final int FAVORITE_FIELD_NUMBER = 4;
            private static final long serialVersionUID = 0;
            private ByteString appId_;
            private int appType_;
            private int bitField0_;
            private boolean disabled_;
            private boolean favorite_;
            private byte memoizedIsInitialized;
            private static final InstalledApp DEFAULT_INSTANCE = new InstalledApp();

            @Deprecated
            public static final Parser<InstalledApp> PARSER = new AbstractParser<InstalledApp>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequest.InstalledApp.1
                @Override // com.google.protobuf.Parser
                public InstalledApp parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = InstalledApp.newBuilder();
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

            private InstalledApp(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.appId_ = ByteString.EMPTY;
                this.appType_ = 0;
                this.disabled_ = false;
                this.favorite_ = false;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static InstalledApp getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsRequest_InstalledApp_descriptor;
            }

            public static Builder newBuilder(InstalledApp installedApp) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(installedApp);
            }

            public static InstalledApp parseDelimitedFrom(InputStream inputStream) {
                return (InstalledApp) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static InstalledApp parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<InstalledApp> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof InstalledApp)) {
                    return super.equals(obj);
                }
                InstalledApp installedApp = (InstalledApp) obj;
                if (hasAppId() != installedApp.hasAppId()) {
                    return false;
                }
                if ((hasAppId() && !getAppId().equals(installedApp.getAppId())) || hasAppType() != installedApp.hasAppType()) {
                    return false;
                }
                if ((hasAppType() && this.appType_ != installedApp.appType_) || hasDisabled() != installedApp.hasDisabled()) {
                    return false;
                }
                if ((!hasDisabled() || getDisabled() == installedApp.getDisabled()) && hasFavorite() == installedApp.hasFavorite()) {
                    return (!hasFavorite() || getFavorite() == installedApp.getFavorite()) && getUnknownFields().equals(installedApp.getUnknownFields());
                }
                return false;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequest.InstalledAppOrBuilder
            public ByteString getAppId() {
                return this.appId_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequest.InstalledAppOrBuilder
            public AppType getAppType() {
                AppType appTypeForNumber = AppType.forNumber(this.appType_);
                return appTypeForNumber == null ? AppType.UNKNOWN_APP_TYPE : appTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequest.InstalledAppOrBuilder
            public boolean getDisabled() {
                return this.disabled_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequest.InstalledAppOrBuilder
            public boolean getFavorite() {
                return this.favorite_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<InstalledApp> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i14 = this.memoizedSize;
                if (i14 != -1) {
                    return i14;
                }
                int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.appId_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeBytesSize += CodedOutputStream.computeEnumSize(2, this.appType_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    iComputeBytesSize += CodedOutputStream.computeBoolSize(3, this.disabled_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    iComputeBytesSize += CodedOutputStream.computeBoolSize(4, this.favorite_);
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequest.InstalledAppOrBuilder
            public boolean hasAppId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequest.InstalledAppOrBuilder
            public boolean hasAppType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequest.InstalledAppOrBuilder
            public boolean hasDisabled() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequest.InstalledAppOrBuilder
            public boolean hasFavorite() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i14 = this.memoizedHashCode;
                if (i14 != 0) {
                    return i14;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasAppId()) {
                    iHashCode = e5.c(iHashCode, 37, 1, 53) + getAppId().hashCode();
                }
                if (hasAppType()) {
                    iHashCode = e5.c(iHashCode, 37, 2, 53) + this.appType_;
                }
                if (hasDisabled()) {
                    iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getDisabled());
                }
                if (hasFavorite()) {
                    iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getFavorite());
                }
                int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsRequest_InstalledApp_fieldAccessorTable.ensureFieldAccessorsInitialized(InstalledApp.class, Builder.class);
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
                if (!hasAppId()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!hasAppType()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (hasDisabled()) {
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
                return new InstalledApp();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                int i14 = 0;
                return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeBytes(1, this.appId_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeEnum(2, this.appType_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    codedOutputStream.writeBool(3, this.disabled_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    codedOutputStream.writeBool(4, this.favorite_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InstalledAppOrBuilder {
                private ByteString appId_;
                private int appType_;
                private int bitField0_;
                private boolean disabled_;
                private boolean favorite_;

                private Builder() {
                    this.appId_ = ByteString.EMPTY;
                    this.appType_ = 0;
                }

                private void buildPartial0(InstalledApp installedApp) {
                    int i14;
                    int i15 = this.bitField0_;
                    if ((i15 & 1) != 0) {
                        installedApp.appId_ = this.appId_;
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    if ((i15 & 2) != 0) {
                        installedApp.appType_ = this.appType_;
                        i14 |= 2;
                    }
                    if ((i15 & 4) != 0) {
                        installedApp.disabled_ = this.disabled_;
                        i14 |= 4;
                    }
                    if ((i15 & 8) != 0) {
                        installedApp.favorite_ = this.favorite_;
                        i14 |= 8;
                    }
                    installedApp.bitField0_ |= i14;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsRequest_InstalledApp_descriptor;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public InstalledApp build() {
                    InstalledApp installedAppBuildPartial = buildPartial();
                    if (installedAppBuildPartial.isInitialized()) {
                        return installedAppBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) installedAppBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public InstalledApp buildPartial() {
                    InstalledApp installedApp = new InstalledApp(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(installedApp);
                    }
                    onBuilt();
                    return installedApp;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.appId_ = ByteString.EMPTY;
                    this.appType_ = 0;
                    this.disabled_ = false;
                    this.favorite_ = false;
                    return this;
                }

                public Builder clearAppId() {
                    this.bitField0_ &= -2;
                    this.appId_ = InstalledApp.getDefaultInstance().getAppId();
                    onChanged();
                    return this;
                }

                public Builder clearAppType() {
                    this.bitField0_ &= -3;
                    this.appType_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearDisabled() {
                    this.bitField0_ &= -5;
                    this.disabled_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearFavorite() {
                    this.bitField0_ &= -9;
                    this.favorite_ = false;
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

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequest.InstalledAppOrBuilder
                public ByteString getAppId() {
                    return this.appId_;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequest.InstalledAppOrBuilder
                public AppType getAppType() {
                    AppType appTypeForNumber = AppType.forNumber(this.appType_);
                    return appTypeForNumber == null ? AppType.UNKNOWN_APP_TYPE : appTypeForNumber;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsRequest_InstalledApp_descriptor;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequest.InstalledAppOrBuilder
                public boolean getDisabled() {
                    return this.disabled_;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequest.InstalledAppOrBuilder
                public boolean getFavorite() {
                    return this.favorite_;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequest.InstalledAppOrBuilder
                public boolean hasAppId() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequest.InstalledAppOrBuilder
                public boolean hasAppType() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequest.InstalledAppOrBuilder
                public boolean hasDisabled() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequest.InstalledAppOrBuilder
                public boolean hasFavorite() {
                    return (this.bitField0_ & 8) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsRequest_InstalledApp_fieldAccessorTable.ensureFieldAccessorsInitialized(InstalledApp.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasAppId() && hasAppType() && hasDisabled();
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
                                        this.appId_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 1;
                                    } else if (tag == 16) {
                                        int i14 = codedInputStream.readEnum();
                                        if (AppType.forNumber(i14) == null) {
                                            mergeUnknownVarintField(2, i14);
                                        } else {
                                            this.appType_ = i14;
                                            this.bitField0_ |= 2;
                                        }
                                    } else if (tag == 24) {
                                        this.disabled_ = codedInputStream.readBool();
                                        this.bitField0_ |= 4;
                                    } else if (tag == 32) {
                                        this.favorite_ = codedInputStream.readBool();
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

                public Builder setAppId(ByteString byteString) {
                    byteString.getClass();
                    this.appId_ = byteString;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setAppType(AppType appType) {
                    appType.getClass();
                    this.bitField0_ |= 2;
                    this.appType_ = appType.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setDisabled(boolean z14) {
                    this.disabled_ = z14;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setFavorite(boolean z14) {
                    this.favorite_ = z14;
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

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public InstalledApp getDefaultInstanceForType() {
                    return InstalledApp.getDefaultInstance();
                }

                public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                    this(builderParent);
                }

                public /* synthetic */ Builder(int i14) {
                    this();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.appId_ = ByteString.EMPTY;
                    this.appType_ = 0;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof InstalledApp) {
                        return mergeFrom((InstalledApp) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(InstalledApp installedApp) {
                    if (installedApp == InstalledApp.getDefaultInstance()) {
                        return this;
                    }
                    if (installedApp.hasAppId()) {
                        setAppId(installedApp.getAppId());
                    }
                    if (installedApp.hasAppType()) {
                        setAppType(installedApp.getAppType());
                    }
                    if (installedApp.hasDisabled()) {
                        setDisabled(installedApp.getDisabled());
                    }
                    if (installedApp.hasFavorite()) {
                        setFavorite(installedApp.getFavorite());
                    }
                    mergeUnknownFields(installedApp.getUnknownFields());
                    onChanged();
                    return this;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public InstalledApp getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static InstalledApp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (InstalledApp) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static InstalledApp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static InstalledApp parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static InstalledApp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static InstalledApp parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            public static InstalledApp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static InstalledApp parseFrom(InputStream inputStream) {
                return (InstalledApp) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static InstalledApp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (InstalledApp) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public /* synthetic */ InstalledApp(Builder builder) {
                this((GeneratedMessageV3.Builder<?>) builder);
            }

            public static InstalledApp parseFrom(CodedInputStream codedInputStream) {
                return (InstalledApp) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            private InstalledApp() {
                ByteString byteString = ByteString.EMPTY;
                this.disabled_ = false;
                this.favorite_ = false;
                this.memoizedIsInitialized = (byte) -1;
                this.appId_ = byteString;
                this.appType_ = 0;
            }

            public static InstalledApp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (InstalledApp) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UpdateInstalledAppsRequestOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> installedAppBuilder_;
            private List<InstalledApp> installedApp_;

            private Builder() {
                this.installedApp_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(UpdateInstalledAppsRequest updateInstalledAppsRequest) {
            }

            private void buildPartialRepeatedFields(UpdateInstalledAppsRequest updateInstalledAppsRequest) {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    updateInstalledAppsRequest.installedApp_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.installedApp_ = Collections.unmodifiableList(this.installedApp_);
                    this.bitField0_ &= -2;
                }
                updateInstalledAppsRequest.installedApp_ = this.installedApp_;
            }

            private void ensureInstalledAppIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.installedApp_ = new ArrayList(this.installedApp_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsRequest_descriptor;
            }

            private RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> getInstalledAppFieldBuilder() {
                if (this.installedAppBuilder_ == null) {
                    this.installedAppBuilder_ = new RepeatedFieldBuilderV3<>(this.installedApp_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.installedApp_ = null;
                }
                return this.installedAppBuilder_;
            }

            public Builder addAllInstalledApp(Iterable<? extends InstalledApp> iterable) {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureInstalledAppIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.installedApp_);
                onChanged();
                return this;
            }

            public Builder addInstalledApp(InstalledApp.Builder builder) {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureInstalledAppIsMutable();
                this.installedApp_.add(builder.build());
                onChanged();
                return this;
            }

            public InstalledApp.Builder addInstalledAppBuilder() {
                return (InstalledApp.Builder) getInstalledAppFieldBuilder().addBuilder(InstalledApp.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateInstalledAppsRequest build() {
                UpdateInstalledAppsRequest updateInstalledAppsRequestBuildPartial = buildPartial();
                if (updateInstalledAppsRequestBuildPartial.isInitialized()) {
                    return updateInstalledAppsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) updateInstalledAppsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateInstalledAppsRequest buildPartial() {
                UpdateInstalledAppsRequest updateInstalledAppsRequest = new UpdateInstalledAppsRequest(this);
                buildPartialRepeatedFields(updateInstalledAppsRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(updateInstalledAppsRequest);
                }
                onBuilt();
                return updateInstalledAppsRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.installedApp_ = Collections.EMPTY_LIST;
                } else {
                    this.installedApp_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearInstalledApp() {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.installedApp_ = Collections.EMPTY_LIST;
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
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequestOrBuilder
            public InstalledApp getInstalledApp(int i14) {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                return repeatedFieldBuilderV3 == null ? this.installedApp_.get(i14) : (InstalledApp) repeatedFieldBuilderV3.getMessage(i14);
            }

            public InstalledApp.Builder getInstalledAppBuilder(int i14) {
                return (InstalledApp.Builder) getInstalledAppFieldBuilder().getBuilder(i14);
            }

            public List<InstalledApp.Builder> getInstalledAppBuilderList() {
                return getInstalledAppFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequestOrBuilder
            public int getInstalledAppCount() {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                return repeatedFieldBuilderV3 == null ? this.installedApp_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequestOrBuilder
            public List<InstalledApp> getInstalledAppList() {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.installedApp_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequestOrBuilder
            public InstalledAppOrBuilder getInstalledAppOrBuilder(int i14) {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                return repeatedFieldBuilderV3 == null ? this.installedApp_.get(i14) : (InstalledAppOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsRequestOrBuilder
            public List<? extends InstalledAppOrBuilder> getInstalledAppOrBuilderList() {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.installedApp_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateInstalledAppsRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getInstalledAppCount(); i14++) {
                    if (!getInstalledApp(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(UpdateInstalledAppsRequest updateInstalledAppsRequest) {
                if (updateInstalledAppsRequest == UpdateInstalledAppsRequest.getDefaultInstance()) {
                    return this;
                }
                if (this.installedAppBuilder_ == null) {
                    if (!updateInstalledAppsRequest.installedApp_.isEmpty()) {
                        if (this.installedApp_.isEmpty()) {
                            this.installedApp_ = updateInstalledAppsRequest.installedApp_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureInstalledAppIsMutable();
                            this.installedApp_.addAll(updateInstalledAppsRequest.installedApp_);
                        }
                        onChanged();
                    }
                } else if (!updateInstalledAppsRequest.installedApp_.isEmpty()) {
                    boolean zIsEmpty = this.installedAppBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.installedAppBuilder_ = null;
                        this.installedApp_ = updateInstalledAppsRequest.installedApp_;
                        this.bitField0_ &= -2;
                        this.installedAppBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getInstalledAppFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(updateInstalledAppsRequest.installedApp_);
                    }
                }
                mergeUnknownFields(updateInstalledAppsRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeInstalledApp(int i14) {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureInstalledAppIsMutable();
                this.installedApp_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setInstalledApp(int i14, InstalledApp.Builder builder) {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureInstalledAppIsMutable();
                this.installedApp_.set(i14, builder.build());
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
            public UpdateInstalledAppsRequest getDefaultInstanceForType() {
                return UpdateInstalledAppsRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.installedApp_ = Collections.EMPTY_LIST;
            }

            public InstalledApp.Builder addInstalledAppBuilder(int i14) {
                return (InstalledApp.Builder) getInstalledAppFieldBuilder().addBuilder(i14, InstalledApp.getDefaultInstance());
            }

            public Builder addInstalledApp(int i14, InstalledApp installedApp) {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    installedApp.getClass();
                    ensureInstalledAppIsMutable();
                    this.installedApp_.add(i14, installedApp);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, installedApp);
                return this;
            }

            public Builder setInstalledApp(int i14, InstalledApp installedApp) {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    installedApp.getClass();
                    ensureInstalledAppIsMutable();
                    this.installedApp_.set(i14, installedApp);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, installedApp);
                return this;
            }

            public Builder addInstalledApp(InstalledApp installedApp) {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    installedApp.getClass();
                    ensureInstalledAppIsMutable();
                    this.installedApp_.add(installedApp);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(installedApp);
                return this;
            }

            public Builder addInstalledApp(int i14, InstalledApp.Builder builder) {
                RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureInstalledAppIsMutable();
                    this.installedApp_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UpdateInstalledAppsRequest) {
                    return mergeFrom((UpdateInstalledAppsRequest) message);
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
                                    InstalledApp installedApp = (InstalledApp) codedInputStream.readMessage(InstalledApp.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<InstalledApp, InstalledApp.Builder, InstalledAppOrBuilder> repeatedFieldBuilderV3 = this.installedAppBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureInstalledAppIsMutable();
                                        this.installedApp_.add(installedApp);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(installedApp);
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
        public UpdateInstalledAppsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UpdateInstalledAppsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateInstalledAppsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateInstalledAppsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UpdateInstalledAppsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private UpdateInstalledAppsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UpdateInstalledAppsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UpdateInstalledAppsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ UpdateInstalledAppsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UpdateInstalledAppsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UpdateInstalledAppsRequest parseFrom(InputStream inputStream) {
            return (UpdateInstalledAppsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UpdateInstalledAppsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateInstalledAppsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateInstalledAppsRequest parseFrom(CodedInputStream codedInputStream) {
            return (UpdateInstalledAppsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UpdateInstalledAppsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateInstalledAppsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConnectIQInstalledAppsService extends GeneratedMessageV3 implements ConnectIQInstalledAppsServiceOrBuilder {
        public static final int DELETE_APP_REQUEST_FIELD_NUMBER = 3;
        public static final int DELETE_APP_RESPONSE_FIELD_NUMBER = 4;
        public static final int ENABLE_NATIVE_APP_REQUEST_FIELD_NUMBER = 7;
        public static final int ENABLE_NATIVE_APP_RESPONSE_FIELD_NUMBER = 8;
        public static final int GET_INSTALLED_APPS_REQUEST_FIELD_NUMBER = 1;
        public static final int GET_INSTALLED_APPS_RESPONSE_FIELD_NUMBER = 2;
        public static final int LAUNCH_APP_REQUEST_FIELD_NUMBER = 9;
        public static final int LAUNCH_APP_RESPONSE_FIELD_NUMBER = 10;
        public static final int PENDING_APP_INSTALL_REQUEST_FIELD_NUMBER = 13;
        public static final int PENDING_APP_INSTALL_RESPONSE_FIELD_NUMBER = 14;
        public static final int UPDATE_FACEIT_PROJECT_ID_MAPPINGS_REQUEST_FIELD_NUMBER = 11;
        public static final int UPDATE_FACEIT_PROJECT_ID_MAPPINGS_RESPONSE_FIELD_NUMBER = 12;
        public static final int UPDATE_INSTALLED_APP_REQUEST_FIELD_NUMBER = 5;
        public static final int UPDATE_INSTALLED_APP_RESPONSE_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DeleteAppRequest deleteAppRequest_;
        private DeleteAppResponse deleteAppResponse_;
        private EnableNativeAppRequest enableNativeAppRequest_;
        private EnableNativeAppResponse enableNativeAppResponse_;
        private GetInstalledAppsRequest getInstalledAppsRequest_;
        private GetInstalledAppsResponse getInstalledAppsResponse_;
        private LaunchAppRequest launchAppRequest_;
        private LaunchAppResponse launchAppResponse_;
        private byte memoizedIsInitialized;
        private PendingAppInstallRequest pendingAppInstallRequest_;
        private PendingAppInstallResponse pendingAppInstallResponse_;
        private UpdateFaceItProjectIdMappingsRequest updateFaceitProjectIdMappingsRequest_;
        private UpdateFaceItProjectIdMappingsResponse updateFaceitProjectIdMappingsResponse_;
        private UpdateInstalledAppsRequest updateInstalledAppRequest_;
        private UpdateInstalledAppsResponse updateInstalledAppResponse_;
        private static final ConnectIQInstalledAppsService DEFAULT_INSTANCE = new ConnectIQInstalledAppsService();

        @Deprecated
        public static final Parser<ConnectIQInstalledAppsService> PARSER = new AbstractParser<ConnectIQInstalledAppsService>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsService.1
            @Override // com.google.protobuf.Parser
            public ConnectIQInstalledAppsService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectIQInstalledAppsService.newBuilder();
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

        private ConnectIQInstalledAppsService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectIQInstalledAppsService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_ConnectIQInstalledAppsService_descriptor;
        }

        public static Builder newBuilder(ConnectIQInstalledAppsService connectIQInstalledAppsService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectIQInstalledAppsService);
        }

        public static ConnectIQInstalledAppsService parseDelimitedFrom(InputStream inputStream) {
            return (ConnectIQInstalledAppsService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectIQInstalledAppsService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectIQInstalledAppsService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectIQInstalledAppsService)) {
                return super.equals(obj);
            }
            ConnectIQInstalledAppsService connectIQInstalledAppsService = (ConnectIQInstalledAppsService) obj;
            if (hasGetInstalledAppsRequest() != connectIQInstalledAppsService.hasGetInstalledAppsRequest()) {
                return false;
            }
            if ((hasGetInstalledAppsRequest() && !getGetInstalledAppsRequest().equals(connectIQInstalledAppsService.getGetInstalledAppsRequest())) || hasGetInstalledAppsResponse() != connectIQInstalledAppsService.hasGetInstalledAppsResponse()) {
                return false;
            }
            if ((hasGetInstalledAppsResponse() && !getGetInstalledAppsResponse().equals(connectIQInstalledAppsService.getGetInstalledAppsResponse())) || hasDeleteAppRequest() != connectIQInstalledAppsService.hasDeleteAppRequest()) {
                return false;
            }
            if ((hasDeleteAppRequest() && !getDeleteAppRequest().equals(connectIQInstalledAppsService.getDeleteAppRequest())) || hasDeleteAppResponse() != connectIQInstalledAppsService.hasDeleteAppResponse()) {
                return false;
            }
            if ((hasDeleteAppResponse() && !getDeleteAppResponse().equals(connectIQInstalledAppsService.getDeleteAppResponse())) || hasUpdateInstalledAppRequest() != connectIQInstalledAppsService.hasUpdateInstalledAppRequest()) {
                return false;
            }
            if ((hasUpdateInstalledAppRequest() && !getUpdateInstalledAppRequest().equals(connectIQInstalledAppsService.getUpdateInstalledAppRequest())) || hasUpdateInstalledAppResponse() != connectIQInstalledAppsService.hasUpdateInstalledAppResponse()) {
                return false;
            }
            if ((hasUpdateInstalledAppResponse() && !getUpdateInstalledAppResponse().equals(connectIQInstalledAppsService.getUpdateInstalledAppResponse())) || hasEnableNativeAppRequest() != connectIQInstalledAppsService.hasEnableNativeAppRequest()) {
                return false;
            }
            if ((hasEnableNativeAppRequest() && !getEnableNativeAppRequest().equals(connectIQInstalledAppsService.getEnableNativeAppRequest())) || hasEnableNativeAppResponse() != connectIQInstalledAppsService.hasEnableNativeAppResponse()) {
                return false;
            }
            if ((hasEnableNativeAppResponse() && !getEnableNativeAppResponse().equals(connectIQInstalledAppsService.getEnableNativeAppResponse())) || hasLaunchAppRequest() != connectIQInstalledAppsService.hasLaunchAppRequest()) {
                return false;
            }
            if ((hasLaunchAppRequest() && !getLaunchAppRequest().equals(connectIQInstalledAppsService.getLaunchAppRequest())) || hasLaunchAppResponse() != connectIQInstalledAppsService.hasLaunchAppResponse()) {
                return false;
            }
            if ((hasLaunchAppResponse() && !getLaunchAppResponse().equals(connectIQInstalledAppsService.getLaunchAppResponse())) || hasUpdateFaceitProjectIdMappingsRequest() != connectIQInstalledAppsService.hasUpdateFaceitProjectIdMappingsRequest()) {
                return false;
            }
            if ((hasUpdateFaceitProjectIdMappingsRequest() && !getUpdateFaceitProjectIdMappingsRequest().equals(connectIQInstalledAppsService.getUpdateFaceitProjectIdMappingsRequest())) || hasUpdateFaceitProjectIdMappingsResponse() != connectIQInstalledAppsService.hasUpdateFaceitProjectIdMappingsResponse()) {
                return false;
            }
            if ((hasUpdateFaceitProjectIdMappingsResponse() && !getUpdateFaceitProjectIdMappingsResponse().equals(connectIQInstalledAppsService.getUpdateFaceitProjectIdMappingsResponse())) || hasPendingAppInstallRequest() != connectIQInstalledAppsService.hasPendingAppInstallRequest()) {
                return false;
            }
            if ((!hasPendingAppInstallRequest() || getPendingAppInstallRequest().equals(connectIQInstalledAppsService.getPendingAppInstallRequest())) && hasPendingAppInstallResponse() == connectIQInstalledAppsService.hasPendingAppInstallResponse()) {
                return (!hasPendingAppInstallResponse() || getPendingAppInstallResponse().equals(connectIQInstalledAppsService.getPendingAppInstallResponse())) && getUnknownFields().equals(connectIQInstalledAppsService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public DeleteAppRequest getDeleteAppRequest() {
            DeleteAppRequest deleteAppRequest = this.deleteAppRequest_;
            return deleteAppRequest == null ? DeleteAppRequest.getDefaultInstance() : deleteAppRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public DeleteAppRequestOrBuilder getDeleteAppRequestOrBuilder() {
            DeleteAppRequest deleteAppRequest = this.deleteAppRequest_;
            return deleteAppRequest == null ? DeleteAppRequest.getDefaultInstance() : deleteAppRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public DeleteAppResponse getDeleteAppResponse() {
            DeleteAppResponse deleteAppResponse = this.deleteAppResponse_;
            return deleteAppResponse == null ? DeleteAppResponse.getDefaultInstance() : deleteAppResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public DeleteAppResponseOrBuilder getDeleteAppResponseOrBuilder() {
            DeleteAppResponse deleteAppResponse = this.deleteAppResponse_;
            return deleteAppResponse == null ? DeleteAppResponse.getDefaultInstance() : deleteAppResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public EnableNativeAppRequest getEnableNativeAppRequest() {
            EnableNativeAppRequest enableNativeAppRequest = this.enableNativeAppRequest_;
            return enableNativeAppRequest == null ? EnableNativeAppRequest.getDefaultInstance() : enableNativeAppRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public EnableNativeAppRequestOrBuilder getEnableNativeAppRequestOrBuilder() {
            EnableNativeAppRequest enableNativeAppRequest = this.enableNativeAppRequest_;
            return enableNativeAppRequest == null ? EnableNativeAppRequest.getDefaultInstance() : enableNativeAppRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public EnableNativeAppResponse getEnableNativeAppResponse() {
            EnableNativeAppResponse enableNativeAppResponse = this.enableNativeAppResponse_;
            return enableNativeAppResponse == null ? EnableNativeAppResponse.getDefaultInstance() : enableNativeAppResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public EnableNativeAppResponseOrBuilder getEnableNativeAppResponseOrBuilder() {
            EnableNativeAppResponse enableNativeAppResponse = this.enableNativeAppResponse_;
            return enableNativeAppResponse == null ? EnableNativeAppResponse.getDefaultInstance() : enableNativeAppResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public GetInstalledAppsRequest getGetInstalledAppsRequest() {
            GetInstalledAppsRequest getInstalledAppsRequest = this.getInstalledAppsRequest_;
            return getInstalledAppsRequest == null ? GetInstalledAppsRequest.getDefaultInstance() : getInstalledAppsRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public GetInstalledAppsRequestOrBuilder getGetInstalledAppsRequestOrBuilder() {
            GetInstalledAppsRequest getInstalledAppsRequest = this.getInstalledAppsRequest_;
            return getInstalledAppsRequest == null ? GetInstalledAppsRequest.getDefaultInstance() : getInstalledAppsRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public GetInstalledAppsResponse getGetInstalledAppsResponse() {
            GetInstalledAppsResponse getInstalledAppsResponse = this.getInstalledAppsResponse_;
            return getInstalledAppsResponse == null ? GetInstalledAppsResponse.getDefaultInstance() : getInstalledAppsResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public GetInstalledAppsResponseOrBuilder getGetInstalledAppsResponseOrBuilder() {
            GetInstalledAppsResponse getInstalledAppsResponse = this.getInstalledAppsResponse_;
            return getInstalledAppsResponse == null ? GetInstalledAppsResponse.getDefaultInstance() : getInstalledAppsResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public LaunchAppRequest getLaunchAppRequest() {
            LaunchAppRequest launchAppRequest = this.launchAppRequest_;
            return launchAppRequest == null ? LaunchAppRequest.getDefaultInstance() : launchAppRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public LaunchAppRequestOrBuilder getLaunchAppRequestOrBuilder() {
            LaunchAppRequest launchAppRequest = this.launchAppRequest_;
            return launchAppRequest == null ? LaunchAppRequest.getDefaultInstance() : launchAppRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public LaunchAppResponse getLaunchAppResponse() {
            LaunchAppResponse launchAppResponse = this.launchAppResponse_;
            return launchAppResponse == null ? LaunchAppResponse.getDefaultInstance() : launchAppResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public LaunchAppResponseOrBuilder getLaunchAppResponseOrBuilder() {
            LaunchAppResponse launchAppResponse = this.launchAppResponse_;
            return launchAppResponse == null ? LaunchAppResponse.getDefaultInstance() : launchAppResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectIQInstalledAppsService> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public PendingAppInstallRequest getPendingAppInstallRequest() {
            PendingAppInstallRequest pendingAppInstallRequest = this.pendingAppInstallRequest_;
            return pendingAppInstallRequest == null ? PendingAppInstallRequest.getDefaultInstance() : pendingAppInstallRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public PendingAppInstallRequestOrBuilder getPendingAppInstallRequestOrBuilder() {
            PendingAppInstallRequest pendingAppInstallRequest = this.pendingAppInstallRequest_;
            return pendingAppInstallRequest == null ? PendingAppInstallRequest.getDefaultInstance() : pendingAppInstallRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public PendingAppInstallResponse getPendingAppInstallResponse() {
            PendingAppInstallResponse pendingAppInstallResponse = this.pendingAppInstallResponse_;
            return pendingAppInstallResponse == null ? PendingAppInstallResponse.getDefaultInstance() : pendingAppInstallResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public PendingAppInstallResponseOrBuilder getPendingAppInstallResponseOrBuilder() {
            PendingAppInstallResponse pendingAppInstallResponse = this.pendingAppInstallResponse_;
            return pendingAppInstallResponse == null ? PendingAppInstallResponse.getDefaultInstance() : pendingAppInstallResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getGetInstalledAppsRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getGetInstalledAppsResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getDeleteAppRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getDeleteAppResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getUpdateInstalledAppRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getUpdateInstalledAppResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getEnableNativeAppRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getEnableNativeAppResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getLaunchAppRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getLaunchAppResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getUpdateFaceitProjectIdMappingsRequest());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getUpdateFaceitProjectIdMappingsResponse());
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, getPendingAppInstallRequest());
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(14, getPendingAppInstallResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public UpdateFaceItProjectIdMappingsRequest getUpdateFaceitProjectIdMappingsRequest() {
            UpdateFaceItProjectIdMappingsRequest updateFaceItProjectIdMappingsRequest = this.updateFaceitProjectIdMappingsRequest_;
            return updateFaceItProjectIdMappingsRequest == null ? UpdateFaceItProjectIdMappingsRequest.getDefaultInstance() : updateFaceItProjectIdMappingsRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public UpdateFaceItProjectIdMappingsRequestOrBuilder getUpdateFaceitProjectIdMappingsRequestOrBuilder() {
            UpdateFaceItProjectIdMappingsRequest updateFaceItProjectIdMappingsRequest = this.updateFaceitProjectIdMappingsRequest_;
            return updateFaceItProjectIdMappingsRequest == null ? UpdateFaceItProjectIdMappingsRequest.getDefaultInstance() : updateFaceItProjectIdMappingsRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public UpdateFaceItProjectIdMappingsResponse getUpdateFaceitProjectIdMappingsResponse() {
            UpdateFaceItProjectIdMappingsResponse updateFaceItProjectIdMappingsResponse = this.updateFaceitProjectIdMappingsResponse_;
            return updateFaceItProjectIdMappingsResponse == null ? UpdateFaceItProjectIdMappingsResponse.getDefaultInstance() : updateFaceItProjectIdMappingsResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public UpdateFaceItProjectIdMappingsResponseOrBuilder getUpdateFaceitProjectIdMappingsResponseOrBuilder() {
            UpdateFaceItProjectIdMappingsResponse updateFaceItProjectIdMappingsResponse = this.updateFaceitProjectIdMappingsResponse_;
            return updateFaceItProjectIdMappingsResponse == null ? UpdateFaceItProjectIdMappingsResponse.getDefaultInstance() : updateFaceItProjectIdMappingsResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public UpdateInstalledAppsRequest getUpdateInstalledAppRequest() {
            UpdateInstalledAppsRequest updateInstalledAppsRequest = this.updateInstalledAppRequest_;
            return updateInstalledAppsRequest == null ? UpdateInstalledAppsRequest.getDefaultInstance() : updateInstalledAppsRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public UpdateInstalledAppsRequestOrBuilder getUpdateInstalledAppRequestOrBuilder() {
            UpdateInstalledAppsRequest updateInstalledAppsRequest = this.updateInstalledAppRequest_;
            return updateInstalledAppsRequest == null ? UpdateInstalledAppsRequest.getDefaultInstance() : updateInstalledAppsRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public UpdateInstalledAppsResponse getUpdateInstalledAppResponse() {
            UpdateInstalledAppsResponse updateInstalledAppsResponse = this.updateInstalledAppResponse_;
            return updateInstalledAppsResponse == null ? UpdateInstalledAppsResponse.getDefaultInstance() : updateInstalledAppsResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public UpdateInstalledAppsResponseOrBuilder getUpdateInstalledAppResponseOrBuilder() {
            UpdateInstalledAppsResponse updateInstalledAppsResponse = this.updateInstalledAppResponse_;
            return updateInstalledAppsResponse == null ? UpdateInstalledAppsResponse.getDefaultInstance() : updateInstalledAppsResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public boolean hasDeleteAppRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public boolean hasDeleteAppResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public boolean hasEnableNativeAppRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public boolean hasEnableNativeAppResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public boolean hasGetInstalledAppsRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public boolean hasGetInstalledAppsResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public boolean hasLaunchAppRequest() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public boolean hasLaunchAppResponse() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public boolean hasPendingAppInstallRequest() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public boolean hasPendingAppInstallResponse() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public boolean hasUpdateFaceitProjectIdMappingsRequest() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public boolean hasUpdateFaceitProjectIdMappingsResponse() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public boolean hasUpdateInstalledAppRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
        public boolean hasUpdateInstalledAppResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGetInstalledAppsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getGetInstalledAppsRequest().hashCode();
            }
            if (hasGetInstalledAppsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getGetInstalledAppsResponse().hashCode();
            }
            if (hasDeleteAppRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getDeleteAppRequest().hashCode();
            }
            if (hasDeleteAppResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getDeleteAppResponse().hashCode();
            }
            if (hasUpdateInstalledAppRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getUpdateInstalledAppRequest().hashCode();
            }
            if (hasUpdateInstalledAppResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getUpdateInstalledAppResponse().hashCode();
            }
            if (hasEnableNativeAppRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getEnableNativeAppRequest().hashCode();
            }
            if (hasEnableNativeAppResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getEnableNativeAppResponse().hashCode();
            }
            if (hasLaunchAppRequest()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getLaunchAppRequest().hashCode();
            }
            if (hasLaunchAppResponse()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getLaunchAppResponse().hashCode();
            }
            if (hasUpdateFaceitProjectIdMappingsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getUpdateFaceitProjectIdMappingsRequest().hashCode();
            }
            if (hasUpdateFaceitProjectIdMappingsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getUpdateFaceitProjectIdMappingsResponse().hashCode();
            }
            if (hasPendingAppInstallRequest()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getPendingAppInstallRequest().hashCode();
            }
            if (hasPendingAppInstallResponse()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + getPendingAppInstallResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_ConnectIQInstalledAppsService_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQInstalledAppsService.class, Builder.class);
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
            if (hasGetInstalledAppsRequest() && !getGetInstalledAppsRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasGetInstalledAppsResponse() && !getGetInstalledAppsResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasDeleteAppRequest() && !getDeleteAppRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasDeleteAppResponse() && !getDeleteAppResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUpdateInstalledAppRequest() && !getUpdateInstalledAppRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUpdateInstalledAppResponse() && !getUpdateInstalledAppResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasEnableNativeAppRequest() && !getEnableNativeAppRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasEnableNativeAppResponse() && !getEnableNativeAppResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasLaunchAppRequest() && !getLaunchAppRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasLaunchAppResponse() || getLaunchAppResponse().isInitialized()) {
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
            return new ConnectIQInstalledAppsService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getGetInstalledAppsRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getGetInstalledAppsResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getDeleteAppRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getDeleteAppResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getUpdateInstalledAppRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getUpdateInstalledAppResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getEnableNativeAppRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getEnableNativeAppResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getLaunchAppRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getLaunchAppResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getUpdateFaceitProjectIdMappingsRequest());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(12, getUpdateFaceitProjectIdMappingsResponse());
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeMessage(13, getPendingAppInstallRequest());
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeMessage(14, getPendingAppInstallResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectIQInstalledAppsServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DeleteAppRequest, DeleteAppRequest.Builder, DeleteAppRequestOrBuilder> deleteAppRequestBuilder_;
            private DeleteAppRequest deleteAppRequest_;
            private SingleFieldBuilderV3<DeleteAppResponse, DeleteAppResponse.Builder, DeleteAppResponseOrBuilder> deleteAppResponseBuilder_;
            private DeleteAppResponse deleteAppResponse_;
            private SingleFieldBuilderV3<EnableNativeAppRequest, EnableNativeAppRequest.Builder, EnableNativeAppRequestOrBuilder> enableNativeAppRequestBuilder_;
            private EnableNativeAppRequest enableNativeAppRequest_;
            private SingleFieldBuilderV3<EnableNativeAppResponse, EnableNativeAppResponse.Builder, EnableNativeAppResponseOrBuilder> enableNativeAppResponseBuilder_;
            private EnableNativeAppResponse enableNativeAppResponse_;
            private SingleFieldBuilderV3<GetInstalledAppsRequest, GetInstalledAppsRequest.Builder, GetInstalledAppsRequestOrBuilder> getInstalledAppsRequestBuilder_;
            private GetInstalledAppsRequest getInstalledAppsRequest_;
            private SingleFieldBuilderV3<GetInstalledAppsResponse, GetInstalledAppsResponse.Builder, GetInstalledAppsResponseOrBuilder> getInstalledAppsResponseBuilder_;
            private GetInstalledAppsResponse getInstalledAppsResponse_;
            private SingleFieldBuilderV3<LaunchAppRequest, LaunchAppRequest.Builder, LaunchAppRequestOrBuilder> launchAppRequestBuilder_;
            private LaunchAppRequest launchAppRequest_;
            private SingleFieldBuilderV3<LaunchAppResponse, LaunchAppResponse.Builder, LaunchAppResponseOrBuilder> launchAppResponseBuilder_;
            private LaunchAppResponse launchAppResponse_;
            private SingleFieldBuilderV3<PendingAppInstallRequest, PendingAppInstallRequest.Builder, PendingAppInstallRequestOrBuilder> pendingAppInstallRequestBuilder_;
            private PendingAppInstallRequest pendingAppInstallRequest_;
            private SingleFieldBuilderV3<PendingAppInstallResponse, PendingAppInstallResponse.Builder, PendingAppInstallResponseOrBuilder> pendingAppInstallResponseBuilder_;
            private PendingAppInstallResponse pendingAppInstallResponse_;
            private SingleFieldBuilderV3<UpdateFaceItProjectIdMappingsRequest, UpdateFaceItProjectIdMappingsRequest.Builder, UpdateFaceItProjectIdMappingsRequestOrBuilder> updateFaceitProjectIdMappingsRequestBuilder_;
            private UpdateFaceItProjectIdMappingsRequest updateFaceitProjectIdMappingsRequest_;
            private SingleFieldBuilderV3<UpdateFaceItProjectIdMappingsResponse, UpdateFaceItProjectIdMappingsResponse.Builder, UpdateFaceItProjectIdMappingsResponseOrBuilder> updateFaceitProjectIdMappingsResponseBuilder_;
            private UpdateFaceItProjectIdMappingsResponse updateFaceitProjectIdMappingsResponse_;
            private SingleFieldBuilderV3<UpdateInstalledAppsRequest, UpdateInstalledAppsRequest.Builder, UpdateInstalledAppsRequestOrBuilder> updateInstalledAppRequestBuilder_;
            private UpdateInstalledAppsRequest updateInstalledAppRequest_;
            private SingleFieldBuilderV3<UpdateInstalledAppsResponse, UpdateInstalledAppsResponse.Builder, UpdateInstalledAppsResponseOrBuilder> updateInstalledAppResponseBuilder_;
            private UpdateInstalledAppsResponse updateInstalledAppResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConnectIQInstalledAppsService connectIQInstalledAppsService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GetInstalledAppsRequest, GetInstalledAppsRequest.Builder, GetInstalledAppsRequestOrBuilder> singleFieldBuilderV3 = this.getInstalledAppsRequestBuilder_;
                    connectIQInstalledAppsService.getInstalledAppsRequest_ = singleFieldBuilderV3 == null ? this.getInstalledAppsRequest_ : (GetInstalledAppsRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<GetInstalledAppsResponse, GetInstalledAppsResponse.Builder, GetInstalledAppsResponseOrBuilder> singleFieldBuilderV4 = this.getInstalledAppsResponseBuilder_;
                    connectIQInstalledAppsService.getInstalledAppsResponse_ = singleFieldBuilderV4 == null ? this.getInstalledAppsResponse_ : (GetInstalledAppsResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<DeleteAppRequest, DeleteAppRequest.Builder, DeleteAppRequestOrBuilder> singleFieldBuilderV5 = this.deleteAppRequestBuilder_;
                    connectIQInstalledAppsService.deleteAppRequest_ = singleFieldBuilderV5 == null ? this.deleteAppRequest_ : (DeleteAppRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<DeleteAppResponse, DeleteAppResponse.Builder, DeleteAppResponseOrBuilder> singleFieldBuilderV6 = this.deleteAppResponseBuilder_;
                    connectIQInstalledAppsService.deleteAppResponse_ = singleFieldBuilderV6 == null ? this.deleteAppResponse_ : (DeleteAppResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<UpdateInstalledAppsRequest, UpdateInstalledAppsRequest.Builder, UpdateInstalledAppsRequestOrBuilder> singleFieldBuilderV7 = this.updateInstalledAppRequestBuilder_;
                    connectIQInstalledAppsService.updateInstalledAppRequest_ = singleFieldBuilderV7 == null ? this.updateInstalledAppRequest_ : (UpdateInstalledAppsRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<UpdateInstalledAppsResponse, UpdateInstalledAppsResponse.Builder, UpdateInstalledAppsResponseOrBuilder> singleFieldBuilderV8 = this.updateInstalledAppResponseBuilder_;
                    connectIQInstalledAppsService.updateInstalledAppResponse_ = singleFieldBuilderV8 == null ? this.updateInstalledAppResponse_ : (UpdateInstalledAppsResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<EnableNativeAppRequest, EnableNativeAppRequest.Builder, EnableNativeAppRequestOrBuilder> singleFieldBuilderV9 = this.enableNativeAppRequestBuilder_;
                    connectIQInstalledAppsService.enableNativeAppRequest_ = singleFieldBuilderV9 == null ? this.enableNativeAppRequest_ : (EnableNativeAppRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<EnableNativeAppResponse, EnableNativeAppResponse.Builder, EnableNativeAppResponseOrBuilder> singleFieldBuilderV10 = this.enableNativeAppResponseBuilder_;
                    connectIQInstalledAppsService.enableNativeAppResponse_ = singleFieldBuilderV10 == null ? this.enableNativeAppResponse_ : (EnableNativeAppResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<LaunchAppRequest, LaunchAppRequest.Builder, LaunchAppRequestOrBuilder> singleFieldBuilderV11 = this.launchAppRequestBuilder_;
                    connectIQInstalledAppsService.launchAppRequest_ = singleFieldBuilderV11 == null ? this.launchAppRequest_ : (LaunchAppRequest) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<LaunchAppResponse, LaunchAppResponse.Builder, LaunchAppResponseOrBuilder> singleFieldBuilderV12 = this.launchAppResponseBuilder_;
                    connectIQInstalledAppsService.launchAppResponse_ = singleFieldBuilderV12 == null ? this.launchAppResponse_ : (LaunchAppResponse) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<UpdateFaceItProjectIdMappingsRequest, UpdateFaceItProjectIdMappingsRequest.Builder, UpdateFaceItProjectIdMappingsRequestOrBuilder> singleFieldBuilderV13 = this.updateFaceitProjectIdMappingsRequestBuilder_;
                    connectIQInstalledAppsService.updateFaceitProjectIdMappingsRequest_ = singleFieldBuilderV13 == null ? this.updateFaceitProjectIdMappingsRequest_ : (UpdateFaceItProjectIdMappingsRequest) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<UpdateFaceItProjectIdMappingsResponse, UpdateFaceItProjectIdMappingsResponse.Builder, UpdateFaceItProjectIdMappingsResponseOrBuilder> singleFieldBuilderV14 = this.updateFaceitProjectIdMappingsResponseBuilder_;
                    connectIQInstalledAppsService.updateFaceitProjectIdMappingsResponse_ = singleFieldBuilderV14 == null ? this.updateFaceitProjectIdMappingsResponse_ : (UpdateFaceItProjectIdMappingsResponse) singleFieldBuilderV14.build();
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    SingleFieldBuilderV3<PendingAppInstallRequest, PendingAppInstallRequest.Builder, PendingAppInstallRequestOrBuilder> singleFieldBuilderV15 = this.pendingAppInstallRequestBuilder_;
                    connectIQInstalledAppsService.pendingAppInstallRequest_ = singleFieldBuilderV15 == null ? this.pendingAppInstallRequest_ : (PendingAppInstallRequest) singleFieldBuilderV15.build();
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    SingleFieldBuilderV3<PendingAppInstallResponse, PendingAppInstallResponse.Builder, PendingAppInstallResponseOrBuilder> singleFieldBuilderV16 = this.pendingAppInstallResponseBuilder_;
                    connectIQInstalledAppsService.pendingAppInstallResponse_ = singleFieldBuilderV16 == null ? this.pendingAppInstallResponse_ : (PendingAppInstallResponse) singleFieldBuilderV16.build();
                    i14 |= 8192;
                }
                connectIQInstalledAppsService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<DeleteAppRequest, DeleteAppRequest.Builder, DeleteAppRequestOrBuilder> getDeleteAppRequestFieldBuilder() {
                if (this.deleteAppRequestBuilder_ == null) {
                    this.deleteAppRequestBuilder_ = new SingleFieldBuilderV3<>(getDeleteAppRequest(), getParentForChildren(), isClean());
                    this.deleteAppRequest_ = null;
                }
                return this.deleteAppRequestBuilder_;
            }

            private SingleFieldBuilderV3<DeleteAppResponse, DeleteAppResponse.Builder, DeleteAppResponseOrBuilder> getDeleteAppResponseFieldBuilder() {
                if (this.deleteAppResponseBuilder_ == null) {
                    this.deleteAppResponseBuilder_ = new SingleFieldBuilderV3<>(getDeleteAppResponse(), getParentForChildren(), isClean());
                    this.deleteAppResponse_ = null;
                }
                return this.deleteAppResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_ConnectIQInstalledAppsService_descriptor;
            }

            private SingleFieldBuilderV3<EnableNativeAppRequest, EnableNativeAppRequest.Builder, EnableNativeAppRequestOrBuilder> getEnableNativeAppRequestFieldBuilder() {
                if (this.enableNativeAppRequestBuilder_ == null) {
                    this.enableNativeAppRequestBuilder_ = new SingleFieldBuilderV3<>(getEnableNativeAppRequest(), getParentForChildren(), isClean());
                    this.enableNativeAppRequest_ = null;
                }
                return this.enableNativeAppRequestBuilder_;
            }

            private SingleFieldBuilderV3<EnableNativeAppResponse, EnableNativeAppResponse.Builder, EnableNativeAppResponseOrBuilder> getEnableNativeAppResponseFieldBuilder() {
                if (this.enableNativeAppResponseBuilder_ == null) {
                    this.enableNativeAppResponseBuilder_ = new SingleFieldBuilderV3<>(getEnableNativeAppResponse(), getParentForChildren(), isClean());
                    this.enableNativeAppResponse_ = null;
                }
                return this.enableNativeAppResponseBuilder_;
            }

            private SingleFieldBuilderV3<GetInstalledAppsRequest, GetInstalledAppsRequest.Builder, GetInstalledAppsRequestOrBuilder> getGetInstalledAppsRequestFieldBuilder() {
                if (this.getInstalledAppsRequestBuilder_ == null) {
                    this.getInstalledAppsRequestBuilder_ = new SingleFieldBuilderV3<>(getGetInstalledAppsRequest(), getParentForChildren(), isClean());
                    this.getInstalledAppsRequest_ = null;
                }
                return this.getInstalledAppsRequestBuilder_;
            }

            private SingleFieldBuilderV3<GetInstalledAppsResponse, GetInstalledAppsResponse.Builder, GetInstalledAppsResponseOrBuilder> getGetInstalledAppsResponseFieldBuilder() {
                if (this.getInstalledAppsResponseBuilder_ == null) {
                    this.getInstalledAppsResponseBuilder_ = new SingleFieldBuilderV3<>(getGetInstalledAppsResponse(), getParentForChildren(), isClean());
                    this.getInstalledAppsResponse_ = null;
                }
                return this.getInstalledAppsResponseBuilder_;
            }

            private SingleFieldBuilderV3<LaunchAppRequest, LaunchAppRequest.Builder, LaunchAppRequestOrBuilder> getLaunchAppRequestFieldBuilder() {
                if (this.launchAppRequestBuilder_ == null) {
                    this.launchAppRequestBuilder_ = new SingleFieldBuilderV3<>(getLaunchAppRequest(), getParentForChildren(), isClean());
                    this.launchAppRequest_ = null;
                }
                return this.launchAppRequestBuilder_;
            }

            private SingleFieldBuilderV3<LaunchAppResponse, LaunchAppResponse.Builder, LaunchAppResponseOrBuilder> getLaunchAppResponseFieldBuilder() {
                if (this.launchAppResponseBuilder_ == null) {
                    this.launchAppResponseBuilder_ = new SingleFieldBuilderV3<>(getLaunchAppResponse(), getParentForChildren(), isClean());
                    this.launchAppResponse_ = null;
                }
                return this.launchAppResponseBuilder_;
            }

            private SingleFieldBuilderV3<PendingAppInstallRequest, PendingAppInstallRequest.Builder, PendingAppInstallRequestOrBuilder> getPendingAppInstallRequestFieldBuilder() {
                if (this.pendingAppInstallRequestBuilder_ == null) {
                    this.pendingAppInstallRequestBuilder_ = new SingleFieldBuilderV3<>(getPendingAppInstallRequest(), getParentForChildren(), isClean());
                    this.pendingAppInstallRequest_ = null;
                }
                return this.pendingAppInstallRequestBuilder_;
            }

            private SingleFieldBuilderV3<PendingAppInstallResponse, PendingAppInstallResponse.Builder, PendingAppInstallResponseOrBuilder> getPendingAppInstallResponseFieldBuilder() {
                if (this.pendingAppInstallResponseBuilder_ == null) {
                    this.pendingAppInstallResponseBuilder_ = new SingleFieldBuilderV3<>(getPendingAppInstallResponse(), getParentForChildren(), isClean());
                    this.pendingAppInstallResponse_ = null;
                }
                return this.pendingAppInstallResponseBuilder_;
            }

            private SingleFieldBuilderV3<UpdateFaceItProjectIdMappingsRequest, UpdateFaceItProjectIdMappingsRequest.Builder, UpdateFaceItProjectIdMappingsRequestOrBuilder> getUpdateFaceitProjectIdMappingsRequestFieldBuilder() {
                if (this.updateFaceitProjectIdMappingsRequestBuilder_ == null) {
                    this.updateFaceitProjectIdMappingsRequestBuilder_ = new SingleFieldBuilderV3<>(getUpdateFaceitProjectIdMappingsRequest(), getParentForChildren(), isClean());
                    this.updateFaceitProjectIdMappingsRequest_ = null;
                }
                return this.updateFaceitProjectIdMappingsRequestBuilder_;
            }

            private SingleFieldBuilderV3<UpdateFaceItProjectIdMappingsResponse, UpdateFaceItProjectIdMappingsResponse.Builder, UpdateFaceItProjectIdMappingsResponseOrBuilder> getUpdateFaceitProjectIdMappingsResponseFieldBuilder() {
                if (this.updateFaceitProjectIdMappingsResponseBuilder_ == null) {
                    this.updateFaceitProjectIdMappingsResponseBuilder_ = new SingleFieldBuilderV3<>(getUpdateFaceitProjectIdMappingsResponse(), getParentForChildren(), isClean());
                    this.updateFaceitProjectIdMappingsResponse_ = null;
                }
                return this.updateFaceitProjectIdMappingsResponseBuilder_;
            }

            private SingleFieldBuilderV3<UpdateInstalledAppsRequest, UpdateInstalledAppsRequest.Builder, UpdateInstalledAppsRequestOrBuilder> getUpdateInstalledAppRequestFieldBuilder() {
                if (this.updateInstalledAppRequestBuilder_ == null) {
                    this.updateInstalledAppRequestBuilder_ = new SingleFieldBuilderV3<>(getUpdateInstalledAppRequest(), getParentForChildren(), isClean());
                    this.updateInstalledAppRequest_ = null;
                }
                return this.updateInstalledAppRequestBuilder_;
            }

            private SingleFieldBuilderV3<UpdateInstalledAppsResponse, UpdateInstalledAppsResponse.Builder, UpdateInstalledAppsResponseOrBuilder> getUpdateInstalledAppResponseFieldBuilder() {
                if (this.updateInstalledAppResponseBuilder_ == null) {
                    this.updateInstalledAppResponseBuilder_ = new SingleFieldBuilderV3<>(getUpdateInstalledAppResponse(), getParentForChildren(), isClean());
                    this.updateInstalledAppResponse_ = null;
                }
                return this.updateInstalledAppResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getGetInstalledAppsRequestFieldBuilder();
                    getGetInstalledAppsResponseFieldBuilder();
                    getDeleteAppRequestFieldBuilder();
                    getDeleteAppResponseFieldBuilder();
                    getUpdateInstalledAppRequestFieldBuilder();
                    getUpdateInstalledAppResponseFieldBuilder();
                    getEnableNativeAppRequestFieldBuilder();
                    getEnableNativeAppResponseFieldBuilder();
                    getLaunchAppRequestFieldBuilder();
                    getLaunchAppResponseFieldBuilder();
                    getUpdateFaceitProjectIdMappingsRequestFieldBuilder();
                    getUpdateFaceitProjectIdMappingsResponseFieldBuilder();
                    getPendingAppInstallRequestFieldBuilder();
                    getPendingAppInstallResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQInstalledAppsService build() {
                ConnectIQInstalledAppsService connectIQInstalledAppsServiceBuildPartial = buildPartial();
                if (connectIQInstalledAppsServiceBuildPartial.isInitialized()) {
                    return connectIQInstalledAppsServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectIQInstalledAppsServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQInstalledAppsService buildPartial() {
                ConnectIQInstalledAppsService connectIQInstalledAppsService = new ConnectIQInstalledAppsService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectIQInstalledAppsService);
                }
                onBuilt();
                return connectIQInstalledAppsService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.getInstalledAppsRequest_ = null;
                SingleFieldBuilderV3<GetInstalledAppsRequest, GetInstalledAppsRequest.Builder, GetInstalledAppsRequestOrBuilder> singleFieldBuilderV3 = this.getInstalledAppsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getInstalledAppsRequestBuilder_ = null;
                }
                this.getInstalledAppsResponse_ = null;
                SingleFieldBuilderV3<GetInstalledAppsResponse, GetInstalledAppsResponse.Builder, GetInstalledAppsResponseOrBuilder> singleFieldBuilderV4 = this.getInstalledAppsResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.getInstalledAppsResponseBuilder_ = null;
                }
                this.deleteAppRequest_ = null;
                SingleFieldBuilderV3<DeleteAppRequest, DeleteAppRequest.Builder, DeleteAppRequestOrBuilder> singleFieldBuilderV5 = this.deleteAppRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.deleteAppRequestBuilder_ = null;
                }
                this.deleteAppResponse_ = null;
                SingleFieldBuilderV3<DeleteAppResponse, DeleteAppResponse.Builder, DeleteAppResponseOrBuilder> singleFieldBuilderV6 = this.deleteAppResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.deleteAppResponseBuilder_ = null;
                }
                this.updateInstalledAppRequest_ = null;
                SingleFieldBuilderV3<UpdateInstalledAppsRequest, UpdateInstalledAppsRequest.Builder, UpdateInstalledAppsRequestOrBuilder> singleFieldBuilderV7 = this.updateInstalledAppRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.updateInstalledAppRequestBuilder_ = null;
                }
                this.updateInstalledAppResponse_ = null;
                SingleFieldBuilderV3<UpdateInstalledAppsResponse, UpdateInstalledAppsResponse.Builder, UpdateInstalledAppsResponseOrBuilder> singleFieldBuilderV8 = this.updateInstalledAppResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.updateInstalledAppResponseBuilder_ = null;
                }
                this.enableNativeAppRequest_ = null;
                SingleFieldBuilderV3<EnableNativeAppRequest, EnableNativeAppRequest.Builder, EnableNativeAppRequestOrBuilder> singleFieldBuilderV9 = this.enableNativeAppRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.enableNativeAppRequestBuilder_ = null;
                }
                this.enableNativeAppResponse_ = null;
                SingleFieldBuilderV3<EnableNativeAppResponse, EnableNativeAppResponse.Builder, EnableNativeAppResponseOrBuilder> singleFieldBuilderV10 = this.enableNativeAppResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.enableNativeAppResponseBuilder_ = null;
                }
                this.launchAppRequest_ = null;
                SingleFieldBuilderV3<LaunchAppRequest, LaunchAppRequest.Builder, LaunchAppRequestOrBuilder> singleFieldBuilderV11 = this.launchAppRequestBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.launchAppRequestBuilder_ = null;
                }
                this.launchAppResponse_ = null;
                SingleFieldBuilderV3<LaunchAppResponse, LaunchAppResponse.Builder, LaunchAppResponseOrBuilder> singleFieldBuilderV12 = this.launchAppResponseBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.launchAppResponseBuilder_ = null;
                }
                this.updateFaceitProjectIdMappingsRequest_ = null;
                SingleFieldBuilderV3<UpdateFaceItProjectIdMappingsRequest, UpdateFaceItProjectIdMappingsRequest.Builder, UpdateFaceItProjectIdMappingsRequestOrBuilder> singleFieldBuilderV13 = this.updateFaceitProjectIdMappingsRequestBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.updateFaceitProjectIdMappingsRequestBuilder_ = null;
                }
                this.updateFaceitProjectIdMappingsResponse_ = null;
                SingleFieldBuilderV3<UpdateFaceItProjectIdMappingsResponse, UpdateFaceItProjectIdMappingsResponse.Builder, UpdateFaceItProjectIdMappingsResponseOrBuilder> singleFieldBuilderV14 = this.updateFaceitProjectIdMappingsResponseBuilder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.updateFaceitProjectIdMappingsResponseBuilder_ = null;
                }
                this.pendingAppInstallRequest_ = null;
                SingleFieldBuilderV3<PendingAppInstallRequest, PendingAppInstallRequest.Builder, PendingAppInstallRequestOrBuilder> singleFieldBuilderV15 = this.pendingAppInstallRequestBuilder_;
                if (singleFieldBuilderV15 != null) {
                    singleFieldBuilderV15.dispose();
                    this.pendingAppInstallRequestBuilder_ = null;
                }
                this.pendingAppInstallResponse_ = null;
                SingleFieldBuilderV3<PendingAppInstallResponse, PendingAppInstallResponse.Builder, PendingAppInstallResponseOrBuilder> singleFieldBuilderV16 = this.pendingAppInstallResponseBuilder_;
                if (singleFieldBuilderV16 != null) {
                    singleFieldBuilderV16.dispose();
                    this.pendingAppInstallResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearDeleteAppRequest() {
                this.bitField0_ &= -5;
                this.deleteAppRequest_ = null;
                SingleFieldBuilderV3<DeleteAppRequest, DeleteAppRequest.Builder, DeleteAppRequestOrBuilder> singleFieldBuilderV3 = this.deleteAppRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deleteAppRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDeleteAppResponse() {
                this.bitField0_ &= -9;
                this.deleteAppResponse_ = null;
                SingleFieldBuilderV3<DeleteAppResponse, DeleteAppResponse.Builder, DeleteAppResponseOrBuilder> singleFieldBuilderV3 = this.deleteAppResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deleteAppResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEnableNativeAppRequest() {
                this.bitField0_ &= -65;
                this.enableNativeAppRequest_ = null;
                SingleFieldBuilderV3<EnableNativeAppRequest, EnableNativeAppRequest.Builder, EnableNativeAppRequestOrBuilder> singleFieldBuilderV3 = this.enableNativeAppRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.enableNativeAppRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEnableNativeAppResponse() {
                this.bitField0_ &= -129;
                this.enableNativeAppResponse_ = null;
                SingleFieldBuilderV3<EnableNativeAppResponse, EnableNativeAppResponse.Builder, EnableNativeAppResponseOrBuilder> singleFieldBuilderV3 = this.enableNativeAppResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.enableNativeAppResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGetInstalledAppsRequest() {
                this.bitField0_ &= -2;
                this.getInstalledAppsRequest_ = null;
                SingleFieldBuilderV3<GetInstalledAppsRequest, GetInstalledAppsRequest.Builder, GetInstalledAppsRequestOrBuilder> singleFieldBuilderV3 = this.getInstalledAppsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getInstalledAppsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearGetInstalledAppsResponse() {
                this.bitField0_ &= -3;
                this.getInstalledAppsResponse_ = null;
                SingleFieldBuilderV3<GetInstalledAppsResponse, GetInstalledAppsResponse.Builder, GetInstalledAppsResponseOrBuilder> singleFieldBuilderV3 = this.getInstalledAppsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getInstalledAppsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLaunchAppRequest() {
                this.bitField0_ &= -257;
                this.launchAppRequest_ = null;
                SingleFieldBuilderV3<LaunchAppRequest, LaunchAppRequest.Builder, LaunchAppRequestOrBuilder> singleFieldBuilderV3 = this.launchAppRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.launchAppRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLaunchAppResponse() {
                this.bitField0_ &= -513;
                this.launchAppResponse_ = null;
                SingleFieldBuilderV3<LaunchAppResponse, LaunchAppResponse.Builder, LaunchAppResponseOrBuilder> singleFieldBuilderV3 = this.launchAppResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.launchAppResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPendingAppInstallRequest() {
                this.bitField0_ &= -4097;
                this.pendingAppInstallRequest_ = null;
                SingleFieldBuilderV3<PendingAppInstallRequest, PendingAppInstallRequest.Builder, PendingAppInstallRequestOrBuilder> singleFieldBuilderV3 = this.pendingAppInstallRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.pendingAppInstallRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPendingAppInstallResponse() {
                this.bitField0_ &= -8193;
                this.pendingAppInstallResponse_ = null;
                SingleFieldBuilderV3<PendingAppInstallResponse, PendingAppInstallResponse.Builder, PendingAppInstallResponseOrBuilder> singleFieldBuilderV3 = this.pendingAppInstallResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.pendingAppInstallResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUpdateFaceitProjectIdMappingsRequest() {
                this.bitField0_ &= -1025;
                this.updateFaceitProjectIdMappingsRequest_ = null;
                SingleFieldBuilderV3<UpdateFaceItProjectIdMappingsRequest, UpdateFaceItProjectIdMappingsRequest.Builder, UpdateFaceItProjectIdMappingsRequestOrBuilder> singleFieldBuilderV3 = this.updateFaceitProjectIdMappingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.updateFaceitProjectIdMappingsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUpdateFaceitProjectIdMappingsResponse() {
                this.bitField0_ &= -2049;
                this.updateFaceitProjectIdMappingsResponse_ = null;
                SingleFieldBuilderV3<UpdateFaceItProjectIdMappingsResponse, UpdateFaceItProjectIdMappingsResponse.Builder, UpdateFaceItProjectIdMappingsResponseOrBuilder> singleFieldBuilderV3 = this.updateFaceitProjectIdMappingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.updateFaceitProjectIdMappingsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUpdateInstalledAppRequest() {
                this.bitField0_ &= -17;
                this.updateInstalledAppRequest_ = null;
                SingleFieldBuilderV3<UpdateInstalledAppsRequest, UpdateInstalledAppsRequest.Builder, UpdateInstalledAppsRequestOrBuilder> singleFieldBuilderV3 = this.updateInstalledAppRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.updateInstalledAppRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUpdateInstalledAppResponse() {
                this.bitField0_ &= -33;
                this.updateInstalledAppResponse_ = null;
                SingleFieldBuilderV3<UpdateInstalledAppsResponse, UpdateInstalledAppsResponse.Builder, UpdateInstalledAppsResponseOrBuilder> singleFieldBuilderV3 = this.updateInstalledAppResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.updateInstalledAppResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public DeleteAppRequest getDeleteAppRequest() {
                SingleFieldBuilderV3<DeleteAppRequest, DeleteAppRequest.Builder, DeleteAppRequestOrBuilder> singleFieldBuilderV3 = this.deleteAppRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeleteAppRequest) singleFieldBuilderV3.getMessage();
                }
                DeleteAppRequest deleteAppRequest = this.deleteAppRequest_;
                return deleteAppRequest == null ? DeleteAppRequest.getDefaultInstance() : deleteAppRequest;
            }

            public DeleteAppRequest.Builder getDeleteAppRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (DeleteAppRequest.Builder) getDeleteAppRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public DeleteAppRequestOrBuilder getDeleteAppRequestOrBuilder() {
                SingleFieldBuilderV3<DeleteAppRequest, DeleteAppRequest.Builder, DeleteAppRequestOrBuilder> singleFieldBuilderV3 = this.deleteAppRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeleteAppRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DeleteAppRequest deleteAppRequest = this.deleteAppRequest_;
                return deleteAppRequest == null ? DeleteAppRequest.getDefaultInstance() : deleteAppRequest;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public DeleteAppResponse getDeleteAppResponse() {
                SingleFieldBuilderV3<DeleteAppResponse, DeleteAppResponse.Builder, DeleteAppResponseOrBuilder> singleFieldBuilderV3 = this.deleteAppResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeleteAppResponse) singleFieldBuilderV3.getMessage();
                }
                DeleteAppResponse deleteAppResponse = this.deleteAppResponse_;
                return deleteAppResponse == null ? DeleteAppResponse.getDefaultInstance() : deleteAppResponse;
            }

            public DeleteAppResponse.Builder getDeleteAppResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (DeleteAppResponse.Builder) getDeleteAppResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public DeleteAppResponseOrBuilder getDeleteAppResponseOrBuilder() {
                SingleFieldBuilderV3<DeleteAppResponse, DeleteAppResponse.Builder, DeleteAppResponseOrBuilder> singleFieldBuilderV3 = this.deleteAppResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeleteAppResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DeleteAppResponse deleteAppResponse = this.deleteAppResponse_;
                return deleteAppResponse == null ? DeleteAppResponse.getDefaultInstance() : deleteAppResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_ConnectIQInstalledAppsService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public EnableNativeAppRequest getEnableNativeAppRequest() {
                SingleFieldBuilderV3<EnableNativeAppRequest, EnableNativeAppRequest.Builder, EnableNativeAppRequestOrBuilder> singleFieldBuilderV3 = this.enableNativeAppRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EnableNativeAppRequest) singleFieldBuilderV3.getMessage();
                }
                EnableNativeAppRequest enableNativeAppRequest = this.enableNativeAppRequest_;
                return enableNativeAppRequest == null ? EnableNativeAppRequest.getDefaultInstance() : enableNativeAppRequest;
            }

            public EnableNativeAppRequest.Builder getEnableNativeAppRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (EnableNativeAppRequest.Builder) getEnableNativeAppRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public EnableNativeAppRequestOrBuilder getEnableNativeAppRequestOrBuilder() {
                SingleFieldBuilderV3<EnableNativeAppRequest, EnableNativeAppRequest.Builder, EnableNativeAppRequestOrBuilder> singleFieldBuilderV3 = this.enableNativeAppRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EnableNativeAppRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EnableNativeAppRequest enableNativeAppRequest = this.enableNativeAppRequest_;
                return enableNativeAppRequest == null ? EnableNativeAppRequest.getDefaultInstance() : enableNativeAppRequest;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public EnableNativeAppResponse getEnableNativeAppResponse() {
                SingleFieldBuilderV3<EnableNativeAppResponse, EnableNativeAppResponse.Builder, EnableNativeAppResponseOrBuilder> singleFieldBuilderV3 = this.enableNativeAppResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EnableNativeAppResponse) singleFieldBuilderV3.getMessage();
                }
                EnableNativeAppResponse enableNativeAppResponse = this.enableNativeAppResponse_;
                return enableNativeAppResponse == null ? EnableNativeAppResponse.getDefaultInstance() : enableNativeAppResponse;
            }

            public EnableNativeAppResponse.Builder getEnableNativeAppResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (EnableNativeAppResponse.Builder) getEnableNativeAppResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public EnableNativeAppResponseOrBuilder getEnableNativeAppResponseOrBuilder() {
                SingleFieldBuilderV3<EnableNativeAppResponse, EnableNativeAppResponse.Builder, EnableNativeAppResponseOrBuilder> singleFieldBuilderV3 = this.enableNativeAppResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EnableNativeAppResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EnableNativeAppResponse enableNativeAppResponse = this.enableNativeAppResponse_;
                return enableNativeAppResponse == null ? EnableNativeAppResponse.getDefaultInstance() : enableNativeAppResponse;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public GetInstalledAppsRequest getGetInstalledAppsRequest() {
                SingleFieldBuilderV3<GetInstalledAppsRequest, GetInstalledAppsRequest.Builder, GetInstalledAppsRequestOrBuilder> singleFieldBuilderV3 = this.getInstalledAppsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetInstalledAppsRequest) singleFieldBuilderV3.getMessage();
                }
                GetInstalledAppsRequest getInstalledAppsRequest = this.getInstalledAppsRequest_;
                return getInstalledAppsRequest == null ? GetInstalledAppsRequest.getDefaultInstance() : getInstalledAppsRequest;
            }

            public GetInstalledAppsRequest.Builder getGetInstalledAppsRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GetInstalledAppsRequest.Builder) getGetInstalledAppsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public GetInstalledAppsRequestOrBuilder getGetInstalledAppsRequestOrBuilder() {
                SingleFieldBuilderV3<GetInstalledAppsRequest, GetInstalledAppsRequest.Builder, GetInstalledAppsRequestOrBuilder> singleFieldBuilderV3 = this.getInstalledAppsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetInstalledAppsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetInstalledAppsRequest getInstalledAppsRequest = this.getInstalledAppsRequest_;
                return getInstalledAppsRequest == null ? GetInstalledAppsRequest.getDefaultInstance() : getInstalledAppsRequest;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public GetInstalledAppsResponse getGetInstalledAppsResponse() {
                SingleFieldBuilderV3<GetInstalledAppsResponse, GetInstalledAppsResponse.Builder, GetInstalledAppsResponseOrBuilder> singleFieldBuilderV3 = this.getInstalledAppsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetInstalledAppsResponse) singleFieldBuilderV3.getMessage();
                }
                GetInstalledAppsResponse getInstalledAppsResponse = this.getInstalledAppsResponse_;
                return getInstalledAppsResponse == null ? GetInstalledAppsResponse.getDefaultInstance() : getInstalledAppsResponse;
            }

            public GetInstalledAppsResponse.Builder getGetInstalledAppsResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (GetInstalledAppsResponse.Builder) getGetInstalledAppsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public GetInstalledAppsResponseOrBuilder getGetInstalledAppsResponseOrBuilder() {
                SingleFieldBuilderV3<GetInstalledAppsResponse, GetInstalledAppsResponse.Builder, GetInstalledAppsResponseOrBuilder> singleFieldBuilderV3 = this.getInstalledAppsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetInstalledAppsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetInstalledAppsResponse getInstalledAppsResponse = this.getInstalledAppsResponse_;
                return getInstalledAppsResponse == null ? GetInstalledAppsResponse.getDefaultInstance() : getInstalledAppsResponse;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public LaunchAppRequest getLaunchAppRequest() {
                SingleFieldBuilderV3<LaunchAppRequest, LaunchAppRequest.Builder, LaunchAppRequestOrBuilder> singleFieldBuilderV3 = this.launchAppRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LaunchAppRequest) singleFieldBuilderV3.getMessage();
                }
                LaunchAppRequest launchAppRequest = this.launchAppRequest_;
                return launchAppRequest == null ? LaunchAppRequest.getDefaultInstance() : launchAppRequest;
            }

            public LaunchAppRequest.Builder getLaunchAppRequestBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (LaunchAppRequest.Builder) getLaunchAppRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public LaunchAppRequestOrBuilder getLaunchAppRequestOrBuilder() {
                SingleFieldBuilderV3<LaunchAppRequest, LaunchAppRequest.Builder, LaunchAppRequestOrBuilder> singleFieldBuilderV3 = this.launchAppRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LaunchAppRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LaunchAppRequest launchAppRequest = this.launchAppRequest_;
                return launchAppRequest == null ? LaunchAppRequest.getDefaultInstance() : launchAppRequest;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public LaunchAppResponse getLaunchAppResponse() {
                SingleFieldBuilderV3<LaunchAppResponse, LaunchAppResponse.Builder, LaunchAppResponseOrBuilder> singleFieldBuilderV3 = this.launchAppResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LaunchAppResponse) singleFieldBuilderV3.getMessage();
                }
                LaunchAppResponse launchAppResponse = this.launchAppResponse_;
                return launchAppResponse == null ? LaunchAppResponse.getDefaultInstance() : launchAppResponse;
            }

            public LaunchAppResponse.Builder getLaunchAppResponseBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (LaunchAppResponse.Builder) getLaunchAppResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public LaunchAppResponseOrBuilder getLaunchAppResponseOrBuilder() {
                SingleFieldBuilderV3<LaunchAppResponse, LaunchAppResponse.Builder, LaunchAppResponseOrBuilder> singleFieldBuilderV3 = this.launchAppResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LaunchAppResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LaunchAppResponse launchAppResponse = this.launchAppResponse_;
                return launchAppResponse == null ? LaunchAppResponse.getDefaultInstance() : launchAppResponse;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public PendingAppInstallRequest getPendingAppInstallRequest() {
                SingleFieldBuilderV3<PendingAppInstallRequest, PendingAppInstallRequest.Builder, PendingAppInstallRequestOrBuilder> singleFieldBuilderV3 = this.pendingAppInstallRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PendingAppInstallRequest) singleFieldBuilderV3.getMessage();
                }
                PendingAppInstallRequest pendingAppInstallRequest = this.pendingAppInstallRequest_;
                return pendingAppInstallRequest == null ? PendingAppInstallRequest.getDefaultInstance() : pendingAppInstallRequest;
            }

            public PendingAppInstallRequest.Builder getPendingAppInstallRequestBuilder() {
                this.bitField0_ |= 4096;
                onChanged();
                return (PendingAppInstallRequest.Builder) getPendingAppInstallRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public PendingAppInstallRequestOrBuilder getPendingAppInstallRequestOrBuilder() {
                SingleFieldBuilderV3<PendingAppInstallRequest, PendingAppInstallRequest.Builder, PendingAppInstallRequestOrBuilder> singleFieldBuilderV3 = this.pendingAppInstallRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PendingAppInstallRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PendingAppInstallRequest pendingAppInstallRequest = this.pendingAppInstallRequest_;
                return pendingAppInstallRequest == null ? PendingAppInstallRequest.getDefaultInstance() : pendingAppInstallRequest;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public PendingAppInstallResponse getPendingAppInstallResponse() {
                SingleFieldBuilderV3<PendingAppInstallResponse, PendingAppInstallResponse.Builder, PendingAppInstallResponseOrBuilder> singleFieldBuilderV3 = this.pendingAppInstallResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PendingAppInstallResponse) singleFieldBuilderV3.getMessage();
                }
                PendingAppInstallResponse pendingAppInstallResponse = this.pendingAppInstallResponse_;
                return pendingAppInstallResponse == null ? PendingAppInstallResponse.getDefaultInstance() : pendingAppInstallResponse;
            }

            public PendingAppInstallResponse.Builder getPendingAppInstallResponseBuilder() {
                this.bitField0_ |= 8192;
                onChanged();
                return (PendingAppInstallResponse.Builder) getPendingAppInstallResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public PendingAppInstallResponseOrBuilder getPendingAppInstallResponseOrBuilder() {
                SingleFieldBuilderV3<PendingAppInstallResponse, PendingAppInstallResponse.Builder, PendingAppInstallResponseOrBuilder> singleFieldBuilderV3 = this.pendingAppInstallResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PendingAppInstallResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PendingAppInstallResponse pendingAppInstallResponse = this.pendingAppInstallResponse_;
                return pendingAppInstallResponse == null ? PendingAppInstallResponse.getDefaultInstance() : pendingAppInstallResponse;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public UpdateFaceItProjectIdMappingsRequest getUpdateFaceitProjectIdMappingsRequest() {
                SingleFieldBuilderV3<UpdateFaceItProjectIdMappingsRequest, UpdateFaceItProjectIdMappingsRequest.Builder, UpdateFaceItProjectIdMappingsRequestOrBuilder> singleFieldBuilderV3 = this.updateFaceitProjectIdMappingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateFaceItProjectIdMappingsRequest) singleFieldBuilderV3.getMessage();
                }
                UpdateFaceItProjectIdMappingsRequest updateFaceItProjectIdMappingsRequest = this.updateFaceitProjectIdMappingsRequest_;
                return updateFaceItProjectIdMappingsRequest == null ? UpdateFaceItProjectIdMappingsRequest.getDefaultInstance() : updateFaceItProjectIdMappingsRequest;
            }

            public UpdateFaceItProjectIdMappingsRequest.Builder getUpdateFaceitProjectIdMappingsRequestBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (UpdateFaceItProjectIdMappingsRequest.Builder) getUpdateFaceitProjectIdMappingsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public UpdateFaceItProjectIdMappingsRequestOrBuilder getUpdateFaceitProjectIdMappingsRequestOrBuilder() {
                SingleFieldBuilderV3<UpdateFaceItProjectIdMappingsRequest, UpdateFaceItProjectIdMappingsRequest.Builder, UpdateFaceItProjectIdMappingsRequestOrBuilder> singleFieldBuilderV3 = this.updateFaceitProjectIdMappingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateFaceItProjectIdMappingsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UpdateFaceItProjectIdMappingsRequest updateFaceItProjectIdMappingsRequest = this.updateFaceitProjectIdMappingsRequest_;
                return updateFaceItProjectIdMappingsRequest == null ? UpdateFaceItProjectIdMappingsRequest.getDefaultInstance() : updateFaceItProjectIdMappingsRequest;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public UpdateFaceItProjectIdMappingsResponse getUpdateFaceitProjectIdMappingsResponse() {
                SingleFieldBuilderV3<UpdateFaceItProjectIdMappingsResponse, UpdateFaceItProjectIdMappingsResponse.Builder, UpdateFaceItProjectIdMappingsResponseOrBuilder> singleFieldBuilderV3 = this.updateFaceitProjectIdMappingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateFaceItProjectIdMappingsResponse) singleFieldBuilderV3.getMessage();
                }
                UpdateFaceItProjectIdMappingsResponse updateFaceItProjectIdMappingsResponse = this.updateFaceitProjectIdMappingsResponse_;
                return updateFaceItProjectIdMappingsResponse == null ? UpdateFaceItProjectIdMappingsResponse.getDefaultInstance() : updateFaceItProjectIdMappingsResponse;
            }

            public UpdateFaceItProjectIdMappingsResponse.Builder getUpdateFaceitProjectIdMappingsResponseBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (UpdateFaceItProjectIdMappingsResponse.Builder) getUpdateFaceitProjectIdMappingsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public UpdateFaceItProjectIdMappingsResponseOrBuilder getUpdateFaceitProjectIdMappingsResponseOrBuilder() {
                SingleFieldBuilderV3<UpdateFaceItProjectIdMappingsResponse, UpdateFaceItProjectIdMappingsResponse.Builder, UpdateFaceItProjectIdMappingsResponseOrBuilder> singleFieldBuilderV3 = this.updateFaceitProjectIdMappingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateFaceItProjectIdMappingsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UpdateFaceItProjectIdMappingsResponse updateFaceItProjectIdMappingsResponse = this.updateFaceitProjectIdMappingsResponse_;
                return updateFaceItProjectIdMappingsResponse == null ? UpdateFaceItProjectIdMappingsResponse.getDefaultInstance() : updateFaceItProjectIdMappingsResponse;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public UpdateInstalledAppsRequest getUpdateInstalledAppRequest() {
                SingleFieldBuilderV3<UpdateInstalledAppsRequest, UpdateInstalledAppsRequest.Builder, UpdateInstalledAppsRequestOrBuilder> singleFieldBuilderV3 = this.updateInstalledAppRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateInstalledAppsRequest) singleFieldBuilderV3.getMessage();
                }
                UpdateInstalledAppsRequest updateInstalledAppsRequest = this.updateInstalledAppRequest_;
                return updateInstalledAppsRequest == null ? UpdateInstalledAppsRequest.getDefaultInstance() : updateInstalledAppsRequest;
            }

            public UpdateInstalledAppsRequest.Builder getUpdateInstalledAppRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (UpdateInstalledAppsRequest.Builder) getUpdateInstalledAppRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public UpdateInstalledAppsRequestOrBuilder getUpdateInstalledAppRequestOrBuilder() {
                SingleFieldBuilderV3<UpdateInstalledAppsRequest, UpdateInstalledAppsRequest.Builder, UpdateInstalledAppsRequestOrBuilder> singleFieldBuilderV3 = this.updateInstalledAppRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateInstalledAppsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UpdateInstalledAppsRequest updateInstalledAppsRequest = this.updateInstalledAppRequest_;
                return updateInstalledAppsRequest == null ? UpdateInstalledAppsRequest.getDefaultInstance() : updateInstalledAppsRequest;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public UpdateInstalledAppsResponse getUpdateInstalledAppResponse() {
                SingleFieldBuilderV3<UpdateInstalledAppsResponse, UpdateInstalledAppsResponse.Builder, UpdateInstalledAppsResponseOrBuilder> singleFieldBuilderV3 = this.updateInstalledAppResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateInstalledAppsResponse) singleFieldBuilderV3.getMessage();
                }
                UpdateInstalledAppsResponse updateInstalledAppsResponse = this.updateInstalledAppResponse_;
                return updateInstalledAppsResponse == null ? UpdateInstalledAppsResponse.getDefaultInstance() : updateInstalledAppsResponse;
            }

            public UpdateInstalledAppsResponse.Builder getUpdateInstalledAppResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (UpdateInstalledAppsResponse.Builder) getUpdateInstalledAppResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public UpdateInstalledAppsResponseOrBuilder getUpdateInstalledAppResponseOrBuilder() {
                SingleFieldBuilderV3<UpdateInstalledAppsResponse, UpdateInstalledAppsResponse.Builder, UpdateInstalledAppsResponseOrBuilder> singleFieldBuilderV3 = this.updateInstalledAppResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateInstalledAppsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UpdateInstalledAppsResponse updateInstalledAppsResponse = this.updateInstalledAppResponse_;
                return updateInstalledAppsResponse == null ? UpdateInstalledAppsResponse.getDefaultInstance() : updateInstalledAppsResponse;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public boolean hasDeleteAppRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public boolean hasDeleteAppResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public boolean hasEnableNativeAppRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public boolean hasEnableNativeAppResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public boolean hasGetInstalledAppsRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public boolean hasGetInstalledAppsResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public boolean hasLaunchAppRequest() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public boolean hasLaunchAppResponse() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public boolean hasPendingAppInstallRequest() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public boolean hasPendingAppInstallResponse() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public boolean hasUpdateFaceitProjectIdMappingsRequest() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public boolean hasUpdateFaceitProjectIdMappingsResponse() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public boolean hasUpdateInstalledAppRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.ConnectIQInstalledAppsServiceOrBuilder
            public boolean hasUpdateInstalledAppResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_ConnectIQInstalledAppsService_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQInstalledAppsService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasGetInstalledAppsRequest() && !getGetInstalledAppsRequest().isInitialized()) {
                    return false;
                }
                if (hasGetInstalledAppsResponse() && !getGetInstalledAppsResponse().isInitialized()) {
                    return false;
                }
                if (hasDeleteAppRequest() && !getDeleteAppRequest().isInitialized()) {
                    return false;
                }
                if (hasDeleteAppResponse() && !getDeleteAppResponse().isInitialized()) {
                    return false;
                }
                if (hasUpdateInstalledAppRequest() && !getUpdateInstalledAppRequest().isInitialized()) {
                    return false;
                }
                if (hasUpdateInstalledAppResponse() && !getUpdateInstalledAppResponse().isInitialized()) {
                    return false;
                }
                if (hasEnableNativeAppRequest() && !getEnableNativeAppRequest().isInitialized()) {
                    return false;
                }
                if (hasEnableNativeAppResponse() && !getEnableNativeAppResponse().isInitialized()) {
                    return false;
                }
                if (!hasLaunchAppRequest() || getLaunchAppRequest().isInitialized()) {
                    return !hasLaunchAppResponse() || getLaunchAppResponse().isInitialized();
                }
                return false;
            }

            public Builder mergeDeleteAppRequest(DeleteAppRequest deleteAppRequest) {
                DeleteAppRequest deleteAppRequest2;
                SingleFieldBuilderV3<DeleteAppRequest, DeleteAppRequest.Builder, DeleteAppRequestOrBuilder> singleFieldBuilderV3 = this.deleteAppRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deleteAppRequest);
                } else if ((this.bitField0_ & 4) == 0 || (deleteAppRequest2 = this.deleteAppRequest_) == null || deleteAppRequest2 == DeleteAppRequest.getDefaultInstance()) {
                    this.deleteAppRequest_ = deleteAppRequest;
                } else {
                    getDeleteAppRequestBuilder().mergeFrom(deleteAppRequest);
                }
                if (this.deleteAppRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDeleteAppResponse(DeleteAppResponse deleteAppResponse) {
                DeleteAppResponse deleteAppResponse2;
                SingleFieldBuilderV3<DeleteAppResponse, DeleteAppResponse.Builder, DeleteAppResponseOrBuilder> singleFieldBuilderV3 = this.deleteAppResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deleteAppResponse);
                } else if ((this.bitField0_ & 8) == 0 || (deleteAppResponse2 = this.deleteAppResponse_) == null || deleteAppResponse2 == DeleteAppResponse.getDefaultInstance()) {
                    this.deleteAppResponse_ = deleteAppResponse;
                } else {
                    getDeleteAppResponseBuilder().mergeFrom(deleteAppResponse);
                }
                if (this.deleteAppResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeEnableNativeAppRequest(EnableNativeAppRequest enableNativeAppRequest) {
                EnableNativeAppRequest enableNativeAppRequest2;
                SingleFieldBuilderV3<EnableNativeAppRequest, EnableNativeAppRequest.Builder, EnableNativeAppRequestOrBuilder> singleFieldBuilderV3 = this.enableNativeAppRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(enableNativeAppRequest);
                } else if ((this.bitField0_ & 64) == 0 || (enableNativeAppRequest2 = this.enableNativeAppRequest_) == null || enableNativeAppRequest2 == EnableNativeAppRequest.getDefaultInstance()) {
                    this.enableNativeAppRequest_ = enableNativeAppRequest;
                } else {
                    getEnableNativeAppRequestBuilder().mergeFrom(enableNativeAppRequest);
                }
                if (this.enableNativeAppRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeEnableNativeAppResponse(EnableNativeAppResponse enableNativeAppResponse) {
                EnableNativeAppResponse enableNativeAppResponse2;
                SingleFieldBuilderV3<EnableNativeAppResponse, EnableNativeAppResponse.Builder, EnableNativeAppResponseOrBuilder> singleFieldBuilderV3 = this.enableNativeAppResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(enableNativeAppResponse);
                } else if ((this.bitField0_ & 128) == 0 || (enableNativeAppResponse2 = this.enableNativeAppResponse_) == null || enableNativeAppResponse2 == EnableNativeAppResponse.getDefaultInstance()) {
                    this.enableNativeAppResponse_ = enableNativeAppResponse;
                } else {
                    getEnableNativeAppResponseBuilder().mergeFrom(enableNativeAppResponse);
                }
                if (this.enableNativeAppResponse_ != null) {
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
                                    codedInputStream.readMessage(getGetInstalledAppsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getGetInstalledAppsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getDeleteAppRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getDeleteAppResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getUpdateInstalledAppRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getUpdateInstalledAppResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getEnableNativeAppRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getEnableNativeAppResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getLaunchAppRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getLaunchAppResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getUpdateFaceitProjectIdMappingsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 98:
                                    codedInputStream.readMessage(getUpdateFaceitProjectIdMappingsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 106:
                                    codedInputStream.readMessage(getPendingAppInstallRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 114:
                                    codedInputStream.readMessage(getPendingAppInstallResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeGetInstalledAppsRequest(GetInstalledAppsRequest getInstalledAppsRequest) {
                GetInstalledAppsRequest getInstalledAppsRequest2;
                SingleFieldBuilderV3<GetInstalledAppsRequest, GetInstalledAppsRequest.Builder, GetInstalledAppsRequestOrBuilder> singleFieldBuilderV3 = this.getInstalledAppsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getInstalledAppsRequest);
                } else if ((this.bitField0_ & 1) == 0 || (getInstalledAppsRequest2 = this.getInstalledAppsRequest_) == null || getInstalledAppsRequest2 == GetInstalledAppsRequest.getDefaultInstance()) {
                    this.getInstalledAppsRequest_ = getInstalledAppsRequest;
                } else {
                    getGetInstalledAppsRequestBuilder().mergeFrom(getInstalledAppsRequest);
                }
                if (this.getInstalledAppsRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeGetInstalledAppsResponse(GetInstalledAppsResponse getInstalledAppsResponse) {
                GetInstalledAppsResponse getInstalledAppsResponse2;
                SingleFieldBuilderV3<GetInstalledAppsResponse, GetInstalledAppsResponse.Builder, GetInstalledAppsResponseOrBuilder> singleFieldBuilderV3 = this.getInstalledAppsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getInstalledAppsResponse);
                } else if ((this.bitField0_ & 2) == 0 || (getInstalledAppsResponse2 = this.getInstalledAppsResponse_) == null || getInstalledAppsResponse2 == GetInstalledAppsResponse.getDefaultInstance()) {
                    this.getInstalledAppsResponse_ = getInstalledAppsResponse;
                } else {
                    getGetInstalledAppsResponseBuilder().mergeFrom(getInstalledAppsResponse);
                }
                if (this.getInstalledAppsResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeLaunchAppRequest(LaunchAppRequest launchAppRequest) {
                LaunchAppRequest launchAppRequest2;
                SingleFieldBuilderV3<LaunchAppRequest, LaunchAppRequest.Builder, LaunchAppRequestOrBuilder> singleFieldBuilderV3 = this.launchAppRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(launchAppRequest);
                } else if ((this.bitField0_ & 256) == 0 || (launchAppRequest2 = this.launchAppRequest_) == null || launchAppRequest2 == LaunchAppRequest.getDefaultInstance()) {
                    this.launchAppRequest_ = launchAppRequest;
                } else {
                    getLaunchAppRequestBuilder().mergeFrom(launchAppRequest);
                }
                if (this.launchAppRequest_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeLaunchAppResponse(LaunchAppResponse launchAppResponse) {
                LaunchAppResponse launchAppResponse2;
                SingleFieldBuilderV3<LaunchAppResponse, LaunchAppResponse.Builder, LaunchAppResponseOrBuilder> singleFieldBuilderV3 = this.launchAppResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(launchAppResponse);
                } else if ((this.bitField0_ & 512) == 0 || (launchAppResponse2 = this.launchAppResponse_) == null || launchAppResponse2 == LaunchAppResponse.getDefaultInstance()) {
                    this.launchAppResponse_ = launchAppResponse;
                } else {
                    getLaunchAppResponseBuilder().mergeFrom(launchAppResponse);
                }
                if (this.launchAppResponse_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergePendingAppInstallRequest(PendingAppInstallRequest pendingAppInstallRequest) {
                PendingAppInstallRequest pendingAppInstallRequest2;
                SingleFieldBuilderV3<PendingAppInstallRequest, PendingAppInstallRequest.Builder, PendingAppInstallRequestOrBuilder> singleFieldBuilderV3 = this.pendingAppInstallRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(pendingAppInstallRequest);
                } else if ((this.bitField0_ & 4096) == 0 || (pendingAppInstallRequest2 = this.pendingAppInstallRequest_) == null || pendingAppInstallRequest2 == PendingAppInstallRequest.getDefaultInstance()) {
                    this.pendingAppInstallRequest_ = pendingAppInstallRequest;
                } else {
                    getPendingAppInstallRequestBuilder().mergeFrom(pendingAppInstallRequest);
                }
                if (this.pendingAppInstallRequest_ != null) {
                    this.bitField0_ |= 4096;
                    onChanged();
                }
                return this;
            }

            public Builder mergePendingAppInstallResponse(PendingAppInstallResponse pendingAppInstallResponse) {
                PendingAppInstallResponse pendingAppInstallResponse2;
                SingleFieldBuilderV3<PendingAppInstallResponse, PendingAppInstallResponse.Builder, PendingAppInstallResponseOrBuilder> singleFieldBuilderV3 = this.pendingAppInstallResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(pendingAppInstallResponse);
                } else if ((this.bitField0_ & 8192) == 0 || (pendingAppInstallResponse2 = this.pendingAppInstallResponse_) == null || pendingAppInstallResponse2 == PendingAppInstallResponse.getDefaultInstance()) {
                    this.pendingAppInstallResponse_ = pendingAppInstallResponse;
                } else {
                    getPendingAppInstallResponseBuilder().mergeFrom(pendingAppInstallResponse);
                }
                if (this.pendingAppInstallResponse_ != null) {
                    this.bitField0_ |= 8192;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder mergeUpdateFaceitProjectIdMappingsRequest(UpdateFaceItProjectIdMappingsRequest updateFaceItProjectIdMappingsRequest) {
                UpdateFaceItProjectIdMappingsRequest updateFaceItProjectIdMappingsRequest2;
                SingleFieldBuilderV3<UpdateFaceItProjectIdMappingsRequest, UpdateFaceItProjectIdMappingsRequest.Builder, UpdateFaceItProjectIdMappingsRequestOrBuilder> singleFieldBuilderV3 = this.updateFaceitProjectIdMappingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(updateFaceItProjectIdMappingsRequest);
                } else if ((this.bitField0_ & 1024) == 0 || (updateFaceItProjectIdMappingsRequest2 = this.updateFaceitProjectIdMappingsRequest_) == null || updateFaceItProjectIdMappingsRequest2 == UpdateFaceItProjectIdMappingsRequest.getDefaultInstance()) {
                    this.updateFaceitProjectIdMappingsRequest_ = updateFaceItProjectIdMappingsRequest;
                } else {
                    getUpdateFaceitProjectIdMappingsRequestBuilder().mergeFrom(updateFaceItProjectIdMappingsRequest);
                }
                if (this.updateFaceitProjectIdMappingsRequest_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUpdateFaceitProjectIdMappingsResponse(UpdateFaceItProjectIdMappingsResponse updateFaceItProjectIdMappingsResponse) {
                UpdateFaceItProjectIdMappingsResponse updateFaceItProjectIdMappingsResponse2;
                SingleFieldBuilderV3<UpdateFaceItProjectIdMappingsResponse, UpdateFaceItProjectIdMappingsResponse.Builder, UpdateFaceItProjectIdMappingsResponseOrBuilder> singleFieldBuilderV3 = this.updateFaceitProjectIdMappingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(updateFaceItProjectIdMappingsResponse);
                } else if ((this.bitField0_ & 2048) == 0 || (updateFaceItProjectIdMappingsResponse2 = this.updateFaceitProjectIdMappingsResponse_) == null || updateFaceItProjectIdMappingsResponse2 == UpdateFaceItProjectIdMappingsResponse.getDefaultInstance()) {
                    this.updateFaceitProjectIdMappingsResponse_ = updateFaceItProjectIdMappingsResponse;
                } else {
                    getUpdateFaceitProjectIdMappingsResponseBuilder().mergeFrom(updateFaceItProjectIdMappingsResponse);
                }
                if (this.updateFaceitProjectIdMappingsResponse_ != null) {
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUpdateInstalledAppRequest(UpdateInstalledAppsRequest updateInstalledAppsRequest) {
                UpdateInstalledAppsRequest updateInstalledAppsRequest2;
                SingleFieldBuilderV3<UpdateInstalledAppsRequest, UpdateInstalledAppsRequest.Builder, UpdateInstalledAppsRequestOrBuilder> singleFieldBuilderV3 = this.updateInstalledAppRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(updateInstalledAppsRequest);
                } else if ((this.bitField0_ & 16) == 0 || (updateInstalledAppsRequest2 = this.updateInstalledAppRequest_) == null || updateInstalledAppsRequest2 == UpdateInstalledAppsRequest.getDefaultInstance()) {
                    this.updateInstalledAppRequest_ = updateInstalledAppsRequest;
                } else {
                    getUpdateInstalledAppRequestBuilder().mergeFrom(updateInstalledAppsRequest);
                }
                if (this.updateInstalledAppRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUpdateInstalledAppResponse(UpdateInstalledAppsResponse updateInstalledAppsResponse) {
                UpdateInstalledAppsResponse updateInstalledAppsResponse2;
                SingleFieldBuilderV3<UpdateInstalledAppsResponse, UpdateInstalledAppsResponse.Builder, UpdateInstalledAppsResponseOrBuilder> singleFieldBuilderV3 = this.updateInstalledAppResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(updateInstalledAppsResponse);
                } else if ((this.bitField0_ & 32) == 0 || (updateInstalledAppsResponse2 = this.updateInstalledAppResponse_) == null || updateInstalledAppsResponse2 == UpdateInstalledAppsResponse.getDefaultInstance()) {
                    this.updateInstalledAppResponse_ = updateInstalledAppsResponse;
                } else {
                    getUpdateInstalledAppResponseBuilder().mergeFrom(updateInstalledAppsResponse);
                }
                if (this.updateInstalledAppResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder setDeleteAppRequest(DeleteAppRequest.Builder builder) {
                SingleFieldBuilderV3<DeleteAppRequest, DeleteAppRequest.Builder, DeleteAppRequestOrBuilder> singleFieldBuilderV3 = this.deleteAppRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.deleteAppRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setDeleteAppResponse(DeleteAppResponse.Builder builder) {
                SingleFieldBuilderV3<DeleteAppResponse, DeleteAppResponse.Builder, DeleteAppResponseOrBuilder> singleFieldBuilderV3 = this.deleteAppResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.deleteAppResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setEnableNativeAppRequest(EnableNativeAppRequest.Builder builder) {
                SingleFieldBuilderV3<EnableNativeAppRequest, EnableNativeAppRequest.Builder, EnableNativeAppRequestOrBuilder> singleFieldBuilderV3 = this.enableNativeAppRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.enableNativeAppRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setEnableNativeAppResponse(EnableNativeAppResponse.Builder builder) {
                SingleFieldBuilderV3<EnableNativeAppResponse, EnableNativeAppResponse.Builder, EnableNativeAppResponseOrBuilder> singleFieldBuilderV3 = this.enableNativeAppResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.enableNativeAppResponse_ = builder.build();
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

            public Builder setGetInstalledAppsRequest(GetInstalledAppsRequest.Builder builder) {
                SingleFieldBuilderV3<GetInstalledAppsRequest, GetInstalledAppsRequest.Builder, GetInstalledAppsRequestOrBuilder> singleFieldBuilderV3 = this.getInstalledAppsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.getInstalledAppsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setGetInstalledAppsResponse(GetInstalledAppsResponse.Builder builder) {
                SingleFieldBuilderV3<GetInstalledAppsResponse, GetInstalledAppsResponse.Builder, GetInstalledAppsResponseOrBuilder> singleFieldBuilderV3 = this.getInstalledAppsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.getInstalledAppsResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setLaunchAppRequest(LaunchAppRequest.Builder builder) {
                SingleFieldBuilderV3<LaunchAppRequest, LaunchAppRequest.Builder, LaunchAppRequestOrBuilder> singleFieldBuilderV3 = this.launchAppRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.launchAppRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setLaunchAppResponse(LaunchAppResponse.Builder builder) {
                SingleFieldBuilderV3<LaunchAppResponse, LaunchAppResponse.Builder, LaunchAppResponseOrBuilder> singleFieldBuilderV3 = this.launchAppResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.launchAppResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setPendingAppInstallRequest(PendingAppInstallRequest.Builder builder) {
                SingleFieldBuilderV3<PendingAppInstallRequest, PendingAppInstallRequest.Builder, PendingAppInstallRequestOrBuilder> singleFieldBuilderV3 = this.pendingAppInstallRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.pendingAppInstallRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setPendingAppInstallResponse(PendingAppInstallResponse.Builder builder) {
                SingleFieldBuilderV3<PendingAppInstallResponse, PendingAppInstallResponse.Builder, PendingAppInstallResponseOrBuilder> singleFieldBuilderV3 = this.pendingAppInstallResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.pendingAppInstallResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8192;
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

            public Builder setUpdateFaceitProjectIdMappingsRequest(UpdateFaceItProjectIdMappingsRequest.Builder builder) {
                SingleFieldBuilderV3<UpdateFaceItProjectIdMappingsRequest, UpdateFaceItProjectIdMappingsRequest.Builder, UpdateFaceItProjectIdMappingsRequestOrBuilder> singleFieldBuilderV3 = this.updateFaceitProjectIdMappingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.updateFaceitProjectIdMappingsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setUpdateFaceitProjectIdMappingsResponse(UpdateFaceItProjectIdMappingsResponse.Builder builder) {
                SingleFieldBuilderV3<UpdateFaceItProjectIdMappingsResponse, UpdateFaceItProjectIdMappingsResponse.Builder, UpdateFaceItProjectIdMappingsResponseOrBuilder> singleFieldBuilderV3 = this.updateFaceitProjectIdMappingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.updateFaceitProjectIdMappingsResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setUpdateInstalledAppRequest(UpdateInstalledAppsRequest.Builder builder) {
                SingleFieldBuilderV3<UpdateInstalledAppsRequest, UpdateInstalledAppsRequest.Builder, UpdateInstalledAppsRequestOrBuilder> singleFieldBuilderV3 = this.updateInstalledAppRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.updateInstalledAppRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setUpdateInstalledAppResponse(UpdateInstalledAppsResponse.Builder builder) {
                SingleFieldBuilderV3<UpdateInstalledAppsResponse, UpdateInstalledAppsResponse.Builder, UpdateInstalledAppsResponseOrBuilder> singleFieldBuilderV3 = this.updateInstalledAppResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.updateInstalledAppResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConnectIQInstalledAppsService getDefaultInstanceForType() {
                return ConnectIQInstalledAppsService.getDefaultInstance();
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

            public Builder setDeleteAppRequest(DeleteAppRequest deleteAppRequest) {
                SingleFieldBuilderV3<DeleteAppRequest, DeleteAppRequest.Builder, DeleteAppRequestOrBuilder> singleFieldBuilderV3 = this.deleteAppRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deleteAppRequest.getClass();
                    this.deleteAppRequest_ = deleteAppRequest;
                } else {
                    singleFieldBuilderV3.setMessage(deleteAppRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setDeleteAppResponse(DeleteAppResponse deleteAppResponse) {
                SingleFieldBuilderV3<DeleteAppResponse, DeleteAppResponse.Builder, DeleteAppResponseOrBuilder> singleFieldBuilderV3 = this.deleteAppResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deleteAppResponse.getClass();
                    this.deleteAppResponse_ = deleteAppResponse;
                } else {
                    singleFieldBuilderV3.setMessage(deleteAppResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setEnableNativeAppRequest(EnableNativeAppRequest enableNativeAppRequest) {
                SingleFieldBuilderV3<EnableNativeAppRequest, EnableNativeAppRequest.Builder, EnableNativeAppRequestOrBuilder> singleFieldBuilderV3 = this.enableNativeAppRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    enableNativeAppRequest.getClass();
                    this.enableNativeAppRequest_ = enableNativeAppRequest;
                } else {
                    singleFieldBuilderV3.setMessage(enableNativeAppRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setEnableNativeAppResponse(EnableNativeAppResponse enableNativeAppResponse) {
                SingleFieldBuilderV3<EnableNativeAppResponse, EnableNativeAppResponse.Builder, EnableNativeAppResponseOrBuilder> singleFieldBuilderV3 = this.enableNativeAppResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    enableNativeAppResponse.getClass();
                    this.enableNativeAppResponse_ = enableNativeAppResponse;
                } else {
                    singleFieldBuilderV3.setMessage(enableNativeAppResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setGetInstalledAppsRequest(GetInstalledAppsRequest getInstalledAppsRequest) {
                SingleFieldBuilderV3<GetInstalledAppsRequest, GetInstalledAppsRequest.Builder, GetInstalledAppsRequestOrBuilder> singleFieldBuilderV3 = this.getInstalledAppsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getInstalledAppsRequest.getClass();
                    this.getInstalledAppsRequest_ = getInstalledAppsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(getInstalledAppsRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setGetInstalledAppsResponse(GetInstalledAppsResponse getInstalledAppsResponse) {
                SingleFieldBuilderV3<GetInstalledAppsResponse, GetInstalledAppsResponse.Builder, GetInstalledAppsResponseOrBuilder> singleFieldBuilderV3 = this.getInstalledAppsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getInstalledAppsResponse.getClass();
                    this.getInstalledAppsResponse_ = getInstalledAppsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(getInstalledAppsResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setLaunchAppRequest(LaunchAppRequest launchAppRequest) {
                SingleFieldBuilderV3<LaunchAppRequest, LaunchAppRequest.Builder, LaunchAppRequestOrBuilder> singleFieldBuilderV3 = this.launchAppRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    launchAppRequest.getClass();
                    this.launchAppRequest_ = launchAppRequest;
                } else {
                    singleFieldBuilderV3.setMessage(launchAppRequest);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setLaunchAppResponse(LaunchAppResponse launchAppResponse) {
                SingleFieldBuilderV3<LaunchAppResponse, LaunchAppResponse.Builder, LaunchAppResponseOrBuilder> singleFieldBuilderV3 = this.launchAppResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    launchAppResponse.getClass();
                    this.launchAppResponse_ = launchAppResponse;
                } else {
                    singleFieldBuilderV3.setMessage(launchAppResponse);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setPendingAppInstallRequest(PendingAppInstallRequest pendingAppInstallRequest) {
                SingleFieldBuilderV3<PendingAppInstallRequest, PendingAppInstallRequest.Builder, PendingAppInstallRequestOrBuilder> singleFieldBuilderV3 = this.pendingAppInstallRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    pendingAppInstallRequest.getClass();
                    this.pendingAppInstallRequest_ = pendingAppInstallRequest;
                } else {
                    singleFieldBuilderV3.setMessage(pendingAppInstallRequest);
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setPendingAppInstallResponse(PendingAppInstallResponse pendingAppInstallResponse) {
                SingleFieldBuilderV3<PendingAppInstallResponse, PendingAppInstallResponse.Builder, PendingAppInstallResponseOrBuilder> singleFieldBuilderV3 = this.pendingAppInstallResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    pendingAppInstallResponse.getClass();
                    this.pendingAppInstallResponse_ = pendingAppInstallResponse;
                } else {
                    singleFieldBuilderV3.setMessage(pendingAppInstallResponse);
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setUpdateFaceitProjectIdMappingsRequest(UpdateFaceItProjectIdMappingsRequest updateFaceItProjectIdMappingsRequest) {
                SingleFieldBuilderV3<UpdateFaceItProjectIdMappingsRequest, UpdateFaceItProjectIdMappingsRequest.Builder, UpdateFaceItProjectIdMappingsRequestOrBuilder> singleFieldBuilderV3 = this.updateFaceitProjectIdMappingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    updateFaceItProjectIdMappingsRequest.getClass();
                    this.updateFaceitProjectIdMappingsRequest_ = updateFaceItProjectIdMappingsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(updateFaceItProjectIdMappingsRequest);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setUpdateFaceitProjectIdMappingsResponse(UpdateFaceItProjectIdMappingsResponse updateFaceItProjectIdMappingsResponse) {
                SingleFieldBuilderV3<UpdateFaceItProjectIdMappingsResponse, UpdateFaceItProjectIdMappingsResponse.Builder, UpdateFaceItProjectIdMappingsResponseOrBuilder> singleFieldBuilderV3 = this.updateFaceitProjectIdMappingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    updateFaceItProjectIdMappingsResponse.getClass();
                    this.updateFaceitProjectIdMappingsResponse_ = updateFaceItProjectIdMappingsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(updateFaceItProjectIdMappingsResponse);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setUpdateInstalledAppRequest(UpdateInstalledAppsRequest updateInstalledAppsRequest) {
                SingleFieldBuilderV3<UpdateInstalledAppsRequest, UpdateInstalledAppsRequest.Builder, UpdateInstalledAppsRequestOrBuilder> singleFieldBuilderV3 = this.updateInstalledAppRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    updateInstalledAppsRequest.getClass();
                    this.updateInstalledAppRequest_ = updateInstalledAppsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(updateInstalledAppsRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setUpdateInstalledAppResponse(UpdateInstalledAppsResponse updateInstalledAppsResponse) {
                SingleFieldBuilderV3<UpdateInstalledAppsResponse, UpdateInstalledAppsResponse.Builder, UpdateInstalledAppsResponseOrBuilder> singleFieldBuilderV3 = this.updateInstalledAppResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    updateInstalledAppsResponse.getClass();
                    this.updateInstalledAppResponse_ = updateInstalledAppsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(updateInstalledAppsResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectIQInstalledAppsService) {
                    return mergeFrom((ConnectIQInstalledAppsService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectIQInstalledAppsService connectIQInstalledAppsService) {
                if (connectIQInstalledAppsService == ConnectIQInstalledAppsService.getDefaultInstance()) {
                    return this;
                }
                if (connectIQInstalledAppsService.hasGetInstalledAppsRequest()) {
                    mergeGetInstalledAppsRequest(connectIQInstalledAppsService.getGetInstalledAppsRequest());
                }
                if (connectIQInstalledAppsService.hasGetInstalledAppsResponse()) {
                    mergeGetInstalledAppsResponse(connectIQInstalledAppsService.getGetInstalledAppsResponse());
                }
                if (connectIQInstalledAppsService.hasDeleteAppRequest()) {
                    mergeDeleteAppRequest(connectIQInstalledAppsService.getDeleteAppRequest());
                }
                if (connectIQInstalledAppsService.hasDeleteAppResponse()) {
                    mergeDeleteAppResponse(connectIQInstalledAppsService.getDeleteAppResponse());
                }
                if (connectIQInstalledAppsService.hasUpdateInstalledAppRequest()) {
                    mergeUpdateInstalledAppRequest(connectIQInstalledAppsService.getUpdateInstalledAppRequest());
                }
                if (connectIQInstalledAppsService.hasUpdateInstalledAppResponse()) {
                    mergeUpdateInstalledAppResponse(connectIQInstalledAppsService.getUpdateInstalledAppResponse());
                }
                if (connectIQInstalledAppsService.hasEnableNativeAppRequest()) {
                    mergeEnableNativeAppRequest(connectIQInstalledAppsService.getEnableNativeAppRequest());
                }
                if (connectIQInstalledAppsService.hasEnableNativeAppResponse()) {
                    mergeEnableNativeAppResponse(connectIQInstalledAppsService.getEnableNativeAppResponse());
                }
                if (connectIQInstalledAppsService.hasLaunchAppRequest()) {
                    mergeLaunchAppRequest(connectIQInstalledAppsService.getLaunchAppRequest());
                }
                if (connectIQInstalledAppsService.hasLaunchAppResponse()) {
                    mergeLaunchAppResponse(connectIQInstalledAppsService.getLaunchAppResponse());
                }
                if (connectIQInstalledAppsService.hasUpdateFaceitProjectIdMappingsRequest()) {
                    mergeUpdateFaceitProjectIdMappingsRequest(connectIQInstalledAppsService.getUpdateFaceitProjectIdMappingsRequest());
                }
                if (connectIQInstalledAppsService.hasUpdateFaceitProjectIdMappingsResponse()) {
                    mergeUpdateFaceitProjectIdMappingsResponse(connectIQInstalledAppsService.getUpdateFaceitProjectIdMappingsResponse());
                }
                if (connectIQInstalledAppsService.hasPendingAppInstallRequest()) {
                    mergePendingAppInstallRequest(connectIQInstalledAppsService.getPendingAppInstallRequest());
                }
                if (connectIQInstalledAppsService.hasPendingAppInstallResponse()) {
                    mergePendingAppInstallResponse(connectIQInstalledAppsService.getPendingAppInstallResponse());
                }
                mergeUnknownFields(connectIQInstalledAppsService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectIQInstalledAppsService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ConnectIQInstalledAppsService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ConnectIQInstalledAppsService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectIQInstalledAppsService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQInstalledAppsService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQInstalledAppsService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectIQInstalledAppsService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectIQInstalledAppsService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectIQInstalledAppsService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectIQInstalledAppsService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectIQInstalledAppsService parseFrom(InputStream inputStream) {
            return (ConnectIQInstalledAppsService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectIQInstalledAppsService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQInstalledAppsService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQInstalledAppsService parseFrom(CodedInputStream codedInputStream) {
            return (ConnectIQInstalledAppsService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectIQInstalledAppsService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQInstalledAppsService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DeleteAppRequest extends GeneratedMessageV3 implements DeleteAppRequestOrBuilder {
        public static final int APP_TYPE_FIELD_NUMBER = 2;
        private static final DeleteAppRequest DEFAULT_INSTANCE = new DeleteAppRequest();

        @Deprecated
        public static final Parser<DeleteAppRequest> PARSER = new AbstractParser<DeleteAppRequest>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.DeleteAppRequest.1
            @Override // com.google.protobuf.Parser
            public DeleteAppRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DeleteAppRequest.newBuilder();
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
        public static final int STORE_APP_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int appType_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString storeAppId_;

        private DeleteAppRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.storeAppId_ = ByteString.EMPTY;
            this.appType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeleteAppRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_DeleteAppRequest_descriptor;
        }

        public static Builder newBuilder(DeleteAppRequest deleteAppRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deleteAppRequest);
        }

        public static DeleteAppRequest parseDelimitedFrom(InputStream inputStream) {
            return (DeleteAppRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeleteAppRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DeleteAppRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeleteAppRequest)) {
                return super.equals(obj);
            }
            DeleteAppRequest deleteAppRequest = (DeleteAppRequest) obj;
            if (hasStoreAppId() != deleteAppRequest.hasStoreAppId()) {
                return false;
            }
            if ((!hasStoreAppId() || getStoreAppId().equals(deleteAppRequest.getStoreAppId())) && hasAppType() == deleteAppRequest.hasAppType()) {
                return (!hasAppType() || this.appType_ == deleteAppRequest.appType_) && getUnknownFields().equals(deleteAppRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.DeleteAppRequestOrBuilder
        public AppType getAppType() {
            AppType appTypeForNumber = AppType.forNumber(this.appType_);
            return appTypeForNumber == null ? AppType.UNKNOWN_APP_TYPE : appTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeleteAppRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.storeAppId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeEnumSize(2, this.appType_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.DeleteAppRequestOrBuilder
        public ByteString getStoreAppId() {
            return this.storeAppId_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.DeleteAppRequestOrBuilder
        public boolean hasAppType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.DeleteAppRequestOrBuilder
        public boolean hasStoreAppId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStoreAppId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getStoreAppId().hashCode();
            }
            if (hasAppType()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.appType_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_DeleteAppRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DeleteAppRequest.class, Builder.class);
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
            if (!hasStoreAppId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAppType()) {
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
            return new DeleteAppRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.storeAppId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.appType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeleteAppRequestOrBuilder {
            private int appType_;
            private int bitField0_;
            private ByteString storeAppId_;

            private Builder() {
                this.storeAppId_ = ByteString.EMPTY;
                this.appType_ = 0;
            }

            private void buildPartial0(DeleteAppRequest deleteAppRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    deleteAppRequest.storeAppId_ = this.storeAppId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    deleteAppRequest.appType_ = this.appType_;
                    i14 |= 2;
                }
                deleteAppRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_DeleteAppRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeleteAppRequest build() {
                DeleteAppRequest deleteAppRequestBuildPartial = buildPartial();
                if (deleteAppRequestBuildPartial.isInitialized()) {
                    return deleteAppRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deleteAppRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeleteAppRequest buildPartial() {
                DeleteAppRequest deleteAppRequest = new DeleteAppRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(deleteAppRequest);
                }
                onBuilt();
                return deleteAppRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.storeAppId_ = ByteString.EMPTY;
                this.appType_ = 0;
                return this;
            }

            public Builder clearAppType() {
                this.bitField0_ &= -3;
                this.appType_ = 0;
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

            public Builder clearStoreAppId() {
                this.bitField0_ &= -2;
                this.storeAppId_ = DeleteAppRequest.getDefaultInstance().getStoreAppId();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.DeleteAppRequestOrBuilder
            public AppType getAppType() {
                AppType appTypeForNumber = AppType.forNumber(this.appType_);
                return appTypeForNumber == null ? AppType.UNKNOWN_APP_TYPE : appTypeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_DeleteAppRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.DeleteAppRequestOrBuilder
            public ByteString getStoreAppId() {
                return this.storeAppId_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.DeleteAppRequestOrBuilder
            public boolean hasAppType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.DeleteAppRequestOrBuilder
            public boolean hasStoreAppId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_DeleteAppRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DeleteAppRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStoreAppId() && hasAppType();
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
                                    this.storeAppId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (AppType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.appType_ = i14;
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

            public Builder setAppType(AppType appType) {
                appType.getClass();
                this.bitField0_ |= 2;
                this.appType_ = appType.getNumber();
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

            public Builder setStoreAppId(ByteString byteString) {
                byteString.getClass();
                this.storeAppId_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DeleteAppRequest getDefaultInstanceForType() {
                return DeleteAppRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.storeAppId_ = ByteString.EMPTY;
                this.appType_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DeleteAppRequest) {
                    return mergeFrom((DeleteAppRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeleteAppRequest deleteAppRequest) {
                if (deleteAppRequest == DeleteAppRequest.getDefaultInstance()) {
                    return this;
                }
                if (deleteAppRequest.hasStoreAppId()) {
                    setStoreAppId(deleteAppRequest.getStoreAppId());
                }
                if (deleteAppRequest.hasAppType()) {
                    setAppType(deleteAppRequest.getAppType());
                }
                mergeUnknownFields(deleteAppRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeleteAppRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DeleteAppRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeleteAppRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeleteAppRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DeleteAppRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeleteAppRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DeleteAppRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DeleteAppRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ DeleteAppRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DeleteAppRequest parseFrom(InputStream inputStream) {
            return (DeleteAppRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private DeleteAppRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.storeAppId_ = byteString;
            this.appType_ = 0;
        }

        public static DeleteAppRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeleteAppRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeleteAppRequest parseFrom(CodedInputStream codedInputStream) {
            return (DeleteAppRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeleteAppRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeleteAppRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DeleteAppResponse extends GeneratedMessageV3 implements DeleteAppResponseOrBuilder {
        private static final DeleteAppResponse DEFAULT_INSTANCE = new DeleteAppResponse();

        @Deprecated
        public static final Parser<DeleteAppResponse> PARSER = new AbstractParser<DeleteAppResponse>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.DeleteAppResponse.1
            @Override // com.google.protobuf.Parser
            public DeleteAppResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DeleteAppResponse.newBuilder();
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

        private DeleteAppResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeleteAppResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_DeleteAppResponse_descriptor;
        }

        public static Builder newBuilder(DeleteAppResponse deleteAppResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deleteAppResponse);
        }

        public static DeleteAppResponse parseDelimitedFrom(InputStream inputStream) {
            return (DeleteAppResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeleteAppResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DeleteAppResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeleteAppResponse)) {
                return super.equals(obj);
            }
            DeleteAppResponse deleteAppResponse = (DeleteAppResponse) obj;
            if (hasStatus() != deleteAppResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == deleteAppResponse.status_) && getUnknownFields().equals(deleteAppResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeleteAppResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.DeleteAppResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.DeleteAppResponseOrBuilder
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
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_DeleteAppResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DeleteAppResponse.class, Builder.class);
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
            return new DeleteAppResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeleteAppResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(DeleteAppResponse deleteAppResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    deleteAppResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                deleteAppResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_DeleteAppResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeleteAppResponse build() {
                DeleteAppResponse deleteAppResponseBuildPartial = buildPartial();
                if (deleteAppResponseBuildPartial.isInitialized()) {
                    return deleteAppResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deleteAppResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeleteAppResponse buildPartial() {
                DeleteAppResponse deleteAppResponse = new DeleteAppResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(deleteAppResponse);
                }
                onBuilt();
                return deleteAppResponse;
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
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_DeleteAppResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.DeleteAppResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.DeleteAppResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_DeleteAppResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DeleteAppResponse.class, Builder.class);
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
            public DeleteAppResponse getDefaultInstanceForType() {
                return DeleteAppResponse.getDefaultInstance();
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
                if (message instanceof DeleteAppResponse) {
                    return mergeFrom((DeleteAppResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeleteAppResponse deleteAppResponse) {
                if (deleteAppResponse == DeleteAppResponse.getDefaultInstance()) {
                    return this;
                }
                if (deleteAppResponse.hasStatus()) {
                    setStatus(deleteAppResponse.getStatus());
                }
                mergeUnknownFields(deleteAppResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeleteAppResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DeleteAppResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeleteAppResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeleteAppResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DeleteAppResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DeleteAppResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DeleteAppResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeleteAppResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DeleteAppResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DeleteAppResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DeleteAppResponse parseFrom(InputStream inputStream) {
            return (DeleteAppResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DeleteAppResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeleteAppResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeleteAppResponse parseFrom(CodedInputStream codedInputStream) {
            return (DeleteAppResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeleteAppResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeleteAppResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN_STATUS(0),
            OK(1),
            FAILED_TO_DELETE(2);

            public static final int FAILED_TO_DELETE_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.DeleteAppResponse.Status.1
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
                return FAILED_TO_DELETE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return DeleteAppResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class EnableNativeAppRequest extends GeneratedMessageV3 implements EnableNativeAppRequestOrBuilder {
        public static final int APP_ID_FIELD_NUMBER = 3;
        public static final int APP_TYPE_FIELD_NUMBER = 2;
        public static final int NATIVE_APP_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private ByteString appId_;
        private int appType_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int nativeAppId_;
        private static final EnableNativeAppRequest DEFAULT_INSTANCE = new EnableNativeAppRequest();

        @Deprecated
        public static final Parser<EnableNativeAppRequest> PARSER = new AbstractParser<EnableNativeAppRequest>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.EnableNativeAppRequest.1
            @Override // com.google.protobuf.Parser
            public EnableNativeAppRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EnableNativeAppRequest.newBuilder();
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

        private EnableNativeAppRequest() {
            this.nativeAppId_ = 0;
            this.appType_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.appType_ = 0;
            this.appId_ = byteString;
        }

        public static EnableNativeAppRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_EnableNativeAppRequest_descriptor;
        }

        public static Builder newBuilder(EnableNativeAppRequest enableNativeAppRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(enableNativeAppRequest);
        }

        public static EnableNativeAppRequest parseDelimitedFrom(InputStream inputStream) {
            return (EnableNativeAppRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EnableNativeAppRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EnableNativeAppRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnableNativeAppRequest)) {
                return super.equals(obj);
            }
            EnableNativeAppRequest enableNativeAppRequest = (EnableNativeAppRequest) obj;
            if (hasNativeAppId() != enableNativeAppRequest.hasNativeAppId()) {
                return false;
            }
            if ((hasNativeAppId() && getNativeAppId() != enableNativeAppRequest.getNativeAppId()) || hasAppType() != enableNativeAppRequest.hasAppType()) {
                return false;
            }
            if ((!hasAppType() || this.appType_ == enableNativeAppRequest.appType_) && hasAppId() == enableNativeAppRequest.hasAppId()) {
                return (!hasAppId() || getAppId().equals(enableNativeAppRequest.getAppId())) && getUnknownFields().equals(enableNativeAppRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.EnableNativeAppRequestOrBuilder
        public ByteString getAppId() {
            return this.appId_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.EnableNativeAppRequestOrBuilder
        public AppType getAppType() {
            AppType appTypeForNumber = AppType.forNumber(this.appType_);
            return appTypeForNumber == null ? AppType.UNKNOWN_APP_TYPE : appTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.EnableNativeAppRequestOrBuilder
        public int getNativeAppId() {
            return this.nativeAppId_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EnableNativeAppRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.nativeAppId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(2, this.appType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBytesSize(3, this.appId_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.EnableNativeAppRequestOrBuilder
        public boolean hasAppId() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.EnableNativeAppRequestOrBuilder
        public boolean hasAppType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.EnableNativeAppRequestOrBuilder
        public boolean hasNativeAppId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasNativeAppId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getNativeAppId();
            }
            if (hasAppType()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.appType_;
            }
            if (hasAppId()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getAppId().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_EnableNativeAppRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EnableNativeAppRequest.class, Builder.class);
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
            if (!hasNativeAppId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAppType()) {
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
            return new EnableNativeAppRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.nativeAppId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.appType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBytes(3, this.appId_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EnableNativeAppRequestOrBuilder {
            private ByteString appId_;
            private int appType_;
            private int bitField0_;
            private int nativeAppId_;

            private Builder() {
                this.appType_ = 0;
                this.appId_ = ByteString.EMPTY;
            }

            private void buildPartial0(EnableNativeAppRequest enableNativeAppRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    enableNativeAppRequest.nativeAppId_ = this.nativeAppId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    enableNativeAppRequest.appType_ = this.appType_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    enableNativeAppRequest.appId_ = this.appId_;
                    i14 |= 4;
                }
                enableNativeAppRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_EnableNativeAppRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EnableNativeAppRequest build() {
                EnableNativeAppRequest enableNativeAppRequestBuildPartial = buildPartial();
                if (enableNativeAppRequestBuildPartial.isInitialized()) {
                    return enableNativeAppRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) enableNativeAppRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EnableNativeAppRequest buildPartial() {
                EnableNativeAppRequest enableNativeAppRequest = new EnableNativeAppRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(enableNativeAppRequest);
                }
                onBuilt();
                return enableNativeAppRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.nativeAppId_ = 0;
                this.appType_ = 0;
                this.appId_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearAppId() {
                this.bitField0_ &= -5;
                this.appId_ = EnableNativeAppRequest.getDefaultInstance().getAppId();
                onChanged();
                return this;
            }

            public Builder clearAppType() {
                this.bitField0_ &= -3;
                this.appType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearNativeAppId() {
                this.bitField0_ &= -2;
                this.nativeAppId_ = 0;
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

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.EnableNativeAppRequestOrBuilder
            public ByteString getAppId() {
                return this.appId_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.EnableNativeAppRequestOrBuilder
            public AppType getAppType() {
                AppType appTypeForNumber = AppType.forNumber(this.appType_);
                return appTypeForNumber == null ? AppType.UNKNOWN_APP_TYPE : appTypeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_EnableNativeAppRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.EnableNativeAppRequestOrBuilder
            public int getNativeAppId() {
                return this.nativeAppId_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.EnableNativeAppRequestOrBuilder
            public boolean hasAppId() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.EnableNativeAppRequestOrBuilder
            public boolean hasAppType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.EnableNativeAppRequestOrBuilder
            public boolean hasNativeAppId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_EnableNativeAppRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EnableNativeAppRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasNativeAppId() && hasAppType();
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
                                    this.nativeAppId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (AppType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.appType_ = i14;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 26) {
                                    this.appId_ = codedInputStream.readBytes();
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

            public Builder setAppId(ByteString byteString) {
                byteString.getClass();
                this.appId_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setAppType(AppType appType) {
                appType.getClass();
                this.bitField0_ |= 2;
                this.appType_ = appType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setNativeAppId(int i14) {
                this.nativeAppId_ = i14;
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
            public EnableNativeAppRequest getDefaultInstanceForType() {
                return EnableNativeAppRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.appType_ = 0;
                this.appId_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EnableNativeAppRequest) {
                    return mergeFrom((EnableNativeAppRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EnableNativeAppRequest enableNativeAppRequest) {
                if (enableNativeAppRequest == EnableNativeAppRequest.getDefaultInstance()) {
                    return this;
                }
                if (enableNativeAppRequest.hasNativeAppId()) {
                    setNativeAppId(enableNativeAppRequest.getNativeAppId());
                }
                if (enableNativeAppRequest.hasAppType()) {
                    setAppType(enableNativeAppRequest.getAppType());
                }
                if (enableNativeAppRequest.hasAppId()) {
                    setAppId(enableNativeAppRequest.getAppId());
                }
                mergeUnknownFields(enableNativeAppRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EnableNativeAppRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EnableNativeAppRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnableNativeAppRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EnableNativeAppRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EnableNativeAppRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EnableNativeAppRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EnableNativeAppRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EnableNativeAppRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EnableNativeAppRequest parseFrom(InputStream inputStream) {
            return (EnableNativeAppRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EnableNativeAppRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnableNativeAppRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private EnableNativeAppRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.nativeAppId_ = 0;
            this.appType_ = 0;
            this.appId_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EnableNativeAppRequest parseFrom(CodedInputStream codedInputStream) {
            return (EnableNativeAppRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EnableNativeAppRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnableNativeAppRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ EnableNativeAppRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class EnableNativeAppResponse extends GeneratedMessageV3 implements EnableNativeAppResponseOrBuilder {
        private static final EnableNativeAppResponse DEFAULT_INSTANCE = new EnableNativeAppResponse();

        @Deprecated
        public static final Parser<EnableNativeAppResponse> PARSER = new AbstractParser<EnableNativeAppResponse>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.EnableNativeAppResponse.1
            @Override // com.google.protobuf.Parser
            public EnableNativeAppResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EnableNativeAppResponse.newBuilder();
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

        private EnableNativeAppResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EnableNativeAppResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_EnableNativeAppResponse_descriptor;
        }

        public static Builder newBuilder(EnableNativeAppResponse enableNativeAppResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(enableNativeAppResponse);
        }

        public static EnableNativeAppResponse parseDelimitedFrom(InputStream inputStream) {
            return (EnableNativeAppResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EnableNativeAppResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EnableNativeAppResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnableNativeAppResponse)) {
                return super.equals(obj);
            }
            EnableNativeAppResponse enableNativeAppResponse = (EnableNativeAppResponse) obj;
            if (hasStatus() != enableNativeAppResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == enableNativeAppResponse.status_) && getUnknownFields().equals(enableNativeAppResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EnableNativeAppResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.EnableNativeAppResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.EnableNativeAppResponseOrBuilder
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
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_EnableNativeAppResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EnableNativeAppResponse.class, Builder.class);
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
            return new EnableNativeAppResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EnableNativeAppResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(EnableNativeAppResponse enableNativeAppResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    enableNativeAppResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                enableNativeAppResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_EnableNativeAppResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EnableNativeAppResponse build() {
                EnableNativeAppResponse enableNativeAppResponseBuildPartial = buildPartial();
                if (enableNativeAppResponseBuildPartial.isInitialized()) {
                    return enableNativeAppResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) enableNativeAppResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EnableNativeAppResponse buildPartial() {
                EnableNativeAppResponse enableNativeAppResponse = new EnableNativeAppResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(enableNativeAppResponse);
                }
                onBuilt();
                return enableNativeAppResponse;
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
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_EnableNativeAppResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.EnableNativeAppResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.EnableNativeAppResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_EnableNativeAppResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EnableNativeAppResponse.class, Builder.class);
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
            public EnableNativeAppResponse getDefaultInstanceForType() {
                return EnableNativeAppResponse.getDefaultInstance();
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
                if (message instanceof EnableNativeAppResponse) {
                    return mergeFrom((EnableNativeAppResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EnableNativeAppResponse enableNativeAppResponse) {
                if (enableNativeAppResponse == EnableNativeAppResponse.getDefaultInstance()) {
                    return this;
                }
                if (enableNativeAppResponse.hasStatus()) {
                    setStatus(enableNativeAppResponse.getStatus());
                }
                mergeUnknownFields(enableNativeAppResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EnableNativeAppResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EnableNativeAppResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnableNativeAppResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EnableNativeAppResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ EnableNativeAppResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static EnableNativeAppResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private EnableNativeAppResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EnableNativeAppResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EnableNativeAppResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EnableNativeAppResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EnableNativeAppResponse parseFrom(InputStream inputStream) {
            return (EnableNativeAppResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EnableNativeAppResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnableNativeAppResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EnableNativeAppResponse parseFrom(CodedInputStream codedInputStream) {
            return (EnableNativeAppResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EnableNativeAppResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnableNativeAppResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN_STATUS(0),
            OK(1),
            INVALID_NATIVE_APP(2);

            public static final int INVALID_NATIVE_APP_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.EnableNativeAppResponse.Status.1
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
                return INVALID_NATIVE_APP;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return EnableNativeAppResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class GetInstalledAppsRequest extends GeneratedMessageV3 implements GetInstalledAppsRequestOrBuilder {
        public static final int APP_TYPE_FIELD_NUMBER = 1;
        private static final GetInstalledAppsRequest DEFAULT_INSTANCE = new GetInstalledAppsRequest();

        @Deprecated
        public static final Parser<GetInstalledAppsRequest> PARSER = new AbstractParser<GetInstalledAppsRequest>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsRequest.1
            @Override // com.google.protobuf.Parser
            public GetInstalledAppsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetInstalledAppsRequest.newBuilder();
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
        private int appType_;
        private int bitField0_;
        private byte memoizedIsInitialized;

        private GetInstalledAppsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.appType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetInstalledAppsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsRequest_descriptor;
        }

        public static Builder newBuilder(GetInstalledAppsRequest getInstalledAppsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getInstalledAppsRequest);
        }

        public static GetInstalledAppsRequest parseDelimitedFrom(InputStream inputStream) {
            return (GetInstalledAppsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetInstalledAppsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetInstalledAppsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetInstalledAppsRequest)) {
                return super.equals(obj);
            }
            GetInstalledAppsRequest getInstalledAppsRequest = (GetInstalledAppsRequest) obj;
            if (hasAppType() != getInstalledAppsRequest.hasAppType()) {
                return false;
            }
            return (!hasAppType() || this.appType_ == getInstalledAppsRequest.appType_) && getUnknownFields().equals(getInstalledAppsRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsRequestOrBuilder
        public AppType getAppType() {
            AppType appTypeForNumber = AppType.forNumber(this.appType_);
            return appTypeForNumber == null ? AppType.UNKNOWN_APP_TYPE : appTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetInstalledAppsRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.appType_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsRequestOrBuilder
        public boolean hasAppType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAppType()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.appType_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetInstalledAppsRequest.class, Builder.class);
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
            if (hasAppType()) {
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
            return new GetInstalledAppsRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.appType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetInstalledAppsRequestOrBuilder {
            private int appType_;
            private int bitField0_;

            private Builder() {
                this.appType_ = 0;
            }

            private void buildPartial0(GetInstalledAppsRequest getInstalledAppsRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    getInstalledAppsRequest.appType_ = this.appType_;
                } else {
                    i14 = 0;
                }
                getInstalledAppsRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetInstalledAppsRequest build() {
                GetInstalledAppsRequest getInstalledAppsRequestBuildPartial = buildPartial();
                if (getInstalledAppsRequestBuildPartial.isInitialized()) {
                    return getInstalledAppsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getInstalledAppsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetInstalledAppsRequest buildPartial() {
                GetInstalledAppsRequest getInstalledAppsRequest = new GetInstalledAppsRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(getInstalledAppsRequest);
                }
                onBuilt();
                return getInstalledAppsRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.appType_ = 0;
                return this;
            }

            public Builder clearAppType() {
                this.bitField0_ &= -2;
                this.appType_ = 0;
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

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsRequestOrBuilder
            public AppType getAppType() {
                AppType appTypeForNumber = AppType.forNumber(this.appType_);
                return appTypeForNumber == null ? AppType.UNKNOWN_APP_TYPE : appTypeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.GetInstalledAppsRequestOrBuilder
            public boolean hasAppType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_GetInstalledAppsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetInstalledAppsRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasAppType();
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
                                    if (AppType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.appType_ = i14;
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

            public Builder setAppType(AppType appType) {
                appType.getClass();
                this.bitField0_ |= 1;
                this.appType_ = appType.getNumber();
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
            public GetInstalledAppsRequest getDefaultInstanceForType() {
                return GetInstalledAppsRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.appType_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetInstalledAppsRequest) {
                    return mergeFrom((GetInstalledAppsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GetInstalledAppsRequest getInstalledAppsRequest) {
                if (getInstalledAppsRequest == GetInstalledAppsRequest.getDefaultInstance()) {
                    return this;
                }
                if (getInstalledAppsRequest.hasAppType()) {
                    setAppType(getInstalledAppsRequest.getAppType());
                }
                mergeUnknownFields(getInstalledAppsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetInstalledAppsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GetInstalledAppsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetInstalledAppsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetInstalledAppsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ GetInstalledAppsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GetInstalledAppsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private GetInstalledAppsRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.appType_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetInstalledAppsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetInstalledAppsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetInstalledAppsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetInstalledAppsRequest parseFrom(InputStream inputStream) {
            return (GetInstalledAppsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetInstalledAppsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetInstalledAppsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetInstalledAppsRequest parseFrom(CodedInputStream codedInputStream) {
            return (GetInstalledAppsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetInstalledAppsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetInstalledAppsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LaunchAppRequest extends GeneratedMessageV3 implements LaunchAppRequestOrBuilder {
        public static final int APP_STARTUP_MODE_FIELD_NUMBER = 2;
        public static final int APP_UUID_FIELD_NUMBER = 1;
        private static final LaunchAppRequest DEFAULT_INSTANCE = new LaunchAppRequest();

        @Deprecated
        public static final Parser<LaunchAppRequest> PARSER = new AbstractParser<LaunchAppRequest>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.LaunchAppRequest.1
            @Override // com.google.protobuf.Parser
            public LaunchAppRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LaunchAppRequest.newBuilder();
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
        private int appStartupMode_;
        private ByteString appUuid_;
        private int bitField0_;
        private byte memoizedIsInitialized;

        private LaunchAppRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.appUuid_ = ByteString.EMPTY;
            this.appStartupMode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LaunchAppRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_LaunchAppRequest_descriptor;
        }

        public static Builder newBuilder(LaunchAppRequest launchAppRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(launchAppRequest);
        }

        public static LaunchAppRequest parseDelimitedFrom(InputStream inputStream) {
            return (LaunchAppRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LaunchAppRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LaunchAppRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LaunchAppRequest)) {
                return super.equals(obj);
            }
            LaunchAppRequest launchAppRequest = (LaunchAppRequest) obj;
            if (hasAppUuid() != launchAppRequest.hasAppUuid()) {
                return false;
            }
            if ((!hasAppUuid() || getAppUuid().equals(launchAppRequest.getAppUuid())) && hasAppStartupMode() == launchAppRequest.hasAppStartupMode()) {
                return (!hasAppStartupMode() || this.appStartupMode_ == launchAppRequest.appStartupMode_) && getUnknownFields().equals(launchAppRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.LaunchAppRequestOrBuilder
        public StartUpMode getAppStartupMode() {
            StartUpMode startUpModeForNumber = StartUpMode.forNumber(this.appStartupMode_);
            return startUpModeForNumber == null ? StartUpMode.APP_STARTUP_MODE_NORMAL : startUpModeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.LaunchAppRequestOrBuilder
        public ByteString getAppUuid() {
            return this.appUuid_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LaunchAppRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.appUuid_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeEnumSize(2, this.appStartupMode_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.LaunchAppRequestOrBuilder
        public boolean hasAppStartupMode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.LaunchAppRequestOrBuilder
        public boolean hasAppUuid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAppUuid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getAppUuid().hashCode();
            }
            if (hasAppStartupMode()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.appStartupMode_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_LaunchAppRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LaunchAppRequest.class, Builder.class);
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
            if (!hasAppUuid()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAppStartupMode()) {
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
            return new LaunchAppRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.appUuid_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.appStartupMode_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LaunchAppRequestOrBuilder {
            private int appStartupMode_;
            private ByteString appUuid_;
            private int bitField0_;

            private Builder() {
                this.appUuid_ = ByteString.EMPTY;
                this.appStartupMode_ = 0;
            }

            private void buildPartial0(LaunchAppRequest launchAppRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    launchAppRequest.appUuid_ = this.appUuid_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    launchAppRequest.appStartupMode_ = this.appStartupMode_;
                    i14 |= 2;
                }
                launchAppRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_LaunchAppRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LaunchAppRequest build() {
                LaunchAppRequest launchAppRequestBuildPartial = buildPartial();
                if (launchAppRequestBuildPartial.isInitialized()) {
                    return launchAppRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) launchAppRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LaunchAppRequest buildPartial() {
                LaunchAppRequest launchAppRequest = new LaunchAppRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(launchAppRequest);
                }
                onBuilt();
                return launchAppRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.appUuid_ = ByteString.EMPTY;
                this.appStartupMode_ = 0;
                return this;
            }

            public Builder clearAppStartupMode() {
                this.bitField0_ &= -3;
                this.appStartupMode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAppUuid() {
                this.bitField0_ &= -2;
                this.appUuid_ = LaunchAppRequest.getDefaultInstance().getAppUuid();
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

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.LaunchAppRequestOrBuilder
            public StartUpMode getAppStartupMode() {
                StartUpMode startUpModeForNumber = StartUpMode.forNumber(this.appStartupMode_);
                return startUpModeForNumber == null ? StartUpMode.APP_STARTUP_MODE_NORMAL : startUpModeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.LaunchAppRequestOrBuilder
            public ByteString getAppUuid() {
                return this.appUuid_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_LaunchAppRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.LaunchAppRequestOrBuilder
            public boolean hasAppStartupMode() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.LaunchAppRequestOrBuilder
            public boolean hasAppUuid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_LaunchAppRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LaunchAppRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasAppUuid() && hasAppStartupMode();
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
                                    this.appUuid_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (StartUpMode.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.appStartupMode_ = i14;
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

            public Builder setAppStartupMode(StartUpMode startUpMode) {
                startUpMode.getClass();
                this.bitField0_ |= 2;
                this.appStartupMode_ = startUpMode.getNumber();
                onChanged();
                return this;
            }

            public Builder setAppUuid(ByteString byteString) {
                byteString.getClass();
                this.appUuid_ = byteString;
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
            public LaunchAppRequest getDefaultInstanceForType() {
                return LaunchAppRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.appUuid_ = ByteString.EMPTY;
                this.appStartupMode_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LaunchAppRequest) {
                    return mergeFrom((LaunchAppRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LaunchAppRequest launchAppRequest) {
                if (launchAppRequest == LaunchAppRequest.getDefaultInstance()) {
                    return this;
                }
                if (launchAppRequest.hasAppUuid()) {
                    setAppUuid(launchAppRequest.getAppUuid());
                }
                if (launchAppRequest.hasAppStartupMode()) {
                    setAppStartupMode(launchAppRequest.getAppStartupMode());
                }
                mergeUnknownFields(launchAppRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LaunchAppRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LaunchAppRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LaunchAppRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LaunchAppRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LaunchAppRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LaunchAppRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LaunchAppRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LaunchAppRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ LaunchAppRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LaunchAppRequest parseFrom(InputStream inputStream) {
            return (LaunchAppRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private LaunchAppRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.appUuid_ = byteString;
            this.appStartupMode_ = 0;
        }

        public static LaunchAppRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LaunchAppRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LaunchAppRequest parseFrom(CodedInputStream codedInputStream) {
            return (LaunchAppRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LaunchAppRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LaunchAppRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum StartUpMode implements ProtocolMessageEnum {
            APP_STARTUP_MODE_NORMAL(0),
            APP_STARTUP_MODE_MEDIA_PLAYBACK_CONFIGURATION(1),
            APP_STARTUP_MODE_MEDIA_SYNC_CONFIGURATION(2),
            APP_STARTUP_MODE_NO_UI(3);

            public static final int APP_STARTUP_MODE_MEDIA_PLAYBACK_CONFIGURATION_VALUE = 1;
            public static final int APP_STARTUP_MODE_MEDIA_SYNC_CONFIGURATION_VALUE = 2;
            public static final int APP_STARTUP_MODE_NORMAL_VALUE = 0;
            public static final int APP_STARTUP_MODE_NO_UI_VALUE = 3;
            private final int value;
            private static final Internal.EnumLiteMap<StartUpMode> internalValueMap = new Internal.EnumLiteMap<StartUpMode>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.LaunchAppRequest.StartUpMode.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public StartUpMode findValueByNumber(int i14) {
                    return StartUpMode.forNumber(i14);
                }
            };
            private static final StartUpMode[] VALUES = values();

            StartUpMode(int i14) {
                this.value = i14;
            }

            public static StartUpMode forNumber(int i14) {
                if (i14 == 0) {
                    return APP_STARTUP_MODE_NORMAL;
                }
                if (i14 == 1) {
                    return APP_STARTUP_MODE_MEDIA_PLAYBACK_CONFIGURATION;
                }
                if (i14 == 2) {
                    return APP_STARTUP_MODE_MEDIA_SYNC_CONFIGURATION;
                }
                if (i14 != 3) {
                    return null;
                }
                return APP_STARTUP_MODE_NO_UI;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return LaunchAppRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<StartUpMode> internalGetValueMap() {
                return internalValueMap;
            }

            public static StartUpMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static StartUpMode valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class LaunchAppResponse extends GeneratedMessageV3 implements LaunchAppResponseOrBuilder {
        private static final LaunchAppResponse DEFAULT_INSTANCE = new LaunchAppResponse();

        @Deprecated
        public static final Parser<LaunchAppResponse> PARSER = new AbstractParser<LaunchAppResponse>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.LaunchAppResponse.1
            @Override // com.google.protobuf.Parser
            public LaunchAppResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LaunchAppResponse.newBuilder();
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

        private LaunchAppResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LaunchAppResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_LaunchAppResponse_descriptor;
        }

        public static Builder newBuilder(LaunchAppResponse launchAppResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(launchAppResponse);
        }

        public static LaunchAppResponse parseDelimitedFrom(InputStream inputStream) {
            return (LaunchAppResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LaunchAppResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LaunchAppResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LaunchAppResponse)) {
                return super.equals(obj);
            }
            LaunchAppResponse launchAppResponse = (LaunchAppResponse) obj;
            if (hasStatus() != launchAppResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == launchAppResponse.status_) && getUnknownFields().equals(launchAppResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LaunchAppResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.LaunchAppResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.LAUNCH_STATUS_SUCCESS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.LaunchAppResponseOrBuilder
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
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_LaunchAppResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(LaunchAppResponse.class, Builder.class);
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
            return new LaunchAppResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LaunchAppResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(LaunchAppResponse launchAppResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    launchAppResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                launchAppResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_LaunchAppResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LaunchAppResponse build() {
                LaunchAppResponse launchAppResponseBuildPartial = buildPartial();
                if (launchAppResponseBuildPartial.isInitialized()) {
                    return launchAppResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) launchAppResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LaunchAppResponse buildPartial() {
                LaunchAppResponse launchAppResponse = new LaunchAppResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(launchAppResponse);
                }
                onBuilt();
                return launchAppResponse;
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
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_LaunchAppResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.LaunchAppResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.LAUNCH_STATUS_SUCCESS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.LaunchAppResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_LaunchAppResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(LaunchAppResponse.class, Builder.class);
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
            public LaunchAppResponse getDefaultInstanceForType() {
                return LaunchAppResponse.getDefaultInstance();
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
                if (message instanceof LaunchAppResponse) {
                    return mergeFrom((LaunchAppResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LaunchAppResponse launchAppResponse) {
                if (launchAppResponse == LaunchAppResponse.getDefaultInstance()) {
                    return this;
                }
                if (launchAppResponse.hasStatus()) {
                    setStatus(launchAppResponse.getStatus());
                }
                mergeUnknownFields(launchAppResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LaunchAppResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LaunchAppResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LaunchAppResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LaunchAppResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ LaunchAppResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LaunchAppResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private LaunchAppResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LaunchAppResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LaunchAppResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LaunchAppResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LaunchAppResponse parseFrom(InputStream inputStream) {
            return (LaunchAppResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LaunchAppResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LaunchAppResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LaunchAppResponse parseFrom(CodedInputStream codedInputStream) {
            return (LaunchAppResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LaunchAppResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LaunchAppResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            LAUNCH_STATUS_SUCCESS(0),
            LAUNCH_STATUS_APP_ALREADY_RUNNING(1),
            LAUNCH_STATUS_APP_NOT_INSTALLED(2),
            LAUNCH_STATUS_UNKNOWN_ERROR(3);

            public static final int LAUNCH_STATUS_APP_ALREADY_RUNNING_VALUE = 1;
            public static final int LAUNCH_STATUS_APP_NOT_INSTALLED_VALUE = 2;
            public static final int LAUNCH_STATUS_SUCCESS_VALUE = 0;
            public static final int LAUNCH_STATUS_UNKNOWN_ERROR_VALUE = 3;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.LaunchAppResponse.Status.1
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
                    return LAUNCH_STATUS_SUCCESS;
                }
                if (i14 == 1) {
                    return LAUNCH_STATUS_APP_ALREADY_RUNNING;
                }
                if (i14 == 2) {
                    return LAUNCH_STATUS_APP_NOT_INSTALLED;
                }
                if (i14 != 3) {
                    return null;
                }
                return LAUNCH_STATUS_UNKNOWN_ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return LaunchAppResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class PendingAppInstallRequest extends GeneratedMessageV3 implements PendingAppInstallRequestOrBuilder {
        public static final int APP_TYPE_FIELD_NUMBER = 1;
        public static final int APP_UUID_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 4;
        public static final int STORE_APP_ID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int appType_;
        private ByteString appUuid_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private ByteString storeAppId_;
        private static final PendingAppInstallRequest DEFAULT_INSTANCE = new PendingAppInstallRequest();

        @Deprecated
        public static final Parser<PendingAppInstallRequest> PARSER = new AbstractParser<PendingAppInstallRequest>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallRequest.1
            @Override // com.google.protobuf.Parser
            public PendingAppInstallRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PendingAppInstallRequest.newBuilder();
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

        private PendingAppInstallRequest() {
            this.appType_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.storeAppId_ = byteString;
            this.appUuid_ = byteString;
            this.name_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.appType_ = 0;
            this.storeAppId_ = byteString;
            this.appUuid_ = byteString;
            this.name_ = "";
        }

        public static PendingAppInstallRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_PendingAppInstallRequest_descriptor;
        }

        public static Builder newBuilder(PendingAppInstallRequest pendingAppInstallRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pendingAppInstallRequest);
        }

        public static PendingAppInstallRequest parseDelimitedFrom(InputStream inputStream) {
            return (PendingAppInstallRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PendingAppInstallRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PendingAppInstallRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PendingAppInstallRequest)) {
                return super.equals(obj);
            }
            PendingAppInstallRequest pendingAppInstallRequest = (PendingAppInstallRequest) obj;
            if (hasAppType() != pendingAppInstallRequest.hasAppType()) {
                return false;
            }
            if ((hasAppType() && this.appType_ != pendingAppInstallRequest.appType_) || hasStoreAppId() != pendingAppInstallRequest.hasStoreAppId()) {
                return false;
            }
            if ((hasStoreAppId() && !getStoreAppId().equals(pendingAppInstallRequest.getStoreAppId())) || hasAppUuid() != pendingAppInstallRequest.hasAppUuid()) {
                return false;
            }
            if ((!hasAppUuid() || getAppUuid().equals(pendingAppInstallRequest.getAppUuid())) && hasName() == pendingAppInstallRequest.hasName()) {
                return (!hasName() || getName().equals(pendingAppInstallRequest.getName())) && getUnknownFields().equals(pendingAppInstallRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallRequestOrBuilder
        public AppType getAppType() {
            AppType appTypeForNumber = AppType.forNumber(this.appType_);
            return appTypeForNumber == null ? AppType.UNKNOWN_APP_TYPE : appTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallRequestOrBuilder
        public ByteString getAppUuid() {
            return this.appUuid_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallRequestOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallRequestOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PendingAppInstallRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.appType_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(2, this.storeAppId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(3, this.appUuid_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += GeneratedMessageV3.computeStringSize(4, this.name_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallRequestOrBuilder
        public ByteString getStoreAppId() {
            return this.storeAppId_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallRequestOrBuilder
        public boolean hasAppType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallRequestOrBuilder
        public boolean hasAppUuid() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallRequestOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallRequestOrBuilder
        public boolean hasStoreAppId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAppType()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.appType_;
            }
            if (hasStoreAppId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getStoreAppId().hashCode();
            }
            if (hasAppUuid()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getAppUuid().hashCode();
            }
            if (hasName()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getName().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_PendingAppInstallRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(PendingAppInstallRequest.class, Builder.class);
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
            return new PendingAppInstallRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.appType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.storeAppId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBytes(3, this.appUuid_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.name_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PendingAppInstallRequestOrBuilder {
            private int appType_;
            private ByteString appUuid_;
            private int bitField0_;
            private Object name_;
            private ByteString storeAppId_;

            private Builder() {
                this.appType_ = 0;
                ByteString byteString = ByteString.EMPTY;
                this.storeAppId_ = byteString;
                this.appUuid_ = byteString;
                this.name_ = "";
            }

            private void buildPartial0(PendingAppInstallRequest pendingAppInstallRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    pendingAppInstallRequest.appType_ = this.appType_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    pendingAppInstallRequest.storeAppId_ = this.storeAppId_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    pendingAppInstallRequest.appUuid_ = this.appUuid_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    pendingAppInstallRequest.name_ = this.name_;
                    i14 |= 8;
                }
                pendingAppInstallRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_PendingAppInstallRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PendingAppInstallRequest build() {
                PendingAppInstallRequest pendingAppInstallRequestBuildPartial = buildPartial();
                if (pendingAppInstallRequestBuildPartial.isInitialized()) {
                    return pendingAppInstallRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pendingAppInstallRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PendingAppInstallRequest buildPartial() {
                PendingAppInstallRequest pendingAppInstallRequest = new PendingAppInstallRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(pendingAppInstallRequest);
                }
                onBuilt();
                return pendingAppInstallRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.appType_ = 0;
                ByteString byteString = ByteString.EMPTY;
                this.storeAppId_ = byteString;
                this.appUuid_ = byteString;
                this.name_ = "";
                return this;
            }

            public Builder clearAppType() {
                this.bitField0_ &= -2;
                this.appType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAppUuid() {
                this.bitField0_ &= -5;
                this.appUuid_ = PendingAppInstallRequest.getDefaultInstance().getAppUuid();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearName() {
                this.name_ = PendingAppInstallRequest.getDefaultInstance().getName();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStoreAppId() {
                this.bitField0_ &= -3;
                this.storeAppId_ = PendingAppInstallRequest.getDefaultInstance().getStoreAppId();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallRequestOrBuilder
            public AppType getAppType() {
                AppType appTypeForNumber = AppType.forNumber(this.appType_);
                return appTypeForNumber == null ? AppType.UNKNOWN_APP_TYPE : appTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallRequestOrBuilder
            public ByteString getAppUuid() {
                return this.appUuid_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_PendingAppInstallRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallRequestOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallRequestOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallRequestOrBuilder
            public ByteString getStoreAppId() {
                return this.storeAppId_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallRequestOrBuilder
            public boolean hasAppType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallRequestOrBuilder
            public boolean hasAppUuid() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallRequestOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallRequestOrBuilder
            public boolean hasStoreAppId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_PendingAppInstallRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(PendingAppInstallRequest.class, Builder.class);
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
                                    if (AppType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.appType_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    this.storeAppId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.appUuid_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.name_ = codedInputStream.readBytes();
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

            public Builder setAppType(AppType appType) {
                appType.getClass();
                this.bitField0_ |= 1;
                this.appType_ = appType.getNumber();
                onChanged();
                return this;
            }

            public Builder setAppUuid(ByteString byteString) {
                byteString.getClass();
                this.appUuid_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                this.name_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStoreAppId(ByteString byteString) {
                byteString.getClass();
                this.storeAppId_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public PendingAppInstallRequest getDefaultInstanceForType() {
                return PendingAppInstallRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.appType_ = 0;
                ByteString byteString = ByteString.EMPTY;
                this.storeAppId_ = byteString;
                this.appUuid_ = byteString;
                this.name_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PendingAppInstallRequest) {
                    return mergeFrom((PendingAppInstallRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PendingAppInstallRequest pendingAppInstallRequest) {
                if (pendingAppInstallRequest == PendingAppInstallRequest.getDefaultInstance()) {
                    return this;
                }
                if (pendingAppInstallRequest.hasAppType()) {
                    setAppType(pendingAppInstallRequest.getAppType());
                }
                if (pendingAppInstallRequest.hasStoreAppId()) {
                    setStoreAppId(pendingAppInstallRequest.getStoreAppId());
                }
                if (pendingAppInstallRequest.hasAppUuid()) {
                    setAppUuid(pendingAppInstallRequest.getAppUuid());
                }
                if (pendingAppInstallRequest.hasName()) {
                    this.name_ = pendingAppInstallRequest.name_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                mergeUnknownFields(pendingAppInstallRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PendingAppInstallRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static PendingAppInstallRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PendingAppInstallRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PendingAppInstallRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PendingAppInstallRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PendingAppInstallRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PendingAppInstallRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PendingAppInstallRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PendingAppInstallRequest parseFrom(InputStream inputStream) {
            return (PendingAppInstallRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PendingAppInstallRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PendingAppInstallRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PendingAppInstallRequest parseFrom(CodedInputStream codedInputStream) {
            return (PendingAppInstallRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PendingAppInstallRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PendingAppInstallRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private PendingAppInstallRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.appType_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.storeAppId_ = byteString;
            this.appUuid_ = byteString;
            this.name_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ PendingAppInstallRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class PendingAppInstallResponse extends GeneratedMessageV3 implements PendingAppInstallResponseOrBuilder {
        private static final PendingAppInstallResponse DEFAULT_INSTANCE = new PendingAppInstallResponse();

        @Deprecated
        public static final Parser<PendingAppInstallResponse> PARSER = new AbstractParser<PendingAppInstallResponse>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallResponse.1
            @Override // com.google.protobuf.Parser
            public PendingAppInstallResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PendingAppInstallResponse.newBuilder();
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

        private PendingAppInstallResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PendingAppInstallResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_PendingAppInstallResponse_descriptor;
        }

        public static Builder newBuilder(PendingAppInstallResponse pendingAppInstallResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pendingAppInstallResponse);
        }

        public static PendingAppInstallResponse parseDelimitedFrom(InputStream inputStream) {
            return (PendingAppInstallResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PendingAppInstallResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PendingAppInstallResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PendingAppInstallResponse)) {
                return super.equals(obj);
            }
            PendingAppInstallResponse pendingAppInstallResponse = (PendingAppInstallResponse) obj;
            if (hasStatus() != pendingAppInstallResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == pendingAppInstallResponse.status_) && getUnknownFields().equals(pendingAppInstallResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PendingAppInstallResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.SUCCESS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallResponseOrBuilder
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
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_PendingAppInstallResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(PendingAppInstallResponse.class, Builder.class);
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
            return new PendingAppInstallResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PendingAppInstallResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(PendingAppInstallResponse pendingAppInstallResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    pendingAppInstallResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                pendingAppInstallResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_PendingAppInstallResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PendingAppInstallResponse build() {
                PendingAppInstallResponse pendingAppInstallResponseBuildPartial = buildPartial();
                if (pendingAppInstallResponseBuildPartial.isInitialized()) {
                    return pendingAppInstallResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pendingAppInstallResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PendingAppInstallResponse buildPartial() {
                PendingAppInstallResponse pendingAppInstallResponse = new PendingAppInstallResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(pendingAppInstallResponse);
                }
                onBuilt();
                return pendingAppInstallResponse;
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
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_PendingAppInstallResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.SUCCESS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_PendingAppInstallResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(PendingAppInstallResponse.class, Builder.class);
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
            public PendingAppInstallResponse getDefaultInstanceForType() {
                return PendingAppInstallResponse.getDefaultInstance();
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
                if (message instanceof PendingAppInstallResponse) {
                    return mergeFrom((PendingAppInstallResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PendingAppInstallResponse pendingAppInstallResponse) {
                if (pendingAppInstallResponse == PendingAppInstallResponse.getDefaultInstance()) {
                    return this;
                }
                if (pendingAppInstallResponse.hasStatus()) {
                    setStatus(pendingAppInstallResponse.getStatus());
                }
                mergeUnknownFields(pendingAppInstallResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PendingAppInstallResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static PendingAppInstallResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PendingAppInstallResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PendingAppInstallResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ PendingAppInstallResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static PendingAppInstallResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private PendingAppInstallResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PendingAppInstallResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PendingAppInstallResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PendingAppInstallResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PendingAppInstallResponse parseFrom(InputStream inputStream) {
            return (PendingAppInstallResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PendingAppInstallResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PendingAppInstallResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PendingAppInstallResponse parseFrom(CodedInputStream codedInputStream) {
            return (PendingAppInstallResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PendingAppInstallResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PendingAppInstallResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            SUCCESS(0),
            FAIL(1),
            NO_CIQ_SUPPORT(2),
            ALREADY_INSTALLED(3),
            NO_SPACE(4);

            public static final int ALREADY_INSTALLED_VALUE = 3;
            public static final int FAIL_VALUE = 1;
            public static final int NO_CIQ_SUPPORT_VALUE = 2;
            public static final int NO_SPACE_VALUE = 4;
            public static final int SUCCESS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.PendingAppInstallResponse.Status.1
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
                    return SUCCESS;
                }
                if (i14 == 1) {
                    return FAIL;
                }
                if (i14 == 2) {
                    return NO_CIQ_SUPPORT;
                }
                if (i14 == 3) {
                    return ALREADY_INSTALLED;
                }
                if (i14 != 4) {
                    return null;
                }
                return NO_SPACE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return PendingAppInstallResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class UpdateFaceItProjectIdMappingsRequest extends GeneratedMessageV3 implements UpdateFaceItProjectIdMappingsRequestOrBuilder {
        private static final UpdateFaceItProjectIdMappingsRequest DEFAULT_INSTANCE = new UpdateFaceItProjectIdMappingsRequest();

        @Deprecated
        public static final Parser<UpdateFaceItProjectIdMappingsRequest> PARSER = new AbstractParser<UpdateFaceItProjectIdMappingsRequest>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsRequest.1
            @Override // com.google.protobuf.Parser
            public UpdateFaceItProjectIdMappingsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UpdateFaceItProjectIdMappingsRequest.newBuilder();
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
        public static final int SLOT_1_FIELD_NUMBER = 1;
        public static final int SLOT_2_FIELD_NUMBER = 2;
        public static final int SLOT_3_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object slot1_;
        private volatile Object slot2_;
        private volatile Object slot3_;

        private UpdateFaceItProjectIdMappingsRequest() {
            this.slot1_ = "";
            this.slot2_ = "";
            this.slot3_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.slot1_ = "";
            this.slot2_ = "";
            this.slot3_ = "";
        }

        public static UpdateFaceItProjectIdMappingsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateFaceItProjectIdMappingsRequest_descriptor;
        }

        public static Builder newBuilder(UpdateFaceItProjectIdMappingsRequest updateFaceItProjectIdMappingsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(updateFaceItProjectIdMappingsRequest);
        }

        public static UpdateFaceItProjectIdMappingsRequest parseDelimitedFrom(InputStream inputStream) {
            return (UpdateFaceItProjectIdMappingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UpdateFaceItProjectIdMappingsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UpdateFaceItProjectIdMappingsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateFaceItProjectIdMappingsRequest)) {
                return super.equals(obj);
            }
            UpdateFaceItProjectIdMappingsRequest updateFaceItProjectIdMappingsRequest = (UpdateFaceItProjectIdMappingsRequest) obj;
            if (hasSlot1() != updateFaceItProjectIdMappingsRequest.hasSlot1()) {
                return false;
            }
            if ((hasSlot1() && !getSlot1().equals(updateFaceItProjectIdMappingsRequest.getSlot1())) || hasSlot2() != updateFaceItProjectIdMappingsRequest.hasSlot2()) {
                return false;
            }
            if ((!hasSlot2() || getSlot2().equals(updateFaceItProjectIdMappingsRequest.getSlot2())) && hasSlot3() == updateFaceItProjectIdMappingsRequest.hasSlot3()) {
                return (!hasSlot3() || getSlot3().equals(updateFaceItProjectIdMappingsRequest.getSlot3())) && getUnknownFields().equals(updateFaceItProjectIdMappingsRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UpdateFaceItProjectIdMappingsRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.slot1_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.slot2_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.slot3_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsRequestOrBuilder
        public String getSlot1() {
            Object obj = this.slot1_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.slot1_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsRequestOrBuilder
        public ByteString getSlot1Bytes() {
            Object obj = this.slot1_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.slot1_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsRequestOrBuilder
        public String getSlot2() {
            Object obj = this.slot2_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.slot2_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsRequestOrBuilder
        public ByteString getSlot2Bytes() {
            Object obj = this.slot2_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.slot2_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsRequestOrBuilder
        public String getSlot3() {
            Object obj = this.slot3_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.slot3_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsRequestOrBuilder
        public ByteString getSlot3Bytes() {
            Object obj = this.slot3_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.slot3_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsRequestOrBuilder
        public boolean hasSlot1() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsRequestOrBuilder
        public boolean hasSlot2() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsRequestOrBuilder
        public boolean hasSlot3() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSlot1()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSlot1().hashCode();
            }
            if (hasSlot2()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSlot2().hashCode();
            }
            if (hasSlot3()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSlot3().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateFaceItProjectIdMappingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateFaceItProjectIdMappingsRequest.class, Builder.class);
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
            return new UpdateFaceItProjectIdMappingsRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.slot1_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.slot2_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.slot3_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UpdateFaceItProjectIdMappingsRequestOrBuilder {
            private int bitField0_;
            private Object slot1_;
            private Object slot2_;
            private Object slot3_;

            private Builder() {
                this.slot1_ = "";
                this.slot2_ = "";
                this.slot3_ = "";
            }

            private void buildPartial0(UpdateFaceItProjectIdMappingsRequest updateFaceItProjectIdMappingsRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    updateFaceItProjectIdMappingsRequest.slot1_ = this.slot1_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    updateFaceItProjectIdMappingsRequest.slot2_ = this.slot2_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    updateFaceItProjectIdMappingsRequest.slot3_ = this.slot3_;
                    i14 |= 4;
                }
                updateFaceItProjectIdMappingsRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateFaceItProjectIdMappingsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateFaceItProjectIdMappingsRequest build() {
                UpdateFaceItProjectIdMappingsRequest updateFaceItProjectIdMappingsRequestBuildPartial = buildPartial();
                if (updateFaceItProjectIdMappingsRequestBuildPartial.isInitialized()) {
                    return updateFaceItProjectIdMappingsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) updateFaceItProjectIdMappingsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateFaceItProjectIdMappingsRequest buildPartial() {
                UpdateFaceItProjectIdMappingsRequest updateFaceItProjectIdMappingsRequest = new UpdateFaceItProjectIdMappingsRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(updateFaceItProjectIdMappingsRequest);
                }
                onBuilt();
                return updateFaceItProjectIdMappingsRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.slot1_ = "";
                this.slot2_ = "";
                this.slot3_ = "";
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

            public Builder clearSlot1() {
                this.slot1_ = UpdateFaceItProjectIdMappingsRequest.getDefaultInstance().getSlot1();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearSlot2() {
                this.slot2_ = UpdateFaceItProjectIdMappingsRequest.getDefaultInstance().getSlot2();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearSlot3() {
                this.slot3_ = UpdateFaceItProjectIdMappingsRequest.getDefaultInstance().getSlot3();
                this.bitField0_ &= -5;
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
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateFaceItProjectIdMappingsRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsRequestOrBuilder
            public String getSlot1() {
                Object obj = this.slot1_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.slot1_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsRequestOrBuilder
            public ByteString getSlot1Bytes() {
                Object obj = this.slot1_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.slot1_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsRequestOrBuilder
            public String getSlot2() {
                Object obj = this.slot2_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.slot2_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsRequestOrBuilder
            public ByteString getSlot2Bytes() {
                Object obj = this.slot2_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.slot2_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsRequestOrBuilder
            public String getSlot3() {
                Object obj = this.slot3_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.slot3_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsRequestOrBuilder
            public ByteString getSlot3Bytes() {
                Object obj = this.slot3_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.slot3_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsRequestOrBuilder
            public boolean hasSlot1() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsRequestOrBuilder
            public boolean hasSlot2() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsRequestOrBuilder
            public boolean hasSlot3() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateFaceItProjectIdMappingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateFaceItProjectIdMappingsRequest.class, Builder.class);
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
                                    this.slot1_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.slot2_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.slot3_ = codedInputStream.readBytes();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSlot1(String str) {
                str.getClass();
                this.slot1_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSlot1Bytes(ByteString byteString) {
                byteString.getClass();
                this.slot1_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSlot2(String str) {
                str.getClass();
                this.slot2_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSlot2Bytes(ByteString byteString) {
                byteString.getClass();
                this.slot2_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSlot3(String str) {
                str.getClass();
                this.slot3_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSlot3Bytes(ByteString byteString) {
                byteString.getClass();
                this.slot3_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public UpdateFaceItProjectIdMappingsRequest getDefaultInstanceForType() {
                return UpdateFaceItProjectIdMappingsRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.slot1_ = "";
                this.slot2_ = "";
                this.slot3_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UpdateFaceItProjectIdMappingsRequest) {
                    return mergeFrom((UpdateFaceItProjectIdMappingsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UpdateFaceItProjectIdMappingsRequest updateFaceItProjectIdMappingsRequest) {
                if (updateFaceItProjectIdMappingsRequest == UpdateFaceItProjectIdMappingsRequest.getDefaultInstance()) {
                    return this;
                }
                if (updateFaceItProjectIdMappingsRequest.hasSlot1()) {
                    this.slot1_ = updateFaceItProjectIdMappingsRequest.slot1_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (updateFaceItProjectIdMappingsRequest.hasSlot2()) {
                    this.slot2_ = updateFaceItProjectIdMappingsRequest.slot2_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (updateFaceItProjectIdMappingsRequest.hasSlot3()) {
                    this.slot3_ = updateFaceItProjectIdMappingsRequest.slot3_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                mergeUnknownFields(updateFaceItProjectIdMappingsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UpdateFaceItProjectIdMappingsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UpdateFaceItProjectIdMappingsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateFaceItProjectIdMappingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateFaceItProjectIdMappingsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UpdateFaceItProjectIdMappingsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UpdateFaceItProjectIdMappingsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UpdateFaceItProjectIdMappingsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UpdateFaceItProjectIdMappingsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UpdateFaceItProjectIdMappingsRequest parseFrom(InputStream inputStream) {
            return (UpdateFaceItProjectIdMappingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UpdateFaceItProjectIdMappingsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateFaceItProjectIdMappingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateFaceItProjectIdMappingsRequest parseFrom(CodedInputStream codedInputStream) {
            return (UpdateFaceItProjectIdMappingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UpdateFaceItProjectIdMappingsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateFaceItProjectIdMappingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private UpdateFaceItProjectIdMappingsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.slot1_ = "";
            this.slot2_ = "";
            this.slot3_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ UpdateFaceItProjectIdMappingsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class UpdateFaceItProjectIdMappingsResponse extends GeneratedMessageV3 implements UpdateFaceItProjectIdMappingsResponseOrBuilder {
        private static final UpdateFaceItProjectIdMappingsResponse DEFAULT_INSTANCE = new UpdateFaceItProjectIdMappingsResponse();

        @Deprecated
        public static final Parser<UpdateFaceItProjectIdMappingsResponse> PARSER = new AbstractParser<UpdateFaceItProjectIdMappingsResponse>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsResponse.1
            @Override // com.google.protobuf.Parser
            public UpdateFaceItProjectIdMappingsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UpdateFaceItProjectIdMappingsResponse.newBuilder();
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
        public static final int SLOT_1_STATUS_FIELD_NUMBER = 1;
        public static final int SLOT_2_STATUS_FIELD_NUMBER = 2;
        public static final int SLOT_3_STATUS_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int slot1Status_;
        private int slot2Status_;
        private int slot3Status_;

        private UpdateFaceItProjectIdMappingsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.slot1Status_ = 0;
            this.slot2Status_ = 0;
            this.slot3Status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UpdateFaceItProjectIdMappingsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateFaceItProjectIdMappingsResponse_descriptor;
        }

        public static Builder newBuilder(UpdateFaceItProjectIdMappingsResponse updateFaceItProjectIdMappingsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(updateFaceItProjectIdMappingsResponse);
        }

        public static UpdateFaceItProjectIdMappingsResponse parseDelimitedFrom(InputStream inputStream) {
            return (UpdateFaceItProjectIdMappingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UpdateFaceItProjectIdMappingsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UpdateFaceItProjectIdMappingsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateFaceItProjectIdMappingsResponse)) {
                return super.equals(obj);
            }
            UpdateFaceItProjectIdMappingsResponse updateFaceItProjectIdMappingsResponse = (UpdateFaceItProjectIdMappingsResponse) obj;
            if (hasSlot1Status() != updateFaceItProjectIdMappingsResponse.hasSlot1Status()) {
                return false;
            }
            if ((hasSlot1Status() && this.slot1Status_ != updateFaceItProjectIdMappingsResponse.slot1Status_) || hasSlot2Status() != updateFaceItProjectIdMappingsResponse.hasSlot2Status()) {
                return false;
            }
            if ((!hasSlot2Status() || this.slot2Status_ == updateFaceItProjectIdMappingsResponse.slot2Status_) && hasSlot3Status() == updateFaceItProjectIdMappingsResponse.hasSlot3Status()) {
                return (!hasSlot3Status() || this.slot3Status_ == updateFaceItProjectIdMappingsResponse.slot3Status_) && getUnknownFields().equals(updateFaceItProjectIdMappingsResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UpdateFaceItProjectIdMappingsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.slot1Status_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.slot2Status_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(3, this.slot3Status_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsResponseOrBuilder
        public Status getSlot1Status() {
            Status statusForNumber = Status.forNumber(this.slot1Status_);
            return statusForNumber == null ? Status.SUCCESS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsResponseOrBuilder
        public Status getSlot2Status() {
            Status statusForNumber = Status.forNumber(this.slot2Status_);
            return statusForNumber == null ? Status.SUCCESS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsResponseOrBuilder
        public Status getSlot3Status() {
            Status statusForNumber = Status.forNumber(this.slot3Status_);
            return statusForNumber == null ? Status.SUCCESS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsResponseOrBuilder
        public boolean hasSlot1Status() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsResponseOrBuilder
        public boolean hasSlot2Status() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsResponseOrBuilder
        public boolean hasSlot3Status() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSlot1Status()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.slot1Status_;
            }
            if (hasSlot2Status()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.slot2Status_;
            }
            if (hasSlot3Status()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.slot3Status_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateFaceItProjectIdMappingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateFaceItProjectIdMappingsResponse.class, Builder.class);
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
            return new UpdateFaceItProjectIdMappingsResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.slot1Status_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.slot2Status_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.slot3Status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UpdateFaceItProjectIdMappingsResponseOrBuilder {
            private int bitField0_;
            private int slot1Status_;
            private int slot2Status_;
            private int slot3Status_;

            private Builder() {
                this.slot1Status_ = 0;
                this.slot2Status_ = 0;
                this.slot3Status_ = 0;
            }

            private void buildPartial0(UpdateFaceItProjectIdMappingsResponse updateFaceItProjectIdMappingsResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    updateFaceItProjectIdMappingsResponse.slot1Status_ = this.slot1Status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    updateFaceItProjectIdMappingsResponse.slot2Status_ = this.slot2Status_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    updateFaceItProjectIdMappingsResponse.slot3Status_ = this.slot3Status_;
                    i14 |= 4;
                }
                updateFaceItProjectIdMappingsResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateFaceItProjectIdMappingsResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateFaceItProjectIdMappingsResponse build() {
                UpdateFaceItProjectIdMappingsResponse updateFaceItProjectIdMappingsResponseBuildPartial = buildPartial();
                if (updateFaceItProjectIdMappingsResponseBuildPartial.isInitialized()) {
                    return updateFaceItProjectIdMappingsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) updateFaceItProjectIdMappingsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateFaceItProjectIdMappingsResponse buildPartial() {
                UpdateFaceItProjectIdMappingsResponse updateFaceItProjectIdMappingsResponse = new UpdateFaceItProjectIdMappingsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(updateFaceItProjectIdMappingsResponse);
                }
                onBuilt();
                return updateFaceItProjectIdMappingsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.slot1Status_ = 0;
                this.slot2Status_ = 0;
                this.slot3Status_ = 0;
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

            public Builder clearSlot1Status() {
                this.bitField0_ &= -2;
                this.slot1Status_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSlot2Status() {
                this.bitField0_ &= -3;
                this.slot2Status_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSlot3Status() {
                this.bitField0_ &= -5;
                this.slot3Status_ = 0;
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
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateFaceItProjectIdMappingsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsResponseOrBuilder
            public Status getSlot1Status() {
                Status statusForNumber = Status.forNumber(this.slot1Status_);
                return statusForNumber == null ? Status.SUCCESS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsResponseOrBuilder
            public Status getSlot2Status() {
                Status statusForNumber = Status.forNumber(this.slot2Status_);
                return statusForNumber == null ? Status.SUCCESS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsResponseOrBuilder
            public Status getSlot3Status() {
                Status statusForNumber = Status.forNumber(this.slot3Status_);
                return statusForNumber == null ? Status.SUCCESS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsResponseOrBuilder
            public boolean hasSlot1Status() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsResponseOrBuilder
            public boolean hasSlot2Status() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsResponseOrBuilder
            public boolean hasSlot3Status() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateFaceItProjectIdMappingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateFaceItProjectIdMappingsResponse.class, Builder.class);
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
                                        this.slot1Status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    int i15 = codedInputStream.readEnum();
                                    if (Status.forNumber(i15) == null) {
                                        mergeUnknownVarintField(2, i15);
                                    } else {
                                        this.slot2Status_ = i15;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 24) {
                                    int i16 = codedInputStream.readEnum();
                                    if (Status.forNumber(i16) == null) {
                                        mergeUnknownVarintField(3, i16);
                                    } else {
                                        this.slot3Status_ = i16;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSlot1Status(Status status) {
                status.getClass();
                this.bitField0_ |= 1;
                this.slot1Status_ = status.getNumber();
                onChanged();
                return this;
            }

            public Builder setSlot2Status(Status status) {
                status.getClass();
                this.bitField0_ |= 2;
                this.slot2Status_ = status.getNumber();
                onChanged();
                return this;
            }

            public Builder setSlot3Status(Status status) {
                status.getClass();
                this.bitField0_ |= 4;
                this.slot3Status_ = status.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public UpdateFaceItProjectIdMappingsResponse getDefaultInstanceForType() {
                return UpdateFaceItProjectIdMappingsResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.slot1Status_ = 0;
                this.slot2Status_ = 0;
                this.slot3Status_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UpdateFaceItProjectIdMappingsResponse) {
                    return mergeFrom((UpdateFaceItProjectIdMappingsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UpdateFaceItProjectIdMappingsResponse updateFaceItProjectIdMappingsResponse) {
                if (updateFaceItProjectIdMappingsResponse == UpdateFaceItProjectIdMappingsResponse.getDefaultInstance()) {
                    return this;
                }
                if (updateFaceItProjectIdMappingsResponse.hasSlot1Status()) {
                    setSlot1Status(updateFaceItProjectIdMappingsResponse.getSlot1Status());
                }
                if (updateFaceItProjectIdMappingsResponse.hasSlot2Status()) {
                    setSlot2Status(updateFaceItProjectIdMappingsResponse.getSlot2Status());
                }
                if (updateFaceItProjectIdMappingsResponse.hasSlot3Status()) {
                    setSlot3Status(updateFaceItProjectIdMappingsResponse.getSlot3Status());
                }
                mergeUnknownFields(updateFaceItProjectIdMappingsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UpdateFaceItProjectIdMappingsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UpdateFaceItProjectIdMappingsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateFaceItProjectIdMappingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateFaceItProjectIdMappingsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UpdateFaceItProjectIdMappingsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UpdateFaceItProjectIdMappingsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UpdateFaceItProjectIdMappingsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UpdateFaceItProjectIdMappingsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ UpdateFaceItProjectIdMappingsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UpdateFaceItProjectIdMappingsResponse parseFrom(InputStream inputStream) {
            return (UpdateFaceItProjectIdMappingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private UpdateFaceItProjectIdMappingsResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.slot1Status_ = 0;
            this.slot2Status_ = 0;
            this.slot3Status_ = 0;
        }

        public static UpdateFaceItProjectIdMappingsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateFaceItProjectIdMappingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateFaceItProjectIdMappingsResponse parseFrom(CodedInputStream codedInputStream) {
            return (UpdateFaceItProjectIdMappingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UpdateFaceItProjectIdMappingsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateFaceItProjectIdMappingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            SUCCESS(0),
            NO_CHANGE(1),
            FAIL(2);

            public static final int FAIL_VALUE = 2;
            public static final int NO_CHANGE_VALUE = 1;
            public static final int SUCCESS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateFaceItProjectIdMappingsResponse.Status.1
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
                    return SUCCESS;
                }
                if (i14 == 1) {
                    return NO_CHANGE;
                }
                if (i14 != 2) {
                    return null;
                }
                return FAIL;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return UpdateFaceItProjectIdMappingsResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class UpdateInstalledAppsResponse extends GeneratedMessageV3 implements UpdateInstalledAppsResponseOrBuilder {
        private static final UpdateInstalledAppsResponse DEFAULT_INSTANCE = new UpdateInstalledAppsResponse();

        @Deprecated
        public static final Parser<UpdateInstalledAppsResponse> PARSER = new AbstractParser<UpdateInstalledAppsResponse>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsResponse.1
            @Override // com.google.protobuf.Parser
            public UpdateInstalledAppsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UpdateInstalledAppsResponse.newBuilder();
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

        private UpdateInstalledAppsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UpdateInstalledAppsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsResponse_descriptor;
        }

        public static Builder newBuilder(UpdateInstalledAppsResponse updateInstalledAppsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(updateInstalledAppsResponse);
        }

        public static UpdateInstalledAppsResponse parseDelimitedFrom(InputStream inputStream) {
            return (UpdateInstalledAppsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UpdateInstalledAppsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UpdateInstalledAppsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateInstalledAppsResponse)) {
                return super.equals(obj);
            }
            UpdateInstalledAppsResponse updateInstalledAppsResponse = (UpdateInstalledAppsResponse) obj;
            if (hasStatus() != updateInstalledAppsResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == updateInstalledAppsResponse.status_) && getUnknownFields().equals(updateInstalledAppsResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UpdateInstalledAppsResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsResponseOrBuilder
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
            return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateInstalledAppsResponse.class, Builder.class);
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
            return new UpdateInstalledAppsResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UpdateInstalledAppsResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(UpdateInstalledAppsResponse updateInstalledAppsResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    updateInstalledAppsResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                updateInstalledAppsResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateInstalledAppsResponse build() {
                UpdateInstalledAppsResponse updateInstalledAppsResponseBuildPartial = buildPartial();
                if (updateInstalledAppsResponseBuildPartial.isInitialized()) {
                    return updateInstalledAppsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) updateInstalledAppsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateInstalledAppsResponse buildPartial() {
                UpdateInstalledAppsResponse updateInstalledAppsResponse = new UpdateInstalledAppsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(updateInstalledAppsResponse);
                }
                onBuilt();
                return updateInstalledAppsResponse;
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
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQInstalledApps.internal_static_GDI_Proto_ConnectIQInstalledApps_UpdateInstalledAppsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateInstalledAppsResponse.class, Builder.class);
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
            public UpdateInstalledAppsResponse getDefaultInstanceForType() {
                return UpdateInstalledAppsResponse.getDefaultInstance();
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
                if (message instanceof UpdateInstalledAppsResponse) {
                    return mergeFrom((UpdateInstalledAppsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UpdateInstalledAppsResponse updateInstalledAppsResponse) {
                if (updateInstalledAppsResponse == UpdateInstalledAppsResponse.getDefaultInstance()) {
                    return this;
                }
                if (updateInstalledAppsResponse.hasStatus()) {
                    setStatus(updateInstalledAppsResponse.getStatus());
                }
                mergeUnknownFields(updateInstalledAppsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UpdateInstalledAppsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UpdateInstalledAppsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateInstalledAppsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateInstalledAppsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ UpdateInstalledAppsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UpdateInstalledAppsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private UpdateInstalledAppsResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UpdateInstalledAppsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UpdateInstalledAppsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UpdateInstalledAppsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UpdateInstalledAppsResponse parseFrom(InputStream inputStream) {
            return (UpdateInstalledAppsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UpdateInstalledAppsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateInstalledAppsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateInstalledAppsResponse parseFrom(CodedInputStream codedInputStream) {
            return (UpdateInstalledAppsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UpdateInstalledAppsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateInstalledAppsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN_STATUS(0),
            OK(1),
            FAILED_TO_UPDATE(2);

            public static final int FAILED_TO_UPDATE_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.UpdateInstalledAppsResponse.Status.1
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
                return FAILED_TO_UPDATE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return UpdateInstalledAppsResponse.getDescriptor().getEnumTypes().get(0);
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

    public enum AppType implements ProtocolMessageEnum {
        UNKNOWN_APP_TYPE(0),
        WATCH_APP(1),
        WIDGET(2),
        WATCH_FACE(3),
        DATA_FIELD(4),
        ALL(5),
        NONE(6),
        AUDIO_CONTENT_PROVIDER(7),
        ACTIVITY(8);

        public static final int ACTIVITY_VALUE = 8;
        public static final int ALL_VALUE = 5;
        public static final int AUDIO_CONTENT_PROVIDER_VALUE = 7;
        public static final int DATA_FIELD_VALUE = 4;
        public static final int NONE_VALUE = 6;
        public static final int UNKNOWN_APP_TYPE_VALUE = 0;
        public static final int WATCH_APP_VALUE = 1;
        public static final int WATCH_FACE_VALUE = 3;
        public static final int WIDGET_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap<AppType> internalValueMap = new Internal.EnumLiteMap<AppType>() { // from class: com.garmin.proto.generated.GDIConnectIQInstalledApps.AppType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public AppType findValueByNumber(int i14) {
                return AppType.forNumber(i14);
            }
        };
        private static final AppType[] VALUES = values();

        AppType(int i14) {
            this.value = i14;
        }

        public static AppType forNumber(int i14) {
            switch (i14) {
                case 0:
                    return UNKNOWN_APP_TYPE;
                case 1:
                    return WATCH_APP;
                case 2:
                    return WIDGET;
                case 3:
                    return WATCH_FACE;
                case 4:
                    return DATA_FIELD;
                case 5:
                    return ALL;
                case 6:
                    return NONE;
                case 7:
                    return AUDIO_CONTENT_PROVIDER;
                case 8:
                    return ACTIVITY;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIConnectIQInstalledApps.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<AppType> internalGetValueMap() {
            return internalValueMap;
        }

        public static AppType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static AppType valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
