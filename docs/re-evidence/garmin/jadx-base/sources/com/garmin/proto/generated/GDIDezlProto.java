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
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIDezlProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\rGDIDezl.proto\u0012\u000eGDI.Proto.Dezl\u001a\u0015GDIEventSharing.proto\"¡\b\n\u000bDezlService\u0012T\n\u001ftruck_stop_loyalty_info_request\u0018\u0001 \u0001(\u000b2+.GDI.Proto.Dezl.TruckStopLoyaltyInfoRequest\u0012V\n truck_stop_loyalty_info_response\u0018\u0002 \u0001(\u000b2,.GDI.Proto.Dezl.TruckStopLoyaltyInfoResponse\u0012^\n$truck_stop_loyalty_info_notification\u0018\u0003 \u0001(\u000b20.GDI.Proto.Dezl.TruckStopLoyaltyInfoNotification\u0012N\n\u001bwellness_suggestion_request\u0018\u0004 \u0001(\u000b2).GDI.Proto.Dezl.WellnessSuggestionRequest\u0012P\n\u001cwellness_suggestion_response\u0018\u0005 \u0001(\u000b2*.GDI.Proto.Dezl.WellnessSuggestionResponse\u0012R\n\u001dworkout_selected_notification\u0018\u0006 \u0001(\u000b2+.GDI.Proto.Dezl.WorkoutSelectedNotification\u0012N\n\u001bstage_selected_notification\u0018\u0007 \u0001(\u000b2).GDI.Proto.Dezl.StageSelectedNotification\u0012L\n\u001astage_started_notification\u0018\b \u0001(\u000b2(.GDI.Proto.Dezl.StageStartedNotification\u0012P\n\u001cstage_completed_notification\u0018\t \u0001(\u000b2*.GDI.Proto.Dezl.StageCompletedNotification\u0012J\n\u0019stage_paused_notification\u0018\n \u0001(\u000b2'.GDI.Proto.Dezl.StagePausedNotification\u0012R\n\u001dworkout_canceled_notification\u0018\u000b \u0001(\u000b2+.GDI.Proto.Dezl.WorkoutCanceledNotification\u0012=\n\u000eenable_request\u0018\f \u0001(\u000b2%.GDI.Proto.Dezl.FeaturesEnableRequest\u0012?\n\u000fenable_response\u0018\r \u0001(\u000b2&.GDI.Proto.Dezl.FeaturesEnableResponse\"é\u0003\n$BreakPlannerStateChangedNotification\u0012\u0011\n\ttimestamp\u0018\u0001 \u0001(\u0004\u0012\u001a\n\u0012daily_driven_timer\u0018\u0002 \u0001(\r\u0012\u001e\n\u0016time_until_break_timer\u0018\u0003 \u0001(\r\u0012\u001a\n\u0012total_driven_timer\u0018\u0004 \u0001(\r\u0012T\n\u000btimer_state\u0018\u0005 \u0001(\u000e2?.GDI.Proto.Dezl.BreakPlannerStateChangedNotification.TimerState\u0012\u0015\n\relog_detected\u0018\u0006 \u0001(\b\u0012\u0015\n\rtime_on_break\u0018\u0007 \u0001(\r\"J\n\nTimerState\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u000b\n\u0007DRIVING\u0010\u0001\u0012\u000b\n\u0007STOPPED\u0010\u0002\u0012\t\n\u0005RESET\u0010\u0003\u0012\n\n\u0006PAUSED\u0010\u00042\u0085\u0001\n\u001bbreak_planner_state_changed\u0012).GDI.Proto.EventSharing.AlertNotification\u0018ë\u0007 \u0001(\u000b24.GDI.Proto.Dezl.BreakPlannerStateChangedNotification\"¡\u0003\n\u001fDrivingStateChangedNotification\u0012S\n\rdriving_state\u0018\u0001 \u0001(\u000e2<.GDI.Proto.Dezl.DrivingStateChangedNotification.DrivingState\u0012F\n\u0006source\u0018\u0002 \u0001(\u000e26.GDI.Proto.Dezl.DrivingStateChangedNotification.Source\"5\n\fDrivingState\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u000b\n\u0007STARTED\u0010\u0001\u0012\u000b\n\u0007STOPPED\u0010\u0002\".\n\u0006Source\u0012\u0012\n\u000eUNKNOWN_SOURCE\u0010\u0000\u0012\u0007\n\u0003APP\u0010\u0001\u0012\u0007\n\u0003PND\u0010\u00022z\n\u0015driving_state_changed\u0012).GDI.Proto.EventSharing.AlertNotification\u0018ì\u0007 \u0001(\u000b2/.GDI.Proto.Dezl.DrivingStateChangedNotification\"E\n\u001bTruckStopLoyaltyInfoRequest\u0012&\n\u0006vendor\u0018\u0001 \u0001(\u000e2\u0016.GDI.Proto.Dezl.Vendor\"Z\n\u001cTruckStopLoyaltyInfoResponse\u0012:\n\floyalty_info\u0018\u0001 \u0001(\u000b2$.GDI.Proto.Dezl.TruckStopLoyaltyInfo\"^\n TruckStopLoyaltyInfoNotification\u0012:\n\floyalty_info\u0018\u0001 \u0001(\u000b2$.GDI.Proto.Dezl.TruckStopLoyaltyInfo\"¤\u0003\n\u0014TruckStopLoyaltyInfo\u0012&\n\u0006vendor\u0018\u0001 \u0001(\u000e2\u0016.GDI.Proto.Dezl.Vendor\u00122\n\tuser_info\u0018\u0002 \u0001(\u000b2\u001f.GDI.Proto.Dezl.LoyaltyUserInfo\u00121\n\bbalances\u0018\u0003 \u0001(\u000b2\u001f.GDI.Proto.Dezl.LoyaltyBalances\u00126\n\u000breward_info\u0018\u0004 \u0001(\u000b2!.GDI.Proto.Dezl.LoyaltyRewardInfo\u00122\n\tgoal_info\u0018\u0005 \u0001(\u000b2\u001f.GDI.Proto.Dezl.LoyaltyGoalInfo\u0012?\n\u0010bonus_offer_info\u0018\u0006 \u0001(\u000b2%.GDI.Proto.Dezl.LoyaltyBonusOfferInfo\u0012:\n\rcampaign_info\u0018\u0007 \u0001(\u000b2#.GDI.Proto.Dezl.LoyaltyCampaignInfo\u0012\u0014\n\fis_logged_in\u0018\b \u0001(\b\"i\n\u000fLoyaltyUserInfo\u0012\u001b\n\u0013loyalty_card_number\u0018\u0001 \u0001(\t\u0012\u0012\n\ncontact_id\u0018\u0002 \u0001(\t\u0012\u0012\n\nfirst_name\u0018\u0003 \u0001(\t\u0012\u0011\n\tlast_name\u0018\u0004 \u0001(\t\"È\u0001\n\u000fLoyaltyBalances\u0012$\n\u001ccurrent_drink_credit_balance\u0018\u0001 \u0001(\r\u0012\u001f\n\u0017current_gallons_balance\u0018\u0002 \u0001(\r\u0012\u001e\n\u0016current_points_balance\u0018\u0003 \u0001(\r\u0012%\n\u001dcurrent_shower_credit_balance\u0018\u0004 \u0001(\r\u0012'\n\u001fcurrent_tirepass_credit_balance\u0018\u0005 \u0001(\r\"á\u0001\n\u0011LoyaltyRewardInfo\u0012\u0014\n\fcurrent_tier\u0018\u0001 \u0001(\t\u0012\u0015\n\rearned_reward\u0018\u0002 \u0001(\t\u0012\u0017\n\u000freward_category\u0018\u0003 \u0001(\t\u0012\u0017\n\u000fmargin_category\u0018\u0004 \u0001(\t\u0012\u001c\n\u0014gallons_to_next_tier\u0018\u0005 \u0001(\r\u0012\u0011\n\tnext_tier\u0018\u0006 \u0001(\t\u0012!\n\u0019earning_points_per_gallon\u0018\u0007 \u0001(\r\u0012\u0019\n\u0011gallons_this_year\u0018\b \u0001(\r\"\u0083\u0001\n\u000fLoyaltyGoalInfo\u0012\u0014\n\fachieve_goal\u0018\u0001 \u0001(\r\u0012\u001d\n\u0015achieve_goal_progress\u0018\u0002 \u0001(\r\u0012\u001e\n\u0016achieve_goal_remaining\u0018\u0003 \u0001(\u0011\u0012\u001b\n\u0013final_goal_achieved\u0018\u0004 \u0001(\b\"\u009a\u0001\n\u0015LoyaltyBonusOfferInfo\u0012\u001b\n\u0013current_bonus_offer\u0018\u0001 \u0001(\t\u0012&\n\u001ecurrent_bonus_offer_segment_id\u0018\u0002 \u0001(\t\u0012\u001e\n\u0016bonus_offer_start_date\u0018\u0003 \u0001(\t\u0012\u001c\n\u0014bonus_offer_end_date\u0018\u0004 \u0001(\t\"\u0099\u0001\n\u0013LoyaltyCampaignInfo\u0012\u0015\n\rcampaign_name\u0018\u0001 \u0001(\t\u0012\u0019\n\u0011campaign_name_agg\u0018\u0002 \u0001(\t\u0012\u0017\n\u000fcampaign_joined\u0018\u0003 \u0001(\b\u0012\u001e\n\u0016click_to_join_campaign\u0018\u0004 \u0001(\b\u0012\u0017\n\u000fladder_campaign\u0018\u0005 \u0001(\b\"\u0097\u0001\n\u0015OTRHealthWorkoutStage\u00124\n\nstage_type\u0018\u0001 \u0001(\u000e2 .GDI.Proto.Dezl.WorkoutStageType\u0012\u0016\n\u000estage_duration\u0018\u0002 \u0001(\r\u0012\u0019\n\u0011exercise_category\u0018\u0003 \u0001(\r\u0012\u0015\n\rexercise_name\u0018\u0004 \u0001(\r\"¼\u0001\n\u0010OTRHealthWorkout\u0012\u0014\n\fworkout_name\u0018\u0001 \u0001(\t\u0012\u0011\n\tfit_sport\u0018\u0002 \u0001(\r\u0012\u0015\n\rfit_sub_sport\u0018\u0003 \u0001(\r\u00125\n\u0006stages\u0018\u0004 \u0003(\u000b2%.GDI.Proto.Dezl.OTRHealthWorkoutStage\u00121\n\fworkout_type\u0018\u0005 \u0001(\u000e2\u001b.GDI.Proto.Dezl.WorkoutType\"Y\n\u001bWorkoutSelectedNotification\u0012:\n\u0010selected_workout\u0018\u0001 \u0001(\u000b2 .GDI.Proto.Dezl.OTRHealthWorkout\"\u001d\n\u001bWorkoutCanceledNotification\"9\n\u0019StageSelectedNotification\u0012\u001c\n\u0014selected_stage_index\u0018\u0001 \u0001(\r\"N\n\u0018StageStartedNotification\u0012\u001c\n\u0014selected_stage_index\u0018\u0001 \u0001(\r\u0012\u0014\n\felapsed_time\u0018\u0002 \u0001(\r\";\n\u001aStageCompletedNotification\u0012\u001d\n\u0015completed_stage_index\u0018\u0001 \u0001(\r\"\u0019\n\u0017StagePausedNotification\"\u001b\n\u0019WellnessSuggestionRequest\"\u0090\u0001\n\u001aWellnessSuggestionResponse\u0012?\n\u0013wellness_suggestion\u0018\u0001 \u0001(\u000e2\".GDI.Proto.Dezl.WellnessSuggestion\u00121\n\bpnd_data\u0018\u0002 \u0001(\u000b2\u001f.GDI.Proto.Dezl.PndWellnessData\"¸\u0001\n\u000fPndWellnessData\u0012\u001a\n\u0012miles_driven_today\u0018\u0001 \u0001(\r\u0012$\n\u001cmiles_driven_since_last_stop\u0018\u0002 \u0001(\r\u0012\"\n\u001adistance_to_next_rest_area\u0018\u0003 \u0001(\r\u0012!\n\u0019hours_driven_without_stop\u0018\u0004 \u0001(\r\u0012\u001c\n\u0014drive_timer_near_max\u0018\u0005 \u0001(\b\"\u0084\u0001\n\u0015FeaturesEnableRequest\u0012<\n\u0006action\u0018\u0001 \u0001(\u000e2,.GDI.Proto.Dezl.FeaturesEnableRequest.Action\"-\n\u0006Action\u0012\n\n\u0006STATUS\u0010\u0000\u0012\n\n\u0006ENABLE\u0010\u0001\u0012\u000b\n\u0007DISABLE\u0010\u0002\"\u009c\u0001\n\u0016FeaturesEnableResponse\u0012E\n\u0006status\u0018\u0001 \u0001(\u000e25.GDI.Proto.Dezl.FeaturesEnableResponse.ResponseStatus\u0012\u000f\n\u0007enabled\u0018\u0002 \u0001(\b\"*\n\u000eResponseStatus\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\u000b\n\u0007FAILURE\u0010\u0001*&\n\u0006Vendor\u0012\t\n\u0005LOVES\u0010\u0000\u0012\u0011\n\rPILOT_FLYINGJ\u0010\u0001*å\u0001\n\u0010WorkoutStageType\u0012\u0011\n\rUNKNOWN_STAGE\u0010\u0000\u0012\u000e\n\nREST_STAGE\u0010\u0001\u0012\u0012\n\u000eEXERCISE_STAGE\u0010\u0002\u0012 \n\u001cREST_BETWEEN_EXERCISES_STAGE\u0010\u0003\u0012\u001d\n\u0019EXERCISE_MIRROR_ARM_STAGE\u0010\u0004\u0012\u001d\n\u0019EXERCISE_MIRROR_LEG_STAGE\u0010\u0005\u0012\u001e\n\u001aEXERCISE_MIRROR_SIDE_STAGE\u0010\u0006\u0012\u001a\n\u0016EXERCISE_DURATION_OPEN\u0010\u0007*\u0087\u0003\n\u000bWorkoutType\u0012\u0010\n\fUNKNOWN_TYPE\u0010\u0000\u0012\u0013\n\u000fSTRETCH_WORKOUT\u0010\u0001\u0012\u0019\n\u0015LOW_INTENSITY_WORKOUT\u0010\u0002\u0012\u001a\n\u0016HIGH_INTENSITY_WORKOUT\u0010\u0003\u0012\u0017\n\u0013KR_BODY_WEIGHT_CORE\u0010\u0004\u0012\u0017\n\u0013KR_BODY_WEIGHT_PUSH\u0010\u0005\u0012\u0017\n\u0013KR_BODY_WEIGHT_PULL\u0010\u0006\u0012\u0014\n\u0010KR_DUMBBELL_CORE\u0010\u0007\u0012\u0014\n\u0010KR_DUMBBELL_PUSH\u0010\b\u0012\u0014\n\u0010KR_DUMBBELL_PULL\u0010\t\u0012\u001a\n\u0016KR_RESISTANCE_BAR_CORE\u0010\n\u0012\u001a\n\u0016KR_RESISTANCE_BAR_PUSH\u0010\u000b\u0012\u001a\n\u0016KR_RESISTANCE_BAR_PULL\u0010\f\u0012\u001a\n\u0016TRUCKERS_LIFE_AT_A_GYM\u0010\r\u0012\u001d\n\u0019TRUCKERS_LIFE_ON_THE_ROAD\u0010\u000e*©\u0006\n\u0012WellnessSuggestion\u0012\u001f\n\u001bUNKNOWN_WELLNESS_SUGGESTION\u0010\u0000\u0012\u0012\n\u000eINTENSITY_GOAL\u0010\u0001\u0012\u001f\n\u001bON_THE_ROAD_ALL_DAY_STRETCH\u0010\u0002\u0012\u001e\n\u001aACTIVE_CALORIES_COMPLIMENT\u0010\u0003\u0012\u0016\n\u0012NEED_X_DAILY_STEPS\u0010\u0004\u0012!\n\u001dDAILY_REMAINING_STEPS_TO_GOAL\u0010\u0005\u0012\u0018\n\u0014TEN_MINUTE_WALK_INFO\u0010\u0006\u0012!\n\u001dSTEP_GOAL_ACHIEVED_COMPLIMENT\u0010\u0007\u0012\u0017\n\u0013REDUCE_STRESS_RELAX\u0010\b\u0012\u0019\n\u0015REDUCE_STRESS_STRETCH\u0010\t\u0012\u0016\n\u0012REDUCE_STRESS_WALK\u0010\n\u0012\u001a\n\u0016REDUCE_STRESS_ACTIVITY\u0010\u000b\u0012\u001f\n\u001bHIGH_BODY_BATTERY_BE_ACTIVE\u0010\f\u0012\u001e\n\u001aLOW_BODY_BATTERY_BE_ACTIVE\u0010\r\u0012\u0014\n\u0010MORNING_ACTIVITY\u0010\u000e\u0012\u0016\n\u0012DRIVE_TIME_STRETCH\u0010\u000f\u0012\u0018\n\u0014DRIVE_TIME_WIND_DOWN\u0010\u0010\u0012\u0018\n\u0014HEART_RATE_BE_ACTIVE\u0010\u0011\u0012\u001b\n\u0017DAILY_INTENSITY_MINUTES\u0010\u0012\u0012\u001f\n\u001bBEAT_INTENSITY_MINUTES_GOAL\u0010\u0013\u0012\u0011\n\rTRY_A_WORKOUT\u0010\u0014\u0012\u0019\n\u0015NO_CONSTRAINT_STRETCH\u0010\u0015\u0012\u0013\n\u000fRECORD_ACTIVITY\u0010\u0016\u0012\u001f\n\u001bREST_AREA_AHEAD_TAKE_A_WALK\u0010\u0017\u0012'\n#MILES_DRIVEN_WITHOUT_STOP_BE_ACTIVE\u0010\u0018\u0012\u0012\n\u000eSTEPS_PER_MILE\u0010\u0019\u0012\u001b\n\u0017TOTAL_MILES_DRIVEN_WALK\u0010\u001a\u0012\u001e\n\u001aTOTAL_MILES_DRIVEN_STRETCH\u0010\u001bB,\n\u001acom.garmin.proto.generatedB\fGDIDezlProtoH\u0003"}, new Descriptors.FileDescriptor[]{GDIEventSharingProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_BreakPlannerStateChangedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_BreakPlannerStateChangedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_DezlService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_DezlService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_DrivingStateChangedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_DrivingStateChangedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_FeaturesEnableRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_FeaturesEnableRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_FeaturesEnableResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_FeaturesEnableResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_LoyaltyBalances_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_LoyaltyBalances_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_LoyaltyBonusOfferInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_LoyaltyBonusOfferInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_LoyaltyCampaignInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_LoyaltyCampaignInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_LoyaltyGoalInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_LoyaltyGoalInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_LoyaltyRewardInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_LoyaltyRewardInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_LoyaltyUserInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_LoyaltyUserInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_OTRHealthWorkoutStage_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_OTRHealthWorkoutStage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_OTRHealthWorkout_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_OTRHealthWorkout_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_PndWellnessData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_PndWellnessData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_StageCompletedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_StageCompletedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_StagePausedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_StagePausedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_StageSelectedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_StageSelectedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_StageStartedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_StageStartedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_WellnessSuggestionRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_WellnessSuggestionRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_WellnessSuggestionResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_WellnessSuggestionResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_WorkoutCanceledNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_WorkoutCanceledNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Dezl_WorkoutSelectedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Dezl_WorkoutSelectedNotification_fieldAccessorTable;

    public interface BreakPlannerStateChangedNotificationOrBuilder extends MessageOrBuilder {
        int getDailyDrivenTimer();

        boolean getElogDetected();

        int getTimeOnBreak();

        int getTimeUntilBreakTimer();

        BreakPlannerStateChangedNotification.TimerState getTimerState();

        long getTimestamp();

        int getTotalDrivenTimer();

        boolean hasDailyDrivenTimer();

        boolean hasElogDetected();

        boolean hasTimeOnBreak();

        boolean hasTimeUntilBreakTimer();

        boolean hasTimerState();

        boolean hasTimestamp();

        boolean hasTotalDrivenTimer();
    }

    public interface DezlServiceOrBuilder extends MessageOrBuilder {
        FeaturesEnableRequest getEnableRequest();

        FeaturesEnableRequestOrBuilder getEnableRequestOrBuilder();

        FeaturesEnableResponse getEnableResponse();

        FeaturesEnableResponseOrBuilder getEnableResponseOrBuilder();

        StageCompletedNotification getStageCompletedNotification();

        StageCompletedNotificationOrBuilder getStageCompletedNotificationOrBuilder();

        StagePausedNotification getStagePausedNotification();

        StagePausedNotificationOrBuilder getStagePausedNotificationOrBuilder();

        StageSelectedNotification getStageSelectedNotification();

        StageSelectedNotificationOrBuilder getStageSelectedNotificationOrBuilder();

        StageStartedNotification getStageStartedNotification();

        StageStartedNotificationOrBuilder getStageStartedNotificationOrBuilder();

        TruckStopLoyaltyInfoNotification getTruckStopLoyaltyInfoNotification();

        TruckStopLoyaltyInfoNotificationOrBuilder getTruckStopLoyaltyInfoNotificationOrBuilder();

        TruckStopLoyaltyInfoRequest getTruckStopLoyaltyInfoRequest();

        TruckStopLoyaltyInfoRequestOrBuilder getTruckStopLoyaltyInfoRequestOrBuilder();

        TruckStopLoyaltyInfoResponse getTruckStopLoyaltyInfoResponse();

        TruckStopLoyaltyInfoResponseOrBuilder getTruckStopLoyaltyInfoResponseOrBuilder();

        WellnessSuggestionRequest getWellnessSuggestionRequest();

        WellnessSuggestionRequestOrBuilder getWellnessSuggestionRequestOrBuilder();

        WellnessSuggestionResponse getWellnessSuggestionResponse();

        WellnessSuggestionResponseOrBuilder getWellnessSuggestionResponseOrBuilder();

        WorkoutCanceledNotification getWorkoutCanceledNotification();

        WorkoutCanceledNotificationOrBuilder getWorkoutCanceledNotificationOrBuilder();

        WorkoutSelectedNotification getWorkoutSelectedNotification();

        WorkoutSelectedNotificationOrBuilder getWorkoutSelectedNotificationOrBuilder();

        boolean hasEnableRequest();

        boolean hasEnableResponse();

        boolean hasStageCompletedNotification();

        boolean hasStagePausedNotification();

        boolean hasStageSelectedNotification();

        boolean hasStageStartedNotification();

        boolean hasTruckStopLoyaltyInfoNotification();

        boolean hasTruckStopLoyaltyInfoRequest();

        boolean hasTruckStopLoyaltyInfoResponse();

        boolean hasWellnessSuggestionRequest();

        boolean hasWellnessSuggestionResponse();

        boolean hasWorkoutCanceledNotification();

        boolean hasWorkoutSelectedNotification();
    }

    public interface DrivingStateChangedNotificationOrBuilder extends MessageOrBuilder {
        DrivingStateChangedNotification.DrivingState getDrivingState();

        DrivingStateChangedNotification.Source getSource();

        boolean hasDrivingState();

        boolean hasSource();
    }

    public interface FeaturesEnableRequestOrBuilder extends MessageOrBuilder {
        FeaturesEnableRequest.Action getAction();

        boolean hasAction();
    }

    public interface FeaturesEnableResponseOrBuilder extends MessageOrBuilder {
        boolean getEnabled();

        FeaturesEnableResponse.ResponseStatus getStatus();

        boolean hasEnabled();

        boolean hasStatus();
    }

    public interface LoyaltyBalancesOrBuilder extends MessageOrBuilder {
        int getCurrentDrinkCreditBalance();

        int getCurrentGallonsBalance();

        int getCurrentPointsBalance();

        int getCurrentShowerCreditBalance();

        int getCurrentTirepassCreditBalance();

        boolean hasCurrentDrinkCreditBalance();

        boolean hasCurrentGallonsBalance();

        boolean hasCurrentPointsBalance();

        boolean hasCurrentShowerCreditBalance();

        boolean hasCurrentTirepassCreditBalance();
    }

    public interface LoyaltyBonusOfferInfoOrBuilder extends MessageOrBuilder {
        String getBonusOfferEndDate();

        ByteString getBonusOfferEndDateBytes();

        String getBonusOfferStartDate();

        ByteString getBonusOfferStartDateBytes();

        String getCurrentBonusOffer();

        ByteString getCurrentBonusOfferBytes();

        String getCurrentBonusOfferSegmentId();

        ByteString getCurrentBonusOfferSegmentIdBytes();

        boolean hasBonusOfferEndDate();

        boolean hasBonusOfferStartDate();

        boolean hasCurrentBonusOffer();

        boolean hasCurrentBonusOfferSegmentId();
    }

    public interface LoyaltyCampaignInfoOrBuilder extends MessageOrBuilder {
        boolean getCampaignJoined();

        String getCampaignName();

        String getCampaignNameAgg();

        ByteString getCampaignNameAggBytes();

        ByteString getCampaignNameBytes();

        boolean getClickToJoinCampaign();

        boolean getLadderCampaign();

        boolean hasCampaignJoined();

        boolean hasCampaignName();

        boolean hasCampaignNameAgg();

        boolean hasClickToJoinCampaign();

        boolean hasLadderCampaign();
    }

    public interface LoyaltyGoalInfoOrBuilder extends MessageOrBuilder {
        int getAchieveGoal();

        int getAchieveGoalProgress();

        int getAchieveGoalRemaining();

        boolean getFinalGoalAchieved();

        boolean hasAchieveGoal();

        boolean hasAchieveGoalProgress();

        boolean hasAchieveGoalRemaining();

        boolean hasFinalGoalAchieved();
    }

    public interface LoyaltyRewardInfoOrBuilder extends MessageOrBuilder {
        String getCurrentTier();

        ByteString getCurrentTierBytes();

        String getEarnedReward();

        ByteString getEarnedRewardBytes();

        int getEarningPointsPerGallon();

        int getGallonsThisYear();

        int getGallonsToNextTier();

        String getMarginCategory();

        ByteString getMarginCategoryBytes();

        String getNextTier();

        ByteString getNextTierBytes();

        String getRewardCategory();

        ByteString getRewardCategoryBytes();

        boolean hasCurrentTier();

        boolean hasEarnedReward();

        boolean hasEarningPointsPerGallon();

        boolean hasGallonsThisYear();

        boolean hasGallonsToNextTier();

        boolean hasMarginCategory();

        boolean hasNextTier();

        boolean hasRewardCategory();
    }

    public interface LoyaltyUserInfoOrBuilder extends MessageOrBuilder {
        String getContactId();

        ByteString getContactIdBytes();

        String getFirstName();

        ByteString getFirstNameBytes();

        String getLastName();

        ByteString getLastNameBytes();

        String getLoyaltyCardNumber();

        ByteString getLoyaltyCardNumberBytes();

        boolean hasContactId();

        boolean hasFirstName();

        boolean hasLastName();

        boolean hasLoyaltyCardNumber();
    }

    public interface OTRHealthWorkoutOrBuilder extends MessageOrBuilder {
        int getFitSport();

        int getFitSubSport();

        OTRHealthWorkoutStage getStages(int i14);

        int getStagesCount();

        List<OTRHealthWorkoutStage> getStagesList();

        OTRHealthWorkoutStageOrBuilder getStagesOrBuilder(int i14);

        List<? extends OTRHealthWorkoutStageOrBuilder> getStagesOrBuilderList();

        String getWorkoutName();

        ByteString getWorkoutNameBytes();

        WorkoutType getWorkoutType();

        boolean hasFitSport();

        boolean hasFitSubSport();

        boolean hasWorkoutName();

        boolean hasWorkoutType();
    }

    public interface OTRHealthWorkoutStageOrBuilder extends MessageOrBuilder {
        int getExerciseCategory();

        int getExerciseName();

        int getStageDuration();

        WorkoutStageType getStageType();

        boolean hasExerciseCategory();

        boolean hasExerciseName();

        boolean hasStageDuration();

        boolean hasStageType();
    }

    public interface PndWellnessDataOrBuilder extends MessageOrBuilder {
        int getDistanceToNextRestArea();

        boolean getDriveTimerNearMax();

        int getHoursDrivenWithoutStop();

        int getMilesDrivenSinceLastStop();

        int getMilesDrivenToday();

        boolean hasDistanceToNextRestArea();

        boolean hasDriveTimerNearMax();

        boolean hasHoursDrivenWithoutStop();

        boolean hasMilesDrivenSinceLastStop();

        boolean hasMilesDrivenToday();
    }

    public interface StageCompletedNotificationOrBuilder extends MessageOrBuilder {
        int getCompletedStageIndex();

        boolean hasCompletedStageIndex();
    }

    public interface StagePausedNotificationOrBuilder extends MessageOrBuilder {
    }

    public interface StageSelectedNotificationOrBuilder extends MessageOrBuilder {
        int getSelectedStageIndex();

        boolean hasSelectedStageIndex();
    }

    public interface StageStartedNotificationOrBuilder extends MessageOrBuilder {
        int getElapsedTime();

        int getSelectedStageIndex();

        boolean hasElapsedTime();

        boolean hasSelectedStageIndex();
    }

    public interface TruckStopLoyaltyInfoNotificationOrBuilder extends MessageOrBuilder {
        TruckStopLoyaltyInfo getLoyaltyInfo();

        TruckStopLoyaltyInfoOrBuilder getLoyaltyInfoOrBuilder();

        boolean hasLoyaltyInfo();
    }

    public interface TruckStopLoyaltyInfoOrBuilder extends MessageOrBuilder {
        LoyaltyBalances getBalances();

        LoyaltyBalancesOrBuilder getBalancesOrBuilder();

        LoyaltyBonusOfferInfo getBonusOfferInfo();

        LoyaltyBonusOfferInfoOrBuilder getBonusOfferInfoOrBuilder();

        LoyaltyCampaignInfo getCampaignInfo();

        LoyaltyCampaignInfoOrBuilder getCampaignInfoOrBuilder();

        LoyaltyGoalInfo getGoalInfo();

        LoyaltyGoalInfoOrBuilder getGoalInfoOrBuilder();

        boolean getIsLoggedIn();

        LoyaltyRewardInfo getRewardInfo();

        LoyaltyRewardInfoOrBuilder getRewardInfoOrBuilder();

        LoyaltyUserInfo getUserInfo();

        LoyaltyUserInfoOrBuilder getUserInfoOrBuilder();

        Vendor getVendor();

        boolean hasBalances();

        boolean hasBonusOfferInfo();

        boolean hasCampaignInfo();

        boolean hasGoalInfo();

        boolean hasIsLoggedIn();

        boolean hasRewardInfo();

        boolean hasUserInfo();

        boolean hasVendor();
    }

    public interface TruckStopLoyaltyInfoRequestOrBuilder extends MessageOrBuilder {
        Vendor getVendor();

        boolean hasVendor();
    }

    public interface TruckStopLoyaltyInfoResponseOrBuilder extends MessageOrBuilder {
        TruckStopLoyaltyInfo getLoyaltyInfo();

        TruckStopLoyaltyInfoOrBuilder getLoyaltyInfoOrBuilder();

        boolean hasLoyaltyInfo();
    }

    public interface WellnessSuggestionRequestOrBuilder extends MessageOrBuilder {
    }

    public interface WellnessSuggestionResponseOrBuilder extends MessageOrBuilder {
        PndWellnessData getPndData();

        PndWellnessDataOrBuilder getPndDataOrBuilder();

        WellnessSuggestion getWellnessSuggestion();

        boolean hasPndData();

        boolean hasWellnessSuggestion();
    }

    public interface WorkoutCanceledNotificationOrBuilder extends MessageOrBuilder {
    }

    public interface WorkoutSelectedNotificationOrBuilder extends MessageOrBuilder {
        OTRHealthWorkout getSelectedWorkout();

        OTRHealthWorkoutOrBuilder getSelectedWorkoutOrBuilder();

        boolean hasSelectedWorkout();
    }

    static {
        Descriptors.Descriptor descriptor2 = (Descriptors.Descriptor) f3.A(0);
        internal_static_GDI_Proto_Dezl_DezlService_descriptor = descriptor2;
        internal_static_GDI_Proto_Dezl_DezlService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"TruckStopLoyaltyInfoRequest", "TruckStopLoyaltyInfoResponse", "TruckStopLoyaltyInfoNotification", "WellnessSuggestionRequest", "WellnessSuggestionResponse", "WorkoutSelectedNotification", "StageSelectedNotification", "StageStartedNotification", "StageCompletedNotification", "StagePausedNotification", "WorkoutCanceledNotification", "EnableRequest", "EnableResponse"});
        Descriptors.Descriptor descriptor3 = (Descriptors.Descriptor) f3.A(1);
        internal_static_GDI_Proto_Dezl_BreakPlannerStateChangedNotification_descriptor = descriptor3;
        internal_static_GDI_Proto_Dezl_BreakPlannerStateChangedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Timestamp", "DailyDrivenTimer", "TimeUntilBreakTimer", "TotalDrivenTimer", "TimerState", "ElogDetected", "TimeOnBreak"});
        Descriptors.Descriptor descriptor4 = (Descriptors.Descriptor) f3.A(2);
        internal_static_GDI_Proto_Dezl_DrivingStateChangedNotification_descriptor = descriptor4;
        internal_static_GDI_Proto_Dezl_DrivingStateChangedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"DrivingState", "Source"});
        Descriptors.Descriptor descriptor5 = (Descriptors.Descriptor) f3.A(3);
        internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Vendor"});
        Descriptors.Descriptor descriptor6 = (Descriptors.Descriptor) f3.A(4);
        internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"LoyaltyInfo"});
        Descriptors.Descriptor descriptor7 = (Descriptors.Descriptor) f3.A(5);
        internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoNotification_descriptor = descriptor7;
        internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"LoyaltyInfo"});
        Descriptors.Descriptor descriptor8 = (Descriptors.Descriptor) f3.A(6);
        internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfo_descriptor = descriptor8;
        internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Vendor", "UserInfo", "Balances", "RewardInfo", "GoalInfo", "BonusOfferInfo", "CampaignInfo", "IsLoggedIn"});
        Descriptors.Descriptor descriptor9 = (Descriptors.Descriptor) f3.A(7);
        internal_static_GDI_Proto_Dezl_LoyaltyUserInfo_descriptor = descriptor9;
        internal_static_GDI_Proto_Dezl_LoyaltyUserInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"LoyaltyCardNumber", "ContactId", "FirstName", "LastName"});
        Descriptors.Descriptor descriptor10 = (Descriptors.Descriptor) f3.A(8);
        internal_static_GDI_Proto_Dezl_LoyaltyBalances_descriptor = descriptor10;
        internal_static_GDI_Proto_Dezl_LoyaltyBalances_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"CurrentDrinkCreditBalance", "CurrentGallonsBalance", "CurrentPointsBalance", "CurrentShowerCreditBalance", "CurrentTirepassCreditBalance"});
        Descriptors.Descriptor descriptor11 = (Descriptors.Descriptor) f3.A(9);
        internal_static_GDI_Proto_Dezl_LoyaltyRewardInfo_descriptor = descriptor11;
        internal_static_GDI_Proto_Dezl_LoyaltyRewardInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"CurrentTier", "EarnedReward", "RewardCategory", "MarginCategory", "GallonsToNextTier", "NextTier", "EarningPointsPerGallon", "GallonsThisYear"});
        Descriptors.Descriptor descriptor12 = (Descriptors.Descriptor) f3.A(10);
        internal_static_GDI_Proto_Dezl_LoyaltyGoalInfo_descriptor = descriptor12;
        internal_static_GDI_Proto_Dezl_LoyaltyGoalInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"AchieveGoal", "AchieveGoalProgress", "AchieveGoalRemaining", "FinalGoalAchieved"});
        Descriptors.Descriptor descriptor13 = (Descriptors.Descriptor) f3.A(11);
        internal_static_GDI_Proto_Dezl_LoyaltyBonusOfferInfo_descriptor = descriptor13;
        internal_static_GDI_Proto_Dezl_LoyaltyBonusOfferInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"CurrentBonusOffer", "CurrentBonusOfferSegmentId", "BonusOfferStartDate", "BonusOfferEndDate"});
        Descriptors.Descriptor descriptor14 = (Descriptors.Descriptor) f3.A(12);
        internal_static_GDI_Proto_Dezl_LoyaltyCampaignInfo_descriptor = descriptor14;
        internal_static_GDI_Proto_Dezl_LoyaltyCampaignInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"CampaignName", "CampaignNameAgg", "CampaignJoined", "ClickToJoinCampaign", "LadderCampaign"});
        Descriptors.Descriptor descriptor15 = (Descriptors.Descriptor) f3.A(13);
        internal_static_GDI_Proto_Dezl_OTRHealthWorkoutStage_descriptor = descriptor15;
        internal_static_GDI_Proto_Dezl_OTRHealthWorkoutStage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"StageType", "StageDuration", "ExerciseCategory", "ExerciseName"});
        Descriptors.Descriptor descriptor16 = (Descriptors.Descriptor) f3.A(14);
        internal_static_GDI_Proto_Dezl_OTRHealthWorkout_descriptor = descriptor16;
        internal_static_GDI_Proto_Dezl_OTRHealthWorkout_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"WorkoutName", "FitSport", "FitSubSport", "Stages", "WorkoutType"});
        Descriptors.Descriptor descriptor17 = (Descriptors.Descriptor) f3.A(15);
        internal_static_GDI_Proto_Dezl_WorkoutSelectedNotification_descriptor = descriptor17;
        internal_static_GDI_Proto_Dezl_WorkoutSelectedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"SelectedWorkout"});
        Descriptors.Descriptor descriptor18 = (Descriptors.Descriptor) f3.A(16);
        internal_static_GDI_Proto_Dezl_WorkoutCanceledNotification_descriptor = descriptor18;
        internal_static_GDI_Proto_Dezl_WorkoutCanceledNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[0]);
        Descriptors.Descriptor descriptor19 = (Descriptors.Descriptor) f3.A(17);
        internal_static_GDI_Proto_Dezl_StageSelectedNotification_descriptor = descriptor19;
        internal_static_GDI_Proto_Dezl_StageSelectedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"SelectedStageIndex"});
        Descriptors.Descriptor descriptor20 = (Descriptors.Descriptor) f3.A(18);
        internal_static_GDI_Proto_Dezl_StageStartedNotification_descriptor = descriptor20;
        internal_static_GDI_Proto_Dezl_StageStartedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"SelectedStageIndex", "ElapsedTime"});
        Descriptors.Descriptor descriptor21 = (Descriptors.Descriptor) f3.A(19);
        internal_static_GDI_Proto_Dezl_StageCompletedNotification_descriptor = descriptor21;
        internal_static_GDI_Proto_Dezl_StageCompletedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor21, new String[]{"CompletedStageIndex"});
        Descriptors.Descriptor descriptor22 = (Descriptors.Descriptor) f3.A(20);
        internal_static_GDI_Proto_Dezl_StagePausedNotification_descriptor = descriptor22;
        internal_static_GDI_Proto_Dezl_StagePausedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor22, new String[0]);
        Descriptors.Descriptor descriptor23 = (Descriptors.Descriptor) f3.A(21);
        internal_static_GDI_Proto_Dezl_WellnessSuggestionRequest_descriptor = descriptor23;
        internal_static_GDI_Proto_Dezl_WellnessSuggestionRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor23, new String[0]);
        Descriptors.Descriptor descriptor24 = (Descriptors.Descriptor) f3.A(22);
        internal_static_GDI_Proto_Dezl_WellnessSuggestionResponse_descriptor = descriptor24;
        internal_static_GDI_Proto_Dezl_WellnessSuggestionResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor24, new String[]{"WellnessSuggestion", "PndData"});
        Descriptors.Descriptor descriptor25 = (Descriptors.Descriptor) f3.A(23);
        internal_static_GDI_Proto_Dezl_PndWellnessData_descriptor = descriptor25;
        internal_static_GDI_Proto_Dezl_PndWellnessData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor25, new String[]{"MilesDrivenToday", "MilesDrivenSinceLastStop", "DistanceToNextRestArea", "HoursDrivenWithoutStop", "DriveTimerNearMax"});
        Descriptors.Descriptor descriptor26 = (Descriptors.Descriptor) f3.A(24);
        internal_static_GDI_Proto_Dezl_FeaturesEnableRequest_descriptor = descriptor26;
        internal_static_GDI_Proto_Dezl_FeaturesEnableRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor26, new String[]{"Action"});
        Descriptors.Descriptor descriptor27 = (Descriptors.Descriptor) f3.A(25);
        internal_static_GDI_Proto_Dezl_FeaturesEnableResponse_descriptor = descriptor27;
        internal_static_GDI_Proto_Dezl_FeaturesEnableResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor27, new String[]{"Status", "Enabled"});
        GDIEventSharingProto.getDescriptor();
    }

    private GDIDezlProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(BreakPlannerStateChangedNotification.breakPlannerStateChanged);
        extensionRegistryLite.add(DrivingStateChangedNotification.drivingStateChanged);
    }

    public static final class LoyaltyBalances extends GeneratedMessageV3 implements LoyaltyBalancesOrBuilder {
        public static final int CURRENT_DRINK_CREDIT_BALANCE_FIELD_NUMBER = 1;
        public static final int CURRENT_GALLONS_BALANCE_FIELD_NUMBER = 2;
        public static final int CURRENT_POINTS_BALANCE_FIELD_NUMBER = 3;
        public static final int CURRENT_SHOWER_CREDIT_BALANCE_FIELD_NUMBER = 4;
        public static final int CURRENT_TIREPASS_CREDIT_BALANCE_FIELD_NUMBER = 5;
        private static final LoyaltyBalances DEFAULT_INSTANCE = new LoyaltyBalances();

        @Deprecated
        public static final Parser<LoyaltyBalances> PARSER = new AbstractParser<LoyaltyBalances>() { // from class: com.garmin.proto.generated.GDIDezlProto.LoyaltyBalances.1
            @Override // com.google.protobuf.Parser
            public LoyaltyBalances parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LoyaltyBalances.newBuilder();
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
        private int currentDrinkCreditBalance_;
        private int currentGallonsBalance_;
        private int currentPointsBalance_;
        private int currentShowerCreditBalance_;
        private int currentTirepassCreditBalance_;
        private byte memoizedIsInitialized;

        private LoyaltyBalances(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.currentDrinkCreditBalance_ = 0;
            this.currentGallonsBalance_ = 0;
            this.currentPointsBalance_ = 0;
            this.currentShowerCreditBalance_ = 0;
            this.currentTirepassCreditBalance_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LoyaltyBalances getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyBalances_descriptor;
        }

        public static Builder newBuilder(LoyaltyBalances loyaltyBalances) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(loyaltyBalances);
        }

        public static LoyaltyBalances parseDelimitedFrom(InputStream inputStream) {
            return (LoyaltyBalances) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LoyaltyBalances parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LoyaltyBalances> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LoyaltyBalances)) {
                return super.equals(obj);
            }
            LoyaltyBalances loyaltyBalances = (LoyaltyBalances) obj;
            if (hasCurrentDrinkCreditBalance() != loyaltyBalances.hasCurrentDrinkCreditBalance()) {
                return false;
            }
            if ((hasCurrentDrinkCreditBalance() && getCurrentDrinkCreditBalance() != loyaltyBalances.getCurrentDrinkCreditBalance()) || hasCurrentGallonsBalance() != loyaltyBalances.hasCurrentGallonsBalance()) {
                return false;
            }
            if ((hasCurrentGallonsBalance() && getCurrentGallonsBalance() != loyaltyBalances.getCurrentGallonsBalance()) || hasCurrentPointsBalance() != loyaltyBalances.hasCurrentPointsBalance()) {
                return false;
            }
            if ((hasCurrentPointsBalance() && getCurrentPointsBalance() != loyaltyBalances.getCurrentPointsBalance()) || hasCurrentShowerCreditBalance() != loyaltyBalances.hasCurrentShowerCreditBalance()) {
                return false;
            }
            if ((!hasCurrentShowerCreditBalance() || getCurrentShowerCreditBalance() == loyaltyBalances.getCurrentShowerCreditBalance()) && hasCurrentTirepassCreditBalance() == loyaltyBalances.hasCurrentTirepassCreditBalance()) {
                return (!hasCurrentTirepassCreditBalance() || getCurrentTirepassCreditBalance() == loyaltyBalances.getCurrentTirepassCreditBalance()) && getUnknownFields().equals(loyaltyBalances.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBalancesOrBuilder
        public int getCurrentDrinkCreditBalance() {
            return this.currentDrinkCreditBalance_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBalancesOrBuilder
        public int getCurrentGallonsBalance() {
            return this.currentGallonsBalance_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBalancesOrBuilder
        public int getCurrentPointsBalance() {
            return this.currentPointsBalance_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBalancesOrBuilder
        public int getCurrentShowerCreditBalance() {
            return this.currentShowerCreditBalance_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBalancesOrBuilder
        public int getCurrentTirepassCreditBalance() {
            return this.currentTirepassCreditBalance_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LoyaltyBalances> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.currentDrinkCreditBalance_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.currentGallonsBalance_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.currentPointsBalance_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.currentShowerCreditBalance_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.currentTirepassCreditBalance_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBalancesOrBuilder
        public boolean hasCurrentDrinkCreditBalance() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBalancesOrBuilder
        public boolean hasCurrentGallonsBalance() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBalancesOrBuilder
        public boolean hasCurrentPointsBalance() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBalancesOrBuilder
        public boolean hasCurrentShowerCreditBalance() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBalancesOrBuilder
        public boolean hasCurrentTirepassCreditBalance() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCurrentDrinkCreditBalance()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCurrentDrinkCreditBalance();
            }
            if (hasCurrentGallonsBalance()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getCurrentGallonsBalance();
            }
            if (hasCurrentPointsBalance()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getCurrentPointsBalance();
            }
            if (hasCurrentShowerCreditBalance()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getCurrentShowerCreditBalance();
            }
            if (hasCurrentTirepassCreditBalance()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getCurrentTirepassCreditBalance();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyBalances_fieldAccessorTable.ensureFieldAccessorsInitialized(LoyaltyBalances.class, Builder.class);
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
            return new LoyaltyBalances();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.currentDrinkCreditBalance_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.currentGallonsBalance_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.currentPointsBalance_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.currentShowerCreditBalance_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.currentTirepassCreditBalance_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LoyaltyBalancesOrBuilder {
            private int bitField0_;
            private int currentDrinkCreditBalance_;
            private int currentGallonsBalance_;
            private int currentPointsBalance_;
            private int currentShowerCreditBalance_;
            private int currentTirepassCreditBalance_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(LoyaltyBalances loyaltyBalances) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    loyaltyBalances.currentDrinkCreditBalance_ = this.currentDrinkCreditBalance_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    loyaltyBalances.currentGallonsBalance_ = this.currentGallonsBalance_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    loyaltyBalances.currentPointsBalance_ = this.currentPointsBalance_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    loyaltyBalances.currentShowerCreditBalance_ = this.currentShowerCreditBalance_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    loyaltyBalances.currentTirepassCreditBalance_ = this.currentTirepassCreditBalance_;
                    i14 |= 16;
                }
                loyaltyBalances.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyBalances_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LoyaltyBalances build() {
                LoyaltyBalances loyaltyBalancesBuildPartial = buildPartial();
                if (loyaltyBalancesBuildPartial.isInitialized()) {
                    return loyaltyBalancesBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) loyaltyBalancesBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LoyaltyBalances buildPartial() {
                LoyaltyBalances loyaltyBalances = new LoyaltyBalances(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(loyaltyBalances);
                }
                onBuilt();
                return loyaltyBalances;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.currentDrinkCreditBalance_ = 0;
                this.currentGallonsBalance_ = 0;
                this.currentPointsBalance_ = 0;
                this.currentShowerCreditBalance_ = 0;
                this.currentTirepassCreditBalance_ = 0;
                return this;
            }

            public Builder clearCurrentDrinkCreditBalance() {
                this.bitField0_ &= -2;
                this.currentDrinkCreditBalance_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCurrentGallonsBalance() {
                this.bitField0_ &= -3;
                this.currentGallonsBalance_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCurrentPointsBalance() {
                this.bitField0_ &= -5;
                this.currentPointsBalance_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCurrentShowerCreditBalance() {
                this.bitField0_ &= -9;
                this.currentShowerCreditBalance_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCurrentTirepassCreditBalance() {
                this.bitField0_ &= -17;
                this.currentTirepassCreditBalance_ = 0;
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

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBalancesOrBuilder
            public int getCurrentDrinkCreditBalance() {
                return this.currentDrinkCreditBalance_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBalancesOrBuilder
            public int getCurrentGallonsBalance() {
                return this.currentGallonsBalance_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBalancesOrBuilder
            public int getCurrentPointsBalance() {
                return this.currentPointsBalance_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBalancesOrBuilder
            public int getCurrentShowerCreditBalance() {
                return this.currentShowerCreditBalance_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBalancesOrBuilder
            public int getCurrentTirepassCreditBalance() {
                return this.currentTirepassCreditBalance_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyBalances_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBalancesOrBuilder
            public boolean hasCurrentDrinkCreditBalance() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBalancesOrBuilder
            public boolean hasCurrentGallonsBalance() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBalancesOrBuilder
            public boolean hasCurrentPointsBalance() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBalancesOrBuilder
            public boolean hasCurrentShowerCreditBalance() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBalancesOrBuilder
            public boolean hasCurrentTirepassCreditBalance() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyBalances_fieldAccessorTable.ensureFieldAccessorsInitialized(LoyaltyBalances.class, Builder.class);
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
                                    this.currentDrinkCreditBalance_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.currentGallonsBalance_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.currentPointsBalance_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.currentShowerCreditBalance_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.currentTirepassCreditBalance_ = codedInputStream.readUInt32();
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

            public Builder setCurrentDrinkCreditBalance(int i14) {
                this.currentDrinkCreditBalance_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCurrentGallonsBalance(int i14) {
                this.currentGallonsBalance_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCurrentPointsBalance(int i14) {
                this.currentPointsBalance_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setCurrentShowerCreditBalance(int i14) {
                this.currentShowerCreditBalance_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setCurrentTirepassCreditBalance(int i14) {
                this.currentTirepassCreditBalance_ = i14;
                this.bitField0_ |= 16;
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
            public LoyaltyBalances getDefaultInstanceForType() {
                return LoyaltyBalances.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LoyaltyBalances) {
                    return mergeFrom((LoyaltyBalances) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LoyaltyBalances loyaltyBalances) {
                if (loyaltyBalances == LoyaltyBalances.getDefaultInstance()) {
                    return this;
                }
                if (loyaltyBalances.hasCurrentDrinkCreditBalance()) {
                    setCurrentDrinkCreditBalance(loyaltyBalances.getCurrentDrinkCreditBalance());
                }
                if (loyaltyBalances.hasCurrentGallonsBalance()) {
                    setCurrentGallonsBalance(loyaltyBalances.getCurrentGallonsBalance());
                }
                if (loyaltyBalances.hasCurrentPointsBalance()) {
                    setCurrentPointsBalance(loyaltyBalances.getCurrentPointsBalance());
                }
                if (loyaltyBalances.hasCurrentShowerCreditBalance()) {
                    setCurrentShowerCreditBalance(loyaltyBalances.getCurrentShowerCreditBalance());
                }
                if (loyaltyBalances.hasCurrentTirepassCreditBalance()) {
                    setCurrentTirepassCreditBalance(loyaltyBalances.getCurrentTirepassCreditBalance());
                }
                mergeUnknownFields(loyaltyBalances.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LoyaltyBalances getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LoyaltyBalances parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LoyaltyBalances) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LoyaltyBalances parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LoyaltyBalances parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LoyaltyBalances parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LoyaltyBalances parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LoyaltyBalances parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LoyaltyBalances parseFrom(InputStream inputStream) {
            return (LoyaltyBalances) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LoyaltyBalances parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LoyaltyBalances) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ LoyaltyBalances(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LoyaltyBalances parseFrom(CodedInputStream codedInputStream) {
            return (LoyaltyBalances) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private LoyaltyBalances() {
            this.currentDrinkCreditBalance_ = 0;
            this.currentGallonsBalance_ = 0;
            this.currentPointsBalance_ = 0;
            this.currentShowerCreditBalance_ = 0;
            this.currentTirepassCreditBalance_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LoyaltyBalances parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LoyaltyBalances) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LoyaltyGoalInfo extends GeneratedMessageV3 implements LoyaltyGoalInfoOrBuilder {
        public static final int ACHIEVE_GOAL_FIELD_NUMBER = 1;
        public static final int ACHIEVE_GOAL_PROGRESS_FIELD_NUMBER = 2;
        public static final int ACHIEVE_GOAL_REMAINING_FIELD_NUMBER = 3;
        public static final int FINAL_GOAL_ACHIEVED_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int achieveGoalProgress_;
        private int achieveGoalRemaining_;
        private int achieveGoal_;
        private int bitField0_;
        private boolean finalGoalAchieved_;
        private byte memoizedIsInitialized;
        private static final LoyaltyGoalInfo DEFAULT_INSTANCE = new LoyaltyGoalInfo();

        @Deprecated
        public static final Parser<LoyaltyGoalInfo> PARSER = new AbstractParser<LoyaltyGoalInfo>() { // from class: com.garmin.proto.generated.GDIDezlProto.LoyaltyGoalInfo.1
            @Override // com.google.protobuf.Parser
            public LoyaltyGoalInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LoyaltyGoalInfo.newBuilder();
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

        private LoyaltyGoalInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.achieveGoal_ = 0;
            this.achieveGoalProgress_ = 0;
            this.achieveGoalRemaining_ = 0;
            this.finalGoalAchieved_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LoyaltyGoalInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyGoalInfo_descriptor;
        }

        public static Builder newBuilder(LoyaltyGoalInfo loyaltyGoalInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(loyaltyGoalInfo);
        }

        public static LoyaltyGoalInfo parseDelimitedFrom(InputStream inputStream) {
            return (LoyaltyGoalInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LoyaltyGoalInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LoyaltyGoalInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LoyaltyGoalInfo)) {
                return super.equals(obj);
            }
            LoyaltyGoalInfo loyaltyGoalInfo = (LoyaltyGoalInfo) obj;
            if (hasAchieveGoal() != loyaltyGoalInfo.hasAchieveGoal()) {
                return false;
            }
            if ((hasAchieveGoal() && getAchieveGoal() != loyaltyGoalInfo.getAchieveGoal()) || hasAchieveGoalProgress() != loyaltyGoalInfo.hasAchieveGoalProgress()) {
                return false;
            }
            if ((hasAchieveGoalProgress() && getAchieveGoalProgress() != loyaltyGoalInfo.getAchieveGoalProgress()) || hasAchieveGoalRemaining() != loyaltyGoalInfo.hasAchieveGoalRemaining()) {
                return false;
            }
            if ((!hasAchieveGoalRemaining() || getAchieveGoalRemaining() == loyaltyGoalInfo.getAchieveGoalRemaining()) && hasFinalGoalAchieved() == loyaltyGoalInfo.hasFinalGoalAchieved()) {
                return (!hasFinalGoalAchieved() || getFinalGoalAchieved() == loyaltyGoalInfo.getFinalGoalAchieved()) && getUnknownFields().equals(loyaltyGoalInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyGoalInfoOrBuilder
        public int getAchieveGoal() {
            return this.achieveGoal_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyGoalInfoOrBuilder
        public int getAchieveGoalProgress() {
            return this.achieveGoalProgress_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyGoalInfoOrBuilder
        public int getAchieveGoalRemaining() {
            return this.achieveGoalRemaining_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyGoalInfoOrBuilder
        public boolean getFinalGoalAchieved() {
            return this.finalGoalAchieved_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LoyaltyGoalInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.achieveGoal_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.achieveGoalProgress_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeSInt32Size(3, this.achieveGoalRemaining_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(4, this.finalGoalAchieved_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyGoalInfoOrBuilder
        public boolean hasAchieveGoal() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyGoalInfoOrBuilder
        public boolean hasAchieveGoalProgress() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyGoalInfoOrBuilder
        public boolean hasAchieveGoalRemaining() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyGoalInfoOrBuilder
        public boolean hasFinalGoalAchieved() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAchieveGoal()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getAchieveGoal();
            }
            if (hasAchieveGoalProgress()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getAchieveGoalProgress();
            }
            if (hasAchieveGoalRemaining()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getAchieveGoalRemaining();
            }
            if (hasFinalGoalAchieved()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getFinalGoalAchieved());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyGoalInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(LoyaltyGoalInfo.class, Builder.class);
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
            return new LoyaltyGoalInfo();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.achieveGoal_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.achieveGoalProgress_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeSInt32(3, this.achieveGoalRemaining_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.finalGoalAchieved_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LoyaltyGoalInfoOrBuilder {
            private int achieveGoalProgress_;
            private int achieveGoalRemaining_;
            private int achieveGoal_;
            private int bitField0_;
            private boolean finalGoalAchieved_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(LoyaltyGoalInfo loyaltyGoalInfo) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    loyaltyGoalInfo.achieveGoal_ = this.achieveGoal_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    loyaltyGoalInfo.achieveGoalProgress_ = this.achieveGoalProgress_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    loyaltyGoalInfo.achieveGoalRemaining_ = this.achieveGoalRemaining_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    loyaltyGoalInfo.finalGoalAchieved_ = this.finalGoalAchieved_;
                    i14 |= 8;
                }
                loyaltyGoalInfo.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyGoalInfo_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LoyaltyGoalInfo build() {
                LoyaltyGoalInfo loyaltyGoalInfoBuildPartial = buildPartial();
                if (loyaltyGoalInfoBuildPartial.isInitialized()) {
                    return loyaltyGoalInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) loyaltyGoalInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LoyaltyGoalInfo buildPartial() {
                LoyaltyGoalInfo loyaltyGoalInfo = new LoyaltyGoalInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(loyaltyGoalInfo);
                }
                onBuilt();
                return loyaltyGoalInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.achieveGoal_ = 0;
                this.achieveGoalProgress_ = 0;
                this.achieveGoalRemaining_ = 0;
                this.finalGoalAchieved_ = false;
                return this;
            }

            public Builder clearAchieveGoal() {
                this.bitField0_ &= -2;
                this.achieveGoal_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAchieveGoalProgress() {
                this.bitField0_ &= -3;
                this.achieveGoalProgress_ = 0;
                onChanged();
                return this;
            }

            public Builder clearAchieveGoalRemaining() {
                this.bitField0_ &= -5;
                this.achieveGoalRemaining_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFinalGoalAchieved() {
                this.bitField0_ &= -9;
                this.finalGoalAchieved_ = false;
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

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyGoalInfoOrBuilder
            public int getAchieveGoal() {
                return this.achieveGoal_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyGoalInfoOrBuilder
            public int getAchieveGoalProgress() {
                return this.achieveGoalProgress_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyGoalInfoOrBuilder
            public int getAchieveGoalRemaining() {
                return this.achieveGoalRemaining_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyGoalInfo_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyGoalInfoOrBuilder
            public boolean getFinalGoalAchieved() {
                return this.finalGoalAchieved_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyGoalInfoOrBuilder
            public boolean hasAchieveGoal() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyGoalInfoOrBuilder
            public boolean hasAchieveGoalProgress() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyGoalInfoOrBuilder
            public boolean hasAchieveGoalRemaining() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyGoalInfoOrBuilder
            public boolean hasFinalGoalAchieved() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyGoalInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(LoyaltyGoalInfo.class, Builder.class);
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
                                    this.achieveGoal_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.achieveGoalProgress_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.achieveGoalRemaining_ = codedInputStream.readSInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.finalGoalAchieved_ = codedInputStream.readBool();
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

            public Builder setAchieveGoal(int i14) {
                this.achieveGoal_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAchieveGoalProgress(int i14) {
                this.achieveGoalProgress_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setAchieveGoalRemaining(int i14) {
                this.achieveGoalRemaining_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setFinalGoalAchieved(boolean z14) {
                this.finalGoalAchieved_ = z14;
                this.bitField0_ |= 8;
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
            public LoyaltyGoalInfo getDefaultInstanceForType() {
                return LoyaltyGoalInfo.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LoyaltyGoalInfo) {
                    return mergeFrom((LoyaltyGoalInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LoyaltyGoalInfo loyaltyGoalInfo) {
                if (loyaltyGoalInfo == LoyaltyGoalInfo.getDefaultInstance()) {
                    return this;
                }
                if (loyaltyGoalInfo.hasAchieveGoal()) {
                    setAchieveGoal(loyaltyGoalInfo.getAchieveGoal());
                }
                if (loyaltyGoalInfo.hasAchieveGoalProgress()) {
                    setAchieveGoalProgress(loyaltyGoalInfo.getAchieveGoalProgress());
                }
                if (loyaltyGoalInfo.hasAchieveGoalRemaining()) {
                    setAchieveGoalRemaining(loyaltyGoalInfo.getAchieveGoalRemaining());
                }
                if (loyaltyGoalInfo.hasFinalGoalAchieved()) {
                    setFinalGoalAchieved(loyaltyGoalInfo.getFinalGoalAchieved());
                }
                mergeUnknownFields(loyaltyGoalInfo.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LoyaltyGoalInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LoyaltyGoalInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LoyaltyGoalInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LoyaltyGoalInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LoyaltyGoalInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LoyaltyGoalInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LoyaltyGoalInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LoyaltyGoalInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LoyaltyGoalInfo parseFrom(InputStream inputStream) {
            return (LoyaltyGoalInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ LoyaltyGoalInfo(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LoyaltyGoalInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LoyaltyGoalInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private LoyaltyGoalInfo() {
            this.achieveGoal_ = 0;
            this.achieveGoalProgress_ = 0;
            this.achieveGoalRemaining_ = 0;
            this.finalGoalAchieved_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LoyaltyGoalInfo parseFrom(CodedInputStream codedInputStream) {
            return (LoyaltyGoalInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LoyaltyGoalInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LoyaltyGoalInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PndWellnessData extends GeneratedMessageV3 implements PndWellnessDataOrBuilder {
        public static final int DISTANCE_TO_NEXT_REST_AREA_FIELD_NUMBER = 3;
        public static final int DRIVE_TIMER_NEAR_MAX_FIELD_NUMBER = 5;
        public static final int HOURS_DRIVEN_WITHOUT_STOP_FIELD_NUMBER = 4;
        public static final int MILES_DRIVEN_SINCE_LAST_STOP_FIELD_NUMBER = 2;
        public static final int MILES_DRIVEN_TODAY_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int distanceToNextRestArea_;
        private boolean driveTimerNearMax_;
        private int hoursDrivenWithoutStop_;
        private byte memoizedIsInitialized;
        private int milesDrivenSinceLastStop_;
        private int milesDrivenToday_;
        private static final PndWellnessData DEFAULT_INSTANCE = new PndWellnessData();

        @Deprecated
        public static final Parser<PndWellnessData> PARSER = new AbstractParser<PndWellnessData>() { // from class: com.garmin.proto.generated.GDIDezlProto.PndWellnessData.1
            @Override // com.google.protobuf.Parser
            public PndWellnessData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PndWellnessData.newBuilder();
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

        private PndWellnessData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.milesDrivenToday_ = 0;
            this.milesDrivenSinceLastStop_ = 0;
            this.distanceToNextRestArea_ = 0;
            this.hoursDrivenWithoutStop_ = 0;
            this.driveTimerNearMax_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PndWellnessData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_PndWellnessData_descriptor;
        }

        public static Builder newBuilder(PndWellnessData pndWellnessData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pndWellnessData);
        }

        public static PndWellnessData parseDelimitedFrom(InputStream inputStream) {
            return (PndWellnessData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PndWellnessData parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PndWellnessData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PndWellnessData)) {
                return super.equals(obj);
            }
            PndWellnessData pndWellnessData = (PndWellnessData) obj;
            if (hasMilesDrivenToday() != pndWellnessData.hasMilesDrivenToday()) {
                return false;
            }
            if ((hasMilesDrivenToday() && getMilesDrivenToday() != pndWellnessData.getMilesDrivenToday()) || hasMilesDrivenSinceLastStop() != pndWellnessData.hasMilesDrivenSinceLastStop()) {
                return false;
            }
            if ((hasMilesDrivenSinceLastStop() && getMilesDrivenSinceLastStop() != pndWellnessData.getMilesDrivenSinceLastStop()) || hasDistanceToNextRestArea() != pndWellnessData.hasDistanceToNextRestArea()) {
                return false;
            }
            if ((hasDistanceToNextRestArea() && getDistanceToNextRestArea() != pndWellnessData.getDistanceToNextRestArea()) || hasHoursDrivenWithoutStop() != pndWellnessData.hasHoursDrivenWithoutStop()) {
                return false;
            }
            if ((!hasHoursDrivenWithoutStop() || getHoursDrivenWithoutStop() == pndWellnessData.getHoursDrivenWithoutStop()) && hasDriveTimerNearMax() == pndWellnessData.hasDriveTimerNearMax()) {
                return (!hasDriveTimerNearMax() || getDriveTimerNearMax() == pndWellnessData.getDriveTimerNearMax()) && getUnknownFields().equals(pndWellnessData.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.PndWellnessDataOrBuilder
        public int getDistanceToNextRestArea() {
            return this.distanceToNextRestArea_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.PndWellnessDataOrBuilder
        public boolean getDriveTimerNearMax() {
            return this.driveTimerNearMax_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.PndWellnessDataOrBuilder
        public int getHoursDrivenWithoutStop() {
            return this.hoursDrivenWithoutStop_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.PndWellnessDataOrBuilder
        public int getMilesDrivenSinceLastStop() {
            return this.milesDrivenSinceLastStop_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.PndWellnessDataOrBuilder
        public int getMilesDrivenToday() {
            return this.milesDrivenToday_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PndWellnessData> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.milesDrivenToday_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.milesDrivenSinceLastStop_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.distanceToNextRestArea_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.hoursDrivenWithoutStop_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(5, this.driveTimerNearMax_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.PndWellnessDataOrBuilder
        public boolean hasDistanceToNextRestArea() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.PndWellnessDataOrBuilder
        public boolean hasDriveTimerNearMax() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.PndWellnessDataOrBuilder
        public boolean hasHoursDrivenWithoutStop() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.PndWellnessDataOrBuilder
        public boolean hasMilesDrivenSinceLastStop() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.PndWellnessDataOrBuilder
        public boolean hasMilesDrivenToday() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMilesDrivenToday()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getMilesDrivenToday();
            }
            if (hasMilesDrivenSinceLastStop()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getMilesDrivenSinceLastStop();
            }
            if (hasDistanceToNextRestArea()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getDistanceToNextRestArea();
            }
            if (hasHoursDrivenWithoutStop()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getHoursDrivenWithoutStop();
            }
            if (hasDriveTimerNearMax()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Internal.hashBoolean(getDriveTimerNearMax());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_PndWellnessData_fieldAccessorTable.ensureFieldAccessorsInitialized(PndWellnessData.class, Builder.class);
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
            return new PndWellnessData();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.milesDrivenToday_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.milesDrivenSinceLastStop_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.distanceToNextRestArea_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.hoursDrivenWithoutStop_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(5, this.driveTimerNearMax_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PndWellnessDataOrBuilder {
            private int bitField0_;
            private int distanceToNextRestArea_;
            private boolean driveTimerNearMax_;
            private int hoursDrivenWithoutStop_;
            private int milesDrivenSinceLastStop_;
            private int milesDrivenToday_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(PndWellnessData pndWellnessData) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    pndWellnessData.milesDrivenToday_ = this.milesDrivenToday_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    pndWellnessData.milesDrivenSinceLastStop_ = this.milesDrivenSinceLastStop_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    pndWellnessData.distanceToNextRestArea_ = this.distanceToNextRestArea_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    pndWellnessData.hoursDrivenWithoutStop_ = this.hoursDrivenWithoutStop_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    pndWellnessData.driveTimerNearMax_ = this.driveTimerNearMax_;
                    i14 |= 16;
                }
                pndWellnessData.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_PndWellnessData_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PndWellnessData build() {
                PndWellnessData pndWellnessDataBuildPartial = buildPartial();
                if (pndWellnessDataBuildPartial.isInitialized()) {
                    return pndWellnessDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pndWellnessDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PndWellnessData buildPartial() {
                PndWellnessData pndWellnessData = new PndWellnessData(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(pndWellnessData);
                }
                onBuilt();
                return pndWellnessData;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.milesDrivenToday_ = 0;
                this.milesDrivenSinceLastStop_ = 0;
                this.distanceToNextRestArea_ = 0;
                this.hoursDrivenWithoutStop_ = 0;
                this.driveTimerNearMax_ = false;
                return this;
            }

            public Builder clearDistanceToNextRestArea() {
                this.bitField0_ &= -5;
                this.distanceToNextRestArea_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDriveTimerNearMax() {
                this.bitField0_ &= -17;
                this.driveTimerNearMax_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHoursDrivenWithoutStop() {
                this.bitField0_ &= -9;
                this.hoursDrivenWithoutStop_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMilesDrivenSinceLastStop() {
                this.bitField0_ &= -3;
                this.milesDrivenSinceLastStop_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMilesDrivenToday() {
                this.bitField0_ &= -2;
                this.milesDrivenToday_ = 0;
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
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_PndWellnessData_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.PndWellnessDataOrBuilder
            public int getDistanceToNextRestArea() {
                return this.distanceToNextRestArea_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.PndWellnessDataOrBuilder
            public boolean getDriveTimerNearMax() {
                return this.driveTimerNearMax_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.PndWellnessDataOrBuilder
            public int getHoursDrivenWithoutStop() {
                return this.hoursDrivenWithoutStop_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.PndWellnessDataOrBuilder
            public int getMilesDrivenSinceLastStop() {
                return this.milesDrivenSinceLastStop_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.PndWellnessDataOrBuilder
            public int getMilesDrivenToday() {
                return this.milesDrivenToday_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.PndWellnessDataOrBuilder
            public boolean hasDistanceToNextRestArea() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.PndWellnessDataOrBuilder
            public boolean hasDriveTimerNearMax() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.PndWellnessDataOrBuilder
            public boolean hasHoursDrivenWithoutStop() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.PndWellnessDataOrBuilder
            public boolean hasMilesDrivenSinceLastStop() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.PndWellnessDataOrBuilder
            public boolean hasMilesDrivenToday() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_PndWellnessData_fieldAccessorTable.ensureFieldAccessorsInitialized(PndWellnessData.class, Builder.class);
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
                                    this.milesDrivenToday_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.milesDrivenSinceLastStop_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.distanceToNextRestArea_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.hoursDrivenWithoutStop_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.driveTimerNearMax_ = codedInputStream.readBool();
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

            public Builder setDistanceToNextRestArea(int i14) {
                this.distanceToNextRestArea_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setDriveTimerNearMax(boolean z14) {
                this.driveTimerNearMax_ = z14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setHoursDrivenWithoutStop(int i14) {
                this.hoursDrivenWithoutStop_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setMilesDrivenSinceLastStop(int i14) {
                this.milesDrivenSinceLastStop_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMilesDrivenToday(int i14) {
                this.milesDrivenToday_ = i14;
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
            public PndWellnessData getDefaultInstanceForType() {
                return PndWellnessData.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PndWellnessData) {
                    return mergeFrom((PndWellnessData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PndWellnessData pndWellnessData) {
                if (pndWellnessData == PndWellnessData.getDefaultInstance()) {
                    return this;
                }
                if (pndWellnessData.hasMilesDrivenToday()) {
                    setMilesDrivenToday(pndWellnessData.getMilesDrivenToday());
                }
                if (pndWellnessData.hasMilesDrivenSinceLastStop()) {
                    setMilesDrivenSinceLastStop(pndWellnessData.getMilesDrivenSinceLastStop());
                }
                if (pndWellnessData.hasDistanceToNextRestArea()) {
                    setDistanceToNextRestArea(pndWellnessData.getDistanceToNextRestArea());
                }
                if (pndWellnessData.hasHoursDrivenWithoutStop()) {
                    setHoursDrivenWithoutStop(pndWellnessData.getHoursDrivenWithoutStop());
                }
                if (pndWellnessData.hasDriveTimerNearMax()) {
                    setDriveTimerNearMax(pndWellnessData.getDriveTimerNearMax());
                }
                mergeUnknownFields(pndWellnessData.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PndWellnessData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static PndWellnessData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PndWellnessData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PndWellnessData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PndWellnessData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PndWellnessData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PndWellnessData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PndWellnessData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PndWellnessData parseFrom(InputStream inputStream) {
            return (PndWellnessData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PndWellnessData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PndWellnessData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ PndWellnessData(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static PndWellnessData parseFrom(CodedInputStream codedInputStream) {
            return (PndWellnessData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private PndWellnessData() {
            this.milesDrivenToday_ = 0;
            this.milesDrivenSinceLastStop_ = 0;
            this.distanceToNextRestArea_ = 0;
            this.hoursDrivenWithoutStop_ = 0;
            this.driveTimerNearMax_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PndWellnessData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PndWellnessData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StageCompletedNotification extends GeneratedMessageV3 implements StageCompletedNotificationOrBuilder {
        public static final int COMPLETED_STAGE_INDEX_FIELD_NUMBER = 1;
        private static final StageCompletedNotification DEFAULT_INSTANCE = new StageCompletedNotification();

        @Deprecated
        public static final Parser<StageCompletedNotification> PARSER = new AbstractParser<StageCompletedNotification>() { // from class: com.garmin.proto.generated.GDIDezlProto.StageCompletedNotification.1
            @Override // com.google.protobuf.Parser
            public StageCompletedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StageCompletedNotification.newBuilder();
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
        private int completedStageIndex_;
        private byte memoizedIsInitialized;

        private StageCompletedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.completedStageIndex_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StageCompletedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_StageCompletedNotification_descriptor;
        }

        public static Builder newBuilder(StageCompletedNotification stageCompletedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stageCompletedNotification);
        }

        public static StageCompletedNotification parseDelimitedFrom(InputStream inputStream) {
            return (StageCompletedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StageCompletedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StageCompletedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StageCompletedNotification)) {
                return super.equals(obj);
            }
            StageCompletedNotification stageCompletedNotification = (StageCompletedNotification) obj;
            if (hasCompletedStageIndex() != stageCompletedNotification.hasCompletedStageIndex()) {
                return false;
            }
            return (!hasCompletedStageIndex() || getCompletedStageIndex() == stageCompletedNotification.getCompletedStageIndex()) && getUnknownFields().equals(stageCompletedNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.StageCompletedNotificationOrBuilder
        public int getCompletedStageIndex() {
            return this.completedStageIndex_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StageCompletedNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.completedStageIndex_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.StageCompletedNotificationOrBuilder
        public boolean hasCompletedStageIndex() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCompletedStageIndex()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCompletedStageIndex();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_StageCompletedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(StageCompletedNotification.class, Builder.class);
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
            return new StageCompletedNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.completedStageIndex_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StageCompletedNotificationOrBuilder {
            private int bitField0_;
            private int completedStageIndex_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(StageCompletedNotification stageCompletedNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    stageCompletedNotification.completedStageIndex_ = this.completedStageIndex_;
                } else {
                    i14 = 0;
                }
                stageCompletedNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_StageCompletedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StageCompletedNotification build() {
                StageCompletedNotification stageCompletedNotificationBuildPartial = buildPartial();
                if (stageCompletedNotificationBuildPartial.isInitialized()) {
                    return stageCompletedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stageCompletedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StageCompletedNotification buildPartial() {
                StageCompletedNotification stageCompletedNotification = new StageCompletedNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(stageCompletedNotification);
                }
                onBuilt();
                return stageCompletedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.completedStageIndex_ = 0;
                return this;
            }

            public Builder clearCompletedStageIndex() {
                this.bitField0_ &= -2;
                this.completedStageIndex_ = 0;
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

            @Override // com.garmin.proto.generated.GDIDezlProto.StageCompletedNotificationOrBuilder
            public int getCompletedStageIndex() {
                return this.completedStageIndex_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_StageCompletedNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.StageCompletedNotificationOrBuilder
            public boolean hasCompletedStageIndex() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_StageCompletedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(StageCompletedNotification.class, Builder.class);
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
                                    this.completedStageIndex_ = codedInputStream.readUInt32();
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

            public Builder setCompletedStageIndex(int i14) {
                this.completedStageIndex_ = i14;
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
            public StageCompletedNotification getDefaultInstanceForType() {
                return StageCompletedNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StageCompletedNotification) {
                    return mergeFrom((StageCompletedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StageCompletedNotification stageCompletedNotification) {
                if (stageCompletedNotification == StageCompletedNotification.getDefaultInstance()) {
                    return this;
                }
                if (stageCompletedNotification.hasCompletedStageIndex()) {
                    setCompletedStageIndex(stageCompletedNotification.getCompletedStageIndex());
                }
                mergeUnknownFields(stageCompletedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StageCompletedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StageCompletedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StageCompletedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StageCompletedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ StageCompletedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StageCompletedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private StageCompletedNotification() {
            this.completedStageIndex_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StageCompletedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StageCompletedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StageCompletedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StageCompletedNotification parseFrom(InputStream inputStream) {
            return (StageCompletedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StageCompletedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StageCompletedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StageCompletedNotification parseFrom(CodedInputStream codedInputStream) {
            return (StageCompletedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StageCompletedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StageCompletedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StagePausedNotification extends GeneratedMessageV3 implements StagePausedNotificationOrBuilder {
        private static final StagePausedNotification DEFAULT_INSTANCE = new StagePausedNotification();

        @Deprecated
        public static final Parser<StagePausedNotification> PARSER = new AbstractParser<StagePausedNotification>() { // from class: com.garmin.proto.generated.GDIDezlProto.StagePausedNotification.1
            @Override // com.google.protobuf.Parser
            public StagePausedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StagePausedNotification.newBuilder();
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

        private StagePausedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StagePausedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_StagePausedNotification_descriptor;
        }

        public static Builder newBuilder(StagePausedNotification stagePausedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stagePausedNotification);
        }

        public static StagePausedNotification parseDelimitedFrom(InputStream inputStream) {
            return (StagePausedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StagePausedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StagePausedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof StagePausedNotification) {
                return getUnknownFields().equals(((StagePausedNotification) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StagePausedNotification> getParserForType() {
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
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_StagePausedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(StagePausedNotification.class, Builder.class);
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
            return new StagePausedNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StagePausedNotificationOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_StagePausedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StagePausedNotification build() {
                StagePausedNotification stagePausedNotificationBuildPartial = buildPartial();
                if (stagePausedNotificationBuildPartial.isInitialized()) {
                    return stagePausedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stagePausedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StagePausedNotification buildPartial() {
                StagePausedNotification stagePausedNotification = new StagePausedNotification(this);
                onBuilt();
                return stagePausedNotification;
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
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_StagePausedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_StagePausedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(StagePausedNotification.class, Builder.class);
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
            public StagePausedNotification getDefaultInstanceForType() {
                return StagePausedNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StagePausedNotification) {
                    return mergeFrom((StagePausedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StagePausedNotification stagePausedNotification) {
                if (stagePausedNotification == StagePausedNotification.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(stagePausedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StagePausedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ StagePausedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private StagePausedNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StagePausedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StagePausedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StagePausedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StagePausedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StagePausedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StagePausedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StagePausedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StagePausedNotification parseFrom(InputStream inputStream) {
            return (StagePausedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StagePausedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StagePausedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StagePausedNotification parseFrom(CodedInputStream codedInputStream) {
            return (StagePausedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StagePausedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StagePausedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StageSelectedNotification extends GeneratedMessageV3 implements StageSelectedNotificationOrBuilder {
        private static final StageSelectedNotification DEFAULT_INSTANCE = new StageSelectedNotification();

        @Deprecated
        public static final Parser<StageSelectedNotification> PARSER = new AbstractParser<StageSelectedNotification>() { // from class: com.garmin.proto.generated.GDIDezlProto.StageSelectedNotification.1
            @Override // com.google.protobuf.Parser
            public StageSelectedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StageSelectedNotification.newBuilder();
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
        public static final int SELECTED_STAGE_INDEX_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int selectedStageIndex_;

        private StageSelectedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.selectedStageIndex_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StageSelectedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_StageSelectedNotification_descriptor;
        }

        public static Builder newBuilder(StageSelectedNotification stageSelectedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stageSelectedNotification);
        }

        public static StageSelectedNotification parseDelimitedFrom(InputStream inputStream) {
            return (StageSelectedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StageSelectedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StageSelectedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StageSelectedNotification)) {
                return super.equals(obj);
            }
            StageSelectedNotification stageSelectedNotification = (StageSelectedNotification) obj;
            if (hasSelectedStageIndex() != stageSelectedNotification.hasSelectedStageIndex()) {
                return false;
            }
            return (!hasSelectedStageIndex() || getSelectedStageIndex() == stageSelectedNotification.getSelectedStageIndex()) && getUnknownFields().equals(stageSelectedNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StageSelectedNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.StageSelectedNotificationOrBuilder
        public int getSelectedStageIndex() {
            return this.selectedStageIndex_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.selectedStageIndex_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.StageSelectedNotificationOrBuilder
        public boolean hasSelectedStageIndex() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSelectedStageIndex()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSelectedStageIndex();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_StageSelectedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(StageSelectedNotification.class, Builder.class);
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
            return new StageSelectedNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.selectedStageIndex_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StageSelectedNotificationOrBuilder {
            private int bitField0_;
            private int selectedStageIndex_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(StageSelectedNotification stageSelectedNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    stageSelectedNotification.selectedStageIndex_ = this.selectedStageIndex_;
                } else {
                    i14 = 0;
                }
                stageSelectedNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_StageSelectedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StageSelectedNotification build() {
                StageSelectedNotification stageSelectedNotificationBuildPartial = buildPartial();
                if (stageSelectedNotificationBuildPartial.isInitialized()) {
                    return stageSelectedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stageSelectedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StageSelectedNotification buildPartial() {
                StageSelectedNotification stageSelectedNotification = new StageSelectedNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(stageSelectedNotification);
                }
                onBuilt();
                return stageSelectedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.selectedStageIndex_ = 0;
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

            public Builder clearSelectedStageIndex() {
                this.bitField0_ &= -2;
                this.selectedStageIndex_ = 0;
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
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_StageSelectedNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.StageSelectedNotificationOrBuilder
            public int getSelectedStageIndex() {
                return this.selectedStageIndex_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.StageSelectedNotificationOrBuilder
            public boolean hasSelectedStageIndex() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_StageSelectedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(StageSelectedNotification.class, Builder.class);
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
                                    this.selectedStageIndex_ = codedInputStream.readUInt32();
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

            public Builder setSelectedStageIndex(int i14) {
                this.selectedStageIndex_ = i14;
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
            public StageSelectedNotification getDefaultInstanceForType() {
                return StageSelectedNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StageSelectedNotification) {
                    return mergeFrom((StageSelectedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StageSelectedNotification stageSelectedNotification) {
                if (stageSelectedNotification == StageSelectedNotification.getDefaultInstance()) {
                    return this;
                }
                if (stageSelectedNotification.hasSelectedStageIndex()) {
                    setSelectedStageIndex(stageSelectedNotification.getSelectedStageIndex());
                }
                mergeUnknownFields(stageSelectedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StageSelectedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StageSelectedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StageSelectedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StageSelectedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ StageSelectedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StageSelectedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private StageSelectedNotification() {
            this.selectedStageIndex_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StageSelectedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StageSelectedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StageSelectedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StageSelectedNotification parseFrom(InputStream inputStream) {
            return (StageSelectedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StageSelectedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StageSelectedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StageSelectedNotification parseFrom(CodedInputStream codedInputStream) {
            return (StageSelectedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StageSelectedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StageSelectedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StageStartedNotification extends GeneratedMessageV3 implements StageStartedNotificationOrBuilder {
        public static final int ELAPSED_TIME_FIELD_NUMBER = 2;
        public static final int SELECTED_STAGE_INDEX_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int elapsedTime_;
        private byte memoizedIsInitialized;
        private int selectedStageIndex_;
        private static final StageStartedNotification DEFAULT_INSTANCE = new StageStartedNotification();

        @Deprecated
        public static final Parser<StageStartedNotification> PARSER = new AbstractParser<StageStartedNotification>() { // from class: com.garmin.proto.generated.GDIDezlProto.StageStartedNotification.1
            @Override // com.google.protobuf.Parser
            public StageStartedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StageStartedNotification.newBuilder();
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

        private StageStartedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.selectedStageIndex_ = 0;
            this.elapsedTime_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StageStartedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_StageStartedNotification_descriptor;
        }

        public static Builder newBuilder(StageStartedNotification stageStartedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(stageStartedNotification);
        }

        public static StageStartedNotification parseDelimitedFrom(InputStream inputStream) {
            return (StageStartedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StageStartedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StageStartedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StageStartedNotification)) {
                return super.equals(obj);
            }
            StageStartedNotification stageStartedNotification = (StageStartedNotification) obj;
            if (hasSelectedStageIndex() != stageStartedNotification.hasSelectedStageIndex()) {
                return false;
            }
            if ((!hasSelectedStageIndex() || getSelectedStageIndex() == stageStartedNotification.getSelectedStageIndex()) && hasElapsedTime() == stageStartedNotification.hasElapsedTime()) {
                return (!hasElapsedTime() || getElapsedTime() == stageStartedNotification.getElapsedTime()) && getUnknownFields().equals(stageStartedNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.StageStartedNotificationOrBuilder
        public int getElapsedTime() {
            return this.elapsedTime_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StageStartedNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.StageStartedNotificationOrBuilder
        public int getSelectedStageIndex() {
            return this.selectedStageIndex_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.selectedStageIndex_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.elapsedTime_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.StageStartedNotificationOrBuilder
        public boolean hasElapsedTime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.StageStartedNotificationOrBuilder
        public boolean hasSelectedStageIndex() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSelectedStageIndex()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSelectedStageIndex();
            }
            if (hasElapsedTime()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getElapsedTime();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_StageStartedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(StageStartedNotification.class, Builder.class);
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
            return new StageStartedNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.selectedStageIndex_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.elapsedTime_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StageStartedNotificationOrBuilder {
            private int bitField0_;
            private int elapsedTime_;
            private int selectedStageIndex_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(StageStartedNotification stageStartedNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    stageStartedNotification.selectedStageIndex_ = this.selectedStageIndex_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    stageStartedNotification.elapsedTime_ = this.elapsedTime_;
                    i14 |= 2;
                }
                stageStartedNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_StageStartedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StageStartedNotification build() {
                StageStartedNotification stageStartedNotificationBuildPartial = buildPartial();
                if (stageStartedNotificationBuildPartial.isInitialized()) {
                    return stageStartedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) stageStartedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StageStartedNotification buildPartial() {
                StageStartedNotification stageStartedNotification = new StageStartedNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(stageStartedNotification);
                }
                onBuilt();
                return stageStartedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.selectedStageIndex_ = 0;
                this.elapsedTime_ = 0;
                return this;
            }

            public Builder clearElapsedTime() {
                this.bitField0_ &= -3;
                this.elapsedTime_ = 0;
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

            public Builder clearSelectedStageIndex() {
                this.bitField0_ &= -2;
                this.selectedStageIndex_ = 0;
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
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_StageStartedNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.StageStartedNotificationOrBuilder
            public int getElapsedTime() {
                return this.elapsedTime_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.StageStartedNotificationOrBuilder
            public int getSelectedStageIndex() {
                return this.selectedStageIndex_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.StageStartedNotificationOrBuilder
            public boolean hasElapsedTime() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.StageStartedNotificationOrBuilder
            public boolean hasSelectedStageIndex() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_StageStartedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(StageStartedNotification.class, Builder.class);
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
                                    this.selectedStageIndex_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.elapsedTime_ = codedInputStream.readUInt32();
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

            public Builder setElapsedTime(int i14) {
                this.elapsedTime_ = i14;
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

            public Builder setSelectedStageIndex(int i14) {
                this.selectedStageIndex_ = i14;
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
            public StageStartedNotification getDefaultInstanceForType() {
                return StageStartedNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StageStartedNotification) {
                    return mergeFrom((StageStartedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StageStartedNotification stageStartedNotification) {
                if (stageStartedNotification == StageStartedNotification.getDefaultInstance()) {
                    return this;
                }
                if (stageStartedNotification.hasSelectedStageIndex()) {
                    setSelectedStageIndex(stageStartedNotification.getSelectedStageIndex());
                }
                if (stageStartedNotification.hasElapsedTime()) {
                    setElapsedTime(stageStartedNotification.getElapsedTime());
                }
                mergeUnknownFields(stageStartedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StageStartedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StageStartedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StageStartedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StageStartedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StageStartedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StageStartedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ StageStartedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StageStartedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private StageStartedNotification() {
            this.selectedStageIndex_ = 0;
            this.elapsedTime_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StageStartedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StageStartedNotification parseFrom(InputStream inputStream) {
            return (StageStartedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StageStartedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StageStartedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StageStartedNotification parseFrom(CodedInputStream codedInputStream) {
            return (StageStartedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StageStartedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StageStartedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class WellnessSuggestionRequest extends GeneratedMessageV3 implements WellnessSuggestionRequestOrBuilder {
        private static final WellnessSuggestionRequest DEFAULT_INSTANCE = new WellnessSuggestionRequest();

        @Deprecated
        public static final Parser<WellnessSuggestionRequest> PARSER = new AbstractParser<WellnessSuggestionRequest>() { // from class: com.garmin.proto.generated.GDIDezlProto.WellnessSuggestionRequest.1
            @Override // com.google.protobuf.Parser
            public WellnessSuggestionRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = WellnessSuggestionRequest.newBuilder();
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

        private WellnessSuggestionRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WellnessSuggestionRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_WellnessSuggestionRequest_descriptor;
        }

        public static Builder newBuilder(WellnessSuggestionRequest wellnessSuggestionRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(wellnessSuggestionRequest);
        }

        public static WellnessSuggestionRequest parseDelimitedFrom(InputStream inputStream) {
            return (WellnessSuggestionRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WellnessSuggestionRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<WellnessSuggestionRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof WellnessSuggestionRequest) {
                return getUnknownFields().equals(((WellnessSuggestionRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WellnessSuggestionRequest> getParserForType() {
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
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_WellnessSuggestionRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(WellnessSuggestionRequest.class, Builder.class);
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
            return new WellnessSuggestionRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WellnessSuggestionRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_WellnessSuggestionRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WellnessSuggestionRequest build() {
                WellnessSuggestionRequest wellnessSuggestionRequestBuildPartial = buildPartial();
                if (wellnessSuggestionRequestBuildPartial.isInitialized()) {
                    return wellnessSuggestionRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) wellnessSuggestionRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WellnessSuggestionRequest buildPartial() {
                WellnessSuggestionRequest wellnessSuggestionRequest = new WellnessSuggestionRequest(this);
                onBuilt();
                return wellnessSuggestionRequest;
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
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_WellnessSuggestionRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_WellnessSuggestionRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(WellnessSuggestionRequest.class, Builder.class);
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
            public WellnessSuggestionRequest getDefaultInstanceForType() {
                return WellnessSuggestionRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WellnessSuggestionRequest) {
                    return mergeFrom((WellnessSuggestionRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WellnessSuggestionRequest wellnessSuggestionRequest) {
                if (wellnessSuggestionRequest == WellnessSuggestionRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(wellnessSuggestionRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WellnessSuggestionRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ WellnessSuggestionRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private WellnessSuggestionRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WellnessSuggestionRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WellnessSuggestionRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WellnessSuggestionRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WellnessSuggestionRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WellnessSuggestionRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WellnessSuggestionRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WellnessSuggestionRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WellnessSuggestionRequest parseFrom(InputStream inputStream) {
            return (WellnessSuggestionRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static WellnessSuggestionRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WellnessSuggestionRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WellnessSuggestionRequest parseFrom(CodedInputStream codedInputStream) {
            return (WellnessSuggestionRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static WellnessSuggestionRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WellnessSuggestionRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class WorkoutCanceledNotification extends GeneratedMessageV3 implements WorkoutCanceledNotificationOrBuilder {
        private static final WorkoutCanceledNotification DEFAULT_INSTANCE = new WorkoutCanceledNotification();

        @Deprecated
        public static final Parser<WorkoutCanceledNotification> PARSER = new AbstractParser<WorkoutCanceledNotification>() { // from class: com.garmin.proto.generated.GDIDezlProto.WorkoutCanceledNotification.1
            @Override // com.google.protobuf.Parser
            public WorkoutCanceledNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = WorkoutCanceledNotification.newBuilder();
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

        private WorkoutCanceledNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WorkoutCanceledNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_WorkoutCanceledNotification_descriptor;
        }

        public static Builder newBuilder(WorkoutCanceledNotification workoutCanceledNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(workoutCanceledNotification);
        }

        public static WorkoutCanceledNotification parseDelimitedFrom(InputStream inputStream) {
            return (WorkoutCanceledNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WorkoutCanceledNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<WorkoutCanceledNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof WorkoutCanceledNotification) {
                return getUnknownFields().equals(((WorkoutCanceledNotification) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WorkoutCanceledNotification> getParserForType() {
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
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_WorkoutCanceledNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(WorkoutCanceledNotification.class, Builder.class);
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
            return new WorkoutCanceledNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WorkoutCanceledNotificationOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_WorkoutCanceledNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WorkoutCanceledNotification build() {
                WorkoutCanceledNotification workoutCanceledNotificationBuildPartial = buildPartial();
                if (workoutCanceledNotificationBuildPartial.isInitialized()) {
                    return workoutCanceledNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) workoutCanceledNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WorkoutCanceledNotification buildPartial() {
                WorkoutCanceledNotification workoutCanceledNotification = new WorkoutCanceledNotification(this);
                onBuilt();
                return workoutCanceledNotification;
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
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_WorkoutCanceledNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_WorkoutCanceledNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(WorkoutCanceledNotification.class, Builder.class);
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
            public WorkoutCanceledNotification getDefaultInstanceForType() {
                return WorkoutCanceledNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WorkoutCanceledNotification) {
                    return mergeFrom((WorkoutCanceledNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WorkoutCanceledNotification workoutCanceledNotification) {
                if (workoutCanceledNotification == WorkoutCanceledNotification.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(workoutCanceledNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WorkoutCanceledNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ WorkoutCanceledNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private WorkoutCanceledNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WorkoutCanceledNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WorkoutCanceledNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WorkoutCanceledNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WorkoutCanceledNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WorkoutCanceledNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WorkoutCanceledNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WorkoutCanceledNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WorkoutCanceledNotification parseFrom(InputStream inputStream) {
            return (WorkoutCanceledNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static WorkoutCanceledNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WorkoutCanceledNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WorkoutCanceledNotification parseFrom(CodedInputStream codedInputStream) {
            return (WorkoutCanceledNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static WorkoutCanceledNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WorkoutCanceledNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class BreakPlannerStateChangedNotification extends GeneratedMessageV3 implements BreakPlannerStateChangedNotificationOrBuilder {
        public static final int BREAK_PLANNER_STATE_CHANGED_FIELD_NUMBER = 1003;
        public static final int DAILY_DRIVEN_TIMER_FIELD_NUMBER = 2;
        public static final int ELOG_DETECTED_FIELD_NUMBER = 6;
        public static final int TIMER_STATE_FIELD_NUMBER = 5;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        public static final int TIME_ON_BREAK_FIELD_NUMBER = 7;
        public static final int TIME_UNTIL_BREAK_TIMER_FIELD_NUMBER = 3;
        public static final int TOTAL_DRIVEN_TIMER_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int dailyDrivenTimer_;
        private boolean elogDetected_;
        private byte memoizedIsInitialized;
        private int timeOnBreak_;
        private int timeUntilBreakTimer_;
        private int timerState_;
        private long timestamp_;
        private int totalDrivenTimer_;
        private static final BreakPlannerStateChangedNotification DEFAULT_INSTANCE = new BreakPlannerStateChangedNotification();

        @Deprecated
        public static final Parser<BreakPlannerStateChangedNotification> PARSER = new AbstractParser<BreakPlannerStateChangedNotification>() { // from class: com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotification.1
            @Override // com.google.protobuf.Parser
            public BreakPlannerStateChangedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = BreakPlannerStateChangedNotification.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, BreakPlannerStateChangedNotification> breakPlannerStateChanged = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, BreakPlannerStateChangedNotification.class, getDefaultInstance());

        private BreakPlannerStateChangedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.timestamp_ = 0L;
            this.dailyDrivenTimer_ = 0;
            this.timeUntilBreakTimer_ = 0;
            this.totalDrivenTimer_ = 0;
            this.timerState_ = 0;
            this.elogDetected_ = false;
            this.timeOnBreak_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static BreakPlannerStateChangedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_BreakPlannerStateChangedNotification_descriptor;
        }

        public static Builder newBuilder(BreakPlannerStateChangedNotification breakPlannerStateChangedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(breakPlannerStateChangedNotification);
        }

        public static BreakPlannerStateChangedNotification parseDelimitedFrom(InputStream inputStream) {
            return (BreakPlannerStateChangedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BreakPlannerStateChangedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<BreakPlannerStateChangedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BreakPlannerStateChangedNotification)) {
                return super.equals(obj);
            }
            BreakPlannerStateChangedNotification breakPlannerStateChangedNotification = (BreakPlannerStateChangedNotification) obj;
            if (hasTimestamp() != breakPlannerStateChangedNotification.hasTimestamp()) {
                return false;
            }
            if ((hasTimestamp() && getTimestamp() != breakPlannerStateChangedNotification.getTimestamp()) || hasDailyDrivenTimer() != breakPlannerStateChangedNotification.hasDailyDrivenTimer()) {
                return false;
            }
            if ((hasDailyDrivenTimer() && getDailyDrivenTimer() != breakPlannerStateChangedNotification.getDailyDrivenTimer()) || hasTimeUntilBreakTimer() != breakPlannerStateChangedNotification.hasTimeUntilBreakTimer()) {
                return false;
            }
            if ((hasTimeUntilBreakTimer() && getTimeUntilBreakTimer() != breakPlannerStateChangedNotification.getTimeUntilBreakTimer()) || hasTotalDrivenTimer() != breakPlannerStateChangedNotification.hasTotalDrivenTimer()) {
                return false;
            }
            if ((hasTotalDrivenTimer() && getTotalDrivenTimer() != breakPlannerStateChangedNotification.getTotalDrivenTimer()) || hasTimerState() != breakPlannerStateChangedNotification.hasTimerState()) {
                return false;
            }
            if ((hasTimerState() && this.timerState_ != breakPlannerStateChangedNotification.timerState_) || hasElogDetected() != breakPlannerStateChangedNotification.hasElogDetected()) {
                return false;
            }
            if ((!hasElogDetected() || getElogDetected() == breakPlannerStateChangedNotification.getElogDetected()) && hasTimeOnBreak() == breakPlannerStateChangedNotification.hasTimeOnBreak()) {
                return (!hasTimeOnBreak() || getTimeOnBreak() == breakPlannerStateChangedNotification.getTimeOnBreak()) && getUnknownFields().equals(breakPlannerStateChangedNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
        public int getDailyDrivenTimer() {
            return this.dailyDrivenTimer_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
        public boolean getElogDetected() {
            return this.elogDetected_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<BreakPlannerStateChangedNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt64Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt64Size(1, this.timestamp_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt32Size(2, this.dailyDrivenTimer_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt32Size(3, this.timeUntilBreakTimer_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt32Size(4, this.totalDrivenTimer_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeEnumSize(5, this.timerState_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeBoolSize(6, this.elogDetected_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt32Size(7, this.timeOnBreak_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
        public int getTimeOnBreak() {
            return this.timeOnBreak_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
        public int getTimeUntilBreakTimer() {
            return this.timeUntilBreakTimer_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
        public TimerState getTimerState() {
            TimerState timerStateForNumber = TimerState.forNumber(this.timerState_);
            return timerStateForNumber == null ? TimerState.UNKNOWN : timerStateForNumber;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
        public long getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
        public int getTotalDrivenTimer() {
            return this.totalDrivenTimer_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
        public boolean hasDailyDrivenTimer() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
        public boolean hasElogDetected() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
        public boolean hasTimeOnBreak() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
        public boolean hasTimeUntilBreakTimer() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
        public boolean hasTimerState() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
        public boolean hasTimestamp() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
        public boolean hasTotalDrivenTimer() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTimestamp()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashLong(getTimestamp());
            }
            if (hasDailyDrivenTimer()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDailyDrivenTimer();
            }
            if (hasTimeUntilBreakTimer()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getTimeUntilBreakTimer();
            }
            if (hasTotalDrivenTimer()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getTotalDrivenTimer();
            }
            if (hasTimerState()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + this.timerState_;
            }
            if (hasElogDetected()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + Internal.hashBoolean(getElogDetected());
            }
            if (hasTimeOnBreak()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getTimeOnBreak();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_BreakPlannerStateChangedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(BreakPlannerStateChangedNotification.class, Builder.class);
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
            return new BreakPlannerStateChangedNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt64(1, this.timestamp_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.dailyDrivenTimer_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.timeUntilBreakTimer_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.totalDrivenTimer_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeEnum(5, this.timerState_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeBool(6, this.elogDetected_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(7, this.timeOnBreak_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BreakPlannerStateChangedNotificationOrBuilder {
            private int bitField0_;
            private int dailyDrivenTimer_;
            private boolean elogDetected_;
            private int timeOnBreak_;
            private int timeUntilBreakTimer_;
            private int timerState_;
            private long timestamp_;
            private int totalDrivenTimer_;

            private Builder() {
                this.timerState_ = 0;
            }

            private void buildPartial0(BreakPlannerStateChangedNotification breakPlannerStateChangedNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    breakPlannerStateChangedNotification.timestamp_ = this.timestamp_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    breakPlannerStateChangedNotification.dailyDrivenTimer_ = this.dailyDrivenTimer_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    breakPlannerStateChangedNotification.timeUntilBreakTimer_ = this.timeUntilBreakTimer_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    breakPlannerStateChangedNotification.totalDrivenTimer_ = this.totalDrivenTimer_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    breakPlannerStateChangedNotification.timerState_ = this.timerState_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    breakPlannerStateChangedNotification.elogDetected_ = this.elogDetected_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    breakPlannerStateChangedNotification.timeOnBreak_ = this.timeOnBreak_;
                    i14 |= 64;
                }
                breakPlannerStateChangedNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_BreakPlannerStateChangedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BreakPlannerStateChangedNotification build() {
                BreakPlannerStateChangedNotification breakPlannerStateChangedNotificationBuildPartial = buildPartial();
                if (breakPlannerStateChangedNotificationBuildPartial.isInitialized()) {
                    return breakPlannerStateChangedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) breakPlannerStateChangedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BreakPlannerStateChangedNotification buildPartial() {
                BreakPlannerStateChangedNotification breakPlannerStateChangedNotification = new BreakPlannerStateChangedNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(breakPlannerStateChangedNotification);
                }
                onBuilt();
                return breakPlannerStateChangedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.timestamp_ = 0L;
                this.dailyDrivenTimer_ = 0;
                this.timeUntilBreakTimer_ = 0;
                this.totalDrivenTimer_ = 0;
                this.timerState_ = 0;
                this.elogDetected_ = false;
                this.timeOnBreak_ = 0;
                return this;
            }

            public Builder clearDailyDrivenTimer() {
                this.bitField0_ &= -3;
                this.dailyDrivenTimer_ = 0;
                onChanged();
                return this;
            }

            public Builder clearElogDetected() {
                this.bitField0_ &= -33;
                this.elogDetected_ = false;
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

            public Builder clearTimeOnBreak() {
                this.bitField0_ &= -65;
                this.timeOnBreak_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTimeUntilBreakTimer() {
                this.bitField0_ &= -5;
                this.timeUntilBreakTimer_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTimerState() {
                this.bitField0_ &= -17;
                this.timerState_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTimestamp() {
                this.bitField0_ &= -2;
                this.timestamp_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearTotalDrivenTimer() {
                this.bitField0_ &= -9;
                this.totalDrivenTimer_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
            public int getDailyDrivenTimer() {
                return this.dailyDrivenTimer_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_BreakPlannerStateChangedNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
            public boolean getElogDetected() {
                return this.elogDetected_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
            public int getTimeOnBreak() {
                return this.timeOnBreak_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
            public int getTimeUntilBreakTimer() {
                return this.timeUntilBreakTimer_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
            public TimerState getTimerState() {
                TimerState timerStateForNumber = TimerState.forNumber(this.timerState_);
                return timerStateForNumber == null ? TimerState.UNKNOWN : timerStateForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
            public long getTimestamp() {
                return this.timestamp_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
            public int getTotalDrivenTimer() {
                return this.totalDrivenTimer_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
            public boolean hasDailyDrivenTimer() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
            public boolean hasElogDetected() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
            public boolean hasTimeOnBreak() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
            public boolean hasTimeUntilBreakTimer() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
            public boolean hasTimerState() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
            public boolean hasTimestamp() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotificationOrBuilder
            public boolean hasTotalDrivenTimer() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_BreakPlannerStateChangedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(BreakPlannerStateChangedNotification.class, Builder.class);
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
                                    this.timestamp_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.dailyDrivenTimer_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.timeUntilBreakTimer_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.totalDrivenTimer_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    int i14 = codedInputStream.readEnum();
                                    if (TimerState.forNumber(i14) == null) {
                                        mergeUnknownVarintField(5, i14);
                                    } else {
                                        this.timerState_ = i14;
                                        this.bitField0_ |= 16;
                                    }
                                } else if (tag == 48) {
                                    this.elogDetected_ = codedInputStream.readBool();
                                    this.bitField0_ |= 32;
                                } else if (tag == 56) {
                                    this.timeOnBreak_ = codedInputStream.readUInt32();
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

            public Builder setDailyDrivenTimer(int i14) {
                this.dailyDrivenTimer_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setElogDetected(boolean z14) {
                this.elogDetected_ = z14;
                this.bitField0_ |= 32;
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

            public Builder setTimeOnBreak(int i14) {
                this.timeOnBreak_ = i14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setTimeUntilBreakTimer(int i14) {
                this.timeUntilBreakTimer_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTimerState(TimerState timerState) {
                timerState.getClass();
                this.bitField0_ |= 16;
                this.timerState_ = timerState.getNumber();
                onChanged();
                return this;
            }

            public Builder setTimestamp(long j8) {
                this.timestamp_ = j8;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTotalDrivenTimer(int i14) {
                this.totalDrivenTimer_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public BreakPlannerStateChangedNotification getDefaultInstanceForType() {
                return BreakPlannerStateChangedNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.timerState_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof BreakPlannerStateChangedNotification) {
                    return mergeFrom((BreakPlannerStateChangedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(BreakPlannerStateChangedNotification breakPlannerStateChangedNotification) {
                if (breakPlannerStateChangedNotification == BreakPlannerStateChangedNotification.getDefaultInstance()) {
                    return this;
                }
                if (breakPlannerStateChangedNotification.hasTimestamp()) {
                    setTimestamp(breakPlannerStateChangedNotification.getTimestamp());
                }
                if (breakPlannerStateChangedNotification.hasDailyDrivenTimer()) {
                    setDailyDrivenTimer(breakPlannerStateChangedNotification.getDailyDrivenTimer());
                }
                if (breakPlannerStateChangedNotification.hasTimeUntilBreakTimer()) {
                    setTimeUntilBreakTimer(breakPlannerStateChangedNotification.getTimeUntilBreakTimer());
                }
                if (breakPlannerStateChangedNotification.hasTotalDrivenTimer()) {
                    setTotalDrivenTimer(breakPlannerStateChangedNotification.getTotalDrivenTimer());
                }
                if (breakPlannerStateChangedNotification.hasTimerState()) {
                    setTimerState(breakPlannerStateChangedNotification.getTimerState());
                }
                if (breakPlannerStateChangedNotification.hasElogDetected()) {
                    setElogDetected(breakPlannerStateChangedNotification.getElogDetected());
                }
                if (breakPlannerStateChangedNotification.hasTimeOnBreak()) {
                    setTimeOnBreak(breakPlannerStateChangedNotification.getTimeOnBreak());
                }
                mergeUnknownFields(breakPlannerStateChangedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public BreakPlannerStateChangedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static BreakPlannerStateChangedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BreakPlannerStateChangedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BreakPlannerStateChangedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static BreakPlannerStateChangedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BreakPlannerStateChangedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static BreakPlannerStateChangedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static BreakPlannerStateChangedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static BreakPlannerStateChangedNotification parseFrom(InputStream inputStream) {
            return (BreakPlannerStateChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static BreakPlannerStateChangedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BreakPlannerStateChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BreakPlannerStateChangedNotification parseFrom(CodedInputStream codedInputStream) {
            return (BreakPlannerStateChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static BreakPlannerStateChangedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BreakPlannerStateChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ BreakPlannerStateChangedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public enum TimerState implements ProtocolMessageEnum {
            UNKNOWN(0),
            DRIVING(1),
            STOPPED(2),
            RESET(3),
            PAUSED(4);

            public static final int DRIVING_VALUE = 1;
            public static final int PAUSED_VALUE = 4;
            public static final int RESET_VALUE = 3;
            public static final int STOPPED_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<TimerState> internalValueMap = new Internal.EnumLiteMap<TimerState>() { // from class: com.garmin.proto.generated.GDIDezlProto.BreakPlannerStateChangedNotification.TimerState.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public TimerState findValueByNumber(int i14) {
                    return TimerState.forNumber(i14);
                }
            };
            private static final TimerState[] VALUES = values();

            TimerState(int i14) {
                this.value = i14;
            }

            public static TimerState forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return DRIVING;
                }
                if (i14 == 2) {
                    return STOPPED;
                }
                if (i14 == 3) {
                    return RESET;
                }
                if (i14 != 4) {
                    return null;
                }
                return PAUSED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return BreakPlannerStateChangedNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<TimerState> internalGetValueMap() {
                return internalValueMap;
            }

            public static TimerState valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static TimerState valueOf(int i14) {
                return forNumber(i14);
            }
        }

        private BreakPlannerStateChangedNotification() {
            this.timestamp_ = 0L;
            this.dailyDrivenTimer_ = 0;
            this.timeUntilBreakTimer_ = 0;
            this.totalDrivenTimer_ = 0;
            this.elogDetected_ = false;
            this.timeOnBreak_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.timerState_ = 0;
        }
    }

    public static final class DezlService extends GeneratedMessageV3 implements DezlServiceOrBuilder {
        public static final int ENABLE_REQUEST_FIELD_NUMBER = 12;
        public static final int ENABLE_RESPONSE_FIELD_NUMBER = 13;
        public static final int STAGE_COMPLETED_NOTIFICATION_FIELD_NUMBER = 9;
        public static final int STAGE_PAUSED_NOTIFICATION_FIELD_NUMBER = 10;
        public static final int STAGE_SELECTED_NOTIFICATION_FIELD_NUMBER = 7;
        public static final int STAGE_STARTED_NOTIFICATION_FIELD_NUMBER = 8;
        public static final int TRUCK_STOP_LOYALTY_INFO_NOTIFICATION_FIELD_NUMBER = 3;
        public static final int TRUCK_STOP_LOYALTY_INFO_REQUEST_FIELD_NUMBER = 1;
        public static final int TRUCK_STOP_LOYALTY_INFO_RESPONSE_FIELD_NUMBER = 2;
        public static final int WELLNESS_SUGGESTION_REQUEST_FIELD_NUMBER = 4;
        public static final int WELLNESS_SUGGESTION_RESPONSE_FIELD_NUMBER = 5;
        public static final int WORKOUT_CANCELED_NOTIFICATION_FIELD_NUMBER = 11;
        public static final int WORKOUT_SELECTED_NOTIFICATION_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private FeaturesEnableRequest enableRequest_;
        private FeaturesEnableResponse enableResponse_;
        private byte memoizedIsInitialized;
        private StageCompletedNotification stageCompletedNotification_;
        private StagePausedNotification stagePausedNotification_;
        private StageSelectedNotification stageSelectedNotification_;
        private StageStartedNotification stageStartedNotification_;
        private TruckStopLoyaltyInfoNotification truckStopLoyaltyInfoNotification_;
        private TruckStopLoyaltyInfoRequest truckStopLoyaltyInfoRequest_;
        private TruckStopLoyaltyInfoResponse truckStopLoyaltyInfoResponse_;
        private WellnessSuggestionRequest wellnessSuggestionRequest_;
        private WellnessSuggestionResponse wellnessSuggestionResponse_;
        private WorkoutCanceledNotification workoutCanceledNotification_;
        private WorkoutSelectedNotification workoutSelectedNotification_;
        private static final DezlService DEFAULT_INSTANCE = new DezlService();

        @Deprecated
        public static final Parser<DezlService> PARSER = new AbstractParser<DezlService>() { // from class: com.garmin.proto.generated.GDIDezlProto.DezlService.1
            @Override // com.google.protobuf.Parser
            public DezlService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DezlService.newBuilder();
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

        private DezlService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DezlService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_DezlService_descriptor;
        }

        public static Builder newBuilder(DezlService dezlService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dezlService);
        }

        public static DezlService parseDelimitedFrom(InputStream inputStream) {
            return (DezlService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DezlService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DezlService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DezlService)) {
                return super.equals(obj);
            }
            DezlService dezlService = (DezlService) obj;
            if (hasTruckStopLoyaltyInfoRequest() != dezlService.hasTruckStopLoyaltyInfoRequest()) {
                return false;
            }
            if ((hasTruckStopLoyaltyInfoRequest() && !getTruckStopLoyaltyInfoRequest().equals(dezlService.getTruckStopLoyaltyInfoRequest())) || hasTruckStopLoyaltyInfoResponse() != dezlService.hasTruckStopLoyaltyInfoResponse()) {
                return false;
            }
            if ((hasTruckStopLoyaltyInfoResponse() && !getTruckStopLoyaltyInfoResponse().equals(dezlService.getTruckStopLoyaltyInfoResponse())) || hasTruckStopLoyaltyInfoNotification() != dezlService.hasTruckStopLoyaltyInfoNotification()) {
                return false;
            }
            if ((hasTruckStopLoyaltyInfoNotification() && !getTruckStopLoyaltyInfoNotification().equals(dezlService.getTruckStopLoyaltyInfoNotification())) || hasWellnessSuggestionRequest() != dezlService.hasWellnessSuggestionRequest()) {
                return false;
            }
            if ((hasWellnessSuggestionRequest() && !getWellnessSuggestionRequest().equals(dezlService.getWellnessSuggestionRequest())) || hasWellnessSuggestionResponse() != dezlService.hasWellnessSuggestionResponse()) {
                return false;
            }
            if ((hasWellnessSuggestionResponse() && !getWellnessSuggestionResponse().equals(dezlService.getWellnessSuggestionResponse())) || hasWorkoutSelectedNotification() != dezlService.hasWorkoutSelectedNotification()) {
                return false;
            }
            if ((hasWorkoutSelectedNotification() && !getWorkoutSelectedNotification().equals(dezlService.getWorkoutSelectedNotification())) || hasStageSelectedNotification() != dezlService.hasStageSelectedNotification()) {
                return false;
            }
            if ((hasStageSelectedNotification() && !getStageSelectedNotification().equals(dezlService.getStageSelectedNotification())) || hasStageStartedNotification() != dezlService.hasStageStartedNotification()) {
                return false;
            }
            if ((hasStageStartedNotification() && !getStageStartedNotification().equals(dezlService.getStageStartedNotification())) || hasStageCompletedNotification() != dezlService.hasStageCompletedNotification()) {
                return false;
            }
            if ((hasStageCompletedNotification() && !getStageCompletedNotification().equals(dezlService.getStageCompletedNotification())) || hasStagePausedNotification() != dezlService.hasStagePausedNotification()) {
                return false;
            }
            if ((hasStagePausedNotification() && !getStagePausedNotification().equals(dezlService.getStagePausedNotification())) || hasWorkoutCanceledNotification() != dezlService.hasWorkoutCanceledNotification()) {
                return false;
            }
            if ((hasWorkoutCanceledNotification() && !getWorkoutCanceledNotification().equals(dezlService.getWorkoutCanceledNotification())) || hasEnableRequest() != dezlService.hasEnableRequest()) {
                return false;
            }
            if ((!hasEnableRequest() || getEnableRequest().equals(dezlService.getEnableRequest())) && hasEnableResponse() == dezlService.hasEnableResponse()) {
                return (!hasEnableResponse() || getEnableResponse().equals(dezlService.getEnableResponse())) && getUnknownFields().equals(dezlService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public FeaturesEnableRequest getEnableRequest() {
            FeaturesEnableRequest featuresEnableRequest = this.enableRequest_;
            return featuresEnableRequest == null ? FeaturesEnableRequest.getDefaultInstance() : featuresEnableRequest;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public FeaturesEnableRequestOrBuilder getEnableRequestOrBuilder() {
            FeaturesEnableRequest featuresEnableRequest = this.enableRequest_;
            return featuresEnableRequest == null ? FeaturesEnableRequest.getDefaultInstance() : featuresEnableRequest;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public FeaturesEnableResponse getEnableResponse() {
            FeaturesEnableResponse featuresEnableResponse = this.enableResponse_;
            return featuresEnableResponse == null ? FeaturesEnableResponse.getDefaultInstance() : featuresEnableResponse;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public FeaturesEnableResponseOrBuilder getEnableResponseOrBuilder() {
            FeaturesEnableResponse featuresEnableResponse = this.enableResponse_;
            return featuresEnableResponse == null ? FeaturesEnableResponse.getDefaultInstance() : featuresEnableResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DezlService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getTruckStopLoyaltyInfoRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getTruckStopLoyaltyInfoResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getTruckStopLoyaltyInfoNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getWellnessSuggestionRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getWellnessSuggestionResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getWorkoutSelectedNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getStageSelectedNotification());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getStageStartedNotification());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getStageCompletedNotification());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getStagePausedNotification());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getWorkoutCanceledNotification());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getEnableRequest());
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, getEnableResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public StageCompletedNotification getStageCompletedNotification() {
            StageCompletedNotification stageCompletedNotification = this.stageCompletedNotification_;
            return stageCompletedNotification == null ? StageCompletedNotification.getDefaultInstance() : stageCompletedNotification;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public StageCompletedNotificationOrBuilder getStageCompletedNotificationOrBuilder() {
            StageCompletedNotification stageCompletedNotification = this.stageCompletedNotification_;
            return stageCompletedNotification == null ? StageCompletedNotification.getDefaultInstance() : stageCompletedNotification;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public StagePausedNotification getStagePausedNotification() {
            StagePausedNotification stagePausedNotification = this.stagePausedNotification_;
            return stagePausedNotification == null ? StagePausedNotification.getDefaultInstance() : stagePausedNotification;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public StagePausedNotificationOrBuilder getStagePausedNotificationOrBuilder() {
            StagePausedNotification stagePausedNotification = this.stagePausedNotification_;
            return stagePausedNotification == null ? StagePausedNotification.getDefaultInstance() : stagePausedNotification;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public StageSelectedNotification getStageSelectedNotification() {
            StageSelectedNotification stageSelectedNotification = this.stageSelectedNotification_;
            return stageSelectedNotification == null ? StageSelectedNotification.getDefaultInstance() : stageSelectedNotification;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public StageSelectedNotificationOrBuilder getStageSelectedNotificationOrBuilder() {
            StageSelectedNotification stageSelectedNotification = this.stageSelectedNotification_;
            return stageSelectedNotification == null ? StageSelectedNotification.getDefaultInstance() : stageSelectedNotification;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public StageStartedNotification getStageStartedNotification() {
            StageStartedNotification stageStartedNotification = this.stageStartedNotification_;
            return stageStartedNotification == null ? StageStartedNotification.getDefaultInstance() : stageStartedNotification;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public StageStartedNotificationOrBuilder getStageStartedNotificationOrBuilder() {
            StageStartedNotification stageStartedNotification = this.stageStartedNotification_;
            return stageStartedNotification == null ? StageStartedNotification.getDefaultInstance() : stageStartedNotification;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public TruckStopLoyaltyInfoNotification getTruckStopLoyaltyInfoNotification() {
            TruckStopLoyaltyInfoNotification truckStopLoyaltyInfoNotification = this.truckStopLoyaltyInfoNotification_;
            return truckStopLoyaltyInfoNotification == null ? TruckStopLoyaltyInfoNotification.getDefaultInstance() : truckStopLoyaltyInfoNotification;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public TruckStopLoyaltyInfoNotificationOrBuilder getTruckStopLoyaltyInfoNotificationOrBuilder() {
            TruckStopLoyaltyInfoNotification truckStopLoyaltyInfoNotification = this.truckStopLoyaltyInfoNotification_;
            return truckStopLoyaltyInfoNotification == null ? TruckStopLoyaltyInfoNotification.getDefaultInstance() : truckStopLoyaltyInfoNotification;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public TruckStopLoyaltyInfoRequest getTruckStopLoyaltyInfoRequest() {
            TruckStopLoyaltyInfoRequest truckStopLoyaltyInfoRequest = this.truckStopLoyaltyInfoRequest_;
            return truckStopLoyaltyInfoRequest == null ? TruckStopLoyaltyInfoRequest.getDefaultInstance() : truckStopLoyaltyInfoRequest;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public TruckStopLoyaltyInfoRequestOrBuilder getTruckStopLoyaltyInfoRequestOrBuilder() {
            TruckStopLoyaltyInfoRequest truckStopLoyaltyInfoRequest = this.truckStopLoyaltyInfoRequest_;
            return truckStopLoyaltyInfoRequest == null ? TruckStopLoyaltyInfoRequest.getDefaultInstance() : truckStopLoyaltyInfoRequest;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public TruckStopLoyaltyInfoResponse getTruckStopLoyaltyInfoResponse() {
            TruckStopLoyaltyInfoResponse truckStopLoyaltyInfoResponse = this.truckStopLoyaltyInfoResponse_;
            return truckStopLoyaltyInfoResponse == null ? TruckStopLoyaltyInfoResponse.getDefaultInstance() : truckStopLoyaltyInfoResponse;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public TruckStopLoyaltyInfoResponseOrBuilder getTruckStopLoyaltyInfoResponseOrBuilder() {
            TruckStopLoyaltyInfoResponse truckStopLoyaltyInfoResponse = this.truckStopLoyaltyInfoResponse_;
            return truckStopLoyaltyInfoResponse == null ? TruckStopLoyaltyInfoResponse.getDefaultInstance() : truckStopLoyaltyInfoResponse;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public WellnessSuggestionRequest getWellnessSuggestionRequest() {
            WellnessSuggestionRequest wellnessSuggestionRequest = this.wellnessSuggestionRequest_;
            return wellnessSuggestionRequest == null ? WellnessSuggestionRequest.getDefaultInstance() : wellnessSuggestionRequest;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public WellnessSuggestionRequestOrBuilder getWellnessSuggestionRequestOrBuilder() {
            WellnessSuggestionRequest wellnessSuggestionRequest = this.wellnessSuggestionRequest_;
            return wellnessSuggestionRequest == null ? WellnessSuggestionRequest.getDefaultInstance() : wellnessSuggestionRequest;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public WellnessSuggestionResponse getWellnessSuggestionResponse() {
            WellnessSuggestionResponse wellnessSuggestionResponse = this.wellnessSuggestionResponse_;
            return wellnessSuggestionResponse == null ? WellnessSuggestionResponse.getDefaultInstance() : wellnessSuggestionResponse;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public WellnessSuggestionResponseOrBuilder getWellnessSuggestionResponseOrBuilder() {
            WellnessSuggestionResponse wellnessSuggestionResponse = this.wellnessSuggestionResponse_;
            return wellnessSuggestionResponse == null ? WellnessSuggestionResponse.getDefaultInstance() : wellnessSuggestionResponse;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public WorkoutCanceledNotification getWorkoutCanceledNotification() {
            WorkoutCanceledNotification workoutCanceledNotification = this.workoutCanceledNotification_;
            return workoutCanceledNotification == null ? WorkoutCanceledNotification.getDefaultInstance() : workoutCanceledNotification;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public WorkoutCanceledNotificationOrBuilder getWorkoutCanceledNotificationOrBuilder() {
            WorkoutCanceledNotification workoutCanceledNotification = this.workoutCanceledNotification_;
            return workoutCanceledNotification == null ? WorkoutCanceledNotification.getDefaultInstance() : workoutCanceledNotification;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public WorkoutSelectedNotification getWorkoutSelectedNotification() {
            WorkoutSelectedNotification workoutSelectedNotification = this.workoutSelectedNotification_;
            return workoutSelectedNotification == null ? WorkoutSelectedNotification.getDefaultInstance() : workoutSelectedNotification;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public WorkoutSelectedNotificationOrBuilder getWorkoutSelectedNotificationOrBuilder() {
            WorkoutSelectedNotification workoutSelectedNotification = this.workoutSelectedNotification_;
            return workoutSelectedNotification == null ? WorkoutSelectedNotification.getDefaultInstance() : workoutSelectedNotification;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public boolean hasEnableRequest() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public boolean hasEnableResponse() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public boolean hasStageCompletedNotification() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public boolean hasStagePausedNotification() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public boolean hasStageSelectedNotification() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public boolean hasStageStartedNotification() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public boolean hasTruckStopLoyaltyInfoNotification() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public boolean hasTruckStopLoyaltyInfoRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public boolean hasTruckStopLoyaltyInfoResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public boolean hasWellnessSuggestionRequest() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public boolean hasWellnessSuggestionResponse() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public boolean hasWorkoutCanceledNotification() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
        public boolean hasWorkoutSelectedNotification() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTruckStopLoyaltyInfoRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTruckStopLoyaltyInfoRequest().hashCode();
            }
            if (hasTruckStopLoyaltyInfoResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTruckStopLoyaltyInfoResponse().hashCode();
            }
            if (hasTruckStopLoyaltyInfoNotification()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getTruckStopLoyaltyInfoNotification().hashCode();
            }
            if (hasWellnessSuggestionRequest()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getWellnessSuggestionRequest().hashCode();
            }
            if (hasWellnessSuggestionResponse()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getWellnessSuggestionResponse().hashCode();
            }
            if (hasWorkoutSelectedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getWorkoutSelectedNotification().hashCode();
            }
            if (hasStageSelectedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getStageSelectedNotification().hashCode();
            }
            if (hasStageStartedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getStageStartedNotification().hashCode();
            }
            if (hasStageCompletedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getStageCompletedNotification().hashCode();
            }
            if (hasStagePausedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getStagePausedNotification().hashCode();
            }
            if (hasWorkoutCanceledNotification()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getWorkoutCanceledNotification().hashCode();
            }
            if (hasEnableRequest()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getEnableRequest().hashCode();
            }
            if (hasEnableResponse()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getEnableResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_DezlService_fieldAccessorTable.ensureFieldAccessorsInitialized(DezlService.class, Builder.class);
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
            return new DezlService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getTruckStopLoyaltyInfoRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getTruckStopLoyaltyInfoResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getTruckStopLoyaltyInfoNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getWellnessSuggestionRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getWellnessSuggestionResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getWorkoutSelectedNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getStageSelectedNotification());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getStageStartedNotification());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getStageCompletedNotification());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getStagePausedNotification());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getWorkoutCanceledNotification());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(12, getEnableRequest());
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeMessage(13, getEnableResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DezlServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<FeaturesEnableRequest, FeaturesEnableRequest.Builder, FeaturesEnableRequestOrBuilder> enableRequestBuilder_;
            private FeaturesEnableRequest enableRequest_;
            private SingleFieldBuilderV3<FeaturesEnableResponse, FeaturesEnableResponse.Builder, FeaturesEnableResponseOrBuilder> enableResponseBuilder_;
            private FeaturesEnableResponse enableResponse_;
            private SingleFieldBuilderV3<StageCompletedNotification, StageCompletedNotification.Builder, StageCompletedNotificationOrBuilder> stageCompletedNotificationBuilder_;
            private StageCompletedNotification stageCompletedNotification_;
            private SingleFieldBuilderV3<StagePausedNotification, StagePausedNotification.Builder, StagePausedNotificationOrBuilder> stagePausedNotificationBuilder_;
            private StagePausedNotification stagePausedNotification_;
            private SingleFieldBuilderV3<StageSelectedNotification, StageSelectedNotification.Builder, StageSelectedNotificationOrBuilder> stageSelectedNotificationBuilder_;
            private StageSelectedNotification stageSelectedNotification_;
            private SingleFieldBuilderV3<StageStartedNotification, StageStartedNotification.Builder, StageStartedNotificationOrBuilder> stageStartedNotificationBuilder_;
            private StageStartedNotification stageStartedNotification_;
            private SingleFieldBuilderV3<TruckStopLoyaltyInfoNotification, TruckStopLoyaltyInfoNotification.Builder, TruckStopLoyaltyInfoNotificationOrBuilder> truckStopLoyaltyInfoNotificationBuilder_;
            private TruckStopLoyaltyInfoNotification truckStopLoyaltyInfoNotification_;
            private SingleFieldBuilderV3<TruckStopLoyaltyInfoRequest, TruckStopLoyaltyInfoRequest.Builder, TruckStopLoyaltyInfoRequestOrBuilder> truckStopLoyaltyInfoRequestBuilder_;
            private TruckStopLoyaltyInfoRequest truckStopLoyaltyInfoRequest_;
            private SingleFieldBuilderV3<TruckStopLoyaltyInfoResponse, TruckStopLoyaltyInfoResponse.Builder, TruckStopLoyaltyInfoResponseOrBuilder> truckStopLoyaltyInfoResponseBuilder_;
            private TruckStopLoyaltyInfoResponse truckStopLoyaltyInfoResponse_;
            private SingleFieldBuilderV3<WellnessSuggestionRequest, WellnessSuggestionRequest.Builder, WellnessSuggestionRequestOrBuilder> wellnessSuggestionRequestBuilder_;
            private WellnessSuggestionRequest wellnessSuggestionRequest_;
            private SingleFieldBuilderV3<WellnessSuggestionResponse, WellnessSuggestionResponse.Builder, WellnessSuggestionResponseOrBuilder> wellnessSuggestionResponseBuilder_;
            private WellnessSuggestionResponse wellnessSuggestionResponse_;
            private SingleFieldBuilderV3<WorkoutCanceledNotification, WorkoutCanceledNotification.Builder, WorkoutCanceledNotificationOrBuilder> workoutCanceledNotificationBuilder_;
            private WorkoutCanceledNotification workoutCanceledNotification_;
            private SingleFieldBuilderV3<WorkoutSelectedNotification, WorkoutSelectedNotification.Builder, WorkoutSelectedNotificationOrBuilder> workoutSelectedNotificationBuilder_;
            private WorkoutSelectedNotification workoutSelectedNotification_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(DezlService dezlService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<TruckStopLoyaltyInfoRequest, TruckStopLoyaltyInfoRequest.Builder, TruckStopLoyaltyInfoRequestOrBuilder> singleFieldBuilderV3 = this.truckStopLoyaltyInfoRequestBuilder_;
                    dezlService.truckStopLoyaltyInfoRequest_ = singleFieldBuilderV3 == null ? this.truckStopLoyaltyInfoRequest_ : (TruckStopLoyaltyInfoRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<TruckStopLoyaltyInfoResponse, TruckStopLoyaltyInfoResponse.Builder, TruckStopLoyaltyInfoResponseOrBuilder> singleFieldBuilderV4 = this.truckStopLoyaltyInfoResponseBuilder_;
                    dezlService.truckStopLoyaltyInfoResponse_ = singleFieldBuilderV4 == null ? this.truckStopLoyaltyInfoResponse_ : (TruckStopLoyaltyInfoResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<TruckStopLoyaltyInfoNotification, TruckStopLoyaltyInfoNotification.Builder, TruckStopLoyaltyInfoNotificationOrBuilder> singleFieldBuilderV5 = this.truckStopLoyaltyInfoNotificationBuilder_;
                    dezlService.truckStopLoyaltyInfoNotification_ = singleFieldBuilderV5 == null ? this.truckStopLoyaltyInfoNotification_ : (TruckStopLoyaltyInfoNotification) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<WellnessSuggestionRequest, WellnessSuggestionRequest.Builder, WellnessSuggestionRequestOrBuilder> singleFieldBuilderV6 = this.wellnessSuggestionRequestBuilder_;
                    dezlService.wellnessSuggestionRequest_ = singleFieldBuilderV6 == null ? this.wellnessSuggestionRequest_ : (WellnessSuggestionRequest) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<WellnessSuggestionResponse, WellnessSuggestionResponse.Builder, WellnessSuggestionResponseOrBuilder> singleFieldBuilderV7 = this.wellnessSuggestionResponseBuilder_;
                    dezlService.wellnessSuggestionResponse_ = singleFieldBuilderV7 == null ? this.wellnessSuggestionResponse_ : (WellnessSuggestionResponse) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<WorkoutSelectedNotification, WorkoutSelectedNotification.Builder, WorkoutSelectedNotificationOrBuilder> singleFieldBuilderV8 = this.workoutSelectedNotificationBuilder_;
                    dezlService.workoutSelectedNotification_ = singleFieldBuilderV8 == null ? this.workoutSelectedNotification_ : (WorkoutSelectedNotification) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<StageSelectedNotification, StageSelectedNotification.Builder, StageSelectedNotificationOrBuilder> singleFieldBuilderV9 = this.stageSelectedNotificationBuilder_;
                    dezlService.stageSelectedNotification_ = singleFieldBuilderV9 == null ? this.stageSelectedNotification_ : (StageSelectedNotification) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<StageStartedNotification, StageStartedNotification.Builder, StageStartedNotificationOrBuilder> singleFieldBuilderV10 = this.stageStartedNotificationBuilder_;
                    dezlService.stageStartedNotification_ = singleFieldBuilderV10 == null ? this.stageStartedNotification_ : (StageStartedNotification) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<StageCompletedNotification, StageCompletedNotification.Builder, StageCompletedNotificationOrBuilder> singleFieldBuilderV11 = this.stageCompletedNotificationBuilder_;
                    dezlService.stageCompletedNotification_ = singleFieldBuilderV11 == null ? this.stageCompletedNotification_ : (StageCompletedNotification) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<StagePausedNotification, StagePausedNotification.Builder, StagePausedNotificationOrBuilder> singleFieldBuilderV12 = this.stagePausedNotificationBuilder_;
                    dezlService.stagePausedNotification_ = singleFieldBuilderV12 == null ? this.stagePausedNotification_ : (StagePausedNotification) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<WorkoutCanceledNotification, WorkoutCanceledNotification.Builder, WorkoutCanceledNotificationOrBuilder> singleFieldBuilderV13 = this.workoutCanceledNotificationBuilder_;
                    dezlService.workoutCanceledNotification_ = singleFieldBuilderV13 == null ? this.workoutCanceledNotification_ : (WorkoutCanceledNotification) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<FeaturesEnableRequest, FeaturesEnableRequest.Builder, FeaturesEnableRequestOrBuilder> singleFieldBuilderV14 = this.enableRequestBuilder_;
                    dezlService.enableRequest_ = singleFieldBuilderV14 == null ? this.enableRequest_ : (FeaturesEnableRequest) singleFieldBuilderV14.build();
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    SingleFieldBuilderV3<FeaturesEnableResponse, FeaturesEnableResponse.Builder, FeaturesEnableResponseOrBuilder> singleFieldBuilderV15 = this.enableResponseBuilder_;
                    dezlService.enableResponse_ = singleFieldBuilderV15 == null ? this.enableResponse_ : (FeaturesEnableResponse) singleFieldBuilderV15.build();
                    i14 |= 4096;
                }
                dezlService.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_DezlService_descriptor;
            }

            private SingleFieldBuilderV3<FeaturesEnableRequest, FeaturesEnableRequest.Builder, FeaturesEnableRequestOrBuilder> getEnableRequestFieldBuilder() {
                if (this.enableRequestBuilder_ == null) {
                    this.enableRequestBuilder_ = new SingleFieldBuilderV3<>(getEnableRequest(), getParentForChildren(), isClean());
                    this.enableRequest_ = null;
                }
                return this.enableRequestBuilder_;
            }

            private SingleFieldBuilderV3<FeaturesEnableResponse, FeaturesEnableResponse.Builder, FeaturesEnableResponseOrBuilder> getEnableResponseFieldBuilder() {
                if (this.enableResponseBuilder_ == null) {
                    this.enableResponseBuilder_ = new SingleFieldBuilderV3<>(getEnableResponse(), getParentForChildren(), isClean());
                    this.enableResponse_ = null;
                }
                return this.enableResponseBuilder_;
            }

            private SingleFieldBuilderV3<StageCompletedNotification, StageCompletedNotification.Builder, StageCompletedNotificationOrBuilder> getStageCompletedNotificationFieldBuilder() {
                if (this.stageCompletedNotificationBuilder_ == null) {
                    this.stageCompletedNotificationBuilder_ = new SingleFieldBuilderV3<>(getStageCompletedNotification(), getParentForChildren(), isClean());
                    this.stageCompletedNotification_ = null;
                }
                return this.stageCompletedNotificationBuilder_;
            }

            private SingleFieldBuilderV3<StagePausedNotification, StagePausedNotification.Builder, StagePausedNotificationOrBuilder> getStagePausedNotificationFieldBuilder() {
                if (this.stagePausedNotificationBuilder_ == null) {
                    this.stagePausedNotificationBuilder_ = new SingleFieldBuilderV3<>(getStagePausedNotification(), getParentForChildren(), isClean());
                    this.stagePausedNotification_ = null;
                }
                return this.stagePausedNotificationBuilder_;
            }

            private SingleFieldBuilderV3<StageSelectedNotification, StageSelectedNotification.Builder, StageSelectedNotificationOrBuilder> getStageSelectedNotificationFieldBuilder() {
                if (this.stageSelectedNotificationBuilder_ == null) {
                    this.stageSelectedNotificationBuilder_ = new SingleFieldBuilderV3<>(getStageSelectedNotification(), getParentForChildren(), isClean());
                    this.stageSelectedNotification_ = null;
                }
                return this.stageSelectedNotificationBuilder_;
            }

            private SingleFieldBuilderV3<StageStartedNotification, StageStartedNotification.Builder, StageStartedNotificationOrBuilder> getStageStartedNotificationFieldBuilder() {
                if (this.stageStartedNotificationBuilder_ == null) {
                    this.stageStartedNotificationBuilder_ = new SingleFieldBuilderV3<>(getStageStartedNotification(), getParentForChildren(), isClean());
                    this.stageStartedNotification_ = null;
                }
                return this.stageStartedNotificationBuilder_;
            }

            private SingleFieldBuilderV3<TruckStopLoyaltyInfoNotification, TruckStopLoyaltyInfoNotification.Builder, TruckStopLoyaltyInfoNotificationOrBuilder> getTruckStopLoyaltyInfoNotificationFieldBuilder() {
                if (this.truckStopLoyaltyInfoNotificationBuilder_ == null) {
                    this.truckStopLoyaltyInfoNotificationBuilder_ = new SingleFieldBuilderV3<>(getTruckStopLoyaltyInfoNotification(), getParentForChildren(), isClean());
                    this.truckStopLoyaltyInfoNotification_ = null;
                }
                return this.truckStopLoyaltyInfoNotificationBuilder_;
            }

            private SingleFieldBuilderV3<TruckStopLoyaltyInfoRequest, TruckStopLoyaltyInfoRequest.Builder, TruckStopLoyaltyInfoRequestOrBuilder> getTruckStopLoyaltyInfoRequestFieldBuilder() {
                if (this.truckStopLoyaltyInfoRequestBuilder_ == null) {
                    this.truckStopLoyaltyInfoRequestBuilder_ = new SingleFieldBuilderV3<>(getTruckStopLoyaltyInfoRequest(), getParentForChildren(), isClean());
                    this.truckStopLoyaltyInfoRequest_ = null;
                }
                return this.truckStopLoyaltyInfoRequestBuilder_;
            }

            private SingleFieldBuilderV3<TruckStopLoyaltyInfoResponse, TruckStopLoyaltyInfoResponse.Builder, TruckStopLoyaltyInfoResponseOrBuilder> getTruckStopLoyaltyInfoResponseFieldBuilder() {
                if (this.truckStopLoyaltyInfoResponseBuilder_ == null) {
                    this.truckStopLoyaltyInfoResponseBuilder_ = new SingleFieldBuilderV3<>(getTruckStopLoyaltyInfoResponse(), getParentForChildren(), isClean());
                    this.truckStopLoyaltyInfoResponse_ = null;
                }
                return this.truckStopLoyaltyInfoResponseBuilder_;
            }

            private SingleFieldBuilderV3<WellnessSuggestionRequest, WellnessSuggestionRequest.Builder, WellnessSuggestionRequestOrBuilder> getWellnessSuggestionRequestFieldBuilder() {
                if (this.wellnessSuggestionRequestBuilder_ == null) {
                    this.wellnessSuggestionRequestBuilder_ = new SingleFieldBuilderV3<>(getWellnessSuggestionRequest(), getParentForChildren(), isClean());
                    this.wellnessSuggestionRequest_ = null;
                }
                return this.wellnessSuggestionRequestBuilder_;
            }

            private SingleFieldBuilderV3<WellnessSuggestionResponse, WellnessSuggestionResponse.Builder, WellnessSuggestionResponseOrBuilder> getWellnessSuggestionResponseFieldBuilder() {
                if (this.wellnessSuggestionResponseBuilder_ == null) {
                    this.wellnessSuggestionResponseBuilder_ = new SingleFieldBuilderV3<>(getWellnessSuggestionResponse(), getParentForChildren(), isClean());
                    this.wellnessSuggestionResponse_ = null;
                }
                return this.wellnessSuggestionResponseBuilder_;
            }

            private SingleFieldBuilderV3<WorkoutCanceledNotification, WorkoutCanceledNotification.Builder, WorkoutCanceledNotificationOrBuilder> getWorkoutCanceledNotificationFieldBuilder() {
                if (this.workoutCanceledNotificationBuilder_ == null) {
                    this.workoutCanceledNotificationBuilder_ = new SingleFieldBuilderV3<>(getWorkoutCanceledNotification(), getParentForChildren(), isClean());
                    this.workoutCanceledNotification_ = null;
                }
                return this.workoutCanceledNotificationBuilder_;
            }

            private SingleFieldBuilderV3<WorkoutSelectedNotification, WorkoutSelectedNotification.Builder, WorkoutSelectedNotificationOrBuilder> getWorkoutSelectedNotificationFieldBuilder() {
                if (this.workoutSelectedNotificationBuilder_ == null) {
                    this.workoutSelectedNotificationBuilder_ = new SingleFieldBuilderV3<>(getWorkoutSelectedNotification(), getParentForChildren(), isClean());
                    this.workoutSelectedNotification_ = null;
                }
                return this.workoutSelectedNotificationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getTruckStopLoyaltyInfoRequestFieldBuilder();
                    getTruckStopLoyaltyInfoResponseFieldBuilder();
                    getTruckStopLoyaltyInfoNotificationFieldBuilder();
                    getWellnessSuggestionRequestFieldBuilder();
                    getWellnessSuggestionResponseFieldBuilder();
                    getWorkoutSelectedNotificationFieldBuilder();
                    getStageSelectedNotificationFieldBuilder();
                    getStageStartedNotificationFieldBuilder();
                    getStageCompletedNotificationFieldBuilder();
                    getStagePausedNotificationFieldBuilder();
                    getWorkoutCanceledNotificationFieldBuilder();
                    getEnableRequestFieldBuilder();
                    getEnableResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DezlService build() {
                DezlService dezlServiceBuildPartial = buildPartial();
                if (dezlServiceBuildPartial.isInitialized()) {
                    return dezlServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dezlServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DezlService buildPartial() {
                DezlService dezlService = new DezlService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dezlService);
                }
                onBuilt();
                return dezlService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.truckStopLoyaltyInfoRequest_ = null;
                SingleFieldBuilderV3<TruckStopLoyaltyInfoRequest, TruckStopLoyaltyInfoRequest.Builder, TruckStopLoyaltyInfoRequestOrBuilder> singleFieldBuilderV3 = this.truckStopLoyaltyInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.truckStopLoyaltyInfoRequestBuilder_ = null;
                }
                this.truckStopLoyaltyInfoResponse_ = null;
                SingleFieldBuilderV3<TruckStopLoyaltyInfoResponse, TruckStopLoyaltyInfoResponse.Builder, TruckStopLoyaltyInfoResponseOrBuilder> singleFieldBuilderV4 = this.truckStopLoyaltyInfoResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.truckStopLoyaltyInfoResponseBuilder_ = null;
                }
                this.truckStopLoyaltyInfoNotification_ = null;
                SingleFieldBuilderV3<TruckStopLoyaltyInfoNotification, TruckStopLoyaltyInfoNotification.Builder, TruckStopLoyaltyInfoNotificationOrBuilder> singleFieldBuilderV5 = this.truckStopLoyaltyInfoNotificationBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.truckStopLoyaltyInfoNotificationBuilder_ = null;
                }
                this.wellnessSuggestionRequest_ = null;
                SingleFieldBuilderV3<WellnessSuggestionRequest, WellnessSuggestionRequest.Builder, WellnessSuggestionRequestOrBuilder> singleFieldBuilderV6 = this.wellnessSuggestionRequestBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.wellnessSuggestionRequestBuilder_ = null;
                }
                this.wellnessSuggestionResponse_ = null;
                SingleFieldBuilderV3<WellnessSuggestionResponse, WellnessSuggestionResponse.Builder, WellnessSuggestionResponseOrBuilder> singleFieldBuilderV7 = this.wellnessSuggestionResponseBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.wellnessSuggestionResponseBuilder_ = null;
                }
                this.workoutSelectedNotification_ = null;
                SingleFieldBuilderV3<WorkoutSelectedNotification, WorkoutSelectedNotification.Builder, WorkoutSelectedNotificationOrBuilder> singleFieldBuilderV8 = this.workoutSelectedNotificationBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.workoutSelectedNotificationBuilder_ = null;
                }
                this.stageSelectedNotification_ = null;
                SingleFieldBuilderV3<StageSelectedNotification, StageSelectedNotification.Builder, StageSelectedNotificationOrBuilder> singleFieldBuilderV9 = this.stageSelectedNotificationBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.stageSelectedNotificationBuilder_ = null;
                }
                this.stageStartedNotification_ = null;
                SingleFieldBuilderV3<StageStartedNotification, StageStartedNotification.Builder, StageStartedNotificationOrBuilder> singleFieldBuilderV10 = this.stageStartedNotificationBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.stageStartedNotificationBuilder_ = null;
                }
                this.stageCompletedNotification_ = null;
                SingleFieldBuilderV3<StageCompletedNotification, StageCompletedNotification.Builder, StageCompletedNotificationOrBuilder> singleFieldBuilderV11 = this.stageCompletedNotificationBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.stageCompletedNotificationBuilder_ = null;
                }
                this.stagePausedNotification_ = null;
                SingleFieldBuilderV3<StagePausedNotification, StagePausedNotification.Builder, StagePausedNotificationOrBuilder> singleFieldBuilderV12 = this.stagePausedNotificationBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.stagePausedNotificationBuilder_ = null;
                }
                this.workoutCanceledNotification_ = null;
                SingleFieldBuilderV3<WorkoutCanceledNotification, WorkoutCanceledNotification.Builder, WorkoutCanceledNotificationOrBuilder> singleFieldBuilderV13 = this.workoutCanceledNotificationBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.workoutCanceledNotificationBuilder_ = null;
                }
                this.enableRequest_ = null;
                SingleFieldBuilderV3<FeaturesEnableRequest, FeaturesEnableRequest.Builder, FeaturesEnableRequestOrBuilder> singleFieldBuilderV14 = this.enableRequestBuilder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.enableRequestBuilder_ = null;
                }
                this.enableResponse_ = null;
                SingleFieldBuilderV3<FeaturesEnableResponse, FeaturesEnableResponse.Builder, FeaturesEnableResponseOrBuilder> singleFieldBuilderV15 = this.enableResponseBuilder_;
                if (singleFieldBuilderV15 != null) {
                    singleFieldBuilderV15.dispose();
                    this.enableResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearEnableRequest() {
                this.bitField0_ &= -2049;
                this.enableRequest_ = null;
                SingleFieldBuilderV3<FeaturesEnableRequest, FeaturesEnableRequest.Builder, FeaturesEnableRequestOrBuilder> singleFieldBuilderV3 = this.enableRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.enableRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEnableResponse() {
                this.bitField0_ &= -4097;
                this.enableResponse_ = null;
                SingleFieldBuilderV3<FeaturesEnableResponse, FeaturesEnableResponse.Builder, FeaturesEnableResponseOrBuilder> singleFieldBuilderV3 = this.enableResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.enableResponseBuilder_ = null;
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

            public Builder clearStageCompletedNotification() {
                this.bitField0_ &= -257;
                this.stageCompletedNotification_ = null;
                SingleFieldBuilderV3<StageCompletedNotification, StageCompletedNotification.Builder, StageCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.stageCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stageCompletedNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStagePausedNotification() {
                this.bitField0_ &= -513;
                this.stagePausedNotification_ = null;
                SingleFieldBuilderV3<StagePausedNotification, StagePausedNotification.Builder, StagePausedNotificationOrBuilder> singleFieldBuilderV3 = this.stagePausedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stagePausedNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStageSelectedNotification() {
                this.bitField0_ &= -65;
                this.stageSelectedNotification_ = null;
                SingleFieldBuilderV3<StageSelectedNotification, StageSelectedNotification.Builder, StageSelectedNotificationOrBuilder> singleFieldBuilderV3 = this.stageSelectedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stageSelectedNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStageStartedNotification() {
                this.bitField0_ &= -129;
                this.stageStartedNotification_ = null;
                SingleFieldBuilderV3<StageStartedNotification, StageStartedNotification.Builder, StageStartedNotificationOrBuilder> singleFieldBuilderV3 = this.stageStartedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.stageStartedNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTruckStopLoyaltyInfoNotification() {
                this.bitField0_ &= -5;
                this.truckStopLoyaltyInfoNotification_ = null;
                SingleFieldBuilderV3<TruckStopLoyaltyInfoNotification, TruckStopLoyaltyInfoNotification.Builder, TruckStopLoyaltyInfoNotificationOrBuilder> singleFieldBuilderV3 = this.truckStopLoyaltyInfoNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.truckStopLoyaltyInfoNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTruckStopLoyaltyInfoRequest() {
                this.bitField0_ &= -2;
                this.truckStopLoyaltyInfoRequest_ = null;
                SingleFieldBuilderV3<TruckStopLoyaltyInfoRequest, TruckStopLoyaltyInfoRequest.Builder, TruckStopLoyaltyInfoRequestOrBuilder> singleFieldBuilderV3 = this.truckStopLoyaltyInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.truckStopLoyaltyInfoRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTruckStopLoyaltyInfoResponse() {
                this.bitField0_ &= -3;
                this.truckStopLoyaltyInfoResponse_ = null;
                SingleFieldBuilderV3<TruckStopLoyaltyInfoResponse, TruckStopLoyaltyInfoResponse.Builder, TruckStopLoyaltyInfoResponseOrBuilder> singleFieldBuilderV3 = this.truckStopLoyaltyInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.truckStopLoyaltyInfoResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearWellnessSuggestionRequest() {
                this.bitField0_ &= -9;
                this.wellnessSuggestionRequest_ = null;
                SingleFieldBuilderV3<WellnessSuggestionRequest, WellnessSuggestionRequest.Builder, WellnessSuggestionRequestOrBuilder> singleFieldBuilderV3 = this.wellnessSuggestionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.wellnessSuggestionRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearWellnessSuggestionResponse() {
                this.bitField0_ &= -17;
                this.wellnessSuggestionResponse_ = null;
                SingleFieldBuilderV3<WellnessSuggestionResponse, WellnessSuggestionResponse.Builder, WellnessSuggestionResponseOrBuilder> singleFieldBuilderV3 = this.wellnessSuggestionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.wellnessSuggestionResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearWorkoutCanceledNotification() {
                this.bitField0_ &= -1025;
                this.workoutCanceledNotification_ = null;
                SingleFieldBuilderV3<WorkoutCanceledNotification, WorkoutCanceledNotification.Builder, WorkoutCanceledNotificationOrBuilder> singleFieldBuilderV3 = this.workoutCanceledNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.workoutCanceledNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearWorkoutSelectedNotification() {
                this.bitField0_ &= -33;
                this.workoutSelectedNotification_ = null;
                SingleFieldBuilderV3<WorkoutSelectedNotification, WorkoutSelectedNotification.Builder, WorkoutSelectedNotificationOrBuilder> singleFieldBuilderV3 = this.workoutSelectedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.workoutSelectedNotificationBuilder_ = null;
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
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_DezlService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public FeaturesEnableRequest getEnableRequest() {
                SingleFieldBuilderV3<FeaturesEnableRequest, FeaturesEnableRequest.Builder, FeaturesEnableRequestOrBuilder> singleFieldBuilderV3 = this.enableRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FeaturesEnableRequest) singleFieldBuilderV3.getMessage();
                }
                FeaturesEnableRequest featuresEnableRequest = this.enableRequest_;
                return featuresEnableRequest == null ? FeaturesEnableRequest.getDefaultInstance() : featuresEnableRequest;
            }

            public FeaturesEnableRequest.Builder getEnableRequestBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (FeaturesEnableRequest.Builder) getEnableRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public FeaturesEnableRequestOrBuilder getEnableRequestOrBuilder() {
                SingleFieldBuilderV3<FeaturesEnableRequest, FeaturesEnableRequest.Builder, FeaturesEnableRequestOrBuilder> singleFieldBuilderV3 = this.enableRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FeaturesEnableRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FeaturesEnableRequest featuresEnableRequest = this.enableRequest_;
                return featuresEnableRequest == null ? FeaturesEnableRequest.getDefaultInstance() : featuresEnableRequest;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public FeaturesEnableResponse getEnableResponse() {
                SingleFieldBuilderV3<FeaturesEnableResponse, FeaturesEnableResponse.Builder, FeaturesEnableResponseOrBuilder> singleFieldBuilderV3 = this.enableResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FeaturesEnableResponse) singleFieldBuilderV3.getMessage();
                }
                FeaturesEnableResponse featuresEnableResponse = this.enableResponse_;
                return featuresEnableResponse == null ? FeaturesEnableResponse.getDefaultInstance() : featuresEnableResponse;
            }

            public FeaturesEnableResponse.Builder getEnableResponseBuilder() {
                this.bitField0_ |= 4096;
                onChanged();
                return (FeaturesEnableResponse.Builder) getEnableResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public FeaturesEnableResponseOrBuilder getEnableResponseOrBuilder() {
                SingleFieldBuilderV3<FeaturesEnableResponse, FeaturesEnableResponse.Builder, FeaturesEnableResponseOrBuilder> singleFieldBuilderV3 = this.enableResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FeaturesEnableResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FeaturesEnableResponse featuresEnableResponse = this.enableResponse_;
                return featuresEnableResponse == null ? FeaturesEnableResponse.getDefaultInstance() : featuresEnableResponse;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public StageCompletedNotification getStageCompletedNotification() {
                SingleFieldBuilderV3<StageCompletedNotification, StageCompletedNotification.Builder, StageCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.stageCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StageCompletedNotification) singleFieldBuilderV3.getMessage();
                }
                StageCompletedNotification stageCompletedNotification = this.stageCompletedNotification_;
                return stageCompletedNotification == null ? StageCompletedNotification.getDefaultInstance() : stageCompletedNotification;
            }

            public StageCompletedNotification.Builder getStageCompletedNotificationBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (StageCompletedNotification.Builder) getStageCompletedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public StageCompletedNotificationOrBuilder getStageCompletedNotificationOrBuilder() {
                SingleFieldBuilderV3<StageCompletedNotification, StageCompletedNotification.Builder, StageCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.stageCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StageCompletedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StageCompletedNotification stageCompletedNotification = this.stageCompletedNotification_;
                return stageCompletedNotification == null ? StageCompletedNotification.getDefaultInstance() : stageCompletedNotification;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public StagePausedNotification getStagePausedNotification() {
                SingleFieldBuilderV3<StagePausedNotification, StagePausedNotification.Builder, StagePausedNotificationOrBuilder> singleFieldBuilderV3 = this.stagePausedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StagePausedNotification) singleFieldBuilderV3.getMessage();
                }
                StagePausedNotification stagePausedNotification = this.stagePausedNotification_;
                return stagePausedNotification == null ? StagePausedNotification.getDefaultInstance() : stagePausedNotification;
            }

            public StagePausedNotification.Builder getStagePausedNotificationBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (StagePausedNotification.Builder) getStagePausedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public StagePausedNotificationOrBuilder getStagePausedNotificationOrBuilder() {
                SingleFieldBuilderV3<StagePausedNotification, StagePausedNotification.Builder, StagePausedNotificationOrBuilder> singleFieldBuilderV3 = this.stagePausedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StagePausedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StagePausedNotification stagePausedNotification = this.stagePausedNotification_;
                return stagePausedNotification == null ? StagePausedNotification.getDefaultInstance() : stagePausedNotification;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public StageSelectedNotification getStageSelectedNotification() {
                SingleFieldBuilderV3<StageSelectedNotification, StageSelectedNotification.Builder, StageSelectedNotificationOrBuilder> singleFieldBuilderV3 = this.stageSelectedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StageSelectedNotification) singleFieldBuilderV3.getMessage();
                }
                StageSelectedNotification stageSelectedNotification = this.stageSelectedNotification_;
                return stageSelectedNotification == null ? StageSelectedNotification.getDefaultInstance() : stageSelectedNotification;
            }

            public StageSelectedNotification.Builder getStageSelectedNotificationBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (StageSelectedNotification.Builder) getStageSelectedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public StageSelectedNotificationOrBuilder getStageSelectedNotificationOrBuilder() {
                SingleFieldBuilderV3<StageSelectedNotification, StageSelectedNotification.Builder, StageSelectedNotificationOrBuilder> singleFieldBuilderV3 = this.stageSelectedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StageSelectedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StageSelectedNotification stageSelectedNotification = this.stageSelectedNotification_;
                return stageSelectedNotification == null ? StageSelectedNotification.getDefaultInstance() : stageSelectedNotification;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public StageStartedNotification getStageStartedNotification() {
                SingleFieldBuilderV3<StageStartedNotification, StageStartedNotification.Builder, StageStartedNotificationOrBuilder> singleFieldBuilderV3 = this.stageStartedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StageStartedNotification) singleFieldBuilderV3.getMessage();
                }
                StageStartedNotification stageStartedNotification = this.stageStartedNotification_;
                return stageStartedNotification == null ? StageStartedNotification.getDefaultInstance() : stageStartedNotification;
            }

            public StageStartedNotification.Builder getStageStartedNotificationBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (StageStartedNotification.Builder) getStageStartedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public StageStartedNotificationOrBuilder getStageStartedNotificationOrBuilder() {
                SingleFieldBuilderV3<StageStartedNotification, StageStartedNotification.Builder, StageStartedNotificationOrBuilder> singleFieldBuilderV3 = this.stageStartedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StageStartedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StageStartedNotification stageStartedNotification = this.stageStartedNotification_;
                return stageStartedNotification == null ? StageStartedNotification.getDefaultInstance() : stageStartedNotification;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public TruckStopLoyaltyInfoNotification getTruckStopLoyaltyInfoNotification() {
                SingleFieldBuilderV3<TruckStopLoyaltyInfoNotification, TruckStopLoyaltyInfoNotification.Builder, TruckStopLoyaltyInfoNotificationOrBuilder> singleFieldBuilderV3 = this.truckStopLoyaltyInfoNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TruckStopLoyaltyInfoNotification) singleFieldBuilderV3.getMessage();
                }
                TruckStopLoyaltyInfoNotification truckStopLoyaltyInfoNotification = this.truckStopLoyaltyInfoNotification_;
                return truckStopLoyaltyInfoNotification == null ? TruckStopLoyaltyInfoNotification.getDefaultInstance() : truckStopLoyaltyInfoNotification;
            }

            public TruckStopLoyaltyInfoNotification.Builder getTruckStopLoyaltyInfoNotificationBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (TruckStopLoyaltyInfoNotification.Builder) getTruckStopLoyaltyInfoNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public TruckStopLoyaltyInfoNotificationOrBuilder getTruckStopLoyaltyInfoNotificationOrBuilder() {
                SingleFieldBuilderV3<TruckStopLoyaltyInfoNotification, TruckStopLoyaltyInfoNotification.Builder, TruckStopLoyaltyInfoNotificationOrBuilder> singleFieldBuilderV3 = this.truckStopLoyaltyInfoNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TruckStopLoyaltyInfoNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TruckStopLoyaltyInfoNotification truckStopLoyaltyInfoNotification = this.truckStopLoyaltyInfoNotification_;
                return truckStopLoyaltyInfoNotification == null ? TruckStopLoyaltyInfoNotification.getDefaultInstance() : truckStopLoyaltyInfoNotification;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public TruckStopLoyaltyInfoRequest getTruckStopLoyaltyInfoRequest() {
                SingleFieldBuilderV3<TruckStopLoyaltyInfoRequest, TruckStopLoyaltyInfoRequest.Builder, TruckStopLoyaltyInfoRequestOrBuilder> singleFieldBuilderV3 = this.truckStopLoyaltyInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TruckStopLoyaltyInfoRequest) singleFieldBuilderV3.getMessage();
                }
                TruckStopLoyaltyInfoRequest truckStopLoyaltyInfoRequest = this.truckStopLoyaltyInfoRequest_;
                return truckStopLoyaltyInfoRequest == null ? TruckStopLoyaltyInfoRequest.getDefaultInstance() : truckStopLoyaltyInfoRequest;
            }

            public TruckStopLoyaltyInfoRequest.Builder getTruckStopLoyaltyInfoRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (TruckStopLoyaltyInfoRequest.Builder) getTruckStopLoyaltyInfoRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public TruckStopLoyaltyInfoRequestOrBuilder getTruckStopLoyaltyInfoRequestOrBuilder() {
                SingleFieldBuilderV3<TruckStopLoyaltyInfoRequest, TruckStopLoyaltyInfoRequest.Builder, TruckStopLoyaltyInfoRequestOrBuilder> singleFieldBuilderV3 = this.truckStopLoyaltyInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TruckStopLoyaltyInfoRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TruckStopLoyaltyInfoRequest truckStopLoyaltyInfoRequest = this.truckStopLoyaltyInfoRequest_;
                return truckStopLoyaltyInfoRequest == null ? TruckStopLoyaltyInfoRequest.getDefaultInstance() : truckStopLoyaltyInfoRequest;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public TruckStopLoyaltyInfoResponse getTruckStopLoyaltyInfoResponse() {
                SingleFieldBuilderV3<TruckStopLoyaltyInfoResponse, TruckStopLoyaltyInfoResponse.Builder, TruckStopLoyaltyInfoResponseOrBuilder> singleFieldBuilderV3 = this.truckStopLoyaltyInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TruckStopLoyaltyInfoResponse) singleFieldBuilderV3.getMessage();
                }
                TruckStopLoyaltyInfoResponse truckStopLoyaltyInfoResponse = this.truckStopLoyaltyInfoResponse_;
                return truckStopLoyaltyInfoResponse == null ? TruckStopLoyaltyInfoResponse.getDefaultInstance() : truckStopLoyaltyInfoResponse;
            }

            public TruckStopLoyaltyInfoResponse.Builder getTruckStopLoyaltyInfoResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (TruckStopLoyaltyInfoResponse.Builder) getTruckStopLoyaltyInfoResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public TruckStopLoyaltyInfoResponseOrBuilder getTruckStopLoyaltyInfoResponseOrBuilder() {
                SingleFieldBuilderV3<TruckStopLoyaltyInfoResponse, TruckStopLoyaltyInfoResponse.Builder, TruckStopLoyaltyInfoResponseOrBuilder> singleFieldBuilderV3 = this.truckStopLoyaltyInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TruckStopLoyaltyInfoResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TruckStopLoyaltyInfoResponse truckStopLoyaltyInfoResponse = this.truckStopLoyaltyInfoResponse_;
                return truckStopLoyaltyInfoResponse == null ? TruckStopLoyaltyInfoResponse.getDefaultInstance() : truckStopLoyaltyInfoResponse;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public WellnessSuggestionRequest getWellnessSuggestionRequest() {
                SingleFieldBuilderV3<WellnessSuggestionRequest, WellnessSuggestionRequest.Builder, WellnessSuggestionRequestOrBuilder> singleFieldBuilderV3 = this.wellnessSuggestionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WellnessSuggestionRequest) singleFieldBuilderV3.getMessage();
                }
                WellnessSuggestionRequest wellnessSuggestionRequest = this.wellnessSuggestionRequest_;
                return wellnessSuggestionRequest == null ? WellnessSuggestionRequest.getDefaultInstance() : wellnessSuggestionRequest;
            }

            public WellnessSuggestionRequest.Builder getWellnessSuggestionRequestBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (WellnessSuggestionRequest.Builder) getWellnessSuggestionRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public WellnessSuggestionRequestOrBuilder getWellnessSuggestionRequestOrBuilder() {
                SingleFieldBuilderV3<WellnessSuggestionRequest, WellnessSuggestionRequest.Builder, WellnessSuggestionRequestOrBuilder> singleFieldBuilderV3 = this.wellnessSuggestionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WellnessSuggestionRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WellnessSuggestionRequest wellnessSuggestionRequest = this.wellnessSuggestionRequest_;
                return wellnessSuggestionRequest == null ? WellnessSuggestionRequest.getDefaultInstance() : wellnessSuggestionRequest;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public WellnessSuggestionResponse getWellnessSuggestionResponse() {
                SingleFieldBuilderV3<WellnessSuggestionResponse, WellnessSuggestionResponse.Builder, WellnessSuggestionResponseOrBuilder> singleFieldBuilderV3 = this.wellnessSuggestionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WellnessSuggestionResponse) singleFieldBuilderV3.getMessage();
                }
                WellnessSuggestionResponse wellnessSuggestionResponse = this.wellnessSuggestionResponse_;
                return wellnessSuggestionResponse == null ? WellnessSuggestionResponse.getDefaultInstance() : wellnessSuggestionResponse;
            }

            public WellnessSuggestionResponse.Builder getWellnessSuggestionResponseBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (WellnessSuggestionResponse.Builder) getWellnessSuggestionResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public WellnessSuggestionResponseOrBuilder getWellnessSuggestionResponseOrBuilder() {
                SingleFieldBuilderV3<WellnessSuggestionResponse, WellnessSuggestionResponse.Builder, WellnessSuggestionResponseOrBuilder> singleFieldBuilderV3 = this.wellnessSuggestionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WellnessSuggestionResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WellnessSuggestionResponse wellnessSuggestionResponse = this.wellnessSuggestionResponse_;
                return wellnessSuggestionResponse == null ? WellnessSuggestionResponse.getDefaultInstance() : wellnessSuggestionResponse;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public WorkoutCanceledNotification getWorkoutCanceledNotification() {
                SingleFieldBuilderV3<WorkoutCanceledNotification, WorkoutCanceledNotification.Builder, WorkoutCanceledNotificationOrBuilder> singleFieldBuilderV3 = this.workoutCanceledNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WorkoutCanceledNotification) singleFieldBuilderV3.getMessage();
                }
                WorkoutCanceledNotification workoutCanceledNotification = this.workoutCanceledNotification_;
                return workoutCanceledNotification == null ? WorkoutCanceledNotification.getDefaultInstance() : workoutCanceledNotification;
            }

            public WorkoutCanceledNotification.Builder getWorkoutCanceledNotificationBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (WorkoutCanceledNotification.Builder) getWorkoutCanceledNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public WorkoutCanceledNotificationOrBuilder getWorkoutCanceledNotificationOrBuilder() {
                SingleFieldBuilderV3<WorkoutCanceledNotification, WorkoutCanceledNotification.Builder, WorkoutCanceledNotificationOrBuilder> singleFieldBuilderV3 = this.workoutCanceledNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WorkoutCanceledNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WorkoutCanceledNotification workoutCanceledNotification = this.workoutCanceledNotification_;
                return workoutCanceledNotification == null ? WorkoutCanceledNotification.getDefaultInstance() : workoutCanceledNotification;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public WorkoutSelectedNotification getWorkoutSelectedNotification() {
                SingleFieldBuilderV3<WorkoutSelectedNotification, WorkoutSelectedNotification.Builder, WorkoutSelectedNotificationOrBuilder> singleFieldBuilderV3 = this.workoutSelectedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WorkoutSelectedNotification) singleFieldBuilderV3.getMessage();
                }
                WorkoutSelectedNotification workoutSelectedNotification = this.workoutSelectedNotification_;
                return workoutSelectedNotification == null ? WorkoutSelectedNotification.getDefaultInstance() : workoutSelectedNotification;
            }

            public WorkoutSelectedNotification.Builder getWorkoutSelectedNotificationBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (WorkoutSelectedNotification.Builder) getWorkoutSelectedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public WorkoutSelectedNotificationOrBuilder getWorkoutSelectedNotificationOrBuilder() {
                SingleFieldBuilderV3<WorkoutSelectedNotification, WorkoutSelectedNotification.Builder, WorkoutSelectedNotificationOrBuilder> singleFieldBuilderV3 = this.workoutSelectedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WorkoutSelectedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WorkoutSelectedNotification workoutSelectedNotification = this.workoutSelectedNotification_;
                return workoutSelectedNotification == null ? WorkoutSelectedNotification.getDefaultInstance() : workoutSelectedNotification;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public boolean hasEnableRequest() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public boolean hasEnableResponse() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public boolean hasStageCompletedNotification() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public boolean hasStagePausedNotification() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public boolean hasStageSelectedNotification() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public boolean hasStageStartedNotification() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public boolean hasTruckStopLoyaltyInfoNotification() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public boolean hasTruckStopLoyaltyInfoRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public boolean hasTruckStopLoyaltyInfoResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public boolean hasWellnessSuggestionRequest() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public boolean hasWellnessSuggestionResponse() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public boolean hasWorkoutCanceledNotification() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DezlServiceOrBuilder
            public boolean hasWorkoutSelectedNotification() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_DezlService_fieldAccessorTable.ensureFieldAccessorsInitialized(DezlService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeEnableRequest(FeaturesEnableRequest featuresEnableRequest) {
                FeaturesEnableRequest featuresEnableRequest2;
                SingleFieldBuilderV3<FeaturesEnableRequest, FeaturesEnableRequest.Builder, FeaturesEnableRequestOrBuilder> singleFieldBuilderV3 = this.enableRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(featuresEnableRequest);
                } else if ((this.bitField0_ & 2048) == 0 || (featuresEnableRequest2 = this.enableRequest_) == null || featuresEnableRequest2 == FeaturesEnableRequest.getDefaultInstance()) {
                    this.enableRequest_ = featuresEnableRequest;
                } else {
                    getEnableRequestBuilder().mergeFrom(featuresEnableRequest);
                }
                if (this.enableRequest_ != null) {
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                return this;
            }

            public Builder mergeEnableResponse(FeaturesEnableResponse featuresEnableResponse) {
                FeaturesEnableResponse featuresEnableResponse2;
                SingleFieldBuilderV3<FeaturesEnableResponse, FeaturesEnableResponse.Builder, FeaturesEnableResponseOrBuilder> singleFieldBuilderV3 = this.enableResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(featuresEnableResponse);
                } else if ((this.bitField0_ & 4096) == 0 || (featuresEnableResponse2 = this.enableResponse_) == null || featuresEnableResponse2 == FeaturesEnableResponse.getDefaultInstance()) {
                    this.enableResponse_ = featuresEnableResponse;
                } else {
                    getEnableResponseBuilder().mergeFrom(featuresEnableResponse);
                }
                if (this.enableResponse_ != null) {
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
                                    codedInputStream.readMessage(getTruckStopLoyaltyInfoRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getTruckStopLoyaltyInfoResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getTruckStopLoyaltyInfoNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getWellnessSuggestionRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getWellnessSuggestionResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getWorkoutSelectedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getStageSelectedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getStageStartedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getStageCompletedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getStagePausedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getWorkoutCanceledNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 98:
                                    codedInputStream.readMessage(getEnableRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 106:
                                    codedInputStream.readMessage(getEnableResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeStageCompletedNotification(StageCompletedNotification stageCompletedNotification) {
                StageCompletedNotification stageCompletedNotification2;
                SingleFieldBuilderV3<StageCompletedNotification, StageCompletedNotification.Builder, StageCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.stageCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stageCompletedNotification);
                } else if ((this.bitField0_ & 256) == 0 || (stageCompletedNotification2 = this.stageCompletedNotification_) == null || stageCompletedNotification2 == StageCompletedNotification.getDefaultInstance()) {
                    this.stageCompletedNotification_ = stageCompletedNotification;
                } else {
                    getStageCompletedNotificationBuilder().mergeFrom(stageCompletedNotification);
                }
                if (this.stageCompletedNotification_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStagePausedNotification(StagePausedNotification stagePausedNotification) {
                StagePausedNotification stagePausedNotification2;
                SingleFieldBuilderV3<StagePausedNotification, StagePausedNotification.Builder, StagePausedNotificationOrBuilder> singleFieldBuilderV3 = this.stagePausedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stagePausedNotification);
                } else if ((this.bitField0_ & 512) == 0 || (stagePausedNotification2 = this.stagePausedNotification_) == null || stagePausedNotification2 == StagePausedNotification.getDefaultInstance()) {
                    this.stagePausedNotification_ = stagePausedNotification;
                } else {
                    getStagePausedNotificationBuilder().mergeFrom(stagePausedNotification);
                }
                if (this.stagePausedNotification_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStageSelectedNotification(StageSelectedNotification stageSelectedNotification) {
                StageSelectedNotification stageSelectedNotification2;
                SingleFieldBuilderV3<StageSelectedNotification, StageSelectedNotification.Builder, StageSelectedNotificationOrBuilder> singleFieldBuilderV3 = this.stageSelectedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stageSelectedNotification);
                } else if ((this.bitField0_ & 64) == 0 || (stageSelectedNotification2 = this.stageSelectedNotification_) == null || stageSelectedNotification2 == StageSelectedNotification.getDefaultInstance()) {
                    this.stageSelectedNotification_ = stageSelectedNotification;
                } else {
                    getStageSelectedNotificationBuilder().mergeFrom(stageSelectedNotification);
                }
                if (this.stageSelectedNotification_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStageStartedNotification(StageStartedNotification stageStartedNotification) {
                StageStartedNotification stageStartedNotification2;
                SingleFieldBuilderV3<StageStartedNotification, StageStartedNotification.Builder, StageStartedNotificationOrBuilder> singleFieldBuilderV3 = this.stageStartedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(stageStartedNotification);
                } else if ((this.bitField0_ & 128) == 0 || (stageStartedNotification2 = this.stageStartedNotification_) == null || stageStartedNotification2 == StageStartedNotification.getDefaultInstance()) {
                    this.stageStartedNotification_ = stageStartedNotification;
                } else {
                    getStageStartedNotificationBuilder().mergeFrom(stageStartedNotification);
                }
                if (this.stageStartedNotification_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTruckStopLoyaltyInfoNotification(TruckStopLoyaltyInfoNotification truckStopLoyaltyInfoNotification) {
                TruckStopLoyaltyInfoNotification truckStopLoyaltyInfoNotification2;
                SingleFieldBuilderV3<TruckStopLoyaltyInfoNotification, TruckStopLoyaltyInfoNotification.Builder, TruckStopLoyaltyInfoNotificationOrBuilder> singleFieldBuilderV3 = this.truckStopLoyaltyInfoNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(truckStopLoyaltyInfoNotification);
                } else if ((this.bitField0_ & 4) == 0 || (truckStopLoyaltyInfoNotification2 = this.truckStopLoyaltyInfoNotification_) == null || truckStopLoyaltyInfoNotification2 == TruckStopLoyaltyInfoNotification.getDefaultInstance()) {
                    this.truckStopLoyaltyInfoNotification_ = truckStopLoyaltyInfoNotification;
                } else {
                    getTruckStopLoyaltyInfoNotificationBuilder().mergeFrom(truckStopLoyaltyInfoNotification);
                }
                if (this.truckStopLoyaltyInfoNotification_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTruckStopLoyaltyInfoRequest(TruckStopLoyaltyInfoRequest truckStopLoyaltyInfoRequest) {
                TruckStopLoyaltyInfoRequest truckStopLoyaltyInfoRequest2;
                SingleFieldBuilderV3<TruckStopLoyaltyInfoRequest, TruckStopLoyaltyInfoRequest.Builder, TruckStopLoyaltyInfoRequestOrBuilder> singleFieldBuilderV3 = this.truckStopLoyaltyInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(truckStopLoyaltyInfoRequest);
                } else if ((this.bitField0_ & 1) == 0 || (truckStopLoyaltyInfoRequest2 = this.truckStopLoyaltyInfoRequest_) == null || truckStopLoyaltyInfoRequest2 == TruckStopLoyaltyInfoRequest.getDefaultInstance()) {
                    this.truckStopLoyaltyInfoRequest_ = truckStopLoyaltyInfoRequest;
                } else {
                    getTruckStopLoyaltyInfoRequestBuilder().mergeFrom(truckStopLoyaltyInfoRequest);
                }
                if (this.truckStopLoyaltyInfoRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTruckStopLoyaltyInfoResponse(TruckStopLoyaltyInfoResponse truckStopLoyaltyInfoResponse) {
                TruckStopLoyaltyInfoResponse truckStopLoyaltyInfoResponse2;
                SingleFieldBuilderV3<TruckStopLoyaltyInfoResponse, TruckStopLoyaltyInfoResponse.Builder, TruckStopLoyaltyInfoResponseOrBuilder> singleFieldBuilderV3 = this.truckStopLoyaltyInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(truckStopLoyaltyInfoResponse);
                } else if ((this.bitField0_ & 2) == 0 || (truckStopLoyaltyInfoResponse2 = this.truckStopLoyaltyInfoResponse_) == null || truckStopLoyaltyInfoResponse2 == TruckStopLoyaltyInfoResponse.getDefaultInstance()) {
                    this.truckStopLoyaltyInfoResponse_ = truckStopLoyaltyInfoResponse;
                } else {
                    getTruckStopLoyaltyInfoResponseBuilder().mergeFrom(truckStopLoyaltyInfoResponse);
                }
                if (this.truckStopLoyaltyInfoResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder mergeWellnessSuggestionRequest(WellnessSuggestionRequest wellnessSuggestionRequest) {
                WellnessSuggestionRequest wellnessSuggestionRequest2;
                SingleFieldBuilderV3<WellnessSuggestionRequest, WellnessSuggestionRequest.Builder, WellnessSuggestionRequestOrBuilder> singleFieldBuilderV3 = this.wellnessSuggestionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(wellnessSuggestionRequest);
                } else if ((this.bitField0_ & 8) == 0 || (wellnessSuggestionRequest2 = this.wellnessSuggestionRequest_) == null || wellnessSuggestionRequest2 == WellnessSuggestionRequest.getDefaultInstance()) {
                    this.wellnessSuggestionRequest_ = wellnessSuggestionRequest;
                } else {
                    getWellnessSuggestionRequestBuilder().mergeFrom(wellnessSuggestionRequest);
                }
                if (this.wellnessSuggestionRequest_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeWellnessSuggestionResponse(WellnessSuggestionResponse wellnessSuggestionResponse) {
                WellnessSuggestionResponse wellnessSuggestionResponse2;
                SingleFieldBuilderV3<WellnessSuggestionResponse, WellnessSuggestionResponse.Builder, WellnessSuggestionResponseOrBuilder> singleFieldBuilderV3 = this.wellnessSuggestionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(wellnessSuggestionResponse);
                } else if ((this.bitField0_ & 16) == 0 || (wellnessSuggestionResponse2 = this.wellnessSuggestionResponse_) == null || wellnessSuggestionResponse2 == WellnessSuggestionResponse.getDefaultInstance()) {
                    this.wellnessSuggestionResponse_ = wellnessSuggestionResponse;
                } else {
                    getWellnessSuggestionResponseBuilder().mergeFrom(wellnessSuggestionResponse);
                }
                if (this.wellnessSuggestionResponse_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeWorkoutCanceledNotification(WorkoutCanceledNotification workoutCanceledNotification) {
                WorkoutCanceledNotification workoutCanceledNotification2;
                SingleFieldBuilderV3<WorkoutCanceledNotification, WorkoutCanceledNotification.Builder, WorkoutCanceledNotificationOrBuilder> singleFieldBuilderV3 = this.workoutCanceledNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(workoutCanceledNotification);
                } else if ((this.bitField0_ & 1024) == 0 || (workoutCanceledNotification2 = this.workoutCanceledNotification_) == null || workoutCanceledNotification2 == WorkoutCanceledNotification.getDefaultInstance()) {
                    this.workoutCanceledNotification_ = workoutCanceledNotification;
                } else {
                    getWorkoutCanceledNotificationBuilder().mergeFrom(workoutCanceledNotification);
                }
                if (this.workoutCanceledNotification_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeWorkoutSelectedNotification(WorkoutSelectedNotification workoutSelectedNotification) {
                WorkoutSelectedNotification workoutSelectedNotification2;
                SingleFieldBuilderV3<WorkoutSelectedNotification, WorkoutSelectedNotification.Builder, WorkoutSelectedNotificationOrBuilder> singleFieldBuilderV3 = this.workoutSelectedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(workoutSelectedNotification);
                } else if ((this.bitField0_ & 32) == 0 || (workoutSelectedNotification2 = this.workoutSelectedNotification_) == null || workoutSelectedNotification2 == WorkoutSelectedNotification.getDefaultInstance()) {
                    this.workoutSelectedNotification_ = workoutSelectedNotification;
                } else {
                    getWorkoutSelectedNotificationBuilder().mergeFrom(workoutSelectedNotification);
                }
                if (this.workoutSelectedNotification_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder setEnableRequest(FeaturesEnableRequest.Builder builder) {
                SingleFieldBuilderV3<FeaturesEnableRequest, FeaturesEnableRequest.Builder, FeaturesEnableRequestOrBuilder> singleFieldBuilderV3 = this.enableRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.enableRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setEnableResponse(FeaturesEnableResponse.Builder builder) {
                SingleFieldBuilderV3<FeaturesEnableResponse, FeaturesEnableResponse.Builder, FeaturesEnableResponseOrBuilder> singleFieldBuilderV3 = this.enableResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.enableResponse_ = builder.build();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStageCompletedNotification(StageCompletedNotification.Builder builder) {
                SingleFieldBuilderV3<StageCompletedNotification, StageCompletedNotification.Builder, StageCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.stageCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.stageCompletedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setStagePausedNotification(StagePausedNotification.Builder builder) {
                SingleFieldBuilderV3<StagePausedNotification, StagePausedNotification.Builder, StagePausedNotificationOrBuilder> singleFieldBuilderV3 = this.stagePausedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.stagePausedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setStageSelectedNotification(StageSelectedNotification.Builder builder) {
                SingleFieldBuilderV3<StageSelectedNotification, StageSelectedNotification.Builder, StageSelectedNotificationOrBuilder> singleFieldBuilderV3 = this.stageSelectedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.stageSelectedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setStageStartedNotification(StageStartedNotification.Builder builder) {
                SingleFieldBuilderV3<StageStartedNotification, StageStartedNotification.Builder, StageStartedNotificationOrBuilder> singleFieldBuilderV3 = this.stageStartedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.stageStartedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setTruckStopLoyaltyInfoNotification(TruckStopLoyaltyInfoNotification.Builder builder) {
                SingleFieldBuilderV3<TruckStopLoyaltyInfoNotification, TruckStopLoyaltyInfoNotification.Builder, TruckStopLoyaltyInfoNotificationOrBuilder> singleFieldBuilderV3 = this.truckStopLoyaltyInfoNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.truckStopLoyaltyInfoNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTruckStopLoyaltyInfoRequest(TruckStopLoyaltyInfoRequest.Builder builder) {
                SingleFieldBuilderV3<TruckStopLoyaltyInfoRequest, TruckStopLoyaltyInfoRequest.Builder, TruckStopLoyaltyInfoRequestOrBuilder> singleFieldBuilderV3 = this.truckStopLoyaltyInfoRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.truckStopLoyaltyInfoRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTruckStopLoyaltyInfoResponse(TruckStopLoyaltyInfoResponse.Builder builder) {
                SingleFieldBuilderV3<TruckStopLoyaltyInfoResponse, TruckStopLoyaltyInfoResponse.Builder, TruckStopLoyaltyInfoResponseOrBuilder> singleFieldBuilderV3 = this.truckStopLoyaltyInfoResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.truckStopLoyaltyInfoResponse_ = builder.build();
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

            public Builder setWellnessSuggestionRequest(WellnessSuggestionRequest.Builder builder) {
                SingleFieldBuilderV3<WellnessSuggestionRequest, WellnessSuggestionRequest.Builder, WellnessSuggestionRequestOrBuilder> singleFieldBuilderV3 = this.wellnessSuggestionRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.wellnessSuggestionRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setWellnessSuggestionResponse(WellnessSuggestionResponse.Builder builder) {
                SingleFieldBuilderV3<WellnessSuggestionResponse, WellnessSuggestionResponse.Builder, WellnessSuggestionResponseOrBuilder> singleFieldBuilderV3 = this.wellnessSuggestionResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.wellnessSuggestionResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setWorkoutCanceledNotification(WorkoutCanceledNotification.Builder builder) {
                SingleFieldBuilderV3<WorkoutCanceledNotification, WorkoutCanceledNotification.Builder, WorkoutCanceledNotificationOrBuilder> singleFieldBuilderV3 = this.workoutCanceledNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.workoutCanceledNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setWorkoutSelectedNotification(WorkoutSelectedNotification.Builder builder) {
                SingleFieldBuilderV3<WorkoutSelectedNotification, WorkoutSelectedNotification.Builder, WorkoutSelectedNotificationOrBuilder> singleFieldBuilderV3 = this.workoutSelectedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.workoutSelectedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DezlService getDefaultInstanceForType() {
                return DezlService.getDefaultInstance();
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

            public Builder setEnableRequest(FeaturesEnableRequest featuresEnableRequest) {
                SingleFieldBuilderV3<FeaturesEnableRequest, FeaturesEnableRequest.Builder, FeaturesEnableRequestOrBuilder> singleFieldBuilderV3 = this.enableRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    featuresEnableRequest.getClass();
                    this.enableRequest_ = featuresEnableRequest;
                } else {
                    singleFieldBuilderV3.setMessage(featuresEnableRequest);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setEnableResponse(FeaturesEnableResponse featuresEnableResponse) {
                SingleFieldBuilderV3<FeaturesEnableResponse, FeaturesEnableResponse.Builder, FeaturesEnableResponseOrBuilder> singleFieldBuilderV3 = this.enableResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    featuresEnableResponse.getClass();
                    this.enableResponse_ = featuresEnableResponse;
                } else {
                    singleFieldBuilderV3.setMessage(featuresEnableResponse);
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setStageCompletedNotification(StageCompletedNotification stageCompletedNotification) {
                SingleFieldBuilderV3<StageCompletedNotification, StageCompletedNotification.Builder, StageCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.stageCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stageCompletedNotification.getClass();
                    this.stageCompletedNotification_ = stageCompletedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(stageCompletedNotification);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setStagePausedNotification(StagePausedNotification stagePausedNotification) {
                SingleFieldBuilderV3<StagePausedNotification, StagePausedNotification.Builder, StagePausedNotificationOrBuilder> singleFieldBuilderV3 = this.stagePausedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stagePausedNotification.getClass();
                    this.stagePausedNotification_ = stagePausedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(stagePausedNotification);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setStageSelectedNotification(StageSelectedNotification stageSelectedNotification) {
                SingleFieldBuilderV3<StageSelectedNotification, StageSelectedNotification.Builder, StageSelectedNotificationOrBuilder> singleFieldBuilderV3 = this.stageSelectedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stageSelectedNotification.getClass();
                    this.stageSelectedNotification_ = stageSelectedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(stageSelectedNotification);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setStageStartedNotification(StageStartedNotification stageStartedNotification) {
                SingleFieldBuilderV3<StageStartedNotification, StageStartedNotification.Builder, StageStartedNotificationOrBuilder> singleFieldBuilderV3 = this.stageStartedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    stageStartedNotification.getClass();
                    this.stageStartedNotification_ = stageStartedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(stageStartedNotification);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setTruckStopLoyaltyInfoNotification(TruckStopLoyaltyInfoNotification truckStopLoyaltyInfoNotification) {
                SingleFieldBuilderV3<TruckStopLoyaltyInfoNotification, TruckStopLoyaltyInfoNotification.Builder, TruckStopLoyaltyInfoNotificationOrBuilder> singleFieldBuilderV3 = this.truckStopLoyaltyInfoNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    truckStopLoyaltyInfoNotification.getClass();
                    this.truckStopLoyaltyInfoNotification_ = truckStopLoyaltyInfoNotification;
                } else {
                    singleFieldBuilderV3.setMessage(truckStopLoyaltyInfoNotification);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTruckStopLoyaltyInfoRequest(TruckStopLoyaltyInfoRequest truckStopLoyaltyInfoRequest) {
                SingleFieldBuilderV3<TruckStopLoyaltyInfoRequest, TruckStopLoyaltyInfoRequest.Builder, TruckStopLoyaltyInfoRequestOrBuilder> singleFieldBuilderV3 = this.truckStopLoyaltyInfoRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    truckStopLoyaltyInfoRequest.getClass();
                    this.truckStopLoyaltyInfoRequest_ = truckStopLoyaltyInfoRequest;
                } else {
                    singleFieldBuilderV3.setMessage(truckStopLoyaltyInfoRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTruckStopLoyaltyInfoResponse(TruckStopLoyaltyInfoResponse truckStopLoyaltyInfoResponse) {
                SingleFieldBuilderV3<TruckStopLoyaltyInfoResponse, TruckStopLoyaltyInfoResponse.Builder, TruckStopLoyaltyInfoResponseOrBuilder> singleFieldBuilderV3 = this.truckStopLoyaltyInfoResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    truckStopLoyaltyInfoResponse.getClass();
                    this.truckStopLoyaltyInfoResponse_ = truckStopLoyaltyInfoResponse;
                } else {
                    singleFieldBuilderV3.setMessage(truckStopLoyaltyInfoResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setWellnessSuggestionRequest(WellnessSuggestionRequest wellnessSuggestionRequest) {
                SingleFieldBuilderV3<WellnessSuggestionRequest, WellnessSuggestionRequest.Builder, WellnessSuggestionRequestOrBuilder> singleFieldBuilderV3 = this.wellnessSuggestionRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    wellnessSuggestionRequest.getClass();
                    this.wellnessSuggestionRequest_ = wellnessSuggestionRequest;
                } else {
                    singleFieldBuilderV3.setMessage(wellnessSuggestionRequest);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setWellnessSuggestionResponse(WellnessSuggestionResponse wellnessSuggestionResponse) {
                SingleFieldBuilderV3<WellnessSuggestionResponse, WellnessSuggestionResponse.Builder, WellnessSuggestionResponseOrBuilder> singleFieldBuilderV3 = this.wellnessSuggestionResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    wellnessSuggestionResponse.getClass();
                    this.wellnessSuggestionResponse_ = wellnessSuggestionResponse;
                } else {
                    singleFieldBuilderV3.setMessage(wellnessSuggestionResponse);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setWorkoutCanceledNotification(WorkoutCanceledNotification workoutCanceledNotification) {
                SingleFieldBuilderV3<WorkoutCanceledNotification, WorkoutCanceledNotification.Builder, WorkoutCanceledNotificationOrBuilder> singleFieldBuilderV3 = this.workoutCanceledNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    workoutCanceledNotification.getClass();
                    this.workoutCanceledNotification_ = workoutCanceledNotification;
                } else {
                    singleFieldBuilderV3.setMessage(workoutCanceledNotification);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setWorkoutSelectedNotification(WorkoutSelectedNotification workoutSelectedNotification) {
                SingleFieldBuilderV3<WorkoutSelectedNotification, WorkoutSelectedNotification.Builder, WorkoutSelectedNotificationOrBuilder> singleFieldBuilderV3 = this.workoutSelectedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    workoutSelectedNotification.getClass();
                    this.workoutSelectedNotification_ = workoutSelectedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(workoutSelectedNotification);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DezlService) {
                    return mergeFrom((DezlService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DezlService dezlService) {
                if (dezlService == DezlService.getDefaultInstance()) {
                    return this;
                }
                if (dezlService.hasTruckStopLoyaltyInfoRequest()) {
                    mergeTruckStopLoyaltyInfoRequest(dezlService.getTruckStopLoyaltyInfoRequest());
                }
                if (dezlService.hasTruckStopLoyaltyInfoResponse()) {
                    mergeTruckStopLoyaltyInfoResponse(dezlService.getTruckStopLoyaltyInfoResponse());
                }
                if (dezlService.hasTruckStopLoyaltyInfoNotification()) {
                    mergeTruckStopLoyaltyInfoNotification(dezlService.getTruckStopLoyaltyInfoNotification());
                }
                if (dezlService.hasWellnessSuggestionRequest()) {
                    mergeWellnessSuggestionRequest(dezlService.getWellnessSuggestionRequest());
                }
                if (dezlService.hasWellnessSuggestionResponse()) {
                    mergeWellnessSuggestionResponse(dezlService.getWellnessSuggestionResponse());
                }
                if (dezlService.hasWorkoutSelectedNotification()) {
                    mergeWorkoutSelectedNotification(dezlService.getWorkoutSelectedNotification());
                }
                if (dezlService.hasStageSelectedNotification()) {
                    mergeStageSelectedNotification(dezlService.getStageSelectedNotification());
                }
                if (dezlService.hasStageStartedNotification()) {
                    mergeStageStartedNotification(dezlService.getStageStartedNotification());
                }
                if (dezlService.hasStageCompletedNotification()) {
                    mergeStageCompletedNotification(dezlService.getStageCompletedNotification());
                }
                if (dezlService.hasStagePausedNotification()) {
                    mergeStagePausedNotification(dezlService.getStagePausedNotification());
                }
                if (dezlService.hasWorkoutCanceledNotification()) {
                    mergeWorkoutCanceledNotification(dezlService.getWorkoutCanceledNotification());
                }
                if (dezlService.hasEnableRequest()) {
                    mergeEnableRequest(dezlService.getEnableRequest());
                }
                if (dezlService.hasEnableResponse()) {
                    mergeEnableResponse(dezlService.getEnableResponse());
                }
                mergeUnknownFields(dezlService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DezlService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DezlService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DezlService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DezlService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DezlService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DezlService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DezlService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DezlService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DezlService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DezlService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DezlService parseFrom(InputStream inputStream) {
            return (DezlService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DezlService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DezlService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DezlService parseFrom(CodedInputStream codedInputStream) {
            return (DezlService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DezlService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DezlService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DrivingStateChangedNotification extends GeneratedMessageV3 implements DrivingStateChangedNotificationOrBuilder {
        public static final int DRIVING_STATE_CHANGED_FIELD_NUMBER = 1004;
        public static final int DRIVING_STATE_FIELD_NUMBER = 1;
        public static final int SOURCE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int drivingState_;
        private byte memoizedIsInitialized;
        private int source_;
        private static final DrivingStateChangedNotification DEFAULT_INSTANCE = new DrivingStateChangedNotification();

        @Deprecated
        public static final Parser<DrivingStateChangedNotification> PARSER = new AbstractParser<DrivingStateChangedNotification>() { // from class: com.garmin.proto.generated.GDIDezlProto.DrivingStateChangedNotification.1
            @Override // com.google.protobuf.Parser
            public DrivingStateChangedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DrivingStateChangedNotification.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, DrivingStateChangedNotification> drivingStateChanged = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, DrivingStateChangedNotification.class, getDefaultInstance());

        private DrivingStateChangedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.drivingState_ = 0;
            this.source_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DrivingStateChangedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_DrivingStateChangedNotification_descriptor;
        }

        public static Builder newBuilder(DrivingStateChangedNotification drivingStateChangedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(drivingStateChangedNotification);
        }

        public static DrivingStateChangedNotification parseDelimitedFrom(InputStream inputStream) {
            return (DrivingStateChangedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DrivingStateChangedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DrivingStateChangedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DrivingStateChangedNotification)) {
                return super.equals(obj);
            }
            DrivingStateChangedNotification drivingStateChangedNotification = (DrivingStateChangedNotification) obj;
            if (hasDrivingState() != drivingStateChangedNotification.hasDrivingState()) {
                return false;
            }
            if ((!hasDrivingState() || this.drivingState_ == drivingStateChangedNotification.drivingState_) && hasSource() == drivingStateChangedNotification.hasSource()) {
                return (!hasSource() || this.source_ == drivingStateChangedNotification.source_) && getUnknownFields().equals(drivingStateChangedNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DrivingStateChangedNotificationOrBuilder
        public DrivingState getDrivingState() {
            DrivingState drivingStateForNumber = DrivingState.forNumber(this.drivingState_);
            return drivingStateForNumber == null ? DrivingState.UNKNOWN : drivingStateForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DrivingStateChangedNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.drivingState_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.source_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DrivingStateChangedNotificationOrBuilder
        public Source getSource() {
            Source sourceForNumber = Source.forNumber(this.source_);
            return sourceForNumber == null ? Source.UNKNOWN_SOURCE : sourceForNumber;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DrivingStateChangedNotificationOrBuilder
        public boolean hasDrivingState() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.DrivingStateChangedNotificationOrBuilder
        public boolean hasSource() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDrivingState()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.drivingState_;
            }
            if (hasSource()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.source_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_DrivingStateChangedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(DrivingStateChangedNotification.class, Builder.class);
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
            return new DrivingStateChangedNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.drivingState_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.source_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DrivingStateChangedNotificationOrBuilder {
            private int bitField0_;
            private int drivingState_;
            private int source_;

            private Builder() {
                this.drivingState_ = 0;
                this.source_ = 0;
            }

            private void buildPartial0(DrivingStateChangedNotification drivingStateChangedNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    drivingStateChangedNotification.drivingState_ = this.drivingState_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    drivingStateChangedNotification.source_ = this.source_;
                    i14 |= 2;
                }
                drivingStateChangedNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_DrivingStateChangedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DrivingStateChangedNotification build() {
                DrivingStateChangedNotification drivingStateChangedNotificationBuildPartial = buildPartial();
                if (drivingStateChangedNotificationBuildPartial.isInitialized()) {
                    return drivingStateChangedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) drivingStateChangedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DrivingStateChangedNotification buildPartial() {
                DrivingStateChangedNotification drivingStateChangedNotification = new DrivingStateChangedNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(drivingStateChangedNotification);
                }
                onBuilt();
                return drivingStateChangedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.drivingState_ = 0;
                this.source_ = 0;
                return this;
            }

            public Builder clearDrivingState() {
                this.bitField0_ &= -2;
                this.drivingState_ = 0;
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

            public Builder clearSource() {
                this.bitField0_ &= -3;
                this.source_ = 0;
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
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_DrivingStateChangedNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DrivingStateChangedNotificationOrBuilder
            public DrivingState getDrivingState() {
                DrivingState drivingStateForNumber = DrivingState.forNumber(this.drivingState_);
                return drivingStateForNumber == null ? DrivingState.UNKNOWN : drivingStateForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DrivingStateChangedNotificationOrBuilder
            public Source getSource() {
                Source sourceForNumber = Source.forNumber(this.source_);
                return sourceForNumber == null ? Source.UNKNOWN_SOURCE : sourceForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DrivingStateChangedNotificationOrBuilder
            public boolean hasDrivingState() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.DrivingStateChangedNotificationOrBuilder
            public boolean hasSource() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_DrivingStateChangedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(DrivingStateChangedNotification.class, Builder.class);
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
                                    if (DrivingState.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.drivingState_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    int i15 = codedInputStream.readEnum();
                                    if (Source.forNumber(i15) == null) {
                                        mergeUnknownVarintField(2, i15);
                                    } else {
                                        this.source_ = i15;
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

            public Builder setDrivingState(DrivingState drivingState) {
                drivingState.getClass();
                this.bitField0_ |= 1;
                this.drivingState_ = drivingState.getNumber();
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

            public Builder setSource(Source source) {
                source.getClass();
                this.bitField0_ |= 2;
                this.source_ = source.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DrivingStateChangedNotification getDefaultInstanceForType() {
                return DrivingStateChangedNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.drivingState_ = 0;
                this.source_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DrivingStateChangedNotification) {
                    return mergeFrom((DrivingStateChangedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DrivingStateChangedNotification drivingStateChangedNotification) {
                if (drivingStateChangedNotification == DrivingStateChangedNotification.getDefaultInstance()) {
                    return this;
                }
                if (drivingStateChangedNotification.hasDrivingState()) {
                    setDrivingState(drivingStateChangedNotification.getDrivingState());
                }
                if (drivingStateChangedNotification.hasSource()) {
                    setSource(drivingStateChangedNotification.getSource());
                }
                mergeUnknownFields(drivingStateChangedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DrivingStateChangedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DrivingStateChangedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DrivingStateChangedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DrivingStateChangedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DrivingStateChangedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DrivingStateChangedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ DrivingStateChangedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DrivingStateChangedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private DrivingStateChangedNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.drivingState_ = 0;
            this.source_ = 0;
        }

        public static DrivingStateChangedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DrivingStateChangedNotification parseFrom(InputStream inputStream) {
            return (DrivingStateChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DrivingStateChangedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DrivingStateChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DrivingStateChangedNotification parseFrom(CodedInputStream codedInputStream) {
            return (DrivingStateChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DrivingStateChangedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DrivingStateChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum DrivingState implements ProtocolMessageEnum {
            UNKNOWN(0),
            STARTED(1),
            STOPPED(2);

            public static final int STARTED_VALUE = 1;
            public static final int STOPPED_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<DrivingState> internalValueMap = new Internal.EnumLiteMap<DrivingState>() { // from class: com.garmin.proto.generated.GDIDezlProto.DrivingStateChangedNotification.DrivingState.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public DrivingState findValueByNumber(int i14) {
                    return DrivingState.forNumber(i14);
                }
            };
            private static final DrivingState[] VALUES = values();

            DrivingState(int i14) {
                this.value = i14;
            }

            public static DrivingState forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return STARTED;
                }
                if (i14 != 2) {
                    return null;
                }
                return STOPPED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return DrivingStateChangedNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<DrivingState> internalGetValueMap() {
                return internalValueMap;
            }

            public static DrivingState valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static DrivingState valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum Source implements ProtocolMessageEnum {
            UNKNOWN_SOURCE(0),
            APP(1),
            PND(2);

            public static final int APP_VALUE = 1;
            public static final int PND_VALUE = 2;
            public static final int UNKNOWN_SOURCE_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Source> internalValueMap = new Internal.EnumLiteMap<Source>() { // from class: com.garmin.proto.generated.GDIDezlProto.DrivingStateChangedNotification.Source.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Source findValueByNumber(int i14) {
                    return Source.forNumber(i14);
                }
            };
            private static final Source[] VALUES = values();

            Source(int i14) {
                this.value = i14;
            }

            public static Source forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN_SOURCE;
                }
                if (i14 == 1) {
                    return APP;
                }
                if (i14 != 2) {
                    return null;
                }
                return PND;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return DrivingStateChangedNotification.getDescriptor().getEnumTypes().get(1);
            }

            public static Internal.EnumLiteMap<Source> internalGetValueMap() {
                return internalValueMap;
            }

            public static Source valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Source valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class FeaturesEnableRequest extends GeneratedMessageV3 implements FeaturesEnableRequestOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 1;
        private static final FeaturesEnableRequest DEFAULT_INSTANCE = new FeaturesEnableRequest();

        @Deprecated
        public static final Parser<FeaturesEnableRequest> PARSER = new AbstractParser<FeaturesEnableRequest>() { // from class: com.garmin.proto.generated.GDIDezlProto.FeaturesEnableRequest.1
            @Override // com.google.protobuf.Parser
            public FeaturesEnableRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FeaturesEnableRequest.newBuilder();
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
        private int action_;
        private int bitField0_;
        private byte memoizedIsInitialized;

        private FeaturesEnableRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.action_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FeaturesEnableRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_FeaturesEnableRequest_descriptor;
        }

        public static Builder newBuilder(FeaturesEnableRequest featuresEnableRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(featuresEnableRequest);
        }

        public static FeaturesEnableRequest parseDelimitedFrom(InputStream inputStream) {
            return (FeaturesEnableRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FeaturesEnableRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FeaturesEnableRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FeaturesEnableRequest)) {
                return super.equals(obj);
            }
            FeaturesEnableRequest featuresEnableRequest = (FeaturesEnableRequest) obj;
            if (hasAction() != featuresEnableRequest.hasAction()) {
                return false;
            }
            return (!hasAction() || this.action_ == featuresEnableRequest.action_) && getUnknownFields().equals(featuresEnableRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.FeaturesEnableRequestOrBuilder
        public Action getAction() {
            Action actionForNumber = Action.forNumber(this.action_);
            return actionForNumber == null ? Action.STATUS : actionForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FeaturesEnableRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.action_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.FeaturesEnableRequestOrBuilder
        public boolean hasAction() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAction()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.action_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_FeaturesEnableRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(FeaturesEnableRequest.class, Builder.class);
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
            return new FeaturesEnableRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.action_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FeaturesEnableRequestOrBuilder {
            private int action_;
            private int bitField0_;

            private Builder() {
                this.action_ = 0;
            }

            private void buildPartial0(FeaturesEnableRequest featuresEnableRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    featuresEnableRequest.action_ = this.action_;
                } else {
                    i14 = 0;
                }
                featuresEnableRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_FeaturesEnableRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FeaturesEnableRequest build() {
                FeaturesEnableRequest featuresEnableRequestBuildPartial = buildPartial();
                if (featuresEnableRequestBuildPartial.isInitialized()) {
                    return featuresEnableRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) featuresEnableRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FeaturesEnableRequest buildPartial() {
                FeaturesEnableRequest featuresEnableRequest = new FeaturesEnableRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(featuresEnableRequest);
                }
                onBuilt();
                return featuresEnableRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.action_ = 0;
                return this;
            }

            public Builder clearAction() {
                this.bitField0_ &= -2;
                this.action_ = 0;
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

            @Override // com.garmin.proto.generated.GDIDezlProto.FeaturesEnableRequestOrBuilder
            public Action getAction() {
                Action actionForNumber = Action.forNumber(this.action_);
                return actionForNumber == null ? Action.STATUS : actionForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_FeaturesEnableRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.FeaturesEnableRequestOrBuilder
            public boolean hasAction() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_FeaturesEnableRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(FeaturesEnableRequest.class, Builder.class);
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
                                    if (Action.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.action_ = i14;
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

            public Builder setAction(Action action) {
                action.getClass();
                this.bitField0_ |= 1;
                this.action_ = action.getNumber();
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
            public FeaturesEnableRequest getDefaultInstanceForType() {
                return FeaturesEnableRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.action_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FeaturesEnableRequest) {
                    return mergeFrom((FeaturesEnableRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FeaturesEnableRequest featuresEnableRequest) {
                if (featuresEnableRequest == FeaturesEnableRequest.getDefaultInstance()) {
                    return this;
                }
                if (featuresEnableRequest.hasAction()) {
                    setAction(featuresEnableRequest.getAction());
                }
                mergeUnknownFields(featuresEnableRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FeaturesEnableRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FeaturesEnableRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeaturesEnableRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FeaturesEnableRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ FeaturesEnableRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static FeaturesEnableRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private FeaturesEnableRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.action_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FeaturesEnableRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FeaturesEnableRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static FeaturesEnableRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FeaturesEnableRequest parseFrom(InputStream inputStream) {
            return (FeaturesEnableRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FeaturesEnableRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeaturesEnableRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FeaturesEnableRequest parseFrom(CodedInputStream codedInputStream) {
            return (FeaturesEnableRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FeaturesEnableRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeaturesEnableRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Action implements ProtocolMessageEnum {
            STATUS(0),
            ENABLE(1),
            DISABLE(2);

            public static final int DISABLE_VALUE = 2;
            public static final int ENABLE_VALUE = 1;
            public static final int STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Action> internalValueMap = new Internal.EnumLiteMap<Action>() { // from class: com.garmin.proto.generated.GDIDezlProto.FeaturesEnableRequest.Action.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Action findValueByNumber(int i14) {
                    return Action.forNumber(i14);
                }
            };
            private static final Action[] VALUES = values();

            Action(int i14) {
                this.value = i14;
            }

            public static Action forNumber(int i14) {
                if (i14 == 0) {
                    return STATUS;
                }
                if (i14 == 1) {
                    return ENABLE;
                }
                if (i14 != 2) {
                    return null;
                }
                return DISABLE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return FeaturesEnableRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Action> internalGetValueMap() {
                return internalValueMap;
            }

            public static Action valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Action valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class FeaturesEnableResponse extends GeneratedMessageV3 implements FeaturesEnableResponseOrBuilder {
        public static final int ENABLED_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean enabled_;
        private byte memoizedIsInitialized;
        private int status_;
        private static final FeaturesEnableResponse DEFAULT_INSTANCE = new FeaturesEnableResponse();

        @Deprecated
        public static final Parser<FeaturesEnableResponse> PARSER = new AbstractParser<FeaturesEnableResponse>() { // from class: com.garmin.proto.generated.GDIDezlProto.FeaturesEnableResponse.1
            @Override // com.google.protobuf.Parser
            public FeaturesEnableResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FeaturesEnableResponse.newBuilder();
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

        private FeaturesEnableResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.enabled_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FeaturesEnableResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_FeaturesEnableResponse_descriptor;
        }

        public static Builder newBuilder(FeaturesEnableResponse featuresEnableResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(featuresEnableResponse);
        }

        public static FeaturesEnableResponse parseDelimitedFrom(InputStream inputStream) {
            return (FeaturesEnableResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FeaturesEnableResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FeaturesEnableResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FeaturesEnableResponse)) {
                return super.equals(obj);
            }
            FeaturesEnableResponse featuresEnableResponse = (FeaturesEnableResponse) obj;
            if (hasStatus() != featuresEnableResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == featuresEnableResponse.status_) && hasEnabled() == featuresEnableResponse.hasEnabled()) {
                return (!hasEnabled() || getEnabled() == featuresEnableResponse.getEnabled()) && getUnknownFields().equals(featuresEnableResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.FeaturesEnableResponseOrBuilder
        public boolean getEnabled() {
            return this.enabled_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FeaturesEnableResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeBoolSize(2, this.enabled_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.FeaturesEnableResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.FeaturesEnableResponseOrBuilder
        public boolean hasEnabled() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.FeaturesEnableResponseOrBuilder
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
            if (hasEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getEnabled());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_FeaturesEnableResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(FeaturesEnableResponse.class, Builder.class);
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
            return new FeaturesEnableResponse();
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
                codedOutputStream.writeBool(2, this.enabled_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FeaturesEnableResponseOrBuilder {
            private int bitField0_;
            private boolean enabled_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(FeaturesEnableResponse featuresEnableResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    featuresEnableResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    featuresEnableResponse.enabled_ = this.enabled_;
                    i14 |= 2;
                }
                featuresEnableResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_FeaturesEnableResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FeaturesEnableResponse build() {
                FeaturesEnableResponse featuresEnableResponseBuildPartial = buildPartial();
                if (featuresEnableResponseBuildPartial.isInitialized()) {
                    return featuresEnableResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) featuresEnableResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FeaturesEnableResponse buildPartial() {
                FeaturesEnableResponse featuresEnableResponse = new FeaturesEnableResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(featuresEnableResponse);
                }
                onBuilt();
                return featuresEnableResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.enabled_ = false;
                return this;
            }

            public Builder clearEnabled() {
                this.bitField0_ &= -3;
                this.enabled_ = false;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_FeaturesEnableResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.FeaturesEnableResponseOrBuilder
            public boolean getEnabled() {
                return this.enabled_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.FeaturesEnableResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.FeaturesEnableResponseOrBuilder
            public boolean hasEnabled() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.FeaturesEnableResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_FeaturesEnableResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(FeaturesEnableResponse.class, Builder.class);
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
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.enabled_ = codedInputStream.readBool();
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
            public FeaturesEnableResponse getDefaultInstanceForType() {
                return FeaturesEnableResponse.getDefaultInstance();
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
                if (message instanceof FeaturesEnableResponse) {
                    return mergeFrom((FeaturesEnableResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FeaturesEnableResponse featuresEnableResponse) {
                if (featuresEnableResponse == FeaturesEnableResponse.getDefaultInstance()) {
                    return this;
                }
                if (featuresEnableResponse.hasStatus()) {
                    setStatus(featuresEnableResponse.getStatus());
                }
                if (featuresEnableResponse.hasEnabled()) {
                    setEnabled(featuresEnableResponse.getEnabled());
                }
                mergeUnknownFields(featuresEnableResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FeaturesEnableResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FeaturesEnableResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeaturesEnableResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FeaturesEnableResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FeaturesEnableResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FeaturesEnableResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ FeaturesEnableResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static FeaturesEnableResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private FeaturesEnableResponse() {
            this.enabled_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static FeaturesEnableResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FeaturesEnableResponse parseFrom(InputStream inputStream) {
            return (FeaturesEnableResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FeaturesEnableResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeaturesEnableResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FeaturesEnableResponse parseFrom(CodedInputStream codedInputStream) {
            return (FeaturesEnableResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FeaturesEnableResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeaturesEnableResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            SUCCESS(0),
            FAILURE(1);

            public static final int FAILURE_VALUE = 1;
            public static final int SUCCESS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIDezlProto.FeaturesEnableResponse.ResponseStatus.1
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
                    return SUCCESS;
                }
                if (i14 != 1) {
                    return null;
                }
                return FAILURE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return FeaturesEnableResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class LoyaltyBonusOfferInfo extends GeneratedMessageV3 implements LoyaltyBonusOfferInfoOrBuilder {
        public static final int BONUS_OFFER_END_DATE_FIELD_NUMBER = 4;
        public static final int BONUS_OFFER_START_DATE_FIELD_NUMBER = 3;
        public static final int CURRENT_BONUS_OFFER_FIELD_NUMBER = 1;
        public static final int CURRENT_BONUS_OFFER_SEGMENT_ID_FIELD_NUMBER = 2;
        private static final LoyaltyBonusOfferInfo DEFAULT_INSTANCE = new LoyaltyBonusOfferInfo();

        @Deprecated
        public static final Parser<LoyaltyBonusOfferInfo> PARSER = new AbstractParser<LoyaltyBonusOfferInfo>() { // from class: com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfo.1
            @Override // com.google.protobuf.Parser
            public LoyaltyBonusOfferInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LoyaltyBonusOfferInfo.newBuilder();
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
        private volatile Object bonusOfferEndDate_;
        private volatile Object bonusOfferStartDate_;
        private volatile Object currentBonusOfferSegmentId_;
        private volatile Object currentBonusOffer_;
        private byte memoizedIsInitialized;

        private LoyaltyBonusOfferInfo() {
            this.currentBonusOffer_ = "";
            this.currentBonusOfferSegmentId_ = "";
            this.bonusOfferStartDate_ = "";
            this.bonusOfferEndDate_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.currentBonusOffer_ = "";
            this.currentBonusOfferSegmentId_ = "";
            this.bonusOfferStartDate_ = "";
            this.bonusOfferEndDate_ = "";
        }

        public static LoyaltyBonusOfferInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyBonusOfferInfo_descriptor;
        }

        public static Builder newBuilder(LoyaltyBonusOfferInfo loyaltyBonusOfferInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(loyaltyBonusOfferInfo);
        }

        public static LoyaltyBonusOfferInfo parseDelimitedFrom(InputStream inputStream) {
            return (LoyaltyBonusOfferInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LoyaltyBonusOfferInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LoyaltyBonusOfferInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LoyaltyBonusOfferInfo)) {
                return super.equals(obj);
            }
            LoyaltyBonusOfferInfo loyaltyBonusOfferInfo = (LoyaltyBonusOfferInfo) obj;
            if (hasCurrentBonusOffer() != loyaltyBonusOfferInfo.hasCurrentBonusOffer()) {
                return false;
            }
            if ((hasCurrentBonusOffer() && !getCurrentBonusOffer().equals(loyaltyBonusOfferInfo.getCurrentBonusOffer())) || hasCurrentBonusOfferSegmentId() != loyaltyBonusOfferInfo.hasCurrentBonusOfferSegmentId()) {
                return false;
            }
            if ((hasCurrentBonusOfferSegmentId() && !getCurrentBonusOfferSegmentId().equals(loyaltyBonusOfferInfo.getCurrentBonusOfferSegmentId())) || hasBonusOfferStartDate() != loyaltyBonusOfferInfo.hasBonusOfferStartDate()) {
                return false;
            }
            if ((!hasBonusOfferStartDate() || getBonusOfferStartDate().equals(loyaltyBonusOfferInfo.getBonusOfferStartDate())) && hasBonusOfferEndDate() == loyaltyBonusOfferInfo.hasBonusOfferEndDate()) {
                return (!hasBonusOfferEndDate() || getBonusOfferEndDate().equals(loyaltyBonusOfferInfo.getBonusOfferEndDate())) && getUnknownFields().equals(loyaltyBonusOfferInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
        public String getBonusOfferEndDate() {
            Object obj = this.bonusOfferEndDate_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.bonusOfferEndDate_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
        public ByteString getBonusOfferEndDateBytes() {
            Object obj = this.bonusOfferEndDate_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bonusOfferEndDate_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
        public String getBonusOfferStartDate() {
            Object obj = this.bonusOfferStartDate_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.bonusOfferStartDate_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
        public ByteString getBonusOfferStartDateBytes() {
            Object obj = this.bonusOfferStartDate_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bonusOfferStartDate_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
        public String getCurrentBonusOffer() {
            Object obj = this.currentBonusOffer_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.currentBonusOffer_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
        public ByteString getCurrentBonusOfferBytes() {
            Object obj = this.currentBonusOffer_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.currentBonusOffer_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
        public String getCurrentBonusOfferSegmentId() {
            Object obj = this.currentBonusOfferSegmentId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.currentBonusOfferSegmentId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
        public ByteString getCurrentBonusOfferSegmentIdBytes() {
            Object obj = this.currentBonusOfferSegmentId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.currentBonusOfferSegmentId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LoyaltyBonusOfferInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.currentBonusOffer_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.currentBonusOfferSegmentId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.bonusOfferStartDate_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.bonusOfferEndDate_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
        public boolean hasBonusOfferEndDate() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
        public boolean hasBonusOfferStartDate() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
        public boolean hasCurrentBonusOffer() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
        public boolean hasCurrentBonusOfferSegmentId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCurrentBonusOffer()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCurrentBonusOffer().hashCode();
            }
            if (hasCurrentBonusOfferSegmentId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getCurrentBonusOfferSegmentId().hashCode();
            }
            if (hasBonusOfferStartDate()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getBonusOfferStartDate().hashCode();
            }
            if (hasBonusOfferEndDate()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getBonusOfferEndDate().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyBonusOfferInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(LoyaltyBonusOfferInfo.class, Builder.class);
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
            return new LoyaltyBonusOfferInfo();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.currentBonusOffer_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.currentBonusOfferSegmentId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.bonusOfferStartDate_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.bonusOfferEndDate_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LoyaltyBonusOfferInfoOrBuilder {
            private int bitField0_;
            private Object bonusOfferEndDate_;
            private Object bonusOfferStartDate_;
            private Object currentBonusOfferSegmentId_;
            private Object currentBonusOffer_;

            private Builder() {
                this.currentBonusOffer_ = "";
                this.currentBonusOfferSegmentId_ = "";
                this.bonusOfferStartDate_ = "";
                this.bonusOfferEndDate_ = "";
            }

            private void buildPartial0(LoyaltyBonusOfferInfo loyaltyBonusOfferInfo) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    loyaltyBonusOfferInfo.currentBonusOffer_ = this.currentBonusOffer_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    loyaltyBonusOfferInfo.currentBonusOfferSegmentId_ = this.currentBonusOfferSegmentId_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    loyaltyBonusOfferInfo.bonusOfferStartDate_ = this.bonusOfferStartDate_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    loyaltyBonusOfferInfo.bonusOfferEndDate_ = this.bonusOfferEndDate_;
                    i14 |= 8;
                }
                loyaltyBonusOfferInfo.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyBonusOfferInfo_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LoyaltyBonusOfferInfo build() {
                LoyaltyBonusOfferInfo loyaltyBonusOfferInfoBuildPartial = buildPartial();
                if (loyaltyBonusOfferInfoBuildPartial.isInitialized()) {
                    return loyaltyBonusOfferInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) loyaltyBonusOfferInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LoyaltyBonusOfferInfo buildPartial() {
                LoyaltyBonusOfferInfo loyaltyBonusOfferInfo = new LoyaltyBonusOfferInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(loyaltyBonusOfferInfo);
                }
                onBuilt();
                return loyaltyBonusOfferInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.currentBonusOffer_ = "";
                this.currentBonusOfferSegmentId_ = "";
                this.bonusOfferStartDate_ = "";
                this.bonusOfferEndDate_ = "";
                return this;
            }

            public Builder clearBonusOfferEndDate() {
                this.bonusOfferEndDate_ = LoyaltyBonusOfferInfo.getDefaultInstance().getBonusOfferEndDate();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearBonusOfferStartDate() {
                this.bonusOfferStartDate_ = LoyaltyBonusOfferInfo.getDefaultInstance().getBonusOfferStartDate();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearCurrentBonusOffer() {
                this.currentBonusOffer_ = LoyaltyBonusOfferInfo.getDefaultInstance().getCurrentBonusOffer();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearCurrentBonusOfferSegmentId() {
                this.currentBonusOfferSegmentId_ = LoyaltyBonusOfferInfo.getDefaultInstance().getCurrentBonusOfferSegmentId();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
            public String getBonusOfferEndDate() {
                Object obj = this.bonusOfferEndDate_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.bonusOfferEndDate_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
            public ByteString getBonusOfferEndDateBytes() {
                Object obj = this.bonusOfferEndDate_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bonusOfferEndDate_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
            public String getBonusOfferStartDate() {
                Object obj = this.bonusOfferStartDate_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.bonusOfferStartDate_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
            public ByteString getBonusOfferStartDateBytes() {
                Object obj = this.bonusOfferStartDate_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bonusOfferStartDate_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
            public String getCurrentBonusOffer() {
                Object obj = this.currentBonusOffer_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.currentBonusOffer_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
            public ByteString getCurrentBonusOfferBytes() {
                Object obj = this.currentBonusOffer_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.currentBonusOffer_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
            public String getCurrentBonusOfferSegmentId() {
                Object obj = this.currentBonusOfferSegmentId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.currentBonusOfferSegmentId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
            public ByteString getCurrentBonusOfferSegmentIdBytes() {
                Object obj = this.currentBonusOfferSegmentId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.currentBonusOfferSegmentId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyBonusOfferInfo_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
            public boolean hasBonusOfferEndDate() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
            public boolean hasBonusOfferStartDate() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
            public boolean hasCurrentBonusOffer() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyBonusOfferInfoOrBuilder
            public boolean hasCurrentBonusOfferSegmentId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyBonusOfferInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(LoyaltyBonusOfferInfo.class, Builder.class);
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
                                    this.currentBonusOffer_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.currentBonusOfferSegmentId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.bonusOfferStartDate_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.bonusOfferEndDate_ = codedInputStream.readBytes();
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

            public Builder setBonusOfferEndDate(String str) {
                str.getClass();
                this.bonusOfferEndDate_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setBonusOfferEndDateBytes(ByteString byteString) {
                byteString.getClass();
                this.bonusOfferEndDate_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setBonusOfferStartDate(String str) {
                str.getClass();
                this.bonusOfferStartDate_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setBonusOfferStartDateBytes(ByteString byteString) {
                byteString.getClass();
                this.bonusOfferStartDate_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setCurrentBonusOffer(String str) {
                str.getClass();
                this.currentBonusOffer_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCurrentBonusOfferBytes(ByteString byteString) {
                byteString.getClass();
                this.currentBonusOffer_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCurrentBonusOfferSegmentId(String str) {
                str.getClass();
                this.currentBonusOfferSegmentId_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCurrentBonusOfferSegmentIdBytes(ByteString byteString) {
                byteString.getClass();
                this.currentBonusOfferSegmentId_ = byteString;
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

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LoyaltyBonusOfferInfo getDefaultInstanceForType() {
                return LoyaltyBonusOfferInfo.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.currentBonusOffer_ = "";
                this.currentBonusOfferSegmentId_ = "";
                this.bonusOfferStartDate_ = "";
                this.bonusOfferEndDate_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LoyaltyBonusOfferInfo) {
                    return mergeFrom((LoyaltyBonusOfferInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LoyaltyBonusOfferInfo loyaltyBonusOfferInfo) {
                if (loyaltyBonusOfferInfo == LoyaltyBonusOfferInfo.getDefaultInstance()) {
                    return this;
                }
                if (loyaltyBonusOfferInfo.hasCurrentBonusOffer()) {
                    this.currentBonusOffer_ = loyaltyBonusOfferInfo.currentBonusOffer_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (loyaltyBonusOfferInfo.hasCurrentBonusOfferSegmentId()) {
                    this.currentBonusOfferSegmentId_ = loyaltyBonusOfferInfo.currentBonusOfferSegmentId_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (loyaltyBonusOfferInfo.hasBonusOfferStartDate()) {
                    this.bonusOfferStartDate_ = loyaltyBonusOfferInfo.bonusOfferStartDate_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (loyaltyBonusOfferInfo.hasBonusOfferEndDate()) {
                    this.bonusOfferEndDate_ = loyaltyBonusOfferInfo.bonusOfferEndDate_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                mergeUnknownFields(loyaltyBonusOfferInfo.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LoyaltyBonusOfferInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LoyaltyBonusOfferInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LoyaltyBonusOfferInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LoyaltyBonusOfferInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LoyaltyBonusOfferInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LoyaltyBonusOfferInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LoyaltyBonusOfferInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LoyaltyBonusOfferInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LoyaltyBonusOfferInfo parseFrom(InputStream inputStream) {
            return (LoyaltyBonusOfferInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LoyaltyBonusOfferInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LoyaltyBonusOfferInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LoyaltyBonusOfferInfo parseFrom(CodedInputStream codedInputStream) {
            return (LoyaltyBonusOfferInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LoyaltyBonusOfferInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LoyaltyBonusOfferInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private LoyaltyBonusOfferInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.currentBonusOffer_ = "";
            this.currentBonusOfferSegmentId_ = "";
            this.bonusOfferStartDate_ = "";
            this.bonusOfferEndDate_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ LoyaltyBonusOfferInfo(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class LoyaltyCampaignInfo extends GeneratedMessageV3 implements LoyaltyCampaignInfoOrBuilder {
        public static final int CAMPAIGN_JOINED_FIELD_NUMBER = 3;
        public static final int CAMPAIGN_NAME_AGG_FIELD_NUMBER = 2;
        public static final int CAMPAIGN_NAME_FIELD_NUMBER = 1;
        public static final int CLICK_TO_JOIN_CAMPAIGN_FIELD_NUMBER = 4;
        public static final int LADDER_CAMPAIGN_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean campaignJoined_;
        private volatile Object campaignNameAgg_;
        private volatile Object campaignName_;
        private boolean clickToJoinCampaign_;
        private boolean ladderCampaign_;
        private byte memoizedIsInitialized;
        private static final LoyaltyCampaignInfo DEFAULT_INSTANCE = new LoyaltyCampaignInfo();

        @Deprecated
        public static final Parser<LoyaltyCampaignInfo> PARSER = new AbstractParser<LoyaltyCampaignInfo>() { // from class: com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfo.1
            @Override // com.google.protobuf.Parser
            public LoyaltyCampaignInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LoyaltyCampaignInfo.newBuilder();
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

        private LoyaltyCampaignInfo() {
            this.campaignName_ = "";
            this.campaignNameAgg_ = "";
            this.campaignJoined_ = false;
            this.clickToJoinCampaign_ = false;
            this.ladderCampaign_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.campaignName_ = "";
            this.campaignNameAgg_ = "";
        }

        public static LoyaltyCampaignInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyCampaignInfo_descriptor;
        }

        public static Builder newBuilder(LoyaltyCampaignInfo loyaltyCampaignInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(loyaltyCampaignInfo);
        }

        public static LoyaltyCampaignInfo parseDelimitedFrom(InputStream inputStream) {
            return (LoyaltyCampaignInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LoyaltyCampaignInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LoyaltyCampaignInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LoyaltyCampaignInfo)) {
                return super.equals(obj);
            }
            LoyaltyCampaignInfo loyaltyCampaignInfo = (LoyaltyCampaignInfo) obj;
            if (hasCampaignName() != loyaltyCampaignInfo.hasCampaignName()) {
                return false;
            }
            if ((hasCampaignName() && !getCampaignName().equals(loyaltyCampaignInfo.getCampaignName())) || hasCampaignNameAgg() != loyaltyCampaignInfo.hasCampaignNameAgg()) {
                return false;
            }
            if ((hasCampaignNameAgg() && !getCampaignNameAgg().equals(loyaltyCampaignInfo.getCampaignNameAgg())) || hasCampaignJoined() != loyaltyCampaignInfo.hasCampaignJoined()) {
                return false;
            }
            if ((hasCampaignJoined() && getCampaignJoined() != loyaltyCampaignInfo.getCampaignJoined()) || hasClickToJoinCampaign() != loyaltyCampaignInfo.hasClickToJoinCampaign()) {
                return false;
            }
            if ((!hasClickToJoinCampaign() || getClickToJoinCampaign() == loyaltyCampaignInfo.getClickToJoinCampaign()) && hasLadderCampaign() == loyaltyCampaignInfo.hasLadderCampaign()) {
                return (!hasLadderCampaign() || getLadderCampaign() == loyaltyCampaignInfo.getLadderCampaign()) && getUnknownFields().equals(loyaltyCampaignInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
        public boolean getCampaignJoined() {
            return this.campaignJoined_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
        public String getCampaignName() {
            Object obj = this.campaignName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.campaignName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
        public String getCampaignNameAgg() {
            Object obj = this.campaignNameAgg_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.campaignNameAgg_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
        public ByteString getCampaignNameAggBytes() {
            Object obj = this.campaignNameAgg_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.campaignNameAgg_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
        public ByteString getCampaignNameBytes() {
            Object obj = this.campaignName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.campaignName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
        public boolean getClickToJoinCampaign() {
            return this.clickToJoinCampaign_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
        public boolean getLadderCampaign() {
            return this.ladderCampaign_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LoyaltyCampaignInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.campaignName_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.campaignNameAgg_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(3, this.campaignJoined_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(4, this.clickToJoinCampaign_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(5, this.ladderCampaign_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
        public boolean hasCampaignJoined() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
        public boolean hasCampaignName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
        public boolean hasCampaignNameAgg() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
        public boolean hasClickToJoinCampaign() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
        public boolean hasLadderCampaign() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCampaignName()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCampaignName().hashCode();
            }
            if (hasCampaignNameAgg()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getCampaignNameAgg().hashCode();
            }
            if (hasCampaignJoined()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getCampaignJoined());
            }
            if (hasClickToJoinCampaign()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getClickToJoinCampaign());
            }
            if (hasLadderCampaign()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Internal.hashBoolean(getLadderCampaign());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyCampaignInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(LoyaltyCampaignInfo.class, Builder.class);
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
            return new LoyaltyCampaignInfo();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.campaignName_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.campaignNameAgg_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.campaignJoined_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.clickToJoinCampaign_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(5, this.ladderCampaign_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LoyaltyCampaignInfoOrBuilder {
            private int bitField0_;
            private boolean campaignJoined_;
            private Object campaignNameAgg_;
            private Object campaignName_;
            private boolean clickToJoinCampaign_;
            private boolean ladderCampaign_;

            private Builder() {
                this.campaignName_ = "";
                this.campaignNameAgg_ = "";
            }

            private void buildPartial0(LoyaltyCampaignInfo loyaltyCampaignInfo) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    loyaltyCampaignInfo.campaignName_ = this.campaignName_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    loyaltyCampaignInfo.campaignNameAgg_ = this.campaignNameAgg_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    loyaltyCampaignInfo.campaignJoined_ = this.campaignJoined_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    loyaltyCampaignInfo.clickToJoinCampaign_ = this.clickToJoinCampaign_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    loyaltyCampaignInfo.ladderCampaign_ = this.ladderCampaign_;
                    i14 |= 16;
                }
                loyaltyCampaignInfo.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyCampaignInfo_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LoyaltyCampaignInfo build() {
                LoyaltyCampaignInfo loyaltyCampaignInfoBuildPartial = buildPartial();
                if (loyaltyCampaignInfoBuildPartial.isInitialized()) {
                    return loyaltyCampaignInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) loyaltyCampaignInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LoyaltyCampaignInfo buildPartial() {
                LoyaltyCampaignInfo loyaltyCampaignInfo = new LoyaltyCampaignInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(loyaltyCampaignInfo);
                }
                onBuilt();
                return loyaltyCampaignInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.campaignName_ = "";
                this.campaignNameAgg_ = "";
                this.campaignJoined_ = false;
                this.clickToJoinCampaign_ = false;
                this.ladderCampaign_ = false;
                return this;
            }

            public Builder clearCampaignJoined() {
                this.bitField0_ &= -5;
                this.campaignJoined_ = false;
                onChanged();
                return this;
            }

            public Builder clearCampaignName() {
                this.campaignName_ = LoyaltyCampaignInfo.getDefaultInstance().getCampaignName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearCampaignNameAgg() {
                this.campaignNameAgg_ = LoyaltyCampaignInfo.getDefaultInstance().getCampaignNameAgg();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearClickToJoinCampaign() {
                this.bitField0_ &= -9;
                this.clickToJoinCampaign_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLadderCampaign() {
                this.bitField0_ &= -17;
                this.ladderCampaign_ = false;
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

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
            public boolean getCampaignJoined() {
                return this.campaignJoined_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
            public String getCampaignName() {
                Object obj = this.campaignName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.campaignName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
            public String getCampaignNameAgg() {
                Object obj = this.campaignNameAgg_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.campaignNameAgg_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
            public ByteString getCampaignNameAggBytes() {
                Object obj = this.campaignNameAgg_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.campaignNameAgg_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
            public ByteString getCampaignNameBytes() {
                Object obj = this.campaignName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.campaignName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
            public boolean getClickToJoinCampaign() {
                return this.clickToJoinCampaign_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyCampaignInfo_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
            public boolean getLadderCampaign() {
                return this.ladderCampaign_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
            public boolean hasCampaignJoined() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
            public boolean hasCampaignName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
            public boolean hasCampaignNameAgg() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
            public boolean hasClickToJoinCampaign() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyCampaignInfoOrBuilder
            public boolean hasLadderCampaign() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyCampaignInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(LoyaltyCampaignInfo.class, Builder.class);
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
                                    this.campaignName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.campaignNameAgg_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.campaignJoined_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.clickToJoinCampaign_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.ladderCampaign_ = codedInputStream.readBool();
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

            public Builder setCampaignJoined(boolean z14) {
                this.campaignJoined_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setCampaignName(String str) {
                str.getClass();
                this.campaignName_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCampaignNameAgg(String str) {
                str.getClass();
                this.campaignNameAgg_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCampaignNameAggBytes(ByteString byteString) {
                byteString.getClass();
                this.campaignNameAgg_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCampaignNameBytes(ByteString byteString) {
                byteString.getClass();
                this.campaignName_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setClickToJoinCampaign(boolean z14) {
                this.clickToJoinCampaign_ = z14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLadderCampaign(boolean z14) {
                this.ladderCampaign_ = z14;
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
            public LoyaltyCampaignInfo getDefaultInstanceForType() {
                return LoyaltyCampaignInfo.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.campaignName_ = "";
                this.campaignNameAgg_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LoyaltyCampaignInfo) {
                    return mergeFrom((LoyaltyCampaignInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LoyaltyCampaignInfo loyaltyCampaignInfo) {
                if (loyaltyCampaignInfo == LoyaltyCampaignInfo.getDefaultInstance()) {
                    return this;
                }
                if (loyaltyCampaignInfo.hasCampaignName()) {
                    this.campaignName_ = loyaltyCampaignInfo.campaignName_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (loyaltyCampaignInfo.hasCampaignNameAgg()) {
                    this.campaignNameAgg_ = loyaltyCampaignInfo.campaignNameAgg_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (loyaltyCampaignInfo.hasCampaignJoined()) {
                    setCampaignJoined(loyaltyCampaignInfo.getCampaignJoined());
                }
                if (loyaltyCampaignInfo.hasClickToJoinCampaign()) {
                    setClickToJoinCampaign(loyaltyCampaignInfo.getClickToJoinCampaign());
                }
                if (loyaltyCampaignInfo.hasLadderCampaign()) {
                    setLadderCampaign(loyaltyCampaignInfo.getLadderCampaign());
                }
                mergeUnknownFields(loyaltyCampaignInfo.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LoyaltyCampaignInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LoyaltyCampaignInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LoyaltyCampaignInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LoyaltyCampaignInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LoyaltyCampaignInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LoyaltyCampaignInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LoyaltyCampaignInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LoyaltyCampaignInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LoyaltyCampaignInfo parseFrom(InputStream inputStream) {
            return (LoyaltyCampaignInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LoyaltyCampaignInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LoyaltyCampaignInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LoyaltyCampaignInfo parseFrom(CodedInputStream codedInputStream) {
            return (LoyaltyCampaignInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LoyaltyCampaignInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LoyaltyCampaignInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private LoyaltyCampaignInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.campaignName_ = "";
            this.campaignNameAgg_ = "";
            this.campaignJoined_ = false;
            this.clickToJoinCampaign_ = false;
            this.ladderCampaign_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ LoyaltyCampaignInfo(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class LoyaltyRewardInfo extends GeneratedMessageV3 implements LoyaltyRewardInfoOrBuilder {
        public static final int CURRENT_TIER_FIELD_NUMBER = 1;
        public static final int EARNED_REWARD_FIELD_NUMBER = 2;
        public static final int EARNING_POINTS_PER_GALLON_FIELD_NUMBER = 7;
        public static final int GALLONS_THIS_YEAR_FIELD_NUMBER = 8;
        public static final int GALLONS_TO_NEXT_TIER_FIELD_NUMBER = 5;
        public static final int MARGIN_CATEGORY_FIELD_NUMBER = 4;
        public static final int NEXT_TIER_FIELD_NUMBER = 6;
        public static final int REWARD_CATEGORY_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object currentTier_;
        private volatile Object earnedReward_;
        private int earningPointsPerGallon_;
        private int gallonsThisYear_;
        private int gallonsToNextTier_;
        private volatile Object marginCategory_;
        private byte memoizedIsInitialized;
        private volatile Object nextTier_;
        private volatile Object rewardCategory_;
        private static final LoyaltyRewardInfo DEFAULT_INSTANCE = new LoyaltyRewardInfo();

        @Deprecated
        public static final Parser<LoyaltyRewardInfo> PARSER = new AbstractParser<LoyaltyRewardInfo>() { // from class: com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfo.1
            @Override // com.google.protobuf.Parser
            public LoyaltyRewardInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LoyaltyRewardInfo.newBuilder();
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

        private LoyaltyRewardInfo() {
            this.currentTier_ = "";
            this.earnedReward_ = "";
            this.rewardCategory_ = "";
            this.marginCategory_ = "";
            this.gallonsToNextTier_ = 0;
            this.nextTier_ = "";
            this.earningPointsPerGallon_ = 0;
            this.gallonsThisYear_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.currentTier_ = "";
            this.earnedReward_ = "";
            this.rewardCategory_ = "";
            this.marginCategory_ = "";
            this.nextTier_ = "";
        }

        public static LoyaltyRewardInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyRewardInfo_descriptor;
        }

        public static Builder newBuilder(LoyaltyRewardInfo loyaltyRewardInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(loyaltyRewardInfo);
        }

        public static LoyaltyRewardInfo parseDelimitedFrom(InputStream inputStream) {
            return (LoyaltyRewardInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LoyaltyRewardInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LoyaltyRewardInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LoyaltyRewardInfo)) {
                return super.equals(obj);
            }
            LoyaltyRewardInfo loyaltyRewardInfo = (LoyaltyRewardInfo) obj;
            if (hasCurrentTier() != loyaltyRewardInfo.hasCurrentTier()) {
                return false;
            }
            if ((hasCurrentTier() && !getCurrentTier().equals(loyaltyRewardInfo.getCurrentTier())) || hasEarnedReward() != loyaltyRewardInfo.hasEarnedReward()) {
                return false;
            }
            if ((hasEarnedReward() && !getEarnedReward().equals(loyaltyRewardInfo.getEarnedReward())) || hasRewardCategory() != loyaltyRewardInfo.hasRewardCategory()) {
                return false;
            }
            if ((hasRewardCategory() && !getRewardCategory().equals(loyaltyRewardInfo.getRewardCategory())) || hasMarginCategory() != loyaltyRewardInfo.hasMarginCategory()) {
                return false;
            }
            if ((hasMarginCategory() && !getMarginCategory().equals(loyaltyRewardInfo.getMarginCategory())) || hasGallonsToNextTier() != loyaltyRewardInfo.hasGallonsToNextTier()) {
                return false;
            }
            if ((hasGallonsToNextTier() && getGallonsToNextTier() != loyaltyRewardInfo.getGallonsToNextTier()) || hasNextTier() != loyaltyRewardInfo.hasNextTier()) {
                return false;
            }
            if ((hasNextTier() && !getNextTier().equals(loyaltyRewardInfo.getNextTier())) || hasEarningPointsPerGallon() != loyaltyRewardInfo.hasEarningPointsPerGallon()) {
                return false;
            }
            if ((!hasEarningPointsPerGallon() || getEarningPointsPerGallon() == loyaltyRewardInfo.getEarningPointsPerGallon()) && hasGallonsThisYear() == loyaltyRewardInfo.hasGallonsThisYear()) {
                return (!hasGallonsThisYear() || getGallonsThisYear() == loyaltyRewardInfo.getGallonsThisYear()) && getUnknownFields().equals(loyaltyRewardInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
        public String getCurrentTier() {
            Object obj = this.currentTier_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.currentTier_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
        public ByteString getCurrentTierBytes() {
            Object obj = this.currentTier_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.currentTier_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
        public String getEarnedReward() {
            Object obj = this.earnedReward_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.earnedReward_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
        public ByteString getEarnedRewardBytes() {
            Object obj = this.earnedReward_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.earnedReward_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
        public int getEarningPointsPerGallon() {
            return this.earningPointsPerGallon_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
        public int getGallonsThisYear() {
            return this.gallonsThisYear_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
        public int getGallonsToNextTier() {
            return this.gallonsToNextTier_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
        public String getMarginCategory() {
            Object obj = this.marginCategory_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.marginCategory_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
        public ByteString getMarginCategoryBytes() {
            Object obj = this.marginCategory_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.marginCategory_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
        public String getNextTier() {
            Object obj = this.nextTier_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.nextTier_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
        public ByteString getNextTierBytes() {
            Object obj = this.nextTier_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.nextTier_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LoyaltyRewardInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
        public String getRewardCategory() {
            Object obj = this.rewardCategory_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.rewardCategory_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
        public ByteString getRewardCategoryBytes() {
            Object obj = this.rewardCategory_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.rewardCategory_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.currentTier_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.earnedReward_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.rewardCategory_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.marginCategory_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(5, this.gallonsToNextTier_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.nextTier_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(7, this.earningPointsPerGallon_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(8, this.gallonsThisYear_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
        public boolean hasCurrentTier() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
        public boolean hasEarnedReward() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
        public boolean hasEarningPointsPerGallon() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
        public boolean hasGallonsThisYear() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
        public boolean hasGallonsToNextTier() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
        public boolean hasMarginCategory() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
        public boolean hasNextTier() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
        public boolean hasRewardCategory() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCurrentTier()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCurrentTier().hashCode();
            }
            if (hasEarnedReward()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getEarnedReward().hashCode();
            }
            if (hasRewardCategory()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getRewardCategory().hashCode();
            }
            if (hasMarginCategory()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getMarginCategory().hashCode();
            }
            if (hasGallonsToNextTier()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getGallonsToNextTier();
            }
            if (hasNextTier()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getNextTier().hashCode();
            }
            if (hasEarningPointsPerGallon()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getEarningPointsPerGallon();
            }
            if (hasGallonsThisYear()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getGallonsThisYear();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyRewardInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(LoyaltyRewardInfo.class, Builder.class);
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
            return new LoyaltyRewardInfo();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.currentTier_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.earnedReward_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.rewardCategory_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.marginCategory_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.gallonsToNextTier_);
            }
            if ((this.bitField0_ & 32) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.nextTier_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(7, this.earningPointsPerGallon_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeUInt32(8, this.gallonsThisYear_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LoyaltyRewardInfoOrBuilder {
            private int bitField0_;
            private Object currentTier_;
            private Object earnedReward_;
            private int earningPointsPerGallon_;
            private int gallonsThisYear_;
            private int gallonsToNextTier_;
            private Object marginCategory_;
            private Object nextTier_;
            private Object rewardCategory_;

            private Builder() {
                this.currentTier_ = "";
                this.earnedReward_ = "";
                this.rewardCategory_ = "";
                this.marginCategory_ = "";
                this.nextTier_ = "";
            }

            private void buildPartial0(LoyaltyRewardInfo loyaltyRewardInfo) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    loyaltyRewardInfo.currentTier_ = this.currentTier_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    loyaltyRewardInfo.earnedReward_ = this.earnedReward_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    loyaltyRewardInfo.rewardCategory_ = this.rewardCategory_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    loyaltyRewardInfo.marginCategory_ = this.marginCategory_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    loyaltyRewardInfo.gallonsToNextTier_ = this.gallonsToNextTier_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    loyaltyRewardInfo.nextTier_ = this.nextTier_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    loyaltyRewardInfo.earningPointsPerGallon_ = this.earningPointsPerGallon_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    loyaltyRewardInfo.gallonsThisYear_ = this.gallonsThisYear_;
                    i14 |= 128;
                }
                loyaltyRewardInfo.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyRewardInfo_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LoyaltyRewardInfo build() {
                LoyaltyRewardInfo loyaltyRewardInfoBuildPartial = buildPartial();
                if (loyaltyRewardInfoBuildPartial.isInitialized()) {
                    return loyaltyRewardInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) loyaltyRewardInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LoyaltyRewardInfo buildPartial() {
                LoyaltyRewardInfo loyaltyRewardInfo = new LoyaltyRewardInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(loyaltyRewardInfo);
                }
                onBuilt();
                return loyaltyRewardInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.currentTier_ = "";
                this.earnedReward_ = "";
                this.rewardCategory_ = "";
                this.marginCategory_ = "";
                this.gallonsToNextTier_ = 0;
                this.nextTier_ = "";
                this.earningPointsPerGallon_ = 0;
                this.gallonsThisYear_ = 0;
                return this;
            }

            public Builder clearCurrentTier() {
                this.currentTier_ = LoyaltyRewardInfo.getDefaultInstance().getCurrentTier();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearEarnedReward() {
                this.earnedReward_ = LoyaltyRewardInfo.getDefaultInstance().getEarnedReward();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearEarningPointsPerGallon() {
                this.bitField0_ &= -65;
                this.earningPointsPerGallon_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGallonsThisYear() {
                this.bitField0_ &= -129;
                this.gallonsThisYear_ = 0;
                onChanged();
                return this;
            }

            public Builder clearGallonsToNextTier() {
                this.bitField0_ &= -17;
                this.gallonsToNextTier_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMarginCategory() {
                this.marginCategory_ = LoyaltyRewardInfo.getDefaultInstance().getMarginCategory();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearNextTier() {
                this.nextTier_ = LoyaltyRewardInfo.getDefaultInstance().getNextTier();
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearRewardCategory() {
                this.rewardCategory_ = LoyaltyRewardInfo.getDefaultInstance().getRewardCategory();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
            public String getCurrentTier() {
                Object obj = this.currentTier_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.currentTier_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
            public ByteString getCurrentTierBytes() {
                Object obj = this.currentTier_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.currentTier_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyRewardInfo_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
            public String getEarnedReward() {
                Object obj = this.earnedReward_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.earnedReward_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
            public ByteString getEarnedRewardBytes() {
                Object obj = this.earnedReward_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.earnedReward_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
            public int getEarningPointsPerGallon() {
                return this.earningPointsPerGallon_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
            public int getGallonsThisYear() {
                return this.gallonsThisYear_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
            public int getGallonsToNextTier() {
                return this.gallonsToNextTier_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
            public String getMarginCategory() {
                Object obj = this.marginCategory_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.marginCategory_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
            public ByteString getMarginCategoryBytes() {
                Object obj = this.marginCategory_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.marginCategory_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
            public String getNextTier() {
                Object obj = this.nextTier_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.nextTier_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
            public ByteString getNextTierBytes() {
                Object obj = this.nextTier_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.nextTier_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
            public String getRewardCategory() {
                Object obj = this.rewardCategory_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.rewardCategory_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
            public ByteString getRewardCategoryBytes() {
                Object obj = this.rewardCategory_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.rewardCategory_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
            public boolean hasCurrentTier() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
            public boolean hasEarnedReward() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
            public boolean hasEarningPointsPerGallon() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
            public boolean hasGallonsThisYear() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
            public boolean hasGallonsToNextTier() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
            public boolean hasMarginCategory() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
            public boolean hasNextTier() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyRewardInfoOrBuilder
            public boolean hasRewardCategory() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyRewardInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(LoyaltyRewardInfo.class, Builder.class);
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
                                    this.currentTier_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.earnedReward_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.rewardCategory_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.marginCategory_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.gallonsToNextTier_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    this.nextTier_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 32;
                                } else if (tag == 56) {
                                    this.earningPointsPerGallon_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                } else if (tag == 64) {
                                    this.gallonsThisYear_ = codedInputStream.readUInt32();
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

            public Builder setCurrentTier(String str) {
                str.getClass();
                this.currentTier_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCurrentTierBytes(ByteString byteString) {
                byteString.getClass();
                this.currentTier_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setEarnedReward(String str) {
                str.getClass();
                this.earnedReward_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setEarnedRewardBytes(ByteString byteString) {
                byteString.getClass();
                this.earnedReward_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setEarningPointsPerGallon(int i14) {
                this.earningPointsPerGallon_ = i14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGallonsThisYear(int i14) {
                this.gallonsThisYear_ = i14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setGallonsToNextTier(int i14) {
                this.gallonsToNextTier_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setMarginCategory(String str) {
                str.getClass();
                this.marginCategory_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setMarginCategoryBytes(ByteString byteString) {
                byteString.getClass();
                this.marginCategory_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setNextTier(String str) {
                str.getClass();
                this.nextTier_ = str;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setNextTierBytes(ByteString byteString) {
                byteString.getClass();
                this.nextTier_ = byteString;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setRewardCategory(String str) {
                str.getClass();
                this.rewardCategory_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setRewardCategoryBytes(ByteString byteString) {
                byteString.getClass();
                this.rewardCategory_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LoyaltyRewardInfo getDefaultInstanceForType() {
                return LoyaltyRewardInfo.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.currentTier_ = "";
                this.earnedReward_ = "";
                this.rewardCategory_ = "";
                this.marginCategory_ = "";
                this.nextTier_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LoyaltyRewardInfo) {
                    return mergeFrom((LoyaltyRewardInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LoyaltyRewardInfo loyaltyRewardInfo) {
                if (loyaltyRewardInfo == LoyaltyRewardInfo.getDefaultInstance()) {
                    return this;
                }
                if (loyaltyRewardInfo.hasCurrentTier()) {
                    this.currentTier_ = loyaltyRewardInfo.currentTier_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (loyaltyRewardInfo.hasEarnedReward()) {
                    this.earnedReward_ = loyaltyRewardInfo.earnedReward_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (loyaltyRewardInfo.hasRewardCategory()) {
                    this.rewardCategory_ = loyaltyRewardInfo.rewardCategory_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (loyaltyRewardInfo.hasMarginCategory()) {
                    this.marginCategory_ = loyaltyRewardInfo.marginCategory_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (loyaltyRewardInfo.hasGallonsToNextTier()) {
                    setGallonsToNextTier(loyaltyRewardInfo.getGallonsToNextTier());
                }
                if (loyaltyRewardInfo.hasNextTier()) {
                    this.nextTier_ = loyaltyRewardInfo.nextTier_;
                    this.bitField0_ |= 32;
                    onChanged();
                }
                if (loyaltyRewardInfo.hasEarningPointsPerGallon()) {
                    setEarningPointsPerGallon(loyaltyRewardInfo.getEarningPointsPerGallon());
                }
                if (loyaltyRewardInfo.hasGallonsThisYear()) {
                    setGallonsThisYear(loyaltyRewardInfo.getGallonsThisYear());
                }
                mergeUnknownFields(loyaltyRewardInfo.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LoyaltyRewardInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LoyaltyRewardInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LoyaltyRewardInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LoyaltyRewardInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LoyaltyRewardInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LoyaltyRewardInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LoyaltyRewardInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LoyaltyRewardInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LoyaltyRewardInfo parseFrom(InputStream inputStream) {
            return (LoyaltyRewardInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LoyaltyRewardInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LoyaltyRewardInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LoyaltyRewardInfo parseFrom(CodedInputStream codedInputStream) {
            return (LoyaltyRewardInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LoyaltyRewardInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LoyaltyRewardInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private LoyaltyRewardInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.currentTier_ = "";
            this.earnedReward_ = "";
            this.rewardCategory_ = "";
            this.marginCategory_ = "";
            this.gallonsToNextTier_ = 0;
            this.nextTier_ = "";
            this.earningPointsPerGallon_ = 0;
            this.gallonsThisYear_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ LoyaltyRewardInfo(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class LoyaltyUserInfo extends GeneratedMessageV3 implements LoyaltyUserInfoOrBuilder {
        public static final int CONTACT_ID_FIELD_NUMBER = 2;
        public static final int FIRST_NAME_FIELD_NUMBER = 3;
        public static final int LAST_NAME_FIELD_NUMBER = 4;
        public static final int LOYALTY_CARD_NUMBER_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object contactId_;
        private volatile Object firstName_;
        private volatile Object lastName_;
        private volatile Object loyaltyCardNumber_;
        private byte memoizedIsInitialized;
        private static final LoyaltyUserInfo DEFAULT_INSTANCE = new LoyaltyUserInfo();

        @Deprecated
        public static final Parser<LoyaltyUserInfo> PARSER = new AbstractParser<LoyaltyUserInfo>() { // from class: com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfo.1
            @Override // com.google.protobuf.Parser
            public LoyaltyUserInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LoyaltyUserInfo.newBuilder();
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

        private LoyaltyUserInfo() {
            this.loyaltyCardNumber_ = "";
            this.contactId_ = "";
            this.firstName_ = "";
            this.lastName_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.loyaltyCardNumber_ = "";
            this.contactId_ = "";
            this.firstName_ = "";
            this.lastName_ = "";
        }

        public static LoyaltyUserInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyUserInfo_descriptor;
        }

        public static Builder newBuilder(LoyaltyUserInfo loyaltyUserInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(loyaltyUserInfo);
        }

        public static LoyaltyUserInfo parseDelimitedFrom(InputStream inputStream) {
            return (LoyaltyUserInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LoyaltyUserInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LoyaltyUserInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LoyaltyUserInfo)) {
                return super.equals(obj);
            }
            LoyaltyUserInfo loyaltyUserInfo = (LoyaltyUserInfo) obj;
            if (hasLoyaltyCardNumber() != loyaltyUserInfo.hasLoyaltyCardNumber()) {
                return false;
            }
            if ((hasLoyaltyCardNumber() && !getLoyaltyCardNumber().equals(loyaltyUserInfo.getLoyaltyCardNumber())) || hasContactId() != loyaltyUserInfo.hasContactId()) {
                return false;
            }
            if ((hasContactId() && !getContactId().equals(loyaltyUserInfo.getContactId())) || hasFirstName() != loyaltyUserInfo.hasFirstName()) {
                return false;
            }
            if ((!hasFirstName() || getFirstName().equals(loyaltyUserInfo.getFirstName())) && hasLastName() == loyaltyUserInfo.hasLastName()) {
                return (!hasLastName() || getLastName().equals(loyaltyUserInfo.getLastName())) && getUnknownFields().equals(loyaltyUserInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
        public String getContactId() {
            Object obj = this.contactId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.contactId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
        public ByteString getContactIdBytes() {
            Object obj = this.contactId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.contactId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
        public String getFirstName() {
            Object obj = this.firstName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.firstName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
        public ByteString getFirstNameBytes() {
            Object obj = this.firstName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.firstName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
        public String getLastName() {
            Object obj = this.lastName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.lastName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
        public ByteString getLastNameBytes() {
            Object obj = this.lastName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lastName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
        public String getLoyaltyCardNumber() {
            Object obj = this.loyaltyCardNumber_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.loyaltyCardNumber_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
        public ByteString getLoyaltyCardNumberBytes() {
            Object obj = this.loyaltyCardNumber_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.loyaltyCardNumber_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LoyaltyUserInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.loyaltyCardNumber_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.contactId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.firstName_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.lastName_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
        public boolean hasContactId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
        public boolean hasFirstName() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
        public boolean hasLastName() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
        public boolean hasLoyaltyCardNumber() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasLoyaltyCardNumber()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getLoyaltyCardNumber().hashCode();
            }
            if (hasContactId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getContactId().hashCode();
            }
            if (hasFirstName()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getFirstName().hashCode();
            }
            if (hasLastName()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getLastName().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyUserInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(LoyaltyUserInfo.class, Builder.class);
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
            return new LoyaltyUserInfo();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.loyaltyCardNumber_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.contactId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.firstName_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.lastName_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LoyaltyUserInfoOrBuilder {
            private int bitField0_;
            private Object contactId_;
            private Object firstName_;
            private Object lastName_;
            private Object loyaltyCardNumber_;

            private Builder() {
                this.loyaltyCardNumber_ = "";
                this.contactId_ = "";
                this.firstName_ = "";
                this.lastName_ = "";
            }

            private void buildPartial0(LoyaltyUserInfo loyaltyUserInfo) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    loyaltyUserInfo.loyaltyCardNumber_ = this.loyaltyCardNumber_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    loyaltyUserInfo.contactId_ = this.contactId_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    loyaltyUserInfo.firstName_ = this.firstName_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    loyaltyUserInfo.lastName_ = this.lastName_;
                    i14 |= 8;
                }
                loyaltyUserInfo.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyUserInfo_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LoyaltyUserInfo build() {
                LoyaltyUserInfo loyaltyUserInfoBuildPartial = buildPartial();
                if (loyaltyUserInfoBuildPartial.isInitialized()) {
                    return loyaltyUserInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) loyaltyUserInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LoyaltyUserInfo buildPartial() {
                LoyaltyUserInfo loyaltyUserInfo = new LoyaltyUserInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(loyaltyUserInfo);
                }
                onBuilt();
                return loyaltyUserInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.loyaltyCardNumber_ = "";
                this.contactId_ = "";
                this.firstName_ = "";
                this.lastName_ = "";
                return this;
            }

            public Builder clearContactId() {
                this.contactId_ = LoyaltyUserInfo.getDefaultInstance().getContactId();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFirstName() {
                this.firstName_ = LoyaltyUserInfo.getDefaultInstance().getFirstName();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearLastName() {
                this.lastName_ = LoyaltyUserInfo.getDefaultInstance().getLastName();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearLoyaltyCardNumber() {
                this.loyaltyCardNumber_ = LoyaltyUserInfo.getDefaultInstance().getLoyaltyCardNumber();
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

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
            public String getContactId() {
                Object obj = this.contactId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.contactId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
            public ByteString getContactIdBytes() {
                Object obj = this.contactId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.contactId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyUserInfo_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
            public String getFirstName() {
                Object obj = this.firstName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.firstName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
            public ByteString getFirstNameBytes() {
                Object obj = this.firstName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.firstName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
            public String getLastName() {
                Object obj = this.lastName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.lastName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
            public ByteString getLastNameBytes() {
                Object obj = this.lastName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lastName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
            public String getLoyaltyCardNumber() {
                Object obj = this.loyaltyCardNumber_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.loyaltyCardNumber_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
            public ByteString getLoyaltyCardNumberBytes() {
                Object obj = this.loyaltyCardNumber_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.loyaltyCardNumber_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
            public boolean hasContactId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
            public boolean hasFirstName() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
            public boolean hasLastName() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.LoyaltyUserInfoOrBuilder
            public boolean hasLoyaltyCardNumber() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_LoyaltyUserInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(LoyaltyUserInfo.class, Builder.class);
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
                                    this.loyaltyCardNumber_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.contactId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.firstName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.lastName_ = codedInputStream.readBytes();
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

            public Builder setContactId(String str) {
                str.getClass();
                this.contactId_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setContactIdBytes(ByteString byteString) {
                byteString.getClass();
                this.contactId_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setFirstName(String str) {
                str.getClass();
                this.firstName_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setFirstNameBytes(ByteString byteString) {
                byteString.getClass();
                this.firstName_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLastName(String str) {
                str.getClass();
                this.lastName_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setLastNameBytes(ByteString byteString) {
                byteString.getClass();
                this.lastName_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setLoyaltyCardNumber(String str) {
                str.getClass();
                this.loyaltyCardNumber_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setLoyaltyCardNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.loyaltyCardNumber_ = byteString;
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
            public LoyaltyUserInfo getDefaultInstanceForType() {
                return LoyaltyUserInfo.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.loyaltyCardNumber_ = "";
                this.contactId_ = "";
                this.firstName_ = "";
                this.lastName_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LoyaltyUserInfo) {
                    return mergeFrom((LoyaltyUserInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LoyaltyUserInfo loyaltyUserInfo) {
                if (loyaltyUserInfo == LoyaltyUserInfo.getDefaultInstance()) {
                    return this;
                }
                if (loyaltyUserInfo.hasLoyaltyCardNumber()) {
                    this.loyaltyCardNumber_ = loyaltyUserInfo.loyaltyCardNumber_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (loyaltyUserInfo.hasContactId()) {
                    this.contactId_ = loyaltyUserInfo.contactId_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (loyaltyUserInfo.hasFirstName()) {
                    this.firstName_ = loyaltyUserInfo.firstName_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (loyaltyUserInfo.hasLastName()) {
                    this.lastName_ = loyaltyUserInfo.lastName_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                mergeUnknownFields(loyaltyUserInfo.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LoyaltyUserInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LoyaltyUserInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LoyaltyUserInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LoyaltyUserInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LoyaltyUserInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LoyaltyUserInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LoyaltyUserInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LoyaltyUserInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LoyaltyUserInfo parseFrom(InputStream inputStream) {
            return (LoyaltyUserInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LoyaltyUserInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LoyaltyUserInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LoyaltyUserInfo parseFrom(CodedInputStream codedInputStream) {
            return (LoyaltyUserInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LoyaltyUserInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LoyaltyUserInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private LoyaltyUserInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.loyaltyCardNumber_ = "";
            this.contactId_ = "";
            this.firstName_ = "";
            this.lastName_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ LoyaltyUserInfo(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class OTRHealthWorkout extends GeneratedMessageV3 implements OTRHealthWorkoutOrBuilder {
        public static final int FIT_SPORT_FIELD_NUMBER = 2;
        public static final int FIT_SUB_SPORT_FIELD_NUMBER = 3;
        public static final int STAGES_FIELD_NUMBER = 4;
        public static final int WORKOUT_NAME_FIELD_NUMBER = 1;
        public static final int WORKOUT_TYPE_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int fitSport_;
        private int fitSubSport_;
        private byte memoizedIsInitialized;
        private List<OTRHealthWorkoutStage> stages_;
        private volatile Object workoutName_;
        private int workoutType_;
        private static final OTRHealthWorkout DEFAULT_INSTANCE = new OTRHealthWorkout();

        @Deprecated
        public static final Parser<OTRHealthWorkout> PARSER = new AbstractParser<OTRHealthWorkout>() { // from class: com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkout.1
            @Override // com.google.protobuf.Parser
            public OTRHealthWorkout parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = OTRHealthWorkout.newBuilder();
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

        private OTRHealthWorkout() {
            this.workoutName_ = "";
            this.fitSport_ = 0;
            this.fitSubSport_ = 0;
            this.workoutType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.workoutName_ = "";
            this.stages_ = Collections.EMPTY_LIST;
            this.workoutType_ = 0;
        }

        public static OTRHealthWorkout getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_OTRHealthWorkout_descriptor;
        }

        public static Builder newBuilder(OTRHealthWorkout oTRHealthWorkout) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(oTRHealthWorkout);
        }

        public static OTRHealthWorkout parseDelimitedFrom(InputStream inputStream) {
            return (OTRHealthWorkout) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static OTRHealthWorkout parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<OTRHealthWorkout> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OTRHealthWorkout)) {
                return super.equals(obj);
            }
            OTRHealthWorkout oTRHealthWorkout = (OTRHealthWorkout) obj;
            if (hasWorkoutName() != oTRHealthWorkout.hasWorkoutName()) {
                return false;
            }
            if ((hasWorkoutName() && !getWorkoutName().equals(oTRHealthWorkout.getWorkoutName())) || hasFitSport() != oTRHealthWorkout.hasFitSport()) {
                return false;
            }
            if ((hasFitSport() && getFitSport() != oTRHealthWorkout.getFitSport()) || hasFitSubSport() != oTRHealthWorkout.hasFitSubSport()) {
                return false;
            }
            if ((!hasFitSubSport() || getFitSubSport() == oTRHealthWorkout.getFitSubSport()) && getStagesList().equals(oTRHealthWorkout.getStagesList()) && hasWorkoutType() == oTRHealthWorkout.hasWorkoutType()) {
                return (!hasWorkoutType() || this.workoutType_ == oTRHealthWorkout.workoutType_) && getUnknownFields().equals(oTRHealthWorkout.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
        public int getFitSport() {
            return this.fitSport_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
        public int getFitSubSport() {
            return this.fitSubSport_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<OTRHealthWorkout> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.workoutName_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(2, this.fitSport_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(3, this.fitSubSport_);
            }
            for (int i15 = 0; i15 < this.stages_.size(); i15++) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(4, this.stages_.get(i15));
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(5, this.workoutType_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
        public OTRHealthWorkoutStage getStages(int i14) {
            return this.stages_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
        public int getStagesCount() {
            return this.stages_.size();
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
        public List<OTRHealthWorkoutStage> getStagesList() {
            return this.stages_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
        public OTRHealthWorkoutStageOrBuilder getStagesOrBuilder(int i14) {
            return this.stages_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
        public List<? extends OTRHealthWorkoutStageOrBuilder> getStagesOrBuilderList() {
            return this.stages_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
        public String getWorkoutName() {
            Object obj = this.workoutName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.workoutName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
        public ByteString getWorkoutNameBytes() {
            Object obj = this.workoutName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.workoutName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
        public WorkoutType getWorkoutType() {
            WorkoutType workoutTypeForNumber = WorkoutType.forNumber(this.workoutType_);
            return workoutTypeForNumber == null ? WorkoutType.UNKNOWN_TYPE : workoutTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
        public boolean hasFitSport() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
        public boolean hasFitSubSport() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
        public boolean hasWorkoutName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
        public boolean hasWorkoutType() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasWorkoutName()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getWorkoutName().hashCode();
            }
            if (hasFitSport()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getFitSport();
            }
            if (hasFitSubSport()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getFitSubSport();
            }
            if (getStagesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getStagesList().hashCode();
            }
            if (hasWorkoutType()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + this.workoutType_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_OTRHealthWorkout_fieldAccessorTable.ensureFieldAccessorsInitialized(OTRHealthWorkout.class, Builder.class);
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
            return new OTRHealthWorkout();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.workoutName_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.fitSport_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.fitSubSport_);
            }
            for (int i14 = 0; i14 < this.stages_.size(); i14++) {
                codedOutputStream.writeMessage(4, this.stages_.get(i14));
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(5, this.workoutType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OTRHealthWorkoutOrBuilder {
            private int bitField0_;
            private int fitSport_;
            private int fitSubSport_;
            private RepeatedFieldBuilderV3<OTRHealthWorkoutStage, OTRHealthWorkoutStage.Builder, OTRHealthWorkoutStageOrBuilder> stagesBuilder_;
            private List<OTRHealthWorkoutStage> stages_;
            private Object workoutName_;
            private int workoutType_;

            private Builder() {
                this.workoutName_ = "";
                this.stages_ = Collections.EMPTY_LIST;
                this.workoutType_ = 0;
            }

            private void buildPartial0(OTRHealthWorkout oTRHealthWorkout) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    oTRHealthWorkout.workoutName_ = this.workoutName_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    oTRHealthWorkout.fitSport_ = this.fitSport_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    oTRHealthWorkout.fitSubSport_ = this.fitSubSport_;
                    i14 |= 4;
                }
                if ((i15 & 16) != 0) {
                    oTRHealthWorkout.workoutType_ = this.workoutType_;
                    i14 |= 8;
                }
                oTRHealthWorkout.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(OTRHealthWorkout oTRHealthWorkout) {
                RepeatedFieldBuilderV3<OTRHealthWorkoutStage, OTRHealthWorkoutStage.Builder, OTRHealthWorkoutStageOrBuilder> repeatedFieldBuilderV3 = this.stagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    oTRHealthWorkout.stages_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 8) != 0) {
                    this.stages_ = Collections.unmodifiableList(this.stages_);
                    this.bitField0_ &= -9;
                }
                oTRHealthWorkout.stages_ = this.stages_;
            }

            private void ensureStagesIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.stages_ = new ArrayList(this.stages_);
                    this.bitField0_ |= 8;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_OTRHealthWorkout_descriptor;
            }

            private RepeatedFieldBuilderV3<OTRHealthWorkoutStage, OTRHealthWorkoutStage.Builder, OTRHealthWorkoutStageOrBuilder> getStagesFieldBuilder() {
                if (this.stagesBuilder_ == null) {
                    this.stagesBuilder_ = new RepeatedFieldBuilderV3<>(this.stages_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                    this.stages_ = null;
                }
                return this.stagesBuilder_;
            }

            public Builder addAllStages(Iterable<? extends OTRHealthWorkoutStage> iterable) {
                RepeatedFieldBuilderV3<OTRHealthWorkoutStage, OTRHealthWorkoutStage.Builder, OTRHealthWorkoutStageOrBuilder> repeatedFieldBuilderV3 = this.stagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureStagesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.stages_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addStages(OTRHealthWorkoutStage.Builder builder) {
                RepeatedFieldBuilderV3<OTRHealthWorkoutStage, OTRHealthWorkoutStage.Builder, OTRHealthWorkoutStageOrBuilder> repeatedFieldBuilderV3 = this.stagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureStagesIsMutable();
                this.stages_.add(builder.build());
                onChanged();
                return this;
            }

            public OTRHealthWorkoutStage.Builder addStagesBuilder() {
                return (OTRHealthWorkoutStage.Builder) getStagesFieldBuilder().addBuilder(OTRHealthWorkoutStage.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OTRHealthWorkout build() {
                OTRHealthWorkout oTRHealthWorkoutBuildPartial = buildPartial();
                if (oTRHealthWorkoutBuildPartial.isInitialized()) {
                    return oTRHealthWorkoutBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) oTRHealthWorkoutBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OTRHealthWorkout buildPartial() {
                OTRHealthWorkout oTRHealthWorkout = new OTRHealthWorkout(this);
                buildPartialRepeatedFields(oTRHealthWorkout);
                if (this.bitField0_ != 0) {
                    buildPartial0(oTRHealthWorkout);
                }
                onBuilt();
                return oTRHealthWorkout;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.workoutName_ = "";
                this.fitSport_ = 0;
                this.fitSubSport_ = 0;
                RepeatedFieldBuilderV3<OTRHealthWorkoutStage, OTRHealthWorkoutStage.Builder, OTRHealthWorkoutStageOrBuilder> repeatedFieldBuilderV3 = this.stagesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.stages_ = Collections.EMPTY_LIST;
                } else {
                    this.stages_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -9;
                this.workoutType_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFitSport() {
                this.bitField0_ &= -3;
                this.fitSport_ = 0;
                onChanged();
                return this;
            }

            public Builder clearFitSubSport() {
                this.bitField0_ &= -5;
                this.fitSubSport_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStages() {
                RepeatedFieldBuilderV3<OTRHealthWorkoutStage, OTRHealthWorkoutStage.Builder, OTRHealthWorkoutStageOrBuilder> repeatedFieldBuilderV3 = this.stagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.stages_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearWorkoutName() {
                this.workoutName_ = OTRHealthWorkout.getDefaultInstance().getWorkoutName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearWorkoutType() {
                this.bitField0_ &= -17;
                this.workoutType_ = 0;
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
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_OTRHealthWorkout_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
            public int getFitSport() {
                return this.fitSport_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
            public int getFitSubSport() {
                return this.fitSubSport_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
            public OTRHealthWorkoutStage getStages(int i14) {
                RepeatedFieldBuilderV3<OTRHealthWorkoutStage, OTRHealthWorkoutStage.Builder, OTRHealthWorkoutStageOrBuilder> repeatedFieldBuilderV3 = this.stagesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.stages_.get(i14) : (OTRHealthWorkoutStage) repeatedFieldBuilderV3.getMessage(i14);
            }

            public OTRHealthWorkoutStage.Builder getStagesBuilder(int i14) {
                return (OTRHealthWorkoutStage.Builder) getStagesFieldBuilder().getBuilder(i14);
            }

            public List<OTRHealthWorkoutStage.Builder> getStagesBuilderList() {
                return getStagesFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
            public int getStagesCount() {
                RepeatedFieldBuilderV3<OTRHealthWorkoutStage, OTRHealthWorkoutStage.Builder, OTRHealthWorkoutStageOrBuilder> repeatedFieldBuilderV3 = this.stagesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.stages_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
            public List<OTRHealthWorkoutStage> getStagesList() {
                RepeatedFieldBuilderV3<OTRHealthWorkoutStage, OTRHealthWorkoutStage.Builder, OTRHealthWorkoutStageOrBuilder> repeatedFieldBuilderV3 = this.stagesBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.stages_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
            public OTRHealthWorkoutStageOrBuilder getStagesOrBuilder(int i14) {
                RepeatedFieldBuilderV3<OTRHealthWorkoutStage, OTRHealthWorkoutStage.Builder, OTRHealthWorkoutStageOrBuilder> repeatedFieldBuilderV3 = this.stagesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.stages_.get(i14) : (OTRHealthWorkoutStageOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
            public List<? extends OTRHealthWorkoutStageOrBuilder> getStagesOrBuilderList() {
                RepeatedFieldBuilderV3<OTRHealthWorkoutStage, OTRHealthWorkoutStage.Builder, OTRHealthWorkoutStageOrBuilder> repeatedFieldBuilderV3 = this.stagesBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.stages_);
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
            public String getWorkoutName() {
                Object obj = this.workoutName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.workoutName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
            public ByteString getWorkoutNameBytes() {
                Object obj = this.workoutName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.workoutName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
            public WorkoutType getWorkoutType() {
                WorkoutType workoutTypeForNumber = WorkoutType.forNumber(this.workoutType_);
                return workoutTypeForNumber == null ? WorkoutType.UNKNOWN_TYPE : workoutTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
            public boolean hasFitSport() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
            public boolean hasFitSubSport() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
            public boolean hasWorkoutName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutOrBuilder
            public boolean hasWorkoutType() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_OTRHealthWorkout_fieldAccessorTable.ensureFieldAccessorsInitialized(OTRHealthWorkout.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(OTRHealthWorkout oTRHealthWorkout) {
                if (oTRHealthWorkout == OTRHealthWorkout.getDefaultInstance()) {
                    return this;
                }
                if (oTRHealthWorkout.hasWorkoutName()) {
                    this.workoutName_ = oTRHealthWorkout.workoutName_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (oTRHealthWorkout.hasFitSport()) {
                    setFitSport(oTRHealthWorkout.getFitSport());
                }
                if (oTRHealthWorkout.hasFitSubSport()) {
                    setFitSubSport(oTRHealthWorkout.getFitSubSport());
                }
                if (this.stagesBuilder_ == null) {
                    if (!oTRHealthWorkout.stages_.isEmpty()) {
                        if (this.stages_.isEmpty()) {
                            this.stages_ = oTRHealthWorkout.stages_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureStagesIsMutable();
                            this.stages_.addAll(oTRHealthWorkout.stages_);
                        }
                        onChanged();
                    }
                } else if (!oTRHealthWorkout.stages_.isEmpty()) {
                    boolean zIsEmpty = this.stagesBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<OTRHealthWorkoutStage, OTRHealthWorkoutStage.Builder, OTRHealthWorkoutStageOrBuilder> repeatedFieldBuilderV3 = this.stagesBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.stagesBuilder_ = null;
                        this.stages_ = oTRHealthWorkout.stages_;
                        this.bitField0_ &= -9;
                        this.stagesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getStagesFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(oTRHealthWorkout.stages_);
                    }
                }
                if (oTRHealthWorkout.hasWorkoutType()) {
                    setWorkoutType(oTRHealthWorkout.getWorkoutType());
                }
                mergeUnknownFields(oTRHealthWorkout.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeStages(int i14) {
                RepeatedFieldBuilderV3<OTRHealthWorkoutStage, OTRHealthWorkoutStage.Builder, OTRHealthWorkoutStageOrBuilder> repeatedFieldBuilderV3 = this.stagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureStagesIsMutable();
                this.stages_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setFitSport(int i14) {
                this.fitSport_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setFitSubSport(int i14) {
                this.fitSubSport_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStages(int i14, OTRHealthWorkoutStage.Builder builder) {
                RepeatedFieldBuilderV3<OTRHealthWorkoutStage, OTRHealthWorkoutStage.Builder, OTRHealthWorkoutStageOrBuilder> repeatedFieldBuilderV3 = this.stagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureStagesIsMutable();
                this.stages_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setWorkoutName(String str) {
                str.getClass();
                this.workoutName_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setWorkoutNameBytes(ByteString byteString) {
                byteString.getClass();
                this.workoutName_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setWorkoutType(WorkoutType workoutType) {
                workoutType.getClass();
                this.bitField0_ |= 16;
                this.workoutType_ = workoutType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public OTRHealthWorkout getDefaultInstanceForType() {
                return OTRHealthWorkout.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public OTRHealthWorkoutStage.Builder addStagesBuilder(int i14) {
                return (OTRHealthWorkoutStage.Builder) getStagesFieldBuilder().addBuilder(i14, OTRHealthWorkoutStage.getDefaultInstance());
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.workoutName_ = "";
                this.stages_ = Collections.EMPTY_LIST;
                this.workoutType_ = 0;
            }

            public Builder addStages(int i14, OTRHealthWorkoutStage oTRHealthWorkoutStage) {
                RepeatedFieldBuilderV3<OTRHealthWorkoutStage, OTRHealthWorkoutStage.Builder, OTRHealthWorkoutStageOrBuilder> repeatedFieldBuilderV3 = this.stagesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    oTRHealthWorkoutStage.getClass();
                    ensureStagesIsMutable();
                    this.stages_.add(i14, oTRHealthWorkoutStage);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, oTRHealthWorkoutStage);
                return this;
            }

            public Builder setStages(int i14, OTRHealthWorkoutStage oTRHealthWorkoutStage) {
                RepeatedFieldBuilderV3<OTRHealthWorkoutStage, OTRHealthWorkoutStage.Builder, OTRHealthWorkoutStageOrBuilder> repeatedFieldBuilderV3 = this.stagesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    oTRHealthWorkoutStage.getClass();
                    ensureStagesIsMutable();
                    this.stages_.set(i14, oTRHealthWorkoutStage);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, oTRHealthWorkoutStage);
                return this;
            }

            public Builder addStages(OTRHealthWorkoutStage oTRHealthWorkoutStage) {
                RepeatedFieldBuilderV3<OTRHealthWorkoutStage, OTRHealthWorkoutStage.Builder, OTRHealthWorkoutStageOrBuilder> repeatedFieldBuilderV3 = this.stagesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    oTRHealthWorkoutStage.getClass();
                    ensureStagesIsMutable();
                    this.stages_.add(oTRHealthWorkoutStage);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(oTRHealthWorkoutStage);
                return this;
            }

            public Builder addStages(int i14, OTRHealthWorkoutStage.Builder builder) {
                RepeatedFieldBuilderV3<OTRHealthWorkoutStage, OTRHealthWorkoutStage.Builder, OTRHealthWorkoutStageOrBuilder> repeatedFieldBuilderV3 = this.stagesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureStagesIsMutable();
                    this.stages_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof OTRHealthWorkout) {
                    return mergeFrom((OTRHealthWorkout) message);
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
                                    this.workoutName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.fitSport_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.fitSubSport_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    OTRHealthWorkoutStage oTRHealthWorkoutStage = (OTRHealthWorkoutStage) codedInputStream.readMessage(OTRHealthWorkoutStage.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<OTRHealthWorkoutStage, OTRHealthWorkoutStage.Builder, OTRHealthWorkoutStageOrBuilder> repeatedFieldBuilderV3 = this.stagesBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureStagesIsMutable();
                                        this.stages_.add(oTRHealthWorkoutStage);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(oTRHealthWorkoutStage);
                                    }
                                } else if (tag != 40) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int i14 = codedInputStream.readEnum();
                                    if (WorkoutType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(5, i14);
                                    } else {
                                        this.workoutType_ = i14;
                                        this.bitField0_ |= 16;
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
        public OTRHealthWorkout getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static OTRHealthWorkout parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OTRHealthWorkout) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OTRHealthWorkout parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static OTRHealthWorkout parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OTRHealthWorkout parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static OTRHealthWorkout parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static OTRHealthWorkout parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static OTRHealthWorkout parseFrom(InputStream inputStream) {
            return (OTRHealthWorkout) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static OTRHealthWorkout parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OTRHealthWorkout) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OTRHealthWorkout parseFrom(CodedInputStream codedInputStream) {
            return (OTRHealthWorkout) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static OTRHealthWorkout parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OTRHealthWorkout) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private OTRHealthWorkout(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.workoutName_ = "";
            this.fitSport_ = 0;
            this.fitSubSport_ = 0;
            this.workoutType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ OTRHealthWorkout(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class OTRHealthWorkoutStage extends GeneratedMessageV3 implements OTRHealthWorkoutStageOrBuilder {
        public static final int EXERCISE_CATEGORY_FIELD_NUMBER = 3;
        public static final int EXERCISE_NAME_FIELD_NUMBER = 4;
        public static final int STAGE_DURATION_FIELD_NUMBER = 2;
        public static final int STAGE_TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int exerciseCategory_;
        private int exerciseName_;
        private byte memoizedIsInitialized;
        private int stageDuration_;
        private int stageType_;
        private static final OTRHealthWorkoutStage DEFAULT_INSTANCE = new OTRHealthWorkoutStage();

        @Deprecated
        public static final Parser<OTRHealthWorkoutStage> PARSER = new AbstractParser<OTRHealthWorkoutStage>() { // from class: com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutStage.1
            @Override // com.google.protobuf.Parser
            public OTRHealthWorkoutStage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = OTRHealthWorkoutStage.newBuilder();
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

        private OTRHealthWorkoutStage(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.stageType_ = 0;
            this.stageDuration_ = 0;
            this.exerciseCategory_ = 0;
            this.exerciseName_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static OTRHealthWorkoutStage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_OTRHealthWorkoutStage_descriptor;
        }

        public static Builder newBuilder(OTRHealthWorkoutStage oTRHealthWorkoutStage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(oTRHealthWorkoutStage);
        }

        public static OTRHealthWorkoutStage parseDelimitedFrom(InputStream inputStream) {
            return (OTRHealthWorkoutStage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static OTRHealthWorkoutStage parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<OTRHealthWorkoutStage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OTRHealthWorkoutStage)) {
                return super.equals(obj);
            }
            OTRHealthWorkoutStage oTRHealthWorkoutStage = (OTRHealthWorkoutStage) obj;
            if (hasStageType() != oTRHealthWorkoutStage.hasStageType()) {
                return false;
            }
            if ((hasStageType() && this.stageType_ != oTRHealthWorkoutStage.stageType_) || hasStageDuration() != oTRHealthWorkoutStage.hasStageDuration()) {
                return false;
            }
            if ((hasStageDuration() && getStageDuration() != oTRHealthWorkoutStage.getStageDuration()) || hasExerciseCategory() != oTRHealthWorkoutStage.hasExerciseCategory()) {
                return false;
            }
            if ((!hasExerciseCategory() || getExerciseCategory() == oTRHealthWorkoutStage.getExerciseCategory()) && hasExerciseName() == oTRHealthWorkoutStage.hasExerciseName()) {
                return (!hasExerciseName() || getExerciseName() == oTRHealthWorkoutStage.getExerciseName()) && getUnknownFields().equals(oTRHealthWorkoutStage.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutStageOrBuilder
        public int getExerciseCategory() {
            return this.exerciseCategory_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutStageOrBuilder
        public int getExerciseName() {
            return this.exerciseName_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<OTRHealthWorkoutStage> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.stageType_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.stageDuration_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(3, this.exerciseCategory_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(4, this.exerciseName_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutStageOrBuilder
        public int getStageDuration() {
            return this.stageDuration_;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutStageOrBuilder
        public WorkoutStageType getStageType() {
            WorkoutStageType workoutStageTypeForNumber = WorkoutStageType.forNumber(this.stageType_);
            return workoutStageTypeForNumber == null ? WorkoutStageType.UNKNOWN_STAGE : workoutStageTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutStageOrBuilder
        public boolean hasExerciseCategory() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutStageOrBuilder
        public boolean hasExerciseName() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutStageOrBuilder
        public boolean hasStageDuration() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutStageOrBuilder
        public boolean hasStageType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStageType()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.stageType_;
            }
            if (hasStageDuration()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getStageDuration();
            }
            if (hasExerciseCategory()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getExerciseCategory();
            }
            if (hasExerciseName()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getExerciseName();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_OTRHealthWorkoutStage_fieldAccessorTable.ensureFieldAccessorsInitialized(OTRHealthWorkoutStage.class, Builder.class);
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
            return new OTRHealthWorkoutStage();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.stageType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.stageDuration_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.exerciseCategory_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.exerciseName_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OTRHealthWorkoutStageOrBuilder {
            private int bitField0_;
            private int exerciseCategory_;
            private int exerciseName_;
            private int stageDuration_;
            private int stageType_;

            private Builder() {
                this.stageType_ = 0;
            }

            private void buildPartial0(OTRHealthWorkoutStage oTRHealthWorkoutStage) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    oTRHealthWorkoutStage.stageType_ = this.stageType_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    oTRHealthWorkoutStage.stageDuration_ = this.stageDuration_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    oTRHealthWorkoutStage.exerciseCategory_ = this.exerciseCategory_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    oTRHealthWorkoutStage.exerciseName_ = this.exerciseName_;
                    i14 |= 8;
                }
                oTRHealthWorkoutStage.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_OTRHealthWorkoutStage_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OTRHealthWorkoutStage build() {
                OTRHealthWorkoutStage oTRHealthWorkoutStageBuildPartial = buildPartial();
                if (oTRHealthWorkoutStageBuildPartial.isInitialized()) {
                    return oTRHealthWorkoutStageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) oTRHealthWorkoutStageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OTRHealthWorkoutStage buildPartial() {
                OTRHealthWorkoutStage oTRHealthWorkoutStage = new OTRHealthWorkoutStage(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(oTRHealthWorkoutStage);
                }
                onBuilt();
                return oTRHealthWorkoutStage;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.stageType_ = 0;
                this.stageDuration_ = 0;
                this.exerciseCategory_ = 0;
                this.exerciseName_ = 0;
                return this;
            }

            public Builder clearExerciseCategory() {
                this.bitField0_ &= -5;
                this.exerciseCategory_ = 0;
                onChanged();
                return this;
            }

            public Builder clearExerciseName() {
                this.bitField0_ &= -9;
                this.exerciseName_ = 0;
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

            public Builder clearStageDuration() {
                this.bitField0_ &= -3;
                this.stageDuration_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStageType() {
                this.bitField0_ &= -2;
                this.stageType_ = 0;
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
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_OTRHealthWorkoutStage_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutStageOrBuilder
            public int getExerciseCategory() {
                return this.exerciseCategory_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutStageOrBuilder
            public int getExerciseName() {
                return this.exerciseName_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutStageOrBuilder
            public int getStageDuration() {
                return this.stageDuration_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutStageOrBuilder
            public WorkoutStageType getStageType() {
                WorkoutStageType workoutStageTypeForNumber = WorkoutStageType.forNumber(this.stageType_);
                return workoutStageTypeForNumber == null ? WorkoutStageType.UNKNOWN_STAGE : workoutStageTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutStageOrBuilder
            public boolean hasExerciseCategory() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutStageOrBuilder
            public boolean hasExerciseName() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutStageOrBuilder
            public boolean hasStageDuration() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.OTRHealthWorkoutStageOrBuilder
            public boolean hasStageType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_OTRHealthWorkoutStage_fieldAccessorTable.ensureFieldAccessorsInitialized(OTRHealthWorkoutStage.class, Builder.class);
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
                                    if (WorkoutStageType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.stageType_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.stageDuration_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.exerciseCategory_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.exerciseName_ = codedInputStream.readUInt32();
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

            public Builder setExerciseName(int i14) {
                this.exerciseName_ = i14;
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

            public Builder setStageDuration(int i14) {
                this.stageDuration_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStageType(WorkoutStageType workoutStageType) {
                workoutStageType.getClass();
                this.bitField0_ |= 1;
                this.stageType_ = workoutStageType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public OTRHealthWorkoutStage getDefaultInstanceForType() {
                return OTRHealthWorkoutStage.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.stageType_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof OTRHealthWorkoutStage) {
                    return mergeFrom((OTRHealthWorkoutStage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(OTRHealthWorkoutStage oTRHealthWorkoutStage) {
                if (oTRHealthWorkoutStage == OTRHealthWorkoutStage.getDefaultInstance()) {
                    return this;
                }
                if (oTRHealthWorkoutStage.hasStageType()) {
                    setStageType(oTRHealthWorkoutStage.getStageType());
                }
                if (oTRHealthWorkoutStage.hasStageDuration()) {
                    setStageDuration(oTRHealthWorkoutStage.getStageDuration());
                }
                if (oTRHealthWorkoutStage.hasExerciseCategory()) {
                    setExerciseCategory(oTRHealthWorkoutStage.getExerciseCategory());
                }
                if (oTRHealthWorkoutStage.hasExerciseName()) {
                    setExerciseName(oTRHealthWorkoutStage.getExerciseName());
                }
                mergeUnknownFields(oTRHealthWorkoutStage.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public OTRHealthWorkoutStage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static OTRHealthWorkoutStage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OTRHealthWorkoutStage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OTRHealthWorkoutStage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static OTRHealthWorkoutStage parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OTRHealthWorkoutStage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static OTRHealthWorkoutStage parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static OTRHealthWorkoutStage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static OTRHealthWorkoutStage parseFrom(InputStream inputStream) {
            return (OTRHealthWorkoutStage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ OTRHealthWorkoutStage(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static OTRHealthWorkoutStage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OTRHealthWorkoutStage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private OTRHealthWorkoutStage() {
            this.stageDuration_ = 0;
            this.exerciseCategory_ = 0;
            this.exerciseName_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.stageType_ = 0;
        }

        public static OTRHealthWorkoutStage parseFrom(CodedInputStream codedInputStream) {
            return (OTRHealthWorkoutStage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static OTRHealthWorkoutStage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OTRHealthWorkoutStage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TruckStopLoyaltyInfo extends GeneratedMessageV3 implements TruckStopLoyaltyInfoOrBuilder {
        public static final int BALANCES_FIELD_NUMBER = 3;
        public static final int BONUS_OFFER_INFO_FIELD_NUMBER = 6;
        public static final int CAMPAIGN_INFO_FIELD_NUMBER = 7;
        public static final int GOAL_INFO_FIELD_NUMBER = 5;
        public static final int IS_LOGGED_IN_FIELD_NUMBER = 8;
        public static final int REWARD_INFO_FIELD_NUMBER = 4;
        public static final int USER_INFO_FIELD_NUMBER = 2;
        public static final int VENDOR_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private LoyaltyBalances balances_;
        private int bitField0_;
        private LoyaltyBonusOfferInfo bonusOfferInfo_;
        private LoyaltyCampaignInfo campaignInfo_;
        private LoyaltyGoalInfo goalInfo_;
        private boolean isLoggedIn_;
        private byte memoizedIsInitialized;
        private LoyaltyRewardInfo rewardInfo_;
        private LoyaltyUserInfo userInfo_;
        private int vendor_;
        private static final TruckStopLoyaltyInfo DEFAULT_INSTANCE = new TruckStopLoyaltyInfo();

        @Deprecated
        public static final Parser<TruckStopLoyaltyInfo> PARSER = new AbstractParser<TruckStopLoyaltyInfo>() { // from class: com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfo.1
            @Override // com.google.protobuf.Parser
            public TruckStopLoyaltyInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TruckStopLoyaltyInfo.newBuilder();
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

        private TruckStopLoyaltyInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.vendor_ = 0;
            this.isLoggedIn_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TruckStopLoyaltyInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfo_descriptor;
        }

        public static Builder newBuilder(TruckStopLoyaltyInfo truckStopLoyaltyInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(truckStopLoyaltyInfo);
        }

        public static TruckStopLoyaltyInfo parseDelimitedFrom(InputStream inputStream) {
            return (TruckStopLoyaltyInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TruckStopLoyaltyInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TruckStopLoyaltyInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TruckStopLoyaltyInfo)) {
                return super.equals(obj);
            }
            TruckStopLoyaltyInfo truckStopLoyaltyInfo = (TruckStopLoyaltyInfo) obj;
            if (hasVendor() != truckStopLoyaltyInfo.hasVendor()) {
                return false;
            }
            if ((hasVendor() && this.vendor_ != truckStopLoyaltyInfo.vendor_) || hasUserInfo() != truckStopLoyaltyInfo.hasUserInfo()) {
                return false;
            }
            if ((hasUserInfo() && !getUserInfo().equals(truckStopLoyaltyInfo.getUserInfo())) || hasBalances() != truckStopLoyaltyInfo.hasBalances()) {
                return false;
            }
            if ((hasBalances() && !getBalances().equals(truckStopLoyaltyInfo.getBalances())) || hasRewardInfo() != truckStopLoyaltyInfo.hasRewardInfo()) {
                return false;
            }
            if ((hasRewardInfo() && !getRewardInfo().equals(truckStopLoyaltyInfo.getRewardInfo())) || hasGoalInfo() != truckStopLoyaltyInfo.hasGoalInfo()) {
                return false;
            }
            if ((hasGoalInfo() && !getGoalInfo().equals(truckStopLoyaltyInfo.getGoalInfo())) || hasBonusOfferInfo() != truckStopLoyaltyInfo.hasBonusOfferInfo()) {
                return false;
            }
            if ((hasBonusOfferInfo() && !getBonusOfferInfo().equals(truckStopLoyaltyInfo.getBonusOfferInfo())) || hasCampaignInfo() != truckStopLoyaltyInfo.hasCampaignInfo()) {
                return false;
            }
            if ((!hasCampaignInfo() || getCampaignInfo().equals(truckStopLoyaltyInfo.getCampaignInfo())) && hasIsLoggedIn() == truckStopLoyaltyInfo.hasIsLoggedIn()) {
                return (!hasIsLoggedIn() || getIsLoggedIn() == truckStopLoyaltyInfo.getIsLoggedIn()) && getUnknownFields().equals(truckStopLoyaltyInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
        public LoyaltyBalances getBalances() {
            LoyaltyBalances loyaltyBalances = this.balances_;
            return loyaltyBalances == null ? LoyaltyBalances.getDefaultInstance() : loyaltyBalances;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
        public LoyaltyBalancesOrBuilder getBalancesOrBuilder() {
            LoyaltyBalances loyaltyBalances = this.balances_;
            return loyaltyBalances == null ? LoyaltyBalances.getDefaultInstance() : loyaltyBalances;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
        public LoyaltyBonusOfferInfo getBonusOfferInfo() {
            LoyaltyBonusOfferInfo loyaltyBonusOfferInfo = this.bonusOfferInfo_;
            return loyaltyBonusOfferInfo == null ? LoyaltyBonusOfferInfo.getDefaultInstance() : loyaltyBonusOfferInfo;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
        public LoyaltyBonusOfferInfoOrBuilder getBonusOfferInfoOrBuilder() {
            LoyaltyBonusOfferInfo loyaltyBonusOfferInfo = this.bonusOfferInfo_;
            return loyaltyBonusOfferInfo == null ? LoyaltyBonusOfferInfo.getDefaultInstance() : loyaltyBonusOfferInfo;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
        public LoyaltyCampaignInfo getCampaignInfo() {
            LoyaltyCampaignInfo loyaltyCampaignInfo = this.campaignInfo_;
            return loyaltyCampaignInfo == null ? LoyaltyCampaignInfo.getDefaultInstance() : loyaltyCampaignInfo;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
        public LoyaltyCampaignInfoOrBuilder getCampaignInfoOrBuilder() {
            LoyaltyCampaignInfo loyaltyCampaignInfo = this.campaignInfo_;
            return loyaltyCampaignInfo == null ? LoyaltyCampaignInfo.getDefaultInstance() : loyaltyCampaignInfo;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
        public LoyaltyGoalInfo getGoalInfo() {
            LoyaltyGoalInfo loyaltyGoalInfo = this.goalInfo_;
            return loyaltyGoalInfo == null ? LoyaltyGoalInfo.getDefaultInstance() : loyaltyGoalInfo;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
        public LoyaltyGoalInfoOrBuilder getGoalInfoOrBuilder() {
            LoyaltyGoalInfo loyaltyGoalInfo = this.goalInfo_;
            return loyaltyGoalInfo == null ? LoyaltyGoalInfo.getDefaultInstance() : loyaltyGoalInfo;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
        public boolean getIsLoggedIn() {
            return this.isLoggedIn_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TruckStopLoyaltyInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
        public LoyaltyRewardInfo getRewardInfo() {
            LoyaltyRewardInfo loyaltyRewardInfo = this.rewardInfo_;
            return loyaltyRewardInfo == null ? LoyaltyRewardInfo.getDefaultInstance() : loyaltyRewardInfo;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
        public LoyaltyRewardInfoOrBuilder getRewardInfoOrBuilder() {
            LoyaltyRewardInfo loyaltyRewardInfo = this.rewardInfo_;
            return loyaltyRewardInfo == null ? LoyaltyRewardInfo.getDefaultInstance() : loyaltyRewardInfo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.vendor_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getUserInfo());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, getBalances());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(4, getRewardInfo());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(5, getGoalInfo());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(6, getBonusOfferInfo());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(7, getCampaignInfo());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(8, this.isLoggedIn_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
        public LoyaltyUserInfo getUserInfo() {
            LoyaltyUserInfo loyaltyUserInfo = this.userInfo_;
            return loyaltyUserInfo == null ? LoyaltyUserInfo.getDefaultInstance() : loyaltyUserInfo;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
        public LoyaltyUserInfoOrBuilder getUserInfoOrBuilder() {
            LoyaltyUserInfo loyaltyUserInfo = this.userInfo_;
            return loyaltyUserInfo == null ? LoyaltyUserInfo.getDefaultInstance() : loyaltyUserInfo;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
        public Vendor getVendor() {
            Vendor vendorForNumber = Vendor.forNumber(this.vendor_);
            return vendorForNumber == null ? Vendor.LOVES : vendorForNumber;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
        public boolean hasBalances() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
        public boolean hasBonusOfferInfo() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
        public boolean hasCampaignInfo() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
        public boolean hasGoalInfo() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
        public boolean hasIsLoggedIn() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
        public boolean hasRewardInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
        public boolean hasUserInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
        public boolean hasVendor() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasVendor()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.vendor_;
            }
            if (hasUserInfo()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getUserInfo().hashCode();
            }
            if (hasBalances()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getBalances().hashCode();
            }
            if (hasRewardInfo()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getRewardInfo().hashCode();
            }
            if (hasGoalInfo()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getGoalInfo().hashCode();
            }
            if (hasBonusOfferInfo()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getBonusOfferInfo().hashCode();
            }
            if (hasCampaignInfo()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getCampaignInfo().hashCode();
            }
            if (hasIsLoggedIn()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + Internal.hashBoolean(getIsLoggedIn());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TruckStopLoyaltyInfo.class, Builder.class);
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
            return new TruckStopLoyaltyInfo();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.vendor_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getUserInfo());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getBalances());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getRewardInfo());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getGoalInfo());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getBonusOfferInfo());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getCampaignInfo());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeBool(8, this.isLoggedIn_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TruckStopLoyaltyInfoOrBuilder {
            private SingleFieldBuilderV3<LoyaltyBalances, LoyaltyBalances.Builder, LoyaltyBalancesOrBuilder> balancesBuilder_;
            private LoyaltyBalances balances_;
            private int bitField0_;
            private SingleFieldBuilderV3<LoyaltyBonusOfferInfo, LoyaltyBonusOfferInfo.Builder, LoyaltyBonusOfferInfoOrBuilder> bonusOfferInfoBuilder_;
            private LoyaltyBonusOfferInfo bonusOfferInfo_;
            private SingleFieldBuilderV3<LoyaltyCampaignInfo, LoyaltyCampaignInfo.Builder, LoyaltyCampaignInfoOrBuilder> campaignInfoBuilder_;
            private LoyaltyCampaignInfo campaignInfo_;
            private SingleFieldBuilderV3<LoyaltyGoalInfo, LoyaltyGoalInfo.Builder, LoyaltyGoalInfoOrBuilder> goalInfoBuilder_;
            private LoyaltyGoalInfo goalInfo_;
            private boolean isLoggedIn_;
            private SingleFieldBuilderV3<LoyaltyRewardInfo, LoyaltyRewardInfo.Builder, LoyaltyRewardInfoOrBuilder> rewardInfoBuilder_;
            private LoyaltyRewardInfo rewardInfo_;
            private SingleFieldBuilderV3<LoyaltyUserInfo, LoyaltyUserInfo.Builder, LoyaltyUserInfoOrBuilder> userInfoBuilder_;
            private LoyaltyUserInfo userInfo_;
            private int vendor_;

            private Builder() {
                this.vendor_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(TruckStopLoyaltyInfo truckStopLoyaltyInfo) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    truckStopLoyaltyInfo.vendor_ = this.vendor_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<LoyaltyUserInfo, LoyaltyUserInfo.Builder, LoyaltyUserInfoOrBuilder> singleFieldBuilderV3 = this.userInfoBuilder_;
                    truckStopLoyaltyInfo.userInfo_ = singleFieldBuilderV3 == null ? this.userInfo_ : (LoyaltyUserInfo) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<LoyaltyBalances, LoyaltyBalances.Builder, LoyaltyBalancesOrBuilder> singleFieldBuilderV4 = this.balancesBuilder_;
                    truckStopLoyaltyInfo.balances_ = singleFieldBuilderV4 == null ? this.balances_ : (LoyaltyBalances) singleFieldBuilderV4.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<LoyaltyRewardInfo, LoyaltyRewardInfo.Builder, LoyaltyRewardInfoOrBuilder> singleFieldBuilderV5 = this.rewardInfoBuilder_;
                    truckStopLoyaltyInfo.rewardInfo_ = singleFieldBuilderV5 == null ? this.rewardInfo_ : (LoyaltyRewardInfo) singleFieldBuilderV5.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<LoyaltyGoalInfo, LoyaltyGoalInfo.Builder, LoyaltyGoalInfoOrBuilder> singleFieldBuilderV6 = this.goalInfoBuilder_;
                    truckStopLoyaltyInfo.goalInfo_ = singleFieldBuilderV6 == null ? this.goalInfo_ : (LoyaltyGoalInfo) singleFieldBuilderV6.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<LoyaltyBonusOfferInfo, LoyaltyBonusOfferInfo.Builder, LoyaltyBonusOfferInfoOrBuilder> singleFieldBuilderV7 = this.bonusOfferInfoBuilder_;
                    truckStopLoyaltyInfo.bonusOfferInfo_ = singleFieldBuilderV7 == null ? this.bonusOfferInfo_ : (LoyaltyBonusOfferInfo) singleFieldBuilderV7.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<LoyaltyCampaignInfo, LoyaltyCampaignInfo.Builder, LoyaltyCampaignInfoOrBuilder> singleFieldBuilderV8 = this.campaignInfoBuilder_;
                    truckStopLoyaltyInfo.campaignInfo_ = singleFieldBuilderV8 == null ? this.campaignInfo_ : (LoyaltyCampaignInfo) singleFieldBuilderV8.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    truckStopLoyaltyInfo.isLoggedIn_ = this.isLoggedIn_;
                    i14 |= 128;
                }
                truckStopLoyaltyInfo.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<LoyaltyBalances, LoyaltyBalances.Builder, LoyaltyBalancesOrBuilder> getBalancesFieldBuilder() {
                if (this.balancesBuilder_ == null) {
                    this.balancesBuilder_ = new SingleFieldBuilderV3<>(getBalances(), getParentForChildren(), isClean());
                    this.balances_ = null;
                }
                return this.balancesBuilder_;
            }

            private SingleFieldBuilderV3<LoyaltyBonusOfferInfo, LoyaltyBonusOfferInfo.Builder, LoyaltyBonusOfferInfoOrBuilder> getBonusOfferInfoFieldBuilder() {
                if (this.bonusOfferInfoBuilder_ == null) {
                    this.bonusOfferInfoBuilder_ = new SingleFieldBuilderV3<>(getBonusOfferInfo(), getParentForChildren(), isClean());
                    this.bonusOfferInfo_ = null;
                }
                return this.bonusOfferInfoBuilder_;
            }

            private SingleFieldBuilderV3<LoyaltyCampaignInfo, LoyaltyCampaignInfo.Builder, LoyaltyCampaignInfoOrBuilder> getCampaignInfoFieldBuilder() {
                if (this.campaignInfoBuilder_ == null) {
                    this.campaignInfoBuilder_ = new SingleFieldBuilderV3<>(getCampaignInfo(), getParentForChildren(), isClean());
                    this.campaignInfo_ = null;
                }
                return this.campaignInfoBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfo_descriptor;
            }

            private SingleFieldBuilderV3<LoyaltyGoalInfo, LoyaltyGoalInfo.Builder, LoyaltyGoalInfoOrBuilder> getGoalInfoFieldBuilder() {
                if (this.goalInfoBuilder_ == null) {
                    this.goalInfoBuilder_ = new SingleFieldBuilderV3<>(getGoalInfo(), getParentForChildren(), isClean());
                    this.goalInfo_ = null;
                }
                return this.goalInfoBuilder_;
            }

            private SingleFieldBuilderV3<LoyaltyRewardInfo, LoyaltyRewardInfo.Builder, LoyaltyRewardInfoOrBuilder> getRewardInfoFieldBuilder() {
                if (this.rewardInfoBuilder_ == null) {
                    this.rewardInfoBuilder_ = new SingleFieldBuilderV3<>(getRewardInfo(), getParentForChildren(), isClean());
                    this.rewardInfo_ = null;
                }
                return this.rewardInfoBuilder_;
            }

            private SingleFieldBuilderV3<LoyaltyUserInfo, LoyaltyUserInfo.Builder, LoyaltyUserInfoOrBuilder> getUserInfoFieldBuilder() {
                if (this.userInfoBuilder_ == null) {
                    this.userInfoBuilder_ = new SingleFieldBuilderV3<>(getUserInfo(), getParentForChildren(), isClean());
                    this.userInfo_ = null;
                }
                return this.userInfoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getUserInfoFieldBuilder();
                    getBalancesFieldBuilder();
                    getRewardInfoFieldBuilder();
                    getGoalInfoFieldBuilder();
                    getBonusOfferInfoFieldBuilder();
                    getCampaignInfoFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TruckStopLoyaltyInfo build() {
                TruckStopLoyaltyInfo truckStopLoyaltyInfoBuildPartial = buildPartial();
                if (truckStopLoyaltyInfoBuildPartial.isInitialized()) {
                    return truckStopLoyaltyInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) truckStopLoyaltyInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TruckStopLoyaltyInfo buildPartial() {
                TruckStopLoyaltyInfo truckStopLoyaltyInfo = new TruckStopLoyaltyInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(truckStopLoyaltyInfo);
                }
                onBuilt();
                return truckStopLoyaltyInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.vendor_ = 0;
                this.userInfo_ = null;
                SingleFieldBuilderV3<LoyaltyUserInfo, LoyaltyUserInfo.Builder, LoyaltyUserInfoOrBuilder> singleFieldBuilderV3 = this.userInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.userInfoBuilder_ = null;
                }
                this.balances_ = null;
                SingleFieldBuilderV3<LoyaltyBalances, LoyaltyBalances.Builder, LoyaltyBalancesOrBuilder> singleFieldBuilderV4 = this.balancesBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.balancesBuilder_ = null;
                }
                this.rewardInfo_ = null;
                SingleFieldBuilderV3<LoyaltyRewardInfo, LoyaltyRewardInfo.Builder, LoyaltyRewardInfoOrBuilder> singleFieldBuilderV5 = this.rewardInfoBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.rewardInfoBuilder_ = null;
                }
                this.goalInfo_ = null;
                SingleFieldBuilderV3<LoyaltyGoalInfo, LoyaltyGoalInfo.Builder, LoyaltyGoalInfoOrBuilder> singleFieldBuilderV6 = this.goalInfoBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.goalInfoBuilder_ = null;
                }
                this.bonusOfferInfo_ = null;
                SingleFieldBuilderV3<LoyaltyBonusOfferInfo, LoyaltyBonusOfferInfo.Builder, LoyaltyBonusOfferInfoOrBuilder> singleFieldBuilderV7 = this.bonusOfferInfoBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.bonusOfferInfoBuilder_ = null;
                }
                this.campaignInfo_ = null;
                SingleFieldBuilderV3<LoyaltyCampaignInfo, LoyaltyCampaignInfo.Builder, LoyaltyCampaignInfoOrBuilder> singleFieldBuilderV8 = this.campaignInfoBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.campaignInfoBuilder_ = null;
                }
                this.isLoggedIn_ = false;
                return this;
            }

            public Builder clearBalances() {
                this.bitField0_ &= -5;
                this.balances_ = null;
                SingleFieldBuilderV3<LoyaltyBalances, LoyaltyBalances.Builder, LoyaltyBalancesOrBuilder> singleFieldBuilderV3 = this.balancesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.balancesBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearBonusOfferInfo() {
                this.bitField0_ &= -33;
                this.bonusOfferInfo_ = null;
                SingleFieldBuilderV3<LoyaltyBonusOfferInfo, LoyaltyBonusOfferInfo.Builder, LoyaltyBonusOfferInfoOrBuilder> singleFieldBuilderV3 = this.bonusOfferInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.bonusOfferInfoBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCampaignInfo() {
                this.bitField0_ &= -65;
                this.campaignInfo_ = null;
                SingleFieldBuilderV3<LoyaltyCampaignInfo, LoyaltyCampaignInfo.Builder, LoyaltyCampaignInfoOrBuilder> singleFieldBuilderV3 = this.campaignInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.campaignInfoBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGoalInfo() {
                this.bitField0_ &= -17;
                this.goalInfo_ = null;
                SingleFieldBuilderV3<LoyaltyGoalInfo, LoyaltyGoalInfo.Builder, LoyaltyGoalInfoOrBuilder> singleFieldBuilderV3 = this.goalInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.goalInfoBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearIsLoggedIn() {
                this.bitField0_ &= -129;
                this.isLoggedIn_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearRewardInfo() {
                this.bitField0_ &= -9;
                this.rewardInfo_ = null;
                SingleFieldBuilderV3<LoyaltyRewardInfo, LoyaltyRewardInfo.Builder, LoyaltyRewardInfoOrBuilder> singleFieldBuilderV3 = this.rewardInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.rewardInfoBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUserInfo() {
                this.bitField0_ &= -3;
                this.userInfo_ = null;
                SingleFieldBuilderV3<LoyaltyUserInfo, LoyaltyUserInfo.Builder, LoyaltyUserInfoOrBuilder> singleFieldBuilderV3 = this.userInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.userInfoBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearVendor() {
                this.bitField0_ &= -2;
                this.vendor_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
            public LoyaltyBalances getBalances() {
                SingleFieldBuilderV3<LoyaltyBalances, LoyaltyBalances.Builder, LoyaltyBalancesOrBuilder> singleFieldBuilderV3 = this.balancesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LoyaltyBalances) singleFieldBuilderV3.getMessage();
                }
                LoyaltyBalances loyaltyBalances = this.balances_;
                return loyaltyBalances == null ? LoyaltyBalances.getDefaultInstance() : loyaltyBalances;
            }

            public LoyaltyBalances.Builder getBalancesBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (LoyaltyBalances.Builder) getBalancesFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
            public LoyaltyBalancesOrBuilder getBalancesOrBuilder() {
                SingleFieldBuilderV3<LoyaltyBalances, LoyaltyBalances.Builder, LoyaltyBalancesOrBuilder> singleFieldBuilderV3 = this.balancesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LoyaltyBalancesOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LoyaltyBalances loyaltyBalances = this.balances_;
                return loyaltyBalances == null ? LoyaltyBalances.getDefaultInstance() : loyaltyBalances;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
            public LoyaltyBonusOfferInfo getBonusOfferInfo() {
                SingleFieldBuilderV3<LoyaltyBonusOfferInfo, LoyaltyBonusOfferInfo.Builder, LoyaltyBonusOfferInfoOrBuilder> singleFieldBuilderV3 = this.bonusOfferInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LoyaltyBonusOfferInfo) singleFieldBuilderV3.getMessage();
                }
                LoyaltyBonusOfferInfo loyaltyBonusOfferInfo = this.bonusOfferInfo_;
                return loyaltyBonusOfferInfo == null ? LoyaltyBonusOfferInfo.getDefaultInstance() : loyaltyBonusOfferInfo;
            }

            public LoyaltyBonusOfferInfo.Builder getBonusOfferInfoBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (LoyaltyBonusOfferInfo.Builder) getBonusOfferInfoFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
            public LoyaltyBonusOfferInfoOrBuilder getBonusOfferInfoOrBuilder() {
                SingleFieldBuilderV3<LoyaltyBonusOfferInfo, LoyaltyBonusOfferInfo.Builder, LoyaltyBonusOfferInfoOrBuilder> singleFieldBuilderV3 = this.bonusOfferInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LoyaltyBonusOfferInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LoyaltyBonusOfferInfo loyaltyBonusOfferInfo = this.bonusOfferInfo_;
                return loyaltyBonusOfferInfo == null ? LoyaltyBonusOfferInfo.getDefaultInstance() : loyaltyBonusOfferInfo;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
            public LoyaltyCampaignInfo getCampaignInfo() {
                SingleFieldBuilderV3<LoyaltyCampaignInfo, LoyaltyCampaignInfo.Builder, LoyaltyCampaignInfoOrBuilder> singleFieldBuilderV3 = this.campaignInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LoyaltyCampaignInfo) singleFieldBuilderV3.getMessage();
                }
                LoyaltyCampaignInfo loyaltyCampaignInfo = this.campaignInfo_;
                return loyaltyCampaignInfo == null ? LoyaltyCampaignInfo.getDefaultInstance() : loyaltyCampaignInfo;
            }

            public LoyaltyCampaignInfo.Builder getCampaignInfoBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (LoyaltyCampaignInfo.Builder) getCampaignInfoFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
            public LoyaltyCampaignInfoOrBuilder getCampaignInfoOrBuilder() {
                SingleFieldBuilderV3<LoyaltyCampaignInfo, LoyaltyCampaignInfo.Builder, LoyaltyCampaignInfoOrBuilder> singleFieldBuilderV3 = this.campaignInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LoyaltyCampaignInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LoyaltyCampaignInfo loyaltyCampaignInfo = this.campaignInfo_;
                return loyaltyCampaignInfo == null ? LoyaltyCampaignInfo.getDefaultInstance() : loyaltyCampaignInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfo_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
            public LoyaltyGoalInfo getGoalInfo() {
                SingleFieldBuilderV3<LoyaltyGoalInfo, LoyaltyGoalInfo.Builder, LoyaltyGoalInfoOrBuilder> singleFieldBuilderV3 = this.goalInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LoyaltyGoalInfo) singleFieldBuilderV3.getMessage();
                }
                LoyaltyGoalInfo loyaltyGoalInfo = this.goalInfo_;
                return loyaltyGoalInfo == null ? LoyaltyGoalInfo.getDefaultInstance() : loyaltyGoalInfo;
            }

            public LoyaltyGoalInfo.Builder getGoalInfoBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (LoyaltyGoalInfo.Builder) getGoalInfoFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
            public LoyaltyGoalInfoOrBuilder getGoalInfoOrBuilder() {
                SingleFieldBuilderV3<LoyaltyGoalInfo, LoyaltyGoalInfo.Builder, LoyaltyGoalInfoOrBuilder> singleFieldBuilderV3 = this.goalInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LoyaltyGoalInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LoyaltyGoalInfo loyaltyGoalInfo = this.goalInfo_;
                return loyaltyGoalInfo == null ? LoyaltyGoalInfo.getDefaultInstance() : loyaltyGoalInfo;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
            public boolean getIsLoggedIn() {
                return this.isLoggedIn_;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
            public LoyaltyRewardInfo getRewardInfo() {
                SingleFieldBuilderV3<LoyaltyRewardInfo, LoyaltyRewardInfo.Builder, LoyaltyRewardInfoOrBuilder> singleFieldBuilderV3 = this.rewardInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LoyaltyRewardInfo) singleFieldBuilderV3.getMessage();
                }
                LoyaltyRewardInfo loyaltyRewardInfo = this.rewardInfo_;
                return loyaltyRewardInfo == null ? LoyaltyRewardInfo.getDefaultInstance() : loyaltyRewardInfo;
            }

            public LoyaltyRewardInfo.Builder getRewardInfoBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (LoyaltyRewardInfo.Builder) getRewardInfoFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
            public LoyaltyRewardInfoOrBuilder getRewardInfoOrBuilder() {
                SingleFieldBuilderV3<LoyaltyRewardInfo, LoyaltyRewardInfo.Builder, LoyaltyRewardInfoOrBuilder> singleFieldBuilderV3 = this.rewardInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LoyaltyRewardInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LoyaltyRewardInfo loyaltyRewardInfo = this.rewardInfo_;
                return loyaltyRewardInfo == null ? LoyaltyRewardInfo.getDefaultInstance() : loyaltyRewardInfo;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
            public LoyaltyUserInfo getUserInfo() {
                SingleFieldBuilderV3<LoyaltyUserInfo, LoyaltyUserInfo.Builder, LoyaltyUserInfoOrBuilder> singleFieldBuilderV3 = this.userInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LoyaltyUserInfo) singleFieldBuilderV3.getMessage();
                }
                LoyaltyUserInfo loyaltyUserInfo = this.userInfo_;
                return loyaltyUserInfo == null ? LoyaltyUserInfo.getDefaultInstance() : loyaltyUserInfo;
            }

            public LoyaltyUserInfo.Builder getUserInfoBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (LoyaltyUserInfo.Builder) getUserInfoFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
            public LoyaltyUserInfoOrBuilder getUserInfoOrBuilder() {
                SingleFieldBuilderV3<LoyaltyUserInfo, LoyaltyUserInfo.Builder, LoyaltyUserInfoOrBuilder> singleFieldBuilderV3 = this.userInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LoyaltyUserInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LoyaltyUserInfo loyaltyUserInfo = this.userInfo_;
                return loyaltyUserInfo == null ? LoyaltyUserInfo.getDefaultInstance() : loyaltyUserInfo;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
            public Vendor getVendor() {
                Vendor vendorForNumber = Vendor.forNumber(this.vendor_);
                return vendorForNumber == null ? Vendor.LOVES : vendorForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
            public boolean hasBalances() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
            public boolean hasBonusOfferInfo() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
            public boolean hasCampaignInfo() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
            public boolean hasGoalInfo() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
            public boolean hasIsLoggedIn() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
            public boolean hasRewardInfo() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
            public boolean hasUserInfo() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoOrBuilder
            public boolean hasVendor() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TruckStopLoyaltyInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeBalances(LoyaltyBalances loyaltyBalances) {
                LoyaltyBalances loyaltyBalances2;
                SingleFieldBuilderV3<LoyaltyBalances, LoyaltyBalances.Builder, LoyaltyBalancesOrBuilder> singleFieldBuilderV3 = this.balancesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(loyaltyBalances);
                } else if ((this.bitField0_ & 4) == 0 || (loyaltyBalances2 = this.balances_) == null || loyaltyBalances2 == LoyaltyBalances.getDefaultInstance()) {
                    this.balances_ = loyaltyBalances;
                } else {
                    getBalancesBuilder().mergeFrom(loyaltyBalances);
                }
                if (this.balances_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeBonusOfferInfo(LoyaltyBonusOfferInfo loyaltyBonusOfferInfo) {
                LoyaltyBonusOfferInfo loyaltyBonusOfferInfo2;
                SingleFieldBuilderV3<LoyaltyBonusOfferInfo, LoyaltyBonusOfferInfo.Builder, LoyaltyBonusOfferInfoOrBuilder> singleFieldBuilderV3 = this.bonusOfferInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(loyaltyBonusOfferInfo);
                } else if ((this.bitField0_ & 32) == 0 || (loyaltyBonusOfferInfo2 = this.bonusOfferInfo_) == null || loyaltyBonusOfferInfo2 == LoyaltyBonusOfferInfo.getDefaultInstance()) {
                    this.bonusOfferInfo_ = loyaltyBonusOfferInfo;
                } else {
                    getBonusOfferInfoBuilder().mergeFrom(loyaltyBonusOfferInfo);
                }
                if (this.bonusOfferInfo_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCampaignInfo(LoyaltyCampaignInfo loyaltyCampaignInfo) {
                LoyaltyCampaignInfo loyaltyCampaignInfo2;
                SingleFieldBuilderV3<LoyaltyCampaignInfo, LoyaltyCampaignInfo.Builder, LoyaltyCampaignInfoOrBuilder> singleFieldBuilderV3 = this.campaignInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(loyaltyCampaignInfo);
                } else if ((this.bitField0_ & 64) == 0 || (loyaltyCampaignInfo2 = this.campaignInfo_) == null || loyaltyCampaignInfo2 == LoyaltyCampaignInfo.getDefaultInstance()) {
                    this.campaignInfo_ = loyaltyCampaignInfo;
                } else {
                    getCampaignInfoBuilder().mergeFrom(loyaltyCampaignInfo);
                }
                if (this.campaignInfo_ != null) {
                    this.bitField0_ |= 64;
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
                                    if (Vendor.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.vendor_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getUserInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getBalancesFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getRewardInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getGoalInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(getBonusOfferInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(getCampaignInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                } else if (tag == 64) {
                                    this.isLoggedIn_ = codedInputStream.readBool();
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

            public Builder mergeGoalInfo(LoyaltyGoalInfo loyaltyGoalInfo) {
                LoyaltyGoalInfo loyaltyGoalInfo2;
                SingleFieldBuilderV3<LoyaltyGoalInfo, LoyaltyGoalInfo.Builder, LoyaltyGoalInfoOrBuilder> singleFieldBuilderV3 = this.goalInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(loyaltyGoalInfo);
                } else if ((this.bitField0_ & 16) == 0 || (loyaltyGoalInfo2 = this.goalInfo_) == null || loyaltyGoalInfo2 == LoyaltyGoalInfo.getDefaultInstance()) {
                    this.goalInfo_ = loyaltyGoalInfo;
                } else {
                    getGoalInfoBuilder().mergeFrom(loyaltyGoalInfo);
                }
                if (this.goalInfo_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRewardInfo(LoyaltyRewardInfo loyaltyRewardInfo) {
                LoyaltyRewardInfo loyaltyRewardInfo2;
                SingleFieldBuilderV3<LoyaltyRewardInfo, LoyaltyRewardInfo.Builder, LoyaltyRewardInfoOrBuilder> singleFieldBuilderV3 = this.rewardInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(loyaltyRewardInfo);
                } else if ((this.bitField0_ & 8) == 0 || (loyaltyRewardInfo2 = this.rewardInfo_) == null || loyaltyRewardInfo2 == LoyaltyRewardInfo.getDefaultInstance()) {
                    this.rewardInfo_ = loyaltyRewardInfo;
                } else {
                    getRewardInfoBuilder().mergeFrom(loyaltyRewardInfo);
                }
                if (this.rewardInfo_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder mergeUserInfo(LoyaltyUserInfo loyaltyUserInfo) {
                LoyaltyUserInfo loyaltyUserInfo2;
                SingleFieldBuilderV3<LoyaltyUserInfo, LoyaltyUserInfo.Builder, LoyaltyUserInfoOrBuilder> singleFieldBuilderV3 = this.userInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(loyaltyUserInfo);
                } else if ((this.bitField0_ & 2) == 0 || (loyaltyUserInfo2 = this.userInfo_) == null || loyaltyUserInfo2 == LoyaltyUserInfo.getDefaultInstance()) {
                    this.userInfo_ = loyaltyUserInfo;
                } else {
                    getUserInfoBuilder().mergeFrom(loyaltyUserInfo);
                }
                if (this.userInfo_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder setBalances(LoyaltyBalances.Builder builder) {
                SingleFieldBuilderV3<LoyaltyBalances, LoyaltyBalances.Builder, LoyaltyBalancesOrBuilder> singleFieldBuilderV3 = this.balancesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.balances_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setBonusOfferInfo(LoyaltyBonusOfferInfo.Builder builder) {
                SingleFieldBuilderV3<LoyaltyBonusOfferInfo, LoyaltyBonusOfferInfo.Builder, LoyaltyBonusOfferInfoOrBuilder> singleFieldBuilderV3 = this.bonusOfferInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.bonusOfferInfo_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setCampaignInfo(LoyaltyCampaignInfo.Builder builder) {
                SingleFieldBuilderV3<LoyaltyCampaignInfo, LoyaltyCampaignInfo.Builder, LoyaltyCampaignInfoOrBuilder> singleFieldBuilderV3 = this.campaignInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.campaignInfo_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGoalInfo(LoyaltyGoalInfo.Builder builder) {
                SingleFieldBuilderV3<LoyaltyGoalInfo, LoyaltyGoalInfo.Builder, LoyaltyGoalInfoOrBuilder> singleFieldBuilderV3 = this.goalInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.goalInfo_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setIsLoggedIn(boolean z14) {
                this.isLoggedIn_ = z14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setRewardInfo(LoyaltyRewardInfo.Builder builder) {
                SingleFieldBuilderV3<LoyaltyRewardInfo, LoyaltyRewardInfo.Builder, LoyaltyRewardInfoOrBuilder> singleFieldBuilderV3 = this.rewardInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.rewardInfo_ = builder.build();
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

            public Builder setUserInfo(LoyaltyUserInfo.Builder builder) {
                SingleFieldBuilderV3<LoyaltyUserInfo, LoyaltyUserInfo.Builder, LoyaltyUserInfoOrBuilder> singleFieldBuilderV3 = this.userInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.userInfo_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setVendor(Vendor vendor) {
                vendor.getClass();
                this.bitField0_ |= 1;
                this.vendor_ = vendor.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TruckStopLoyaltyInfo getDefaultInstanceForType() {
                return TruckStopLoyaltyInfo.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.vendor_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setBalances(LoyaltyBalances loyaltyBalances) {
                SingleFieldBuilderV3<LoyaltyBalances, LoyaltyBalances.Builder, LoyaltyBalancesOrBuilder> singleFieldBuilderV3 = this.balancesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    loyaltyBalances.getClass();
                    this.balances_ = loyaltyBalances;
                } else {
                    singleFieldBuilderV3.setMessage(loyaltyBalances);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setBonusOfferInfo(LoyaltyBonusOfferInfo loyaltyBonusOfferInfo) {
                SingleFieldBuilderV3<LoyaltyBonusOfferInfo, LoyaltyBonusOfferInfo.Builder, LoyaltyBonusOfferInfoOrBuilder> singleFieldBuilderV3 = this.bonusOfferInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    loyaltyBonusOfferInfo.getClass();
                    this.bonusOfferInfo_ = loyaltyBonusOfferInfo;
                } else {
                    singleFieldBuilderV3.setMessage(loyaltyBonusOfferInfo);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setCampaignInfo(LoyaltyCampaignInfo loyaltyCampaignInfo) {
                SingleFieldBuilderV3<LoyaltyCampaignInfo, LoyaltyCampaignInfo.Builder, LoyaltyCampaignInfoOrBuilder> singleFieldBuilderV3 = this.campaignInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    loyaltyCampaignInfo.getClass();
                    this.campaignInfo_ = loyaltyCampaignInfo;
                } else {
                    singleFieldBuilderV3.setMessage(loyaltyCampaignInfo);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setGoalInfo(LoyaltyGoalInfo loyaltyGoalInfo) {
                SingleFieldBuilderV3<LoyaltyGoalInfo, LoyaltyGoalInfo.Builder, LoyaltyGoalInfoOrBuilder> singleFieldBuilderV3 = this.goalInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    loyaltyGoalInfo.getClass();
                    this.goalInfo_ = loyaltyGoalInfo;
                } else {
                    singleFieldBuilderV3.setMessage(loyaltyGoalInfo);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setRewardInfo(LoyaltyRewardInfo loyaltyRewardInfo) {
                SingleFieldBuilderV3<LoyaltyRewardInfo, LoyaltyRewardInfo.Builder, LoyaltyRewardInfoOrBuilder> singleFieldBuilderV3 = this.rewardInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    loyaltyRewardInfo.getClass();
                    this.rewardInfo_ = loyaltyRewardInfo;
                } else {
                    singleFieldBuilderV3.setMessage(loyaltyRewardInfo);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setUserInfo(LoyaltyUserInfo loyaltyUserInfo) {
                SingleFieldBuilderV3<LoyaltyUserInfo, LoyaltyUserInfo.Builder, LoyaltyUserInfoOrBuilder> singleFieldBuilderV3 = this.userInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    loyaltyUserInfo.getClass();
                    this.userInfo_ = loyaltyUserInfo;
                } else {
                    singleFieldBuilderV3.setMessage(loyaltyUserInfo);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TruckStopLoyaltyInfo) {
                    return mergeFrom((TruckStopLoyaltyInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TruckStopLoyaltyInfo truckStopLoyaltyInfo) {
                if (truckStopLoyaltyInfo == TruckStopLoyaltyInfo.getDefaultInstance()) {
                    return this;
                }
                if (truckStopLoyaltyInfo.hasVendor()) {
                    setVendor(truckStopLoyaltyInfo.getVendor());
                }
                if (truckStopLoyaltyInfo.hasUserInfo()) {
                    mergeUserInfo(truckStopLoyaltyInfo.getUserInfo());
                }
                if (truckStopLoyaltyInfo.hasBalances()) {
                    mergeBalances(truckStopLoyaltyInfo.getBalances());
                }
                if (truckStopLoyaltyInfo.hasRewardInfo()) {
                    mergeRewardInfo(truckStopLoyaltyInfo.getRewardInfo());
                }
                if (truckStopLoyaltyInfo.hasGoalInfo()) {
                    mergeGoalInfo(truckStopLoyaltyInfo.getGoalInfo());
                }
                if (truckStopLoyaltyInfo.hasBonusOfferInfo()) {
                    mergeBonusOfferInfo(truckStopLoyaltyInfo.getBonusOfferInfo());
                }
                if (truckStopLoyaltyInfo.hasCampaignInfo()) {
                    mergeCampaignInfo(truckStopLoyaltyInfo.getCampaignInfo());
                }
                if (truckStopLoyaltyInfo.hasIsLoggedIn()) {
                    setIsLoggedIn(truckStopLoyaltyInfo.getIsLoggedIn());
                }
                mergeUnknownFields(truckStopLoyaltyInfo.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TruckStopLoyaltyInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TruckStopLoyaltyInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TruckStopLoyaltyInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TruckStopLoyaltyInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TruckStopLoyaltyInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TruckStopLoyaltyInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ TruckStopLoyaltyInfo(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static TruckStopLoyaltyInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private TruckStopLoyaltyInfo() {
            this.isLoggedIn_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.vendor_ = 0;
        }

        public static TruckStopLoyaltyInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TruckStopLoyaltyInfo parseFrom(InputStream inputStream) {
            return (TruckStopLoyaltyInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TruckStopLoyaltyInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TruckStopLoyaltyInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TruckStopLoyaltyInfo parseFrom(CodedInputStream codedInputStream) {
            return (TruckStopLoyaltyInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TruckStopLoyaltyInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TruckStopLoyaltyInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TruckStopLoyaltyInfoNotification extends GeneratedMessageV3 implements TruckStopLoyaltyInfoNotificationOrBuilder {
        public static final int LOYALTY_INFO_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private TruckStopLoyaltyInfo loyaltyInfo_;
        private byte memoizedIsInitialized;
        private static final TruckStopLoyaltyInfoNotification DEFAULT_INSTANCE = new TruckStopLoyaltyInfoNotification();

        @Deprecated
        public static final Parser<TruckStopLoyaltyInfoNotification> PARSER = new AbstractParser<TruckStopLoyaltyInfoNotification>() { // from class: com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoNotification.1
            @Override // com.google.protobuf.Parser
            public TruckStopLoyaltyInfoNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TruckStopLoyaltyInfoNotification.newBuilder();
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

        private TruckStopLoyaltyInfoNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TruckStopLoyaltyInfoNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoNotification_descriptor;
        }

        public static Builder newBuilder(TruckStopLoyaltyInfoNotification truckStopLoyaltyInfoNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(truckStopLoyaltyInfoNotification);
        }

        public static TruckStopLoyaltyInfoNotification parseDelimitedFrom(InputStream inputStream) {
            return (TruckStopLoyaltyInfoNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TruckStopLoyaltyInfoNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TruckStopLoyaltyInfoNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TruckStopLoyaltyInfoNotification)) {
                return super.equals(obj);
            }
            TruckStopLoyaltyInfoNotification truckStopLoyaltyInfoNotification = (TruckStopLoyaltyInfoNotification) obj;
            if (hasLoyaltyInfo() != truckStopLoyaltyInfoNotification.hasLoyaltyInfo()) {
                return false;
            }
            return (!hasLoyaltyInfo() || getLoyaltyInfo().equals(truckStopLoyaltyInfoNotification.getLoyaltyInfo())) && getUnknownFields().equals(truckStopLoyaltyInfoNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoNotificationOrBuilder
        public TruckStopLoyaltyInfo getLoyaltyInfo() {
            TruckStopLoyaltyInfo truckStopLoyaltyInfo = this.loyaltyInfo_;
            return truckStopLoyaltyInfo == null ? TruckStopLoyaltyInfo.getDefaultInstance() : truckStopLoyaltyInfo;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoNotificationOrBuilder
        public TruckStopLoyaltyInfoOrBuilder getLoyaltyInfoOrBuilder() {
            TruckStopLoyaltyInfo truckStopLoyaltyInfo = this.loyaltyInfo_;
            return truckStopLoyaltyInfo == null ? TruckStopLoyaltyInfo.getDefaultInstance() : truckStopLoyaltyInfo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TruckStopLoyaltyInfoNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getLoyaltyInfo()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoNotificationOrBuilder
        public boolean hasLoyaltyInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasLoyaltyInfo()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getLoyaltyInfo().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(TruckStopLoyaltyInfoNotification.class, Builder.class);
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
            return new TruckStopLoyaltyInfoNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getLoyaltyInfo());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TruckStopLoyaltyInfoNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<TruckStopLoyaltyInfo, TruckStopLoyaltyInfo.Builder, TruckStopLoyaltyInfoOrBuilder> loyaltyInfoBuilder_;
            private TruckStopLoyaltyInfo loyaltyInfo_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(TruckStopLoyaltyInfoNotification truckStopLoyaltyInfoNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<TruckStopLoyaltyInfo, TruckStopLoyaltyInfo.Builder, TruckStopLoyaltyInfoOrBuilder> singleFieldBuilderV3 = this.loyaltyInfoBuilder_;
                    truckStopLoyaltyInfoNotification.loyaltyInfo_ = singleFieldBuilderV3 == null ? this.loyaltyInfo_ : (TruckStopLoyaltyInfo) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                truckStopLoyaltyInfoNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoNotification_descriptor;
            }

            private SingleFieldBuilderV3<TruckStopLoyaltyInfo, TruckStopLoyaltyInfo.Builder, TruckStopLoyaltyInfoOrBuilder> getLoyaltyInfoFieldBuilder() {
                if (this.loyaltyInfoBuilder_ == null) {
                    this.loyaltyInfoBuilder_ = new SingleFieldBuilderV3<>(getLoyaltyInfo(), getParentForChildren(), isClean());
                    this.loyaltyInfo_ = null;
                }
                return this.loyaltyInfoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getLoyaltyInfoFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TruckStopLoyaltyInfoNotification build() {
                TruckStopLoyaltyInfoNotification truckStopLoyaltyInfoNotificationBuildPartial = buildPartial();
                if (truckStopLoyaltyInfoNotificationBuildPartial.isInitialized()) {
                    return truckStopLoyaltyInfoNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) truckStopLoyaltyInfoNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TruckStopLoyaltyInfoNotification buildPartial() {
                TruckStopLoyaltyInfoNotification truckStopLoyaltyInfoNotification = new TruckStopLoyaltyInfoNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(truckStopLoyaltyInfoNotification);
                }
                onBuilt();
                return truckStopLoyaltyInfoNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.loyaltyInfo_ = null;
                SingleFieldBuilderV3<TruckStopLoyaltyInfo, TruckStopLoyaltyInfo.Builder, TruckStopLoyaltyInfoOrBuilder> singleFieldBuilderV3 = this.loyaltyInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.loyaltyInfoBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLoyaltyInfo() {
                this.bitField0_ &= -2;
                this.loyaltyInfo_ = null;
                SingleFieldBuilderV3<TruckStopLoyaltyInfo, TruckStopLoyaltyInfo.Builder, TruckStopLoyaltyInfoOrBuilder> singleFieldBuilderV3 = this.loyaltyInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.loyaltyInfoBuilder_ = null;
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
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoNotificationOrBuilder
            public TruckStopLoyaltyInfo getLoyaltyInfo() {
                SingleFieldBuilderV3<TruckStopLoyaltyInfo, TruckStopLoyaltyInfo.Builder, TruckStopLoyaltyInfoOrBuilder> singleFieldBuilderV3 = this.loyaltyInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TruckStopLoyaltyInfo) singleFieldBuilderV3.getMessage();
                }
                TruckStopLoyaltyInfo truckStopLoyaltyInfo = this.loyaltyInfo_;
                return truckStopLoyaltyInfo == null ? TruckStopLoyaltyInfo.getDefaultInstance() : truckStopLoyaltyInfo;
            }

            public TruckStopLoyaltyInfo.Builder getLoyaltyInfoBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (TruckStopLoyaltyInfo.Builder) getLoyaltyInfoFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoNotificationOrBuilder
            public TruckStopLoyaltyInfoOrBuilder getLoyaltyInfoOrBuilder() {
                SingleFieldBuilderV3<TruckStopLoyaltyInfo, TruckStopLoyaltyInfo.Builder, TruckStopLoyaltyInfoOrBuilder> singleFieldBuilderV3 = this.loyaltyInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TruckStopLoyaltyInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TruckStopLoyaltyInfo truckStopLoyaltyInfo = this.loyaltyInfo_;
                return truckStopLoyaltyInfo == null ? TruckStopLoyaltyInfo.getDefaultInstance() : truckStopLoyaltyInfo;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoNotificationOrBuilder
            public boolean hasLoyaltyInfo() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(TruckStopLoyaltyInfoNotification.class, Builder.class);
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
                                    codedInputStream.readMessage(getLoyaltyInfoFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeLoyaltyInfo(TruckStopLoyaltyInfo truckStopLoyaltyInfo) {
                TruckStopLoyaltyInfo truckStopLoyaltyInfo2;
                SingleFieldBuilderV3<TruckStopLoyaltyInfo, TruckStopLoyaltyInfo.Builder, TruckStopLoyaltyInfoOrBuilder> singleFieldBuilderV3 = this.loyaltyInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(truckStopLoyaltyInfo);
                } else if ((this.bitField0_ & 1) == 0 || (truckStopLoyaltyInfo2 = this.loyaltyInfo_) == null || truckStopLoyaltyInfo2 == TruckStopLoyaltyInfo.getDefaultInstance()) {
                    this.loyaltyInfo_ = truckStopLoyaltyInfo;
                } else {
                    getLoyaltyInfoBuilder().mergeFrom(truckStopLoyaltyInfo);
                }
                if (this.loyaltyInfo_ != null) {
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

            public Builder setLoyaltyInfo(TruckStopLoyaltyInfo.Builder builder) {
                SingleFieldBuilderV3<TruckStopLoyaltyInfo, TruckStopLoyaltyInfo.Builder, TruckStopLoyaltyInfoOrBuilder> singleFieldBuilderV3 = this.loyaltyInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.loyaltyInfo_ = builder.build();
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
            public TruckStopLoyaltyInfoNotification getDefaultInstanceForType() {
                return TruckStopLoyaltyInfoNotification.getDefaultInstance();
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

            public Builder setLoyaltyInfo(TruckStopLoyaltyInfo truckStopLoyaltyInfo) {
                SingleFieldBuilderV3<TruckStopLoyaltyInfo, TruckStopLoyaltyInfo.Builder, TruckStopLoyaltyInfoOrBuilder> singleFieldBuilderV3 = this.loyaltyInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    truckStopLoyaltyInfo.getClass();
                    this.loyaltyInfo_ = truckStopLoyaltyInfo;
                } else {
                    singleFieldBuilderV3.setMessage(truckStopLoyaltyInfo);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TruckStopLoyaltyInfoNotification) {
                    return mergeFrom((TruckStopLoyaltyInfoNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TruckStopLoyaltyInfoNotification truckStopLoyaltyInfoNotification) {
                if (truckStopLoyaltyInfoNotification == TruckStopLoyaltyInfoNotification.getDefaultInstance()) {
                    return this;
                }
                if (truckStopLoyaltyInfoNotification.hasLoyaltyInfo()) {
                    mergeLoyaltyInfo(truckStopLoyaltyInfoNotification.getLoyaltyInfo());
                }
                mergeUnknownFields(truckStopLoyaltyInfoNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TruckStopLoyaltyInfoNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ TruckStopLoyaltyInfoNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private TruckStopLoyaltyInfoNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TruckStopLoyaltyInfoNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TruckStopLoyaltyInfoNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TruckStopLoyaltyInfoNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TruckStopLoyaltyInfoNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TruckStopLoyaltyInfoNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TruckStopLoyaltyInfoNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TruckStopLoyaltyInfoNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TruckStopLoyaltyInfoNotification parseFrom(InputStream inputStream) {
            return (TruckStopLoyaltyInfoNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TruckStopLoyaltyInfoNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TruckStopLoyaltyInfoNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TruckStopLoyaltyInfoNotification parseFrom(CodedInputStream codedInputStream) {
            return (TruckStopLoyaltyInfoNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TruckStopLoyaltyInfoNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TruckStopLoyaltyInfoNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TruckStopLoyaltyInfoRequest extends GeneratedMessageV3 implements TruckStopLoyaltyInfoRequestOrBuilder {
        private static final TruckStopLoyaltyInfoRequest DEFAULT_INSTANCE = new TruckStopLoyaltyInfoRequest();

        @Deprecated
        public static final Parser<TruckStopLoyaltyInfoRequest> PARSER = new AbstractParser<TruckStopLoyaltyInfoRequest>() { // from class: com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoRequest.1
            @Override // com.google.protobuf.Parser
            public TruckStopLoyaltyInfoRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TruckStopLoyaltyInfoRequest.newBuilder();
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
        public static final int VENDOR_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int vendor_;

        private TruckStopLoyaltyInfoRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.vendor_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TruckStopLoyaltyInfoRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoRequest_descriptor;
        }

        public static Builder newBuilder(TruckStopLoyaltyInfoRequest truckStopLoyaltyInfoRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(truckStopLoyaltyInfoRequest);
        }

        public static TruckStopLoyaltyInfoRequest parseDelimitedFrom(InputStream inputStream) {
            return (TruckStopLoyaltyInfoRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TruckStopLoyaltyInfoRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TruckStopLoyaltyInfoRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TruckStopLoyaltyInfoRequest)) {
                return super.equals(obj);
            }
            TruckStopLoyaltyInfoRequest truckStopLoyaltyInfoRequest = (TruckStopLoyaltyInfoRequest) obj;
            if (hasVendor() != truckStopLoyaltyInfoRequest.hasVendor()) {
                return false;
            }
            return (!hasVendor() || this.vendor_ == truckStopLoyaltyInfoRequest.vendor_) && getUnknownFields().equals(truckStopLoyaltyInfoRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TruckStopLoyaltyInfoRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.vendor_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoRequestOrBuilder
        public Vendor getVendor() {
            Vendor vendorForNumber = Vendor.forNumber(this.vendor_);
            return vendorForNumber == null ? Vendor.LOVES : vendorForNumber;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoRequestOrBuilder
        public boolean hasVendor() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasVendor()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.vendor_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TruckStopLoyaltyInfoRequest.class, Builder.class);
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
            return new TruckStopLoyaltyInfoRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.vendor_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TruckStopLoyaltyInfoRequestOrBuilder {
            private int bitField0_;
            private int vendor_;

            private Builder() {
                this.vendor_ = 0;
            }

            private void buildPartial0(TruckStopLoyaltyInfoRequest truckStopLoyaltyInfoRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    truckStopLoyaltyInfoRequest.vendor_ = this.vendor_;
                } else {
                    i14 = 0;
                }
                truckStopLoyaltyInfoRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TruckStopLoyaltyInfoRequest build() {
                TruckStopLoyaltyInfoRequest truckStopLoyaltyInfoRequestBuildPartial = buildPartial();
                if (truckStopLoyaltyInfoRequestBuildPartial.isInitialized()) {
                    return truckStopLoyaltyInfoRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) truckStopLoyaltyInfoRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TruckStopLoyaltyInfoRequest buildPartial() {
                TruckStopLoyaltyInfoRequest truckStopLoyaltyInfoRequest = new TruckStopLoyaltyInfoRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(truckStopLoyaltyInfoRequest);
                }
                onBuilt();
                return truckStopLoyaltyInfoRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.vendor_ = 0;
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

            public Builder clearVendor() {
                this.bitField0_ &= -2;
                this.vendor_ = 0;
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
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoRequestOrBuilder
            public Vendor getVendor() {
                Vendor vendorForNumber = Vendor.forNumber(this.vendor_);
                return vendorForNumber == null ? Vendor.LOVES : vendorForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoRequestOrBuilder
            public boolean hasVendor() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TruckStopLoyaltyInfoRequest.class, Builder.class);
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
                                    if (Vendor.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.vendor_ = i14;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setVendor(Vendor vendor) {
                vendor.getClass();
                this.bitField0_ |= 1;
                this.vendor_ = vendor.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TruckStopLoyaltyInfoRequest getDefaultInstanceForType() {
                return TruckStopLoyaltyInfoRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.vendor_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TruckStopLoyaltyInfoRequest) {
                    return mergeFrom((TruckStopLoyaltyInfoRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TruckStopLoyaltyInfoRequest truckStopLoyaltyInfoRequest) {
                if (truckStopLoyaltyInfoRequest == TruckStopLoyaltyInfoRequest.getDefaultInstance()) {
                    return this;
                }
                if (truckStopLoyaltyInfoRequest.hasVendor()) {
                    setVendor(truckStopLoyaltyInfoRequest.getVendor());
                }
                mergeUnknownFields(truckStopLoyaltyInfoRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TruckStopLoyaltyInfoRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TruckStopLoyaltyInfoRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TruckStopLoyaltyInfoRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TruckStopLoyaltyInfoRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ TruckStopLoyaltyInfoRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static TruckStopLoyaltyInfoRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private TruckStopLoyaltyInfoRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.vendor_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TruckStopLoyaltyInfoRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TruckStopLoyaltyInfoRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TruckStopLoyaltyInfoRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TruckStopLoyaltyInfoRequest parseFrom(InputStream inputStream) {
            return (TruckStopLoyaltyInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TruckStopLoyaltyInfoRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TruckStopLoyaltyInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TruckStopLoyaltyInfoRequest parseFrom(CodedInputStream codedInputStream) {
            return (TruckStopLoyaltyInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TruckStopLoyaltyInfoRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TruckStopLoyaltyInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TruckStopLoyaltyInfoResponse extends GeneratedMessageV3 implements TruckStopLoyaltyInfoResponseOrBuilder {
        public static final int LOYALTY_INFO_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private TruckStopLoyaltyInfo loyaltyInfo_;
        private byte memoizedIsInitialized;
        private static final TruckStopLoyaltyInfoResponse DEFAULT_INSTANCE = new TruckStopLoyaltyInfoResponse();

        @Deprecated
        public static final Parser<TruckStopLoyaltyInfoResponse> PARSER = new AbstractParser<TruckStopLoyaltyInfoResponse>() { // from class: com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoResponse.1
            @Override // com.google.protobuf.Parser
            public TruckStopLoyaltyInfoResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TruckStopLoyaltyInfoResponse.newBuilder();
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

        private TruckStopLoyaltyInfoResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TruckStopLoyaltyInfoResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoResponse_descriptor;
        }

        public static Builder newBuilder(TruckStopLoyaltyInfoResponse truckStopLoyaltyInfoResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(truckStopLoyaltyInfoResponse);
        }

        public static TruckStopLoyaltyInfoResponse parseDelimitedFrom(InputStream inputStream) {
            return (TruckStopLoyaltyInfoResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TruckStopLoyaltyInfoResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TruckStopLoyaltyInfoResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TruckStopLoyaltyInfoResponse)) {
                return super.equals(obj);
            }
            TruckStopLoyaltyInfoResponse truckStopLoyaltyInfoResponse = (TruckStopLoyaltyInfoResponse) obj;
            if (hasLoyaltyInfo() != truckStopLoyaltyInfoResponse.hasLoyaltyInfo()) {
                return false;
            }
            return (!hasLoyaltyInfo() || getLoyaltyInfo().equals(truckStopLoyaltyInfoResponse.getLoyaltyInfo())) && getUnknownFields().equals(truckStopLoyaltyInfoResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoResponseOrBuilder
        public TruckStopLoyaltyInfo getLoyaltyInfo() {
            TruckStopLoyaltyInfo truckStopLoyaltyInfo = this.loyaltyInfo_;
            return truckStopLoyaltyInfo == null ? TruckStopLoyaltyInfo.getDefaultInstance() : truckStopLoyaltyInfo;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoResponseOrBuilder
        public TruckStopLoyaltyInfoOrBuilder getLoyaltyInfoOrBuilder() {
            TruckStopLoyaltyInfo truckStopLoyaltyInfo = this.loyaltyInfo_;
            return truckStopLoyaltyInfo == null ? TruckStopLoyaltyInfo.getDefaultInstance() : truckStopLoyaltyInfo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TruckStopLoyaltyInfoResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getLoyaltyInfo()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoResponseOrBuilder
        public boolean hasLoyaltyInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasLoyaltyInfo()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getLoyaltyInfo().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TruckStopLoyaltyInfoResponse.class, Builder.class);
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
            return new TruckStopLoyaltyInfoResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getLoyaltyInfo());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TruckStopLoyaltyInfoResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<TruckStopLoyaltyInfo, TruckStopLoyaltyInfo.Builder, TruckStopLoyaltyInfoOrBuilder> loyaltyInfoBuilder_;
            private TruckStopLoyaltyInfo loyaltyInfo_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(TruckStopLoyaltyInfoResponse truckStopLoyaltyInfoResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<TruckStopLoyaltyInfo, TruckStopLoyaltyInfo.Builder, TruckStopLoyaltyInfoOrBuilder> singleFieldBuilderV3 = this.loyaltyInfoBuilder_;
                    truckStopLoyaltyInfoResponse.loyaltyInfo_ = singleFieldBuilderV3 == null ? this.loyaltyInfo_ : (TruckStopLoyaltyInfo) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                truckStopLoyaltyInfoResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoResponse_descriptor;
            }

            private SingleFieldBuilderV3<TruckStopLoyaltyInfo, TruckStopLoyaltyInfo.Builder, TruckStopLoyaltyInfoOrBuilder> getLoyaltyInfoFieldBuilder() {
                if (this.loyaltyInfoBuilder_ == null) {
                    this.loyaltyInfoBuilder_ = new SingleFieldBuilderV3<>(getLoyaltyInfo(), getParentForChildren(), isClean());
                    this.loyaltyInfo_ = null;
                }
                return this.loyaltyInfoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getLoyaltyInfoFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TruckStopLoyaltyInfoResponse build() {
                TruckStopLoyaltyInfoResponse truckStopLoyaltyInfoResponseBuildPartial = buildPartial();
                if (truckStopLoyaltyInfoResponseBuildPartial.isInitialized()) {
                    return truckStopLoyaltyInfoResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) truckStopLoyaltyInfoResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TruckStopLoyaltyInfoResponse buildPartial() {
                TruckStopLoyaltyInfoResponse truckStopLoyaltyInfoResponse = new TruckStopLoyaltyInfoResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(truckStopLoyaltyInfoResponse);
                }
                onBuilt();
                return truckStopLoyaltyInfoResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.loyaltyInfo_ = null;
                SingleFieldBuilderV3<TruckStopLoyaltyInfo, TruckStopLoyaltyInfo.Builder, TruckStopLoyaltyInfoOrBuilder> singleFieldBuilderV3 = this.loyaltyInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.loyaltyInfoBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLoyaltyInfo() {
                this.bitField0_ &= -2;
                this.loyaltyInfo_ = null;
                SingleFieldBuilderV3<TruckStopLoyaltyInfo, TruckStopLoyaltyInfo.Builder, TruckStopLoyaltyInfoOrBuilder> singleFieldBuilderV3 = this.loyaltyInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.loyaltyInfoBuilder_ = null;
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
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoResponseOrBuilder
            public TruckStopLoyaltyInfo getLoyaltyInfo() {
                SingleFieldBuilderV3<TruckStopLoyaltyInfo, TruckStopLoyaltyInfo.Builder, TruckStopLoyaltyInfoOrBuilder> singleFieldBuilderV3 = this.loyaltyInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TruckStopLoyaltyInfo) singleFieldBuilderV3.getMessage();
                }
                TruckStopLoyaltyInfo truckStopLoyaltyInfo = this.loyaltyInfo_;
                return truckStopLoyaltyInfo == null ? TruckStopLoyaltyInfo.getDefaultInstance() : truckStopLoyaltyInfo;
            }

            public TruckStopLoyaltyInfo.Builder getLoyaltyInfoBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (TruckStopLoyaltyInfo.Builder) getLoyaltyInfoFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoResponseOrBuilder
            public TruckStopLoyaltyInfoOrBuilder getLoyaltyInfoOrBuilder() {
                SingleFieldBuilderV3<TruckStopLoyaltyInfo, TruckStopLoyaltyInfo.Builder, TruckStopLoyaltyInfoOrBuilder> singleFieldBuilderV3 = this.loyaltyInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TruckStopLoyaltyInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TruckStopLoyaltyInfo truckStopLoyaltyInfo = this.loyaltyInfo_;
                return truckStopLoyaltyInfo == null ? TruckStopLoyaltyInfo.getDefaultInstance() : truckStopLoyaltyInfo;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.TruckStopLoyaltyInfoResponseOrBuilder
            public boolean hasLoyaltyInfo() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_TruckStopLoyaltyInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TruckStopLoyaltyInfoResponse.class, Builder.class);
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
                                    codedInputStream.readMessage(getLoyaltyInfoFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeLoyaltyInfo(TruckStopLoyaltyInfo truckStopLoyaltyInfo) {
                TruckStopLoyaltyInfo truckStopLoyaltyInfo2;
                SingleFieldBuilderV3<TruckStopLoyaltyInfo, TruckStopLoyaltyInfo.Builder, TruckStopLoyaltyInfoOrBuilder> singleFieldBuilderV3 = this.loyaltyInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(truckStopLoyaltyInfo);
                } else if ((this.bitField0_ & 1) == 0 || (truckStopLoyaltyInfo2 = this.loyaltyInfo_) == null || truckStopLoyaltyInfo2 == TruckStopLoyaltyInfo.getDefaultInstance()) {
                    this.loyaltyInfo_ = truckStopLoyaltyInfo;
                } else {
                    getLoyaltyInfoBuilder().mergeFrom(truckStopLoyaltyInfo);
                }
                if (this.loyaltyInfo_ != null) {
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

            public Builder setLoyaltyInfo(TruckStopLoyaltyInfo.Builder builder) {
                SingleFieldBuilderV3<TruckStopLoyaltyInfo, TruckStopLoyaltyInfo.Builder, TruckStopLoyaltyInfoOrBuilder> singleFieldBuilderV3 = this.loyaltyInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.loyaltyInfo_ = builder.build();
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
            public TruckStopLoyaltyInfoResponse getDefaultInstanceForType() {
                return TruckStopLoyaltyInfoResponse.getDefaultInstance();
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

            public Builder setLoyaltyInfo(TruckStopLoyaltyInfo truckStopLoyaltyInfo) {
                SingleFieldBuilderV3<TruckStopLoyaltyInfo, TruckStopLoyaltyInfo.Builder, TruckStopLoyaltyInfoOrBuilder> singleFieldBuilderV3 = this.loyaltyInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    truckStopLoyaltyInfo.getClass();
                    this.loyaltyInfo_ = truckStopLoyaltyInfo;
                } else {
                    singleFieldBuilderV3.setMessage(truckStopLoyaltyInfo);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TruckStopLoyaltyInfoResponse) {
                    return mergeFrom((TruckStopLoyaltyInfoResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TruckStopLoyaltyInfoResponse truckStopLoyaltyInfoResponse) {
                if (truckStopLoyaltyInfoResponse == TruckStopLoyaltyInfoResponse.getDefaultInstance()) {
                    return this;
                }
                if (truckStopLoyaltyInfoResponse.hasLoyaltyInfo()) {
                    mergeLoyaltyInfo(truckStopLoyaltyInfoResponse.getLoyaltyInfo());
                }
                mergeUnknownFields(truckStopLoyaltyInfoResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TruckStopLoyaltyInfoResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ TruckStopLoyaltyInfoResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private TruckStopLoyaltyInfoResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TruckStopLoyaltyInfoResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TruckStopLoyaltyInfoResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TruckStopLoyaltyInfoResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TruckStopLoyaltyInfoResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TruckStopLoyaltyInfoResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TruckStopLoyaltyInfoResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TruckStopLoyaltyInfoResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TruckStopLoyaltyInfoResponse parseFrom(InputStream inputStream) {
            return (TruckStopLoyaltyInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TruckStopLoyaltyInfoResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TruckStopLoyaltyInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TruckStopLoyaltyInfoResponse parseFrom(CodedInputStream codedInputStream) {
            return (TruckStopLoyaltyInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TruckStopLoyaltyInfoResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TruckStopLoyaltyInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class WellnessSuggestionResponse extends GeneratedMessageV3 implements WellnessSuggestionResponseOrBuilder {
        private static final WellnessSuggestionResponse DEFAULT_INSTANCE = new WellnessSuggestionResponse();

        @Deprecated
        public static final Parser<WellnessSuggestionResponse> PARSER = new AbstractParser<WellnessSuggestionResponse>() { // from class: com.garmin.proto.generated.GDIDezlProto.WellnessSuggestionResponse.1
            @Override // com.google.protobuf.Parser
            public WellnessSuggestionResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = WellnessSuggestionResponse.newBuilder();
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
        public static final int PND_DATA_FIELD_NUMBER = 2;
        public static final int WELLNESS_SUGGESTION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private PndWellnessData pndData_;
        private int wellnessSuggestion_;

        private WellnessSuggestionResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.wellnessSuggestion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WellnessSuggestionResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_WellnessSuggestionResponse_descriptor;
        }

        public static Builder newBuilder(WellnessSuggestionResponse wellnessSuggestionResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(wellnessSuggestionResponse);
        }

        public static WellnessSuggestionResponse parseDelimitedFrom(InputStream inputStream) {
            return (WellnessSuggestionResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WellnessSuggestionResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<WellnessSuggestionResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WellnessSuggestionResponse)) {
                return super.equals(obj);
            }
            WellnessSuggestionResponse wellnessSuggestionResponse = (WellnessSuggestionResponse) obj;
            if (hasWellnessSuggestion() != wellnessSuggestionResponse.hasWellnessSuggestion()) {
                return false;
            }
            if ((!hasWellnessSuggestion() || this.wellnessSuggestion_ == wellnessSuggestionResponse.wellnessSuggestion_) && hasPndData() == wellnessSuggestionResponse.hasPndData()) {
                return (!hasPndData() || getPndData().equals(wellnessSuggestionResponse.getPndData())) && getUnknownFields().equals(wellnessSuggestionResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WellnessSuggestionResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.WellnessSuggestionResponseOrBuilder
        public PndWellnessData getPndData() {
            PndWellnessData pndWellnessData = this.pndData_;
            return pndWellnessData == null ? PndWellnessData.getDefaultInstance() : pndWellnessData;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.WellnessSuggestionResponseOrBuilder
        public PndWellnessDataOrBuilder getPndDataOrBuilder() {
            PndWellnessData pndWellnessData = this.pndData_;
            return pndWellnessData == null ? PndWellnessData.getDefaultInstance() : pndWellnessData;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.wellnessSuggestion_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getPndData());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.WellnessSuggestionResponseOrBuilder
        public WellnessSuggestion getWellnessSuggestion() {
            WellnessSuggestion wellnessSuggestionForNumber = WellnessSuggestion.forNumber(this.wellnessSuggestion_);
            return wellnessSuggestionForNumber == null ? WellnessSuggestion.UNKNOWN_WELLNESS_SUGGESTION : wellnessSuggestionForNumber;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.WellnessSuggestionResponseOrBuilder
        public boolean hasPndData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.WellnessSuggestionResponseOrBuilder
        public boolean hasWellnessSuggestion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasWellnessSuggestion()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.wellnessSuggestion_;
            }
            if (hasPndData()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getPndData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_WellnessSuggestionResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(WellnessSuggestionResponse.class, Builder.class);
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
            return new WellnessSuggestionResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.wellnessSuggestion_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getPndData());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WellnessSuggestionResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<PndWellnessData, PndWellnessData.Builder, PndWellnessDataOrBuilder> pndDataBuilder_;
            private PndWellnessData pndData_;
            private int wellnessSuggestion_;

            private Builder() {
                this.wellnessSuggestion_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(WellnessSuggestionResponse wellnessSuggestionResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    wellnessSuggestionResponse.wellnessSuggestion_ = this.wellnessSuggestion_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<PndWellnessData, PndWellnessData.Builder, PndWellnessDataOrBuilder> singleFieldBuilderV3 = this.pndDataBuilder_;
                    wellnessSuggestionResponse.pndData_ = singleFieldBuilderV3 == null ? this.pndData_ : (PndWellnessData) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                wellnessSuggestionResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_WellnessSuggestionResponse_descriptor;
            }

            private SingleFieldBuilderV3<PndWellnessData, PndWellnessData.Builder, PndWellnessDataOrBuilder> getPndDataFieldBuilder() {
                if (this.pndDataBuilder_ == null) {
                    this.pndDataBuilder_ = new SingleFieldBuilderV3<>(getPndData(), getParentForChildren(), isClean());
                    this.pndData_ = null;
                }
                return this.pndDataBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getPndDataFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WellnessSuggestionResponse build() {
                WellnessSuggestionResponse wellnessSuggestionResponseBuildPartial = buildPartial();
                if (wellnessSuggestionResponseBuildPartial.isInitialized()) {
                    return wellnessSuggestionResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) wellnessSuggestionResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WellnessSuggestionResponse buildPartial() {
                WellnessSuggestionResponse wellnessSuggestionResponse = new WellnessSuggestionResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(wellnessSuggestionResponse);
                }
                onBuilt();
                return wellnessSuggestionResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.wellnessSuggestion_ = 0;
                this.pndData_ = null;
                SingleFieldBuilderV3<PndWellnessData, PndWellnessData.Builder, PndWellnessDataOrBuilder> singleFieldBuilderV3 = this.pndDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.pndDataBuilder_ = null;
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

            public Builder clearPndData() {
                this.bitField0_ &= -3;
                this.pndData_ = null;
                SingleFieldBuilderV3<PndWellnessData, PndWellnessData.Builder, PndWellnessDataOrBuilder> singleFieldBuilderV3 = this.pndDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.pndDataBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearWellnessSuggestion() {
                this.bitField0_ &= -2;
                this.wellnessSuggestion_ = 0;
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
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_WellnessSuggestionResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.WellnessSuggestionResponseOrBuilder
            public PndWellnessData getPndData() {
                SingleFieldBuilderV3<PndWellnessData, PndWellnessData.Builder, PndWellnessDataOrBuilder> singleFieldBuilderV3 = this.pndDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PndWellnessData) singleFieldBuilderV3.getMessage();
                }
                PndWellnessData pndWellnessData = this.pndData_;
                return pndWellnessData == null ? PndWellnessData.getDefaultInstance() : pndWellnessData;
            }

            public PndWellnessData.Builder getPndDataBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (PndWellnessData.Builder) getPndDataFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.WellnessSuggestionResponseOrBuilder
            public PndWellnessDataOrBuilder getPndDataOrBuilder() {
                SingleFieldBuilderV3<PndWellnessData, PndWellnessData.Builder, PndWellnessDataOrBuilder> singleFieldBuilderV3 = this.pndDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PndWellnessDataOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PndWellnessData pndWellnessData = this.pndData_;
                return pndWellnessData == null ? PndWellnessData.getDefaultInstance() : pndWellnessData;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.WellnessSuggestionResponseOrBuilder
            public WellnessSuggestion getWellnessSuggestion() {
                WellnessSuggestion wellnessSuggestionForNumber = WellnessSuggestion.forNumber(this.wellnessSuggestion_);
                return wellnessSuggestionForNumber == null ? WellnessSuggestion.UNKNOWN_WELLNESS_SUGGESTION : wellnessSuggestionForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.WellnessSuggestionResponseOrBuilder
            public boolean hasPndData() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.WellnessSuggestionResponseOrBuilder
            public boolean hasWellnessSuggestion() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_WellnessSuggestionResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(WellnessSuggestionResponse.class, Builder.class);
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
                                    if (WellnessSuggestion.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.wellnessSuggestion_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getPndDataFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergePndData(PndWellnessData pndWellnessData) {
                PndWellnessData pndWellnessData2;
                SingleFieldBuilderV3<PndWellnessData, PndWellnessData.Builder, PndWellnessDataOrBuilder> singleFieldBuilderV3 = this.pndDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(pndWellnessData);
                } else if ((this.bitField0_ & 2) == 0 || (pndWellnessData2 = this.pndData_) == null || pndWellnessData2 == PndWellnessData.getDefaultInstance()) {
                    this.pndData_ = pndWellnessData;
                } else {
                    getPndDataBuilder().mergeFrom(pndWellnessData);
                }
                if (this.pndData_ != null) {
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

            public Builder setPndData(PndWellnessData.Builder builder) {
                SingleFieldBuilderV3<PndWellnessData, PndWellnessData.Builder, PndWellnessDataOrBuilder> singleFieldBuilderV3 = this.pndDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.pndData_ = builder.build();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setWellnessSuggestion(WellnessSuggestion wellnessSuggestion) {
                wellnessSuggestion.getClass();
                this.bitField0_ |= 1;
                this.wellnessSuggestion_ = wellnessSuggestion.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WellnessSuggestionResponse getDefaultInstanceForType() {
                return WellnessSuggestionResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.wellnessSuggestion_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setPndData(PndWellnessData pndWellnessData) {
                SingleFieldBuilderV3<PndWellnessData, PndWellnessData.Builder, PndWellnessDataOrBuilder> singleFieldBuilderV3 = this.pndDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    pndWellnessData.getClass();
                    this.pndData_ = pndWellnessData;
                } else {
                    singleFieldBuilderV3.setMessage(pndWellnessData);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WellnessSuggestionResponse) {
                    return mergeFrom((WellnessSuggestionResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WellnessSuggestionResponse wellnessSuggestionResponse) {
                if (wellnessSuggestionResponse == WellnessSuggestionResponse.getDefaultInstance()) {
                    return this;
                }
                if (wellnessSuggestionResponse.hasWellnessSuggestion()) {
                    setWellnessSuggestion(wellnessSuggestionResponse.getWellnessSuggestion());
                }
                if (wellnessSuggestionResponse.hasPndData()) {
                    mergePndData(wellnessSuggestionResponse.getPndData());
                }
                mergeUnknownFields(wellnessSuggestionResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WellnessSuggestionResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static WellnessSuggestionResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WellnessSuggestionResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WellnessSuggestionResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ WellnessSuggestionResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static WellnessSuggestionResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private WellnessSuggestionResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.wellnessSuggestion_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WellnessSuggestionResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WellnessSuggestionResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WellnessSuggestionResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WellnessSuggestionResponse parseFrom(InputStream inputStream) {
            return (WellnessSuggestionResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static WellnessSuggestionResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WellnessSuggestionResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WellnessSuggestionResponse parseFrom(CodedInputStream codedInputStream) {
            return (WellnessSuggestionResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static WellnessSuggestionResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WellnessSuggestionResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class WorkoutSelectedNotification extends GeneratedMessageV3 implements WorkoutSelectedNotificationOrBuilder {
        private static final WorkoutSelectedNotification DEFAULT_INSTANCE = new WorkoutSelectedNotification();

        @Deprecated
        public static final Parser<WorkoutSelectedNotification> PARSER = new AbstractParser<WorkoutSelectedNotification>() { // from class: com.garmin.proto.generated.GDIDezlProto.WorkoutSelectedNotification.1
            @Override // com.google.protobuf.Parser
            public WorkoutSelectedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = WorkoutSelectedNotification.newBuilder();
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
        public static final int SELECTED_WORKOUT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private OTRHealthWorkout selectedWorkout_;

        private WorkoutSelectedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WorkoutSelectedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_WorkoutSelectedNotification_descriptor;
        }

        public static Builder newBuilder(WorkoutSelectedNotification workoutSelectedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(workoutSelectedNotification);
        }

        public static WorkoutSelectedNotification parseDelimitedFrom(InputStream inputStream) {
            return (WorkoutSelectedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WorkoutSelectedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<WorkoutSelectedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WorkoutSelectedNotification)) {
                return super.equals(obj);
            }
            WorkoutSelectedNotification workoutSelectedNotification = (WorkoutSelectedNotification) obj;
            if (hasSelectedWorkout() != workoutSelectedNotification.hasSelectedWorkout()) {
                return false;
            }
            return (!hasSelectedWorkout() || getSelectedWorkout().equals(workoutSelectedNotification.getSelectedWorkout())) && getUnknownFields().equals(workoutSelectedNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WorkoutSelectedNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.WorkoutSelectedNotificationOrBuilder
        public OTRHealthWorkout getSelectedWorkout() {
            OTRHealthWorkout oTRHealthWorkout = this.selectedWorkout_;
            return oTRHealthWorkout == null ? OTRHealthWorkout.getDefaultInstance() : oTRHealthWorkout;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.WorkoutSelectedNotificationOrBuilder
        public OTRHealthWorkoutOrBuilder getSelectedWorkoutOrBuilder() {
            OTRHealthWorkout oTRHealthWorkout = this.selectedWorkout_;
            return oTRHealthWorkout == null ? OTRHealthWorkout.getDefaultInstance() : oTRHealthWorkout;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSelectedWorkout()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDezlProto.WorkoutSelectedNotificationOrBuilder
        public boolean hasSelectedWorkout() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSelectedWorkout()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSelectedWorkout().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDezlProto.internal_static_GDI_Proto_Dezl_WorkoutSelectedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(WorkoutSelectedNotification.class, Builder.class);
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
            return new WorkoutSelectedNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSelectedWorkout());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WorkoutSelectedNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<OTRHealthWorkout, OTRHealthWorkout.Builder, OTRHealthWorkoutOrBuilder> selectedWorkoutBuilder_;
            private OTRHealthWorkout selectedWorkout_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(WorkoutSelectedNotification workoutSelectedNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<OTRHealthWorkout, OTRHealthWorkout.Builder, OTRHealthWorkoutOrBuilder> singleFieldBuilderV3 = this.selectedWorkoutBuilder_;
                    workoutSelectedNotification.selectedWorkout_ = singleFieldBuilderV3 == null ? this.selectedWorkout_ : (OTRHealthWorkout) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                workoutSelectedNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_WorkoutSelectedNotification_descriptor;
            }

            private SingleFieldBuilderV3<OTRHealthWorkout, OTRHealthWorkout.Builder, OTRHealthWorkoutOrBuilder> getSelectedWorkoutFieldBuilder() {
                if (this.selectedWorkoutBuilder_ == null) {
                    this.selectedWorkoutBuilder_ = new SingleFieldBuilderV3<>(getSelectedWorkout(), getParentForChildren(), isClean());
                    this.selectedWorkout_ = null;
                }
                return this.selectedWorkoutBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSelectedWorkoutFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WorkoutSelectedNotification build() {
                WorkoutSelectedNotification workoutSelectedNotificationBuildPartial = buildPartial();
                if (workoutSelectedNotificationBuildPartial.isInitialized()) {
                    return workoutSelectedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) workoutSelectedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WorkoutSelectedNotification buildPartial() {
                WorkoutSelectedNotification workoutSelectedNotification = new WorkoutSelectedNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(workoutSelectedNotification);
                }
                onBuilt();
                return workoutSelectedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.selectedWorkout_ = null;
                SingleFieldBuilderV3<OTRHealthWorkout, OTRHealthWorkout.Builder, OTRHealthWorkoutOrBuilder> singleFieldBuilderV3 = this.selectedWorkoutBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.selectedWorkoutBuilder_ = null;
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

            public Builder clearSelectedWorkout() {
                this.bitField0_ &= -2;
                this.selectedWorkout_ = null;
                SingleFieldBuilderV3<OTRHealthWorkout, OTRHealthWorkout.Builder, OTRHealthWorkoutOrBuilder> singleFieldBuilderV3 = this.selectedWorkoutBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.selectedWorkoutBuilder_ = null;
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
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_WorkoutSelectedNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.WorkoutSelectedNotificationOrBuilder
            public OTRHealthWorkout getSelectedWorkout() {
                SingleFieldBuilderV3<OTRHealthWorkout, OTRHealthWorkout.Builder, OTRHealthWorkoutOrBuilder> singleFieldBuilderV3 = this.selectedWorkoutBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OTRHealthWorkout) singleFieldBuilderV3.getMessage();
                }
                OTRHealthWorkout oTRHealthWorkout = this.selectedWorkout_;
                return oTRHealthWorkout == null ? OTRHealthWorkout.getDefaultInstance() : oTRHealthWorkout;
            }

            public OTRHealthWorkout.Builder getSelectedWorkoutBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (OTRHealthWorkout.Builder) getSelectedWorkoutFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.WorkoutSelectedNotificationOrBuilder
            public OTRHealthWorkoutOrBuilder getSelectedWorkoutOrBuilder() {
                SingleFieldBuilderV3<OTRHealthWorkout, OTRHealthWorkout.Builder, OTRHealthWorkoutOrBuilder> singleFieldBuilderV3 = this.selectedWorkoutBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OTRHealthWorkoutOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                OTRHealthWorkout oTRHealthWorkout = this.selectedWorkout_;
                return oTRHealthWorkout == null ? OTRHealthWorkout.getDefaultInstance() : oTRHealthWorkout;
            }

            @Override // com.garmin.proto.generated.GDIDezlProto.WorkoutSelectedNotificationOrBuilder
            public boolean hasSelectedWorkout() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDezlProto.internal_static_GDI_Proto_Dezl_WorkoutSelectedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(WorkoutSelectedNotification.class, Builder.class);
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
                                    codedInputStream.readMessage(getSelectedWorkoutFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSelectedWorkout(OTRHealthWorkout oTRHealthWorkout) {
                OTRHealthWorkout oTRHealthWorkout2;
                SingleFieldBuilderV3<OTRHealthWorkout, OTRHealthWorkout.Builder, OTRHealthWorkoutOrBuilder> singleFieldBuilderV3 = this.selectedWorkoutBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(oTRHealthWorkout);
                } else if ((this.bitField0_ & 1) == 0 || (oTRHealthWorkout2 = this.selectedWorkout_) == null || oTRHealthWorkout2 == OTRHealthWorkout.getDefaultInstance()) {
                    this.selectedWorkout_ = oTRHealthWorkout;
                } else {
                    getSelectedWorkoutBuilder().mergeFrom(oTRHealthWorkout);
                }
                if (this.selectedWorkout_ != null) {
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

            public Builder setSelectedWorkout(OTRHealthWorkout.Builder builder) {
                SingleFieldBuilderV3<OTRHealthWorkout, OTRHealthWorkout.Builder, OTRHealthWorkoutOrBuilder> singleFieldBuilderV3 = this.selectedWorkoutBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.selectedWorkout_ = builder.build();
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
            public WorkoutSelectedNotification getDefaultInstanceForType() {
                return WorkoutSelectedNotification.getDefaultInstance();
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

            public Builder setSelectedWorkout(OTRHealthWorkout oTRHealthWorkout) {
                SingleFieldBuilderV3<OTRHealthWorkout, OTRHealthWorkout.Builder, OTRHealthWorkoutOrBuilder> singleFieldBuilderV3 = this.selectedWorkoutBuilder_;
                if (singleFieldBuilderV3 == null) {
                    oTRHealthWorkout.getClass();
                    this.selectedWorkout_ = oTRHealthWorkout;
                } else {
                    singleFieldBuilderV3.setMessage(oTRHealthWorkout);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WorkoutSelectedNotification) {
                    return mergeFrom((WorkoutSelectedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WorkoutSelectedNotification workoutSelectedNotification) {
                if (workoutSelectedNotification == WorkoutSelectedNotification.getDefaultInstance()) {
                    return this;
                }
                if (workoutSelectedNotification.hasSelectedWorkout()) {
                    mergeSelectedWorkout(workoutSelectedNotification.getSelectedWorkout());
                }
                mergeUnknownFields(workoutSelectedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WorkoutSelectedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ WorkoutSelectedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private WorkoutSelectedNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WorkoutSelectedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WorkoutSelectedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WorkoutSelectedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WorkoutSelectedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WorkoutSelectedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WorkoutSelectedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WorkoutSelectedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WorkoutSelectedNotification parseFrom(InputStream inputStream) {
            return (WorkoutSelectedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static WorkoutSelectedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WorkoutSelectedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WorkoutSelectedNotification parseFrom(CodedInputStream codedInputStream) {
            return (WorkoutSelectedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static WorkoutSelectedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WorkoutSelectedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public enum Vendor implements ProtocolMessageEnum {
        LOVES(0),
        PILOT_FLYINGJ(1);

        public static final int LOVES_VALUE = 0;
        public static final int PILOT_FLYINGJ_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<Vendor> internalValueMap = new Internal.EnumLiteMap<Vendor>() { // from class: com.garmin.proto.generated.GDIDezlProto.Vendor.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Vendor findValueByNumber(int i14) {
                return Vendor.forNumber(i14);
            }
        };
        private static final Vendor[] VALUES = values();

        Vendor(int i14) {
            this.value = i14;
        }

        public static Vendor forNumber(int i14) {
            if (i14 == 0) {
                return LOVES;
            }
            if (i14 != 1) {
                return null;
            }
            return PILOT_FLYINGJ;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIDezlProto.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<Vendor> internalGetValueMap() {
            return internalValueMap;
        }

        public static Vendor valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static Vendor valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum WellnessSuggestion implements ProtocolMessageEnum {
        UNKNOWN_WELLNESS_SUGGESTION(0),
        INTENSITY_GOAL(1),
        ON_THE_ROAD_ALL_DAY_STRETCH(2),
        ACTIVE_CALORIES_COMPLIMENT(3),
        NEED_X_DAILY_STEPS(4),
        DAILY_REMAINING_STEPS_TO_GOAL(5),
        TEN_MINUTE_WALK_INFO(6),
        STEP_GOAL_ACHIEVED_COMPLIMENT(7),
        REDUCE_STRESS_RELAX(8),
        REDUCE_STRESS_STRETCH(9),
        REDUCE_STRESS_WALK(10),
        REDUCE_STRESS_ACTIVITY(11),
        HIGH_BODY_BATTERY_BE_ACTIVE(12),
        LOW_BODY_BATTERY_BE_ACTIVE(13),
        MORNING_ACTIVITY(14),
        DRIVE_TIME_STRETCH(15),
        DRIVE_TIME_WIND_DOWN(16),
        HEART_RATE_BE_ACTIVE(17),
        DAILY_INTENSITY_MINUTES(18),
        BEAT_INTENSITY_MINUTES_GOAL(19),
        TRY_A_WORKOUT(20),
        NO_CONSTRAINT_STRETCH(21),
        RECORD_ACTIVITY(22),
        REST_AREA_AHEAD_TAKE_A_WALK(23),
        MILES_DRIVEN_WITHOUT_STOP_BE_ACTIVE(24),
        STEPS_PER_MILE(25),
        TOTAL_MILES_DRIVEN_WALK(26),
        TOTAL_MILES_DRIVEN_STRETCH(27);

        public static final int ACTIVE_CALORIES_COMPLIMENT_VALUE = 3;
        public static final int BEAT_INTENSITY_MINUTES_GOAL_VALUE = 19;
        public static final int DAILY_INTENSITY_MINUTES_VALUE = 18;
        public static final int DAILY_REMAINING_STEPS_TO_GOAL_VALUE = 5;
        public static final int DRIVE_TIME_STRETCH_VALUE = 15;
        public static final int DRIVE_TIME_WIND_DOWN_VALUE = 16;
        public static final int HEART_RATE_BE_ACTIVE_VALUE = 17;
        public static final int HIGH_BODY_BATTERY_BE_ACTIVE_VALUE = 12;
        public static final int INTENSITY_GOAL_VALUE = 1;
        public static final int LOW_BODY_BATTERY_BE_ACTIVE_VALUE = 13;
        public static final int MILES_DRIVEN_WITHOUT_STOP_BE_ACTIVE_VALUE = 24;
        public static final int MORNING_ACTIVITY_VALUE = 14;
        public static final int NEED_X_DAILY_STEPS_VALUE = 4;
        public static final int NO_CONSTRAINT_STRETCH_VALUE = 21;
        public static final int ON_THE_ROAD_ALL_DAY_STRETCH_VALUE = 2;
        public static final int RECORD_ACTIVITY_VALUE = 22;
        public static final int REDUCE_STRESS_ACTIVITY_VALUE = 11;
        public static final int REDUCE_STRESS_RELAX_VALUE = 8;
        public static final int REDUCE_STRESS_STRETCH_VALUE = 9;
        public static final int REDUCE_STRESS_WALK_VALUE = 10;
        public static final int REST_AREA_AHEAD_TAKE_A_WALK_VALUE = 23;
        public static final int STEPS_PER_MILE_VALUE = 25;
        public static final int STEP_GOAL_ACHIEVED_COMPLIMENT_VALUE = 7;
        public static final int TEN_MINUTE_WALK_INFO_VALUE = 6;
        public static final int TOTAL_MILES_DRIVEN_STRETCH_VALUE = 27;
        public static final int TOTAL_MILES_DRIVEN_WALK_VALUE = 26;
        public static final int TRY_A_WORKOUT_VALUE = 20;
        public static final int UNKNOWN_WELLNESS_SUGGESTION_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<WellnessSuggestion> internalValueMap = new Internal.EnumLiteMap<WellnessSuggestion>() { // from class: com.garmin.proto.generated.GDIDezlProto.WellnessSuggestion.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public WellnessSuggestion findValueByNumber(int i14) {
                return WellnessSuggestion.forNumber(i14);
            }
        };
        private static final WellnessSuggestion[] VALUES = values();

        WellnessSuggestion(int i14) {
            this.value = i14;
        }

        public static WellnessSuggestion forNumber(int i14) {
            switch (i14) {
                case 0:
                    return UNKNOWN_WELLNESS_SUGGESTION;
                case 1:
                    return INTENSITY_GOAL;
                case 2:
                    return ON_THE_ROAD_ALL_DAY_STRETCH;
                case 3:
                    return ACTIVE_CALORIES_COMPLIMENT;
                case 4:
                    return NEED_X_DAILY_STEPS;
                case 5:
                    return DAILY_REMAINING_STEPS_TO_GOAL;
                case 6:
                    return TEN_MINUTE_WALK_INFO;
                case 7:
                    return STEP_GOAL_ACHIEVED_COMPLIMENT;
                case 8:
                    return REDUCE_STRESS_RELAX;
                case 9:
                    return REDUCE_STRESS_STRETCH;
                case 10:
                    return REDUCE_STRESS_WALK;
                case 11:
                    return REDUCE_STRESS_ACTIVITY;
                case 12:
                    return HIGH_BODY_BATTERY_BE_ACTIVE;
                case 13:
                    return LOW_BODY_BATTERY_BE_ACTIVE;
                case 14:
                    return MORNING_ACTIVITY;
                case 15:
                    return DRIVE_TIME_STRETCH;
                case 16:
                    return DRIVE_TIME_WIND_DOWN;
                case 17:
                    return HEART_RATE_BE_ACTIVE;
                case 18:
                    return DAILY_INTENSITY_MINUTES;
                case 19:
                    return BEAT_INTENSITY_MINUTES_GOAL;
                case 20:
                    return TRY_A_WORKOUT;
                case 21:
                    return NO_CONSTRAINT_STRETCH;
                case 22:
                    return RECORD_ACTIVITY;
                case 23:
                    return REST_AREA_AHEAD_TAKE_A_WALK;
                case 24:
                    return MILES_DRIVEN_WITHOUT_STOP_BE_ACTIVE;
                case 25:
                    return STEPS_PER_MILE;
                case 26:
                    return TOTAL_MILES_DRIVEN_WALK;
                case 27:
                    return TOTAL_MILES_DRIVEN_STRETCH;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIDezlProto.getDescriptor().getEnumTypes().get(3);
        }

        public static Internal.EnumLiteMap<WellnessSuggestion> internalGetValueMap() {
            return internalValueMap;
        }

        public static WellnessSuggestion valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static WellnessSuggestion valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum WorkoutStageType implements ProtocolMessageEnum {
        UNKNOWN_STAGE(0),
        REST_STAGE(1),
        EXERCISE_STAGE(2),
        REST_BETWEEN_EXERCISES_STAGE(3),
        EXERCISE_MIRROR_ARM_STAGE(4),
        EXERCISE_MIRROR_LEG_STAGE(5),
        EXERCISE_MIRROR_SIDE_STAGE(6),
        EXERCISE_DURATION_OPEN(7);

        public static final int EXERCISE_DURATION_OPEN_VALUE = 7;
        public static final int EXERCISE_MIRROR_ARM_STAGE_VALUE = 4;
        public static final int EXERCISE_MIRROR_LEG_STAGE_VALUE = 5;
        public static final int EXERCISE_MIRROR_SIDE_STAGE_VALUE = 6;
        public static final int EXERCISE_STAGE_VALUE = 2;
        public static final int REST_BETWEEN_EXERCISES_STAGE_VALUE = 3;
        public static final int REST_STAGE_VALUE = 1;
        public static final int UNKNOWN_STAGE_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<WorkoutStageType> internalValueMap = new Internal.EnumLiteMap<WorkoutStageType>() { // from class: com.garmin.proto.generated.GDIDezlProto.WorkoutStageType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public WorkoutStageType findValueByNumber(int i14) {
                return WorkoutStageType.forNumber(i14);
            }
        };
        private static final WorkoutStageType[] VALUES = values();

        WorkoutStageType(int i14) {
            this.value = i14;
        }

        public static WorkoutStageType forNumber(int i14) {
            switch (i14) {
                case 0:
                    return UNKNOWN_STAGE;
                case 1:
                    return REST_STAGE;
                case 2:
                    return EXERCISE_STAGE;
                case 3:
                    return REST_BETWEEN_EXERCISES_STAGE;
                case 4:
                    return EXERCISE_MIRROR_ARM_STAGE;
                case 5:
                    return EXERCISE_MIRROR_LEG_STAGE;
                case 6:
                    return EXERCISE_MIRROR_SIDE_STAGE;
                case 7:
                    return EXERCISE_DURATION_OPEN;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIDezlProto.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<WorkoutStageType> internalGetValueMap() {
            return internalValueMap;
        }

        public static WorkoutStageType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static WorkoutStageType valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum WorkoutType implements ProtocolMessageEnum {
        UNKNOWN_TYPE(0),
        STRETCH_WORKOUT(1),
        LOW_INTENSITY_WORKOUT(2),
        HIGH_INTENSITY_WORKOUT(3),
        KR_BODY_WEIGHT_CORE(4),
        KR_BODY_WEIGHT_PUSH(5),
        KR_BODY_WEIGHT_PULL(6),
        KR_DUMBBELL_CORE(7),
        KR_DUMBBELL_PUSH(8),
        KR_DUMBBELL_PULL(9),
        KR_RESISTANCE_BAR_CORE(10),
        KR_RESISTANCE_BAR_PUSH(11),
        KR_RESISTANCE_BAR_PULL(12),
        TRUCKERS_LIFE_AT_A_GYM(13),
        TRUCKERS_LIFE_ON_THE_ROAD(14);

        public static final int HIGH_INTENSITY_WORKOUT_VALUE = 3;
        public static final int KR_BODY_WEIGHT_CORE_VALUE = 4;
        public static final int KR_BODY_WEIGHT_PULL_VALUE = 6;
        public static final int KR_BODY_WEIGHT_PUSH_VALUE = 5;
        public static final int KR_DUMBBELL_CORE_VALUE = 7;
        public static final int KR_DUMBBELL_PULL_VALUE = 9;
        public static final int KR_DUMBBELL_PUSH_VALUE = 8;
        public static final int KR_RESISTANCE_BAR_CORE_VALUE = 10;
        public static final int KR_RESISTANCE_BAR_PULL_VALUE = 12;
        public static final int KR_RESISTANCE_BAR_PUSH_VALUE = 11;
        public static final int LOW_INTENSITY_WORKOUT_VALUE = 2;
        public static final int STRETCH_WORKOUT_VALUE = 1;
        public static final int TRUCKERS_LIFE_AT_A_GYM_VALUE = 13;
        public static final int TRUCKERS_LIFE_ON_THE_ROAD_VALUE = 14;
        public static final int UNKNOWN_TYPE_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<WorkoutType> internalValueMap = new Internal.EnumLiteMap<WorkoutType>() { // from class: com.garmin.proto.generated.GDIDezlProto.WorkoutType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public WorkoutType findValueByNumber(int i14) {
                return WorkoutType.forNumber(i14);
            }
        };
        private static final WorkoutType[] VALUES = values();

        WorkoutType(int i14) {
            this.value = i14;
        }

        public static WorkoutType forNumber(int i14) {
            switch (i14) {
                case 0:
                    return UNKNOWN_TYPE;
                case 1:
                    return STRETCH_WORKOUT;
                case 2:
                    return LOW_INTENSITY_WORKOUT;
                case 3:
                    return HIGH_INTENSITY_WORKOUT;
                case 4:
                    return KR_BODY_WEIGHT_CORE;
                case 5:
                    return KR_BODY_WEIGHT_PUSH;
                case 6:
                    return KR_BODY_WEIGHT_PULL;
                case 7:
                    return KR_DUMBBELL_CORE;
                case 8:
                    return KR_DUMBBELL_PUSH;
                case 9:
                    return KR_DUMBBELL_PULL;
                case 10:
                    return KR_RESISTANCE_BAR_CORE;
                case 11:
                    return KR_RESISTANCE_BAR_PUSH;
                case 12:
                    return KR_RESISTANCE_BAR_PULL;
                case 13:
                    return TRUCKERS_LIFE_AT_A_GYM;
                case 14:
                    return TRUCKERS_LIFE_ON_THE_ROAD;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIDezlProto.getDescriptor().getEnumTypes().get(2);
        }

        public static Internal.EnumLiteMap<WorkoutType> internalGetValueMap() {
            return internalValueMap;
        }

        public static WorkoutType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static WorkoutType valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
