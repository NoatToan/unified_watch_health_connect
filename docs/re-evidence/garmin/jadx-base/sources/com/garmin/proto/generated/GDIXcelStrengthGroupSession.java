package com.garmin.proto.generated;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
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
import okhttp3.internal.http2.Http2Connection;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public final class GDIXcelStrengthGroupSession {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n!GDIXcelStrengthGroupSession.proto\u0012\"GDI.Proto.XcelStrengthGroupSession\"æ\u0007\n\u0007Service\u0012T\n\u0014state_change_request\u0018\u0001 \u0001(\u000b26.GDI.Proto.XcelStrengthGroupSession.StateChangeRequest\u0012V\n\u0015state_change_response\u0018\u0002 \u0001(\u000b27.GDI.Proto.XcelStrengthGroupSession.StateChangeResponse\u0012Z\n\u0017station_setting_request\u0018\u0003 \u0001(\u000b29.GDI.Proto.XcelStrengthGroupSession.StationSettingRequest\u0012\\\n\u0018station_setting_response\u0018\u0004 \u0001(\u000b2:.GDI.Proto.XcelStrengthGroupSession.StationSettingResponse\u0012d\n\u001cstation_setting_notification\u0018\u0005 \u0001(\u000b2>.GDI.Proto.XcelStrengthGroupSession.StationSettingNotification\u0012P\n\u0012group_list_request\u0018\u0006 \u0001(\u000b24.GDI.Proto.XcelStrengthGroupSession.GroupListRequest\u0012R\n\u0013group_list_response\u0018\u0007 \u0001(\u000b25.GDI.Proto.XcelStrengthGroupSession.GroupListResponse\u0012U\n\u0014metrics_notification\u0018\b \u0001(\u000b27.GDI.Proto.XcelStrengthGroupSession.MetricsNotification\u0012X\n\u0016set_start_notification\u0018\t \u0001(\u000b28.GDI.Proto.XcelStrengthGroupSession.SetStartNotification\u0012T\n\u0014set_end_notification\u0018\n \u0001(\u000b26.GDI.Proto.XcelStrengthGroupSession.SetEndNotification\u0012`\n\u001adisplay_state_notification\u0018\u000b \u0001(\u000b2<.GDI.Proto.XcelStrengthGroupSession.DisplayStateNotification\"Ö\u0001\n\u0012StateChangeRequest\u0012R\n\u0006change\u0018\u0001 \u0001(\u000e2B.GDI.Proto.XcelStrengthGroupSession.StateChangeRequest.StateChange\u0012\u0012\n\nsession_id\u0018\u0002 \u0001(\r\"X\n\u000bStateChange\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\t\n\u0005SETUP\u0010\u0001\u0012\u0011\n\rINITIAL_START\u0010\u0002\u0012\t\n\u0005PAUSE\u0010\u0003\u0012\n\n\u0006RESUME\u0010\u0004\u0012\u0007\n\u0003END\u0010\u0005\"§\u0001\n\u0013StateChangeResponse\u0012V\n\u0007failure\u0018\u0001 \u0001(\u000e2E.GDI.Proto.XcelStrengthGroupSession.StateChangeResponse.FailureReason\"8\n\rFailureReason\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\r\n\tNO_CHANGE\u0010\u0001\u0012\u000b\n\u0007INVALID\u0010\u0002\"é\u0001\n\u0018DisplayStateNotification\u0012X\n\u0005state\u0018\u0001 \u0001(\u000e2I.GDI.Proto.XcelStrengthGroupSession.DisplayStateNotification.DisplayState\u0012\u0012\n\nsession_id\u0018\u0002 \u0001(\r\"_\n\fDisplayState\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\b\n\u0004IDLE\u0010\u0001\u0012\t\n\u0005SETUP\u0010\u0002\u0012\t\n\u0005READY\u0010\u0003\u0012\n\n\u0006ACTIVE\u0010\u0004\u0012\n\n\u0006PAUSED\u0010\u0005\u0012\n\n\u0006ENDING\u0010\u0006\"9\n\rVelocityRange\u0012\u0013\n\u000bmin_m_per_s\u0018\u0001 \u0001(\u0002\u0012\u0013\n\u000bmax_m_per_s\u0018\u0002 \u0001(\u0002\"ö\u0003\n\tVbtTarget\u0012Q\n\u0012mean_velocity_zone\u0018\u0001 \u0001(\u000e25.GDI.Proto.XcelStrengthGroupSession.VbtTarget.VbtZone\u0012%\n\u001dmean_velocity_loss_percentage\u0018\u0002 \u0001(\r\u0012N\n\u0013mean_velocity_range\u0018\u0003 \u0001(\u000b21.GDI.Proto.XcelStrengthGroupSession.VelocityRange\u0012%\n\u001dpeak_velocity_loss_percentage\u0018\u0004 \u0001(\r\u0012N\n\u0013peak_velocity_range\u0018\u0005 \u0001(\u000b21.GDI.Proto.XcelStrengthGroupSession.VelocityRange\u0012\"\n\u001amean_power_loss_percentage\u0018\u0006 \u0001(\r\"\u0083\u0001\n\u0007VbtZone\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0010\n\fMAX_STRENGTH\u0010\u0001\u0012\u0019\n\u0015ACCELERATIVE_STRENGTH\u0010\u0002\u0012\u0012\n\u000eSTRENGTH_SEPED\u0010\u0003\u0012\u0012\n\u000eSPEED_STRENGTH\u0010\u0004\u0012\u0016\n\u0012STRARTING_STRENGTH\u0010\u0005\"$\n\bRepRange\u0012\u000b\n\u0003min\u0018\u0001 \u0001(\r\u0012\u000b\n\u0003max\u0018\u0002 \u0001(\r\"¾\u0002\n\u000fStationSettings\u0012\u0019\n\u0011exercise_category\u0018\u0001 \u0001(\r\u0012\u001c\n\u0014exercise_subcategory\u0018\u0002 \u0001(\r\u0012A\n\nvbt_target\u0018\u0003 \u0001(\u000b2-.GDI.Proto.XcelStrengthGroupSession.VbtTarget\u0012@\n\nrep_target\u0018\u0004 \u0001(\u000b2,.GDI.Proto.XcelStrengthGroupSession.RepRange\u0012\u0012\n\nduration_s\u0018\u0005 \u0001(\r\u0012\u0013\n\u000bload_target\u0018\u0006 \u0001(\r\u0012\u0013\n\u000bunlock_mode\u0018\u0007 \u0001(\b\u0012\u0019\n\u0011working_weight_kg\u0018\b \u0001(\u0002\u0012\u0014\n\fstation_name\u0018\t \u0001(\t\"^\n\u0015StationSettingRequest\u0012E\n\bsettings\u0018\u0001 \u0001(\u000b23.GDI.Proto.XcelStrengthGroupSession.StationSettings\"p\n\u0016StationSettingResponse\u0012\u000f\n\u0007success\u0018\u0001 \u0001(\b\u0012E\n\bsettings\u0018\u0002 \u0001(\u000b23.GDI.Proto.XcelStrengthGroupSession.StationSettings\"c\n\u001aStationSettingNotification\u0012E\n\bsettings\u0018\u0001 \u0001(\u000b23.GDI.Proto.XcelStrengthGroupSession.StationSettings\"^\n\rOneRepMaxData\u0012\u0019\n\u0011exercise_category\u0018\u0001 \u0001(\r\u0012\u001c\n\u0014exercise_subcategory\u0018\u0002 \u0001(\r\u0012\u0014\n\fweight_in_kg\u0018\u0003 \u0001(\u0002\"u\n\u000bAthleteData\u0012\n\n\u0002id\u0018\u0001 \u0001(\r\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012L\n\u0011one_rep_max_datas\u0018\u0003 \u0003(\u000b21.GDI.Proto.XcelStrengthGroupSession.OneRepMaxData\"h\n\tGroupData\u0012\n\n\u0002id\u0018\u0001 \u0001(\r\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012A\n\bathletes\u0018\u0003 \u0003(\u000b2/.GDI.Proto.XcelStrengthGroupSession.AthleteData\"Q\n\u0010GroupListRequest\u0012=\n\u0006groups\u0018\u0001 \u0003(\u000b2-.GDI.Proto.XcelStrengthGroupSession.GroupData\"$\n\u0011GroupListResponse\u0012\u000f\n\u0007success\u0018\u0001 \u0001(\b\"k\n\u0014SetStartNotification\u0012\u0010\n\bgroup_id\u0018\u0001 \u0001(\r\u0012\u0012\n\nathlete_id\u0018\u0002 \u0001(\r\u0012\u0012\n\nset_number\u0018\u0003 \u0001(\r\u0012\u0019\n\u0011working_weight_kg\u0018\u0004 \u0001(\u0002\"}\n\u0012SetEndNotification\u0012\u0010\n\bgroup_id\u0018\u0001 \u0001(\r\u0012\u0012\n\nathlete_id\u0018\u0002 \u0001(\r\u0012\u0012\n\nset_number\u0018\u0003 \u0001(\r\u0012\u0012\n\ntotal_reps\u0018\u0004 \u0001(\r\u0012\u0019\n\u0011working_weight_kg\u0018\u0005 \u0001(\u0002\"¼\u0006\n\u0013MetricsNotification\u0012\u0010\n\bgroup_id\u0018\u0001 \u0001(\r\u0012\u0012\n\nathlete_id\u0018\u0002 \u0001(\r\u0012\u0012\n\nset_number\u0018\u0003 \u0001(\r\u0012\u0012\n\nrep_number\u0018\u0004 \u0001(\r\u0012\u001d\n\u0015mean_vel_m_per_s_x100\u0018\u0005 \u0001(\r\u0012\u001d\n\u0015peak_vel_m_per_s_x100\u0018\u0006 \u0001(\r\u0012$\n\u001cmean_propul_vel_m_per_s_x100\u0018\u0007 \u0001(\r\u0012\u001c\n\u0014duration_second_x100\u0018\b \u0001(\r\u0012\u0013\n\u000brom_cm_x100\u0018\t \u0001(\r\u0012\u0017\n\u000fpeak_power_watt\u0018\n \u0001(\u0002\u0012\u0017\n\u000fmean_power_watt\u0018\u000b \u0001(\u0002\u0012\u0017\n\u000fbar_path_points\u0018\f \u0003(\u0005\u0012!\n\u0019ecc_mean_vel_m_per_s_x100\u0018\r \u0001(\r\u0012!\n\u0019ecc_peak_vel_m_per_s_x100\u0018\u000e \u0001(\r\u0012 \n\u0018ecc_duration_second_x100\u0018\u000f \u0001(\r\u0012\u0017\n\u000fecc_rom_cm_x100\u0018\u0010 \u0001(\r\u0012!\n\u0019avg_mean_vel_m_per_s_x100\u0018\u0011 \u0001(\r\u0012!\n\u0019avg_peak_vel_m_per_s_x100\u0018\u0012 \u0001(\r\u0012(\n avg_mean_propul_vel_m_per_s_x100\u0018\u0013 \u0001(\r\u0012 \n\u0018avg_duration_second_x100\u0018\u0014 \u0001(\r\u0012\u0017\n\u000favg_rom_cm_x100\u0018\u0015 \u0001(\r\u0012\u001b\n\u0013avg_peak_power_watt\u0018\u0016 \u0001(\u0002\u0012\u001b\n\u0013avg_mean_power_watt\u0018\u0017 \u0001(\u0002\u0012%\n\u001davg_ecc_mean_vel_m_per_s_x100\u0018\u0018 \u0001(\r\u0012%\n\u001davg_ecc_peak_vel_m_per_s_x100\u0018\u0019 \u0001(\r\u0012$\n\u001cavg_ecc_duration_second_x100\u0018\u001a \u0001(\r\u0012\u001b\n\u0013avg_ecc_rom_cm_x100\u0018\u001b \u0001(\rB;\n\u001acom.garmin.proto.generatedB\u001bGDIXcelStrengthGroupSessionH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrengthGroupSession_AthleteData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrengthGroupSession_AthleteData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrengthGroupSession_DisplayStateNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrengthGroupSession_DisplayStateNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrengthGroupSession_GroupData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrengthGroupSession_GroupData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrengthGroupSession_GroupListRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrengthGroupSession_GroupListRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrengthGroupSession_GroupListResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrengthGroupSession_GroupListResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrengthGroupSession_MetricsNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrengthGroupSession_MetricsNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrengthGroupSession_OneRepMaxData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrengthGroupSession_OneRepMaxData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrengthGroupSession_RepRange_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrengthGroupSession_RepRange_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrengthGroupSession_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrengthGroupSession_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrengthGroupSession_SetEndNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrengthGroupSession_SetEndNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrengthGroupSession_SetStartNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrengthGroupSession_SetStartNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrengthGroupSession_StateChangeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrengthGroupSession_StateChangeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrengthGroupSession_StateChangeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrengthGroupSession_StateChangeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettings_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettings_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrengthGroupSession_VbtTarget_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrengthGroupSession_VbtTarget_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XcelStrengthGroupSession_VelocityRange_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XcelStrengthGroupSession_VelocityRange_fieldAccessorTable;

    public interface AthleteDataOrBuilder extends MessageOrBuilder {
        int getId();

        String getName();

        ByteString getNameBytes();

        OneRepMaxData getOneRepMaxDatas(int i14);

        int getOneRepMaxDatasCount();

        List<OneRepMaxData> getOneRepMaxDatasList();

        OneRepMaxDataOrBuilder getOneRepMaxDatasOrBuilder(int i14);

        List<? extends OneRepMaxDataOrBuilder> getOneRepMaxDatasOrBuilderList();

        boolean hasId();

        boolean hasName();
    }

    public interface DisplayStateNotificationOrBuilder extends MessageOrBuilder {
        int getSessionId();

        DisplayStateNotification.DisplayState getState();

        boolean hasSessionId();

        boolean hasState();
    }

    public interface GroupDataOrBuilder extends MessageOrBuilder {
        AthleteData getAthletes(int i14);

        int getAthletesCount();

        List<AthleteData> getAthletesList();

        AthleteDataOrBuilder getAthletesOrBuilder(int i14);

        List<? extends AthleteDataOrBuilder> getAthletesOrBuilderList();

        int getId();

        String getName();

        ByteString getNameBytes();

        boolean hasId();

        boolean hasName();
    }

    public interface GroupListRequestOrBuilder extends MessageOrBuilder {
        GroupData getGroups(int i14);

        int getGroupsCount();

        List<GroupData> getGroupsList();

        GroupDataOrBuilder getGroupsOrBuilder(int i14);

        List<? extends GroupDataOrBuilder> getGroupsOrBuilderList();
    }

    public interface GroupListResponseOrBuilder extends MessageOrBuilder {
        boolean getSuccess();

        boolean hasSuccess();
    }

    public interface MetricsNotificationOrBuilder extends MessageOrBuilder {
        int getAthleteId();

        int getAvgDurationSecondX100();

        int getAvgEccDurationSecondX100();

        int getAvgEccMeanVelMPerSX100();

        int getAvgEccPeakVelMPerSX100();

        int getAvgEccRomCmX100();

        float getAvgMeanPowerWatt();

        int getAvgMeanPropulVelMPerSX100();

        int getAvgMeanVelMPerSX100();

        float getAvgPeakPowerWatt();

        int getAvgPeakVelMPerSX100();

        int getAvgRomCmX100();

        int getBarPathPoints(int i14);

        int getBarPathPointsCount();

        List<Integer> getBarPathPointsList();

        int getDurationSecondX100();

        int getEccDurationSecondX100();

        int getEccMeanVelMPerSX100();

        int getEccPeakVelMPerSX100();

        int getEccRomCmX100();

        int getGroupId();

        float getMeanPowerWatt();

        int getMeanPropulVelMPerSX100();

        int getMeanVelMPerSX100();

        float getPeakPowerWatt();

        int getPeakVelMPerSX100();

        int getRepNumber();

        int getRomCmX100();

        int getSetNumber();

        boolean hasAthleteId();

        boolean hasAvgDurationSecondX100();

        boolean hasAvgEccDurationSecondX100();

        boolean hasAvgEccMeanVelMPerSX100();

        boolean hasAvgEccPeakVelMPerSX100();

        boolean hasAvgEccRomCmX100();

        boolean hasAvgMeanPowerWatt();

        boolean hasAvgMeanPropulVelMPerSX100();

        boolean hasAvgMeanVelMPerSX100();

        boolean hasAvgPeakPowerWatt();

        boolean hasAvgPeakVelMPerSX100();

        boolean hasAvgRomCmX100();

        boolean hasDurationSecondX100();

        boolean hasEccDurationSecondX100();

        boolean hasEccMeanVelMPerSX100();

        boolean hasEccPeakVelMPerSX100();

        boolean hasEccRomCmX100();

        boolean hasGroupId();

        boolean hasMeanPowerWatt();

        boolean hasMeanPropulVelMPerSX100();

        boolean hasMeanVelMPerSX100();

        boolean hasPeakPowerWatt();

        boolean hasPeakVelMPerSX100();

        boolean hasRepNumber();

        boolean hasRomCmX100();

        boolean hasSetNumber();
    }

    public interface OneRepMaxDataOrBuilder extends MessageOrBuilder {
        int getExerciseCategory();

        int getExerciseSubcategory();

        float getWeightInKg();

        boolean hasExerciseCategory();

        boolean hasExerciseSubcategory();

        boolean hasWeightInKg();
    }

    public interface RepRangeOrBuilder extends MessageOrBuilder {
        int getMax();

        int getMin();

        boolean hasMax();

        boolean hasMin();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        DisplayStateNotification getDisplayStateNotification();

        DisplayStateNotificationOrBuilder getDisplayStateNotificationOrBuilder();

        GroupListRequest getGroupListRequest();

        GroupListRequestOrBuilder getGroupListRequestOrBuilder();

        GroupListResponse getGroupListResponse();

        GroupListResponseOrBuilder getGroupListResponseOrBuilder();

        MetricsNotification getMetricsNotification();

        MetricsNotificationOrBuilder getMetricsNotificationOrBuilder();

        SetEndNotification getSetEndNotification();

        SetEndNotificationOrBuilder getSetEndNotificationOrBuilder();

        SetStartNotification getSetStartNotification();

        SetStartNotificationOrBuilder getSetStartNotificationOrBuilder();

        StateChangeRequest getStateChangeRequest();

        StateChangeRequestOrBuilder getStateChangeRequestOrBuilder();

        StateChangeResponse getStateChangeResponse();

        StateChangeResponseOrBuilder getStateChangeResponseOrBuilder();

        StationSettingNotification getStationSettingNotification();

        StationSettingNotificationOrBuilder getStationSettingNotificationOrBuilder();

        StationSettingRequest getStationSettingRequest();

        StationSettingRequestOrBuilder getStationSettingRequestOrBuilder();

        StationSettingResponse getStationSettingResponse();

        StationSettingResponseOrBuilder getStationSettingResponseOrBuilder();

        boolean hasDisplayStateNotification();

        boolean hasGroupListRequest();

        boolean hasGroupListResponse();

        boolean hasMetricsNotification();

        boolean hasSetEndNotification();

        boolean hasSetStartNotification();

        boolean hasStateChangeRequest();

        boolean hasStateChangeResponse();

        boolean hasStationSettingNotification();

        boolean hasStationSettingRequest();

        boolean hasStationSettingResponse();
    }

    public interface SetEndNotificationOrBuilder extends MessageOrBuilder {
        int getAthleteId();

        int getGroupId();

        int getSetNumber();

        int getTotalReps();

        float getWorkingWeightKg();

        boolean hasAthleteId();

        boolean hasGroupId();

        boolean hasSetNumber();

        boolean hasTotalReps();

        boolean hasWorkingWeightKg();
    }

    public interface SetStartNotificationOrBuilder extends MessageOrBuilder {
        int getAthleteId();

        int getGroupId();

        int getSetNumber();

        float getWorkingWeightKg();

        boolean hasAthleteId();

        boolean hasGroupId();

        boolean hasSetNumber();

        boolean hasWorkingWeightKg();
    }

    public interface StateChangeRequestOrBuilder extends MessageOrBuilder {
        StateChangeRequest.StateChange getChange();

        int getSessionId();

        boolean hasChange();

        boolean hasSessionId();
    }

    public interface StateChangeResponseOrBuilder extends MessageOrBuilder {
        StateChangeResponse.FailureReason getFailure();

        boolean hasFailure();
    }

    public interface StationSettingNotificationOrBuilder extends MessageOrBuilder {
        StationSettings getSettings();

        StationSettingsOrBuilder getSettingsOrBuilder();

        boolean hasSettings();
    }

    public interface StationSettingRequestOrBuilder extends MessageOrBuilder {
        StationSettings getSettings();

        StationSettingsOrBuilder getSettingsOrBuilder();

        boolean hasSettings();
    }

    public interface StationSettingResponseOrBuilder extends MessageOrBuilder {
        StationSettings getSettings();

        StationSettingsOrBuilder getSettingsOrBuilder();

        boolean getSuccess();

        boolean hasSettings();

        boolean hasSuccess();
    }

    public interface StationSettingsOrBuilder extends MessageOrBuilder {
        int getDurationS();

        int getExerciseCategory();

        int getExerciseSubcategory();

        int getLoadTarget();

        RepRange getRepTarget();

        RepRangeOrBuilder getRepTargetOrBuilder();

        String getStationName();

        ByteString getStationNameBytes();

        boolean getUnlockMode();

        VbtTarget getVbtTarget();

        VbtTargetOrBuilder getVbtTargetOrBuilder();

        float getWorkingWeightKg();

        boolean hasDurationS();

        boolean hasExerciseCategory();

        boolean hasExerciseSubcategory();

        boolean hasLoadTarget();

        boolean hasRepTarget();

        boolean hasStationName();

        boolean hasUnlockMode();

        boolean hasVbtTarget();

        boolean hasWorkingWeightKg();
    }

    public interface VbtTargetOrBuilder extends MessageOrBuilder {
        int getMeanPowerLossPercentage();

        int getMeanVelocityLossPercentage();

        VelocityRange getMeanVelocityRange();

        VelocityRangeOrBuilder getMeanVelocityRangeOrBuilder();

        VbtTarget.VbtZone getMeanVelocityZone();

        int getPeakVelocityLossPercentage();

        VelocityRange getPeakVelocityRange();

        VelocityRangeOrBuilder getPeakVelocityRangeOrBuilder();

        boolean hasMeanPowerLossPercentage();

        boolean hasMeanVelocityLossPercentage();

        boolean hasMeanVelocityRange();

        boolean hasMeanVelocityZone();

        boolean hasPeakVelocityLossPercentage();

        boolean hasPeakVelocityRange();
    }

    public interface VelocityRangeOrBuilder extends MessageOrBuilder {
        float getMaxMPerS();

        float getMinMPerS();

        boolean hasMaxMPerS();

        boolean hasMinMPerS();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_XcelStrengthGroupSession_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_XcelStrengthGroupSession_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"StateChangeRequest", "StateChangeResponse", "StationSettingRequest", "StationSettingResponse", "StationSettingNotification", "GroupListRequest", "GroupListResponse", "MetricsNotification", "SetStartNotification", "SetEndNotification", "DisplayStateNotification"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_XcelStrengthGroupSession_StateChangeRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_XcelStrengthGroupSession_StateChangeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Change", "SessionId"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_XcelStrengthGroupSession_StateChangeResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_XcelStrengthGroupSession_StateChangeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Failure"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_XcelStrengthGroupSession_DisplayStateNotification_descriptor = descriptor5;
        internal_static_GDI_Proto_XcelStrengthGroupSession_DisplayStateNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"State", "SessionId"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_XcelStrengthGroupSession_VelocityRange_descriptor = descriptor6;
        internal_static_GDI_Proto_XcelStrengthGroupSession_VelocityRange_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"MinMPerS", "MaxMPerS"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_XcelStrengthGroupSession_VbtTarget_descriptor = descriptor7;
        internal_static_GDI_Proto_XcelStrengthGroupSession_VbtTarget_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"MeanVelocityZone", "MeanVelocityLossPercentage", "MeanVelocityRange", "PeakVelocityLossPercentage", "PeakVelocityRange", "MeanPowerLossPercentage"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_XcelStrengthGroupSession_RepRange_descriptor = descriptor8;
        internal_static_GDI_Proto_XcelStrengthGroupSession_RepRange_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Min", "Max"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettings_descriptor = descriptor9;
        internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"ExerciseCategory", "ExerciseSubcategory", "VbtTarget", "RepTarget", "DurationS", "LoadTarget", "UnlockMode", "WorkingWeightKg", "StationName"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingRequest_descriptor = descriptor10;
        internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Settings"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingResponse_descriptor = descriptor11;
        internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Success", "Settings"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingNotification_descriptor = descriptor12;
        internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Settings"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_XcelStrengthGroupSession_OneRepMaxData_descriptor = descriptor13;
        internal_static_GDI_Proto_XcelStrengthGroupSession_OneRepMaxData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"ExerciseCategory", "ExerciseSubcategory", "WeightInKg"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_GDI_Proto_XcelStrengthGroupSession_AthleteData_descriptor = descriptor14;
        internal_static_GDI_Proto_XcelStrengthGroupSession_AthleteData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Id", "Name", "OneRepMaxDatas"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(13);
        internal_static_GDI_Proto_XcelStrengthGroupSession_GroupData_descriptor = descriptor15;
        internal_static_GDI_Proto_XcelStrengthGroupSession_GroupData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Id", "Name", "Athletes"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(14);
        internal_static_GDI_Proto_XcelStrengthGroupSession_GroupListRequest_descriptor = descriptor16;
        internal_static_GDI_Proto_XcelStrengthGroupSession_GroupListRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Groups"});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(15);
        internal_static_GDI_Proto_XcelStrengthGroupSession_GroupListResponse_descriptor = descriptor17;
        internal_static_GDI_Proto_XcelStrengthGroupSession_GroupListResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"Success"});
        Descriptors.Descriptor descriptor18 = getDescriptor().getMessageTypes().get(16);
        internal_static_GDI_Proto_XcelStrengthGroupSession_SetStartNotification_descriptor = descriptor18;
        internal_static_GDI_Proto_XcelStrengthGroupSession_SetStartNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"GroupId", "AthleteId", "SetNumber", "WorkingWeightKg"});
        Descriptors.Descriptor descriptor19 = getDescriptor().getMessageTypes().get(17);
        internal_static_GDI_Proto_XcelStrengthGroupSession_SetEndNotification_descriptor = descriptor19;
        internal_static_GDI_Proto_XcelStrengthGroupSession_SetEndNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"GroupId", "AthleteId", "SetNumber", "TotalReps", "WorkingWeightKg"});
        Descriptors.Descriptor descriptor20 = getDescriptor().getMessageTypes().get(18);
        internal_static_GDI_Proto_XcelStrengthGroupSession_MetricsNotification_descriptor = descriptor20;
        internal_static_GDI_Proto_XcelStrengthGroupSession_MetricsNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"GroupId", "AthleteId", "SetNumber", "RepNumber", "MeanVelMPerSX100", "PeakVelMPerSX100", "MeanPropulVelMPerSX100", "DurationSecondX100", "RomCmX100", "PeakPowerWatt", "MeanPowerWatt", "BarPathPoints", "EccMeanVelMPerSX100", "EccPeakVelMPerSX100", "EccDurationSecondX100", "EccRomCmX100", "AvgMeanVelMPerSX100", "AvgPeakVelMPerSX100", "AvgMeanPropulVelMPerSX100", "AvgDurationSecondX100", "AvgRomCmX100", "AvgPeakPowerWatt", "AvgMeanPowerWatt", "AvgEccMeanVelMPerSX100", "AvgEccPeakVelMPerSX100", "AvgEccDurationSecondX100", "AvgEccRomCmX100"});
    }

    private GDIXcelStrengthGroupSession() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class GroupListResponse extends GeneratedMessageV3 implements GroupListResponseOrBuilder {
        private static final GroupListResponse DEFAULT_INSTANCE = new GroupListResponse();

        @Deprecated
        public static final Parser<GroupListResponse> PARSER = new AbstractParser<GroupListResponse>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupListResponse.1
            @Override // com.google.protobuf.Parser
            public GroupListResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GroupListResponse.newBuilder();
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

        private GroupListResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.success_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GroupListResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_GroupListResponse_descriptor;
        }

        public static Builder newBuilder(GroupListResponse groupListResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(groupListResponse);
        }

        public static GroupListResponse parseDelimitedFrom(InputStream inputStream) {
            return (GroupListResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GroupListResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GroupListResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GroupListResponse)) {
                return super.equals(obj);
            }
            GroupListResponse groupListResponse = (GroupListResponse) obj;
            if (hasSuccess() != groupListResponse.hasSuccess()) {
                return false;
            }
            return (!hasSuccess() || getSuccess() == groupListResponse.getSuccess()) && getUnknownFields().equals(groupListResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GroupListResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupListResponseOrBuilder
        public boolean getSuccess() {
            return this.success_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupListResponseOrBuilder
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
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_GroupListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GroupListResponse.class, Builder.class);
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
            return new GroupListResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GroupListResponseOrBuilder {
            private int bitField0_;
            private boolean success_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(GroupListResponse groupListResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    groupListResponse.success_ = this.success_;
                } else {
                    i14 = 0;
                }
                groupListResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_GroupListResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GroupListResponse build() {
                GroupListResponse groupListResponseBuildPartial = buildPartial();
                if (groupListResponseBuildPartial.isInitialized()) {
                    return groupListResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) groupListResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GroupListResponse buildPartial() {
                GroupListResponse groupListResponse = new GroupListResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(groupListResponse);
                }
                onBuilt();
                return groupListResponse;
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
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_GroupListResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupListResponseOrBuilder
            public boolean getSuccess() {
                return this.success_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupListResponseOrBuilder
            public boolean hasSuccess() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_GroupListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GroupListResponse.class, Builder.class);
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
            public GroupListResponse getDefaultInstanceForType() {
                return GroupListResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GroupListResponse) {
                    return mergeFrom((GroupListResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GroupListResponse groupListResponse) {
                if (groupListResponse == GroupListResponse.getDefaultInstance()) {
                    return this;
                }
                if (groupListResponse.hasSuccess()) {
                    setSuccess(groupListResponse.getSuccess());
                }
                mergeUnknownFields(groupListResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GroupListResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GroupListResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GroupListResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GroupListResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ GroupListResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GroupListResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private GroupListResponse() {
            this.success_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GroupListResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GroupListResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GroupListResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GroupListResponse parseFrom(InputStream inputStream) {
            return (GroupListResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GroupListResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GroupListResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GroupListResponse parseFrom(CodedInputStream codedInputStream) {
            return (GroupListResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GroupListResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GroupListResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OneRepMaxData extends GeneratedMessageV3 implements OneRepMaxDataOrBuilder {
        public static final int EXERCISE_CATEGORY_FIELD_NUMBER = 1;
        public static final int EXERCISE_SUBCATEGORY_FIELD_NUMBER = 2;
        public static final int WEIGHT_IN_KG_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int exerciseCategory_;
        private int exerciseSubcategory_;
        private byte memoizedIsInitialized;
        private float weightInKg_;
        private static final OneRepMaxData DEFAULT_INSTANCE = new OneRepMaxData();

        @Deprecated
        public static final Parser<OneRepMaxData> PARSER = new AbstractParser<OneRepMaxData>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.OneRepMaxData.1
            @Override // com.google.protobuf.Parser
            public OneRepMaxData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = OneRepMaxData.newBuilder();
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

        private OneRepMaxData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.exerciseCategory_ = 0;
            this.exerciseSubcategory_ = 0;
            this.weightInKg_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static OneRepMaxData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_OneRepMaxData_descriptor;
        }

        public static Builder newBuilder(OneRepMaxData oneRepMaxData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(oneRepMaxData);
        }

        public static OneRepMaxData parseDelimitedFrom(InputStream inputStream) {
            return (OneRepMaxData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static OneRepMaxData parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<OneRepMaxData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OneRepMaxData)) {
                return super.equals(obj);
            }
            OneRepMaxData oneRepMaxData = (OneRepMaxData) obj;
            if (hasExerciseCategory() != oneRepMaxData.hasExerciseCategory()) {
                return false;
            }
            if ((hasExerciseCategory() && getExerciseCategory() != oneRepMaxData.getExerciseCategory()) || hasExerciseSubcategory() != oneRepMaxData.hasExerciseSubcategory()) {
                return false;
            }
            if ((!hasExerciseSubcategory() || getExerciseSubcategory() == oneRepMaxData.getExerciseSubcategory()) && hasWeightInKg() == oneRepMaxData.hasWeightInKg()) {
                return (!hasWeightInKg() || Float.floatToIntBits(getWeightInKg()) == Float.floatToIntBits(oneRepMaxData.getWeightInKg())) && getUnknownFields().equals(oneRepMaxData.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.OneRepMaxDataOrBuilder
        public int getExerciseCategory() {
            return this.exerciseCategory_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.OneRepMaxDataOrBuilder
        public int getExerciseSubcategory() {
            return this.exerciseSubcategory_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<OneRepMaxData> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.exerciseCategory_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.exerciseSubcategory_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeFloatSize(3, this.weightInKg_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.OneRepMaxDataOrBuilder
        public float getWeightInKg() {
            return this.weightInKg_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.OneRepMaxDataOrBuilder
        public boolean hasExerciseCategory() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.OneRepMaxDataOrBuilder
        public boolean hasExerciseSubcategory() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.OneRepMaxDataOrBuilder
        public boolean hasWeightInKg() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasExerciseCategory()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getExerciseCategory();
            }
            if (hasExerciseSubcategory()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getExerciseSubcategory();
            }
            if (hasWeightInKg()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Float.floatToIntBits(getWeightInKg());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_OneRepMaxData_fieldAccessorTable.ensureFieldAccessorsInitialized(OneRepMaxData.class, Builder.class);
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
            return new OneRepMaxData();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.exerciseCategory_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.exerciseSubcategory_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeFloat(3, this.weightInKg_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OneRepMaxDataOrBuilder {
            private int bitField0_;
            private int exerciseCategory_;
            private int exerciseSubcategory_;
            private float weightInKg_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(OneRepMaxData oneRepMaxData) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    oneRepMaxData.exerciseCategory_ = this.exerciseCategory_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    oneRepMaxData.exerciseSubcategory_ = this.exerciseSubcategory_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    oneRepMaxData.weightInKg_ = this.weightInKg_;
                    i14 |= 4;
                }
                oneRepMaxData.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_OneRepMaxData_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OneRepMaxData build() {
                OneRepMaxData oneRepMaxDataBuildPartial = buildPartial();
                if (oneRepMaxDataBuildPartial.isInitialized()) {
                    return oneRepMaxDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) oneRepMaxDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OneRepMaxData buildPartial() {
                OneRepMaxData oneRepMaxData = new OneRepMaxData(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(oneRepMaxData);
                }
                onBuilt();
                return oneRepMaxData;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.exerciseCategory_ = 0;
                this.exerciseSubcategory_ = 0;
                this.weightInKg_ = 0.0f;
                return this;
            }

            public Builder clearExerciseCategory() {
                this.bitField0_ &= -2;
                this.exerciseCategory_ = 0;
                onChanged();
                return this;
            }

            public Builder clearExerciseSubcategory() {
                this.bitField0_ &= -3;
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

            public Builder clearWeightInKg() {
                this.bitField0_ &= -5;
                this.weightInKg_ = 0.0f;
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
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_OneRepMaxData_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.OneRepMaxDataOrBuilder
            public int getExerciseCategory() {
                return this.exerciseCategory_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.OneRepMaxDataOrBuilder
            public int getExerciseSubcategory() {
                return this.exerciseSubcategory_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.OneRepMaxDataOrBuilder
            public float getWeightInKg() {
                return this.weightInKg_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.OneRepMaxDataOrBuilder
            public boolean hasExerciseCategory() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.OneRepMaxDataOrBuilder
            public boolean hasExerciseSubcategory() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.OneRepMaxDataOrBuilder
            public boolean hasWeightInKg() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_OneRepMaxData_fieldAccessorTable.ensureFieldAccessorsInitialized(OneRepMaxData.class, Builder.class);
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
                                    this.exerciseCategory_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.exerciseSubcategory_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 29) {
                                    this.weightInKg_ = codedInputStream.readFloat();
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

            public Builder setExerciseCategory(int i14) {
                this.exerciseCategory_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setExerciseSubcategory(int i14) {
                this.exerciseSubcategory_ = i14;
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

            public Builder setWeightInKg(float f14) {
                this.weightInKg_ = f14;
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
            public OneRepMaxData getDefaultInstanceForType() {
                return OneRepMaxData.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof OneRepMaxData) {
                    return mergeFrom((OneRepMaxData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(OneRepMaxData oneRepMaxData) {
                if (oneRepMaxData == OneRepMaxData.getDefaultInstance()) {
                    return this;
                }
                if (oneRepMaxData.hasExerciseCategory()) {
                    setExerciseCategory(oneRepMaxData.getExerciseCategory());
                }
                if (oneRepMaxData.hasExerciseSubcategory()) {
                    setExerciseSubcategory(oneRepMaxData.getExerciseSubcategory());
                }
                if (oneRepMaxData.hasWeightInKg()) {
                    setWeightInKg(oneRepMaxData.getWeightInKg());
                }
                mergeUnknownFields(oneRepMaxData.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public OneRepMaxData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static OneRepMaxData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OneRepMaxData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OneRepMaxData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static OneRepMaxData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OneRepMaxData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static OneRepMaxData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static OneRepMaxData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static OneRepMaxData parseFrom(InputStream inputStream) {
            return (OneRepMaxData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ OneRepMaxData(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private OneRepMaxData() {
            this.exerciseCategory_ = 0;
            this.exerciseSubcategory_ = 0;
            this.weightInKg_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static OneRepMaxData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OneRepMaxData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OneRepMaxData parseFrom(CodedInputStream codedInputStream) {
            return (OneRepMaxData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static OneRepMaxData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OneRepMaxData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RepRange extends GeneratedMessageV3 implements RepRangeOrBuilder {
        public static final int MAX_FIELD_NUMBER = 2;
        public static final int MIN_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int max_;
        private byte memoizedIsInitialized;
        private int min_;
        private static final RepRange DEFAULT_INSTANCE = new RepRange();

        @Deprecated
        public static final Parser<RepRange> PARSER = new AbstractParser<RepRange>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.RepRange.1
            @Override // com.google.protobuf.Parser
            public RepRange parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RepRange.newBuilder();
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

        private RepRange(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.min_ = 0;
            this.max_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RepRange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_RepRange_descriptor;
        }

        public static Builder newBuilder(RepRange repRange) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(repRange);
        }

        public static RepRange parseDelimitedFrom(InputStream inputStream) {
            return (RepRange) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RepRange parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RepRange> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RepRange)) {
                return super.equals(obj);
            }
            RepRange repRange = (RepRange) obj;
            if (hasMin() != repRange.hasMin()) {
                return false;
            }
            if ((!hasMin() || getMin() == repRange.getMin()) && hasMax() == repRange.hasMax()) {
                return (!hasMax() || getMax() == repRange.getMax()) && getUnknownFields().equals(repRange.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.RepRangeOrBuilder
        public int getMax() {
            return this.max_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.RepRangeOrBuilder
        public int getMin() {
            return this.min_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RepRange> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.min_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.max_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.RepRangeOrBuilder
        public boolean hasMax() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.RepRangeOrBuilder
        public boolean hasMin() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMin()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getMin();
            }
            if (hasMax()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getMax();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_RepRange_fieldAccessorTable.ensureFieldAccessorsInitialized(RepRange.class, Builder.class);
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
            return new RepRange();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.min_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.max_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RepRangeOrBuilder {
            private int bitField0_;
            private int max_;
            private int min_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(RepRange repRange) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    repRange.min_ = this.min_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    repRange.max_ = this.max_;
                    i14 |= 2;
                }
                repRange.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_RepRange_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RepRange build() {
                RepRange repRangeBuildPartial = buildPartial();
                if (repRangeBuildPartial.isInitialized()) {
                    return repRangeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) repRangeBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RepRange buildPartial() {
                RepRange repRange = new RepRange(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(repRange);
                }
                onBuilt();
                return repRange;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.min_ = 0;
                this.max_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMax() {
                this.bitField0_ &= -3;
                this.max_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMin() {
                this.bitField0_ &= -2;
                this.min_ = 0;
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
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_RepRange_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.RepRangeOrBuilder
            public int getMax() {
                return this.max_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.RepRangeOrBuilder
            public int getMin() {
                return this.min_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.RepRangeOrBuilder
            public boolean hasMax() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.RepRangeOrBuilder
            public boolean hasMin() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_RepRange_fieldAccessorTable.ensureFieldAccessorsInitialized(RepRange.class, Builder.class);
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
                                    this.min_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.max_ = codedInputStream.readUInt32();
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

            public Builder setMax(int i14) {
                this.max_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMin(int i14) {
                this.min_ = i14;
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
            public RepRange getDefaultInstanceForType() {
                return RepRange.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RepRange) {
                    return mergeFrom((RepRange) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RepRange repRange) {
                if (repRange == RepRange.getDefaultInstance()) {
                    return this;
                }
                if (repRange.hasMin()) {
                    setMin(repRange.getMin());
                }
                if (repRange.hasMax()) {
                    setMax(repRange.getMax());
                }
                mergeUnknownFields(repRange.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RepRange getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static RepRange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RepRange) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RepRange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static RepRange parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RepRange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ RepRange(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static RepRange parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private RepRange() {
            this.min_ = 0;
            this.max_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RepRange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static RepRange parseFrom(InputStream inputStream) {
            return (RepRange) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RepRange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RepRange) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RepRange parseFrom(CodedInputStream codedInputStream) {
            return (RepRange) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RepRange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RepRange) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SetEndNotification extends GeneratedMessageV3 implements SetEndNotificationOrBuilder {
        public static final int ATHLETE_ID_FIELD_NUMBER = 2;
        public static final int GROUP_ID_FIELD_NUMBER = 1;
        public static final int SET_NUMBER_FIELD_NUMBER = 3;
        public static final int TOTAL_REPS_FIELD_NUMBER = 4;
        public static final int WORKING_WEIGHT_KG_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private int athleteId_;
        private int bitField0_;
        private int groupId_;
        private byte memoizedIsInitialized;
        private int setNumber_;
        private int totalReps_;
        private float workingWeightKg_;
        private static final SetEndNotification DEFAULT_INSTANCE = new SetEndNotification();

        @Deprecated
        public static final Parser<SetEndNotification> PARSER = new AbstractParser<SetEndNotification>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetEndNotification.1
            @Override // com.google.protobuf.Parser
            public SetEndNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SetEndNotification.newBuilder();
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

        private SetEndNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.groupId_ = 0;
            this.athleteId_ = 0;
            this.setNumber_ = 0;
            this.totalReps_ = 0;
            this.workingWeightKg_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetEndNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_SetEndNotification_descriptor;
        }

        public static Builder newBuilder(SetEndNotification setEndNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(setEndNotification);
        }

        public static SetEndNotification parseDelimitedFrom(InputStream inputStream) {
            return (SetEndNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SetEndNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SetEndNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetEndNotification)) {
                return super.equals(obj);
            }
            SetEndNotification setEndNotification = (SetEndNotification) obj;
            if (hasGroupId() != setEndNotification.hasGroupId()) {
                return false;
            }
            if ((hasGroupId() && getGroupId() != setEndNotification.getGroupId()) || hasAthleteId() != setEndNotification.hasAthleteId()) {
                return false;
            }
            if ((hasAthleteId() && getAthleteId() != setEndNotification.getAthleteId()) || hasSetNumber() != setEndNotification.hasSetNumber()) {
                return false;
            }
            if ((hasSetNumber() && getSetNumber() != setEndNotification.getSetNumber()) || hasTotalReps() != setEndNotification.hasTotalReps()) {
                return false;
            }
            if ((!hasTotalReps() || getTotalReps() == setEndNotification.getTotalReps()) && hasWorkingWeightKg() == setEndNotification.hasWorkingWeightKg()) {
                return (!hasWorkingWeightKg() || Float.floatToIntBits(getWorkingWeightKg()) == Float.floatToIntBits(setEndNotification.getWorkingWeightKg())) && getUnknownFields().equals(setEndNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetEndNotificationOrBuilder
        public int getAthleteId() {
            return this.athleteId_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetEndNotificationOrBuilder
        public int getGroupId() {
            return this.groupId_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SetEndNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.groupId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.athleteId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.setNumber_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.totalReps_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeFloatSize(5, this.workingWeightKg_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetEndNotificationOrBuilder
        public int getSetNumber() {
            return this.setNumber_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetEndNotificationOrBuilder
        public int getTotalReps() {
            return this.totalReps_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetEndNotificationOrBuilder
        public float getWorkingWeightKg() {
            return this.workingWeightKg_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetEndNotificationOrBuilder
        public boolean hasAthleteId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetEndNotificationOrBuilder
        public boolean hasGroupId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetEndNotificationOrBuilder
        public boolean hasSetNumber() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetEndNotificationOrBuilder
        public boolean hasTotalReps() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetEndNotificationOrBuilder
        public boolean hasWorkingWeightKg() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGroupId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getGroupId();
            }
            if (hasAthleteId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getAthleteId();
            }
            if (hasSetNumber()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSetNumber();
            }
            if (hasTotalReps()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getTotalReps();
            }
            if (hasWorkingWeightKg()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Float.floatToIntBits(getWorkingWeightKg());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_SetEndNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SetEndNotification.class, Builder.class);
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
            return new SetEndNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.groupId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.athleteId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.setNumber_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.totalReps_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeFloat(5, this.workingWeightKg_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetEndNotificationOrBuilder {
            private int athleteId_;
            private int bitField0_;
            private int groupId_;
            private int setNumber_;
            private int totalReps_;
            private float workingWeightKg_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(SetEndNotification setEndNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    setEndNotification.groupId_ = this.groupId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    setEndNotification.athleteId_ = this.athleteId_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    setEndNotification.setNumber_ = this.setNumber_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    setEndNotification.totalReps_ = this.totalReps_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    setEndNotification.workingWeightKg_ = this.workingWeightKg_;
                    i14 |= 16;
                }
                setEndNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_SetEndNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetEndNotification build() {
                SetEndNotification setEndNotificationBuildPartial = buildPartial();
                if (setEndNotificationBuildPartial.isInitialized()) {
                    return setEndNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) setEndNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetEndNotification buildPartial() {
                SetEndNotification setEndNotification = new SetEndNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(setEndNotification);
                }
                onBuilt();
                return setEndNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.groupId_ = 0;
                this.athleteId_ = 0;
                this.setNumber_ = 0;
                this.totalReps_ = 0;
                this.workingWeightKg_ = 0.0f;
                return this;
            }

            public Builder clearAthleteId() {
                this.bitField0_ &= -3;
                this.athleteId_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGroupId() {
                this.bitField0_ &= -2;
                this.groupId_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSetNumber() {
                this.bitField0_ &= -5;
                this.setNumber_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTotalReps() {
                this.bitField0_ &= -9;
                this.totalReps_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWorkingWeightKg() {
                this.bitField0_ &= -17;
                this.workingWeightKg_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetEndNotificationOrBuilder
            public int getAthleteId() {
                return this.athleteId_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_SetEndNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetEndNotificationOrBuilder
            public int getGroupId() {
                return this.groupId_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetEndNotificationOrBuilder
            public int getSetNumber() {
                return this.setNumber_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetEndNotificationOrBuilder
            public int getTotalReps() {
                return this.totalReps_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetEndNotificationOrBuilder
            public float getWorkingWeightKg() {
                return this.workingWeightKg_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetEndNotificationOrBuilder
            public boolean hasAthleteId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetEndNotificationOrBuilder
            public boolean hasGroupId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetEndNotificationOrBuilder
            public boolean hasSetNumber() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetEndNotificationOrBuilder
            public boolean hasTotalReps() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetEndNotificationOrBuilder
            public boolean hasWorkingWeightKg() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_SetEndNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SetEndNotification.class, Builder.class);
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
                                    this.groupId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.athleteId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.setNumber_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.totalReps_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 45) {
                                    this.workingWeightKg_ = codedInputStream.readFloat();
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

            public Builder setAthleteId(int i14) {
                this.athleteId_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGroupId(int i14) {
                this.groupId_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSetNumber(int i14) {
                this.setNumber_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTotalReps(int i14) {
                this.totalReps_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setWorkingWeightKg(float f14) {
                this.workingWeightKg_ = f14;
                this.bitField0_ |= 16;
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
            public SetEndNotification getDefaultInstanceForType() {
                return SetEndNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SetEndNotification) {
                    return mergeFrom((SetEndNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SetEndNotification setEndNotification) {
                if (setEndNotification == SetEndNotification.getDefaultInstance()) {
                    return this;
                }
                if (setEndNotification.hasGroupId()) {
                    setGroupId(setEndNotification.getGroupId());
                }
                if (setEndNotification.hasAthleteId()) {
                    setAthleteId(setEndNotification.getAthleteId());
                }
                if (setEndNotification.hasSetNumber()) {
                    setSetNumber(setEndNotification.getSetNumber());
                }
                if (setEndNotification.hasTotalReps()) {
                    setTotalReps(setEndNotification.getTotalReps());
                }
                if (setEndNotification.hasWorkingWeightKg()) {
                    setWorkingWeightKg(setEndNotification.getWorkingWeightKg());
                }
                mergeUnknownFields(setEndNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SetEndNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SetEndNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetEndNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetEndNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SetEndNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SetEndNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SetEndNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SetEndNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SetEndNotification parseFrom(InputStream inputStream) {
            return (SetEndNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SetEndNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetEndNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetEndNotification parseFrom(CodedInputStream codedInputStream) {
            return (SetEndNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ SetEndNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SetEndNotification() {
            this.groupId_ = 0;
            this.athleteId_ = 0;
            this.setNumber_ = 0;
            this.totalReps_ = 0;
            this.workingWeightKg_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetEndNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetEndNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SetStartNotification extends GeneratedMessageV3 implements SetStartNotificationOrBuilder {
        public static final int ATHLETE_ID_FIELD_NUMBER = 2;
        public static final int GROUP_ID_FIELD_NUMBER = 1;
        public static final int SET_NUMBER_FIELD_NUMBER = 3;
        public static final int WORKING_WEIGHT_KG_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int athleteId_;
        private int bitField0_;
        private int groupId_;
        private byte memoizedIsInitialized;
        private int setNumber_;
        private float workingWeightKg_;
        private static final SetStartNotification DEFAULT_INSTANCE = new SetStartNotification();

        @Deprecated
        public static final Parser<SetStartNotification> PARSER = new AbstractParser<SetStartNotification>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetStartNotification.1
            @Override // com.google.protobuf.Parser
            public SetStartNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SetStartNotification.newBuilder();
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

        private SetStartNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.groupId_ = 0;
            this.athleteId_ = 0;
            this.setNumber_ = 0;
            this.workingWeightKg_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetStartNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_SetStartNotification_descriptor;
        }

        public static Builder newBuilder(SetStartNotification setStartNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(setStartNotification);
        }

        public static SetStartNotification parseDelimitedFrom(InputStream inputStream) {
            return (SetStartNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SetStartNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SetStartNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetStartNotification)) {
                return super.equals(obj);
            }
            SetStartNotification setStartNotification = (SetStartNotification) obj;
            if (hasGroupId() != setStartNotification.hasGroupId()) {
                return false;
            }
            if ((hasGroupId() && getGroupId() != setStartNotification.getGroupId()) || hasAthleteId() != setStartNotification.hasAthleteId()) {
                return false;
            }
            if ((hasAthleteId() && getAthleteId() != setStartNotification.getAthleteId()) || hasSetNumber() != setStartNotification.hasSetNumber()) {
                return false;
            }
            if ((!hasSetNumber() || getSetNumber() == setStartNotification.getSetNumber()) && hasWorkingWeightKg() == setStartNotification.hasWorkingWeightKg()) {
                return (!hasWorkingWeightKg() || Float.floatToIntBits(getWorkingWeightKg()) == Float.floatToIntBits(setStartNotification.getWorkingWeightKg())) && getUnknownFields().equals(setStartNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetStartNotificationOrBuilder
        public int getAthleteId() {
            return this.athleteId_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetStartNotificationOrBuilder
        public int getGroupId() {
            return this.groupId_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SetStartNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.groupId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.athleteId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.setNumber_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeFloatSize(4, this.workingWeightKg_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetStartNotificationOrBuilder
        public int getSetNumber() {
            return this.setNumber_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetStartNotificationOrBuilder
        public float getWorkingWeightKg() {
            return this.workingWeightKg_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetStartNotificationOrBuilder
        public boolean hasAthleteId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetStartNotificationOrBuilder
        public boolean hasGroupId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetStartNotificationOrBuilder
        public boolean hasSetNumber() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetStartNotificationOrBuilder
        public boolean hasWorkingWeightKg() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGroupId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getGroupId();
            }
            if (hasAthleteId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getAthleteId();
            }
            if (hasSetNumber()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSetNumber();
            }
            if (hasWorkingWeightKg()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Float.floatToIntBits(getWorkingWeightKg());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_SetStartNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SetStartNotification.class, Builder.class);
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
            return new SetStartNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.groupId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.athleteId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.setNumber_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeFloat(4, this.workingWeightKg_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetStartNotificationOrBuilder {
            private int athleteId_;
            private int bitField0_;
            private int groupId_;
            private int setNumber_;
            private float workingWeightKg_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(SetStartNotification setStartNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    setStartNotification.groupId_ = this.groupId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    setStartNotification.athleteId_ = this.athleteId_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    setStartNotification.setNumber_ = this.setNumber_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    setStartNotification.workingWeightKg_ = this.workingWeightKg_;
                    i14 |= 8;
                }
                setStartNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_SetStartNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetStartNotification build() {
                SetStartNotification setStartNotificationBuildPartial = buildPartial();
                if (setStartNotificationBuildPartial.isInitialized()) {
                    return setStartNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) setStartNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetStartNotification buildPartial() {
                SetStartNotification setStartNotification = new SetStartNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(setStartNotification);
                }
                onBuilt();
                return setStartNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.groupId_ = 0;
                this.athleteId_ = 0;
                this.setNumber_ = 0;
                this.workingWeightKg_ = 0.0f;
                return this;
            }

            public Builder clearAthleteId() {
                this.bitField0_ &= -3;
                this.athleteId_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGroupId() {
                this.bitField0_ &= -2;
                this.groupId_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSetNumber() {
                this.bitField0_ &= -5;
                this.setNumber_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWorkingWeightKg() {
                this.bitField0_ &= -9;
                this.workingWeightKg_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetStartNotificationOrBuilder
            public int getAthleteId() {
                return this.athleteId_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_SetStartNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetStartNotificationOrBuilder
            public int getGroupId() {
                return this.groupId_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetStartNotificationOrBuilder
            public int getSetNumber() {
                return this.setNumber_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetStartNotificationOrBuilder
            public float getWorkingWeightKg() {
                return this.workingWeightKg_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetStartNotificationOrBuilder
            public boolean hasAthleteId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetStartNotificationOrBuilder
            public boolean hasGroupId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetStartNotificationOrBuilder
            public boolean hasSetNumber() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.SetStartNotificationOrBuilder
            public boolean hasWorkingWeightKg() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_SetStartNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SetStartNotification.class, Builder.class);
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
                                    this.groupId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.athleteId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.setNumber_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 37) {
                                    this.workingWeightKg_ = codedInputStream.readFloat();
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

            public Builder setAthleteId(int i14) {
                this.athleteId_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGroupId(int i14) {
                this.groupId_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSetNumber(int i14) {
                this.setNumber_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setWorkingWeightKg(float f14) {
                this.workingWeightKg_ = f14;
                this.bitField0_ |= 8;
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
            public SetStartNotification getDefaultInstanceForType() {
                return SetStartNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SetStartNotification) {
                    return mergeFrom((SetStartNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SetStartNotification setStartNotification) {
                if (setStartNotification == SetStartNotification.getDefaultInstance()) {
                    return this;
                }
                if (setStartNotification.hasGroupId()) {
                    setGroupId(setStartNotification.getGroupId());
                }
                if (setStartNotification.hasAthleteId()) {
                    setAthleteId(setStartNotification.getAthleteId());
                }
                if (setStartNotification.hasSetNumber()) {
                    setSetNumber(setStartNotification.getSetNumber());
                }
                if (setStartNotification.hasWorkingWeightKg()) {
                    setWorkingWeightKg(setStartNotification.getWorkingWeightKg());
                }
                mergeUnknownFields(setStartNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SetStartNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SetStartNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetStartNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetStartNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SetStartNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SetStartNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SetStartNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SetStartNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SetStartNotification parseFrom(InputStream inputStream) {
            return (SetStartNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SetStartNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetStartNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ SetStartNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SetStartNotification() {
            this.groupId_ = 0;
            this.athleteId_ = 0;
            this.setNumber_ = 0;
            this.workingWeightKg_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetStartNotification parseFrom(CodedInputStream codedInputStream) {
            return (SetStartNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SetStartNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetStartNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class VelocityRange extends GeneratedMessageV3 implements VelocityRangeOrBuilder {
        public static final int MAX_M_PER_S_FIELD_NUMBER = 2;
        public static final int MIN_M_PER_S_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private float maxMPerS_;
        private byte memoizedIsInitialized;
        private float minMPerS_;
        private static final VelocityRange DEFAULT_INSTANCE = new VelocityRange();

        @Deprecated
        public static final Parser<VelocityRange> PARSER = new AbstractParser<VelocityRange>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.VelocityRange.1
            @Override // com.google.protobuf.Parser
            public VelocityRange parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = VelocityRange.newBuilder();
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

        private VelocityRange(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.minMPerS_ = 0.0f;
            this.maxMPerS_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VelocityRange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_VelocityRange_descriptor;
        }

        public static Builder newBuilder(VelocityRange velocityRange) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(velocityRange);
        }

        public static VelocityRange parseDelimitedFrom(InputStream inputStream) {
            return (VelocityRange) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VelocityRange parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<VelocityRange> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VelocityRange)) {
                return super.equals(obj);
            }
            VelocityRange velocityRange = (VelocityRange) obj;
            if (hasMinMPerS() != velocityRange.hasMinMPerS()) {
                return false;
            }
            if ((!hasMinMPerS() || Float.floatToIntBits(getMinMPerS()) == Float.floatToIntBits(velocityRange.getMinMPerS())) && hasMaxMPerS() == velocityRange.hasMaxMPerS()) {
                return (!hasMaxMPerS() || Float.floatToIntBits(getMaxMPerS()) == Float.floatToIntBits(velocityRange.getMaxMPerS())) && getUnknownFields().equals(velocityRange.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VelocityRangeOrBuilder
        public float getMaxMPerS() {
            return this.maxMPerS_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VelocityRangeOrBuilder
        public float getMinMPerS() {
            return this.minMPerS_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<VelocityRange> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeFloatSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeFloatSize(1, this.minMPerS_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.maxMPerS_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeFloatSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VelocityRangeOrBuilder
        public boolean hasMaxMPerS() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VelocityRangeOrBuilder
        public boolean hasMinMPerS() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMinMPerS()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Float.floatToIntBits(getMinMPerS());
            }
            if (hasMaxMPerS()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getMaxMPerS());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_VelocityRange_fieldAccessorTable.ensureFieldAccessorsInitialized(VelocityRange.class, Builder.class);
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
            return new VelocityRange();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeFloat(1, this.minMPerS_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.maxMPerS_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VelocityRangeOrBuilder {
            private int bitField0_;
            private float maxMPerS_;
            private float minMPerS_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(VelocityRange velocityRange) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    velocityRange.minMPerS_ = this.minMPerS_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    velocityRange.maxMPerS_ = this.maxMPerS_;
                    i14 |= 2;
                }
                velocityRange.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_VelocityRange_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VelocityRange build() {
                VelocityRange velocityRangeBuildPartial = buildPartial();
                if (velocityRangeBuildPartial.isInitialized()) {
                    return velocityRangeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) velocityRangeBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VelocityRange buildPartial() {
                VelocityRange velocityRange = new VelocityRange(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(velocityRange);
                }
                onBuilt();
                return velocityRange;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.minMPerS_ = 0.0f;
                this.maxMPerS_ = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMaxMPerS() {
                this.bitField0_ &= -3;
                this.maxMPerS_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearMinMPerS() {
                this.bitField0_ &= -2;
                this.minMPerS_ = 0.0f;
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
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_VelocityRange_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VelocityRangeOrBuilder
            public float getMaxMPerS() {
                return this.maxMPerS_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VelocityRangeOrBuilder
            public float getMinMPerS() {
                return this.minMPerS_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VelocityRangeOrBuilder
            public boolean hasMaxMPerS() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VelocityRangeOrBuilder
            public boolean hasMinMPerS() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_VelocityRange_fieldAccessorTable.ensureFieldAccessorsInitialized(VelocityRange.class, Builder.class);
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
                                if (tag == 13) {
                                    this.minMPerS_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.maxMPerS_ = codedInputStream.readFloat();
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

            public Builder setMaxMPerS(float f14) {
                this.maxMPerS_ = f14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMinMPerS(float f14) {
                this.minMPerS_ = f14;
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
            public VelocityRange getDefaultInstanceForType() {
                return VelocityRange.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof VelocityRange) {
                    return mergeFrom((VelocityRange) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(VelocityRange velocityRange) {
                if (velocityRange == VelocityRange.getDefaultInstance()) {
                    return this;
                }
                if (velocityRange.hasMinMPerS()) {
                    setMinMPerS(velocityRange.getMinMPerS());
                }
                if (velocityRange.hasMaxMPerS()) {
                    setMaxMPerS(velocityRange.getMaxMPerS());
                }
                mergeUnknownFields(velocityRange.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public VelocityRange getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static VelocityRange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VelocityRange) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VelocityRange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static VelocityRange parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VelocityRange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ VelocityRange(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static VelocityRange parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private VelocityRange() {
            this.minMPerS_ = 0.0f;
            this.maxMPerS_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VelocityRange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static VelocityRange parseFrom(InputStream inputStream) {
            return (VelocityRange) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static VelocityRange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VelocityRange) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VelocityRange parseFrom(CodedInputStream codedInputStream) {
            return (VelocityRange) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static VelocityRange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VelocityRange) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AthleteData extends GeneratedMessageV3 implements AthleteDataOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int ONE_REP_MAX_DATAS_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private List<OneRepMaxData> oneRepMaxDatas_;
        private static final AthleteData DEFAULT_INSTANCE = new AthleteData();

        @Deprecated
        public static final Parser<AthleteData> PARSER = new AbstractParser<AthleteData>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.AthleteData.1
            @Override // com.google.protobuf.Parser
            public AthleteData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AthleteData.newBuilder();
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

        private AthleteData() {
            this.id_ = 0;
            this.name_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.oneRepMaxDatas_ = Collections.EMPTY_LIST;
        }

        public static AthleteData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_AthleteData_descriptor;
        }

        public static Builder newBuilder(AthleteData athleteData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(athleteData);
        }

        public static AthleteData parseDelimitedFrom(InputStream inputStream) {
            return (AthleteData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AthleteData parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AthleteData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AthleteData)) {
                return super.equals(obj);
            }
            AthleteData athleteData = (AthleteData) obj;
            if (hasId() != athleteData.hasId()) {
                return false;
            }
            if ((!hasId() || getId() == athleteData.getId()) && hasName() == athleteData.hasName()) {
                return (!hasName() || getName().equals(athleteData.getName())) && getOneRepMaxDatasList().equals(athleteData.getOneRepMaxDatasList()) && getUnknownFields().equals(athleteData.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.AthleteDataOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.AthleteDataOrBuilder
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

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.AthleteDataOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.AthleteDataOrBuilder
        public OneRepMaxData getOneRepMaxDatas(int i14) {
            return this.oneRepMaxDatas_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.AthleteDataOrBuilder
        public int getOneRepMaxDatasCount() {
            return this.oneRepMaxDatas_.size();
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.AthleteDataOrBuilder
        public List<OneRepMaxData> getOneRepMaxDatasList() {
            return this.oneRepMaxDatas_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.AthleteDataOrBuilder
        public OneRepMaxDataOrBuilder getOneRepMaxDatasOrBuilder(int i14) {
            return this.oneRepMaxDatas_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.AthleteDataOrBuilder
        public List<? extends OneRepMaxDataOrBuilder> getOneRepMaxDatasOrBuilderList() {
            return this.oneRepMaxDatas_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AthleteData> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.id_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += GeneratedMessageV3.computeStringSize(2, this.name_);
            }
            for (int i15 = 0; i15 < this.oneRepMaxDatas_.size(); i15++) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(3, this.oneRepMaxDatas_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.AthleteDataOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.AthleteDataOrBuilder
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
            if (hasId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getId();
            }
            if (hasName()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getName().hashCode();
            }
            if (getOneRepMaxDatasCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getOneRepMaxDatasList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_AthleteData_fieldAccessorTable.ensureFieldAccessorsInitialized(AthleteData.class, Builder.class);
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
            return new AthleteData();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.id_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.name_);
            }
            for (int i14 = 0; i14 < this.oneRepMaxDatas_.size(); i14++) {
                codedOutputStream.writeMessage(3, this.oneRepMaxDatas_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AthleteDataOrBuilder {
            private int bitField0_;
            private int id_;
            private Object name_;
            private RepeatedFieldBuilderV3<OneRepMaxData, OneRepMaxData.Builder, OneRepMaxDataOrBuilder> oneRepMaxDatasBuilder_;
            private List<OneRepMaxData> oneRepMaxDatas_;

            private Builder() {
                this.name_ = "";
                this.oneRepMaxDatas_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(AthleteData athleteData) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    athleteData.id_ = this.id_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    athleteData.name_ = this.name_;
                    i14 |= 2;
                }
                athleteData.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(AthleteData athleteData) {
                RepeatedFieldBuilderV3<OneRepMaxData, OneRepMaxData.Builder, OneRepMaxDataOrBuilder> repeatedFieldBuilderV3 = this.oneRepMaxDatasBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    athleteData.oneRepMaxDatas_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 4) != 0) {
                    this.oneRepMaxDatas_ = Collections.unmodifiableList(this.oneRepMaxDatas_);
                    this.bitField0_ &= -5;
                }
                athleteData.oneRepMaxDatas_ = this.oneRepMaxDatas_;
            }

            private void ensureOneRepMaxDatasIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.oneRepMaxDatas_ = new ArrayList(this.oneRepMaxDatas_);
                    this.bitField0_ |= 4;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_AthleteData_descriptor;
            }

            private RepeatedFieldBuilderV3<OneRepMaxData, OneRepMaxData.Builder, OneRepMaxDataOrBuilder> getOneRepMaxDatasFieldBuilder() {
                if (this.oneRepMaxDatasBuilder_ == null) {
                    this.oneRepMaxDatasBuilder_ = new RepeatedFieldBuilderV3<>(this.oneRepMaxDatas_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.oneRepMaxDatas_ = null;
                }
                return this.oneRepMaxDatasBuilder_;
            }

            public Builder addAllOneRepMaxDatas(Iterable<? extends OneRepMaxData> iterable) {
                RepeatedFieldBuilderV3<OneRepMaxData, OneRepMaxData.Builder, OneRepMaxDataOrBuilder> repeatedFieldBuilderV3 = this.oneRepMaxDatasBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureOneRepMaxDatasIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.oneRepMaxDatas_);
                onChanged();
                return this;
            }

            public Builder addOneRepMaxDatas(OneRepMaxData.Builder builder) {
                RepeatedFieldBuilderV3<OneRepMaxData, OneRepMaxData.Builder, OneRepMaxDataOrBuilder> repeatedFieldBuilderV3 = this.oneRepMaxDatasBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureOneRepMaxDatasIsMutable();
                this.oneRepMaxDatas_.add(builder.build());
                onChanged();
                return this;
            }

            public OneRepMaxData.Builder addOneRepMaxDatasBuilder() {
                return (OneRepMaxData.Builder) getOneRepMaxDatasFieldBuilder().addBuilder(OneRepMaxData.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AthleteData build() {
                AthleteData athleteDataBuildPartial = buildPartial();
                if (athleteDataBuildPartial.isInitialized()) {
                    return athleteDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) athleteDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AthleteData buildPartial() {
                AthleteData athleteData = new AthleteData(this);
                buildPartialRepeatedFields(athleteData);
                if (this.bitField0_ != 0) {
                    buildPartial0(athleteData);
                }
                onBuilt();
                return athleteData;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                this.name_ = "";
                RepeatedFieldBuilderV3<OneRepMaxData, OneRepMaxData.Builder, OneRepMaxDataOrBuilder> repeatedFieldBuilderV3 = this.oneRepMaxDatasBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.oneRepMaxDatas_ = Collections.EMPTY_LIST;
                } else {
                    this.oneRepMaxDatas_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -5;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = AthleteData.getDefaultInstance().getName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearOneRepMaxDatas() {
                RepeatedFieldBuilderV3<OneRepMaxData, OneRepMaxData.Builder, OneRepMaxDataOrBuilder> repeatedFieldBuilderV3 = this.oneRepMaxDatasBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.oneRepMaxDatas_ = Collections.EMPTY_LIST;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_AthleteData_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.AthleteDataOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.AthleteDataOrBuilder
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

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.AthleteDataOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.AthleteDataOrBuilder
            public OneRepMaxData getOneRepMaxDatas(int i14) {
                RepeatedFieldBuilderV3<OneRepMaxData, OneRepMaxData.Builder, OneRepMaxDataOrBuilder> repeatedFieldBuilderV3 = this.oneRepMaxDatasBuilder_;
                return repeatedFieldBuilderV3 == null ? this.oneRepMaxDatas_.get(i14) : (OneRepMaxData) repeatedFieldBuilderV3.getMessage(i14);
            }

            public OneRepMaxData.Builder getOneRepMaxDatasBuilder(int i14) {
                return (OneRepMaxData.Builder) getOneRepMaxDatasFieldBuilder().getBuilder(i14);
            }

            public List<OneRepMaxData.Builder> getOneRepMaxDatasBuilderList() {
                return getOneRepMaxDatasFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.AthleteDataOrBuilder
            public int getOneRepMaxDatasCount() {
                RepeatedFieldBuilderV3<OneRepMaxData, OneRepMaxData.Builder, OneRepMaxDataOrBuilder> repeatedFieldBuilderV3 = this.oneRepMaxDatasBuilder_;
                return repeatedFieldBuilderV3 == null ? this.oneRepMaxDatas_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.AthleteDataOrBuilder
            public List<OneRepMaxData> getOneRepMaxDatasList() {
                RepeatedFieldBuilderV3<OneRepMaxData, OneRepMaxData.Builder, OneRepMaxDataOrBuilder> repeatedFieldBuilderV3 = this.oneRepMaxDatasBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.oneRepMaxDatas_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.AthleteDataOrBuilder
            public OneRepMaxDataOrBuilder getOneRepMaxDatasOrBuilder(int i14) {
                RepeatedFieldBuilderV3<OneRepMaxData, OneRepMaxData.Builder, OneRepMaxDataOrBuilder> repeatedFieldBuilderV3 = this.oneRepMaxDatasBuilder_;
                return repeatedFieldBuilderV3 == null ? this.oneRepMaxDatas_.get(i14) : (OneRepMaxDataOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.AthleteDataOrBuilder
            public List<? extends OneRepMaxDataOrBuilder> getOneRepMaxDatasOrBuilderList() {
                RepeatedFieldBuilderV3<OneRepMaxData, OneRepMaxData.Builder, OneRepMaxDataOrBuilder> repeatedFieldBuilderV3 = this.oneRepMaxDatasBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.oneRepMaxDatas_);
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.AthleteDataOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.AthleteDataOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_AthleteData_fieldAccessorTable.ensureFieldAccessorsInitialized(AthleteData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(AthleteData athleteData) {
                if (athleteData == AthleteData.getDefaultInstance()) {
                    return this;
                }
                if (athleteData.hasId()) {
                    setId(athleteData.getId());
                }
                if (athleteData.hasName()) {
                    this.name_ = athleteData.name_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (this.oneRepMaxDatasBuilder_ == null) {
                    if (!athleteData.oneRepMaxDatas_.isEmpty()) {
                        if (this.oneRepMaxDatas_.isEmpty()) {
                            this.oneRepMaxDatas_ = athleteData.oneRepMaxDatas_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureOneRepMaxDatasIsMutable();
                            this.oneRepMaxDatas_.addAll(athleteData.oneRepMaxDatas_);
                        }
                        onChanged();
                    }
                } else if (!athleteData.oneRepMaxDatas_.isEmpty()) {
                    boolean zIsEmpty = this.oneRepMaxDatasBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<OneRepMaxData, OneRepMaxData.Builder, OneRepMaxDataOrBuilder> repeatedFieldBuilderV3 = this.oneRepMaxDatasBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.oneRepMaxDatasBuilder_ = null;
                        this.oneRepMaxDatas_ = athleteData.oneRepMaxDatas_;
                        this.bitField0_ &= -5;
                        this.oneRepMaxDatasBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getOneRepMaxDatasFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(athleteData.oneRepMaxDatas_);
                    }
                }
                mergeUnknownFields(athleteData.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeOneRepMaxDatas(int i14) {
                RepeatedFieldBuilderV3<OneRepMaxData, OneRepMaxData.Builder, OneRepMaxDataOrBuilder> repeatedFieldBuilderV3 = this.oneRepMaxDatasBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureOneRepMaxDatasIsMutable();
                this.oneRepMaxDatas_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setId(int i14) {
                this.id_ = i14;
                this.bitField0_ |= 1;
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

            public Builder setOneRepMaxDatas(int i14, OneRepMaxData.Builder builder) {
                RepeatedFieldBuilderV3<OneRepMaxData, OneRepMaxData.Builder, OneRepMaxDataOrBuilder> repeatedFieldBuilderV3 = this.oneRepMaxDatasBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureOneRepMaxDatasIsMutable();
                this.oneRepMaxDatas_.set(i14, builder.build());
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
            public AthleteData getDefaultInstanceForType() {
                return AthleteData.getDefaultInstance();
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
                this.oneRepMaxDatas_ = Collections.EMPTY_LIST;
            }

            public OneRepMaxData.Builder addOneRepMaxDatasBuilder(int i14) {
                return (OneRepMaxData.Builder) getOneRepMaxDatasFieldBuilder().addBuilder(i14, OneRepMaxData.getDefaultInstance());
            }

            public Builder addOneRepMaxDatas(int i14, OneRepMaxData oneRepMaxData) {
                RepeatedFieldBuilderV3<OneRepMaxData, OneRepMaxData.Builder, OneRepMaxDataOrBuilder> repeatedFieldBuilderV3 = this.oneRepMaxDatasBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    oneRepMaxData.getClass();
                    ensureOneRepMaxDatasIsMutable();
                    this.oneRepMaxDatas_.add(i14, oneRepMaxData);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, oneRepMaxData);
                return this;
            }

            public Builder setOneRepMaxDatas(int i14, OneRepMaxData oneRepMaxData) {
                RepeatedFieldBuilderV3<OneRepMaxData, OneRepMaxData.Builder, OneRepMaxDataOrBuilder> repeatedFieldBuilderV3 = this.oneRepMaxDatasBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    oneRepMaxData.getClass();
                    ensureOneRepMaxDatasIsMutable();
                    this.oneRepMaxDatas_.set(i14, oneRepMaxData);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, oneRepMaxData);
                return this;
            }

            public Builder addOneRepMaxDatas(OneRepMaxData oneRepMaxData) {
                RepeatedFieldBuilderV3<OneRepMaxData, OneRepMaxData.Builder, OneRepMaxDataOrBuilder> repeatedFieldBuilderV3 = this.oneRepMaxDatasBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    oneRepMaxData.getClass();
                    ensureOneRepMaxDatasIsMutable();
                    this.oneRepMaxDatas_.add(oneRepMaxData);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(oneRepMaxData);
                return this;
            }

            public Builder addOneRepMaxDatas(int i14, OneRepMaxData.Builder builder) {
                RepeatedFieldBuilderV3<OneRepMaxData, OneRepMaxData.Builder, OneRepMaxDataOrBuilder> repeatedFieldBuilderV3 = this.oneRepMaxDatasBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureOneRepMaxDatasIsMutable();
                    this.oneRepMaxDatas_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AthleteData) {
                    return mergeFrom((AthleteData) message);
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
                                    this.id_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    OneRepMaxData oneRepMaxData = (OneRepMaxData) codedInputStream.readMessage(OneRepMaxData.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<OneRepMaxData, OneRepMaxData.Builder, OneRepMaxDataOrBuilder> repeatedFieldBuilderV3 = this.oneRepMaxDatasBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureOneRepMaxDatasIsMutable();
                                        this.oneRepMaxDatas_.add(oneRepMaxData);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(oneRepMaxData);
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
        public AthleteData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AthleteData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AthleteData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AthleteData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AthleteData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AthleteData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AthleteData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AthleteData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AthleteData parseFrom(InputStream inputStream) {
            return (AthleteData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AthleteData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AthleteData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AthleteData parseFrom(CodedInputStream codedInputStream) {
            return (AthleteData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private AthleteData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.name_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AthleteData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AthleteData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ AthleteData(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class DisplayStateNotification extends GeneratedMessageV3 implements DisplayStateNotificationOrBuilder {
        private static final DisplayStateNotification DEFAULT_INSTANCE = new DisplayStateNotification();

        @Deprecated
        public static final Parser<DisplayStateNotification> PARSER = new AbstractParser<DisplayStateNotification>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.DisplayStateNotification.1
            @Override // com.google.protobuf.Parser
            public DisplayStateNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DisplayStateNotification.newBuilder();
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
        public static final int SESSION_ID_FIELD_NUMBER = 2;
        public static final int STATE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int sessionId_;
        private int state_;

        private DisplayStateNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.state_ = 0;
            this.sessionId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DisplayStateNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_DisplayStateNotification_descriptor;
        }

        public static Builder newBuilder(DisplayStateNotification displayStateNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(displayStateNotification);
        }

        public static DisplayStateNotification parseDelimitedFrom(InputStream inputStream) {
            return (DisplayStateNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DisplayStateNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DisplayStateNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DisplayStateNotification)) {
                return super.equals(obj);
            }
            DisplayStateNotification displayStateNotification = (DisplayStateNotification) obj;
            if (hasState() != displayStateNotification.hasState()) {
                return false;
            }
            if ((!hasState() || this.state_ == displayStateNotification.state_) && hasSessionId() == displayStateNotification.hasSessionId()) {
                return (!hasSessionId() || getSessionId() == displayStateNotification.getSessionId()) && getUnknownFields().equals(displayStateNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DisplayStateNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.state_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.sessionId_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.DisplayStateNotificationOrBuilder
        public int getSessionId() {
            return this.sessionId_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.DisplayStateNotificationOrBuilder
        public DisplayState getState() {
            DisplayState displayStateForNumber = DisplayState.forNumber(this.state_);
            return displayStateForNumber == null ? DisplayState.UNKNOWN : displayStateForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.DisplayStateNotificationOrBuilder
        public boolean hasSessionId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.DisplayStateNotificationOrBuilder
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
            if (hasSessionId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSessionId();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_DisplayStateNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(DisplayStateNotification.class, Builder.class);
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
            return new DisplayStateNotification();
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
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.sessionId_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DisplayStateNotificationOrBuilder {
            private int bitField0_;
            private int sessionId_;
            private int state_;

            private Builder() {
                this.state_ = 0;
            }

            private void buildPartial0(DisplayStateNotification displayStateNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    displayStateNotification.state_ = this.state_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    displayStateNotification.sessionId_ = this.sessionId_;
                    i14 |= 2;
                }
                displayStateNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_DisplayStateNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DisplayStateNotification build() {
                DisplayStateNotification displayStateNotificationBuildPartial = buildPartial();
                if (displayStateNotificationBuildPartial.isInitialized()) {
                    return displayStateNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) displayStateNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DisplayStateNotification buildPartial() {
                DisplayStateNotification displayStateNotification = new DisplayStateNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(displayStateNotification);
                }
                onBuilt();
                return displayStateNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.state_ = 0;
                this.sessionId_ = 0;
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

            public Builder clearSessionId() {
                this.bitField0_ &= -3;
                this.sessionId_ = 0;
                onChanged();
                return this;
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
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_DisplayStateNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.DisplayStateNotificationOrBuilder
            public int getSessionId() {
                return this.sessionId_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.DisplayStateNotificationOrBuilder
            public DisplayState getState() {
                DisplayState displayStateForNumber = DisplayState.forNumber(this.state_);
                return displayStateForNumber == null ? DisplayState.UNKNOWN : displayStateForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.DisplayStateNotificationOrBuilder
            public boolean hasSessionId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.DisplayStateNotificationOrBuilder
            public boolean hasState() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_DisplayStateNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(DisplayStateNotification.class, Builder.class);
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
                                    if (DisplayState.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.state_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.sessionId_ = codedInputStream.readUInt32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionId(int i14) {
                this.sessionId_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setState(DisplayState displayState) {
                displayState.getClass();
                this.bitField0_ |= 1;
                this.state_ = displayState.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DisplayStateNotification getDefaultInstanceForType() {
                return DisplayStateNotification.getDefaultInstance();
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
                if (message instanceof DisplayStateNotification) {
                    return mergeFrom((DisplayStateNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DisplayStateNotification displayStateNotification) {
                if (displayStateNotification == DisplayStateNotification.getDefaultInstance()) {
                    return this;
                }
                if (displayStateNotification.hasState()) {
                    setState(displayStateNotification.getState());
                }
                if (displayStateNotification.hasSessionId()) {
                    setSessionId(displayStateNotification.getSessionId());
                }
                mergeUnknownFields(displayStateNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DisplayStateNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DisplayStateNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DisplayStateNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DisplayStateNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DisplayStateNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DisplayStateNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ DisplayStateNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DisplayStateNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private DisplayStateNotification() {
            this.sessionId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.state_ = 0;
        }

        public static DisplayStateNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DisplayStateNotification parseFrom(InputStream inputStream) {
            return (DisplayStateNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DisplayStateNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DisplayStateNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DisplayStateNotification parseFrom(CodedInputStream codedInputStream) {
            return (DisplayStateNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DisplayStateNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DisplayStateNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum DisplayState implements ProtocolMessageEnum {
            UNKNOWN(0),
            IDLE(1),
            SETUP(2),
            READY(3),
            ACTIVE(4),
            PAUSED(5),
            ENDING(6);

            public static final int ACTIVE_VALUE = 4;
            public static final int ENDING_VALUE = 6;
            public static final int IDLE_VALUE = 1;
            public static final int PAUSED_VALUE = 5;
            public static final int READY_VALUE = 3;
            public static final int SETUP_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<DisplayState> internalValueMap = new Internal.EnumLiteMap<DisplayState>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.DisplayStateNotification.DisplayState.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public DisplayState findValueByNumber(int i14) {
                    return DisplayState.forNumber(i14);
                }
            };
            private static final DisplayState[] VALUES = values();

            DisplayState(int i14) {
                this.value = i14;
            }

            public static DisplayState forNumber(int i14) {
                switch (i14) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return IDLE;
                    case 2:
                        return SETUP;
                    case 3:
                        return READY;
                    case 4:
                        return ACTIVE;
                    case 5:
                        return PAUSED;
                    case 6:
                        return ENDING;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return DisplayStateNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<DisplayState> internalGetValueMap() {
                return internalValueMap;
            }

            public static DisplayState valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static DisplayState valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class GroupData extends GeneratedMessageV3 implements GroupDataOrBuilder {
        public static final int ATHLETES_FIELD_NUMBER = 3;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private List<AthleteData> athletes_;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private static final GroupData DEFAULT_INSTANCE = new GroupData();

        @Deprecated
        public static final Parser<GroupData> PARSER = new AbstractParser<GroupData>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupData.1
            @Override // com.google.protobuf.Parser
            public GroupData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GroupData.newBuilder();
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

        private GroupData() {
            this.id_ = 0;
            this.name_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.athletes_ = Collections.EMPTY_LIST;
        }

        public static GroupData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_GroupData_descriptor;
        }

        public static Builder newBuilder(GroupData groupData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(groupData);
        }

        public static GroupData parseDelimitedFrom(InputStream inputStream) {
            return (GroupData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GroupData parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GroupData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GroupData)) {
                return super.equals(obj);
            }
            GroupData groupData = (GroupData) obj;
            if (hasId() != groupData.hasId()) {
                return false;
            }
            if ((!hasId() || getId() == groupData.getId()) && hasName() == groupData.hasName()) {
                return (!hasName() || getName().equals(groupData.getName())) && getAthletesList().equals(groupData.getAthletesList()) && getUnknownFields().equals(groupData.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupDataOrBuilder
        public AthleteData getAthletes(int i14) {
            return this.athletes_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupDataOrBuilder
        public int getAthletesCount() {
            return this.athletes_.size();
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupDataOrBuilder
        public List<AthleteData> getAthletesList() {
            return this.athletes_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupDataOrBuilder
        public AthleteDataOrBuilder getAthletesOrBuilder(int i14) {
            return this.athletes_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupDataOrBuilder
        public List<? extends AthleteDataOrBuilder> getAthletesOrBuilderList() {
            return this.athletes_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupDataOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupDataOrBuilder
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

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupDataOrBuilder
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
        public Parser<GroupData> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.id_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += GeneratedMessageV3.computeStringSize(2, this.name_);
            }
            for (int i15 = 0; i15 < this.athletes_.size(); i15++) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(3, this.athletes_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupDataOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupDataOrBuilder
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
            if (hasId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getId();
            }
            if (hasName()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getName().hashCode();
            }
            if (getAthletesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getAthletesList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_GroupData_fieldAccessorTable.ensureFieldAccessorsInitialized(GroupData.class, Builder.class);
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
            return new GroupData();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.id_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.name_);
            }
            for (int i14 = 0; i14 < this.athletes_.size(); i14++) {
                codedOutputStream.writeMessage(3, this.athletes_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GroupDataOrBuilder {
            private RepeatedFieldBuilderV3<AthleteData, AthleteData.Builder, AthleteDataOrBuilder> athletesBuilder_;
            private List<AthleteData> athletes_;
            private int bitField0_;
            private int id_;
            private Object name_;

            private Builder() {
                this.name_ = "";
                this.athletes_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(GroupData groupData) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    groupData.id_ = this.id_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    groupData.name_ = this.name_;
                    i14 |= 2;
                }
                groupData.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(GroupData groupData) {
                RepeatedFieldBuilderV3<AthleteData, AthleteData.Builder, AthleteDataOrBuilder> repeatedFieldBuilderV3 = this.athletesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    groupData.athletes_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 4) != 0) {
                    this.athletes_ = Collections.unmodifiableList(this.athletes_);
                    this.bitField0_ &= -5;
                }
                groupData.athletes_ = this.athletes_;
            }

            private void ensureAthletesIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.athletes_ = new ArrayList(this.athletes_);
                    this.bitField0_ |= 4;
                }
            }

            private RepeatedFieldBuilderV3<AthleteData, AthleteData.Builder, AthleteDataOrBuilder> getAthletesFieldBuilder() {
                if (this.athletesBuilder_ == null) {
                    this.athletesBuilder_ = new RepeatedFieldBuilderV3<>(this.athletes_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.athletes_ = null;
                }
                return this.athletesBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_GroupData_descriptor;
            }

            public Builder addAllAthletes(Iterable<? extends AthleteData> iterable) {
                RepeatedFieldBuilderV3<AthleteData, AthleteData.Builder, AthleteDataOrBuilder> repeatedFieldBuilderV3 = this.athletesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureAthletesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.athletes_);
                onChanged();
                return this;
            }

            public Builder addAthletes(AthleteData.Builder builder) {
                RepeatedFieldBuilderV3<AthleteData, AthleteData.Builder, AthleteDataOrBuilder> repeatedFieldBuilderV3 = this.athletesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureAthletesIsMutable();
                this.athletes_.add(builder.build());
                onChanged();
                return this;
            }

            public AthleteData.Builder addAthletesBuilder() {
                return (AthleteData.Builder) getAthletesFieldBuilder().addBuilder(AthleteData.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GroupData build() {
                GroupData groupDataBuildPartial = buildPartial();
                if (groupDataBuildPartial.isInitialized()) {
                    return groupDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) groupDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GroupData buildPartial() {
                GroupData groupData = new GroupData(this);
                buildPartialRepeatedFields(groupData);
                if (this.bitField0_ != 0) {
                    buildPartial0(groupData);
                }
                onBuilt();
                return groupData;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                this.name_ = "";
                RepeatedFieldBuilderV3<AthleteData, AthleteData.Builder, AthleteDataOrBuilder> repeatedFieldBuilderV3 = this.athletesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.athletes_ = Collections.EMPTY_LIST;
                } else {
                    this.athletes_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -5;
                return this;
            }

            public Builder clearAthletes() {
                RepeatedFieldBuilderV3<AthleteData, AthleteData.Builder, AthleteDataOrBuilder> repeatedFieldBuilderV3 = this.athletesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.athletes_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = GroupData.getDefaultInstance().getName();
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

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupDataOrBuilder
            public AthleteData getAthletes(int i14) {
                RepeatedFieldBuilderV3<AthleteData, AthleteData.Builder, AthleteDataOrBuilder> repeatedFieldBuilderV3 = this.athletesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.athletes_.get(i14) : (AthleteData) repeatedFieldBuilderV3.getMessage(i14);
            }

            public AthleteData.Builder getAthletesBuilder(int i14) {
                return (AthleteData.Builder) getAthletesFieldBuilder().getBuilder(i14);
            }

            public List<AthleteData.Builder> getAthletesBuilderList() {
                return getAthletesFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupDataOrBuilder
            public int getAthletesCount() {
                RepeatedFieldBuilderV3<AthleteData, AthleteData.Builder, AthleteDataOrBuilder> repeatedFieldBuilderV3 = this.athletesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.athletes_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupDataOrBuilder
            public List<AthleteData> getAthletesList() {
                RepeatedFieldBuilderV3<AthleteData, AthleteData.Builder, AthleteDataOrBuilder> repeatedFieldBuilderV3 = this.athletesBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.athletes_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupDataOrBuilder
            public AthleteDataOrBuilder getAthletesOrBuilder(int i14) {
                RepeatedFieldBuilderV3<AthleteData, AthleteData.Builder, AthleteDataOrBuilder> repeatedFieldBuilderV3 = this.athletesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.athletes_.get(i14) : (AthleteDataOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupDataOrBuilder
            public List<? extends AthleteDataOrBuilder> getAthletesOrBuilderList() {
                RepeatedFieldBuilderV3<AthleteData, AthleteData.Builder, AthleteDataOrBuilder> repeatedFieldBuilderV3 = this.athletesBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.athletes_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_GroupData_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupDataOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupDataOrBuilder
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

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupDataOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupDataOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupDataOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_GroupData_fieldAccessorTable.ensureFieldAccessorsInitialized(GroupData.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(GroupData groupData) {
                if (groupData == GroupData.getDefaultInstance()) {
                    return this;
                }
                if (groupData.hasId()) {
                    setId(groupData.getId());
                }
                if (groupData.hasName()) {
                    this.name_ = groupData.name_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (this.athletesBuilder_ == null) {
                    if (!groupData.athletes_.isEmpty()) {
                        if (this.athletes_.isEmpty()) {
                            this.athletes_ = groupData.athletes_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureAthletesIsMutable();
                            this.athletes_.addAll(groupData.athletes_);
                        }
                        onChanged();
                    }
                } else if (!groupData.athletes_.isEmpty()) {
                    boolean zIsEmpty = this.athletesBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<AthleteData, AthleteData.Builder, AthleteDataOrBuilder> repeatedFieldBuilderV3 = this.athletesBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.athletesBuilder_ = null;
                        this.athletes_ = groupData.athletes_;
                        this.bitField0_ &= -5;
                        this.athletesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getAthletesFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(groupData.athletes_);
                    }
                }
                mergeUnknownFields(groupData.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeAthletes(int i14) {
                RepeatedFieldBuilderV3<AthleteData, AthleteData.Builder, AthleteDataOrBuilder> repeatedFieldBuilderV3 = this.athletesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureAthletesIsMutable();
                this.athletes_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setAthletes(int i14, AthleteData.Builder builder) {
                RepeatedFieldBuilderV3<AthleteData, AthleteData.Builder, AthleteDataOrBuilder> repeatedFieldBuilderV3 = this.athletesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureAthletesIsMutable();
                this.athletes_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setId(int i14) {
                this.id_ = i14;
                this.bitField0_ |= 1;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GroupData getDefaultInstanceForType() {
                return GroupData.getDefaultInstance();
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
                this.athletes_ = Collections.EMPTY_LIST;
            }

            public AthleteData.Builder addAthletesBuilder(int i14) {
                return (AthleteData.Builder) getAthletesFieldBuilder().addBuilder(i14, AthleteData.getDefaultInstance());
            }

            public Builder addAthletes(int i14, AthleteData athleteData) {
                RepeatedFieldBuilderV3<AthleteData, AthleteData.Builder, AthleteDataOrBuilder> repeatedFieldBuilderV3 = this.athletesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    athleteData.getClass();
                    ensureAthletesIsMutable();
                    this.athletes_.add(i14, athleteData);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, athleteData);
                return this;
            }

            public Builder setAthletes(int i14, AthleteData athleteData) {
                RepeatedFieldBuilderV3<AthleteData, AthleteData.Builder, AthleteDataOrBuilder> repeatedFieldBuilderV3 = this.athletesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    athleteData.getClass();
                    ensureAthletesIsMutable();
                    this.athletes_.set(i14, athleteData);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, athleteData);
                return this;
            }

            public Builder addAthletes(AthleteData athleteData) {
                RepeatedFieldBuilderV3<AthleteData, AthleteData.Builder, AthleteDataOrBuilder> repeatedFieldBuilderV3 = this.athletesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    athleteData.getClass();
                    ensureAthletesIsMutable();
                    this.athletes_.add(athleteData);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(athleteData);
                return this;
            }

            public Builder addAthletes(int i14, AthleteData.Builder builder) {
                RepeatedFieldBuilderV3<AthleteData, AthleteData.Builder, AthleteDataOrBuilder> repeatedFieldBuilderV3 = this.athletesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAthletesIsMutable();
                    this.athletes_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GroupData) {
                    return mergeFrom((GroupData) message);
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
                                    this.id_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    AthleteData athleteData = (AthleteData) codedInputStream.readMessage(AthleteData.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<AthleteData, AthleteData.Builder, AthleteDataOrBuilder> repeatedFieldBuilderV3 = this.athletesBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureAthletesIsMutable();
                                        this.athletes_.add(athleteData);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(athleteData);
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
        public GroupData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GroupData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GroupData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GroupData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GroupData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GroupData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GroupData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GroupData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GroupData parseFrom(InputStream inputStream) {
            return (GroupData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GroupData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GroupData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GroupData parseFrom(CodedInputStream codedInputStream) {
            return (GroupData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private GroupData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.name_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GroupData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GroupData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ GroupData(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class GroupListRequest extends GeneratedMessageV3 implements GroupListRequestOrBuilder {
        public static final int GROUPS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<GroupData> groups_;
        private byte memoizedIsInitialized;
        private static final GroupListRequest DEFAULT_INSTANCE = new GroupListRequest();

        @Deprecated
        public static final Parser<GroupListRequest> PARSER = new AbstractParser<GroupListRequest>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupListRequest.1
            @Override // com.google.protobuf.Parser
            public GroupListRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GroupListRequest.newBuilder();
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

        private GroupListRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.groups_ = Collections.EMPTY_LIST;
        }

        public static GroupListRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_GroupListRequest_descriptor;
        }

        public static Builder newBuilder(GroupListRequest groupListRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(groupListRequest);
        }

        public static GroupListRequest parseDelimitedFrom(InputStream inputStream) {
            return (GroupListRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GroupListRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GroupListRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GroupListRequest)) {
                return super.equals(obj);
            }
            GroupListRequest groupListRequest = (GroupListRequest) obj;
            return getGroupsList().equals(groupListRequest.getGroupsList()) && getUnknownFields().equals(groupListRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupListRequestOrBuilder
        public GroupData getGroups(int i14) {
            return this.groups_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupListRequestOrBuilder
        public int getGroupsCount() {
            return this.groups_.size();
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupListRequestOrBuilder
        public List<GroupData> getGroupsList() {
            return this.groups_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupListRequestOrBuilder
        public GroupDataOrBuilder getGroupsOrBuilder(int i14) {
            return this.groups_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupListRequestOrBuilder
        public List<? extends GroupDataOrBuilder> getGroupsOrBuilderList() {
            return this.groups_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GroupListRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.groups_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.groups_.get(i15));
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
            if (getGroupsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getGroupsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_GroupListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GroupListRequest.class, Builder.class);
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
            return new GroupListRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.groups_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.groups_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GroupListRequestOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<GroupData, GroupData.Builder, GroupDataOrBuilder> groupsBuilder_;
            private List<GroupData> groups_;

            private Builder() {
                this.groups_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(GroupListRequest groupListRequest) {
            }

            private void buildPartialRepeatedFields(GroupListRequest groupListRequest) {
                RepeatedFieldBuilderV3<GroupData, GroupData.Builder, GroupDataOrBuilder> repeatedFieldBuilderV3 = this.groupsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    groupListRequest.groups_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.groups_ = Collections.unmodifiableList(this.groups_);
                    this.bitField0_ &= -2;
                }
                groupListRequest.groups_ = this.groups_;
            }

            private void ensureGroupsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.groups_ = new ArrayList(this.groups_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_GroupListRequest_descriptor;
            }

            private RepeatedFieldBuilderV3<GroupData, GroupData.Builder, GroupDataOrBuilder> getGroupsFieldBuilder() {
                if (this.groupsBuilder_ == null) {
                    this.groupsBuilder_ = new RepeatedFieldBuilderV3<>(this.groups_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.groups_ = null;
                }
                return this.groupsBuilder_;
            }

            public Builder addAllGroups(Iterable<? extends GroupData> iterable) {
                RepeatedFieldBuilderV3<GroupData, GroupData.Builder, GroupDataOrBuilder> repeatedFieldBuilderV3 = this.groupsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureGroupsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.groups_);
                onChanged();
                return this;
            }

            public Builder addGroups(GroupData.Builder builder) {
                RepeatedFieldBuilderV3<GroupData, GroupData.Builder, GroupDataOrBuilder> repeatedFieldBuilderV3 = this.groupsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureGroupsIsMutable();
                this.groups_.add(builder.build());
                onChanged();
                return this;
            }

            public GroupData.Builder addGroupsBuilder() {
                return (GroupData.Builder) getGroupsFieldBuilder().addBuilder(GroupData.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GroupListRequest build() {
                GroupListRequest groupListRequestBuildPartial = buildPartial();
                if (groupListRequestBuildPartial.isInitialized()) {
                    return groupListRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) groupListRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GroupListRequest buildPartial() {
                GroupListRequest groupListRequest = new GroupListRequest(this);
                buildPartialRepeatedFields(groupListRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(groupListRequest);
                }
                onBuilt();
                return groupListRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<GroupData, GroupData.Builder, GroupDataOrBuilder> repeatedFieldBuilderV3 = this.groupsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.groups_ = Collections.EMPTY_LIST;
                } else {
                    this.groups_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGroups() {
                RepeatedFieldBuilderV3<GroupData, GroupData.Builder, GroupDataOrBuilder> repeatedFieldBuilderV3 = this.groupsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.groups_ = Collections.EMPTY_LIST;
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
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_GroupListRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupListRequestOrBuilder
            public GroupData getGroups(int i14) {
                RepeatedFieldBuilderV3<GroupData, GroupData.Builder, GroupDataOrBuilder> repeatedFieldBuilderV3 = this.groupsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.groups_.get(i14) : (GroupData) repeatedFieldBuilderV3.getMessage(i14);
            }

            public GroupData.Builder getGroupsBuilder(int i14) {
                return (GroupData.Builder) getGroupsFieldBuilder().getBuilder(i14);
            }

            public List<GroupData.Builder> getGroupsBuilderList() {
                return getGroupsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupListRequestOrBuilder
            public int getGroupsCount() {
                RepeatedFieldBuilderV3<GroupData, GroupData.Builder, GroupDataOrBuilder> repeatedFieldBuilderV3 = this.groupsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.groups_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupListRequestOrBuilder
            public List<GroupData> getGroupsList() {
                RepeatedFieldBuilderV3<GroupData, GroupData.Builder, GroupDataOrBuilder> repeatedFieldBuilderV3 = this.groupsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.groups_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupListRequestOrBuilder
            public GroupDataOrBuilder getGroupsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<GroupData, GroupData.Builder, GroupDataOrBuilder> repeatedFieldBuilderV3 = this.groupsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.groups_.get(i14) : (GroupDataOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.GroupListRequestOrBuilder
            public List<? extends GroupDataOrBuilder> getGroupsOrBuilderList() {
                RepeatedFieldBuilderV3<GroupData, GroupData.Builder, GroupDataOrBuilder> repeatedFieldBuilderV3 = this.groupsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.groups_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_GroupListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GroupListRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(GroupListRequest groupListRequest) {
                if (groupListRequest == GroupListRequest.getDefaultInstance()) {
                    return this;
                }
                if (this.groupsBuilder_ == null) {
                    if (!groupListRequest.groups_.isEmpty()) {
                        if (this.groups_.isEmpty()) {
                            this.groups_ = groupListRequest.groups_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureGroupsIsMutable();
                            this.groups_.addAll(groupListRequest.groups_);
                        }
                        onChanged();
                    }
                } else if (!groupListRequest.groups_.isEmpty()) {
                    boolean zIsEmpty = this.groupsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<GroupData, GroupData.Builder, GroupDataOrBuilder> repeatedFieldBuilderV3 = this.groupsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.groupsBuilder_ = null;
                        this.groups_ = groupListRequest.groups_;
                        this.bitField0_ &= -2;
                        this.groupsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getGroupsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(groupListRequest.groups_);
                    }
                }
                mergeUnknownFields(groupListRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeGroups(int i14) {
                RepeatedFieldBuilderV3<GroupData, GroupData.Builder, GroupDataOrBuilder> repeatedFieldBuilderV3 = this.groupsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureGroupsIsMutable();
                this.groups_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGroups(int i14, GroupData.Builder builder) {
                RepeatedFieldBuilderV3<GroupData, GroupData.Builder, GroupDataOrBuilder> repeatedFieldBuilderV3 = this.groupsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureGroupsIsMutable();
                this.groups_.set(i14, builder.build());
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
            public GroupListRequest getDefaultInstanceForType() {
                return GroupListRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.groups_ = Collections.EMPTY_LIST;
            }

            public GroupData.Builder addGroupsBuilder(int i14) {
                return (GroupData.Builder) getGroupsFieldBuilder().addBuilder(i14, GroupData.getDefaultInstance());
            }

            public Builder addGroups(int i14, GroupData groupData) {
                RepeatedFieldBuilderV3<GroupData, GroupData.Builder, GroupDataOrBuilder> repeatedFieldBuilderV3 = this.groupsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    groupData.getClass();
                    ensureGroupsIsMutable();
                    this.groups_.add(i14, groupData);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, groupData);
                return this;
            }

            public Builder setGroups(int i14, GroupData groupData) {
                RepeatedFieldBuilderV3<GroupData, GroupData.Builder, GroupDataOrBuilder> repeatedFieldBuilderV3 = this.groupsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    groupData.getClass();
                    ensureGroupsIsMutable();
                    this.groups_.set(i14, groupData);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, groupData);
                return this;
            }

            public Builder addGroups(GroupData groupData) {
                RepeatedFieldBuilderV3<GroupData, GroupData.Builder, GroupDataOrBuilder> repeatedFieldBuilderV3 = this.groupsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    groupData.getClass();
                    ensureGroupsIsMutable();
                    this.groups_.add(groupData);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(groupData);
                return this;
            }

            public Builder addGroups(int i14, GroupData.Builder builder) {
                RepeatedFieldBuilderV3<GroupData, GroupData.Builder, GroupDataOrBuilder> repeatedFieldBuilderV3 = this.groupsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureGroupsIsMutable();
                    this.groups_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GroupListRequest) {
                    return mergeFrom((GroupListRequest) message);
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
                                    GroupData groupData = (GroupData) codedInputStream.readMessage(GroupData.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<GroupData, GroupData.Builder, GroupDataOrBuilder> repeatedFieldBuilderV3 = this.groupsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureGroupsIsMutable();
                                        this.groups_.add(groupData);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(groupData);
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
        public GroupListRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GroupListRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GroupListRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GroupListRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GroupListRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private GroupListRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GroupListRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GroupListRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ GroupListRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GroupListRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GroupListRequest parseFrom(InputStream inputStream) {
            return (GroupListRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GroupListRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GroupListRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GroupListRequest parseFrom(CodedInputStream codedInputStream) {
            return (GroupListRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GroupListRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GroupListRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class MetricsNotification extends GeneratedMessageV3 implements MetricsNotificationOrBuilder {
        public static final int ATHLETE_ID_FIELD_NUMBER = 2;
        public static final int AVG_DURATION_SECOND_X100_FIELD_NUMBER = 20;
        public static final int AVG_ECC_DURATION_SECOND_X100_FIELD_NUMBER = 26;
        public static final int AVG_ECC_MEAN_VEL_M_PER_S_X100_FIELD_NUMBER = 24;
        public static final int AVG_ECC_PEAK_VEL_M_PER_S_X100_FIELD_NUMBER = 25;
        public static final int AVG_ECC_ROM_CM_X100_FIELD_NUMBER = 27;
        public static final int AVG_MEAN_POWER_WATT_FIELD_NUMBER = 23;
        public static final int AVG_MEAN_PROPUL_VEL_M_PER_S_X100_FIELD_NUMBER = 19;
        public static final int AVG_MEAN_VEL_M_PER_S_X100_FIELD_NUMBER = 17;
        public static final int AVG_PEAK_POWER_WATT_FIELD_NUMBER = 22;
        public static final int AVG_PEAK_VEL_M_PER_S_X100_FIELD_NUMBER = 18;
        public static final int AVG_ROM_CM_X100_FIELD_NUMBER = 21;
        public static final int BAR_PATH_POINTS_FIELD_NUMBER = 12;
        public static final int DURATION_SECOND_X100_FIELD_NUMBER = 8;
        public static final int ECC_DURATION_SECOND_X100_FIELD_NUMBER = 15;
        public static final int ECC_MEAN_VEL_M_PER_S_X100_FIELD_NUMBER = 13;
        public static final int ECC_PEAK_VEL_M_PER_S_X100_FIELD_NUMBER = 14;
        public static final int ECC_ROM_CM_X100_FIELD_NUMBER = 16;
        public static final int GROUP_ID_FIELD_NUMBER = 1;
        public static final int MEAN_POWER_WATT_FIELD_NUMBER = 11;
        public static final int MEAN_PROPUL_VEL_M_PER_S_X100_FIELD_NUMBER = 7;
        public static final int MEAN_VEL_M_PER_S_X100_FIELD_NUMBER = 5;
        public static final int PEAK_POWER_WATT_FIELD_NUMBER = 10;
        public static final int PEAK_VEL_M_PER_S_X100_FIELD_NUMBER = 6;
        public static final int REP_NUMBER_FIELD_NUMBER = 4;
        public static final int ROM_CM_X100_FIELD_NUMBER = 9;
        public static final int SET_NUMBER_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int athleteId_;
        private int avgDurationSecondX100_;
        private int avgEccDurationSecondX100_;
        private int avgEccMeanVelMPerSX100_;
        private int avgEccPeakVelMPerSX100_;
        private int avgEccRomCmX100_;
        private float avgMeanPowerWatt_;
        private int avgMeanPropulVelMPerSX100_;
        private int avgMeanVelMPerSX100_;
        private float avgPeakPowerWatt_;
        private int avgPeakVelMPerSX100_;
        private int avgRomCmX100_;
        private Internal.IntList barPathPoints_;
        private int bitField0_;
        private int durationSecondX100_;
        private int eccDurationSecondX100_;
        private int eccMeanVelMPerSX100_;
        private int eccPeakVelMPerSX100_;
        private int eccRomCmX100_;
        private int groupId_;
        private float meanPowerWatt_;
        private int meanPropulVelMPerSX100_;
        private int meanVelMPerSX100_;
        private byte memoizedIsInitialized;
        private float peakPowerWatt_;
        private int peakVelMPerSX100_;
        private int repNumber_;
        private int romCmX100_;
        private int setNumber_;
        private static final MetricsNotification DEFAULT_INSTANCE = new MetricsNotification();

        @Deprecated
        public static final Parser<MetricsNotification> PARSER = new AbstractParser<MetricsNotification>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotification.1
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
            this.groupId_ = 0;
            this.athleteId_ = 0;
            this.setNumber_ = 0;
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
            this.avgMeanVelMPerSX100_ = 0;
            this.avgPeakVelMPerSX100_ = 0;
            this.avgMeanPropulVelMPerSX100_ = 0;
            this.avgDurationSecondX100_ = 0;
            this.avgRomCmX100_ = 0;
            this.avgPeakPowerWatt_ = 0.0f;
            this.avgMeanPowerWatt_ = 0.0f;
            this.avgEccMeanVelMPerSX100_ = 0;
            this.avgEccPeakVelMPerSX100_ = 0;
            this.avgEccDurationSecondX100_ = 0;
            this.avgEccRomCmX100_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.barPathPoints_ = GeneratedMessageV3.emptyIntList();
        }

        public static MetricsNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_MetricsNotification_descriptor;
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
            if (hasGroupId() != metricsNotification.hasGroupId()) {
                return false;
            }
            if ((hasGroupId() && getGroupId() != metricsNotification.getGroupId()) || hasAthleteId() != metricsNotification.hasAthleteId()) {
                return false;
            }
            if ((hasAthleteId() && getAthleteId() != metricsNotification.getAthleteId()) || hasSetNumber() != metricsNotification.hasSetNumber()) {
                return false;
            }
            if ((hasSetNumber() && getSetNumber() != metricsNotification.getSetNumber()) || hasRepNumber() != metricsNotification.hasRepNumber()) {
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
            if ((hasEccDurationSecondX100() && getEccDurationSecondX100() != metricsNotification.getEccDurationSecondX100()) || hasEccRomCmX100() != metricsNotification.hasEccRomCmX100()) {
                return false;
            }
            if ((hasEccRomCmX100() && getEccRomCmX100() != metricsNotification.getEccRomCmX100()) || hasAvgMeanVelMPerSX100() != metricsNotification.hasAvgMeanVelMPerSX100()) {
                return false;
            }
            if ((hasAvgMeanVelMPerSX100() && getAvgMeanVelMPerSX100() != metricsNotification.getAvgMeanVelMPerSX100()) || hasAvgPeakVelMPerSX100() != metricsNotification.hasAvgPeakVelMPerSX100()) {
                return false;
            }
            if ((hasAvgPeakVelMPerSX100() && getAvgPeakVelMPerSX100() != metricsNotification.getAvgPeakVelMPerSX100()) || hasAvgMeanPropulVelMPerSX100() != metricsNotification.hasAvgMeanPropulVelMPerSX100()) {
                return false;
            }
            if ((hasAvgMeanPropulVelMPerSX100() && getAvgMeanPropulVelMPerSX100() != metricsNotification.getAvgMeanPropulVelMPerSX100()) || hasAvgDurationSecondX100() != metricsNotification.hasAvgDurationSecondX100()) {
                return false;
            }
            if ((hasAvgDurationSecondX100() && getAvgDurationSecondX100() != metricsNotification.getAvgDurationSecondX100()) || hasAvgRomCmX100() != metricsNotification.hasAvgRomCmX100()) {
                return false;
            }
            if ((hasAvgRomCmX100() && getAvgRomCmX100() != metricsNotification.getAvgRomCmX100()) || hasAvgPeakPowerWatt() != metricsNotification.hasAvgPeakPowerWatt()) {
                return false;
            }
            if ((hasAvgPeakPowerWatt() && Float.floatToIntBits(getAvgPeakPowerWatt()) != Float.floatToIntBits(metricsNotification.getAvgPeakPowerWatt())) || hasAvgMeanPowerWatt() != metricsNotification.hasAvgMeanPowerWatt()) {
                return false;
            }
            if ((hasAvgMeanPowerWatt() && Float.floatToIntBits(getAvgMeanPowerWatt()) != Float.floatToIntBits(metricsNotification.getAvgMeanPowerWatt())) || hasAvgEccMeanVelMPerSX100() != metricsNotification.hasAvgEccMeanVelMPerSX100()) {
                return false;
            }
            if ((hasAvgEccMeanVelMPerSX100() && getAvgEccMeanVelMPerSX100() != metricsNotification.getAvgEccMeanVelMPerSX100()) || hasAvgEccPeakVelMPerSX100() != metricsNotification.hasAvgEccPeakVelMPerSX100()) {
                return false;
            }
            if ((hasAvgEccPeakVelMPerSX100() && getAvgEccPeakVelMPerSX100() != metricsNotification.getAvgEccPeakVelMPerSX100()) || hasAvgEccDurationSecondX100() != metricsNotification.hasAvgEccDurationSecondX100()) {
                return false;
            }
            if ((!hasAvgEccDurationSecondX100() || getAvgEccDurationSecondX100() == metricsNotification.getAvgEccDurationSecondX100()) && hasAvgEccRomCmX100() == metricsNotification.hasAvgEccRomCmX100()) {
                return (!hasAvgEccRomCmX100() || getAvgEccRomCmX100() == metricsNotification.getAvgEccRomCmX100()) && getUnknownFields().equals(metricsNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getAthleteId() {
            return this.athleteId_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getAvgDurationSecondX100() {
            return this.avgDurationSecondX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getAvgEccDurationSecondX100() {
            return this.avgEccDurationSecondX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getAvgEccMeanVelMPerSX100() {
            return this.avgEccMeanVelMPerSX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getAvgEccPeakVelMPerSX100() {
            return this.avgEccPeakVelMPerSX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getAvgEccRomCmX100() {
            return this.avgEccRomCmX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public float getAvgMeanPowerWatt() {
            return this.avgMeanPowerWatt_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getAvgMeanPropulVelMPerSX100() {
            return this.avgMeanPropulVelMPerSX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getAvgMeanVelMPerSX100() {
            return this.avgMeanVelMPerSX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public float getAvgPeakPowerWatt() {
            return this.avgPeakPowerWatt_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getAvgPeakVelMPerSX100() {
            return this.avgPeakVelMPerSX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getAvgRomCmX100() {
            return this.avgRomCmX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getBarPathPoints(int i14) {
            return this.barPathPoints_.getInt(i14);
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getBarPathPointsCount() {
            return this.barPathPoints_.size();
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public List<Integer> getBarPathPointsList() {
            return this.barPathPoints_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getDurationSecondX100() {
            return this.durationSecondX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getEccDurationSecondX100() {
            return this.eccDurationSecondX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getEccMeanVelMPerSX100() {
            return this.eccMeanVelMPerSX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getEccPeakVelMPerSX100() {
            return this.eccPeakVelMPerSX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getEccRomCmX100() {
            return this.eccRomCmX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getGroupId() {
            return this.groupId_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public float getMeanPowerWatt() {
            return this.meanPowerWatt_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getMeanPropulVelMPerSX100() {
            return this.meanPropulVelMPerSX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getMeanVelMPerSX100() {
            return this.meanVelMPerSX100_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MetricsNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public float getPeakPowerWatt() {
            return this.peakPowerWatt_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getPeakVelMPerSX100() {
            return this.peakVelMPerSX100_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getRepNumber() {
            return this.repNumber_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getRomCmX100() {
            return this.romCmX100_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.groupId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.athleteId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.setNumber_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.repNumber_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.meanVelMPerSX100_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(6, this.peakVelMPerSX100_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(7, this.meanPropulVelMPerSX100_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(8, this.durationSecondX100_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(9, this.romCmX100_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeFloatSize(10, this.peakPowerWatt_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeFloatSize(11, this.meanPowerWatt_);
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i15 = 0; i15 < this.barPathPoints_.size(); i15++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.barPathPoints_.getInt(i15));
            }
            int size = getBarPathPointsList().size() + iComputeUInt32Size + iComputeInt32SizeNoTag;
            if ((this.bitField0_ & 2048) != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.eccMeanVelMPerSX100_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.eccPeakVelMPerSX100_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.eccDurationSecondX100_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                size += CodedOutputStream.computeUInt32Size(16, this.eccRomCmX100_);
            }
            if ((this.bitField0_ & 32768) != 0) {
                size += CodedOutputStream.computeUInt32Size(17, this.avgMeanVelMPerSX100_);
            }
            if ((this.bitField0_ & 65536) != 0) {
                size += CodedOutputStream.computeUInt32Size(18, this.avgPeakVelMPerSX100_);
            }
            if ((this.bitField0_ & 131072) != 0) {
                size += CodedOutputStream.computeUInt32Size(19, this.avgMeanPropulVelMPerSX100_);
            }
            if ((this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                size += CodedOutputStream.computeUInt32Size(20, this.avgDurationSecondX100_);
            }
            if ((this.bitField0_ & 524288) != 0) {
                size += CodedOutputStream.computeUInt32Size(21, this.avgRomCmX100_);
            }
            if ((this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                size += CodedOutputStream.computeFloatSize(22, this.avgPeakPowerWatt_);
            }
            if ((this.bitField0_ & 2097152) != 0) {
                size += CodedOutputStream.computeFloatSize(23, this.avgMeanPowerWatt_);
            }
            if ((this.bitField0_ & 4194304) != 0) {
                size += CodedOutputStream.computeUInt32Size(24, this.avgEccMeanVelMPerSX100_);
            }
            if ((this.bitField0_ & 8388608) != 0) {
                size += CodedOutputStream.computeUInt32Size(25, this.avgEccPeakVelMPerSX100_);
            }
            if ((this.bitField0_ & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0) {
                size += CodedOutputStream.computeUInt32Size(26, this.avgEccDurationSecondX100_);
            }
            if ((this.bitField0_ & 33554432) != 0) {
                size += CodedOutputStream.computeUInt32Size(27, this.avgEccRomCmX100_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public int getSetNumber() {
            return this.setNumber_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasAthleteId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasAvgDurationSecondX100() {
            return (this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasAvgEccDurationSecondX100() {
            return (this.bitField0_ & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasAvgEccMeanVelMPerSX100() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasAvgEccPeakVelMPerSX100() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasAvgEccRomCmX100() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasAvgMeanPowerWatt() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasAvgMeanPropulVelMPerSX100() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasAvgMeanVelMPerSX100() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasAvgPeakPowerWatt() {
            return (this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasAvgPeakVelMPerSX100() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasAvgRomCmX100() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasDurationSecondX100() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasEccDurationSecondX100() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasEccMeanVelMPerSX100() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasEccPeakVelMPerSX100() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasEccRomCmX100() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasGroupId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasMeanPowerWatt() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasMeanPropulVelMPerSX100() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasMeanVelMPerSX100() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasPeakPowerWatt() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasPeakVelMPerSX100() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasRepNumber() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasRomCmX100() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
        public boolean hasSetNumber() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGroupId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getGroupId();
            }
            if (hasAthleteId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getAthleteId();
            }
            if (hasSetNumber()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSetNumber();
            }
            if (hasRepNumber()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getRepNumber();
            }
            if (hasMeanVelMPerSX100()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getMeanVelMPerSX100();
            }
            if (hasPeakVelMPerSX100()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getPeakVelMPerSX100();
            }
            if (hasMeanPropulVelMPerSX100()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getMeanPropulVelMPerSX100();
            }
            if (hasDurationSecondX100()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getDurationSecondX100();
            }
            if (hasRomCmX100()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getRomCmX100();
            }
            if (hasPeakPowerWatt()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + Float.floatToIntBits(getPeakPowerWatt());
            }
            if (hasMeanPowerWatt()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + Float.floatToIntBits(getMeanPowerWatt());
            }
            if (getBarPathPointsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getBarPathPointsList().hashCode();
            }
            if (hasEccMeanVelMPerSX100()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getEccMeanVelMPerSX100();
            }
            if (hasEccPeakVelMPerSX100()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + getEccPeakVelMPerSX100();
            }
            if (hasEccDurationSecondX100()) {
                iHashCode = e5.c(iHashCode, 37, 15, 53) + getEccDurationSecondX100();
            }
            if (hasEccRomCmX100()) {
                iHashCode = e5.c(iHashCode, 37, 16, 53) + getEccRomCmX100();
            }
            if (hasAvgMeanVelMPerSX100()) {
                iHashCode = e5.c(iHashCode, 37, 17, 53) + getAvgMeanVelMPerSX100();
            }
            if (hasAvgPeakVelMPerSX100()) {
                iHashCode = e5.c(iHashCode, 37, 18, 53) + getAvgPeakVelMPerSX100();
            }
            if (hasAvgMeanPropulVelMPerSX100()) {
                iHashCode = e5.c(iHashCode, 37, 19, 53) + getAvgMeanPropulVelMPerSX100();
            }
            if (hasAvgDurationSecondX100()) {
                iHashCode = e5.c(iHashCode, 37, 20, 53) + getAvgDurationSecondX100();
            }
            if (hasAvgRomCmX100()) {
                iHashCode = e5.c(iHashCode, 37, 21, 53) + getAvgRomCmX100();
            }
            if (hasAvgPeakPowerWatt()) {
                iHashCode = e5.c(iHashCode, 37, 22, 53) + Float.floatToIntBits(getAvgPeakPowerWatt());
            }
            if (hasAvgMeanPowerWatt()) {
                iHashCode = e5.c(iHashCode, 37, 23, 53) + Float.floatToIntBits(getAvgMeanPowerWatt());
            }
            if (hasAvgEccMeanVelMPerSX100()) {
                iHashCode = e5.c(iHashCode, 37, 24, 53) + getAvgEccMeanVelMPerSX100();
            }
            if (hasAvgEccPeakVelMPerSX100()) {
                iHashCode = e5.c(iHashCode, 37, 25, 53) + getAvgEccPeakVelMPerSX100();
            }
            if (hasAvgEccDurationSecondX100()) {
                iHashCode = e5.c(iHashCode, 37, 26, 53) + getAvgEccDurationSecondX100();
            }
            if (hasAvgEccRomCmX100()) {
                iHashCode = e5.c(iHashCode, 37, 27, 53) + getAvgEccRomCmX100();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_MetricsNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(MetricsNotification.class, Builder.class);
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
                codedOutputStream.writeUInt32(1, this.groupId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.athleteId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.setNumber_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.repNumber_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.meanVelMPerSX100_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.peakVelMPerSX100_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(7, this.meanPropulVelMPerSX100_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeUInt32(8, this.durationSecondX100_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeUInt32(9, this.romCmX100_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeFloat(10, this.peakPowerWatt_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeFloat(11, this.meanPowerWatt_);
            }
            for (int i14 = 0; i14 < this.barPathPoints_.size(); i14++) {
                codedOutputStream.writeInt32(12, this.barPathPoints_.getInt(i14));
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeUInt32(13, this.eccMeanVelMPerSX100_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeUInt32(14, this.eccPeakVelMPerSX100_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeUInt32(15, this.eccDurationSecondX100_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                codedOutputStream.writeUInt32(16, this.eccRomCmX100_);
            }
            if ((this.bitField0_ & 32768) != 0) {
                codedOutputStream.writeUInt32(17, this.avgMeanVelMPerSX100_);
            }
            if ((this.bitField0_ & 65536) != 0) {
                codedOutputStream.writeUInt32(18, this.avgPeakVelMPerSX100_);
            }
            if ((this.bitField0_ & 131072) != 0) {
                codedOutputStream.writeUInt32(19, this.avgMeanPropulVelMPerSX100_);
            }
            if ((this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                codedOutputStream.writeUInt32(20, this.avgDurationSecondX100_);
            }
            if ((this.bitField0_ & 524288) != 0) {
                codedOutputStream.writeUInt32(21, this.avgRomCmX100_);
            }
            if ((this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                codedOutputStream.writeFloat(22, this.avgPeakPowerWatt_);
            }
            if ((this.bitField0_ & 2097152) != 0) {
                codedOutputStream.writeFloat(23, this.avgMeanPowerWatt_);
            }
            if ((this.bitField0_ & 4194304) != 0) {
                codedOutputStream.writeUInt32(24, this.avgEccMeanVelMPerSX100_);
            }
            if ((this.bitField0_ & 8388608) != 0) {
                codedOutputStream.writeUInt32(25, this.avgEccPeakVelMPerSX100_);
            }
            if ((this.bitField0_ & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0) {
                codedOutputStream.writeUInt32(26, this.avgEccDurationSecondX100_);
            }
            if ((this.bitField0_ & 33554432) != 0) {
                codedOutputStream.writeUInt32(27, this.avgEccRomCmX100_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MetricsNotificationOrBuilder {
            private int athleteId_;
            private int avgDurationSecondX100_;
            private int avgEccDurationSecondX100_;
            private int avgEccMeanVelMPerSX100_;
            private int avgEccPeakVelMPerSX100_;
            private int avgEccRomCmX100_;
            private float avgMeanPowerWatt_;
            private int avgMeanPropulVelMPerSX100_;
            private int avgMeanVelMPerSX100_;
            private float avgPeakPowerWatt_;
            private int avgPeakVelMPerSX100_;
            private int avgRomCmX100_;
            private Internal.IntList barPathPoints_;
            private int bitField0_;
            private int durationSecondX100_;
            private int eccDurationSecondX100_;
            private int eccMeanVelMPerSX100_;
            private int eccPeakVelMPerSX100_;
            private int eccRomCmX100_;
            private int groupId_;
            private float meanPowerWatt_;
            private int meanPropulVelMPerSX100_;
            private int meanVelMPerSX100_;
            private float peakPowerWatt_;
            private int peakVelMPerSX100_;
            private int repNumber_;
            private int romCmX100_;
            private int setNumber_;

            private Builder() {
                this.barPathPoints_ = GeneratedMessageV3.emptyIntList();
            }

            private void buildPartial0(MetricsNotification metricsNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    metricsNotification.groupId_ = this.groupId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    metricsNotification.athleteId_ = this.athleteId_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    metricsNotification.setNumber_ = this.setNumber_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    metricsNotification.repNumber_ = this.repNumber_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    metricsNotification.meanVelMPerSX100_ = this.meanVelMPerSX100_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    metricsNotification.peakVelMPerSX100_ = this.peakVelMPerSX100_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    metricsNotification.meanPropulVelMPerSX100_ = this.meanPropulVelMPerSX100_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    metricsNotification.durationSecondX100_ = this.durationSecondX100_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    metricsNotification.romCmX100_ = this.romCmX100_;
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    metricsNotification.peakPowerWatt_ = this.peakPowerWatt_;
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    metricsNotification.meanPowerWatt_ = this.meanPowerWatt_;
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    this.barPathPoints_.makeImmutable();
                    metricsNotification.barPathPoints_ = this.barPathPoints_;
                }
                if ((i15 & 4096) != 0) {
                    metricsNotification.eccMeanVelMPerSX100_ = this.eccMeanVelMPerSX100_;
                    i14 |= 2048;
                }
                if ((i15 & 8192) != 0) {
                    metricsNotification.eccPeakVelMPerSX100_ = this.eccPeakVelMPerSX100_;
                    i14 |= 4096;
                }
                if ((i15 & 16384) != 0) {
                    metricsNotification.eccDurationSecondX100_ = this.eccDurationSecondX100_;
                    i14 |= 8192;
                }
                if ((i15 & 32768) != 0) {
                    metricsNotification.eccRomCmX100_ = this.eccRomCmX100_;
                    i14 |= 16384;
                }
                if ((i15 & 65536) != 0) {
                    metricsNotification.avgMeanVelMPerSX100_ = this.avgMeanVelMPerSX100_;
                    i14 |= 32768;
                }
                if ((i15 & 131072) != 0) {
                    metricsNotification.avgPeakVelMPerSX100_ = this.avgPeakVelMPerSX100_;
                    i14 |= 65536;
                }
                if ((i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                    metricsNotification.avgMeanPropulVelMPerSX100_ = this.avgMeanPropulVelMPerSX100_;
                    i14 |= 131072;
                }
                if ((i15 & 524288) != 0) {
                    metricsNotification.avgDurationSecondX100_ = this.avgDurationSecondX100_;
                    i14 |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                }
                if ((i15 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                    metricsNotification.avgRomCmX100_ = this.avgRomCmX100_;
                    i14 |= 524288;
                }
                if ((i15 & 2097152) != 0) {
                    metricsNotification.avgPeakPowerWatt_ = this.avgPeakPowerWatt_;
                    i14 |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                }
                if ((i15 & 4194304) != 0) {
                    metricsNotification.avgMeanPowerWatt_ = this.avgMeanPowerWatt_;
                    i14 |= 2097152;
                }
                if ((i15 & 8388608) != 0) {
                    metricsNotification.avgEccMeanVelMPerSX100_ = this.avgEccMeanVelMPerSX100_;
                    i14 |= 4194304;
                }
                if ((i15 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0) {
                    metricsNotification.avgEccPeakVelMPerSX100_ = this.avgEccPeakVelMPerSX100_;
                    i14 |= 8388608;
                }
                if ((i15 & 33554432) != 0) {
                    metricsNotification.avgEccDurationSecondX100_ = this.avgEccDurationSecondX100_;
                    i14 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                }
                if ((i15 & 67108864) != 0) {
                    metricsNotification.avgEccRomCmX100_ = this.avgEccRomCmX100_;
                    i14 |= 33554432;
                }
                metricsNotification.bitField0_ |= i14;
            }

            private void ensureBarPathPointsIsMutable() {
                if (!this.barPathPoints_.isModifiable()) {
                    this.barPathPoints_ = (Internal.IntList) GeneratedMessageV3.makeMutableCopy(this.barPathPoints_);
                }
                this.bitField0_ |= 2048;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_MetricsNotification_descriptor;
            }

            public Builder addAllBarPathPoints(Iterable<? extends Integer> iterable) {
                ensureBarPathPointsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.barPathPoints_);
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder addBarPathPoints(int i14) {
                ensureBarPathPointsIsMutable();
                this.barPathPoints_.addInt(i14);
                this.bitField0_ |= 2048;
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
                this.groupId_ = 0;
                this.athleteId_ = 0;
                this.setNumber_ = 0;
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
                this.avgMeanVelMPerSX100_ = 0;
                this.avgPeakVelMPerSX100_ = 0;
                this.avgMeanPropulVelMPerSX100_ = 0;
                this.avgDurationSecondX100_ = 0;
                this.avgRomCmX100_ = 0;
                this.avgPeakPowerWatt_ = 0.0f;
                this.avgMeanPowerWatt_ = 0.0f;
                this.avgEccMeanVelMPerSX100_ = 0;
                this.avgEccPeakVelMPerSX100_ = 0;
                this.avgEccDurationSecondX100_ = 0;
                this.avgEccRomCmX100_ = 0;
                return this;
            }

            public Builder clearAthleteId() {
                this.bitField0_ &= -3;
                this.athleteId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAvgDurationSecondX100() {
                this.bitField0_ &= -524289;
                this.avgDurationSecondX100_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAvgEccDurationSecondX100() {
                this.bitField0_ &= -33554433;
                this.avgEccDurationSecondX100_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAvgEccMeanVelMPerSX100() {
                this.bitField0_ &= -8388609;
                this.avgEccMeanVelMPerSX100_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAvgEccPeakVelMPerSX100() {
                this.bitField0_ &= -16777217;
                this.avgEccPeakVelMPerSX100_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAvgEccRomCmX100() {
                this.bitField0_ &= -67108865;
                this.avgEccRomCmX100_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAvgMeanPowerWatt() {
                this.bitField0_ &= -4194305;
                this.avgMeanPowerWatt_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearAvgMeanPropulVelMPerSX100() {
                this.bitField0_ &= -262145;
                this.avgMeanPropulVelMPerSX100_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAvgMeanVelMPerSX100() {
                this.bitField0_ &= -65537;
                this.avgMeanVelMPerSX100_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAvgPeakPowerWatt() {
                this.bitField0_ &= -2097153;
                this.avgPeakPowerWatt_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearAvgPeakVelMPerSX100() {
                this.bitField0_ &= -131073;
                this.avgPeakVelMPerSX100_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAvgRomCmX100() {
                this.bitField0_ &= -1048577;
                this.avgRomCmX100_ = 0;
                onChanged();
                return this;
            }

            public Builder clearBarPathPoints() {
                this.barPathPoints_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= -2049;
                onChanged();
                return this;
            }

            public Builder clearDurationSecondX100() {
                this.bitField0_ &= -129;
                this.durationSecondX100_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEccDurationSecondX100() {
                this.bitField0_ &= -16385;
                this.eccDurationSecondX100_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEccMeanVelMPerSX100() {
                this.bitField0_ &= -4097;
                this.eccMeanVelMPerSX100_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEccPeakVelMPerSX100() {
                this.bitField0_ &= -8193;
                this.eccPeakVelMPerSX100_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEccRomCmX100() {
                this.bitField0_ &= -32769;
                this.eccRomCmX100_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGroupId() {
                this.bitField0_ &= -2;
                this.groupId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMeanPowerWatt() {
                this.bitField0_ &= -1025;
                this.meanPowerWatt_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearMeanPropulVelMPerSX100() {
                this.bitField0_ &= -65;
                this.meanPropulVelMPerSX100_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMeanVelMPerSX100() {
                this.bitField0_ &= -17;
                this.meanVelMPerSX100_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPeakPowerWatt() {
                this.bitField0_ &= -513;
                this.peakPowerWatt_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearPeakVelMPerSX100() {
                this.bitField0_ &= -33;
                this.peakVelMPerSX100_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRepNumber() {
                this.bitField0_ &= -9;
                this.repNumber_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRomCmX100() {
                this.bitField0_ &= -257;
                this.romCmX100_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSetNumber() {
                this.bitField0_ &= -5;
                this.setNumber_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getAthleteId() {
                return this.athleteId_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getAvgDurationSecondX100() {
                return this.avgDurationSecondX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getAvgEccDurationSecondX100() {
                return this.avgEccDurationSecondX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getAvgEccMeanVelMPerSX100() {
                return this.avgEccMeanVelMPerSX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getAvgEccPeakVelMPerSX100() {
                return this.avgEccPeakVelMPerSX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getAvgEccRomCmX100() {
                return this.avgEccRomCmX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public float getAvgMeanPowerWatt() {
                return this.avgMeanPowerWatt_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getAvgMeanPropulVelMPerSX100() {
                return this.avgMeanPropulVelMPerSX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getAvgMeanVelMPerSX100() {
                return this.avgMeanVelMPerSX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public float getAvgPeakPowerWatt() {
                return this.avgPeakPowerWatt_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getAvgPeakVelMPerSX100() {
                return this.avgPeakVelMPerSX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getAvgRomCmX100() {
                return this.avgRomCmX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getBarPathPoints(int i14) {
                return this.barPathPoints_.getInt(i14);
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getBarPathPointsCount() {
                return this.barPathPoints_.size();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public List<Integer> getBarPathPointsList() {
                this.barPathPoints_.makeImmutable();
                return this.barPathPoints_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_MetricsNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getDurationSecondX100() {
                return this.durationSecondX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getEccDurationSecondX100() {
                return this.eccDurationSecondX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getEccMeanVelMPerSX100() {
                return this.eccMeanVelMPerSX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getEccPeakVelMPerSX100() {
                return this.eccPeakVelMPerSX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getEccRomCmX100() {
                return this.eccRomCmX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getGroupId() {
                return this.groupId_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public float getMeanPowerWatt() {
                return this.meanPowerWatt_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getMeanPropulVelMPerSX100() {
                return this.meanPropulVelMPerSX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getMeanVelMPerSX100() {
                return this.meanVelMPerSX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public float getPeakPowerWatt() {
                return this.peakPowerWatt_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getPeakVelMPerSX100() {
                return this.peakVelMPerSX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getRepNumber() {
                return this.repNumber_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getRomCmX100() {
                return this.romCmX100_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public int getSetNumber() {
                return this.setNumber_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasAthleteId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasAvgDurationSecondX100() {
                return (this.bitField0_ & 524288) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasAvgEccDurationSecondX100() {
                return (this.bitField0_ & 33554432) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasAvgEccMeanVelMPerSX100() {
                return (this.bitField0_ & 8388608) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasAvgEccPeakVelMPerSX100() {
                return (this.bitField0_ & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasAvgEccRomCmX100() {
                return (this.bitField0_ & 67108864) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasAvgMeanPowerWatt() {
                return (this.bitField0_ & 4194304) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasAvgMeanPropulVelMPerSX100() {
                return (this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasAvgMeanVelMPerSX100() {
                return (this.bitField0_ & 65536) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasAvgPeakPowerWatt() {
                return (this.bitField0_ & 2097152) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasAvgPeakVelMPerSX100() {
                return (this.bitField0_ & 131072) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasAvgRomCmX100() {
                return (this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasDurationSecondX100() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasEccDurationSecondX100() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasEccMeanVelMPerSX100() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasEccPeakVelMPerSX100() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasEccRomCmX100() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasGroupId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasMeanPowerWatt() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasMeanPropulVelMPerSX100() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasMeanVelMPerSX100() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasPeakPowerWatt() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasPeakVelMPerSX100() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasRepNumber() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasRomCmX100() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.MetricsNotificationOrBuilder
            public boolean hasSetNumber() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_MetricsNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(MetricsNotification.class, Builder.class);
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
                                    this.groupId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 16:
                                    this.athleteId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 24:
                                    this.setNumber_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 32:
                                    this.repNumber_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 40:
                                    this.meanVelMPerSX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 48:
                                    this.peakVelMPerSX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 56:
                                    this.meanPropulVelMPerSX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 64:
                                    this.durationSecondX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 72:
                                    this.romCmX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 256;
                                    continue;
                                case 85:
                                    this.peakPowerWatt_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 512;
                                    continue;
                                case 93:
                                    this.meanPowerWatt_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 96:
                                    int int32 = codedInputStream.readInt32();
                                    ensureBarPathPointsIsMutable();
                                    this.barPathPoints_.addInt(int32);
                                    continue;
                                case 98:
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    ensureBarPathPointsIsMutable();
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.barPathPoints_.addInt(codedInputStream.readInt32());
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                    continue;
                                case 104:
                                    this.eccMeanVelMPerSX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 112:
                                    this.eccPeakVelMPerSX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8192;
                                    continue;
                                case 120:
                                    this.eccDurationSecondX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16384;
                                    continue;
                                case 128:
                                    this.eccRomCmX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32768;
                                    continue;
                                case SyslogConstants.LOG_LOCAL1 /* 136 */:
                                    this.avgMeanVelMPerSX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 65536;
                                    continue;
                                case SyslogConstants.LOG_LOCAL2 /* 144 */:
                                    this.avgPeakVelMPerSX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 131072;
                                    continue;
                                case SyslogConstants.LOG_LOCAL3 /* 152 */:
                                    this.avgMeanPropulVelMPerSX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                                    continue;
                                case SyslogConstants.LOG_LOCAL4 /* 160 */:
                                    this.avgDurationSecondX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 524288;
                                    continue;
                                case 168:
                                    this.avgRomCmX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                    continue;
                                case 181:
                                    this.avgPeakPowerWatt_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 2097152;
                                    continue;
                                case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                                    this.avgMeanPowerWatt_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 4194304;
                                    continue;
                                case 192:
                                    this.avgEccMeanVelMPerSX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8388608;
                                    continue;
                                case 200:
                                    this.avgEccPeakVelMPerSX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                                    continue;
                                case 208:
                                    this.avgEccDurationSecondX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 33554432;
                                    continue;
                                case 216:
                                    this.avgEccRomCmX100_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 67108864;
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

            public Builder setAthleteId(int i14) {
                this.athleteId_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setAvgDurationSecondX100(int i14) {
                this.avgDurationSecondX100_ = i14;
                this.bitField0_ |= 524288;
                onChanged();
                return this;
            }

            public Builder setAvgEccDurationSecondX100(int i14) {
                this.avgEccDurationSecondX100_ = i14;
                this.bitField0_ |= 33554432;
                onChanged();
                return this;
            }

            public Builder setAvgEccMeanVelMPerSX100(int i14) {
                this.avgEccMeanVelMPerSX100_ = i14;
                this.bitField0_ |= 8388608;
                onChanged();
                return this;
            }

            public Builder setAvgEccPeakVelMPerSX100(int i14) {
                this.avgEccPeakVelMPerSX100_ = i14;
                this.bitField0_ |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                onChanged();
                return this;
            }

            public Builder setAvgEccRomCmX100(int i14) {
                this.avgEccRomCmX100_ = i14;
                this.bitField0_ |= 67108864;
                onChanged();
                return this;
            }

            public Builder setAvgMeanPowerWatt(float f14) {
                this.avgMeanPowerWatt_ = f14;
                this.bitField0_ |= 4194304;
                onChanged();
                return this;
            }

            public Builder setAvgMeanPropulVelMPerSX100(int i14) {
                this.avgMeanPropulVelMPerSX100_ = i14;
                this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                onChanged();
                return this;
            }

            public Builder setAvgMeanVelMPerSX100(int i14) {
                this.avgMeanVelMPerSX100_ = i14;
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setAvgPeakPowerWatt(float f14) {
                this.avgPeakPowerWatt_ = f14;
                this.bitField0_ |= 2097152;
                onChanged();
                return this;
            }

            public Builder setAvgPeakVelMPerSX100(int i14) {
                this.avgPeakVelMPerSX100_ = i14;
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setAvgRomCmX100(int i14) {
                this.avgRomCmX100_ = i14;
                this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                onChanged();
                return this;
            }

            public Builder setBarPathPoints(int i14, int i15) {
                ensureBarPathPointsIsMutable();
                this.barPathPoints_.setInt(i14, i15);
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setDurationSecondX100(int i14) {
                this.durationSecondX100_ = i14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setEccDurationSecondX100(int i14) {
                this.eccDurationSecondX100_ = i14;
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setEccMeanVelMPerSX100(int i14) {
                this.eccMeanVelMPerSX100_ = i14;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setEccPeakVelMPerSX100(int i14) {
                this.eccPeakVelMPerSX100_ = i14;
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setEccRomCmX100(int i14) {
                this.eccRomCmX100_ = i14;
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGroupId(int i14) {
                this.groupId_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMeanPowerWatt(float f14) {
                this.meanPowerWatt_ = f14;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setMeanPropulVelMPerSX100(int i14) {
                this.meanPropulVelMPerSX100_ = i14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setMeanVelMPerSX100(int i14) {
                this.meanVelMPerSX100_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setPeakPowerWatt(float f14) {
                this.peakPowerWatt_ = f14;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setPeakVelMPerSX100(int i14) {
                this.peakVelMPerSX100_ = i14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setRepNumber(int i14) {
                this.repNumber_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setRomCmX100(int i14) {
                this.romCmX100_ = i14;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setSetNumber(int i14) {
                this.setNumber_ = i14;
                this.bitField0_ |= 4;
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
                if (metricsNotification.hasGroupId()) {
                    setGroupId(metricsNotification.getGroupId());
                }
                if (metricsNotification.hasAthleteId()) {
                    setAthleteId(metricsNotification.getAthleteId());
                }
                if (metricsNotification.hasSetNumber()) {
                    setSetNumber(metricsNotification.getSetNumber());
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
                        this.bitField0_ |= 2048;
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
                if (metricsNotification.hasAvgMeanVelMPerSX100()) {
                    setAvgMeanVelMPerSX100(metricsNotification.getAvgMeanVelMPerSX100());
                }
                if (metricsNotification.hasAvgPeakVelMPerSX100()) {
                    setAvgPeakVelMPerSX100(metricsNotification.getAvgPeakVelMPerSX100());
                }
                if (metricsNotification.hasAvgMeanPropulVelMPerSX100()) {
                    setAvgMeanPropulVelMPerSX100(metricsNotification.getAvgMeanPropulVelMPerSX100());
                }
                if (metricsNotification.hasAvgDurationSecondX100()) {
                    setAvgDurationSecondX100(metricsNotification.getAvgDurationSecondX100());
                }
                if (metricsNotification.hasAvgRomCmX100()) {
                    setAvgRomCmX100(metricsNotification.getAvgRomCmX100());
                }
                if (metricsNotification.hasAvgPeakPowerWatt()) {
                    setAvgPeakPowerWatt(metricsNotification.getAvgPeakPowerWatt());
                }
                if (metricsNotification.hasAvgMeanPowerWatt()) {
                    setAvgMeanPowerWatt(metricsNotification.getAvgMeanPowerWatt());
                }
                if (metricsNotification.hasAvgEccMeanVelMPerSX100()) {
                    setAvgEccMeanVelMPerSX100(metricsNotification.getAvgEccMeanVelMPerSX100());
                }
                if (metricsNotification.hasAvgEccPeakVelMPerSX100()) {
                    setAvgEccPeakVelMPerSX100(metricsNotification.getAvgEccPeakVelMPerSX100());
                }
                if (metricsNotification.hasAvgEccDurationSecondX100()) {
                    setAvgEccDurationSecondX100(metricsNotification.getAvgEccDurationSecondX100());
                }
                if (metricsNotification.hasAvgEccRomCmX100()) {
                    setAvgEccRomCmX100(metricsNotification.getAvgEccRomCmX100());
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
            this.groupId_ = 0;
            this.athleteId_ = 0;
            this.setNumber_ = 0;
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
            this.avgMeanVelMPerSX100_ = 0;
            this.avgPeakVelMPerSX100_ = 0;
            this.avgMeanPropulVelMPerSX100_ = 0;
            this.avgDurationSecondX100_ = 0;
            this.avgRomCmX100_ = 0;
            this.avgPeakPowerWatt_ = 0.0f;
            this.avgMeanPowerWatt_ = 0.0f;
            this.avgEccMeanVelMPerSX100_ = 0;
            this.avgEccPeakVelMPerSX100_ = 0;
            this.avgEccDurationSecondX100_ = 0;
            this.avgEccRomCmX100_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ MetricsNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int DISPLAY_STATE_NOTIFICATION_FIELD_NUMBER = 11;
        public static final int GROUP_LIST_REQUEST_FIELD_NUMBER = 6;
        public static final int GROUP_LIST_RESPONSE_FIELD_NUMBER = 7;
        public static final int METRICS_NOTIFICATION_FIELD_NUMBER = 8;
        public static final int SET_END_NOTIFICATION_FIELD_NUMBER = 10;
        public static final int SET_START_NOTIFICATION_FIELD_NUMBER = 9;
        public static final int STATE_CHANGE_REQUEST_FIELD_NUMBER = 1;
        public static final int STATE_CHANGE_RESPONSE_FIELD_NUMBER = 2;
        public static final int STATION_SETTING_NOTIFICATION_FIELD_NUMBER = 5;
        public static final int STATION_SETTING_REQUEST_FIELD_NUMBER = 3;
        public static final int STATION_SETTING_RESPONSE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DisplayStateNotification displayStateNotification_;
        private GroupListRequest groupListRequest_;
        private GroupListResponse groupListResponse_;
        private byte memoizedIsInitialized;
        private MetricsNotification metricsNotification_;
        private SetEndNotification setEndNotification_;
        private SetStartNotification setStartNotification_;
        private StateChangeRequest stateChangeRequest_;
        private StateChangeResponse stateChangeResponse_;
        private StationSettingNotification stationSettingNotification_;
        private StationSettingRequest stationSettingRequest_;
        private StationSettingResponse stationSettingResponse_;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.Service.1
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
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_Service_descriptor;
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
            if ((hasStateChangeResponse() && !getStateChangeResponse().equals(service.getStateChangeResponse())) || hasStationSettingRequest() != service.hasStationSettingRequest()) {
                return false;
            }
            if ((hasStationSettingRequest() && !getStationSettingRequest().equals(service.getStationSettingRequest())) || hasStationSettingResponse() != service.hasStationSettingResponse()) {
                return false;
            }
            if ((hasStationSettingResponse() && !getStationSettingResponse().equals(service.getStationSettingResponse())) || hasStationSettingNotification() != service.hasStationSettingNotification()) {
                return false;
            }
            if ((hasStationSettingNotification() && !getStationSettingNotification().equals(service.getStationSettingNotification())) || hasGroupListRequest() != service.hasGroupListRequest()) {
                return false;
            }
            if ((hasGroupListRequest() && !getGroupListRequest().equals(service.getGroupListRequest())) || hasGroupListResponse() != service.hasGroupListResponse()) {
                return false;
            }
            if ((hasGroupListResponse() && !getGroupListResponse().equals(service.getGroupListResponse())) || hasMetricsNotification() != service.hasMetricsNotification()) {
                return false;
            }
            if ((hasMetricsNotification() && !getMetricsNotification().equals(service.getMetricsNotification())) || hasSetStartNotification() != service.hasSetStartNotification()) {
                return false;
            }
            if ((hasSetStartNotification() && !getSetStartNotification().equals(service.getSetStartNotification())) || hasSetEndNotification() != service.hasSetEndNotification()) {
                return false;
            }
            if ((!hasSetEndNotification() || getSetEndNotification().equals(service.getSetEndNotification())) && hasDisplayStateNotification() == service.hasDisplayStateNotification()) {
                return (!hasDisplayStateNotification() || getDisplayStateNotification().equals(service.getDisplayStateNotification())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public DisplayStateNotification getDisplayStateNotification() {
            DisplayStateNotification displayStateNotification = this.displayStateNotification_;
            return displayStateNotification == null ? DisplayStateNotification.getDefaultInstance() : displayStateNotification;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public DisplayStateNotificationOrBuilder getDisplayStateNotificationOrBuilder() {
            DisplayStateNotification displayStateNotification = this.displayStateNotification_;
            return displayStateNotification == null ? DisplayStateNotification.getDefaultInstance() : displayStateNotification;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public GroupListRequest getGroupListRequest() {
            GroupListRequest groupListRequest = this.groupListRequest_;
            return groupListRequest == null ? GroupListRequest.getDefaultInstance() : groupListRequest;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public GroupListRequestOrBuilder getGroupListRequestOrBuilder() {
            GroupListRequest groupListRequest = this.groupListRequest_;
            return groupListRequest == null ? GroupListRequest.getDefaultInstance() : groupListRequest;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public GroupListResponse getGroupListResponse() {
            GroupListResponse groupListResponse = this.groupListResponse_;
            return groupListResponse == null ? GroupListResponse.getDefaultInstance() : groupListResponse;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public GroupListResponseOrBuilder getGroupListResponseOrBuilder() {
            GroupListResponse groupListResponse = this.groupListResponse_;
            return groupListResponse == null ? GroupListResponse.getDefaultInstance() : groupListResponse;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public MetricsNotification getMetricsNotification() {
            MetricsNotification metricsNotification = this.metricsNotification_;
            return metricsNotification == null ? MetricsNotification.getDefaultInstance() : metricsNotification;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public MetricsNotificationOrBuilder getMetricsNotificationOrBuilder() {
            MetricsNotification metricsNotification = this.metricsNotification_;
            return metricsNotification == null ? MetricsNotification.getDefaultInstance() : metricsNotification;
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
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getStationSettingRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getStationSettingResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getStationSettingNotification());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getGroupListRequest());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getGroupListResponse());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getMetricsNotification());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getSetStartNotification());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getSetEndNotification());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getDisplayStateNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public SetEndNotification getSetEndNotification() {
            SetEndNotification setEndNotification = this.setEndNotification_;
            return setEndNotification == null ? SetEndNotification.getDefaultInstance() : setEndNotification;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public SetEndNotificationOrBuilder getSetEndNotificationOrBuilder() {
            SetEndNotification setEndNotification = this.setEndNotification_;
            return setEndNotification == null ? SetEndNotification.getDefaultInstance() : setEndNotification;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public SetStartNotification getSetStartNotification() {
            SetStartNotification setStartNotification = this.setStartNotification_;
            return setStartNotification == null ? SetStartNotification.getDefaultInstance() : setStartNotification;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public SetStartNotificationOrBuilder getSetStartNotificationOrBuilder() {
            SetStartNotification setStartNotification = this.setStartNotification_;
            return setStartNotification == null ? SetStartNotification.getDefaultInstance() : setStartNotification;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public StateChangeRequest getStateChangeRequest() {
            StateChangeRequest stateChangeRequest = this.stateChangeRequest_;
            return stateChangeRequest == null ? StateChangeRequest.getDefaultInstance() : stateChangeRequest;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public StateChangeRequestOrBuilder getStateChangeRequestOrBuilder() {
            StateChangeRequest stateChangeRequest = this.stateChangeRequest_;
            return stateChangeRequest == null ? StateChangeRequest.getDefaultInstance() : stateChangeRequest;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public StateChangeResponse getStateChangeResponse() {
            StateChangeResponse stateChangeResponse = this.stateChangeResponse_;
            return stateChangeResponse == null ? StateChangeResponse.getDefaultInstance() : stateChangeResponse;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public StateChangeResponseOrBuilder getStateChangeResponseOrBuilder() {
            StateChangeResponse stateChangeResponse = this.stateChangeResponse_;
            return stateChangeResponse == null ? StateChangeResponse.getDefaultInstance() : stateChangeResponse;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public StationSettingNotification getStationSettingNotification() {
            StationSettingNotification stationSettingNotification = this.stationSettingNotification_;
            return stationSettingNotification == null ? StationSettingNotification.getDefaultInstance() : stationSettingNotification;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public StationSettingNotificationOrBuilder getStationSettingNotificationOrBuilder() {
            StationSettingNotification stationSettingNotification = this.stationSettingNotification_;
            return stationSettingNotification == null ? StationSettingNotification.getDefaultInstance() : stationSettingNotification;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public StationSettingRequest getStationSettingRequest() {
            StationSettingRequest stationSettingRequest = this.stationSettingRequest_;
            return stationSettingRequest == null ? StationSettingRequest.getDefaultInstance() : stationSettingRequest;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public StationSettingRequestOrBuilder getStationSettingRequestOrBuilder() {
            StationSettingRequest stationSettingRequest = this.stationSettingRequest_;
            return stationSettingRequest == null ? StationSettingRequest.getDefaultInstance() : stationSettingRequest;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public StationSettingResponse getStationSettingResponse() {
            StationSettingResponse stationSettingResponse = this.stationSettingResponse_;
            return stationSettingResponse == null ? StationSettingResponse.getDefaultInstance() : stationSettingResponse;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public StationSettingResponseOrBuilder getStationSettingResponseOrBuilder() {
            StationSettingResponse stationSettingResponse = this.stationSettingResponse_;
            return stationSettingResponse == null ? StationSettingResponse.getDefaultInstance() : stationSettingResponse;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public boolean hasDisplayStateNotification() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public boolean hasGroupListRequest() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public boolean hasGroupListResponse() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public boolean hasMetricsNotification() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public boolean hasSetEndNotification() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public boolean hasSetStartNotification() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public boolean hasStateChangeRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public boolean hasStateChangeResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public boolean hasStationSettingNotification() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public boolean hasStationSettingRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
        public boolean hasStationSettingResponse() {
            return (this.bitField0_ & 8) != 0;
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
            if (hasStationSettingRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getStationSettingRequest().hashCode();
            }
            if (hasStationSettingResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getStationSettingResponse().hashCode();
            }
            if (hasStationSettingNotification()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getStationSettingNotification().hashCode();
            }
            if (hasGroupListRequest()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getGroupListRequest().hashCode();
            }
            if (hasGroupListResponse()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getGroupListResponse().hashCode();
            }
            if (hasMetricsNotification()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getMetricsNotification().hashCode();
            }
            if (hasSetStartNotification()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getSetStartNotification().hashCode();
            }
            if (hasSetEndNotification()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getSetEndNotification().hashCode();
            }
            if (hasDisplayStateNotification()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getDisplayStateNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(3, getStationSettingRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getStationSettingResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getStationSettingNotification());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getGroupListRequest());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getGroupListResponse());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getMetricsNotification());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getSetStartNotification());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getSetEndNotification());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getDisplayStateNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DisplayStateNotification, DisplayStateNotification.Builder, DisplayStateNotificationOrBuilder> displayStateNotificationBuilder_;
            private DisplayStateNotification displayStateNotification_;
            private SingleFieldBuilderV3<GroupListRequest, GroupListRequest.Builder, GroupListRequestOrBuilder> groupListRequestBuilder_;
            private GroupListRequest groupListRequest_;
            private SingleFieldBuilderV3<GroupListResponse, GroupListResponse.Builder, GroupListResponseOrBuilder> groupListResponseBuilder_;
            private GroupListResponse groupListResponse_;
            private SingleFieldBuilderV3<MetricsNotification, MetricsNotification.Builder, MetricsNotificationOrBuilder> metricsNotificationBuilder_;
            private MetricsNotification metricsNotification_;
            private SingleFieldBuilderV3<SetEndNotification, SetEndNotification.Builder, SetEndNotificationOrBuilder> setEndNotificationBuilder_;
            private SetEndNotification setEndNotification_;
            private SingleFieldBuilderV3<SetStartNotification, SetStartNotification.Builder, SetStartNotificationOrBuilder> setStartNotificationBuilder_;
            private SetStartNotification setStartNotification_;
            private SingleFieldBuilderV3<StateChangeRequest, StateChangeRequest.Builder, StateChangeRequestOrBuilder> stateChangeRequestBuilder_;
            private StateChangeRequest stateChangeRequest_;
            private SingleFieldBuilderV3<StateChangeResponse, StateChangeResponse.Builder, StateChangeResponseOrBuilder> stateChangeResponseBuilder_;
            private StateChangeResponse stateChangeResponse_;
            private SingleFieldBuilderV3<StationSettingNotification, StationSettingNotification.Builder, StationSettingNotificationOrBuilder> stationSettingNotificationBuilder_;
            private StationSettingNotification stationSettingNotification_;
            private SingleFieldBuilderV3<StationSettingRequest, StationSettingRequest.Builder, StationSettingRequestOrBuilder> stationSettingRequestBuilder_;
            private StationSettingRequest stationSettingRequest_;
            private SingleFieldBuilderV3<StationSettingResponse, StationSettingResponse.Builder, StationSettingResponseOrBuilder> stationSettingResponseBuilder_;
            private StationSettingResponse stationSettingResponse_;

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
                    SingleFieldBuilderV3<StationSettingRequest, StationSettingRequest.Builder, StationSettingRequestOrBuilder> singleFieldBuilderV5 = this.stationSettingRequestBuilder_;
                    service.stationSettingRequest_ = singleFieldBuilderV5 == null ? this.stationSettingRequest_ : (StationSettingRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<StationSettingResponse, StationSettingResponse.Builder, StationSettingResponseOrBuilder> singleFieldBuilderV6 = this.stationSettingResponseBuilder_;
                    service.stationSettingResponse_ = singleFieldBuilderV6 == null ? this.stationSettingResponse_ : (StationSettingResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<StationSettingNotification, StationSettingNotification.Builder, StationSettingNotificationOrBuilder> singleFieldBuilderV7 = this.stationSettingNotificationBuilder_;
                    service.stationSettingNotification_ = singleFieldBuilderV7 == null ? this.stationSettingNotification_ : (StationSettingNotification) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<GroupListRequest, GroupListRequest.Builder, GroupListRequestOrBuilder> singleFieldBuilderV8 = this.groupListRequestBuilder_;
                    service.groupListRequest_ = singleFieldBuilderV8 == null ? this.groupListRequest_ : (GroupListRequest) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<GroupListResponse, GroupListResponse.Builder, GroupListResponseOrBuilder> singleFieldBuilderV9 = this.groupListResponseBuilder_;
                    service.groupListResponse_ = singleFieldBuilderV9 == null ? this.groupListResponse_ : (GroupListResponse) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<MetricsNotification, MetricsNotification.Builder, MetricsNotificationOrBuilder> singleFieldBuilderV10 = this.metricsNotificationBuilder_;
                    service.metricsNotification_ = singleFieldBuilderV10 == null ? this.metricsNotification_ : (MetricsNotification) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<SetStartNotification, SetStartNotification.Builder, SetStartNotificationOrBuilder> singleFieldBuilderV11 = this.setStartNotificationBuilder_;
                    service.setStartNotification_ = singleFieldBuilderV11 == null ? this.setStartNotification_ : (SetStartNotification) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<SetEndNotification, SetEndNotification.Builder, SetEndNotificationOrBuilder> singleFieldBuilderV12 = this.setEndNotificationBuilder_;
                    service.setEndNotification_ = singleFieldBuilderV12 == null ? this.setEndNotification_ : (SetEndNotification) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<DisplayStateNotification, DisplayStateNotification.Builder, DisplayStateNotificationOrBuilder> singleFieldBuilderV13 = this.displayStateNotificationBuilder_;
                    service.displayStateNotification_ = singleFieldBuilderV13 == null ? this.displayStateNotification_ : (DisplayStateNotification) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                service.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_Service_descriptor;
            }

            private SingleFieldBuilderV3<DisplayStateNotification, DisplayStateNotification.Builder, DisplayStateNotificationOrBuilder> getDisplayStateNotificationFieldBuilder() {
                if (this.displayStateNotificationBuilder_ == null) {
                    this.displayStateNotificationBuilder_ = new SingleFieldBuilderV3<>(getDisplayStateNotification(), getParentForChildren(), isClean());
                    this.displayStateNotification_ = null;
                }
                return this.displayStateNotificationBuilder_;
            }

            private SingleFieldBuilderV3<GroupListRequest, GroupListRequest.Builder, GroupListRequestOrBuilder> getGroupListRequestFieldBuilder() {
                if (this.groupListRequestBuilder_ == null) {
                    this.groupListRequestBuilder_ = new SingleFieldBuilderV3<>(getGroupListRequest(), getParentForChildren(), isClean());
                    this.groupListRequest_ = null;
                }
                return this.groupListRequestBuilder_;
            }

            private SingleFieldBuilderV3<GroupListResponse, GroupListResponse.Builder, GroupListResponseOrBuilder> getGroupListResponseFieldBuilder() {
                if (this.groupListResponseBuilder_ == null) {
                    this.groupListResponseBuilder_ = new SingleFieldBuilderV3<>(getGroupListResponse(), getParentForChildren(), isClean());
                    this.groupListResponse_ = null;
                }
                return this.groupListResponseBuilder_;
            }

            private SingleFieldBuilderV3<MetricsNotification, MetricsNotification.Builder, MetricsNotificationOrBuilder> getMetricsNotificationFieldBuilder() {
                if (this.metricsNotificationBuilder_ == null) {
                    this.metricsNotificationBuilder_ = new SingleFieldBuilderV3<>(getMetricsNotification(), getParentForChildren(), isClean());
                    this.metricsNotification_ = null;
                }
                return this.metricsNotificationBuilder_;
            }

            private SingleFieldBuilderV3<SetEndNotification, SetEndNotification.Builder, SetEndNotificationOrBuilder> getSetEndNotificationFieldBuilder() {
                if (this.setEndNotificationBuilder_ == null) {
                    this.setEndNotificationBuilder_ = new SingleFieldBuilderV3<>(getSetEndNotification(), getParentForChildren(), isClean());
                    this.setEndNotification_ = null;
                }
                return this.setEndNotificationBuilder_;
            }

            private SingleFieldBuilderV3<SetStartNotification, SetStartNotification.Builder, SetStartNotificationOrBuilder> getSetStartNotificationFieldBuilder() {
                if (this.setStartNotificationBuilder_ == null) {
                    this.setStartNotificationBuilder_ = new SingleFieldBuilderV3<>(getSetStartNotification(), getParentForChildren(), isClean());
                    this.setStartNotification_ = null;
                }
                return this.setStartNotificationBuilder_;
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

            private SingleFieldBuilderV3<StationSettingNotification, StationSettingNotification.Builder, StationSettingNotificationOrBuilder> getStationSettingNotificationFieldBuilder() {
                if (this.stationSettingNotificationBuilder_ == null) {
                    this.stationSettingNotificationBuilder_ = new SingleFieldBuilderV3<>(getStationSettingNotification(), getParentForChildren(), isClean());
                    this.stationSettingNotification_ = null;
                }
                return this.stationSettingNotificationBuilder_;
            }

            private SingleFieldBuilderV3<StationSettingRequest, StationSettingRequest.Builder, StationSettingRequestOrBuilder> getStationSettingRequestFieldBuilder() {
                if (this.stationSettingRequestBuilder_ == null) {
                    this.stationSettingRequestBuilder_ = new SingleFieldBuilderV3<>(getStationSettingRequest(), getParentForChildren(), isClean());
                    this.stationSettingRequest_ = null;
                }
                return this.stationSettingRequestBuilder_;
            }

            private SingleFieldBuilderV3<StationSettingResponse, StationSettingResponse.Builder, StationSettingResponseOrBuilder> getStationSettingResponseFieldBuilder() {
                if (this.stationSettingResponseBuilder_ == null) {
                    this.stationSettingResponseBuilder_ = new SingleFieldBuilderV3<>(getStationSettingResponse(), getParentForChildren(), isClean());
                    this.stationSettingResponse_ = null;
                }
                return this.stationSettingResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getStateChangeRequestFieldBuilder();
                    getStateChangeResponseFieldBuilder();
                    getStationSettingRequestFieldBuilder();
                    getStationSettingResponseFieldBuilder();
                    getStationSettingNotificationFieldBuilder();
                    getGroupListRequestFieldBuilder();
                    getGroupListResponseFieldBuilder();
                    getMetricsNotificationFieldBuilder();
                    getSetStartNotificationFieldBuilder();
                    getSetEndNotificationFieldBuilder();
                    getDisplayStateNotificationFieldBuilder();
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
                this.stationSettingRequest_ = null;
                SingleFieldBuilderV3<StationSettingRequest, StationSettingRequest.Builder, StationSettingRequestOrBuilder> singleFieldBuilderV5 = this.stationSettingRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.stationSettingRequestBuilder_ = null;
                }
                this.stationSettingResponse_ = null;
                SingleFieldBuilderV3<StationSettingResponse, StationSettingResponse.Builder, StationSettingResponseOrBuilder> singleFieldBuilderV6 = this.stationSettingResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.stationSettingResponseBuilder_ = null;
                }
                this.stationSettingNotification_ = null;
                SingleFieldBuilderV3<StationSettingNotification, StationSettingNotification.Builder, StationSettingNotificationOrBuilder> singleFieldBuilderV7 = this.stationSettingNotificationBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.stationSettingNotificationBuilder_ = null;
                }
                this.groupListRequest_ = null;
                SingleFieldBuilderV3<GroupListRequest, GroupListRequest.Builder, GroupListRequestOrBuilder> singleFieldBuilderV8 = this.groupListRequestBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.groupListRequestBuilder_ = null;
                }
                this.groupListResponse_ = null;
                SingleFieldBuilderV3<GroupListResponse, GroupListResponse.Builder, GroupListResponseOrBuilder> singleFieldBuilderV9 = this.groupListResponseBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.groupListResponseBuilder_ = null;
                }
                this.metricsNotification_ = null;
                SingleFieldBuilderV3<MetricsNotification, MetricsNotification.Builder, MetricsNotificationOrBuilder> singleFieldBuilderV10 = this.metricsNotificationBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.metricsNotificationBuilder_ = null;
                }
                this.setStartNotification_ = null;
                SingleFieldBuilderV3<SetStartNotification, SetStartNotification.Builder, SetStartNotificationOrBuilder> singleFieldBuilderV11 = this.setStartNotificationBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.setStartNotificationBuilder_ = null;
                }
                this.setEndNotification_ = null;
                SingleFieldBuilderV3<SetEndNotification, SetEndNotification.Builder, SetEndNotificationOrBuilder> singleFieldBuilderV12 = this.setEndNotificationBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.setEndNotificationBuilder_ = null;
                }
                this.displayStateNotification_ = null;
                SingleFieldBuilderV3<DisplayStateNotification, DisplayStateNotification.Builder, DisplayStateNotificationOrBuilder> singleFieldBuilderV13 = this.displayStateNotificationBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.displayStateNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearDisplayStateNotification() {
                this.bitField0_ &= -1025;
                this.displayStateNotification_ = null;
                SingleFieldBuilderV3<DisplayStateNotification, DisplayStateNotification.Builder, DisplayStateNotificationOrBuilder> singleFieldBuilderV3 = this.displayStateNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.displayStateNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGroupListRequest() {
                this.bitField0_ &= -33;
                this.groupListRequest_ = null;
                SingleFieldBuilderV3<GroupListRequest, GroupListRequest.Builder, GroupListRequestOrBuilder> singleFieldBuilderV3 = this.groupListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.groupListRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearGroupListResponse() {
                this.bitField0_ &= -65;
                this.groupListResponse_ = null;
                SingleFieldBuilderV3<GroupListResponse, GroupListResponse.Builder, GroupListResponseOrBuilder> singleFieldBuilderV3 = this.groupListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.groupListResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearMetricsNotification() {
                this.bitField0_ &= -129;
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

            public Builder clearSetEndNotification() {
                this.bitField0_ &= -513;
                this.setEndNotification_ = null;
                SingleFieldBuilderV3<SetEndNotification, SetEndNotification.Builder, SetEndNotificationOrBuilder> singleFieldBuilderV3 = this.setEndNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.setEndNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSetStartNotification() {
                this.bitField0_ &= -257;
                this.setStartNotification_ = null;
                SingleFieldBuilderV3<SetStartNotification, SetStartNotification.Builder, SetStartNotificationOrBuilder> singleFieldBuilderV3 = this.setStartNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.setStartNotificationBuilder_ = null;
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

            public Builder clearStationSettingNotification() {
                this.bitField0_ &= -17;
                this.stationSettingNotification_ = null;
                SingleFieldBuilderV3<StationSettingNotification, StationSettingNotification.Builder, StationSettingNotificationOrBuilder> singleFieldBuilderV3 = this.stationSettingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stationSettingNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStationSettingRequest() {
                this.bitField0_ &= -5;
                this.stationSettingRequest_ = null;
                SingleFieldBuilderV3<StationSettingRequest, StationSettingRequest.Builder, StationSettingRequestOrBuilder> singleFieldBuilderV3 = this.stationSettingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stationSettingRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStationSettingResponse() {
                this.bitField0_ &= -9;
                this.stationSettingResponse_ = null;
                SingleFieldBuilderV3<StationSettingResponse, StationSettingResponse.Builder, StationSettingResponseOrBuilder> singleFieldBuilderV3 = this.stationSettingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stationSettingResponseBuilder_ = null;
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
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public DisplayStateNotification getDisplayStateNotification() {
                SingleFieldBuilderV3<DisplayStateNotification, DisplayStateNotification.Builder, DisplayStateNotificationOrBuilder> singleFieldBuilderV3 = this.displayStateNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DisplayStateNotification) singleFieldBuilderV3.getMessage();
                }
                DisplayStateNotification displayStateNotification = this.displayStateNotification_;
                return displayStateNotification == null ? DisplayStateNotification.getDefaultInstance() : displayStateNotification;
            }

            public DisplayStateNotification.Builder getDisplayStateNotificationBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (DisplayStateNotification.Builder) getDisplayStateNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public DisplayStateNotificationOrBuilder getDisplayStateNotificationOrBuilder() {
                SingleFieldBuilderV3<DisplayStateNotification, DisplayStateNotification.Builder, DisplayStateNotificationOrBuilder> singleFieldBuilderV3 = this.displayStateNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DisplayStateNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DisplayStateNotification displayStateNotification = this.displayStateNotification_;
                return displayStateNotification == null ? DisplayStateNotification.getDefaultInstance() : displayStateNotification;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public GroupListRequest getGroupListRequest() {
                SingleFieldBuilderV3<GroupListRequest, GroupListRequest.Builder, GroupListRequestOrBuilder> singleFieldBuilderV3 = this.groupListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GroupListRequest) singleFieldBuilderV3.getMessage();
                }
                GroupListRequest groupListRequest = this.groupListRequest_;
                return groupListRequest == null ? GroupListRequest.getDefaultInstance() : groupListRequest;
            }

            public GroupListRequest.Builder getGroupListRequestBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (GroupListRequest.Builder) getGroupListRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public GroupListRequestOrBuilder getGroupListRequestOrBuilder() {
                SingleFieldBuilderV3<GroupListRequest, GroupListRequest.Builder, GroupListRequestOrBuilder> singleFieldBuilderV3 = this.groupListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GroupListRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GroupListRequest groupListRequest = this.groupListRequest_;
                return groupListRequest == null ? GroupListRequest.getDefaultInstance() : groupListRequest;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public GroupListResponse getGroupListResponse() {
                SingleFieldBuilderV3<GroupListResponse, GroupListResponse.Builder, GroupListResponseOrBuilder> singleFieldBuilderV3 = this.groupListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GroupListResponse) singleFieldBuilderV3.getMessage();
                }
                GroupListResponse groupListResponse = this.groupListResponse_;
                return groupListResponse == null ? GroupListResponse.getDefaultInstance() : groupListResponse;
            }

            public GroupListResponse.Builder getGroupListResponseBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (GroupListResponse.Builder) getGroupListResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public GroupListResponseOrBuilder getGroupListResponseOrBuilder() {
                SingleFieldBuilderV3<GroupListResponse, GroupListResponse.Builder, GroupListResponseOrBuilder> singleFieldBuilderV3 = this.groupListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GroupListResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GroupListResponse groupListResponse = this.groupListResponse_;
                return groupListResponse == null ? GroupListResponse.getDefaultInstance() : groupListResponse;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public MetricsNotification getMetricsNotification() {
                SingleFieldBuilderV3<MetricsNotification, MetricsNotification.Builder, MetricsNotificationOrBuilder> singleFieldBuilderV3 = this.metricsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MetricsNotification) singleFieldBuilderV3.getMessage();
                }
                MetricsNotification metricsNotification = this.metricsNotification_;
                return metricsNotification == null ? MetricsNotification.getDefaultInstance() : metricsNotification;
            }

            public MetricsNotification.Builder getMetricsNotificationBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (MetricsNotification.Builder) getMetricsNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public MetricsNotificationOrBuilder getMetricsNotificationOrBuilder() {
                SingleFieldBuilderV3<MetricsNotification, MetricsNotification.Builder, MetricsNotificationOrBuilder> singleFieldBuilderV3 = this.metricsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MetricsNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                MetricsNotification metricsNotification = this.metricsNotification_;
                return metricsNotification == null ? MetricsNotification.getDefaultInstance() : metricsNotification;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public SetEndNotification getSetEndNotification() {
                SingleFieldBuilderV3<SetEndNotification, SetEndNotification.Builder, SetEndNotificationOrBuilder> singleFieldBuilderV3 = this.setEndNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetEndNotification) singleFieldBuilderV3.getMessage();
                }
                SetEndNotification setEndNotification = this.setEndNotification_;
                return setEndNotification == null ? SetEndNotification.getDefaultInstance() : setEndNotification;
            }

            public SetEndNotification.Builder getSetEndNotificationBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (SetEndNotification.Builder) getSetEndNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public SetEndNotificationOrBuilder getSetEndNotificationOrBuilder() {
                SingleFieldBuilderV3<SetEndNotification, SetEndNotification.Builder, SetEndNotificationOrBuilder> singleFieldBuilderV3 = this.setEndNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetEndNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SetEndNotification setEndNotification = this.setEndNotification_;
                return setEndNotification == null ? SetEndNotification.getDefaultInstance() : setEndNotification;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public SetStartNotification getSetStartNotification() {
                SingleFieldBuilderV3<SetStartNotification, SetStartNotification.Builder, SetStartNotificationOrBuilder> singleFieldBuilderV3 = this.setStartNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetStartNotification) singleFieldBuilderV3.getMessage();
                }
                SetStartNotification setStartNotification = this.setStartNotification_;
                return setStartNotification == null ? SetStartNotification.getDefaultInstance() : setStartNotification;
            }

            public SetStartNotification.Builder getSetStartNotificationBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (SetStartNotification.Builder) getSetStartNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public SetStartNotificationOrBuilder getSetStartNotificationOrBuilder() {
                SingleFieldBuilderV3<SetStartNotification, SetStartNotification.Builder, SetStartNotificationOrBuilder> singleFieldBuilderV3 = this.setStartNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetStartNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SetStartNotification setStartNotification = this.setStartNotification_;
                return setStartNotification == null ? SetStartNotification.getDefaultInstance() : setStartNotification;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
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

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public StateChangeRequestOrBuilder getStateChangeRequestOrBuilder() {
                SingleFieldBuilderV3<StateChangeRequest, StateChangeRequest.Builder, StateChangeRequestOrBuilder> singleFieldBuilderV3 = this.stateChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StateChangeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StateChangeRequest stateChangeRequest = this.stateChangeRequest_;
                return stateChangeRequest == null ? StateChangeRequest.getDefaultInstance() : stateChangeRequest;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
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

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public StateChangeResponseOrBuilder getStateChangeResponseOrBuilder() {
                SingleFieldBuilderV3<StateChangeResponse, StateChangeResponse.Builder, StateChangeResponseOrBuilder> singleFieldBuilderV3 = this.stateChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StateChangeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StateChangeResponse stateChangeResponse = this.stateChangeResponse_;
                return stateChangeResponse == null ? StateChangeResponse.getDefaultInstance() : stateChangeResponse;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public StationSettingNotification getStationSettingNotification() {
                SingleFieldBuilderV3<StationSettingNotification, StationSettingNotification.Builder, StationSettingNotificationOrBuilder> singleFieldBuilderV3 = this.stationSettingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StationSettingNotification) singleFieldBuilderV3.getMessage();
                }
                StationSettingNotification stationSettingNotification = this.stationSettingNotification_;
                return stationSettingNotification == null ? StationSettingNotification.getDefaultInstance() : stationSettingNotification;
            }

            public StationSettingNotification.Builder getStationSettingNotificationBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (StationSettingNotification.Builder) getStationSettingNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public StationSettingNotificationOrBuilder getStationSettingNotificationOrBuilder() {
                SingleFieldBuilderV3<StationSettingNotification, StationSettingNotification.Builder, StationSettingNotificationOrBuilder> singleFieldBuilderV3 = this.stationSettingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StationSettingNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StationSettingNotification stationSettingNotification = this.stationSettingNotification_;
                return stationSettingNotification == null ? StationSettingNotification.getDefaultInstance() : stationSettingNotification;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public StationSettingRequest getStationSettingRequest() {
                SingleFieldBuilderV3<StationSettingRequest, StationSettingRequest.Builder, StationSettingRequestOrBuilder> singleFieldBuilderV3 = this.stationSettingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StationSettingRequest) singleFieldBuilderV3.getMessage();
                }
                StationSettingRequest stationSettingRequest = this.stationSettingRequest_;
                return stationSettingRequest == null ? StationSettingRequest.getDefaultInstance() : stationSettingRequest;
            }

            public StationSettingRequest.Builder getStationSettingRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (StationSettingRequest.Builder) getStationSettingRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public StationSettingRequestOrBuilder getStationSettingRequestOrBuilder() {
                SingleFieldBuilderV3<StationSettingRequest, StationSettingRequest.Builder, StationSettingRequestOrBuilder> singleFieldBuilderV3 = this.stationSettingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StationSettingRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StationSettingRequest stationSettingRequest = this.stationSettingRequest_;
                return stationSettingRequest == null ? StationSettingRequest.getDefaultInstance() : stationSettingRequest;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public StationSettingResponse getStationSettingResponse() {
                SingleFieldBuilderV3<StationSettingResponse, StationSettingResponse.Builder, StationSettingResponseOrBuilder> singleFieldBuilderV3 = this.stationSettingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StationSettingResponse) singleFieldBuilderV3.getMessage();
                }
                StationSettingResponse stationSettingResponse = this.stationSettingResponse_;
                return stationSettingResponse == null ? StationSettingResponse.getDefaultInstance() : stationSettingResponse;
            }

            public StationSettingResponse.Builder getStationSettingResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (StationSettingResponse.Builder) getStationSettingResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public StationSettingResponseOrBuilder getStationSettingResponseOrBuilder() {
                SingleFieldBuilderV3<StationSettingResponse, StationSettingResponse.Builder, StationSettingResponseOrBuilder> singleFieldBuilderV3 = this.stationSettingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StationSettingResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StationSettingResponse stationSettingResponse = this.stationSettingResponse_;
                return stationSettingResponse == null ? StationSettingResponse.getDefaultInstance() : stationSettingResponse;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public boolean hasDisplayStateNotification() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public boolean hasGroupListRequest() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public boolean hasGroupListResponse() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public boolean hasMetricsNotification() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public boolean hasSetEndNotification() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public boolean hasSetStartNotification() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public boolean hasStateChangeRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public boolean hasStateChangeResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public boolean hasStationSettingNotification() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public boolean hasStationSettingRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.ServiceOrBuilder
            public boolean hasStationSettingResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDisplayStateNotification(DisplayStateNotification displayStateNotification) {
                DisplayStateNotification displayStateNotification2;
                SingleFieldBuilderV3<DisplayStateNotification, DisplayStateNotification.Builder, DisplayStateNotificationOrBuilder> singleFieldBuilderV3 = this.displayStateNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(displayStateNotification);
                } else if ((this.bitField0_ & 1024) == 0 || (displayStateNotification2 = this.displayStateNotification_) == null || displayStateNotification2 == DisplayStateNotification.getDefaultInstance()) {
                    this.displayStateNotification_ = displayStateNotification;
                } else {
                    getDisplayStateNotificationBuilder().mergeFrom(displayStateNotification);
                }
                if (this.displayStateNotification_ != null) {
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
                                    codedInputStream.readMessage(getStateChangeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getStateChangeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getStationSettingRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getStationSettingResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getStationSettingNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getGroupListRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getGroupListResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getMetricsNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getSetStartNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getSetEndNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getDisplayStateNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeGroupListRequest(GroupListRequest groupListRequest) {
                GroupListRequest groupListRequest2;
                SingleFieldBuilderV3<GroupListRequest, GroupListRequest.Builder, GroupListRequestOrBuilder> singleFieldBuilderV3 = this.groupListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(groupListRequest);
                } else if ((this.bitField0_ & 32) == 0 || (groupListRequest2 = this.groupListRequest_) == null || groupListRequest2 == GroupListRequest.getDefaultInstance()) {
                    this.groupListRequest_ = groupListRequest;
                } else {
                    getGroupListRequestBuilder().mergeFrom(groupListRequest);
                }
                if (this.groupListRequest_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeGroupListResponse(GroupListResponse groupListResponse) {
                GroupListResponse groupListResponse2;
                SingleFieldBuilderV3<GroupListResponse, GroupListResponse.Builder, GroupListResponseOrBuilder> singleFieldBuilderV3 = this.groupListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(groupListResponse);
                } else if ((this.bitField0_ & 64) == 0 || (groupListResponse2 = this.groupListResponse_) == null || groupListResponse2 == GroupListResponse.getDefaultInstance()) {
                    this.groupListResponse_ = groupListResponse;
                } else {
                    getGroupListResponseBuilder().mergeFrom(groupListResponse);
                }
                if (this.groupListResponse_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeMetricsNotification(MetricsNotification metricsNotification) {
                MetricsNotification metricsNotification2;
                SingleFieldBuilderV3<MetricsNotification, MetricsNotification.Builder, MetricsNotificationOrBuilder> singleFieldBuilderV3 = this.metricsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(metricsNotification);
                } else if ((this.bitField0_ & 128) == 0 || (metricsNotification2 = this.metricsNotification_) == null || metricsNotification2 == MetricsNotification.getDefaultInstance()) {
                    this.metricsNotification_ = metricsNotification;
                } else {
                    getMetricsNotificationBuilder().mergeFrom(metricsNotification);
                }
                if (this.metricsNotification_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSetEndNotification(SetEndNotification setEndNotification) {
                SetEndNotification setEndNotification2;
                SingleFieldBuilderV3<SetEndNotification, SetEndNotification.Builder, SetEndNotificationOrBuilder> singleFieldBuilderV3 = this.setEndNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(setEndNotification);
                } else if ((this.bitField0_ & 512) == 0 || (setEndNotification2 = this.setEndNotification_) == null || setEndNotification2 == SetEndNotification.getDefaultInstance()) {
                    this.setEndNotification_ = setEndNotification;
                } else {
                    getSetEndNotificationBuilder().mergeFrom(setEndNotification);
                }
                if (this.setEndNotification_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSetStartNotification(SetStartNotification setStartNotification) {
                SetStartNotification setStartNotification2;
                SingleFieldBuilderV3<SetStartNotification, SetStartNotification.Builder, SetStartNotificationOrBuilder> singleFieldBuilderV3 = this.setStartNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(setStartNotification);
                } else if ((this.bitField0_ & 256) == 0 || (setStartNotification2 = this.setStartNotification_) == null || setStartNotification2 == SetStartNotification.getDefaultInstance()) {
                    this.setStartNotification_ = setStartNotification;
                } else {
                    getSetStartNotificationBuilder().mergeFrom(setStartNotification);
                }
                if (this.setStartNotification_ != null) {
                    this.bitField0_ |= 256;
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

            public Builder mergeStationSettingNotification(StationSettingNotification stationSettingNotification) {
                StationSettingNotification stationSettingNotification2;
                SingleFieldBuilderV3<StationSettingNotification, StationSettingNotification.Builder, StationSettingNotificationOrBuilder> singleFieldBuilderV3 = this.stationSettingNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stationSettingNotification);
                } else if ((this.bitField0_ & 16) == 0 || (stationSettingNotification2 = this.stationSettingNotification_) == null || stationSettingNotification2 == StationSettingNotification.getDefaultInstance()) {
                    this.stationSettingNotification_ = stationSettingNotification;
                } else {
                    getStationSettingNotificationBuilder().mergeFrom(stationSettingNotification);
                }
                if (this.stationSettingNotification_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStationSettingRequest(StationSettingRequest stationSettingRequest) {
                StationSettingRequest stationSettingRequest2;
                SingleFieldBuilderV3<StationSettingRequest, StationSettingRequest.Builder, StationSettingRequestOrBuilder> singleFieldBuilderV3 = this.stationSettingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stationSettingRequest);
                } else if ((this.bitField0_ & 4) == 0 || (stationSettingRequest2 = this.stationSettingRequest_) == null || stationSettingRequest2 == StationSettingRequest.getDefaultInstance()) {
                    this.stationSettingRequest_ = stationSettingRequest;
                } else {
                    getStationSettingRequestBuilder().mergeFrom(stationSettingRequest);
                }
                if (this.stationSettingRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStationSettingResponse(StationSettingResponse stationSettingResponse) {
                StationSettingResponse stationSettingResponse2;
                SingleFieldBuilderV3<StationSettingResponse, StationSettingResponse.Builder, StationSettingResponseOrBuilder> singleFieldBuilderV3 = this.stationSettingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stationSettingResponse);
                } else if ((this.bitField0_ & 8) == 0 || (stationSettingResponse2 = this.stationSettingResponse_) == null || stationSettingResponse2 == StationSettingResponse.getDefaultInstance()) {
                    this.stationSettingResponse_ = stationSettingResponse;
                } else {
                    getStationSettingResponseBuilder().mergeFrom(stationSettingResponse);
                }
                if (this.stationSettingResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setDisplayStateNotification(DisplayStateNotification.Builder builder) {
                SingleFieldBuilderV3<DisplayStateNotification, DisplayStateNotification.Builder, DisplayStateNotificationOrBuilder> singleFieldBuilderV3 = this.displayStateNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.displayStateNotification_ = builder.build();
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

            public Builder setGroupListRequest(GroupListRequest.Builder builder) {
                SingleFieldBuilderV3<GroupListRequest, GroupListRequest.Builder, GroupListRequestOrBuilder> singleFieldBuilderV3 = this.groupListRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.groupListRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setGroupListResponse(GroupListResponse.Builder builder) {
                SingleFieldBuilderV3<GroupListResponse, GroupListResponse.Builder, GroupListResponseOrBuilder> singleFieldBuilderV3 = this.groupListResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.groupListResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setMetricsNotification(MetricsNotification.Builder builder) {
                SingleFieldBuilderV3<MetricsNotification, MetricsNotification.Builder, MetricsNotificationOrBuilder> singleFieldBuilderV3 = this.metricsNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.metricsNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSetEndNotification(SetEndNotification.Builder builder) {
                SingleFieldBuilderV3<SetEndNotification, SetEndNotification.Builder, SetEndNotificationOrBuilder> singleFieldBuilderV3 = this.setEndNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.setEndNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setSetStartNotification(SetStartNotification.Builder builder) {
                SingleFieldBuilderV3<SetStartNotification, SetStartNotification.Builder, SetStartNotificationOrBuilder> singleFieldBuilderV3 = this.setStartNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.setStartNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
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

            public Builder setStationSettingNotification(StationSettingNotification.Builder builder) {
                SingleFieldBuilderV3<StationSettingNotification, StationSettingNotification.Builder, StationSettingNotificationOrBuilder> singleFieldBuilderV3 = this.stationSettingNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.stationSettingNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setStationSettingRequest(StationSettingRequest.Builder builder) {
                SingleFieldBuilderV3<StationSettingRequest, StationSettingRequest.Builder, StationSettingRequestOrBuilder> singleFieldBuilderV3 = this.stationSettingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.stationSettingRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setStationSettingResponse(StationSettingResponse.Builder builder) {
                SingleFieldBuilderV3<StationSettingResponse, StationSettingResponse.Builder, StationSettingResponseOrBuilder> singleFieldBuilderV3 = this.stationSettingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.stationSettingResponse_ = builder.build();
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

            public Builder setDisplayStateNotification(DisplayStateNotification displayStateNotification) {
                SingleFieldBuilderV3<DisplayStateNotification, DisplayStateNotification.Builder, DisplayStateNotificationOrBuilder> singleFieldBuilderV3 = this.displayStateNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    displayStateNotification.getClass();
                    this.displayStateNotification_ = displayStateNotification;
                } else {
                    singleFieldBuilderV3.setMessage(displayStateNotification);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setGroupListRequest(GroupListRequest groupListRequest) {
                SingleFieldBuilderV3<GroupListRequest, GroupListRequest.Builder, GroupListRequestOrBuilder> singleFieldBuilderV3 = this.groupListRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    groupListRequest.getClass();
                    this.groupListRequest_ = groupListRequest;
                } else {
                    singleFieldBuilderV3.setMessage(groupListRequest);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setGroupListResponse(GroupListResponse groupListResponse) {
                SingleFieldBuilderV3<GroupListResponse, GroupListResponse.Builder, GroupListResponseOrBuilder> singleFieldBuilderV3 = this.groupListResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    groupListResponse.getClass();
                    this.groupListResponse_ = groupListResponse;
                } else {
                    singleFieldBuilderV3.setMessage(groupListResponse);
                }
                this.bitField0_ |= 64;
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
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setSetEndNotification(SetEndNotification setEndNotification) {
                SingleFieldBuilderV3<SetEndNotification, SetEndNotification.Builder, SetEndNotificationOrBuilder> singleFieldBuilderV3 = this.setEndNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    setEndNotification.getClass();
                    this.setEndNotification_ = setEndNotification;
                } else {
                    singleFieldBuilderV3.setMessage(setEndNotification);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setSetStartNotification(SetStartNotification setStartNotification) {
                SingleFieldBuilderV3<SetStartNotification, SetStartNotification.Builder, SetStartNotificationOrBuilder> singleFieldBuilderV3 = this.setStartNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    setStartNotification.getClass();
                    this.setStartNotification_ = setStartNotification;
                } else {
                    singleFieldBuilderV3.setMessage(setStartNotification);
                }
                this.bitField0_ |= 256;
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

            public Builder setStationSettingNotification(StationSettingNotification stationSettingNotification) {
                SingleFieldBuilderV3<StationSettingNotification, StationSettingNotification.Builder, StationSettingNotificationOrBuilder> singleFieldBuilderV3 = this.stationSettingNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stationSettingNotification.getClass();
                    this.stationSettingNotification_ = stationSettingNotification;
                } else {
                    singleFieldBuilderV3.setMessage(stationSettingNotification);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setStationSettingRequest(StationSettingRequest stationSettingRequest) {
                SingleFieldBuilderV3<StationSettingRequest, StationSettingRequest.Builder, StationSettingRequestOrBuilder> singleFieldBuilderV3 = this.stationSettingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stationSettingRequest.getClass();
                    this.stationSettingRequest_ = stationSettingRequest;
                } else {
                    singleFieldBuilderV3.setMessage(stationSettingRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setStationSettingResponse(StationSettingResponse stationSettingResponse) {
                SingleFieldBuilderV3<StationSettingResponse, StationSettingResponse.Builder, StationSettingResponseOrBuilder> singleFieldBuilderV3 = this.stationSettingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stationSettingResponse.getClass();
                    this.stationSettingResponse_ = stationSettingResponse;
                } else {
                    singleFieldBuilderV3.setMessage(stationSettingResponse);
                }
                this.bitField0_ |= 8;
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
                if (service.hasStationSettingRequest()) {
                    mergeStationSettingRequest(service.getStationSettingRequest());
                }
                if (service.hasStationSettingResponse()) {
                    mergeStationSettingResponse(service.getStationSettingResponse());
                }
                if (service.hasStationSettingNotification()) {
                    mergeStationSettingNotification(service.getStationSettingNotification());
                }
                if (service.hasGroupListRequest()) {
                    mergeGroupListRequest(service.getGroupListRequest());
                }
                if (service.hasGroupListResponse()) {
                    mergeGroupListResponse(service.getGroupListResponse());
                }
                if (service.hasMetricsNotification()) {
                    mergeMetricsNotification(service.getMetricsNotification());
                }
                if (service.hasSetStartNotification()) {
                    mergeSetStartNotification(service.getSetStartNotification());
                }
                if (service.hasSetEndNotification()) {
                    mergeSetEndNotification(service.getSetEndNotification());
                }
                if (service.hasDisplayStateNotification()) {
                    mergeDisplayStateNotification(service.getDisplayStateNotification());
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

    public static final class StateChangeRequest extends GeneratedMessageV3 implements StateChangeRequestOrBuilder {
        public static final int CHANGE_FIELD_NUMBER = 1;
        private static final StateChangeRequest DEFAULT_INSTANCE = new StateChangeRequest();

        @Deprecated
        public static final Parser<StateChangeRequest> PARSER = new AbstractParser<StateChangeRequest>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.StateChangeRequest.1
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
        public static final int SESSION_ID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int change_;
        private byte memoizedIsInitialized;
        private int sessionId_;

        private StateChangeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.change_ = 0;
            this.sessionId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StateChangeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StateChangeRequest_descriptor;
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
            if ((!hasChange() || this.change_ == stateChangeRequest.change_) && hasSessionId() == stateChangeRequest.hasSessionId()) {
                return (!hasSessionId() || getSessionId() == stateChangeRequest.getSessionId()) && getUnknownFields().equals(stateChangeRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StateChangeRequestOrBuilder
        public StateChange getChange() {
            StateChange stateChangeForNumber = StateChange.forNumber(this.change_);
            return stateChangeForNumber == null ? StateChange.UNKNOWN : stateChangeForNumber;
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
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.change_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.sessionId_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StateChangeRequestOrBuilder
        public int getSessionId() {
            return this.sessionId_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StateChangeRequestOrBuilder
        public boolean hasChange() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StateChangeRequestOrBuilder
        public boolean hasSessionId() {
            return (this.bitField0_ & 2) != 0;
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
            if (hasSessionId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSessionId();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StateChangeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StateChangeRequest.class, Builder.class);
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
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.sessionId_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StateChangeRequestOrBuilder {
            private int bitField0_;
            private int change_;
            private int sessionId_;

            private Builder() {
                this.change_ = 0;
            }

            private void buildPartial0(StateChangeRequest stateChangeRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    stateChangeRequest.change_ = this.change_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    stateChangeRequest.sessionId_ = this.sessionId_;
                    i14 |= 2;
                }
                stateChangeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StateChangeRequest_descriptor;
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
                this.sessionId_ = 0;
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

            public Builder clearSessionId() {
                this.bitField0_ &= -3;
                this.sessionId_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StateChangeRequestOrBuilder
            public StateChange getChange() {
                StateChange stateChangeForNumber = StateChange.forNumber(this.change_);
                return stateChangeForNumber == null ? StateChange.UNKNOWN : stateChangeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StateChangeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StateChangeRequestOrBuilder
            public int getSessionId() {
                return this.sessionId_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StateChangeRequestOrBuilder
            public boolean hasChange() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StateChangeRequestOrBuilder
            public boolean hasSessionId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StateChangeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StateChangeRequest.class, Builder.class);
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
                                } else if (tag == 16) {
                                    this.sessionId_ = codedInputStream.readUInt32();
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

            public Builder setSessionId(int i14) {
                this.sessionId_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
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
                if (stateChangeRequest.hasSessionId()) {
                    setSessionId(stateChangeRequest.getSessionId());
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

        public static StateChangeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StateChangeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ StateChangeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StateChangeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private StateChangeRequest() {
            this.sessionId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.change_ = 0;
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
            UNKNOWN(0),
            SETUP(1),
            INITIAL_START(2),
            PAUSE(3),
            RESUME(4),
            END(5);

            public static final int END_VALUE = 5;
            public static final int INITIAL_START_VALUE = 2;
            public static final int PAUSE_VALUE = 3;
            public static final int RESUME_VALUE = 4;
            public static final int SETUP_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<StateChange> internalValueMap = new Internal.EnumLiteMap<StateChange>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.StateChangeRequest.StateChange.1
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
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return SETUP;
                }
                if (i14 == 2) {
                    return INITIAL_START;
                }
                if (i14 == 3) {
                    return PAUSE;
                }
                if (i14 == 4) {
                    return RESUME;
                }
                if (i14 != 5) {
                    return null;
                }
                return END;
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
        public static final Parser<StateChangeResponse> PARSER = new AbstractParser<StateChangeResponse>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.StateChangeResponse.1
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
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StateChangeResponse_descriptor;
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

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StateChangeResponseOrBuilder
        public FailureReason getFailure() {
            FailureReason failureReasonForNumber = FailureReason.forNumber(this.failure_);
            return failureReasonForNumber == null ? FailureReason.UNKNOWN : failureReasonForNumber;
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

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StateChangeResponseOrBuilder
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
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StateChangeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StateChangeResponse.class, Builder.class);
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
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StateChangeResponse_descriptor;
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
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StateChangeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StateChangeResponseOrBuilder
            public FailureReason getFailure() {
                FailureReason failureReasonForNumber = FailureReason.forNumber(this.failure_);
                return failureReasonForNumber == null ? FailureReason.UNKNOWN : failureReasonForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StateChangeResponseOrBuilder
            public boolean hasFailure() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StateChangeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StateChangeResponse.class, Builder.class);
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
            UNKNOWN(0),
            NO_CHANGE(1),
            INVALID(2);

            public static final int INVALID_VALUE = 2;
            public static final int NO_CHANGE_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<FailureReason> internalValueMap = new Internal.EnumLiteMap<FailureReason>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.StateChangeResponse.FailureReason.1
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
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return NO_CHANGE;
                }
                if (i14 != 2) {
                    return null;
                }
                return INVALID;
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

    public static final class StationSettingNotification extends GeneratedMessageV3 implements StationSettingNotificationOrBuilder {
        private static final StationSettingNotification DEFAULT_INSTANCE = new StationSettingNotification();

        @Deprecated
        public static final Parser<StationSettingNotification> PARSER = new AbstractParser<StationSettingNotification>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingNotification.1
            @Override // com.google.protobuf.Parser
            public StationSettingNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StationSettingNotification.newBuilder();
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
        private StationSettings settings_;

        private StationSettingNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StationSettingNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingNotification_descriptor;
        }

        public static Builder newBuilder(StationSettingNotification stationSettingNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stationSettingNotification);
        }

        public static StationSettingNotification parseDelimitedFrom(InputStream inputStream) {
            return (StationSettingNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StationSettingNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StationSettingNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StationSettingNotification)) {
                return super.equals(obj);
            }
            StationSettingNotification stationSettingNotification = (StationSettingNotification) obj;
            if (hasSettings() != stationSettingNotification.hasSettings()) {
                return false;
            }
            return (!hasSettings() || getSettings().equals(stationSettingNotification.getSettings())) && getUnknownFields().equals(stationSettingNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StationSettingNotification> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingNotificationOrBuilder
        public StationSettings getSettings() {
            StationSettings stationSettings = this.settings_;
            return stationSettings == null ? StationSettings.getDefaultInstance() : stationSettings;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingNotificationOrBuilder
        public StationSettingsOrBuilder getSettingsOrBuilder() {
            StationSettings stationSettings = this.settings_;
            return stationSettings == null ? StationSettings.getDefaultInstance() : stationSettings;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingNotificationOrBuilder
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
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(StationSettingNotification.class, Builder.class);
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
            return new StationSettingNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StationSettingNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> settingsBuilder_;
            private StationSettings settings_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(StationSettingNotification stationSettingNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                    stationSettingNotification.settings_ = singleFieldBuilderV3 == null ? this.settings_ : (StationSettings) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                stationSettingNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingNotification_descriptor;
            }

            private SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> getSettingsFieldBuilder() {
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
            public StationSettingNotification build() {
                StationSettingNotification stationSettingNotificationBuildPartial = buildPartial();
                if (stationSettingNotificationBuildPartial.isInitialized()) {
                    return stationSettingNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stationSettingNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StationSettingNotification buildPartial() {
                StationSettingNotification stationSettingNotification = new StationSettingNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(stationSettingNotification);
                }
                onBuilt();
                return stationSettingNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.settings_ = null;
                SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
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
                SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
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
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingNotificationOrBuilder
            public StationSettings getSettings() {
                SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StationSettings) singleFieldBuilderV3.getMessage();
                }
                StationSettings stationSettings = this.settings_;
                return stationSettings == null ? StationSettings.getDefaultInstance() : stationSettings;
            }

            public StationSettings.Builder getSettingsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (StationSettings.Builder) getSettingsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingNotificationOrBuilder
            public StationSettingsOrBuilder getSettingsOrBuilder() {
                SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StationSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StationSettings stationSettings = this.settings_;
                return stationSettings == null ? StationSettings.getDefaultInstance() : stationSettings;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingNotificationOrBuilder
            public boolean hasSettings() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(StationSettingNotification.class, Builder.class);
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

            public Builder mergeSettings(StationSettings stationSettings) {
                StationSettings stationSettings2;
                SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stationSettings);
                } else if ((this.bitField0_ & 1) == 0 || (stationSettings2 = this.settings_) == null || stationSettings2 == StationSettings.getDefaultInstance()) {
                    this.settings_ = stationSettings;
                } else {
                    getSettingsBuilder().mergeFrom(stationSettings);
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

            public Builder setSettings(StationSettings.Builder builder) {
                SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
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
            public StationSettingNotification getDefaultInstanceForType() {
                return StationSettingNotification.getDefaultInstance();
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

            public Builder setSettings(StationSettings stationSettings) {
                SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stationSettings.getClass();
                    this.settings_ = stationSettings;
                } else {
                    singleFieldBuilderV3.setMessage(stationSettings);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StationSettingNotification) {
                    return mergeFrom((StationSettingNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StationSettingNotification stationSettingNotification) {
                if (stationSettingNotification == StationSettingNotification.getDefaultInstance()) {
                    return this;
                }
                if (stationSettingNotification.hasSettings()) {
                    mergeSettings(stationSettingNotification.getSettings());
                }
                mergeUnknownFields(stationSettingNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StationSettingNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ StationSettingNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private StationSettingNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StationSettingNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StationSettingNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StationSettingNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StationSettingNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StationSettingNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StationSettingNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StationSettingNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StationSettingNotification parseFrom(InputStream inputStream) {
            return (StationSettingNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StationSettingNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StationSettingNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StationSettingNotification parseFrom(CodedInputStream codedInputStream) {
            return (StationSettingNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StationSettingNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StationSettingNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StationSettingRequest extends GeneratedMessageV3 implements StationSettingRequestOrBuilder {
        private static final StationSettingRequest DEFAULT_INSTANCE = new StationSettingRequest();

        @Deprecated
        public static final Parser<StationSettingRequest> PARSER = new AbstractParser<StationSettingRequest>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingRequest.1
            @Override // com.google.protobuf.Parser
            public StationSettingRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StationSettingRequest.newBuilder();
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
        private StationSettings settings_;

        private StationSettingRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StationSettingRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingRequest_descriptor;
        }

        public static Builder newBuilder(StationSettingRequest stationSettingRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stationSettingRequest);
        }

        public static StationSettingRequest parseDelimitedFrom(InputStream inputStream) {
            return (StationSettingRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StationSettingRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StationSettingRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StationSettingRequest)) {
                return super.equals(obj);
            }
            StationSettingRequest stationSettingRequest = (StationSettingRequest) obj;
            if (hasSettings() != stationSettingRequest.hasSettings()) {
                return false;
            }
            return (!hasSettings() || getSettings().equals(stationSettingRequest.getSettings())) && getUnknownFields().equals(stationSettingRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StationSettingRequest> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingRequestOrBuilder
        public StationSettings getSettings() {
            StationSettings stationSettings = this.settings_;
            return stationSettings == null ? StationSettings.getDefaultInstance() : stationSettings;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingRequestOrBuilder
        public StationSettingsOrBuilder getSettingsOrBuilder() {
            StationSettings stationSettings = this.settings_;
            return stationSettings == null ? StationSettings.getDefaultInstance() : stationSettings;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingRequestOrBuilder
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
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StationSettingRequest.class, Builder.class);
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
            return new StationSettingRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StationSettingRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> settingsBuilder_;
            private StationSettings settings_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(StationSettingRequest stationSettingRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                    stationSettingRequest.settings_ = singleFieldBuilderV3 == null ? this.settings_ : (StationSettings) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                stationSettingRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingRequest_descriptor;
            }

            private SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> getSettingsFieldBuilder() {
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
            public StationSettingRequest build() {
                StationSettingRequest stationSettingRequestBuildPartial = buildPartial();
                if (stationSettingRequestBuildPartial.isInitialized()) {
                    return stationSettingRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stationSettingRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StationSettingRequest buildPartial() {
                StationSettingRequest stationSettingRequest = new StationSettingRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(stationSettingRequest);
                }
                onBuilt();
                return stationSettingRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.settings_ = null;
                SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
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
                SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
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
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingRequestOrBuilder
            public StationSettings getSettings() {
                SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StationSettings) singleFieldBuilderV3.getMessage();
                }
                StationSettings stationSettings = this.settings_;
                return stationSettings == null ? StationSettings.getDefaultInstance() : stationSettings;
            }

            public StationSettings.Builder getSettingsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (StationSettings.Builder) getSettingsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingRequestOrBuilder
            public StationSettingsOrBuilder getSettingsOrBuilder() {
                SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StationSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StationSettings stationSettings = this.settings_;
                return stationSettings == null ? StationSettings.getDefaultInstance() : stationSettings;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingRequestOrBuilder
            public boolean hasSettings() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StationSettingRequest.class, Builder.class);
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

            public Builder mergeSettings(StationSettings stationSettings) {
                StationSettings stationSettings2;
                SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stationSettings);
                } else if ((this.bitField0_ & 1) == 0 || (stationSettings2 = this.settings_) == null || stationSettings2 == StationSettings.getDefaultInstance()) {
                    this.settings_ = stationSettings;
                } else {
                    getSettingsBuilder().mergeFrom(stationSettings);
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

            public Builder setSettings(StationSettings.Builder builder) {
                SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
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
            public StationSettingRequest getDefaultInstanceForType() {
                return StationSettingRequest.getDefaultInstance();
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

            public Builder setSettings(StationSettings stationSettings) {
                SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stationSettings.getClass();
                    this.settings_ = stationSettings;
                } else {
                    singleFieldBuilderV3.setMessage(stationSettings);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StationSettingRequest) {
                    return mergeFrom((StationSettingRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StationSettingRequest stationSettingRequest) {
                if (stationSettingRequest == StationSettingRequest.getDefaultInstance()) {
                    return this;
                }
                if (stationSettingRequest.hasSettings()) {
                    mergeSettings(stationSettingRequest.getSettings());
                }
                mergeUnknownFields(stationSettingRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StationSettingRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ StationSettingRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private StationSettingRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StationSettingRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StationSettingRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StationSettingRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StationSettingRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StationSettingRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StationSettingRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StationSettingRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StationSettingRequest parseFrom(InputStream inputStream) {
            return (StationSettingRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StationSettingRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StationSettingRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StationSettingRequest parseFrom(CodedInputStream codedInputStream) {
            return (StationSettingRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StationSettingRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StationSettingRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StationSettingResponse extends GeneratedMessageV3 implements StationSettingResponseOrBuilder {
        private static final StationSettingResponse DEFAULT_INSTANCE = new StationSettingResponse();

        @Deprecated
        public static final Parser<StationSettingResponse> PARSER = new AbstractParser<StationSettingResponse>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingResponse.1
            @Override // com.google.protobuf.Parser
            public StationSettingResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StationSettingResponse.newBuilder();
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
        public static final int SUCCESS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private StationSettings settings_;
        private boolean success_;

        private StationSettingResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.success_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StationSettingResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingResponse_descriptor;
        }

        public static Builder newBuilder(StationSettingResponse stationSettingResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stationSettingResponse);
        }

        public static StationSettingResponse parseDelimitedFrom(InputStream inputStream) {
            return (StationSettingResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StationSettingResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StationSettingResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StationSettingResponse)) {
                return super.equals(obj);
            }
            StationSettingResponse stationSettingResponse = (StationSettingResponse) obj;
            if (hasSuccess() != stationSettingResponse.hasSuccess()) {
                return false;
            }
            if ((!hasSuccess() || getSuccess() == stationSettingResponse.getSuccess()) && hasSettings() == stationSettingResponse.hasSettings()) {
                return (!hasSettings() || getSettings().equals(stationSettingResponse.getSettings())) && getUnknownFields().equals(stationSettingResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StationSettingResponse> getParserForType() {
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
                iComputeBoolSize += CodedOutputStream.computeMessageSize(2, getSettings());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingResponseOrBuilder
        public StationSettings getSettings() {
            StationSettings stationSettings = this.settings_;
            return stationSettings == null ? StationSettings.getDefaultInstance() : stationSettings;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingResponseOrBuilder
        public StationSettingsOrBuilder getSettingsOrBuilder() {
            StationSettings stationSettings = this.settings_;
            return stationSettings == null ? StationSettings.getDefaultInstance() : stationSettings;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingResponseOrBuilder
        public boolean getSuccess() {
            return this.success_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingResponseOrBuilder
        public boolean hasSettings() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingResponseOrBuilder
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
            if (hasSettings()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSettings().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StationSettingResponse.class, Builder.class);
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
            return new StationSettingResponse();
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
                codedOutputStream.writeMessage(2, getSettings());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StationSettingResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> settingsBuilder_;
            private StationSettings settings_;
            private boolean success_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(StationSettingResponse stationSettingResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    stationSettingResponse.success_ = this.success_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                    stationSettingResponse.settings_ = singleFieldBuilderV3 == null ? this.settings_ : (StationSettings) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                stationSettingResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingResponse_descriptor;
            }

            private SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> getSettingsFieldBuilder() {
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
            public StationSettingResponse build() {
                StationSettingResponse stationSettingResponseBuildPartial = buildPartial();
                if (stationSettingResponseBuildPartial.isInitialized()) {
                    return stationSettingResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stationSettingResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StationSettingResponse buildPartial() {
                StationSettingResponse stationSettingResponse = new StationSettingResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(stationSettingResponse);
                }
                onBuilt();
                return stationSettingResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.success_ = false;
                this.settings_ = null;
                SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
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
                SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsBuilder_ = null;
                }
                onChanged();
                return this;
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
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingResponseOrBuilder
            public StationSettings getSettings() {
                SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StationSettings) singleFieldBuilderV3.getMessage();
                }
                StationSettings stationSettings = this.settings_;
                return stationSettings == null ? StationSettings.getDefaultInstance() : stationSettings;
            }

            public StationSettings.Builder getSettingsBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (StationSettings.Builder) getSettingsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingResponseOrBuilder
            public StationSettingsOrBuilder getSettingsOrBuilder() {
                SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StationSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StationSettings stationSettings = this.settings_;
                return stationSettings == null ? StationSettings.getDefaultInstance() : stationSettings;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingResponseOrBuilder
            public boolean getSuccess() {
                return this.success_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingResponseOrBuilder
            public boolean hasSettings() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingResponseOrBuilder
            public boolean hasSuccess() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettingResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StationSettingResponse.class, Builder.class);
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

            public Builder mergeSettings(StationSettings stationSettings) {
                StationSettings stationSettings2;
                SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stationSettings);
                } else if ((this.bitField0_ & 2) == 0 || (stationSettings2 = this.settings_) == null || stationSettings2 == StationSettings.getDefaultInstance()) {
                    this.settings_ = stationSettings;
                } else {
                    getSettingsBuilder().mergeFrom(stationSettings);
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

            public Builder setSettings(StationSettings.Builder builder) {
                SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.settings_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
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
            public StationSettingResponse getDefaultInstanceForType() {
                return StationSettingResponse.getDefaultInstance();
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

            public Builder setSettings(StationSettings stationSettings) {
                SingleFieldBuilderV3<StationSettings, StationSettings.Builder, StationSettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stationSettings.getClass();
                    this.settings_ = stationSettings;
                } else {
                    singleFieldBuilderV3.setMessage(stationSettings);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StationSettingResponse) {
                    return mergeFrom((StationSettingResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StationSettingResponse stationSettingResponse) {
                if (stationSettingResponse == StationSettingResponse.getDefaultInstance()) {
                    return this;
                }
                if (stationSettingResponse.hasSuccess()) {
                    setSuccess(stationSettingResponse.getSuccess());
                }
                if (stationSettingResponse.hasSettings()) {
                    mergeSettings(stationSettingResponse.getSettings());
                }
                mergeUnknownFields(stationSettingResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StationSettingResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StationSettingResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StationSettingResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StationSettingResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ StationSettingResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StationSettingResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private StationSettingResponse() {
            this.success_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StationSettingResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StationSettingResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StationSettingResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StationSettingResponse parseFrom(InputStream inputStream) {
            return (StationSettingResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StationSettingResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StationSettingResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StationSettingResponse parseFrom(CodedInputStream codedInputStream) {
            return (StationSettingResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StationSettingResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StationSettingResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StationSettings extends GeneratedMessageV3 implements StationSettingsOrBuilder {
        public static final int DURATION_S_FIELD_NUMBER = 5;
        public static final int EXERCISE_CATEGORY_FIELD_NUMBER = 1;
        public static final int EXERCISE_SUBCATEGORY_FIELD_NUMBER = 2;
        public static final int LOAD_TARGET_FIELD_NUMBER = 6;
        public static final int REP_TARGET_FIELD_NUMBER = 4;
        public static final int STATION_NAME_FIELD_NUMBER = 9;
        public static final int UNLOCK_MODE_FIELD_NUMBER = 7;
        public static final int VBT_TARGET_FIELD_NUMBER = 3;
        public static final int WORKING_WEIGHT_KG_FIELD_NUMBER = 8;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int durationS_;
        private int exerciseCategory_;
        private int exerciseSubcategory_;
        private int loadTarget_;
        private byte memoizedIsInitialized;
        private RepRange repTarget_;
        private volatile Object stationName_;
        private boolean unlockMode_;
        private VbtTarget vbtTarget_;
        private float workingWeightKg_;
        private static final StationSettings DEFAULT_INSTANCE = new StationSettings();

        @Deprecated
        public static final Parser<StationSettings> PARSER = new AbstractParser<StationSettings>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettings.1
            @Override // com.google.protobuf.Parser
            public StationSettings parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StationSettings.newBuilder();
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

        private StationSettings() {
            this.exerciseCategory_ = 0;
            this.exerciseSubcategory_ = 0;
            this.durationS_ = 0;
            this.loadTarget_ = 0;
            this.unlockMode_ = false;
            this.workingWeightKg_ = 0.0f;
            this.stationName_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.stationName_ = "";
        }

        public static StationSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettings_descriptor;
        }

        public static Builder newBuilder(StationSettings stationSettings) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stationSettings);
        }

        public static StationSettings parseDelimitedFrom(InputStream inputStream) {
            return (StationSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StationSettings parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StationSettings> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StationSettings)) {
                return super.equals(obj);
            }
            StationSettings stationSettings = (StationSettings) obj;
            if (hasExerciseCategory() != stationSettings.hasExerciseCategory()) {
                return false;
            }
            if ((hasExerciseCategory() && getExerciseCategory() != stationSettings.getExerciseCategory()) || hasExerciseSubcategory() != stationSettings.hasExerciseSubcategory()) {
                return false;
            }
            if ((hasExerciseSubcategory() && getExerciseSubcategory() != stationSettings.getExerciseSubcategory()) || hasVbtTarget() != stationSettings.hasVbtTarget()) {
                return false;
            }
            if ((hasVbtTarget() && !getVbtTarget().equals(stationSettings.getVbtTarget())) || hasRepTarget() != stationSettings.hasRepTarget()) {
                return false;
            }
            if ((hasRepTarget() && !getRepTarget().equals(stationSettings.getRepTarget())) || hasDurationS() != stationSettings.hasDurationS()) {
                return false;
            }
            if ((hasDurationS() && getDurationS() != stationSettings.getDurationS()) || hasLoadTarget() != stationSettings.hasLoadTarget()) {
                return false;
            }
            if ((hasLoadTarget() && getLoadTarget() != stationSettings.getLoadTarget()) || hasUnlockMode() != stationSettings.hasUnlockMode()) {
                return false;
            }
            if ((hasUnlockMode() && getUnlockMode() != stationSettings.getUnlockMode()) || hasWorkingWeightKg() != stationSettings.hasWorkingWeightKg()) {
                return false;
            }
            if ((!hasWorkingWeightKg() || Float.floatToIntBits(getWorkingWeightKg()) == Float.floatToIntBits(stationSettings.getWorkingWeightKg())) && hasStationName() == stationSettings.hasStationName()) {
                return (!hasStationName() || getStationName().equals(stationSettings.getStationName())) && getUnknownFields().equals(stationSettings.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
        public int getDurationS() {
            return this.durationS_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
        public int getExerciseCategory() {
            return this.exerciseCategory_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
        public int getExerciseSubcategory() {
            return this.exerciseSubcategory_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
        public int getLoadTarget() {
            return this.loadTarget_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StationSettings> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
        public RepRange getRepTarget() {
            RepRange repRange = this.repTarget_;
            return repRange == null ? RepRange.getDefaultInstance() : repRange;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
        public RepRangeOrBuilder getRepTargetOrBuilder() {
            RepRange repRange = this.repTarget_;
            return repRange == null ? RepRange.getDefaultInstance() : repRange;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.exerciseCategory_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.exerciseSubcategory_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(3, getVbtTarget());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(4, getRepTarget());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.durationS_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(6, this.loadTarget_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(7, this.unlockMode_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeFloatSize(8, this.workingWeightKg_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeUInt32Size += GeneratedMessageV3.computeStringSize(9, this.stationName_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
        public String getStationName() {
            Object obj = this.stationName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.stationName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
        public ByteString getStationNameBytes() {
            Object obj = this.stationName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.stationName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
        public boolean getUnlockMode() {
            return this.unlockMode_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
        public VbtTarget getVbtTarget() {
            VbtTarget vbtTarget = this.vbtTarget_;
            return vbtTarget == null ? VbtTarget.getDefaultInstance() : vbtTarget;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
        public VbtTargetOrBuilder getVbtTargetOrBuilder() {
            VbtTarget vbtTarget = this.vbtTarget_;
            return vbtTarget == null ? VbtTarget.getDefaultInstance() : vbtTarget;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
        public float getWorkingWeightKg() {
            return this.workingWeightKg_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
        public boolean hasDurationS() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
        public boolean hasExerciseCategory() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
        public boolean hasExerciseSubcategory() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
        public boolean hasLoadTarget() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
        public boolean hasRepTarget() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
        public boolean hasStationName() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
        public boolean hasUnlockMode() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
        public boolean hasVbtTarget() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
        public boolean hasWorkingWeightKg() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasExerciseCategory()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getExerciseCategory();
            }
            if (hasExerciseSubcategory()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getExerciseSubcategory();
            }
            if (hasVbtTarget()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getVbtTarget().hashCode();
            }
            if (hasRepTarget()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getRepTarget().hashCode();
            }
            if (hasDurationS()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getDurationS();
            }
            if (hasLoadTarget()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getLoadTarget();
            }
            if (hasUnlockMode()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + Internal.hashBoolean(getUnlockMode());
            }
            if (hasWorkingWeightKg()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + Float.floatToIntBits(getWorkingWeightKg());
            }
            if (hasStationName()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getStationName().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(StationSettings.class, Builder.class);
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
            return new StationSettings();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.exerciseCategory_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.exerciseSubcategory_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getVbtTarget());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getRepTarget());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.durationS_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.loadTarget_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeBool(7, this.unlockMode_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeFloat(8, this.workingWeightKg_);
            }
            if ((this.bitField0_ & 256) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 9, this.stationName_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StationSettingsOrBuilder {
            private int bitField0_;
            private int durationS_;
            private int exerciseCategory_;
            private int exerciseSubcategory_;
            private int loadTarget_;
            private SingleFieldBuilderV3<RepRange, RepRange.Builder, RepRangeOrBuilder> repTargetBuilder_;
            private RepRange repTarget_;
            private Object stationName_;
            private boolean unlockMode_;
            private SingleFieldBuilderV3<VbtTarget, VbtTarget.Builder, VbtTargetOrBuilder> vbtTargetBuilder_;
            private VbtTarget vbtTarget_;
            private float workingWeightKg_;

            private Builder() {
                this.stationName_ = "";
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(StationSettings stationSettings) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    stationSettings.exerciseCategory_ = this.exerciseCategory_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    stationSettings.exerciseSubcategory_ = this.exerciseSubcategory_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<VbtTarget, VbtTarget.Builder, VbtTargetOrBuilder> singleFieldBuilderV3 = this.vbtTargetBuilder_;
                    stationSettings.vbtTarget_ = singleFieldBuilderV3 == null ? this.vbtTarget_ : (VbtTarget) singleFieldBuilderV3.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<RepRange, RepRange.Builder, RepRangeOrBuilder> singleFieldBuilderV4 = this.repTargetBuilder_;
                    stationSettings.repTarget_ = singleFieldBuilderV4 == null ? this.repTarget_ : (RepRange) singleFieldBuilderV4.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    stationSettings.durationS_ = this.durationS_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    stationSettings.loadTarget_ = this.loadTarget_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    stationSettings.unlockMode_ = this.unlockMode_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    stationSettings.workingWeightKg_ = this.workingWeightKg_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    stationSettings.stationName_ = this.stationName_;
                    i14 |= 256;
                }
                stationSettings.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettings_descriptor;
            }

            private SingleFieldBuilderV3<RepRange, RepRange.Builder, RepRangeOrBuilder> getRepTargetFieldBuilder() {
                if (this.repTargetBuilder_ == null) {
                    this.repTargetBuilder_ = new SingleFieldBuilderV3<>(getRepTarget(), getParentForChildren(), isClean());
                    this.repTarget_ = null;
                }
                return this.repTargetBuilder_;
            }

            private SingleFieldBuilderV3<VbtTarget, VbtTarget.Builder, VbtTargetOrBuilder> getVbtTargetFieldBuilder() {
                if (this.vbtTargetBuilder_ == null) {
                    this.vbtTargetBuilder_ = new SingleFieldBuilderV3<>(getVbtTarget(), getParentForChildren(), isClean());
                    this.vbtTarget_ = null;
                }
                return this.vbtTargetBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getVbtTargetFieldBuilder();
                    getRepTargetFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StationSettings build() {
                StationSettings stationSettingsBuildPartial = buildPartial();
                if (stationSettingsBuildPartial.isInitialized()) {
                    return stationSettingsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stationSettingsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StationSettings buildPartial() {
                StationSettings stationSettings = new StationSettings(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(stationSettings);
                }
                onBuilt();
                return stationSettings;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.exerciseCategory_ = 0;
                this.exerciseSubcategory_ = 0;
                this.vbtTarget_ = null;
                SingleFieldBuilderV3<VbtTarget, VbtTarget.Builder, VbtTargetOrBuilder> singleFieldBuilderV3 = this.vbtTargetBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.vbtTargetBuilder_ = null;
                }
                this.repTarget_ = null;
                SingleFieldBuilderV3<RepRange, RepRange.Builder, RepRangeOrBuilder> singleFieldBuilderV4 = this.repTargetBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.repTargetBuilder_ = null;
                }
                this.durationS_ = 0;
                this.loadTarget_ = 0;
                this.unlockMode_ = false;
                this.workingWeightKg_ = 0.0f;
                this.stationName_ = "";
                return this;
            }

            public Builder clearDurationS() {
                this.bitField0_ &= -17;
                this.durationS_ = 0;
                onChanged();
                return this;
            }

            public Builder clearExerciseCategory() {
                this.bitField0_ &= -2;
                this.exerciseCategory_ = 0;
                onChanged();
                return this;
            }

            public Builder clearExerciseSubcategory() {
                this.bitField0_ &= -3;
                this.exerciseSubcategory_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLoadTarget() {
                this.bitField0_ &= -33;
                this.loadTarget_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearRepTarget() {
                this.bitField0_ &= -9;
                this.repTarget_ = null;
                SingleFieldBuilderV3<RepRange, RepRange.Builder, RepRangeOrBuilder> singleFieldBuilderV3 = this.repTargetBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.repTargetBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStationName() {
                this.stationName_ = StationSettings.getDefaultInstance().getStationName();
                this.bitField0_ &= -257;
                onChanged();
                return this;
            }

            public Builder clearUnlockMode() {
                this.bitField0_ &= -65;
                this.unlockMode_ = false;
                onChanged();
                return this;
            }

            public Builder clearVbtTarget() {
                this.bitField0_ &= -5;
                this.vbtTarget_ = null;
                SingleFieldBuilderV3<VbtTarget, VbtTarget.Builder, VbtTargetOrBuilder> singleFieldBuilderV3 = this.vbtTargetBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.vbtTargetBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearWorkingWeightKg() {
                this.bitField0_ &= -129;
                this.workingWeightKg_ = 0.0f;
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
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettings_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
            public int getDurationS() {
                return this.durationS_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
            public int getExerciseCategory() {
                return this.exerciseCategory_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
            public int getExerciseSubcategory() {
                return this.exerciseSubcategory_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
            public int getLoadTarget() {
                return this.loadTarget_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
            public RepRange getRepTarget() {
                SingleFieldBuilderV3<RepRange, RepRange.Builder, RepRangeOrBuilder> singleFieldBuilderV3 = this.repTargetBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RepRange) singleFieldBuilderV3.getMessage();
                }
                RepRange repRange = this.repTarget_;
                return repRange == null ? RepRange.getDefaultInstance() : repRange;
            }

            public RepRange.Builder getRepTargetBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (RepRange.Builder) getRepTargetFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
            public RepRangeOrBuilder getRepTargetOrBuilder() {
                SingleFieldBuilderV3<RepRange, RepRange.Builder, RepRangeOrBuilder> singleFieldBuilderV3 = this.repTargetBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RepRangeOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RepRange repRange = this.repTarget_;
                return repRange == null ? RepRange.getDefaultInstance() : repRange;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
            public String getStationName() {
                Object obj = this.stationName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.stationName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
            public ByteString getStationNameBytes() {
                Object obj = this.stationName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.stationName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
            public boolean getUnlockMode() {
                return this.unlockMode_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
            public VbtTarget getVbtTarget() {
                SingleFieldBuilderV3<VbtTarget, VbtTarget.Builder, VbtTargetOrBuilder> singleFieldBuilderV3 = this.vbtTargetBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VbtTarget) singleFieldBuilderV3.getMessage();
                }
                VbtTarget vbtTarget = this.vbtTarget_;
                return vbtTarget == null ? VbtTarget.getDefaultInstance() : vbtTarget;
            }

            public VbtTarget.Builder getVbtTargetBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (VbtTarget.Builder) getVbtTargetFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
            public VbtTargetOrBuilder getVbtTargetOrBuilder() {
                SingleFieldBuilderV3<VbtTarget, VbtTarget.Builder, VbtTargetOrBuilder> singleFieldBuilderV3 = this.vbtTargetBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VbtTargetOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                VbtTarget vbtTarget = this.vbtTarget_;
                return vbtTarget == null ? VbtTarget.getDefaultInstance() : vbtTarget;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
            public float getWorkingWeightKg() {
                return this.workingWeightKg_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
            public boolean hasDurationS() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
            public boolean hasExerciseCategory() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
            public boolean hasExerciseSubcategory() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
            public boolean hasLoadTarget() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
            public boolean hasRepTarget() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
            public boolean hasStationName() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
            public boolean hasUnlockMode() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
            public boolean hasVbtTarget() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.StationSettingsOrBuilder
            public boolean hasWorkingWeightKg() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_StationSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(StationSettings.class, Builder.class);
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
                                    this.exerciseCategory_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.exerciseSubcategory_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getVbtTargetFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getRepTargetFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.durationS_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    this.loadTarget_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                } else if (tag == 56) {
                                    this.unlockMode_ = codedInputStream.readBool();
                                    this.bitField0_ |= 64;
                                } else if (tag == 69) {
                                    this.workingWeightKg_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 128;
                                } else if (tag == 74) {
                                    this.stationName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 256;
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

            public Builder mergeRepTarget(RepRange repRange) {
                RepRange repRange2;
                SingleFieldBuilderV3<RepRange, RepRange.Builder, RepRangeOrBuilder> singleFieldBuilderV3 = this.repTargetBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(repRange);
                } else if ((this.bitField0_ & 8) == 0 || (repRange2 = this.repTarget_) == null || repRange2 == RepRange.getDefaultInstance()) {
                    this.repTarget_ = repRange;
                } else {
                    getRepTargetBuilder().mergeFrom(repRange);
                }
                if (this.repTarget_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder mergeVbtTarget(VbtTarget vbtTarget) {
                VbtTarget vbtTarget2;
                SingleFieldBuilderV3<VbtTarget, VbtTarget.Builder, VbtTargetOrBuilder> singleFieldBuilderV3 = this.vbtTargetBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(vbtTarget);
                } else if ((this.bitField0_ & 4) == 0 || (vbtTarget2 = this.vbtTarget_) == null || vbtTarget2 == VbtTarget.getDefaultInstance()) {
                    this.vbtTarget_ = vbtTarget;
                } else {
                    getVbtTargetBuilder().mergeFrom(vbtTarget);
                }
                if (this.vbtTarget_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder setDurationS(int i14) {
                this.durationS_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setExerciseCategory(int i14) {
                this.exerciseCategory_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setExerciseSubcategory(int i14) {
                this.exerciseSubcategory_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLoadTarget(int i14) {
                this.loadTarget_ = i14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setRepTarget(RepRange.Builder builder) {
                SingleFieldBuilderV3<RepRange, RepRange.Builder, RepRangeOrBuilder> singleFieldBuilderV3 = this.repTargetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.repTarget_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStationName(String str) {
                str.getClass();
                this.stationName_ = str;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setStationNameBytes(ByteString byteString) {
                byteString.getClass();
                this.stationName_ = byteString;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setUnlockMode(boolean z14) {
                this.unlockMode_ = z14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setVbtTarget(VbtTarget.Builder builder) {
                SingleFieldBuilderV3<VbtTarget, VbtTarget.Builder, VbtTargetOrBuilder> singleFieldBuilderV3 = this.vbtTargetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.vbtTarget_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setWorkingWeightKg(float f14) {
                this.workingWeightKg_ = f14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public StationSettings getDefaultInstanceForType() {
                return StationSettings.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.stationName_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder setRepTarget(RepRange repRange) {
                SingleFieldBuilderV3<RepRange, RepRange.Builder, RepRangeOrBuilder> singleFieldBuilderV3 = this.repTargetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    repRange.getClass();
                    this.repTarget_ = repRange;
                } else {
                    singleFieldBuilderV3.setMessage(repRange);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setVbtTarget(VbtTarget vbtTarget) {
                SingleFieldBuilderV3<VbtTarget, VbtTarget.Builder, VbtTargetOrBuilder> singleFieldBuilderV3 = this.vbtTargetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    vbtTarget.getClass();
                    this.vbtTarget_ = vbtTarget;
                } else {
                    singleFieldBuilderV3.setMessage(vbtTarget);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StationSettings) {
                    return mergeFrom((StationSettings) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StationSettings stationSettings) {
                if (stationSettings == StationSettings.getDefaultInstance()) {
                    return this;
                }
                if (stationSettings.hasExerciseCategory()) {
                    setExerciseCategory(stationSettings.getExerciseCategory());
                }
                if (stationSettings.hasExerciseSubcategory()) {
                    setExerciseSubcategory(stationSettings.getExerciseSubcategory());
                }
                if (stationSettings.hasVbtTarget()) {
                    mergeVbtTarget(stationSettings.getVbtTarget());
                }
                if (stationSettings.hasRepTarget()) {
                    mergeRepTarget(stationSettings.getRepTarget());
                }
                if (stationSettings.hasDurationS()) {
                    setDurationS(stationSettings.getDurationS());
                }
                if (stationSettings.hasLoadTarget()) {
                    setLoadTarget(stationSettings.getLoadTarget());
                }
                if (stationSettings.hasUnlockMode()) {
                    setUnlockMode(stationSettings.getUnlockMode());
                }
                if (stationSettings.hasWorkingWeightKg()) {
                    setWorkingWeightKg(stationSettings.getWorkingWeightKg());
                }
                if (stationSettings.hasStationName()) {
                    this.stationName_ = stationSettings.stationName_;
                    this.bitField0_ |= 256;
                    onChanged();
                }
                mergeUnknownFields(stationSettings.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StationSettings getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StationSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StationSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StationSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StationSettings parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StationSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StationSettings parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StationSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StationSettings parseFrom(InputStream inputStream) {
            return (StationSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StationSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StationSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StationSettings parseFrom(CodedInputStream codedInputStream) {
            return (StationSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StationSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StationSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private StationSettings(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.exerciseCategory_ = 0;
            this.exerciseSubcategory_ = 0;
            this.durationS_ = 0;
            this.loadTarget_ = 0;
            this.unlockMode_ = false;
            this.workingWeightKg_ = 0.0f;
            this.stationName_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ StationSettings(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class VbtTarget extends GeneratedMessageV3 implements VbtTargetOrBuilder {
        public static final int MEAN_POWER_LOSS_PERCENTAGE_FIELD_NUMBER = 6;
        public static final int MEAN_VELOCITY_LOSS_PERCENTAGE_FIELD_NUMBER = 2;
        public static final int MEAN_VELOCITY_RANGE_FIELD_NUMBER = 3;
        public static final int MEAN_VELOCITY_ZONE_FIELD_NUMBER = 1;
        public static final int PEAK_VELOCITY_LOSS_PERCENTAGE_FIELD_NUMBER = 4;
        public static final int PEAK_VELOCITY_RANGE_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int meanPowerLossPercentage_;
        private int meanVelocityLossPercentage_;
        private VelocityRange meanVelocityRange_;
        private int meanVelocityZone_;
        private byte memoizedIsInitialized;
        private int peakVelocityLossPercentage_;
        private VelocityRange peakVelocityRange_;
        private static final VbtTarget DEFAULT_INSTANCE = new VbtTarget();

        @Deprecated
        public static final Parser<VbtTarget> PARSER = new AbstractParser<VbtTarget>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTarget.1
            @Override // com.google.protobuf.Parser
            public VbtTarget parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = VbtTarget.newBuilder();
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

        private VbtTarget(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.meanVelocityZone_ = 0;
            this.meanVelocityLossPercentage_ = 0;
            this.peakVelocityLossPercentage_ = 0;
            this.meanPowerLossPercentage_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VbtTarget getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_VbtTarget_descriptor;
        }

        public static Builder newBuilder(VbtTarget vbtTarget) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(vbtTarget);
        }

        public static VbtTarget parseDelimitedFrom(InputStream inputStream) {
            return (VbtTarget) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VbtTarget parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<VbtTarget> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VbtTarget)) {
                return super.equals(obj);
            }
            VbtTarget vbtTarget = (VbtTarget) obj;
            if (hasMeanVelocityZone() != vbtTarget.hasMeanVelocityZone()) {
                return false;
            }
            if ((hasMeanVelocityZone() && this.meanVelocityZone_ != vbtTarget.meanVelocityZone_) || hasMeanVelocityLossPercentage() != vbtTarget.hasMeanVelocityLossPercentage()) {
                return false;
            }
            if ((hasMeanVelocityLossPercentage() && getMeanVelocityLossPercentage() != vbtTarget.getMeanVelocityLossPercentage()) || hasMeanVelocityRange() != vbtTarget.hasMeanVelocityRange()) {
                return false;
            }
            if ((hasMeanVelocityRange() && !getMeanVelocityRange().equals(vbtTarget.getMeanVelocityRange())) || hasPeakVelocityLossPercentage() != vbtTarget.hasPeakVelocityLossPercentage()) {
                return false;
            }
            if ((hasPeakVelocityLossPercentage() && getPeakVelocityLossPercentage() != vbtTarget.getPeakVelocityLossPercentage()) || hasPeakVelocityRange() != vbtTarget.hasPeakVelocityRange()) {
                return false;
            }
            if ((!hasPeakVelocityRange() || getPeakVelocityRange().equals(vbtTarget.getPeakVelocityRange())) && hasMeanPowerLossPercentage() == vbtTarget.hasMeanPowerLossPercentage()) {
                return (!hasMeanPowerLossPercentage() || getMeanPowerLossPercentage() == vbtTarget.getMeanPowerLossPercentage()) && getUnknownFields().equals(vbtTarget.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
        public int getMeanPowerLossPercentage() {
            return this.meanPowerLossPercentage_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
        public int getMeanVelocityLossPercentage() {
            return this.meanVelocityLossPercentage_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
        public VelocityRange getMeanVelocityRange() {
            VelocityRange velocityRange = this.meanVelocityRange_;
            return velocityRange == null ? VelocityRange.getDefaultInstance() : velocityRange;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
        public VelocityRangeOrBuilder getMeanVelocityRangeOrBuilder() {
            VelocityRange velocityRange = this.meanVelocityRange_;
            return velocityRange == null ? VelocityRange.getDefaultInstance() : velocityRange;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
        public VbtZone getMeanVelocityZone() {
            VbtZone vbtZoneForNumber = VbtZone.forNumber(this.meanVelocityZone_);
            return vbtZoneForNumber == null ? VbtZone.UNKNOWN : vbtZoneForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<VbtTarget> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
        public int getPeakVelocityLossPercentage() {
            return this.peakVelocityLossPercentage_;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
        public VelocityRange getPeakVelocityRange() {
            VelocityRange velocityRange = this.peakVelocityRange_;
            return velocityRange == null ? VelocityRange.getDefaultInstance() : velocityRange;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
        public VelocityRangeOrBuilder getPeakVelocityRangeOrBuilder() {
            VelocityRange velocityRange = this.peakVelocityRange_;
            return velocityRange == null ? VelocityRange.getDefaultInstance() : velocityRange;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.meanVelocityZone_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.meanVelocityLossPercentage_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, getMeanVelocityRange());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(4, this.peakVelocityLossPercentage_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(5, getPeakVelocityRange());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(6, this.meanPowerLossPercentage_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
        public boolean hasMeanPowerLossPercentage() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
        public boolean hasMeanVelocityLossPercentage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
        public boolean hasMeanVelocityRange() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
        public boolean hasMeanVelocityZone() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
        public boolean hasPeakVelocityLossPercentage() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
        public boolean hasPeakVelocityRange() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMeanVelocityZone()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.meanVelocityZone_;
            }
            if (hasMeanVelocityLossPercentage()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getMeanVelocityLossPercentage();
            }
            if (hasMeanVelocityRange()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getMeanVelocityRange().hashCode();
            }
            if (hasPeakVelocityLossPercentage()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getPeakVelocityLossPercentage();
            }
            if (hasPeakVelocityRange()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getPeakVelocityRange().hashCode();
            }
            if (hasMeanPowerLossPercentage()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getMeanPowerLossPercentage();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_VbtTarget_fieldAccessorTable.ensureFieldAccessorsInitialized(VbtTarget.class, Builder.class);
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
            return new VbtTarget();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.meanVelocityZone_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.meanVelocityLossPercentage_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getMeanVelocityRange());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.peakVelocityLossPercentage_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getPeakVelocityRange());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.meanPowerLossPercentage_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VbtTargetOrBuilder {
            private int bitField0_;
            private int meanPowerLossPercentage_;
            private int meanVelocityLossPercentage_;
            private SingleFieldBuilderV3<VelocityRange, VelocityRange.Builder, VelocityRangeOrBuilder> meanVelocityRangeBuilder_;
            private VelocityRange meanVelocityRange_;
            private int meanVelocityZone_;
            private int peakVelocityLossPercentage_;
            private SingleFieldBuilderV3<VelocityRange, VelocityRange.Builder, VelocityRangeOrBuilder> peakVelocityRangeBuilder_;
            private VelocityRange peakVelocityRange_;

            private Builder() {
                this.meanVelocityZone_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(VbtTarget vbtTarget) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    vbtTarget.meanVelocityZone_ = this.meanVelocityZone_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    vbtTarget.meanVelocityLossPercentage_ = this.meanVelocityLossPercentage_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<VelocityRange, VelocityRange.Builder, VelocityRangeOrBuilder> singleFieldBuilderV3 = this.meanVelocityRangeBuilder_;
                    vbtTarget.meanVelocityRange_ = singleFieldBuilderV3 == null ? this.meanVelocityRange_ : (VelocityRange) singleFieldBuilderV3.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    vbtTarget.peakVelocityLossPercentage_ = this.peakVelocityLossPercentage_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<VelocityRange, VelocityRange.Builder, VelocityRangeOrBuilder> singleFieldBuilderV4 = this.peakVelocityRangeBuilder_;
                    vbtTarget.peakVelocityRange_ = singleFieldBuilderV4 == null ? this.peakVelocityRange_ : (VelocityRange) singleFieldBuilderV4.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    vbtTarget.meanPowerLossPercentage_ = this.meanPowerLossPercentage_;
                    i14 |= 32;
                }
                vbtTarget.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_VbtTarget_descriptor;
            }

            private SingleFieldBuilderV3<VelocityRange, VelocityRange.Builder, VelocityRangeOrBuilder> getMeanVelocityRangeFieldBuilder() {
                if (this.meanVelocityRangeBuilder_ == null) {
                    this.meanVelocityRangeBuilder_ = new SingleFieldBuilderV3<>(getMeanVelocityRange(), getParentForChildren(), isClean());
                    this.meanVelocityRange_ = null;
                }
                return this.meanVelocityRangeBuilder_;
            }

            private SingleFieldBuilderV3<VelocityRange, VelocityRange.Builder, VelocityRangeOrBuilder> getPeakVelocityRangeFieldBuilder() {
                if (this.peakVelocityRangeBuilder_ == null) {
                    this.peakVelocityRangeBuilder_ = new SingleFieldBuilderV3<>(getPeakVelocityRange(), getParentForChildren(), isClean());
                    this.peakVelocityRange_ = null;
                }
                return this.peakVelocityRangeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getMeanVelocityRangeFieldBuilder();
                    getPeakVelocityRangeFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VbtTarget build() {
                VbtTarget vbtTargetBuildPartial = buildPartial();
                if (vbtTargetBuildPartial.isInitialized()) {
                    return vbtTargetBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) vbtTargetBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VbtTarget buildPartial() {
                VbtTarget vbtTarget = new VbtTarget(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(vbtTarget);
                }
                onBuilt();
                return vbtTarget;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.meanVelocityZone_ = 0;
                this.meanVelocityLossPercentage_ = 0;
                this.meanVelocityRange_ = null;
                SingleFieldBuilderV3<VelocityRange, VelocityRange.Builder, VelocityRangeOrBuilder> singleFieldBuilderV3 = this.meanVelocityRangeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.meanVelocityRangeBuilder_ = null;
                }
                this.peakVelocityLossPercentage_ = 0;
                this.peakVelocityRange_ = null;
                SingleFieldBuilderV3<VelocityRange, VelocityRange.Builder, VelocityRangeOrBuilder> singleFieldBuilderV4 = this.peakVelocityRangeBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.peakVelocityRangeBuilder_ = null;
                }
                this.meanPowerLossPercentage_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMeanPowerLossPercentage() {
                this.bitField0_ &= -33;
                this.meanPowerLossPercentage_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMeanVelocityLossPercentage() {
                this.bitField0_ &= -3;
                this.meanVelocityLossPercentage_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMeanVelocityRange() {
                this.bitField0_ &= -5;
                this.meanVelocityRange_ = null;
                SingleFieldBuilderV3<VelocityRange, VelocityRange.Builder, VelocityRangeOrBuilder> singleFieldBuilderV3 = this.meanVelocityRangeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.meanVelocityRangeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearMeanVelocityZone() {
                this.bitField0_ &= -2;
                this.meanVelocityZone_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPeakVelocityLossPercentage() {
                this.bitField0_ &= -9;
                this.peakVelocityLossPercentage_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPeakVelocityRange() {
                this.bitField0_ &= -17;
                this.peakVelocityRange_ = null;
                SingleFieldBuilderV3<VelocityRange, VelocityRange.Builder, VelocityRangeOrBuilder> singleFieldBuilderV3 = this.peakVelocityRangeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.peakVelocityRangeBuilder_ = null;
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
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_VbtTarget_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
            public int getMeanPowerLossPercentage() {
                return this.meanPowerLossPercentage_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
            public int getMeanVelocityLossPercentage() {
                return this.meanVelocityLossPercentage_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
            public VelocityRange getMeanVelocityRange() {
                SingleFieldBuilderV3<VelocityRange, VelocityRange.Builder, VelocityRangeOrBuilder> singleFieldBuilderV3 = this.meanVelocityRangeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VelocityRange) singleFieldBuilderV3.getMessage();
                }
                VelocityRange velocityRange = this.meanVelocityRange_;
                return velocityRange == null ? VelocityRange.getDefaultInstance() : velocityRange;
            }

            public VelocityRange.Builder getMeanVelocityRangeBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (VelocityRange.Builder) getMeanVelocityRangeFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
            public VelocityRangeOrBuilder getMeanVelocityRangeOrBuilder() {
                SingleFieldBuilderV3<VelocityRange, VelocityRange.Builder, VelocityRangeOrBuilder> singleFieldBuilderV3 = this.meanVelocityRangeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VelocityRangeOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                VelocityRange velocityRange = this.meanVelocityRange_;
                return velocityRange == null ? VelocityRange.getDefaultInstance() : velocityRange;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
            public VbtZone getMeanVelocityZone() {
                VbtZone vbtZoneForNumber = VbtZone.forNumber(this.meanVelocityZone_);
                return vbtZoneForNumber == null ? VbtZone.UNKNOWN : vbtZoneForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
            public int getPeakVelocityLossPercentage() {
                return this.peakVelocityLossPercentage_;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
            public VelocityRange getPeakVelocityRange() {
                SingleFieldBuilderV3<VelocityRange, VelocityRange.Builder, VelocityRangeOrBuilder> singleFieldBuilderV3 = this.peakVelocityRangeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VelocityRange) singleFieldBuilderV3.getMessage();
                }
                VelocityRange velocityRange = this.peakVelocityRange_;
                return velocityRange == null ? VelocityRange.getDefaultInstance() : velocityRange;
            }

            public VelocityRange.Builder getPeakVelocityRangeBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (VelocityRange.Builder) getPeakVelocityRangeFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
            public VelocityRangeOrBuilder getPeakVelocityRangeOrBuilder() {
                SingleFieldBuilderV3<VelocityRange, VelocityRange.Builder, VelocityRangeOrBuilder> singleFieldBuilderV3 = this.peakVelocityRangeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VelocityRangeOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                VelocityRange velocityRange = this.peakVelocityRange_;
                return velocityRange == null ? VelocityRange.getDefaultInstance() : velocityRange;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
            public boolean hasMeanPowerLossPercentage() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
            public boolean hasMeanVelocityLossPercentage() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
            public boolean hasMeanVelocityRange() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
            public boolean hasMeanVelocityZone() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
            public boolean hasPeakVelocityLossPercentage() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTargetOrBuilder
            public boolean hasPeakVelocityRange() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXcelStrengthGroupSession.internal_static_GDI_Proto_XcelStrengthGroupSession_VbtTarget_fieldAccessorTable.ensureFieldAccessorsInitialized(VbtTarget.class, Builder.class);
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
                                    if (VbtZone.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.meanVelocityZone_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.meanVelocityLossPercentage_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getMeanVelocityRangeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.peakVelocityLossPercentage_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getPeakVelocityRangeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    this.meanPowerLossPercentage_ = codedInputStream.readUInt32();
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

            public Builder mergeMeanVelocityRange(VelocityRange velocityRange) {
                VelocityRange velocityRange2;
                SingleFieldBuilderV3<VelocityRange, VelocityRange.Builder, VelocityRangeOrBuilder> singleFieldBuilderV3 = this.meanVelocityRangeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(velocityRange);
                } else if ((this.bitField0_ & 4) == 0 || (velocityRange2 = this.meanVelocityRange_) == null || velocityRange2 == VelocityRange.getDefaultInstance()) {
                    this.meanVelocityRange_ = velocityRange;
                } else {
                    getMeanVelocityRangeBuilder().mergeFrom(velocityRange);
                }
                if (this.meanVelocityRange_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergePeakVelocityRange(VelocityRange velocityRange) {
                VelocityRange velocityRange2;
                SingleFieldBuilderV3<VelocityRange, VelocityRange.Builder, VelocityRangeOrBuilder> singleFieldBuilderV3 = this.peakVelocityRangeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(velocityRange);
                } else if ((this.bitField0_ & 16) == 0 || (velocityRange2 = this.peakVelocityRange_) == null || velocityRange2 == VelocityRange.getDefaultInstance()) {
                    this.peakVelocityRange_ = velocityRange;
                } else {
                    getPeakVelocityRangeBuilder().mergeFrom(velocityRange);
                }
                if (this.peakVelocityRange_ != null) {
                    this.bitField0_ |= 16;
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

            public Builder setMeanPowerLossPercentage(int i14) {
                this.meanPowerLossPercentage_ = i14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setMeanVelocityLossPercentage(int i14) {
                this.meanVelocityLossPercentage_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMeanVelocityRange(VelocityRange.Builder builder) {
                SingleFieldBuilderV3<VelocityRange, VelocityRange.Builder, VelocityRangeOrBuilder> singleFieldBuilderV3 = this.meanVelocityRangeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.meanVelocityRange_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMeanVelocityZone(VbtZone vbtZone) {
                vbtZone.getClass();
                this.bitField0_ |= 1;
                this.meanVelocityZone_ = vbtZone.getNumber();
                onChanged();
                return this;
            }

            public Builder setPeakVelocityLossPercentage(int i14) {
                this.peakVelocityLossPercentage_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setPeakVelocityRange(VelocityRange.Builder builder) {
                SingleFieldBuilderV3<VelocityRange, VelocityRange.Builder, VelocityRangeOrBuilder> singleFieldBuilderV3 = this.peakVelocityRangeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.peakVelocityRange_ = builder.build();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public VbtTarget getDefaultInstanceForType() {
                return VbtTarget.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.meanVelocityZone_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setMeanVelocityRange(VelocityRange velocityRange) {
                SingleFieldBuilderV3<VelocityRange, VelocityRange.Builder, VelocityRangeOrBuilder> singleFieldBuilderV3 = this.meanVelocityRangeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    velocityRange.getClass();
                    this.meanVelocityRange_ = velocityRange;
                } else {
                    singleFieldBuilderV3.setMessage(velocityRange);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPeakVelocityRange(VelocityRange velocityRange) {
                SingleFieldBuilderV3<VelocityRange, VelocityRange.Builder, VelocityRangeOrBuilder> singleFieldBuilderV3 = this.peakVelocityRangeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    velocityRange.getClass();
                    this.peakVelocityRange_ = velocityRange;
                } else {
                    singleFieldBuilderV3.setMessage(velocityRange);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof VbtTarget) {
                    return mergeFrom((VbtTarget) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(VbtTarget vbtTarget) {
                if (vbtTarget == VbtTarget.getDefaultInstance()) {
                    return this;
                }
                if (vbtTarget.hasMeanVelocityZone()) {
                    setMeanVelocityZone(vbtTarget.getMeanVelocityZone());
                }
                if (vbtTarget.hasMeanVelocityLossPercentage()) {
                    setMeanVelocityLossPercentage(vbtTarget.getMeanVelocityLossPercentage());
                }
                if (vbtTarget.hasMeanVelocityRange()) {
                    mergeMeanVelocityRange(vbtTarget.getMeanVelocityRange());
                }
                if (vbtTarget.hasPeakVelocityLossPercentage()) {
                    setPeakVelocityLossPercentage(vbtTarget.getPeakVelocityLossPercentage());
                }
                if (vbtTarget.hasPeakVelocityRange()) {
                    mergePeakVelocityRange(vbtTarget.getPeakVelocityRange());
                }
                if (vbtTarget.hasMeanPowerLossPercentage()) {
                    setMeanPowerLossPercentage(vbtTarget.getMeanPowerLossPercentage());
                }
                mergeUnknownFields(vbtTarget.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public VbtTarget getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static VbtTarget parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VbtTarget) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VbtTarget parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static VbtTarget parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VbtTarget parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static VbtTarget parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static VbtTarget parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static VbtTarget parseFrom(InputStream inputStream) {
            return (VbtTarget) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ VbtTarget(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static VbtTarget parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VbtTarget) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private VbtTarget() {
            this.meanVelocityLossPercentage_ = 0;
            this.peakVelocityLossPercentage_ = 0;
            this.meanPowerLossPercentage_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.meanVelocityZone_ = 0;
        }

        public static VbtTarget parseFrom(CodedInputStream codedInputStream) {
            return (VbtTarget) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static VbtTarget parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VbtTarget) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum VbtZone implements ProtocolMessageEnum {
            UNKNOWN(0),
            MAX_STRENGTH(1),
            ACCELERATIVE_STRENGTH(2),
            STRENGTH_SEPED(3),
            SPEED_STRENGTH(4),
            STRARTING_STRENGTH(5);

            public static final int ACCELERATIVE_STRENGTH_VALUE = 2;
            public static final int MAX_STRENGTH_VALUE = 1;
            public static final int SPEED_STRENGTH_VALUE = 4;
            public static final int STRARTING_STRENGTH_VALUE = 5;
            public static final int STRENGTH_SEPED_VALUE = 3;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<VbtZone> internalValueMap = new Internal.EnumLiteMap<VbtZone>() { // from class: com.garmin.proto.generated.GDIXcelStrengthGroupSession.VbtTarget.VbtZone.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public VbtZone findValueByNumber(int i14) {
                    return VbtZone.forNumber(i14);
                }
            };
            private static final VbtZone[] VALUES = values();

            VbtZone(int i14) {
                this.value = i14;
            }

            public static VbtZone forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return MAX_STRENGTH;
                }
                if (i14 == 2) {
                    return ACCELERATIVE_STRENGTH;
                }
                if (i14 == 3) {
                    return STRENGTH_SEPED;
                }
                if (i14 == 4) {
                    return SPEED_STRENGTH;
                }
                if (i14 != 5) {
                    return null;
                }
                return STRARTING_STRENGTH;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return VbtTarget.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<VbtZone> internalGetValueMap() {
                return internalValueMap;
            }

            public static VbtZone valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static VbtZone valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
