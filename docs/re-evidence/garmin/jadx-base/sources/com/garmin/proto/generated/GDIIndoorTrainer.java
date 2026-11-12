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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes5.dex */
public final class GDIIndoorTrainer {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0016GDIIndoorTrainer.proto\u0012\u0017GDI.Proto.IndoorTrainer\u001a\rGDICore.proto\"ì\t\n\u0007Service\u0012L\n\u0016power_zone_ftp_request\u0018\u0001 \u0001(\u000b2,.GDI.Proto.IndoorTrainer.PowerZoneFtpRequest\u0012N\n\u0017power_zone_ftp_response\u0018\u0002 \u0001(\u000b2-.GDI.Proto.IndoorTrainer.PowerZoneFtpResponse\u0012g\n$power_zone_manual_thresholds_request\u0018\u0003 \u0001(\u000b29.GDI.Proto.IndoorTrainer.PowerZoneManualThresholdsRequest\u0012i\n%power_zone_manual_thresholds_response\u0018\u0004 \u0001(\u000b2:.GDI.Proto.IndoorTrainer.PowerZoneManualThresholdsResponse\u0012N\n\u0017power_zone_mode_request\u0018\u0005 \u0001(\u000b2-.GDI.Proto.IndoorTrainer.PowerZoneModeRequest\u0012P\n\u0018power_zone_mode_response\u0018\u0006 \u0001(\u000b2..GDI.Proto.IndoorTrainer.PowerZoneModeResponse\u0012^\n\u001ftrainer_power_mode_notification\u0018\u0007 \u0001(\u000b25.GDI.Proto.IndoorTrainer.TrainerPowerModeNotification\u0012T\n\u001atrainer_power_mode_request\u0018\b \u0001(\u000b20.GDI.Proto.IndoorTrainer.TrainerPowerModeRequest\u0012V\n\u001btrainer_power_mode_response\u0018\t \u0001(\u000b21.GDI.Proto.IndoorTrainer.TrainerPowerModeResponse\u0012Q\n\u0018pedal_power_notification\u0018\n \u0001(\u000b2/.GDI.Proto.IndoorTrainer.PedalPowerNotification\u0012\\\n\u001eedge_mount_status_notification\u0018\u000b \u0001(\u000b24.GDI.Proto.IndoorTrainer.EdgeMountStatusNotification\u0012R\n\u0019edge_mount_status_request\u0018\f \u0001(\u000b2/.GDI.Proto.IndoorTrainer.EdgeMountStatusRequest\u0012T\n\u001aedge_mount_status_response\u0018\r \u0001(\u000b20.GDI.Proto.IndoorTrainer.EdgeMountStatusResponse\u0012d\n\"trainer_virtual_speed_notification\u0018\u000e \u0001(\u000b28.GDI.Proto.IndoorTrainer.TrainerVirtualSpeedNotification\"Ý\u0001\n\u001aFeatureCapabilitiesMessage\u0012\u0017\n\u000fservice_version\u0018\u0001 \u0001(\r\u0012\u001f\n\u0017supports_ftp_thresholds\u0018\u0002 \u0001(\b\u0012\u001b\n\u0013supports_power_mode\u0018\u0003 \u0001(\b\u0012$\n\u001csupports_pedal_power_balance\u0018\u0004 \u0001(\b\u0012\"\n\u001asupports_edge_mount_status\u0018\u0005 \u0001(\b\u0012\u001e\n\u0016supports_virtual_speed\u0018\u0006 \u0001(\b\"Ë\u0001\n\u0013CapabilitiesRequest\u0012@\n\u0003msg\u0018\u0001 \u0001(\u000b23.GDI.Proto.IndoorTrainer.FeatureCapabilitiesMessage2r\n\u0010features_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018+ \u0001(\u000b2,.GDI.Proto.IndoorTrainer.CapabilitiesRequest\"Ï\u0001\n\u0014CapabilitiesResponse\u0012@\n\u0003msg\u0018\u0001 \u0001(\u000b23.GDI.Proto.IndoorTrainer.FeatureCapabilitiesMessage2u\n\u0011features_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018+ \u0001(\u000b2-.GDI.Proto.IndoorTrainer.CapabilitiesResponse\"(\n\u0013PowerZoneFtpMessage\u0012\u0011\n\tftp_value\u0018\u0001 \u0001(\r\"P\n\u0013PowerZoneFtpRequest\u00129\n\u0003msg\u0018\u0001 \u0001(\u000b2,.GDI.Proto.IndoorTrainer.PowerZoneFtpMessage\"Q\n\u0014PowerZoneFtpResponse\u00129\n\u0003msg\u0018\u0001 \u0001(\u000b2,.GDI.Proto.IndoorTrainer.PowerZoneFtpMessage\"B\n PowerZoneManualThresholdsMessage\u0012\u001e\n\u0016zone_upper_milli_watts\u0018\u0001 \u0003(\r\"j\n PowerZoneManualThresholdsRequest\u0012F\n\u0003msg\u0018\u0001 \u0001(\u000b29.GDI.Proto.IndoorTrainer.PowerZoneManualThresholdsMessage\"k\n!PowerZoneManualThresholdsResponse\u0012F\n\u0003msg\u0018\u0001 \u0001(\u000b29.GDI.Proto.IndoorTrainer.PowerZoneManualThresholdsMessage\"\u008d\u0001\n\u0014PowerZoneModeMessage\u0012@\n\u0004mode\u0018\u0001 \u0001(\u000e22.GDI.Proto.IndoorTrainer.PowerZoneModeMessage.Mode\"3\n\u0004Mode\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0007\n\u0003FTP\u0010\u0001\u0012\u0015\n\u0011MANUAL_THRESHOLDS\u0010\u0002\"R\n\u0014PowerZoneModeRequest\u0012:\n\u0003msg\u0018\u0001 \u0001(\u000b2-.GDI.Proto.IndoorTrainer.PowerZoneModeMessage\"S\n\u0015PowerZoneModeResponse\u0012:\n\u0003msg\u0018\u0001 \u0001(\u000b2-.GDI.Proto.IndoorTrainer.PowerZoneModeMessage\"¤\u0001\n\u0017TrainerPowerModeMessage\u0012C\n\u0004mode\u0018\u0001 \u0001(\u000e25.GDI.Proto.IndoorTrainer.TrainerPowerModeMessage.Mode\u0012\u0018\n\u0010time_to_sleep_ms\u0018\u0002 \u0001(\r\"*\n\u0004Mode\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\n\n\u0006ACTIVE\u0010\u0001\u0012\t\n\u0005SLEEP\u0010\u0002\"]\n\u001cTrainerPowerModeNotification\u0012=\n\u0003msg\u0018\u0001 \u0001(\u000b20.GDI.Proto.IndoorTrainer.TrainerPowerModeMessage\"\u0019\n\u0017TrainerPowerModeRequest\"Y\n\u0018TrainerPowerModeResponse\u0012=\n\u0003msg\u0018\u0001 \u0001(\u000b20.GDI.Proto.IndoorTrainer.TrainerPowerModeMessage\"©\u0001\n\u0016PedalPowerNotification\u0012S\n\treference\u0018\u0001 \u0001(\u000e2@.GDI.Proto.IndoorTrainer.PedalPowerNotification.BalanceReference\u0012\u000f\n\u0007balance\u0018\u0002 \u0001(\u0002\")\n\u0010BalanceReference\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\b\n\u0004LEFT\u0010\u0001\"í\u0001\n\u0016EdgeMountStatusMessage\u0012\u000f\n\u0007mounted\u0018\u0001 \u0001(\b\u0012\u0010\n\bcharging\u0018\u0002 \u0001(\b\u0012\u001f\n\u0017charging_fault_detected\u0018\u0003 \u0001(\b\u0012S\n\rcharging_mode\u0018\u0004 \u0001(\u000e2<.GDI.Proto.IndoorTrainer.EdgeMountStatusMessage.ChargingMode\":\n\fChargingMode\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\b\n\u0004AUTO\u0010\u0001\u0012\u0013\n\u000fMANUAL_OVERRIDE\u0010\u0002\"[\n\u001bEdgeMountStatusNotification\u0012<\n\u0003msg\u0018\u0001 \u0001(\u000b2/.GDI.Proto.IndoorTrainer.EdgeMountStatusMessage\"\u0018\n\u0016EdgeMountStatusRequest\"W\n\u0017EdgeMountStatusResponse\u0012<\n\u0003msg\u0018\u0001 \u0001(\u000b2/.GDI.Proto.IndoorTrainer.EdgeMountStatusMessage\"O\n\u001fTrainerVirtualSpeedNotification\u0012\u0011\n\tavailable\u0018\u0001 \u0001(\b\u0012\u0019\n\u0011virtual_speed_kmh\u0018\u0002 \u0001(\u0002B0\n\u001acom.garmin.proto.generatedB\u0010GDIIndoorTrainerH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusMessage_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusMessage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_FeatureCapabilitiesMessage_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_FeatureCapabilitiesMessage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_PedalPowerNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_PedalPowerNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpMessage_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpMessage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsMessage_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsMessage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeMessage_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeMessage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeMessage_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeMessage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IndoorTrainer_TrainerVirtualSpeedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IndoorTrainer_TrainerVirtualSpeedNotification_fieldAccessorTable;

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
        FeatureCapabilitiesMessage getMsg();

        FeatureCapabilitiesMessageOrBuilder getMsgOrBuilder();

        boolean hasMsg();
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        FeatureCapabilitiesMessage getMsg();

        FeatureCapabilitiesMessageOrBuilder getMsgOrBuilder();

