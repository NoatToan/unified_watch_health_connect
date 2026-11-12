package com.garmin.proto.generated;

import com.google.common.net.HttpHeaders;
import com.google.protobuf.AbstractMessage;
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import vb.h;

/* JADX INFO: loaded from: classes5.dex */
public final class GDILTEProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\fGDILTE.proto\u0012\rGDI.Proto.LTE\u001a\u0012GDIDataTypes.proto\"Ä\u0007\n\nLTEService\u0012D\n\u0017lte_device_info_request\u0018\u0001 \u0001(\u000b2#.GDI.Proto.LTE.LTEDeviceInfoRequest\u0012F\n\u0018lte_device_info_response\u0018\u0002 \u0001(\u000b2$.GDI.Proto.LTE.LTEDeviceInfoResponse\u0012H\n\u0019lte_device_status_request\u0018\u0003 \u0001(\u000b2%.GDI.Proto.LTE.LTEDeviceStatusRequest\u0012J\n\u001alte_device_status_response\u0018\u0004 \u0001(\u000b2&.GDI.Proto.LTE.LTEDeviceStatusResponse\u0012\\\n#lte_service_activation_notification\u0018\u0005 \u0001(\u000b2/.GDI.Proto.LTE.LTEServiceActivationNotification\u0012>\n\u0012phone_info_request\u0018\u0006 \u0001(\u000b2\".GDI.Proto.LTE.LTEPhoneInfoRequest\u0012@\n\u0013phone_info_response\u0018\u0007 \u0001(\u000b2#.GDI.Proto.LTE.LTEPhoneInfoResponse\u0012Z\n\"lte_subscription_info_notification\u0018\b \u0001(\u000b2..GDI.Proto.LTE.LTESubscriptionInfoNotification\u0012P\n\u001dlte_subscription_info_request\u0018\t \u0001(\u000b2).GDI.Proto.LTE.LTESubscriptionInfoRequest\u0012R\n\u001elte_subscription_info_response\u0018\n \u0001(\u000b2*.GDI.Proto.LTE.LTESubscriptionInfoResponse\u0012W\n\u001aap_geofencing_notification\u0018\u000b \u0001(\u000b23.GDI.Proto.LTE.AssistancePlusGeofencingNotification\u0012W\n\u001aap_validation_notification\u0018\f \u0001(\u000b23.GDI.Proto.LTE.AssistancePlusValidationNotification\",\n\rLTEDeviceInfo\u0012\f\n\u0004imei\u0018\u0001 \u0002(\t\u0012\r\n\u0005iccid\u0018\u0002 \u0002(\t\"\u0016\n\u0014LTEDeviceInfoRequest\"\u009a\u0002\n\u0015LTEDeviceInfoResponse\u0012L\n\u000fresponse_status\u0018\u0001 \u0002(\u000e23.GDI.Proto.LTE.LTEDeviceInfoResponse.ResponseStatus\u00125\n\u000flte_device_info\u0018\u0002 \u0001(\u000b2\u001c.GDI.Proto.LTE.LTEDeviceInfo\u00123\n\fmodem_status\u0018\u0003 \u0001(\u000e2\u001d.GDI.Proto.LTE.LTEModemStatus\"G\n\u000eResponseStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0015\n\u0011NOT_AN_LTE_DEVICE\u0010\u0002\u0012\t\n\u0005ERROR\u0010\u0003\")\n\u0016LTEDeviceStatusRequest\u0012\u000f\n\u0007timeout\u0018\u0001 \u0001(\r\"Ô\u0002\n\u0017LTEDeviceStatusResponse\u0012N\n\u000fresponse_status\u0018\u0001 \u0002(\u000e25.GDI.Proto.LTE.LTEDeviceStatusResponse.ResponseStatus\u00125\n\u000flte_device_info\u0018\u0002 \u0001(\u000b2\u001c.GDI.Proto.LTE.LTEDeviceInfo\u00123\n\fmodem_status\u0018\u0003 \u0001(\u000e2\u001d.GDI.Proto.LTE.LTEModemStatus\"}\n\u000eResponseStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u000e\n\nLTE_ACTIVE\u0010\u0001\u0012\u0010\n\fLTE_INACTIVE\u0010\u0002\u0012\u0015\n\u0011NOT_AN_LTE_DEVICE\u0010\u0003\u0012\u000b\n\u0007TIMEOUT\u0010\u0004\u0012\r\n\tTRY_AGAIN\u0010\u0005\u0012\t\n\u0005ERROR\u0010\u0006\"î\u0001\n LTEServiceActivationNotification\u0012;\n\u0010service_provider\u0018\u0001 \u0001(\u000e2!.GDI.Proto.LTE.LTEServiceProvider\u0012P\n\u0006status\u0018\u0002 \u0001(\u000e2@.GDI.Proto.LTE.LTEServiceActivationNotification.ActivationStatus\";\n\u0010ActivationStatus\u0012\u000b\n\u0007STARTED\u0010\u0000\u0012\r\n\tCANCELLED\u0010\u0001\u0012\u000b\n\u0007SUCCESS\u0010\u0002\"K\n\fLTEPhoneInfo\u0012;\n\u0010service_provider\u0018\u0001 \u0001(\u000e2!.GDI.Proto.LTE.LTEServiceProvider\"\u0015\n\u0013LTEPhoneInfoRequest\"½\u0001\n\u0014LTEPhoneInfoResponse\u0012B\n\u0006status\u0018\u0001 \u0002(\u000e22.GDI.Proto.LTE.LTEPhoneInfoResponse.ResponseStatus\u0012/\n\nphone_info\u0018\u0002 \u0001(\u000b2\u001b.GDI.Proto.LTE.LTEPhoneInfo\"0\n\u000eResponseStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\t\n\u0005ERROR\u0010\u0002\"\u001c\n\u001aLTESubscriptionInfoRequest\"è\u0001\n\u001bLTESubscriptionInfoResponse\u0012I\n\u0006status\u0018\u0001 \u0002(\u000e29.GDI.Proto.LTE.LTESubscriptionInfoResponse.ResponseStatus\u00120\n\u0004info\u0018\u0002 \u0001(\u000b2\".GDI.Proto.LTE.LTESubscriptionInfo\"L\n\u000eResponseStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u000b\n\u0007TIMEOUT\u0010\u0002\u0012\u0018\n\u0014DEVICE_NOT_SUPPORTED\u0010\u0003\"S\n\u001fLTESubscriptionInfoNotification\u00120\n\u0004info\u0018\u0001 \u0001(\u000b2\".GDI.Proto.LTE.LTESubscriptionInfo\"û\u0001\n\u0013LTESubscriptionInfo\u0012\u0011\n\tdevice_id\u0018\u0001 \u0001(\r\u0012\u0015\n\ris_subscribed\u0018\u0002 \u0001(\b\u0012)\n!account_expiration_unix_timestamp\u0018\u0003 \u0001(\u0003\u0012R\n\u0013subscription_status\u0018\u0004 \u0001(\u000e25.GDI.Proto.LTE.LTESubscriptionInfo.SubscriptionStatus\";\n\u0012SubscriptionStatus\u0012\n\n\u0006ACTIVE\u0010\u0000\u0012\f\n\bINACTIVE\u0010\u0001\u0012\u000b\n\u0007PENDING\u0010\u0002\"v\n$AssistancePlusGeofencingNotification\u0012-\n\u0007country\u0018\u0001 \u0001(\u000b2\u001c.GDI.Proto.LTE.MobileCountry\u0012\u001f\n\u0017assistance_plus_covered\u0018\u0002 \u0001(\b\"V\n$AssistancePlusValidationNotification\u0012.\n\blocation\u0018\u0001 \u0001(\u000b2\u001c.GDI.Proto.DataTypes.ScPoint\"+\n\rMobileCountry\u0012\f\n\u0004code\u0018\u0001 \u0001(\u0005\u0012\f\n\u0004name\u0018\u0002 \u0001(\t*,\n\u0012LTEServiceProvider\u0012\u000b\n\u0007VERIZON\u0010\u0001\u0012\t\n\u0005OTHER\u0010\u0002*.\n\u000eLTEModemStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0006\n\u0002ON\u0010\u0001\u0012\u0007\n\u0003OFF\u0010\u0002B+\n\u001acom.garmin.proto.generatedB\u000bGDILTEProtoH\u0003"}, new Descriptors.FileDescriptor[]{GDIDataTypes.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LTE_AssistancePlusGeofencingNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LTE_AssistancePlusGeofencingNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LTE_AssistancePlusValidationNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LTE_AssistancePlusValidationNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LTE_LTEDeviceInfoRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LTE_LTEDeviceInfoRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LTE_LTEDeviceInfoResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LTE_LTEDeviceInfoResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LTE_LTEDeviceInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LTE_LTEDeviceInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LTE_LTEDeviceStatusRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LTE_LTEDeviceStatusRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LTE_LTEDeviceStatusResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LTE_LTEDeviceStatusResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LTE_LTEPhoneInfoRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LTE_LTEPhoneInfoRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LTE_LTEPhoneInfoResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LTE_LTEPhoneInfoResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LTE_LTEPhoneInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LTE_LTEPhoneInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LTE_LTEServiceActivationNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LTE_LTEServiceActivationNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LTE_LTEService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LTE_LTEService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LTE_LTESubscriptionInfoNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LTE_LTESubscriptionInfoNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LTE_LTESubscriptionInfoRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LTE_LTESubscriptionInfoRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LTE_LTESubscriptionInfoResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LTE_LTESubscriptionInfoResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LTE_LTESubscriptionInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LTE_LTESubscriptionInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LTE_MobileCountry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LTE_MobileCountry_fieldAccessorTable;

    public interface AssistancePlusGeofencingNotificationOrBuilder extends MessageOrBuilder {
        boolean getAssistancePlusCovered();

        MobileCountry getCountry();

        MobileCountryOrBuilder getCountryOrBuilder();

        boolean hasAssistancePlusCovered();

        boolean hasCountry();
    }

    public interface AssistancePlusValidationNotificationOrBuilder extends MessageOrBuilder {
        GDIDataTypes.ScPoint getLocation();

        GDIDataTypes.ScPointOrBuilder getLocationOrBuilder();

        boolean hasLocation();
    }

    public interface LTEDeviceInfoOrBuilder extends MessageOrBuilder {
        String getIccid();

        ByteString getIccidBytes();

        String getImei();

        ByteString getImeiBytes();

        boolean hasIccid();

        boolean hasImei();
    }

    public interface LTEDeviceInfoRequestOrBuilder extends MessageOrBuilder {
    }

    public interface LTEDeviceInfoResponseOrBuilder extends MessageOrBuilder {
        LTEDeviceInfo getLteDeviceInfo();

        LTEDeviceInfoOrBuilder getLteDeviceInfoOrBuilder();

        LTEModemStatus getModemStatus();

        LTEDeviceInfoResponse.ResponseStatus getResponseStatus();

        boolean hasLteDeviceInfo();

        boolean hasModemStatus();

        boolean hasResponseStatus();
    }

    public interface LTEDeviceStatusRequestOrBuilder extends MessageOrBuilder {
        int getTimeout();

        boolean hasTimeout();
    }

    public interface LTEDeviceStatusResponseOrBuilder extends MessageOrBuilder {
        LTEDeviceInfo getLteDeviceInfo();

        LTEDeviceInfoOrBuilder getLteDeviceInfoOrBuilder();

        LTEModemStatus getModemStatus();

        LTEDeviceStatusResponse.ResponseStatus getResponseStatus();

        boolean hasLteDeviceInfo();

        boolean hasModemStatus();

        boolean hasResponseStatus();
    }

    public interface LTEPhoneInfoOrBuilder extends MessageOrBuilder {
        LTEServiceProvider getServiceProvider();

        boolean hasServiceProvider();
    }

    public interface LTEPhoneInfoRequestOrBuilder extends MessageOrBuilder {
    }

    public interface LTEPhoneInfoResponseOrBuilder extends MessageOrBuilder {
        LTEPhoneInfo getPhoneInfo();

        LTEPhoneInfoOrBuilder getPhoneInfoOrBuilder();

        LTEPhoneInfoResponse.ResponseStatus getStatus();

        boolean hasPhoneInfo();

        boolean hasStatus();
    }

    public interface LTEServiceActivationNotificationOrBuilder extends MessageOrBuilder {
        LTEServiceProvider getServiceProvider();

        LTEServiceActivationNotification.ActivationStatus getStatus();

        boolean hasServiceProvider();

        boolean hasStatus();
    }

    public interface LTEServiceOrBuilder extends MessageOrBuilder {
        AssistancePlusGeofencingNotification getApGeofencingNotification();

        AssistancePlusGeofencingNotificationOrBuilder getApGeofencingNotificationOrBuilder();

        AssistancePlusValidationNotification getApValidationNotification();

        AssistancePlusValidationNotificationOrBuilder getApValidationNotificationOrBuilder();

        LTEDeviceInfoRequest getLteDeviceInfoRequest();

        LTEDeviceInfoRequestOrBuilder getLteDeviceInfoRequestOrBuilder();

        LTEDeviceInfoResponse getLteDeviceInfoResponse();

        LTEDeviceInfoResponseOrBuilder getLteDeviceInfoResponseOrBuilder();

        LTEDeviceStatusRequest getLteDeviceStatusRequest();

        LTEDeviceStatusRequestOrBuilder getLteDeviceStatusRequestOrBuilder();

        LTEDeviceStatusResponse getLteDeviceStatusResponse();

        LTEDeviceStatusResponseOrBuilder getLteDeviceStatusResponseOrBuilder();

        LTEServiceActivationNotification getLteServiceActivationNotification();

        LTEServiceActivationNotificationOrBuilder getLteServiceActivationNotificationOrBuilder();

        LTESubscriptionInfoNotification getLteSubscriptionInfoNotification();

        LTESubscriptionInfoNotificationOrBuilder getLteSubscriptionInfoNotificationOrBuilder();

        LTESubscriptionInfoRequest getLteSubscriptionInfoRequest();

        LTESubscriptionInfoRequestOrBuilder getLteSubscriptionInfoRequestOrBuilder();

        LTESubscriptionInfoResponse getLteSubscriptionInfoResponse();

        LTESubscriptionInfoResponseOrBuilder getLteSubscriptionInfoResponseOrBuilder();

        LTEPhoneInfoRequest getPhoneInfoRequest();

        LTEPhoneInfoRequestOrBuilder getPhoneInfoRequestOrBuilder();

        LTEPhoneInfoResponse getPhoneInfoResponse();

        LTEPhoneInfoResponseOrBuilder getPhoneInfoResponseOrBuilder();

        boolean hasApGeofencingNotification();

        boolean hasApValidationNotification();

        boolean hasLteDeviceInfoRequest();

        boolean hasLteDeviceInfoResponse();

        boolean hasLteDeviceStatusRequest();

        boolean hasLteDeviceStatusResponse();

        boolean hasLteServiceActivationNotification();

        boolean hasLteSubscriptionInfoNotification();

        boolean hasLteSubscriptionInfoRequest();

        boolean hasLteSubscriptionInfoResponse();

        boolean hasPhoneInfoRequest();

        boolean hasPhoneInfoResponse();
    }

    public interface LTESubscriptionInfoNotificationOrBuilder extends MessageOrBuilder {
        LTESubscriptionInfo getInfo();

        LTESubscriptionInfoOrBuilder getInfoOrBuilder();

        boolean hasInfo();
    }

    public interface LTESubscriptionInfoOrBuilder extends MessageOrBuilder {
        long getAccountExpirationUnixTimestamp();

        int getDeviceId();

        boolean getIsSubscribed();

        LTESubscriptionInfo.SubscriptionStatus getSubscriptionStatus();

        boolean hasAccountExpirationUnixTimestamp();

        boolean hasDeviceId();

        boolean hasIsSubscribed();

        boolean hasSubscriptionStatus();
    }

    public interface LTESubscriptionInfoRequestOrBuilder extends MessageOrBuilder {
    }

    public interface LTESubscriptionInfoResponseOrBuilder extends MessageOrBuilder {
        LTESubscriptionInfo getInfo();

        LTESubscriptionInfoOrBuilder getInfoOrBuilder();

        LTESubscriptionInfoResponse.ResponseStatus getStatus();

        boolean hasInfo();

        boolean hasStatus();
    }

    public interface MobileCountryOrBuilder extends MessageOrBuilder {
        int getCode();

        String getName();

        ByteString getNameBytes();

        boolean hasCode();

