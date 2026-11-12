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

/* JADX INFO: loaded from: classes11.dex */
public final class GDIBikeLight {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012GDIBikeLight.proto\u0012\u0013GDI.Proto.BikeLight\u001a\rGDICore.proto\"ç\u0007\n\u0007Service\u0012S\n\u001aconfig_custom_mode_request\u0018\u0001 \u0001(\u000b2/.GDI.Proto.BikeLight.ConfigureCustomModeRequest\u0012U\n\u001bconfig_custom_mode_response\u0018\u0002 \u0001(\u000b20.GDI.Proto.BikeLight.ConfigureCustomModeResponse\u0012]\n\u001fconfig_custom_mode_notification\u0018\u0003 \u0001(\u000b24.GDI.Proto.BikeLight.ConfigureCustomModeNotification\u0012N\n\u0017config_rotation_request\u0018\u0004 \u0001(\u000b2-.GDI.Proto.BikeLight.ConfigureRotationRequest\u0012P\n\u0018config_rotation_response\u0018\u0005 \u0001(\u000b2..GDI.Proto.BikeLight.ConfigureRotationResponse\u0012X\n\u001cconfig_rotation_notification\u0018\u0006 \u0001(\u000b22.GDI.Proto.BikeLight.ConfigureRotationNotification\u0012C\n\u0013change_mode_request\u0018\u0007 \u0001(\u000b2&.GDI.Proto.BikeLight.ChangeModeRequest\u0012E\n\u0014change_mode_response\u0018\b \u0001(\u000b2'.GDI.Proto.BikeLight.ChangeModeResponse\u0012M\n\u0018change_mode_notification\u0018\t \u0001(\u000b2+.GDI.Proto.BikeLight.ChangeModeNotification\u0012N\n\u0017config_settings_request\u0018\n \u0001(\u000b2-.GDI.Proto.BikeLight.ConfigureSettingsRequest\u0012P\n\u0018config_settings_response\u0018\u000b \u0001(\u000b2..GDI.Proto.BikeLight.ConfigureSettingsResponse\u0012X\n\u001cconfig_settings_notification\u0018\f \u0001(\u000b22.GDI.Proto.BikeLight.ConfigureSettingsNotification\"\u0085\u0001\n\u0013CapabilitiesRequest2n\n\u0010features_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018! \u0001(\u000b2(.GDI.Proto.BikeLight.CapabilitiesRequest\"\u0097\u0002\n\u0015BikeLightCapabilities\u00122\n\u000fsupported_modes\u0018\u0001 \u0003(\u000e2\u0019.GDI.Proto.BikeLight.Mode\u0012!\n\u0019target_indication_support\u0018\u0002 \u0001(\b\u0012\u001f\n\u0017brake_detection_support\u0018\u0003 \u0001(\b\u0012 \n\u0018auto_beam_adjust_support\u0018\u0004 \u0001(\b\u0012\u001b\n\u0013max_rotation_length\u0018\u0005 \u0001(\r\u0012\u0018\n\u0010max_custom_steps\u0018\u0006 \u0001(\r\u0012\u0010\n\bnum_leds\u0018\u0007 \u0001(\r\u0012\u001b\n\u0013sleep_light_support\u0018\b \u0001(\b\"Ö\u0001\n\u0014CapabilitiesResponse\u0012K\n\u0017bike_light_capabilities\u0018\u0001 \u0001(\u000b2*.GDI.Proto.BikeLight.BikeLightCapabilities2q\n\u0011features_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018! \u0001(\u000b2).GDI.Proto.BikeLight.CapabilitiesResponse\"'\n\u0011CustomModeLedStep\u0012\u0012\n\nbrightness\u0018\u0001 \u0001(\r\"`\n\u000eCustomModeStep\u0012\u0013\n\u000bduration_ms\u0018\u0001 \u0001(\r\u00129\n\tled_steps\u0018\u0002 \u0003(\u000b2&.GDI.Proto.BikeLight.CustomModeLedStep\"w\n\nCustomMode\u0012'\n\u0004mode\u0018\u0001 \u0001(\u000e2\u0019.GDI.Proto.BikeLight.Mode\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u00122\n\u0005steps\u0018\u0003 \u0003(\u000b2#.GDI.Proto.BikeLight.CustomModeStep\"S\n\u001aConfigureCustomModeRequest\u00125\n\fcustom_modes\u0018\u0001 \u0003(\u000b2\u001f.GDI.Proto.BikeLight.CustomMode\"\u0081\u0001\n\u001bConfigureCustomModeResponse\u0012+\n\u0006status\u0018\u0001 \u0001(\u000e2\u001b.GDI.Proto.BikeLight.Status\u00125\n\fcustom_modes\u0018\u0002 \u0003(\u000b2\u001f.GDI.Proto.BikeLight.CustomMode\"X\n\u001fConfigureCustomModeNotification\u00125\n\fcustom_modes\u0018\u0001 \u0003(\u000b2\u001f.GDI.Proto.BikeLight.CustomMode\"G\n\u0018ConfigureRotationRequest\u0012+\n\brotation\u0018\u0001 \u0003(\u000e2\u0019.GDI.Proto.BikeLight.Mode\"u\n\u0019ConfigureRotationResponse\u0012+\n\u0006status\u0018\u0001 \u0001(\u000e2\u001b.GDI.Proto.BikeLight.Status\u0012+\n\brotation\u0018\u0002 \u0003(\u000e2\u0019.GDI.Proto.BikeLight.Mode\"L\n\u001dConfigureRotationNotification\u0012+\n\brotation\u0018\u0001 \u0003(\u000e2\u0019.GDI.Proto.BikeLight.Mode\"Q\n\u0011ChangeModeRequest\u0012'\n\u0004mode\u0018\u0001 \u0001(\u000e2\u0019.GDI.Proto.BikeLight.Mode\u0012\u0013\n\u000bsleep_light\u0018\u0002 \u0001(\b\"j\n\u0012ChangeModeResponse\u0012+\n\u0006status\u0018\u0001 \u0001(\u000e2\u001b.GDI.Proto.BikeLight.Status\u0012'\n\u0004mode\u0018\u0002 \u0001(\u000e2\u0019.GDI.Proto.BikeLight.Mode\"A\n\u0016ChangeModeNotification\u0012'\n\u0004mode\u0018\u0001 \u0001(\u000e2\u0019.GDI.Proto.BikeLight.Mode\"@\n\u0016AutoBeamAdjustSettings\u0012\u000f\n\u0007enabled\u0018\u0001 \u0001(\b\u0012\u0015\n\rmax_speed_kph\u0018\u0002 \u0001(\r\"Ã\u0002\n\u0011ConfigureSettings\u0012\u0019\n\u0011target_indication\u0018\u0001 \u0001(\b\u0012N\n\u000fbrake_detection\u0018\u0002 \u0001(\u000e25.GDI.Proto.BikeLight.ConfigureSettings.BrakeDetection\u0012E\n\u0010auto_beam_adjust\u0018\u0003 \u0001(\u000b2+.GDI.Proto.BikeLight.AutoBeamAdjustSettings\"|\n\u000eBrakeDetection\u0012\u001b\n\u0017BRAKE_DETECTION_UNKNOWN\u0010\u0000\u0012\u0017\n\u0013BRAKE_DETECTION_OFF\u0010\u0001\u0012\u0019\n\u0015BRAKE_DETECTION_SOLID\u0010\u0002\u0012\u0019\n\u0015BRAKE_DETECTION_FLASH\u0010\u0003\"T\n\u0018ConfigureSettingsRequest\u00128\n\bsettings\u0018\u0001 \u0001(\u000b2&.GDI.Proto.BikeLight.ConfigureSettings\"\u0082\u0001\n\u0019ConfigureSettingsResponse\u0012+\n\u0006status\u0018\u0001 \u0001(\u000e2\u001b.GDI.Proto.BikeLight.Status\u00128\n\bsettings\u0018\u0002 \u0001(\u000b2&.GDI.Proto.BikeLight.ConfigureSettings\"Y\n\u001dConfigureSettingsNotification\u00128\n\bsettings\u0018\u0001 \u0001(\u000b2&.GDI.Proto.BikeLight.ConfigureSettings*\u0083\u0002\n\u0004Mode\u0012\u0010\n\fMODE_UNKNOWN\u0010\u0000\u0012\u0011\n\rMODE_CUSTOM_1\u0010\u0001\u0012\u0011\n\rMODE_CUSTOM_2\u0010\u0002\u0012\u0011\n\rMODE_CUSTOM_3\u0010\u0003\u0012\u0011\n\rMODE_CUSTOM_4\u0010\u0004\u0012\u0011\n\rMODE_CUSTOM_5\u0010\u0005\u0012\u0012\n\u000eMODE_OVERDRIVE\u0010d\u0012\u0013\n\u000fMODE_SOLID_HIGH\u0010e\u0012\u0015\n\u0011MODE_SOLID_MEDIUM\u0010f\u0012\u0012\n\u000eMODE_SOLID_LOW\u0010g\u0012\u0014\n\u0010MODE_NIGHT_FLASH\u0010h\u0012\u0012\n\u000eMODE_DAY_FLASH\u0010i\u0012\f\n\bMODE_OFF\u0010j*W\n\u0006Status\u0012\u0012\n\u000eSTATUS_UNKNOWN\u0010\u0000\u0012\u0013\n\u000fSTATUS_REJECTED\u0010\u0001\u0012\u0013\n\u000fSTATUS_ACCEPTED\u0010\u0002\u0012\u000f\n\u000bSTATUS_BUSY\u0010\u0003B,\n\u001acom.garmin.proto.generatedB\fGDIBikeLightH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikeLight_AutoBeamAdjustSettings_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikeLight_AutoBeamAdjustSettings_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikeLight_BikeLightCapabilities_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikeLight_BikeLightCapabilities_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikeLight_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikeLight_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikeLight_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikeLight_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikeLight_ChangeModeNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikeLight_ChangeModeNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikeLight_ChangeModeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikeLight_ChangeModeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikeLight_ChangeModeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikeLight_ChangeModeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikeLight_ConfigureCustomModeNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikeLight_ConfigureCustomModeNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikeLight_ConfigureCustomModeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikeLight_ConfigureCustomModeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikeLight_ConfigureCustomModeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikeLight_ConfigureCustomModeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikeLight_ConfigureRotationNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikeLight_ConfigureRotationNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikeLight_ConfigureRotationRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikeLight_ConfigureRotationRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikeLight_ConfigureRotationResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikeLight_ConfigureRotationResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikeLight_ConfigureSettingsNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikeLight_ConfigureSettingsNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikeLight_ConfigureSettingsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikeLight_ConfigureSettingsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikeLight_ConfigureSettingsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikeLight_ConfigureSettingsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikeLight_ConfigureSettings_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikeLight_ConfigureSettings_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikeLight_CustomModeLedStep_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikeLight_CustomModeLedStep_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikeLight_CustomModeStep_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikeLight_CustomModeStep_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikeLight_CustomMode_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikeLight_CustomMode_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_BikeLight_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_BikeLight_Service_fieldAccessorTable;

    public interface AutoBeamAdjustSettingsOrBuilder extends MessageOrBuilder {
        boolean getEnabled();

        int getMaxSpeedKph();

        boolean hasEnabled();

        boolean hasMaxSpeedKph();
    }

    public interface BikeLightCapabilitiesOrBuilder extends MessageOrBuilder {
        boolean getAutoBeamAdjustSupport();

        boolean getBrakeDetectionSupport();

        int getMaxCustomSteps();

        int getMaxRotationLength();

        int getNumLeds();

        boolean getSleepLightSupport();

        Mode getSupportedModes(int i14);

        int getSupportedModesCount();

        List<Mode> getSupportedModesList();

        boolean getTargetIndicationSupport();

        boolean hasAutoBeamAdjustSupport();

        boolean hasBrakeDetectionSupport();

        boolean hasMaxCustomSteps();

        boolean hasMaxRotationLength();

        boolean hasNumLeds();

        boolean hasSleepLightSupport();

        boolean hasTargetIndicationSupport();
    }

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        BikeLightCapabilities getBikeLightCapabilities();

        BikeLightCapabilitiesOrBuilder getBikeLightCapabilitiesOrBuilder();

