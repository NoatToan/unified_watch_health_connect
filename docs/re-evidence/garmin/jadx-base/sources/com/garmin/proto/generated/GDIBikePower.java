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

/* JADX INFO: loaded from: classes11.dex */
public final class GDIBikePower {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012GDIBikePower.proto\u0012\u0013GDI.Proto.BikePower\u001a\rGDICore.proto\u001a\u0015GDIEventSharing.proto\"û\u0003\n\u0007Service\u0012A\n\u000econfig_request\u0018\u0001 \u0001(\u000b2).GDI.Proto.BikePower.ConfigurationRequest\u0012C\n\u000fconfig_response\u0018\u0002 \u0001(\u000b2*.GDI.Proto.BikePower.ConfigurationResponse\u0012K\n\u0013config_notification\u0018\u0003 \u0001(\u000b2..GDI.Proto.BikePower.ConfigurationNotification\u0012D\n\u0013calibration_request\u0018\u0004 \u0001(\u000b2'.GDI.Proto.BikePower.CalibrationRequest\u0012F\n\u0014calibration_response\u0018\u0005 \u0001(\u000b2(.GDI.Proto.BikePower.CalibrationResponse\u0012G\n\u0015pedal_iq_notification\u0018\u0006 \u0001(\u000b2(.GDI.Proto.BikePower.PedalIQNotification\u0012D\n\u0013status_notification\u0018\u0007 \u0001(\u000b2'.GDI.Proto.BikePower.StatusNotification\"\u0085\u0001\n\u0013CapabilitiesRequest2n\n\u0010features_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018\u001a \u0001(\u000b2(.GDI.Proto.BikePower.CapabilitiesRequest\"C\n\u0015BikePowerCapabilities\u0012*\n\"is_pedal_iq_notification_supported\u0018\u0001 \u0001(\b\"Ö\u0001\n\u0014CapabilitiesResponse\u0012K\n\u0017bike_power_capabilities\u0018\u0001 \u0001(\u000b2*.GDI.Proto.BikePower.BikePowerCapabilities2q\n\u0011features_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018\u001a \u0001(\u000b2).GDI.Proto.BikePower.CapabilitiesResponse\"ÿ\u0002\n\u0013ConfigurationFields\u0012\u0014\n\fcrank_length\u0018\u0001 \u0001(\r\u0012\u001e\n\u0016transition_time_offset\u0018\u0002 \u0001(\r\u0012\u001e\n\u0016peak_power_phase_range\u0018\u0003 \u0001(\r\u0012\u0019\n\u0011left_torque_scale\u0018\u0004 \u0001(\r\u0012\u001a\n\u0012right_torque_scale\u0018\u0005 \u0001(\r\u0012\u0019\n\u0011auto_zero_enabled\u0018\u0006 \u0001(\b\u0012\u0017\n\u000fpaired_pedal_id\u0018\u0007 \u0001(\r\u0012Y\n\u0014install_angle_status\u0018\b \u0001(\u000e2;.GDI.Proto.BikePower.ConfigurationFields.InstallAngleStatus\"L\n\u0012InstallAngleStatus\u0012\u000b\n\u0007NOT_SET\u0010\u0000\u0012\r\n\tRIGHT_SET\u0010\u0001\u0012\f\n\bLEFT_SET\u0010\u0002\u0012\f\n\bBOTH_SET\u0010\u0003\"P\n\u0014ConfigurationRequest\u00128\n\u0006config\u0018\u0001 \u0001(\u000b2(.GDI.Proto.BikePower.ConfigurationFields\"Ô\u0001\n\u0015ConfigurationResponse\u0012N\n\u0006status\u0018\u0001 \u0001(\u000e2>.GDI.Proto.BikePower.ConfigurationResponse.ConfigurationStatus\u00128\n\u0006config\u0018\u0002 \u0001(\u000b2(.GDI.Proto.BikePower.ConfigurationFields\"1\n\u0013ConfigurationStatus\u0012\f\n\bACCEPTED\u0010\u0000\u0012\f\n\bREJECTED\u0010\u0001\"U\n\u0019ConfigurationNotification\u00128\n\u0006config\u0018\u0001 \u0001(\u000b2(.GDI.Proto.BikePower.ConfigurationFields\"¡\u0001\n\u0012StatusNotification\u0012R\n\rp2p_connected\u0018\u0001 \u0001(\u000e2;.GDI.Proto.BikePower.StatusNotification.P2PConnectionStatus\"7\n\u0013P2PConnectionStatus\u0012\u0011\n\rNOT_CONNECTED\u0010\u0000\u0012\r\n\tCONNECTED\u0010\u0001\"\u0014\n\u0012CalibrationRequest\"%\n\u0013CalibrationResponse\u0012\u000e\n\u0006status\u0018\u0001 \u0001(\r\"Æ\u0001\n\u0013PedalIQNotification\u0012P\n\u000fdetected_change\u0018\u0001 \u0001(\u000e27.GDI.Proto.BikePower.PedalIQNotification.DetectedChange\"]\n\u000eDetectedChange\u0012\u000f\n\u000bTemperature\u0010\u0000\u0012\u0013\n\u000fCalibrationTime\u0010\u0001\u0012\u0013\n\u000fCorrectedTorque\u0010\u0002\u0012\u0010\n\fInstallAngle\u0010\u0003\"å\u0001\n\tPedalData\u0012\u0012\n\npco_1_2_mm\u0018\u0001 \u0001(\u0011\u0012$\n\u001cpower_phase_start_1024_brads\u0018\u0002 \u0001(\r\u0012\"\n\u001apower_phase_end_1024_brads\u0018\u0003 \u0001(\r\u0012)\n!power_phase_peak_start_1024_brads\u0018\u0004 \u0001(\r\u0012'\n\u001fpower_phase_peak_end_1024_brads\u0018\u0005 \u0001(\r\u0012\u0012\n\nte_percent\u0018\u0006 \u0001(\r\u0012\u0012\n\nps_percent\u0018\u0007 \u0001(\r\"À\u0005\n\u0017MeasurementNotification\u0012 \n\u0018event_timestamp_1_2048_s\u0018\u0001 \u0001(\r\u0012\u001e\n\u0016crank_angle_1024_brads\u0018\u0002 \u0001(\r\u0012\u001d\n\u0015cumulative_work_1_4_j\u0018\u0003 \u0001(\u0011\u0012\u001d\n\u0015cycle_period_1_2048_s\u0018\u0004 \u0001(\r\u0012\u0015\n\rcoasting_flag\u0018\u0005 \u0001(\b\u0012\u0013\n\u000bpower_1_2_w\u0018\u0006 \u0001(\r\u0012\u0017\n\u000fbalance_percent\u0018\u0007 \u0001(\r\u00127\n\u000fleft_pedal_data\u0018\b \u0001(\u000b2\u001e.GDI.Proto.BikePower.PedalData\u00128\n\u0010right_pedal_data\u0018\t \u0001(\u000b2\u001e.GDI.Proto.BikePower.PedalData\u0012R\n\u000erider_position\u0018\n \u0001(\u000e2:.GDI.Proto.BikePower.MeasurementNotification.RiderPosition\u0012\u001f\n\u0017coasting_torque_1_32_Nm\u0018\u000b \u0001(\u0011\u0012\u0017\n\u000fcadence_1_8_rpm\u0018\f \u0001(\r\u0012\u0016\n\u000etorque_1_32_Nm\u0018\r \u0001(\u0011\"_\n\rRiderPosition\u0012\n\n\u0006SEATED\u0010\u0000\u0012\u0018\n\u0014TRANSITION_TO_SEATED\u0010\u0001\u0012\f\n\bSTANDING\u0010\u0002\u0012\u001a\n\u0016TRANSITION_TO_STANDING\u0010\u00032f\n\u0004data\u0012).GDI.Proto.EventSharing.AlertNotification\u0018ù\u0007 \u0001(\u000b2,.GDI.Proto.BikePower.MeasurementNotificationB,\n\u001acom.garmin.proto.generatedB\fGDIBikePowerH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor(), GDIEventSharingProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikePower_BikePowerCapabilities_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikePower_BikePowerCapabilities_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikePower_CalibrationRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikePower_CalibrationRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikePower_CalibrationResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikePower_CalibrationResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikePower_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikePower_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikePower_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikePower_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikePower_ConfigurationFields_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikePower_ConfigurationFields_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikePower_ConfigurationNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikePower_ConfigurationNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikePower_ConfigurationRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikePower_ConfigurationRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikePower_ConfigurationResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikePower_ConfigurationResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikePower_MeasurementNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikePower_MeasurementNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikePower_PedalData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikePower_PedalData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikePower_PedalIQNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikePower_PedalIQNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikePower_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikePower_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikePower_StatusNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikePower_StatusNotification_fieldAccessorTable;

    public interface BikePowerCapabilitiesOrBuilder extends MessageOrBuilder {
        boolean getIsPedalIqNotificationSupported();

        boolean hasIsPedalIqNotificationSupported();
    }

    public interface CalibrationRequestOrBuilder extends MessageOrBuilder {
    }

    public interface CalibrationResponseOrBuilder extends MessageOrBuilder {
        int getStatus();

        boolean hasStatus();
    }

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        BikePowerCapabilities getBikePowerCapabilities();

        BikePowerCapabilitiesOrBuilder getBikePowerCapabilitiesOrBuilder();