        boolean hasName();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_LTE_LTEService_descriptor = descriptor2;
        internal_static_GDI_Proto_LTE_LTEService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"LteDeviceInfoRequest", "LteDeviceInfoResponse", "LteDeviceStatusRequest", "LteDeviceStatusResponse", "LteServiceActivationNotification", "PhoneInfoRequest", "PhoneInfoResponse", "LteSubscriptionInfoNotification", "LteSubscriptionInfoRequest", "LteSubscriptionInfoResponse", "ApGeofencingNotification", "ApValidationNotification"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_LTE_LTEDeviceInfo_descriptor = descriptor3;
        internal_static_GDI_Proto_LTE_LTEDeviceInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Imei", "Iccid"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_LTE_LTEDeviceInfoRequest_descriptor = descriptor4;
        internal_static_GDI_Proto_LTE_LTEDeviceInfoRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[0]);
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_LTE_LTEDeviceInfoResponse_descriptor = descriptor5;
        internal_static_GDI_Proto_LTE_LTEDeviceInfoResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"ResponseStatus", "LteDeviceInfo", "ModemStatus"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_LTE_LTEDeviceStatusRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_LTE_LTEDeviceStatusRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Timeout"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_LTE_LTEDeviceStatusResponse_descriptor = descriptor7;
        internal_static_GDI_Proto_LTE_LTEDeviceStatusResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"ResponseStatus", "LteDeviceInfo", "ModemStatus"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_LTE_LTEServiceActivationNotification_descriptor = descriptor8;
        internal_static_GDI_Proto_LTE_LTEServiceActivationNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"ServiceProvider", "Status"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_LTE_LTEPhoneInfo_descriptor = descriptor9;
        internal_static_GDI_Proto_LTE_LTEPhoneInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"ServiceProvider"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_LTE_LTEPhoneInfoRequest_descriptor = descriptor10;
        internal_static_GDI_Proto_LTE_LTEPhoneInfoRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[0]);
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_LTE_LTEPhoneInfoResponse_descriptor = descriptor11;
        internal_static_GDI_Proto_LTE_LTEPhoneInfoResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Status", "PhoneInfo"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_LTE_LTESubscriptionInfoRequest_descriptor = descriptor12;
        internal_static_GDI_Proto_LTE_LTESubscriptionInfoRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[0]);
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_LTE_LTESubscriptionInfoResponse_descriptor = descriptor13;
        internal_static_GDI_Proto_LTE_LTESubscriptionInfoResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Status", "Info"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_GDI_Proto_LTE_LTESubscriptionInfoNotification_descriptor = descriptor14;
        internal_static_GDI_Proto_LTE_LTESubscriptionInfoNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Info"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(13);
        internal_static_GDI_Proto_LTE_LTESubscriptionInfo_descriptor = descriptor15;
        internal_static_GDI_Proto_LTE_LTESubscriptionInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"DeviceId", "IsSubscribed", "AccountExpirationUnixTimestamp", "SubscriptionStatus"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(14);
        internal_static_GDI_Proto_LTE_AssistancePlusGeofencingNotification_descriptor = descriptor16;
        internal_static_GDI_Proto_LTE_AssistancePlusGeofencingNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Country", "AssistancePlusCovered"});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(15);
        internal_static_GDI_Proto_LTE_AssistancePlusValidationNotification_descriptor = descriptor17;
        internal_static_GDI_Proto_LTE_AssistancePlusValidationNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{HttpHeaders.LOCATION});
        Descriptors.Descriptor descriptor18 = getDescriptor().getMessageTypes().get(16);
        internal_static_GDI_Proto_LTE_MobileCountry_descriptor = descriptor18;
        internal_static_GDI_Proto_LTE_MobileCountry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"Code", "Name"});
        GDIDataTypes.getDescriptor();
    }

    private GDILTEProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class LTEDeviceInfoRequest extends GeneratedMessageV3 implements LTEDeviceInfoRequestOrBuilder {
        private static final LTEDeviceInfoRequest DEFAULT_INSTANCE = new LTEDeviceInfoRequest();

        @Deprecated
        public static final Parser<LTEDeviceInfoRequest> PARSER = new AbstractParser<LTEDeviceInfoRequest>() { // from class: com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoRequest.1
            @Override // com.google.protobuf.Parser
            public LTEDeviceInfoRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LTEDeviceInfoRequest.newBuilder();
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

        private LTEDeviceInfoRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LTEDeviceInfoRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceInfoRequest_descriptor;
        }

        public static Builder newBuilder(LTEDeviceInfoRequest lTEDeviceInfoRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lTEDeviceInfoRequest);
        }

        public static LTEDeviceInfoRequest parseDelimitedFrom(InputStream inputStream) {
            return (LTEDeviceInfoRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LTEDeviceInfoRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LTEDeviceInfoRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof LTEDeviceInfoRequest) {
                return getUnknownFields().equals(((LTEDeviceInfoRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LTEDeviceInfoRequest> getParserForType() {
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
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LTEDeviceInfoRequest.class, Builder.class);
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
            return new LTEDeviceInfoRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LTEDeviceInfoRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceInfoRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTEDeviceInfoRequest build() {
                LTEDeviceInfoRequest lTEDeviceInfoRequestBuildPartial = buildPartial();
                if (lTEDeviceInfoRequestBuildPartial.isInitialized()) {
                    return lTEDeviceInfoRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) lTEDeviceInfoRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTEDeviceInfoRequest buildPartial() {
                LTEDeviceInfoRequest lTEDeviceInfoRequest = new LTEDeviceInfoRequest(this);
                onBuilt();
                return lTEDeviceInfoRequest;
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
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceInfoRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LTEDeviceInfoRequest.class, Builder.class);
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
            public LTEDeviceInfoRequest getDefaultInstanceForType() {
                return LTEDeviceInfoRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LTEDeviceInfoRequest) {
                    return mergeFrom((LTEDeviceInfoRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LTEDeviceInfoRequest lTEDeviceInfoRequest) {
                if (lTEDeviceInfoRequest == LTEDeviceInfoRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(lTEDeviceInfoRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LTEDeviceInfoRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ LTEDeviceInfoRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private LTEDeviceInfoRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LTEDeviceInfoRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEDeviceInfoRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTEDeviceInfoRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LTEDeviceInfoRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LTEDeviceInfoRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LTEDeviceInfoRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LTEDeviceInfoRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LTEDeviceInfoRequest parseFrom(InputStream inputStream) {
            return (LTEDeviceInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LTEDeviceInfoRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEDeviceInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTEDeviceInfoRequest parseFrom(CodedInputStream codedInputStream) {
            return (LTEDeviceInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LTEDeviceInfoRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEDeviceInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LTEDeviceStatusRequest extends GeneratedMessageV3 implements LTEDeviceStatusRequestOrBuilder {
        private static final LTEDeviceStatusRequest DEFAULT_INSTANCE = new LTEDeviceStatusRequest();

        @Deprecated
        public static final Parser<LTEDeviceStatusRequest> PARSER = new AbstractParser<LTEDeviceStatusRequest>() { // from class: com.garmin.proto.generated.GDILTEProto.LTEDeviceStatusRequest.1
            @Override // com.google.protobuf.Parser
            public LTEDeviceStatusRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LTEDeviceStatusRequest.newBuilder();
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
        public static final int TIMEOUT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int timeout_;

        private LTEDeviceStatusRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.timeout_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LTEDeviceStatusRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceStatusRequest_descriptor;
        }

        public static Builder newBuilder(LTEDeviceStatusRequest lTEDeviceStatusRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lTEDeviceStatusRequest);
        }

        public static LTEDeviceStatusRequest parseDelimitedFrom(InputStream inputStream) {
            return (LTEDeviceStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LTEDeviceStatusRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LTEDeviceStatusRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LTEDeviceStatusRequest)) {
                return super.equals(obj);
            }
            LTEDeviceStatusRequest lTEDeviceStatusRequest = (LTEDeviceStatusRequest) obj;
            if (hasTimeout() != lTEDeviceStatusRequest.hasTimeout()) {
                return false;
            }
            return (!hasTimeout() || getTimeout() == lTEDeviceStatusRequest.getTimeout()) && getUnknownFields().equals(lTEDeviceStatusRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LTEDeviceStatusRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.timeout_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceStatusRequestOrBuilder
        public int getTimeout() {
            return this.timeout_;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceStatusRequestOrBuilder
        public boolean hasTimeout() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTimeout()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTimeout();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LTEDeviceStatusRequest.class, Builder.class);
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
            return new LTEDeviceStatusRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.timeout_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LTEDeviceStatusRequestOrBuilder {
            private int bitField0_;
            private int timeout_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(LTEDeviceStatusRequest lTEDeviceStatusRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    lTEDeviceStatusRequest.timeout_ = this.timeout_;
                } else {
                    i14 = 0;
                }
                lTEDeviceStatusRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTEDeviceStatusRequest build() {
                LTEDeviceStatusRequest lTEDeviceStatusRequestBuildPartial = buildPartial();
                if (lTEDeviceStatusRequestBuildPartial.isInitialized()) {
                    return lTEDeviceStatusRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) lTEDeviceStatusRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTEDeviceStatusRequest buildPartial() {
                LTEDeviceStatusRequest lTEDeviceStatusRequest = new LTEDeviceStatusRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(lTEDeviceStatusRequest);
                }
                onBuilt();
                return lTEDeviceStatusRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.timeout_ = 0;
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

            public Builder clearTimeout() {
                this.bitField0_ &= -2;
                this.timeout_ = 0;
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
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceStatusRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceStatusRequestOrBuilder
            public int getTimeout() {
                return this.timeout_;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceStatusRequestOrBuilder
            public boolean hasTimeout() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LTEDeviceStatusRequest.class, Builder.class);
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
                                    this.timeout_ = codedInputStream.readUInt32();
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

            public Builder setTimeout(int i14) {
                this.timeout_ = i14;
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
            public LTEDeviceStatusRequest getDefaultInstanceForType() {
                return LTEDeviceStatusRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LTEDeviceStatusRequest) {
                    return mergeFrom((LTEDeviceStatusRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LTEDeviceStatusRequest lTEDeviceStatusRequest) {
                if (lTEDeviceStatusRequest == LTEDeviceStatusRequest.getDefaultInstance()) {
                    return this;
                }
                if (lTEDeviceStatusRequest.hasTimeout()) {
                    setTimeout(lTEDeviceStatusRequest.getTimeout());
                }
                mergeUnknownFields(lTEDeviceStatusRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LTEDeviceStatusRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LTEDeviceStatusRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEDeviceStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTEDeviceStatusRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ LTEDeviceStatusRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LTEDeviceStatusRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private LTEDeviceStatusRequest() {
            this.timeout_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LTEDeviceStatusRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LTEDeviceStatusRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LTEDeviceStatusRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LTEDeviceStatusRequest parseFrom(InputStream inputStream) {
            return (LTEDeviceStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LTEDeviceStatusRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEDeviceStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTEDeviceStatusRequest parseFrom(CodedInputStream codedInputStream) {
            return (LTEDeviceStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LTEDeviceStatusRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEDeviceStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LTEPhoneInfoRequest extends GeneratedMessageV3 implements LTEPhoneInfoRequestOrBuilder {
        private static final LTEPhoneInfoRequest DEFAULT_INSTANCE = new LTEPhoneInfoRequest();

        @Deprecated
        public static final Parser<LTEPhoneInfoRequest> PARSER = new AbstractParser<LTEPhoneInfoRequest>() { // from class: com.garmin.proto.generated.GDILTEProto.LTEPhoneInfoRequest.1
            @Override // com.google.protobuf.Parser
            public LTEPhoneInfoRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LTEPhoneInfoRequest.newBuilder();
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

        private LTEPhoneInfoRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LTEPhoneInfoRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTEPhoneInfoRequest_descriptor;
        }

        public static Builder newBuilder(LTEPhoneInfoRequest lTEPhoneInfoRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lTEPhoneInfoRequest);
        }

        public static LTEPhoneInfoRequest parseDelimitedFrom(InputStream inputStream) {
            return (LTEPhoneInfoRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LTEPhoneInfoRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LTEPhoneInfoRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof LTEPhoneInfoRequest) {
                return getUnknownFields().equals(((LTEPhoneInfoRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LTEPhoneInfoRequest> getParserForType() {
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
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTEPhoneInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LTEPhoneInfoRequest.class, Builder.class);
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
            return new LTEPhoneInfoRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LTEPhoneInfoRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEPhoneInfoRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTEPhoneInfoRequest build() {
                LTEPhoneInfoRequest lTEPhoneInfoRequestBuildPartial = buildPartial();
                if (lTEPhoneInfoRequestBuildPartial.isInitialized()) {
                    return lTEPhoneInfoRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) lTEPhoneInfoRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTEPhoneInfoRequest buildPartial() {
                LTEPhoneInfoRequest lTEPhoneInfoRequest = new LTEPhoneInfoRequest(this);
                onBuilt();
                return lTEPhoneInfoRequest;
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
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEPhoneInfoRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEPhoneInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LTEPhoneInfoRequest.class, Builder.class);
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
            public LTEPhoneInfoRequest getDefaultInstanceForType() {
                return LTEPhoneInfoRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LTEPhoneInfoRequest) {
                    return mergeFrom((LTEPhoneInfoRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LTEPhoneInfoRequest lTEPhoneInfoRequest) {
                if (lTEPhoneInfoRequest == LTEPhoneInfoRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(lTEPhoneInfoRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LTEPhoneInfoRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ LTEPhoneInfoRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private LTEPhoneInfoRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LTEPhoneInfoRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEPhoneInfoRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTEPhoneInfoRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LTEPhoneInfoRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LTEPhoneInfoRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LTEPhoneInfoRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LTEPhoneInfoRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LTEPhoneInfoRequest parseFrom(InputStream inputStream) {
            return (LTEPhoneInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LTEPhoneInfoRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEPhoneInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTEPhoneInfoRequest parseFrom(CodedInputStream codedInputStream) {
            return (LTEPhoneInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LTEPhoneInfoRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEPhoneInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LTESubscriptionInfoRequest extends GeneratedMessageV3 implements LTESubscriptionInfoRequestOrBuilder {
        private static final LTESubscriptionInfoRequest DEFAULT_INSTANCE = new LTESubscriptionInfoRequest();

        @Deprecated
        public static final Parser<LTESubscriptionInfoRequest> PARSER = new AbstractParser<LTESubscriptionInfoRequest>() { // from class: com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoRequest.1
            @Override // com.google.protobuf.Parser
            public LTESubscriptionInfoRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LTESubscriptionInfoRequest.newBuilder();
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

        private LTESubscriptionInfoRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LTESubscriptionInfoRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTESubscriptionInfoRequest_descriptor;
        }

        public static Builder newBuilder(LTESubscriptionInfoRequest lTESubscriptionInfoRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lTESubscriptionInfoRequest);
        }

        public static LTESubscriptionInfoRequest parseDelimitedFrom(InputStream inputStream) {
            return (LTESubscriptionInfoRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LTESubscriptionInfoRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LTESubscriptionInfoRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof LTESubscriptionInfoRequest) {
                return getUnknownFields().equals(((LTESubscriptionInfoRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LTESubscriptionInfoRequest> getParserForType() {
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
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTESubscriptionInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LTESubscriptionInfoRequest.class, Builder.class);
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
            return new LTESubscriptionInfoRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LTESubscriptionInfoRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTESubscriptionInfoRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTESubscriptionInfoRequest build() {
                LTESubscriptionInfoRequest lTESubscriptionInfoRequestBuildPartial = buildPartial();
                if (lTESubscriptionInfoRequestBuildPartial.isInitialized()) {
                    return lTESubscriptionInfoRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) lTESubscriptionInfoRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTESubscriptionInfoRequest buildPartial() {
                LTESubscriptionInfoRequest lTESubscriptionInfoRequest = new LTESubscriptionInfoRequest(this);
                onBuilt();
                return lTESubscriptionInfoRequest;
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
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTESubscriptionInfoRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTESubscriptionInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LTESubscriptionInfoRequest.class, Builder.class);
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
            public LTESubscriptionInfoRequest getDefaultInstanceForType() {
                return LTESubscriptionInfoRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LTESubscriptionInfoRequest) {
                    return mergeFrom((LTESubscriptionInfoRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LTESubscriptionInfoRequest lTESubscriptionInfoRequest) {
                if (lTESubscriptionInfoRequest == LTESubscriptionInfoRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(lTESubscriptionInfoRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LTESubscriptionInfoRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ LTESubscriptionInfoRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private LTESubscriptionInfoRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LTESubscriptionInfoRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTESubscriptionInfoRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTESubscriptionInfoRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LTESubscriptionInfoRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LTESubscriptionInfoRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LTESubscriptionInfoRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LTESubscriptionInfoRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LTESubscriptionInfoRequest parseFrom(InputStream inputStream) {
            return (LTESubscriptionInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LTESubscriptionInfoRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTESubscriptionInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTESubscriptionInfoRequest parseFrom(CodedInputStream codedInputStream) {
            return (LTESubscriptionInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LTESubscriptionInfoRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTESubscriptionInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AssistancePlusGeofencingNotification extends GeneratedMessageV3 implements AssistancePlusGeofencingNotificationOrBuilder {
        public static final int ASSISTANCE_PLUS_COVERED_FIELD_NUMBER = 2;
        public static final int COUNTRY_FIELD_NUMBER = 1;
        private static final AssistancePlusGeofencingNotification DEFAULT_INSTANCE = new AssistancePlusGeofencingNotification();

        @Deprecated
        public static final Parser<AssistancePlusGeofencingNotification> PARSER = new AbstractParser<AssistancePlusGeofencingNotification>() { // from class: com.garmin.proto.generated.GDILTEProto.AssistancePlusGeofencingNotification.1
            @Override // com.google.protobuf.Parser
            public AssistancePlusGeofencingNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AssistancePlusGeofencingNotification.newBuilder();
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
        private boolean assistancePlusCovered_;
        private int bitField0_;
        private MobileCountry country_;
        private byte memoizedIsInitialized;

        private AssistancePlusGeofencingNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.assistancePlusCovered_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AssistancePlusGeofencingNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_AssistancePlusGeofencingNotification_descriptor;
        }

        public static Builder newBuilder(AssistancePlusGeofencingNotification assistancePlusGeofencingNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(assistancePlusGeofencingNotification);
        }

        public static AssistancePlusGeofencingNotification parseDelimitedFrom(InputStream inputStream) {
            return (AssistancePlusGeofencingNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AssistancePlusGeofencingNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AssistancePlusGeofencingNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AssistancePlusGeofencingNotification)) {
                return super.equals(obj);
            }
            AssistancePlusGeofencingNotification assistancePlusGeofencingNotification = (AssistancePlusGeofencingNotification) obj;
            if (hasCountry() != assistancePlusGeofencingNotification.hasCountry()) {
                return false;
            }
            if ((!hasCountry() || getCountry().equals(assistancePlusGeofencingNotification.getCountry())) && hasAssistancePlusCovered() == assistancePlusGeofencingNotification.hasAssistancePlusCovered()) {
                return (!hasAssistancePlusCovered() || getAssistancePlusCovered() == assistancePlusGeofencingNotification.getAssistancePlusCovered()) && getUnknownFields().equals(assistancePlusGeofencingNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.AssistancePlusGeofencingNotificationOrBuilder
        public boolean getAssistancePlusCovered() {
            return this.assistancePlusCovered_;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.AssistancePlusGeofencingNotificationOrBuilder
        public MobileCountry getCountry() {
            MobileCountry mobileCountry = this.country_;
            return mobileCountry == null ? MobileCountry.getDefaultInstance() : mobileCountry;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.AssistancePlusGeofencingNotificationOrBuilder
        public MobileCountryOrBuilder getCountryOrBuilder() {
            MobileCountry mobileCountry = this.country_;
            return mobileCountry == null ? MobileCountry.getDefaultInstance() : mobileCountry;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AssistancePlusGeofencingNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCountry()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeBoolSize(2, this.assistancePlusCovered_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.AssistancePlusGeofencingNotificationOrBuilder
        public boolean hasAssistancePlusCovered() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.AssistancePlusGeofencingNotificationOrBuilder
        public boolean hasCountry() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCountry()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCountry().hashCode();
            }
            if (hasAssistancePlusCovered()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getAssistancePlusCovered());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_AssistancePlusGeofencingNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AssistancePlusGeofencingNotification.class, Builder.class);
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
            return new AssistancePlusGeofencingNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getCountry());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.assistancePlusCovered_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AssistancePlusGeofencingNotificationOrBuilder {
            private boolean assistancePlusCovered_;
            private int bitField0_;
            private SingleFieldBuilderV3<MobileCountry, MobileCountry.Builder, MobileCountryOrBuilder> countryBuilder_;
            private MobileCountry country_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(AssistancePlusGeofencingNotification assistancePlusGeofencingNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<MobileCountry, MobileCountry.Builder, MobileCountryOrBuilder> singleFieldBuilderV3 = this.countryBuilder_;
                    assistancePlusGeofencingNotification.country_ = singleFieldBuilderV3 == null ? this.country_ : (MobileCountry) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    assistancePlusGeofencingNotification.assistancePlusCovered_ = this.assistancePlusCovered_;
                    i14 |= 2;
                }
                assistancePlusGeofencingNotification.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<MobileCountry, MobileCountry.Builder, MobileCountryOrBuilder> getCountryFieldBuilder() {
                if (this.countryBuilder_ == null) {
                    this.countryBuilder_ = new SingleFieldBuilderV3<>(getCountry(), getParentForChildren(), isClean());
                    this.country_ = null;
                }
                return this.countryBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_AssistancePlusGeofencingNotification_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getCountryFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AssistancePlusGeofencingNotification build() {
                AssistancePlusGeofencingNotification assistancePlusGeofencingNotificationBuildPartial = buildPartial();
                if (assistancePlusGeofencingNotificationBuildPartial.isInitialized()) {
                    return assistancePlusGeofencingNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) assistancePlusGeofencingNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AssistancePlusGeofencingNotification buildPartial() {
                AssistancePlusGeofencingNotification assistancePlusGeofencingNotification = new AssistancePlusGeofencingNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(assistancePlusGeofencingNotification);
                }
                onBuilt();
                return assistancePlusGeofencingNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.country_ = null;
                SingleFieldBuilderV3<MobileCountry, MobileCountry.Builder, MobileCountryOrBuilder> singleFieldBuilderV3 = this.countryBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.countryBuilder_ = null;
                }
                this.assistancePlusCovered_ = false;
                return this;
            }

            public Builder clearAssistancePlusCovered() {
                this.bitField0_ &= -3;
                this.assistancePlusCovered_ = false;
                onChanged();
                return this;
            }

            public Builder clearCountry() {
                this.bitField0_ &= -2;
                this.country_ = null;
                SingleFieldBuilderV3<MobileCountry, MobileCountry.Builder, MobileCountryOrBuilder> singleFieldBuilderV3 = this.countryBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.countryBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDILTEProto.AssistancePlusGeofencingNotificationOrBuilder
            public boolean getAssistancePlusCovered() {
                return this.assistancePlusCovered_;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.AssistancePlusGeofencingNotificationOrBuilder
            public MobileCountry getCountry() {
                SingleFieldBuilderV3<MobileCountry, MobileCountry.Builder, MobileCountryOrBuilder> singleFieldBuilderV3 = this.countryBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MobileCountry) singleFieldBuilderV3.getMessage();
                }
                MobileCountry mobileCountry = this.country_;
                return mobileCountry == null ? MobileCountry.getDefaultInstance() : mobileCountry;
            }

            public MobileCountry.Builder getCountryBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (MobileCountry.Builder) getCountryFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILTEProto.AssistancePlusGeofencingNotificationOrBuilder
            public MobileCountryOrBuilder getCountryOrBuilder() {
                SingleFieldBuilderV3<MobileCountry, MobileCountry.Builder, MobileCountryOrBuilder> singleFieldBuilderV3 = this.countryBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MobileCountryOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                MobileCountry mobileCountry = this.country_;
                return mobileCountry == null ? MobileCountry.getDefaultInstance() : mobileCountry;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_AssistancePlusGeofencingNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.AssistancePlusGeofencingNotificationOrBuilder
            public boolean hasAssistancePlusCovered() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.AssistancePlusGeofencingNotificationOrBuilder
            public boolean hasCountry() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_AssistancePlusGeofencingNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AssistancePlusGeofencingNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCountry(MobileCountry mobileCountry) {
                MobileCountry mobileCountry2;
                SingleFieldBuilderV3<MobileCountry, MobileCountry.Builder, MobileCountryOrBuilder> singleFieldBuilderV3 = this.countryBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(mobileCountry);
                } else if ((this.bitField0_ & 1) == 0 || (mobileCountry2 = this.country_) == null || mobileCountry2 == MobileCountry.getDefaultInstance()) {
                    this.country_ = mobileCountry;
                } else {
                    getCountryBuilder().mergeFrom(mobileCountry);
                }
                if (this.country_ != null) {
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
                                    codedInputStream.readMessage(getCountryFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.assistancePlusCovered_ = codedInputStream.readBool();
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

            public Builder setAssistancePlusCovered(boolean z14) {
                this.assistancePlusCovered_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCountry(MobileCountry.Builder builder) {
                SingleFieldBuilderV3<MobileCountry, MobileCountry.Builder, MobileCountryOrBuilder> singleFieldBuilderV3 = this.countryBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.country_ = builder.build();
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
            public AssistancePlusGeofencingNotification getDefaultInstanceForType() {
                return AssistancePlusGeofencingNotification.getDefaultInstance();
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

            public Builder setCountry(MobileCountry mobileCountry) {
                SingleFieldBuilderV3<MobileCountry, MobileCountry.Builder, MobileCountryOrBuilder> singleFieldBuilderV3 = this.countryBuilder_;
                if (singleFieldBuilderV3 == null) {
                    mobileCountry.getClass();
                    this.country_ = mobileCountry;
                } else {
                    singleFieldBuilderV3.setMessage(mobileCountry);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AssistancePlusGeofencingNotification) {
                    return mergeFrom((AssistancePlusGeofencingNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AssistancePlusGeofencingNotification assistancePlusGeofencingNotification) {
                if (assistancePlusGeofencingNotification == AssistancePlusGeofencingNotification.getDefaultInstance()) {
                    return this;
                }
                if (assistancePlusGeofencingNotification.hasCountry()) {
                    mergeCountry(assistancePlusGeofencingNotification.getCountry());
                }
                if (assistancePlusGeofencingNotification.hasAssistancePlusCovered()) {
                    setAssistancePlusCovered(assistancePlusGeofencingNotification.getAssistancePlusCovered());
                }
                mergeUnknownFields(assistancePlusGeofencingNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AssistancePlusGeofencingNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AssistancePlusGeofencingNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AssistancePlusGeofencingNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AssistancePlusGeofencingNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ AssistancePlusGeofencingNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static AssistancePlusGeofencingNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private AssistancePlusGeofencingNotification() {
            this.assistancePlusCovered_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AssistancePlusGeofencingNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AssistancePlusGeofencingNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AssistancePlusGeofencingNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AssistancePlusGeofencingNotification parseFrom(InputStream inputStream) {
            return (AssistancePlusGeofencingNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AssistancePlusGeofencingNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AssistancePlusGeofencingNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AssistancePlusGeofencingNotification parseFrom(CodedInputStream codedInputStream) {
            return (AssistancePlusGeofencingNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AssistancePlusGeofencingNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AssistancePlusGeofencingNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AssistancePlusValidationNotification extends GeneratedMessageV3 implements AssistancePlusValidationNotificationOrBuilder {
        public static final int LOCATION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private GDIDataTypes.ScPoint location_;
        private byte memoizedIsInitialized;
        private static final AssistancePlusValidationNotification DEFAULT_INSTANCE = new AssistancePlusValidationNotification();

        @Deprecated
        public static final Parser<AssistancePlusValidationNotification> PARSER = new AbstractParser<AssistancePlusValidationNotification>() { // from class: com.garmin.proto.generated.GDILTEProto.AssistancePlusValidationNotification.1
            @Override // com.google.protobuf.Parser
            public AssistancePlusValidationNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AssistancePlusValidationNotification.newBuilder();
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

        private AssistancePlusValidationNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AssistancePlusValidationNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_AssistancePlusValidationNotification_descriptor;
        }

        public static Builder newBuilder(AssistancePlusValidationNotification assistancePlusValidationNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(assistancePlusValidationNotification);
        }

        public static AssistancePlusValidationNotification parseDelimitedFrom(InputStream inputStream) {
            return (AssistancePlusValidationNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AssistancePlusValidationNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AssistancePlusValidationNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AssistancePlusValidationNotification)) {
                return super.equals(obj);
            }
            AssistancePlusValidationNotification assistancePlusValidationNotification = (AssistancePlusValidationNotification) obj;
            if (hasLocation() != assistancePlusValidationNotification.hasLocation()) {
                return false;
            }
            return (!hasLocation() || getLocation().equals(assistancePlusValidationNotification.getLocation())) && getUnknownFields().equals(assistancePlusValidationNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDILTEProto.AssistancePlusValidationNotificationOrBuilder
        public GDIDataTypes.ScPoint getLocation() {
            GDIDataTypes.ScPoint scPoint = this.location_;
            return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.AssistancePlusValidationNotificationOrBuilder
        public GDIDataTypes.ScPointOrBuilder getLocationOrBuilder() {
            GDIDataTypes.ScPoint scPoint = this.location_;
            return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AssistancePlusValidationNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getLocation()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.AssistancePlusValidationNotificationOrBuilder
        public boolean hasLocation() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasLocation()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getLocation().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_AssistancePlusValidationNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AssistancePlusValidationNotification.class, Builder.class);
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
            if (!hasLocation() || getLocation().isInitialized()) {
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
            return new AssistancePlusValidationNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getLocation());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AssistancePlusValidationNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> locationBuilder_;
            private GDIDataTypes.ScPoint location_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(AssistancePlusValidationNotification assistancePlusValidationNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                    assistancePlusValidationNotification.location_ = singleFieldBuilderV3 == null ? this.location_ : (GDIDataTypes.ScPoint) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                assistancePlusValidationNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_AssistancePlusValidationNotification_descriptor;
            }

            private SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> getLocationFieldBuilder() {
                if (this.locationBuilder_ == null) {
                    this.locationBuilder_ = new SingleFieldBuilderV3<>(getLocation(), getParentForChildren(), isClean());
                    this.location_ = null;
                }
                return this.locationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getLocationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AssistancePlusValidationNotification build() {
                AssistancePlusValidationNotification assistancePlusValidationNotificationBuildPartial = buildPartial();
                if (assistancePlusValidationNotificationBuildPartial.isInitialized()) {
                    return assistancePlusValidationNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) assistancePlusValidationNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AssistancePlusValidationNotification buildPartial() {
                AssistancePlusValidationNotification assistancePlusValidationNotification = new AssistancePlusValidationNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(assistancePlusValidationNotification);
                }
                onBuilt();
                return assistancePlusValidationNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.location_ = null;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.locationBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLocation() {
                this.bitField0_ &= -2;
                this.location_ = null;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.locationBuilder_ = null;
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
                return GDILTEProto.internal_static_GDI_Proto_LTE_AssistancePlusValidationNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.AssistancePlusValidationNotificationOrBuilder
            public GDIDataTypes.ScPoint getLocation() {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.ScPoint) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.ScPoint scPoint = this.location_;
                return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
            }

            public GDIDataTypes.ScPoint.Builder getLocationBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GDIDataTypes.ScPoint.Builder) getLocationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILTEProto.AssistancePlusValidationNotificationOrBuilder
            public GDIDataTypes.ScPointOrBuilder getLocationOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.ScPointOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.ScPoint scPoint = this.location_;
                return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.AssistancePlusValidationNotificationOrBuilder
            public boolean hasLocation() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_AssistancePlusValidationNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AssistancePlusValidationNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasLocation() || getLocation().isInitialized();
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
                                    codedInputStream.readMessage(getLocationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeLocation(GDIDataTypes.ScPoint scPoint) {
                GDIDataTypes.ScPoint scPoint2;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(scPoint);
                } else if ((this.bitField0_ & 1) == 0 || (scPoint2 = this.location_) == null || scPoint2 == GDIDataTypes.ScPoint.getDefaultInstance()) {
                    this.location_ = scPoint;
                } else {
                    getLocationBuilder().mergeFrom(scPoint);
                }
                if (this.location_ != null) {
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

            public Builder setLocation(GDIDataTypes.ScPoint.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.location_ = builder.build();
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
            public AssistancePlusValidationNotification getDefaultInstanceForType() {
                return AssistancePlusValidationNotification.getDefaultInstance();
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

            public Builder setLocation(GDIDataTypes.ScPoint scPoint) {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    scPoint.getClass();
                    this.location_ = scPoint;
                } else {
                    singleFieldBuilderV3.setMessage(scPoint);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AssistancePlusValidationNotification) {
                    return mergeFrom((AssistancePlusValidationNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AssistancePlusValidationNotification assistancePlusValidationNotification) {
                if (assistancePlusValidationNotification == AssistancePlusValidationNotification.getDefaultInstance()) {
                    return this;
                }
                if (assistancePlusValidationNotification.hasLocation()) {
                    mergeLocation(assistancePlusValidationNotification.getLocation());
                }
                mergeUnknownFields(assistancePlusValidationNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AssistancePlusValidationNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ AssistancePlusValidationNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private AssistancePlusValidationNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AssistancePlusValidationNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AssistancePlusValidationNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AssistancePlusValidationNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AssistancePlusValidationNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AssistancePlusValidationNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AssistancePlusValidationNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AssistancePlusValidationNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AssistancePlusValidationNotification parseFrom(InputStream inputStream) {
            return (AssistancePlusValidationNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AssistancePlusValidationNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AssistancePlusValidationNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AssistancePlusValidationNotification parseFrom(CodedInputStream codedInputStream) {
            return (AssistancePlusValidationNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AssistancePlusValidationNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AssistancePlusValidationNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LTEDeviceInfo extends GeneratedMessageV3 implements LTEDeviceInfoOrBuilder {
        public static final int ICCID_FIELD_NUMBER = 2;
        public static final int IMEI_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object iccid_;
        private volatile Object imei_;
        private byte memoizedIsInitialized;
        private static final LTEDeviceInfo DEFAULT_INSTANCE = new LTEDeviceInfo();

        @Deprecated
        public static final Parser<LTEDeviceInfo> PARSER = new AbstractParser<LTEDeviceInfo>() { // from class: com.garmin.proto.generated.GDILTEProto.LTEDeviceInfo.1
            @Override // com.google.protobuf.Parser
            public LTEDeviceInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LTEDeviceInfo.newBuilder();
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

        private LTEDeviceInfo() {
            this.imei_ = "";
            this.iccid_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.imei_ = "";
            this.iccid_ = "";
        }

        public static LTEDeviceInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceInfo_descriptor;
        }

        public static Builder newBuilder(LTEDeviceInfo lTEDeviceInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lTEDeviceInfo);
        }

        public static LTEDeviceInfo parseDelimitedFrom(InputStream inputStream) {
            return (LTEDeviceInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LTEDeviceInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LTEDeviceInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LTEDeviceInfo)) {
                return super.equals(obj);
            }
            LTEDeviceInfo lTEDeviceInfo = (LTEDeviceInfo) obj;
            if (hasImei() != lTEDeviceInfo.hasImei()) {
                return false;
            }
            if ((!hasImei() || getImei().equals(lTEDeviceInfo.getImei())) && hasIccid() == lTEDeviceInfo.hasIccid()) {
                return (!hasIccid() || getIccid().equals(lTEDeviceInfo.getIccid())) && getUnknownFields().equals(lTEDeviceInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoOrBuilder
        public String getIccid() {
            Object obj = this.iccid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.iccid_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoOrBuilder
        public ByteString getIccidBytes() {
            Object obj = this.iccid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.iccid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoOrBuilder
        public String getImei() {
            Object obj = this.imei_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.imei_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoOrBuilder
        public ByteString getImeiBytes() {
            Object obj = this.imei_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.imei_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LTEDeviceInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.imei_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.iccid_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoOrBuilder
        public boolean hasIccid() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoOrBuilder
        public boolean hasImei() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasImei()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getImei().hashCode();
            }
            if (hasIccid()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getIccid().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(LTEDeviceInfo.class, Builder.class);
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
            if (!hasImei()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasIccid()) {
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
            return new LTEDeviceInfo();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.imei_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.iccid_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LTEDeviceInfoOrBuilder {
            private int bitField0_;
            private Object iccid_;
            private Object imei_;

            private Builder() {
                this.imei_ = "";
                this.iccid_ = "";
            }

            private void buildPartial0(LTEDeviceInfo lTEDeviceInfo) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    lTEDeviceInfo.imei_ = this.imei_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    lTEDeviceInfo.iccid_ = this.iccid_;
                    i14 |= 2;
                }
                lTEDeviceInfo.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceInfo_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTEDeviceInfo build() {
                LTEDeviceInfo lTEDeviceInfoBuildPartial = buildPartial();
                if (lTEDeviceInfoBuildPartial.isInitialized()) {
                    return lTEDeviceInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) lTEDeviceInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTEDeviceInfo buildPartial() {
                LTEDeviceInfo lTEDeviceInfo = new LTEDeviceInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(lTEDeviceInfo);
                }
                onBuilt();
                return lTEDeviceInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.imei_ = "";
                this.iccid_ = "";
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIccid() {
                this.iccid_ = LTEDeviceInfo.getDefaultInstance().getIccid();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearImei() {
                this.imei_ = LTEDeviceInfo.getDefaultInstance().getImei();
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
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceInfo_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoOrBuilder
            public String getIccid() {
                Object obj = this.iccid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.iccid_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoOrBuilder
            public ByteString getIccidBytes() {
                Object obj = this.iccid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.iccid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoOrBuilder
            public String getImei() {
                Object obj = this.imei_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.imei_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoOrBuilder
            public ByteString getImeiBytes() {
                Object obj = this.imei_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.imei_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoOrBuilder
            public boolean hasIccid() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoOrBuilder
            public boolean hasImei() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(LTEDeviceInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasImei() && hasIccid();
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
                                    this.imei_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.iccid_ = codedInputStream.readBytes();
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

            public Builder setIccid(String str) {
                str.getClass();
                this.iccid_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setIccidBytes(ByteString byteString) {
                byteString.getClass();
                this.iccid_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setImei(String str) {
                str.getClass();
                this.imei_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setImeiBytes(ByteString byteString) {
                byteString.getClass();
                this.imei_ = byteString;
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
            public LTEDeviceInfo getDefaultInstanceForType() {
                return LTEDeviceInfo.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.imei_ = "";
                this.iccid_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LTEDeviceInfo) {
                    return mergeFrom((LTEDeviceInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LTEDeviceInfo lTEDeviceInfo) {
                if (lTEDeviceInfo == LTEDeviceInfo.getDefaultInstance()) {
                    return this;
                }
                if (lTEDeviceInfo.hasImei()) {
                    this.imei_ = lTEDeviceInfo.imei_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (lTEDeviceInfo.hasIccid()) {
                    this.iccid_ = lTEDeviceInfo.iccid_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(lTEDeviceInfo.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LTEDeviceInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LTEDeviceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEDeviceInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTEDeviceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LTEDeviceInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LTEDeviceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LTEDeviceInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LTEDeviceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LTEDeviceInfo parseFrom(InputStream inputStream) {
            return (LTEDeviceInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LTEDeviceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEDeviceInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private LTEDeviceInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.imei_ = "";
            this.iccid_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LTEDeviceInfo parseFrom(CodedInputStream codedInputStream) {
            return (LTEDeviceInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LTEDeviceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEDeviceInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ LTEDeviceInfo(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class LTEDeviceInfoResponse extends GeneratedMessageV3 implements LTEDeviceInfoResponseOrBuilder {
        public static final int LTE_DEVICE_INFO_FIELD_NUMBER = 2;
        public static final int MODEM_STATUS_FIELD_NUMBER = 3;
        public static final int RESPONSE_STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private LTEDeviceInfo lteDeviceInfo_;
        private byte memoizedIsInitialized;
        private int modemStatus_;
        private int responseStatus_;
        private static final LTEDeviceInfoResponse DEFAULT_INSTANCE = new LTEDeviceInfoResponse();

        @Deprecated
        public static final Parser<LTEDeviceInfoResponse> PARSER = new AbstractParser<LTEDeviceInfoResponse>() { // from class: com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoResponse.1
            @Override // com.google.protobuf.Parser
            public LTEDeviceInfoResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LTEDeviceInfoResponse.newBuilder();
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

        private LTEDeviceInfoResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.responseStatus_ = 0;
            this.modemStatus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LTEDeviceInfoResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceInfoResponse_descriptor;
        }

        public static Builder newBuilder(LTEDeviceInfoResponse lTEDeviceInfoResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lTEDeviceInfoResponse);
        }

        public static LTEDeviceInfoResponse parseDelimitedFrom(InputStream inputStream) {
            return (LTEDeviceInfoResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LTEDeviceInfoResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LTEDeviceInfoResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LTEDeviceInfoResponse)) {
                return super.equals(obj);
            }
            LTEDeviceInfoResponse lTEDeviceInfoResponse = (LTEDeviceInfoResponse) obj;
            if (hasResponseStatus() != lTEDeviceInfoResponse.hasResponseStatus()) {
                return false;
            }
            if ((hasResponseStatus() && this.responseStatus_ != lTEDeviceInfoResponse.responseStatus_) || hasLteDeviceInfo() != lTEDeviceInfoResponse.hasLteDeviceInfo()) {
                return false;
            }
            if ((!hasLteDeviceInfo() || getLteDeviceInfo().equals(lTEDeviceInfoResponse.getLteDeviceInfo())) && hasModemStatus() == lTEDeviceInfoResponse.hasModemStatus()) {
                return (!hasModemStatus() || this.modemStatus_ == lTEDeviceInfoResponse.modemStatus_) && getUnknownFields().equals(lTEDeviceInfoResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoResponseOrBuilder
        public LTEDeviceInfo getLteDeviceInfo() {
            LTEDeviceInfo lTEDeviceInfo = this.lteDeviceInfo_;
            return lTEDeviceInfo == null ? LTEDeviceInfo.getDefaultInstance() : lTEDeviceInfo;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoResponseOrBuilder
        public LTEDeviceInfoOrBuilder getLteDeviceInfoOrBuilder() {
            LTEDeviceInfo lTEDeviceInfo = this.lteDeviceInfo_;
            return lTEDeviceInfo == null ? LTEDeviceInfo.getDefaultInstance() : lTEDeviceInfo;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoResponseOrBuilder
        public LTEModemStatus getModemStatus() {
            LTEModemStatus lTEModemStatusForNumber = LTEModemStatus.forNumber(this.modemStatus_);
            return lTEModemStatusForNumber == null ? LTEModemStatus.UNKNOWN : lTEModemStatusForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LTEDeviceInfoResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoResponseOrBuilder
        public ResponseStatus getResponseStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.responseStatus_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.responseStatus_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getLteDeviceInfo());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(3, this.modemStatus_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoResponseOrBuilder
        public boolean hasLteDeviceInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoResponseOrBuilder
        public boolean hasModemStatus() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoResponseOrBuilder
        public boolean hasResponseStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResponseStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.responseStatus_;
            }
            if (hasLteDeviceInfo()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getLteDeviceInfo().hashCode();
            }
            if (hasModemStatus()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.modemStatus_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(LTEDeviceInfoResponse.class, Builder.class);
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
            if (!hasResponseStatus()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasLteDeviceInfo() || getLteDeviceInfo().isInitialized()) {
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
            return new LTEDeviceInfoResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.responseStatus_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getLteDeviceInfo());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.modemStatus_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LTEDeviceInfoResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<LTEDeviceInfo, LTEDeviceInfo.Builder, LTEDeviceInfoOrBuilder> lteDeviceInfoBuilder_;
            private LTEDeviceInfo lteDeviceInfo_;
            private int modemStatus_;
            private int responseStatus_;

            private Builder() {
                this.responseStatus_ = 0;
                this.modemStatus_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(LTEDeviceInfoResponse lTEDeviceInfoResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    lTEDeviceInfoResponse.responseStatus_ = this.responseStatus_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<LTEDeviceInfo, LTEDeviceInfo.Builder, LTEDeviceInfoOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoBuilder_;
                    lTEDeviceInfoResponse.lteDeviceInfo_ = singleFieldBuilderV3 == null ? this.lteDeviceInfo_ : (LTEDeviceInfo) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    lTEDeviceInfoResponse.modemStatus_ = this.modemStatus_;
                    i14 |= 4;
                }
                lTEDeviceInfoResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceInfoResponse_descriptor;
            }

            private SingleFieldBuilderV3<LTEDeviceInfo, LTEDeviceInfo.Builder, LTEDeviceInfoOrBuilder> getLteDeviceInfoFieldBuilder() {
                if (this.lteDeviceInfoBuilder_ == null) {
                    this.lteDeviceInfoBuilder_ = new SingleFieldBuilderV3<>(getLteDeviceInfo(), getParentForChildren(), isClean());
                    this.lteDeviceInfo_ = null;
                }
                return this.lteDeviceInfoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getLteDeviceInfoFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTEDeviceInfoResponse build() {
                LTEDeviceInfoResponse lTEDeviceInfoResponseBuildPartial = buildPartial();
                if (lTEDeviceInfoResponseBuildPartial.isInitialized()) {
                    return lTEDeviceInfoResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) lTEDeviceInfoResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTEDeviceInfoResponse buildPartial() {
                LTEDeviceInfoResponse lTEDeviceInfoResponse = new LTEDeviceInfoResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(lTEDeviceInfoResponse);
                }
                onBuilt();
                return lTEDeviceInfoResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.responseStatus_ = 0;
                this.lteDeviceInfo_ = null;
                SingleFieldBuilderV3<LTEDeviceInfo, LTEDeviceInfo.Builder, LTEDeviceInfoOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.lteDeviceInfoBuilder_ = null;
                }
                this.modemStatus_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLteDeviceInfo() {
                this.bitField0_ &= -3;
                this.lteDeviceInfo_ = null;
                SingleFieldBuilderV3<LTEDeviceInfo, LTEDeviceInfo.Builder, LTEDeviceInfoOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.lteDeviceInfoBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearModemStatus() {
                this.bitField0_ &= -5;
                this.modemStatus_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearResponseStatus() {
                this.bitField0_ &= -2;
                this.responseStatus_ = 0;
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
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceInfoResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoResponseOrBuilder
            public LTEDeviceInfo getLteDeviceInfo() {
                SingleFieldBuilderV3<LTEDeviceInfo, LTEDeviceInfo.Builder, LTEDeviceInfoOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTEDeviceInfo) singleFieldBuilderV3.getMessage();
                }
                LTEDeviceInfo lTEDeviceInfo = this.lteDeviceInfo_;
                return lTEDeviceInfo == null ? LTEDeviceInfo.getDefaultInstance() : lTEDeviceInfo;
            }

            public LTEDeviceInfo.Builder getLteDeviceInfoBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (LTEDeviceInfo.Builder) getLteDeviceInfoFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoResponseOrBuilder
            public LTEDeviceInfoOrBuilder getLteDeviceInfoOrBuilder() {
                SingleFieldBuilderV3<LTEDeviceInfo, LTEDeviceInfo.Builder, LTEDeviceInfoOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTEDeviceInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LTEDeviceInfo lTEDeviceInfo = this.lteDeviceInfo_;
                return lTEDeviceInfo == null ? LTEDeviceInfo.getDefaultInstance() : lTEDeviceInfo;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoResponseOrBuilder
            public LTEModemStatus getModemStatus() {
                LTEModemStatus lTEModemStatusForNumber = LTEModemStatus.forNumber(this.modemStatus_);
                return lTEModemStatusForNumber == null ? LTEModemStatus.UNKNOWN : lTEModemStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoResponseOrBuilder
            public ResponseStatus getResponseStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.responseStatus_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoResponseOrBuilder
            public boolean hasLteDeviceInfo() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoResponseOrBuilder
            public boolean hasModemStatus() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoResponseOrBuilder
            public boolean hasResponseStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(LTEDeviceInfoResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasResponseStatus()) {
                    return !hasLteDeviceInfo() || getLteDeviceInfo().isInitialized();
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
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.responseStatus_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getLteDeviceInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i15 = codedInputStream.readEnum();
                                    if (LTEModemStatus.forNumber(i15) == null) {
                                        mergeUnknownVarintField(3, i15);
                                    } else {
                                        this.modemStatus_ = i15;
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

            public Builder mergeLteDeviceInfo(LTEDeviceInfo lTEDeviceInfo) {
                LTEDeviceInfo lTEDeviceInfo2;
                SingleFieldBuilderV3<LTEDeviceInfo, LTEDeviceInfo.Builder, LTEDeviceInfoOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(lTEDeviceInfo);
                } else if ((this.bitField0_ & 2) == 0 || (lTEDeviceInfo2 = this.lteDeviceInfo_) == null || lTEDeviceInfo2 == LTEDeviceInfo.getDefaultInstance()) {
                    this.lteDeviceInfo_ = lTEDeviceInfo;
                } else {
                    getLteDeviceInfoBuilder().mergeFrom(lTEDeviceInfo);
                }
                if (this.lteDeviceInfo_ != null) {
                    this.bitField0_ |= 2;
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

            public Builder setLteDeviceInfo(LTEDeviceInfo.Builder builder) {
                SingleFieldBuilderV3<LTEDeviceInfo, LTEDeviceInfo.Builder, LTEDeviceInfoOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.lteDeviceInfo_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setModemStatus(LTEModemStatus lTEModemStatus) {
                lTEModemStatus.getClass();
                this.bitField0_ |= 4;
                this.modemStatus_ = lTEModemStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setResponseStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 1;
                this.responseStatus_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LTEDeviceInfoResponse getDefaultInstanceForType() {
                return LTEDeviceInfoResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.responseStatus_ = 0;
                this.modemStatus_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setLteDeviceInfo(LTEDeviceInfo lTEDeviceInfo) {
                SingleFieldBuilderV3<LTEDeviceInfo, LTEDeviceInfo.Builder, LTEDeviceInfoOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    lTEDeviceInfo.getClass();
                    this.lteDeviceInfo_ = lTEDeviceInfo;
                } else {
                    singleFieldBuilderV3.setMessage(lTEDeviceInfo);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LTEDeviceInfoResponse) {
                    return mergeFrom((LTEDeviceInfoResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LTEDeviceInfoResponse lTEDeviceInfoResponse) {
                if (lTEDeviceInfoResponse == LTEDeviceInfoResponse.getDefaultInstance()) {
                    return this;
                }
                if (lTEDeviceInfoResponse.hasResponseStatus()) {
                    setResponseStatus(lTEDeviceInfoResponse.getResponseStatus());
                }
                if (lTEDeviceInfoResponse.hasLteDeviceInfo()) {
                    mergeLteDeviceInfo(lTEDeviceInfoResponse.getLteDeviceInfo());
                }
                if (lTEDeviceInfoResponse.hasModemStatus()) {
                    setModemStatus(lTEDeviceInfoResponse.getModemStatus());
                }
                mergeUnknownFields(lTEDeviceInfoResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LTEDeviceInfoResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LTEDeviceInfoResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEDeviceInfoResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTEDeviceInfoResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LTEDeviceInfoResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LTEDeviceInfoResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ LTEDeviceInfoResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LTEDeviceInfoResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private LTEDeviceInfoResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.responseStatus_ = 0;
            this.modemStatus_ = 0;
        }

        public static LTEDeviceInfoResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LTEDeviceInfoResponse parseFrom(InputStream inputStream) {
            return (LTEDeviceInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LTEDeviceInfoResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEDeviceInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTEDeviceInfoResponse parseFrom(CodedInputStream codedInputStream) {
            return (LTEDeviceInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LTEDeviceInfoResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEDeviceInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            OK(1),
            NOT_AN_LTE_DEVICE(2),
            ERROR(3);

            public static final int ERROR_VALUE = 3;
            public static final int NOT_AN_LTE_DEVICE_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDILTEProto.LTEDeviceInfoResponse.ResponseStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ResponseStatus findValueByNumber(int i14) {
                    return ResponseStatus.forNumber(i14);
                }
            };
            private static final ResponseStatus[] VALUES = values();

            ResponseStatus(int i14) {
                this.value = i14;
            }

            public static ResponseStatus forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return OK;
                }
                if (i14 == 2) {
                    return NOT_AN_LTE_DEVICE;
                }
                if (i14 != 3) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return LTEDeviceInfoResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ResponseStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ResponseStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ResponseStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class LTEDeviceStatusResponse extends GeneratedMessageV3 implements LTEDeviceStatusResponseOrBuilder {
        public static final int LTE_DEVICE_INFO_FIELD_NUMBER = 2;
        public static final int MODEM_STATUS_FIELD_NUMBER = 3;
        public static final int RESPONSE_STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private LTEDeviceInfo lteDeviceInfo_;
        private byte memoizedIsInitialized;
        private int modemStatus_;
        private int responseStatus_;
        private static final LTEDeviceStatusResponse DEFAULT_INSTANCE = new LTEDeviceStatusResponse();

        @Deprecated
        public static final Parser<LTEDeviceStatusResponse> PARSER = new AbstractParser<LTEDeviceStatusResponse>() { // from class: com.garmin.proto.generated.GDILTEProto.LTEDeviceStatusResponse.1
            @Override // com.google.protobuf.Parser
            public LTEDeviceStatusResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LTEDeviceStatusResponse.newBuilder();
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

        private LTEDeviceStatusResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.responseStatus_ = 0;
            this.modemStatus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LTEDeviceStatusResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceStatusResponse_descriptor;
        }

        public static Builder newBuilder(LTEDeviceStatusResponse lTEDeviceStatusResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lTEDeviceStatusResponse);
        }

        public static LTEDeviceStatusResponse parseDelimitedFrom(InputStream inputStream) {
            return (LTEDeviceStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LTEDeviceStatusResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LTEDeviceStatusResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LTEDeviceStatusResponse)) {
                return super.equals(obj);
            }
            LTEDeviceStatusResponse lTEDeviceStatusResponse = (LTEDeviceStatusResponse) obj;
            if (hasResponseStatus() != lTEDeviceStatusResponse.hasResponseStatus()) {
                return false;
            }
            if ((hasResponseStatus() && this.responseStatus_ != lTEDeviceStatusResponse.responseStatus_) || hasLteDeviceInfo() != lTEDeviceStatusResponse.hasLteDeviceInfo()) {
                return false;
            }
            if ((!hasLteDeviceInfo() || getLteDeviceInfo().equals(lTEDeviceStatusResponse.getLteDeviceInfo())) && hasModemStatus() == lTEDeviceStatusResponse.hasModemStatus()) {
                return (!hasModemStatus() || this.modemStatus_ == lTEDeviceStatusResponse.modemStatus_) && getUnknownFields().equals(lTEDeviceStatusResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceStatusResponseOrBuilder
        public LTEDeviceInfo getLteDeviceInfo() {
            LTEDeviceInfo lTEDeviceInfo = this.lteDeviceInfo_;
            return lTEDeviceInfo == null ? LTEDeviceInfo.getDefaultInstance() : lTEDeviceInfo;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceStatusResponseOrBuilder
        public LTEDeviceInfoOrBuilder getLteDeviceInfoOrBuilder() {
            LTEDeviceInfo lTEDeviceInfo = this.lteDeviceInfo_;
            return lTEDeviceInfo == null ? LTEDeviceInfo.getDefaultInstance() : lTEDeviceInfo;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceStatusResponseOrBuilder
        public LTEModemStatus getModemStatus() {
            LTEModemStatus lTEModemStatusForNumber = LTEModemStatus.forNumber(this.modemStatus_);
            return lTEModemStatusForNumber == null ? LTEModemStatus.UNKNOWN : lTEModemStatusForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LTEDeviceStatusResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceStatusResponseOrBuilder
        public ResponseStatus getResponseStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.responseStatus_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.responseStatus_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getLteDeviceInfo());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(3, this.modemStatus_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceStatusResponseOrBuilder
        public boolean hasLteDeviceInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceStatusResponseOrBuilder
        public boolean hasModemStatus() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceStatusResponseOrBuilder
        public boolean hasResponseStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResponseStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.responseStatus_;
            }
            if (hasLteDeviceInfo()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getLteDeviceInfo().hashCode();
            }
            if (hasModemStatus()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.modemStatus_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(LTEDeviceStatusResponse.class, Builder.class);
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
            if (!hasResponseStatus()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasLteDeviceInfo() || getLteDeviceInfo().isInitialized()) {
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
            return new LTEDeviceStatusResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.responseStatus_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getLteDeviceInfo());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.modemStatus_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LTEDeviceStatusResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<LTEDeviceInfo, LTEDeviceInfo.Builder, LTEDeviceInfoOrBuilder> lteDeviceInfoBuilder_;
            private LTEDeviceInfo lteDeviceInfo_;
            private int modemStatus_;
            private int responseStatus_;

            private Builder() {
                this.responseStatus_ = 0;
                this.modemStatus_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(LTEDeviceStatusResponse lTEDeviceStatusResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    lTEDeviceStatusResponse.responseStatus_ = this.responseStatus_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<LTEDeviceInfo, LTEDeviceInfo.Builder, LTEDeviceInfoOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoBuilder_;
                    lTEDeviceStatusResponse.lteDeviceInfo_ = singleFieldBuilderV3 == null ? this.lteDeviceInfo_ : (LTEDeviceInfo) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    lTEDeviceStatusResponse.modemStatus_ = this.modemStatus_;
                    i14 |= 4;
                }
                lTEDeviceStatusResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceStatusResponse_descriptor;
            }

            private SingleFieldBuilderV3<LTEDeviceInfo, LTEDeviceInfo.Builder, LTEDeviceInfoOrBuilder> getLteDeviceInfoFieldBuilder() {
                if (this.lteDeviceInfoBuilder_ == null) {
                    this.lteDeviceInfoBuilder_ = new SingleFieldBuilderV3<>(getLteDeviceInfo(), getParentForChildren(), isClean());
                    this.lteDeviceInfo_ = null;
                }
                return this.lteDeviceInfoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getLteDeviceInfoFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTEDeviceStatusResponse build() {
                LTEDeviceStatusResponse lTEDeviceStatusResponseBuildPartial = buildPartial();
                if (lTEDeviceStatusResponseBuildPartial.isInitialized()) {
                    return lTEDeviceStatusResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) lTEDeviceStatusResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTEDeviceStatusResponse buildPartial() {
                LTEDeviceStatusResponse lTEDeviceStatusResponse = new LTEDeviceStatusResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(lTEDeviceStatusResponse);
                }
                onBuilt();
                return lTEDeviceStatusResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.responseStatus_ = 0;
                this.lteDeviceInfo_ = null;
                SingleFieldBuilderV3<LTEDeviceInfo, LTEDeviceInfo.Builder, LTEDeviceInfoOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.lteDeviceInfoBuilder_ = null;
                }
                this.modemStatus_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLteDeviceInfo() {
                this.bitField0_ &= -3;
                this.lteDeviceInfo_ = null;
                SingleFieldBuilderV3<LTEDeviceInfo, LTEDeviceInfo.Builder, LTEDeviceInfoOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.lteDeviceInfoBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearModemStatus() {
                this.bitField0_ &= -5;
                this.modemStatus_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearResponseStatus() {
                this.bitField0_ &= -2;
                this.responseStatus_ = 0;
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
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceStatusResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceStatusResponseOrBuilder
            public LTEDeviceInfo getLteDeviceInfo() {
                SingleFieldBuilderV3<LTEDeviceInfo, LTEDeviceInfo.Builder, LTEDeviceInfoOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTEDeviceInfo) singleFieldBuilderV3.getMessage();
                }
                LTEDeviceInfo lTEDeviceInfo = this.lteDeviceInfo_;
                return lTEDeviceInfo == null ? LTEDeviceInfo.getDefaultInstance() : lTEDeviceInfo;
            }

            public LTEDeviceInfo.Builder getLteDeviceInfoBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (LTEDeviceInfo.Builder) getLteDeviceInfoFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceStatusResponseOrBuilder
            public LTEDeviceInfoOrBuilder getLteDeviceInfoOrBuilder() {
                SingleFieldBuilderV3<LTEDeviceInfo, LTEDeviceInfo.Builder, LTEDeviceInfoOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTEDeviceInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LTEDeviceInfo lTEDeviceInfo = this.lteDeviceInfo_;
                return lTEDeviceInfo == null ? LTEDeviceInfo.getDefaultInstance() : lTEDeviceInfo;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceStatusResponseOrBuilder
            public LTEModemStatus getModemStatus() {
                LTEModemStatus lTEModemStatusForNumber = LTEModemStatus.forNumber(this.modemStatus_);
                return lTEModemStatusForNumber == null ? LTEModemStatus.UNKNOWN : lTEModemStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceStatusResponseOrBuilder
            public ResponseStatus getResponseStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.responseStatus_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceStatusResponseOrBuilder
            public boolean hasLteDeviceInfo() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceStatusResponseOrBuilder
            public boolean hasModemStatus() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEDeviceStatusResponseOrBuilder
            public boolean hasResponseStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEDeviceStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(LTEDeviceStatusResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasResponseStatus()) {
                    return !hasLteDeviceInfo() || getLteDeviceInfo().isInitialized();
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
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.responseStatus_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getLteDeviceInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i15 = codedInputStream.readEnum();
                                    if (LTEModemStatus.forNumber(i15) == null) {
                                        mergeUnknownVarintField(3, i15);
                                    } else {
                                        this.modemStatus_ = i15;
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

            public Builder mergeLteDeviceInfo(LTEDeviceInfo lTEDeviceInfo) {
                LTEDeviceInfo lTEDeviceInfo2;
                SingleFieldBuilderV3<LTEDeviceInfo, LTEDeviceInfo.Builder, LTEDeviceInfoOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(lTEDeviceInfo);
                } else if ((this.bitField0_ & 2) == 0 || (lTEDeviceInfo2 = this.lteDeviceInfo_) == null || lTEDeviceInfo2 == LTEDeviceInfo.getDefaultInstance()) {
                    this.lteDeviceInfo_ = lTEDeviceInfo;
                } else {
                    getLteDeviceInfoBuilder().mergeFrom(lTEDeviceInfo);
                }
                if (this.lteDeviceInfo_ != null) {
                    this.bitField0_ |= 2;
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

            public Builder setLteDeviceInfo(LTEDeviceInfo.Builder builder) {
                SingleFieldBuilderV3<LTEDeviceInfo, LTEDeviceInfo.Builder, LTEDeviceInfoOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.lteDeviceInfo_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setModemStatus(LTEModemStatus lTEModemStatus) {
                lTEModemStatus.getClass();
                this.bitField0_ |= 4;
                this.modemStatus_ = lTEModemStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setResponseStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 1;
                this.responseStatus_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LTEDeviceStatusResponse getDefaultInstanceForType() {
                return LTEDeviceStatusResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.responseStatus_ = 0;
                this.modemStatus_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setLteDeviceInfo(LTEDeviceInfo lTEDeviceInfo) {
                SingleFieldBuilderV3<LTEDeviceInfo, LTEDeviceInfo.Builder, LTEDeviceInfoOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    lTEDeviceInfo.getClass();
                    this.lteDeviceInfo_ = lTEDeviceInfo;
                } else {
                    singleFieldBuilderV3.setMessage(lTEDeviceInfo);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LTEDeviceStatusResponse) {
                    return mergeFrom((LTEDeviceStatusResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LTEDeviceStatusResponse lTEDeviceStatusResponse) {
                if (lTEDeviceStatusResponse == LTEDeviceStatusResponse.getDefaultInstance()) {
                    return this;
                }
                if (lTEDeviceStatusResponse.hasResponseStatus()) {
                    setResponseStatus(lTEDeviceStatusResponse.getResponseStatus());
                }
                if (lTEDeviceStatusResponse.hasLteDeviceInfo()) {
                    mergeLteDeviceInfo(lTEDeviceStatusResponse.getLteDeviceInfo());
                }
                if (lTEDeviceStatusResponse.hasModemStatus()) {
                    setModemStatus(lTEDeviceStatusResponse.getModemStatus());
                }
                mergeUnknownFields(lTEDeviceStatusResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LTEDeviceStatusResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LTEDeviceStatusResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEDeviceStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTEDeviceStatusResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LTEDeviceStatusResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LTEDeviceStatusResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ LTEDeviceStatusResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LTEDeviceStatusResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private LTEDeviceStatusResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.responseStatus_ = 0;
            this.modemStatus_ = 0;
        }

        public static LTEDeviceStatusResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LTEDeviceStatusResponse parseFrom(InputStream inputStream) {
            return (LTEDeviceStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LTEDeviceStatusResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEDeviceStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTEDeviceStatusResponse parseFrom(CodedInputStream codedInputStream) {
            return (LTEDeviceStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LTEDeviceStatusResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEDeviceStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            LTE_ACTIVE(1),
            LTE_INACTIVE(2),
            NOT_AN_LTE_DEVICE(3),
            TIMEOUT(4),
            TRY_AGAIN(5),
            ERROR(6);

            public static final int ERROR_VALUE = 6;
            public static final int LTE_ACTIVE_VALUE = 1;
            public static final int LTE_INACTIVE_VALUE = 2;
            public static final int NOT_AN_LTE_DEVICE_VALUE = 3;
            public static final int TIMEOUT_VALUE = 4;
            public static final int TRY_AGAIN_VALUE = 5;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDILTEProto.LTEDeviceStatusResponse.ResponseStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ResponseStatus findValueByNumber(int i14) {
                    return ResponseStatus.forNumber(i14);
                }
            };
            private static final ResponseStatus[] VALUES = values();

            ResponseStatus(int i14) {
                this.value = i14;
            }

            public static ResponseStatus forNumber(int i14) {
                switch (i14) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return LTE_ACTIVE;
                    case 2:
                        return LTE_INACTIVE;
                    case 3:
                        return NOT_AN_LTE_DEVICE;
                    case 4:
                        return TIMEOUT;
                    case 5:
                        return TRY_AGAIN;
                    case 6:
                        return ERROR;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return LTEDeviceStatusResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ResponseStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ResponseStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ResponseStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class LTEPhoneInfo extends GeneratedMessageV3 implements LTEPhoneInfoOrBuilder {
        private static final LTEPhoneInfo DEFAULT_INSTANCE = new LTEPhoneInfo();

        @Deprecated
        public static final Parser<LTEPhoneInfo> PARSER = new AbstractParser<LTEPhoneInfo>() { // from class: com.garmin.proto.generated.GDILTEProto.LTEPhoneInfo.1
            @Override // com.google.protobuf.Parser
            public LTEPhoneInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LTEPhoneInfo.newBuilder();
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
        public static final int SERVICE_PROVIDER_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int serviceProvider_;

        private LTEPhoneInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.serviceProvider_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LTEPhoneInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTEPhoneInfo_descriptor;
        }

        public static Builder newBuilder(LTEPhoneInfo lTEPhoneInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lTEPhoneInfo);
        }

        public static LTEPhoneInfo parseDelimitedFrom(InputStream inputStream) {
            return (LTEPhoneInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LTEPhoneInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LTEPhoneInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LTEPhoneInfo)) {
                return super.equals(obj);
            }
            LTEPhoneInfo lTEPhoneInfo = (LTEPhoneInfo) obj;
            if (hasServiceProvider() != lTEPhoneInfo.hasServiceProvider()) {
                return false;
            }
            return (!hasServiceProvider() || this.serviceProvider_ == lTEPhoneInfo.serviceProvider_) && getUnknownFields().equals(lTEPhoneInfo.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LTEPhoneInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.serviceProvider_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEPhoneInfoOrBuilder
        public LTEServiceProvider getServiceProvider() {
            LTEServiceProvider lTEServiceProviderForNumber = LTEServiceProvider.forNumber(this.serviceProvider_);
            return lTEServiceProviderForNumber == null ? LTEServiceProvider.VERIZON : lTEServiceProviderForNumber;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEPhoneInfoOrBuilder
        public boolean hasServiceProvider() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasServiceProvider()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.serviceProvider_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTEPhoneInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(LTEPhoneInfo.class, Builder.class);
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
            return new LTEPhoneInfo();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.serviceProvider_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LTEPhoneInfoOrBuilder {
            private int bitField0_;
            private int serviceProvider_;

            private Builder() {
                this.serviceProvider_ = 1;
            }

            private void buildPartial0(LTEPhoneInfo lTEPhoneInfo) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    lTEPhoneInfo.serviceProvider_ = this.serviceProvider_;
                } else {
                    i14 = 0;
                }
                lTEPhoneInfo.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEPhoneInfo_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTEPhoneInfo build() {
                LTEPhoneInfo lTEPhoneInfoBuildPartial = buildPartial();
                if (lTEPhoneInfoBuildPartial.isInitialized()) {
                    return lTEPhoneInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) lTEPhoneInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTEPhoneInfo buildPartial() {
                LTEPhoneInfo lTEPhoneInfo = new LTEPhoneInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(lTEPhoneInfo);
                }
                onBuilt();
                return lTEPhoneInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.serviceProvider_ = 1;
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

            public Builder clearServiceProvider() {
                this.bitField0_ &= -2;
                this.serviceProvider_ = 1;
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
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEPhoneInfo_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEPhoneInfoOrBuilder
            public LTEServiceProvider getServiceProvider() {
                LTEServiceProvider lTEServiceProviderForNumber = LTEServiceProvider.forNumber(this.serviceProvider_);
                return lTEServiceProviderForNumber == null ? LTEServiceProvider.VERIZON : lTEServiceProviderForNumber;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEPhoneInfoOrBuilder
            public boolean hasServiceProvider() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEPhoneInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(LTEPhoneInfo.class, Builder.class);
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
                                    if (LTEServiceProvider.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.serviceProvider_ = i14;
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

            public Builder setServiceProvider(LTEServiceProvider lTEServiceProvider) {
                lTEServiceProvider.getClass();
                this.bitField0_ |= 1;
                this.serviceProvider_ = lTEServiceProvider.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LTEPhoneInfo getDefaultInstanceForType() {
                return LTEPhoneInfo.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.serviceProvider_ = 1;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LTEPhoneInfo) {
                    return mergeFrom((LTEPhoneInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LTEPhoneInfo lTEPhoneInfo) {
                if (lTEPhoneInfo == LTEPhoneInfo.getDefaultInstance()) {
                    return this;
                }
                if (lTEPhoneInfo.hasServiceProvider()) {
                    setServiceProvider(lTEPhoneInfo.getServiceProvider());
                }
                mergeUnknownFields(lTEPhoneInfo.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LTEPhoneInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LTEPhoneInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEPhoneInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTEPhoneInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ LTEPhoneInfo(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LTEPhoneInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private LTEPhoneInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.serviceProvider_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LTEPhoneInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LTEPhoneInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LTEPhoneInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LTEPhoneInfo parseFrom(InputStream inputStream) {
            return (LTEPhoneInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LTEPhoneInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEPhoneInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTEPhoneInfo parseFrom(CodedInputStream codedInputStream) {
            return (LTEPhoneInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LTEPhoneInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEPhoneInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LTEPhoneInfoResponse extends GeneratedMessageV3 implements LTEPhoneInfoResponseOrBuilder {
        private static final LTEPhoneInfoResponse DEFAULT_INSTANCE = new LTEPhoneInfoResponse();

        @Deprecated
        public static final Parser<LTEPhoneInfoResponse> PARSER = new AbstractParser<LTEPhoneInfoResponse>() { // from class: com.garmin.proto.generated.GDILTEProto.LTEPhoneInfoResponse.1
            @Override // com.google.protobuf.Parser
            public LTEPhoneInfoResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LTEPhoneInfoResponse.newBuilder();
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
        public static final int PHONE_INFO_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private LTEPhoneInfo phoneInfo_;
        private int status_;

        private LTEPhoneInfoResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LTEPhoneInfoResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTEPhoneInfoResponse_descriptor;
        }

        public static Builder newBuilder(LTEPhoneInfoResponse lTEPhoneInfoResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lTEPhoneInfoResponse);
        }

        public static LTEPhoneInfoResponse parseDelimitedFrom(InputStream inputStream) {
            return (LTEPhoneInfoResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LTEPhoneInfoResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LTEPhoneInfoResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LTEPhoneInfoResponse)) {
                return super.equals(obj);
            }
            LTEPhoneInfoResponse lTEPhoneInfoResponse = (LTEPhoneInfoResponse) obj;
            if (hasStatus() != lTEPhoneInfoResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == lTEPhoneInfoResponse.status_) && hasPhoneInfo() == lTEPhoneInfoResponse.hasPhoneInfo()) {
                return (!hasPhoneInfo() || getPhoneInfo().equals(lTEPhoneInfoResponse.getPhoneInfo())) && getUnknownFields().equals(lTEPhoneInfoResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LTEPhoneInfoResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEPhoneInfoResponseOrBuilder
        public LTEPhoneInfo getPhoneInfo() {
            LTEPhoneInfo lTEPhoneInfo = this.phoneInfo_;
            return lTEPhoneInfo == null ? LTEPhoneInfo.getDefaultInstance() : lTEPhoneInfo;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEPhoneInfoResponseOrBuilder
        public LTEPhoneInfoOrBuilder getPhoneInfoOrBuilder() {
            LTEPhoneInfo lTEPhoneInfo = this.phoneInfo_;
            return lTEPhoneInfo == null ? LTEPhoneInfo.getDefaultInstance() : lTEPhoneInfo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getPhoneInfo());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEPhoneInfoResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEPhoneInfoResponseOrBuilder
        public boolean hasPhoneInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEPhoneInfoResponseOrBuilder
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
            if (hasPhoneInfo()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getPhoneInfo().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTEPhoneInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(LTEPhoneInfoResponse.class, Builder.class);
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
            return new LTEPhoneInfoResponse();
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
                codedOutputStream.writeMessage(2, getPhoneInfo());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LTEPhoneInfoResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<LTEPhoneInfo, LTEPhoneInfo.Builder, LTEPhoneInfoOrBuilder> phoneInfoBuilder_;
            private LTEPhoneInfo phoneInfo_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(LTEPhoneInfoResponse lTEPhoneInfoResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    lTEPhoneInfoResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<LTEPhoneInfo, LTEPhoneInfo.Builder, LTEPhoneInfoOrBuilder> singleFieldBuilderV3 = this.phoneInfoBuilder_;
                    lTEPhoneInfoResponse.phoneInfo_ = singleFieldBuilderV3 == null ? this.phoneInfo_ : (LTEPhoneInfo) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                lTEPhoneInfoResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEPhoneInfoResponse_descriptor;
            }

            private SingleFieldBuilderV3<LTEPhoneInfo, LTEPhoneInfo.Builder, LTEPhoneInfoOrBuilder> getPhoneInfoFieldBuilder() {
                if (this.phoneInfoBuilder_ == null) {
                    this.phoneInfoBuilder_ = new SingleFieldBuilderV3<>(getPhoneInfo(), getParentForChildren(), isClean());
                    this.phoneInfo_ = null;
                }
                return this.phoneInfoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getPhoneInfoFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTEPhoneInfoResponse build() {
                LTEPhoneInfoResponse lTEPhoneInfoResponseBuildPartial = buildPartial();
                if (lTEPhoneInfoResponseBuildPartial.isInitialized()) {
                    return lTEPhoneInfoResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) lTEPhoneInfoResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTEPhoneInfoResponse buildPartial() {
                LTEPhoneInfoResponse lTEPhoneInfoResponse = new LTEPhoneInfoResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(lTEPhoneInfoResponse);
                }
                onBuilt();
                return lTEPhoneInfoResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.phoneInfo_ = null;
                SingleFieldBuilderV3<LTEPhoneInfo, LTEPhoneInfo.Builder, LTEPhoneInfoOrBuilder> singleFieldBuilderV3 = this.phoneInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.phoneInfoBuilder_ = null;
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

            public Builder clearPhoneInfo() {
                this.bitField0_ &= -3;
                this.phoneInfo_ = null;
                SingleFieldBuilderV3<LTEPhoneInfo, LTEPhoneInfo.Builder, LTEPhoneInfoOrBuilder> singleFieldBuilderV3 = this.phoneInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.phoneInfoBuilder_ = null;
                }
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
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEPhoneInfoResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEPhoneInfoResponseOrBuilder
            public LTEPhoneInfo getPhoneInfo() {
                SingleFieldBuilderV3<LTEPhoneInfo, LTEPhoneInfo.Builder, LTEPhoneInfoOrBuilder> singleFieldBuilderV3 = this.phoneInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTEPhoneInfo) singleFieldBuilderV3.getMessage();
                }
                LTEPhoneInfo lTEPhoneInfo = this.phoneInfo_;
                return lTEPhoneInfo == null ? LTEPhoneInfo.getDefaultInstance() : lTEPhoneInfo;
            }

            public LTEPhoneInfo.Builder getPhoneInfoBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (LTEPhoneInfo.Builder) getPhoneInfoFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEPhoneInfoResponseOrBuilder
            public LTEPhoneInfoOrBuilder getPhoneInfoOrBuilder() {
                SingleFieldBuilderV3<LTEPhoneInfo, LTEPhoneInfo.Builder, LTEPhoneInfoOrBuilder> singleFieldBuilderV3 = this.phoneInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTEPhoneInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LTEPhoneInfo lTEPhoneInfo = this.phoneInfo_;
                return lTEPhoneInfo == null ? LTEPhoneInfo.getDefaultInstance() : lTEPhoneInfo;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEPhoneInfoResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEPhoneInfoResponseOrBuilder
            public boolean hasPhoneInfo() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEPhoneInfoResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEPhoneInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(LTEPhoneInfoResponse.class, Builder.class);
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
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getPhoneInfoFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergePhoneInfo(LTEPhoneInfo lTEPhoneInfo) {
                LTEPhoneInfo lTEPhoneInfo2;
                SingleFieldBuilderV3<LTEPhoneInfo, LTEPhoneInfo.Builder, LTEPhoneInfoOrBuilder> singleFieldBuilderV3 = this.phoneInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(lTEPhoneInfo);
                } else if ((this.bitField0_ & 2) == 0 || (lTEPhoneInfo2 = this.phoneInfo_) == null || lTEPhoneInfo2 == LTEPhoneInfo.getDefaultInstance()) {
                    this.phoneInfo_ = lTEPhoneInfo;
                } else {
                    getPhoneInfoBuilder().mergeFrom(lTEPhoneInfo);
                }
                if (this.phoneInfo_ != null) {
                    this.bitField0_ |= 2;
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

            public Builder setPhoneInfo(LTEPhoneInfo.Builder builder) {
                SingleFieldBuilderV3<LTEPhoneInfo, LTEPhoneInfo.Builder, LTEPhoneInfoOrBuilder> singleFieldBuilderV3 = this.phoneInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.phoneInfo_ = builder.build();
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

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LTEPhoneInfoResponse getDefaultInstanceForType() {
                return LTEPhoneInfoResponse.getDefaultInstance();
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
                maybeForceBuilderInitialization();
            }

            public Builder setPhoneInfo(LTEPhoneInfo lTEPhoneInfo) {
                SingleFieldBuilderV3<LTEPhoneInfo, LTEPhoneInfo.Builder, LTEPhoneInfoOrBuilder> singleFieldBuilderV3 = this.phoneInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    lTEPhoneInfo.getClass();
                    this.phoneInfo_ = lTEPhoneInfo;
                } else {
                    singleFieldBuilderV3.setMessage(lTEPhoneInfo);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LTEPhoneInfoResponse) {
                    return mergeFrom((LTEPhoneInfoResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LTEPhoneInfoResponse lTEPhoneInfoResponse) {
                if (lTEPhoneInfoResponse == LTEPhoneInfoResponse.getDefaultInstance()) {
                    return this;
                }
                if (lTEPhoneInfoResponse.hasStatus()) {
                    setStatus(lTEPhoneInfoResponse.getStatus());
                }
                if (lTEPhoneInfoResponse.hasPhoneInfo()) {
                    mergePhoneInfo(lTEPhoneInfoResponse.getPhoneInfo());
                }
                mergeUnknownFields(lTEPhoneInfoResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LTEPhoneInfoResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LTEPhoneInfoResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEPhoneInfoResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTEPhoneInfoResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ LTEPhoneInfoResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LTEPhoneInfoResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private LTEPhoneInfoResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LTEPhoneInfoResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LTEPhoneInfoResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LTEPhoneInfoResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LTEPhoneInfoResponse parseFrom(InputStream inputStream) {
            return (LTEPhoneInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LTEPhoneInfoResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEPhoneInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTEPhoneInfoResponse parseFrom(CodedInputStream codedInputStream) {
            return (LTEPhoneInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LTEPhoneInfoResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEPhoneInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            OK(1),
            ERROR(2);

            public static final int ERROR_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDILTEProto.LTEPhoneInfoResponse.ResponseStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ResponseStatus findValueByNumber(int i14) {
                    return ResponseStatus.forNumber(i14);
                }
            };
            private static final ResponseStatus[] VALUES = values();

            ResponseStatus(int i14) {
                this.value = i14;
            }

            public static ResponseStatus forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return OK;
                }
                if (i14 != 2) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return LTEPhoneInfoResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ResponseStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ResponseStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ResponseStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class LTEService extends GeneratedMessageV3 implements LTEServiceOrBuilder {
        public static final int AP_GEOFENCING_NOTIFICATION_FIELD_NUMBER = 11;
        public static final int AP_VALIDATION_NOTIFICATION_FIELD_NUMBER = 12;
        public static final int LTE_DEVICE_INFO_REQUEST_FIELD_NUMBER = 1;
        public static final int LTE_DEVICE_INFO_RESPONSE_FIELD_NUMBER = 2;
        public static final int LTE_DEVICE_STATUS_REQUEST_FIELD_NUMBER = 3;
        public static final int LTE_DEVICE_STATUS_RESPONSE_FIELD_NUMBER = 4;
        public static final int LTE_SERVICE_ACTIVATION_NOTIFICATION_FIELD_NUMBER = 5;
        public static final int LTE_SUBSCRIPTION_INFO_NOTIFICATION_FIELD_NUMBER = 8;
        public static final int LTE_SUBSCRIPTION_INFO_REQUEST_FIELD_NUMBER = 9;
        public static final int LTE_SUBSCRIPTION_INFO_RESPONSE_FIELD_NUMBER = 10;
        public static final int PHONE_INFO_REQUEST_FIELD_NUMBER = 6;
        public static final int PHONE_INFO_RESPONSE_FIELD_NUMBER = 7;
        private static final long serialVersionUID = 0;
        private AssistancePlusGeofencingNotification apGeofencingNotification_;
        private AssistancePlusValidationNotification apValidationNotification_;
        private int bitField0_;
        private LTEDeviceInfoRequest lteDeviceInfoRequest_;
        private LTEDeviceInfoResponse lteDeviceInfoResponse_;
        private LTEDeviceStatusRequest lteDeviceStatusRequest_;
        private LTEDeviceStatusResponse lteDeviceStatusResponse_;
        private LTEServiceActivationNotification lteServiceActivationNotification_;
        private LTESubscriptionInfoNotification lteSubscriptionInfoNotification_;
        private LTESubscriptionInfoRequest lteSubscriptionInfoRequest_;
        private LTESubscriptionInfoResponse lteSubscriptionInfoResponse_;
        private byte memoizedIsInitialized;
        private LTEPhoneInfoRequest phoneInfoRequest_;
        private LTEPhoneInfoResponse phoneInfoResponse_;
        private static final LTEService DEFAULT_INSTANCE = new LTEService();

        @Deprecated
        public static final Parser<LTEService> PARSER = new AbstractParser<LTEService>() { // from class: com.garmin.proto.generated.GDILTEProto.LTEService.1
            @Override // com.google.protobuf.Parser
            public LTEService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LTEService.newBuilder();
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

        private LTEService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LTEService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTEService_descriptor;
        }

        public static Builder newBuilder(LTEService lTEService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lTEService);
        }

        public static LTEService parseDelimitedFrom(InputStream inputStream) {
            return (LTEService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LTEService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LTEService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LTEService)) {
                return super.equals(obj);
            }
            LTEService lTEService = (LTEService) obj;
            if (hasLteDeviceInfoRequest() != lTEService.hasLteDeviceInfoRequest()) {
                return false;
            }
            if ((hasLteDeviceInfoRequest() && !getLteDeviceInfoRequest().equals(lTEService.getLteDeviceInfoRequest())) || hasLteDeviceInfoResponse() != lTEService.hasLteDeviceInfoResponse()) {
                return false;
            }
            if ((hasLteDeviceInfoResponse() && !getLteDeviceInfoResponse().equals(lTEService.getLteDeviceInfoResponse())) || hasLteDeviceStatusRequest() != lTEService.hasLteDeviceStatusRequest()) {
                return false;
            }
            if ((hasLteDeviceStatusRequest() && !getLteDeviceStatusRequest().equals(lTEService.getLteDeviceStatusRequest())) || hasLteDeviceStatusResponse() != lTEService.hasLteDeviceStatusResponse()) {
                return false;
            }
            if ((hasLteDeviceStatusResponse() && !getLteDeviceStatusResponse().equals(lTEService.getLteDeviceStatusResponse())) || hasLteServiceActivationNotification() != lTEService.hasLteServiceActivationNotification()) {
                return false;
            }
            if ((hasLteServiceActivationNotification() && !getLteServiceActivationNotification().equals(lTEService.getLteServiceActivationNotification())) || hasPhoneInfoRequest() != lTEService.hasPhoneInfoRequest()) {
                return false;
            }
            if ((hasPhoneInfoRequest() && !getPhoneInfoRequest().equals(lTEService.getPhoneInfoRequest())) || hasPhoneInfoResponse() != lTEService.hasPhoneInfoResponse()) {
                return false;
            }
            if ((hasPhoneInfoResponse() && !getPhoneInfoResponse().equals(lTEService.getPhoneInfoResponse())) || hasLteSubscriptionInfoNotification() != lTEService.hasLteSubscriptionInfoNotification()) {
                return false;
            }
            if ((hasLteSubscriptionInfoNotification() && !getLteSubscriptionInfoNotification().equals(lTEService.getLteSubscriptionInfoNotification())) || hasLteSubscriptionInfoRequest() != lTEService.hasLteSubscriptionInfoRequest()) {
                return false;
            }
            if ((hasLteSubscriptionInfoRequest() && !getLteSubscriptionInfoRequest().equals(lTEService.getLteSubscriptionInfoRequest())) || hasLteSubscriptionInfoResponse() != lTEService.hasLteSubscriptionInfoResponse()) {
                return false;
            }
            if ((hasLteSubscriptionInfoResponse() && !getLteSubscriptionInfoResponse().equals(lTEService.getLteSubscriptionInfoResponse())) || hasApGeofencingNotification() != lTEService.hasApGeofencingNotification()) {
                return false;
            }
            if ((!hasApGeofencingNotification() || getApGeofencingNotification().equals(lTEService.getApGeofencingNotification())) && hasApValidationNotification() == lTEService.hasApValidationNotification()) {
                return (!hasApValidationNotification() || getApValidationNotification().equals(lTEService.getApValidationNotification())) && getUnknownFields().equals(lTEService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public AssistancePlusGeofencingNotification getApGeofencingNotification() {
            AssistancePlusGeofencingNotification assistancePlusGeofencingNotification = this.apGeofencingNotification_;
            return assistancePlusGeofencingNotification == null ? AssistancePlusGeofencingNotification.getDefaultInstance() : assistancePlusGeofencingNotification;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public AssistancePlusGeofencingNotificationOrBuilder getApGeofencingNotificationOrBuilder() {
            AssistancePlusGeofencingNotification assistancePlusGeofencingNotification = this.apGeofencingNotification_;
            return assistancePlusGeofencingNotification == null ? AssistancePlusGeofencingNotification.getDefaultInstance() : assistancePlusGeofencingNotification;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public AssistancePlusValidationNotification getApValidationNotification() {
            AssistancePlusValidationNotification assistancePlusValidationNotification = this.apValidationNotification_;
            return assistancePlusValidationNotification == null ? AssistancePlusValidationNotification.getDefaultInstance() : assistancePlusValidationNotification;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public AssistancePlusValidationNotificationOrBuilder getApValidationNotificationOrBuilder() {
            AssistancePlusValidationNotification assistancePlusValidationNotification = this.apValidationNotification_;
            return assistancePlusValidationNotification == null ? AssistancePlusValidationNotification.getDefaultInstance() : assistancePlusValidationNotification;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public LTEDeviceInfoRequest getLteDeviceInfoRequest() {
            LTEDeviceInfoRequest lTEDeviceInfoRequest = this.lteDeviceInfoRequest_;
            return lTEDeviceInfoRequest == null ? LTEDeviceInfoRequest.getDefaultInstance() : lTEDeviceInfoRequest;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public LTEDeviceInfoRequestOrBuilder getLteDeviceInfoRequestOrBuilder() {
            LTEDeviceInfoRequest lTEDeviceInfoRequest = this.lteDeviceInfoRequest_;
            return lTEDeviceInfoRequest == null ? LTEDeviceInfoRequest.getDefaultInstance() : lTEDeviceInfoRequest;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public LTEDeviceInfoResponse getLteDeviceInfoResponse() {
            LTEDeviceInfoResponse lTEDeviceInfoResponse = this.lteDeviceInfoResponse_;
            return lTEDeviceInfoResponse == null ? LTEDeviceInfoResponse.getDefaultInstance() : lTEDeviceInfoResponse;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public LTEDeviceInfoResponseOrBuilder getLteDeviceInfoResponseOrBuilder() {
            LTEDeviceInfoResponse lTEDeviceInfoResponse = this.lteDeviceInfoResponse_;
            return lTEDeviceInfoResponse == null ? LTEDeviceInfoResponse.getDefaultInstance() : lTEDeviceInfoResponse;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public LTEDeviceStatusRequest getLteDeviceStatusRequest() {
            LTEDeviceStatusRequest lTEDeviceStatusRequest = this.lteDeviceStatusRequest_;
            return lTEDeviceStatusRequest == null ? LTEDeviceStatusRequest.getDefaultInstance() : lTEDeviceStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public LTEDeviceStatusRequestOrBuilder getLteDeviceStatusRequestOrBuilder() {
            LTEDeviceStatusRequest lTEDeviceStatusRequest = this.lteDeviceStatusRequest_;
            return lTEDeviceStatusRequest == null ? LTEDeviceStatusRequest.getDefaultInstance() : lTEDeviceStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public LTEDeviceStatusResponse getLteDeviceStatusResponse() {
            LTEDeviceStatusResponse lTEDeviceStatusResponse = this.lteDeviceStatusResponse_;
            return lTEDeviceStatusResponse == null ? LTEDeviceStatusResponse.getDefaultInstance() : lTEDeviceStatusResponse;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public LTEDeviceStatusResponseOrBuilder getLteDeviceStatusResponseOrBuilder() {
            LTEDeviceStatusResponse lTEDeviceStatusResponse = this.lteDeviceStatusResponse_;
            return lTEDeviceStatusResponse == null ? LTEDeviceStatusResponse.getDefaultInstance() : lTEDeviceStatusResponse;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public LTEServiceActivationNotification getLteServiceActivationNotification() {
            LTEServiceActivationNotification lTEServiceActivationNotification = this.lteServiceActivationNotification_;
            return lTEServiceActivationNotification == null ? LTEServiceActivationNotification.getDefaultInstance() : lTEServiceActivationNotification;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public LTEServiceActivationNotificationOrBuilder getLteServiceActivationNotificationOrBuilder() {
            LTEServiceActivationNotification lTEServiceActivationNotification = this.lteServiceActivationNotification_;
            return lTEServiceActivationNotification == null ? LTEServiceActivationNotification.getDefaultInstance() : lTEServiceActivationNotification;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public LTESubscriptionInfoNotification getLteSubscriptionInfoNotification() {
            LTESubscriptionInfoNotification lTESubscriptionInfoNotification = this.lteSubscriptionInfoNotification_;
            return lTESubscriptionInfoNotification == null ? LTESubscriptionInfoNotification.getDefaultInstance() : lTESubscriptionInfoNotification;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public LTESubscriptionInfoNotificationOrBuilder getLteSubscriptionInfoNotificationOrBuilder() {
            LTESubscriptionInfoNotification lTESubscriptionInfoNotification = this.lteSubscriptionInfoNotification_;
            return lTESubscriptionInfoNotification == null ? LTESubscriptionInfoNotification.getDefaultInstance() : lTESubscriptionInfoNotification;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public LTESubscriptionInfoRequest getLteSubscriptionInfoRequest() {
            LTESubscriptionInfoRequest lTESubscriptionInfoRequest = this.lteSubscriptionInfoRequest_;
            return lTESubscriptionInfoRequest == null ? LTESubscriptionInfoRequest.getDefaultInstance() : lTESubscriptionInfoRequest;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public LTESubscriptionInfoRequestOrBuilder getLteSubscriptionInfoRequestOrBuilder() {
            LTESubscriptionInfoRequest lTESubscriptionInfoRequest = this.lteSubscriptionInfoRequest_;
            return lTESubscriptionInfoRequest == null ? LTESubscriptionInfoRequest.getDefaultInstance() : lTESubscriptionInfoRequest;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public LTESubscriptionInfoResponse getLteSubscriptionInfoResponse() {
            LTESubscriptionInfoResponse lTESubscriptionInfoResponse = this.lteSubscriptionInfoResponse_;
            return lTESubscriptionInfoResponse == null ? LTESubscriptionInfoResponse.getDefaultInstance() : lTESubscriptionInfoResponse;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public LTESubscriptionInfoResponseOrBuilder getLteSubscriptionInfoResponseOrBuilder() {
            LTESubscriptionInfoResponse lTESubscriptionInfoResponse = this.lteSubscriptionInfoResponse_;
            return lTESubscriptionInfoResponse == null ? LTESubscriptionInfoResponse.getDefaultInstance() : lTESubscriptionInfoResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LTEService> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public LTEPhoneInfoRequest getPhoneInfoRequest() {
            LTEPhoneInfoRequest lTEPhoneInfoRequest = this.phoneInfoRequest_;
            return lTEPhoneInfoRequest == null ? LTEPhoneInfoRequest.getDefaultInstance() : lTEPhoneInfoRequest;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public LTEPhoneInfoRequestOrBuilder getPhoneInfoRequestOrBuilder() {
            LTEPhoneInfoRequest lTEPhoneInfoRequest = this.phoneInfoRequest_;
            return lTEPhoneInfoRequest == null ? LTEPhoneInfoRequest.getDefaultInstance() : lTEPhoneInfoRequest;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public LTEPhoneInfoResponse getPhoneInfoResponse() {
            LTEPhoneInfoResponse lTEPhoneInfoResponse = this.phoneInfoResponse_;
            return lTEPhoneInfoResponse == null ? LTEPhoneInfoResponse.getDefaultInstance() : lTEPhoneInfoResponse;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public LTEPhoneInfoResponseOrBuilder getPhoneInfoResponseOrBuilder() {
            LTEPhoneInfoResponse lTEPhoneInfoResponse = this.phoneInfoResponse_;
            return lTEPhoneInfoResponse == null ? LTEPhoneInfoResponse.getDefaultInstance() : lTEPhoneInfoResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getLteDeviceInfoRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getLteDeviceInfoResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getLteDeviceStatusRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getLteDeviceStatusResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getLteServiceActivationNotification());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getPhoneInfoRequest());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getPhoneInfoResponse());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getLteSubscriptionInfoNotification());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getLteSubscriptionInfoRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getLteSubscriptionInfoResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getApGeofencingNotification());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getApValidationNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public boolean hasApGeofencingNotification() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public boolean hasApValidationNotification() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public boolean hasLteDeviceInfoRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public boolean hasLteDeviceInfoResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public boolean hasLteDeviceStatusRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public boolean hasLteDeviceStatusResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public boolean hasLteServiceActivationNotification() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public boolean hasLteSubscriptionInfoNotification() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public boolean hasLteSubscriptionInfoRequest() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public boolean hasLteSubscriptionInfoResponse() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public boolean hasPhoneInfoRequest() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
        public boolean hasPhoneInfoResponse() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasLteDeviceInfoRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getLteDeviceInfoRequest().hashCode();
            }
            if (hasLteDeviceInfoResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getLteDeviceInfoResponse().hashCode();
            }
            if (hasLteDeviceStatusRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getLteDeviceStatusRequest().hashCode();
            }
            if (hasLteDeviceStatusResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getLteDeviceStatusResponse().hashCode();
            }
            if (hasLteServiceActivationNotification()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getLteServiceActivationNotification().hashCode();
            }
            if (hasPhoneInfoRequest()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getPhoneInfoRequest().hashCode();
            }
            if (hasPhoneInfoResponse()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getPhoneInfoResponse().hashCode();
            }
            if (hasLteSubscriptionInfoNotification()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getLteSubscriptionInfoNotification().hashCode();
            }
            if (hasLteSubscriptionInfoRequest()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getLteSubscriptionInfoRequest().hashCode();
            }
            if (hasLteSubscriptionInfoResponse()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getLteSubscriptionInfoResponse().hashCode();
            }
            if (hasApGeofencingNotification()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getApGeofencingNotification().hashCode();
            }
            if (hasApValidationNotification()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getApValidationNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTEService_fieldAccessorTable.ensureFieldAccessorsInitialized(LTEService.class, Builder.class);
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
            if (hasLteDeviceInfoResponse() && !getLteDeviceInfoResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasLteDeviceStatusResponse() && !getLteDeviceStatusResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasPhoneInfoResponse() && !getPhoneInfoResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasLteSubscriptionInfoResponse() && !getLteSubscriptionInfoResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasApValidationNotification() || getApValidationNotification().isInitialized()) {
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
            return new LTEService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getLteDeviceInfoRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getLteDeviceInfoResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getLteDeviceStatusRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getLteDeviceStatusResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getLteServiceActivationNotification());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getPhoneInfoRequest());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getPhoneInfoResponse());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getLteSubscriptionInfoNotification());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getLteSubscriptionInfoRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getLteSubscriptionInfoResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getApGeofencingNotification());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(12, getApValidationNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LTEServiceOrBuilder {
            private SingleFieldBuilderV3<AssistancePlusGeofencingNotification, AssistancePlusGeofencingNotification.Builder, AssistancePlusGeofencingNotificationOrBuilder> apGeofencingNotificationBuilder_;
            private AssistancePlusGeofencingNotification apGeofencingNotification_;
            private SingleFieldBuilderV3<AssistancePlusValidationNotification, AssistancePlusValidationNotification.Builder, AssistancePlusValidationNotificationOrBuilder> apValidationNotificationBuilder_;
            private AssistancePlusValidationNotification apValidationNotification_;
            private int bitField0_;
            private SingleFieldBuilderV3<LTEDeviceInfoRequest, LTEDeviceInfoRequest.Builder, LTEDeviceInfoRequestOrBuilder> lteDeviceInfoRequestBuilder_;
            private LTEDeviceInfoRequest lteDeviceInfoRequest_;
            private SingleFieldBuilderV3<LTEDeviceInfoResponse, LTEDeviceInfoResponse.Builder, LTEDeviceInfoResponseOrBuilder> lteDeviceInfoResponseBuilder_;
            private LTEDeviceInfoResponse lteDeviceInfoResponse_;
            private SingleFieldBuilderV3<LTEDeviceStatusRequest, LTEDeviceStatusRequest.Builder, LTEDeviceStatusRequestOrBuilder> lteDeviceStatusRequestBuilder_;
            private LTEDeviceStatusRequest lteDeviceStatusRequest_;
            private SingleFieldBuilderV3<LTEDeviceStatusResponse, LTEDeviceStatusResponse.Builder, LTEDeviceStatusResponseOrBuilder> lteDeviceStatusResponseBuilder_;
            private LTEDeviceStatusResponse lteDeviceStatusResponse_;
            private SingleFieldBuilderV3<LTEServiceActivationNotification, LTEServiceActivationNotification.Builder, LTEServiceActivationNotificationOrBuilder> lteServiceActivationNotificationBuilder_;
            private LTEServiceActivationNotification lteServiceActivationNotification_;
            private SingleFieldBuilderV3<LTESubscriptionInfoNotification, LTESubscriptionInfoNotification.Builder, LTESubscriptionInfoNotificationOrBuilder> lteSubscriptionInfoNotificationBuilder_;
            private LTESubscriptionInfoNotification lteSubscriptionInfoNotification_;
            private SingleFieldBuilderV3<LTESubscriptionInfoRequest, LTESubscriptionInfoRequest.Builder, LTESubscriptionInfoRequestOrBuilder> lteSubscriptionInfoRequestBuilder_;
            private LTESubscriptionInfoRequest lteSubscriptionInfoRequest_;
            private SingleFieldBuilderV3<LTESubscriptionInfoResponse, LTESubscriptionInfoResponse.Builder, LTESubscriptionInfoResponseOrBuilder> lteSubscriptionInfoResponseBuilder_;
            private LTESubscriptionInfoResponse lteSubscriptionInfoResponse_;
            private SingleFieldBuilderV3<LTEPhoneInfoRequest, LTEPhoneInfoRequest.Builder, LTEPhoneInfoRequestOrBuilder> phoneInfoRequestBuilder_;
            private LTEPhoneInfoRequest phoneInfoRequest_;
            private SingleFieldBuilderV3<LTEPhoneInfoResponse, LTEPhoneInfoResponse.Builder, LTEPhoneInfoResponseOrBuilder> phoneInfoResponseBuilder_;
            private LTEPhoneInfoResponse phoneInfoResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(LTEService lTEService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<LTEDeviceInfoRequest, LTEDeviceInfoRequest.Builder, LTEDeviceInfoRequestOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoRequestBuilder_;
                    lTEService.lteDeviceInfoRequest_ = singleFieldBuilderV3 == null ? this.lteDeviceInfoRequest_ : (LTEDeviceInfoRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<LTEDeviceInfoResponse, LTEDeviceInfoResponse.Builder, LTEDeviceInfoResponseOrBuilder> singleFieldBuilderV4 = this.lteDeviceInfoResponseBuilder_;
                    lTEService.lteDeviceInfoResponse_ = singleFieldBuilderV4 == null ? this.lteDeviceInfoResponse_ : (LTEDeviceInfoResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<LTEDeviceStatusRequest, LTEDeviceStatusRequest.Builder, LTEDeviceStatusRequestOrBuilder> singleFieldBuilderV5 = this.lteDeviceStatusRequestBuilder_;
                    lTEService.lteDeviceStatusRequest_ = singleFieldBuilderV5 == null ? this.lteDeviceStatusRequest_ : (LTEDeviceStatusRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<LTEDeviceStatusResponse, LTEDeviceStatusResponse.Builder, LTEDeviceStatusResponseOrBuilder> singleFieldBuilderV6 = this.lteDeviceStatusResponseBuilder_;
                    lTEService.lteDeviceStatusResponse_ = singleFieldBuilderV6 == null ? this.lteDeviceStatusResponse_ : (LTEDeviceStatusResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<LTEServiceActivationNotification, LTEServiceActivationNotification.Builder, LTEServiceActivationNotificationOrBuilder> singleFieldBuilderV7 = this.lteServiceActivationNotificationBuilder_;
                    lTEService.lteServiceActivationNotification_ = singleFieldBuilderV7 == null ? this.lteServiceActivationNotification_ : (LTEServiceActivationNotification) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<LTEPhoneInfoRequest, LTEPhoneInfoRequest.Builder, LTEPhoneInfoRequestOrBuilder> singleFieldBuilderV8 = this.phoneInfoRequestBuilder_;
                    lTEService.phoneInfoRequest_ = singleFieldBuilderV8 == null ? this.phoneInfoRequest_ : (LTEPhoneInfoRequest) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<LTEPhoneInfoResponse, LTEPhoneInfoResponse.Builder, LTEPhoneInfoResponseOrBuilder> singleFieldBuilderV9 = this.phoneInfoResponseBuilder_;
                    lTEService.phoneInfoResponse_ = singleFieldBuilderV9 == null ? this.phoneInfoResponse_ : (LTEPhoneInfoResponse) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<LTESubscriptionInfoNotification, LTESubscriptionInfoNotification.Builder, LTESubscriptionInfoNotificationOrBuilder> singleFieldBuilderV10 = this.lteSubscriptionInfoNotificationBuilder_;
                    lTEService.lteSubscriptionInfoNotification_ = singleFieldBuilderV10 == null ? this.lteSubscriptionInfoNotification_ : (LTESubscriptionInfoNotification) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<LTESubscriptionInfoRequest, LTESubscriptionInfoRequest.Builder, LTESubscriptionInfoRequestOrBuilder> singleFieldBuilderV11 = this.lteSubscriptionInfoRequestBuilder_;
                    lTEService.lteSubscriptionInfoRequest_ = singleFieldBuilderV11 == null ? this.lteSubscriptionInfoRequest_ : (LTESubscriptionInfoRequest) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<LTESubscriptionInfoResponse, LTESubscriptionInfoResponse.Builder, LTESubscriptionInfoResponseOrBuilder> singleFieldBuilderV12 = this.lteSubscriptionInfoResponseBuilder_;
                    lTEService.lteSubscriptionInfoResponse_ = singleFieldBuilderV12 == null ? this.lteSubscriptionInfoResponse_ : (LTESubscriptionInfoResponse) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<AssistancePlusGeofencingNotification, AssistancePlusGeofencingNotification.Builder, AssistancePlusGeofencingNotificationOrBuilder> singleFieldBuilderV13 = this.apGeofencingNotificationBuilder_;
                    lTEService.apGeofencingNotification_ = singleFieldBuilderV13 == null ? this.apGeofencingNotification_ : (AssistancePlusGeofencingNotification) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<AssistancePlusValidationNotification, AssistancePlusValidationNotification.Builder, AssistancePlusValidationNotificationOrBuilder> singleFieldBuilderV14 = this.apValidationNotificationBuilder_;
                    lTEService.apValidationNotification_ = singleFieldBuilderV14 == null ? this.apValidationNotification_ : (AssistancePlusValidationNotification) singleFieldBuilderV14.build();
                    i14 |= 2048;
                }
                lTEService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<AssistancePlusGeofencingNotification, AssistancePlusGeofencingNotification.Builder, AssistancePlusGeofencingNotificationOrBuilder> getApGeofencingNotificationFieldBuilder() {
                if (this.apGeofencingNotificationBuilder_ == null) {
                    this.apGeofencingNotificationBuilder_ = new SingleFieldBuilderV3<>(getApGeofencingNotification(), getParentForChildren(), isClean());
                    this.apGeofencingNotification_ = null;
                }
                return this.apGeofencingNotificationBuilder_;
            }

            private SingleFieldBuilderV3<AssistancePlusValidationNotification, AssistancePlusValidationNotification.Builder, AssistancePlusValidationNotificationOrBuilder> getApValidationNotificationFieldBuilder() {
                if (this.apValidationNotificationBuilder_ == null) {
                    this.apValidationNotificationBuilder_ = new SingleFieldBuilderV3<>(getApValidationNotification(), getParentForChildren(), isClean());
                    this.apValidationNotification_ = null;
                }
                return this.apValidationNotificationBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEService_descriptor;
            }

            private SingleFieldBuilderV3<LTEDeviceInfoRequest, LTEDeviceInfoRequest.Builder, LTEDeviceInfoRequestOrBuilder> getLteDeviceInfoRequestFieldBuilder() {
                if (this.lteDeviceInfoRequestBuilder_ == null) {
                    this.lteDeviceInfoRequestBuilder_ = new SingleFieldBuilderV3<>(getLteDeviceInfoRequest(), getParentForChildren(), isClean());
                    this.lteDeviceInfoRequest_ = null;
                }
                return this.lteDeviceInfoRequestBuilder_;
            }

            private SingleFieldBuilderV3<LTEDeviceInfoResponse, LTEDeviceInfoResponse.Builder, LTEDeviceInfoResponseOrBuilder> getLteDeviceInfoResponseFieldBuilder() {
                if (this.lteDeviceInfoResponseBuilder_ == null) {
                    this.lteDeviceInfoResponseBuilder_ = new SingleFieldBuilderV3<>(getLteDeviceInfoResponse(), getParentForChildren(), isClean());
                    this.lteDeviceInfoResponse_ = null;
                }
                return this.lteDeviceInfoResponseBuilder_;
            }

            private SingleFieldBuilderV3<LTEDeviceStatusRequest, LTEDeviceStatusRequest.Builder, LTEDeviceStatusRequestOrBuilder> getLteDeviceStatusRequestFieldBuilder() {
                if (this.lteDeviceStatusRequestBuilder_ == null) {
                    this.lteDeviceStatusRequestBuilder_ = new SingleFieldBuilderV3<>(getLteDeviceStatusRequest(), getParentForChildren(), isClean());
                    this.lteDeviceStatusRequest_ = null;
                }
                return this.lteDeviceStatusRequestBuilder_;
            }

            private SingleFieldBuilderV3<LTEDeviceStatusResponse, LTEDeviceStatusResponse.Builder, LTEDeviceStatusResponseOrBuilder> getLteDeviceStatusResponseFieldBuilder() {
                if (this.lteDeviceStatusResponseBuilder_ == null) {
                    this.lteDeviceStatusResponseBuilder_ = new SingleFieldBuilderV3<>(getLteDeviceStatusResponse(), getParentForChildren(), isClean());
                    this.lteDeviceStatusResponse_ = null;
                }
                return this.lteDeviceStatusResponseBuilder_;
            }

            private SingleFieldBuilderV3<LTEServiceActivationNotification, LTEServiceActivationNotification.Builder, LTEServiceActivationNotificationOrBuilder> getLteServiceActivationNotificationFieldBuilder() {
                if (this.lteServiceActivationNotificationBuilder_ == null) {
                    this.lteServiceActivationNotificationBuilder_ = new SingleFieldBuilderV3<>(getLteServiceActivationNotification(), getParentForChildren(), isClean());
                    this.lteServiceActivationNotification_ = null;
                }
                return this.lteServiceActivationNotificationBuilder_;
            }

            private SingleFieldBuilderV3<LTESubscriptionInfoNotification, LTESubscriptionInfoNotification.Builder, LTESubscriptionInfoNotificationOrBuilder> getLteSubscriptionInfoNotificationFieldBuilder() {
                if (this.lteSubscriptionInfoNotificationBuilder_ == null) {
                    this.lteSubscriptionInfoNotificationBuilder_ = new SingleFieldBuilderV3<>(getLteSubscriptionInfoNotification(), getParentForChildren(), isClean());
                    this.lteSubscriptionInfoNotification_ = null;
                }
                return this.lteSubscriptionInfoNotificationBuilder_;
            }

            private SingleFieldBuilderV3<LTESubscriptionInfoRequest, LTESubscriptionInfoRequest.Builder, LTESubscriptionInfoRequestOrBuilder> getLteSubscriptionInfoRequestFieldBuilder() {
                if (this.lteSubscriptionInfoRequestBuilder_ == null) {
                    this.lteSubscriptionInfoRequestBuilder_ = new SingleFieldBuilderV3<>(getLteSubscriptionInfoRequest(), getParentForChildren(), isClean());
                    this.lteSubscriptionInfoRequest_ = null;
                }
                return this.lteSubscriptionInfoRequestBuilder_;
            }

            private SingleFieldBuilderV3<LTESubscriptionInfoResponse, LTESubscriptionInfoResponse.Builder, LTESubscriptionInfoResponseOrBuilder> getLteSubscriptionInfoResponseFieldBuilder() {
                if (this.lteSubscriptionInfoResponseBuilder_ == null) {
                    this.lteSubscriptionInfoResponseBuilder_ = new SingleFieldBuilderV3<>(getLteSubscriptionInfoResponse(), getParentForChildren(), isClean());
                    this.lteSubscriptionInfoResponse_ = null;
                }
                return this.lteSubscriptionInfoResponseBuilder_;
            }

            private SingleFieldBuilderV3<LTEPhoneInfoRequest, LTEPhoneInfoRequest.Builder, LTEPhoneInfoRequestOrBuilder> getPhoneInfoRequestFieldBuilder() {
                if (this.phoneInfoRequestBuilder_ == null) {
                    this.phoneInfoRequestBuilder_ = new SingleFieldBuilderV3<>(getPhoneInfoRequest(), getParentForChildren(), isClean());
                    this.phoneInfoRequest_ = null;
                }
                return this.phoneInfoRequestBuilder_;
            }

            private SingleFieldBuilderV3<LTEPhoneInfoResponse, LTEPhoneInfoResponse.Builder, LTEPhoneInfoResponseOrBuilder> getPhoneInfoResponseFieldBuilder() {
                if (this.phoneInfoResponseBuilder_ == null) {
                    this.phoneInfoResponseBuilder_ = new SingleFieldBuilderV3<>(getPhoneInfoResponse(), getParentForChildren(), isClean());
                    this.phoneInfoResponse_ = null;
                }
                return this.phoneInfoResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getLteDeviceInfoRequestFieldBuilder();
                    getLteDeviceInfoResponseFieldBuilder();
                    getLteDeviceStatusRequestFieldBuilder();
                    getLteDeviceStatusResponseFieldBuilder();
                    getLteServiceActivationNotificationFieldBuilder();
                    getPhoneInfoRequestFieldBuilder();
                    getPhoneInfoResponseFieldBuilder();
                    getLteSubscriptionInfoNotificationFieldBuilder();
                    getLteSubscriptionInfoRequestFieldBuilder();
                    getLteSubscriptionInfoResponseFieldBuilder();
                    getApGeofencingNotificationFieldBuilder();
                    getApValidationNotificationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTEService build() {
                LTEService lTEServiceBuildPartial = buildPartial();
                if (lTEServiceBuildPartial.isInitialized()) {
                    return lTEServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) lTEServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTEService buildPartial() {
                LTEService lTEService = new LTEService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(lTEService);
                }
                onBuilt();
                return lTEService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.lteDeviceInfoRequest_ = null;
                SingleFieldBuilderV3<LTEDeviceInfoRequest, LTEDeviceInfoRequest.Builder, LTEDeviceInfoRequestOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.lteDeviceInfoRequestBuilder_ = null;
                }
                this.lteDeviceInfoResponse_ = null;
                SingleFieldBuilderV3<LTEDeviceInfoResponse, LTEDeviceInfoResponse.Builder, LTEDeviceInfoResponseOrBuilder> singleFieldBuilderV4 = this.lteDeviceInfoResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.lteDeviceInfoResponseBuilder_ = null;
                }
                this.lteDeviceStatusRequest_ = null;
                SingleFieldBuilderV3<LTEDeviceStatusRequest, LTEDeviceStatusRequest.Builder, LTEDeviceStatusRequestOrBuilder> singleFieldBuilderV5 = this.lteDeviceStatusRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.lteDeviceStatusRequestBuilder_ = null;
                }
                this.lteDeviceStatusResponse_ = null;
                SingleFieldBuilderV3<LTEDeviceStatusResponse, LTEDeviceStatusResponse.Builder, LTEDeviceStatusResponseOrBuilder> singleFieldBuilderV6 = this.lteDeviceStatusResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.lteDeviceStatusResponseBuilder_ = null;
                }
                this.lteServiceActivationNotification_ = null;
                SingleFieldBuilderV3<LTEServiceActivationNotification, LTEServiceActivationNotification.Builder, LTEServiceActivationNotificationOrBuilder> singleFieldBuilderV7 = this.lteServiceActivationNotificationBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.lteServiceActivationNotificationBuilder_ = null;
                }
                this.phoneInfoRequest_ = null;
                SingleFieldBuilderV3<LTEPhoneInfoRequest, LTEPhoneInfoRequest.Builder, LTEPhoneInfoRequestOrBuilder> singleFieldBuilderV8 = this.phoneInfoRequestBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.phoneInfoRequestBuilder_ = null;
                }
                this.phoneInfoResponse_ = null;
                SingleFieldBuilderV3<LTEPhoneInfoResponse, LTEPhoneInfoResponse.Builder, LTEPhoneInfoResponseOrBuilder> singleFieldBuilderV9 = this.phoneInfoResponseBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.phoneInfoResponseBuilder_ = null;
                }
                this.lteSubscriptionInfoNotification_ = null;
                SingleFieldBuilderV3<LTESubscriptionInfoNotification, LTESubscriptionInfoNotification.Builder, LTESubscriptionInfoNotificationOrBuilder> singleFieldBuilderV10 = this.lteSubscriptionInfoNotificationBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.lteSubscriptionInfoNotificationBuilder_ = null;
                }
                this.lteSubscriptionInfoRequest_ = null;
                SingleFieldBuilderV3<LTESubscriptionInfoRequest, LTESubscriptionInfoRequest.Builder, LTESubscriptionInfoRequestOrBuilder> singleFieldBuilderV11 = this.lteSubscriptionInfoRequestBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.lteSubscriptionInfoRequestBuilder_ = null;
                }
                this.lteSubscriptionInfoResponse_ = null;
                SingleFieldBuilderV3<LTESubscriptionInfoResponse, LTESubscriptionInfoResponse.Builder, LTESubscriptionInfoResponseOrBuilder> singleFieldBuilderV12 = this.lteSubscriptionInfoResponseBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.lteSubscriptionInfoResponseBuilder_ = null;
                }
                this.apGeofencingNotification_ = null;
                SingleFieldBuilderV3<AssistancePlusGeofencingNotification, AssistancePlusGeofencingNotification.Builder, AssistancePlusGeofencingNotificationOrBuilder> singleFieldBuilderV13 = this.apGeofencingNotificationBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.apGeofencingNotificationBuilder_ = null;
                }
                this.apValidationNotification_ = null;
                SingleFieldBuilderV3<AssistancePlusValidationNotification, AssistancePlusValidationNotification.Builder, AssistancePlusValidationNotificationOrBuilder> singleFieldBuilderV14 = this.apValidationNotificationBuilder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.apValidationNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearApGeofencingNotification() {
                this.bitField0_ &= -1025;
                this.apGeofencingNotification_ = null;
                SingleFieldBuilderV3<AssistancePlusGeofencingNotification, AssistancePlusGeofencingNotification.Builder, AssistancePlusGeofencingNotificationOrBuilder> singleFieldBuilderV3 = this.apGeofencingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.apGeofencingNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearApValidationNotification() {
                this.bitField0_ &= -2049;
                this.apValidationNotification_ = null;
                SingleFieldBuilderV3<AssistancePlusValidationNotification, AssistancePlusValidationNotification.Builder, AssistancePlusValidationNotificationOrBuilder> singleFieldBuilderV3 = this.apValidationNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.apValidationNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLteDeviceInfoRequest() {
                this.bitField0_ &= -2;
                this.lteDeviceInfoRequest_ = null;
                SingleFieldBuilderV3<LTEDeviceInfoRequest, LTEDeviceInfoRequest.Builder, LTEDeviceInfoRequestOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.lteDeviceInfoRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLteDeviceInfoResponse() {
                this.bitField0_ &= -3;
                this.lteDeviceInfoResponse_ = null;
                SingleFieldBuilderV3<LTEDeviceInfoResponse, LTEDeviceInfoResponse.Builder, LTEDeviceInfoResponseOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.lteDeviceInfoResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLteDeviceStatusRequest() {
                this.bitField0_ &= -5;
                this.lteDeviceStatusRequest_ = null;
                SingleFieldBuilderV3<LTEDeviceStatusRequest, LTEDeviceStatusRequest.Builder, LTEDeviceStatusRequestOrBuilder> singleFieldBuilderV3 = this.lteDeviceStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.lteDeviceStatusRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLteDeviceStatusResponse() {
                this.bitField0_ &= -9;
                this.lteDeviceStatusResponse_ = null;
                SingleFieldBuilderV3<LTEDeviceStatusResponse, LTEDeviceStatusResponse.Builder, LTEDeviceStatusResponseOrBuilder> singleFieldBuilderV3 = this.lteDeviceStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.lteDeviceStatusResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLteServiceActivationNotification() {
                this.bitField0_ &= -17;
                this.lteServiceActivationNotification_ = null;
                SingleFieldBuilderV3<LTEServiceActivationNotification, LTEServiceActivationNotification.Builder, LTEServiceActivationNotificationOrBuilder> singleFieldBuilderV3 = this.lteServiceActivationNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.lteServiceActivationNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLteSubscriptionInfoNotification() {
                this.bitField0_ &= -129;
                this.lteSubscriptionInfoNotification_ = null;
                SingleFieldBuilderV3<LTESubscriptionInfoNotification, LTESubscriptionInfoNotification.Builder, LTESubscriptionInfoNotificationOrBuilder> singleFieldBuilderV3 = this.lteSubscriptionInfoNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.lteSubscriptionInfoNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLteSubscriptionInfoRequest() {
                this.bitField0_ &= -257;
                this.lteSubscriptionInfoRequest_ = null;
                SingleFieldBuilderV3<LTESubscriptionInfoRequest, LTESubscriptionInfoRequest.Builder, LTESubscriptionInfoRequestOrBuilder> singleFieldBuilderV3 = this.lteSubscriptionInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.lteSubscriptionInfoRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLteSubscriptionInfoResponse() {
                this.bitField0_ &= -513;
                this.lteSubscriptionInfoResponse_ = null;
                SingleFieldBuilderV3<LTESubscriptionInfoResponse, LTESubscriptionInfoResponse.Builder, LTESubscriptionInfoResponseOrBuilder> singleFieldBuilderV3 = this.lteSubscriptionInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.lteSubscriptionInfoResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPhoneInfoRequest() {
                this.bitField0_ &= -33;
                this.phoneInfoRequest_ = null;
                SingleFieldBuilderV3<LTEPhoneInfoRequest, LTEPhoneInfoRequest.Builder, LTEPhoneInfoRequestOrBuilder> singleFieldBuilderV3 = this.phoneInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.phoneInfoRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPhoneInfoResponse() {
                this.bitField0_ &= -65;
                this.phoneInfoResponse_ = null;
                SingleFieldBuilderV3<LTEPhoneInfoResponse, LTEPhoneInfoResponse.Builder, LTEPhoneInfoResponseOrBuilder> singleFieldBuilderV3 = this.phoneInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.phoneInfoResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public AssistancePlusGeofencingNotification getApGeofencingNotification() {
                SingleFieldBuilderV3<AssistancePlusGeofencingNotification, AssistancePlusGeofencingNotification.Builder, AssistancePlusGeofencingNotificationOrBuilder> singleFieldBuilderV3 = this.apGeofencingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AssistancePlusGeofencingNotification) singleFieldBuilderV3.getMessage();
                }
                AssistancePlusGeofencingNotification assistancePlusGeofencingNotification = this.apGeofencingNotification_;
                return assistancePlusGeofencingNotification == null ? AssistancePlusGeofencingNotification.getDefaultInstance() : assistancePlusGeofencingNotification;
            }

            public AssistancePlusGeofencingNotification.Builder getApGeofencingNotificationBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (AssistancePlusGeofencingNotification.Builder) getApGeofencingNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public AssistancePlusGeofencingNotificationOrBuilder getApGeofencingNotificationOrBuilder() {
                SingleFieldBuilderV3<AssistancePlusGeofencingNotification, AssistancePlusGeofencingNotification.Builder, AssistancePlusGeofencingNotificationOrBuilder> singleFieldBuilderV3 = this.apGeofencingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AssistancePlusGeofencingNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AssistancePlusGeofencingNotification assistancePlusGeofencingNotification = this.apGeofencingNotification_;
                return assistancePlusGeofencingNotification == null ? AssistancePlusGeofencingNotification.getDefaultInstance() : assistancePlusGeofencingNotification;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public AssistancePlusValidationNotification getApValidationNotification() {
                SingleFieldBuilderV3<AssistancePlusValidationNotification, AssistancePlusValidationNotification.Builder, AssistancePlusValidationNotificationOrBuilder> singleFieldBuilderV3 = this.apValidationNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AssistancePlusValidationNotification) singleFieldBuilderV3.getMessage();
                }
                AssistancePlusValidationNotification assistancePlusValidationNotification = this.apValidationNotification_;
                return assistancePlusValidationNotification == null ? AssistancePlusValidationNotification.getDefaultInstance() : assistancePlusValidationNotification;
            }

            public AssistancePlusValidationNotification.Builder getApValidationNotificationBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (AssistancePlusValidationNotification.Builder) getApValidationNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public AssistancePlusValidationNotificationOrBuilder getApValidationNotificationOrBuilder() {
                SingleFieldBuilderV3<AssistancePlusValidationNotification, AssistancePlusValidationNotification.Builder, AssistancePlusValidationNotificationOrBuilder> singleFieldBuilderV3 = this.apValidationNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AssistancePlusValidationNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AssistancePlusValidationNotification assistancePlusValidationNotification = this.apValidationNotification_;
                return assistancePlusValidationNotification == null ? AssistancePlusValidationNotification.getDefaultInstance() : assistancePlusValidationNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public LTEDeviceInfoRequest getLteDeviceInfoRequest() {
                SingleFieldBuilderV3<LTEDeviceInfoRequest, LTEDeviceInfoRequest.Builder, LTEDeviceInfoRequestOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTEDeviceInfoRequest) singleFieldBuilderV3.getMessage();
                }
                LTEDeviceInfoRequest lTEDeviceInfoRequest = this.lteDeviceInfoRequest_;
                return lTEDeviceInfoRequest == null ? LTEDeviceInfoRequest.getDefaultInstance() : lTEDeviceInfoRequest;
            }

            public LTEDeviceInfoRequest.Builder getLteDeviceInfoRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (LTEDeviceInfoRequest.Builder) getLteDeviceInfoRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public LTEDeviceInfoRequestOrBuilder getLteDeviceInfoRequestOrBuilder() {
                SingleFieldBuilderV3<LTEDeviceInfoRequest, LTEDeviceInfoRequest.Builder, LTEDeviceInfoRequestOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTEDeviceInfoRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LTEDeviceInfoRequest lTEDeviceInfoRequest = this.lteDeviceInfoRequest_;
                return lTEDeviceInfoRequest == null ? LTEDeviceInfoRequest.getDefaultInstance() : lTEDeviceInfoRequest;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public LTEDeviceInfoResponse getLteDeviceInfoResponse() {
                SingleFieldBuilderV3<LTEDeviceInfoResponse, LTEDeviceInfoResponse.Builder, LTEDeviceInfoResponseOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTEDeviceInfoResponse) singleFieldBuilderV3.getMessage();
                }
                LTEDeviceInfoResponse lTEDeviceInfoResponse = this.lteDeviceInfoResponse_;
                return lTEDeviceInfoResponse == null ? LTEDeviceInfoResponse.getDefaultInstance() : lTEDeviceInfoResponse;
            }

            public LTEDeviceInfoResponse.Builder getLteDeviceInfoResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (LTEDeviceInfoResponse.Builder) getLteDeviceInfoResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public LTEDeviceInfoResponseOrBuilder getLteDeviceInfoResponseOrBuilder() {
                SingleFieldBuilderV3<LTEDeviceInfoResponse, LTEDeviceInfoResponse.Builder, LTEDeviceInfoResponseOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTEDeviceInfoResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LTEDeviceInfoResponse lTEDeviceInfoResponse = this.lteDeviceInfoResponse_;
                return lTEDeviceInfoResponse == null ? LTEDeviceInfoResponse.getDefaultInstance() : lTEDeviceInfoResponse;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public LTEDeviceStatusRequest getLteDeviceStatusRequest() {
                SingleFieldBuilderV3<LTEDeviceStatusRequest, LTEDeviceStatusRequest.Builder, LTEDeviceStatusRequestOrBuilder> singleFieldBuilderV3 = this.lteDeviceStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTEDeviceStatusRequest) singleFieldBuilderV3.getMessage();
                }
                LTEDeviceStatusRequest lTEDeviceStatusRequest = this.lteDeviceStatusRequest_;
                return lTEDeviceStatusRequest == null ? LTEDeviceStatusRequest.getDefaultInstance() : lTEDeviceStatusRequest;
            }

            public LTEDeviceStatusRequest.Builder getLteDeviceStatusRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (LTEDeviceStatusRequest.Builder) getLteDeviceStatusRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public LTEDeviceStatusRequestOrBuilder getLteDeviceStatusRequestOrBuilder() {
                SingleFieldBuilderV3<LTEDeviceStatusRequest, LTEDeviceStatusRequest.Builder, LTEDeviceStatusRequestOrBuilder> singleFieldBuilderV3 = this.lteDeviceStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTEDeviceStatusRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LTEDeviceStatusRequest lTEDeviceStatusRequest = this.lteDeviceStatusRequest_;
                return lTEDeviceStatusRequest == null ? LTEDeviceStatusRequest.getDefaultInstance() : lTEDeviceStatusRequest;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public LTEDeviceStatusResponse getLteDeviceStatusResponse() {
                SingleFieldBuilderV3<LTEDeviceStatusResponse, LTEDeviceStatusResponse.Builder, LTEDeviceStatusResponseOrBuilder> singleFieldBuilderV3 = this.lteDeviceStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTEDeviceStatusResponse) singleFieldBuilderV3.getMessage();
                }
                LTEDeviceStatusResponse lTEDeviceStatusResponse = this.lteDeviceStatusResponse_;
                return lTEDeviceStatusResponse == null ? LTEDeviceStatusResponse.getDefaultInstance() : lTEDeviceStatusResponse;
            }

            public LTEDeviceStatusResponse.Builder getLteDeviceStatusResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (LTEDeviceStatusResponse.Builder) getLteDeviceStatusResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public LTEDeviceStatusResponseOrBuilder getLteDeviceStatusResponseOrBuilder() {
                SingleFieldBuilderV3<LTEDeviceStatusResponse, LTEDeviceStatusResponse.Builder, LTEDeviceStatusResponseOrBuilder> singleFieldBuilderV3 = this.lteDeviceStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTEDeviceStatusResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LTEDeviceStatusResponse lTEDeviceStatusResponse = this.lteDeviceStatusResponse_;
                return lTEDeviceStatusResponse == null ? LTEDeviceStatusResponse.getDefaultInstance() : lTEDeviceStatusResponse;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public LTEServiceActivationNotification getLteServiceActivationNotification() {
                SingleFieldBuilderV3<LTEServiceActivationNotification, LTEServiceActivationNotification.Builder, LTEServiceActivationNotificationOrBuilder> singleFieldBuilderV3 = this.lteServiceActivationNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTEServiceActivationNotification) singleFieldBuilderV3.getMessage();
                }
                LTEServiceActivationNotification lTEServiceActivationNotification = this.lteServiceActivationNotification_;
                return lTEServiceActivationNotification == null ? LTEServiceActivationNotification.getDefaultInstance() : lTEServiceActivationNotification;
            }

            public LTEServiceActivationNotification.Builder getLteServiceActivationNotificationBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (LTEServiceActivationNotification.Builder) getLteServiceActivationNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public LTEServiceActivationNotificationOrBuilder getLteServiceActivationNotificationOrBuilder() {
                SingleFieldBuilderV3<LTEServiceActivationNotification, LTEServiceActivationNotification.Builder, LTEServiceActivationNotificationOrBuilder> singleFieldBuilderV3 = this.lteServiceActivationNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTEServiceActivationNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LTEServiceActivationNotification lTEServiceActivationNotification = this.lteServiceActivationNotification_;
                return lTEServiceActivationNotification == null ? LTEServiceActivationNotification.getDefaultInstance() : lTEServiceActivationNotification;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public LTESubscriptionInfoNotification getLteSubscriptionInfoNotification() {
                SingleFieldBuilderV3<LTESubscriptionInfoNotification, LTESubscriptionInfoNotification.Builder, LTESubscriptionInfoNotificationOrBuilder> singleFieldBuilderV3 = this.lteSubscriptionInfoNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTESubscriptionInfoNotification) singleFieldBuilderV3.getMessage();
                }
                LTESubscriptionInfoNotification lTESubscriptionInfoNotification = this.lteSubscriptionInfoNotification_;
                return lTESubscriptionInfoNotification == null ? LTESubscriptionInfoNotification.getDefaultInstance() : lTESubscriptionInfoNotification;
            }

            public LTESubscriptionInfoNotification.Builder getLteSubscriptionInfoNotificationBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (LTESubscriptionInfoNotification.Builder) getLteSubscriptionInfoNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public LTESubscriptionInfoNotificationOrBuilder getLteSubscriptionInfoNotificationOrBuilder() {
                SingleFieldBuilderV3<LTESubscriptionInfoNotification, LTESubscriptionInfoNotification.Builder, LTESubscriptionInfoNotificationOrBuilder> singleFieldBuilderV3 = this.lteSubscriptionInfoNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTESubscriptionInfoNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LTESubscriptionInfoNotification lTESubscriptionInfoNotification = this.lteSubscriptionInfoNotification_;
                return lTESubscriptionInfoNotification == null ? LTESubscriptionInfoNotification.getDefaultInstance() : lTESubscriptionInfoNotification;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public LTESubscriptionInfoRequest getLteSubscriptionInfoRequest() {
                SingleFieldBuilderV3<LTESubscriptionInfoRequest, LTESubscriptionInfoRequest.Builder, LTESubscriptionInfoRequestOrBuilder> singleFieldBuilderV3 = this.lteSubscriptionInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTESubscriptionInfoRequest) singleFieldBuilderV3.getMessage();
                }
                LTESubscriptionInfoRequest lTESubscriptionInfoRequest = this.lteSubscriptionInfoRequest_;
                return lTESubscriptionInfoRequest == null ? LTESubscriptionInfoRequest.getDefaultInstance() : lTESubscriptionInfoRequest;
            }

            public LTESubscriptionInfoRequest.Builder getLteSubscriptionInfoRequestBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (LTESubscriptionInfoRequest.Builder) getLteSubscriptionInfoRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public LTESubscriptionInfoRequestOrBuilder getLteSubscriptionInfoRequestOrBuilder() {
                SingleFieldBuilderV3<LTESubscriptionInfoRequest, LTESubscriptionInfoRequest.Builder, LTESubscriptionInfoRequestOrBuilder> singleFieldBuilderV3 = this.lteSubscriptionInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTESubscriptionInfoRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LTESubscriptionInfoRequest lTESubscriptionInfoRequest = this.lteSubscriptionInfoRequest_;
                return lTESubscriptionInfoRequest == null ? LTESubscriptionInfoRequest.getDefaultInstance() : lTESubscriptionInfoRequest;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public LTESubscriptionInfoResponse getLteSubscriptionInfoResponse() {
                SingleFieldBuilderV3<LTESubscriptionInfoResponse, LTESubscriptionInfoResponse.Builder, LTESubscriptionInfoResponseOrBuilder> singleFieldBuilderV3 = this.lteSubscriptionInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTESubscriptionInfoResponse) singleFieldBuilderV3.getMessage();
                }
                LTESubscriptionInfoResponse lTESubscriptionInfoResponse = this.lteSubscriptionInfoResponse_;
                return lTESubscriptionInfoResponse == null ? LTESubscriptionInfoResponse.getDefaultInstance() : lTESubscriptionInfoResponse;
            }

            public LTESubscriptionInfoResponse.Builder getLteSubscriptionInfoResponseBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (LTESubscriptionInfoResponse.Builder) getLteSubscriptionInfoResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public LTESubscriptionInfoResponseOrBuilder getLteSubscriptionInfoResponseOrBuilder() {
                SingleFieldBuilderV3<LTESubscriptionInfoResponse, LTESubscriptionInfoResponse.Builder, LTESubscriptionInfoResponseOrBuilder> singleFieldBuilderV3 = this.lteSubscriptionInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTESubscriptionInfoResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LTESubscriptionInfoResponse lTESubscriptionInfoResponse = this.lteSubscriptionInfoResponse_;
                return lTESubscriptionInfoResponse == null ? LTESubscriptionInfoResponse.getDefaultInstance() : lTESubscriptionInfoResponse;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public LTEPhoneInfoRequest getPhoneInfoRequest() {
                SingleFieldBuilderV3<LTEPhoneInfoRequest, LTEPhoneInfoRequest.Builder, LTEPhoneInfoRequestOrBuilder> singleFieldBuilderV3 = this.phoneInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTEPhoneInfoRequest) singleFieldBuilderV3.getMessage();
                }
                LTEPhoneInfoRequest lTEPhoneInfoRequest = this.phoneInfoRequest_;
                return lTEPhoneInfoRequest == null ? LTEPhoneInfoRequest.getDefaultInstance() : lTEPhoneInfoRequest;
            }

            public LTEPhoneInfoRequest.Builder getPhoneInfoRequestBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (LTEPhoneInfoRequest.Builder) getPhoneInfoRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public LTEPhoneInfoRequestOrBuilder getPhoneInfoRequestOrBuilder() {
                SingleFieldBuilderV3<LTEPhoneInfoRequest, LTEPhoneInfoRequest.Builder, LTEPhoneInfoRequestOrBuilder> singleFieldBuilderV3 = this.phoneInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTEPhoneInfoRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LTEPhoneInfoRequest lTEPhoneInfoRequest = this.phoneInfoRequest_;
                return lTEPhoneInfoRequest == null ? LTEPhoneInfoRequest.getDefaultInstance() : lTEPhoneInfoRequest;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public LTEPhoneInfoResponse getPhoneInfoResponse() {
                SingleFieldBuilderV3<LTEPhoneInfoResponse, LTEPhoneInfoResponse.Builder, LTEPhoneInfoResponseOrBuilder> singleFieldBuilderV3 = this.phoneInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTEPhoneInfoResponse) singleFieldBuilderV3.getMessage();
                }
                LTEPhoneInfoResponse lTEPhoneInfoResponse = this.phoneInfoResponse_;
                return lTEPhoneInfoResponse == null ? LTEPhoneInfoResponse.getDefaultInstance() : lTEPhoneInfoResponse;
            }

            public LTEPhoneInfoResponse.Builder getPhoneInfoResponseBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (LTEPhoneInfoResponse.Builder) getPhoneInfoResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public LTEPhoneInfoResponseOrBuilder getPhoneInfoResponseOrBuilder() {
                SingleFieldBuilderV3<LTEPhoneInfoResponse, LTEPhoneInfoResponse.Builder, LTEPhoneInfoResponseOrBuilder> singleFieldBuilderV3 = this.phoneInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTEPhoneInfoResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LTEPhoneInfoResponse lTEPhoneInfoResponse = this.phoneInfoResponse_;
                return lTEPhoneInfoResponse == null ? LTEPhoneInfoResponse.getDefaultInstance() : lTEPhoneInfoResponse;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public boolean hasApGeofencingNotification() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public boolean hasApValidationNotification() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public boolean hasLteDeviceInfoRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public boolean hasLteDeviceInfoResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public boolean hasLteDeviceStatusRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public boolean hasLteDeviceStatusResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public boolean hasLteServiceActivationNotification() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public boolean hasLteSubscriptionInfoNotification() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public boolean hasLteSubscriptionInfoRequest() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public boolean hasLteSubscriptionInfoResponse() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public boolean hasPhoneInfoRequest() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceOrBuilder
            public boolean hasPhoneInfoResponse() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEService_fieldAccessorTable.ensureFieldAccessorsInitialized(LTEService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasLteDeviceInfoResponse() && !getLteDeviceInfoResponse().isInitialized()) {
                    return false;
                }
                if (hasLteDeviceStatusResponse() && !getLteDeviceStatusResponse().isInitialized()) {
                    return false;
                }
                if (hasPhoneInfoResponse() && !getPhoneInfoResponse().isInitialized()) {
                    return false;
                }
                if (!hasLteSubscriptionInfoResponse() || getLteSubscriptionInfoResponse().isInitialized()) {
                    return !hasApValidationNotification() || getApValidationNotification().isInitialized();
                }
                return false;
            }

            public Builder mergeApGeofencingNotification(AssistancePlusGeofencingNotification assistancePlusGeofencingNotification) {
                AssistancePlusGeofencingNotification assistancePlusGeofencingNotification2;
                SingleFieldBuilderV3<AssistancePlusGeofencingNotification, AssistancePlusGeofencingNotification.Builder, AssistancePlusGeofencingNotificationOrBuilder> singleFieldBuilderV3 = this.apGeofencingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(assistancePlusGeofencingNotification);
                } else if ((this.bitField0_ & 1024) == 0 || (assistancePlusGeofencingNotification2 = this.apGeofencingNotification_) == null || assistancePlusGeofencingNotification2 == AssistancePlusGeofencingNotification.getDefaultInstance()) {
                    this.apGeofencingNotification_ = assistancePlusGeofencingNotification;
                } else {
                    getApGeofencingNotificationBuilder().mergeFrom(assistancePlusGeofencingNotification);
                }
                if (this.apGeofencingNotification_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeApValidationNotification(AssistancePlusValidationNotification assistancePlusValidationNotification) {
                AssistancePlusValidationNotification assistancePlusValidationNotification2;
                SingleFieldBuilderV3<AssistancePlusValidationNotification, AssistancePlusValidationNotification.Builder, AssistancePlusValidationNotificationOrBuilder> singleFieldBuilderV3 = this.apValidationNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(assistancePlusValidationNotification);
                } else if ((this.bitField0_ & 2048) == 0 || (assistancePlusValidationNotification2 = this.apValidationNotification_) == null || assistancePlusValidationNotification2 == AssistancePlusValidationNotification.getDefaultInstance()) {
                    this.apValidationNotification_ = assistancePlusValidationNotification;
                } else {
                    getApValidationNotificationBuilder().mergeFrom(assistancePlusValidationNotification);
                }
                if (this.apValidationNotification_ != null) {
                    this.bitField0_ |= 2048;
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
                                    codedInputStream.readMessage(getLteDeviceInfoRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getLteDeviceInfoResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getLteDeviceStatusRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getLteDeviceStatusResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getLteServiceActivationNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getPhoneInfoRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getPhoneInfoResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getLteSubscriptionInfoNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getLteSubscriptionInfoRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getLteSubscriptionInfoResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getApGeofencingNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 98:
                                    codedInputStream.readMessage(getApValidationNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
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

            public Builder mergeLteDeviceInfoRequest(LTEDeviceInfoRequest lTEDeviceInfoRequest) {
                LTEDeviceInfoRequest lTEDeviceInfoRequest2;
                SingleFieldBuilderV3<LTEDeviceInfoRequest, LTEDeviceInfoRequest.Builder, LTEDeviceInfoRequestOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(lTEDeviceInfoRequest);
                } else if ((this.bitField0_ & 1) == 0 || (lTEDeviceInfoRequest2 = this.lteDeviceInfoRequest_) == null || lTEDeviceInfoRequest2 == LTEDeviceInfoRequest.getDefaultInstance()) {
                    this.lteDeviceInfoRequest_ = lTEDeviceInfoRequest;
                } else {
                    getLteDeviceInfoRequestBuilder().mergeFrom(lTEDeviceInfoRequest);
                }
                if (this.lteDeviceInfoRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeLteDeviceInfoResponse(LTEDeviceInfoResponse lTEDeviceInfoResponse) {
                LTEDeviceInfoResponse lTEDeviceInfoResponse2;
                SingleFieldBuilderV3<LTEDeviceInfoResponse, LTEDeviceInfoResponse.Builder, LTEDeviceInfoResponseOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(lTEDeviceInfoResponse);
                } else if ((this.bitField0_ & 2) == 0 || (lTEDeviceInfoResponse2 = this.lteDeviceInfoResponse_) == null || lTEDeviceInfoResponse2 == LTEDeviceInfoResponse.getDefaultInstance()) {
                    this.lteDeviceInfoResponse_ = lTEDeviceInfoResponse;
                } else {
                    getLteDeviceInfoResponseBuilder().mergeFrom(lTEDeviceInfoResponse);
                }
                if (this.lteDeviceInfoResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeLteDeviceStatusRequest(LTEDeviceStatusRequest lTEDeviceStatusRequest) {
                LTEDeviceStatusRequest lTEDeviceStatusRequest2;
                SingleFieldBuilderV3<LTEDeviceStatusRequest, LTEDeviceStatusRequest.Builder, LTEDeviceStatusRequestOrBuilder> singleFieldBuilderV3 = this.lteDeviceStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(lTEDeviceStatusRequest);
                } else if ((this.bitField0_ & 4) == 0 || (lTEDeviceStatusRequest2 = this.lteDeviceStatusRequest_) == null || lTEDeviceStatusRequest2 == LTEDeviceStatusRequest.getDefaultInstance()) {
                    this.lteDeviceStatusRequest_ = lTEDeviceStatusRequest;
                } else {
                    getLteDeviceStatusRequestBuilder().mergeFrom(lTEDeviceStatusRequest);
                }
                if (this.lteDeviceStatusRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeLteDeviceStatusResponse(LTEDeviceStatusResponse lTEDeviceStatusResponse) {
                LTEDeviceStatusResponse lTEDeviceStatusResponse2;
                SingleFieldBuilderV3<LTEDeviceStatusResponse, LTEDeviceStatusResponse.Builder, LTEDeviceStatusResponseOrBuilder> singleFieldBuilderV3 = this.lteDeviceStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(lTEDeviceStatusResponse);
                } else if ((this.bitField0_ & 8) == 0 || (lTEDeviceStatusResponse2 = this.lteDeviceStatusResponse_) == null || lTEDeviceStatusResponse2 == LTEDeviceStatusResponse.getDefaultInstance()) {
                    this.lteDeviceStatusResponse_ = lTEDeviceStatusResponse;
                } else {
                    getLteDeviceStatusResponseBuilder().mergeFrom(lTEDeviceStatusResponse);
                }
                if (this.lteDeviceStatusResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeLteServiceActivationNotification(LTEServiceActivationNotification lTEServiceActivationNotification) {
                LTEServiceActivationNotification lTEServiceActivationNotification2;
                SingleFieldBuilderV3<LTEServiceActivationNotification, LTEServiceActivationNotification.Builder, LTEServiceActivationNotificationOrBuilder> singleFieldBuilderV3 = this.lteServiceActivationNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(lTEServiceActivationNotification);
                } else if ((this.bitField0_ & 16) == 0 || (lTEServiceActivationNotification2 = this.lteServiceActivationNotification_) == null || lTEServiceActivationNotification2 == LTEServiceActivationNotification.getDefaultInstance()) {
                    this.lteServiceActivationNotification_ = lTEServiceActivationNotification;
                } else {
                    getLteServiceActivationNotificationBuilder().mergeFrom(lTEServiceActivationNotification);
                }
                if (this.lteServiceActivationNotification_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeLteSubscriptionInfoNotification(LTESubscriptionInfoNotification lTESubscriptionInfoNotification) {
                LTESubscriptionInfoNotification lTESubscriptionInfoNotification2;
                SingleFieldBuilderV3<LTESubscriptionInfoNotification, LTESubscriptionInfoNotification.Builder, LTESubscriptionInfoNotificationOrBuilder> singleFieldBuilderV3 = this.lteSubscriptionInfoNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(lTESubscriptionInfoNotification);
                } else if ((this.bitField0_ & 128) == 0 || (lTESubscriptionInfoNotification2 = this.lteSubscriptionInfoNotification_) == null || lTESubscriptionInfoNotification2 == LTESubscriptionInfoNotification.getDefaultInstance()) {
                    this.lteSubscriptionInfoNotification_ = lTESubscriptionInfoNotification;
                } else {
                    getLteSubscriptionInfoNotificationBuilder().mergeFrom(lTESubscriptionInfoNotification);
                }
                if (this.lteSubscriptionInfoNotification_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeLteSubscriptionInfoRequest(LTESubscriptionInfoRequest lTESubscriptionInfoRequest) {
                LTESubscriptionInfoRequest lTESubscriptionInfoRequest2;
                SingleFieldBuilderV3<LTESubscriptionInfoRequest, LTESubscriptionInfoRequest.Builder, LTESubscriptionInfoRequestOrBuilder> singleFieldBuilderV3 = this.lteSubscriptionInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(lTESubscriptionInfoRequest);
                } else if ((this.bitField0_ & 256) == 0 || (lTESubscriptionInfoRequest2 = this.lteSubscriptionInfoRequest_) == null || lTESubscriptionInfoRequest2 == LTESubscriptionInfoRequest.getDefaultInstance()) {
                    this.lteSubscriptionInfoRequest_ = lTESubscriptionInfoRequest;
                } else {
                    getLteSubscriptionInfoRequestBuilder().mergeFrom(lTESubscriptionInfoRequest);
                }
                if (this.lteSubscriptionInfoRequest_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeLteSubscriptionInfoResponse(LTESubscriptionInfoResponse lTESubscriptionInfoResponse) {
                LTESubscriptionInfoResponse lTESubscriptionInfoResponse2;
                SingleFieldBuilderV3<LTESubscriptionInfoResponse, LTESubscriptionInfoResponse.Builder, LTESubscriptionInfoResponseOrBuilder> singleFieldBuilderV3 = this.lteSubscriptionInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(lTESubscriptionInfoResponse);
                } else if ((this.bitField0_ & 512) == 0 || (lTESubscriptionInfoResponse2 = this.lteSubscriptionInfoResponse_) == null || lTESubscriptionInfoResponse2 == LTESubscriptionInfoResponse.getDefaultInstance()) {
                    this.lteSubscriptionInfoResponse_ = lTESubscriptionInfoResponse;
                } else {
                    getLteSubscriptionInfoResponseBuilder().mergeFrom(lTESubscriptionInfoResponse);
                }
                if (this.lteSubscriptionInfoResponse_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergePhoneInfoRequest(LTEPhoneInfoRequest lTEPhoneInfoRequest) {
                LTEPhoneInfoRequest lTEPhoneInfoRequest2;
                SingleFieldBuilderV3<LTEPhoneInfoRequest, LTEPhoneInfoRequest.Builder, LTEPhoneInfoRequestOrBuilder> singleFieldBuilderV3 = this.phoneInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(lTEPhoneInfoRequest);
                } else if ((this.bitField0_ & 32) == 0 || (lTEPhoneInfoRequest2 = this.phoneInfoRequest_) == null || lTEPhoneInfoRequest2 == LTEPhoneInfoRequest.getDefaultInstance()) {
                    this.phoneInfoRequest_ = lTEPhoneInfoRequest;
                } else {
                    getPhoneInfoRequestBuilder().mergeFrom(lTEPhoneInfoRequest);
                }
                if (this.phoneInfoRequest_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergePhoneInfoResponse(LTEPhoneInfoResponse lTEPhoneInfoResponse) {
                LTEPhoneInfoResponse lTEPhoneInfoResponse2;
                SingleFieldBuilderV3<LTEPhoneInfoResponse, LTEPhoneInfoResponse.Builder, LTEPhoneInfoResponseOrBuilder> singleFieldBuilderV3 = this.phoneInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(lTEPhoneInfoResponse);
                } else if ((this.bitField0_ & 64) == 0 || (lTEPhoneInfoResponse2 = this.phoneInfoResponse_) == null || lTEPhoneInfoResponse2 == LTEPhoneInfoResponse.getDefaultInstance()) {
                    this.phoneInfoResponse_ = lTEPhoneInfoResponse;
                } else {
                    getPhoneInfoResponseBuilder().mergeFrom(lTEPhoneInfoResponse);
                }
                if (this.phoneInfoResponse_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setApGeofencingNotification(AssistancePlusGeofencingNotification.Builder builder) {
                SingleFieldBuilderV3<AssistancePlusGeofencingNotification, AssistancePlusGeofencingNotification.Builder, AssistancePlusGeofencingNotificationOrBuilder> singleFieldBuilderV3 = this.apGeofencingNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.apGeofencingNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setApValidationNotification(AssistancePlusValidationNotification.Builder builder) {
                SingleFieldBuilderV3<AssistancePlusValidationNotification, AssistancePlusValidationNotification.Builder, AssistancePlusValidationNotificationOrBuilder> singleFieldBuilderV3 = this.apValidationNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.apValidationNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLteDeviceInfoRequest(LTEDeviceInfoRequest.Builder builder) {
                SingleFieldBuilderV3<LTEDeviceInfoRequest, LTEDeviceInfoRequest.Builder, LTEDeviceInfoRequestOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.lteDeviceInfoRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setLteDeviceInfoResponse(LTEDeviceInfoResponse.Builder builder) {
                SingleFieldBuilderV3<LTEDeviceInfoResponse, LTEDeviceInfoResponse.Builder, LTEDeviceInfoResponseOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.lteDeviceInfoResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setLteDeviceStatusRequest(LTEDeviceStatusRequest.Builder builder) {
                SingleFieldBuilderV3<LTEDeviceStatusRequest, LTEDeviceStatusRequest.Builder, LTEDeviceStatusRequestOrBuilder> singleFieldBuilderV3 = this.lteDeviceStatusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.lteDeviceStatusRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLteDeviceStatusResponse(LTEDeviceStatusResponse.Builder builder) {
                SingleFieldBuilderV3<LTEDeviceStatusResponse, LTEDeviceStatusResponse.Builder, LTEDeviceStatusResponseOrBuilder> singleFieldBuilderV3 = this.lteDeviceStatusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.lteDeviceStatusResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setLteServiceActivationNotification(LTEServiceActivationNotification.Builder builder) {
                SingleFieldBuilderV3<LTEServiceActivationNotification, LTEServiceActivationNotification.Builder, LTEServiceActivationNotificationOrBuilder> singleFieldBuilderV3 = this.lteServiceActivationNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.lteServiceActivationNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setLteSubscriptionInfoNotification(LTESubscriptionInfoNotification.Builder builder) {
                SingleFieldBuilderV3<LTESubscriptionInfoNotification, LTESubscriptionInfoNotification.Builder, LTESubscriptionInfoNotificationOrBuilder> singleFieldBuilderV3 = this.lteSubscriptionInfoNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.lteSubscriptionInfoNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setLteSubscriptionInfoRequest(LTESubscriptionInfoRequest.Builder builder) {
                SingleFieldBuilderV3<LTESubscriptionInfoRequest, LTESubscriptionInfoRequest.Builder, LTESubscriptionInfoRequestOrBuilder> singleFieldBuilderV3 = this.lteSubscriptionInfoRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.lteSubscriptionInfoRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setLteSubscriptionInfoResponse(LTESubscriptionInfoResponse.Builder builder) {
                SingleFieldBuilderV3<LTESubscriptionInfoResponse, LTESubscriptionInfoResponse.Builder, LTESubscriptionInfoResponseOrBuilder> singleFieldBuilderV3 = this.lteSubscriptionInfoResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.lteSubscriptionInfoResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setPhoneInfoRequest(LTEPhoneInfoRequest.Builder builder) {
                SingleFieldBuilderV3<LTEPhoneInfoRequest, LTEPhoneInfoRequest.Builder, LTEPhoneInfoRequestOrBuilder> singleFieldBuilderV3 = this.phoneInfoRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.phoneInfoRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setPhoneInfoResponse(LTEPhoneInfoResponse.Builder builder) {
                SingleFieldBuilderV3<LTEPhoneInfoResponse, LTEPhoneInfoResponse.Builder, LTEPhoneInfoResponseOrBuilder> singleFieldBuilderV3 = this.phoneInfoResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.phoneInfoResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
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
            public LTEService getDefaultInstanceForType() {
                return LTEService.getDefaultInstance();
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

            public Builder setApGeofencingNotification(AssistancePlusGeofencingNotification assistancePlusGeofencingNotification) {
                SingleFieldBuilderV3<AssistancePlusGeofencingNotification, AssistancePlusGeofencingNotification.Builder, AssistancePlusGeofencingNotificationOrBuilder> singleFieldBuilderV3 = this.apGeofencingNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    assistancePlusGeofencingNotification.getClass();
                    this.apGeofencingNotification_ = assistancePlusGeofencingNotification;
                } else {
                    singleFieldBuilderV3.setMessage(assistancePlusGeofencingNotification);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setApValidationNotification(AssistancePlusValidationNotification assistancePlusValidationNotification) {
                SingleFieldBuilderV3<AssistancePlusValidationNotification, AssistancePlusValidationNotification.Builder, AssistancePlusValidationNotificationOrBuilder> singleFieldBuilderV3 = this.apValidationNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    assistancePlusValidationNotification.getClass();
                    this.apValidationNotification_ = assistancePlusValidationNotification;
                } else {
                    singleFieldBuilderV3.setMessage(assistancePlusValidationNotification);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setLteDeviceInfoRequest(LTEDeviceInfoRequest lTEDeviceInfoRequest) {
                SingleFieldBuilderV3<LTEDeviceInfoRequest, LTEDeviceInfoRequest.Builder, LTEDeviceInfoRequestOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    lTEDeviceInfoRequest.getClass();
                    this.lteDeviceInfoRequest_ = lTEDeviceInfoRequest;
                } else {
                    singleFieldBuilderV3.setMessage(lTEDeviceInfoRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setLteDeviceInfoResponse(LTEDeviceInfoResponse lTEDeviceInfoResponse) {
                SingleFieldBuilderV3<LTEDeviceInfoResponse, LTEDeviceInfoResponse.Builder, LTEDeviceInfoResponseOrBuilder> singleFieldBuilderV3 = this.lteDeviceInfoResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    lTEDeviceInfoResponse.getClass();
                    this.lteDeviceInfoResponse_ = lTEDeviceInfoResponse;
                } else {
                    singleFieldBuilderV3.setMessage(lTEDeviceInfoResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setLteDeviceStatusRequest(LTEDeviceStatusRequest lTEDeviceStatusRequest) {
                SingleFieldBuilderV3<LTEDeviceStatusRequest, LTEDeviceStatusRequest.Builder, LTEDeviceStatusRequestOrBuilder> singleFieldBuilderV3 = this.lteDeviceStatusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    lTEDeviceStatusRequest.getClass();
                    this.lteDeviceStatusRequest_ = lTEDeviceStatusRequest;
                } else {
                    singleFieldBuilderV3.setMessage(lTEDeviceStatusRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLteDeviceStatusResponse(LTEDeviceStatusResponse lTEDeviceStatusResponse) {
                SingleFieldBuilderV3<LTEDeviceStatusResponse, LTEDeviceStatusResponse.Builder, LTEDeviceStatusResponseOrBuilder> singleFieldBuilderV3 = this.lteDeviceStatusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    lTEDeviceStatusResponse.getClass();
                    this.lteDeviceStatusResponse_ = lTEDeviceStatusResponse;
                } else {
                    singleFieldBuilderV3.setMessage(lTEDeviceStatusResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setLteServiceActivationNotification(LTEServiceActivationNotification lTEServiceActivationNotification) {
                SingleFieldBuilderV3<LTEServiceActivationNotification, LTEServiceActivationNotification.Builder, LTEServiceActivationNotificationOrBuilder> singleFieldBuilderV3 = this.lteServiceActivationNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    lTEServiceActivationNotification.getClass();
                    this.lteServiceActivationNotification_ = lTEServiceActivationNotification;
                } else {
                    singleFieldBuilderV3.setMessage(lTEServiceActivationNotification);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setLteSubscriptionInfoNotification(LTESubscriptionInfoNotification lTESubscriptionInfoNotification) {
                SingleFieldBuilderV3<LTESubscriptionInfoNotification, LTESubscriptionInfoNotification.Builder, LTESubscriptionInfoNotificationOrBuilder> singleFieldBuilderV3 = this.lteSubscriptionInfoNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    lTESubscriptionInfoNotification.getClass();
                    this.lteSubscriptionInfoNotification_ = lTESubscriptionInfoNotification;
                } else {
                    singleFieldBuilderV3.setMessage(lTESubscriptionInfoNotification);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setLteSubscriptionInfoRequest(LTESubscriptionInfoRequest lTESubscriptionInfoRequest) {
                SingleFieldBuilderV3<LTESubscriptionInfoRequest, LTESubscriptionInfoRequest.Builder, LTESubscriptionInfoRequestOrBuilder> singleFieldBuilderV3 = this.lteSubscriptionInfoRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    lTESubscriptionInfoRequest.getClass();
                    this.lteSubscriptionInfoRequest_ = lTESubscriptionInfoRequest;
                } else {
                    singleFieldBuilderV3.setMessage(lTESubscriptionInfoRequest);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setLteSubscriptionInfoResponse(LTESubscriptionInfoResponse lTESubscriptionInfoResponse) {
                SingleFieldBuilderV3<LTESubscriptionInfoResponse, LTESubscriptionInfoResponse.Builder, LTESubscriptionInfoResponseOrBuilder> singleFieldBuilderV3 = this.lteSubscriptionInfoResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    lTESubscriptionInfoResponse.getClass();
                    this.lteSubscriptionInfoResponse_ = lTESubscriptionInfoResponse;
                } else {
                    singleFieldBuilderV3.setMessage(lTESubscriptionInfoResponse);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setPhoneInfoRequest(LTEPhoneInfoRequest lTEPhoneInfoRequest) {
                SingleFieldBuilderV3<LTEPhoneInfoRequest, LTEPhoneInfoRequest.Builder, LTEPhoneInfoRequestOrBuilder> singleFieldBuilderV3 = this.phoneInfoRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    lTEPhoneInfoRequest.getClass();
                    this.phoneInfoRequest_ = lTEPhoneInfoRequest;
                } else {
                    singleFieldBuilderV3.setMessage(lTEPhoneInfoRequest);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setPhoneInfoResponse(LTEPhoneInfoResponse lTEPhoneInfoResponse) {
                SingleFieldBuilderV3<LTEPhoneInfoResponse, LTEPhoneInfoResponse.Builder, LTEPhoneInfoResponseOrBuilder> singleFieldBuilderV3 = this.phoneInfoResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    lTEPhoneInfoResponse.getClass();
                    this.phoneInfoResponse_ = lTEPhoneInfoResponse;
                } else {
                    singleFieldBuilderV3.setMessage(lTEPhoneInfoResponse);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LTEService) {
                    return mergeFrom((LTEService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LTEService lTEService) {
                if (lTEService == LTEService.getDefaultInstance()) {
                    return this;
                }
                if (lTEService.hasLteDeviceInfoRequest()) {
                    mergeLteDeviceInfoRequest(lTEService.getLteDeviceInfoRequest());
                }
                if (lTEService.hasLteDeviceInfoResponse()) {
                    mergeLteDeviceInfoResponse(lTEService.getLteDeviceInfoResponse());
                }
                if (lTEService.hasLteDeviceStatusRequest()) {
                    mergeLteDeviceStatusRequest(lTEService.getLteDeviceStatusRequest());
                }
                if (lTEService.hasLteDeviceStatusResponse()) {
                    mergeLteDeviceStatusResponse(lTEService.getLteDeviceStatusResponse());
                }
                if (lTEService.hasLteServiceActivationNotification()) {
                    mergeLteServiceActivationNotification(lTEService.getLteServiceActivationNotification());
                }
                if (lTEService.hasPhoneInfoRequest()) {
                    mergePhoneInfoRequest(lTEService.getPhoneInfoRequest());
                }
                if (lTEService.hasPhoneInfoResponse()) {
                    mergePhoneInfoResponse(lTEService.getPhoneInfoResponse());
                }
                if (lTEService.hasLteSubscriptionInfoNotification()) {
                    mergeLteSubscriptionInfoNotification(lTEService.getLteSubscriptionInfoNotification());
                }
                if (lTEService.hasLteSubscriptionInfoRequest()) {
                    mergeLteSubscriptionInfoRequest(lTEService.getLteSubscriptionInfoRequest());
                }
                if (lTEService.hasLteSubscriptionInfoResponse()) {
                    mergeLteSubscriptionInfoResponse(lTEService.getLteSubscriptionInfoResponse());
                }
                if (lTEService.hasApGeofencingNotification()) {
                    mergeApGeofencingNotification(lTEService.getApGeofencingNotification());
                }
                if (lTEService.hasApValidationNotification()) {
                    mergeApValidationNotification(lTEService.getApValidationNotification());
                }
                mergeUnknownFields(lTEService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LTEService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ LTEService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private LTEService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LTEService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTEService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LTEService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LTEService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LTEService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LTEService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LTEService parseFrom(InputStream inputStream) {
            return (LTEService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LTEService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTEService parseFrom(CodedInputStream codedInputStream) {
            return (LTEService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LTEService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LTEServiceActivationNotification extends GeneratedMessageV3 implements LTEServiceActivationNotificationOrBuilder {
        private static final LTEServiceActivationNotification DEFAULT_INSTANCE = new LTEServiceActivationNotification();

        @Deprecated
        public static final Parser<LTEServiceActivationNotification> PARSER = new AbstractParser<LTEServiceActivationNotification>() { // from class: com.garmin.proto.generated.GDILTEProto.LTEServiceActivationNotification.1
            @Override // com.google.protobuf.Parser
            public LTEServiceActivationNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LTEServiceActivationNotification.newBuilder();
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
        public static final int SERVICE_PROVIDER_FIELD_NUMBER = 1;
        public static final int STATUS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int serviceProvider_;
        private int status_;

        private LTEServiceActivationNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.serviceProvider_ = 1;
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LTEServiceActivationNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTEServiceActivationNotification_descriptor;
        }

        public static Builder newBuilder(LTEServiceActivationNotification lTEServiceActivationNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lTEServiceActivationNotification);
        }

        public static LTEServiceActivationNotification parseDelimitedFrom(InputStream inputStream) {
            return (LTEServiceActivationNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LTEServiceActivationNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LTEServiceActivationNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LTEServiceActivationNotification)) {
                return super.equals(obj);
            }
            LTEServiceActivationNotification lTEServiceActivationNotification = (LTEServiceActivationNotification) obj;
            if (hasServiceProvider() != lTEServiceActivationNotification.hasServiceProvider()) {
                return false;
            }
            if ((!hasServiceProvider() || this.serviceProvider_ == lTEServiceActivationNotification.serviceProvider_) && hasStatus() == lTEServiceActivationNotification.hasStatus()) {
                return (!hasStatus() || this.status_ == lTEServiceActivationNotification.status_) && getUnknownFields().equals(lTEServiceActivationNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LTEServiceActivationNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.serviceProvider_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.status_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceActivationNotificationOrBuilder
        public LTEServiceProvider getServiceProvider() {
            LTEServiceProvider lTEServiceProviderForNumber = LTEServiceProvider.forNumber(this.serviceProvider_);
            return lTEServiceProviderForNumber == null ? LTEServiceProvider.VERIZON : lTEServiceProviderForNumber;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceActivationNotificationOrBuilder
        public ActivationStatus getStatus() {
            ActivationStatus activationStatusForNumber = ActivationStatus.forNumber(this.status_);
            return activationStatusForNumber == null ? ActivationStatus.STARTED : activationStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceActivationNotificationOrBuilder
        public boolean hasServiceProvider() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceActivationNotificationOrBuilder
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
            if (hasServiceProvider()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.serviceProvider_;
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
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTEServiceActivationNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(LTEServiceActivationNotification.class, Builder.class);
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
            return new LTEServiceActivationNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.serviceProvider_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LTEServiceActivationNotificationOrBuilder {
            private int bitField0_;
            private int serviceProvider_;
            private int status_;

            private Builder() {
                this.serviceProvider_ = 1;
                this.status_ = 0;
            }

            private void buildPartial0(LTEServiceActivationNotification lTEServiceActivationNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    lTEServiceActivationNotification.serviceProvider_ = this.serviceProvider_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    lTEServiceActivationNotification.status_ = this.status_;
                    i14 |= 2;
                }
                lTEServiceActivationNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEServiceActivationNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTEServiceActivationNotification build() {
                LTEServiceActivationNotification lTEServiceActivationNotificationBuildPartial = buildPartial();
                if (lTEServiceActivationNotificationBuildPartial.isInitialized()) {
                    return lTEServiceActivationNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) lTEServiceActivationNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTEServiceActivationNotification buildPartial() {
                LTEServiceActivationNotification lTEServiceActivationNotification = new LTEServiceActivationNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(lTEServiceActivationNotification);
                }
                onBuilt();
                return lTEServiceActivationNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.serviceProvider_ = 1;
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

            public Builder clearServiceProvider() {
                this.bitField0_ &= -2;
                this.serviceProvider_ = 1;
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
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEServiceActivationNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceActivationNotificationOrBuilder
            public LTEServiceProvider getServiceProvider() {
                LTEServiceProvider lTEServiceProviderForNumber = LTEServiceProvider.forNumber(this.serviceProvider_);
                return lTEServiceProviderForNumber == null ? LTEServiceProvider.VERIZON : lTEServiceProviderForNumber;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceActivationNotificationOrBuilder
            public ActivationStatus getStatus() {
                ActivationStatus activationStatusForNumber = ActivationStatus.forNumber(this.status_);
                return activationStatusForNumber == null ? ActivationStatus.STARTED : activationStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceActivationNotificationOrBuilder
            public boolean hasServiceProvider() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTEServiceActivationNotificationOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTEServiceActivationNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(LTEServiceActivationNotification.class, Builder.class);
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
                                    if (LTEServiceProvider.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.serviceProvider_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    int i15 = codedInputStream.readEnum();
                                    if (ActivationStatus.forNumber(i15) == null) {
                                        mergeUnknownVarintField(2, i15);
                                    } else {
                                        this.status_ = i15;
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

            public Builder setServiceProvider(LTEServiceProvider lTEServiceProvider) {
                lTEServiceProvider.getClass();
                this.bitField0_ |= 1;
                this.serviceProvider_ = lTEServiceProvider.getNumber();
                onChanged();
                return this;
            }

            public Builder setStatus(ActivationStatus activationStatus) {
                activationStatus.getClass();
                this.bitField0_ |= 2;
                this.status_ = activationStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LTEServiceActivationNotification getDefaultInstanceForType() {
                return LTEServiceActivationNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.serviceProvider_ = 1;
                this.status_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LTEServiceActivationNotification) {
                    return mergeFrom((LTEServiceActivationNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LTEServiceActivationNotification lTEServiceActivationNotification) {
                if (lTEServiceActivationNotification == LTEServiceActivationNotification.getDefaultInstance()) {
                    return this;
                }
                if (lTEServiceActivationNotification.hasServiceProvider()) {
                    setServiceProvider(lTEServiceActivationNotification.getServiceProvider());
                }
                if (lTEServiceActivationNotification.hasStatus()) {
                    setStatus(lTEServiceActivationNotification.getStatus());
                }
                mergeUnknownFields(lTEServiceActivationNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LTEServiceActivationNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LTEServiceActivationNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEServiceActivationNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTEServiceActivationNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LTEServiceActivationNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LTEServiceActivationNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LTEServiceActivationNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ LTEServiceActivationNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LTEServiceActivationNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private LTEServiceActivationNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.serviceProvider_ = 1;
            this.status_ = 0;
        }

        public static LTEServiceActivationNotification parseFrom(InputStream inputStream) {
            return (LTEServiceActivationNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LTEServiceActivationNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEServiceActivationNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTEServiceActivationNotification parseFrom(CodedInputStream codedInputStream) {
            return (LTEServiceActivationNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LTEServiceActivationNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTEServiceActivationNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ActivationStatus implements ProtocolMessageEnum {
            STARTED(0),
            CANCELLED(1),
            SUCCESS(2);

            public static final int CANCELLED_VALUE = 1;
            public static final int STARTED_VALUE = 0;
            public static final int SUCCESS_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<ActivationStatus> internalValueMap = new Internal.EnumLiteMap<ActivationStatus>() { // from class: com.garmin.proto.generated.GDILTEProto.LTEServiceActivationNotification.ActivationStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ActivationStatus findValueByNumber(int i14) {
                    return ActivationStatus.forNumber(i14);
                }
            };
            private static final ActivationStatus[] VALUES = values();

            ActivationStatus(int i14) {
                this.value = i14;
            }

            public static ActivationStatus forNumber(int i14) {
                if (i14 == 0) {
                    return STARTED;
                }
                if (i14 == 1) {
                    return CANCELLED;
                }
                if (i14 != 2) {
                    return null;
                }
                return SUCCESS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return LTEServiceActivationNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ActivationStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ActivationStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ActivationStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class LTESubscriptionInfo extends GeneratedMessageV3 implements LTESubscriptionInfoOrBuilder {
        public static final int ACCOUNT_EXPIRATION_UNIX_TIMESTAMP_FIELD_NUMBER = 3;
        public static final int DEVICE_ID_FIELD_NUMBER = 1;
        public static final int IS_SUBSCRIBED_FIELD_NUMBER = 2;
        public static final int SUBSCRIPTION_STATUS_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private long accountExpirationUnixTimestamp_;
        private int bitField0_;
        private int deviceId_;
        private boolean isSubscribed_;
        private byte memoizedIsInitialized;
        private int subscriptionStatus_;
        private static final LTESubscriptionInfo DEFAULT_INSTANCE = new LTESubscriptionInfo();

        @Deprecated
        public static final Parser<LTESubscriptionInfo> PARSER = new AbstractParser<LTESubscriptionInfo>() { // from class: com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfo.1
            @Override // com.google.protobuf.Parser
            public LTESubscriptionInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LTESubscriptionInfo.newBuilder();
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

        private LTESubscriptionInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.deviceId_ = 0;
            this.isSubscribed_ = false;
            this.accountExpirationUnixTimestamp_ = 0L;
            this.subscriptionStatus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LTESubscriptionInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTESubscriptionInfo_descriptor;
        }

        public static Builder newBuilder(LTESubscriptionInfo lTESubscriptionInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lTESubscriptionInfo);
        }

        public static LTESubscriptionInfo parseDelimitedFrom(InputStream inputStream) {
            return (LTESubscriptionInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LTESubscriptionInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LTESubscriptionInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LTESubscriptionInfo)) {
                return super.equals(obj);
            }
            LTESubscriptionInfo lTESubscriptionInfo = (LTESubscriptionInfo) obj;
            if (hasDeviceId() != lTESubscriptionInfo.hasDeviceId()) {
                return false;
            }
            if ((hasDeviceId() && getDeviceId() != lTESubscriptionInfo.getDeviceId()) || hasIsSubscribed() != lTESubscriptionInfo.hasIsSubscribed()) {
                return false;
            }
            if ((hasIsSubscribed() && getIsSubscribed() != lTESubscriptionInfo.getIsSubscribed()) || hasAccountExpirationUnixTimestamp() != lTESubscriptionInfo.hasAccountExpirationUnixTimestamp()) {
                return false;
            }
            if ((!hasAccountExpirationUnixTimestamp() || getAccountExpirationUnixTimestamp() == lTESubscriptionInfo.getAccountExpirationUnixTimestamp()) && hasSubscriptionStatus() == lTESubscriptionInfo.hasSubscriptionStatus()) {
                return (!hasSubscriptionStatus() || this.subscriptionStatus_ == lTESubscriptionInfo.subscriptionStatus_) && getUnknownFields().equals(lTESubscriptionInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoOrBuilder
        public long getAccountExpirationUnixTimestamp() {
            return this.accountExpirationUnixTimestamp_;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoOrBuilder
        public int getDeviceId() {
            return this.deviceId_;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoOrBuilder
        public boolean getIsSubscribed() {
            return this.isSubscribed_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LTESubscriptionInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.deviceId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(2, this.isSubscribed_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeInt64Size(3, this.accountExpirationUnixTimestamp_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(4, this.subscriptionStatus_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoOrBuilder
        public SubscriptionStatus getSubscriptionStatus() {
            SubscriptionStatus subscriptionStatusForNumber = SubscriptionStatus.forNumber(this.subscriptionStatus_);
            return subscriptionStatusForNumber == null ? SubscriptionStatus.ACTIVE : subscriptionStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoOrBuilder
        public boolean hasAccountExpirationUnixTimestamp() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoOrBuilder
        public boolean hasDeviceId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoOrBuilder
        public boolean hasIsSubscribed() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoOrBuilder
        public boolean hasSubscriptionStatus() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDeviceId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDeviceId();
            }
            if (hasIsSubscribed()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getIsSubscribed());
            }
            if (hasAccountExpirationUnixTimestamp()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashLong(getAccountExpirationUnixTimestamp());
            }
            if (hasSubscriptionStatus()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + this.subscriptionStatus_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTESubscriptionInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(LTESubscriptionInfo.class, Builder.class);
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
            return new LTESubscriptionInfo();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.deviceId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.isSubscribed_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeInt64(3, this.accountExpirationUnixTimestamp_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(4, this.subscriptionStatus_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LTESubscriptionInfoOrBuilder {
            private long accountExpirationUnixTimestamp_;
            private int bitField0_;
            private int deviceId_;
            private boolean isSubscribed_;
            private int subscriptionStatus_;

            private Builder() {
                this.subscriptionStatus_ = 0;
            }

            private void buildPartial0(LTESubscriptionInfo lTESubscriptionInfo) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    lTESubscriptionInfo.deviceId_ = this.deviceId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    lTESubscriptionInfo.isSubscribed_ = this.isSubscribed_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    lTESubscriptionInfo.accountExpirationUnixTimestamp_ = this.accountExpirationUnixTimestamp_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    lTESubscriptionInfo.subscriptionStatus_ = this.subscriptionStatus_;
                    i14 |= 8;
                }
                lTESubscriptionInfo.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTESubscriptionInfo_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTESubscriptionInfo build() {
                LTESubscriptionInfo lTESubscriptionInfoBuildPartial = buildPartial();
                if (lTESubscriptionInfoBuildPartial.isInitialized()) {
                    return lTESubscriptionInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) lTESubscriptionInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTESubscriptionInfo buildPartial() {
                LTESubscriptionInfo lTESubscriptionInfo = new LTESubscriptionInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(lTESubscriptionInfo);
                }
                onBuilt();
                return lTESubscriptionInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.deviceId_ = 0;
                this.isSubscribed_ = false;
                this.accountExpirationUnixTimestamp_ = 0L;
                this.subscriptionStatus_ = 0;
                return this;
            }

            public Builder clearAccountExpirationUnixTimestamp() {
                this.bitField0_ &= -5;
                this.accountExpirationUnixTimestamp_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearDeviceId() {
                this.bitField0_ &= -2;
                this.deviceId_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIsSubscribed() {
                this.bitField0_ &= -3;
                this.isSubscribed_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSubscriptionStatus() {
                this.bitField0_ &= -9;
                this.subscriptionStatus_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoOrBuilder
            public long getAccountExpirationUnixTimestamp() {
                return this.accountExpirationUnixTimestamp_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTESubscriptionInfo_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoOrBuilder
            public int getDeviceId() {
                return this.deviceId_;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoOrBuilder
            public boolean getIsSubscribed() {
                return this.isSubscribed_;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoOrBuilder
            public SubscriptionStatus getSubscriptionStatus() {
                SubscriptionStatus subscriptionStatusForNumber = SubscriptionStatus.forNumber(this.subscriptionStatus_);
                return subscriptionStatusForNumber == null ? SubscriptionStatus.ACTIVE : subscriptionStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoOrBuilder
            public boolean hasAccountExpirationUnixTimestamp() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoOrBuilder
            public boolean hasDeviceId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoOrBuilder
            public boolean hasIsSubscribed() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoOrBuilder
            public boolean hasSubscriptionStatus() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTESubscriptionInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(LTESubscriptionInfo.class, Builder.class);
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
                                    this.deviceId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.isSubscribed_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.accountExpirationUnixTimestamp_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    int i14 = codedInputStream.readEnum();
                                    if (SubscriptionStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(4, i14);
                                    } else {
                                        this.subscriptionStatus_ = i14;
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

            public Builder setAccountExpirationUnixTimestamp(long j8) {
                this.accountExpirationUnixTimestamp_ = j8;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setDeviceId(int i14) {
                this.deviceId_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setIsSubscribed(boolean z14) {
                this.isSubscribed_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSubscriptionStatus(SubscriptionStatus subscriptionStatus) {
                subscriptionStatus.getClass();
                this.bitField0_ |= 8;
                this.subscriptionStatus_ = subscriptionStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LTESubscriptionInfo getDefaultInstanceForType() {
                return LTESubscriptionInfo.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.subscriptionStatus_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LTESubscriptionInfo) {
                    return mergeFrom((LTESubscriptionInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LTESubscriptionInfo lTESubscriptionInfo) {
                if (lTESubscriptionInfo == LTESubscriptionInfo.getDefaultInstance()) {
                    return this;
                }
                if (lTESubscriptionInfo.hasDeviceId()) {
                    setDeviceId(lTESubscriptionInfo.getDeviceId());
                }
                if (lTESubscriptionInfo.hasIsSubscribed()) {
                    setIsSubscribed(lTESubscriptionInfo.getIsSubscribed());
                }
                if (lTESubscriptionInfo.hasAccountExpirationUnixTimestamp()) {
                    setAccountExpirationUnixTimestamp(lTESubscriptionInfo.getAccountExpirationUnixTimestamp());
                }
                if (lTESubscriptionInfo.hasSubscriptionStatus()) {
                    setSubscriptionStatus(lTESubscriptionInfo.getSubscriptionStatus());
                }
                mergeUnknownFields(lTESubscriptionInfo.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LTESubscriptionInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LTESubscriptionInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTESubscriptionInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTESubscriptionInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LTESubscriptionInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LTESubscriptionInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LTESubscriptionInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LTESubscriptionInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LTESubscriptionInfo parseFrom(InputStream inputStream) {
            return (LTESubscriptionInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LTESubscriptionInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTESubscriptionInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ LTESubscriptionInfo(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LTESubscriptionInfo parseFrom(CodedInputStream codedInputStream) {
            return (LTESubscriptionInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private LTESubscriptionInfo() {
            this.deviceId_ = 0;
            this.isSubscribed_ = false;
            this.accountExpirationUnixTimestamp_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
            this.subscriptionStatus_ = 0;
        }

        public static LTESubscriptionInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTESubscriptionInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum SubscriptionStatus implements ProtocolMessageEnum {
            ACTIVE(0),
            INACTIVE(1),
            PENDING(2);

            public static final int ACTIVE_VALUE = 0;
            public static final int INACTIVE_VALUE = 1;
            public static final int PENDING_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<SubscriptionStatus> internalValueMap = new Internal.EnumLiteMap<SubscriptionStatus>() { // from class: com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfo.SubscriptionStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SubscriptionStatus findValueByNumber(int i14) {
                    return SubscriptionStatus.forNumber(i14);
                }
            };
            private static final SubscriptionStatus[] VALUES = values();

            SubscriptionStatus(int i14) {
                this.value = i14;
            }

            public static SubscriptionStatus forNumber(int i14) {
                if (i14 == 0) {
                    return ACTIVE;
                }
                if (i14 == 1) {
                    return INACTIVE;
                }
                if (i14 != 2) {
                    return null;
                }
                return PENDING;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return LTESubscriptionInfo.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<SubscriptionStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static SubscriptionStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static SubscriptionStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class LTESubscriptionInfoNotification extends GeneratedMessageV3 implements LTESubscriptionInfoNotificationOrBuilder {
        public static final int INFO_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private LTESubscriptionInfo info_;
        private byte memoizedIsInitialized;
        private static final LTESubscriptionInfoNotification DEFAULT_INSTANCE = new LTESubscriptionInfoNotification();

        @Deprecated
        public static final Parser<LTESubscriptionInfoNotification> PARSER = new AbstractParser<LTESubscriptionInfoNotification>() { // from class: com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoNotification.1
            @Override // com.google.protobuf.Parser
            public LTESubscriptionInfoNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LTESubscriptionInfoNotification.newBuilder();
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

        private LTESubscriptionInfoNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LTESubscriptionInfoNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTESubscriptionInfoNotification_descriptor;
        }

        public static Builder newBuilder(LTESubscriptionInfoNotification lTESubscriptionInfoNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lTESubscriptionInfoNotification);
        }

        public static LTESubscriptionInfoNotification parseDelimitedFrom(InputStream inputStream) {
            return (LTESubscriptionInfoNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LTESubscriptionInfoNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LTESubscriptionInfoNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LTESubscriptionInfoNotification)) {
                return super.equals(obj);
            }
            LTESubscriptionInfoNotification lTESubscriptionInfoNotification = (LTESubscriptionInfoNotification) obj;
            if (hasInfo() != lTESubscriptionInfoNotification.hasInfo()) {
                return false;
            }
            return (!hasInfo() || getInfo().equals(lTESubscriptionInfoNotification.getInfo())) && getUnknownFields().equals(lTESubscriptionInfoNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoNotificationOrBuilder
        public LTESubscriptionInfo getInfo() {
            LTESubscriptionInfo lTESubscriptionInfo = this.info_;
            return lTESubscriptionInfo == null ? LTESubscriptionInfo.getDefaultInstance() : lTESubscriptionInfo;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoNotificationOrBuilder
        public LTESubscriptionInfoOrBuilder getInfoOrBuilder() {
            LTESubscriptionInfo lTESubscriptionInfo = this.info_;
            return lTESubscriptionInfo == null ? LTESubscriptionInfo.getDefaultInstance() : lTESubscriptionInfo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LTESubscriptionInfoNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getInfo()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoNotificationOrBuilder
        public boolean hasInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasInfo()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getInfo().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTESubscriptionInfoNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(LTESubscriptionInfoNotification.class, Builder.class);
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
            return new LTESubscriptionInfoNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getInfo());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LTESubscriptionInfoNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<LTESubscriptionInfo, LTESubscriptionInfo.Builder, LTESubscriptionInfoOrBuilder> infoBuilder_;
            private LTESubscriptionInfo info_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(LTESubscriptionInfoNotification lTESubscriptionInfoNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<LTESubscriptionInfo, LTESubscriptionInfo.Builder, LTESubscriptionInfoOrBuilder> singleFieldBuilderV3 = this.infoBuilder_;
                    lTESubscriptionInfoNotification.info_ = singleFieldBuilderV3 == null ? this.info_ : (LTESubscriptionInfo) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                lTESubscriptionInfoNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTESubscriptionInfoNotification_descriptor;
            }

            private SingleFieldBuilderV3<LTESubscriptionInfo, LTESubscriptionInfo.Builder, LTESubscriptionInfoOrBuilder> getInfoFieldBuilder() {
                if (this.infoBuilder_ == null) {
                    this.infoBuilder_ = new SingleFieldBuilderV3<>(getInfo(), getParentForChildren(), isClean());
                    this.info_ = null;
                }
                return this.infoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getInfoFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTESubscriptionInfoNotification build() {
                LTESubscriptionInfoNotification lTESubscriptionInfoNotificationBuildPartial = buildPartial();
                if (lTESubscriptionInfoNotificationBuildPartial.isInitialized()) {
                    return lTESubscriptionInfoNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) lTESubscriptionInfoNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTESubscriptionInfoNotification buildPartial() {
                LTESubscriptionInfoNotification lTESubscriptionInfoNotification = new LTESubscriptionInfoNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(lTESubscriptionInfoNotification);
                }
                onBuilt();
                return lTESubscriptionInfoNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.info_ = null;
                SingleFieldBuilderV3<LTESubscriptionInfo, LTESubscriptionInfo.Builder, LTESubscriptionInfoOrBuilder> singleFieldBuilderV3 = this.infoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.infoBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearInfo() {
                this.bitField0_ &= -2;
                this.info_ = null;
                SingleFieldBuilderV3<LTESubscriptionInfo, LTESubscriptionInfo.Builder, LTESubscriptionInfoOrBuilder> singleFieldBuilderV3 = this.infoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.infoBuilder_ = null;
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
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTESubscriptionInfoNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoNotificationOrBuilder
            public LTESubscriptionInfo getInfo() {
                SingleFieldBuilderV3<LTESubscriptionInfo, LTESubscriptionInfo.Builder, LTESubscriptionInfoOrBuilder> singleFieldBuilderV3 = this.infoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTESubscriptionInfo) singleFieldBuilderV3.getMessage();
                }
                LTESubscriptionInfo lTESubscriptionInfo = this.info_;
                return lTESubscriptionInfo == null ? LTESubscriptionInfo.getDefaultInstance() : lTESubscriptionInfo;
            }

            public LTESubscriptionInfo.Builder getInfoBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (LTESubscriptionInfo.Builder) getInfoFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoNotificationOrBuilder
            public LTESubscriptionInfoOrBuilder getInfoOrBuilder() {
                SingleFieldBuilderV3<LTESubscriptionInfo, LTESubscriptionInfo.Builder, LTESubscriptionInfoOrBuilder> singleFieldBuilderV3 = this.infoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTESubscriptionInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LTESubscriptionInfo lTESubscriptionInfo = this.info_;
                return lTESubscriptionInfo == null ? LTESubscriptionInfo.getDefaultInstance() : lTESubscriptionInfo;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoNotificationOrBuilder
            public boolean hasInfo() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTESubscriptionInfoNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(LTESubscriptionInfoNotification.class, Builder.class);
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
                                    codedInputStream.readMessage(getInfoFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeInfo(LTESubscriptionInfo lTESubscriptionInfo) {
                LTESubscriptionInfo lTESubscriptionInfo2;
                SingleFieldBuilderV3<LTESubscriptionInfo, LTESubscriptionInfo.Builder, LTESubscriptionInfoOrBuilder> singleFieldBuilderV3 = this.infoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(lTESubscriptionInfo);
                } else if ((this.bitField0_ & 1) == 0 || (lTESubscriptionInfo2 = this.info_) == null || lTESubscriptionInfo2 == LTESubscriptionInfo.getDefaultInstance()) {
                    this.info_ = lTESubscriptionInfo;
                } else {
                    getInfoBuilder().mergeFrom(lTESubscriptionInfo);
                }
                if (this.info_ != null) {
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

            public Builder setInfo(LTESubscriptionInfo.Builder builder) {
                SingleFieldBuilderV3<LTESubscriptionInfo, LTESubscriptionInfo.Builder, LTESubscriptionInfoOrBuilder> singleFieldBuilderV3 = this.infoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.info_ = builder.build();
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
            public LTESubscriptionInfoNotification getDefaultInstanceForType() {
                return LTESubscriptionInfoNotification.getDefaultInstance();
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

            public Builder setInfo(LTESubscriptionInfo lTESubscriptionInfo) {
                SingleFieldBuilderV3<LTESubscriptionInfo, LTESubscriptionInfo.Builder, LTESubscriptionInfoOrBuilder> singleFieldBuilderV3 = this.infoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    lTESubscriptionInfo.getClass();
                    this.info_ = lTESubscriptionInfo;
                } else {
                    singleFieldBuilderV3.setMessage(lTESubscriptionInfo);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LTESubscriptionInfoNotification) {
                    return mergeFrom((LTESubscriptionInfoNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LTESubscriptionInfoNotification lTESubscriptionInfoNotification) {
                if (lTESubscriptionInfoNotification == LTESubscriptionInfoNotification.getDefaultInstance()) {
                    return this;
                }
                if (lTESubscriptionInfoNotification.hasInfo()) {
                    mergeInfo(lTESubscriptionInfoNotification.getInfo());
                }
                mergeUnknownFields(lTESubscriptionInfoNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LTESubscriptionInfoNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ LTESubscriptionInfoNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private LTESubscriptionInfoNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LTESubscriptionInfoNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTESubscriptionInfoNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTESubscriptionInfoNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LTESubscriptionInfoNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LTESubscriptionInfoNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LTESubscriptionInfoNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LTESubscriptionInfoNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LTESubscriptionInfoNotification parseFrom(InputStream inputStream) {
            return (LTESubscriptionInfoNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LTESubscriptionInfoNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTESubscriptionInfoNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTESubscriptionInfoNotification parseFrom(CodedInputStream codedInputStream) {
            return (LTESubscriptionInfoNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LTESubscriptionInfoNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTESubscriptionInfoNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LTESubscriptionInfoResponse extends GeneratedMessageV3 implements LTESubscriptionInfoResponseOrBuilder {
        public static final int INFO_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private LTESubscriptionInfo info_;
        private byte memoizedIsInitialized;
        private int status_;
        private static final LTESubscriptionInfoResponse DEFAULT_INSTANCE = new LTESubscriptionInfoResponse();

        @Deprecated
        public static final Parser<LTESubscriptionInfoResponse> PARSER = new AbstractParser<LTESubscriptionInfoResponse>() { // from class: com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoResponse.1
            @Override // com.google.protobuf.Parser
            public LTESubscriptionInfoResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LTESubscriptionInfoResponse.newBuilder();
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

        private LTESubscriptionInfoResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LTESubscriptionInfoResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTESubscriptionInfoResponse_descriptor;
        }

        public static Builder newBuilder(LTESubscriptionInfoResponse lTESubscriptionInfoResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lTESubscriptionInfoResponse);
        }

        public static LTESubscriptionInfoResponse parseDelimitedFrom(InputStream inputStream) {
            return (LTESubscriptionInfoResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LTESubscriptionInfoResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LTESubscriptionInfoResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LTESubscriptionInfoResponse)) {
                return super.equals(obj);
            }
            LTESubscriptionInfoResponse lTESubscriptionInfoResponse = (LTESubscriptionInfoResponse) obj;
            if (hasStatus() != lTESubscriptionInfoResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == lTESubscriptionInfoResponse.status_) && hasInfo() == lTESubscriptionInfoResponse.hasInfo()) {
                return (!hasInfo() || getInfo().equals(lTESubscriptionInfoResponse.getInfo())) && getUnknownFields().equals(lTESubscriptionInfoResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoResponseOrBuilder
        public LTESubscriptionInfo getInfo() {
            LTESubscriptionInfo lTESubscriptionInfo = this.info_;
            return lTESubscriptionInfo == null ? LTESubscriptionInfo.getDefaultInstance() : lTESubscriptionInfo;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoResponseOrBuilder
        public LTESubscriptionInfoOrBuilder getInfoOrBuilder() {
            LTESubscriptionInfo lTESubscriptionInfo = this.info_;
            return lTESubscriptionInfo == null ? LTESubscriptionInfo.getDefaultInstance() : lTESubscriptionInfo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LTESubscriptionInfoResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getInfo());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoResponseOrBuilder
        public boolean hasInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoResponseOrBuilder
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
            if (hasInfo()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getInfo().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_LTESubscriptionInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(LTESubscriptionInfoResponse.class, Builder.class);
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
            return new LTESubscriptionInfoResponse();
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
                codedOutputStream.writeMessage(2, getInfo());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LTESubscriptionInfoResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<LTESubscriptionInfo, LTESubscriptionInfo.Builder, LTESubscriptionInfoOrBuilder> infoBuilder_;
            private LTESubscriptionInfo info_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(LTESubscriptionInfoResponse lTESubscriptionInfoResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    lTESubscriptionInfoResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<LTESubscriptionInfo, LTESubscriptionInfo.Builder, LTESubscriptionInfoOrBuilder> singleFieldBuilderV3 = this.infoBuilder_;
                    lTESubscriptionInfoResponse.info_ = singleFieldBuilderV3 == null ? this.info_ : (LTESubscriptionInfo) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                lTESubscriptionInfoResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTESubscriptionInfoResponse_descriptor;
            }

            private SingleFieldBuilderV3<LTESubscriptionInfo, LTESubscriptionInfo.Builder, LTESubscriptionInfoOrBuilder> getInfoFieldBuilder() {
                if (this.infoBuilder_ == null) {
                    this.infoBuilder_ = new SingleFieldBuilderV3<>(getInfo(), getParentForChildren(), isClean());
                    this.info_ = null;
                }
                return this.infoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getInfoFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTESubscriptionInfoResponse build() {
                LTESubscriptionInfoResponse lTESubscriptionInfoResponseBuildPartial = buildPartial();
                if (lTESubscriptionInfoResponseBuildPartial.isInitialized()) {
                    return lTESubscriptionInfoResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) lTESubscriptionInfoResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LTESubscriptionInfoResponse buildPartial() {
                LTESubscriptionInfoResponse lTESubscriptionInfoResponse = new LTESubscriptionInfoResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(lTESubscriptionInfoResponse);
                }
                onBuilt();
                return lTESubscriptionInfoResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.info_ = null;
                SingleFieldBuilderV3<LTESubscriptionInfo, LTESubscriptionInfo.Builder, LTESubscriptionInfoOrBuilder> singleFieldBuilderV3 = this.infoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.infoBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearInfo() {
                this.bitField0_ &= -3;
                this.info_ = null;
                SingleFieldBuilderV3<LTESubscriptionInfo, LTESubscriptionInfo.Builder, LTESubscriptionInfoOrBuilder> singleFieldBuilderV3 = this.infoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.infoBuilder_ = null;
                }
                onChanged();
                return this;
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
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTESubscriptionInfoResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoResponseOrBuilder
            public LTESubscriptionInfo getInfo() {
                SingleFieldBuilderV3<LTESubscriptionInfo, LTESubscriptionInfo.Builder, LTESubscriptionInfoOrBuilder> singleFieldBuilderV3 = this.infoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTESubscriptionInfo) singleFieldBuilderV3.getMessage();
                }
                LTESubscriptionInfo lTESubscriptionInfo = this.info_;
                return lTESubscriptionInfo == null ? LTESubscriptionInfo.getDefaultInstance() : lTESubscriptionInfo;
            }

            public LTESubscriptionInfo.Builder getInfoBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (LTESubscriptionInfo.Builder) getInfoFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoResponseOrBuilder
            public LTESubscriptionInfoOrBuilder getInfoOrBuilder() {
                SingleFieldBuilderV3<LTESubscriptionInfo, LTESubscriptionInfo.Builder, LTESubscriptionInfoOrBuilder> singleFieldBuilderV3 = this.infoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LTESubscriptionInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LTESubscriptionInfo lTESubscriptionInfo = this.info_;
                return lTESubscriptionInfo == null ? LTESubscriptionInfo.getDefaultInstance() : lTESubscriptionInfo;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoResponseOrBuilder
            public boolean hasInfo() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_LTESubscriptionInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(LTESubscriptionInfoResponse.class, Builder.class);
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
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getInfoFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeInfo(LTESubscriptionInfo lTESubscriptionInfo) {
                LTESubscriptionInfo lTESubscriptionInfo2;
                SingleFieldBuilderV3<LTESubscriptionInfo, LTESubscriptionInfo.Builder, LTESubscriptionInfoOrBuilder> singleFieldBuilderV3 = this.infoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(lTESubscriptionInfo);
                } else if ((this.bitField0_ & 2) == 0 || (lTESubscriptionInfo2 = this.info_) == null || lTESubscriptionInfo2 == LTESubscriptionInfo.getDefaultInstance()) {
                    this.info_ = lTESubscriptionInfo;
                } else {
                    getInfoBuilder().mergeFrom(lTESubscriptionInfo);
                }
                if (this.info_ != null) {
                    this.bitField0_ |= 2;
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

            public Builder setInfo(LTESubscriptionInfo.Builder builder) {
                SingleFieldBuilderV3<LTESubscriptionInfo, LTESubscriptionInfo.Builder, LTESubscriptionInfoOrBuilder> singleFieldBuilderV3 = this.infoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.info_ = builder.build();
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

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LTESubscriptionInfoResponse getDefaultInstanceForType() {
                return LTESubscriptionInfoResponse.getDefaultInstance();
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
                maybeForceBuilderInitialization();
            }

            public Builder setInfo(LTESubscriptionInfo lTESubscriptionInfo) {
                SingleFieldBuilderV3<LTESubscriptionInfo, LTESubscriptionInfo.Builder, LTESubscriptionInfoOrBuilder> singleFieldBuilderV3 = this.infoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    lTESubscriptionInfo.getClass();
                    this.info_ = lTESubscriptionInfo;
                } else {
                    singleFieldBuilderV3.setMessage(lTESubscriptionInfo);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LTESubscriptionInfoResponse) {
                    return mergeFrom((LTESubscriptionInfoResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LTESubscriptionInfoResponse lTESubscriptionInfoResponse) {
                if (lTESubscriptionInfoResponse == LTESubscriptionInfoResponse.getDefaultInstance()) {
                    return this;
                }
                if (lTESubscriptionInfoResponse.hasStatus()) {
                    setStatus(lTESubscriptionInfoResponse.getStatus());
                }
                if (lTESubscriptionInfoResponse.hasInfo()) {
                    mergeInfo(lTESubscriptionInfoResponse.getInfo());
                }
                mergeUnknownFields(lTESubscriptionInfoResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LTESubscriptionInfoResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LTESubscriptionInfoResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTESubscriptionInfoResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTESubscriptionInfoResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ LTESubscriptionInfoResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LTESubscriptionInfoResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private LTESubscriptionInfoResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LTESubscriptionInfoResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LTESubscriptionInfoResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LTESubscriptionInfoResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LTESubscriptionInfoResponse parseFrom(InputStream inputStream) {
            return (LTESubscriptionInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LTESubscriptionInfoResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTESubscriptionInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LTESubscriptionInfoResponse parseFrom(CodedInputStream codedInputStream) {
            return (LTESubscriptionInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LTESubscriptionInfoResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LTESubscriptionInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            OK(1),
            TIMEOUT(2),
            DEVICE_NOT_SUPPORTED(3);

            public static final int DEVICE_NOT_SUPPORTED_VALUE = 3;
            public static final int OK_VALUE = 1;
            public static final int TIMEOUT_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDILTEProto.LTESubscriptionInfoResponse.ResponseStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ResponseStatus findValueByNumber(int i14) {
                    return ResponseStatus.forNumber(i14);
                }
            };
            private static final ResponseStatus[] VALUES = values();

            ResponseStatus(int i14) {
                this.value = i14;
            }

            public static ResponseStatus forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return OK;
                }
                if (i14 == 2) {
                    return TIMEOUT;
                }
                if (i14 != 3) {
                    return null;
                }
                return DEVICE_NOT_SUPPORTED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return LTESubscriptionInfoResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ResponseStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ResponseStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ResponseStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class MobileCountry extends GeneratedMessageV3 implements MobileCountryOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int code_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private static final MobileCountry DEFAULT_INSTANCE = new MobileCountry();

        @Deprecated
        public static final Parser<MobileCountry> PARSER = new AbstractParser<MobileCountry>() { // from class: com.garmin.proto.generated.GDILTEProto.MobileCountry.1
            @Override // com.google.protobuf.Parser
            public MobileCountry parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = MobileCountry.newBuilder();
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

        private MobileCountry() {
            this.code_ = 0;
            this.name_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
        }

        public static MobileCountry getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_MobileCountry_descriptor;
        }

        public static Builder newBuilder(MobileCountry mobileCountry) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(mobileCountry);
        }

        public static MobileCountry parseDelimitedFrom(InputStream inputStream) {
            return (MobileCountry) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MobileCountry parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MobileCountry> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MobileCountry)) {
                return super.equals(obj);
            }
            MobileCountry mobileCountry = (MobileCountry) obj;
            if (hasCode() != mobileCountry.hasCode()) {
                return false;
            }
            if ((!hasCode() || getCode() == mobileCountry.getCode()) && hasName() == mobileCountry.hasName()) {
                return (!hasName() || getName().equals(mobileCountry.getName())) && getUnknownFields().equals(mobileCountry.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.MobileCountryOrBuilder
        public int getCode() {
            return this.code_;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.MobileCountryOrBuilder
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

        @Override // com.garmin.proto.generated.GDILTEProto.MobileCountryOrBuilder
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
        public Parser<MobileCountry> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeInt32Size(1, this.code_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeInt32Size += GeneratedMessageV3.computeStringSize(2, this.name_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.MobileCountryOrBuilder
        public boolean hasCode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILTEProto.MobileCountryOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCode()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCode();
            }
            if (hasName()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getName().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILTEProto.internal_static_GDI_Proto_LTE_MobileCountry_fieldAccessorTable.ensureFieldAccessorsInitialized(MobileCountry.class, Builder.class);
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
            return new MobileCountry();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeInt32(1, this.code_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.name_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MobileCountryOrBuilder {
            private int bitField0_;
            private int code_;
            private Object name_;

            private Builder() {
                this.name_ = "";
            }

            private void buildPartial0(MobileCountry mobileCountry) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    mobileCountry.code_ = this.code_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    mobileCountry.name_ = this.name_;
                    i14 |= 2;
                }
                mobileCountry.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_MobileCountry_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MobileCountry build() {
                MobileCountry mobileCountryBuildPartial = buildPartial();
                if (mobileCountryBuildPartial.isInitialized()) {
                    return mobileCountryBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) mobileCountryBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MobileCountry buildPartial() {
                MobileCountry mobileCountry = new MobileCountry(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(mobileCountry);
                }
                onBuilt();
                return mobileCountry;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.code_ = 0;
                this.name_ = "";
                return this;
            }

            public Builder clearCode() {
                this.bitField0_ &= -2;
                this.code_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearName() {
                this.name_ = MobileCountry.getDefaultInstance().getName();
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

            @Override // com.garmin.proto.generated.GDILTEProto.MobileCountryOrBuilder
            public int getCode() {
                return this.code_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_MobileCountry_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.MobileCountryOrBuilder
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

            @Override // com.garmin.proto.generated.GDILTEProto.MobileCountryOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.MobileCountryOrBuilder
            public boolean hasCode() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILTEProto.MobileCountryOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILTEProto.internal_static_GDI_Proto_LTE_MobileCountry_fieldAccessorTable.ensureFieldAccessorsInitialized(MobileCountry.class, Builder.class);
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
                                    this.code_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.name_ = codedInputStream.readBytes();
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

            public Builder setCode(int i14) {
                this.code_ = i14;
                this.bitField0_ |= 1;
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
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                this.name_ = byteString;
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
            public MobileCountry getDefaultInstanceForType() {
                return MobileCountry.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MobileCountry) {
                    return mergeFrom((MobileCountry) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MobileCountry mobileCountry) {
                if (mobileCountry == MobileCountry.getDefaultInstance()) {
                    return this;
                }
                if (mobileCountry.hasCode()) {
                    setCode(mobileCountry.getCode());
                }
                if (mobileCountry.hasName()) {
                    this.name_ = mobileCountry.name_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(mobileCountry.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MobileCountry getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static MobileCountry parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MobileCountry) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MobileCountry parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static MobileCountry parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MobileCountry parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static MobileCountry parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static MobileCountry parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MobileCountry parseFrom(InputStream inputStream) {
            return (MobileCountry) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private MobileCountry(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.code_ = 0;
            this.name_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MobileCountry parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MobileCountry) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MobileCountry parseFrom(CodedInputStream codedInputStream) {
            return (MobileCountry) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ MobileCountry(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static MobileCountry parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MobileCountry) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public enum LTEModemStatus implements ProtocolMessageEnum {
        UNKNOWN(0),
        ON(1),
        OFF(2);

        public static final int OFF_VALUE = 2;
        public static final int ON_VALUE = 1;
        public static final int UNKNOWN_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<LTEModemStatus> internalValueMap = new Internal.EnumLiteMap<LTEModemStatus>() { // from class: com.garmin.proto.generated.GDILTEProto.LTEModemStatus.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public LTEModemStatus findValueByNumber(int i14) {
                return LTEModemStatus.forNumber(i14);
            }
        };
        private static final LTEModemStatus[] VALUES = values();

        LTEModemStatus(int i14) {
            this.value = i14;
        }

        public static LTEModemStatus forNumber(int i14) {
            if (i14 == 0) {
                return UNKNOWN;
            }
            if (i14 == 1) {
                return ON;
            }
            if (i14 != 2) {
                return null;
            }
            return OFF;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDILTEProto.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<LTEModemStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static LTEModemStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static LTEModemStatus valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum LTEServiceProvider implements ProtocolMessageEnum {
        VERIZON(1),
        OTHER(2);

        public static final int OTHER_VALUE = 2;
        public static final int VERIZON_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<LTEServiceProvider> internalValueMap = new Internal.EnumLiteMap<LTEServiceProvider>() { // from class: com.garmin.proto.generated.GDILTEProto.LTEServiceProvider.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public LTEServiceProvider findValueByNumber(int i14) {
                return LTEServiceProvider.forNumber(i14);
            }
        };
        private static final LTEServiceProvider[] VALUES = values();

        LTEServiceProvider(int i14) {
            this.value = i14;
        }

        public static LTEServiceProvider forNumber(int i14) {
            if (i14 == 1) {
                return VERIZON;
            }
            if (i14 != 2) {
                return null;
            }
            return OTHER;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDILTEProto.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<LTEServiceProvider> internalGetValueMap() {
            return internalValueMap;
        }

        public static LTEServiceProvider valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static LTEServiceProvider valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