        boolean hasBikeLightCapabilities();
    }

    public interface ChangeModeNotificationOrBuilder extends MessageOrBuilder {
        Mode getMode();

        boolean hasMode();
    }

    public interface ChangeModeRequestOrBuilder extends MessageOrBuilder {
        Mode getMode();

        boolean getSleepLight();

        boolean hasMode();

        boolean hasSleepLight();
    }

    public interface ChangeModeResponseOrBuilder extends MessageOrBuilder {
        Mode getMode();

        Status getStatus();

        boolean hasMode();

        boolean hasStatus();
    }

    public interface ConfigureCustomModeNotificationOrBuilder extends MessageOrBuilder {
        CustomMode getCustomModes(int i14);

        int getCustomModesCount();

        List<CustomMode> getCustomModesList();

        CustomModeOrBuilder getCustomModesOrBuilder(int i14);

        List<? extends CustomModeOrBuilder> getCustomModesOrBuilderList();
    }

    public interface ConfigureCustomModeRequestOrBuilder extends MessageOrBuilder {
        CustomMode getCustomModes(int i14);

        int getCustomModesCount();

        List<CustomMode> getCustomModesList();

        CustomModeOrBuilder getCustomModesOrBuilder(int i14);

        List<? extends CustomModeOrBuilder> getCustomModesOrBuilderList();
    }

    public interface ConfigureCustomModeResponseOrBuilder extends MessageOrBuilder {
        CustomMode getCustomModes(int i14);

        int getCustomModesCount();

        List<CustomMode> getCustomModesList();

        CustomModeOrBuilder getCustomModesOrBuilder(int i14);

        List<? extends CustomModeOrBuilder> getCustomModesOrBuilderList();

        Status getStatus();

        boolean hasStatus();
    }

    public interface ConfigureRotationNotificationOrBuilder extends MessageOrBuilder {
        Mode getRotation(int i14);

        int getRotationCount();

        List<Mode> getRotationList();
    }

    public interface ConfigureRotationRequestOrBuilder extends MessageOrBuilder {
        Mode getRotation(int i14);

        int getRotationCount();

        List<Mode> getRotationList();
    }

    public interface ConfigureRotationResponseOrBuilder extends MessageOrBuilder {
        Mode getRotation(int i14);

        int getRotationCount();

        List<Mode> getRotationList();

        Status getStatus();

        boolean hasStatus();
    }

    public interface ConfigureSettingsNotificationOrBuilder extends MessageOrBuilder {
        ConfigureSettings getSettings();

        ConfigureSettingsOrBuilder getSettingsOrBuilder();

        boolean hasSettings();
    }

    public interface ConfigureSettingsOrBuilder extends MessageOrBuilder {
        AutoBeamAdjustSettings getAutoBeamAdjust();

        AutoBeamAdjustSettingsOrBuilder getAutoBeamAdjustOrBuilder();

        ConfigureSettings.BrakeDetection getBrakeDetection();

        boolean getTargetIndication();

        boolean hasAutoBeamAdjust();

        boolean hasBrakeDetection();

        boolean hasTargetIndication();
    }

    public interface ConfigureSettingsRequestOrBuilder extends MessageOrBuilder {
        ConfigureSettings getSettings();

        ConfigureSettingsOrBuilder getSettingsOrBuilder();

        boolean hasSettings();
    }

    public interface ConfigureSettingsResponseOrBuilder extends MessageOrBuilder {
        ConfigureSettings getSettings();

        ConfigureSettingsOrBuilder getSettingsOrBuilder();

        Status getStatus();

        boolean hasSettings();

        boolean hasStatus();
    }

    public interface CustomModeLedStepOrBuilder extends MessageOrBuilder {
        int getBrightness();

        boolean hasBrightness();
    }

    public interface CustomModeOrBuilder extends MessageOrBuilder {
        Mode getMode();

        String getName();

        ByteString getNameBytes();

        CustomModeStep getSteps(int i14);

        int getStepsCount();

        List<CustomModeStep> getStepsList();

        CustomModeStepOrBuilder getStepsOrBuilder(int i14);

        List<? extends CustomModeStepOrBuilder> getStepsOrBuilderList();

        boolean hasMode();

        boolean hasName();
    }

    public interface CustomModeStepOrBuilder extends MessageOrBuilder {
        int getDurationMs();

        CustomModeLedStep getLedSteps(int i14);

        int getLedStepsCount();

        List<CustomModeLedStep> getLedStepsList();

        CustomModeLedStepOrBuilder getLedStepsOrBuilder(int i14);

        List<? extends CustomModeLedStepOrBuilder> getLedStepsOrBuilderList();

        boolean hasDurationMs();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        ChangeModeNotification getChangeModeNotification();

        ChangeModeNotificationOrBuilder getChangeModeNotificationOrBuilder();

        ChangeModeRequest getChangeModeRequest();

        ChangeModeRequestOrBuilder getChangeModeRequestOrBuilder();

        ChangeModeResponse getChangeModeResponse();

        ChangeModeResponseOrBuilder getChangeModeResponseOrBuilder();

        ConfigureCustomModeNotification getConfigCustomModeNotification();

        ConfigureCustomModeNotificationOrBuilder getConfigCustomModeNotificationOrBuilder();

        ConfigureCustomModeRequest getConfigCustomModeRequest();

        ConfigureCustomModeRequestOrBuilder getConfigCustomModeRequestOrBuilder();

        ConfigureCustomModeResponse getConfigCustomModeResponse();

        ConfigureCustomModeResponseOrBuilder getConfigCustomModeResponseOrBuilder();

        ConfigureRotationNotification getConfigRotationNotification();

        ConfigureRotationNotificationOrBuilder getConfigRotationNotificationOrBuilder();

        ConfigureRotationRequest getConfigRotationRequest();

        ConfigureRotationRequestOrBuilder getConfigRotationRequestOrBuilder();

        ConfigureRotationResponse getConfigRotationResponse();

        ConfigureRotationResponseOrBuilder getConfigRotationResponseOrBuilder();

        ConfigureSettingsNotification getConfigSettingsNotification();

        ConfigureSettingsNotificationOrBuilder getConfigSettingsNotificationOrBuilder();

        ConfigureSettingsRequest getConfigSettingsRequest();

        ConfigureSettingsRequestOrBuilder getConfigSettingsRequestOrBuilder();

        ConfigureSettingsResponse getConfigSettingsResponse();

        ConfigureSettingsResponseOrBuilder getConfigSettingsResponseOrBuilder();

        boolean hasChangeModeNotification();

        boolean hasChangeModeRequest();

        boolean hasChangeModeResponse();

        boolean hasConfigCustomModeNotification();

        boolean hasConfigCustomModeRequest();

        boolean hasConfigCustomModeResponse();

        boolean hasConfigRotationNotification();

        boolean hasConfigRotationRequest();

        boolean hasConfigRotationResponse();

        boolean hasConfigSettingsNotification();

        boolean hasConfigSettingsRequest();

        boolean hasConfigSettingsResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = (Descriptors.Descriptor) f3.y(0);
        internal_static_GDI_Proto_BikeLight_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_BikeLight_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ConfigCustomModeRequest", "ConfigCustomModeResponse", "ConfigCustomModeNotification", "ConfigRotationRequest", "ConfigRotationResponse", "ConfigRotationNotification", "ChangeModeRequest", "ChangeModeResponse", "ChangeModeNotification", "ConfigSettingsRequest", "ConfigSettingsResponse", "ConfigSettingsNotification"});
        Descriptors.Descriptor descriptor3 = (Descriptors.Descriptor) f3.y(1);
        internal_static_GDI_Proto_BikeLight_CapabilitiesRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_BikeLight_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = (Descriptors.Descriptor) f3.y(2);
        internal_static_GDI_Proto_BikeLight_BikeLightCapabilities_descriptor = descriptor4;
        internal_static_GDI_Proto_BikeLight_BikeLightCapabilities_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"SupportedModes", "TargetIndicationSupport", "BrakeDetectionSupport", "AutoBeamAdjustSupport", "MaxRotationLength", "MaxCustomSteps", "NumLeds", "SleepLightSupport"});
        Descriptors.Descriptor descriptor5 = (Descriptors.Descriptor) f3.y(3);
        internal_static_GDI_Proto_BikeLight_CapabilitiesResponse_descriptor = descriptor5;
        internal_static_GDI_Proto_BikeLight_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"BikeLightCapabilities"});
        Descriptors.Descriptor descriptor6 = (Descriptors.Descriptor) f3.y(4);
        internal_static_GDI_Proto_BikeLight_CustomModeLedStep_descriptor = descriptor6;
        internal_static_GDI_Proto_BikeLight_CustomModeLedStep_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Brightness"});
        Descriptors.Descriptor descriptor7 = (Descriptors.Descriptor) f3.y(5);
        internal_static_GDI_Proto_BikeLight_CustomModeStep_descriptor = descriptor7;
        internal_static_GDI_Proto_BikeLight_CustomModeStep_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"DurationMs", "LedSteps"});
        Descriptors.Descriptor descriptor8 = (Descriptors.Descriptor) f3.y(6);
        internal_static_GDI_Proto_BikeLight_CustomMode_descriptor = descriptor8;
        internal_static_GDI_Proto_BikeLight_CustomMode_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Mode", "Name", "Steps"});
        Descriptors.Descriptor descriptor9 = (Descriptors.Descriptor) f3.y(7);
        internal_static_GDI_Proto_BikeLight_ConfigureCustomModeRequest_descriptor = descriptor9;
        internal_static_GDI_Proto_BikeLight_ConfigureCustomModeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"CustomModes"});
        Descriptors.Descriptor descriptor10 = (Descriptors.Descriptor) f3.y(8);
        internal_static_GDI_Proto_BikeLight_ConfigureCustomModeResponse_descriptor = descriptor10;
        internal_static_GDI_Proto_BikeLight_ConfigureCustomModeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Status", "CustomModes"});
        Descriptors.Descriptor descriptor11 = (Descriptors.Descriptor) f3.y(9);
        internal_static_GDI_Proto_BikeLight_ConfigureCustomModeNotification_descriptor = descriptor11;
        internal_static_GDI_Proto_BikeLight_ConfigureCustomModeNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"CustomModes"});
        Descriptors.Descriptor descriptor12 = (Descriptors.Descriptor) f3.y(10);
        internal_static_GDI_Proto_BikeLight_ConfigureRotationRequest_descriptor = descriptor12;
        internal_static_GDI_Proto_BikeLight_ConfigureRotationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Rotation"});
        Descriptors.Descriptor descriptor13 = (Descriptors.Descriptor) f3.y(11);
        internal_static_GDI_Proto_BikeLight_ConfigureRotationResponse_descriptor = descriptor13;
        internal_static_GDI_Proto_BikeLight_ConfigureRotationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Status", "Rotation"});
        Descriptors.Descriptor descriptor14 = (Descriptors.Descriptor) f3.y(12);
        internal_static_GDI_Proto_BikeLight_ConfigureRotationNotification_descriptor = descriptor14;
        internal_static_GDI_Proto_BikeLight_ConfigureRotationNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Rotation"});
        Descriptors.Descriptor descriptor15 = (Descriptors.Descriptor) f3.y(13);
        internal_static_GDI_Proto_BikeLight_ChangeModeRequest_descriptor = descriptor15;
        internal_static_GDI_Proto_BikeLight_ChangeModeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Mode", "SleepLight"});
        Descriptors.Descriptor descriptor16 = (Descriptors.Descriptor) f3.y(14);
        internal_static_GDI_Proto_BikeLight_ChangeModeResponse_descriptor = descriptor16;
        internal_static_GDI_Proto_BikeLight_ChangeModeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Status", "Mode"});
        Descriptors.Descriptor descriptor17 = (Descriptors.Descriptor) f3.y(15);
        internal_static_GDI_Proto_BikeLight_ChangeModeNotification_descriptor = descriptor17;
        internal_static_GDI_Proto_BikeLight_ChangeModeNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"Mode"});
        Descriptors.Descriptor descriptor18 = (Descriptors.Descriptor) f3.y(16);
        internal_static_GDI_Proto_BikeLight_AutoBeamAdjustSettings_descriptor = descriptor18;
        internal_static_GDI_Proto_BikeLight_AutoBeamAdjustSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"Enabled", "MaxSpeedKph"});
        Descriptors.Descriptor descriptor19 = (Descriptors.Descriptor) f3.y(17);
        internal_static_GDI_Proto_BikeLight_ConfigureSettings_descriptor = descriptor19;
        internal_static_GDI_Proto_BikeLight_ConfigureSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"TargetIndication", "BrakeDetection", "AutoBeamAdjust"});
        Descriptors.Descriptor descriptor20 = (Descriptors.Descriptor) f3.y(18);
        internal_static_GDI_Proto_BikeLight_ConfigureSettingsRequest_descriptor = descriptor20;
        internal_static_GDI_Proto_BikeLight_ConfigureSettingsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"Settings"});
        Descriptors.Descriptor descriptor21 = (Descriptors.Descriptor) f3.y(19);
        internal_static_GDI_Proto_BikeLight_ConfigureSettingsResponse_descriptor = descriptor21;
        internal_static_GDI_Proto_BikeLight_ConfigureSettingsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor21, new String[]{"Status", "Settings"});
        Descriptors.Descriptor descriptor22 = (Descriptors.Descriptor) f3.y(20);
        internal_static_GDI_Proto_BikeLight_ConfigureSettingsNotification_descriptor = descriptor22;
        internal_static_GDI_Proto_BikeLight_ConfigureSettingsNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor22, new String[]{"Settings"});
        GDICore.getDescriptor();
    }

    private GDIBikeLight() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.featuresRequest);
        extensionRegistryLite.add(CapabilitiesResponse.featuresResponse);
    }

    public static final class AutoBeamAdjustSettings extends GeneratedMessageV3 implements AutoBeamAdjustSettingsOrBuilder {
        public static final int ENABLED_FIELD_NUMBER = 1;
        public static final int MAX_SPEED_KPH_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean enabled_;
        private int maxSpeedKph_;
        private byte memoizedIsInitialized;
        private static final AutoBeamAdjustSettings DEFAULT_INSTANCE = new AutoBeamAdjustSettings();

        @Deprecated
        public static final Parser<AutoBeamAdjustSettings> PARSER = new AbstractParser<AutoBeamAdjustSettings>() { // from class: com.garmin.proto.generated.GDIBikeLight.AutoBeamAdjustSettings.1
            @Override // com.google.protobuf.Parser
            public AutoBeamAdjustSettings parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AutoBeamAdjustSettings.newBuilder();
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

        private AutoBeamAdjustSettings(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.enabled_ = false;
            this.maxSpeedKph_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AutoBeamAdjustSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_AutoBeamAdjustSettings_descriptor;
        }

        public static Builder newBuilder(AutoBeamAdjustSettings autoBeamAdjustSettings) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(autoBeamAdjustSettings);
        }

        public static AutoBeamAdjustSettings parseDelimitedFrom(InputStream inputStream) {
            return (AutoBeamAdjustSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AutoBeamAdjustSettings parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AutoBeamAdjustSettings> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AutoBeamAdjustSettings)) {
                return super.equals(obj);
            }
            AutoBeamAdjustSettings autoBeamAdjustSettings = (AutoBeamAdjustSettings) obj;
            if (hasEnabled() != autoBeamAdjustSettings.hasEnabled()) {
                return false;
            }
            if ((!hasEnabled() || getEnabled() == autoBeamAdjustSettings.getEnabled()) && hasMaxSpeedKph() == autoBeamAdjustSettings.hasMaxSpeedKph()) {
                return (!hasMaxSpeedKph() || getMaxSpeedKph() == autoBeamAdjustSettings.getMaxSpeedKph()) && getUnknownFields().equals(autoBeamAdjustSettings.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.AutoBeamAdjustSettingsOrBuilder
        public boolean getEnabled() {
            return this.enabled_;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.AutoBeamAdjustSettingsOrBuilder
        public int getMaxSpeedKph() {
            return this.maxSpeedKph_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AutoBeamAdjustSettings> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.enabled_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt32Size(2, this.maxSpeedKph_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.AutoBeamAdjustSettingsOrBuilder
        public boolean hasEnabled() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.AutoBeamAdjustSettingsOrBuilder
        public boolean hasMaxSpeedKph() {
            return (this.bitField0_ & 2) != 0;
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
            if (hasMaxSpeedKph()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getMaxSpeedKph();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_AutoBeamAdjustSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(AutoBeamAdjustSettings.class, Builder.class);
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
            return new AutoBeamAdjustSettings();
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
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.maxSpeedKph_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AutoBeamAdjustSettingsOrBuilder {
            private int bitField0_;
            private boolean enabled_;
            private int maxSpeedKph_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(AutoBeamAdjustSettings autoBeamAdjustSettings) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    autoBeamAdjustSettings.enabled_ = this.enabled_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    autoBeamAdjustSettings.maxSpeedKph_ = this.maxSpeedKph_;
                    i14 |= 2;
                }
                autoBeamAdjustSettings.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_AutoBeamAdjustSettings_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AutoBeamAdjustSettings build() {
                AutoBeamAdjustSettings autoBeamAdjustSettingsBuildPartial = buildPartial();
                if (autoBeamAdjustSettingsBuildPartial.isInitialized()) {
                    return autoBeamAdjustSettingsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) autoBeamAdjustSettingsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AutoBeamAdjustSettings buildPartial() {
                AutoBeamAdjustSettings autoBeamAdjustSettings = new AutoBeamAdjustSettings(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(autoBeamAdjustSettings);
                }
                onBuilt();
                return autoBeamAdjustSettings;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.enabled_ = false;
                this.maxSpeedKph_ = 0;
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

            public Builder clearMaxSpeedKph() {
                this.bitField0_ &= -3;
                this.maxSpeedKph_ = 0;
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
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_AutoBeamAdjustSettings_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.AutoBeamAdjustSettingsOrBuilder
            public boolean getEnabled() {
                return this.enabled_;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.AutoBeamAdjustSettingsOrBuilder
            public int getMaxSpeedKph() {
                return this.maxSpeedKph_;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.AutoBeamAdjustSettingsOrBuilder
            public boolean hasEnabled() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.AutoBeamAdjustSettingsOrBuilder
            public boolean hasMaxSpeedKph() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_AutoBeamAdjustSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(AutoBeamAdjustSettings.class, Builder.class);
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
                                } else if (tag == 16) {
                                    this.maxSpeedKph_ = codedInputStream.readUInt32();
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

            public Builder setMaxSpeedKph(int i14) {
                this.maxSpeedKph_ = i14;
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

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AutoBeamAdjustSettings getDefaultInstanceForType() {
                return AutoBeamAdjustSettings.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AutoBeamAdjustSettings) {
                    return mergeFrom((AutoBeamAdjustSettings) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AutoBeamAdjustSettings autoBeamAdjustSettings) {
                if (autoBeamAdjustSettings == AutoBeamAdjustSettings.getDefaultInstance()) {
                    return this;
                }
                if (autoBeamAdjustSettings.hasEnabled()) {
                    setEnabled(autoBeamAdjustSettings.getEnabled());
                }
                if (autoBeamAdjustSettings.hasMaxSpeedKph()) {
                    setMaxSpeedKph(autoBeamAdjustSettings.getMaxSpeedKph());
                }
                mergeUnknownFields(autoBeamAdjustSettings.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AutoBeamAdjustSettings getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AutoBeamAdjustSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AutoBeamAdjustSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AutoBeamAdjustSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AutoBeamAdjustSettings parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AutoBeamAdjustSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ AutoBeamAdjustSettings(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static AutoBeamAdjustSettings parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private AutoBeamAdjustSettings() {
            this.enabled_ = false;
            this.maxSpeedKph_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AutoBeamAdjustSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AutoBeamAdjustSettings parseFrom(InputStream inputStream) {
            return (AutoBeamAdjustSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AutoBeamAdjustSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AutoBeamAdjustSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AutoBeamAdjustSettings parseFrom(CodedInputStream codedInputStream) {
            return (AutoBeamAdjustSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AutoBeamAdjustSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AutoBeamAdjustSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int FEATURES_REQUEST_FIELD_NUMBER = 33;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIBikeLight.CapabilitiesRequest.1
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
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CapabilitiesRequest_descriptor;
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
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CapabilitiesRequest_descriptor;
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
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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

    public static final class CustomModeLedStep extends GeneratedMessageV3 implements CustomModeLedStepOrBuilder {
        public static final int BRIGHTNESS_FIELD_NUMBER = 1;
        private static final CustomModeLedStep DEFAULT_INSTANCE = new CustomModeLedStep();

        @Deprecated
        public static final Parser<CustomModeLedStep> PARSER = new AbstractParser<CustomModeLedStep>() { // from class: com.garmin.proto.generated.GDIBikeLight.CustomModeLedStep.1
            @Override // com.google.protobuf.Parser
            public CustomModeLedStep parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CustomModeLedStep.newBuilder();
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
        private int brightness_;
        private byte memoizedIsInitialized;

        private CustomModeLedStep(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.brightness_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CustomModeLedStep getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CustomModeLedStep_descriptor;
        }

        public static Builder newBuilder(CustomModeLedStep customModeLedStep) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(customModeLedStep);
        }

        public static CustomModeLedStep parseDelimitedFrom(InputStream inputStream) {
            return (CustomModeLedStep) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CustomModeLedStep parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CustomModeLedStep> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CustomModeLedStep)) {
                return super.equals(obj);
            }
            CustomModeLedStep customModeLedStep = (CustomModeLedStep) obj;
            if (hasBrightness() != customModeLedStep.hasBrightness()) {
                return false;
            }
            return (!hasBrightness() || getBrightness() == customModeLedStep.getBrightness()) && getUnknownFields().equals(customModeLedStep.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeLedStepOrBuilder
        public int getBrightness() {
            return this.brightness_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CustomModeLedStep> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.brightness_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeLedStepOrBuilder
        public boolean hasBrightness() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasBrightness()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getBrightness();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CustomModeLedStep_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomModeLedStep.class, Builder.class);
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
            return new CustomModeLedStep();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.brightness_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CustomModeLedStepOrBuilder {
            private int bitField0_;
            private int brightness_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(CustomModeLedStep customModeLedStep) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    customModeLedStep.brightness_ = this.brightness_;
                } else {
                    i14 = 0;
                }
                customModeLedStep.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CustomModeLedStep_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CustomModeLedStep build() {
                CustomModeLedStep customModeLedStepBuildPartial = buildPartial();
                if (customModeLedStepBuildPartial.isInitialized()) {
                    return customModeLedStepBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) customModeLedStepBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CustomModeLedStep buildPartial() {
                CustomModeLedStep customModeLedStep = new CustomModeLedStep(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(customModeLedStep);
                }
                onBuilt();
                return customModeLedStep;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.brightness_ = 0;
                return this;
            }

            public Builder clearBrightness() {
                this.bitField0_ &= -2;
                this.brightness_ = 0;
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

            @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeLedStepOrBuilder
            public int getBrightness() {
                return this.brightness_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CustomModeLedStep_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeLedStepOrBuilder
            public boolean hasBrightness() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CustomModeLedStep_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomModeLedStep.class, Builder.class);
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
                                    this.brightness_ = codedInputStream.readUInt32();
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

            public Builder setBrightness(int i14) {
                this.brightness_ = i14;
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
            public CustomModeLedStep getDefaultInstanceForType() {
                return CustomModeLedStep.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CustomModeLedStep) {
                    return mergeFrom((CustomModeLedStep) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CustomModeLedStep customModeLedStep) {
                if (customModeLedStep == CustomModeLedStep.getDefaultInstance()) {
                    return this;
                }
                if (customModeLedStep.hasBrightness()) {
                    setBrightness(customModeLedStep.getBrightness());
                }
                mergeUnknownFields(customModeLedStep.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CustomModeLedStep getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CustomModeLedStep parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CustomModeLedStep) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CustomModeLedStep parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ CustomModeLedStep(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CustomModeLedStep parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CustomModeLedStep() {
            this.brightness_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CustomModeLedStep parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CustomModeLedStep parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CustomModeLedStep parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CustomModeLedStep parseFrom(InputStream inputStream) {
            return (CustomModeLedStep) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CustomModeLedStep parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CustomModeLedStep) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CustomModeLedStep parseFrom(CodedInputStream codedInputStream) {
            return (CustomModeLedStep) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CustomModeLedStep parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CustomModeLedStep) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class BikeLightCapabilities extends GeneratedMessageV3 implements BikeLightCapabilitiesOrBuilder {
        public static final int AUTO_BEAM_ADJUST_SUPPORT_FIELD_NUMBER = 4;
        public static final int BRAKE_DETECTION_SUPPORT_FIELD_NUMBER = 3;
        public static final int MAX_CUSTOM_STEPS_FIELD_NUMBER = 6;
        public static final int MAX_ROTATION_LENGTH_FIELD_NUMBER = 5;
        public static final int NUM_LEDS_FIELD_NUMBER = 7;
        public static final int SLEEP_LIGHT_SUPPORT_FIELD_NUMBER = 8;
        public static final int SUPPORTED_MODES_FIELD_NUMBER = 1;
        public static final int TARGET_INDICATION_SUPPORT_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private boolean autoBeamAdjustSupport_;
        private int bitField0_;
        private boolean brakeDetectionSupport_;
        private int maxCustomSteps_;
        private int maxRotationLength_;
        private byte memoizedIsInitialized;
        private int numLeds_;
        private boolean sleepLightSupport_;
        private List<Integer> supportedModes_;
        private boolean targetIndicationSupport_;
        private static final Internal.ListAdapter.Converter<Integer, Mode> supportedModes_converter_ = new Internal.ListAdapter.Converter<Integer, Mode>() { // from class: com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilities.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public Mode convert(Integer num) {
                Mode modeForNumber = Mode.forNumber(num.intValue());
                return modeForNumber == null ? Mode.MODE_UNKNOWN : modeForNumber;
            }
        };
        private static final BikeLightCapabilities DEFAULT_INSTANCE = new BikeLightCapabilities();

        @Deprecated
        public static final Parser<BikeLightCapabilities> PARSER = new AbstractParser<BikeLightCapabilities>() { // from class: com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilities.2
            @Override // com.google.protobuf.Parser
            public BikeLightCapabilities parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = BikeLightCapabilities.newBuilder();
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

        private BikeLightCapabilities() {
            this.targetIndicationSupport_ = false;
            this.brakeDetectionSupport_ = false;
            this.autoBeamAdjustSupport_ = false;
            this.maxRotationLength_ = 0;
            this.maxCustomSteps_ = 0;
            this.numLeds_ = 0;
            this.sleepLightSupport_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.supportedModes_ = Collections.EMPTY_LIST;
        }

        public static BikeLightCapabilities getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_BikeLightCapabilities_descriptor;
        }

        public static Builder newBuilder(BikeLightCapabilities bikeLightCapabilities) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(bikeLightCapabilities);
        }

        public static BikeLightCapabilities parseDelimitedFrom(InputStream inputStream) {
            return (BikeLightCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BikeLightCapabilities parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<BikeLightCapabilities> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BikeLightCapabilities)) {
                return super.equals(obj);
            }
            BikeLightCapabilities bikeLightCapabilities = (BikeLightCapabilities) obj;
            if (!this.supportedModes_.equals(bikeLightCapabilities.supportedModes_) || hasTargetIndicationSupport() != bikeLightCapabilities.hasTargetIndicationSupport()) {
                return false;
            }
            if ((hasTargetIndicationSupport() && getTargetIndicationSupport() != bikeLightCapabilities.getTargetIndicationSupport()) || hasBrakeDetectionSupport() != bikeLightCapabilities.hasBrakeDetectionSupport()) {
                return false;
            }
            if ((hasBrakeDetectionSupport() && getBrakeDetectionSupport() != bikeLightCapabilities.getBrakeDetectionSupport()) || hasAutoBeamAdjustSupport() != bikeLightCapabilities.hasAutoBeamAdjustSupport()) {
                return false;
            }
            if ((hasAutoBeamAdjustSupport() && getAutoBeamAdjustSupport() != bikeLightCapabilities.getAutoBeamAdjustSupport()) || hasMaxRotationLength() != bikeLightCapabilities.hasMaxRotationLength()) {
                return false;
            }
            if ((hasMaxRotationLength() && getMaxRotationLength() != bikeLightCapabilities.getMaxRotationLength()) || hasMaxCustomSteps() != bikeLightCapabilities.hasMaxCustomSteps()) {
                return false;
            }
            if ((hasMaxCustomSteps() && getMaxCustomSteps() != bikeLightCapabilities.getMaxCustomSteps()) || hasNumLeds() != bikeLightCapabilities.hasNumLeds()) {
                return false;
            }
            if ((!hasNumLeds() || getNumLeds() == bikeLightCapabilities.getNumLeds()) && hasSleepLightSupport() == bikeLightCapabilities.hasSleepLightSupport()) {
                return (!hasSleepLightSupport() || getSleepLightSupport() == bikeLightCapabilities.getSleepLightSupport()) && getUnknownFields().equals(bikeLightCapabilities.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
        public boolean getAutoBeamAdjustSupport() {
            return this.autoBeamAdjustSupport_;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
        public boolean getBrakeDetectionSupport() {
            return this.brakeDetectionSupport_;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
        public int getMaxCustomSteps() {
            return this.maxCustomSteps_;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
        public int getMaxRotationLength() {
            return this.maxRotationLength_;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
        public int getNumLeds() {
            return this.numLeds_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<BikeLightCapabilities> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            List<Integer> list;
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int i15 = 0;
            int iA = 0;
            while (true) {
                int size = this.supportedModes_.size();
                list = this.supportedModes_;
                if (i15 >= size) {
                    break;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
            int size2 = list.size() + iA;
            if ((this.bitField0_ & 1) != 0) {
                size2 += CodedOutputStream.computeBoolSize(2, this.targetIndicationSupport_);
            }
            if ((this.bitField0_ & 2) != 0) {
                size2 += CodedOutputStream.computeBoolSize(3, this.brakeDetectionSupport_);
            }
            if ((this.bitField0_ & 4) != 0) {
                size2 += CodedOutputStream.computeBoolSize(4, this.autoBeamAdjustSupport_);
            }
            if ((this.bitField0_ & 8) != 0) {
                size2 += CodedOutputStream.computeUInt32Size(5, this.maxRotationLength_);
            }
            if ((this.bitField0_ & 16) != 0) {
                size2 += CodedOutputStream.computeUInt32Size(6, this.maxCustomSteps_);
            }
            if ((this.bitField0_ & 32) != 0) {
                size2 += CodedOutputStream.computeUInt32Size(7, this.numLeds_);
            }
            if ((this.bitField0_ & 64) != 0) {
                size2 += CodedOutputStream.computeBoolSize(8, this.sleepLightSupport_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + size2;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
        public boolean getSleepLightSupport() {
            return this.sleepLightSupport_;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
        public Mode getSupportedModes(int i14) {
            return supportedModes_converter_.convert(this.supportedModes_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
        public int getSupportedModesCount() {
            return this.supportedModes_.size();
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
        public List<Mode> getSupportedModesList() {
            return new Internal.ListAdapter(this.supportedModes_, supportedModes_converter_);
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
        public boolean getTargetIndicationSupport() {
            return this.targetIndicationSupport_;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
        public boolean hasAutoBeamAdjustSupport() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
        public boolean hasBrakeDetectionSupport() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
        public boolean hasMaxCustomSteps() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
        public boolean hasMaxRotationLength() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
        public boolean hasNumLeds() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
        public boolean hasSleepLightSupport() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
        public boolean hasTargetIndicationSupport() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getSupportedModesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.supportedModes_.hashCode();
            }
            if (hasTargetIndicationSupport()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getTargetIndicationSupport());
            }
            if (hasBrakeDetectionSupport()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getBrakeDetectionSupport());
            }
            if (hasAutoBeamAdjustSupport()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getAutoBeamAdjustSupport());
            }
            if (hasMaxRotationLength()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getMaxRotationLength();
            }
            if (hasMaxCustomSteps()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getMaxCustomSteps();
            }
            if (hasNumLeds()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getNumLeds();
            }
            if (hasSleepLightSupport()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + Internal.hashBoolean(getSleepLightSupport());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_BikeLightCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(BikeLightCapabilities.class, Builder.class);
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
            return new BikeLightCapabilities();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iF = 0;
            while (iF < this.supportedModes_.size()) {
                iF = f3.f(this.supportedModes_.get(iF), codedOutputStream, 1, iF, 1);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(2, this.targetIndicationSupport_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(3, this.brakeDetectionSupport_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(4, this.autoBeamAdjustSupport_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(5, this.maxRotationLength_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(6, this.maxCustomSteps_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(7, this.numLeds_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeBool(8, this.sleepLightSupport_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BikeLightCapabilitiesOrBuilder {
            private boolean autoBeamAdjustSupport_;
            private int bitField0_;
            private boolean brakeDetectionSupport_;
            private int maxCustomSteps_;
            private int maxRotationLength_;
            private int numLeds_;
            private boolean sleepLightSupport_;
            private List<Integer> supportedModes_;
            private boolean targetIndicationSupport_;

            private Builder() {
                this.supportedModes_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(BikeLightCapabilities bikeLightCapabilities) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 2) != 0) {
                    bikeLightCapabilities.targetIndicationSupport_ = this.targetIndicationSupport_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 4) != 0) {
                    bikeLightCapabilities.brakeDetectionSupport_ = this.brakeDetectionSupport_;
                    i14 |= 2;
                }
                if ((i15 & 8) != 0) {
                    bikeLightCapabilities.autoBeamAdjustSupport_ = this.autoBeamAdjustSupport_;
                    i14 |= 4;
                }
                if ((i15 & 16) != 0) {
                    bikeLightCapabilities.maxRotationLength_ = this.maxRotationLength_;
                    i14 |= 8;
                }
                if ((i15 & 32) != 0) {
                    bikeLightCapabilities.maxCustomSteps_ = this.maxCustomSteps_;
                    i14 |= 16;
                }
                if ((i15 & 64) != 0) {
                    bikeLightCapabilities.numLeds_ = this.numLeds_;
                    i14 |= 32;
                }
                if ((i15 & 128) != 0) {
                    bikeLightCapabilities.sleepLightSupport_ = this.sleepLightSupport_;
                    i14 |= 64;
                }
                bikeLightCapabilities.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(BikeLightCapabilities bikeLightCapabilities) {
                if ((this.bitField0_ & 1) != 0) {
                    this.supportedModes_ = Collections.unmodifiableList(this.supportedModes_);
                    this.bitField0_ &= -2;
                }
                bikeLightCapabilities.supportedModes_ = this.supportedModes_;
            }

            private void ensureSupportedModesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.supportedModes_ = new ArrayList(this.supportedModes_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_BikeLightCapabilities_descriptor;
            }

            public Builder addAllSupportedModes(Iterable<? extends Mode> iterable) {
                ensureSupportedModesIsMutable();
                Iterator<? extends Mode> it = iterable.iterator();
                while (it.hasNext()) {
                    this.supportedModes_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSupportedModes(Mode mode) {
                mode.getClass();
                ensureSupportedModesIsMutable();
                this.supportedModes_.add(Integer.valueOf(mode.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BikeLightCapabilities build() {
                BikeLightCapabilities bikeLightCapabilitiesBuildPartial = buildPartial();
                if (bikeLightCapabilitiesBuildPartial.isInitialized()) {
                    return bikeLightCapabilitiesBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) bikeLightCapabilitiesBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BikeLightCapabilities buildPartial() {
                BikeLightCapabilities bikeLightCapabilities = new BikeLightCapabilities(this);
                buildPartialRepeatedFields(bikeLightCapabilities);
                if (this.bitField0_ != 0) {
                    buildPartial0(bikeLightCapabilities);
                }
                onBuilt();
                return bikeLightCapabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.supportedModes_ = Collections.EMPTY_LIST;
                this.bitField0_ = 0;
                this.targetIndicationSupport_ = false;
                this.brakeDetectionSupport_ = false;
                this.autoBeamAdjustSupport_ = false;
                this.maxRotationLength_ = 0;
                this.maxCustomSteps_ = 0;
                this.numLeds_ = 0;
                this.sleepLightSupport_ = false;
                return this;
            }

            public Builder clearAutoBeamAdjustSupport() {
                this.bitField0_ &= -9;
                this.autoBeamAdjustSupport_ = false;
                onChanged();
                return this;
            }

            public Builder clearBrakeDetectionSupport() {
                this.bitField0_ &= -5;
                this.brakeDetectionSupport_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMaxCustomSteps() {
                this.bitField0_ &= -33;
                this.maxCustomSteps_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxRotationLength() {
                this.bitField0_ &= -17;
                this.maxRotationLength_ = 0;
                onChanged();
                return this;
            }

            public Builder clearNumLeds() {
                this.bitField0_ &= -65;
                this.numLeds_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSleepLightSupport() {
                this.bitField0_ &= -129;
                this.sleepLightSupport_ = false;
                onChanged();
                return this;
            }

            public Builder clearSupportedModes() {
                this.supportedModes_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearTargetIndicationSupport() {
                this.bitField0_ &= -3;
                this.targetIndicationSupport_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
            public boolean getAutoBeamAdjustSupport() {
                return this.autoBeamAdjustSupport_;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
            public boolean getBrakeDetectionSupport() {
                return this.brakeDetectionSupport_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_BikeLightCapabilities_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
            public int getMaxCustomSteps() {
                return this.maxCustomSteps_;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
            public int getMaxRotationLength() {
                return this.maxRotationLength_;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
            public int getNumLeds() {
                return this.numLeds_;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
            public boolean getSleepLightSupport() {
                return this.sleepLightSupport_;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
            public Mode getSupportedModes(int i14) {
                return (Mode) BikeLightCapabilities.supportedModes_converter_.convert(this.supportedModes_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
            public int getSupportedModesCount() {
                return this.supportedModes_.size();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
            public List<Mode> getSupportedModesList() {
                return new Internal.ListAdapter(this.supportedModes_, BikeLightCapabilities.supportedModes_converter_);
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
            public boolean getTargetIndicationSupport() {
                return this.targetIndicationSupport_;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
            public boolean hasAutoBeamAdjustSupport() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
            public boolean hasBrakeDetectionSupport() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
            public boolean hasMaxCustomSteps() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
            public boolean hasMaxRotationLength() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
            public boolean hasNumLeds() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
            public boolean hasSleepLightSupport() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.BikeLightCapabilitiesOrBuilder
            public boolean hasTargetIndicationSupport() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_BikeLightCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(BikeLightCapabilities.class, Builder.class);
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
                                        ensureSupportedModesIsMutable();
                                        this.supportedModes_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (Mode.forNumber(i15) == null) {
                                            mergeUnknownVarintField(1, i15);
                                        } else {
                                            ensureSupportedModesIsMutable();
                                            this.supportedModes_.add(Integer.valueOf(i15));
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                } else if (tag == 16) {
                                    this.targetIndicationSupport_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.brakeDetectionSupport_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.autoBeamAdjustSupport_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.maxRotationLength_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    this.maxCustomSteps_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                } else if (tag == 56) {
                                    this.numLeds_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                } else if (tag == 64) {
                                    this.sleepLightSupport_ = codedInputStream.readBool();
                                    this.bitField0_ |= 128;
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

            public Builder setAutoBeamAdjustSupport(boolean z14) {
                this.autoBeamAdjustSupport_ = z14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setBrakeDetectionSupport(boolean z14) {
                this.brakeDetectionSupport_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setMaxCustomSteps(int i14) {
                this.maxCustomSteps_ = i14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setMaxRotationLength(int i14) {
                this.maxRotationLength_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setNumLeds(int i14) {
                this.numLeds_ = i14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSleepLightSupport(boolean z14) {
                this.sleepLightSupport_ = z14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setSupportedModes(int i14, Mode mode) {
                mode.getClass();
                ensureSupportedModesIsMutable();
                this.supportedModes_.set(i14, Integer.valueOf(mode.getNumber()));
                onChanged();
                return this;
            }

            public Builder setTargetIndicationSupport(boolean z14) {
                this.targetIndicationSupport_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public BikeLightCapabilities getDefaultInstanceForType() {
                return BikeLightCapabilities.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.supportedModes_ = Collections.EMPTY_LIST;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof BikeLightCapabilities) {
                    return mergeFrom((BikeLightCapabilities) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(BikeLightCapabilities bikeLightCapabilities) {
                if (bikeLightCapabilities == BikeLightCapabilities.getDefaultInstance()) {
                    return this;
                }
                if (!bikeLightCapabilities.supportedModes_.isEmpty()) {
                    if (this.supportedModes_.isEmpty()) {
                        this.supportedModes_ = bikeLightCapabilities.supportedModes_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureSupportedModesIsMutable();
                        this.supportedModes_.addAll(bikeLightCapabilities.supportedModes_);
                    }
                    onChanged();
                }
                if (bikeLightCapabilities.hasTargetIndicationSupport()) {
                    setTargetIndicationSupport(bikeLightCapabilities.getTargetIndicationSupport());
                }
                if (bikeLightCapabilities.hasBrakeDetectionSupport()) {
                    setBrakeDetectionSupport(bikeLightCapabilities.getBrakeDetectionSupport());
                }
                if (bikeLightCapabilities.hasAutoBeamAdjustSupport()) {
                    setAutoBeamAdjustSupport(bikeLightCapabilities.getAutoBeamAdjustSupport());
                }
                if (bikeLightCapabilities.hasMaxRotationLength()) {
                    setMaxRotationLength(bikeLightCapabilities.getMaxRotationLength());
                }
                if (bikeLightCapabilities.hasMaxCustomSteps()) {
                    setMaxCustomSteps(bikeLightCapabilities.getMaxCustomSteps());
                }
                if (bikeLightCapabilities.hasNumLeds()) {
                    setNumLeds(bikeLightCapabilities.getNumLeds());
                }
                if (bikeLightCapabilities.hasSleepLightSupport()) {
                    setSleepLightSupport(bikeLightCapabilities.getSleepLightSupport());
                }
                mergeUnknownFields(bikeLightCapabilities.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public BikeLightCapabilities getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static BikeLightCapabilities parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BikeLightCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BikeLightCapabilities parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static BikeLightCapabilities parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BikeLightCapabilities parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static BikeLightCapabilities parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static BikeLightCapabilities parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static BikeLightCapabilities parseFrom(InputStream inputStream) {
            return (BikeLightCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static BikeLightCapabilities parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BikeLightCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BikeLightCapabilities parseFrom(CodedInputStream codedInputStream) {
            return (BikeLightCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static BikeLightCapabilities parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BikeLightCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private BikeLightCapabilities(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.targetIndicationSupport_ = false;
            this.brakeDetectionSupport_ = false;
            this.autoBeamAdjustSupport_ = false;
            this.maxRotationLength_ = 0;
            this.maxCustomSteps_ = 0;
            this.numLeds_ = 0;
            this.sleepLightSupport_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ BikeLightCapabilities(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int BIKE_LIGHT_CAPABILITIES_FIELD_NUMBER = 1;
        public static final int FEATURES_RESPONSE_FIELD_NUMBER = 33;
        private static final long serialVersionUID = 0;
        private BikeLightCapabilities bikeLightCapabilities_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIBikeLight.CapabilitiesResponse.1
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
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CapabilitiesResponse_descriptor;
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
            if (hasBikeLightCapabilities() != capabilitiesResponse.hasBikeLightCapabilities()) {
                return false;
            }
            return (!hasBikeLightCapabilities() || getBikeLightCapabilities().equals(capabilitiesResponse.getBikeLightCapabilities())) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.CapabilitiesResponseOrBuilder
        public BikeLightCapabilities getBikeLightCapabilities() {
            BikeLightCapabilities bikeLightCapabilities = this.bikeLightCapabilities_;
            return bikeLightCapabilities == null ? BikeLightCapabilities.getDefaultInstance() : bikeLightCapabilities;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.CapabilitiesResponseOrBuilder
        public BikeLightCapabilitiesOrBuilder getBikeLightCapabilitiesOrBuilder() {
            BikeLightCapabilities bikeLightCapabilities = this.bikeLightCapabilities_;
            return bikeLightCapabilities == null ? BikeLightCapabilities.getDefaultInstance() : bikeLightCapabilities;
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getBikeLightCapabilities()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.CapabilitiesResponseOrBuilder
        public boolean hasBikeLightCapabilities() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasBikeLightCapabilities()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getBikeLightCapabilities().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getBikeLightCapabilities());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private SingleFieldBuilderV3<BikeLightCapabilities, BikeLightCapabilities.Builder, BikeLightCapabilitiesOrBuilder> bikeLightCapabilitiesBuilder_;
            private BikeLightCapabilities bikeLightCapabilities_;
            private int bitField0_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<BikeLightCapabilities, BikeLightCapabilities.Builder, BikeLightCapabilitiesOrBuilder> singleFieldBuilderV3 = this.bikeLightCapabilitiesBuilder_;
                    capabilitiesResponse.bikeLightCapabilities_ = singleFieldBuilderV3 == null ? this.bikeLightCapabilities_ : (BikeLightCapabilities) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                capabilitiesResponse.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<BikeLightCapabilities, BikeLightCapabilities.Builder, BikeLightCapabilitiesOrBuilder> getBikeLightCapabilitiesFieldBuilder() {
                if (this.bikeLightCapabilitiesBuilder_ == null) {
                    this.bikeLightCapabilitiesBuilder_ = new SingleFieldBuilderV3<>(getBikeLightCapabilities(), getParentForChildren(), isClean());
                    this.bikeLightCapabilities_ = null;
                }
                return this.bikeLightCapabilitiesBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CapabilitiesResponse_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getBikeLightCapabilitiesFieldBuilder();
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
                this.bikeLightCapabilities_ = null;
                SingleFieldBuilderV3<BikeLightCapabilities, BikeLightCapabilities.Builder, BikeLightCapabilitiesOrBuilder> singleFieldBuilderV3 = this.bikeLightCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.bikeLightCapabilitiesBuilder_ = null;
                }
                return this;
            }

            public Builder clearBikeLightCapabilities() {
                this.bitField0_ &= -2;
                this.bikeLightCapabilities_ = null;
                SingleFieldBuilderV3<BikeLightCapabilities, BikeLightCapabilities.Builder, BikeLightCapabilitiesOrBuilder> singleFieldBuilderV3 = this.bikeLightCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.bikeLightCapabilitiesBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIBikeLight.CapabilitiesResponseOrBuilder
            public BikeLightCapabilities getBikeLightCapabilities() {
                SingleFieldBuilderV3<BikeLightCapabilities, BikeLightCapabilities.Builder, BikeLightCapabilitiesOrBuilder> singleFieldBuilderV3 = this.bikeLightCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (BikeLightCapabilities) singleFieldBuilderV3.getMessage();
                }
                BikeLightCapabilities bikeLightCapabilities = this.bikeLightCapabilities_;
                return bikeLightCapabilities == null ? BikeLightCapabilities.getDefaultInstance() : bikeLightCapabilities;
            }

            public BikeLightCapabilities.Builder getBikeLightCapabilitiesBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (BikeLightCapabilities.Builder) getBikeLightCapabilitiesFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.CapabilitiesResponseOrBuilder
            public BikeLightCapabilitiesOrBuilder getBikeLightCapabilitiesOrBuilder() {
                SingleFieldBuilderV3<BikeLightCapabilities, BikeLightCapabilities.Builder, BikeLightCapabilitiesOrBuilder> singleFieldBuilderV3 = this.bikeLightCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (BikeLightCapabilitiesOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                BikeLightCapabilities bikeLightCapabilities = this.bikeLightCapabilities_;
                return bikeLightCapabilities == null ? BikeLightCapabilities.getDefaultInstance() : bikeLightCapabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.CapabilitiesResponseOrBuilder
            public boolean hasBikeLightCapabilities() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeBikeLightCapabilities(BikeLightCapabilities bikeLightCapabilities) {
                BikeLightCapabilities bikeLightCapabilities2;
                SingleFieldBuilderV3<BikeLightCapabilities, BikeLightCapabilities.Builder, BikeLightCapabilitiesOrBuilder> singleFieldBuilderV3 = this.bikeLightCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(bikeLightCapabilities);
                } else if ((this.bitField0_ & 1) == 0 || (bikeLightCapabilities2 = this.bikeLightCapabilities_) == null || bikeLightCapabilities2 == BikeLightCapabilities.getDefaultInstance()) {
                    this.bikeLightCapabilities_ = bikeLightCapabilities;
                } else {
                    getBikeLightCapabilitiesBuilder().mergeFrom(bikeLightCapabilities);
                }
                if (this.bikeLightCapabilities_ != null) {
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
                                    codedInputStream.readMessage(getBikeLightCapabilitiesFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setBikeLightCapabilities(BikeLightCapabilities.Builder builder) {
                SingleFieldBuilderV3<BikeLightCapabilities, BikeLightCapabilities.Builder, BikeLightCapabilitiesOrBuilder> singleFieldBuilderV3 = this.bikeLightCapabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.bikeLightCapabilities_ = builder.build();
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

            public Builder setBikeLightCapabilities(BikeLightCapabilities bikeLightCapabilities) {
                SingleFieldBuilderV3<BikeLightCapabilities, BikeLightCapabilities.Builder, BikeLightCapabilitiesOrBuilder> singleFieldBuilderV3 = this.bikeLightCapabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    bikeLightCapabilities.getClass();
                    this.bikeLightCapabilities_ = bikeLightCapabilities;
                } else {
                    singleFieldBuilderV3.setMessage(bikeLightCapabilities);
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
                if (capabilitiesResponse.hasBikeLightCapabilities()) {
                    mergeBikeLightCapabilities(capabilitiesResponse.getBikeLightCapabilities());
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

    public static final class ChangeModeNotification extends GeneratedMessageV3 implements ChangeModeNotificationOrBuilder {
        public static final int MODE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int mode_;
        private static final ChangeModeNotification DEFAULT_INSTANCE = new ChangeModeNotification();

        @Deprecated
        public static final Parser<ChangeModeNotification> PARSER = new AbstractParser<ChangeModeNotification>() { // from class: com.garmin.proto.generated.GDIBikeLight.ChangeModeNotification.1
            @Override // com.google.protobuf.Parser
            public ChangeModeNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ChangeModeNotification.newBuilder();
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

        private ChangeModeNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.mode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ChangeModeNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ChangeModeNotification_descriptor;
        }

        public static Builder newBuilder(ChangeModeNotification changeModeNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(changeModeNotification);
        }

        public static ChangeModeNotification parseDelimitedFrom(InputStream inputStream) {
            return (ChangeModeNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ChangeModeNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ChangeModeNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChangeModeNotification)) {
                return super.equals(obj);
            }
            ChangeModeNotification changeModeNotification = (ChangeModeNotification) obj;
            if (hasMode() != changeModeNotification.hasMode()) {
                return false;
            }
            return (!hasMode() || this.mode_ == changeModeNotification.mode_) && getUnknownFields().equals(changeModeNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ChangeModeNotificationOrBuilder
        public Mode getMode() {
            Mode modeForNumber = Mode.forNumber(this.mode_);
            return modeForNumber == null ? Mode.MODE_UNKNOWN : modeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ChangeModeNotification> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIBikeLight.ChangeModeNotificationOrBuilder
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
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ChangeModeNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ChangeModeNotification.class, Builder.class);
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
            return new ChangeModeNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ChangeModeNotificationOrBuilder {
            private int bitField0_;
            private int mode_;

            private Builder() {
                this.mode_ = 0;
            }

            private void buildPartial0(ChangeModeNotification changeModeNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    changeModeNotification.mode_ = this.mode_;
                } else {
                    i14 = 0;
                }
                changeModeNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ChangeModeNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChangeModeNotification build() {
                ChangeModeNotification changeModeNotificationBuildPartial = buildPartial();
                if (changeModeNotificationBuildPartial.isInitialized()) {
                    return changeModeNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) changeModeNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChangeModeNotification buildPartial() {
                ChangeModeNotification changeModeNotification = new ChangeModeNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(changeModeNotification);
                }
                onBuilt();
                return changeModeNotification;
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
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ChangeModeNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ChangeModeNotificationOrBuilder
            public Mode getMode() {
                Mode modeForNumber = Mode.forNumber(this.mode_);
                return modeForNumber == null ? Mode.MODE_UNKNOWN : modeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ChangeModeNotificationOrBuilder
            public boolean hasMode() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ChangeModeNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ChangeModeNotification.class, Builder.class);
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
            public ChangeModeNotification getDefaultInstanceForType() {
                return ChangeModeNotification.getDefaultInstance();
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
                if (message instanceof ChangeModeNotification) {
                    return mergeFrom((ChangeModeNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ChangeModeNotification changeModeNotification) {
                if (changeModeNotification == ChangeModeNotification.getDefaultInstance()) {
                    return this;
                }
                if (changeModeNotification.hasMode()) {
                    setMode(changeModeNotification.getMode());
                }
                mergeUnknownFields(changeModeNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ChangeModeNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ChangeModeNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChangeModeNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChangeModeNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ChangeModeNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ChangeModeNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ChangeModeNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.mode_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ChangeModeNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ChangeModeNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ChangeModeNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ChangeModeNotification parseFrom(InputStream inputStream) {
            return (ChangeModeNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ChangeModeNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChangeModeNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChangeModeNotification parseFrom(CodedInputStream codedInputStream) {
            return (ChangeModeNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ChangeModeNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChangeModeNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ChangeModeRequest extends GeneratedMessageV3 implements ChangeModeRequestOrBuilder {
        public static final int MODE_FIELD_NUMBER = 1;
        public static final int SLEEP_LIGHT_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int mode_;
        private boolean sleepLight_;
        private static final ChangeModeRequest DEFAULT_INSTANCE = new ChangeModeRequest();

        @Deprecated
        public static final Parser<ChangeModeRequest> PARSER = new AbstractParser<ChangeModeRequest>() { // from class: com.garmin.proto.generated.GDIBikeLight.ChangeModeRequest.1
            @Override // com.google.protobuf.Parser
            public ChangeModeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ChangeModeRequest.newBuilder();
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

        private ChangeModeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.mode_ = 0;
            this.sleepLight_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ChangeModeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ChangeModeRequest_descriptor;
        }

        public static Builder newBuilder(ChangeModeRequest changeModeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(changeModeRequest);
        }

        public static ChangeModeRequest parseDelimitedFrom(InputStream inputStream) {
            return (ChangeModeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ChangeModeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ChangeModeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChangeModeRequest)) {
                return super.equals(obj);
            }
            ChangeModeRequest changeModeRequest = (ChangeModeRequest) obj;
            if (hasMode() != changeModeRequest.hasMode()) {
                return false;
            }
            if ((!hasMode() || this.mode_ == changeModeRequest.mode_) && hasSleepLight() == changeModeRequest.hasSleepLight()) {
                return (!hasSleepLight() || getSleepLight() == changeModeRequest.getSleepLight()) && getUnknownFields().equals(changeModeRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ChangeModeRequestOrBuilder
        public Mode getMode() {
            Mode modeForNumber = Mode.forNumber(this.mode_);
            return modeForNumber == null ? Mode.MODE_UNKNOWN : modeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ChangeModeRequest> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeBoolSize(2, this.sleepLight_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ChangeModeRequestOrBuilder
        public boolean getSleepLight() {
            return this.sleepLight_;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ChangeModeRequestOrBuilder
        public boolean hasMode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ChangeModeRequestOrBuilder
        public boolean hasSleepLight() {
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
            if (hasSleepLight()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getSleepLight());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ChangeModeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ChangeModeRequest.class, Builder.class);
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
            return new ChangeModeRequest();
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
                codedOutputStream.writeBool(2, this.sleepLight_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ChangeModeRequestOrBuilder {
            private int bitField0_;
            private int mode_;
            private boolean sleepLight_;

            private Builder() {
                this.mode_ = 0;
            }

            private void buildPartial0(ChangeModeRequest changeModeRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    changeModeRequest.mode_ = this.mode_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    changeModeRequest.sleepLight_ = this.sleepLight_;
                    i14 |= 2;
                }
                changeModeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ChangeModeRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChangeModeRequest build() {
                ChangeModeRequest changeModeRequestBuildPartial = buildPartial();
                if (changeModeRequestBuildPartial.isInitialized()) {
                    return changeModeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) changeModeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChangeModeRequest buildPartial() {
                ChangeModeRequest changeModeRequest = new ChangeModeRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(changeModeRequest);
                }
                onBuilt();
                return changeModeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.mode_ = 0;
                this.sleepLight_ = false;
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

            public Builder clearSleepLight() {
                this.bitField0_ &= -3;
                this.sleepLight_ = false;
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
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ChangeModeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ChangeModeRequestOrBuilder
            public Mode getMode() {
                Mode modeForNumber = Mode.forNumber(this.mode_);
                return modeForNumber == null ? Mode.MODE_UNKNOWN : modeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ChangeModeRequestOrBuilder
            public boolean getSleepLight() {
                return this.sleepLight_;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ChangeModeRequestOrBuilder
            public boolean hasMode() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ChangeModeRequestOrBuilder
            public boolean hasSleepLight() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ChangeModeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ChangeModeRequest.class, Builder.class);
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
                                    this.sleepLight_ = codedInputStream.readBool();
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

            public Builder setSleepLight(boolean z14) {
                this.sleepLight_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ChangeModeRequest getDefaultInstanceForType() {
                return ChangeModeRequest.getDefaultInstance();
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
                if (message instanceof ChangeModeRequest) {
                    return mergeFrom((ChangeModeRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ChangeModeRequest changeModeRequest) {
                if (changeModeRequest == ChangeModeRequest.getDefaultInstance()) {
                    return this;
                }
                if (changeModeRequest.hasMode()) {
                    setMode(changeModeRequest.getMode());
                }
                if (changeModeRequest.hasSleepLight()) {
                    setSleepLight(changeModeRequest.getSleepLight());
                }
                mergeUnknownFields(changeModeRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ChangeModeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ChangeModeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChangeModeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChangeModeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ChangeModeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ChangeModeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ ChangeModeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ChangeModeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private ChangeModeRequest() {
            this.sleepLight_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.mode_ = 0;
        }

        public static ChangeModeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ChangeModeRequest parseFrom(InputStream inputStream) {
            return (ChangeModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ChangeModeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChangeModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChangeModeRequest parseFrom(CodedInputStream codedInputStream) {
            return (ChangeModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ChangeModeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChangeModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ChangeModeResponse extends GeneratedMessageV3 implements ChangeModeResponseOrBuilder {
        public static final int MODE_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int mode_;
        private int status_;
        private static final ChangeModeResponse DEFAULT_INSTANCE = new ChangeModeResponse();

        @Deprecated
        public static final Parser<ChangeModeResponse> PARSER = new AbstractParser<ChangeModeResponse>() { // from class: com.garmin.proto.generated.GDIBikeLight.ChangeModeResponse.1
            @Override // com.google.protobuf.Parser
            public ChangeModeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ChangeModeResponse.newBuilder();
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

        private ChangeModeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.mode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ChangeModeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ChangeModeResponse_descriptor;
        }

        public static Builder newBuilder(ChangeModeResponse changeModeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(changeModeResponse);
        }

        public static ChangeModeResponse parseDelimitedFrom(InputStream inputStream) {
            return (ChangeModeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ChangeModeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ChangeModeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChangeModeResponse)) {
                return super.equals(obj);
            }
            ChangeModeResponse changeModeResponse = (ChangeModeResponse) obj;
            if (hasStatus() != changeModeResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == changeModeResponse.status_) && hasMode() == changeModeResponse.hasMode()) {
                return (!hasMode() || this.mode_ == changeModeResponse.mode_) && getUnknownFields().equals(changeModeResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ChangeModeResponseOrBuilder
        public Mode getMode() {
            Mode modeForNumber = Mode.forNumber(this.mode_);
            return modeForNumber == null ? Mode.MODE_UNKNOWN : modeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ChangeModeResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.mode_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ChangeModeResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ChangeModeResponseOrBuilder
        public boolean hasMode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ChangeModeResponseOrBuilder
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
            if (hasMode()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.mode_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ChangeModeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ChangeModeResponse.class, Builder.class);
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
            return new ChangeModeResponse();
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
                codedOutputStream.writeEnum(2, this.mode_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ChangeModeResponseOrBuilder {
            private int bitField0_;
            private int mode_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                this.mode_ = 0;
            }

            private void buildPartial0(ChangeModeResponse changeModeResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    changeModeResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    changeModeResponse.mode_ = this.mode_;
                    i14 |= 2;
                }
                changeModeResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ChangeModeResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChangeModeResponse build() {
                ChangeModeResponse changeModeResponseBuildPartial = buildPartial();
                if (changeModeResponseBuildPartial.isInitialized()) {
                    return changeModeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) changeModeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChangeModeResponse buildPartial() {
                ChangeModeResponse changeModeResponse = new ChangeModeResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(changeModeResponse);
                }
                onBuilt();
                return changeModeResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.mode_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMode() {
                this.bitField0_ &= -3;
                this.mode_ = 0;
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
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ChangeModeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ChangeModeResponseOrBuilder
            public Mode getMode() {
                Mode modeForNumber = Mode.forNumber(this.mode_);
                return modeForNumber == null ? Mode.MODE_UNKNOWN : modeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ChangeModeResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ChangeModeResponseOrBuilder
            public boolean hasMode() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ChangeModeResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ChangeModeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ChangeModeResponse.class, Builder.class);
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
                                    if (Mode.forNumber(i15) == null) {
                                        mergeUnknownVarintField(2, i15);
                                    } else {
                                        this.mode_ = i15;
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

            public Builder setMode(Mode mode) {
                mode.getClass();
                this.bitField0_ |= 2;
                this.mode_ = mode.getNumber();
                onChanged();
                return this;
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
            public ChangeModeResponse getDefaultInstanceForType() {
                return ChangeModeResponse.getDefaultInstance();
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
                this.mode_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ChangeModeResponse) {
                    return mergeFrom((ChangeModeResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ChangeModeResponse changeModeResponse) {
                if (changeModeResponse == ChangeModeResponse.getDefaultInstance()) {
                    return this;
                }
                if (changeModeResponse.hasStatus()) {
                    setStatus(changeModeResponse.getStatus());
                }
                if (changeModeResponse.hasMode()) {
                    setMode(changeModeResponse.getMode());
                }
                mergeUnknownFields(changeModeResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ChangeModeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ChangeModeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChangeModeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChangeModeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ChangeModeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ChangeModeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ ChangeModeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ChangeModeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private ChangeModeResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.mode_ = 0;
        }

        public static ChangeModeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ChangeModeResponse parseFrom(InputStream inputStream) {
            return (ChangeModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ChangeModeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChangeModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChangeModeResponse parseFrom(CodedInputStream codedInputStream) {
            return (ChangeModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ChangeModeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChangeModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConfigureCustomModeNotification extends GeneratedMessageV3 implements ConfigureCustomModeNotificationOrBuilder {
        public static final int CUSTOM_MODES_FIELD_NUMBER = 1;
        private static final ConfigureCustomModeNotification DEFAULT_INSTANCE = new ConfigureCustomModeNotification();

        @Deprecated
        public static final Parser<ConfigureCustomModeNotification> PARSER = new AbstractParser<ConfigureCustomModeNotification>() { // from class: com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeNotification.1
            @Override // com.google.protobuf.Parser
            public ConfigureCustomModeNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigureCustomModeNotification.newBuilder();
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
        private List<CustomMode> customModes_;
        private byte memoizedIsInitialized;

        private ConfigureCustomModeNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.customModes_ = Collections.EMPTY_LIST;
        }

        public static ConfigureCustomModeNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureCustomModeNotification_descriptor;
        }

        public static Builder newBuilder(ConfigureCustomModeNotification configureCustomModeNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configureCustomModeNotification);
        }

        public static ConfigureCustomModeNotification parseDelimitedFrom(InputStream inputStream) {
            return (ConfigureCustomModeNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigureCustomModeNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigureCustomModeNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigureCustomModeNotification)) {
                return super.equals(obj);
            }
            ConfigureCustomModeNotification configureCustomModeNotification = (ConfigureCustomModeNotification) obj;
            return getCustomModesList().equals(configureCustomModeNotification.getCustomModesList()) && getUnknownFields().equals(configureCustomModeNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeNotificationOrBuilder
        public CustomMode getCustomModes(int i14) {
            return this.customModes_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeNotificationOrBuilder
        public int getCustomModesCount() {
            return this.customModes_.size();
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeNotificationOrBuilder
        public List<CustomMode> getCustomModesList() {
            return this.customModes_;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeNotificationOrBuilder
        public CustomModeOrBuilder getCustomModesOrBuilder(int i14) {
            return this.customModes_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeNotificationOrBuilder
        public List<? extends CustomModeOrBuilder> getCustomModesOrBuilderList() {
            return this.customModes_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigureCustomModeNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.customModes_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.customModes_.get(i15));
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
            if (getCustomModesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCustomModesList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureCustomModeNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureCustomModeNotification.class, Builder.class);
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
            return new ConfigureCustomModeNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.customModes_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.customModes_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigureCustomModeNotificationOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> customModesBuilder_;
            private List<CustomMode> customModes_;

            private Builder() {
                this.customModes_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(ConfigureCustomModeNotification configureCustomModeNotification) {
            }

            private void buildPartialRepeatedFields(ConfigureCustomModeNotification configureCustomModeNotification) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    configureCustomModeNotification.customModes_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.customModes_ = Collections.unmodifiableList(this.customModes_);
                    this.bitField0_ &= -2;
                }
                configureCustomModeNotification.customModes_ = this.customModes_;
            }

            private void ensureCustomModesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.customModes_ = new ArrayList(this.customModes_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> getCustomModesFieldBuilder() {
                if (this.customModesBuilder_ == null) {
                    this.customModesBuilder_ = new RepeatedFieldBuilderV3<>(this.customModes_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.customModes_ = null;
                }
                return this.customModesBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureCustomModeNotification_descriptor;
            }

            public Builder addAllCustomModes(Iterable<? extends CustomMode> iterable) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureCustomModesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.customModes_);
                onChanged();
                return this;
            }

            public Builder addCustomModes(CustomMode.Builder builder) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureCustomModesIsMutable();
                this.customModes_.add(builder.build());
                onChanged();
                return this;
            }

            public CustomMode.Builder addCustomModesBuilder() {
                return (CustomMode.Builder) getCustomModesFieldBuilder().addBuilder(CustomMode.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureCustomModeNotification build() {
                ConfigureCustomModeNotification configureCustomModeNotificationBuildPartial = buildPartial();
                if (configureCustomModeNotificationBuildPartial.isInitialized()) {
                    return configureCustomModeNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configureCustomModeNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureCustomModeNotification buildPartial() {
                ConfigureCustomModeNotification configureCustomModeNotification = new ConfigureCustomModeNotification(this);
                buildPartialRepeatedFields(configureCustomModeNotification);
                if (this.bitField0_ != 0) {
                    buildPartial0(configureCustomModeNotification);
                }
                onBuilt();
                return configureCustomModeNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.customModes_ = Collections.EMPTY_LIST;
                } else {
                    this.customModes_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder clearCustomModes() {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.customModes_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
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

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeNotificationOrBuilder
            public CustomMode getCustomModes(int i14) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.customModes_.get(i14) : (CustomMode) repeatedFieldBuilderV3.getMessage(i14);
            }

            public CustomMode.Builder getCustomModesBuilder(int i14) {
                return (CustomMode.Builder) getCustomModesFieldBuilder().getBuilder(i14);
            }

            public List<CustomMode.Builder> getCustomModesBuilderList() {
                return getCustomModesFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeNotificationOrBuilder
            public int getCustomModesCount() {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.customModes_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeNotificationOrBuilder
            public List<CustomMode> getCustomModesList() {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.customModes_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeNotificationOrBuilder
            public CustomModeOrBuilder getCustomModesOrBuilder(int i14) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.customModes_.get(i14) : (CustomModeOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeNotificationOrBuilder
            public List<? extends CustomModeOrBuilder> getCustomModesOrBuilderList() {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.customModes_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureCustomModeNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureCustomModeNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureCustomModeNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(ConfigureCustomModeNotification configureCustomModeNotification) {
                if (configureCustomModeNotification == ConfigureCustomModeNotification.getDefaultInstance()) {
                    return this;
                }
                if (this.customModesBuilder_ == null) {
                    if (!configureCustomModeNotification.customModes_.isEmpty()) {
                        if (this.customModes_.isEmpty()) {
                            this.customModes_ = configureCustomModeNotification.customModes_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureCustomModesIsMutable();
                            this.customModes_.addAll(configureCustomModeNotification.customModes_);
                        }
                        onChanged();
                    }
                } else if (!configureCustomModeNotification.customModes_.isEmpty()) {
                    boolean zIsEmpty = this.customModesBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.customModesBuilder_ = null;
                        this.customModes_ = configureCustomModeNotification.customModes_;
                        this.bitField0_ &= -2;
                        this.customModesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getCustomModesFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(configureCustomModeNotification.customModes_);
                    }
                }
                mergeUnknownFields(configureCustomModeNotification.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeCustomModes(int i14) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureCustomModesIsMutable();
                this.customModes_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setCustomModes(int i14, CustomMode.Builder builder) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureCustomModesIsMutable();
                this.customModes_.set(i14, builder.build());
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
            public ConfigureCustomModeNotification getDefaultInstanceForType() {
                return ConfigureCustomModeNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.customModes_ = Collections.EMPTY_LIST;
            }

            public CustomMode.Builder addCustomModesBuilder(int i14) {
                return (CustomMode.Builder) getCustomModesFieldBuilder().addBuilder(i14, CustomMode.getDefaultInstance());
            }

            public Builder addCustomModes(int i14, CustomMode customMode) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    customMode.getClass();
                    ensureCustomModesIsMutable();
                    this.customModes_.add(i14, customMode);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, customMode);
                return this;
            }

            public Builder setCustomModes(int i14, CustomMode customMode) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    customMode.getClass();
                    ensureCustomModesIsMutable();
                    this.customModes_.set(i14, customMode);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, customMode);
                return this;
            }

            public Builder addCustomModes(CustomMode customMode) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    customMode.getClass();
                    ensureCustomModesIsMutable();
                    this.customModes_.add(customMode);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(customMode);
                return this;
            }

            public Builder addCustomModes(int i14, CustomMode.Builder builder) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureCustomModesIsMutable();
                    this.customModes_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigureCustomModeNotification) {
                    return mergeFrom((ConfigureCustomModeNotification) message);
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
                                    CustomMode customMode = (CustomMode) codedInputStream.readMessage(CustomMode.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureCustomModesIsMutable();
                                        this.customModes_.add(customMode);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(customMode);
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
        public ConfigureCustomModeNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConfigureCustomModeNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureCustomModeNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigureCustomModeNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConfigureCustomModeNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ConfigureCustomModeNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigureCustomModeNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConfigureCustomModeNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ ConfigureCustomModeNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConfigureCustomModeNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConfigureCustomModeNotification parseFrom(InputStream inputStream) {
            return (ConfigureCustomModeNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigureCustomModeNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureCustomModeNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigureCustomModeNotification parseFrom(CodedInputStream codedInputStream) {
            return (ConfigureCustomModeNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigureCustomModeNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureCustomModeNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConfigureCustomModeRequest extends GeneratedMessageV3 implements ConfigureCustomModeRequestOrBuilder {
        public static final int CUSTOM_MODES_FIELD_NUMBER = 1;
        private static final ConfigureCustomModeRequest DEFAULT_INSTANCE = new ConfigureCustomModeRequest();

        @Deprecated
        public static final Parser<ConfigureCustomModeRequest> PARSER = new AbstractParser<ConfigureCustomModeRequest>() { // from class: com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeRequest.1
            @Override // com.google.protobuf.Parser
            public ConfigureCustomModeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigureCustomModeRequest.newBuilder();
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
        private List<CustomMode> customModes_;
        private byte memoizedIsInitialized;

        private ConfigureCustomModeRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.customModes_ = Collections.EMPTY_LIST;
        }

        public static ConfigureCustomModeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureCustomModeRequest_descriptor;
        }

        public static Builder newBuilder(ConfigureCustomModeRequest configureCustomModeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configureCustomModeRequest);
        }

        public static ConfigureCustomModeRequest parseDelimitedFrom(InputStream inputStream) {
            return (ConfigureCustomModeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigureCustomModeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigureCustomModeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigureCustomModeRequest)) {
                return super.equals(obj);
            }
            ConfigureCustomModeRequest configureCustomModeRequest = (ConfigureCustomModeRequest) obj;
            return getCustomModesList().equals(configureCustomModeRequest.getCustomModesList()) && getUnknownFields().equals(configureCustomModeRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeRequestOrBuilder
        public CustomMode getCustomModes(int i14) {
            return this.customModes_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeRequestOrBuilder
        public int getCustomModesCount() {
            return this.customModes_.size();
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeRequestOrBuilder
        public List<CustomMode> getCustomModesList() {
            return this.customModes_;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeRequestOrBuilder
        public CustomModeOrBuilder getCustomModesOrBuilder(int i14) {
            return this.customModes_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeRequestOrBuilder
        public List<? extends CustomModeOrBuilder> getCustomModesOrBuilderList() {
            return this.customModes_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigureCustomModeRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.customModes_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.customModes_.get(i15));
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
            if (getCustomModesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCustomModesList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureCustomModeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureCustomModeRequest.class, Builder.class);
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
            return new ConfigureCustomModeRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.customModes_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.customModes_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigureCustomModeRequestOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> customModesBuilder_;
            private List<CustomMode> customModes_;

            private Builder() {
                this.customModes_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(ConfigureCustomModeRequest configureCustomModeRequest) {
            }

            private void buildPartialRepeatedFields(ConfigureCustomModeRequest configureCustomModeRequest) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    configureCustomModeRequest.customModes_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.customModes_ = Collections.unmodifiableList(this.customModes_);
                    this.bitField0_ &= -2;
                }
                configureCustomModeRequest.customModes_ = this.customModes_;
            }

            private void ensureCustomModesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.customModes_ = new ArrayList(this.customModes_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> getCustomModesFieldBuilder() {
                if (this.customModesBuilder_ == null) {
                    this.customModesBuilder_ = new RepeatedFieldBuilderV3<>(this.customModes_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.customModes_ = null;
                }
                return this.customModesBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureCustomModeRequest_descriptor;
            }

            public Builder addAllCustomModes(Iterable<? extends CustomMode> iterable) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureCustomModesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.customModes_);
                onChanged();
                return this;
            }

            public Builder addCustomModes(CustomMode.Builder builder) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureCustomModesIsMutable();
                this.customModes_.add(builder.build());
                onChanged();
                return this;
            }

            public CustomMode.Builder addCustomModesBuilder() {
                return (CustomMode.Builder) getCustomModesFieldBuilder().addBuilder(CustomMode.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureCustomModeRequest build() {
                ConfigureCustomModeRequest configureCustomModeRequestBuildPartial = buildPartial();
                if (configureCustomModeRequestBuildPartial.isInitialized()) {
                    return configureCustomModeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configureCustomModeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureCustomModeRequest buildPartial() {
                ConfigureCustomModeRequest configureCustomModeRequest = new ConfigureCustomModeRequest(this);
                buildPartialRepeatedFields(configureCustomModeRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(configureCustomModeRequest);
                }
                onBuilt();
                return configureCustomModeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.customModes_ = Collections.EMPTY_LIST;
                } else {
                    this.customModes_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder clearCustomModes() {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.customModes_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
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

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeRequestOrBuilder
            public CustomMode getCustomModes(int i14) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.customModes_.get(i14) : (CustomMode) repeatedFieldBuilderV3.getMessage(i14);
            }

            public CustomMode.Builder getCustomModesBuilder(int i14) {
                return (CustomMode.Builder) getCustomModesFieldBuilder().getBuilder(i14);
            }

            public List<CustomMode.Builder> getCustomModesBuilderList() {
                return getCustomModesFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeRequestOrBuilder
            public int getCustomModesCount() {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.customModes_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeRequestOrBuilder
            public List<CustomMode> getCustomModesList() {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.customModes_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeRequestOrBuilder
            public CustomModeOrBuilder getCustomModesOrBuilder(int i14) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.customModes_.get(i14) : (CustomModeOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeRequestOrBuilder
            public List<? extends CustomModeOrBuilder> getCustomModesOrBuilderList() {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.customModes_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureCustomModeRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureCustomModeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureCustomModeRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(ConfigureCustomModeRequest configureCustomModeRequest) {
                if (configureCustomModeRequest == ConfigureCustomModeRequest.getDefaultInstance()) {
                    return this;
                }
                if (this.customModesBuilder_ == null) {
                    if (!configureCustomModeRequest.customModes_.isEmpty()) {
                        if (this.customModes_.isEmpty()) {
                            this.customModes_ = configureCustomModeRequest.customModes_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureCustomModesIsMutable();
                            this.customModes_.addAll(configureCustomModeRequest.customModes_);
                        }
                        onChanged();
                    }
                } else if (!configureCustomModeRequest.customModes_.isEmpty()) {
                    boolean zIsEmpty = this.customModesBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.customModesBuilder_ = null;
                        this.customModes_ = configureCustomModeRequest.customModes_;
                        this.bitField0_ &= -2;
                        this.customModesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getCustomModesFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(configureCustomModeRequest.customModes_);
                    }
                }
                mergeUnknownFields(configureCustomModeRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeCustomModes(int i14) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureCustomModesIsMutable();
                this.customModes_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setCustomModes(int i14, CustomMode.Builder builder) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureCustomModesIsMutable();
                this.customModes_.set(i14, builder.build());
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
            public ConfigureCustomModeRequest getDefaultInstanceForType() {
                return ConfigureCustomModeRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.customModes_ = Collections.EMPTY_LIST;
            }

            public CustomMode.Builder addCustomModesBuilder(int i14) {
                return (CustomMode.Builder) getCustomModesFieldBuilder().addBuilder(i14, CustomMode.getDefaultInstance());
            }

            public Builder addCustomModes(int i14, CustomMode customMode) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    customMode.getClass();
                    ensureCustomModesIsMutable();
                    this.customModes_.add(i14, customMode);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, customMode);
                return this;
            }

            public Builder setCustomModes(int i14, CustomMode customMode) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    customMode.getClass();
                    ensureCustomModesIsMutable();
                    this.customModes_.set(i14, customMode);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, customMode);
                return this;
            }

            public Builder addCustomModes(CustomMode customMode) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    customMode.getClass();
                    ensureCustomModesIsMutable();
                    this.customModes_.add(customMode);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(customMode);
                return this;
            }

            public Builder addCustomModes(int i14, CustomMode.Builder builder) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureCustomModesIsMutable();
                    this.customModes_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigureCustomModeRequest) {
                    return mergeFrom((ConfigureCustomModeRequest) message);
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
                                    CustomMode customMode = (CustomMode) codedInputStream.readMessage(CustomMode.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureCustomModesIsMutable();
                                        this.customModes_.add(customMode);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(customMode);
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
        public ConfigureCustomModeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConfigureCustomModeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureCustomModeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigureCustomModeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConfigureCustomModeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ConfigureCustomModeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigureCustomModeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConfigureCustomModeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ ConfigureCustomModeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConfigureCustomModeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConfigureCustomModeRequest parseFrom(InputStream inputStream) {
            return (ConfigureCustomModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigureCustomModeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureCustomModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigureCustomModeRequest parseFrom(CodedInputStream codedInputStream) {
            return (ConfigureCustomModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigureCustomModeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureCustomModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConfigureCustomModeResponse extends GeneratedMessageV3 implements ConfigureCustomModeResponseOrBuilder {
        public static final int CUSTOM_MODES_FIELD_NUMBER = 2;
        private static final ConfigureCustomModeResponse DEFAULT_INSTANCE = new ConfigureCustomModeResponse();

        @Deprecated
        public static final Parser<ConfigureCustomModeResponse> PARSER = new AbstractParser<ConfigureCustomModeResponse>() { // from class: com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeResponse.1
            @Override // com.google.protobuf.Parser
            public ConfigureCustomModeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigureCustomModeResponse.newBuilder();
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
        private List<CustomMode> customModes_;
        private byte memoizedIsInitialized;
        private int status_;

        private ConfigureCustomModeResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.customModes_ = Collections.EMPTY_LIST;
        }

        public static ConfigureCustomModeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureCustomModeResponse_descriptor;
        }

        public static Builder newBuilder(ConfigureCustomModeResponse configureCustomModeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configureCustomModeResponse);
        }

        public static ConfigureCustomModeResponse parseDelimitedFrom(InputStream inputStream) {
            return (ConfigureCustomModeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigureCustomModeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigureCustomModeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigureCustomModeResponse)) {
                return super.equals(obj);
            }
            ConfigureCustomModeResponse configureCustomModeResponse = (ConfigureCustomModeResponse) obj;
            if (hasStatus() != configureCustomModeResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == configureCustomModeResponse.status_) && getCustomModesList().equals(configureCustomModeResponse.getCustomModesList()) && getUnknownFields().equals(configureCustomModeResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeResponseOrBuilder
        public CustomMode getCustomModes(int i14) {
            return this.customModes_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeResponseOrBuilder
        public int getCustomModesCount() {
            return this.customModes_.size();
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeResponseOrBuilder
        public List<CustomMode> getCustomModesList() {
            return this.customModes_;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeResponseOrBuilder
        public CustomModeOrBuilder getCustomModesOrBuilder(int i14) {
            return this.customModes_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeResponseOrBuilder
        public List<? extends CustomModeOrBuilder> getCustomModesOrBuilderList() {
            return this.customModes_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigureCustomModeResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            for (int i15 = 0; i15 < this.customModes_.size(); i15++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.customModes_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeResponseOrBuilder
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
            if (getCustomModesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getCustomModesList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureCustomModeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureCustomModeResponse.class, Builder.class);
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
            return new ConfigureCustomModeResponse();
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
            for (int i14 = 0; i14 < this.customModes_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.customModes_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigureCustomModeResponseOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> customModesBuilder_;
            private List<CustomMode> customModes_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                this.customModes_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(ConfigureCustomModeResponse configureCustomModeResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    configureCustomModeResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                configureCustomModeResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(ConfigureCustomModeResponse configureCustomModeResponse) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    configureCustomModeResponse.customModes_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.customModes_ = Collections.unmodifiableList(this.customModes_);
                    this.bitField0_ &= -3;
                }
                configureCustomModeResponse.customModes_ = this.customModes_;
            }

            private void ensureCustomModesIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.customModes_ = new ArrayList(this.customModes_);
                    this.bitField0_ |= 2;
                }
            }

            private RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> getCustomModesFieldBuilder() {
                if (this.customModesBuilder_ == null) {
                    this.customModesBuilder_ = new RepeatedFieldBuilderV3<>(this.customModes_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.customModes_ = null;
                }
                return this.customModesBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureCustomModeResponse_descriptor;
            }

            public Builder addAllCustomModes(Iterable<? extends CustomMode> iterable) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureCustomModesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.customModes_);
                onChanged();
                return this;
            }

            public Builder addCustomModes(CustomMode.Builder builder) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureCustomModesIsMutable();
                this.customModes_.add(builder.build());
                onChanged();
                return this;
            }

            public CustomMode.Builder addCustomModesBuilder() {
                return (CustomMode.Builder) getCustomModesFieldBuilder().addBuilder(CustomMode.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureCustomModeResponse build() {
                ConfigureCustomModeResponse configureCustomModeResponseBuildPartial = buildPartial();
                if (configureCustomModeResponseBuildPartial.isInitialized()) {
                    return configureCustomModeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configureCustomModeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureCustomModeResponse buildPartial() {
                ConfigureCustomModeResponse configureCustomModeResponse = new ConfigureCustomModeResponse(this);
                buildPartialRepeatedFields(configureCustomModeResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(configureCustomModeResponse);
                }
                onBuilt();
                return configureCustomModeResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.customModes_ = Collections.EMPTY_LIST;
                } else {
                    this.customModes_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                return this;
            }

            public Builder clearCustomModes() {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.customModes_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
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

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeResponseOrBuilder
            public CustomMode getCustomModes(int i14) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.customModes_.get(i14) : (CustomMode) repeatedFieldBuilderV3.getMessage(i14);
            }

            public CustomMode.Builder getCustomModesBuilder(int i14) {
                return (CustomMode.Builder) getCustomModesFieldBuilder().getBuilder(i14);
            }

            public List<CustomMode.Builder> getCustomModesBuilderList() {
                return getCustomModesFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeResponseOrBuilder
            public int getCustomModesCount() {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.customModes_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeResponseOrBuilder
            public List<CustomMode> getCustomModesList() {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.customModes_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeResponseOrBuilder
            public CustomModeOrBuilder getCustomModesOrBuilder(int i14) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.customModes_.get(i14) : (CustomModeOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeResponseOrBuilder
            public List<? extends CustomModeOrBuilder> getCustomModesOrBuilderList() {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.customModes_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureCustomModeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureCustomModeResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureCustomModeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureCustomModeResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(ConfigureCustomModeResponse configureCustomModeResponse) {
                if (configureCustomModeResponse == ConfigureCustomModeResponse.getDefaultInstance()) {
                    return this;
                }
                if (configureCustomModeResponse.hasStatus()) {
                    setStatus(configureCustomModeResponse.getStatus());
                }
                if (this.customModesBuilder_ == null) {
                    if (!configureCustomModeResponse.customModes_.isEmpty()) {
                        if (this.customModes_.isEmpty()) {
                            this.customModes_ = configureCustomModeResponse.customModes_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureCustomModesIsMutable();
                            this.customModes_.addAll(configureCustomModeResponse.customModes_);
                        }
                        onChanged();
                    }
                } else if (!configureCustomModeResponse.customModes_.isEmpty()) {
                    boolean zIsEmpty = this.customModesBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.customModesBuilder_ = null;
                        this.customModes_ = configureCustomModeResponse.customModes_;
                        this.bitField0_ &= -3;
                        this.customModesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getCustomModesFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(configureCustomModeResponse.customModes_);
                    }
                }
                mergeUnknownFields(configureCustomModeResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeCustomModes(int i14) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureCustomModesIsMutable();
                this.customModes_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setCustomModes(int i14, CustomMode.Builder builder) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureCustomModesIsMutable();
                this.customModes_.set(i14, builder.build());
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
            public ConfigureCustomModeResponse getDefaultInstanceForType() {
                return ConfigureCustomModeResponse.getDefaultInstance();
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
                this.customModes_ = Collections.EMPTY_LIST;
            }

            public CustomMode.Builder addCustomModesBuilder(int i14) {
                return (CustomMode.Builder) getCustomModesFieldBuilder().addBuilder(i14, CustomMode.getDefaultInstance());
            }

            public Builder addCustomModes(int i14, CustomMode customMode) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    customMode.getClass();
                    ensureCustomModesIsMutable();
                    this.customModes_.add(i14, customMode);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, customMode);
                return this;
            }

            public Builder setCustomModes(int i14, CustomMode customMode) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    customMode.getClass();
                    ensureCustomModesIsMutable();
                    this.customModes_.set(i14, customMode);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, customMode);
                return this;
            }

            public Builder addCustomModes(CustomMode customMode) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    customMode.getClass();
                    ensureCustomModesIsMutable();
                    this.customModes_.add(customMode);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(customMode);
                return this;
            }

            public Builder addCustomModes(int i14, CustomMode.Builder builder) {
                RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureCustomModesIsMutable();
                    this.customModes_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigureCustomModeResponse) {
                    return mergeFrom((ConfigureCustomModeResponse) message);
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
                                    CustomMode customMode = (CustomMode) codedInputStream.readMessage(CustomMode.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<CustomMode, CustomMode.Builder, CustomModeOrBuilder> repeatedFieldBuilderV3 = this.customModesBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureCustomModesIsMutable();
                                        this.customModes_.add(customMode);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(customMode);
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
        public ConfigureCustomModeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConfigureCustomModeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureCustomModeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigureCustomModeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConfigureCustomModeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigureCustomModeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConfigureCustomModeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConfigureCustomModeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private ConfigureCustomModeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigureCustomModeResponse parseFrom(InputStream inputStream) {
            return (ConfigureCustomModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigureCustomModeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureCustomModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ ConfigureCustomModeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConfigureCustomModeResponse parseFrom(CodedInputStream codedInputStream) {
            return (ConfigureCustomModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigureCustomModeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureCustomModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConfigureRotationNotification extends GeneratedMessageV3 implements ConfigureRotationNotificationOrBuilder {
        public static final int ROTATION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<Integer> rotation_;
        private static final Internal.ListAdapter.Converter<Integer, Mode> rotation_converter_ = new Internal.ListAdapter.Converter<Integer, Mode>() { // from class: com.garmin.proto.generated.GDIBikeLight.ConfigureRotationNotification.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public Mode convert(Integer num) {
                Mode modeForNumber = Mode.forNumber(num.intValue());
                return modeForNumber == null ? Mode.MODE_UNKNOWN : modeForNumber;
            }
        };
        private static final ConfigureRotationNotification DEFAULT_INSTANCE = new ConfigureRotationNotification();

        @Deprecated
        public static final Parser<ConfigureRotationNotification> PARSER = new AbstractParser<ConfigureRotationNotification>() { // from class: com.garmin.proto.generated.GDIBikeLight.ConfigureRotationNotification.2
            @Override // com.google.protobuf.Parser
            public ConfigureRotationNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigureRotationNotification.newBuilder();
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

        private ConfigureRotationNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.rotation_ = Collections.EMPTY_LIST;
        }

        public static ConfigureRotationNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureRotationNotification_descriptor;
        }

        public static Builder newBuilder(ConfigureRotationNotification configureRotationNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configureRotationNotification);
        }

        public static ConfigureRotationNotification parseDelimitedFrom(InputStream inputStream) {
            return (ConfigureRotationNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigureRotationNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigureRotationNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigureRotationNotification)) {
                return super.equals(obj);
            }
            ConfigureRotationNotification configureRotationNotification = (ConfigureRotationNotification) obj;
            return this.rotation_.equals(configureRotationNotification.rotation_) && getUnknownFields().equals(configureRotationNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigureRotationNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureRotationNotificationOrBuilder
        public Mode getRotation(int i14) {
            return rotation_converter_.convert(this.rotation_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureRotationNotificationOrBuilder
        public int getRotationCount() {
            return this.rotation_.size();
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureRotationNotificationOrBuilder
        public List<Mode> getRotationList() {
            return new Internal.ListAdapter(this.rotation_, rotation_converter_);
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
                int size = this.rotation_.size();
                List<Integer> list = this.rotation_;
                if (i15 >= size) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list.size() + iA;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getRotationCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.rotation_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureRotationNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureRotationNotification.class, Builder.class);
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
            return new ConfigureRotationNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iF = 0;
            while (iF < this.rotation_.size()) {
                iF = f3.f(this.rotation_.get(iF), codedOutputStream, 1, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigureRotationNotificationOrBuilder {
            private int bitField0_;
            private List<Integer> rotation_;

            private Builder() {
                this.rotation_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(ConfigureRotationNotification configureRotationNotification) {
            }

            private void buildPartialRepeatedFields(ConfigureRotationNotification configureRotationNotification) {
                if ((this.bitField0_ & 1) != 0) {
                    this.rotation_ = Collections.unmodifiableList(this.rotation_);
                    this.bitField0_ &= -2;
                }
                configureRotationNotification.rotation_ = this.rotation_;
            }

            private void ensureRotationIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.rotation_ = new ArrayList(this.rotation_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureRotationNotification_descriptor;
            }

            public Builder addAllRotation(Iterable<? extends Mode> iterable) {
                ensureRotationIsMutable();
                Iterator<? extends Mode> it = iterable.iterator();
                while (it.hasNext()) {
                    this.rotation_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addRotation(Mode mode) {
                mode.getClass();
                ensureRotationIsMutable();
                this.rotation_.add(Integer.valueOf(mode.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureRotationNotification build() {
                ConfigureRotationNotification configureRotationNotificationBuildPartial = buildPartial();
                if (configureRotationNotificationBuildPartial.isInitialized()) {
                    return configureRotationNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configureRotationNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureRotationNotification buildPartial() {
                ConfigureRotationNotification configureRotationNotification = new ConfigureRotationNotification(this);
                buildPartialRepeatedFields(configureRotationNotification);
                if (this.bitField0_ != 0) {
                    buildPartial0(configureRotationNotification);
                }
                onBuilt();
                return configureRotationNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.rotation_ = Collections.EMPTY_LIST;
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

            public Builder clearRotation() {
                this.rotation_ = Collections.EMPTY_LIST;
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
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureRotationNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureRotationNotificationOrBuilder
            public Mode getRotation(int i14) {
                return (Mode) ConfigureRotationNotification.rotation_converter_.convert(this.rotation_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureRotationNotificationOrBuilder
            public int getRotationCount() {
                return this.rotation_.size();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureRotationNotificationOrBuilder
            public List<Mode> getRotationList() {
                return new Internal.ListAdapter(this.rotation_, ConfigureRotationNotification.rotation_converter_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureRotationNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureRotationNotification.class, Builder.class);
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
                                        ensureRotationIsMutable();
                                        this.rotation_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (Mode.forNumber(i15) == null) {
                                            mergeUnknownVarintField(1, i15);
                                        } else {
                                            ensureRotationIsMutable();
                                            this.rotation_.add(Integer.valueOf(i15));
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

            public Builder setRotation(int i14, Mode mode) {
                mode.getClass();
                ensureRotationIsMutable();
                this.rotation_.set(i14, Integer.valueOf(mode.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConfigureRotationNotification getDefaultInstanceForType() {
                return ConfigureRotationNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.rotation_ = Collections.EMPTY_LIST;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigureRotationNotification) {
                    return mergeFrom((ConfigureRotationNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConfigureRotationNotification configureRotationNotification) {
                if (configureRotationNotification == ConfigureRotationNotification.getDefaultInstance()) {
                    return this;
                }
                if (!configureRotationNotification.rotation_.isEmpty()) {
                    if (this.rotation_.isEmpty()) {
                        this.rotation_ = configureRotationNotification.rotation_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRotationIsMutable();
                        this.rotation_.addAll(configureRotationNotification.rotation_);
                    }
                    onChanged();
                }
                mergeUnknownFields(configureRotationNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConfigureRotationNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConfigureRotationNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureRotationNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigureRotationNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConfigureRotationNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ConfigureRotationNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigureRotationNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConfigureRotationNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ ConfigureRotationNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConfigureRotationNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConfigureRotationNotification parseFrom(InputStream inputStream) {
            return (ConfigureRotationNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigureRotationNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureRotationNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigureRotationNotification parseFrom(CodedInputStream codedInputStream) {
            return (ConfigureRotationNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigureRotationNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureRotationNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConfigureRotationRequest extends GeneratedMessageV3 implements ConfigureRotationRequestOrBuilder {
        public static final int ROTATION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<Integer> rotation_;
        private static final Internal.ListAdapter.Converter<Integer, Mode> rotation_converter_ = new Internal.ListAdapter.Converter<Integer, Mode>() { // from class: com.garmin.proto.generated.GDIBikeLight.ConfigureRotationRequest.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public Mode convert(Integer num) {
                Mode modeForNumber = Mode.forNumber(num.intValue());
                return modeForNumber == null ? Mode.MODE_UNKNOWN : modeForNumber;
            }
        };
        private static final ConfigureRotationRequest DEFAULT_INSTANCE = new ConfigureRotationRequest();

        @Deprecated
        public static final Parser<ConfigureRotationRequest> PARSER = new AbstractParser<ConfigureRotationRequest>() { // from class: com.garmin.proto.generated.GDIBikeLight.ConfigureRotationRequest.2
            @Override // com.google.protobuf.Parser
            public ConfigureRotationRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigureRotationRequest.newBuilder();
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

        private ConfigureRotationRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.rotation_ = Collections.EMPTY_LIST;
        }

        public static ConfigureRotationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureRotationRequest_descriptor;
        }

        public static Builder newBuilder(ConfigureRotationRequest configureRotationRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configureRotationRequest);
        }

        public static ConfigureRotationRequest parseDelimitedFrom(InputStream inputStream) {
            return (ConfigureRotationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigureRotationRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigureRotationRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigureRotationRequest)) {
                return super.equals(obj);
            }
            ConfigureRotationRequest configureRotationRequest = (ConfigureRotationRequest) obj;
            return this.rotation_.equals(configureRotationRequest.rotation_) && getUnknownFields().equals(configureRotationRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigureRotationRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureRotationRequestOrBuilder
        public Mode getRotation(int i14) {
            return rotation_converter_.convert(this.rotation_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureRotationRequestOrBuilder
        public int getRotationCount() {
            return this.rotation_.size();
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureRotationRequestOrBuilder
        public List<Mode> getRotationList() {
            return new Internal.ListAdapter(this.rotation_, rotation_converter_);
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
                int size = this.rotation_.size();
                List<Integer> list = this.rotation_;
                if (i15 >= size) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list.size() + iA;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getRotationCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.rotation_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureRotationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureRotationRequest.class, Builder.class);
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
            return new ConfigureRotationRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iF = 0;
            while (iF < this.rotation_.size()) {
                iF = f3.f(this.rotation_.get(iF), codedOutputStream, 1, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigureRotationRequestOrBuilder {
            private int bitField0_;
            private List<Integer> rotation_;

            private Builder() {
                this.rotation_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(ConfigureRotationRequest configureRotationRequest) {
            }

            private void buildPartialRepeatedFields(ConfigureRotationRequest configureRotationRequest) {
                if ((this.bitField0_ & 1) != 0) {
                    this.rotation_ = Collections.unmodifiableList(this.rotation_);
                    this.bitField0_ &= -2;
                }
                configureRotationRequest.rotation_ = this.rotation_;
            }

            private void ensureRotationIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.rotation_ = new ArrayList(this.rotation_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureRotationRequest_descriptor;
            }

            public Builder addAllRotation(Iterable<? extends Mode> iterable) {
                ensureRotationIsMutable();
                Iterator<? extends Mode> it = iterable.iterator();
                while (it.hasNext()) {
                    this.rotation_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addRotation(Mode mode) {
                mode.getClass();
                ensureRotationIsMutable();
                this.rotation_.add(Integer.valueOf(mode.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureRotationRequest build() {
                ConfigureRotationRequest configureRotationRequestBuildPartial = buildPartial();
                if (configureRotationRequestBuildPartial.isInitialized()) {
                    return configureRotationRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configureRotationRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureRotationRequest buildPartial() {
                ConfigureRotationRequest configureRotationRequest = new ConfigureRotationRequest(this);
                buildPartialRepeatedFields(configureRotationRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(configureRotationRequest);
                }
                onBuilt();
                return configureRotationRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.rotation_ = Collections.EMPTY_LIST;
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

            public Builder clearRotation() {
                this.rotation_ = Collections.EMPTY_LIST;
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
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureRotationRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureRotationRequestOrBuilder
            public Mode getRotation(int i14) {
                return (Mode) ConfigureRotationRequest.rotation_converter_.convert(this.rotation_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureRotationRequestOrBuilder
            public int getRotationCount() {
                return this.rotation_.size();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureRotationRequestOrBuilder
            public List<Mode> getRotationList() {
                return new Internal.ListAdapter(this.rotation_, ConfigureRotationRequest.rotation_converter_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureRotationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureRotationRequest.class, Builder.class);
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
                                        ensureRotationIsMutable();
                                        this.rotation_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (Mode.forNumber(i15) == null) {
                                            mergeUnknownVarintField(1, i15);
                                        } else {
                                            ensureRotationIsMutable();
                                            this.rotation_.add(Integer.valueOf(i15));
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

            public Builder setRotation(int i14, Mode mode) {
                mode.getClass();
                ensureRotationIsMutable();
                this.rotation_.set(i14, Integer.valueOf(mode.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConfigureRotationRequest getDefaultInstanceForType() {
                return ConfigureRotationRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.rotation_ = Collections.EMPTY_LIST;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigureRotationRequest) {
                    return mergeFrom((ConfigureRotationRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConfigureRotationRequest configureRotationRequest) {
                if (configureRotationRequest == ConfigureRotationRequest.getDefaultInstance()) {
                    return this;
                }
                if (!configureRotationRequest.rotation_.isEmpty()) {
                    if (this.rotation_.isEmpty()) {
                        this.rotation_ = configureRotationRequest.rotation_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRotationIsMutable();
                        this.rotation_.addAll(configureRotationRequest.rotation_);
                    }
                    onChanged();
                }
                mergeUnknownFields(configureRotationRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConfigureRotationRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConfigureRotationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureRotationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigureRotationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConfigureRotationRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ConfigureRotationRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigureRotationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConfigureRotationRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ ConfigureRotationRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConfigureRotationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConfigureRotationRequest parseFrom(InputStream inputStream) {
            return (ConfigureRotationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigureRotationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureRotationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigureRotationRequest parseFrom(CodedInputStream codedInputStream) {
            return (ConfigureRotationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigureRotationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureRotationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConfigureRotationResponse extends GeneratedMessageV3 implements ConfigureRotationResponseOrBuilder {
        public static final int ROTATION_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private List<Integer> rotation_;
        private int status_;
        private static final Internal.ListAdapter.Converter<Integer, Mode> rotation_converter_ = new Internal.ListAdapter.Converter<Integer, Mode>() { // from class: com.garmin.proto.generated.GDIBikeLight.ConfigureRotationResponse.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public Mode convert(Integer num) {
                Mode modeForNumber = Mode.forNumber(num.intValue());
                return modeForNumber == null ? Mode.MODE_UNKNOWN : modeForNumber;
            }
        };
        private static final ConfigureRotationResponse DEFAULT_INSTANCE = new ConfigureRotationResponse();

        @Deprecated
        public static final Parser<ConfigureRotationResponse> PARSER = new AbstractParser<ConfigureRotationResponse>() { // from class: com.garmin.proto.generated.GDIBikeLight.ConfigureRotationResponse.2
            @Override // com.google.protobuf.Parser
            public ConfigureRotationResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigureRotationResponse.newBuilder();
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

        private ConfigureRotationResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.rotation_ = Collections.EMPTY_LIST;
        }

        public static ConfigureRotationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureRotationResponse_descriptor;
        }

        public static Builder newBuilder(ConfigureRotationResponse configureRotationResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configureRotationResponse);
        }

        public static ConfigureRotationResponse parseDelimitedFrom(InputStream inputStream) {
            return (ConfigureRotationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigureRotationResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigureRotationResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigureRotationResponse)) {
                return super.equals(obj);
            }
            ConfigureRotationResponse configureRotationResponse = (ConfigureRotationResponse) obj;
            if (hasStatus() != configureRotationResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == configureRotationResponse.status_) && this.rotation_.equals(configureRotationResponse.rotation_) && getUnknownFields().equals(configureRotationResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigureRotationResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureRotationResponseOrBuilder
        public Mode getRotation(int i14) {
            return rotation_converter_.convert(this.rotation_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureRotationResponseOrBuilder
        public int getRotationCount() {
            return this.rotation_.size();
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureRotationResponseOrBuilder
        public List<Mode> getRotationList() {
            return new Internal.ListAdapter(this.rotation_, rotation_converter_);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int i15 = 0;
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            int iA = 0;
            while (true) {
                int size = this.rotation_.size();
                List<Integer> list = this.rotation_;
                if (i15 >= size) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list.size() + iComputeEnumSize + iA;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureRotationResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureRotationResponseOrBuilder
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
            if (getRotationCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.rotation_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureRotationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureRotationResponse.class, Builder.class);
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
            return new ConfigureRotationResponse();
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
            int iF = 0;
            while (iF < this.rotation_.size()) {
                iF = f3.f(this.rotation_.get(iF), codedOutputStream, 2, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigureRotationResponseOrBuilder {
            private int bitField0_;
            private List<Integer> rotation_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                this.rotation_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(ConfigureRotationResponse configureRotationResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    configureRotationResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                configureRotationResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(ConfigureRotationResponse configureRotationResponse) {
                if ((this.bitField0_ & 2) != 0) {
                    this.rotation_ = Collections.unmodifiableList(this.rotation_);
                    this.bitField0_ &= -3;
                }
                configureRotationResponse.rotation_ = this.rotation_;
            }

            private void ensureRotationIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.rotation_ = new ArrayList(this.rotation_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureRotationResponse_descriptor;
            }

            public Builder addAllRotation(Iterable<? extends Mode> iterable) {
                ensureRotationIsMutable();
                Iterator<? extends Mode> it = iterable.iterator();
                while (it.hasNext()) {
                    this.rotation_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addRotation(Mode mode) {
                mode.getClass();
                ensureRotationIsMutable();
                this.rotation_.add(Integer.valueOf(mode.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureRotationResponse build() {
                ConfigureRotationResponse configureRotationResponseBuildPartial = buildPartial();
                if (configureRotationResponseBuildPartial.isInitialized()) {
                    return configureRotationResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configureRotationResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureRotationResponse buildPartial() {
                ConfigureRotationResponse configureRotationResponse = new ConfigureRotationResponse(this);
                buildPartialRepeatedFields(configureRotationResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(configureRotationResponse);
                }
                onBuilt();
                return configureRotationResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.rotation_ = Collections.EMPTY_LIST;
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

            public Builder clearRotation() {
                this.rotation_ = Collections.EMPTY_LIST;
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
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureRotationResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureRotationResponseOrBuilder
            public Mode getRotation(int i14) {
                return (Mode) ConfigureRotationResponse.rotation_converter_.convert(this.rotation_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureRotationResponseOrBuilder
            public int getRotationCount() {
                return this.rotation_.size();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureRotationResponseOrBuilder
            public List<Mode> getRotationList() {
                return new Internal.ListAdapter(this.rotation_, ConfigureRotationResponse.rotation_converter_);
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureRotationResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureRotationResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureRotationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureRotationResponse.class, Builder.class);
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
                                    if (Mode.forNumber(i15) == null) {
                                        mergeUnknownVarintField(2, i15);
                                    } else {
                                        ensureRotationIsMutable();
                                        this.rotation_.add(Integer.valueOf(i15));
                                    }
                                } else if (tag == 18) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i16 = codedInputStream.readEnum();
                                        if (Mode.forNumber(i16) == null) {
                                            mergeUnknownVarintField(2, i16);
                                        } else {
                                            ensureRotationIsMutable();
                                            this.rotation_.add(Integer.valueOf(i16));
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

            public Builder setRotation(int i14, Mode mode) {
                mode.getClass();
                ensureRotationIsMutable();
                this.rotation_.set(i14, Integer.valueOf(mode.getNumber()));
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
            public ConfigureRotationResponse getDefaultInstanceForType() {
                return ConfigureRotationResponse.getDefaultInstance();
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
                this.rotation_ = Collections.EMPTY_LIST;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigureRotationResponse) {
                    return mergeFrom((ConfigureRotationResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConfigureRotationResponse configureRotationResponse) {
                if (configureRotationResponse == ConfigureRotationResponse.getDefaultInstance()) {
                    return this;
                }
                if (configureRotationResponse.hasStatus()) {
                    setStatus(configureRotationResponse.getStatus());
                }
                if (!configureRotationResponse.rotation_.isEmpty()) {
                    if (this.rotation_.isEmpty()) {
                        this.rotation_ = configureRotationResponse.rotation_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureRotationIsMutable();
                        this.rotation_.addAll(configureRotationResponse.rotation_);
                    }
                    onChanged();
                }
                mergeUnknownFields(configureRotationResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConfigureRotationResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConfigureRotationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureRotationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigureRotationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConfigureRotationResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigureRotationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConfigureRotationResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConfigureRotationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private ConfigureRotationResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigureRotationResponse parseFrom(InputStream inputStream) {
            return (ConfigureRotationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigureRotationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureRotationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ ConfigureRotationResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConfigureRotationResponse parseFrom(CodedInputStream codedInputStream) {
            return (ConfigureRotationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigureRotationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureRotationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConfigureSettings extends GeneratedMessageV3 implements ConfigureSettingsOrBuilder {
        public static final int AUTO_BEAM_ADJUST_FIELD_NUMBER = 3;
        public static final int BRAKE_DETECTION_FIELD_NUMBER = 2;
        private static final ConfigureSettings DEFAULT_INSTANCE = new ConfigureSettings();

        @Deprecated
        public static final Parser<ConfigureSettings> PARSER = new AbstractParser<ConfigureSettings>() { // from class: com.garmin.proto.generated.GDIBikeLight.ConfigureSettings.1
            @Override // com.google.protobuf.Parser
            public ConfigureSettings parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigureSettings.newBuilder();
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
        public static final int TARGET_INDICATION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private AutoBeamAdjustSettings autoBeamAdjust_;
        private int bitField0_;
        private int brakeDetection_;
        private byte memoizedIsInitialized;
        private boolean targetIndication_;

        private ConfigureSettings(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.targetIndication_ = false;
            this.brakeDetection_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigureSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureSettings_descriptor;
        }

        public static Builder newBuilder(ConfigureSettings configureSettings) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configureSettings);
        }

        public static ConfigureSettings parseDelimitedFrom(InputStream inputStream) {
            return (ConfigureSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigureSettings parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigureSettings> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigureSettings)) {
                return super.equals(obj);
            }
            ConfigureSettings configureSettings = (ConfigureSettings) obj;
            if (hasTargetIndication() != configureSettings.hasTargetIndication()) {
                return false;
            }
            if ((hasTargetIndication() && getTargetIndication() != configureSettings.getTargetIndication()) || hasBrakeDetection() != configureSettings.hasBrakeDetection()) {
                return false;
            }
            if ((!hasBrakeDetection() || this.brakeDetection_ == configureSettings.brakeDetection_) && hasAutoBeamAdjust() == configureSettings.hasAutoBeamAdjust()) {
                return (!hasAutoBeamAdjust() || getAutoBeamAdjust().equals(configureSettings.getAutoBeamAdjust())) && getUnknownFields().equals(configureSettings.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsOrBuilder
        public AutoBeamAdjustSettings getAutoBeamAdjust() {
            AutoBeamAdjustSettings autoBeamAdjustSettings = this.autoBeamAdjust_;
            return autoBeamAdjustSettings == null ? AutoBeamAdjustSettings.getDefaultInstance() : autoBeamAdjustSettings;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsOrBuilder
        public AutoBeamAdjustSettingsOrBuilder getAutoBeamAdjustOrBuilder() {
            AutoBeamAdjustSettings autoBeamAdjustSettings = this.autoBeamAdjust_;
            return autoBeamAdjustSettings == null ? AutoBeamAdjustSettings.getDefaultInstance() : autoBeamAdjustSettings;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsOrBuilder
        public BrakeDetection getBrakeDetection() {
            BrakeDetection brakeDetectionForNumber = BrakeDetection.forNumber(this.brakeDetection_);
            return brakeDetectionForNumber == null ? BrakeDetection.BRAKE_DETECTION_UNKNOWN : brakeDetectionForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigureSettings> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.targetIndication_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(2, this.brakeDetection_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeMessageSize(3, getAutoBeamAdjust());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsOrBuilder
        public boolean getTargetIndication() {
            return this.targetIndication_;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsOrBuilder
        public boolean hasAutoBeamAdjust() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsOrBuilder
        public boolean hasBrakeDetection() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsOrBuilder
        public boolean hasTargetIndication() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTargetIndication()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getTargetIndication());
            }
            if (hasBrakeDetection()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.brakeDetection_;
            }
            if (hasAutoBeamAdjust()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getAutoBeamAdjust().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureSettings.class, Builder.class);
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
            return new ConfigureSettings();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.targetIndication_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.brakeDetection_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getAutoBeamAdjust());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigureSettingsOrBuilder {
            private SingleFieldBuilderV3<AutoBeamAdjustSettings, AutoBeamAdjustSettings.Builder, AutoBeamAdjustSettingsOrBuilder> autoBeamAdjustBuilder_;
            private AutoBeamAdjustSettings autoBeamAdjust_;
            private int bitField0_;
            private int brakeDetection_;
            private boolean targetIndication_;

            private Builder() {
                this.brakeDetection_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConfigureSettings configureSettings) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    configureSettings.targetIndication_ = this.targetIndication_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    configureSettings.brakeDetection_ = this.brakeDetection_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<AutoBeamAdjustSettings, AutoBeamAdjustSettings.Builder, AutoBeamAdjustSettingsOrBuilder> singleFieldBuilderV3 = this.autoBeamAdjustBuilder_;
                    configureSettings.autoBeamAdjust_ = singleFieldBuilderV3 == null ? this.autoBeamAdjust_ : (AutoBeamAdjustSettings) singleFieldBuilderV3.build();
                    i14 |= 4;
                }
                configureSettings.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<AutoBeamAdjustSettings, AutoBeamAdjustSettings.Builder, AutoBeamAdjustSettingsOrBuilder> getAutoBeamAdjustFieldBuilder() {
                if (this.autoBeamAdjustBuilder_ == null) {
                    this.autoBeamAdjustBuilder_ = new SingleFieldBuilderV3<>(getAutoBeamAdjust(), getParentForChildren(), isClean());
                    this.autoBeamAdjust_ = null;
                }
                return this.autoBeamAdjustBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureSettings_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getAutoBeamAdjustFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureSettings build() {
                ConfigureSettings configureSettingsBuildPartial = buildPartial();
                if (configureSettingsBuildPartial.isInitialized()) {
                    return configureSettingsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configureSettingsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureSettings buildPartial() {
                ConfigureSettings configureSettings = new ConfigureSettings(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(configureSettings);
                }
                onBuilt();
                return configureSettings;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.targetIndication_ = false;
                this.brakeDetection_ = 0;
                this.autoBeamAdjust_ = null;
                SingleFieldBuilderV3<AutoBeamAdjustSettings, AutoBeamAdjustSettings.Builder, AutoBeamAdjustSettingsOrBuilder> singleFieldBuilderV3 = this.autoBeamAdjustBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.autoBeamAdjustBuilder_ = null;
                }
                return this;
            }

            public Builder clearAutoBeamAdjust() {
                this.bitField0_ &= -5;
                this.autoBeamAdjust_ = null;
                SingleFieldBuilderV3<AutoBeamAdjustSettings, AutoBeamAdjustSettings.Builder, AutoBeamAdjustSettingsOrBuilder> singleFieldBuilderV3 = this.autoBeamAdjustBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.autoBeamAdjustBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearBrakeDetection() {
                this.bitField0_ &= -3;
                this.brakeDetection_ = 0;
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

            public Builder clearTargetIndication() {
                this.bitField0_ &= -2;
                this.targetIndication_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsOrBuilder
            public AutoBeamAdjustSettings getAutoBeamAdjust() {
                SingleFieldBuilderV3<AutoBeamAdjustSettings, AutoBeamAdjustSettings.Builder, AutoBeamAdjustSettingsOrBuilder> singleFieldBuilderV3 = this.autoBeamAdjustBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AutoBeamAdjustSettings) singleFieldBuilderV3.getMessage();
                }
                AutoBeamAdjustSettings autoBeamAdjustSettings = this.autoBeamAdjust_;
                return autoBeamAdjustSettings == null ? AutoBeamAdjustSettings.getDefaultInstance() : autoBeamAdjustSettings;
            }

            public AutoBeamAdjustSettings.Builder getAutoBeamAdjustBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (AutoBeamAdjustSettings.Builder) getAutoBeamAdjustFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsOrBuilder
            public AutoBeamAdjustSettingsOrBuilder getAutoBeamAdjustOrBuilder() {
                SingleFieldBuilderV3<AutoBeamAdjustSettings, AutoBeamAdjustSettings.Builder, AutoBeamAdjustSettingsOrBuilder> singleFieldBuilderV3 = this.autoBeamAdjustBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AutoBeamAdjustSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AutoBeamAdjustSettings autoBeamAdjustSettings = this.autoBeamAdjust_;
                return autoBeamAdjustSettings == null ? AutoBeamAdjustSettings.getDefaultInstance() : autoBeamAdjustSettings;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsOrBuilder
            public BrakeDetection getBrakeDetection() {
                BrakeDetection brakeDetectionForNumber = BrakeDetection.forNumber(this.brakeDetection_);
                return brakeDetectionForNumber == null ? BrakeDetection.BRAKE_DETECTION_UNKNOWN : brakeDetectionForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureSettings_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsOrBuilder
            public boolean getTargetIndication() {
                return this.targetIndication_;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsOrBuilder
            public boolean hasAutoBeamAdjust() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsOrBuilder
            public boolean hasBrakeDetection() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsOrBuilder
            public boolean hasTargetIndication() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureSettings.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAutoBeamAdjust(AutoBeamAdjustSettings autoBeamAdjustSettings) {
                AutoBeamAdjustSettings autoBeamAdjustSettings2;
                SingleFieldBuilderV3<AutoBeamAdjustSettings, AutoBeamAdjustSettings.Builder, AutoBeamAdjustSettingsOrBuilder> singleFieldBuilderV3 = this.autoBeamAdjustBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(autoBeamAdjustSettings);
                } else if ((this.bitField0_ & 4) == 0 || (autoBeamAdjustSettings2 = this.autoBeamAdjust_) == null || autoBeamAdjustSettings2 == AutoBeamAdjustSettings.getDefaultInstance()) {
                    this.autoBeamAdjust_ = autoBeamAdjustSettings;
                } else {
                    getAutoBeamAdjustBuilder().mergeFrom(autoBeamAdjustSettings);
                }
                if (this.autoBeamAdjust_ != null) {
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
                                if (tag == 8) {
                                    this.targetIndication_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (BrakeDetection.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.brakeDetection_ = i14;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getAutoBeamAdjustFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setAutoBeamAdjust(AutoBeamAdjustSettings.Builder builder) {
                SingleFieldBuilderV3<AutoBeamAdjustSettings, AutoBeamAdjustSettings.Builder, AutoBeamAdjustSettingsOrBuilder> singleFieldBuilderV3 = this.autoBeamAdjustBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.autoBeamAdjust_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setBrakeDetection(BrakeDetection brakeDetection) {
                brakeDetection.getClass();
                this.bitField0_ |= 2;
                this.brakeDetection_ = brakeDetection.getNumber();
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

            public Builder setTargetIndication(boolean z14) {
                this.targetIndication_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConfigureSettings getDefaultInstanceForType() {
                return ConfigureSettings.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.brakeDetection_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setAutoBeamAdjust(AutoBeamAdjustSettings autoBeamAdjustSettings) {
                SingleFieldBuilderV3<AutoBeamAdjustSettings, AutoBeamAdjustSettings.Builder, AutoBeamAdjustSettingsOrBuilder> singleFieldBuilderV3 = this.autoBeamAdjustBuilder_;
                if (singleFieldBuilderV3 == null) {
                    autoBeamAdjustSettings.getClass();
                    this.autoBeamAdjust_ = autoBeamAdjustSettings;
                } else {
                    singleFieldBuilderV3.setMessage(autoBeamAdjustSettings);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigureSettings) {
                    return mergeFrom((ConfigureSettings) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConfigureSettings configureSettings) {
                if (configureSettings == ConfigureSettings.getDefaultInstance()) {
                    return this;
                }
                if (configureSettings.hasTargetIndication()) {
                    setTargetIndication(configureSettings.getTargetIndication());
                }
                if (configureSettings.hasBrakeDetection()) {
                    setBrakeDetection(configureSettings.getBrakeDetection());
                }
                if (configureSettings.hasAutoBeamAdjust()) {
                    mergeAutoBeamAdjust(configureSettings.getAutoBeamAdjust());
                }
                mergeUnknownFields(configureSettings.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConfigureSettings getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConfigureSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigureSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConfigureSettings parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigureSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ ConfigureSettings(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConfigureSettings parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private ConfigureSettings() {
            this.targetIndication_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.brakeDetection_ = 0;
        }

        public static ConfigureSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConfigureSettings parseFrom(InputStream inputStream) {
            return (ConfigureSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigureSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigureSettings parseFrom(CodedInputStream codedInputStream) {
            return (ConfigureSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigureSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum BrakeDetection implements ProtocolMessageEnum {
            BRAKE_DETECTION_UNKNOWN(0),
            BRAKE_DETECTION_OFF(1),
            BRAKE_DETECTION_SOLID(2),
            BRAKE_DETECTION_FLASH(3);

            public static final int BRAKE_DETECTION_FLASH_VALUE = 3;
            public static final int BRAKE_DETECTION_OFF_VALUE = 1;
            public static final int BRAKE_DETECTION_SOLID_VALUE = 2;
            public static final int BRAKE_DETECTION_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<BrakeDetection> internalValueMap = new Internal.EnumLiteMap<BrakeDetection>() { // from class: com.garmin.proto.generated.GDIBikeLight.ConfigureSettings.BrakeDetection.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public BrakeDetection findValueByNumber(int i14) {
                    return BrakeDetection.forNumber(i14);
                }
            };
            private static final BrakeDetection[] VALUES = values();

            BrakeDetection(int i14) {
                this.value = i14;
            }

            public static BrakeDetection forNumber(int i14) {
                if (i14 == 0) {
                    return BRAKE_DETECTION_UNKNOWN;
                }
                if (i14 == 1) {
                    return BRAKE_DETECTION_OFF;
                }
                if (i14 == 2) {
                    return BRAKE_DETECTION_SOLID;
                }
                if (i14 != 3) {
                    return null;
                }
                return BRAKE_DETECTION_FLASH;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConfigureSettings.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<BrakeDetection> internalGetValueMap() {
                return internalValueMap;
            }

            public static BrakeDetection valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static BrakeDetection valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class ConfigureSettingsNotification extends GeneratedMessageV3 implements ConfigureSettingsNotificationOrBuilder {
        private static final ConfigureSettingsNotification DEFAULT_INSTANCE = new ConfigureSettingsNotification();

        @Deprecated
        public static final Parser<ConfigureSettingsNotification> PARSER = new AbstractParser<ConfigureSettingsNotification>() { // from class: com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsNotification.1
            @Override // com.google.protobuf.Parser
            public ConfigureSettingsNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigureSettingsNotification.newBuilder();
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
        public static final int SETTINGS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ConfigureSettings settings_;

        private ConfigureSettingsNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigureSettingsNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureSettingsNotification_descriptor;
        }

        public static Builder newBuilder(ConfigureSettingsNotification configureSettingsNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configureSettingsNotification);
        }

        public static ConfigureSettingsNotification parseDelimitedFrom(InputStream inputStream) {
            return (ConfigureSettingsNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigureSettingsNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigureSettingsNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigureSettingsNotification)) {
                return super.equals(obj);
            }
            ConfigureSettingsNotification configureSettingsNotification = (ConfigureSettingsNotification) obj;
            if (hasSettings() != configureSettingsNotification.hasSettings()) {
                return false;
            }
            return (!hasSettings() || getSettings().equals(configureSettingsNotification.getSettings())) && getUnknownFields().equals(configureSettingsNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigureSettingsNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSettings()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsNotificationOrBuilder
        public ConfigureSettings getSettings() {
            ConfigureSettings configureSettings = this.settings_;
            return configureSettings == null ? ConfigureSettings.getDefaultInstance() : configureSettings;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsNotificationOrBuilder
        public ConfigureSettingsOrBuilder getSettingsOrBuilder() {
            ConfigureSettings configureSettings = this.settings_;
            return configureSettings == null ? ConfigureSettings.getDefaultInstance() : configureSettings;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsNotificationOrBuilder
        public boolean hasSettings() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSettings()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSettings().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureSettingsNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureSettingsNotification.class, Builder.class);
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
            return new ConfigureSettingsNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSettings());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigureSettingsNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> settingsBuilder_;
            private ConfigureSettings settings_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConfigureSettingsNotification configureSettingsNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                    configureSettingsNotification.settings_ = singleFieldBuilderV3 == null ? this.settings_ : (ConfigureSettings) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                configureSettingsNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureSettingsNotification_descriptor;
            }

            private SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> getSettingsFieldBuilder() {
                if (this.settingsBuilder_ == null) {
                    this.settingsBuilder_ = new SingleFieldBuilderV3<>(getSettings(), getParentForChildren(), isClean());
                    this.settings_ = null;
                }
                return this.settingsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSettingsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureSettingsNotification build() {
                ConfigureSettingsNotification configureSettingsNotificationBuildPartial = buildPartial();
                if (configureSettingsNotificationBuildPartial.isInitialized()) {
                    return configureSettingsNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configureSettingsNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureSettingsNotification buildPartial() {
                ConfigureSettingsNotification configureSettingsNotification = new ConfigureSettingsNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(configureSettingsNotification);
                }
                onBuilt();
                return configureSettingsNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.settings_ = null;
                SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsBuilder_ = null;
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

            public Builder clearSettings() {
                this.bitField0_ &= -2;
                this.settings_ = null;
                SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsBuilder_ = null;
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
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureSettingsNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsNotificationOrBuilder
            public ConfigureSettings getSettings() {
                SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureSettings) singleFieldBuilderV3.getMessage();
                }
                ConfigureSettings configureSettings = this.settings_;
                return configureSettings == null ? ConfigureSettings.getDefaultInstance() : configureSettings;
            }

            public ConfigureSettings.Builder getSettingsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ConfigureSettings.Builder) getSettingsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsNotificationOrBuilder
            public ConfigureSettingsOrBuilder getSettingsOrBuilder() {
                SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigureSettings configureSettings = this.settings_;
                return configureSettings == null ? ConfigureSettings.getDefaultInstance() : configureSettings;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsNotificationOrBuilder
            public boolean hasSettings() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureSettingsNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureSettingsNotification.class, Builder.class);
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
                                    codedInputStream.readMessage(getSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSettings(ConfigureSettings configureSettings) {
                ConfigureSettings configureSettings2;
                SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configureSettings);
                } else if ((this.bitField0_ & 1) == 0 || (configureSettings2 = this.settings_) == null || configureSettings2 == ConfigureSettings.getDefaultInstance()) {
                    this.settings_ = configureSettings;
                } else {
                    getSettingsBuilder().mergeFrom(configureSettings);
                }
                if (this.settings_ != null) {
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

            public Builder setSettings(ConfigureSettings.Builder builder) {
                SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.settings_ = builder.build();
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
            public ConfigureSettingsNotification getDefaultInstanceForType() {
                return ConfigureSettingsNotification.getDefaultInstance();
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

            public Builder setSettings(ConfigureSettings configureSettings) {
                SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configureSettings.getClass();
                    this.settings_ = configureSettings;
                } else {
                    singleFieldBuilderV3.setMessage(configureSettings);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigureSettingsNotification) {
                    return mergeFrom((ConfigureSettingsNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConfigureSettingsNotification configureSettingsNotification) {
                if (configureSettingsNotification == ConfigureSettingsNotification.getDefaultInstance()) {
                    return this;
                }
                if (configureSettingsNotification.hasSettings()) {
                    mergeSettings(configureSettingsNotification.getSettings());
                }
                mergeUnknownFields(configureSettingsNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConfigureSettingsNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ConfigureSettingsNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ConfigureSettingsNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigureSettingsNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureSettingsNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigureSettingsNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConfigureSettingsNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigureSettingsNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConfigureSettingsNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConfigureSettingsNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConfigureSettingsNotification parseFrom(InputStream inputStream) {
            return (ConfigureSettingsNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigureSettingsNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureSettingsNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigureSettingsNotification parseFrom(CodedInputStream codedInputStream) {
            return (ConfigureSettingsNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigureSettingsNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureSettingsNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConfigureSettingsRequest extends GeneratedMessageV3 implements ConfigureSettingsRequestOrBuilder {
        private static final ConfigureSettingsRequest DEFAULT_INSTANCE = new ConfigureSettingsRequest();

        @Deprecated
        public static final Parser<ConfigureSettingsRequest> PARSER = new AbstractParser<ConfigureSettingsRequest>() { // from class: com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsRequest.1
            @Override // com.google.protobuf.Parser
            public ConfigureSettingsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigureSettingsRequest.newBuilder();
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
        public static final int SETTINGS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ConfigureSettings settings_;

        private ConfigureSettingsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigureSettingsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureSettingsRequest_descriptor;
        }

        public static Builder newBuilder(ConfigureSettingsRequest configureSettingsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configureSettingsRequest);
        }

        public static ConfigureSettingsRequest parseDelimitedFrom(InputStream inputStream) {
            return (ConfigureSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigureSettingsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigureSettingsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigureSettingsRequest)) {
                return super.equals(obj);
            }
            ConfigureSettingsRequest configureSettingsRequest = (ConfigureSettingsRequest) obj;
            if (hasSettings() != configureSettingsRequest.hasSettings()) {
                return false;
            }
            return (!hasSettings() || getSettings().equals(configureSettingsRequest.getSettings())) && getUnknownFields().equals(configureSettingsRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigureSettingsRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSettings()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsRequestOrBuilder
        public ConfigureSettings getSettings() {
            ConfigureSettings configureSettings = this.settings_;
            return configureSettings == null ? ConfigureSettings.getDefaultInstance() : configureSettings;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsRequestOrBuilder
        public ConfigureSettingsOrBuilder getSettingsOrBuilder() {
            ConfigureSettings configureSettings = this.settings_;
            return configureSettings == null ? ConfigureSettings.getDefaultInstance() : configureSettings;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsRequestOrBuilder
        public boolean hasSettings() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSettings()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSettings().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureSettingsRequest.class, Builder.class);
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
            return new ConfigureSettingsRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSettings());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigureSettingsRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> settingsBuilder_;
            private ConfigureSettings settings_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConfigureSettingsRequest configureSettingsRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                    configureSettingsRequest.settings_ = singleFieldBuilderV3 == null ? this.settings_ : (ConfigureSettings) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                configureSettingsRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureSettingsRequest_descriptor;
            }

            private SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> getSettingsFieldBuilder() {
                if (this.settingsBuilder_ == null) {
                    this.settingsBuilder_ = new SingleFieldBuilderV3<>(getSettings(), getParentForChildren(), isClean());
                    this.settings_ = null;
                }
                return this.settingsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSettingsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureSettingsRequest build() {
                ConfigureSettingsRequest configureSettingsRequestBuildPartial = buildPartial();
                if (configureSettingsRequestBuildPartial.isInitialized()) {
                    return configureSettingsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configureSettingsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureSettingsRequest buildPartial() {
                ConfigureSettingsRequest configureSettingsRequest = new ConfigureSettingsRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(configureSettingsRequest);
                }
                onBuilt();
                return configureSettingsRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.settings_ = null;
                SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsBuilder_ = null;
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

            public Builder clearSettings() {
                this.bitField0_ &= -2;
                this.settings_ = null;
                SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsBuilder_ = null;
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
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureSettingsRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsRequestOrBuilder
            public ConfigureSettings getSettings() {
                SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureSettings) singleFieldBuilderV3.getMessage();
                }
                ConfigureSettings configureSettings = this.settings_;
                return configureSettings == null ? ConfigureSettings.getDefaultInstance() : configureSettings;
            }

            public ConfigureSettings.Builder getSettingsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ConfigureSettings.Builder) getSettingsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsRequestOrBuilder
            public ConfigureSettingsOrBuilder getSettingsOrBuilder() {
                SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigureSettings configureSettings = this.settings_;
                return configureSettings == null ? ConfigureSettings.getDefaultInstance() : configureSettings;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsRequestOrBuilder
            public boolean hasSettings() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureSettingsRequest.class, Builder.class);
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
                                    codedInputStream.readMessage(getSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSettings(ConfigureSettings configureSettings) {
                ConfigureSettings configureSettings2;
                SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configureSettings);
                } else if ((this.bitField0_ & 1) == 0 || (configureSettings2 = this.settings_) == null || configureSettings2 == ConfigureSettings.getDefaultInstance()) {
                    this.settings_ = configureSettings;
                } else {
                    getSettingsBuilder().mergeFrom(configureSettings);
                }
                if (this.settings_ != null) {
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

            public Builder setSettings(ConfigureSettings.Builder builder) {
                SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.settings_ = builder.build();
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
            public ConfigureSettingsRequest getDefaultInstanceForType() {
                return ConfigureSettingsRequest.getDefaultInstance();
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

            public Builder setSettings(ConfigureSettings configureSettings) {
                SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configureSettings.getClass();
                    this.settings_ = configureSettings;
                } else {
                    singleFieldBuilderV3.setMessage(configureSettings);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigureSettingsRequest) {
                    return mergeFrom((ConfigureSettingsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConfigureSettingsRequest configureSettingsRequest) {
                if (configureSettingsRequest == ConfigureSettingsRequest.getDefaultInstance()) {
                    return this;
                }
                if (configureSettingsRequest.hasSettings()) {
                    mergeSettings(configureSettingsRequest.getSettings());
                }
                mergeUnknownFields(configureSettingsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConfigureSettingsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ConfigureSettingsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ConfigureSettingsRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigureSettingsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigureSettingsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConfigureSettingsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigureSettingsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConfigureSettingsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConfigureSettingsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConfigureSettingsRequest parseFrom(InputStream inputStream) {
            return (ConfigureSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigureSettingsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigureSettingsRequest parseFrom(CodedInputStream codedInputStream) {
            return (ConfigureSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigureSettingsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConfigureSettingsResponse extends GeneratedMessageV3 implements ConfigureSettingsResponseOrBuilder {
        private static final ConfigureSettingsResponse DEFAULT_INSTANCE = new ConfigureSettingsResponse();

        @Deprecated
        public static final Parser<ConfigureSettingsResponse> PARSER = new AbstractParser<ConfigureSettingsResponse>() { // from class: com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsResponse.1
            @Override // com.google.protobuf.Parser
            public ConfigureSettingsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigureSettingsResponse.newBuilder();
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
        public static final int SETTINGS_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ConfigureSettings settings_;
        private int status_;

        private ConfigureSettingsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigureSettingsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureSettingsResponse_descriptor;
        }

        public static Builder newBuilder(ConfigureSettingsResponse configureSettingsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configureSettingsResponse);
        }

        public static ConfigureSettingsResponse parseDelimitedFrom(InputStream inputStream) {
            return (ConfigureSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigureSettingsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigureSettingsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigureSettingsResponse)) {
                return super.equals(obj);
            }
            ConfigureSettingsResponse configureSettingsResponse = (ConfigureSettingsResponse) obj;
            if (hasStatus() != configureSettingsResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == configureSettingsResponse.status_) && hasSettings() == configureSettingsResponse.hasSettings()) {
                return (!hasSettings() || getSettings().equals(configureSettingsResponse.getSettings())) && getUnknownFields().equals(configureSettingsResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigureSettingsResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getSettings());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsResponseOrBuilder
        public ConfigureSettings getSettings() {
            ConfigureSettings configureSettings = this.settings_;
            return configureSettings == null ? ConfigureSettings.getDefaultInstance() : configureSettings;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsResponseOrBuilder
        public ConfigureSettingsOrBuilder getSettingsOrBuilder() {
            ConfigureSettings configureSettings = this.settings_;
            return configureSettings == null ? ConfigureSettings.getDefaultInstance() : configureSettings;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsResponseOrBuilder
        public boolean hasSettings() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsResponseOrBuilder
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
            if (hasSettings()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSettings().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureSettingsResponse.class, Builder.class);
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
            return new ConfigureSettingsResponse();
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
                codedOutputStream.writeMessage(2, getSettings());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigureSettingsResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> settingsBuilder_;
            private ConfigureSettings settings_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConfigureSettingsResponse configureSettingsResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    configureSettingsResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                    configureSettingsResponse.settings_ = singleFieldBuilderV3 == null ? this.settings_ : (ConfigureSettings) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                configureSettingsResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureSettingsResponse_descriptor;
            }

            private SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> getSettingsFieldBuilder() {
                if (this.settingsBuilder_ == null) {
                    this.settingsBuilder_ = new SingleFieldBuilderV3<>(getSettings(), getParentForChildren(), isClean());
                    this.settings_ = null;
                }
                return this.settingsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSettingsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureSettingsResponse build() {
                ConfigureSettingsResponse configureSettingsResponseBuildPartial = buildPartial();
                if (configureSettingsResponseBuildPartial.isInitialized()) {
                    return configureSettingsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configureSettingsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigureSettingsResponse buildPartial() {
                ConfigureSettingsResponse configureSettingsResponse = new ConfigureSettingsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(configureSettingsResponse);
                }
                onBuilt();
                return configureSettingsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.settings_ = null;
                SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsBuilder_ = null;
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

            public Builder clearSettings() {
                this.bitField0_ &= -3;
                this.settings_ = null;
                SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsBuilder_ = null;
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
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureSettingsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsResponseOrBuilder
            public ConfigureSettings getSettings() {
                SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureSettings) singleFieldBuilderV3.getMessage();
                }
                ConfigureSettings configureSettings = this.settings_;
                return configureSettings == null ? ConfigureSettings.getDefaultInstance() : configureSettings;
            }

            public ConfigureSettings.Builder getSettingsBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ConfigureSettings.Builder) getSettingsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsResponseOrBuilder
            public ConfigureSettingsOrBuilder getSettingsOrBuilder() {
                SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigureSettings configureSettings = this.settings_;
                return configureSettings == null ? ConfigureSettings.getDefaultInstance() : configureSettings;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsResponseOrBuilder
            public boolean hasSettings() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ConfigureSettingsResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_ConfigureSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigureSettingsResponse.class, Builder.class);
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
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSettings(ConfigureSettings configureSettings) {
                ConfigureSettings configureSettings2;
                SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configureSettings);
                } else if ((this.bitField0_ & 2) == 0 || (configureSettings2 = this.settings_) == null || configureSettings2 == ConfigureSettings.getDefaultInstance()) {
                    this.settings_ = configureSettings;
                } else {
                    getSettingsBuilder().mergeFrom(configureSettings);
                }
                if (this.settings_ != null) {
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSettings(ConfigureSettings.Builder builder) {
                SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.settings_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
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
            public ConfigureSettingsResponse getDefaultInstanceForType() {
                return ConfigureSettingsResponse.getDefaultInstance();
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

            public Builder setSettings(ConfigureSettings configureSettings) {
                SingleFieldBuilderV3<ConfigureSettings, ConfigureSettings.Builder, ConfigureSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configureSettings.getClass();
                    this.settings_ = configureSettings;
                } else {
                    singleFieldBuilderV3.setMessage(configureSettings);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigureSettingsResponse) {
                    return mergeFrom((ConfigureSettingsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConfigureSettingsResponse configureSettingsResponse) {
                if (configureSettingsResponse == ConfigureSettingsResponse.getDefaultInstance()) {
                    return this;
                }
                if (configureSettingsResponse.hasStatus()) {
                    setStatus(configureSettingsResponse.getStatus());
                }
                if (configureSettingsResponse.hasSettings()) {
                    mergeSettings(configureSettingsResponse.getSettings());
                }
                mergeUnknownFields(configureSettingsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConfigureSettingsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConfigureSettingsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigureSettingsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ConfigureSettingsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConfigureSettingsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ConfigureSettingsResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigureSettingsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConfigureSettingsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConfigureSettingsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConfigureSettingsResponse parseFrom(InputStream inputStream) {
            return (ConfigureSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigureSettingsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigureSettingsResponse parseFrom(CodedInputStream codedInputStream) {
            return (ConfigureSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigureSettingsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigureSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CustomMode extends GeneratedMessageV3 implements CustomModeOrBuilder {
        public static final int MODE_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int STEPS_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int mode_;
        private volatile Object name_;
        private List<CustomModeStep> steps_;
        private static final CustomMode DEFAULT_INSTANCE = new CustomMode();

        @Deprecated
        public static final Parser<CustomMode> PARSER = new AbstractParser<CustomMode>() { // from class: com.garmin.proto.generated.GDIBikeLight.CustomMode.1
            @Override // com.google.protobuf.Parser
            public CustomMode parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CustomMode.newBuilder();
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

        private CustomMode() {
            this.mode_ = 0;
            this.name_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.mode_ = 0;
            this.name_ = "";
            this.steps_ = Collections.EMPTY_LIST;
        }

        public static CustomMode getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CustomMode_descriptor;
        }

        public static Builder newBuilder(CustomMode customMode) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(customMode);
        }

        public static CustomMode parseDelimitedFrom(InputStream inputStream) {
            return (CustomMode) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CustomMode parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CustomMode> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CustomMode)) {
                return super.equals(obj);
            }
            CustomMode customMode = (CustomMode) obj;
            if (hasMode() != customMode.hasMode()) {
                return false;
            }
            if ((!hasMode() || this.mode_ == customMode.mode_) && hasName() == customMode.hasName()) {
                return (!hasName() || getName().equals(customMode.getName())) && getStepsList().equals(customMode.getStepsList()) && getUnknownFields().equals(customMode.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeOrBuilder
        public Mode getMode() {
            Mode modeForNumber = Mode.forNumber(this.mode_);
            return modeForNumber == null ? Mode.MODE_UNKNOWN : modeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeOrBuilder
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

        @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeOrBuilder
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
        public Parser<CustomMode> getParserForType() {
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
                iComputeEnumSize += GeneratedMessageV3.computeStringSize(2, this.name_);
            }
            for (int i15 = 0; i15 < this.steps_.size(); i15++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, this.steps_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeOrBuilder
        public CustomModeStep getSteps(int i14) {
            return this.steps_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeOrBuilder
        public int getStepsCount() {
            return this.steps_.size();
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeOrBuilder
        public List<CustomModeStep> getStepsList() {
            return this.steps_;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeOrBuilder
        public CustomModeStepOrBuilder getStepsOrBuilder(int i14) {
            return this.steps_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeOrBuilder
        public List<? extends CustomModeStepOrBuilder> getStepsOrBuilderList() {
            return this.steps_;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeOrBuilder
        public boolean hasMode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeOrBuilder
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
            if (hasMode()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.mode_;
            }
            if (hasName()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getName().hashCode();
            }
            if (getStepsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getStepsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CustomMode_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomMode.class, Builder.class);
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
            return new CustomMode();
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
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.name_);
            }
            for (int i14 = 0; i14 < this.steps_.size(); i14++) {
                codedOutputStream.writeMessage(3, this.steps_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CustomModeOrBuilder {
            private int bitField0_;
            private int mode_;
            private Object name_;
            private RepeatedFieldBuilderV3<CustomModeStep, CustomModeStep.Builder, CustomModeStepOrBuilder> stepsBuilder_;
            private List<CustomModeStep> steps_;

            private Builder() {
                this.mode_ = 0;
                this.name_ = "";
                this.steps_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(CustomMode customMode) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    customMode.mode_ = this.mode_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    customMode.name_ = this.name_;
                    i14 |= 2;
                }
                customMode.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(CustomMode customMode) {
                RepeatedFieldBuilderV3<CustomModeStep, CustomModeStep.Builder, CustomModeStepOrBuilder> repeatedFieldBuilderV3 = this.stepsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    customMode.steps_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 4) != 0) {
                    this.steps_ = Collections.unmodifiableList(this.steps_);
                    this.bitField0_ &= -5;
                }
                customMode.steps_ = this.steps_;
            }

            private void ensureStepsIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.steps_ = new ArrayList(this.steps_);
                    this.bitField0_ |= 4;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CustomMode_descriptor;
            }

            private RepeatedFieldBuilderV3<CustomModeStep, CustomModeStep.Builder, CustomModeStepOrBuilder> getStepsFieldBuilder() {
                if (this.stepsBuilder_ == null) {
                    this.stepsBuilder_ = new RepeatedFieldBuilderV3<>(this.steps_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.steps_ = null;
                }
                return this.stepsBuilder_;
            }

            public Builder addAllSteps(Iterable<? extends CustomModeStep> iterable) {
                RepeatedFieldBuilderV3<CustomModeStep, CustomModeStep.Builder, CustomModeStepOrBuilder> repeatedFieldBuilderV3 = this.stepsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureStepsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.steps_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSteps(CustomModeStep.Builder builder) {
                RepeatedFieldBuilderV3<CustomModeStep, CustomModeStep.Builder, CustomModeStepOrBuilder> repeatedFieldBuilderV3 = this.stepsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureStepsIsMutable();
                this.steps_.add(builder.build());
                onChanged();
                return this;
            }

            public CustomModeStep.Builder addStepsBuilder() {
                return (CustomModeStep.Builder) getStepsFieldBuilder().addBuilder(CustomModeStep.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CustomMode build() {
                CustomMode customModeBuildPartial = buildPartial();
                if (customModeBuildPartial.isInitialized()) {
                    return customModeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) customModeBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CustomMode buildPartial() {
                CustomMode customMode = new CustomMode(this);
                buildPartialRepeatedFields(customMode);
                if (this.bitField0_ != 0) {
                    buildPartial0(customMode);
                }
                onBuilt();
                return customMode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.mode_ = 0;
                this.name_ = "";
                RepeatedFieldBuilderV3<CustomModeStep, CustomModeStep.Builder, CustomModeStepOrBuilder> repeatedFieldBuilderV3 = this.stepsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.steps_ = Collections.EMPTY_LIST;
                } else {
                    this.steps_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -5;
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

            public Builder clearName() {
                this.name_ = CustomMode.getDefaultInstance().getName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSteps() {
                RepeatedFieldBuilderV3<CustomModeStep, CustomModeStep.Builder, CustomModeStepOrBuilder> repeatedFieldBuilderV3 = this.stepsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.steps_ = Collections.EMPTY_LIST;
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
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CustomMode_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeOrBuilder
            public Mode getMode() {
                Mode modeForNumber = Mode.forNumber(this.mode_);
                return modeForNumber == null ? Mode.MODE_UNKNOWN : modeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeOrBuilder
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

            @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeOrBuilder
            public CustomModeStep getSteps(int i14) {
                RepeatedFieldBuilderV3<CustomModeStep, CustomModeStep.Builder, CustomModeStepOrBuilder> repeatedFieldBuilderV3 = this.stepsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.steps_.get(i14) : (CustomModeStep) repeatedFieldBuilderV3.getMessage(i14);
            }

            public CustomModeStep.Builder getStepsBuilder(int i14) {
                return (CustomModeStep.Builder) getStepsFieldBuilder().getBuilder(i14);
            }

            public List<CustomModeStep.Builder> getStepsBuilderList() {
                return getStepsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeOrBuilder
            public int getStepsCount() {
                RepeatedFieldBuilderV3<CustomModeStep, CustomModeStep.Builder, CustomModeStepOrBuilder> repeatedFieldBuilderV3 = this.stepsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.steps_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeOrBuilder
            public List<CustomModeStep> getStepsList() {
                RepeatedFieldBuilderV3<CustomModeStep, CustomModeStep.Builder, CustomModeStepOrBuilder> repeatedFieldBuilderV3 = this.stepsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.steps_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeOrBuilder
            public CustomModeStepOrBuilder getStepsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<CustomModeStep, CustomModeStep.Builder, CustomModeStepOrBuilder> repeatedFieldBuilderV3 = this.stepsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.steps_.get(i14) : (CustomModeStepOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeOrBuilder
            public List<? extends CustomModeStepOrBuilder> getStepsOrBuilderList() {
                RepeatedFieldBuilderV3<CustomModeStep, CustomModeStep.Builder, CustomModeStepOrBuilder> repeatedFieldBuilderV3 = this.stepsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.steps_);
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeOrBuilder
            public boolean hasMode() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CustomMode_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomMode.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CustomMode customMode) {
                if (customMode == CustomMode.getDefaultInstance()) {
                    return this;
                }
                if (customMode.hasMode()) {
                    setMode(customMode.getMode());
                }
                if (customMode.hasName()) {
                    this.name_ = customMode.name_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (this.stepsBuilder_ == null) {
                    if (!customMode.steps_.isEmpty()) {
                        if (this.steps_.isEmpty()) {
                            this.steps_ = customMode.steps_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureStepsIsMutable();
                            this.steps_.addAll(customMode.steps_);
                        }
                        onChanged();
                    }
                } else if (!customMode.steps_.isEmpty()) {
                    boolean zIsEmpty = this.stepsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<CustomModeStep, CustomModeStep.Builder, CustomModeStepOrBuilder> repeatedFieldBuilderV3 = this.stepsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.stepsBuilder_ = null;
                        this.steps_ = customMode.steps_;
                        this.bitField0_ &= -5;
                        this.stepsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getStepsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(customMode.steps_);
                    }
                }
                mergeUnknownFields(customMode.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeSteps(int i14) {
                RepeatedFieldBuilderV3<CustomModeStep, CustomModeStep.Builder, CustomModeStepOrBuilder> repeatedFieldBuilderV3 = this.stepsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureStepsIsMutable();
                this.steps_.remove(i14);
                onChanged();
                return this;
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

            public Builder setSteps(int i14, CustomModeStep.Builder builder) {
                RepeatedFieldBuilderV3<CustomModeStep, CustomModeStep.Builder, CustomModeStepOrBuilder> repeatedFieldBuilderV3 = this.stepsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureStepsIsMutable();
                this.steps_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CustomMode getDefaultInstanceForType() {
                return CustomMode.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public CustomModeStep.Builder addStepsBuilder(int i14) {
                return (CustomModeStep.Builder) getStepsFieldBuilder().addBuilder(i14, CustomModeStep.getDefaultInstance());
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.mode_ = 0;
                this.name_ = "";
                this.steps_ = Collections.EMPTY_LIST;
            }

            public Builder addSteps(int i14, CustomModeStep customModeStep) {
                RepeatedFieldBuilderV3<CustomModeStep, CustomModeStep.Builder, CustomModeStepOrBuilder> repeatedFieldBuilderV3 = this.stepsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    customModeStep.getClass();
                    ensureStepsIsMutable();
                    this.steps_.add(i14, customModeStep);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, customModeStep);
                return this;
            }

            public Builder setSteps(int i14, CustomModeStep customModeStep) {
                RepeatedFieldBuilderV3<CustomModeStep, CustomModeStep.Builder, CustomModeStepOrBuilder> repeatedFieldBuilderV3 = this.stepsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    customModeStep.getClass();
                    ensureStepsIsMutable();
                    this.steps_.set(i14, customModeStep);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, customModeStep);
                return this;
            }

            public Builder addSteps(CustomModeStep customModeStep) {
                RepeatedFieldBuilderV3<CustomModeStep, CustomModeStep.Builder, CustomModeStepOrBuilder> repeatedFieldBuilderV3 = this.stepsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    customModeStep.getClass();
                    ensureStepsIsMutable();
                    this.steps_.add(customModeStep);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(customModeStep);
                return this;
            }

            public Builder addSteps(int i14, CustomModeStep.Builder builder) {
                RepeatedFieldBuilderV3<CustomModeStep, CustomModeStep.Builder, CustomModeStepOrBuilder> repeatedFieldBuilderV3 = this.stepsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureStepsIsMutable();
                    this.steps_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CustomMode) {
                    return mergeFrom((CustomMode) message);
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
                                    if (Mode.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.mode_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    CustomModeStep customModeStep = (CustomModeStep) codedInputStream.readMessage(CustomModeStep.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<CustomModeStep, CustomModeStep.Builder, CustomModeStepOrBuilder> repeatedFieldBuilderV3 = this.stepsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureStepsIsMutable();
                                        this.steps_.add(customModeStep);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(customModeStep);
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
        public CustomMode getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CustomMode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CustomMode) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CustomMode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CustomMode parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CustomMode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CustomMode parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CustomMode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CustomMode parseFrom(InputStream inputStream) {
            return (CustomMode) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CustomMode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CustomMode) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CustomMode parseFrom(CodedInputStream codedInputStream) {
            return (CustomMode) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CustomMode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CustomMode) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private CustomMode(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.mode_ = 0;
            this.name_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ CustomMode(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class CustomModeStep extends GeneratedMessageV3 implements CustomModeStepOrBuilder {
        public static final int DURATION_MS_FIELD_NUMBER = 1;
        public static final int LED_STEPS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int durationMs_;
        private List<CustomModeLedStep> ledSteps_;
        private byte memoizedIsInitialized;
        private static final CustomModeStep DEFAULT_INSTANCE = new CustomModeStep();

        @Deprecated
        public static final Parser<CustomModeStep> PARSER = new AbstractParser<CustomModeStep>() { // from class: com.garmin.proto.generated.GDIBikeLight.CustomModeStep.1
            @Override // com.google.protobuf.Parser
            public CustomModeStep parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CustomModeStep.newBuilder();
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

        private CustomModeStep() {
            this.durationMs_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.ledSteps_ = Collections.EMPTY_LIST;
        }

        public static CustomModeStep getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CustomModeStep_descriptor;
        }

        public static Builder newBuilder(CustomModeStep customModeStep) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(customModeStep);
        }

        public static CustomModeStep parseDelimitedFrom(InputStream inputStream) {
            return (CustomModeStep) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CustomModeStep parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CustomModeStep> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CustomModeStep)) {
                return super.equals(obj);
            }
            CustomModeStep customModeStep = (CustomModeStep) obj;
            if (hasDurationMs() != customModeStep.hasDurationMs()) {
                return false;
            }
            return (!hasDurationMs() || getDurationMs() == customModeStep.getDurationMs()) && getLedStepsList().equals(customModeStep.getLedStepsList()) && getUnknownFields().equals(customModeStep.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeStepOrBuilder
        public int getDurationMs() {
            return this.durationMs_;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeStepOrBuilder
        public CustomModeLedStep getLedSteps(int i14) {
            return this.ledSteps_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeStepOrBuilder
        public int getLedStepsCount() {
            return this.ledSteps_.size();
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeStepOrBuilder
        public List<CustomModeLedStep> getLedStepsList() {
            return this.ledSteps_;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeStepOrBuilder
        public CustomModeLedStepOrBuilder getLedStepsOrBuilder(int i14) {
            return this.ledSteps_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeStepOrBuilder
        public List<? extends CustomModeLedStepOrBuilder> getLedStepsOrBuilderList() {
            return this.ledSteps_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CustomModeStep> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.durationMs_) : 0;
            for (int i15 = 0; i15 < this.ledSteps_.size(); i15++) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(2, this.ledSteps_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeStepOrBuilder
        public boolean hasDurationMs() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDurationMs()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDurationMs();
            }
            if (getLedStepsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getLedStepsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CustomModeStep_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomModeStep.class, Builder.class);
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
            return new CustomModeStep();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.durationMs_);
            }
            for (int i14 = 0; i14 < this.ledSteps_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.ledSteps_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CustomModeStepOrBuilder {
            private int bitField0_;
            private int durationMs_;
            private RepeatedFieldBuilderV3<CustomModeLedStep, CustomModeLedStep.Builder, CustomModeLedStepOrBuilder> ledStepsBuilder_;
            private List<CustomModeLedStep> ledSteps_;

            private Builder() {
                this.ledSteps_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(CustomModeStep customModeStep) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    customModeStep.durationMs_ = this.durationMs_;
                } else {
                    i14 = 0;
                }
                customModeStep.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(CustomModeStep customModeStep) {
                RepeatedFieldBuilderV3<CustomModeLedStep, CustomModeLedStep.Builder, CustomModeLedStepOrBuilder> repeatedFieldBuilderV3 = this.ledStepsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    customModeStep.ledSteps_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.ledSteps_ = Collections.unmodifiableList(this.ledSteps_);
                    this.bitField0_ &= -3;
                }
                customModeStep.ledSteps_ = this.ledSteps_;
            }

            private void ensureLedStepsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.ledSteps_ = new ArrayList(this.ledSteps_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CustomModeStep_descriptor;
            }

            private RepeatedFieldBuilderV3<CustomModeLedStep, CustomModeLedStep.Builder, CustomModeLedStepOrBuilder> getLedStepsFieldBuilder() {
                if (this.ledStepsBuilder_ == null) {
                    this.ledStepsBuilder_ = new RepeatedFieldBuilderV3<>(this.ledSteps_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.ledSteps_ = null;
                }
                return this.ledStepsBuilder_;
            }

            public Builder addAllLedSteps(Iterable<? extends CustomModeLedStep> iterable) {
                RepeatedFieldBuilderV3<CustomModeLedStep, CustomModeLedStep.Builder, CustomModeLedStepOrBuilder> repeatedFieldBuilderV3 = this.ledStepsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureLedStepsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.ledSteps_);
                onChanged();
                return this;
            }

            public Builder addLedSteps(CustomModeLedStep.Builder builder) {
                RepeatedFieldBuilderV3<CustomModeLedStep, CustomModeLedStep.Builder, CustomModeLedStepOrBuilder> repeatedFieldBuilderV3 = this.ledStepsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureLedStepsIsMutable();
                this.ledSteps_.add(builder.build());
                onChanged();
                return this;
            }

            public CustomModeLedStep.Builder addLedStepsBuilder() {
                return (CustomModeLedStep.Builder) getLedStepsFieldBuilder().addBuilder(CustomModeLedStep.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CustomModeStep build() {
                CustomModeStep customModeStepBuildPartial = buildPartial();
                if (customModeStepBuildPartial.isInitialized()) {
                    return customModeStepBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) customModeStepBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CustomModeStep buildPartial() {
                CustomModeStep customModeStep = new CustomModeStep(this);
                buildPartialRepeatedFields(customModeStep);
                if (this.bitField0_ != 0) {
                    buildPartial0(customModeStep);
                }
                onBuilt();
                return customModeStep;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.durationMs_ = 0;
                RepeatedFieldBuilderV3<CustomModeLedStep, CustomModeLedStep.Builder, CustomModeLedStepOrBuilder> repeatedFieldBuilderV3 = this.ledStepsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.ledSteps_ = Collections.EMPTY_LIST;
                } else {
                    this.ledSteps_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                return this;
            }

            public Builder clearDurationMs() {
                this.bitField0_ &= -2;
                this.durationMs_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLedSteps() {
                RepeatedFieldBuilderV3<CustomModeLedStep, CustomModeLedStep.Builder, CustomModeLedStepOrBuilder> repeatedFieldBuilderV3 = this.ledStepsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.ledSteps_ = Collections.EMPTY_LIST;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CustomModeStep_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeStepOrBuilder
            public int getDurationMs() {
                return this.durationMs_;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeStepOrBuilder
            public CustomModeLedStep getLedSteps(int i14) {
                RepeatedFieldBuilderV3<CustomModeLedStep, CustomModeLedStep.Builder, CustomModeLedStepOrBuilder> repeatedFieldBuilderV3 = this.ledStepsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.ledSteps_.get(i14) : (CustomModeLedStep) repeatedFieldBuilderV3.getMessage(i14);
            }

            public CustomModeLedStep.Builder getLedStepsBuilder(int i14) {
                return (CustomModeLedStep.Builder) getLedStepsFieldBuilder().getBuilder(i14);
            }

            public List<CustomModeLedStep.Builder> getLedStepsBuilderList() {
                return getLedStepsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeStepOrBuilder
            public int getLedStepsCount() {
                RepeatedFieldBuilderV3<CustomModeLedStep, CustomModeLedStep.Builder, CustomModeLedStepOrBuilder> repeatedFieldBuilderV3 = this.ledStepsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.ledSteps_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeStepOrBuilder
            public List<CustomModeLedStep> getLedStepsList() {
                RepeatedFieldBuilderV3<CustomModeLedStep, CustomModeLedStep.Builder, CustomModeLedStepOrBuilder> repeatedFieldBuilderV3 = this.ledStepsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.ledSteps_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeStepOrBuilder
            public CustomModeLedStepOrBuilder getLedStepsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<CustomModeLedStep, CustomModeLedStep.Builder, CustomModeLedStepOrBuilder> repeatedFieldBuilderV3 = this.ledStepsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.ledSteps_.get(i14) : (CustomModeLedStepOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeStepOrBuilder
            public List<? extends CustomModeLedStepOrBuilder> getLedStepsOrBuilderList() {
                RepeatedFieldBuilderV3<CustomModeLedStep, CustomModeLedStep.Builder, CustomModeLedStepOrBuilder> repeatedFieldBuilderV3 = this.ledStepsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.ledSteps_);
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.CustomModeStepOrBuilder
            public boolean hasDurationMs() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_CustomModeStep_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomModeStep.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CustomModeStep customModeStep) {
                if (customModeStep == CustomModeStep.getDefaultInstance()) {
                    return this;
                }
                if (customModeStep.hasDurationMs()) {
                    setDurationMs(customModeStep.getDurationMs());
                }
                if (this.ledStepsBuilder_ == null) {
                    if (!customModeStep.ledSteps_.isEmpty()) {
                        if (this.ledSteps_.isEmpty()) {
                            this.ledSteps_ = customModeStep.ledSteps_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureLedStepsIsMutable();
                            this.ledSteps_.addAll(customModeStep.ledSteps_);
                        }
                        onChanged();
                    }
                } else if (!customModeStep.ledSteps_.isEmpty()) {
                    boolean zIsEmpty = this.ledStepsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<CustomModeLedStep, CustomModeLedStep.Builder, CustomModeLedStepOrBuilder> repeatedFieldBuilderV3 = this.ledStepsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.ledStepsBuilder_ = null;
                        this.ledSteps_ = customModeStep.ledSteps_;
                        this.bitField0_ &= -3;
                        this.ledStepsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getLedStepsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(customModeStep.ledSteps_);
                    }
                }
                mergeUnknownFields(customModeStep.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeLedSteps(int i14) {
                RepeatedFieldBuilderV3<CustomModeLedStep, CustomModeLedStep.Builder, CustomModeLedStepOrBuilder> repeatedFieldBuilderV3 = this.ledStepsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureLedStepsIsMutable();
                this.ledSteps_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setDurationMs(int i14) {
                this.durationMs_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLedSteps(int i14, CustomModeLedStep.Builder builder) {
                RepeatedFieldBuilderV3<CustomModeLedStep, CustomModeLedStep.Builder, CustomModeLedStepOrBuilder> repeatedFieldBuilderV3 = this.ledStepsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureLedStepsIsMutable();
                this.ledSteps_.set(i14, builder.build());
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
            public CustomModeStep getDefaultInstanceForType() {
                return CustomModeStep.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.ledSteps_ = Collections.EMPTY_LIST;
            }

            public CustomModeLedStep.Builder addLedStepsBuilder(int i14) {
                return (CustomModeLedStep.Builder) getLedStepsFieldBuilder().addBuilder(i14, CustomModeLedStep.getDefaultInstance());
            }

            public Builder addLedSteps(int i14, CustomModeLedStep customModeLedStep) {
                RepeatedFieldBuilderV3<CustomModeLedStep, CustomModeLedStep.Builder, CustomModeLedStepOrBuilder> repeatedFieldBuilderV3 = this.ledStepsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    customModeLedStep.getClass();
                    ensureLedStepsIsMutable();
                    this.ledSteps_.add(i14, customModeLedStep);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, customModeLedStep);
                return this;
            }

            public Builder setLedSteps(int i14, CustomModeLedStep customModeLedStep) {
                RepeatedFieldBuilderV3<CustomModeLedStep, CustomModeLedStep.Builder, CustomModeLedStepOrBuilder> repeatedFieldBuilderV3 = this.ledStepsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    customModeLedStep.getClass();
                    ensureLedStepsIsMutable();
                    this.ledSteps_.set(i14, customModeLedStep);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, customModeLedStep);
                return this;
            }

            public Builder addLedSteps(CustomModeLedStep customModeLedStep) {
                RepeatedFieldBuilderV3<CustomModeLedStep, CustomModeLedStep.Builder, CustomModeLedStepOrBuilder> repeatedFieldBuilderV3 = this.ledStepsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    customModeLedStep.getClass();
                    ensureLedStepsIsMutable();
                    this.ledSteps_.add(customModeLedStep);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(customModeLedStep);
                return this;
            }

            public Builder addLedSteps(int i14, CustomModeLedStep.Builder builder) {
                RepeatedFieldBuilderV3<CustomModeLedStep, CustomModeLedStep.Builder, CustomModeLedStepOrBuilder> repeatedFieldBuilderV3 = this.ledStepsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureLedStepsIsMutable();
                    this.ledSteps_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CustomModeStep) {
                    return mergeFrom((CustomModeStep) message);
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
                                    this.durationMs_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    CustomModeLedStep customModeLedStep = (CustomModeLedStep) codedInputStream.readMessage(CustomModeLedStep.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<CustomModeLedStep, CustomModeLedStep.Builder, CustomModeLedStepOrBuilder> repeatedFieldBuilderV3 = this.ledStepsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureLedStepsIsMutable();
                                        this.ledSteps_.add(customModeLedStep);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(customModeLedStep);
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
        public CustomModeStep getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CustomModeStep parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CustomModeStep) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CustomModeStep parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CustomModeStep parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CustomModeStep parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CustomModeStep parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CustomModeStep parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private CustomModeStep(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.durationMs_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CustomModeStep parseFrom(InputStream inputStream) {
            return (CustomModeStep) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CustomModeStep parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CustomModeStep) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ CustomModeStep(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CustomModeStep parseFrom(CodedInputStream codedInputStream) {
            return (CustomModeStep) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CustomModeStep parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CustomModeStep) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int CHANGE_MODE_NOTIFICATION_FIELD_NUMBER = 9;
        public static final int CHANGE_MODE_REQUEST_FIELD_NUMBER = 7;
        public static final int CHANGE_MODE_RESPONSE_FIELD_NUMBER = 8;
        public static final int CONFIG_CUSTOM_MODE_NOTIFICATION_FIELD_NUMBER = 3;
        public static final int CONFIG_CUSTOM_MODE_REQUEST_FIELD_NUMBER = 1;
        public static final int CONFIG_CUSTOM_MODE_RESPONSE_FIELD_NUMBER = 2;
        public static final int CONFIG_ROTATION_NOTIFICATION_FIELD_NUMBER = 6;
        public static final int CONFIG_ROTATION_REQUEST_FIELD_NUMBER = 4;
        public static final int CONFIG_ROTATION_RESPONSE_FIELD_NUMBER = 5;
        public static final int CONFIG_SETTINGS_NOTIFICATION_FIELD_NUMBER = 12;
        public static final int CONFIG_SETTINGS_REQUEST_FIELD_NUMBER = 10;
        public static final int CONFIG_SETTINGS_RESPONSE_FIELD_NUMBER = 11;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIBikeLight.Service.1
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
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ChangeModeNotification changeModeNotification_;
        private ChangeModeRequest changeModeRequest_;
        private ChangeModeResponse changeModeResponse_;
        private ConfigureCustomModeNotification configCustomModeNotification_;
        private ConfigureCustomModeRequest configCustomModeRequest_;
        private ConfigureCustomModeResponse configCustomModeResponse_;
        private ConfigureRotationNotification configRotationNotification_;
        private ConfigureRotationRequest configRotationRequest_;
        private ConfigureRotationResponse configRotationResponse_;
        private ConfigureSettingsNotification configSettingsNotification_;
        private ConfigureSettingsRequest configSettingsRequest_;
        private ConfigureSettingsResponse configSettingsResponse_;
        private byte memoizedIsInitialized;

        private Service(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_Service_descriptor;
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
            if (hasConfigCustomModeRequest() != service.hasConfigCustomModeRequest()) {
                return false;
            }
            if ((hasConfigCustomModeRequest() && !getConfigCustomModeRequest().equals(service.getConfigCustomModeRequest())) || hasConfigCustomModeResponse() != service.hasConfigCustomModeResponse()) {
                return false;
            }
            if ((hasConfigCustomModeResponse() && !getConfigCustomModeResponse().equals(service.getConfigCustomModeResponse())) || hasConfigCustomModeNotification() != service.hasConfigCustomModeNotification()) {
                return false;
            }
            if ((hasConfigCustomModeNotification() && !getConfigCustomModeNotification().equals(service.getConfigCustomModeNotification())) || hasConfigRotationRequest() != service.hasConfigRotationRequest()) {
                return false;
            }
            if ((hasConfigRotationRequest() && !getConfigRotationRequest().equals(service.getConfigRotationRequest())) || hasConfigRotationResponse() != service.hasConfigRotationResponse()) {
                return false;
            }
            if ((hasConfigRotationResponse() && !getConfigRotationResponse().equals(service.getConfigRotationResponse())) || hasConfigRotationNotification() != service.hasConfigRotationNotification()) {
                return false;
            }
            if ((hasConfigRotationNotification() && !getConfigRotationNotification().equals(service.getConfigRotationNotification())) || hasChangeModeRequest() != service.hasChangeModeRequest()) {
                return false;
            }
            if ((hasChangeModeRequest() && !getChangeModeRequest().equals(service.getChangeModeRequest())) || hasChangeModeResponse() != service.hasChangeModeResponse()) {
                return false;
            }
            if ((hasChangeModeResponse() && !getChangeModeResponse().equals(service.getChangeModeResponse())) || hasChangeModeNotification() != service.hasChangeModeNotification()) {
                return false;
            }
            if ((hasChangeModeNotification() && !getChangeModeNotification().equals(service.getChangeModeNotification())) || hasConfigSettingsRequest() != service.hasConfigSettingsRequest()) {
                return false;
            }
            if ((hasConfigSettingsRequest() && !getConfigSettingsRequest().equals(service.getConfigSettingsRequest())) || hasConfigSettingsResponse() != service.hasConfigSettingsResponse()) {
                return false;
            }
            if ((!hasConfigSettingsResponse() || getConfigSettingsResponse().equals(service.getConfigSettingsResponse())) && hasConfigSettingsNotification() == service.hasConfigSettingsNotification()) {
                return (!hasConfigSettingsNotification() || getConfigSettingsNotification().equals(service.getConfigSettingsNotification())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ChangeModeNotification getChangeModeNotification() {
            ChangeModeNotification changeModeNotification = this.changeModeNotification_;
            return changeModeNotification == null ? ChangeModeNotification.getDefaultInstance() : changeModeNotification;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ChangeModeNotificationOrBuilder getChangeModeNotificationOrBuilder() {
            ChangeModeNotification changeModeNotification = this.changeModeNotification_;
            return changeModeNotification == null ? ChangeModeNotification.getDefaultInstance() : changeModeNotification;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ChangeModeRequest getChangeModeRequest() {
            ChangeModeRequest changeModeRequest = this.changeModeRequest_;
            return changeModeRequest == null ? ChangeModeRequest.getDefaultInstance() : changeModeRequest;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ChangeModeRequestOrBuilder getChangeModeRequestOrBuilder() {
            ChangeModeRequest changeModeRequest = this.changeModeRequest_;
            return changeModeRequest == null ? ChangeModeRequest.getDefaultInstance() : changeModeRequest;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ChangeModeResponse getChangeModeResponse() {
            ChangeModeResponse changeModeResponse = this.changeModeResponse_;
            return changeModeResponse == null ? ChangeModeResponse.getDefaultInstance() : changeModeResponse;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ChangeModeResponseOrBuilder getChangeModeResponseOrBuilder() {
            ChangeModeResponse changeModeResponse = this.changeModeResponse_;
            return changeModeResponse == null ? ChangeModeResponse.getDefaultInstance() : changeModeResponse;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ConfigureCustomModeNotification getConfigCustomModeNotification() {
            ConfigureCustomModeNotification configureCustomModeNotification = this.configCustomModeNotification_;
            return configureCustomModeNotification == null ? ConfigureCustomModeNotification.getDefaultInstance() : configureCustomModeNotification;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ConfigureCustomModeNotificationOrBuilder getConfigCustomModeNotificationOrBuilder() {
            ConfigureCustomModeNotification configureCustomModeNotification = this.configCustomModeNotification_;
            return configureCustomModeNotification == null ? ConfigureCustomModeNotification.getDefaultInstance() : configureCustomModeNotification;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ConfigureCustomModeRequest getConfigCustomModeRequest() {
            ConfigureCustomModeRequest configureCustomModeRequest = this.configCustomModeRequest_;
            return configureCustomModeRequest == null ? ConfigureCustomModeRequest.getDefaultInstance() : configureCustomModeRequest;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ConfigureCustomModeRequestOrBuilder getConfigCustomModeRequestOrBuilder() {
            ConfigureCustomModeRequest configureCustomModeRequest = this.configCustomModeRequest_;
            return configureCustomModeRequest == null ? ConfigureCustomModeRequest.getDefaultInstance() : configureCustomModeRequest;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ConfigureCustomModeResponse getConfigCustomModeResponse() {
            ConfigureCustomModeResponse configureCustomModeResponse = this.configCustomModeResponse_;
            return configureCustomModeResponse == null ? ConfigureCustomModeResponse.getDefaultInstance() : configureCustomModeResponse;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ConfigureCustomModeResponseOrBuilder getConfigCustomModeResponseOrBuilder() {
            ConfigureCustomModeResponse configureCustomModeResponse = this.configCustomModeResponse_;
            return configureCustomModeResponse == null ? ConfigureCustomModeResponse.getDefaultInstance() : configureCustomModeResponse;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ConfigureRotationNotification getConfigRotationNotification() {
            ConfigureRotationNotification configureRotationNotification = this.configRotationNotification_;
            return configureRotationNotification == null ? ConfigureRotationNotification.getDefaultInstance() : configureRotationNotification;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ConfigureRotationNotificationOrBuilder getConfigRotationNotificationOrBuilder() {
            ConfigureRotationNotification configureRotationNotification = this.configRotationNotification_;
            return configureRotationNotification == null ? ConfigureRotationNotification.getDefaultInstance() : configureRotationNotification;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ConfigureRotationRequest getConfigRotationRequest() {
            ConfigureRotationRequest configureRotationRequest = this.configRotationRequest_;
            return configureRotationRequest == null ? ConfigureRotationRequest.getDefaultInstance() : configureRotationRequest;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ConfigureRotationRequestOrBuilder getConfigRotationRequestOrBuilder() {
            ConfigureRotationRequest configureRotationRequest = this.configRotationRequest_;
            return configureRotationRequest == null ? ConfigureRotationRequest.getDefaultInstance() : configureRotationRequest;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ConfigureRotationResponse getConfigRotationResponse() {
            ConfigureRotationResponse configureRotationResponse = this.configRotationResponse_;
            return configureRotationResponse == null ? ConfigureRotationResponse.getDefaultInstance() : configureRotationResponse;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ConfigureRotationResponseOrBuilder getConfigRotationResponseOrBuilder() {
            ConfigureRotationResponse configureRotationResponse = this.configRotationResponse_;
            return configureRotationResponse == null ? ConfigureRotationResponse.getDefaultInstance() : configureRotationResponse;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ConfigureSettingsNotification getConfigSettingsNotification() {
            ConfigureSettingsNotification configureSettingsNotification = this.configSettingsNotification_;
            return configureSettingsNotification == null ? ConfigureSettingsNotification.getDefaultInstance() : configureSettingsNotification;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ConfigureSettingsNotificationOrBuilder getConfigSettingsNotificationOrBuilder() {
            ConfigureSettingsNotification configureSettingsNotification = this.configSettingsNotification_;
            return configureSettingsNotification == null ? ConfigureSettingsNotification.getDefaultInstance() : configureSettingsNotification;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ConfigureSettingsRequest getConfigSettingsRequest() {
            ConfigureSettingsRequest configureSettingsRequest = this.configSettingsRequest_;
            return configureSettingsRequest == null ? ConfigureSettingsRequest.getDefaultInstance() : configureSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ConfigureSettingsRequestOrBuilder getConfigSettingsRequestOrBuilder() {
            ConfigureSettingsRequest configureSettingsRequest = this.configSettingsRequest_;
            return configureSettingsRequest == null ? ConfigureSettingsRequest.getDefaultInstance() : configureSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ConfigureSettingsResponse getConfigSettingsResponse() {
            ConfigureSettingsResponse configureSettingsResponse = this.configSettingsResponse_;
            return configureSettingsResponse == null ? ConfigureSettingsResponse.getDefaultInstance() : configureSettingsResponse;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public ConfigureSettingsResponseOrBuilder getConfigSettingsResponseOrBuilder() {
            ConfigureSettingsResponse configureSettingsResponse = this.configSettingsResponse_;
            return configureSettingsResponse == null ? ConfigureSettingsResponse.getDefaultInstance() : configureSettingsResponse;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getConfigCustomModeRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getConfigCustomModeResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getConfigCustomModeNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getConfigRotationRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getConfigRotationResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getConfigRotationNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getChangeModeRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getChangeModeResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getChangeModeNotification());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getConfigSettingsRequest());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getConfigSettingsResponse());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getConfigSettingsNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public boolean hasChangeModeNotification() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public boolean hasChangeModeRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public boolean hasChangeModeResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public boolean hasConfigCustomModeNotification() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public boolean hasConfigCustomModeRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public boolean hasConfigCustomModeResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public boolean hasConfigRotationNotification() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public boolean hasConfigRotationRequest() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public boolean hasConfigRotationResponse() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public boolean hasConfigSettingsNotification() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public boolean hasConfigSettingsRequest() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
        public boolean hasConfigSettingsResponse() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConfigCustomModeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConfigCustomModeRequest().hashCode();
            }
            if (hasConfigCustomModeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getConfigCustomModeResponse().hashCode();
            }
            if (hasConfigCustomModeNotification()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getConfigCustomModeNotification().hashCode();
            }
            if (hasConfigRotationRequest()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getConfigRotationRequest().hashCode();
            }
            if (hasConfigRotationResponse()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getConfigRotationResponse().hashCode();
            }
            if (hasConfigRotationNotification()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getConfigRotationNotification().hashCode();
            }
            if (hasChangeModeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getChangeModeRequest().hashCode();
            }
            if (hasChangeModeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getChangeModeResponse().hashCode();
            }
            if (hasChangeModeNotification()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getChangeModeNotification().hashCode();
            }
            if (hasConfigSettingsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getConfigSettingsRequest().hashCode();
            }
            if (hasConfigSettingsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getConfigSettingsResponse().hashCode();
            }
            if (hasConfigSettingsNotification()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getConfigSettingsNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIBikeLight.internal_static_GDI_Proto_BikeLight_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getConfigCustomModeRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getConfigCustomModeResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getConfigCustomModeNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getConfigRotationRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getConfigRotationResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getConfigRotationNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getChangeModeRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getChangeModeResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getChangeModeNotification());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getConfigSettingsRequest());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getConfigSettingsResponse());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(12, getConfigSettingsNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ChangeModeNotification, ChangeModeNotification.Builder, ChangeModeNotificationOrBuilder> changeModeNotificationBuilder_;
            private ChangeModeNotification changeModeNotification_;
            private SingleFieldBuilderV3<ChangeModeRequest, ChangeModeRequest.Builder, ChangeModeRequestOrBuilder> changeModeRequestBuilder_;
            private ChangeModeRequest changeModeRequest_;
            private SingleFieldBuilderV3<ChangeModeResponse, ChangeModeResponse.Builder, ChangeModeResponseOrBuilder> changeModeResponseBuilder_;
            private ChangeModeResponse changeModeResponse_;
            private SingleFieldBuilderV3<ConfigureCustomModeNotification, ConfigureCustomModeNotification.Builder, ConfigureCustomModeNotificationOrBuilder> configCustomModeNotificationBuilder_;
            private ConfigureCustomModeNotification configCustomModeNotification_;
            private SingleFieldBuilderV3<ConfigureCustomModeRequest, ConfigureCustomModeRequest.Builder, ConfigureCustomModeRequestOrBuilder> configCustomModeRequestBuilder_;
            private ConfigureCustomModeRequest configCustomModeRequest_;
            private SingleFieldBuilderV3<ConfigureCustomModeResponse, ConfigureCustomModeResponse.Builder, ConfigureCustomModeResponseOrBuilder> configCustomModeResponseBuilder_;
            private ConfigureCustomModeResponse configCustomModeResponse_;
            private SingleFieldBuilderV3<ConfigureRotationNotification, ConfigureRotationNotification.Builder, ConfigureRotationNotificationOrBuilder> configRotationNotificationBuilder_;
            private ConfigureRotationNotification configRotationNotification_;
            private SingleFieldBuilderV3<ConfigureRotationRequest, ConfigureRotationRequest.Builder, ConfigureRotationRequestOrBuilder> configRotationRequestBuilder_;
            private ConfigureRotationRequest configRotationRequest_;
            private SingleFieldBuilderV3<ConfigureRotationResponse, ConfigureRotationResponse.Builder, ConfigureRotationResponseOrBuilder> configRotationResponseBuilder_;
            private ConfigureRotationResponse configRotationResponse_;
            private SingleFieldBuilderV3<ConfigureSettingsNotification, ConfigureSettingsNotification.Builder, ConfigureSettingsNotificationOrBuilder> configSettingsNotificationBuilder_;
            private ConfigureSettingsNotification configSettingsNotification_;
            private SingleFieldBuilderV3<ConfigureSettingsRequest, ConfigureSettingsRequest.Builder, ConfigureSettingsRequestOrBuilder> configSettingsRequestBuilder_;
            private ConfigureSettingsRequest configSettingsRequest_;
            private SingleFieldBuilderV3<ConfigureSettingsResponse, ConfigureSettingsResponse.Builder, ConfigureSettingsResponseOrBuilder> configSettingsResponseBuilder_;
            private ConfigureSettingsResponse configSettingsResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<ConfigureCustomModeRequest, ConfigureCustomModeRequest.Builder, ConfigureCustomModeRequestOrBuilder> singleFieldBuilderV3 = this.configCustomModeRequestBuilder_;
                    service.configCustomModeRequest_ = singleFieldBuilderV3 == null ? this.configCustomModeRequest_ : (ConfigureCustomModeRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ConfigureCustomModeResponse, ConfigureCustomModeResponse.Builder, ConfigureCustomModeResponseOrBuilder> singleFieldBuilderV4 = this.configCustomModeResponseBuilder_;
                    service.configCustomModeResponse_ = singleFieldBuilderV4 == null ? this.configCustomModeResponse_ : (ConfigureCustomModeResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<ConfigureCustomModeNotification, ConfigureCustomModeNotification.Builder, ConfigureCustomModeNotificationOrBuilder> singleFieldBuilderV5 = this.configCustomModeNotificationBuilder_;
                    service.configCustomModeNotification_ = singleFieldBuilderV5 == null ? this.configCustomModeNotification_ : (ConfigureCustomModeNotification) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<ConfigureRotationRequest, ConfigureRotationRequest.Builder, ConfigureRotationRequestOrBuilder> singleFieldBuilderV6 = this.configRotationRequestBuilder_;
                    service.configRotationRequest_ = singleFieldBuilderV6 == null ? this.configRotationRequest_ : (ConfigureRotationRequest) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<ConfigureRotationResponse, ConfigureRotationResponse.Builder, ConfigureRotationResponseOrBuilder> singleFieldBuilderV7 = this.configRotationResponseBuilder_;
                    service.configRotationResponse_ = singleFieldBuilderV7 == null ? this.configRotationResponse_ : (ConfigureRotationResponse) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<ConfigureRotationNotification, ConfigureRotationNotification.Builder, ConfigureRotationNotificationOrBuilder> singleFieldBuilderV8 = this.configRotationNotificationBuilder_;
                    service.configRotationNotification_ = singleFieldBuilderV8 == null ? this.configRotationNotification_ : (ConfigureRotationNotification) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<ChangeModeRequest, ChangeModeRequest.Builder, ChangeModeRequestOrBuilder> singleFieldBuilderV9 = this.changeModeRequestBuilder_;
                    service.changeModeRequest_ = singleFieldBuilderV9 == null ? this.changeModeRequest_ : (ChangeModeRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<ChangeModeResponse, ChangeModeResponse.Builder, ChangeModeResponseOrBuilder> singleFieldBuilderV10 = this.changeModeResponseBuilder_;
                    service.changeModeResponse_ = singleFieldBuilderV10 == null ? this.changeModeResponse_ : (ChangeModeResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<ChangeModeNotification, ChangeModeNotification.Builder, ChangeModeNotificationOrBuilder> singleFieldBuilderV11 = this.changeModeNotificationBuilder_;
                    service.changeModeNotification_ = singleFieldBuilderV11 == null ? this.changeModeNotification_ : (ChangeModeNotification) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<ConfigureSettingsRequest, ConfigureSettingsRequest.Builder, ConfigureSettingsRequestOrBuilder> singleFieldBuilderV12 = this.configSettingsRequestBuilder_;
                    service.configSettingsRequest_ = singleFieldBuilderV12 == null ? this.configSettingsRequest_ : (ConfigureSettingsRequest) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<ConfigureSettingsResponse, ConfigureSettingsResponse.Builder, ConfigureSettingsResponseOrBuilder> singleFieldBuilderV13 = this.configSettingsResponseBuilder_;
                    service.configSettingsResponse_ = singleFieldBuilderV13 == null ? this.configSettingsResponse_ : (ConfigureSettingsResponse) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<ConfigureSettingsNotification, ConfigureSettingsNotification.Builder, ConfigureSettingsNotificationOrBuilder> singleFieldBuilderV14 = this.configSettingsNotificationBuilder_;
                    service.configSettingsNotification_ = singleFieldBuilderV14 == null ? this.configSettingsNotification_ : (ConfigureSettingsNotification) singleFieldBuilderV14.build();
                    i14 |= 2048;
                }
                service.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ChangeModeNotification, ChangeModeNotification.Builder, ChangeModeNotificationOrBuilder> getChangeModeNotificationFieldBuilder() {
                if (this.changeModeNotificationBuilder_ == null) {
                    this.changeModeNotificationBuilder_ = new SingleFieldBuilderV3<>(getChangeModeNotification(), getParentForChildren(), isClean());
                    this.changeModeNotification_ = null;
                }
                return this.changeModeNotificationBuilder_;
            }

            private SingleFieldBuilderV3<ChangeModeRequest, ChangeModeRequest.Builder, ChangeModeRequestOrBuilder> getChangeModeRequestFieldBuilder() {
                if (this.changeModeRequestBuilder_ == null) {
                    this.changeModeRequestBuilder_ = new SingleFieldBuilderV3<>(getChangeModeRequest(), getParentForChildren(), isClean());
                    this.changeModeRequest_ = null;
                }
                return this.changeModeRequestBuilder_;
            }

            private SingleFieldBuilderV3<ChangeModeResponse, ChangeModeResponse.Builder, ChangeModeResponseOrBuilder> getChangeModeResponseFieldBuilder() {
                if (this.changeModeResponseBuilder_ == null) {
                    this.changeModeResponseBuilder_ = new SingleFieldBuilderV3<>(getChangeModeResponse(), getParentForChildren(), isClean());
                    this.changeModeResponse_ = null;
                }
                return this.changeModeResponseBuilder_;
            }

            private SingleFieldBuilderV3<ConfigureCustomModeNotification, ConfigureCustomModeNotification.Builder, ConfigureCustomModeNotificationOrBuilder> getConfigCustomModeNotificationFieldBuilder() {
                if (this.configCustomModeNotificationBuilder_ == null) {
                    this.configCustomModeNotificationBuilder_ = new SingleFieldBuilderV3<>(getConfigCustomModeNotification(), getParentForChildren(), isClean());
                    this.configCustomModeNotification_ = null;
                }
                return this.configCustomModeNotificationBuilder_;
            }

            private SingleFieldBuilderV3<ConfigureCustomModeRequest, ConfigureCustomModeRequest.Builder, ConfigureCustomModeRequestOrBuilder> getConfigCustomModeRequestFieldBuilder() {
                if (this.configCustomModeRequestBuilder_ == null) {
                    this.configCustomModeRequestBuilder_ = new SingleFieldBuilderV3<>(getConfigCustomModeRequest(), getParentForChildren(), isClean());
                    this.configCustomModeRequest_ = null;
                }
                return this.configCustomModeRequestBuilder_;
            }

            private SingleFieldBuilderV3<ConfigureCustomModeResponse, ConfigureCustomModeResponse.Builder, ConfigureCustomModeResponseOrBuilder> getConfigCustomModeResponseFieldBuilder() {
                if (this.configCustomModeResponseBuilder_ == null) {
                    this.configCustomModeResponseBuilder_ = new SingleFieldBuilderV3<>(getConfigCustomModeResponse(), getParentForChildren(), isClean());
                    this.configCustomModeResponse_ = null;
                }
                return this.configCustomModeResponseBuilder_;
            }

            private SingleFieldBuilderV3<ConfigureRotationNotification, ConfigureRotationNotification.Builder, ConfigureRotationNotificationOrBuilder> getConfigRotationNotificationFieldBuilder() {
                if (this.configRotationNotificationBuilder_ == null) {
                    this.configRotationNotificationBuilder_ = new SingleFieldBuilderV3<>(getConfigRotationNotification(), getParentForChildren(), isClean());
                    this.configRotationNotification_ = null;
                }
                return this.configRotationNotificationBuilder_;
            }

            private SingleFieldBuilderV3<ConfigureRotationRequest, ConfigureRotationRequest.Builder, ConfigureRotationRequestOrBuilder> getConfigRotationRequestFieldBuilder() {
                if (this.configRotationRequestBuilder_ == null) {
                    this.configRotationRequestBuilder_ = new SingleFieldBuilderV3<>(getConfigRotationRequest(), getParentForChildren(), isClean());
                    this.configRotationRequest_ = null;
                }
                return this.configRotationRequestBuilder_;
            }

            private SingleFieldBuilderV3<ConfigureRotationResponse, ConfigureRotationResponse.Builder, ConfigureRotationResponseOrBuilder> getConfigRotationResponseFieldBuilder() {
                if (this.configRotationResponseBuilder_ == null) {
                    this.configRotationResponseBuilder_ = new SingleFieldBuilderV3<>(getConfigRotationResponse(), getParentForChildren(), isClean());
                    this.configRotationResponse_ = null;
                }
                return this.configRotationResponseBuilder_;
            }

            private SingleFieldBuilderV3<ConfigureSettingsNotification, ConfigureSettingsNotification.Builder, ConfigureSettingsNotificationOrBuilder> getConfigSettingsNotificationFieldBuilder() {
                if (this.configSettingsNotificationBuilder_ == null) {
                    this.configSettingsNotificationBuilder_ = new SingleFieldBuilderV3<>(getConfigSettingsNotification(), getParentForChildren(), isClean());
                    this.configSettingsNotification_ = null;
                }
                return this.configSettingsNotificationBuilder_;
            }

            private SingleFieldBuilderV3<ConfigureSettingsRequest, ConfigureSettingsRequest.Builder, ConfigureSettingsRequestOrBuilder> getConfigSettingsRequestFieldBuilder() {
                if (this.configSettingsRequestBuilder_ == null) {
                    this.configSettingsRequestBuilder_ = new SingleFieldBuilderV3<>(getConfigSettingsRequest(), getParentForChildren(), isClean());
                    this.configSettingsRequest_ = null;
                }
                return this.configSettingsRequestBuilder_;
            }

            private SingleFieldBuilderV3<ConfigureSettingsResponse, ConfigureSettingsResponse.Builder, ConfigureSettingsResponseOrBuilder> getConfigSettingsResponseFieldBuilder() {
                if (this.configSettingsResponseBuilder_ == null) {
                    this.configSettingsResponseBuilder_ = new SingleFieldBuilderV3<>(getConfigSettingsResponse(), getParentForChildren(), isClean());
                    this.configSettingsResponse_ = null;
                }
                return this.configSettingsResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_Service_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConfigCustomModeRequestFieldBuilder();
                    getConfigCustomModeResponseFieldBuilder();
                    getConfigCustomModeNotificationFieldBuilder();
                    getConfigRotationRequestFieldBuilder();
                    getConfigRotationResponseFieldBuilder();
                    getConfigRotationNotificationFieldBuilder();
                    getChangeModeRequestFieldBuilder();
                    getChangeModeResponseFieldBuilder();
                    getChangeModeNotificationFieldBuilder();
                    getConfigSettingsRequestFieldBuilder();
                    getConfigSettingsResponseFieldBuilder();
                    getConfigSettingsNotificationFieldBuilder();
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
                this.configCustomModeRequest_ = null;
                SingleFieldBuilderV3<ConfigureCustomModeRequest, ConfigureCustomModeRequest.Builder, ConfigureCustomModeRequestOrBuilder> singleFieldBuilderV3 = this.configCustomModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configCustomModeRequestBuilder_ = null;
                }
                this.configCustomModeResponse_ = null;
                SingleFieldBuilderV3<ConfigureCustomModeResponse, ConfigureCustomModeResponse.Builder, ConfigureCustomModeResponseOrBuilder> singleFieldBuilderV4 = this.configCustomModeResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.configCustomModeResponseBuilder_ = null;
                }
                this.configCustomModeNotification_ = null;
                SingleFieldBuilderV3<ConfigureCustomModeNotification, ConfigureCustomModeNotification.Builder, ConfigureCustomModeNotificationOrBuilder> singleFieldBuilderV5 = this.configCustomModeNotificationBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.configCustomModeNotificationBuilder_ = null;
                }
                this.configRotationRequest_ = null;
                SingleFieldBuilderV3<ConfigureRotationRequest, ConfigureRotationRequest.Builder, ConfigureRotationRequestOrBuilder> singleFieldBuilderV6 = this.configRotationRequestBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.configRotationRequestBuilder_ = null;
                }
                this.configRotationResponse_ = null;
                SingleFieldBuilderV3<ConfigureRotationResponse, ConfigureRotationResponse.Builder, ConfigureRotationResponseOrBuilder> singleFieldBuilderV7 = this.configRotationResponseBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.configRotationResponseBuilder_ = null;
                }
                this.configRotationNotification_ = null;
                SingleFieldBuilderV3<ConfigureRotationNotification, ConfigureRotationNotification.Builder, ConfigureRotationNotificationOrBuilder> singleFieldBuilderV8 = this.configRotationNotificationBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.configRotationNotificationBuilder_ = null;
                }
                this.changeModeRequest_ = null;
                SingleFieldBuilderV3<ChangeModeRequest, ChangeModeRequest.Builder, ChangeModeRequestOrBuilder> singleFieldBuilderV9 = this.changeModeRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.changeModeRequestBuilder_ = null;
                }
                this.changeModeResponse_ = null;
                SingleFieldBuilderV3<ChangeModeResponse, ChangeModeResponse.Builder, ChangeModeResponseOrBuilder> singleFieldBuilderV10 = this.changeModeResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.changeModeResponseBuilder_ = null;
                }
                this.changeModeNotification_ = null;
                SingleFieldBuilderV3<ChangeModeNotification, ChangeModeNotification.Builder, ChangeModeNotificationOrBuilder> singleFieldBuilderV11 = this.changeModeNotificationBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.changeModeNotificationBuilder_ = null;
                }
                this.configSettingsRequest_ = null;
                SingleFieldBuilderV3<ConfigureSettingsRequest, ConfigureSettingsRequest.Builder, ConfigureSettingsRequestOrBuilder> singleFieldBuilderV12 = this.configSettingsRequestBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.configSettingsRequestBuilder_ = null;
                }
                this.configSettingsResponse_ = null;
                SingleFieldBuilderV3<ConfigureSettingsResponse, ConfigureSettingsResponse.Builder, ConfigureSettingsResponseOrBuilder> singleFieldBuilderV13 = this.configSettingsResponseBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.configSettingsResponseBuilder_ = null;
                }
                this.configSettingsNotification_ = null;
                SingleFieldBuilderV3<ConfigureSettingsNotification, ConfigureSettingsNotification.Builder, ConfigureSettingsNotificationOrBuilder> singleFieldBuilderV14 = this.configSettingsNotificationBuilder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.configSettingsNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearChangeModeNotification() {
                this.bitField0_ &= -257;
                this.changeModeNotification_ = null;
                SingleFieldBuilderV3<ChangeModeNotification, ChangeModeNotification.Builder, ChangeModeNotificationOrBuilder> singleFieldBuilderV3 = this.changeModeNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.changeModeNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearChangeModeRequest() {
                this.bitField0_ &= -65;
                this.changeModeRequest_ = null;
                SingleFieldBuilderV3<ChangeModeRequest, ChangeModeRequest.Builder, ChangeModeRequestOrBuilder> singleFieldBuilderV3 = this.changeModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.changeModeRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearChangeModeResponse() {
                this.bitField0_ &= -129;
                this.changeModeResponse_ = null;
                SingleFieldBuilderV3<ChangeModeResponse, ChangeModeResponse.Builder, ChangeModeResponseOrBuilder> singleFieldBuilderV3 = this.changeModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.changeModeResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConfigCustomModeNotification() {
                this.bitField0_ &= -5;
                this.configCustomModeNotification_ = null;
                SingleFieldBuilderV3<ConfigureCustomModeNotification, ConfigureCustomModeNotification.Builder, ConfigureCustomModeNotificationOrBuilder> singleFieldBuilderV3 = this.configCustomModeNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configCustomModeNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConfigCustomModeRequest() {
                this.bitField0_ &= -2;
                this.configCustomModeRequest_ = null;
                SingleFieldBuilderV3<ConfigureCustomModeRequest, ConfigureCustomModeRequest.Builder, ConfigureCustomModeRequestOrBuilder> singleFieldBuilderV3 = this.configCustomModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configCustomModeRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConfigCustomModeResponse() {
                this.bitField0_ &= -3;
                this.configCustomModeResponse_ = null;
                SingleFieldBuilderV3<ConfigureCustomModeResponse, ConfigureCustomModeResponse.Builder, ConfigureCustomModeResponseOrBuilder> singleFieldBuilderV3 = this.configCustomModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configCustomModeResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConfigRotationNotification() {
                this.bitField0_ &= -33;
                this.configRotationNotification_ = null;
                SingleFieldBuilderV3<ConfigureRotationNotification, ConfigureRotationNotification.Builder, ConfigureRotationNotificationOrBuilder> singleFieldBuilderV3 = this.configRotationNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configRotationNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConfigRotationRequest() {
                this.bitField0_ &= -9;
                this.configRotationRequest_ = null;
                SingleFieldBuilderV3<ConfigureRotationRequest, ConfigureRotationRequest.Builder, ConfigureRotationRequestOrBuilder> singleFieldBuilderV3 = this.configRotationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configRotationRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConfigRotationResponse() {
                this.bitField0_ &= -17;
                this.configRotationResponse_ = null;
                SingleFieldBuilderV3<ConfigureRotationResponse, ConfigureRotationResponse.Builder, ConfigureRotationResponseOrBuilder> singleFieldBuilderV3 = this.configRotationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configRotationResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConfigSettingsNotification() {
                this.bitField0_ &= -2049;
                this.configSettingsNotification_ = null;
                SingleFieldBuilderV3<ConfigureSettingsNotification, ConfigureSettingsNotification.Builder, ConfigureSettingsNotificationOrBuilder> singleFieldBuilderV3 = this.configSettingsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configSettingsNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConfigSettingsRequest() {
                this.bitField0_ &= -513;
                this.configSettingsRequest_ = null;
                SingleFieldBuilderV3<ConfigureSettingsRequest, ConfigureSettingsRequest.Builder, ConfigureSettingsRequestOrBuilder> singleFieldBuilderV3 = this.configSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configSettingsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConfigSettingsResponse() {
                this.bitField0_ &= -1025;
                this.configSettingsResponse_ = null;
                SingleFieldBuilderV3<ConfigureSettingsResponse, ConfigureSettingsResponse.Builder, ConfigureSettingsResponseOrBuilder> singleFieldBuilderV3 = this.configSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configSettingsResponseBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ChangeModeNotification getChangeModeNotification() {
                SingleFieldBuilderV3<ChangeModeNotification, ChangeModeNotification.Builder, ChangeModeNotificationOrBuilder> singleFieldBuilderV3 = this.changeModeNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ChangeModeNotification) singleFieldBuilderV3.getMessage();
                }
                ChangeModeNotification changeModeNotification = this.changeModeNotification_;
                return changeModeNotification == null ? ChangeModeNotification.getDefaultInstance() : changeModeNotification;
            }

            public ChangeModeNotification.Builder getChangeModeNotificationBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (ChangeModeNotification.Builder) getChangeModeNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ChangeModeNotificationOrBuilder getChangeModeNotificationOrBuilder() {
                SingleFieldBuilderV3<ChangeModeNotification, ChangeModeNotification.Builder, ChangeModeNotificationOrBuilder> singleFieldBuilderV3 = this.changeModeNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ChangeModeNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ChangeModeNotification changeModeNotification = this.changeModeNotification_;
                return changeModeNotification == null ? ChangeModeNotification.getDefaultInstance() : changeModeNotification;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ChangeModeRequest getChangeModeRequest() {
                SingleFieldBuilderV3<ChangeModeRequest, ChangeModeRequest.Builder, ChangeModeRequestOrBuilder> singleFieldBuilderV3 = this.changeModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ChangeModeRequest) singleFieldBuilderV3.getMessage();
                }
                ChangeModeRequest changeModeRequest = this.changeModeRequest_;
                return changeModeRequest == null ? ChangeModeRequest.getDefaultInstance() : changeModeRequest;
            }

            public ChangeModeRequest.Builder getChangeModeRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (ChangeModeRequest.Builder) getChangeModeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ChangeModeRequestOrBuilder getChangeModeRequestOrBuilder() {
                SingleFieldBuilderV3<ChangeModeRequest, ChangeModeRequest.Builder, ChangeModeRequestOrBuilder> singleFieldBuilderV3 = this.changeModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ChangeModeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ChangeModeRequest changeModeRequest = this.changeModeRequest_;
                return changeModeRequest == null ? ChangeModeRequest.getDefaultInstance() : changeModeRequest;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ChangeModeResponse getChangeModeResponse() {
                SingleFieldBuilderV3<ChangeModeResponse, ChangeModeResponse.Builder, ChangeModeResponseOrBuilder> singleFieldBuilderV3 = this.changeModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ChangeModeResponse) singleFieldBuilderV3.getMessage();
                }
                ChangeModeResponse changeModeResponse = this.changeModeResponse_;
                return changeModeResponse == null ? ChangeModeResponse.getDefaultInstance() : changeModeResponse;
            }

            public ChangeModeResponse.Builder getChangeModeResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (ChangeModeResponse.Builder) getChangeModeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ChangeModeResponseOrBuilder getChangeModeResponseOrBuilder() {
                SingleFieldBuilderV3<ChangeModeResponse, ChangeModeResponse.Builder, ChangeModeResponseOrBuilder> singleFieldBuilderV3 = this.changeModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ChangeModeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ChangeModeResponse changeModeResponse = this.changeModeResponse_;
                return changeModeResponse == null ? ChangeModeResponse.getDefaultInstance() : changeModeResponse;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ConfigureCustomModeNotification getConfigCustomModeNotification() {
                SingleFieldBuilderV3<ConfigureCustomModeNotification, ConfigureCustomModeNotification.Builder, ConfigureCustomModeNotificationOrBuilder> singleFieldBuilderV3 = this.configCustomModeNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureCustomModeNotification) singleFieldBuilderV3.getMessage();
                }
                ConfigureCustomModeNotification configureCustomModeNotification = this.configCustomModeNotification_;
                return configureCustomModeNotification == null ? ConfigureCustomModeNotification.getDefaultInstance() : configureCustomModeNotification;
            }

            public ConfigureCustomModeNotification.Builder getConfigCustomModeNotificationBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (ConfigureCustomModeNotification.Builder) getConfigCustomModeNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ConfigureCustomModeNotificationOrBuilder getConfigCustomModeNotificationOrBuilder() {
                SingleFieldBuilderV3<ConfigureCustomModeNotification, ConfigureCustomModeNotification.Builder, ConfigureCustomModeNotificationOrBuilder> singleFieldBuilderV3 = this.configCustomModeNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureCustomModeNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigureCustomModeNotification configureCustomModeNotification = this.configCustomModeNotification_;
                return configureCustomModeNotification == null ? ConfigureCustomModeNotification.getDefaultInstance() : configureCustomModeNotification;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ConfigureCustomModeRequest getConfigCustomModeRequest() {
                SingleFieldBuilderV3<ConfigureCustomModeRequest, ConfigureCustomModeRequest.Builder, ConfigureCustomModeRequestOrBuilder> singleFieldBuilderV3 = this.configCustomModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureCustomModeRequest) singleFieldBuilderV3.getMessage();
                }
                ConfigureCustomModeRequest configureCustomModeRequest = this.configCustomModeRequest_;
                return configureCustomModeRequest == null ? ConfigureCustomModeRequest.getDefaultInstance() : configureCustomModeRequest;
            }

            public ConfigureCustomModeRequest.Builder getConfigCustomModeRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ConfigureCustomModeRequest.Builder) getConfigCustomModeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ConfigureCustomModeRequestOrBuilder getConfigCustomModeRequestOrBuilder() {
                SingleFieldBuilderV3<ConfigureCustomModeRequest, ConfigureCustomModeRequest.Builder, ConfigureCustomModeRequestOrBuilder> singleFieldBuilderV3 = this.configCustomModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureCustomModeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigureCustomModeRequest configureCustomModeRequest = this.configCustomModeRequest_;
                return configureCustomModeRequest == null ? ConfigureCustomModeRequest.getDefaultInstance() : configureCustomModeRequest;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ConfigureCustomModeResponse getConfigCustomModeResponse() {
                SingleFieldBuilderV3<ConfigureCustomModeResponse, ConfigureCustomModeResponse.Builder, ConfigureCustomModeResponseOrBuilder> singleFieldBuilderV3 = this.configCustomModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureCustomModeResponse) singleFieldBuilderV3.getMessage();
                }
                ConfigureCustomModeResponse configureCustomModeResponse = this.configCustomModeResponse_;
                return configureCustomModeResponse == null ? ConfigureCustomModeResponse.getDefaultInstance() : configureCustomModeResponse;
            }

            public ConfigureCustomModeResponse.Builder getConfigCustomModeResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ConfigureCustomModeResponse.Builder) getConfigCustomModeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ConfigureCustomModeResponseOrBuilder getConfigCustomModeResponseOrBuilder() {
                SingleFieldBuilderV3<ConfigureCustomModeResponse, ConfigureCustomModeResponse.Builder, ConfigureCustomModeResponseOrBuilder> singleFieldBuilderV3 = this.configCustomModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureCustomModeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigureCustomModeResponse configureCustomModeResponse = this.configCustomModeResponse_;
                return configureCustomModeResponse == null ? ConfigureCustomModeResponse.getDefaultInstance() : configureCustomModeResponse;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ConfigureRotationNotification getConfigRotationNotification() {
                SingleFieldBuilderV3<ConfigureRotationNotification, ConfigureRotationNotification.Builder, ConfigureRotationNotificationOrBuilder> singleFieldBuilderV3 = this.configRotationNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureRotationNotification) singleFieldBuilderV3.getMessage();
                }
                ConfigureRotationNotification configureRotationNotification = this.configRotationNotification_;
                return configureRotationNotification == null ? ConfigureRotationNotification.getDefaultInstance() : configureRotationNotification;
            }

            public ConfigureRotationNotification.Builder getConfigRotationNotificationBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (ConfigureRotationNotification.Builder) getConfigRotationNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ConfigureRotationNotificationOrBuilder getConfigRotationNotificationOrBuilder() {
                SingleFieldBuilderV3<ConfigureRotationNotification, ConfigureRotationNotification.Builder, ConfigureRotationNotificationOrBuilder> singleFieldBuilderV3 = this.configRotationNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureRotationNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigureRotationNotification configureRotationNotification = this.configRotationNotification_;
                return configureRotationNotification == null ? ConfigureRotationNotification.getDefaultInstance() : configureRotationNotification;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ConfigureRotationRequest getConfigRotationRequest() {
                SingleFieldBuilderV3<ConfigureRotationRequest, ConfigureRotationRequest.Builder, ConfigureRotationRequestOrBuilder> singleFieldBuilderV3 = this.configRotationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureRotationRequest) singleFieldBuilderV3.getMessage();
                }
                ConfigureRotationRequest configureRotationRequest = this.configRotationRequest_;
                return configureRotationRequest == null ? ConfigureRotationRequest.getDefaultInstance() : configureRotationRequest;
            }

            public ConfigureRotationRequest.Builder getConfigRotationRequestBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (ConfigureRotationRequest.Builder) getConfigRotationRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ConfigureRotationRequestOrBuilder getConfigRotationRequestOrBuilder() {
                SingleFieldBuilderV3<ConfigureRotationRequest, ConfigureRotationRequest.Builder, ConfigureRotationRequestOrBuilder> singleFieldBuilderV3 = this.configRotationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureRotationRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigureRotationRequest configureRotationRequest = this.configRotationRequest_;
                return configureRotationRequest == null ? ConfigureRotationRequest.getDefaultInstance() : configureRotationRequest;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ConfigureRotationResponse getConfigRotationResponse() {
                SingleFieldBuilderV3<ConfigureRotationResponse, ConfigureRotationResponse.Builder, ConfigureRotationResponseOrBuilder> singleFieldBuilderV3 = this.configRotationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureRotationResponse) singleFieldBuilderV3.getMessage();
                }
                ConfigureRotationResponse configureRotationResponse = this.configRotationResponse_;
                return configureRotationResponse == null ? ConfigureRotationResponse.getDefaultInstance() : configureRotationResponse;
            }

            public ConfigureRotationResponse.Builder getConfigRotationResponseBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (ConfigureRotationResponse.Builder) getConfigRotationResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ConfigureRotationResponseOrBuilder getConfigRotationResponseOrBuilder() {
                SingleFieldBuilderV3<ConfigureRotationResponse, ConfigureRotationResponse.Builder, ConfigureRotationResponseOrBuilder> singleFieldBuilderV3 = this.configRotationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureRotationResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigureRotationResponse configureRotationResponse = this.configRotationResponse_;
                return configureRotationResponse == null ? ConfigureRotationResponse.getDefaultInstance() : configureRotationResponse;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ConfigureSettingsNotification getConfigSettingsNotification() {
                SingleFieldBuilderV3<ConfigureSettingsNotification, ConfigureSettingsNotification.Builder, ConfigureSettingsNotificationOrBuilder> singleFieldBuilderV3 = this.configSettingsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureSettingsNotification) singleFieldBuilderV3.getMessage();
                }
                ConfigureSettingsNotification configureSettingsNotification = this.configSettingsNotification_;
                return configureSettingsNotification == null ? ConfigureSettingsNotification.getDefaultInstance() : configureSettingsNotification;
            }

            public ConfigureSettingsNotification.Builder getConfigSettingsNotificationBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (ConfigureSettingsNotification.Builder) getConfigSettingsNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ConfigureSettingsNotificationOrBuilder getConfigSettingsNotificationOrBuilder() {
                SingleFieldBuilderV3<ConfigureSettingsNotification, ConfigureSettingsNotification.Builder, ConfigureSettingsNotificationOrBuilder> singleFieldBuilderV3 = this.configSettingsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureSettingsNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigureSettingsNotification configureSettingsNotification = this.configSettingsNotification_;
                return configureSettingsNotification == null ? ConfigureSettingsNotification.getDefaultInstance() : configureSettingsNotification;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ConfigureSettingsRequest getConfigSettingsRequest() {
                SingleFieldBuilderV3<ConfigureSettingsRequest, ConfigureSettingsRequest.Builder, ConfigureSettingsRequestOrBuilder> singleFieldBuilderV3 = this.configSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureSettingsRequest) singleFieldBuilderV3.getMessage();
                }
                ConfigureSettingsRequest configureSettingsRequest = this.configSettingsRequest_;
                return configureSettingsRequest == null ? ConfigureSettingsRequest.getDefaultInstance() : configureSettingsRequest;
            }

            public ConfigureSettingsRequest.Builder getConfigSettingsRequestBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (ConfigureSettingsRequest.Builder) getConfigSettingsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ConfigureSettingsRequestOrBuilder getConfigSettingsRequestOrBuilder() {
                SingleFieldBuilderV3<ConfigureSettingsRequest, ConfigureSettingsRequest.Builder, ConfigureSettingsRequestOrBuilder> singleFieldBuilderV3 = this.configSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureSettingsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigureSettingsRequest configureSettingsRequest = this.configSettingsRequest_;
                return configureSettingsRequest == null ? ConfigureSettingsRequest.getDefaultInstance() : configureSettingsRequest;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ConfigureSettingsResponse getConfigSettingsResponse() {
                SingleFieldBuilderV3<ConfigureSettingsResponse, ConfigureSettingsResponse.Builder, ConfigureSettingsResponseOrBuilder> singleFieldBuilderV3 = this.configSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureSettingsResponse) singleFieldBuilderV3.getMessage();
                }
                ConfigureSettingsResponse configureSettingsResponse = this.configSettingsResponse_;
                return configureSettingsResponse == null ? ConfigureSettingsResponse.getDefaultInstance() : configureSettingsResponse;
            }

            public ConfigureSettingsResponse.Builder getConfigSettingsResponseBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (ConfigureSettingsResponse.Builder) getConfigSettingsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public ConfigureSettingsResponseOrBuilder getConfigSettingsResponseOrBuilder() {
                SingleFieldBuilderV3<ConfigureSettingsResponse, ConfigureSettingsResponse.Builder, ConfigureSettingsResponseOrBuilder> singleFieldBuilderV3 = this.configSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigureSettingsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigureSettingsResponse configureSettingsResponse = this.configSettingsResponse_;
                return configureSettingsResponse == null ? ConfigureSettingsResponse.getDefaultInstance() : configureSettingsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public boolean hasChangeModeNotification() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public boolean hasChangeModeRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public boolean hasChangeModeResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public boolean hasConfigCustomModeNotification() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public boolean hasConfigCustomModeRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public boolean hasConfigCustomModeResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public boolean hasConfigRotationNotification() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public boolean hasConfigRotationRequest() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public boolean hasConfigRotationResponse() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public boolean hasConfigSettingsNotification() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public boolean hasConfigSettingsRequest() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIBikeLight.ServiceOrBuilder
            public boolean hasConfigSettingsResponse() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIBikeLight.internal_static_GDI_Proto_BikeLight_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeChangeModeNotification(ChangeModeNotification changeModeNotification) {
                ChangeModeNotification changeModeNotification2;
                SingleFieldBuilderV3<ChangeModeNotification, ChangeModeNotification.Builder, ChangeModeNotificationOrBuilder> singleFieldBuilderV3 = this.changeModeNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(changeModeNotification);
                } else if ((this.bitField0_ & 256) == 0 || (changeModeNotification2 = this.changeModeNotification_) == null || changeModeNotification2 == ChangeModeNotification.getDefaultInstance()) {
                    this.changeModeNotification_ = changeModeNotification;
                } else {
                    getChangeModeNotificationBuilder().mergeFrom(changeModeNotification);
                }
                if (this.changeModeNotification_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeChangeModeRequest(ChangeModeRequest changeModeRequest) {
                ChangeModeRequest changeModeRequest2;
                SingleFieldBuilderV3<ChangeModeRequest, ChangeModeRequest.Builder, ChangeModeRequestOrBuilder> singleFieldBuilderV3 = this.changeModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(changeModeRequest);
                } else if ((this.bitField0_ & 64) == 0 || (changeModeRequest2 = this.changeModeRequest_) == null || changeModeRequest2 == ChangeModeRequest.getDefaultInstance()) {
                    this.changeModeRequest_ = changeModeRequest;
                } else {
                    getChangeModeRequestBuilder().mergeFrom(changeModeRequest);
                }
                if (this.changeModeRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeChangeModeResponse(ChangeModeResponse changeModeResponse) {
                ChangeModeResponse changeModeResponse2;
                SingleFieldBuilderV3<ChangeModeResponse, ChangeModeResponse.Builder, ChangeModeResponseOrBuilder> singleFieldBuilderV3 = this.changeModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(changeModeResponse);
                } else if ((this.bitField0_ & 128) == 0 || (changeModeResponse2 = this.changeModeResponse_) == null || changeModeResponse2 == ChangeModeResponse.getDefaultInstance()) {
                    this.changeModeResponse_ = changeModeResponse;
                } else {
                    getChangeModeResponseBuilder().mergeFrom(changeModeResponse);
                }
                if (this.changeModeResponse_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConfigCustomModeNotification(ConfigureCustomModeNotification configureCustomModeNotification) {
                ConfigureCustomModeNotification configureCustomModeNotification2;
                SingleFieldBuilderV3<ConfigureCustomModeNotification, ConfigureCustomModeNotification.Builder, ConfigureCustomModeNotificationOrBuilder> singleFieldBuilderV3 = this.configCustomModeNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configureCustomModeNotification);
                } else if ((this.bitField0_ & 4) == 0 || (configureCustomModeNotification2 = this.configCustomModeNotification_) == null || configureCustomModeNotification2 == ConfigureCustomModeNotification.getDefaultInstance()) {
                    this.configCustomModeNotification_ = configureCustomModeNotification;
                } else {
                    getConfigCustomModeNotificationBuilder().mergeFrom(configureCustomModeNotification);
                }
                if (this.configCustomModeNotification_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConfigCustomModeRequest(ConfigureCustomModeRequest configureCustomModeRequest) {
                ConfigureCustomModeRequest configureCustomModeRequest2;
                SingleFieldBuilderV3<ConfigureCustomModeRequest, ConfigureCustomModeRequest.Builder, ConfigureCustomModeRequestOrBuilder> singleFieldBuilderV3 = this.configCustomModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configureCustomModeRequest);
                } else if ((this.bitField0_ & 1) == 0 || (configureCustomModeRequest2 = this.configCustomModeRequest_) == null || configureCustomModeRequest2 == ConfigureCustomModeRequest.getDefaultInstance()) {
                    this.configCustomModeRequest_ = configureCustomModeRequest;
                } else {
                    getConfigCustomModeRequestBuilder().mergeFrom(configureCustomModeRequest);
                }
                if (this.configCustomModeRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConfigCustomModeResponse(ConfigureCustomModeResponse configureCustomModeResponse) {
                ConfigureCustomModeResponse configureCustomModeResponse2;
                SingleFieldBuilderV3<ConfigureCustomModeResponse, ConfigureCustomModeResponse.Builder, ConfigureCustomModeResponseOrBuilder> singleFieldBuilderV3 = this.configCustomModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configureCustomModeResponse);
                } else if ((this.bitField0_ & 2) == 0 || (configureCustomModeResponse2 = this.configCustomModeResponse_) == null || configureCustomModeResponse2 == ConfigureCustomModeResponse.getDefaultInstance()) {
                    this.configCustomModeResponse_ = configureCustomModeResponse;
                } else {
                    getConfigCustomModeResponseBuilder().mergeFrom(configureCustomModeResponse);
                }
                if (this.configCustomModeResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConfigRotationNotification(ConfigureRotationNotification configureRotationNotification) {
                ConfigureRotationNotification configureRotationNotification2;
                SingleFieldBuilderV3<ConfigureRotationNotification, ConfigureRotationNotification.Builder, ConfigureRotationNotificationOrBuilder> singleFieldBuilderV3 = this.configRotationNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configureRotationNotification);
                } else if ((this.bitField0_ & 32) == 0 || (configureRotationNotification2 = this.configRotationNotification_) == null || configureRotationNotification2 == ConfigureRotationNotification.getDefaultInstance()) {
                    this.configRotationNotification_ = configureRotationNotification;
                } else {
                    getConfigRotationNotificationBuilder().mergeFrom(configureRotationNotification);
                }
                if (this.configRotationNotification_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConfigRotationRequest(ConfigureRotationRequest configureRotationRequest) {
                ConfigureRotationRequest configureRotationRequest2;
                SingleFieldBuilderV3<ConfigureRotationRequest, ConfigureRotationRequest.Builder, ConfigureRotationRequestOrBuilder> singleFieldBuilderV3 = this.configRotationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configureRotationRequest);
                } else if ((this.bitField0_ & 8) == 0 || (configureRotationRequest2 = this.configRotationRequest_) == null || configureRotationRequest2 == ConfigureRotationRequest.getDefaultInstance()) {
                    this.configRotationRequest_ = configureRotationRequest;
                } else {
                    getConfigRotationRequestBuilder().mergeFrom(configureRotationRequest);
                }
                if (this.configRotationRequest_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConfigRotationResponse(ConfigureRotationResponse configureRotationResponse) {
                ConfigureRotationResponse configureRotationResponse2;
                SingleFieldBuilderV3<ConfigureRotationResponse, ConfigureRotationResponse.Builder, ConfigureRotationResponseOrBuilder> singleFieldBuilderV3 = this.configRotationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configureRotationResponse);
                } else if ((this.bitField0_ & 16) == 0 || (configureRotationResponse2 = this.configRotationResponse_) == null || configureRotationResponse2 == ConfigureRotationResponse.getDefaultInstance()) {
                    this.configRotationResponse_ = configureRotationResponse;
                } else {
                    getConfigRotationResponseBuilder().mergeFrom(configureRotationResponse);
                }
                if (this.configRotationResponse_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConfigSettingsNotification(ConfigureSettingsNotification configureSettingsNotification) {
                ConfigureSettingsNotification configureSettingsNotification2;
                SingleFieldBuilderV3<ConfigureSettingsNotification, ConfigureSettingsNotification.Builder, ConfigureSettingsNotificationOrBuilder> singleFieldBuilderV3 = this.configSettingsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configureSettingsNotification);
                } else if ((this.bitField0_ & 2048) == 0 || (configureSettingsNotification2 = this.configSettingsNotification_) == null || configureSettingsNotification2 == ConfigureSettingsNotification.getDefaultInstance()) {
                    this.configSettingsNotification_ = configureSettingsNotification;
                } else {
                    getConfigSettingsNotificationBuilder().mergeFrom(configureSettingsNotification);
                }
                if (this.configSettingsNotification_ != null) {
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConfigSettingsRequest(ConfigureSettingsRequest configureSettingsRequest) {
                ConfigureSettingsRequest configureSettingsRequest2;
                SingleFieldBuilderV3<ConfigureSettingsRequest, ConfigureSettingsRequest.Builder, ConfigureSettingsRequestOrBuilder> singleFieldBuilderV3 = this.configSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configureSettingsRequest);
                } else if ((this.bitField0_ & 512) == 0 || (configureSettingsRequest2 = this.configSettingsRequest_) == null || configureSettingsRequest2 == ConfigureSettingsRequest.getDefaultInstance()) {
                    this.configSettingsRequest_ = configureSettingsRequest;
                } else {
                    getConfigSettingsRequestBuilder().mergeFrom(configureSettingsRequest);
                }
                if (this.configSettingsRequest_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConfigSettingsResponse(ConfigureSettingsResponse configureSettingsResponse) {
                ConfigureSettingsResponse configureSettingsResponse2;
                SingleFieldBuilderV3<ConfigureSettingsResponse, ConfigureSettingsResponse.Builder, ConfigureSettingsResponseOrBuilder> singleFieldBuilderV3 = this.configSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configureSettingsResponse);
                } else if ((this.bitField0_ & 1024) == 0 || (configureSettingsResponse2 = this.configSettingsResponse_) == null || configureSettingsResponse2 == ConfigureSettingsResponse.getDefaultInstance()) {
                    this.configSettingsResponse_ = configureSettingsResponse;
                } else {
                    getConfigSettingsResponseBuilder().mergeFrom(configureSettingsResponse);
                }
                if (this.configSettingsResponse_ != null) {
                    this.bitField0_ |= 1024;
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
                                    codedInputStream.readMessage(getConfigCustomModeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getConfigCustomModeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getConfigCustomModeNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getConfigRotationRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getConfigRotationResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getConfigRotationNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getChangeModeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getChangeModeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getChangeModeNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getConfigSettingsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getConfigSettingsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 98:
                                    codedInputStream.readMessage(getConfigSettingsNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setChangeModeNotification(ChangeModeNotification.Builder builder) {
                SingleFieldBuilderV3<ChangeModeNotification, ChangeModeNotification.Builder, ChangeModeNotificationOrBuilder> singleFieldBuilderV3 = this.changeModeNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.changeModeNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setChangeModeRequest(ChangeModeRequest.Builder builder) {
                SingleFieldBuilderV3<ChangeModeRequest, ChangeModeRequest.Builder, ChangeModeRequestOrBuilder> singleFieldBuilderV3 = this.changeModeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.changeModeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setChangeModeResponse(ChangeModeResponse.Builder builder) {
                SingleFieldBuilderV3<ChangeModeResponse, ChangeModeResponse.Builder, ChangeModeResponseOrBuilder> singleFieldBuilderV3 = this.changeModeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.changeModeResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setConfigCustomModeNotification(ConfigureCustomModeNotification.Builder builder) {
                SingleFieldBuilderV3<ConfigureCustomModeNotification, ConfigureCustomModeNotification.Builder, ConfigureCustomModeNotificationOrBuilder> singleFieldBuilderV3 = this.configCustomModeNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configCustomModeNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConfigCustomModeRequest(ConfigureCustomModeRequest.Builder builder) {
                SingleFieldBuilderV3<ConfigureCustomModeRequest, ConfigureCustomModeRequest.Builder, ConfigureCustomModeRequestOrBuilder> singleFieldBuilderV3 = this.configCustomModeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configCustomModeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConfigCustomModeResponse(ConfigureCustomModeResponse.Builder builder) {
                SingleFieldBuilderV3<ConfigureCustomModeResponse, ConfigureCustomModeResponse.Builder, ConfigureCustomModeResponseOrBuilder> singleFieldBuilderV3 = this.configCustomModeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configCustomModeResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setConfigRotationNotification(ConfigureRotationNotification.Builder builder) {
                SingleFieldBuilderV3<ConfigureRotationNotification, ConfigureRotationNotification.Builder, ConfigureRotationNotificationOrBuilder> singleFieldBuilderV3 = this.configRotationNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configRotationNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setConfigRotationRequest(ConfigureRotationRequest.Builder builder) {
                SingleFieldBuilderV3<ConfigureRotationRequest, ConfigureRotationRequest.Builder, ConfigureRotationRequestOrBuilder> singleFieldBuilderV3 = this.configRotationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configRotationRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setConfigRotationResponse(ConfigureRotationResponse.Builder builder) {
                SingleFieldBuilderV3<ConfigureRotationResponse, ConfigureRotationResponse.Builder, ConfigureRotationResponseOrBuilder> singleFieldBuilderV3 = this.configRotationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configRotationResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setConfigSettingsNotification(ConfigureSettingsNotification.Builder builder) {
                SingleFieldBuilderV3<ConfigureSettingsNotification, ConfigureSettingsNotification.Builder, ConfigureSettingsNotificationOrBuilder> singleFieldBuilderV3 = this.configSettingsNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configSettingsNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setConfigSettingsRequest(ConfigureSettingsRequest.Builder builder) {
                SingleFieldBuilderV3<ConfigureSettingsRequest, ConfigureSettingsRequest.Builder, ConfigureSettingsRequestOrBuilder> singleFieldBuilderV3 = this.configSettingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configSettingsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setConfigSettingsResponse(ConfigureSettingsResponse.Builder builder) {
                SingleFieldBuilderV3<ConfigureSettingsResponse, ConfigureSettingsResponse.Builder, ConfigureSettingsResponseOrBuilder> singleFieldBuilderV3 = this.configSettingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configSettingsResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
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

            public Builder setChangeModeNotification(ChangeModeNotification changeModeNotification) {
                SingleFieldBuilderV3<ChangeModeNotification, ChangeModeNotification.Builder, ChangeModeNotificationOrBuilder> singleFieldBuilderV3 = this.changeModeNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    changeModeNotification.getClass();
                    this.changeModeNotification_ = changeModeNotification;
                } else {
                    singleFieldBuilderV3.setMessage(changeModeNotification);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setChangeModeRequest(ChangeModeRequest changeModeRequest) {
                SingleFieldBuilderV3<ChangeModeRequest, ChangeModeRequest.Builder, ChangeModeRequestOrBuilder> singleFieldBuilderV3 = this.changeModeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    changeModeRequest.getClass();
                    this.changeModeRequest_ = changeModeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(changeModeRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setChangeModeResponse(ChangeModeResponse changeModeResponse) {
                SingleFieldBuilderV3<ChangeModeResponse, ChangeModeResponse.Builder, ChangeModeResponseOrBuilder> singleFieldBuilderV3 = this.changeModeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    changeModeResponse.getClass();
                    this.changeModeResponse_ = changeModeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(changeModeResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setConfigCustomModeNotification(ConfigureCustomModeNotification configureCustomModeNotification) {
                SingleFieldBuilderV3<ConfigureCustomModeNotification, ConfigureCustomModeNotification.Builder, ConfigureCustomModeNotificationOrBuilder> singleFieldBuilderV3 = this.configCustomModeNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configureCustomModeNotification.getClass();
                    this.configCustomModeNotification_ = configureCustomModeNotification;
                } else {
                    singleFieldBuilderV3.setMessage(configureCustomModeNotification);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConfigCustomModeRequest(ConfigureCustomModeRequest configureCustomModeRequest) {
                SingleFieldBuilderV3<ConfigureCustomModeRequest, ConfigureCustomModeRequest.Builder, ConfigureCustomModeRequestOrBuilder> singleFieldBuilderV3 = this.configCustomModeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configureCustomModeRequest.getClass();
                    this.configCustomModeRequest_ = configureCustomModeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(configureCustomModeRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConfigCustomModeResponse(ConfigureCustomModeResponse configureCustomModeResponse) {
                SingleFieldBuilderV3<ConfigureCustomModeResponse, ConfigureCustomModeResponse.Builder, ConfigureCustomModeResponseOrBuilder> singleFieldBuilderV3 = this.configCustomModeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configureCustomModeResponse.getClass();
                    this.configCustomModeResponse_ = configureCustomModeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(configureCustomModeResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setConfigRotationNotification(ConfigureRotationNotification configureRotationNotification) {
                SingleFieldBuilderV3<ConfigureRotationNotification, ConfigureRotationNotification.Builder, ConfigureRotationNotificationOrBuilder> singleFieldBuilderV3 = this.configRotationNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configureRotationNotification.getClass();
                    this.configRotationNotification_ = configureRotationNotification;
                } else {
                    singleFieldBuilderV3.setMessage(configureRotationNotification);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setConfigRotationRequest(ConfigureRotationRequest configureRotationRequest) {
                SingleFieldBuilderV3<ConfigureRotationRequest, ConfigureRotationRequest.Builder, ConfigureRotationRequestOrBuilder> singleFieldBuilderV3 = this.configRotationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configureRotationRequest.getClass();
                    this.configRotationRequest_ = configureRotationRequest;
                } else {
                    singleFieldBuilderV3.setMessage(configureRotationRequest);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setConfigRotationResponse(ConfigureRotationResponse configureRotationResponse) {
                SingleFieldBuilderV3<ConfigureRotationResponse, ConfigureRotationResponse.Builder, ConfigureRotationResponseOrBuilder> singleFieldBuilderV3 = this.configRotationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configureRotationResponse.getClass();
                    this.configRotationResponse_ = configureRotationResponse;
                } else {
                    singleFieldBuilderV3.setMessage(configureRotationResponse);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setConfigSettingsNotification(ConfigureSettingsNotification configureSettingsNotification) {
                SingleFieldBuilderV3<ConfigureSettingsNotification, ConfigureSettingsNotification.Builder, ConfigureSettingsNotificationOrBuilder> singleFieldBuilderV3 = this.configSettingsNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configureSettingsNotification.getClass();
                    this.configSettingsNotification_ = configureSettingsNotification;
                } else {
                    singleFieldBuilderV3.setMessage(configureSettingsNotification);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setConfigSettingsRequest(ConfigureSettingsRequest configureSettingsRequest) {
                SingleFieldBuilderV3<ConfigureSettingsRequest, ConfigureSettingsRequest.Builder, ConfigureSettingsRequestOrBuilder> singleFieldBuilderV3 = this.configSettingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configureSettingsRequest.getClass();
                    this.configSettingsRequest_ = configureSettingsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(configureSettingsRequest);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setConfigSettingsResponse(ConfigureSettingsResponse configureSettingsResponse) {
                SingleFieldBuilderV3<ConfigureSettingsResponse, ConfigureSettingsResponse.Builder, ConfigureSettingsResponseOrBuilder> singleFieldBuilderV3 = this.configSettingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configureSettingsResponse.getClass();
                    this.configSettingsResponse_ = configureSettingsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(configureSettingsResponse);
                }
                this.bitField0_ |= 1024;
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
                if (service.hasConfigCustomModeRequest()) {
                    mergeConfigCustomModeRequest(service.getConfigCustomModeRequest());
                }
                if (service.hasConfigCustomModeResponse()) {
                    mergeConfigCustomModeResponse(service.getConfigCustomModeResponse());
                }
                if (service.hasConfigCustomModeNotification()) {
                    mergeConfigCustomModeNotification(service.getConfigCustomModeNotification());
                }
                if (service.hasConfigRotationRequest()) {
                    mergeConfigRotationRequest(service.getConfigRotationRequest());
                }
                if (service.hasConfigRotationResponse()) {
                    mergeConfigRotationResponse(service.getConfigRotationResponse());
                }
                if (service.hasConfigRotationNotification()) {
                    mergeConfigRotationNotification(service.getConfigRotationNotification());
                }
                if (service.hasChangeModeRequest()) {
                    mergeChangeModeRequest(service.getChangeModeRequest());
                }
                if (service.hasChangeModeResponse()) {
                    mergeChangeModeResponse(service.getChangeModeResponse());
                }
                if (service.hasChangeModeNotification()) {
                    mergeChangeModeNotification(service.getChangeModeNotification());
                }
                if (service.hasConfigSettingsRequest()) {
                    mergeConfigSettingsRequest(service.getConfigSettingsRequest());
                }
                if (service.hasConfigSettingsResponse()) {
                    mergeConfigSettingsResponse(service.getConfigSettingsResponse());
                }
                if (service.hasConfigSettingsNotification()) {
                    mergeConfigSettingsNotification(service.getConfigSettingsNotification());
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

    public enum Mode implements ProtocolMessageEnum {
        MODE_UNKNOWN(0),
        MODE_CUSTOM_1(1),
        MODE_CUSTOM_2(2),
        MODE_CUSTOM_3(3),
        MODE_CUSTOM_4(4),
        MODE_CUSTOM_5(5),
        MODE_OVERDRIVE(100),
        MODE_SOLID_HIGH(101),
        MODE_SOLID_MEDIUM(102),
        MODE_SOLID_LOW(103),
        MODE_NIGHT_FLASH(104),
        MODE_DAY_FLASH(105),
        MODE_OFF(106);

        public static final int MODE_CUSTOM_1_VALUE = 1;
        public static final int MODE_CUSTOM_2_VALUE = 2;
        public static final int MODE_CUSTOM_3_VALUE = 3;
        public static final int MODE_CUSTOM_4_VALUE = 4;
        public static final int MODE_CUSTOM_5_VALUE = 5;
        public static final int MODE_DAY_FLASH_VALUE = 105;
        public static final int MODE_NIGHT_FLASH_VALUE = 104;
        public static final int MODE_OFF_VALUE = 106;
        public static final int MODE_OVERDRIVE_VALUE = 100;
        public static final int MODE_SOLID_HIGH_VALUE = 101;
        public static final int MODE_SOLID_LOW_VALUE = 103;
        public static final int MODE_SOLID_MEDIUM_VALUE = 102;
        public static final int MODE_UNKNOWN_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<Mode> internalValueMap = new Internal.EnumLiteMap<Mode>() { // from class: com.garmin.proto.generated.GDIBikeLight.Mode.1
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
                return MODE_UNKNOWN;
            }
            if (i14 == 1) {
                return MODE_CUSTOM_1;
            }
            if (i14 == 2) {
                return MODE_CUSTOM_2;
            }
            if (i14 == 3) {
                return MODE_CUSTOM_3;
            }
            if (i14 == 4) {
                return MODE_CUSTOM_4;
            }
            if (i14 == 5) {
                return MODE_CUSTOM_5;
            }
            switch (i14) {
                case 100:
                    return MODE_OVERDRIVE;
                case 101:
                    return MODE_SOLID_HIGH;
                case 102:
                    return MODE_SOLID_MEDIUM;
                case 103:
                    return MODE_SOLID_LOW;
                case 104:
                    return MODE_NIGHT_FLASH;
                case 105:
                    return MODE_DAY_FLASH;
                case 106:
                    return MODE_OFF;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIBikeLight.getDescriptor().getEnumTypes().get(0);
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

    public enum Status implements ProtocolMessageEnum {
        STATUS_UNKNOWN(0),
        STATUS_REJECTED(1),
        STATUS_ACCEPTED(2),
        STATUS_BUSY(3);

        public static final int STATUS_ACCEPTED_VALUE = 2;
        public static final int STATUS_BUSY_VALUE = 3;
        public static final int STATUS_REJECTED_VALUE = 1;
        public static final int STATUS_UNKNOWN_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIBikeLight.Status.1
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
                return STATUS_REJECTED;
            }
            if (i14 == 2) {
                return STATUS_ACCEPTED;
            }
            if (i14 != 3) {
                return null;
            }
            return STATUS_BUSY;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIBikeLight.getDescriptor().getEnumTypes().get(1);
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