        boolean hasBikePowerCapabilities();
    }

    public interface ConfigurationFieldsOrBuilder extends MessageOrBuilder {
        boolean getAutoZeroEnabled();

        int getCrankLength();

        ConfigurationFields.InstallAngleStatus getInstallAngleStatus();

        int getLeftTorqueScale();

        int getPairedPedalId();

        int getPeakPowerPhaseRange();

        int getRightTorqueScale();

        int getTransitionTimeOffset();

        boolean hasAutoZeroEnabled();

        boolean hasCrankLength();

        boolean hasInstallAngleStatus();

        boolean hasLeftTorqueScale();

        boolean hasPairedPedalId();

        boolean hasPeakPowerPhaseRange();

        boolean hasRightTorqueScale();

        boolean hasTransitionTimeOffset();
    }

    public interface ConfigurationNotificationOrBuilder extends MessageOrBuilder {
        ConfigurationFields getConfig();

        ConfigurationFieldsOrBuilder getConfigOrBuilder();

        boolean hasConfig();
    }

    public interface ConfigurationRequestOrBuilder extends MessageOrBuilder {
        ConfigurationFields getConfig();

        ConfigurationFieldsOrBuilder getConfigOrBuilder();

        boolean hasConfig();
    }

    public interface ConfigurationResponseOrBuilder extends MessageOrBuilder {
        ConfigurationFields getConfig();

        ConfigurationFieldsOrBuilder getConfigOrBuilder();

        ConfigurationResponse.ConfigurationStatus getStatus();

        boolean hasConfig();

        boolean hasStatus();
    }

    public interface MeasurementNotificationOrBuilder extends MessageOrBuilder {
        int getBalancePercent();

        int getCadence18Rpm();

        boolean getCoastingFlag();

        int getCoastingTorque132Nm();

        int getCrankAngle1024Brads();

        int getCumulativeWork14J();

        int getCyclePeriod12048S();

        int getEventTimestamp12048S();

        PedalData getLeftPedalData();

        PedalDataOrBuilder getLeftPedalDataOrBuilder();

        int getPower12W();

        MeasurementNotification.RiderPosition getRiderPosition();

        PedalData getRightPedalData();

        PedalDataOrBuilder getRightPedalDataOrBuilder();

        int getTorque132Nm();

        boolean hasBalancePercent();

        boolean hasCadence18Rpm();

        boolean hasCoastingFlag();

        boolean hasCoastingTorque132Nm();

        boolean hasCrankAngle1024Brads();

        boolean hasCumulativeWork14J();

        boolean hasCyclePeriod12048S();

        boolean hasEventTimestamp12048S();

        boolean hasLeftPedalData();

        boolean hasPower12W();

        boolean hasRiderPosition();

        boolean hasRightPedalData();

        boolean hasTorque132Nm();
    }

    public interface PedalDataOrBuilder extends MessageOrBuilder {
        int getPco12Mm();

        int getPowerPhaseEnd1024Brads();

        int getPowerPhasePeakEnd1024Brads();

        int getPowerPhasePeakStart1024Brads();

        int getPowerPhaseStart1024Brads();

        int getPsPercent();

        int getTePercent();

        boolean hasPco12Mm();

        boolean hasPowerPhaseEnd1024Brads();

        boolean hasPowerPhasePeakEnd1024Brads();

        boolean hasPowerPhasePeakStart1024Brads();

        boolean hasPowerPhaseStart1024Brads();

        boolean hasPsPercent();

        boolean hasTePercent();
    }

    public interface PedalIQNotificationOrBuilder extends MessageOrBuilder {
        PedalIQNotification.DetectedChange getDetectedChange();

        boolean hasDetectedChange();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        CalibrationRequest getCalibrationRequest();

        CalibrationRequestOrBuilder getCalibrationRequestOrBuilder();

        CalibrationResponse getCalibrationResponse();

        CalibrationResponseOrBuilder getCalibrationResponseOrBuilder();

        ConfigurationNotification getConfigNotification();

        ConfigurationNotificationOrBuilder getConfigNotificationOrBuilder();

        ConfigurationRequest getConfigRequest();

        ConfigurationRequestOrBuilder getConfigRequestOrBuilder();

        ConfigurationResponse getConfigResponse();

        ConfigurationResponseOrBuilder getConfigResponseOrBuilder();

        PedalIQNotification getPedalIqNotification();

        PedalIQNotificationOrBuilder getPedalIqNotificationOrBuilder();

        StatusNotification getStatusNotification();

        StatusNotificationOrBuilder getStatusNotificationOrBuilder();

        boolean hasCalibrationRequest();

        boolean hasCalibrationResponse();

        boolean hasConfigNotification();

        boolean hasConfigRequest();

        boolean hasConfigResponse();

        boolean hasPedalIqNotification();

        boolean hasStatusNotification();
    }

    public interface StatusNotificationOrBuilder extends MessageOrBuilder {
        StatusNotification.P2PConnectionStatus getP2PConnected();

        boolean hasP2PConnected();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_BikePower_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_BikePower_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ConfigRequest", "ConfigResponse", "ConfigNotification", "CalibrationRequest", "CalibrationResponse", "PedalIqNotification", "StatusNotification"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_BikePower_CapabilitiesRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_BikePower_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_BikePower_BikePowerCapabilities_descriptor = descriptor4;
        internal_static_GDI_Proto_BikePower_BikePowerCapabilities_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"IsPedalIqNotificationSupported"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_BikePower_CapabilitiesResponse_descriptor = descriptor5;
        internal_static_GDI_Proto_BikePower_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"BikePowerCapabilities"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_BikePower_ConfigurationFields_descriptor = descriptor6;
        internal_static_GDI_Proto_BikePower_ConfigurationFields_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"CrankLength", "TransitionTimeOffset", "PeakPowerPhaseRange", "LeftTorqueScale", "RightTorqueScale", "AutoZeroEnabled", "PairedPedalId", "InstallAngleStatus"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_BikePower_ConfigurationRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_BikePower_ConfigurationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Config"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_BikePower_ConfigurationResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_BikePower_ConfigurationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Status", "Config"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_BikePower_ConfigurationNotification_descriptor = descriptor9;
        internal_static_GDI_Proto_BikePower_ConfigurationNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Config"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_BikePower_StatusNotification_descriptor = descriptor10;
        internal_static_GDI_Proto_BikePower_StatusNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"P2PConnected"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_BikePower_CalibrationRequest_descriptor = descriptor11;
        internal_static_GDI_Proto_BikePower_CalibrationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[0]);
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_BikePower_CalibrationResponse_descriptor = descriptor12;
        internal_static_GDI_Proto_BikePower_CalibrationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Status"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_BikePower_PedalIQNotification_descriptor = descriptor13;
        internal_static_GDI_Proto_BikePower_PedalIQNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"DetectedChange"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_GDI_Proto_BikePower_PedalData_descriptor = descriptor14;
        internal_static_GDI_Proto_BikePower_PedalData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Pco12Mm", "PowerPhaseStart1024Brads", "PowerPhaseEnd1024Brads", "PowerPhasePeakStart1024Brads", "PowerPhasePeakEnd1024Brads", "TePercent", "PsPercent"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(13);
        internal_static_GDI_Proto_BikePower_MeasurementNotification_descriptor = descriptor15;
        internal_static_GDI_Proto_BikePower_MeasurementNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"EventTimestamp12048S", "CrankAngle1024Brads", "CumulativeWork14J", "CyclePeriod12048S", "CoastingFlag", "Power12W", "BalancePercent", "LeftPedalData", "RightPedalData", "RiderPosition", "CoastingTorque132Nm", "Cadence18Rpm", "Torque132Nm"});
        GDICore.getDescriptor();
        GDIEventSharingProto.getDescriptor();
    }

    private GDIBikePower() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.featuresRequest);
        extensionRegistryLite.add(CapabilitiesResponse.featuresResponse);
        extensionRegistryLite.add(MeasurementNotification.data);
    }

    public static final class BikePowerCapabilities extends GeneratedMessageV3 implements BikePowerCapabilitiesOrBuilder {
        public static final int IS_PEDAL_IQ_NOTIFICATION_SUPPORTED_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean isPedalIqNotificationSupported_;
        private byte memoizedIsInitialized;
        private static final BikePowerCapabilities DEFAULT_INSTANCE = new BikePowerCapabilities();

        @Deprecated
        public static final Parser<BikePowerCapabilities> PARSER = new AbstractParser<BikePowerCapabilities>() { // from class: com.garmin.proto.generated.GDIBikePower.BikePowerCapabilities.1
            @Override // com.google.protobuf.Parser
            public BikePowerCapabilities parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = BikePowerCapabilities.newBuilder();
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

        private BikePowerCapabilities(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.isPedalIqNotificationSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static BikePowerCapabilities getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_BikePowerCapabilities_descriptor;
        }

        public static Builder newBuilder(BikePowerCapabilities bikePowerCapabilities) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(bikePowerCapabilities);
        }

        public static BikePowerCapabilities parseDelimitedFrom(InputStream inputStream) {
            return (BikePowerCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BikePowerCapabilities parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<BikePowerCapabilities> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BikePowerCapabilities)) {
                return super.equals(obj);
            }
            BikePowerCapabilities bikePowerCapabilities = (BikePowerCapabilities) obj;
            if (hasIsPedalIqNotificationSupported() != bikePowerCapabilities.hasIsPedalIqNotificationSupported()) {
                return false;
            }
            return (!hasIsPedalIqNotificationSupported() || getIsPedalIqNotificationSupported() == bikePowerCapabilities.getIsPedalIqNotificationSupported()) && getUnknownFields().equals(bikePowerCapabilities.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIBikePower.BikePowerCapabilitiesOrBuilder
        public boolean getIsPedalIqNotificationSupported() {
            return this.isPedalIqNotificationSupported_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<BikePowerCapabilities> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.isPedalIqNotificationSupported_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.BikePowerCapabilitiesOrBuilder
        public boolean hasIsPedalIqNotificationSupported() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasIsPedalIqNotificationSupported()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getIsPedalIqNotificationSupported());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_BikePowerCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(BikePowerCapabilities.class, Builder.class);
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
            return new BikePowerCapabilities();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.isPedalIqNotificationSupported_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BikePowerCapabilitiesOrBuilder {
            private int bitField0_;
            private boolean isPedalIqNotificationSupported_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(BikePowerCapabilities bikePowerCapabilities) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    bikePowerCapabilities.isPedalIqNotificationSupported_ = this.isPedalIqNotificationSupported_;
                } else {
                    i14 = 0;
                }
                bikePowerCapabilities.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_BikePowerCapabilities_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BikePowerCapabilities build() {
                BikePowerCapabilities bikePowerCapabilitiesBuildPartial = buildPartial();
                if (bikePowerCapabilitiesBuildPartial.isInitialized()) {
                    return bikePowerCapabilitiesBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) bikePowerCapabilitiesBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BikePowerCapabilities buildPartial() {
                BikePowerCapabilities bikePowerCapabilities = new BikePowerCapabilities(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(bikePowerCapabilities);
                }
                onBuilt();
                return bikePowerCapabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.isPedalIqNotificationSupported_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIsPedalIqNotificationSupported() {
                this.bitField0_ &= -2;
                this.isPedalIqNotificationSupported_ = false;
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
                return GDIBikePower.internal_static_GDI_Proto_BikePower_BikePowerCapabilities_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.BikePowerCapabilitiesOrBuilder
            public boolean getIsPedalIqNotificationSupported() {
                return this.isPedalIqNotificationSupported_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.BikePowerCapabilitiesOrBuilder
            public boolean hasIsPedalIqNotificationSupported() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_BikePowerCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(BikePowerCapabilities.class, Builder.class);
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
                                    this.isPedalIqNotificationSupported_ = codedInputStream.readBool();
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

            public Builder setIsPedalIqNotificationSupported(boolean z14) {
                this.isPedalIqNotificationSupported_ = z14;
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
            public BikePowerCapabilities getDefaultInstanceForType() {
                return BikePowerCapabilities.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof BikePowerCapabilities) {
                    return mergeFrom((BikePowerCapabilities) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(BikePowerCapabilities bikePowerCapabilities) {
                if (bikePowerCapabilities == BikePowerCapabilities.getDefaultInstance()) {
                    return this;
                }
                if (bikePowerCapabilities.hasIsPedalIqNotificationSupported()) {
                    setIsPedalIqNotificationSupported(bikePowerCapabilities.getIsPedalIqNotificationSupported());
                }
                mergeUnknownFields(bikePowerCapabilities.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public BikePowerCapabilities getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static BikePowerCapabilities parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BikePowerCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BikePowerCapabilities parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ BikePowerCapabilities(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static BikePowerCapabilities parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private BikePowerCapabilities() {
            this.isPedalIqNotificationSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BikePowerCapabilities parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static BikePowerCapabilities parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static BikePowerCapabilities parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static BikePowerCapabilities parseFrom(InputStream inputStream) {
            return (BikePowerCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static BikePowerCapabilities parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BikePowerCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BikePowerCapabilities parseFrom(CodedInputStream codedInputStream) {
            return (BikePowerCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static BikePowerCapabilities parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BikePowerCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CalibrationRequest extends GeneratedMessageV3 implements CalibrationRequestOrBuilder {
        private static final CalibrationRequest DEFAULT_INSTANCE = new CalibrationRequest();

        @Deprecated
        public static final Parser<CalibrationRequest> PARSER = new AbstractParser<CalibrationRequest>() { // from class: com.garmin.proto.generated.GDIBikePower.CalibrationRequest.1
            @Override // com.google.protobuf.Parser
            public CalibrationRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CalibrationRequest.newBuilder();
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

        private CalibrationRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CalibrationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_CalibrationRequest_descriptor;
        }

        public static Builder newBuilder(CalibrationRequest calibrationRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(calibrationRequest);
        }

        public static CalibrationRequest parseDelimitedFrom(InputStream inputStream) {
            return (CalibrationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CalibrationRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CalibrationRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CalibrationRequest) {
                return getUnknownFields().equals(((CalibrationRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CalibrationRequest> getParserForType() {
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
            return GDIBikePower.internal_static_GDI_Proto_BikePower_CalibrationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CalibrationRequest.class, Builder.class);
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
            return new CalibrationRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CalibrationRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_CalibrationRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CalibrationRequest build() {
                CalibrationRequest calibrationRequestBuildPartial = buildPartial();
                if (calibrationRequestBuildPartial.isInitialized()) {
                    return calibrationRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) calibrationRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CalibrationRequest buildPartial() {
                CalibrationRequest calibrationRequest = new CalibrationRequest(this);
                onBuilt();
                return calibrationRequest;
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
                return GDIBikePower.internal_static_GDI_Proto_BikePower_CalibrationRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_CalibrationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CalibrationRequest.class, Builder.class);
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
            public CalibrationRequest getDefaultInstanceForType() {
                return CalibrationRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CalibrationRequest) {
                    return mergeFrom((CalibrationRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CalibrationRequest calibrationRequest) {
                if (calibrationRequest == CalibrationRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(calibrationRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CalibrationRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ CalibrationRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CalibrationRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CalibrationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalibrationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CalibrationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CalibrationRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CalibrationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CalibrationRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CalibrationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CalibrationRequest parseFrom(InputStream inputStream) {
            return (CalibrationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CalibrationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalibrationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CalibrationRequest parseFrom(CodedInputStream codedInputStream) {
            return (CalibrationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CalibrationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalibrationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CalibrationResponse extends GeneratedMessageV3 implements CalibrationResponseOrBuilder {
        private static final CalibrationResponse DEFAULT_INSTANCE = new CalibrationResponse();

        @Deprecated
        public static final Parser<CalibrationResponse> PARSER = new AbstractParser<CalibrationResponse>() { // from class: com.garmin.proto.generated.GDIBikePower.CalibrationResponse.1
            @Override // com.google.protobuf.Parser
            public CalibrationResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CalibrationResponse.newBuilder();
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

        private CalibrationResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CalibrationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_CalibrationResponse_descriptor;
        }

        public static Builder newBuilder(CalibrationResponse calibrationResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(calibrationResponse);
        }

        public static CalibrationResponse parseDelimitedFrom(InputStream inputStream) {
            return (CalibrationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CalibrationResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CalibrationResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CalibrationResponse)) {
                return super.equals(obj);
            }
            CalibrationResponse calibrationResponse = (CalibrationResponse) obj;
            if (hasStatus() != calibrationResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || getStatus() == calibrationResponse.getStatus()) && getUnknownFields().equals(calibrationResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CalibrationResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.status_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.CalibrationResponseOrBuilder
        public int getStatus() {
            return this.status_;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.CalibrationResponseOrBuilder
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
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getStatus();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_CalibrationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CalibrationResponse.class, Builder.class);
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
            return new CalibrationResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CalibrationResponseOrBuilder {
            private int bitField0_;
            private int status_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(CalibrationResponse calibrationResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    calibrationResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                calibrationResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_CalibrationResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CalibrationResponse build() {
                CalibrationResponse calibrationResponseBuildPartial = buildPartial();
                if (calibrationResponseBuildPartial.isInitialized()) {
                    return calibrationResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) calibrationResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CalibrationResponse buildPartial() {
                CalibrationResponse calibrationResponse = new CalibrationResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(calibrationResponse);
                }
                onBuilt();
                return calibrationResponse;
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
                return GDIBikePower.internal_static_GDI_Proto_BikePower_CalibrationResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.CalibrationResponseOrBuilder
            public int getStatus() {
                return this.status_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.CalibrationResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_CalibrationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CalibrationResponse.class, Builder.class);
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
                                    this.status_ = codedInputStream.readUInt32();
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

            public Builder setStatus(int i14) {
                this.status_ = i14;
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
            public CalibrationResponse getDefaultInstanceForType() {
                return CalibrationResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CalibrationResponse) {
                    return mergeFrom((CalibrationResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CalibrationResponse calibrationResponse) {
                if (calibrationResponse == CalibrationResponse.getDefaultInstance()) {
                    return this;
                }
                if (calibrationResponse.hasStatus()) {
                    setStatus(calibrationResponse.getStatus());
                }
                mergeUnknownFields(calibrationResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CalibrationResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CalibrationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalibrationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CalibrationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ CalibrationResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CalibrationResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CalibrationResponse() {
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CalibrationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CalibrationResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CalibrationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CalibrationResponse parseFrom(InputStream inputStream) {
            return (CalibrationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CalibrationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalibrationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CalibrationResponse parseFrom(CodedInputStream codedInputStream) {
            return (CalibrationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CalibrationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalibrationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int FEATURES_REQUEST_FIELD_NUMBER = 26;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIBikePower.CapabilitiesRequest.1
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
            return GDIBikePower.internal_static_GDI_Proto_BikePower_CapabilitiesRequest_descriptor;
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
            return GDIBikePower.internal_static_GDI_Proto_BikePower_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                return GDIBikePower.internal_static_GDI_Proto_BikePower_CapabilitiesRequest_descriptor;
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
                return GDIBikePower.internal_static_GDI_Proto_BikePower_CapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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

    public static final class PedalData extends GeneratedMessageV3 implements PedalDataOrBuilder {
        private static final PedalData DEFAULT_INSTANCE = new PedalData();

        @Deprecated
        public static final Parser<PedalData> PARSER = new AbstractParser<PedalData>() { // from class: com.garmin.proto.generated.GDIBikePower.PedalData.1
            @Override // com.google.protobuf.Parser
            public PedalData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PedalData.newBuilder();
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
        public static final int PCO_1_2_MM_FIELD_NUMBER = 1;
        public static final int POWER_PHASE_END_1024_BRADS_FIELD_NUMBER = 3;
        public static final int POWER_PHASE_PEAK_END_1024_BRADS_FIELD_NUMBER = 5;
        public static final int POWER_PHASE_PEAK_START_1024_BRADS_FIELD_NUMBER = 4;
        public static final int POWER_PHASE_START_1024_BRADS_FIELD_NUMBER = 2;
        public static final int PS_PERCENT_FIELD_NUMBER = 7;
        public static final int TE_PERCENT_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int pco12Mm_;
        private int powerPhaseEnd1024Brads_;
        private int powerPhasePeakEnd1024Brads_;
        private int powerPhasePeakStart1024Brads_;
        private int powerPhaseStart1024Brads_;
        private int psPercent_;
        private int tePercent_;

        private PedalData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.pco12Mm_ = 0;
            this.powerPhaseStart1024Brads_ = 0;
            this.powerPhaseEnd1024Brads_ = 0;
            this.powerPhasePeakStart1024Brads_ = 0;
            this.powerPhasePeakEnd1024Brads_ = 0;
            this.tePercent_ = 0;
            this.psPercent_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PedalData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_PedalData_descriptor;
        }

        public static Builder newBuilder(PedalData pedalData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pedalData);
        }

        public static PedalData parseDelimitedFrom(InputStream inputStream) {
            return (PedalData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PedalData parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PedalData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PedalData)) {
                return super.equals(obj);
            }
            PedalData pedalData = (PedalData) obj;
            if (hasPco12Mm() != pedalData.hasPco12Mm()) {
                return false;
            }
            if ((hasPco12Mm() && getPco12Mm() != pedalData.getPco12Mm()) || hasPowerPhaseStart1024Brads() != pedalData.hasPowerPhaseStart1024Brads()) {
                return false;
            }
            if ((hasPowerPhaseStart1024Brads() && getPowerPhaseStart1024Brads() != pedalData.getPowerPhaseStart1024Brads()) || hasPowerPhaseEnd1024Brads() != pedalData.hasPowerPhaseEnd1024Brads()) {
                return false;
            }
            if ((hasPowerPhaseEnd1024Brads() && getPowerPhaseEnd1024Brads() != pedalData.getPowerPhaseEnd1024Brads()) || hasPowerPhasePeakStart1024Brads() != pedalData.hasPowerPhasePeakStart1024Brads()) {
                return false;
            }
            if ((hasPowerPhasePeakStart1024Brads() && getPowerPhasePeakStart1024Brads() != pedalData.getPowerPhasePeakStart1024Brads()) || hasPowerPhasePeakEnd1024Brads() != pedalData.hasPowerPhasePeakEnd1024Brads()) {
                return false;
            }
            if ((hasPowerPhasePeakEnd1024Brads() && getPowerPhasePeakEnd1024Brads() != pedalData.getPowerPhasePeakEnd1024Brads()) || hasTePercent() != pedalData.hasTePercent()) {
                return false;
            }
            if ((!hasTePercent() || getTePercent() == pedalData.getTePercent()) && hasPsPercent() == pedalData.hasPsPercent()) {
                return (!hasPsPercent() || getPsPercent() == pedalData.getPsPercent()) && getUnknownFields().equals(pedalData.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PedalData> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
        public int getPco12Mm() {
            return this.pco12Mm_;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
        public int getPowerPhaseEnd1024Brads() {
            return this.powerPhaseEnd1024Brads_;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
        public int getPowerPhasePeakEnd1024Brads() {
            return this.powerPhasePeakEnd1024Brads_;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
        public int getPowerPhasePeakStart1024Brads() {
            return this.powerPhasePeakStart1024Brads_;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
        public int getPowerPhaseStart1024Brads() {
            return this.powerPhaseStart1024Brads_;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
        public int getPsPercent() {
            return this.psPercent_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeSInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeSInt32Size(1, this.pco12Mm_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeSInt32Size += CodedOutputStream.computeUInt32Size(2, this.powerPhaseStart1024Brads_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeSInt32Size += CodedOutputStream.computeUInt32Size(3, this.powerPhaseEnd1024Brads_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeSInt32Size += CodedOutputStream.computeUInt32Size(4, this.powerPhasePeakStart1024Brads_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeSInt32Size += CodedOutputStream.computeUInt32Size(5, this.powerPhasePeakEnd1024Brads_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeSInt32Size += CodedOutputStream.computeUInt32Size(6, this.tePercent_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeSInt32Size += CodedOutputStream.computeUInt32Size(7, this.psPercent_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeSInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
        public int getTePercent() {
            return this.tePercent_;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
        public boolean hasPco12Mm() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
        public boolean hasPowerPhaseEnd1024Brads() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
        public boolean hasPowerPhasePeakEnd1024Brads() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
        public boolean hasPowerPhasePeakStart1024Brads() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
        public boolean hasPowerPhaseStart1024Brads() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
        public boolean hasPsPercent() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
        public boolean hasTePercent() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPco12Mm()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPco12Mm();
            }
            if (hasPowerPhaseStart1024Brads()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getPowerPhaseStart1024Brads();
            }
            if (hasPowerPhaseEnd1024Brads()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getPowerPhaseEnd1024Brads();
            }
            if (hasPowerPhasePeakStart1024Brads()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getPowerPhasePeakStart1024Brads();
            }
            if (hasPowerPhasePeakEnd1024Brads()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getPowerPhasePeakEnd1024Brads();
            }
            if (hasTePercent()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getTePercent();
            }
            if (hasPsPercent()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getPsPercent();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_PedalData_fieldAccessorTable.ensureFieldAccessorsInitialized(PedalData.class, Builder.class);
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
            return new PedalData();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeSInt32(1, this.pco12Mm_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.powerPhaseStart1024Brads_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.powerPhaseEnd1024Brads_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.powerPhasePeakStart1024Brads_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.powerPhasePeakEnd1024Brads_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.tePercent_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(7, this.psPercent_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PedalDataOrBuilder {
            private int bitField0_;
            private int pco12Mm_;
            private int powerPhaseEnd1024Brads_;
            private int powerPhasePeakEnd1024Brads_;
            private int powerPhasePeakStart1024Brads_;
            private int powerPhaseStart1024Brads_;
            private int psPercent_;
            private int tePercent_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(PedalData pedalData) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    pedalData.pco12Mm_ = this.pco12Mm_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    pedalData.powerPhaseStart1024Brads_ = this.powerPhaseStart1024Brads_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    pedalData.powerPhaseEnd1024Brads_ = this.powerPhaseEnd1024Brads_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    pedalData.powerPhasePeakStart1024Brads_ = this.powerPhasePeakStart1024Brads_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    pedalData.powerPhasePeakEnd1024Brads_ = this.powerPhasePeakEnd1024Brads_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    pedalData.tePercent_ = this.tePercent_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    pedalData.psPercent_ = this.psPercent_;
                    i14 |= 64;
                }
                pedalData.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_PedalData_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PedalData build() {
                PedalData pedalDataBuildPartial = buildPartial();
                if (pedalDataBuildPartial.isInitialized()) {
                    return pedalDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pedalDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PedalData buildPartial() {
                PedalData pedalData = new PedalData(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(pedalData);
                }
                onBuilt();
                return pedalData;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.pco12Mm_ = 0;
                this.powerPhaseStart1024Brads_ = 0;
                this.powerPhaseEnd1024Brads_ = 0;
                this.powerPhasePeakStart1024Brads_ = 0;
                this.powerPhasePeakEnd1024Brads_ = 0;
                this.tePercent_ = 0;
                this.psPercent_ = 0;
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

            public Builder clearPco12Mm() {
                this.bitField0_ &= -2;
                this.pco12Mm_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPowerPhaseEnd1024Brads() {
                this.bitField0_ &= -5;
                this.powerPhaseEnd1024Brads_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPowerPhasePeakEnd1024Brads() {
                this.bitField0_ &= -17;
                this.powerPhasePeakEnd1024Brads_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPowerPhasePeakStart1024Brads() {
                this.bitField0_ &= -9;
                this.powerPhasePeakStart1024Brads_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPowerPhaseStart1024Brads() {
                this.bitField0_ &= -3;
                this.powerPhaseStart1024Brads_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPsPercent() {
                this.bitField0_ &= -65;
                this.psPercent_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTePercent() {
                this.bitField0_ &= -33;
                this.tePercent_ = 0;
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
                return GDIBikePower.internal_static_GDI_Proto_BikePower_PedalData_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
            public int getPco12Mm() {
                return this.pco12Mm_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
            public int getPowerPhaseEnd1024Brads() {
                return this.powerPhaseEnd1024Brads_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
            public int getPowerPhasePeakEnd1024Brads() {
                return this.powerPhasePeakEnd1024Brads_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
            public int getPowerPhasePeakStart1024Brads() {
                return this.powerPhasePeakStart1024Brads_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
            public int getPowerPhaseStart1024Brads() {
                return this.powerPhaseStart1024Brads_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
            public int getPsPercent() {
                return this.psPercent_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
            public int getTePercent() {
                return this.tePercent_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
            public boolean hasPco12Mm() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
            public boolean hasPowerPhaseEnd1024Brads() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
            public boolean hasPowerPhasePeakEnd1024Brads() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
            public boolean hasPowerPhasePeakStart1024Brads() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
            public boolean hasPowerPhaseStart1024Brads() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
            public boolean hasPsPercent() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.PedalDataOrBuilder
            public boolean hasTePercent() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_PedalData_fieldAccessorTable.ensureFieldAccessorsInitialized(PedalData.class, Builder.class);
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
                                    this.pco12Mm_ = codedInputStream.readSInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.powerPhaseStart1024Brads_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.powerPhaseEnd1024Brads_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.powerPhasePeakStart1024Brads_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.powerPhasePeakEnd1024Brads_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    this.tePercent_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                } else if (tag == 56) {
                                    this.psPercent_ = codedInputStream.readUInt32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setPco12Mm(int i14) {
                this.pco12Mm_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPowerPhaseEnd1024Brads(int i14) {
                this.powerPhaseEnd1024Brads_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPowerPhasePeakEnd1024Brads(int i14) {
                this.powerPhasePeakEnd1024Brads_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setPowerPhasePeakStart1024Brads(int i14) {
                this.powerPhasePeakStart1024Brads_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setPowerPhaseStart1024Brads(int i14) {
                this.powerPhaseStart1024Brads_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPsPercent(int i14) {
                this.psPercent_ = i14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTePercent(int i14) {
                this.tePercent_ = i14;
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
            public PedalData getDefaultInstanceForType() {
                return PedalData.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PedalData) {
                    return mergeFrom((PedalData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PedalData pedalData) {
                if (pedalData == PedalData.getDefaultInstance()) {
                    return this;
                }
                if (pedalData.hasPco12Mm()) {
                    setPco12Mm(pedalData.getPco12Mm());
                }
                if (pedalData.hasPowerPhaseStart1024Brads()) {
                    setPowerPhaseStart1024Brads(pedalData.getPowerPhaseStart1024Brads());
                }
                if (pedalData.hasPowerPhaseEnd1024Brads()) {
                    setPowerPhaseEnd1024Brads(pedalData.getPowerPhaseEnd1024Brads());
                }
                if (pedalData.hasPowerPhasePeakStart1024Brads()) {
                    setPowerPhasePeakStart1024Brads(pedalData.getPowerPhasePeakStart1024Brads());
                }
                if (pedalData.hasPowerPhasePeakEnd1024Brads()) {
                    setPowerPhasePeakEnd1024Brads(pedalData.getPowerPhasePeakEnd1024Brads());
                }
                if (pedalData.hasTePercent()) {
                    setTePercent(pedalData.getTePercent());
                }
                if (pedalData.hasPsPercent()) {
                    setPsPercent(pedalData.getPsPercent());
                }
                mergeUnknownFields(pedalData.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PedalData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static PedalData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PedalData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PedalData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PedalData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PedalData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PedalData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PedalData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PedalData parseFrom(InputStream inputStream) {
            return (PedalData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PedalData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PedalData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PedalData parseFrom(CodedInputStream codedInputStream) {
            return (PedalData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PedalData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PedalData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ PedalData(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private PedalData() {
            this.pco12Mm_ = 0;
            this.powerPhaseStart1024Brads_ = 0;
            this.powerPhaseEnd1024Brads_ = 0;
            this.powerPhasePeakStart1024Brads_ = 0;
            this.powerPhasePeakEnd1024Brads_ = 0;
            this.tePercent_ = 0;
            this.psPercent_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int BIKE_POWER_CAPABILITIES_FIELD_NUMBER = 1;
        public static final int FEATURES_RESPONSE_FIELD_NUMBER = 26;
        private static final long serialVersionUID = 0;
        private BikePowerCapabilities bikePowerCapabilities_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIBikePower.CapabilitiesResponse.1
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
            return GDIBikePower.internal_static_GDI_Proto_BikePower_CapabilitiesResponse_descriptor;
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
            if (hasBikePowerCapabilities() != capabilitiesResponse.hasBikePowerCapabilities()) {
                return false;
            }
            return (!hasBikePowerCapabilities() || getBikePowerCapabilities().equals(capabilitiesResponse.getBikePowerCapabilities())) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIBikePower.CapabilitiesResponseOrBuilder
        public BikePowerCapabilities getBikePowerCapabilities() {
            BikePowerCapabilities bikePowerCapabilities = this.bikePowerCapabilities_;
            return bikePowerCapabilities == null ? BikePowerCapabilities.getDefaultInstance() : bikePowerCapabilities;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.CapabilitiesResponseOrBuilder
        public BikePowerCapabilitiesOrBuilder getBikePowerCapabilitiesOrBuilder() {
            BikePowerCapabilities bikePowerCapabilities = this.bikePowerCapabilities_;
            return bikePowerCapabilities == null ? BikePowerCapabilities.getDefaultInstance() : bikePowerCapabilities;
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getBikePowerCapabilities()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.CapabilitiesResponseOrBuilder
        public boolean hasBikePowerCapabilities() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasBikePowerCapabilities()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getBikePowerCapabilities().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getBikePowerCapabilities());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private SingleFieldBuilderV3<BikePowerCapabilities, BikePowerCapabilities.Builder, BikePowerCapabilitiesOrBuilder> bikePowerCapabilitiesBuilder_;
            private BikePowerCapabilities bikePowerCapabilities_;
            private int bitField0_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<BikePowerCapabilities, BikePowerCapabilities.Builder, BikePowerCapabilitiesOrBuilder> singleFieldBuilderV3 = this.bikePowerCapabilitiesBuilder_;
                    capabilitiesResponse.bikePowerCapabilities_ = singleFieldBuilderV3 == null ? this.bikePowerCapabilities_ : (BikePowerCapabilities) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                capabilitiesResponse.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<BikePowerCapabilities, BikePowerCapabilities.Builder, BikePowerCapabilitiesOrBuilder> getBikePowerCapabilitiesFieldBuilder() {
                if (this.bikePowerCapabilitiesBuilder_ == null) {
                    this.bikePowerCapabilitiesBuilder_ = new SingleFieldBuilderV3<>(getBikePowerCapabilities(), getParentForChildren(), isClean());
                    this.bikePowerCapabilities_ = null;
                }
                return this.bikePowerCapabilitiesBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_CapabilitiesResponse_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getBikePowerCapabilitiesFieldBuilder();
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
                this.bikePowerCapabilities_ = null;
                SingleFieldBuilderV3<BikePowerCapabilities, BikePowerCapabilities.Builder, BikePowerCapabilitiesOrBuilder> singleFieldBuilderV3 = this.bikePowerCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.bikePowerCapabilitiesBuilder_ = null;
                }
                return this;
            }

            public Builder clearBikePowerCapabilities() {
                this.bitField0_ &= -2;
                this.bikePowerCapabilities_ = null;
                SingleFieldBuilderV3<BikePowerCapabilities, BikePowerCapabilities.Builder, BikePowerCapabilitiesOrBuilder> singleFieldBuilderV3 = this.bikePowerCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.bikePowerCapabilitiesBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIBikePower.CapabilitiesResponseOrBuilder
            public BikePowerCapabilities getBikePowerCapabilities() {
                SingleFieldBuilderV3<BikePowerCapabilities, BikePowerCapabilities.Builder, BikePowerCapabilitiesOrBuilder> singleFieldBuilderV3 = this.bikePowerCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (BikePowerCapabilities) singleFieldBuilderV3.getMessage();
                }
                BikePowerCapabilities bikePowerCapabilities = this.bikePowerCapabilities_;
                return bikePowerCapabilities == null ? BikePowerCapabilities.getDefaultInstance() : bikePowerCapabilities;
            }

            public BikePowerCapabilities.Builder getBikePowerCapabilitiesBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (BikePowerCapabilities.Builder) getBikePowerCapabilitiesFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikePower.CapabilitiesResponseOrBuilder
            public BikePowerCapabilitiesOrBuilder getBikePowerCapabilitiesOrBuilder() {
                SingleFieldBuilderV3<BikePowerCapabilities, BikePowerCapabilities.Builder, BikePowerCapabilitiesOrBuilder> singleFieldBuilderV3 = this.bikePowerCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (BikePowerCapabilitiesOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                BikePowerCapabilities bikePowerCapabilities = this.bikePowerCapabilities_;
                return bikePowerCapabilities == null ? BikePowerCapabilities.getDefaultInstance() : bikePowerCapabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.CapabilitiesResponseOrBuilder
            public boolean hasBikePowerCapabilities() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeBikePowerCapabilities(BikePowerCapabilities bikePowerCapabilities) {
                BikePowerCapabilities bikePowerCapabilities2;
                SingleFieldBuilderV3<BikePowerCapabilities, BikePowerCapabilities.Builder, BikePowerCapabilitiesOrBuilder> singleFieldBuilderV3 = this.bikePowerCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(bikePowerCapabilities);
                } else if ((this.bitField0_ & 1) == 0 || (bikePowerCapabilities2 = this.bikePowerCapabilities_) == null || bikePowerCapabilities2 == BikePowerCapabilities.getDefaultInstance()) {
                    this.bikePowerCapabilities_ = bikePowerCapabilities;
                } else {
                    getBikePowerCapabilitiesBuilder().mergeFrom(bikePowerCapabilities);
                }
                if (this.bikePowerCapabilities_ != null) {
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
                                    codedInputStream.readMessage(getBikePowerCapabilitiesFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setBikePowerCapabilities(BikePowerCapabilities.Builder builder) {
                SingleFieldBuilderV3<BikePowerCapabilities, BikePowerCapabilities.Builder, BikePowerCapabilitiesOrBuilder> singleFieldBuilderV3 = this.bikePowerCapabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.bikePowerCapabilities_ = builder.build();
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

            public Builder setBikePowerCapabilities(BikePowerCapabilities bikePowerCapabilities) {
                SingleFieldBuilderV3<BikePowerCapabilities, BikePowerCapabilities.Builder, BikePowerCapabilitiesOrBuilder> singleFieldBuilderV3 = this.bikePowerCapabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    bikePowerCapabilities.getClass();
                    this.bikePowerCapabilities_ = bikePowerCapabilities;
                } else {
                    singleFieldBuilderV3.setMessage(bikePowerCapabilities);
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
                if (capabilitiesResponse.hasBikePowerCapabilities()) {
                    mergeBikePowerCapabilities(capabilitiesResponse.getBikePowerCapabilities());
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

    public static final class ConfigurationFields extends GeneratedMessageV3 implements ConfigurationFieldsOrBuilder {
        public static final int AUTO_ZERO_ENABLED_FIELD_NUMBER = 6;
        public static final int CRANK_LENGTH_FIELD_NUMBER = 1;
        public static final int INSTALL_ANGLE_STATUS_FIELD_NUMBER = 8;
        public static final int LEFT_TORQUE_SCALE_FIELD_NUMBER = 4;
        public static final int PAIRED_PEDAL_ID_FIELD_NUMBER = 7;
        public static final int PEAK_POWER_PHASE_RANGE_FIELD_NUMBER = 3;
        public static final int RIGHT_TORQUE_SCALE_FIELD_NUMBER = 5;
        public static final int TRANSITION_TIME_OFFSET_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private boolean autoZeroEnabled_;
        private int bitField0_;
        private int crankLength_;
        private int installAngleStatus_;
        private int leftTorqueScale_;
        private byte memoizedIsInitialized;
        private int pairedPedalId_;
        private int peakPowerPhaseRange_;
        private int rightTorqueScale_;
        private int transitionTimeOffset_;
        private static final ConfigurationFields DEFAULT_INSTANCE = new ConfigurationFields();

        @Deprecated
        public static final Parser<ConfigurationFields> PARSER = new AbstractParser<ConfigurationFields>() { // from class: com.garmin.proto.generated.GDIBikePower.ConfigurationFields.1
            @Override // com.google.protobuf.Parser
            public ConfigurationFields parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigurationFields.newBuilder();
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

        private ConfigurationFields(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.crankLength_ = 0;
            this.transitionTimeOffset_ = 0;
            this.peakPowerPhaseRange_ = 0;
            this.leftTorqueScale_ = 0;
            this.rightTorqueScale_ = 0;
            this.autoZeroEnabled_ = false;
            this.pairedPedalId_ = 0;
            this.installAngleStatus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigurationFields getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_ConfigurationFields_descriptor;
        }

        public static Builder newBuilder(ConfigurationFields configurationFields) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configurationFields);
        }

        public static ConfigurationFields parseDelimitedFrom(InputStream inputStream) {
            return (ConfigurationFields) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigurationFields parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigurationFields> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigurationFields)) {
                return super.equals(obj);
            }
            ConfigurationFields configurationFields = (ConfigurationFields) obj;
            if (hasCrankLength() != configurationFields.hasCrankLength()) {
                return false;
            }
            if ((hasCrankLength() && getCrankLength() != configurationFields.getCrankLength()) || hasTransitionTimeOffset() != configurationFields.hasTransitionTimeOffset()) {
                return false;
            }
            if ((hasTransitionTimeOffset() && getTransitionTimeOffset() != configurationFields.getTransitionTimeOffset()) || hasPeakPowerPhaseRange() != configurationFields.hasPeakPowerPhaseRange()) {
                return false;
            }
            if ((hasPeakPowerPhaseRange() && getPeakPowerPhaseRange() != configurationFields.getPeakPowerPhaseRange()) || hasLeftTorqueScale() != configurationFields.hasLeftTorqueScale()) {
                return false;
            }
            if ((hasLeftTorqueScale() && getLeftTorqueScale() != configurationFields.getLeftTorqueScale()) || hasRightTorqueScale() != configurationFields.hasRightTorqueScale()) {
                return false;
            }
            if ((hasRightTorqueScale() && getRightTorqueScale() != configurationFields.getRightTorqueScale()) || hasAutoZeroEnabled() != configurationFields.hasAutoZeroEnabled()) {
                return false;
            }
            if ((hasAutoZeroEnabled() && getAutoZeroEnabled() != configurationFields.getAutoZeroEnabled()) || hasPairedPedalId() != configurationFields.hasPairedPedalId()) {
                return false;
            }
            if ((!hasPairedPedalId() || getPairedPedalId() == configurationFields.getPairedPedalId()) && hasInstallAngleStatus() == configurationFields.hasInstallAngleStatus()) {
                return (!hasInstallAngleStatus() || this.installAngleStatus_ == configurationFields.installAngleStatus_) && getUnknownFields().equals(configurationFields.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
        public boolean getAutoZeroEnabled() {
            return this.autoZeroEnabled_;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
        public int getCrankLength() {
            return this.crankLength_;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
        public InstallAngleStatus getInstallAngleStatus() {
            InstallAngleStatus installAngleStatusForNumber = InstallAngleStatus.forNumber(this.installAngleStatus_);
            return installAngleStatusForNumber == null ? InstallAngleStatus.NOT_SET : installAngleStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
        public int getLeftTorqueScale() {
            return this.leftTorqueScale_;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
        public int getPairedPedalId() {
            return this.pairedPedalId_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigurationFields> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
        public int getPeakPowerPhaseRange() {
            return this.peakPowerPhaseRange_;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
        public int getRightTorqueScale() {
            return this.rightTorqueScale_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.crankLength_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.transitionTimeOffset_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.peakPowerPhaseRange_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.leftTorqueScale_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.rightTorqueScale_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(6, this.autoZeroEnabled_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(7, this.pairedPedalId_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(8, this.installAngleStatus_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
        public int getTransitionTimeOffset() {
            return this.transitionTimeOffset_;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
        public boolean hasAutoZeroEnabled() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
        public boolean hasCrankLength() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
        public boolean hasInstallAngleStatus() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
        public boolean hasLeftTorqueScale() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
        public boolean hasPairedPedalId() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
        public boolean hasPeakPowerPhaseRange() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
        public boolean hasRightTorqueScale() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
        public boolean hasTransitionTimeOffset() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCrankLength()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCrankLength();
            }
            if (hasTransitionTimeOffset()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTransitionTimeOffset();
            }
            if (hasPeakPowerPhaseRange()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getPeakPowerPhaseRange();
            }
            if (hasLeftTorqueScale()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getLeftTorqueScale();
            }
            if (hasRightTorqueScale()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getRightTorqueScale();
            }
            if (hasAutoZeroEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + Internal.hashBoolean(getAutoZeroEnabled());
            }
            if (hasPairedPedalId()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getPairedPedalId();
            }
            if (hasInstallAngleStatus()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + this.installAngleStatus_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_ConfigurationFields_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationFields.class, Builder.class);
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
            return new ConfigurationFields();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.crankLength_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.transitionTimeOffset_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.peakPowerPhaseRange_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.leftTorqueScale_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.rightTorqueScale_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeBool(6, this.autoZeroEnabled_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(7, this.pairedPedalId_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeEnum(8, this.installAngleStatus_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigurationFieldsOrBuilder {
            private boolean autoZeroEnabled_;
            private int bitField0_;
            private int crankLength_;
            private int installAngleStatus_;
            private int leftTorqueScale_;
            private int pairedPedalId_;
            private int peakPowerPhaseRange_;
            private int rightTorqueScale_;
            private int transitionTimeOffset_;

            private Builder() {
                this.installAngleStatus_ = 0;
            }

            private void buildPartial0(ConfigurationFields configurationFields) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    configurationFields.crankLength_ = this.crankLength_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    configurationFields.transitionTimeOffset_ = this.transitionTimeOffset_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    configurationFields.peakPowerPhaseRange_ = this.peakPowerPhaseRange_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    configurationFields.leftTorqueScale_ = this.leftTorqueScale_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    configurationFields.rightTorqueScale_ = this.rightTorqueScale_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    configurationFields.autoZeroEnabled_ = this.autoZeroEnabled_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    configurationFields.pairedPedalId_ = this.pairedPedalId_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    configurationFields.installAngleStatus_ = this.installAngleStatus_;
                    i14 |= 128;
                }
                configurationFields.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_ConfigurationFields_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigurationFields build() {
                ConfigurationFields configurationFieldsBuildPartial = buildPartial();
                if (configurationFieldsBuildPartial.isInitialized()) {
                    return configurationFieldsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configurationFieldsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigurationFields buildPartial() {
                ConfigurationFields configurationFields = new ConfigurationFields(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(configurationFields);
                }
                onBuilt();
                return configurationFields;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.crankLength_ = 0;
                this.transitionTimeOffset_ = 0;
                this.peakPowerPhaseRange_ = 0;
                this.leftTorqueScale_ = 0;
                this.rightTorqueScale_ = 0;
                this.autoZeroEnabled_ = false;
                this.pairedPedalId_ = 0;
                this.installAngleStatus_ = 0;
                return this;
            }

            public Builder clearAutoZeroEnabled() {
                this.bitField0_ &= -33;
                this.autoZeroEnabled_ = false;
                onChanged();
                return this;
            }

            public Builder clearCrankLength() {
                this.bitField0_ &= -2;
                this.crankLength_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearInstallAngleStatus() {
                this.bitField0_ &= -129;
                this.installAngleStatus_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLeftTorqueScale() {
                this.bitField0_ &= -9;
                this.leftTorqueScale_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPairedPedalId() {
                this.bitField0_ &= -65;
                this.pairedPedalId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPeakPowerPhaseRange() {
                this.bitField0_ &= -5;
                this.peakPowerPhaseRange_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRightTorqueScale() {
                this.bitField0_ &= -17;
                this.rightTorqueScale_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTransitionTimeOffset() {
                this.bitField0_ &= -3;
                this.transitionTimeOffset_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
            public boolean getAutoZeroEnabled() {
                return this.autoZeroEnabled_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
            public int getCrankLength() {
                return this.crankLength_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_ConfigurationFields_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
            public InstallAngleStatus getInstallAngleStatus() {
                InstallAngleStatus installAngleStatusForNumber = InstallAngleStatus.forNumber(this.installAngleStatus_);
                return installAngleStatusForNumber == null ? InstallAngleStatus.NOT_SET : installAngleStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
            public int getLeftTorqueScale() {
                return this.leftTorqueScale_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
            public int getPairedPedalId() {
                return this.pairedPedalId_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
            public int getPeakPowerPhaseRange() {
                return this.peakPowerPhaseRange_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
            public int getRightTorqueScale() {
                return this.rightTorqueScale_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
            public int getTransitionTimeOffset() {
                return this.transitionTimeOffset_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
            public boolean hasAutoZeroEnabled() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
            public boolean hasCrankLength() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
            public boolean hasInstallAngleStatus() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
            public boolean hasLeftTorqueScale() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
            public boolean hasPairedPedalId() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
            public boolean hasPeakPowerPhaseRange() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
            public boolean hasRightTorqueScale() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationFieldsOrBuilder
            public boolean hasTransitionTimeOffset() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_ConfigurationFields_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationFields.class, Builder.class);
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
                                    this.crankLength_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.transitionTimeOffset_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.peakPowerPhaseRange_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.leftTorqueScale_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.rightTorqueScale_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    this.autoZeroEnabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 32;
                                } else if (tag == 56) {
                                    this.pairedPedalId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                } else if (tag == 64) {
                                    int i14 = codedInputStream.readEnum();
                                    if (InstallAngleStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(8, i14);
                                    } else {
                                        this.installAngleStatus_ = i14;
                                        this.bitField0_ |= 128;
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

            public Builder setAutoZeroEnabled(boolean z14) {
                this.autoZeroEnabled_ = z14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setCrankLength(int i14) {
                this.crankLength_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setInstallAngleStatus(InstallAngleStatus installAngleStatus) {
                installAngleStatus.getClass();
                this.bitField0_ |= 128;
                this.installAngleStatus_ = installAngleStatus.getNumber();
                onChanged();
                return this;
            }

            public Builder setLeftTorqueScale(int i14) {
                this.leftTorqueScale_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setPairedPedalId(int i14) {
                this.pairedPedalId_ = i14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setPeakPowerPhaseRange(int i14) {
                this.peakPowerPhaseRange_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setRightTorqueScale(int i14) {
                this.rightTorqueScale_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTransitionTimeOffset(int i14) {
                this.transitionTimeOffset_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConfigurationFields getDefaultInstanceForType() {
                return ConfigurationFields.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.installAngleStatus_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigurationFields) {
                    return mergeFrom((ConfigurationFields) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConfigurationFields configurationFields) {
                if (configurationFields == ConfigurationFields.getDefaultInstance()) {
                    return this;
                }
                if (configurationFields.hasCrankLength()) {
                    setCrankLength(configurationFields.getCrankLength());
                }
                if (configurationFields.hasTransitionTimeOffset()) {
                    setTransitionTimeOffset(configurationFields.getTransitionTimeOffset());
                }
                if (configurationFields.hasPeakPowerPhaseRange()) {
                    setPeakPowerPhaseRange(configurationFields.getPeakPowerPhaseRange());
                }
                if (configurationFields.hasLeftTorqueScale()) {
                    setLeftTorqueScale(configurationFields.getLeftTorqueScale());
                }
                if (configurationFields.hasRightTorqueScale()) {
                    setRightTorqueScale(configurationFields.getRightTorqueScale());
                }
                if (configurationFields.hasAutoZeroEnabled()) {
                    setAutoZeroEnabled(configurationFields.getAutoZeroEnabled());
                }
                if (configurationFields.hasPairedPedalId()) {
                    setPairedPedalId(configurationFields.getPairedPedalId());
                }
                if (configurationFields.hasInstallAngleStatus()) {
                    setInstallAngleStatus(configurationFields.getInstallAngleStatus());
                }
                mergeUnknownFields(configurationFields.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConfigurationFields getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConfigurationFields parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationFields) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigurationFields parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConfigurationFields parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigurationFields parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConfigurationFields parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConfigurationFields parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConfigurationFields parseFrom(InputStream inputStream) {
            return (ConfigurationFields) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigurationFields parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationFields) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigurationFields parseFrom(CodedInputStream codedInputStream) {
            return (ConfigurationFields) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigurationFields parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationFields) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ ConfigurationFields(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public enum InstallAngleStatus implements ProtocolMessageEnum {
            NOT_SET(0),
            RIGHT_SET(1),
            LEFT_SET(2),
            BOTH_SET(3);

            public static final int BOTH_SET_VALUE = 3;
            public static final int LEFT_SET_VALUE = 2;
            public static final int NOT_SET_VALUE = 0;
            public static final int RIGHT_SET_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<InstallAngleStatus> internalValueMap = new Internal.EnumLiteMap<InstallAngleStatus>() { // from class: com.garmin.proto.generated.GDIBikePower.ConfigurationFields.InstallAngleStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public InstallAngleStatus findValueByNumber(int i14) {
                    return InstallAngleStatus.forNumber(i14);
                }
            };
            private static final InstallAngleStatus[] VALUES = values();

            InstallAngleStatus(int i14) {
                this.value = i14;
            }

            public static InstallAngleStatus forNumber(int i14) {
                if (i14 == 0) {
                    return NOT_SET;
                }
                if (i14 == 1) {
                    return RIGHT_SET;
                }
                if (i14 == 2) {
                    return LEFT_SET;
                }
                if (i14 != 3) {
                    return null;
                }
                return BOTH_SET;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConfigurationFields.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<InstallAngleStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static InstallAngleStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static InstallAngleStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }

        private ConfigurationFields() {
            this.crankLength_ = 0;
            this.transitionTimeOffset_ = 0;
            this.peakPowerPhaseRange_ = 0;
            this.leftTorqueScale_ = 0;
            this.rightTorqueScale_ = 0;
            this.autoZeroEnabled_ = false;
            this.pairedPedalId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.installAngleStatus_ = 0;
        }
    }

    public static final class ConfigurationNotification extends GeneratedMessageV3 implements ConfigurationNotificationOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 1;
        private static final ConfigurationNotification DEFAULT_INSTANCE = new ConfigurationNotification();

        @Deprecated
        public static final Parser<ConfigurationNotification> PARSER = new AbstractParser<ConfigurationNotification>() { // from class: com.garmin.proto.generated.GDIBikePower.ConfigurationNotification.1
            @Override // com.google.protobuf.Parser
            public ConfigurationNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigurationNotification.newBuilder();
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
        private ConfigurationFields config_;
        private byte memoizedIsInitialized;

        private ConfigurationNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigurationNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_ConfigurationNotification_descriptor;
        }

        public static Builder newBuilder(ConfigurationNotification configurationNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configurationNotification);
        }

        public static ConfigurationNotification parseDelimitedFrom(InputStream inputStream) {
            return (ConfigurationNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigurationNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigurationNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigurationNotification)) {
                return super.equals(obj);
            }
            ConfigurationNotification configurationNotification = (ConfigurationNotification) obj;
            if (hasConfig() != configurationNotification.hasConfig()) {
                return false;
            }
            return (!hasConfig() || getConfig().equals(configurationNotification.getConfig())) && getUnknownFields().equals(configurationNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationNotificationOrBuilder
        public ConfigurationFields getConfig() {
            ConfigurationFields configurationFields = this.config_;
            return configurationFields == null ? ConfigurationFields.getDefaultInstance() : configurationFields;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationNotificationOrBuilder
        public ConfigurationFieldsOrBuilder getConfigOrBuilder() {
            ConfigurationFields configurationFields = this.config_;
            return configurationFields == null ? ConfigurationFields.getDefaultInstance() : configurationFields;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigurationNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getConfig()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationNotificationOrBuilder
        public boolean hasConfig() {
            return (this.bitField0_ & 1) != 0;
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
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_ConfigurationNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationNotification.class, Builder.class);
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
            return new ConfigurationNotification();
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
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigurationNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> configBuilder_;
            private ConfigurationFields config_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConfigurationNotification configurationNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                    configurationNotification.config_ = singleFieldBuilderV3 == null ? this.config_ : (ConfigurationFields) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                configurationNotification.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> getConfigFieldBuilder() {
                if (this.configBuilder_ == null) {
                    this.configBuilder_ = new SingleFieldBuilderV3<>(getConfig(), getParentForChildren(), isClean());
                    this.config_ = null;
                }
                return this.configBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_ConfigurationNotification_descriptor;
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
            public ConfigurationNotification build() {
                ConfigurationNotification configurationNotificationBuildPartial = buildPartial();
                if (configurationNotificationBuildPartial.isInitialized()) {
                    return configurationNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configurationNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigurationNotification buildPartial() {
                ConfigurationNotification configurationNotification = new ConfigurationNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(configurationNotification);
                }
                onBuilt();
                return configurationNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.config_ = null;
                SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configBuilder_ = null;
                }
                return this;
            }

            public Builder clearConfig() {
                this.bitField0_ &= -2;
                this.config_ = null;
                SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationNotificationOrBuilder
            public ConfigurationFields getConfig() {
                SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationFields) singleFieldBuilderV3.getMessage();
                }
                ConfigurationFields configurationFields = this.config_;
                return configurationFields == null ? ConfigurationFields.getDefaultInstance() : configurationFields;
            }

            public ConfigurationFields.Builder getConfigBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ConfigurationFields.Builder) getConfigFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationNotificationOrBuilder
            public ConfigurationFieldsOrBuilder getConfigOrBuilder() {
                SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationFieldsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigurationFields configurationFields = this.config_;
                return configurationFields == null ? ConfigurationFields.getDefaultInstance() : configurationFields;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_ConfigurationNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationNotificationOrBuilder
            public boolean hasConfig() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_ConfigurationNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeConfig(ConfigurationFields configurationFields) {
                ConfigurationFields configurationFields2;
                SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configurationFields);
                } else if ((this.bitField0_ & 1) == 0 || (configurationFields2 = this.config_) == null || configurationFields2 == ConfigurationFields.getDefaultInstance()) {
                    this.config_ = configurationFields;
                } else {
                    getConfigBuilder().mergeFrom(configurationFields);
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

            public Builder setConfig(ConfigurationFields.Builder builder) {
                SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConfigurationNotification getDefaultInstanceForType() {
                return ConfigurationNotification.getDefaultInstance();
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

            public Builder setConfig(ConfigurationFields configurationFields) {
                SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configurationFields.getClass();
                    this.config_ = configurationFields;
                } else {
                    singleFieldBuilderV3.setMessage(configurationFields);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigurationNotification) {
                    return mergeFrom((ConfigurationNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConfigurationNotification configurationNotification) {
                if (configurationNotification == ConfigurationNotification.getDefaultInstance()) {
                    return this;
                }
                if (configurationNotification.hasConfig()) {
                    mergeConfig(configurationNotification.getConfig());
                }
                mergeUnknownFields(configurationNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConfigurationNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ConfigurationNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ConfigurationNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigurationNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigurationNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConfigurationNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigurationNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConfigurationNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConfigurationNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConfigurationNotification parseFrom(InputStream inputStream) {
            return (ConfigurationNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigurationNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigurationNotification parseFrom(CodedInputStream codedInputStream) {
            return (ConfigurationNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigurationNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConfigurationRequest extends GeneratedMessageV3 implements ConfigurationRequestOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 1;
        private static final ConfigurationRequest DEFAULT_INSTANCE = new ConfigurationRequest();

        @Deprecated
        public static final Parser<ConfigurationRequest> PARSER = new AbstractParser<ConfigurationRequest>() { // from class: com.garmin.proto.generated.GDIBikePower.ConfigurationRequest.1
            @Override // com.google.protobuf.Parser
            public ConfigurationRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigurationRequest.newBuilder();
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
        private ConfigurationFields config_;
        private byte memoizedIsInitialized;

        private ConfigurationRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigurationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_ConfigurationRequest_descriptor;
        }

        public static Builder newBuilder(ConfigurationRequest configurationRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configurationRequest);
        }

        public static ConfigurationRequest parseDelimitedFrom(InputStream inputStream) {
            return (ConfigurationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigurationRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigurationRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigurationRequest)) {
                return super.equals(obj);
            }
            ConfigurationRequest configurationRequest = (ConfigurationRequest) obj;
            if (hasConfig() != configurationRequest.hasConfig()) {
                return false;
            }
            return (!hasConfig() || getConfig().equals(configurationRequest.getConfig())) && getUnknownFields().equals(configurationRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationRequestOrBuilder
        public ConfigurationFields getConfig() {
            ConfigurationFields configurationFields = this.config_;
            return configurationFields == null ? ConfigurationFields.getDefaultInstance() : configurationFields;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationRequestOrBuilder
        public ConfigurationFieldsOrBuilder getConfigOrBuilder() {
            ConfigurationFields configurationFields = this.config_;
            return configurationFields == null ? ConfigurationFields.getDefaultInstance() : configurationFields;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigurationRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getConfig()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationRequestOrBuilder
        public boolean hasConfig() {
            return (this.bitField0_ & 1) != 0;
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
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_ConfigurationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationRequest.class, Builder.class);
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
            return new ConfigurationRequest();
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
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigurationRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> configBuilder_;
            private ConfigurationFields config_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConfigurationRequest configurationRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                    configurationRequest.config_ = singleFieldBuilderV3 == null ? this.config_ : (ConfigurationFields) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                configurationRequest.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> getConfigFieldBuilder() {
                if (this.configBuilder_ == null) {
                    this.configBuilder_ = new SingleFieldBuilderV3<>(getConfig(), getParentForChildren(), isClean());
                    this.config_ = null;
                }
                return this.configBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_ConfigurationRequest_descriptor;
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
            public ConfigurationRequest build() {
                ConfigurationRequest configurationRequestBuildPartial = buildPartial();
                if (configurationRequestBuildPartial.isInitialized()) {
                    return configurationRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configurationRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigurationRequest buildPartial() {
                ConfigurationRequest configurationRequest = new ConfigurationRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(configurationRequest);
                }
                onBuilt();
                return configurationRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.config_ = null;
                SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configBuilder_ = null;
                }
                return this;
            }

            public Builder clearConfig() {
                this.bitField0_ &= -2;
                this.config_ = null;
                SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationRequestOrBuilder
            public ConfigurationFields getConfig() {
                SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationFields) singleFieldBuilderV3.getMessage();
                }
                ConfigurationFields configurationFields = this.config_;
                return configurationFields == null ? ConfigurationFields.getDefaultInstance() : configurationFields;
            }

            public ConfigurationFields.Builder getConfigBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ConfigurationFields.Builder) getConfigFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationRequestOrBuilder
            public ConfigurationFieldsOrBuilder getConfigOrBuilder() {
                SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationFieldsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigurationFields configurationFields = this.config_;
                return configurationFields == null ? ConfigurationFields.getDefaultInstance() : configurationFields;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_ConfigurationRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationRequestOrBuilder
            public boolean hasConfig() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_ConfigurationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeConfig(ConfigurationFields configurationFields) {
                ConfigurationFields configurationFields2;
                SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configurationFields);
                } else if ((this.bitField0_ & 1) == 0 || (configurationFields2 = this.config_) == null || configurationFields2 == ConfigurationFields.getDefaultInstance()) {
                    this.config_ = configurationFields;
                } else {
                    getConfigBuilder().mergeFrom(configurationFields);
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

            public Builder setConfig(ConfigurationFields.Builder builder) {
                SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConfigurationRequest getDefaultInstanceForType() {
                return ConfigurationRequest.getDefaultInstance();
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

            public Builder setConfig(ConfigurationFields configurationFields) {
                SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configurationFields.getClass();
                    this.config_ = configurationFields;
                } else {
                    singleFieldBuilderV3.setMessage(configurationFields);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigurationRequest) {
                    return mergeFrom((ConfigurationRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConfigurationRequest configurationRequest) {
                if (configurationRequest == ConfigurationRequest.getDefaultInstance()) {
                    return this;
                }
                if (configurationRequest.hasConfig()) {
                    mergeConfig(configurationRequest.getConfig());
                }
                mergeUnknownFields(configurationRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConfigurationRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ConfigurationRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ConfigurationRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigurationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigurationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConfigurationRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigurationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConfigurationRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConfigurationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConfigurationRequest parseFrom(InputStream inputStream) {
            return (ConfigurationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigurationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigurationRequest parseFrom(CodedInputStream codedInputStream) {
            return (ConfigurationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigurationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConfigurationResponse extends GeneratedMessageV3 implements ConfigurationResponseOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 2;
        private static final ConfigurationResponse DEFAULT_INSTANCE = new ConfigurationResponse();

        @Deprecated
        public static final Parser<ConfigurationResponse> PARSER = new AbstractParser<ConfigurationResponse>() { // from class: com.garmin.proto.generated.GDIBikePower.ConfigurationResponse.1
            @Override // com.google.protobuf.Parser
            public ConfigurationResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigurationResponse.newBuilder();
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
        private ConfigurationFields config_;
        private byte memoizedIsInitialized;
        private int status_;

        private ConfigurationResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigurationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_ConfigurationResponse_descriptor;
        }

        public static Builder newBuilder(ConfigurationResponse configurationResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configurationResponse);
        }

        public static ConfigurationResponse parseDelimitedFrom(InputStream inputStream) {
            return (ConfigurationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigurationResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigurationResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigurationResponse)) {
                return super.equals(obj);
            }
            ConfigurationResponse configurationResponse = (ConfigurationResponse) obj;
            if (hasStatus() != configurationResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == configurationResponse.status_) && hasConfig() == configurationResponse.hasConfig()) {
                return (!hasConfig() || getConfig().equals(configurationResponse.getConfig())) && getUnknownFields().equals(configurationResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationResponseOrBuilder
        public ConfigurationFields getConfig() {
            ConfigurationFields configurationFields = this.config_;
            return configurationFields == null ? ConfigurationFields.getDefaultInstance() : configurationFields;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationResponseOrBuilder
        public ConfigurationFieldsOrBuilder getConfigOrBuilder() {
            ConfigurationFields configurationFields = this.config_;
            return configurationFields == null ? ConfigurationFields.getDefaultInstance() : configurationFields;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigurationResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getConfig());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationResponseOrBuilder
        public ConfigurationStatus getStatus() {
            ConfigurationStatus configurationStatusForNumber = ConfigurationStatus.forNumber(this.status_);
            return configurationStatusForNumber == null ? ConfigurationStatus.ACCEPTED : configurationStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationResponseOrBuilder
        public boolean hasConfig() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationResponseOrBuilder
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
            if (hasConfig()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getConfig().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_ConfigurationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationResponse.class, Builder.class);
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
            return new ConfigurationResponse();
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
                codedOutputStream.writeMessage(2, getConfig());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigurationResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> configBuilder_;
            private ConfigurationFields config_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConfigurationResponse configurationResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    configurationResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                    configurationResponse.config_ = singleFieldBuilderV3 == null ? this.config_ : (ConfigurationFields) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                configurationResponse.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> getConfigFieldBuilder() {
                if (this.configBuilder_ == null) {
                    this.configBuilder_ = new SingleFieldBuilderV3<>(getConfig(), getParentForChildren(), isClean());
                    this.config_ = null;
                }
                return this.configBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_ConfigurationResponse_descriptor;
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
            public ConfigurationResponse build() {
                ConfigurationResponse configurationResponseBuildPartial = buildPartial();
                if (configurationResponseBuildPartial.isInitialized()) {
                    return configurationResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configurationResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigurationResponse buildPartial() {
                ConfigurationResponse configurationResponse = new ConfigurationResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(configurationResponse);
                }
                onBuilt();
                return configurationResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.config_ = null;
                SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configBuilder_ = null;
                }
                return this;
            }

            public Builder clearConfig() {
                this.bitField0_ &= -3;
                this.config_ = null;
                SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
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

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationResponseOrBuilder
            public ConfigurationFields getConfig() {
                SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationFields) singleFieldBuilderV3.getMessage();
                }
                ConfigurationFields configurationFields = this.config_;
                return configurationFields == null ? ConfigurationFields.getDefaultInstance() : configurationFields;
            }

            public ConfigurationFields.Builder getConfigBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ConfigurationFields.Builder) getConfigFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationResponseOrBuilder
            public ConfigurationFieldsOrBuilder getConfigOrBuilder() {
                SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationFieldsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigurationFields configurationFields = this.config_;
                return configurationFields == null ? ConfigurationFields.getDefaultInstance() : configurationFields;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_ConfigurationResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationResponseOrBuilder
            public ConfigurationStatus getStatus() {
                ConfigurationStatus configurationStatusForNumber = ConfigurationStatus.forNumber(this.status_);
                return configurationStatusForNumber == null ? ConfigurationStatus.ACCEPTED : configurationStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationResponseOrBuilder
            public boolean hasConfig() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ConfigurationResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_ConfigurationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeConfig(ConfigurationFields configurationFields) {
                ConfigurationFields configurationFields2;
                SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configurationFields);
                } else if ((this.bitField0_ & 2) == 0 || (configurationFields2 = this.config_) == null || configurationFields2 == ConfigurationFields.getDefaultInstance()) {
                    this.config_ = configurationFields;
                } else {
                    getConfigBuilder().mergeFrom(configurationFields);
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
                                    int i14 = codedInputStream.readEnum();
                                    if (ConfigurationStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getConfigFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setConfig(ConfigurationFields.Builder builder) {
                SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatus(ConfigurationStatus configurationStatus) {
                configurationStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = configurationStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConfigurationResponse getDefaultInstanceForType() {
                return ConfigurationResponse.getDefaultInstance();
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

            public Builder setConfig(ConfigurationFields configurationFields) {
                SingleFieldBuilderV3<ConfigurationFields, ConfigurationFields.Builder, ConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configurationFields.getClass();
                    this.config_ = configurationFields;
                } else {
                    singleFieldBuilderV3.setMessage(configurationFields);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigurationResponse) {
                    return mergeFrom((ConfigurationResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConfigurationResponse configurationResponse) {
                if (configurationResponse == ConfigurationResponse.getDefaultInstance()) {
                    return this;
                }
                if (configurationResponse.hasStatus()) {
                    setStatus(configurationResponse.getStatus());
                }
                if (configurationResponse.hasConfig()) {
                    mergeConfig(configurationResponse.getConfig());
                }
                mergeUnknownFields(configurationResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConfigurationResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConfigurationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigurationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ConfigurationResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConfigurationResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ConfigurationResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigurationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConfigurationResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConfigurationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConfigurationResponse parseFrom(InputStream inputStream) {
            return (ConfigurationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigurationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigurationResponse parseFrom(CodedInputStream codedInputStream) {
            return (ConfigurationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigurationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ConfigurationStatus implements ProtocolMessageEnum {
            ACCEPTED(0),
            REJECTED(1);

            public static final int ACCEPTED_VALUE = 0;
            public static final int REJECTED_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<ConfigurationStatus> internalValueMap = new Internal.EnumLiteMap<ConfigurationStatus>() { // from class: com.garmin.proto.generated.GDIBikePower.ConfigurationResponse.ConfigurationStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ConfigurationStatus findValueByNumber(int i14) {
                    return ConfigurationStatus.forNumber(i14);
                }
            };
            private static final ConfigurationStatus[] VALUES = values();

            ConfigurationStatus(int i14) {
                this.value = i14;
            }

            public static ConfigurationStatus forNumber(int i14) {
                if (i14 == 0) {
                    return ACCEPTED;
                }
                if (i14 != 1) {
                    return null;
                }
                return REJECTED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConfigurationResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ConfigurationStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ConfigurationStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ConfigurationStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class MeasurementNotification extends GeneratedMessageV3 implements MeasurementNotificationOrBuilder {
        public static final int BALANCE_PERCENT_FIELD_NUMBER = 7;
        public static final int CADENCE_1_8_RPM_FIELD_NUMBER = 12;
        public static final int COASTING_FLAG_FIELD_NUMBER = 5;
        public static final int COASTING_TORQUE_1_32_NM_FIELD_NUMBER = 11;
        public static final int CRANK_ANGLE_1024_BRADS_FIELD_NUMBER = 2;
        public static final int CUMULATIVE_WORK_1_4_J_FIELD_NUMBER = 3;
        public static final int CYCLE_PERIOD_1_2048_S_FIELD_NUMBER = 4;
        public static final int DATA_FIELD_NUMBER = 1017;
        public static final int EVENT_TIMESTAMP_1_2048_S_FIELD_NUMBER = 1;
        public static final int LEFT_PEDAL_DATA_FIELD_NUMBER = 8;
        public static final int POWER_1_2_W_FIELD_NUMBER = 6;
        public static final int RIDER_POSITION_FIELD_NUMBER = 10;
        public static final int RIGHT_PEDAL_DATA_FIELD_NUMBER = 9;
        public static final int TORQUE_1_32_NM_FIELD_NUMBER = 13;
        private static final long serialVersionUID = 0;
        private int balancePercent_;
        private int bitField0_;
        private int cadence18Rpm_;
        private boolean coastingFlag_;
        private int coastingTorque132Nm_;
        private int crankAngle1024Brads_;
        private int cumulativeWork14J_;
        private int cyclePeriod12048S_;
        private int eventTimestamp12048S_;
        private PedalData leftPedalData_;
        private byte memoizedIsInitialized;
        private int power12W_;
        private int riderPosition_;
        private PedalData rightPedalData_;
        private int torque132Nm_;
        private static final MeasurementNotification DEFAULT_INSTANCE = new MeasurementNotification();

        @Deprecated
        public static final Parser<MeasurementNotification> PARSER = new AbstractParser<MeasurementNotification>() { // from class: com.garmin.proto.generated.GDIBikePower.MeasurementNotification.1
            @Override // com.google.protobuf.Parser
            public MeasurementNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = MeasurementNotification.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, MeasurementNotification> data = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, MeasurementNotification.class, getDefaultInstance());

        private MeasurementNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.eventTimestamp12048S_ = 0;
            this.crankAngle1024Brads_ = 0;
            this.cumulativeWork14J_ = 0;
            this.cyclePeriod12048S_ = 0;
            this.coastingFlag_ = false;
            this.power12W_ = 0;
            this.balancePercent_ = 0;
            this.riderPosition_ = 0;
            this.coastingTorque132Nm_ = 0;
            this.cadence18Rpm_ = 0;
            this.torque132Nm_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MeasurementNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_MeasurementNotification_descriptor;
        }

        public static Builder newBuilder(MeasurementNotification measurementNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(measurementNotification);
        }

        public static MeasurementNotification parseDelimitedFrom(InputStream inputStream) {
            return (MeasurementNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MeasurementNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MeasurementNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MeasurementNotification)) {
                return super.equals(obj);
            }
            MeasurementNotification measurementNotification = (MeasurementNotification) obj;
            if (hasEventTimestamp12048S() != measurementNotification.hasEventTimestamp12048S()) {
                return false;
            }
            if ((hasEventTimestamp12048S() && getEventTimestamp12048S() != measurementNotification.getEventTimestamp12048S()) || hasCrankAngle1024Brads() != measurementNotification.hasCrankAngle1024Brads()) {
                return false;
            }
            if ((hasCrankAngle1024Brads() && getCrankAngle1024Brads() != measurementNotification.getCrankAngle1024Brads()) || hasCumulativeWork14J() != measurementNotification.hasCumulativeWork14J()) {
                return false;
            }
            if ((hasCumulativeWork14J() && getCumulativeWork14J() != measurementNotification.getCumulativeWork14J()) || hasCyclePeriod12048S() != measurementNotification.hasCyclePeriod12048S()) {
                return false;
            }
            if ((hasCyclePeriod12048S() && getCyclePeriod12048S() != measurementNotification.getCyclePeriod12048S()) || hasCoastingFlag() != measurementNotification.hasCoastingFlag()) {
                return false;
            }
            if ((hasCoastingFlag() && getCoastingFlag() != measurementNotification.getCoastingFlag()) || hasPower12W() != measurementNotification.hasPower12W()) {
                return false;
            }
            if ((hasPower12W() && getPower12W() != measurementNotification.getPower12W()) || hasBalancePercent() != measurementNotification.hasBalancePercent()) {
                return false;
            }
            if ((hasBalancePercent() && getBalancePercent() != measurementNotification.getBalancePercent()) || hasLeftPedalData() != measurementNotification.hasLeftPedalData()) {
                return false;
            }
            if ((hasLeftPedalData() && !getLeftPedalData().equals(measurementNotification.getLeftPedalData())) || hasRightPedalData() != measurementNotification.hasRightPedalData()) {
                return false;
            }
            if ((hasRightPedalData() && !getRightPedalData().equals(measurementNotification.getRightPedalData())) || hasRiderPosition() != measurementNotification.hasRiderPosition()) {
                return false;
            }
            if ((hasRiderPosition() && this.riderPosition_ != measurementNotification.riderPosition_) || hasCoastingTorque132Nm() != measurementNotification.hasCoastingTorque132Nm()) {
                return false;
            }
            if ((hasCoastingTorque132Nm() && getCoastingTorque132Nm() != measurementNotification.getCoastingTorque132Nm()) || hasCadence18Rpm() != measurementNotification.hasCadence18Rpm()) {
                return false;
            }
            if ((!hasCadence18Rpm() || getCadence18Rpm() == measurementNotification.getCadence18Rpm()) && hasTorque132Nm() == measurementNotification.hasTorque132Nm()) {
                return (!hasTorque132Nm() || getTorque132Nm() == measurementNotification.getTorque132Nm()) && getUnknownFields().equals(measurementNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public int getBalancePercent() {
            return this.balancePercent_;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public int getCadence18Rpm() {
            return this.cadence18Rpm_;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public boolean getCoastingFlag() {
            return this.coastingFlag_;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public int getCoastingTorque132Nm() {
            return this.coastingTorque132Nm_;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public int getCrankAngle1024Brads() {
            return this.crankAngle1024Brads_;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public int getCumulativeWork14J() {
            return this.cumulativeWork14J_;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public int getCyclePeriod12048S() {
            return this.cyclePeriod12048S_;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public int getEventTimestamp12048S() {
            return this.eventTimestamp12048S_;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public PedalData getLeftPedalData() {
            PedalData pedalData = this.leftPedalData_;
            return pedalData == null ? PedalData.getDefaultInstance() : pedalData;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public PedalDataOrBuilder getLeftPedalDataOrBuilder() {
            PedalData pedalData = this.leftPedalData_;
            return pedalData == null ? PedalData.getDefaultInstance() : pedalData;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MeasurementNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public int getPower12W() {
            return this.power12W_;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public RiderPosition getRiderPosition() {
            RiderPosition riderPositionForNumber = RiderPosition.forNumber(this.riderPosition_);
            return riderPositionForNumber == null ? RiderPosition.SEATED : riderPositionForNumber;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public PedalData getRightPedalData() {
            PedalData pedalData = this.rightPedalData_;
            return pedalData == null ? PedalData.getDefaultInstance() : pedalData;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public PedalDataOrBuilder getRightPedalDataOrBuilder() {
            PedalData pedalData = this.rightPedalData_;
            return pedalData == null ? PedalData.getDefaultInstance() : pedalData;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.eventTimestamp12048S_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.crankAngle1024Brads_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeSInt32Size(3, this.cumulativeWork14J_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.cyclePeriod12048S_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(5, this.coastingFlag_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(6, this.power12W_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(7, this.balancePercent_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(8, getLeftPedalData());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(9, getRightPedalData());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(10, this.riderPosition_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeSInt32Size(11, this.coastingTorque132Nm_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(12, this.cadence18Rpm_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeSInt32Size(13, this.torque132Nm_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public int getTorque132Nm() {
            return this.torque132Nm_;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public boolean hasBalancePercent() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public boolean hasCadence18Rpm() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public boolean hasCoastingFlag() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public boolean hasCoastingTorque132Nm() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public boolean hasCrankAngle1024Brads() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public boolean hasCumulativeWork14J() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public boolean hasCyclePeriod12048S() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public boolean hasEventTimestamp12048S() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public boolean hasLeftPedalData() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public boolean hasPower12W() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public boolean hasRiderPosition() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public boolean hasRightPedalData() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
        public boolean hasTorque132Nm() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEventTimestamp12048S()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getEventTimestamp12048S();
            }
            if (hasCrankAngle1024Brads()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getCrankAngle1024Brads();
            }
            if (hasCumulativeWork14J()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getCumulativeWork14J();
            }
            if (hasCyclePeriod12048S()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getCyclePeriod12048S();
            }
            if (hasCoastingFlag()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Internal.hashBoolean(getCoastingFlag());
            }
            if (hasPower12W()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getPower12W();
            }
            if (hasBalancePercent()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getBalancePercent();
            }
            if (hasLeftPedalData()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getLeftPedalData().hashCode();
            }
            if (hasRightPedalData()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getRightPedalData().hashCode();
            }
            if (hasRiderPosition()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + this.riderPosition_;
            }
            if (hasCoastingTorque132Nm()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getCoastingTorque132Nm();
            }
            if (hasCadence18Rpm()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getCadence18Rpm();
            }
            if (hasTorque132Nm()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getTorque132Nm();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_MeasurementNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(MeasurementNotification.class, Builder.class);
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
            return new MeasurementNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.eventTimestamp12048S_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.crankAngle1024Brads_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeSInt32(3, this.cumulativeWork14J_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.cyclePeriod12048S_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(5, this.coastingFlag_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.power12W_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(7, this.balancePercent_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getLeftPedalData());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getRightPedalData());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeEnum(10, this.riderPosition_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeSInt32(11, this.coastingTorque132Nm_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeUInt32(12, this.cadence18Rpm_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeSInt32(13, this.torque132Nm_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MeasurementNotificationOrBuilder {
            private int balancePercent_;
            private int bitField0_;
            private int cadence18Rpm_;
            private boolean coastingFlag_;
            private int coastingTorque132Nm_;
            private int crankAngle1024Brads_;
            private int cumulativeWork14J_;
            private int cyclePeriod12048S_;
            private int eventTimestamp12048S_;
            private SingleFieldBuilderV3<PedalData, PedalData.Builder, PedalDataOrBuilder> leftPedalDataBuilder_;
            private PedalData leftPedalData_;
            private int power12W_;
            private int riderPosition_;
            private SingleFieldBuilderV3<PedalData, PedalData.Builder, PedalDataOrBuilder> rightPedalDataBuilder_;
            private PedalData rightPedalData_;
            private int torque132Nm_;

            private Builder() {
                this.riderPosition_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(MeasurementNotification measurementNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    measurementNotification.eventTimestamp12048S_ = this.eventTimestamp12048S_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    measurementNotification.crankAngle1024Brads_ = this.crankAngle1024Brads_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    measurementNotification.cumulativeWork14J_ = this.cumulativeWork14J_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    measurementNotification.cyclePeriod12048S_ = this.cyclePeriod12048S_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    measurementNotification.coastingFlag_ = this.coastingFlag_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    measurementNotification.power12W_ = this.power12W_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    measurementNotification.balancePercent_ = this.balancePercent_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<PedalData, PedalData.Builder, PedalDataOrBuilder> singleFieldBuilderV3 = this.leftPedalDataBuilder_;
                    measurementNotification.leftPedalData_ = singleFieldBuilderV3 == null ? this.leftPedalData_ : (PedalData) singleFieldBuilderV3.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<PedalData, PedalData.Builder, PedalDataOrBuilder> singleFieldBuilderV4 = this.rightPedalDataBuilder_;
                    measurementNotification.rightPedalData_ = singleFieldBuilderV4 == null ? this.rightPedalData_ : (PedalData) singleFieldBuilderV4.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    measurementNotification.riderPosition_ = this.riderPosition_;
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    measurementNotification.coastingTorque132Nm_ = this.coastingTorque132Nm_;
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    measurementNotification.cadence18Rpm_ = this.cadence18Rpm_;
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    measurementNotification.torque132Nm_ = this.torque132Nm_;
                    i14 |= 4096;
                }
                measurementNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_MeasurementNotification_descriptor;
            }

            private SingleFieldBuilderV3<PedalData, PedalData.Builder, PedalDataOrBuilder> getLeftPedalDataFieldBuilder() {
                if (this.leftPedalDataBuilder_ == null) {
                    this.leftPedalDataBuilder_ = new SingleFieldBuilderV3<>(getLeftPedalData(), getParentForChildren(), isClean());
                    this.leftPedalData_ = null;
                }
                return this.leftPedalDataBuilder_;
            }

            private SingleFieldBuilderV3<PedalData, PedalData.Builder, PedalDataOrBuilder> getRightPedalDataFieldBuilder() {
                if (this.rightPedalDataBuilder_ == null) {
                    this.rightPedalDataBuilder_ = new SingleFieldBuilderV3<>(getRightPedalData(), getParentForChildren(), isClean());
                    this.rightPedalData_ = null;
                }
                return this.rightPedalDataBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getLeftPedalDataFieldBuilder();
                    getRightPedalDataFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MeasurementNotification build() {
                MeasurementNotification measurementNotificationBuildPartial = buildPartial();
                if (measurementNotificationBuildPartial.isInitialized()) {
                    return measurementNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) measurementNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MeasurementNotification buildPartial() {
                MeasurementNotification measurementNotification = new MeasurementNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(measurementNotification);
                }
                onBuilt();
                return measurementNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.eventTimestamp12048S_ = 0;
                this.crankAngle1024Brads_ = 0;
                this.cumulativeWork14J_ = 0;
                this.cyclePeriod12048S_ = 0;
                this.coastingFlag_ = false;
                this.power12W_ = 0;
                this.balancePercent_ = 0;
                this.leftPedalData_ = null;
                SingleFieldBuilderV3<PedalData, PedalData.Builder, PedalDataOrBuilder> singleFieldBuilderV3 = this.leftPedalDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.leftPedalDataBuilder_ = null;
                }
                this.rightPedalData_ = null;
                SingleFieldBuilderV3<PedalData, PedalData.Builder, PedalDataOrBuilder> singleFieldBuilderV4 = this.rightPedalDataBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.rightPedalDataBuilder_ = null;
                }
                this.riderPosition_ = 0;
                this.coastingTorque132Nm_ = 0;
                this.cadence18Rpm_ = 0;
                this.torque132Nm_ = 0;
                return this;
            }

            public Builder clearBalancePercent() {
                this.bitField0_ &= -65;
                this.balancePercent_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCadence18Rpm() {
                this.bitField0_ &= -2049;
                this.cadence18Rpm_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCoastingFlag() {
                this.bitField0_ &= -17;
                this.coastingFlag_ = false;
                onChanged();
                return this;
            }

            public Builder clearCoastingTorque132Nm() {
                this.bitField0_ &= -1025;
                this.coastingTorque132Nm_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCrankAngle1024Brads() {
                this.bitField0_ &= -3;
                this.crankAngle1024Brads_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCumulativeWork14J() {
                this.bitField0_ &= -5;
                this.cumulativeWork14J_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCyclePeriod12048S() {
                this.bitField0_ &= -9;
                this.cyclePeriod12048S_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEventTimestamp12048S() {
                this.bitField0_ &= -2;
                this.eventTimestamp12048S_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLeftPedalData() {
                this.bitField0_ &= -129;
                this.leftPedalData_ = null;
                SingleFieldBuilderV3<PedalData, PedalData.Builder, PedalDataOrBuilder> singleFieldBuilderV3 = this.leftPedalDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.leftPedalDataBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPower12W() {
                this.bitField0_ &= -33;
                this.power12W_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRiderPosition() {
                this.bitField0_ &= -513;
                this.riderPosition_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRightPedalData() {
                this.bitField0_ &= -257;
                this.rightPedalData_ = null;
                SingleFieldBuilderV3<PedalData, PedalData.Builder, PedalDataOrBuilder> singleFieldBuilderV3 = this.rightPedalDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.rightPedalDataBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTorque132Nm() {
                this.bitField0_ &= -4097;
                this.torque132Nm_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public int getBalancePercent() {
                return this.balancePercent_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public int getCadence18Rpm() {
                return this.cadence18Rpm_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public boolean getCoastingFlag() {
                return this.coastingFlag_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public int getCoastingTorque132Nm() {
                return this.coastingTorque132Nm_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public int getCrankAngle1024Brads() {
                return this.crankAngle1024Brads_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public int getCumulativeWork14J() {
                return this.cumulativeWork14J_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public int getCyclePeriod12048S() {
                return this.cyclePeriod12048S_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_MeasurementNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public int getEventTimestamp12048S() {
                return this.eventTimestamp12048S_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public PedalData getLeftPedalData() {
                SingleFieldBuilderV3<PedalData, PedalData.Builder, PedalDataOrBuilder> singleFieldBuilderV3 = this.leftPedalDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PedalData) singleFieldBuilderV3.getMessage();
                }
                PedalData pedalData = this.leftPedalData_;
                return pedalData == null ? PedalData.getDefaultInstance() : pedalData;
            }

            public PedalData.Builder getLeftPedalDataBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (PedalData.Builder) getLeftPedalDataFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public PedalDataOrBuilder getLeftPedalDataOrBuilder() {
                SingleFieldBuilderV3<PedalData, PedalData.Builder, PedalDataOrBuilder> singleFieldBuilderV3 = this.leftPedalDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PedalDataOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PedalData pedalData = this.leftPedalData_;
                return pedalData == null ? PedalData.getDefaultInstance() : pedalData;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public int getPower12W() {
                return this.power12W_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public RiderPosition getRiderPosition() {
                RiderPosition riderPositionForNumber = RiderPosition.forNumber(this.riderPosition_);
                return riderPositionForNumber == null ? RiderPosition.SEATED : riderPositionForNumber;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public PedalData getRightPedalData() {
                SingleFieldBuilderV3<PedalData, PedalData.Builder, PedalDataOrBuilder> singleFieldBuilderV3 = this.rightPedalDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PedalData) singleFieldBuilderV3.getMessage();
                }
                PedalData pedalData = this.rightPedalData_;
                return pedalData == null ? PedalData.getDefaultInstance() : pedalData;
            }

            public PedalData.Builder getRightPedalDataBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (PedalData.Builder) getRightPedalDataFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public PedalDataOrBuilder getRightPedalDataOrBuilder() {
                SingleFieldBuilderV3<PedalData, PedalData.Builder, PedalDataOrBuilder> singleFieldBuilderV3 = this.rightPedalDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PedalDataOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PedalData pedalData = this.rightPedalData_;
                return pedalData == null ? PedalData.getDefaultInstance() : pedalData;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public int getTorque132Nm() {
                return this.torque132Nm_;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public boolean hasBalancePercent() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public boolean hasCadence18Rpm() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public boolean hasCoastingFlag() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public boolean hasCoastingTorque132Nm() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public boolean hasCrankAngle1024Brads() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public boolean hasCumulativeWork14J() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public boolean hasCyclePeriod12048S() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public boolean hasEventTimestamp12048S() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public boolean hasLeftPedalData() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public boolean hasPower12W() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public boolean hasRiderPosition() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public boolean hasRightPedalData() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.MeasurementNotificationOrBuilder
            public boolean hasTorque132Nm() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_MeasurementNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(MeasurementNotification.class, Builder.class);
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
                                case 8:
                                    this.eventTimestamp12048S_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 16:
                                    this.crankAngle1024Brads_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 24:
                                    this.cumulativeWork14J_ = codedInputStream.readSInt32();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 32:
                                    this.cyclePeriod12048S_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 40:
                                    this.coastingFlag_ = codedInputStream.readBool();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 48:
                                    this.power12W_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 56:
                                    this.balancePercent_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getLeftPedalDataFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getRightPedalDataFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 80:
                                    int i14 = codedInputStream.readEnum();
                                    if (RiderPosition.forNumber(i14) == null) {
                                        mergeUnknownVarintField(10, i14);
                                    } else {
                                        this.riderPosition_ = i14;
                                        this.bitField0_ |= 512;
                                        continue;
                                    }
                                    break;
                                case 88:
                                    this.coastingTorque132Nm_ = codedInputStream.readSInt32();
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 96:
                                    this.cadence18Rpm_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 104:
                                    this.torque132Nm_ = codedInputStream.readSInt32();
                                    this.bitField0_ |= 4096;
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

            public Builder mergeLeftPedalData(PedalData pedalData) {
                PedalData pedalData2;
                SingleFieldBuilderV3<PedalData, PedalData.Builder, PedalDataOrBuilder> singleFieldBuilderV3 = this.leftPedalDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(pedalData);
                } else if ((this.bitField0_ & 128) == 0 || (pedalData2 = this.leftPedalData_) == null || pedalData2 == PedalData.getDefaultInstance()) {
                    this.leftPedalData_ = pedalData;
                } else {
                    getLeftPedalDataBuilder().mergeFrom(pedalData);
                }
                if (this.leftPedalData_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRightPedalData(PedalData pedalData) {
                PedalData pedalData2;
                SingleFieldBuilderV3<PedalData, PedalData.Builder, PedalDataOrBuilder> singleFieldBuilderV3 = this.rightPedalDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(pedalData);
                } else if ((this.bitField0_ & 256) == 0 || (pedalData2 = this.rightPedalData_) == null || pedalData2 == PedalData.getDefaultInstance()) {
                    this.rightPedalData_ = pedalData;
                } else {
                    getRightPedalDataBuilder().mergeFrom(pedalData);
                }
                if (this.rightPedalData_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setBalancePercent(int i14) {
                this.balancePercent_ = i14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setCadence18Rpm(int i14) {
                this.cadence18Rpm_ = i14;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setCoastingFlag(boolean z14) {
                this.coastingFlag_ = z14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setCoastingTorque132Nm(int i14) {
                this.coastingTorque132Nm_ = i14;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setCrankAngle1024Brads(int i14) {
                this.crankAngle1024Brads_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCumulativeWork14J(int i14) {
                this.cumulativeWork14J_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setCyclePeriod12048S(int i14) {
                this.cyclePeriod12048S_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setEventTimestamp12048S(int i14) {
                this.eventTimestamp12048S_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLeftPedalData(PedalData.Builder builder) {
                SingleFieldBuilderV3<PedalData, PedalData.Builder, PedalDataOrBuilder> singleFieldBuilderV3 = this.leftPedalDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.leftPedalData_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setPower12W(int i14) {
                this.power12W_ = i14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setRiderPosition(RiderPosition riderPosition) {
                riderPosition.getClass();
                this.bitField0_ |= 512;
                this.riderPosition_ = riderPosition.getNumber();
                onChanged();
                return this;
            }

            public Builder setRightPedalData(PedalData.Builder builder) {
                SingleFieldBuilderV3<PedalData, PedalData.Builder, PedalDataOrBuilder> singleFieldBuilderV3 = this.rightPedalDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.rightPedalData_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setTorque132Nm(int i14) {
                this.torque132Nm_ = i14;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public MeasurementNotification getDefaultInstanceForType() {
                return MeasurementNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.riderPosition_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setLeftPedalData(PedalData pedalData) {
                SingleFieldBuilderV3<PedalData, PedalData.Builder, PedalDataOrBuilder> singleFieldBuilderV3 = this.leftPedalDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    pedalData.getClass();
                    this.leftPedalData_ = pedalData;
                } else {
                    singleFieldBuilderV3.setMessage(pedalData);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setRightPedalData(PedalData pedalData) {
                SingleFieldBuilderV3<PedalData, PedalData.Builder, PedalDataOrBuilder> singleFieldBuilderV3 = this.rightPedalDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    pedalData.getClass();
                    this.rightPedalData_ = pedalData;
                } else {
                    singleFieldBuilderV3.setMessage(pedalData);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MeasurementNotification) {
                    return mergeFrom((MeasurementNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MeasurementNotification measurementNotification) {
                if (measurementNotification == MeasurementNotification.getDefaultInstance()) {
                    return this;
                }
                if (measurementNotification.hasEventTimestamp12048S()) {
                    setEventTimestamp12048S(measurementNotification.getEventTimestamp12048S());
                }
                if (measurementNotification.hasCrankAngle1024Brads()) {
                    setCrankAngle1024Brads(measurementNotification.getCrankAngle1024Brads());
                }
                if (measurementNotification.hasCumulativeWork14J()) {
                    setCumulativeWork14J(measurementNotification.getCumulativeWork14J());
                }
                if (measurementNotification.hasCyclePeriod12048S()) {
                    setCyclePeriod12048S(measurementNotification.getCyclePeriod12048S());
                }
                if (measurementNotification.hasCoastingFlag()) {
                    setCoastingFlag(measurementNotification.getCoastingFlag());
                }
                if (measurementNotification.hasPower12W()) {
                    setPower12W(measurementNotification.getPower12W());
                }
                if (measurementNotification.hasBalancePercent()) {
                    setBalancePercent(measurementNotification.getBalancePercent());
                }
                if (measurementNotification.hasLeftPedalData()) {
                    mergeLeftPedalData(measurementNotification.getLeftPedalData());
                }
                if (measurementNotification.hasRightPedalData()) {
                    mergeRightPedalData(measurementNotification.getRightPedalData());
                }
                if (measurementNotification.hasRiderPosition()) {
                    setRiderPosition(measurementNotification.getRiderPosition());
                }
                if (measurementNotification.hasCoastingTorque132Nm()) {
                    setCoastingTorque132Nm(measurementNotification.getCoastingTorque132Nm());
                }
                if (measurementNotification.hasCadence18Rpm()) {
                    setCadence18Rpm(measurementNotification.getCadence18Rpm());
                }
                if (measurementNotification.hasTorque132Nm()) {
                    setTorque132Nm(measurementNotification.getTorque132Nm());
                }
                mergeUnknownFields(measurementNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MeasurementNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static MeasurementNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MeasurementNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MeasurementNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static MeasurementNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MeasurementNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static MeasurementNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static MeasurementNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MeasurementNotification parseFrom(InputStream inputStream) {
            return (MeasurementNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static MeasurementNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MeasurementNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MeasurementNotification parseFrom(CodedInputStream codedInputStream) {
            return (MeasurementNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MeasurementNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MeasurementNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum RiderPosition implements ProtocolMessageEnum {
            SEATED(0),
            TRANSITION_TO_SEATED(1),
            STANDING(2),
            TRANSITION_TO_STANDING(3);

            public static final int SEATED_VALUE = 0;
            public static final int STANDING_VALUE = 2;
            public static final int TRANSITION_TO_SEATED_VALUE = 1;
            public static final int TRANSITION_TO_STANDING_VALUE = 3;
            private final int value;
            private static final Internal.EnumLiteMap<RiderPosition> internalValueMap = new Internal.EnumLiteMap<RiderPosition>() { // from class: com.garmin.proto.generated.GDIBikePower.MeasurementNotification.RiderPosition.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public RiderPosition findValueByNumber(int i14) {
                    return RiderPosition.forNumber(i14);
                }
            };
            private static final RiderPosition[] VALUES = values();

            RiderPosition(int i14) {
                this.value = i14;
            }

            public static RiderPosition forNumber(int i14) {
                if (i14 == 0) {
                    return SEATED;
                }
                if (i14 == 1) {
                    return TRANSITION_TO_SEATED;
                }
                if (i14 == 2) {
                    return STANDING;
                }
                if (i14 != 3) {
                    return null;
                }
                return TRANSITION_TO_STANDING;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return MeasurementNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<RiderPosition> internalGetValueMap() {
                return internalValueMap;
            }

            public static RiderPosition valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static RiderPosition valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public /* synthetic */ MeasurementNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private MeasurementNotification() {
            this.eventTimestamp12048S_ = 0;
            this.crankAngle1024Brads_ = 0;
            this.cumulativeWork14J_ = 0;
            this.cyclePeriod12048S_ = 0;
            this.coastingFlag_ = false;
            this.power12W_ = 0;
            this.balancePercent_ = 0;
            this.coastingTorque132Nm_ = 0;
            this.cadence18Rpm_ = 0;
            this.torque132Nm_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.riderPosition_ = 0;
        }
    }

    public static final class PedalIQNotification extends GeneratedMessageV3 implements PedalIQNotificationOrBuilder {
        public static final int DETECTED_CHANGE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int detectedChange_;
        private byte memoizedIsInitialized;
        private static final PedalIQNotification DEFAULT_INSTANCE = new PedalIQNotification();

        @Deprecated
        public static final Parser<PedalIQNotification> PARSER = new AbstractParser<PedalIQNotification>() { // from class: com.garmin.proto.generated.GDIBikePower.PedalIQNotification.1
            @Override // com.google.protobuf.Parser
            public PedalIQNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PedalIQNotification.newBuilder();
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

        private PedalIQNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.detectedChange_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PedalIQNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_PedalIQNotification_descriptor;
        }

        public static Builder newBuilder(PedalIQNotification pedalIQNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pedalIQNotification);
        }

        public static PedalIQNotification parseDelimitedFrom(InputStream inputStream) {
            return (PedalIQNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PedalIQNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PedalIQNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PedalIQNotification)) {
                return super.equals(obj);
            }
            PedalIQNotification pedalIQNotification = (PedalIQNotification) obj;
            if (hasDetectedChange() != pedalIQNotification.hasDetectedChange()) {
                return false;
            }
            return (!hasDetectedChange() || this.detectedChange_ == pedalIQNotification.detectedChange_) && getUnknownFields().equals(pedalIQNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIBikePower.PedalIQNotificationOrBuilder
        public DetectedChange getDetectedChange() {
            DetectedChange detectedChangeForNumber = DetectedChange.forNumber(this.detectedChange_);
            return detectedChangeForNumber == null ? DetectedChange.Temperature : detectedChangeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PedalIQNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.detectedChange_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.PedalIQNotificationOrBuilder
        public boolean hasDetectedChange() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDetectedChange()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.detectedChange_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_PedalIQNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(PedalIQNotification.class, Builder.class);
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
            return new PedalIQNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.detectedChange_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PedalIQNotificationOrBuilder {
            private int bitField0_;
            private int detectedChange_;

            private Builder() {
                this.detectedChange_ = 0;
            }

            private void buildPartial0(PedalIQNotification pedalIQNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    pedalIQNotification.detectedChange_ = this.detectedChange_;
                } else {
                    i14 = 0;
                }
                pedalIQNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_PedalIQNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PedalIQNotification build() {
                PedalIQNotification pedalIQNotificationBuildPartial = buildPartial();
                if (pedalIQNotificationBuildPartial.isInitialized()) {
                    return pedalIQNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pedalIQNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PedalIQNotification buildPartial() {
                PedalIQNotification pedalIQNotification = new PedalIQNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(pedalIQNotification);
                }
                onBuilt();
                return pedalIQNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.detectedChange_ = 0;
                return this;
            }

            public Builder clearDetectedChange() {
                this.bitField0_ &= -2;
                this.detectedChange_ = 0;
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
                return GDIBikePower.internal_static_GDI_Proto_BikePower_PedalIQNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.PedalIQNotificationOrBuilder
            public DetectedChange getDetectedChange() {
                DetectedChange detectedChangeForNumber = DetectedChange.forNumber(this.detectedChange_);
                return detectedChangeForNumber == null ? DetectedChange.Temperature : detectedChangeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.PedalIQNotificationOrBuilder
            public boolean hasDetectedChange() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_PedalIQNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(PedalIQNotification.class, Builder.class);
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
                                    if (DetectedChange.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.detectedChange_ = i14;
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

            public Builder setDetectedChange(DetectedChange detectedChange) {
                detectedChange.getClass();
                this.bitField0_ |= 1;
                this.detectedChange_ = detectedChange.getNumber();
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
            public PedalIQNotification getDefaultInstanceForType() {
                return PedalIQNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.detectedChange_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PedalIQNotification) {
                    return mergeFrom((PedalIQNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PedalIQNotification pedalIQNotification) {
                if (pedalIQNotification == PedalIQNotification.getDefaultInstance()) {
                    return this;
                }
                if (pedalIQNotification.hasDetectedChange()) {
                    setDetectedChange(pedalIQNotification.getDetectedChange());
                }
                mergeUnknownFields(pedalIQNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PedalIQNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static PedalIQNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PedalIQNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PedalIQNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ PedalIQNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static PedalIQNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private PedalIQNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.detectedChange_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PedalIQNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PedalIQNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PedalIQNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PedalIQNotification parseFrom(InputStream inputStream) {
            return (PedalIQNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PedalIQNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PedalIQNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PedalIQNotification parseFrom(CodedInputStream codedInputStream) {
            return (PedalIQNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PedalIQNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PedalIQNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum DetectedChange implements ProtocolMessageEnum {
            Temperature(0),
            CalibrationTime(1),
            CorrectedTorque(2),
            InstallAngle(3);

            public static final int CalibrationTime_VALUE = 1;
            public static final int CorrectedTorque_VALUE = 2;
            public static final int InstallAngle_VALUE = 3;
            public static final int Temperature_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<DetectedChange> internalValueMap = new Internal.EnumLiteMap<DetectedChange>() { // from class: com.garmin.proto.generated.GDIBikePower.PedalIQNotification.DetectedChange.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public DetectedChange findValueByNumber(int i14) {
                    return DetectedChange.forNumber(i14);
                }
            };
            private static final DetectedChange[] VALUES = values();

            DetectedChange(int i14) {
                this.value = i14;
            }

            public static DetectedChange forNumber(int i14) {
                if (i14 == 0) {
                    return Temperature;
                }
                if (i14 == 1) {
                    return CalibrationTime;
                }
                if (i14 == 2) {
                    return CorrectedTorque;
                }
                if (i14 != 3) {
                    return null;
                }
                return InstallAngle;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return PedalIQNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<DetectedChange> internalGetValueMap() {
                return internalValueMap;
            }

            public static DetectedChange valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static DetectedChange valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int CALIBRATION_REQUEST_FIELD_NUMBER = 4;
        public static final int CALIBRATION_RESPONSE_FIELD_NUMBER = 5;
        public static final int CONFIG_NOTIFICATION_FIELD_NUMBER = 3;
        public static final int CONFIG_REQUEST_FIELD_NUMBER = 1;
        public static final int CONFIG_RESPONSE_FIELD_NUMBER = 2;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIBikePower.Service.1
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
        public static final int PEDAL_IQ_NOTIFICATION_FIELD_NUMBER = 6;
        public static final int STATUS_NOTIFICATION_FIELD_NUMBER = 7;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private CalibrationRequest calibrationRequest_;
        private CalibrationResponse calibrationResponse_;
        private ConfigurationNotification configNotification_;
        private ConfigurationRequest configRequest_;
        private ConfigurationResponse configResponse_;
        private byte memoizedIsInitialized;
        private PedalIQNotification pedalIqNotification_;
        private StatusNotification statusNotification_;

        private Service(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_Service_descriptor;
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
            if (hasConfigRequest() != service.hasConfigRequest()) {
                return false;
            }
            if ((hasConfigRequest() && !getConfigRequest().equals(service.getConfigRequest())) || hasConfigResponse() != service.hasConfigResponse()) {
                return false;
            }
            if ((hasConfigResponse() && !getConfigResponse().equals(service.getConfigResponse())) || hasConfigNotification() != service.hasConfigNotification()) {
                return false;
            }
            if ((hasConfigNotification() && !getConfigNotification().equals(service.getConfigNotification())) || hasCalibrationRequest() != service.hasCalibrationRequest()) {
                return false;
            }
            if ((hasCalibrationRequest() && !getCalibrationRequest().equals(service.getCalibrationRequest())) || hasCalibrationResponse() != service.hasCalibrationResponse()) {
                return false;
            }
            if ((hasCalibrationResponse() && !getCalibrationResponse().equals(service.getCalibrationResponse())) || hasPedalIqNotification() != service.hasPedalIqNotification()) {
                return false;
            }
            if ((!hasPedalIqNotification() || getPedalIqNotification().equals(service.getPedalIqNotification())) && hasStatusNotification() == service.hasStatusNotification()) {
                return (!hasStatusNotification() || getStatusNotification().equals(service.getStatusNotification())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
        public CalibrationRequest getCalibrationRequest() {
            CalibrationRequest calibrationRequest = this.calibrationRequest_;
            return calibrationRequest == null ? CalibrationRequest.getDefaultInstance() : calibrationRequest;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
        public CalibrationRequestOrBuilder getCalibrationRequestOrBuilder() {
            CalibrationRequest calibrationRequest = this.calibrationRequest_;
            return calibrationRequest == null ? CalibrationRequest.getDefaultInstance() : calibrationRequest;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
        public CalibrationResponse getCalibrationResponse() {
            CalibrationResponse calibrationResponse = this.calibrationResponse_;
            return calibrationResponse == null ? CalibrationResponse.getDefaultInstance() : calibrationResponse;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
        public CalibrationResponseOrBuilder getCalibrationResponseOrBuilder() {
            CalibrationResponse calibrationResponse = this.calibrationResponse_;
            return calibrationResponse == null ? CalibrationResponse.getDefaultInstance() : calibrationResponse;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
        public ConfigurationNotification getConfigNotification() {
            ConfigurationNotification configurationNotification = this.configNotification_;
            return configurationNotification == null ? ConfigurationNotification.getDefaultInstance() : configurationNotification;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
        public ConfigurationNotificationOrBuilder getConfigNotificationOrBuilder() {
            ConfigurationNotification configurationNotification = this.configNotification_;
            return configurationNotification == null ? ConfigurationNotification.getDefaultInstance() : configurationNotification;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
        public ConfigurationRequest getConfigRequest() {
            ConfigurationRequest configurationRequest = this.configRequest_;
            return configurationRequest == null ? ConfigurationRequest.getDefaultInstance() : configurationRequest;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
        public ConfigurationRequestOrBuilder getConfigRequestOrBuilder() {
            ConfigurationRequest configurationRequest = this.configRequest_;
            return configurationRequest == null ? ConfigurationRequest.getDefaultInstance() : configurationRequest;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
        public ConfigurationResponse getConfigResponse() {
            ConfigurationResponse configurationResponse = this.configResponse_;
            return configurationResponse == null ? ConfigurationResponse.getDefaultInstance() : configurationResponse;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
        public ConfigurationResponseOrBuilder getConfigResponseOrBuilder() {
            ConfigurationResponse configurationResponse = this.configResponse_;
            return configurationResponse == null ? ConfigurationResponse.getDefaultInstance() : configurationResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Service> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
        public PedalIQNotification getPedalIqNotification() {
            PedalIQNotification pedalIQNotification = this.pedalIqNotification_;
            return pedalIQNotification == null ? PedalIQNotification.getDefaultInstance() : pedalIQNotification;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
        public PedalIQNotificationOrBuilder getPedalIqNotificationOrBuilder() {
            PedalIQNotification pedalIQNotification = this.pedalIqNotification_;
            return pedalIQNotification == null ? PedalIQNotification.getDefaultInstance() : pedalIQNotification;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getConfigRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getConfigResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getConfigNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getCalibrationRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getCalibrationResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getPedalIqNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getStatusNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
        public StatusNotification getStatusNotification() {
            StatusNotification statusNotification = this.statusNotification_;
            return statusNotification == null ? StatusNotification.getDefaultInstance() : statusNotification;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
        public StatusNotificationOrBuilder getStatusNotificationOrBuilder() {
            StatusNotification statusNotification = this.statusNotification_;
            return statusNotification == null ? StatusNotification.getDefaultInstance() : statusNotification;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
        public boolean hasCalibrationRequest() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
        public boolean hasCalibrationResponse() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
        public boolean hasConfigNotification() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
        public boolean hasConfigRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
        public boolean hasConfigResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
        public boolean hasPedalIqNotification() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
        public boolean hasStatusNotification() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConfigRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConfigRequest().hashCode();
            }
            if (hasConfigResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getConfigResponse().hashCode();
            }
            if (hasConfigNotification()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getConfigNotification().hashCode();
            }
            if (hasCalibrationRequest()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getCalibrationRequest().hashCode();
            }
            if (hasCalibrationResponse()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getCalibrationResponse().hashCode();
            }
            if (hasPedalIqNotification()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getPedalIqNotification().hashCode();
            }
            if (hasStatusNotification()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getStatusNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getConfigRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getConfigResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getConfigNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getCalibrationRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getCalibrationResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getPedalIqNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getStatusNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<CalibrationRequest, CalibrationRequest.Builder, CalibrationRequestOrBuilder> calibrationRequestBuilder_;
            private CalibrationRequest calibrationRequest_;
            private SingleFieldBuilderV3<CalibrationResponse, CalibrationResponse.Builder, CalibrationResponseOrBuilder> calibrationResponseBuilder_;
            private CalibrationResponse calibrationResponse_;
            private SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> configNotificationBuilder_;
            private ConfigurationNotification configNotification_;
            private SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> configRequestBuilder_;
            private ConfigurationRequest configRequest_;
            private SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> configResponseBuilder_;
            private ConfigurationResponse configResponse_;
            private SingleFieldBuilderV3<PedalIQNotification, PedalIQNotification.Builder, PedalIQNotificationOrBuilder> pedalIqNotificationBuilder_;
            private PedalIQNotification pedalIqNotification_;
            private SingleFieldBuilderV3<StatusNotification, StatusNotification.Builder, StatusNotificationOrBuilder> statusNotificationBuilder_;
            private StatusNotification statusNotification_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                    service.configRequest_ = singleFieldBuilderV3 == null ? this.configRequest_ : (ConfigurationRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV4 = this.configResponseBuilder_;
                    service.configResponse_ = singleFieldBuilderV4 == null ? this.configResponse_ : (ConfigurationResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV5 = this.configNotificationBuilder_;
                    service.configNotification_ = singleFieldBuilderV5 == null ? this.configNotification_ : (ConfigurationNotification) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<CalibrationRequest, CalibrationRequest.Builder, CalibrationRequestOrBuilder> singleFieldBuilderV6 = this.calibrationRequestBuilder_;
                    service.calibrationRequest_ = singleFieldBuilderV6 == null ? this.calibrationRequest_ : (CalibrationRequest) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<CalibrationResponse, CalibrationResponse.Builder, CalibrationResponseOrBuilder> singleFieldBuilderV7 = this.calibrationResponseBuilder_;
                    service.calibrationResponse_ = singleFieldBuilderV7 == null ? this.calibrationResponse_ : (CalibrationResponse) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<PedalIQNotification, PedalIQNotification.Builder, PedalIQNotificationOrBuilder> singleFieldBuilderV8 = this.pedalIqNotificationBuilder_;
                    service.pedalIqNotification_ = singleFieldBuilderV8 == null ? this.pedalIqNotification_ : (PedalIQNotification) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<StatusNotification, StatusNotification.Builder, StatusNotificationOrBuilder> singleFieldBuilderV9 = this.statusNotificationBuilder_;
                    service.statusNotification_ = singleFieldBuilderV9 == null ? this.statusNotification_ : (StatusNotification) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                service.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<CalibrationRequest, CalibrationRequest.Builder, CalibrationRequestOrBuilder> getCalibrationRequestFieldBuilder() {
                if (this.calibrationRequestBuilder_ == null) {
                    this.calibrationRequestBuilder_ = new SingleFieldBuilderV3<>(getCalibrationRequest(), getParentForChildren(), isClean());
                    this.calibrationRequest_ = null;
                }
                return this.calibrationRequestBuilder_;
            }

            private SingleFieldBuilderV3<CalibrationResponse, CalibrationResponse.Builder, CalibrationResponseOrBuilder> getCalibrationResponseFieldBuilder() {
                if (this.calibrationResponseBuilder_ == null) {
                    this.calibrationResponseBuilder_ = new SingleFieldBuilderV3<>(getCalibrationResponse(), getParentForChildren(), isClean());
                    this.calibrationResponse_ = null;
                }
                return this.calibrationResponseBuilder_;
            }

            private SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> getConfigNotificationFieldBuilder() {
                if (this.configNotificationBuilder_ == null) {
                    this.configNotificationBuilder_ = new SingleFieldBuilderV3<>(getConfigNotification(), getParentForChildren(), isClean());
                    this.configNotification_ = null;
                }
                return this.configNotificationBuilder_;
            }

            private SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> getConfigRequestFieldBuilder() {
                if (this.configRequestBuilder_ == null) {
                    this.configRequestBuilder_ = new SingleFieldBuilderV3<>(getConfigRequest(), getParentForChildren(), isClean());
                    this.configRequest_ = null;
                }
                return this.configRequestBuilder_;
            }

            private SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> getConfigResponseFieldBuilder() {
                if (this.configResponseBuilder_ == null) {
                    this.configResponseBuilder_ = new SingleFieldBuilderV3<>(getConfigResponse(), getParentForChildren(), isClean());
                    this.configResponse_ = null;
                }
                return this.configResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_Service_descriptor;
            }

            private SingleFieldBuilderV3<PedalIQNotification, PedalIQNotification.Builder, PedalIQNotificationOrBuilder> getPedalIqNotificationFieldBuilder() {
                if (this.pedalIqNotificationBuilder_ == null) {
                    this.pedalIqNotificationBuilder_ = new SingleFieldBuilderV3<>(getPedalIqNotification(), getParentForChildren(), isClean());
                    this.pedalIqNotification_ = null;
                }
                return this.pedalIqNotificationBuilder_;
            }

            private SingleFieldBuilderV3<StatusNotification, StatusNotification.Builder, StatusNotificationOrBuilder> getStatusNotificationFieldBuilder() {
                if (this.statusNotificationBuilder_ == null) {
                    this.statusNotificationBuilder_ = new SingleFieldBuilderV3<>(getStatusNotification(), getParentForChildren(), isClean());
                    this.statusNotification_ = null;
                }
                return this.statusNotificationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConfigRequestFieldBuilder();
                    getConfigResponseFieldBuilder();
                    getConfigNotificationFieldBuilder();
                    getCalibrationRequestFieldBuilder();
                    getCalibrationResponseFieldBuilder();
                    getPedalIqNotificationFieldBuilder();
                    getStatusNotificationFieldBuilder();
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
                this.configRequest_ = null;
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configRequestBuilder_ = null;
                }
                this.configResponse_ = null;
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV4 = this.configResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.configResponseBuilder_ = null;
                }
                this.configNotification_ = null;
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV5 = this.configNotificationBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.configNotificationBuilder_ = null;
                }
                this.calibrationRequest_ = null;
                SingleFieldBuilderV3<CalibrationRequest, CalibrationRequest.Builder, CalibrationRequestOrBuilder> singleFieldBuilderV6 = this.calibrationRequestBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.calibrationRequestBuilder_ = null;
                }
                this.calibrationResponse_ = null;
                SingleFieldBuilderV3<CalibrationResponse, CalibrationResponse.Builder, CalibrationResponseOrBuilder> singleFieldBuilderV7 = this.calibrationResponseBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.calibrationResponseBuilder_ = null;
                }
                this.pedalIqNotification_ = null;
                SingleFieldBuilderV3<PedalIQNotification, PedalIQNotification.Builder, PedalIQNotificationOrBuilder> singleFieldBuilderV8 = this.pedalIqNotificationBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.pedalIqNotificationBuilder_ = null;
                }
                this.statusNotification_ = null;
                SingleFieldBuilderV3<StatusNotification, StatusNotification.Builder, StatusNotificationOrBuilder> singleFieldBuilderV9 = this.statusNotificationBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.statusNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearCalibrationRequest() {
                this.bitField0_ &= -9;
                this.calibrationRequest_ = null;
                SingleFieldBuilderV3<CalibrationRequest, CalibrationRequest.Builder, CalibrationRequestOrBuilder> singleFieldBuilderV3 = this.calibrationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.calibrationRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCalibrationResponse() {
                this.bitField0_ &= -17;
                this.calibrationResponse_ = null;
                SingleFieldBuilderV3<CalibrationResponse, CalibrationResponse.Builder, CalibrationResponseOrBuilder> singleFieldBuilderV3 = this.calibrationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.calibrationResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConfigNotification() {
                this.bitField0_ &= -5;
                this.configNotification_ = null;
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConfigRequest() {
                this.bitField0_ &= -2;
                this.configRequest_ = null;
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConfigResponse() {
                this.bitField0_ &= -3;
                this.configResponse_ = null;
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configResponseBuilder_ = null;
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

            public Builder clearPedalIqNotification() {
                this.bitField0_ &= -33;
                this.pedalIqNotification_ = null;
                SingleFieldBuilderV3<PedalIQNotification, PedalIQNotification.Builder, PedalIQNotificationOrBuilder> singleFieldBuilderV3 = this.pedalIqNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.pedalIqNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStatusNotification() {
                this.bitField0_ &= -65;
                this.statusNotification_ = null;
                SingleFieldBuilderV3<StatusNotification, StatusNotification.Builder, StatusNotificationOrBuilder> singleFieldBuilderV3 = this.statusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
            public CalibrationRequest getCalibrationRequest() {
                SingleFieldBuilderV3<CalibrationRequest, CalibrationRequest.Builder, CalibrationRequestOrBuilder> singleFieldBuilderV3 = this.calibrationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CalibrationRequest) singleFieldBuilderV3.getMessage();
                }
                CalibrationRequest calibrationRequest = this.calibrationRequest_;
                return calibrationRequest == null ? CalibrationRequest.getDefaultInstance() : calibrationRequest;
            }

            public CalibrationRequest.Builder getCalibrationRequestBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (CalibrationRequest.Builder) getCalibrationRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
            public CalibrationRequestOrBuilder getCalibrationRequestOrBuilder() {
                SingleFieldBuilderV3<CalibrationRequest, CalibrationRequest.Builder, CalibrationRequestOrBuilder> singleFieldBuilderV3 = this.calibrationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CalibrationRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CalibrationRequest calibrationRequest = this.calibrationRequest_;
                return calibrationRequest == null ? CalibrationRequest.getDefaultInstance() : calibrationRequest;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
            public CalibrationResponse getCalibrationResponse() {
                SingleFieldBuilderV3<CalibrationResponse, CalibrationResponse.Builder, CalibrationResponseOrBuilder> singleFieldBuilderV3 = this.calibrationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CalibrationResponse) singleFieldBuilderV3.getMessage();
                }
                CalibrationResponse calibrationResponse = this.calibrationResponse_;
                return calibrationResponse == null ? CalibrationResponse.getDefaultInstance() : calibrationResponse;
            }

            public CalibrationResponse.Builder getCalibrationResponseBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (CalibrationResponse.Builder) getCalibrationResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
            public CalibrationResponseOrBuilder getCalibrationResponseOrBuilder() {
                SingleFieldBuilderV3<CalibrationResponse, CalibrationResponse.Builder, CalibrationResponseOrBuilder> singleFieldBuilderV3 = this.calibrationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CalibrationResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CalibrationResponse calibrationResponse = this.calibrationResponse_;
                return calibrationResponse == null ? CalibrationResponse.getDefaultInstance() : calibrationResponse;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
            public ConfigurationNotification getConfigNotification() {
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationNotification) singleFieldBuilderV3.getMessage();
                }
                ConfigurationNotification configurationNotification = this.configNotification_;
                return configurationNotification == null ? ConfigurationNotification.getDefaultInstance() : configurationNotification;
            }

            public ConfigurationNotification.Builder getConfigNotificationBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (ConfigurationNotification.Builder) getConfigNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
            public ConfigurationNotificationOrBuilder getConfigNotificationOrBuilder() {
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigurationNotification configurationNotification = this.configNotification_;
                return configurationNotification == null ? ConfigurationNotification.getDefaultInstance() : configurationNotification;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
            public ConfigurationRequest getConfigRequest() {
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationRequest) singleFieldBuilderV3.getMessage();
                }
                ConfigurationRequest configurationRequest = this.configRequest_;
                return configurationRequest == null ? ConfigurationRequest.getDefaultInstance() : configurationRequest;
            }

            public ConfigurationRequest.Builder getConfigRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ConfigurationRequest.Builder) getConfigRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
            public ConfigurationRequestOrBuilder getConfigRequestOrBuilder() {
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigurationRequest configurationRequest = this.configRequest_;
                return configurationRequest == null ? ConfigurationRequest.getDefaultInstance() : configurationRequest;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
            public ConfigurationResponse getConfigResponse() {
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationResponse) singleFieldBuilderV3.getMessage();
                }
                ConfigurationResponse configurationResponse = this.configResponse_;
                return configurationResponse == null ? ConfigurationResponse.getDefaultInstance() : configurationResponse;
            }

            public ConfigurationResponse.Builder getConfigResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ConfigurationResponse.Builder) getConfigResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
            public ConfigurationResponseOrBuilder getConfigResponseOrBuilder() {
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigurationResponse configurationResponse = this.configResponse_;
                return configurationResponse == null ? ConfigurationResponse.getDefaultInstance() : configurationResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
            public PedalIQNotification getPedalIqNotification() {
                SingleFieldBuilderV3<PedalIQNotification, PedalIQNotification.Builder, PedalIQNotificationOrBuilder> singleFieldBuilderV3 = this.pedalIqNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PedalIQNotification) singleFieldBuilderV3.getMessage();
                }
                PedalIQNotification pedalIQNotification = this.pedalIqNotification_;
                return pedalIQNotification == null ? PedalIQNotification.getDefaultInstance() : pedalIQNotification;
            }

            public PedalIQNotification.Builder getPedalIqNotificationBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (PedalIQNotification.Builder) getPedalIqNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
            public PedalIQNotificationOrBuilder getPedalIqNotificationOrBuilder() {
                SingleFieldBuilderV3<PedalIQNotification, PedalIQNotification.Builder, PedalIQNotificationOrBuilder> singleFieldBuilderV3 = this.pedalIqNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PedalIQNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PedalIQNotification pedalIQNotification = this.pedalIqNotification_;
                return pedalIQNotification == null ? PedalIQNotification.getDefaultInstance() : pedalIQNotification;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
            public StatusNotification getStatusNotification() {
                SingleFieldBuilderV3<StatusNotification, StatusNotification.Builder, StatusNotificationOrBuilder> singleFieldBuilderV3 = this.statusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StatusNotification) singleFieldBuilderV3.getMessage();
                }
                StatusNotification statusNotification = this.statusNotification_;
                return statusNotification == null ? StatusNotification.getDefaultInstance() : statusNotification;
            }

            public StatusNotification.Builder getStatusNotificationBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (StatusNotification.Builder) getStatusNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
            public StatusNotificationOrBuilder getStatusNotificationOrBuilder() {
                SingleFieldBuilderV3<StatusNotification, StatusNotification.Builder, StatusNotificationOrBuilder> singleFieldBuilderV3 = this.statusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StatusNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StatusNotification statusNotification = this.statusNotification_;
                return statusNotification == null ? StatusNotification.getDefaultInstance() : statusNotification;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
            public boolean hasCalibrationRequest() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
            public boolean hasCalibrationResponse() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
            public boolean hasConfigNotification() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
            public boolean hasConfigRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
            public boolean hasConfigResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
            public boolean hasPedalIqNotification() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.ServiceOrBuilder
            public boolean hasStatusNotification() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCalibrationRequest(CalibrationRequest calibrationRequest) {
                CalibrationRequest calibrationRequest2;
                SingleFieldBuilderV3<CalibrationRequest, CalibrationRequest.Builder, CalibrationRequestOrBuilder> singleFieldBuilderV3 = this.calibrationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(calibrationRequest);
                } else if ((this.bitField0_ & 8) == 0 || (calibrationRequest2 = this.calibrationRequest_) == null || calibrationRequest2 == CalibrationRequest.getDefaultInstance()) {
                    this.calibrationRequest_ = calibrationRequest;
                } else {
                    getCalibrationRequestBuilder().mergeFrom(calibrationRequest);
                }
                if (this.calibrationRequest_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCalibrationResponse(CalibrationResponse calibrationResponse) {
                CalibrationResponse calibrationResponse2;
                SingleFieldBuilderV3<CalibrationResponse, CalibrationResponse.Builder, CalibrationResponseOrBuilder> singleFieldBuilderV3 = this.calibrationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(calibrationResponse);
                } else if ((this.bitField0_ & 16) == 0 || (calibrationResponse2 = this.calibrationResponse_) == null || calibrationResponse2 == CalibrationResponse.getDefaultInstance()) {
                    this.calibrationResponse_ = calibrationResponse;
                } else {
                    getCalibrationResponseBuilder().mergeFrom(calibrationResponse);
                }
                if (this.calibrationResponse_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConfigNotification(ConfigurationNotification configurationNotification) {
                ConfigurationNotification configurationNotification2;
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configurationNotification);
                } else if ((this.bitField0_ & 4) == 0 || (configurationNotification2 = this.configNotification_) == null || configurationNotification2 == ConfigurationNotification.getDefaultInstance()) {
                    this.configNotification_ = configurationNotification;
                } else {
                    getConfigNotificationBuilder().mergeFrom(configurationNotification);
                }
                if (this.configNotification_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConfigRequest(ConfigurationRequest configurationRequest) {
                ConfigurationRequest configurationRequest2;
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configurationRequest);
                } else if ((this.bitField0_ & 1) == 0 || (configurationRequest2 = this.configRequest_) == null || configurationRequest2 == ConfigurationRequest.getDefaultInstance()) {
                    this.configRequest_ = configurationRequest;
                } else {
                    getConfigRequestBuilder().mergeFrom(configurationRequest);
                }
                if (this.configRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConfigResponse(ConfigurationResponse configurationResponse) {
                ConfigurationResponse configurationResponse2;
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configurationResponse);
                } else if ((this.bitField0_ & 2) == 0 || (configurationResponse2 = this.configResponse_) == null || configurationResponse2 == ConfigurationResponse.getDefaultInstance()) {
                    this.configResponse_ = configurationResponse;
                } else {
                    getConfigResponseBuilder().mergeFrom(configurationResponse);
                }
                if (this.configResponse_ != null) {
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
                                    codedInputStream.readMessage(getConfigRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getConfigResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getConfigNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getCalibrationRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getCalibrationResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(getPedalIqNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(getStatusNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergePedalIqNotification(PedalIQNotification pedalIQNotification) {
                PedalIQNotification pedalIQNotification2;
                SingleFieldBuilderV3<PedalIQNotification, PedalIQNotification.Builder, PedalIQNotificationOrBuilder> singleFieldBuilderV3 = this.pedalIqNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(pedalIQNotification);
                } else if ((this.bitField0_ & 32) == 0 || (pedalIQNotification2 = this.pedalIqNotification_) == null || pedalIQNotification2 == PedalIQNotification.getDefaultInstance()) {
                    this.pedalIqNotification_ = pedalIQNotification;
                } else {
                    getPedalIqNotificationBuilder().mergeFrom(pedalIQNotification);
                }
                if (this.pedalIqNotification_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStatusNotification(StatusNotification statusNotification) {
                StatusNotification statusNotification2;
                SingleFieldBuilderV3<StatusNotification, StatusNotification.Builder, StatusNotificationOrBuilder> singleFieldBuilderV3 = this.statusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(statusNotification);
                } else if ((this.bitField0_ & 64) == 0 || (statusNotification2 = this.statusNotification_) == null || statusNotification2 == StatusNotification.getDefaultInstance()) {
                    this.statusNotification_ = statusNotification;
                } else {
                    getStatusNotificationBuilder().mergeFrom(statusNotification);
                }
                if (this.statusNotification_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setCalibrationRequest(CalibrationRequest.Builder builder) {
                SingleFieldBuilderV3<CalibrationRequest, CalibrationRequest.Builder, CalibrationRequestOrBuilder> singleFieldBuilderV3 = this.calibrationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.calibrationRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setCalibrationResponse(CalibrationResponse.Builder builder) {
                SingleFieldBuilderV3<CalibrationResponse, CalibrationResponse.Builder, CalibrationResponseOrBuilder> singleFieldBuilderV3 = this.calibrationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.calibrationResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setConfigNotification(ConfigurationNotification.Builder builder) {
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConfigRequest(ConfigurationRequest.Builder builder) {
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConfigResponse(ConfigurationResponse.Builder builder) {
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configResponse_ = builder.build();
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

            public Builder setPedalIqNotification(PedalIQNotification.Builder builder) {
                SingleFieldBuilderV3<PedalIQNotification, PedalIQNotification.Builder, PedalIQNotificationOrBuilder> singleFieldBuilderV3 = this.pedalIqNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.pedalIqNotification_ = builder.build();
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

            public Builder setStatusNotification(StatusNotification.Builder builder) {
                SingleFieldBuilderV3<StatusNotification, StatusNotification.Builder, StatusNotificationOrBuilder> singleFieldBuilderV3 = this.statusNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.statusNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
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

            public Builder setCalibrationRequest(CalibrationRequest calibrationRequest) {
                SingleFieldBuilderV3<CalibrationRequest, CalibrationRequest.Builder, CalibrationRequestOrBuilder> singleFieldBuilderV3 = this.calibrationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    calibrationRequest.getClass();
                    this.calibrationRequest_ = calibrationRequest;
                } else {
                    singleFieldBuilderV3.setMessage(calibrationRequest);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setCalibrationResponse(CalibrationResponse calibrationResponse) {
                SingleFieldBuilderV3<CalibrationResponse, CalibrationResponse.Builder, CalibrationResponseOrBuilder> singleFieldBuilderV3 = this.calibrationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    calibrationResponse.getClass();
                    this.calibrationResponse_ = calibrationResponse;
                } else {
                    singleFieldBuilderV3.setMessage(calibrationResponse);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setConfigNotification(ConfigurationNotification configurationNotification) {
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configurationNotification.getClass();
                    this.configNotification_ = configurationNotification;
                } else {
                    singleFieldBuilderV3.setMessage(configurationNotification);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConfigRequest(ConfigurationRequest configurationRequest) {
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configurationRequest.getClass();
                    this.configRequest_ = configurationRequest;
                } else {
                    singleFieldBuilderV3.setMessage(configurationRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConfigResponse(ConfigurationResponse configurationResponse) {
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configurationResponse.getClass();
                    this.configResponse_ = configurationResponse;
                } else {
                    singleFieldBuilderV3.setMessage(configurationResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPedalIqNotification(PedalIQNotification pedalIQNotification) {
                SingleFieldBuilderV3<PedalIQNotification, PedalIQNotification.Builder, PedalIQNotificationOrBuilder> singleFieldBuilderV3 = this.pedalIqNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    pedalIQNotification.getClass();
                    this.pedalIqNotification_ = pedalIQNotification;
                } else {
                    singleFieldBuilderV3.setMessage(pedalIQNotification);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setStatusNotification(StatusNotification statusNotification) {
                SingleFieldBuilderV3<StatusNotification, StatusNotification.Builder, StatusNotificationOrBuilder> singleFieldBuilderV3 = this.statusNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    statusNotification.getClass();
                    this.statusNotification_ = statusNotification;
                } else {
                    singleFieldBuilderV3.setMessage(statusNotification);
                }
                this.bitField0_ |= 64;
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
                if (service.hasConfigRequest()) {
                    mergeConfigRequest(service.getConfigRequest());
                }
                if (service.hasConfigResponse()) {
                    mergeConfigResponse(service.getConfigResponse());
                }
                if (service.hasConfigNotification()) {
                    mergeConfigNotification(service.getConfigNotification());
                }
                if (service.hasCalibrationRequest()) {
                    mergeCalibrationRequest(service.getCalibrationRequest());
                }
                if (service.hasCalibrationResponse()) {
                    mergeCalibrationResponse(service.getCalibrationResponse());
                }
                if (service.hasPedalIqNotification()) {
                    mergePedalIqNotification(service.getPedalIqNotification());
                }
                if (service.hasStatusNotification()) {
                    mergeStatusNotification(service.getStatusNotification());
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

    public static final class StatusNotification extends GeneratedMessageV3 implements StatusNotificationOrBuilder {
        public static final int P2P_CONNECTED_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int p2PConnected_;
        private static final StatusNotification DEFAULT_INSTANCE = new StatusNotification();

        @Deprecated
        public static final Parser<StatusNotification> PARSER = new AbstractParser<StatusNotification>() { // from class: com.garmin.proto.generated.GDIBikePower.StatusNotification.1
            @Override // com.google.protobuf.Parser
            public StatusNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StatusNotification.newBuilder();
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

        private StatusNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.p2PConnected_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StatusNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_StatusNotification_descriptor;
        }

        public static Builder newBuilder(StatusNotification statusNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(statusNotification);
        }

        public static StatusNotification parseDelimitedFrom(InputStream inputStream) {
            return (StatusNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StatusNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StatusNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StatusNotification)) {
                return super.equals(obj);
            }
            StatusNotification statusNotification = (StatusNotification) obj;
            if (hasP2PConnected() != statusNotification.hasP2PConnected()) {
                return false;
            }
            return (!hasP2PConnected() || this.p2PConnected_ == statusNotification.p2PConnected_) && getUnknownFields().equals(statusNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIBikePower.StatusNotificationOrBuilder
        public P2PConnectionStatus getP2PConnected() {
            P2PConnectionStatus p2PConnectionStatusForNumber = P2PConnectionStatus.forNumber(this.p2PConnected_);
            return p2PConnectionStatusForNumber == null ? P2PConnectionStatus.NOT_CONNECTED : p2PConnectionStatusForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StatusNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.p2PConnected_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikePower.StatusNotificationOrBuilder
        public boolean hasP2PConnected() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasP2PConnected()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.p2PConnected_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikePower.internal_static_GDI_Proto_BikePower_StatusNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(StatusNotification.class, Builder.class);
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
            return new StatusNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.p2PConnected_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StatusNotificationOrBuilder {
            private int bitField0_;
            private int p2PConnected_;

            private Builder() {
                this.p2PConnected_ = 0;
            }

            private void buildPartial0(StatusNotification statusNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    statusNotification.p2PConnected_ = this.p2PConnected_;
                } else {
                    i14 = 0;
                }
                statusNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_StatusNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StatusNotification build() {
                StatusNotification statusNotificationBuildPartial = buildPartial();
                if (statusNotificationBuildPartial.isInitialized()) {
                    return statusNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) statusNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StatusNotification buildPartial() {
                StatusNotification statusNotification = new StatusNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(statusNotification);
                }
                onBuilt();
                return statusNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.p2PConnected_ = 0;
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

            public Builder clearP2PConnected() {
                this.bitField0_ &= -2;
                this.p2PConnected_ = 0;
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
                return GDIBikePower.internal_static_GDI_Proto_BikePower_StatusNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.StatusNotificationOrBuilder
            public P2PConnectionStatus getP2PConnected() {
                P2PConnectionStatus p2PConnectionStatusForNumber = P2PConnectionStatus.forNumber(this.p2PConnected_);
                return p2PConnectionStatusForNumber == null ? P2PConnectionStatus.NOT_CONNECTED : p2PConnectionStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIBikePower.StatusNotificationOrBuilder
            public boolean hasP2PConnected() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikePower.internal_static_GDI_Proto_BikePower_StatusNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(StatusNotification.class, Builder.class);
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
                                    if (P2PConnectionStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.p2PConnected_ = i14;
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

            public Builder setP2PConnected(P2PConnectionStatus p2PConnectionStatus) {
                p2PConnectionStatus.getClass();
                this.bitField0_ |= 1;
                this.p2PConnected_ = p2PConnectionStatus.getNumber();
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
            public StatusNotification getDefaultInstanceForType() {
                return StatusNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.p2PConnected_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StatusNotification) {
                    return mergeFrom((StatusNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StatusNotification statusNotification) {
                if (statusNotification == StatusNotification.getDefaultInstance()) {
                    return this;
                }
                if (statusNotification.hasP2PConnected()) {
                    setP2PConnected(statusNotification.getP2PConnected());
                }
                mergeUnknownFields(statusNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StatusNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StatusNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StatusNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StatusNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ StatusNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StatusNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private StatusNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.p2PConnected_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StatusNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StatusNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StatusNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StatusNotification parseFrom(InputStream inputStream) {
            return (StatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StatusNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StatusNotification parseFrom(CodedInputStream codedInputStream) {
            return (StatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StatusNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum P2PConnectionStatus implements ProtocolMessageEnum {
            NOT_CONNECTED(0),
            CONNECTED(1);

            public static final int CONNECTED_VALUE = 1;
            public static final int NOT_CONNECTED_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<P2PConnectionStatus> internalValueMap = new Internal.EnumLiteMap<P2PConnectionStatus>() { // from class: com.garmin.proto.generated.GDIBikePower.StatusNotification.P2PConnectionStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public P2PConnectionStatus findValueByNumber(int i14) {
                    return P2PConnectionStatus.forNumber(i14);
                }
            };
            private static final P2PConnectionStatus[] VALUES = values();

            P2PConnectionStatus(int i14) {
                this.value = i14;
            }

            public static P2PConnectionStatus forNumber(int i14) {
                if (i14 == 0) {
                    return NOT_CONNECTED;
                }
                if (i14 != 1) {
                    return null;
                }
                return CONNECTED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return StatusNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<P2PConnectionStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static P2PConnectionStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static P2PConnectionStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