        boolean hasMsg();
    }

    public interface EdgeMountStatusMessageOrBuilder extends MessageOrBuilder {
        boolean getCharging();

        boolean getChargingFaultDetected();

        EdgeMountStatusMessage.ChargingMode getChargingMode();

        boolean getMounted();

        boolean hasCharging();

        boolean hasChargingFaultDetected();

        boolean hasChargingMode();

        boolean hasMounted();
    }

    public interface EdgeMountStatusNotificationOrBuilder extends MessageOrBuilder {
        EdgeMountStatusMessage getMsg();

        EdgeMountStatusMessageOrBuilder getMsgOrBuilder();

        boolean hasMsg();
    }

    public interface EdgeMountStatusRequestOrBuilder extends MessageOrBuilder {
    }

    public interface EdgeMountStatusResponseOrBuilder extends MessageOrBuilder {
        EdgeMountStatusMessage getMsg();

        EdgeMountStatusMessageOrBuilder getMsgOrBuilder();

        boolean hasMsg();
    }

    public interface FeatureCapabilitiesMessageOrBuilder extends MessageOrBuilder {
        int getServiceVersion();

        boolean getSupportsEdgeMountStatus();

        boolean getSupportsFtpThresholds();

        boolean getSupportsPedalPowerBalance();

        boolean getSupportsPowerMode();

        boolean getSupportsVirtualSpeed();

        boolean hasServiceVersion();

        boolean hasSupportsEdgeMountStatus();

        boolean hasSupportsFtpThresholds();

        boolean hasSupportsPedalPowerBalance();

        boolean hasSupportsPowerMode();

        boolean hasSupportsVirtualSpeed();
    }

    public interface PedalPowerNotificationOrBuilder extends MessageOrBuilder {
        float getBalance();

        PedalPowerNotification.BalanceReference getReference();

        boolean hasBalance();

        boolean hasReference();
    }

    public interface PowerZoneFtpMessageOrBuilder extends MessageOrBuilder {
        int getFtpValue();

        boolean hasFtpValue();
    }

    public interface PowerZoneFtpRequestOrBuilder extends MessageOrBuilder {
        PowerZoneFtpMessage getMsg();

        PowerZoneFtpMessageOrBuilder getMsgOrBuilder();

        boolean hasMsg();
    }

    public interface PowerZoneFtpResponseOrBuilder extends MessageOrBuilder {
        PowerZoneFtpMessage getMsg();

        PowerZoneFtpMessageOrBuilder getMsgOrBuilder();

        boolean hasMsg();
    }

    public interface PowerZoneManualThresholdsMessageOrBuilder extends MessageOrBuilder {
        int getZoneUpperMilliWatts(int i14);

        int getZoneUpperMilliWattsCount();

        List<Integer> getZoneUpperMilliWattsList();
    }

    public interface PowerZoneManualThresholdsRequestOrBuilder extends MessageOrBuilder {
        PowerZoneManualThresholdsMessage getMsg();

        PowerZoneManualThresholdsMessageOrBuilder getMsgOrBuilder();

        boolean hasMsg();
    }

    public interface PowerZoneManualThresholdsResponseOrBuilder extends MessageOrBuilder {
        PowerZoneManualThresholdsMessage getMsg();

        PowerZoneManualThresholdsMessageOrBuilder getMsgOrBuilder();

        boolean hasMsg();
    }

    public interface PowerZoneModeMessageOrBuilder extends MessageOrBuilder {
        PowerZoneModeMessage.Mode getMode();

        boolean hasMode();
    }

    public interface PowerZoneModeRequestOrBuilder extends MessageOrBuilder {
        PowerZoneModeMessage getMsg();

        PowerZoneModeMessageOrBuilder getMsgOrBuilder();

        boolean hasMsg();
    }

    public interface PowerZoneModeResponseOrBuilder extends MessageOrBuilder {
        PowerZoneModeMessage getMsg();

        PowerZoneModeMessageOrBuilder getMsgOrBuilder();

        boolean hasMsg();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        EdgeMountStatusNotification getEdgeMountStatusNotification();

        EdgeMountStatusNotificationOrBuilder getEdgeMountStatusNotificationOrBuilder();

        EdgeMountStatusRequest getEdgeMountStatusRequest();

        EdgeMountStatusRequestOrBuilder getEdgeMountStatusRequestOrBuilder();

        EdgeMountStatusResponse getEdgeMountStatusResponse();

        EdgeMountStatusResponseOrBuilder getEdgeMountStatusResponseOrBuilder();

        PedalPowerNotification getPedalPowerNotification();

        PedalPowerNotificationOrBuilder getPedalPowerNotificationOrBuilder();

        PowerZoneFtpRequest getPowerZoneFtpRequest();

        PowerZoneFtpRequestOrBuilder getPowerZoneFtpRequestOrBuilder();

        PowerZoneFtpResponse getPowerZoneFtpResponse();

        PowerZoneFtpResponseOrBuilder getPowerZoneFtpResponseOrBuilder();

        PowerZoneManualThresholdsRequest getPowerZoneManualThresholdsRequest();

        PowerZoneManualThresholdsRequestOrBuilder getPowerZoneManualThresholdsRequestOrBuilder();

        PowerZoneManualThresholdsResponse getPowerZoneManualThresholdsResponse();

        PowerZoneManualThresholdsResponseOrBuilder getPowerZoneManualThresholdsResponseOrBuilder();

        PowerZoneModeRequest getPowerZoneModeRequest();

        PowerZoneModeRequestOrBuilder getPowerZoneModeRequestOrBuilder();

        PowerZoneModeResponse getPowerZoneModeResponse();

        PowerZoneModeResponseOrBuilder getPowerZoneModeResponseOrBuilder();

        TrainerPowerModeNotification getTrainerPowerModeNotification();

        TrainerPowerModeNotificationOrBuilder getTrainerPowerModeNotificationOrBuilder();

        TrainerPowerModeRequest getTrainerPowerModeRequest();

        TrainerPowerModeRequestOrBuilder getTrainerPowerModeRequestOrBuilder();

        TrainerPowerModeResponse getTrainerPowerModeResponse();

        TrainerPowerModeResponseOrBuilder getTrainerPowerModeResponseOrBuilder();

        TrainerVirtualSpeedNotification getTrainerVirtualSpeedNotification();

        TrainerVirtualSpeedNotificationOrBuilder getTrainerVirtualSpeedNotificationOrBuilder();

        boolean hasEdgeMountStatusNotification();

        boolean hasEdgeMountStatusRequest();

        boolean hasEdgeMountStatusResponse();

        boolean hasPedalPowerNotification();

        boolean hasPowerZoneFtpRequest();

        boolean hasPowerZoneFtpResponse();

        boolean hasPowerZoneManualThresholdsRequest();

        boolean hasPowerZoneManualThresholdsResponse();

        boolean hasPowerZoneModeRequest();

        boolean hasPowerZoneModeResponse();

        boolean hasTrainerPowerModeNotification();

        boolean hasTrainerPowerModeRequest();

        boolean hasTrainerPowerModeResponse();

        boolean hasTrainerVirtualSpeedNotification();
    }

    public interface TrainerPowerModeMessageOrBuilder extends MessageOrBuilder {
        TrainerPowerModeMessage.Mode getMode();

        int getTimeToSleepMs();

        boolean hasMode();

        boolean hasTimeToSleepMs();
    }

    public interface TrainerPowerModeNotificationOrBuilder extends MessageOrBuilder {
        TrainerPowerModeMessage getMsg();

        TrainerPowerModeMessageOrBuilder getMsgOrBuilder();

        boolean hasMsg();
    }

    public interface TrainerPowerModeRequestOrBuilder extends MessageOrBuilder {
    }

    public interface TrainerPowerModeResponseOrBuilder extends MessageOrBuilder {
        TrainerPowerModeMessage getMsg();

        TrainerPowerModeMessageOrBuilder getMsgOrBuilder();

        boolean hasMsg();
    }

    public interface TrainerVirtualSpeedNotificationOrBuilder extends MessageOrBuilder {
        boolean getAvailable();

        float getVirtualSpeedKmh();

        boolean hasAvailable();

        boolean hasVirtualSpeedKmh();
    }

    static {
        Descriptors.Descriptor descriptor2 = (Descriptors.Descriptor) a.c(0);
        internal_static_GDI_Proto_IndoorTrainer_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_IndoorTrainer_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"PowerZoneFtpRequest", "PowerZoneFtpResponse", "PowerZoneManualThresholdsRequest", "PowerZoneManualThresholdsResponse", "PowerZoneModeRequest", "PowerZoneModeResponse", "TrainerPowerModeNotification", "TrainerPowerModeRequest", "TrainerPowerModeResponse", "PedalPowerNotification", "EdgeMountStatusNotification", "EdgeMountStatusRequest", "EdgeMountStatusResponse", "TrainerVirtualSpeedNotification"});
        Descriptors.Descriptor descriptor3 = (Descriptors.Descriptor) a.c(1);
        internal_static_GDI_Proto_IndoorTrainer_FeatureCapabilitiesMessage_descriptor = descriptor3;
        internal_static_GDI_Proto_IndoorTrainer_FeatureCapabilitiesMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"ServiceVersion", "SupportsFtpThresholds", "SupportsPowerMode", "SupportsPedalPowerBalance", "SupportsEdgeMountStatus", "SupportsVirtualSpeed"});
        Descriptors.Descriptor descriptor4 = (Descriptors.Descriptor) a.c(2);
        internal_static_GDI_Proto_IndoorTrainer_CapabilitiesRequest_descriptor = descriptor4;
        internal_static_GDI_Proto_IndoorTrainer_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Msg"});
        Descriptors.Descriptor descriptor5 = (Descriptors.Descriptor) a.c(3);
        internal_static_GDI_Proto_IndoorTrainer_CapabilitiesResponse_descriptor = descriptor5;
        internal_static_GDI_Proto_IndoorTrainer_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Msg"});
        Descriptors.Descriptor descriptor6 = (Descriptors.Descriptor) a.c(4);
        internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpMessage_descriptor = descriptor6;
        internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"FtpValue"});
        Descriptors.Descriptor descriptor7 = (Descriptors.Descriptor) a.c(5);
        internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Msg"});
        Descriptors.Descriptor descriptor8 = (Descriptors.Descriptor) a.c(6);
        internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Msg"});
        Descriptors.Descriptor descriptor9 = (Descriptors.Descriptor) a.c(7);
        internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsMessage_descriptor = descriptor9;
        internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"ZoneUpperMilliWatts"});
        Descriptors.Descriptor descriptor10 = (Descriptors.Descriptor) a.c(8);
        internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsRequest_descriptor = descriptor10;
        internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Msg"});
        Descriptors.Descriptor descriptor11 = (Descriptors.Descriptor) a.c(9);
        internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsResponse_descriptor = descriptor11;
        internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Msg"});
        Descriptors.Descriptor descriptor12 = (Descriptors.Descriptor) a.c(10);
        internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeMessage_descriptor = descriptor12;
        internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Mode"});
        Descriptors.Descriptor descriptor13 = (Descriptors.Descriptor) a.c(11);
        internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeRequest_descriptor = descriptor13;
        internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Msg"});
        Descriptors.Descriptor descriptor14 = (Descriptors.Descriptor) a.c(12);
        internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeResponse_descriptor = descriptor14;
        internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Msg"});
        Descriptors.Descriptor descriptor15 = (Descriptors.Descriptor) a.c(13);
        internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeMessage_descriptor = descriptor15;
        internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Mode", "TimeToSleepMs"});
        Descriptors.Descriptor descriptor16 = (Descriptors.Descriptor) a.c(14);
        internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeNotification_descriptor = descriptor16;
        internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Msg"});
        Descriptors.Descriptor descriptor17 = (Descriptors.Descriptor) a.c(15);
        internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeRequest_descriptor = descriptor17;
        internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[0]);
        Descriptors.Descriptor descriptor18 = (Descriptors.Descriptor) a.c(16);
        internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeResponse_descriptor = descriptor18;
        internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"Msg"});
        Descriptors.Descriptor descriptor19 = (Descriptors.Descriptor) a.c(17);
        internal_static_GDI_Proto_IndoorTrainer_PedalPowerNotification_descriptor = descriptor19;
        internal_static_GDI_Proto_IndoorTrainer_PedalPowerNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"Reference", "Balance"});
        Descriptors.Descriptor descriptor20 = (Descriptors.Descriptor) a.c(18);
        internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusMessage_descriptor = descriptor20;
        internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"Mounted", "Charging", "ChargingFaultDetected", "ChargingMode"});
        Descriptors.Descriptor descriptor21 = (Descriptors.Descriptor) a.c(19);
        internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusNotification_descriptor = descriptor21;
        internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor21, new String[]{"Msg"});
        Descriptors.Descriptor descriptor22 = (Descriptors.Descriptor) a.c(20);
        internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusRequest_descriptor = descriptor22;
        internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor22, new String[0]);
        Descriptors.Descriptor descriptor23 = (Descriptors.Descriptor) a.c(21);
        internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusResponse_descriptor = descriptor23;
        internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor23, new String[]{"Msg"});
        Descriptors.Descriptor descriptor24 = (Descriptors.Descriptor) a.c(22);
        internal_static_GDI_Proto_IndoorTrainer_TrainerVirtualSpeedNotification_descriptor = descriptor24;
        internal_static_GDI_Proto_IndoorTrainer_TrainerVirtualSpeedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor24, new String[]{"Available", "VirtualSpeedKmh"});
        GDICore.getDescriptor();
    }

    private GDIIndoorTrainer() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.featuresRequest);
        extensionRegistryLite.add(CapabilitiesResponse.featuresResponse);
    }

    public static final class EdgeMountStatusRequest extends GeneratedMessageV3 implements EdgeMountStatusRequestOrBuilder {
        private static final EdgeMountStatusRequest DEFAULT_INSTANCE = new EdgeMountStatusRequest();

        @Deprecated
        public static final Parser<EdgeMountStatusRequest> PARSER = new AbstractParser<EdgeMountStatusRequest>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusRequest.1
            @Override // com.google.protobuf.Parser
            public EdgeMountStatusRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EdgeMountStatusRequest.newBuilder();
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

        private EdgeMountStatusRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EdgeMountStatusRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusRequest_descriptor;
        }

        public static Builder newBuilder(EdgeMountStatusRequest edgeMountStatusRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(edgeMountStatusRequest);
        }

        public static EdgeMountStatusRequest parseDelimitedFrom(InputStream inputStream) {
            return (EdgeMountStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EdgeMountStatusRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EdgeMountStatusRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof EdgeMountStatusRequest) {
                return getUnknownFields().equals(((EdgeMountStatusRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EdgeMountStatusRequest> getParserForType() {
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
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EdgeMountStatusRequest.class, Builder.class);
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
            return new EdgeMountStatusRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EdgeMountStatusRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EdgeMountStatusRequest build() {
                EdgeMountStatusRequest edgeMountStatusRequestBuildPartial = buildPartial();
                if (edgeMountStatusRequestBuildPartial.isInitialized()) {
                    return edgeMountStatusRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) edgeMountStatusRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EdgeMountStatusRequest buildPartial() {
                EdgeMountStatusRequest edgeMountStatusRequest = new EdgeMountStatusRequest(this);
                onBuilt();
                return edgeMountStatusRequest;
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
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EdgeMountStatusRequest.class, Builder.class);
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
            public EdgeMountStatusRequest getDefaultInstanceForType() {
                return EdgeMountStatusRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EdgeMountStatusRequest) {
                    return mergeFrom((EdgeMountStatusRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EdgeMountStatusRequest edgeMountStatusRequest) {
                if (edgeMountStatusRequest == EdgeMountStatusRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(edgeMountStatusRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EdgeMountStatusRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ EdgeMountStatusRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private EdgeMountStatusRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EdgeMountStatusRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EdgeMountStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EdgeMountStatusRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EdgeMountStatusRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EdgeMountStatusRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EdgeMountStatusRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EdgeMountStatusRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EdgeMountStatusRequest parseFrom(InputStream inputStream) {
            return (EdgeMountStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EdgeMountStatusRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EdgeMountStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EdgeMountStatusRequest parseFrom(CodedInputStream codedInputStream) {
            return (EdgeMountStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EdgeMountStatusRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EdgeMountStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class FeatureCapabilitiesMessage extends GeneratedMessageV3 implements FeatureCapabilitiesMessageOrBuilder {
        private static final FeatureCapabilitiesMessage DEFAULT_INSTANCE = new FeatureCapabilitiesMessage();

        @Deprecated
        public static final Parser<FeatureCapabilitiesMessage> PARSER = new AbstractParser<FeatureCapabilitiesMessage>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessage.1
            @Override // com.google.protobuf.Parser
            public FeatureCapabilitiesMessage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FeatureCapabilitiesMessage.newBuilder();
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
        public static final int SERVICE_VERSION_FIELD_NUMBER = 1;
        public static final int SUPPORTS_EDGE_MOUNT_STATUS_FIELD_NUMBER = 5;
        public static final int SUPPORTS_FTP_THRESHOLDS_FIELD_NUMBER = 2;
        public static final int SUPPORTS_PEDAL_POWER_BALANCE_FIELD_NUMBER = 4;
        public static final int SUPPORTS_POWER_MODE_FIELD_NUMBER = 3;
        public static final int SUPPORTS_VIRTUAL_SPEED_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int serviceVersion_;
        private boolean supportsEdgeMountStatus_;
        private boolean supportsFtpThresholds_;
        private boolean supportsPedalPowerBalance_;
        private boolean supportsPowerMode_;
        private boolean supportsVirtualSpeed_;

        private FeatureCapabilitiesMessage(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.serviceVersion_ = 0;
            this.supportsFtpThresholds_ = false;
            this.supportsPowerMode_ = false;
            this.supportsPedalPowerBalance_ = false;
            this.supportsEdgeMountStatus_ = false;
            this.supportsVirtualSpeed_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FeatureCapabilitiesMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_FeatureCapabilitiesMessage_descriptor;
        }

        public static Builder newBuilder(FeatureCapabilitiesMessage featureCapabilitiesMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(featureCapabilitiesMessage);
        }

        public static FeatureCapabilitiesMessage parseDelimitedFrom(InputStream inputStream) {
            return (FeatureCapabilitiesMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FeatureCapabilitiesMessage parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FeatureCapabilitiesMessage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FeatureCapabilitiesMessage)) {
                return super.equals(obj);
            }
            FeatureCapabilitiesMessage featureCapabilitiesMessage = (FeatureCapabilitiesMessage) obj;
            if (hasServiceVersion() != featureCapabilitiesMessage.hasServiceVersion()) {
                return false;
            }
            if ((hasServiceVersion() && getServiceVersion() != featureCapabilitiesMessage.getServiceVersion()) || hasSupportsFtpThresholds() != featureCapabilitiesMessage.hasSupportsFtpThresholds()) {
                return false;
            }
            if ((hasSupportsFtpThresholds() && getSupportsFtpThresholds() != featureCapabilitiesMessage.getSupportsFtpThresholds()) || hasSupportsPowerMode() != featureCapabilitiesMessage.hasSupportsPowerMode()) {
                return false;
            }
            if ((hasSupportsPowerMode() && getSupportsPowerMode() != featureCapabilitiesMessage.getSupportsPowerMode()) || hasSupportsPedalPowerBalance() != featureCapabilitiesMessage.hasSupportsPedalPowerBalance()) {
                return false;
            }
            if ((hasSupportsPedalPowerBalance() && getSupportsPedalPowerBalance() != featureCapabilitiesMessage.getSupportsPedalPowerBalance()) || hasSupportsEdgeMountStatus() != featureCapabilitiesMessage.hasSupportsEdgeMountStatus()) {
                return false;
            }
            if ((!hasSupportsEdgeMountStatus() || getSupportsEdgeMountStatus() == featureCapabilitiesMessage.getSupportsEdgeMountStatus()) && hasSupportsVirtualSpeed() == featureCapabilitiesMessage.hasSupportsVirtualSpeed()) {
                return (!hasSupportsVirtualSpeed() || getSupportsVirtualSpeed() == featureCapabilitiesMessage.getSupportsVirtualSpeed()) && getUnknownFields().equals(featureCapabilitiesMessage.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FeatureCapabilitiesMessage> getParserForType() {
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
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(2, this.supportsFtpThresholds_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(3, this.supportsPowerMode_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(4, this.supportsPedalPowerBalance_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(5, this.supportsEdgeMountStatus_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(6, this.supportsVirtualSpeed_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
        public int getServiceVersion() {
            return this.serviceVersion_;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
        public boolean getSupportsEdgeMountStatus() {
            return this.supportsEdgeMountStatus_;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
        public boolean getSupportsFtpThresholds() {
            return this.supportsFtpThresholds_;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
        public boolean getSupportsPedalPowerBalance() {
            return this.supportsPedalPowerBalance_;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
        public boolean getSupportsPowerMode() {
            return this.supportsPowerMode_;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
        public boolean getSupportsVirtualSpeed() {
            return this.supportsVirtualSpeed_;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
        public boolean hasServiceVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
        public boolean hasSupportsEdgeMountStatus() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
        public boolean hasSupportsFtpThresholds() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
        public boolean hasSupportsPedalPowerBalance() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
        public boolean hasSupportsPowerMode() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
        public boolean hasSupportsVirtualSpeed() {
            return (this.bitField0_ & 32) != 0;
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
            if (hasSupportsFtpThresholds()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getSupportsFtpThresholds());
            }
            if (hasSupportsPowerMode()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getSupportsPowerMode());
            }
            if (hasSupportsPedalPowerBalance()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getSupportsPedalPowerBalance());
            }
            if (hasSupportsEdgeMountStatus()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Internal.hashBoolean(getSupportsEdgeMountStatus());
            }
            if (hasSupportsVirtualSpeed()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + Internal.hashBoolean(getSupportsVirtualSpeed());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_FeatureCapabilitiesMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(FeatureCapabilitiesMessage.class, Builder.class);
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
            return new FeatureCapabilitiesMessage();
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
                codedOutputStream.writeBool(2, this.supportsFtpThresholds_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.supportsPowerMode_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.supportsPedalPowerBalance_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(5, this.supportsEdgeMountStatus_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeBool(6, this.supportsVirtualSpeed_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FeatureCapabilitiesMessageOrBuilder {
            private int bitField0_;
            private int serviceVersion_;
            private boolean supportsEdgeMountStatus_;
            private boolean supportsFtpThresholds_;
            private boolean supportsPedalPowerBalance_;
            private boolean supportsPowerMode_;
            private boolean supportsVirtualSpeed_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(FeatureCapabilitiesMessage featureCapabilitiesMessage) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    featureCapabilitiesMessage.serviceVersion_ = this.serviceVersion_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    featureCapabilitiesMessage.supportsFtpThresholds_ = this.supportsFtpThresholds_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    featureCapabilitiesMessage.supportsPowerMode_ = this.supportsPowerMode_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    featureCapabilitiesMessage.supportsPedalPowerBalance_ = this.supportsPedalPowerBalance_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    featureCapabilitiesMessage.supportsEdgeMountStatus_ = this.supportsEdgeMountStatus_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    featureCapabilitiesMessage.supportsVirtualSpeed_ = this.supportsVirtualSpeed_;
                    i14 |= 32;
                }
                featureCapabilitiesMessage.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_FeatureCapabilitiesMessage_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FeatureCapabilitiesMessage build() {
                FeatureCapabilitiesMessage featureCapabilitiesMessageBuildPartial = buildPartial();
                if (featureCapabilitiesMessageBuildPartial.isInitialized()) {
                    return featureCapabilitiesMessageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) featureCapabilitiesMessageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FeatureCapabilitiesMessage buildPartial() {
                FeatureCapabilitiesMessage featureCapabilitiesMessage = new FeatureCapabilitiesMessage(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(featureCapabilitiesMessage);
                }
                onBuilt();
                return featureCapabilitiesMessage;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.serviceVersion_ = 0;
                this.supportsFtpThresholds_ = false;
                this.supportsPowerMode_ = false;
                this.supportsPedalPowerBalance_ = false;
                this.supportsEdgeMountStatus_ = false;
                this.supportsVirtualSpeed_ = false;
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

            public Builder clearSupportsEdgeMountStatus() {
                this.bitField0_ &= -17;
                this.supportsEdgeMountStatus_ = false;
                onChanged();
                return this;
            }

            public Builder clearSupportsFtpThresholds() {
                this.bitField0_ &= -3;
                this.supportsFtpThresholds_ = false;
                onChanged();
                return this;
            }

            public Builder clearSupportsPedalPowerBalance() {
                this.bitField0_ &= -9;
                this.supportsPedalPowerBalance_ = false;
                onChanged();
                return this;
            }

            public Builder clearSupportsPowerMode() {
                this.bitField0_ &= -5;
                this.supportsPowerMode_ = false;
                onChanged();
                return this;
            }

            public Builder clearSupportsVirtualSpeed() {
                this.bitField0_ &= -33;
                this.supportsVirtualSpeed_ = false;
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
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_FeatureCapabilitiesMessage_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
            public int getServiceVersion() {
                return this.serviceVersion_;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
            public boolean getSupportsEdgeMountStatus() {
                return this.supportsEdgeMountStatus_;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
            public boolean getSupportsFtpThresholds() {
                return this.supportsFtpThresholds_;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
            public boolean getSupportsPedalPowerBalance() {
                return this.supportsPedalPowerBalance_;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
            public boolean getSupportsPowerMode() {
                return this.supportsPowerMode_;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
            public boolean getSupportsVirtualSpeed() {
                return this.supportsVirtualSpeed_;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
            public boolean hasServiceVersion() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
            public boolean hasSupportsEdgeMountStatus() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
            public boolean hasSupportsFtpThresholds() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
            public boolean hasSupportsPedalPowerBalance() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
            public boolean hasSupportsPowerMode() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.FeatureCapabilitiesMessageOrBuilder
            public boolean hasSupportsVirtualSpeed() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_FeatureCapabilitiesMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(FeatureCapabilitiesMessage.class, Builder.class);
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
                                    this.supportsFtpThresholds_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.supportsPowerMode_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.supportsPedalPowerBalance_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.supportsEdgeMountStatus_ = codedInputStream.readBool();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    this.supportsVirtualSpeed_ = codedInputStream.readBool();
                                    this.bitField0_ |= 32;
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

            public Builder setSupportsEdgeMountStatus(boolean z14) {
                this.supportsEdgeMountStatus_ = z14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSupportsFtpThresholds(boolean z14) {
                this.supportsFtpThresholds_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSupportsPedalPowerBalance(boolean z14) {
                this.supportsPedalPowerBalance_ = z14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSupportsPowerMode(boolean z14) {
                this.supportsPowerMode_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSupportsVirtualSpeed(boolean z14) {
                this.supportsVirtualSpeed_ = z14;
                this.bitField0_ |= 32;
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
            public FeatureCapabilitiesMessage getDefaultInstanceForType() {
                return FeatureCapabilitiesMessage.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FeatureCapabilitiesMessage) {
                    return mergeFrom((FeatureCapabilitiesMessage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FeatureCapabilitiesMessage featureCapabilitiesMessage) {
                if (featureCapabilitiesMessage == FeatureCapabilitiesMessage.getDefaultInstance()) {
                    return this;
                }
                if (featureCapabilitiesMessage.hasServiceVersion()) {
                    setServiceVersion(featureCapabilitiesMessage.getServiceVersion());
                }
                if (featureCapabilitiesMessage.hasSupportsFtpThresholds()) {
                    setSupportsFtpThresholds(featureCapabilitiesMessage.getSupportsFtpThresholds());
                }
                if (featureCapabilitiesMessage.hasSupportsPowerMode()) {
                    setSupportsPowerMode(featureCapabilitiesMessage.getSupportsPowerMode());
                }
                if (featureCapabilitiesMessage.hasSupportsPedalPowerBalance()) {
                    setSupportsPedalPowerBalance(featureCapabilitiesMessage.getSupportsPedalPowerBalance());
                }
                if (featureCapabilitiesMessage.hasSupportsEdgeMountStatus()) {
                    setSupportsEdgeMountStatus(featureCapabilitiesMessage.getSupportsEdgeMountStatus());
                }
                if (featureCapabilitiesMessage.hasSupportsVirtualSpeed()) {
                    setSupportsVirtualSpeed(featureCapabilitiesMessage.getSupportsVirtualSpeed());
                }
                mergeUnknownFields(featureCapabilitiesMessage.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FeatureCapabilitiesMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FeatureCapabilitiesMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureCapabilitiesMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FeatureCapabilitiesMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FeatureCapabilitiesMessage parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FeatureCapabilitiesMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FeatureCapabilitiesMessage parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static FeatureCapabilitiesMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FeatureCapabilitiesMessage parseFrom(InputStream inputStream) {
            return (FeatureCapabilitiesMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FeatureCapabilitiesMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureCapabilitiesMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FeatureCapabilitiesMessage parseFrom(CodedInputStream codedInputStream) {
            return (FeatureCapabilitiesMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ FeatureCapabilitiesMessage(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static FeatureCapabilitiesMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureCapabilitiesMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private FeatureCapabilitiesMessage() {
            this.serviceVersion_ = 0;
            this.supportsFtpThresholds_ = false;
            this.supportsPowerMode_ = false;
            this.supportsPedalPowerBalance_ = false;
            this.supportsEdgeMountStatus_ = false;
            this.supportsVirtualSpeed_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    public static final class PowerZoneFtpMessage extends GeneratedMessageV3 implements PowerZoneFtpMessageOrBuilder {
        public static final int FTP_VALUE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int ftpValue_;
        private byte memoizedIsInitialized;
        private static final PowerZoneFtpMessage DEFAULT_INSTANCE = new PowerZoneFtpMessage();

        @Deprecated
        public static final Parser<PowerZoneFtpMessage> PARSER = new AbstractParser<PowerZoneFtpMessage>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneFtpMessage.1
            @Override // com.google.protobuf.Parser
            public PowerZoneFtpMessage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PowerZoneFtpMessage.newBuilder();
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

        private PowerZoneFtpMessage(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.ftpValue_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PowerZoneFtpMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpMessage_descriptor;
        }

        public static Builder newBuilder(PowerZoneFtpMessage powerZoneFtpMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(powerZoneFtpMessage);
        }

        public static PowerZoneFtpMessage parseDelimitedFrom(InputStream inputStream) {
            return (PowerZoneFtpMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PowerZoneFtpMessage parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PowerZoneFtpMessage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PowerZoneFtpMessage)) {
                return super.equals(obj);
            }
            PowerZoneFtpMessage powerZoneFtpMessage = (PowerZoneFtpMessage) obj;
            if (hasFtpValue() != powerZoneFtpMessage.hasFtpValue()) {
                return false;
            }
            return (!hasFtpValue() || getFtpValue() == powerZoneFtpMessage.getFtpValue()) && getUnknownFields().equals(powerZoneFtpMessage.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneFtpMessageOrBuilder
        public int getFtpValue() {
            return this.ftpValue_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PowerZoneFtpMessage> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.ftpValue_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneFtpMessageOrBuilder
        public boolean hasFtpValue() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasFtpValue()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getFtpValue();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(PowerZoneFtpMessage.class, Builder.class);
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
            return new PowerZoneFtpMessage();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.ftpValue_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PowerZoneFtpMessageOrBuilder {
            private int bitField0_;
            private int ftpValue_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(PowerZoneFtpMessage powerZoneFtpMessage) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    powerZoneFtpMessage.ftpValue_ = this.ftpValue_;
                } else {
                    i14 = 0;
                }
                powerZoneFtpMessage.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpMessage_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PowerZoneFtpMessage build() {
                PowerZoneFtpMessage powerZoneFtpMessageBuildPartial = buildPartial();
                if (powerZoneFtpMessageBuildPartial.isInitialized()) {
                    return powerZoneFtpMessageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) powerZoneFtpMessageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PowerZoneFtpMessage buildPartial() {
                PowerZoneFtpMessage powerZoneFtpMessage = new PowerZoneFtpMessage(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(powerZoneFtpMessage);
                }
                onBuilt();
                return powerZoneFtpMessage;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.ftpValue_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFtpValue() {
                this.bitField0_ &= -2;
                this.ftpValue_ = 0;
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
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpMessage_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneFtpMessageOrBuilder
            public int getFtpValue() {
                return this.ftpValue_;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneFtpMessageOrBuilder
            public boolean hasFtpValue() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(PowerZoneFtpMessage.class, Builder.class);
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
                                    this.ftpValue_ = codedInputStream.readUInt32();
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

            public Builder setFtpValue(int i14) {
                this.ftpValue_ = i14;
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
            public PowerZoneFtpMessage getDefaultInstanceForType() {
                return PowerZoneFtpMessage.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PowerZoneFtpMessage) {
                    return mergeFrom((PowerZoneFtpMessage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PowerZoneFtpMessage powerZoneFtpMessage) {
                if (powerZoneFtpMessage == PowerZoneFtpMessage.getDefaultInstance()) {
                    return this;
                }
                if (powerZoneFtpMessage.hasFtpValue()) {
                    setFtpValue(powerZoneFtpMessage.getFtpValue());
                }
                mergeUnknownFields(powerZoneFtpMessage.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PowerZoneFtpMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static PowerZoneFtpMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneFtpMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PowerZoneFtpMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ PowerZoneFtpMessage(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static PowerZoneFtpMessage parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private PowerZoneFtpMessage() {
            this.ftpValue_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PowerZoneFtpMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PowerZoneFtpMessage parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PowerZoneFtpMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PowerZoneFtpMessage parseFrom(InputStream inputStream) {
            return (PowerZoneFtpMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PowerZoneFtpMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneFtpMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PowerZoneFtpMessage parseFrom(CodedInputStream codedInputStream) {
            return (PowerZoneFtpMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PowerZoneFtpMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneFtpMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TrainerPowerModeRequest extends GeneratedMessageV3 implements TrainerPowerModeRequestOrBuilder {
        private static final TrainerPowerModeRequest DEFAULT_INSTANCE = new TrainerPowerModeRequest();

        @Deprecated
        public static final Parser<TrainerPowerModeRequest> PARSER = new AbstractParser<TrainerPowerModeRequest>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeRequest.1
            @Override // com.google.protobuf.Parser
            public TrainerPowerModeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TrainerPowerModeRequest.newBuilder();
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

        private TrainerPowerModeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrainerPowerModeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeRequest_descriptor;
        }

        public static Builder newBuilder(TrainerPowerModeRequest trainerPowerModeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(trainerPowerModeRequest);
        }

        public static TrainerPowerModeRequest parseDelimitedFrom(InputStream inputStream) {
            return (TrainerPowerModeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TrainerPowerModeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TrainerPowerModeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof TrainerPowerModeRequest) {
                return getUnknownFields().equals(((TrainerPowerModeRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TrainerPowerModeRequest> getParserForType() {
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
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TrainerPowerModeRequest.class, Builder.class);
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
            return new TrainerPowerModeRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TrainerPowerModeRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrainerPowerModeRequest build() {
                TrainerPowerModeRequest trainerPowerModeRequestBuildPartial = buildPartial();
                if (trainerPowerModeRequestBuildPartial.isInitialized()) {
                    return trainerPowerModeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) trainerPowerModeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrainerPowerModeRequest buildPartial() {
                TrainerPowerModeRequest trainerPowerModeRequest = new TrainerPowerModeRequest(this);
                onBuilt();
                return trainerPowerModeRequest;
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
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TrainerPowerModeRequest.class, Builder.class);
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
            public TrainerPowerModeRequest getDefaultInstanceForType() {
                return TrainerPowerModeRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TrainerPowerModeRequest) {
                    return mergeFrom((TrainerPowerModeRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TrainerPowerModeRequest trainerPowerModeRequest) {
                if (trainerPowerModeRequest == TrainerPowerModeRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(trainerPowerModeRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TrainerPowerModeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ TrainerPowerModeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private TrainerPowerModeRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrainerPowerModeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrainerPowerModeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrainerPowerModeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TrainerPowerModeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TrainerPowerModeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TrainerPowerModeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TrainerPowerModeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TrainerPowerModeRequest parseFrom(InputStream inputStream) {
            return (TrainerPowerModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TrainerPowerModeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrainerPowerModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrainerPowerModeRequest parseFrom(CodedInputStream codedInputStream) {
            return (TrainerPowerModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TrainerPowerModeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrainerPowerModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TrainerVirtualSpeedNotification extends GeneratedMessageV3 implements TrainerVirtualSpeedNotificationOrBuilder {
        public static final int AVAILABLE_FIELD_NUMBER = 1;
        private static final TrainerVirtualSpeedNotification DEFAULT_INSTANCE = new TrainerVirtualSpeedNotification();

        @Deprecated
        public static final Parser<TrainerVirtualSpeedNotification> PARSER = new AbstractParser<TrainerVirtualSpeedNotification>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.TrainerVirtualSpeedNotification.1
            @Override // com.google.protobuf.Parser
            public TrainerVirtualSpeedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TrainerVirtualSpeedNotification.newBuilder();
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
        public static final int VIRTUAL_SPEED_KMH_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private boolean available_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private float virtualSpeedKmh_;

        private TrainerVirtualSpeedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.available_ = false;
            this.virtualSpeedKmh_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrainerVirtualSpeedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerVirtualSpeedNotification_descriptor;
        }

        public static Builder newBuilder(TrainerVirtualSpeedNotification trainerVirtualSpeedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(trainerVirtualSpeedNotification);
        }

        public static TrainerVirtualSpeedNotification parseDelimitedFrom(InputStream inputStream) {
            return (TrainerVirtualSpeedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TrainerVirtualSpeedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TrainerVirtualSpeedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrainerVirtualSpeedNotification)) {
                return super.equals(obj);
            }
            TrainerVirtualSpeedNotification trainerVirtualSpeedNotification = (TrainerVirtualSpeedNotification) obj;
            if (hasAvailable() != trainerVirtualSpeedNotification.hasAvailable()) {
                return false;
            }
            if ((!hasAvailable() || getAvailable() == trainerVirtualSpeedNotification.getAvailable()) && hasVirtualSpeedKmh() == trainerVirtualSpeedNotification.hasVirtualSpeedKmh()) {
                return (!hasVirtualSpeedKmh() || Float.floatToIntBits(getVirtualSpeedKmh()) == Float.floatToIntBits(trainerVirtualSpeedNotification.getVirtualSpeedKmh())) && getUnknownFields().equals(trainerVirtualSpeedNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerVirtualSpeedNotificationOrBuilder
        public boolean getAvailable() {
            return this.available_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TrainerVirtualSpeedNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.available_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeFloatSize(2, this.virtualSpeedKmh_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerVirtualSpeedNotificationOrBuilder
        public float getVirtualSpeedKmh() {
            return this.virtualSpeedKmh_;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerVirtualSpeedNotificationOrBuilder
        public boolean hasAvailable() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerVirtualSpeedNotificationOrBuilder
        public boolean hasVirtualSpeedKmh() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAvailable()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getAvailable());
            }
            if (hasVirtualSpeedKmh()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getVirtualSpeedKmh());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerVirtualSpeedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(TrainerVirtualSpeedNotification.class, Builder.class);
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
            return new TrainerVirtualSpeedNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.available_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.virtualSpeedKmh_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TrainerVirtualSpeedNotificationOrBuilder {
            private boolean available_;
            private int bitField0_;
            private float virtualSpeedKmh_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(TrainerVirtualSpeedNotification trainerVirtualSpeedNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    trainerVirtualSpeedNotification.available_ = this.available_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    trainerVirtualSpeedNotification.virtualSpeedKmh_ = this.virtualSpeedKmh_;
                    i14 |= 2;
                }
                trainerVirtualSpeedNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerVirtualSpeedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrainerVirtualSpeedNotification build() {
                TrainerVirtualSpeedNotification trainerVirtualSpeedNotificationBuildPartial = buildPartial();
                if (trainerVirtualSpeedNotificationBuildPartial.isInitialized()) {
                    return trainerVirtualSpeedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) trainerVirtualSpeedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrainerVirtualSpeedNotification buildPartial() {
                TrainerVirtualSpeedNotification trainerVirtualSpeedNotification = new TrainerVirtualSpeedNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(trainerVirtualSpeedNotification);
                }
                onBuilt();
                return trainerVirtualSpeedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.available_ = false;
                this.virtualSpeedKmh_ = 0.0f;
                return this;
            }

            public Builder clearAvailable() {
                this.bitField0_ &= -2;
                this.available_ = false;
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

            public Builder clearVirtualSpeedKmh() {
                this.bitField0_ &= -3;
                this.virtualSpeedKmh_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerVirtualSpeedNotificationOrBuilder
            public boolean getAvailable() {
                return this.available_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerVirtualSpeedNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerVirtualSpeedNotificationOrBuilder
            public float getVirtualSpeedKmh() {
                return this.virtualSpeedKmh_;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerVirtualSpeedNotificationOrBuilder
            public boolean hasAvailable() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerVirtualSpeedNotificationOrBuilder
            public boolean hasVirtualSpeedKmh() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerVirtualSpeedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(TrainerVirtualSpeedNotification.class, Builder.class);
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
                                    this.available_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.virtualSpeedKmh_ = codedInputStream.readFloat();
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

            public Builder setAvailable(boolean z14) {
                this.available_ = z14;
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

            public Builder setVirtualSpeedKmh(float f14) {
                this.virtualSpeedKmh_ = f14;
                this.bitField0_ |= 2;
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
            public TrainerVirtualSpeedNotification getDefaultInstanceForType() {
                return TrainerVirtualSpeedNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TrainerVirtualSpeedNotification) {
                    return mergeFrom((TrainerVirtualSpeedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TrainerVirtualSpeedNotification trainerVirtualSpeedNotification) {
                if (trainerVirtualSpeedNotification == TrainerVirtualSpeedNotification.getDefaultInstance()) {
                    return this;
                }
                if (trainerVirtualSpeedNotification.hasAvailable()) {
                    setAvailable(trainerVirtualSpeedNotification.getAvailable());
                }
                if (trainerVirtualSpeedNotification.hasVirtualSpeedKmh()) {
                    setVirtualSpeedKmh(trainerVirtualSpeedNotification.getVirtualSpeedKmh());
                }
                mergeUnknownFields(trainerVirtualSpeedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TrainerVirtualSpeedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TrainerVirtualSpeedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrainerVirtualSpeedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrainerVirtualSpeedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TrainerVirtualSpeedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TrainerVirtualSpeedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TrainerVirtualSpeedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ TrainerVirtualSpeedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static TrainerVirtualSpeedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private TrainerVirtualSpeedNotification() {
            this.available_ = false;
            this.virtualSpeedKmh_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrainerVirtualSpeedNotification parseFrom(InputStream inputStream) {
            return (TrainerVirtualSpeedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TrainerVirtualSpeedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrainerVirtualSpeedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrainerVirtualSpeedNotification parseFrom(CodedInputStream codedInputStream) {
            return (TrainerVirtualSpeedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TrainerVirtualSpeedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrainerVirtualSpeedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int FEATURES_REQUEST_FIELD_NUMBER = 43;
        public static final int MSG_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private FeatureCapabilitiesMessage msg_;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.CapabilitiesRequest.1
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
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_CapabilitiesRequest_descriptor;
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
            if (hasMsg() != capabilitiesRequest.hasMsg()) {
                return false;
            }
            return (!hasMsg() || getMsg().equals(capabilitiesRequest.getMsg())) && getUnknownFields().equals(capabilitiesRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.CapabilitiesRequestOrBuilder
        public FeatureCapabilitiesMessage getMsg() {
            FeatureCapabilitiesMessage featureCapabilitiesMessage = this.msg_;
            return featureCapabilitiesMessage == null ? FeatureCapabilitiesMessage.getDefaultInstance() : featureCapabilitiesMessage;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.CapabilitiesRequestOrBuilder
        public FeatureCapabilitiesMessageOrBuilder getMsgOrBuilder() {
            FeatureCapabilitiesMessage featureCapabilitiesMessage = this.msg_;
            return featureCapabilitiesMessage == null ? FeatureCapabilitiesMessage.getDefaultInstance() : featureCapabilitiesMessage;
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getMsg()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.CapabilitiesRequestOrBuilder
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
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getMsg());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<FeatureCapabilitiesMessage, FeatureCapabilitiesMessage.Builder, FeatureCapabilitiesMessageOrBuilder> msgBuilder_;
            private FeatureCapabilitiesMessage msg_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CapabilitiesRequest capabilitiesRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<FeatureCapabilitiesMessage, FeatureCapabilitiesMessage.Builder, FeatureCapabilitiesMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                    capabilitiesRequest.msg_ = singleFieldBuilderV3 == null ? this.msg_ : (FeatureCapabilitiesMessage) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                capabilitiesRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_CapabilitiesRequest_descriptor;
            }

            private SingleFieldBuilderV3<FeatureCapabilitiesMessage, FeatureCapabilitiesMessage.Builder, FeatureCapabilitiesMessageOrBuilder> getMsgFieldBuilder() {
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
                this.msg_ = null;
                SingleFieldBuilderV3<FeatureCapabilitiesMessage, FeatureCapabilitiesMessage.Builder, FeatureCapabilitiesMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                SingleFieldBuilderV3<FeatureCapabilitiesMessage, FeatureCapabilitiesMessage.Builder, FeatureCapabilitiesMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_CapabilitiesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.CapabilitiesRequestOrBuilder
            public FeatureCapabilitiesMessage getMsg() {
                SingleFieldBuilderV3<FeatureCapabilitiesMessage, FeatureCapabilitiesMessage.Builder, FeatureCapabilitiesMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FeatureCapabilitiesMessage) singleFieldBuilderV3.getMessage();
                }
                FeatureCapabilitiesMessage featureCapabilitiesMessage = this.msg_;
                return featureCapabilitiesMessage == null ? FeatureCapabilitiesMessage.getDefaultInstance() : featureCapabilitiesMessage;
            }

            public FeatureCapabilitiesMessage.Builder getMsgBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (FeatureCapabilitiesMessage.Builder) getMsgFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.CapabilitiesRequestOrBuilder
            public FeatureCapabilitiesMessageOrBuilder getMsgOrBuilder() {
                SingleFieldBuilderV3<FeatureCapabilitiesMessage, FeatureCapabilitiesMessage.Builder, FeatureCapabilitiesMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FeatureCapabilitiesMessageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FeatureCapabilitiesMessage featureCapabilitiesMessage = this.msg_;
                return featureCapabilitiesMessage == null ? FeatureCapabilitiesMessage.getDefaultInstance() : featureCapabilitiesMessage;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.CapabilitiesRequestOrBuilder
            public boolean hasMsg() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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

            public Builder mergeMsg(FeatureCapabilitiesMessage featureCapabilitiesMessage) {
                FeatureCapabilitiesMessage featureCapabilitiesMessage2;
                SingleFieldBuilderV3<FeatureCapabilitiesMessage, FeatureCapabilitiesMessage.Builder, FeatureCapabilitiesMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(featureCapabilitiesMessage);
                } else if ((this.bitField0_ & 1) == 0 || (featureCapabilitiesMessage2 = this.msg_) == null || featureCapabilitiesMessage2 == FeatureCapabilitiesMessage.getDefaultInstance()) {
                    this.msg_ = featureCapabilitiesMessage;
                } else {
                    getMsgBuilder().mergeFrom(featureCapabilitiesMessage);
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

            public Builder setMsg(FeatureCapabilitiesMessage.Builder builder) {
                SingleFieldBuilderV3<FeatureCapabilitiesMessage, FeatureCapabilitiesMessage.Builder, FeatureCapabilitiesMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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

            public Builder setMsg(FeatureCapabilitiesMessage featureCapabilitiesMessage) {
                SingleFieldBuilderV3<FeatureCapabilitiesMessage, FeatureCapabilitiesMessage.Builder, FeatureCapabilitiesMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 == null) {
                    featureCapabilitiesMessage.getClass();
                    this.msg_ = featureCapabilitiesMessage;
                } else {
                    singleFieldBuilderV3.setMessage(featureCapabilitiesMessage);
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
                if (capabilitiesRequest.hasMsg()) {
                    mergeMsg(capabilitiesRequest.getMsg());
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
        public static final int FEATURES_RESPONSE_FIELD_NUMBER = 43;
        public static final int MSG_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private FeatureCapabilitiesMessage msg_;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.CapabilitiesResponse.1
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
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_CapabilitiesResponse_descriptor;
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
            if (hasMsg() != capabilitiesResponse.hasMsg()) {
                return false;
            }
            return (!hasMsg() || getMsg().equals(capabilitiesResponse.getMsg())) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.CapabilitiesResponseOrBuilder
        public FeatureCapabilitiesMessage getMsg() {
            FeatureCapabilitiesMessage featureCapabilitiesMessage = this.msg_;
            return featureCapabilitiesMessage == null ? FeatureCapabilitiesMessage.getDefaultInstance() : featureCapabilitiesMessage;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.CapabilitiesResponseOrBuilder
        public FeatureCapabilitiesMessageOrBuilder getMsgOrBuilder() {
            FeatureCapabilitiesMessage featureCapabilitiesMessage = this.msg_;
            return featureCapabilitiesMessage == null ? FeatureCapabilitiesMessage.getDefaultInstance() : featureCapabilitiesMessage;
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getMsg()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.CapabilitiesResponseOrBuilder
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
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getMsg());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<FeatureCapabilitiesMessage, FeatureCapabilitiesMessage.Builder, FeatureCapabilitiesMessageOrBuilder> msgBuilder_;
            private FeatureCapabilitiesMessage msg_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<FeatureCapabilitiesMessage, FeatureCapabilitiesMessage.Builder, FeatureCapabilitiesMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                    capabilitiesResponse.msg_ = singleFieldBuilderV3 == null ? this.msg_ : (FeatureCapabilitiesMessage) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                capabilitiesResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_CapabilitiesResponse_descriptor;
            }

            private SingleFieldBuilderV3<FeatureCapabilitiesMessage, FeatureCapabilitiesMessage.Builder, FeatureCapabilitiesMessageOrBuilder> getMsgFieldBuilder() {
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
                this.msg_ = null;
                SingleFieldBuilderV3<FeatureCapabilitiesMessage, FeatureCapabilitiesMessage.Builder, FeatureCapabilitiesMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                SingleFieldBuilderV3<FeatureCapabilitiesMessage, FeatureCapabilitiesMessage.Builder, FeatureCapabilitiesMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.CapabilitiesResponseOrBuilder
            public FeatureCapabilitiesMessage getMsg() {
                SingleFieldBuilderV3<FeatureCapabilitiesMessage, FeatureCapabilitiesMessage.Builder, FeatureCapabilitiesMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FeatureCapabilitiesMessage) singleFieldBuilderV3.getMessage();
                }
                FeatureCapabilitiesMessage featureCapabilitiesMessage = this.msg_;
                return featureCapabilitiesMessage == null ? FeatureCapabilitiesMessage.getDefaultInstance() : featureCapabilitiesMessage;
            }

            public FeatureCapabilitiesMessage.Builder getMsgBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (FeatureCapabilitiesMessage.Builder) getMsgFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.CapabilitiesResponseOrBuilder
            public FeatureCapabilitiesMessageOrBuilder getMsgOrBuilder() {
                SingleFieldBuilderV3<FeatureCapabilitiesMessage, FeatureCapabilitiesMessage.Builder, FeatureCapabilitiesMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FeatureCapabilitiesMessageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FeatureCapabilitiesMessage featureCapabilitiesMessage = this.msg_;
                return featureCapabilitiesMessage == null ? FeatureCapabilitiesMessage.getDefaultInstance() : featureCapabilitiesMessage;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.CapabilitiesResponseOrBuilder
            public boolean hasMsg() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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

            public Builder mergeMsg(FeatureCapabilitiesMessage featureCapabilitiesMessage) {
                FeatureCapabilitiesMessage featureCapabilitiesMessage2;
                SingleFieldBuilderV3<FeatureCapabilitiesMessage, FeatureCapabilitiesMessage.Builder, FeatureCapabilitiesMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(featureCapabilitiesMessage);
                } else if ((this.bitField0_ & 1) == 0 || (featureCapabilitiesMessage2 = this.msg_) == null || featureCapabilitiesMessage2 == FeatureCapabilitiesMessage.getDefaultInstance()) {
                    this.msg_ = featureCapabilitiesMessage;
                } else {
                    getMsgBuilder().mergeFrom(featureCapabilitiesMessage);
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

            public Builder setMsg(FeatureCapabilitiesMessage.Builder builder) {
                SingleFieldBuilderV3<FeatureCapabilitiesMessage, FeatureCapabilitiesMessage.Builder, FeatureCapabilitiesMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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

            public Builder setMsg(FeatureCapabilitiesMessage featureCapabilitiesMessage) {
                SingleFieldBuilderV3<FeatureCapabilitiesMessage, FeatureCapabilitiesMessage.Builder, FeatureCapabilitiesMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 == null) {
                    featureCapabilitiesMessage.getClass();
                    this.msg_ = featureCapabilitiesMessage;
                } else {
                    singleFieldBuilderV3.setMessage(featureCapabilitiesMessage);
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
                if (capabilitiesResponse.hasMsg()) {
                    mergeMsg(capabilitiesResponse.getMsg());
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

    public static final class EdgeMountStatusMessage extends GeneratedMessageV3 implements EdgeMountStatusMessageOrBuilder {
        public static final int CHARGING_FAULT_DETECTED_FIELD_NUMBER = 3;
        public static final int CHARGING_FIELD_NUMBER = 2;
        public static final int CHARGING_MODE_FIELD_NUMBER = 4;
        public static final int MOUNTED_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean chargingFaultDetected_;
        private int chargingMode_;
        private boolean charging_;
        private byte memoizedIsInitialized;
        private boolean mounted_;
        private static final EdgeMountStatusMessage DEFAULT_INSTANCE = new EdgeMountStatusMessage();

        @Deprecated
        public static final Parser<EdgeMountStatusMessage> PARSER = new AbstractParser<EdgeMountStatusMessage>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusMessage.1
            @Override // com.google.protobuf.Parser
            public EdgeMountStatusMessage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EdgeMountStatusMessage.newBuilder();
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

        private EdgeMountStatusMessage(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.mounted_ = false;
            this.charging_ = false;
            this.chargingFaultDetected_ = false;
            this.chargingMode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EdgeMountStatusMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusMessage_descriptor;
        }

        public static Builder newBuilder(EdgeMountStatusMessage edgeMountStatusMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(edgeMountStatusMessage);
        }

        public static EdgeMountStatusMessage parseDelimitedFrom(InputStream inputStream) {
            return (EdgeMountStatusMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EdgeMountStatusMessage parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EdgeMountStatusMessage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EdgeMountStatusMessage)) {
                return super.equals(obj);
            }
            EdgeMountStatusMessage edgeMountStatusMessage = (EdgeMountStatusMessage) obj;
            if (hasMounted() != edgeMountStatusMessage.hasMounted()) {
                return false;
            }
            if ((hasMounted() && getMounted() != edgeMountStatusMessage.getMounted()) || hasCharging() != edgeMountStatusMessage.hasCharging()) {
                return false;
            }
            if ((hasCharging() && getCharging() != edgeMountStatusMessage.getCharging()) || hasChargingFaultDetected() != edgeMountStatusMessage.hasChargingFaultDetected()) {
                return false;
            }
            if ((!hasChargingFaultDetected() || getChargingFaultDetected() == edgeMountStatusMessage.getChargingFaultDetected()) && hasChargingMode() == edgeMountStatusMessage.hasChargingMode()) {
                return (!hasChargingMode() || this.chargingMode_ == edgeMountStatusMessage.chargingMode_) && getUnknownFields().equals(edgeMountStatusMessage.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusMessageOrBuilder
        public boolean getCharging() {
            return this.charging_;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusMessageOrBuilder
        public boolean getChargingFaultDetected() {
            return this.chargingFaultDetected_;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusMessageOrBuilder
        public ChargingMode getChargingMode() {
            ChargingMode chargingModeForNumber = ChargingMode.forNumber(this.chargingMode_);
            return chargingModeForNumber == null ? ChargingMode.UNKNOWN : chargingModeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusMessageOrBuilder
        public boolean getMounted() {
            return this.mounted_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EdgeMountStatusMessage> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.mounted_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(2, this.charging_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(3, this.chargingFaultDetected_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(4, this.chargingMode_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusMessageOrBuilder
        public boolean hasCharging() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusMessageOrBuilder
        public boolean hasChargingFaultDetected() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusMessageOrBuilder
        public boolean hasChargingMode() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusMessageOrBuilder
        public boolean hasMounted() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMounted()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getMounted());
            }
            if (hasCharging()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getCharging());
            }
            if (hasChargingFaultDetected()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getChargingFaultDetected());
            }
            if (hasChargingMode()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + this.chargingMode_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(EdgeMountStatusMessage.class, Builder.class);
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
            return new EdgeMountStatusMessage();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.mounted_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.charging_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.chargingFaultDetected_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(4, this.chargingMode_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EdgeMountStatusMessageOrBuilder {
            private int bitField0_;
            private boolean chargingFaultDetected_;
            private int chargingMode_;
            private boolean charging_;
            private boolean mounted_;

            private Builder() {
                this.chargingMode_ = 0;
            }

            private void buildPartial0(EdgeMountStatusMessage edgeMountStatusMessage) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    edgeMountStatusMessage.mounted_ = this.mounted_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    edgeMountStatusMessage.charging_ = this.charging_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    edgeMountStatusMessage.chargingFaultDetected_ = this.chargingFaultDetected_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    edgeMountStatusMessage.chargingMode_ = this.chargingMode_;
                    i14 |= 8;
                }
                edgeMountStatusMessage.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusMessage_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EdgeMountStatusMessage build() {
                EdgeMountStatusMessage edgeMountStatusMessageBuildPartial = buildPartial();
                if (edgeMountStatusMessageBuildPartial.isInitialized()) {
                    return edgeMountStatusMessageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) edgeMountStatusMessageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EdgeMountStatusMessage buildPartial() {
                EdgeMountStatusMessage edgeMountStatusMessage = new EdgeMountStatusMessage(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(edgeMountStatusMessage);
                }
                onBuilt();
                return edgeMountStatusMessage;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.mounted_ = false;
                this.charging_ = false;
                this.chargingFaultDetected_ = false;
                this.chargingMode_ = 0;
                return this;
            }

            public Builder clearCharging() {
                this.bitField0_ &= -3;
                this.charging_ = false;
                onChanged();
                return this;
            }

            public Builder clearChargingFaultDetected() {
                this.bitField0_ &= -5;
                this.chargingFaultDetected_ = false;
                onChanged();
                return this;
            }

            public Builder clearChargingMode() {
                this.bitField0_ &= -9;
                this.chargingMode_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMounted() {
                this.bitField0_ &= -2;
                this.mounted_ = false;
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

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusMessageOrBuilder
            public boolean getCharging() {
                return this.charging_;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusMessageOrBuilder
            public boolean getChargingFaultDetected() {
                return this.chargingFaultDetected_;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusMessageOrBuilder
            public ChargingMode getChargingMode() {
                ChargingMode chargingModeForNumber = ChargingMode.forNumber(this.chargingMode_);
                return chargingModeForNumber == null ? ChargingMode.UNKNOWN : chargingModeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusMessage_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusMessageOrBuilder
            public boolean getMounted() {
                return this.mounted_;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusMessageOrBuilder
            public boolean hasCharging() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusMessageOrBuilder
            public boolean hasChargingFaultDetected() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusMessageOrBuilder
            public boolean hasChargingMode() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusMessageOrBuilder
            public boolean hasMounted() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(EdgeMountStatusMessage.class, Builder.class);
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
                                    this.mounted_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.charging_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.chargingFaultDetected_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ChargingMode.forNumber(i14) == null) {
                                        mergeUnknownVarintField(4, i14);
                                    } else {
                                        this.chargingMode_ = i14;
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

            public Builder setCharging(boolean z14) {
                this.charging_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setChargingFaultDetected(boolean z14) {
                this.chargingFaultDetected_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setChargingMode(ChargingMode chargingMode) {
                chargingMode.getClass();
                this.bitField0_ |= 8;
                this.chargingMode_ = chargingMode.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setMounted(boolean z14) {
                this.mounted_ = z14;
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
            public EdgeMountStatusMessage getDefaultInstanceForType() {
                return EdgeMountStatusMessage.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.chargingMode_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EdgeMountStatusMessage) {
                    return mergeFrom((EdgeMountStatusMessage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EdgeMountStatusMessage edgeMountStatusMessage) {
                if (edgeMountStatusMessage == EdgeMountStatusMessage.getDefaultInstance()) {
                    return this;
                }
                if (edgeMountStatusMessage.hasMounted()) {
                    setMounted(edgeMountStatusMessage.getMounted());
                }
                if (edgeMountStatusMessage.hasCharging()) {
                    setCharging(edgeMountStatusMessage.getCharging());
                }
                if (edgeMountStatusMessage.hasChargingFaultDetected()) {
                    setChargingFaultDetected(edgeMountStatusMessage.getChargingFaultDetected());
                }
                if (edgeMountStatusMessage.hasChargingMode()) {
                    setChargingMode(edgeMountStatusMessage.getChargingMode());
                }
                mergeUnknownFields(edgeMountStatusMessage.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EdgeMountStatusMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EdgeMountStatusMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EdgeMountStatusMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EdgeMountStatusMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EdgeMountStatusMessage parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EdgeMountStatusMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EdgeMountStatusMessage parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EdgeMountStatusMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EdgeMountStatusMessage parseFrom(InputStream inputStream) {
            return (EdgeMountStatusMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ EdgeMountStatusMessage(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static EdgeMountStatusMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EdgeMountStatusMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private EdgeMountStatusMessage() {
            this.mounted_ = false;
            this.charging_ = false;
            this.chargingFaultDetected_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.chargingMode_ = 0;
        }

        public static EdgeMountStatusMessage parseFrom(CodedInputStream codedInputStream) {
            return (EdgeMountStatusMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EdgeMountStatusMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EdgeMountStatusMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ChargingMode implements ProtocolMessageEnum {
            UNKNOWN(0),
            AUTO(1),
            MANUAL_OVERRIDE(2);

            public static final int AUTO_VALUE = 1;
            public static final int MANUAL_OVERRIDE_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ChargingMode> internalValueMap = new Internal.EnumLiteMap<ChargingMode>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusMessage.ChargingMode.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ChargingMode findValueByNumber(int i14) {
                    return ChargingMode.forNumber(i14);
                }
            };
            private static final ChargingMode[] VALUES = values();

            ChargingMode(int i14) {
                this.value = i14;
            }

            public static ChargingMode forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return AUTO;
                }
                if (i14 != 2) {
                    return null;
                }
                return MANUAL_OVERRIDE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return EdgeMountStatusMessage.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ChargingMode> internalGetValueMap() {
                return internalValueMap;
            }

            public static ChargingMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ChargingMode valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class EdgeMountStatusNotification extends GeneratedMessageV3 implements EdgeMountStatusNotificationOrBuilder {
        public static final int MSG_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private EdgeMountStatusMessage msg_;
        private static final EdgeMountStatusNotification DEFAULT_INSTANCE = new EdgeMountStatusNotification();

        @Deprecated
        public static final Parser<EdgeMountStatusNotification> PARSER = new AbstractParser<EdgeMountStatusNotification>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusNotification.1
            @Override // com.google.protobuf.Parser
            public EdgeMountStatusNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EdgeMountStatusNotification.newBuilder();
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

        private EdgeMountStatusNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EdgeMountStatusNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusNotification_descriptor;
        }

        public static Builder newBuilder(EdgeMountStatusNotification edgeMountStatusNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(edgeMountStatusNotification);
        }

        public static EdgeMountStatusNotification parseDelimitedFrom(InputStream inputStream) {
            return (EdgeMountStatusNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EdgeMountStatusNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EdgeMountStatusNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EdgeMountStatusNotification)) {
                return super.equals(obj);
            }
            EdgeMountStatusNotification edgeMountStatusNotification = (EdgeMountStatusNotification) obj;
            if (hasMsg() != edgeMountStatusNotification.hasMsg()) {
                return false;
            }
            return (!hasMsg() || getMsg().equals(edgeMountStatusNotification.getMsg())) && getUnknownFields().equals(edgeMountStatusNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusNotificationOrBuilder
        public EdgeMountStatusMessage getMsg() {
            EdgeMountStatusMessage edgeMountStatusMessage = this.msg_;
            return edgeMountStatusMessage == null ? EdgeMountStatusMessage.getDefaultInstance() : edgeMountStatusMessage;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusNotificationOrBuilder
        public EdgeMountStatusMessageOrBuilder getMsgOrBuilder() {
            EdgeMountStatusMessage edgeMountStatusMessage = this.msg_;
            return edgeMountStatusMessage == null ? EdgeMountStatusMessage.getDefaultInstance() : edgeMountStatusMessage;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EdgeMountStatusNotification> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusNotificationOrBuilder
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
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(EdgeMountStatusNotification.class, Builder.class);
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
            return new EdgeMountStatusNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EdgeMountStatusNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<EdgeMountStatusMessage, EdgeMountStatusMessage.Builder, EdgeMountStatusMessageOrBuilder> msgBuilder_;
            private EdgeMountStatusMessage msg_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(EdgeMountStatusNotification edgeMountStatusNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<EdgeMountStatusMessage, EdgeMountStatusMessage.Builder, EdgeMountStatusMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                    edgeMountStatusNotification.msg_ = singleFieldBuilderV3 == null ? this.msg_ : (EdgeMountStatusMessage) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                edgeMountStatusNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusNotification_descriptor;
            }

            private SingleFieldBuilderV3<EdgeMountStatusMessage, EdgeMountStatusMessage.Builder, EdgeMountStatusMessageOrBuilder> getMsgFieldBuilder() {
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
            public EdgeMountStatusNotification build() {
                EdgeMountStatusNotification edgeMountStatusNotificationBuildPartial = buildPartial();
                if (edgeMountStatusNotificationBuildPartial.isInitialized()) {
                    return edgeMountStatusNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) edgeMountStatusNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EdgeMountStatusNotification buildPartial() {
                EdgeMountStatusNotification edgeMountStatusNotification = new EdgeMountStatusNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(edgeMountStatusNotification);
                }
                onBuilt();
                return edgeMountStatusNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.msg_ = null;
                SingleFieldBuilderV3<EdgeMountStatusMessage, EdgeMountStatusMessage.Builder, EdgeMountStatusMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                SingleFieldBuilderV3<EdgeMountStatusMessage, EdgeMountStatusMessage.Builder, EdgeMountStatusMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusNotificationOrBuilder
            public EdgeMountStatusMessage getMsg() {
                SingleFieldBuilderV3<EdgeMountStatusMessage, EdgeMountStatusMessage.Builder, EdgeMountStatusMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EdgeMountStatusMessage) singleFieldBuilderV3.getMessage();
                }
                EdgeMountStatusMessage edgeMountStatusMessage = this.msg_;
                return edgeMountStatusMessage == null ? EdgeMountStatusMessage.getDefaultInstance() : edgeMountStatusMessage;
            }

            public EdgeMountStatusMessage.Builder getMsgBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (EdgeMountStatusMessage.Builder) getMsgFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusNotificationOrBuilder
            public EdgeMountStatusMessageOrBuilder getMsgOrBuilder() {
                SingleFieldBuilderV3<EdgeMountStatusMessage, EdgeMountStatusMessage.Builder, EdgeMountStatusMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EdgeMountStatusMessageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EdgeMountStatusMessage edgeMountStatusMessage = this.msg_;
                return edgeMountStatusMessage == null ? EdgeMountStatusMessage.getDefaultInstance() : edgeMountStatusMessage;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusNotificationOrBuilder
            public boolean hasMsg() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(EdgeMountStatusNotification.class, Builder.class);
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

            public Builder mergeMsg(EdgeMountStatusMessage edgeMountStatusMessage) {
                EdgeMountStatusMessage edgeMountStatusMessage2;
                SingleFieldBuilderV3<EdgeMountStatusMessage, EdgeMountStatusMessage.Builder, EdgeMountStatusMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(edgeMountStatusMessage);
                } else if ((this.bitField0_ & 1) == 0 || (edgeMountStatusMessage2 = this.msg_) == null || edgeMountStatusMessage2 == EdgeMountStatusMessage.getDefaultInstance()) {
                    this.msg_ = edgeMountStatusMessage;
                } else {
                    getMsgBuilder().mergeFrom(edgeMountStatusMessage);
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

            public Builder setMsg(EdgeMountStatusMessage.Builder builder) {
                SingleFieldBuilderV3<EdgeMountStatusMessage, EdgeMountStatusMessage.Builder, EdgeMountStatusMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
            public EdgeMountStatusNotification getDefaultInstanceForType() {
                return EdgeMountStatusNotification.getDefaultInstance();
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

            public Builder setMsg(EdgeMountStatusMessage edgeMountStatusMessage) {
                SingleFieldBuilderV3<EdgeMountStatusMessage, EdgeMountStatusMessage.Builder, EdgeMountStatusMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 == null) {
                    edgeMountStatusMessage.getClass();
                    this.msg_ = edgeMountStatusMessage;
                } else {
                    singleFieldBuilderV3.setMessage(edgeMountStatusMessage);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EdgeMountStatusNotification) {
                    return mergeFrom((EdgeMountStatusNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EdgeMountStatusNotification edgeMountStatusNotification) {
                if (edgeMountStatusNotification == EdgeMountStatusNotification.getDefaultInstance()) {
                    return this;
                }
                if (edgeMountStatusNotification.hasMsg()) {
                    mergeMsg(edgeMountStatusNotification.getMsg());
                }
                mergeUnknownFields(edgeMountStatusNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EdgeMountStatusNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ EdgeMountStatusNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private EdgeMountStatusNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EdgeMountStatusNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EdgeMountStatusNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EdgeMountStatusNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EdgeMountStatusNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EdgeMountStatusNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EdgeMountStatusNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EdgeMountStatusNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EdgeMountStatusNotification parseFrom(InputStream inputStream) {
            return (EdgeMountStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EdgeMountStatusNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EdgeMountStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EdgeMountStatusNotification parseFrom(CodedInputStream codedInputStream) {
            return (EdgeMountStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EdgeMountStatusNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EdgeMountStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EdgeMountStatusResponse extends GeneratedMessageV3 implements EdgeMountStatusResponseOrBuilder {
        public static final int MSG_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private EdgeMountStatusMessage msg_;
        private static final EdgeMountStatusResponse DEFAULT_INSTANCE = new EdgeMountStatusResponse();

        @Deprecated
        public static final Parser<EdgeMountStatusResponse> PARSER = new AbstractParser<EdgeMountStatusResponse>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusResponse.1
            @Override // com.google.protobuf.Parser
            public EdgeMountStatusResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EdgeMountStatusResponse.newBuilder();
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

        private EdgeMountStatusResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EdgeMountStatusResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusResponse_descriptor;
        }

        public static Builder newBuilder(EdgeMountStatusResponse edgeMountStatusResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(edgeMountStatusResponse);
        }

        public static EdgeMountStatusResponse parseDelimitedFrom(InputStream inputStream) {
            return (EdgeMountStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EdgeMountStatusResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EdgeMountStatusResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EdgeMountStatusResponse)) {
                return super.equals(obj);
            }
            EdgeMountStatusResponse edgeMountStatusResponse = (EdgeMountStatusResponse) obj;
            if (hasMsg() != edgeMountStatusResponse.hasMsg()) {
                return false;
            }
            return (!hasMsg() || getMsg().equals(edgeMountStatusResponse.getMsg())) && getUnknownFields().equals(edgeMountStatusResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusResponseOrBuilder
        public EdgeMountStatusMessage getMsg() {
            EdgeMountStatusMessage edgeMountStatusMessage = this.msg_;
            return edgeMountStatusMessage == null ? EdgeMountStatusMessage.getDefaultInstance() : edgeMountStatusMessage;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusResponseOrBuilder
        public EdgeMountStatusMessageOrBuilder getMsgOrBuilder() {
            EdgeMountStatusMessage edgeMountStatusMessage = this.msg_;
            return edgeMountStatusMessage == null ? EdgeMountStatusMessage.getDefaultInstance() : edgeMountStatusMessage;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EdgeMountStatusResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusResponseOrBuilder
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
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EdgeMountStatusResponse.class, Builder.class);
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
            return new EdgeMountStatusResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EdgeMountStatusResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<EdgeMountStatusMessage, EdgeMountStatusMessage.Builder, EdgeMountStatusMessageOrBuilder> msgBuilder_;
            private EdgeMountStatusMessage msg_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(EdgeMountStatusResponse edgeMountStatusResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<EdgeMountStatusMessage, EdgeMountStatusMessage.Builder, EdgeMountStatusMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                    edgeMountStatusResponse.msg_ = singleFieldBuilderV3 == null ? this.msg_ : (EdgeMountStatusMessage) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                edgeMountStatusResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusResponse_descriptor;
            }

            private SingleFieldBuilderV3<EdgeMountStatusMessage, EdgeMountStatusMessage.Builder, EdgeMountStatusMessageOrBuilder> getMsgFieldBuilder() {
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
            public EdgeMountStatusResponse build() {
                EdgeMountStatusResponse edgeMountStatusResponseBuildPartial = buildPartial();
                if (edgeMountStatusResponseBuildPartial.isInitialized()) {
                    return edgeMountStatusResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) edgeMountStatusResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EdgeMountStatusResponse buildPartial() {
                EdgeMountStatusResponse edgeMountStatusResponse = new EdgeMountStatusResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(edgeMountStatusResponse);
                }
                onBuilt();
                return edgeMountStatusResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.msg_ = null;
                SingleFieldBuilderV3<EdgeMountStatusMessage, EdgeMountStatusMessage.Builder, EdgeMountStatusMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                SingleFieldBuilderV3<EdgeMountStatusMessage, EdgeMountStatusMessage.Builder, EdgeMountStatusMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusResponseOrBuilder
            public EdgeMountStatusMessage getMsg() {
                SingleFieldBuilderV3<EdgeMountStatusMessage, EdgeMountStatusMessage.Builder, EdgeMountStatusMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EdgeMountStatusMessage) singleFieldBuilderV3.getMessage();
                }
                EdgeMountStatusMessage edgeMountStatusMessage = this.msg_;
                return edgeMountStatusMessage == null ? EdgeMountStatusMessage.getDefaultInstance() : edgeMountStatusMessage;
            }

            public EdgeMountStatusMessage.Builder getMsgBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (EdgeMountStatusMessage.Builder) getMsgFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusResponseOrBuilder
            public EdgeMountStatusMessageOrBuilder getMsgOrBuilder() {
                SingleFieldBuilderV3<EdgeMountStatusMessage, EdgeMountStatusMessage.Builder, EdgeMountStatusMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EdgeMountStatusMessageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EdgeMountStatusMessage edgeMountStatusMessage = this.msg_;
                return edgeMountStatusMessage == null ? EdgeMountStatusMessage.getDefaultInstance() : edgeMountStatusMessage;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.EdgeMountStatusResponseOrBuilder
            public boolean hasMsg() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_EdgeMountStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EdgeMountStatusResponse.class, Builder.class);
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

            public Builder mergeMsg(EdgeMountStatusMessage edgeMountStatusMessage) {
                EdgeMountStatusMessage edgeMountStatusMessage2;
                SingleFieldBuilderV3<EdgeMountStatusMessage, EdgeMountStatusMessage.Builder, EdgeMountStatusMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(edgeMountStatusMessage);
                } else if ((this.bitField0_ & 1) == 0 || (edgeMountStatusMessage2 = this.msg_) == null || edgeMountStatusMessage2 == EdgeMountStatusMessage.getDefaultInstance()) {
                    this.msg_ = edgeMountStatusMessage;
                } else {
                    getMsgBuilder().mergeFrom(edgeMountStatusMessage);
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

            public Builder setMsg(EdgeMountStatusMessage.Builder builder) {
                SingleFieldBuilderV3<EdgeMountStatusMessage, EdgeMountStatusMessage.Builder, EdgeMountStatusMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
            public EdgeMountStatusResponse getDefaultInstanceForType() {
                return EdgeMountStatusResponse.getDefaultInstance();
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

            public Builder setMsg(EdgeMountStatusMessage edgeMountStatusMessage) {
                SingleFieldBuilderV3<EdgeMountStatusMessage, EdgeMountStatusMessage.Builder, EdgeMountStatusMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 == null) {
                    edgeMountStatusMessage.getClass();
                    this.msg_ = edgeMountStatusMessage;
                } else {
                    singleFieldBuilderV3.setMessage(edgeMountStatusMessage);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EdgeMountStatusResponse) {
                    return mergeFrom((EdgeMountStatusResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EdgeMountStatusResponse edgeMountStatusResponse) {
                if (edgeMountStatusResponse == EdgeMountStatusResponse.getDefaultInstance()) {
                    return this;
                }
                if (edgeMountStatusResponse.hasMsg()) {
                    mergeMsg(edgeMountStatusResponse.getMsg());
                }
                mergeUnknownFields(edgeMountStatusResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EdgeMountStatusResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ EdgeMountStatusResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private EdgeMountStatusResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EdgeMountStatusResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EdgeMountStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EdgeMountStatusResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EdgeMountStatusResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EdgeMountStatusResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EdgeMountStatusResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EdgeMountStatusResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EdgeMountStatusResponse parseFrom(InputStream inputStream) {
            return (EdgeMountStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EdgeMountStatusResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EdgeMountStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EdgeMountStatusResponse parseFrom(CodedInputStream codedInputStream) {
            return (EdgeMountStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EdgeMountStatusResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EdgeMountStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PedalPowerNotification extends GeneratedMessageV3 implements PedalPowerNotificationOrBuilder {
        public static final int BALANCE_FIELD_NUMBER = 2;
        private static final PedalPowerNotification DEFAULT_INSTANCE = new PedalPowerNotification();

        @Deprecated
        public static final Parser<PedalPowerNotification> PARSER = new AbstractParser<PedalPowerNotification>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.PedalPowerNotification.1
            @Override // com.google.protobuf.Parser
            public PedalPowerNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PedalPowerNotification.newBuilder();
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
        public static final int REFERENCE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private float balance_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int reference_;

        private PedalPowerNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.reference_ = 0;
            this.balance_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PedalPowerNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PedalPowerNotification_descriptor;
        }

        public static Builder newBuilder(PedalPowerNotification pedalPowerNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pedalPowerNotification);
        }

        public static PedalPowerNotification parseDelimitedFrom(InputStream inputStream) {
            return (PedalPowerNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PedalPowerNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PedalPowerNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PedalPowerNotification)) {
                return super.equals(obj);
            }
            PedalPowerNotification pedalPowerNotification = (PedalPowerNotification) obj;
            if (hasReference() != pedalPowerNotification.hasReference()) {
                return false;
            }
            if ((!hasReference() || this.reference_ == pedalPowerNotification.reference_) && hasBalance() == pedalPowerNotification.hasBalance()) {
                return (!hasBalance() || Float.floatToIntBits(getBalance()) == Float.floatToIntBits(pedalPowerNotification.getBalance())) && getUnknownFields().equals(pedalPowerNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PedalPowerNotificationOrBuilder
        public float getBalance() {
            return this.balance_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PedalPowerNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PedalPowerNotificationOrBuilder
        public BalanceReference getReference() {
            BalanceReference balanceReferenceForNumber = BalanceReference.forNumber(this.reference_);
            return balanceReferenceForNumber == null ? BalanceReference.UNKNOWN : balanceReferenceForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.reference_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeFloatSize(2, this.balance_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PedalPowerNotificationOrBuilder
        public boolean hasBalance() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PedalPowerNotificationOrBuilder
        public boolean hasReference() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasReference()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.reference_;
            }
            if (hasBalance()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getBalance());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PedalPowerNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(PedalPowerNotification.class, Builder.class);
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
            return new PedalPowerNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.reference_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.balance_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PedalPowerNotificationOrBuilder {
            private float balance_;
            private int bitField0_;
            private int reference_;

            private Builder() {
                this.reference_ = 0;
            }

            private void buildPartial0(PedalPowerNotification pedalPowerNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    pedalPowerNotification.reference_ = this.reference_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    pedalPowerNotification.balance_ = this.balance_;
                    i14 |= 2;
                }
                pedalPowerNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PedalPowerNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PedalPowerNotification build() {
                PedalPowerNotification pedalPowerNotificationBuildPartial = buildPartial();
                if (pedalPowerNotificationBuildPartial.isInitialized()) {
                    return pedalPowerNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pedalPowerNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PedalPowerNotification buildPartial() {
                PedalPowerNotification pedalPowerNotification = new PedalPowerNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(pedalPowerNotification);
                }
                onBuilt();
                return pedalPowerNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.reference_ = 0;
                this.balance_ = 0.0f;
                return this;
            }

            public Builder clearBalance() {
                this.bitField0_ &= -3;
                this.balance_ = 0.0f;
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

            public Builder clearReference() {
                this.bitField0_ &= -2;
                this.reference_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PedalPowerNotificationOrBuilder
            public float getBalance() {
                return this.balance_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PedalPowerNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PedalPowerNotificationOrBuilder
            public BalanceReference getReference() {
                BalanceReference balanceReferenceForNumber = BalanceReference.forNumber(this.reference_);
                return balanceReferenceForNumber == null ? BalanceReference.UNKNOWN : balanceReferenceForNumber;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PedalPowerNotificationOrBuilder
            public boolean hasBalance() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PedalPowerNotificationOrBuilder
            public boolean hasReference() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PedalPowerNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(PedalPowerNotification.class, Builder.class);
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
                                    if (BalanceReference.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.reference_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 21) {
                                    this.balance_ = codedInputStream.readFloat();
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

            public Builder setBalance(float f14) {
                this.balance_ = f14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setReference(BalanceReference balanceReference) {
                balanceReference.getClass();
                this.bitField0_ |= 1;
                this.reference_ = balanceReference.getNumber();
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
            public PedalPowerNotification getDefaultInstanceForType() {
                return PedalPowerNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.reference_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PedalPowerNotification) {
                    return mergeFrom((PedalPowerNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PedalPowerNotification pedalPowerNotification) {
                if (pedalPowerNotification == PedalPowerNotification.getDefaultInstance()) {
                    return this;
                }
                if (pedalPowerNotification.hasReference()) {
                    setReference(pedalPowerNotification.getReference());
                }
                if (pedalPowerNotification.hasBalance()) {
                    setBalance(pedalPowerNotification.getBalance());
                }
                mergeUnknownFields(pedalPowerNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PedalPowerNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static PedalPowerNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PedalPowerNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PedalPowerNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PedalPowerNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PedalPowerNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PedalPowerNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ PedalPowerNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static PedalPowerNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private PedalPowerNotification() {
            this.balance_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
            this.reference_ = 0;
        }

        public static PedalPowerNotification parseFrom(InputStream inputStream) {
            return (PedalPowerNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PedalPowerNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PedalPowerNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PedalPowerNotification parseFrom(CodedInputStream codedInputStream) {
            return (PedalPowerNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PedalPowerNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PedalPowerNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum BalanceReference implements ProtocolMessageEnum {
            UNKNOWN(0),
            LEFT(1);

            public static final int LEFT_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<BalanceReference> internalValueMap = new Internal.EnumLiteMap<BalanceReference>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.PedalPowerNotification.BalanceReference.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public BalanceReference findValueByNumber(int i14) {
                    return BalanceReference.forNumber(i14);
                }
            };
            private static final BalanceReference[] VALUES = values();

            BalanceReference(int i14) {
                this.value = i14;
            }

            public static BalanceReference forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 != 1) {
                    return null;
                }
                return LEFT;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return PedalPowerNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<BalanceReference> internalGetValueMap() {
                return internalValueMap;
            }

            public static BalanceReference valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static BalanceReference valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class PowerZoneFtpRequest extends GeneratedMessageV3 implements PowerZoneFtpRequestOrBuilder {
        public static final int MSG_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private PowerZoneFtpMessage msg_;
        private static final PowerZoneFtpRequest DEFAULT_INSTANCE = new PowerZoneFtpRequest();

        @Deprecated
        public static final Parser<PowerZoneFtpRequest> PARSER = new AbstractParser<PowerZoneFtpRequest>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneFtpRequest.1
            @Override // com.google.protobuf.Parser
            public PowerZoneFtpRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PowerZoneFtpRequest.newBuilder();
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

        private PowerZoneFtpRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PowerZoneFtpRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpRequest_descriptor;
        }

        public static Builder newBuilder(PowerZoneFtpRequest powerZoneFtpRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(powerZoneFtpRequest);
        }

        public static PowerZoneFtpRequest parseDelimitedFrom(InputStream inputStream) {
            return (PowerZoneFtpRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PowerZoneFtpRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PowerZoneFtpRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PowerZoneFtpRequest)) {
                return super.equals(obj);
            }
            PowerZoneFtpRequest powerZoneFtpRequest = (PowerZoneFtpRequest) obj;
            if (hasMsg() != powerZoneFtpRequest.hasMsg()) {
                return false;
            }
            return (!hasMsg() || getMsg().equals(powerZoneFtpRequest.getMsg())) && getUnknownFields().equals(powerZoneFtpRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneFtpRequestOrBuilder
        public PowerZoneFtpMessage getMsg() {
            PowerZoneFtpMessage powerZoneFtpMessage = this.msg_;
            return powerZoneFtpMessage == null ? PowerZoneFtpMessage.getDefaultInstance() : powerZoneFtpMessage;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneFtpRequestOrBuilder
        public PowerZoneFtpMessageOrBuilder getMsgOrBuilder() {
            PowerZoneFtpMessage powerZoneFtpMessage = this.msg_;
            return powerZoneFtpMessage == null ? PowerZoneFtpMessage.getDefaultInstance() : powerZoneFtpMessage;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PowerZoneFtpRequest> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneFtpRequestOrBuilder
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
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(PowerZoneFtpRequest.class, Builder.class);
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
            return new PowerZoneFtpRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PowerZoneFtpRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<PowerZoneFtpMessage, PowerZoneFtpMessage.Builder, PowerZoneFtpMessageOrBuilder> msgBuilder_;
            private PowerZoneFtpMessage msg_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(PowerZoneFtpRequest powerZoneFtpRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<PowerZoneFtpMessage, PowerZoneFtpMessage.Builder, PowerZoneFtpMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                    powerZoneFtpRequest.msg_ = singleFieldBuilderV3 == null ? this.msg_ : (PowerZoneFtpMessage) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                powerZoneFtpRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpRequest_descriptor;
            }

            private SingleFieldBuilderV3<PowerZoneFtpMessage, PowerZoneFtpMessage.Builder, PowerZoneFtpMessageOrBuilder> getMsgFieldBuilder() {
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
            public PowerZoneFtpRequest build() {
                PowerZoneFtpRequest powerZoneFtpRequestBuildPartial = buildPartial();
                if (powerZoneFtpRequestBuildPartial.isInitialized()) {
                    return powerZoneFtpRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) powerZoneFtpRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PowerZoneFtpRequest buildPartial() {
                PowerZoneFtpRequest powerZoneFtpRequest = new PowerZoneFtpRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(powerZoneFtpRequest);
                }
                onBuilt();
                return powerZoneFtpRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.msg_ = null;
                SingleFieldBuilderV3<PowerZoneFtpMessage, PowerZoneFtpMessage.Builder, PowerZoneFtpMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                SingleFieldBuilderV3<PowerZoneFtpMessage, PowerZoneFtpMessage.Builder, PowerZoneFtpMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneFtpRequestOrBuilder
            public PowerZoneFtpMessage getMsg() {
                SingleFieldBuilderV3<PowerZoneFtpMessage, PowerZoneFtpMessage.Builder, PowerZoneFtpMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneFtpMessage) singleFieldBuilderV3.getMessage();
                }
                PowerZoneFtpMessage powerZoneFtpMessage = this.msg_;
                return powerZoneFtpMessage == null ? PowerZoneFtpMessage.getDefaultInstance() : powerZoneFtpMessage;
            }

            public PowerZoneFtpMessage.Builder getMsgBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (PowerZoneFtpMessage.Builder) getMsgFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneFtpRequestOrBuilder
            public PowerZoneFtpMessageOrBuilder getMsgOrBuilder() {
                SingleFieldBuilderV3<PowerZoneFtpMessage, PowerZoneFtpMessage.Builder, PowerZoneFtpMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneFtpMessageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PowerZoneFtpMessage powerZoneFtpMessage = this.msg_;
                return powerZoneFtpMessage == null ? PowerZoneFtpMessage.getDefaultInstance() : powerZoneFtpMessage;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneFtpRequestOrBuilder
            public boolean hasMsg() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(PowerZoneFtpRequest.class, Builder.class);
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

            public Builder mergeMsg(PowerZoneFtpMessage powerZoneFtpMessage) {
                PowerZoneFtpMessage powerZoneFtpMessage2;
                SingleFieldBuilderV3<PowerZoneFtpMessage, PowerZoneFtpMessage.Builder, PowerZoneFtpMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(powerZoneFtpMessage);
                } else if ((this.bitField0_ & 1) == 0 || (powerZoneFtpMessage2 = this.msg_) == null || powerZoneFtpMessage2 == PowerZoneFtpMessage.getDefaultInstance()) {
                    this.msg_ = powerZoneFtpMessage;
                } else {
                    getMsgBuilder().mergeFrom(powerZoneFtpMessage);
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

            public Builder setMsg(PowerZoneFtpMessage.Builder builder) {
                SingleFieldBuilderV3<PowerZoneFtpMessage, PowerZoneFtpMessage.Builder, PowerZoneFtpMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
            public PowerZoneFtpRequest getDefaultInstanceForType() {
                return PowerZoneFtpRequest.getDefaultInstance();
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

            public Builder setMsg(PowerZoneFtpMessage powerZoneFtpMessage) {
                SingleFieldBuilderV3<PowerZoneFtpMessage, PowerZoneFtpMessage.Builder, PowerZoneFtpMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 == null) {
                    powerZoneFtpMessage.getClass();
                    this.msg_ = powerZoneFtpMessage;
                } else {
                    singleFieldBuilderV3.setMessage(powerZoneFtpMessage);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PowerZoneFtpRequest) {
                    return mergeFrom((PowerZoneFtpRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PowerZoneFtpRequest powerZoneFtpRequest) {
                if (powerZoneFtpRequest == PowerZoneFtpRequest.getDefaultInstance()) {
                    return this;
                }
                if (powerZoneFtpRequest.hasMsg()) {
                    mergeMsg(powerZoneFtpRequest.getMsg());
                }
                mergeUnknownFields(powerZoneFtpRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PowerZoneFtpRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ PowerZoneFtpRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private PowerZoneFtpRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PowerZoneFtpRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneFtpRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PowerZoneFtpRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PowerZoneFtpRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PowerZoneFtpRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PowerZoneFtpRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PowerZoneFtpRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PowerZoneFtpRequest parseFrom(InputStream inputStream) {
            return (PowerZoneFtpRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PowerZoneFtpRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneFtpRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PowerZoneFtpRequest parseFrom(CodedInputStream codedInputStream) {
            return (PowerZoneFtpRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PowerZoneFtpRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneFtpRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PowerZoneFtpResponse extends GeneratedMessageV3 implements PowerZoneFtpResponseOrBuilder {
        public static final int MSG_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private PowerZoneFtpMessage msg_;
        private static final PowerZoneFtpResponse DEFAULT_INSTANCE = new PowerZoneFtpResponse();

        @Deprecated
        public static final Parser<PowerZoneFtpResponse> PARSER = new AbstractParser<PowerZoneFtpResponse>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneFtpResponse.1
            @Override // com.google.protobuf.Parser
            public PowerZoneFtpResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PowerZoneFtpResponse.newBuilder();
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

        private PowerZoneFtpResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PowerZoneFtpResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpResponse_descriptor;
        }

        public static Builder newBuilder(PowerZoneFtpResponse powerZoneFtpResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(powerZoneFtpResponse);
        }

        public static PowerZoneFtpResponse parseDelimitedFrom(InputStream inputStream) {
            return (PowerZoneFtpResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PowerZoneFtpResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PowerZoneFtpResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PowerZoneFtpResponse)) {
                return super.equals(obj);
            }
            PowerZoneFtpResponse powerZoneFtpResponse = (PowerZoneFtpResponse) obj;
            if (hasMsg() != powerZoneFtpResponse.hasMsg()) {
                return false;
            }
            return (!hasMsg() || getMsg().equals(powerZoneFtpResponse.getMsg())) && getUnknownFields().equals(powerZoneFtpResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneFtpResponseOrBuilder
        public PowerZoneFtpMessage getMsg() {
            PowerZoneFtpMessage powerZoneFtpMessage = this.msg_;
            return powerZoneFtpMessage == null ? PowerZoneFtpMessage.getDefaultInstance() : powerZoneFtpMessage;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneFtpResponseOrBuilder
        public PowerZoneFtpMessageOrBuilder getMsgOrBuilder() {
            PowerZoneFtpMessage powerZoneFtpMessage = this.msg_;
            return powerZoneFtpMessage == null ? PowerZoneFtpMessage.getDefaultInstance() : powerZoneFtpMessage;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PowerZoneFtpResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneFtpResponseOrBuilder
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
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(PowerZoneFtpResponse.class, Builder.class);
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
            return new PowerZoneFtpResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PowerZoneFtpResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<PowerZoneFtpMessage, PowerZoneFtpMessage.Builder, PowerZoneFtpMessageOrBuilder> msgBuilder_;
            private PowerZoneFtpMessage msg_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(PowerZoneFtpResponse powerZoneFtpResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<PowerZoneFtpMessage, PowerZoneFtpMessage.Builder, PowerZoneFtpMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                    powerZoneFtpResponse.msg_ = singleFieldBuilderV3 == null ? this.msg_ : (PowerZoneFtpMessage) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                powerZoneFtpResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpResponse_descriptor;
            }

            private SingleFieldBuilderV3<PowerZoneFtpMessage, PowerZoneFtpMessage.Builder, PowerZoneFtpMessageOrBuilder> getMsgFieldBuilder() {
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
            public PowerZoneFtpResponse build() {
                PowerZoneFtpResponse powerZoneFtpResponseBuildPartial = buildPartial();
                if (powerZoneFtpResponseBuildPartial.isInitialized()) {
                    return powerZoneFtpResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) powerZoneFtpResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PowerZoneFtpResponse buildPartial() {
                PowerZoneFtpResponse powerZoneFtpResponse = new PowerZoneFtpResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(powerZoneFtpResponse);
                }
                onBuilt();
                return powerZoneFtpResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.msg_ = null;
                SingleFieldBuilderV3<PowerZoneFtpMessage, PowerZoneFtpMessage.Builder, PowerZoneFtpMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                SingleFieldBuilderV3<PowerZoneFtpMessage, PowerZoneFtpMessage.Builder, PowerZoneFtpMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneFtpResponseOrBuilder
            public PowerZoneFtpMessage getMsg() {
                SingleFieldBuilderV3<PowerZoneFtpMessage, PowerZoneFtpMessage.Builder, PowerZoneFtpMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneFtpMessage) singleFieldBuilderV3.getMessage();
                }
                PowerZoneFtpMessage powerZoneFtpMessage = this.msg_;
                return powerZoneFtpMessage == null ? PowerZoneFtpMessage.getDefaultInstance() : powerZoneFtpMessage;
            }

            public PowerZoneFtpMessage.Builder getMsgBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (PowerZoneFtpMessage.Builder) getMsgFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneFtpResponseOrBuilder
            public PowerZoneFtpMessageOrBuilder getMsgOrBuilder() {
                SingleFieldBuilderV3<PowerZoneFtpMessage, PowerZoneFtpMessage.Builder, PowerZoneFtpMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneFtpMessageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PowerZoneFtpMessage powerZoneFtpMessage = this.msg_;
                return powerZoneFtpMessage == null ? PowerZoneFtpMessage.getDefaultInstance() : powerZoneFtpMessage;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneFtpResponseOrBuilder
            public boolean hasMsg() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneFtpResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(PowerZoneFtpResponse.class, Builder.class);
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

            public Builder mergeMsg(PowerZoneFtpMessage powerZoneFtpMessage) {
                PowerZoneFtpMessage powerZoneFtpMessage2;
                SingleFieldBuilderV3<PowerZoneFtpMessage, PowerZoneFtpMessage.Builder, PowerZoneFtpMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(powerZoneFtpMessage);
                } else if ((this.bitField0_ & 1) == 0 || (powerZoneFtpMessage2 = this.msg_) == null || powerZoneFtpMessage2 == PowerZoneFtpMessage.getDefaultInstance()) {
                    this.msg_ = powerZoneFtpMessage;
                } else {
                    getMsgBuilder().mergeFrom(powerZoneFtpMessage);
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

            public Builder setMsg(PowerZoneFtpMessage.Builder builder) {
                SingleFieldBuilderV3<PowerZoneFtpMessage, PowerZoneFtpMessage.Builder, PowerZoneFtpMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
            public PowerZoneFtpResponse getDefaultInstanceForType() {
                return PowerZoneFtpResponse.getDefaultInstance();
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

            public Builder setMsg(PowerZoneFtpMessage powerZoneFtpMessage) {
                SingleFieldBuilderV3<PowerZoneFtpMessage, PowerZoneFtpMessage.Builder, PowerZoneFtpMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 == null) {
                    powerZoneFtpMessage.getClass();
                    this.msg_ = powerZoneFtpMessage;
                } else {
                    singleFieldBuilderV3.setMessage(powerZoneFtpMessage);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PowerZoneFtpResponse) {
                    return mergeFrom((PowerZoneFtpResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PowerZoneFtpResponse powerZoneFtpResponse) {
                if (powerZoneFtpResponse == PowerZoneFtpResponse.getDefaultInstance()) {
                    return this;
                }
                if (powerZoneFtpResponse.hasMsg()) {
                    mergeMsg(powerZoneFtpResponse.getMsg());
                }
                mergeUnknownFields(powerZoneFtpResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PowerZoneFtpResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ PowerZoneFtpResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private PowerZoneFtpResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PowerZoneFtpResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneFtpResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PowerZoneFtpResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PowerZoneFtpResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PowerZoneFtpResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PowerZoneFtpResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PowerZoneFtpResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PowerZoneFtpResponse parseFrom(InputStream inputStream) {
            return (PowerZoneFtpResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PowerZoneFtpResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneFtpResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PowerZoneFtpResponse parseFrom(CodedInputStream codedInputStream) {
            return (PowerZoneFtpResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PowerZoneFtpResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneFtpResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PowerZoneManualThresholdsMessage extends GeneratedMessageV3 implements PowerZoneManualThresholdsMessageOrBuilder {
        private static final PowerZoneManualThresholdsMessage DEFAULT_INSTANCE = new PowerZoneManualThresholdsMessage();

        @Deprecated
        public static final Parser<PowerZoneManualThresholdsMessage> PARSER = new AbstractParser<PowerZoneManualThresholdsMessage>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneManualThresholdsMessage.1
            @Override // com.google.protobuf.Parser
            public PowerZoneManualThresholdsMessage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PowerZoneManualThresholdsMessage.newBuilder();
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
        public static final int ZONE_UPPER_MILLI_WATTS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private Internal.IntList zoneUpperMilliWatts_;

        private PowerZoneManualThresholdsMessage() {
            this.zoneUpperMilliWatts_ = GeneratedMessageV3.emptyIntList();
            this.memoizedIsInitialized = (byte) -1;
            this.zoneUpperMilliWatts_ = GeneratedMessageV3.emptyIntList();
        }

        public static PowerZoneManualThresholdsMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsMessage_descriptor;
        }

        public static Builder newBuilder(PowerZoneManualThresholdsMessage powerZoneManualThresholdsMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(powerZoneManualThresholdsMessage);
        }

        public static PowerZoneManualThresholdsMessage parseDelimitedFrom(InputStream inputStream) {
            return (PowerZoneManualThresholdsMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PowerZoneManualThresholdsMessage parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PowerZoneManualThresholdsMessage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PowerZoneManualThresholdsMessage)) {
                return super.equals(obj);
            }
            PowerZoneManualThresholdsMessage powerZoneManualThresholdsMessage = (PowerZoneManualThresholdsMessage) obj;
            return getZoneUpperMilliWattsList().equals(powerZoneManualThresholdsMessage.getZoneUpperMilliWattsList()) && getUnknownFields().equals(powerZoneManualThresholdsMessage.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PowerZoneManualThresholdsMessage> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iB = 0;
            for (int i15 = 0; i15 < this.zoneUpperMilliWatts_.size(); i15++) {
                iB = f3.b(this.zoneUpperMilliWatts_, i15, iB);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + getZoneUpperMilliWattsList().size() + iB;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneManualThresholdsMessageOrBuilder
        public int getZoneUpperMilliWatts(int i14) {
            return this.zoneUpperMilliWatts_.getInt(i14);
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneManualThresholdsMessageOrBuilder
        public int getZoneUpperMilliWattsCount() {
            return this.zoneUpperMilliWatts_.size();
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneManualThresholdsMessageOrBuilder
        public List<Integer> getZoneUpperMilliWattsList() {
            return this.zoneUpperMilliWatts_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getZoneUpperMilliWattsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getZoneUpperMilliWattsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(PowerZoneManualThresholdsMessage.class, Builder.class);
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
            return new PowerZoneManualThresholdsMessage();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iC = 0;
            while (iC < this.zoneUpperMilliWatts_.size()) {
                iC = f3.c(this.zoneUpperMilliWatts_, iC, codedOutputStream, 1, iC, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PowerZoneManualThresholdsMessageOrBuilder {
            private int bitField0_;
            private Internal.IntList zoneUpperMilliWatts_;

            private Builder() {
                this.zoneUpperMilliWatts_ = GeneratedMessageV3.emptyIntList();
            }

            private void buildPartial0(PowerZoneManualThresholdsMessage powerZoneManualThresholdsMessage) {
                if ((this.bitField0_ & 1) != 0) {
                    this.zoneUpperMilliWatts_.makeImmutable();
                    powerZoneManualThresholdsMessage.zoneUpperMilliWatts_ = this.zoneUpperMilliWatts_;
                }
            }

            private void ensureZoneUpperMilliWattsIsMutable() {
                if (!this.zoneUpperMilliWatts_.isModifiable()) {
                    this.zoneUpperMilliWatts_ = (Internal.IntList) GeneratedMessageV3.makeMutableCopy(this.zoneUpperMilliWatts_);
                }
                this.bitField0_ |= 1;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsMessage_descriptor;
            }

            public Builder addAllZoneUpperMilliWatts(Iterable<? extends Integer> iterable) {
                ensureZoneUpperMilliWattsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.zoneUpperMilliWatts_);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addZoneUpperMilliWatts(int i14) {
                ensureZoneUpperMilliWattsIsMutable();
                this.zoneUpperMilliWatts_.addInt(i14);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PowerZoneManualThresholdsMessage build() {
                PowerZoneManualThresholdsMessage powerZoneManualThresholdsMessageBuildPartial = buildPartial();
                if (powerZoneManualThresholdsMessageBuildPartial.isInitialized()) {
                    return powerZoneManualThresholdsMessageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) powerZoneManualThresholdsMessageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PowerZoneManualThresholdsMessage buildPartial() {
                PowerZoneManualThresholdsMessage powerZoneManualThresholdsMessage = new PowerZoneManualThresholdsMessage(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(powerZoneManualThresholdsMessage);
                }
                onBuilt();
                return powerZoneManualThresholdsMessage;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.zoneUpperMilliWatts_ = GeneratedMessageV3.emptyIntList();
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

            public Builder clearZoneUpperMilliWatts() {
                this.zoneUpperMilliWatts_ = GeneratedMessageV3.emptyIntList();
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
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsMessage_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneManualThresholdsMessageOrBuilder
            public int getZoneUpperMilliWatts(int i14) {
                return this.zoneUpperMilliWatts_.getInt(i14);
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneManualThresholdsMessageOrBuilder
            public int getZoneUpperMilliWattsCount() {
                return this.zoneUpperMilliWatts_.size();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneManualThresholdsMessageOrBuilder
            public List<Integer> getZoneUpperMilliWattsList() {
                this.zoneUpperMilliWatts_.makeImmutable();
                return this.zoneUpperMilliWatts_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(PowerZoneManualThresholdsMessage.class, Builder.class);
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
                                    int uInt32 = codedInputStream.readUInt32();
                                    ensureZoneUpperMilliWattsIsMutable();
                                    this.zoneUpperMilliWatts_.addInt(uInt32);
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    ensureZoneUpperMilliWattsIsMutable();
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.zoneUpperMilliWatts_.addInt(codedInputStream.readUInt32());
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setZoneUpperMilliWatts(int i14, int i15) {
                ensureZoneUpperMilliWattsIsMutable();
                this.zoneUpperMilliWatts_.setInt(i14, i15);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public PowerZoneManualThresholdsMessage getDefaultInstanceForType() {
                return PowerZoneManualThresholdsMessage.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.zoneUpperMilliWatts_ = GeneratedMessageV3.emptyIntList();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PowerZoneManualThresholdsMessage) {
                    return mergeFrom((PowerZoneManualThresholdsMessage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PowerZoneManualThresholdsMessage powerZoneManualThresholdsMessage) {
                if (powerZoneManualThresholdsMessage == PowerZoneManualThresholdsMessage.getDefaultInstance()) {
                    return this;
                }
                if (!powerZoneManualThresholdsMessage.zoneUpperMilliWatts_.isEmpty()) {
                    if (this.zoneUpperMilliWatts_.isEmpty()) {
                        Internal.IntList intList = powerZoneManualThresholdsMessage.zoneUpperMilliWatts_;
                        this.zoneUpperMilliWatts_ = intList;
                        intList.makeImmutable();
                        this.bitField0_ |= 1;
                    } else {
                        ensureZoneUpperMilliWattsIsMutable();
                        this.zoneUpperMilliWatts_.addAll(powerZoneManualThresholdsMessage.zoneUpperMilliWatts_);
                    }
                    onChanged();
                }
                mergeUnknownFields(powerZoneManualThresholdsMessage.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PowerZoneManualThresholdsMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static PowerZoneManualThresholdsMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneManualThresholdsMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PowerZoneManualThresholdsMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PowerZoneManualThresholdsMessage parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PowerZoneManualThresholdsMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PowerZoneManualThresholdsMessage parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PowerZoneManualThresholdsMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PowerZoneManualThresholdsMessage parseFrom(InputStream inputStream) {
            return (PowerZoneManualThresholdsMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PowerZoneManualThresholdsMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneManualThresholdsMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PowerZoneManualThresholdsMessage parseFrom(CodedInputStream codedInputStream) {
            return (PowerZoneManualThresholdsMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private PowerZoneManualThresholdsMessage(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.zoneUpperMilliWatts_ = GeneratedMessageV3.emptyIntList();
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PowerZoneManualThresholdsMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneManualThresholdsMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ PowerZoneManualThresholdsMessage(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class PowerZoneManualThresholdsRequest extends GeneratedMessageV3 implements PowerZoneManualThresholdsRequestOrBuilder {
        public static final int MSG_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private PowerZoneManualThresholdsMessage msg_;
        private static final PowerZoneManualThresholdsRequest DEFAULT_INSTANCE = new PowerZoneManualThresholdsRequest();

        @Deprecated
        public static final Parser<PowerZoneManualThresholdsRequest> PARSER = new AbstractParser<PowerZoneManualThresholdsRequest>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneManualThresholdsRequest.1
            @Override // com.google.protobuf.Parser
            public PowerZoneManualThresholdsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PowerZoneManualThresholdsRequest.newBuilder();
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

        private PowerZoneManualThresholdsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PowerZoneManualThresholdsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsRequest_descriptor;
        }

        public static Builder newBuilder(PowerZoneManualThresholdsRequest powerZoneManualThresholdsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(powerZoneManualThresholdsRequest);
        }

        public static PowerZoneManualThresholdsRequest parseDelimitedFrom(InputStream inputStream) {
            return (PowerZoneManualThresholdsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PowerZoneManualThresholdsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PowerZoneManualThresholdsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PowerZoneManualThresholdsRequest)) {
                return super.equals(obj);
            }
            PowerZoneManualThresholdsRequest powerZoneManualThresholdsRequest = (PowerZoneManualThresholdsRequest) obj;
            if (hasMsg() != powerZoneManualThresholdsRequest.hasMsg()) {
                return false;
            }
            return (!hasMsg() || getMsg().equals(powerZoneManualThresholdsRequest.getMsg())) && getUnknownFields().equals(powerZoneManualThresholdsRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneManualThresholdsRequestOrBuilder
        public PowerZoneManualThresholdsMessage getMsg() {
            PowerZoneManualThresholdsMessage powerZoneManualThresholdsMessage = this.msg_;
            return powerZoneManualThresholdsMessage == null ? PowerZoneManualThresholdsMessage.getDefaultInstance() : powerZoneManualThresholdsMessage;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneManualThresholdsRequestOrBuilder
        public PowerZoneManualThresholdsMessageOrBuilder getMsgOrBuilder() {
            PowerZoneManualThresholdsMessage powerZoneManualThresholdsMessage = this.msg_;
            return powerZoneManualThresholdsMessage == null ? PowerZoneManualThresholdsMessage.getDefaultInstance() : powerZoneManualThresholdsMessage;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PowerZoneManualThresholdsRequest> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneManualThresholdsRequestOrBuilder
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
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(PowerZoneManualThresholdsRequest.class, Builder.class);
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
            return new PowerZoneManualThresholdsRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PowerZoneManualThresholdsRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<PowerZoneManualThresholdsMessage, PowerZoneManualThresholdsMessage.Builder, PowerZoneManualThresholdsMessageOrBuilder> msgBuilder_;
            private PowerZoneManualThresholdsMessage msg_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(PowerZoneManualThresholdsRequest powerZoneManualThresholdsRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<PowerZoneManualThresholdsMessage, PowerZoneManualThresholdsMessage.Builder, PowerZoneManualThresholdsMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                    powerZoneManualThresholdsRequest.msg_ = singleFieldBuilderV3 == null ? this.msg_ : (PowerZoneManualThresholdsMessage) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                powerZoneManualThresholdsRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsRequest_descriptor;
            }

            private SingleFieldBuilderV3<PowerZoneManualThresholdsMessage, PowerZoneManualThresholdsMessage.Builder, PowerZoneManualThresholdsMessageOrBuilder> getMsgFieldBuilder() {
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
            public PowerZoneManualThresholdsRequest build() {
                PowerZoneManualThresholdsRequest powerZoneManualThresholdsRequestBuildPartial = buildPartial();
                if (powerZoneManualThresholdsRequestBuildPartial.isInitialized()) {
                    return powerZoneManualThresholdsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) powerZoneManualThresholdsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PowerZoneManualThresholdsRequest buildPartial() {
                PowerZoneManualThresholdsRequest powerZoneManualThresholdsRequest = new PowerZoneManualThresholdsRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(powerZoneManualThresholdsRequest);
                }
                onBuilt();
                return powerZoneManualThresholdsRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.msg_ = null;
                SingleFieldBuilderV3<PowerZoneManualThresholdsMessage, PowerZoneManualThresholdsMessage.Builder, PowerZoneManualThresholdsMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                SingleFieldBuilderV3<PowerZoneManualThresholdsMessage, PowerZoneManualThresholdsMessage.Builder, PowerZoneManualThresholdsMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneManualThresholdsRequestOrBuilder
            public PowerZoneManualThresholdsMessage getMsg() {
                SingleFieldBuilderV3<PowerZoneManualThresholdsMessage, PowerZoneManualThresholdsMessage.Builder, PowerZoneManualThresholdsMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneManualThresholdsMessage) singleFieldBuilderV3.getMessage();
                }
                PowerZoneManualThresholdsMessage powerZoneManualThresholdsMessage = this.msg_;
                return powerZoneManualThresholdsMessage == null ? PowerZoneManualThresholdsMessage.getDefaultInstance() : powerZoneManualThresholdsMessage;
            }

            public PowerZoneManualThresholdsMessage.Builder getMsgBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (PowerZoneManualThresholdsMessage.Builder) getMsgFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneManualThresholdsRequestOrBuilder
            public PowerZoneManualThresholdsMessageOrBuilder getMsgOrBuilder() {
                SingleFieldBuilderV3<PowerZoneManualThresholdsMessage, PowerZoneManualThresholdsMessage.Builder, PowerZoneManualThresholdsMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneManualThresholdsMessageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PowerZoneManualThresholdsMessage powerZoneManualThresholdsMessage = this.msg_;
                return powerZoneManualThresholdsMessage == null ? PowerZoneManualThresholdsMessage.getDefaultInstance() : powerZoneManualThresholdsMessage;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneManualThresholdsRequestOrBuilder
            public boolean hasMsg() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(PowerZoneManualThresholdsRequest.class, Builder.class);
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

            public Builder mergeMsg(PowerZoneManualThresholdsMessage powerZoneManualThresholdsMessage) {
                PowerZoneManualThresholdsMessage powerZoneManualThresholdsMessage2;
                SingleFieldBuilderV3<PowerZoneManualThresholdsMessage, PowerZoneManualThresholdsMessage.Builder, PowerZoneManualThresholdsMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(powerZoneManualThresholdsMessage);
                } else if ((this.bitField0_ & 1) == 0 || (powerZoneManualThresholdsMessage2 = this.msg_) == null || powerZoneManualThresholdsMessage2 == PowerZoneManualThresholdsMessage.getDefaultInstance()) {
                    this.msg_ = powerZoneManualThresholdsMessage;
                } else {
                    getMsgBuilder().mergeFrom(powerZoneManualThresholdsMessage);
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

            public Builder setMsg(PowerZoneManualThresholdsMessage.Builder builder) {
                SingleFieldBuilderV3<PowerZoneManualThresholdsMessage, PowerZoneManualThresholdsMessage.Builder, PowerZoneManualThresholdsMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
            public PowerZoneManualThresholdsRequest getDefaultInstanceForType() {
                return PowerZoneManualThresholdsRequest.getDefaultInstance();
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

            public Builder setMsg(PowerZoneManualThresholdsMessage powerZoneManualThresholdsMessage) {
                SingleFieldBuilderV3<PowerZoneManualThresholdsMessage, PowerZoneManualThresholdsMessage.Builder, PowerZoneManualThresholdsMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 == null) {
                    powerZoneManualThresholdsMessage.getClass();
                    this.msg_ = powerZoneManualThresholdsMessage;
                } else {
                    singleFieldBuilderV3.setMessage(powerZoneManualThresholdsMessage);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PowerZoneManualThresholdsRequest) {
                    return mergeFrom((PowerZoneManualThresholdsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PowerZoneManualThresholdsRequest powerZoneManualThresholdsRequest) {
                if (powerZoneManualThresholdsRequest == PowerZoneManualThresholdsRequest.getDefaultInstance()) {
                    return this;
                }
                if (powerZoneManualThresholdsRequest.hasMsg()) {
                    mergeMsg(powerZoneManualThresholdsRequest.getMsg());
                }
                mergeUnknownFields(powerZoneManualThresholdsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PowerZoneManualThresholdsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ PowerZoneManualThresholdsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private PowerZoneManualThresholdsRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PowerZoneManualThresholdsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneManualThresholdsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PowerZoneManualThresholdsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PowerZoneManualThresholdsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PowerZoneManualThresholdsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PowerZoneManualThresholdsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PowerZoneManualThresholdsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PowerZoneManualThresholdsRequest parseFrom(InputStream inputStream) {
            return (PowerZoneManualThresholdsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PowerZoneManualThresholdsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneManualThresholdsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PowerZoneManualThresholdsRequest parseFrom(CodedInputStream codedInputStream) {
            return (PowerZoneManualThresholdsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PowerZoneManualThresholdsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneManualThresholdsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PowerZoneManualThresholdsResponse extends GeneratedMessageV3 implements PowerZoneManualThresholdsResponseOrBuilder {
        public static final int MSG_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private PowerZoneManualThresholdsMessage msg_;
        private static final PowerZoneManualThresholdsResponse DEFAULT_INSTANCE = new PowerZoneManualThresholdsResponse();

        @Deprecated
        public static final Parser<PowerZoneManualThresholdsResponse> PARSER = new AbstractParser<PowerZoneManualThresholdsResponse>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneManualThresholdsResponse.1
            @Override // com.google.protobuf.Parser
            public PowerZoneManualThresholdsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PowerZoneManualThresholdsResponse.newBuilder();
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

        private PowerZoneManualThresholdsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PowerZoneManualThresholdsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsResponse_descriptor;
        }

        public static Builder newBuilder(PowerZoneManualThresholdsResponse powerZoneManualThresholdsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(powerZoneManualThresholdsResponse);
        }

        public static PowerZoneManualThresholdsResponse parseDelimitedFrom(InputStream inputStream) {
            return (PowerZoneManualThresholdsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PowerZoneManualThresholdsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PowerZoneManualThresholdsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PowerZoneManualThresholdsResponse)) {
                return super.equals(obj);
            }
            PowerZoneManualThresholdsResponse powerZoneManualThresholdsResponse = (PowerZoneManualThresholdsResponse) obj;
            if (hasMsg() != powerZoneManualThresholdsResponse.hasMsg()) {
                return false;
            }
            return (!hasMsg() || getMsg().equals(powerZoneManualThresholdsResponse.getMsg())) && getUnknownFields().equals(powerZoneManualThresholdsResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneManualThresholdsResponseOrBuilder
        public PowerZoneManualThresholdsMessage getMsg() {
            PowerZoneManualThresholdsMessage powerZoneManualThresholdsMessage = this.msg_;
            return powerZoneManualThresholdsMessage == null ? PowerZoneManualThresholdsMessage.getDefaultInstance() : powerZoneManualThresholdsMessage;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneManualThresholdsResponseOrBuilder
        public PowerZoneManualThresholdsMessageOrBuilder getMsgOrBuilder() {
            PowerZoneManualThresholdsMessage powerZoneManualThresholdsMessage = this.msg_;
            return powerZoneManualThresholdsMessage == null ? PowerZoneManualThresholdsMessage.getDefaultInstance() : powerZoneManualThresholdsMessage;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PowerZoneManualThresholdsResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneManualThresholdsResponseOrBuilder
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
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(PowerZoneManualThresholdsResponse.class, Builder.class);
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
            return new PowerZoneManualThresholdsResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PowerZoneManualThresholdsResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<PowerZoneManualThresholdsMessage, PowerZoneManualThresholdsMessage.Builder, PowerZoneManualThresholdsMessageOrBuilder> msgBuilder_;
            private PowerZoneManualThresholdsMessage msg_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(PowerZoneManualThresholdsResponse powerZoneManualThresholdsResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<PowerZoneManualThresholdsMessage, PowerZoneManualThresholdsMessage.Builder, PowerZoneManualThresholdsMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                    powerZoneManualThresholdsResponse.msg_ = singleFieldBuilderV3 == null ? this.msg_ : (PowerZoneManualThresholdsMessage) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                powerZoneManualThresholdsResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsResponse_descriptor;
            }

            private SingleFieldBuilderV3<PowerZoneManualThresholdsMessage, PowerZoneManualThresholdsMessage.Builder, PowerZoneManualThresholdsMessageOrBuilder> getMsgFieldBuilder() {
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
            public PowerZoneManualThresholdsResponse build() {
                PowerZoneManualThresholdsResponse powerZoneManualThresholdsResponseBuildPartial = buildPartial();
                if (powerZoneManualThresholdsResponseBuildPartial.isInitialized()) {
                    return powerZoneManualThresholdsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) powerZoneManualThresholdsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PowerZoneManualThresholdsResponse buildPartial() {
                PowerZoneManualThresholdsResponse powerZoneManualThresholdsResponse = new PowerZoneManualThresholdsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(powerZoneManualThresholdsResponse);
                }
                onBuilt();
                return powerZoneManualThresholdsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.msg_ = null;
                SingleFieldBuilderV3<PowerZoneManualThresholdsMessage, PowerZoneManualThresholdsMessage.Builder, PowerZoneManualThresholdsMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                SingleFieldBuilderV3<PowerZoneManualThresholdsMessage, PowerZoneManualThresholdsMessage.Builder, PowerZoneManualThresholdsMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneManualThresholdsResponseOrBuilder
            public PowerZoneManualThresholdsMessage getMsg() {
                SingleFieldBuilderV3<PowerZoneManualThresholdsMessage, PowerZoneManualThresholdsMessage.Builder, PowerZoneManualThresholdsMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneManualThresholdsMessage) singleFieldBuilderV3.getMessage();
                }
                PowerZoneManualThresholdsMessage powerZoneManualThresholdsMessage = this.msg_;
                return powerZoneManualThresholdsMessage == null ? PowerZoneManualThresholdsMessage.getDefaultInstance() : powerZoneManualThresholdsMessage;
            }

            public PowerZoneManualThresholdsMessage.Builder getMsgBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (PowerZoneManualThresholdsMessage.Builder) getMsgFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneManualThresholdsResponseOrBuilder
            public PowerZoneManualThresholdsMessageOrBuilder getMsgOrBuilder() {
                SingleFieldBuilderV3<PowerZoneManualThresholdsMessage, PowerZoneManualThresholdsMessage.Builder, PowerZoneManualThresholdsMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneManualThresholdsMessageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PowerZoneManualThresholdsMessage powerZoneManualThresholdsMessage = this.msg_;
                return powerZoneManualThresholdsMessage == null ? PowerZoneManualThresholdsMessage.getDefaultInstance() : powerZoneManualThresholdsMessage;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneManualThresholdsResponseOrBuilder
            public boolean hasMsg() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneManualThresholdsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(PowerZoneManualThresholdsResponse.class, Builder.class);
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

            public Builder mergeMsg(PowerZoneManualThresholdsMessage powerZoneManualThresholdsMessage) {
                PowerZoneManualThresholdsMessage powerZoneManualThresholdsMessage2;
                SingleFieldBuilderV3<PowerZoneManualThresholdsMessage, PowerZoneManualThresholdsMessage.Builder, PowerZoneManualThresholdsMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(powerZoneManualThresholdsMessage);
                } else if ((this.bitField0_ & 1) == 0 || (powerZoneManualThresholdsMessage2 = this.msg_) == null || powerZoneManualThresholdsMessage2 == PowerZoneManualThresholdsMessage.getDefaultInstance()) {
                    this.msg_ = powerZoneManualThresholdsMessage;
                } else {
                    getMsgBuilder().mergeFrom(powerZoneManualThresholdsMessage);
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

            public Builder setMsg(PowerZoneManualThresholdsMessage.Builder builder) {
                SingleFieldBuilderV3<PowerZoneManualThresholdsMessage, PowerZoneManualThresholdsMessage.Builder, PowerZoneManualThresholdsMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
            public PowerZoneManualThresholdsResponse getDefaultInstanceForType() {
                return PowerZoneManualThresholdsResponse.getDefaultInstance();
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

            public Builder setMsg(PowerZoneManualThresholdsMessage powerZoneManualThresholdsMessage) {
                SingleFieldBuilderV3<PowerZoneManualThresholdsMessage, PowerZoneManualThresholdsMessage.Builder, PowerZoneManualThresholdsMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 == null) {
                    powerZoneManualThresholdsMessage.getClass();
                    this.msg_ = powerZoneManualThresholdsMessage;
                } else {
                    singleFieldBuilderV3.setMessage(powerZoneManualThresholdsMessage);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PowerZoneManualThresholdsResponse) {
                    return mergeFrom((PowerZoneManualThresholdsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PowerZoneManualThresholdsResponse powerZoneManualThresholdsResponse) {
                if (powerZoneManualThresholdsResponse == PowerZoneManualThresholdsResponse.getDefaultInstance()) {
                    return this;
                }
                if (powerZoneManualThresholdsResponse.hasMsg()) {
                    mergeMsg(powerZoneManualThresholdsResponse.getMsg());
                }
                mergeUnknownFields(powerZoneManualThresholdsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PowerZoneManualThresholdsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ PowerZoneManualThresholdsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private PowerZoneManualThresholdsResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PowerZoneManualThresholdsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneManualThresholdsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PowerZoneManualThresholdsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PowerZoneManualThresholdsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PowerZoneManualThresholdsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PowerZoneManualThresholdsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PowerZoneManualThresholdsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PowerZoneManualThresholdsResponse parseFrom(InputStream inputStream) {
            return (PowerZoneManualThresholdsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PowerZoneManualThresholdsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneManualThresholdsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PowerZoneManualThresholdsResponse parseFrom(CodedInputStream codedInputStream) {
            return (PowerZoneManualThresholdsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PowerZoneManualThresholdsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneManualThresholdsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PowerZoneModeMessage extends GeneratedMessageV3 implements PowerZoneModeMessageOrBuilder {
        public static final int MODE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int mode_;
        private static final PowerZoneModeMessage DEFAULT_INSTANCE = new PowerZoneModeMessage();

        @Deprecated
        public static final Parser<PowerZoneModeMessage> PARSER = new AbstractParser<PowerZoneModeMessage>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneModeMessage.1
            @Override // com.google.protobuf.Parser
            public PowerZoneModeMessage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PowerZoneModeMessage.newBuilder();
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

        private PowerZoneModeMessage(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.mode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PowerZoneModeMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeMessage_descriptor;
        }

        public static Builder newBuilder(PowerZoneModeMessage powerZoneModeMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(powerZoneModeMessage);
        }

        public static PowerZoneModeMessage parseDelimitedFrom(InputStream inputStream) {
            return (PowerZoneModeMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PowerZoneModeMessage parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PowerZoneModeMessage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PowerZoneModeMessage)) {
                return super.equals(obj);
            }
            PowerZoneModeMessage powerZoneModeMessage = (PowerZoneModeMessage) obj;
            if (hasMode() != powerZoneModeMessage.hasMode()) {
                return false;
            }
            return (!hasMode() || this.mode_ == powerZoneModeMessage.mode_) && getUnknownFields().equals(powerZoneModeMessage.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneModeMessageOrBuilder
        public Mode getMode() {
            Mode modeForNumber = Mode.forNumber(this.mode_);
            return modeForNumber == null ? Mode.UNKNOWN : modeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PowerZoneModeMessage> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.mode_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneModeMessageOrBuilder
        public boolean hasMode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMode()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.mode_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(PowerZoneModeMessage.class, Builder.class);
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
            return new PowerZoneModeMessage();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.mode_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PowerZoneModeMessageOrBuilder {
            private int bitField0_;
            private int mode_;

            private Builder() {
                this.mode_ = 0;
            }

            private void buildPartial0(PowerZoneModeMessage powerZoneModeMessage) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    powerZoneModeMessage.mode_ = this.mode_;
                } else {
                    i14 = 0;
                }
                powerZoneModeMessage.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeMessage_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PowerZoneModeMessage build() {
                PowerZoneModeMessage powerZoneModeMessageBuildPartial = buildPartial();
                if (powerZoneModeMessageBuildPartial.isInitialized()) {
                    return powerZoneModeMessageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) powerZoneModeMessageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PowerZoneModeMessage buildPartial() {
                PowerZoneModeMessage powerZoneModeMessage = new PowerZoneModeMessage(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(powerZoneModeMessage);
                }
                onBuilt();
                return powerZoneModeMessage;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.mode_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMode() {
                this.bitField0_ &= -2;
                this.mode_ = 0;
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
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeMessage_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneModeMessageOrBuilder
            public Mode getMode() {
                Mode modeForNumber = Mode.forNumber(this.mode_);
                return modeForNumber == null ? Mode.UNKNOWN : modeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneModeMessageOrBuilder
            public boolean hasMode() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(PowerZoneModeMessage.class, Builder.class);
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
                                    if (Mode.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.mode_ = i14;
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

            public Builder setMode(Mode mode) {
                mode.getClass();
                this.bitField0_ |= 1;
                this.mode_ = mode.getNumber();
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
            public PowerZoneModeMessage getDefaultInstanceForType() {
                return PowerZoneModeMessage.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.mode_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PowerZoneModeMessage) {
                    return mergeFrom((PowerZoneModeMessage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PowerZoneModeMessage powerZoneModeMessage) {
                if (powerZoneModeMessage == PowerZoneModeMessage.getDefaultInstance()) {
                    return this;
                }
                if (powerZoneModeMessage.hasMode()) {
                    setMode(powerZoneModeMessage.getMode());
                }
                mergeUnknownFields(powerZoneModeMessage.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PowerZoneModeMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static PowerZoneModeMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneModeMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PowerZoneModeMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ PowerZoneModeMessage(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static PowerZoneModeMessage parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private PowerZoneModeMessage() {
            this.memoizedIsInitialized = (byte) -1;
            this.mode_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PowerZoneModeMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PowerZoneModeMessage parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PowerZoneModeMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PowerZoneModeMessage parseFrom(InputStream inputStream) {
            return (PowerZoneModeMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PowerZoneModeMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneModeMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PowerZoneModeMessage parseFrom(CodedInputStream codedInputStream) {
            return (PowerZoneModeMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PowerZoneModeMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneModeMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Mode implements ProtocolMessageEnum {
            UNKNOWN(0),
            FTP(1),
            MANUAL_THRESHOLDS(2);

            public static final int FTP_VALUE = 1;
            public static final int MANUAL_THRESHOLDS_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Mode> internalValueMap = new Internal.EnumLiteMap<Mode>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneModeMessage.Mode.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Mode findValueByNumber(int i14) {
                    return Mode.forNumber(i14);
                }
            };
            private static final Mode[] VALUES = values();

            Mode(int i14) {
                this.value = i14;
            }

            public static Mode forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return FTP;
                }
                if (i14 != 2) {
                    return null;
                }
                return MANUAL_THRESHOLDS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return PowerZoneModeMessage.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Mode> internalGetValueMap() {
                return internalValueMap;
            }

            public static Mode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Mode valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class PowerZoneModeRequest extends GeneratedMessageV3 implements PowerZoneModeRequestOrBuilder {
        public static final int MSG_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private PowerZoneModeMessage msg_;
        private static final PowerZoneModeRequest DEFAULT_INSTANCE = new PowerZoneModeRequest();

        @Deprecated
        public static final Parser<PowerZoneModeRequest> PARSER = new AbstractParser<PowerZoneModeRequest>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneModeRequest.1
            @Override // com.google.protobuf.Parser
            public PowerZoneModeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PowerZoneModeRequest.newBuilder();
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

        private PowerZoneModeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PowerZoneModeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeRequest_descriptor;
        }

        public static Builder newBuilder(PowerZoneModeRequest powerZoneModeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(powerZoneModeRequest);
        }

        public static PowerZoneModeRequest parseDelimitedFrom(InputStream inputStream) {
            return (PowerZoneModeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PowerZoneModeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PowerZoneModeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PowerZoneModeRequest)) {
                return super.equals(obj);
            }
            PowerZoneModeRequest powerZoneModeRequest = (PowerZoneModeRequest) obj;
            if (hasMsg() != powerZoneModeRequest.hasMsg()) {
                return false;
            }
            return (!hasMsg() || getMsg().equals(powerZoneModeRequest.getMsg())) && getUnknownFields().equals(powerZoneModeRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneModeRequestOrBuilder
        public PowerZoneModeMessage getMsg() {
            PowerZoneModeMessage powerZoneModeMessage = this.msg_;
            return powerZoneModeMessage == null ? PowerZoneModeMessage.getDefaultInstance() : powerZoneModeMessage;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneModeRequestOrBuilder
        public PowerZoneModeMessageOrBuilder getMsgOrBuilder() {
            PowerZoneModeMessage powerZoneModeMessage = this.msg_;
            return powerZoneModeMessage == null ? PowerZoneModeMessage.getDefaultInstance() : powerZoneModeMessage;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PowerZoneModeRequest> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneModeRequestOrBuilder
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
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(PowerZoneModeRequest.class, Builder.class);
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
            return new PowerZoneModeRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PowerZoneModeRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<PowerZoneModeMessage, PowerZoneModeMessage.Builder, PowerZoneModeMessageOrBuilder> msgBuilder_;
            private PowerZoneModeMessage msg_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(PowerZoneModeRequest powerZoneModeRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<PowerZoneModeMessage, PowerZoneModeMessage.Builder, PowerZoneModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                    powerZoneModeRequest.msg_ = singleFieldBuilderV3 == null ? this.msg_ : (PowerZoneModeMessage) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                powerZoneModeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeRequest_descriptor;
            }

            private SingleFieldBuilderV3<PowerZoneModeMessage, PowerZoneModeMessage.Builder, PowerZoneModeMessageOrBuilder> getMsgFieldBuilder() {
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
            public PowerZoneModeRequest build() {
                PowerZoneModeRequest powerZoneModeRequestBuildPartial = buildPartial();
                if (powerZoneModeRequestBuildPartial.isInitialized()) {
                    return powerZoneModeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) powerZoneModeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PowerZoneModeRequest buildPartial() {
                PowerZoneModeRequest powerZoneModeRequest = new PowerZoneModeRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(powerZoneModeRequest);
                }
                onBuilt();
                return powerZoneModeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.msg_ = null;
                SingleFieldBuilderV3<PowerZoneModeMessage, PowerZoneModeMessage.Builder, PowerZoneModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                SingleFieldBuilderV3<PowerZoneModeMessage, PowerZoneModeMessage.Builder, PowerZoneModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneModeRequestOrBuilder
            public PowerZoneModeMessage getMsg() {
                SingleFieldBuilderV3<PowerZoneModeMessage, PowerZoneModeMessage.Builder, PowerZoneModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneModeMessage) singleFieldBuilderV3.getMessage();
                }
                PowerZoneModeMessage powerZoneModeMessage = this.msg_;
                return powerZoneModeMessage == null ? PowerZoneModeMessage.getDefaultInstance() : powerZoneModeMessage;
            }

            public PowerZoneModeMessage.Builder getMsgBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (PowerZoneModeMessage.Builder) getMsgFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneModeRequestOrBuilder
            public PowerZoneModeMessageOrBuilder getMsgOrBuilder() {
                SingleFieldBuilderV3<PowerZoneModeMessage, PowerZoneModeMessage.Builder, PowerZoneModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneModeMessageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PowerZoneModeMessage powerZoneModeMessage = this.msg_;
                return powerZoneModeMessage == null ? PowerZoneModeMessage.getDefaultInstance() : powerZoneModeMessage;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneModeRequestOrBuilder
            public boolean hasMsg() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(PowerZoneModeRequest.class, Builder.class);
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

            public Builder mergeMsg(PowerZoneModeMessage powerZoneModeMessage) {
                PowerZoneModeMessage powerZoneModeMessage2;
                SingleFieldBuilderV3<PowerZoneModeMessage, PowerZoneModeMessage.Builder, PowerZoneModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(powerZoneModeMessage);
                } else if ((this.bitField0_ & 1) == 0 || (powerZoneModeMessage2 = this.msg_) == null || powerZoneModeMessage2 == PowerZoneModeMessage.getDefaultInstance()) {
                    this.msg_ = powerZoneModeMessage;
                } else {
                    getMsgBuilder().mergeFrom(powerZoneModeMessage);
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

            public Builder setMsg(PowerZoneModeMessage.Builder builder) {
                SingleFieldBuilderV3<PowerZoneModeMessage, PowerZoneModeMessage.Builder, PowerZoneModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
            public PowerZoneModeRequest getDefaultInstanceForType() {
                return PowerZoneModeRequest.getDefaultInstance();
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

            public Builder setMsg(PowerZoneModeMessage powerZoneModeMessage) {
                SingleFieldBuilderV3<PowerZoneModeMessage, PowerZoneModeMessage.Builder, PowerZoneModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 == null) {
                    powerZoneModeMessage.getClass();
                    this.msg_ = powerZoneModeMessage;
                } else {
                    singleFieldBuilderV3.setMessage(powerZoneModeMessage);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PowerZoneModeRequest) {
                    return mergeFrom((PowerZoneModeRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PowerZoneModeRequest powerZoneModeRequest) {
                if (powerZoneModeRequest == PowerZoneModeRequest.getDefaultInstance()) {
                    return this;
                }
                if (powerZoneModeRequest.hasMsg()) {
                    mergeMsg(powerZoneModeRequest.getMsg());
                }
                mergeUnknownFields(powerZoneModeRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PowerZoneModeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ PowerZoneModeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private PowerZoneModeRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PowerZoneModeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneModeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PowerZoneModeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PowerZoneModeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PowerZoneModeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PowerZoneModeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PowerZoneModeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PowerZoneModeRequest parseFrom(InputStream inputStream) {
            return (PowerZoneModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PowerZoneModeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PowerZoneModeRequest parseFrom(CodedInputStream codedInputStream) {
            return (PowerZoneModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PowerZoneModeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PowerZoneModeResponse extends GeneratedMessageV3 implements PowerZoneModeResponseOrBuilder {
        public static final int MSG_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private PowerZoneModeMessage msg_;
        private static final PowerZoneModeResponse DEFAULT_INSTANCE = new PowerZoneModeResponse();

        @Deprecated
        public static final Parser<PowerZoneModeResponse> PARSER = new AbstractParser<PowerZoneModeResponse>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneModeResponse.1
            @Override // com.google.protobuf.Parser
            public PowerZoneModeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PowerZoneModeResponse.newBuilder();
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

        private PowerZoneModeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PowerZoneModeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeResponse_descriptor;
        }

        public static Builder newBuilder(PowerZoneModeResponse powerZoneModeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(powerZoneModeResponse);
        }

        public static PowerZoneModeResponse parseDelimitedFrom(InputStream inputStream) {
            return (PowerZoneModeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PowerZoneModeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PowerZoneModeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PowerZoneModeResponse)) {
                return super.equals(obj);
            }
            PowerZoneModeResponse powerZoneModeResponse = (PowerZoneModeResponse) obj;
            if (hasMsg() != powerZoneModeResponse.hasMsg()) {
                return false;
            }
            return (!hasMsg() || getMsg().equals(powerZoneModeResponse.getMsg())) && getUnknownFields().equals(powerZoneModeResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneModeResponseOrBuilder
        public PowerZoneModeMessage getMsg() {
            PowerZoneModeMessage powerZoneModeMessage = this.msg_;
            return powerZoneModeMessage == null ? PowerZoneModeMessage.getDefaultInstance() : powerZoneModeMessage;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneModeResponseOrBuilder
        public PowerZoneModeMessageOrBuilder getMsgOrBuilder() {
            PowerZoneModeMessage powerZoneModeMessage = this.msg_;
            return powerZoneModeMessage == null ? PowerZoneModeMessage.getDefaultInstance() : powerZoneModeMessage;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PowerZoneModeResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneModeResponseOrBuilder
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
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(PowerZoneModeResponse.class, Builder.class);
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
            return new PowerZoneModeResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PowerZoneModeResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<PowerZoneModeMessage, PowerZoneModeMessage.Builder, PowerZoneModeMessageOrBuilder> msgBuilder_;
            private PowerZoneModeMessage msg_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(PowerZoneModeResponse powerZoneModeResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<PowerZoneModeMessage, PowerZoneModeMessage.Builder, PowerZoneModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                    powerZoneModeResponse.msg_ = singleFieldBuilderV3 == null ? this.msg_ : (PowerZoneModeMessage) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                powerZoneModeResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeResponse_descriptor;
            }

            private SingleFieldBuilderV3<PowerZoneModeMessage, PowerZoneModeMessage.Builder, PowerZoneModeMessageOrBuilder> getMsgFieldBuilder() {
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
            public PowerZoneModeResponse build() {
                PowerZoneModeResponse powerZoneModeResponseBuildPartial = buildPartial();
                if (powerZoneModeResponseBuildPartial.isInitialized()) {
                    return powerZoneModeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) powerZoneModeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PowerZoneModeResponse buildPartial() {
                PowerZoneModeResponse powerZoneModeResponse = new PowerZoneModeResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(powerZoneModeResponse);
                }
                onBuilt();
                return powerZoneModeResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.msg_ = null;
                SingleFieldBuilderV3<PowerZoneModeMessage, PowerZoneModeMessage.Builder, PowerZoneModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                SingleFieldBuilderV3<PowerZoneModeMessage, PowerZoneModeMessage.Builder, PowerZoneModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneModeResponseOrBuilder
            public PowerZoneModeMessage getMsg() {
                SingleFieldBuilderV3<PowerZoneModeMessage, PowerZoneModeMessage.Builder, PowerZoneModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneModeMessage) singleFieldBuilderV3.getMessage();
                }
                PowerZoneModeMessage powerZoneModeMessage = this.msg_;
                return powerZoneModeMessage == null ? PowerZoneModeMessage.getDefaultInstance() : powerZoneModeMessage;
            }

            public PowerZoneModeMessage.Builder getMsgBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (PowerZoneModeMessage.Builder) getMsgFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneModeResponseOrBuilder
            public PowerZoneModeMessageOrBuilder getMsgOrBuilder() {
                SingleFieldBuilderV3<PowerZoneModeMessage, PowerZoneModeMessage.Builder, PowerZoneModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneModeMessageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PowerZoneModeMessage powerZoneModeMessage = this.msg_;
                return powerZoneModeMessage == null ? PowerZoneModeMessage.getDefaultInstance() : powerZoneModeMessage;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.PowerZoneModeResponseOrBuilder
            public boolean hasMsg() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_PowerZoneModeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(PowerZoneModeResponse.class, Builder.class);
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

            public Builder mergeMsg(PowerZoneModeMessage powerZoneModeMessage) {
                PowerZoneModeMessage powerZoneModeMessage2;
                SingleFieldBuilderV3<PowerZoneModeMessage, PowerZoneModeMessage.Builder, PowerZoneModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(powerZoneModeMessage);
                } else if ((this.bitField0_ & 1) == 0 || (powerZoneModeMessage2 = this.msg_) == null || powerZoneModeMessage2 == PowerZoneModeMessage.getDefaultInstance()) {
                    this.msg_ = powerZoneModeMessage;
                } else {
                    getMsgBuilder().mergeFrom(powerZoneModeMessage);
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

            public Builder setMsg(PowerZoneModeMessage.Builder builder) {
                SingleFieldBuilderV3<PowerZoneModeMessage, PowerZoneModeMessage.Builder, PowerZoneModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
            public PowerZoneModeResponse getDefaultInstanceForType() {
                return PowerZoneModeResponse.getDefaultInstance();
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

            public Builder setMsg(PowerZoneModeMessage powerZoneModeMessage) {
                SingleFieldBuilderV3<PowerZoneModeMessage, PowerZoneModeMessage.Builder, PowerZoneModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 == null) {
                    powerZoneModeMessage.getClass();
                    this.msg_ = powerZoneModeMessage;
                } else {
                    singleFieldBuilderV3.setMessage(powerZoneModeMessage);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PowerZoneModeResponse) {
                    return mergeFrom((PowerZoneModeResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PowerZoneModeResponse powerZoneModeResponse) {
                if (powerZoneModeResponse == PowerZoneModeResponse.getDefaultInstance()) {
                    return this;
                }
                if (powerZoneModeResponse.hasMsg()) {
                    mergeMsg(powerZoneModeResponse.getMsg());
                }
                mergeUnknownFields(powerZoneModeResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PowerZoneModeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ PowerZoneModeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private PowerZoneModeResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PowerZoneModeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneModeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PowerZoneModeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PowerZoneModeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PowerZoneModeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PowerZoneModeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PowerZoneModeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PowerZoneModeResponse parseFrom(InputStream inputStream) {
            return (PowerZoneModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PowerZoneModeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PowerZoneModeResponse parseFrom(CodedInputStream codedInputStream) {
            return (PowerZoneModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PowerZoneModeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerZoneModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int EDGE_MOUNT_STATUS_NOTIFICATION_FIELD_NUMBER = 11;
        public static final int EDGE_MOUNT_STATUS_REQUEST_FIELD_NUMBER = 12;
        public static final int EDGE_MOUNT_STATUS_RESPONSE_FIELD_NUMBER = 13;
        public static final int PEDAL_POWER_NOTIFICATION_FIELD_NUMBER = 10;
        public static final int POWER_ZONE_FTP_REQUEST_FIELD_NUMBER = 1;
        public static final int POWER_ZONE_FTP_RESPONSE_FIELD_NUMBER = 2;
        public static final int POWER_ZONE_MANUAL_THRESHOLDS_REQUEST_FIELD_NUMBER = 3;
        public static final int POWER_ZONE_MANUAL_THRESHOLDS_RESPONSE_FIELD_NUMBER = 4;
        public static final int POWER_ZONE_MODE_REQUEST_FIELD_NUMBER = 5;
        public static final int POWER_ZONE_MODE_RESPONSE_FIELD_NUMBER = 6;
        public static final int TRAINER_POWER_MODE_NOTIFICATION_FIELD_NUMBER = 7;
        public static final int TRAINER_POWER_MODE_REQUEST_FIELD_NUMBER = 8;
        public static final int TRAINER_POWER_MODE_RESPONSE_FIELD_NUMBER = 9;
        public static final int TRAINER_VIRTUAL_SPEED_NOTIFICATION_FIELD_NUMBER = 14;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private EdgeMountStatusNotification edgeMountStatusNotification_;
        private EdgeMountStatusRequest edgeMountStatusRequest_;
        private EdgeMountStatusResponse edgeMountStatusResponse_;
        private byte memoizedIsInitialized;
        private PedalPowerNotification pedalPowerNotification_;
        private PowerZoneFtpRequest powerZoneFtpRequest_;
        private PowerZoneFtpResponse powerZoneFtpResponse_;
        private PowerZoneManualThresholdsRequest powerZoneManualThresholdsRequest_;
        private PowerZoneManualThresholdsResponse powerZoneManualThresholdsResponse_;
        private PowerZoneModeRequest powerZoneModeRequest_;
        private PowerZoneModeResponse powerZoneModeResponse_;
        private TrainerPowerModeNotification trainerPowerModeNotification_;
        private TrainerPowerModeRequest trainerPowerModeRequest_;
        private TrainerPowerModeResponse trainerPowerModeResponse_;
        private TrainerVirtualSpeedNotification trainerVirtualSpeedNotification_;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.Service.1
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
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_Service_descriptor;
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
            if (hasPowerZoneFtpRequest() != service.hasPowerZoneFtpRequest()) {
                return false;
            }
            if ((hasPowerZoneFtpRequest() && !getPowerZoneFtpRequest().equals(service.getPowerZoneFtpRequest())) || hasPowerZoneFtpResponse() != service.hasPowerZoneFtpResponse()) {
                return false;
            }
            if ((hasPowerZoneFtpResponse() && !getPowerZoneFtpResponse().equals(service.getPowerZoneFtpResponse())) || hasPowerZoneManualThresholdsRequest() != service.hasPowerZoneManualThresholdsRequest()) {
                return false;
            }
            if ((hasPowerZoneManualThresholdsRequest() && !getPowerZoneManualThresholdsRequest().equals(service.getPowerZoneManualThresholdsRequest())) || hasPowerZoneManualThresholdsResponse() != service.hasPowerZoneManualThresholdsResponse()) {
                return false;
            }
            if ((hasPowerZoneManualThresholdsResponse() && !getPowerZoneManualThresholdsResponse().equals(service.getPowerZoneManualThresholdsResponse())) || hasPowerZoneModeRequest() != service.hasPowerZoneModeRequest()) {
                return false;
            }
            if ((hasPowerZoneModeRequest() && !getPowerZoneModeRequest().equals(service.getPowerZoneModeRequest())) || hasPowerZoneModeResponse() != service.hasPowerZoneModeResponse()) {
                return false;
            }
            if ((hasPowerZoneModeResponse() && !getPowerZoneModeResponse().equals(service.getPowerZoneModeResponse())) || hasTrainerPowerModeNotification() != service.hasTrainerPowerModeNotification()) {
                return false;
            }
            if ((hasTrainerPowerModeNotification() && !getTrainerPowerModeNotification().equals(service.getTrainerPowerModeNotification())) || hasTrainerPowerModeRequest() != service.hasTrainerPowerModeRequest()) {
                return false;
            }
            if ((hasTrainerPowerModeRequest() && !getTrainerPowerModeRequest().equals(service.getTrainerPowerModeRequest())) || hasTrainerPowerModeResponse() != service.hasTrainerPowerModeResponse()) {
                return false;
            }
            if ((hasTrainerPowerModeResponse() && !getTrainerPowerModeResponse().equals(service.getTrainerPowerModeResponse())) || hasPedalPowerNotification() != service.hasPedalPowerNotification()) {
                return false;
            }
            if ((hasPedalPowerNotification() && !getPedalPowerNotification().equals(service.getPedalPowerNotification())) || hasEdgeMountStatusNotification() != service.hasEdgeMountStatusNotification()) {
                return false;
            }
            if ((hasEdgeMountStatusNotification() && !getEdgeMountStatusNotification().equals(service.getEdgeMountStatusNotification())) || hasEdgeMountStatusRequest() != service.hasEdgeMountStatusRequest()) {
                return false;
            }
            if ((hasEdgeMountStatusRequest() && !getEdgeMountStatusRequest().equals(service.getEdgeMountStatusRequest())) || hasEdgeMountStatusResponse() != service.hasEdgeMountStatusResponse()) {
                return false;
            }
            if ((!hasEdgeMountStatusResponse() || getEdgeMountStatusResponse().equals(service.getEdgeMountStatusResponse())) && hasTrainerVirtualSpeedNotification() == service.hasTrainerVirtualSpeedNotification()) {
                return (!hasTrainerVirtualSpeedNotification() || getTrainerVirtualSpeedNotification().equals(service.getTrainerVirtualSpeedNotification())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public EdgeMountStatusNotification getEdgeMountStatusNotification() {
            EdgeMountStatusNotification edgeMountStatusNotification = this.edgeMountStatusNotification_;
            return edgeMountStatusNotification == null ? EdgeMountStatusNotification.getDefaultInstance() : edgeMountStatusNotification;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public EdgeMountStatusNotificationOrBuilder getEdgeMountStatusNotificationOrBuilder() {
            EdgeMountStatusNotification edgeMountStatusNotification = this.edgeMountStatusNotification_;
            return edgeMountStatusNotification == null ? EdgeMountStatusNotification.getDefaultInstance() : edgeMountStatusNotification;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public EdgeMountStatusRequest getEdgeMountStatusRequest() {
            EdgeMountStatusRequest edgeMountStatusRequest = this.edgeMountStatusRequest_;
            return edgeMountStatusRequest == null ? EdgeMountStatusRequest.getDefaultInstance() : edgeMountStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public EdgeMountStatusRequestOrBuilder getEdgeMountStatusRequestOrBuilder() {
            EdgeMountStatusRequest edgeMountStatusRequest = this.edgeMountStatusRequest_;
            return edgeMountStatusRequest == null ? EdgeMountStatusRequest.getDefaultInstance() : edgeMountStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public EdgeMountStatusResponse getEdgeMountStatusResponse() {
            EdgeMountStatusResponse edgeMountStatusResponse = this.edgeMountStatusResponse_;
            return edgeMountStatusResponse == null ? EdgeMountStatusResponse.getDefaultInstance() : edgeMountStatusResponse;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public EdgeMountStatusResponseOrBuilder getEdgeMountStatusResponseOrBuilder() {
            EdgeMountStatusResponse edgeMountStatusResponse = this.edgeMountStatusResponse_;
            return edgeMountStatusResponse == null ? EdgeMountStatusResponse.getDefaultInstance() : edgeMountStatusResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Service> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public PedalPowerNotification getPedalPowerNotification() {
            PedalPowerNotification pedalPowerNotification = this.pedalPowerNotification_;
            return pedalPowerNotification == null ? PedalPowerNotification.getDefaultInstance() : pedalPowerNotification;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public PedalPowerNotificationOrBuilder getPedalPowerNotificationOrBuilder() {
            PedalPowerNotification pedalPowerNotification = this.pedalPowerNotification_;
            return pedalPowerNotification == null ? PedalPowerNotification.getDefaultInstance() : pedalPowerNotification;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public PowerZoneFtpRequest getPowerZoneFtpRequest() {
            PowerZoneFtpRequest powerZoneFtpRequest = this.powerZoneFtpRequest_;
            return powerZoneFtpRequest == null ? PowerZoneFtpRequest.getDefaultInstance() : powerZoneFtpRequest;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public PowerZoneFtpRequestOrBuilder getPowerZoneFtpRequestOrBuilder() {
            PowerZoneFtpRequest powerZoneFtpRequest = this.powerZoneFtpRequest_;
            return powerZoneFtpRequest == null ? PowerZoneFtpRequest.getDefaultInstance() : powerZoneFtpRequest;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public PowerZoneFtpResponse getPowerZoneFtpResponse() {
            PowerZoneFtpResponse powerZoneFtpResponse = this.powerZoneFtpResponse_;
            return powerZoneFtpResponse == null ? PowerZoneFtpResponse.getDefaultInstance() : powerZoneFtpResponse;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public PowerZoneFtpResponseOrBuilder getPowerZoneFtpResponseOrBuilder() {
            PowerZoneFtpResponse powerZoneFtpResponse = this.powerZoneFtpResponse_;
            return powerZoneFtpResponse == null ? PowerZoneFtpResponse.getDefaultInstance() : powerZoneFtpResponse;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public PowerZoneManualThresholdsRequest getPowerZoneManualThresholdsRequest() {
            PowerZoneManualThresholdsRequest powerZoneManualThresholdsRequest = this.powerZoneManualThresholdsRequest_;
            return powerZoneManualThresholdsRequest == null ? PowerZoneManualThresholdsRequest.getDefaultInstance() : powerZoneManualThresholdsRequest;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public PowerZoneManualThresholdsRequestOrBuilder getPowerZoneManualThresholdsRequestOrBuilder() {
            PowerZoneManualThresholdsRequest powerZoneManualThresholdsRequest = this.powerZoneManualThresholdsRequest_;
            return powerZoneManualThresholdsRequest == null ? PowerZoneManualThresholdsRequest.getDefaultInstance() : powerZoneManualThresholdsRequest;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public PowerZoneManualThresholdsResponse getPowerZoneManualThresholdsResponse() {
            PowerZoneManualThresholdsResponse powerZoneManualThresholdsResponse = this.powerZoneManualThresholdsResponse_;
            return powerZoneManualThresholdsResponse == null ? PowerZoneManualThresholdsResponse.getDefaultInstance() : powerZoneManualThresholdsResponse;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public PowerZoneManualThresholdsResponseOrBuilder getPowerZoneManualThresholdsResponseOrBuilder() {
            PowerZoneManualThresholdsResponse powerZoneManualThresholdsResponse = this.powerZoneManualThresholdsResponse_;
            return powerZoneManualThresholdsResponse == null ? PowerZoneManualThresholdsResponse.getDefaultInstance() : powerZoneManualThresholdsResponse;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public PowerZoneModeRequest getPowerZoneModeRequest() {
            PowerZoneModeRequest powerZoneModeRequest = this.powerZoneModeRequest_;
            return powerZoneModeRequest == null ? PowerZoneModeRequest.getDefaultInstance() : powerZoneModeRequest;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public PowerZoneModeRequestOrBuilder getPowerZoneModeRequestOrBuilder() {
            PowerZoneModeRequest powerZoneModeRequest = this.powerZoneModeRequest_;
            return powerZoneModeRequest == null ? PowerZoneModeRequest.getDefaultInstance() : powerZoneModeRequest;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public PowerZoneModeResponse getPowerZoneModeResponse() {
            PowerZoneModeResponse powerZoneModeResponse = this.powerZoneModeResponse_;
            return powerZoneModeResponse == null ? PowerZoneModeResponse.getDefaultInstance() : powerZoneModeResponse;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public PowerZoneModeResponseOrBuilder getPowerZoneModeResponseOrBuilder() {
            PowerZoneModeResponse powerZoneModeResponse = this.powerZoneModeResponse_;
            return powerZoneModeResponse == null ? PowerZoneModeResponse.getDefaultInstance() : powerZoneModeResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getPowerZoneFtpRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getPowerZoneFtpResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getPowerZoneManualThresholdsRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getPowerZoneManualThresholdsResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getPowerZoneModeRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getPowerZoneModeResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getTrainerPowerModeNotification());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getTrainerPowerModeRequest());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getTrainerPowerModeResponse());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getPedalPowerNotification());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getEdgeMountStatusNotification());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getEdgeMountStatusRequest());
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, getEdgeMountStatusResponse());
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(14, getTrainerVirtualSpeedNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public TrainerPowerModeNotification getTrainerPowerModeNotification() {
            TrainerPowerModeNotification trainerPowerModeNotification = this.trainerPowerModeNotification_;
            return trainerPowerModeNotification == null ? TrainerPowerModeNotification.getDefaultInstance() : trainerPowerModeNotification;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public TrainerPowerModeNotificationOrBuilder getTrainerPowerModeNotificationOrBuilder() {
            TrainerPowerModeNotification trainerPowerModeNotification = this.trainerPowerModeNotification_;
            return trainerPowerModeNotification == null ? TrainerPowerModeNotification.getDefaultInstance() : trainerPowerModeNotification;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public TrainerPowerModeRequest getTrainerPowerModeRequest() {
            TrainerPowerModeRequest trainerPowerModeRequest = this.trainerPowerModeRequest_;
            return trainerPowerModeRequest == null ? TrainerPowerModeRequest.getDefaultInstance() : trainerPowerModeRequest;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public TrainerPowerModeRequestOrBuilder getTrainerPowerModeRequestOrBuilder() {
            TrainerPowerModeRequest trainerPowerModeRequest = this.trainerPowerModeRequest_;
            return trainerPowerModeRequest == null ? TrainerPowerModeRequest.getDefaultInstance() : trainerPowerModeRequest;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public TrainerPowerModeResponse getTrainerPowerModeResponse() {
            TrainerPowerModeResponse trainerPowerModeResponse = this.trainerPowerModeResponse_;
            return trainerPowerModeResponse == null ? TrainerPowerModeResponse.getDefaultInstance() : trainerPowerModeResponse;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public TrainerPowerModeResponseOrBuilder getTrainerPowerModeResponseOrBuilder() {
            TrainerPowerModeResponse trainerPowerModeResponse = this.trainerPowerModeResponse_;
            return trainerPowerModeResponse == null ? TrainerPowerModeResponse.getDefaultInstance() : trainerPowerModeResponse;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public TrainerVirtualSpeedNotification getTrainerVirtualSpeedNotification() {
            TrainerVirtualSpeedNotification trainerVirtualSpeedNotification = this.trainerVirtualSpeedNotification_;
            return trainerVirtualSpeedNotification == null ? TrainerVirtualSpeedNotification.getDefaultInstance() : trainerVirtualSpeedNotification;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public TrainerVirtualSpeedNotificationOrBuilder getTrainerVirtualSpeedNotificationOrBuilder() {
            TrainerVirtualSpeedNotification trainerVirtualSpeedNotification = this.trainerVirtualSpeedNotification_;
            return trainerVirtualSpeedNotification == null ? TrainerVirtualSpeedNotification.getDefaultInstance() : trainerVirtualSpeedNotification;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public boolean hasEdgeMountStatusNotification() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public boolean hasEdgeMountStatusRequest() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public boolean hasEdgeMountStatusResponse() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public boolean hasPedalPowerNotification() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public boolean hasPowerZoneFtpRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public boolean hasPowerZoneFtpResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public boolean hasPowerZoneManualThresholdsRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public boolean hasPowerZoneManualThresholdsResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public boolean hasPowerZoneModeRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public boolean hasPowerZoneModeResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public boolean hasTrainerPowerModeNotification() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public boolean hasTrainerPowerModeRequest() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public boolean hasTrainerPowerModeResponse() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
        public boolean hasTrainerVirtualSpeedNotification() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPowerZoneFtpRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPowerZoneFtpRequest().hashCode();
            }
            if (hasPowerZoneFtpResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getPowerZoneFtpResponse().hashCode();
            }
            if (hasPowerZoneManualThresholdsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getPowerZoneManualThresholdsRequest().hashCode();
            }
            if (hasPowerZoneManualThresholdsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getPowerZoneManualThresholdsResponse().hashCode();
            }
            if (hasPowerZoneModeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getPowerZoneModeRequest().hashCode();
            }
            if (hasPowerZoneModeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getPowerZoneModeResponse().hashCode();
            }
            if (hasTrainerPowerModeNotification()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getTrainerPowerModeNotification().hashCode();
            }
            if (hasTrainerPowerModeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getTrainerPowerModeRequest().hashCode();
            }
            if (hasTrainerPowerModeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getTrainerPowerModeResponse().hashCode();
            }
            if (hasPedalPowerNotification()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getPedalPowerNotification().hashCode();
            }
            if (hasEdgeMountStatusNotification()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getEdgeMountStatusNotification().hashCode();
            }
            if (hasEdgeMountStatusRequest()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getEdgeMountStatusRequest().hashCode();
            }
            if (hasEdgeMountStatusResponse()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getEdgeMountStatusResponse().hashCode();
            }
            if (hasTrainerVirtualSpeedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + getTrainerVirtualSpeedNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getPowerZoneFtpRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getPowerZoneFtpResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getPowerZoneManualThresholdsRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getPowerZoneManualThresholdsResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getPowerZoneModeRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getPowerZoneModeResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getTrainerPowerModeNotification());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getTrainerPowerModeRequest());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getTrainerPowerModeResponse());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getPedalPowerNotification());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getEdgeMountStatusNotification());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(12, getEdgeMountStatusRequest());
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeMessage(13, getEdgeMountStatusResponse());
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeMessage(14, getTrainerVirtualSpeedNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<EdgeMountStatusNotification, EdgeMountStatusNotification.Builder, EdgeMountStatusNotificationOrBuilder> edgeMountStatusNotificationBuilder_;
            private EdgeMountStatusNotification edgeMountStatusNotification_;
            private SingleFieldBuilderV3<EdgeMountStatusRequest, EdgeMountStatusRequest.Builder, EdgeMountStatusRequestOrBuilder> edgeMountStatusRequestBuilder_;
            private EdgeMountStatusRequest edgeMountStatusRequest_;
            private SingleFieldBuilderV3<EdgeMountStatusResponse, EdgeMountStatusResponse.Builder, EdgeMountStatusResponseOrBuilder> edgeMountStatusResponseBuilder_;
            private EdgeMountStatusResponse edgeMountStatusResponse_;
            private SingleFieldBuilderV3<PedalPowerNotification, PedalPowerNotification.Builder, PedalPowerNotificationOrBuilder> pedalPowerNotificationBuilder_;
            private PedalPowerNotification pedalPowerNotification_;
            private SingleFieldBuilderV3<PowerZoneFtpRequest, PowerZoneFtpRequest.Builder, PowerZoneFtpRequestOrBuilder> powerZoneFtpRequestBuilder_;
            private PowerZoneFtpRequest powerZoneFtpRequest_;
            private SingleFieldBuilderV3<PowerZoneFtpResponse, PowerZoneFtpResponse.Builder, PowerZoneFtpResponseOrBuilder> powerZoneFtpResponseBuilder_;
            private PowerZoneFtpResponse powerZoneFtpResponse_;
            private SingleFieldBuilderV3<PowerZoneManualThresholdsRequest, PowerZoneManualThresholdsRequest.Builder, PowerZoneManualThresholdsRequestOrBuilder> powerZoneManualThresholdsRequestBuilder_;
            private PowerZoneManualThresholdsRequest powerZoneManualThresholdsRequest_;
            private SingleFieldBuilderV3<PowerZoneManualThresholdsResponse, PowerZoneManualThresholdsResponse.Builder, PowerZoneManualThresholdsResponseOrBuilder> powerZoneManualThresholdsResponseBuilder_;
            private PowerZoneManualThresholdsResponse powerZoneManualThresholdsResponse_;
            private SingleFieldBuilderV3<PowerZoneModeRequest, PowerZoneModeRequest.Builder, PowerZoneModeRequestOrBuilder> powerZoneModeRequestBuilder_;
            private PowerZoneModeRequest powerZoneModeRequest_;
            private SingleFieldBuilderV3<PowerZoneModeResponse, PowerZoneModeResponse.Builder, PowerZoneModeResponseOrBuilder> powerZoneModeResponseBuilder_;
            private PowerZoneModeResponse powerZoneModeResponse_;
            private SingleFieldBuilderV3<TrainerPowerModeNotification, TrainerPowerModeNotification.Builder, TrainerPowerModeNotificationOrBuilder> trainerPowerModeNotificationBuilder_;
            private TrainerPowerModeNotification trainerPowerModeNotification_;
            private SingleFieldBuilderV3<TrainerPowerModeRequest, TrainerPowerModeRequest.Builder, TrainerPowerModeRequestOrBuilder> trainerPowerModeRequestBuilder_;
            private TrainerPowerModeRequest trainerPowerModeRequest_;
            private SingleFieldBuilderV3<TrainerPowerModeResponse, TrainerPowerModeResponse.Builder, TrainerPowerModeResponseOrBuilder> trainerPowerModeResponseBuilder_;
            private TrainerPowerModeResponse trainerPowerModeResponse_;
            private SingleFieldBuilderV3<TrainerVirtualSpeedNotification, TrainerVirtualSpeedNotification.Builder, TrainerVirtualSpeedNotificationOrBuilder> trainerVirtualSpeedNotificationBuilder_;
            private TrainerVirtualSpeedNotification trainerVirtualSpeedNotification_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<PowerZoneFtpRequest, PowerZoneFtpRequest.Builder, PowerZoneFtpRequestOrBuilder> singleFieldBuilderV3 = this.powerZoneFtpRequestBuilder_;
                    service.powerZoneFtpRequest_ = singleFieldBuilderV3 == null ? this.powerZoneFtpRequest_ : (PowerZoneFtpRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<PowerZoneFtpResponse, PowerZoneFtpResponse.Builder, PowerZoneFtpResponseOrBuilder> singleFieldBuilderV4 = this.powerZoneFtpResponseBuilder_;
                    service.powerZoneFtpResponse_ = singleFieldBuilderV4 == null ? this.powerZoneFtpResponse_ : (PowerZoneFtpResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<PowerZoneManualThresholdsRequest, PowerZoneManualThresholdsRequest.Builder, PowerZoneManualThresholdsRequestOrBuilder> singleFieldBuilderV5 = this.powerZoneManualThresholdsRequestBuilder_;
                    service.powerZoneManualThresholdsRequest_ = singleFieldBuilderV5 == null ? this.powerZoneManualThresholdsRequest_ : (PowerZoneManualThresholdsRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<PowerZoneManualThresholdsResponse, PowerZoneManualThresholdsResponse.Builder, PowerZoneManualThresholdsResponseOrBuilder> singleFieldBuilderV6 = this.powerZoneManualThresholdsResponseBuilder_;
                    service.powerZoneManualThresholdsResponse_ = singleFieldBuilderV6 == null ? this.powerZoneManualThresholdsResponse_ : (PowerZoneManualThresholdsResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<PowerZoneModeRequest, PowerZoneModeRequest.Builder, PowerZoneModeRequestOrBuilder> singleFieldBuilderV7 = this.powerZoneModeRequestBuilder_;
                    service.powerZoneModeRequest_ = singleFieldBuilderV7 == null ? this.powerZoneModeRequest_ : (PowerZoneModeRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<PowerZoneModeResponse, PowerZoneModeResponse.Builder, PowerZoneModeResponseOrBuilder> singleFieldBuilderV8 = this.powerZoneModeResponseBuilder_;
                    service.powerZoneModeResponse_ = singleFieldBuilderV8 == null ? this.powerZoneModeResponse_ : (PowerZoneModeResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<TrainerPowerModeNotification, TrainerPowerModeNotification.Builder, TrainerPowerModeNotificationOrBuilder> singleFieldBuilderV9 = this.trainerPowerModeNotificationBuilder_;
                    service.trainerPowerModeNotification_ = singleFieldBuilderV9 == null ? this.trainerPowerModeNotification_ : (TrainerPowerModeNotification) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<TrainerPowerModeRequest, TrainerPowerModeRequest.Builder, TrainerPowerModeRequestOrBuilder> singleFieldBuilderV10 = this.trainerPowerModeRequestBuilder_;
                    service.trainerPowerModeRequest_ = singleFieldBuilderV10 == null ? this.trainerPowerModeRequest_ : (TrainerPowerModeRequest) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<TrainerPowerModeResponse, TrainerPowerModeResponse.Builder, TrainerPowerModeResponseOrBuilder> singleFieldBuilderV11 = this.trainerPowerModeResponseBuilder_;
                    service.trainerPowerModeResponse_ = singleFieldBuilderV11 == null ? this.trainerPowerModeResponse_ : (TrainerPowerModeResponse) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<PedalPowerNotification, PedalPowerNotification.Builder, PedalPowerNotificationOrBuilder> singleFieldBuilderV12 = this.pedalPowerNotificationBuilder_;
                    service.pedalPowerNotification_ = singleFieldBuilderV12 == null ? this.pedalPowerNotification_ : (PedalPowerNotification) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<EdgeMountStatusNotification, EdgeMountStatusNotification.Builder, EdgeMountStatusNotificationOrBuilder> singleFieldBuilderV13 = this.edgeMountStatusNotificationBuilder_;
                    service.edgeMountStatusNotification_ = singleFieldBuilderV13 == null ? this.edgeMountStatusNotification_ : (EdgeMountStatusNotification) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<EdgeMountStatusRequest, EdgeMountStatusRequest.Builder, EdgeMountStatusRequestOrBuilder> singleFieldBuilderV14 = this.edgeMountStatusRequestBuilder_;
                    service.edgeMountStatusRequest_ = singleFieldBuilderV14 == null ? this.edgeMountStatusRequest_ : (EdgeMountStatusRequest) singleFieldBuilderV14.build();
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    SingleFieldBuilderV3<EdgeMountStatusResponse, EdgeMountStatusResponse.Builder, EdgeMountStatusResponseOrBuilder> singleFieldBuilderV15 = this.edgeMountStatusResponseBuilder_;
                    service.edgeMountStatusResponse_ = singleFieldBuilderV15 == null ? this.edgeMountStatusResponse_ : (EdgeMountStatusResponse) singleFieldBuilderV15.build();
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    SingleFieldBuilderV3<TrainerVirtualSpeedNotification, TrainerVirtualSpeedNotification.Builder, TrainerVirtualSpeedNotificationOrBuilder> singleFieldBuilderV16 = this.trainerVirtualSpeedNotificationBuilder_;
                    service.trainerVirtualSpeedNotification_ = singleFieldBuilderV16 == null ? this.trainerVirtualSpeedNotification_ : (TrainerVirtualSpeedNotification) singleFieldBuilderV16.build();
                    i14 |= 8192;
                }
                service.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_Service_descriptor;
            }

            private SingleFieldBuilderV3<EdgeMountStatusNotification, EdgeMountStatusNotification.Builder, EdgeMountStatusNotificationOrBuilder> getEdgeMountStatusNotificationFieldBuilder() {
                if (this.edgeMountStatusNotificationBuilder_ == null) {
                    this.edgeMountStatusNotificationBuilder_ = new SingleFieldBuilderV3<>(getEdgeMountStatusNotification(), getParentForChildren(), isClean());
                    this.edgeMountStatusNotification_ = null;
                }
                return this.edgeMountStatusNotificationBuilder_;
            }

            private SingleFieldBuilderV3<EdgeMountStatusRequest, EdgeMountStatusRequest.Builder, EdgeMountStatusRequestOrBuilder> getEdgeMountStatusRequestFieldBuilder() {
                if (this.edgeMountStatusRequestBuilder_ == null) {
                    this.edgeMountStatusRequestBuilder_ = new SingleFieldBuilderV3<>(getEdgeMountStatusRequest(), getParentForChildren(), isClean());
                    this.edgeMountStatusRequest_ = null;
                }
                return this.edgeMountStatusRequestBuilder_;
            }

            private SingleFieldBuilderV3<EdgeMountStatusResponse, EdgeMountStatusResponse.Builder, EdgeMountStatusResponseOrBuilder> getEdgeMountStatusResponseFieldBuilder() {
                if (this.edgeMountStatusResponseBuilder_ == null) {
                    this.edgeMountStatusResponseBuilder_ = new SingleFieldBuilderV3<>(getEdgeMountStatusResponse(), getParentForChildren(), isClean());
                    this.edgeMountStatusResponse_ = null;
                }
                return this.edgeMountStatusResponseBuilder_;
            }

            private SingleFieldBuilderV3<PedalPowerNotification, PedalPowerNotification.Builder, PedalPowerNotificationOrBuilder> getPedalPowerNotificationFieldBuilder() {
                if (this.pedalPowerNotificationBuilder_ == null) {
                    this.pedalPowerNotificationBuilder_ = new SingleFieldBuilderV3<>(getPedalPowerNotification(), getParentForChildren(), isClean());
                    this.pedalPowerNotification_ = null;
                }
                return this.pedalPowerNotificationBuilder_;
            }

            private SingleFieldBuilderV3<PowerZoneFtpRequest, PowerZoneFtpRequest.Builder, PowerZoneFtpRequestOrBuilder> getPowerZoneFtpRequestFieldBuilder() {
                if (this.powerZoneFtpRequestBuilder_ == null) {
                    this.powerZoneFtpRequestBuilder_ = new SingleFieldBuilderV3<>(getPowerZoneFtpRequest(), getParentForChildren(), isClean());
                    this.powerZoneFtpRequest_ = null;
                }
                return this.powerZoneFtpRequestBuilder_;
            }

            private SingleFieldBuilderV3<PowerZoneFtpResponse, PowerZoneFtpResponse.Builder, PowerZoneFtpResponseOrBuilder> getPowerZoneFtpResponseFieldBuilder() {
                if (this.powerZoneFtpResponseBuilder_ == null) {
                    this.powerZoneFtpResponseBuilder_ = new SingleFieldBuilderV3<>(getPowerZoneFtpResponse(), getParentForChildren(), isClean());
                    this.powerZoneFtpResponse_ = null;
                }
                return this.powerZoneFtpResponseBuilder_;
            }

            private SingleFieldBuilderV3<PowerZoneManualThresholdsRequest, PowerZoneManualThresholdsRequest.Builder, PowerZoneManualThresholdsRequestOrBuilder> getPowerZoneManualThresholdsRequestFieldBuilder() {
                if (this.powerZoneManualThresholdsRequestBuilder_ == null) {
                    this.powerZoneManualThresholdsRequestBuilder_ = new SingleFieldBuilderV3<>(getPowerZoneManualThresholdsRequest(), getParentForChildren(), isClean());
                    this.powerZoneManualThresholdsRequest_ = null;
                }
                return this.powerZoneManualThresholdsRequestBuilder_;
            }

            private SingleFieldBuilderV3<PowerZoneManualThresholdsResponse, PowerZoneManualThresholdsResponse.Builder, PowerZoneManualThresholdsResponseOrBuilder> getPowerZoneManualThresholdsResponseFieldBuilder() {
                if (this.powerZoneManualThresholdsResponseBuilder_ == null) {
                    this.powerZoneManualThresholdsResponseBuilder_ = new SingleFieldBuilderV3<>(getPowerZoneManualThresholdsResponse(), getParentForChildren(), isClean());
                    this.powerZoneManualThresholdsResponse_ = null;
                }
                return this.powerZoneManualThresholdsResponseBuilder_;
            }

            private SingleFieldBuilderV3<PowerZoneModeRequest, PowerZoneModeRequest.Builder, PowerZoneModeRequestOrBuilder> getPowerZoneModeRequestFieldBuilder() {
                if (this.powerZoneModeRequestBuilder_ == null) {
                    this.powerZoneModeRequestBuilder_ = new SingleFieldBuilderV3<>(getPowerZoneModeRequest(), getParentForChildren(), isClean());
                    this.powerZoneModeRequest_ = null;
                }
                return this.powerZoneModeRequestBuilder_;
            }

            private SingleFieldBuilderV3<PowerZoneModeResponse, PowerZoneModeResponse.Builder, PowerZoneModeResponseOrBuilder> getPowerZoneModeResponseFieldBuilder() {
                if (this.powerZoneModeResponseBuilder_ == null) {
                    this.powerZoneModeResponseBuilder_ = new SingleFieldBuilderV3<>(getPowerZoneModeResponse(), getParentForChildren(), isClean());
                    this.powerZoneModeResponse_ = null;
                }
                return this.powerZoneModeResponseBuilder_;
            }

            private SingleFieldBuilderV3<TrainerPowerModeNotification, TrainerPowerModeNotification.Builder, TrainerPowerModeNotificationOrBuilder> getTrainerPowerModeNotificationFieldBuilder() {
                if (this.trainerPowerModeNotificationBuilder_ == null) {
                    this.trainerPowerModeNotificationBuilder_ = new SingleFieldBuilderV3<>(getTrainerPowerModeNotification(), getParentForChildren(), isClean());
                    this.trainerPowerModeNotification_ = null;
                }
                return this.trainerPowerModeNotificationBuilder_;
            }

            private SingleFieldBuilderV3<TrainerPowerModeRequest, TrainerPowerModeRequest.Builder, TrainerPowerModeRequestOrBuilder> getTrainerPowerModeRequestFieldBuilder() {
                if (this.trainerPowerModeRequestBuilder_ == null) {
                    this.trainerPowerModeRequestBuilder_ = new SingleFieldBuilderV3<>(getTrainerPowerModeRequest(), getParentForChildren(), isClean());
                    this.trainerPowerModeRequest_ = null;
                }
                return this.trainerPowerModeRequestBuilder_;
            }

            private SingleFieldBuilderV3<TrainerPowerModeResponse, TrainerPowerModeResponse.Builder, TrainerPowerModeResponseOrBuilder> getTrainerPowerModeResponseFieldBuilder() {
                if (this.trainerPowerModeResponseBuilder_ == null) {
                    this.trainerPowerModeResponseBuilder_ = new SingleFieldBuilderV3<>(getTrainerPowerModeResponse(), getParentForChildren(), isClean());
                    this.trainerPowerModeResponse_ = null;
                }
                return this.trainerPowerModeResponseBuilder_;
            }

            private SingleFieldBuilderV3<TrainerVirtualSpeedNotification, TrainerVirtualSpeedNotification.Builder, TrainerVirtualSpeedNotificationOrBuilder> getTrainerVirtualSpeedNotificationFieldBuilder() {
                if (this.trainerVirtualSpeedNotificationBuilder_ == null) {
                    this.trainerVirtualSpeedNotificationBuilder_ = new SingleFieldBuilderV3<>(getTrainerVirtualSpeedNotification(), getParentForChildren(), isClean());
                    this.trainerVirtualSpeedNotification_ = null;
                }
                return this.trainerVirtualSpeedNotificationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getPowerZoneFtpRequestFieldBuilder();
                    getPowerZoneFtpResponseFieldBuilder();
                    getPowerZoneManualThresholdsRequestFieldBuilder();
                    getPowerZoneManualThresholdsResponseFieldBuilder();
                    getPowerZoneModeRequestFieldBuilder();
                    getPowerZoneModeResponseFieldBuilder();
                    getTrainerPowerModeNotificationFieldBuilder();
                    getTrainerPowerModeRequestFieldBuilder();
                    getTrainerPowerModeResponseFieldBuilder();
                    getPedalPowerNotificationFieldBuilder();
                    getEdgeMountStatusNotificationFieldBuilder();
                    getEdgeMountStatusRequestFieldBuilder();
                    getEdgeMountStatusResponseFieldBuilder();
                    getTrainerVirtualSpeedNotificationFieldBuilder();
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
                this.powerZoneFtpRequest_ = null;
                SingleFieldBuilderV3<PowerZoneFtpRequest, PowerZoneFtpRequest.Builder, PowerZoneFtpRequestOrBuilder> singleFieldBuilderV3 = this.powerZoneFtpRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.powerZoneFtpRequestBuilder_ = null;
                }
                this.powerZoneFtpResponse_ = null;
                SingleFieldBuilderV3<PowerZoneFtpResponse, PowerZoneFtpResponse.Builder, PowerZoneFtpResponseOrBuilder> singleFieldBuilderV4 = this.powerZoneFtpResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.powerZoneFtpResponseBuilder_ = null;
                }
                this.powerZoneManualThresholdsRequest_ = null;
                SingleFieldBuilderV3<PowerZoneManualThresholdsRequest, PowerZoneManualThresholdsRequest.Builder, PowerZoneManualThresholdsRequestOrBuilder> singleFieldBuilderV5 = this.powerZoneManualThresholdsRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.powerZoneManualThresholdsRequestBuilder_ = null;
                }
                this.powerZoneManualThresholdsResponse_ = null;
                SingleFieldBuilderV3<PowerZoneManualThresholdsResponse, PowerZoneManualThresholdsResponse.Builder, PowerZoneManualThresholdsResponseOrBuilder> singleFieldBuilderV6 = this.powerZoneManualThresholdsResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.powerZoneManualThresholdsResponseBuilder_ = null;
                }
                this.powerZoneModeRequest_ = null;
                SingleFieldBuilderV3<PowerZoneModeRequest, PowerZoneModeRequest.Builder, PowerZoneModeRequestOrBuilder> singleFieldBuilderV7 = this.powerZoneModeRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.powerZoneModeRequestBuilder_ = null;
                }
                this.powerZoneModeResponse_ = null;
                SingleFieldBuilderV3<PowerZoneModeResponse, PowerZoneModeResponse.Builder, PowerZoneModeResponseOrBuilder> singleFieldBuilderV8 = this.powerZoneModeResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.powerZoneModeResponseBuilder_ = null;
                }
                this.trainerPowerModeNotification_ = null;
                SingleFieldBuilderV3<TrainerPowerModeNotification, TrainerPowerModeNotification.Builder, TrainerPowerModeNotificationOrBuilder> singleFieldBuilderV9 = this.trainerPowerModeNotificationBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.trainerPowerModeNotificationBuilder_ = null;
                }
                this.trainerPowerModeRequest_ = null;
                SingleFieldBuilderV3<TrainerPowerModeRequest, TrainerPowerModeRequest.Builder, TrainerPowerModeRequestOrBuilder> singleFieldBuilderV10 = this.trainerPowerModeRequestBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.trainerPowerModeRequestBuilder_ = null;
                }
                this.trainerPowerModeResponse_ = null;
                SingleFieldBuilderV3<TrainerPowerModeResponse, TrainerPowerModeResponse.Builder, TrainerPowerModeResponseOrBuilder> singleFieldBuilderV11 = this.trainerPowerModeResponseBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.trainerPowerModeResponseBuilder_ = null;
                }
                this.pedalPowerNotification_ = null;
                SingleFieldBuilderV3<PedalPowerNotification, PedalPowerNotification.Builder, PedalPowerNotificationOrBuilder> singleFieldBuilderV12 = this.pedalPowerNotificationBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.pedalPowerNotificationBuilder_ = null;
                }
                this.edgeMountStatusNotification_ = null;
                SingleFieldBuilderV3<EdgeMountStatusNotification, EdgeMountStatusNotification.Builder, EdgeMountStatusNotificationOrBuilder> singleFieldBuilderV13 = this.edgeMountStatusNotificationBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.edgeMountStatusNotificationBuilder_ = null;
                }
                this.edgeMountStatusRequest_ = null;
                SingleFieldBuilderV3<EdgeMountStatusRequest, EdgeMountStatusRequest.Builder, EdgeMountStatusRequestOrBuilder> singleFieldBuilderV14 = this.edgeMountStatusRequestBuilder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.edgeMountStatusRequestBuilder_ = null;
                }
                this.edgeMountStatusResponse_ = null;
                SingleFieldBuilderV3<EdgeMountStatusResponse, EdgeMountStatusResponse.Builder, EdgeMountStatusResponseOrBuilder> singleFieldBuilderV15 = this.edgeMountStatusResponseBuilder_;
                if (singleFieldBuilderV15 != null) {
                    singleFieldBuilderV15.dispose();
                    this.edgeMountStatusResponseBuilder_ = null;
                }
                this.trainerVirtualSpeedNotification_ = null;
                SingleFieldBuilderV3<TrainerVirtualSpeedNotification, TrainerVirtualSpeedNotification.Builder, TrainerVirtualSpeedNotificationOrBuilder> singleFieldBuilderV16 = this.trainerVirtualSpeedNotificationBuilder_;
                if (singleFieldBuilderV16 != null) {
                    singleFieldBuilderV16.dispose();
                    this.trainerVirtualSpeedNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearEdgeMountStatusNotification() {
                this.bitField0_ &= -1025;
                this.edgeMountStatusNotification_ = null;
                SingleFieldBuilderV3<EdgeMountStatusNotification, EdgeMountStatusNotification.Builder, EdgeMountStatusNotificationOrBuilder> singleFieldBuilderV3 = this.edgeMountStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.edgeMountStatusNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEdgeMountStatusRequest() {
                this.bitField0_ &= -2049;
                this.edgeMountStatusRequest_ = null;
                SingleFieldBuilderV3<EdgeMountStatusRequest, EdgeMountStatusRequest.Builder, EdgeMountStatusRequestOrBuilder> singleFieldBuilderV3 = this.edgeMountStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.edgeMountStatusRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEdgeMountStatusResponse() {
                this.bitField0_ &= -4097;
                this.edgeMountStatusResponse_ = null;
                SingleFieldBuilderV3<EdgeMountStatusResponse, EdgeMountStatusResponse.Builder, EdgeMountStatusResponseOrBuilder> singleFieldBuilderV3 = this.edgeMountStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.edgeMountStatusResponseBuilder_ = null;
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

            public Builder clearPedalPowerNotification() {
                this.bitField0_ &= -513;
                this.pedalPowerNotification_ = null;
                SingleFieldBuilderV3<PedalPowerNotification, PedalPowerNotification.Builder, PedalPowerNotificationOrBuilder> singleFieldBuilderV3 = this.pedalPowerNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.pedalPowerNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPowerZoneFtpRequest() {
                this.bitField0_ &= -2;
                this.powerZoneFtpRequest_ = null;
                SingleFieldBuilderV3<PowerZoneFtpRequest, PowerZoneFtpRequest.Builder, PowerZoneFtpRequestOrBuilder> singleFieldBuilderV3 = this.powerZoneFtpRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.powerZoneFtpRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPowerZoneFtpResponse() {
                this.bitField0_ &= -3;
                this.powerZoneFtpResponse_ = null;
                SingleFieldBuilderV3<PowerZoneFtpResponse, PowerZoneFtpResponse.Builder, PowerZoneFtpResponseOrBuilder> singleFieldBuilderV3 = this.powerZoneFtpResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.powerZoneFtpResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPowerZoneManualThresholdsRequest() {
                this.bitField0_ &= -5;
                this.powerZoneManualThresholdsRequest_ = null;
                SingleFieldBuilderV3<PowerZoneManualThresholdsRequest, PowerZoneManualThresholdsRequest.Builder, PowerZoneManualThresholdsRequestOrBuilder> singleFieldBuilderV3 = this.powerZoneManualThresholdsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.powerZoneManualThresholdsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPowerZoneManualThresholdsResponse() {
                this.bitField0_ &= -9;
                this.powerZoneManualThresholdsResponse_ = null;
                SingleFieldBuilderV3<PowerZoneManualThresholdsResponse, PowerZoneManualThresholdsResponse.Builder, PowerZoneManualThresholdsResponseOrBuilder> singleFieldBuilderV3 = this.powerZoneManualThresholdsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.powerZoneManualThresholdsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPowerZoneModeRequest() {
                this.bitField0_ &= -17;
                this.powerZoneModeRequest_ = null;
                SingleFieldBuilderV3<PowerZoneModeRequest, PowerZoneModeRequest.Builder, PowerZoneModeRequestOrBuilder> singleFieldBuilderV3 = this.powerZoneModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.powerZoneModeRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPowerZoneModeResponse() {
                this.bitField0_ &= -33;
                this.powerZoneModeResponse_ = null;
                SingleFieldBuilderV3<PowerZoneModeResponse, PowerZoneModeResponse.Builder, PowerZoneModeResponseOrBuilder> singleFieldBuilderV3 = this.powerZoneModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.powerZoneModeResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTrainerPowerModeNotification() {
                this.bitField0_ &= -65;
                this.trainerPowerModeNotification_ = null;
                SingleFieldBuilderV3<TrainerPowerModeNotification, TrainerPowerModeNotification.Builder, TrainerPowerModeNotificationOrBuilder> singleFieldBuilderV3 = this.trainerPowerModeNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.trainerPowerModeNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTrainerPowerModeRequest() {
                this.bitField0_ &= -129;
                this.trainerPowerModeRequest_ = null;
                SingleFieldBuilderV3<TrainerPowerModeRequest, TrainerPowerModeRequest.Builder, TrainerPowerModeRequestOrBuilder> singleFieldBuilderV3 = this.trainerPowerModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.trainerPowerModeRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTrainerPowerModeResponse() {
                this.bitField0_ &= -257;
                this.trainerPowerModeResponse_ = null;
                SingleFieldBuilderV3<TrainerPowerModeResponse, TrainerPowerModeResponse.Builder, TrainerPowerModeResponseOrBuilder> singleFieldBuilderV3 = this.trainerPowerModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.trainerPowerModeResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTrainerVirtualSpeedNotification() {
                this.bitField0_ &= -8193;
                this.trainerVirtualSpeedNotification_ = null;
                SingleFieldBuilderV3<TrainerVirtualSpeedNotification, TrainerVirtualSpeedNotification.Builder, TrainerVirtualSpeedNotificationOrBuilder> singleFieldBuilderV3 = this.trainerVirtualSpeedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.trainerVirtualSpeedNotificationBuilder_ = null;
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
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public EdgeMountStatusNotification getEdgeMountStatusNotification() {
                SingleFieldBuilderV3<EdgeMountStatusNotification, EdgeMountStatusNotification.Builder, EdgeMountStatusNotificationOrBuilder> singleFieldBuilderV3 = this.edgeMountStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EdgeMountStatusNotification) singleFieldBuilderV3.getMessage();
                }
                EdgeMountStatusNotification edgeMountStatusNotification = this.edgeMountStatusNotification_;
                return edgeMountStatusNotification == null ? EdgeMountStatusNotification.getDefaultInstance() : edgeMountStatusNotification;
            }

            public EdgeMountStatusNotification.Builder getEdgeMountStatusNotificationBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (EdgeMountStatusNotification.Builder) getEdgeMountStatusNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public EdgeMountStatusNotificationOrBuilder getEdgeMountStatusNotificationOrBuilder() {
                SingleFieldBuilderV3<EdgeMountStatusNotification, EdgeMountStatusNotification.Builder, EdgeMountStatusNotificationOrBuilder> singleFieldBuilderV3 = this.edgeMountStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EdgeMountStatusNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EdgeMountStatusNotification edgeMountStatusNotification = this.edgeMountStatusNotification_;
                return edgeMountStatusNotification == null ? EdgeMountStatusNotification.getDefaultInstance() : edgeMountStatusNotification;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public EdgeMountStatusRequest getEdgeMountStatusRequest() {
                SingleFieldBuilderV3<EdgeMountStatusRequest, EdgeMountStatusRequest.Builder, EdgeMountStatusRequestOrBuilder> singleFieldBuilderV3 = this.edgeMountStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EdgeMountStatusRequest) singleFieldBuilderV3.getMessage();
                }
                EdgeMountStatusRequest edgeMountStatusRequest = this.edgeMountStatusRequest_;
                return edgeMountStatusRequest == null ? EdgeMountStatusRequest.getDefaultInstance() : edgeMountStatusRequest;
            }

            public EdgeMountStatusRequest.Builder getEdgeMountStatusRequestBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (EdgeMountStatusRequest.Builder) getEdgeMountStatusRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public EdgeMountStatusRequestOrBuilder getEdgeMountStatusRequestOrBuilder() {
                SingleFieldBuilderV3<EdgeMountStatusRequest, EdgeMountStatusRequest.Builder, EdgeMountStatusRequestOrBuilder> singleFieldBuilderV3 = this.edgeMountStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EdgeMountStatusRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EdgeMountStatusRequest edgeMountStatusRequest = this.edgeMountStatusRequest_;
                return edgeMountStatusRequest == null ? EdgeMountStatusRequest.getDefaultInstance() : edgeMountStatusRequest;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public EdgeMountStatusResponse getEdgeMountStatusResponse() {
                SingleFieldBuilderV3<EdgeMountStatusResponse, EdgeMountStatusResponse.Builder, EdgeMountStatusResponseOrBuilder> singleFieldBuilderV3 = this.edgeMountStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EdgeMountStatusResponse) singleFieldBuilderV3.getMessage();
                }
                EdgeMountStatusResponse edgeMountStatusResponse = this.edgeMountStatusResponse_;
                return edgeMountStatusResponse == null ? EdgeMountStatusResponse.getDefaultInstance() : edgeMountStatusResponse;
            }

            public EdgeMountStatusResponse.Builder getEdgeMountStatusResponseBuilder() {
                this.bitField0_ |= 4096;
                onChanged();
                return (EdgeMountStatusResponse.Builder) getEdgeMountStatusResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public EdgeMountStatusResponseOrBuilder getEdgeMountStatusResponseOrBuilder() {
                SingleFieldBuilderV3<EdgeMountStatusResponse, EdgeMountStatusResponse.Builder, EdgeMountStatusResponseOrBuilder> singleFieldBuilderV3 = this.edgeMountStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EdgeMountStatusResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EdgeMountStatusResponse edgeMountStatusResponse = this.edgeMountStatusResponse_;
                return edgeMountStatusResponse == null ? EdgeMountStatusResponse.getDefaultInstance() : edgeMountStatusResponse;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public PedalPowerNotification getPedalPowerNotification() {
                SingleFieldBuilderV3<PedalPowerNotification, PedalPowerNotification.Builder, PedalPowerNotificationOrBuilder> singleFieldBuilderV3 = this.pedalPowerNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PedalPowerNotification) singleFieldBuilderV3.getMessage();
                }
                PedalPowerNotification pedalPowerNotification = this.pedalPowerNotification_;
                return pedalPowerNotification == null ? PedalPowerNotification.getDefaultInstance() : pedalPowerNotification;
            }

            public PedalPowerNotification.Builder getPedalPowerNotificationBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (PedalPowerNotification.Builder) getPedalPowerNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public PedalPowerNotificationOrBuilder getPedalPowerNotificationOrBuilder() {
                SingleFieldBuilderV3<PedalPowerNotification, PedalPowerNotification.Builder, PedalPowerNotificationOrBuilder> singleFieldBuilderV3 = this.pedalPowerNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PedalPowerNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PedalPowerNotification pedalPowerNotification = this.pedalPowerNotification_;
                return pedalPowerNotification == null ? PedalPowerNotification.getDefaultInstance() : pedalPowerNotification;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public PowerZoneFtpRequest getPowerZoneFtpRequest() {
                SingleFieldBuilderV3<PowerZoneFtpRequest, PowerZoneFtpRequest.Builder, PowerZoneFtpRequestOrBuilder> singleFieldBuilderV3 = this.powerZoneFtpRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneFtpRequest) singleFieldBuilderV3.getMessage();
                }
                PowerZoneFtpRequest powerZoneFtpRequest = this.powerZoneFtpRequest_;
                return powerZoneFtpRequest == null ? PowerZoneFtpRequest.getDefaultInstance() : powerZoneFtpRequest;
            }

            public PowerZoneFtpRequest.Builder getPowerZoneFtpRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (PowerZoneFtpRequest.Builder) getPowerZoneFtpRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public PowerZoneFtpRequestOrBuilder getPowerZoneFtpRequestOrBuilder() {
                SingleFieldBuilderV3<PowerZoneFtpRequest, PowerZoneFtpRequest.Builder, PowerZoneFtpRequestOrBuilder> singleFieldBuilderV3 = this.powerZoneFtpRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneFtpRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PowerZoneFtpRequest powerZoneFtpRequest = this.powerZoneFtpRequest_;
                return powerZoneFtpRequest == null ? PowerZoneFtpRequest.getDefaultInstance() : powerZoneFtpRequest;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public PowerZoneFtpResponse getPowerZoneFtpResponse() {
                SingleFieldBuilderV3<PowerZoneFtpResponse, PowerZoneFtpResponse.Builder, PowerZoneFtpResponseOrBuilder> singleFieldBuilderV3 = this.powerZoneFtpResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneFtpResponse) singleFieldBuilderV3.getMessage();
                }
                PowerZoneFtpResponse powerZoneFtpResponse = this.powerZoneFtpResponse_;
                return powerZoneFtpResponse == null ? PowerZoneFtpResponse.getDefaultInstance() : powerZoneFtpResponse;
            }

            public PowerZoneFtpResponse.Builder getPowerZoneFtpResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (PowerZoneFtpResponse.Builder) getPowerZoneFtpResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public PowerZoneFtpResponseOrBuilder getPowerZoneFtpResponseOrBuilder() {
                SingleFieldBuilderV3<PowerZoneFtpResponse, PowerZoneFtpResponse.Builder, PowerZoneFtpResponseOrBuilder> singleFieldBuilderV3 = this.powerZoneFtpResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneFtpResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PowerZoneFtpResponse powerZoneFtpResponse = this.powerZoneFtpResponse_;
                return powerZoneFtpResponse == null ? PowerZoneFtpResponse.getDefaultInstance() : powerZoneFtpResponse;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public PowerZoneManualThresholdsRequest getPowerZoneManualThresholdsRequest() {
                SingleFieldBuilderV3<PowerZoneManualThresholdsRequest, PowerZoneManualThresholdsRequest.Builder, PowerZoneManualThresholdsRequestOrBuilder> singleFieldBuilderV3 = this.powerZoneManualThresholdsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneManualThresholdsRequest) singleFieldBuilderV3.getMessage();
                }
                PowerZoneManualThresholdsRequest powerZoneManualThresholdsRequest = this.powerZoneManualThresholdsRequest_;
                return powerZoneManualThresholdsRequest == null ? PowerZoneManualThresholdsRequest.getDefaultInstance() : powerZoneManualThresholdsRequest;
            }

            public PowerZoneManualThresholdsRequest.Builder getPowerZoneManualThresholdsRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (PowerZoneManualThresholdsRequest.Builder) getPowerZoneManualThresholdsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public PowerZoneManualThresholdsRequestOrBuilder getPowerZoneManualThresholdsRequestOrBuilder() {
                SingleFieldBuilderV3<PowerZoneManualThresholdsRequest, PowerZoneManualThresholdsRequest.Builder, PowerZoneManualThresholdsRequestOrBuilder> singleFieldBuilderV3 = this.powerZoneManualThresholdsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneManualThresholdsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PowerZoneManualThresholdsRequest powerZoneManualThresholdsRequest = this.powerZoneManualThresholdsRequest_;
                return powerZoneManualThresholdsRequest == null ? PowerZoneManualThresholdsRequest.getDefaultInstance() : powerZoneManualThresholdsRequest;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public PowerZoneManualThresholdsResponse getPowerZoneManualThresholdsResponse() {
                SingleFieldBuilderV3<PowerZoneManualThresholdsResponse, PowerZoneManualThresholdsResponse.Builder, PowerZoneManualThresholdsResponseOrBuilder> singleFieldBuilderV3 = this.powerZoneManualThresholdsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneManualThresholdsResponse) singleFieldBuilderV3.getMessage();
                }
                PowerZoneManualThresholdsResponse powerZoneManualThresholdsResponse = this.powerZoneManualThresholdsResponse_;
                return powerZoneManualThresholdsResponse == null ? PowerZoneManualThresholdsResponse.getDefaultInstance() : powerZoneManualThresholdsResponse;
            }

            public PowerZoneManualThresholdsResponse.Builder getPowerZoneManualThresholdsResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (PowerZoneManualThresholdsResponse.Builder) getPowerZoneManualThresholdsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public PowerZoneManualThresholdsResponseOrBuilder getPowerZoneManualThresholdsResponseOrBuilder() {
                SingleFieldBuilderV3<PowerZoneManualThresholdsResponse, PowerZoneManualThresholdsResponse.Builder, PowerZoneManualThresholdsResponseOrBuilder> singleFieldBuilderV3 = this.powerZoneManualThresholdsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneManualThresholdsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PowerZoneManualThresholdsResponse powerZoneManualThresholdsResponse = this.powerZoneManualThresholdsResponse_;
                return powerZoneManualThresholdsResponse == null ? PowerZoneManualThresholdsResponse.getDefaultInstance() : powerZoneManualThresholdsResponse;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public PowerZoneModeRequest getPowerZoneModeRequest() {
                SingleFieldBuilderV3<PowerZoneModeRequest, PowerZoneModeRequest.Builder, PowerZoneModeRequestOrBuilder> singleFieldBuilderV3 = this.powerZoneModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneModeRequest) singleFieldBuilderV3.getMessage();
                }
                PowerZoneModeRequest powerZoneModeRequest = this.powerZoneModeRequest_;
                return powerZoneModeRequest == null ? PowerZoneModeRequest.getDefaultInstance() : powerZoneModeRequest;
            }

            public PowerZoneModeRequest.Builder getPowerZoneModeRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (PowerZoneModeRequest.Builder) getPowerZoneModeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public PowerZoneModeRequestOrBuilder getPowerZoneModeRequestOrBuilder() {
                SingleFieldBuilderV3<PowerZoneModeRequest, PowerZoneModeRequest.Builder, PowerZoneModeRequestOrBuilder> singleFieldBuilderV3 = this.powerZoneModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneModeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PowerZoneModeRequest powerZoneModeRequest = this.powerZoneModeRequest_;
                return powerZoneModeRequest == null ? PowerZoneModeRequest.getDefaultInstance() : powerZoneModeRequest;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public PowerZoneModeResponse getPowerZoneModeResponse() {
                SingleFieldBuilderV3<PowerZoneModeResponse, PowerZoneModeResponse.Builder, PowerZoneModeResponseOrBuilder> singleFieldBuilderV3 = this.powerZoneModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneModeResponse) singleFieldBuilderV3.getMessage();
                }
                PowerZoneModeResponse powerZoneModeResponse = this.powerZoneModeResponse_;
                return powerZoneModeResponse == null ? PowerZoneModeResponse.getDefaultInstance() : powerZoneModeResponse;
            }

            public PowerZoneModeResponse.Builder getPowerZoneModeResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (PowerZoneModeResponse.Builder) getPowerZoneModeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public PowerZoneModeResponseOrBuilder getPowerZoneModeResponseOrBuilder() {
                SingleFieldBuilderV3<PowerZoneModeResponse, PowerZoneModeResponse.Builder, PowerZoneModeResponseOrBuilder> singleFieldBuilderV3 = this.powerZoneModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerZoneModeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PowerZoneModeResponse powerZoneModeResponse = this.powerZoneModeResponse_;
                return powerZoneModeResponse == null ? PowerZoneModeResponse.getDefaultInstance() : powerZoneModeResponse;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public TrainerPowerModeNotification getTrainerPowerModeNotification() {
                SingleFieldBuilderV3<TrainerPowerModeNotification, TrainerPowerModeNotification.Builder, TrainerPowerModeNotificationOrBuilder> singleFieldBuilderV3 = this.trainerPowerModeNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrainerPowerModeNotification) singleFieldBuilderV3.getMessage();
                }
                TrainerPowerModeNotification trainerPowerModeNotification = this.trainerPowerModeNotification_;
                return trainerPowerModeNotification == null ? TrainerPowerModeNotification.getDefaultInstance() : trainerPowerModeNotification;
            }

            public TrainerPowerModeNotification.Builder getTrainerPowerModeNotificationBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (TrainerPowerModeNotification.Builder) getTrainerPowerModeNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public TrainerPowerModeNotificationOrBuilder getTrainerPowerModeNotificationOrBuilder() {
                SingleFieldBuilderV3<TrainerPowerModeNotification, TrainerPowerModeNotification.Builder, TrainerPowerModeNotificationOrBuilder> singleFieldBuilderV3 = this.trainerPowerModeNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrainerPowerModeNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrainerPowerModeNotification trainerPowerModeNotification = this.trainerPowerModeNotification_;
                return trainerPowerModeNotification == null ? TrainerPowerModeNotification.getDefaultInstance() : trainerPowerModeNotification;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public TrainerPowerModeRequest getTrainerPowerModeRequest() {
                SingleFieldBuilderV3<TrainerPowerModeRequest, TrainerPowerModeRequest.Builder, TrainerPowerModeRequestOrBuilder> singleFieldBuilderV3 = this.trainerPowerModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrainerPowerModeRequest) singleFieldBuilderV3.getMessage();
                }
                TrainerPowerModeRequest trainerPowerModeRequest = this.trainerPowerModeRequest_;
                return trainerPowerModeRequest == null ? TrainerPowerModeRequest.getDefaultInstance() : trainerPowerModeRequest;
            }

            public TrainerPowerModeRequest.Builder getTrainerPowerModeRequestBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (TrainerPowerModeRequest.Builder) getTrainerPowerModeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public TrainerPowerModeRequestOrBuilder getTrainerPowerModeRequestOrBuilder() {
                SingleFieldBuilderV3<TrainerPowerModeRequest, TrainerPowerModeRequest.Builder, TrainerPowerModeRequestOrBuilder> singleFieldBuilderV3 = this.trainerPowerModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrainerPowerModeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrainerPowerModeRequest trainerPowerModeRequest = this.trainerPowerModeRequest_;
                return trainerPowerModeRequest == null ? TrainerPowerModeRequest.getDefaultInstance() : trainerPowerModeRequest;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public TrainerPowerModeResponse getTrainerPowerModeResponse() {
                SingleFieldBuilderV3<TrainerPowerModeResponse, TrainerPowerModeResponse.Builder, TrainerPowerModeResponseOrBuilder> singleFieldBuilderV3 = this.trainerPowerModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrainerPowerModeResponse) singleFieldBuilderV3.getMessage();
                }
                TrainerPowerModeResponse trainerPowerModeResponse = this.trainerPowerModeResponse_;
                return trainerPowerModeResponse == null ? TrainerPowerModeResponse.getDefaultInstance() : trainerPowerModeResponse;
            }

            public TrainerPowerModeResponse.Builder getTrainerPowerModeResponseBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (TrainerPowerModeResponse.Builder) getTrainerPowerModeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public TrainerPowerModeResponseOrBuilder getTrainerPowerModeResponseOrBuilder() {
                SingleFieldBuilderV3<TrainerPowerModeResponse, TrainerPowerModeResponse.Builder, TrainerPowerModeResponseOrBuilder> singleFieldBuilderV3 = this.trainerPowerModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrainerPowerModeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrainerPowerModeResponse trainerPowerModeResponse = this.trainerPowerModeResponse_;
                return trainerPowerModeResponse == null ? TrainerPowerModeResponse.getDefaultInstance() : trainerPowerModeResponse;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public TrainerVirtualSpeedNotification getTrainerVirtualSpeedNotification() {
                SingleFieldBuilderV3<TrainerVirtualSpeedNotification, TrainerVirtualSpeedNotification.Builder, TrainerVirtualSpeedNotificationOrBuilder> singleFieldBuilderV3 = this.trainerVirtualSpeedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrainerVirtualSpeedNotification) singleFieldBuilderV3.getMessage();
                }
                TrainerVirtualSpeedNotification trainerVirtualSpeedNotification = this.trainerVirtualSpeedNotification_;
                return trainerVirtualSpeedNotification == null ? TrainerVirtualSpeedNotification.getDefaultInstance() : trainerVirtualSpeedNotification;
            }

            public TrainerVirtualSpeedNotification.Builder getTrainerVirtualSpeedNotificationBuilder() {
                this.bitField0_ |= 8192;
                onChanged();
                return (TrainerVirtualSpeedNotification.Builder) getTrainerVirtualSpeedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public TrainerVirtualSpeedNotificationOrBuilder getTrainerVirtualSpeedNotificationOrBuilder() {
                SingleFieldBuilderV3<TrainerVirtualSpeedNotification, TrainerVirtualSpeedNotification.Builder, TrainerVirtualSpeedNotificationOrBuilder> singleFieldBuilderV3 = this.trainerVirtualSpeedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrainerVirtualSpeedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrainerVirtualSpeedNotification trainerVirtualSpeedNotification = this.trainerVirtualSpeedNotification_;
                return trainerVirtualSpeedNotification == null ? TrainerVirtualSpeedNotification.getDefaultInstance() : trainerVirtualSpeedNotification;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public boolean hasEdgeMountStatusNotification() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public boolean hasEdgeMountStatusRequest() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public boolean hasEdgeMountStatusResponse() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public boolean hasPedalPowerNotification() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public boolean hasPowerZoneFtpRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public boolean hasPowerZoneFtpResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public boolean hasPowerZoneManualThresholdsRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public boolean hasPowerZoneManualThresholdsResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public boolean hasPowerZoneModeRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public boolean hasPowerZoneModeResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public boolean hasTrainerPowerModeNotification() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public boolean hasTrainerPowerModeRequest() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public boolean hasTrainerPowerModeResponse() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.ServiceOrBuilder
            public boolean hasTrainerVirtualSpeedNotification() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeEdgeMountStatusNotification(EdgeMountStatusNotification edgeMountStatusNotification) {
                EdgeMountStatusNotification edgeMountStatusNotification2;
                SingleFieldBuilderV3<EdgeMountStatusNotification, EdgeMountStatusNotification.Builder, EdgeMountStatusNotificationOrBuilder> singleFieldBuilderV3 = this.edgeMountStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(edgeMountStatusNotification);
                } else if ((this.bitField0_ & 1024) == 0 || (edgeMountStatusNotification2 = this.edgeMountStatusNotification_) == null || edgeMountStatusNotification2 == EdgeMountStatusNotification.getDefaultInstance()) {
                    this.edgeMountStatusNotification_ = edgeMountStatusNotification;
                } else {
                    getEdgeMountStatusNotificationBuilder().mergeFrom(edgeMountStatusNotification);
                }
                if (this.edgeMountStatusNotification_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeEdgeMountStatusRequest(EdgeMountStatusRequest edgeMountStatusRequest) {
                EdgeMountStatusRequest edgeMountStatusRequest2;
                SingleFieldBuilderV3<EdgeMountStatusRequest, EdgeMountStatusRequest.Builder, EdgeMountStatusRequestOrBuilder> singleFieldBuilderV3 = this.edgeMountStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(edgeMountStatusRequest);
                } else if ((this.bitField0_ & 2048) == 0 || (edgeMountStatusRequest2 = this.edgeMountStatusRequest_) == null || edgeMountStatusRequest2 == EdgeMountStatusRequest.getDefaultInstance()) {
                    this.edgeMountStatusRequest_ = edgeMountStatusRequest;
                } else {
                    getEdgeMountStatusRequestBuilder().mergeFrom(edgeMountStatusRequest);
                }
                if (this.edgeMountStatusRequest_ != null) {
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                return this;
            }

            public Builder mergeEdgeMountStatusResponse(EdgeMountStatusResponse edgeMountStatusResponse) {
                EdgeMountStatusResponse edgeMountStatusResponse2;
                SingleFieldBuilderV3<EdgeMountStatusResponse, EdgeMountStatusResponse.Builder, EdgeMountStatusResponseOrBuilder> singleFieldBuilderV3 = this.edgeMountStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(edgeMountStatusResponse);
                } else if ((this.bitField0_ & 4096) == 0 || (edgeMountStatusResponse2 = this.edgeMountStatusResponse_) == null || edgeMountStatusResponse2 == EdgeMountStatusResponse.getDefaultInstance()) {
                    this.edgeMountStatusResponse_ = edgeMountStatusResponse;
                } else {
                    getEdgeMountStatusResponseBuilder().mergeFrom(edgeMountStatusResponse);
                }
                if (this.edgeMountStatusResponse_ != null) {
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
                                    codedInputStream.readMessage(getPowerZoneFtpRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getPowerZoneFtpResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getPowerZoneManualThresholdsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getPowerZoneManualThresholdsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getPowerZoneModeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getPowerZoneModeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getTrainerPowerModeNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getTrainerPowerModeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getTrainerPowerModeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getPedalPowerNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getEdgeMountStatusNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 98:
                                    codedInputStream.readMessage(getEdgeMountStatusRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 106:
                                    codedInputStream.readMessage(getEdgeMountStatusResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 114:
                                    codedInputStream.readMessage(getTrainerVirtualSpeedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergePedalPowerNotification(PedalPowerNotification pedalPowerNotification) {
                PedalPowerNotification pedalPowerNotification2;
                SingleFieldBuilderV3<PedalPowerNotification, PedalPowerNotification.Builder, PedalPowerNotificationOrBuilder> singleFieldBuilderV3 = this.pedalPowerNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(pedalPowerNotification);
                } else if ((this.bitField0_ & 512) == 0 || (pedalPowerNotification2 = this.pedalPowerNotification_) == null || pedalPowerNotification2 == PedalPowerNotification.getDefaultInstance()) {
                    this.pedalPowerNotification_ = pedalPowerNotification;
                } else {
                    getPedalPowerNotificationBuilder().mergeFrom(pedalPowerNotification);
                }
                if (this.pedalPowerNotification_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergePowerZoneFtpRequest(PowerZoneFtpRequest powerZoneFtpRequest) {
                PowerZoneFtpRequest powerZoneFtpRequest2;
                SingleFieldBuilderV3<PowerZoneFtpRequest, PowerZoneFtpRequest.Builder, PowerZoneFtpRequestOrBuilder> singleFieldBuilderV3 = this.powerZoneFtpRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(powerZoneFtpRequest);
                } else if ((this.bitField0_ & 1) == 0 || (powerZoneFtpRequest2 = this.powerZoneFtpRequest_) == null || powerZoneFtpRequest2 == PowerZoneFtpRequest.getDefaultInstance()) {
                    this.powerZoneFtpRequest_ = powerZoneFtpRequest;
                } else {
                    getPowerZoneFtpRequestBuilder().mergeFrom(powerZoneFtpRequest);
                }
                if (this.powerZoneFtpRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergePowerZoneFtpResponse(PowerZoneFtpResponse powerZoneFtpResponse) {
                PowerZoneFtpResponse powerZoneFtpResponse2;
                SingleFieldBuilderV3<PowerZoneFtpResponse, PowerZoneFtpResponse.Builder, PowerZoneFtpResponseOrBuilder> singleFieldBuilderV3 = this.powerZoneFtpResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(powerZoneFtpResponse);
                } else if ((this.bitField0_ & 2) == 0 || (powerZoneFtpResponse2 = this.powerZoneFtpResponse_) == null || powerZoneFtpResponse2 == PowerZoneFtpResponse.getDefaultInstance()) {
                    this.powerZoneFtpResponse_ = powerZoneFtpResponse;
                } else {
                    getPowerZoneFtpResponseBuilder().mergeFrom(powerZoneFtpResponse);
                }
                if (this.powerZoneFtpResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergePowerZoneManualThresholdsRequest(PowerZoneManualThresholdsRequest powerZoneManualThresholdsRequest) {
                PowerZoneManualThresholdsRequest powerZoneManualThresholdsRequest2;
                SingleFieldBuilderV3<PowerZoneManualThresholdsRequest, PowerZoneManualThresholdsRequest.Builder, PowerZoneManualThresholdsRequestOrBuilder> singleFieldBuilderV3 = this.powerZoneManualThresholdsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(powerZoneManualThresholdsRequest);
                } else if ((this.bitField0_ & 4) == 0 || (powerZoneManualThresholdsRequest2 = this.powerZoneManualThresholdsRequest_) == null || powerZoneManualThresholdsRequest2 == PowerZoneManualThresholdsRequest.getDefaultInstance()) {
                    this.powerZoneManualThresholdsRequest_ = powerZoneManualThresholdsRequest;
                } else {
                    getPowerZoneManualThresholdsRequestBuilder().mergeFrom(powerZoneManualThresholdsRequest);
                }
                if (this.powerZoneManualThresholdsRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergePowerZoneManualThresholdsResponse(PowerZoneManualThresholdsResponse powerZoneManualThresholdsResponse) {
                PowerZoneManualThresholdsResponse powerZoneManualThresholdsResponse2;
                SingleFieldBuilderV3<PowerZoneManualThresholdsResponse, PowerZoneManualThresholdsResponse.Builder, PowerZoneManualThresholdsResponseOrBuilder> singleFieldBuilderV3 = this.powerZoneManualThresholdsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(powerZoneManualThresholdsResponse);
                } else if ((this.bitField0_ & 8) == 0 || (powerZoneManualThresholdsResponse2 = this.powerZoneManualThresholdsResponse_) == null || powerZoneManualThresholdsResponse2 == PowerZoneManualThresholdsResponse.getDefaultInstance()) {
                    this.powerZoneManualThresholdsResponse_ = powerZoneManualThresholdsResponse;
                } else {
                    getPowerZoneManualThresholdsResponseBuilder().mergeFrom(powerZoneManualThresholdsResponse);
                }
                if (this.powerZoneManualThresholdsResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergePowerZoneModeRequest(PowerZoneModeRequest powerZoneModeRequest) {
                PowerZoneModeRequest powerZoneModeRequest2;
                SingleFieldBuilderV3<PowerZoneModeRequest, PowerZoneModeRequest.Builder, PowerZoneModeRequestOrBuilder> singleFieldBuilderV3 = this.powerZoneModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(powerZoneModeRequest);
                } else if ((this.bitField0_ & 16) == 0 || (powerZoneModeRequest2 = this.powerZoneModeRequest_) == null || powerZoneModeRequest2 == PowerZoneModeRequest.getDefaultInstance()) {
                    this.powerZoneModeRequest_ = powerZoneModeRequest;
                } else {
                    getPowerZoneModeRequestBuilder().mergeFrom(powerZoneModeRequest);
                }
                if (this.powerZoneModeRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergePowerZoneModeResponse(PowerZoneModeResponse powerZoneModeResponse) {
                PowerZoneModeResponse powerZoneModeResponse2;
                SingleFieldBuilderV3<PowerZoneModeResponse, PowerZoneModeResponse.Builder, PowerZoneModeResponseOrBuilder> singleFieldBuilderV3 = this.powerZoneModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(powerZoneModeResponse);
                } else if ((this.bitField0_ & 32) == 0 || (powerZoneModeResponse2 = this.powerZoneModeResponse_) == null || powerZoneModeResponse2 == PowerZoneModeResponse.getDefaultInstance()) {
                    this.powerZoneModeResponse_ = powerZoneModeResponse;
                } else {
                    getPowerZoneModeResponseBuilder().mergeFrom(powerZoneModeResponse);
                }
                if (this.powerZoneModeResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTrainerPowerModeNotification(TrainerPowerModeNotification trainerPowerModeNotification) {
                TrainerPowerModeNotification trainerPowerModeNotification2;
                SingleFieldBuilderV3<TrainerPowerModeNotification, TrainerPowerModeNotification.Builder, TrainerPowerModeNotificationOrBuilder> singleFieldBuilderV3 = this.trainerPowerModeNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trainerPowerModeNotification);
                } else if ((this.bitField0_ & 64) == 0 || (trainerPowerModeNotification2 = this.trainerPowerModeNotification_) == null || trainerPowerModeNotification2 == TrainerPowerModeNotification.getDefaultInstance()) {
                    this.trainerPowerModeNotification_ = trainerPowerModeNotification;
                } else {
                    getTrainerPowerModeNotificationBuilder().mergeFrom(trainerPowerModeNotification);
                }
                if (this.trainerPowerModeNotification_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTrainerPowerModeRequest(TrainerPowerModeRequest trainerPowerModeRequest) {
                TrainerPowerModeRequest trainerPowerModeRequest2;
                SingleFieldBuilderV3<TrainerPowerModeRequest, TrainerPowerModeRequest.Builder, TrainerPowerModeRequestOrBuilder> singleFieldBuilderV3 = this.trainerPowerModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trainerPowerModeRequest);
                } else if ((this.bitField0_ & 128) == 0 || (trainerPowerModeRequest2 = this.trainerPowerModeRequest_) == null || trainerPowerModeRequest2 == TrainerPowerModeRequest.getDefaultInstance()) {
                    this.trainerPowerModeRequest_ = trainerPowerModeRequest;
                } else {
                    getTrainerPowerModeRequestBuilder().mergeFrom(trainerPowerModeRequest);
                }
                if (this.trainerPowerModeRequest_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTrainerPowerModeResponse(TrainerPowerModeResponse trainerPowerModeResponse) {
                TrainerPowerModeResponse trainerPowerModeResponse2;
                SingleFieldBuilderV3<TrainerPowerModeResponse, TrainerPowerModeResponse.Builder, TrainerPowerModeResponseOrBuilder> singleFieldBuilderV3 = this.trainerPowerModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trainerPowerModeResponse);
                } else if ((this.bitField0_ & 256) == 0 || (trainerPowerModeResponse2 = this.trainerPowerModeResponse_) == null || trainerPowerModeResponse2 == TrainerPowerModeResponse.getDefaultInstance()) {
                    this.trainerPowerModeResponse_ = trainerPowerModeResponse;
                } else {
                    getTrainerPowerModeResponseBuilder().mergeFrom(trainerPowerModeResponse);
                }
                if (this.trainerPowerModeResponse_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTrainerVirtualSpeedNotification(TrainerVirtualSpeedNotification trainerVirtualSpeedNotification) {
                TrainerVirtualSpeedNotification trainerVirtualSpeedNotification2;
                SingleFieldBuilderV3<TrainerVirtualSpeedNotification, TrainerVirtualSpeedNotification.Builder, TrainerVirtualSpeedNotificationOrBuilder> singleFieldBuilderV3 = this.trainerVirtualSpeedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trainerVirtualSpeedNotification);
                } else if ((this.bitField0_ & 8192) == 0 || (trainerVirtualSpeedNotification2 = this.trainerVirtualSpeedNotification_) == null || trainerVirtualSpeedNotification2 == TrainerVirtualSpeedNotification.getDefaultInstance()) {
                    this.trainerVirtualSpeedNotification_ = trainerVirtualSpeedNotification;
                } else {
                    getTrainerVirtualSpeedNotificationBuilder().mergeFrom(trainerVirtualSpeedNotification);
                }
                if (this.trainerVirtualSpeedNotification_ != null) {
                    this.bitField0_ |= 8192;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setEdgeMountStatusNotification(EdgeMountStatusNotification.Builder builder) {
                SingleFieldBuilderV3<EdgeMountStatusNotification, EdgeMountStatusNotification.Builder, EdgeMountStatusNotificationOrBuilder> singleFieldBuilderV3 = this.edgeMountStatusNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.edgeMountStatusNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setEdgeMountStatusRequest(EdgeMountStatusRequest.Builder builder) {
                SingleFieldBuilderV3<EdgeMountStatusRequest, EdgeMountStatusRequest.Builder, EdgeMountStatusRequestOrBuilder> singleFieldBuilderV3 = this.edgeMountStatusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.edgeMountStatusRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setEdgeMountStatusResponse(EdgeMountStatusResponse.Builder builder) {
                SingleFieldBuilderV3<EdgeMountStatusResponse, EdgeMountStatusResponse.Builder, EdgeMountStatusResponseOrBuilder> singleFieldBuilderV3 = this.edgeMountStatusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.edgeMountStatusResponse_ = builder.build();
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

            public Builder setPedalPowerNotification(PedalPowerNotification.Builder builder) {
                SingleFieldBuilderV3<PedalPowerNotification, PedalPowerNotification.Builder, PedalPowerNotificationOrBuilder> singleFieldBuilderV3 = this.pedalPowerNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.pedalPowerNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setPowerZoneFtpRequest(PowerZoneFtpRequest.Builder builder) {
                SingleFieldBuilderV3<PowerZoneFtpRequest, PowerZoneFtpRequest.Builder, PowerZoneFtpRequestOrBuilder> singleFieldBuilderV3 = this.powerZoneFtpRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.powerZoneFtpRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPowerZoneFtpResponse(PowerZoneFtpResponse.Builder builder) {
                SingleFieldBuilderV3<PowerZoneFtpResponse, PowerZoneFtpResponse.Builder, PowerZoneFtpResponseOrBuilder> singleFieldBuilderV3 = this.powerZoneFtpResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.powerZoneFtpResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPowerZoneManualThresholdsRequest(PowerZoneManualThresholdsRequest.Builder builder) {
                SingleFieldBuilderV3<PowerZoneManualThresholdsRequest, PowerZoneManualThresholdsRequest.Builder, PowerZoneManualThresholdsRequestOrBuilder> singleFieldBuilderV3 = this.powerZoneManualThresholdsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.powerZoneManualThresholdsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPowerZoneManualThresholdsResponse(PowerZoneManualThresholdsResponse.Builder builder) {
                SingleFieldBuilderV3<PowerZoneManualThresholdsResponse, PowerZoneManualThresholdsResponse.Builder, PowerZoneManualThresholdsResponseOrBuilder> singleFieldBuilderV3 = this.powerZoneManualThresholdsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.powerZoneManualThresholdsResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setPowerZoneModeRequest(PowerZoneModeRequest.Builder builder) {
                SingleFieldBuilderV3<PowerZoneModeRequest, PowerZoneModeRequest.Builder, PowerZoneModeRequestOrBuilder> singleFieldBuilderV3 = this.powerZoneModeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.powerZoneModeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setPowerZoneModeResponse(PowerZoneModeResponse.Builder builder) {
                SingleFieldBuilderV3<PowerZoneModeResponse, PowerZoneModeResponse.Builder, PowerZoneModeResponseOrBuilder> singleFieldBuilderV3 = this.powerZoneModeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.powerZoneModeResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTrainerPowerModeNotification(TrainerPowerModeNotification.Builder builder) {
                SingleFieldBuilderV3<TrainerPowerModeNotification, TrainerPowerModeNotification.Builder, TrainerPowerModeNotificationOrBuilder> singleFieldBuilderV3 = this.trainerPowerModeNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.trainerPowerModeNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setTrainerPowerModeRequest(TrainerPowerModeRequest.Builder builder) {
                SingleFieldBuilderV3<TrainerPowerModeRequest, TrainerPowerModeRequest.Builder, TrainerPowerModeRequestOrBuilder> singleFieldBuilderV3 = this.trainerPowerModeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.trainerPowerModeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setTrainerPowerModeResponse(TrainerPowerModeResponse.Builder builder) {
                SingleFieldBuilderV3<TrainerPowerModeResponse, TrainerPowerModeResponse.Builder, TrainerPowerModeResponseOrBuilder> singleFieldBuilderV3 = this.trainerPowerModeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.trainerPowerModeResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setTrainerVirtualSpeedNotification(TrainerVirtualSpeedNotification.Builder builder) {
                SingleFieldBuilderV3<TrainerVirtualSpeedNotification, TrainerVirtualSpeedNotification.Builder, TrainerVirtualSpeedNotificationOrBuilder> singleFieldBuilderV3 = this.trainerVirtualSpeedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.trainerVirtualSpeedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8192;
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

            public Builder setEdgeMountStatusNotification(EdgeMountStatusNotification edgeMountStatusNotification) {
                SingleFieldBuilderV3<EdgeMountStatusNotification, EdgeMountStatusNotification.Builder, EdgeMountStatusNotificationOrBuilder> singleFieldBuilderV3 = this.edgeMountStatusNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    edgeMountStatusNotification.getClass();
                    this.edgeMountStatusNotification_ = edgeMountStatusNotification;
                } else {
                    singleFieldBuilderV3.setMessage(edgeMountStatusNotification);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setEdgeMountStatusRequest(EdgeMountStatusRequest edgeMountStatusRequest) {
                SingleFieldBuilderV3<EdgeMountStatusRequest, EdgeMountStatusRequest.Builder, EdgeMountStatusRequestOrBuilder> singleFieldBuilderV3 = this.edgeMountStatusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    edgeMountStatusRequest.getClass();
                    this.edgeMountStatusRequest_ = edgeMountStatusRequest;
                } else {
                    singleFieldBuilderV3.setMessage(edgeMountStatusRequest);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setEdgeMountStatusResponse(EdgeMountStatusResponse edgeMountStatusResponse) {
                SingleFieldBuilderV3<EdgeMountStatusResponse, EdgeMountStatusResponse.Builder, EdgeMountStatusResponseOrBuilder> singleFieldBuilderV3 = this.edgeMountStatusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    edgeMountStatusResponse.getClass();
                    this.edgeMountStatusResponse_ = edgeMountStatusResponse;
                } else {
                    singleFieldBuilderV3.setMessage(edgeMountStatusResponse);
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setPedalPowerNotification(PedalPowerNotification pedalPowerNotification) {
                SingleFieldBuilderV3<PedalPowerNotification, PedalPowerNotification.Builder, PedalPowerNotificationOrBuilder> singleFieldBuilderV3 = this.pedalPowerNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    pedalPowerNotification.getClass();
                    this.pedalPowerNotification_ = pedalPowerNotification;
                } else {
                    singleFieldBuilderV3.setMessage(pedalPowerNotification);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setPowerZoneFtpRequest(PowerZoneFtpRequest powerZoneFtpRequest) {
                SingleFieldBuilderV3<PowerZoneFtpRequest, PowerZoneFtpRequest.Builder, PowerZoneFtpRequestOrBuilder> singleFieldBuilderV3 = this.powerZoneFtpRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    powerZoneFtpRequest.getClass();
                    this.powerZoneFtpRequest_ = powerZoneFtpRequest;
                } else {
                    singleFieldBuilderV3.setMessage(powerZoneFtpRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPowerZoneFtpResponse(PowerZoneFtpResponse powerZoneFtpResponse) {
                SingleFieldBuilderV3<PowerZoneFtpResponse, PowerZoneFtpResponse.Builder, PowerZoneFtpResponseOrBuilder> singleFieldBuilderV3 = this.powerZoneFtpResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    powerZoneFtpResponse.getClass();
                    this.powerZoneFtpResponse_ = powerZoneFtpResponse;
                } else {
                    singleFieldBuilderV3.setMessage(powerZoneFtpResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPowerZoneManualThresholdsRequest(PowerZoneManualThresholdsRequest powerZoneManualThresholdsRequest) {
                SingleFieldBuilderV3<PowerZoneManualThresholdsRequest, PowerZoneManualThresholdsRequest.Builder, PowerZoneManualThresholdsRequestOrBuilder> singleFieldBuilderV3 = this.powerZoneManualThresholdsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    powerZoneManualThresholdsRequest.getClass();
                    this.powerZoneManualThresholdsRequest_ = powerZoneManualThresholdsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(powerZoneManualThresholdsRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPowerZoneManualThresholdsResponse(PowerZoneManualThresholdsResponse powerZoneManualThresholdsResponse) {
                SingleFieldBuilderV3<PowerZoneManualThresholdsResponse, PowerZoneManualThresholdsResponse.Builder, PowerZoneManualThresholdsResponseOrBuilder> singleFieldBuilderV3 = this.powerZoneManualThresholdsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    powerZoneManualThresholdsResponse.getClass();
                    this.powerZoneManualThresholdsResponse_ = powerZoneManualThresholdsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(powerZoneManualThresholdsResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setPowerZoneModeRequest(PowerZoneModeRequest powerZoneModeRequest) {
                SingleFieldBuilderV3<PowerZoneModeRequest, PowerZoneModeRequest.Builder, PowerZoneModeRequestOrBuilder> singleFieldBuilderV3 = this.powerZoneModeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    powerZoneModeRequest.getClass();
                    this.powerZoneModeRequest_ = powerZoneModeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(powerZoneModeRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setPowerZoneModeResponse(PowerZoneModeResponse powerZoneModeResponse) {
                SingleFieldBuilderV3<PowerZoneModeResponse, PowerZoneModeResponse.Builder, PowerZoneModeResponseOrBuilder> singleFieldBuilderV3 = this.powerZoneModeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    powerZoneModeResponse.getClass();
                    this.powerZoneModeResponse_ = powerZoneModeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(powerZoneModeResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setTrainerPowerModeNotification(TrainerPowerModeNotification trainerPowerModeNotification) {
                SingleFieldBuilderV3<TrainerPowerModeNotification, TrainerPowerModeNotification.Builder, TrainerPowerModeNotificationOrBuilder> singleFieldBuilderV3 = this.trainerPowerModeNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trainerPowerModeNotification.getClass();
                    this.trainerPowerModeNotification_ = trainerPowerModeNotification;
                } else {
                    singleFieldBuilderV3.setMessage(trainerPowerModeNotification);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setTrainerPowerModeRequest(TrainerPowerModeRequest trainerPowerModeRequest) {
                SingleFieldBuilderV3<TrainerPowerModeRequest, TrainerPowerModeRequest.Builder, TrainerPowerModeRequestOrBuilder> singleFieldBuilderV3 = this.trainerPowerModeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trainerPowerModeRequest.getClass();
                    this.trainerPowerModeRequest_ = trainerPowerModeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(trainerPowerModeRequest);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setTrainerPowerModeResponse(TrainerPowerModeResponse trainerPowerModeResponse) {
                SingleFieldBuilderV3<TrainerPowerModeResponse, TrainerPowerModeResponse.Builder, TrainerPowerModeResponseOrBuilder> singleFieldBuilderV3 = this.trainerPowerModeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trainerPowerModeResponse.getClass();
                    this.trainerPowerModeResponse_ = trainerPowerModeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(trainerPowerModeResponse);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setTrainerVirtualSpeedNotification(TrainerVirtualSpeedNotification trainerVirtualSpeedNotification) {
                SingleFieldBuilderV3<TrainerVirtualSpeedNotification, TrainerVirtualSpeedNotification.Builder, TrainerVirtualSpeedNotificationOrBuilder> singleFieldBuilderV3 = this.trainerVirtualSpeedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trainerVirtualSpeedNotification.getClass();
                    this.trainerVirtualSpeedNotification_ = trainerVirtualSpeedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(trainerVirtualSpeedNotification);
                }
                this.bitField0_ |= 8192;
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
                if (service.hasPowerZoneFtpRequest()) {
                    mergePowerZoneFtpRequest(service.getPowerZoneFtpRequest());
                }
                if (service.hasPowerZoneFtpResponse()) {
                    mergePowerZoneFtpResponse(service.getPowerZoneFtpResponse());
                }
                if (service.hasPowerZoneManualThresholdsRequest()) {
                    mergePowerZoneManualThresholdsRequest(service.getPowerZoneManualThresholdsRequest());
                }
                if (service.hasPowerZoneManualThresholdsResponse()) {
                    mergePowerZoneManualThresholdsResponse(service.getPowerZoneManualThresholdsResponse());
                }
                if (service.hasPowerZoneModeRequest()) {
                    mergePowerZoneModeRequest(service.getPowerZoneModeRequest());
                }
                if (service.hasPowerZoneModeResponse()) {
                    mergePowerZoneModeResponse(service.getPowerZoneModeResponse());
                }
                if (service.hasTrainerPowerModeNotification()) {
                    mergeTrainerPowerModeNotification(service.getTrainerPowerModeNotification());
                }
                if (service.hasTrainerPowerModeRequest()) {
                    mergeTrainerPowerModeRequest(service.getTrainerPowerModeRequest());
                }
                if (service.hasTrainerPowerModeResponse()) {
                    mergeTrainerPowerModeResponse(service.getTrainerPowerModeResponse());
                }
                if (service.hasPedalPowerNotification()) {
                    mergePedalPowerNotification(service.getPedalPowerNotification());
                }
                if (service.hasEdgeMountStatusNotification()) {
                    mergeEdgeMountStatusNotification(service.getEdgeMountStatusNotification());
                }
                if (service.hasEdgeMountStatusRequest()) {
                    mergeEdgeMountStatusRequest(service.getEdgeMountStatusRequest());
                }
                if (service.hasEdgeMountStatusResponse()) {
                    mergeEdgeMountStatusResponse(service.getEdgeMountStatusResponse());
                }
                if (service.hasTrainerVirtualSpeedNotification()) {
                    mergeTrainerVirtualSpeedNotification(service.getTrainerVirtualSpeedNotification());
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

    public static final class TrainerPowerModeMessage extends GeneratedMessageV3 implements TrainerPowerModeMessageOrBuilder {
        public static final int MODE_FIELD_NUMBER = 1;
        public static final int TIME_TO_SLEEP_MS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int mode_;
        private int timeToSleepMs_;
        private static final TrainerPowerModeMessage DEFAULT_INSTANCE = new TrainerPowerModeMessage();

        @Deprecated
        public static final Parser<TrainerPowerModeMessage> PARSER = new AbstractParser<TrainerPowerModeMessage>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeMessage.1
            @Override // com.google.protobuf.Parser
            public TrainerPowerModeMessage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TrainerPowerModeMessage.newBuilder();
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

        private TrainerPowerModeMessage(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.mode_ = 0;
            this.timeToSleepMs_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrainerPowerModeMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeMessage_descriptor;
        }

        public static Builder newBuilder(TrainerPowerModeMessage trainerPowerModeMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(trainerPowerModeMessage);
        }

        public static TrainerPowerModeMessage parseDelimitedFrom(InputStream inputStream) {
            return (TrainerPowerModeMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TrainerPowerModeMessage parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TrainerPowerModeMessage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrainerPowerModeMessage)) {
                return super.equals(obj);
            }
            TrainerPowerModeMessage trainerPowerModeMessage = (TrainerPowerModeMessage) obj;
            if (hasMode() != trainerPowerModeMessage.hasMode()) {
                return false;
            }
            if ((!hasMode() || this.mode_ == trainerPowerModeMessage.mode_) && hasTimeToSleepMs() == trainerPowerModeMessage.hasTimeToSleepMs()) {
                return (!hasTimeToSleepMs() || getTimeToSleepMs() == trainerPowerModeMessage.getTimeToSleepMs()) && getUnknownFields().equals(trainerPowerModeMessage.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeMessageOrBuilder
        public Mode getMode() {
            Mode modeForNumber = Mode.forNumber(this.mode_);
            return modeForNumber == null ? Mode.UNKNOWN : modeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TrainerPowerModeMessage> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.mode_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.timeToSleepMs_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeMessageOrBuilder
        public int getTimeToSleepMs() {
            return this.timeToSleepMs_;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeMessageOrBuilder
        public boolean hasMode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeMessageOrBuilder
        public boolean hasTimeToSleepMs() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMode()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.mode_;
            }
            if (hasTimeToSleepMs()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTimeToSleepMs();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(TrainerPowerModeMessage.class, Builder.class);
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
            return new TrainerPowerModeMessage();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.mode_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.timeToSleepMs_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TrainerPowerModeMessageOrBuilder {
            private int bitField0_;
            private int mode_;
            private int timeToSleepMs_;

            private Builder() {
                this.mode_ = 0;
            }

            private void buildPartial0(TrainerPowerModeMessage trainerPowerModeMessage) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    trainerPowerModeMessage.mode_ = this.mode_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    trainerPowerModeMessage.timeToSleepMs_ = this.timeToSleepMs_;
                    i14 |= 2;
                }
                trainerPowerModeMessage.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeMessage_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrainerPowerModeMessage build() {
                TrainerPowerModeMessage trainerPowerModeMessageBuildPartial = buildPartial();
                if (trainerPowerModeMessageBuildPartial.isInitialized()) {
                    return trainerPowerModeMessageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) trainerPowerModeMessageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrainerPowerModeMessage buildPartial() {
                TrainerPowerModeMessage trainerPowerModeMessage = new TrainerPowerModeMessage(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(trainerPowerModeMessage);
                }
                onBuilt();
                return trainerPowerModeMessage;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.mode_ = 0;
                this.timeToSleepMs_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMode() {
                this.bitField0_ &= -2;
                this.mode_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearTimeToSleepMs() {
                this.bitField0_ &= -3;
                this.timeToSleepMs_ = 0;
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
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeMessage_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeMessageOrBuilder
            public Mode getMode() {
                Mode modeForNumber = Mode.forNumber(this.mode_);
                return modeForNumber == null ? Mode.UNKNOWN : modeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeMessageOrBuilder
            public int getTimeToSleepMs() {
                return this.timeToSleepMs_;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeMessageOrBuilder
            public boolean hasMode() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeMessageOrBuilder
            public boolean hasTimeToSleepMs() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(TrainerPowerModeMessage.class, Builder.class);
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
                                    if (Mode.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.mode_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.timeToSleepMs_ = codedInputStream.readUInt32();
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

            public Builder setMode(Mode mode) {
                mode.getClass();
                this.bitField0_ |= 1;
                this.mode_ = mode.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTimeToSleepMs(int i14) {
                this.timeToSleepMs_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TrainerPowerModeMessage getDefaultInstanceForType() {
                return TrainerPowerModeMessage.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.mode_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TrainerPowerModeMessage) {
                    return mergeFrom((TrainerPowerModeMessage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TrainerPowerModeMessage trainerPowerModeMessage) {
                if (trainerPowerModeMessage == TrainerPowerModeMessage.getDefaultInstance()) {
                    return this;
                }
                if (trainerPowerModeMessage.hasMode()) {
                    setMode(trainerPowerModeMessage.getMode());
                }
                if (trainerPowerModeMessage.hasTimeToSleepMs()) {
                    setTimeToSleepMs(trainerPowerModeMessage.getTimeToSleepMs());
                }
                mergeUnknownFields(trainerPowerModeMessage.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TrainerPowerModeMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TrainerPowerModeMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrainerPowerModeMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrainerPowerModeMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TrainerPowerModeMessage parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TrainerPowerModeMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ TrainerPowerModeMessage(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static TrainerPowerModeMessage parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private TrainerPowerModeMessage() {
            this.timeToSleepMs_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.mode_ = 0;
        }

        public static TrainerPowerModeMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TrainerPowerModeMessage parseFrom(InputStream inputStream) {
            return (TrainerPowerModeMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TrainerPowerModeMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrainerPowerModeMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrainerPowerModeMessage parseFrom(CodedInputStream codedInputStream) {
            return (TrainerPowerModeMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TrainerPowerModeMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrainerPowerModeMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Mode implements ProtocolMessageEnum {
            UNKNOWN(0),
            ACTIVE(1),
            SLEEP(2);

            public static final int ACTIVE_VALUE = 1;
            public static final int SLEEP_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Mode> internalValueMap = new Internal.EnumLiteMap<Mode>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeMessage.Mode.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Mode findValueByNumber(int i14) {
                    return Mode.forNumber(i14);
                }
            };
            private static final Mode[] VALUES = values();

            Mode(int i14) {
                this.value = i14;
            }

            public static Mode forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return ACTIVE;
                }
                if (i14 != 2) {
                    return null;
                }
                return SLEEP;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return TrainerPowerModeMessage.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Mode> internalGetValueMap() {
                return internalValueMap;
            }

            public static Mode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Mode valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class TrainerPowerModeNotification extends GeneratedMessageV3 implements TrainerPowerModeNotificationOrBuilder {
        public static final int MSG_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private TrainerPowerModeMessage msg_;
        private static final TrainerPowerModeNotification DEFAULT_INSTANCE = new TrainerPowerModeNotification();

        @Deprecated
        public static final Parser<TrainerPowerModeNotification> PARSER = new AbstractParser<TrainerPowerModeNotification>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeNotification.1
            @Override // com.google.protobuf.Parser
            public TrainerPowerModeNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TrainerPowerModeNotification.newBuilder();
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

        private TrainerPowerModeNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrainerPowerModeNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeNotification_descriptor;
        }

        public static Builder newBuilder(TrainerPowerModeNotification trainerPowerModeNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(trainerPowerModeNotification);
        }

        public static TrainerPowerModeNotification parseDelimitedFrom(InputStream inputStream) {
            return (TrainerPowerModeNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TrainerPowerModeNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TrainerPowerModeNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrainerPowerModeNotification)) {
                return super.equals(obj);
            }
            TrainerPowerModeNotification trainerPowerModeNotification = (TrainerPowerModeNotification) obj;
            if (hasMsg() != trainerPowerModeNotification.hasMsg()) {
                return false;
            }
            return (!hasMsg() || getMsg().equals(trainerPowerModeNotification.getMsg())) && getUnknownFields().equals(trainerPowerModeNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeNotificationOrBuilder
        public TrainerPowerModeMessage getMsg() {
            TrainerPowerModeMessage trainerPowerModeMessage = this.msg_;
            return trainerPowerModeMessage == null ? TrainerPowerModeMessage.getDefaultInstance() : trainerPowerModeMessage;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeNotificationOrBuilder
        public TrainerPowerModeMessageOrBuilder getMsgOrBuilder() {
            TrainerPowerModeMessage trainerPowerModeMessage = this.msg_;
            return trainerPowerModeMessage == null ? TrainerPowerModeMessage.getDefaultInstance() : trainerPowerModeMessage;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TrainerPowerModeNotification> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeNotificationOrBuilder
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
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(TrainerPowerModeNotification.class, Builder.class);
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
            return new TrainerPowerModeNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TrainerPowerModeNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<TrainerPowerModeMessage, TrainerPowerModeMessage.Builder, TrainerPowerModeMessageOrBuilder> msgBuilder_;
            private TrainerPowerModeMessage msg_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(TrainerPowerModeNotification trainerPowerModeNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<TrainerPowerModeMessage, TrainerPowerModeMessage.Builder, TrainerPowerModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                    trainerPowerModeNotification.msg_ = singleFieldBuilderV3 == null ? this.msg_ : (TrainerPowerModeMessage) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                trainerPowerModeNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeNotification_descriptor;
            }

            private SingleFieldBuilderV3<TrainerPowerModeMessage, TrainerPowerModeMessage.Builder, TrainerPowerModeMessageOrBuilder> getMsgFieldBuilder() {
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
            public TrainerPowerModeNotification build() {
                TrainerPowerModeNotification trainerPowerModeNotificationBuildPartial = buildPartial();
                if (trainerPowerModeNotificationBuildPartial.isInitialized()) {
                    return trainerPowerModeNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) trainerPowerModeNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrainerPowerModeNotification buildPartial() {
                TrainerPowerModeNotification trainerPowerModeNotification = new TrainerPowerModeNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(trainerPowerModeNotification);
                }
                onBuilt();
                return trainerPowerModeNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.msg_ = null;
                SingleFieldBuilderV3<TrainerPowerModeMessage, TrainerPowerModeMessage.Builder, TrainerPowerModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                SingleFieldBuilderV3<TrainerPowerModeMessage, TrainerPowerModeMessage.Builder, TrainerPowerModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeNotificationOrBuilder
            public TrainerPowerModeMessage getMsg() {
                SingleFieldBuilderV3<TrainerPowerModeMessage, TrainerPowerModeMessage.Builder, TrainerPowerModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrainerPowerModeMessage) singleFieldBuilderV3.getMessage();
                }
                TrainerPowerModeMessage trainerPowerModeMessage = this.msg_;
                return trainerPowerModeMessage == null ? TrainerPowerModeMessage.getDefaultInstance() : trainerPowerModeMessage;
            }

            public TrainerPowerModeMessage.Builder getMsgBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (TrainerPowerModeMessage.Builder) getMsgFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeNotificationOrBuilder
            public TrainerPowerModeMessageOrBuilder getMsgOrBuilder() {
                SingleFieldBuilderV3<TrainerPowerModeMessage, TrainerPowerModeMessage.Builder, TrainerPowerModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrainerPowerModeMessageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrainerPowerModeMessage trainerPowerModeMessage = this.msg_;
                return trainerPowerModeMessage == null ? TrainerPowerModeMessage.getDefaultInstance() : trainerPowerModeMessage;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeNotificationOrBuilder
            public boolean hasMsg() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(TrainerPowerModeNotification.class, Builder.class);
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

            public Builder mergeMsg(TrainerPowerModeMessage trainerPowerModeMessage) {
                TrainerPowerModeMessage trainerPowerModeMessage2;
                SingleFieldBuilderV3<TrainerPowerModeMessage, TrainerPowerModeMessage.Builder, TrainerPowerModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trainerPowerModeMessage);
                } else if ((this.bitField0_ & 1) == 0 || (trainerPowerModeMessage2 = this.msg_) == null || trainerPowerModeMessage2 == TrainerPowerModeMessage.getDefaultInstance()) {
                    this.msg_ = trainerPowerModeMessage;
                } else {
                    getMsgBuilder().mergeFrom(trainerPowerModeMessage);
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

            public Builder setMsg(TrainerPowerModeMessage.Builder builder) {
                SingleFieldBuilderV3<TrainerPowerModeMessage, TrainerPowerModeMessage.Builder, TrainerPowerModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
            public TrainerPowerModeNotification getDefaultInstanceForType() {
                return TrainerPowerModeNotification.getDefaultInstance();
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

            public Builder setMsg(TrainerPowerModeMessage trainerPowerModeMessage) {
                SingleFieldBuilderV3<TrainerPowerModeMessage, TrainerPowerModeMessage.Builder, TrainerPowerModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trainerPowerModeMessage.getClass();
                    this.msg_ = trainerPowerModeMessage;
                } else {
                    singleFieldBuilderV3.setMessage(trainerPowerModeMessage);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TrainerPowerModeNotification) {
                    return mergeFrom((TrainerPowerModeNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TrainerPowerModeNotification trainerPowerModeNotification) {
                if (trainerPowerModeNotification == TrainerPowerModeNotification.getDefaultInstance()) {
                    return this;
                }
                if (trainerPowerModeNotification.hasMsg()) {
                    mergeMsg(trainerPowerModeNotification.getMsg());
                }
                mergeUnknownFields(trainerPowerModeNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TrainerPowerModeNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ TrainerPowerModeNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private TrainerPowerModeNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrainerPowerModeNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrainerPowerModeNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrainerPowerModeNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TrainerPowerModeNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TrainerPowerModeNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TrainerPowerModeNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TrainerPowerModeNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TrainerPowerModeNotification parseFrom(InputStream inputStream) {
            return (TrainerPowerModeNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TrainerPowerModeNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrainerPowerModeNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrainerPowerModeNotification parseFrom(CodedInputStream codedInputStream) {
            return (TrainerPowerModeNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TrainerPowerModeNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrainerPowerModeNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TrainerPowerModeResponse extends GeneratedMessageV3 implements TrainerPowerModeResponseOrBuilder {
        public static final int MSG_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private TrainerPowerModeMessage msg_;
        private static final TrainerPowerModeResponse DEFAULT_INSTANCE = new TrainerPowerModeResponse();

        @Deprecated
        public static final Parser<TrainerPowerModeResponse> PARSER = new AbstractParser<TrainerPowerModeResponse>() { // from class: com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeResponse.1
            @Override // com.google.protobuf.Parser
            public TrainerPowerModeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TrainerPowerModeResponse.newBuilder();
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

        private TrainerPowerModeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrainerPowerModeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeResponse_descriptor;
        }

        public static Builder newBuilder(TrainerPowerModeResponse trainerPowerModeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(trainerPowerModeResponse);
        }

        public static TrainerPowerModeResponse parseDelimitedFrom(InputStream inputStream) {
            return (TrainerPowerModeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TrainerPowerModeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TrainerPowerModeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrainerPowerModeResponse)) {
                return super.equals(obj);
            }
            TrainerPowerModeResponse trainerPowerModeResponse = (TrainerPowerModeResponse) obj;
            if (hasMsg() != trainerPowerModeResponse.hasMsg()) {
                return false;
            }
            return (!hasMsg() || getMsg().equals(trainerPowerModeResponse.getMsg())) && getUnknownFields().equals(trainerPowerModeResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeResponseOrBuilder
        public TrainerPowerModeMessage getMsg() {
            TrainerPowerModeMessage trainerPowerModeMessage = this.msg_;
            return trainerPowerModeMessage == null ? TrainerPowerModeMessage.getDefaultInstance() : trainerPowerModeMessage;
        }

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeResponseOrBuilder
        public TrainerPowerModeMessageOrBuilder getMsgOrBuilder() {
            TrainerPowerModeMessage trainerPowerModeMessage = this.msg_;
            return trainerPowerModeMessage == null ? TrainerPowerModeMessage.getDefaultInstance() : trainerPowerModeMessage;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TrainerPowerModeResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeResponseOrBuilder
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
            return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TrainerPowerModeResponse.class, Builder.class);
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
            return new TrainerPowerModeResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TrainerPowerModeResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<TrainerPowerModeMessage, TrainerPowerModeMessage.Builder, TrainerPowerModeMessageOrBuilder> msgBuilder_;
            private TrainerPowerModeMessage msg_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(TrainerPowerModeResponse trainerPowerModeResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<TrainerPowerModeMessage, TrainerPowerModeMessage.Builder, TrainerPowerModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                    trainerPowerModeResponse.msg_ = singleFieldBuilderV3 == null ? this.msg_ : (TrainerPowerModeMessage) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                trainerPowerModeResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeResponse_descriptor;
            }

            private SingleFieldBuilderV3<TrainerPowerModeMessage, TrainerPowerModeMessage.Builder, TrainerPowerModeMessageOrBuilder> getMsgFieldBuilder() {
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
            public TrainerPowerModeResponse build() {
                TrainerPowerModeResponse trainerPowerModeResponseBuildPartial = buildPartial();
                if (trainerPowerModeResponseBuildPartial.isInitialized()) {
                    return trainerPowerModeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) trainerPowerModeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TrainerPowerModeResponse buildPartial() {
                TrainerPowerModeResponse trainerPowerModeResponse = new TrainerPowerModeResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(trainerPowerModeResponse);
                }
                onBuilt();
                return trainerPowerModeResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.msg_ = null;
                SingleFieldBuilderV3<TrainerPowerModeMessage, TrainerPowerModeMessage.Builder, TrainerPowerModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                SingleFieldBuilderV3<TrainerPowerModeMessage, TrainerPowerModeMessage.Builder, TrainerPowerModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeResponseOrBuilder
            public TrainerPowerModeMessage getMsg() {
                SingleFieldBuilderV3<TrainerPowerModeMessage, TrainerPowerModeMessage.Builder, TrainerPowerModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrainerPowerModeMessage) singleFieldBuilderV3.getMessage();
                }
                TrainerPowerModeMessage trainerPowerModeMessage = this.msg_;
                return trainerPowerModeMessage == null ? TrainerPowerModeMessage.getDefaultInstance() : trainerPowerModeMessage;
            }

            public TrainerPowerModeMessage.Builder getMsgBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (TrainerPowerModeMessage.Builder) getMsgFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeResponseOrBuilder
            public TrainerPowerModeMessageOrBuilder getMsgOrBuilder() {
                SingleFieldBuilderV3<TrainerPowerModeMessage, TrainerPowerModeMessage.Builder, TrainerPowerModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrainerPowerModeMessageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrainerPowerModeMessage trainerPowerModeMessage = this.msg_;
                return trainerPowerModeMessage == null ? TrainerPowerModeMessage.getDefaultInstance() : trainerPowerModeMessage;
            }

            @Override // com.garmin.proto.generated.GDIIndoorTrainer.TrainerPowerModeResponseOrBuilder
            public boolean hasMsg() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIndoorTrainer.internal_static_GDI_Proto_IndoorTrainer_TrainerPowerModeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TrainerPowerModeResponse.class, Builder.class);
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

            public Builder mergeMsg(TrainerPowerModeMessage trainerPowerModeMessage) {
                TrainerPowerModeMessage trainerPowerModeMessage2;
                SingleFieldBuilderV3<TrainerPowerModeMessage, TrainerPowerModeMessage.Builder, TrainerPowerModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trainerPowerModeMessage);
                } else if ((this.bitField0_ & 1) == 0 || (trainerPowerModeMessage2 = this.msg_) == null || trainerPowerModeMessage2 == TrainerPowerModeMessage.getDefaultInstance()) {
                    this.msg_ = trainerPowerModeMessage;
                } else {
                    getMsgBuilder().mergeFrom(trainerPowerModeMessage);
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

            public Builder setMsg(TrainerPowerModeMessage.Builder builder) {
                SingleFieldBuilderV3<TrainerPowerModeMessage, TrainerPowerModeMessage.Builder, TrainerPowerModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
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
            public TrainerPowerModeResponse getDefaultInstanceForType() {
                return TrainerPowerModeResponse.getDefaultInstance();
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

            public Builder setMsg(TrainerPowerModeMessage trainerPowerModeMessage) {
                SingleFieldBuilderV3<TrainerPowerModeMessage, TrainerPowerModeMessage.Builder, TrainerPowerModeMessageOrBuilder> singleFieldBuilderV3 = this.msgBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trainerPowerModeMessage.getClass();
                    this.msg_ = trainerPowerModeMessage;
                } else {
                    singleFieldBuilderV3.setMessage(trainerPowerModeMessage);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TrainerPowerModeResponse) {
                    return mergeFrom((TrainerPowerModeResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TrainerPowerModeResponse trainerPowerModeResponse) {
                if (trainerPowerModeResponse == TrainerPowerModeResponse.getDefaultInstance()) {
                    return this;
                }
                if (trainerPowerModeResponse.hasMsg()) {
                    mergeMsg(trainerPowerModeResponse.getMsg());
                }
                mergeUnknownFields(trainerPowerModeResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TrainerPowerModeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ TrainerPowerModeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private TrainerPowerModeResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TrainerPowerModeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrainerPowerModeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrainerPowerModeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TrainerPowerModeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TrainerPowerModeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TrainerPowerModeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TrainerPowerModeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TrainerPowerModeResponse parseFrom(InputStream inputStream) {
            return (TrainerPowerModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TrainerPowerModeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrainerPowerModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TrainerPowerModeResponse parseFrom(CodedInputStream codedInputStream) {
            return (TrainerPowerModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TrainerPowerModeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TrainerPowerModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
