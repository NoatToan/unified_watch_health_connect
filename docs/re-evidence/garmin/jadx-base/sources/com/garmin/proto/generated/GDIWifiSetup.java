package com.garmin.proto.generated;

import com.garmin.android.apps.connectmobile.f3;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public final class GDIWifiSetup {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0018GDIWifiSetupLegacy.proto\u0012\u0013GDI.Proto.WifiSetup\u001a\rGDICore.proto\"ù\u000f\n\u0010WifiSetupService\u0012N\n\u0019access_point_scan_request\u0018\u0001 \u0001(\u000b2+.GDI.Proto.WifiSetup.AccessPointScanRequest\u0012P\n\u001aaccess_point_scan_response\u0018\u0002 \u0001(\u000b2,.GDI.Proto.WifiSetup.AccessPointScanResponse\u0012Z\n\u001fstore_access_point_notification\u0018\u0003 \u0001(\u000b21.GDI.Proto.WifiSetup.StoreAccessPointNotification\u0012O\n\u0019verify_connection_request\u0018\u0004 \u0001(\u000b2,.GDI.Proto.WifiSetup.VerifyConnectionRequest\u0012Q\n\u001averify_connection_response\u0018\u0005 \u0001(\u000b2-.GDI.Proto.WifiSetup.VerifyConnectionResponse\u0012O\n\u0019oauth_credentials_request\u0018\u0006 \u0001(\u000b2,.GDI.Proto.WifiSetup.OAuthCredentialsRequest\u0012Q\n\u001aoauth_credentials_response\u0018\u0007 \u0001(\u000b2-.GDI.Proto.WifiSetup.OAuthCredentialsResponse\u0012K\n\u0014access_point_request\u0018\b \u0001(\u000b2-.GDI.Proto.WifiSetup.StoredAccessPointRequest\u0012M\n\u0015access_point_response\u0018\t \u0001(\u000b2..GDI.Proto.WifiSetup.StoredAccessPointResponse\u0012c\n$access_point_start_scan_notification\u0018\n \u0001(\u000b25.GDI.Proto.WifiSetup.AccessPointStartScanNotification\u0012i\n'access_point_scan_complete_notification\u0018\u000b \u0001(\u000b28.GDI.Proto.WifiSetup.AccessPointScanCompleteNotification\u0012Y\n\u001everify_connection_notification\u0018\f \u0001(\u000b21.GDI.Proto.WifiSetup.VerifyConnectionNotification\u0012r\n+connection_verification_status_notification\u0018\r \u0001(\u000b2=.GDI.Proto.WifiSetup.ConnectionVerificationStatusNotification\u0012R\n\u001bupdate_access_point_request\u0018\u000e \u0001(\u000b2-.GDI.Proto.WifiSetup.UpdateAccessPointRequest\u0012T\n\u001cupdate_access_point_response\u0018\u000f \u0001(\u000b2..GDI.Proto.WifiSetup.UpdateAccessPointResponse\u0012^\n(oauth_credentials_request_with_agent_msg\u0018\u0010 \u0001(\u000b2,.GDI.Proto.WifiSetup.OAuthCredentialsRequest\u0012`\n)oauth_credentials_response_with_agent_msg\u0018\u0011 \u0001(\u000b2-.GDI.Proto.WifiSetup.OAuthCredentialsResponse\u0012R\n\u001bmobile_carrier_info_request\u0018\u0012 \u0001(\u000b2-.GDI.Proto.WifiSetup.MobileCarrierInfoRequest\u0012T\n\u001cmobile_carrier_info_response\u0018\u0013 \u0001(\u000b2..GDI.Proto.WifiSetup.MobileCarrierInfoResponse\u0012H\n\u0014switch_to_ap_request\u0018\u0014 \u0001(\u000b2*.GDI.Proto.WifiSetup.SwitchToApModeRequest\u0012J\n\u0015switch_to_ap_response\u0018\u0015 \u0001(\u000b2+.GDI.Proto.WifiSetup.SwitchToApModeResponse\u0012Z\n\u001fget_network_credentials_request\u0018\u0016 \u0001(\u000b21.GDI.Proto.WifiSetup.GetNetworkCredentialsRequest\u0012\\\n get_network_credentials_response\u0018\u0017 \u0001(\u000b22.GDI.Proto.WifiSetup.GetNetworkCredentialsResponse\" \u0001\n\u0013CapabilitiesRequest\u0012\u0017\n\u000fservice_version\u0018\u0001 \u0001(\r2p\n\u0012wifi_setup_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018\u000f \u0001(\u000b2(.GDI.Proto.WifiSetup.CapabilitiesRequest\"\u008b\u0001\n\u0014CapabilitiesResponse2s\n\u0013wifi_setup_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018\u000f \u0001(\u000b2).GDI.Proto.WifiSetup.CapabilitiesResponse\"\u0018\n\u0016AccessPointScanRequest\":\n\u0017AccessPointScanResponse\u0012\u001f\n\u0017encrypted_wifi_protobuf\u0018\u0001 \u0002(\f\"\"\n AccessPointStartScanNotification\"F\n#AccessPointScanCompleteNotification\u0012\u001f\n\u0017encrypted_wifi_protobuf\u0018\u0001 \u0002(\f\"\u001a\n\u0018StoredAccessPointRequest\"<\n\u0019StoredAccessPointResponse\u0012\u001f\n\u0017encrypted_wifi_protobuf\u0018\u0001 \u0002(\f\"?\n\u001cStoreAccessPointNotification\u0012\u001f\n\u0017encrypted_wifi_protobuf\u0018\u0001 \u0002(\f\";\n\u0018UpdateAccessPointRequest\u0012\u001f\n\u0017encrypted_wifi_protobuf\u0018\u0001 \u0002(\f\"<\n\u0019UpdateAccessPointResponse\u0012\u001f\n\u0017encrypted_wifi_protobuf\u0018\u0001 \u0002(\f\"\u0019\n\u0017VerifyConnectionRequest\";\n\u0018VerifyConnectionResponse\u0012\u001f\n\u0017encrypted_wifi_protobuf\u0018\u0001 \u0002(\f\"?\n\u001cVerifyConnectionNotification\u0012\u001f\n\u0017encrypted_wifi_protobuf\u0018\u0001 \u0002(\f\"K\n(ConnectionVerificationStatusNotification\u0012\u001f\n\u0017encrypted_wifi_protobuf\u0018\u0001 \u0002(\f\"\u0019\n\u0017OAuthCredentialsRequest\";\n\u0018OAuthCredentialsResponse\u0012\u001f\n\u0017encrypted_wifi_protobuf\u0018\u0001 \u0002(\f\"\u001a\n\u0018MobileCarrierInfoRequest\"R\n\u0019MobileCarrierInfoResponse\u0012\u001b\n\u0013mobile_country_code\u0018\u0001 \u0003(\t\u0012\u0018\n\u0010iso_country_code\u0018\u0002 \u0003(\t\"N\n\u0015SwitchToApModeRequest\u00125\n\u000erequested_band\u0018\u0001 \u0001(\u000e2\u001d.GDI.Proto.WifiSetup.WifiBand\"¿\u0001\n\u0016SwitchToApModeResponse\u0012B\n\u0006status\u0018\u0001 \u0001(\u000e22.GDI.Proto.WifiSetup.SwitchToApModeResponse.Status\u00123\n\fband_enabled\u0018\u0002 \u0001(\u000e2\u001d.GDI.Proto.WifiSetup.WifiBand\",\n\u0006Status\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\b\n\u0004FAIL\u0010\u0001\u0012\u000b\n\u0007SUCCESS\u0010\u0002\"\u001e\n\u001cGetNetworkCredentialsRequest\"P\n\u001dGetNetworkCredentialsResponse\u0012\f\n\u0004ssid\u0018\u0001 \u0001(\t\u0012\u0010\n\bpassword\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007mac_adr\u0018\u0003 \u0001(\f*6\n\bWifiBand\u0012\u0013\n\u000fWIFI_BAND_5_GHZ\u0010\u0000\u0012\u0015\n\u0011WIFI_BAND_2P4_GHZ\u0010\u0001B,\n\u001acom.garmin.proto.generatedB\fGDIWifiSetupH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_AccessPointScanCompleteNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_AccessPointScanCompleteNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_AccessPointScanRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_AccessPointScanRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_AccessPointScanResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_AccessPointScanResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_AccessPointStartScanNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_AccessPointStartScanNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_ConnectionVerificationStatusNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_ConnectionVerificationStatusNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_GetNetworkCredentialsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_GetNetworkCredentialsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_GetNetworkCredentialsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_GetNetworkCredentialsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_MobileCarrierInfoRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_MobileCarrierInfoRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_MobileCarrierInfoResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_MobileCarrierInfoResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_OAuthCredentialsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_OAuthCredentialsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_OAuthCredentialsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_OAuthCredentialsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_StoreAccessPointNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_StoreAccessPointNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_StoredAccessPointRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_StoredAccessPointRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_StoredAccessPointResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_StoredAccessPointResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_SwitchToApModeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_SwitchToApModeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_SwitchToApModeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_SwitchToApModeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_UpdateAccessPointRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_UpdateAccessPointRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_UpdateAccessPointResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_UpdateAccessPointResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_VerifyConnectionNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_VerifyConnectionNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_VerifyConnectionRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_VerifyConnectionRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_VerifyConnectionResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_VerifyConnectionResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_WifiSetup_WifiSetupService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_WifiSetup_WifiSetupService_fieldAccessorTable;

    public interface AccessPointScanCompleteNotificationOrBuilder extends MessageOrBuilder {
        ByteString getEncryptedWifiProtobuf();

        boolean hasEncryptedWifiProtobuf();
    }

    public interface AccessPointScanRequestOrBuilder extends MessageOrBuilder {
    }

    public interface AccessPointScanResponseOrBuilder extends MessageOrBuilder {
        ByteString getEncryptedWifiProtobuf();

        boolean hasEncryptedWifiProtobuf();
    }

    public interface AccessPointStartScanNotificationOrBuilder extends MessageOrBuilder {
    }

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
        int getServiceVersion();

        boolean hasServiceVersion();
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
    }

    public interface ConnectionVerificationStatusNotificationOrBuilder extends MessageOrBuilder {
        ByteString getEncryptedWifiProtobuf();

        boolean hasEncryptedWifiProtobuf();
    }

    public interface GetNetworkCredentialsRequestOrBuilder extends MessageOrBuilder {
    }

    public interface GetNetworkCredentialsResponseOrBuilder extends MessageOrBuilder {
        ByteString getMacAdr();

        String getPassword();

        ByteString getPasswordBytes();

        String getSsid();

        ByteString getSsidBytes();

        boolean hasMacAdr();

        boolean hasPassword();

        boolean hasSsid();
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

    public interface OAuthCredentialsRequestOrBuilder extends MessageOrBuilder {
    }

    public interface OAuthCredentialsResponseOrBuilder extends MessageOrBuilder {
        ByteString getEncryptedWifiProtobuf();

        boolean hasEncryptedWifiProtobuf();
    }

    public interface StoreAccessPointNotificationOrBuilder extends MessageOrBuilder {
        ByteString getEncryptedWifiProtobuf();

        boolean hasEncryptedWifiProtobuf();
    }

    public interface StoredAccessPointRequestOrBuilder extends MessageOrBuilder {
    }

    public interface StoredAccessPointResponseOrBuilder extends MessageOrBuilder {
        ByteString getEncryptedWifiProtobuf();

        boolean hasEncryptedWifiProtobuf();
    }

    public interface SwitchToApModeRequestOrBuilder extends MessageOrBuilder {
        WifiBand getRequestedBand();

        boolean hasRequestedBand();
    }

    public interface SwitchToApModeResponseOrBuilder extends MessageOrBuilder {
        WifiBand getBandEnabled();

        SwitchToApModeResponse.Status getStatus();

        boolean hasBandEnabled();

        boolean hasStatus();
    }

    public interface UpdateAccessPointRequestOrBuilder extends MessageOrBuilder {
        ByteString getEncryptedWifiProtobuf();

        boolean hasEncryptedWifiProtobuf();
    }

    public interface UpdateAccessPointResponseOrBuilder extends MessageOrBuilder {
        ByteString getEncryptedWifiProtobuf();

        boolean hasEncryptedWifiProtobuf();
    }

    public interface VerifyConnectionNotificationOrBuilder extends MessageOrBuilder {
        ByteString getEncryptedWifiProtobuf();

        boolean hasEncryptedWifiProtobuf();
    }

    public interface VerifyConnectionRequestOrBuilder extends MessageOrBuilder {
    }

    public interface VerifyConnectionResponseOrBuilder extends MessageOrBuilder {
        ByteString getEncryptedWifiProtobuf();

        boolean hasEncryptedWifiProtobuf();
    }

    public interface WifiSetupServiceOrBuilder extends MessageOrBuilder {
        StoredAccessPointRequest getAccessPointRequest();

        StoredAccessPointRequestOrBuilder getAccessPointRequestOrBuilder();

        StoredAccessPointResponse getAccessPointResponse();

        StoredAccessPointResponseOrBuilder getAccessPointResponseOrBuilder();

        AccessPointScanCompleteNotification getAccessPointScanCompleteNotification();

        AccessPointScanCompleteNotificationOrBuilder getAccessPointScanCompleteNotificationOrBuilder();

        AccessPointScanRequest getAccessPointScanRequest();

        AccessPointScanRequestOrBuilder getAccessPointScanRequestOrBuilder();

        AccessPointScanResponse getAccessPointScanResponse();

        AccessPointScanResponseOrBuilder getAccessPointScanResponseOrBuilder();

        AccessPointStartScanNotification getAccessPointStartScanNotification();

        AccessPointStartScanNotificationOrBuilder getAccessPointStartScanNotificationOrBuilder();

        ConnectionVerificationStatusNotification getConnectionVerificationStatusNotification();

        ConnectionVerificationStatusNotificationOrBuilder getConnectionVerificationStatusNotificationOrBuilder();

        GetNetworkCredentialsRequest getGetNetworkCredentialsRequest();

        GetNetworkCredentialsRequestOrBuilder getGetNetworkCredentialsRequestOrBuilder();

        GetNetworkCredentialsResponse getGetNetworkCredentialsResponse();

        GetNetworkCredentialsResponseOrBuilder getGetNetworkCredentialsResponseOrBuilder();

        MobileCarrierInfoRequest getMobileCarrierInfoRequest();

        MobileCarrierInfoRequestOrBuilder getMobileCarrierInfoRequestOrBuilder();

        MobileCarrierInfoResponse getMobileCarrierInfoResponse();

        MobileCarrierInfoResponseOrBuilder getMobileCarrierInfoResponseOrBuilder();

        OAuthCredentialsRequest getOauthCredentialsRequest();

        OAuthCredentialsRequestOrBuilder getOauthCredentialsRequestOrBuilder();

        OAuthCredentialsRequest getOauthCredentialsRequestWithAgentMsg();

        OAuthCredentialsRequestOrBuilder getOauthCredentialsRequestWithAgentMsgOrBuilder();

        OAuthCredentialsResponse getOauthCredentialsResponse();

        OAuthCredentialsResponseOrBuilder getOauthCredentialsResponseOrBuilder();

        OAuthCredentialsResponse getOauthCredentialsResponseWithAgentMsg();

        OAuthCredentialsResponseOrBuilder getOauthCredentialsResponseWithAgentMsgOrBuilder();

        StoreAccessPointNotification getStoreAccessPointNotification();

        StoreAccessPointNotificationOrBuilder getStoreAccessPointNotificationOrBuilder();

        SwitchToApModeRequest getSwitchToApRequest();

        SwitchToApModeRequestOrBuilder getSwitchToApRequestOrBuilder();

        SwitchToApModeResponse getSwitchToApResponse();

        SwitchToApModeResponseOrBuilder getSwitchToApResponseOrBuilder();

        UpdateAccessPointRequest getUpdateAccessPointRequest();

        UpdateAccessPointRequestOrBuilder getUpdateAccessPointRequestOrBuilder();

        UpdateAccessPointResponse getUpdateAccessPointResponse();

        UpdateAccessPointResponseOrBuilder getUpdateAccessPointResponseOrBuilder();

        VerifyConnectionNotification getVerifyConnectionNotification();

        VerifyConnectionNotificationOrBuilder getVerifyConnectionNotificationOrBuilder();

        VerifyConnectionRequest getVerifyConnectionRequest();

        VerifyConnectionRequestOrBuilder getVerifyConnectionRequestOrBuilder();

        VerifyConnectionResponse getVerifyConnectionResponse();

        VerifyConnectionResponseOrBuilder getVerifyConnectionResponseOrBuilder();

        boolean hasAccessPointRequest();

        boolean hasAccessPointResponse();

        boolean hasAccessPointScanCompleteNotification();

        boolean hasAccessPointScanRequest();

        boolean hasAccessPointScanResponse();

        boolean hasAccessPointStartScanNotification();

        boolean hasConnectionVerificationStatusNotification();

        boolean hasGetNetworkCredentialsRequest();

        boolean hasGetNetworkCredentialsResponse();

        boolean hasMobileCarrierInfoRequest();

        boolean hasMobileCarrierInfoResponse();

        boolean hasOauthCredentialsRequest();

        boolean hasOauthCredentialsRequestWithAgentMsg();

        boolean hasOauthCredentialsResponse();

        boolean hasOauthCredentialsResponseWithAgentMsg();

        boolean hasStoreAccessPointNotification();

        boolean hasSwitchToApRequest();

        boolean hasSwitchToApResponse();

        boolean hasUpdateAccessPointRequest();

        boolean hasUpdateAccessPointResponse();

        boolean hasVerifyConnectionNotification();

        boolean hasVerifyConnectionRequest();

        boolean hasVerifyConnectionResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = (Descriptors.Descriptor) a.q(0);
        internal_static_GDI_Proto_WifiSetup_WifiSetupService_descriptor = descriptor2;
        internal_static_GDI_Proto_WifiSetup_WifiSetupService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"AccessPointScanRequest", "AccessPointScanResponse", "StoreAccessPointNotification", "VerifyConnectionRequest", "VerifyConnectionResponse", "OauthCredentialsRequest", "OauthCredentialsResponse", "AccessPointRequest", "AccessPointResponse", "AccessPointStartScanNotification", "AccessPointScanCompleteNotification", "VerifyConnectionNotification", "ConnectionVerificationStatusNotification", "UpdateAccessPointRequest", "UpdateAccessPointResponse", "OauthCredentialsRequestWithAgentMsg", "OauthCredentialsResponseWithAgentMsg", "MobileCarrierInfoRequest", "MobileCarrierInfoResponse", "SwitchToApRequest", "SwitchToApResponse", "GetNetworkCredentialsRequest", "GetNetworkCredentialsResponse"});
        Descriptors.Descriptor descriptor3 = (Descriptors.Descriptor) a.q(1);
        internal_static_GDI_Proto_WifiSetup_CapabilitiesRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_WifiSetup_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"ServiceVersion"});
        Descriptors.Descriptor descriptor4 = (Descriptors.Descriptor) a.q(2);
        internal_static_GDI_Proto_WifiSetup_CapabilitiesResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_WifiSetup_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[0]);
        Descriptors.Descriptor descriptor5 = (Descriptors.Descriptor) a.q(3);
        internal_static_GDI_Proto_WifiSetup_AccessPointScanRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_WifiSetup_AccessPointScanRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[0]);
        Descriptors.Descriptor descriptor6 = (Descriptors.Descriptor) a.q(4);
        internal_static_GDI_Proto_WifiSetup_AccessPointScanResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_WifiSetup_AccessPointScanResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"EncryptedWifiProtobuf"});
        Descriptors.Descriptor descriptor7 = (Descriptors.Descriptor) a.q(5);
        internal_static_GDI_Proto_WifiSetup_AccessPointStartScanNotification_descriptor = descriptor7;
        internal_static_GDI_Proto_WifiSetup_AccessPointStartScanNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[0]);
        Descriptors.Descriptor descriptor8 = (Descriptors.Descriptor) a.q(6);
        internal_static_GDI_Proto_WifiSetup_AccessPointScanCompleteNotification_descriptor = descriptor8;
        internal_static_GDI_Proto_WifiSetup_AccessPointScanCompleteNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"EncryptedWifiProtobuf"});
        Descriptors.Descriptor descriptor9 = (Descriptors.Descriptor) a.q(7);
        internal_static_GDI_Proto_WifiSetup_StoredAccessPointRequest_descriptor = descriptor9;
        internal_static_GDI_Proto_WifiSetup_StoredAccessPointRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[0]);
        Descriptors.Descriptor descriptor10 = (Descriptors.Descriptor) a.q(8);
        internal_static_GDI_Proto_WifiSetup_StoredAccessPointResponse_descriptor = descriptor10;
        internal_static_GDI_Proto_WifiSetup_StoredAccessPointResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"EncryptedWifiProtobuf"});
        Descriptors.Descriptor descriptor11 = (Descriptors.Descriptor) a.q(9);
        internal_static_GDI_Proto_WifiSetup_StoreAccessPointNotification_descriptor = descriptor11;
        internal_static_GDI_Proto_WifiSetup_StoreAccessPointNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"EncryptedWifiProtobuf"});
        Descriptors.Descriptor descriptor12 = (Descriptors.Descriptor) a.q(10);
        internal_static_GDI_Proto_WifiSetup_UpdateAccessPointRequest_descriptor = descriptor12;
        internal_static_GDI_Proto_WifiSetup_UpdateAccessPointRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"EncryptedWifiProtobuf"});
        Descriptors.Descriptor descriptor13 = (Descriptors.Descriptor) a.q(11);
        internal_static_GDI_Proto_WifiSetup_UpdateAccessPointResponse_descriptor = descriptor13;
        internal_static_GDI_Proto_WifiSetup_UpdateAccessPointResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"EncryptedWifiProtobuf"});
        Descriptors.Descriptor descriptor14 = (Descriptors.Descriptor) a.q(12);
        internal_static_GDI_Proto_WifiSetup_VerifyConnectionRequest_descriptor = descriptor14;
        internal_static_GDI_Proto_WifiSetup_VerifyConnectionRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[0]);
        Descriptors.Descriptor descriptor15 = (Descriptors.Descriptor) a.q(13);
        internal_static_GDI_Proto_WifiSetup_VerifyConnectionResponse_descriptor = descriptor15;
        internal_static_GDI_Proto_WifiSetup_VerifyConnectionResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"EncryptedWifiProtobuf"});
        Descriptors.Descriptor descriptor16 = (Descriptors.Descriptor) a.q(14);
        internal_static_GDI_Proto_WifiSetup_VerifyConnectionNotification_descriptor = descriptor16;
        internal_static_GDI_Proto_WifiSetup_VerifyConnectionNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"EncryptedWifiProtobuf"});
        Descriptors.Descriptor descriptor17 = (Descriptors.Descriptor) a.q(15);
        internal_static_GDI_Proto_WifiSetup_ConnectionVerificationStatusNotification_descriptor = descriptor17;
        internal_static_GDI_Proto_WifiSetup_ConnectionVerificationStatusNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"EncryptedWifiProtobuf"});
        Descriptors.Descriptor descriptor18 = (Descriptors.Descriptor) a.q(16);
        internal_static_GDI_Proto_WifiSetup_OAuthCredentialsRequest_descriptor = descriptor18;
        internal_static_GDI_Proto_WifiSetup_OAuthCredentialsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[0]);
        Descriptors.Descriptor descriptor19 = (Descriptors.Descriptor) a.q(17);
        internal_static_GDI_Proto_WifiSetup_OAuthCredentialsResponse_descriptor = descriptor19;
        internal_static_GDI_Proto_WifiSetup_OAuthCredentialsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"EncryptedWifiProtobuf"});
        Descriptors.Descriptor descriptor20 = (Descriptors.Descriptor) a.q(18);
        internal_static_GDI_Proto_WifiSetup_MobileCarrierInfoRequest_descriptor = descriptor20;
        internal_static_GDI_Proto_WifiSetup_MobileCarrierInfoRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[0]);
        Descriptors.Descriptor descriptor21 = (Descriptors.Descriptor) a.q(19);
        internal_static_GDI_Proto_WifiSetup_MobileCarrierInfoResponse_descriptor = descriptor21;
        internal_static_GDI_Proto_WifiSetup_MobileCarrierInfoResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor21, new String[]{"MobileCountryCode", "IsoCountryCode"});
        Descriptors.Descriptor descriptor22 = (Descriptors.Descriptor) a.q(20);
        internal_static_GDI_Proto_WifiSetup_SwitchToApModeRequest_descriptor = descriptor22;
        internal_static_GDI_Proto_WifiSetup_SwitchToApModeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor22, new String[]{"RequestedBand"});
        Descriptors.Descriptor descriptor23 = (Descriptors.Descriptor) a.q(21);
        internal_static_GDI_Proto_WifiSetup_SwitchToApModeResponse_descriptor = descriptor23;
        internal_static_GDI_Proto_WifiSetup_SwitchToApModeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor23, new String[]{"Status", "BandEnabled"});
        Descriptors.Descriptor descriptor24 = (Descriptors.Descriptor) a.q(22);
        internal_static_GDI_Proto_WifiSetup_GetNetworkCredentialsRequest_descriptor = descriptor24;
        internal_static_GDI_Proto_WifiSetup_GetNetworkCredentialsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor24, new String[0]);
        Descriptors.Descriptor descriptor25 = (Descriptors.Descriptor) a.q(23);
        internal_static_GDI_Proto_WifiSetup_GetNetworkCredentialsResponse_descriptor = descriptor25;
        internal_static_GDI_Proto_WifiSetup_GetNetworkCredentialsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor25, new String[]{"Ssid", "Password", "MacAdr"});
        GDICore.getDescriptor();
    }

    private GDIWifiSetup() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.wifiSetupRequest);
        extensionRegistryLite.add(CapabilitiesResponse.wifiSetupResponse);
    }

    public static final class AccessPointScanRequest extends GeneratedMessageV3 implements AccessPointScanRequestOrBuilder {
        private static final AccessPointScanRequest DEFAULT_INSTANCE = new AccessPointScanRequest();

        @Deprecated
        public static final Parser<AccessPointScanRequest> PARSER = new AbstractParser<AccessPointScanRequest>() { // from class: com.garmin.proto.generated.GDIWifiSetup.AccessPointScanRequest.1
            @Override // com.google.protobuf.Parser
            public AccessPointScanRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AccessPointScanRequest.newBuilder();
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

        private AccessPointScanRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AccessPointScanRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_AccessPointScanRequest_descriptor;
        }

        public static Builder newBuilder(AccessPointScanRequest accessPointScanRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(accessPointScanRequest);
        }

        public static AccessPointScanRequest parseDelimitedFrom(InputStream inputStream) {
            return (AccessPointScanRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AccessPointScanRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AccessPointScanRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof AccessPointScanRequest) {
                return getUnknownFields().equals(((AccessPointScanRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AccessPointScanRequest> getParserForType() {
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
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_AccessPointScanRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AccessPointScanRequest.class, Builder.class);
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
            return new AccessPointScanRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AccessPointScanRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_AccessPointScanRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AccessPointScanRequest build() {
                AccessPointScanRequest accessPointScanRequestBuildPartial = buildPartial();
                if (accessPointScanRequestBuildPartial.isInitialized()) {
                    return accessPointScanRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) accessPointScanRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AccessPointScanRequest buildPartial() {
                AccessPointScanRequest accessPointScanRequest = new AccessPointScanRequest(this);
                onBuilt();
                return accessPointScanRequest;
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_AccessPointScanRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_AccessPointScanRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AccessPointScanRequest.class, Builder.class);
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
            public AccessPointScanRequest getDefaultInstanceForType() {
                return AccessPointScanRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AccessPointScanRequest) {
                    return mergeFrom((AccessPointScanRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AccessPointScanRequest accessPointScanRequest) {
                if (accessPointScanRequest == AccessPointScanRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(accessPointScanRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AccessPointScanRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ AccessPointScanRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private AccessPointScanRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AccessPointScanRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessPointScanRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AccessPointScanRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AccessPointScanRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AccessPointScanRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AccessPointScanRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AccessPointScanRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AccessPointScanRequest parseFrom(InputStream inputStream) {
            return (AccessPointScanRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AccessPointScanRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessPointScanRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AccessPointScanRequest parseFrom(CodedInputStream codedInputStream) {
            return (AccessPointScanRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AccessPointScanRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessPointScanRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AccessPointStartScanNotification extends GeneratedMessageV3 implements AccessPointStartScanNotificationOrBuilder {
        private static final AccessPointStartScanNotification DEFAULT_INSTANCE = new AccessPointStartScanNotification();

        @Deprecated
        public static final Parser<AccessPointStartScanNotification> PARSER = new AbstractParser<AccessPointStartScanNotification>() { // from class: com.garmin.proto.generated.GDIWifiSetup.AccessPointStartScanNotification.1
            @Override // com.google.protobuf.Parser
            public AccessPointStartScanNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AccessPointStartScanNotification.newBuilder();
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

        private AccessPointStartScanNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AccessPointStartScanNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_AccessPointStartScanNotification_descriptor;
        }

        public static Builder newBuilder(AccessPointStartScanNotification accessPointStartScanNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(accessPointStartScanNotification);
        }

        public static AccessPointStartScanNotification parseDelimitedFrom(InputStream inputStream) {
            return (AccessPointStartScanNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AccessPointStartScanNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AccessPointStartScanNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof AccessPointStartScanNotification) {
                return getUnknownFields().equals(((AccessPointStartScanNotification) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AccessPointStartScanNotification> getParserForType() {
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
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_AccessPointStartScanNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AccessPointStartScanNotification.class, Builder.class);
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
            return new AccessPointStartScanNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AccessPointStartScanNotificationOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_AccessPointStartScanNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AccessPointStartScanNotification build() {
                AccessPointStartScanNotification accessPointStartScanNotificationBuildPartial = buildPartial();
                if (accessPointStartScanNotificationBuildPartial.isInitialized()) {
                    return accessPointStartScanNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) accessPointStartScanNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AccessPointStartScanNotification buildPartial() {
                AccessPointStartScanNotification accessPointStartScanNotification = new AccessPointStartScanNotification(this);
                onBuilt();
                return accessPointStartScanNotification;
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_AccessPointStartScanNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_AccessPointStartScanNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AccessPointStartScanNotification.class, Builder.class);
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
            public AccessPointStartScanNotification getDefaultInstanceForType() {
                return AccessPointStartScanNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AccessPointStartScanNotification) {
                    return mergeFrom((AccessPointStartScanNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AccessPointStartScanNotification accessPointStartScanNotification) {
                if (accessPointStartScanNotification == AccessPointStartScanNotification.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(accessPointStartScanNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AccessPointStartScanNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ AccessPointStartScanNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private AccessPointStartScanNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AccessPointStartScanNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessPointStartScanNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AccessPointStartScanNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AccessPointStartScanNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AccessPointStartScanNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AccessPointStartScanNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AccessPointStartScanNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AccessPointStartScanNotification parseFrom(InputStream inputStream) {
            return (AccessPointStartScanNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AccessPointStartScanNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessPointStartScanNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AccessPointStartScanNotification parseFrom(CodedInputStream codedInputStream) {
            return (AccessPointStartScanNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AccessPointStartScanNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessPointStartScanNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int SERVICE_VERSION_FIELD_NUMBER = 1;
        public static final int WIFI_SETUP_REQUEST_FIELD_NUMBER = 15;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int serviceVersion_;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIWifiSetup.CapabilitiesRequest.1
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, CapabilitiesRequest> wifiSetupRequest = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesRequest.class, getDefaultInstance());

        private CapabilitiesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.serviceVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_CapabilitiesRequest_descriptor;
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

        @Override // com.garmin.proto.generated.GDIWifiSetup.CapabilitiesRequestOrBuilder
        public int getServiceVersion() {
            return this.serviceVersion_;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.CapabilitiesRequestOrBuilder
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
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_CapabilitiesRequest_descriptor;
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_CapabilitiesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.CapabilitiesRequestOrBuilder
            public int getServiceVersion() {
                return this.serviceVersion_;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.CapabilitiesRequestOrBuilder
            public boolean hasServiceVersion() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
        public static final int WIFI_SETUP_RESPONSE_FIELD_NUMBER = 15;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIWifiSetup.CapabilitiesResponse.1
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, CapabilitiesResponse> wifiSetupResponse = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesResponse.class, getDefaultInstance());

        private CapabilitiesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_CapabilitiesResponse_descriptor;
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
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_CapabilitiesResponse_descriptor;
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_CapabilitiesResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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

    public static final class GetNetworkCredentialsRequest extends GeneratedMessageV3 implements GetNetworkCredentialsRequestOrBuilder {
        private static final GetNetworkCredentialsRequest DEFAULT_INSTANCE = new GetNetworkCredentialsRequest();

        @Deprecated
        public static final Parser<GetNetworkCredentialsRequest> PARSER = new AbstractParser<GetNetworkCredentialsRequest>() { // from class: com.garmin.proto.generated.GDIWifiSetup.GetNetworkCredentialsRequest.1
            @Override // com.google.protobuf.Parser
            public GetNetworkCredentialsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetNetworkCredentialsRequest.newBuilder();
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

        private GetNetworkCredentialsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetNetworkCredentialsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_GetNetworkCredentialsRequest_descriptor;
        }

        public static Builder newBuilder(GetNetworkCredentialsRequest getNetworkCredentialsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getNetworkCredentialsRequest);
        }

        public static GetNetworkCredentialsRequest parseDelimitedFrom(InputStream inputStream) {
            return (GetNetworkCredentialsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetNetworkCredentialsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetNetworkCredentialsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof GetNetworkCredentialsRequest) {
                return getUnknownFields().equals(((GetNetworkCredentialsRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetNetworkCredentialsRequest> getParserForType() {
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
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_GetNetworkCredentialsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetNetworkCredentialsRequest.class, Builder.class);
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
            return new GetNetworkCredentialsRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetNetworkCredentialsRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_GetNetworkCredentialsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetNetworkCredentialsRequest build() {
                GetNetworkCredentialsRequest getNetworkCredentialsRequestBuildPartial = buildPartial();
                if (getNetworkCredentialsRequestBuildPartial.isInitialized()) {
                    return getNetworkCredentialsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getNetworkCredentialsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetNetworkCredentialsRequest buildPartial() {
                GetNetworkCredentialsRequest getNetworkCredentialsRequest = new GetNetworkCredentialsRequest(this);
                onBuilt();
                return getNetworkCredentialsRequest;
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_GetNetworkCredentialsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_GetNetworkCredentialsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetNetworkCredentialsRequest.class, Builder.class);
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
            public GetNetworkCredentialsRequest getDefaultInstanceForType() {
                return GetNetworkCredentialsRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetNetworkCredentialsRequest) {
                    return mergeFrom((GetNetworkCredentialsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GetNetworkCredentialsRequest getNetworkCredentialsRequest) {
                if (getNetworkCredentialsRequest == GetNetworkCredentialsRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(getNetworkCredentialsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetNetworkCredentialsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ GetNetworkCredentialsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private GetNetworkCredentialsRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetNetworkCredentialsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetNetworkCredentialsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetNetworkCredentialsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetNetworkCredentialsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetNetworkCredentialsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetNetworkCredentialsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetNetworkCredentialsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetNetworkCredentialsRequest parseFrom(InputStream inputStream) {
            return (GetNetworkCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetNetworkCredentialsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetNetworkCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetNetworkCredentialsRequest parseFrom(CodedInputStream codedInputStream) {
            return (GetNetworkCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetNetworkCredentialsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetNetworkCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class MobileCarrierInfoRequest extends GeneratedMessageV3 implements MobileCarrierInfoRequestOrBuilder {
        private static final MobileCarrierInfoRequest DEFAULT_INSTANCE = new MobileCarrierInfoRequest();

        @Deprecated
        public static final Parser<MobileCarrierInfoRequest> PARSER = new AbstractParser<MobileCarrierInfoRequest>() { // from class: com.garmin.proto.generated.GDIWifiSetup.MobileCarrierInfoRequest.1
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
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_MobileCarrierInfoRequest_descriptor;
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
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_MobileCarrierInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(MobileCarrierInfoRequest.class, Builder.class);
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_MobileCarrierInfoRequest_descriptor;
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_MobileCarrierInfoRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_MobileCarrierInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(MobileCarrierInfoRequest.class, Builder.class);
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

    public static final class OAuthCredentialsRequest extends GeneratedMessageV3 implements OAuthCredentialsRequestOrBuilder {
        private static final OAuthCredentialsRequest DEFAULT_INSTANCE = new OAuthCredentialsRequest();

        @Deprecated
        public static final Parser<OAuthCredentialsRequest> PARSER = new AbstractParser<OAuthCredentialsRequest>() { // from class: com.garmin.proto.generated.GDIWifiSetup.OAuthCredentialsRequest.1
            @Override // com.google.protobuf.Parser
            public OAuthCredentialsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = OAuthCredentialsRequest.newBuilder();
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

        private OAuthCredentialsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static OAuthCredentialsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_OAuthCredentialsRequest_descriptor;
        }

        public static Builder newBuilder(OAuthCredentialsRequest oAuthCredentialsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(oAuthCredentialsRequest);
        }

        public static OAuthCredentialsRequest parseDelimitedFrom(InputStream inputStream) {
            return (OAuthCredentialsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static OAuthCredentialsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<OAuthCredentialsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof OAuthCredentialsRequest) {
                return getUnknownFields().equals(((OAuthCredentialsRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<OAuthCredentialsRequest> getParserForType() {
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
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_OAuthCredentialsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(OAuthCredentialsRequest.class, Builder.class);
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
            return new OAuthCredentialsRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OAuthCredentialsRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_OAuthCredentialsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OAuthCredentialsRequest build() {
                OAuthCredentialsRequest oAuthCredentialsRequestBuildPartial = buildPartial();
                if (oAuthCredentialsRequestBuildPartial.isInitialized()) {
                    return oAuthCredentialsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) oAuthCredentialsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OAuthCredentialsRequest buildPartial() {
                OAuthCredentialsRequest oAuthCredentialsRequest = new OAuthCredentialsRequest(this);
                onBuilt();
                return oAuthCredentialsRequest;
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_OAuthCredentialsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_OAuthCredentialsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(OAuthCredentialsRequest.class, Builder.class);
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
            public OAuthCredentialsRequest getDefaultInstanceForType() {
                return OAuthCredentialsRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof OAuthCredentialsRequest) {
                    return mergeFrom((OAuthCredentialsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(OAuthCredentialsRequest oAuthCredentialsRequest) {
                if (oAuthCredentialsRequest == OAuthCredentialsRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(oAuthCredentialsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public OAuthCredentialsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ OAuthCredentialsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private OAuthCredentialsRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static OAuthCredentialsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthCredentialsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OAuthCredentialsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static OAuthCredentialsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OAuthCredentialsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static OAuthCredentialsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static OAuthCredentialsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static OAuthCredentialsRequest parseFrom(InputStream inputStream) {
            return (OAuthCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static OAuthCredentialsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OAuthCredentialsRequest parseFrom(CodedInputStream codedInputStream) {
            return (OAuthCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static OAuthCredentialsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StoredAccessPointRequest extends GeneratedMessageV3 implements StoredAccessPointRequestOrBuilder {
        private static final StoredAccessPointRequest DEFAULT_INSTANCE = new StoredAccessPointRequest();

        @Deprecated
        public static final Parser<StoredAccessPointRequest> PARSER = new AbstractParser<StoredAccessPointRequest>() { // from class: com.garmin.proto.generated.GDIWifiSetup.StoredAccessPointRequest.1
            @Override // com.google.protobuf.Parser
            public StoredAccessPointRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StoredAccessPointRequest.newBuilder();
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

        private StoredAccessPointRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StoredAccessPointRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_StoredAccessPointRequest_descriptor;
        }

        public static Builder newBuilder(StoredAccessPointRequest storedAccessPointRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(storedAccessPointRequest);
        }

        public static StoredAccessPointRequest parseDelimitedFrom(InputStream inputStream) {
            return (StoredAccessPointRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StoredAccessPointRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StoredAccessPointRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof StoredAccessPointRequest) {
                return getUnknownFields().equals(((StoredAccessPointRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StoredAccessPointRequest> getParserForType() {
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
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_StoredAccessPointRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StoredAccessPointRequest.class, Builder.class);
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
            return new StoredAccessPointRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StoredAccessPointRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_StoredAccessPointRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StoredAccessPointRequest build() {
                StoredAccessPointRequest storedAccessPointRequestBuildPartial = buildPartial();
                if (storedAccessPointRequestBuildPartial.isInitialized()) {
                    return storedAccessPointRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) storedAccessPointRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StoredAccessPointRequest buildPartial() {
                StoredAccessPointRequest storedAccessPointRequest = new StoredAccessPointRequest(this);
                onBuilt();
                return storedAccessPointRequest;
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_StoredAccessPointRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_StoredAccessPointRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StoredAccessPointRequest.class, Builder.class);
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
            public StoredAccessPointRequest getDefaultInstanceForType() {
                return StoredAccessPointRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StoredAccessPointRequest) {
                    return mergeFrom((StoredAccessPointRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StoredAccessPointRequest storedAccessPointRequest) {
                if (storedAccessPointRequest == StoredAccessPointRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(storedAccessPointRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StoredAccessPointRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ StoredAccessPointRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private StoredAccessPointRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StoredAccessPointRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StoredAccessPointRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StoredAccessPointRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StoredAccessPointRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StoredAccessPointRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StoredAccessPointRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StoredAccessPointRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StoredAccessPointRequest parseFrom(InputStream inputStream) {
            return (StoredAccessPointRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StoredAccessPointRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StoredAccessPointRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StoredAccessPointRequest parseFrom(CodedInputStream codedInputStream) {
            return (StoredAccessPointRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StoredAccessPointRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StoredAccessPointRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class VerifyConnectionRequest extends GeneratedMessageV3 implements VerifyConnectionRequestOrBuilder {
        private static final VerifyConnectionRequest DEFAULT_INSTANCE = new VerifyConnectionRequest();

        @Deprecated
        public static final Parser<VerifyConnectionRequest> PARSER = new AbstractParser<VerifyConnectionRequest>() { // from class: com.garmin.proto.generated.GDIWifiSetup.VerifyConnectionRequest.1
            @Override // com.google.protobuf.Parser
            public VerifyConnectionRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = VerifyConnectionRequest.newBuilder();
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

        private VerifyConnectionRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VerifyConnectionRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_VerifyConnectionRequest_descriptor;
        }

        public static Builder newBuilder(VerifyConnectionRequest verifyConnectionRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(verifyConnectionRequest);
        }

        public static VerifyConnectionRequest parseDelimitedFrom(InputStream inputStream) {
            return (VerifyConnectionRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VerifyConnectionRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<VerifyConnectionRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof VerifyConnectionRequest) {
                return getUnknownFields().equals(((VerifyConnectionRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<VerifyConnectionRequest> getParserForType() {
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
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_VerifyConnectionRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(VerifyConnectionRequest.class, Builder.class);
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
            return new VerifyConnectionRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VerifyConnectionRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_VerifyConnectionRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VerifyConnectionRequest build() {
                VerifyConnectionRequest verifyConnectionRequestBuildPartial = buildPartial();
                if (verifyConnectionRequestBuildPartial.isInitialized()) {
                    return verifyConnectionRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) verifyConnectionRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VerifyConnectionRequest buildPartial() {
                VerifyConnectionRequest verifyConnectionRequest = new VerifyConnectionRequest(this);
                onBuilt();
                return verifyConnectionRequest;
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_VerifyConnectionRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_VerifyConnectionRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(VerifyConnectionRequest.class, Builder.class);
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
            public VerifyConnectionRequest getDefaultInstanceForType() {
                return VerifyConnectionRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof VerifyConnectionRequest) {
                    return mergeFrom((VerifyConnectionRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(VerifyConnectionRequest verifyConnectionRequest) {
                if (verifyConnectionRequest == VerifyConnectionRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(verifyConnectionRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public VerifyConnectionRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ VerifyConnectionRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private VerifyConnectionRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VerifyConnectionRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VerifyConnectionRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VerifyConnectionRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static VerifyConnectionRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VerifyConnectionRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static VerifyConnectionRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static VerifyConnectionRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static VerifyConnectionRequest parseFrom(InputStream inputStream) {
            return (VerifyConnectionRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static VerifyConnectionRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VerifyConnectionRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VerifyConnectionRequest parseFrom(CodedInputStream codedInputStream) {
            return (VerifyConnectionRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static VerifyConnectionRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VerifyConnectionRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AccessPointScanCompleteNotification extends GeneratedMessageV3 implements AccessPointScanCompleteNotificationOrBuilder {
        public static final int ENCRYPTED_WIFI_PROTOBUF_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString encryptedWifiProtobuf_;
        private byte memoizedIsInitialized;
        private static final AccessPointScanCompleteNotification DEFAULT_INSTANCE = new AccessPointScanCompleteNotification();

        @Deprecated
        public static final Parser<AccessPointScanCompleteNotification> PARSER = new AbstractParser<AccessPointScanCompleteNotification>() { // from class: com.garmin.proto.generated.GDIWifiSetup.AccessPointScanCompleteNotification.1
            @Override // com.google.protobuf.Parser
            public AccessPointScanCompleteNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AccessPointScanCompleteNotification.newBuilder();
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

        private AccessPointScanCompleteNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AccessPointScanCompleteNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_AccessPointScanCompleteNotification_descriptor;
        }

        public static Builder newBuilder(AccessPointScanCompleteNotification accessPointScanCompleteNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(accessPointScanCompleteNotification);
        }

        public static AccessPointScanCompleteNotification parseDelimitedFrom(InputStream inputStream) {
            return (AccessPointScanCompleteNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AccessPointScanCompleteNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AccessPointScanCompleteNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AccessPointScanCompleteNotification)) {
                return super.equals(obj);
            }
            AccessPointScanCompleteNotification accessPointScanCompleteNotification = (AccessPointScanCompleteNotification) obj;
            if (hasEncryptedWifiProtobuf() != accessPointScanCompleteNotification.hasEncryptedWifiProtobuf()) {
                return false;
            }
            return (!hasEncryptedWifiProtobuf() || getEncryptedWifiProtobuf().equals(accessPointScanCompleteNotification.getEncryptedWifiProtobuf())) && getUnknownFields().equals(accessPointScanCompleteNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.AccessPointScanCompleteNotificationOrBuilder
        public ByteString getEncryptedWifiProtobuf() {
            return this.encryptedWifiProtobuf_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AccessPointScanCompleteNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.encryptedWifiProtobuf_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.AccessPointScanCompleteNotificationOrBuilder
        public boolean hasEncryptedWifiProtobuf() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEncryptedWifiProtobuf()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getEncryptedWifiProtobuf().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_AccessPointScanCompleteNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AccessPointScanCompleteNotification.class, Builder.class);
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
            if (hasEncryptedWifiProtobuf()) {
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
            return new AccessPointScanCompleteNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.encryptedWifiProtobuf_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AccessPointScanCompleteNotificationOrBuilder {
            private int bitField0_;
            private ByteString encryptedWifiProtobuf_;

            private Builder() {
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            }

            private void buildPartial0(AccessPointScanCompleteNotification accessPointScanCompleteNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    accessPointScanCompleteNotification.encryptedWifiProtobuf_ = this.encryptedWifiProtobuf_;
                } else {
                    i14 = 0;
                }
                accessPointScanCompleteNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_AccessPointScanCompleteNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AccessPointScanCompleteNotification build() {
                AccessPointScanCompleteNotification accessPointScanCompleteNotificationBuildPartial = buildPartial();
                if (accessPointScanCompleteNotificationBuildPartial.isInitialized()) {
                    return accessPointScanCompleteNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) accessPointScanCompleteNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AccessPointScanCompleteNotification buildPartial() {
                AccessPointScanCompleteNotification accessPointScanCompleteNotification = new AccessPointScanCompleteNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(accessPointScanCompleteNotification);
                }
                onBuilt();
                return accessPointScanCompleteNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearEncryptedWifiProtobuf() {
                this.bitField0_ &= -2;
                this.encryptedWifiProtobuf_ = AccessPointScanCompleteNotification.getDefaultInstance().getEncryptedWifiProtobuf();
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_AccessPointScanCompleteNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.AccessPointScanCompleteNotificationOrBuilder
            public ByteString getEncryptedWifiProtobuf() {
                return this.encryptedWifiProtobuf_;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.AccessPointScanCompleteNotificationOrBuilder
            public boolean hasEncryptedWifiProtobuf() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_AccessPointScanCompleteNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AccessPointScanCompleteNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasEncryptedWifiProtobuf();
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
                                    this.encryptedWifiProtobuf_ = codedInputStream.readBytes();
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

            public Builder setEncryptedWifiProtobuf(ByteString byteString) {
                byteString.getClass();
                this.encryptedWifiProtobuf_ = byteString;
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
            public AccessPointScanCompleteNotification getDefaultInstanceForType() {
                return AccessPointScanCompleteNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AccessPointScanCompleteNotification) {
                    return mergeFrom((AccessPointScanCompleteNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AccessPointScanCompleteNotification accessPointScanCompleteNotification) {
                if (accessPointScanCompleteNotification == AccessPointScanCompleteNotification.getDefaultInstance()) {
                    return this;
                }
                if (accessPointScanCompleteNotification.hasEncryptedWifiProtobuf()) {
                    setEncryptedWifiProtobuf(accessPointScanCompleteNotification.getEncryptedWifiProtobuf());
                }
                mergeUnknownFields(accessPointScanCompleteNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AccessPointScanCompleteNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AccessPointScanCompleteNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessPointScanCompleteNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AccessPointScanCompleteNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AccessPointScanCompleteNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ AccessPointScanCompleteNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AccessPointScanCompleteNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private AccessPointScanCompleteNotification() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.encryptedWifiProtobuf_ = byteString;
        }

        public static AccessPointScanCompleteNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AccessPointScanCompleteNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AccessPointScanCompleteNotification parseFrom(InputStream inputStream) {
            return (AccessPointScanCompleteNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AccessPointScanCompleteNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessPointScanCompleteNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AccessPointScanCompleteNotification parseFrom(CodedInputStream codedInputStream) {
            return (AccessPointScanCompleteNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AccessPointScanCompleteNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessPointScanCompleteNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AccessPointScanResponse extends GeneratedMessageV3 implements AccessPointScanResponseOrBuilder {
        public static final int ENCRYPTED_WIFI_PROTOBUF_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString encryptedWifiProtobuf_;
        private byte memoizedIsInitialized;
        private static final AccessPointScanResponse DEFAULT_INSTANCE = new AccessPointScanResponse();

        @Deprecated
        public static final Parser<AccessPointScanResponse> PARSER = new AbstractParser<AccessPointScanResponse>() { // from class: com.garmin.proto.generated.GDIWifiSetup.AccessPointScanResponse.1
            @Override // com.google.protobuf.Parser
            public AccessPointScanResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AccessPointScanResponse.newBuilder();
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

        private AccessPointScanResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AccessPointScanResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_AccessPointScanResponse_descriptor;
        }

        public static Builder newBuilder(AccessPointScanResponse accessPointScanResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(accessPointScanResponse);
        }

        public static AccessPointScanResponse parseDelimitedFrom(InputStream inputStream) {
            return (AccessPointScanResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AccessPointScanResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AccessPointScanResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AccessPointScanResponse)) {
                return super.equals(obj);
            }
            AccessPointScanResponse accessPointScanResponse = (AccessPointScanResponse) obj;
            if (hasEncryptedWifiProtobuf() != accessPointScanResponse.hasEncryptedWifiProtobuf()) {
                return false;
            }
            return (!hasEncryptedWifiProtobuf() || getEncryptedWifiProtobuf().equals(accessPointScanResponse.getEncryptedWifiProtobuf())) && getUnknownFields().equals(accessPointScanResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.AccessPointScanResponseOrBuilder
        public ByteString getEncryptedWifiProtobuf() {
            return this.encryptedWifiProtobuf_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AccessPointScanResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.encryptedWifiProtobuf_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.AccessPointScanResponseOrBuilder
        public boolean hasEncryptedWifiProtobuf() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEncryptedWifiProtobuf()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getEncryptedWifiProtobuf().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_AccessPointScanResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AccessPointScanResponse.class, Builder.class);
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
            if (hasEncryptedWifiProtobuf()) {
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
            return new AccessPointScanResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.encryptedWifiProtobuf_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AccessPointScanResponseOrBuilder {
            private int bitField0_;
            private ByteString encryptedWifiProtobuf_;

            private Builder() {
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            }

            private void buildPartial0(AccessPointScanResponse accessPointScanResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    accessPointScanResponse.encryptedWifiProtobuf_ = this.encryptedWifiProtobuf_;
                } else {
                    i14 = 0;
                }
                accessPointScanResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_AccessPointScanResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AccessPointScanResponse build() {
                AccessPointScanResponse accessPointScanResponseBuildPartial = buildPartial();
                if (accessPointScanResponseBuildPartial.isInitialized()) {
                    return accessPointScanResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) accessPointScanResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AccessPointScanResponse buildPartial() {
                AccessPointScanResponse accessPointScanResponse = new AccessPointScanResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(accessPointScanResponse);
                }
                onBuilt();
                return accessPointScanResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearEncryptedWifiProtobuf() {
                this.bitField0_ &= -2;
                this.encryptedWifiProtobuf_ = AccessPointScanResponse.getDefaultInstance().getEncryptedWifiProtobuf();
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_AccessPointScanResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.AccessPointScanResponseOrBuilder
            public ByteString getEncryptedWifiProtobuf() {
                return this.encryptedWifiProtobuf_;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.AccessPointScanResponseOrBuilder
            public boolean hasEncryptedWifiProtobuf() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_AccessPointScanResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AccessPointScanResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasEncryptedWifiProtobuf();
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
                                    this.encryptedWifiProtobuf_ = codedInputStream.readBytes();
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

            public Builder setEncryptedWifiProtobuf(ByteString byteString) {
                byteString.getClass();
                this.encryptedWifiProtobuf_ = byteString;
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
            public AccessPointScanResponse getDefaultInstanceForType() {
                return AccessPointScanResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AccessPointScanResponse) {
                    return mergeFrom((AccessPointScanResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AccessPointScanResponse accessPointScanResponse) {
                if (accessPointScanResponse == AccessPointScanResponse.getDefaultInstance()) {
                    return this;
                }
                if (accessPointScanResponse.hasEncryptedWifiProtobuf()) {
                    setEncryptedWifiProtobuf(accessPointScanResponse.getEncryptedWifiProtobuf());
                }
                mergeUnknownFields(accessPointScanResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AccessPointScanResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AccessPointScanResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessPointScanResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AccessPointScanResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AccessPointScanResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ AccessPointScanResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AccessPointScanResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private AccessPointScanResponse() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.encryptedWifiProtobuf_ = byteString;
        }

        public static AccessPointScanResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AccessPointScanResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AccessPointScanResponse parseFrom(InputStream inputStream) {
            return (AccessPointScanResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AccessPointScanResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessPointScanResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AccessPointScanResponse parseFrom(CodedInputStream codedInputStream) {
            return (AccessPointScanResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AccessPointScanResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AccessPointScanResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConnectionVerificationStatusNotification extends GeneratedMessageV3 implements ConnectionVerificationStatusNotificationOrBuilder {
        public static final int ENCRYPTED_WIFI_PROTOBUF_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString encryptedWifiProtobuf_;
        private byte memoizedIsInitialized;
        private static final ConnectionVerificationStatusNotification DEFAULT_INSTANCE = new ConnectionVerificationStatusNotification();

        @Deprecated
        public static final Parser<ConnectionVerificationStatusNotification> PARSER = new AbstractParser<ConnectionVerificationStatusNotification>() { // from class: com.garmin.proto.generated.GDIWifiSetup.ConnectionVerificationStatusNotification.1
            @Override // com.google.protobuf.Parser
            public ConnectionVerificationStatusNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectionVerificationStatusNotification.newBuilder();
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

        private ConnectionVerificationStatusNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectionVerificationStatusNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_ConnectionVerificationStatusNotification_descriptor;
        }

        public static Builder newBuilder(ConnectionVerificationStatusNotification connectionVerificationStatusNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectionVerificationStatusNotification);
        }

        public static ConnectionVerificationStatusNotification parseDelimitedFrom(InputStream inputStream) {
            return (ConnectionVerificationStatusNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectionVerificationStatusNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectionVerificationStatusNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectionVerificationStatusNotification)) {
                return super.equals(obj);
            }
            ConnectionVerificationStatusNotification connectionVerificationStatusNotification = (ConnectionVerificationStatusNotification) obj;
            if (hasEncryptedWifiProtobuf() != connectionVerificationStatusNotification.hasEncryptedWifiProtobuf()) {
                return false;
            }
            return (!hasEncryptedWifiProtobuf() || getEncryptedWifiProtobuf().equals(connectionVerificationStatusNotification.getEncryptedWifiProtobuf())) && getUnknownFields().equals(connectionVerificationStatusNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.ConnectionVerificationStatusNotificationOrBuilder
        public ByteString getEncryptedWifiProtobuf() {
            return this.encryptedWifiProtobuf_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectionVerificationStatusNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.encryptedWifiProtobuf_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.ConnectionVerificationStatusNotificationOrBuilder
        public boolean hasEncryptedWifiProtobuf() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEncryptedWifiProtobuf()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getEncryptedWifiProtobuf().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_ConnectionVerificationStatusNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectionVerificationStatusNotification.class, Builder.class);
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
            if (hasEncryptedWifiProtobuf()) {
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
            return new ConnectionVerificationStatusNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.encryptedWifiProtobuf_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectionVerificationStatusNotificationOrBuilder {
            private int bitField0_;
            private ByteString encryptedWifiProtobuf_;

            private Builder() {
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            }

            private void buildPartial0(ConnectionVerificationStatusNotification connectionVerificationStatusNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    connectionVerificationStatusNotification.encryptedWifiProtobuf_ = this.encryptedWifiProtobuf_;
                } else {
                    i14 = 0;
                }
                connectionVerificationStatusNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_ConnectionVerificationStatusNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectionVerificationStatusNotification build() {
                ConnectionVerificationStatusNotification connectionVerificationStatusNotificationBuildPartial = buildPartial();
                if (connectionVerificationStatusNotificationBuildPartial.isInitialized()) {
                    return connectionVerificationStatusNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectionVerificationStatusNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectionVerificationStatusNotification buildPartial() {
                ConnectionVerificationStatusNotification connectionVerificationStatusNotification = new ConnectionVerificationStatusNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectionVerificationStatusNotification);
                }
                onBuilt();
                return connectionVerificationStatusNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearEncryptedWifiProtobuf() {
                this.bitField0_ &= -2;
                this.encryptedWifiProtobuf_ = ConnectionVerificationStatusNotification.getDefaultInstance().getEncryptedWifiProtobuf();
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_ConnectionVerificationStatusNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.ConnectionVerificationStatusNotificationOrBuilder
            public ByteString getEncryptedWifiProtobuf() {
                return this.encryptedWifiProtobuf_;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.ConnectionVerificationStatusNotificationOrBuilder
            public boolean hasEncryptedWifiProtobuf() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_ConnectionVerificationStatusNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectionVerificationStatusNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasEncryptedWifiProtobuf();
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
                                    this.encryptedWifiProtobuf_ = codedInputStream.readBytes();
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

            public Builder setEncryptedWifiProtobuf(ByteString byteString) {
                byteString.getClass();
                this.encryptedWifiProtobuf_ = byteString;
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
            public ConnectionVerificationStatusNotification getDefaultInstanceForType() {
                return ConnectionVerificationStatusNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectionVerificationStatusNotification) {
                    return mergeFrom((ConnectionVerificationStatusNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectionVerificationStatusNotification connectionVerificationStatusNotification) {
                if (connectionVerificationStatusNotification == ConnectionVerificationStatusNotification.getDefaultInstance()) {
                    return this;
                }
                if (connectionVerificationStatusNotification.hasEncryptedWifiProtobuf()) {
                    setEncryptedWifiProtobuf(connectionVerificationStatusNotification.getEncryptedWifiProtobuf());
                }
                mergeUnknownFields(connectionVerificationStatusNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectionVerificationStatusNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConnectionVerificationStatusNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectionVerificationStatusNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectionVerificationStatusNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectionVerificationStatusNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ ConnectionVerificationStatusNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectionVerificationStatusNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private ConnectionVerificationStatusNotification() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.encryptedWifiProtobuf_ = byteString;
        }

        public static ConnectionVerificationStatusNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectionVerificationStatusNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectionVerificationStatusNotification parseFrom(InputStream inputStream) {
            return (ConnectionVerificationStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectionVerificationStatusNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectionVerificationStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectionVerificationStatusNotification parseFrom(CodedInputStream codedInputStream) {
            return (ConnectionVerificationStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectionVerificationStatusNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectionVerificationStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetNetworkCredentialsResponse extends GeneratedMessageV3 implements GetNetworkCredentialsResponseOrBuilder {
        public static final int MAC_ADR_FIELD_NUMBER = 3;
        public static final int PASSWORD_FIELD_NUMBER = 2;
        public static final int SSID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString macAdr_;
        private byte memoizedIsInitialized;
        private volatile Object password_;
        private volatile Object ssid_;
        private static final GetNetworkCredentialsResponse DEFAULT_INSTANCE = new GetNetworkCredentialsResponse();

        @Deprecated
        public static final Parser<GetNetworkCredentialsResponse> PARSER = new AbstractParser<GetNetworkCredentialsResponse>() { // from class: com.garmin.proto.generated.GDIWifiSetup.GetNetworkCredentialsResponse.1
            @Override // com.google.protobuf.Parser
            public GetNetworkCredentialsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetNetworkCredentialsResponse.newBuilder();
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

        private GetNetworkCredentialsResponse() {
            this.ssid_ = "";
            this.password_ = "";
            ByteString byteString = ByteString.EMPTY;
            this.macAdr_ = byteString;
            this.memoizedIsInitialized = (byte) -1;
            this.ssid_ = "";
            this.password_ = "";
            this.macAdr_ = byteString;
        }

        public static GetNetworkCredentialsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_GetNetworkCredentialsResponse_descriptor;
        }

        public static Builder newBuilder(GetNetworkCredentialsResponse getNetworkCredentialsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getNetworkCredentialsResponse);
        }

        public static GetNetworkCredentialsResponse parseDelimitedFrom(InputStream inputStream) {
            return (GetNetworkCredentialsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetNetworkCredentialsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetNetworkCredentialsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetNetworkCredentialsResponse)) {
                return super.equals(obj);
            }
            GetNetworkCredentialsResponse getNetworkCredentialsResponse = (GetNetworkCredentialsResponse) obj;
            if (hasSsid() != getNetworkCredentialsResponse.hasSsid()) {
                return false;
            }
            if ((hasSsid() && !getSsid().equals(getNetworkCredentialsResponse.getSsid())) || hasPassword() != getNetworkCredentialsResponse.hasPassword()) {
                return false;
            }
            if ((!hasPassword() || getPassword().equals(getNetworkCredentialsResponse.getPassword())) && hasMacAdr() == getNetworkCredentialsResponse.hasMacAdr()) {
                return (!hasMacAdr() || getMacAdr().equals(getNetworkCredentialsResponse.getMacAdr())) && getUnknownFields().equals(getNetworkCredentialsResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.GetNetworkCredentialsResponseOrBuilder
        public ByteString getMacAdr() {
            return this.macAdr_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetNetworkCredentialsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.GetNetworkCredentialsResponseOrBuilder
        public String getPassword() {
            Object obj = this.password_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.password_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.GetNetworkCredentialsResponseOrBuilder
        public ByteString getPasswordBytes() {
            Object obj = this.password_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.password_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.ssid_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.password_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(3, this.macAdr_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.GetNetworkCredentialsResponseOrBuilder
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

        @Override // com.garmin.proto.generated.GDIWifiSetup.GetNetworkCredentialsResponseOrBuilder
        public ByteString getSsidBytes() {
            Object obj = this.ssid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ssid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.GetNetworkCredentialsResponseOrBuilder
        public boolean hasMacAdr() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.GetNetworkCredentialsResponseOrBuilder
        public boolean hasPassword() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.GetNetworkCredentialsResponseOrBuilder
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
            if (hasPassword()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getPassword().hashCode();
            }
            if (hasMacAdr()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getMacAdr().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_GetNetworkCredentialsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetNetworkCredentialsResponse.class, Builder.class);
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
            return new GetNetworkCredentialsResponse();
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
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.password_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBytes(3, this.macAdr_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetNetworkCredentialsResponseOrBuilder {
            private int bitField0_;
            private ByteString macAdr_;
            private Object password_;
            private Object ssid_;

            private Builder() {
                this.ssid_ = "";
                this.password_ = "";
                this.macAdr_ = ByteString.EMPTY;
            }

            private void buildPartial0(GetNetworkCredentialsResponse getNetworkCredentialsResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    getNetworkCredentialsResponse.ssid_ = this.ssid_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    getNetworkCredentialsResponse.password_ = this.password_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    getNetworkCredentialsResponse.macAdr_ = this.macAdr_;
                    i14 |= 4;
                }
                getNetworkCredentialsResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_GetNetworkCredentialsResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetNetworkCredentialsResponse build() {
                GetNetworkCredentialsResponse getNetworkCredentialsResponseBuildPartial = buildPartial();
                if (getNetworkCredentialsResponseBuildPartial.isInitialized()) {
                    return getNetworkCredentialsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getNetworkCredentialsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetNetworkCredentialsResponse buildPartial() {
                GetNetworkCredentialsResponse getNetworkCredentialsResponse = new GetNetworkCredentialsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(getNetworkCredentialsResponse);
                }
                onBuilt();
                return getNetworkCredentialsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.ssid_ = "";
                this.password_ = "";
                this.macAdr_ = ByteString.EMPTY;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMacAdr() {
                this.bitField0_ &= -5;
                this.macAdr_ = GetNetworkCredentialsResponse.getDefaultInstance().getMacAdr();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPassword() {
                this.password_ = GetNetworkCredentialsResponse.getDefaultInstance().getPassword();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearSsid() {
                this.ssid_ = GetNetworkCredentialsResponse.getDefaultInstance().getSsid();
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_GetNetworkCredentialsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.GetNetworkCredentialsResponseOrBuilder
            public ByteString getMacAdr() {
                return this.macAdr_;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.GetNetworkCredentialsResponseOrBuilder
            public String getPassword() {
                Object obj = this.password_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.password_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.GetNetworkCredentialsResponseOrBuilder
            public ByteString getPasswordBytes() {
                Object obj = this.password_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.password_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.GetNetworkCredentialsResponseOrBuilder
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

            @Override // com.garmin.proto.generated.GDIWifiSetup.GetNetworkCredentialsResponseOrBuilder
            public ByteString getSsidBytes() {
                Object obj = this.ssid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ssid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.GetNetworkCredentialsResponseOrBuilder
            public boolean hasMacAdr() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.GetNetworkCredentialsResponseOrBuilder
            public boolean hasPassword() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.GetNetworkCredentialsResponseOrBuilder
            public boolean hasSsid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_GetNetworkCredentialsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetNetworkCredentialsResponse.class, Builder.class);
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
                                } else if (tag == 18) {
                                    this.password_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.macAdr_ = codedInputStream.readBytes();
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

            public Builder setMacAdr(ByteString byteString) {
                byteString.getClass();
                this.macAdr_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPassword(String str) {
                str.getClass();
                this.password_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPasswordBytes(ByteString byteString) {
                byteString.getClass();
                this.password_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
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
            public GetNetworkCredentialsResponse getDefaultInstanceForType() {
                return GetNetworkCredentialsResponse.getDefaultInstance();
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
                this.password_ = "";
                this.macAdr_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetNetworkCredentialsResponse) {
                    return mergeFrom((GetNetworkCredentialsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GetNetworkCredentialsResponse getNetworkCredentialsResponse) {
                if (getNetworkCredentialsResponse == GetNetworkCredentialsResponse.getDefaultInstance()) {
                    return this;
                }
                if (getNetworkCredentialsResponse.hasSsid()) {
                    this.ssid_ = getNetworkCredentialsResponse.ssid_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (getNetworkCredentialsResponse.hasPassword()) {
                    this.password_ = getNetworkCredentialsResponse.password_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (getNetworkCredentialsResponse.hasMacAdr()) {
                    setMacAdr(getNetworkCredentialsResponse.getMacAdr());
                }
                mergeUnknownFields(getNetworkCredentialsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetNetworkCredentialsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GetNetworkCredentialsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetNetworkCredentialsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetNetworkCredentialsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetNetworkCredentialsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetNetworkCredentialsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetNetworkCredentialsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetNetworkCredentialsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetNetworkCredentialsResponse parseFrom(InputStream inputStream) {
            return (GetNetworkCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetNetworkCredentialsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetNetworkCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetNetworkCredentialsResponse parseFrom(CodedInputStream codedInputStream) {
            return (GetNetworkCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetNetworkCredentialsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetNetworkCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private GetNetworkCredentialsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.ssid_ = "";
            this.password_ = "";
            this.macAdr_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ GetNetworkCredentialsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
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
        public static final Parser<MobileCarrierInfoResponse> PARSER = new AbstractParser<MobileCarrierInfoResponse>() { // from class: com.garmin.proto.generated.GDIWifiSetup.MobileCarrierInfoResponse.1
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
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_MobileCarrierInfoResponse_descriptor;
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

        @Override // com.garmin.proto.generated.GDIWifiSetup.MobileCarrierInfoResponseOrBuilder
        public String getIsoCountryCode(int i14) {
            return this.isoCountryCode_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.MobileCarrierInfoResponseOrBuilder
        public ByteString getIsoCountryCodeBytes(int i14) {
            return this.isoCountryCode_.getByteString(i14);
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.MobileCarrierInfoResponseOrBuilder
        public int getIsoCountryCodeCount() {
            return this.isoCountryCode_.size();
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.MobileCarrierInfoResponseOrBuilder
        public String getMobileCountryCode(int i14) {
            return this.mobileCountryCode_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.MobileCarrierInfoResponseOrBuilder
        public ByteString getMobileCountryCodeBytes(int i14) {
            return this.mobileCountryCode_.getByteString(i14);
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.MobileCarrierInfoResponseOrBuilder
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
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_MobileCarrierInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(MobileCarrierInfoResponse.class, Builder.class);
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_MobileCarrierInfoResponse_descriptor;
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_MobileCarrierInfoResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.MobileCarrierInfoResponseOrBuilder
            public String getIsoCountryCode(int i14) {
                return this.isoCountryCode_.get(i14);
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.MobileCarrierInfoResponseOrBuilder
            public ByteString getIsoCountryCodeBytes(int i14) {
                return this.isoCountryCode_.getByteString(i14);
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.MobileCarrierInfoResponseOrBuilder
            public int getIsoCountryCodeCount() {
                return this.isoCountryCode_.size();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.MobileCarrierInfoResponseOrBuilder
            public ProtocolStringList getIsoCountryCodeList() {
                this.isoCountryCode_.makeImmutable();
                return this.isoCountryCode_;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.MobileCarrierInfoResponseOrBuilder
            public String getMobileCountryCode(int i14) {
                return this.mobileCountryCode_.get(i14);
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.MobileCarrierInfoResponseOrBuilder
            public ByteString getMobileCountryCodeBytes(int i14) {
                return this.mobileCountryCode_.getByteString(i14);
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.MobileCarrierInfoResponseOrBuilder
            public int getMobileCountryCodeCount() {
                return this.mobileCountryCode_.size();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.MobileCarrierInfoResponseOrBuilder
            public ProtocolStringList getMobileCountryCodeList() {
                this.mobileCountryCode_.makeImmutable();
                return this.mobileCountryCode_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_MobileCarrierInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(MobileCarrierInfoResponse.class, Builder.class);
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

        @Override // com.garmin.proto.generated.GDIWifiSetup.MobileCarrierInfoResponseOrBuilder
        public ProtocolStringList getIsoCountryCodeList() {
            return this.isoCountryCode_;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.MobileCarrierInfoResponseOrBuilder
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

    public static final class OAuthCredentialsResponse extends GeneratedMessageV3 implements OAuthCredentialsResponseOrBuilder {
        public static final int ENCRYPTED_WIFI_PROTOBUF_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString encryptedWifiProtobuf_;
        private byte memoizedIsInitialized;
        private static final OAuthCredentialsResponse DEFAULT_INSTANCE = new OAuthCredentialsResponse();

        @Deprecated
        public static final Parser<OAuthCredentialsResponse> PARSER = new AbstractParser<OAuthCredentialsResponse>() { // from class: com.garmin.proto.generated.GDIWifiSetup.OAuthCredentialsResponse.1
            @Override // com.google.protobuf.Parser
            public OAuthCredentialsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = OAuthCredentialsResponse.newBuilder();
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

        private OAuthCredentialsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static OAuthCredentialsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_OAuthCredentialsResponse_descriptor;
        }

        public static Builder newBuilder(OAuthCredentialsResponse oAuthCredentialsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(oAuthCredentialsResponse);
        }

        public static OAuthCredentialsResponse parseDelimitedFrom(InputStream inputStream) {
            return (OAuthCredentialsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static OAuthCredentialsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<OAuthCredentialsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OAuthCredentialsResponse)) {
                return super.equals(obj);
            }
            OAuthCredentialsResponse oAuthCredentialsResponse = (OAuthCredentialsResponse) obj;
            if (hasEncryptedWifiProtobuf() != oAuthCredentialsResponse.hasEncryptedWifiProtobuf()) {
                return false;
            }
            return (!hasEncryptedWifiProtobuf() || getEncryptedWifiProtobuf().equals(oAuthCredentialsResponse.getEncryptedWifiProtobuf())) && getUnknownFields().equals(oAuthCredentialsResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.OAuthCredentialsResponseOrBuilder
        public ByteString getEncryptedWifiProtobuf() {
            return this.encryptedWifiProtobuf_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<OAuthCredentialsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.encryptedWifiProtobuf_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.OAuthCredentialsResponseOrBuilder
        public boolean hasEncryptedWifiProtobuf() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEncryptedWifiProtobuf()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getEncryptedWifiProtobuf().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_OAuthCredentialsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(OAuthCredentialsResponse.class, Builder.class);
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
            if (hasEncryptedWifiProtobuf()) {
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
            return new OAuthCredentialsResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.encryptedWifiProtobuf_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OAuthCredentialsResponseOrBuilder {
            private int bitField0_;
            private ByteString encryptedWifiProtobuf_;

            private Builder() {
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            }

            private void buildPartial0(OAuthCredentialsResponse oAuthCredentialsResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    oAuthCredentialsResponse.encryptedWifiProtobuf_ = this.encryptedWifiProtobuf_;
                } else {
                    i14 = 0;
                }
                oAuthCredentialsResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_OAuthCredentialsResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OAuthCredentialsResponse build() {
                OAuthCredentialsResponse oAuthCredentialsResponseBuildPartial = buildPartial();
                if (oAuthCredentialsResponseBuildPartial.isInitialized()) {
                    return oAuthCredentialsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) oAuthCredentialsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OAuthCredentialsResponse buildPartial() {
                OAuthCredentialsResponse oAuthCredentialsResponse = new OAuthCredentialsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(oAuthCredentialsResponse);
                }
                onBuilt();
                return oAuthCredentialsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearEncryptedWifiProtobuf() {
                this.bitField0_ &= -2;
                this.encryptedWifiProtobuf_ = OAuthCredentialsResponse.getDefaultInstance().getEncryptedWifiProtobuf();
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_OAuthCredentialsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.OAuthCredentialsResponseOrBuilder
            public ByteString getEncryptedWifiProtobuf() {
                return this.encryptedWifiProtobuf_;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.OAuthCredentialsResponseOrBuilder
            public boolean hasEncryptedWifiProtobuf() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_OAuthCredentialsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(OAuthCredentialsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasEncryptedWifiProtobuf();
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
                                    this.encryptedWifiProtobuf_ = codedInputStream.readBytes();
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

            public Builder setEncryptedWifiProtobuf(ByteString byteString) {
                byteString.getClass();
                this.encryptedWifiProtobuf_ = byteString;
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
            public OAuthCredentialsResponse getDefaultInstanceForType() {
                return OAuthCredentialsResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof OAuthCredentialsResponse) {
                    return mergeFrom((OAuthCredentialsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(OAuthCredentialsResponse oAuthCredentialsResponse) {
                if (oAuthCredentialsResponse == OAuthCredentialsResponse.getDefaultInstance()) {
                    return this;
                }
                if (oAuthCredentialsResponse.hasEncryptedWifiProtobuf()) {
                    setEncryptedWifiProtobuf(oAuthCredentialsResponse.getEncryptedWifiProtobuf());
                }
                mergeUnknownFields(oAuthCredentialsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public OAuthCredentialsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static OAuthCredentialsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthCredentialsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OAuthCredentialsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static OAuthCredentialsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ OAuthCredentialsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OAuthCredentialsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private OAuthCredentialsResponse() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.encryptedWifiProtobuf_ = byteString;
        }

        public static OAuthCredentialsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static OAuthCredentialsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static OAuthCredentialsResponse parseFrom(InputStream inputStream) {
            return (OAuthCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static OAuthCredentialsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OAuthCredentialsResponse parseFrom(CodedInputStream codedInputStream) {
            return (OAuthCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static OAuthCredentialsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StoreAccessPointNotification extends GeneratedMessageV3 implements StoreAccessPointNotificationOrBuilder {
        public static final int ENCRYPTED_WIFI_PROTOBUF_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString encryptedWifiProtobuf_;
        private byte memoizedIsInitialized;
        private static final StoreAccessPointNotification DEFAULT_INSTANCE = new StoreAccessPointNotification();

        @Deprecated
        public static final Parser<StoreAccessPointNotification> PARSER = new AbstractParser<StoreAccessPointNotification>() { // from class: com.garmin.proto.generated.GDIWifiSetup.StoreAccessPointNotification.1
            @Override // com.google.protobuf.Parser
            public StoreAccessPointNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StoreAccessPointNotification.newBuilder();
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

        private StoreAccessPointNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StoreAccessPointNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_StoreAccessPointNotification_descriptor;
        }

        public static Builder newBuilder(StoreAccessPointNotification storeAccessPointNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(storeAccessPointNotification);
        }

        public static StoreAccessPointNotification parseDelimitedFrom(InputStream inputStream) {
            return (StoreAccessPointNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StoreAccessPointNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StoreAccessPointNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StoreAccessPointNotification)) {
                return super.equals(obj);
            }
            StoreAccessPointNotification storeAccessPointNotification = (StoreAccessPointNotification) obj;
            if (hasEncryptedWifiProtobuf() != storeAccessPointNotification.hasEncryptedWifiProtobuf()) {
                return false;
            }
            return (!hasEncryptedWifiProtobuf() || getEncryptedWifiProtobuf().equals(storeAccessPointNotification.getEncryptedWifiProtobuf())) && getUnknownFields().equals(storeAccessPointNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.StoreAccessPointNotificationOrBuilder
        public ByteString getEncryptedWifiProtobuf() {
            return this.encryptedWifiProtobuf_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StoreAccessPointNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.encryptedWifiProtobuf_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.StoreAccessPointNotificationOrBuilder
        public boolean hasEncryptedWifiProtobuf() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEncryptedWifiProtobuf()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getEncryptedWifiProtobuf().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_StoreAccessPointNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(StoreAccessPointNotification.class, Builder.class);
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
            if (hasEncryptedWifiProtobuf()) {
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
            return new StoreAccessPointNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.encryptedWifiProtobuf_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StoreAccessPointNotificationOrBuilder {
            private int bitField0_;
            private ByteString encryptedWifiProtobuf_;

            private Builder() {
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            }

            private void buildPartial0(StoreAccessPointNotification storeAccessPointNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    storeAccessPointNotification.encryptedWifiProtobuf_ = this.encryptedWifiProtobuf_;
                } else {
                    i14 = 0;
                }
                storeAccessPointNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_StoreAccessPointNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StoreAccessPointNotification build() {
                StoreAccessPointNotification storeAccessPointNotificationBuildPartial = buildPartial();
                if (storeAccessPointNotificationBuildPartial.isInitialized()) {
                    return storeAccessPointNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) storeAccessPointNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StoreAccessPointNotification buildPartial() {
                StoreAccessPointNotification storeAccessPointNotification = new StoreAccessPointNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(storeAccessPointNotification);
                }
                onBuilt();
                return storeAccessPointNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearEncryptedWifiProtobuf() {
                this.bitField0_ &= -2;
                this.encryptedWifiProtobuf_ = StoreAccessPointNotification.getDefaultInstance().getEncryptedWifiProtobuf();
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_StoreAccessPointNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.StoreAccessPointNotificationOrBuilder
            public ByteString getEncryptedWifiProtobuf() {
                return this.encryptedWifiProtobuf_;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.StoreAccessPointNotificationOrBuilder
            public boolean hasEncryptedWifiProtobuf() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_StoreAccessPointNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(StoreAccessPointNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasEncryptedWifiProtobuf();
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
                                    this.encryptedWifiProtobuf_ = codedInputStream.readBytes();
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

            public Builder setEncryptedWifiProtobuf(ByteString byteString) {
                byteString.getClass();
                this.encryptedWifiProtobuf_ = byteString;
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
            public StoreAccessPointNotification getDefaultInstanceForType() {
                return StoreAccessPointNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StoreAccessPointNotification) {
                    return mergeFrom((StoreAccessPointNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StoreAccessPointNotification storeAccessPointNotification) {
                if (storeAccessPointNotification == StoreAccessPointNotification.getDefaultInstance()) {
                    return this;
                }
                if (storeAccessPointNotification.hasEncryptedWifiProtobuf()) {
                    setEncryptedWifiProtobuf(storeAccessPointNotification.getEncryptedWifiProtobuf());
                }
                mergeUnknownFields(storeAccessPointNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StoreAccessPointNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StoreAccessPointNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StoreAccessPointNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StoreAccessPointNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StoreAccessPointNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ StoreAccessPointNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StoreAccessPointNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private StoreAccessPointNotification() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.encryptedWifiProtobuf_ = byteString;
        }

        public static StoreAccessPointNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StoreAccessPointNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StoreAccessPointNotification parseFrom(InputStream inputStream) {
            return (StoreAccessPointNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StoreAccessPointNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StoreAccessPointNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StoreAccessPointNotification parseFrom(CodedInputStream codedInputStream) {
            return (StoreAccessPointNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StoreAccessPointNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StoreAccessPointNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StoredAccessPointResponse extends GeneratedMessageV3 implements StoredAccessPointResponseOrBuilder {
        public static final int ENCRYPTED_WIFI_PROTOBUF_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString encryptedWifiProtobuf_;
        private byte memoizedIsInitialized;
        private static final StoredAccessPointResponse DEFAULT_INSTANCE = new StoredAccessPointResponse();

        @Deprecated
        public static final Parser<StoredAccessPointResponse> PARSER = new AbstractParser<StoredAccessPointResponse>() { // from class: com.garmin.proto.generated.GDIWifiSetup.StoredAccessPointResponse.1
            @Override // com.google.protobuf.Parser
            public StoredAccessPointResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StoredAccessPointResponse.newBuilder();
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

        private StoredAccessPointResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StoredAccessPointResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_StoredAccessPointResponse_descriptor;
        }

        public static Builder newBuilder(StoredAccessPointResponse storedAccessPointResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(storedAccessPointResponse);
        }

        public static StoredAccessPointResponse parseDelimitedFrom(InputStream inputStream) {
            return (StoredAccessPointResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StoredAccessPointResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StoredAccessPointResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StoredAccessPointResponse)) {
                return super.equals(obj);
            }
            StoredAccessPointResponse storedAccessPointResponse = (StoredAccessPointResponse) obj;
            if (hasEncryptedWifiProtobuf() != storedAccessPointResponse.hasEncryptedWifiProtobuf()) {
                return false;
            }
            return (!hasEncryptedWifiProtobuf() || getEncryptedWifiProtobuf().equals(storedAccessPointResponse.getEncryptedWifiProtobuf())) && getUnknownFields().equals(storedAccessPointResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.StoredAccessPointResponseOrBuilder
        public ByteString getEncryptedWifiProtobuf() {
            return this.encryptedWifiProtobuf_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StoredAccessPointResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.encryptedWifiProtobuf_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.StoredAccessPointResponseOrBuilder
        public boolean hasEncryptedWifiProtobuf() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEncryptedWifiProtobuf()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getEncryptedWifiProtobuf().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_StoredAccessPointResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StoredAccessPointResponse.class, Builder.class);
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
            if (hasEncryptedWifiProtobuf()) {
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
            return new StoredAccessPointResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.encryptedWifiProtobuf_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StoredAccessPointResponseOrBuilder {
            private int bitField0_;
            private ByteString encryptedWifiProtobuf_;

            private Builder() {
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            }

            private void buildPartial0(StoredAccessPointResponse storedAccessPointResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    storedAccessPointResponse.encryptedWifiProtobuf_ = this.encryptedWifiProtobuf_;
                } else {
                    i14 = 0;
                }
                storedAccessPointResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_StoredAccessPointResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StoredAccessPointResponse build() {
                StoredAccessPointResponse storedAccessPointResponseBuildPartial = buildPartial();
                if (storedAccessPointResponseBuildPartial.isInitialized()) {
                    return storedAccessPointResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) storedAccessPointResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StoredAccessPointResponse buildPartial() {
                StoredAccessPointResponse storedAccessPointResponse = new StoredAccessPointResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(storedAccessPointResponse);
                }
                onBuilt();
                return storedAccessPointResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearEncryptedWifiProtobuf() {
                this.bitField0_ &= -2;
                this.encryptedWifiProtobuf_ = StoredAccessPointResponse.getDefaultInstance().getEncryptedWifiProtobuf();
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_StoredAccessPointResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.StoredAccessPointResponseOrBuilder
            public ByteString getEncryptedWifiProtobuf() {
                return this.encryptedWifiProtobuf_;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.StoredAccessPointResponseOrBuilder
            public boolean hasEncryptedWifiProtobuf() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_StoredAccessPointResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StoredAccessPointResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasEncryptedWifiProtobuf();
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
                                    this.encryptedWifiProtobuf_ = codedInputStream.readBytes();
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

            public Builder setEncryptedWifiProtobuf(ByteString byteString) {
                byteString.getClass();
                this.encryptedWifiProtobuf_ = byteString;
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
            public StoredAccessPointResponse getDefaultInstanceForType() {
                return StoredAccessPointResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StoredAccessPointResponse) {
                    return mergeFrom((StoredAccessPointResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StoredAccessPointResponse storedAccessPointResponse) {
                if (storedAccessPointResponse == StoredAccessPointResponse.getDefaultInstance()) {
                    return this;
                }
                if (storedAccessPointResponse.hasEncryptedWifiProtobuf()) {
                    setEncryptedWifiProtobuf(storedAccessPointResponse.getEncryptedWifiProtobuf());
                }
                mergeUnknownFields(storedAccessPointResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StoredAccessPointResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StoredAccessPointResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StoredAccessPointResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StoredAccessPointResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StoredAccessPointResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ StoredAccessPointResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StoredAccessPointResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private StoredAccessPointResponse() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.encryptedWifiProtobuf_ = byteString;
        }

        public static StoredAccessPointResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StoredAccessPointResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StoredAccessPointResponse parseFrom(InputStream inputStream) {
            return (StoredAccessPointResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StoredAccessPointResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StoredAccessPointResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StoredAccessPointResponse parseFrom(CodedInputStream codedInputStream) {
            return (StoredAccessPointResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StoredAccessPointResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StoredAccessPointResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SwitchToApModeRequest extends GeneratedMessageV3 implements SwitchToApModeRequestOrBuilder {
        private static final SwitchToApModeRequest DEFAULT_INSTANCE = new SwitchToApModeRequest();

        @Deprecated
        public static final Parser<SwitchToApModeRequest> PARSER = new AbstractParser<SwitchToApModeRequest>() { // from class: com.garmin.proto.generated.GDIWifiSetup.SwitchToApModeRequest.1
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
        public static final int REQUESTED_BAND_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int requestedBand_;

        private SwitchToApModeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.requestedBand_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwitchToApModeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_SwitchToApModeRequest_descriptor;
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
            if (hasRequestedBand() != switchToApModeRequest.hasRequestedBand()) {
                return false;
            }
            return (!hasRequestedBand() || this.requestedBand_ == switchToApModeRequest.requestedBand_) && getUnknownFields().equals(switchToApModeRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SwitchToApModeRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.SwitchToApModeRequestOrBuilder
        public WifiBand getRequestedBand() {
            WifiBand wifiBandForNumber = WifiBand.forNumber(this.requestedBand_);
            return wifiBandForNumber == null ? WifiBand.WIFI_BAND_5_GHZ : wifiBandForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.requestedBand_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.SwitchToApModeRequestOrBuilder
        public boolean hasRequestedBand() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasRequestedBand()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.requestedBand_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_SwitchToApModeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitchToApModeRequest.class, Builder.class);
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
                codedOutputStream.writeEnum(1, this.requestedBand_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwitchToApModeRequestOrBuilder {
            private int bitField0_;
            private int requestedBand_;

            private Builder() {
                this.requestedBand_ = 0;
            }

            private void buildPartial0(SwitchToApModeRequest switchToApModeRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    switchToApModeRequest.requestedBand_ = this.requestedBand_;
                } else {
                    i14 = 0;
                }
                switchToApModeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_SwitchToApModeRequest_descriptor;
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
                this.requestedBand_ = 0;
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

            public Builder clearRequestedBand() {
                this.bitField0_ &= -2;
                this.requestedBand_ = 0;
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_SwitchToApModeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.SwitchToApModeRequestOrBuilder
            public WifiBand getRequestedBand() {
                WifiBand wifiBandForNumber = WifiBand.forNumber(this.requestedBand_);
                return wifiBandForNumber == null ? WifiBand.WIFI_BAND_5_GHZ : wifiBandForNumber;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.SwitchToApModeRequestOrBuilder
            public boolean hasRequestedBand() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_SwitchToApModeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitchToApModeRequest.class, Builder.class);
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
                                    if (WifiBand.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.requestedBand_ = i14;
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

            public Builder setRequestedBand(WifiBand wifiBand) {
                wifiBand.getClass();
                this.bitField0_ |= 1;
                this.requestedBand_ = wifiBand.getNumber();
                onChanged();
                return this;
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
                this.requestedBand_ = 0;
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
                if (switchToApModeRequest.hasRequestedBand()) {
                    setRequestedBand(switchToApModeRequest.getRequestedBand());
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

        public /* synthetic */ SwitchToApModeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SwitchToApModeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SwitchToApModeRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.requestedBand_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwitchToApModeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SwitchToApModeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
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
        public static final int BAND_ENABLED_FIELD_NUMBER = 2;
        private static final SwitchToApModeResponse DEFAULT_INSTANCE = new SwitchToApModeResponse();

        @Deprecated
        public static final Parser<SwitchToApModeResponse> PARSER = new AbstractParser<SwitchToApModeResponse>() { // from class: com.garmin.proto.generated.GDIWifiSetup.SwitchToApModeResponse.1
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
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bandEnabled_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int status_;

        private SwitchToApModeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.bandEnabled_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwitchToApModeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_SwitchToApModeResponse_descriptor;
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
            if (hasStatus() != switchToApModeResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == switchToApModeResponse.status_) && hasBandEnabled() == switchToApModeResponse.hasBandEnabled()) {
                return (!hasBandEnabled() || this.bandEnabled_ == switchToApModeResponse.bandEnabled_) && getUnknownFields().equals(switchToApModeResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.SwitchToApModeResponseOrBuilder
        public WifiBand getBandEnabled() {
            WifiBand wifiBandForNumber = WifiBand.forNumber(this.bandEnabled_);
            return wifiBandForNumber == null ? WifiBand.WIFI_BAND_5_GHZ : wifiBandForNumber;
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
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.bandEnabled_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.SwitchToApModeResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.SwitchToApModeResponseOrBuilder
        public boolean hasBandEnabled() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.SwitchToApModeResponseOrBuilder
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
            if (hasBandEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.bandEnabled_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_SwitchToApModeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitchToApModeResponse.class, Builder.class);
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
                codedOutputStream.writeEnum(1, this.status_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.bandEnabled_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwitchToApModeResponseOrBuilder {
            private int bandEnabled_;
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                this.bandEnabled_ = 0;
            }

            private void buildPartial0(SwitchToApModeResponse switchToApModeResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    switchToApModeResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    switchToApModeResponse.bandEnabled_ = this.bandEnabled_;
                    i14 |= 2;
                }
                switchToApModeResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_SwitchToApModeResponse_descriptor;
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
                this.status_ = 0;
                this.bandEnabled_ = 0;
                return this;
            }

            public Builder clearBandEnabled() {
                this.bitField0_ &= -3;
                this.bandEnabled_ = 0;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.SwitchToApModeResponseOrBuilder
            public WifiBand getBandEnabled() {
                WifiBand wifiBandForNumber = WifiBand.forNumber(this.bandEnabled_);
                return wifiBandForNumber == null ? WifiBand.WIFI_BAND_5_GHZ : wifiBandForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_SwitchToApModeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.SwitchToApModeResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.SwitchToApModeResponseOrBuilder
            public boolean hasBandEnabled() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.SwitchToApModeResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_SwitchToApModeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitchToApModeResponse.class, Builder.class);
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
                                    int i15 = codedInputStream.readEnum();
                                    if (WifiBand.forNumber(i15) == null) {
                                        mergeUnknownVarintField(2, i15);
                                    } else {
                                        this.bandEnabled_ = i15;
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

            public Builder setBandEnabled(WifiBand wifiBand) {
                wifiBand.getClass();
                this.bitField0_ |= 2;
                this.bandEnabled_ = wifiBand.getNumber();
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
                this.status_ = 0;
                this.bandEnabled_ = 0;
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
                if (switchToApModeResponse.hasStatus()) {
                    setStatus(switchToApModeResponse.getStatus());
                }
                if (switchToApModeResponse.hasBandEnabled()) {
                    setBandEnabled(switchToApModeResponse.getBandEnabled());
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

        public static SwitchToApModeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwitchToApModeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ SwitchToApModeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SwitchToApModeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private SwitchToApModeResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.bandEnabled_ = 0;
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

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN(0),
            FAIL(1),
            SUCCESS(2);

            public static final int FAIL_VALUE = 1;
            public static final int SUCCESS_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIWifiSetup.SwitchToApModeResponse.Status.1
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
                    return FAIL;
                }
                if (i14 != 2) {
                    return null;
                }
                return SUCCESS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SwitchToApModeResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class UpdateAccessPointRequest extends GeneratedMessageV3 implements UpdateAccessPointRequestOrBuilder {
        public static final int ENCRYPTED_WIFI_PROTOBUF_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString encryptedWifiProtobuf_;
        private byte memoizedIsInitialized;
        private static final UpdateAccessPointRequest DEFAULT_INSTANCE = new UpdateAccessPointRequest();

        @Deprecated
        public static final Parser<UpdateAccessPointRequest> PARSER = new AbstractParser<UpdateAccessPointRequest>() { // from class: com.garmin.proto.generated.GDIWifiSetup.UpdateAccessPointRequest.1
            @Override // com.google.protobuf.Parser
            public UpdateAccessPointRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UpdateAccessPointRequest.newBuilder();
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

        private UpdateAccessPointRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UpdateAccessPointRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_UpdateAccessPointRequest_descriptor;
        }

        public static Builder newBuilder(UpdateAccessPointRequest updateAccessPointRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(updateAccessPointRequest);
        }

        public static UpdateAccessPointRequest parseDelimitedFrom(InputStream inputStream) {
            return (UpdateAccessPointRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UpdateAccessPointRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UpdateAccessPointRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateAccessPointRequest)) {
                return super.equals(obj);
            }
            UpdateAccessPointRequest updateAccessPointRequest = (UpdateAccessPointRequest) obj;
            if (hasEncryptedWifiProtobuf() != updateAccessPointRequest.hasEncryptedWifiProtobuf()) {
                return false;
            }
            return (!hasEncryptedWifiProtobuf() || getEncryptedWifiProtobuf().equals(updateAccessPointRequest.getEncryptedWifiProtobuf())) && getUnknownFields().equals(updateAccessPointRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.UpdateAccessPointRequestOrBuilder
        public ByteString getEncryptedWifiProtobuf() {
            return this.encryptedWifiProtobuf_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UpdateAccessPointRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.encryptedWifiProtobuf_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.UpdateAccessPointRequestOrBuilder
        public boolean hasEncryptedWifiProtobuf() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEncryptedWifiProtobuf()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getEncryptedWifiProtobuf().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_UpdateAccessPointRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateAccessPointRequest.class, Builder.class);
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
            if (hasEncryptedWifiProtobuf()) {
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
            return new UpdateAccessPointRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.encryptedWifiProtobuf_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UpdateAccessPointRequestOrBuilder {
            private int bitField0_;
            private ByteString encryptedWifiProtobuf_;

            private Builder() {
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            }

            private void buildPartial0(UpdateAccessPointRequest updateAccessPointRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    updateAccessPointRequest.encryptedWifiProtobuf_ = this.encryptedWifiProtobuf_;
                } else {
                    i14 = 0;
                }
                updateAccessPointRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_UpdateAccessPointRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateAccessPointRequest build() {
                UpdateAccessPointRequest updateAccessPointRequestBuildPartial = buildPartial();
                if (updateAccessPointRequestBuildPartial.isInitialized()) {
                    return updateAccessPointRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) updateAccessPointRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateAccessPointRequest buildPartial() {
                UpdateAccessPointRequest updateAccessPointRequest = new UpdateAccessPointRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(updateAccessPointRequest);
                }
                onBuilt();
                return updateAccessPointRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearEncryptedWifiProtobuf() {
                this.bitField0_ &= -2;
                this.encryptedWifiProtobuf_ = UpdateAccessPointRequest.getDefaultInstance().getEncryptedWifiProtobuf();
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_UpdateAccessPointRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.UpdateAccessPointRequestOrBuilder
            public ByteString getEncryptedWifiProtobuf() {
                return this.encryptedWifiProtobuf_;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.UpdateAccessPointRequestOrBuilder
            public boolean hasEncryptedWifiProtobuf() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_UpdateAccessPointRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateAccessPointRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasEncryptedWifiProtobuf();
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
                                    this.encryptedWifiProtobuf_ = codedInputStream.readBytes();
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

            public Builder setEncryptedWifiProtobuf(ByteString byteString) {
                byteString.getClass();
                this.encryptedWifiProtobuf_ = byteString;
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
            public UpdateAccessPointRequest getDefaultInstanceForType() {
                return UpdateAccessPointRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UpdateAccessPointRequest) {
                    return mergeFrom((UpdateAccessPointRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UpdateAccessPointRequest updateAccessPointRequest) {
                if (updateAccessPointRequest == UpdateAccessPointRequest.getDefaultInstance()) {
                    return this;
                }
                if (updateAccessPointRequest.hasEncryptedWifiProtobuf()) {
                    setEncryptedWifiProtobuf(updateAccessPointRequest.getEncryptedWifiProtobuf());
                }
                mergeUnknownFields(updateAccessPointRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UpdateAccessPointRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UpdateAccessPointRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateAccessPointRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateAccessPointRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UpdateAccessPointRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ UpdateAccessPointRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UpdateAccessPointRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private UpdateAccessPointRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.encryptedWifiProtobuf_ = byteString;
        }

        public static UpdateAccessPointRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UpdateAccessPointRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UpdateAccessPointRequest parseFrom(InputStream inputStream) {
            return (UpdateAccessPointRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UpdateAccessPointRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateAccessPointRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateAccessPointRequest parseFrom(CodedInputStream codedInputStream) {
            return (UpdateAccessPointRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UpdateAccessPointRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateAccessPointRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class UpdateAccessPointResponse extends GeneratedMessageV3 implements UpdateAccessPointResponseOrBuilder {
        public static final int ENCRYPTED_WIFI_PROTOBUF_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString encryptedWifiProtobuf_;
        private byte memoizedIsInitialized;
        private static final UpdateAccessPointResponse DEFAULT_INSTANCE = new UpdateAccessPointResponse();

        @Deprecated
        public static final Parser<UpdateAccessPointResponse> PARSER = new AbstractParser<UpdateAccessPointResponse>() { // from class: com.garmin.proto.generated.GDIWifiSetup.UpdateAccessPointResponse.1
            @Override // com.google.protobuf.Parser
            public UpdateAccessPointResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UpdateAccessPointResponse.newBuilder();
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

        private UpdateAccessPointResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UpdateAccessPointResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_UpdateAccessPointResponse_descriptor;
        }

        public static Builder newBuilder(UpdateAccessPointResponse updateAccessPointResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(updateAccessPointResponse);
        }

        public static UpdateAccessPointResponse parseDelimitedFrom(InputStream inputStream) {
            return (UpdateAccessPointResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UpdateAccessPointResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UpdateAccessPointResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateAccessPointResponse)) {
                return super.equals(obj);
            }
            UpdateAccessPointResponse updateAccessPointResponse = (UpdateAccessPointResponse) obj;
            if (hasEncryptedWifiProtobuf() != updateAccessPointResponse.hasEncryptedWifiProtobuf()) {
                return false;
            }
            return (!hasEncryptedWifiProtobuf() || getEncryptedWifiProtobuf().equals(updateAccessPointResponse.getEncryptedWifiProtobuf())) && getUnknownFields().equals(updateAccessPointResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.UpdateAccessPointResponseOrBuilder
        public ByteString getEncryptedWifiProtobuf() {
            return this.encryptedWifiProtobuf_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UpdateAccessPointResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.encryptedWifiProtobuf_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.UpdateAccessPointResponseOrBuilder
        public boolean hasEncryptedWifiProtobuf() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEncryptedWifiProtobuf()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getEncryptedWifiProtobuf().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_UpdateAccessPointResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateAccessPointResponse.class, Builder.class);
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
            if (hasEncryptedWifiProtobuf()) {
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
            return new UpdateAccessPointResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.encryptedWifiProtobuf_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UpdateAccessPointResponseOrBuilder {
            private int bitField0_;
            private ByteString encryptedWifiProtobuf_;

            private Builder() {
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            }

            private void buildPartial0(UpdateAccessPointResponse updateAccessPointResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    updateAccessPointResponse.encryptedWifiProtobuf_ = this.encryptedWifiProtobuf_;
                } else {
                    i14 = 0;
                }
                updateAccessPointResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_UpdateAccessPointResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateAccessPointResponse build() {
                UpdateAccessPointResponse updateAccessPointResponseBuildPartial = buildPartial();
                if (updateAccessPointResponseBuildPartial.isInitialized()) {
                    return updateAccessPointResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) updateAccessPointResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateAccessPointResponse buildPartial() {
                UpdateAccessPointResponse updateAccessPointResponse = new UpdateAccessPointResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(updateAccessPointResponse);
                }
                onBuilt();
                return updateAccessPointResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearEncryptedWifiProtobuf() {
                this.bitField0_ &= -2;
                this.encryptedWifiProtobuf_ = UpdateAccessPointResponse.getDefaultInstance().getEncryptedWifiProtobuf();
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_UpdateAccessPointResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.UpdateAccessPointResponseOrBuilder
            public ByteString getEncryptedWifiProtobuf() {
                return this.encryptedWifiProtobuf_;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.UpdateAccessPointResponseOrBuilder
            public boolean hasEncryptedWifiProtobuf() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_UpdateAccessPointResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateAccessPointResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasEncryptedWifiProtobuf();
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
                                    this.encryptedWifiProtobuf_ = codedInputStream.readBytes();
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

            public Builder setEncryptedWifiProtobuf(ByteString byteString) {
                byteString.getClass();
                this.encryptedWifiProtobuf_ = byteString;
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
            public UpdateAccessPointResponse getDefaultInstanceForType() {
                return UpdateAccessPointResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UpdateAccessPointResponse) {
                    return mergeFrom((UpdateAccessPointResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UpdateAccessPointResponse updateAccessPointResponse) {
                if (updateAccessPointResponse == UpdateAccessPointResponse.getDefaultInstance()) {
                    return this;
                }
                if (updateAccessPointResponse.hasEncryptedWifiProtobuf()) {
                    setEncryptedWifiProtobuf(updateAccessPointResponse.getEncryptedWifiProtobuf());
                }
                mergeUnknownFields(updateAccessPointResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UpdateAccessPointResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UpdateAccessPointResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateAccessPointResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateAccessPointResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UpdateAccessPointResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ UpdateAccessPointResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UpdateAccessPointResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private UpdateAccessPointResponse() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.encryptedWifiProtobuf_ = byteString;
        }

        public static UpdateAccessPointResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UpdateAccessPointResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UpdateAccessPointResponse parseFrom(InputStream inputStream) {
            return (UpdateAccessPointResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UpdateAccessPointResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateAccessPointResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateAccessPointResponse parseFrom(CodedInputStream codedInputStream) {
            return (UpdateAccessPointResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UpdateAccessPointResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateAccessPointResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class VerifyConnectionNotification extends GeneratedMessageV3 implements VerifyConnectionNotificationOrBuilder {
        public static final int ENCRYPTED_WIFI_PROTOBUF_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString encryptedWifiProtobuf_;
        private byte memoizedIsInitialized;
        private static final VerifyConnectionNotification DEFAULT_INSTANCE = new VerifyConnectionNotification();

        @Deprecated
        public static final Parser<VerifyConnectionNotification> PARSER = new AbstractParser<VerifyConnectionNotification>() { // from class: com.garmin.proto.generated.GDIWifiSetup.VerifyConnectionNotification.1
            @Override // com.google.protobuf.Parser
            public VerifyConnectionNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = VerifyConnectionNotification.newBuilder();
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

        private VerifyConnectionNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VerifyConnectionNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_VerifyConnectionNotification_descriptor;
        }

        public static Builder newBuilder(VerifyConnectionNotification verifyConnectionNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(verifyConnectionNotification);
        }

        public static VerifyConnectionNotification parseDelimitedFrom(InputStream inputStream) {
            return (VerifyConnectionNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VerifyConnectionNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<VerifyConnectionNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VerifyConnectionNotification)) {
                return super.equals(obj);
            }
            VerifyConnectionNotification verifyConnectionNotification = (VerifyConnectionNotification) obj;
            if (hasEncryptedWifiProtobuf() != verifyConnectionNotification.hasEncryptedWifiProtobuf()) {
                return false;
            }
            return (!hasEncryptedWifiProtobuf() || getEncryptedWifiProtobuf().equals(verifyConnectionNotification.getEncryptedWifiProtobuf())) && getUnknownFields().equals(verifyConnectionNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.VerifyConnectionNotificationOrBuilder
        public ByteString getEncryptedWifiProtobuf() {
            return this.encryptedWifiProtobuf_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<VerifyConnectionNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.encryptedWifiProtobuf_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.VerifyConnectionNotificationOrBuilder
        public boolean hasEncryptedWifiProtobuf() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEncryptedWifiProtobuf()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getEncryptedWifiProtobuf().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_VerifyConnectionNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(VerifyConnectionNotification.class, Builder.class);
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
            if (hasEncryptedWifiProtobuf()) {
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
            return new VerifyConnectionNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.encryptedWifiProtobuf_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VerifyConnectionNotificationOrBuilder {
            private int bitField0_;
            private ByteString encryptedWifiProtobuf_;

            private Builder() {
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            }

            private void buildPartial0(VerifyConnectionNotification verifyConnectionNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    verifyConnectionNotification.encryptedWifiProtobuf_ = this.encryptedWifiProtobuf_;
                } else {
                    i14 = 0;
                }
                verifyConnectionNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_VerifyConnectionNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VerifyConnectionNotification build() {
                VerifyConnectionNotification verifyConnectionNotificationBuildPartial = buildPartial();
                if (verifyConnectionNotificationBuildPartial.isInitialized()) {
                    return verifyConnectionNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) verifyConnectionNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VerifyConnectionNotification buildPartial() {
                VerifyConnectionNotification verifyConnectionNotification = new VerifyConnectionNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(verifyConnectionNotification);
                }
                onBuilt();
                return verifyConnectionNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearEncryptedWifiProtobuf() {
                this.bitField0_ &= -2;
                this.encryptedWifiProtobuf_ = VerifyConnectionNotification.getDefaultInstance().getEncryptedWifiProtobuf();
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_VerifyConnectionNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.VerifyConnectionNotificationOrBuilder
            public ByteString getEncryptedWifiProtobuf() {
                return this.encryptedWifiProtobuf_;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.VerifyConnectionNotificationOrBuilder
            public boolean hasEncryptedWifiProtobuf() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_VerifyConnectionNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(VerifyConnectionNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasEncryptedWifiProtobuf();
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
                                    this.encryptedWifiProtobuf_ = codedInputStream.readBytes();
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

            public Builder setEncryptedWifiProtobuf(ByteString byteString) {
                byteString.getClass();
                this.encryptedWifiProtobuf_ = byteString;
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
            public VerifyConnectionNotification getDefaultInstanceForType() {
                return VerifyConnectionNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof VerifyConnectionNotification) {
                    return mergeFrom((VerifyConnectionNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(VerifyConnectionNotification verifyConnectionNotification) {
                if (verifyConnectionNotification == VerifyConnectionNotification.getDefaultInstance()) {
                    return this;
                }
                if (verifyConnectionNotification.hasEncryptedWifiProtobuf()) {
                    setEncryptedWifiProtobuf(verifyConnectionNotification.getEncryptedWifiProtobuf());
                }
                mergeUnknownFields(verifyConnectionNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public VerifyConnectionNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static VerifyConnectionNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VerifyConnectionNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VerifyConnectionNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static VerifyConnectionNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ VerifyConnectionNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VerifyConnectionNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private VerifyConnectionNotification() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.encryptedWifiProtobuf_ = byteString;
        }

        public static VerifyConnectionNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static VerifyConnectionNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static VerifyConnectionNotification parseFrom(InputStream inputStream) {
            return (VerifyConnectionNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static VerifyConnectionNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VerifyConnectionNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VerifyConnectionNotification parseFrom(CodedInputStream codedInputStream) {
            return (VerifyConnectionNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static VerifyConnectionNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VerifyConnectionNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class VerifyConnectionResponse extends GeneratedMessageV3 implements VerifyConnectionResponseOrBuilder {
        public static final int ENCRYPTED_WIFI_PROTOBUF_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString encryptedWifiProtobuf_;
        private byte memoizedIsInitialized;
        private static final VerifyConnectionResponse DEFAULT_INSTANCE = new VerifyConnectionResponse();

        @Deprecated
        public static final Parser<VerifyConnectionResponse> PARSER = new AbstractParser<VerifyConnectionResponse>() { // from class: com.garmin.proto.generated.GDIWifiSetup.VerifyConnectionResponse.1
            @Override // com.google.protobuf.Parser
            public VerifyConnectionResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = VerifyConnectionResponse.newBuilder();
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

        private VerifyConnectionResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VerifyConnectionResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_VerifyConnectionResponse_descriptor;
        }

        public static Builder newBuilder(VerifyConnectionResponse verifyConnectionResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(verifyConnectionResponse);
        }

        public static VerifyConnectionResponse parseDelimitedFrom(InputStream inputStream) {
            return (VerifyConnectionResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VerifyConnectionResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<VerifyConnectionResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VerifyConnectionResponse)) {
                return super.equals(obj);
            }
            VerifyConnectionResponse verifyConnectionResponse = (VerifyConnectionResponse) obj;
            if (hasEncryptedWifiProtobuf() != verifyConnectionResponse.hasEncryptedWifiProtobuf()) {
                return false;
            }
            return (!hasEncryptedWifiProtobuf() || getEncryptedWifiProtobuf().equals(verifyConnectionResponse.getEncryptedWifiProtobuf())) && getUnknownFields().equals(verifyConnectionResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.VerifyConnectionResponseOrBuilder
        public ByteString getEncryptedWifiProtobuf() {
            return this.encryptedWifiProtobuf_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<VerifyConnectionResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.encryptedWifiProtobuf_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.VerifyConnectionResponseOrBuilder
        public boolean hasEncryptedWifiProtobuf() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEncryptedWifiProtobuf()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getEncryptedWifiProtobuf().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_VerifyConnectionResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(VerifyConnectionResponse.class, Builder.class);
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
            if (hasEncryptedWifiProtobuf()) {
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
            return new VerifyConnectionResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.encryptedWifiProtobuf_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VerifyConnectionResponseOrBuilder {
            private int bitField0_;
            private ByteString encryptedWifiProtobuf_;

            private Builder() {
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            }

            private void buildPartial0(VerifyConnectionResponse verifyConnectionResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    verifyConnectionResponse.encryptedWifiProtobuf_ = this.encryptedWifiProtobuf_;
                } else {
                    i14 = 0;
                }
                verifyConnectionResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_VerifyConnectionResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VerifyConnectionResponse build() {
                VerifyConnectionResponse verifyConnectionResponseBuildPartial = buildPartial();
                if (verifyConnectionResponseBuildPartial.isInitialized()) {
                    return verifyConnectionResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) verifyConnectionResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VerifyConnectionResponse buildPartial() {
                VerifyConnectionResponse verifyConnectionResponse = new VerifyConnectionResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(verifyConnectionResponse);
                }
                onBuilt();
                return verifyConnectionResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearEncryptedWifiProtobuf() {
                this.bitField0_ &= -2;
                this.encryptedWifiProtobuf_ = VerifyConnectionResponse.getDefaultInstance().getEncryptedWifiProtobuf();
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
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_VerifyConnectionResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.VerifyConnectionResponseOrBuilder
            public ByteString getEncryptedWifiProtobuf() {
                return this.encryptedWifiProtobuf_;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.VerifyConnectionResponseOrBuilder
            public boolean hasEncryptedWifiProtobuf() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_VerifyConnectionResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(VerifyConnectionResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasEncryptedWifiProtobuf();
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
                                    this.encryptedWifiProtobuf_ = codedInputStream.readBytes();
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

            public Builder setEncryptedWifiProtobuf(ByteString byteString) {
                byteString.getClass();
                this.encryptedWifiProtobuf_ = byteString;
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
            public VerifyConnectionResponse getDefaultInstanceForType() {
                return VerifyConnectionResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.encryptedWifiProtobuf_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof VerifyConnectionResponse) {
                    return mergeFrom((VerifyConnectionResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(VerifyConnectionResponse verifyConnectionResponse) {
                if (verifyConnectionResponse == VerifyConnectionResponse.getDefaultInstance()) {
                    return this;
                }
                if (verifyConnectionResponse.hasEncryptedWifiProtobuf()) {
                    setEncryptedWifiProtobuf(verifyConnectionResponse.getEncryptedWifiProtobuf());
                }
                mergeUnknownFields(verifyConnectionResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public VerifyConnectionResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static VerifyConnectionResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VerifyConnectionResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VerifyConnectionResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static VerifyConnectionResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ VerifyConnectionResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VerifyConnectionResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private VerifyConnectionResponse() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.encryptedWifiProtobuf_ = byteString;
        }

        public static VerifyConnectionResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static VerifyConnectionResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static VerifyConnectionResponse parseFrom(InputStream inputStream) {
            return (VerifyConnectionResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static VerifyConnectionResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VerifyConnectionResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VerifyConnectionResponse parseFrom(CodedInputStream codedInputStream) {
            return (VerifyConnectionResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static VerifyConnectionResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VerifyConnectionResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class WifiSetupService extends GeneratedMessageV3 implements WifiSetupServiceOrBuilder {
        public static final int ACCESS_POINT_REQUEST_FIELD_NUMBER = 8;
        public static final int ACCESS_POINT_RESPONSE_FIELD_NUMBER = 9;
        public static final int ACCESS_POINT_SCAN_COMPLETE_NOTIFICATION_FIELD_NUMBER = 11;
        public static final int ACCESS_POINT_SCAN_REQUEST_FIELD_NUMBER = 1;
        public static final int ACCESS_POINT_SCAN_RESPONSE_FIELD_NUMBER = 2;
        public static final int ACCESS_POINT_START_SCAN_NOTIFICATION_FIELD_NUMBER = 10;
        public static final int CONNECTION_VERIFICATION_STATUS_NOTIFICATION_FIELD_NUMBER = 13;
        public static final int GET_NETWORK_CREDENTIALS_REQUEST_FIELD_NUMBER = 22;
        public static final int GET_NETWORK_CREDENTIALS_RESPONSE_FIELD_NUMBER = 23;
        public static final int MOBILE_CARRIER_INFO_REQUEST_FIELD_NUMBER = 18;
        public static final int MOBILE_CARRIER_INFO_RESPONSE_FIELD_NUMBER = 19;
        public static final int OAUTH_CREDENTIALS_REQUEST_FIELD_NUMBER = 6;
        public static final int OAUTH_CREDENTIALS_REQUEST_WITH_AGENT_MSG_FIELD_NUMBER = 16;
        public static final int OAUTH_CREDENTIALS_RESPONSE_FIELD_NUMBER = 7;
        public static final int OAUTH_CREDENTIALS_RESPONSE_WITH_AGENT_MSG_FIELD_NUMBER = 17;
        public static final int STORE_ACCESS_POINT_NOTIFICATION_FIELD_NUMBER = 3;
        public static final int SWITCH_TO_AP_REQUEST_FIELD_NUMBER = 20;
        public static final int SWITCH_TO_AP_RESPONSE_FIELD_NUMBER = 21;
        public static final int UPDATE_ACCESS_POINT_REQUEST_FIELD_NUMBER = 14;
        public static final int UPDATE_ACCESS_POINT_RESPONSE_FIELD_NUMBER = 15;
        public static final int VERIFY_CONNECTION_NOTIFICATION_FIELD_NUMBER = 12;
        public static final int VERIFY_CONNECTION_REQUEST_FIELD_NUMBER = 4;
        public static final int VERIFY_CONNECTION_RESPONSE_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private StoredAccessPointRequest accessPointRequest_;
        private StoredAccessPointResponse accessPointResponse_;
        private AccessPointScanCompleteNotification accessPointScanCompleteNotification_;
        private AccessPointScanRequest accessPointScanRequest_;
        private AccessPointScanResponse accessPointScanResponse_;
        private AccessPointStartScanNotification accessPointStartScanNotification_;
        private int bitField0_;
        private ConnectionVerificationStatusNotification connectionVerificationStatusNotification_;
        private GetNetworkCredentialsRequest getNetworkCredentialsRequest_;
        private GetNetworkCredentialsResponse getNetworkCredentialsResponse_;
        private byte memoizedIsInitialized;
        private MobileCarrierInfoRequest mobileCarrierInfoRequest_;
        private MobileCarrierInfoResponse mobileCarrierInfoResponse_;
        private OAuthCredentialsRequest oauthCredentialsRequestWithAgentMsg_;
        private OAuthCredentialsRequest oauthCredentialsRequest_;
        private OAuthCredentialsResponse oauthCredentialsResponseWithAgentMsg_;
        private OAuthCredentialsResponse oauthCredentialsResponse_;
        private StoreAccessPointNotification storeAccessPointNotification_;
        private SwitchToApModeRequest switchToApRequest_;
        private SwitchToApModeResponse switchToApResponse_;
        private UpdateAccessPointRequest updateAccessPointRequest_;
        private UpdateAccessPointResponse updateAccessPointResponse_;
        private VerifyConnectionNotification verifyConnectionNotification_;
        private VerifyConnectionRequest verifyConnectionRequest_;
        private VerifyConnectionResponse verifyConnectionResponse_;
        private static final WifiSetupService DEFAULT_INSTANCE = new WifiSetupService();

        @Deprecated
        public static final Parser<WifiSetupService> PARSER = new AbstractParser<WifiSetupService>() { // from class: com.garmin.proto.generated.GDIWifiSetup.WifiSetupService.1
            @Override // com.google.protobuf.Parser
            public WifiSetupService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = WifiSetupService.newBuilder();
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

        private WifiSetupService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WifiSetupService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_WifiSetupService_descriptor;
        }

        public static Builder newBuilder(WifiSetupService wifiSetupService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(wifiSetupService);
        }

        public static WifiSetupService parseDelimitedFrom(InputStream inputStream) {
            return (WifiSetupService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WifiSetupService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<WifiSetupService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WifiSetupService)) {
                return super.equals(obj);
            }
            WifiSetupService wifiSetupService = (WifiSetupService) obj;
            if (hasAccessPointScanRequest() != wifiSetupService.hasAccessPointScanRequest()) {
                return false;
            }
            if ((hasAccessPointScanRequest() && !getAccessPointScanRequest().equals(wifiSetupService.getAccessPointScanRequest())) || hasAccessPointScanResponse() != wifiSetupService.hasAccessPointScanResponse()) {
                return false;
            }
            if ((hasAccessPointScanResponse() && !getAccessPointScanResponse().equals(wifiSetupService.getAccessPointScanResponse())) || hasStoreAccessPointNotification() != wifiSetupService.hasStoreAccessPointNotification()) {
                return false;
            }
            if ((hasStoreAccessPointNotification() && !getStoreAccessPointNotification().equals(wifiSetupService.getStoreAccessPointNotification())) || hasVerifyConnectionRequest() != wifiSetupService.hasVerifyConnectionRequest()) {
                return false;
            }
            if ((hasVerifyConnectionRequest() && !getVerifyConnectionRequest().equals(wifiSetupService.getVerifyConnectionRequest())) || hasVerifyConnectionResponse() != wifiSetupService.hasVerifyConnectionResponse()) {
                return false;
            }
            if ((hasVerifyConnectionResponse() && !getVerifyConnectionResponse().equals(wifiSetupService.getVerifyConnectionResponse())) || hasOauthCredentialsRequest() != wifiSetupService.hasOauthCredentialsRequest()) {
                return false;
            }
            if ((hasOauthCredentialsRequest() && !getOauthCredentialsRequest().equals(wifiSetupService.getOauthCredentialsRequest())) || hasOauthCredentialsResponse() != wifiSetupService.hasOauthCredentialsResponse()) {
                return false;
            }
            if ((hasOauthCredentialsResponse() && !getOauthCredentialsResponse().equals(wifiSetupService.getOauthCredentialsResponse())) || hasAccessPointRequest() != wifiSetupService.hasAccessPointRequest()) {
                return false;
            }
            if ((hasAccessPointRequest() && !getAccessPointRequest().equals(wifiSetupService.getAccessPointRequest())) || hasAccessPointResponse() != wifiSetupService.hasAccessPointResponse()) {
                return false;
            }
            if ((hasAccessPointResponse() && !getAccessPointResponse().equals(wifiSetupService.getAccessPointResponse())) || hasAccessPointStartScanNotification() != wifiSetupService.hasAccessPointStartScanNotification()) {
                return false;
            }
            if ((hasAccessPointStartScanNotification() && !getAccessPointStartScanNotification().equals(wifiSetupService.getAccessPointStartScanNotification())) || hasAccessPointScanCompleteNotification() != wifiSetupService.hasAccessPointScanCompleteNotification()) {
                return false;
            }
            if ((hasAccessPointScanCompleteNotification() && !getAccessPointScanCompleteNotification().equals(wifiSetupService.getAccessPointScanCompleteNotification())) || hasVerifyConnectionNotification() != wifiSetupService.hasVerifyConnectionNotification()) {
                return false;
            }
            if ((hasVerifyConnectionNotification() && !getVerifyConnectionNotification().equals(wifiSetupService.getVerifyConnectionNotification())) || hasConnectionVerificationStatusNotification() != wifiSetupService.hasConnectionVerificationStatusNotification()) {
                return false;
            }
            if ((hasConnectionVerificationStatusNotification() && !getConnectionVerificationStatusNotification().equals(wifiSetupService.getConnectionVerificationStatusNotification())) || hasUpdateAccessPointRequest() != wifiSetupService.hasUpdateAccessPointRequest()) {
                return false;
            }
            if ((hasUpdateAccessPointRequest() && !getUpdateAccessPointRequest().equals(wifiSetupService.getUpdateAccessPointRequest())) || hasUpdateAccessPointResponse() != wifiSetupService.hasUpdateAccessPointResponse()) {
                return false;
            }
            if ((hasUpdateAccessPointResponse() && !getUpdateAccessPointResponse().equals(wifiSetupService.getUpdateAccessPointResponse())) || hasOauthCredentialsRequestWithAgentMsg() != wifiSetupService.hasOauthCredentialsRequestWithAgentMsg()) {
                return false;
            }
            if ((hasOauthCredentialsRequestWithAgentMsg() && !getOauthCredentialsRequestWithAgentMsg().equals(wifiSetupService.getOauthCredentialsRequestWithAgentMsg())) || hasOauthCredentialsResponseWithAgentMsg() != wifiSetupService.hasOauthCredentialsResponseWithAgentMsg()) {
                return false;
            }
            if ((hasOauthCredentialsResponseWithAgentMsg() && !getOauthCredentialsResponseWithAgentMsg().equals(wifiSetupService.getOauthCredentialsResponseWithAgentMsg())) || hasMobileCarrierInfoRequest() != wifiSetupService.hasMobileCarrierInfoRequest()) {
                return false;
            }
            if ((hasMobileCarrierInfoRequest() && !getMobileCarrierInfoRequest().equals(wifiSetupService.getMobileCarrierInfoRequest())) || hasMobileCarrierInfoResponse() != wifiSetupService.hasMobileCarrierInfoResponse()) {
                return false;
            }
            if ((hasMobileCarrierInfoResponse() && !getMobileCarrierInfoResponse().equals(wifiSetupService.getMobileCarrierInfoResponse())) || hasSwitchToApRequest() != wifiSetupService.hasSwitchToApRequest()) {
                return false;
            }
            if ((hasSwitchToApRequest() && !getSwitchToApRequest().equals(wifiSetupService.getSwitchToApRequest())) || hasSwitchToApResponse() != wifiSetupService.hasSwitchToApResponse()) {
                return false;
            }
            if ((hasSwitchToApResponse() && !getSwitchToApResponse().equals(wifiSetupService.getSwitchToApResponse())) || hasGetNetworkCredentialsRequest() != wifiSetupService.hasGetNetworkCredentialsRequest()) {
                return false;
            }
            if ((!hasGetNetworkCredentialsRequest() || getGetNetworkCredentialsRequest().equals(wifiSetupService.getGetNetworkCredentialsRequest())) && hasGetNetworkCredentialsResponse() == wifiSetupService.hasGetNetworkCredentialsResponse()) {
                return (!hasGetNetworkCredentialsResponse() || getGetNetworkCredentialsResponse().equals(wifiSetupService.getGetNetworkCredentialsResponse())) && getUnknownFields().equals(wifiSetupService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public StoredAccessPointRequest getAccessPointRequest() {
            StoredAccessPointRequest storedAccessPointRequest = this.accessPointRequest_;
            return storedAccessPointRequest == null ? StoredAccessPointRequest.getDefaultInstance() : storedAccessPointRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public StoredAccessPointRequestOrBuilder getAccessPointRequestOrBuilder() {
            StoredAccessPointRequest storedAccessPointRequest = this.accessPointRequest_;
            return storedAccessPointRequest == null ? StoredAccessPointRequest.getDefaultInstance() : storedAccessPointRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public StoredAccessPointResponse getAccessPointResponse() {
            StoredAccessPointResponse storedAccessPointResponse = this.accessPointResponse_;
            return storedAccessPointResponse == null ? StoredAccessPointResponse.getDefaultInstance() : storedAccessPointResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public StoredAccessPointResponseOrBuilder getAccessPointResponseOrBuilder() {
            StoredAccessPointResponse storedAccessPointResponse = this.accessPointResponse_;
            return storedAccessPointResponse == null ? StoredAccessPointResponse.getDefaultInstance() : storedAccessPointResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public AccessPointScanCompleteNotification getAccessPointScanCompleteNotification() {
            AccessPointScanCompleteNotification accessPointScanCompleteNotification = this.accessPointScanCompleteNotification_;
            return accessPointScanCompleteNotification == null ? AccessPointScanCompleteNotification.getDefaultInstance() : accessPointScanCompleteNotification;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public AccessPointScanCompleteNotificationOrBuilder getAccessPointScanCompleteNotificationOrBuilder() {
            AccessPointScanCompleteNotification accessPointScanCompleteNotification = this.accessPointScanCompleteNotification_;
            return accessPointScanCompleteNotification == null ? AccessPointScanCompleteNotification.getDefaultInstance() : accessPointScanCompleteNotification;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public AccessPointScanRequest getAccessPointScanRequest() {
            AccessPointScanRequest accessPointScanRequest = this.accessPointScanRequest_;
            return accessPointScanRequest == null ? AccessPointScanRequest.getDefaultInstance() : accessPointScanRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public AccessPointScanRequestOrBuilder getAccessPointScanRequestOrBuilder() {
            AccessPointScanRequest accessPointScanRequest = this.accessPointScanRequest_;
            return accessPointScanRequest == null ? AccessPointScanRequest.getDefaultInstance() : accessPointScanRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public AccessPointScanResponse getAccessPointScanResponse() {
            AccessPointScanResponse accessPointScanResponse = this.accessPointScanResponse_;
            return accessPointScanResponse == null ? AccessPointScanResponse.getDefaultInstance() : accessPointScanResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public AccessPointScanResponseOrBuilder getAccessPointScanResponseOrBuilder() {
            AccessPointScanResponse accessPointScanResponse = this.accessPointScanResponse_;
            return accessPointScanResponse == null ? AccessPointScanResponse.getDefaultInstance() : accessPointScanResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public AccessPointStartScanNotification getAccessPointStartScanNotification() {
            AccessPointStartScanNotification accessPointStartScanNotification = this.accessPointStartScanNotification_;
            return accessPointStartScanNotification == null ? AccessPointStartScanNotification.getDefaultInstance() : accessPointStartScanNotification;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public AccessPointStartScanNotificationOrBuilder getAccessPointStartScanNotificationOrBuilder() {
            AccessPointStartScanNotification accessPointStartScanNotification = this.accessPointStartScanNotification_;
            return accessPointStartScanNotification == null ? AccessPointStartScanNotification.getDefaultInstance() : accessPointStartScanNotification;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public ConnectionVerificationStatusNotification getConnectionVerificationStatusNotification() {
            ConnectionVerificationStatusNotification connectionVerificationStatusNotification = this.connectionVerificationStatusNotification_;
            return connectionVerificationStatusNotification == null ? ConnectionVerificationStatusNotification.getDefaultInstance() : connectionVerificationStatusNotification;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public ConnectionVerificationStatusNotificationOrBuilder getConnectionVerificationStatusNotificationOrBuilder() {
            ConnectionVerificationStatusNotification connectionVerificationStatusNotification = this.connectionVerificationStatusNotification_;
            return connectionVerificationStatusNotification == null ? ConnectionVerificationStatusNotification.getDefaultInstance() : connectionVerificationStatusNotification;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public GetNetworkCredentialsRequest getGetNetworkCredentialsRequest() {
            GetNetworkCredentialsRequest getNetworkCredentialsRequest = this.getNetworkCredentialsRequest_;
            return getNetworkCredentialsRequest == null ? GetNetworkCredentialsRequest.getDefaultInstance() : getNetworkCredentialsRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public GetNetworkCredentialsRequestOrBuilder getGetNetworkCredentialsRequestOrBuilder() {
            GetNetworkCredentialsRequest getNetworkCredentialsRequest = this.getNetworkCredentialsRequest_;
            return getNetworkCredentialsRequest == null ? GetNetworkCredentialsRequest.getDefaultInstance() : getNetworkCredentialsRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public GetNetworkCredentialsResponse getGetNetworkCredentialsResponse() {
            GetNetworkCredentialsResponse getNetworkCredentialsResponse = this.getNetworkCredentialsResponse_;
            return getNetworkCredentialsResponse == null ? GetNetworkCredentialsResponse.getDefaultInstance() : getNetworkCredentialsResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public GetNetworkCredentialsResponseOrBuilder getGetNetworkCredentialsResponseOrBuilder() {
            GetNetworkCredentialsResponse getNetworkCredentialsResponse = this.getNetworkCredentialsResponse_;
            return getNetworkCredentialsResponse == null ? GetNetworkCredentialsResponse.getDefaultInstance() : getNetworkCredentialsResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public MobileCarrierInfoRequest getMobileCarrierInfoRequest() {
            MobileCarrierInfoRequest mobileCarrierInfoRequest = this.mobileCarrierInfoRequest_;
            return mobileCarrierInfoRequest == null ? MobileCarrierInfoRequest.getDefaultInstance() : mobileCarrierInfoRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public MobileCarrierInfoRequestOrBuilder getMobileCarrierInfoRequestOrBuilder() {
            MobileCarrierInfoRequest mobileCarrierInfoRequest = this.mobileCarrierInfoRequest_;
            return mobileCarrierInfoRequest == null ? MobileCarrierInfoRequest.getDefaultInstance() : mobileCarrierInfoRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public MobileCarrierInfoResponse getMobileCarrierInfoResponse() {
            MobileCarrierInfoResponse mobileCarrierInfoResponse = this.mobileCarrierInfoResponse_;
            return mobileCarrierInfoResponse == null ? MobileCarrierInfoResponse.getDefaultInstance() : mobileCarrierInfoResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public MobileCarrierInfoResponseOrBuilder getMobileCarrierInfoResponseOrBuilder() {
            MobileCarrierInfoResponse mobileCarrierInfoResponse = this.mobileCarrierInfoResponse_;
            return mobileCarrierInfoResponse == null ? MobileCarrierInfoResponse.getDefaultInstance() : mobileCarrierInfoResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public OAuthCredentialsRequest getOauthCredentialsRequest() {
            OAuthCredentialsRequest oAuthCredentialsRequest = this.oauthCredentialsRequest_;
            return oAuthCredentialsRequest == null ? OAuthCredentialsRequest.getDefaultInstance() : oAuthCredentialsRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public OAuthCredentialsRequestOrBuilder getOauthCredentialsRequestOrBuilder() {
            OAuthCredentialsRequest oAuthCredentialsRequest = this.oauthCredentialsRequest_;
            return oAuthCredentialsRequest == null ? OAuthCredentialsRequest.getDefaultInstance() : oAuthCredentialsRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public OAuthCredentialsRequest getOauthCredentialsRequestWithAgentMsg() {
            OAuthCredentialsRequest oAuthCredentialsRequest = this.oauthCredentialsRequestWithAgentMsg_;
            return oAuthCredentialsRequest == null ? OAuthCredentialsRequest.getDefaultInstance() : oAuthCredentialsRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public OAuthCredentialsRequestOrBuilder getOauthCredentialsRequestWithAgentMsgOrBuilder() {
            OAuthCredentialsRequest oAuthCredentialsRequest = this.oauthCredentialsRequestWithAgentMsg_;
            return oAuthCredentialsRequest == null ? OAuthCredentialsRequest.getDefaultInstance() : oAuthCredentialsRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public OAuthCredentialsResponse getOauthCredentialsResponse() {
            OAuthCredentialsResponse oAuthCredentialsResponse = this.oauthCredentialsResponse_;
            return oAuthCredentialsResponse == null ? OAuthCredentialsResponse.getDefaultInstance() : oAuthCredentialsResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public OAuthCredentialsResponseOrBuilder getOauthCredentialsResponseOrBuilder() {
            OAuthCredentialsResponse oAuthCredentialsResponse = this.oauthCredentialsResponse_;
            return oAuthCredentialsResponse == null ? OAuthCredentialsResponse.getDefaultInstance() : oAuthCredentialsResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public OAuthCredentialsResponse getOauthCredentialsResponseWithAgentMsg() {
            OAuthCredentialsResponse oAuthCredentialsResponse = this.oauthCredentialsResponseWithAgentMsg_;
            return oAuthCredentialsResponse == null ? OAuthCredentialsResponse.getDefaultInstance() : oAuthCredentialsResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public OAuthCredentialsResponseOrBuilder getOauthCredentialsResponseWithAgentMsgOrBuilder() {
            OAuthCredentialsResponse oAuthCredentialsResponse = this.oauthCredentialsResponseWithAgentMsg_;
            return oAuthCredentialsResponse == null ? OAuthCredentialsResponse.getDefaultInstance() : oAuthCredentialsResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WifiSetupService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getAccessPointScanRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getAccessPointScanResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getStoreAccessPointNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getVerifyConnectionRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getVerifyConnectionResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getOauthCredentialsRequest());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getOauthCredentialsResponse());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getAccessPointRequest());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getAccessPointResponse());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getAccessPointStartScanNotification());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getAccessPointScanCompleteNotification());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getVerifyConnectionNotification());
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, getConnectionVerificationStatusNotification());
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(14, getUpdateAccessPointRequest());
            }
            if ((this.bitField0_ & 16384) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(15, getUpdateAccessPointResponse());
            }
            if ((this.bitField0_ & 32768) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(16, getOauthCredentialsRequestWithAgentMsg());
            }
            if ((this.bitField0_ & 65536) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(17, getOauthCredentialsResponseWithAgentMsg());
            }
            if ((this.bitField0_ & 131072) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(18, getMobileCarrierInfoRequest());
            }
            if ((this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(19, getMobileCarrierInfoResponse());
            }
            if ((this.bitField0_ & 524288) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(20, getSwitchToApRequest());
            }
            if ((this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(21, getSwitchToApResponse());
            }
            if ((this.bitField0_ & 2097152) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(22, getGetNetworkCredentialsRequest());
            }
            if ((this.bitField0_ & 4194304) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(23, getGetNetworkCredentialsResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public StoreAccessPointNotification getStoreAccessPointNotification() {
            StoreAccessPointNotification storeAccessPointNotification = this.storeAccessPointNotification_;
            return storeAccessPointNotification == null ? StoreAccessPointNotification.getDefaultInstance() : storeAccessPointNotification;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public StoreAccessPointNotificationOrBuilder getStoreAccessPointNotificationOrBuilder() {
            StoreAccessPointNotification storeAccessPointNotification = this.storeAccessPointNotification_;
            return storeAccessPointNotification == null ? StoreAccessPointNotification.getDefaultInstance() : storeAccessPointNotification;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public SwitchToApModeRequest getSwitchToApRequest() {
            SwitchToApModeRequest switchToApModeRequest = this.switchToApRequest_;
            return switchToApModeRequest == null ? SwitchToApModeRequest.getDefaultInstance() : switchToApModeRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public SwitchToApModeRequestOrBuilder getSwitchToApRequestOrBuilder() {
            SwitchToApModeRequest switchToApModeRequest = this.switchToApRequest_;
            return switchToApModeRequest == null ? SwitchToApModeRequest.getDefaultInstance() : switchToApModeRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public SwitchToApModeResponse getSwitchToApResponse() {
            SwitchToApModeResponse switchToApModeResponse = this.switchToApResponse_;
            return switchToApModeResponse == null ? SwitchToApModeResponse.getDefaultInstance() : switchToApModeResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public SwitchToApModeResponseOrBuilder getSwitchToApResponseOrBuilder() {
            SwitchToApModeResponse switchToApModeResponse = this.switchToApResponse_;
            return switchToApModeResponse == null ? SwitchToApModeResponse.getDefaultInstance() : switchToApModeResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public UpdateAccessPointRequest getUpdateAccessPointRequest() {
            UpdateAccessPointRequest updateAccessPointRequest = this.updateAccessPointRequest_;
            return updateAccessPointRequest == null ? UpdateAccessPointRequest.getDefaultInstance() : updateAccessPointRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public UpdateAccessPointRequestOrBuilder getUpdateAccessPointRequestOrBuilder() {
            UpdateAccessPointRequest updateAccessPointRequest = this.updateAccessPointRequest_;
            return updateAccessPointRequest == null ? UpdateAccessPointRequest.getDefaultInstance() : updateAccessPointRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public UpdateAccessPointResponse getUpdateAccessPointResponse() {
            UpdateAccessPointResponse updateAccessPointResponse = this.updateAccessPointResponse_;
            return updateAccessPointResponse == null ? UpdateAccessPointResponse.getDefaultInstance() : updateAccessPointResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public UpdateAccessPointResponseOrBuilder getUpdateAccessPointResponseOrBuilder() {
            UpdateAccessPointResponse updateAccessPointResponse = this.updateAccessPointResponse_;
            return updateAccessPointResponse == null ? UpdateAccessPointResponse.getDefaultInstance() : updateAccessPointResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public VerifyConnectionNotification getVerifyConnectionNotification() {
            VerifyConnectionNotification verifyConnectionNotification = this.verifyConnectionNotification_;
            return verifyConnectionNotification == null ? VerifyConnectionNotification.getDefaultInstance() : verifyConnectionNotification;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public VerifyConnectionNotificationOrBuilder getVerifyConnectionNotificationOrBuilder() {
            VerifyConnectionNotification verifyConnectionNotification = this.verifyConnectionNotification_;
            return verifyConnectionNotification == null ? VerifyConnectionNotification.getDefaultInstance() : verifyConnectionNotification;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public VerifyConnectionRequest getVerifyConnectionRequest() {
            VerifyConnectionRequest verifyConnectionRequest = this.verifyConnectionRequest_;
            return verifyConnectionRequest == null ? VerifyConnectionRequest.getDefaultInstance() : verifyConnectionRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public VerifyConnectionRequestOrBuilder getVerifyConnectionRequestOrBuilder() {
            VerifyConnectionRequest verifyConnectionRequest = this.verifyConnectionRequest_;
            return verifyConnectionRequest == null ? VerifyConnectionRequest.getDefaultInstance() : verifyConnectionRequest;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public VerifyConnectionResponse getVerifyConnectionResponse() {
            VerifyConnectionResponse verifyConnectionResponse = this.verifyConnectionResponse_;
            return verifyConnectionResponse == null ? VerifyConnectionResponse.getDefaultInstance() : verifyConnectionResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public VerifyConnectionResponseOrBuilder getVerifyConnectionResponseOrBuilder() {
            VerifyConnectionResponse verifyConnectionResponse = this.verifyConnectionResponse_;
            return verifyConnectionResponse == null ? VerifyConnectionResponse.getDefaultInstance() : verifyConnectionResponse;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasAccessPointRequest() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasAccessPointResponse() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasAccessPointScanCompleteNotification() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasAccessPointScanRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasAccessPointScanResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasAccessPointStartScanNotification() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasConnectionVerificationStatusNotification() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasGetNetworkCredentialsRequest() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasGetNetworkCredentialsResponse() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasMobileCarrierInfoRequest() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasMobileCarrierInfoResponse() {
            return (this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasOauthCredentialsRequest() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasOauthCredentialsRequestWithAgentMsg() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasOauthCredentialsResponse() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasOauthCredentialsResponseWithAgentMsg() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasStoreAccessPointNotification() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasSwitchToApRequest() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasSwitchToApResponse() {
            return (this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasUpdateAccessPointRequest() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasUpdateAccessPointResponse() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasVerifyConnectionNotification() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasVerifyConnectionRequest() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
        public boolean hasVerifyConnectionResponse() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAccessPointScanRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getAccessPointScanRequest().hashCode();
            }
            if (hasAccessPointScanResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getAccessPointScanResponse().hashCode();
            }
            if (hasStoreAccessPointNotification()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getStoreAccessPointNotification().hashCode();
            }
            if (hasVerifyConnectionRequest()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getVerifyConnectionRequest().hashCode();
            }
            if (hasVerifyConnectionResponse()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getVerifyConnectionResponse().hashCode();
            }
            if (hasOauthCredentialsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getOauthCredentialsRequest().hashCode();
            }
            if (hasOauthCredentialsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getOauthCredentialsResponse().hashCode();
            }
            if (hasAccessPointRequest()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getAccessPointRequest().hashCode();
            }
            if (hasAccessPointResponse()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getAccessPointResponse().hashCode();
            }
            if (hasAccessPointStartScanNotification()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getAccessPointStartScanNotification().hashCode();
            }
            if (hasAccessPointScanCompleteNotification()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getAccessPointScanCompleteNotification().hashCode();
            }
            if (hasVerifyConnectionNotification()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getVerifyConnectionNotification().hashCode();
            }
            if (hasConnectionVerificationStatusNotification()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getConnectionVerificationStatusNotification().hashCode();
            }
            if (hasUpdateAccessPointRequest()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + getUpdateAccessPointRequest().hashCode();
            }
            if (hasUpdateAccessPointResponse()) {
                iHashCode = e5.c(iHashCode, 37, 15, 53) + getUpdateAccessPointResponse().hashCode();
            }
            if (hasOauthCredentialsRequestWithAgentMsg()) {
                iHashCode = e5.c(iHashCode, 37, 16, 53) + getOauthCredentialsRequestWithAgentMsg().hashCode();
            }
            if (hasOauthCredentialsResponseWithAgentMsg()) {
                iHashCode = e5.c(iHashCode, 37, 17, 53) + getOauthCredentialsResponseWithAgentMsg().hashCode();
            }
            if (hasMobileCarrierInfoRequest()) {
                iHashCode = e5.c(iHashCode, 37, 18, 53) + getMobileCarrierInfoRequest().hashCode();
            }
            if (hasMobileCarrierInfoResponse()) {
                iHashCode = e5.c(iHashCode, 37, 19, 53) + getMobileCarrierInfoResponse().hashCode();
            }
            if (hasSwitchToApRequest()) {
                iHashCode = e5.c(iHashCode, 37, 20, 53) + getSwitchToApRequest().hashCode();
            }
            if (hasSwitchToApResponse()) {
                iHashCode = e5.c(iHashCode, 37, 21, 53) + getSwitchToApResponse().hashCode();
            }
            if (hasGetNetworkCredentialsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 22, 53) + getGetNetworkCredentialsRequest().hashCode();
            }
            if (hasGetNetworkCredentialsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 23, 53) + getGetNetworkCredentialsResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_WifiSetupService_fieldAccessorTable.ensureFieldAccessorsInitialized(WifiSetupService.class, Builder.class);
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
            if (hasAccessPointScanResponse() && !getAccessPointScanResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasStoreAccessPointNotification() && !getStoreAccessPointNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasVerifyConnectionResponse() && !getVerifyConnectionResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasOauthCredentialsResponse() && !getOauthCredentialsResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAccessPointResponse() && !getAccessPointResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAccessPointScanCompleteNotification() && !getAccessPointScanCompleteNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasVerifyConnectionNotification() && !getVerifyConnectionNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasConnectionVerificationStatusNotification() && !getConnectionVerificationStatusNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUpdateAccessPointRequest() && !getUpdateAccessPointRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUpdateAccessPointResponse() && !getUpdateAccessPointResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasOauthCredentialsResponseWithAgentMsg() || getOauthCredentialsResponseWithAgentMsg().isInitialized()) {
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
            return new WifiSetupService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getAccessPointScanRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getAccessPointScanResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getStoreAccessPointNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getVerifyConnectionRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getVerifyConnectionResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getOauthCredentialsRequest());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getOauthCredentialsResponse());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getAccessPointRequest());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getAccessPointResponse());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getAccessPointStartScanNotification());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getAccessPointScanCompleteNotification());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(12, getVerifyConnectionNotification());
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeMessage(13, getConnectionVerificationStatusNotification());
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeMessage(14, getUpdateAccessPointRequest());
            }
            if ((this.bitField0_ & 16384) != 0) {
                codedOutputStream.writeMessage(15, getUpdateAccessPointResponse());
            }
            if ((this.bitField0_ & 32768) != 0) {
                codedOutputStream.writeMessage(16, getOauthCredentialsRequestWithAgentMsg());
            }
            if ((this.bitField0_ & 65536) != 0) {
                codedOutputStream.writeMessage(17, getOauthCredentialsResponseWithAgentMsg());
            }
            if ((this.bitField0_ & 131072) != 0) {
                codedOutputStream.writeMessage(18, getMobileCarrierInfoRequest());
            }
            if ((this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                codedOutputStream.writeMessage(19, getMobileCarrierInfoResponse());
            }
            if ((this.bitField0_ & 524288) != 0) {
                codedOutputStream.writeMessage(20, getSwitchToApRequest());
            }
            if ((this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                codedOutputStream.writeMessage(21, getSwitchToApResponse());
            }
            if ((this.bitField0_ & 2097152) != 0) {
                codedOutputStream.writeMessage(22, getGetNetworkCredentialsRequest());
            }
            if ((this.bitField0_ & 4194304) != 0) {
                codedOutputStream.writeMessage(23, getGetNetworkCredentialsResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WifiSetupServiceOrBuilder {
            private SingleFieldBuilderV3<StoredAccessPointRequest, StoredAccessPointRequest.Builder, StoredAccessPointRequestOrBuilder> accessPointRequestBuilder_;
            private StoredAccessPointRequest accessPointRequest_;
            private SingleFieldBuilderV3<StoredAccessPointResponse, StoredAccessPointResponse.Builder, StoredAccessPointResponseOrBuilder> accessPointResponseBuilder_;
            private StoredAccessPointResponse accessPointResponse_;
            private SingleFieldBuilderV3<AccessPointScanCompleteNotification, AccessPointScanCompleteNotification.Builder, AccessPointScanCompleteNotificationOrBuilder> accessPointScanCompleteNotificationBuilder_;
            private AccessPointScanCompleteNotification accessPointScanCompleteNotification_;
            private SingleFieldBuilderV3<AccessPointScanRequest, AccessPointScanRequest.Builder, AccessPointScanRequestOrBuilder> accessPointScanRequestBuilder_;
            private AccessPointScanRequest accessPointScanRequest_;
            private SingleFieldBuilderV3<AccessPointScanResponse, AccessPointScanResponse.Builder, AccessPointScanResponseOrBuilder> accessPointScanResponseBuilder_;
            private AccessPointScanResponse accessPointScanResponse_;
            private SingleFieldBuilderV3<AccessPointStartScanNotification, AccessPointStartScanNotification.Builder, AccessPointStartScanNotificationOrBuilder> accessPointStartScanNotificationBuilder_;
            private AccessPointStartScanNotification accessPointStartScanNotification_;
            private int bitField0_;
            private SingleFieldBuilderV3<ConnectionVerificationStatusNotification, ConnectionVerificationStatusNotification.Builder, ConnectionVerificationStatusNotificationOrBuilder> connectionVerificationStatusNotificationBuilder_;
            private ConnectionVerificationStatusNotification connectionVerificationStatusNotification_;
            private SingleFieldBuilderV3<GetNetworkCredentialsRequest, GetNetworkCredentialsRequest.Builder, GetNetworkCredentialsRequestOrBuilder> getNetworkCredentialsRequestBuilder_;
            private GetNetworkCredentialsRequest getNetworkCredentialsRequest_;
            private SingleFieldBuilderV3<GetNetworkCredentialsResponse, GetNetworkCredentialsResponse.Builder, GetNetworkCredentialsResponseOrBuilder> getNetworkCredentialsResponseBuilder_;
            private GetNetworkCredentialsResponse getNetworkCredentialsResponse_;
            private SingleFieldBuilderV3<MobileCarrierInfoRequest, MobileCarrierInfoRequest.Builder, MobileCarrierInfoRequestOrBuilder> mobileCarrierInfoRequestBuilder_;
            private MobileCarrierInfoRequest mobileCarrierInfoRequest_;
            private SingleFieldBuilderV3<MobileCarrierInfoResponse, MobileCarrierInfoResponse.Builder, MobileCarrierInfoResponseOrBuilder> mobileCarrierInfoResponseBuilder_;
            private MobileCarrierInfoResponse mobileCarrierInfoResponse_;
            private SingleFieldBuilderV3<OAuthCredentialsRequest, OAuthCredentialsRequest.Builder, OAuthCredentialsRequestOrBuilder> oauthCredentialsRequestBuilder_;
            private SingleFieldBuilderV3<OAuthCredentialsRequest, OAuthCredentialsRequest.Builder, OAuthCredentialsRequestOrBuilder> oauthCredentialsRequestWithAgentMsgBuilder_;
            private OAuthCredentialsRequest oauthCredentialsRequestWithAgentMsg_;
            private OAuthCredentialsRequest oauthCredentialsRequest_;
            private SingleFieldBuilderV3<OAuthCredentialsResponse, OAuthCredentialsResponse.Builder, OAuthCredentialsResponseOrBuilder> oauthCredentialsResponseBuilder_;
            private SingleFieldBuilderV3<OAuthCredentialsResponse, OAuthCredentialsResponse.Builder, OAuthCredentialsResponseOrBuilder> oauthCredentialsResponseWithAgentMsgBuilder_;
            private OAuthCredentialsResponse oauthCredentialsResponseWithAgentMsg_;
            private OAuthCredentialsResponse oauthCredentialsResponse_;
            private SingleFieldBuilderV3<StoreAccessPointNotification, StoreAccessPointNotification.Builder, StoreAccessPointNotificationOrBuilder> storeAccessPointNotificationBuilder_;
            private StoreAccessPointNotification storeAccessPointNotification_;
            private SingleFieldBuilderV3<SwitchToApModeRequest, SwitchToApModeRequest.Builder, SwitchToApModeRequestOrBuilder> switchToApRequestBuilder_;
            private SwitchToApModeRequest switchToApRequest_;
            private SingleFieldBuilderV3<SwitchToApModeResponse, SwitchToApModeResponse.Builder, SwitchToApModeResponseOrBuilder> switchToApResponseBuilder_;
            private SwitchToApModeResponse switchToApResponse_;
            private SingleFieldBuilderV3<UpdateAccessPointRequest, UpdateAccessPointRequest.Builder, UpdateAccessPointRequestOrBuilder> updateAccessPointRequestBuilder_;
            private UpdateAccessPointRequest updateAccessPointRequest_;
            private SingleFieldBuilderV3<UpdateAccessPointResponse, UpdateAccessPointResponse.Builder, UpdateAccessPointResponseOrBuilder> updateAccessPointResponseBuilder_;
            private UpdateAccessPointResponse updateAccessPointResponse_;
            private SingleFieldBuilderV3<VerifyConnectionNotification, VerifyConnectionNotification.Builder, VerifyConnectionNotificationOrBuilder> verifyConnectionNotificationBuilder_;
            private VerifyConnectionNotification verifyConnectionNotification_;
            private SingleFieldBuilderV3<VerifyConnectionRequest, VerifyConnectionRequest.Builder, VerifyConnectionRequestOrBuilder> verifyConnectionRequestBuilder_;
            private VerifyConnectionRequest verifyConnectionRequest_;
            private SingleFieldBuilderV3<VerifyConnectionResponse, VerifyConnectionResponse.Builder, VerifyConnectionResponseOrBuilder> verifyConnectionResponseBuilder_;
            private VerifyConnectionResponse verifyConnectionResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(WifiSetupService wifiSetupService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<AccessPointScanRequest, AccessPointScanRequest.Builder, AccessPointScanRequestOrBuilder> singleFieldBuilderV3 = this.accessPointScanRequestBuilder_;
                    wifiSetupService.accessPointScanRequest_ = singleFieldBuilderV3 == null ? this.accessPointScanRequest_ : (AccessPointScanRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<AccessPointScanResponse, AccessPointScanResponse.Builder, AccessPointScanResponseOrBuilder> singleFieldBuilderV4 = this.accessPointScanResponseBuilder_;
                    wifiSetupService.accessPointScanResponse_ = singleFieldBuilderV4 == null ? this.accessPointScanResponse_ : (AccessPointScanResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<StoreAccessPointNotification, StoreAccessPointNotification.Builder, StoreAccessPointNotificationOrBuilder> singleFieldBuilderV5 = this.storeAccessPointNotificationBuilder_;
                    wifiSetupService.storeAccessPointNotification_ = singleFieldBuilderV5 == null ? this.storeAccessPointNotification_ : (StoreAccessPointNotification) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<VerifyConnectionRequest, VerifyConnectionRequest.Builder, VerifyConnectionRequestOrBuilder> singleFieldBuilderV6 = this.verifyConnectionRequestBuilder_;
                    wifiSetupService.verifyConnectionRequest_ = singleFieldBuilderV6 == null ? this.verifyConnectionRequest_ : (VerifyConnectionRequest) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<VerifyConnectionResponse, VerifyConnectionResponse.Builder, VerifyConnectionResponseOrBuilder> singleFieldBuilderV7 = this.verifyConnectionResponseBuilder_;
                    wifiSetupService.verifyConnectionResponse_ = singleFieldBuilderV7 == null ? this.verifyConnectionResponse_ : (VerifyConnectionResponse) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<OAuthCredentialsRequest, OAuthCredentialsRequest.Builder, OAuthCredentialsRequestOrBuilder> singleFieldBuilderV8 = this.oauthCredentialsRequestBuilder_;
                    wifiSetupService.oauthCredentialsRequest_ = singleFieldBuilderV8 == null ? this.oauthCredentialsRequest_ : (OAuthCredentialsRequest) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<OAuthCredentialsResponse, OAuthCredentialsResponse.Builder, OAuthCredentialsResponseOrBuilder> singleFieldBuilderV9 = this.oauthCredentialsResponseBuilder_;
                    wifiSetupService.oauthCredentialsResponse_ = singleFieldBuilderV9 == null ? this.oauthCredentialsResponse_ : (OAuthCredentialsResponse) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<StoredAccessPointRequest, StoredAccessPointRequest.Builder, StoredAccessPointRequestOrBuilder> singleFieldBuilderV10 = this.accessPointRequestBuilder_;
                    wifiSetupService.accessPointRequest_ = singleFieldBuilderV10 == null ? this.accessPointRequest_ : (StoredAccessPointRequest) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<StoredAccessPointResponse, StoredAccessPointResponse.Builder, StoredAccessPointResponseOrBuilder> singleFieldBuilderV11 = this.accessPointResponseBuilder_;
                    wifiSetupService.accessPointResponse_ = singleFieldBuilderV11 == null ? this.accessPointResponse_ : (StoredAccessPointResponse) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<AccessPointStartScanNotification, AccessPointStartScanNotification.Builder, AccessPointStartScanNotificationOrBuilder> singleFieldBuilderV12 = this.accessPointStartScanNotificationBuilder_;
                    wifiSetupService.accessPointStartScanNotification_ = singleFieldBuilderV12 == null ? this.accessPointStartScanNotification_ : (AccessPointStartScanNotification) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<AccessPointScanCompleteNotification, AccessPointScanCompleteNotification.Builder, AccessPointScanCompleteNotificationOrBuilder> singleFieldBuilderV13 = this.accessPointScanCompleteNotificationBuilder_;
                    wifiSetupService.accessPointScanCompleteNotification_ = singleFieldBuilderV13 == null ? this.accessPointScanCompleteNotification_ : (AccessPointScanCompleteNotification) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<VerifyConnectionNotification, VerifyConnectionNotification.Builder, VerifyConnectionNotificationOrBuilder> singleFieldBuilderV14 = this.verifyConnectionNotificationBuilder_;
                    wifiSetupService.verifyConnectionNotification_ = singleFieldBuilderV14 == null ? this.verifyConnectionNotification_ : (VerifyConnectionNotification) singleFieldBuilderV14.build();
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    SingleFieldBuilderV3<ConnectionVerificationStatusNotification, ConnectionVerificationStatusNotification.Builder, ConnectionVerificationStatusNotificationOrBuilder> singleFieldBuilderV15 = this.connectionVerificationStatusNotificationBuilder_;
                    wifiSetupService.connectionVerificationStatusNotification_ = singleFieldBuilderV15 == null ? this.connectionVerificationStatusNotification_ : (ConnectionVerificationStatusNotification) singleFieldBuilderV15.build();
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    SingleFieldBuilderV3<UpdateAccessPointRequest, UpdateAccessPointRequest.Builder, UpdateAccessPointRequestOrBuilder> singleFieldBuilderV16 = this.updateAccessPointRequestBuilder_;
                    wifiSetupService.updateAccessPointRequest_ = singleFieldBuilderV16 == null ? this.updateAccessPointRequest_ : (UpdateAccessPointRequest) singleFieldBuilderV16.build();
                    i14 |= 8192;
                }
                if ((i15 & 16384) != 0) {
                    SingleFieldBuilderV3<UpdateAccessPointResponse, UpdateAccessPointResponse.Builder, UpdateAccessPointResponseOrBuilder> singleFieldBuilderV17 = this.updateAccessPointResponseBuilder_;
                    wifiSetupService.updateAccessPointResponse_ = singleFieldBuilderV17 == null ? this.updateAccessPointResponse_ : (UpdateAccessPointResponse) singleFieldBuilderV17.build();
                    i14 |= 16384;
                }
                if ((i15 & 32768) != 0) {
                    SingleFieldBuilderV3<OAuthCredentialsRequest, OAuthCredentialsRequest.Builder, OAuthCredentialsRequestOrBuilder> singleFieldBuilderV18 = this.oauthCredentialsRequestWithAgentMsgBuilder_;
                    wifiSetupService.oauthCredentialsRequestWithAgentMsg_ = singleFieldBuilderV18 == null ? this.oauthCredentialsRequestWithAgentMsg_ : (OAuthCredentialsRequest) singleFieldBuilderV18.build();
                    i14 |= 32768;
                }
                if ((i15 & 65536) != 0) {
                    SingleFieldBuilderV3<OAuthCredentialsResponse, OAuthCredentialsResponse.Builder, OAuthCredentialsResponseOrBuilder> singleFieldBuilderV19 = this.oauthCredentialsResponseWithAgentMsgBuilder_;
                    wifiSetupService.oauthCredentialsResponseWithAgentMsg_ = singleFieldBuilderV19 == null ? this.oauthCredentialsResponseWithAgentMsg_ : (OAuthCredentialsResponse) singleFieldBuilderV19.build();
                    i14 |= 65536;
                }
                if ((i15 & 131072) != 0) {
                    SingleFieldBuilderV3<MobileCarrierInfoRequest, MobileCarrierInfoRequest.Builder, MobileCarrierInfoRequestOrBuilder> singleFieldBuilderV20 = this.mobileCarrierInfoRequestBuilder_;
                    wifiSetupService.mobileCarrierInfoRequest_ = singleFieldBuilderV20 == null ? this.mobileCarrierInfoRequest_ : (MobileCarrierInfoRequest) singleFieldBuilderV20.build();
                    i14 |= 131072;
                }
                if ((i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                    SingleFieldBuilderV3<MobileCarrierInfoResponse, MobileCarrierInfoResponse.Builder, MobileCarrierInfoResponseOrBuilder> singleFieldBuilderV21 = this.mobileCarrierInfoResponseBuilder_;
                    wifiSetupService.mobileCarrierInfoResponse_ = singleFieldBuilderV21 == null ? this.mobileCarrierInfoResponse_ : (MobileCarrierInfoResponse) singleFieldBuilderV21.build();
                    i14 |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                }
                if ((i15 & 524288) != 0) {
                    SingleFieldBuilderV3<SwitchToApModeRequest, SwitchToApModeRequest.Builder, SwitchToApModeRequestOrBuilder> singleFieldBuilderV22 = this.switchToApRequestBuilder_;
                    wifiSetupService.switchToApRequest_ = singleFieldBuilderV22 == null ? this.switchToApRequest_ : (SwitchToApModeRequest) singleFieldBuilderV22.build();
                    i14 |= 524288;
                }
                if ((i15 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                    SingleFieldBuilderV3<SwitchToApModeResponse, SwitchToApModeResponse.Builder, SwitchToApModeResponseOrBuilder> singleFieldBuilderV23 = this.switchToApResponseBuilder_;
                    wifiSetupService.switchToApResponse_ = singleFieldBuilderV23 == null ? this.switchToApResponse_ : (SwitchToApModeResponse) singleFieldBuilderV23.build();
                    i14 |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                }
                if ((i15 & 2097152) != 0) {
                    SingleFieldBuilderV3<GetNetworkCredentialsRequest, GetNetworkCredentialsRequest.Builder, GetNetworkCredentialsRequestOrBuilder> singleFieldBuilderV24 = this.getNetworkCredentialsRequestBuilder_;
                    wifiSetupService.getNetworkCredentialsRequest_ = singleFieldBuilderV24 == null ? this.getNetworkCredentialsRequest_ : (GetNetworkCredentialsRequest) singleFieldBuilderV24.build();
                    i14 |= 2097152;
                }
                if ((i15 & 4194304) != 0) {
                    SingleFieldBuilderV3<GetNetworkCredentialsResponse, GetNetworkCredentialsResponse.Builder, GetNetworkCredentialsResponseOrBuilder> singleFieldBuilderV25 = this.getNetworkCredentialsResponseBuilder_;
                    wifiSetupService.getNetworkCredentialsResponse_ = singleFieldBuilderV25 == null ? this.getNetworkCredentialsResponse_ : (GetNetworkCredentialsResponse) singleFieldBuilderV25.build();
                    i14 |= 4194304;
                }
                wifiSetupService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<StoredAccessPointRequest, StoredAccessPointRequest.Builder, StoredAccessPointRequestOrBuilder> getAccessPointRequestFieldBuilder() {
                if (this.accessPointRequestBuilder_ == null) {
                    this.accessPointRequestBuilder_ = new SingleFieldBuilderV3<>(getAccessPointRequest(), getParentForChildren(), isClean());
                    this.accessPointRequest_ = null;
                }
                return this.accessPointRequestBuilder_;
            }

            private SingleFieldBuilderV3<StoredAccessPointResponse, StoredAccessPointResponse.Builder, StoredAccessPointResponseOrBuilder> getAccessPointResponseFieldBuilder() {
                if (this.accessPointResponseBuilder_ == null) {
                    this.accessPointResponseBuilder_ = new SingleFieldBuilderV3<>(getAccessPointResponse(), getParentForChildren(), isClean());
                    this.accessPointResponse_ = null;
                }
                return this.accessPointResponseBuilder_;
            }

            private SingleFieldBuilderV3<AccessPointScanCompleteNotification, AccessPointScanCompleteNotification.Builder, AccessPointScanCompleteNotificationOrBuilder> getAccessPointScanCompleteNotificationFieldBuilder() {
                if (this.accessPointScanCompleteNotificationBuilder_ == null) {
                    this.accessPointScanCompleteNotificationBuilder_ = new SingleFieldBuilderV3<>(getAccessPointScanCompleteNotification(), getParentForChildren(), isClean());
                    this.accessPointScanCompleteNotification_ = null;
                }
                return this.accessPointScanCompleteNotificationBuilder_;
            }

            private SingleFieldBuilderV3<AccessPointScanRequest, AccessPointScanRequest.Builder, AccessPointScanRequestOrBuilder> getAccessPointScanRequestFieldBuilder() {
                if (this.accessPointScanRequestBuilder_ == null) {
                    this.accessPointScanRequestBuilder_ = new SingleFieldBuilderV3<>(getAccessPointScanRequest(), getParentForChildren(), isClean());
                    this.accessPointScanRequest_ = null;
                }
                return this.accessPointScanRequestBuilder_;
            }

            private SingleFieldBuilderV3<AccessPointScanResponse, AccessPointScanResponse.Builder, AccessPointScanResponseOrBuilder> getAccessPointScanResponseFieldBuilder() {
                if (this.accessPointScanResponseBuilder_ == null) {
                    this.accessPointScanResponseBuilder_ = new SingleFieldBuilderV3<>(getAccessPointScanResponse(), getParentForChildren(), isClean());
                    this.accessPointScanResponse_ = null;
                }
                return this.accessPointScanResponseBuilder_;
            }

            private SingleFieldBuilderV3<AccessPointStartScanNotification, AccessPointStartScanNotification.Builder, AccessPointStartScanNotificationOrBuilder> getAccessPointStartScanNotificationFieldBuilder() {
                if (this.accessPointStartScanNotificationBuilder_ == null) {
                    this.accessPointStartScanNotificationBuilder_ = new SingleFieldBuilderV3<>(getAccessPointStartScanNotification(), getParentForChildren(), isClean());
                    this.accessPointStartScanNotification_ = null;
                }
                return this.accessPointStartScanNotificationBuilder_;
            }

            private SingleFieldBuilderV3<ConnectionVerificationStatusNotification, ConnectionVerificationStatusNotification.Builder, ConnectionVerificationStatusNotificationOrBuilder> getConnectionVerificationStatusNotificationFieldBuilder() {
                if (this.connectionVerificationStatusNotificationBuilder_ == null) {
                    this.connectionVerificationStatusNotificationBuilder_ = new SingleFieldBuilderV3<>(getConnectionVerificationStatusNotification(), getParentForChildren(), isClean());
                    this.connectionVerificationStatusNotification_ = null;
                }
                return this.connectionVerificationStatusNotificationBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_WifiSetupService_descriptor;
            }

            private SingleFieldBuilderV3<GetNetworkCredentialsRequest, GetNetworkCredentialsRequest.Builder, GetNetworkCredentialsRequestOrBuilder> getGetNetworkCredentialsRequestFieldBuilder() {
                if (this.getNetworkCredentialsRequestBuilder_ == null) {
                    this.getNetworkCredentialsRequestBuilder_ = new SingleFieldBuilderV3<>(getGetNetworkCredentialsRequest(), getParentForChildren(), isClean());
                    this.getNetworkCredentialsRequest_ = null;
                }
                return this.getNetworkCredentialsRequestBuilder_;
            }

            private SingleFieldBuilderV3<GetNetworkCredentialsResponse, GetNetworkCredentialsResponse.Builder, GetNetworkCredentialsResponseOrBuilder> getGetNetworkCredentialsResponseFieldBuilder() {
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

            private SingleFieldBuilderV3<OAuthCredentialsRequest, OAuthCredentialsRequest.Builder, OAuthCredentialsRequestOrBuilder> getOauthCredentialsRequestFieldBuilder() {
                if (this.oauthCredentialsRequestBuilder_ == null) {
                    this.oauthCredentialsRequestBuilder_ = new SingleFieldBuilderV3<>(getOauthCredentialsRequest(), getParentForChildren(), isClean());
                    this.oauthCredentialsRequest_ = null;
                }
                return this.oauthCredentialsRequestBuilder_;
            }

            private SingleFieldBuilderV3<OAuthCredentialsRequest, OAuthCredentialsRequest.Builder, OAuthCredentialsRequestOrBuilder> getOauthCredentialsRequestWithAgentMsgFieldBuilder() {
                if (this.oauthCredentialsRequestWithAgentMsgBuilder_ == null) {
                    this.oauthCredentialsRequestWithAgentMsgBuilder_ = new SingleFieldBuilderV3<>(getOauthCredentialsRequestWithAgentMsg(), getParentForChildren(), isClean());
                    this.oauthCredentialsRequestWithAgentMsg_ = null;
                }
                return this.oauthCredentialsRequestWithAgentMsgBuilder_;
            }

            private SingleFieldBuilderV3<OAuthCredentialsResponse, OAuthCredentialsResponse.Builder, OAuthCredentialsResponseOrBuilder> getOauthCredentialsResponseFieldBuilder() {
                if (this.oauthCredentialsResponseBuilder_ == null) {
                    this.oauthCredentialsResponseBuilder_ = new SingleFieldBuilderV3<>(getOauthCredentialsResponse(), getParentForChildren(), isClean());
                    this.oauthCredentialsResponse_ = null;
                }
                return this.oauthCredentialsResponseBuilder_;
            }

            private SingleFieldBuilderV3<OAuthCredentialsResponse, OAuthCredentialsResponse.Builder, OAuthCredentialsResponseOrBuilder> getOauthCredentialsResponseWithAgentMsgFieldBuilder() {
                if (this.oauthCredentialsResponseWithAgentMsgBuilder_ == null) {
                    this.oauthCredentialsResponseWithAgentMsgBuilder_ = new SingleFieldBuilderV3<>(getOauthCredentialsResponseWithAgentMsg(), getParentForChildren(), isClean());
                    this.oauthCredentialsResponseWithAgentMsg_ = null;
                }
                return this.oauthCredentialsResponseWithAgentMsgBuilder_;
            }

            private SingleFieldBuilderV3<StoreAccessPointNotification, StoreAccessPointNotification.Builder, StoreAccessPointNotificationOrBuilder> getStoreAccessPointNotificationFieldBuilder() {
                if (this.storeAccessPointNotificationBuilder_ == null) {
                    this.storeAccessPointNotificationBuilder_ = new SingleFieldBuilderV3<>(getStoreAccessPointNotification(), getParentForChildren(), isClean());
                    this.storeAccessPointNotification_ = null;
                }
                return this.storeAccessPointNotificationBuilder_;
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

            private SingleFieldBuilderV3<UpdateAccessPointRequest, UpdateAccessPointRequest.Builder, UpdateAccessPointRequestOrBuilder> getUpdateAccessPointRequestFieldBuilder() {
                if (this.updateAccessPointRequestBuilder_ == null) {
                    this.updateAccessPointRequestBuilder_ = new SingleFieldBuilderV3<>(getUpdateAccessPointRequest(), getParentForChildren(), isClean());
                    this.updateAccessPointRequest_ = null;
                }
                return this.updateAccessPointRequestBuilder_;
            }

            private SingleFieldBuilderV3<UpdateAccessPointResponse, UpdateAccessPointResponse.Builder, UpdateAccessPointResponseOrBuilder> getUpdateAccessPointResponseFieldBuilder() {
                if (this.updateAccessPointResponseBuilder_ == null) {
                    this.updateAccessPointResponseBuilder_ = new SingleFieldBuilderV3<>(getUpdateAccessPointResponse(), getParentForChildren(), isClean());
                    this.updateAccessPointResponse_ = null;
                }
                return this.updateAccessPointResponseBuilder_;
            }

            private SingleFieldBuilderV3<VerifyConnectionNotification, VerifyConnectionNotification.Builder, VerifyConnectionNotificationOrBuilder> getVerifyConnectionNotificationFieldBuilder() {
                if (this.verifyConnectionNotificationBuilder_ == null) {
                    this.verifyConnectionNotificationBuilder_ = new SingleFieldBuilderV3<>(getVerifyConnectionNotification(), getParentForChildren(), isClean());
                    this.verifyConnectionNotification_ = null;
                }
                return this.verifyConnectionNotificationBuilder_;
            }

            private SingleFieldBuilderV3<VerifyConnectionRequest, VerifyConnectionRequest.Builder, VerifyConnectionRequestOrBuilder> getVerifyConnectionRequestFieldBuilder() {
                if (this.verifyConnectionRequestBuilder_ == null) {
                    this.verifyConnectionRequestBuilder_ = new SingleFieldBuilderV3<>(getVerifyConnectionRequest(), getParentForChildren(), isClean());
                    this.verifyConnectionRequest_ = null;
                }
                return this.verifyConnectionRequestBuilder_;
            }

            private SingleFieldBuilderV3<VerifyConnectionResponse, VerifyConnectionResponse.Builder, VerifyConnectionResponseOrBuilder> getVerifyConnectionResponseFieldBuilder() {
                if (this.verifyConnectionResponseBuilder_ == null) {
                    this.verifyConnectionResponseBuilder_ = new SingleFieldBuilderV3<>(getVerifyConnectionResponse(), getParentForChildren(), isClean());
                    this.verifyConnectionResponse_ = null;
                }
                return this.verifyConnectionResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getAccessPointScanRequestFieldBuilder();
                    getAccessPointScanResponseFieldBuilder();
                    getStoreAccessPointNotificationFieldBuilder();
                    getVerifyConnectionRequestFieldBuilder();
                    getVerifyConnectionResponseFieldBuilder();
                    getOauthCredentialsRequestFieldBuilder();
                    getOauthCredentialsResponseFieldBuilder();
                    getAccessPointRequestFieldBuilder();
                    getAccessPointResponseFieldBuilder();
                    getAccessPointStartScanNotificationFieldBuilder();
                    getAccessPointScanCompleteNotificationFieldBuilder();
                    getVerifyConnectionNotificationFieldBuilder();
                    getConnectionVerificationStatusNotificationFieldBuilder();
                    getUpdateAccessPointRequestFieldBuilder();
                    getUpdateAccessPointResponseFieldBuilder();
                    getOauthCredentialsRequestWithAgentMsgFieldBuilder();
                    getOauthCredentialsResponseWithAgentMsgFieldBuilder();
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
            public WifiSetupService build() {
                WifiSetupService wifiSetupServiceBuildPartial = buildPartial();
                if (wifiSetupServiceBuildPartial.isInitialized()) {
                    return wifiSetupServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) wifiSetupServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WifiSetupService buildPartial() {
                WifiSetupService wifiSetupService = new WifiSetupService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(wifiSetupService);
                }
                onBuilt();
                return wifiSetupService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.accessPointScanRequest_ = null;
                SingleFieldBuilderV3<AccessPointScanRequest, AccessPointScanRequest.Builder, AccessPointScanRequestOrBuilder> singleFieldBuilderV3 = this.accessPointScanRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.accessPointScanRequestBuilder_ = null;
                }
                this.accessPointScanResponse_ = null;
                SingleFieldBuilderV3<AccessPointScanResponse, AccessPointScanResponse.Builder, AccessPointScanResponseOrBuilder> singleFieldBuilderV4 = this.accessPointScanResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.accessPointScanResponseBuilder_ = null;
                }
                this.storeAccessPointNotification_ = null;
                SingleFieldBuilderV3<StoreAccessPointNotification, StoreAccessPointNotification.Builder, StoreAccessPointNotificationOrBuilder> singleFieldBuilderV5 = this.storeAccessPointNotificationBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.storeAccessPointNotificationBuilder_ = null;
                }
                this.verifyConnectionRequest_ = null;
                SingleFieldBuilderV3<VerifyConnectionRequest, VerifyConnectionRequest.Builder, VerifyConnectionRequestOrBuilder> singleFieldBuilderV6 = this.verifyConnectionRequestBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.verifyConnectionRequestBuilder_ = null;
                }
                this.verifyConnectionResponse_ = null;
                SingleFieldBuilderV3<VerifyConnectionResponse, VerifyConnectionResponse.Builder, VerifyConnectionResponseOrBuilder> singleFieldBuilderV7 = this.verifyConnectionResponseBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.verifyConnectionResponseBuilder_ = null;
                }
                this.oauthCredentialsRequest_ = null;
                SingleFieldBuilderV3<OAuthCredentialsRequest, OAuthCredentialsRequest.Builder, OAuthCredentialsRequestOrBuilder> singleFieldBuilderV8 = this.oauthCredentialsRequestBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.oauthCredentialsRequestBuilder_ = null;
                }
                this.oauthCredentialsResponse_ = null;
                SingleFieldBuilderV3<OAuthCredentialsResponse, OAuthCredentialsResponse.Builder, OAuthCredentialsResponseOrBuilder> singleFieldBuilderV9 = this.oauthCredentialsResponseBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.oauthCredentialsResponseBuilder_ = null;
                }
                this.accessPointRequest_ = null;
                SingleFieldBuilderV3<StoredAccessPointRequest, StoredAccessPointRequest.Builder, StoredAccessPointRequestOrBuilder> singleFieldBuilderV10 = this.accessPointRequestBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.accessPointRequestBuilder_ = null;
                }
                this.accessPointResponse_ = null;
                SingleFieldBuilderV3<StoredAccessPointResponse, StoredAccessPointResponse.Builder, StoredAccessPointResponseOrBuilder> singleFieldBuilderV11 = this.accessPointResponseBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.accessPointResponseBuilder_ = null;
                }
                this.accessPointStartScanNotification_ = null;
                SingleFieldBuilderV3<AccessPointStartScanNotification, AccessPointStartScanNotification.Builder, AccessPointStartScanNotificationOrBuilder> singleFieldBuilderV12 = this.accessPointStartScanNotificationBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.accessPointStartScanNotificationBuilder_ = null;
                }
                this.accessPointScanCompleteNotification_ = null;
                SingleFieldBuilderV3<AccessPointScanCompleteNotification, AccessPointScanCompleteNotification.Builder, AccessPointScanCompleteNotificationOrBuilder> singleFieldBuilderV13 = this.accessPointScanCompleteNotificationBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.accessPointScanCompleteNotificationBuilder_ = null;
                }
                this.verifyConnectionNotification_ = null;
                SingleFieldBuilderV3<VerifyConnectionNotification, VerifyConnectionNotification.Builder, VerifyConnectionNotificationOrBuilder> singleFieldBuilderV14 = this.verifyConnectionNotificationBuilder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.verifyConnectionNotificationBuilder_ = null;
                }
                this.connectionVerificationStatusNotification_ = null;
                SingleFieldBuilderV3<ConnectionVerificationStatusNotification, ConnectionVerificationStatusNotification.Builder, ConnectionVerificationStatusNotificationOrBuilder> singleFieldBuilderV15 = this.connectionVerificationStatusNotificationBuilder_;
                if (singleFieldBuilderV15 != null) {
                    singleFieldBuilderV15.dispose();
                    this.connectionVerificationStatusNotificationBuilder_ = null;
                }
                this.updateAccessPointRequest_ = null;
                SingleFieldBuilderV3<UpdateAccessPointRequest, UpdateAccessPointRequest.Builder, UpdateAccessPointRequestOrBuilder> singleFieldBuilderV16 = this.updateAccessPointRequestBuilder_;
                if (singleFieldBuilderV16 != null) {
                    singleFieldBuilderV16.dispose();
                    this.updateAccessPointRequestBuilder_ = null;
                }
                this.updateAccessPointResponse_ = null;
                SingleFieldBuilderV3<UpdateAccessPointResponse, UpdateAccessPointResponse.Builder, UpdateAccessPointResponseOrBuilder> singleFieldBuilderV17 = this.updateAccessPointResponseBuilder_;
                if (singleFieldBuilderV17 != null) {
                    singleFieldBuilderV17.dispose();
                    this.updateAccessPointResponseBuilder_ = null;
                }
                this.oauthCredentialsRequestWithAgentMsg_ = null;
                SingleFieldBuilderV3<OAuthCredentialsRequest, OAuthCredentialsRequest.Builder, OAuthCredentialsRequestOrBuilder> singleFieldBuilderV18 = this.oauthCredentialsRequestWithAgentMsgBuilder_;
                if (singleFieldBuilderV18 != null) {
                    singleFieldBuilderV18.dispose();
                    this.oauthCredentialsRequestWithAgentMsgBuilder_ = null;
                }
                this.oauthCredentialsResponseWithAgentMsg_ = null;
                SingleFieldBuilderV3<OAuthCredentialsResponse, OAuthCredentialsResponse.Builder, OAuthCredentialsResponseOrBuilder> singleFieldBuilderV19 = this.oauthCredentialsResponseWithAgentMsgBuilder_;
                if (singleFieldBuilderV19 != null) {
                    singleFieldBuilderV19.dispose();
                    this.oauthCredentialsResponseWithAgentMsgBuilder_ = null;
                }
                this.mobileCarrierInfoRequest_ = null;
                SingleFieldBuilderV3<MobileCarrierInfoRequest, MobileCarrierInfoRequest.Builder, MobileCarrierInfoRequestOrBuilder> singleFieldBuilderV20 = this.mobileCarrierInfoRequestBuilder_;
                if (singleFieldBuilderV20 != null) {
                    singleFieldBuilderV20.dispose();
                    this.mobileCarrierInfoRequestBuilder_ = null;
                }
                this.mobileCarrierInfoResponse_ = null;
                SingleFieldBuilderV3<MobileCarrierInfoResponse, MobileCarrierInfoResponse.Builder, MobileCarrierInfoResponseOrBuilder> singleFieldBuilderV21 = this.mobileCarrierInfoResponseBuilder_;
                if (singleFieldBuilderV21 != null) {
                    singleFieldBuilderV21.dispose();
                    this.mobileCarrierInfoResponseBuilder_ = null;
                }
                this.switchToApRequest_ = null;
                SingleFieldBuilderV3<SwitchToApModeRequest, SwitchToApModeRequest.Builder, SwitchToApModeRequestOrBuilder> singleFieldBuilderV22 = this.switchToApRequestBuilder_;
                if (singleFieldBuilderV22 != null) {
                    singleFieldBuilderV22.dispose();
                    this.switchToApRequestBuilder_ = null;
                }
                this.switchToApResponse_ = null;
                SingleFieldBuilderV3<SwitchToApModeResponse, SwitchToApModeResponse.Builder, SwitchToApModeResponseOrBuilder> singleFieldBuilderV23 = this.switchToApResponseBuilder_;
                if (singleFieldBuilderV23 != null) {
                    singleFieldBuilderV23.dispose();
                    this.switchToApResponseBuilder_ = null;
                }
                this.getNetworkCredentialsRequest_ = null;
                SingleFieldBuilderV3<GetNetworkCredentialsRequest, GetNetworkCredentialsRequest.Builder, GetNetworkCredentialsRequestOrBuilder> singleFieldBuilderV24 = this.getNetworkCredentialsRequestBuilder_;
                if (singleFieldBuilderV24 != null) {
                    singleFieldBuilderV24.dispose();
                    this.getNetworkCredentialsRequestBuilder_ = null;
                }
                this.getNetworkCredentialsResponse_ = null;
                SingleFieldBuilderV3<GetNetworkCredentialsResponse, GetNetworkCredentialsResponse.Builder, GetNetworkCredentialsResponseOrBuilder> singleFieldBuilderV25 = this.getNetworkCredentialsResponseBuilder_;
                if (singleFieldBuilderV25 != null) {
                    singleFieldBuilderV25.dispose();
                    this.getNetworkCredentialsResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearAccessPointRequest() {
                this.bitField0_ &= -129;
                this.accessPointRequest_ = null;
                SingleFieldBuilderV3<StoredAccessPointRequest, StoredAccessPointRequest.Builder, StoredAccessPointRequestOrBuilder> singleFieldBuilderV3 = this.accessPointRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.accessPointRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearAccessPointResponse() {
                this.bitField0_ &= -257;
                this.accessPointResponse_ = null;
                SingleFieldBuilderV3<StoredAccessPointResponse, StoredAccessPointResponse.Builder, StoredAccessPointResponseOrBuilder> singleFieldBuilderV3 = this.accessPointResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.accessPointResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearAccessPointScanCompleteNotification() {
                this.bitField0_ &= -1025;
                this.accessPointScanCompleteNotification_ = null;
                SingleFieldBuilderV3<AccessPointScanCompleteNotification, AccessPointScanCompleteNotification.Builder, AccessPointScanCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.accessPointScanCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.accessPointScanCompleteNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearAccessPointScanRequest() {
                this.bitField0_ &= -2;
                this.accessPointScanRequest_ = null;
                SingleFieldBuilderV3<AccessPointScanRequest, AccessPointScanRequest.Builder, AccessPointScanRequestOrBuilder> singleFieldBuilderV3 = this.accessPointScanRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.accessPointScanRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearAccessPointScanResponse() {
                this.bitField0_ &= -3;
                this.accessPointScanResponse_ = null;
                SingleFieldBuilderV3<AccessPointScanResponse, AccessPointScanResponse.Builder, AccessPointScanResponseOrBuilder> singleFieldBuilderV3 = this.accessPointScanResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.accessPointScanResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearAccessPointStartScanNotification() {
                this.bitField0_ &= -513;
                this.accessPointStartScanNotification_ = null;
                SingleFieldBuilderV3<AccessPointStartScanNotification, AccessPointStartScanNotification.Builder, AccessPointStartScanNotificationOrBuilder> singleFieldBuilderV3 = this.accessPointStartScanNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.accessPointStartScanNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConnectionVerificationStatusNotification() {
                this.bitField0_ &= -4097;
                this.connectionVerificationStatusNotification_ = null;
                SingleFieldBuilderV3<ConnectionVerificationStatusNotification, ConnectionVerificationStatusNotification.Builder, ConnectionVerificationStatusNotificationOrBuilder> singleFieldBuilderV3 = this.connectionVerificationStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectionVerificationStatusNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGetNetworkCredentialsRequest() {
                this.bitField0_ &= -2097153;
                this.getNetworkCredentialsRequest_ = null;
                SingleFieldBuilderV3<GetNetworkCredentialsRequest, GetNetworkCredentialsRequest.Builder, GetNetworkCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getNetworkCredentialsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearGetNetworkCredentialsResponse() {
                this.bitField0_ &= -4194305;
                this.getNetworkCredentialsResponse_ = null;
                SingleFieldBuilderV3<GetNetworkCredentialsResponse, GetNetworkCredentialsResponse.Builder, GetNetworkCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getNetworkCredentialsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearMobileCarrierInfoRequest() {
                this.bitField0_ &= -131073;
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
                this.bitField0_ &= -262145;
                this.mobileCarrierInfoResponse_ = null;
                SingleFieldBuilderV3<MobileCarrierInfoResponse, MobileCarrierInfoResponse.Builder, MobileCarrierInfoResponseOrBuilder> singleFieldBuilderV3 = this.mobileCarrierInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.mobileCarrierInfoResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearOauthCredentialsRequest() {
                this.bitField0_ &= -33;
                this.oauthCredentialsRequest_ = null;
                SingleFieldBuilderV3<OAuthCredentialsRequest, OAuthCredentialsRequest.Builder, OAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.oauthCredentialsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearOauthCredentialsRequestWithAgentMsg() {
                this.bitField0_ &= -32769;
                this.oauthCredentialsRequestWithAgentMsg_ = null;
                SingleFieldBuilderV3<OAuthCredentialsRequest, OAuthCredentialsRequest.Builder, OAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsRequestWithAgentMsgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.oauthCredentialsRequestWithAgentMsgBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearOauthCredentialsResponse() {
                this.bitField0_ &= -65;
                this.oauthCredentialsResponse_ = null;
                SingleFieldBuilderV3<OAuthCredentialsResponse, OAuthCredentialsResponse.Builder, OAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.oauthCredentialsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearOauthCredentialsResponseWithAgentMsg() {
                this.bitField0_ &= -65537;
                this.oauthCredentialsResponseWithAgentMsg_ = null;
                SingleFieldBuilderV3<OAuthCredentialsResponse, OAuthCredentialsResponse.Builder, OAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsResponseWithAgentMsgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.oauthCredentialsResponseWithAgentMsgBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStoreAccessPointNotification() {
                this.bitField0_ &= -5;
                this.storeAccessPointNotification_ = null;
                SingleFieldBuilderV3<StoreAccessPointNotification, StoreAccessPointNotification.Builder, StoreAccessPointNotificationOrBuilder> singleFieldBuilderV3 = this.storeAccessPointNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.storeAccessPointNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSwitchToApRequest() {
                this.bitField0_ &= -524289;
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
                this.bitField0_ &= -1048577;
                this.switchToApResponse_ = null;
                SingleFieldBuilderV3<SwitchToApModeResponse, SwitchToApModeResponse.Builder, SwitchToApModeResponseOrBuilder> singleFieldBuilderV3 = this.switchToApResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.switchToApResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUpdateAccessPointRequest() {
                this.bitField0_ &= -8193;
                this.updateAccessPointRequest_ = null;
                SingleFieldBuilderV3<UpdateAccessPointRequest, UpdateAccessPointRequest.Builder, UpdateAccessPointRequestOrBuilder> singleFieldBuilderV3 = this.updateAccessPointRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.updateAccessPointRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUpdateAccessPointResponse() {
                this.bitField0_ &= -16385;
                this.updateAccessPointResponse_ = null;
                SingleFieldBuilderV3<UpdateAccessPointResponse, UpdateAccessPointResponse.Builder, UpdateAccessPointResponseOrBuilder> singleFieldBuilderV3 = this.updateAccessPointResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.updateAccessPointResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearVerifyConnectionNotification() {
                this.bitField0_ &= -2049;
                this.verifyConnectionNotification_ = null;
                SingleFieldBuilderV3<VerifyConnectionNotification, VerifyConnectionNotification.Builder, VerifyConnectionNotificationOrBuilder> singleFieldBuilderV3 = this.verifyConnectionNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.verifyConnectionNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearVerifyConnectionRequest() {
                this.bitField0_ &= -9;
                this.verifyConnectionRequest_ = null;
                SingleFieldBuilderV3<VerifyConnectionRequest, VerifyConnectionRequest.Builder, VerifyConnectionRequestOrBuilder> singleFieldBuilderV3 = this.verifyConnectionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.verifyConnectionRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearVerifyConnectionResponse() {
                this.bitField0_ &= -17;
                this.verifyConnectionResponse_ = null;
                SingleFieldBuilderV3<VerifyConnectionResponse, VerifyConnectionResponse.Builder, VerifyConnectionResponseOrBuilder> singleFieldBuilderV3 = this.verifyConnectionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.verifyConnectionResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public StoredAccessPointRequest getAccessPointRequest() {
                SingleFieldBuilderV3<StoredAccessPointRequest, StoredAccessPointRequest.Builder, StoredAccessPointRequestOrBuilder> singleFieldBuilderV3 = this.accessPointRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StoredAccessPointRequest) singleFieldBuilderV3.getMessage();
                }
                StoredAccessPointRequest storedAccessPointRequest = this.accessPointRequest_;
                return storedAccessPointRequest == null ? StoredAccessPointRequest.getDefaultInstance() : storedAccessPointRequest;
            }

            public StoredAccessPointRequest.Builder getAccessPointRequestBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (StoredAccessPointRequest.Builder) getAccessPointRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public StoredAccessPointRequestOrBuilder getAccessPointRequestOrBuilder() {
                SingleFieldBuilderV3<StoredAccessPointRequest, StoredAccessPointRequest.Builder, StoredAccessPointRequestOrBuilder> singleFieldBuilderV3 = this.accessPointRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StoredAccessPointRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StoredAccessPointRequest storedAccessPointRequest = this.accessPointRequest_;
                return storedAccessPointRequest == null ? StoredAccessPointRequest.getDefaultInstance() : storedAccessPointRequest;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public StoredAccessPointResponse getAccessPointResponse() {
                SingleFieldBuilderV3<StoredAccessPointResponse, StoredAccessPointResponse.Builder, StoredAccessPointResponseOrBuilder> singleFieldBuilderV3 = this.accessPointResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StoredAccessPointResponse) singleFieldBuilderV3.getMessage();
                }
                StoredAccessPointResponse storedAccessPointResponse = this.accessPointResponse_;
                return storedAccessPointResponse == null ? StoredAccessPointResponse.getDefaultInstance() : storedAccessPointResponse;
            }

            public StoredAccessPointResponse.Builder getAccessPointResponseBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (StoredAccessPointResponse.Builder) getAccessPointResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public StoredAccessPointResponseOrBuilder getAccessPointResponseOrBuilder() {
                SingleFieldBuilderV3<StoredAccessPointResponse, StoredAccessPointResponse.Builder, StoredAccessPointResponseOrBuilder> singleFieldBuilderV3 = this.accessPointResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StoredAccessPointResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StoredAccessPointResponse storedAccessPointResponse = this.accessPointResponse_;
                return storedAccessPointResponse == null ? StoredAccessPointResponse.getDefaultInstance() : storedAccessPointResponse;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public AccessPointScanCompleteNotification getAccessPointScanCompleteNotification() {
                SingleFieldBuilderV3<AccessPointScanCompleteNotification, AccessPointScanCompleteNotification.Builder, AccessPointScanCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.accessPointScanCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AccessPointScanCompleteNotification) singleFieldBuilderV3.getMessage();
                }
                AccessPointScanCompleteNotification accessPointScanCompleteNotification = this.accessPointScanCompleteNotification_;
                return accessPointScanCompleteNotification == null ? AccessPointScanCompleteNotification.getDefaultInstance() : accessPointScanCompleteNotification;
            }

            public AccessPointScanCompleteNotification.Builder getAccessPointScanCompleteNotificationBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (AccessPointScanCompleteNotification.Builder) getAccessPointScanCompleteNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public AccessPointScanCompleteNotificationOrBuilder getAccessPointScanCompleteNotificationOrBuilder() {
                SingleFieldBuilderV3<AccessPointScanCompleteNotification, AccessPointScanCompleteNotification.Builder, AccessPointScanCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.accessPointScanCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AccessPointScanCompleteNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AccessPointScanCompleteNotification accessPointScanCompleteNotification = this.accessPointScanCompleteNotification_;
                return accessPointScanCompleteNotification == null ? AccessPointScanCompleteNotification.getDefaultInstance() : accessPointScanCompleteNotification;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public AccessPointScanRequest getAccessPointScanRequest() {
                SingleFieldBuilderV3<AccessPointScanRequest, AccessPointScanRequest.Builder, AccessPointScanRequestOrBuilder> singleFieldBuilderV3 = this.accessPointScanRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AccessPointScanRequest) singleFieldBuilderV3.getMessage();
                }
                AccessPointScanRequest accessPointScanRequest = this.accessPointScanRequest_;
                return accessPointScanRequest == null ? AccessPointScanRequest.getDefaultInstance() : accessPointScanRequest;
            }

            public AccessPointScanRequest.Builder getAccessPointScanRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (AccessPointScanRequest.Builder) getAccessPointScanRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public AccessPointScanRequestOrBuilder getAccessPointScanRequestOrBuilder() {
                SingleFieldBuilderV3<AccessPointScanRequest, AccessPointScanRequest.Builder, AccessPointScanRequestOrBuilder> singleFieldBuilderV3 = this.accessPointScanRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AccessPointScanRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AccessPointScanRequest accessPointScanRequest = this.accessPointScanRequest_;
                return accessPointScanRequest == null ? AccessPointScanRequest.getDefaultInstance() : accessPointScanRequest;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public AccessPointScanResponse getAccessPointScanResponse() {
                SingleFieldBuilderV3<AccessPointScanResponse, AccessPointScanResponse.Builder, AccessPointScanResponseOrBuilder> singleFieldBuilderV3 = this.accessPointScanResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AccessPointScanResponse) singleFieldBuilderV3.getMessage();
                }
                AccessPointScanResponse accessPointScanResponse = this.accessPointScanResponse_;
                return accessPointScanResponse == null ? AccessPointScanResponse.getDefaultInstance() : accessPointScanResponse;
            }

            public AccessPointScanResponse.Builder getAccessPointScanResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (AccessPointScanResponse.Builder) getAccessPointScanResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public AccessPointScanResponseOrBuilder getAccessPointScanResponseOrBuilder() {
                SingleFieldBuilderV3<AccessPointScanResponse, AccessPointScanResponse.Builder, AccessPointScanResponseOrBuilder> singleFieldBuilderV3 = this.accessPointScanResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AccessPointScanResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AccessPointScanResponse accessPointScanResponse = this.accessPointScanResponse_;
                return accessPointScanResponse == null ? AccessPointScanResponse.getDefaultInstance() : accessPointScanResponse;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public AccessPointStartScanNotification getAccessPointStartScanNotification() {
                SingleFieldBuilderV3<AccessPointStartScanNotification, AccessPointStartScanNotification.Builder, AccessPointStartScanNotificationOrBuilder> singleFieldBuilderV3 = this.accessPointStartScanNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AccessPointStartScanNotification) singleFieldBuilderV3.getMessage();
                }
                AccessPointStartScanNotification accessPointStartScanNotification = this.accessPointStartScanNotification_;
                return accessPointStartScanNotification == null ? AccessPointStartScanNotification.getDefaultInstance() : accessPointStartScanNotification;
            }

            public AccessPointStartScanNotification.Builder getAccessPointStartScanNotificationBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (AccessPointStartScanNotification.Builder) getAccessPointStartScanNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public AccessPointStartScanNotificationOrBuilder getAccessPointStartScanNotificationOrBuilder() {
                SingleFieldBuilderV3<AccessPointStartScanNotification, AccessPointStartScanNotification.Builder, AccessPointStartScanNotificationOrBuilder> singleFieldBuilderV3 = this.accessPointStartScanNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AccessPointStartScanNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AccessPointStartScanNotification accessPointStartScanNotification = this.accessPointStartScanNotification_;
                return accessPointStartScanNotification == null ? AccessPointStartScanNotification.getDefaultInstance() : accessPointStartScanNotification;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public ConnectionVerificationStatusNotification getConnectionVerificationStatusNotification() {
                SingleFieldBuilderV3<ConnectionVerificationStatusNotification, ConnectionVerificationStatusNotification.Builder, ConnectionVerificationStatusNotificationOrBuilder> singleFieldBuilderV3 = this.connectionVerificationStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectionVerificationStatusNotification) singleFieldBuilderV3.getMessage();
                }
                ConnectionVerificationStatusNotification connectionVerificationStatusNotification = this.connectionVerificationStatusNotification_;
                return connectionVerificationStatusNotification == null ? ConnectionVerificationStatusNotification.getDefaultInstance() : connectionVerificationStatusNotification;
            }

            public ConnectionVerificationStatusNotification.Builder getConnectionVerificationStatusNotificationBuilder() {
                this.bitField0_ |= 4096;
                onChanged();
                return (ConnectionVerificationStatusNotification.Builder) getConnectionVerificationStatusNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public ConnectionVerificationStatusNotificationOrBuilder getConnectionVerificationStatusNotificationOrBuilder() {
                SingleFieldBuilderV3<ConnectionVerificationStatusNotification, ConnectionVerificationStatusNotification.Builder, ConnectionVerificationStatusNotificationOrBuilder> singleFieldBuilderV3 = this.connectionVerificationStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectionVerificationStatusNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectionVerificationStatusNotification connectionVerificationStatusNotification = this.connectionVerificationStatusNotification_;
                return connectionVerificationStatusNotification == null ? ConnectionVerificationStatusNotification.getDefaultInstance() : connectionVerificationStatusNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_WifiSetupService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public GetNetworkCredentialsRequest getGetNetworkCredentialsRequest() {
                SingleFieldBuilderV3<GetNetworkCredentialsRequest, GetNetworkCredentialsRequest.Builder, GetNetworkCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetNetworkCredentialsRequest) singleFieldBuilderV3.getMessage();
                }
                GetNetworkCredentialsRequest getNetworkCredentialsRequest = this.getNetworkCredentialsRequest_;
                return getNetworkCredentialsRequest == null ? GetNetworkCredentialsRequest.getDefaultInstance() : getNetworkCredentialsRequest;
            }

            public GetNetworkCredentialsRequest.Builder getGetNetworkCredentialsRequestBuilder() {
                this.bitField0_ |= 2097152;
                onChanged();
                return (GetNetworkCredentialsRequest.Builder) getGetNetworkCredentialsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public GetNetworkCredentialsRequestOrBuilder getGetNetworkCredentialsRequestOrBuilder() {
                SingleFieldBuilderV3<GetNetworkCredentialsRequest, GetNetworkCredentialsRequest.Builder, GetNetworkCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetNetworkCredentialsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetNetworkCredentialsRequest getNetworkCredentialsRequest = this.getNetworkCredentialsRequest_;
                return getNetworkCredentialsRequest == null ? GetNetworkCredentialsRequest.getDefaultInstance() : getNetworkCredentialsRequest;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public GetNetworkCredentialsResponse getGetNetworkCredentialsResponse() {
                SingleFieldBuilderV3<GetNetworkCredentialsResponse, GetNetworkCredentialsResponse.Builder, GetNetworkCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetNetworkCredentialsResponse) singleFieldBuilderV3.getMessage();
                }
                GetNetworkCredentialsResponse getNetworkCredentialsResponse = this.getNetworkCredentialsResponse_;
                return getNetworkCredentialsResponse == null ? GetNetworkCredentialsResponse.getDefaultInstance() : getNetworkCredentialsResponse;
            }

            public GetNetworkCredentialsResponse.Builder getGetNetworkCredentialsResponseBuilder() {
                this.bitField0_ |= 4194304;
                onChanged();
                return (GetNetworkCredentialsResponse.Builder) getGetNetworkCredentialsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public GetNetworkCredentialsResponseOrBuilder getGetNetworkCredentialsResponseOrBuilder() {
                SingleFieldBuilderV3<GetNetworkCredentialsResponse, GetNetworkCredentialsResponse.Builder, GetNetworkCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetNetworkCredentialsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetNetworkCredentialsResponse getNetworkCredentialsResponse = this.getNetworkCredentialsResponse_;
                return getNetworkCredentialsResponse == null ? GetNetworkCredentialsResponse.getDefaultInstance() : getNetworkCredentialsResponse;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public MobileCarrierInfoRequest getMobileCarrierInfoRequest() {
                SingleFieldBuilderV3<MobileCarrierInfoRequest, MobileCarrierInfoRequest.Builder, MobileCarrierInfoRequestOrBuilder> singleFieldBuilderV3 = this.mobileCarrierInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MobileCarrierInfoRequest) singleFieldBuilderV3.getMessage();
                }
                MobileCarrierInfoRequest mobileCarrierInfoRequest = this.mobileCarrierInfoRequest_;
                return mobileCarrierInfoRequest == null ? MobileCarrierInfoRequest.getDefaultInstance() : mobileCarrierInfoRequest;
            }

            public MobileCarrierInfoRequest.Builder getMobileCarrierInfoRequestBuilder() {
                this.bitField0_ |= 131072;
                onChanged();
                return (MobileCarrierInfoRequest.Builder) getMobileCarrierInfoRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public MobileCarrierInfoRequestOrBuilder getMobileCarrierInfoRequestOrBuilder() {
                SingleFieldBuilderV3<MobileCarrierInfoRequest, MobileCarrierInfoRequest.Builder, MobileCarrierInfoRequestOrBuilder> singleFieldBuilderV3 = this.mobileCarrierInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MobileCarrierInfoRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                MobileCarrierInfoRequest mobileCarrierInfoRequest = this.mobileCarrierInfoRequest_;
                return mobileCarrierInfoRequest == null ? MobileCarrierInfoRequest.getDefaultInstance() : mobileCarrierInfoRequest;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public MobileCarrierInfoResponse getMobileCarrierInfoResponse() {
                SingleFieldBuilderV3<MobileCarrierInfoResponse, MobileCarrierInfoResponse.Builder, MobileCarrierInfoResponseOrBuilder> singleFieldBuilderV3 = this.mobileCarrierInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MobileCarrierInfoResponse) singleFieldBuilderV3.getMessage();
                }
                MobileCarrierInfoResponse mobileCarrierInfoResponse = this.mobileCarrierInfoResponse_;
                return mobileCarrierInfoResponse == null ? MobileCarrierInfoResponse.getDefaultInstance() : mobileCarrierInfoResponse;
            }

            public MobileCarrierInfoResponse.Builder getMobileCarrierInfoResponseBuilder() {
                this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                onChanged();
                return (MobileCarrierInfoResponse.Builder) getMobileCarrierInfoResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public MobileCarrierInfoResponseOrBuilder getMobileCarrierInfoResponseOrBuilder() {
                SingleFieldBuilderV3<MobileCarrierInfoResponse, MobileCarrierInfoResponse.Builder, MobileCarrierInfoResponseOrBuilder> singleFieldBuilderV3 = this.mobileCarrierInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MobileCarrierInfoResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                MobileCarrierInfoResponse mobileCarrierInfoResponse = this.mobileCarrierInfoResponse_;
                return mobileCarrierInfoResponse == null ? MobileCarrierInfoResponse.getDefaultInstance() : mobileCarrierInfoResponse;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public OAuthCredentialsRequest getOauthCredentialsRequest() {
                SingleFieldBuilderV3<OAuthCredentialsRequest, OAuthCredentialsRequest.Builder, OAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OAuthCredentialsRequest) singleFieldBuilderV3.getMessage();
                }
                OAuthCredentialsRequest oAuthCredentialsRequest = this.oauthCredentialsRequest_;
                return oAuthCredentialsRequest == null ? OAuthCredentialsRequest.getDefaultInstance() : oAuthCredentialsRequest;
            }

            public OAuthCredentialsRequest.Builder getOauthCredentialsRequestBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (OAuthCredentialsRequest.Builder) getOauthCredentialsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public OAuthCredentialsRequestOrBuilder getOauthCredentialsRequestOrBuilder() {
                SingleFieldBuilderV3<OAuthCredentialsRequest, OAuthCredentialsRequest.Builder, OAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OAuthCredentialsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                OAuthCredentialsRequest oAuthCredentialsRequest = this.oauthCredentialsRequest_;
                return oAuthCredentialsRequest == null ? OAuthCredentialsRequest.getDefaultInstance() : oAuthCredentialsRequest;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public OAuthCredentialsRequest getOauthCredentialsRequestWithAgentMsg() {
                SingleFieldBuilderV3<OAuthCredentialsRequest, OAuthCredentialsRequest.Builder, OAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsRequestWithAgentMsgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OAuthCredentialsRequest) singleFieldBuilderV3.getMessage();
                }
                OAuthCredentialsRequest oAuthCredentialsRequest = this.oauthCredentialsRequestWithAgentMsg_;
                return oAuthCredentialsRequest == null ? OAuthCredentialsRequest.getDefaultInstance() : oAuthCredentialsRequest;
            }

            public OAuthCredentialsRequest.Builder getOauthCredentialsRequestWithAgentMsgBuilder() {
                this.bitField0_ |= 32768;
                onChanged();
                return (OAuthCredentialsRequest.Builder) getOauthCredentialsRequestWithAgentMsgFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public OAuthCredentialsRequestOrBuilder getOauthCredentialsRequestWithAgentMsgOrBuilder() {
                SingleFieldBuilderV3<OAuthCredentialsRequest, OAuthCredentialsRequest.Builder, OAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsRequestWithAgentMsgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OAuthCredentialsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                OAuthCredentialsRequest oAuthCredentialsRequest = this.oauthCredentialsRequestWithAgentMsg_;
                return oAuthCredentialsRequest == null ? OAuthCredentialsRequest.getDefaultInstance() : oAuthCredentialsRequest;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public OAuthCredentialsResponse getOauthCredentialsResponse() {
                SingleFieldBuilderV3<OAuthCredentialsResponse, OAuthCredentialsResponse.Builder, OAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OAuthCredentialsResponse) singleFieldBuilderV3.getMessage();
                }
                OAuthCredentialsResponse oAuthCredentialsResponse = this.oauthCredentialsResponse_;
                return oAuthCredentialsResponse == null ? OAuthCredentialsResponse.getDefaultInstance() : oAuthCredentialsResponse;
            }

            public OAuthCredentialsResponse.Builder getOauthCredentialsResponseBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (OAuthCredentialsResponse.Builder) getOauthCredentialsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public OAuthCredentialsResponseOrBuilder getOauthCredentialsResponseOrBuilder() {
                SingleFieldBuilderV3<OAuthCredentialsResponse, OAuthCredentialsResponse.Builder, OAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OAuthCredentialsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                OAuthCredentialsResponse oAuthCredentialsResponse = this.oauthCredentialsResponse_;
                return oAuthCredentialsResponse == null ? OAuthCredentialsResponse.getDefaultInstance() : oAuthCredentialsResponse;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public OAuthCredentialsResponse getOauthCredentialsResponseWithAgentMsg() {
                SingleFieldBuilderV3<OAuthCredentialsResponse, OAuthCredentialsResponse.Builder, OAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsResponseWithAgentMsgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OAuthCredentialsResponse) singleFieldBuilderV3.getMessage();
                }
                OAuthCredentialsResponse oAuthCredentialsResponse = this.oauthCredentialsResponseWithAgentMsg_;
                return oAuthCredentialsResponse == null ? OAuthCredentialsResponse.getDefaultInstance() : oAuthCredentialsResponse;
            }

            public OAuthCredentialsResponse.Builder getOauthCredentialsResponseWithAgentMsgBuilder() {
                this.bitField0_ |= 65536;
                onChanged();
                return (OAuthCredentialsResponse.Builder) getOauthCredentialsResponseWithAgentMsgFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public OAuthCredentialsResponseOrBuilder getOauthCredentialsResponseWithAgentMsgOrBuilder() {
                SingleFieldBuilderV3<OAuthCredentialsResponse, OAuthCredentialsResponse.Builder, OAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsResponseWithAgentMsgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OAuthCredentialsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                OAuthCredentialsResponse oAuthCredentialsResponse = this.oauthCredentialsResponseWithAgentMsg_;
                return oAuthCredentialsResponse == null ? OAuthCredentialsResponse.getDefaultInstance() : oAuthCredentialsResponse;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public StoreAccessPointNotification getStoreAccessPointNotification() {
                SingleFieldBuilderV3<StoreAccessPointNotification, StoreAccessPointNotification.Builder, StoreAccessPointNotificationOrBuilder> singleFieldBuilderV3 = this.storeAccessPointNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StoreAccessPointNotification) singleFieldBuilderV3.getMessage();
                }
                StoreAccessPointNotification storeAccessPointNotification = this.storeAccessPointNotification_;
                return storeAccessPointNotification == null ? StoreAccessPointNotification.getDefaultInstance() : storeAccessPointNotification;
            }

            public StoreAccessPointNotification.Builder getStoreAccessPointNotificationBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (StoreAccessPointNotification.Builder) getStoreAccessPointNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public StoreAccessPointNotificationOrBuilder getStoreAccessPointNotificationOrBuilder() {
                SingleFieldBuilderV3<StoreAccessPointNotification, StoreAccessPointNotification.Builder, StoreAccessPointNotificationOrBuilder> singleFieldBuilderV3 = this.storeAccessPointNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StoreAccessPointNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StoreAccessPointNotification storeAccessPointNotification = this.storeAccessPointNotification_;
                return storeAccessPointNotification == null ? StoreAccessPointNotification.getDefaultInstance() : storeAccessPointNotification;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public SwitchToApModeRequest getSwitchToApRequest() {
                SingleFieldBuilderV3<SwitchToApModeRequest, SwitchToApModeRequest.Builder, SwitchToApModeRequestOrBuilder> singleFieldBuilderV3 = this.switchToApRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitchToApModeRequest) singleFieldBuilderV3.getMessage();
                }
                SwitchToApModeRequest switchToApModeRequest = this.switchToApRequest_;
                return switchToApModeRequest == null ? SwitchToApModeRequest.getDefaultInstance() : switchToApModeRequest;
            }

            public SwitchToApModeRequest.Builder getSwitchToApRequestBuilder() {
                this.bitField0_ |= 524288;
                onChanged();
                return (SwitchToApModeRequest.Builder) getSwitchToApRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public SwitchToApModeRequestOrBuilder getSwitchToApRequestOrBuilder() {
                SingleFieldBuilderV3<SwitchToApModeRequest, SwitchToApModeRequest.Builder, SwitchToApModeRequestOrBuilder> singleFieldBuilderV3 = this.switchToApRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitchToApModeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SwitchToApModeRequest switchToApModeRequest = this.switchToApRequest_;
                return switchToApModeRequest == null ? SwitchToApModeRequest.getDefaultInstance() : switchToApModeRequest;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public SwitchToApModeResponse getSwitchToApResponse() {
                SingleFieldBuilderV3<SwitchToApModeResponse, SwitchToApModeResponse.Builder, SwitchToApModeResponseOrBuilder> singleFieldBuilderV3 = this.switchToApResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitchToApModeResponse) singleFieldBuilderV3.getMessage();
                }
                SwitchToApModeResponse switchToApModeResponse = this.switchToApResponse_;
                return switchToApModeResponse == null ? SwitchToApModeResponse.getDefaultInstance() : switchToApModeResponse;
            }

            public SwitchToApModeResponse.Builder getSwitchToApResponseBuilder() {
                this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                onChanged();
                return (SwitchToApModeResponse.Builder) getSwitchToApResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public SwitchToApModeResponseOrBuilder getSwitchToApResponseOrBuilder() {
                SingleFieldBuilderV3<SwitchToApModeResponse, SwitchToApModeResponse.Builder, SwitchToApModeResponseOrBuilder> singleFieldBuilderV3 = this.switchToApResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitchToApModeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SwitchToApModeResponse switchToApModeResponse = this.switchToApResponse_;
                return switchToApModeResponse == null ? SwitchToApModeResponse.getDefaultInstance() : switchToApModeResponse;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public UpdateAccessPointRequest getUpdateAccessPointRequest() {
                SingleFieldBuilderV3<UpdateAccessPointRequest, UpdateAccessPointRequest.Builder, UpdateAccessPointRequestOrBuilder> singleFieldBuilderV3 = this.updateAccessPointRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateAccessPointRequest) singleFieldBuilderV3.getMessage();
                }
                UpdateAccessPointRequest updateAccessPointRequest = this.updateAccessPointRequest_;
                return updateAccessPointRequest == null ? UpdateAccessPointRequest.getDefaultInstance() : updateAccessPointRequest;
            }

            public UpdateAccessPointRequest.Builder getUpdateAccessPointRequestBuilder() {
                this.bitField0_ |= 8192;
                onChanged();
                return (UpdateAccessPointRequest.Builder) getUpdateAccessPointRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public UpdateAccessPointRequestOrBuilder getUpdateAccessPointRequestOrBuilder() {
                SingleFieldBuilderV3<UpdateAccessPointRequest, UpdateAccessPointRequest.Builder, UpdateAccessPointRequestOrBuilder> singleFieldBuilderV3 = this.updateAccessPointRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateAccessPointRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UpdateAccessPointRequest updateAccessPointRequest = this.updateAccessPointRequest_;
                return updateAccessPointRequest == null ? UpdateAccessPointRequest.getDefaultInstance() : updateAccessPointRequest;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public UpdateAccessPointResponse getUpdateAccessPointResponse() {
                SingleFieldBuilderV3<UpdateAccessPointResponse, UpdateAccessPointResponse.Builder, UpdateAccessPointResponseOrBuilder> singleFieldBuilderV3 = this.updateAccessPointResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateAccessPointResponse) singleFieldBuilderV3.getMessage();
                }
                UpdateAccessPointResponse updateAccessPointResponse = this.updateAccessPointResponse_;
                return updateAccessPointResponse == null ? UpdateAccessPointResponse.getDefaultInstance() : updateAccessPointResponse;
            }

            public UpdateAccessPointResponse.Builder getUpdateAccessPointResponseBuilder() {
                this.bitField0_ |= 16384;
                onChanged();
                return (UpdateAccessPointResponse.Builder) getUpdateAccessPointResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public UpdateAccessPointResponseOrBuilder getUpdateAccessPointResponseOrBuilder() {
                SingleFieldBuilderV3<UpdateAccessPointResponse, UpdateAccessPointResponse.Builder, UpdateAccessPointResponseOrBuilder> singleFieldBuilderV3 = this.updateAccessPointResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateAccessPointResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UpdateAccessPointResponse updateAccessPointResponse = this.updateAccessPointResponse_;
                return updateAccessPointResponse == null ? UpdateAccessPointResponse.getDefaultInstance() : updateAccessPointResponse;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public VerifyConnectionNotification getVerifyConnectionNotification() {
                SingleFieldBuilderV3<VerifyConnectionNotification, VerifyConnectionNotification.Builder, VerifyConnectionNotificationOrBuilder> singleFieldBuilderV3 = this.verifyConnectionNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VerifyConnectionNotification) singleFieldBuilderV3.getMessage();
                }
                VerifyConnectionNotification verifyConnectionNotification = this.verifyConnectionNotification_;
                return verifyConnectionNotification == null ? VerifyConnectionNotification.getDefaultInstance() : verifyConnectionNotification;
            }

            public VerifyConnectionNotification.Builder getVerifyConnectionNotificationBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (VerifyConnectionNotification.Builder) getVerifyConnectionNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public VerifyConnectionNotificationOrBuilder getVerifyConnectionNotificationOrBuilder() {
                SingleFieldBuilderV3<VerifyConnectionNotification, VerifyConnectionNotification.Builder, VerifyConnectionNotificationOrBuilder> singleFieldBuilderV3 = this.verifyConnectionNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VerifyConnectionNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                VerifyConnectionNotification verifyConnectionNotification = this.verifyConnectionNotification_;
                return verifyConnectionNotification == null ? VerifyConnectionNotification.getDefaultInstance() : verifyConnectionNotification;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public VerifyConnectionRequest getVerifyConnectionRequest() {
                SingleFieldBuilderV3<VerifyConnectionRequest, VerifyConnectionRequest.Builder, VerifyConnectionRequestOrBuilder> singleFieldBuilderV3 = this.verifyConnectionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VerifyConnectionRequest) singleFieldBuilderV3.getMessage();
                }
                VerifyConnectionRequest verifyConnectionRequest = this.verifyConnectionRequest_;
                return verifyConnectionRequest == null ? VerifyConnectionRequest.getDefaultInstance() : verifyConnectionRequest;
            }

            public VerifyConnectionRequest.Builder getVerifyConnectionRequestBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (VerifyConnectionRequest.Builder) getVerifyConnectionRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public VerifyConnectionRequestOrBuilder getVerifyConnectionRequestOrBuilder() {
                SingleFieldBuilderV3<VerifyConnectionRequest, VerifyConnectionRequest.Builder, VerifyConnectionRequestOrBuilder> singleFieldBuilderV3 = this.verifyConnectionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VerifyConnectionRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                VerifyConnectionRequest verifyConnectionRequest = this.verifyConnectionRequest_;
                return verifyConnectionRequest == null ? VerifyConnectionRequest.getDefaultInstance() : verifyConnectionRequest;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public VerifyConnectionResponse getVerifyConnectionResponse() {
                SingleFieldBuilderV3<VerifyConnectionResponse, VerifyConnectionResponse.Builder, VerifyConnectionResponseOrBuilder> singleFieldBuilderV3 = this.verifyConnectionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VerifyConnectionResponse) singleFieldBuilderV3.getMessage();
                }
                VerifyConnectionResponse verifyConnectionResponse = this.verifyConnectionResponse_;
                return verifyConnectionResponse == null ? VerifyConnectionResponse.getDefaultInstance() : verifyConnectionResponse;
            }

            public VerifyConnectionResponse.Builder getVerifyConnectionResponseBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (VerifyConnectionResponse.Builder) getVerifyConnectionResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public VerifyConnectionResponseOrBuilder getVerifyConnectionResponseOrBuilder() {
                SingleFieldBuilderV3<VerifyConnectionResponse, VerifyConnectionResponse.Builder, VerifyConnectionResponseOrBuilder> singleFieldBuilderV3 = this.verifyConnectionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VerifyConnectionResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                VerifyConnectionResponse verifyConnectionResponse = this.verifyConnectionResponse_;
                return verifyConnectionResponse == null ? VerifyConnectionResponse.getDefaultInstance() : verifyConnectionResponse;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasAccessPointRequest() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasAccessPointResponse() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasAccessPointScanCompleteNotification() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasAccessPointScanRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasAccessPointScanResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasAccessPointStartScanNotification() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasConnectionVerificationStatusNotification() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasGetNetworkCredentialsRequest() {
                return (this.bitField0_ & 2097152) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasGetNetworkCredentialsResponse() {
                return (this.bitField0_ & 4194304) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasMobileCarrierInfoRequest() {
                return (this.bitField0_ & 131072) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasMobileCarrierInfoResponse() {
                return (this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasOauthCredentialsRequest() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasOauthCredentialsRequestWithAgentMsg() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasOauthCredentialsResponse() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasOauthCredentialsResponseWithAgentMsg() {
                return (this.bitField0_ & 65536) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasStoreAccessPointNotification() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasSwitchToApRequest() {
                return (this.bitField0_ & 524288) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasSwitchToApResponse() {
                return (this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasUpdateAccessPointRequest() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasUpdateAccessPointResponse() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasVerifyConnectionNotification() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasVerifyConnectionRequest() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWifiSetup.WifiSetupServiceOrBuilder
            public boolean hasVerifyConnectionResponse() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWifiSetup.internal_static_GDI_Proto_WifiSetup_WifiSetupService_fieldAccessorTable.ensureFieldAccessorsInitialized(WifiSetupService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasAccessPointScanResponse() && !getAccessPointScanResponse().isInitialized()) {
                    return false;
                }
                if (hasStoreAccessPointNotification() && !getStoreAccessPointNotification().isInitialized()) {
                    return false;
                }
                if (hasVerifyConnectionResponse() && !getVerifyConnectionResponse().isInitialized()) {
                    return false;
                }
                if (hasOauthCredentialsResponse() && !getOauthCredentialsResponse().isInitialized()) {
                    return false;
                }
                if (hasAccessPointResponse() && !getAccessPointResponse().isInitialized()) {
                    return false;
                }
                if (hasAccessPointScanCompleteNotification() && !getAccessPointScanCompleteNotification().isInitialized()) {
                    return false;
                }
                if (hasVerifyConnectionNotification() && !getVerifyConnectionNotification().isInitialized()) {
                    return false;
                }
                if (hasConnectionVerificationStatusNotification() && !getConnectionVerificationStatusNotification().isInitialized()) {
                    return false;
                }
                if (hasUpdateAccessPointRequest() && !getUpdateAccessPointRequest().isInitialized()) {
                    return false;
                }
                if (!hasUpdateAccessPointResponse() || getUpdateAccessPointResponse().isInitialized()) {
                    return !hasOauthCredentialsResponseWithAgentMsg() || getOauthCredentialsResponseWithAgentMsg().isInitialized();
                }
                return false;
            }

            public Builder mergeAccessPointRequest(StoredAccessPointRequest storedAccessPointRequest) {
                StoredAccessPointRequest storedAccessPointRequest2;
                SingleFieldBuilderV3<StoredAccessPointRequest, StoredAccessPointRequest.Builder, StoredAccessPointRequestOrBuilder> singleFieldBuilderV3 = this.accessPointRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(storedAccessPointRequest);
                } else if ((this.bitField0_ & 128) == 0 || (storedAccessPointRequest2 = this.accessPointRequest_) == null || storedAccessPointRequest2 == StoredAccessPointRequest.getDefaultInstance()) {
                    this.accessPointRequest_ = storedAccessPointRequest;
                } else {
                    getAccessPointRequestBuilder().mergeFrom(storedAccessPointRequest);
                }
                if (this.accessPointRequest_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeAccessPointResponse(StoredAccessPointResponse storedAccessPointResponse) {
                StoredAccessPointResponse storedAccessPointResponse2;
                SingleFieldBuilderV3<StoredAccessPointResponse, StoredAccessPointResponse.Builder, StoredAccessPointResponseOrBuilder> singleFieldBuilderV3 = this.accessPointResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(storedAccessPointResponse);
                } else if ((this.bitField0_ & 256) == 0 || (storedAccessPointResponse2 = this.accessPointResponse_) == null || storedAccessPointResponse2 == StoredAccessPointResponse.getDefaultInstance()) {
                    this.accessPointResponse_ = storedAccessPointResponse;
                } else {
                    getAccessPointResponseBuilder().mergeFrom(storedAccessPointResponse);
                }
                if (this.accessPointResponse_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeAccessPointScanCompleteNotification(AccessPointScanCompleteNotification accessPointScanCompleteNotification) {
                AccessPointScanCompleteNotification accessPointScanCompleteNotification2;
                SingleFieldBuilderV3<AccessPointScanCompleteNotification, AccessPointScanCompleteNotification.Builder, AccessPointScanCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.accessPointScanCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(accessPointScanCompleteNotification);
                } else if ((this.bitField0_ & 1024) == 0 || (accessPointScanCompleteNotification2 = this.accessPointScanCompleteNotification_) == null || accessPointScanCompleteNotification2 == AccessPointScanCompleteNotification.getDefaultInstance()) {
                    this.accessPointScanCompleteNotification_ = accessPointScanCompleteNotification;
                } else {
                    getAccessPointScanCompleteNotificationBuilder().mergeFrom(accessPointScanCompleteNotification);
                }
                if (this.accessPointScanCompleteNotification_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeAccessPointScanRequest(AccessPointScanRequest accessPointScanRequest) {
                AccessPointScanRequest accessPointScanRequest2;
                SingleFieldBuilderV3<AccessPointScanRequest, AccessPointScanRequest.Builder, AccessPointScanRequestOrBuilder> singleFieldBuilderV3 = this.accessPointScanRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(accessPointScanRequest);
                } else if ((this.bitField0_ & 1) == 0 || (accessPointScanRequest2 = this.accessPointScanRequest_) == null || accessPointScanRequest2 == AccessPointScanRequest.getDefaultInstance()) {
                    this.accessPointScanRequest_ = accessPointScanRequest;
                } else {
                    getAccessPointScanRequestBuilder().mergeFrom(accessPointScanRequest);
                }
                if (this.accessPointScanRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeAccessPointScanResponse(AccessPointScanResponse accessPointScanResponse) {
                AccessPointScanResponse accessPointScanResponse2;
                SingleFieldBuilderV3<AccessPointScanResponse, AccessPointScanResponse.Builder, AccessPointScanResponseOrBuilder> singleFieldBuilderV3 = this.accessPointScanResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(accessPointScanResponse);
                } else if ((this.bitField0_ & 2) == 0 || (accessPointScanResponse2 = this.accessPointScanResponse_) == null || accessPointScanResponse2 == AccessPointScanResponse.getDefaultInstance()) {
                    this.accessPointScanResponse_ = accessPointScanResponse;
                } else {
                    getAccessPointScanResponseBuilder().mergeFrom(accessPointScanResponse);
                }
                if (this.accessPointScanResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeAccessPointStartScanNotification(AccessPointStartScanNotification accessPointStartScanNotification) {
                AccessPointStartScanNotification accessPointStartScanNotification2;
                SingleFieldBuilderV3<AccessPointStartScanNotification, AccessPointStartScanNotification.Builder, AccessPointStartScanNotificationOrBuilder> singleFieldBuilderV3 = this.accessPointStartScanNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(accessPointStartScanNotification);
                } else if ((this.bitField0_ & 512) == 0 || (accessPointStartScanNotification2 = this.accessPointStartScanNotification_) == null || accessPointStartScanNotification2 == AccessPointStartScanNotification.getDefaultInstance()) {
                    this.accessPointStartScanNotification_ = accessPointStartScanNotification;
                } else {
                    getAccessPointStartScanNotificationBuilder().mergeFrom(accessPointStartScanNotification);
                }
                if (this.accessPointStartScanNotification_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConnectionVerificationStatusNotification(ConnectionVerificationStatusNotification connectionVerificationStatusNotification) {
                ConnectionVerificationStatusNotification connectionVerificationStatusNotification2;
                SingleFieldBuilderV3<ConnectionVerificationStatusNotification, ConnectionVerificationStatusNotification.Builder, ConnectionVerificationStatusNotificationOrBuilder> singleFieldBuilderV3 = this.connectionVerificationStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectionVerificationStatusNotification);
                } else if ((this.bitField0_ & 4096) == 0 || (connectionVerificationStatusNotification2 = this.connectionVerificationStatusNotification_) == null || connectionVerificationStatusNotification2 == ConnectionVerificationStatusNotification.getDefaultInstance()) {
                    this.connectionVerificationStatusNotification_ = connectionVerificationStatusNotification;
                } else {
                    getConnectionVerificationStatusNotificationBuilder().mergeFrom(connectionVerificationStatusNotification);
                }
                if (this.connectionVerificationStatusNotification_ != null) {
                    this.bitField0_ |= 4096;
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
                                    codedInputStream.readMessage(getAccessPointScanRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getAccessPointScanResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getStoreAccessPointNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getVerifyConnectionRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getVerifyConnectionResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getOauthCredentialsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getOauthCredentialsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getAccessPointRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getAccessPointResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getAccessPointStartScanNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getAccessPointScanCompleteNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 98:
                                    codedInputStream.readMessage(getVerifyConnectionNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 106:
                                    codedInputStream.readMessage(getConnectionVerificationStatusNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 114:
                                    codedInputStream.readMessage(getUpdateAccessPointRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8192;
                                    continue;
                                case 122:
                                    codedInputStream.readMessage(getUpdateAccessPointResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16384;
                                    continue;
                                case 130:
                                    codedInputStream.readMessage(getOauthCredentialsRequestWithAgentMsgFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32768;
                                    continue;
                                case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                                    codedInputStream.readMessage(getOauthCredentialsResponseWithAgentMsgFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 65536;
                                    continue;
                                case 146:
                                    codedInputStream.readMessage(getMobileCarrierInfoRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 131072;
                                    continue;
                                case 154:
                                    codedInputStream.readMessage(getMobileCarrierInfoResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                                    continue;
                                case 162:
                                    codedInputStream.readMessage(getSwitchToApRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 524288;
                                    continue;
                                case 170:
                                    codedInputStream.readMessage(getSwitchToApResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                    continue;
                                case 178:
                                    codedInputStream.readMessage(getGetNetworkCredentialsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2097152;
                                    continue;
                                case 186:
                                    codedInputStream.readMessage(getGetNetworkCredentialsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4194304;
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

            public Builder mergeGetNetworkCredentialsRequest(GetNetworkCredentialsRequest getNetworkCredentialsRequest) {
                GetNetworkCredentialsRequest getNetworkCredentialsRequest2;
                SingleFieldBuilderV3<GetNetworkCredentialsRequest, GetNetworkCredentialsRequest.Builder, GetNetworkCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getNetworkCredentialsRequest);
                } else if ((this.bitField0_ & 2097152) == 0 || (getNetworkCredentialsRequest2 = this.getNetworkCredentialsRequest_) == null || getNetworkCredentialsRequest2 == GetNetworkCredentialsRequest.getDefaultInstance()) {
                    this.getNetworkCredentialsRequest_ = getNetworkCredentialsRequest;
                } else {
                    getGetNetworkCredentialsRequestBuilder().mergeFrom(getNetworkCredentialsRequest);
                }
                if (this.getNetworkCredentialsRequest_ != null) {
                    this.bitField0_ |= 2097152;
                    onChanged();
                }
                return this;
            }

            public Builder mergeGetNetworkCredentialsResponse(GetNetworkCredentialsResponse getNetworkCredentialsResponse) {
                GetNetworkCredentialsResponse getNetworkCredentialsResponse2;
                SingleFieldBuilderV3<GetNetworkCredentialsResponse, GetNetworkCredentialsResponse.Builder, GetNetworkCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getNetworkCredentialsResponse);
                } else if ((this.bitField0_ & 4194304) == 0 || (getNetworkCredentialsResponse2 = this.getNetworkCredentialsResponse_) == null || getNetworkCredentialsResponse2 == GetNetworkCredentialsResponse.getDefaultInstance()) {
                    this.getNetworkCredentialsResponse_ = getNetworkCredentialsResponse;
                } else {
                    getGetNetworkCredentialsResponseBuilder().mergeFrom(getNetworkCredentialsResponse);
                }
                if (this.getNetworkCredentialsResponse_ != null) {
                    this.bitField0_ |= 4194304;
                    onChanged();
                }
                return this;
            }

            public Builder mergeMobileCarrierInfoRequest(MobileCarrierInfoRequest mobileCarrierInfoRequest) {
                MobileCarrierInfoRequest mobileCarrierInfoRequest2;
                SingleFieldBuilderV3<MobileCarrierInfoRequest, MobileCarrierInfoRequest.Builder, MobileCarrierInfoRequestOrBuilder> singleFieldBuilderV3 = this.mobileCarrierInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(mobileCarrierInfoRequest);
                } else if ((this.bitField0_ & 131072) == 0 || (mobileCarrierInfoRequest2 = this.mobileCarrierInfoRequest_) == null || mobileCarrierInfoRequest2 == MobileCarrierInfoRequest.getDefaultInstance()) {
                    this.mobileCarrierInfoRequest_ = mobileCarrierInfoRequest;
                } else {
                    getMobileCarrierInfoRequestBuilder().mergeFrom(mobileCarrierInfoRequest);
                }
                if (this.mobileCarrierInfoRequest_ != null) {
                    this.bitField0_ |= 131072;
                    onChanged();
                }
                return this;
            }

            public Builder mergeMobileCarrierInfoResponse(MobileCarrierInfoResponse mobileCarrierInfoResponse) {
                MobileCarrierInfoResponse mobileCarrierInfoResponse2;
                SingleFieldBuilderV3<MobileCarrierInfoResponse, MobileCarrierInfoResponse.Builder, MobileCarrierInfoResponseOrBuilder> singleFieldBuilderV3 = this.mobileCarrierInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(mobileCarrierInfoResponse);
                } else if ((this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) == 0 || (mobileCarrierInfoResponse2 = this.mobileCarrierInfoResponse_) == null || mobileCarrierInfoResponse2 == MobileCarrierInfoResponse.getDefaultInstance()) {
                    this.mobileCarrierInfoResponse_ = mobileCarrierInfoResponse;
                } else {
                    getMobileCarrierInfoResponseBuilder().mergeFrom(mobileCarrierInfoResponse);
                }
                if (this.mobileCarrierInfoResponse_ != null) {
                    this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                    onChanged();
                }
                return this;
            }

            public Builder mergeOauthCredentialsRequest(OAuthCredentialsRequest oAuthCredentialsRequest) {
                OAuthCredentialsRequest oAuthCredentialsRequest2;
                SingleFieldBuilderV3<OAuthCredentialsRequest, OAuthCredentialsRequest.Builder, OAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(oAuthCredentialsRequest);
                } else if ((this.bitField0_ & 32) == 0 || (oAuthCredentialsRequest2 = this.oauthCredentialsRequest_) == null || oAuthCredentialsRequest2 == OAuthCredentialsRequest.getDefaultInstance()) {
                    this.oauthCredentialsRequest_ = oAuthCredentialsRequest;
                } else {
                    getOauthCredentialsRequestBuilder().mergeFrom(oAuthCredentialsRequest);
                }
                if (this.oauthCredentialsRequest_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeOauthCredentialsRequestWithAgentMsg(OAuthCredentialsRequest oAuthCredentialsRequest) {
                OAuthCredentialsRequest oAuthCredentialsRequest2;
                SingleFieldBuilderV3<OAuthCredentialsRequest, OAuthCredentialsRequest.Builder, OAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsRequestWithAgentMsgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(oAuthCredentialsRequest);
                } else if ((this.bitField0_ & 32768) == 0 || (oAuthCredentialsRequest2 = this.oauthCredentialsRequestWithAgentMsg_) == null || oAuthCredentialsRequest2 == OAuthCredentialsRequest.getDefaultInstance()) {
                    this.oauthCredentialsRequestWithAgentMsg_ = oAuthCredentialsRequest;
                } else {
                    getOauthCredentialsRequestWithAgentMsgBuilder().mergeFrom(oAuthCredentialsRequest);
                }
                if (this.oauthCredentialsRequestWithAgentMsg_ != null) {
                    this.bitField0_ |= 32768;
                    onChanged();
                }
                return this;
            }

            public Builder mergeOauthCredentialsResponse(OAuthCredentialsResponse oAuthCredentialsResponse) {
                OAuthCredentialsResponse oAuthCredentialsResponse2;
                SingleFieldBuilderV3<OAuthCredentialsResponse, OAuthCredentialsResponse.Builder, OAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(oAuthCredentialsResponse);
                } else if ((this.bitField0_ & 64) == 0 || (oAuthCredentialsResponse2 = this.oauthCredentialsResponse_) == null || oAuthCredentialsResponse2 == OAuthCredentialsResponse.getDefaultInstance()) {
                    this.oauthCredentialsResponse_ = oAuthCredentialsResponse;
                } else {
                    getOauthCredentialsResponseBuilder().mergeFrom(oAuthCredentialsResponse);
                }
                if (this.oauthCredentialsResponse_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeOauthCredentialsResponseWithAgentMsg(OAuthCredentialsResponse oAuthCredentialsResponse) {
                OAuthCredentialsResponse oAuthCredentialsResponse2;
                SingleFieldBuilderV3<OAuthCredentialsResponse, OAuthCredentialsResponse.Builder, OAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsResponseWithAgentMsgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(oAuthCredentialsResponse);
                } else if ((this.bitField0_ & 65536) == 0 || (oAuthCredentialsResponse2 = this.oauthCredentialsResponseWithAgentMsg_) == null || oAuthCredentialsResponse2 == OAuthCredentialsResponse.getDefaultInstance()) {
                    this.oauthCredentialsResponseWithAgentMsg_ = oAuthCredentialsResponse;
                } else {
                    getOauthCredentialsResponseWithAgentMsgBuilder().mergeFrom(oAuthCredentialsResponse);
                }
                if (this.oauthCredentialsResponseWithAgentMsg_ != null) {
                    this.bitField0_ |= 65536;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStoreAccessPointNotification(StoreAccessPointNotification storeAccessPointNotification) {
                StoreAccessPointNotification storeAccessPointNotification2;
                SingleFieldBuilderV3<StoreAccessPointNotification, StoreAccessPointNotification.Builder, StoreAccessPointNotificationOrBuilder> singleFieldBuilderV3 = this.storeAccessPointNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(storeAccessPointNotification);
                } else if ((this.bitField0_ & 4) == 0 || (storeAccessPointNotification2 = this.storeAccessPointNotification_) == null || storeAccessPointNotification2 == StoreAccessPointNotification.getDefaultInstance()) {
                    this.storeAccessPointNotification_ = storeAccessPointNotification;
                } else {
                    getStoreAccessPointNotificationBuilder().mergeFrom(storeAccessPointNotification);
                }
                if (this.storeAccessPointNotification_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSwitchToApRequest(SwitchToApModeRequest switchToApModeRequest) {
                SwitchToApModeRequest switchToApModeRequest2;
                SingleFieldBuilderV3<SwitchToApModeRequest, SwitchToApModeRequest.Builder, SwitchToApModeRequestOrBuilder> singleFieldBuilderV3 = this.switchToApRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(switchToApModeRequest);
                } else if ((this.bitField0_ & 524288) == 0 || (switchToApModeRequest2 = this.switchToApRequest_) == null || switchToApModeRequest2 == SwitchToApModeRequest.getDefaultInstance()) {
                    this.switchToApRequest_ = switchToApModeRequest;
                } else {
                    getSwitchToApRequestBuilder().mergeFrom(switchToApModeRequest);
                }
                if (this.switchToApRequest_ != null) {
                    this.bitField0_ |= 524288;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSwitchToApResponse(SwitchToApModeResponse switchToApModeResponse) {
                SwitchToApModeResponse switchToApModeResponse2;
                SingleFieldBuilderV3<SwitchToApModeResponse, SwitchToApModeResponse.Builder, SwitchToApModeResponseOrBuilder> singleFieldBuilderV3 = this.switchToApResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(switchToApModeResponse);
                } else if ((this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0 || (switchToApModeResponse2 = this.switchToApResponse_) == null || switchToApModeResponse2 == SwitchToApModeResponse.getDefaultInstance()) {
                    this.switchToApResponse_ = switchToApModeResponse;
                } else {
                    getSwitchToApResponseBuilder().mergeFrom(switchToApModeResponse);
                }
                if (this.switchToApResponse_ != null) {
                    this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder mergeUpdateAccessPointRequest(UpdateAccessPointRequest updateAccessPointRequest) {
                UpdateAccessPointRequest updateAccessPointRequest2;
                SingleFieldBuilderV3<UpdateAccessPointRequest, UpdateAccessPointRequest.Builder, UpdateAccessPointRequestOrBuilder> singleFieldBuilderV3 = this.updateAccessPointRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(updateAccessPointRequest);
                } else if ((this.bitField0_ & 8192) == 0 || (updateAccessPointRequest2 = this.updateAccessPointRequest_) == null || updateAccessPointRequest2 == UpdateAccessPointRequest.getDefaultInstance()) {
                    this.updateAccessPointRequest_ = updateAccessPointRequest;
                } else {
                    getUpdateAccessPointRequestBuilder().mergeFrom(updateAccessPointRequest);
                }
                if (this.updateAccessPointRequest_ != null) {
                    this.bitField0_ |= 8192;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUpdateAccessPointResponse(UpdateAccessPointResponse updateAccessPointResponse) {
                UpdateAccessPointResponse updateAccessPointResponse2;
                SingleFieldBuilderV3<UpdateAccessPointResponse, UpdateAccessPointResponse.Builder, UpdateAccessPointResponseOrBuilder> singleFieldBuilderV3 = this.updateAccessPointResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(updateAccessPointResponse);
                } else if ((this.bitField0_ & 16384) == 0 || (updateAccessPointResponse2 = this.updateAccessPointResponse_) == null || updateAccessPointResponse2 == UpdateAccessPointResponse.getDefaultInstance()) {
                    this.updateAccessPointResponse_ = updateAccessPointResponse;
                } else {
                    getUpdateAccessPointResponseBuilder().mergeFrom(updateAccessPointResponse);
                }
                if (this.updateAccessPointResponse_ != null) {
                    this.bitField0_ |= 16384;
                    onChanged();
                }
                return this;
            }

            public Builder mergeVerifyConnectionNotification(VerifyConnectionNotification verifyConnectionNotification) {
                VerifyConnectionNotification verifyConnectionNotification2;
                SingleFieldBuilderV3<VerifyConnectionNotification, VerifyConnectionNotification.Builder, VerifyConnectionNotificationOrBuilder> singleFieldBuilderV3 = this.verifyConnectionNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(verifyConnectionNotification);
                } else if ((this.bitField0_ & 2048) == 0 || (verifyConnectionNotification2 = this.verifyConnectionNotification_) == null || verifyConnectionNotification2 == VerifyConnectionNotification.getDefaultInstance()) {
                    this.verifyConnectionNotification_ = verifyConnectionNotification;
                } else {
                    getVerifyConnectionNotificationBuilder().mergeFrom(verifyConnectionNotification);
                }
                if (this.verifyConnectionNotification_ != null) {
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                return this;
            }

            public Builder mergeVerifyConnectionRequest(VerifyConnectionRequest verifyConnectionRequest) {
                VerifyConnectionRequest verifyConnectionRequest2;
                SingleFieldBuilderV3<VerifyConnectionRequest, VerifyConnectionRequest.Builder, VerifyConnectionRequestOrBuilder> singleFieldBuilderV3 = this.verifyConnectionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(verifyConnectionRequest);
                } else if ((this.bitField0_ & 8) == 0 || (verifyConnectionRequest2 = this.verifyConnectionRequest_) == null || verifyConnectionRequest2 == VerifyConnectionRequest.getDefaultInstance()) {
                    this.verifyConnectionRequest_ = verifyConnectionRequest;
                } else {
                    getVerifyConnectionRequestBuilder().mergeFrom(verifyConnectionRequest);
                }
                if (this.verifyConnectionRequest_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeVerifyConnectionResponse(VerifyConnectionResponse verifyConnectionResponse) {
                VerifyConnectionResponse verifyConnectionResponse2;
                SingleFieldBuilderV3<VerifyConnectionResponse, VerifyConnectionResponse.Builder, VerifyConnectionResponseOrBuilder> singleFieldBuilderV3 = this.verifyConnectionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(verifyConnectionResponse);
                } else if ((this.bitField0_ & 16) == 0 || (verifyConnectionResponse2 = this.verifyConnectionResponse_) == null || verifyConnectionResponse2 == VerifyConnectionResponse.getDefaultInstance()) {
                    this.verifyConnectionResponse_ = verifyConnectionResponse;
                } else {
                    getVerifyConnectionResponseBuilder().mergeFrom(verifyConnectionResponse);
                }
                if (this.verifyConnectionResponse_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder setAccessPointRequest(StoredAccessPointRequest.Builder builder) {
                SingleFieldBuilderV3<StoredAccessPointRequest, StoredAccessPointRequest.Builder, StoredAccessPointRequestOrBuilder> singleFieldBuilderV3 = this.accessPointRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.accessPointRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setAccessPointResponse(StoredAccessPointResponse.Builder builder) {
                SingleFieldBuilderV3<StoredAccessPointResponse, StoredAccessPointResponse.Builder, StoredAccessPointResponseOrBuilder> singleFieldBuilderV3 = this.accessPointResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.accessPointResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setAccessPointScanCompleteNotification(AccessPointScanCompleteNotification.Builder builder) {
                SingleFieldBuilderV3<AccessPointScanCompleteNotification, AccessPointScanCompleteNotification.Builder, AccessPointScanCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.accessPointScanCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.accessPointScanCompleteNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setAccessPointScanRequest(AccessPointScanRequest.Builder builder) {
                SingleFieldBuilderV3<AccessPointScanRequest, AccessPointScanRequest.Builder, AccessPointScanRequestOrBuilder> singleFieldBuilderV3 = this.accessPointScanRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.accessPointScanRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAccessPointScanResponse(AccessPointScanResponse.Builder builder) {
                SingleFieldBuilderV3<AccessPointScanResponse, AccessPointScanResponse.Builder, AccessPointScanResponseOrBuilder> singleFieldBuilderV3 = this.accessPointScanResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.accessPointScanResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setAccessPointStartScanNotification(AccessPointStartScanNotification.Builder builder) {
                SingleFieldBuilderV3<AccessPointStartScanNotification, AccessPointStartScanNotification.Builder, AccessPointStartScanNotificationOrBuilder> singleFieldBuilderV3 = this.accessPointStartScanNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.accessPointStartScanNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setConnectionVerificationStatusNotification(ConnectionVerificationStatusNotification.Builder builder) {
                SingleFieldBuilderV3<ConnectionVerificationStatusNotification, ConnectionVerificationStatusNotification.Builder, ConnectionVerificationStatusNotificationOrBuilder> singleFieldBuilderV3 = this.connectionVerificationStatusNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectionVerificationStatusNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGetNetworkCredentialsRequest(GetNetworkCredentialsRequest.Builder builder) {
                SingleFieldBuilderV3<GetNetworkCredentialsRequest, GetNetworkCredentialsRequest.Builder, GetNetworkCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.getNetworkCredentialsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2097152;
                onChanged();
                return this;
            }

            public Builder setGetNetworkCredentialsResponse(GetNetworkCredentialsResponse.Builder builder) {
                SingleFieldBuilderV3<GetNetworkCredentialsResponse, GetNetworkCredentialsResponse.Builder, GetNetworkCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.getNetworkCredentialsResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4194304;
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
                this.bitField0_ |= 131072;
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
                this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                onChanged();
                return this;
            }

            public Builder setOauthCredentialsRequest(OAuthCredentialsRequest.Builder builder) {
                SingleFieldBuilderV3<OAuthCredentialsRequest, OAuthCredentialsRequest.Builder, OAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.oauthCredentialsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setOauthCredentialsRequestWithAgentMsg(OAuthCredentialsRequest.Builder builder) {
                SingleFieldBuilderV3<OAuthCredentialsRequest, OAuthCredentialsRequest.Builder, OAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsRequestWithAgentMsgBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.oauthCredentialsRequestWithAgentMsg_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            public Builder setOauthCredentialsResponse(OAuthCredentialsResponse.Builder builder) {
                SingleFieldBuilderV3<OAuthCredentialsResponse, OAuthCredentialsResponse.Builder, OAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.oauthCredentialsResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setOauthCredentialsResponseWithAgentMsg(OAuthCredentialsResponse.Builder builder) {
                SingleFieldBuilderV3<OAuthCredentialsResponse, OAuthCredentialsResponse.Builder, OAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsResponseWithAgentMsgBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.oauthCredentialsResponseWithAgentMsg_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStoreAccessPointNotification(StoreAccessPointNotification.Builder builder) {
                SingleFieldBuilderV3<StoreAccessPointNotification, StoreAccessPointNotification.Builder, StoreAccessPointNotificationOrBuilder> singleFieldBuilderV3 = this.storeAccessPointNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.storeAccessPointNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
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
                this.bitField0_ |= 524288;
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
                this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setUpdateAccessPointRequest(UpdateAccessPointRequest.Builder builder) {
                SingleFieldBuilderV3<UpdateAccessPointRequest, UpdateAccessPointRequest.Builder, UpdateAccessPointRequestOrBuilder> singleFieldBuilderV3 = this.updateAccessPointRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.updateAccessPointRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setUpdateAccessPointResponse(UpdateAccessPointResponse.Builder builder) {
                SingleFieldBuilderV3<UpdateAccessPointResponse, UpdateAccessPointResponse.Builder, UpdateAccessPointResponseOrBuilder> singleFieldBuilderV3 = this.updateAccessPointResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.updateAccessPointResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setVerifyConnectionNotification(VerifyConnectionNotification.Builder builder) {
                SingleFieldBuilderV3<VerifyConnectionNotification, VerifyConnectionNotification.Builder, VerifyConnectionNotificationOrBuilder> singleFieldBuilderV3 = this.verifyConnectionNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.verifyConnectionNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setVerifyConnectionRequest(VerifyConnectionRequest.Builder builder) {
                SingleFieldBuilderV3<VerifyConnectionRequest, VerifyConnectionRequest.Builder, VerifyConnectionRequestOrBuilder> singleFieldBuilderV3 = this.verifyConnectionRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.verifyConnectionRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setVerifyConnectionResponse(VerifyConnectionResponse.Builder builder) {
                SingleFieldBuilderV3<VerifyConnectionResponse, VerifyConnectionResponse.Builder, VerifyConnectionResponseOrBuilder> singleFieldBuilderV3 = this.verifyConnectionResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.verifyConnectionResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WifiSetupService getDefaultInstanceForType() {
                return WifiSetupService.getDefaultInstance();
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

            public Builder setAccessPointRequest(StoredAccessPointRequest storedAccessPointRequest) {
                SingleFieldBuilderV3<StoredAccessPointRequest, StoredAccessPointRequest.Builder, StoredAccessPointRequestOrBuilder> singleFieldBuilderV3 = this.accessPointRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    storedAccessPointRequest.getClass();
                    this.accessPointRequest_ = storedAccessPointRequest;
                } else {
                    singleFieldBuilderV3.setMessage(storedAccessPointRequest);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setAccessPointResponse(StoredAccessPointResponse storedAccessPointResponse) {
                SingleFieldBuilderV3<StoredAccessPointResponse, StoredAccessPointResponse.Builder, StoredAccessPointResponseOrBuilder> singleFieldBuilderV3 = this.accessPointResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    storedAccessPointResponse.getClass();
                    this.accessPointResponse_ = storedAccessPointResponse;
                } else {
                    singleFieldBuilderV3.setMessage(storedAccessPointResponse);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setAccessPointScanCompleteNotification(AccessPointScanCompleteNotification accessPointScanCompleteNotification) {
                SingleFieldBuilderV3<AccessPointScanCompleteNotification, AccessPointScanCompleteNotification.Builder, AccessPointScanCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.accessPointScanCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    accessPointScanCompleteNotification.getClass();
                    this.accessPointScanCompleteNotification_ = accessPointScanCompleteNotification;
                } else {
                    singleFieldBuilderV3.setMessage(accessPointScanCompleteNotification);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setAccessPointScanRequest(AccessPointScanRequest accessPointScanRequest) {
                SingleFieldBuilderV3<AccessPointScanRequest, AccessPointScanRequest.Builder, AccessPointScanRequestOrBuilder> singleFieldBuilderV3 = this.accessPointScanRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    accessPointScanRequest.getClass();
                    this.accessPointScanRequest_ = accessPointScanRequest;
                } else {
                    singleFieldBuilderV3.setMessage(accessPointScanRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAccessPointScanResponse(AccessPointScanResponse accessPointScanResponse) {
                SingleFieldBuilderV3<AccessPointScanResponse, AccessPointScanResponse.Builder, AccessPointScanResponseOrBuilder> singleFieldBuilderV3 = this.accessPointScanResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    accessPointScanResponse.getClass();
                    this.accessPointScanResponse_ = accessPointScanResponse;
                } else {
                    singleFieldBuilderV3.setMessage(accessPointScanResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setAccessPointStartScanNotification(AccessPointStartScanNotification accessPointStartScanNotification) {
                SingleFieldBuilderV3<AccessPointStartScanNotification, AccessPointStartScanNotification.Builder, AccessPointStartScanNotificationOrBuilder> singleFieldBuilderV3 = this.accessPointStartScanNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    accessPointStartScanNotification.getClass();
                    this.accessPointStartScanNotification_ = accessPointStartScanNotification;
                } else {
                    singleFieldBuilderV3.setMessage(accessPointStartScanNotification);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setConnectionVerificationStatusNotification(ConnectionVerificationStatusNotification connectionVerificationStatusNotification) {
                SingleFieldBuilderV3<ConnectionVerificationStatusNotification, ConnectionVerificationStatusNotification.Builder, ConnectionVerificationStatusNotificationOrBuilder> singleFieldBuilderV3 = this.connectionVerificationStatusNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectionVerificationStatusNotification.getClass();
                    this.connectionVerificationStatusNotification_ = connectionVerificationStatusNotification;
                } else {
                    singleFieldBuilderV3.setMessage(connectionVerificationStatusNotification);
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setOauthCredentialsRequest(OAuthCredentialsRequest oAuthCredentialsRequest) {
                SingleFieldBuilderV3<OAuthCredentialsRequest, OAuthCredentialsRequest.Builder, OAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    oAuthCredentialsRequest.getClass();
                    this.oauthCredentialsRequest_ = oAuthCredentialsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(oAuthCredentialsRequest);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setOauthCredentialsResponse(OAuthCredentialsResponse oAuthCredentialsResponse) {
                SingleFieldBuilderV3<OAuthCredentialsResponse, OAuthCredentialsResponse.Builder, OAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    oAuthCredentialsResponse.getClass();
                    this.oauthCredentialsResponse_ = oAuthCredentialsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(oAuthCredentialsResponse);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setStoreAccessPointNotification(StoreAccessPointNotification storeAccessPointNotification) {
                SingleFieldBuilderV3<StoreAccessPointNotification, StoreAccessPointNotification.Builder, StoreAccessPointNotificationOrBuilder> singleFieldBuilderV3 = this.storeAccessPointNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    storeAccessPointNotification.getClass();
                    this.storeAccessPointNotification_ = storeAccessPointNotification;
                } else {
                    singleFieldBuilderV3.setMessage(storeAccessPointNotification);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setUpdateAccessPointRequest(UpdateAccessPointRequest updateAccessPointRequest) {
                SingleFieldBuilderV3<UpdateAccessPointRequest, UpdateAccessPointRequest.Builder, UpdateAccessPointRequestOrBuilder> singleFieldBuilderV3 = this.updateAccessPointRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    updateAccessPointRequest.getClass();
                    this.updateAccessPointRequest_ = updateAccessPointRequest;
                } else {
                    singleFieldBuilderV3.setMessage(updateAccessPointRequest);
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setUpdateAccessPointResponse(UpdateAccessPointResponse updateAccessPointResponse) {
                SingleFieldBuilderV3<UpdateAccessPointResponse, UpdateAccessPointResponse.Builder, UpdateAccessPointResponseOrBuilder> singleFieldBuilderV3 = this.updateAccessPointResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    updateAccessPointResponse.getClass();
                    this.updateAccessPointResponse_ = updateAccessPointResponse;
                } else {
                    singleFieldBuilderV3.setMessage(updateAccessPointResponse);
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setVerifyConnectionNotification(VerifyConnectionNotification verifyConnectionNotification) {
                SingleFieldBuilderV3<VerifyConnectionNotification, VerifyConnectionNotification.Builder, VerifyConnectionNotificationOrBuilder> singleFieldBuilderV3 = this.verifyConnectionNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    verifyConnectionNotification.getClass();
                    this.verifyConnectionNotification_ = verifyConnectionNotification;
                } else {
                    singleFieldBuilderV3.setMessage(verifyConnectionNotification);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setVerifyConnectionRequest(VerifyConnectionRequest verifyConnectionRequest) {
                SingleFieldBuilderV3<VerifyConnectionRequest, VerifyConnectionRequest.Builder, VerifyConnectionRequestOrBuilder> singleFieldBuilderV3 = this.verifyConnectionRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    verifyConnectionRequest.getClass();
                    this.verifyConnectionRequest_ = verifyConnectionRequest;
                } else {
                    singleFieldBuilderV3.setMessage(verifyConnectionRequest);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setVerifyConnectionResponse(VerifyConnectionResponse verifyConnectionResponse) {
                SingleFieldBuilderV3<VerifyConnectionResponse, VerifyConnectionResponse.Builder, VerifyConnectionResponseOrBuilder> singleFieldBuilderV3 = this.verifyConnectionResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    verifyConnectionResponse.getClass();
                    this.verifyConnectionResponse_ = verifyConnectionResponse;
                } else {
                    singleFieldBuilderV3.setMessage(verifyConnectionResponse);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setGetNetworkCredentialsRequest(GetNetworkCredentialsRequest getNetworkCredentialsRequest) {
                SingleFieldBuilderV3<GetNetworkCredentialsRequest, GetNetworkCredentialsRequest.Builder, GetNetworkCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getNetworkCredentialsRequest.getClass();
                    this.getNetworkCredentialsRequest_ = getNetworkCredentialsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(getNetworkCredentialsRequest);
                }
                this.bitField0_ |= 2097152;
                onChanged();
                return this;
            }

            public Builder setGetNetworkCredentialsResponse(GetNetworkCredentialsResponse getNetworkCredentialsResponse) {
                SingleFieldBuilderV3<GetNetworkCredentialsResponse, GetNetworkCredentialsResponse.Builder, GetNetworkCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.getNetworkCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getNetworkCredentialsResponse.getClass();
                    this.getNetworkCredentialsResponse_ = getNetworkCredentialsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(getNetworkCredentialsResponse);
                }
                this.bitField0_ |= 4194304;
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
                this.bitField0_ |= 131072;
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
                this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                onChanged();
                return this;
            }

            public Builder setOauthCredentialsResponseWithAgentMsg(OAuthCredentialsResponse oAuthCredentialsResponse) {
                SingleFieldBuilderV3<OAuthCredentialsResponse, OAuthCredentialsResponse.Builder, OAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsResponseWithAgentMsgBuilder_;
                if (singleFieldBuilderV3 == null) {
                    oAuthCredentialsResponse.getClass();
                    this.oauthCredentialsResponseWithAgentMsg_ = oAuthCredentialsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(oAuthCredentialsResponse);
                }
                this.bitField0_ |= 65536;
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
                this.bitField0_ |= 524288;
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
                this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                onChanged();
                return this;
            }

            public Builder setOauthCredentialsRequestWithAgentMsg(OAuthCredentialsRequest oAuthCredentialsRequest) {
                SingleFieldBuilderV3<OAuthCredentialsRequest, OAuthCredentialsRequest.Builder, OAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsRequestWithAgentMsgBuilder_;
                if (singleFieldBuilderV3 == null) {
                    oAuthCredentialsRequest.getClass();
                    this.oauthCredentialsRequestWithAgentMsg_ = oAuthCredentialsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(oAuthCredentialsRequest);
                }
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WifiSetupService) {
                    return mergeFrom((WifiSetupService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WifiSetupService wifiSetupService) {
                if (wifiSetupService == WifiSetupService.getDefaultInstance()) {
                    return this;
                }
                if (wifiSetupService.hasAccessPointScanRequest()) {
                    mergeAccessPointScanRequest(wifiSetupService.getAccessPointScanRequest());
                }
                if (wifiSetupService.hasAccessPointScanResponse()) {
                    mergeAccessPointScanResponse(wifiSetupService.getAccessPointScanResponse());
                }
                if (wifiSetupService.hasStoreAccessPointNotification()) {
                    mergeStoreAccessPointNotification(wifiSetupService.getStoreAccessPointNotification());
                }
                if (wifiSetupService.hasVerifyConnectionRequest()) {
                    mergeVerifyConnectionRequest(wifiSetupService.getVerifyConnectionRequest());
                }
                if (wifiSetupService.hasVerifyConnectionResponse()) {
                    mergeVerifyConnectionResponse(wifiSetupService.getVerifyConnectionResponse());
                }
                if (wifiSetupService.hasOauthCredentialsRequest()) {
                    mergeOauthCredentialsRequest(wifiSetupService.getOauthCredentialsRequest());
                }
                if (wifiSetupService.hasOauthCredentialsResponse()) {
                    mergeOauthCredentialsResponse(wifiSetupService.getOauthCredentialsResponse());
                }
                if (wifiSetupService.hasAccessPointRequest()) {
                    mergeAccessPointRequest(wifiSetupService.getAccessPointRequest());
                }
                if (wifiSetupService.hasAccessPointResponse()) {
                    mergeAccessPointResponse(wifiSetupService.getAccessPointResponse());
                }
                if (wifiSetupService.hasAccessPointStartScanNotification()) {
                    mergeAccessPointStartScanNotification(wifiSetupService.getAccessPointStartScanNotification());
                }
                if (wifiSetupService.hasAccessPointScanCompleteNotification()) {
                    mergeAccessPointScanCompleteNotification(wifiSetupService.getAccessPointScanCompleteNotification());
                }
                if (wifiSetupService.hasVerifyConnectionNotification()) {
                    mergeVerifyConnectionNotification(wifiSetupService.getVerifyConnectionNotification());
                }
                if (wifiSetupService.hasConnectionVerificationStatusNotification()) {
                    mergeConnectionVerificationStatusNotification(wifiSetupService.getConnectionVerificationStatusNotification());
                }
                if (wifiSetupService.hasUpdateAccessPointRequest()) {
                    mergeUpdateAccessPointRequest(wifiSetupService.getUpdateAccessPointRequest());
                }
                if (wifiSetupService.hasUpdateAccessPointResponse()) {
                    mergeUpdateAccessPointResponse(wifiSetupService.getUpdateAccessPointResponse());
                }
                if (wifiSetupService.hasOauthCredentialsRequestWithAgentMsg()) {
                    mergeOauthCredentialsRequestWithAgentMsg(wifiSetupService.getOauthCredentialsRequestWithAgentMsg());
                }
                if (wifiSetupService.hasOauthCredentialsResponseWithAgentMsg()) {
                    mergeOauthCredentialsResponseWithAgentMsg(wifiSetupService.getOauthCredentialsResponseWithAgentMsg());
                }
                if (wifiSetupService.hasMobileCarrierInfoRequest()) {
                    mergeMobileCarrierInfoRequest(wifiSetupService.getMobileCarrierInfoRequest());
                }
                if (wifiSetupService.hasMobileCarrierInfoResponse()) {
                    mergeMobileCarrierInfoResponse(wifiSetupService.getMobileCarrierInfoResponse());
                }
                if (wifiSetupService.hasSwitchToApRequest()) {
                    mergeSwitchToApRequest(wifiSetupService.getSwitchToApRequest());
                }
                if (wifiSetupService.hasSwitchToApResponse()) {
                    mergeSwitchToApResponse(wifiSetupService.getSwitchToApResponse());
                }
                if (wifiSetupService.hasGetNetworkCredentialsRequest()) {
                    mergeGetNetworkCredentialsRequest(wifiSetupService.getGetNetworkCredentialsRequest());
                }
                if (wifiSetupService.hasGetNetworkCredentialsResponse()) {
                    mergeGetNetworkCredentialsResponse(wifiSetupService.getGetNetworkCredentialsResponse());
                }
                mergeUnknownFields(wifiSetupService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WifiSetupService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ WifiSetupService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private WifiSetupService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WifiSetupService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WifiSetupService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WifiSetupService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WifiSetupService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WifiSetupService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WifiSetupService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WifiSetupService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WifiSetupService parseFrom(InputStream inputStream) {
            return (WifiSetupService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static WifiSetupService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WifiSetupService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WifiSetupService parseFrom(CodedInputStream codedInputStream) {
            return (WifiSetupService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static WifiSetupService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WifiSetupService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public enum WifiBand implements ProtocolMessageEnum {
        WIFI_BAND_5_GHZ(0),
        WIFI_BAND_2P4_GHZ(1);

        public static final int WIFI_BAND_2P4_GHZ_VALUE = 1;
        public static final int WIFI_BAND_5_GHZ_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<WifiBand> internalValueMap = new Internal.EnumLiteMap<WifiBand>() { // from class: com.garmin.proto.generated.GDIWifiSetup.WifiBand.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public WifiBand findValueByNumber(int i14) {
                return WifiBand.forNumber(i14);
            }
        };
        private static final WifiBand[] VALUES = values();

        WifiBand(int i14) {
            this.value = i14;
        }

        public static WifiBand forNumber(int i14) {
            if (i14 == 0) {
                return WIFI_BAND_5_GHZ;
            }
            if (i14 != 1) {
                return null;
            }
            return WIFI_BAND_2P4_GHZ;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIWifiSetup.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<WifiBand> internalGetValueMap() {
            return internalValueMap;
        }

        public static WifiBand valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static WifiBand valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
