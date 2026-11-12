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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class GDIRunning {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0010GDIRunning.proto\u0012\u0011GDI.Proto.Running\u001a\rGDICore.proto\u001a\u0015GDIEventSharing.proto\"µ\u0003\n\u0007Service\u0012F\n\u0015configuration_request\u0018\u0001 \u0001(\u000b2'.GDI.Proto.Running.ConfigurationRequest\u0012H\n\u0016configuration_response\u0018\u0002 \u0001(\u000b2(.GDI.Proto.Running.ConfigurationResponse\u0012P\n\u001aconfiguration_notification\u0018\u0003 \u0001(\u000b2,.GDI.Proto.Running.ConfigurationNotification\u0012a\n\u0019reset_calibration_request\u0018\u0004 \u0001(\u000b2>.GDI.Proto.Running.ResetSpeedDistanceCalibrationMetricsRequest\u0012c\n\u001areset_calibration_response\u0018\u0005 \u0001(\u000b2?.GDI.Proto.Running.ResetSpeedDistanceCalibrationMetricsResponse\"\u0083\u0001\n\u0013CapabilitiesRequest2l\n\u0010features_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018\u0019 \u0001(\u000b2&.GDI.Proto.Running.CapabilitiesRequest\"B\n\u0019SpeedDistanceCapabilities\u0012%\n\u001dis_auto_calibration_supported\u0018\u0001 \u0001(\b\"<\n\u0014DynamicsCapabilities\u0012$\n\u001cis_step_speed_loss_supported\u0018\u0001 \u0001(\b\"¢\u0002\n\u0014CapabilitiesResponse\u0012Q\n\u001bspeed_distance_capabilities\u0018\u0001 \u0001(\u000b2,.GDI.Proto.Running.SpeedDistanceCapabilities\u0012F\n\u0015dynamics_capabilities\u0018\u0002 \u0001(\u000b2'.GDI.Proto.Running.DynamicsCapabilities2o\n\u0011features_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018\u0019 \u0001(\u000b2'.GDI.Proto.Running.CapabilitiesResponse\"\u008f\u0001\n SpeedDistanceConfigurationFields\u0012.\n&treadmill_calibration_factor_1_100_pct\u0018\u0001 \u0001(\r\u0012#\n\u001bis_auto_calibration_enabled\u0018\u0002 \u0001(\b\u0012\u0016\n\u000euser_height_cm\u0018\u0003 \u0001(\r\"j\n\u0014ConfigurationRequest\u0012R\n\u0015speed_distance_config\u0018\u0001 \u0001(\u000b23.GDI.Proto.Running.SpeedDistanceConfigurationFields\"k\n\u0015ConfigurationResponse\u0012R\n\u0015speed_distance_config\u0018\u0001 \u0001(\u000b23.GDI.Proto.Running.SpeedDistanceConfigurationFields\"o\n\u0019ConfigurationNotification\u0012R\n\u0015speed_distance_config\u0018\u0001 \u0001(\u000b23.GDI.Proto.Running.SpeedDistanceConfigurationFields\"-\n+ResetSpeedDistanceCalibrationMetricsRequest\".\n,ResetSpeedDistanceCalibrationMetricsResponse\"\u0095\u0003\n\bDynamics\u0012&\n\u001evertical_oscillation_1_4ths_mm\u0018\u0001 \u0001(\r\u0012\u001e\n\u0016ground_contact_time_ms\u0018\u0002 \u0001(\r\u0012\"\n\u001astance_time_1_4ths_percent\u0018\u0003 \u0001(\r\u0012.\n&ground_contact_balance_1_32ths_percent\u0018\u0004 \u0001(\r\u0012&\n\u001evertical_ratio_1_32ths_percent\u0018\u0005 \u0001(\r\u0012\u0016\n\u000estep_length_mm\u0018\u0006 \u0001(\r\u0012\u001f\n\u0017is_module_right_side_up\u0018\u0007 \u0001(\b\u0012$\n\u001ccadence_1_32_strides_per_min\u0018\b \u0001(\r\u0012\u0012\n\nstep_count\u0018\t \u0001(\r\u0012\u0012\n\nis_walking\u0018\n \u0001(\b\u0012>\n\u0014step_speed_loss_data\u0018\u000b \u0001(\u000b2 .GDI.Proto.Running.StepSpeedLoss\"æ\u0001\n\rStepSpeedLoss\u0012-\n%step_forward_velocity_trough_mm_per_s\u0018\u0001 \u0001(\u0011\u0012+\n#step_forward_velocity_peak_mm_per_s\u0018\u0002 \u0001(\u0011\u0012+\n#step_forward_velocity_mean_mm_per_s\u0018\u0003 \u0001(\u0011\u00121\n)step_vertical_velocity_at_trough_mm_per_s\u0018\u0004 \u0001(\u0011\u0012\u0019\n\u0011time_to_trough_ms\u0018\u0005 \u0001(\r\"E\n\rSpeedDistance\u0012\u001b\n\u0013speed_1_256_m_per_s\u0018\u0001 \u0001(\r\u0012\u0017\n\u000fdistance_1_16_m\u0018\u0002 \u0001(\r\"ò\u0001\n\u0017MeasurementNotification\u00122\n\rdynamics_data\u0018\u0001 \u0001(\u000b2\u001b.GDI.Proto.Running.Dynamics\u0012=\n\u0013speed_distance_data\u0018\u0002 \u0001(\u000b2 .GDI.Proto.Running.SpeedDistance2d\n\u0004data\u0012).GDI.Proto.EventSharing.AlertNotification\u0018ö\u0007 \u0001(\u000b2*.GDI.Proto.Running.MeasurementNotification\"U\n\u001cSpeedDistanceAlgorithmInputs\u0012\u0017\n\u000fgrade_1_100_pct\u0018\u0001 \u0001(\u0011\u0012\u001c\n\u0014gps_speed_1_mm_per_s\u0018\u0002 \u0001(\r\"\u0085\u0002\n\u001aAlgorithmInputNotification\u0012$\n\u001chorizontal_speed_1_256ths_ms\u0018\u0001 \u0001(\r\u0012X\n\u001fspeed_distance_algorithm_inputs\u0018\u0002 \u0001(\u000b2/.GDI.Proto.Running.SpeedDistanceAlgorithmInputs2g\n\u0004data\u0012).GDI.Proto.EventSharing.AlertNotification\u0018ø\u0007 \u0001(\u000b2-.GDI.Proto.Running.AlgorithmInputNotificationB*\n\u001acom.garmin.proto.generatedB\nGDIRunningH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor(), GDIEventSharingProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Running_AlgorithmInputNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Running_AlgorithmInputNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Running_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Running_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Running_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Running_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Running_ConfigurationNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Running_ConfigurationNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Running_ConfigurationRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Running_ConfigurationRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Running_ConfigurationResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Running_ConfigurationResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Running_DynamicsCapabilities_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Running_DynamicsCapabilities_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Running_Dynamics_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Running_Dynamics_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Running_MeasurementNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Running_MeasurementNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Running_ResetSpeedDistanceCalibrationMetricsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Running_ResetSpeedDistanceCalibrationMetricsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Running_ResetSpeedDistanceCalibrationMetricsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Running_ResetSpeedDistanceCalibrationMetricsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Running_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Running_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Running_SpeedDistanceAlgorithmInputs_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Running_SpeedDistanceAlgorithmInputs_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Running_SpeedDistanceCapabilities_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Running_SpeedDistanceCapabilities_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Running_SpeedDistanceConfigurationFields_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Running_SpeedDistanceConfigurationFields_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Running_SpeedDistance_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Running_SpeedDistance_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Running_StepSpeedLoss_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Running_StepSpeedLoss_fieldAccessorTable;

    public interface AlgorithmInputNotificationOrBuilder extends MessageOrBuilder {
        int getHorizontalSpeed1256ThsMs();

        SpeedDistanceAlgorithmInputs getSpeedDistanceAlgorithmInputs();

        SpeedDistanceAlgorithmInputsOrBuilder getSpeedDistanceAlgorithmInputsOrBuilder();

        boolean hasHorizontalSpeed1256ThsMs();

        boolean hasSpeedDistanceAlgorithmInputs();
    }

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        DynamicsCapabilities getDynamicsCapabilities();

        DynamicsCapabilitiesOrBuilder getDynamicsCapabilitiesOrBuilder();

        SpeedDistanceCapabilities getSpeedDistanceCapabilities();

        SpeedDistanceCapabilitiesOrBuilder getSpeedDistanceCapabilitiesOrBuilder();

        boolean hasDynamicsCapabilities();

        boolean hasSpeedDistanceCapabilities();
    }

    public interface ConfigurationNotificationOrBuilder extends MessageOrBuilder {
        SpeedDistanceConfigurationFields getSpeedDistanceConfig();

        SpeedDistanceConfigurationFieldsOrBuilder getSpeedDistanceConfigOrBuilder();

        boolean hasSpeedDistanceConfig();
    }

    public interface ConfigurationRequestOrBuilder extends MessageOrBuilder {
        SpeedDistanceConfigurationFields getSpeedDistanceConfig();

        SpeedDistanceConfigurationFieldsOrBuilder getSpeedDistanceConfigOrBuilder();

        boolean hasSpeedDistanceConfig();
    }

    public interface ConfigurationResponseOrBuilder extends MessageOrBuilder {
        SpeedDistanceConfigurationFields getSpeedDistanceConfig();

        SpeedDistanceConfigurationFieldsOrBuilder getSpeedDistanceConfigOrBuilder();

        boolean hasSpeedDistanceConfig();
    }

    public interface DynamicsCapabilitiesOrBuilder extends MessageOrBuilder {
        boolean getIsStepSpeedLossSupported();

        boolean hasIsStepSpeedLossSupported();
    }

    public interface DynamicsOrBuilder extends MessageOrBuilder {
        int getCadence132StridesPerMin();

        int getGroundContactBalance132ThsPercent();

        int getGroundContactTimeMs();

        boolean getIsModuleRightSideUp();

        boolean getIsWalking();

        int getStanceTime14ThsPercent();

        int getStepCount();

        int getStepLengthMm();

        StepSpeedLoss getStepSpeedLossData();

        StepSpeedLossOrBuilder getStepSpeedLossDataOrBuilder();

        int getVerticalOscillation14ThsMm();

        int getVerticalRatio132ThsPercent();

        boolean hasCadence132StridesPerMin();

        boolean hasGroundContactBalance132ThsPercent();

        boolean hasGroundContactTimeMs();

        boolean hasIsModuleRightSideUp();

        boolean hasIsWalking();

        boolean hasStanceTime14ThsPercent();

        boolean hasStepCount();

        boolean hasStepLengthMm();

        boolean hasStepSpeedLossData();

        boolean hasVerticalOscillation14ThsMm();

        boolean hasVerticalRatio132ThsPercent();
    }

    public interface MeasurementNotificationOrBuilder extends MessageOrBuilder {
        Dynamics getDynamicsData();

        DynamicsOrBuilder getDynamicsDataOrBuilder();

        SpeedDistance getSpeedDistanceData();

        SpeedDistanceOrBuilder getSpeedDistanceDataOrBuilder();

        boolean hasDynamicsData();

        boolean hasSpeedDistanceData();
    }

    public interface ResetSpeedDistanceCalibrationMetricsRequestOrBuilder extends MessageOrBuilder {
    }

    public interface ResetSpeedDistanceCalibrationMetricsResponseOrBuilder extends MessageOrBuilder {
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        ConfigurationNotification getConfigurationNotification();

        ConfigurationNotificationOrBuilder getConfigurationNotificationOrBuilder();

        ConfigurationRequest getConfigurationRequest();

        ConfigurationRequestOrBuilder getConfigurationRequestOrBuilder();

        ConfigurationResponse getConfigurationResponse();

        ConfigurationResponseOrBuilder getConfigurationResponseOrBuilder();

        ResetSpeedDistanceCalibrationMetricsRequest getResetCalibrationRequest();

        ResetSpeedDistanceCalibrationMetricsRequestOrBuilder getResetCalibrationRequestOrBuilder();

        ResetSpeedDistanceCalibrationMetricsResponse getResetCalibrationResponse();

        ResetSpeedDistanceCalibrationMetricsResponseOrBuilder getResetCalibrationResponseOrBuilder();

        boolean hasConfigurationNotification();

        boolean hasConfigurationRequest();

        boolean hasConfigurationResponse();

        boolean hasResetCalibrationRequest();

        boolean hasResetCalibrationResponse();
    }

    public interface SpeedDistanceAlgorithmInputsOrBuilder extends MessageOrBuilder {
        int getGpsSpeed1MmPerS();

        int getGrade1100Pct();

        boolean hasGpsSpeed1MmPerS();

        boolean hasGrade1100Pct();
    }

    public interface SpeedDistanceCapabilitiesOrBuilder extends MessageOrBuilder {
        boolean getIsAutoCalibrationSupported();

        boolean hasIsAutoCalibrationSupported();
    }

    public interface SpeedDistanceConfigurationFieldsOrBuilder extends MessageOrBuilder {
        boolean getIsAutoCalibrationEnabled();

        int getTreadmillCalibrationFactor1100Pct();

        int getUserHeightCm();

        boolean hasIsAutoCalibrationEnabled();

        boolean hasTreadmillCalibrationFactor1100Pct();

        boolean hasUserHeightCm();
    }

    public interface SpeedDistanceOrBuilder extends MessageOrBuilder {
        int getDistance116M();

        int getSpeed1256MPerS();

        boolean hasDistance116M();

        boolean hasSpeed1256MPerS();
    }

    public interface StepSpeedLossOrBuilder extends MessageOrBuilder {
        int getStepForwardVelocityMeanMmPerS();

        int getStepForwardVelocityPeakMmPerS();

        int getStepForwardVelocityTroughMmPerS();

        int getStepVerticalVelocityAtTroughMmPerS();

        int getTimeToTroughMs();

        boolean hasStepForwardVelocityMeanMmPerS();

        boolean hasStepForwardVelocityPeakMmPerS();

        boolean hasStepForwardVelocityTroughMmPerS();

        boolean hasStepVerticalVelocityAtTroughMmPerS();

        boolean hasTimeToTroughMs();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_Running_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_Running_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ConfigurationRequest", "ConfigurationResponse", "ConfigurationNotification", "ResetCalibrationRequest", "ResetCalibrationResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_Running_CapabilitiesRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_Running_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_Running_SpeedDistanceCapabilities_descriptor = descriptor4;
        internal_static_GDI_Proto_Running_SpeedDistanceCapabilities_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"IsAutoCalibrationSupported"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_Running_DynamicsCapabilities_descriptor = descriptor5;
        internal_static_GDI_Proto_Running_DynamicsCapabilities_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"IsStepSpeedLossSupported"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_Running_CapabilitiesResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_Running_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"SpeedDistanceCapabilities", "DynamicsCapabilities"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_Running_SpeedDistanceConfigurationFields_descriptor = descriptor7;
        internal_static_GDI_Proto_Running_SpeedDistanceConfigurationFields_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"TreadmillCalibrationFactor1100Pct", "IsAutoCalibrationEnabled", "UserHeightCm"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_Running_ConfigurationRequest_descriptor = descriptor8;
        internal_static_GDI_Proto_Running_ConfigurationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"SpeedDistanceConfig"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_Running_ConfigurationResponse_descriptor = descriptor9;
        internal_static_GDI_Proto_Running_ConfigurationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"SpeedDistanceConfig"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_Running_ConfigurationNotification_descriptor = descriptor10;
        internal_static_GDI_Proto_Running_ConfigurationNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"SpeedDistanceConfig"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_Running_ResetSpeedDistanceCalibrationMetricsRequest_descriptor = descriptor11;
        internal_static_GDI_Proto_Running_ResetSpeedDistanceCalibrationMetricsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[0]);
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_Running_ResetSpeedDistanceCalibrationMetricsResponse_descriptor = descriptor12;
        internal_static_GDI_Proto_Running_ResetSpeedDistanceCalibrationMetricsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[0]);
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_Running_Dynamics_descriptor = descriptor13;
        internal_static_GDI_Proto_Running_Dynamics_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"VerticalOscillation14ThsMm", "GroundContactTimeMs", "StanceTime14ThsPercent", "GroundContactBalance132ThsPercent", "VerticalRatio132ThsPercent", "StepLengthMm", "IsModuleRightSideUp", "Cadence132StridesPerMin", "StepCount", "IsWalking", "StepSpeedLossData"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_GDI_Proto_Running_StepSpeedLoss_descriptor = descriptor14;
        internal_static_GDI_Proto_Running_StepSpeedLoss_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"StepForwardVelocityTroughMmPerS", "StepForwardVelocityPeakMmPerS", "StepForwardVelocityMeanMmPerS", "StepVerticalVelocityAtTroughMmPerS", "TimeToTroughMs"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(13);
        internal_static_GDI_Proto_Running_SpeedDistance_descriptor = descriptor15;
        internal_static_GDI_Proto_Running_SpeedDistance_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Speed1256MPerS", "Distance116M"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(14);
        internal_static_GDI_Proto_Running_MeasurementNotification_descriptor = descriptor16;
        internal_static_GDI_Proto_Running_MeasurementNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"DynamicsData", "SpeedDistanceData"});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(15);
        internal_static_GDI_Proto_Running_SpeedDistanceAlgorithmInputs_descriptor = descriptor17;
        internal_static_GDI_Proto_Running_SpeedDistanceAlgorithmInputs_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"Grade1100Pct", "GpsSpeed1MmPerS"});
        Descriptors.Descriptor descriptor18 = getDescriptor().getMessageTypes().get(16);
        internal_static_GDI_Proto_Running_AlgorithmInputNotification_descriptor = descriptor18;
        internal_static_GDI_Proto_Running_AlgorithmInputNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"HorizontalSpeed1256ThsMs", "SpeedDistanceAlgorithmInputs"});
        GDICore.getDescriptor();
        GDIEventSharingProto.getDescriptor();
    }

    private GDIRunning() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.featuresRequest);
        extensionRegistryLite.add(CapabilitiesResponse.featuresResponse);
        extensionRegistryLite.add(MeasurementNotification.data);
        extensionRegistryLite.add(AlgorithmInputNotification.data);
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int FEATURES_REQUEST_FIELD_NUMBER = 25;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIRunning.CapabilitiesRequest.1
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
            return GDIRunning.internal_static_GDI_Proto_Running_CapabilitiesRequest_descriptor;
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
            return GDIRunning.internal_static_GDI_Proto_Running_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                return GDIRunning.internal_static_GDI_Proto_Running_CapabilitiesRequest_descriptor;
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
                return GDIRunning.internal_static_GDI_Proto_Running_CapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRunning.internal_static_GDI_Proto_Running_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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

    public static final class DynamicsCapabilities extends GeneratedMessageV3 implements DynamicsCapabilitiesOrBuilder {
        public static final int IS_STEP_SPEED_LOSS_SUPPORTED_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean isStepSpeedLossSupported_;
        private byte memoizedIsInitialized;
        private static final DynamicsCapabilities DEFAULT_INSTANCE = new DynamicsCapabilities();

        @Deprecated
        public static final Parser<DynamicsCapabilities> PARSER = new AbstractParser<DynamicsCapabilities>() { // from class: com.garmin.proto.generated.GDIRunning.DynamicsCapabilities.1
            @Override // com.google.protobuf.Parser
            public DynamicsCapabilities parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DynamicsCapabilities.newBuilder();
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

        private DynamicsCapabilities(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.isStepSpeedLossSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DynamicsCapabilities getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRunning.internal_static_GDI_Proto_Running_DynamicsCapabilities_descriptor;
        }

        public static Builder newBuilder(DynamicsCapabilities dynamicsCapabilities) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dynamicsCapabilities);
        }

        public static DynamicsCapabilities parseDelimitedFrom(InputStream inputStream) {
            return (DynamicsCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DynamicsCapabilities parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DynamicsCapabilities> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DynamicsCapabilities)) {
                return super.equals(obj);
            }
            DynamicsCapabilities dynamicsCapabilities = (DynamicsCapabilities) obj;
            if (hasIsStepSpeedLossSupported() != dynamicsCapabilities.hasIsStepSpeedLossSupported()) {
                return false;
            }
            return (!hasIsStepSpeedLossSupported() || getIsStepSpeedLossSupported() == dynamicsCapabilities.getIsStepSpeedLossSupported()) && getUnknownFields().equals(dynamicsCapabilities.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsCapabilitiesOrBuilder
        public boolean getIsStepSpeedLossSupported() {
            return this.isStepSpeedLossSupported_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DynamicsCapabilities> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.isStepSpeedLossSupported_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsCapabilitiesOrBuilder
        public boolean hasIsStepSpeedLossSupported() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasIsStepSpeedLossSupported()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getIsStepSpeedLossSupported());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRunning.internal_static_GDI_Proto_Running_DynamicsCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(DynamicsCapabilities.class, Builder.class);
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
            return new DynamicsCapabilities();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.isStepSpeedLossSupported_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DynamicsCapabilitiesOrBuilder {
            private int bitField0_;
            private boolean isStepSpeedLossSupported_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(DynamicsCapabilities dynamicsCapabilities) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    dynamicsCapabilities.isStepSpeedLossSupported_ = this.isStepSpeedLossSupported_;
                } else {
                    i14 = 0;
                }
                dynamicsCapabilities.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRunning.internal_static_GDI_Proto_Running_DynamicsCapabilities_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DynamicsCapabilities build() {
                DynamicsCapabilities dynamicsCapabilitiesBuildPartial = buildPartial();
                if (dynamicsCapabilitiesBuildPartial.isInitialized()) {
                    return dynamicsCapabilitiesBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dynamicsCapabilitiesBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DynamicsCapabilities buildPartial() {
                DynamicsCapabilities dynamicsCapabilities = new DynamicsCapabilities(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dynamicsCapabilities);
                }
                onBuilt();
                return dynamicsCapabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.isStepSpeedLossSupported_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIsStepSpeedLossSupported() {
                this.bitField0_ &= -2;
                this.isStepSpeedLossSupported_ = false;
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
                return GDIRunning.internal_static_GDI_Proto_Running_DynamicsCapabilities_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsCapabilitiesOrBuilder
            public boolean getIsStepSpeedLossSupported() {
                return this.isStepSpeedLossSupported_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsCapabilitiesOrBuilder
            public boolean hasIsStepSpeedLossSupported() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRunning.internal_static_GDI_Proto_Running_DynamicsCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(DynamicsCapabilities.class, Builder.class);
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
                                    this.isStepSpeedLossSupported_ = codedInputStream.readBool();
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

            public Builder setIsStepSpeedLossSupported(boolean z14) {
                this.isStepSpeedLossSupported_ = z14;
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
            public DynamicsCapabilities getDefaultInstanceForType() {
                return DynamicsCapabilities.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DynamicsCapabilities) {
                    return mergeFrom((DynamicsCapabilities) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DynamicsCapabilities dynamicsCapabilities) {
                if (dynamicsCapabilities == DynamicsCapabilities.getDefaultInstance()) {
                    return this;
                }
                if (dynamicsCapabilities.hasIsStepSpeedLossSupported()) {
                    setIsStepSpeedLossSupported(dynamicsCapabilities.getIsStepSpeedLossSupported());
                }
                mergeUnknownFields(dynamicsCapabilities.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DynamicsCapabilities getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DynamicsCapabilities parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DynamicsCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DynamicsCapabilities parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DynamicsCapabilities(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DynamicsCapabilities parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DynamicsCapabilities() {
            this.isStepSpeedLossSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DynamicsCapabilities parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DynamicsCapabilities parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DynamicsCapabilities parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DynamicsCapabilities parseFrom(InputStream inputStream) {
            return (DynamicsCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DynamicsCapabilities parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DynamicsCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DynamicsCapabilities parseFrom(CodedInputStream codedInputStream) {
            return (DynamicsCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DynamicsCapabilities parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DynamicsCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ResetSpeedDistanceCalibrationMetricsRequest extends GeneratedMessageV3 implements ResetSpeedDistanceCalibrationMetricsRequestOrBuilder {
        private static final ResetSpeedDistanceCalibrationMetricsRequest DEFAULT_INSTANCE = new ResetSpeedDistanceCalibrationMetricsRequest();

        @Deprecated
        public static final Parser<ResetSpeedDistanceCalibrationMetricsRequest> PARSER = new AbstractParser<ResetSpeedDistanceCalibrationMetricsRequest>() { // from class: com.garmin.proto.generated.GDIRunning.ResetSpeedDistanceCalibrationMetricsRequest.1
            @Override // com.google.protobuf.Parser
            public ResetSpeedDistanceCalibrationMetricsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ResetSpeedDistanceCalibrationMetricsRequest.newBuilder();
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

        private ResetSpeedDistanceCalibrationMetricsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ResetSpeedDistanceCalibrationMetricsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRunning.internal_static_GDI_Proto_Running_ResetSpeedDistanceCalibrationMetricsRequest_descriptor;
        }

        public static Builder newBuilder(ResetSpeedDistanceCalibrationMetricsRequest resetSpeedDistanceCalibrationMetricsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(resetSpeedDistanceCalibrationMetricsRequest);
        }

        public static ResetSpeedDistanceCalibrationMetricsRequest parseDelimitedFrom(InputStream inputStream) {
            return (ResetSpeedDistanceCalibrationMetricsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ResetSpeedDistanceCalibrationMetricsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ResetSpeedDistanceCalibrationMetricsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof ResetSpeedDistanceCalibrationMetricsRequest) {
                return getUnknownFields().equals(((ResetSpeedDistanceCalibrationMetricsRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ResetSpeedDistanceCalibrationMetricsRequest> getParserForType() {
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
            return GDIRunning.internal_static_GDI_Proto_Running_ResetSpeedDistanceCalibrationMetricsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ResetSpeedDistanceCalibrationMetricsRequest.class, Builder.class);
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
            return new ResetSpeedDistanceCalibrationMetricsRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ResetSpeedDistanceCalibrationMetricsRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRunning.internal_static_GDI_Proto_Running_ResetSpeedDistanceCalibrationMetricsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ResetSpeedDistanceCalibrationMetricsRequest build() {
                ResetSpeedDistanceCalibrationMetricsRequest resetSpeedDistanceCalibrationMetricsRequestBuildPartial = buildPartial();
                if (resetSpeedDistanceCalibrationMetricsRequestBuildPartial.isInitialized()) {
                    return resetSpeedDistanceCalibrationMetricsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) resetSpeedDistanceCalibrationMetricsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ResetSpeedDistanceCalibrationMetricsRequest buildPartial() {
                ResetSpeedDistanceCalibrationMetricsRequest resetSpeedDistanceCalibrationMetricsRequest = new ResetSpeedDistanceCalibrationMetricsRequest(this);
                onBuilt();
                return resetSpeedDistanceCalibrationMetricsRequest;
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
                return GDIRunning.internal_static_GDI_Proto_Running_ResetSpeedDistanceCalibrationMetricsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRunning.internal_static_GDI_Proto_Running_ResetSpeedDistanceCalibrationMetricsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ResetSpeedDistanceCalibrationMetricsRequest.class, Builder.class);
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
            public ResetSpeedDistanceCalibrationMetricsRequest getDefaultInstanceForType() {
                return ResetSpeedDistanceCalibrationMetricsRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ResetSpeedDistanceCalibrationMetricsRequest) {
                    return mergeFrom((ResetSpeedDistanceCalibrationMetricsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ResetSpeedDistanceCalibrationMetricsRequest resetSpeedDistanceCalibrationMetricsRequest) {
                if (resetSpeedDistanceCalibrationMetricsRequest == ResetSpeedDistanceCalibrationMetricsRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(resetSpeedDistanceCalibrationMetricsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ResetSpeedDistanceCalibrationMetricsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ResetSpeedDistanceCalibrationMetricsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ResetSpeedDistanceCalibrationMetricsRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ResetSpeedDistanceCalibrationMetricsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetSpeedDistanceCalibrationMetricsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ResetSpeedDistanceCalibrationMetricsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ResetSpeedDistanceCalibrationMetricsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ResetSpeedDistanceCalibrationMetricsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ResetSpeedDistanceCalibrationMetricsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ResetSpeedDistanceCalibrationMetricsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ResetSpeedDistanceCalibrationMetricsRequest parseFrom(InputStream inputStream) {
            return (ResetSpeedDistanceCalibrationMetricsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ResetSpeedDistanceCalibrationMetricsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetSpeedDistanceCalibrationMetricsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ResetSpeedDistanceCalibrationMetricsRequest parseFrom(CodedInputStream codedInputStream) {
            return (ResetSpeedDistanceCalibrationMetricsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ResetSpeedDistanceCalibrationMetricsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetSpeedDistanceCalibrationMetricsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ResetSpeedDistanceCalibrationMetricsResponse extends GeneratedMessageV3 implements ResetSpeedDistanceCalibrationMetricsResponseOrBuilder {
        private static final ResetSpeedDistanceCalibrationMetricsResponse DEFAULT_INSTANCE = new ResetSpeedDistanceCalibrationMetricsResponse();

        @Deprecated
        public static final Parser<ResetSpeedDistanceCalibrationMetricsResponse> PARSER = new AbstractParser<ResetSpeedDistanceCalibrationMetricsResponse>() { // from class: com.garmin.proto.generated.GDIRunning.ResetSpeedDistanceCalibrationMetricsResponse.1
            @Override // com.google.protobuf.Parser
            public ResetSpeedDistanceCalibrationMetricsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ResetSpeedDistanceCalibrationMetricsResponse.newBuilder();
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

        private ResetSpeedDistanceCalibrationMetricsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ResetSpeedDistanceCalibrationMetricsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRunning.internal_static_GDI_Proto_Running_ResetSpeedDistanceCalibrationMetricsResponse_descriptor;
        }

        public static Builder newBuilder(ResetSpeedDistanceCalibrationMetricsResponse resetSpeedDistanceCalibrationMetricsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(resetSpeedDistanceCalibrationMetricsResponse);
        }

        public static ResetSpeedDistanceCalibrationMetricsResponse parseDelimitedFrom(InputStream inputStream) {
            return (ResetSpeedDistanceCalibrationMetricsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ResetSpeedDistanceCalibrationMetricsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ResetSpeedDistanceCalibrationMetricsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof ResetSpeedDistanceCalibrationMetricsResponse) {
                return getUnknownFields().equals(((ResetSpeedDistanceCalibrationMetricsResponse) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ResetSpeedDistanceCalibrationMetricsResponse> getParserForType() {
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
            return GDIRunning.internal_static_GDI_Proto_Running_ResetSpeedDistanceCalibrationMetricsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ResetSpeedDistanceCalibrationMetricsResponse.class, Builder.class);
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
            return new ResetSpeedDistanceCalibrationMetricsResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ResetSpeedDistanceCalibrationMetricsResponseOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRunning.internal_static_GDI_Proto_Running_ResetSpeedDistanceCalibrationMetricsResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ResetSpeedDistanceCalibrationMetricsResponse build() {
                ResetSpeedDistanceCalibrationMetricsResponse resetSpeedDistanceCalibrationMetricsResponseBuildPartial = buildPartial();
                if (resetSpeedDistanceCalibrationMetricsResponseBuildPartial.isInitialized()) {
                    return resetSpeedDistanceCalibrationMetricsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) resetSpeedDistanceCalibrationMetricsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ResetSpeedDistanceCalibrationMetricsResponse buildPartial() {
                ResetSpeedDistanceCalibrationMetricsResponse resetSpeedDistanceCalibrationMetricsResponse = new ResetSpeedDistanceCalibrationMetricsResponse(this);
                onBuilt();
                return resetSpeedDistanceCalibrationMetricsResponse;
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
                return GDIRunning.internal_static_GDI_Proto_Running_ResetSpeedDistanceCalibrationMetricsResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRunning.internal_static_GDI_Proto_Running_ResetSpeedDistanceCalibrationMetricsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ResetSpeedDistanceCalibrationMetricsResponse.class, Builder.class);
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
            public ResetSpeedDistanceCalibrationMetricsResponse getDefaultInstanceForType() {
                return ResetSpeedDistanceCalibrationMetricsResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ResetSpeedDistanceCalibrationMetricsResponse) {
                    return mergeFrom((ResetSpeedDistanceCalibrationMetricsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ResetSpeedDistanceCalibrationMetricsResponse resetSpeedDistanceCalibrationMetricsResponse) {
                if (resetSpeedDistanceCalibrationMetricsResponse == ResetSpeedDistanceCalibrationMetricsResponse.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(resetSpeedDistanceCalibrationMetricsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ResetSpeedDistanceCalibrationMetricsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ResetSpeedDistanceCalibrationMetricsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ResetSpeedDistanceCalibrationMetricsResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ResetSpeedDistanceCalibrationMetricsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetSpeedDistanceCalibrationMetricsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ResetSpeedDistanceCalibrationMetricsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ResetSpeedDistanceCalibrationMetricsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ResetSpeedDistanceCalibrationMetricsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ResetSpeedDistanceCalibrationMetricsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ResetSpeedDistanceCalibrationMetricsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ResetSpeedDistanceCalibrationMetricsResponse parseFrom(InputStream inputStream) {
            return (ResetSpeedDistanceCalibrationMetricsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ResetSpeedDistanceCalibrationMetricsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetSpeedDistanceCalibrationMetricsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ResetSpeedDistanceCalibrationMetricsResponse parseFrom(CodedInputStream codedInputStream) {
            return (ResetSpeedDistanceCalibrationMetricsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ResetSpeedDistanceCalibrationMetricsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetSpeedDistanceCalibrationMetricsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SpeedDistance extends GeneratedMessageV3 implements SpeedDistanceOrBuilder {
        public static final int DISTANCE_1_16_M_FIELD_NUMBER = 2;
        public static final int SPEED_1_256_M_PER_S_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int distance116M_;
        private byte memoizedIsInitialized;
        private int speed1256MPerS_;
        private static final SpeedDistance DEFAULT_INSTANCE = new SpeedDistance();

        @Deprecated
        public static final Parser<SpeedDistance> PARSER = new AbstractParser<SpeedDistance>() { // from class: com.garmin.proto.generated.GDIRunning.SpeedDistance.1
            @Override // com.google.protobuf.Parser
            public SpeedDistance parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SpeedDistance.newBuilder();
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

        private SpeedDistance(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.speed1256MPerS_ = 0;
            this.distance116M_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SpeedDistance getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRunning.internal_static_GDI_Proto_Running_SpeedDistance_descriptor;
        }

        public static Builder newBuilder(SpeedDistance speedDistance) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(speedDistance);
        }

        public static SpeedDistance parseDelimitedFrom(InputStream inputStream) {
            return (SpeedDistance) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SpeedDistance parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SpeedDistance> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SpeedDistance)) {
                return super.equals(obj);
            }
            SpeedDistance speedDistance = (SpeedDistance) obj;
            if (hasSpeed1256MPerS() != speedDistance.hasSpeed1256MPerS()) {
                return false;
            }
            if ((!hasSpeed1256MPerS() || getSpeed1256MPerS() == speedDistance.getSpeed1256MPerS()) && hasDistance116M() == speedDistance.hasDistance116M()) {
                return (!hasDistance116M() || getDistance116M() == speedDistance.getDistance116M()) && getUnknownFields().equals(speedDistance.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceOrBuilder
        public int getDistance116M() {
            return this.distance116M_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SpeedDistance> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.speed1256MPerS_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.distance116M_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceOrBuilder
        public int getSpeed1256MPerS() {
            return this.speed1256MPerS_;
        }

        @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceOrBuilder
        public boolean hasDistance116M() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceOrBuilder
        public boolean hasSpeed1256MPerS() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSpeed1256MPerS()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSpeed1256MPerS();
            }
            if (hasDistance116M()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDistance116M();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRunning.internal_static_GDI_Proto_Running_SpeedDistance_fieldAccessorTable.ensureFieldAccessorsInitialized(SpeedDistance.class, Builder.class);
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
            return new SpeedDistance();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.speed1256MPerS_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.distance116M_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SpeedDistanceOrBuilder {
            private int bitField0_;
            private int distance116M_;
            private int speed1256MPerS_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(SpeedDistance speedDistance) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    speedDistance.speed1256MPerS_ = this.speed1256MPerS_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    speedDistance.distance116M_ = this.distance116M_;
                    i14 |= 2;
                }
                speedDistance.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRunning.internal_static_GDI_Proto_Running_SpeedDistance_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SpeedDistance build() {
                SpeedDistance speedDistanceBuildPartial = buildPartial();
                if (speedDistanceBuildPartial.isInitialized()) {
                    return speedDistanceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) speedDistanceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SpeedDistance buildPartial() {
                SpeedDistance speedDistance = new SpeedDistance(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(speedDistance);
                }
                onBuilt();
                return speedDistance;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.speed1256MPerS_ = 0;
                this.distance116M_ = 0;
                return this;
            }

            public Builder clearDistance116M() {
                this.bitField0_ &= -3;
                this.distance116M_ = 0;
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

            public Builder clearSpeed1256MPerS() {
                this.bitField0_ &= -2;
                this.speed1256MPerS_ = 0;
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
                return GDIRunning.internal_static_GDI_Proto_Running_SpeedDistance_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceOrBuilder
            public int getDistance116M() {
                return this.distance116M_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceOrBuilder
            public int getSpeed1256MPerS() {
                return this.speed1256MPerS_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceOrBuilder
            public boolean hasDistance116M() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceOrBuilder
            public boolean hasSpeed1256MPerS() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRunning.internal_static_GDI_Proto_Running_SpeedDistance_fieldAccessorTable.ensureFieldAccessorsInitialized(SpeedDistance.class, Builder.class);
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
                                    this.speed1256MPerS_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.distance116M_ = codedInputStream.readUInt32();
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

            public Builder setDistance116M(int i14) {
                this.distance116M_ = i14;
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

            public Builder setSpeed1256MPerS(int i14) {
                this.speed1256MPerS_ = i14;
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
            public SpeedDistance getDefaultInstanceForType() {
                return SpeedDistance.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SpeedDistance) {
                    return mergeFrom((SpeedDistance) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SpeedDistance speedDistance) {
                if (speedDistance == SpeedDistance.getDefaultInstance()) {
                    return this;
                }
                if (speedDistance.hasSpeed1256MPerS()) {
                    setSpeed1256MPerS(speedDistance.getSpeed1256MPerS());
                }
                if (speedDistance.hasDistance116M()) {
                    setDistance116M(speedDistance.getDistance116M());
                }
                mergeUnknownFields(speedDistance.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SpeedDistance getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SpeedDistance parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SpeedDistance) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SpeedDistance parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SpeedDistance parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SpeedDistance parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ SpeedDistance(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SpeedDistance parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private SpeedDistance() {
            this.speed1256MPerS_ = 0;
            this.distance116M_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SpeedDistance parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SpeedDistance parseFrom(InputStream inputStream) {
            return (SpeedDistance) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SpeedDistance parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SpeedDistance) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SpeedDistance parseFrom(CodedInputStream codedInputStream) {
            return (SpeedDistance) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SpeedDistance parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SpeedDistance) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SpeedDistanceAlgorithmInputs extends GeneratedMessageV3 implements SpeedDistanceAlgorithmInputsOrBuilder {
        public static final int GPS_SPEED_1_MM_PER_S_FIELD_NUMBER = 2;
        public static final int GRADE_1_100_PCT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int gpsSpeed1MmPerS_;
        private int grade1100Pct_;
        private byte memoizedIsInitialized;
        private static final SpeedDistanceAlgorithmInputs DEFAULT_INSTANCE = new SpeedDistanceAlgorithmInputs();

        @Deprecated
        public static final Parser<SpeedDistanceAlgorithmInputs> PARSER = new AbstractParser<SpeedDistanceAlgorithmInputs>() { // from class: com.garmin.proto.generated.GDIRunning.SpeedDistanceAlgorithmInputs.1
            @Override // com.google.protobuf.Parser
            public SpeedDistanceAlgorithmInputs parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SpeedDistanceAlgorithmInputs.newBuilder();
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

        private SpeedDistanceAlgorithmInputs(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.grade1100Pct_ = 0;
            this.gpsSpeed1MmPerS_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SpeedDistanceAlgorithmInputs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRunning.internal_static_GDI_Proto_Running_SpeedDistanceAlgorithmInputs_descriptor;
        }

        public static Builder newBuilder(SpeedDistanceAlgorithmInputs speedDistanceAlgorithmInputs) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(speedDistanceAlgorithmInputs);
        }

        public static SpeedDistanceAlgorithmInputs parseDelimitedFrom(InputStream inputStream) {
            return (SpeedDistanceAlgorithmInputs) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SpeedDistanceAlgorithmInputs parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SpeedDistanceAlgorithmInputs> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SpeedDistanceAlgorithmInputs)) {
                return super.equals(obj);
            }
            SpeedDistanceAlgorithmInputs speedDistanceAlgorithmInputs = (SpeedDistanceAlgorithmInputs) obj;
            if (hasGrade1100Pct() != speedDistanceAlgorithmInputs.hasGrade1100Pct()) {
                return false;
            }
            if ((!hasGrade1100Pct() || getGrade1100Pct() == speedDistanceAlgorithmInputs.getGrade1100Pct()) && hasGpsSpeed1MmPerS() == speedDistanceAlgorithmInputs.hasGpsSpeed1MmPerS()) {
                return (!hasGpsSpeed1MmPerS() || getGpsSpeed1MmPerS() == speedDistanceAlgorithmInputs.getGpsSpeed1MmPerS()) && getUnknownFields().equals(speedDistanceAlgorithmInputs.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceAlgorithmInputsOrBuilder
        public int getGpsSpeed1MmPerS() {
            return this.gpsSpeed1MmPerS_;
        }

        @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceAlgorithmInputsOrBuilder
        public int getGrade1100Pct() {
            return this.grade1100Pct_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SpeedDistanceAlgorithmInputs> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeSInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeSInt32Size(1, this.grade1100Pct_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeSInt32Size += CodedOutputStream.computeUInt32Size(2, this.gpsSpeed1MmPerS_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeSInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceAlgorithmInputsOrBuilder
        public boolean hasGpsSpeed1MmPerS() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceAlgorithmInputsOrBuilder
        public boolean hasGrade1100Pct() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGrade1100Pct()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getGrade1100Pct();
            }
            if (hasGpsSpeed1MmPerS()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getGpsSpeed1MmPerS();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRunning.internal_static_GDI_Proto_Running_SpeedDistanceAlgorithmInputs_fieldAccessorTable.ensureFieldAccessorsInitialized(SpeedDistanceAlgorithmInputs.class, Builder.class);
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
            return new SpeedDistanceAlgorithmInputs();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeSInt32(1, this.grade1100Pct_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.gpsSpeed1MmPerS_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SpeedDistanceAlgorithmInputsOrBuilder {
            private int bitField0_;
            private int gpsSpeed1MmPerS_;
            private int grade1100Pct_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(SpeedDistanceAlgorithmInputs speedDistanceAlgorithmInputs) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    speedDistanceAlgorithmInputs.grade1100Pct_ = this.grade1100Pct_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    speedDistanceAlgorithmInputs.gpsSpeed1MmPerS_ = this.gpsSpeed1MmPerS_;
                    i14 |= 2;
                }
                speedDistanceAlgorithmInputs.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRunning.internal_static_GDI_Proto_Running_SpeedDistanceAlgorithmInputs_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SpeedDistanceAlgorithmInputs build() {
                SpeedDistanceAlgorithmInputs speedDistanceAlgorithmInputsBuildPartial = buildPartial();
                if (speedDistanceAlgorithmInputsBuildPartial.isInitialized()) {
                    return speedDistanceAlgorithmInputsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) speedDistanceAlgorithmInputsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SpeedDistanceAlgorithmInputs buildPartial() {
                SpeedDistanceAlgorithmInputs speedDistanceAlgorithmInputs = new SpeedDistanceAlgorithmInputs(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(speedDistanceAlgorithmInputs);
                }
                onBuilt();
                return speedDistanceAlgorithmInputs;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.grade1100Pct_ = 0;
                this.gpsSpeed1MmPerS_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGpsSpeed1MmPerS() {
                this.bitField0_ &= -3;
                this.gpsSpeed1MmPerS_ = 0;
                onChanged();
                return this;
            }

            public Builder clearGrade1100Pct() {
                this.bitField0_ &= -2;
                this.grade1100Pct_ = 0;
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
                return GDIRunning.internal_static_GDI_Proto_Running_SpeedDistanceAlgorithmInputs_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceAlgorithmInputsOrBuilder
            public int getGpsSpeed1MmPerS() {
                return this.gpsSpeed1MmPerS_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceAlgorithmInputsOrBuilder
            public int getGrade1100Pct() {
                return this.grade1100Pct_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceAlgorithmInputsOrBuilder
            public boolean hasGpsSpeed1MmPerS() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceAlgorithmInputsOrBuilder
            public boolean hasGrade1100Pct() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRunning.internal_static_GDI_Proto_Running_SpeedDistanceAlgorithmInputs_fieldAccessorTable.ensureFieldAccessorsInitialized(SpeedDistanceAlgorithmInputs.class, Builder.class);
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
                                    this.grade1100Pct_ = codedInputStream.readSInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.gpsSpeed1MmPerS_ = codedInputStream.readUInt32();
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

            public Builder setGpsSpeed1MmPerS(int i14) {
                this.gpsSpeed1MmPerS_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setGrade1100Pct(int i14) {
                this.grade1100Pct_ = i14;
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
            public SpeedDistanceAlgorithmInputs getDefaultInstanceForType() {
                return SpeedDistanceAlgorithmInputs.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SpeedDistanceAlgorithmInputs) {
                    return mergeFrom((SpeedDistanceAlgorithmInputs) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SpeedDistanceAlgorithmInputs speedDistanceAlgorithmInputs) {
                if (speedDistanceAlgorithmInputs == SpeedDistanceAlgorithmInputs.getDefaultInstance()) {
                    return this;
                }
                if (speedDistanceAlgorithmInputs.hasGrade1100Pct()) {
                    setGrade1100Pct(speedDistanceAlgorithmInputs.getGrade1100Pct());
                }
                if (speedDistanceAlgorithmInputs.hasGpsSpeed1MmPerS()) {
                    setGpsSpeed1MmPerS(speedDistanceAlgorithmInputs.getGpsSpeed1MmPerS());
                }
                mergeUnknownFields(speedDistanceAlgorithmInputs.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SpeedDistanceAlgorithmInputs getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SpeedDistanceAlgorithmInputs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SpeedDistanceAlgorithmInputs) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SpeedDistanceAlgorithmInputs parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SpeedDistanceAlgorithmInputs parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SpeedDistanceAlgorithmInputs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ SpeedDistanceAlgorithmInputs(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SpeedDistanceAlgorithmInputs parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private SpeedDistanceAlgorithmInputs() {
            this.grade1100Pct_ = 0;
            this.gpsSpeed1MmPerS_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SpeedDistanceAlgorithmInputs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SpeedDistanceAlgorithmInputs parseFrom(InputStream inputStream) {
            return (SpeedDistanceAlgorithmInputs) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SpeedDistanceAlgorithmInputs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SpeedDistanceAlgorithmInputs) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SpeedDistanceAlgorithmInputs parseFrom(CodedInputStream codedInputStream) {
            return (SpeedDistanceAlgorithmInputs) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SpeedDistanceAlgorithmInputs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SpeedDistanceAlgorithmInputs) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SpeedDistanceCapabilities extends GeneratedMessageV3 implements SpeedDistanceCapabilitiesOrBuilder {
        public static final int IS_AUTO_CALIBRATION_SUPPORTED_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean isAutoCalibrationSupported_;
        private byte memoizedIsInitialized;
        private static final SpeedDistanceCapabilities DEFAULT_INSTANCE = new SpeedDistanceCapabilities();

        @Deprecated
        public static final Parser<SpeedDistanceCapabilities> PARSER = new AbstractParser<SpeedDistanceCapabilities>() { // from class: com.garmin.proto.generated.GDIRunning.SpeedDistanceCapabilities.1
            @Override // com.google.protobuf.Parser
            public SpeedDistanceCapabilities parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SpeedDistanceCapabilities.newBuilder();
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

        private SpeedDistanceCapabilities(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.isAutoCalibrationSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SpeedDistanceCapabilities getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRunning.internal_static_GDI_Proto_Running_SpeedDistanceCapabilities_descriptor;
        }

        public static Builder newBuilder(SpeedDistanceCapabilities speedDistanceCapabilities) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(speedDistanceCapabilities);
        }

        public static SpeedDistanceCapabilities parseDelimitedFrom(InputStream inputStream) {
            return (SpeedDistanceCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SpeedDistanceCapabilities parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SpeedDistanceCapabilities> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SpeedDistanceCapabilities)) {
                return super.equals(obj);
            }
            SpeedDistanceCapabilities speedDistanceCapabilities = (SpeedDistanceCapabilities) obj;
            if (hasIsAutoCalibrationSupported() != speedDistanceCapabilities.hasIsAutoCalibrationSupported()) {
                return false;
            }
            return (!hasIsAutoCalibrationSupported() || getIsAutoCalibrationSupported() == speedDistanceCapabilities.getIsAutoCalibrationSupported()) && getUnknownFields().equals(speedDistanceCapabilities.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceCapabilitiesOrBuilder
        public boolean getIsAutoCalibrationSupported() {
            return this.isAutoCalibrationSupported_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SpeedDistanceCapabilities> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.isAutoCalibrationSupported_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceCapabilitiesOrBuilder
        public boolean hasIsAutoCalibrationSupported() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasIsAutoCalibrationSupported()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getIsAutoCalibrationSupported());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRunning.internal_static_GDI_Proto_Running_SpeedDistanceCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(SpeedDistanceCapabilities.class, Builder.class);
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
            return new SpeedDistanceCapabilities();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.isAutoCalibrationSupported_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SpeedDistanceCapabilitiesOrBuilder {
            private int bitField0_;
            private boolean isAutoCalibrationSupported_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(SpeedDistanceCapabilities speedDistanceCapabilities) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    speedDistanceCapabilities.isAutoCalibrationSupported_ = this.isAutoCalibrationSupported_;
                } else {
                    i14 = 0;
                }
                speedDistanceCapabilities.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRunning.internal_static_GDI_Proto_Running_SpeedDistanceCapabilities_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SpeedDistanceCapabilities build() {
                SpeedDistanceCapabilities speedDistanceCapabilitiesBuildPartial = buildPartial();
                if (speedDistanceCapabilitiesBuildPartial.isInitialized()) {
                    return speedDistanceCapabilitiesBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) speedDistanceCapabilitiesBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SpeedDistanceCapabilities buildPartial() {
                SpeedDistanceCapabilities speedDistanceCapabilities = new SpeedDistanceCapabilities(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(speedDistanceCapabilities);
                }
                onBuilt();
                return speedDistanceCapabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.isAutoCalibrationSupported_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIsAutoCalibrationSupported() {
                this.bitField0_ &= -2;
                this.isAutoCalibrationSupported_ = false;
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
                return GDIRunning.internal_static_GDI_Proto_Running_SpeedDistanceCapabilities_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceCapabilitiesOrBuilder
            public boolean getIsAutoCalibrationSupported() {
                return this.isAutoCalibrationSupported_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceCapabilitiesOrBuilder
            public boolean hasIsAutoCalibrationSupported() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRunning.internal_static_GDI_Proto_Running_SpeedDistanceCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(SpeedDistanceCapabilities.class, Builder.class);
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
                                    this.isAutoCalibrationSupported_ = codedInputStream.readBool();
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

            public Builder setIsAutoCalibrationSupported(boolean z14) {
                this.isAutoCalibrationSupported_ = z14;
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
            public SpeedDistanceCapabilities getDefaultInstanceForType() {
                return SpeedDistanceCapabilities.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SpeedDistanceCapabilities) {
                    return mergeFrom((SpeedDistanceCapabilities) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SpeedDistanceCapabilities speedDistanceCapabilities) {
                if (speedDistanceCapabilities == SpeedDistanceCapabilities.getDefaultInstance()) {
                    return this;
                }
                if (speedDistanceCapabilities.hasIsAutoCalibrationSupported()) {
                    setIsAutoCalibrationSupported(speedDistanceCapabilities.getIsAutoCalibrationSupported());
                }
                mergeUnknownFields(speedDistanceCapabilities.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SpeedDistanceCapabilities getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SpeedDistanceCapabilities parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SpeedDistanceCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SpeedDistanceCapabilities parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SpeedDistanceCapabilities(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SpeedDistanceCapabilities parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SpeedDistanceCapabilities() {
            this.isAutoCalibrationSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SpeedDistanceCapabilities parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SpeedDistanceCapabilities parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SpeedDistanceCapabilities parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SpeedDistanceCapabilities parseFrom(InputStream inputStream) {
            return (SpeedDistanceCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SpeedDistanceCapabilities parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SpeedDistanceCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SpeedDistanceCapabilities parseFrom(CodedInputStream codedInputStream) {
            return (SpeedDistanceCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SpeedDistanceCapabilities parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SpeedDistanceCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SpeedDistanceConfigurationFields extends GeneratedMessageV3 implements SpeedDistanceConfigurationFieldsOrBuilder {
        public static final int IS_AUTO_CALIBRATION_ENABLED_FIELD_NUMBER = 2;
        public static final int TREADMILL_CALIBRATION_FACTOR_1_100_PCT_FIELD_NUMBER = 1;
        public static final int USER_HEIGHT_CM_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean isAutoCalibrationEnabled_;
        private byte memoizedIsInitialized;
        private int treadmillCalibrationFactor1100Pct_;
        private int userHeightCm_;
        private static final SpeedDistanceConfigurationFields DEFAULT_INSTANCE = new SpeedDistanceConfigurationFields();

        @Deprecated
        public static final Parser<SpeedDistanceConfigurationFields> PARSER = new AbstractParser<SpeedDistanceConfigurationFields>() { // from class: com.garmin.proto.generated.GDIRunning.SpeedDistanceConfigurationFields.1
            @Override // com.google.protobuf.Parser
            public SpeedDistanceConfigurationFields parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SpeedDistanceConfigurationFields.newBuilder();
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

        private SpeedDistanceConfigurationFields(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.treadmillCalibrationFactor1100Pct_ = 0;
            this.isAutoCalibrationEnabled_ = false;
            this.userHeightCm_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SpeedDistanceConfigurationFields getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRunning.internal_static_GDI_Proto_Running_SpeedDistanceConfigurationFields_descriptor;
        }

        public static Builder newBuilder(SpeedDistanceConfigurationFields speedDistanceConfigurationFields) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(speedDistanceConfigurationFields);
        }

        public static SpeedDistanceConfigurationFields parseDelimitedFrom(InputStream inputStream) {
            return (SpeedDistanceConfigurationFields) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SpeedDistanceConfigurationFields parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SpeedDistanceConfigurationFields> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SpeedDistanceConfigurationFields)) {
                return super.equals(obj);
            }
            SpeedDistanceConfigurationFields speedDistanceConfigurationFields = (SpeedDistanceConfigurationFields) obj;
            if (hasTreadmillCalibrationFactor1100Pct() != speedDistanceConfigurationFields.hasTreadmillCalibrationFactor1100Pct()) {
                return false;
            }
            if ((hasTreadmillCalibrationFactor1100Pct() && getTreadmillCalibrationFactor1100Pct() != speedDistanceConfigurationFields.getTreadmillCalibrationFactor1100Pct()) || hasIsAutoCalibrationEnabled() != speedDistanceConfigurationFields.hasIsAutoCalibrationEnabled()) {
                return false;
            }
            if ((!hasIsAutoCalibrationEnabled() || getIsAutoCalibrationEnabled() == speedDistanceConfigurationFields.getIsAutoCalibrationEnabled()) && hasUserHeightCm() == speedDistanceConfigurationFields.hasUserHeightCm()) {
                return (!hasUserHeightCm() || getUserHeightCm() == speedDistanceConfigurationFields.getUserHeightCm()) && getUnknownFields().equals(speedDistanceConfigurationFields.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceConfigurationFieldsOrBuilder
        public boolean getIsAutoCalibrationEnabled() {
            return this.isAutoCalibrationEnabled_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SpeedDistanceConfigurationFields> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.treadmillCalibrationFactor1100Pct_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(2, this.isAutoCalibrationEnabled_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.userHeightCm_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceConfigurationFieldsOrBuilder
        public int getTreadmillCalibrationFactor1100Pct() {
            return this.treadmillCalibrationFactor1100Pct_;
        }

        @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceConfigurationFieldsOrBuilder
        public int getUserHeightCm() {
            return this.userHeightCm_;
        }

        @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceConfigurationFieldsOrBuilder
        public boolean hasIsAutoCalibrationEnabled() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceConfigurationFieldsOrBuilder
        public boolean hasTreadmillCalibrationFactor1100Pct() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceConfigurationFieldsOrBuilder
        public boolean hasUserHeightCm() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTreadmillCalibrationFactor1100Pct()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTreadmillCalibrationFactor1100Pct();
            }
            if (hasIsAutoCalibrationEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getIsAutoCalibrationEnabled());
            }
            if (hasUserHeightCm()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getUserHeightCm();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRunning.internal_static_GDI_Proto_Running_SpeedDistanceConfigurationFields_fieldAccessorTable.ensureFieldAccessorsInitialized(SpeedDistanceConfigurationFields.class, Builder.class);
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
            return new SpeedDistanceConfigurationFields();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.treadmillCalibrationFactor1100Pct_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.isAutoCalibrationEnabled_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.userHeightCm_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SpeedDistanceConfigurationFieldsOrBuilder {
            private int bitField0_;
            private boolean isAutoCalibrationEnabled_;
            private int treadmillCalibrationFactor1100Pct_;
            private int userHeightCm_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(SpeedDistanceConfigurationFields speedDistanceConfigurationFields) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    speedDistanceConfigurationFields.treadmillCalibrationFactor1100Pct_ = this.treadmillCalibrationFactor1100Pct_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    speedDistanceConfigurationFields.isAutoCalibrationEnabled_ = this.isAutoCalibrationEnabled_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    speedDistanceConfigurationFields.userHeightCm_ = this.userHeightCm_;
                    i14 |= 4;
                }
                speedDistanceConfigurationFields.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRunning.internal_static_GDI_Proto_Running_SpeedDistanceConfigurationFields_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SpeedDistanceConfigurationFields build() {
                SpeedDistanceConfigurationFields speedDistanceConfigurationFieldsBuildPartial = buildPartial();
                if (speedDistanceConfigurationFieldsBuildPartial.isInitialized()) {
                    return speedDistanceConfigurationFieldsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) speedDistanceConfigurationFieldsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SpeedDistanceConfigurationFields buildPartial() {
                SpeedDistanceConfigurationFields speedDistanceConfigurationFields = new SpeedDistanceConfigurationFields(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(speedDistanceConfigurationFields);
                }
                onBuilt();
                return speedDistanceConfigurationFields;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.treadmillCalibrationFactor1100Pct_ = 0;
                this.isAutoCalibrationEnabled_ = false;
                this.userHeightCm_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIsAutoCalibrationEnabled() {
                this.bitField0_ &= -3;
                this.isAutoCalibrationEnabled_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearTreadmillCalibrationFactor1100Pct() {
                this.bitField0_ &= -2;
                this.treadmillCalibrationFactor1100Pct_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUserHeightCm() {
                this.bitField0_ &= -5;
                this.userHeightCm_ = 0;
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
                return GDIRunning.internal_static_GDI_Proto_Running_SpeedDistanceConfigurationFields_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceConfigurationFieldsOrBuilder
            public boolean getIsAutoCalibrationEnabled() {
                return this.isAutoCalibrationEnabled_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceConfigurationFieldsOrBuilder
            public int getTreadmillCalibrationFactor1100Pct() {
                return this.treadmillCalibrationFactor1100Pct_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceConfigurationFieldsOrBuilder
            public int getUserHeightCm() {
                return this.userHeightCm_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceConfigurationFieldsOrBuilder
            public boolean hasIsAutoCalibrationEnabled() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceConfigurationFieldsOrBuilder
            public boolean hasTreadmillCalibrationFactor1100Pct() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.SpeedDistanceConfigurationFieldsOrBuilder
            public boolean hasUserHeightCm() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRunning.internal_static_GDI_Proto_Running_SpeedDistanceConfigurationFields_fieldAccessorTable.ensureFieldAccessorsInitialized(SpeedDistanceConfigurationFields.class, Builder.class);
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
                                    this.treadmillCalibrationFactor1100Pct_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.isAutoCalibrationEnabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.userHeightCm_ = codedInputStream.readUInt32();
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

            public Builder setIsAutoCalibrationEnabled(boolean z14) {
                this.isAutoCalibrationEnabled_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTreadmillCalibrationFactor1100Pct(int i14) {
                this.treadmillCalibrationFactor1100Pct_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setUserHeightCm(int i14) {
                this.userHeightCm_ = i14;
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
            public SpeedDistanceConfigurationFields getDefaultInstanceForType() {
                return SpeedDistanceConfigurationFields.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SpeedDistanceConfigurationFields) {
                    return mergeFrom((SpeedDistanceConfigurationFields) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SpeedDistanceConfigurationFields speedDistanceConfigurationFields) {
                if (speedDistanceConfigurationFields == SpeedDistanceConfigurationFields.getDefaultInstance()) {
                    return this;
                }
                if (speedDistanceConfigurationFields.hasTreadmillCalibrationFactor1100Pct()) {
                    setTreadmillCalibrationFactor1100Pct(speedDistanceConfigurationFields.getTreadmillCalibrationFactor1100Pct());
                }
                if (speedDistanceConfigurationFields.hasIsAutoCalibrationEnabled()) {
                    setIsAutoCalibrationEnabled(speedDistanceConfigurationFields.getIsAutoCalibrationEnabled());
                }
                if (speedDistanceConfigurationFields.hasUserHeightCm()) {
                    setUserHeightCm(speedDistanceConfigurationFields.getUserHeightCm());
                }
                mergeUnknownFields(speedDistanceConfigurationFields.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SpeedDistanceConfigurationFields getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SpeedDistanceConfigurationFields parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SpeedDistanceConfigurationFields) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SpeedDistanceConfigurationFields parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SpeedDistanceConfigurationFields parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SpeedDistanceConfigurationFields parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SpeedDistanceConfigurationFields parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SpeedDistanceConfigurationFields parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ SpeedDistanceConfigurationFields(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SpeedDistanceConfigurationFields parseFrom(InputStream inputStream) {
            return (SpeedDistanceConfigurationFields) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private SpeedDistanceConfigurationFields() {
            this.treadmillCalibrationFactor1100Pct_ = 0;
            this.isAutoCalibrationEnabled_ = false;
            this.userHeightCm_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SpeedDistanceConfigurationFields parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SpeedDistanceConfigurationFields) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SpeedDistanceConfigurationFields parseFrom(CodedInputStream codedInputStream) {
            return (SpeedDistanceConfigurationFields) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SpeedDistanceConfigurationFields parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SpeedDistanceConfigurationFields) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StepSpeedLoss extends GeneratedMessageV3 implements StepSpeedLossOrBuilder {
        private static final StepSpeedLoss DEFAULT_INSTANCE = new StepSpeedLoss();

        @Deprecated
        public static final Parser<StepSpeedLoss> PARSER = new AbstractParser<StepSpeedLoss>() { // from class: com.garmin.proto.generated.GDIRunning.StepSpeedLoss.1
            @Override // com.google.protobuf.Parser
            public StepSpeedLoss parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StepSpeedLoss.newBuilder();
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
        public static final int STEP_FORWARD_VELOCITY_MEAN_MM_PER_S_FIELD_NUMBER = 3;
        public static final int STEP_FORWARD_VELOCITY_PEAK_MM_PER_S_FIELD_NUMBER = 2;
        public static final int STEP_FORWARD_VELOCITY_TROUGH_MM_PER_S_FIELD_NUMBER = 1;
        public static final int STEP_VERTICAL_VELOCITY_AT_TROUGH_MM_PER_S_FIELD_NUMBER = 4;
        public static final int TIME_TO_TROUGH_MS_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int stepForwardVelocityMeanMmPerS_;
        private int stepForwardVelocityPeakMmPerS_;
        private int stepForwardVelocityTroughMmPerS_;
        private int stepVerticalVelocityAtTroughMmPerS_;
        private int timeToTroughMs_;

        private StepSpeedLoss(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.stepForwardVelocityTroughMmPerS_ = 0;
            this.stepForwardVelocityPeakMmPerS_ = 0;
            this.stepForwardVelocityMeanMmPerS_ = 0;
            this.stepVerticalVelocityAtTroughMmPerS_ = 0;
            this.timeToTroughMs_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StepSpeedLoss getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRunning.internal_static_GDI_Proto_Running_StepSpeedLoss_descriptor;
        }

        public static Builder newBuilder(StepSpeedLoss stepSpeedLoss) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stepSpeedLoss);
        }

        public static StepSpeedLoss parseDelimitedFrom(InputStream inputStream) {
            return (StepSpeedLoss) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StepSpeedLoss parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StepSpeedLoss> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StepSpeedLoss)) {
                return super.equals(obj);
            }
            StepSpeedLoss stepSpeedLoss = (StepSpeedLoss) obj;
            if (hasStepForwardVelocityTroughMmPerS() != stepSpeedLoss.hasStepForwardVelocityTroughMmPerS()) {
                return false;
            }
            if ((hasStepForwardVelocityTroughMmPerS() && getStepForwardVelocityTroughMmPerS() != stepSpeedLoss.getStepForwardVelocityTroughMmPerS()) || hasStepForwardVelocityPeakMmPerS() != stepSpeedLoss.hasStepForwardVelocityPeakMmPerS()) {
                return false;
            }
            if ((hasStepForwardVelocityPeakMmPerS() && getStepForwardVelocityPeakMmPerS() != stepSpeedLoss.getStepForwardVelocityPeakMmPerS()) || hasStepForwardVelocityMeanMmPerS() != stepSpeedLoss.hasStepForwardVelocityMeanMmPerS()) {
                return false;
            }
            if ((hasStepForwardVelocityMeanMmPerS() && getStepForwardVelocityMeanMmPerS() != stepSpeedLoss.getStepForwardVelocityMeanMmPerS()) || hasStepVerticalVelocityAtTroughMmPerS() != stepSpeedLoss.hasStepVerticalVelocityAtTroughMmPerS()) {
                return false;
            }
            if ((!hasStepVerticalVelocityAtTroughMmPerS() || getStepVerticalVelocityAtTroughMmPerS() == stepSpeedLoss.getStepVerticalVelocityAtTroughMmPerS()) && hasTimeToTroughMs() == stepSpeedLoss.hasTimeToTroughMs()) {
                return (!hasTimeToTroughMs() || getTimeToTroughMs() == stepSpeedLoss.getTimeToTroughMs()) && getUnknownFields().equals(stepSpeedLoss.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StepSpeedLoss> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeSInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeSInt32Size(1, this.stepForwardVelocityTroughMmPerS_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeSInt32Size += CodedOutputStream.computeSInt32Size(2, this.stepForwardVelocityPeakMmPerS_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeSInt32Size += CodedOutputStream.computeSInt32Size(3, this.stepForwardVelocityMeanMmPerS_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeSInt32Size += CodedOutputStream.computeSInt32Size(4, this.stepVerticalVelocityAtTroughMmPerS_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeSInt32Size += CodedOutputStream.computeUInt32Size(5, this.timeToTroughMs_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeSInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRunning.StepSpeedLossOrBuilder
        public int getStepForwardVelocityMeanMmPerS() {
            return this.stepForwardVelocityMeanMmPerS_;
        }

        @Override // com.garmin.proto.generated.GDIRunning.StepSpeedLossOrBuilder
        public int getStepForwardVelocityPeakMmPerS() {
            return this.stepForwardVelocityPeakMmPerS_;
        }

        @Override // com.garmin.proto.generated.GDIRunning.StepSpeedLossOrBuilder
        public int getStepForwardVelocityTroughMmPerS() {
            return this.stepForwardVelocityTroughMmPerS_;
        }

        @Override // com.garmin.proto.generated.GDIRunning.StepSpeedLossOrBuilder
        public int getStepVerticalVelocityAtTroughMmPerS() {
            return this.stepVerticalVelocityAtTroughMmPerS_;
        }

        @Override // com.garmin.proto.generated.GDIRunning.StepSpeedLossOrBuilder
        public int getTimeToTroughMs() {
            return this.timeToTroughMs_;
        }

        @Override // com.garmin.proto.generated.GDIRunning.StepSpeedLossOrBuilder
        public boolean hasStepForwardVelocityMeanMmPerS() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.StepSpeedLossOrBuilder
        public boolean hasStepForwardVelocityPeakMmPerS() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.StepSpeedLossOrBuilder
        public boolean hasStepForwardVelocityTroughMmPerS() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.StepSpeedLossOrBuilder
        public boolean hasStepVerticalVelocityAtTroughMmPerS() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.StepSpeedLossOrBuilder
        public boolean hasTimeToTroughMs() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStepForwardVelocityTroughMmPerS()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getStepForwardVelocityTroughMmPerS();
            }
            if (hasStepForwardVelocityPeakMmPerS()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getStepForwardVelocityPeakMmPerS();
            }
            if (hasStepForwardVelocityMeanMmPerS()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getStepForwardVelocityMeanMmPerS();
            }
            if (hasStepVerticalVelocityAtTroughMmPerS()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getStepVerticalVelocityAtTroughMmPerS();
            }
            if (hasTimeToTroughMs()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getTimeToTroughMs();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRunning.internal_static_GDI_Proto_Running_StepSpeedLoss_fieldAccessorTable.ensureFieldAccessorsInitialized(StepSpeedLoss.class, Builder.class);
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
            return new StepSpeedLoss();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeSInt32(1, this.stepForwardVelocityTroughMmPerS_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeSInt32(2, this.stepForwardVelocityPeakMmPerS_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeSInt32(3, this.stepForwardVelocityMeanMmPerS_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeSInt32(4, this.stepVerticalVelocityAtTroughMmPerS_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.timeToTroughMs_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StepSpeedLossOrBuilder {
            private int bitField0_;
            private int stepForwardVelocityMeanMmPerS_;
            private int stepForwardVelocityPeakMmPerS_;
            private int stepForwardVelocityTroughMmPerS_;
            private int stepVerticalVelocityAtTroughMmPerS_;
            private int timeToTroughMs_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(StepSpeedLoss stepSpeedLoss) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    stepSpeedLoss.stepForwardVelocityTroughMmPerS_ = this.stepForwardVelocityTroughMmPerS_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    stepSpeedLoss.stepForwardVelocityPeakMmPerS_ = this.stepForwardVelocityPeakMmPerS_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    stepSpeedLoss.stepForwardVelocityMeanMmPerS_ = this.stepForwardVelocityMeanMmPerS_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    stepSpeedLoss.stepVerticalVelocityAtTroughMmPerS_ = this.stepVerticalVelocityAtTroughMmPerS_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    stepSpeedLoss.timeToTroughMs_ = this.timeToTroughMs_;
                    i14 |= 16;
                }
                stepSpeedLoss.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRunning.internal_static_GDI_Proto_Running_StepSpeedLoss_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StepSpeedLoss build() {
                StepSpeedLoss stepSpeedLossBuildPartial = buildPartial();
                if (stepSpeedLossBuildPartial.isInitialized()) {
                    return stepSpeedLossBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stepSpeedLossBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StepSpeedLoss buildPartial() {
                StepSpeedLoss stepSpeedLoss = new StepSpeedLoss(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(stepSpeedLoss);
                }
                onBuilt();
                return stepSpeedLoss;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.stepForwardVelocityTroughMmPerS_ = 0;
                this.stepForwardVelocityPeakMmPerS_ = 0;
                this.stepForwardVelocityMeanMmPerS_ = 0;
                this.stepVerticalVelocityAtTroughMmPerS_ = 0;
                this.timeToTroughMs_ = 0;
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

            public Builder clearStepForwardVelocityMeanMmPerS() {
                this.bitField0_ &= -5;
                this.stepForwardVelocityMeanMmPerS_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStepForwardVelocityPeakMmPerS() {
                this.bitField0_ &= -3;
                this.stepForwardVelocityPeakMmPerS_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStepForwardVelocityTroughMmPerS() {
                this.bitField0_ &= -2;
                this.stepForwardVelocityTroughMmPerS_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStepVerticalVelocityAtTroughMmPerS() {
                this.bitField0_ &= -9;
                this.stepVerticalVelocityAtTroughMmPerS_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTimeToTroughMs() {
                this.bitField0_ &= -17;
                this.timeToTroughMs_ = 0;
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
                return GDIRunning.internal_static_GDI_Proto_Running_StepSpeedLoss_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRunning.StepSpeedLossOrBuilder
            public int getStepForwardVelocityMeanMmPerS() {
                return this.stepForwardVelocityMeanMmPerS_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.StepSpeedLossOrBuilder
            public int getStepForwardVelocityPeakMmPerS() {
                return this.stepForwardVelocityPeakMmPerS_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.StepSpeedLossOrBuilder
            public int getStepForwardVelocityTroughMmPerS() {
                return this.stepForwardVelocityTroughMmPerS_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.StepSpeedLossOrBuilder
            public int getStepVerticalVelocityAtTroughMmPerS() {
                return this.stepVerticalVelocityAtTroughMmPerS_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.StepSpeedLossOrBuilder
            public int getTimeToTroughMs() {
                return this.timeToTroughMs_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.StepSpeedLossOrBuilder
            public boolean hasStepForwardVelocityMeanMmPerS() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.StepSpeedLossOrBuilder
            public boolean hasStepForwardVelocityPeakMmPerS() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.StepSpeedLossOrBuilder
            public boolean hasStepForwardVelocityTroughMmPerS() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.StepSpeedLossOrBuilder
            public boolean hasStepVerticalVelocityAtTroughMmPerS() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.StepSpeedLossOrBuilder
            public boolean hasTimeToTroughMs() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRunning.internal_static_GDI_Proto_Running_StepSpeedLoss_fieldAccessorTable.ensureFieldAccessorsInitialized(StepSpeedLoss.class, Builder.class);
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
                                    this.stepForwardVelocityTroughMmPerS_ = codedInputStream.readSInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.stepForwardVelocityPeakMmPerS_ = codedInputStream.readSInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.stepForwardVelocityMeanMmPerS_ = codedInputStream.readSInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.stepVerticalVelocityAtTroughMmPerS_ = codedInputStream.readSInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.timeToTroughMs_ = codedInputStream.readUInt32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStepForwardVelocityMeanMmPerS(int i14) {
                this.stepForwardVelocityMeanMmPerS_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setStepForwardVelocityPeakMmPerS(int i14) {
                this.stepForwardVelocityPeakMmPerS_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStepForwardVelocityTroughMmPerS(int i14) {
                this.stepForwardVelocityTroughMmPerS_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStepVerticalVelocityAtTroughMmPerS(int i14) {
                this.stepVerticalVelocityAtTroughMmPerS_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setTimeToTroughMs(int i14) {
                this.timeToTroughMs_ = i14;
                this.bitField0_ |= 16;
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
            public StepSpeedLoss getDefaultInstanceForType() {
                return StepSpeedLoss.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StepSpeedLoss) {
                    return mergeFrom((StepSpeedLoss) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StepSpeedLoss stepSpeedLoss) {
                if (stepSpeedLoss == StepSpeedLoss.getDefaultInstance()) {
                    return this;
                }
                if (stepSpeedLoss.hasStepForwardVelocityTroughMmPerS()) {
                    setStepForwardVelocityTroughMmPerS(stepSpeedLoss.getStepForwardVelocityTroughMmPerS());
                }
                if (stepSpeedLoss.hasStepForwardVelocityPeakMmPerS()) {
                    setStepForwardVelocityPeakMmPerS(stepSpeedLoss.getStepForwardVelocityPeakMmPerS());
                }
                if (stepSpeedLoss.hasStepForwardVelocityMeanMmPerS()) {
                    setStepForwardVelocityMeanMmPerS(stepSpeedLoss.getStepForwardVelocityMeanMmPerS());
                }
                if (stepSpeedLoss.hasStepVerticalVelocityAtTroughMmPerS()) {
                    setStepVerticalVelocityAtTroughMmPerS(stepSpeedLoss.getStepVerticalVelocityAtTroughMmPerS());
                }
                if (stepSpeedLoss.hasTimeToTroughMs()) {
                    setTimeToTroughMs(stepSpeedLoss.getTimeToTroughMs());
                }
                mergeUnknownFields(stepSpeedLoss.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StepSpeedLoss getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StepSpeedLoss parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StepSpeedLoss) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StepSpeedLoss parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StepSpeedLoss parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StepSpeedLoss parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StepSpeedLoss parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StepSpeedLoss parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StepSpeedLoss parseFrom(InputStream inputStream) {
            return (StepSpeedLoss) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StepSpeedLoss parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StepSpeedLoss) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ StepSpeedLoss(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StepSpeedLoss parseFrom(CodedInputStream codedInputStream) {
            return (StepSpeedLoss) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private StepSpeedLoss() {
            this.stepForwardVelocityTroughMmPerS_ = 0;
            this.stepForwardVelocityPeakMmPerS_ = 0;
            this.stepForwardVelocityMeanMmPerS_ = 0;
            this.stepVerticalVelocityAtTroughMmPerS_ = 0;
            this.timeToTroughMs_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StepSpeedLoss parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StepSpeedLoss) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AlgorithmInputNotification extends GeneratedMessageV3 implements AlgorithmInputNotificationOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1016;
        public static final int HORIZONTAL_SPEED_1_256THS_MS_FIELD_NUMBER = 1;
        public static final int SPEED_DISTANCE_ALGORITHM_INPUTS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int horizontalSpeed1256ThsMs_;
        private byte memoizedIsInitialized;
        private SpeedDistanceAlgorithmInputs speedDistanceAlgorithmInputs_;
        private static final AlgorithmInputNotification DEFAULT_INSTANCE = new AlgorithmInputNotification();

        @Deprecated
        public static final Parser<AlgorithmInputNotification> PARSER = new AbstractParser<AlgorithmInputNotification>() { // from class: com.garmin.proto.generated.GDIRunning.AlgorithmInputNotification.1
            @Override // com.google.protobuf.Parser
            public AlgorithmInputNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AlgorithmInputNotification.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, AlgorithmInputNotification> data = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, AlgorithmInputNotification.class, getDefaultInstance());

        private AlgorithmInputNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.horizontalSpeed1256ThsMs_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlgorithmInputNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRunning.internal_static_GDI_Proto_Running_AlgorithmInputNotification_descriptor;
        }

        public static Builder newBuilder(AlgorithmInputNotification algorithmInputNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(algorithmInputNotification);
        }

        public static AlgorithmInputNotification parseDelimitedFrom(InputStream inputStream) {
            return (AlgorithmInputNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlgorithmInputNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AlgorithmInputNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlgorithmInputNotification)) {
                return super.equals(obj);
            }
            AlgorithmInputNotification algorithmInputNotification = (AlgorithmInputNotification) obj;
            if (hasHorizontalSpeed1256ThsMs() != algorithmInputNotification.hasHorizontalSpeed1256ThsMs()) {
                return false;
            }
            if ((!hasHorizontalSpeed1256ThsMs() || getHorizontalSpeed1256ThsMs() == algorithmInputNotification.getHorizontalSpeed1256ThsMs()) && hasSpeedDistanceAlgorithmInputs() == algorithmInputNotification.hasSpeedDistanceAlgorithmInputs()) {
                return (!hasSpeedDistanceAlgorithmInputs() || getSpeedDistanceAlgorithmInputs().equals(algorithmInputNotification.getSpeedDistanceAlgorithmInputs())) && getUnknownFields().equals(algorithmInputNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRunning.AlgorithmInputNotificationOrBuilder
        public int getHorizontalSpeed1256ThsMs() {
            return this.horizontalSpeed1256ThsMs_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlgorithmInputNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.horizontalSpeed1256ThsMs_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(2, getSpeedDistanceAlgorithmInputs());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRunning.AlgorithmInputNotificationOrBuilder
        public SpeedDistanceAlgorithmInputs getSpeedDistanceAlgorithmInputs() {
            SpeedDistanceAlgorithmInputs speedDistanceAlgorithmInputs = this.speedDistanceAlgorithmInputs_;
            return speedDistanceAlgorithmInputs == null ? SpeedDistanceAlgorithmInputs.getDefaultInstance() : speedDistanceAlgorithmInputs;
        }

        @Override // com.garmin.proto.generated.GDIRunning.AlgorithmInputNotificationOrBuilder
        public SpeedDistanceAlgorithmInputsOrBuilder getSpeedDistanceAlgorithmInputsOrBuilder() {
            SpeedDistanceAlgorithmInputs speedDistanceAlgorithmInputs = this.speedDistanceAlgorithmInputs_;
            return speedDistanceAlgorithmInputs == null ? SpeedDistanceAlgorithmInputs.getDefaultInstance() : speedDistanceAlgorithmInputs;
        }

        @Override // com.garmin.proto.generated.GDIRunning.AlgorithmInputNotificationOrBuilder
        public boolean hasHorizontalSpeed1256ThsMs() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.AlgorithmInputNotificationOrBuilder
        public boolean hasSpeedDistanceAlgorithmInputs() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasHorizontalSpeed1256ThsMs()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getHorizontalSpeed1256ThsMs();
            }
            if (hasSpeedDistanceAlgorithmInputs()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSpeedDistanceAlgorithmInputs().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRunning.internal_static_GDI_Proto_Running_AlgorithmInputNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AlgorithmInputNotification.class, Builder.class);
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
            return new AlgorithmInputNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.horizontalSpeed1256ThsMs_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getSpeedDistanceAlgorithmInputs());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlgorithmInputNotificationOrBuilder {
            private int bitField0_;
            private int horizontalSpeed1256ThsMs_;
            private SingleFieldBuilderV3<SpeedDistanceAlgorithmInputs, SpeedDistanceAlgorithmInputs.Builder, SpeedDistanceAlgorithmInputsOrBuilder> speedDistanceAlgorithmInputsBuilder_;
            private SpeedDistanceAlgorithmInputs speedDistanceAlgorithmInputs_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(AlgorithmInputNotification algorithmInputNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    algorithmInputNotification.horizontalSpeed1256ThsMs_ = this.horizontalSpeed1256ThsMs_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<SpeedDistanceAlgorithmInputs, SpeedDistanceAlgorithmInputs.Builder, SpeedDistanceAlgorithmInputsOrBuilder> singleFieldBuilderV3 = this.speedDistanceAlgorithmInputsBuilder_;
                    algorithmInputNotification.speedDistanceAlgorithmInputs_ = singleFieldBuilderV3 == null ? this.speedDistanceAlgorithmInputs_ : (SpeedDistanceAlgorithmInputs) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                algorithmInputNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRunning.internal_static_GDI_Proto_Running_AlgorithmInputNotification_descriptor;
            }

            private SingleFieldBuilderV3<SpeedDistanceAlgorithmInputs, SpeedDistanceAlgorithmInputs.Builder, SpeedDistanceAlgorithmInputsOrBuilder> getSpeedDistanceAlgorithmInputsFieldBuilder() {
                if (this.speedDistanceAlgorithmInputsBuilder_ == null) {
                    this.speedDistanceAlgorithmInputsBuilder_ = new SingleFieldBuilderV3<>(getSpeedDistanceAlgorithmInputs(), getParentForChildren(), isClean());
                    this.speedDistanceAlgorithmInputs_ = null;
                }
                return this.speedDistanceAlgorithmInputsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSpeedDistanceAlgorithmInputsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlgorithmInputNotification build() {
                AlgorithmInputNotification algorithmInputNotificationBuildPartial = buildPartial();
                if (algorithmInputNotificationBuildPartial.isInitialized()) {
                    return algorithmInputNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) algorithmInputNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlgorithmInputNotification buildPartial() {
                AlgorithmInputNotification algorithmInputNotification = new AlgorithmInputNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(algorithmInputNotification);
                }
                onBuilt();
                return algorithmInputNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.horizontalSpeed1256ThsMs_ = 0;
                this.speedDistanceAlgorithmInputs_ = null;
                SingleFieldBuilderV3<SpeedDistanceAlgorithmInputs, SpeedDistanceAlgorithmInputs.Builder, SpeedDistanceAlgorithmInputsOrBuilder> singleFieldBuilderV3 = this.speedDistanceAlgorithmInputsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.speedDistanceAlgorithmInputsBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHorizontalSpeed1256ThsMs() {
                this.bitField0_ &= -2;
                this.horizontalSpeed1256ThsMs_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSpeedDistanceAlgorithmInputs() {
                this.bitField0_ &= -3;
                this.speedDistanceAlgorithmInputs_ = null;
                SingleFieldBuilderV3<SpeedDistanceAlgorithmInputs, SpeedDistanceAlgorithmInputs.Builder, SpeedDistanceAlgorithmInputsOrBuilder> singleFieldBuilderV3 = this.speedDistanceAlgorithmInputsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.speedDistanceAlgorithmInputsBuilder_ = null;
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
                return GDIRunning.internal_static_GDI_Proto_Running_AlgorithmInputNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRunning.AlgorithmInputNotificationOrBuilder
            public int getHorizontalSpeed1256ThsMs() {
                return this.horizontalSpeed1256ThsMs_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.AlgorithmInputNotificationOrBuilder
            public SpeedDistanceAlgorithmInputs getSpeedDistanceAlgorithmInputs() {
                SingleFieldBuilderV3<SpeedDistanceAlgorithmInputs, SpeedDistanceAlgorithmInputs.Builder, SpeedDistanceAlgorithmInputsOrBuilder> singleFieldBuilderV3 = this.speedDistanceAlgorithmInputsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SpeedDistanceAlgorithmInputs) singleFieldBuilderV3.getMessage();
                }
                SpeedDistanceAlgorithmInputs speedDistanceAlgorithmInputs = this.speedDistanceAlgorithmInputs_;
                return speedDistanceAlgorithmInputs == null ? SpeedDistanceAlgorithmInputs.getDefaultInstance() : speedDistanceAlgorithmInputs;
            }

            public SpeedDistanceAlgorithmInputs.Builder getSpeedDistanceAlgorithmInputsBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SpeedDistanceAlgorithmInputs.Builder) getSpeedDistanceAlgorithmInputsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRunning.AlgorithmInputNotificationOrBuilder
            public SpeedDistanceAlgorithmInputsOrBuilder getSpeedDistanceAlgorithmInputsOrBuilder() {
                SingleFieldBuilderV3<SpeedDistanceAlgorithmInputs, SpeedDistanceAlgorithmInputs.Builder, SpeedDistanceAlgorithmInputsOrBuilder> singleFieldBuilderV3 = this.speedDistanceAlgorithmInputsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SpeedDistanceAlgorithmInputsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SpeedDistanceAlgorithmInputs speedDistanceAlgorithmInputs = this.speedDistanceAlgorithmInputs_;
                return speedDistanceAlgorithmInputs == null ? SpeedDistanceAlgorithmInputs.getDefaultInstance() : speedDistanceAlgorithmInputs;
            }

            @Override // com.garmin.proto.generated.GDIRunning.AlgorithmInputNotificationOrBuilder
            public boolean hasHorizontalSpeed1256ThsMs() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.AlgorithmInputNotificationOrBuilder
            public boolean hasSpeedDistanceAlgorithmInputs() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRunning.internal_static_GDI_Proto_Running_AlgorithmInputNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AlgorithmInputNotification.class, Builder.class);
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
                                    this.horizontalSpeed1256ThsMs_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getSpeedDistanceAlgorithmInputsFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSpeedDistanceAlgorithmInputs(SpeedDistanceAlgorithmInputs speedDistanceAlgorithmInputs) {
                SpeedDistanceAlgorithmInputs speedDistanceAlgorithmInputs2;
                SingleFieldBuilderV3<SpeedDistanceAlgorithmInputs, SpeedDistanceAlgorithmInputs.Builder, SpeedDistanceAlgorithmInputsOrBuilder> singleFieldBuilderV3 = this.speedDistanceAlgorithmInputsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(speedDistanceAlgorithmInputs);
                } else if ((this.bitField0_ & 2) == 0 || (speedDistanceAlgorithmInputs2 = this.speedDistanceAlgorithmInputs_) == null || speedDistanceAlgorithmInputs2 == SpeedDistanceAlgorithmInputs.getDefaultInstance()) {
                    this.speedDistanceAlgorithmInputs_ = speedDistanceAlgorithmInputs;
                } else {
                    getSpeedDistanceAlgorithmInputsBuilder().mergeFrom(speedDistanceAlgorithmInputs);
                }
                if (this.speedDistanceAlgorithmInputs_ != null) {
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

            public Builder setHorizontalSpeed1256ThsMs(int i14) {
                this.horizontalSpeed1256ThsMs_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSpeedDistanceAlgorithmInputs(SpeedDistanceAlgorithmInputs.Builder builder) {
                SingleFieldBuilderV3<SpeedDistanceAlgorithmInputs, SpeedDistanceAlgorithmInputs.Builder, SpeedDistanceAlgorithmInputsOrBuilder> singleFieldBuilderV3 = this.speedDistanceAlgorithmInputsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.speedDistanceAlgorithmInputs_ = builder.build();
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
            public AlgorithmInputNotification getDefaultInstanceForType() {
                return AlgorithmInputNotification.getDefaultInstance();
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

            public Builder setSpeedDistanceAlgorithmInputs(SpeedDistanceAlgorithmInputs speedDistanceAlgorithmInputs) {
                SingleFieldBuilderV3<SpeedDistanceAlgorithmInputs, SpeedDistanceAlgorithmInputs.Builder, SpeedDistanceAlgorithmInputsOrBuilder> singleFieldBuilderV3 = this.speedDistanceAlgorithmInputsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    speedDistanceAlgorithmInputs.getClass();
                    this.speedDistanceAlgorithmInputs_ = speedDistanceAlgorithmInputs;
                } else {
                    singleFieldBuilderV3.setMessage(speedDistanceAlgorithmInputs);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlgorithmInputNotification) {
                    return mergeFrom((AlgorithmInputNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlgorithmInputNotification algorithmInputNotification) {
                if (algorithmInputNotification == AlgorithmInputNotification.getDefaultInstance()) {
                    return this;
                }
                if (algorithmInputNotification.hasHorizontalSpeed1256ThsMs()) {
                    setHorizontalSpeed1256ThsMs(algorithmInputNotification.getHorizontalSpeed1256ThsMs());
                }
                if (algorithmInputNotification.hasSpeedDistanceAlgorithmInputs()) {
                    mergeSpeedDistanceAlgorithmInputs(algorithmInputNotification.getSpeedDistanceAlgorithmInputs());
                }
                mergeUnknownFields(algorithmInputNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlgorithmInputNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AlgorithmInputNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlgorithmInputNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlgorithmInputNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ AlgorithmInputNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static AlgorithmInputNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private AlgorithmInputNotification() {
            this.horizontalSpeed1256ThsMs_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlgorithmInputNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlgorithmInputNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlgorithmInputNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AlgorithmInputNotification parseFrom(InputStream inputStream) {
            return (AlgorithmInputNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AlgorithmInputNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlgorithmInputNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlgorithmInputNotification parseFrom(CodedInputStream codedInputStream) {
            return (AlgorithmInputNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AlgorithmInputNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlgorithmInputNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int DYNAMICS_CAPABILITIES_FIELD_NUMBER = 2;
        public static final int FEATURES_RESPONSE_FIELD_NUMBER = 25;
        public static final int SPEED_DISTANCE_CAPABILITIES_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DynamicsCapabilities dynamicsCapabilities_;
        private byte memoizedIsInitialized;
        private SpeedDistanceCapabilities speedDistanceCapabilities_;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIRunning.CapabilitiesResponse.1
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
            return GDIRunning.internal_static_GDI_Proto_Running_CapabilitiesResponse_descriptor;
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
            if (hasSpeedDistanceCapabilities() != capabilitiesResponse.hasSpeedDistanceCapabilities()) {
                return false;
            }
            if ((!hasSpeedDistanceCapabilities() || getSpeedDistanceCapabilities().equals(capabilitiesResponse.getSpeedDistanceCapabilities())) && hasDynamicsCapabilities() == capabilitiesResponse.hasDynamicsCapabilities()) {
                return (!hasDynamicsCapabilities() || getDynamicsCapabilities().equals(capabilitiesResponse.getDynamicsCapabilities())) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRunning.CapabilitiesResponseOrBuilder
        public DynamicsCapabilities getDynamicsCapabilities() {
            DynamicsCapabilities dynamicsCapabilities = this.dynamicsCapabilities_;
            return dynamicsCapabilities == null ? DynamicsCapabilities.getDefaultInstance() : dynamicsCapabilities;
        }

        @Override // com.garmin.proto.generated.GDIRunning.CapabilitiesResponseOrBuilder
        public DynamicsCapabilitiesOrBuilder getDynamicsCapabilitiesOrBuilder() {
            DynamicsCapabilities dynamicsCapabilities = this.dynamicsCapabilities_;
            return dynamicsCapabilities == null ? DynamicsCapabilities.getDefaultInstance() : dynamicsCapabilities;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSpeedDistanceCapabilities()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getDynamicsCapabilities());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRunning.CapabilitiesResponseOrBuilder
        public SpeedDistanceCapabilities getSpeedDistanceCapabilities() {
            SpeedDistanceCapabilities speedDistanceCapabilities = this.speedDistanceCapabilities_;
            return speedDistanceCapabilities == null ? SpeedDistanceCapabilities.getDefaultInstance() : speedDistanceCapabilities;
        }

        @Override // com.garmin.proto.generated.GDIRunning.CapabilitiesResponseOrBuilder
        public SpeedDistanceCapabilitiesOrBuilder getSpeedDistanceCapabilitiesOrBuilder() {
            SpeedDistanceCapabilities speedDistanceCapabilities = this.speedDistanceCapabilities_;
            return speedDistanceCapabilities == null ? SpeedDistanceCapabilities.getDefaultInstance() : speedDistanceCapabilities;
        }

        @Override // com.garmin.proto.generated.GDIRunning.CapabilitiesResponseOrBuilder
        public boolean hasDynamicsCapabilities() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.CapabilitiesResponseOrBuilder
        public boolean hasSpeedDistanceCapabilities() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSpeedDistanceCapabilities()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSpeedDistanceCapabilities().hashCode();
            }
            if (hasDynamicsCapabilities()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDynamicsCapabilities().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRunning.internal_static_GDI_Proto_Running_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getSpeedDistanceCapabilities());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getDynamicsCapabilities());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DynamicsCapabilities, DynamicsCapabilities.Builder, DynamicsCapabilitiesOrBuilder> dynamicsCapabilitiesBuilder_;
            private DynamicsCapabilities dynamicsCapabilities_;
            private SingleFieldBuilderV3<SpeedDistanceCapabilities, SpeedDistanceCapabilities.Builder, SpeedDistanceCapabilitiesOrBuilder> speedDistanceCapabilitiesBuilder_;
            private SpeedDistanceCapabilities speedDistanceCapabilities_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SpeedDistanceCapabilities, SpeedDistanceCapabilities.Builder, SpeedDistanceCapabilitiesOrBuilder> singleFieldBuilderV3 = this.speedDistanceCapabilitiesBuilder_;
                    capabilitiesResponse.speedDistanceCapabilities_ = singleFieldBuilderV3 == null ? this.speedDistanceCapabilities_ : (SpeedDistanceCapabilities) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<DynamicsCapabilities, DynamicsCapabilities.Builder, DynamicsCapabilitiesOrBuilder> singleFieldBuilderV4 = this.dynamicsCapabilitiesBuilder_;
                    capabilitiesResponse.dynamicsCapabilities_ = singleFieldBuilderV4 == null ? this.dynamicsCapabilities_ : (DynamicsCapabilities) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                capabilitiesResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRunning.internal_static_GDI_Proto_Running_CapabilitiesResponse_descriptor;
            }

            private SingleFieldBuilderV3<DynamicsCapabilities, DynamicsCapabilities.Builder, DynamicsCapabilitiesOrBuilder> getDynamicsCapabilitiesFieldBuilder() {
                if (this.dynamicsCapabilitiesBuilder_ == null) {
                    this.dynamicsCapabilitiesBuilder_ = new SingleFieldBuilderV3<>(getDynamicsCapabilities(), getParentForChildren(), isClean());
                    this.dynamicsCapabilities_ = null;
                }
                return this.dynamicsCapabilitiesBuilder_;
            }

            private SingleFieldBuilderV3<SpeedDistanceCapabilities, SpeedDistanceCapabilities.Builder, SpeedDistanceCapabilitiesOrBuilder> getSpeedDistanceCapabilitiesFieldBuilder() {
                if (this.speedDistanceCapabilitiesBuilder_ == null) {
                    this.speedDistanceCapabilitiesBuilder_ = new SingleFieldBuilderV3<>(getSpeedDistanceCapabilities(), getParentForChildren(), isClean());
                    this.speedDistanceCapabilities_ = null;
                }
                return this.speedDistanceCapabilitiesBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSpeedDistanceCapabilitiesFieldBuilder();
                    getDynamicsCapabilitiesFieldBuilder();
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
                this.speedDistanceCapabilities_ = null;
                SingleFieldBuilderV3<SpeedDistanceCapabilities, SpeedDistanceCapabilities.Builder, SpeedDistanceCapabilitiesOrBuilder> singleFieldBuilderV3 = this.speedDistanceCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.speedDistanceCapabilitiesBuilder_ = null;
                }
                this.dynamicsCapabilities_ = null;
                SingleFieldBuilderV3<DynamicsCapabilities, DynamicsCapabilities.Builder, DynamicsCapabilitiesOrBuilder> singleFieldBuilderV4 = this.dynamicsCapabilitiesBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.dynamicsCapabilitiesBuilder_ = null;
                }
                return this;
            }

            public Builder clearDynamicsCapabilities() {
                this.bitField0_ &= -3;
                this.dynamicsCapabilities_ = null;
                SingleFieldBuilderV3<DynamicsCapabilities, DynamicsCapabilities.Builder, DynamicsCapabilitiesOrBuilder> singleFieldBuilderV3 = this.dynamicsCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dynamicsCapabilitiesBuilder_ = null;
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

            public Builder clearSpeedDistanceCapabilities() {
                this.bitField0_ &= -2;
                this.speedDistanceCapabilities_ = null;
                SingleFieldBuilderV3<SpeedDistanceCapabilities, SpeedDistanceCapabilities.Builder, SpeedDistanceCapabilitiesOrBuilder> singleFieldBuilderV3 = this.speedDistanceCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.speedDistanceCapabilitiesBuilder_ = null;
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
                return GDIRunning.internal_static_GDI_Proto_Running_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRunning.CapabilitiesResponseOrBuilder
            public DynamicsCapabilities getDynamicsCapabilities() {
                SingleFieldBuilderV3<DynamicsCapabilities, DynamicsCapabilities.Builder, DynamicsCapabilitiesOrBuilder> singleFieldBuilderV3 = this.dynamicsCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DynamicsCapabilities) singleFieldBuilderV3.getMessage();
                }
                DynamicsCapabilities dynamicsCapabilities = this.dynamicsCapabilities_;
                return dynamicsCapabilities == null ? DynamicsCapabilities.getDefaultInstance() : dynamicsCapabilities;
            }

            public DynamicsCapabilities.Builder getDynamicsCapabilitiesBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DynamicsCapabilities.Builder) getDynamicsCapabilitiesFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRunning.CapabilitiesResponseOrBuilder
            public DynamicsCapabilitiesOrBuilder getDynamicsCapabilitiesOrBuilder() {
                SingleFieldBuilderV3<DynamicsCapabilities, DynamicsCapabilities.Builder, DynamicsCapabilitiesOrBuilder> singleFieldBuilderV3 = this.dynamicsCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DynamicsCapabilitiesOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DynamicsCapabilities dynamicsCapabilities = this.dynamicsCapabilities_;
                return dynamicsCapabilities == null ? DynamicsCapabilities.getDefaultInstance() : dynamicsCapabilities;
            }

            @Override // com.garmin.proto.generated.GDIRunning.CapabilitiesResponseOrBuilder
            public SpeedDistanceCapabilities getSpeedDistanceCapabilities() {
                SingleFieldBuilderV3<SpeedDistanceCapabilities, SpeedDistanceCapabilities.Builder, SpeedDistanceCapabilitiesOrBuilder> singleFieldBuilderV3 = this.speedDistanceCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SpeedDistanceCapabilities) singleFieldBuilderV3.getMessage();
                }
                SpeedDistanceCapabilities speedDistanceCapabilities = this.speedDistanceCapabilities_;
                return speedDistanceCapabilities == null ? SpeedDistanceCapabilities.getDefaultInstance() : speedDistanceCapabilities;
            }

            public SpeedDistanceCapabilities.Builder getSpeedDistanceCapabilitiesBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SpeedDistanceCapabilities.Builder) getSpeedDistanceCapabilitiesFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRunning.CapabilitiesResponseOrBuilder
            public SpeedDistanceCapabilitiesOrBuilder getSpeedDistanceCapabilitiesOrBuilder() {
                SingleFieldBuilderV3<SpeedDistanceCapabilities, SpeedDistanceCapabilities.Builder, SpeedDistanceCapabilitiesOrBuilder> singleFieldBuilderV3 = this.speedDistanceCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SpeedDistanceCapabilitiesOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SpeedDistanceCapabilities speedDistanceCapabilities = this.speedDistanceCapabilities_;
                return speedDistanceCapabilities == null ? SpeedDistanceCapabilities.getDefaultInstance() : speedDistanceCapabilities;
            }

            @Override // com.garmin.proto.generated.GDIRunning.CapabilitiesResponseOrBuilder
            public boolean hasDynamicsCapabilities() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.CapabilitiesResponseOrBuilder
            public boolean hasSpeedDistanceCapabilities() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRunning.internal_static_GDI_Proto_Running_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDynamicsCapabilities(DynamicsCapabilities dynamicsCapabilities) {
                DynamicsCapabilities dynamicsCapabilities2;
                SingleFieldBuilderV3<DynamicsCapabilities, DynamicsCapabilities.Builder, DynamicsCapabilitiesOrBuilder> singleFieldBuilderV3 = this.dynamicsCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dynamicsCapabilities);
                } else if ((this.bitField0_ & 2) == 0 || (dynamicsCapabilities2 = this.dynamicsCapabilities_) == null || dynamicsCapabilities2 == DynamicsCapabilities.getDefaultInstance()) {
                    this.dynamicsCapabilities_ = dynamicsCapabilities;
                } else {
                    getDynamicsCapabilitiesBuilder().mergeFrom(dynamicsCapabilities);
                }
                if (this.dynamicsCapabilities_ != null) {
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
                                    codedInputStream.readMessage(getSpeedDistanceCapabilitiesFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getDynamicsCapabilitiesFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSpeedDistanceCapabilities(SpeedDistanceCapabilities speedDistanceCapabilities) {
                SpeedDistanceCapabilities speedDistanceCapabilities2;
                SingleFieldBuilderV3<SpeedDistanceCapabilities, SpeedDistanceCapabilities.Builder, SpeedDistanceCapabilitiesOrBuilder> singleFieldBuilderV3 = this.speedDistanceCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(speedDistanceCapabilities);
                } else if ((this.bitField0_ & 1) == 0 || (speedDistanceCapabilities2 = this.speedDistanceCapabilities_) == null || speedDistanceCapabilities2 == SpeedDistanceCapabilities.getDefaultInstance()) {
                    this.speedDistanceCapabilities_ = speedDistanceCapabilities;
                } else {
                    getSpeedDistanceCapabilitiesBuilder().mergeFrom(speedDistanceCapabilities);
                }
                if (this.speedDistanceCapabilities_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setDynamicsCapabilities(DynamicsCapabilities.Builder builder) {
                SingleFieldBuilderV3<DynamicsCapabilities, DynamicsCapabilities.Builder, DynamicsCapabilitiesOrBuilder> singleFieldBuilderV3 = this.dynamicsCapabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.dynamicsCapabilities_ = builder.build();
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

            public Builder setSpeedDistanceCapabilities(SpeedDistanceCapabilities.Builder builder) {
                SingleFieldBuilderV3<SpeedDistanceCapabilities, SpeedDistanceCapabilities.Builder, SpeedDistanceCapabilitiesOrBuilder> singleFieldBuilderV3 = this.speedDistanceCapabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.speedDistanceCapabilities_ = builder.build();
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

            public Builder setDynamicsCapabilities(DynamicsCapabilities dynamicsCapabilities) {
                SingleFieldBuilderV3<DynamicsCapabilities, DynamicsCapabilities.Builder, DynamicsCapabilitiesOrBuilder> singleFieldBuilderV3 = this.dynamicsCapabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dynamicsCapabilities.getClass();
                    this.dynamicsCapabilities_ = dynamicsCapabilities;
                } else {
                    singleFieldBuilderV3.setMessage(dynamicsCapabilities);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSpeedDistanceCapabilities(SpeedDistanceCapabilities speedDistanceCapabilities) {
                SingleFieldBuilderV3<SpeedDistanceCapabilities, SpeedDistanceCapabilities.Builder, SpeedDistanceCapabilitiesOrBuilder> singleFieldBuilderV3 = this.speedDistanceCapabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    speedDistanceCapabilities.getClass();
                    this.speedDistanceCapabilities_ = speedDistanceCapabilities;
                } else {
                    singleFieldBuilderV3.setMessage(speedDistanceCapabilities);
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
                if (capabilitiesResponse.hasSpeedDistanceCapabilities()) {
                    mergeSpeedDistanceCapabilities(capabilitiesResponse.getSpeedDistanceCapabilities());
                }
                if (capabilitiesResponse.hasDynamicsCapabilities()) {
                    mergeDynamicsCapabilities(capabilitiesResponse.getDynamicsCapabilities());
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

    public static final class ConfigurationNotification extends GeneratedMessageV3 implements ConfigurationNotificationOrBuilder {
        private static final ConfigurationNotification DEFAULT_INSTANCE = new ConfigurationNotification();

        @Deprecated
        public static final Parser<ConfigurationNotification> PARSER = new AbstractParser<ConfigurationNotification>() { // from class: com.garmin.proto.generated.GDIRunning.ConfigurationNotification.1
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
        public static final int SPEED_DISTANCE_CONFIG_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SpeedDistanceConfigurationFields speedDistanceConfig_;

        private ConfigurationNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigurationNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRunning.internal_static_GDI_Proto_Running_ConfigurationNotification_descriptor;
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
            if (hasSpeedDistanceConfig() != configurationNotification.hasSpeedDistanceConfig()) {
                return false;
            }
            return (!hasSpeedDistanceConfig() || getSpeedDistanceConfig().equals(configurationNotification.getSpeedDistanceConfig())) && getUnknownFields().equals(configurationNotification.getUnknownFields());
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSpeedDistanceConfig()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ConfigurationNotificationOrBuilder
        public SpeedDistanceConfigurationFields getSpeedDistanceConfig() {
            SpeedDistanceConfigurationFields speedDistanceConfigurationFields = this.speedDistanceConfig_;
            return speedDistanceConfigurationFields == null ? SpeedDistanceConfigurationFields.getDefaultInstance() : speedDistanceConfigurationFields;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ConfigurationNotificationOrBuilder
        public SpeedDistanceConfigurationFieldsOrBuilder getSpeedDistanceConfigOrBuilder() {
            SpeedDistanceConfigurationFields speedDistanceConfigurationFields = this.speedDistanceConfig_;
            return speedDistanceConfigurationFields == null ? SpeedDistanceConfigurationFields.getDefaultInstance() : speedDistanceConfigurationFields;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ConfigurationNotificationOrBuilder
        public boolean hasSpeedDistanceConfig() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSpeedDistanceConfig()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSpeedDistanceConfig().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRunning.internal_static_GDI_Proto_Running_ConfigurationNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationNotification.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getSpeedDistanceConfig());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigurationNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> speedDistanceConfigBuilder_;
            private SpeedDistanceConfigurationFields speedDistanceConfig_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConfigurationNotification configurationNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                    configurationNotification.speedDistanceConfig_ = singleFieldBuilderV3 == null ? this.speedDistanceConfig_ : (SpeedDistanceConfigurationFields) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                configurationNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRunning.internal_static_GDI_Proto_Running_ConfigurationNotification_descriptor;
            }

            private SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> getSpeedDistanceConfigFieldBuilder() {
                if (this.speedDistanceConfigBuilder_ == null) {
                    this.speedDistanceConfigBuilder_ = new SingleFieldBuilderV3<>(getSpeedDistanceConfig(), getParentForChildren(), isClean());
                    this.speedDistanceConfig_ = null;
                }
                return this.speedDistanceConfigBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSpeedDistanceConfigFieldBuilder();
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
                this.speedDistanceConfig_ = null;
                SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.speedDistanceConfigBuilder_ = null;
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

            public Builder clearSpeedDistanceConfig() {
                this.bitField0_ &= -2;
                this.speedDistanceConfig_ = null;
                SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.speedDistanceConfigBuilder_ = null;
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
                return GDIRunning.internal_static_GDI_Proto_Running_ConfigurationNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRunning.ConfigurationNotificationOrBuilder
            public SpeedDistanceConfigurationFields getSpeedDistanceConfig() {
                SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SpeedDistanceConfigurationFields) singleFieldBuilderV3.getMessage();
                }
                SpeedDistanceConfigurationFields speedDistanceConfigurationFields = this.speedDistanceConfig_;
                return speedDistanceConfigurationFields == null ? SpeedDistanceConfigurationFields.getDefaultInstance() : speedDistanceConfigurationFields;
            }

            public SpeedDistanceConfigurationFields.Builder getSpeedDistanceConfigBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SpeedDistanceConfigurationFields.Builder) getSpeedDistanceConfigFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRunning.ConfigurationNotificationOrBuilder
            public SpeedDistanceConfigurationFieldsOrBuilder getSpeedDistanceConfigOrBuilder() {
                SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SpeedDistanceConfigurationFieldsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SpeedDistanceConfigurationFields speedDistanceConfigurationFields = this.speedDistanceConfig_;
                return speedDistanceConfigurationFields == null ? SpeedDistanceConfigurationFields.getDefaultInstance() : speedDistanceConfigurationFields;
            }

            @Override // com.garmin.proto.generated.GDIRunning.ConfigurationNotificationOrBuilder
            public boolean hasSpeedDistanceConfig() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRunning.internal_static_GDI_Proto_Running_ConfigurationNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationNotification.class, Builder.class);
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
                                    codedInputStream.readMessage(getSpeedDistanceConfigFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSpeedDistanceConfig(SpeedDistanceConfigurationFields speedDistanceConfigurationFields) {
                SpeedDistanceConfigurationFields speedDistanceConfigurationFields2;
                SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(speedDistanceConfigurationFields);
                } else if ((this.bitField0_ & 1) == 0 || (speedDistanceConfigurationFields2 = this.speedDistanceConfig_) == null || speedDistanceConfigurationFields2 == SpeedDistanceConfigurationFields.getDefaultInstance()) {
                    this.speedDistanceConfig_ = speedDistanceConfigurationFields;
                } else {
                    getSpeedDistanceConfigBuilder().mergeFrom(speedDistanceConfigurationFields);
                }
                if (this.speedDistanceConfig_ != null) {
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

            public Builder setSpeedDistanceConfig(SpeedDistanceConfigurationFields.Builder builder) {
                SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.speedDistanceConfig_ = builder.build();
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

            public Builder setSpeedDistanceConfig(SpeedDistanceConfigurationFields speedDistanceConfigurationFields) {
                SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                if (singleFieldBuilderV3 == null) {
                    speedDistanceConfigurationFields.getClass();
                    this.speedDistanceConfig_ = speedDistanceConfigurationFields;
                } else {
                    singleFieldBuilderV3.setMessage(speedDistanceConfigurationFields);
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
                if (configurationNotification.hasSpeedDistanceConfig()) {
                    mergeSpeedDistanceConfig(configurationNotification.getSpeedDistanceConfig());
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
        private static final ConfigurationRequest DEFAULT_INSTANCE = new ConfigurationRequest();

        @Deprecated
        public static final Parser<ConfigurationRequest> PARSER = new AbstractParser<ConfigurationRequest>() { // from class: com.garmin.proto.generated.GDIRunning.ConfigurationRequest.1
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
        public static final int SPEED_DISTANCE_CONFIG_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SpeedDistanceConfigurationFields speedDistanceConfig_;

        private ConfigurationRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigurationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRunning.internal_static_GDI_Proto_Running_ConfigurationRequest_descriptor;
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
            if (hasSpeedDistanceConfig() != configurationRequest.hasSpeedDistanceConfig()) {
                return false;
            }
            return (!hasSpeedDistanceConfig() || getSpeedDistanceConfig().equals(configurationRequest.getSpeedDistanceConfig())) && getUnknownFields().equals(configurationRequest.getUnknownFields());
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSpeedDistanceConfig()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ConfigurationRequestOrBuilder
        public SpeedDistanceConfigurationFields getSpeedDistanceConfig() {
            SpeedDistanceConfigurationFields speedDistanceConfigurationFields = this.speedDistanceConfig_;
            return speedDistanceConfigurationFields == null ? SpeedDistanceConfigurationFields.getDefaultInstance() : speedDistanceConfigurationFields;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ConfigurationRequestOrBuilder
        public SpeedDistanceConfigurationFieldsOrBuilder getSpeedDistanceConfigOrBuilder() {
            SpeedDistanceConfigurationFields speedDistanceConfigurationFields = this.speedDistanceConfig_;
            return speedDistanceConfigurationFields == null ? SpeedDistanceConfigurationFields.getDefaultInstance() : speedDistanceConfigurationFields;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ConfigurationRequestOrBuilder
        public boolean hasSpeedDistanceConfig() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSpeedDistanceConfig()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSpeedDistanceConfig().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRunning.internal_static_GDI_Proto_Running_ConfigurationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationRequest.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getSpeedDistanceConfig());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigurationRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> speedDistanceConfigBuilder_;
            private SpeedDistanceConfigurationFields speedDistanceConfig_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConfigurationRequest configurationRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                    configurationRequest.speedDistanceConfig_ = singleFieldBuilderV3 == null ? this.speedDistanceConfig_ : (SpeedDistanceConfigurationFields) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                configurationRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRunning.internal_static_GDI_Proto_Running_ConfigurationRequest_descriptor;
            }

            private SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> getSpeedDistanceConfigFieldBuilder() {
                if (this.speedDistanceConfigBuilder_ == null) {
                    this.speedDistanceConfigBuilder_ = new SingleFieldBuilderV3<>(getSpeedDistanceConfig(), getParentForChildren(), isClean());
                    this.speedDistanceConfig_ = null;
                }
                return this.speedDistanceConfigBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSpeedDistanceConfigFieldBuilder();
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
                this.speedDistanceConfig_ = null;
                SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.speedDistanceConfigBuilder_ = null;
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

            public Builder clearSpeedDistanceConfig() {
                this.bitField0_ &= -2;
                this.speedDistanceConfig_ = null;
                SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.speedDistanceConfigBuilder_ = null;
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
                return GDIRunning.internal_static_GDI_Proto_Running_ConfigurationRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRunning.ConfigurationRequestOrBuilder
            public SpeedDistanceConfigurationFields getSpeedDistanceConfig() {
                SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SpeedDistanceConfigurationFields) singleFieldBuilderV3.getMessage();
                }
                SpeedDistanceConfigurationFields speedDistanceConfigurationFields = this.speedDistanceConfig_;
                return speedDistanceConfigurationFields == null ? SpeedDistanceConfigurationFields.getDefaultInstance() : speedDistanceConfigurationFields;
            }

            public SpeedDistanceConfigurationFields.Builder getSpeedDistanceConfigBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SpeedDistanceConfigurationFields.Builder) getSpeedDistanceConfigFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRunning.ConfigurationRequestOrBuilder
            public SpeedDistanceConfigurationFieldsOrBuilder getSpeedDistanceConfigOrBuilder() {
                SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SpeedDistanceConfigurationFieldsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SpeedDistanceConfigurationFields speedDistanceConfigurationFields = this.speedDistanceConfig_;
                return speedDistanceConfigurationFields == null ? SpeedDistanceConfigurationFields.getDefaultInstance() : speedDistanceConfigurationFields;
            }

            @Override // com.garmin.proto.generated.GDIRunning.ConfigurationRequestOrBuilder
            public boolean hasSpeedDistanceConfig() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRunning.internal_static_GDI_Proto_Running_ConfigurationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationRequest.class, Builder.class);
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
                                    codedInputStream.readMessage(getSpeedDistanceConfigFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSpeedDistanceConfig(SpeedDistanceConfigurationFields speedDistanceConfigurationFields) {
                SpeedDistanceConfigurationFields speedDistanceConfigurationFields2;
                SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(speedDistanceConfigurationFields);
                } else if ((this.bitField0_ & 1) == 0 || (speedDistanceConfigurationFields2 = this.speedDistanceConfig_) == null || speedDistanceConfigurationFields2 == SpeedDistanceConfigurationFields.getDefaultInstance()) {
                    this.speedDistanceConfig_ = speedDistanceConfigurationFields;
                } else {
                    getSpeedDistanceConfigBuilder().mergeFrom(speedDistanceConfigurationFields);
                }
                if (this.speedDistanceConfig_ != null) {
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

            public Builder setSpeedDistanceConfig(SpeedDistanceConfigurationFields.Builder builder) {
                SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.speedDistanceConfig_ = builder.build();
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

            public Builder setSpeedDistanceConfig(SpeedDistanceConfigurationFields speedDistanceConfigurationFields) {
                SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                if (singleFieldBuilderV3 == null) {
                    speedDistanceConfigurationFields.getClass();
                    this.speedDistanceConfig_ = speedDistanceConfigurationFields;
                } else {
                    singleFieldBuilderV3.setMessage(speedDistanceConfigurationFields);
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
                if (configurationRequest.hasSpeedDistanceConfig()) {
                    mergeSpeedDistanceConfig(configurationRequest.getSpeedDistanceConfig());
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
        private static final ConfigurationResponse DEFAULT_INSTANCE = new ConfigurationResponse();

        @Deprecated
        public static final Parser<ConfigurationResponse> PARSER = new AbstractParser<ConfigurationResponse>() { // from class: com.garmin.proto.generated.GDIRunning.ConfigurationResponse.1
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
        public static final int SPEED_DISTANCE_CONFIG_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SpeedDistanceConfigurationFields speedDistanceConfig_;

        private ConfigurationResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigurationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRunning.internal_static_GDI_Proto_Running_ConfigurationResponse_descriptor;
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
            if (hasSpeedDistanceConfig() != configurationResponse.hasSpeedDistanceConfig()) {
                return false;
            }
            return (!hasSpeedDistanceConfig() || getSpeedDistanceConfig().equals(configurationResponse.getSpeedDistanceConfig())) && getUnknownFields().equals(configurationResponse.getUnknownFields());
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSpeedDistanceConfig()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ConfigurationResponseOrBuilder
        public SpeedDistanceConfigurationFields getSpeedDistanceConfig() {
            SpeedDistanceConfigurationFields speedDistanceConfigurationFields = this.speedDistanceConfig_;
            return speedDistanceConfigurationFields == null ? SpeedDistanceConfigurationFields.getDefaultInstance() : speedDistanceConfigurationFields;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ConfigurationResponseOrBuilder
        public SpeedDistanceConfigurationFieldsOrBuilder getSpeedDistanceConfigOrBuilder() {
            SpeedDistanceConfigurationFields speedDistanceConfigurationFields = this.speedDistanceConfig_;
            return speedDistanceConfigurationFields == null ? SpeedDistanceConfigurationFields.getDefaultInstance() : speedDistanceConfigurationFields;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ConfigurationResponseOrBuilder
        public boolean hasSpeedDistanceConfig() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSpeedDistanceConfig()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSpeedDistanceConfig().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRunning.internal_static_GDI_Proto_Running_ConfigurationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationResponse.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getSpeedDistanceConfig());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigurationResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> speedDistanceConfigBuilder_;
            private SpeedDistanceConfigurationFields speedDistanceConfig_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConfigurationResponse configurationResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                    configurationResponse.speedDistanceConfig_ = singleFieldBuilderV3 == null ? this.speedDistanceConfig_ : (SpeedDistanceConfigurationFields) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                configurationResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRunning.internal_static_GDI_Proto_Running_ConfigurationResponse_descriptor;
            }

            private SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> getSpeedDistanceConfigFieldBuilder() {
                if (this.speedDistanceConfigBuilder_ == null) {
                    this.speedDistanceConfigBuilder_ = new SingleFieldBuilderV3<>(getSpeedDistanceConfig(), getParentForChildren(), isClean());
                    this.speedDistanceConfig_ = null;
                }
                return this.speedDistanceConfigBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSpeedDistanceConfigFieldBuilder();
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
                this.speedDistanceConfig_ = null;
                SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.speedDistanceConfigBuilder_ = null;
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

            public Builder clearSpeedDistanceConfig() {
                this.bitField0_ &= -2;
                this.speedDistanceConfig_ = null;
                SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.speedDistanceConfigBuilder_ = null;
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
                return GDIRunning.internal_static_GDI_Proto_Running_ConfigurationResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRunning.ConfigurationResponseOrBuilder
            public SpeedDistanceConfigurationFields getSpeedDistanceConfig() {
                SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SpeedDistanceConfigurationFields) singleFieldBuilderV3.getMessage();
                }
                SpeedDistanceConfigurationFields speedDistanceConfigurationFields = this.speedDistanceConfig_;
                return speedDistanceConfigurationFields == null ? SpeedDistanceConfigurationFields.getDefaultInstance() : speedDistanceConfigurationFields;
            }

            public SpeedDistanceConfigurationFields.Builder getSpeedDistanceConfigBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SpeedDistanceConfigurationFields.Builder) getSpeedDistanceConfigFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRunning.ConfigurationResponseOrBuilder
            public SpeedDistanceConfigurationFieldsOrBuilder getSpeedDistanceConfigOrBuilder() {
                SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SpeedDistanceConfigurationFieldsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SpeedDistanceConfigurationFields speedDistanceConfigurationFields = this.speedDistanceConfig_;
                return speedDistanceConfigurationFields == null ? SpeedDistanceConfigurationFields.getDefaultInstance() : speedDistanceConfigurationFields;
            }

            @Override // com.garmin.proto.generated.GDIRunning.ConfigurationResponseOrBuilder
            public boolean hasSpeedDistanceConfig() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRunning.internal_static_GDI_Proto_Running_ConfigurationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationResponse.class, Builder.class);
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
                                    codedInputStream.readMessage(getSpeedDistanceConfigFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSpeedDistanceConfig(SpeedDistanceConfigurationFields speedDistanceConfigurationFields) {
                SpeedDistanceConfigurationFields speedDistanceConfigurationFields2;
                SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(speedDistanceConfigurationFields);
                } else if ((this.bitField0_ & 1) == 0 || (speedDistanceConfigurationFields2 = this.speedDistanceConfig_) == null || speedDistanceConfigurationFields2 == SpeedDistanceConfigurationFields.getDefaultInstance()) {
                    this.speedDistanceConfig_ = speedDistanceConfigurationFields;
                } else {
                    getSpeedDistanceConfigBuilder().mergeFrom(speedDistanceConfigurationFields);
                }
                if (this.speedDistanceConfig_ != null) {
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

            public Builder setSpeedDistanceConfig(SpeedDistanceConfigurationFields.Builder builder) {
                SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.speedDistanceConfig_ = builder.build();
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
                maybeForceBuilderInitialization();
            }

            public Builder setSpeedDistanceConfig(SpeedDistanceConfigurationFields speedDistanceConfigurationFields) {
                SingleFieldBuilderV3<SpeedDistanceConfigurationFields, SpeedDistanceConfigurationFields.Builder, SpeedDistanceConfigurationFieldsOrBuilder> singleFieldBuilderV3 = this.speedDistanceConfigBuilder_;
                if (singleFieldBuilderV3 == null) {
                    speedDistanceConfigurationFields.getClass();
                    this.speedDistanceConfig_ = speedDistanceConfigurationFields;
                } else {
                    singleFieldBuilderV3.setMessage(speedDistanceConfigurationFields);
                }
                this.bitField0_ |= 1;
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
                if (configurationResponse.hasSpeedDistanceConfig()) {
                    mergeSpeedDistanceConfig(configurationResponse.getSpeedDistanceConfig());
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

        public /* synthetic */ ConfigurationResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ConfigurationResponse() {
            this.memoizedIsInitialized = (byte) -1;
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

        public static ConfigurationResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
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
    }

    public static final class Dynamics extends GeneratedMessageV3 implements DynamicsOrBuilder {
        public static final int CADENCE_1_32_STRIDES_PER_MIN_FIELD_NUMBER = 8;
        public static final int GROUND_CONTACT_BALANCE_1_32THS_PERCENT_FIELD_NUMBER = 4;
        public static final int GROUND_CONTACT_TIME_MS_FIELD_NUMBER = 2;
        public static final int IS_MODULE_RIGHT_SIDE_UP_FIELD_NUMBER = 7;
        public static final int IS_WALKING_FIELD_NUMBER = 10;
        public static final int STANCE_TIME_1_4THS_PERCENT_FIELD_NUMBER = 3;
        public static final int STEP_COUNT_FIELD_NUMBER = 9;
        public static final int STEP_LENGTH_MM_FIELD_NUMBER = 6;
        public static final int STEP_SPEED_LOSS_DATA_FIELD_NUMBER = 11;
        public static final int VERTICAL_OSCILLATION_1_4THS_MM_FIELD_NUMBER = 1;
        public static final int VERTICAL_RATIO_1_32THS_PERCENT_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int cadence132StridesPerMin_;
        private int groundContactBalance132ThsPercent_;
        private int groundContactTimeMs_;
        private boolean isModuleRightSideUp_;
        private boolean isWalking_;
        private byte memoizedIsInitialized;
        private int stanceTime14ThsPercent_;
        private int stepCount_;
        private int stepLengthMm_;
        private StepSpeedLoss stepSpeedLossData_;
        private int verticalOscillation14ThsMm_;
        private int verticalRatio132ThsPercent_;
        private static final Dynamics DEFAULT_INSTANCE = new Dynamics();

        @Deprecated
        public static final Parser<Dynamics> PARSER = new AbstractParser<Dynamics>() { // from class: com.garmin.proto.generated.GDIRunning.Dynamics.1
            @Override // com.google.protobuf.Parser
            public Dynamics parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Dynamics.newBuilder();
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

        private Dynamics(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.verticalOscillation14ThsMm_ = 0;
            this.groundContactTimeMs_ = 0;
            this.stanceTime14ThsPercent_ = 0;
            this.groundContactBalance132ThsPercent_ = 0;
            this.verticalRatio132ThsPercent_ = 0;
            this.stepLengthMm_ = 0;
            this.isModuleRightSideUp_ = false;
            this.cadence132StridesPerMin_ = 0;
            this.stepCount_ = 0;
            this.isWalking_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Dynamics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRunning.internal_static_GDI_Proto_Running_Dynamics_descriptor;
        }

        public static Builder newBuilder(Dynamics dynamics) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dynamics);
        }

        public static Dynamics parseDelimitedFrom(InputStream inputStream) {
            return (Dynamics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Dynamics parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Dynamics> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Dynamics)) {
                return super.equals(obj);
            }
            Dynamics dynamics = (Dynamics) obj;
            if (hasVerticalOscillation14ThsMm() != dynamics.hasVerticalOscillation14ThsMm()) {
                return false;
            }
            if ((hasVerticalOscillation14ThsMm() && getVerticalOscillation14ThsMm() != dynamics.getVerticalOscillation14ThsMm()) || hasGroundContactTimeMs() != dynamics.hasGroundContactTimeMs()) {
                return false;
            }
            if ((hasGroundContactTimeMs() && getGroundContactTimeMs() != dynamics.getGroundContactTimeMs()) || hasStanceTime14ThsPercent() != dynamics.hasStanceTime14ThsPercent()) {
                return false;
            }
            if ((hasStanceTime14ThsPercent() && getStanceTime14ThsPercent() != dynamics.getStanceTime14ThsPercent()) || hasGroundContactBalance132ThsPercent() != dynamics.hasGroundContactBalance132ThsPercent()) {
                return false;
            }
            if ((hasGroundContactBalance132ThsPercent() && getGroundContactBalance132ThsPercent() != dynamics.getGroundContactBalance132ThsPercent()) || hasVerticalRatio132ThsPercent() != dynamics.hasVerticalRatio132ThsPercent()) {
                return false;
            }
            if ((hasVerticalRatio132ThsPercent() && getVerticalRatio132ThsPercent() != dynamics.getVerticalRatio132ThsPercent()) || hasStepLengthMm() != dynamics.hasStepLengthMm()) {
                return false;
            }
            if ((hasStepLengthMm() && getStepLengthMm() != dynamics.getStepLengthMm()) || hasIsModuleRightSideUp() != dynamics.hasIsModuleRightSideUp()) {
                return false;
            }
            if ((hasIsModuleRightSideUp() && getIsModuleRightSideUp() != dynamics.getIsModuleRightSideUp()) || hasCadence132StridesPerMin() != dynamics.hasCadence132StridesPerMin()) {
                return false;
            }
            if ((hasCadence132StridesPerMin() && getCadence132StridesPerMin() != dynamics.getCadence132StridesPerMin()) || hasStepCount() != dynamics.hasStepCount()) {
                return false;
            }
            if ((hasStepCount() && getStepCount() != dynamics.getStepCount()) || hasIsWalking() != dynamics.hasIsWalking()) {
                return false;
            }
            if ((!hasIsWalking() || getIsWalking() == dynamics.getIsWalking()) && hasStepSpeedLossData() == dynamics.hasStepSpeedLossData()) {
                return (!hasStepSpeedLossData() || getStepSpeedLossData().equals(dynamics.getStepSpeedLossData())) && getUnknownFields().equals(dynamics.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public int getCadence132StridesPerMin() {
            return this.cadence132StridesPerMin_;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public int getGroundContactBalance132ThsPercent() {
            return this.groundContactBalance132ThsPercent_;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public int getGroundContactTimeMs() {
            return this.groundContactTimeMs_;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public boolean getIsModuleRightSideUp() {
            return this.isModuleRightSideUp_;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public boolean getIsWalking() {
            return this.isWalking_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Dynamics> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.verticalOscillation14ThsMm_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.groundContactTimeMs_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.stanceTime14ThsPercent_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.groundContactBalance132ThsPercent_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.verticalRatio132ThsPercent_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(6, this.stepLengthMm_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(7, this.isModuleRightSideUp_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(8, this.cadence132StridesPerMin_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(9, this.stepCount_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(10, this.isWalking_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(11, getStepSpeedLossData());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public int getStanceTime14ThsPercent() {
            return this.stanceTime14ThsPercent_;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public int getStepCount() {
            return this.stepCount_;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public int getStepLengthMm() {
            return this.stepLengthMm_;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public StepSpeedLoss getStepSpeedLossData() {
            StepSpeedLoss stepSpeedLoss = this.stepSpeedLossData_;
            return stepSpeedLoss == null ? StepSpeedLoss.getDefaultInstance() : stepSpeedLoss;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public StepSpeedLossOrBuilder getStepSpeedLossDataOrBuilder() {
            StepSpeedLoss stepSpeedLoss = this.stepSpeedLossData_;
            return stepSpeedLoss == null ? StepSpeedLoss.getDefaultInstance() : stepSpeedLoss;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public int getVerticalOscillation14ThsMm() {
            return this.verticalOscillation14ThsMm_;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public int getVerticalRatio132ThsPercent() {
            return this.verticalRatio132ThsPercent_;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public boolean hasCadence132StridesPerMin() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public boolean hasGroundContactBalance132ThsPercent() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public boolean hasGroundContactTimeMs() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public boolean hasIsModuleRightSideUp() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public boolean hasIsWalking() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public boolean hasStanceTime14ThsPercent() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public boolean hasStepCount() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public boolean hasStepLengthMm() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public boolean hasStepSpeedLossData() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public boolean hasVerticalOscillation14ThsMm() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
        public boolean hasVerticalRatio132ThsPercent() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasVerticalOscillation14ThsMm()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getVerticalOscillation14ThsMm();
            }
            if (hasGroundContactTimeMs()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getGroundContactTimeMs();
            }
            if (hasStanceTime14ThsPercent()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getStanceTime14ThsPercent();
            }
            if (hasGroundContactBalance132ThsPercent()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getGroundContactBalance132ThsPercent();
            }
            if (hasVerticalRatio132ThsPercent()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getVerticalRatio132ThsPercent();
            }
            if (hasStepLengthMm()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getStepLengthMm();
            }
            if (hasIsModuleRightSideUp()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + Internal.hashBoolean(getIsModuleRightSideUp());
            }
            if (hasCadence132StridesPerMin()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getCadence132StridesPerMin();
            }
            if (hasStepCount()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getStepCount();
            }
            if (hasIsWalking()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + Internal.hashBoolean(getIsWalking());
            }
            if (hasStepSpeedLossData()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getStepSpeedLossData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRunning.internal_static_GDI_Proto_Running_Dynamics_fieldAccessorTable.ensureFieldAccessorsInitialized(Dynamics.class, Builder.class);
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
            return new Dynamics();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.verticalOscillation14ThsMm_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.groundContactTimeMs_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.stanceTime14ThsPercent_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.groundContactBalance132ThsPercent_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.verticalRatio132ThsPercent_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.stepLengthMm_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeBool(7, this.isModuleRightSideUp_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeUInt32(8, this.cadence132StridesPerMin_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeUInt32(9, this.stepCount_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeBool(10, this.isWalking_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getStepSpeedLossData());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DynamicsOrBuilder {
            private int bitField0_;
            private int cadence132StridesPerMin_;
            private int groundContactBalance132ThsPercent_;
            private int groundContactTimeMs_;
            private boolean isModuleRightSideUp_;
            private boolean isWalking_;
            private int stanceTime14ThsPercent_;
            private int stepCount_;
            private int stepLengthMm_;
            private SingleFieldBuilderV3<StepSpeedLoss, StepSpeedLoss.Builder, StepSpeedLossOrBuilder> stepSpeedLossDataBuilder_;
            private StepSpeedLoss stepSpeedLossData_;
            private int verticalOscillation14ThsMm_;
            private int verticalRatio132ThsPercent_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Dynamics dynamics) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    dynamics.verticalOscillation14ThsMm_ = this.verticalOscillation14ThsMm_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    dynamics.groundContactTimeMs_ = this.groundContactTimeMs_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    dynamics.stanceTime14ThsPercent_ = this.stanceTime14ThsPercent_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    dynamics.groundContactBalance132ThsPercent_ = this.groundContactBalance132ThsPercent_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    dynamics.verticalRatio132ThsPercent_ = this.verticalRatio132ThsPercent_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    dynamics.stepLengthMm_ = this.stepLengthMm_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    dynamics.isModuleRightSideUp_ = this.isModuleRightSideUp_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    dynamics.cadence132StridesPerMin_ = this.cadence132StridesPerMin_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    dynamics.stepCount_ = this.stepCount_;
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    dynamics.isWalking_ = this.isWalking_;
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<StepSpeedLoss, StepSpeedLoss.Builder, StepSpeedLossOrBuilder> singleFieldBuilderV3 = this.stepSpeedLossDataBuilder_;
                    dynamics.stepSpeedLossData_ = singleFieldBuilderV3 == null ? this.stepSpeedLossData_ : (StepSpeedLoss) singleFieldBuilderV3.build();
                    i14 |= 1024;
                }
                dynamics.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRunning.internal_static_GDI_Proto_Running_Dynamics_descriptor;
            }

            private SingleFieldBuilderV3<StepSpeedLoss, StepSpeedLoss.Builder, StepSpeedLossOrBuilder> getStepSpeedLossDataFieldBuilder() {
                if (this.stepSpeedLossDataBuilder_ == null) {
                    this.stepSpeedLossDataBuilder_ = new SingleFieldBuilderV3<>(getStepSpeedLossData(), getParentForChildren(), isClean());
                    this.stepSpeedLossData_ = null;
                }
                return this.stepSpeedLossDataBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getStepSpeedLossDataFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Dynamics build() {
                Dynamics dynamicsBuildPartial = buildPartial();
                if (dynamicsBuildPartial.isInitialized()) {
                    return dynamicsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dynamicsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Dynamics buildPartial() {
                Dynamics dynamics = new Dynamics(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dynamics);
                }
                onBuilt();
                return dynamics;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.verticalOscillation14ThsMm_ = 0;
                this.groundContactTimeMs_ = 0;
                this.stanceTime14ThsPercent_ = 0;
                this.groundContactBalance132ThsPercent_ = 0;
                this.verticalRatio132ThsPercent_ = 0;
                this.stepLengthMm_ = 0;
                this.isModuleRightSideUp_ = false;
                this.cadence132StridesPerMin_ = 0;
                this.stepCount_ = 0;
                this.isWalking_ = false;
                this.stepSpeedLossData_ = null;
                SingleFieldBuilderV3<StepSpeedLoss, StepSpeedLoss.Builder, StepSpeedLossOrBuilder> singleFieldBuilderV3 = this.stepSpeedLossDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stepSpeedLossDataBuilder_ = null;
                }
                return this;
            }

            public Builder clearCadence132StridesPerMin() {
                this.bitField0_ &= -129;
                this.cadence132StridesPerMin_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGroundContactBalance132ThsPercent() {
                this.bitField0_ &= -9;
                this.groundContactBalance132ThsPercent_ = 0;
                onChanged();
                return this;
            }

            public Builder clearGroundContactTimeMs() {
                this.bitField0_ &= -3;
                this.groundContactTimeMs_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIsModuleRightSideUp() {
                this.bitField0_ &= -65;
                this.isModuleRightSideUp_ = false;
                onChanged();
                return this;
            }

            public Builder clearIsWalking() {
                this.bitField0_ &= -513;
                this.isWalking_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStanceTime14ThsPercent() {
                this.bitField0_ &= -5;
                this.stanceTime14ThsPercent_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStepCount() {
                this.bitField0_ &= -257;
                this.stepCount_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStepLengthMm() {
                this.bitField0_ &= -33;
                this.stepLengthMm_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStepSpeedLossData() {
                this.bitField0_ &= -1025;
                this.stepSpeedLossData_ = null;
                SingleFieldBuilderV3<StepSpeedLoss, StepSpeedLoss.Builder, StepSpeedLossOrBuilder> singleFieldBuilderV3 = this.stepSpeedLossDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stepSpeedLossDataBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearVerticalOscillation14ThsMm() {
                this.bitField0_ &= -2;
                this.verticalOscillation14ThsMm_ = 0;
                onChanged();
                return this;
            }

            public Builder clearVerticalRatio132ThsPercent() {
                this.bitField0_ &= -17;
                this.verticalRatio132ThsPercent_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public int getCadence132StridesPerMin() {
                return this.cadence132StridesPerMin_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIRunning.internal_static_GDI_Proto_Running_Dynamics_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public int getGroundContactBalance132ThsPercent() {
                return this.groundContactBalance132ThsPercent_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public int getGroundContactTimeMs() {
                return this.groundContactTimeMs_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public boolean getIsModuleRightSideUp() {
                return this.isModuleRightSideUp_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public boolean getIsWalking() {
                return this.isWalking_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public int getStanceTime14ThsPercent() {
                return this.stanceTime14ThsPercent_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public int getStepCount() {
                return this.stepCount_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public int getStepLengthMm() {
                return this.stepLengthMm_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public StepSpeedLoss getStepSpeedLossData() {
                SingleFieldBuilderV3<StepSpeedLoss, StepSpeedLoss.Builder, StepSpeedLossOrBuilder> singleFieldBuilderV3 = this.stepSpeedLossDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StepSpeedLoss) singleFieldBuilderV3.getMessage();
                }
                StepSpeedLoss stepSpeedLoss = this.stepSpeedLossData_;
                return stepSpeedLoss == null ? StepSpeedLoss.getDefaultInstance() : stepSpeedLoss;
            }

            public StepSpeedLoss.Builder getStepSpeedLossDataBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (StepSpeedLoss.Builder) getStepSpeedLossDataFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public StepSpeedLossOrBuilder getStepSpeedLossDataOrBuilder() {
                SingleFieldBuilderV3<StepSpeedLoss, StepSpeedLoss.Builder, StepSpeedLossOrBuilder> singleFieldBuilderV3 = this.stepSpeedLossDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StepSpeedLossOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StepSpeedLoss stepSpeedLoss = this.stepSpeedLossData_;
                return stepSpeedLoss == null ? StepSpeedLoss.getDefaultInstance() : stepSpeedLoss;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public int getVerticalOscillation14ThsMm() {
                return this.verticalOscillation14ThsMm_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public int getVerticalRatio132ThsPercent() {
                return this.verticalRatio132ThsPercent_;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public boolean hasCadence132StridesPerMin() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public boolean hasGroundContactBalance132ThsPercent() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public boolean hasGroundContactTimeMs() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public boolean hasIsModuleRightSideUp() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public boolean hasIsWalking() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public boolean hasStanceTime14ThsPercent() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public boolean hasStepCount() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public boolean hasStepLengthMm() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public boolean hasStepSpeedLossData() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public boolean hasVerticalOscillation14ThsMm() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.DynamicsOrBuilder
            public boolean hasVerticalRatio132ThsPercent() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRunning.internal_static_GDI_Proto_Running_Dynamics_fieldAccessorTable.ensureFieldAccessorsInitialized(Dynamics.class, Builder.class);
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
                                    this.verticalOscillation14ThsMm_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 16:
                                    this.groundContactTimeMs_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 24:
                                    this.stanceTime14ThsPercent_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 32:
                                    this.groundContactBalance132ThsPercent_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 40:
                                    this.verticalRatio132ThsPercent_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 48:
                                    this.stepLengthMm_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 56:
                                    this.isModuleRightSideUp_ = codedInputStream.readBool();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 64:
                                    this.cadence132StridesPerMin_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 72:
                                    this.stepCount_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 256;
                                    continue;
                                case 80:
                                    this.isWalking_ = codedInputStream.readBool();
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getStepSpeedLossDataFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
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

            public Builder mergeStepSpeedLossData(StepSpeedLoss stepSpeedLoss) {
                StepSpeedLoss stepSpeedLoss2;
                SingleFieldBuilderV3<StepSpeedLoss, StepSpeedLoss.Builder, StepSpeedLossOrBuilder> singleFieldBuilderV3 = this.stepSpeedLossDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stepSpeedLoss);
                } else if ((this.bitField0_ & 1024) == 0 || (stepSpeedLoss2 = this.stepSpeedLossData_) == null || stepSpeedLoss2 == StepSpeedLoss.getDefaultInstance()) {
                    this.stepSpeedLossData_ = stepSpeedLoss;
                } else {
                    getStepSpeedLossDataBuilder().mergeFrom(stepSpeedLoss);
                }
                if (this.stepSpeedLossData_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setCadence132StridesPerMin(int i14) {
                this.cadence132StridesPerMin_ = i14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGroundContactBalance132ThsPercent(int i14) {
                this.groundContactBalance132ThsPercent_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setGroundContactTimeMs(int i14) {
                this.groundContactTimeMs_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setIsModuleRightSideUp(boolean z14) {
                this.isModuleRightSideUp_ = z14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setIsWalking(boolean z14) {
                this.isWalking_ = z14;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStanceTime14ThsPercent(int i14) {
                this.stanceTime14ThsPercent_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setStepCount(int i14) {
                this.stepCount_ = i14;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setStepLengthMm(int i14) {
                this.stepLengthMm_ = i14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setStepSpeedLossData(StepSpeedLoss.Builder builder) {
                SingleFieldBuilderV3<StepSpeedLoss, StepSpeedLoss.Builder, StepSpeedLossOrBuilder> singleFieldBuilderV3 = this.stepSpeedLossDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.stepSpeedLossData_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setVerticalOscillation14ThsMm(int i14) {
                this.verticalOscillation14ThsMm_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setVerticalRatio132ThsPercent(int i14) {
                this.verticalRatio132ThsPercent_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Dynamics getDefaultInstanceForType() {
                return Dynamics.getDefaultInstance();
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

            public Builder setStepSpeedLossData(StepSpeedLoss stepSpeedLoss) {
                SingleFieldBuilderV3<StepSpeedLoss, StepSpeedLoss.Builder, StepSpeedLossOrBuilder> singleFieldBuilderV3 = this.stepSpeedLossDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stepSpeedLoss.getClass();
                    this.stepSpeedLossData_ = stepSpeedLoss;
                } else {
                    singleFieldBuilderV3.setMessage(stepSpeedLoss);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Dynamics) {
                    return mergeFrom((Dynamics) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Dynamics dynamics) {
                if (dynamics == Dynamics.getDefaultInstance()) {
                    return this;
                }
                if (dynamics.hasVerticalOscillation14ThsMm()) {
                    setVerticalOscillation14ThsMm(dynamics.getVerticalOscillation14ThsMm());
                }
                if (dynamics.hasGroundContactTimeMs()) {
                    setGroundContactTimeMs(dynamics.getGroundContactTimeMs());
                }
                if (dynamics.hasStanceTime14ThsPercent()) {
                    setStanceTime14ThsPercent(dynamics.getStanceTime14ThsPercent());
                }
                if (dynamics.hasGroundContactBalance132ThsPercent()) {
                    setGroundContactBalance132ThsPercent(dynamics.getGroundContactBalance132ThsPercent());
                }
                if (dynamics.hasVerticalRatio132ThsPercent()) {
                    setVerticalRatio132ThsPercent(dynamics.getVerticalRatio132ThsPercent());
                }
                if (dynamics.hasStepLengthMm()) {
                    setStepLengthMm(dynamics.getStepLengthMm());
                }
                if (dynamics.hasIsModuleRightSideUp()) {
                    setIsModuleRightSideUp(dynamics.getIsModuleRightSideUp());
                }
                if (dynamics.hasCadence132StridesPerMin()) {
                    setCadence132StridesPerMin(dynamics.getCadence132StridesPerMin());
                }
                if (dynamics.hasStepCount()) {
                    setStepCount(dynamics.getStepCount());
                }
                if (dynamics.hasIsWalking()) {
                    setIsWalking(dynamics.getIsWalking());
                }
                if (dynamics.hasStepSpeedLossData()) {
                    mergeStepSpeedLossData(dynamics.getStepSpeedLossData());
                }
                mergeUnknownFields(dynamics.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Dynamics getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Dynamics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Dynamics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Dynamics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Dynamics parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Dynamics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Dynamics parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Dynamics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Dynamics parseFrom(InputStream inputStream) {
            return (Dynamics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Dynamics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Dynamics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Dynamics parseFrom(CodedInputStream codedInputStream) {
            return (Dynamics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Dynamics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Dynamics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ Dynamics(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private Dynamics() {
            this.verticalOscillation14ThsMm_ = 0;
            this.groundContactTimeMs_ = 0;
            this.stanceTime14ThsPercent_ = 0;
            this.groundContactBalance132ThsPercent_ = 0;
            this.verticalRatio132ThsPercent_ = 0;
            this.stepLengthMm_ = 0;
            this.isModuleRightSideUp_ = false;
            this.cadence132StridesPerMin_ = 0;
            this.stepCount_ = 0;
            this.isWalking_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    public static final class MeasurementNotification extends GeneratedMessageV3 implements MeasurementNotificationOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1014;
        public static final int DYNAMICS_DATA_FIELD_NUMBER = 1;
        public static final int SPEED_DISTANCE_DATA_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Dynamics dynamicsData_;
        private byte memoizedIsInitialized;
        private SpeedDistance speedDistanceData_;
        private static final MeasurementNotification DEFAULT_INSTANCE = new MeasurementNotification();

        @Deprecated
        public static final Parser<MeasurementNotification> PARSER = new AbstractParser<MeasurementNotification>() { // from class: com.garmin.proto.generated.GDIRunning.MeasurementNotification.1
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
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MeasurementNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRunning.internal_static_GDI_Proto_Running_MeasurementNotification_descriptor;
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
            if (hasDynamicsData() != measurementNotification.hasDynamicsData()) {
                return false;
            }
            if ((!hasDynamicsData() || getDynamicsData().equals(measurementNotification.getDynamicsData())) && hasSpeedDistanceData() == measurementNotification.hasSpeedDistanceData()) {
                return (!hasSpeedDistanceData() || getSpeedDistanceData().equals(measurementNotification.getSpeedDistanceData())) && getUnknownFields().equals(measurementNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRunning.MeasurementNotificationOrBuilder
        public Dynamics getDynamicsData() {
            Dynamics dynamics = this.dynamicsData_;
            return dynamics == null ? Dynamics.getDefaultInstance() : dynamics;
        }

        @Override // com.garmin.proto.generated.GDIRunning.MeasurementNotificationOrBuilder
        public DynamicsOrBuilder getDynamicsDataOrBuilder() {
            Dynamics dynamics = this.dynamicsData_;
            return dynamics == null ? Dynamics.getDefaultInstance() : dynamics;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MeasurementNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getDynamicsData()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getSpeedDistanceData());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRunning.MeasurementNotificationOrBuilder
        public SpeedDistance getSpeedDistanceData() {
            SpeedDistance speedDistance = this.speedDistanceData_;
            return speedDistance == null ? SpeedDistance.getDefaultInstance() : speedDistance;
        }

        @Override // com.garmin.proto.generated.GDIRunning.MeasurementNotificationOrBuilder
        public SpeedDistanceOrBuilder getSpeedDistanceDataOrBuilder() {
            SpeedDistance speedDistance = this.speedDistanceData_;
            return speedDistance == null ? SpeedDistance.getDefaultInstance() : speedDistance;
        }

        @Override // com.garmin.proto.generated.GDIRunning.MeasurementNotificationOrBuilder
        public boolean hasDynamicsData() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.MeasurementNotificationOrBuilder
        public boolean hasSpeedDistanceData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDynamicsData()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDynamicsData().hashCode();
            }
            if (hasSpeedDistanceData()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSpeedDistanceData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRunning.internal_static_GDI_Proto_Running_MeasurementNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(MeasurementNotification.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getDynamicsData());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getSpeedDistanceData());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MeasurementNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Dynamics, Dynamics.Builder, DynamicsOrBuilder> dynamicsDataBuilder_;
            private Dynamics dynamicsData_;
            private SingleFieldBuilderV3<SpeedDistance, SpeedDistance.Builder, SpeedDistanceOrBuilder> speedDistanceDataBuilder_;
            private SpeedDistance speedDistanceData_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(MeasurementNotification measurementNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<Dynamics, Dynamics.Builder, DynamicsOrBuilder> singleFieldBuilderV3 = this.dynamicsDataBuilder_;
                    measurementNotification.dynamicsData_ = singleFieldBuilderV3 == null ? this.dynamicsData_ : (Dynamics) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<SpeedDistance, SpeedDistance.Builder, SpeedDistanceOrBuilder> singleFieldBuilderV4 = this.speedDistanceDataBuilder_;
                    measurementNotification.speedDistanceData_ = singleFieldBuilderV4 == null ? this.speedDistanceData_ : (SpeedDistance) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                measurementNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRunning.internal_static_GDI_Proto_Running_MeasurementNotification_descriptor;
            }

            private SingleFieldBuilderV3<Dynamics, Dynamics.Builder, DynamicsOrBuilder> getDynamicsDataFieldBuilder() {
                if (this.dynamicsDataBuilder_ == null) {
                    this.dynamicsDataBuilder_ = new SingleFieldBuilderV3<>(getDynamicsData(), getParentForChildren(), isClean());
                    this.dynamicsData_ = null;
                }
                return this.dynamicsDataBuilder_;
            }

            private SingleFieldBuilderV3<SpeedDistance, SpeedDistance.Builder, SpeedDistanceOrBuilder> getSpeedDistanceDataFieldBuilder() {
                if (this.speedDistanceDataBuilder_ == null) {
                    this.speedDistanceDataBuilder_ = new SingleFieldBuilderV3<>(getSpeedDistanceData(), getParentForChildren(), isClean());
                    this.speedDistanceData_ = null;
                }
                return this.speedDistanceDataBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDynamicsDataFieldBuilder();
                    getSpeedDistanceDataFieldBuilder();
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
                this.dynamicsData_ = null;
                SingleFieldBuilderV3<Dynamics, Dynamics.Builder, DynamicsOrBuilder> singleFieldBuilderV3 = this.dynamicsDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dynamicsDataBuilder_ = null;
                }
                this.speedDistanceData_ = null;
                SingleFieldBuilderV3<SpeedDistance, SpeedDistance.Builder, SpeedDistanceOrBuilder> singleFieldBuilderV4 = this.speedDistanceDataBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.speedDistanceDataBuilder_ = null;
                }
                return this;
            }

            public Builder clearDynamicsData() {
                this.bitField0_ &= -2;
                this.dynamicsData_ = null;
                SingleFieldBuilderV3<Dynamics, Dynamics.Builder, DynamicsOrBuilder> singleFieldBuilderV3 = this.dynamicsDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dynamicsDataBuilder_ = null;
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

            public Builder clearSpeedDistanceData() {
                this.bitField0_ &= -3;
                this.speedDistanceData_ = null;
                SingleFieldBuilderV3<SpeedDistance, SpeedDistance.Builder, SpeedDistanceOrBuilder> singleFieldBuilderV3 = this.speedDistanceDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.speedDistanceDataBuilder_ = null;
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
                return GDIRunning.internal_static_GDI_Proto_Running_MeasurementNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRunning.MeasurementNotificationOrBuilder
            public Dynamics getDynamicsData() {
                SingleFieldBuilderV3<Dynamics, Dynamics.Builder, DynamicsOrBuilder> singleFieldBuilderV3 = this.dynamicsDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Dynamics) singleFieldBuilderV3.getMessage();
                }
                Dynamics dynamics = this.dynamicsData_;
                return dynamics == null ? Dynamics.getDefaultInstance() : dynamics;
            }

            public Dynamics.Builder getDynamicsDataBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Dynamics.Builder) getDynamicsDataFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRunning.MeasurementNotificationOrBuilder
            public DynamicsOrBuilder getDynamicsDataOrBuilder() {
                SingleFieldBuilderV3<Dynamics, Dynamics.Builder, DynamicsOrBuilder> singleFieldBuilderV3 = this.dynamicsDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DynamicsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Dynamics dynamics = this.dynamicsData_;
                return dynamics == null ? Dynamics.getDefaultInstance() : dynamics;
            }

            @Override // com.garmin.proto.generated.GDIRunning.MeasurementNotificationOrBuilder
            public SpeedDistance getSpeedDistanceData() {
                SingleFieldBuilderV3<SpeedDistance, SpeedDistance.Builder, SpeedDistanceOrBuilder> singleFieldBuilderV3 = this.speedDistanceDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SpeedDistance) singleFieldBuilderV3.getMessage();
                }
                SpeedDistance speedDistance = this.speedDistanceData_;
                return speedDistance == null ? SpeedDistance.getDefaultInstance() : speedDistance;
            }

            public SpeedDistance.Builder getSpeedDistanceDataBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SpeedDistance.Builder) getSpeedDistanceDataFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRunning.MeasurementNotificationOrBuilder
            public SpeedDistanceOrBuilder getSpeedDistanceDataOrBuilder() {
                SingleFieldBuilderV3<SpeedDistance, SpeedDistance.Builder, SpeedDistanceOrBuilder> singleFieldBuilderV3 = this.speedDistanceDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SpeedDistanceOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SpeedDistance speedDistance = this.speedDistanceData_;
                return speedDistance == null ? SpeedDistance.getDefaultInstance() : speedDistance;
            }

            @Override // com.garmin.proto.generated.GDIRunning.MeasurementNotificationOrBuilder
            public boolean hasDynamicsData() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.MeasurementNotificationOrBuilder
            public boolean hasSpeedDistanceData() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRunning.internal_static_GDI_Proto_Running_MeasurementNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(MeasurementNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDynamicsData(Dynamics dynamics) {
                Dynamics dynamics2;
                SingleFieldBuilderV3<Dynamics, Dynamics.Builder, DynamicsOrBuilder> singleFieldBuilderV3 = this.dynamicsDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dynamics);
                } else if ((this.bitField0_ & 1) == 0 || (dynamics2 = this.dynamicsData_) == null || dynamics2 == Dynamics.getDefaultInstance()) {
                    this.dynamicsData_ = dynamics;
                } else {
                    getDynamicsDataBuilder().mergeFrom(dynamics);
                }
                if (this.dynamicsData_ != null) {
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
                                    codedInputStream.readMessage(getDynamicsDataFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getSpeedDistanceDataFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSpeedDistanceData(SpeedDistance speedDistance) {
                SpeedDistance speedDistance2;
                SingleFieldBuilderV3<SpeedDistance, SpeedDistance.Builder, SpeedDistanceOrBuilder> singleFieldBuilderV3 = this.speedDistanceDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(speedDistance);
                } else if ((this.bitField0_ & 2) == 0 || (speedDistance2 = this.speedDistanceData_) == null || speedDistance2 == SpeedDistance.getDefaultInstance()) {
                    this.speedDistanceData_ = speedDistance;
                } else {
                    getSpeedDistanceDataBuilder().mergeFrom(speedDistance);
                }
                if (this.speedDistanceData_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setDynamicsData(Dynamics.Builder builder) {
                SingleFieldBuilderV3<Dynamics, Dynamics.Builder, DynamicsOrBuilder> singleFieldBuilderV3 = this.dynamicsDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.dynamicsData_ = builder.build();
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

            public Builder setSpeedDistanceData(SpeedDistance.Builder builder) {
                SingleFieldBuilderV3<SpeedDistance, SpeedDistance.Builder, SpeedDistanceOrBuilder> singleFieldBuilderV3 = this.speedDistanceDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.speedDistanceData_ = builder.build();
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
                maybeForceBuilderInitialization();
            }

            public Builder setDynamicsData(Dynamics dynamics) {
                SingleFieldBuilderV3<Dynamics, Dynamics.Builder, DynamicsOrBuilder> singleFieldBuilderV3 = this.dynamicsDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dynamics.getClass();
                    this.dynamicsData_ = dynamics;
                } else {
                    singleFieldBuilderV3.setMessage(dynamics);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSpeedDistanceData(SpeedDistance speedDistance) {
                SingleFieldBuilderV3<SpeedDistance, SpeedDistance.Builder, SpeedDistanceOrBuilder> singleFieldBuilderV3 = this.speedDistanceDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    speedDistance.getClass();
                    this.speedDistanceData_ = speedDistance;
                } else {
                    singleFieldBuilderV3.setMessage(speedDistance);
                }
                this.bitField0_ |= 2;
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
                if (measurementNotification.hasDynamicsData()) {
                    mergeDynamicsData(measurementNotification.getDynamicsData());
                }
                if (measurementNotification.hasSpeedDistanceData()) {
                    mergeSpeedDistanceData(measurementNotification.getSpeedDistanceData());
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

        public /* synthetic */ MeasurementNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private MeasurementNotification() {
            this.memoizedIsInitialized = (byte) -1;
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
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int CONFIGURATION_NOTIFICATION_FIELD_NUMBER = 3;
        public static final int CONFIGURATION_REQUEST_FIELD_NUMBER = 1;
        public static final int CONFIGURATION_RESPONSE_FIELD_NUMBER = 2;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIRunning.Service.1
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
        public static final int RESET_CALIBRATION_REQUEST_FIELD_NUMBER = 4;
        public static final int RESET_CALIBRATION_RESPONSE_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ConfigurationNotification configurationNotification_;
        private ConfigurationRequest configurationRequest_;
        private ConfigurationResponse configurationResponse_;
        private byte memoizedIsInitialized;
        private ResetSpeedDistanceCalibrationMetricsRequest resetCalibrationRequest_;
        private ResetSpeedDistanceCalibrationMetricsResponse resetCalibrationResponse_;

        private Service(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRunning.internal_static_GDI_Proto_Running_Service_descriptor;
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
            if (hasConfigurationRequest() != service.hasConfigurationRequest()) {
                return false;
            }
            if ((hasConfigurationRequest() && !getConfigurationRequest().equals(service.getConfigurationRequest())) || hasConfigurationResponse() != service.hasConfigurationResponse()) {
                return false;
            }
            if ((hasConfigurationResponse() && !getConfigurationResponse().equals(service.getConfigurationResponse())) || hasConfigurationNotification() != service.hasConfigurationNotification()) {
                return false;
            }
            if ((hasConfigurationNotification() && !getConfigurationNotification().equals(service.getConfigurationNotification())) || hasResetCalibrationRequest() != service.hasResetCalibrationRequest()) {
                return false;
            }
            if ((!hasResetCalibrationRequest() || getResetCalibrationRequest().equals(service.getResetCalibrationRequest())) && hasResetCalibrationResponse() == service.hasResetCalibrationResponse()) {
                return (!hasResetCalibrationResponse() || getResetCalibrationResponse().equals(service.getResetCalibrationResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
        public ConfigurationNotification getConfigurationNotification() {
            ConfigurationNotification configurationNotification = this.configurationNotification_;
            return configurationNotification == null ? ConfigurationNotification.getDefaultInstance() : configurationNotification;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
        public ConfigurationNotificationOrBuilder getConfigurationNotificationOrBuilder() {
            ConfigurationNotification configurationNotification = this.configurationNotification_;
            return configurationNotification == null ? ConfigurationNotification.getDefaultInstance() : configurationNotification;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
        public ConfigurationRequest getConfigurationRequest() {
            ConfigurationRequest configurationRequest = this.configurationRequest_;
            return configurationRequest == null ? ConfigurationRequest.getDefaultInstance() : configurationRequest;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
        public ConfigurationRequestOrBuilder getConfigurationRequestOrBuilder() {
            ConfigurationRequest configurationRequest = this.configurationRequest_;
            return configurationRequest == null ? ConfigurationRequest.getDefaultInstance() : configurationRequest;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
        public ConfigurationResponse getConfigurationResponse() {
            ConfigurationResponse configurationResponse = this.configurationResponse_;
            return configurationResponse == null ? ConfigurationResponse.getDefaultInstance() : configurationResponse;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
        public ConfigurationResponseOrBuilder getConfigurationResponseOrBuilder() {
            ConfigurationResponse configurationResponse = this.configurationResponse_;
            return configurationResponse == null ? ConfigurationResponse.getDefaultInstance() : configurationResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Service> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
        public ResetSpeedDistanceCalibrationMetricsRequest getResetCalibrationRequest() {
            ResetSpeedDistanceCalibrationMetricsRequest resetSpeedDistanceCalibrationMetricsRequest = this.resetCalibrationRequest_;
            return resetSpeedDistanceCalibrationMetricsRequest == null ? ResetSpeedDistanceCalibrationMetricsRequest.getDefaultInstance() : resetSpeedDistanceCalibrationMetricsRequest;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
        public ResetSpeedDistanceCalibrationMetricsRequestOrBuilder getResetCalibrationRequestOrBuilder() {
            ResetSpeedDistanceCalibrationMetricsRequest resetSpeedDistanceCalibrationMetricsRequest = this.resetCalibrationRequest_;
            return resetSpeedDistanceCalibrationMetricsRequest == null ? ResetSpeedDistanceCalibrationMetricsRequest.getDefaultInstance() : resetSpeedDistanceCalibrationMetricsRequest;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
        public ResetSpeedDistanceCalibrationMetricsResponse getResetCalibrationResponse() {
            ResetSpeedDistanceCalibrationMetricsResponse resetSpeedDistanceCalibrationMetricsResponse = this.resetCalibrationResponse_;
            return resetSpeedDistanceCalibrationMetricsResponse == null ? ResetSpeedDistanceCalibrationMetricsResponse.getDefaultInstance() : resetSpeedDistanceCalibrationMetricsResponse;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
        public ResetSpeedDistanceCalibrationMetricsResponseOrBuilder getResetCalibrationResponseOrBuilder() {
            ResetSpeedDistanceCalibrationMetricsResponse resetSpeedDistanceCalibrationMetricsResponse = this.resetCalibrationResponse_;
            return resetSpeedDistanceCalibrationMetricsResponse == null ? ResetSpeedDistanceCalibrationMetricsResponse.getDefaultInstance() : resetSpeedDistanceCalibrationMetricsResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getConfigurationRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getConfigurationResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getConfigurationNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getResetCalibrationRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getResetCalibrationResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
        public boolean hasConfigurationNotification() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
        public boolean hasConfigurationRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
        public boolean hasConfigurationResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
        public boolean hasResetCalibrationRequest() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
        public boolean hasResetCalibrationResponse() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConfigurationRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConfigurationRequest().hashCode();
            }
            if (hasConfigurationResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getConfigurationResponse().hashCode();
            }
            if (hasConfigurationNotification()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getConfigurationNotification().hashCode();
            }
            if (hasResetCalibrationRequest()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getResetCalibrationRequest().hashCode();
            }
            if (hasResetCalibrationResponse()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getResetCalibrationResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRunning.internal_static_GDI_Proto_Running_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getConfigurationRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getConfigurationResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getConfigurationNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getResetCalibrationRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getResetCalibrationResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> configurationNotificationBuilder_;
            private ConfigurationNotification configurationNotification_;
            private SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> configurationRequestBuilder_;
            private ConfigurationRequest configurationRequest_;
            private SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> configurationResponseBuilder_;
            private ConfigurationResponse configurationResponse_;
            private SingleFieldBuilderV3<ResetSpeedDistanceCalibrationMetricsRequest, ResetSpeedDistanceCalibrationMetricsRequest.Builder, ResetSpeedDistanceCalibrationMetricsRequestOrBuilder> resetCalibrationRequestBuilder_;
            private ResetSpeedDistanceCalibrationMetricsRequest resetCalibrationRequest_;
            private SingleFieldBuilderV3<ResetSpeedDistanceCalibrationMetricsResponse, ResetSpeedDistanceCalibrationMetricsResponse.Builder, ResetSpeedDistanceCalibrationMetricsResponseOrBuilder> resetCalibrationResponseBuilder_;
            private ResetSpeedDistanceCalibrationMetricsResponse resetCalibrationResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configurationRequestBuilder_;
                    service.configurationRequest_ = singleFieldBuilderV3 == null ? this.configurationRequest_ : (ConfigurationRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV4 = this.configurationResponseBuilder_;
                    service.configurationResponse_ = singleFieldBuilderV4 == null ? this.configurationResponse_ : (ConfigurationResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV5 = this.configurationNotificationBuilder_;
                    service.configurationNotification_ = singleFieldBuilderV5 == null ? this.configurationNotification_ : (ConfigurationNotification) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<ResetSpeedDistanceCalibrationMetricsRequest, ResetSpeedDistanceCalibrationMetricsRequest.Builder, ResetSpeedDistanceCalibrationMetricsRequestOrBuilder> singleFieldBuilderV6 = this.resetCalibrationRequestBuilder_;
                    service.resetCalibrationRequest_ = singleFieldBuilderV6 == null ? this.resetCalibrationRequest_ : (ResetSpeedDistanceCalibrationMetricsRequest) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<ResetSpeedDistanceCalibrationMetricsResponse, ResetSpeedDistanceCalibrationMetricsResponse.Builder, ResetSpeedDistanceCalibrationMetricsResponseOrBuilder> singleFieldBuilderV7 = this.resetCalibrationResponseBuilder_;
                    service.resetCalibrationResponse_ = singleFieldBuilderV7 == null ? this.resetCalibrationResponse_ : (ResetSpeedDistanceCalibrationMetricsResponse) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                service.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> getConfigurationNotificationFieldBuilder() {
                if (this.configurationNotificationBuilder_ == null) {
                    this.configurationNotificationBuilder_ = new SingleFieldBuilderV3<>(getConfigurationNotification(), getParentForChildren(), isClean());
                    this.configurationNotification_ = null;
                }
                return this.configurationNotificationBuilder_;
            }

            private SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> getConfigurationRequestFieldBuilder() {
                if (this.configurationRequestBuilder_ == null) {
                    this.configurationRequestBuilder_ = new SingleFieldBuilderV3<>(getConfigurationRequest(), getParentForChildren(), isClean());
                    this.configurationRequest_ = null;
                }
                return this.configurationRequestBuilder_;
            }

            private SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> getConfigurationResponseFieldBuilder() {
                if (this.configurationResponseBuilder_ == null) {
                    this.configurationResponseBuilder_ = new SingleFieldBuilderV3<>(getConfigurationResponse(), getParentForChildren(), isClean());
                    this.configurationResponse_ = null;
                }
                return this.configurationResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRunning.internal_static_GDI_Proto_Running_Service_descriptor;
            }

            private SingleFieldBuilderV3<ResetSpeedDistanceCalibrationMetricsRequest, ResetSpeedDistanceCalibrationMetricsRequest.Builder, ResetSpeedDistanceCalibrationMetricsRequestOrBuilder> getResetCalibrationRequestFieldBuilder() {
                if (this.resetCalibrationRequestBuilder_ == null) {
                    this.resetCalibrationRequestBuilder_ = new SingleFieldBuilderV3<>(getResetCalibrationRequest(), getParentForChildren(), isClean());
                    this.resetCalibrationRequest_ = null;
                }
                return this.resetCalibrationRequestBuilder_;
            }

            private SingleFieldBuilderV3<ResetSpeedDistanceCalibrationMetricsResponse, ResetSpeedDistanceCalibrationMetricsResponse.Builder, ResetSpeedDistanceCalibrationMetricsResponseOrBuilder> getResetCalibrationResponseFieldBuilder() {
                if (this.resetCalibrationResponseBuilder_ == null) {
                    this.resetCalibrationResponseBuilder_ = new SingleFieldBuilderV3<>(getResetCalibrationResponse(), getParentForChildren(), isClean());
                    this.resetCalibrationResponse_ = null;
                }
                return this.resetCalibrationResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConfigurationRequestFieldBuilder();
                    getConfigurationResponseFieldBuilder();
                    getConfigurationNotificationFieldBuilder();
                    getResetCalibrationRequestFieldBuilder();
                    getResetCalibrationResponseFieldBuilder();
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
                this.configurationRequest_ = null;
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configurationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configurationRequestBuilder_ = null;
                }
                this.configurationResponse_ = null;
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV4 = this.configurationResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.configurationResponseBuilder_ = null;
                }
                this.configurationNotification_ = null;
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV5 = this.configurationNotificationBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.configurationNotificationBuilder_ = null;
                }
                this.resetCalibrationRequest_ = null;
                SingleFieldBuilderV3<ResetSpeedDistanceCalibrationMetricsRequest, ResetSpeedDistanceCalibrationMetricsRequest.Builder, ResetSpeedDistanceCalibrationMetricsRequestOrBuilder> singleFieldBuilderV6 = this.resetCalibrationRequestBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.resetCalibrationRequestBuilder_ = null;
                }
                this.resetCalibrationResponse_ = null;
                SingleFieldBuilderV3<ResetSpeedDistanceCalibrationMetricsResponse, ResetSpeedDistanceCalibrationMetricsResponse.Builder, ResetSpeedDistanceCalibrationMetricsResponseOrBuilder> singleFieldBuilderV7 = this.resetCalibrationResponseBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.resetCalibrationResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearConfigurationNotification() {
                this.bitField0_ &= -5;
                this.configurationNotification_ = null;
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configurationNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configurationNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConfigurationRequest() {
                this.bitField0_ &= -2;
                this.configurationRequest_ = null;
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configurationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configurationRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConfigurationResponse() {
                this.bitField0_ &= -3;
                this.configurationResponse_ = null;
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configurationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configurationResponseBuilder_ = null;
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

            public Builder clearResetCalibrationRequest() {
                this.bitField0_ &= -9;
                this.resetCalibrationRequest_ = null;
                SingleFieldBuilderV3<ResetSpeedDistanceCalibrationMetricsRequest, ResetSpeedDistanceCalibrationMetricsRequest.Builder, ResetSpeedDistanceCalibrationMetricsRequestOrBuilder> singleFieldBuilderV3 = this.resetCalibrationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.resetCalibrationRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearResetCalibrationResponse() {
                this.bitField0_ &= -17;
                this.resetCalibrationResponse_ = null;
                SingleFieldBuilderV3<ResetSpeedDistanceCalibrationMetricsResponse, ResetSpeedDistanceCalibrationMetricsResponse.Builder, ResetSpeedDistanceCalibrationMetricsResponseOrBuilder> singleFieldBuilderV3 = this.resetCalibrationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.resetCalibrationResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
            public ConfigurationNotification getConfigurationNotification() {
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configurationNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationNotification) singleFieldBuilderV3.getMessage();
                }
                ConfigurationNotification configurationNotification = this.configurationNotification_;
                return configurationNotification == null ? ConfigurationNotification.getDefaultInstance() : configurationNotification;
            }

            public ConfigurationNotification.Builder getConfigurationNotificationBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (ConfigurationNotification.Builder) getConfigurationNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
            public ConfigurationNotificationOrBuilder getConfigurationNotificationOrBuilder() {
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configurationNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigurationNotification configurationNotification = this.configurationNotification_;
                return configurationNotification == null ? ConfigurationNotification.getDefaultInstance() : configurationNotification;
            }

            @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
            public ConfigurationRequest getConfigurationRequest() {
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configurationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationRequest) singleFieldBuilderV3.getMessage();
                }
                ConfigurationRequest configurationRequest = this.configurationRequest_;
                return configurationRequest == null ? ConfigurationRequest.getDefaultInstance() : configurationRequest;
            }

            public ConfigurationRequest.Builder getConfigurationRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ConfigurationRequest.Builder) getConfigurationRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
            public ConfigurationRequestOrBuilder getConfigurationRequestOrBuilder() {
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configurationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigurationRequest configurationRequest = this.configurationRequest_;
                return configurationRequest == null ? ConfigurationRequest.getDefaultInstance() : configurationRequest;
            }

            @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
            public ConfigurationResponse getConfigurationResponse() {
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configurationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationResponse) singleFieldBuilderV3.getMessage();
                }
                ConfigurationResponse configurationResponse = this.configurationResponse_;
                return configurationResponse == null ? ConfigurationResponse.getDefaultInstance() : configurationResponse;
            }

            public ConfigurationResponse.Builder getConfigurationResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ConfigurationResponse.Builder) getConfigurationResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
            public ConfigurationResponseOrBuilder getConfigurationResponseOrBuilder() {
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configurationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigurationResponse configurationResponse = this.configurationResponse_;
                return configurationResponse == null ? ConfigurationResponse.getDefaultInstance() : configurationResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIRunning.internal_static_GDI_Proto_Running_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
            public ResetSpeedDistanceCalibrationMetricsRequest getResetCalibrationRequest() {
                SingleFieldBuilderV3<ResetSpeedDistanceCalibrationMetricsRequest, ResetSpeedDistanceCalibrationMetricsRequest.Builder, ResetSpeedDistanceCalibrationMetricsRequestOrBuilder> singleFieldBuilderV3 = this.resetCalibrationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ResetSpeedDistanceCalibrationMetricsRequest) singleFieldBuilderV3.getMessage();
                }
                ResetSpeedDistanceCalibrationMetricsRequest resetSpeedDistanceCalibrationMetricsRequest = this.resetCalibrationRequest_;
                return resetSpeedDistanceCalibrationMetricsRequest == null ? ResetSpeedDistanceCalibrationMetricsRequest.getDefaultInstance() : resetSpeedDistanceCalibrationMetricsRequest;
            }

            public ResetSpeedDistanceCalibrationMetricsRequest.Builder getResetCalibrationRequestBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (ResetSpeedDistanceCalibrationMetricsRequest.Builder) getResetCalibrationRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
            public ResetSpeedDistanceCalibrationMetricsRequestOrBuilder getResetCalibrationRequestOrBuilder() {
                SingleFieldBuilderV3<ResetSpeedDistanceCalibrationMetricsRequest, ResetSpeedDistanceCalibrationMetricsRequest.Builder, ResetSpeedDistanceCalibrationMetricsRequestOrBuilder> singleFieldBuilderV3 = this.resetCalibrationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ResetSpeedDistanceCalibrationMetricsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ResetSpeedDistanceCalibrationMetricsRequest resetSpeedDistanceCalibrationMetricsRequest = this.resetCalibrationRequest_;
                return resetSpeedDistanceCalibrationMetricsRequest == null ? ResetSpeedDistanceCalibrationMetricsRequest.getDefaultInstance() : resetSpeedDistanceCalibrationMetricsRequest;
            }

            @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
            public ResetSpeedDistanceCalibrationMetricsResponse getResetCalibrationResponse() {
                SingleFieldBuilderV3<ResetSpeedDistanceCalibrationMetricsResponse, ResetSpeedDistanceCalibrationMetricsResponse.Builder, ResetSpeedDistanceCalibrationMetricsResponseOrBuilder> singleFieldBuilderV3 = this.resetCalibrationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ResetSpeedDistanceCalibrationMetricsResponse) singleFieldBuilderV3.getMessage();
                }
                ResetSpeedDistanceCalibrationMetricsResponse resetSpeedDistanceCalibrationMetricsResponse = this.resetCalibrationResponse_;
                return resetSpeedDistanceCalibrationMetricsResponse == null ? ResetSpeedDistanceCalibrationMetricsResponse.getDefaultInstance() : resetSpeedDistanceCalibrationMetricsResponse;
            }

            public ResetSpeedDistanceCalibrationMetricsResponse.Builder getResetCalibrationResponseBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (ResetSpeedDistanceCalibrationMetricsResponse.Builder) getResetCalibrationResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
            public ResetSpeedDistanceCalibrationMetricsResponseOrBuilder getResetCalibrationResponseOrBuilder() {
                SingleFieldBuilderV3<ResetSpeedDistanceCalibrationMetricsResponse, ResetSpeedDistanceCalibrationMetricsResponse.Builder, ResetSpeedDistanceCalibrationMetricsResponseOrBuilder> singleFieldBuilderV3 = this.resetCalibrationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ResetSpeedDistanceCalibrationMetricsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ResetSpeedDistanceCalibrationMetricsResponse resetSpeedDistanceCalibrationMetricsResponse = this.resetCalibrationResponse_;
                return resetSpeedDistanceCalibrationMetricsResponse == null ? ResetSpeedDistanceCalibrationMetricsResponse.getDefaultInstance() : resetSpeedDistanceCalibrationMetricsResponse;
            }

            @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
            public boolean hasConfigurationNotification() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
            public boolean hasConfigurationRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
            public boolean hasConfigurationResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
            public boolean hasResetCalibrationRequest() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRunning.ServiceOrBuilder
            public boolean hasResetCalibrationResponse() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRunning.internal_static_GDI_Proto_Running_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeConfigurationNotification(ConfigurationNotification configurationNotification) {
                ConfigurationNotification configurationNotification2;
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configurationNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configurationNotification);
                } else if ((this.bitField0_ & 4) == 0 || (configurationNotification2 = this.configurationNotification_) == null || configurationNotification2 == ConfigurationNotification.getDefaultInstance()) {
                    this.configurationNotification_ = configurationNotification;
                } else {
                    getConfigurationNotificationBuilder().mergeFrom(configurationNotification);
                }
                if (this.configurationNotification_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConfigurationRequest(ConfigurationRequest configurationRequest) {
                ConfigurationRequest configurationRequest2;
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configurationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configurationRequest);
                } else if ((this.bitField0_ & 1) == 0 || (configurationRequest2 = this.configurationRequest_) == null || configurationRequest2 == ConfigurationRequest.getDefaultInstance()) {
                    this.configurationRequest_ = configurationRequest;
                } else {
                    getConfigurationRequestBuilder().mergeFrom(configurationRequest);
                }
                if (this.configurationRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConfigurationResponse(ConfigurationResponse configurationResponse) {
                ConfigurationResponse configurationResponse2;
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configurationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configurationResponse);
                } else if ((this.bitField0_ & 2) == 0 || (configurationResponse2 = this.configurationResponse_) == null || configurationResponse2 == ConfigurationResponse.getDefaultInstance()) {
                    this.configurationResponse_ = configurationResponse;
                } else {
                    getConfigurationResponseBuilder().mergeFrom(configurationResponse);
                }
                if (this.configurationResponse_ != null) {
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
                                    codedInputStream.readMessage(getConfigurationRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getConfigurationResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getConfigurationNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getResetCalibrationRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getResetCalibrationResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeResetCalibrationRequest(ResetSpeedDistanceCalibrationMetricsRequest resetSpeedDistanceCalibrationMetricsRequest) {
                ResetSpeedDistanceCalibrationMetricsRequest resetSpeedDistanceCalibrationMetricsRequest2;
                SingleFieldBuilderV3<ResetSpeedDistanceCalibrationMetricsRequest, ResetSpeedDistanceCalibrationMetricsRequest.Builder, ResetSpeedDistanceCalibrationMetricsRequestOrBuilder> singleFieldBuilderV3 = this.resetCalibrationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(resetSpeedDistanceCalibrationMetricsRequest);
                } else if ((this.bitField0_ & 8) == 0 || (resetSpeedDistanceCalibrationMetricsRequest2 = this.resetCalibrationRequest_) == null || resetSpeedDistanceCalibrationMetricsRequest2 == ResetSpeedDistanceCalibrationMetricsRequest.getDefaultInstance()) {
                    this.resetCalibrationRequest_ = resetSpeedDistanceCalibrationMetricsRequest;
                } else {
                    getResetCalibrationRequestBuilder().mergeFrom(resetSpeedDistanceCalibrationMetricsRequest);
                }
                if (this.resetCalibrationRequest_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeResetCalibrationResponse(ResetSpeedDistanceCalibrationMetricsResponse resetSpeedDistanceCalibrationMetricsResponse) {
                ResetSpeedDistanceCalibrationMetricsResponse resetSpeedDistanceCalibrationMetricsResponse2;
                SingleFieldBuilderV3<ResetSpeedDistanceCalibrationMetricsResponse, ResetSpeedDistanceCalibrationMetricsResponse.Builder, ResetSpeedDistanceCalibrationMetricsResponseOrBuilder> singleFieldBuilderV3 = this.resetCalibrationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(resetSpeedDistanceCalibrationMetricsResponse);
                } else if ((this.bitField0_ & 16) == 0 || (resetSpeedDistanceCalibrationMetricsResponse2 = this.resetCalibrationResponse_) == null || resetSpeedDistanceCalibrationMetricsResponse2 == ResetSpeedDistanceCalibrationMetricsResponse.getDefaultInstance()) {
                    this.resetCalibrationResponse_ = resetSpeedDistanceCalibrationMetricsResponse;
                } else {
                    getResetCalibrationResponseBuilder().mergeFrom(resetSpeedDistanceCalibrationMetricsResponse);
                }
                if (this.resetCalibrationResponse_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setConfigurationNotification(ConfigurationNotification.Builder builder) {
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configurationNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configurationNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConfigurationRequest(ConfigurationRequest.Builder builder) {
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configurationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configurationRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConfigurationResponse(ConfigurationResponse.Builder builder) {
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configurationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configurationResponse_ = builder.build();
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

            public Builder setResetCalibrationRequest(ResetSpeedDistanceCalibrationMetricsRequest.Builder builder) {
                SingleFieldBuilderV3<ResetSpeedDistanceCalibrationMetricsRequest, ResetSpeedDistanceCalibrationMetricsRequest.Builder, ResetSpeedDistanceCalibrationMetricsRequestOrBuilder> singleFieldBuilderV3 = this.resetCalibrationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.resetCalibrationRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setResetCalibrationResponse(ResetSpeedDistanceCalibrationMetricsResponse.Builder builder) {
                SingleFieldBuilderV3<ResetSpeedDistanceCalibrationMetricsResponse, ResetSpeedDistanceCalibrationMetricsResponse.Builder, ResetSpeedDistanceCalibrationMetricsResponseOrBuilder> singleFieldBuilderV3 = this.resetCalibrationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.resetCalibrationResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
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

            public Builder setConfigurationNotification(ConfigurationNotification configurationNotification) {
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configurationNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configurationNotification.getClass();
                    this.configurationNotification_ = configurationNotification;
                } else {
                    singleFieldBuilderV3.setMessage(configurationNotification);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConfigurationRequest(ConfigurationRequest configurationRequest) {
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configurationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configurationRequest.getClass();
                    this.configurationRequest_ = configurationRequest;
                } else {
                    singleFieldBuilderV3.setMessage(configurationRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConfigurationResponse(ConfigurationResponse configurationResponse) {
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configurationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configurationResponse.getClass();
                    this.configurationResponse_ = configurationResponse;
                } else {
                    singleFieldBuilderV3.setMessage(configurationResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setResetCalibrationRequest(ResetSpeedDistanceCalibrationMetricsRequest resetSpeedDistanceCalibrationMetricsRequest) {
                SingleFieldBuilderV3<ResetSpeedDistanceCalibrationMetricsRequest, ResetSpeedDistanceCalibrationMetricsRequest.Builder, ResetSpeedDistanceCalibrationMetricsRequestOrBuilder> singleFieldBuilderV3 = this.resetCalibrationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    resetSpeedDistanceCalibrationMetricsRequest.getClass();
                    this.resetCalibrationRequest_ = resetSpeedDistanceCalibrationMetricsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(resetSpeedDistanceCalibrationMetricsRequest);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setResetCalibrationResponse(ResetSpeedDistanceCalibrationMetricsResponse resetSpeedDistanceCalibrationMetricsResponse) {
                SingleFieldBuilderV3<ResetSpeedDistanceCalibrationMetricsResponse, ResetSpeedDistanceCalibrationMetricsResponse.Builder, ResetSpeedDistanceCalibrationMetricsResponseOrBuilder> singleFieldBuilderV3 = this.resetCalibrationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    resetSpeedDistanceCalibrationMetricsResponse.getClass();
                    this.resetCalibrationResponse_ = resetSpeedDistanceCalibrationMetricsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(resetSpeedDistanceCalibrationMetricsResponse);
                }
                this.bitField0_ |= 16;
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
                if (service.hasConfigurationRequest()) {
                    mergeConfigurationRequest(service.getConfigurationRequest());
                }
                if (service.hasConfigurationResponse()) {
                    mergeConfigurationResponse(service.getConfigurationResponse());
                }
                if (service.hasConfigurationNotification()) {
                    mergeConfigurationNotification(service.getConfigurationNotification());
                }
                if (service.hasResetCalibrationRequest()) {
                    mergeResetCalibrationRequest(service.getResetCalibrationRequest());
                }
                if (service.hasResetCalibrationResponse()) {
                    mergeResetCalibrationResponse(service.getResetCalibrationResponse());
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

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
