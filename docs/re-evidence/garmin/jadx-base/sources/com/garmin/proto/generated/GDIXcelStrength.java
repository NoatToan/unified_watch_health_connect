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

/* JADX INFO: loaded from: classes13.dex */
public final class GDIXcelStrength {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0015GDIXcelStrength.proto\u0012\u0016GDI.Proto.XcelStrength\u001a\u0015GDIEventSharing.proto\"ã\u0007\n\u0007Service\u0012H\n\u0014state_change_request\u0018\u0001 \u0001(\u000b2*.GDI.Proto.XcelStrength.StateChangeRequest\u0012J\n\u0015state_change_response\u0018\u0002 \u0001(\u000b2+.GDI.Proto.XcelStrength.StateChangeResponse\u0012O\n\u0018set_state_change_request\u0018\u0003 \u0001(\u000b2-.GDI.Proto.XcelStrength.SetStateChangeRequest\u0012Q\n\u0019set_state_change_response\u0018\u0004 \u0001(\u000b2..GDI.Proto.XcelStrength.SetStateChangeResponse\u0012R\n\u0019set_configuration_request\u0018\u0005 \u0001(\u000b2/.GDI.Proto.XcelStrength.SetConfigurationRequest\u0012T\n\u001aset_configuration_response\u0018\u0006 \u0001(\u000b20.GDI.Proto.XcelStrength.SetConfigurationResponse\u0012N\n\u0017settings_change_request\u0018\u0007 \u0001(\u000b2-.GDI.Proto.XcelStrength.SettingsChangeRequest\u0012P\n\u0018settings_change_response\u0018\b \u0001(\u000b2..GDI.Proto.XcelStrength.SettingsChangeResponse\u0012P\n\u0019set_time_sync_mac_request\u0018\t \u0001(\u000b2-.GDI.Proto.XcelStrength.SetTimeSyncMacRequest\u0012R\n\u001aset_time_sync_mac_response\u0018\n \u0001(\u000b2..GDI.Proto.XcelStrength.SetTimeSyncMacResponse\u0012T\n\u001afavorite_exercises_request\u0018\u000b \u0001(\u000b20.GDI.Proto.XcelStrength.FavoriteExercisesRequest\u0012V\n\u001bfavorite_exercises_response\u0018\f \u0001(\u000b21.GDI.Proto.XcelStrength.FavoriteExercisesResponse\"º\u0001\n\u0012StateChangeRequest\u0012F\n\u0006change\u0018\u0001 \u0001(\u000e26.GDI.Proto.XcelStrength.StateChangeRequest.StateChange\"\\\n\u000bStateChange\u0012\u0018\n\u0014STATE_CHANGE_UNKNOWN\u0010\u0000\u0012\u0011\n\rINITIAL_START\u0010\u0001\u0012\t\n\u0005PAUSE\u0010\u0002\u0012\n\n\u0006RESUME\u0010\u0003\u0012\t\n\u0005RESET\u0010\u0004\"¡\u0001\n\u0013StateChangeResponse\u0012J\n\u0007failure\u0018\u0001 \u0001(\u000e29.GDI.Proto.XcelStrength.StateChangeResponse.FailureReason\">\n\rFailureReason\u0012\u001a\n\u0016FAILURE_REASON_UNKNOWN\u0010\u0000\u0012\u0011\n\rCONTROL_TAKEN\u0010\u0001\"\u008d\u0001\n\u0011StateNotification\u0012>\n\u0005state\u0018\u0001 \u0001(\u000e2/.GDI.Proto.XcelStrength.StateNotification.State\"8\n\u0005State\u0012\u0011\n\rSTATE_UNKNOWN\u0010\u0000\u0012\u0007\n\u0003OFF\u0010\u0001\u0012\u000b\n\u0007STOPPED\u0010\u0002\u0012\u0006\n\u0002ON\u0010\u0003\")\n\u0015SettingsChangeRequest\u0012\u0010\n\bauto_set\u0018\u0001 \u0001(\b\"\u0018\n\u0016SettingsChangeResponse\"F\n\u0015SetStateChangeRequest\u0012-\n\u0004type\u0018\u0001 \u0001(\u000e2\u001f.GDI.Proto.XcelStrength.SetType\"\u0018\n\u0016SetStateChangeResponse\"I\n\u0018AutoSetEventNotification\u0012-\n\u0004type\u0018\u0001 \u0001(\u000e2\u001f.GDI.Proto.XcelStrength.SetType\"\u008c\u0003\n\u0013MetricsNotification\u0012\u0012\n\nrep_number\u0018\u0001 \u0001(\r\u0012\u001d\n\u0015mean_vel_m_per_s_x100\u0018\u0002 \u0001(\r\u0012\u001d\n\u0015peak_vel_m_per_s_x100\u0018\u0003 \u0001(\r\u0012$\n\u001cmean_propul_vel_m_per_s_x100\u0018\u0004 \u0001(\r\u0012\u001c\n\u0014duration_second_x100\u0018\u0005 \u0001(\r\u0012\u0013\n\u000brom_cm_x100\u0018\u0006 \u0001(\r\u0012\u0017\n\u000fpeak_power_watt\u0018\u0007 \u0001(\u0002\u0012\u0017\n\u000fmean_power_watt\u0018\b \u0001(\u0002\u0012\u0017\n\u000fbar_path_points\u0018\t \u0003(\u0005\u0012!\n\u0019ecc_mean_vel_m_per_s_x100\u0018\n \u0001(\r\u0012!\n\u0019ecc_peak_vel_m_per_s_x100\u0018\u000b \u0001(\r\u0012 \n\u0018ecc_duration_second_x100\u0018\f \u0001(\r\u0012\u0017\n\u000fecc_rom_cm_x100\u0018\r \u0001(\r\"«\u0004\n\u001dXcelStrengthEventNotification\u0012O\n\u0015auto_set_notification\u0018\u0001 \u0001(\u000b20.GDI.Proto.XcelStrength.AutoSetEventNotification\u0012E\n\u0012state_notification\u0018\u0002 \u0001(\u000b2).GDI.Proto.XcelStrength.StateNotification\u0012I\n\u0014metrics_notification\u0018\u0003 \u0001(\u000b2+.GDI.Proto.XcelStrength.MetricsNotification\u0012C\n\u0011tone_notification\u0018\u0004 \u0001(\u000b2(.GDI.Proto.XcelStrength.ToneNotification\u0012b\n\u001cref_baro_status_notification\u0018\u0005 \u0001(\u000b2<.GDI.Proto.XcelStrength.ReferenceBarometerStatusNotification2~\n\u0013xcel_strength_event\u0012).GDI.Proto.EventSharing.AlertNotification\u0018ÿ\u0007 \u0001(\u000b25.GDI.Proto.XcelStrength.XcelStrengthEventNotification\"x\n\u0017SetConfigurationRequest\u0012\u0011\n\tset_index\u0018\u0001 \u0001(\r\u0012\u0011\n\tweight_kg\u0018\u0002 \u0001(\u0002\u0012\u0019\n\u0011exercise_category\u0018\u0003 \u0001(\r\u0012\u001c\n\u0014exercise_subcategory\u0018\u0004 \u0001(\r\"\u001a\n\u0018SetConfigurationResponse\"\u008d\u0002\n\u0010ToneNotification\u0012;\n\u0004type\u0018\u0001 \u0001(\u000e2-.GDI.Proto.XcelStrength.ToneNotification.Type\u0012\u0010\n\bpriority\u0018\u0002 \u0001(\r\"©\u0001\n\u0004Type\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0014\n\u0010TIMER_COUNT_DOWN\u0010\u0001\u0012\u000e\n\nTARGET_HIT\u0010\u0002\u0012\u000f\n\u000bTARGET_MISS\u0010\u0003\u0012\u0007\n\u0003LAP\u0010\u0004\u0012\u0018\n\u0014TIMER_COUNT_UP_START\u0010\u0005\u0012\u0015\n\u0011SENSOR_DISCONNECT\u0010\u0006\u0012\u0012\n\u000eSENSOR_CONNECT\u0010\u0007\u0012\u000f\n\u000bLOW_BATTERY\u0010\b\".\n\u0015SetTimeSyncMacRequest\u0012\u0015\n\rtime_sync_mac\u0018\u0001 \u0001(\f\"\u0018\n\u0016SetTimeSyncMacResponse\"<\n$ReferenceBarometerStatusNotification\u0012\u0014\n\fis_available\u0018\u0001 \u0001(\b\"1\n\bExercise\u0012\u0010\n\bcategory\u0018\u0001 \u0001(\r\u0012\u0013\n\u000bsubcategory\u0018\u0002 \u0001(\r\"J\n\u0018FavoriteExercisesRequest\u0012.\n\u0004list\u0018\u0001 \u0003(\u000b2 .GDI.Proto.XcelStrength.Exercise\"\u001b\n\u0019FavoriteExercisesResponse*5\n\u0007SetType\u0012\u0014\n\u0010SET_TYPE_UNKNOWN\u0010\u0000\u0012\b\n\u0004Rest\u0010\u0001\u0012\n\n\u0006Active\u0010\u0002B/\n\u001acom.garmin.proto.generatedB\u000fGDIXcelStrengthH\u0003"}, new Descriptors.FileDescriptor[]{GDIEventSharingProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrength_AutoSetEventNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrength_AutoSetEventNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrength_Exercise_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrength_Exercise_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrength_FavoriteExercisesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrength_FavoriteExercisesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrength_FavoriteExercisesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrength_FavoriteExercisesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrength_MetricsNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrength_MetricsNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrength_ReferenceBarometerStatusNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrength_ReferenceBarometerStatusNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrength_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrength_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrength_SetConfigurationRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrength_SetConfigurationRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrength_SetConfigurationResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrength_SetConfigurationResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrength_SetStateChangeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrength_SetStateChangeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrength_SetStateChangeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrength_SetStateChangeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrength_SetTimeSyncMacRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrength_SetTimeSyncMacRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrength_SetTimeSyncMacResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrength_SetTimeSyncMacResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrength_SettingsChangeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrength_SettingsChangeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrength_SettingsChangeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrength_SettingsChangeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrength_StateChangeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrength_StateChangeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrength_StateChangeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrength_StateChangeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrength_StateNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrength_StateNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrength_ToneNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrength_ToneNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrength_XcelStrengthEventNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrength_XcelStrengthEventNotification_fieldAccessorTable;

    public interface AutoSetEventNotificationOrBuilder extends MessageOrBuilder {
        SetType getType();

        boolean hasType();
    }

    public interface ExerciseOrBuilder extends MessageOrBuilder {
        int getCategory();

        int getSubcategory();

        boolean hasCategory();

        boolean hasSubcategory();
    }

    public interface FavoriteExercisesRequestOrBuilder extends MessageOrBuilder {
        Exercise getList(int i14);

        int getListCount();

        List<Exercise> getListList();

        ExerciseOrBuilder getListOrBuilder(int i14);

        List<? extends ExerciseOrBuilder> getListOrBuilderList();
    }

    public interface FavoriteExercisesResponseOrBuilder extends MessageOrBuilder {
    }

    public interface MetricsNotificationOrBuilder extends MessageOrBuilder {
        int getBarPathPoints(int i14);

        int getBarPathPointsCount();

        List<Integer> getBarPathPointsList();

        int getDurationSecondX100();

        int getEccDurationSecondX100();

        int getEccMeanVelMPerSX100();

        int getEccPeakVelMPerSX100();

        int getEccRomCmX100();

        float getMeanPowerWatt();

        int getMeanPropulVelMPerSX100();

        int getMeanVelMPerSX100();

        float getPeakPowerWatt();

        int getPeakVelMPerSX100();

        int getRepNumber();

        int getRomCmX100();

        boolean hasDurationSecondX100();

        boolean hasEccDurationSecondX100();

        boolean hasEccMeanVelMPerSX100();

        boolean hasEccPeakVelMPerSX100();

        boolean hasEccRomCmX100();

        boolean hasMeanPowerWatt();

        boolean hasMeanPropulVelMPerSX100();

        boolean hasMeanVelMPerSX100();

        boolean hasPeakPowerWatt();

        boolean hasPeakVelMPerSX100();

        boolean hasRepNumber();

        boolean hasRomCmX100();
    }

    public interface ReferenceBarometerStatusNotificationOrBuilder extends MessageOrBuilder {
        boolean getIsAvailable();

        boolean hasIsAvailable();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        FavoriteExercisesRequest getFavoriteExercisesRequest();

        FavoriteExercisesRequestOrBuilder getFavoriteExercisesRequestOrBuilder();

        FavoriteExercisesResponse getFavoriteExercisesResponse();

        FavoriteExercisesResponseOrBuilder getFavoriteExercisesResponseOrBuilder();

        SetConfigurationRequest getSetConfigurationRequest();

        SetConfigurationRequestOrBuilder getSetConfigurationRequestOrBuilder();

        SetConfigurationResponse getSetConfigurationResponse();

        SetConfigurationResponseOrBuilder getSetConfigurationResponseOrBuilder();

        SetStateChangeRequest getSetStateChangeRequest();

        SetStateChangeRequestOrBuilder getSetStateChangeRequestOrBuilder();

        SetStateChangeResponse getSetStateChangeResponse();

        SetStateChangeResponseOrBuilder getSetStateChangeResponseOrBuilder();

        SetTimeSyncMacRequest getSetTimeSyncMacRequest();

        SetTimeSyncMacRequestOrBuilder getSetTimeSyncMacRequestOrBuilder();

        SetTimeSyncMacResponse getSetTimeSyncMacResponse();

        SetTimeSyncMacResponseOrBuilder getSetTimeSyncMacResponseOrBuilder();

        SettingsChangeRequest getSettingsChangeRequest();

        SettingsChangeRequestOrBuilder getSettingsChangeRequestOrBuilder();

        SettingsChangeResponse getSettingsChangeResponse();

        SettingsChangeResponseOrBuilder getSettingsChangeResponseOrBuilder();

        StateChangeRequest getStateChangeRequest();

        StateChangeRequestOrBuilder getStateChangeRequestOrBuilder();

        StateChangeResponse getStateChangeResponse();

        StateChangeResponseOrBuilder getStateChangeResponseOrBuilder();

        boolean hasFavoriteExercisesRequest();

        boolean hasFavoriteExercisesResponse();

        boolean hasSetConfigurationRequest();

        boolean hasSetConfigurationResponse();

        boolean hasSetStateChangeRequest();

        boolean hasSetStateChangeResponse();

        boolean hasSetTimeSyncMacRequest();

        boolean hasSetTimeSyncMacResponse();

        boolean hasSettingsChangeRequest();

        boolean hasSettingsChangeResponse();

        boolean hasStateChangeRequest();

        boolean hasStateChangeResponse();
    }

    public interface SetConfigurationRequestOrBuilder extends MessageOrBuilder {
        int getExerciseCategory();

        int getExerciseSubcategory();

        int getSetIndex();

        float getWeightKg();

        boolean hasExerciseCategory();

        boolean hasExerciseSubcategory();

        boolean hasSetIndex();

        boolean hasWeightKg();
    }

    public interface SetConfigurationResponseOrBuilder extends MessageOrBuilder {
    }

    public interface SetStateChangeRequestOrBuilder extends MessageOrBuilder {
        SetType getType();

        boolean hasType();
    }

    public interface SetStateChangeResponseOrBuilder extends MessageOrBuilder {
    }

    public interface SetTimeSyncMacRequestOrBuilder extends MessageOrBuilder {
        ByteString getTimeSyncMac();

        boolean hasTimeSyncMac();
    }

    public interface SetTimeSyncMacResponseOrBuilder extends MessageOrBuilder {
    }

    public interface SettingsChangeRequestOrBuilder extends MessageOrBuilder {
        boolean getAutoSet();

        boolean hasAutoSet();
    }

    public interface SettingsChangeResponseOrBuilder extends MessageOrBuilder {
    }

    public interface StateChangeRequestOrBuilder extends MessageOrBuilder {
        StateChangeRequest.StateChange getChange();

        boolean hasChange();
    }

    public interface StateChangeResponseOrBuilder extends MessageOrBuilder {
        StateChangeResponse.FailureReason getFailure();

        boolean hasFailure();
    }

    public interface StateNotificationOrBuilder extends MessageOrBuilder {
        StateNotification.State getState();

        boolean hasState();
    }

    public interface ToneNotificationOrBuilder extends MessageOrBuilder {
        int getPriority();

        ToneNotification.Type getType();

        boolean hasPriority();

        boolean hasType();
    }

    public interface XcelStrengthEventNotificationOrBuilder extends MessageOrBuilder {
        AutoSetEventNotification getAutoSetNotification();

        AutoSetEventNotificationOrBuilder getAutoSetNotificationOrBuilder();

        MetricsNotification getMetricsNotification();

        MetricsNotificationOrBuilder getMetricsNotificationOrBuilder();

        ReferenceBarometerStatusNotification getRefBaroStatusNotification();

        ReferenceBarometerStatusNotificationOrBuilder getRefBaroStatusNotificationOrBuilder();

        StateNotification getStateNotification();

        StateNotificationOrBuilder getStateNotificationOrBuilder();

        ToneNotification getToneNotification();

        ToneNotificationOrBuilder getToneNotificationOrBuilder();

        boolean hasAutoSetNotification();

        boolean hasMetricsNotification();

        boolean hasRefBaroStatusNotification();

        boolean hasStateNotification();

        boolean hasToneNotification();
    }

