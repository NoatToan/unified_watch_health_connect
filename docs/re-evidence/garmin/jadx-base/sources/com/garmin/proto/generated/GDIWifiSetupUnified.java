package com.garmin.proto.generated;

import com.garmin.android.apps.connectmobile.f3;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
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
import java.util.Iterator;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public final class GDIWifiSetupUnified {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0019GDIWifiSetupUnified.proto\u0012\u001aGDI.Proto.WifiSetupUnified\u001a\rGDICore.proto\u001a\u0012wifiSetupGDI.proto\"°\r\n\u0017WifiSetupUnifiedService\u0012W\n\u001ascan_wifi_networks_request\u0018\u0001 \u0001(\u000b23.GDI.Proto.WifiSetupUnified.ScanWifiNetworksRequest\u0012Y\n\u001bscan_wifi_networks_response\u0018\u0002 \u0001(\u000b24.GDI.Proto.WifiSetupUnified.ScanWifiNetworksResponse\u0012e\n'access_point_scan_complete_notification\u0018\u0003 \u0001(\u000b24.GDI.Proto.WifiSetupUnified.ScanCompleteNotification\u0012`\n\u001fconnect_to_wifi_network_request\u0018\u0004 \u0001(\u000b27.GDI.Proto.WifiSetupUnified.ConnectToWifiNetworkRequest\u0012b\n connect_to_wifi_network_response\u0018\u0005 \u0001(\u000b28.GDI.Proto.WifiSetupUnified.ConnectToWifiNetworkResponse\u0012j\n$connect_to_wifi_network_notification\u0018\u0006 \u0001(\u000b2<.GDI.Proto.WifiSetupUnified.ConnectToWifiNetworkNotification\u0012U\n\u0019save_wifi_network_request\u0018\u0007 \u0001(\u000b22.GDI.Proto.WifiSetupUnified.SaveWifiNetworkRequest\u0012W\n\u001asave_wifi_network_response\u0018\b \u0001(\u000b23.GDI.Proto.WifiSetupUnified.SaveWifiNetworkResponse\u0012Y\n\u001bremove_wifi_network_request\u0018\t \u0001(\u000b24.GDI.Proto.WifiSetupUnified.RemoveWifiNetworkRequest\u0012[\n\u001cremove_wifi_network_response\u0018\n \u0001(\u000b25.GDI.Proto.WifiSetupUnified.RemoveWifiNetworkResponse\u0012^\n\u001cstored_wifi_networks_request\u0018\u000b \u0001(\u000b28.GDI.Proto.WifiSetupUnified.GetStoredWifiNetworksRequest\u0012`\n\u001dstored_wifi_networks_response\u0018\f \u0001(\u000b29.GDI.Proto.WifiSetupUnified.GetStoredWifiNetworksResponse\u0012Y\n\u001bmobile_carrier_info_request\u0018\r \u0001(\u000b24.GDI.Proto.WifiSetupUnified.MobileCarrierInfoRequest\u0012[\n\u001cmobile_carrier_info_response\u0018\u000e \u0001(\u000b25.GDI.Proto.WifiSetupUnified.MobileCarrierInfoResponse\u0012O\n\u0014switch_to_ap_request\u0018\u000f \u0001(\u000b21.GDI.Proto.WifiSetupUnified.SwitchToApModeRequest\u0012Q\n\u0015switch_to_ap_response\u0018\u0010 \u0001(\u000b22.GDI.Proto.WifiSetupUnified.SwitchToApModeResponse\u0012_\n\u001fget_network_credentials_request\u0018\u0011 \u0001(\u000b26.GDI.Proto.WifiSetupUnified.DeviceAPCredentialsRequest\u0012a\n get_network_credentials_response\u0018\u0012 \u0001(\u000b27.GDI.Proto.WifiSetupUnified.DeviceAPCredentialsResponse\"Ì\u0001\n\u0013CapabilitiesRequest\u0012>\n\fcapabilities\u0018\u0001 \u0001(\u000b2(.GDI.Proto.WifiSetupUnified.Capabilities2u\n\u0010features_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018* \u0001(\u000b2/.GDI.Proto.WifiSetupUnified.CapabilitiesRequest\"R\n\fCapabilities\u0012B\n\u0014supported_wifi_modes\u0018\u0001 \u0003(\u000e2$.GDI.Proto.WifiSetupUnified.WifiMode\"Ð\u0001\n\u0014CapabilitiesResponse\u0012>\n\fcapabilities\u0018\u0001 \u0001(\u000b2(.GDI.Proto.WifiSetupUnified.Capabilities2x\n\u0011features_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018* \u0001(\u000b20.GDI.Proto.WifiSetupUnified.CapabilitiesResponse\"å\u0002\n\u0012PasswordGeneration\u0012[\n\bstrategy\u0018\u0001 \u0001(\u000e2I.GDI.Proto.WifiSetupUnified.PasswordGeneration.PasswordGenerationStrategy\u0012\u0015\n\rpassword_seed\u0018\u0002 \u0001(\t\"Ú\u0001\n\u001aPasswordGenerationStrategy\u0012(\n$PASSWORD_GENERATION_STRATEGY_UNKNOWN\u0010\u0000\u0012-\n)PASSWORD_GENERATION_STRATEGY_USE_EXISTING\u0010\u0001\u0012.\n*PASSWORD_GENERATION_STRATEGY_SEND_EXPLICIT\u0010\u0002\u00123\n/PASSWORD_GENERATION_STRATEGY_USE_SPECIFIED_SEED\u0010\u0003\"¤\u0001\n\u0015SwitchToApModeRequest\u0012K\n\u0013password_generation\u0018\u0001 \u0001(\u000b2..GDI.Proto.WifiSetupUnified.PasswordGeneration\u0012-\n\u000epreferred_band\u0018\u0002 \u0001(\u000e2\u0015.GDI.fitness.WifiBand\u0012\u000f\n\u0007channel\u0018\u0003 \u0001(\r\"f\n\u0016SwitchToApModeResponse\u0012\u000f\n\u0007success\u0018\u0001 \u0001(\b\u0012;\n\u0013device_access_point\u0018\u0002 \u0001(\u000b2\u001e.GDI.fitness.StoredAccessPoint\"\u001c\n\u001aDeviceAPCredentialsRequest\"Z\n\u001bDeviceAPCredentialsResponse\u0012;\n\u0013device_access_point\u0018\u0001 \u0001(\u000b2\u001e.GDI.fitness.StoredAccessPoint\"I\n\u001bConnectToWifiNetworkRequest\u0012*\n\u0002ap\u0018\u0001 \u0001(\u000b2\u001e.GDI.fitness.StoredAccessPoint\"G\n\u001cConnectToWifiNetworkResponse\u0012'\n\u0006status\u0018\u0001 \u0001(\u000e2\u0017.GDI.fitness.StatusType\"Y\n ConnectToWifiNetworkNotification\u0012\f\n\u0004ssid\u0018\u0001 \u0001(\t\u0012'\n\u0006status\u0018\u0002 \u0001(\u000e2\u0017.GDI.fitness.StatusType\">\n\u0017ScanWifiNetworksRequest\u0012#\n\u0004band\u0018\u0001 \u0001(\u000e2\u0015.GDI.fitness.WifiBand\"'\n\u0018ScanWifiNetworksResponse\u0012\u000b\n\u0003ack\u0018\u0001 \u0001(\b\"â\u0001\n\u0018ScanCompleteNotification\u0012K\n\u0006status\u0018\u0001 \u0001(\u000e2;.GDI.Proto.WifiSetupUnified.ScanCompleteNotification.Status\u00124\n\u000bscanned_aps\u0018\u0002 \u0003(\u000b2\u001f.GDI.fitness.ScannedAccessPoint\"C\n\u0006Status\u0012\u0012\n\u000eSTATUS_UNKNOWN\u0010\u0000\u0012\u0012\n\u000eSTATUS_SUCCESS\u0010\u0001\u0012\u0011\n\rSTATUS_FAILED\u0010\u0002\"\u001f\n\u001dGetScannedWifiNetworksRequest\"V\n\u001eGetScannedWifiNetworksResponse\u00124\n\u000bscanned_aps\u0018\u0001 \u0003(\u000b2\u001f.GDI.fitness.ScannedAccessPoint\"D\n\u0016SaveWifiNetworkRequest\u0012*\n\u0002ap\u0018\u0001 \u0001(\u000b2\u001e.GDI.fitness.StoredAccessPoint\"*\n\u0017SaveWifiNetworkResponse\u0012\u000f\n\u0007success\u0018\u0001 \u0001(\b\"(\n\u0018RemoveWifiNetworkRequest\u0012\f\n\u0004ssid\u0018\u0001 \u0001(\t\",\n\u0019RemoveWifiNetworkResponse\u0012\u000f\n\u0007success\u0018\u0001 \u0001(\b\"\u001e\n\u001cGetStoredWifiNetworksRequest\"x\n\u001dGetStoredWifiNetworksResponse\u0012#\n\u0006limits\u0018\u0001 \u0001(\u000b2\u0013.GDI.fitness.Limits\u00122\n\nstored_aps\u0018\u0002 \u0003(\u000b2\u001e.GDI.fitness.StoredAccessPoint\"\u001a\n\u0018MobileCarrierInfoRequest\"R\n\u0019MobileCarrierInfoResponse\u0012\u001b\n\u0013mobile_country_code\u0018\u0001 \u0003(\t\u0012\u0018\n\u0010iso_country_code\u0018\u0002 \u0003(\t*F\n\bWifiMode\u0012\u0015\n\u0011WIFI_MODE_UNKNOWN\u0010\u0000\u0012\u0011\n\rWIFI_MODE_STA\u0010\u0001\u0012\u0010\n\fWIFI_MODE_AP\u0010\u0002B3\n\u001acom.garmin.proto.generatedB\u0013GDIWifiSetupUnifiedH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor(), WifiSetup.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_Capabilities_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_Capabilities_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_DeviceAPCredentialsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_DeviceAPCredentialsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_DeviceAPCredentialsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_DeviceAPCredentialsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_GetScannedWifiNetworksRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_GetScannedWifiNetworksRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_GetScannedWifiNetworksResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_GetScannedWifiNetworksResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_GetStoredWifiNetworksRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_GetStoredWifiNetworksRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_GetStoredWifiNetworksResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_GetStoredWifiNetworksResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_MobileCarrierInfoRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_MobileCarrierInfoRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_MobileCarrierInfoResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_MobileCarrierInfoResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_PasswordGeneration_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_PasswordGeneration_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_RemoveWifiNetworkRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_RemoveWifiNetworkRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_RemoveWifiNetworkResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_RemoveWifiNetworkResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_SaveWifiNetworkRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_SaveWifiNetworkRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_SaveWifiNetworkResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_SaveWifiNetworkResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_ScanCompleteNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_ScanCompleteNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_ScanWifiNetworksRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_ScanWifiNetworksRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_ScanWifiNetworksResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_ScanWifiNetworksResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_SwitchToApModeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_SwitchToApModeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_SwitchToApModeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_SwitchToApModeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetupUnified_WifiSetupUnifiedService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetupUnified_WifiSetupUnifiedService_fieldAccessorTable;

    public interface CapabilitiesOrBuilder extends MessageOrBuilder {
        WifiMode getSupportedWifiModes(int i14);

        int getSupportedWifiModesCount();

        List<WifiMode> getSupportedWifiModesList();
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

    public interface ConnectToWifiNetworkNotificationOrBuilder extends MessageOrBuilder {
        String getSsid();

        ByteString getSsidBytes();

        WifiSetup.StatusType getStatus();

        boolean hasSsid();

        boolean hasStatus();
    }

    public interface ConnectToWifiNetworkRequestOrBuilder extends MessageOrBuilder {
        WifiSetup.StoredAccessPoint getAp();

        WifiSetup.StoredAccessPointOrBuilder getApOrBuilder();

        boolean hasAp();
    }

    public interface ConnectToWifiNetworkResponseOrBuilder extends MessageOrBuilder {
        WifiSetup.StatusType getStatus();

        boolean hasStatus();
    }

    public interface DeviceAPCredentialsRequestOrBuilder extends MessageOrBuilder {
    }

    public interface DeviceAPCredentialsResponseOrBuilder extends MessageOrBuilder {
        WifiSetup.StoredAccessPoint getDeviceAccessPoint();

        WifiSetup.StoredAccessPointOrBuilder getDeviceAccessPointOrBuilder();

        boolean hasDeviceAccessPoint();
    }

    public interface GetScannedWifiNetworksRequestOrBuilder extends MessageOrBuilder {
    }

    public interface GetScannedWifiNetworksResponseOrBuilder extends MessageOrBuilder {
        WifiSetup.ScannedAccessPoint getScannedAps(int i14);

        int getScannedApsCount();

        List<WifiSetup.ScannedAccessPoint> getScannedApsList();

        WifiSetup.ScannedAccessPointOrBuilder getScannedApsOrBuilder(int i14);

        List<? extends WifiSetup.ScannedAccessPointOrBuilder> getScannedApsOrBuilderList();
    }

    public interface GetStoredWifiNetworksRequestOrBuilder extends MessageOrBuilder {
    }

    public interface GetStoredWifiNetworksResponseOrBuilder extends MessageOrBuilder {
        WifiSetup.Limits getLimits();

        WifiSetup.LimitsOrBuilder getLimitsOrBuilder();

        WifiSetup.StoredAccessPoint getStoredAps(int i14);

        int getStoredApsCount();

        List<WifiSetup.StoredAccessPoint> getStoredApsList();

        WifiSetup.StoredAccessPointOrBuilder getStoredApsOrBuilder(int i14);

        List<? extends WifiSetup.StoredAccessPointOrBuilder> getStoredApsOrBuilderList();

        boolean hasLimits();
    }

    public interface MobileCarrierInfoRequestOrBuilder extends MessageOrBuilder {
    }

    public interface MobileCarrierInfoResponseOrBuilder extends MessageOrBuilder {
        String getIsoCountryCode(int i14);

        ByteString getIsoCountryCodeBytes(int i14);

        int getIsoCountryCodeCount();

        List<String> getIsoCountryCodeList();

        String getMobileCountryCode(int i14);

        ByteString getMobileCountryCodeBytes(int i14);

        int getMobileCountryCodeCount();

        List<String> getMobileCountryCodeList();
    }

    public interface PasswordGenerationOrBuilder extends MessageOrBuilder {
        String getPasswordSeed();

        ByteString getPasswordSeedBytes();

        PasswordGeneration.PasswordGenerationStrategy getStrategy();

        boolean hasPasswordSeed();

        boolean hasStrategy();
    }

    public interface RemoveWifiNetworkRequestOrBuilder extends MessageOrBuilder {
        String getSsid();

        ByteString getSsidBytes();

        boolean hasSsid();
    }

    public interface RemoveWifiNetworkResponseOrBuilder extends MessageOrBuilder {
        boolean getSuccess();

        boolean hasSuccess();
    }

    public interface SaveWifiNetworkRequestOrBuilder extends MessageOrBuilder {
        WifiSetup.StoredAccessPoint getAp();

        WifiSetup.StoredAccessPointOrBuilder getApOrBuilder();

        boolean hasAp();
    }

    public interface SaveWifiNetworkResponseOrBuilder extends MessageOrBuilder {
        boolean getSuccess();

        boolean hasSuccess();
    }

    public interface ScanCompleteNotificationOrBuilder extends MessageOrBuilder {
        WifiSetup.ScannedAccessPoint getScannedAps(int i14);

        int getScannedApsCount();

        List<WifiSetup.ScannedAccessPoint> getScannedApsList();

        WifiSetup.ScannedAccessPointOrBuilder getScannedApsOrBuilder(int i14);

        List<? extends WifiSetup.ScannedAccessPointOrBuilder> getScannedApsOrBuilderList();

        ScanCompleteNotification.Status getStatus();

        boolean hasStatus();
    }

    public interface ScanWifiNetworksRequestOrBuilder extends MessageOrBuilder {
        WifiSetup.WifiBand getBand();

        boolean hasBand();
    }

    public interface ScanWifiNetworksResponseOrBuilder extends MessageOrBuilder {
        boolean getAck();

        boolean hasAck();
    }

    public interface SwitchToApModeRequestOrBuilder extends MessageOrBuilder {
        int getChannel();

        PasswordGeneration getPasswordGeneration();

        PasswordGenerationOrBuilder getPasswordGenerationOrBuilder();

        WifiSetup.WifiBand getPreferredBand();

        boolean hasChannel();

        boolean hasPasswordGeneration();

        boolean hasPreferredBand();
    }

    public interface SwitchToApModeResponseOrBuilder extends MessageOrBuilder {
        WifiSetup.StoredAccessPoint getDeviceAccessPoint();

        WifiSetup.StoredAccessPointOrBuilder getDeviceAccessPointOrBuilder();

        boolean getSuccess();

        boolean hasDeviceAccessPoint();

        boolean hasSuccess();
    }

    public interface WifiSetupUnifiedServiceOrBuilder extends MessageOrBuilder {
        ScanCompleteNotification getAccessPointScanCompleteNotification();

        ScanCompleteNotificationOrBuilder getAccessPointScanCompleteNotificationOrBuilder();

        ConnectToWifiNetworkNotification getConnectToWifiNetworkNotification();

        ConnectToWifiNetworkNotificationOrBuilder getConnectToWifiNetworkNotificationOrBuilder();

        ConnectToWifiNetworkRequest getConnectToWifiNetworkRequest();

        ConnectToWifiNetworkRequestOrBuilder getConnectToWifiNetworkRequestOrBuilder();

        ConnectToWifiNetworkResponse getConnectToWifiNetworkResponse();

        ConnectToWifiNetworkResponseOrBuilder getConnectToWifiNetworkResponseOrBuilder();

        DeviceAPCredentialsRequest getGetNetworkCredentialsRequest();

        DeviceAPCredentialsRequestOrBuilder getGetNetworkCredentialsRequestOrBuilder();

        DeviceAPCredentialsResponse getGetNetworkCredentialsResponse();

        DeviceAPCredentialsResponseOrBuilder getGetNetworkCredentialsResponseOrBuilder();

        MobileCarrierInfoRequest getMobileCarrierInfoRequest();

        MobileCarrierInfoRequestOrBuilder getMobileCarrierInfoRequestOrBuilder();

        MobileCarrierInfoResponse getMobileCarrierInfoResponse();

        MobileCarrierInfoResponseOrBuilder getMobileCarrierInfoResponseOrBuilder();

        RemoveWifiNetworkRequest getRemoveWifiNetworkRequest();

        RemoveWifiNetworkRequestOrBuilder getRemoveWifiNetworkRequestOrBuilder();

        RemoveWifiNetworkResponse getRemoveWifiNetworkResponse();

        RemoveWifiNetworkResponseOrBuilder getRemoveWifiNetworkResponseOrBuilder();

        SaveWifiNetworkRequest getSaveWifiNetworkRequest();

        SaveWifiNetworkRequestOrBuilder getSaveWifiNetworkRequestOrBuilder();

        SaveWifiNetworkResponse getSaveWifiNetworkResponse();

        SaveWifiNetworkResponseOrBuilder getSaveWifiNetworkResponseOrBuilder();

        ScanWifiNetworksRequest getScanWifiNetworksRequest();

        ScanWifiNetworksRequestOrBuilder getScanWifiNetworksRequestOrBuilder();

        ScanWifiNetworksResponse getScanWifiNetworksResponse();

        ScanWifiNetworksResponseOrBuilder getScanWifiNetworksResponseOrBuilder();

        GetStoredWifiNetworksRequest getStoredWifiNetworksRequest();

        GetStoredWifiNetworksRequestOrBuilder getStoredWifiNetworksRequestOrBuilder();

        GetStoredWifiNetworksResponse getStoredWifiNetworksResponse();

        GetStoredWifiNetworksResponseOrBuilder getStoredWifiNetworksResponseOrBuilder();

        SwitchToApModeRequest getSwitchToApRequest();

        SwitchToApModeRequestOrBuilder getSwitchToApRequestOrBuilder();

        SwitchToApModeResponse getSwitchToApResponse();

        SwitchToApModeResponseOrBuilder getSwitchToApResponseOrBuilder();

        boolean hasAccessPointScanCompleteNotification();

        boolean hasConnectToWifiNetworkNotification();

        boolean hasConnectToWifiNetworkRequest();

        boolean hasConnectToWifiNetworkResponse();

        boolean hasGetNetworkCredentialsRequest();

        boolean hasGetNetworkCredentialsResponse();

        boolean hasMobileCarrierInfoRequest();

        boolean hasMobileCarrierInfoResponse();

        boolean hasRemoveWifiNetworkRequest();

        boolean hasRemoveWifiNetworkResponse();

        boolean hasSaveWifiNetworkRequest();

        boolean hasSaveWifiNetworkResponse();

        boolean hasScanWifiNetworksRequest();

        boolean hasScanWifiNetworksResponse();

        boolean hasStoredWifiNetworksRequest();

        boolean hasStoredWifiNetworksResponse();

        boolean hasSwitchToApRequest();

        boolean hasSwitchToApResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = (Descriptors.Descriptor) a.r(0);
        internal_static_GDI_Proto_WifiSetupUnified_WifiSetupUnifiedService_descriptor = descriptor2;
        internal_static_GDI_Proto_WifiSetupUnified_WifiSetupUnifiedService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ScanWifiNetworksRequest", "ScanWifiNetworksResponse", "AccessPointScanCompleteNotification", "ConnectToWifiNetworkRequest", "ConnectToWifiNetworkResponse", "ConnectToWifiNetworkNotification", "SaveWifiNetworkRequest", "SaveWifiNetworkResponse", "RemoveWifiNetworkRequest", "RemoveWifiNetworkResponse", "StoredWifiNetworksRequest", "StoredWifiNetworksResponse", "MobileCarrierInfoRequest", "MobileCarrierInfoResponse", "SwitchToApRequest", "SwitchToApResponse", "GetNetworkCredentialsRequest", "GetNetworkCredentialsResponse"});
        Descriptors.Descriptor descriptor3 = (Descriptors.Descriptor) a.r(1);
        internal_static_GDI_Proto_WifiSetupUnified_CapabilitiesRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_WifiSetupUnified_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Capabilities"});
        Descriptors.Descriptor descriptor4 = (Descriptors.Descriptor) a.r(2);
        internal_static_GDI_Proto_WifiSetupUnified_Capabilities_descriptor = descriptor4;
        internal_static_GDI_Proto_WifiSetupUnified_Capabilities_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"SupportedWifiModes"});
        Descriptors.Descriptor descriptor5 = (Descriptors.Descriptor) a.r(3);
        internal_static_GDI_Proto_WifiSetupUnified_CapabilitiesResponse_descriptor = descriptor5;
        internal_static_GDI_Proto_WifiSetupUnified_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Capabilities"});
        Descriptors.Descriptor descriptor6 = (Descriptors.Descriptor) a.r(4);
        internal_static_GDI_Proto_WifiSetupUnified_PasswordGeneration_descriptor = descriptor6;
        internal_static_GDI_Proto_WifiSetupUnified_PasswordGeneration_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Strategy", "PasswordSeed"});
        Descriptors.Descriptor descriptor7 = (Descriptors.Descriptor) a.r(5);
        internal_static_GDI_Proto_WifiSetupUnified_SwitchToApModeRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_WifiSetupUnified_SwitchToApModeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"PasswordGeneration", "PreferredBand", "Channel"});
        Descriptors.Descriptor descriptor8 = (Descriptors.Descriptor) a.r(6);
        internal_static_GDI_Proto_WifiSetupUnified_SwitchToApModeResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_WifiSetupUnified_SwitchToApModeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Success", "DeviceAccessPoint"});
        Descriptors.Descriptor descriptor9 = (Descriptors.Descriptor) a.r(7);
        internal_static_GDI_Proto_WifiSetupUnified_DeviceAPCredentialsRequest_descriptor = descriptor9;
        internal_static_GDI_Proto_WifiSetupUnified_DeviceAPCredentialsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[0]);
        Descriptors.Descriptor descriptor10 = (Descriptors.Descriptor) a.r(8);
        internal_static_GDI_Proto_WifiSetupUnified_DeviceAPCredentialsResponse_descriptor = descriptor10;
        internal_static_GDI_Proto_WifiSetupUnified_DeviceAPCredentialsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"DeviceAccessPoint"});
        Descriptors.Descriptor descriptor11 = (Descriptors.Descriptor) a.r(9);
        internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkRequest_descriptor = descriptor11;
        internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Ap"});
        Descriptors.Descriptor descriptor12 = (Descriptors.Descriptor) a.r(10);
        internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkResponse_descriptor = descriptor12;
        internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Status"});
        Descriptors.Descriptor descriptor13 = (Descriptors.Descriptor) a.r(11);
        internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkNotification_descriptor = descriptor13;
        internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Ssid", "Status"});
        Descriptors.Descriptor descriptor14 = (Descriptors.Descriptor) a.r(12);
        internal_static_GDI_Proto_WifiSetupUnified_ScanWifiNetworksRequest_descriptor = descriptor14;
        internal_static_GDI_Proto_WifiSetupUnified_ScanWifiNetworksRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Band"});
        Descriptors.Descriptor descriptor15 = (Descriptors.Descriptor) a.r(13);
        internal_static_GDI_Proto_WifiSetupUnified_ScanWifiNetworksResponse_descriptor = descriptor15;
        internal_static_GDI_Proto_WifiSetupUnified_ScanWifiNetworksResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Ack"});
        Descriptors.Descriptor descriptor16 = (Descriptors.Descriptor) a.r(14);
        internal_static_GDI_Proto_WifiSetupUnified_ScanCompleteNotification_descriptor = descriptor16;
        internal_static_GDI_Proto_WifiSetupUnified_ScanCompleteNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Status", "ScannedAps"});
        Descriptors.Descriptor descriptor17 = (Descriptors.Descriptor) a.r(15);
        internal_static_GDI_Proto_WifiSetupUnified_GetScannedWifiNetworksRequest_descriptor = descriptor17;
        internal_static_GDI_Proto_WifiSetupUnified_GetScannedWifiNetworksRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[0]);
        Descriptors.Descriptor descriptor18 = (Descriptors.Descriptor) a.r(16);
        internal_static_GDI_Proto_WifiSetupUnified_GetScannedWifiNetworksResponse_descriptor = descriptor18;
        internal_static_GDI_Proto_WifiSetupUnified_GetScannedWifiNetworksResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"ScannedAps"});
        Descriptors.Descriptor descriptor19 = (Descriptors.Descriptor) a.r(17);
        internal_static_GDI_Proto_WifiSetupUnified_SaveWifiNetworkRequest_descriptor = descriptor19;
        internal_static_GDI_Proto_WifiSetupUnified_SaveWifiNetworkRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"Ap"});
        Descriptors.Descriptor descriptor20 = (Descriptors.Descriptor) a.r(18);
        internal_static_GDI_Proto_WifiSetupUnified_SaveWifiNetworkResponse_descriptor = descriptor20;
        internal_static_GDI_Proto_WifiSetupUnified_SaveWifiNetworkResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"Success"});
        Descriptors.Descriptor descriptor21 = (Descriptors.Descriptor) a.r(19);
        internal_static_GDI_Proto_WifiSetupUnified_RemoveWifiNetworkRequest_descriptor = descriptor21;
        internal_static_GDI_Proto_WifiSetupUnified_RemoveWifiNetworkRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor21, new String[]{"Ssid"});
        Descriptors.Descriptor descriptor22 = (Descriptors.Descriptor) a.r(20);
        internal_static_GDI_Proto_WifiSetupUnified_RemoveWifiNetworkResponse_descriptor = descriptor22;
        internal_static_GDI_Proto_WifiSetupUnified_RemoveWifiNetworkResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor22, new String[]{"Success"});
        Descriptors.Descriptor descriptor23 = (Descriptors.Descriptor) a.r(21);
        internal_static_GDI_Proto_WifiSetupUnified_GetStoredWifiNetworksRequest_descriptor = descriptor23;
        internal_static_GDI_Proto_WifiSetupUnified_GetStoredWifiNetworksRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor23, new String[0]);
        Descriptors.Descriptor descriptor24 = (Descriptors.Descriptor) a.r(22);
        internal_static_GDI_Proto_WifiSetupUnified_GetStoredWifiNetworksResponse_descriptor = descriptor24;
        internal_static_GDI_Proto_WifiSetupUnified_GetStoredWifiNetworksResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor24, new String[]{"Limits", "StoredAps"});
        Descriptors.Descriptor descriptor25 = (Descriptors.Descriptor) a.r(23);
        internal_static_GDI_Proto_WifiSetupUnified_MobileCarrierInfoRequest_descriptor = descriptor25;
        internal_static_GDI_Proto_WifiSetupUnified_MobileCarrierInfoRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor25, new String[0]);
        Descriptors.Descriptor descriptor26 = (Descriptors.Descriptor) a.r(24);
        internal_static_GDI_Proto_WifiSetupUnified_MobileCarrierInfoResponse_descriptor = descriptor26;
        internal_static_GDI_Proto_WifiSetupUnified_MobileCarrierInfoResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor26, new String[]{"MobileCountryCode", "IsoCountryCode"});
        GDICore.getDescriptor();
        WifiSetup.getDescriptor();
    }

    private GDIWifiSetupUnified() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.featuresRequest);
        extensionRegistryLite.add(CapabilitiesResponse.featuresResponse);
    }

    public static final class DeviceAPCredentialsRequest extends GeneratedMessageV3 implements DeviceAPCredentialsRequestOrBuilder {
        private static final DeviceAPCredentialsRequest DEFAULT_INSTANCE = new DeviceAPCredentialsRequest();

        @Deprecated
        public static final Parser<DeviceAPCredentialsRequest> PARSER = new AbstractParser<DeviceAPCredentialsRequest>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.DeviceAPCredentialsRequest.1
            @Override // com.google.protobuf.Parser
            public DeviceAPCredentialsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DeviceAPCredentialsRequest.newBuilder();
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

        private DeviceAPCredentialsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceAPCredentialsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_DeviceAPCredentialsRequest_descriptor;
        }

        public static Builder newBuilder(DeviceAPCredentialsRequest deviceAPCredentialsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceAPCredentialsRequest);
        }

        public static DeviceAPCredentialsRequest parseDelimitedFrom(InputStream inputStream) {
            return (DeviceAPCredentialsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeviceAPCredentialsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DeviceAPCredentialsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof DeviceAPCredentialsRequest) {
                return getUnknownFields().equals(((DeviceAPCredentialsRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeviceAPCredentialsRequest> getParserForType() {
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
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_DeviceAPCredentialsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceAPCredentialsRequest.class, Builder.class);
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
            return new DeviceAPCredentialsRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceAPCredentialsRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_DeviceAPCredentialsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceAPCredentialsRequest build() {
                DeviceAPCredentialsRequest deviceAPCredentialsRequestBuildPartial = buildPartial();
                if (deviceAPCredentialsRequestBuildPartial.isInitialized()) {
                    return deviceAPCredentialsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceAPCredentialsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceAPCredentialsRequest buildPartial() {
                DeviceAPCredentialsRequest deviceAPCredentialsRequest = new DeviceAPCredentialsRequest(this);
                onBuilt();
                return deviceAPCredentialsRequest;
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
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_DeviceAPCredentialsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_DeviceAPCredentialsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceAPCredentialsRequest.class, Builder.class);
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
            public DeviceAPCredentialsRequest getDefaultInstanceForType() {
                return DeviceAPCredentialsRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DeviceAPCredentialsRequest) {
                    return mergeFrom((DeviceAPCredentialsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeviceAPCredentialsRequest deviceAPCredentialsRequest) {
                if (deviceAPCredentialsRequest == DeviceAPCredentialsRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(deviceAPCredentialsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeviceAPCredentialsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DeviceAPCredentialsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DeviceAPCredentialsRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceAPCredentialsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceAPCredentialsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceAPCredentialsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DeviceAPCredentialsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeviceAPCredentialsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DeviceAPCredentialsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DeviceAPCredentialsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DeviceAPCredentialsRequest parseFrom(InputStream inputStream) {
            return (DeviceAPCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DeviceAPCredentialsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceAPCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceAPCredentialsRequest parseFrom(CodedInputStream codedInputStream) {
            return (DeviceAPCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeviceAPCredentialsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceAPCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetScannedWifiNetworksRequest extends GeneratedMessageV3 implements GetScannedWifiNetworksRequestOrBuilder {
        private static final GetScannedWifiNetworksRequest DEFAULT_INSTANCE = new GetScannedWifiNetworksRequest();

        @Deprecated
        public static final Parser<GetScannedWifiNetworksRequest> PARSER = new AbstractParser<GetScannedWifiNetworksRequest>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.GetScannedWifiNetworksRequest.1
            @Override // com.google.protobuf.Parser
            public GetScannedWifiNetworksRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetScannedWifiNetworksRequest.newBuilder();
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

        private GetScannedWifiNetworksRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetScannedWifiNetworksRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_GetScannedWifiNetworksRequest_descriptor;
        }

        public static Builder newBuilder(GetScannedWifiNetworksRequest getScannedWifiNetworksRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getScannedWifiNetworksRequest);
        }

        public static GetScannedWifiNetworksRequest parseDelimitedFrom(InputStream inputStream) {
            return (GetScannedWifiNetworksRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetScannedWifiNetworksRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetScannedWifiNetworksRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof GetScannedWifiNetworksRequest) {
                return getUnknownFields().equals(((GetScannedWifiNetworksRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetScannedWifiNetworksRequest> getParserForType() {
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
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_GetScannedWifiNetworksRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetScannedWifiNetworksRequest.class, Builder.class);
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
            return new GetScannedWifiNetworksRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetScannedWifiNetworksRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_GetScannedWifiNetworksRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetScannedWifiNetworksRequest build() {
                GetScannedWifiNetworksRequest getScannedWifiNetworksRequestBuildPartial = buildPartial();
                if (getScannedWifiNetworksRequestBuildPartial.isInitialized()) {
                    return getScannedWifiNetworksRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getScannedWifiNetworksRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetScannedWifiNetworksRequest buildPartial() {
                GetScannedWifiNetworksRequest getScannedWifiNetworksRequest = new GetScannedWifiNetworksRequest(this);
                onBuilt();
                return getScannedWifiNetworksRequest;
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
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_GetScannedWifiNetworksRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_GetScannedWifiNetworksRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetScannedWifiNetworksRequest.class, Builder.class);
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
            public GetScannedWifiNetworksRequest getDefaultInstanceForType() {
                return GetScannedWifiNetworksRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetScannedWifiNetworksRequest) {
                    return mergeFrom((GetScannedWifiNetworksRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GetScannedWifiNetworksRequest getScannedWifiNetworksRequest) {
                if (getScannedWifiNetworksRequest == GetScannedWifiNetworksRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(getScannedWifiNetworksRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetScannedWifiNetworksRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ GetScannedWifiNetworksRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private GetScannedWifiNetworksRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetScannedWifiNetworksRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetScannedWifiNetworksRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetScannedWifiNetworksRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetScannedWifiNetworksRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetScannedWifiNetworksRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetScannedWifiNetworksRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetScannedWifiNetworksRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetScannedWifiNetworksRequest parseFrom(InputStream inputStream) {
            return (GetScannedWifiNetworksRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetScannedWifiNetworksRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetScannedWifiNetworksRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetScannedWifiNetworksRequest parseFrom(CodedInputStream codedInputStream) {
            return (GetScannedWifiNetworksRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetScannedWifiNetworksRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetScannedWifiNetworksRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetStoredWifiNetworksRequest extends GeneratedMessageV3 implements GetStoredWifiNetworksRequestOrBuilder {
        private static final GetStoredWifiNetworksRequest DEFAULT_INSTANCE = new GetStoredWifiNetworksRequest();

        @Deprecated
        public static final Parser<GetStoredWifiNetworksRequest> PARSER = new AbstractParser<GetStoredWifiNetworksRequest>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.GetStoredWifiNetworksRequest.1
            @Override // com.google.protobuf.Parser
            public GetStoredWifiNetworksRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetStoredWifiNetworksRequest.newBuilder();
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

        private GetStoredWifiNetworksRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetStoredWifiNetworksRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_GetStoredWifiNetworksRequest_descriptor;
        }

        public static Builder newBuilder(GetStoredWifiNetworksRequest getStoredWifiNetworksRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getStoredWifiNetworksRequest);
        }

        public static GetStoredWifiNetworksRequest parseDelimitedFrom(InputStream inputStream) {
            return (GetStoredWifiNetworksRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetStoredWifiNetworksRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetStoredWifiNetworksRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof GetStoredWifiNetworksRequest) {
                return getUnknownFields().equals(((GetStoredWifiNetworksRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetStoredWifiNetworksRequest> getParserForType() {
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
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_GetStoredWifiNetworksRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetStoredWifiNetworksRequest.class, Builder.class);
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
            return new GetStoredWifiNetworksRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetStoredWifiNetworksRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_GetStoredWifiNetworksRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetStoredWifiNetworksRequest build() {
                GetStoredWifiNetworksRequest getStoredWifiNetworksRequestBuildPartial = buildPartial();
                if (getStoredWifiNetworksRequestBuildPartial.isInitialized()) {
                    return getStoredWifiNetworksRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getStoredWifiNetworksRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetStoredWifiNetworksRequest buildPartial() {
                GetStoredWifiNetworksRequest getStoredWifiNetworksRequest = new GetStoredWifiNetworksRequest(this);
                onBuilt();
                return getStoredWifiNetworksRequest;
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
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_GetStoredWifiNetworksRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_GetStoredWifiNetworksRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetStoredWifiNetworksRequest.class, Builder.class);
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
            public GetStoredWifiNetworksRequest getDefaultInstanceForType() {
                return GetStoredWifiNetworksRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetStoredWifiNetworksRequest) {
                    return mergeFrom((GetStoredWifiNetworksRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GetStoredWifiNetworksRequest getStoredWifiNetworksRequest) {
                if (getStoredWifiNetworksRequest == GetStoredWifiNetworksRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(getStoredWifiNetworksRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetStoredWifiNetworksRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ GetStoredWifiNetworksRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private GetStoredWifiNetworksRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetStoredWifiNetworksRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetStoredWifiNetworksRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetStoredWifiNetworksRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetStoredWifiNetworksRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetStoredWifiNetworksRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetStoredWifiNetworksRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetStoredWifiNetworksRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetStoredWifiNetworksRequest parseFrom(InputStream inputStream) {
            return (GetStoredWifiNetworksRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetStoredWifiNetworksRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetStoredWifiNetworksRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetStoredWifiNetworksRequest parseFrom(CodedInputStream codedInputStream) {
            return (GetStoredWifiNetworksRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetStoredWifiNetworksRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetStoredWifiNetworksRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class MobileCarrierInfoRequest extends GeneratedMessageV3 implements MobileCarrierInfoRequestOrBuilder {
        private static final MobileCarrierInfoRequest DEFAULT_INSTANCE = new MobileCarrierInfoRequest();

        @Deprecated
        public static final Parser<MobileCarrierInfoRequest> PARSER = new AbstractParser<MobileCarrierInfoRequest>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.MobileCarrierInfoRequest.1
            @Override // com.google.protobuf.Parser
            public MobileCarrierInfoRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = MobileCarrierInfoRequest.newBuilder();
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

        private MobileCarrierInfoRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MobileCarrierInfoRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_MobileCarrierInfoRequest_descriptor;
        }

        public static Builder newBuilder(MobileCarrierInfoRequest mobileCarrierInfoRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(mobileCarrierInfoRequest);
        }

        public static MobileCarrierInfoRequest parseDelimitedFrom(InputStream inputStream) {
            return (MobileCarrierInfoRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MobileCarrierInfoRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MobileCarrierInfoRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof MobileCarrierInfoRequest) {
                return getUnknownFields().equals(((MobileCarrierInfoRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MobileCarrierInfoRequest> getParserForType() {
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
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_MobileCarrierInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(MobileCarrierInfoRequest.class, Builder.class);
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
            return new MobileCarrierInfoRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MobileCarrierInfoRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_MobileCarrierInfoRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MobileCarrierInfoRequest build() {
                MobileCarrierInfoRequest mobileCarrierInfoRequestBuildPartial = buildPartial();
                if (mobileCarrierInfoRequestBuildPartial.isInitialized()) {
                    return mobileCarrierInfoRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) mobileCarrierInfoRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MobileCarrierInfoRequest buildPartial() {
                MobileCarrierInfoRequest mobileCarrierInfoRequest = new MobileCarrierInfoRequest(this);
                onBuilt();
                return mobileCarrierInfoRequest;
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
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_MobileCarrierInfoRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_MobileCarrierInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(MobileCarrierInfoRequest.class, Builder.class);
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
            public MobileCarrierInfoRequest getDefaultInstanceForType() {
                return MobileCarrierInfoRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MobileCarrierInfoRequest) {
                    return mergeFrom((MobileCarrierInfoRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MobileCarrierInfoRequest mobileCarrierInfoRequest) {
                if (mobileCarrierInfoRequest == MobileCarrierInfoRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(mobileCarrierInfoRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MobileCarrierInfoRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ MobileCarrierInfoRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private MobileCarrierInfoRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MobileCarrierInfoRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MobileCarrierInfoRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MobileCarrierInfoRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static MobileCarrierInfoRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MobileCarrierInfoRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static MobileCarrierInfoRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static MobileCarrierInfoRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MobileCarrierInfoRequest parseFrom(InputStream inputStream) {
            return (MobileCarrierInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static MobileCarrierInfoRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MobileCarrierInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MobileCarrierInfoRequest parseFrom(CodedInputStream codedInputStream) {
            return (MobileCarrierInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MobileCarrierInfoRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MobileCarrierInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RemoveWifiNetworkResponse extends GeneratedMessageV3 implements RemoveWifiNetworkResponseOrBuilder {
        private static final RemoveWifiNetworkResponse DEFAULT_INSTANCE = new RemoveWifiNetworkResponse();

        @Deprecated
        public static final Parser<RemoveWifiNetworkResponse> PARSER = new AbstractParser<RemoveWifiNetworkResponse>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.RemoveWifiNetworkResponse.1
            @Override // com.google.protobuf.Parser
            public RemoveWifiNetworkResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RemoveWifiNetworkResponse.newBuilder();
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

        private RemoveWifiNetworkResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.success_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RemoveWifiNetworkResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_RemoveWifiNetworkResponse_descriptor;
        }

        public static Builder newBuilder(RemoveWifiNetworkResponse removeWifiNetworkResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(removeWifiNetworkResponse);
        }

        public static RemoveWifiNetworkResponse parseDelimitedFrom(InputStream inputStream) {
            return (RemoveWifiNetworkResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RemoveWifiNetworkResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RemoveWifiNetworkResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RemoveWifiNetworkResponse)) {
                return super.equals(obj);
            }
            RemoveWifiNetworkResponse removeWifiNetworkResponse = (RemoveWifiNetworkResponse) obj;
            if (hasSuccess() != removeWifiNetworkResponse.hasSuccess()) {
                return false;
            }
            return (!hasSuccess() || getSuccess() == removeWifiNetworkResponse.getSuccess()) && getUnknownFields().equals(removeWifiNetworkResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RemoveWifiNetworkResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.RemoveWifiNetworkResponseOrBuilder
        public boolean getSuccess() {
            return this.success_;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.RemoveWifiNetworkResponseOrBuilder
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
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_RemoveWifiNetworkResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RemoveWifiNetworkResponse.class, Builder.class);
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
            return new RemoveWifiNetworkResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RemoveWifiNetworkResponseOrBuilder {
            private int bitField0_;
            private boolean success_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(RemoveWifiNetworkResponse removeWifiNetworkResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    removeWifiNetworkResponse.success_ = this.success_;
                } else {
                    i14 = 0;
                }
                removeWifiNetworkResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_RemoveWifiNetworkResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RemoveWifiNetworkResponse build() {
                RemoveWifiNetworkResponse removeWifiNetworkResponseBuildPartial = buildPartial();
                if (removeWifiNetworkResponseBuildPartial.isInitialized()) {
                    return removeWifiNetworkResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) removeWifiNetworkResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RemoveWifiNetworkResponse buildPartial() {
                RemoveWifiNetworkResponse removeWifiNetworkResponse = new RemoveWifiNetworkResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(removeWifiNetworkResponse);
                }
                onBuilt();
                return removeWifiNetworkResponse;
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
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_RemoveWifiNetworkResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.RemoveWifiNetworkResponseOrBuilder
            public boolean getSuccess() {
                return this.success_;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.RemoveWifiNetworkResponseOrBuilder
            public boolean hasSuccess() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_RemoveWifiNetworkResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RemoveWifiNetworkResponse.class, Builder.class);
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
            public RemoveWifiNetworkResponse getDefaultInstanceForType() {
                return RemoveWifiNetworkResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RemoveWifiNetworkResponse) {
                    return mergeFrom((RemoveWifiNetworkResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RemoveWifiNetworkResponse removeWifiNetworkResponse) {
                if (removeWifiNetworkResponse == RemoveWifiNetworkResponse.getDefaultInstance()) {
                    return this;
                }
                if (removeWifiNetworkResponse.hasSuccess()) {
                    setSuccess(removeWifiNetworkResponse.getSuccess());
                }
                mergeUnknownFields(removeWifiNetworkResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RemoveWifiNetworkResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static RemoveWifiNetworkResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemoveWifiNetworkResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RemoveWifiNetworkResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ RemoveWifiNetworkResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static RemoveWifiNetworkResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private RemoveWifiNetworkResponse() {
            this.success_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RemoveWifiNetworkResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RemoveWifiNetworkResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RemoveWifiNetworkResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static RemoveWifiNetworkResponse parseFrom(InputStream inputStream) {
            return (RemoveWifiNetworkResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RemoveWifiNetworkResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemoveWifiNetworkResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RemoveWifiNetworkResponse parseFrom(CodedInputStream codedInputStream) {
            return (RemoveWifiNetworkResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RemoveWifiNetworkResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemoveWifiNetworkResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SaveWifiNetworkResponse extends GeneratedMessageV3 implements SaveWifiNetworkResponseOrBuilder {
        private static final SaveWifiNetworkResponse DEFAULT_INSTANCE = new SaveWifiNetworkResponse();

        @Deprecated
        public static final Parser<SaveWifiNetworkResponse> PARSER = new AbstractParser<SaveWifiNetworkResponse>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.SaveWifiNetworkResponse.1
            @Override // com.google.protobuf.Parser
            public SaveWifiNetworkResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SaveWifiNetworkResponse.newBuilder();
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

        private SaveWifiNetworkResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.success_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SaveWifiNetworkResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_SaveWifiNetworkResponse_descriptor;
        }

        public static Builder newBuilder(SaveWifiNetworkResponse saveWifiNetworkResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(saveWifiNetworkResponse);
        }

        public static SaveWifiNetworkResponse parseDelimitedFrom(InputStream inputStream) {
            return (SaveWifiNetworkResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SaveWifiNetworkResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SaveWifiNetworkResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SaveWifiNetworkResponse)) {
                return super.equals(obj);
            }
            SaveWifiNetworkResponse saveWifiNetworkResponse = (SaveWifiNetworkResponse) obj;
            if (hasSuccess() != saveWifiNetworkResponse.hasSuccess()) {
                return false;
            }
            return (!hasSuccess() || getSuccess() == saveWifiNetworkResponse.getSuccess()) && getUnknownFields().equals(saveWifiNetworkResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SaveWifiNetworkResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SaveWifiNetworkResponseOrBuilder
        public boolean getSuccess() {
            return this.success_;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SaveWifiNetworkResponseOrBuilder
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
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_SaveWifiNetworkResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SaveWifiNetworkResponse.class, Builder.class);
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
            return new SaveWifiNetworkResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SaveWifiNetworkResponseOrBuilder {
            private int bitField0_;
            private boolean success_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(SaveWifiNetworkResponse saveWifiNetworkResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    saveWifiNetworkResponse.success_ = this.success_;
                } else {
                    i14 = 0;
                }
                saveWifiNetworkResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_SaveWifiNetworkResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SaveWifiNetworkResponse build() {
                SaveWifiNetworkResponse saveWifiNetworkResponseBuildPartial = buildPartial();
                if (saveWifiNetworkResponseBuildPartial.isInitialized()) {
                    return saveWifiNetworkResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) saveWifiNetworkResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SaveWifiNetworkResponse buildPartial() {
                SaveWifiNetworkResponse saveWifiNetworkResponse = new SaveWifiNetworkResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(saveWifiNetworkResponse);
                }
                onBuilt();
                return saveWifiNetworkResponse;
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
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_SaveWifiNetworkResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SaveWifiNetworkResponseOrBuilder
            public boolean getSuccess() {
                return this.success_;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SaveWifiNetworkResponseOrBuilder
            public boolean hasSuccess() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_SaveWifiNetworkResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SaveWifiNetworkResponse.class, Builder.class);
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
            public SaveWifiNetworkResponse getDefaultInstanceForType() {
                return SaveWifiNetworkResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SaveWifiNetworkResponse) {
                    return mergeFrom((SaveWifiNetworkResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SaveWifiNetworkResponse saveWifiNetworkResponse) {
                if (saveWifiNetworkResponse == SaveWifiNetworkResponse.getDefaultInstance()) {
                    return this;
                }
                if (saveWifiNetworkResponse.hasSuccess()) {
                    setSuccess(saveWifiNetworkResponse.getSuccess());
                }
                mergeUnknownFields(saveWifiNetworkResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SaveWifiNetworkResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SaveWifiNetworkResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SaveWifiNetworkResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SaveWifiNetworkResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SaveWifiNetworkResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SaveWifiNetworkResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SaveWifiNetworkResponse() {
            this.success_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SaveWifiNetworkResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SaveWifiNetworkResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SaveWifiNetworkResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SaveWifiNetworkResponse parseFrom(InputStream inputStream) {
            return (SaveWifiNetworkResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SaveWifiNetworkResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SaveWifiNetworkResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SaveWifiNetworkResponse parseFrom(CodedInputStream codedInputStream) {
            return (SaveWifiNetworkResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SaveWifiNetworkResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SaveWifiNetworkResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ScanWifiNetworksResponse extends GeneratedMessageV3 implements ScanWifiNetworksResponseOrBuilder {
        public static final int ACK_FIELD_NUMBER = 1;
        private static final ScanWifiNetworksResponse DEFAULT_INSTANCE = new ScanWifiNetworksResponse();

        @Deprecated
        public static final Parser<ScanWifiNetworksResponse> PARSER = new AbstractParser<ScanWifiNetworksResponse>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.ScanWifiNetworksResponse.1
            @Override // com.google.protobuf.Parser
            public ScanWifiNetworksResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ScanWifiNetworksResponse.newBuilder();
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
        private boolean ack_;
        private int bitField0_;
        private byte memoizedIsInitialized;

        private ScanWifiNetworksResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.ack_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ScanWifiNetworksResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ScanWifiNetworksResponse_descriptor;
        }

        public static Builder newBuilder(ScanWifiNetworksResponse scanWifiNetworksResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(scanWifiNetworksResponse);
        }

        public static ScanWifiNetworksResponse parseDelimitedFrom(InputStream inputStream) {
            return (ScanWifiNetworksResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ScanWifiNetworksResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ScanWifiNetworksResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ScanWifiNetworksResponse)) {
                return super.equals(obj);
            }
            ScanWifiNetworksResponse scanWifiNetworksResponse = (ScanWifiNetworksResponse) obj;
            if (hasAck() != scanWifiNetworksResponse.hasAck()) {
                return false;
            }
            return (!hasAck() || getAck() == scanWifiNetworksResponse.getAck()) && getUnknownFields().equals(scanWifiNetworksResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ScanWifiNetworksResponseOrBuilder
        public boolean getAck() {
            return this.ack_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ScanWifiNetworksResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.ack_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ScanWifiNetworksResponseOrBuilder
        public boolean hasAck() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAck()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getAck());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ScanWifiNetworksResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ScanWifiNetworksResponse.class, Builder.class);
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
            return new ScanWifiNetworksResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.ack_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ScanWifiNetworksResponseOrBuilder {
            private boolean ack_;
            private int bitField0_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(ScanWifiNetworksResponse scanWifiNetworksResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    scanWifiNetworksResponse.ack_ = this.ack_;
                } else {
                    i14 = 0;
                }
                scanWifiNetworksResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ScanWifiNetworksResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ScanWifiNetworksResponse build() {
                ScanWifiNetworksResponse scanWifiNetworksResponseBuildPartial = buildPartial();
                if (scanWifiNetworksResponseBuildPartial.isInitialized()) {
                    return scanWifiNetworksResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) scanWifiNetworksResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ScanWifiNetworksResponse buildPartial() {
                ScanWifiNetworksResponse scanWifiNetworksResponse = new ScanWifiNetworksResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(scanWifiNetworksResponse);
                }
                onBuilt();
                return scanWifiNetworksResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.ack_ = false;
                return this;
            }

            public Builder clearAck() {
                this.bitField0_ &= -2;
                this.ack_ = false;
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

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ScanWifiNetworksResponseOrBuilder
            public boolean getAck() {
                return this.ack_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ScanWifiNetworksResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ScanWifiNetworksResponseOrBuilder
            public boolean hasAck() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ScanWifiNetworksResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ScanWifiNetworksResponse.class, Builder.class);
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
                                    this.ack_ = codedInputStream.readBool();
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

            public Builder setAck(boolean z14) {
                this.ack_ = z14;
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
            public ScanWifiNetworksResponse getDefaultInstanceForType() {
                return ScanWifiNetworksResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ScanWifiNetworksResponse) {
                    return mergeFrom((ScanWifiNetworksResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ScanWifiNetworksResponse scanWifiNetworksResponse) {
                if (scanWifiNetworksResponse == ScanWifiNetworksResponse.getDefaultInstance()) {
                    return this;
                }
                if (scanWifiNetworksResponse.hasAck()) {
                    setAck(scanWifiNetworksResponse.getAck());
                }
                mergeUnknownFields(scanWifiNetworksResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ScanWifiNetworksResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ScanWifiNetworksResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ScanWifiNetworksResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ScanWifiNetworksResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ScanWifiNetworksResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ScanWifiNetworksResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ScanWifiNetworksResponse() {
            this.ack_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ScanWifiNetworksResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ScanWifiNetworksResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ScanWifiNetworksResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ScanWifiNetworksResponse parseFrom(InputStream inputStream) {
            return (ScanWifiNetworksResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ScanWifiNetworksResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ScanWifiNetworksResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ScanWifiNetworksResponse parseFrom(CodedInputStream codedInputStream) {
            return (ScanWifiNetworksResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ScanWifiNetworksResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ScanWifiNetworksResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Capabilities extends GeneratedMessageV3 implements CapabilitiesOrBuilder {
        public static final int SUPPORTED_WIFI_MODES_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<Integer> supportedWifiModes_;
        private static final Internal.ListAdapter.Converter<Integer, WifiMode> supportedWifiModes_converter_ = new Internal.ListAdapter.Converter<Integer, WifiMode>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.Capabilities.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public WifiMode convert(Integer num) {
                WifiMode wifiModeForNumber = WifiMode.forNumber(num.intValue());
                return wifiModeForNumber == null ? WifiMode.WIFI_MODE_UNKNOWN : wifiModeForNumber;
            }
        };
        private static final Capabilities DEFAULT_INSTANCE = new Capabilities();

        @Deprecated
        public static final Parser<Capabilities> PARSER = new AbstractParser<Capabilities>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.Capabilities.2
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
            this.supportedWifiModes_ = Collections.EMPTY_LIST;
        }

        public static Capabilities getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_Capabilities_descriptor;
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
            return this.supportedWifiModes_.equals(capabilities.supportedWifiModes_) && getUnknownFields().equals(capabilities.getUnknownFields());
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
                int size = this.supportedWifiModes_.size();
                List<Integer> list = this.supportedWifiModes_;
                if (i15 >= size) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list.size() + iA;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.CapabilitiesOrBuilder
        public WifiMode getSupportedWifiModes(int i14) {
            return supportedWifiModes_converter_.convert(this.supportedWifiModes_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.CapabilitiesOrBuilder
        public int getSupportedWifiModesCount() {
            return this.supportedWifiModes_.size();
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.CapabilitiesOrBuilder
        public List<WifiMode> getSupportedWifiModesList() {
            return new Internal.ListAdapter(this.supportedWifiModes_, supportedWifiModes_converter_);
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getSupportedWifiModesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.supportedWifiModes_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_Capabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(Capabilities.class, Builder.class);
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
            while (iF < this.supportedWifiModes_.size()) {
                iF = f3.f(this.supportedWifiModes_.get(iF), codedOutputStream, 1, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesOrBuilder {
            private int bitField0_;
            private List<Integer> supportedWifiModes_;

            private Builder() {
                this.supportedWifiModes_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(Capabilities capabilities) {
            }

            private void buildPartialRepeatedFields(Capabilities capabilities) {
                if ((this.bitField0_ & 1) != 0) {
                    this.supportedWifiModes_ = Collections.unmodifiableList(this.supportedWifiModes_);
                    this.bitField0_ &= -2;
                }
                capabilities.supportedWifiModes_ = this.supportedWifiModes_;
            }

            private void ensureSupportedWifiModesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.supportedWifiModes_ = new ArrayList(this.supportedWifiModes_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_Capabilities_descriptor;
            }

            public Builder addAllSupportedWifiModes(Iterable<? extends WifiMode> iterable) {
                ensureSupportedWifiModesIsMutable();
                Iterator<? extends WifiMode> it = iterable.iterator();
                while (it.hasNext()) {
                    this.supportedWifiModes_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSupportedWifiModes(WifiMode wifiMode) {
                wifiMode.getClass();
                ensureSupportedWifiModesIsMutable();
                this.supportedWifiModes_.add(Integer.valueOf(wifiMode.getNumber()));
                onChanged();
                return this;
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
                this.supportedWifiModes_ = Collections.EMPTY_LIST;
                this.bitField0_ = 0;
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

            public Builder clearSupportedWifiModes() {
                this.supportedWifiModes_ = Collections.EMPTY_LIST;
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
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_Capabilities_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.CapabilitiesOrBuilder
            public WifiMode getSupportedWifiModes(int i14) {
                return (WifiMode) Capabilities.supportedWifiModes_converter_.convert(this.supportedWifiModes_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.CapabilitiesOrBuilder
            public int getSupportedWifiModesCount() {
                return this.supportedWifiModes_.size();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.CapabilitiesOrBuilder
            public List<WifiMode> getSupportedWifiModesList() {
                return new Internal.ListAdapter(this.supportedWifiModes_, Capabilities.supportedWifiModes_converter_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_Capabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(Capabilities.class, Builder.class);
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
                                    if (WifiMode.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        ensureSupportedWifiModesIsMutable();
                                        this.supportedWifiModes_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (WifiMode.forNumber(i15) == null) {
                                            mergeUnknownVarintField(1, i15);
                                        } else {
                                            ensureSupportedWifiModesIsMutable();
                                            this.supportedWifiModes_.add(Integer.valueOf(i15));
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSupportedWifiModes(int i14, WifiMode wifiMode) {
                wifiMode.getClass();
                ensureSupportedWifiModesIsMutable();
                this.supportedWifiModes_.set(i14, Integer.valueOf(wifiMode.getNumber()));
                onChanged();
                return this;
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
                this.supportedWifiModes_ = Collections.EMPTY_LIST;
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
                if (!capabilities.supportedWifiModes_.isEmpty()) {
                    if (this.supportedWifiModes_.isEmpty()) {
                        this.supportedWifiModes_ = capabilities.supportedWifiModes_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureSupportedWifiModesIsMutable();
                        this.supportedWifiModes_.addAll(capabilities.supportedWifiModes_);
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
        public static final int FEATURES_REQUEST_FIELD_NUMBER = 42;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Capabilities capabilities_;
        private byte memoizedIsInitialized;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.CapabilitiesRequest.1
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
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_CapabilitiesRequest_descriptor;
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

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.CapabilitiesRequestOrBuilder
        public Capabilities getCapabilities() {
            Capabilities capabilities = this.capabilities_;
            return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.CapabilitiesRequestOrBuilder
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

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.CapabilitiesRequestOrBuilder
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
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_CapabilitiesRequest_descriptor;
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

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.CapabilitiesRequestOrBuilder
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

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.CapabilitiesRequestOrBuilder
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
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_CapabilitiesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.CapabilitiesRequestOrBuilder
            public boolean hasCapabilities() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
        public static final int FEATURES_RESPONSE_FIELD_NUMBER = 42;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Capabilities capabilities_;
        private byte memoizedIsInitialized;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.CapabilitiesResponse.1
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
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_CapabilitiesResponse_descriptor;
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

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.CapabilitiesResponseOrBuilder
        public Capabilities getCapabilities() {
            Capabilities capabilities = this.capabilities_;
            return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.CapabilitiesResponseOrBuilder
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

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.CapabilitiesResponseOrBuilder
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
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_CapabilitiesResponse_descriptor;
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

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.CapabilitiesResponseOrBuilder
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

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.CapabilitiesResponseOrBuilder
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
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.CapabilitiesResponseOrBuilder
            public boolean hasCapabilities() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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

    public static final class ConnectToWifiNetworkNotification extends GeneratedMessageV3 implements ConnectToWifiNetworkNotificationOrBuilder {
        private static final ConnectToWifiNetworkNotification DEFAULT_INSTANCE = new ConnectToWifiNetworkNotification();

        @Deprecated
        public static final Parser<ConnectToWifiNetworkNotification> PARSER = new AbstractParser<ConnectToWifiNetworkNotification>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkNotification.1
            @Override // com.google.protobuf.Parser
            public ConnectToWifiNetworkNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectToWifiNetworkNotification.newBuilder();
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
        public static final int SSID_FIELD_NUMBER = 1;
        public static final int STATUS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object ssid_;
        private int status_;

        private ConnectToWifiNetworkNotification() {
            this.ssid_ = "";
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.ssid_ = "";
            this.status_ = 0;
        }

        public static ConnectToWifiNetworkNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkNotification_descriptor;
        }

        public static Builder newBuilder(ConnectToWifiNetworkNotification connectToWifiNetworkNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectToWifiNetworkNotification);
        }

        public static ConnectToWifiNetworkNotification parseDelimitedFrom(InputStream inputStream) {
            return (ConnectToWifiNetworkNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectToWifiNetworkNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectToWifiNetworkNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectToWifiNetworkNotification)) {
                return super.equals(obj);
            }
            ConnectToWifiNetworkNotification connectToWifiNetworkNotification = (ConnectToWifiNetworkNotification) obj;
            if (hasSsid() != connectToWifiNetworkNotification.hasSsid()) {
                return false;
            }
            if ((!hasSsid() || getSsid().equals(connectToWifiNetworkNotification.getSsid())) && hasStatus() == connectToWifiNetworkNotification.hasStatus()) {
                return (!hasStatus() || this.status_ == connectToWifiNetworkNotification.status_) && getUnknownFields().equals(connectToWifiNetworkNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectToWifiNetworkNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.ssid_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.status_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkNotificationOrBuilder
        public String getSsid() {
            Object obj = this.ssid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.ssid_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkNotificationOrBuilder
        public ByteString getSsidBytes() {
            Object obj = this.ssid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ssid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkNotificationOrBuilder
        public WifiSetup.StatusType getStatus() {
            WifiSetup.StatusType statusTypeForNumber = WifiSetup.StatusType.forNumber(this.status_);
            return statusTypeForNumber == null ? WifiSetup.StatusType.Unknown : statusTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkNotificationOrBuilder
        public boolean hasSsid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkNotificationOrBuilder
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
            if (hasSsid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSsid().hashCode();
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
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectToWifiNetworkNotification.class, Builder.class);
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
            return new ConnectToWifiNetworkNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.ssid_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectToWifiNetworkNotificationOrBuilder {
            private int bitField0_;
            private Object ssid_;
            private int status_;

            private Builder() {
                this.ssid_ = "";
                this.status_ = 0;
            }

            private void buildPartial0(ConnectToWifiNetworkNotification connectToWifiNetworkNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    connectToWifiNetworkNotification.ssid_ = this.ssid_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    connectToWifiNetworkNotification.status_ = this.status_;
                    i14 |= 2;
                }
                connectToWifiNetworkNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectToWifiNetworkNotification build() {
                ConnectToWifiNetworkNotification connectToWifiNetworkNotificationBuildPartial = buildPartial();
                if (connectToWifiNetworkNotificationBuildPartial.isInitialized()) {
                    return connectToWifiNetworkNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectToWifiNetworkNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectToWifiNetworkNotification buildPartial() {
                ConnectToWifiNetworkNotification connectToWifiNetworkNotification = new ConnectToWifiNetworkNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectToWifiNetworkNotification);
                }
                onBuilt();
                return connectToWifiNetworkNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.ssid_ = "";
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

            public Builder clearSsid() {
                this.ssid_ = ConnectToWifiNetworkNotification.getDefaultInstance().getSsid();
                this.bitField0_ &= -2;
                onChanged();
                return this;
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
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkNotificationOrBuilder
            public String getSsid() {
                Object obj = this.ssid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.ssid_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkNotificationOrBuilder
            public ByteString getSsidBytes() {
                Object obj = this.ssid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ssid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkNotificationOrBuilder
            public WifiSetup.StatusType getStatus() {
                WifiSetup.StatusType statusTypeForNumber = WifiSetup.StatusType.forNumber(this.status_);
                return statusTypeForNumber == null ? WifiSetup.StatusType.Unknown : statusTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkNotificationOrBuilder
            public boolean hasSsid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkNotificationOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectToWifiNetworkNotification.class, Builder.class);
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
                                    this.ssid_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (WifiSetup.StatusType.forNumber(i14) == null) {
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSsid(String str) {
                str.getClass();
                this.ssid_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSsidBytes(ByteString byteString) {
                byteString.getClass();
                this.ssid_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStatus(WifiSetup.StatusType statusType) {
                statusType.getClass();
                this.bitField0_ |= 2;
                this.status_ = statusType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConnectToWifiNetworkNotification getDefaultInstanceForType() {
                return ConnectToWifiNetworkNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.ssid_ = "";
                this.status_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectToWifiNetworkNotification) {
                    return mergeFrom((ConnectToWifiNetworkNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectToWifiNetworkNotification connectToWifiNetworkNotification) {
                if (connectToWifiNetworkNotification == ConnectToWifiNetworkNotification.getDefaultInstance()) {
                    return this;
                }
                if (connectToWifiNetworkNotification.hasSsid()) {
                    this.ssid_ = connectToWifiNetworkNotification.ssid_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (connectToWifiNetworkNotification.hasStatus()) {
                    setStatus(connectToWifiNetworkNotification.getStatus());
                }
                mergeUnknownFields(connectToWifiNetworkNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectToWifiNetworkNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConnectToWifiNetworkNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectToWifiNetworkNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectToWifiNetworkNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectToWifiNetworkNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectToWifiNetworkNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectToWifiNetworkNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectToWifiNetworkNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectToWifiNetworkNotification parseFrom(InputStream inputStream) {
            return (ConnectToWifiNetworkNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectToWifiNetworkNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectToWifiNetworkNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private ConnectToWifiNetworkNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.ssid_ = "";
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectToWifiNetworkNotification parseFrom(CodedInputStream codedInputStream) {
            return (ConnectToWifiNetworkNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectToWifiNetworkNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectToWifiNetworkNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ ConnectToWifiNetworkNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class ConnectToWifiNetworkRequest extends GeneratedMessageV3 implements ConnectToWifiNetworkRequestOrBuilder {
        public static final int AP_FIELD_NUMBER = 1;
        private static final ConnectToWifiNetworkRequest DEFAULT_INSTANCE = new ConnectToWifiNetworkRequest();

        @Deprecated
        public static final Parser<ConnectToWifiNetworkRequest> PARSER = new AbstractParser<ConnectToWifiNetworkRequest>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkRequest.1
            @Override // com.google.protobuf.Parser
            public ConnectToWifiNetworkRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectToWifiNetworkRequest.newBuilder();
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
        private WifiSetup.StoredAccessPoint ap_;
        private int bitField0_;
        private byte memoizedIsInitialized;

        private ConnectToWifiNetworkRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectToWifiNetworkRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkRequest_descriptor;
        }

        public static Builder newBuilder(ConnectToWifiNetworkRequest connectToWifiNetworkRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectToWifiNetworkRequest);
        }

        public static ConnectToWifiNetworkRequest parseDelimitedFrom(InputStream inputStream) {
            return (ConnectToWifiNetworkRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectToWifiNetworkRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectToWifiNetworkRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectToWifiNetworkRequest)) {
                return super.equals(obj);
            }
            ConnectToWifiNetworkRequest connectToWifiNetworkRequest = (ConnectToWifiNetworkRequest) obj;
            if (hasAp() != connectToWifiNetworkRequest.hasAp()) {
                return false;
            }
            return (!hasAp() || getAp().equals(connectToWifiNetworkRequest.getAp())) && getUnknownFields().equals(connectToWifiNetworkRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkRequestOrBuilder
        public WifiSetup.StoredAccessPoint getAp() {
            WifiSetup.StoredAccessPoint storedAccessPoint = this.ap_;
            return storedAccessPoint == null ? WifiSetup.StoredAccessPoint.getDefaultInstance() : storedAccessPoint;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkRequestOrBuilder
        public WifiSetup.StoredAccessPointOrBuilder getApOrBuilder() {
            WifiSetup.StoredAccessPoint storedAccessPoint = this.ap_;
            return storedAccessPoint == null ? WifiSetup.StoredAccessPoint.getDefaultInstance() : storedAccessPoint;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectToWifiNetworkRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getAp()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkRequestOrBuilder
        public boolean hasAp() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAp()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getAp().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectToWifiNetworkRequest.class, Builder.class);
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
            if (!hasAp() || getAp().isInitialized()) {
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
            return new ConnectToWifiNetworkRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getAp());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectToWifiNetworkRequestOrBuilder {
            private SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> apBuilder_;
            private WifiSetup.StoredAccessPoint ap_;
            private int bitField0_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConnectToWifiNetworkRequest connectToWifiNetworkRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.apBuilder_;
                    connectToWifiNetworkRequest.ap_ = singleFieldBuilderV3 == null ? this.ap_ : (WifiSetup.StoredAccessPoint) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                connectToWifiNetworkRequest.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> getApFieldBuilder() {
                if (this.apBuilder_ == null) {
                    this.apBuilder_ = new SingleFieldBuilderV3<>(getAp(), getParentForChildren(), isClean());
                    this.ap_ = null;
                }
                return this.apBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getApFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectToWifiNetworkRequest build() {
                ConnectToWifiNetworkRequest connectToWifiNetworkRequestBuildPartial = buildPartial();
                if (connectToWifiNetworkRequestBuildPartial.isInitialized()) {
                    return connectToWifiNetworkRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectToWifiNetworkRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectToWifiNetworkRequest buildPartial() {
                ConnectToWifiNetworkRequest connectToWifiNetworkRequest = new ConnectToWifiNetworkRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectToWifiNetworkRequest);
                }
                onBuilt();
                return connectToWifiNetworkRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.ap_ = null;
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.apBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.apBuilder_ = null;
                }
                return this;
            }

            public Builder clearAp() {
                this.bitField0_ &= -2;
                this.ap_ = null;
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.apBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.apBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkRequestOrBuilder
            public WifiSetup.StoredAccessPoint getAp() {
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.apBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WifiSetup.StoredAccessPoint) singleFieldBuilderV3.getMessage();
                }
                WifiSetup.StoredAccessPoint storedAccessPoint = this.ap_;
                return storedAccessPoint == null ? WifiSetup.StoredAccessPoint.getDefaultInstance() : storedAccessPoint;
            }

            public WifiSetup.StoredAccessPoint.Builder getApBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (WifiSetup.StoredAccessPoint.Builder) getApFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkRequestOrBuilder
            public WifiSetup.StoredAccessPointOrBuilder getApOrBuilder() {
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.apBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WifiSetup.StoredAccessPointOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WifiSetup.StoredAccessPoint storedAccessPoint = this.ap_;
                return storedAccessPoint == null ? WifiSetup.StoredAccessPoint.getDefaultInstance() : storedAccessPoint;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkRequestOrBuilder
            public boolean hasAp() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectToWifiNetworkRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasAp() || getAp().isInitialized();
            }

            public Builder mergeAp(WifiSetup.StoredAccessPoint storedAccessPoint) {
                WifiSetup.StoredAccessPoint storedAccessPoint2;
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.apBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(storedAccessPoint);
                } else if ((this.bitField0_ & 1) == 0 || (storedAccessPoint2 = this.ap_) == null || storedAccessPoint2 == WifiSetup.StoredAccessPoint.getDefaultInstance()) {
                    this.ap_ = storedAccessPoint;
                } else {
                    getApBuilder().mergeFrom(storedAccessPoint);
                }
                if (this.ap_ != null) {
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
                                    codedInputStream.readMessage(getApFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setAp(WifiSetup.StoredAccessPoint.Builder builder) {
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.apBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ap_ = builder.build();
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
            public ConnectToWifiNetworkRequest getDefaultInstanceForType() {
                return ConnectToWifiNetworkRequest.getDefaultInstance();
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

            public Builder setAp(WifiSetup.StoredAccessPoint storedAccessPoint) {
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.apBuilder_;
                if (singleFieldBuilderV3 == null) {
                    storedAccessPoint.getClass();
                    this.ap_ = storedAccessPoint;
                } else {
                    singleFieldBuilderV3.setMessage(storedAccessPoint);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectToWifiNetworkRequest) {
                    return mergeFrom((ConnectToWifiNetworkRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectToWifiNetworkRequest connectToWifiNetworkRequest) {
                if (connectToWifiNetworkRequest == ConnectToWifiNetworkRequest.getDefaultInstance()) {
                    return this;
                }
                if (connectToWifiNetworkRequest.hasAp()) {
                    mergeAp(connectToWifiNetworkRequest.getAp());
                }
                mergeUnknownFields(connectToWifiNetworkRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectToWifiNetworkRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ConnectToWifiNetworkRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ConnectToWifiNetworkRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectToWifiNetworkRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectToWifiNetworkRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectToWifiNetworkRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectToWifiNetworkRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectToWifiNetworkRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectToWifiNetworkRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectToWifiNetworkRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectToWifiNetworkRequest parseFrom(InputStream inputStream) {
            return (ConnectToWifiNetworkRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectToWifiNetworkRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectToWifiNetworkRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectToWifiNetworkRequest parseFrom(CodedInputStream codedInputStream) {
            return (ConnectToWifiNetworkRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectToWifiNetworkRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectToWifiNetworkRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConnectToWifiNetworkResponse extends GeneratedMessageV3 implements ConnectToWifiNetworkResponseOrBuilder {
        private static final ConnectToWifiNetworkResponse DEFAULT_INSTANCE = new ConnectToWifiNetworkResponse();

        @Deprecated
        public static final Parser<ConnectToWifiNetworkResponse> PARSER = new AbstractParser<ConnectToWifiNetworkResponse>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkResponse.1
            @Override // com.google.protobuf.Parser
            public ConnectToWifiNetworkResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectToWifiNetworkResponse.newBuilder();
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

        private ConnectToWifiNetworkResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectToWifiNetworkResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkResponse_descriptor;
        }

        public static Builder newBuilder(ConnectToWifiNetworkResponse connectToWifiNetworkResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectToWifiNetworkResponse);
        }

        public static ConnectToWifiNetworkResponse parseDelimitedFrom(InputStream inputStream) {
            return (ConnectToWifiNetworkResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectToWifiNetworkResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectToWifiNetworkResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectToWifiNetworkResponse)) {
                return super.equals(obj);
            }
            ConnectToWifiNetworkResponse connectToWifiNetworkResponse = (ConnectToWifiNetworkResponse) obj;
            if (hasStatus() != connectToWifiNetworkResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == connectToWifiNetworkResponse.status_) && getUnknownFields().equals(connectToWifiNetworkResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectToWifiNetworkResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkResponseOrBuilder
        public WifiSetup.StatusType getStatus() {
            WifiSetup.StatusType statusTypeForNumber = WifiSetup.StatusType.forNumber(this.status_);
            return statusTypeForNumber == null ? WifiSetup.StatusType.Unknown : statusTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkResponseOrBuilder
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
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectToWifiNetworkResponse.class, Builder.class);
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
            return new ConnectToWifiNetworkResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectToWifiNetworkResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(ConnectToWifiNetworkResponse connectToWifiNetworkResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    connectToWifiNetworkResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                connectToWifiNetworkResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectToWifiNetworkResponse build() {
                ConnectToWifiNetworkResponse connectToWifiNetworkResponseBuildPartial = buildPartial();
                if (connectToWifiNetworkResponseBuildPartial.isInitialized()) {
                    return connectToWifiNetworkResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectToWifiNetworkResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectToWifiNetworkResponse buildPartial() {
                ConnectToWifiNetworkResponse connectToWifiNetworkResponse = new ConnectToWifiNetworkResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectToWifiNetworkResponse);
                }
                onBuilt();
                return connectToWifiNetworkResponse;
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
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkResponseOrBuilder
            public WifiSetup.StatusType getStatus() {
                WifiSetup.StatusType statusTypeForNumber = WifiSetup.StatusType.forNumber(this.status_);
                return statusTypeForNumber == null ? WifiSetup.StatusType.Unknown : statusTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ConnectToWifiNetworkResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ConnectToWifiNetworkResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectToWifiNetworkResponse.class, Builder.class);
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
                                    if (WifiSetup.StatusType.forNumber(i14) == null) {
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

            public Builder setStatus(WifiSetup.StatusType statusType) {
                statusType.getClass();
                this.bitField0_ |= 1;
                this.status_ = statusType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConnectToWifiNetworkResponse getDefaultInstanceForType() {
                return ConnectToWifiNetworkResponse.getDefaultInstance();
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
                if (message instanceof ConnectToWifiNetworkResponse) {
                    return mergeFrom((ConnectToWifiNetworkResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectToWifiNetworkResponse connectToWifiNetworkResponse) {
                if (connectToWifiNetworkResponse == ConnectToWifiNetworkResponse.getDefaultInstance()) {
                    return this;
                }
                if (connectToWifiNetworkResponse.hasStatus()) {
                    setStatus(connectToWifiNetworkResponse.getStatus());
                }
                mergeUnknownFields(connectToWifiNetworkResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectToWifiNetworkResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConnectToWifiNetworkResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectToWifiNetworkResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectToWifiNetworkResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ConnectToWifiNetworkResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConnectToWifiNetworkResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ConnectToWifiNetworkResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectToWifiNetworkResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectToWifiNetworkResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectToWifiNetworkResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectToWifiNetworkResponse parseFrom(InputStream inputStream) {
            return (ConnectToWifiNetworkResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectToWifiNetworkResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectToWifiNetworkResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectToWifiNetworkResponse parseFrom(CodedInputStream codedInputStream) {
            return (ConnectToWifiNetworkResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectToWifiNetworkResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectToWifiNetworkResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DeviceAPCredentialsResponse extends GeneratedMessageV3 implements DeviceAPCredentialsResponseOrBuilder {
        public static final int DEVICE_ACCESS_POINT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private WifiSetup.StoredAccessPoint deviceAccessPoint_;
        private byte memoizedIsInitialized;
        private static final DeviceAPCredentialsResponse DEFAULT_INSTANCE = new DeviceAPCredentialsResponse();

        @Deprecated
        public static final Parser<DeviceAPCredentialsResponse> PARSER = new AbstractParser<DeviceAPCredentialsResponse>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.DeviceAPCredentialsResponse.1
            @Override // com.google.protobuf.Parser
            public DeviceAPCredentialsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DeviceAPCredentialsResponse.newBuilder();
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

        private DeviceAPCredentialsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceAPCredentialsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_DeviceAPCredentialsResponse_descriptor;
        }

        public static Builder newBuilder(DeviceAPCredentialsResponse deviceAPCredentialsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceAPCredentialsResponse);
        }

        public static DeviceAPCredentialsResponse parseDelimitedFrom(InputStream inputStream) {
            return (DeviceAPCredentialsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeviceAPCredentialsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DeviceAPCredentialsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeviceAPCredentialsResponse)) {
                return super.equals(obj);
            }
            DeviceAPCredentialsResponse deviceAPCredentialsResponse = (DeviceAPCredentialsResponse) obj;
            if (hasDeviceAccessPoint() != deviceAPCredentialsResponse.hasDeviceAccessPoint()) {
                return false;
            }
            return (!hasDeviceAccessPoint() || getDeviceAccessPoint().equals(deviceAPCredentialsResponse.getDeviceAccessPoint())) && getUnknownFields().equals(deviceAPCredentialsResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.DeviceAPCredentialsResponseOrBuilder
        public WifiSetup.StoredAccessPoint getDeviceAccessPoint() {
            WifiSetup.StoredAccessPoint storedAccessPoint = this.deviceAccessPoint_;
            return storedAccessPoint == null ? WifiSetup.StoredAccessPoint.getDefaultInstance() : storedAccessPoint;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.DeviceAPCredentialsResponseOrBuilder
        public WifiSetup.StoredAccessPointOrBuilder getDeviceAccessPointOrBuilder() {
            WifiSetup.StoredAccessPoint storedAccessPoint = this.deviceAccessPoint_;
            return storedAccessPoint == null ? WifiSetup.StoredAccessPoint.getDefaultInstance() : storedAccessPoint;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeviceAPCredentialsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getDeviceAccessPoint()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.DeviceAPCredentialsResponseOrBuilder
        public boolean hasDeviceAccessPoint() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDeviceAccessPoint()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDeviceAccessPoint().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_DeviceAPCredentialsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceAPCredentialsResponse.class, Builder.class);
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
            if (!hasDeviceAccessPoint() || getDeviceAccessPoint().isInitialized()) {
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
            return new DeviceAPCredentialsResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getDeviceAccessPoint());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceAPCredentialsResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> deviceAccessPointBuilder_;
            private WifiSetup.StoredAccessPoint deviceAccessPoint_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(DeviceAPCredentialsResponse deviceAPCredentialsResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.deviceAccessPointBuilder_;
                    deviceAPCredentialsResponse.deviceAccessPoint_ = singleFieldBuilderV3 == null ? this.deviceAccessPoint_ : (WifiSetup.StoredAccessPoint) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                deviceAPCredentialsResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_DeviceAPCredentialsResponse_descriptor;
            }

            private SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> getDeviceAccessPointFieldBuilder() {
                if (this.deviceAccessPointBuilder_ == null) {
                    this.deviceAccessPointBuilder_ = new SingleFieldBuilderV3<>(getDeviceAccessPoint(), getParentForChildren(), isClean());
                    this.deviceAccessPoint_ = null;
                }
                return this.deviceAccessPointBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDeviceAccessPointFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceAPCredentialsResponse build() {
                DeviceAPCredentialsResponse deviceAPCredentialsResponseBuildPartial = buildPartial();
                if (deviceAPCredentialsResponseBuildPartial.isInitialized()) {
                    return deviceAPCredentialsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceAPCredentialsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceAPCredentialsResponse buildPartial() {
                DeviceAPCredentialsResponse deviceAPCredentialsResponse = new DeviceAPCredentialsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(deviceAPCredentialsResponse);
                }
                onBuilt();
                return deviceAPCredentialsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.deviceAccessPoint_ = null;
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.deviceAccessPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceAccessPointBuilder_ = null;
                }
                return this;
            }

            public Builder clearDeviceAccessPoint() {
                this.bitField0_ &= -2;
                this.deviceAccessPoint_ = null;
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.deviceAccessPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceAccessPointBuilder_ = null;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_DeviceAPCredentialsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.DeviceAPCredentialsResponseOrBuilder
            public WifiSetup.StoredAccessPoint getDeviceAccessPoint() {
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.deviceAccessPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WifiSetup.StoredAccessPoint) singleFieldBuilderV3.getMessage();
                }
                WifiSetup.StoredAccessPoint storedAccessPoint = this.deviceAccessPoint_;
                return storedAccessPoint == null ? WifiSetup.StoredAccessPoint.getDefaultInstance() : storedAccessPoint;
            }

            public WifiSetup.StoredAccessPoint.Builder getDeviceAccessPointBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (WifiSetup.StoredAccessPoint.Builder) getDeviceAccessPointFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.DeviceAPCredentialsResponseOrBuilder
            public WifiSetup.StoredAccessPointOrBuilder getDeviceAccessPointOrBuilder() {
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.deviceAccessPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WifiSetup.StoredAccessPointOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WifiSetup.StoredAccessPoint storedAccessPoint = this.deviceAccessPoint_;
                return storedAccessPoint == null ? WifiSetup.StoredAccessPoint.getDefaultInstance() : storedAccessPoint;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.DeviceAPCredentialsResponseOrBuilder
            public boolean hasDeviceAccessPoint() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_DeviceAPCredentialsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceAPCredentialsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasDeviceAccessPoint() || getDeviceAccessPoint().isInitialized();
            }

            public Builder mergeDeviceAccessPoint(WifiSetup.StoredAccessPoint storedAccessPoint) {
                WifiSetup.StoredAccessPoint storedAccessPoint2;
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.deviceAccessPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(storedAccessPoint);
                } else if ((this.bitField0_ & 1) == 0 || (storedAccessPoint2 = this.deviceAccessPoint_) == null || storedAccessPoint2 == WifiSetup.StoredAccessPoint.getDefaultInstance()) {
                    this.deviceAccessPoint_ = storedAccessPoint;
                } else {
                    getDeviceAccessPointBuilder().mergeFrom(storedAccessPoint);
                }
                if (this.deviceAccessPoint_ != null) {
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
                                    codedInputStream.readMessage(getDeviceAccessPointFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setDeviceAccessPoint(WifiSetup.StoredAccessPoint.Builder builder) {
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.deviceAccessPointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.deviceAccessPoint_ = builder.build();
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
            public DeviceAPCredentialsResponse getDefaultInstanceForType() {
                return DeviceAPCredentialsResponse.getDefaultInstance();
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

            public Builder setDeviceAccessPoint(WifiSetup.StoredAccessPoint storedAccessPoint) {
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.deviceAccessPointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    storedAccessPoint.getClass();
                    this.deviceAccessPoint_ = storedAccessPoint;
                } else {
                    singleFieldBuilderV3.setMessage(storedAccessPoint);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DeviceAPCredentialsResponse) {
                    return mergeFrom((DeviceAPCredentialsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeviceAPCredentialsResponse deviceAPCredentialsResponse) {
                if (deviceAPCredentialsResponse == DeviceAPCredentialsResponse.getDefaultInstance()) {
                    return this;
                }
                if (deviceAPCredentialsResponse.hasDeviceAccessPoint()) {
                    mergeDeviceAccessPoint(deviceAPCredentialsResponse.getDeviceAccessPoint());
                }
                mergeUnknownFields(deviceAPCredentialsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeviceAPCredentialsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DeviceAPCredentialsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DeviceAPCredentialsResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceAPCredentialsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceAPCredentialsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceAPCredentialsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DeviceAPCredentialsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeviceAPCredentialsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DeviceAPCredentialsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DeviceAPCredentialsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DeviceAPCredentialsResponse parseFrom(InputStream inputStream) {
            return (DeviceAPCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DeviceAPCredentialsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceAPCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceAPCredentialsResponse parseFrom(CodedInputStream codedInputStream) {
            return (DeviceAPCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeviceAPCredentialsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceAPCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetScannedWifiNetworksResponse extends GeneratedMessageV3 implements GetScannedWifiNetworksResponseOrBuilder {
        private static final GetScannedWifiNetworksResponse DEFAULT_INSTANCE = new GetScannedWifiNetworksResponse();

        @Deprecated
        public static final Parser<GetScannedWifiNetworksResponse> PARSER = new AbstractParser<GetScannedWifiNetworksResponse>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.GetScannedWifiNetworksResponse.1
            @Override // com.google.protobuf.Parser
            public GetScannedWifiNetworksResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetScannedWifiNetworksResponse.newBuilder();
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
        public static final int SCANNED_APS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<WifiSetup.ScannedAccessPoint> scannedAps_;

        private GetScannedWifiNetworksResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.scannedAps_ = Collections.EMPTY_LIST;
        }

        public static GetScannedWifiNetworksResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_GetScannedWifiNetworksResponse_descriptor;
        }

        public static Builder newBuilder(GetScannedWifiNetworksResponse getScannedWifiNetworksResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getScannedWifiNetworksResponse);
        }

        public static GetScannedWifiNetworksResponse parseDelimitedFrom(InputStream inputStream) {
            return (GetScannedWifiNetworksResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetScannedWifiNetworksResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetScannedWifiNetworksResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetScannedWifiNetworksResponse)) {
                return super.equals(obj);
            }
            GetScannedWifiNetworksResponse getScannedWifiNetworksResponse = (GetScannedWifiNetworksResponse) obj;
            return getScannedApsList().equals(getScannedWifiNetworksResponse.getScannedApsList()) && getUnknownFields().equals(getScannedWifiNetworksResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetScannedWifiNetworksResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetScannedWifiNetworksResponseOrBuilder
        public WifiSetup.ScannedAccessPoint getScannedAps(int i14) {
            return this.scannedAps_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetScannedWifiNetworksResponseOrBuilder
        public int getScannedApsCount() {
            return this.scannedAps_.size();
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetScannedWifiNetworksResponseOrBuilder
        public List<WifiSetup.ScannedAccessPoint> getScannedApsList() {
            return this.scannedAps_;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetScannedWifiNetworksResponseOrBuilder
        public WifiSetup.ScannedAccessPointOrBuilder getScannedApsOrBuilder(int i14) {
            return this.scannedAps_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetScannedWifiNetworksResponseOrBuilder
        public List<? extends WifiSetup.ScannedAccessPointOrBuilder> getScannedApsOrBuilderList() {
            return this.scannedAps_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.scannedAps_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.scannedAps_.get(i15));
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
            if (getScannedApsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getScannedApsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_GetScannedWifiNetworksResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetScannedWifiNetworksResponse.class, Builder.class);
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
            for (int i14 = 0; i14 < getScannedApsCount(); i14++) {
                if (!getScannedAps(i14).isInitialized()) {
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
            return new GetScannedWifiNetworksResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.scannedAps_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.scannedAps_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetScannedWifiNetworksResponseOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> scannedApsBuilder_;
            private List<WifiSetup.ScannedAccessPoint> scannedAps_;

            private Builder() {
                this.scannedAps_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(GetScannedWifiNetworksResponse getScannedWifiNetworksResponse) {
            }

            private void buildPartialRepeatedFields(GetScannedWifiNetworksResponse getScannedWifiNetworksResponse) {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    getScannedWifiNetworksResponse.scannedAps_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.scannedAps_ = Collections.unmodifiableList(this.scannedAps_);
                    this.bitField0_ &= -2;
                }
                getScannedWifiNetworksResponse.scannedAps_ = this.scannedAps_;
            }

            private void ensureScannedApsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.scannedAps_ = new ArrayList(this.scannedAps_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_GetScannedWifiNetworksResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> getScannedApsFieldBuilder() {
                if (this.scannedApsBuilder_ == null) {
                    this.scannedApsBuilder_ = new RepeatedFieldBuilderV3<>(this.scannedAps_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.scannedAps_ = null;
                }
                return this.scannedApsBuilder_;
            }

            public Builder addAllScannedAps(Iterable<? extends WifiSetup.ScannedAccessPoint> iterable) {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureScannedApsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.scannedAps_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addScannedAps(WifiSetup.ScannedAccessPoint.Builder builder) {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureScannedApsIsMutable();
                this.scannedAps_.add(builder.build());
                onChanged();
                return this;
            }

            public WifiSetup.ScannedAccessPoint.Builder addScannedApsBuilder() {
                return (WifiSetup.ScannedAccessPoint.Builder) getScannedApsFieldBuilder().addBuilder(WifiSetup.ScannedAccessPoint.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetScannedWifiNetworksResponse build() {
                GetScannedWifiNetworksResponse getScannedWifiNetworksResponseBuildPartial = buildPartial();
                if (getScannedWifiNetworksResponseBuildPartial.isInitialized()) {
                    return getScannedWifiNetworksResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getScannedWifiNetworksResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetScannedWifiNetworksResponse buildPartial() {
                GetScannedWifiNetworksResponse getScannedWifiNetworksResponse = new GetScannedWifiNetworksResponse(this);
                buildPartialRepeatedFields(getScannedWifiNetworksResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(getScannedWifiNetworksResponse);
                }
                onBuilt();
                return getScannedWifiNetworksResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.scannedAps_ = Collections.EMPTY_LIST;
                } else {
                    this.scannedAps_ = null;
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

            public Builder clearScannedAps() {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.scannedAps_ = Collections.EMPTY_LIST;
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
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_GetScannedWifiNetworksResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetScannedWifiNetworksResponseOrBuilder
            public WifiSetup.ScannedAccessPoint getScannedAps(int i14) {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.scannedAps_.get(i14) : (WifiSetup.ScannedAccessPoint) repeatedFieldBuilderV3.getMessage(i14);
            }

            public WifiSetup.ScannedAccessPoint.Builder getScannedApsBuilder(int i14) {
                return (WifiSetup.ScannedAccessPoint.Builder) getScannedApsFieldBuilder().getBuilder(i14);
            }

            public List<WifiSetup.ScannedAccessPoint.Builder> getScannedApsBuilderList() {
                return getScannedApsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetScannedWifiNetworksResponseOrBuilder
            public int getScannedApsCount() {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.scannedAps_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetScannedWifiNetworksResponseOrBuilder
            public List<WifiSetup.ScannedAccessPoint> getScannedApsList() {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.scannedAps_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetScannedWifiNetworksResponseOrBuilder
            public WifiSetup.ScannedAccessPointOrBuilder getScannedApsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.scannedAps_.get(i14) : (WifiSetup.ScannedAccessPointOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetScannedWifiNetworksResponseOrBuilder
            public List<? extends WifiSetup.ScannedAccessPointOrBuilder> getScannedApsOrBuilderList() {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.scannedAps_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_GetScannedWifiNetworksResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetScannedWifiNetworksResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getScannedApsCount(); i14++) {
                    if (!getScannedAps(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(GetScannedWifiNetworksResponse getScannedWifiNetworksResponse) {
                if (getScannedWifiNetworksResponse == GetScannedWifiNetworksResponse.getDefaultInstance()) {
                    return this;
                }
                if (this.scannedApsBuilder_ == null) {
                    if (!getScannedWifiNetworksResponse.scannedAps_.isEmpty()) {
                        if (this.scannedAps_.isEmpty()) {
                            this.scannedAps_ = getScannedWifiNetworksResponse.scannedAps_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureScannedApsIsMutable();
                            this.scannedAps_.addAll(getScannedWifiNetworksResponse.scannedAps_);
                        }
                        onChanged();
                    }
                } else if (!getScannedWifiNetworksResponse.scannedAps_.isEmpty()) {
                    boolean zIsEmpty = this.scannedApsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.scannedApsBuilder_ = null;
                        this.scannedAps_ = getScannedWifiNetworksResponse.scannedAps_;
                        this.bitField0_ &= -2;
                        this.scannedApsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getScannedApsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(getScannedWifiNetworksResponse.scannedAps_);
                    }
                }
                mergeUnknownFields(getScannedWifiNetworksResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeScannedAps(int i14) {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureScannedApsIsMutable();
                this.scannedAps_.remove(i14);
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

            public Builder setScannedAps(int i14, WifiSetup.ScannedAccessPoint.Builder builder) {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureScannedApsIsMutable();
                this.scannedAps_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GetScannedWifiNetworksResponse getDefaultInstanceForType() {
                return GetScannedWifiNetworksResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.scannedAps_ = Collections.EMPTY_LIST;
            }

            public WifiSetup.ScannedAccessPoint.Builder addScannedApsBuilder(int i14) {
                return (WifiSetup.ScannedAccessPoint.Builder) getScannedApsFieldBuilder().addBuilder(i14, WifiSetup.ScannedAccessPoint.getDefaultInstance());
            }

            public Builder addScannedAps(int i14, WifiSetup.ScannedAccessPoint scannedAccessPoint) {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    scannedAccessPoint.getClass();
                    ensureScannedApsIsMutable();
                    this.scannedAps_.add(i14, scannedAccessPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, scannedAccessPoint);
                return this;
            }

            public Builder setScannedAps(int i14, WifiSetup.ScannedAccessPoint scannedAccessPoint) {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    scannedAccessPoint.getClass();
                    ensureScannedApsIsMutable();
                    this.scannedAps_.set(i14, scannedAccessPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, scannedAccessPoint);
                return this;
            }

            public Builder addScannedAps(WifiSetup.ScannedAccessPoint scannedAccessPoint) {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    scannedAccessPoint.getClass();
                    ensureScannedApsIsMutable();
                    this.scannedAps_.add(scannedAccessPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(scannedAccessPoint);
                return this;
            }

            public Builder addScannedAps(int i14, WifiSetup.ScannedAccessPoint.Builder builder) {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureScannedApsIsMutable();
                    this.scannedAps_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetScannedWifiNetworksResponse) {
                    return mergeFrom((GetScannedWifiNetworksResponse) message);
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
                                    WifiSetup.ScannedAccessPoint scannedAccessPoint = (WifiSetup.ScannedAccessPoint) codedInputStream.readMessage(WifiSetup.ScannedAccessPoint.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureScannedApsIsMutable();
                                        this.scannedAps_.add(scannedAccessPoint);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(scannedAccessPoint);
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
        public GetScannedWifiNetworksResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GetScannedWifiNetworksResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetScannedWifiNetworksResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetScannedWifiNetworksResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetScannedWifiNetworksResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private GetScannedWifiNetworksResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetScannedWifiNetworksResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetScannedWifiNetworksResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ GetScannedWifiNetworksResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GetScannedWifiNetworksResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetScannedWifiNetworksResponse parseFrom(InputStream inputStream) {
            return (GetScannedWifiNetworksResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetScannedWifiNetworksResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetScannedWifiNetworksResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetScannedWifiNetworksResponse parseFrom(CodedInputStream codedInputStream) {
            return (GetScannedWifiNetworksResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetScannedWifiNetworksResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetScannedWifiNetworksResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetStoredWifiNetworksResponse extends GeneratedMessageV3 implements GetStoredWifiNetworksResponseOrBuilder {
        public static final int LIMITS_FIELD_NUMBER = 1;
        public static final int STORED_APS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private WifiSetup.Limits limits_;
        private byte memoizedIsInitialized;
        private List<WifiSetup.StoredAccessPoint> storedAps_;
        private static final GetStoredWifiNetworksResponse DEFAULT_INSTANCE = new GetStoredWifiNetworksResponse();

        @Deprecated
        public static final Parser<GetStoredWifiNetworksResponse> PARSER = new AbstractParser<GetStoredWifiNetworksResponse>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.GetStoredWifiNetworksResponse.1
            @Override // com.google.protobuf.Parser
            public GetStoredWifiNetworksResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetStoredWifiNetworksResponse.newBuilder();
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

        private GetStoredWifiNetworksResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.storedAps_ = Collections.EMPTY_LIST;
        }

        public static GetStoredWifiNetworksResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_GetStoredWifiNetworksResponse_descriptor;
        }

        public static Builder newBuilder(GetStoredWifiNetworksResponse getStoredWifiNetworksResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getStoredWifiNetworksResponse);
        }

        public static GetStoredWifiNetworksResponse parseDelimitedFrom(InputStream inputStream) {
            return (GetStoredWifiNetworksResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetStoredWifiNetworksResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetStoredWifiNetworksResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetStoredWifiNetworksResponse)) {
                return super.equals(obj);
            }
            GetStoredWifiNetworksResponse getStoredWifiNetworksResponse = (GetStoredWifiNetworksResponse) obj;
            if (hasLimits() != getStoredWifiNetworksResponse.hasLimits()) {
                return false;
            }
            return (!hasLimits() || getLimits().equals(getStoredWifiNetworksResponse.getLimits())) && getStoredApsList().equals(getStoredWifiNetworksResponse.getStoredApsList()) && getUnknownFields().equals(getStoredWifiNetworksResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetStoredWifiNetworksResponseOrBuilder
        public WifiSetup.Limits getLimits() {
            WifiSetup.Limits limits = this.limits_;
            return limits == null ? WifiSetup.Limits.getDefaultInstance() : limits;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetStoredWifiNetworksResponseOrBuilder
        public WifiSetup.LimitsOrBuilder getLimitsOrBuilder() {
            WifiSetup.Limits limits = this.limits_;
            return limits == null ? WifiSetup.Limits.getDefaultInstance() : limits;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetStoredWifiNetworksResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getLimits()) : 0;
            for (int i15 = 0; i15 < this.storedAps_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.storedAps_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetStoredWifiNetworksResponseOrBuilder
        public WifiSetup.StoredAccessPoint getStoredAps(int i14) {
            return this.storedAps_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetStoredWifiNetworksResponseOrBuilder
        public int getStoredApsCount() {
            return this.storedAps_.size();
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetStoredWifiNetworksResponseOrBuilder
        public List<WifiSetup.StoredAccessPoint> getStoredApsList() {
            return this.storedAps_;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetStoredWifiNetworksResponseOrBuilder
        public WifiSetup.StoredAccessPointOrBuilder getStoredApsOrBuilder(int i14) {
            return this.storedAps_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetStoredWifiNetworksResponseOrBuilder
        public List<? extends WifiSetup.StoredAccessPointOrBuilder> getStoredApsOrBuilderList() {
            return this.storedAps_;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetStoredWifiNetworksResponseOrBuilder
        public boolean hasLimits() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasLimits()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getLimits().hashCode();
            }
            if (getStoredApsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getStoredApsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_GetStoredWifiNetworksResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetStoredWifiNetworksResponse.class, Builder.class);
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
            for (int i14 = 0; i14 < getStoredApsCount(); i14++) {
                if (!getStoredAps(i14).isInitialized()) {
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
            return new GetStoredWifiNetworksResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getLimits());
            }
            for (int i14 = 0; i14 < this.storedAps_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.storedAps_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetStoredWifiNetworksResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<WifiSetup.Limits, WifiSetup.Limits.Builder, WifiSetup.LimitsOrBuilder> limitsBuilder_;
            private WifiSetup.Limits limits_;
            private RepeatedFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> storedApsBuilder_;
            private List<WifiSetup.StoredAccessPoint> storedAps_;

            private Builder() {
                this.storedAps_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(GetStoredWifiNetworksResponse getStoredWifiNetworksResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<WifiSetup.Limits, WifiSetup.Limits.Builder, WifiSetup.LimitsOrBuilder> singleFieldBuilderV3 = this.limitsBuilder_;
                    getStoredWifiNetworksResponse.limits_ = singleFieldBuilderV3 == null ? this.limits_ : (WifiSetup.Limits) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                getStoredWifiNetworksResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(GetStoredWifiNetworksResponse getStoredWifiNetworksResponse) {
                RepeatedFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    getStoredWifiNetworksResponse.storedAps_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.storedAps_ = Collections.unmodifiableList(this.storedAps_);
                    this.bitField0_ &= -3;
                }
                getStoredWifiNetworksResponse.storedAps_ = this.storedAps_;
            }

            private void ensureStoredApsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.storedAps_ = new ArrayList(this.storedAps_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_GetStoredWifiNetworksResponse_descriptor;
            }

            private SingleFieldBuilderV3<WifiSetup.Limits, WifiSetup.Limits.Builder, WifiSetup.LimitsOrBuilder> getLimitsFieldBuilder() {
                if (this.limitsBuilder_ == null) {
                    this.limitsBuilder_ = new SingleFieldBuilderV3<>(getLimits(), getParentForChildren(), isClean());
                    this.limits_ = null;
                }
                return this.limitsBuilder_;
            }

            private RepeatedFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> getStoredApsFieldBuilder() {
                if (this.storedApsBuilder_ == null) {
                    this.storedApsBuilder_ = new RepeatedFieldBuilderV3<>(this.storedAps_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.storedAps_ = null;
                }
                return this.storedApsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getLimitsFieldBuilder();
                    getStoredApsFieldBuilder();
                }
            }

            public Builder addAllStoredAps(Iterable<? extends WifiSetup.StoredAccessPoint> iterable) {
                RepeatedFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureStoredApsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.storedAps_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addStoredAps(WifiSetup.StoredAccessPoint.Builder builder) {
                RepeatedFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureStoredApsIsMutable();
                this.storedAps_.add(builder.build());
                onChanged();
                return this;
            }

            public WifiSetup.StoredAccessPoint.Builder addStoredApsBuilder() {
                return (WifiSetup.StoredAccessPoint.Builder) getStoredApsFieldBuilder().addBuilder(WifiSetup.StoredAccessPoint.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetStoredWifiNetworksResponse build() {
                GetStoredWifiNetworksResponse getStoredWifiNetworksResponseBuildPartial = buildPartial();
                if (getStoredWifiNetworksResponseBuildPartial.isInitialized()) {
                    return getStoredWifiNetworksResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getStoredWifiNetworksResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetStoredWifiNetworksResponse buildPartial() {
                GetStoredWifiNetworksResponse getStoredWifiNetworksResponse = new GetStoredWifiNetworksResponse(this);
                buildPartialRepeatedFields(getStoredWifiNetworksResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(getStoredWifiNetworksResponse);
                }
                onBuilt();
                return getStoredWifiNetworksResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.limits_ = null;
                SingleFieldBuilderV3<WifiSetup.Limits, WifiSetup.Limits.Builder, WifiSetup.LimitsOrBuilder> singleFieldBuilderV3 = this.limitsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.limitsBuilder_ = null;
                }
                RepeatedFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.storedAps_ = Collections.EMPTY_LIST;
                } else {
                    this.storedAps_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLimits() {
                this.bitField0_ &= -2;
                this.limits_ = null;
                SingleFieldBuilderV3<WifiSetup.Limits, WifiSetup.Limits.Builder, WifiSetup.LimitsOrBuilder> singleFieldBuilderV3 = this.limitsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.limitsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStoredAps() {
                RepeatedFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.storedAps_ = Collections.EMPTY_LIST;
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
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_GetStoredWifiNetworksResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetStoredWifiNetworksResponseOrBuilder
            public WifiSetup.Limits getLimits() {
                SingleFieldBuilderV3<WifiSetup.Limits, WifiSetup.Limits.Builder, WifiSetup.LimitsOrBuilder> singleFieldBuilderV3 = this.limitsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WifiSetup.Limits) singleFieldBuilderV3.getMessage();
                }
                WifiSetup.Limits limits = this.limits_;
                return limits == null ? WifiSetup.Limits.getDefaultInstance() : limits;
            }

            public WifiSetup.Limits.Builder getLimitsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (WifiSetup.Limits.Builder) getLimitsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetStoredWifiNetworksResponseOrBuilder
            public WifiSetup.LimitsOrBuilder getLimitsOrBuilder() {
                SingleFieldBuilderV3<WifiSetup.Limits, WifiSetup.Limits.Builder, WifiSetup.LimitsOrBuilder> singleFieldBuilderV3 = this.limitsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WifiSetup.LimitsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WifiSetup.Limits limits = this.limits_;
                return limits == null ? WifiSetup.Limits.getDefaultInstance() : limits;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetStoredWifiNetworksResponseOrBuilder
            public WifiSetup.StoredAccessPoint getStoredAps(int i14) {
                RepeatedFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.storedAps_.get(i14) : (WifiSetup.StoredAccessPoint) repeatedFieldBuilderV3.getMessage(i14);
            }

            public WifiSetup.StoredAccessPoint.Builder getStoredApsBuilder(int i14) {
                return (WifiSetup.StoredAccessPoint.Builder) getStoredApsFieldBuilder().getBuilder(i14);
            }

            public List<WifiSetup.StoredAccessPoint.Builder> getStoredApsBuilderList() {
                return getStoredApsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetStoredWifiNetworksResponseOrBuilder
            public int getStoredApsCount() {
                RepeatedFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.storedAps_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetStoredWifiNetworksResponseOrBuilder
            public List<WifiSetup.StoredAccessPoint> getStoredApsList() {
                RepeatedFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.storedAps_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetStoredWifiNetworksResponseOrBuilder
            public WifiSetup.StoredAccessPointOrBuilder getStoredApsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.storedAps_.get(i14) : (WifiSetup.StoredAccessPointOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetStoredWifiNetworksResponseOrBuilder
            public List<? extends WifiSetup.StoredAccessPointOrBuilder> getStoredApsOrBuilderList() {
                RepeatedFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.storedAps_);
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.GetStoredWifiNetworksResponseOrBuilder
            public boolean hasLimits() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_GetStoredWifiNetworksResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetStoredWifiNetworksResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getStoredApsCount(); i14++) {
                    if (!getStoredAps(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(GetStoredWifiNetworksResponse getStoredWifiNetworksResponse) {
                if (getStoredWifiNetworksResponse == GetStoredWifiNetworksResponse.getDefaultInstance()) {
                    return this;
                }
                if (getStoredWifiNetworksResponse.hasLimits()) {
                    mergeLimits(getStoredWifiNetworksResponse.getLimits());
                }
                if (this.storedApsBuilder_ == null) {
                    if (!getStoredWifiNetworksResponse.storedAps_.isEmpty()) {
                        if (this.storedAps_.isEmpty()) {
                            this.storedAps_ = getStoredWifiNetworksResponse.storedAps_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureStoredApsIsMutable();
                            this.storedAps_.addAll(getStoredWifiNetworksResponse.storedAps_);
                        }
                        onChanged();
                    }
                } else if (!getStoredWifiNetworksResponse.storedAps_.isEmpty()) {
                    boolean zIsEmpty = this.storedApsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.storedApsBuilder_ = null;
                        this.storedAps_ = getStoredWifiNetworksResponse.storedAps_;
                        this.bitField0_ &= -3;
                        this.storedApsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getStoredApsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(getStoredWifiNetworksResponse.storedAps_);
                    }
                }
                mergeUnknownFields(getStoredWifiNetworksResponse.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder mergeLimits(WifiSetup.Limits limits) {
                WifiSetup.Limits limits2;
                SingleFieldBuilderV3<WifiSetup.Limits, WifiSetup.Limits.Builder, WifiSetup.LimitsOrBuilder> singleFieldBuilderV3 = this.limitsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(limits);
                } else if ((this.bitField0_ & 1) == 0 || (limits2 = this.limits_) == null || limits2 == WifiSetup.Limits.getDefaultInstance()) {
                    this.limits_ = limits;
                } else {
                    getLimitsBuilder().mergeFrom(limits);
                }
                if (this.limits_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeStoredAps(int i14) {
                RepeatedFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureStoredApsIsMutable();
                this.storedAps_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLimits(WifiSetup.Limits.Builder builder) {
                SingleFieldBuilderV3<WifiSetup.Limits, WifiSetup.Limits.Builder, WifiSetup.LimitsOrBuilder> singleFieldBuilderV3 = this.limitsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.limits_ = builder.build();
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

            public Builder setStoredAps(int i14, WifiSetup.StoredAccessPoint.Builder builder) {
                RepeatedFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureStoredApsIsMutable();
                this.storedAps_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GetStoredWifiNetworksResponse getDefaultInstanceForType() {
                return GetStoredWifiNetworksResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.storedAps_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public WifiSetup.StoredAccessPoint.Builder addStoredApsBuilder(int i14) {
                return (WifiSetup.StoredAccessPoint.Builder) getStoredApsFieldBuilder().addBuilder(i14, WifiSetup.StoredAccessPoint.getDefaultInstance());
            }

            public Builder addStoredAps(int i14, WifiSetup.StoredAccessPoint storedAccessPoint) {
                RepeatedFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    storedAccessPoint.getClass();
                    ensureStoredApsIsMutable();
                    this.storedAps_.add(i14, storedAccessPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, storedAccessPoint);
                return this;
            }

            public Builder setLimits(WifiSetup.Limits limits) {
                SingleFieldBuilderV3<WifiSetup.Limits, WifiSetup.Limits.Builder, WifiSetup.LimitsOrBuilder> singleFieldBuilderV3 = this.limitsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    limits.getClass();
                    this.limits_ = limits;
                } else {
                    singleFieldBuilderV3.setMessage(limits);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStoredAps(int i14, WifiSetup.StoredAccessPoint storedAccessPoint) {
                RepeatedFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    storedAccessPoint.getClass();
                    ensureStoredApsIsMutable();
                    this.storedAps_.set(i14, storedAccessPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, storedAccessPoint);
                return this;
            }

            public Builder addStoredAps(WifiSetup.StoredAccessPoint storedAccessPoint) {
                RepeatedFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    storedAccessPoint.getClass();
                    ensureStoredApsIsMutable();
                    this.storedAps_.add(storedAccessPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(storedAccessPoint);
                return this;
            }

            public Builder addStoredAps(int i14, WifiSetup.StoredAccessPoint.Builder builder) {
                RepeatedFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureStoredApsIsMutable();
                    this.storedAps_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetStoredWifiNetworksResponse) {
                    return mergeFrom((GetStoredWifiNetworksResponse) message);
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
                                    codedInputStream.readMessage(getLimitsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    WifiSetup.StoredAccessPoint storedAccessPoint = (WifiSetup.StoredAccessPoint) codedInputStream.readMessage(WifiSetup.StoredAccessPoint.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> repeatedFieldBuilderV3 = this.storedApsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureStoredApsIsMutable();
                                        this.storedAps_.add(storedAccessPoint);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(storedAccessPoint);
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
        public GetStoredWifiNetworksResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GetStoredWifiNetworksResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetStoredWifiNetworksResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetStoredWifiNetworksResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetStoredWifiNetworksResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private GetStoredWifiNetworksResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetStoredWifiNetworksResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetStoredWifiNetworksResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ GetStoredWifiNetworksResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GetStoredWifiNetworksResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetStoredWifiNetworksResponse parseFrom(InputStream inputStream) {
            return (GetStoredWifiNetworksResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetStoredWifiNetworksResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetStoredWifiNetworksResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetStoredWifiNetworksResponse parseFrom(CodedInputStream codedInputStream) {
            return (GetStoredWifiNetworksResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetStoredWifiNetworksResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetStoredWifiNetworksResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class MobileCarrierInfoResponse extends GeneratedMessageV3 implements MobileCarrierInfoResponseOrBuilder {
        public static final int ISO_COUNTRY_CODE_FIELD_NUMBER = 2;
        public static final int MOBILE_COUNTRY_CODE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private LazyStringArrayList isoCountryCode_;
        private byte memoizedIsInitialized;
        private LazyStringArrayList mobileCountryCode_;
        private static final MobileCarrierInfoResponse DEFAULT_INSTANCE = new MobileCarrierInfoResponse();

        @Deprecated
        public static final Parser<MobileCarrierInfoResponse> PARSER = new AbstractParser<MobileCarrierInfoResponse>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.MobileCarrierInfoResponse.1
            @Override // com.google.protobuf.Parser
            public MobileCarrierInfoResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = MobileCarrierInfoResponse.newBuilder();
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

        private MobileCarrierInfoResponse() {
            this.mobileCountryCode_ = LazyStringArrayList.emptyList();
            this.isoCountryCode_ = LazyStringArrayList.emptyList();
            this.memoizedIsInitialized = (byte) -1;
            this.mobileCountryCode_ = LazyStringArrayList.emptyList();
            this.isoCountryCode_ = LazyStringArrayList.emptyList();
        }

        public static MobileCarrierInfoResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_MobileCarrierInfoResponse_descriptor;
        }

        public static Builder newBuilder(MobileCarrierInfoResponse mobileCarrierInfoResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(mobileCarrierInfoResponse);
        }

        public static MobileCarrierInfoResponse parseDelimitedFrom(InputStream inputStream) {
            return (MobileCarrierInfoResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MobileCarrierInfoResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MobileCarrierInfoResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MobileCarrierInfoResponse)) {
                return super.equals(obj);
            }
            MobileCarrierInfoResponse mobileCarrierInfoResponse = (MobileCarrierInfoResponse) obj;
            return getMobileCountryCodeList().equals(mobileCarrierInfoResponse.getMobileCountryCodeList()) && getIsoCountryCodeList().equals(mobileCarrierInfoResponse.getIsoCountryCodeList()) && getUnknownFields().equals(mobileCarrierInfoResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.MobileCarrierInfoResponseOrBuilder
        public String getIsoCountryCode(int i14) {
            return this.isoCountryCode_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.MobileCarrierInfoResponseOrBuilder
        public ByteString getIsoCountryCodeBytes(int i14) {
            return this.isoCountryCode_.getByteString(i14);
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.MobileCarrierInfoResponseOrBuilder
        public int getIsoCountryCodeCount() {
            return this.isoCountryCode_.size();
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.MobileCarrierInfoResponseOrBuilder
        public String getMobileCountryCode(int i14) {
            return this.mobileCountryCode_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.MobileCarrierInfoResponseOrBuilder
        public ByteString getMobileCountryCodeBytes(int i14) {
            return this.mobileCountryCode_.getByteString(i14);
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.MobileCarrierInfoResponseOrBuilder
        public int getMobileCountryCodeCount() {
            return this.mobileCountryCode_.size();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MobileCarrierInfoResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iD = 0;
            for (int i15 = 0; i15 < this.mobileCountryCode_.size(); i15++) {
                iD = f3.d(this.mobileCountryCode_, i15, iD);
            }
            int size = getMobileCountryCodeList().size() + iD;
            int iD2 = 0;
            for (int i16 = 0; i16 < this.isoCountryCode_.size(); i16++) {
                iD2 = f3.d(this.isoCountryCode_, i16, iD2);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + getIsoCountryCodeList().size() + size + iD2;
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
            if (getMobileCountryCodeCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getMobileCountryCodeList().hashCode();
            }
            if (getIsoCountryCodeCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getIsoCountryCodeList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_MobileCarrierInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(MobileCarrierInfoResponse.class, Builder.class);
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
            return new MobileCarrierInfoResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int i14;
            int iE = 0;
            int iE2 = 0;
            while (true) {
                i14 = 1;
                if (iE2 >= this.mobileCountryCode_.size()) {
                    break;
                } else {
                    iE2 = f3.e(this.mobileCountryCode_, iE2, codedOutputStream, 1, iE2, 1);
                }
            }
            CodedOutputStream codedOutputStream2 = codedOutputStream;
            while (iE < this.isoCountryCode_.size()) {
                CodedOutputStream codedOutputStream3 = codedOutputStream2;
                int i15 = i14;
                iE = f3.e(this.isoCountryCode_, iE, codedOutputStream3, 2, iE, i15);
                codedOutputStream2 = codedOutputStream3;
                i14 = i15;
            }
            getUnknownFields().writeTo(codedOutputStream2);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MobileCarrierInfoResponseOrBuilder {
            private int bitField0_;
            private LazyStringArrayList isoCountryCode_;
            private LazyStringArrayList mobileCountryCode_;

            private Builder() {
                this.mobileCountryCode_ = LazyStringArrayList.emptyList();
                this.isoCountryCode_ = LazyStringArrayList.emptyList();
            }

            private void buildPartial0(MobileCarrierInfoResponse mobileCarrierInfoResponse) {
                int i14 = this.bitField0_;
                if ((i14 & 1) != 0) {
                    this.mobileCountryCode_.makeImmutable();
                    mobileCarrierInfoResponse.mobileCountryCode_ = this.mobileCountryCode_;
                }
                if ((i14 & 2) != 0) {
                    this.isoCountryCode_.makeImmutable();
                    mobileCarrierInfoResponse.isoCountryCode_ = this.isoCountryCode_;
                }
            }

            private void ensureIsoCountryCodeIsMutable() {
                if (!this.isoCountryCode_.isModifiable()) {
                    this.isoCountryCode_ = new LazyStringArrayList((LazyStringList) this.isoCountryCode_);
                }
                this.bitField0_ |= 2;
            }

            private void ensureMobileCountryCodeIsMutable() {
                if (!this.mobileCountryCode_.isModifiable()) {
                    this.mobileCountryCode_ = new LazyStringArrayList((LazyStringList) this.mobileCountryCode_);
                }
                this.bitField0_ |= 1;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_MobileCarrierInfoResponse_descriptor;
            }

            public Builder addAllIsoCountryCode(Iterable<String> iterable) {
                ensureIsoCountryCodeIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.isoCountryCode_);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder addAllMobileCountryCode(Iterable<String> iterable) {
                ensureMobileCountryCodeIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.mobileCountryCode_);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder addIsoCountryCode(String str) {
                str.getClass();
                ensureIsoCountryCodeIsMutable();
                this.isoCountryCode_.add(str);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder addIsoCountryCodeBytes(ByteString byteString) {
                byteString.getClass();
                ensureIsoCountryCodeIsMutable();
                this.isoCountryCode_.add(byteString);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder addMobileCountryCode(String str) {
                str.getClass();
                ensureMobileCountryCodeIsMutable();
                this.mobileCountryCode_.add(str);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder addMobileCountryCodeBytes(ByteString byteString) {
                byteString.getClass();
                ensureMobileCountryCodeIsMutable();
                this.mobileCountryCode_.add(byteString);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MobileCarrierInfoResponse build() {
                MobileCarrierInfoResponse mobileCarrierInfoResponseBuildPartial = buildPartial();
                if (mobileCarrierInfoResponseBuildPartial.isInitialized()) {
                    return mobileCarrierInfoResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) mobileCarrierInfoResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MobileCarrierInfoResponse buildPartial() {
                MobileCarrierInfoResponse mobileCarrierInfoResponse = new MobileCarrierInfoResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(mobileCarrierInfoResponse);
                }
                onBuilt();
                return mobileCarrierInfoResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.mobileCountryCode_ = LazyStringArrayList.emptyList();
                this.isoCountryCode_ = LazyStringArrayList.emptyList();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIsoCountryCode() {
                this.isoCountryCode_ = LazyStringArrayList.emptyList();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearMobileCountryCode() {
                this.mobileCountryCode_ = LazyStringArrayList.emptyList();
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
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_MobileCarrierInfoResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.MobileCarrierInfoResponseOrBuilder
            public String getIsoCountryCode(int i14) {
                return this.isoCountryCode_.get(i14);
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.MobileCarrierInfoResponseOrBuilder
            public ByteString getIsoCountryCodeBytes(int i14) {
                return this.isoCountryCode_.getByteString(i14);
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.MobileCarrierInfoResponseOrBuilder
            public int getIsoCountryCodeCount() {
                return this.isoCountryCode_.size();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.MobileCarrierInfoResponseOrBuilder
            public ProtocolStringList getIsoCountryCodeList() {
                this.isoCountryCode_.makeImmutable();
                return this.isoCountryCode_;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.MobileCarrierInfoResponseOrBuilder
            public String getMobileCountryCode(int i14) {
                return this.mobileCountryCode_.get(i14);
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.MobileCarrierInfoResponseOrBuilder
            public ByteString getMobileCountryCodeBytes(int i14) {
                return this.mobileCountryCode_.getByteString(i14);
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.MobileCarrierInfoResponseOrBuilder
            public int getMobileCountryCodeCount() {
                return this.mobileCountryCode_.size();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.MobileCarrierInfoResponseOrBuilder
            public ProtocolStringList getMobileCountryCodeList() {
                this.mobileCountryCode_.makeImmutable();
                return this.mobileCountryCode_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_MobileCarrierInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(MobileCarrierInfoResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(MobileCarrierInfoResponse mobileCarrierInfoResponse) {
                if (mobileCarrierInfoResponse == MobileCarrierInfoResponse.getDefaultInstance()) {
                    return this;
                }
                if (!mobileCarrierInfoResponse.mobileCountryCode_.isEmpty()) {
                    if (this.mobileCountryCode_.isEmpty()) {
                        this.mobileCountryCode_ = mobileCarrierInfoResponse.mobileCountryCode_;
                        this.bitField0_ |= 1;
                    } else {
                        ensureMobileCountryCodeIsMutable();
                        this.mobileCountryCode_.addAll(mobileCarrierInfoResponse.mobileCountryCode_);
                    }
                    onChanged();
                }
                if (!mobileCarrierInfoResponse.isoCountryCode_.isEmpty()) {
                    if (this.isoCountryCode_.isEmpty()) {
                        this.isoCountryCode_ = mobileCarrierInfoResponse.isoCountryCode_;
                        this.bitField0_ |= 2;
                    } else {
                        ensureIsoCountryCodeIsMutable();
                        this.isoCountryCode_.addAll(mobileCarrierInfoResponse.isoCountryCode_);
                    }
                    onChanged();
                }
                mergeUnknownFields(mobileCarrierInfoResponse.getUnknownFields());
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

            public Builder setIsoCountryCode(int i14, String str) {
                str.getClass();
                ensureIsoCountryCodeIsMutable();
                this.isoCountryCode_.set(i14, str);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMobileCountryCode(int i14, String str) {
                str.getClass();
                ensureMobileCountryCodeIsMutable();
                this.mobileCountryCode_.set(i14, str);
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
            public MobileCarrierInfoResponse getDefaultInstanceForType() {
                return MobileCarrierInfoResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.mobileCountryCode_ = LazyStringArrayList.emptyList();
                this.isoCountryCode_ = LazyStringArrayList.emptyList();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MobileCarrierInfoResponse) {
                    return mergeFrom((MobileCarrierInfoResponse) message);
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
                                    ByteString bytes = codedInputStream.readBytes();
                                    ensureMobileCountryCodeIsMutable();
                                    this.mobileCountryCode_.add(bytes);
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    ByteString bytes2 = codedInputStream.readBytes();
                                    ensureIsoCountryCodeIsMutable();
                                    this.isoCountryCode_.add(bytes2);
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

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.MobileCarrierInfoResponseOrBuilder
        public ProtocolStringList getIsoCountryCodeList() {
            return this.isoCountryCode_;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.MobileCarrierInfoResponseOrBuilder
        public ProtocolStringList getMobileCountryCodeList() {
            return this.mobileCountryCode_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MobileCarrierInfoResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static MobileCarrierInfoResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MobileCarrierInfoResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MobileCarrierInfoResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static MobileCarrierInfoResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MobileCarrierInfoResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static MobileCarrierInfoResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static MobileCarrierInfoResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MobileCarrierInfoResponse parseFrom(InputStream inputStream) {
            return (MobileCarrierInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static MobileCarrierInfoResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MobileCarrierInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MobileCarrierInfoResponse parseFrom(CodedInputStream codedInputStream) {
            return (MobileCarrierInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MobileCarrierInfoResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MobileCarrierInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private MobileCarrierInfoResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.mobileCountryCode_ = LazyStringArrayList.emptyList();
            this.isoCountryCode_ = LazyStringArrayList.emptyList();
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ MobileCarrierInfoResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class PasswordGeneration extends GeneratedMessageV3 implements PasswordGenerationOrBuilder {
        private static final PasswordGeneration DEFAULT_INSTANCE = new PasswordGeneration();

        @Deprecated
        public static final Parser<PasswordGeneration> PARSER = new AbstractParser<PasswordGeneration>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.PasswordGeneration.1
            @Override // com.google.protobuf.Parser
            public PasswordGeneration parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PasswordGeneration.newBuilder();
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
        public static final int PASSWORD_SEED_FIELD_NUMBER = 2;
        public static final int STRATEGY_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object passwordSeed_;
        private int strategy_;

        private PasswordGeneration() {
            this.strategy_ = 0;
            this.passwordSeed_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.strategy_ = 0;
            this.passwordSeed_ = "";
        }

        public static PasswordGeneration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_PasswordGeneration_descriptor;
        }

        public static Builder newBuilder(PasswordGeneration passwordGeneration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(passwordGeneration);
        }

        public static PasswordGeneration parseDelimitedFrom(InputStream inputStream) {
            return (PasswordGeneration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PasswordGeneration parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PasswordGeneration> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PasswordGeneration)) {
                return super.equals(obj);
            }
            PasswordGeneration passwordGeneration = (PasswordGeneration) obj;
            if (hasStrategy() != passwordGeneration.hasStrategy()) {
                return false;
            }
            if ((!hasStrategy() || this.strategy_ == passwordGeneration.strategy_) && hasPasswordSeed() == passwordGeneration.hasPasswordSeed()) {
                return (!hasPasswordSeed() || getPasswordSeed().equals(passwordGeneration.getPasswordSeed())) && getUnknownFields().equals(passwordGeneration.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PasswordGeneration> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.PasswordGenerationOrBuilder
        public String getPasswordSeed() {
            Object obj = this.passwordSeed_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.passwordSeed_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.PasswordGenerationOrBuilder
        public ByteString getPasswordSeedBytes() {
            Object obj = this.passwordSeed_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.passwordSeed_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.strategy_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += GeneratedMessageV3.computeStringSize(2, this.passwordSeed_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.PasswordGenerationOrBuilder
        public PasswordGenerationStrategy getStrategy() {
            PasswordGenerationStrategy passwordGenerationStrategyForNumber = PasswordGenerationStrategy.forNumber(this.strategy_);
            return passwordGenerationStrategyForNumber == null ? PasswordGenerationStrategy.PASSWORD_GENERATION_STRATEGY_UNKNOWN : passwordGenerationStrategyForNumber;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.PasswordGenerationOrBuilder
        public boolean hasPasswordSeed() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.PasswordGenerationOrBuilder
        public boolean hasStrategy() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStrategy()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.strategy_;
            }
            if (hasPasswordSeed()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getPasswordSeed().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_PasswordGeneration_fieldAccessorTable.ensureFieldAccessorsInitialized(PasswordGeneration.class, Builder.class);
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
            return new PasswordGeneration();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.strategy_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.passwordSeed_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PasswordGenerationOrBuilder {
            private int bitField0_;
            private Object passwordSeed_;
            private int strategy_;

            private Builder() {
                this.strategy_ = 0;
                this.passwordSeed_ = "";
            }

            private void buildPartial0(PasswordGeneration passwordGeneration) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    passwordGeneration.strategy_ = this.strategy_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    passwordGeneration.passwordSeed_ = this.passwordSeed_;
                    i14 |= 2;
                }
                passwordGeneration.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_PasswordGeneration_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PasswordGeneration build() {
                PasswordGeneration passwordGenerationBuildPartial = buildPartial();
                if (passwordGenerationBuildPartial.isInitialized()) {
                    return passwordGenerationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) passwordGenerationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PasswordGeneration buildPartial() {
                PasswordGeneration passwordGeneration = new PasswordGeneration(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(passwordGeneration);
                }
                onBuilt();
                return passwordGeneration;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.strategy_ = 0;
                this.passwordSeed_ = "";
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

            public Builder clearPasswordSeed() {
                this.passwordSeed_ = PasswordGeneration.getDefaultInstance().getPasswordSeed();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearStrategy() {
                this.bitField0_ &= -2;
                this.strategy_ = 0;
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
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_PasswordGeneration_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.PasswordGenerationOrBuilder
            public String getPasswordSeed() {
                Object obj = this.passwordSeed_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.passwordSeed_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.PasswordGenerationOrBuilder
            public ByteString getPasswordSeedBytes() {
                Object obj = this.passwordSeed_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.passwordSeed_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.PasswordGenerationOrBuilder
            public PasswordGenerationStrategy getStrategy() {
                PasswordGenerationStrategy passwordGenerationStrategyForNumber = PasswordGenerationStrategy.forNumber(this.strategy_);
                return passwordGenerationStrategyForNumber == null ? PasswordGenerationStrategy.PASSWORD_GENERATION_STRATEGY_UNKNOWN : passwordGenerationStrategyForNumber;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.PasswordGenerationOrBuilder
            public boolean hasPasswordSeed() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.PasswordGenerationOrBuilder
            public boolean hasStrategy() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_PasswordGeneration_fieldAccessorTable.ensureFieldAccessorsInitialized(PasswordGeneration.class, Builder.class);
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
                                    if (PasswordGenerationStrategy.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.strategy_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    this.passwordSeed_ = codedInputStream.readBytes();
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

            public Builder setPasswordSeed(String str) {
                str.getClass();
                this.passwordSeed_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPasswordSeedBytes(ByteString byteString) {
                byteString.getClass();
                this.passwordSeed_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStrategy(PasswordGenerationStrategy passwordGenerationStrategy) {
                passwordGenerationStrategy.getClass();
                this.bitField0_ |= 1;
                this.strategy_ = passwordGenerationStrategy.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public PasswordGeneration getDefaultInstanceForType() {
                return PasswordGeneration.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.strategy_ = 0;
                this.passwordSeed_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PasswordGeneration) {
                    return mergeFrom((PasswordGeneration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PasswordGeneration passwordGeneration) {
                if (passwordGeneration == PasswordGeneration.getDefaultInstance()) {
                    return this;
                }
                if (passwordGeneration.hasStrategy()) {
                    setStrategy(passwordGeneration.getStrategy());
                }
                if (passwordGeneration.hasPasswordSeed()) {
                    this.passwordSeed_ = passwordGeneration.passwordSeed_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(passwordGeneration.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PasswordGeneration getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static PasswordGeneration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PasswordGeneration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PasswordGeneration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PasswordGeneration parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PasswordGeneration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PasswordGeneration parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PasswordGeneration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PasswordGeneration parseFrom(InputStream inputStream) {
            return (PasswordGeneration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PasswordGeneration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PasswordGeneration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private PasswordGeneration(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.strategy_ = 0;
            this.passwordSeed_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PasswordGeneration parseFrom(CodedInputStream codedInputStream) {
            return (PasswordGeneration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PasswordGeneration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PasswordGeneration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ PasswordGeneration(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public enum PasswordGenerationStrategy implements ProtocolMessageEnum {
            PASSWORD_GENERATION_STRATEGY_UNKNOWN(0),
            PASSWORD_GENERATION_STRATEGY_USE_EXISTING(1),
            PASSWORD_GENERATION_STRATEGY_SEND_EXPLICIT(2),
            PASSWORD_GENERATION_STRATEGY_USE_SPECIFIED_SEED(3);

            public static final int PASSWORD_GENERATION_STRATEGY_SEND_EXPLICIT_VALUE = 2;
            public static final int PASSWORD_GENERATION_STRATEGY_UNKNOWN_VALUE = 0;
            public static final int PASSWORD_GENERATION_STRATEGY_USE_EXISTING_VALUE = 1;
            public static final int PASSWORD_GENERATION_STRATEGY_USE_SPECIFIED_SEED_VALUE = 3;
            private final int value;
            private static final Internal.EnumLiteMap<PasswordGenerationStrategy> internalValueMap = new Internal.EnumLiteMap<PasswordGenerationStrategy>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.PasswordGeneration.PasswordGenerationStrategy.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public PasswordGenerationStrategy findValueByNumber(int i14) {
                    return PasswordGenerationStrategy.forNumber(i14);
                }
            };
            private static final PasswordGenerationStrategy[] VALUES = values();

            PasswordGenerationStrategy(int i14) {
                this.value = i14;
            }

            public static PasswordGenerationStrategy forNumber(int i14) {
                if (i14 == 0) {
                    return PASSWORD_GENERATION_STRATEGY_UNKNOWN;
                }
                if (i14 == 1) {
                    return PASSWORD_GENERATION_STRATEGY_USE_EXISTING;
                }
                if (i14 == 2) {
                    return PASSWORD_GENERATION_STRATEGY_SEND_EXPLICIT;
                }
                if (i14 != 3) {
                    return null;
                }
                return PASSWORD_GENERATION_STRATEGY_USE_SPECIFIED_SEED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return PasswordGeneration.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<PasswordGenerationStrategy> internalGetValueMap() {
                return internalValueMap;
            }

            public static PasswordGenerationStrategy valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static PasswordGenerationStrategy valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class RemoveWifiNetworkRequest extends GeneratedMessageV3 implements RemoveWifiNetworkRequestOrBuilder {
        private static final RemoveWifiNetworkRequest DEFAULT_INSTANCE = new RemoveWifiNetworkRequest();

        @Deprecated
        public static final Parser<RemoveWifiNetworkRequest> PARSER = new AbstractParser<RemoveWifiNetworkRequest>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.RemoveWifiNetworkRequest.1
            @Override // com.google.protobuf.Parser
            public RemoveWifiNetworkRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RemoveWifiNetworkRequest.newBuilder();
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
        public static final int SSID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object ssid_;

        private RemoveWifiNetworkRequest() {
            this.ssid_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.ssid_ = "";
        }

        public static RemoveWifiNetworkRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_RemoveWifiNetworkRequest_descriptor;
        }

        public static Builder newBuilder(RemoveWifiNetworkRequest removeWifiNetworkRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(removeWifiNetworkRequest);
        }

        public static RemoveWifiNetworkRequest parseDelimitedFrom(InputStream inputStream) {
            return (RemoveWifiNetworkRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RemoveWifiNetworkRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RemoveWifiNetworkRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RemoveWifiNetworkRequest)) {
                return super.equals(obj);
            }
            RemoveWifiNetworkRequest removeWifiNetworkRequest = (RemoveWifiNetworkRequest) obj;
            if (hasSsid() != removeWifiNetworkRequest.hasSsid()) {
                return false;
            }
            return (!hasSsid() || getSsid().equals(removeWifiNetworkRequest.getSsid())) && getUnknownFields().equals(removeWifiNetworkRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RemoveWifiNetworkRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.ssid_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.RemoveWifiNetworkRequestOrBuilder
        public String getSsid() {
            Object obj = this.ssid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.ssid_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.RemoveWifiNetworkRequestOrBuilder
        public ByteString getSsidBytes() {
            Object obj = this.ssid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ssid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.RemoveWifiNetworkRequestOrBuilder
        public boolean hasSsid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSsid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSsid().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_RemoveWifiNetworkRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RemoveWifiNetworkRequest.class, Builder.class);
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
            return new RemoveWifiNetworkRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.ssid_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RemoveWifiNetworkRequestOrBuilder {
            private int bitField0_;
            private Object ssid_;

            private Builder() {
                this.ssid_ = "";
            }

            private void buildPartial0(RemoveWifiNetworkRequest removeWifiNetworkRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    removeWifiNetworkRequest.ssid_ = this.ssid_;
                } else {
                    i14 = 0;
                }
                removeWifiNetworkRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_RemoveWifiNetworkRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RemoveWifiNetworkRequest build() {
                RemoveWifiNetworkRequest removeWifiNetworkRequestBuildPartial = buildPartial();
                if (removeWifiNetworkRequestBuildPartial.isInitialized()) {
                    return removeWifiNetworkRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) removeWifiNetworkRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RemoveWifiNetworkRequest buildPartial() {
                RemoveWifiNetworkRequest removeWifiNetworkRequest = new RemoveWifiNetworkRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(removeWifiNetworkRequest);
                }
                onBuilt();
                return removeWifiNetworkRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.ssid_ = "";
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

            public Builder clearSsid() {
                this.ssid_ = RemoveWifiNetworkRequest.getDefaultInstance().getSsid();
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
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_RemoveWifiNetworkRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.RemoveWifiNetworkRequestOrBuilder
            public String getSsid() {
                Object obj = this.ssid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.ssid_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.RemoveWifiNetworkRequestOrBuilder
            public ByteString getSsidBytes() {
                Object obj = this.ssid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ssid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.RemoveWifiNetworkRequestOrBuilder
            public boolean hasSsid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_RemoveWifiNetworkRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RemoveWifiNetworkRequest.class, Builder.class);
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
                                    this.ssid_ = codedInputStream.readBytes();
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

            public Builder setSsid(String str) {
                str.getClass();
                this.ssid_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSsidBytes(ByteString byteString) {
                byteString.getClass();
                this.ssid_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public RemoveWifiNetworkRequest getDefaultInstanceForType() {
                return RemoveWifiNetworkRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.ssid_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RemoveWifiNetworkRequest) {
                    return mergeFrom((RemoveWifiNetworkRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RemoveWifiNetworkRequest removeWifiNetworkRequest) {
                if (removeWifiNetworkRequest == RemoveWifiNetworkRequest.getDefaultInstance()) {
                    return this;
                }
                if (removeWifiNetworkRequest.hasSsid()) {
                    this.ssid_ = removeWifiNetworkRequest.ssid_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                mergeUnknownFields(removeWifiNetworkRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RemoveWifiNetworkRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static RemoveWifiNetworkRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemoveWifiNetworkRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RemoveWifiNetworkRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static RemoveWifiNetworkRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RemoveWifiNetworkRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RemoveWifiNetworkRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private RemoveWifiNetworkRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.ssid_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RemoveWifiNetworkRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static RemoveWifiNetworkRequest parseFrom(InputStream inputStream) {
            return (RemoveWifiNetworkRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ RemoveWifiNetworkRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static RemoveWifiNetworkRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemoveWifiNetworkRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RemoveWifiNetworkRequest parseFrom(CodedInputStream codedInputStream) {
            return (RemoveWifiNetworkRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RemoveWifiNetworkRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemoveWifiNetworkRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SaveWifiNetworkRequest extends GeneratedMessageV3 implements SaveWifiNetworkRequestOrBuilder {
        public static final int AP_FIELD_NUMBER = 1;
        private static final SaveWifiNetworkRequest DEFAULT_INSTANCE = new SaveWifiNetworkRequest();

        @Deprecated
        public static final Parser<SaveWifiNetworkRequest> PARSER = new AbstractParser<SaveWifiNetworkRequest>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.SaveWifiNetworkRequest.1
            @Override // com.google.protobuf.Parser
            public SaveWifiNetworkRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SaveWifiNetworkRequest.newBuilder();
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
        private WifiSetup.StoredAccessPoint ap_;
        private int bitField0_;
        private byte memoizedIsInitialized;

        private SaveWifiNetworkRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SaveWifiNetworkRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_SaveWifiNetworkRequest_descriptor;
        }

        public static Builder newBuilder(SaveWifiNetworkRequest saveWifiNetworkRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(saveWifiNetworkRequest);
        }

        public static SaveWifiNetworkRequest parseDelimitedFrom(InputStream inputStream) {
            return (SaveWifiNetworkRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SaveWifiNetworkRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SaveWifiNetworkRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SaveWifiNetworkRequest)) {
                return super.equals(obj);
            }
            SaveWifiNetworkRequest saveWifiNetworkRequest = (SaveWifiNetworkRequest) obj;
            if (hasAp() != saveWifiNetworkRequest.hasAp()) {
                return false;
            }
            return (!hasAp() || getAp().equals(saveWifiNetworkRequest.getAp())) && getUnknownFields().equals(saveWifiNetworkRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SaveWifiNetworkRequestOrBuilder
        public WifiSetup.StoredAccessPoint getAp() {
            WifiSetup.StoredAccessPoint storedAccessPoint = this.ap_;
            return storedAccessPoint == null ? WifiSetup.StoredAccessPoint.getDefaultInstance() : storedAccessPoint;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SaveWifiNetworkRequestOrBuilder
        public WifiSetup.StoredAccessPointOrBuilder getApOrBuilder() {
            WifiSetup.StoredAccessPoint storedAccessPoint = this.ap_;
            return storedAccessPoint == null ? WifiSetup.StoredAccessPoint.getDefaultInstance() : storedAccessPoint;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SaveWifiNetworkRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getAp()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SaveWifiNetworkRequestOrBuilder
        public boolean hasAp() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAp()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getAp().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_SaveWifiNetworkRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SaveWifiNetworkRequest.class, Builder.class);
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
            if (!hasAp() || getAp().isInitialized()) {
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
            return new SaveWifiNetworkRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getAp());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SaveWifiNetworkRequestOrBuilder {
            private SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> apBuilder_;
            private WifiSetup.StoredAccessPoint ap_;
            private int bitField0_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SaveWifiNetworkRequest saveWifiNetworkRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.apBuilder_;
                    saveWifiNetworkRequest.ap_ = singleFieldBuilderV3 == null ? this.ap_ : (WifiSetup.StoredAccessPoint) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                saveWifiNetworkRequest.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> getApFieldBuilder() {
                if (this.apBuilder_ == null) {
                    this.apBuilder_ = new SingleFieldBuilderV3<>(getAp(), getParentForChildren(), isClean());
                    this.ap_ = null;
                }
                return this.apBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_SaveWifiNetworkRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getApFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SaveWifiNetworkRequest build() {
                SaveWifiNetworkRequest saveWifiNetworkRequestBuildPartial = buildPartial();
                if (saveWifiNetworkRequestBuildPartial.isInitialized()) {
                    return saveWifiNetworkRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) saveWifiNetworkRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SaveWifiNetworkRequest buildPartial() {
                SaveWifiNetworkRequest saveWifiNetworkRequest = new SaveWifiNetworkRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(saveWifiNetworkRequest);
                }
                onBuilt();
                return saveWifiNetworkRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.ap_ = null;
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.apBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.apBuilder_ = null;
                }
                return this;
            }

            public Builder clearAp() {
                this.bitField0_ &= -2;
                this.ap_ = null;
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.apBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.apBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SaveWifiNetworkRequestOrBuilder
            public WifiSetup.StoredAccessPoint getAp() {
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.apBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WifiSetup.StoredAccessPoint) singleFieldBuilderV3.getMessage();
                }
                WifiSetup.StoredAccessPoint storedAccessPoint = this.ap_;
                return storedAccessPoint == null ? WifiSetup.StoredAccessPoint.getDefaultInstance() : storedAccessPoint;
            }

            public WifiSetup.StoredAccessPoint.Builder getApBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (WifiSetup.StoredAccessPoint.Builder) getApFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SaveWifiNetworkRequestOrBuilder
            public WifiSetup.StoredAccessPointOrBuilder getApOrBuilder() {
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.apBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WifiSetup.StoredAccessPointOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WifiSetup.StoredAccessPoint storedAccessPoint = this.ap_;
                return storedAccessPoint == null ? WifiSetup.StoredAccessPoint.getDefaultInstance() : storedAccessPoint;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_SaveWifiNetworkRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SaveWifiNetworkRequestOrBuilder
            public boolean hasAp() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_SaveWifiNetworkRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SaveWifiNetworkRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasAp() || getAp().isInitialized();
            }

            public Builder mergeAp(WifiSetup.StoredAccessPoint storedAccessPoint) {
                WifiSetup.StoredAccessPoint storedAccessPoint2;
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.apBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(storedAccessPoint);
                } else if ((this.bitField0_ & 1) == 0 || (storedAccessPoint2 = this.ap_) == null || storedAccessPoint2 == WifiSetup.StoredAccessPoint.getDefaultInstance()) {
                    this.ap_ = storedAccessPoint;
                } else {
                    getApBuilder().mergeFrom(storedAccessPoint);
                }
                if (this.ap_ != null) {
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
                                    codedInputStream.readMessage(getApFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setAp(WifiSetup.StoredAccessPoint.Builder builder) {
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.apBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ap_ = builder.build();
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
            public SaveWifiNetworkRequest getDefaultInstanceForType() {
                return SaveWifiNetworkRequest.getDefaultInstance();
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

            public Builder setAp(WifiSetup.StoredAccessPoint storedAccessPoint) {
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.apBuilder_;
                if (singleFieldBuilderV3 == null) {
                    storedAccessPoint.getClass();
                    this.ap_ = storedAccessPoint;
                } else {
                    singleFieldBuilderV3.setMessage(storedAccessPoint);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SaveWifiNetworkRequest) {
                    return mergeFrom((SaveWifiNetworkRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SaveWifiNetworkRequest saveWifiNetworkRequest) {
                if (saveWifiNetworkRequest == SaveWifiNetworkRequest.getDefaultInstance()) {
                    return this;
                }
                if (saveWifiNetworkRequest.hasAp()) {
                    mergeAp(saveWifiNetworkRequest.getAp());
                }
                mergeUnknownFields(saveWifiNetworkRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SaveWifiNetworkRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SaveWifiNetworkRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SaveWifiNetworkRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SaveWifiNetworkRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SaveWifiNetworkRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SaveWifiNetworkRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SaveWifiNetworkRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SaveWifiNetworkRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SaveWifiNetworkRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SaveWifiNetworkRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SaveWifiNetworkRequest parseFrom(InputStream inputStream) {
            return (SaveWifiNetworkRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SaveWifiNetworkRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SaveWifiNetworkRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SaveWifiNetworkRequest parseFrom(CodedInputStream codedInputStream) {
            return (SaveWifiNetworkRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SaveWifiNetworkRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SaveWifiNetworkRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ScanCompleteNotification extends GeneratedMessageV3 implements ScanCompleteNotificationOrBuilder {
        private static final ScanCompleteNotification DEFAULT_INSTANCE = new ScanCompleteNotification();

        @Deprecated
        public static final Parser<ScanCompleteNotification> PARSER = new AbstractParser<ScanCompleteNotification>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.ScanCompleteNotification.1
            @Override // com.google.protobuf.Parser
            public ScanCompleteNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ScanCompleteNotification.newBuilder();
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
        public static final int SCANNED_APS_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private List<WifiSetup.ScannedAccessPoint> scannedAps_;
        private int status_;

        private ScanCompleteNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.scannedAps_ = Collections.EMPTY_LIST;
        }

        public static ScanCompleteNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ScanCompleteNotification_descriptor;
        }

        public static Builder newBuilder(ScanCompleteNotification scanCompleteNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(scanCompleteNotification);
        }

        public static ScanCompleteNotification parseDelimitedFrom(InputStream inputStream) {
            return (ScanCompleteNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ScanCompleteNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ScanCompleteNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ScanCompleteNotification)) {
                return super.equals(obj);
            }
            ScanCompleteNotification scanCompleteNotification = (ScanCompleteNotification) obj;
            if (hasStatus() != scanCompleteNotification.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == scanCompleteNotification.status_) && getScannedApsList().equals(scanCompleteNotification.getScannedApsList()) && getUnknownFields().equals(scanCompleteNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ScanCompleteNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ScanCompleteNotificationOrBuilder
        public WifiSetup.ScannedAccessPoint getScannedAps(int i14) {
            return this.scannedAps_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ScanCompleteNotificationOrBuilder
        public int getScannedApsCount() {
            return this.scannedAps_.size();
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ScanCompleteNotificationOrBuilder
        public List<WifiSetup.ScannedAccessPoint> getScannedApsList() {
            return this.scannedAps_;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ScanCompleteNotificationOrBuilder
        public WifiSetup.ScannedAccessPointOrBuilder getScannedApsOrBuilder(int i14) {
            return this.scannedAps_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ScanCompleteNotificationOrBuilder
        public List<? extends WifiSetup.ScannedAccessPointOrBuilder> getScannedApsOrBuilderList() {
            return this.scannedAps_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            for (int i15 = 0; i15 < this.scannedAps_.size(); i15++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.scannedAps_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ScanCompleteNotificationOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ScanCompleteNotificationOrBuilder
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
            if (getScannedApsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getScannedApsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ScanCompleteNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ScanCompleteNotification.class, Builder.class);
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
            for (int i14 = 0; i14 < getScannedApsCount(); i14++) {
                if (!getScannedAps(i14).isInitialized()) {
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
            return new ScanCompleteNotification();
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
            for (int i14 = 0; i14 < this.scannedAps_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.scannedAps_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ScanCompleteNotificationOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> scannedApsBuilder_;
            private List<WifiSetup.ScannedAccessPoint> scannedAps_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                this.scannedAps_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(ScanCompleteNotification scanCompleteNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    scanCompleteNotification.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                scanCompleteNotification.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(ScanCompleteNotification scanCompleteNotification) {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    scanCompleteNotification.scannedAps_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.scannedAps_ = Collections.unmodifiableList(this.scannedAps_);
                    this.bitField0_ &= -3;
                }
                scanCompleteNotification.scannedAps_ = this.scannedAps_;
            }

            private void ensureScannedApsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.scannedAps_ = new ArrayList(this.scannedAps_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ScanCompleteNotification_descriptor;
            }

            private RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> getScannedApsFieldBuilder() {
                if (this.scannedApsBuilder_ == null) {
                    this.scannedApsBuilder_ = new RepeatedFieldBuilderV3<>(this.scannedAps_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.scannedAps_ = null;
                }
                return this.scannedApsBuilder_;
            }

            public Builder addAllScannedAps(Iterable<? extends WifiSetup.ScannedAccessPoint> iterable) {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureScannedApsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.scannedAps_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addScannedAps(WifiSetup.ScannedAccessPoint.Builder builder) {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureScannedApsIsMutable();
                this.scannedAps_.add(builder.build());
                onChanged();
                return this;
            }

            public WifiSetup.ScannedAccessPoint.Builder addScannedApsBuilder() {
                return (WifiSetup.ScannedAccessPoint.Builder) getScannedApsFieldBuilder().addBuilder(WifiSetup.ScannedAccessPoint.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ScanCompleteNotification build() {
                ScanCompleteNotification scanCompleteNotificationBuildPartial = buildPartial();
                if (scanCompleteNotificationBuildPartial.isInitialized()) {
                    return scanCompleteNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) scanCompleteNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ScanCompleteNotification buildPartial() {
                ScanCompleteNotification scanCompleteNotification = new ScanCompleteNotification(this);
                buildPartialRepeatedFields(scanCompleteNotification);
                if (this.bitField0_ != 0) {
                    buildPartial0(scanCompleteNotification);
                }
                onBuilt();
                return scanCompleteNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.scannedAps_ = Collections.EMPTY_LIST;
                } else {
                    this.scannedAps_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
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

            public Builder clearScannedAps() {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.scannedAps_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
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
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ScanCompleteNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ScanCompleteNotificationOrBuilder
            public WifiSetup.ScannedAccessPoint getScannedAps(int i14) {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.scannedAps_.get(i14) : (WifiSetup.ScannedAccessPoint) repeatedFieldBuilderV3.getMessage(i14);
            }

            public WifiSetup.ScannedAccessPoint.Builder getScannedApsBuilder(int i14) {
                return (WifiSetup.ScannedAccessPoint.Builder) getScannedApsFieldBuilder().getBuilder(i14);
            }

            public List<WifiSetup.ScannedAccessPoint.Builder> getScannedApsBuilderList() {
                return getScannedApsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ScanCompleteNotificationOrBuilder
            public int getScannedApsCount() {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.scannedAps_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ScanCompleteNotificationOrBuilder
            public List<WifiSetup.ScannedAccessPoint> getScannedApsList() {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.scannedAps_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ScanCompleteNotificationOrBuilder
            public WifiSetup.ScannedAccessPointOrBuilder getScannedApsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.scannedAps_.get(i14) : (WifiSetup.ScannedAccessPointOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ScanCompleteNotificationOrBuilder
            public List<? extends WifiSetup.ScannedAccessPointOrBuilder> getScannedApsOrBuilderList() {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.scannedAps_);
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ScanCompleteNotificationOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ScanCompleteNotificationOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ScanCompleteNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ScanCompleteNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getScannedApsCount(); i14++) {
                    if (!getScannedAps(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(ScanCompleteNotification scanCompleteNotification) {
                if (scanCompleteNotification == ScanCompleteNotification.getDefaultInstance()) {
                    return this;
                }
                if (scanCompleteNotification.hasStatus()) {
                    setStatus(scanCompleteNotification.getStatus());
                }
                if (this.scannedApsBuilder_ == null) {
                    if (!scanCompleteNotification.scannedAps_.isEmpty()) {
                        if (this.scannedAps_.isEmpty()) {
                            this.scannedAps_ = scanCompleteNotification.scannedAps_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureScannedApsIsMutable();
                            this.scannedAps_.addAll(scanCompleteNotification.scannedAps_);
                        }
                        onChanged();
                    }
                } else if (!scanCompleteNotification.scannedAps_.isEmpty()) {
                    boolean zIsEmpty = this.scannedApsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.scannedApsBuilder_ = null;
                        this.scannedAps_ = scanCompleteNotification.scannedAps_;
                        this.bitField0_ &= -3;
                        this.scannedApsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getScannedApsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(scanCompleteNotification.scannedAps_);
                    }
                }
                mergeUnknownFields(scanCompleteNotification.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeScannedAps(int i14) {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureScannedApsIsMutable();
                this.scannedAps_.remove(i14);
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

            public Builder setScannedAps(int i14, WifiSetup.ScannedAccessPoint.Builder builder) {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureScannedApsIsMutable();
                this.scannedAps_.set(i14, builder.build());
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
            public ScanCompleteNotification getDefaultInstanceForType() {
                return ScanCompleteNotification.getDefaultInstance();
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
                this.scannedAps_ = Collections.EMPTY_LIST;
            }

            public WifiSetup.ScannedAccessPoint.Builder addScannedApsBuilder(int i14) {
                return (WifiSetup.ScannedAccessPoint.Builder) getScannedApsFieldBuilder().addBuilder(i14, WifiSetup.ScannedAccessPoint.getDefaultInstance());
            }

            public Builder addScannedAps(int i14, WifiSetup.ScannedAccessPoint scannedAccessPoint) {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    scannedAccessPoint.getClass();
                    ensureScannedApsIsMutable();
                    this.scannedAps_.add(i14, scannedAccessPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, scannedAccessPoint);
                return this;
            }

            public Builder setScannedAps(int i14, WifiSetup.ScannedAccessPoint scannedAccessPoint) {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    scannedAccessPoint.getClass();
                    ensureScannedApsIsMutable();
                    this.scannedAps_.set(i14, scannedAccessPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, scannedAccessPoint);
                return this;
            }

            public Builder addScannedAps(WifiSetup.ScannedAccessPoint scannedAccessPoint) {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    scannedAccessPoint.getClass();
                    ensureScannedApsIsMutable();
                    this.scannedAps_.add(scannedAccessPoint);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(scannedAccessPoint);
                return this;
            }

            public Builder addScannedAps(int i14, WifiSetup.ScannedAccessPoint.Builder builder) {
                RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureScannedApsIsMutable();
                    this.scannedAps_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ScanCompleteNotification) {
                    return mergeFrom((ScanCompleteNotification) message);
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
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    WifiSetup.ScannedAccessPoint scannedAccessPoint = (WifiSetup.ScannedAccessPoint) codedInputStream.readMessage(WifiSetup.ScannedAccessPoint.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<WifiSetup.ScannedAccessPoint, WifiSetup.ScannedAccessPoint.Builder, WifiSetup.ScannedAccessPointOrBuilder> repeatedFieldBuilderV3 = this.scannedApsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureScannedApsIsMutable();
                                        this.scannedAps_.add(scannedAccessPoint);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(scannedAccessPoint);
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
        public ScanCompleteNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ScanCompleteNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ScanCompleteNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ScanCompleteNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ScanCompleteNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ScanCompleteNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ScanCompleteNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ScanCompleteNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private ScanCompleteNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ScanCompleteNotification parseFrom(InputStream inputStream) {
            return (ScanCompleteNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ScanCompleteNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ScanCompleteNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ ScanCompleteNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ScanCompleteNotification parseFrom(CodedInputStream codedInputStream) {
            return (ScanCompleteNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ScanCompleteNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ScanCompleteNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            STATUS_UNKNOWN(0),
            STATUS_SUCCESS(1),
            STATUS_FAILED(2);

            public static final int STATUS_FAILED_VALUE = 2;
            public static final int STATUS_SUCCESS_VALUE = 1;
            public static final int STATUS_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.ScanCompleteNotification.Status.1
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
                return STATUS_FAILED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ScanCompleteNotification.getDescriptor().getEnumTypes().get(0);
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

    public static final class ScanWifiNetworksRequest extends GeneratedMessageV3 implements ScanWifiNetworksRequestOrBuilder {
        public static final int BAND_FIELD_NUMBER = 1;
        private static final ScanWifiNetworksRequest DEFAULT_INSTANCE = new ScanWifiNetworksRequest();

        @Deprecated
        public static final Parser<ScanWifiNetworksRequest> PARSER = new AbstractParser<ScanWifiNetworksRequest>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.ScanWifiNetworksRequest.1
            @Override // com.google.protobuf.Parser
            public ScanWifiNetworksRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ScanWifiNetworksRequest.newBuilder();
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
        private int band_;
        private int bitField0_;
        private byte memoizedIsInitialized;

        private ScanWifiNetworksRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.band_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ScanWifiNetworksRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ScanWifiNetworksRequest_descriptor;
        }

        public static Builder newBuilder(ScanWifiNetworksRequest scanWifiNetworksRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(scanWifiNetworksRequest);
        }

        public static ScanWifiNetworksRequest parseDelimitedFrom(InputStream inputStream) {
            return (ScanWifiNetworksRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ScanWifiNetworksRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ScanWifiNetworksRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ScanWifiNetworksRequest)) {
                return super.equals(obj);
            }
            ScanWifiNetworksRequest scanWifiNetworksRequest = (ScanWifiNetworksRequest) obj;
            if (hasBand() != scanWifiNetworksRequest.hasBand()) {
                return false;
            }
            return (!hasBand() || this.band_ == scanWifiNetworksRequest.band_) && getUnknownFields().equals(scanWifiNetworksRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ScanWifiNetworksRequestOrBuilder
        public WifiSetup.WifiBand getBand() {
            WifiSetup.WifiBand wifiBandForNumber = WifiSetup.WifiBand.forNumber(this.band_);
            return wifiBandForNumber == null ? WifiSetup.WifiBand.WIFI_BAND_5_GHZ : wifiBandForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ScanWifiNetworksRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.band_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ScanWifiNetworksRequestOrBuilder
        public boolean hasBand() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasBand()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.band_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ScanWifiNetworksRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ScanWifiNetworksRequest.class, Builder.class);
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
            return new ScanWifiNetworksRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.band_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ScanWifiNetworksRequestOrBuilder {
            private int band_;
            private int bitField0_;

            private Builder() {
                this.band_ = 0;
            }

            private void buildPartial0(ScanWifiNetworksRequest scanWifiNetworksRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    scanWifiNetworksRequest.band_ = this.band_;
                } else {
                    i14 = 0;
                }
                scanWifiNetworksRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ScanWifiNetworksRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ScanWifiNetworksRequest build() {
                ScanWifiNetworksRequest scanWifiNetworksRequestBuildPartial = buildPartial();
                if (scanWifiNetworksRequestBuildPartial.isInitialized()) {
                    return scanWifiNetworksRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) scanWifiNetworksRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ScanWifiNetworksRequest buildPartial() {
                ScanWifiNetworksRequest scanWifiNetworksRequest = new ScanWifiNetworksRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(scanWifiNetworksRequest);
                }
                onBuilt();
                return scanWifiNetworksRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.band_ = 0;
                return this;
            }

            public Builder clearBand() {
                this.bitField0_ &= -2;
                this.band_ = 0;
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

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ScanWifiNetworksRequestOrBuilder
            public WifiSetup.WifiBand getBand() {
                WifiSetup.WifiBand wifiBandForNumber = WifiSetup.WifiBand.forNumber(this.band_);
                return wifiBandForNumber == null ? WifiSetup.WifiBand.WIFI_BAND_5_GHZ : wifiBandForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ScanWifiNetworksRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.ScanWifiNetworksRequestOrBuilder
            public boolean hasBand() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_ScanWifiNetworksRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ScanWifiNetworksRequest.class, Builder.class);
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
                                    if (WifiSetup.WifiBand.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.band_ = i14;
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

            public Builder setBand(WifiSetup.WifiBand wifiBand) {
                wifiBand.getClass();
                this.bitField0_ |= 1;
                this.band_ = wifiBand.getNumber();
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
            public ScanWifiNetworksRequest getDefaultInstanceForType() {
                return ScanWifiNetworksRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.band_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ScanWifiNetworksRequest) {
                    return mergeFrom((ScanWifiNetworksRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ScanWifiNetworksRequest scanWifiNetworksRequest) {
                if (scanWifiNetworksRequest == ScanWifiNetworksRequest.getDefaultInstance()) {
                    return this;
                }
                if (scanWifiNetworksRequest.hasBand()) {
                    setBand(scanWifiNetworksRequest.getBand());
                }
                mergeUnknownFields(scanWifiNetworksRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ScanWifiNetworksRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ScanWifiNetworksRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ScanWifiNetworksRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ScanWifiNetworksRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ScanWifiNetworksRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ScanWifiNetworksRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ScanWifiNetworksRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.band_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ScanWifiNetworksRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ScanWifiNetworksRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ScanWifiNetworksRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ScanWifiNetworksRequest parseFrom(InputStream inputStream) {
            return (ScanWifiNetworksRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ScanWifiNetworksRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ScanWifiNetworksRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ScanWifiNetworksRequest parseFrom(CodedInputStream codedInputStream) {
            return (ScanWifiNetworksRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ScanWifiNetworksRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ScanWifiNetworksRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SwitchToApModeRequest extends GeneratedMessageV3 implements SwitchToApModeRequestOrBuilder {
        public static final int CHANNEL_FIELD_NUMBER = 3;
        private static final SwitchToApModeRequest DEFAULT_INSTANCE = new SwitchToApModeRequest();

        @Deprecated
        public static final Parser<SwitchToApModeRequest> PARSER = new AbstractParser<SwitchToApModeRequest>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeRequest.1
            @Override // com.google.protobuf.Parser
            public SwitchToApModeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SwitchToApModeRequest.newBuilder();
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
        public static final int PASSWORD_GENERATION_FIELD_NUMBER = 1;
        public static final int PREFERRED_BAND_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int channel_;
        private byte memoizedIsInitialized;
        private PasswordGeneration passwordGeneration_;
        private int preferredBand_;

        private SwitchToApModeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.preferredBand_ = 0;
            this.channel_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwitchToApModeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_SwitchToApModeRequest_descriptor;
        }

        public static Builder newBuilder(SwitchToApModeRequest switchToApModeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(switchToApModeRequest);
        }

        public static SwitchToApModeRequest parseDelimitedFrom(InputStream inputStream) {
            return (SwitchToApModeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SwitchToApModeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SwitchToApModeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SwitchToApModeRequest)) {
                return super.equals(obj);
            }
            SwitchToApModeRequest switchToApModeRequest = (SwitchToApModeRequest) obj;
            if (hasPasswordGeneration() != switchToApModeRequest.hasPasswordGeneration()) {
                return false;
            }
            if ((hasPasswordGeneration() && !getPasswordGeneration().equals(switchToApModeRequest.getPasswordGeneration())) || hasPreferredBand() != switchToApModeRequest.hasPreferredBand()) {
                return false;
            }
            if ((!hasPreferredBand() || this.preferredBand_ == switchToApModeRequest.preferredBand_) && hasChannel() == switchToApModeRequest.hasChannel()) {
                return (!hasChannel() || getChannel() == switchToApModeRequest.getChannel()) && getUnknownFields().equals(switchToApModeRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeRequestOrBuilder
        public int getChannel() {
            return this.channel_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SwitchToApModeRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeRequestOrBuilder
        public PasswordGeneration getPasswordGeneration() {
            PasswordGeneration passwordGeneration = this.passwordGeneration_;
            return passwordGeneration == null ? PasswordGeneration.getDefaultInstance() : passwordGeneration;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeRequestOrBuilder
        public PasswordGenerationOrBuilder getPasswordGenerationOrBuilder() {
            PasswordGeneration passwordGeneration = this.passwordGeneration_;
            return passwordGeneration == null ? PasswordGeneration.getDefaultInstance() : passwordGeneration;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeRequestOrBuilder
        public WifiSetup.WifiBand getPreferredBand() {
            WifiSetup.WifiBand wifiBandForNumber = WifiSetup.WifiBand.forNumber(this.preferredBand_);
            return wifiBandForNumber == null ? WifiSetup.WifiBand.WIFI_BAND_5_GHZ : wifiBandForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getPasswordGeneration()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(2, this.preferredBand_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt32Size(3, this.channel_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeRequestOrBuilder
        public boolean hasChannel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeRequestOrBuilder
        public boolean hasPasswordGeneration() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeRequestOrBuilder
        public boolean hasPreferredBand() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPasswordGeneration()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPasswordGeneration().hashCode();
            }
            if (hasPreferredBand()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.preferredBand_;
            }
            if (hasChannel()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getChannel();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_SwitchToApModeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitchToApModeRequest.class, Builder.class);
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
            return new SwitchToApModeRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getPasswordGeneration());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.preferredBand_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.channel_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwitchToApModeRequestOrBuilder {
            private int bitField0_;
            private int channel_;
            private SingleFieldBuilderV3<PasswordGeneration, PasswordGeneration.Builder, PasswordGenerationOrBuilder> passwordGenerationBuilder_;
            private PasswordGeneration passwordGeneration_;
            private int preferredBand_;

            private Builder() {
                this.preferredBand_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SwitchToApModeRequest switchToApModeRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<PasswordGeneration, PasswordGeneration.Builder, PasswordGenerationOrBuilder> singleFieldBuilderV3 = this.passwordGenerationBuilder_;
                    switchToApModeRequest.passwordGeneration_ = singleFieldBuilderV3 == null ? this.passwordGeneration_ : (PasswordGeneration) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    switchToApModeRequest.preferredBand_ = this.preferredBand_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    switchToApModeRequest.channel_ = this.channel_;
                    i14 |= 4;
                }
                switchToApModeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_SwitchToApModeRequest_descriptor;
            }

            private SingleFieldBuilderV3<PasswordGeneration, PasswordGeneration.Builder, PasswordGenerationOrBuilder> getPasswordGenerationFieldBuilder() {
                if (this.passwordGenerationBuilder_ == null) {
                    this.passwordGenerationBuilder_ = new SingleFieldBuilderV3<>(getPasswordGeneration(), getParentForChildren(), isClean());
                    this.passwordGeneration_ = null;
                }
                return this.passwordGenerationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getPasswordGenerationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitchToApModeRequest build() {
                SwitchToApModeRequest switchToApModeRequestBuildPartial = buildPartial();
                if (switchToApModeRequestBuildPartial.isInitialized()) {
                    return switchToApModeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) switchToApModeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitchToApModeRequest buildPartial() {
                SwitchToApModeRequest switchToApModeRequest = new SwitchToApModeRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(switchToApModeRequest);
                }
                onBuilt();
                return switchToApModeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.passwordGeneration_ = null;
                SingleFieldBuilderV3<PasswordGeneration, PasswordGeneration.Builder, PasswordGenerationOrBuilder> singleFieldBuilderV3 = this.passwordGenerationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.passwordGenerationBuilder_ = null;
                }
                this.preferredBand_ = 0;
                this.channel_ = 0;
                return this;
            }

            public Builder clearChannel() {
                this.bitField0_ &= -5;
                this.channel_ = 0;
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

            public Builder clearPasswordGeneration() {
                this.bitField0_ &= -2;
                this.passwordGeneration_ = null;
                SingleFieldBuilderV3<PasswordGeneration, PasswordGeneration.Builder, PasswordGenerationOrBuilder> singleFieldBuilderV3 = this.passwordGenerationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.passwordGenerationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPreferredBand() {
                this.bitField0_ &= -3;
                this.preferredBand_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeRequestOrBuilder
            public int getChannel() {
                return this.channel_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_SwitchToApModeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeRequestOrBuilder
            public PasswordGeneration getPasswordGeneration() {
                SingleFieldBuilderV3<PasswordGeneration, PasswordGeneration.Builder, PasswordGenerationOrBuilder> singleFieldBuilderV3 = this.passwordGenerationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PasswordGeneration) singleFieldBuilderV3.getMessage();
                }
                PasswordGeneration passwordGeneration = this.passwordGeneration_;
                return passwordGeneration == null ? PasswordGeneration.getDefaultInstance() : passwordGeneration;
            }

            public PasswordGeneration.Builder getPasswordGenerationBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (PasswordGeneration.Builder) getPasswordGenerationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeRequestOrBuilder
            public PasswordGenerationOrBuilder getPasswordGenerationOrBuilder() {
                SingleFieldBuilderV3<PasswordGeneration, PasswordGeneration.Builder, PasswordGenerationOrBuilder> singleFieldBuilderV3 = this.passwordGenerationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PasswordGenerationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PasswordGeneration passwordGeneration = this.passwordGeneration_;
                return passwordGeneration == null ? PasswordGeneration.getDefaultInstance() : passwordGeneration;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeRequestOrBuilder
            public WifiSetup.WifiBand getPreferredBand() {
                WifiSetup.WifiBand wifiBandForNumber = WifiSetup.WifiBand.forNumber(this.preferredBand_);
                return wifiBandForNumber == null ? WifiSetup.WifiBand.WIFI_BAND_5_GHZ : wifiBandForNumber;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeRequestOrBuilder
            public boolean hasChannel() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeRequestOrBuilder
            public boolean hasPasswordGeneration() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeRequestOrBuilder
            public boolean hasPreferredBand() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_SwitchToApModeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitchToApModeRequest.class, Builder.class);
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
                                    codedInputStream.readMessage(getPasswordGenerationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (WifiSetup.WifiBand.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.preferredBand_ = i14;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 24) {
                                    this.channel_ = codedInputStream.readUInt32();
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

            public Builder mergePasswordGeneration(PasswordGeneration passwordGeneration) {
                PasswordGeneration passwordGeneration2;
                SingleFieldBuilderV3<PasswordGeneration, PasswordGeneration.Builder, PasswordGenerationOrBuilder> singleFieldBuilderV3 = this.passwordGenerationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(passwordGeneration);
                } else if ((this.bitField0_ & 1) == 0 || (passwordGeneration2 = this.passwordGeneration_) == null || passwordGeneration2 == PasswordGeneration.getDefaultInstance()) {
                    this.passwordGeneration_ = passwordGeneration;
                } else {
                    getPasswordGenerationBuilder().mergeFrom(passwordGeneration);
                }
                if (this.passwordGeneration_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setChannel(int i14) {
                this.channel_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setPasswordGeneration(PasswordGeneration.Builder builder) {
                SingleFieldBuilderV3<PasswordGeneration, PasswordGeneration.Builder, PasswordGenerationOrBuilder> singleFieldBuilderV3 = this.passwordGenerationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.passwordGeneration_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPreferredBand(WifiSetup.WifiBand wifiBand) {
                wifiBand.getClass();
                this.bitField0_ |= 2;
                this.preferredBand_ = wifiBand.getNumber();
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
            public SwitchToApModeRequest getDefaultInstanceForType() {
                return SwitchToApModeRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.preferredBand_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setPasswordGeneration(PasswordGeneration passwordGeneration) {
                SingleFieldBuilderV3<PasswordGeneration, PasswordGeneration.Builder, PasswordGenerationOrBuilder> singleFieldBuilderV3 = this.passwordGenerationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    passwordGeneration.getClass();
                    this.passwordGeneration_ = passwordGeneration;
                } else {
                    singleFieldBuilderV3.setMessage(passwordGeneration);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SwitchToApModeRequest) {
                    return mergeFrom((SwitchToApModeRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SwitchToApModeRequest switchToApModeRequest) {
                if (switchToApModeRequest == SwitchToApModeRequest.getDefaultInstance()) {
                    return this;
                }
                if (switchToApModeRequest.hasPasswordGeneration()) {
                    mergePasswordGeneration(switchToApModeRequest.getPasswordGeneration());
                }
                if (switchToApModeRequest.hasPreferredBand()) {
                    setPreferredBand(switchToApModeRequest.getPreferredBand());
                }
                if (switchToApModeRequest.hasChannel()) {
                    setChannel(switchToApModeRequest.getChannel());
                }
                mergeUnknownFields(switchToApModeRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SwitchToApModeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SwitchToApModeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitchToApModeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitchToApModeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SwitchToApModeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwitchToApModeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ SwitchToApModeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SwitchToApModeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private SwitchToApModeRequest() {
            this.channel_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.preferredBand_ = 0;
        }

        public static SwitchToApModeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SwitchToApModeRequest parseFrom(InputStream inputStream) {
            return (SwitchToApModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SwitchToApModeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitchToApModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitchToApModeRequest parseFrom(CodedInputStream codedInputStream) {
            return (SwitchToApModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SwitchToApModeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitchToApModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SwitchToApModeResponse extends GeneratedMessageV3 implements SwitchToApModeResponseOrBuilder {
        public static final int DEVICE_ACCESS_POINT_FIELD_NUMBER = 2;
        public static final int SUCCESS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private WifiSetup.StoredAccessPoint deviceAccessPoint_;
        private byte memoizedIsInitialized;
        private boolean success_;
        private static final SwitchToApModeResponse DEFAULT_INSTANCE = new SwitchToApModeResponse();

        @Deprecated
        public static final Parser<SwitchToApModeResponse> PARSER = new AbstractParser<SwitchToApModeResponse>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeResponse.1
            @Override // com.google.protobuf.Parser
            public SwitchToApModeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SwitchToApModeResponse.newBuilder();
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

        private SwitchToApModeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.success_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwitchToApModeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_SwitchToApModeResponse_descriptor;
        }

        public static Builder newBuilder(SwitchToApModeResponse switchToApModeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(switchToApModeResponse);
        }

        public static SwitchToApModeResponse parseDelimitedFrom(InputStream inputStream) {
            return (SwitchToApModeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SwitchToApModeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SwitchToApModeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SwitchToApModeResponse)) {
                return super.equals(obj);
            }
            SwitchToApModeResponse switchToApModeResponse = (SwitchToApModeResponse) obj;
            if (hasSuccess() != switchToApModeResponse.hasSuccess()) {
                return false;
            }
            if ((!hasSuccess() || getSuccess() == switchToApModeResponse.getSuccess()) && hasDeviceAccessPoint() == switchToApModeResponse.hasDeviceAccessPoint()) {
                return (!hasDeviceAccessPoint() || getDeviceAccessPoint().equals(switchToApModeResponse.getDeviceAccessPoint())) && getUnknownFields().equals(switchToApModeResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeResponseOrBuilder
        public WifiSetup.StoredAccessPoint getDeviceAccessPoint() {
            WifiSetup.StoredAccessPoint storedAccessPoint = this.deviceAccessPoint_;
            return storedAccessPoint == null ? WifiSetup.StoredAccessPoint.getDefaultInstance() : storedAccessPoint;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeResponseOrBuilder
        public WifiSetup.StoredAccessPointOrBuilder getDeviceAccessPointOrBuilder() {
            WifiSetup.StoredAccessPoint storedAccessPoint = this.deviceAccessPoint_;
            return storedAccessPoint == null ? WifiSetup.StoredAccessPoint.getDefaultInstance() : storedAccessPoint;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SwitchToApModeResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.success_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(2, getDeviceAccessPoint());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeResponseOrBuilder
        public boolean getSuccess() {
            return this.success_;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeResponseOrBuilder
        public boolean hasDeviceAccessPoint() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeResponseOrBuilder
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
            if (hasDeviceAccessPoint()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDeviceAccessPoint().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_SwitchToApModeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitchToApModeResponse.class, Builder.class);
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
            if (!hasDeviceAccessPoint() || getDeviceAccessPoint().isInitialized()) {
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
            return new SwitchToApModeResponse();
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
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getDeviceAccessPoint());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwitchToApModeResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> deviceAccessPointBuilder_;
            private WifiSetup.StoredAccessPoint deviceAccessPoint_;
            private boolean success_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SwitchToApModeResponse switchToApModeResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    switchToApModeResponse.success_ = this.success_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.deviceAccessPointBuilder_;
                    switchToApModeResponse.deviceAccessPoint_ = singleFieldBuilderV3 == null ? this.deviceAccessPoint_ : (WifiSetup.StoredAccessPoint) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                switchToApModeResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_SwitchToApModeResponse_descriptor;
            }

            private SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> getDeviceAccessPointFieldBuilder() {
                if (this.deviceAccessPointBuilder_ == null) {
                    this.deviceAccessPointBuilder_ = new SingleFieldBuilderV3<>(getDeviceAccessPoint(), getParentForChildren(), isClean());
                    this.deviceAccessPoint_ = null;
                }
                return this.deviceAccessPointBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDeviceAccessPointFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitchToApModeResponse build() {
                SwitchToApModeResponse switchToApModeResponseBuildPartial = buildPartial();
                if (switchToApModeResponseBuildPartial.isInitialized()) {
                    return switchToApModeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) switchToApModeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitchToApModeResponse buildPartial() {
                SwitchToApModeResponse switchToApModeResponse = new SwitchToApModeResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(switchToApModeResponse);
                }
                onBuilt();
                return switchToApModeResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.success_ = false;
                this.deviceAccessPoint_ = null;
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.deviceAccessPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceAccessPointBuilder_ = null;
                }
                return this;
            }

            public Builder clearDeviceAccessPoint() {
                this.bitField0_ &= -3;
                this.deviceAccessPoint_ = null;
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.deviceAccessPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceAccessPointBuilder_ = null;
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
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_SwitchToApModeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeResponseOrBuilder
            public WifiSetup.StoredAccessPoint getDeviceAccessPoint() {
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.deviceAccessPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WifiSetup.StoredAccessPoint) singleFieldBuilderV3.getMessage();
                }
                WifiSetup.StoredAccessPoint storedAccessPoint = this.deviceAccessPoint_;
                return storedAccessPoint == null ? WifiSetup.StoredAccessPoint.getDefaultInstance() : storedAccessPoint;
            }

            public WifiSetup.StoredAccessPoint.Builder getDeviceAccessPointBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (WifiSetup.StoredAccessPoint.Builder) getDeviceAccessPointFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeResponseOrBuilder
            public WifiSetup.StoredAccessPointOrBuilder getDeviceAccessPointOrBuilder() {
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.deviceAccessPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WifiSetup.StoredAccessPointOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WifiSetup.StoredAccessPoint storedAccessPoint = this.deviceAccessPoint_;
                return storedAccessPoint == null ? WifiSetup.StoredAccessPoint.getDefaultInstance() : storedAccessPoint;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeResponseOrBuilder
            public boolean getSuccess() {
                return this.success_;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeResponseOrBuilder
            public boolean hasDeviceAccessPoint() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.SwitchToApModeResponseOrBuilder
            public boolean hasSuccess() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_SwitchToApModeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitchToApModeResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasDeviceAccessPoint() || getDeviceAccessPoint().isInitialized();
            }

            public Builder mergeDeviceAccessPoint(WifiSetup.StoredAccessPoint storedAccessPoint) {
                WifiSetup.StoredAccessPoint storedAccessPoint2;
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.deviceAccessPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(storedAccessPoint);
                } else if ((this.bitField0_ & 2) == 0 || (storedAccessPoint2 = this.deviceAccessPoint_) == null || storedAccessPoint2 == WifiSetup.StoredAccessPoint.getDefaultInstance()) {
                    this.deviceAccessPoint_ = storedAccessPoint;
                } else {
                    getDeviceAccessPointBuilder().mergeFrom(storedAccessPoint);
                }
                if (this.deviceAccessPoint_ != null) {
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
                                    this.success_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getDeviceAccessPointFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setDeviceAccessPoint(WifiSetup.StoredAccessPoint.Builder builder) {
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.deviceAccessPointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.deviceAccessPoint_ = builder.build();
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

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SwitchToApModeResponse getDefaultInstanceForType() {
                return SwitchToApModeResponse.getDefaultInstance();
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

            public Builder setDeviceAccessPoint(WifiSetup.StoredAccessPoint storedAccessPoint) {
                SingleFieldBuilderV3<WifiSetup.StoredAccessPoint, WifiSetup.StoredAccessPoint.Builder, WifiSetup.StoredAccessPointOrBuilder> singleFieldBuilderV3 = this.deviceAccessPointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    storedAccessPoint.getClass();
                    this.deviceAccessPoint_ = storedAccessPoint;
                } else {
                    singleFieldBuilderV3.setMessage(storedAccessPoint);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SwitchToApModeResponse) {
                    return mergeFrom((SwitchToApModeResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SwitchToApModeResponse switchToApModeResponse) {
                if (switchToApModeResponse == SwitchToApModeResponse.getDefaultInstance()) {
                    return this;
                }
                if (switchToApModeResponse.hasSuccess()) {
                    setSuccess(switchToApModeResponse.getSuccess());
                }
                if (switchToApModeResponse.hasDeviceAccessPoint()) {
                    mergeDeviceAccessPoint(switchToApModeResponse.getDeviceAccessPoint());
                }
                mergeUnknownFields(switchToApModeResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SwitchToApModeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SwitchToApModeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitchToApModeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitchToApModeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SwitchToApModeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SwitchToApModeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SwitchToApModeResponse() {
            this.success_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwitchToApModeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SwitchToApModeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SwitchToApModeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SwitchToApModeResponse parseFrom(InputStream inputStream) {
            return (SwitchToApModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SwitchToApModeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitchToApModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitchToApModeResponse parseFrom(CodedInputStream codedInputStream) {
            return (SwitchToApModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SwitchToApModeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitchToApModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class WifiSetupUnifiedService extends GeneratedMessageV3 implements WifiSetupUnifiedServiceOrBuilder {
        public static final int ACCESS_POINT_SCAN_COMPLETE_NOTIFICATION_FIELD_NUMBER = 3;
        public static final int CONNECT_TO_WIFI_NETWORK_NOTIFICATION_FIELD_NUMBER = 6;
        public static final int CONNECT_TO_WIFI_NETWORK_REQUEST_FIELD_NUMBER = 4;
        public static final int CONNECT_TO_WIFI_NETWORK_RESPONSE_FIELD_NUMBER = 5;
        public static final int GET_NETWORK_CREDENTIALS_REQUEST_FIELD_NUMBER = 17;
        public static final int GET_NETWORK_CREDENTIALS_RESPONSE_FIELD_NUMBER = 18;
        public static final int MOBILE_CARRIER_INFO_REQUEST_FIELD_NUMBER = 13;
        public static final int MOBILE_CARRIER_INFO_RESPONSE_FIELD_NUMBER = 14;
        public static final int REMOVE_WIFI_NETWORK_REQUEST_FIELD_NUMBER = 9;
        public static final int REMOVE_WIFI_NETWORK_RESPONSE_FIELD_NUMBER = 10;
        public static final int SAVE_WIFI_NETWORK_REQUEST_FIELD_NUMBER = 7;
        public static final int SAVE_WIFI_NETWORK_RESPONSE_FIELD_NUMBER = 8;
        public static final int SCAN_WIFI_NETWORKS_REQUEST_FIELD_NUMBER = 1;
        public static final int SCAN_WIFI_NETWORKS_RESPONSE_FIELD_NUMBER = 2;
        public static final int STORED_WIFI_NETWORKS_REQUEST_FIELD_NUMBER = 11;
        public static final int STORED_WIFI_NETWORKS_RESPONSE_FIELD_NUMBER = 12;
        public static final int SWITCH_TO_AP_REQUEST_FIELD_NUMBER = 15;
        public static final int SWITCH_TO_AP_RESPONSE_FIELD_NUMBER = 16;
        private static final long serialVersionUID = 0;
        private ScanCompleteNotification accessPointScanCompleteNotification_;
        private int bitField0_;
        private ConnectToWifiNetworkNotification connectToWifiNetworkNotification_;
        private ConnectToWifiNetworkRequest connectToWifiNetworkRequest_;
        private ConnectToWifiNetworkResponse connectToWifiNetworkResponse_;
        private DeviceAPCredentialsRequest getNetworkCredentialsRequest_;
        private DeviceAPCredentialsResponse getNetworkCredentialsResponse_;
        private byte memoizedIsInitialized;
        private MobileCarrierInfoRequest mobileCarrierInfoRequest_;
        private MobileCarrierInfoResponse mobileCarrierInfoResponse_;
        private RemoveWifiNetworkRequest removeWifiNetworkRequest_;
        private RemoveWifiNetworkResponse removeWifiNetworkResponse_;
        private SaveWifiNetworkRequest saveWifiNetworkRequest_;
        private SaveWifiNetworkResponse saveWifiNetworkResponse_;
        private ScanWifiNetworksRequest scanWifiNetworksRequest_;
        private ScanWifiNetworksResponse scanWifiNetworksResponse_;
        private GetStoredWifiNetworksRequest storedWifiNetworksRequest_;
        private GetStoredWifiNetworksResponse storedWifiNetworksResponse_;
        private SwitchToApModeRequest switchToApRequest_;
        private SwitchToApModeResponse switchToApResponse_;
        private static final WifiSetupUnifiedService DEFAULT_INSTANCE = new WifiSetupUnifiedService();

        @Deprecated
        public static final Parser<WifiSetupUnifiedService> PARSER = new AbstractParser<WifiSetupUnifiedService>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedService.1
            @Override // com.google.protobuf.Parser
            public WifiSetupUnifiedService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = WifiSetupUnifiedService.newBuilder();
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

        private WifiSetupUnifiedService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WifiSetupUnifiedService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_WifiSetupUnifiedService_descriptor;
        }

        public static Builder newBuilder(WifiSetupUnifiedService wifiSetupUnifiedService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(wifiSetupUnifiedService);
        }

        public static WifiSetupUnifiedService parseDelimitedFrom(InputStream inputStream) {
            return (WifiSetupUnifiedService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WifiSetupUnifiedService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<WifiSetupUnifiedService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WifiSetupUnifiedService)) {
                return super.equals(obj);
            }
            WifiSetupUnifiedService wifiSetupUnifiedService = (WifiSetupUnifiedService) obj;
            if (hasScanWifiNetworksRequest() != wifiSetupUnifiedService.hasScanWifiNetworksRequest()) {
                return false;
            }
            if ((hasScanWifiNetworksRequest() && !getScanWifiNetworksRequest().equals(wifiSetupUnifiedService.getScanWifiNetworksRequest())) || hasScanWifiNetworksResponse() != wifiSetupUnifiedService.hasScanWifiNetworksResponse()) {
                return false;
            }
            if ((hasScanWifiNetworksResponse() && !getScanWifiNetworksResponse().equals(wifiSetupUnifiedService.getScanWifiNetworksResponse())) || hasAccessPointScanCompleteNotification() != wifiSetupUnifiedService.hasAccessPointScanCompleteNotification()) {
                return false;
            }
            if ((hasAccessPointScanCompleteNotification() && !getAccessPointScanCompleteNotification().equals(wifiSetupUnifiedService.getAccessPointScanCompleteNotification())) || hasConnectToWifiNetworkRequest() != wifiSetupUnifiedService.hasConnectToWifiNetworkRequest()) {
                return false;
            }
            if ((hasConnectToWifiNetworkRequest() && !getConnectToWifiNetworkRequest().equals(wifiSetupUnifiedService.getConnectToWifiNetworkRequest())) || hasConnectToWifiNetworkResponse() != wifiSetupUnifiedService.hasConnectToWifiNetworkResponse()) {
                return false;
            }
            if ((hasConnectToWifiNetworkResponse() && !getConnectToWifiNetworkResponse().equals(wifiSetupUnifiedService.getConnectToWifiNetworkResponse())) || hasConnectToWifiNetworkNotification() != wifiSetupUnifiedService.hasConnectToWifiNetworkNotification()) {
                return false;
            }
            if ((hasConnectToWifiNetworkNotification() && !getConnectToWifiNetworkNotification().equals(wifiSetupUnifiedService.getConnectToWifiNetworkNotification())) || hasSaveWifiNetworkRequest() != wifiSetupUnifiedService.hasSaveWifiNetworkRequest()) {
                return false;
            }
            if ((hasSaveWifiNetworkRequest() && !getSaveWifiNetworkRequest().equals(wifiSetupUnifiedService.getSaveWifiNetworkRequest())) || hasSaveWifiNetworkResponse() != wifiSetupUnifiedService.hasSaveWifiNetworkResponse()) {
                return false;
            }
            if ((hasSaveWifiNetworkResponse() && !getSaveWifiNetworkResponse().equals(wifiSetupUnifiedService.getSaveWifiNetworkResponse())) || hasRemoveWifiNetworkRequest() != wifiSetupUnifiedService.hasRemoveWifiNetworkRequest()) {
                return false;
            }
            if ((hasRemoveWifiNetworkRequest() && !getRemoveWifiNetworkRequest().equals(wifiSetupUnifiedService.getRemoveWifiNetworkRequest())) || hasRemoveWifiNetworkResponse() != wifiSetupUnifiedService.hasRemoveWifiNetworkResponse()) {
                return false;
            }
            if ((hasRemoveWifiNetworkResponse() && !getRemoveWifiNetworkResponse().equals(wifiSetupUnifiedService.getRemoveWifiNetworkResponse())) || hasStoredWifiNetworksRequest() != wifiSetupUnifiedService.hasStoredWifiNetworksRequest()) {
                return false;
            }
            if ((hasStoredWifiNetworksRequest() && !getStoredWifiNetworksRequest().equals(wifiSetupUnifiedService.getStoredWifiNetworksRequest())) || hasStoredWifiNetworksResponse() != wifiSetupUnifiedService.hasStoredWifiNetworksResponse()) {
                return false;
            }
            if ((hasStoredWifiNetworksResponse() && !getStoredWifiNetworksResponse().equals(wifiSetupUnifiedService.getStoredWifiNetworksResponse())) || hasMobileCarrierInfoRequest() != wifiSetupUnifiedService.hasMobileCarrierInfoRequest()) {
                return false;
            }
            if ((hasMobileCarrierInfoRequest() && !getMobileCarrierInfoRequest().equals(wifiSetupUnifiedService.getMobileCarrierInfoRequest())) || hasMobileCarrierInfoResponse() != wifiSetupUnifiedService.hasMobileCarrierInfoResponse()) {
                return false;
            }
            if ((hasMobileCarrierInfoResponse() && !getMobileCarrierInfoResponse().equals(wifiSetupUnifiedService.getMobileCarrierInfoResponse())) || hasSwitchToApRequest() != wifiSetupUnifiedService.hasSwitchToApRequest()) {
                return false;
            }
            if ((hasSwitchToApRequest() && !getSwitchToApRequest().equals(wifiSetupUnifiedService.getSwitchToApRequest())) || hasSwitchToApResponse() != wifiSetupUnifiedService.hasSwitchToApResponse()) {
                return false;
            }
            if ((hasSwitchToApResponse() && !getSwitchToApResponse().equals(wifiSetupUnifiedService.getSwitchToApResponse())) || hasGetNetworkCredentialsRequest() != wifiSetupUnifiedService.hasGetNetworkCredentialsRequest()) {
                return false;
            }
            if ((!hasGetNetworkCredentialsRequest() || getGetNetworkCredentialsRequest().equals(wifiSetupUnifiedService.getGetNetworkCredentialsRequest())) && hasGetNetworkCredentialsResponse() == wifiSetupUnifiedService.hasGetNetworkCredentialsResponse()) {
                return (!hasGetNetworkCredentialsResponse() || getGetNetworkCredentialsResponse().equals(wifiSetupUnifiedService.getGetNetworkCredentialsResponse())) && getUnknownFields().equals(wifiSetupUnifiedService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public ScanCompleteNotification getAccessPointScanCompleteNotification() {
            ScanCompleteNotification scanCompleteNotification = this.accessPointScanCompleteNotification_;
            return scanCompleteNotification == null ? ScanCompleteNotification.getDefaultInstance() : scanCompleteNotification;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public ScanCompleteNotificationOrBuilder getAccessPointScanCompleteNotificationOrBuilder() {
            ScanCompleteNotification scanCompleteNotification = this.accessPointScanCompleteNotification_;
            return scanCompleteNotification == null ? ScanCompleteNotification.getDefaultInstance() : scanCompleteNotification;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public ConnectToWifiNetworkNotification getConnectToWifiNetworkNotification() {
            ConnectToWifiNetworkNotification connectToWifiNetworkNotification = this.connectToWifiNetworkNotification_;
            return connectToWifiNetworkNotification == null ? ConnectToWifiNetworkNotification.getDefaultInstance() : connectToWifiNetworkNotification;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public ConnectToWifiNetworkNotificationOrBuilder getConnectToWifiNetworkNotificationOrBuilder() {
            ConnectToWifiNetworkNotification connectToWifiNetworkNotification = this.connectToWifiNetworkNotification_;
            return connectToWifiNetworkNotification == null ? ConnectToWifiNetworkNotification.getDefaultInstance() : connectToWifiNetworkNotification;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public ConnectToWifiNetworkRequest getConnectToWifiNetworkRequest() {
            ConnectToWifiNetworkRequest connectToWifiNetworkRequest = this.connectToWifiNetworkRequest_;
            return connectToWifiNetworkRequest == null ? ConnectToWifiNetworkRequest.getDefaultInstance() : connectToWifiNetworkRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public ConnectToWifiNetworkRequestOrBuilder getConnectToWifiNetworkRequestOrBuilder() {
            ConnectToWifiNetworkRequest connectToWifiNetworkRequest = this.connectToWifiNetworkRequest_;
            return connectToWifiNetworkRequest == null ? ConnectToWifiNetworkRequest.getDefaultInstance() : connectToWifiNetworkRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public ConnectToWifiNetworkResponse getConnectToWifiNetworkResponse() {
            ConnectToWifiNetworkResponse connectToWifiNetworkResponse = this.connectToWifiNetworkResponse_;
            return connectToWifiNetworkResponse == null ? ConnectToWifiNetworkResponse.getDefaultInstance() : connectToWifiNetworkResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public ConnectToWifiNetworkResponseOrBuilder getConnectToWifiNetworkResponseOrBuilder() {
            ConnectToWifiNetworkResponse connectToWifiNetworkResponse = this.connectToWifiNetworkResponse_;
            return connectToWifiNetworkResponse == null ? ConnectToWifiNetworkResponse.getDefaultInstance() : connectToWifiNetworkResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public DeviceAPCredentialsRequest getGetNetworkCredentialsRequest() {
            DeviceAPCredentialsRequest deviceAPCredentialsRequest = this.getNetworkCredentialsRequest_;
            return deviceAPCredentialsRequest == null ? DeviceAPCredentialsRequest.getDefaultInstance() : deviceAPCredentialsRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public DeviceAPCredentialsRequestOrBuilder getGetNetworkCredentialsRequestOrBuilder() {
            DeviceAPCredentialsRequest deviceAPCredentialsRequest = this.getNetworkCredentialsRequest_;
            return deviceAPCredentialsRequest == null ? DeviceAPCredentialsRequest.getDefaultInstance() : deviceAPCredentialsRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public DeviceAPCredentialsResponse getGetNetworkCredentialsResponse() {
            DeviceAPCredentialsResponse deviceAPCredentialsResponse = this.getNetworkCredentialsResponse_;
            return deviceAPCredentialsResponse == null ? DeviceAPCredentialsResponse.getDefaultInstance() : deviceAPCredentialsResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public DeviceAPCredentialsResponseOrBuilder getGetNetworkCredentialsResponseOrBuilder() {
            DeviceAPCredentialsResponse deviceAPCredentialsResponse = this.getNetworkCredentialsResponse_;
            return deviceAPCredentialsResponse == null ? DeviceAPCredentialsResponse.getDefaultInstance() : deviceAPCredentialsResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public MobileCarrierInfoRequest getMobileCarrierInfoRequest() {
            MobileCarrierInfoRequest mobileCarrierInfoRequest = this.mobileCarrierInfoRequest_;
            return mobileCarrierInfoRequest == null ? MobileCarrierInfoRequest.getDefaultInstance() : mobileCarrierInfoRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public MobileCarrierInfoRequestOrBuilder getMobileCarrierInfoRequestOrBuilder() {
            MobileCarrierInfoRequest mobileCarrierInfoRequest = this.mobileCarrierInfoRequest_;
            return mobileCarrierInfoRequest == null ? MobileCarrierInfoRequest.getDefaultInstance() : mobileCarrierInfoRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public MobileCarrierInfoResponse getMobileCarrierInfoResponse() {
            MobileCarrierInfoResponse mobileCarrierInfoResponse = this.mobileCarrierInfoResponse_;
            return mobileCarrierInfoResponse == null ? MobileCarrierInfoResponse.getDefaultInstance() : mobileCarrierInfoResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public MobileCarrierInfoResponseOrBuilder getMobileCarrierInfoResponseOrBuilder() {
            MobileCarrierInfoResponse mobileCarrierInfoResponse = this.mobileCarrierInfoResponse_;
            return mobileCarrierInfoResponse == null ? MobileCarrierInfoResponse.getDefaultInstance() : mobileCarrierInfoResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WifiSetupUnifiedService> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public RemoveWifiNetworkRequest getRemoveWifiNetworkRequest() {
            RemoveWifiNetworkRequest removeWifiNetworkRequest = this.removeWifiNetworkRequest_;
            return removeWifiNetworkRequest == null ? RemoveWifiNetworkRequest.getDefaultInstance() : removeWifiNetworkRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public RemoveWifiNetworkRequestOrBuilder getRemoveWifiNetworkRequestOrBuilder() {
            RemoveWifiNetworkRequest removeWifiNetworkRequest = this.removeWifiNetworkRequest_;
            return removeWifiNetworkRequest == null ? RemoveWifiNetworkRequest.getDefaultInstance() : removeWifiNetworkRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public RemoveWifiNetworkResponse getRemoveWifiNetworkResponse() {
            RemoveWifiNetworkResponse removeWifiNetworkResponse = this.removeWifiNetworkResponse_;
            return removeWifiNetworkResponse == null ? RemoveWifiNetworkResponse.getDefaultInstance() : removeWifiNetworkResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public RemoveWifiNetworkResponseOrBuilder getRemoveWifiNetworkResponseOrBuilder() {
            RemoveWifiNetworkResponse removeWifiNetworkResponse = this.removeWifiNetworkResponse_;
            return removeWifiNetworkResponse == null ? RemoveWifiNetworkResponse.getDefaultInstance() : removeWifiNetworkResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public SaveWifiNetworkRequest getSaveWifiNetworkRequest() {
            SaveWifiNetworkRequest saveWifiNetworkRequest = this.saveWifiNetworkRequest_;
            return saveWifiNetworkRequest == null ? SaveWifiNetworkRequest.getDefaultInstance() : saveWifiNetworkRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public SaveWifiNetworkRequestOrBuilder getSaveWifiNetworkRequestOrBuilder() {
            SaveWifiNetworkRequest saveWifiNetworkRequest = this.saveWifiNetworkRequest_;
            return saveWifiNetworkRequest == null ? SaveWifiNetworkRequest.getDefaultInstance() : saveWifiNetworkRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public SaveWifiNetworkResponse getSaveWifiNetworkResponse() {
            SaveWifiNetworkResponse saveWifiNetworkResponse = this.saveWifiNetworkResponse_;
            return saveWifiNetworkResponse == null ? SaveWifiNetworkResponse.getDefaultInstance() : saveWifiNetworkResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public SaveWifiNetworkResponseOrBuilder getSaveWifiNetworkResponseOrBuilder() {
            SaveWifiNetworkResponse saveWifiNetworkResponse = this.saveWifiNetworkResponse_;
            return saveWifiNetworkResponse == null ? SaveWifiNetworkResponse.getDefaultInstance() : saveWifiNetworkResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public ScanWifiNetworksRequest getScanWifiNetworksRequest() {
            ScanWifiNetworksRequest scanWifiNetworksRequest = this.scanWifiNetworksRequest_;
            return scanWifiNetworksRequest == null ? ScanWifiNetworksRequest.getDefaultInstance() : scanWifiNetworksRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public ScanWifiNetworksRequestOrBuilder getScanWifiNetworksRequestOrBuilder() {
            ScanWifiNetworksRequest scanWifiNetworksRequest = this.scanWifiNetworksRequest_;
            return scanWifiNetworksRequest == null ? ScanWifiNetworksRequest.getDefaultInstance() : scanWifiNetworksRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public ScanWifiNetworksResponse getScanWifiNetworksResponse() {
            ScanWifiNetworksResponse scanWifiNetworksResponse = this.scanWifiNetworksResponse_;
            return scanWifiNetworksResponse == null ? ScanWifiNetworksResponse.getDefaultInstance() : scanWifiNetworksResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public ScanWifiNetworksResponseOrBuilder getScanWifiNetworksResponseOrBuilder() {
            ScanWifiNetworksResponse scanWifiNetworksResponse = this.scanWifiNetworksResponse_;
            return scanWifiNetworksResponse == null ? ScanWifiNetworksResponse.getDefaultInstance() : scanWifiNetworksResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getScanWifiNetworksRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getScanWifiNetworksResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getAccessPointScanCompleteNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getConnectToWifiNetworkRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getConnectToWifiNetworkResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getConnectToWifiNetworkNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getSaveWifiNetworkRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getSaveWifiNetworkResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getRemoveWifiNetworkRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getRemoveWifiNetworkResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getStoredWifiNetworksRequest());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getStoredWifiNetworksResponse());
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, getMobileCarrierInfoRequest());
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(14, getMobileCarrierInfoResponse());
            }
            if ((this.bitField0_ & 16384) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(15, getSwitchToApRequest());
            }
            if ((this.bitField0_ & 32768) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(16, getSwitchToApResponse());
            }
            if ((this.bitField0_ & 65536) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(17, getGetNetworkCredentialsRequest());
            }
            if ((this.bitField0_ & 131072) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(18, getGetNetworkCredentialsResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public GetStoredWifiNetworksRequest getStoredWifiNetworksRequest() {
            GetStoredWifiNetworksRequest getStoredWifiNetworksRequest = this.storedWifiNetworksRequest_;
            return getStoredWifiNetworksRequest == null ? GetStoredWifiNetworksRequest.getDefaultInstance() : getStoredWifiNetworksRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public GetStoredWifiNetworksRequestOrBuilder getStoredWifiNetworksRequestOrBuilder() {
            GetStoredWifiNetworksRequest getStoredWifiNetworksRequest = this.storedWifiNetworksRequest_;
            return getStoredWifiNetworksRequest == null ? GetStoredWifiNetworksRequest.getDefaultInstance() : getStoredWifiNetworksRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public GetStoredWifiNetworksResponse getStoredWifiNetworksResponse() {
            GetStoredWifiNetworksResponse getStoredWifiNetworksResponse = this.storedWifiNetworksResponse_;
            return getStoredWifiNetworksResponse == null ? GetStoredWifiNetworksResponse.getDefaultInstance() : getStoredWifiNetworksResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public GetStoredWifiNetworksResponseOrBuilder getStoredWifiNetworksResponseOrBuilder() {
            GetStoredWifiNetworksResponse getStoredWifiNetworksResponse = this.storedWifiNetworksResponse_;
            return getStoredWifiNetworksResponse == null ? GetStoredWifiNetworksResponse.getDefaultInstance() : getStoredWifiNetworksResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public SwitchToApModeRequest getSwitchToApRequest() {
            SwitchToApModeRequest switchToApModeRequest = this.switchToApRequest_;
            return switchToApModeRequest == null ? SwitchToApModeRequest.getDefaultInstance() : switchToApModeRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public SwitchToApModeRequestOrBuilder getSwitchToApRequestOrBuilder() {
            SwitchToApModeRequest switchToApModeRequest = this.switchToApRequest_;
            return switchToApModeRequest == null ? SwitchToApModeRequest.getDefaultInstance() : switchToApModeRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public SwitchToApModeResponse getSwitchToApResponse() {
            SwitchToApModeResponse switchToApModeResponse = this.switchToApResponse_;
            return switchToApModeResponse == null ? SwitchToApModeResponse.getDefaultInstance() : switchToApModeResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public SwitchToApModeResponseOrBuilder getSwitchToApResponseOrBuilder() {
            SwitchToApModeResponse switchToApModeResponse = this.switchToApResponse_;
            return switchToApModeResponse == null ? SwitchToApModeResponse.getDefaultInstance() : switchToApModeResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public boolean hasAccessPointScanCompleteNotification() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public boolean hasConnectToWifiNetworkNotification() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public boolean hasConnectToWifiNetworkRequest() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public boolean hasConnectToWifiNetworkResponse() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public boolean hasGetNetworkCredentialsRequest() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public boolean hasGetNetworkCredentialsResponse() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public boolean hasMobileCarrierInfoRequest() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public boolean hasMobileCarrierInfoResponse() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public boolean hasRemoveWifiNetworkRequest() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public boolean hasRemoveWifiNetworkResponse() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public boolean hasSaveWifiNetworkRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public boolean hasSaveWifiNetworkResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public boolean hasScanWifiNetworksRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public boolean hasScanWifiNetworksResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public boolean hasStoredWifiNetworksRequest() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public boolean hasStoredWifiNetworksResponse() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public boolean hasSwitchToApRequest() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
        public boolean hasSwitchToApResponse() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasScanWifiNetworksRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getScanWifiNetworksRequest().hashCode();
            }
            if (hasScanWifiNetworksResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getScanWifiNetworksResponse().hashCode();
            }
            if (hasAccessPointScanCompleteNotification()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getAccessPointScanCompleteNotification().hashCode();
            }
            if (hasConnectToWifiNetworkRequest()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getConnectToWifiNetworkRequest().hashCode();
            }
            if (hasConnectToWifiNetworkResponse()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getConnectToWifiNetworkResponse().hashCode();
            }
            if (hasConnectToWifiNetworkNotification()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getConnectToWifiNetworkNotification().hashCode();
            }
            if (hasSaveWifiNetworkRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getSaveWifiNetworkRequest().hashCode();
            }
            if (hasSaveWifiNetworkResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getSaveWifiNetworkResponse().hashCode();
            }
            if (hasRemoveWifiNetworkRequest()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getRemoveWifiNetworkRequest().hashCode();
            }
            if (hasRemoveWifiNetworkResponse()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getRemoveWifiNetworkResponse().hashCode();
            }
            if (hasStoredWifiNetworksRequest()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getStoredWifiNetworksRequest().hashCode();
            }
            if (hasStoredWifiNetworksResponse()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getStoredWifiNetworksResponse().hashCode();
            }
            if (hasMobileCarrierInfoRequest()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getMobileCarrierInfoRequest().hashCode();
            }
            if (hasMobileCarrierInfoResponse()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + getMobileCarrierInfoResponse().hashCode();
            }
            if (hasSwitchToApRequest()) {
                iHashCode = e5.c(iHashCode, 37, 15, 53) + getSwitchToApRequest().hashCode();
            }
            if (hasSwitchToApResponse()) {
                iHashCode = e5.c(iHashCode, 37, 16, 53) + getSwitchToApResponse().hashCode();
            }
            if (hasGetNetworkCredentialsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 17, 53) + getGetNetworkCredentialsRequest().hashCode();
            }
            if (hasGetNetworkCredentialsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 18, 53) + getGetNetworkCredentialsResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_WifiSetupUnifiedService_fieldAccessorTable.ensureFieldAccessorsInitialized(WifiSetupUnifiedService.class, Builder.class);
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
            if (hasAccessPointScanCompleteNotification() && !getAccessPointScanCompleteNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasConnectToWifiNetworkRequest() && !getConnectToWifiNetworkRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSaveWifiNetworkRequest() && !getSaveWifiNetworkRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasStoredWifiNetworksResponse() && !getStoredWifiNetworksResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSwitchToApResponse() && !getSwitchToApResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasGetNetworkCredentialsResponse() || getGetNetworkCredentialsResponse().isInitialized()) {
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
            return new WifiSetupUnifiedService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getScanWifiNetworksRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getScanWifiNetworksResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getAccessPointScanCompleteNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getConnectToWifiNetworkRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getConnectToWifiNetworkResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getConnectToWifiNetworkNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getSaveWifiNetworkRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getSaveWifiNetworkResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getRemoveWifiNetworkRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getRemoveWifiNetworkResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getStoredWifiNetworksRequest());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(12, getStoredWifiNetworksResponse());
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeMessage(13, getMobileCarrierInfoRequest());
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeMessage(14, getMobileCarrierInfoResponse());
            }
            if ((this.bitField0_ & 16384) != 0) {
                codedOutputStream.writeMessage(15, getSwitchToApRequest());
            }
            if ((this.bitField0_ & 32768) != 0) {
                codedOutputStream.writeMessage(16, getSwitchToApResponse());
            }
            if ((this.bitField0_ & 65536) != 0) {
                codedOutputStream.writeMessage(17, getGetNetworkCredentialsRequest());
            }
            if ((this.bitField0_ & 131072) != 0) {
                codedOutputStream.writeMessage(18, getGetNetworkCredentialsResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WifiSetupUnifiedServiceOrBuilder {
            private SingleFieldBuilderV3<ScanCompleteNotification, ScanCompleteNotification.Builder, ScanCompleteNotificationOrBuilder> accessPointScanCompleteNotificationBuilder_;
            private ScanCompleteNotification accessPointScanCompleteNotification_;
            private int bitField0_;
            private SingleFieldBuilderV3<ConnectToWifiNetworkNotification, ConnectToWifiNetworkNotification.Builder, ConnectToWifiNetworkNotificationOrBuilder> connectToWifiNetworkNotificationBuilder_;
            private ConnectToWifiNetworkNotification connectToWifiNetworkNotification_;
            private SingleFieldBuilderV3<ConnectToWifiNetworkRequest, ConnectToWifiNetworkRequest.Builder, ConnectToWifiNetworkRequestOrBuilder> connectToWifiNetworkRequestBuilder_;
            private ConnectToWifiNetworkRequest connectToWifiNetworkRequest_;
            private SingleFieldBuilderV3<ConnectToWifiNetworkResponse, ConnectToWifiNetworkResponse.Builder, ConnectToWifiNetworkResponseOrBuilder> connectToWifiNetworkResponseBuilder_;
            private ConnectToWifiNetworkResponse connectToWifiNetworkResponse_;
            private SingleFieldBuilderV3<DeviceAPCredentialsRequest, DeviceAPCredentialsRequest.Builder, DeviceAPCredentialsRequestOrBuilder> getNetworkCredentialsRequestBuilder_;
            private DeviceAPCredentialsRequest getNetworkCredentialsRequest_;
            private SingleFieldBuilderV3<DeviceAPCredentialsResponse, DeviceAPCredentialsResponse.Builder, DeviceAPCredentialsResponseOrBuilder> getNetworkCredentialsResponseBuilder_;
            private DeviceAPCredentialsResponse getNetworkCredentialsResponse_;
            private SingleFieldBuilderV3<MobileCarrierInfoRequest, MobileCarrierInfoRequest.Builder, MobileCarrierInfoRequestOrBuilder> mobileCarrierInfoRequestBuilder_;
            private MobileCarrierInfoRequest mobileCarrierInfoRequest_;
            private SingleFieldBuilderV3<MobileCarrierInfoResponse, MobileCarrierInfoResponse.Builder, MobileCarrierInfoResponseOrBuilder> mobileCarrierInfoResponseBuilder_;
            private MobileCarrierInfoResponse mobileCarrierInfoResponse_;
            private SingleFieldBuilderV3<RemoveWifiNetworkRequest, RemoveWifiNetworkRequest.Builder, RemoveWifiNetworkRequestOrBuilder> removeWifiNetworkRequestBuilder_;
            private RemoveWifiNetworkRequest removeWifiNetworkRequest_;
            private SingleFieldBuilderV3<RemoveWifiNetworkResponse, RemoveWifiNetworkResponse.Builder, RemoveWifiNetworkResponseOrBuilder> removeWifiNetworkResponseBuilder_;
            private RemoveWifiNetworkResponse removeWifiNetworkResponse_;
            private SingleFieldBuilderV3<SaveWifiNetworkRequest, SaveWifiNetworkRequest.Builder, SaveWifiNetworkRequestOrBuilder> saveWifiNetworkRequestBuilder_;
            private SaveWifiNetworkRequest saveWifiNetworkRequest_;
            private SingleFieldBuilderV3<SaveWifiNetworkResponse, SaveWifiNetworkResponse.Builder, SaveWifiNetworkResponseOrBuilder> saveWifiNetworkResponseBuilder_;
            private SaveWifiNetworkResponse saveWifiNetworkResponse_;
            private SingleFieldBuilderV3<ScanWifiNetworksRequest, ScanWifiNetworksRequest.Builder, ScanWifiNetworksRequestOrBuilder> scanWifiNetworksRequestBuilder_;
            private ScanWifiNetworksRequest scanWifiNetworksRequest_;
            private SingleFieldBuilderV3<ScanWifiNetworksResponse, ScanWifiNetworksResponse.Builder, ScanWifiNetworksResponseOrBuilder> scanWifiNetworksResponseBuilder_;
            private ScanWifiNetworksResponse scanWifiNetworksResponse_;
            private SingleFieldBuilderV3<GetStoredWifiNetworksRequest, GetStoredWifiNetworksRequest.Builder, GetStoredWifiNetworksRequestOrBuilder> storedWifiNetworksRequestBuilder_;
            private GetStoredWifiNetworksRequest storedWifiNetworksRequest_;
            private SingleFieldBuilderV3<GetStoredWifiNetworksResponse, GetStoredWifiNetworksResponse.Builder, GetStoredWifiNetworksResponseOrBuilder> storedWifiNetworksResponseBuilder_;
            private GetStoredWifiNetworksResponse storedWifiNetworksResponse_;
            private SingleFieldBuilderV3<SwitchToApModeRequest, SwitchToApModeRequest.Builder, SwitchToApModeRequestOrBuilder> switchToApRequestBuilder_;
            private SwitchToApModeRequest switchToApRequest_;
            private SingleFieldBuilderV3<SwitchToApModeResponse, SwitchToApModeResponse.Builder, SwitchToApModeResponseOrBuilder> switchToApResponseBuilder_;
            private SwitchToApModeResponse switchToApResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(WifiSetupUnifiedService wifiSetupUnifiedService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<ScanWifiNetworksRequest, ScanWifiNetworksRequest.Builder, ScanWifiNetworksRequestOrBuilder> singleFieldBuilderV3 = this.scanWifiNetworksRequestBuilder_;
                    wifiSetupUnifiedService.scanWifiNetworksRequest_ = singleFieldBuilderV3 == null ? this.scanWifiNetworksRequest_ : (ScanWifiNetworksRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ScanWifiNetworksResponse, ScanWifiNetworksResponse.Builder, ScanWifiNetworksResponseOrBuilder> singleFieldBuilderV4 = this.scanWifiNetworksResponseBuilder_;
                    wifiSetupUnifiedService.scanWifiNetworksResponse_ = singleFieldBuilderV4 == null ? this.scanWifiNetworksResponse_ : (ScanWifiNetworksResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<ScanCompleteNotification, ScanCompleteNotification.Builder, ScanCompleteNotificationOrBuilder> singleFieldBuilderV5 = this.accessPointScanCompleteNotificationBuilder_;
                    wifiSetupUnifiedService.accessPointScanCompleteNotification_ = singleFieldBuilderV5 == null ? this.accessPointScanCompleteNotification_ : (ScanCompleteNotification) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<ConnectToWifiNetworkRequest, ConnectToWifiNetworkRequest.Builder, ConnectToWifiNetworkRequestOrBuilder> singleFieldBuilderV6 = this.connectToWifiNetworkRequestBuilder_;
                    wifiSetupUnifiedService.connectToWifiNetworkRequest_ = singleFieldBuilderV6 == null ? this.connectToWifiNetworkRequest_ : (ConnectToWifiNetworkRequest) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<ConnectToWifiNetworkResponse, ConnectToWifiNetworkResponse.Builder, ConnectToWifiNetworkResponseOrBuilder> singleFieldBuilderV7 = this.connectToWifiNetworkResponseBuilder_;
                    wifiSetupUnifiedService.connectToWifiNetworkResponse_ = singleFieldBuilderV7 == null ? this.connectToWifiNetworkResponse_ : (ConnectToWifiNetworkResponse) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<ConnectToWifiNetworkNotification, ConnectToWifiNetworkNotification.Builder, ConnectToWifiNetworkNotificationOrBuilder> singleFieldBuilderV8 = this.connectToWifiNetworkNotificationBuilder_;
                    wifiSetupUnifiedService.connectToWifiNetworkNotification_ = singleFieldBuilderV8 == null ? this.connectToWifiNetworkNotification_ : (ConnectToWifiNetworkNotification) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<SaveWifiNetworkRequest, SaveWifiNetworkRequest.Builder, SaveWifiNetworkRequestOrBuilder> singleFieldBuilderV9 = this.saveWifiNetworkRequestBuilder_;
                    wifiSetupUnifiedService.saveWifiNetworkRequest_ = singleFieldBuilderV9 == null ? this.saveWifiNetworkRequest_ : (SaveWifiNetworkRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<SaveWifiNetworkResponse, SaveWifiNetworkResponse.Builder, SaveWifiNetworkResponseOrBuilder> singleFieldBuilderV10 = this.saveWifiNetworkResponseBuilder_;
                    wifiSetupUnifiedService.saveWifiNetworkResponse_ = singleFieldBuilderV10 == null ? this.saveWifiNetworkResponse_ : (SaveWifiNetworkResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<RemoveWifiNetworkRequest, RemoveWifiNetworkRequest.Builder, RemoveWifiNetworkRequestOrBuilder> singleFieldBuilderV11 = this.removeWifiNetworkRequestBuilder_;
                    wifiSetupUnifiedService.removeWifiNetworkRequest_ = singleFieldBuilderV11 == null ? this.removeWifiNetworkRequest_ : (RemoveWifiNetworkRequest) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<RemoveWifiNetworkResponse, RemoveWifiNetworkResponse.Builder, RemoveWifiNetworkResponseOrBuilder> singleFieldBuilderV12 = this.removeWifiNetworkResponseBuilder_;
                    wifiSetupUnifiedService.removeWifiNetworkResponse_ = singleFieldBuilderV12 == null ? this.removeWifiNetworkResponse_ : (RemoveWifiNetworkResponse) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<GetStoredWifiNetworksRequest, GetStoredWifiNetworksRequest.Builder, GetStoredWifiNetworksRequestOrBuilder> singleFieldBuilderV13 = this.storedWifiNetworksRequestBuilder_;
                    wifiSetupUnifiedService.storedWifiNetworksRequest_ = singleFieldBuilderV13 == null ? this.storedWifiNetworksRequest_ : (GetStoredWifiNetworksRequest) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<GetStoredWifiNetworksResponse, GetStoredWifiNetworksResponse.Builder, GetStoredWifiNetworksResponseOrBuilder> singleFieldBuilderV14 = this.storedWifiNetworksResponseBuilder_;
                    wifiSetupUnifiedService.storedWifiNetworksResponse_ = singleFieldBuilderV14 == null ? this.storedWifiNetworksResponse_ : (GetStoredWifiNetworksResponse) singleFieldBuilderV14.build();
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    SingleFieldBuilderV3<MobileCarrierInfoRequest, MobileCarrierInfoRequest.Builder, MobileCarrierInfoRequestOrBuilder> singleFieldBuilderV15 = this.mobileCarrierInfoRequestBuilder_;
                    wifiSetupUnifiedService.mobileCarrierInfoRequest_ = singleFieldBuilderV15 == null ? this.mobileCarrierInfoRequest_ : (MobileCarrierInfoRequest) singleFieldBuilderV15.build();
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    SingleFieldBuilderV3<MobileCarrierInfoResponse, MobileCarrierInfoResponse.Builder, MobileCarrierInfoResponseOrBuilder> singleFieldBuilderV16 = this.mobileCarrierInfoResponseBuilder_;
                    wifiSetupUnifiedService.mobileCarrierInfoResponse_ = singleFieldBuilderV16 == null ? this.mobileCarrierInfoResponse_ : (MobileCarrierInfoResponse) singleFieldBuilderV16.build();
                    i14 |= 8192;
                }
                if ((i15 & 16384) != 0) {
                    SingleFieldBuilderV3<SwitchToApModeRequest, SwitchToApModeRequest.Builder, SwitchToApModeRequestOrBuilder> singleFieldBuilderV17 = this.switchToApRequestBuilder_;
                    wifiSetupUnifiedService.switchToApRequest_ = singleFieldBuilderV17 == null ? this.switchToApRequest_ : (SwitchToApModeRequest) singleFieldBuilderV17.build();
                    i14 |= 16384;
                }
                if ((i15 & 32768) != 0) {
                    SingleFieldBuilderV3<SwitchToApModeResponse, SwitchToApModeResponse.Builder, SwitchToApModeResponseOrBuilder> singleFieldBuilderV18 = this.switchToApResponseBuilder_;
                    wifiSetupUnifiedService.switchToApResponse_ = singleFieldBuilderV18 == null ? this.switchToApResponse_ : (SwitchToApModeResponse) singleFieldBuilderV18.build();
                    i14 |= 32768;
                }
                if ((i15 & 65536) != 0) {
                    SingleFieldBuilderV3<DeviceAPCredentialsRequest, DeviceAPCredentialsRequest.Builder, DeviceAPCredentialsRequestOrBuilder> singleFieldBuilderV19 = this.getNetworkCredentialsRequestBuilder_;
                    wifiSetupUnifiedService.getNetworkCredentialsRequest_ = singleFieldBuilderV19 == null ? this.getNetworkCredentialsRequest_ : (DeviceAPCredentialsRequest) singleFieldBuilderV19.build();
                    i14 |= 65536;
                }
                if ((i15 & 131072) != 0) {
                    SingleFieldBuilderV3<DeviceAPCredentialsResponse, DeviceAPCredentialsResponse.Builder, DeviceAPCredentialsResponseOrBuilder> singleFieldBuilderV20 = this.getNetworkCredentialsResponseBuilder_;
                    wifiSetupUnifiedService.getNetworkCredentialsResponse_ = singleFieldBuilderV20 == null ? this.getNetworkCredentialsResponse_ : (DeviceAPCredentialsResponse) singleFieldBuilderV20.build();
                    i14 |= 131072;
                }
                wifiSetupUnifiedService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ScanCompleteNotification, ScanCompleteNotification.Builder, ScanCompleteNotificationOrBuilder> getAccessPointScanCompleteNotificationFieldBuilder() {
                if (this.accessPointScanCompleteNotificationBuilder_ == null) {
                    this.accessPointScanCompleteNotificationBuilder_ = new SingleFieldBuilderV3<>(getAccessPointScanCompleteNotification(), getParentForChildren(), isClean());
                    this.accessPointScanCompleteNotification_ = null;
                }
                return this.accessPointScanCompleteNotificationBuilder_;
            }

            private SingleFieldBuilderV3<ConnectToWifiNetworkNotification, ConnectToWifiNetworkNotification.Builder, ConnectToWifiNetworkNotificationOrBuilder> getConnectToWifiNetworkNotificationFieldBuilder() {
                if (this.connectToWifiNetworkNotificationBuilder_ == null) {
                    this.connectToWifiNetworkNotificationBuilder_ = new SingleFieldBuilderV3<>(getConnectToWifiNetworkNotification(), getParentForChildren(), isClean());
                    this.connectToWifiNetworkNotification_ = null;
                }
                return this.connectToWifiNetworkNotificationBuilder_;
            }

            private SingleFieldBuilderV3<ConnectToWifiNetworkRequest, ConnectToWifiNetworkRequest.Builder, ConnectToWifiNetworkRequestOrBuilder> getConnectToWifiNetworkRequestFieldBuilder() {
                if (this.connectToWifiNetworkRequestBuilder_ == null) {
                    this.connectToWifiNetworkRequestBuilder_ = new SingleFieldBuilderV3<>(getConnectToWifiNetworkRequest(), getParentForChildren(), isClean());
                    this.connectToWifiNetworkRequest_ = null;
                }
                return this.connectToWifiNetworkRequestBuilder_;
            }

            private SingleFieldBuilderV3<ConnectToWifiNetworkResponse, ConnectToWifiNetworkResponse.Builder, ConnectToWifiNetworkResponseOrBuilder> getConnectToWifiNetworkResponseFieldBuilder() {
                if (this.connectToWifiNetworkResponseBuilder_ == null) {
                    this.connectToWifiNetworkResponseBuilder_ = new SingleFieldBuilderV3<>(getConnectToWifiNetworkResponse(), getParentForChildren(), isClean());
                    this.connectToWifiNetworkResponse_ = null;
                }
                return this.connectToWifiNetworkResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_WifiSetupUnifiedService_descriptor;
            }

            private SingleFieldBuilderV3<DeviceAPCredentialsRequest, DeviceAPCredentialsRequest.Builder, DeviceAPCredentialsRequestOrBuilder> getGetNetworkCredentialsRequestFieldBuilder() {
                if (this.getNetworkCredentialsRequestBuilder_ == null) {
                    this.getNetworkCredentialsRequestBuilder_ = new SingleFieldBuilderV3<>(getGetNetworkCredentialsRequest(), getParentForChildren(), isClean());
                    this.getNetworkCredentialsRequest_ = null;
                }
                return this.getNetworkCredentialsRequestBuilder_;
            }

            private SingleFieldBuilderV3<DeviceAPCredentialsResponse, DeviceAPCredentialsResponse.Builder, DeviceAPCredentialsResponseOrBuilder> getGetNetworkCredentialsResponseFieldBuilder() {
                if (this.getNetworkCredentialsResponseBuilder_ == null) {
                    this.getNetworkCredentialsResponseBuilder_ = new SingleFieldBuilderV3<>(getGetNetworkCredentialsResponse(), getParentForChildren(), isClean());
                    this.getNetworkCredentialsResponse_ = null;
                }
                return this.getNetworkCredentialsResponseBuilder_;
            }

            private SingleFieldBuilderV3<MobileCarrierInfoRequest, MobileCarrierInfoRequest.Builder, MobileCarrierInfoRequestOrBuilder> getMobileCarrierInfoRequestFieldBuilder() {
                if (this.mobileCarrierInfoRequestBuilder_ == null) {
                    this.mobileCarrierInfoRequestBuilder_ = new SingleFieldBuilderV3<>(getMobileCarrierInfoRequest(), getParentForChildren(), isClean());
                    this.mobileCarrierInfoRequest_ = null;
                }
                return this.mobileCarrierInfoRequestBuilder_;
            }

            private SingleFieldBuilderV3<MobileCarrierInfoResponse, MobileCarrierInfoResponse.Builder, MobileCarrierInfoResponseOrBuilder> getMobileCarrierInfoResponseFieldBuilder() {
                if (this.mobileCarrierInfoResponseBuilder_ == null) {
                    this.mobileCarrierInfoResponseBuilder_ = new SingleFieldBuilderV3<>(getMobileCarrierInfoResponse(), getParentForChildren(), isClean());
                    this.mobileCarrierInfoResponse_ = null;
                }
                return this.mobileCarrierInfoResponseBuilder_;
            }

            private SingleFieldBuilderV3<RemoveWifiNetworkRequest, RemoveWifiNetworkRequest.Builder, RemoveWifiNetworkRequestOrBuilder> getRemoveWifiNetworkRequestFieldBuilder() {
                if (this.removeWifiNetworkRequestBuilder_ == null) {
                    this.removeWifiNetworkRequestBuilder_ = new SingleFieldBuilderV3<>(getRemoveWifiNetworkRequest(), getParentForChildren(), isClean());
                    this.removeWifiNetworkRequest_ = null;
                }
                return this.removeWifiNetworkRequestBuilder_;
            }

            private SingleFieldBuilderV3<RemoveWifiNetworkResponse, RemoveWifiNetworkResponse.Builder, RemoveWifiNetworkResponseOrBuilder> getRemoveWifiNetworkResponseFieldBuilder() {
                if (this.removeWifiNetworkResponseBuilder_ == null) {
                    this.removeWifiNetworkResponseBuilder_ = new SingleFieldBuilderV3<>(getRemoveWifiNetworkResponse(), getParentForChildren(), isClean());
                    this.removeWifiNetworkResponse_ = null;
                }
                return this.removeWifiNetworkResponseBuilder_;
            }

            private SingleFieldBuilderV3<SaveWifiNetworkRequest, SaveWifiNetworkRequest.Builder, SaveWifiNetworkRequestOrBuilder> getSaveWifiNetworkRequestFieldBuilder() {
                if (this.saveWifiNetworkRequestBuilder_ == null) {
                    this.saveWifiNetworkRequestBuilder_ = new SingleFieldBuilderV3<>(getSaveWifiNetworkRequest(), getParentForChildren(), isClean());
                    this.saveWifiNetworkRequest_ = null;
                }
                return this.saveWifiNetworkRequestBuilder_;
            }

            private SingleFieldBuilderV3<SaveWifiNetworkResponse, SaveWifiNetworkResponse.Builder, SaveWifiNetworkResponseOrBuilder> getSaveWifiNetworkResponseFieldBuilder() {
                if (this.saveWifiNetworkResponseBuilder_ == null) {
                    this.saveWifiNetworkResponseBuilder_ = new SingleFieldBuilderV3<>(getSaveWifiNetworkResponse(), getParentForChildren(), isClean());
                    this.saveWifiNetworkResponse_ = null;
                }
                return this.saveWifiNetworkResponseBuilder_;
            }

            private SingleFieldBuilderV3<ScanWifiNetworksRequest, ScanWifiNetworksRequest.Builder, ScanWifiNetworksRequestOrBuilder> getScanWifiNetworksRequestFieldBuilder() {
                if (this.scanWifiNetworksRequestBuilder_ == null) {
                    this.scanWifiNetworksRequestBuilder_ = new SingleFieldBuilderV3<>(getScanWifiNetworksRequest(), getParentForChildren(), isClean());
                    this.scanWifiNetworksRequest_ = null;
                }
                return this.scanWifiNetworksRequestBuilder_;
            }

            private SingleFieldBuilderV3<ScanWifiNetworksResponse, ScanWifiNetworksResponse.Builder, ScanWifiNetworksResponseOrBuilder> getScanWifiNetworksResponseFieldBuilder() {
                if (this.scanWifiNetworksResponseBuilder_ == null) {
                    this.scanWifiNetworksResponseBuilder_ = new SingleFieldBuilderV3<>(getScanWifiNetworksResponse(), getParentForChildren(), isClean());
                    this.scanWifiNetworksResponse_ = null;
                }
                return this.scanWifiNetworksResponseBuilder_;
            }

            private SingleFieldBuilderV3<GetStoredWifiNetworksRequest, GetStoredWifiNetworksRequest.Builder, GetStoredWifiNetworksRequestOrBuilder> getStoredWifiNetworksRequestFieldBuilder() {
                if (this.storedWifiNetworksRequestBuilder_ == null) {
                    this.storedWifiNetworksRequestBuilder_ = new SingleFieldBuilderV3<>(getStoredWifiNetworksRequest(), getParentForChildren(), isClean());
                    this.storedWifiNetworksRequest_ = null;
                }
                return this.storedWifiNetworksRequestBuilder_;
            }

            private SingleFieldBuilderV3<GetStoredWifiNetworksResponse, GetStoredWifiNetworksResponse.Builder, GetStoredWifiNetworksResponseOrBuilder> getStoredWifiNetworksResponseFieldBuilder() {
                if (this.storedWifiNetworksResponseBuilder_ == null) {
                    this.storedWifiNetworksResponseBuilder_ = new SingleFieldBuilderV3<>(getStoredWifiNetworksResponse(), getParentForChildren(), isClean());
                    this.storedWifiNetworksResponse_ = null;
                }
                return this.storedWifiNetworksResponseBuilder_;
            }

            private SingleFieldBuilderV3<SwitchToApModeRequest, SwitchToApModeRequest.Builder, SwitchToApModeRequestOrBuilder> getSwitchToApRequestFieldBuilder() {
                if (this.switchToApRequestBuilder_ == null) {
                    this.switchToApRequestBuilder_ = new SingleFieldBuilderV3<>(getSwitchToApRequest(), getParentForChildren(), isClean());
                    this.switchToApRequest_ = null;
                }
                return this.switchToApRequestBuilder_;
            }

            private SingleFieldBuilderV3<SwitchToApModeResponse, SwitchToApModeResponse.Builder, SwitchToApModeResponseOrBuilder> getSwitchToApResponseFieldBuilder() {
                if (this.switchToApResponseBuilder_ == null) {
                    this.switchToApResponseBuilder_ = new SingleFieldBuilderV3<>(getSwitchToApResponse(), getParentForChildren(), isClean());
                    this.switchToApResponse_ = null;
                }
                return this.switchToApResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getScanWifiNetworksRequestFieldBuilder();
                    getScanWifiNetworksResponseFieldBuilder();
                    getAccessPointScanCompleteNotificationFieldBuilder();
                    getConnectToWifiNetworkRequestFieldBuilder();
                    getConnectToWifiNetworkResponseFieldBuilder();
                    getConnectToWifiNetworkNotificationFieldBuilder();
                    getSaveWifiNetworkRequestFieldBuilder();
                    getSaveWifiNetworkResponseFieldBuilder();
                    getRemoveWifiNetworkRequestFieldBuilder();
                    getRemoveWifiNetworkResponseFieldBuilder();
                    getStoredWifiNetworksRequestFieldBuilder();
                    getStoredWifiNetworksResponseFieldBuilder();
                    getMobileCarrierInfoRequestFieldBuilder();
                    getMobileCarrierInfoResponseFieldBuilder();
                    getSwitchToApRequestFieldBuilder();
                    getSwitchToApResponseFieldBuilder();
                    getGetNetworkCredentialsRequestFieldBuilder();
                    getGetNetworkCredentialsResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WifiSetupUnifiedService build() {
                WifiSetupUnifiedService wifiSetupUnifiedServiceBuildPartial = buildPartial();
                if (wifiSetupUnifiedServiceBuildPartial.isInitialized()) {
                    return wifiSetupUnifiedServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) wifiSetupUnifiedServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WifiSetupUnifiedService buildPartial() {
                WifiSetupUnifiedService wifiSetupUnifiedService = new WifiSetupUnifiedService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(wifiSetupUnifiedService);
                }
                onBuilt();
                return wifiSetupUnifiedService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.scanWifiNetworksRequest_ = null;
                SingleFieldBuilderV3<ScanWifiNetworksRequest, ScanWifiNetworksRequest.Builder, ScanWifiNetworksRequestOrBuilder> singleFieldBuilderV3 = this.scanWifiNetworksRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.scanWifiNetworksRequestBuilder_ = null;
                }
                this.scanWifiNetworksResponse_ = null;
                SingleFieldBuilderV3<ScanWifiNetworksResponse, ScanWifiNetworksResponse.Builder, ScanWifiNetworksResponseOrBuilder> singleFieldBuilderV4 = this.scanWifiNetworksResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.scanWifiNetworksResponseBuilder_ = null;
                }
                this.accessPointScanCompleteNotification_ = null;
                SingleFieldBuilderV3<ScanCompleteNotification, ScanCompleteNotification.Builder, ScanCompleteNotificationOrBuilder> singleFieldBuilderV5 = this.accessPointScanCompleteNotificationBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.accessPointScanCompleteNotificationBuilder_ = null;
                }
                this.connectToWifiNetworkRequest_ = null;
                SingleFieldBuilderV3<ConnectToWifiNetworkRequest, ConnectToWifiNetworkRequest.Builder, ConnectToWifiNetworkRequestOrBuilder> singleFieldBuilderV6 = this.connectToWifiNetworkRequestBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.connectToWifiNetworkRequestBuilder_ = null;
                }
                this.connectToWifiNetworkResponse_ = null;
                SingleFieldBuilderV3<ConnectToWifiNetworkResponse, ConnectToWifiNetworkResponse.Builder, ConnectToWifiNetworkResponseOrBuilder> singleFieldBuilderV7 = this.connectToWifiNetworkResponseBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.connectToWifiNetworkResponseBuilder_ = null;
                }
                this.connectToWifiNetworkNotification_ = null;
                SingleFieldBuilderV3<ConnectToWifiNetworkNotification, ConnectToWifiNetworkNotification.Builder, ConnectToWifiNetworkNotificationOrBuilder> singleFieldBuilderV8 = this.connectToWifiNetworkNotificationBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.connectToWifiNetworkNotificationBuilder_ = null;
                }
                this.saveWifiNetworkRequest_ = null;
                SingleFieldBuilderV3<SaveWifiNetworkRequest, SaveWifiNetworkRequest.Builder, SaveWifiNetworkRequestOrBuilder> singleFieldBuilderV9 = this.saveWifiNetworkRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.saveWifiNetworkRequestBuilder_ = null;
                }
                this.saveWifiNetworkResponse_ = null;
                SingleFieldBuilderV3<SaveWifiNetworkResponse, SaveWifiNetworkResponse.Builder, SaveWifiNetworkResponseOrBuilder> singleFieldBuilderV10 = this.saveWifiNetworkResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.saveWifiNetworkResponseBuilder_ = null;
                }
                this.removeWifiNetworkRequest_ = null;
                SingleFieldBuilderV3<RemoveWifiNetworkRequest, RemoveWifiNetworkRequest.Builder, RemoveWifiNetworkRequestOrBuilder> singleFieldBuilderV11 = this.removeWifiNetworkRequestBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.removeWifiNetworkRequestBuilder_ = null;
                }
                this.removeWifiNetworkResponse_ = null;
                SingleFieldBuilderV3<RemoveWifiNetworkResponse, RemoveWifiNetworkResponse.Builder, RemoveWifiNetworkResponseOrBuilder> singleFieldBuilderV12 = this.removeWifiNetworkResponseBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.removeWifiNetworkResponseBuilder_ = null;
                }
                this.storedWifiNetworksRequest_ = null;
                SingleFieldBuilderV3<GetStoredWifiNetworksRequest, GetStoredWifiNetworksRequest.Builder, GetStoredWifiNetworksRequestOrBuilder> singleFieldBuilderV13 = this.storedWifiNetworksRequestBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.storedWifiNetworksRequestBuilder_ = null;
                }
                this.storedWifiNetworksResponse_ = null;
                SingleFieldBuilderV3<GetStoredWifiNetworksResponse, GetStoredWifiNetworksResponse.Builder, GetStoredWifiNetworksResponseOrBuilder> singleFieldBuilderV14 = this.storedWifiNetworksResponseBuilder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.storedWifiNetworksResponseBuilder_ = null;
                }
                this.mobileCarrierInfoRequest_ = null;
                SingleFieldBuilderV3<MobileCarrierInfoRequest, MobileCarrierInfoRequest.Builder, MobileCarrierInfoRequestOrBuilder> singleFieldBuilderV15 = this.mobileCarrierInfoRequestBuilder_;
                if (singleFieldBuilderV15 != null) {
                    singleFieldBuilderV15.dispose();
                    this.mobileCarrierInfoRequestBuilder_ = null;
                }
                this.mobileCarrierInfoResponse_ = null;
                SingleFieldBuilderV3<MobileCarrierInfoResponse, MobileCarrierInfoResponse.Builder, MobileCarrierInfoResponseOrBuilder> singleFieldBuilderV16 = this.mobileCarrierInfoResponseBuilder_;
                if (singleFieldBuilderV16 != null) {
                    singleFieldBuilderV16.dispose();
                    this.mobileCarrierInfoResponseBuilder_ = null;
                }
                this.switchToApRequest_ = null;
                SingleFieldBuilderV3<SwitchToApModeRequest, SwitchToApModeRequest.Builder, SwitchToApModeRequestOrBuilder> singleFieldBuilderV17 = this.switchToApRequestBuilder_;
                if (singleFieldBuilderV17 != null) {
                    singleFieldBuilderV17.dispose();
                    this.switchToApRequestBuilder_ = null;
                }
                this.switchToApResponse_ = null;
                SingleFieldBuilderV3<SwitchToApModeResponse, SwitchToApModeResponse.Builder, SwitchToApModeResponseOrBuilder> singleFieldBuilderV18 = this.switchToApResponseBuilder_;
                if (singleFieldBuilderV18 != null) {
                    singleFieldBuilderV18.dispose();
                    this.switchToApResponseBuilder_ = null;
                }
                this.getNetworkCredentialsRequest_ = null;
                SingleFieldBuilderV3<DeviceAPCredentialsRequest, DeviceAPCredentialsRequest.Builder, DeviceAPCredentialsRequestOrBuilder> singleFieldBuilderV19 = this.getNetworkCredentialsRequestBuilder_;
                if (singleFieldBuilderV19 != null) {
                    singleFieldBuilderV19.dispose();
                    this.getNetworkCredentialsRequestBuilder_ = null;
                }
                this.getNetworkCredentialsResponse_ = null;
                SingleFieldBuilderV3<DeviceAPCredentialsResponse, DeviceAPCredentialsResponse.Builder, DeviceAPCredentialsResponseOrBuilder> singleFieldBuilderV20 = this.getNetworkCredentialsResponseBuilder_;
                if (singleFieldBuilderV20 != null) {
                    singleFieldBuilderV20.dispose();
                    this.getNetworkCredentialsResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearAccessPointScanCompleteNotification() {
                this.bitField0_ &= -5;
                this.accessPointScanCompleteNotification_ = null;
                SingleFieldBuilderV3<ScanCompleteNotification, ScanCompleteNotification.Builder, ScanCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.accessPointScanCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.accessPointScanCompleteNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConnectToWifiNetworkNotification() {
                this.bitField0_ &= -33;
                this.connectToWifiNetworkNotification_ = null;
                SingleFieldBuilderV3<ConnectToWifiNetworkNotification, ConnectToWifiNetworkNotification.Builder, ConnectToWifiNetworkNotificationOrBuilder> singleFieldBuilderV3 = this.connectToWifiNetworkNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectToWifiNetworkNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConnectToWifiNetworkRequest() {
                this.bitField0_ &= -9;
                this.connectToWifiNetworkRequest_ = null;
                SingleFieldBuilderV3<ConnectToWifiNetworkRequest, ConnectToWifiNetworkRequest.Builder, ConnectToWifiNetworkRequestOrBuilder> singleFieldBuilderV3 = this.connectToWifiNetworkRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectToWifiNetworkRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConnectToWifiNetworkResponse() {
                this.bitField0_ &= -17;
                this.connectToWifiNetworkResponse_ = null;
                SingleFieldBuilderV3<ConnectToWifiNetworkResponse, ConnectToWifiNetworkResponse.Builder, ConnectToWifiNetworkResponseOrBuilder> singleFieldBuilderV3 = this.connectToWifiNetworkResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectToWifiNetworkResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGetNetworkCredentialsRequest() {
                this.bitField0_ &= -65537;
                this.getNetworkCredentialsRequest_ = null;
                SingleFieldBuilderV3<DeviceAPCredentialsRequest, DeviceAPCredentialsRequest.Builder, DeviceAPCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getNetworkCredentialsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearGetNetworkCredentialsResponse() {
                this.bitField0_ &= -131073;
                this.getNetworkCredentialsResponse_ = null;
                SingleFieldBuilderV3<DeviceAPCredentialsResponse, DeviceAPCredentialsResponse.Builder, DeviceAPCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getNetworkCredentialsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearMobileCarrierInfoRequest() {
                this.bitField0_ &= -4097;
                this.mobileCarrierInfoRequest_ = null;
                SingleFieldBuilderV3<MobileCarrierInfoRequest, MobileCarrierInfoRequest.Builder, MobileCarrierInfoRequestOrBuilder> singleFieldBuilderV3 = this.mobileCarrierInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.mobileCarrierInfoRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearMobileCarrierInfoResponse() {
                this.bitField0_ &= -8193;
                this.mobileCarrierInfoResponse_ = null;
                SingleFieldBuilderV3<MobileCarrierInfoResponse, MobileCarrierInfoResponse.Builder, MobileCarrierInfoResponseOrBuilder> singleFieldBuilderV3 = this.mobileCarrierInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.mobileCarrierInfoResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearRemoveWifiNetworkRequest() {
                this.bitField0_ &= -257;
                this.removeWifiNetworkRequest_ = null;
                SingleFieldBuilderV3<RemoveWifiNetworkRequest, RemoveWifiNetworkRequest.Builder, RemoveWifiNetworkRequestOrBuilder> singleFieldBuilderV3 = this.removeWifiNetworkRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.removeWifiNetworkRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRemoveWifiNetworkResponse() {
                this.bitField0_ &= -513;
                this.removeWifiNetworkResponse_ = null;
                SingleFieldBuilderV3<RemoveWifiNetworkResponse, RemoveWifiNetworkResponse.Builder, RemoveWifiNetworkResponseOrBuilder> singleFieldBuilderV3 = this.removeWifiNetworkResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.removeWifiNetworkResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSaveWifiNetworkRequest() {
                this.bitField0_ &= -65;
                this.saveWifiNetworkRequest_ = null;
                SingleFieldBuilderV3<SaveWifiNetworkRequest, SaveWifiNetworkRequest.Builder, SaveWifiNetworkRequestOrBuilder> singleFieldBuilderV3 = this.saveWifiNetworkRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.saveWifiNetworkRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSaveWifiNetworkResponse() {
                this.bitField0_ &= -129;
                this.saveWifiNetworkResponse_ = null;
                SingleFieldBuilderV3<SaveWifiNetworkResponse, SaveWifiNetworkResponse.Builder, SaveWifiNetworkResponseOrBuilder> singleFieldBuilderV3 = this.saveWifiNetworkResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.saveWifiNetworkResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearScanWifiNetworksRequest() {
                this.bitField0_ &= -2;
                this.scanWifiNetworksRequest_ = null;
                SingleFieldBuilderV3<ScanWifiNetworksRequest, ScanWifiNetworksRequest.Builder, ScanWifiNetworksRequestOrBuilder> singleFieldBuilderV3 = this.scanWifiNetworksRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.scanWifiNetworksRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearScanWifiNetworksResponse() {
                this.bitField0_ &= -3;
                this.scanWifiNetworksResponse_ = null;
                SingleFieldBuilderV3<ScanWifiNetworksResponse, ScanWifiNetworksResponse.Builder, ScanWifiNetworksResponseOrBuilder> singleFieldBuilderV3 = this.scanWifiNetworksResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.scanWifiNetworksResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStoredWifiNetworksRequest() {
                this.bitField0_ &= -1025;
                this.storedWifiNetworksRequest_ = null;
                SingleFieldBuilderV3<GetStoredWifiNetworksRequest, GetStoredWifiNetworksRequest.Builder, GetStoredWifiNetworksRequestOrBuilder> singleFieldBuilderV3 = this.storedWifiNetworksRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.storedWifiNetworksRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStoredWifiNetworksResponse() {
                this.bitField0_ &= -2049;
                this.storedWifiNetworksResponse_ = null;
                SingleFieldBuilderV3<GetStoredWifiNetworksResponse, GetStoredWifiNetworksResponse.Builder, GetStoredWifiNetworksResponseOrBuilder> singleFieldBuilderV3 = this.storedWifiNetworksResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.storedWifiNetworksResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSwitchToApRequest() {
                this.bitField0_ &= -16385;
                this.switchToApRequest_ = null;
                SingleFieldBuilderV3<SwitchToApModeRequest, SwitchToApModeRequest.Builder, SwitchToApModeRequestOrBuilder> singleFieldBuilderV3 = this.switchToApRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.switchToApRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSwitchToApResponse() {
                this.bitField0_ &= -32769;
                this.switchToApResponse_ = null;
                SingleFieldBuilderV3<SwitchToApModeResponse, SwitchToApModeResponse.Builder, SwitchToApModeResponseOrBuilder> singleFieldBuilderV3 = this.switchToApResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.switchToApResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public ScanCompleteNotification getAccessPointScanCompleteNotification() {
                SingleFieldBuilderV3<ScanCompleteNotification, ScanCompleteNotification.Builder, ScanCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.accessPointScanCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ScanCompleteNotification) singleFieldBuilderV3.getMessage();
                }
                ScanCompleteNotification scanCompleteNotification = this.accessPointScanCompleteNotification_;
                return scanCompleteNotification == null ? ScanCompleteNotification.getDefaultInstance() : scanCompleteNotification;
            }

            public ScanCompleteNotification.Builder getAccessPointScanCompleteNotificationBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (ScanCompleteNotification.Builder) getAccessPointScanCompleteNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public ScanCompleteNotificationOrBuilder getAccessPointScanCompleteNotificationOrBuilder() {
                SingleFieldBuilderV3<ScanCompleteNotification, ScanCompleteNotification.Builder, ScanCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.accessPointScanCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ScanCompleteNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ScanCompleteNotification scanCompleteNotification = this.accessPointScanCompleteNotification_;
                return scanCompleteNotification == null ? ScanCompleteNotification.getDefaultInstance() : scanCompleteNotification;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public ConnectToWifiNetworkNotification getConnectToWifiNetworkNotification() {
                SingleFieldBuilderV3<ConnectToWifiNetworkNotification, ConnectToWifiNetworkNotification.Builder, ConnectToWifiNetworkNotificationOrBuilder> singleFieldBuilderV3 = this.connectToWifiNetworkNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectToWifiNetworkNotification) singleFieldBuilderV3.getMessage();
                }
                ConnectToWifiNetworkNotification connectToWifiNetworkNotification = this.connectToWifiNetworkNotification_;
                return connectToWifiNetworkNotification == null ? ConnectToWifiNetworkNotification.getDefaultInstance() : connectToWifiNetworkNotification;
            }

            public ConnectToWifiNetworkNotification.Builder getConnectToWifiNetworkNotificationBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (ConnectToWifiNetworkNotification.Builder) getConnectToWifiNetworkNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public ConnectToWifiNetworkNotificationOrBuilder getConnectToWifiNetworkNotificationOrBuilder() {
                SingleFieldBuilderV3<ConnectToWifiNetworkNotification, ConnectToWifiNetworkNotification.Builder, ConnectToWifiNetworkNotificationOrBuilder> singleFieldBuilderV3 = this.connectToWifiNetworkNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectToWifiNetworkNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectToWifiNetworkNotification connectToWifiNetworkNotification = this.connectToWifiNetworkNotification_;
                return connectToWifiNetworkNotification == null ? ConnectToWifiNetworkNotification.getDefaultInstance() : connectToWifiNetworkNotification;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public ConnectToWifiNetworkRequest getConnectToWifiNetworkRequest() {
                SingleFieldBuilderV3<ConnectToWifiNetworkRequest, ConnectToWifiNetworkRequest.Builder, ConnectToWifiNetworkRequestOrBuilder> singleFieldBuilderV3 = this.connectToWifiNetworkRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectToWifiNetworkRequest) singleFieldBuilderV3.getMessage();
                }
                ConnectToWifiNetworkRequest connectToWifiNetworkRequest = this.connectToWifiNetworkRequest_;
                return connectToWifiNetworkRequest == null ? ConnectToWifiNetworkRequest.getDefaultInstance() : connectToWifiNetworkRequest;
            }

            public ConnectToWifiNetworkRequest.Builder getConnectToWifiNetworkRequestBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (ConnectToWifiNetworkRequest.Builder) getConnectToWifiNetworkRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public ConnectToWifiNetworkRequestOrBuilder getConnectToWifiNetworkRequestOrBuilder() {
                SingleFieldBuilderV3<ConnectToWifiNetworkRequest, ConnectToWifiNetworkRequest.Builder, ConnectToWifiNetworkRequestOrBuilder> singleFieldBuilderV3 = this.connectToWifiNetworkRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectToWifiNetworkRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectToWifiNetworkRequest connectToWifiNetworkRequest = this.connectToWifiNetworkRequest_;
                return connectToWifiNetworkRequest == null ? ConnectToWifiNetworkRequest.getDefaultInstance() : connectToWifiNetworkRequest;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public ConnectToWifiNetworkResponse getConnectToWifiNetworkResponse() {
                SingleFieldBuilderV3<ConnectToWifiNetworkResponse, ConnectToWifiNetworkResponse.Builder, ConnectToWifiNetworkResponseOrBuilder> singleFieldBuilderV3 = this.connectToWifiNetworkResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectToWifiNetworkResponse) singleFieldBuilderV3.getMessage();
                }
                ConnectToWifiNetworkResponse connectToWifiNetworkResponse = this.connectToWifiNetworkResponse_;
                return connectToWifiNetworkResponse == null ? ConnectToWifiNetworkResponse.getDefaultInstance() : connectToWifiNetworkResponse;
            }

            public ConnectToWifiNetworkResponse.Builder getConnectToWifiNetworkResponseBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (ConnectToWifiNetworkResponse.Builder) getConnectToWifiNetworkResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public ConnectToWifiNetworkResponseOrBuilder getConnectToWifiNetworkResponseOrBuilder() {
                SingleFieldBuilderV3<ConnectToWifiNetworkResponse, ConnectToWifiNetworkResponse.Builder, ConnectToWifiNetworkResponseOrBuilder> singleFieldBuilderV3 = this.connectToWifiNetworkResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectToWifiNetworkResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectToWifiNetworkResponse connectToWifiNetworkResponse = this.connectToWifiNetworkResponse_;
                return connectToWifiNetworkResponse == null ? ConnectToWifiNetworkResponse.getDefaultInstance() : connectToWifiNetworkResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_WifiSetupUnifiedService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public DeviceAPCredentialsRequest getGetNetworkCredentialsRequest() {
                SingleFieldBuilderV3<DeviceAPCredentialsRequest, DeviceAPCredentialsRequest.Builder, DeviceAPCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceAPCredentialsRequest) singleFieldBuilderV3.getMessage();
                }
                DeviceAPCredentialsRequest deviceAPCredentialsRequest = this.getNetworkCredentialsRequest_;
                return deviceAPCredentialsRequest == null ? DeviceAPCredentialsRequest.getDefaultInstance() : deviceAPCredentialsRequest;
            }

            public DeviceAPCredentialsRequest.Builder getGetNetworkCredentialsRequestBuilder() {
                this.bitField0_ |= 65536;
                onChanged();
                return (DeviceAPCredentialsRequest.Builder) getGetNetworkCredentialsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public DeviceAPCredentialsRequestOrBuilder getGetNetworkCredentialsRequestOrBuilder() {
                SingleFieldBuilderV3<DeviceAPCredentialsRequest, DeviceAPCredentialsRequest.Builder, DeviceAPCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceAPCredentialsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DeviceAPCredentialsRequest deviceAPCredentialsRequest = this.getNetworkCredentialsRequest_;
                return deviceAPCredentialsRequest == null ? DeviceAPCredentialsRequest.getDefaultInstance() : deviceAPCredentialsRequest;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public DeviceAPCredentialsResponse getGetNetworkCredentialsResponse() {
                SingleFieldBuilderV3<DeviceAPCredentialsResponse, DeviceAPCredentialsResponse.Builder, DeviceAPCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceAPCredentialsResponse) singleFieldBuilderV3.getMessage();
                }
                DeviceAPCredentialsResponse deviceAPCredentialsResponse = this.getNetworkCredentialsResponse_;
                return deviceAPCredentialsResponse == null ? DeviceAPCredentialsResponse.getDefaultInstance() : deviceAPCredentialsResponse;
            }

            public DeviceAPCredentialsResponse.Builder getGetNetworkCredentialsResponseBuilder() {
                this.bitField0_ |= 131072;
                onChanged();
                return (DeviceAPCredentialsResponse.Builder) getGetNetworkCredentialsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public DeviceAPCredentialsResponseOrBuilder getGetNetworkCredentialsResponseOrBuilder() {
                SingleFieldBuilderV3<DeviceAPCredentialsResponse, DeviceAPCredentialsResponse.Builder, DeviceAPCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceAPCredentialsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DeviceAPCredentialsResponse deviceAPCredentialsResponse = this.getNetworkCredentialsResponse_;
                return deviceAPCredentialsResponse == null ? DeviceAPCredentialsResponse.getDefaultInstance() : deviceAPCredentialsResponse;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public MobileCarrierInfoRequest getMobileCarrierInfoRequest() {
                SingleFieldBuilderV3<MobileCarrierInfoRequest, MobileCarrierInfoRequest.Builder, MobileCarrierInfoRequestOrBuilder> singleFieldBuilderV3 = this.mobileCarrierInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MobileCarrierInfoRequest) singleFieldBuilderV3.getMessage();
                }
                MobileCarrierInfoRequest mobileCarrierInfoRequest = this.mobileCarrierInfoRequest_;
                return mobileCarrierInfoRequest == null ? MobileCarrierInfoRequest.getDefaultInstance() : mobileCarrierInfoRequest;
            }

            public MobileCarrierInfoRequest.Builder getMobileCarrierInfoRequestBuilder() {
                this.bitField0_ |= 4096;
                onChanged();
                return (MobileCarrierInfoRequest.Builder) getMobileCarrierInfoRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public MobileCarrierInfoRequestOrBuilder getMobileCarrierInfoRequestOrBuilder() {
                SingleFieldBuilderV3<MobileCarrierInfoRequest, MobileCarrierInfoRequest.Builder, MobileCarrierInfoRequestOrBuilder> singleFieldBuilderV3 = this.mobileCarrierInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MobileCarrierInfoRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                MobileCarrierInfoRequest mobileCarrierInfoRequest = this.mobileCarrierInfoRequest_;
                return mobileCarrierInfoRequest == null ? MobileCarrierInfoRequest.getDefaultInstance() : mobileCarrierInfoRequest;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public MobileCarrierInfoResponse getMobileCarrierInfoResponse() {
                SingleFieldBuilderV3<MobileCarrierInfoResponse, MobileCarrierInfoResponse.Builder, MobileCarrierInfoResponseOrBuilder> singleFieldBuilderV3 = this.mobileCarrierInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MobileCarrierInfoResponse) singleFieldBuilderV3.getMessage();
                }
                MobileCarrierInfoResponse mobileCarrierInfoResponse = this.mobileCarrierInfoResponse_;
                return mobileCarrierInfoResponse == null ? MobileCarrierInfoResponse.getDefaultInstance() : mobileCarrierInfoResponse;
            }

            public MobileCarrierInfoResponse.Builder getMobileCarrierInfoResponseBuilder() {
                this.bitField0_ |= 8192;
                onChanged();
                return (MobileCarrierInfoResponse.Builder) getMobileCarrierInfoResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public MobileCarrierInfoResponseOrBuilder getMobileCarrierInfoResponseOrBuilder() {
                SingleFieldBuilderV3<MobileCarrierInfoResponse, MobileCarrierInfoResponse.Builder, MobileCarrierInfoResponseOrBuilder> singleFieldBuilderV3 = this.mobileCarrierInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MobileCarrierInfoResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                MobileCarrierInfoResponse mobileCarrierInfoResponse = this.mobileCarrierInfoResponse_;
                return mobileCarrierInfoResponse == null ? MobileCarrierInfoResponse.getDefaultInstance() : mobileCarrierInfoResponse;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public RemoveWifiNetworkRequest getRemoveWifiNetworkRequest() {
                SingleFieldBuilderV3<RemoveWifiNetworkRequest, RemoveWifiNetworkRequest.Builder, RemoveWifiNetworkRequestOrBuilder> singleFieldBuilderV3 = this.removeWifiNetworkRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RemoveWifiNetworkRequest) singleFieldBuilderV3.getMessage();
                }
                RemoveWifiNetworkRequest removeWifiNetworkRequest = this.removeWifiNetworkRequest_;
                return removeWifiNetworkRequest == null ? RemoveWifiNetworkRequest.getDefaultInstance() : removeWifiNetworkRequest;
            }

            public RemoveWifiNetworkRequest.Builder getRemoveWifiNetworkRequestBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (RemoveWifiNetworkRequest.Builder) getRemoveWifiNetworkRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public RemoveWifiNetworkRequestOrBuilder getRemoveWifiNetworkRequestOrBuilder() {
                SingleFieldBuilderV3<RemoveWifiNetworkRequest, RemoveWifiNetworkRequest.Builder, RemoveWifiNetworkRequestOrBuilder> singleFieldBuilderV3 = this.removeWifiNetworkRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RemoveWifiNetworkRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RemoveWifiNetworkRequest removeWifiNetworkRequest = this.removeWifiNetworkRequest_;
                return removeWifiNetworkRequest == null ? RemoveWifiNetworkRequest.getDefaultInstance() : removeWifiNetworkRequest;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public RemoveWifiNetworkResponse getRemoveWifiNetworkResponse() {
                SingleFieldBuilderV3<RemoveWifiNetworkResponse, RemoveWifiNetworkResponse.Builder, RemoveWifiNetworkResponseOrBuilder> singleFieldBuilderV3 = this.removeWifiNetworkResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RemoveWifiNetworkResponse) singleFieldBuilderV3.getMessage();
                }
                RemoveWifiNetworkResponse removeWifiNetworkResponse = this.removeWifiNetworkResponse_;
                return removeWifiNetworkResponse == null ? RemoveWifiNetworkResponse.getDefaultInstance() : removeWifiNetworkResponse;
            }

            public RemoveWifiNetworkResponse.Builder getRemoveWifiNetworkResponseBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (RemoveWifiNetworkResponse.Builder) getRemoveWifiNetworkResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public RemoveWifiNetworkResponseOrBuilder getRemoveWifiNetworkResponseOrBuilder() {
                SingleFieldBuilderV3<RemoveWifiNetworkResponse, RemoveWifiNetworkResponse.Builder, RemoveWifiNetworkResponseOrBuilder> singleFieldBuilderV3 = this.removeWifiNetworkResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RemoveWifiNetworkResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RemoveWifiNetworkResponse removeWifiNetworkResponse = this.removeWifiNetworkResponse_;
                return removeWifiNetworkResponse == null ? RemoveWifiNetworkResponse.getDefaultInstance() : removeWifiNetworkResponse;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public SaveWifiNetworkRequest getSaveWifiNetworkRequest() {
                SingleFieldBuilderV3<SaveWifiNetworkRequest, SaveWifiNetworkRequest.Builder, SaveWifiNetworkRequestOrBuilder> singleFieldBuilderV3 = this.saveWifiNetworkRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SaveWifiNetworkRequest) singleFieldBuilderV3.getMessage();
                }
                SaveWifiNetworkRequest saveWifiNetworkRequest = this.saveWifiNetworkRequest_;
                return saveWifiNetworkRequest == null ? SaveWifiNetworkRequest.getDefaultInstance() : saveWifiNetworkRequest;
            }

            public SaveWifiNetworkRequest.Builder getSaveWifiNetworkRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (SaveWifiNetworkRequest.Builder) getSaveWifiNetworkRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public SaveWifiNetworkRequestOrBuilder getSaveWifiNetworkRequestOrBuilder() {
                SingleFieldBuilderV3<SaveWifiNetworkRequest, SaveWifiNetworkRequest.Builder, SaveWifiNetworkRequestOrBuilder> singleFieldBuilderV3 = this.saveWifiNetworkRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SaveWifiNetworkRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SaveWifiNetworkRequest saveWifiNetworkRequest = this.saveWifiNetworkRequest_;
                return saveWifiNetworkRequest == null ? SaveWifiNetworkRequest.getDefaultInstance() : saveWifiNetworkRequest;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public SaveWifiNetworkResponse getSaveWifiNetworkResponse() {
                SingleFieldBuilderV3<SaveWifiNetworkResponse, SaveWifiNetworkResponse.Builder, SaveWifiNetworkResponseOrBuilder> singleFieldBuilderV3 = this.saveWifiNetworkResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SaveWifiNetworkResponse) singleFieldBuilderV3.getMessage();
                }
                SaveWifiNetworkResponse saveWifiNetworkResponse = this.saveWifiNetworkResponse_;
                return saveWifiNetworkResponse == null ? SaveWifiNetworkResponse.getDefaultInstance() : saveWifiNetworkResponse;
            }

            public SaveWifiNetworkResponse.Builder getSaveWifiNetworkResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (SaveWifiNetworkResponse.Builder) getSaveWifiNetworkResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public SaveWifiNetworkResponseOrBuilder getSaveWifiNetworkResponseOrBuilder() {
                SingleFieldBuilderV3<SaveWifiNetworkResponse, SaveWifiNetworkResponse.Builder, SaveWifiNetworkResponseOrBuilder> singleFieldBuilderV3 = this.saveWifiNetworkResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SaveWifiNetworkResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SaveWifiNetworkResponse saveWifiNetworkResponse = this.saveWifiNetworkResponse_;
                return saveWifiNetworkResponse == null ? SaveWifiNetworkResponse.getDefaultInstance() : saveWifiNetworkResponse;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public ScanWifiNetworksRequest getScanWifiNetworksRequest() {
                SingleFieldBuilderV3<ScanWifiNetworksRequest, ScanWifiNetworksRequest.Builder, ScanWifiNetworksRequestOrBuilder> singleFieldBuilderV3 = this.scanWifiNetworksRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ScanWifiNetworksRequest) singleFieldBuilderV3.getMessage();
                }
                ScanWifiNetworksRequest scanWifiNetworksRequest = this.scanWifiNetworksRequest_;
                return scanWifiNetworksRequest == null ? ScanWifiNetworksRequest.getDefaultInstance() : scanWifiNetworksRequest;
            }

            public ScanWifiNetworksRequest.Builder getScanWifiNetworksRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ScanWifiNetworksRequest.Builder) getScanWifiNetworksRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public ScanWifiNetworksRequestOrBuilder getScanWifiNetworksRequestOrBuilder() {
                SingleFieldBuilderV3<ScanWifiNetworksRequest, ScanWifiNetworksRequest.Builder, ScanWifiNetworksRequestOrBuilder> singleFieldBuilderV3 = this.scanWifiNetworksRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ScanWifiNetworksRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ScanWifiNetworksRequest scanWifiNetworksRequest = this.scanWifiNetworksRequest_;
                return scanWifiNetworksRequest == null ? ScanWifiNetworksRequest.getDefaultInstance() : scanWifiNetworksRequest;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public ScanWifiNetworksResponse getScanWifiNetworksResponse() {
                SingleFieldBuilderV3<ScanWifiNetworksResponse, ScanWifiNetworksResponse.Builder, ScanWifiNetworksResponseOrBuilder> singleFieldBuilderV3 = this.scanWifiNetworksResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ScanWifiNetworksResponse) singleFieldBuilderV3.getMessage();
                }
                ScanWifiNetworksResponse scanWifiNetworksResponse = this.scanWifiNetworksResponse_;
                return scanWifiNetworksResponse == null ? ScanWifiNetworksResponse.getDefaultInstance() : scanWifiNetworksResponse;
            }

            public ScanWifiNetworksResponse.Builder getScanWifiNetworksResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ScanWifiNetworksResponse.Builder) getScanWifiNetworksResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public ScanWifiNetworksResponseOrBuilder getScanWifiNetworksResponseOrBuilder() {
                SingleFieldBuilderV3<ScanWifiNetworksResponse, ScanWifiNetworksResponse.Builder, ScanWifiNetworksResponseOrBuilder> singleFieldBuilderV3 = this.scanWifiNetworksResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ScanWifiNetworksResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ScanWifiNetworksResponse scanWifiNetworksResponse = this.scanWifiNetworksResponse_;
                return scanWifiNetworksResponse == null ? ScanWifiNetworksResponse.getDefaultInstance() : scanWifiNetworksResponse;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public GetStoredWifiNetworksRequest getStoredWifiNetworksRequest() {
                SingleFieldBuilderV3<GetStoredWifiNetworksRequest, GetStoredWifiNetworksRequest.Builder, GetStoredWifiNetworksRequestOrBuilder> singleFieldBuilderV3 = this.storedWifiNetworksRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetStoredWifiNetworksRequest) singleFieldBuilderV3.getMessage();
                }
                GetStoredWifiNetworksRequest getStoredWifiNetworksRequest = this.storedWifiNetworksRequest_;
                return getStoredWifiNetworksRequest == null ? GetStoredWifiNetworksRequest.getDefaultInstance() : getStoredWifiNetworksRequest;
            }

            public GetStoredWifiNetworksRequest.Builder getStoredWifiNetworksRequestBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (GetStoredWifiNetworksRequest.Builder) getStoredWifiNetworksRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public GetStoredWifiNetworksRequestOrBuilder getStoredWifiNetworksRequestOrBuilder() {
                SingleFieldBuilderV3<GetStoredWifiNetworksRequest, GetStoredWifiNetworksRequest.Builder, GetStoredWifiNetworksRequestOrBuilder> singleFieldBuilderV3 = this.storedWifiNetworksRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetStoredWifiNetworksRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetStoredWifiNetworksRequest getStoredWifiNetworksRequest = this.storedWifiNetworksRequest_;
                return getStoredWifiNetworksRequest == null ? GetStoredWifiNetworksRequest.getDefaultInstance() : getStoredWifiNetworksRequest;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public GetStoredWifiNetworksResponse getStoredWifiNetworksResponse() {
                SingleFieldBuilderV3<GetStoredWifiNetworksResponse, GetStoredWifiNetworksResponse.Builder, GetStoredWifiNetworksResponseOrBuilder> singleFieldBuilderV3 = this.storedWifiNetworksResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetStoredWifiNetworksResponse) singleFieldBuilderV3.getMessage();
                }
                GetStoredWifiNetworksResponse getStoredWifiNetworksResponse = this.storedWifiNetworksResponse_;
                return getStoredWifiNetworksResponse == null ? GetStoredWifiNetworksResponse.getDefaultInstance() : getStoredWifiNetworksResponse;
            }

            public GetStoredWifiNetworksResponse.Builder getStoredWifiNetworksResponseBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (GetStoredWifiNetworksResponse.Builder) getStoredWifiNetworksResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public GetStoredWifiNetworksResponseOrBuilder getStoredWifiNetworksResponseOrBuilder() {
                SingleFieldBuilderV3<GetStoredWifiNetworksResponse, GetStoredWifiNetworksResponse.Builder, GetStoredWifiNetworksResponseOrBuilder> singleFieldBuilderV3 = this.storedWifiNetworksResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetStoredWifiNetworksResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetStoredWifiNetworksResponse getStoredWifiNetworksResponse = this.storedWifiNetworksResponse_;
                return getStoredWifiNetworksResponse == null ? GetStoredWifiNetworksResponse.getDefaultInstance() : getStoredWifiNetworksResponse;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public SwitchToApModeRequest getSwitchToApRequest() {
                SingleFieldBuilderV3<SwitchToApModeRequest, SwitchToApModeRequest.Builder, SwitchToApModeRequestOrBuilder> singleFieldBuilderV3 = this.switchToApRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitchToApModeRequest) singleFieldBuilderV3.getMessage();
                }
                SwitchToApModeRequest switchToApModeRequest = this.switchToApRequest_;
                return switchToApModeRequest == null ? SwitchToApModeRequest.getDefaultInstance() : switchToApModeRequest;
            }

            public SwitchToApModeRequest.Builder getSwitchToApRequestBuilder() {
                this.bitField0_ |= 16384;
                onChanged();
                return (SwitchToApModeRequest.Builder) getSwitchToApRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public SwitchToApModeRequestOrBuilder getSwitchToApRequestOrBuilder() {
                SingleFieldBuilderV3<SwitchToApModeRequest, SwitchToApModeRequest.Builder, SwitchToApModeRequestOrBuilder> singleFieldBuilderV3 = this.switchToApRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitchToApModeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SwitchToApModeRequest switchToApModeRequest = this.switchToApRequest_;
                return switchToApModeRequest == null ? SwitchToApModeRequest.getDefaultInstance() : switchToApModeRequest;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public SwitchToApModeResponse getSwitchToApResponse() {
                SingleFieldBuilderV3<SwitchToApModeResponse, SwitchToApModeResponse.Builder, SwitchToApModeResponseOrBuilder> singleFieldBuilderV3 = this.switchToApResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitchToApModeResponse) singleFieldBuilderV3.getMessage();
                }
                SwitchToApModeResponse switchToApModeResponse = this.switchToApResponse_;
                return switchToApModeResponse == null ? SwitchToApModeResponse.getDefaultInstance() : switchToApModeResponse;
            }

            public SwitchToApModeResponse.Builder getSwitchToApResponseBuilder() {
                this.bitField0_ |= 32768;
                onChanged();
                return (SwitchToApModeResponse.Builder) getSwitchToApResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public SwitchToApModeResponseOrBuilder getSwitchToApResponseOrBuilder() {
                SingleFieldBuilderV3<SwitchToApModeResponse, SwitchToApModeResponse.Builder, SwitchToApModeResponseOrBuilder> singleFieldBuilderV3 = this.switchToApResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitchToApModeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SwitchToApModeResponse switchToApModeResponse = this.switchToApResponse_;
                return switchToApModeResponse == null ? SwitchToApModeResponse.getDefaultInstance() : switchToApModeResponse;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public boolean hasAccessPointScanCompleteNotification() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public boolean hasConnectToWifiNetworkNotification() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public boolean hasConnectToWifiNetworkRequest() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public boolean hasConnectToWifiNetworkResponse() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public boolean hasGetNetworkCredentialsRequest() {
                return (this.bitField0_ & 65536) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public boolean hasGetNetworkCredentialsResponse() {
                return (this.bitField0_ & 131072) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public boolean hasMobileCarrierInfoRequest() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public boolean hasMobileCarrierInfoResponse() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public boolean hasRemoveWifiNetworkRequest() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public boolean hasRemoveWifiNetworkResponse() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public boolean hasSaveWifiNetworkRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public boolean hasSaveWifiNetworkResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public boolean hasScanWifiNetworksRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public boolean hasScanWifiNetworksResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public boolean hasStoredWifiNetworksRequest() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public boolean hasStoredWifiNetworksResponse() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public boolean hasSwitchToApRequest() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetupUnified.WifiSetupUnifiedServiceOrBuilder
            public boolean hasSwitchToApResponse() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetupUnified.internal_static_GDI_Proto_WifiSetupUnified_WifiSetupUnifiedService_fieldAccessorTable.ensureFieldAccessorsInitialized(WifiSetupUnifiedService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasAccessPointScanCompleteNotification() && !getAccessPointScanCompleteNotification().isInitialized()) {
                    return false;
                }
                if (hasConnectToWifiNetworkRequest() && !getConnectToWifiNetworkRequest().isInitialized()) {
                    return false;
                }
                if (hasSaveWifiNetworkRequest() && !getSaveWifiNetworkRequest().isInitialized()) {
                    return false;
                }
                if (hasStoredWifiNetworksResponse() && !getStoredWifiNetworksResponse().isInitialized()) {
                    return false;
                }
                if (!hasSwitchToApResponse() || getSwitchToApResponse().isInitialized()) {
                    return !hasGetNetworkCredentialsResponse() || getGetNetworkCredentialsResponse().isInitialized();
                }
                return false;
            }

            public Builder mergeAccessPointScanCompleteNotification(ScanCompleteNotification scanCompleteNotification) {
                ScanCompleteNotification scanCompleteNotification2;
                SingleFieldBuilderV3<ScanCompleteNotification, ScanCompleteNotification.Builder, ScanCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.accessPointScanCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(scanCompleteNotification);
                } else if ((this.bitField0_ & 4) == 0 || (scanCompleteNotification2 = this.accessPointScanCompleteNotification_) == null || scanCompleteNotification2 == ScanCompleteNotification.getDefaultInstance()) {
                    this.accessPointScanCompleteNotification_ = scanCompleteNotification;
                } else {
                    getAccessPointScanCompleteNotificationBuilder().mergeFrom(scanCompleteNotification);
                }
                if (this.accessPointScanCompleteNotification_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConnectToWifiNetworkNotification(ConnectToWifiNetworkNotification connectToWifiNetworkNotification) {
                ConnectToWifiNetworkNotification connectToWifiNetworkNotification2;
                SingleFieldBuilderV3<ConnectToWifiNetworkNotification, ConnectToWifiNetworkNotification.Builder, ConnectToWifiNetworkNotificationOrBuilder> singleFieldBuilderV3 = this.connectToWifiNetworkNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectToWifiNetworkNotification);
                } else if ((this.bitField0_ & 32) == 0 || (connectToWifiNetworkNotification2 = this.connectToWifiNetworkNotification_) == null || connectToWifiNetworkNotification2 == ConnectToWifiNetworkNotification.getDefaultInstance()) {
                    this.connectToWifiNetworkNotification_ = connectToWifiNetworkNotification;
                } else {
                    getConnectToWifiNetworkNotificationBuilder().mergeFrom(connectToWifiNetworkNotification);
                }
                if (this.connectToWifiNetworkNotification_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConnectToWifiNetworkRequest(ConnectToWifiNetworkRequest connectToWifiNetworkRequest) {
                ConnectToWifiNetworkRequest connectToWifiNetworkRequest2;
                SingleFieldBuilderV3<ConnectToWifiNetworkRequest, ConnectToWifiNetworkRequest.Builder, ConnectToWifiNetworkRequestOrBuilder> singleFieldBuilderV3 = this.connectToWifiNetworkRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectToWifiNetworkRequest);
                } else if ((this.bitField0_ & 8) == 0 || (connectToWifiNetworkRequest2 = this.connectToWifiNetworkRequest_) == null || connectToWifiNetworkRequest2 == ConnectToWifiNetworkRequest.getDefaultInstance()) {
                    this.connectToWifiNetworkRequest_ = connectToWifiNetworkRequest;
                } else {
                    getConnectToWifiNetworkRequestBuilder().mergeFrom(connectToWifiNetworkRequest);
                }
                if (this.connectToWifiNetworkRequest_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConnectToWifiNetworkResponse(ConnectToWifiNetworkResponse connectToWifiNetworkResponse) {
                ConnectToWifiNetworkResponse connectToWifiNetworkResponse2;
                SingleFieldBuilderV3<ConnectToWifiNetworkResponse, ConnectToWifiNetworkResponse.Builder, ConnectToWifiNetworkResponseOrBuilder> singleFieldBuilderV3 = this.connectToWifiNetworkResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectToWifiNetworkResponse);
                } else if ((this.bitField0_ & 16) == 0 || (connectToWifiNetworkResponse2 = this.connectToWifiNetworkResponse_) == null || connectToWifiNetworkResponse2 == ConnectToWifiNetworkResponse.getDefaultInstance()) {
                    this.connectToWifiNetworkResponse_ = connectToWifiNetworkResponse;
                } else {
                    getConnectToWifiNetworkResponseBuilder().mergeFrom(connectToWifiNetworkResponse);
                }
                if (this.connectToWifiNetworkResponse_ != null) {
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
                            switch (tag) {
                                case 0:
                                    break;
                                case 10:
                                    codedInputStream.readMessage(getScanWifiNetworksRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getScanWifiNetworksResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getAccessPointScanCompleteNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getConnectToWifiNetworkRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getConnectToWifiNetworkResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getConnectToWifiNetworkNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getSaveWifiNetworkRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getSaveWifiNetworkResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getRemoveWifiNetworkRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getRemoveWifiNetworkResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getStoredWifiNetworksRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 98:
                                    codedInputStream.readMessage(getStoredWifiNetworksResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 106:
                                    codedInputStream.readMessage(getMobileCarrierInfoRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 114:
                                    codedInputStream.readMessage(getMobileCarrierInfoResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8192;
                                    continue;
                                case 122:
                                    codedInputStream.readMessage(getSwitchToApRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16384;
                                    continue;
                                case 130:
                                    codedInputStream.readMessage(getSwitchToApResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32768;
                                    continue;
                                case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                                    codedInputStream.readMessage(getGetNetworkCredentialsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 65536;
                                    continue;
                                case 146:
                                    codedInputStream.readMessage(getGetNetworkCredentialsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 131072;
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

            public Builder mergeGetNetworkCredentialsRequest(DeviceAPCredentialsRequest deviceAPCredentialsRequest) {
                DeviceAPCredentialsRequest deviceAPCredentialsRequest2;
                SingleFieldBuilderV3<DeviceAPCredentialsRequest, DeviceAPCredentialsRequest.Builder, DeviceAPCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deviceAPCredentialsRequest);
                } else if ((this.bitField0_ & 65536) == 0 || (deviceAPCredentialsRequest2 = this.getNetworkCredentialsRequest_) == null || deviceAPCredentialsRequest2 == DeviceAPCredentialsRequest.getDefaultInstance()) {
                    this.getNetworkCredentialsRequest_ = deviceAPCredentialsRequest;
                } else {
                    getGetNetworkCredentialsRequestBuilder().mergeFrom(deviceAPCredentialsRequest);
                }
                if (this.getNetworkCredentialsRequest_ != null) {
                    this.bitField0_ |= 65536;
                    onChanged();
                }
                return this;
            }

            public Builder mergeGetNetworkCredentialsResponse(DeviceAPCredentialsResponse deviceAPCredentialsResponse) {
                DeviceAPCredentialsResponse deviceAPCredentialsResponse2;
                SingleFieldBuilderV3<DeviceAPCredentialsResponse, DeviceAPCredentialsResponse.Builder, DeviceAPCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deviceAPCredentialsResponse);
                } else if ((this.bitField0_ & 131072) == 0 || (deviceAPCredentialsResponse2 = this.getNetworkCredentialsResponse_) == null || deviceAPCredentialsResponse2 == DeviceAPCredentialsResponse.getDefaultInstance()) {
                    this.getNetworkCredentialsResponse_ = deviceAPCredentialsResponse;
                } else {
                    getGetNetworkCredentialsResponseBuilder().mergeFrom(deviceAPCredentialsResponse);
                }
                if (this.getNetworkCredentialsResponse_ != null) {
                    this.bitField0_ |= 131072;
                    onChanged();
                }
                return this;
            }

            public Builder mergeMobileCarrierInfoRequest(MobileCarrierInfoRequest mobileCarrierInfoRequest) {
                MobileCarrierInfoRequest mobileCarrierInfoRequest2;
                SingleFieldBuilderV3<MobileCarrierInfoRequest, MobileCarrierInfoRequest.Builder, MobileCarrierInfoRequestOrBuilder> singleFieldBuilderV3 = this.mobileCarrierInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(mobileCarrierInfoRequest);
                } else if ((this.bitField0_ & 4096) == 0 || (mobileCarrierInfoRequest2 = this.mobileCarrierInfoRequest_) == null || mobileCarrierInfoRequest2 == MobileCarrierInfoRequest.getDefaultInstance()) {
                    this.mobileCarrierInfoRequest_ = mobileCarrierInfoRequest;
                } else {
                    getMobileCarrierInfoRequestBuilder().mergeFrom(mobileCarrierInfoRequest);
                }
                if (this.mobileCarrierInfoRequest_ != null) {
                    this.bitField0_ |= 4096;
                    onChanged();
                }
                return this;
            }

            public Builder mergeMobileCarrierInfoResponse(MobileCarrierInfoResponse mobileCarrierInfoResponse) {
                MobileCarrierInfoResponse mobileCarrierInfoResponse2;
                SingleFieldBuilderV3<MobileCarrierInfoResponse, MobileCarrierInfoResponse.Builder, MobileCarrierInfoResponseOrBuilder> singleFieldBuilderV3 = this.mobileCarrierInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(mobileCarrierInfoResponse);
                } else if ((this.bitField0_ & 8192) == 0 || (mobileCarrierInfoResponse2 = this.mobileCarrierInfoResponse_) == null || mobileCarrierInfoResponse2 == MobileCarrierInfoResponse.getDefaultInstance()) {
                    this.mobileCarrierInfoResponse_ = mobileCarrierInfoResponse;
                } else {
                    getMobileCarrierInfoResponseBuilder().mergeFrom(mobileCarrierInfoResponse);
                }
                if (this.mobileCarrierInfoResponse_ != null) {
                    this.bitField0_ |= 8192;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRemoveWifiNetworkRequest(RemoveWifiNetworkRequest removeWifiNetworkRequest) {
                RemoveWifiNetworkRequest removeWifiNetworkRequest2;
                SingleFieldBuilderV3<RemoveWifiNetworkRequest, RemoveWifiNetworkRequest.Builder, RemoveWifiNetworkRequestOrBuilder> singleFieldBuilderV3 = this.removeWifiNetworkRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(removeWifiNetworkRequest);
                } else if ((this.bitField0_ & 256) == 0 || (removeWifiNetworkRequest2 = this.removeWifiNetworkRequest_) == null || removeWifiNetworkRequest2 == RemoveWifiNetworkRequest.getDefaultInstance()) {
                    this.removeWifiNetworkRequest_ = removeWifiNetworkRequest;
                } else {
                    getRemoveWifiNetworkRequestBuilder().mergeFrom(removeWifiNetworkRequest);
                }
                if (this.removeWifiNetworkRequest_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRemoveWifiNetworkResponse(RemoveWifiNetworkResponse removeWifiNetworkResponse) {
                RemoveWifiNetworkResponse removeWifiNetworkResponse2;
                SingleFieldBuilderV3<RemoveWifiNetworkResponse, RemoveWifiNetworkResponse.Builder, RemoveWifiNetworkResponseOrBuilder> singleFieldBuilderV3 = this.removeWifiNetworkResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(removeWifiNetworkResponse);
                } else if ((this.bitField0_ & 512) == 0 || (removeWifiNetworkResponse2 = this.removeWifiNetworkResponse_) == null || removeWifiNetworkResponse2 == RemoveWifiNetworkResponse.getDefaultInstance()) {
                    this.removeWifiNetworkResponse_ = removeWifiNetworkResponse;
                } else {
                    getRemoveWifiNetworkResponseBuilder().mergeFrom(removeWifiNetworkResponse);
                }
                if (this.removeWifiNetworkResponse_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSaveWifiNetworkRequest(SaveWifiNetworkRequest saveWifiNetworkRequest) {
                SaveWifiNetworkRequest saveWifiNetworkRequest2;
                SingleFieldBuilderV3<SaveWifiNetworkRequest, SaveWifiNetworkRequest.Builder, SaveWifiNetworkRequestOrBuilder> singleFieldBuilderV3 = this.saveWifiNetworkRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(saveWifiNetworkRequest);
                } else if ((this.bitField0_ & 64) == 0 || (saveWifiNetworkRequest2 = this.saveWifiNetworkRequest_) == null || saveWifiNetworkRequest2 == SaveWifiNetworkRequest.getDefaultInstance()) {
                    this.saveWifiNetworkRequest_ = saveWifiNetworkRequest;
                } else {
                    getSaveWifiNetworkRequestBuilder().mergeFrom(saveWifiNetworkRequest);
                }
                if (this.saveWifiNetworkRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSaveWifiNetworkResponse(SaveWifiNetworkResponse saveWifiNetworkResponse) {
                SaveWifiNetworkResponse saveWifiNetworkResponse2;
                SingleFieldBuilderV3<SaveWifiNetworkResponse, SaveWifiNetworkResponse.Builder, SaveWifiNetworkResponseOrBuilder> singleFieldBuilderV3 = this.saveWifiNetworkResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(saveWifiNetworkResponse);
                } else if ((this.bitField0_ & 128) == 0 || (saveWifiNetworkResponse2 = this.saveWifiNetworkResponse_) == null || saveWifiNetworkResponse2 == SaveWifiNetworkResponse.getDefaultInstance()) {
                    this.saveWifiNetworkResponse_ = saveWifiNetworkResponse;
                } else {
                    getSaveWifiNetworkResponseBuilder().mergeFrom(saveWifiNetworkResponse);
                }
                if (this.saveWifiNetworkResponse_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeScanWifiNetworksRequest(ScanWifiNetworksRequest scanWifiNetworksRequest) {
                ScanWifiNetworksRequest scanWifiNetworksRequest2;
                SingleFieldBuilderV3<ScanWifiNetworksRequest, ScanWifiNetworksRequest.Builder, ScanWifiNetworksRequestOrBuilder> singleFieldBuilderV3 = this.scanWifiNetworksRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(scanWifiNetworksRequest);
                } else if ((this.bitField0_ & 1) == 0 || (scanWifiNetworksRequest2 = this.scanWifiNetworksRequest_) == null || scanWifiNetworksRequest2 == ScanWifiNetworksRequest.getDefaultInstance()) {
                    this.scanWifiNetworksRequest_ = scanWifiNetworksRequest;
                } else {
                    getScanWifiNetworksRequestBuilder().mergeFrom(scanWifiNetworksRequest);
                }
                if (this.scanWifiNetworksRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeScanWifiNetworksResponse(ScanWifiNetworksResponse scanWifiNetworksResponse) {
                ScanWifiNetworksResponse scanWifiNetworksResponse2;
                SingleFieldBuilderV3<ScanWifiNetworksResponse, ScanWifiNetworksResponse.Builder, ScanWifiNetworksResponseOrBuilder> singleFieldBuilderV3 = this.scanWifiNetworksResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(scanWifiNetworksResponse);
                } else if ((this.bitField0_ & 2) == 0 || (scanWifiNetworksResponse2 = this.scanWifiNetworksResponse_) == null || scanWifiNetworksResponse2 == ScanWifiNetworksResponse.getDefaultInstance()) {
                    this.scanWifiNetworksResponse_ = scanWifiNetworksResponse;
                } else {
                    getScanWifiNetworksResponseBuilder().mergeFrom(scanWifiNetworksResponse);
                }
                if (this.scanWifiNetworksResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStoredWifiNetworksRequest(GetStoredWifiNetworksRequest getStoredWifiNetworksRequest) {
                GetStoredWifiNetworksRequest getStoredWifiNetworksRequest2;
                SingleFieldBuilderV3<GetStoredWifiNetworksRequest, GetStoredWifiNetworksRequest.Builder, GetStoredWifiNetworksRequestOrBuilder> singleFieldBuilderV3 = this.storedWifiNetworksRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getStoredWifiNetworksRequest);
                } else if ((this.bitField0_ & 1024) == 0 || (getStoredWifiNetworksRequest2 = this.storedWifiNetworksRequest_) == null || getStoredWifiNetworksRequest2 == GetStoredWifiNetworksRequest.getDefaultInstance()) {
                    this.storedWifiNetworksRequest_ = getStoredWifiNetworksRequest;
                } else {
                    getStoredWifiNetworksRequestBuilder().mergeFrom(getStoredWifiNetworksRequest);
                }
                if (this.storedWifiNetworksRequest_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStoredWifiNetworksResponse(GetStoredWifiNetworksResponse getStoredWifiNetworksResponse) {
                GetStoredWifiNetworksResponse getStoredWifiNetworksResponse2;
                SingleFieldBuilderV3<GetStoredWifiNetworksResponse, GetStoredWifiNetworksResponse.Builder, GetStoredWifiNetworksResponseOrBuilder> singleFieldBuilderV3 = this.storedWifiNetworksResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getStoredWifiNetworksResponse);
                } else if ((this.bitField0_ & 2048) == 0 || (getStoredWifiNetworksResponse2 = this.storedWifiNetworksResponse_) == null || getStoredWifiNetworksResponse2 == GetStoredWifiNetworksResponse.getDefaultInstance()) {
                    this.storedWifiNetworksResponse_ = getStoredWifiNetworksResponse;
                } else {
                    getStoredWifiNetworksResponseBuilder().mergeFrom(getStoredWifiNetworksResponse);
                }
                if (this.storedWifiNetworksResponse_ != null) {
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSwitchToApRequest(SwitchToApModeRequest switchToApModeRequest) {
                SwitchToApModeRequest switchToApModeRequest2;
                SingleFieldBuilderV3<SwitchToApModeRequest, SwitchToApModeRequest.Builder, SwitchToApModeRequestOrBuilder> singleFieldBuilderV3 = this.switchToApRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(switchToApModeRequest);
                } else if ((this.bitField0_ & 16384) == 0 || (switchToApModeRequest2 = this.switchToApRequest_) == null || switchToApModeRequest2 == SwitchToApModeRequest.getDefaultInstance()) {
                    this.switchToApRequest_ = switchToApModeRequest;
                } else {
                    getSwitchToApRequestBuilder().mergeFrom(switchToApModeRequest);
                }
                if (this.switchToApRequest_ != null) {
                    this.bitField0_ |= 16384;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSwitchToApResponse(SwitchToApModeResponse switchToApModeResponse) {
                SwitchToApModeResponse switchToApModeResponse2;
                SingleFieldBuilderV3<SwitchToApModeResponse, SwitchToApModeResponse.Builder, SwitchToApModeResponseOrBuilder> singleFieldBuilderV3 = this.switchToApResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(switchToApModeResponse);
                } else if ((this.bitField0_ & 32768) == 0 || (switchToApModeResponse2 = this.switchToApResponse_) == null || switchToApModeResponse2 == SwitchToApModeResponse.getDefaultInstance()) {
                    this.switchToApResponse_ = switchToApModeResponse;
                } else {
                    getSwitchToApResponseBuilder().mergeFrom(switchToApModeResponse);
                }
                if (this.switchToApResponse_ != null) {
                    this.bitField0_ |= 32768;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAccessPointScanCompleteNotification(ScanCompleteNotification.Builder builder) {
                SingleFieldBuilderV3<ScanCompleteNotification, ScanCompleteNotification.Builder, ScanCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.accessPointScanCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.accessPointScanCompleteNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConnectToWifiNetworkNotification(ConnectToWifiNetworkNotification.Builder builder) {
                SingleFieldBuilderV3<ConnectToWifiNetworkNotification, ConnectToWifiNetworkNotification.Builder, ConnectToWifiNetworkNotificationOrBuilder> singleFieldBuilderV3 = this.connectToWifiNetworkNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectToWifiNetworkNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setConnectToWifiNetworkRequest(ConnectToWifiNetworkRequest.Builder builder) {
                SingleFieldBuilderV3<ConnectToWifiNetworkRequest, ConnectToWifiNetworkRequest.Builder, ConnectToWifiNetworkRequestOrBuilder> singleFieldBuilderV3 = this.connectToWifiNetworkRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectToWifiNetworkRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setConnectToWifiNetworkResponse(ConnectToWifiNetworkResponse.Builder builder) {
                SingleFieldBuilderV3<ConnectToWifiNetworkResponse, ConnectToWifiNetworkResponse.Builder, ConnectToWifiNetworkResponseOrBuilder> singleFieldBuilderV3 = this.connectToWifiNetworkResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectToWifiNetworkResponse_ = builder.build();
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

            public Builder setGetNetworkCredentialsRequest(DeviceAPCredentialsRequest.Builder builder) {
                SingleFieldBuilderV3<DeviceAPCredentialsRequest, DeviceAPCredentialsRequest.Builder, DeviceAPCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.getNetworkCredentialsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setGetNetworkCredentialsResponse(DeviceAPCredentialsResponse.Builder builder) {
                SingleFieldBuilderV3<DeviceAPCredentialsResponse, DeviceAPCredentialsResponse.Builder, DeviceAPCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.getNetworkCredentialsResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setMobileCarrierInfoRequest(MobileCarrierInfoRequest.Builder builder) {
                SingleFieldBuilderV3<MobileCarrierInfoRequest, MobileCarrierInfoRequest.Builder, MobileCarrierInfoRequestOrBuilder> singleFieldBuilderV3 = this.mobileCarrierInfoRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.mobileCarrierInfoRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setMobileCarrierInfoResponse(MobileCarrierInfoResponse.Builder builder) {
                SingleFieldBuilderV3<MobileCarrierInfoResponse, MobileCarrierInfoResponse.Builder, MobileCarrierInfoResponseOrBuilder> singleFieldBuilderV3 = this.mobileCarrierInfoResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.mobileCarrierInfoResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setRemoveWifiNetworkRequest(RemoveWifiNetworkRequest.Builder builder) {
                SingleFieldBuilderV3<RemoveWifiNetworkRequest, RemoveWifiNetworkRequest.Builder, RemoveWifiNetworkRequestOrBuilder> singleFieldBuilderV3 = this.removeWifiNetworkRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.removeWifiNetworkRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setRemoveWifiNetworkResponse(RemoveWifiNetworkResponse.Builder builder) {
                SingleFieldBuilderV3<RemoveWifiNetworkResponse, RemoveWifiNetworkResponse.Builder, RemoveWifiNetworkResponseOrBuilder> singleFieldBuilderV3 = this.removeWifiNetworkResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.removeWifiNetworkResponse_ = builder.build();
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

            public Builder setSaveWifiNetworkRequest(SaveWifiNetworkRequest.Builder builder) {
                SingleFieldBuilderV3<SaveWifiNetworkRequest, SaveWifiNetworkRequest.Builder, SaveWifiNetworkRequestOrBuilder> singleFieldBuilderV3 = this.saveWifiNetworkRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.saveWifiNetworkRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setSaveWifiNetworkResponse(SaveWifiNetworkResponse.Builder builder) {
                SingleFieldBuilderV3<SaveWifiNetworkResponse, SaveWifiNetworkResponse.Builder, SaveWifiNetworkResponseOrBuilder> singleFieldBuilderV3 = this.saveWifiNetworkResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.saveWifiNetworkResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setScanWifiNetworksRequest(ScanWifiNetworksRequest.Builder builder) {
                SingleFieldBuilderV3<ScanWifiNetworksRequest, ScanWifiNetworksRequest.Builder, ScanWifiNetworksRequestOrBuilder> singleFieldBuilderV3 = this.scanWifiNetworksRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.scanWifiNetworksRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setScanWifiNetworksResponse(ScanWifiNetworksResponse.Builder builder) {
                SingleFieldBuilderV3<ScanWifiNetworksResponse, ScanWifiNetworksResponse.Builder, ScanWifiNetworksResponseOrBuilder> singleFieldBuilderV3 = this.scanWifiNetworksResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.scanWifiNetworksResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStoredWifiNetworksRequest(GetStoredWifiNetworksRequest.Builder builder) {
                SingleFieldBuilderV3<GetStoredWifiNetworksRequest, GetStoredWifiNetworksRequest.Builder, GetStoredWifiNetworksRequestOrBuilder> singleFieldBuilderV3 = this.storedWifiNetworksRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.storedWifiNetworksRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setStoredWifiNetworksResponse(GetStoredWifiNetworksResponse.Builder builder) {
                SingleFieldBuilderV3<GetStoredWifiNetworksResponse, GetStoredWifiNetworksResponse.Builder, GetStoredWifiNetworksResponseOrBuilder> singleFieldBuilderV3 = this.storedWifiNetworksResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.storedWifiNetworksResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setSwitchToApRequest(SwitchToApModeRequest.Builder builder) {
                SingleFieldBuilderV3<SwitchToApModeRequest, SwitchToApModeRequest.Builder, SwitchToApModeRequestOrBuilder> singleFieldBuilderV3 = this.switchToApRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.switchToApRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setSwitchToApResponse(SwitchToApModeResponse.Builder builder) {
                SingleFieldBuilderV3<SwitchToApModeResponse, SwitchToApModeResponse.Builder, SwitchToApModeResponseOrBuilder> singleFieldBuilderV3 = this.switchToApResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.switchToApResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WifiSetupUnifiedService getDefaultInstanceForType() {
                return WifiSetupUnifiedService.getDefaultInstance();
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

            public Builder setAccessPointScanCompleteNotification(ScanCompleteNotification scanCompleteNotification) {
                SingleFieldBuilderV3<ScanCompleteNotification, ScanCompleteNotification.Builder, ScanCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.accessPointScanCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    scanCompleteNotification.getClass();
                    this.accessPointScanCompleteNotification_ = scanCompleteNotification;
                } else {
                    singleFieldBuilderV3.setMessage(scanCompleteNotification);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConnectToWifiNetworkNotification(ConnectToWifiNetworkNotification connectToWifiNetworkNotification) {
                SingleFieldBuilderV3<ConnectToWifiNetworkNotification, ConnectToWifiNetworkNotification.Builder, ConnectToWifiNetworkNotificationOrBuilder> singleFieldBuilderV3 = this.connectToWifiNetworkNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectToWifiNetworkNotification.getClass();
                    this.connectToWifiNetworkNotification_ = connectToWifiNetworkNotification;
                } else {
                    singleFieldBuilderV3.setMessage(connectToWifiNetworkNotification);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setConnectToWifiNetworkRequest(ConnectToWifiNetworkRequest connectToWifiNetworkRequest) {
                SingleFieldBuilderV3<ConnectToWifiNetworkRequest, ConnectToWifiNetworkRequest.Builder, ConnectToWifiNetworkRequestOrBuilder> singleFieldBuilderV3 = this.connectToWifiNetworkRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectToWifiNetworkRequest.getClass();
                    this.connectToWifiNetworkRequest_ = connectToWifiNetworkRequest;
                } else {
                    singleFieldBuilderV3.setMessage(connectToWifiNetworkRequest);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setConnectToWifiNetworkResponse(ConnectToWifiNetworkResponse connectToWifiNetworkResponse) {
                SingleFieldBuilderV3<ConnectToWifiNetworkResponse, ConnectToWifiNetworkResponse.Builder, ConnectToWifiNetworkResponseOrBuilder> singleFieldBuilderV3 = this.connectToWifiNetworkResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectToWifiNetworkResponse.getClass();
                    this.connectToWifiNetworkResponse_ = connectToWifiNetworkResponse;
                } else {
                    singleFieldBuilderV3.setMessage(connectToWifiNetworkResponse);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setMobileCarrierInfoRequest(MobileCarrierInfoRequest mobileCarrierInfoRequest) {
                SingleFieldBuilderV3<MobileCarrierInfoRequest, MobileCarrierInfoRequest.Builder, MobileCarrierInfoRequestOrBuilder> singleFieldBuilderV3 = this.mobileCarrierInfoRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    mobileCarrierInfoRequest.getClass();
                    this.mobileCarrierInfoRequest_ = mobileCarrierInfoRequest;
                } else {
                    singleFieldBuilderV3.setMessage(mobileCarrierInfoRequest);
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setMobileCarrierInfoResponse(MobileCarrierInfoResponse mobileCarrierInfoResponse) {
                SingleFieldBuilderV3<MobileCarrierInfoResponse, MobileCarrierInfoResponse.Builder, MobileCarrierInfoResponseOrBuilder> singleFieldBuilderV3 = this.mobileCarrierInfoResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    mobileCarrierInfoResponse.getClass();
                    this.mobileCarrierInfoResponse_ = mobileCarrierInfoResponse;
                } else {
                    singleFieldBuilderV3.setMessage(mobileCarrierInfoResponse);
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setRemoveWifiNetworkRequest(RemoveWifiNetworkRequest removeWifiNetworkRequest) {
                SingleFieldBuilderV3<RemoveWifiNetworkRequest, RemoveWifiNetworkRequest.Builder, RemoveWifiNetworkRequestOrBuilder> singleFieldBuilderV3 = this.removeWifiNetworkRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    removeWifiNetworkRequest.getClass();
                    this.removeWifiNetworkRequest_ = removeWifiNetworkRequest;
                } else {
                    singleFieldBuilderV3.setMessage(removeWifiNetworkRequest);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setRemoveWifiNetworkResponse(RemoveWifiNetworkResponse removeWifiNetworkResponse) {
                SingleFieldBuilderV3<RemoveWifiNetworkResponse, RemoveWifiNetworkResponse.Builder, RemoveWifiNetworkResponseOrBuilder> singleFieldBuilderV3 = this.removeWifiNetworkResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    removeWifiNetworkResponse.getClass();
                    this.removeWifiNetworkResponse_ = removeWifiNetworkResponse;
                } else {
                    singleFieldBuilderV3.setMessage(removeWifiNetworkResponse);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setSaveWifiNetworkRequest(SaveWifiNetworkRequest saveWifiNetworkRequest) {
                SingleFieldBuilderV3<SaveWifiNetworkRequest, SaveWifiNetworkRequest.Builder, SaveWifiNetworkRequestOrBuilder> singleFieldBuilderV3 = this.saveWifiNetworkRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    saveWifiNetworkRequest.getClass();
                    this.saveWifiNetworkRequest_ = saveWifiNetworkRequest;
                } else {
                    singleFieldBuilderV3.setMessage(saveWifiNetworkRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setSaveWifiNetworkResponse(SaveWifiNetworkResponse saveWifiNetworkResponse) {
                SingleFieldBuilderV3<SaveWifiNetworkResponse, SaveWifiNetworkResponse.Builder, SaveWifiNetworkResponseOrBuilder> singleFieldBuilderV3 = this.saveWifiNetworkResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    saveWifiNetworkResponse.getClass();
                    this.saveWifiNetworkResponse_ = saveWifiNetworkResponse;
                } else {
                    singleFieldBuilderV3.setMessage(saveWifiNetworkResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setScanWifiNetworksRequest(ScanWifiNetworksRequest scanWifiNetworksRequest) {
                SingleFieldBuilderV3<ScanWifiNetworksRequest, ScanWifiNetworksRequest.Builder, ScanWifiNetworksRequestOrBuilder> singleFieldBuilderV3 = this.scanWifiNetworksRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    scanWifiNetworksRequest.getClass();
                    this.scanWifiNetworksRequest_ = scanWifiNetworksRequest;
                } else {
                    singleFieldBuilderV3.setMessage(scanWifiNetworksRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setScanWifiNetworksResponse(ScanWifiNetworksResponse scanWifiNetworksResponse) {
                SingleFieldBuilderV3<ScanWifiNetworksResponse, ScanWifiNetworksResponse.Builder, ScanWifiNetworksResponseOrBuilder> singleFieldBuilderV3 = this.scanWifiNetworksResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    scanWifiNetworksResponse.getClass();
                    this.scanWifiNetworksResponse_ = scanWifiNetworksResponse;
                } else {
                    singleFieldBuilderV3.setMessage(scanWifiNetworksResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStoredWifiNetworksRequest(GetStoredWifiNetworksRequest getStoredWifiNetworksRequest) {
                SingleFieldBuilderV3<GetStoredWifiNetworksRequest, GetStoredWifiNetworksRequest.Builder, GetStoredWifiNetworksRequestOrBuilder> singleFieldBuilderV3 = this.storedWifiNetworksRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getStoredWifiNetworksRequest.getClass();
                    this.storedWifiNetworksRequest_ = getStoredWifiNetworksRequest;
                } else {
                    singleFieldBuilderV3.setMessage(getStoredWifiNetworksRequest);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setStoredWifiNetworksResponse(GetStoredWifiNetworksResponse getStoredWifiNetworksResponse) {
                SingleFieldBuilderV3<GetStoredWifiNetworksResponse, GetStoredWifiNetworksResponse.Builder, GetStoredWifiNetworksResponseOrBuilder> singleFieldBuilderV3 = this.storedWifiNetworksResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getStoredWifiNetworksResponse.getClass();
                    this.storedWifiNetworksResponse_ = getStoredWifiNetworksResponse;
                } else {
                    singleFieldBuilderV3.setMessage(getStoredWifiNetworksResponse);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setSwitchToApRequest(SwitchToApModeRequest switchToApModeRequest) {
                SingleFieldBuilderV3<SwitchToApModeRequest, SwitchToApModeRequest.Builder, SwitchToApModeRequestOrBuilder> singleFieldBuilderV3 = this.switchToApRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    switchToApModeRequest.getClass();
                    this.switchToApRequest_ = switchToApModeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(switchToApModeRequest);
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setGetNetworkCredentialsRequest(DeviceAPCredentialsRequest deviceAPCredentialsRequest) {
                SingleFieldBuilderV3<DeviceAPCredentialsRequest, DeviceAPCredentialsRequest.Builder, DeviceAPCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deviceAPCredentialsRequest.getClass();
                    this.getNetworkCredentialsRequest_ = deviceAPCredentialsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(deviceAPCredentialsRequest);
                }
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setGetNetworkCredentialsResponse(DeviceAPCredentialsResponse deviceAPCredentialsResponse) {
                SingleFieldBuilderV3<DeviceAPCredentialsResponse, DeviceAPCredentialsResponse.Builder, DeviceAPCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deviceAPCredentialsResponse.getClass();
                    this.getNetworkCredentialsResponse_ = deviceAPCredentialsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(deviceAPCredentialsResponse);
                }
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setSwitchToApResponse(SwitchToApModeResponse switchToApModeResponse) {
                SingleFieldBuilderV3<SwitchToApModeResponse, SwitchToApModeResponse.Builder, SwitchToApModeResponseOrBuilder> singleFieldBuilderV3 = this.switchToApResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    switchToApModeResponse.getClass();
                    this.switchToApResponse_ = switchToApModeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(switchToApModeResponse);
                }
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WifiSetupUnifiedService) {
                    return mergeFrom((WifiSetupUnifiedService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WifiSetupUnifiedService wifiSetupUnifiedService) {
                if (wifiSetupUnifiedService == WifiSetupUnifiedService.getDefaultInstance()) {
                    return this;
                }
                if (wifiSetupUnifiedService.hasScanWifiNetworksRequest()) {
                    mergeScanWifiNetworksRequest(wifiSetupUnifiedService.getScanWifiNetworksRequest());
                }
                if (wifiSetupUnifiedService.hasScanWifiNetworksResponse()) {
                    mergeScanWifiNetworksResponse(wifiSetupUnifiedService.getScanWifiNetworksResponse());
                }
                if (wifiSetupUnifiedService.hasAccessPointScanCompleteNotification()) {
                    mergeAccessPointScanCompleteNotification(wifiSetupUnifiedService.getAccessPointScanCompleteNotification());
                }
                if (wifiSetupUnifiedService.hasConnectToWifiNetworkRequest()) {
                    mergeConnectToWifiNetworkRequest(wifiSetupUnifiedService.getConnectToWifiNetworkRequest());
                }
                if (wifiSetupUnifiedService.hasConnectToWifiNetworkResponse()) {
                    mergeConnectToWifiNetworkResponse(wifiSetupUnifiedService.getConnectToWifiNetworkResponse());
                }
                if (wifiSetupUnifiedService.hasConnectToWifiNetworkNotification()) {
                    mergeConnectToWifiNetworkNotification(wifiSetupUnifiedService.getConnectToWifiNetworkNotification());
                }
                if (wifiSetupUnifiedService.hasSaveWifiNetworkRequest()) {
                    mergeSaveWifiNetworkRequest(wifiSetupUnifiedService.getSaveWifiNetworkRequest());
                }
                if (wifiSetupUnifiedService.hasSaveWifiNetworkResponse()) {
                    mergeSaveWifiNetworkResponse(wifiSetupUnifiedService.getSaveWifiNetworkResponse());
                }
                if (wifiSetupUnifiedService.hasRemoveWifiNetworkRequest()) {
                    mergeRemoveWifiNetworkRequest(wifiSetupUnifiedService.getRemoveWifiNetworkRequest());
                }
                if (wifiSetupUnifiedService.hasRemoveWifiNetworkResponse()) {
                    mergeRemoveWifiNetworkResponse(wifiSetupUnifiedService.getRemoveWifiNetworkResponse());
                }
                if (wifiSetupUnifiedService.hasStoredWifiNetworksRequest()) {
                    mergeStoredWifiNetworksRequest(wifiSetupUnifiedService.getStoredWifiNetworksRequest());
                }
                if (wifiSetupUnifiedService.hasStoredWifiNetworksResponse()) {
                    mergeStoredWifiNetworksResponse(wifiSetupUnifiedService.getStoredWifiNetworksResponse());
                }
                if (wifiSetupUnifiedService.hasMobileCarrierInfoRequest()) {
                    mergeMobileCarrierInfoRequest(wifiSetupUnifiedService.getMobileCarrierInfoRequest());
                }
                if (wifiSetupUnifiedService.hasMobileCarrierInfoResponse()) {
                    mergeMobileCarrierInfoResponse(wifiSetupUnifiedService.getMobileCarrierInfoResponse());
                }
                if (wifiSetupUnifiedService.hasSwitchToApRequest()) {
                    mergeSwitchToApRequest(wifiSetupUnifiedService.getSwitchToApRequest());
                }
                if (wifiSetupUnifiedService.hasSwitchToApResponse()) {
                    mergeSwitchToApResponse(wifiSetupUnifiedService.getSwitchToApResponse());
                }
                if (wifiSetupUnifiedService.hasGetNetworkCredentialsRequest()) {
                    mergeGetNetworkCredentialsRequest(wifiSetupUnifiedService.getGetNetworkCredentialsRequest());
                }
                if (wifiSetupUnifiedService.hasGetNetworkCredentialsResponse()) {
                    mergeGetNetworkCredentialsResponse(wifiSetupUnifiedService.getGetNetworkCredentialsResponse());
                }
                mergeUnknownFields(wifiSetupUnifiedService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WifiSetupUnifiedService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ WifiSetupUnifiedService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private WifiSetupUnifiedService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WifiSetupUnifiedService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WifiSetupUnifiedService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WifiSetupUnifiedService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WifiSetupUnifiedService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WifiSetupUnifiedService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WifiSetupUnifiedService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WifiSetupUnifiedService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WifiSetupUnifiedService parseFrom(InputStream inputStream) {
            return (WifiSetupUnifiedService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static WifiSetupUnifiedService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WifiSetupUnifiedService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WifiSetupUnifiedService parseFrom(CodedInputStream codedInputStream) {
            return (WifiSetupUnifiedService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static WifiSetupUnifiedService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WifiSetupUnifiedService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public enum WifiMode implements ProtocolMessageEnum {
        WIFI_MODE_UNKNOWN(0),
        WIFI_MODE_STA(1),
        WIFI_MODE_AP(2);

        public static final int WIFI_MODE_AP_VALUE = 2;
        public static final int WIFI_MODE_STA_VALUE = 1;
        public static final int WIFI_MODE_UNKNOWN_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<WifiMode> internalValueMap = new Internal.EnumLiteMap<WifiMode>() { // from class: com.garmin.proto.generated.GDIWifiSetupUnified.WifiMode.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public WifiMode findValueByNumber(int i14) {
                return WifiMode.forNumber(i14);
            }
        };
        private static final WifiMode[] VALUES = values();

        WifiMode(int i14) {
            this.value = i14;
        }

        public static WifiMode forNumber(int i14) {
            if (i14 == 0) {
                return WIFI_MODE_UNKNOWN;
            }
            if (i14 == 1) {
                return WIFI_MODE_STA;
            }
            if (i14 != 2) {
                return null;
            }
            return WIFI_MODE_AP;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIWifiSetupUnified.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<WifiMode> internalGetValueMap() {
            return internalValueMap;
        }

        public static WifiMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static WifiMode valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