    static {
        Descriptors.Descriptor descriptor2 = (Descriptors.Descriptor) a.j(0);
        internal_static_GDI_Proto_XcelStrength_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_XcelStrength_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"StateChangeRequest", "StateChangeResponse", "SetStateChangeRequest", "SetStateChangeResponse", "SetConfigurationRequest", "SetConfigurationResponse", "SettingsChangeRequest", "SettingsChangeResponse", "SetTimeSyncMacRequest", "SetTimeSyncMacResponse", "FavoriteExercisesRequest", "FavoriteExercisesResponse"});
        Descriptors.Descriptor descriptor3 = (Descriptors.Descriptor) a.j(1);
        internal_static_GDI_Proto_XcelStrength_StateChangeRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_XcelStrength_StateChangeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Change"});
        Descriptors.Descriptor descriptor4 = (Descriptors.Descriptor) a.j(2);
        internal_static_GDI_Proto_XcelStrength_StateChangeResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_XcelStrength_StateChangeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Failure"});
        Descriptors.Descriptor descriptor5 = (Descriptors.Descriptor) a.j(3);
        internal_static_GDI_Proto_XcelStrength_StateNotification_descriptor = descriptor5;
        internal_static_GDI_Proto_XcelStrength_StateNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"State"});
        Descriptors.Descriptor descriptor6 = (Descriptors.Descriptor) a.j(4);
        internal_static_GDI_Proto_XcelStrength_SettingsChangeRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_XcelStrength_SettingsChangeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"AutoSet"});
        Descriptors.Descriptor descriptor7 = (Descriptors.Descriptor) a.j(5);
        internal_static_GDI_Proto_XcelStrength_SettingsChangeResponse_descriptor = descriptor7;
        internal_static_GDI_Proto_XcelStrength_SettingsChangeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[0]);
        Descriptors.Descriptor descriptor8 = (Descriptors.Descriptor) a.j(6);
        internal_static_GDI_Proto_XcelStrength_SetStateChangeRequest_descriptor = descriptor8;
        internal_static_GDI_Proto_XcelStrength_SetStateChangeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Type"});
        Descriptors.Descriptor descriptor9 = (Descriptors.Descriptor) a.j(7);
        internal_static_GDI_Proto_XcelStrength_SetStateChangeResponse_descriptor = descriptor9;
        internal_static_GDI_Proto_XcelStrength_SetStateChangeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[0]);
        Descriptors.Descriptor descriptor10 = (Descriptors.Descriptor) a.j(8);
        internal_static_GDI_Proto_XcelStrength_AutoSetEventNotification_descriptor = descriptor10;
        internal_static_GDI_Proto_XcelStrength_AutoSetEventNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Type"});
        Descriptors.Descriptor descriptor11 = (Descriptors.Descriptor) a.j(9);
        internal_static_GDI_Proto_XcelStrength_MetricsNotification_descriptor = descriptor11;
        internal_static_GDI_Proto_XcelStrength_MetricsNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"RepNumber", "MeanVelMPerSX100", "PeakVelMPerSX100", "MeanPropulVelMPerSX100", "DurationSecondX100", "RomCmX100", "PeakPowerWatt", "MeanPowerWatt", "BarPathPoints", "EccMeanVelMPerSX100", "EccPeakVelMPerSX100", "EccDurationSecondX100", "EccRomCmX100"});
        Descriptors.Descriptor descriptor12 = (Descriptors.Descriptor) a.j(10);
        internal_static_GDI_Proto_XcelStrength_XcelStrengthEventNotification_descriptor = descriptor12;
        internal_static_GDI_Proto_XcelStrength_XcelStrengthEventNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"AutoSetNotification", "StateNotification", "MetricsNotification", "ToneNotification", "RefBaroStatusNotification"});
        Descriptors.Descriptor descriptor13 = (Descriptors.Descriptor) a.j(11);
        internal_static_GDI_Proto_XcelStrength_SetConfigurationRequest_descriptor = descriptor13;
        internal_static_GDI_Proto_XcelStrength_SetConfigurationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"SetIndex", "WeightKg", "ExerciseCategory", "ExerciseSubcategory"});
        Descriptors.Descriptor descriptor14 = (Descriptors.Descriptor) a.j(12);
        internal_static_GDI_Proto_XcelStrength_SetConfigurationResponse_descriptor = descriptor14;
        internal_static_GDI_Proto_XcelStrength_SetConfigurationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[0]);
        Descriptors.Descriptor descriptor15 = (Descriptors.Descriptor) a.j(13);
        internal_static_GDI_Proto_XcelStrength_ToneNotification_descriptor = descriptor15;
        internal_static_GDI_Proto_XcelStrength_ToneNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Type", "Priority"});
        Descriptors.Descriptor descriptor16 = (Descriptors.Descriptor) a.j(14);
        internal_static_GDI_Proto_XcelStrength_SetTimeSyncMacRequest_descriptor = descriptor16;
        internal_static_GDI_Proto_XcelStrength_SetTimeSyncMacRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"TimeSyncMac"});
        Descriptors.Descriptor descriptor17 = (Descriptors.Descriptor) a.j(15);
        internal_static_GDI_Proto_XcelStrength_SetTimeSyncMacResponse_descriptor = descriptor17;
        internal_static_GDI_Proto_XcelStrength_SetTimeSyncMacResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[0]);
        Descriptors.Descriptor descriptor18 = (Descriptors.Descriptor) a.j(16);
        internal_static_GDI_Proto_XcelStrength_ReferenceBarometerStatusNotification_descriptor = descriptor18;
        internal_static_GDI_Proto_XcelStrength_ReferenceBarometerStatusNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"IsAvailable"});
        Descriptors.Descriptor descriptor19 = (Descriptors.Descriptor) a.j(17);
        internal_static_GDI_Proto_XcelStrength_Exercise_descriptor = descriptor19;
        internal_static_GDI_Proto_XcelStrength_Exercise_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"Category", "Subcategory"});
        Descriptors.Descriptor descriptor20 = (Descriptors.Descriptor) a.j(18);
        internal_static_GDI_Proto_XcelStrength_FavoriteExercisesRequest_descriptor = descriptor20;
        internal_static_GDI_Proto_XcelStrength_FavoriteExercisesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"List"});
        Descriptors.Descriptor descriptor21 = (Descriptors.Descriptor) a.j(19);
        internal_static_GDI_Proto_XcelStrength_FavoriteExercisesResponse_descriptor = descriptor21;
        internal_static_GDI_Proto_XcelStrength_FavoriteExercisesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor21, new String[0]);
        GDIEventSharingProto.getDescriptor();
    }

    private GDIXcelStrength() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(XcelStrengthEventNotification.xcelStrengthEvent);
    }

    public static final class Exercise extends GeneratedMessageV3 implements ExerciseOrBuilder {
        public static final int CATEGORY_FIELD_NUMBER = 1;
        private static final Exercise DEFAULT_INSTANCE = new Exercise();

        @Deprecated
        public static final Parser<Exercise> PARSER = new AbstractParser<Exercise>() { // from class: com.garmin.proto.generated.GDIXcelStrength.Exercise.1
            @Override // com.google.protobuf.Parser
            public Exercise parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Exercise.newBuilder();
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
        public static final int SUBCATEGORY_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int category_;
        private byte memoizedIsInitialized;
        private int subcategory_;

        private Exercise(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.category_ = 0;
            this.subcategory_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Exercise getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_Exercise_descriptor;
        }

        public static Builder newBuilder(Exercise exercise) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(exercise);
        }

        public static Exercise parseDelimitedFrom(InputStream inputStream) {
            return (Exercise) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Exercise parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Exercise> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Exercise)) {
                return super.equals(obj);
            }
            Exercise exercise = (Exercise) obj;
            if (hasCategory() != exercise.hasCategory()) {
                return false;
            }
            if ((!hasCategory() || getCategory() == exercise.getCategory()) && hasSubcategory() == exercise.hasSubcategory()) {
                return (!hasSubcategory() || getSubcategory() == exercise.getSubcategory()) && getUnknownFields().equals(exercise.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ExerciseOrBuilder
        public int getCategory() {
            return this.category_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Exercise> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.category_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.subcategory_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ExerciseOrBuilder
        public int getSubcategory() {
            return this.subcategory_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ExerciseOrBuilder
        public boolean hasCategory() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ExerciseOrBuilder
        public boolean hasSubcategory() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCategory()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCategory();
            }
            if (hasSubcategory()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSubcategory();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_Exercise_fieldAccessorTable.ensureFieldAccessorsInitialized(Exercise.class, Builder.class);
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
            return new Exercise();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.category_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.subcategory_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ExerciseOrBuilder {
            private int bitField0_;
            private int category_;
            private int subcategory_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(Exercise exercise) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    exercise.category_ = this.category_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    exercise.subcategory_ = this.subcategory_;
                    i14 |= 2;
                }
                exercise.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_Exercise_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Exercise build() {
                Exercise exerciseBuildPartial = buildPartial();
                if (exerciseBuildPartial.isInitialized()) {
                    return exerciseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) exerciseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Exercise buildPartial() {
                Exercise exercise = new Exercise(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(exercise);
                }
                onBuilt();
                return exercise;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.category_ = 0;
                this.subcategory_ = 0;
                return this;
            }

            public Builder clearCategory() {
                this.bitField0_ &= -2;
                this.category_ = 0;
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

            public Builder clearSubcategory() {
                this.bitField0_ &= -3;
                this.subcategory_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ExerciseOrBuilder
            public int getCategory() {
                return this.category_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_Exercise_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ExerciseOrBuilder
            public int getSubcategory() {
                return this.subcategory_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ExerciseOrBuilder
            public boolean hasCategory() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ExerciseOrBuilder
            public boolean hasSubcategory() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_Exercise_fieldAccessorTable.ensureFieldAccessorsInitialized(Exercise.class, Builder.class);
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
                                    this.category_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.subcategory_ = codedInputStream.readUInt32();
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

            public Builder setCategory(int i14) {
                this.category_ = i14;
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

            public Builder setSubcategory(int i14) {
                this.subcategory_ = i14;
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
            public Exercise getDefaultInstanceForType() {
                return Exercise.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Exercise) {
                    return mergeFrom((Exercise) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Exercise exercise) {
                if (exercise == Exercise.getDefaultInstance()) {
                    return this;
                }
                if (exercise.hasCategory()) {
                    setCategory(exercise.getCategory());
                }
                if (exercise.hasSubcategory()) {
                    setSubcategory(exercise.getSubcategory());
                }
                mergeUnknownFields(exercise.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Exercise getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Exercise parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Exercise) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Exercise parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Exercise parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Exercise parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ Exercise(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Exercise parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private Exercise() {
            this.category_ = 0;
            this.subcategory_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Exercise parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Exercise parseFrom(InputStream inputStream) {
            return (Exercise) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Exercise parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Exercise) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Exercise parseFrom(CodedInputStream codedInputStream) {
            return (Exercise) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Exercise parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Exercise) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class FavoriteExercisesResponse extends GeneratedMessageV3 implements FavoriteExercisesResponseOrBuilder {
        private static final FavoriteExercisesResponse DEFAULT_INSTANCE = new FavoriteExercisesResponse();

        @Deprecated
        public static final Parser<FavoriteExercisesResponse> PARSER = new AbstractParser<FavoriteExercisesResponse>() { // from class: com.garmin.proto.generated.GDIXcelStrength.FavoriteExercisesResponse.1
            @Override // com.google.protobuf.Parser
            public FavoriteExercisesResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FavoriteExercisesResponse.newBuilder();
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

        private FavoriteExercisesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FavoriteExercisesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_FavoriteExercisesResponse_descriptor;
        }

        public static Builder newBuilder(FavoriteExercisesResponse favoriteExercisesResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(favoriteExercisesResponse);
        }

        public static FavoriteExercisesResponse parseDelimitedFrom(InputStream inputStream) {
            return (FavoriteExercisesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FavoriteExercisesResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FavoriteExercisesResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof FavoriteExercisesResponse) {
                return getUnknownFields().equals(((FavoriteExercisesResponse) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FavoriteExercisesResponse> getParserForType() {
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
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_FavoriteExercisesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(FavoriteExercisesResponse.class, Builder.class);
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
            return new FavoriteExercisesResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FavoriteExercisesResponseOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_FavoriteExercisesResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FavoriteExercisesResponse build() {
                FavoriteExercisesResponse favoriteExercisesResponseBuildPartial = buildPartial();
                if (favoriteExercisesResponseBuildPartial.isInitialized()) {
                    return favoriteExercisesResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) favoriteExercisesResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FavoriteExercisesResponse buildPartial() {
                FavoriteExercisesResponse favoriteExercisesResponse = new FavoriteExercisesResponse(this);
                onBuilt();
                return favoriteExercisesResponse;
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
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_FavoriteExercisesResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_FavoriteExercisesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(FavoriteExercisesResponse.class, Builder.class);
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
            public FavoriteExercisesResponse getDefaultInstanceForType() {
                return FavoriteExercisesResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FavoriteExercisesResponse) {
                    return mergeFrom((FavoriteExercisesResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FavoriteExercisesResponse favoriteExercisesResponse) {
                if (favoriteExercisesResponse == FavoriteExercisesResponse.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(favoriteExercisesResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FavoriteExercisesResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ FavoriteExercisesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private FavoriteExercisesResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FavoriteExercisesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoriteExercisesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FavoriteExercisesResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FavoriteExercisesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FavoriteExercisesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FavoriteExercisesResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static FavoriteExercisesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FavoriteExercisesResponse parseFrom(InputStream inputStream) {
            return (FavoriteExercisesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FavoriteExercisesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoriteExercisesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FavoriteExercisesResponse parseFrom(CodedInputStream codedInputStream) {
            return (FavoriteExercisesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FavoriteExercisesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoriteExercisesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ReferenceBarometerStatusNotification extends GeneratedMessageV3 implements ReferenceBarometerStatusNotificationOrBuilder {
        public static final int IS_AVAILABLE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean isAvailable_;
        private byte memoizedIsInitialized;
        private static final ReferenceBarometerStatusNotification DEFAULT_INSTANCE = new ReferenceBarometerStatusNotification();

        @Deprecated
        public static final Parser<ReferenceBarometerStatusNotification> PARSER = new AbstractParser<ReferenceBarometerStatusNotification>() { // from class: com.garmin.proto.generated.GDIXcelStrength.ReferenceBarometerStatusNotification.1
            @Override // com.google.protobuf.Parser
            public ReferenceBarometerStatusNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ReferenceBarometerStatusNotification.newBuilder();
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

        private ReferenceBarometerStatusNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.isAvailable_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ReferenceBarometerStatusNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_ReferenceBarometerStatusNotification_descriptor;
        }

        public static Builder newBuilder(ReferenceBarometerStatusNotification referenceBarometerStatusNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(referenceBarometerStatusNotification);
        }

        public static ReferenceBarometerStatusNotification parseDelimitedFrom(InputStream inputStream) {
            return (ReferenceBarometerStatusNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ReferenceBarometerStatusNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ReferenceBarometerStatusNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ReferenceBarometerStatusNotification)) {
                return super.equals(obj);
            }
            ReferenceBarometerStatusNotification referenceBarometerStatusNotification = (ReferenceBarometerStatusNotification) obj;
            if (hasIsAvailable() != referenceBarometerStatusNotification.hasIsAvailable()) {
                return false;
            }
            return (!hasIsAvailable() || getIsAvailable() == referenceBarometerStatusNotification.getIsAvailable()) && getUnknownFields().equals(referenceBarometerStatusNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ReferenceBarometerStatusNotificationOrBuilder
        public boolean getIsAvailable() {
            return this.isAvailable_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ReferenceBarometerStatusNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.isAvailable_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ReferenceBarometerStatusNotificationOrBuilder
        public boolean hasIsAvailable() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasIsAvailable()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getIsAvailable());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_ReferenceBarometerStatusNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ReferenceBarometerStatusNotification.class, Builder.class);
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
            return new ReferenceBarometerStatusNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.isAvailable_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ReferenceBarometerStatusNotificationOrBuilder {
            private int bitField0_;
            private boolean isAvailable_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(ReferenceBarometerStatusNotification referenceBarometerStatusNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    referenceBarometerStatusNotification.isAvailable_ = this.isAvailable_;
                } else {
                    i14 = 0;
                }
                referenceBarometerStatusNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_ReferenceBarometerStatusNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ReferenceBarometerStatusNotification build() {
                ReferenceBarometerStatusNotification referenceBarometerStatusNotificationBuildPartial = buildPartial();
                if (referenceBarometerStatusNotificationBuildPartial.isInitialized()) {
                    return referenceBarometerStatusNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) referenceBarometerStatusNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ReferenceBarometerStatusNotification buildPartial() {
                ReferenceBarometerStatusNotification referenceBarometerStatusNotification = new ReferenceBarometerStatusNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(referenceBarometerStatusNotification);
                }
                onBuilt();
                return referenceBarometerStatusNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.isAvailable_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIsAvailable() {
                this.bitField0_ &= -2;
                this.isAvailable_ = false;
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
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_ReferenceBarometerStatusNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ReferenceBarometerStatusNotificationOrBuilder
            public boolean getIsAvailable() {
                return this.isAvailable_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ReferenceBarometerStatusNotificationOrBuilder
            public boolean hasIsAvailable() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_ReferenceBarometerStatusNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ReferenceBarometerStatusNotification.class, Builder.class);
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
                                    this.isAvailable_ = codedInputStream.readBool();
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

            public Builder setIsAvailable(boolean z14) {
                this.isAvailable_ = z14;
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
            public ReferenceBarometerStatusNotification getDefaultInstanceForType() {
                return ReferenceBarometerStatusNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ReferenceBarometerStatusNotification) {
                    return mergeFrom((ReferenceBarometerStatusNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ReferenceBarometerStatusNotification referenceBarometerStatusNotification) {
                if (referenceBarometerStatusNotification == ReferenceBarometerStatusNotification.getDefaultInstance()) {
                    return this;
                }
                if (referenceBarometerStatusNotification.hasIsAvailable()) {
                    setIsAvailable(referenceBarometerStatusNotification.getIsAvailable());
                }
                mergeUnknownFields(referenceBarometerStatusNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ReferenceBarometerStatusNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ReferenceBarometerStatusNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ReferenceBarometerStatusNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ReferenceBarometerStatusNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ReferenceBarometerStatusNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ReferenceBarometerStatusNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ReferenceBarometerStatusNotification() {
            this.isAvailable_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ReferenceBarometerStatusNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ReferenceBarometerStatusNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ReferenceBarometerStatusNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ReferenceBarometerStatusNotification parseFrom(InputStream inputStream) {
            return (ReferenceBarometerStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ReferenceBarometerStatusNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ReferenceBarometerStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ReferenceBarometerStatusNotification parseFrom(CodedInputStream codedInputStream) {
            return (ReferenceBarometerStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ReferenceBarometerStatusNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ReferenceBarometerStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SetConfigurationRequest extends GeneratedMessageV3 implements SetConfigurationRequestOrBuilder {
        public static final int EXERCISE_CATEGORY_FIELD_NUMBER = 3;
        public static final int EXERCISE_SUBCATEGORY_FIELD_NUMBER = 4;
        public static final int SET_INDEX_FIELD_NUMBER = 1;
        public static final int WEIGHT_KG_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int exerciseCategory_;
        private int exerciseSubcategory_;
        private byte memoizedIsInitialized;
        private int setIndex_;
        private float weightKg_;
        private static final SetConfigurationRequest DEFAULT_INSTANCE = new SetConfigurationRequest();

        @Deprecated
        public static final Parser<SetConfigurationRequest> PARSER = new AbstractParser<SetConfigurationRequest>() { // from class: com.garmin.proto.generated.GDIXcelStrength.SetConfigurationRequest.1
            @Override // com.google.protobuf.Parser
            public SetConfigurationRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SetConfigurationRequest.newBuilder();
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

        private SetConfigurationRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.setIndex_ = 0;
            this.weightKg_ = 0.0f;
            this.exerciseCategory_ = 0;
            this.exerciseSubcategory_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetConfigurationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetConfigurationRequest_descriptor;
        }

        public static Builder newBuilder(SetConfigurationRequest setConfigurationRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(setConfigurationRequest);
        }

        public static SetConfigurationRequest parseDelimitedFrom(InputStream inputStream) {
            return (SetConfigurationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SetConfigurationRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SetConfigurationRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetConfigurationRequest)) {
                return super.equals(obj);
            }
            SetConfigurationRequest setConfigurationRequest = (SetConfigurationRequest) obj;
            if (hasSetIndex() != setConfigurationRequest.hasSetIndex()) {
                return false;
            }
            if ((hasSetIndex() && getSetIndex() != setConfigurationRequest.getSetIndex()) || hasWeightKg() != setConfigurationRequest.hasWeightKg()) {
                return false;
            }
            if ((hasWeightKg() && Float.floatToIntBits(getWeightKg()) != Float.floatToIntBits(setConfigurationRequest.getWeightKg())) || hasExerciseCategory() != setConfigurationRequest.hasExerciseCategory()) {
                return false;
            }
            if ((!hasExerciseCategory() || getExerciseCategory() == setConfigurationRequest.getExerciseCategory()) && hasExerciseSubcategory() == setConfigurationRequest.hasExerciseSubcategory()) {
                return (!hasExerciseSubcategory() || getExerciseSubcategory() == setConfigurationRequest.getExerciseSubcategory()) && getUnknownFields().equals(setConfigurationRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.SetConfigurationRequestOrBuilder
        public int getExerciseCategory() {
            return this.exerciseCategory_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.SetConfigurationRequestOrBuilder
        public int getExerciseSubcategory() {
            return this.exerciseSubcategory_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SetConfigurationRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.setIndex_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeFloatSize(2, this.weightKg_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.exerciseCategory_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.exerciseSubcategory_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.SetConfigurationRequestOrBuilder
        public int getSetIndex() {
            return this.setIndex_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.SetConfigurationRequestOrBuilder
        public float getWeightKg() {
            return this.weightKg_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.SetConfigurationRequestOrBuilder
        public boolean hasExerciseCategory() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.SetConfigurationRequestOrBuilder
        public boolean hasExerciseSubcategory() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.SetConfigurationRequestOrBuilder
        public boolean hasSetIndex() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.SetConfigurationRequestOrBuilder
        public boolean hasWeightKg() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSetIndex()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSetIndex();
            }
            if (hasWeightKg()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getWeightKg());
            }
            if (hasExerciseCategory()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getExerciseCategory();
            }
            if (hasExerciseSubcategory()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getExerciseSubcategory();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetConfigurationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SetConfigurationRequest.class, Builder.class);
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
            return new SetConfigurationRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.setIndex_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.weightKg_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.exerciseCategory_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.exerciseSubcategory_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetConfigurationRequestOrBuilder {
            private int bitField0_;
            private int exerciseCategory_;
            private int exerciseSubcategory_;
            private int setIndex_;
            private float weightKg_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(SetConfigurationRequest setConfigurationRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    setConfigurationRequest.setIndex_ = this.setIndex_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    setConfigurationRequest.weightKg_ = this.weightKg_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    setConfigurationRequest.exerciseCategory_ = this.exerciseCategory_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    setConfigurationRequest.exerciseSubcategory_ = this.exerciseSubcategory_;
                    i14 |= 8;
                }
                setConfigurationRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetConfigurationRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetConfigurationRequest build() {
                SetConfigurationRequest setConfigurationRequestBuildPartial = buildPartial();
                if (setConfigurationRequestBuildPartial.isInitialized()) {
                    return setConfigurationRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) setConfigurationRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetConfigurationRequest buildPartial() {
                SetConfigurationRequest setConfigurationRequest = new SetConfigurationRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(setConfigurationRequest);
                }
                onBuilt();
                return setConfigurationRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.setIndex_ = 0;
                this.weightKg_ = 0.0f;
                this.exerciseCategory_ = 0;
                this.exerciseSubcategory_ = 0;
                return this;
            }

            public Builder clearExerciseCategory() {
                this.bitField0_ &= -5;
                this.exerciseCategory_ = 0;
                onChanged();
                return this;
            }

            public Builder clearExerciseSubcategory() {
                this.bitField0_ &= -9;
                this.exerciseSubcategory_ = 0;
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

            public Builder clearSetIndex() {
                this.bitField0_ &= -2;
                this.setIndex_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWeightKg() {
                this.bitField0_ &= -3;
                this.weightKg_ = 0.0f;
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
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetConfigurationRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.SetConfigurationRequestOrBuilder
            public int getExerciseCategory() {
                return this.exerciseCategory_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.SetConfigurationRequestOrBuilder
            public int getExerciseSubcategory() {
                return this.exerciseSubcategory_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.SetConfigurationRequestOrBuilder
            public int getSetIndex() {
                return this.setIndex_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.SetConfigurationRequestOrBuilder
            public float getWeightKg() {
                return this.weightKg_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.SetConfigurationRequestOrBuilder
            public boolean hasExerciseCategory() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.SetConfigurationRequestOrBuilder
            public boolean hasExerciseSubcategory() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.SetConfigurationRequestOrBuilder
            public boolean hasSetIndex() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.SetConfigurationRequestOrBuilder
            public boolean hasWeightKg() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetConfigurationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SetConfigurationRequest.class, Builder.class);
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
                                    this.setIndex_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.weightKg_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.exerciseCategory_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.exerciseSubcategory_ = codedInputStream.readUInt32();
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

            public Builder setExerciseCategory(int i14) {
                this.exerciseCategory_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setExerciseSubcategory(int i14) {
                this.exerciseSubcategory_ = i14;
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

            public Builder setSetIndex(int i14) {
                this.setIndex_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setWeightKg(float f14) {
                this.weightKg_ = f14;
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
            public SetConfigurationRequest getDefaultInstanceForType() {
                return SetConfigurationRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SetConfigurationRequest) {
                    return mergeFrom((SetConfigurationRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SetConfigurationRequest setConfigurationRequest) {
                if (setConfigurationRequest == SetConfigurationRequest.getDefaultInstance()) {
                    return this;
                }
                if (setConfigurationRequest.hasSetIndex()) {
                    setSetIndex(setConfigurationRequest.getSetIndex());
                }
                if (setConfigurationRequest.hasWeightKg()) {
                    setWeightKg(setConfigurationRequest.getWeightKg());
                }
                if (setConfigurationRequest.hasExerciseCategory()) {
                    setExerciseCategory(setConfigurationRequest.getExerciseCategory());
                }
                if (setConfigurationRequest.hasExerciseSubcategory()) {
                    setExerciseSubcategory(setConfigurationRequest.getExerciseSubcategory());
                }
                mergeUnknownFields(setConfigurationRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SetConfigurationRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SetConfigurationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetConfigurationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetConfigurationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SetConfigurationRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SetConfigurationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SetConfigurationRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SetConfigurationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SetConfigurationRequest parseFrom(InputStream inputStream) {
            return (SetConfigurationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SetConfigurationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetConfigurationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ SetConfigurationRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SetConfigurationRequest() {
            this.setIndex_ = 0;
            this.weightKg_ = 0.0f;
            this.exerciseCategory_ = 0;
            this.exerciseSubcategory_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetConfigurationRequest parseFrom(CodedInputStream codedInputStream) {
            return (SetConfigurationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SetConfigurationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetConfigurationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SetConfigurationResponse extends GeneratedMessageV3 implements SetConfigurationResponseOrBuilder {
        private static final SetConfigurationResponse DEFAULT_INSTANCE = new SetConfigurationResponse();

        @Deprecated
        public static final Parser<SetConfigurationResponse> PARSER = new AbstractParser<SetConfigurationResponse>() { // from class: com.garmin.proto.generated.GDIXcelStrength.SetConfigurationResponse.1
            @Override // com.google.protobuf.Parser
            public SetConfigurationResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SetConfigurationResponse.newBuilder();
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

        private SetConfigurationResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetConfigurationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetConfigurationResponse_descriptor;
        }

        public static Builder newBuilder(SetConfigurationResponse setConfigurationResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(setConfigurationResponse);
        }

        public static SetConfigurationResponse parseDelimitedFrom(InputStream inputStream) {
            return (SetConfigurationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SetConfigurationResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SetConfigurationResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof SetConfigurationResponse) {
                return getUnknownFields().equals(((SetConfigurationResponse) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SetConfigurationResponse> getParserForType() {
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
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetConfigurationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SetConfigurationResponse.class, Builder.class);
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
            return new SetConfigurationResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetConfigurationResponseOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetConfigurationResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetConfigurationResponse build() {
                SetConfigurationResponse setConfigurationResponseBuildPartial = buildPartial();
                if (setConfigurationResponseBuildPartial.isInitialized()) {
                    return setConfigurationResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) setConfigurationResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetConfigurationResponse buildPartial() {
                SetConfigurationResponse setConfigurationResponse = new SetConfigurationResponse(this);
                onBuilt();
                return setConfigurationResponse;
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
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetConfigurationResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetConfigurationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SetConfigurationResponse.class, Builder.class);
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
            public SetConfigurationResponse getDefaultInstanceForType() {
                return SetConfigurationResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SetConfigurationResponse) {
                    return mergeFrom((SetConfigurationResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SetConfigurationResponse setConfigurationResponse) {
                if (setConfigurationResponse == SetConfigurationResponse.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(setConfigurationResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SetConfigurationResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SetConfigurationResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SetConfigurationResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetConfigurationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetConfigurationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetConfigurationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SetConfigurationResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SetConfigurationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SetConfigurationResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SetConfigurationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SetConfigurationResponse parseFrom(InputStream inputStream) {
            return (SetConfigurationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SetConfigurationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetConfigurationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetConfigurationResponse parseFrom(CodedInputStream codedInputStream) {
            return (SetConfigurationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SetConfigurationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetConfigurationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SetStateChangeResponse extends GeneratedMessageV3 implements SetStateChangeResponseOrBuilder {
        private static final SetStateChangeResponse DEFAULT_INSTANCE = new SetStateChangeResponse();

        @Deprecated
        public static final Parser<SetStateChangeResponse> PARSER = new AbstractParser<SetStateChangeResponse>() { // from class: com.garmin.proto.generated.GDIXcelStrength.SetStateChangeResponse.1
            @Override // com.google.protobuf.Parser
            public SetStateChangeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SetStateChangeResponse.newBuilder();
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

        private SetStateChangeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetStateChangeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetStateChangeResponse_descriptor;
        }

        public static Builder newBuilder(SetStateChangeResponse setStateChangeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(setStateChangeResponse);
        }

        public static SetStateChangeResponse parseDelimitedFrom(InputStream inputStream) {
            return (SetStateChangeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SetStateChangeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SetStateChangeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof SetStateChangeResponse) {
                return getUnknownFields().equals(((SetStateChangeResponse) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SetStateChangeResponse> getParserForType() {
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
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetStateChangeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SetStateChangeResponse.class, Builder.class);
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
            return new SetStateChangeResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetStateChangeResponseOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetStateChangeResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetStateChangeResponse build() {
                SetStateChangeResponse setStateChangeResponseBuildPartial = buildPartial();
                if (setStateChangeResponseBuildPartial.isInitialized()) {
                    return setStateChangeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) setStateChangeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetStateChangeResponse buildPartial() {
                SetStateChangeResponse setStateChangeResponse = new SetStateChangeResponse(this);
                onBuilt();
                return setStateChangeResponse;
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
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetStateChangeResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetStateChangeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SetStateChangeResponse.class, Builder.class);
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
            public SetStateChangeResponse getDefaultInstanceForType() {
                return SetStateChangeResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SetStateChangeResponse) {
                    return mergeFrom((SetStateChangeResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SetStateChangeResponse setStateChangeResponse) {
                if (setStateChangeResponse == SetStateChangeResponse.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(setStateChangeResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SetStateChangeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SetStateChangeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SetStateChangeResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetStateChangeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetStateChangeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetStateChangeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SetStateChangeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SetStateChangeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SetStateChangeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SetStateChangeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SetStateChangeResponse parseFrom(InputStream inputStream) {
            return (SetStateChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SetStateChangeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetStateChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetStateChangeResponse parseFrom(CodedInputStream codedInputStream) {
            return (SetStateChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SetStateChangeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetStateChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SetTimeSyncMacResponse extends GeneratedMessageV3 implements SetTimeSyncMacResponseOrBuilder {
        private static final SetTimeSyncMacResponse DEFAULT_INSTANCE = new SetTimeSyncMacResponse();

        @Deprecated
        public static final Parser<SetTimeSyncMacResponse> PARSER = new AbstractParser<SetTimeSyncMacResponse>() { // from class: com.garmin.proto.generated.GDIXcelStrength.SetTimeSyncMacResponse.1
            @Override // com.google.protobuf.Parser
            public SetTimeSyncMacResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SetTimeSyncMacResponse.newBuilder();
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

        private SetTimeSyncMacResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetTimeSyncMacResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetTimeSyncMacResponse_descriptor;
        }

        public static Builder newBuilder(SetTimeSyncMacResponse setTimeSyncMacResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(setTimeSyncMacResponse);
        }

        public static SetTimeSyncMacResponse parseDelimitedFrom(InputStream inputStream) {
            return (SetTimeSyncMacResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SetTimeSyncMacResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SetTimeSyncMacResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof SetTimeSyncMacResponse) {
                return getUnknownFields().equals(((SetTimeSyncMacResponse) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SetTimeSyncMacResponse> getParserForType() {
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
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetTimeSyncMacResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SetTimeSyncMacResponse.class, Builder.class);
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
            return new SetTimeSyncMacResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetTimeSyncMacResponseOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetTimeSyncMacResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetTimeSyncMacResponse build() {
                SetTimeSyncMacResponse setTimeSyncMacResponseBuildPartial = buildPartial();
                if (setTimeSyncMacResponseBuildPartial.isInitialized()) {
                    return setTimeSyncMacResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) setTimeSyncMacResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetTimeSyncMacResponse buildPartial() {
                SetTimeSyncMacResponse setTimeSyncMacResponse = new SetTimeSyncMacResponse(this);
                onBuilt();
                return setTimeSyncMacResponse;
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
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetTimeSyncMacResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetTimeSyncMacResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SetTimeSyncMacResponse.class, Builder.class);
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
            public SetTimeSyncMacResponse getDefaultInstanceForType() {
                return SetTimeSyncMacResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SetTimeSyncMacResponse) {
                    return mergeFrom((SetTimeSyncMacResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SetTimeSyncMacResponse setTimeSyncMacResponse) {
                if (setTimeSyncMacResponse == SetTimeSyncMacResponse.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(setTimeSyncMacResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SetTimeSyncMacResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SetTimeSyncMacResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SetTimeSyncMacResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetTimeSyncMacResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetTimeSyncMacResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetTimeSyncMacResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SetTimeSyncMacResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SetTimeSyncMacResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SetTimeSyncMacResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SetTimeSyncMacResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SetTimeSyncMacResponse parseFrom(InputStream inputStream) {
            return (SetTimeSyncMacResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SetTimeSyncMacResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetTimeSyncMacResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetTimeSyncMacResponse parseFrom(CodedInputStream codedInputStream) {
            return (SetTimeSyncMacResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SetTimeSyncMacResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetTimeSyncMacResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SettingsChangeRequest extends GeneratedMessageV3 implements SettingsChangeRequestOrBuilder {
        public static final int AUTO_SET_FIELD_NUMBER = 1;
        private static final SettingsChangeRequest DEFAULT_INSTANCE = new SettingsChangeRequest();

        @Deprecated
        public static final Parser<SettingsChangeRequest> PARSER = new AbstractParser<SettingsChangeRequest>() { // from class: com.garmin.proto.generated.GDIXcelStrength.SettingsChangeRequest.1
            @Override // com.google.protobuf.Parser
            public SettingsChangeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SettingsChangeRequest.newBuilder();
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
        private boolean autoSet_;
        private int bitField0_;
        private byte memoizedIsInitialized;

        private SettingsChangeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.autoSet_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SettingsChangeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SettingsChangeRequest_descriptor;
        }

        public static Builder newBuilder(SettingsChangeRequest settingsChangeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(settingsChangeRequest);
        }

        public static SettingsChangeRequest parseDelimitedFrom(InputStream inputStream) {
            return (SettingsChangeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SettingsChangeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SettingsChangeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SettingsChangeRequest)) {
                return super.equals(obj);
            }
            SettingsChangeRequest settingsChangeRequest = (SettingsChangeRequest) obj;
            if (hasAutoSet() != settingsChangeRequest.hasAutoSet()) {
                return false;
            }
            return (!hasAutoSet() || getAutoSet() == settingsChangeRequest.getAutoSet()) && getUnknownFields().equals(settingsChangeRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.SettingsChangeRequestOrBuilder
        public boolean getAutoSet() {
            return this.autoSet_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SettingsChangeRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.autoSet_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.SettingsChangeRequestOrBuilder
        public boolean hasAutoSet() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAutoSet()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getAutoSet());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SettingsChangeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SettingsChangeRequest.class, Builder.class);
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
            return new SettingsChangeRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.autoSet_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SettingsChangeRequestOrBuilder {
            private boolean autoSet_;
            private int bitField0_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(SettingsChangeRequest settingsChangeRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    settingsChangeRequest.autoSet_ = this.autoSet_;
                } else {
                    i14 = 0;
                }
                settingsChangeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SettingsChangeRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SettingsChangeRequest build() {
                SettingsChangeRequest settingsChangeRequestBuildPartial = buildPartial();
                if (settingsChangeRequestBuildPartial.isInitialized()) {
                    return settingsChangeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) settingsChangeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SettingsChangeRequest buildPartial() {
                SettingsChangeRequest settingsChangeRequest = new SettingsChangeRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(settingsChangeRequest);
                }
                onBuilt();
                return settingsChangeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.autoSet_ = false;
                return this;
            }

            public Builder clearAutoSet() {
                this.bitField0_ &= -2;
                this.autoSet_ = false;
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

            @Override // com.garmin.proto.generated.GDIXcelStrength.SettingsChangeRequestOrBuilder
            public boolean getAutoSet() {
                return this.autoSet_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SettingsChangeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.SettingsChangeRequestOrBuilder
            public boolean hasAutoSet() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SettingsChangeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SettingsChangeRequest.class, Builder.class);
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
                                    this.autoSet_ = codedInputStream.readBool();
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

            public Builder setAutoSet(boolean z14) {
                this.autoSet_ = z14;
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
            public SettingsChangeRequest getDefaultInstanceForType() {
                return SettingsChangeRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SettingsChangeRequest) {
                    return mergeFrom((SettingsChangeRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SettingsChangeRequest settingsChangeRequest) {
                if (settingsChangeRequest == SettingsChangeRequest.getDefaultInstance()) {
                    return this;
                }
                if (settingsChangeRequest.hasAutoSet()) {
                    setAutoSet(settingsChangeRequest.getAutoSet());
                }
                mergeUnknownFields(settingsChangeRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SettingsChangeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SettingsChangeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SettingsChangeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SettingsChangeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SettingsChangeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SettingsChangeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SettingsChangeRequest() {
            this.autoSet_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SettingsChangeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SettingsChangeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SettingsChangeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SettingsChangeRequest parseFrom(InputStream inputStream) {
            return (SettingsChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SettingsChangeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SettingsChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SettingsChangeRequest parseFrom(CodedInputStream codedInputStream) {
            return (SettingsChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SettingsChangeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SettingsChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SettingsChangeResponse extends GeneratedMessageV3 implements SettingsChangeResponseOrBuilder {
        private static final SettingsChangeResponse DEFAULT_INSTANCE = new SettingsChangeResponse();

        @Deprecated
        public static final Parser<SettingsChangeResponse> PARSER = new AbstractParser<SettingsChangeResponse>() { // from class: com.garmin.proto.generated.GDIXcelStrength.SettingsChangeResponse.1
            @Override // com.google.protobuf.Parser
            public SettingsChangeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SettingsChangeResponse.newBuilder();
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

        private SettingsChangeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SettingsChangeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SettingsChangeResponse_descriptor;
        }

        public static Builder newBuilder(SettingsChangeResponse settingsChangeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(settingsChangeResponse);
        }

        public static SettingsChangeResponse parseDelimitedFrom(InputStream inputStream) {
            return (SettingsChangeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SettingsChangeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SettingsChangeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof SettingsChangeResponse) {
                return getUnknownFields().equals(((SettingsChangeResponse) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SettingsChangeResponse> getParserForType() {
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
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SettingsChangeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SettingsChangeResponse.class, Builder.class);
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
            return new SettingsChangeResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SettingsChangeResponseOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SettingsChangeResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SettingsChangeResponse build() {
                SettingsChangeResponse settingsChangeResponseBuildPartial = buildPartial();
                if (settingsChangeResponseBuildPartial.isInitialized()) {
                    return settingsChangeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) settingsChangeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SettingsChangeResponse buildPartial() {
                SettingsChangeResponse settingsChangeResponse = new SettingsChangeResponse(this);
                onBuilt();
                return settingsChangeResponse;
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
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SettingsChangeResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SettingsChangeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SettingsChangeResponse.class, Builder.class);
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
            public SettingsChangeResponse getDefaultInstanceForType() {
                return SettingsChangeResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SettingsChangeResponse) {
                    return mergeFrom((SettingsChangeResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SettingsChangeResponse settingsChangeResponse) {
                if (settingsChangeResponse == SettingsChangeResponse.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(settingsChangeResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SettingsChangeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SettingsChangeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SettingsChangeResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SettingsChangeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SettingsChangeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SettingsChangeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SettingsChangeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SettingsChangeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SettingsChangeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SettingsChangeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SettingsChangeResponse parseFrom(InputStream inputStream) {
            return (SettingsChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SettingsChangeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SettingsChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SettingsChangeResponse parseFrom(CodedInputStream codedInputStream) {
            return (SettingsChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SettingsChangeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SettingsChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AutoSetEventNotification extends GeneratedMessageV3 implements AutoSetEventNotificationOrBuilder {
        private static final AutoSetEventNotification DEFAULT_INSTANCE = new AutoSetEventNotification();

        @Deprecated
        public static final Parser<AutoSetEventNotification> PARSER = new AbstractParser<AutoSetEventNotification>() { // from class: com.garmin.proto.generated.GDIXcelStrength.AutoSetEventNotification.1
            @Override // com.google.protobuf.Parser
            public AutoSetEventNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AutoSetEventNotification.newBuilder();
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
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int type_;

        private AutoSetEventNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.type_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AutoSetEventNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_AutoSetEventNotification_descriptor;
        }

        public static Builder newBuilder(AutoSetEventNotification autoSetEventNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(autoSetEventNotification);
        }

        public static AutoSetEventNotification parseDelimitedFrom(InputStream inputStream) {
            return (AutoSetEventNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AutoSetEventNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AutoSetEventNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AutoSetEventNotification)) {
                return super.equals(obj);
            }
            AutoSetEventNotification autoSetEventNotification = (AutoSetEventNotification) obj;
            if (hasType() != autoSetEventNotification.hasType()) {
                return false;
            }
            return (!hasType() || this.type_ == autoSetEventNotification.type_) && getUnknownFields().equals(autoSetEventNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AutoSetEventNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.type_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.AutoSetEventNotificationOrBuilder
        public SetType getType() {
            SetType setTypeForNumber = SetType.forNumber(this.type_);
            return setTypeForNumber == null ? SetType.SET_TYPE_UNKNOWN : setTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.AutoSetEventNotificationOrBuilder
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
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_AutoSetEventNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AutoSetEventNotification.class, Builder.class);
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
            return new AutoSetEventNotification();
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
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AutoSetEventNotificationOrBuilder {
            private int bitField0_;
            private int type_;

            private Builder() {
                this.type_ = 0;
            }

            private void buildPartial0(AutoSetEventNotification autoSetEventNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    autoSetEventNotification.type_ = this.type_;
                } else {
                    i14 = 0;
                }
                autoSetEventNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_AutoSetEventNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AutoSetEventNotification build() {
                AutoSetEventNotification autoSetEventNotificationBuildPartial = buildPartial();
                if (autoSetEventNotificationBuildPartial.isInitialized()) {
                    return autoSetEventNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) autoSetEventNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AutoSetEventNotification buildPartial() {
                AutoSetEventNotification autoSetEventNotification = new AutoSetEventNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(autoSetEventNotification);
                }
                onBuilt();
                return autoSetEventNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.type_ = 0;
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
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_AutoSetEventNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.AutoSetEventNotificationOrBuilder
            public SetType getType() {
                SetType setTypeForNumber = SetType.forNumber(this.type_);
                return setTypeForNumber == null ? SetType.SET_TYPE_UNKNOWN : setTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.AutoSetEventNotificationOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_AutoSetEventNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AutoSetEventNotification.class, Builder.class);
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
                                    if (SetType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.type_ = i14;
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

            public Builder setType(SetType setType) {
                setType.getClass();
                this.bitField0_ |= 1;
                this.type_ = setType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AutoSetEventNotification getDefaultInstanceForType() {
                return AutoSetEventNotification.getDefaultInstance();
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
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AutoSetEventNotification) {
                    return mergeFrom((AutoSetEventNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AutoSetEventNotification autoSetEventNotification) {
                if (autoSetEventNotification == AutoSetEventNotification.getDefaultInstance()) {
                    return this;
                }
                if (autoSetEventNotification.hasType()) {
                    setType(autoSetEventNotification.getType());
                }
                mergeUnknownFields(autoSetEventNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AutoSetEventNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AutoSetEventNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AutoSetEventNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AutoSetEventNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ AutoSetEventNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static AutoSetEventNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private AutoSetEventNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AutoSetEventNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AutoSetEventNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AutoSetEventNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AutoSetEventNotification parseFrom(InputStream inputStream) {
            return (AutoSetEventNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AutoSetEventNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AutoSetEventNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AutoSetEventNotification parseFrom(CodedInputStream codedInputStream) {
            return (AutoSetEventNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AutoSetEventNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AutoSetEventNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class FavoriteExercisesRequest extends GeneratedMessageV3 implements FavoriteExercisesRequestOrBuilder {
        public static final int LIST_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<Exercise> list_;
        private byte memoizedIsInitialized;
        private static final FavoriteExercisesRequest DEFAULT_INSTANCE = new FavoriteExercisesRequest();

        @Deprecated
        public static final Parser<FavoriteExercisesRequest> PARSER = new AbstractParser<FavoriteExercisesRequest>() { // from class: com.garmin.proto.generated.GDIXcelStrength.FavoriteExercisesRequest.1
            @Override // com.google.protobuf.Parser
            public FavoriteExercisesRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FavoriteExercisesRequest.newBuilder();
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

        private FavoriteExercisesRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.list_ = Collections.EMPTY_LIST;
        }

        public static FavoriteExercisesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_FavoriteExercisesRequest_descriptor;
        }

        public static Builder newBuilder(FavoriteExercisesRequest favoriteExercisesRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(favoriteExercisesRequest);
        }

        public static FavoriteExercisesRequest parseDelimitedFrom(InputStream inputStream) {
            return (FavoriteExercisesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FavoriteExercisesRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FavoriteExercisesRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FavoriteExercisesRequest)) {
                return super.equals(obj);
            }
            FavoriteExercisesRequest favoriteExercisesRequest = (FavoriteExercisesRequest) obj;
            return getListList().equals(favoriteExercisesRequest.getListList()) && getUnknownFields().equals(favoriteExercisesRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.FavoriteExercisesRequestOrBuilder
        public Exercise getList(int i14) {
            return this.list_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.FavoriteExercisesRequestOrBuilder
        public int getListCount() {
            return this.list_.size();
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.FavoriteExercisesRequestOrBuilder
        public List<Exercise> getListList() {
            return this.list_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.FavoriteExercisesRequestOrBuilder
        public ExerciseOrBuilder getListOrBuilder(int i14) {
            return this.list_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.FavoriteExercisesRequestOrBuilder
        public List<? extends ExerciseOrBuilder> getListOrBuilderList() {
            return this.list_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FavoriteExercisesRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.list_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.list_.get(i15));
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
            if (getListCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getListList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_FavoriteExercisesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(FavoriteExercisesRequest.class, Builder.class);
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
            return new FavoriteExercisesRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.list_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.list_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FavoriteExercisesRequestOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<Exercise, Exercise.Builder, ExerciseOrBuilder> listBuilder_;
            private List<Exercise> list_;

            private Builder() {
                this.list_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(FavoriteExercisesRequest favoriteExercisesRequest) {
            }

            private void buildPartialRepeatedFields(FavoriteExercisesRequest favoriteExercisesRequest) {
                RepeatedFieldBuilderV3<Exercise, Exercise.Builder, ExerciseOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    favoriteExercisesRequest.list_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.list_ = Collections.unmodifiableList(this.list_);
                    this.bitField0_ &= -2;
                }
                favoriteExercisesRequest.list_ = this.list_;
            }

            private void ensureListIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.list_ = new ArrayList(this.list_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_FavoriteExercisesRequest_descriptor;
            }

            private RepeatedFieldBuilderV3<Exercise, Exercise.Builder, ExerciseOrBuilder> getListFieldBuilder() {
                if (this.listBuilder_ == null) {
                    this.listBuilder_ = new RepeatedFieldBuilderV3<>(this.list_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.list_ = null;
                }
                return this.listBuilder_;
            }

            public Builder addAllList(Iterable<? extends Exercise> iterable) {
                RepeatedFieldBuilderV3<Exercise, Exercise.Builder, ExerciseOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureListIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.list_);
                onChanged();
                return this;
            }

            public Builder addList(Exercise.Builder builder) {
                RepeatedFieldBuilderV3<Exercise, Exercise.Builder, ExerciseOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureListIsMutable();
                this.list_.add(builder.build());
                onChanged();
                return this;
            }

            public Exercise.Builder addListBuilder() {
                return (Exercise.Builder) getListFieldBuilder().addBuilder(Exercise.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FavoriteExercisesRequest build() {
                FavoriteExercisesRequest favoriteExercisesRequestBuildPartial = buildPartial();
                if (favoriteExercisesRequestBuildPartial.isInitialized()) {
                    return favoriteExercisesRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) favoriteExercisesRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FavoriteExercisesRequest buildPartial() {
                FavoriteExercisesRequest favoriteExercisesRequest = new FavoriteExercisesRequest(this);
                buildPartialRepeatedFields(favoriteExercisesRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(favoriteExercisesRequest);
                }
                onBuilt();
                return favoriteExercisesRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<Exercise, Exercise.Builder, ExerciseOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.list_ = Collections.EMPTY_LIST;
                } else {
                    this.list_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearList() {
                RepeatedFieldBuilderV3<Exercise, Exercise.Builder, ExerciseOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.list_ = Collections.EMPTY_LIST;
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
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_FavoriteExercisesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.FavoriteExercisesRequestOrBuilder
            public Exercise getList(int i14) {
                RepeatedFieldBuilderV3<Exercise, Exercise.Builder, ExerciseOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                return repeatedFieldBuilderV3 == null ? this.list_.get(i14) : (Exercise) repeatedFieldBuilderV3.getMessage(i14);
            }

            public Exercise.Builder getListBuilder(int i14) {
                return (Exercise.Builder) getListFieldBuilder().getBuilder(i14);
            }

            public List<Exercise.Builder> getListBuilderList() {
                return getListFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.FavoriteExercisesRequestOrBuilder
            public int getListCount() {
                RepeatedFieldBuilderV3<Exercise, Exercise.Builder, ExerciseOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                return repeatedFieldBuilderV3 == null ? this.list_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.FavoriteExercisesRequestOrBuilder
            public List<Exercise> getListList() {
                RepeatedFieldBuilderV3<Exercise, Exercise.Builder, ExerciseOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.list_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.FavoriteExercisesRequestOrBuilder
            public ExerciseOrBuilder getListOrBuilder(int i14) {
                RepeatedFieldBuilderV3<Exercise, Exercise.Builder, ExerciseOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                return repeatedFieldBuilderV3 == null ? this.list_.get(i14) : (ExerciseOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.FavoriteExercisesRequestOrBuilder
            public List<? extends ExerciseOrBuilder> getListOrBuilderList() {
                RepeatedFieldBuilderV3<Exercise, Exercise.Builder, ExerciseOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.list_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_FavoriteExercisesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(FavoriteExercisesRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(FavoriteExercisesRequest favoriteExercisesRequest) {
                if (favoriteExercisesRequest == FavoriteExercisesRequest.getDefaultInstance()) {
                    return this;
                }
                if (this.listBuilder_ == null) {
                    if (!favoriteExercisesRequest.list_.isEmpty()) {
                        if (this.list_.isEmpty()) {
                            this.list_ = favoriteExercisesRequest.list_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureListIsMutable();
                            this.list_.addAll(favoriteExercisesRequest.list_);
                        }
                        onChanged();
                    }
                } else if (!favoriteExercisesRequest.list_.isEmpty()) {
                    boolean zIsEmpty = this.listBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<Exercise, Exercise.Builder, ExerciseOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.listBuilder_ = null;
                        this.list_ = favoriteExercisesRequest.list_;
                        this.bitField0_ &= -2;
                        this.listBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getListFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(favoriteExercisesRequest.list_);
                    }
                }
                mergeUnknownFields(favoriteExercisesRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeList(int i14) {
                RepeatedFieldBuilderV3<Exercise, Exercise.Builder, ExerciseOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureListIsMutable();
                this.list_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setList(int i14, Exercise.Builder builder) {
                RepeatedFieldBuilderV3<Exercise, Exercise.Builder, ExerciseOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureListIsMutable();
                this.list_.set(i14, builder.build());
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
            public FavoriteExercisesRequest getDefaultInstanceForType() {
                return FavoriteExercisesRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.list_ = Collections.EMPTY_LIST;
            }

            public Exercise.Builder addListBuilder(int i14) {
                return (Exercise.Builder) getListFieldBuilder().addBuilder(i14, Exercise.getDefaultInstance());
            }

            public Builder addList(int i14, Exercise exercise) {
                RepeatedFieldBuilderV3<Exercise, Exercise.Builder, ExerciseOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    exercise.getClass();
                    ensureListIsMutable();
                    this.list_.add(i14, exercise);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, exercise);
                return this;
            }

            public Builder setList(int i14, Exercise exercise) {
                RepeatedFieldBuilderV3<Exercise, Exercise.Builder, ExerciseOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    exercise.getClass();
                    ensureListIsMutable();
                    this.list_.set(i14, exercise);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, exercise);
                return this;
            }

            public Builder addList(Exercise exercise) {
                RepeatedFieldBuilderV3<Exercise, Exercise.Builder, ExerciseOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    exercise.getClass();
                    ensureListIsMutable();
                    this.list_.add(exercise);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(exercise);
                return this;
            }

            public Builder addList(int i14, Exercise.Builder builder) {
                RepeatedFieldBuilderV3<Exercise, Exercise.Builder, ExerciseOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureListIsMutable();
                    this.list_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FavoriteExercisesRequest) {
                    return mergeFrom((FavoriteExercisesRequest) message);
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
                                    Exercise exercise = (Exercise) codedInputStream.readMessage(Exercise.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Exercise, Exercise.Builder, ExerciseOrBuilder> repeatedFieldBuilderV3 = this.listBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureListIsMutable();
                                        this.list_.add(exercise);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(exercise);
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
        public FavoriteExercisesRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FavoriteExercisesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoriteExercisesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FavoriteExercisesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FavoriteExercisesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private FavoriteExercisesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FavoriteExercisesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FavoriteExercisesRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ FavoriteExercisesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static FavoriteExercisesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FavoriteExercisesRequest parseFrom(InputStream inputStream) {
            return (FavoriteExercisesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FavoriteExercisesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoriteExercisesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FavoriteExercisesRequest parseFrom(CodedInputStream codedInputStream) {
            return (FavoriteExercisesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FavoriteExercisesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoriteExercisesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class MetricsNotification extends GeneratedMessageV3 implements MetricsNotificationOrBuilder {
        public static final int BAR_PATH_POINTS_FIELD_NUMBER = 9;
        public static final int DURATION_SECOND_X100_FIELD_NUMBER = 5;
        public static final int ECC_DURATION_SECOND_X100_FIELD_NUMBER = 12;
        public static final int ECC_MEAN_VEL_M_PER_S_X100_FIELD_NUMBER = 10;
        public static final int ECC_PEAK_VEL_M_PER_S_X100_FIELD_NUMBER = 11;
        public static final int ECC_ROM_CM_X100_FIELD_NUMBER = 13;
        public static final int MEAN_POWER_WATT_FIELD_NUMBER = 8;
        public static final int MEAN_PROPUL_VEL_M_PER_S_X100_FIELD_NUMBER = 4;
        public static final int MEAN_VEL_M_PER_S_X100_FIELD_NUMBER = 2;
        public static final int PEAK_POWER_WATT_FIELD_NUMBER = 7;
        public static final int PEAK_VEL_M_PER_S_X100_FIELD_NUMBER = 3;
        public static final int REP_NUMBER_FIELD_NUMBER = 1;
        public static final int ROM_CM_X100_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private Internal.IntList barPathPoints_;
        private int bitField0_;
        private int durationSecondX100_;
        private int eccDurationSecondX100_;
        private int eccMeanVelMPerSX100_;
        private int eccPeakVelMPerSX100_;
        private int eccRomCmX100_;
        private float meanPowerWatt_;
        private int meanPropulVelMPerSX100_;
        private int meanVelMPerSX100_;
        private byte memoizedIsInitialized;
        private float peakPowerWatt_;
        private int peakVelMPerSX100_;
        private int repNumber_;
        private int romCmX100_;
        private static final MetricsNotification DEFAULT_INSTANCE = new MetricsNotification();

        @Deprecated
        public static final Parser<MetricsNotification> PARSER = new AbstractParser<MetricsNotification>() { // from class: com.garmin.proto.generated.GDIXcelStrength.MetricsNotification.1
            @Override // com.google.protobuf.Parser
            public MetricsNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = MetricsNotification.newBuilder();
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

        private MetricsNotification() {
            this.repNumber_ = 0;
            this.meanVelMPerSX100_ = 0;
            this.peakVelMPerSX100_ = 0;
            this.meanPropulVelMPerSX100_ = 0;
            this.durationSecondX100_ = 0;
            this.romCmX100_ = 0;
            this.peakPowerWatt_ = 0.0f;
            this.meanPowerWatt_ = 0.0f;
            this.barPathPoints_ = GeneratedMessageV3.emptyIntList();
            this.eccMeanVelMPerSX100_ = 0;
            this.eccPeakVelMPerSX100_ = 0;
            this.eccDurationSecondX100_ = 0;
            this.eccRomCmX100_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.barPathPoints_ = GeneratedMessageV3.emptyIntList();
        }

        public static MetricsNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_MetricsNotification_descriptor;
        }

        public static Builder newBuilder(MetricsNotification metricsNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(metricsNotification);
        }

        public static MetricsNotification parseDelimitedFrom(InputStream inputStream) {
            return (MetricsNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MetricsNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MetricsNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MetricsNotification)) {
                return super.equals(obj);
            }
            MetricsNotification metricsNotification = (MetricsNotification) obj;
            if (hasRepNumber() != metricsNotification.hasRepNumber()) {
                return false;
            }
            if ((hasRepNumber() && getRepNumber() != metricsNotification.getRepNumber()) || hasMeanVelMPerSX100() != metricsNotification.hasMeanVelMPerSX100()) {
                return false;
            }
            if ((hasMeanVelMPerSX100() && getMeanVelMPerSX100() != metricsNotification.getMeanVelMPerSX100()) || hasPeakVelMPerSX100() != metricsNotification.hasPeakVelMPerSX100()) {
                return false;
            }
            if ((hasPeakVelMPerSX100() && getPeakVelMPerSX100() != metricsNotification.getPeakVelMPerSX100()) || hasMeanPropulVelMPerSX100() != metricsNotification.hasMeanPropulVelMPerSX100()) {
                return false;
            }
            if ((hasMeanPropulVelMPerSX100() && getMeanPropulVelMPerSX100() != metricsNotification.getMeanPropulVelMPerSX100()) || hasDurationSecondX100() != metricsNotification.hasDurationSecondX100()) {
                return false;
            }
            if ((hasDurationSecondX100() && getDurationSecondX100() != metricsNotification.getDurationSecondX100()) || hasRomCmX100() != metricsNotification.hasRomCmX100()) {
                return false;
            }
            if ((hasRomCmX100() && getRomCmX100() != metricsNotification.getRomCmX100()) || hasPeakPowerWatt() != metricsNotification.hasPeakPowerWatt()) {
                return false;
            }
            if ((hasPeakPowerWatt() && Float.floatToIntBits(getPeakPowerWatt()) != Float.floatToIntBits(metricsNotification.getPeakPowerWatt())) || hasMeanPowerWatt() != metricsNotification.hasMeanPowerWatt()) {
                return false;
            }
            if ((hasMeanPowerWatt() && Float.floatToIntBits(getMeanPowerWatt()) != Float.floatToIntBits(metricsNotification.getMeanPowerWatt())) || !getBarPathPointsList().equals(metricsNotification.getBarPathPointsList()) || hasEccMeanVelMPerSX100() != metricsNotification.hasEccMeanVelMPerSX100()) {
                return false;
            }
            if ((hasEccMeanVelMPerSX100() && getEccMeanVelMPerSX100() != metricsNotification.getEccMeanVelMPerSX100()) || hasEccPeakVelMPerSX100() != metricsNotification.hasEccPeakVelMPerSX100()) {
                return false;
            }
            if ((hasEccPeakVelMPerSX100() && getEccPeakVelMPerSX100() != metricsNotification.getEccPeakVelMPerSX100()) || hasEccDurationSecondX100() != metricsNotification.hasEccDurationSecondX100()) {
                return false;
            }
            if ((!hasEccDurationSecondX100() || getEccDurationSecondX100() == metricsNotification.getEccDurationSecondX100()) && hasEccRomCmX100() == metricsNotification.hasEccRomCmX100()) {
                return (!hasEccRomCmX100() || getEccRomCmX100() == metricsNotification.getEccRomCmX100()) && getUnknownFields().equals(metricsNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public int getBarPathPoints(int i14) {
            return this.barPathPoints_.getInt(i14);
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public int getBarPathPointsCount() {
            return this.barPathPoints_.size();
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public List<Integer> getBarPathPointsList() {
            return this.barPathPoints_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public int getDurationSecondX100() {
            return this.durationSecondX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public int getEccDurationSecondX100() {
            return this.eccDurationSecondX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public int getEccMeanVelMPerSX100() {
            return this.eccMeanVelMPerSX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public int getEccPeakVelMPerSX100() {
            return this.eccPeakVelMPerSX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public int getEccRomCmX100() {
            return this.eccRomCmX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public float getMeanPowerWatt() {
            return this.meanPowerWatt_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public int getMeanPropulVelMPerSX100() {
            return this.meanPropulVelMPerSX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public int getMeanVelMPerSX100() {
            return this.meanVelMPerSX100_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MetricsNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public float getPeakPowerWatt() {
            return this.peakPowerWatt_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public int getPeakVelMPerSX100() {
            return this.peakVelMPerSX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public int getRepNumber() {
            return this.repNumber_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public int getRomCmX100() {
            return this.romCmX100_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.repNumber_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.meanVelMPerSX100_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.peakVelMPerSX100_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.meanPropulVelMPerSX100_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.durationSecondX100_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(6, this.romCmX100_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeFloatSize(7, this.peakPowerWatt_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeFloatSize(8, this.meanPowerWatt_);
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i15 = 0; i15 < this.barPathPoints_.size(); i15++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.barPathPoints_.getInt(i15));
            }
            int size = getBarPathPointsList().size() + iComputeUInt32Size + iComputeInt32SizeNoTag;
            if ((this.bitField0_ & 256) != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.eccMeanVelMPerSX100_);
            }
            if ((this.bitField0_ & 512) != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.eccPeakVelMPerSX100_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.eccDurationSecondX100_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.eccRomCmX100_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public boolean hasDurationSecondX100() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public boolean hasEccDurationSecondX100() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public boolean hasEccMeanVelMPerSX100() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public boolean hasEccPeakVelMPerSX100() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public boolean hasEccRomCmX100() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public boolean hasMeanPowerWatt() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public boolean hasMeanPropulVelMPerSX100() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public boolean hasMeanVelMPerSX100() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public boolean hasPeakPowerWatt() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public boolean hasPeakVelMPerSX100() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public boolean hasRepNumber() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
        public boolean hasRomCmX100() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasRepNumber()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getRepNumber();
            }
            if (hasMeanVelMPerSX100()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getMeanVelMPerSX100();
            }
            if (hasPeakVelMPerSX100()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getPeakVelMPerSX100();
            }
            if (hasMeanPropulVelMPerSX100()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getMeanPropulVelMPerSX100();
            }
            if (hasDurationSecondX100()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getDurationSecondX100();
            }
            if (hasRomCmX100()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getRomCmX100();
            }
            if (hasPeakPowerWatt()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + Float.floatToIntBits(getPeakPowerWatt());
            }
            if (hasMeanPowerWatt()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + Float.floatToIntBits(getMeanPowerWatt());
            }
            if (getBarPathPointsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getBarPathPointsList().hashCode();
            }
            if (hasEccMeanVelMPerSX100()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getEccMeanVelMPerSX100();
            }
            if (hasEccPeakVelMPerSX100()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getEccPeakVelMPerSX100();
            }
            if (hasEccDurationSecondX100()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getEccDurationSecondX100();
            }
            if (hasEccRomCmX100()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getEccRomCmX100();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_MetricsNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(MetricsNotification.class, Builder.class);
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
            return new MetricsNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.repNumber_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.meanVelMPerSX100_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.peakVelMPerSX100_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.meanPropulVelMPerSX100_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.durationSecondX100_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.romCmX100_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeFloat(7, this.peakPowerWatt_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeFloat(8, this.meanPowerWatt_);
            }
            for (int i14 = 0; i14 < this.barPathPoints_.size(); i14++) {
                codedOutputStream.writeInt32(9, this.barPathPoints_.getInt(i14));
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeUInt32(10, this.eccMeanVelMPerSX100_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeUInt32(11, this.eccPeakVelMPerSX100_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeUInt32(12, this.eccDurationSecondX100_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeUInt32(13, this.eccRomCmX100_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MetricsNotificationOrBuilder {
            private Internal.IntList barPathPoints_;
            private int bitField0_;
            private int durationSecondX100_;
            private int eccDurationSecondX100_;
            private int eccMeanVelMPerSX100_;
            private int eccPeakVelMPerSX100_;
            private int eccRomCmX100_;
            private float meanPowerWatt_;
            private int meanPropulVelMPerSX100_;
            private int meanVelMPerSX100_;
            private float peakPowerWatt_;
            private int peakVelMPerSX100_;
            private int repNumber_;
            private int romCmX100_;

            private Builder() {
                this.barPathPoints_ = GeneratedMessageV3.emptyIntList();
            }

            private void buildPartial0(MetricsNotification metricsNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    metricsNotification.repNumber_ = this.repNumber_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    metricsNotification.meanVelMPerSX100_ = this.meanVelMPerSX100_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    metricsNotification.peakVelMPerSX100_ = this.peakVelMPerSX100_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    metricsNotification.meanPropulVelMPerSX100_ = this.meanPropulVelMPerSX100_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    metricsNotification.durationSecondX100_ = this.durationSecondX100_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    metricsNotification.romCmX100_ = this.romCmX100_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    metricsNotification.peakPowerWatt_ = this.peakPowerWatt_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    metricsNotification.meanPowerWatt_ = this.meanPowerWatt_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    this.barPathPoints_.makeImmutable();
                    metricsNotification.barPathPoints_ = this.barPathPoints_;
                }
                if ((i15 & 512) != 0) {
                    metricsNotification.eccMeanVelMPerSX100_ = this.eccMeanVelMPerSX100_;
                    i14 |= 256;
                }
                if ((i15 & 1024) != 0) {
                    metricsNotification.eccPeakVelMPerSX100_ = this.eccPeakVelMPerSX100_;
                    i14 |= 512;
                }
                if ((i15 & 2048) != 0) {
                    metricsNotification.eccDurationSecondX100_ = this.eccDurationSecondX100_;
                    i14 |= 1024;
                }
                if ((i15 & 4096) != 0) {
                    metricsNotification.eccRomCmX100_ = this.eccRomCmX100_;
                    i14 |= 2048;
                }
                metricsNotification.bitField0_ |= i14;
            }

            private void ensureBarPathPointsIsMutable() {
                if (!this.barPathPoints_.isModifiable()) {
                    this.barPathPoints_ = (Internal.IntList) GeneratedMessageV3.makeMutableCopy(this.barPathPoints_);
                }
                this.bitField0_ |= 256;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_MetricsNotification_descriptor;
            }

            public Builder addAllBarPathPoints(Iterable<? extends Integer> iterable) {
                ensureBarPathPointsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.barPathPoints_);
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder addBarPathPoints(int i14) {
                ensureBarPathPointsIsMutable();
                this.barPathPoints_.addInt(i14);
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MetricsNotification build() {
                MetricsNotification metricsNotificationBuildPartial = buildPartial();
                if (metricsNotificationBuildPartial.isInitialized()) {
                    return metricsNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) metricsNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MetricsNotification buildPartial() {
                MetricsNotification metricsNotification = new MetricsNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(metricsNotification);
                }
                onBuilt();
                return metricsNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.repNumber_ = 0;
                this.meanVelMPerSX100_ = 0;
                this.peakVelMPerSX100_ = 0;
                this.meanPropulVelMPerSX100_ = 0;
                this.durationSecondX100_ = 0;
                this.romCmX100_ = 0;
                this.peakPowerWatt_ = 0.0f;
                this.meanPowerWatt_ = 0.0f;
                this.barPathPoints_ = GeneratedMessageV3.emptyIntList();
                this.eccMeanVelMPerSX100_ = 0;
                this.eccPeakVelMPerSX100_ = 0;
                this.eccDurationSecondX100_ = 0;
                this.eccRomCmX100_ = 0;
                return this;
            }

            public Builder clearBarPathPoints() {
                this.barPathPoints_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= -257;
                onChanged();
                return this;
            }

            public Builder clearDurationSecondX100() {
                this.bitField0_ &= -17;
                this.durationSecondX100_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEccDurationSecondX100() {
                this.bitField0_ &= -2049;
                this.eccDurationSecondX100_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEccMeanVelMPerSX100() {
                this.bitField0_ &= -513;
                this.eccMeanVelMPerSX100_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEccPeakVelMPerSX100() {
                this.bitField0_ &= -1025;
                this.eccPeakVelMPerSX100_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEccRomCmX100() {
                this.bitField0_ &= -4097;
                this.eccRomCmX100_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMeanPowerWatt() {
                this.bitField0_ &= -129;
                this.meanPowerWatt_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearMeanPropulVelMPerSX100() {
                this.bitField0_ &= -9;
                this.meanPropulVelMPerSX100_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMeanVelMPerSX100() {
                this.bitField0_ &= -3;
                this.meanVelMPerSX100_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPeakPowerWatt() {
                this.bitField0_ &= -65;
                this.peakPowerWatt_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearPeakVelMPerSX100() {
                this.bitField0_ &= -5;
                this.peakVelMPerSX100_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRepNumber() {
                this.bitField0_ &= -2;
                this.repNumber_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRomCmX100() {
                this.bitField0_ &= -33;
                this.romCmX100_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public int getBarPathPoints(int i14) {
                return this.barPathPoints_.getInt(i14);
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public int getBarPathPointsCount() {
                return this.barPathPoints_.size();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public List<Integer> getBarPathPointsList() {
                this.barPathPoints_.makeImmutable();
                return this.barPathPoints_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_MetricsNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public int getDurationSecondX100() {
                return this.durationSecondX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public int getEccDurationSecondX100() {
                return this.eccDurationSecondX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public int getEccMeanVelMPerSX100() {
                return this.eccMeanVelMPerSX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public int getEccPeakVelMPerSX100() {
                return this.eccPeakVelMPerSX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public int getEccRomCmX100() {
                return this.eccRomCmX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public float getMeanPowerWatt() {
                return this.meanPowerWatt_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public int getMeanPropulVelMPerSX100() {
                return this.meanPropulVelMPerSX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public int getMeanVelMPerSX100() {
                return this.meanVelMPerSX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public float getPeakPowerWatt() {
                return this.peakPowerWatt_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public int getPeakVelMPerSX100() {
                return this.peakVelMPerSX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public int getRepNumber() {
                return this.repNumber_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public int getRomCmX100() {
                return this.romCmX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public boolean hasDurationSecondX100() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public boolean hasEccDurationSecondX100() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public boolean hasEccMeanVelMPerSX100() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public boolean hasEccPeakVelMPerSX100() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public boolean hasEccRomCmX100() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public boolean hasMeanPowerWatt() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public boolean hasMeanPropulVelMPerSX100() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public boolean hasMeanVelMPerSX100() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public boolean hasPeakPowerWatt() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public boolean hasPeakVelMPerSX100() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public boolean hasRepNumber() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.MetricsNotificationOrBuilder
            public boolean hasRomCmX100() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_MetricsNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(MetricsNotification.class, Builder.class);
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
                                    this.repNumber_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 16:
                                    this.meanVelMPerSX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 24:
                                    this.peakVelMPerSX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 32:
                                    this.meanPropulVelMPerSX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 40:
                                    this.durationSecondX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 48:
                                    this.romCmX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 61:
                                    this.peakPowerWatt_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 69:
                                    this.meanPowerWatt_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 72:
                                    int int32 = codedInputStream.readInt32();
                                    ensureBarPathPointsIsMutable();
                                    this.barPathPoints_.addInt(int32);
                                    continue;
                                case 74:
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    ensureBarPathPointsIsMutable();
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.barPathPoints_.addInt(codedInputStream.readInt32());
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                    continue;
                                case 80:
                                    this.eccMeanVelMPerSX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 512;
                                    continue;
                                case 88:
                                    this.eccPeakVelMPerSX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 96:
                                    this.eccDurationSecondX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 104:
                                    this.eccRomCmX100_ = codedInputStream.readUInt32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setBarPathPoints(int i14, int i15) {
                ensureBarPathPointsIsMutable();
                this.barPathPoints_.setInt(i14, i15);
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setDurationSecondX100(int i14) {
                this.durationSecondX100_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setEccDurationSecondX100(int i14) {
                this.eccDurationSecondX100_ = i14;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setEccMeanVelMPerSX100(int i14) {
                this.eccMeanVelMPerSX100_ = i14;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setEccPeakVelMPerSX100(int i14) {
                this.eccPeakVelMPerSX100_ = i14;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setEccRomCmX100(int i14) {
                this.eccRomCmX100_ = i14;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setMeanPowerWatt(float f14) {
                this.meanPowerWatt_ = f14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setMeanPropulVelMPerSX100(int i14) {
                this.meanPropulVelMPerSX100_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setMeanVelMPerSX100(int i14) {
                this.meanVelMPerSX100_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPeakPowerWatt(float f14) {
                this.peakPowerWatt_ = f14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setPeakVelMPerSX100(int i14) {
                this.peakVelMPerSX100_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setRepNumber(int i14) {
                this.repNumber_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setRomCmX100(int i14) {
                this.romCmX100_ = i14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public MetricsNotification getDefaultInstanceForType() {
                return MetricsNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.barPathPoints_ = GeneratedMessageV3.emptyIntList();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MetricsNotification) {
                    return mergeFrom((MetricsNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MetricsNotification metricsNotification) {
                if (metricsNotification == MetricsNotification.getDefaultInstance()) {
                    return this;
                }
                if (metricsNotification.hasRepNumber()) {
                    setRepNumber(metricsNotification.getRepNumber());
                }
                if (metricsNotification.hasMeanVelMPerSX100()) {
                    setMeanVelMPerSX100(metricsNotification.getMeanVelMPerSX100());
                }
                if (metricsNotification.hasPeakVelMPerSX100()) {
                    setPeakVelMPerSX100(metricsNotification.getPeakVelMPerSX100());
                }
                if (metricsNotification.hasMeanPropulVelMPerSX100()) {
                    setMeanPropulVelMPerSX100(metricsNotification.getMeanPropulVelMPerSX100());
                }
                if (metricsNotification.hasDurationSecondX100()) {
                    setDurationSecondX100(metricsNotification.getDurationSecondX100());
                }
                if (metricsNotification.hasRomCmX100()) {
                    setRomCmX100(metricsNotification.getRomCmX100());
                }
                if (metricsNotification.hasPeakPowerWatt()) {
                    setPeakPowerWatt(metricsNotification.getPeakPowerWatt());
                }
                if (metricsNotification.hasMeanPowerWatt()) {
                    setMeanPowerWatt(metricsNotification.getMeanPowerWatt());
                }
                if (!metricsNotification.barPathPoints_.isEmpty()) {
                    if (this.barPathPoints_.isEmpty()) {
                        Internal.IntList intList = metricsNotification.barPathPoints_;
                        this.barPathPoints_ = intList;
                        intList.makeImmutable();
                        this.bitField0_ |= 256;
                    } else {
                        ensureBarPathPointsIsMutable();
                        this.barPathPoints_.addAll(metricsNotification.barPathPoints_);
                    }
                    onChanged();
                }
                if (metricsNotification.hasEccMeanVelMPerSX100()) {
                    setEccMeanVelMPerSX100(metricsNotification.getEccMeanVelMPerSX100());
                }
                if (metricsNotification.hasEccPeakVelMPerSX100()) {
                    setEccPeakVelMPerSX100(metricsNotification.getEccPeakVelMPerSX100());
                }
                if (metricsNotification.hasEccDurationSecondX100()) {
                    setEccDurationSecondX100(metricsNotification.getEccDurationSecondX100());
                }
                if (metricsNotification.hasEccRomCmX100()) {
                    setEccRomCmX100(metricsNotification.getEccRomCmX100());
                }
                mergeUnknownFields(metricsNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MetricsNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static MetricsNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MetricsNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MetricsNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static MetricsNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MetricsNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static MetricsNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static MetricsNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MetricsNotification parseFrom(InputStream inputStream) {
            return (MetricsNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static MetricsNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MetricsNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MetricsNotification parseFrom(CodedInputStream codedInputStream) {
            return (MetricsNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MetricsNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MetricsNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private MetricsNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.repNumber_ = 0;
            this.meanVelMPerSX100_ = 0;
            this.peakVelMPerSX100_ = 0;
            this.meanPropulVelMPerSX100_ = 0;
            this.durationSecondX100_ = 0;
            this.romCmX100_ = 0;
            this.peakPowerWatt_ = 0.0f;
            this.meanPowerWatt_ = 0.0f;
            this.barPathPoints_ = GeneratedMessageV3.emptyIntList();
            this.eccMeanVelMPerSX100_ = 0;
            this.eccPeakVelMPerSX100_ = 0;
            this.eccDurationSecondX100_ = 0;
            this.eccRomCmX100_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ MetricsNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int FAVORITE_EXERCISES_REQUEST_FIELD_NUMBER = 11;
        public static final int FAVORITE_EXERCISES_RESPONSE_FIELD_NUMBER = 12;
        public static final int SETTINGS_CHANGE_REQUEST_FIELD_NUMBER = 7;
        public static final int SETTINGS_CHANGE_RESPONSE_FIELD_NUMBER = 8;
        public static final int SET_CONFIGURATION_REQUEST_FIELD_NUMBER = 5;
        public static final int SET_CONFIGURATION_RESPONSE_FIELD_NUMBER = 6;
        public static final int SET_STATE_CHANGE_REQUEST_FIELD_NUMBER = 3;
        public static final int SET_STATE_CHANGE_RESPONSE_FIELD_NUMBER = 4;
        public static final int SET_TIME_SYNC_MAC_REQUEST_FIELD_NUMBER = 9;
        public static final int SET_TIME_SYNC_MAC_RESPONSE_FIELD_NUMBER = 10;
        public static final int STATE_CHANGE_REQUEST_FIELD_NUMBER = 1;
        public static final int STATE_CHANGE_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private FavoriteExercisesRequest favoriteExercisesRequest_;
        private FavoriteExercisesResponse favoriteExercisesResponse_;
        private byte memoizedIsInitialized;
        private SetConfigurationRequest setConfigurationRequest_;
        private SetConfigurationResponse setConfigurationResponse_;
        private SetStateChangeRequest setStateChangeRequest_;
        private SetStateChangeResponse setStateChangeResponse_;
        private SetTimeSyncMacRequest setTimeSyncMacRequest_;
        private SetTimeSyncMacResponse setTimeSyncMacResponse_;
        private SettingsChangeRequest settingsChangeRequest_;
        private SettingsChangeResponse settingsChangeResponse_;
        private StateChangeRequest stateChangeRequest_;
        private StateChangeResponse stateChangeResponse_;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIXcelStrength.Service.1
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
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_Service_descriptor;
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
            if (hasStateChangeRequest() != service.hasStateChangeRequest()) {
                return false;
            }
            if ((hasStateChangeRequest() && !getStateChangeRequest().equals(service.getStateChangeRequest())) || hasStateChangeResponse() != service.hasStateChangeResponse()) {
                return false;
            }
            if ((hasStateChangeResponse() && !getStateChangeResponse().equals(service.getStateChangeResponse())) || hasSetStateChangeRequest() != service.hasSetStateChangeRequest()) {
                return false;
            }
            if ((hasSetStateChangeRequest() && !getSetStateChangeRequest().equals(service.getSetStateChangeRequest())) || hasSetStateChangeResponse() != service.hasSetStateChangeResponse()) {
                return false;
            }
            if ((hasSetStateChangeResponse() && !getSetStateChangeResponse().equals(service.getSetStateChangeResponse())) || hasSetConfigurationRequest() != service.hasSetConfigurationRequest()) {
                return false;
            }
            if ((hasSetConfigurationRequest() && !getSetConfigurationRequest().equals(service.getSetConfigurationRequest())) || hasSetConfigurationResponse() != service.hasSetConfigurationResponse()) {
                return false;
            }
            if ((hasSetConfigurationResponse() && !getSetConfigurationResponse().equals(service.getSetConfigurationResponse())) || hasSettingsChangeRequest() != service.hasSettingsChangeRequest()) {
                return false;
            }
            if ((hasSettingsChangeRequest() && !getSettingsChangeRequest().equals(service.getSettingsChangeRequest())) || hasSettingsChangeResponse() != service.hasSettingsChangeResponse()) {
                return false;
            }
            if ((hasSettingsChangeResponse() && !getSettingsChangeResponse().equals(service.getSettingsChangeResponse())) || hasSetTimeSyncMacRequest() != service.hasSetTimeSyncMacRequest()) {
                return false;
            }
            if ((hasSetTimeSyncMacRequest() && !getSetTimeSyncMacRequest().equals(service.getSetTimeSyncMacRequest())) || hasSetTimeSyncMacResponse() != service.hasSetTimeSyncMacResponse()) {
                return false;
            }
            if ((hasSetTimeSyncMacResponse() && !getSetTimeSyncMacResponse().equals(service.getSetTimeSyncMacResponse())) || hasFavoriteExercisesRequest() != service.hasFavoriteExercisesRequest()) {
                return false;
            }
            if ((!hasFavoriteExercisesRequest() || getFavoriteExercisesRequest().equals(service.getFavoriteExercisesRequest())) && hasFavoriteExercisesResponse() == service.hasFavoriteExercisesResponse()) {
                return (!hasFavoriteExercisesResponse() || getFavoriteExercisesResponse().equals(service.getFavoriteExercisesResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public FavoriteExercisesRequest getFavoriteExercisesRequest() {
            FavoriteExercisesRequest favoriteExercisesRequest = this.favoriteExercisesRequest_;
            return favoriteExercisesRequest == null ? FavoriteExercisesRequest.getDefaultInstance() : favoriteExercisesRequest;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public FavoriteExercisesRequestOrBuilder getFavoriteExercisesRequestOrBuilder() {
            FavoriteExercisesRequest favoriteExercisesRequest = this.favoriteExercisesRequest_;
            return favoriteExercisesRequest == null ? FavoriteExercisesRequest.getDefaultInstance() : favoriteExercisesRequest;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public FavoriteExercisesResponse getFavoriteExercisesResponse() {
            FavoriteExercisesResponse favoriteExercisesResponse = this.favoriteExercisesResponse_;
            return favoriteExercisesResponse == null ? FavoriteExercisesResponse.getDefaultInstance() : favoriteExercisesResponse;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public FavoriteExercisesResponseOrBuilder getFavoriteExercisesResponseOrBuilder() {
            FavoriteExercisesResponse favoriteExercisesResponse = this.favoriteExercisesResponse_;
            return favoriteExercisesResponse == null ? FavoriteExercisesResponse.getDefaultInstance() : favoriteExercisesResponse;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getStateChangeRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getStateChangeResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getSetStateChangeRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getSetStateChangeResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getSetConfigurationRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getSetConfigurationResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getSettingsChangeRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getSettingsChangeResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getSetTimeSyncMacRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getSetTimeSyncMacResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getFavoriteExercisesRequest());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getFavoriteExercisesResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public SetConfigurationRequest getSetConfigurationRequest() {
            SetConfigurationRequest setConfigurationRequest = this.setConfigurationRequest_;
            return setConfigurationRequest == null ? SetConfigurationRequest.getDefaultInstance() : setConfigurationRequest;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public SetConfigurationRequestOrBuilder getSetConfigurationRequestOrBuilder() {
            SetConfigurationRequest setConfigurationRequest = this.setConfigurationRequest_;
            return setConfigurationRequest == null ? SetConfigurationRequest.getDefaultInstance() : setConfigurationRequest;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public SetConfigurationResponse getSetConfigurationResponse() {
            SetConfigurationResponse setConfigurationResponse = this.setConfigurationResponse_;
            return setConfigurationResponse == null ? SetConfigurationResponse.getDefaultInstance() : setConfigurationResponse;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public SetConfigurationResponseOrBuilder getSetConfigurationResponseOrBuilder() {
            SetConfigurationResponse setConfigurationResponse = this.setConfigurationResponse_;
            return setConfigurationResponse == null ? SetConfigurationResponse.getDefaultInstance() : setConfigurationResponse;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public SetStateChangeRequest getSetStateChangeRequest() {
            SetStateChangeRequest setStateChangeRequest = this.setStateChangeRequest_;
            return setStateChangeRequest == null ? SetStateChangeRequest.getDefaultInstance() : setStateChangeRequest;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public SetStateChangeRequestOrBuilder getSetStateChangeRequestOrBuilder() {
            SetStateChangeRequest setStateChangeRequest = this.setStateChangeRequest_;
            return setStateChangeRequest == null ? SetStateChangeRequest.getDefaultInstance() : setStateChangeRequest;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public SetStateChangeResponse getSetStateChangeResponse() {
            SetStateChangeResponse setStateChangeResponse = this.setStateChangeResponse_;
            return setStateChangeResponse == null ? SetStateChangeResponse.getDefaultInstance() : setStateChangeResponse;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public SetStateChangeResponseOrBuilder getSetStateChangeResponseOrBuilder() {
            SetStateChangeResponse setStateChangeResponse = this.setStateChangeResponse_;
            return setStateChangeResponse == null ? SetStateChangeResponse.getDefaultInstance() : setStateChangeResponse;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public SetTimeSyncMacRequest getSetTimeSyncMacRequest() {
            SetTimeSyncMacRequest setTimeSyncMacRequest = this.setTimeSyncMacRequest_;
            return setTimeSyncMacRequest == null ? SetTimeSyncMacRequest.getDefaultInstance() : setTimeSyncMacRequest;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public SetTimeSyncMacRequestOrBuilder getSetTimeSyncMacRequestOrBuilder() {
            SetTimeSyncMacRequest setTimeSyncMacRequest = this.setTimeSyncMacRequest_;
            return setTimeSyncMacRequest == null ? SetTimeSyncMacRequest.getDefaultInstance() : setTimeSyncMacRequest;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public SetTimeSyncMacResponse getSetTimeSyncMacResponse() {
            SetTimeSyncMacResponse setTimeSyncMacResponse = this.setTimeSyncMacResponse_;
            return setTimeSyncMacResponse == null ? SetTimeSyncMacResponse.getDefaultInstance() : setTimeSyncMacResponse;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public SetTimeSyncMacResponseOrBuilder getSetTimeSyncMacResponseOrBuilder() {
            SetTimeSyncMacResponse setTimeSyncMacResponse = this.setTimeSyncMacResponse_;
            return setTimeSyncMacResponse == null ? SetTimeSyncMacResponse.getDefaultInstance() : setTimeSyncMacResponse;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public SettingsChangeRequest getSettingsChangeRequest() {
            SettingsChangeRequest settingsChangeRequest = this.settingsChangeRequest_;
            return settingsChangeRequest == null ? SettingsChangeRequest.getDefaultInstance() : settingsChangeRequest;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public SettingsChangeRequestOrBuilder getSettingsChangeRequestOrBuilder() {
            SettingsChangeRequest settingsChangeRequest = this.settingsChangeRequest_;
            return settingsChangeRequest == null ? SettingsChangeRequest.getDefaultInstance() : settingsChangeRequest;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public SettingsChangeResponse getSettingsChangeResponse() {
            SettingsChangeResponse settingsChangeResponse = this.settingsChangeResponse_;
            return settingsChangeResponse == null ? SettingsChangeResponse.getDefaultInstance() : settingsChangeResponse;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public SettingsChangeResponseOrBuilder getSettingsChangeResponseOrBuilder() {
            SettingsChangeResponse settingsChangeResponse = this.settingsChangeResponse_;
            return settingsChangeResponse == null ? SettingsChangeResponse.getDefaultInstance() : settingsChangeResponse;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public StateChangeRequest getStateChangeRequest() {
            StateChangeRequest stateChangeRequest = this.stateChangeRequest_;
            return stateChangeRequest == null ? StateChangeRequest.getDefaultInstance() : stateChangeRequest;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public StateChangeRequestOrBuilder getStateChangeRequestOrBuilder() {
            StateChangeRequest stateChangeRequest = this.stateChangeRequest_;
            return stateChangeRequest == null ? StateChangeRequest.getDefaultInstance() : stateChangeRequest;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public StateChangeResponse getStateChangeResponse() {
            StateChangeResponse stateChangeResponse = this.stateChangeResponse_;
            return stateChangeResponse == null ? StateChangeResponse.getDefaultInstance() : stateChangeResponse;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public StateChangeResponseOrBuilder getStateChangeResponseOrBuilder() {
            StateChangeResponse stateChangeResponse = this.stateChangeResponse_;
            return stateChangeResponse == null ? StateChangeResponse.getDefaultInstance() : stateChangeResponse;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public boolean hasFavoriteExercisesRequest() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public boolean hasFavoriteExercisesResponse() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public boolean hasSetConfigurationRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public boolean hasSetConfigurationResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public boolean hasSetStateChangeRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public boolean hasSetStateChangeResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public boolean hasSetTimeSyncMacRequest() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public boolean hasSetTimeSyncMacResponse() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public boolean hasSettingsChangeRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public boolean hasSettingsChangeResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public boolean hasStateChangeRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
        public boolean hasStateChangeResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStateChangeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getStateChangeRequest().hashCode();
            }
            if (hasStateChangeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getStateChangeResponse().hashCode();
            }
            if (hasSetStateChangeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSetStateChangeRequest().hashCode();
            }
            if (hasSetStateChangeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getSetStateChangeResponse().hashCode();
            }
            if (hasSetConfigurationRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getSetConfigurationRequest().hashCode();
            }
            if (hasSetConfigurationResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getSetConfigurationResponse().hashCode();
            }
            if (hasSettingsChangeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getSettingsChangeRequest().hashCode();
            }
            if (hasSettingsChangeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getSettingsChangeResponse().hashCode();
            }
            if (hasSetTimeSyncMacRequest()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getSetTimeSyncMacRequest().hashCode();
            }
            if (hasSetTimeSyncMacResponse()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getSetTimeSyncMacResponse().hashCode();
            }
            if (hasFavoriteExercisesRequest()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getFavoriteExercisesRequest().hashCode();
            }
            if (hasFavoriteExercisesResponse()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getFavoriteExercisesResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getStateChangeRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getStateChangeResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getSetStateChangeRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getSetStateChangeResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getSetConfigurationRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getSetConfigurationResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getSettingsChangeRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getSettingsChangeResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getSetTimeSyncMacRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getSetTimeSyncMacResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getFavoriteExercisesRequest());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(12, getFavoriteExercisesResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<FavoriteExercisesRequest, FavoriteExercisesRequest.Builder, FavoriteExercisesRequestOrBuilder> favoriteExercisesRequestBuilder_;
            private FavoriteExercisesRequest favoriteExercisesRequest_;
            private SingleFieldBuilderV3<FavoriteExercisesResponse, FavoriteExercisesResponse.Builder, FavoriteExercisesResponseOrBuilder> favoriteExercisesResponseBuilder_;
            private FavoriteExercisesResponse favoriteExercisesResponse_;
            private SingleFieldBuilderV3<SetConfigurationRequest, SetConfigurationRequest.Builder, SetConfigurationRequestOrBuilder> setConfigurationRequestBuilder_;
            private SetConfigurationRequest setConfigurationRequest_;
            private SingleFieldBuilderV3<SetConfigurationResponse, SetConfigurationResponse.Builder, SetConfigurationResponseOrBuilder> setConfigurationResponseBuilder_;
            private SetConfigurationResponse setConfigurationResponse_;
            private SingleFieldBuilderV3<SetStateChangeRequest, SetStateChangeRequest.Builder, SetStateChangeRequestOrBuilder> setStateChangeRequestBuilder_;
            private SetStateChangeRequest setStateChangeRequest_;
            private SingleFieldBuilderV3<SetStateChangeResponse, SetStateChangeResponse.Builder, SetStateChangeResponseOrBuilder> setStateChangeResponseBuilder_;
            private SetStateChangeResponse setStateChangeResponse_;
            private SingleFieldBuilderV3<SetTimeSyncMacRequest, SetTimeSyncMacRequest.Builder, SetTimeSyncMacRequestOrBuilder> setTimeSyncMacRequestBuilder_;
            private SetTimeSyncMacRequest setTimeSyncMacRequest_;
            private SingleFieldBuilderV3<SetTimeSyncMacResponse, SetTimeSyncMacResponse.Builder, SetTimeSyncMacResponseOrBuilder> setTimeSyncMacResponseBuilder_;
            private SetTimeSyncMacResponse setTimeSyncMacResponse_;
            private SingleFieldBuilderV3<SettingsChangeRequest, SettingsChangeRequest.Builder, SettingsChangeRequestOrBuilder> settingsChangeRequestBuilder_;
            private SettingsChangeRequest settingsChangeRequest_;
            private SingleFieldBuilderV3<SettingsChangeResponse, SettingsChangeResponse.Builder, SettingsChangeResponseOrBuilder> settingsChangeResponseBuilder_;
            private SettingsChangeResponse settingsChangeResponse_;
            private SingleFieldBuilderV3<StateChangeRequest, StateChangeRequest.Builder, StateChangeRequestOrBuilder> stateChangeRequestBuilder_;
            private StateChangeRequest stateChangeRequest_;
            private SingleFieldBuilderV3<StateChangeResponse, StateChangeResponse.Builder, StateChangeResponseOrBuilder> stateChangeResponseBuilder_;
            private StateChangeResponse stateChangeResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<StateChangeRequest, StateChangeRequest.Builder, StateChangeRequestOrBuilder> singleFieldBuilderV3 = this.stateChangeRequestBuilder_;
                    service.stateChangeRequest_ = singleFieldBuilderV3 == null ? this.stateChangeRequest_ : (StateChangeRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<StateChangeResponse, StateChangeResponse.Builder, StateChangeResponseOrBuilder> singleFieldBuilderV4 = this.stateChangeResponseBuilder_;
                    service.stateChangeResponse_ = singleFieldBuilderV4 == null ? this.stateChangeResponse_ : (StateChangeResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<SetStateChangeRequest, SetStateChangeRequest.Builder, SetStateChangeRequestOrBuilder> singleFieldBuilderV5 = this.setStateChangeRequestBuilder_;
                    service.setStateChangeRequest_ = singleFieldBuilderV5 == null ? this.setStateChangeRequest_ : (SetStateChangeRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<SetStateChangeResponse, SetStateChangeResponse.Builder, SetStateChangeResponseOrBuilder> singleFieldBuilderV6 = this.setStateChangeResponseBuilder_;
                    service.setStateChangeResponse_ = singleFieldBuilderV6 == null ? this.setStateChangeResponse_ : (SetStateChangeResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<SetConfigurationRequest, SetConfigurationRequest.Builder, SetConfigurationRequestOrBuilder> singleFieldBuilderV7 = this.setConfigurationRequestBuilder_;
                    service.setConfigurationRequest_ = singleFieldBuilderV7 == null ? this.setConfigurationRequest_ : (SetConfigurationRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<SetConfigurationResponse, SetConfigurationResponse.Builder, SetConfigurationResponseOrBuilder> singleFieldBuilderV8 = this.setConfigurationResponseBuilder_;
                    service.setConfigurationResponse_ = singleFieldBuilderV8 == null ? this.setConfigurationResponse_ : (SetConfigurationResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<SettingsChangeRequest, SettingsChangeRequest.Builder, SettingsChangeRequestOrBuilder> singleFieldBuilderV9 = this.settingsChangeRequestBuilder_;
                    service.settingsChangeRequest_ = singleFieldBuilderV9 == null ? this.settingsChangeRequest_ : (SettingsChangeRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<SettingsChangeResponse, SettingsChangeResponse.Builder, SettingsChangeResponseOrBuilder> singleFieldBuilderV10 = this.settingsChangeResponseBuilder_;
                    service.settingsChangeResponse_ = singleFieldBuilderV10 == null ? this.settingsChangeResponse_ : (SettingsChangeResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<SetTimeSyncMacRequest, SetTimeSyncMacRequest.Builder, SetTimeSyncMacRequestOrBuilder> singleFieldBuilderV11 = this.setTimeSyncMacRequestBuilder_;
                    service.setTimeSyncMacRequest_ = singleFieldBuilderV11 == null ? this.setTimeSyncMacRequest_ : (SetTimeSyncMacRequest) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<SetTimeSyncMacResponse, SetTimeSyncMacResponse.Builder, SetTimeSyncMacResponseOrBuilder> singleFieldBuilderV12 = this.setTimeSyncMacResponseBuilder_;
                    service.setTimeSyncMacResponse_ = singleFieldBuilderV12 == null ? this.setTimeSyncMacResponse_ : (SetTimeSyncMacResponse) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<FavoriteExercisesRequest, FavoriteExercisesRequest.Builder, FavoriteExercisesRequestOrBuilder> singleFieldBuilderV13 = this.favoriteExercisesRequestBuilder_;
                    service.favoriteExercisesRequest_ = singleFieldBuilderV13 == null ? this.favoriteExercisesRequest_ : (FavoriteExercisesRequest) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<FavoriteExercisesResponse, FavoriteExercisesResponse.Builder, FavoriteExercisesResponseOrBuilder> singleFieldBuilderV14 = this.favoriteExercisesResponseBuilder_;
                    service.favoriteExercisesResponse_ = singleFieldBuilderV14 == null ? this.favoriteExercisesResponse_ : (FavoriteExercisesResponse) singleFieldBuilderV14.build();
                    i14 |= 2048;
                }
                service.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_Service_descriptor;
            }

            private SingleFieldBuilderV3<FavoriteExercisesRequest, FavoriteExercisesRequest.Builder, FavoriteExercisesRequestOrBuilder> getFavoriteExercisesRequestFieldBuilder() {
                if (this.favoriteExercisesRequestBuilder_ == null) {
                    this.favoriteExercisesRequestBuilder_ = new SingleFieldBuilderV3<>(getFavoriteExercisesRequest(), getParentForChildren(), isClean());
                    this.favoriteExercisesRequest_ = null;
                }
                return this.favoriteExercisesRequestBuilder_;
            }

            private SingleFieldBuilderV3<FavoriteExercisesResponse, FavoriteExercisesResponse.Builder, FavoriteExercisesResponseOrBuilder> getFavoriteExercisesResponseFieldBuilder() {
                if (this.favoriteExercisesResponseBuilder_ == null) {
                    this.favoriteExercisesResponseBuilder_ = new SingleFieldBuilderV3<>(getFavoriteExercisesResponse(), getParentForChildren(), isClean());
                    this.favoriteExercisesResponse_ = null;
                }
                return this.favoriteExercisesResponseBuilder_;
            }

            private SingleFieldBuilderV3<SetConfigurationRequest, SetConfigurationRequest.Builder, SetConfigurationRequestOrBuilder> getSetConfigurationRequestFieldBuilder() {
                if (this.setConfigurationRequestBuilder_ == null) {
                    this.setConfigurationRequestBuilder_ = new SingleFieldBuilderV3<>(getSetConfigurationRequest(), getParentForChildren(), isClean());
                    this.setConfigurationRequest_ = null;
                }
                return this.setConfigurationRequestBuilder_;
            }

            private SingleFieldBuilderV3<SetConfigurationResponse, SetConfigurationResponse.Builder, SetConfigurationResponseOrBuilder> getSetConfigurationResponseFieldBuilder() {
                if (this.setConfigurationResponseBuilder_ == null) {
                    this.setConfigurationResponseBuilder_ = new SingleFieldBuilderV3<>(getSetConfigurationResponse(), getParentForChildren(), isClean());
                    this.setConfigurationResponse_ = null;
                }
                return this.setConfigurationResponseBuilder_;
            }

            private SingleFieldBuilderV3<SetStateChangeRequest, SetStateChangeRequest.Builder, SetStateChangeRequestOrBuilder> getSetStateChangeRequestFieldBuilder() {
                if (this.setStateChangeRequestBuilder_ == null) {
                    this.setStateChangeRequestBuilder_ = new SingleFieldBuilderV3<>(getSetStateChangeRequest(), getParentForChildren(), isClean());
                    this.setStateChangeRequest_ = null;
                }
                return this.setStateChangeRequestBuilder_;
            }

            private SingleFieldBuilderV3<SetStateChangeResponse, SetStateChangeResponse.Builder, SetStateChangeResponseOrBuilder> getSetStateChangeResponseFieldBuilder() {
                if (this.setStateChangeResponseBuilder_ == null) {
                    this.setStateChangeResponseBuilder_ = new SingleFieldBuilderV3<>(getSetStateChangeResponse(), getParentForChildren(), isClean());
                    this.setStateChangeResponse_ = null;
                }
                return this.setStateChangeResponseBuilder_;
            }

            private SingleFieldBuilderV3<SetTimeSyncMacRequest, SetTimeSyncMacRequest.Builder, SetTimeSyncMacRequestOrBuilder> getSetTimeSyncMacRequestFieldBuilder() {
                if (this.setTimeSyncMacRequestBuilder_ == null) {
                    this.setTimeSyncMacRequestBuilder_ = new SingleFieldBuilderV3<>(getSetTimeSyncMacRequest(), getParentForChildren(), isClean());
                    this.setTimeSyncMacRequest_ = null;
                }
                return this.setTimeSyncMacRequestBuilder_;
            }

            private SingleFieldBuilderV3<SetTimeSyncMacResponse, SetTimeSyncMacResponse.Builder, SetTimeSyncMacResponseOrBuilder> getSetTimeSyncMacResponseFieldBuilder() {
                if (this.setTimeSyncMacResponseBuilder_ == null) {
                    this.setTimeSyncMacResponseBuilder_ = new SingleFieldBuilderV3<>(getSetTimeSyncMacResponse(), getParentForChildren(), isClean());
                    this.setTimeSyncMacResponse_ = null;
                }
                return this.setTimeSyncMacResponseBuilder_;
            }

            private SingleFieldBuilderV3<SettingsChangeRequest, SettingsChangeRequest.Builder, SettingsChangeRequestOrBuilder> getSettingsChangeRequestFieldBuilder() {
                if (this.settingsChangeRequestBuilder_ == null) {
                    this.settingsChangeRequestBuilder_ = new SingleFieldBuilderV3<>(getSettingsChangeRequest(), getParentForChildren(), isClean());
                    this.settingsChangeRequest_ = null;
                }
                return this.settingsChangeRequestBuilder_;
            }

            private SingleFieldBuilderV3<SettingsChangeResponse, SettingsChangeResponse.Builder, SettingsChangeResponseOrBuilder> getSettingsChangeResponseFieldBuilder() {
                if (this.settingsChangeResponseBuilder_ == null) {
                    this.settingsChangeResponseBuilder_ = new SingleFieldBuilderV3<>(getSettingsChangeResponse(), getParentForChildren(), isClean());
                    this.settingsChangeResponse_ = null;
                }
                return this.settingsChangeResponseBuilder_;
            }

            private SingleFieldBuilderV3<StateChangeRequest, StateChangeRequest.Builder, StateChangeRequestOrBuilder> getStateChangeRequestFieldBuilder() {
                if (this.stateChangeRequestBuilder_ == null) {
                    this.stateChangeRequestBuilder_ = new SingleFieldBuilderV3<>(getStateChangeRequest(), getParentForChildren(), isClean());
                    this.stateChangeRequest_ = null;
                }
                return this.stateChangeRequestBuilder_;
            }

            private SingleFieldBuilderV3<StateChangeResponse, StateChangeResponse.Builder, StateChangeResponseOrBuilder> getStateChangeResponseFieldBuilder() {
                if (this.stateChangeResponseBuilder_ == null) {
                    this.stateChangeResponseBuilder_ = new SingleFieldBuilderV3<>(getStateChangeResponse(), getParentForChildren(), isClean());
                    this.stateChangeResponse_ = null;
                }
                return this.stateChangeResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getStateChangeRequestFieldBuilder();
                    getStateChangeResponseFieldBuilder();
                    getSetStateChangeRequestFieldBuilder();
                    getSetStateChangeResponseFieldBuilder();
                    getSetConfigurationRequestFieldBuilder();
                    getSetConfigurationResponseFieldBuilder();
                    getSettingsChangeRequestFieldBuilder();
                    getSettingsChangeResponseFieldBuilder();
                    getSetTimeSyncMacRequestFieldBuilder();
                    getSetTimeSyncMacResponseFieldBuilder();
                    getFavoriteExercisesRequestFieldBuilder();
                    getFavoriteExercisesResponseFieldBuilder();
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
                this.stateChangeRequest_ = null;
                SingleFieldBuilderV3<StateChangeRequest, StateChangeRequest.Builder, StateChangeRequestOrBuilder> singleFieldBuilderV3 = this.stateChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stateChangeRequestBuilder_ = null;
                }
                this.stateChangeResponse_ = null;
                SingleFieldBuilderV3<StateChangeResponse, StateChangeResponse.Builder, StateChangeResponseOrBuilder> singleFieldBuilderV4 = this.stateChangeResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.stateChangeResponseBuilder_ = null;
                }
                this.setStateChangeRequest_ = null;
                SingleFieldBuilderV3<SetStateChangeRequest, SetStateChangeRequest.Builder, SetStateChangeRequestOrBuilder> singleFieldBuilderV5 = this.setStateChangeRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.setStateChangeRequestBuilder_ = null;
                }
                this.setStateChangeResponse_ = null;
                SingleFieldBuilderV3<SetStateChangeResponse, SetStateChangeResponse.Builder, SetStateChangeResponseOrBuilder> singleFieldBuilderV6 = this.setStateChangeResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.setStateChangeResponseBuilder_ = null;
                }
                this.setConfigurationRequest_ = null;
                SingleFieldBuilderV3<SetConfigurationRequest, SetConfigurationRequest.Builder, SetConfigurationRequestOrBuilder> singleFieldBuilderV7 = this.setConfigurationRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.setConfigurationRequestBuilder_ = null;
                }
                this.setConfigurationResponse_ = null;
                SingleFieldBuilderV3<SetConfigurationResponse, SetConfigurationResponse.Builder, SetConfigurationResponseOrBuilder> singleFieldBuilderV8 = this.setConfigurationResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.setConfigurationResponseBuilder_ = null;
                }
                this.settingsChangeRequest_ = null;
                SingleFieldBuilderV3<SettingsChangeRequest, SettingsChangeRequest.Builder, SettingsChangeRequestOrBuilder> singleFieldBuilderV9 = this.settingsChangeRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.settingsChangeRequestBuilder_ = null;
                }
                this.settingsChangeResponse_ = null;
                SingleFieldBuilderV3<SettingsChangeResponse, SettingsChangeResponse.Builder, SettingsChangeResponseOrBuilder> singleFieldBuilderV10 = this.settingsChangeResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.settingsChangeResponseBuilder_ = null;
                }
                this.setTimeSyncMacRequest_ = null;
                SingleFieldBuilderV3<SetTimeSyncMacRequest, SetTimeSyncMacRequest.Builder, SetTimeSyncMacRequestOrBuilder> singleFieldBuilderV11 = this.setTimeSyncMacRequestBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.setTimeSyncMacRequestBuilder_ = null;
                }
                this.setTimeSyncMacResponse_ = null;
                SingleFieldBuilderV3<SetTimeSyncMacResponse, SetTimeSyncMacResponse.Builder, SetTimeSyncMacResponseOrBuilder> singleFieldBuilderV12 = this.setTimeSyncMacResponseBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.setTimeSyncMacResponseBuilder_ = null;
                }
                this.favoriteExercisesRequest_ = null;
                SingleFieldBuilderV3<FavoriteExercisesRequest, FavoriteExercisesRequest.Builder, FavoriteExercisesRequestOrBuilder> singleFieldBuilderV13 = this.favoriteExercisesRequestBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.favoriteExercisesRequestBuilder_ = null;
                }
                this.favoriteExercisesResponse_ = null;
                SingleFieldBuilderV3<FavoriteExercisesResponse, FavoriteExercisesResponse.Builder, FavoriteExercisesResponseOrBuilder> singleFieldBuilderV14 = this.favoriteExercisesResponseBuilder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.favoriteExercisesResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearFavoriteExercisesRequest() {
                this.bitField0_ &= -1025;
                this.favoriteExercisesRequest_ = null;
                SingleFieldBuilderV3<FavoriteExercisesRequest, FavoriteExercisesRequest.Builder, FavoriteExercisesRequestOrBuilder> singleFieldBuilderV3 = this.favoriteExercisesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.favoriteExercisesRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFavoriteExercisesResponse() {
                this.bitField0_ &= -2049;
                this.favoriteExercisesResponse_ = null;
                SingleFieldBuilderV3<FavoriteExercisesResponse, FavoriteExercisesResponse.Builder, FavoriteExercisesResponseOrBuilder> singleFieldBuilderV3 = this.favoriteExercisesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.favoriteExercisesResponseBuilder_ = null;
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

            public Builder clearSetConfigurationRequest() {
                this.bitField0_ &= -17;
                this.setConfigurationRequest_ = null;
                SingleFieldBuilderV3<SetConfigurationRequest, SetConfigurationRequest.Builder, SetConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.setConfigurationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.setConfigurationRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSetConfigurationResponse() {
                this.bitField0_ &= -33;
                this.setConfigurationResponse_ = null;
                SingleFieldBuilderV3<SetConfigurationResponse, SetConfigurationResponse.Builder, SetConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.setConfigurationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.setConfigurationResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSetStateChangeRequest() {
                this.bitField0_ &= -5;
                this.setStateChangeRequest_ = null;
                SingleFieldBuilderV3<SetStateChangeRequest, SetStateChangeRequest.Builder, SetStateChangeRequestOrBuilder> singleFieldBuilderV3 = this.setStateChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.setStateChangeRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSetStateChangeResponse() {
                this.bitField0_ &= -9;
                this.setStateChangeResponse_ = null;
                SingleFieldBuilderV3<SetStateChangeResponse, SetStateChangeResponse.Builder, SetStateChangeResponseOrBuilder> singleFieldBuilderV3 = this.setStateChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.setStateChangeResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSetTimeSyncMacRequest() {
                this.bitField0_ &= -257;
                this.setTimeSyncMacRequest_ = null;
                SingleFieldBuilderV3<SetTimeSyncMacRequest, SetTimeSyncMacRequest.Builder, SetTimeSyncMacRequestOrBuilder> singleFieldBuilderV3 = this.setTimeSyncMacRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.setTimeSyncMacRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSetTimeSyncMacResponse() {
                this.bitField0_ &= -513;
                this.setTimeSyncMacResponse_ = null;
                SingleFieldBuilderV3<SetTimeSyncMacResponse, SetTimeSyncMacResponse.Builder, SetTimeSyncMacResponseOrBuilder> singleFieldBuilderV3 = this.setTimeSyncMacResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.setTimeSyncMacResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSettingsChangeRequest() {
                this.bitField0_ &= -65;
                this.settingsChangeRequest_ = null;
                SingleFieldBuilderV3<SettingsChangeRequest, SettingsChangeRequest.Builder, SettingsChangeRequestOrBuilder> singleFieldBuilderV3 = this.settingsChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsChangeRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSettingsChangeResponse() {
                this.bitField0_ &= -129;
                this.settingsChangeResponse_ = null;
                SingleFieldBuilderV3<SettingsChangeResponse, SettingsChangeResponse.Builder, SettingsChangeResponseOrBuilder> singleFieldBuilderV3 = this.settingsChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsChangeResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStateChangeRequest() {
                this.bitField0_ &= -2;
                this.stateChangeRequest_ = null;
                SingleFieldBuilderV3<StateChangeRequest, StateChangeRequest.Builder, StateChangeRequestOrBuilder> singleFieldBuilderV3 = this.stateChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stateChangeRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStateChangeResponse() {
                this.bitField0_ &= -3;
                this.stateChangeResponse_ = null;
                SingleFieldBuilderV3<StateChangeResponse, StateChangeResponse.Builder, StateChangeResponseOrBuilder> singleFieldBuilderV3 = this.stateChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stateChangeResponseBuilder_ = null;
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
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public FavoriteExercisesRequest getFavoriteExercisesRequest() {
                SingleFieldBuilderV3<FavoriteExercisesRequest, FavoriteExercisesRequest.Builder, FavoriteExercisesRequestOrBuilder> singleFieldBuilderV3 = this.favoriteExercisesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FavoriteExercisesRequest) singleFieldBuilderV3.getMessage();
                }
                FavoriteExercisesRequest favoriteExercisesRequest = this.favoriteExercisesRequest_;
                return favoriteExercisesRequest == null ? FavoriteExercisesRequest.getDefaultInstance() : favoriteExercisesRequest;
            }

            public FavoriteExercisesRequest.Builder getFavoriteExercisesRequestBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (FavoriteExercisesRequest.Builder) getFavoriteExercisesRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public FavoriteExercisesRequestOrBuilder getFavoriteExercisesRequestOrBuilder() {
                SingleFieldBuilderV3<FavoriteExercisesRequest, FavoriteExercisesRequest.Builder, FavoriteExercisesRequestOrBuilder> singleFieldBuilderV3 = this.favoriteExercisesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FavoriteExercisesRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FavoriteExercisesRequest favoriteExercisesRequest = this.favoriteExercisesRequest_;
                return favoriteExercisesRequest == null ? FavoriteExercisesRequest.getDefaultInstance() : favoriteExercisesRequest;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public FavoriteExercisesResponse getFavoriteExercisesResponse() {
                SingleFieldBuilderV3<FavoriteExercisesResponse, FavoriteExercisesResponse.Builder, FavoriteExercisesResponseOrBuilder> singleFieldBuilderV3 = this.favoriteExercisesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FavoriteExercisesResponse) singleFieldBuilderV3.getMessage();
                }
                FavoriteExercisesResponse favoriteExercisesResponse = this.favoriteExercisesResponse_;
                return favoriteExercisesResponse == null ? FavoriteExercisesResponse.getDefaultInstance() : favoriteExercisesResponse;
            }

            public FavoriteExercisesResponse.Builder getFavoriteExercisesResponseBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (FavoriteExercisesResponse.Builder) getFavoriteExercisesResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public FavoriteExercisesResponseOrBuilder getFavoriteExercisesResponseOrBuilder() {
                SingleFieldBuilderV3<FavoriteExercisesResponse, FavoriteExercisesResponse.Builder, FavoriteExercisesResponseOrBuilder> singleFieldBuilderV3 = this.favoriteExercisesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FavoriteExercisesResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FavoriteExercisesResponse favoriteExercisesResponse = this.favoriteExercisesResponse_;
                return favoriteExercisesResponse == null ? FavoriteExercisesResponse.getDefaultInstance() : favoriteExercisesResponse;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public SetConfigurationRequest getSetConfigurationRequest() {
                SingleFieldBuilderV3<SetConfigurationRequest, SetConfigurationRequest.Builder, SetConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.setConfigurationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetConfigurationRequest) singleFieldBuilderV3.getMessage();
                }
                SetConfigurationRequest setConfigurationRequest = this.setConfigurationRequest_;
                return setConfigurationRequest == null ? SetConfigurationRequest.getDefaultInstance() : setConfigurationRequest;
            }

            public SetConfigurationRequest.Builder getSetConfigurationRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (SetConfigurationRequest.Builder) getSetConfigurationRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public SetConfigurationRequestOrBuilder getSetConfigurationRequestOrBuilder() {
                SingleFieldBuilderV3<SetConfigurationRequest, SetConfigurationRequest.Builder, SetConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.setConfigurationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetConfigurationRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SetConfigurationRequest setConfigurationRequest = this.setConfigurationRequest_;
                return setConfigurationRequest == null ? SetConfigurationRequest.getDefaultInstance() : setConfigurationRequest;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public SetConfigurationResponse getSetConfigurationResponse() {
                SingleFieldBuilderV3<SetConfigurationResponse, SetConfigurationResponse.Builder, SetConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.setConfigurationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetConfigurationResponse) singleFieldBuilderV3.getMessage();
                }
                SetConfigurationResponse setConfigurationResponse = this.setConfigurationResponse_;
                return setConfigurationResponse == null ? SetConfigurationResponse.getDefaultInstance() : setConfigurationResponse;
            }

            public SetConfigurationResponse.Builder getSetConfigurationResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (SetConfigurationResponse.Builder) getSetConfigurationResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public SetConfigurationResponseOrBuilder getSetConfigurationResponseOrBuilder() {
                SingleFieldBuilderV3<SetConfigurationResponse, SetConfigurationResponse.Builder, SetConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.setConfigurationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetConfigurationResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SetConfigurationResponse setConfigurationResponse = this.setConfigurationResponse_;
                return setConfigurationResponse == null ? SetConfigurationResponse.getDefaultInstance() : setConfigurationResponse;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public SetStateChangeRequest getSetStateChangeRequest() {
                SingleFieldBuilderV3<SetStateChangeRequest, SetStateChangeRequest.Builder, SetStateChangeRequestOrBuilder> singleFieldBuilderV3 = this.setStateChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetStateChangeRequest) singleFieldBuilderV3.getMessage();
                }
                SetStateChangeRequest setStateChangeRequest = this.setStateChangeRequest_;
                return setStateChangeRequest == null ? SetStateChangeRequest.getDefaultInstance() : setStateChangeRequest;
            }

            public SetStateChangeRequest.Builder getSetStateChangeRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (SetStateChangeRequest.Builder) getSetStateChangeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public SetStateChangeRequestOrBuilder getSetStateChangeRequestOrBuilder() {
                SingleFieldBuilderV3<SetStateChangeRequest, SetStateChangeRequest.Builder, SetStateChangeRequestOrBuilder> singleFieldBuilderV3 = this.setStateChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetStateChangeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SetStateChangeRequest setStateChangeRequest = this.setStateChangeRequest_;
                return setStateChangeRequest == null ? SetStateChangeRequest.getDefaultInstance() : setStateChangeRequest;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public SetStateChangeResponse getSetStateChangeResponse() {
                SingleFieldBuilderV3<SetStateChangeResponse, SetStateChangeResponse.Builder, SetStateChangeResponseOrBuilder> singleFieldBuilderV3 = this.setStateChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetStateChangeResponse) singleFieldBuilderV3.getMessage();
                }
                SetStateChangeResponse setStateChangeResponse = this.setStateChangeResponse_;
                return setStateChangeResponse == null ? SetStateChangeResponse.getDefaultInstance() : setStateChangeResponse;
            }

            public SetStateChangeResponse.Builder getSetStateChangeResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (SetStateChangeResponse.Builder) getSetStateChangeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public SetStateChangeResponseOrBuilder getSetStateChangeResponseOrBuilder() {
                SingleFieldBuilderV3<SetStateChangeResponse, SetStateChangeResponse.Builder, SetStateChangeResponseOrBuilder> singleFieldBuilderV3 = this.setStateChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetStateChangeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SetStateChangeResponse setStateChangeResponse = this.setStateChangeResponse_;
                return setStateChangeResponse == null ? SetStateChangeResponse.getDefaultInstance() : setStateChangeResponse;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public SetTimeSyncMacRequest getSetTimeSyncMacRequest() {
                SingleFieldBuilderV3<SetTimeSyncMacRequest, SetTimeSyncMacRequest.Builder, SetTimeSyncMacRequestOrBuilder> singleFieldBuilderV3 = this.setTimeSyncMacRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetTimeSyncMacRequest) singleFieldBuilderV3.getMessage();
                }
                SetTimeSyncMacRequest setTimeSyncMacRequest = this.setTimeSyncMacRequest_;
                return setTimeSyncMacRequest == null ? SetTimeSyncMacRequest.getDefaultInstance() : setTimeSyncMacRequest;
            }

            public SetTimeSyncMacRequest.Builder getSetTimeSyncMacRequestBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (SetTimeSyncMacRequest.Builder) getSetTimeSyncMacRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public SetTimeSyncMacRequestOrBuilder getSetTimeSyncMacRequestOrBuilder() {
                SingleFieldBuilderV3<SetTimeSyncMacRequest, SetTimeSyncMacRequest.Builder, SetTimeSyncMacRequestOrBuilder> singleFieldBuilderV3 = this.setTimeSyncMacRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetTimeSyncMacRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SetTimeSyncMacRequest setTimeSyncMacRequest = this.setTimeSyncMacRequest_;
                return setTimeSyncMacRequest == null ? SetTimeSyncMacRequest.getDefaultInstance() : setTimeSyncMacRequest;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public SetTimeSyncMacResponse getSetTimeSyncMacResponse() {
                SingleFieldBuilderV3<SetTimeSyncMacResponse, SetTimeSyncMacResponse.Builder, SetTimeSyncMacResponseOrBuilder> singleFieldBuilderV3 = this.setTimeSyncMacResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetTimeSyncMacResponse) singleFieldBuilderV3.getMessage();
                }
                SetTimeSyncMacResponse setTimeSyncMacResponse = this.setTimeSyncMacResponse_;
                return setTimeSyncMacResponse == null ? SetTimeSyncMacResponse.getDefaultInstance() : setTimeSyncMacResponse;
            }

            public SetTimeSyncMacResponse.Builder getSetTimeSyncMacResponseBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (SetTimeSyncMacResponse.Builder) getSetTimeSyncMacResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public SetTimeSyncMacResponseOrBuilder getSetTimeSyncMacResponseOrBuilder() {
                SingleFieldBuilderV3<SetTimeSyncMacResponse, SetTimeSyncMacResponse.Builder, SetTimeSyncMacResponseOrBuilder> singleFieldBuilderV3 = this.setTimeSyncMacResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetTimeSyncMacResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SetTimeSyncMacResponse setTimeSyncMacResponse = this.setTimeSyncMacResponse_;
                return setTimeSyncMacResponse == null ? SetTimeSyncMacResponse.getDefaultInstance() : setTimeSyncMacResponse;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public SettingsChangeRequest getSettingsChangeRequest() {
                SingleFieldBuilderV3<SettingsChangeRequest, SettingsChangeRequest.Builder, SettingsChangeRequestOrBuilder> singleFieldBuilderV3 = this.settingsChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SettingsChangeRequest) singleFieldBuilderV3.getMessage();
                }
                SettingsChangeRequest settingsChangeRequest = this.settingsChangeRequest_;
                return settingsChangeRequest == null ? SettingsChangeRequest.getDefaultInstance() : settingsChangeRequest;
            }

            public SettingsChangeRequest.Builder getSettingsChangeRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (SettingsChangeRequest.Builder) getSettingsChangeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public SettingsChangeRequestOrBuilder getSettingsChangeRequestOrBuilder() {
                SingleFieldBuilderV3<SettingsChangeRequest, SettingsChangeRequest.Builder, SettingsChangeRequestOrBuilder> singleFieldBuilderV3 = this.settingsChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SettingsChangeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SettingsChangeRequest settingsChangeRequest = this.settingsChangeRequest_;
                return settingsChangeRequest == null ? SettingsChangeRequest.getDefaultInstance() : settingsChangeRequest;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public SettingsChangeResponse getSettingsChangeResponse() {
                SingleFieldBuilderV3<SettingsChangeResponse, SettingsChangeResponse.Builder, SettingsChangeResponseOrBuilder> singleFieldBuilderV3 = this.settingsChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SettingsChangeResponse) singleFieldBuilderV3.getMessage();
                }
                SettingsChangeResponse settingsChangeResponse = this.settingsChangeResponse_;
                return settingsChangeResponse == null ? SettingsChangeResponse.getDefaultInstance() : settingsChangeResponse;
            }

            public SettingsChangeResponse.Builder getSettingsChangeResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (SettingsChangeResponse.Builder) getSettingsChangeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public SettingsChangeResponseOrBuilder getSettingsChangeResponseOrBuilder() {
                SingleFieldBuilderV3<SettingsChangeResponse, SettingsChangeResponse.Builder, SettingsChangeResponseOrBuilder> singleFieldBuilderV3 = this.settingsChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SettingsChangeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SettingsChangeResponse settingsChangeResponse = this.settingsChangeResponse_;
                return settingsChangeResponse == null ? SettingsChangeResponse.getDefaultInstance() : settingsChangeResponse;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public StateChangeRequest getStateChangeRequest() {
                SingleFieldBuilderV3<StateChangeRequest, StateChangeRequest.Builder, StateChangeRequestOrBuilder> singleFieldBuilderV3 = this.stateChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StateChangeRequest) singleFieldBuilderV3.getMessage();
                }
                StateChangeRequest stateChangeRequest = this.stateChangeRequest_;
                return stateChangeRequest == null ? StateChangeRequest.getDefaultInstance() : stateChangeRequest;
            }

            public StateChangeRequest.Builder getStateChangeRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (StateChangeRequest.Builder) getStateChangeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public StateChangeRequestOrBuilder getStateChangeRequestOrBuilder() {
                SingleFieldBuilderV3<StateChangeRequest, StateChangeRequest.Builder, StateChangeRequestOrBuilder> singleFieldBuilderV3 = this.stateChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StateChangeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StateChangeRequest stateChangeRequest = this.stateChangeRequest_;
                return stateChangeRequest == null ? StateChangeRequest.getDefaultInstance() : stateChangeRequest;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public StateChangeResponse getStateChangeResponse() {
                SingleFieldBuilderV3<StateChangeResponse, StateChangeResponse.Builder, StateChangeResponseOrBuilder> singleFieldBuilderV3 = this.stateChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StateChangeResponse) singleFieldBuilderV3.getMessage();
                }
                StateChangeResponse stateChangeResponse = this.stateChangeResponse_;
                return stateChangeResponse == null ? StateChangeResponse.getDefaultInstance() : stateChangeResponse;
            }

            public StateChangeResponse.Builder getStateChangeResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (StateChangeResponse.Builder) getStateChangeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public StateChangeResponseOrBuilder getStateChangeResponseOrBuilder() {
                SingleFieldBuilderV3<StateChangeResponse, StateChangeResponse.Builder, StateChangeResponseOrBuilder> singleFieldBuilderV3 = this.stateChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StateChangeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StateChangeResponse stateChangeResponse = this.stateChangeResponse_;
                return stateChangeResponse == null ? StateChangeResponse.getDefaultInstance() : stateChangeResponse;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public boolean hasFavoriteExercisesRequest() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public boolean hasFavoriteExercisesResponse() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public boolean hasSetConfigurationRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public boolean hasSetConfigurationResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public boolean hasSetStateChangeRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public boolean hasSetStateChangeResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public boolean hasSetTimeSyncMacRequest() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public boolean hasSetTimeSyncMacResponse() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public boolean hasSettingsChangeRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public boolean hasSettingsChangeResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public boolean hasStateChangeRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ServiceOrBuilder
            public boolean hasStateChangeResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFavoriteExercisesRequest(FavoriteExercisesRequest favoriteExercisesRequest) {
                FavoriteExercisesRequest favoriteExercisesRequest2;
                SingleFieldBuilderV3<FavoriteExercisesRequest, FavoriteExercisesRequest.Builder, FavoriteExercisesRequestOrBuilder> singleFieldBuilderV3 = this.favoriteExercisesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(favoriteExercisesRequest);
                } else if ((this.bitField0_ & 1024) == 0 || (favoriteExercisesRequest2 = this.favoriteExercisesRequest_) == null || favoriteExercisesRequest2 == FavoriteExercisesRequest.getDefaultInstance()) {
                    this.favoriteExercisesRequest_ = favoriteExercisesRequest;
                } else {
                    getFavoriteExercisesRequestBuilder().mergeFrom(favoriteExercisesRequest);
                }
                if (this.favoriteExercisesRequest_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFavoriteExercisesResponse(FavoriteExercisesResponse favoriteExercisesResponse) {
                FavoriteExercisesResponse favoriteExercisesResponse2;
                SingleFieldBuilderV3<FavoriteExercisesResponse, FavoriteExercisesResponse.Builder, FavoriteExercisesResponseOrBuilder> singleFieldBuilderV3 = this.favoriteExercisesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(favoriteExercisesResponse);
                } else if ((this.bitField0_ & 2048) == 0 || (favoriteExercisesResponse2 = this.favoriteExercisesResponse_) == null || favoriteExercisesResponse2 == FavoriteExercisesResponse.getDefaultInstance()) {
                    this.favoriteExercisesResponse_ = favoriteExercisesResponse;
                } else {
                    getFavoriteExercisesResponseBuilder().mergeFrom(favoriteExercisesResponse);
                }
                if (this.favoriteExercisesResponse_ != null) {
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
                                    codedInputStream.readMessage(getStateChangeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getStateChangeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getSetStateChangeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getSetStateChangeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getSetConfigurationRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getSetConfigurationResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getSettingsChangeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getSettingsChangeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getSetTimeSyncMacRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getSetTimeSyncMacResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getFavoriteExercisesRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 98:
                                    codedInputStream.readMessage(getFavoriteExercisesResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSetConfigurationRequest(SetConfigurationRequest setConfigurationRequest) {
                SetConfigurationRequest setConfigurationRequest2;
                SingleFieldBuilderV3<SetConfigurationRequest, SetConfigurationRequest.Builder, SetConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.setConfigurationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(setConfigurationRequest);
                } else if ((this.bitField0_ & 16) == 0 || (setConfigurationRequest2 = this.setConfigurationRequest_) == null || setConfigurationRequest2 == SetConfigurationRequest.getDefaultInstance()) {
                    this.setConfigurationRequest_ = setConfigurationRequest;
                } else {
                    getSetConfigurationRequestBuilder().mergeFrom(setConfigurationRequest);
                }
                if (this.setConfigurationRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSetConfigurationResponse(SetConfigurationResponse setConfigurationResponse) {
                SetConfigurationResponse setConfigurationResponse2;
                SingleFieldBuilderV3<SetConfigurationResponse, SetConfigurationResponse.Builder, SetConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.setConfigurationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(setConfigurationResponse);
                } else if ((this.bitField0_ & 32) == 0 || (setConfigurationResponse2 = this.setConfigurationResponse_) == null || setConfigurationResponse2 == SetConfigurationResponse.getDefaultInstance()) {
                    this.setConfigurationResponse_ = setConfigurationResponse;
                } else {
                    getSetConfigurationResponseBuilder().mergeFrom(setConfigurationResponse);
                }
                if (this.setConfigurationResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSetStateChangeRequest(SetStateChangeRequest setStateChangeRequest) {
                SetStateChangeRequest setStateChangeRequest2;
                SingleFieldBuilderV3<SetStateChangeRequest, SetStateChangeRequest.Builder, SetStateChangeRequestOrBuilder> singleFieldBuilderV3 = this.setStateChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(setStateChangeRequest);
                } else if ((this.bitField0_ & 4) == 0 || (setStateChangeRequest2 = this.setStateChangeRequest_) == null || setStateChangeRequest2 == SetStateChangeRequest.getDefaultInstance()) {
                    this.setStateChangeRequest_ = setStateChangeRequest;
                } else {
                    getSetStateChangeRequestBuilder().mergeFrom(setStateChangeRequest);
                }
                if (this.setStateChangeRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSetStateChangeResponse(SetStateChangeResponse setStateChangeResponse) {
                SetStateChangeResponse setStateChangeResponse2;
                SingleFieldBuilderV3<SetStateChangeResponse, SetStateChangeResponse.Builder, SetStateChangeResponseOrBuilder> singleFieldBuilderV3 = this.setStateChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(setStateChangeResponse);
                } else if ((this.bitField0_ & 8) == 0 || (setStateChangeResponse2 = this.setStateChangeResponse_) == null || setStateChangeResponse2 == SetStateChangeResponse.getDefaultInstance()) {
                    this.setStateChangeResponse_ = setStateChangeResponse;
                } else {
                    getSetStateChangeResponseBuilder().mergeFrom(setStateChangeResponse);
                }
                if (this.setStateChangeResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSetTimeSyncMacRequest(SetTimeSyncMacRequest setTimeSyncMacRequest) {
                SetTimeSyncMacRequest setTimeSyncMacRequest2;
                SingleFieldBuilderV3<SetTimeSyncMacRequest, SetTimeSyncMacRequest.Builder, SetTimeSyncMacRequestOrBuilder> singleFieldBuilderV3 = this.setTimeSyncMacRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(setTimeSyncMacRequest);
                } else if ((this.bitField0_ & 256) == 0 || (setTimeSyncMacRequest2 = this.setTimeSyncMacRequest_) == null || setTimeSyncMacRequest2 == SetTimeSyncMacRequest.getDefaultInstance()) {
                    this.setTimeSyncMacRequest_ = setTimeSyncMacRequest;
                } else {
                    getSetTimeSyncMacRequestBuilder().mergeFrom(setTimeSyncMacRequest);
                }
                if (this.setTimeSyncMacRequest_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSetTimeSyncMacResponse(SetTimeSyncMacResponse setTimeSyncMacResponse) {
                SetTimeSyncMacResponse setTimeSyncMacResponse2;
                SingleFieldBuilderV3<SetTimeSyncMacResponse, SetTimeSyncMacResponse.Builder, SetTimeSyncMacResponseOrBuilder> singleFieldBuilderV3 = this.setTimeSyncMacResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(setTimeSyncMacResponse);
                } else if ((this.bitField0_ & 512) == 0 || (setTimeSyncMacResponse2 = this.setTimeSyncMacResponse_) == null || setTimeSyncMacResponse2 == SetTimeSyncMacResponse.getDefaultInstance()) {
                    this.setTimeSyncMacResponse_ = setTimeSyncMacResponse;
                } else {
                    getSetTimeSyncMacResponseBuilder().mergeFrom(setTimeSyncMacResponse);
                }
                if (this.setTimeSyncMacResponse_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSettingsChangeRequest(SettingsChangeRequest settingsChangeRequest) {
                SettingsChangeRequest settingsChangeRequest2;
                SingleFieldBuilderV3<SettingsChangeRequest, SettingsChangeRequest.Builder, SettingsChangeRequestOrBuilder> singleFieldBuilderV3 = this.settingsChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(settingsChangeRequest);
                } else if ((this.bitField0_ & 64) == 0 || (settingsChangeRequest2 = this.settingsChangeRequest_) == null || settingsChangeRequest2 == SettingsChangeRequest.getDefaultInstance()) {
                    this.settingsChangeRequest_ = settingsChangeRequest;
                } else {
                    getSettingsChangeRequestBuilder().mergeFrom(settingsChangeRequest);
                }
                if (this.settingsChangeRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSettingsChangeResponse(SettingsChangeResponse settingsChangeResponse) {
                SettingsChangeResponse settingsChangeResponse2;
                SingleFieldBuilderV3<SettingsChangeResponse, SettingsChangeResponse.Builder, SettingsChangeResponseOrBuilder> singleFieldBuilderV3 = this.settingsChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(settingsChangeResponse);
                } else if ((this.bitField0_ & 128) == 0 || (settingsChangeResponse2 = this.settingsChangeResponse_) == null || settingsChangeResponse2 == SettingsChangeResponse.getDefaultInstance()) {
                    this.settingsChangeResponse_ = settingsChangeResponse;
                } else {
                    getSettingsChangeResponseBuilder().mergeFrom(settingsChangeResponse);
                }
                if (this.settingsChangeResponse_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStateChangeRequest(StateChangeRequest stateChangeRequest) {
                StateChangeRequest stateChangeRequest2;
                SingleFieldBuilderV3<StateChangeRequest, StateChangeRequest.Builder, StateChangeRequestOrBuilder> singleFieldBuilderV3 = this.stateChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stateChangeRequest);
                } else if ((this.bitField0_ & 1) == 0 || (stateChangeRequest2 = this.stateChangeRequest_) == null || stateChangeRequest2 == StateChangeRequest.getDefaultInstance()) {
                    this.stateChangeRequest_ = stateChangeRequest;
                } else {
                    getStateChangeRequestBuilder().mergeFrom(stateChangeRequest);
                }
                if (this.stateChangeRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStateChangeResponse(StateChangeResponse stateChangeResponse) {
                StateChangeResponse stateChangeResponse2;
                SingleFieldBuilderV3<StateChangeResponse, StateChangeResponse.Builder, StateChangeResponseOrBuilder> singleFieldBuilderV3 = this.stateChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stateChangeResponse);
                } else if ((this.bitField0_ & 2) == 0 || (stateChangeResponse2 = this.stateChangeResponse_) == null || stateChangeResponse2 == StateChangeResponse.getDefaultInstance()) {
                    this.stateChangeResponse_ = stateChangeResponse;
                } else {
                    getStateChangeResponseBuilder().mergeFrom(stateChangeResponse);
                }
                if (this.stateChangeResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setFavoriteExercisesRequest(FavoriteExercisesRequest.Builder builder) {
                SingleFieldBuilderV3<FavoriteExercisesRequest, FavoriteExercisesRequest.Builder, FavoriteExercisesRequestOrBuilder> singleFieldBuilderV3 = this.favoriteExercisesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.favoriteExercisesRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setFavoriteExercisesResponse(FavoriteExercisesResponse.Builder builder) {
                SingleFieldBuilderV3<FavoriteExercisesResponse, FavoriteExercisesResponse.Builder, FavoriteExercisesResponseOrBuilder> singleFieldBuilderV3 = this.favoriteExercisesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.favoriteExercisesResponse_ = builder.build();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSetConfigurationRequest(SetConfigurationRequest.Builder builder) {
                SingleFieldBuilderV3<SetConfigurationRequest, SetConfigurationRequest.Builder, SetConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.setConfigurationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.setConfigurationRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSetConfigurationResponse(SetConfigurationResponse.Builder builder) {
                SingleFieldBuilderV3<SetConfigurationResponse, SetConfigurationResponse.Builder, SetConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.setConfigurationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.setConfigurationResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setSetStateChangeRequest(SetStateChangeRequest.Builder builder) {
                SingleFieldBuilderV3<SetStateChangeRequest, SetStateChangeRequest.Builder, SetStateChangeRequestOrBuilder> singleFieldBuilderV3 = this.setStateChangeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.setStateChangeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSetStateChangeResponse(SetStateChangeResponse.Builder builder) {
                SingleFieldBuilderV3<SetStateChangeResponse, SetStateChangeResponse.Builder, SetStateChangeResponseOrBuilder> singleFieldBuilderV3 = this.setStateChangeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.setStateChangeResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSetTimeSyncMacRequest(SetTimeSyncMacRequest.Builder builder) {
                SingleFieldBuilderV3<SetTimeSyncMacRequest, SetTimeSyncMacRequest.Builder, SetTimeSyncMacRequestOrBuilder> singleFieldBuilderV3 = this.setTimeSyncMacRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.setTimeSyncMacRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setSetTimeSyncMacResponse(SetTimeSyncMacResponse.Builder builder) {
                SingleFieldBuilderV3<SetTimeSyncMacResponse, SetTimeSyncMacResponse.Builder, SetTimeSyncMacResponseOrBuilder> singleFieldBuilderV3 = this.setTimeSyncMacResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.setTimeSyncMacResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setSettingsChangeRequest(SettingsChangeRequest.Builder builder) {
                SingleFieldBuilderV3<SettingsChangeRequest, SettingsChangeRequest.Builder, SettingsChangeRequestOrBuilder> singleFieldBuilderV3 = this.settingsChangeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.settingsChangeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setSettingsChangeResponse(SettingsChangeResponse.Builder builder) {
                SingleFieldBuilderV3<SettingsChangeResponse, SettingsChangeResponse.Builder, SettingsChangeResponseOrBuilder> singleFieldBuilderV3 = this.settingsChangeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.settingsChangeResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setStateChangeRequest(StateChangeRequest.Builder builder) {
                SingleFieldBuilderV3<StateChangeRequest, StateChangeRequest.Builder, StateChangeRequestOrBuilder> singleFieldBuilderV3 = this.stateChangeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.stateChangeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStateChangeResponse(StateChangeResponse.Builder builder) {
                SingleFieldBuilderV3<StateChangeResponse, StateChangeResponse.Builder, StateChangeResponseOrBuilder> singleFieldBuilderV3 = this.stateChangeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.stateChangeResponse_ = builder.build();
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

            public Builder setFavoriteExercisesRequest(FavoriteExercisesRequest favoriteExercisesRequest) {
                SingleFieldBuilderV3<FavoriteExercisesRequest, FavoriteExercisesRequest.Builder, FavoriteExercisesRequestOrBuilder> singleFieldBuilderV3 = this.favoriteExercisesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    favoriteExercisesRequest.getClass();
                    this.favoriteExercisesRequest_ = favoriteExercisesRequest;
                } else {
                    singleFieldBuilderV3.setMessage(favoriteExercisesRequest);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setFavoriteExercisesResponse(FavoriteExercisesResponse favoriteExercisesResponse) {
                SingleFieldBuilderV3<FavoriteExercisesResponse, FavoriteExercisesResponse.Builder, FavoriteExercisesResponseOrBuilder> singleFieldBuilderV3 = this.favoriteExercisesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    favoriteExercisesResponse.getClass();
                    this.favoriteExercisesResponse_ = favoriteExercisesResponse;
                } else {
                    singleFieldBuilderV3.setMessage(favoriteExercisesResponse);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setSetConfigurationRequest(SetConfigurationRequest setConfigurationRequest) {
                SingleFieldBuilderV3<SetConfigurationRequest, SetConfigurationRequest.Builder, SetConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.setConfigurationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    setConfigurationRequest.getClass();
                    this.setConfigurationRequest_ = setConfigurationRequest;
                } else {
                    singleFieldBuilderV3.setMessage(setConfigurationRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSetConfigurationResponse(SetConfigurationResponse setConfigurationResponse) {
                SingleFieldBuilderV3<SetConfigurationResponse, SetConfigurationResponse.Builder, SetConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.setConfigurationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    setConfigurationResponse.getClass();
                    this.setConfigurationResponse_ = setConfigurationResponse;
                } else {
                    singleFieldBuilderV3.setMessage(setConfigurationResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setSetStateChangeRequest(SetStateChangeRequest setStateChangeRequest) {
                SingleFieldBuilderV3<SetStateChangeRequest, SetStateChangeRequest.Builder, SetStateChangeRequestOrBuilder> singleFieldBuilderV3 = this.setStateChangeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    setStateChangeRequest.getClass();
                    this.setStateChangeRequest_ = setStateChangeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(setStateChangeRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSetStateChangeResponse(SetStateChangeResponse setStateChangeResponse) {
                SingleFieldBuilderV3<SetStateChangeResponse, SetStateChangeResponse.Builder, SetStateChangeResponseOrBuilder> singleFieldBuilderV3 = this.setStateChangeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    setStateChangeResponse.getClass();
                    this.setStateChangeResponse_ = setStateChangeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(setStateChangeResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSetTimeSyncMacRequest(SetTimeSyncMacRequest setTimeSyncMacRequest) {
                SingleFieldBuilderV3<SetTimeSyncMacRequest, SetTimeSyncMacRequest.Builder, SetTimeSyncMacRequestOrBuilder> singleFieldBuilderV3 = this.setTimeSyncMacRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    setTimeSyncMacRequest.getClass();
                    this.setTimeSyncMacRequest_ = setTimeSyncMacRequest;
                } else {
                    singleFieldBuilderV3.setMessage(setTimeSyncMacRequest);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setSetTimeSyncMacResponse(SetTimeSyncMacResponse setTimeSyncMacResponse) {
                SingleFieldBuilderV3<SetTimeSyncMacResponse, SetTimeSyncMacResponse.Builder, SetTimeSyncMacResponseOrBuilder> singleFieldBuilderV3 = this.setTimeSyncMacResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    setTimeSyncMacResponse.getClass();
                    this.setTimeSyncMacResponse_ = setTimeSyncMacResponse;
                } else {
                    singleFieldBuilderV3.setMessage(setTimeSyncMacResponse);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setSettingsChangeRequest(SettingsChangeRequest settingsChangeRequest) {
                SingleFieldBuilderV3<SettingsChangeRequest, SettingsChangeRequest.Builder, SettingsChangeRequestOrBuilder> singleFieldBuilderV3 = this.settingsChangeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    settingsChangeRequest.getClass();
                    this.settingsChangeRequest_ = settingsChangeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(settingsChangeRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setSettingsChangeResponse(SettingsChangeResponse settingsChangeResponse) {
                SingleFieldBuilderV3<SettingsChangeResponse, SettingsChangeResponse.Builder, SettingsChangeResponseOrBuilder> singleFieldBuilderV3 = this.settingsChangeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    settingsChangeResponse.getClass();
                    this.settingsChangeResponse_ = settingsChangeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(settingsChangeResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setStateChangeRequest(StateChangeRequest stateChangeRequest) {
                SingleFieldBuilderV3<StateChangeRequest, StateChangeRequest.Builder, StateChangeRequestOrBuilder> singleFieldBuilderV3 = this.stateChangeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stateChangeRequest.getClass();
                    this.stateChangeRequest_ = stateChangeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(stateChangeRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStateChangeResponse(StateChangeResponse stateChangeResponse) {
                SingleFieldBuilderV3<StateChangeResponse, StateChangeResponse.Builder, StateChangeResponseOrBuilder> singleFieldBuilderV3 = this.stateChangeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stateChangeResponse.getClass();
                    this.stateChangeResponse_ = stateChangeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(stateChangeResponse);
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
                if (service.hasStateChangeRequest()) {
                    mergeStateChangeRequest(service.getStateChangeRequest());
                }
                if (service.hasStateChangeResponse()) {
                    mergeStateChangeResponse(service.getStateChangeResponse());
                }
                if (service.hasSetStateChangeRequest()) {
                    mergeSetStateChangeRequest(service.getSetStateChangeRequest());
                }
                if (service.hasSetStateChangeResponse()) {
                    mergeSetStateChangeResponse(service.getSetStateChangeResponse());
                }
                if (service.hasSetConfigurationRequest()) {
                    mergeSetConfigurationRequest(service.getSetConfigurationRequest());
                }
                if (service.hasSetConfigurationResponse()) {
                    mergeSetConfigurationResponse(service.getSetConfigurationResponse());
                }
                if (service.hasSettingsChangeRequest()) {
                    mergeSettingsChangeRequest(service.getSettingsChangeRequest());
                }
                if (service.hasSettingsChangeResponse()) {
                    mergeSettingsChangeResponse(service.getSettingsChangeResponse());
                }
                if (service.hasSetTimeSyncMacRequest()) {
                    mergeSetTimeSyncMacRequest(service.getSetTimeSyncMacRequest());
                }
                if (service.hasSetTimeSyncMacResponse()) {
                    mergeSetTimeSyncMacResponse(service.getSetTimeSyncMacResponse());
                }
                if (service.hasFavoriteExercisesRequest()) {
                    mergeFavoriteExercisesRequest(service.getFavoriteExercisesRequest());
                }
                if (service.hasFavoriteExercisesResponse()) {
                    mergeFavoriteExercisesResponse(service.getFavoriteExercisesResponse());
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

    public static final class SetStateChangeRequest extends GeneratedMessageV3 implements SetStateChangeRequestOrBuilder {
        private static final SetStateChangeRequest DEFAULT_INSTANCE = new SetStateChangeRequest();

        @Deprecated
        public static final Parser<SetStateChangeRequest> PARSER = new AbstractParser<SetStateChangeRequest>() { // from class: com.garmin.proto.generated.GDIXcelStrength.SetStateChangeRequest.1
            @Override // com.google.protobuf.Parser
            public SetStateChangeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SetStateChangeRequest.newBuilder();
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
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int type_;

        private SetStateChangeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.type_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetStateChangeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetStateChangeRequest_descriptor;
        }

        public static Builder newBuilder(SetStateChangeRequest setStateChangeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(setStateChangeRequest);
        }

        public static SetStateChangeRequest parseDelimitedFrom(InputStream inputStream) {
            return (SetStateChangeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SetStateChangeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SetStateChangeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetStateChangeRequest)) {
                return super.equals(obj);
            }
            SetStateChangeRequest setStateChangeRequest = (SetStateChangeRequest) obj;
            if (hasType() != setStateChangeRequest.hasType()) {
                return false;
            }
            return (!hasType() || this.type_ == setStateChangeRequest.type_) && getUnknownFields().equals(setStateChangeRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SetStateChangeRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.type_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.SetStateChangeRequestOrBuilder
        public SetType getType() {
            SetType setTypeForNumber = SetType.forNumber(this.type_);
            return setTypeForNumber == null ? SetType.SET_TYPE_UNKNOWN : setTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.SetStateChangeRequestOrBuilder
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
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetStateChangeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SetStateChangeRequest.class, Builder.class);
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
            return new SetStateChangeRequest();
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
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetStateChangeRequestOrBuilder {
            private int bitField0_;
            private int type_;

            private Builder() {
                this.type_ = 0;
            }

            private void buildPartial0(SetStateChangeRequest setStateChangeRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    setStateChangeRequest.type_ = this.type_;
                } else {
                    i14 = 0;
                }
                setStateChangeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetStateChangeRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetStateChangeRequest build() {
                SetStateChangeRequest setStateChangeRequestBuildPartial = buildPartial();
                if (setStateChangeRequestBuildPartial.isInitialized()) {
                    return setStateChangeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) setStateChangeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetStateChangeRequest buildPartial() {
                SetStateChangeRequest setStateChangeRequest = new SetStateChangeRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(setStateChangeRequest);
                }
                onBuilt();
                return setStateChangeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.type_ = 0;
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
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetStateChangeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.SetStateChangeRequestOrBuilder
            public SetType getType() {
                SetType setTypeForNumber = SetType.forNumber(this.type_);
                return setTypeForNumber == null ? SetType.SET_TYPE_UNKNOWN : setTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.SetStateChangeRequestOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetStateChangeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SetStateChangeRequest.class, Builder.class);
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
                                    if (SetType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.type_ = i14;
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

            public Builder setType(SetType setType) {
                setType.getClass();
                this.bitField0_ |= 1;
                this.type_ = setType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SetStateChangeRequest getDefaultInstanceForType() {
                return SetStateChangeRequest.getDefaultInstance();
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
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SetStateChangeRequest) {
                    return mergeFrom((SetStateChangeRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SetStateChangeRequest setStateChangeRequest) {
                if (setStateChangeRequest == SetStateChangeRequest.getDefaultInstance()) {
                    return this;
                }
                if (setStateChangeRequest.hasType()) {
                    setType(setStateChangeRequest.getType());
                }
                mergeUnknownFields(setStateChangeRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SetStateChangeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SetStateChangeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetStateChangeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetStateChangeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SetStateChangeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SetStateChangeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SetStateChangeRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SetStateChangeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SetStateChangeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SetStateChangeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SetStateChangeRequest parseFrom(InputStream inputStream) {
            return (SetStateChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SetStateChangeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetStateChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetStateChangeRequest parseFrom(CodedInputStream codedInputStream) {
            return (SetStateChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SetStateChangeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetStateChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SetTimeSyncMacRequest extends GeneratedMessageV3 implements SetTimeSyncMacRequestOrBuilder {
        private static final SetTimeSyncMacRequest DEFAULT_INSTANCE = new SetTimeSyncMacRequest();

        @Deprecated
        public static final Parser<SetTimeSyncMacRequest> PARSER = new AbstractParser<SetTimeSyncMacRequest>() { // from class: com.garmin.proto.generated.GDIXcelStrength.SetTimeSyncMacRequest.1
            @Override // com.google.protobuf.Parser
            public SetTimeSyncMacRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SetTimeSyncMacRequest.newBuilder();
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
        public static final int TIME_SYNC_MAC_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString timeSyncMac_;

        private SetTimeSyncMacRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.timeSyncMac_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetTimeSyncMacRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetTimeSyncMacRequest_descriptor;
        }

        public static Builder newBuilder(SetTimeSyncMacRequest setTimeSyncMacRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(setTimeSyncMacRequest);
        }

        public static SetTimeSyncMacRequest parseDelimitedFrom(InputStream inputStream) {
            return (SetTimeSyncMacRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SetTimeSyncMacRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SetTimeSyncMacRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetTimeSyncMacRequest)) {
                return super.equals(obj);
            }
            SetTimeSyncMacRequest setTimeSyncMacRequest = (SetTimeSyncMacRequest) obj;
            if (hasTimeSyncMac() != setTimeSyncMacRequest.hasTimeSyncMac()) {
                return false;
            }
            return (!hasTimeSyncMac() || getTimeSyncMac().equals(setTimeSyncMacRequest.getTimeSyncMac())) && getUnknownFields().equals(setTimeSyncMacRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SetTimeSyncMacRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.timeSyncMac_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.SetTimeSyncMacRequestOrBuilder
        public ByteString getTimeSyncMac() {
            return this.timeSyncMac_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.SetTimeSyncMacRequestOrBuilder
        public boolean hasTimeSyncMac() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTimeSyncMac()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTimeSyncMac().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetTimeSyncMacRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SetTimeSyncMacRequest.class, Builder.class);
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
            return new SetTimeSyncMacRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.timeSyncMac_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetTimeSyncMacRequestOrBuilder {
            private int bitField0_;
            private ByteString timeSyncMac_;

            private Builder() {
                this.timeSyncMac_ = ByteString.EMPTY;
            }

            private void buildPartial0(SetTimeSyncMacRequest setTimeSyncMacRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    setTimeSyncMacRequest.timeSyncMac_ = this.timeSyncMac_;
                } else {
                    i14 = 0;
                }
                setTimeSyncMacRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetTimeSyncMacRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetTimeSyncMacRequest build() {
                SetTimeSyncMacRequest setTimeSyncMacRequestBuildPartial = buildPartial();
                if (setTimeSyncMacRequestBuildPartial.isInitialized()) {
                    return setTimeSyncMacRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) setTimeSyncMacRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetTimeSyncMacRequest buildPartial() {
                SetTimeSyncMacRequest setTimeSyncMacRequest = new SetTimeSyncMacRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(setTimeSyncMacRequest);
                }
                onBuilt();
                return setTimeSyncMacRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.timeSyncMac_ = ByteString.EMPTY;
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

            public Builder clearTimeSyncMac() {
                this.bitField0_ &= -2;
                this.timeSyncMac_ = SetTimeSyncMacRequest.getDefaultInstance().getTimeSyncMac();
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
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetTimeSyncMacRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.SetTimeSyncMacRequestOrBuilder
            public ByteString getTimeSyncMac() {
                return this.timeSyncMac_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.SetTimeSyncMacRequestOrBuilder
            public boolean hasTimeSyncMac() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_SetTimeSyncMacRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SetTimeSyncMacRequest.class, Builder.class);
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
                                    this.timeSyncMac_ = codedInputStream.readBytes();
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

            public Builder setTimeSyncMac(ByteString byteString) {
                byteString.getClass();
                this.timeSyncMac_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SetTimeSyncMacRequest getDefaultInstanceForType() {
                return SetTimeSyncMacRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.timeSyncMac_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SetTimeSyncMacRequest) {
                    return mergeFrom((SetTimeSyncMacRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SetTimeSyncMacRequest setTimeSyncMacRequest) {
                if (setTimeSyncMacRequest == SetTimeSyncMacRequest.getDefaultInstance()) {
                    return this;
                }
                if (setTimeSyncMacRequest.hasTimeSyncMac()) {
                    setTimeSyncMac(setTimeSyncMacRequest.getTimeSyncMac());
                }
                mergeUnknownFields(setTimeSyncMacRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SetTimeSyncMacRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SetTimeSyncMacRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetTimeSyncMacRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetTimeSyncMacRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SetTimeSyncMacRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ SetTimeSyncMacRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SetTimeSyncMacRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private SetTimeSyncMacRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.timeSyncMac_ = byteString;
        }

        public static SetTimeSyncMacRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SetTimeSyncMacRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SetTimeSyncMacRequest parseFrom(InputStream inputStream) {
            return (SetTimeSyncMacRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SetTimeSyncMacRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetTimeSyncMacRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetTimeSyncMacRequest parseFrom(CodedInputStream codedInputStream) {
            return (SetTimeSyncMacRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SetTimeSyncMacRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetTimeSyncMacRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StateChangeRequest extends GeneratedMessageV3 implements StateChangeRequestOrBuilder {
        public static final int CHANGE_FIELD_NUMBER = 1;
        private static final StateChangeRequest DEFAULT_INSTANCE = new StateChangeRequest();

        @Deprecated
        public static final Parser<StateChangeRequest> PARSER = new AbstractParser<StateChangeRequest>() { // from class: com.garmin.proto.generated.GDIXcelStrength.StateChangeRequest.1
            @Override // com.google.protobuf.Parser
            public StateChangeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StateChangeRequest.newBuilder();
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
        private int change_;
        private byte memoizedIsInitialized;

        private StateChangeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.change_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StateChangeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_StateChangeRequest_descriptor;
        }

        public static Builder newBuilder(StateChangeRequest stateChangeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stateChangeRequest);
        }

        public static StateChangeRequest parseDelimitedFrom(InputStream inputStream) {
            return (StateChangeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StateChangeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StateChangeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StateChangeRequest)) {
                return super.equals(obj);
            }
            StateChangeRequest stateChangeRequest = (StateChangeRequest) obj;
            if (hasChange() != stateChangeRequest.hasChange()) {
                return false;
            }
            return (!hasChange() || this.change_ == stateChangeRequest.change_) && getUnknownFields().equals(stateChangeRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.StateChangeRequestOrBuilder
        public StateChange getChange() {
            StateChange stateChangeForNumber = StateChange.forNumber(this.change_);
            return stateChangeForNumber == null ? StateChange.STATE_CHANGE_UNKNOWN : stateChangeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StateChangeRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.change_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.StateChangeRequestOrBuilder
        public boolean hasChange() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasChange()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.change_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_StateChangeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StateChangeRequest.class, Builder.class);
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
            return new StateChangeRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.change_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StateChangeRequestOrBuilder {
            private int bitField0_;
            private int change_;

            private Builder() {
                this.change_ = 0;
            }

            private void buildPartial0(StateChangeRequest stateChangeRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    stateChangeRequest.change_ = this.change_;
                } else {
                    i14 = 0;
                }
                stateChangeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_StateChangeRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StateChangeRequest build() {
                StateChangeRequest stateChangeRequestBuildPartial = buildPartial();
                if (stateChangeRequestBuildPartial.isInitialized()) {
                    return stateChangeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stateChangeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StateChangeRequest buildPartial() {
                StateChangeRequest stateChangeRequest = new StateChangeRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(stateChangeRequest);
                }
                onBuilt();
                return stateChangeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.change_ = 0;
                return this;
            }

            public Builder clearChange() {
                this.bitField0_ &= -2;
                this.change_ = 0;
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

            @Override // com.garmin.proto.generated.GDIXcelStrength.StateChangeRequestOrBuilder
            public StateChange getChange() {
                StateChange stateChangeForNumber = StateChange.forNumber(this.change_);
                return stateChangeForNumber == null ? StateChange.STATE_CHANGE_UNKNOWN : stateChangeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_StateChangeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.StateChangeRequestOrBuilder
            public boolean hasChange() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_StateChangeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StateChangeRequest.class, Builder.class);
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
                                    if (StateChange.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.change_ = i14;
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

            public Builder setChange(StateChange stateChange) {
                stateChange.getClass();
                this.bitField0_ |= 1;
                this.change_ = stateChange.getNumber();
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
            public StateChangeRequest getDefaultInstanceForType() {
                return StateChangeRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.change_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StateChangeRequest) {
                    return mergeFrom((StateChangeRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StateChangeRequest stateChangeRequest) {
                if (stateChangeRequest == StateChangeRequest.getDefaultInstance()) {
                    return this;
                }
                if (stateChangeRequest.hasChange()) {
                    setChange(stateChangeRequest.getChange());
                }
                mergeUnknownFields(stateChangeRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StateChangeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StateChangeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StateChangeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StateChangeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ StateChangeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StateChangeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private StateChangeRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.change_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StateChangeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StateChangeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StateChangeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StateChangeRequest parseFrom(InputStream inputStream) {
            return (StateChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StateChangeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StateChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StateChangeRequest parseFrom(CodedInputStream codedInputStream) {
            return (StateChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StateChangeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StateChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum StateChange implements ProtocolMessageEnum {
            STATE_CHANGE_UNKNOWN(0),
            INITIAL_START(1),
            PAUSE(2),
            RESUME(3),
            RESET(4);

            public static final int INITIAL_START_VALUE = 1;
            public static final int PAUSE_VALUE = 2;
            public static final int RESET_VALUE = 4;
            public static final int RESUME_VALUE = 3;
            public static final int STATE_CHANGE_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<StateChange> internalValueMap = new Internal.EnumLiteMap<StateChange>() { // from class: com.garmin.proto.generated.GDIXcelStrength.StateChangeRequest.StateChange.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public StateChange findValueByNumber(int i14) {
                    return StateChange.forNumber(i14);
                }
            };
            private static final StateChange[] VALUES = values();

            StateChange(int i14) {
                this.value = i14;
            }

            public static StateChange forNumber(int i14) {
                if (i14 == 0) {
                    return STATE_CHANGE_UNKNOWN;
                }
                if (i14 == 1) {
                    return INITIAL_START;
                }
                if (i14 == 2) {
                    return PAUSE;
                }
                if (i14 == 3) {
                    return RESUME;
                }
                if (i14 != 4) {
                    return null;
                }
                return RESET;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return StateChangeRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<StateChange> internalGetValueMap() {
                return internalValueMap;
            }

            public static StateChange valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static StateChange valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class StateChangeResponse extends GeneratedMessageV3 implements StateChangeResponseOrBuilder {
        public static final int FAILURE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int failure_;
        private byte memoizedIsInitialized;
        private static final StateChangeResponse DEFAULT_INSTANCE = new StateChangeResponse();

        @Deprecated
        public static final Parser<StateChangeResponse> PARSER = new AbstractParser<StateChangeResponse>() { // from class: com.garmin.proto.generated.GDIXcelStrength.StateChangeResponse.1
            @Override // com.google.protobuf.Parser
            public StateChangeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StateChangeResponse.newBuilder();
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

        private StateChangeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.failure_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StateChangeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_StateChangeResponse_descriptor;
        }

        public static Builder newBuilder(StateChangeResponse stateChangeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stateChangeResponse);
        }

        public static StateChangeResponse parseDelimitedFrom(InputStream inputStream) {
            return (StateChangeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StateChangeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StateChangeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StateChangeResponse)) {
                return super.equals(obj);
            }
            StateChangeResponse stateChangeResponse = (StateChangeResponse) obj;
            if (hasFailure() != stateChangeResponse.hasFailure()) {
                return false;
            }
            return (!hasFailure() || this.failure_ == stateChangeResponse.failure_) && getUnknownFields().equals(stateChangeResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.StateChangeResponseOrBuilder
        public FailureReason getFailure() {
            FailureReason failureReasonForNumber = FailureReason.forNumber(this.failure_);
            return failureReasonForNumber == null ? FailureReason.FAILURE_REASON_UNKNOWN : failureReasonForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StateChangeResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.failure_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.StateChangeResponseOrBuilder
        public boolean hasFailure() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasFailure()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.failure_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_StateChangeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StateChangeResponse.class, Builder.class);
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
            return new StateChangeResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.failure_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StateChangeResponseOrBuilder {
            private int bitField0_;
            private int failure_;

            private Builder() {
                this.failure_ = 0;
            }

            private void buildPartial0(StateChangeResponse stateChangeResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    stateChangeResponse.failure_ = this.failure_;
                } else {
                    i14 = 0;
                }
                stateChangeResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_StateChangeResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StateChangeResponse build() {
                StateChangeResponse stateChangeResponseBuildPartial = buildPartial();
                if (stateChangeResponseBuildPartial.isInitialized()) {
                    return stateChangeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stateChangeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StateChangeResponse buildPartial() {
                StateChangeResponse stateChangeResponse = new StateChangeResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(stateChangeResponse);
                }
                onBuilt();
                return stateChangeResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.failure_ = 0;
                return this;
            }

            public Builder clearFailure() {
                this.bitField0_ &= -2;
                this.failure_ = 0;
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
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_StateChangeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.StateChangeResponseOrBuilder
            public FailureReason getFailure() {
                FailureReason failureReasonForNumber = FailureReason.forNumber(this.failure_);
                return failureReasonForNumber == null ? FailureReason.FAILURE_REASON_UNKNOWN : failureReasonForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.StateChangeResponseOrBuilder
            public boolean hasFailure() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_StateChangeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StateChangeResponse.class, Builder.class);
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
                                    if (FailureReason.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.failure_ = i14;
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

            public Builder setFailure(FailureReason failureReason) {
                failureReason.getClass();
                this.bitField0_ |= 1;
                this.failure_ = failureReason.getNumber();
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
            public StateChangeResponse getDefaultInstanceForType() {
                return StateChangeResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.failure_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StateChangeResponse) {
                    return mergeFrom((StateChangeResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StateChangeResponse stateChangeResponse) {
                if (stateChangeResponse == StateChangeResponse.getDefaultInstance()) {
                    return this;
                }
                if (stateChangeResponse.hasFailure()) {
                    setFailure(stateChangeResponse.getFailure());
                }
                mergeUnknownFields(stateChangeResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StateChangeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StateChangeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StateChangeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StateChangeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ StateChangeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StateChangeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private StateChangeResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.failure_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StateChangeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StateChangeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StateChangeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StateChangeResponse parseFrom(InputStream inputStream) {
            return (StateChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StateChangeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StateChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StateChangeResponse parseFrom(CodedInputStream codedInputStream) {
            return (StateChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StateChangeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StateChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum FailureReason implements ProtocolMessageEnum {
            FAILURE_REASON_UNKNOWN(0),
            CONTROL_TAKEN(1);

            public static final int CONTROL_TAKEN_VALUE = 1;
            public static final int FAILURE_REASON_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<FailureReason> internalValueMap = new Internal.EnumLiteMap<FailureReason>() { // from class: com.garmin.proto.generated.GDIXcelStrength.StateChangeResponse.FailureReason.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public FailureReason findValueByNumber(int i14) {
                    return FailureReason.forNumber(i14);
                }
            };
            private static final FailureReason[] VALUES = values();

            FailureReason(int i14) {
                this.value = i14;
            }

            public static FailureReason forNumber(int i14) {
                if (i14 == 0) {
                    return FAILURE_REASON_UNKNOWN;
                }
                if (i14 != 1) {
                    return null;
                }
                return CONTROL_TAKEN;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return StateChangeResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<FailureReason> internalGetValueMap() {
                return internalValueMap;
            }

            public static FailureReason valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static FailureReason valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class StateNotification extends GeneratedMessageV3 implements StateNotificationOrBuilder {
        private static final StateNotification DEFAULT_INSTANCE = new StateNotification();

        @Deprecated
        public static final Parser<StateNotification> PARSER = new AbstractParser<StateNotification>() { // from class: com.garmin.proto.generated.GDIXcelStrength.StateNotification.1
            @Override // com.google.protobuf.Parser
            public StateNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StateNotification.newBuilder();
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
        public static final int STATE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int state_;

        private StateNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.state_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StateNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_StateNotification_descriptor;
        }

        public static Builder newBuilder(StateNotification stateNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stateNotification);
        }

        public static StateNotification parseDelimitedFrom(InputStream inputStream) {
            return (StateNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StateNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StateNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StateNotification)) {
                return super.equals(obj);
            }
            StateNotification stateNotification = (StateNotification) obj;
            if (hasState() != stateNotification.hasState()) {
                return false;
            }
            return (!hasState() || this.state_ == stateNotification.state_) && getUnknownFields().equals(stateNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StateNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.state_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.StateNotificationOrBuilder
        public State getState() {
            State stateForNumber = State.forNumber(this.state_);
            return stateForNumber == null ? State.STATE_UNKNOWN : stateForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.StateNotificationOrBuilder
        public boolean hasState() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasState()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.state_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_StateNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(StateNotification.class, Builder.class);
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
            return new StateNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.state_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StateNotificationOrBuilder {
            private int bitField0_;
            private int state_;

            private Builder() {
                this.state_ = 0;
            }

            private void buildPartial0(StateNotification stateNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    stateNotification.state_ = this.state_;
                } else {
                    i14 = 0;
                }
                stateNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_StateNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StateNotification build() {
                StateNotification stateNotificationBuildPartial = buildPartial();
                if (stateNotificationBuildPartial.isInitialized()) {
                    return stateNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stateNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StateNotification buildPartial() {
                StateNotification stateNotification = new StateNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(stateNotification);
                }
                onBuilt();
                return stateNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.state_ = 0;
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

            public Builder clearState() {
                this.bitField0_ &= -2;
                this.state_ = 0;
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
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_StateNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.StateNotificationOrBuilder
            public State getState() {
                State stateForNumber = State.forNumber(this.state_);
                return stateForNumber == null ? State.STATE_UNKNOWN : stateForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.StateNotificationOrBuilder
            public boolean hasState() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_StateNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(StateNotification.class, Builder.class);
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
                                    if (State.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.state_ = i14;
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

            public Builder setState(State state) {
                state.getClass();
                this.bitField0_ |= 1;
                this.state_ = state.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public StateNotification getDefaultInstanceForType() {
                return StateNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.state_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StateNotification) {
                    return mergeFrom((StateNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StateNotification stateNotification) {
                if (stateNotification == StateNotification.getDefaultInstance()) {
                    return this;
                }
                if (stateNotification.hasState()) {
                    setState(stateNotification.getState());
                }
                mergeUnknownFields(stateNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StateNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StateNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StateNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StateNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ StateNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StateNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private StateNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.state_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StateNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StateNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StateNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StateNotification parseFrom(InputStream inputStream) {
            return (StateNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StateNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StateNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StateNotification parseFrom(CodedInputStream codedInputStream) {
            return (StateNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StateNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StateNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum State implements ProtocolMessageEnum {
            STATE_UNKNOWN(0),
            OFF(1),
            STOPPED(2),
            ON(3);

            public static final int OFF_VALUE = 1;
            public static final int ON_VALUE = 3;
            public static final int STATE_UNKNOWN_VALUE = 0;
            public static final int STOPPED_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<State> internalValueMap = new Internal.EnumLiteMap<State>() { // from class: com.garmin.proto.generated.GDIXcelStrength.StateNotification.State.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public State findValueByNumber(int i14) {
                    return State.forNumber(i14);
                }
            };
            private static final State[] VALUES = values();

            State(int i14) {
                this.value = i14;
            }

            public static State forNumber(int i14) {
                if (i14 == 0) {
                    return STATE_UNKNOWN;
                }
                if (i14 == 1) {
                    return OFF;
                }
                if (i14 == 2) {
                    return STOPPED;
                }
                if (i14 != 3) {
                    return null;
                }
                return ON;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return StateNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<State> internalGetValueMap() {
                return internalValueMap;
            }

            public static State valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static State valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class ToneNotification extends GeneratedMessageV3 implements ToneNotificationOrBuilder {
        private static final ToneNotification DEFAULT_INSTANCE = new ToneNotification();

        @Deprecated
        public static final Parser<ToneNotification> PARSER = new AbstractParser<ToneNotification>() { // from class: com.garmin.proto.generated.GDIXcelStrength.ToneNotification.1
            @Override // com.google.protobuf.Parser
            public ToneNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ToneNotification.newBuilder();
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
        public static final int PRIORITY_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int priority_;
        private int type_;

        private ToneNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.type_ = 0;
            this.priority_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ToneNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_ToneNotification_descriptor;
        }

        public static Builder newBuilder(ToneNotification toneNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(toneNotification);
        }

        public static ToneNotification parseDelimitedFrom(InputStream inputStream) {
            return (ToneNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ToneNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ToneNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ToneNotification)) {
                return super.equals(obj);
            }
            ToneNotification toneNotification = (ToneNotification) obj;
            if (hasType() != toneNotification.hasType()) {
                return false;
            }
            if ((!hasType() || this.type_ == toneNotification.type_) && hasPriority() == toneNotification.hasPriority()) {
                return (!hasPriority() || getPriority() == toneNotification.getPriority()) && getUnknownFields().equals(toneNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ToneNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ToneNotificationOrBuilder
        public int getPriority() {
            return this.priority_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.priority_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ToneNotificationOrBuilder
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.UNKNOWN : typeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ToneNotificationOrBuilder
        public boolean hasPriority() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.ToneNotificationOrBuilder
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
            if (hasPriority()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getPriority();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_ToneNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ToneNotification.class, Builder.class);
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
            return new ToneNotification();
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
                codedOutputStream.writeUInt32(2, this.priority_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ToneNotificationOrBuilder {
            private int bitField0_;
            private int priority_;
            private int type_;

            private Builder() {
                this.type_ = 0;
            }

            private void buildPartial0(ToneNotification toneNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    toneNotification.type_ = this.type_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    toneNotification.priority_ = this.priority_;
                    i14 |= 2;
                }
                toneNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_ToneNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ToneNotification build() {
                ToneNotification toneNotificationBuildPartial = buildPartial();
                if (toneNotificationBuildPartial.isInitialized()) {
                    return toneNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) toneNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ToneNotification buildPartial() {
                ToneNotification toneNotification = new ToneNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(toneNotification);
                }
                onBuilt();
                return toneNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.type_ = 0;
                this.priority_ = 0;
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

            public Builder clearPriority() {
                this.bitField0_ &= -3;
                this.priority_ = 0;
                onChanged();
                return this;
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
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_ToneNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ToneNotificationOrBuilder
            public int getPriority() {
                return this.priority_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ToneNotificationOrBuilder
            public Type getType() {
                Type typeForNumber = Type.forNumber(this.type_);
                return typeForNumber == null ? Type.UNKNOWN : typeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ToneNotificationOrBuilder
            public boolean hasPriority() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.ToneNotificationOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_ToneNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ToneNotification.class, Builder.class);
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
                                    if (Type.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.type_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.priority_ = codedInputStream.readUInt32();
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

            public Builder setPriority(int i14) {
                this.priority_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setType(Type type) {
                type.getClass();
                this.bitField0_ |= 1;
                this.type_ = type.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ToneNotification getDefaultInstanceForType() {
                return ToneNotification.getDefaultInstance();
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
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ToneNotification) {
                    return mergeFrom((ToneNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ToneNotification toneNotification) {
                if (toneNotification == ToneNotification.getDefaultInstance()) {
                    return this;
                }
                if (toneNotification.hasType()) {
                    setType(toneNotification.getType());
                }
                if (toneNotification.hasPriority()) {
                    setPriority(toneNotification.getPriority());
                }
                mergeUnknownFields(toneNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ToneNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ToneNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ToneNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ToneNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ToneNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ToneNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ ToneNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ToneNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private ToneNotification() {
            this.priority_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
        }

        public static ToneNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ToneNotification parseFrom(InputStream inputStream) {
            return (ToneNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ToneNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ToneNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ToneNotification parseFrom(CodedInputStream codedInputStream) {
            return (ToneNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ToneNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ToneNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Type implements ProtocolMessageEnum {
            UNKNOWN(0),
            TIMER_COUNT_DOWN(1),
            TARGET_HIT(2),
            TARGET_MISS(3),
            LAP(4),
            TIMER_COUNT_UP_START(5),
            SENSOR_DISCONNECT(6),
            SENSOR_CONNECT(7),
            LOW_BATTERY(8);

            public static final int LAP_VALUE = 4;
            public static final int LOW_BATTERY_VALUE = 8;
            public static final int SENSOR_CONNECT_VALUE = 7;
            public static final int SENSOR_DISCONNECT_VALUE = 6;
            public static final int TARGET_HIT_VALUE = 2;
            public static final int TARGET_MISS_VALUE = 3;
            public static final int TIMER_COUNT_DOWN_VALUE = 1;
            public static final int TIMER_COUNT_UP_START_VALUE = 5;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: com.garmin.proto.generated.GDIXcelStrength.ToneNotification.Type.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Type findValueByNumber(int i14) {
                    return Type.forNumber(i14);
                }
            };
            private static final Type[] VALUES = values();

            Type(int i14) {
                this.value = i14;
            }

            public static Type forNumber(int i14) {
                switch (i14) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return TIMER_COUNT_DOWN;
                    case 2:
                        return TARGET_HIT;
                    case 3:
                        return TARGET_MISS;
                    case 4:
                        return LAP;
                    case 5:
                        return TIMER_COUNT_UP_START;
                    case 6:
                        return SENSOR_DISCONNECT;
                    case 7:
                        return SENSOR_CONNECT;
                    case 8:
                        return LOW_BATTERY;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ToneNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Type> internalGetValueMap() {
                return internalValueMap;
            }

            public static Type valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Type valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class XcelStrengthEventNotification extends GeneratedMessageV3 implements XcelStrengthEventNotificationOrBuilder {
        public static final int AUTO_SET_NOTIFICATION_FIELD_NUMBER = 1;
        public static final int METRICS_NOTIFICATION_FIELD_NUMBER = 3;
        public static final int REF_BARO_STATUS_NOTIFICATION_FIELD_NUMBER = 5;
        public static final int STATE_NOTIFICATION_FIELD_NUMBER = 2;
        public static final int TONE_NOTIFICATION_FIELD_NUMBER = 4;
        public static final int XCEL_STRENGTH_EVENT_FIELD_NUMBER = 1023;
        private static final long serialVersionUID = 0;
        private AutoSetEventNotification autoSetNotification_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private MetricsNotification metricsNotification_;
        private ReferenceBarometerStatusNotification refBaroStatusNotification_;
        private StateNotification stateNotification_;
        private ToneNotification toneNotification_;
        private static final XcelStrengthEventNotification DEFAULT_INSTANCE = new XcelStrengthEventNotification();

        @Deprecated
        public static final Parser<XcelStrengthEventNotification> PARSER = new AbstractParser<XcelStrengthEventNotification>() { // from class: com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotification.1
            @Override // com.google.protobuf.Parser
            public XcelStrengthEventNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = XcelStrengthEventNotification.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, XcelStrengthEventNotification> xcelStrengthEvent = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, XcelStrengthEventNotification.class, getDefaultInstance());

        private XcelStrengthEventNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static XcelStrengthEventNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_XcelStrengthEventNotification_descriptor;
        }

        public static Builder newBuilder(XcelStrengthEventNotification xcelStrengthEventNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(xcelStrengthEventNotification);
        }

        public static XcelStrengthEventNotification parseDelimitedFrom(InputStream inputStream) {
            return (XcelStrengthEventNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static XcelStrengthEventNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<XcelStrengthEventNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof XcelStrengthEventNotification)) {
                return super.equals(obj);
            }
            XcelStrengthEventNotification xcelStrengthEventNotification = (XcelStrengthEventNotification) obj;
            if (hasAutoSetNotification() != xcelStrengthEventNotification.hasAutoSetNotification()) {
                return false;
            }
            if ((hasAutoSetNotification() && !getAutoSetNotification().equals(xcelStrengthEventNotification.getAutoSetNotification())) || hasStateNotification() != xcelStrengthEventNotification.hasStateNotification()) {
                return false;
            }
            if ((hasStateNotification() && !getStateNotification().equals(xcelStrengthEventNotification.getStateNotification())) || hasMetricsNotification() != xcelStrengthEventNotification.hasMetricsNotification()) {
                return false;
            }
            if ((hasMetricsNotification() && !getMetricsNotification().equals(xcelStrengthEventNotification.getMetricsNotification())) || hasToneNotification() != xcelStrengthEventNotification.hasToneNotification()) {
                return false;
            }
            if ((!hasToneNotification() || getToneNotification().equals(xcelStrengthEventNotification.getToneNotification())) && hasRefBaroStatusNotification() == xcelStrengthEventNotification.hasRefBaroStatusNotification()) {
                return (!hasRefBaroStatusNotification() || getRefBaroStatusNotification().equals(xcelStrengthEventNotification.getRefBaroStatusNotification())) && getUnknownFields().equals(xcelStrengthEventNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
        public AutoSetEventNotification getAutoSetNotification() {
            AutoSetEventNotification autoSetEventNotification = this.autoSetNotification_;
            return autoSetEventNotification == null ? AutoSetEventNotification.getDefaultInstance() : autoSetEventNotification;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
        public AutoSetEventNotificationOrBuilder getAutoSetNotificationOrBuilder() {
            AutoSetEventNotification autoSetEventNotification = this.autoSetNotification_;
            return autoSetEventNotification == null ? AutoSetEventNotification.getDefaultInstance() : autoSetEventNotification;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
        public MetricsNotification getMetricsNotification() {
            MetricsNotification metricsNotification = this.metricsNotification_;
            return metricsNotification == null ? MetricsNotification.getDefaultInstance() : metricsNotification;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
        public MetricsNotificationOrBuilder getMetricsNotificationOrBuilder() {
            MetricsNotification metricsNotification = this.metricsNotification_;
            return metricsNotification == null ? MetricsNotification.getDefaultInstance() : metricsNotification;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<XcelStrengthEventNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
        public ReferenceBarometerStatusNotification getRefBaroStatusNotification() {
            ReferenceBarometerStatusNotification referenceBarometerStatusNotification = this.refBaroStatusNotification_;
            return referenceBarometerStatusNotification == null ? ReferenceBarometerStatusNotification.getDefaultInstance() : referenceBarometerStatusNotification;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
        public ReferenceBarometerStatusNotificationOrBuilder getRefBaroStatusNotificationOrBuilder() {
            ReferenceBarometerStatusNotification referenceBarometerStatusNotification = this.refBaroStatusNotification_;
            return referenceBarometerStatusNotification == null ? ReferenceBarometerStatusNotification.getDefaultInstance() : referenceBarometerStatusNotification;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getAutoSetNotification()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getStateNotification());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getMetricsNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getToneNotification());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getRefBaroStatusNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
        public StateNotification getStateNotification() {
            StateNotification stateNotification = this.stateNotification_;
            return stateNotification == null ? StateNotification.getDefaultInstance() : stateNotification;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
        public StateNotificationOrBuilder getStateNotificationOrBuilder() {
            StateNotification stateNotification = this.stateNotification_;
            return stateNotification == null ? StateNotification.getDefaultInstance() : stateNotification;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
        public ToneNotification getToneNotification() {
            ToneNotification toneNotification = this.toneNotification_;
            return toneNotification == null ? ToneNotification.getDefaultInstance() : toneNotification;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
        public ToneNotificationOrBuilder getToneNotificationOrBuilder() {
            ToneNotification toneNotification = this.toneNotification_;
            return toneNotification == null ? ToneNotification.getDefaultInstance() : toneNotification;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
        public boolean hasAutoSetNotification() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
        public boolean hasMetricsNotification() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
        public boolean hasRefBaroStatusNotification() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
        public boolean hasStateNotification() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
        public boolean hasToneNotification() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAutoSetNotification()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getAutoSetNotification().hashCode();
            }
            if (hasStateNotification()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getStateNotification().hashCode();
            }
            if (hasMetricsNotification()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getMetricsNotification().hashCode();
            }
            if (hasToneNotification()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getToneNotification().hashCode();
            }
            if (hasRefBaroStatusNotification()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getRefBaroStatusNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_XcelStrengthEventNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(XcelStrengthEventNotification.class, Builder.class);
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
            return new XcelStrengthEventNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getAutoSetNotification());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getStateNotification());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getMetricsNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getToneNotification());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getRefBaroStatusNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements XcelStrengthEventNotificationOrBuilder {
            private SingleFieldBuilderV3<AutoSetEventNotification, AutoSetEventNotification.Builder, AutoSetEventNotificationOrBuilder> autoSetNotificationBuilder_;
            private AutoSetEventNotification autoSetNotification_;
            private int bitField0_;
            private SingleFieldBuilderV3<MetricsNotification, MetricsNotification.Builder, MetricsNotificationOrBuilder> metricsNotificationBuilder_;
            private MetricsNotification metricsNotification_;
            private SingleFieldBuilderV3<ReferenceBarometerStatusNotification, ReferenceBarometerStatusNotification.Builder, ReferenceBarometerStatusNotificationOrBuilder> refBaroStatusNotificationBuilder_;
            private ReferenceBarometerStatusNotification refBaroStatusNotification_;
            private SingleFieldBuilderV3<StateNotification, StateNotification.Builder, StateNotificationOrBuilder> stateNotificationBuilder_;
            private StateNotification stateNotification_;
            private SingleFieldBuilderV3<ToneNotification, ToneNotification.Builder, ToneNotificationOrBuilder> toneNotificationBuilder_;
            private ToneNotification toneNotification_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(XcelStrengthEventNotification xcelStrengthEventNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<AutoSetEventNotification, AutoSetEventNotification.Builder, AutoSetEventNotificationOrBuilder> singleFieldBuilderV3 = this.autoSetNotificationBuilder_;
                    xcelStrengthEventNotification.autoSetNotification_ = singleFieldBuilderV3 == null ? this.autoSetNotification_ : (AutoSetEventNotification) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<StateNotification, StateNotification.Builder, StateNotificationOrBuilder> singleFieldBuilderV4 = this.stateNotificationBuilder_;
                    xcelStrengthEventNotification.stateNotification_ = singleFieldBuilderV4 == null ? this.stateNotification_ : (StateNotification) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<MetricsNotification, MetricsNotification.Builder, MetricsNotificationOrBuilder> singleFieldBuilderV5 = this.metricsNotificationBuilder_;
                    xcelStrengthEventNotification.metricsNotification_ = singleFieldBuilderV5 == null ? this.metricsNotification_ : (MetricsNotification) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<ToneNotification, ToneNotification.Builder, ToneNotificationOrBuilder> singleFieldBuilderV6 = this.toneNotificationBuilder_;
                    xcelStrengthEventNotification.toneNotification_ = singleFieldBuilderV6 == null ? this.toneNotification_ : (ToneNotification) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<ReferenceBarometerStatusNotification, ReferenceBarometerStatusNotification.Builder, ReferenceBarometerStatusNotificationOrBuilder> singleFieldBuilderV7 = this.refBaroStatusNotificationBuilder_;
                    xcelStrengthEventNotification.refBaroStatusNotification_ = singleFieldBuilderV7 == null ? this.refBaroStatusNotification_ : (ReferenceBarometerStatusNotification) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                xcelStrengthEventNotification.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<AutoSetEventNotification, AutoSetEventNotification.Builder, AutoSetEventNotificationOrBuilder> getAutoSetNotificationFieldBuilder() {
                if (this.autoSetNotificationBuilder_ == null) {
                    this.autoSetNotificationBuilder_ = new SingleFieldBuilderV3<>(getAutoSetNotification(), getParentForChildren(), isClean());
                    this.autoSetNotification_ = null;
                }
                return this.autoSetNotificationBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_XcelStrengthEventNotification_descriptor;
            }

            private SingleFieldBuilderV3<MetricsNotification, MetricsNotification.Builder, MetricsNotificationOrBuilder> getMetricsNotificationFieldBuilder() {
                if (this.metricsNotificationBuilder_ == null) {
                    this.metricsNotificationBuilder_ = new SingleFieldBuilderV3<>(getMetricsNotification(), getParentForChildren(), isClean());
                    this.metricsNotification_ = null;
                }
                return this.metricsNotificationBuilder_;
            }

            private SingleFieldBuilderV3<ReferenceBarometerStatusNotification, ReferenceBarometerStatusNotification.Builder, ReferenceBarometerStatusNotificationOrBuilder> getRefBaroStatusNotificationFieldBuilder() {
                if (this.refBaroStatusNotificationBuilder_ == null) {
                    this.refBaroStatusNotificationBuilder_ = new SingleFieldBuilderV3<>(getRefBaroStatusNotification(), getParentForChildren(), isClean());
                    this.refBaroStatusNotification_ = null;
                }
                return this.refBaroStatusNotificationBuilder_;
            }

            private SingleFieldBuilderV3<StateNotification, StateNotification.Builder, StateNotificationOrBuilder> getStateNotificationFieldBuilder() {
                if (this.stateNotificationBuilder_ == null) {
                    this.stateNotificationBuilder_ = new SingleFieldBuilderV3<>(getStateNotification(), getParentForChildren(), isClean());
                    this.stateNotification_ = null;
                }
                return this.stateNotificationBuilder_;
            }

            private SingleFieldBuilderV3<ToneNotification, ToneNotification.Builder, ToneNotificationOrBuilder> getToneNotificationFieldBuilder() {
                if (this.toneNotificationBuilder_ == null) {
                    this.toneNotificationBuilder_ = new SingleFieldBuilderV3<>(getToneNotification(), getParentForChildren(), isClean());
                    this.toneNotification_ = null;
                }
                return this.toneNotificationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getAutoSetNotificationFieldBuilder();
                    getStateNotificationFieldBuilder();
                    getMetricsNotificationFieldBuilder();
                    getToneNotificationFieldBuilder();
                    getRefBaroStatusNotificationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public XcelStrengthEventNotification build() {
                XcelStrengthEventNotification xcelStrengthEventNotificationBuildPartial = buildPartial();
                if (xcelStrengthEventNotificationBuildPartial.isInitialized()) {
                    return xcelStrengthEventNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) xcelStrengthEventNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public XcelStrengthEventNotification buildPartial() {
                XcelStrengthEventNotification xcelStrengthEventNotification = new XcelStrengthEventNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(xcelStrengthEventNotification);
                }
                onBuilt();
                return xcelStrengthEventNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.autoSetNotification_ = null;
                SingleFieldBuilderV3<AutoSetEventNotification, AutoSetEventNotification.Builder, AutoSetEventNotificationOrBuilder> singleFieldBuilderV3 = this.autoSetNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.autoSetNotificationBuilder_ = null;
                }
                this.stateNotification_ = null;
                SingleFieldBuilderV3<StateNotification, StateNotification.Builder, StateNotificationOrBuilder> singleFieldBuilderV4 = this.stateNotificationBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.stateNotificationBuilder_ = null;
                }
                this.metricsNotification_ = null;
                SingleFieldBuilderV3<MetricsNotification, MetricsNotification.Builder, MetricsNotificationOrBuilder> singleFieldBuilderV5 = this.metricsNotificationBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.metricsNotificationBuilder_ = null;
                }
                this.toneNotification_ = null;
                SingleFieldBuilderV3<ToneNotification, ToneNotification.Builder, ToneNotificationOrBuilder> singleFieldBuilderV6 = this.toneNotificationBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.toneNotificationBuilder_ = null;
                }
                this.refBaroStatusNotification_ = null;
                SingleFieldBuilderV3<ReferenceBarometerStatusNotification, ReferenceBarometerStatusNotification.Builder, ReferenceBarometerStatusNotificationOrBuilder> singleFieldBuilderV7 = this.refBaroStatusNotificationBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.refBaroStatusNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearAutoSetNotification() {
                this.bitField0_ &= -2;
                this.autoSetNotification_ = null;
                SingleFieldBuilderV3<AutoSetEventNotification, AutoSetEventNotification.Builder, AutoSetEventNotificationOrBuilder> singleFieldBuilderV3 = this.autoSetNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.autoSetNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMetricsNotification() {
                this.bitField0_ &= -5;
                this.metricsNotification_ = null;
                SingleFieldBuilderV3<MetricsNotification, MetricsNotification.Builder, MetricsNotificationOrBuilder> singleFieldBuilderV3 = this.metricsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.metricsNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearRefBaroStatusNotification() {
                this.bitField0_ &= -17;
                this.refBaroStatusNotification_ = null;
                SingleFieldBuilderV3<ReferenceBarometerStatusNotification, ReferenceBarometerStatusNotification.Builder, ReferenceBarometerStatusNotificationOrBuilder> singleFieldBuilderV3 = this.refBaroStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.refBaroStatusNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStateNotification() {
                this.bitField0_ &= -3;
                this.stateNotification_ = null;
                SingleFieldBuilderV3<StateNotification, StateNotification.Builder, StateNotificationOrBuilder> singleFieldBuilderV3 = this.stateNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stateNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearToneNotification() {
                this.bitField0_ &= -9;
                this.toneNotification_ = null;
                SingleFieldBuilderV3<ToneNotification, ToneNotification.Builder, ToneNotificationOrBuilder> singleFieldBuilderV3 = this.toneNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.toneNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
            public AutoSetEventNotification getAutoSetNotification() {
                SingleFieldBuilderV3<AutoSetEventNotification, AutoSetEventNotification.Builder, AutoSetEventNotificationOrBuilder> singleFieldBuilderV3 = this.autoSetNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AutoSetEventNotification) singleFieldBuilderV3.getMessage();
                }
                AutoSetEventNotification autoSetEventNotification = this.autoSetNotification_;
                return autoSetEventNotification == null ? AutoSetEventNotification.getDefaultInstance() : autoSetEventNotification;
            }

            public AutoSetEventNotification.Builder getAutoSetNotificationBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (AutoSetEventNotification.Builder) getAutoSetNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
            public AutoSetEventNotificationOrBuilder getAutoSetNotificationOrBuilder() {
                SingleFieldBuilderV3<AutoSetEventNotification, AutoSetEventNotification.Builder, AutoSetEventNotificationOrBuilder> singleFieldBuilderV3 = this.autoSetNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AutoSetEventNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AutoSetEventNotification autoSetEventNotification = this.autoSetNotification_;
                return autoSetEventNotification == null ? AutoSetEventNotification.getDefaultInstance() : autoSetEventNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_XcelStrengthEventNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
            public MetricsNotification getMetricsNotification() {
                SingleFieldBuilderV3<MetricsNotification, MetricsNotification.Builder, MetricsNotificationOrBuilder> singleFieldBuilderV3 = this.metricsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MetricsNotification) singleFieldBuilderV3.getMessage();
                }
                MetricsNotification metricsNotification = this.metricsNotification_;
                return metricsNotification == null ? MetricsNotification.getDefaultInstance() : metricsNotification;
            }

            public MetricsNotification.Builder getMetricsNotificationBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (MetricsNotification.Builder) getMetricsNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
            public MetricsNotificationOrBuilder getMetricsNotificationOrBuilder() {
                SingleFieldBuilderV3<MetricsNotification, MetricsNotification.Builder, MetricsNotificationOrBuilder> singleFieldBuilderV3 = this.metricsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MetricsNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                MetricsNotification metricsNotification = this.metricsNotification_;
                return metricsNotification == null ? MetricsNotification.getDefaultInstance() : metricsNotification;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
            public ReferenceBarometerStatusNotification getRefBaroStatusNotification() {
                SingleFieldBuilderV3<ReferenceBarometerStatusNotification, ReferenceBarometerStatusNotification.Builder, ReferenceBarometerStatusNotificationOrBuilder> singleFieldBuilderV3 = this.refBaroStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ReferenceBarometerStatusNotification) singleFieldBuilderV3.getMessage();
                }
                ReferenceBarometerStatusNotification referenceBarometerStatusNotification = this.refBaroStatusNotification_;
                return referenceBarometerStatusNotification == null ? ReferenceBarometerStatusNotification.getDefaultInstance() : referenceBarometerStatusNotification;
            }

            public ReferenceBarometerStatusNotification.Builder getRefBaroStatusNotificationBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (ReferenceBarometerStatusNotification.Builder) getRefBaroStatusNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
            public ReferenceBarometerStatusNotificationOrBuilder getRefBaroStatusNotificationOrBuilder() {
                SingleFieldBuilderV3<ReferenceBarometerStatusNotification, ReferenceBarometerStatusNotification.Builder, ReferenceBarometerStatusNotificationOrBuilder> singleFieldBuilderV3 = this.refBaroStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ReferenceBarometerStatusNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ReferenceBarometerStatusNotification referenceBarometerStatusNotification = this.refBaroStatusNotification_;
                return referenceBarometerStatusNotification == null ? ReferenceBarometerStatusNotification.getDefaultInstance() : referenceBarometerStatusNotification;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
            public StateNotification getStateNotification() {
                SingleFieldBuilderV3<StateNotification, StateNotification.Builder, StateNotificationOrBuilder> singleFieldBuilderV3 = this.stateNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StateNotification) singleFieldBuilderV3.getMessage();
                }
                StateNotification stateNotification = this.stateNotification_;
                return stateNotification == null ? StateNotification.getDefaultInstance() : stateNotification;
            }

            public StateNotification.Builder getStateNotificationBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (StateNotification.Builder) getStateNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
            public StateNotificationOrBuilder getStateNotificationOrBuilder() {
                SingleFieldBuilderV3<StateNotification, StateNotification.Builder, StateNotificationOrBuilder> singleFieldBuilderV3 = this.stateNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StateNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StateNotification stateNotification = this.stateNotification_;
                return stateNotification == null ? StateNotification.getDefaultInstance() : stateNotification;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
            public ToneNotification getToneNotification() {
                SingleFieldBuilderV3<ToneNotification, ToneNotification.Builder, ToneNotificationOrBuilder> singleFieldBuilderV3 = this.toneNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ToneNotification) singleFieldBuilderV3.getMessage();
                }
                ToneNotification toneNotification = this.toneNotification_;
                return toneNotification == null ? ToneNotification.getDefaultInstance() : toneNotification;
            }

            public ToneNotification.Builder getToneNotificationBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (ToneNotification.Builder) getToneNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
            public ToneNotificationOrBuilder getToneNotificationOrBuilder() {
                SingleFieldBuilderV3<ToneNotification, ToneNotification.Builder, ToneNotificationOrBuilder> singleFieldBuilderV3 = this.toneNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ToneNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ToneNotification toneNotification = this.toneNotification_;
                return toneNotification == null ? ToneNotification.getDefaultInstance() : toneNotification;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
            public boolean hasAutoSetNotification() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
            public boolean hasMetricsNotification() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
            public boolean hasRefBaroStatusNotification() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
            public boolean hasStateNotification() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrength.XcelStrengthEventNotificationOrBuilder
            public boolean hasToneNotification() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrength.internal_static_GDI_Proto_XcelStrength_XcelStrengthEventNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(XcelStrengthEventNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAutoSetNotification(AutoSetEventNotification autoSetEventNotification) {
                AutoSetEventNotification autoSetEventNotification2;
                SingleFieldBuilderV3<AutoSetEventNotification, AutoSetEventNotification.Builder, AutoSetEventNotificationOrBuilder> singleFieldBuilderV3 = this.autoSetNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(autoSetEventNotification);
                } else if ((this.bitField0_ & 1) == 0 || (autoSetEventNotification2 = this.autoSetNotification_) == null || autoSetEventNotification2 == AutoSetEventNotification.getDefaultInstance()) {
                    this.autoSetNotification_ = autoSetEventNotification;
                } else {
                    getAutoSetNotificationBuilder().mergeFrom(autoSetEventNotification);
                }
                if (this.autoSetNotification_ != null) {
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
                                    codedInputStream.readMessage(getAutoSetNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getStateNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getMetricsNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getToneNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getRefBaroStatusNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeMetricsNotification(MetricsNotification metricsNotification) {
                MetricsNotification metricsNotification2;
                SingleFieldBuilderV3<MetricsNotification, MetricsNotification.Builder, MetricsNotificationOrBuilder> singleFieldBuilderV3 = this.metricsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(metricsNotification);
                } else if ((this.bitField0_ & 4) == 0 || (metricsNotification2 = this.metricsNotification_) == null || metricsNotification2 == MetricsNotification.getDefaultInstance()) {
                    this.metricsNotification_ = metricsNotification;
                } else {
                    getMetricsNotificationBuilder().mergeFrom(metricsNotification);
                }
                if (this.metricsNotification_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRefBaroStatusNotification(ReferenceBarometerStatusNotification referenceBarometerStatusNotification) {
                ReferenceBarometerStatusNotification referenceBarometerStatusNotification2;
                SingleFieldBuilderV3<ReferenceBarometerStatusNotification, ReferenceBarometerStatusNotification.Builder, ReferenceBarometerStatusNotificationOrBuilder> singleFieldBuilderV3 = this.refBaroStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(referenceBarometerStatusNotification);
                } else if ((this.bitField0_ & 16) == 0 || (referenceBarometerStatusNotification2 = this.refBaroStatusNotification_) == null || referenceBarometerStatusNotification2 == ReferenceBarometerStatusNotification.getDefaultInstance()) {
                    this.refBaroStatusNotification_ = referenceBarometerStatusNotification;
                } else {
                    getRefBaroStatusNotificationBuilder().mergeFrom(referenceBarometerStatusNotification);
                }
                if (this.refBaroStatusNotification_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStateNotification(StateNotification stateNotification) {
                StateNotification stateNotification2;
                SingleFieldBuilderV3<StateNotification, StateNotification.Builder, StateNotificationOrBuilder> singleFieldBuilderV3 = this.stateNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stateNotification);
                } else if ((this.bitField0_ & 2) == 0 || (stateNotification2 = this.stateNotification_) == null || stateNotification2 == StateNotification.getDefaultInstance()) {
                    this.stateNotification_ = stateNotification;
                } else {
                    getStateNotificationBuilder().mergeFrom(stateNotification);
                }
                if (this.stateNotification_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeToneNotification(ToneNotification toneNotification) {
                ToneNotification toneNotification2;
                SingleFieldBuilderV3<ToneNotification, ToneNotification.Builder, ToneNotificationOrBuilder> singleFieldBuilderV3 = this.toneNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(toneNotification);
                } else if ((this.bitField0_ & 8) == 0 || (toneNotification2 = this.toneNotification_) == null || toneNotification2 == ToneNotification.getDefaultInstance()) {
                    this.toneNotification_ = toneNotification;
                } else {
                    getToneNotificationBuilder().mergeFrom(toneNotification);
                }
                if (this.toneNotification_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAutoSetNotification(AutoSetEventNotification.Builder builder) {
                SingleFieldBuilderV3<AutoSetEventNotification, AutoSetEventNotification.Builder, AutoSetEventNotificationOrBuilder> singleFieldBuilderV3 = this.autoSetNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.autoSetNotification_ = builder.build();
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

            public Builder setMetricsNotification(MetricsNotification.Builder builder) {
                SingleFieldBuilderV3<MetricsNotification, MetricsNotification.Builder, MetricsNotificationOrBuilder> singleFieldBuilderV3 = this.metricsNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.metricsNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setRefBaroStatusNotification(ReferenceBarometerStatusNotification.Builder builder) {
                SingleFieldBuilderV3<ReferenceBarometerStatusNotification, ReferenceBarometerStatusNotification.Builder, ReferenceBarometerStatusNotificationOrBuilder> singleFieldBuilderV3 = this.refBaroStatusNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.refBaroStatusNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStateNotification(StateNotification.Builder builder) {
                SingleFieldBuilderV3<StateNotification, StateNotification.Builder, StateNotificationOrBuilder> singleFieldBuilderV3 = this.stateNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.stateNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setToneNotification(ToneNotification.Builder builder) {
                SingleFieldBuilderV3<ToneNotification, ToneNotification.Builder, ToneNotificationOrBuilder> singleFieldBuilderV3 = this.toneNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.toneNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public XcelStrengthEventNotification getDefaultInstanceForType() {
                return XcelStrengthEventNotification.getDefaultInstance();
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

            public Builder setAutoSetNotification(AutoSetEventNotification autoSetEventNotification) {
                SingleFieldBuilderV3<AutoSetEventNotification, AutoSetEventNotification.Builder, AutoSetEventNotificationOrBuilder> singleFieldBuilderV3 = this.autoSetNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    autoSetEventNotification.getClass();
                    this.autoSetNotification_ = autoSetEventNotification;
                } else {
                    singleFieldBuilderV3.setMessage(autoSetEventNotification);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMetricsNotification(MetricsNotification metricsNotification) {
                SingleFieldBuilderV3<MetricsNotification, MetricsNotification.Builder, MetricsNotificationOrBuilder> singleFieldBuilderV3 = this.metricsNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    metricsNotification.getClass();
                    this.metricsNotification_ = metricsNotification;
                } else {
                    singleFieldBuilderV3.setMessage(metricsNotification);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setRefBaroStatusNotification(ReferenceBarometerStatusNotification referenceBarometerStatusNotification) {
                SingleFieldBuilderV3<ReferenceBarometerStatusNotification, ReferenceBarometerStatusNotification.Builder, ReferenceBarometerStatusNotificationOrBuilder> singleFieldBuilderV3 = this.refBaroStatusNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    referenceBarometerStatusNotification.getClass();
                    this.refBaroStatusNotification_ = referenceBarometerStatusNotification;
                } else {
                    singleFieldBuilderV3.setMessage(referenceBarometerStatusNotification);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setStateNotification(StateNotification stateNotification) {
                SingleFieldBuilderV3<StateNotification, StateNotification.Builder, StateNotificationOrBuilder> singleFieldBuilderV3 = this.stateNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stateNotification.getClass();
                    this.stateNotification_ = stateNotification;
                } else {
                    singleFieldBuilderV3.setMessage(stateNotification);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setToneNotification(ToneNotification toneNotification) {
                SingleFieldBuilderV3<ToneNotification, ToneNotification.Builder, ToneNotificationOrBuilder> singleFieldBuilderV3 = this.toneNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    toneNotification.getClass();
                    this.toneNotification_ = toneNotification;
                } else {
                    singleFieldBuilderV3.setMessage(toneNotification);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof XcelStrengthEventNotification) {
                    return mergeFrom((XcelStrengthEventNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(XcelStrengthEventNotification xcelStrengthEventNotification) {
                if (xcelStrengthEventNotification == XcelStrengthEventNotification.getDefaultInstance()) {
                    return this;
                }
                if (xcelStrengthEventNotification.hasAutoSetNotification()) {
                    mergeAutoSetNotification(xcelStrengthEventNotification.getAutoSetNotification());
                }
                if (xcelStrengthEventNotification.hasStateNotification()) {
                    mergeStateNotification(xcelStrengthEventNotification.getStateNotification());
                }
                if (xcelStrengthEventNotification.hasMetricsNotification()) {
                    mergeMetricsNotification(xcelStrengthEventNotification.getMetricsNotification());
                }
                if (xcelStrengthEventNotification.hasToneNotification()) {
                    mergeToneNotification(xcelStrengthEventNotification.getToneNotification());
                }
                if (xcelStrengthEventNotification.hasRefBaroStatusNotification()) {
                    mergeRefBaroStatusNotification(xcelStrengthEventNotification.getRefBaroStatusNotification());
                }
                mergeUnknownFields(xcelStrengthEventNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public XcelStrengthEventNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ XcelStrengthEventNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private XcelStrengthEventNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static XcelStrengthEventNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (XcelStrengthEventNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static XcelStrengthEventNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static XcelStrengthEventNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static XcelStrengthEventNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static XcelStrengthEventNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static XcelStrengthEventNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static XcelStrengthEventNotification parseFrom(InputStream inputStream) {
            return (XcelStrengthEventNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static XcelStrengthEventNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (XcelStrengthEventNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static XcelStrengthEventNotification parseFrom(CodedInputStream codedInputStream) {
            return (XcelStrengthEventNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static XcelStrengthEventNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (XcelStrengthEventNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public enum SetType implements ProtocolMessageEnum {
        SET_TYPE_UNKNOWN(0),
        Rest(1),
        Active(2);

        public static final int Active_VALUE = 2;
        public static final int Rest_VALUE = 1;
        public static final int SET_TYPE_UNKNOWN_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<SetType> internalValueMap = new Internal.EnumLiteMap<SetType>() { // from class: com.garmin.proto.generated.GDIXcelStrength.SetType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SetType findValueByNumber(int i14) {
                return SetType.forNumber(i14);
            }
        };
        private static final SetType[] VALUES = values();

        SetType(int i14) {
            this.value = i14;
        }

        public static SetType forNumber(int i14) {
            if (i14 == 0) {
                return SET_TYPE_UNKNOWN;
            }
            if (i14 == 1) {
                return Rest;
            }
            if (i14 != 2) {
                return null;
            }
            return Active;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIXcelStrength.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<SetType> internalGetValueMap() {
            return internalValueMap;
        }

        public static SetType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static SetType valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
