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

/* JADX INFO: loaded from: classes5.dex */
public final class GDIHSAData {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0010GDIHSAData.proto\u0012\u0011GDI.Proto.HSAData\"´\u000f\n\u000eHSADataService\u0012D\n\u0015hsa_file_xfer_request\u0018\u0001 \u0001(\u000b2%.GDI.Proto.HSAData.HSAFileXferRequest\u0012H\n\u0014hsa_file_xfer_ntfctn\u0018\u0002 \u0001(\u000b2*.GDI.Proto.HSAData.HSAFileXferNotification\u0012U\n\u001cuhc_accel_params_set_request\u0018\u0003 \u0001(\u000b2/.GDI.Proto.HSAData.UHCAccelParametersSetRequest\u0012W\n\u001duhc_accel_params_set_response\u0018\u0004 \u0001(\u000b20.GDI.Proto.HSAData.UHCAccelParametersSetResponse\u0012U\n\u001cuhc_accel_params_get_request\u0018\u0005 \u0001(\u000b2/.GDI.Proto.HSAData.UHCAccelParametersGetRequest\u0012W\n\u001duhc_accel_params_get_response\u0018\u0006 \u0001(\u000b20.GDI.Proto.HSAData.UHCAccelParametersGetResponse\u0012G\n\u0016uhc_activation_request\u0018\u0007 \u0001(\u000b2'.GDI.Proto.HSAData.UHCActivationRequest\u0012I\n\u0017uhc_activation_response\u0018\b \u0001(\u000b2(.GDI.Proto.HSAData.UHCActivationResponse\u0012U\n\u001euhc_fit_parameters_set_request\u0018\t \u0001(\u000b2-.GDI.Proto.HSAData.UHCFitParametersSetRequest\u0012W\n\u001fuhc_fit_parameters_set_response\u0018\n \u0001(\u000b2..GDI.Proto.HSAData.UHCFitParametersSetResponse\u0012U\n\u001euhc_fit_parameters_get_request\u0018\u000b \u0001(\u000b2-.GDI.Proto.HSAData.UHCFitParametersGetRequest\u0012W\n\u001fuhc_fit_parameters_get_response\u0018\f \u0001(\u000b2..GDI.Proto.HSAData.UHCFitParametersGetResponse\u0012K\n\u0019uhc_time_vars_set_request\u0018\r \u0001(\u000b2(.GDI.Proto.HSAData.UHCTimeVarsSetRequest\u0012M\n\u001auhc_time_vars_set_response\u0018\u000e \u0001(\u000b2).GDI.Proto.HSAData.UHCTimeVarsSetResponse\u0012M\n\u001ahsa_fit_log_config_request\u0018\u000f \u0001(\u000b2).GDI.Proto.HSAData.HSAFitLogConfigRequest\u0012O\n\u001bhsa_fit_log_config_response\u0018\u0010 \u0001(\u000b2*.GDI.Proto.HSAData.HSAFitLogConfigResponse\u0012Y\n hsa_fit_log_capabilities_request\u0018\u0011 \u0001(\u000b2/.GDI.Proto.HSAData.HSAFitLogCapabilitiesRequest\u0012[\n!hsa_fit_log_capabilities_response\u0018\u0012 \u0001(\u000b20.GDI.Proto.HSAData.HSAFitLogCapabilitiesResponse\u0012C\n\u0014hsa_features_request\u0018\u0013 \u0001(\u000b2%.GDI.Proto.HSAData.HSAFeaturesRequest\u0012E\n\u0015hsa_features_response\u0018\u0014 \u0001(\u000b2&.GDI.Proto.HSAData.HSAFeaturesResponse\u0012Y\n hsa_fit_file_compression_request\u0018\u0015 \u0001(\u000b2/.GDI.Proto.HSAData.HSAFitFileCompressionRequest\u0012[\n!hsa_fit_file_compression_response\u0018\u0016 \u0001(\u000b20.GDI.Proto.HSAData.HSAFitFileCompressionResponse\u0012A\n\u0013hsa_generic_request\u0018\u0017 \u0001(\u000b2$.GDI.Proto.HSAData.HSAGenericRequest\u0012C\n\u0014hsa_generic_response\u0018\u0018 \u0001(\u000b2%.GDI.Proto.HSAData.HSAGenericResponse\"\u0014\n\u0012HSAFeaturesRequest\"Æ\u0001\n\u0013HSAFeaturesResponse\u0012E\n\u0006status\u0018\u0001 \u0002(\u000e25.GDI.Proto.HSAData.HSAFeaturesResponse.ResponseStatus\u0012\u0013\n\u000bfeatures_bf\u0018\u0002 \u0002(\r\"S\n\u000eResponseStatus\u0012\u001b\n\u0017UNKNOWN_RESPONSE_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010d\u0012\n\n\u0005ERROR\u0010È\u0001\u0012\u0010\n\u000bUNSUPPORTED\u0010¬\u0002\"®\u0001\n\u0012HSAFileXferRequest\u0012\u0014\n\frequest_sync\u0018\u0001 \u0002(\b\u0012L\n\frequest_type\u0018\u0002 \u0001(\u000e21.GDI.Proto.HSAData.HSAFileXferRequest.RequestType:\u0003UHC\"4\n\u000bRequestType\u0012\u0007\n\u0003UHC\u0010\u0000\u0012\n\n\u0006CUSTOM\u0010\u0001\u0012\u0010\n\fECG_CLINICAL\u0010\u0002\"\u008c\u0001\n\u0017HSAFileXferNotification\u0012>\n\u000efile_xfer_list\u0018\u0001 \u0003(\u000b2&.GDI.Proto.HSAData.HSADataTransferItem\u0012\u0018\n\u0010total_file_count\u0018\u0002 \u0001(\r\u0012\u0017\n\u000ftotal_file_size\u0018\u0003 \u0001(\r\"/\n\u0013HSADataTransferItem\u0012\n\n\u0002id\u0018\u0001 \u0002(\r\u0012\f\n\u0004size\u0018\u0002 \u0002(\r\"Ú\u0001\n\u001cUHCAccelParametersSetRequest\u0012\u0018\n\u0010sessions_per_day\u0018\u0001 \u0002(\r\u0012 \n\u0018pre_collection_intervals\u0018\u0002 \u0002(\r\u0012 \n\u0018num_collection_intervals\u0018\u0003 \u0002(\r\u0012\u001e\n\u0016min_steps_per_interval\u0018\u0004 \u0002(\r\u0012\u001e\n\u0016max_steps_per_interval\u0018\u0005 \u0002(\r\u0012\u001c\n\u0014interval_sample_size\u0018\u0006 \u0002(\r\"³\u0001\n\u001dUHCAccelParametersSetResponse\u0012O\n\u0006status\u0018\u0001 \u0002(\u000e2?.GDI.Proto.HSAData.UHCAccelParametersSetResponse.ResponseStatus\"A\n\u000eResponseStatus\u0012\u001b\n\u0017UNKNOWN_RESPONSE_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010d\u0012\n\n\u0005ERROR\u0010È\u0001\"6\n\u001cUHCAccelParametersGetRequest\u0012\u0016\n\u000eget_parameters\u0018\u0001 \u0002(\b\"Û\u0001\n\u001dUHCAccelParametersGetResponse\u0012\u0018\n\u0010sessions_per_day\u0018\u0001 \u0002(\r\u0012 \n\u0018pre_collection_intervals\u0018\u0002 \u0002(\r\u0012 \n\u0018num_collection_intervals\u0018\u0003 \u0002(\r\u0012\u001e\n\u0016min_steps_per_interval\u0018\u0004 \u0002(\r\u0012\u001e\n\u0016max_steps_per_interval\u0018\u0005 \u0002(\r\u0012\u001c\n\u0014interval_sample_size\u0018\u0006 \u0002(\r\"D\n\u0014UHCActivationRequest\u0012\u0014\n\factivate_uhc\u0018\u0001 \u0002(\b\u0012\u0016\n\u000eactivation_key\u0018\u0002 \u0002(\r\"µ\u0001\n\u0015UHCActivationResponse\u0012G\n\u0006status\u0018\u0001 \u0002(\u000e27.GDI.Proto.HSAData.UHCActivationResponse.ResponseStatus\u0012\u0010\n\buhc_UUID\u0018\u0002 \u0002(\u0005\"A\n\u000eResponseStatus\u0012\u001b\n\u0017UNKNOWN_RESPONSE_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010d\u0012\n\n\u0005ERROR\u0010È\u0001\"ê\u0001\n\u001aUHCFitParametersSetRequest\u0012\u001d\n\u0015freq_period_step_goal\u0018\u0001 \u0002(\r\u0012\u001c\n\u0014freq_period_len_mins\u0018\u0002 \u0002(\r\u0012\u001b\n\u0013freq_delay_len_mins\u0018\u0003 \u0002(\r\u0012\u001b\n\u0013freq_daily_goal_cnt\u0018\u0004 \u0002(\r\u0012\u0017\n\u000finten_step_goal\u0018\u0005 \u0002(\r\u0012\u001d\n\u0015inten_active_min_goal\u0018\u0006 \u0002(\r\u0012\u001d\n\u0015tenac_daily_step_goal\u0018\u0007 \u0002(\r\"¯\u0001\n\u001bUHCFitParametersSetResponse\u0012M\n\u0006status\u0018\u0001 \u0002(\u000e2=.GDI.Proto.HSAData.UHCFitParametersSetResponse.ResponseStatus\"A\n\u000eResponseStatus\u0012\u001b\n\u0017UNKNOWN_RESPONSE_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010d\u0012\n\n\u0005ERROR\u0010È\u0001\"4\n\u001aUHCFitParametersGetRequest\u0012\u0016\n\u000eget_parameters\u0018\u0001 \u0002(\b\"ë\u0001\n\u001bUHCFitParametersGetResponse\u0012\u001d\n\u0015freq_period_step_goal\u0018\u0001 \u0002(\r\u0012\u001c\n\u0014freq_period_len_mins\u0018\u0002 \u0002(\r\u0012\u001b\n\u0013freq_delay_len_mins\u0018\u0003 \u0002(\r\u0012\u001b\n\u0013freq_daily_goal_cnt\u0018\u0004 \u0002(\r\u0012\u0017\n\u000finten_step_goal\u0018\u0005 \u0002(\r\u0012\u001d\n\u0015inten_active_min_goal\u0018\u0006 \u0002(\r\u0012\u001d\n\u0015tenac_daily_step_goal\u0018\u0007 \u0002(\r\"v\n\u0015UHCTimeVarsSetRequest\u0012\u0010\n\bset_time\u0018\u0001 \u0002(\b\u0012\u0014\n\frtc_time_sec\u0018\u0002 \u0001(\r\u0012\u001c\n\u0014time_to_midnight_sec\u0018\u0003 \u0001(\r\u0012\u0017\n\u000ftimezone_offset\u0018\u0004 \u0001(\u0005\"Ù\u0001\n\u0016UHCTimeVarsSetResponse\u0012H\n\u0006status\u0018\u0001 \u0002(\u000e28.GDI.Proto.HSAData.UHCTimeVarsSetResponse.ResponseStatus\u0012\u0014\n\frtc_time_sec\u0018\u0002 \u0002(\r\u0012\u001c\n\u0014time_to_midnight_sec\u0018\u0003 \u0002(\r\"A\n\u000eResponseStatus\u0012\u001b\n\u0017UNKNOWN_RESPONSE_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010d\u0012\n\n\u0005ERROR\u0010È\u0001\"L\n\u0016HSAFitLogConfigRequest\u00122\n\u0006config\u0018\u0001 \u0001(\u000b2\".GDI.Proto.HSAData.HSAFitLogConfig\"Û\u0001\n\u0017HSAFitLogConfigResponse\u0012I\n\u0006status\u0018\u0001 \u0002(\u000e29.GDI.Proto.HSAData.HSAFitLogConfigResponse.ResponseStatus\u00122\n\u0006config\u0018\u0002 \u0001(\u000b2\".GDI.Proto.HSAData.HSAFitLogConfig\"A\n\u000eResponseStatus\u0012\u001b\n\u0017UNKNOWN_RESPONSE_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010d\u0012\n\n\u0005ERROR\u0010È\u0001\"´\u0002\n\u000fHSAFitLogConfig\u0012\r\n\u0005state\u0018\u0001 \u0001(\b\u0012=\n\u0006source\u0018\u0002 \u0002(\u000e2-.GDI.Proto.HSAData.HSAFitLogConfig.SourceType\u0012\u001b\n\u0013processing_interval\u0018\u0003 \u0001(\r\"µ\u0001\n\nSourceType\u0012\u0007\n\u0003HRV\u0010\u0000\u0012\u0011\n\rZERO_CROSSING\u0010\u0001\u0012\u000e\n\nHEART_RATE\u0010\u0002\u0012\r\n\tRAW_ACCEL\u0010\u0003\u0012\u000b\n\u0007RAW_PPG\u0010\u0004\u0012\u000f\n\u000bRESPIRATION\u0010\u0005\u0012\b\n\u0004SPO2\u0010\u0006\u0012\t\n\u0005STEPS\u0010\u0007\u0012\n\n\u0006STRESS\u0010\b\u0012\r\n\tHYDRATION\u0010\t\u0012\u0010\n\fBODY_BATTERY\u0010\n\u0012\f\n\bRAW_GYRO\u0010\u000b\"-\n\u0011HSAGenericRequest\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0005\u0012\f\n\u0004data\u0018\u0002 \u0001(\f\"®\u0001\n\u0012HSAGenericResponse\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0005\u0012D\n\u0006status\u0018\u0002 \u0001(\u000e24.GDI.Proto.HSAData.HSAGenericResponse.ResponseStatus\u0012\f\n\u0004data\u0018\u0003 \u0001(\f\"8\n\u000eResponseStatus\u0012\u0012\n\u000eUNKNOWN_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010d\u0012\n\n\u0005ERROR\u0010È\u0001\"\u001e\n\u001cHSAFitLogCapabilitiesRequest\"Ì\u0001\n\u001dHSAFitLogCapabilitiesResponse\u0012O\n\u0006status\u0018\u0001 \u0002(\u000e2?.GDI.Proto.HSAData.HSAFitLogCapabilitiesResponse.ResponseStatus\u0012\u0017\n\u000fcapabilities_bf\u0018\u0002 \u0002(\r\"A\n\u000eResponseStatus\u0012\u001b\n\u0017UNKNOWN_RESPONSE_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010d\u0012\n\n\u0005ERROR\u0010È\u0001\"<\n\u001cHSAFitFileCompressionRequest\u0012\u001c\n\u0014files_to_compress_bf\u0018\u0001 \u0001(\r\"Ð\u0001\n\u001dHSAFitFileCompressionResponse\u0012O\n\u0006status\u0018\u0001 \u0002(\u000e2?.GDI.Proto.HSAData.HSAFitFileCompressionResponse.ResponseStatus\u0012\u001b\n\u0013files_compressed_bf\u0018\u0002 \u0002(\r\"A\n\u000eResponseStatus\u0012\u001b\n\u0017UNKNOWN_RESPONSE_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010d\u0012\n\n\u0005ERROR\u0010È\u0001*\u0082\u0001\n\u000bHSAFeatures\u0012\u0015\n\u0011UNITED_HEALTHCARE\u0010\u0001\u0012\u0017\n\u0013CUSTOM_DATA_LOGGING\u0010\u0002\u0012\u001b\n\u0017CUSTOM_DATA_COMPRESSION\u0010\u0004\u0012\u000f\n\u000bGENERIC_MSG\u0010\b\u0012\u0015\n\u0011CUSTOM_DATA_SYNC2\u0010\u0010*Å\u0001\n\u0015HSAFitLogCapabilities\u0012\u0007\n\u0003HRV\u0010\u0001\u0012\u0011\n\rZERO_CROSSING\u0010\u0002\u0012\u000e\n\nHEART_RATE\u0010\u0004\u0012\r\n\tRAW_ACCEL\u0010\b\u0012\u000b\n\u0007RAW_PPG\u0010\u0010\u0012\u000f\n\u000bRESPIRATION\u0010 \u0012\b\n\u0004SPO2\u0010@\u0012\n\n\u0005STEPS\u0010\u0080\u0001\u0012\u000b\n\u0006STRESS\u0010\u0080\u0002\u0012\u000e\n\tHYDRATION\u0010\u0080\u0004\u0012\u0011\n\fBODY_BATTERY\u0010\u0080\b\u0012\r\n\bRAW_GYRO\u0010\u0080\u0010*O\n\u0015HSAFitFilesToCompress\u0012\u001b\n\u0017UNITED_HEALTHCARE_FILES\u0010\u0001\u0012\u0019\n\u0015CUSTOM_DATA_LOG_FILES\u0010\u0002B*\n\u001acom.garmin.proto.generatedB\nGDIHSADataH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_HSADataService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_HSADataService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_HSADataTransferItem_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_HSADataTransferItem_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_HSAFeaturesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_HSAFeaturesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_HSAFeaturesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_HSAFeaturesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_HSAFileXferNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_HSAFileXferNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_HSAFileXferRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_HSAFileXferRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_HSAFitFileCompressionRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_HSAFitFileCompressionRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_HSAFitFileCompressionResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_HSAFitFileCompressionResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_HSAFitLogCapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_HSAFitLogCapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_HSAFitLogCapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_HSAFitLogCapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_HSAFitLogConfigRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_HSAFitLogConfigRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_HSAFitLogConfigResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_HSAFitLogConfigResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_HSAFitLogConfig_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_HSAFitLogConfig_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_HSAGenericRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_HSAGenericRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_HSAGenericResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_HSAGenericResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_UHCAccelParametersGetRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_UHCAccelParametersGetRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_UHCAccelParametersGetResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_UHCAccelParametersGetResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_UHCAccelParametersSetRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_UHCAccelParametersSetRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_UHCAccelParametersSetResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_UHCAccelParametersSetResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_UHCActivationRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_UHCActivationRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_UHCActivationResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_UHCActivationResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_UHCFitParametersGetRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_UHCFitParametersGetRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_UHCFitParametersGetResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_UHCFitParametersGetResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_UHCFitParametersSetRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_UHCFitParametersSetRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_UHCFitParametersSetResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_UHCFitParametersSetResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_UHCTimeVarsSetRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_UHCTimeVarsSetRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_HSAData_UHCTimeVarsSetResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_HSAData_UHCTimeVarsSetResponse_fieldAccessorTable;

    public interface HSADataServiceOrBuilder extends MessageOrBuilder {
        HSAFeaturesRequest getHsaFeaturesRequest();

        HSAFeaturesRequestOrBuilder getHsaFeaturesRequestOrBuilder();

        HSAFeaturesResponse getHsaFeaturesResponse();

        HSAFeaturesResponseOrBuilder getHsaFeaturesResponseOrBuilder();

        HSAFileXferNotification getHsaFileXferNtfctn();

        HSAFileXferNotificationOrBuilder getHsaFileXferNtfctnOrBuilder();

        HSAFileXferRequest getHsaFileXferRequest();

        HSAFileXferRequestOrBuilder getHsaFileXferRequestOrBuilder();

        HSAFitFileCompressionRequest getHsaFitFileCompressionRequest();

        HSAFitFileCompressionRequestOrBuilder getHsaFitFileCompressionRequestOrBuilder();

        HSAFitFileCompressionResponse getHsaFitFileCompressionResponse();

        HSAFitFileCompressionResponseOrBuilder getHsaFitFileCompressionResponseOrBuilder();

        HSAFitLogCapabilitiesRequest getHsaFitLogCapabilitiesRequest();

        HSAFitLogCapabilitiesRequestOrBuilder getHsaFitLogCapabilitiesRequestOrBuilder();

        HSAFitLogCapabilitiesResponse getHsaFitLogCapabilitiesResponse();

        HSAFitLogCapabilitiesResponseOrBuilder getHsaFitLogCapabilitiesResponseOrBuilder();

        HSAFitLogConfigRequest getHsaFitLogConfigRequest();

        HSAFitLogConfigRequestOrBuilder getHsaFitLogConfigRequestOrBuilder();

        HSAFitLogConfigResponse getHsaFitLogConfigResponse();

        HSAFitLogConfigResponseOrBuilder getHsaFitLogConfigResponseOrBuilder();

        HSAGenericRequest getHsaGenericRequest();

        HSAGenericRequestOrBuilder getHsaGenericRequestOrBuilder();

        HSAGenericResponse getHsaGenericResponse();

        HSAGenericResponseOrBuilder getHsaGenericResponseOrBuilder();

        UHCAccelParametersGetRequest getUhcAccelParamsGetRequest();

        UHCAccelParametersGetRequestOrBuilder getUhcAccelParamsGetRequestOrBuilder();

        UHCAccelParametersGetResponse getUhcAccelParamsGetResponse();

        UHCAccelParametersGetResponseOrBuilder getUhcAccelParamsGetResponseOrBuilder();

        UHCAccelParametersSetRequest getUhcAccelParamsSetRequest();

        UHCAccelParametersSetRequestOrBuilder getUhcAccelParamsSetRequestOrBuilder();

        UHCAccelParametersSetResponse getUhcAccelParamsSetResponse();

        UHCAccelParametersSetResponseOrBuilder getUhcAccelParamsSetResponseOrBuilder();

        UHCActivationRequest getUhcActivationRequest();

        UHCActivationRequestOrBuilder getUhcActivationRequestOrBuilder();

        UHCActivationResponse getUhcActivationResponse();

        UHCActivationResponseOrBuilder getUhcActivationResponseOrBuilder();

        UHCFitParametersGetRequest getUhcFitParametersGetRequest();

        UHCFitParametersGetRequestOrBuilder getUhcFitParametersGetRequestOrBuilder();

        UHCFitParametersGetResponse getUhcFitParametersGetResponse();

        UHCFitParametersGetResponseOrBuilder getUhcFitParametersGetResponseOrBuilder();

        UHCFitParametersSetRequest getUhcFitParametersSetRequest();

        UHCFitParametersSetRequestOrBuilder getUhcFitParametersSetRequestOrBuilder();

        UHCFitParametersSetResponse getUhcFitParametersSetResponse();

        UHCFitParametersSetResponseOrBuilder getUhcFitParametersSetResponseOrBuilder();

        UHCTimeVarsSetRequest getUhcTimeVarsSetRequest();

        UHCTimeVarsSetRequestOrBuilder getUhcTimeVarsSetRequestOrBuilder();

        UHCTimeVarsSetResponse getUhcTimeVarsSetResponse();

        UHCTimeVarsSetResponseOrBuilder getUhcTimeVarsSetResponseOrBuilder();

        boolean hasHsaFeaturesRequest();

        boolean hasHsaFeaturesResponse();

        boolean hasHsaFileXferNtfctn();

        boolean hasHsaFileXferRequest();

        boolean hasHsaFitFileCompressionRequest();

        boolean hasHsaFitFileCompressionResponse();

        boolean hasHsaFitLogCapabilitiesRequest();

        boolean hasHsaFitLogCapabilitiesResponse();

        boolean hasHsaFitLogConfigRequest();

        boolean hasHsaFitLogConfigResponse();

        boolean hasHsaGenericRequest();

        boolean hasHsaGenericResponse();

        boolean hasUhcAccelParamsGetRequest();

        boolean hasUhcAccelParamsGetResponse();

        boolean hasUhcAccelParamsSetRequest();

        boolean hasUhcAccelParamsSetResponse();

        boolean hasUhcActivationRequest();

        boolean hasUhcActivationResponse();

        boolean hasUhcFitParametersGetRequest();

        boolean hasUhcFitParametersGetResponse();

        boolean hasUhcFitParametersSetRequest();

        boolean hasUhcFitParametersSetResponse();

        boolean hasUhcTimeVarsSetRequest();

        boolean hasUhcTimeVarsSetResponse();
    }

    public interface HSADataTransferItemOrBuilder extends MessageOrBuilder {
        int getId();

        int getSize();

        boolean hasId();

        boolean hasSize();
    }

    public interface HSAFeaturesRequestOrBuilder extends MessageOrBuilder {
    }

    public interface HSAFeaturesResponseOrBuilder extends MessageOrBuilder {
        int getFeaturesBf();

        HSAFeaturesResponse.ResponseStatus getStatus();

        boolean hasFeaturesBf();

        boolean hasStatus();
    }

    public interface HSAFileXferNotificationOrBuilder extends MessageOrBuilder {
        HSADataTransferItem getFileXferList(int i14);

        int getFileXferListCount();

        List<HSADataTransferItem> getFileXferListList();

        HSADataTransferItemOrBuilder getFileXferListOrBuilder(int i14);

        List<? extends HSADataTransferItemOrBuilder> getFileXferListOrBuilderList();

        int getTotalFileCount();

        int getTotalFileSize();

        boolean hasTotalFileCount();

        boolean hasTotalFileSize();
    }

    public interface HSAFileXferRequestOrBuilder extends MessageOrBuilder {
        boolean getRequestSync();

        HSAFileXferRequest.RequestType getRequestType();

        boolean hasRequestSync();

        boolean hasRequestType();
    }

    public interface HSAFitFileCompressionRequestOrBuilder extends MessageOrBuilder {
        int getFilesToCompressBf();

        boolean hasFilesToCompressBf();
    }

    public interface HSAFitFileCompressionResponseOrBuilder extends MessageOrBuilder {
        int getFilesCompressedBf();

        HSAFitFileCompressionResponse.ResponseStatus getStatus();

        boolean hasFilesCompressedBf();

        boolean hasStatus();
    }

    public interface HSAFitLogCapabilitiesRequestOrBuilder extends MessageOrBuilder {
    }

    public interface HSAFitLogCapabilitiesResponseOrBuilder extends MessageOrBuilder {
        int getCapabilitiesBf();

        HSAFitLogCapabilitiesResponse.ResponseStatus getStatus();

        boolean hasCapabilitiesBf();

        boolean hasStatus();
    }

    public interface HSAFitLogConfigOrBuilder extends MessageOrBuilder {
        int getProcessingInterval();

        HSAFitLogConfig.SourceType getSource();

        boolean getState();

        boolean hasProcessingInterval();

        boolean hasSource();

        boolean hasState();
    }

    public interface HSAFitLogConfigRequestOrBuilder extends MessageOrBuilder {
        HSAFitLogConfig getConfig();

        HSAFitLogConfigOrBuilder getConfigOrBuilder();

        boolean hasConfig();
    }

    public interface HSAFitLogConfigResponseOrBuilder extends MessageOrBuilder {
        HSAFitLogConfig getConfig();

        HSAFitLogConfigOrBuilder getConfigOrBuilder();

        HSAFitLogConfigResponse.ResponseStatus getStatus();

        boolean hasConfig();

        boolean hasStatus();
    }

    public interface HSAGenericRequestOrBuilder extends MessageOrBuilder {
        ByteString getData();

        int getId();

        boolean hasData();

        boolean hasId();
    }

    public interface HSAGenericResponseOrBuilder extends MessageOrBuilder {
        ByteString getData();

        int getId();

        HSAGenericResponse.ResponseStatus getStatus();

        boolean hasData();

        boolean hasId();

        boolean hasStatus();
    }

    public interface UHCAccelParametersGetRequestOrBuilder extends MessageOrBuilder {
        boolean getGetParameters();

        boolean hasGetParameters();
    }

    public interface UHCAccelParametersGetResponseOrBuilder extends MessageOrBuilder {
        int getIntervalSampleSize();

        int getMaxStepsPerInterval();

        int getMinStepsPerInterval();

        int getNumCollectionIntervals();

        int getPreCollectionIntervals();

        int getSessionsPerDay();

        boolean hasIntervalSampleSize();

        boolean hasMaxStepsPerInterval();

        boolean hasMinStepsPerInterval();

        boolean hasNumCollectionIntervals();

        boolean hasPreCollectionIntervals();

        boolean hasSessionsPerDay();
    }

    public interface UHCAccelParametersSetRequestOrBuilder extends MessageOrBuilder {
        int getIntervalSampleSize();

        int getMaxStepsPerInterval();

        int getMinStepsPerInterval();

        int getNumCollectionIntervals();

        int getPreCollectionIntervals();

        int getSessionsPerDay();

        boolean hasIntervalSampleSize();

        boolean hasMaxStepsPerInterval();

        boolean hasMinStepsPerInterval();

        boolean hasNumCollectionIntervals();

        boolean hasPreCollectionIntervals();

        boolean hasSessionsPerDay();
    }

    public interface UHCAccelParametersSetResponseOrBuilder extends MessageOrBuilder {
        UHCAccelParametersSetResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface UHCActivationRequestOrBuilder extends MessageOrBuilder {
        boolean getActivateUhc();

        int getActivationKey();

        boolean hasActivateUhc();

        boolean hasActivationKey();
    }

    public interface UHCActivationResponseOrBuilder extends MessageOrBuilder {
        UHCActivationResponse.ResponseStatus getStatus();

        int getUhcUUID();

        boolean hasStatus();

        boolean hasUhcUUID();
    }

    public interface UHCFitParametersGetRequestOrBuilder extends MessageOrBuilder {
        boolean getGetParameters();

        boolean hasGetParameters();
    }

    public interface UHCFitParametersGetResponseOrBuilder extends MessageOrBuilder {
        int getFreqDailyGoalCnt();

        int getFreqDelayLenMins();

        int getFreqPeriodLenMins();

        int getFreqPeriodStepGoal();

        int getIntenActiveMinGoal();

        int getIntenStepGoal();

        int getTenacDailyStepGoal();

        boolean hasFreqDailyGoalCnt();

        boolean hasFreqDelayLenMins();

        boolean hasFreqPeriodLenMins();

        boolean hasFreqPeriodStepGoal();

        boolean hasIntenActiveMinGoal();

        boolean hasIntenStepGoal();

        boolean hasTenacDailyStepGoal();
    }

    public interface UHCFitParametersSetRequestOrBuilder extends MessageOrBuilder {
        int getFreqDailyGoalCnt();

        int getFreqDelayLenMins();

        int getFreqPeriodLenMins();

        int getFreqPeriodStepGoal();

        int getIntenActiveMinGoal();

        int getIntenStepGoal();

        int getTenacDailyStepGoal();

        boolean hasFreqDailyGoalCnt();

        boolean hasFreqDelayLenMins();

        boolean hasFreqPeriodLenMins();

        boolean hasFreqPeriodStepGoal();

        boolean hasIntenActiveMinGoal();

        boolean hasIntenStepGoal();

        boolean hasTenacDailyStepGoal();
    }

    public interface UHCFitParametersSetResponseOrBuilder extends MessageOrBuilder {
        UHCFitParametersSetResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface UHCTimeVarsSetRequestOrBuilder extends MessageOrBuilder {
        int getRtcTimeSec();

        boolean getSetTime();

        int getTimeToMidnightSec();

        int getTimezoneOffset();

        boolean hasRtcTimeSec();

        boolean hasSetTime();

        boolean hasTimeToMidnightSec();

        boolean hasTimezoneOffset();
    }

    public interface UHCTimeVarsSetResponseOrBuilder extends MessageOrBuilder {
        int getRtcTimeSec();

        UHCTimeVarsSetResponse.ResponseStatus getStatus();

        int getTimeToMidnightSec();

        boolean hasRtcTimeSec();

        boolean hasStatus();

        boolean hasTimeToMidnightSec();
    }

    static {
        Descriptors.Descriptor descriptor2 = (Descriptors.Descriptor) f3.q(0);
        internal_static_GDI_Proto_HSAData_HSADataService_descriptor = descriptor2;
        internal_static_GDI_Proto_HSAData_HSADataService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"HsaFileXferRequest", "HsaFileXferNtfctn", "UhcAccelParamsSetRequest", "UhcAccelParamsSetResponse", "UhcAccelParamsGetRequest", "UhcAccelParamsGetResponse", "UhcActivationRequest", "UhcActivationResponse", "UhcFitParametersSetRequest", "UhcFitParametersSetResponse", "UhcFitParametersGetRequest", "UhcFitParametersGetResponse", "UhcTimeVarsSetRequest", "UhcTimeVarsSetResponse", "HsaFitLogConfigRequest", "HsaFitLogConfigResponse", "HsaFitLogCapabilitiesRequest", "HsaFitLogCapabilitiesResponse", "HsaFeaturesRequest", "HsaFeaturesResponse", "HsaFitFileCompressionRequest", "HsaFitFileCompressionResponse", "HsaGenericRequest", "HsaGenericResponse"});
        Descriptors.Descriptor descriptor3 = (Descriptors.Descriptor) f3.q(1);
        internal_static_GDI_Proto_HSAData_HSAFeaturesRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_HSAData_HSAFeaturesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = (Descriptors.Descriptor) f3.q(2);
        internal_static_GDI_Proto_HSAData_HSAFeaturesResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_HSAData_HSAFeaturesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Status", "FeaturesBf"});
        Descriptors.Descriptor descriptor5 = (Descriptors.Descriptor) f3.q(3);
        internal_static_GDI_Proto_HSAData_HSAFileXferRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_HSAData_HSAFileXferRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"RequestSync", "RequestType"});
        Descriptors.Descriptor descriptor6 = (Descriptors.Descriptor) f3.q(4);
        internal_static_GDI_Proto_HSAData_HSAFileXferNotification_descriptor = descriptor6;
        internal_static_GDI_Proto_HSAData_HSAFileXferNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"FileXferList", "TotalFileCount", "TotalFileSize"});
        Descriptors.Descriptor descriptor7 = (Descriptors.Descriptor) f3.q(5);
        internal_static_GDI_Proto_HSAData_HSADataTransferItem_descriptor = descriptor7;
        internal_static_GDI_Proto_HSAData_HSADataTransferItem_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Id", "Size"});
        Descriptors.Descriptor descriptor8 = (Descriptors.Descriptor) f3.q(6);
        internal_static_GDI_Proto_HSAData_UHCAccelParametersSetRequest_descriptor = descriptor8;
        internal_static_GDI_Proto_HSAData_UHCAccelParametersSetRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"SessionsPerDay", "PreCollectionIntervals", "NumCollectionIntervals", "MinStepsPerInterval", "MaxStepsPerInterval", "IntervalSampleSize"});
        Descriptors.Descriptor descriptor9 = (Descriptors.Descriptor) f3.q(7);
        internal_static_GDI_Proto_HSAData_UHCAccelParametersSetResponse_descriptor = descriptor9;
        internal_static_GDI_Proto_HSAData_UHCAccelParametersSetResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Status"});
        Descriptors.Descriptor descriptor10 = (Descriptors.Descriptor) f3.q(8);
        internal_static_GDI_Proto_HSAData_UHCAccelParametersGetRequest_descriptor = descriptor10;
        internal_static_GDI_Proto_HSAData_UHCAccelParametersGetRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"GetParameters"});
        Descriptors.Descriptor descriptor11 = (Descriptors.Descriptor) f3.q(9);
        internal_static_GDI_Proto_HSAData_UHCAccelParametersGetResponse_descriptor = descriptor11;
        internal_static_GDI_Proto_HSAData_UHCAccelParametersGetResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"SessionsPerDay", "PreCollectionIntervals", "NumCollectionIntervals", "MinStepsPerInterval", "MaxStepsPerInterval", "IntervalSampleSize"});
        Descriptors.Descriptor descriptor12 = (Descriptors.Descriptor) f3.q(10);
        internal_static_GDI_Proto_HSAData_UHCActivationRequest_descriptor = descriptor12;
        internal_static_GDI_Proto_HSAData_UHCActivationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"ActivateUhc", "ActivationKey"});
        Descriptors.Descriptor descriptor13 = (Descriptors.Descriptor) f3.q(11);
        internal_static_GDI_Proto_HSAData_UHCActivationResponse_descriptor = descriptor13;
        internal_static_GDI_Proto_HSAData_UHCActivationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Status", "UhcUUID"});
        Descriptors.Descriptor descriptor14 = (Descriptors.Descriptor) f3.q(12);
        internal_static_GDI_Proto_HSAData_UHCFitParametersSetRequest_descriptor = descriptor14;
        internal_static_GDI_Proto_HSAData_UHCFitParametersSetRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"FreqPeriodStepGoal", "FreqPeriodLenMins", "FreqDelayLenMins", "FreqDailyGoalCnt", "IntenStepGoal", "IntenActiveMinGoal", "TenacDailyStepGoal"});
        Descriptors.Descriptor descriptor15 = (Descriptors.Descriptor) f3.q(13);
        internal_static_GDI_Proto_HSAData_UHCFitParametersSetResponse_descriptor = descriptor15;
        internal_static_GDI_Proto_HSAData_UHCFitParametersSetResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Status"});
        Descriptors.Descriptor descriptor16 = (Descriptors.Descriptor) f3.q(14);
        internal_static_GDI_Proto_HSAData_UHCFitParametersGetRequest_descriptor = descriptor16;
        internal_static_GDI_Proto_HSAData_UHCFitParametersGetRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"GetParameters"});
        Descriptors.Descriptor descriptor17 = (Descriptors.Descriptor) f3.q(15);
        internal_static_GDI_Proto_HSAData_UHCFitParametersGetResponse_descriptor = descriptor17;
        internal_static_GDI_Proto_HSAData_UHCFitParametersGetResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"FreqPeriodStepGoal", "FreqPeriodLenMins", "FreqDelayLenMins", "FreqDailyGoalCnt", "IntenStepGoal", "IntenActiveMinGoal", "TenacDailyStepGoal"});
        Descriptors.Descriptor descriptor18 = (Descriptors.Descriptor) f3.q(16);
        internal_static_GDI_Proto_HSAData_UHCTimeVarsSetRequest_descriptor = descriptor18;
        internal_static_GDI_Proto_HSAData_UHCTimeVarsSetRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"SetTime", "RtcTimeSec", "TimeToMidnightSec", "TimezoneOffset"});
        Descriptors.Descriptor descriptor19 = (Descriptors.Descriptor) f3.q(17);
        internal_static_GDI_Proto_HSAData_UHCTimeVarsSetResponse_descriptor = descriptor19;
        internal_static_GDI_Proto_HSAData_UHCTimeVarsSetResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"Status", "RtcTimeSec", "TimeToMidnightSec"});
        Descriptors.Descriptor descriptor20 = (Descriptors.Descriptor) f3.q(18);
        internal_static_GDI_Proto_HSAData_HSAFitLogConfigRequest_descriptor = descriptor20;
        internal_static_GDI_Proto_HSAData_HSAFitLogConfigRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"Config"});
        Descriptors.Descriptor descriptor21 = (Descriptors.Descriptor) f3.q(19);
        internal_static_GDI_Proto_HSAData_HSAFitLogConfigResponse_descriptor = descriptor21;
        internal_static_GDI_Proto_HSAData_HSAFitLogConfigResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor21, new String[]{"Status", "Config"});
        Descriptors.Descriptor descriptor22 = (Descriptors.Descriptor) f3.q(20);
        internal_static_GDI_Proto_HSAData_HSAFitLogConfig_descriptor = descriptor22;
        internal_static_GDI_Proto_HSAData_HSAFitLogConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor22, new String[]{"State", "Source", "ProcessingInterval"});
        Descriptors.Descriptor descriptor23 = (Descriptors.Descriptor) f3.q(21);
        internal_static_GDI_Proto_HSAData_HSAGenericRequest_descriptor = descriptor23;
        internal_static_GDI_Proto_HSAData_HSAGenericRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor23, new String[]{"Id", "Data"});
        Descriptors.Descriptor descriptor24 = (Descriptors.Descriptor) f3.q(22);
        internal_static_GDI_Proto_HSAData_HSAGenericResponse_descriptor = descriptor24;
        internal_static_GDI_Proto_HSAData_HSAGenericResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor24, new String[]{"Id", "Status", "Data"});
        Descriptors.Descriptor descriptor25 = (Descriptors.Descriptor) f3.q(23);
        internal_static_GDI_Proto_HSAData_HSAFitLogCapabilitiesRequest_descriptor = descriptor25;
        internal_static_GDI_Proto_HSAData_HSAFitLogCapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor25, new String[0]);
        Descriptors.Descriptor descriptor26 = (Descriptors.Descriptor) f3.q(24);
        internal_static_GDI_Proto_HSAData_HSAFitLogCapabilitiesResponse_descriptor = descriptor26;
        internal_static_GDI_Proto_HSAData_HSAFitLogCapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor26, new String[]{"Status", "CapabilitiesBf"});
        Descriptors.Descriptor descriptor27 = (Descriptors.Descriptor) f3.q(25);
        internal_static_GDI_Proto_HSAData_HSAFitFileCompressionRequest_descriptor = descriptor27;
        internal_static_GDI_Proto_HSAData_HSAFitFileCompressionRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor27, new String[]{"FilesToCompressBf"});
        Descriptors.Descriptor descriptor28 = (Descriptors.Descriptor) f3.q(26);
        internal_static_GDI_Proto_HSAData_HSAFitFileCompressionResponse_descriptor = descriptor28;
        internal_static_GDI_Proto_HSAData_HSAFitFileCompressionResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor28, new String[]{"Status", "FilesCompressedBf"});
    }

    private GDIHSAData() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class HSADataTransferItem extends GeneratedMessageV3 implements HSADataTransferItemOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int SIZE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private int size_;
        private static final HSADataTransferItem DEFAULT_INSTANCE = new HSADataTransferItem();

        @Deprecated
        public static final Parser<HSADataTransferItem> PARSER = new AbstractParser<HSADataTransferItem>() { // from class: com.garmin.proto.generated.GDIHSAData.HSADataTransferItem.1
            @Override // com.google.protobuf.Parser
            public HSADataTransferItem parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HSADataTransferItem.newBuilder();
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

        private HSADataTransferItem(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.size_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HSADataTransferItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSADataTransferItem_descriptor;
        }

        public static Builder newBuilder(HSADataTransferItem hSADataTransferItem) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hSADataTransferItem);
        }

        public static HSADataTransferItem parseDelimitedFrom(InputStream inputStream) {
            return (HSADataTransferItem) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HSADataTransferItem parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HSADataTransferItem> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HSADataTransferItem)) {
                return super.equals(obj);
            }
            HSADataTransferItem hSADataTransferItem = (HSADataTransferItem) obj;
            if (hasId() != hSADataTransferItem.hasId()) {
                return false;
            }
            if ((!hasId() || getId() == hSADataTransferItem.getId()) && hasSize() == hSADataTransferItem.hasSize()) {
                return (!hasSize() || getSize() == hSADataTransferItem.getSize()) && getUnknownFields().equals(hSADataTransferItem.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataTransferItemOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HSADataTransferItem> getParserForType() {
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
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.size_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataTransferItemOrBuilder
        public int getSize() {
            return this.size_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataTransferItemOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataTransferItemOrBuilder
        public boolean hasSize() {
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
            if (hasSize()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSize();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSADataTransferItem_fieldAccessorTable.ensureFieldAccessorsInitialized(HSADataTransferItem.class, Builder.class);
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
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSize()) {
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
            return new HSADataTransferItem();
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
                codedOutputStream.writeUInt32(2, this.size_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HSADataTransferItemOrBuilder {
            private int bitField0_;
            private int id_;
            private int size_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(HSADataTransferItem hSADataTransferItem) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    hSADataTransferItem.id_ = this.id_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    hSADataTransferItem.size_ = this.size_;
                    i14 |= 2;
                }
                hSADataTransferItem.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSADataTransferItem_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSADataTransferItem build() {
                HSADataTransferItem hSADataTransferItemBuildPartial = buildPartial();
                if (hSADataTransferItemBuildPartial.isInitialized()) {
                    return hSADataTransferItemBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) hSADataTransferItemBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSADataTransferItem buildPartial() {
                HSADataTransferItem hSADataTransferItem = new HSADataTransferItem(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(hSADataTransferItem);
                }
                onBuilt();
                return hSADataTransferItem;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                this.size_ = 0;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSize() {
                this.bitField0_ &= -3;
                this.size_ = 0;
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
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSADataTransferItem_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataTransferItemOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataTransferItemOrBuilder
            public int getSize() {
                return this.size_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataTransferItemOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataTransferItemOrBuilder
            public boolean hasSize() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSADataTransferItem_fieldAccessorTable.ensureFieldAccessorsInitialized(HSADataTransferItem.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasSize();
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
                                } else if (tag == 16) {
                                    this.size_ = codedInputStream.readUInt32();
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

            public Builder setId(int i14) {
                this.id_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSize(int i14) {
                this.size_ = i14;
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
            public HSADataTransferItem getDefaultInstanceForType() {
                return HSADataTransferItem.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof HSADataTransferItem) {
                    return mergeFrom((HSADataTransferItem) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HSADataTransferItem hSADataTransferItem) {
                if (hSADataTransferItem == HSADataTransferItem.getDefaultInstance()) {
                    return this;
                }
                if (hSADataTransferItem.hasId()) {
                    setId(hSADataTransferItem.getId());
                }
                if (hSADataTransferItem.hasSize()) {
                    setSize(hSADataTransferItem.getSize());
                }
                mergeUnknownFields(hSADataTransferItem.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HSADataTransferItem getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static HSADataTransferItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSADataTransferItem) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSADataTransferItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static HSADataTransferItem parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HSADataTransferItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ HSADataTransferItem(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static HSADataTransferItem parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private HSADataTransferItem() {
            this.id_ = 0;
            this.size_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HSADataTransferItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static HSADataTransferItem parseFrom(InputStream inputStream) {
            return (HSADataTransferItem) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static HSADataTransferItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSADataTransferItem) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSADataTransferItem parseFrom(CodedInputStream codedInputStream) {
            return (HSADataTransferItem) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HSADataTransferItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSADataTransferItem) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class HSAFeaturesRequest extends GeneratedMessageV3 implements HSAFeaturesRequestOrBuilder {
        private static final HSAFeaturesRequest DEFAULT_INSTANCE = new HSAFeaturesRequest();

        @Deprecated
        public static final Parser<HSAFeaturesRequest> PARSER = new AbstractParser<HSAFeaturesRequest>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAFeaturesRequest.1
            @Override // com.google.protobuf.Parser
            public HSAFeaturesRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HSAFeaturesRequest.newBuilder();
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

        private HSAFeaturesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HSAFeaturesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFeaturesRequest_descriptor;
        }

        public static Builder newBuilder(HSAFeaturesRequest hSAFeaturesRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hSAFeaturesRequest);
        }

        public static HSAFeaturesRequest parseDelimitedFrom(InputStream inputStream) {
            return (HSAFeaturesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HSAFeaturesRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HSAFeaturesRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof HSAFeaturesRequest) {
                return getUnknownFields().equals(((HSAFeaturesRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HSAFeaturesRequest> getParserForType() {
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
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFeaturesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAFeaturesRequest.class, Builder.class);
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
            return new HSAFeaturesRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HSAFeaturesRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFeaturesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAFeaturesRequest build() {
                HSAFeaturesRequest hSAFeaturesRequestBuildPartial = buildPartial();
                if (hSAFeaturesRequestBuildPartial.isInitialized()) {
                    return hSAFeaturesRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) hSAFeaturesRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAFeaturesRequest buildPartial() {
                HSAFeaturesRequest hSAFeaturesRequest = new HSAFeaturesRequest(this);
                onBuilt();
                return hSAFeaturesRequest;
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
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFeaturesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFeaturesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAFeaturesRequest.class, Builder.class);
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
            public HSAFeaturesRequest getDefaultInstanceForType() {
                return HSAFeaturesRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof HSAFeaturesRequest) {
                    return mergeFrom((HSAFeaturesRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HSAFeaturesRequest hSAFeaturesRequest) {
                if (hSAFeaturesRequest == HSAFeaturesRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(hSAFeaturesRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HSAFeaturesRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ HSAFeaturesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private HSAFeaturesRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HSAFeaturesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFeaturesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAFeaturesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static HSAFeaturesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HSAFeaturesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static HSAFeaturesRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static HSAFeaturesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static HSAFeaturesRequest parseFrom(InputStream inputStream) {
            return (HSAFeaturesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static HSAFeaturesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFeaturesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAFeaturesRequest parseFrom(CodedInputStream codedInputStream) {
            return (HSAFeaturesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HSAFeaturesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFeaturesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class HSAFitFileCompressionRequest extends GeneratedMessageV3 implements HSAFitFileCompressionRequestOrBuilder {
        public static final int FILES_TO_COMPRESS_BF_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int filesToCompressBf_;
        private byte memoizedIsInitialized;
        private static final HSAFitFileCompressionRequest DEFAULT_INSTANCE = new HSAFitFileCompressionRequest();

        @Deprecated
        public static final Parser<HSAFitFileCompressionRequest> PARSER = new AbstractParser<HSAFitFileCompressionRequest>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAFitFileCompressionRequest.1
            @Override // com.google.protobuf.Parser
            public HSAFitFileCompressionRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HSAFitFileCompressionRequest.newBuilder();
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

        private HSAFitFileCompressionRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.filesToCompressBf_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HSAFitFileCompressionRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitFileCompressionRequest_descriptor;
        }

        public static Builder newBuilder(HSAFitFileCompressionRequest hSAFitFileCompressionRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hSAFitFileCompressionRequest);
        }

        public static HSAFitFileCompressionRequest parseDelimitedFrom(InputStream inputStream) {
            return (HSAFitFileCompressionRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HSAFitFileCompressionRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HSAFitFileCompressionRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HSAFitFileCompressionRequest)) {
                return super.equals(obj);
            }
            HSAFitFileCompressionRequest hSAFitFileCompressionRequest = (HSAFitFileCompressionRequest) obj;
            if (hasFilesToCompressBf() != hSAFitFileCompressionRequest.hasFilesToCompressBf()) {
                return false;
            }
            return (!hasFilesToCompressBf() || getFilesToCompressBf() == hSAFitFileCompressionRequest.getFilesToCompressBf()) && getUnknownFields().equals(hSAFitFileCompressionRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitFileCompressionRequestOrBuilder
        public int getFilesToCompressBf() {
            return this.filesToCompressBf_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HSAFitFileCompressionRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.filesToCompressBf_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitFileCompressionRequestOrBuilder
        public boolean hasFilesToCompressBf() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasFilesToCompressBf()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getFilesToCompressBf();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitFileCompressionRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAFitFileCompressionRequest.class, Builder.class);
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
            return new HSAFitFileCompressionRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.filesToCompressBf_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HSAFitFileCompressionRequestOrBuilder {
            private int bitField0_;
            private int filesToCompressBf_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(HSAFitFileCompressionRequest hSAFitFileCompressionRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    hSAFitFileCompressionRequest.filesToCompressBf_ = this.filesToCompressBf_;
                } else {
                    i14 = 0;
                }
                hSAFitFileCompressionRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitFileCompressionRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAFitFileCompressionRequest build() {
                HSAFitFileCompressionRequest hSAFitFileCompressionRequestBuildPartial = buildPartial();
                if (hSAFitFileCompressionRequestBuildPartial.isInitialized()) {
                    return hSAFitFileCompressionRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) hSAFitFileCompressionRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAFitFileCompressionRequest buildPartial() {
                HSAFitFileCompressionRequest hSAFitFileCompressionRequest = new HSAFitFileCompressionRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(hSAFitFileCompressionRequest);
                }
                onBuilt();
                return hSAFitFileCompressionRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.filesToCompressBf_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFilesToCompressBf() {
                this.bitField0_ &= -2;
                this.filesToCompressBf_ = 0;
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
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitFileCompressionRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitFileCompressionRequestOrBuilder
            public int getFilesToCompressBf() {
                return this.filesToCompressBf_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitFileCompressionRequestOrBuilder
            public boolean hasFilesToCompressBf() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitFileCompressionRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAFitFileCompressionRequest.class, Builder.class);
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
                                    this.filesToCompressBf_ = codedInputStream.readUInt32();
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

            public Builder setFilesToCompressBf(int i14) {
                this.filesToCompressBf_ = i14;
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
            public HSAFitFileCompressionRequest getDefaultInstanceForType() {
                return HSAFitFileCompressionRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof HSAFitFileCompressionRequest) {
                    return mergeFrom((HSAFitFileCompressionRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HSAFitFileCompressionRequest hSAFitFileCompressionRequest) {
                if (hSAFitFileCompressionRequest == HSAFitFileCompressionRequest.getDefaultInstance()) {
                    return this;
                }
                if (hSAFitFileCompressionRequest.hasFilesToCompressBf()) {
                    setFilesToCompressBf(hSAFitFileCompressionRequest.getFilesToCompressBf());
                }
                mergeUnknownFields(hSAFitFileCompressionRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HSAFitFileCompressionRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static HSAFitFileCompressionRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFitFileCompressionRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAFitFileCompressionRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ HSAFitFileCompressionRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static HSAFitFileCompressionRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private HSAFitFileCompressionRequest() {
            this.filesToCompressBf_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HSAFitFileCompressionRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static HSAFitFileCompressionRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static HSAFitFileCompressionRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static HSAFitFileCompressionRequest parseFrom(InputStream inputStream) {
            return (HSAFitFileCompressionRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static HSAFitFileCompressionRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFitFileCompressionRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAFitFileCompressionRequest parseFrom(CodedInputStream codedInputStream) {
            return (HSAFitFileCompressionRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HSAFitFileCompressionRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFitFileCompressionRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class HSAFitLogCapabilitiesRequest extends GeneratedMessageV3 implements HSAFitLogCapabilitiesRequestOrBuilder {
        private static final HSAFitLogCapabilitiesRequest DEFAULT_INSTANCE = new HSAFitLogCapabilitiesRequest();

        @Deprecated
        public static final Parser<HSAFitLogCapabilitiesRequest> PARSER = new AbstractParser<HSAFitLogCapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAFitLogCapabilitiesRequest.1
            @Override // com.google.protobuf.Parser
            public HSAFitLogCapabilitiesRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HSAFitLogCapabilitiesRequest.newBuilder();
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

        private HSAFitLogCapabilitiesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HSAFitLogCapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogCapabilitiesRequest_descriptor;
        }

        public static Builder newBuilder(HSAFitLogCapabilitiesRequest hSAFitLogCapabilitiesRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hSAFitLogCapabilitiesRequest);
        }

        public static HSAFitLogCapabilitiesRequest parseDelimitedFrom(InputStream inputStream) {
            return (HSAFitLogCapabilitiesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HSAFitLogCapabilitiesRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HSAFitLogCapabilitiesRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof HSAFitLogCapabilitiesRequest) {
                return getUnknownFields().equals(((HSAFitLogCapabilitiesRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HSAFitLogCapabilitiesRequest> getParserForType() {
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
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogCapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAFitLogCapabilitiesRequest.class, Builder.class);
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
            return new HSAFitLogCapabilitiesRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HSAFitLogCapabilitiesRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogCapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAFitLogCapabilitiesRequest build() {
                HSAFitLogCapabilitiesRequest hSAFitLogCapabilitiesRequestBuildPartial = buildPartial();
                if (hSAFitLogCapabilitiesRequestBuildPartial.isInitialized()) {
                    return hSAFitLogCapabilitiesRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) hSAFitLogCapabilitiesRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAFitLogCapabilitiesRequest buildPartial() {
                HSAFitLogCapabilitiesRequest hSAFitLogCapabilitiesRequest = new HSAFitLogCapabilitiesRequest(this);
                onBuilt();
                return hSAFitLogCapabilitiesRequest;
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
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogCapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogCapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAFitLogCapabilitiesRequest.class, Builder.class);
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
            public HSAFitLogCapabilitiesRequest getDefaultInstanceForType() {
                return HSAFitLogCapabilitiesRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof HSAFitLogCapabilitiesRequest) {
                    return mergeFrom((HSAFitLogCapabilitiesRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HSAFitLogCapabilitiesRequest hSAFitLogCapabilitiesRequest) {
                if (hSAFitLogCapabilitiesRequest == HSAFitLogCapabilitiesRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(hSAFitLogCapabilitiesRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HSAFitLogCapabilitiesRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ HSAFitLogCapabilitiesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private HSAFitLogCapabilitiesRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HSAFitLogCapabilitiesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFitLogCapabilitiesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAFitLogCapabilitiesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static HSAFitLogCapabilitiesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HSAFitLogCapabilitiesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static HSAFitLogCapabilitiesRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static HSAFitLogCapabilitiesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static HSAFitLogCapabilitiesRequest parseFrom(InputStream inputStream) {
            return (HSAFitLogCapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static HSAFitLogCapabilitiesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFitLogCapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAFitLogCapabilitiesRequest parseFrom(CodedInputStream codedInputStream) {
            return (HSAFitLogCapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HSAFitLogCapabilitiesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFitLogCapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class UHCAccelParametersGetRequest extends GeneratedMessageV3 implements UHCAccelParametersGetRequestOrBuilder {
        public static final int GET_PARAMETERS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean getParameters_;
        private byte memoizedIsInitialized;
        private static final UHCAccelParametersGetRequest DEFAULT_INSTANCE = new UHCAccelParametersGetRequest();

        @Deprecated
        public static final Parser<UHCAccelParametersGetRequest> PARSER = new AbstractParser<UHCAccelParametersGetRequest>() { // from class: com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetRequest.1
            @Override // com.google.protobuf.Parser
            public UHCAccelParametersGetRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UHCAccelParametersGetRequest.newBuilder();
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

        private UHCAccelParametersGetRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.getParameters_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UHCAccelParametersGetRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCAccelParametersGetRequest_descriptor;
        }

        public static Builder newBuilder(UHCAccelParametersGetRequest uHCAccelParametersGetRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(uHCAccelParametersGetRequest);
        }

        public static UHCAccelParametersGetRequest parseDelimitedFrom(InputStream inputStream) {
            return (UHCAccelParametersGetRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UHCAccelParametersGetRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UHCAccelParametersGetRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UHCAccelParametersGetRequest)) {
                return super.equals(obj);
            }
            UHCAccelParametersGetRequest uHCAccelParametersGetRequest = (UHCAccelParametersGetRequest) obj;
            if (hasGetParameters() != uHCAccelParametersGetRequest.hasGetParameters()) {
                return false;
            }
            return (!hasGetParameters() || getGetParameters() == uHCAccelParametersGetRequest.getGetParameters()) && getUnknownFields().equals(uHCAccelParametersGetRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetRequestOrBuilder
        public boolean getGetParameters() {
            return this.getParameters_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UHCAccelParametersGetRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.getParameters_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetRequestOrBuilder
        public boolean hasGetParameters() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGetParameters()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getGetParameters());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCAccelParametersGetRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCAccelParametersGetRequest.class, Builder.class);
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
            if (hasGetParameters()) {
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
            return new UHCAccelParametersGetRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.getParameters_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UHCAccelParametersGetRequestOrBuilder {
            private int bitField0_;
            private boolean getParameters_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(UHCAccelParametersGetRequest uHCAccelParametersGetRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    uHCAccelParametersGetRequest.getParameters_ = this.getParameters_;
                } else {
                    i14 = 0;
                }
                uHCAccelParametersGetRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCAccelParametersGetRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCAccelParametersGetRequest build() {
                UHCAccelParametersGetRequest uHCAccelParametersGetRequestBuildPartial = buildPartial();
                if (uHCAccelParametersGetRequestBuildPartial.isInitialized()) {
                    return uHCAccelParametersGetRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) uHCAccelParametersGetRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCAccelParametersGetRequest buildPartial() {
                UHCAccelParametersGetRequest uHCAccelParametersGetRequest = new UHCAccelParametersGetRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(uHCAccelParametersGetRequest);
                }
                onBuilt();
                return uHCAccelParametersGetRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.getParameters_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGetParameters() {
                this.bitField0_ &= -2;
                this.getParameters_ = false;
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
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCAccelParametersGetRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetRequestOrBuilder
            public boolean getGetParameters() {
                return this.getParameters_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetRequestOrBuilder
            public boolean hasGetParameters() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCAccelParametersGetRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCAccelParametersGetRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasGetParameters();
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
                                    this.getParameters_ = codedInputStream.readBool();
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

            public Builder setGetParameters(boolean z14) {
                this.getParameters_ = z14;
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
            public UHCAccelParametersGetRequest getDefaultInstanceForType() {
                return UHCAccelParametersGetRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UHCAccelParametersGetRequest) {
                    return mergeFrom((UHCAccelParametersGetRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UHCAccelParametersGetRequest uHCAccelParametersGetRequest) {
                if (uHCAccelParametersGetRequest == UHCAccelParametersGetRequest.getDefaultInstance()) {
                    return this;
                }
                if (uHCAccelParametersGetRequest.hasGetParameters()) {
                    setGetParameters(uHCAccelParametersGetRequest.getGetParameters());
                }
                mergeUnknownFields(uHCAccelParametersGetRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UHCAccelParametersGetRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UHCAccelParametersGetRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCAccelParametersGetRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCAccelParametersGetRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ UHCAccelParametersGetRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UHCAccelParametersGetRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private UHCAccelParametersGetRequest() {
            this.getParameters_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UHCAccelParametersGetRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UHCAccelParametersGetRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UHCAccelParametersGetRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UHCAccelParametersGetRequest parseFrom(InputStream inputStream) {
            return (UHCAccelParametersGetRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UHCAccelParametersGetRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCAccelParametersGetRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCAccelParametersGetRequest parseFrom(CodedInputStream codedInputStream) {
            return (UHCAccelParametersGetRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UHCAccelParametersGetRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCAccelParametersGetRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class UHCAccelParametersGetResponse extends GeneratedMessageV3 implements UHCAccelParametersGetResponseOrBuilder {
        public static final int INTERVAL_SAMPLE_SIZE_FIELD_NUMBER = 6;
        public static final int MAX_STEPS_PER_INTERVAL_FIELD_NUMBER = 5;
        public static final int MIN_STEPS_PER_INTERVAL_FIELD_NUMBER = 4;
        public static final int NUM_COLLECTION_INTERVALS_FIELD_NUMBER = 3;
        public static final int PRE_COLLECTION_INTERVALS_FIELD_NUMBER = 2;
        public static final int SESSIONS_PER_DAY_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int intervalSampleSize_;
        private int maxStepsPerInterval_;
        private byte memoizedIsInitialized;
        private int minStepsPerInterval_;
        private int numCollectionIntervals_;
        private int preCollectionIntervals_;
        private int sessionsPerDay_;
        private static final UHCAccelParametersGetResponse DEFAULT_INSTANCE = new UHCAccelParametersGetResponse();

        @Deprecated
        public static final Parser<UHCAccelParametersGetResponse> PARSER = new AbstractParser<UHCAccelParametersGetResponse>() { // from class: com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponse.1
            @Override // com.google.protobuf.Parser
            public UHCAccelParametersGetResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UHCAccelParametersGetResponse.newBuilder();
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

        private UHCAccelParametersGetResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sessionsPerDay_ = 0;
            this.preCollectionIntervals_ = 0;
            this.numCollectionIntervals_ = 0;
            this.minStepsPerInterval_ = 0;
            this.maxStepsPerInterval_ = 0;
            this.intervalSampleSize_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UHCAccelParametersGetResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCAccelParametersGetResponse_descriptor;
        }

        public static Builder newBuilder(UHCAccelParametersGetResponse uHCAccelParametersGetResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(uHCAccelParametersGetResponse);
        }

        public static UHCAccelParametersGetResponse parseDelimitedFrom(InputStream inputStream) {
            return (UHCAccelParametersGetResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UHCAccelParametersGetResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UHCAccelParametersGetResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UHCAccelParametersGetResponse)) {
                return super.equals(obj);
            }
            UHCAccelParametersGetResponse uHCAccelParametersGetResponse = (UHCAccelParametersGetResponse) obj;
            if (hasSessionsPerDay() != uHCAccelParametersGetResponse.hasSessionsPerDay()) {
                return false;
            }
            if ((hasSessionsPerDay() && getSessionsPerDay() != uHCAccelParametersGetResponse.getSessionsPerDay()) || hasPreCollectionIntervals() != uHCAccelParametersGetResponse.hasPreCollectionIntervals()) {
                return false;
            }
            if ((hasPreCollectionIntervals() && getPreCollectionIntervals() != uHCAccelParametersGetResponse.getPreCollectionIntervals()) || hasNumCollectionIntervals() != uHCAccelParametersGetResponse.hasNumCollectionIntervals()) {
                return false;
            }
            if ((hasNumCollectionIntervals() && getNumCollectionIntervals() != uHCAccelParametersGetResponse.getNumCollectionIntervals()) || hasMinStepsPerInterval() != uHCAccelParametersGetResponse.hasMinStepsPerInterval()) {
                return false;
            }
            if ((hasMinStepsPerInterval() && getMinStepsPerInterval() != uHCAccelParametersGetResponse.getMinStepsPerInterval()) || hasMaxStepsPerInterval() != uHCAccelParametersGetResponse.hasMaxStepsPerInterval()) {
                return false;
            }
            if ((!hasMaxStepsPerInterval() || getMaxStepsPerInterval() == uHCAccelParametersGetResponse.getMaxStepsPerInterval()) && hasIntervalSampleSize() == uHCAccelParametersGetResponse.hasIntervalSampleSize()) {
                return (!hasIntervalSampleSize() || getIntervalSampleSize() == uHCAccelParametersGetResponse.getIntervalSampleSize()) && getUnknownFields().equals(uHCAccelParametersGetResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
        public int getIntervalSampleSize() {
            return this.intervalSampleSize_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
        public int getMaxStepsPerInterval() {
            return this.maxStepsPerInterval_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
        public int getMinStepsPerInterval() {
            return this.minStepsPerInterval_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
        public int getNumCollectionIntervals() {
            return this.numCollectionIntervals_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UHCAccelParametersGetResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
        public int getPreCollectionIntervals() {
            return this.preCollectionIntervals_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.sessionsPerDay_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.preCollectionIntervals_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.numCollectionIntervals_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.minStepsPerInterval_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.maxStepsPerInterval_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(6, this.intervalSampleSize_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
        public int getSessionsPerDay() {
            return this.sessionsPerDay_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
        public boolean hasIntervalSampleSize() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
        public boolean hasMaxStepsPerInterval() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
        public boolean hasMinStepsPerInterval() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
        public boolean hasNumCollectionIntervals() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
        public boolean hasPreCollectionIntervals() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
        public boolean hasSessionsPerDay() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSessionsPerDay()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSessionsPerDay();
            }
            if (hasPreCollectionIntervals()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getPreCollectionIntervals();
            }
            if (hasNumCollectionIntervals()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getNumCollectionIntervals();
            }
            if (hasMinStepsPerInterval()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getMinStepsPerInterval();
            }
            if (hasMaxStepsPerInterval()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getMaxStepsPerInterval();
            }
            if (hasIntervalSampleSize()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getIntervalSampleSize();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCAccelParametersGetResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCAccelParametersGetResponse.class, Builder.class);
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
            if (!hasSessionsPerDay()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasPreCollectionIntervals()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasNumCollectionIntervals()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasMinStepsPerInterval()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasMaxStepsPerInterval()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasIntervalSampleSize()) {
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
            return new UHCAccelParametersGetResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.sessionsPerDay_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.preCollectionIntervals_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.numCollectionIntervals_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.minStepsPerInterval_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.maxStepsPerInterval_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.intervalSampleSize_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UHCAccelParametersGetResponseOrBuilder {
            private int bitField0_;
            private int intervalSampleSize_;
            private int maxStepsPerInterval_;
            private int minStepsPerInterval_;
            private int numCollectionIntervals_;
            private int preCollectionIntervals_;
            private int sessionsPerDay_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(UHCAccelParametersGetResponse uHCAccelParametersGetResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    uHCAccelParametersGetResponse.sessionsPerDay_ = this.sessionsPerDay_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    uHCAccelParametersGetResponse.preCollectionIntervals_ = this.preCollectionIntervals_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    uHCAccelParametersGetResponse.numCollectionIntervals_ = this.numCollectionIntervals_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    uHCAccelParametersGetResponse.minStepsPerInterval_ = this.minStepsPerInterval_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    uHCAccelParametersGetResponse.maxStepsPerInterval_ = this.maxStepsPerInterval_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    uHCAccelParametersGetResponse.intervalSampleSize_ = this.intervalSampleSize_;
                    i14 |= 32;
                }
                uHCAccelParametersGetResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCAccelParametersGetResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCAccelParametersGetResponse build() {
                UHCAccelParametersGetResponse uHCAccelParametersGetResponseBuildPartial = buildPartial();
                if (uHCAccelParametersGetResponseBuildPartial.isInitialized()) {
                    return uHCAccelParametersGetResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) uHCAccelParametersGetResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCAccelParametersGetResponse buildPartial() {
                UHCAccelParametersGetResponse uHCAccelParametersGetResponse = new UHCAccelParametersGetResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(uHCAccelParametersGetResponse);
                }
                onBuilt();
                return uHCAccelParametersGetResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sessionsPerDay_ = 0;
                this.preCollectionIntervals_ = 0;
                this.numCollectionIntervals_ = 0;
                this.minStepsPerInterval_ = 0;
                this.maxStepsPerInterval_ = 0;
                this.intervalSampleSize_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIntervalSampleSize() {
                this.bitField0_ &= -33;
                this.intervalSampleSize_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxStepsPerInterval() {
                this.bitField0_ &= -17;
                this.maxStepsPerInterval_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMinStepsPerInterval() {
                this.bitField0_ &= -9;
                this.minStepsPerInterval_ = 0;
                onChanged();
                return this;
            }

            public Builder clearNumCollectionIntervals() {
                this.bitField0_ &= -5;
                this.numCollectionIntervals_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPreCollectionIntervals() {
                this.bitField0_ &= -3;
                this.preCollectionIntervals_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSessionsPerDay() {
                this.bitField0_ &= -2;
                this.sessionsPerDay_ = 0;
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
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCAccelParametersGetResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
            public int getIntervalSampleSize() {
                return this.intervalSampleSize_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
            public int getMaxStepsPerInterval() {
                return this.maxStepsPerInterval_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
            public int getMinStepsPerInterval() {
                return this.minStepsPerInterval_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
            public int getNumCollectionIntervals() {
                return this.numCollectionIntervals_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
            public int getPreCollectionIntervals() {
                return this.preCollectionIntervals_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
            public int getSessionsPerDay() {
                return this.sessionsPerDay_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
            public boolean hasIntervalSampleSize() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
            public boolean hasMaxStepsPerInterval() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
            public boolean hasMinStepsPerInterval() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
            public boolean hasNumCollectionIntervals() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
            public boolean hasPreCollectionIntervals() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersGetResponseOrBuilder
            public boolean hasSessionsPerDay() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCAccelParametersGetResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCAccelParametersGetResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSessionsPerDay() && hasPreCollectionIntervals() && hasNumCollectionIntervals() && hasMinStepsPerInterval() && hasMaxStepsPerInterval() && hasIntervalSampleSize();
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
                                    this.sessionsPerDay_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.preCollectionIntervals_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.numCollectionIntervals_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.minStepsPerInterval_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.maxStepsPerInterval_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    this.intervalSampleSize_ = codedInputStream.readUInt32();
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

            public Builder setIntervalSampleSize(int i14) {
                this.intervalSampleSize_ = i14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setMaxStepsPerInterval(int i14) {
                this.maxStepsPerInterval_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setMinStepsPerInterval(int i14) {
                this.minStepsPerInterval_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setNumCollectionIntervals(int i14) {
                this.numCollectionIntervals_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPreCollectionIntervals(int i14) {
                this.preCollectionIntervals_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionsPerDay(int i14) {
                this.sessionsPerDay_ = i14;
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
            public UHCAccelParametersGetResponse getDefaultInstanceForType() {
                return UHCAccelParametersGetResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UHCAccelParametersGetResponse) {
                    return mergeFrom((UHCAccelParametersGetResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UHCAccelParametersGetResponse uHCAccelParametersGetResponse) {
                if (uHCAccelParametersGetResponse == UHCAccelParametersGetResponse.getDefaultInstance()) {
                    return this;
                }
                if (uHCAccelParametersGetResponse.hasSessionsPerDay()) {
                    setSessionsPerDay(uHCAccelParametersGetResponse.getSessionsPerDay());
                }
                if (uHCAccelParametersGetResponse.hasPreCollectionIntervals()) {
                    setPreCollectionIntervals(uHCAccelParametersGetResponse.getPreCollectionIntervals());
                }
                if (uHCAccelParametersGetResponse.hasNumCollectionIntervals()) {
                    setNumCollectionIntervals(uHCAccelParametersGetResponse.getNumCollectionIntervals());
                }
                if (uHCAccelParametersGetResponse.hasMinStepsPerInterval()) {
                    setMinStepsPerInterval(uHCAccelParametersGetResponse.getMinStepsPerInterval());
                }
                if (uHCAccelParametersGetResponse.hasMaxStepsPerInterval()) {
                    setMaxStepsPerInterval(uHCAccelParametersGetResponse.getMaxStepsPerInterval());
                }
                if (uHCAccelParametersGetResponse.hasIntervalSampleSize()) {
                    setIntervalSampleSize(uHCAccelParametersGetResponse.getIntervalSampleSize());
                }
                mergeUnknownFields(uHCAccelParametersGetResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UHCAccelParametersGetResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UHCAccelParametersGetResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCAccelParametersGetResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCAccelParametersGetResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UHCAccelParametersGetResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UHCAccelParametersGetResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UHCAccelParametersGetResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UHCAccelParametersGetResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UHCAccelParametersGetResponse parseFrom(InputStream inputStream) {
            return (UHCAccelParametersGetResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UHCAccelParametersGetResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCAccelParametersGetResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCAccelParametersGetResponse parseFrom(CodedInputStream codedInputStream) {
            return (UHCAccelParametersGetResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ UHCAccelParametersGetResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UHCAccelParametersGetResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCAccelParametersGetResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private UHCAccelParametersGetResponse() {
            this.sessionsPerDay_ = 0;
            this.preCollectionIntervals_ = 0;
            this.numCollectionIntervals_ = 0;
            this.minStepsPerInterval_ = 0;
            this.maxStepsPerInterval_ = 0;
            this.intervalSampleSize_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    public static final class UHCAccelParametersSetRequest extends GeneratedMessageV3 implements UHCAccelParametersSetRequestOrBuilder {
        public static final int INTERVAL_SAMPLE_SIZE_FIELD_NUMBER = 6;
        public static final int MAX_STEPS_PER_INTERVAL_FIELD_NUMBER = 5;
        public static final int MIN_STEPS_PER_INTERVAL_FIELD_NUMBER = 4;
        public static final int NUM_COLLECTION_INTERVALS_FIELD_NUMBER = 3;
        public static final int PRE_COLLECTION_INTERVALS_FIELD_NUMBER = 2;
        public static final int SESSIONS_PER_DAY_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int intervalSampleSize_;
        private int maxStepsPerInterval_;
        private byte memoizedIsInitialized;
        private int minStepsPerInterval_;
        private int numCollectionIntervals_;
        private int preCollectionIntervals_;
        private int sessionsPerDay_;
        private static final UHCAccelParametersSetRequest DEFAULT_INSTANCE = new UHCAccelParametersSetRequest();

        @Deprecated
        public static final Parser<UHCAccelParametersSetRequest> PARSER = new AbstractParser<UHCAccelParametersSetRequest>() { // from class: com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequest.1
            @Override // com.google.protobuf.Parser
            public UHCAccelParametersSetRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UHCAccelParametersSetRequest.newBuilder();
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

        private UHCAccelParametersSetRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sessionsPerDay_ = 0;
            this.preCollectionIntervals_ = 0;
            this.numCollectionIntervals_ = 0;
            this.minStepsPerInterval_ = 0;
            this.maxStepsPerInterval_ = 0;
            this.intervalSampleSize_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UHCAccelParametersSetRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCAccelParametersSetRequest_descriptor;
        }

        public static Builder newBuilder(UHCAccelParametersSetRequest uHCAccelParametersSetRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(uHCAccelParametersSetRequest);
        }

        public static UHCAccelParametersSetRequest parseDelimitedFrom(InputStream inputStream) {
            return (UHCAccelParametersSetRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UHCAccelParametersSetRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UHCAccelParametersSetRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UHCAccelParametersSetRequest)) {
                return super.equals(obj);
            }
            UHCAccelParametersSetRequest uHCAccelParametersSetRequest = (UHCAccelParametersSetRequest) obj;
            if (hasSessionsPerDay() != uHCAccelParametersSetRequest.hasSessionsPerDay()) {
                return false;
            }
            if ((hasSessionsPerDay() && getSessionsPerDay() != uHCAccelParametersSetRequest.getSessionsPerDay()) || hasPreCollectionIntervals() != uHCAccelParametersSetRequest.hasPreCollectionIntervals()) {
                return false;
            }
            if ((hasPreCollectionIntervals() && getPreCollectionIntervals() != uHCAccelParametersSetRequest.getPreCollectionIntervals()) || hasNumCollectionIntervals() != uHCAccelParametersSetRequest.hasNumCollectionIntervals()) {
                return false;
            }
            if ((hasNumCollectionIntervals() && getNumCollectionIntervals() != uHCAccelParametersSetRequest.getNumCollectionIntervals()) || hasMinStepsPerInterval() != uHCAccelParametersSetRequest.hasMinStepsPerInterval()) {
                return false;
            }
            if ((hasMinStepsPerInterval() && getMinStepsPerInterval() != uHCAccelParametersSetRequest.getMinStepsPerInterval()) || hasMaxStepsPerInterval() != uHCAccelParametersSetRequest.hasMaxStepsPerInterval()) {
                return false;
            }
            if ((!hasMaxStepsPerInterval() || getMaxStepsPerInterval() == uHCAccelParametersSetRequest.getMaxStepsPerInterval()) && hasIntervalSampleSize() == uHCAccelParametersSetRequest.hasIntervalSampleSize()) {
                return (!hasIntervalSampleSize() || getIntervalSampleSize() == uHCAccelParametersSetRequest.getIntervalSampleSize()) && getUnknownFields().equals(uHCAccelParametersSetRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
        public int getIntervalSampleSize() {
            return this.intervalSampleSize_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
        public int getMaxStepsPerInterval() {
            return this.maxStepsPerInterval_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
        public int getMinStepsPerInterval() {
            return this.minStepsPerInterval_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
        public int getNumCollectionIntervals() {
            return this.numCollectionIntervals_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UHCAccelParametersSetRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
        public int getPreCollectionIntervals() {
            return this.preCollectionIntervals_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.sessionsPerDay_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.preCollectionIntervals_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.numCollectionIntervals_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.minStepsPerInterval_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.maxStepsPerInterval_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(6, this.intervalSampleSize_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
        public int getSessionsPerDay() {
            return this.sessionsPerDay_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
        public boolean hasIntervalSampleSize() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
        public boolean hasMaxStepsPerInterval() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
        public boolean hasMinStepsPerInterval() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
        public boolean hasNumCollectionIntervals() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
        public boolean hasPreCollectionIntervals() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
        public boolean hasSessionsPerDay() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSessionsPerDay()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSessionsPerDay();
            }
            if (hasPreCollectionIntervals()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getPreCollectionIntervals();
            }
            if (hasNumCollectionIntervals()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getNumCollectionIntervals();
            }
            if (hasMinStepsPerInterval()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getMinStepsPerInterval();
            }
            if (hasMaxStepsPerInterval()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getMaxStepsPerInterval();
            }
            if (hasIntervalSampleSize()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getIntervalSampleSize();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCAccelParametersSetRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCAccelParametersSetRequest.class, Builder.class);
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
            if (!hasSessionsPerDay()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasPreCollectionIntervals()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasNumCollectionIntervals()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasMinStepsPerInterval()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasMaxStepsPerInterval()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasIntervalSampleSize()) {
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
            return new UHCAccelParametersSetRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.sessionsPerDay_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.preCollectionIntervals_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.numCollectionIntervals_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.minStepsPerInterval_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.maxStepsPerInterval_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.intervalSampleSize_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UHCAccelParametersSetRequestOrBuilder {
            private int bitField0_;
            private int intervalSampleSize_;
            private int maxStepsPerInterval_;
            private int minStepsPerInterval_;
            private int numCollectionIntervals_;
            private int preCollectionIntervals_;
            private int sessionsPerDay_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(UHCAccelParametersSetRequest uHCAccelParametersSetRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    uHCAccelParametersSetRequest.sessionsPerDay_ = this.sessionsPerDay_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    uHCAccelParametersSetRequest.preCollectionIntervals_ = this.preCollectionIntervals_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    uHCAccelParametersSetRequest.numCollectionIntervals_ = this.numCollectionIntervals_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    uHCAccelParametersSetRequest.minStepsPerInterval_ = this.minStepsPerInterval_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    uHCAccelParametersSetRequest.maxStepsPerInterval_ = this.maxStepsPerInterval_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    uHCAccelParametersSetRequest.intervalSampleSize_ = this.intervalSampleSize_;
                    i14 |= 32;
                }
                uHCAccelParametersSetRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCAccelParametersSetRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCAccelParametersSetRequest build() {
                UHCAccelParametersSetRequest uHCAccelParametersSetRequestBuildPartial = buildPartial();
                if (uHCAccelParametersSetRequestBuildPartial.isInitialized()) {
                    return uHCAccelParametersSetRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) uHCAccelParametersSetRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCAccelParametersSetRequest buildPartial() {
                UHCAccelParametersSetRequest uHCAccelParametersSetRequest = new UHCAccelParametersSetRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(uHCAccelParametersSetRequest);
                }
                onBuilt();
                return uHCAccelParametersSetRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sessionsPerDay_ = 0;
                this.preCollectionIntervals_ = 0;
                this.numCollectionIntervals_ = 0;
                this.minStepsPerInterval_ = 0;
                this.maxStepsPerInterval_ = 0;
                this.intervalSampleSize_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIntervalSampleSize() {
                this.bitField0_ &= -33;
                this.intervalSampleSize_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxStepsPerInterval() {
                this.bitField0_ &= -17;
                this.maxStepsPerInterval_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMinStepsPerInterval() {
                this.bitField0_ &= -9;
                this.minStepsPerInterval_ = 0;
                onChanged();
                return this;
            }

            public Builder clearNumCollectionIntervals() {
                this.bitField0_ &= -5;
                this.numCollectionIntervals_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPreCollectionIntervals() {
                this.bitField0_ &= -3;
                this.preCollectionIntervals_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSessionsPerDay() {
                this.bitField0_ &= -2;
                this.sessionsPerDay_ = 0;
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
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCAccelParametersSetRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
            public int getIntervalSampleSize() {
                return this.intervalSampleSize_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
            public int getMaxStepsPerInterval() {
                return this.maxStepsPerInterval_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
            public int getMinStepsPerInterval() {
                return this.minStepsPerInterval_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
            public int getNumCollectionIntervals() {
                return this.numCollectionIntervals_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
            public int getPreCollectionIntervals() {
                return this.preCollectionIntervals_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
            public int getSessionsPerDay() {
                return this.sessionsPerDay_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
            public boolean hasIntervalSampleSize() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
            public boolean hasMaxStepsPerInterval() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
            public boolean hasMinStepsPerInterval() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
            public boolean hasNumCollectionIntervals() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
            public boolean hasPreCollectionIntervals() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetRequestOrBuilder
            public boolean hasSessionsPerDay() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCAccelParametersSetRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCAccelParametersSetRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSessionsPerDay() && hasPreCollectionIntervals() && hasNumCollectionIntervals() && hasMinStepsPerInterval() && hasMaxStepsPerInterval() && hasIntervalSampleSize();
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
                                    this.sessionsPerDay_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.preCollectionIntervals_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.numCollectionIntervals_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.minStepsPerInterval_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.maxStepsPerInterval_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    this.intervalSampleSize_ = codedInputStream.readUInt32();
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

            public Builder setIntervalSampleSize(int i14) {
                this.intervalSampleSize_ = i14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setMaxStepsPerInterval(int i14) {
                this.maxStepsPerInterval_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setMinStepsPerInterval(int i14) {
                this.minStepsPerInterval_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setNumCollectionIntervals(int i14) {
                this.numCollectionIntervals_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPreCollectionIntervals(int i14) {
                this.preCollectionIntervals_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionsPerDay(int i14) {
                this.sessionsPerDay_ = i14;
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
            public UHCAccelParametersSetRequest getDefaultInstanceForType() {
                return UHCAccelParametersSetRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UHCAccelParametersSetRequest) {
                    return mergeFrom((UHCAccelParametersSetRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UHCAccelParametersSetRequest uHCAccelParametersSetRequest) {
                if (uHCAccelParametersSetRequest == UHCAccelParametersSetRequest.getDefaultInstance()) {
                    return this;
                }
                if (uHCAccelParametersSetRequest.hasSessionsPerDay()) {
                    setSessionsPerDay(uHCAccelParametersSetRequest.getSessionsPerDay());
                }
                if (uHCAccelParametersSetRequest.hasPreCollectionIntervals()) {
                    setPreCollectionIntervals(uHCAccelParametersSetRequest.getPreCollectionIntervals());
                }
                if (uHCAccelParametersSetRequest.hasNumCollectionIntervals()) {
                    setNumCollectionIntervals(uHCAccelParametersSetRequest.getNumCollectionIntervals());
                }
                if (uHCAccelParametersSetRequest.hasMinStepsPerInterval()) {
                    setMinStepsPerInterval(uHCAccelParametersSetRequest.getMinStepsPerInterval());
                }
                if (uHCAccelParametersSetRequest.hasMaxStepsPerInterval()) {
                    setMaxStepsPerInterval(uHCAccelParametersSetRequest.getMaxStepsPerInterval());
                }
                if (uHCAccelParametersSetRequest.hasIntervalSampleSize()) {
                    setIntervalSampleSize(uHCAccelParametersSetRequest.getIntervalSampleSize());
                }
                mergeUnknownFields(uHCAccelParametersSetRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UHCAccelParametersSetRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UHCAccelParametersSetRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCAccelParametersSetRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCAccelParametersSetRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UHCAccelParametersSetRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UHCAccelParametersSetRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UHCAccelParametersSetRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UHCAccelParametersSetRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UHCAccelParametersSetRequest parseFrom(InputStream inputStream) {
            return (UHCAccelParametersSetRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UHCAccelParametersSetRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCAccelParametersSetRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCAccelParametersSetRequest parseFrom(CodedInputStream codedInputStream) {
            return (UHCAccelParametersSetRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ UHCAccelParametersSetRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UHCAccelParametersSetRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCAccelParametersSetRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private UHCAccelParametersSetRequest() {
            this.sessionsPerDay_ = 0;
            this.preCollectionIntervals_ = 0;
            this.numCollectionIntervals_ = 0;
            this.minStepsPerInterval_ = 0;
            this.maxStepsPerInterval_ = 0;
            this.intervalSampleSize_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    public static final class UHCActivationRequest extends GeneratedMessageV3 implements UHCActivationRequestOrBuilder {
        public static final int ACTIVATE_UHC_FIELD_NUMBER = 1;
        public static final int ACTIVATION_KEY_FIELD_NUMBER = 2;
        private static final UHCActivationRequest DEFAULT_INSTANCE = new UHCActivationRequest();

        @Deprecated
        public static final Parser<UHCActivationRequest> PARSER = new AbstractParser<UHCActivationRequest>() { // from class: com.garmin.proto.generated.GDIHSAData.UHCActivationRequest.1
            @Override // com.google.protobuf.Parser
            public UHCActivationRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UHCActivationRequest.newBuilder();
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
        private boolean activateUhc_;
        private int activationKey_;
        private int bitField0_;
        private byte memoizedIsInitialized;

        private UHCActivationRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.activateUhc_ = false;
            this.activationKey_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UHCActivationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCActivationRequest_descriptor;
        }

        public static Builder newBuilder(UHCActivationRequest uHCActivationRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(uHCActivationRequest);
        }

        public static UHCActivationRequest parseDelimitedFrom(InputStream inputStream) {
            return (UHCActivationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UHCActivationRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UHCActivationRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UHCActivationRequest)) {
                return super.equals(obj);
            }
            UHCActivationRequest uHCActivationRequest = (UHCActivationRequest) obj;
            if (hasActivateUhc() != uHCActivationRequest.hasActivateUhc()) {
                return false;
            }
            if ((!hasActivateUhc() || getActivateUhc() == uHCActivationRequest.getActivateUhc()) && hasActivationKey() == uHCActivationRequest.hasActivationKey()) {
                return (!hasActivationKey() || getActivationKey() == uHCActivationRequest.getActivationKey()) && getUnknownFields().equals(uHCActivationRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCActivationRequestOrBuilder
        public boolean getActivateUhc() {
            return this.activateUhc_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCActivationRequestOrBuilder
        public int getActivationKey() {
            return this.activationKey_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UHCActivationRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.activateUhc_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt32Size(2, this.activationKey_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCActivationRequestOrBuilder
        public boolean hasActivateUhc() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCActivationRequestOrBuilder
        public boolean hasActivationKey() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasActivateUhc()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getActivateUhc());
            }
            if (hasActivationKey()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getActivationKey();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCActivationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCActivationRequest.class, Builder.class);
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
            if (!hasActivateUhc()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasActivationKey()) {
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
            return new UHCActivationRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.activateUhc_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.activationKey_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UHCActivationRequestOrBuilder {
            private boolean activateUhc_;
            private int activationKey_;
            private int bitField0_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(UHCActivationRequest uHCActivationRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    uHCActivationRequest.activateUhc_ = this.activateUhc_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    uHCActivationRequest.activationKey_ = this.activationKey_;
                    i14 |= 2;
                }
                uHCActivationRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCActivationRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCActivationRequest build() {
                UHCActivationRequest uHCActivationRequestBuildPartial = buildPartial();
                if (uHCActivationRequestBuildPartial.isInitialized()) {
                    return uHCActivationRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) uHCActivationRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCActivationRequest buildPartial() {
                UHCActivationRequest uHCActivationRequest = new UHCActivationRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(uHCActivationRequest);
                }
                onBuilt();
                return uHCActivationRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.activateUhc_ = false;
                this.activationKey_ = 0;
                return this;
            }

            public Builder clearActivateUhc() {
                this.bitField0_ &= -2;
                this.activateUhc_ = false;
                onChanged();
                return this;
            }

            public Builder clearActivationKey() {
                this.bitField0_ &= -3;
                this.activationKey_ = 0;
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

            @Override // com.garmin.proto.generated.GDIHSAData.UHCActivationRequestOrBuilder
            public boolean getActivateUhc() {
                return this.activateUhc_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCActivationRequestOrBuilder
            public int getActivationKey() {
                return this.activationKey_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCActivationRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCActivationRequestOrBuilder
            public boolean hasActivateUhc() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCActivationRequestOrBuilder
            public boolean hasActivationKey() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCActivationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCActivationRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasActivateUhc() && hasActivationKey();
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
                                    this.activateUhc_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.activationKey_ = codedInputStream.readUInt32();
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

            public Builder setActivateUhc(boolean z14) {
                this.activateUhc_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setActivationKey(int i14) {
                this.activationKey_ = i14;
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

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public UHCActivationRequest getDefaultInstanceForType() {
                return UHCActivationRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UHCActivationRequest) {
                    return mergeFrom((UHCActivationRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UHCActivationRequest uHCActivationRequest) {
                if (uHCActivationRequest == UHCActivationRequest.getDefaultInstance()) {
                    return this;
                }
                if (uHCActivationRequest.hasActivateUhc()) {
                    setActivateUhc(uHCActivationRequest.getActivateUhc());
                }
                if (uHCActivationRequest.hasActivationKey()) {
                    setActivationKey(uHCActivationRequest.getActivationKey());
                }
                mergeUnknownFields(uHCActivationRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UHCActivationRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UHCActivationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCActivationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCActivationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UHCActivationRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UHCActivationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ UHCActivationRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UHCActivationRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private UHCActivationRequest() {
            this.activateUhc_ = false;
            this.activationKey_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UHCActivationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UHCActivationRequest parseFrom(InputStream inputStream) {
            return (UHCActivationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UHCActivationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCActivationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCActivationRequest parseFrom(CodedInputStream codedInputStream) {
            return (UHCActivationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UHCActivationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCActivationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class UHCFitParametersGetRequest extends GeneratedMessageV3 implements UHCFitParametersGetRequestOrBuilder {
        public static final int GET_PARAMETERS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean getParameters_;
        private byte memoizedIsInitialized;
        private static final UHCFitParametersGetRequest DEFAULT_INSTANCE = new UHCFitParametersGetRequest();

        @Deprecated
        public static final Parser<UHCFitParametersGetRequest> PARSER = new AbstractParser<UHCFitParametersGetRequest>() { // from class: com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetRequest.1
            @Override // com.google.protobuf.Parser
            public UHCFitParametersGetRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UHCFitParametersGetRequest.newBuilder();
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

        private UHCFitParametersGetRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.getParameters_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UHCFitParametersGetRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCFitParametersGetRequest_descriptor;
        }

        public static Builder newBuilder(UHCFitParametersGetRequest uHCFitParametersGetRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(uHCFitParametersGetRequest);
        }

        public static UHCFitParametersGetRequest parseDelimitedFrom(InputStream inputStream) {
            return (UHCFitParametersGetRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UHCFitParametersGetRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UHCFitParametersGetRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UHCFitParametersGetRequest)) {
                return super.equals(obj);
            }
            UHCFitParametersGetRequest uHCFitParametersGetRequest = (UHCFitParametersGetRequest) obj;
            if (hasGetParameters() != uHCFitParametersGetRequest.hasGetParameters()) {
                return false;
            }
            return (!hasGetParameters() || getGetParameters() == uHCFitParametersGetRequest.getGetParameters()) && getUnknownFields().equals(uHCFitParametersGetRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetRequestOrBuilder
        public boolean getGetParameters() {
            return this.getParameters_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UHCFitParametersGetRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.getParameters_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetRequestOrBuilder
        public boolean hasGetParameters() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGetParameters()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getGetParameters());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCFitParametersGetRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCFitParametersGetRequest.class, Builder.class);
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
            if (hasGetParameters()) {
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
            return new UHCFitParametersGetRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.getParameters_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UHCFitParametersGetRequestOrBuilder {
            private int bitField0_;
            private boolean getParameters_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(UHCFitParametersGetRequest uHCFitParametersGetRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    uHCFitParametersGetRequest.getParameters_ = this.getParameters_;
                } else {
                    i14 = 0;
                }
                uHCFitParametersGetRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCFitParametersGetRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCFitParametersGetRequest build() {
                UHCFitParametersGetRequest uHCFitParametersGetRequestBuildPartial = buildPartial();
                if (uHCFitParametersGetRequestBuildPartial.isInitialized()) {
                    return uHCFitParametersGetRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) uHCFitParametersGetRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCFitParametersGetRequest buildPartial() {
                UHCFitParametersGetRequest uHCFitParametersGetRequest = new UHCFitParametersGetRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(uHCFitParametersGetRequest);
                }
                onBuilt();
                return uHCFitParametersGetRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.getParameters_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGetParameters() {
                this.bitField0_ &= -2;
                this.getParameters_ = false;
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
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCFitParametersGetRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetRequestOrBuilder
            public boolean getGetParameters() {
                return this.getParameters_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetRequestOrBuilder
            public boolean hasGetParameters() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCFitParametersGetRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCFitParametersGetRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasGetParameters();
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
                                    this.getParameters_ = codedInputStream.readBool();
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

            public Builder setGetParameters(boolean z14) {
                this.getParameters_ = z14;
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
            public UHCFitParametersGetRequest getDefaultInstanceForType() {
                return UHCFitParametersGetRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UHCFitParametersGetRequest) {
                    return mergeFrom((UHCFitParametersGetRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UHCFitParametersGetRequest uHCFitParametersGetRequest) {
                if (uHCFitParametersGetRequest == UHCFitParametersGetRequest.getDefaultInstance()) {
                    return this;
                }
                if (uHCFitParametersGetRequest.hasGetParameters()) {
                    setGetParameters(uHCFitParametersGetRequest.getGetParameters());
                }
                mergeUnknownFields(uHCFitParametersGetRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UHCFitParametersGetRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UHCFitParametersGetRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCFitParametersGetRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCFitParametersGetRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ UHCFitParametersGetRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UHCFitParametersGetRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private UHCFitParametersGetRequest() {
            this.getParameters_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UHCFitParametersGetRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UHCFitParametersGetRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UHCFitParametersGetRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UHCFitParametersGetRequest parseFrom(InputStream inputStream) {
            return (UHCFitParametersGetRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UHCFitParametersGetRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCFitParametersGetRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCFitParametersGetRequest parseFrom(CodedInputStream codedInputStream) {
            return (UHCFitParametersGetRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UHCFitParametersGetRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCFitParametersGetRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class UHCFitParametersGetResponse extends GeneratedMessageV3 implements UHCFitParametersGetResponseOrBuilder {
        public static final int FREQ_DAILY_GOAL_CNT_FIELD_NUMBER = 4;
        public static final int FREQ_DELAY_LEN_MINS_FIELD_NUMBER = 3;
        public static final int FREQ_PERIOD_LEN_MINS_FIELD_NUMBER = 2;
        public static final int FREQ_PERIOD_STEP_GOAL_FIELD_NUMBER = 1;
        public static final int INTEN_ACTIVE_MIN_GOAL_FIELD_NUMBER = 6;
        public static final int INTEN_STEP_GOAL_FIELD_NUMBER = 5;
        public static final int TENAC_DAILY_STEP_GOAL_FIELD_NUMBER = 7;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int freqDailyGoalCnt_;
        private int freqDelayLenMins_;
        private int freqPeriodLenMins_;
        private int freqPeriodStepGoal_;
        private int intenActiveMinGoal_;
        private int intenStepGoal_;
        private byte memoizedIsInitialized;
        private int tenacDailyStepGoal_;
        private static final UHCFitParametersGetResponse DEFAULT_INSTANCE = new UHCFitParametersGetResponse();

        @Deprecated
        public static final Parser<UHCFitParametersGetResponse> PARSER = new AbstractParser<UHCFitParametersGetResponse>() { // from class: com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponse.1
            @Override // com.google.protobuf.Parser
            public UHCFitParametersGetResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UHCFitParametersGetResponse.newBuilder();
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

        private UHCFitParametersGetResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.freqPeriodStepGoal_ = 0;
            this.freqPeriodLenMins_ = 0;
            this.freqDelayLenMins_ = 0;
            this.freqDailyGoalCnt_ = 0;
            this.intenStepGoal_ = 0;
            this.intenActiveMinGoal_ = 0;
            this.tenacDailyStepGoal_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UHCFitParametersGetResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCFitParametersGetResponse_descriptor;
        }

        public static Builder newBuilder(UHCFitParametersGetResponse uHCFitParametersGetResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(uHCFitParametersGetResponse);
        }

        public static UHCFitParametersGetResponse parseDelimitedFrom(InputStream inputStream) {
            return (UHCFitParametersGetResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UHCFitParametersGetResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UHCFitParametersGetResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UHCFitParametersGetResponse)) {
                return super.equals(obj);
            }
            UHCFitParametersGetResponse uHCFitParametersGetResponse = (UHCFitParametersGetResponse) obj;
            if (hasFreqPeriodStepGoal() != uHCFitParametersGetResponse.hasFreqPeriodStepGoal()) {
                return false;
            }
            if ((hasFreqPeriodStepGoal() && getFreqPeriodStepGoal() != uHCFitParametersGetResponse.getFreqPeriodStepGoal()) || hasFreqPeriodLenMins() != uHCFitParametersGetResponse.hasFreqPeriodLenMins()) {
                return false;
            }
            if ((hasFreqPeriodLenMins() && getFreqPeriodLenMins() != uHCFitParametersGetResponse.getFreqPeriodLenMins()) || hasFreqDelayLenMins() != uHCFitParametersGetResponse.hasFreqDelayLenMins()) {
                return false;
            }
            if ((hasFreqDelayLenMins() && getFreqDelayLenMins() != uHCFitParametersGetResponse.getFreqDelayLenMins()) || hasFreqDailyGoalCnt() != uHCFitParametersGetResponse.hasFreqDailyGoalCnt()) {
                return false;
            }
            if ((hasFreqDailyGoalCnt() && getFreqDailyGoalCnt() != uHCFitParametersGetResponse.getFreqDailyGoalCnt()) || hasIntenStepGoal() != uHCFitParametersGetResponse.hasIntenStepGoal()) {
                return false;
            }
            if ((hasIntenStepGoal() && getIntenStepGoal() != uHCFitParametersGetResponse.getIntenStepGoal()) || hasIntenActiveMinGoal() != uHCFitParametersGetResponse.hasIntenActiveMinGoal()) {
                return false;
            }
            if ((!hasIntenActiveMinGoal() || getIntenActiveMinGoal() == uHCFitParametersGetResponse.getIntenActiveMinGoal()) && hasTenacDailyStepGoal() == uHCFitParametersGetResponse.hasTenacDailyStepGoal()) {
                return (!hasTenacDailyStepGoal() || getTenacDailyStepGoal() == uHCFitParametersGetResponse.getTenacDailyStepGoal()) && getUnknownFields().equals(uHCFitParametersGetResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
        public int getFreqDailyGoalCnt() {
            return this.freqDailyGoalCnt_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
        public int getFreqDelayLenMins() {
            return this.freqDelayLenMins_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
        public int getFreqPeriodLenMins() {
            return this.freqPeriodLenMins_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
        public int getFreqPeriodStepGoal() {
            return this.freqPeriodStepGoal_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
        public int getIntenActiveMinGoal() {
            return this.intenActiveMinGoal_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
        public int getIntenStepGoal() {
            return this.intenStepGoal_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UHCFitParametersGetResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.freqPeriodStepGoal_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.freqPeriodLenMins_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.freqDelayLenMins_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.freqDailyGoalCnt_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.intenStepGoal_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(6, this.intenActiveMinGoal_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(7, this.tenacDailyStepGoal_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
        public int getTenacDailyStepGoal() {
            return this.tenacDailyStepGoal_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
        public boolean hasFreqDailyGoalCnt() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
        public boolean hasFreqDelayLenMins() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
        public boolean hasFreqPeriodLenMins() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
        public boolean hasFreqPeriodStepGoal() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
        public boolean hasIntenActiveMinGoal() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
        public boolean hasIntenStepGoal() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
        public boolean hasTenacDailyStepGoal() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasFreqPeriodStepGoal()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getFreqPeriodStepGoal();
            }
            if (hasFreqPeriodLenMins()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getFreqPeriodLenMins();
            }
            if (hasFreqDelayLenMins()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getFreqDelayLenMins();
            }
            if (hasFreqDailyGoalCnt()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getFreqDailyGoalCnt();
            }
            if (hasIntenStepGoal()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getIntenStepGoal();
            }
            if (hasIntenActiveMinGoal()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getIntenActiveMinGoal();
            }
            if (hasTenacDailyStepGoal()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getTenacDailyStepGoal();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCFitParametersGetResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCFitParametersGetResponse.class, Builder.class);
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
            if (!hasFreqPeriodStepGoal()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasFreqPeriodLenMins()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasFreqDelayLenMins()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasFreqDailyGoalCnt()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasIntenStepGoal()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasIntenActiveMinGoal()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasTenacDailyStepGoal()) {
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
            return new UHCFitParametersGetResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.freqPeriodStepGoal_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.freqPeriodLenMins_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.freqDelayLenMins_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.freqDailyGoalCnt_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.intenStepGoal_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.intenActiveMinGoal_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(7, this.tenacDailyStepGoal_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UHCFitParametersGetResponseOrBuilder {
            private int bitField0_;
            private int freqDailyGoalCnt_;
            private int freqDelayLenMins_;
            private int freqPeriodLenMins_;
            private int freqPeriodStepGoal_;
            private int intenActiveMinGoal_;
            private int intenStepGoal_;
            private int tenacDailyStepGoal_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(UHCFitParametersGetResponse uHCFitParametersGetResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    uHCFitParametersGetResponse.freqPeriodStepGoal_ = this.freqPeriodStepGoal_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    uHCFitParametersGetResponse.freqPeriodLenMins_ = this.freqPeriodLenMins_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    uHCFitParametersGetResponse.freqDelayLenMins_ = this.freqDelayLenMins_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    uHCFitParametersGetResponse.freqDailyGoalCnt_ = this.freqDailyGoalCnt_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    uHCFitParametersGetResponse.intenStepGoal_ = this.intenStepGoal_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    uHCFitParametersGetResponse.intenActiveMinGoal_ = this.intenActiveMinGoal_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    uHCFitParametersGetResponse.tenacDailyStepGoal_ = this.tenacDailyStepGoal_;
                    i14 |= 64;
                }
                uHCFitParametersGetResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCFitParametersGetResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCFitParametersGetResponse build() {
                UHCFitParametersGetResponse uHCFitParametersGetResponseBuildPartial = buildPartial();
                if (uHCFitParametersGetResponseBuildPartial.isInitialized()) {
                    return uHCFitParametersGetResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) uHCFitParametersGetResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCFitParametersGetResponse buildPartial() {
                UHCFitParametersGetResponse uHCFitParametersGetResponse = new UHCFitParametersGetResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(uHCFitParametersGetResponse);
                }
                onBuilt();
                return uHCFitParametersGetResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.freqPeriodStepGoal_ = 0;
                this.freqPeriodLenMins_ = 0;
                this.freqDelayLenMins_ = 0;
                this.freqDailyGoalCnt_ = 0;
                this.intenStepGoal_ = 0;
                this.intenActiveMinGoal_ = 0;
                this.tenacDailyStepGoal_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFreqDailyGoalCnt() {
                this.bitField0_ &= -9;
                this.freqDailyGoalCnt_ = 0;
                onChanged();
                return this;
            }

            public Builder clearFreqDelayLenMins() {
                this.bitField0_ &= -5;
                this.freqDelayLenMins_ = 0;
                onChanged();
                return this;
            }

            public Builder clearFreqPeriodLenMins() {
                this.bitField0_ &= -3;
                this.freqPeriodLenMins_ = 0;
                onChanged();
                return this;
            }

            public Builder clearFreqPeriodStepGoal() {
                this.bitField0_ &= -2;
                this.freqPeriodStepGoal_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIntenActiveMinGoal() {
                this.bitField0_ &= -33;
                this.intenActiveMinGoal_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIntenStepGoal() {
                this.bitField0_ &= -17;
                this.intenStepGoal_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearTenacDailyStepGoal() {
                this.bitField0_ &= -65;
                this.tenacDailyStepGoal_ = 0;
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
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCFitParametersGetResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
            public int getFreqDailyGoalCnt() {
                return this.freqDailyGoalCnt_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
            public int getFreqDelayLenMins() {
                return this.freqDelayLenMins_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
            public int getFreqPeriodLenMins() {
                return this.freqPeriodLenMins_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
            public int getFreqPeriodStepGoal() {
                return this.freqPeriodStepGoal_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
            public int getIntenActiveMinGoal() {
                return this.intenActiveMinGoal_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
            public int getIntenStepGoal() {
                return this.intenStepGoal_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
            public int getTenacDailyStepGoal() {
                return this.tenacDailyStepGoal_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
            public boolean hasFreqDailyGoalCnt() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
            public boolean hasFreqDelayLenMins() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
            public boolean hasFreqPeriodLenMins() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
            public boolean hasFreqPeriodStepGoal() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
            public boolean hasIntenActiveMinGoal() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
            public boolean hasIntenStepGoal() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersGetResponseOrBuilder
            public boolean hasTenacDailyStepGoal() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCFitParametersGetResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCFitParametersGetResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasFreqPeriodStepGoal() && hasFreqPeriodLenMins() && hasFreqDelayLenMins() && hasFreqDailyGoalCnt() && hasIntenStepGoal() && hasIntenActiveMinGoal() && hasTenacDailyStepGoal();
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
                                    this.freqPeriodStepGoal_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.freqPeriodLenMins_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.freqDelayLenMins_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.freqDailyGoalCnt_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.intenStepGoal_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    this.intenActiveMinGoal_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                } else if (tag == 56) {
                                    this.tenacDailyStepGoal_ = codedInputStream.readUInt32();
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

            public Builder setFreqDailyGoalCnt(int i14) {
                this.freqDailyGoalCnt_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setFreqDelayLenMins(int i14) {
                this.freqDelayLenMins_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setFreqPeriodLenMins(int i14) {
                this.freqPeriodLenMins_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setFreqPeriodStepGoal(int i14) {
                this.freqPeriodStepGoal_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setIntenActiveMinGoal(int i14) {
                this.intenActiveMinGoal_ = i14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setIntenStepGoal(int i14) {
                this.intenStepGoal_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTenacDailyStepGoal(int i14) {
                this.tenacDailyStepGoal_ = i14;
                this.bitField0_ |= 64;
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
            public UHCFitParametersGetResponse getDefaultInstanceForType() {
                return UHCFitParametersGetResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UHCFitParametersGetResponse) {
                    return mergeFrom((UHCFitParametersGetResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UHCFitParametersGetResponse uHCFitParametersGetResponse) {
                if (uHCFitParametersGetResponse == UHCFitParametersGetResponse.getDefaultInstance()) {
                    return this;
                }
                if (uHCFitParametersGetResponse.hasFreqPeriodStepGoal()) {
                    setFreqPeriodStepGoal(uHCFitParametersGetResponse.getFreqPeriodStepGoal());
                }
                if (uHCFitParametersGetResponse.hasFreqPeriodLenMins()) {
                    setFreqPeriodLenMins(uHCFitParametersGetResponse.getFreqPeriodLenMins());
                }
                if (uHCFitParametersGetResponse.hasFreqDelayLenMins()) {
                    setFreqDelayLenMins(uHCFitParametersGetResponse.getFreqDelayLenMins());
                }
                if (uHCFitParametersGetResponse.hasFreqDailyGoalCnt()) {
                    setFreqDailyGoalCnt(uHCFitParametersGetResponse.getFreqDailyGoalCnt());
                }
                if (uHCFitParametersGetResponse.hasIntenStepGoal()) {
                    setIntenStepGoal(uHCFitParametersGetResponse.getIntenStepGoal());
                }
                if (uHCFitParametersGetResponse.hasIntenActiveMinGoal()) {
                    setIntenActiveMinGoal(uHCFitParametersGetResponse.getIntenActiveMinGoal());
                }
                if (uHCFitParametersGetResponse.hasTenacDailyStepGoal()) {
                    setTenacDailyStepGoal(uHCFitParametersGetResponse.getTenacDailyStepGoal());
                }
                mergeUnknownFields(uHCFitParametersGetResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UHCFitParametersGetResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UHCFitParametersGetResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCFitParametersGetResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCFitParametersGetResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UHCFitParametersGetResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UHCFitParametersGetResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UHCFitParametersGetResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UHCFitParametersGetResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UHCFitParametersGetResponse parseFrom(InputStream inputStream) {
            return (UHCFitParametersGetResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UHCFitParametersGetResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCFitParametersGetResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCFitParametersGetResponse parseFrom(CodedInputStream codedInputStream) {
            return (UHCFitParametersGetResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UHCFitParametersGetResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCFitParametersGetResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ UHCFitParametersGetResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private UHCFitParametersGetResponse() {
            this.freqPeriodStepGoal_ = 0;
            this.freqPeriodLenMins_ = 0;
            this.freqDelayLenMins_ = 0;
            this.freqDailyGoalCnt_ = 0;
            this.intenStepGoal_ = 0;
            this.intenActiveMinGoal_ = 0;
            this.tenacDailyStepGoal_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    public static final class UHCFitParametersSetRequest extends GeneratedMessageV3 implements UHCFitParametersSetRequestOrBuilder {
        public static final int FREQ_DAILY_GOAL_CNT_FIELD_NUMBER = 4;
        public static final int FREQ_DELAY_LEN_MINS_FIELD_NUMBER = 3;
        public static final int FREQ_PERIOD_LEN_MINS_FIELD_NUMBER = 2;
        public static final int FREQ_PERIOD_STEP_GOAL_FIELD_NUMBER = 1;
        public static final int INTEN_ACTIVE_MIN_GOAL_FIELD_NUMBER = 6;
        public static final int INTEN_STEP_GOAL_FIELD_NUMBER = 5;
        public static final int TENAC_DAILY_STEP_GOAL_FIELD_NUMBER = 7;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int freqDailyGoalCnt_;
        private int freqDelayLenMins_;
        private int freqPeriodLenMins_;
        private int freqPeriodStepGoal_;
        private int intenActiveMinGoal_;
        private int intenStepGoal_;
        private byte memoizedIsInitialized;
        private int tenacDailyStepGoal_;
        private static final UHCFitParametersSetRequest DEFAULT_INSTANCE = new UHCFitParametersSetRequest();

        @Deprecated
        public static final Parser<UHCFitParametersSetRequest> PARSER = new AbstractParser<UHCFitParametersSetRequest>() { // from class: com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequest.1
            @Override // com.google.protobuf.Parser
            public UHCFitParametersSetRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UHCFitParametersSetRequest.newBuilder();
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

        private UHCFitParametersSetRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.freqPeriodStepGoal_ = 0;
            this.freqPeriodLenMins_ = 0;
            this.freqDelayLenMins_ = 0;
            this.freqDailyGoalCnt_ = 0;
            this.intenStepGoal_ = 0;
            this.intenActiveMinGoal_ = 0;
            this.tenacDailyStepGoal_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UHCFitParametersSetRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCFitParametersSetRequest_descriptor;
        }

        public static Builder newBuilder(UHCFitParametersSetRequest uHCFitParametersSetRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(uHCFitParametersSetRequest);
        }

        public static UHCFitParametersSetRequest parseDelimitedFrom(InputStream inputStream) {
            return (UHCFitParametersSetRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UHCFitParametersSetRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UHCFitParametersSetRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UHCFitParametersSetRequest)) {
                return super.equals(obj);
            }
            UHCFitParametersSetRequest uHCFitParametersSetRequest = (UHCFitParametersSetRequest) obj;
            if (hasFreqPeriodStepGoal() != uHCFitParametersSetRequest.hasFreqPeriodStepGoal()) {
                return false;
            }
            if ((hasFreqPeriodStepGoal() && getFreqPeriodStepGoal() != uHCFitParametersSetRequest.getFreqPeriodStepGoal()) || hasFreqPeriodLenMins() != uHCFitParametersSetRequest.hasFreqPeriodLenMins()) {
                return false;
            }
            if ((hasFreqPeriodLenMins() && getFreqPeriodLenMins() != uHCFitParametersSetRequest.getFreqPeriodLenMins()) || hasFreqDelayLenMins() != uHCFitParametersSetRequest.hasFreqDelayLenMins()) {
                return false;
            }
            if ((hasFreqDelayLenMins() && getFreqDelayLenMins() != uHCFitParametersSetRequest.getFreqDelayLenMins()) || hasFreqDailyGoalCnt() != uHCFitParametersSetRequest.hasFreqDailyGoalCnt()) {
                return false;
            }
            if ((hasFreqDailyGoalCnt() && getFreqDailyGoalCnt() != uHCFitParametersSetRequest.getFreqDailyGoalCnt()) || hasIntenStepGoal() != uHCFitParametersSetRequest.hasIntenStepGoal()) {
                return false;
            }
            if ((hasIntenStepGoal() && getIntenStepGoal() != uHCFitParametersSetRequest.getIntenStepGoal()) || hasIntenActiveMinGoal() != uHCFitParametersSetRequest.hasIntenActiveMinGoal()) {
                return false;
            }
            if ((!hasIntenActiveMinGoal() || getIntenActiveMinGoal() == uHCFitParametersSetRequest.getIntenActiveMinGoal()) && hasTenacDailyStepGoal() == uHCFitParametersSetRequest.hasTenacDailyStepGoal()) {
                return (!hasTenacDailyStepGoal() || getTenacDailyStepGoal() == uHCFitParametersSetRequest.getTenacDailyStepGoal()) && getUnknownFields().equals(uHCFitParametersSetRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
        public int getFreqDailyGoalCnt() {
            return this.freqDailyGoalCnt_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
        public int getFreqDelayLenMins() {
            return this.freqDelayLenMins_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
        public int getFreqPeriodLenMins() {
            return this.freqPeriodLenMins_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
        public int getFreqPeriodStepGoal() {
            return this.freqPeriodStepGoal_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
        public int getIntenActiveMinGoal() {
            return this.intenActiveMinGoal_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
        public int getIntenStepGoal() {
            return this.intenStepGoal_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UHCFitParametersSetRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.freqPeriodStepGoal_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.freqPeriodLenMins_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.freqDelayLenMins_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.freqDailyGoalCnt_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.intenStepGoal_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(6, this.intenActiveMinGoal_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(7, this.tenacDailyStepGoal_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
        public int getTenacDailyStepGoal() {
            return this.tenacDailyStepGoal_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
        public boolean hasFreqDailyGoalCnt() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
        public boolean hasFreqDelayLenMins() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
        public boolean hasFreqPeriodLenMins() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
        public boolean hasFreqPeriodStepGoal() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
        public boolean hasIntenActiveMinGoal() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
        public boolean hasIntenStepGoal() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
        public boolean hasTenacDailyStepGoal() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasFreqPeriodStepGoal()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getFreqPeriodStepGoal();
            }
            if (hasFreqPeriodLenMins()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getFreqPeriodLenMins();
            }
            if (hasFreqDelayLenMins()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getFreqDelayLenMins();
            }
            if (hasFreqDailyGoalCnt()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getFreqDailyGoalCnt();
            }
            if (hasIntenStepGoal()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getIntenStepGoal();
            }
            if (hasIntenActiveMinGoal()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getIntenActiveMinGoal();
            }
            if (hasTenacDailyStepGoal()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getTenacDailyStepGoal();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCFitParametersSetRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCFitParametersSetRequest.class, Builder.class);
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
            if (!hasFreqPeriodStepGoal()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasFreqPeriodLenMins()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasFreqDelayLenMins()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasFreqDailyGoalCnt()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasIntenStepGoal()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasIntenActiveMinGoal()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasTenacDailyStepGoal()) {
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
            return new UHCFitParametersSetRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.freqPeriodStepGoal_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.freqPeriodLenMins_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.freqDelayLenMins_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.freqDailyGoalCnt_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.intenStepGoal_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.intenActiveMinGoal_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(7, this.tenacDailyStepGoal_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UHCFitParametersSetRequestOrBuilder {
            private int bitField0_;
            private int freqDailyGoalCnt_;
            private int freqDelayLenMins_;
            private int freqPeriodLenMins_;
            private int freqPeriodStepGoal_;
            private int intenActiveMinGoal_;
            private int intenStepGoal_;
            private int tenacDailyStepGoal_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(UHCFitParametersSetRequest uHCFitParametersSetRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    uHCFitParametersSetRequest.freqPeriodStepGoal_ = this.freqPeriodStepGoal_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    uHCFitParametersSetRequest.freqPeriodLenMins_ = this.freqPeriodLenMins_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    uHCFitParametersSetRequest.freqDelayLenMins_ = this.freqDelayLenMins_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    uHCFitParametersSetRequest.freqDailyGoalCnt_ = this.freqDailyGoalCnt_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    uHCFitParametersSetRequest.intenStepGoal_ = this.intenStepGoal_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    uHCFitParametersSetRequest.intenActiveMinGoal_ = this.intenActiveMinGoal_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    uHCFitParametersSetRequest.tenacDailyStepGoal_ = this.tenacDailyStepGoal_;
                    i14 |= 64;
                }
                uHCFitParametersSetRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCFitParametersSetRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCFitParametersSetRequest build() {
                UHCFitParametersSetRequest uHCFitParametersSetRequestBuildPartial = buildPartial();
                if (uHCFitParametersSetRequestBuildPartial.isInitialized()) {
                    return uHCFitParametersSetRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) uHCFitParametersSetRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCFitParametersSetRequest buildPartial() {
                UHCFitParametersSetRequest uHCFitParametersSetRequest = new UHCFitParametersSetRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(uHCFitParametersSetRequest);
                }
                onBuilt();
                return uHCFitParametersSetRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.freqPeriodStepGoal_ = 0;
                this.freqPeriodLenMins_ = 0;
                this.freqDelayLenMins_ = 0;
                this.freqDailyGoalCnt_ = 0;
                this.intenStepGoal_ = 0;
                this.intenActiveMinGoal_ = 0;
                this.tenacDailyStepGoal_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFreqDailyGoalCnt() {
                this.bitField0_ &= -9;
                this.freqDailyGoalCnt_ = 0;
                onChanged();
                return this;
            }

            public Builder clearFreqDelayLenMins() {
                this.bitField0_ &= -5;
                this.freqDelayLenMins_ = 0;
                onChanged();
                return this;
            }

            public Builder clearFreqPeriodLenMins() {
                this.bitField0_ &= -3;
                this.freqPeriodLenMins_ = 0;
                onChanged();
                return this;
            }

            public Builder clearFreqPeriodStepGoal() {
                this.bitField0_ &= -2;
                this.freqPeriodStepGoal_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIntenActiveMinGoal() {
                this.bitField0_ &= -33;
                this.intenActiveMinGoal_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIntenStepGoal() {
                this.bitField0_ &= -17;
                this.intenStepGoal_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearTenacDailyStepGoal() {
                this.bitField0_ &= -65;
                this.tenacDailyStepGoal_ = 0;
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
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCFitParametersSetRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
            public int getFreqDailyGoalCnt() {
                return this.freqDailyGoalCnt_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
            public int getFreqDelayLenMins() {
                return this.freqDelayLenMins_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
            public int getFreqPeriodLenMins() {
                return this.freqPeriodLenMins_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
            public int getFreqPeriodStepGoal() {
                return this.freqPeriodStepGoal_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
            public int getIntenActiveMinGoal() {
                return this.intenActiveMinGoal_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
            public int getIntenStepGoal() {
                return this.intenStepGoal_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
            public int getTenacDailyStepGoal() {
                return this.tenacDailyStepGoal_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
            public boolean hasFreqDailyGoalCnt() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
            public boolean hasFreqDelayLenMins() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
            public boolean hasFreqPeriodLenMins() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
            public boolean hasFreqPeriodStepGoal() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
            public boolean hasIntenActiveMinGoal() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
            public boolean hasIntenStepGoal() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetRequestOrBuilder
            public boolean hasTenacDailyStepGoal() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCFitParametersSetRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCFitParametersSetRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasFreqPeriodStepGoal() && hasFreqPeriodLenMins() && hasFreqDelayLenMins() && hasFreqDailyGoalCnt() && hasIntenStepGoal() && hasIntenActiveMinGoal() && hasTenacDailyStepGoal();
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
                                    this.freqPeriodStepGoal_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.freqPeriodLenMins_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.freqDelayLenMins_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.freqDailyGoalCnt_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.intenStepGoal_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    this.intenActiveMinGoal_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                } else if (tag == 56) {
                                    this.tenacDailyStepGoal_ = codedInputStream.readUInt32();
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

            public Builder setFreqDailyGoalCnt(int i14) {
                this.freqDailyGoalCnt_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setFreqDelayLenMins(int i14) {
                this.freqDelayLenMins_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setFreqPeriodLenMins(int i14) {
                this.freqPeriodLenMins_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setFreqPeriodStepGoal(int i14) {
                this.freqPeriodStepGoal_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setIntenActiveMinGoal(int i14) {
                this.intenActiveMinGoal_ = i14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setIntenStepGoal(int i14) {
                this.intenStepGoal_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTenacDailyStepGoal(int i14) {
                this.tenacDailyStepGoal_ = i14;
                this.bitField0_ |= 64;
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
            public UHCFitParametersSetRequest getDefaultInstanceForType() {
                return UHCFitParametersSetRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UHCFitParametersSetRequest) {
                    return mergeFrom((UHCFitParametersSetRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UHCFitParametersSetRequest uHCFitParametersSetRequest) {
                if (uHCFitParametersSetRequest == UHCFitParametersSetRequest.getDefaultInstance()) {
                    return this;
                }
                if (uHCFitParametersSetRequest.hasFreqPeriodStepGoal()) {
                    setFreqPeriodStepGoal(uHCFitParametersSetRequest.getFreqPeriodStepGoal());
                }
                if (uHCFitParametersSetRequest.hasFreqPeriodLenMins()) {
                    setFreqPeriodLenMins(uHCFitParametersSetRequest.getFreqPeriodLenMins());
                }
                if (uHCFitParametersSetRequest.hasFreqDelayLenMins()) {
                    setFreqDelayLenMins(uHCFitParametersSetRequest.getFreqDelayLenMins());
                }
                if (uHCFitParametersSetRequest.hasFreqDailyGoalCnt()) {
                    setFreqDailyGoalCnt(uHCFitParametersSetRequest.getFreqDailyGoalCnt());
                }
                if (uHCFitParametersSetRequest.hasIntenStepGoal()) {
                    setIntenStepGoal(uHCFitParametersSetRequest.getIntenStepGoal());
                }
                if (uHCFitParametersSetRequest.hasIntenActiveMinGoal()) {
                    setIntenActiveMinGoal(uHCFitParametersSetRequest.getIntenActiveMinGoal());
                }
                if (uHCFitParametersSetRequest.hasTenacDailyStepGoal()) {
                    setTenacDailyStepGoal(uHCFitParametersSetRequest.getTenacDailyStepGoal());
                }
                mergeUnknownFields(uHCFitParametersSetRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UHCFitParametersSetRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UHCFitParametersSetRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCFitParametersSetRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCFitParametersSetRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UHCFitParametersSetRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UHCFitParametersSetRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UHCFitParametersSetRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UHCFitParametersSetRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UHCFitParametersSetRequest parseFrom(InputStream inputStream) {
            return (UHCFitParametersSetRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UHCFitParametersSetRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCFitParametersSetRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCFitParametersSetRequest parseFrom(CodedInputStream codedInputStream) {
            return (UHCFitParametersSetRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UHCFitParametersSetRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCFitParametersSetRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ UHCFitParametersSetRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private UHCFitParametersSetRequest() {
            this.freqPeriodStepGoal_ = 0;
            this.freqPeriodLenMins_ = 0;
            this.freqDelayLenMins_ = 0;
            this.freqDailyGoalCnt_ = 0;
            this.intenStepGoal_ = 0;
            this.intenActiveMinGoal_ = 0;
            this.tenacDailyStepGoal_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    public static final class UHCTimeVarsSetRequest extends GeneratedMessageV3 implements UHCTimeVarsSetRequestOrBuilder {
        private static final UHCTimeVarsSetRequest DEFAULT_INSTANCE = new UHCTimeVarsSetRequest();

        @Deprecated
        public static final Parser<UHCTimeVarsSetRequest> PARSER = new AbstractParser<UHCTimeVarsSetRequest>() { // from class: com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetRequest.1
            @Override // com.google.protobuf.Parser
            public UHCTimeVarsSetRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UHCTimeVarsSetRequest.newBuilder();
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
        public static final int RTC_TIME_SEC_FIELD_NUMBER = 2;
        public static final int SET_TIME_FIELD_NUMBER = 1;
        public static final int TIMEZONE_OFFSET_FIELD_NUMBER = 4;
        public static final int TIME_TO_MIDNIGHT_SEC_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int rtcTimeSec_;
        private boolean setTime_;
        private int timeToMidnightSec_;
        private int timezoneOffset_;

        private UHCTimeVarsSetRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.setTime_ = false;
            this.rtcTimeSec_ = 0;
            this.timeToMidnightSec_ = 0;
            this.timezoneOffset_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UHCTimeVarsSetRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCTimeVarsSetRequest_descriptor;
        }

        public static Builder newBuilder(UHCTimeVarsSetRequest uHCTimeVarsSetRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(uHCTimeVarsSetRequest);
        }

        public static UHCTimeVarsSetRequest parseDelimitedFrom(InputStream inputStream) {
            return (UHCTimeVarsSetRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UHCTimeVarsSetRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UHCTimeVarsSetRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UHCTimeVarsSetRequest)) {
                return super.equals(obj);
            }
            UHCTimeVarsSetRequest uHCTimeVarsSetRequest = (UHCTimeVarsSetRequest) obj;
            if (hasSetTime() != uHCTimeVarsSetRequest.hasSetTime()) {
                return false;
            }
            if ((hasSetTime() && getSetTime() != uHCTimeVarsSetRequest.getSetTime()) || hasRtcTimeSec() != uHCTimeVarsSetRequest.hasRtcTimeSec()) {
                return false;
            }
            if ((hasRtcTimeSec() && getRtcTimeSec() != uHCTimeVarsSetRequest.getRtcTimeSec()) || hasTimeToMidnightSec() != uHCTimeVarsSetRequest.hasTimeToMidnightSec()) {
                return false;
            }
            if ((!hasTimeToMidnightSec() || getTimeToMidnightSec() == uHCTimeVarsSetRequest.getTimeToMidnightSec()) && hasTimezoneOffset() == uHCTimeVarsSetRequest.hasTimezoneOffset()) {
                return (!hasTimezoneOffset() || getTimezoneOffset() == uHCTimeVarsSetRequest.getTimezoneOffset()) && getUnknownFields().equals(uHCTimeVarsSetRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UHCTimeVarsSetRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetRequestOrBuilder
        public int getRtcTimeSec() {
            return this.rtcTimeSec_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.setTime_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt32Size(2, this.rtcTimeSec_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt32Size(3, this.timeToMidnightSec_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBoolSize += CodedOutputStream.computeInt32Size(4, this.timezoneOffset_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetRequestOrBuilder
        public boolean getSetTime() {
            return this.setTime_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetRequestOrBuilder
        public int getTimeToMidnightSec() {
            return this.timeToMidnightSec_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetRequestOrBuilder
        public int getTimezoneOffset() {
            return this.timezoneOffset_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetRequestOrBuilder
        public boolean hasRtcTimeSec() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetRequestOrBuilder
        public boolean hasSetTime() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetRequestOrBuilder
        public boolean hasTimeToMidnightSec() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetRequestOrBuilder
        public boolean hasTimezoneOffset() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSetTime()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getSetTime());
            }
            if (hasRtcTimeSec()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getRtcTimeSec();
            }
            if (hasTimeToMidnightSec()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getTimeToMidnightSec();
            }
            if (hasTimezoneOffset()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getTimezoneOffset();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCTimeVarsSetRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCTimeVarsSetRequest.class, Builder.class);
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
            if (hasSetTime()) {
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
            return new UHCTimeVarsSetRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.setTime_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.rtcTimeSec_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.timeToMidnightSec_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeInt32(4, this.timezoneOffset_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UHCTimeVarsSetRequestOrBuilder {
            private int bitField0_;
            private int rtcTimeSec_;
            private boolean setTime_;
            private int timeToMidnightSec_;
            private int timezoneOffset_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(UHCTimeVarsSetRequest uHCTimeVarsSetRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    uHCTimeVarsSetRequest.setTime_ = this.setTime_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    uHCTimeVarsSetRequest.rtcTimeSec_ = this.rtcTimeSec_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    uHCTimeVarsSetRequest.timeToMidnightSec_ = this.timeToMidnightSec_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    uHCTimeVarsSetRequest.timezoneOffset_ = this.timezoneOffset_;
                    i14 |= 8;
                }
                uHCTimeVarsSetRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCTimeVarsSetRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCTimeVarsSetRequest build() {
                UHCTimeVarsSetRequest uHCTimeVarsSetRequestBuildPartial = buildPartial();
                if (uHCTimeVarsSetRequestBuildPartial.isInitialized()) {
                    return uHCTimeVarsSetRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) uHCTimeVarsSetRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCTimeVarsSetRequest buildPartial() {
                UHCTimeVarsSetRequest uHCTimeVarsSetRequest = new UHCTimeVarsSetRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(uHCTimeVarsSetRequest);
                }
                onBuilt();
                return uHCTimeVarsSetRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.setTime_ = false;
                this.rtcTimeSec_ = 0;
                this.timeToMidnightSec_ = 0;
                this.timezoneOffset_ = 0;
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

            public Builder clearRtcTimeSec() {
                this.bitField0_ &= -3;
                this.rtcTimeSec_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSetTime() {
                this.bitField0_ &= -2;
                this.setTime_ = false;
                onChanged();
                return this;
            }

            public Builder clearTimeToMidnightSec() {
                this.bitField0_ &= -5;
                this.timeToMidnightSec_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTimezoneOffset() {
                this.bitField0_ &= -9;
                this.timezoneOffset_ = 0;
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
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCTimeVarsSetRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetRequestOrBuilder
            public int getRtcTimeSec() {
                return this.rtcTimeSec_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetRequestOrBuilder
            public boolean getSetTime() {
                return this.setTime_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetRequestOrBuilder
            public int getTimeToMidnightSec() {
                return this.timeToMidnightSec_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetRequestOrBuilder
            public int getTimezoneOffset() {
                return this.timezoneOffset_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetRequestOrBuilder
            public boolean hasRtcTimeSec() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetRequestOrBuilder
            public boolean hasSetTime() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetRequestOrBuilder
            public boolean hasTimeToMidnightSec() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetRequestOrBuilder
            public boolean hasTimezoneOffset() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCTimeVarsSetRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCTimeVarsSetRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSetTime();
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
                                    this.setTime_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.rtcTimeSec_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.timeToMidnightSec_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.timezoneOffset_ = codedInputStream.readInt32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setRtcTimeSec(int i14) {
                this.rtcTimeSec_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSetTime(boolean z14) {
                this.setTime_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTimeToMidnightSec(int i14) {
                this.timeToMidnightSec_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTimezoneOffset(int i14) {
                this.timezoneOffset_ = i14;
                this.bitField0_ |= 8;
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
            public UHCTimeVarsSetRequest getDefaultInstanceForType() {
                return UHCTimeVarsSetRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UHCTimeVarsSetRequest) {
                    return mergeFrom((UHCTimeVarsSetRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UHCTimeVarsSetRequest uHCTimeVarsSetRequest) {
                if (uHCTimeVarsSetRequest == UHCTimeVarsSetRequest.getDefaultInstance()) {
                    return this;
                }
                if (uHCTimeVarsSetRequest.hasSetTime()) {
                    setSetTime(uHCTimeVarsSetRequest.getSetTime());
                }
                if (uHCTimeVarsSetRequest.hasRtcTimeSec()) {
                    setRtcTimeSec(uHCTimeVarsSetRequest.getRtcTimeSec());
                }
                if (uHCTimeVarsSetRequest.hasTimeToMidnightSec()) {
                    setTimeToMidnightSec(uHCTimeVarsSetRequest.getTimeToMidnightSec());
                }
                if (uHCTimeVarsSetRequest.hasTimezoneOffset()) {
                    setTimezoneOffset(uHCTimeVarsSetRequest.getTimezoneOffset());
                }
                mergeUnknownFields(uHCTimeVarsSetRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UHCTimeVarsSetRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UHCTimeVarsSetRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCTimeVarsSetRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCTimeVarsSetRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UHCTimeVarsSetRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UHCTimeVarsSetRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UHCTimeVarsSetRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UHCTimeVarsSetRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UHCTimeVarsSetRequest parseFrom(InputStream inputStream) {
            return (UHCTimeVarsSetRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ UHCTimeVarsSetRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UHCTimeVarsSetRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCTimeVarsSetRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private UHCTimeVarsSetRequest() {
            this.setTime_ = false;
            this.rtcTimeSec_ = 0;
            this.timeToMidnightSec_ = 0;
            this.timezoneOffset_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UHCTimeVarsSetRequest parseFrom(CodedInputStream codedInputStream) {
            return (UHCTimeVarsSetRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UHCTimeVarsSetRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCTimeVarsSetRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class HSADataService extends GeneratedMessageV3 implements HSADataServiceOrBuilder {
        public static final int HSA_FEATURES_REQUEST_FIELD_NUMBER = 19;
        public static final int HSA_FEATURES_RESPONSE_FIELD_NUMBER = 20;
        public static final int HSA_FILE_XFER_NTFCTN_FIELD_NUMBER = 2;
        public static final int HSA_FILE_XFER_REQUEST_FIELD_NUMBER = 1;
        public static final int HSA_FIT_FILE_COMPRESSION_REQUEST_FIELD_NUMBER = 21;
        public static final int HSA_FIT_FILE_COMPRESSION_RESPONSE_FIELD_NUMBER = 22;
        public static final int HSA_FIT_LOG_CAPABILITIES_REQUEST_FIELD_NUMBER = 17;
        public static final int HSA_FIT_LOG_CAPABILITIES_RESPONSE_FIELD_NUMBER = 18;
        public static final int HSA_FIT_LOG_CONFIG_REQUEST_FIELD_NUMBER = 15;
        public static final int HSA_FIT_LOG_CONFIG_RESPONSE_FIELD_NUMBER = 16;
        public static final int HSA_GENERIC_REQUEST_FIELD_NUMBER = 23;
        public static final int HSA_GENERIC_RESPONSE_FIELD_NUMBER = 24;
        public static final int UHC_ACCEL_PARAMS_GET_REQUEST_FIELD_NUMBER = 5;
        public static final int UHC_ACCEL_PARAMS_GET_RESPONSE_FIELD_NUMBER = 6;
        public static final int UHC_ACCEL_PARAMS_SET_REQUEST_FIELD_NUMBER = 3;
        public static final int UHC_ACCEL_PARAMS_SET_RESPONSE_FIELD_NUMBER = 4;
        public static final int UHC_ACTIVATION_REQUEST_FIELD_NUMBER = 7;
        public static final int UHC_ACTIVATION_RESPONSE_FIELD_NUMBER = 8;
        public static final int UHC_FIT_PARAMETERS_GET_REQUEST_FIELD_NUMBER = 11;
        public static final int UHC_FIT_PARAMETERS_GET_RESPONSE_FIELD_NUMBER = 12;
        public static final int UHC_FIT_PARAMETERS_SET_REQUEST_FIELD_NUMBER = 9;
        public static final int UHC_FIT_PARAMETERS_SET_RESPONSE_FIELD_NUMBER = 10;
        public static final int UHC_TIME_VARS_SET_REQUEST_FIELD_NUMBER = 13;
        public static final int UHC_TIME_VARS_SET_RESPONSE_FIELD_NUMBER = 14;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private HSAFeaturesRequest hsaFeaturesRequest_;
        private HSAFeaturesResponse hsaFeaturesResponse_;
        private HSAFileXferNotification hsaFileXferNtfctn_;
        private HSAFileXferRequest hsaFileXferRequest_;
        private HSAFitFileCompressionRequest hsaFitFileCompressionRequest_;
        private HSAFitFileCompressionResponse hsaFitFileCompressionResponse_;
        private HSAFitLogCapabilitiesRequest hsaFitLogCapabilitiesRequest_;
        private HSAFitLogCapabilitiesResponse hsaFitLogCapabilitiesResponse_;
        private HSAFitLogConfigRequest hsaFitLogConfigRequest_;
        private HSAFitLogConfigResponse hsaFitLogConfigResponse_;
        private HSAGenericRequest hsaGenericRequest_;
        private HSAGenericResponse hsaGenericResponse_;
        private byte memoizedIsInitialized;
        private UHCAccelParametersGetRequest uhcAccelParamsGetRequest_;
        private UHCAccelParametersGetResponse uhcAccelParamsGetResponse_;
        private UHCAccelParametersSetRequest uhcAccelParamsSetRequest_;
        private UHCAccelParametersSetResponse uhcAccelParamsSetResponse_;
        private UHCActivationRequest uhcActivationRequest_;
        private UHCActivationResponse uhcActivationResponse_;
        private UHCFitParametersGetRequest uhcFitParametersGetRequest_;
        private UHCFitParametersGetResponse uhcFitParametersGetResponse_;
        private UHCFitParametersSetRequest uhcFitParametersSetRequest_;
        private UHCFitParametersSetResponse uhcFitParametersSetResponse_;
        private UHCTimeVarsSetRequest uhcTimeVarsSetRequest_;
        private UHCTimeVarsSetResponse uhcTimeVarsSetResponse_;
        private static final HSADataService DEFAULT_INSTANCE = new HSADataService();

        @Deprecated
        public static final Parser<HSADataService> PARSER = new AbstractParser<HSADataService>() { // from class: com.garmin.proto.generated.GDIHSAData.HSADataService.1
            @Override // com.google.protobuf.Parser
            public HSADataService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HSADataService.newBuilder();
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

        private HSADataService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HSADataService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSADataService_descriptor;
        }

        public static Builder newBuilder(HSADataService hSADataService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hSADataService);
        }

        public static HSADataService parseDelimitedFrom(InputStream inputStream) {
            return (HSADataService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HSADataService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HSADataService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HSADataService)) {
                return super.equals(obj);
            }
            HSADataService hSADataService = (HSADataService) obj;
            if (hasHsaFileXferRequest() != hSADataService.hasHsaFileXferRequest()) {
                return false;
            }
            if ((hasHsaFileXferRequest() && !getHsaFileXferRequest().equals(hSADataService.getHsaFileXferRequest())) || hasHsaFileXferNtfctn() != hSADataService.hasHsaFileXferNtfctn()) {
                return false;
            }
            if ((hasHsaFileXferNtfctn() && !getHsaFileXferNtfctn().equals(hSADataService.getHsaFileXferNtfctn())) || hasUhcAccelParamsSetRequest() != hSADataService.hasUhcAccelParamsSetRequest()) {
                return false;
            }
            if ((hasUhcAccelParamsSetRequest() && !getUhcAccelParamsSetRequest().equals(hSADataService.getUhcAccelParamsSetRequest())) || hasUhcAccelParamsSetResponse() != hSADataService.hasUhcAccelParamsSetResponse()) {
                return false;
            }
            if ((hasUhcAccelParamsSetResponse() && !getUhcAccelParamsSetResponse().equals(hSADataService.getUhcAccelParamsSetResponse())) || hasUhcAccelParamsGetRequest() != hSADataService.hasUhcAccelParamsGetRequest()) {
                return false;
            }
            if ((hasUhcAccelParamsGetRequest() && !getUhcAccelParamsGetRequest().equals(hSADataService.getUhcAccelParamsGetRequest())) || hasUhcAccelParamsGetResponse() != hSADataService.hasUhcAccelParamsGetResponse()) {
                return false;
            }
            if ((hasUhcAccelParamsGetResponse() && !getUhcAccelParamsGetResponse().equals(hSADataService.getUhcAccelParamsGetResponse())) || hasUhcActivationRequest() != hSADataService.hasUhcActivationRequest()) {
                return false;
            }
            if ((hasUhcActivationRequest() && !getUhcActivationRequest().equals(hSADataService.getUhcActivationRequest())) || hasUhcActivationResponse() != hSADataService.hasUhcActivationResponse()) {
                return false;
            }
            if ((hasUhcActivationResponse() && !getUhcActivationResponse().equals(hSADataService.getUhcActivationResponse())) || hasUhcFitParametersSetRequest() != hSADataService.hasUhcFitParametersSetRequest()) {
                return false;
            }
            if ((hasUhcFitParametersSetRequest() && !getUhcFitParametersSetRequest().equals(hSADataService.getUhcFitParametersSetRequest())) || hasUhcFitParametersSetResponse() != hSADataService.hasUhcFitParametersSetResponse()) {
                return false;
            }
            if ((hasUhcFitParametersSetResponse() && !getUhcFitParametersSetResponse().equals(hSADataService.getUhcFitParametersSetResponse())) || hasUhcFitParametersGetRequest() != hSADataService.hasUhcFitParametersGetRequest()) {
                return false;
            }
            if ((hasUhcFitParametersGetRequest() && !getUhcFitParametersGetRequest().equals(hSADataService.getUhcFitParametersGetRequest())) || hasUhcFitParametersGetResponse() != hSADataService.hasUhcFitParametersGetResponse()) {
                return false;
            }
            if ((hasUhcFitParametersGetResponse() && !getUhcFitParametersGetResponse().equals(hSADataService.getUhcFitParametersGetResponse())) || hasUhcTimeVarsSetRequest() != hSADataService.hasUhcTimeVarsSetRequest()) {
                return false;
            }
            if ((hasUhcTimeVarsSetRequest() && !getUhcTimeVarsSetRequest().equals(hSADataService.getUhcTimeVarsSetRequest())) || hasUhcTimeVarsSetResponse() != hSADataService.hasUhcTimeVarsSetResponse()) {
                return false;
            }
            if ((hasUhcTimeVarsSetResponse() && !getUhcTimeVarsSetResponse().equals(hSADataService.getUhcTimeVarsSetResponse())) || hasHsaFitLogConfigRequest() != hSADataService.hasHsaFitLogConfigRequest()) {
                return false;
            }
            if ((hasHsaFitLogConfigRequest() && !getHsaFitLogConfigRequest().equals(hSADataService.getHsaFitLogConfigRequest())) || hasHsaFitLogConfigResponse() != hSADataService.hasHsaFitLogConfigResponse()) {
                return false;
            }
            if ((hasHsaFitLogConfigResponse() && !getHsaFitLogConfigResponse().equals(hSADataService.getHsaFitLogConfigResponse())) || hasHsaFitLogCapabilitiesRequest() != hSADataService.hasHsaFitLogCapabilitiesRequest()) {
                return false;
            }
            if ((hasHsaFitLogCapabilitiesRequest() && !getHsaFitLogCapabilitiesRequest().equals(hSADataService.getHsaFitLogCapabilitiesRequest())) || hasHsaFitLogCapabilitiesResponse() != hSADataService.hasHsaFitLogCapabilitiesResponse()) {
                return false;
            }
            if ((hasHsaFitLogCapabilitiesResponse() && !getHsaFitLogCapabilitiesResponse().equals(hSADataService.getHsaFitLogCapabilitiesResponse())) || hasHsaFeaturesRequest() != hSADataService.hasHsaFeaturesRequest()) {
                return false;
            }
            if ((hasHsaFeaturesRequest() && !getHsaFeaturesRequest().equals(hSADataService.getHsaFeaturesRequest())) || hasHsaFeaturesResponse() != hSADataService.hasHsaFeaturesResponse()) {
                return false;
            }
            if ((hasHsaFeaturesResponse() && !getHsaFeaturesResponse().equals(hSADataService.getHsaFeaturesResponse())) || hasHsaFitFileCompressionRequest() != hSADataService.hasHsaFitFileCompressionRequest()) {
                return false;
            }
            if ((hasHsaFitFileCompressionRequest() && !getHsaFitFileCompressionRequest().equals(hSADataService.getHsaFitFileCompressionRequest())) || hasHsaFitFileCompressionResponse() != hSADataService.hasHsaFitFileCompressionResponse()) {
                return false;
            }
            if ((hasHsaFitFileCompressionResponse() && !getHsaFitFileCompressionResponse().equals(hSADataService.getHsaFitFileCompressionResponse())) || hasHsaGenericRequest() != hSADataService.hasHsaGenericRequest()) {
                return false;
            }
            if ((!hasHsaGenericRequest() || getHsaGenericRequest().equals(hSADataService.getHsaGenericRequest())) && hasHsaGenericResponse() == hSADataService.hasHsaGenericResponse()) {
                return (!hasHsaGenericResponse() || getHsaGenericResponse().equals(hSADataService.getHsaGenericResponse())) && getUnknownFields().equals(hSADataService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAFeaturesRequest getHsaFeaturesRequest() {
            HSAFeaturesRequest hSAFeaturesRequest = this.hsaFeaturesRequest_;
            return hSAFeaturesRequest == null ? HSAFeaturesRequest.getDefaultInstance() : hSAFeaturesRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAFeaturesRequestOrBuilder getHsaFeaturesRequestOrBuilder() {
            HSAFeaturesRequest hSAFeaturesRequest = this.hsaFeaturesRequest_;
            return hSAFeaturesRequest == null ? HSAFeaturesRequest.getDefaultInstance() : hSAFeaturesRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAFeaturesResponse getHsaFeaturesResponse() {
            HSAFeaturesResponse hSAFeaturesResponse = this.hsaFeaturesResponse_;
            return hSAFeaturesResponse == null ? HSAFeaturesResponse.getDefaultInstance() : hSAFeaturesResponse;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAFeaturesResponseOrBuilder getHsaFeaturesResponseOrBuilder() {
            HSAFeaturesResponse hSAFeaturesResponse = this.hsaFeaturesResponse_;
            return hSAFeaturesResponse == null ? HSAFeaturesResponse.getDefaultInstance() : hSAFeaturesResponse;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAFileXferNotification getHsaFileXferNtfctn() {
            HSAFileXferNotification hSAFileXferNotification = this.hsaFileXferNtfctn_;
            return hSAFileXferNotification == null ? HSAFileXferNotification.getDefaultInstance() : hSAFileXferNotification;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAFileXferNotificationOrBuilder getHsaFileXferNtfctnOrBuilder() {
            HSAFileXferNotification hSAFileXferNotification = this.hsaFileXferNtfctn_;
            return hSAFileXferNotification == null ? HSAFileXferNotification.getDefaultInstance() : hSAFileXferNotification;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAFileXferRequest getHsaFileXferRequest() {
            HSAFileXferRequest hSAFileXferRequest = this.hsaFileXferRequest_;
            return hSAFileXferRequest == null ? HSAFileXferRequest.getDefaultInstance() : hSAFileXferRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAFileXferRequestOrBuilder getHsaFileXferRequestOrBuilder() {
            HSAFileXferRequest hSAFileXferRequest = this.hsaFileXferRequest_;
            return hSAFileXferRequest == null ? HSAFileXferRequest.getDefaultInstance() : hSAFileXferRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAFitFileCompressionRequest getHsaFitFileCompressionRequest() {
            HSAFitFileCompressionRequest hSAFitFileCompressionRequest = this.hsaFitFileCompressionRequest_;
            return hSAFitFileCompressionRequest == null ? HSAFitFileCompressionRequest.getDefaultInstance() : hSAFitFileCompressionRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAFitFileCompressionRequestOrBuilder getHsaFitFileCompressionRequestOrBuilder() {
            HSAFitFileCompressionRequest hSAFitFileCompressionRequest = this.hsaFitFileCompressionRequest_;
            return hSAFitFileCompressionRequest == null ? HSAFitFileCompressionRequest.getDefaultInstance() : hSAFitFileCompressionRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAFitFileCompressionResponse getHsaFitFileCompressionResponse() {
            HSAFitFileCompressionResponse hSAFitFileCompressionResponse = this.hsaFitFileCompressionResponse_;
            return hSAFitFileCompressionResponse == null ? HSAFitFileCompressionResponse.getDefaultInstance() : hSAFitFileCompressionResponse;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAFitFileCompressionResponseOrBuilder getHsaFitFileCompressionResponseOrBuilder() {
            HSAFitFileCompressionResponse hSAFitFileCompressionResponse = this.hsaFitFileCompressionResponse_;
            return hSAFitFileCompressionResponse == null ? HSAFitFileCompressionResponse.getDefaultInstance() : hSAFitFileCompressionResponse;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAFitLogCapabilitiesRequest getHsaFitLogCapabilitiesRequest() {
            HSAFitLogCapabilitiesRequest hSAFitLogCapabilitiesRequest = this.hsaFitLogCapabilitiesRequest_;
            return hSAFitLogCapabilitiesRequest == null ? HSAFitLogCapabilitiesRequest.getDefaultInstance() : hSAFitLogCapabilitiesRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAFitLogCapabilitiesRequestOrBuilder getHsaFitLogCapabilitiesRequestOrBuilder() {
            HSAFitLogCapabilitiesRequest hSAFitLogCapabilitiesRequest = this.hsaFitLogCapabilitiesRequest_;
            return hSAFitLogCapabilitiesRequest == null ? HSAFitLogCapabilitiesRequest.getDefaultInstance() : hSAFitLogCapabilitiesRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAFitLogCapabilitiesResponse getHsaFitLogCapabilitiesResponse() {
            HSAFitLogCapabilitiesResponse hSAFitLogCapabilitiesResponse = this.hsaFitLogCapabilitiesResponse_;
            return hSAFitLogCapabilitiesResponse == null ? HSAFitLogCapabilitiesResponse.getDefaultInstance() : hSAFitLogCapabilitiesResponse;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAFitLogCapabilitiesResponseOrBuilder getHsaFitLogCapabilitiesResponseOrBuilder() {
            HSAFitLogCapabilitiesResponse hSAFitLogCapabilitiesResponse = this.hsaFitLogCapabilitiesResponse_;
            return hSAFitLogCapabilitiesResponse == null ? HSAFitLogCapabilitiesResponse.getDefaultInstance() : hSAFitLogCapabilitiesResponse;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAFitLogConfigRequest getHsaFitLogConfigRequest() {
            HSAFitLogConfigRequest hSAFitLogConfigRequest = this.hsaFitLogConfigRequest_;
            return hSAFitLogConfigRequest == null ? HSAFitLogConfigRequest.getDefaultInstance() : hSAFitLogConfigRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAFitLogConfigRequestOrBuilder getHsaFitLogConfigRequestOrBuilder() {
            HSAFitLogConfigRequest hSAFitLogConfigRequest = this.hsaFitLogConfigRequest_;
            return hSAFitLogConfigRequest == null ? HSAFitLogConfigRequest.getDefaultInstance() : hSAFitLogConfigRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAFitLogConfigResponse getHsaFitLogConfigResponse() {
            HSAFitLogConfigResponse hSAFitLogConfigResponse = this.hsaFitLogConfigResponse_;
            return hSAFitLogConfigResponse == null ? HSAFitLogConfigResponse.getDefaultInstance() : hSAFitLogConfigResponse;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAFitLogConfigResponseOrBuilder getHsaFitLogConfigResponseOrBuilder() {
            HSAFitLogConfigResponse hSAFitLogConfigResponse = this.hsaFitLogConfigResponse_;
            return hSAFitLogConfigResponse == null ? HSAFitLogConfigResponse.getDefaultInstance() : hSAFitLogConfigResponse;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAGenericRequest getHsaGenericRequest() {
            HSAGenericRequest hSAGenericRequest = this.hsaGenericRequest_;
            return hSAGenericRequest == null ? HSAGenericRequest.getDefaultInstance() : hSAGenericRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAGenericRequestOrBuilder getHsaGenericRequestOrBuilder() {
            HSAGenericRequest hSAGenericRequest = this.hsaGenericRequest_;
            return hSAGenericRequest == null ? HSAGenericRequest.getDefaultInstance() : hSAGenericRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAGenericResponse getHsaGenericResponse() {
            HSAGenericResponse hSAGenericResponse = this.hsaGenericResponse_;
            return hSAGenericResponse == null ? HSAGenericResponse.getDefaultInstance() : hSAGenericResponse;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public HSAGenericResponseOrBuilder getHsaGenericResponseOrBuilder() {
            HSAGenericResponse hSAGenericResponse = this.hsaGenericResponse_;
            return hSAGenericResponse == null ? HSAGenericResponse.getDefaultInstance() : hSAGenericResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HSADataService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getHsaFileXferRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getHsaFileXferNtfctn());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getUhcAccelParamsSetRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getUhcAccelParamsSetResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getUhcAccelParamsGetRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getUhcAccelParamsGetResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getUhcActivationRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getUhcActivationResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getUhcFitParametersSetRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getUhcFitParametersSetResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getUhcFitParametersGetRequest());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getUhcFitParametersGetResponse());
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, getUhcTimeVarsSetRequest());
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(14, getUhcTimeVarsSetResponse());
            }
            if ((this.bitField0_ & 16384) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(15, getHsaFitLogConfigRequest());
            }
            if ((this.bitField0_ & 32768) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(16, getHsaFitLogConfigResponse());
            }
            if ((this.bitField0_ & 65536) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(17, getHsaFitLogCapabilitiesRequest());
            }
            if ((this.bitField0_ & 131072) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(18, getHsaFitLogCapabilitiesResponse());
            }
            if ((this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(19, getHsaFeaturesRequest());
            }
            if ((this.bitField0_ & 524288) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(20, getHsaFeaturesResponse());
            }
            if ((this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(21, getHsaFitFileCompressionRequest());
            }
            if ((this.bitField0_ & 2097152) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(22, getHsaFitFileCompressionResponse());
            }
            if ((this.bitField0_ & 4194304) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(23, getHsaGenericRequest());
            }
            if ((this.bitField0_ & 8388608) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(24, getHsaGenericResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCAccelParametersGetRequest getUhcAccelParamsGetRequest() {
            UHCAccelParametersGetRequest uHCAccelParametersGetRequest = this.uhcAccelParamsGetRequest_;
            return uHCAccelParametersGetRequest == null ? UHCAccelParametersGetRequest.getDefaultInstance() : uHCAccelParametersGetRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCAccelParametersGetRequestOrBuilder getUhcAccelParamsGetRequestOrBuilder() {
            UHCAccelParametersGetRequest uHCAccelParametersGetRequest = this.uhcAccelParamsGetRequest_;
            return uHCAccelParametersGetRequest == null ? UHCAccelParametersGetRequest.getDefaultInstance() : uHCAccelParametersGetRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCAccelParametersGetResponse getUhcAccelParamsGetResponse() {
            UHCAccelParametersGetResponse uHCAccelParametersGetResponse = this.uhcAccelParamsGetResponse_;
            return uHCAccelParametersGetResponse == null ? UHCAccelParametersGetResponse.getDefaultInstance() : uHCAccelParametersGetResponse;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCAccelParametersGetResponseOrBuilder getUhcAccelParamsGetResponseOrBuilder() {
            UHCAccelParametersGetResponse uHCAccelParametersGetResponse = this.uhcAccelParamsGetResponse_;
            return uHCAccelParametersGetResponse == null ? UHCAccelParametersGetResponse.getDefaultInstance() : uHCAccelParametersGetResponse;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCAccelParametersSetRequest getUhcAccelParamsSetRequest() {
            UHCAccelParametersSetRequest uHCAccelParametersSetRequest = this.uhcAccelParamsSetRequest_;
            return uHCAccelParametersSetRequest == null ? UHCAccelParametersSetRequest.getDefaultInstance() : uHCAccelParametersSetRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCAccelParametersSetRequestOrBuilder getUhcAccelParamsSetRequestOrBuilder() {
            UHCAccelParametersSetRequest uHCAccelParametersSetRequest = this.uhcAccelParamsSetRequest_;
            return uHCAccelParametersSetRequest == null ? UHCAccelParametersSetRequest.getDefaultInstance() : uHCAccelParametersSetRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCAccelParametersSetResponse getUhcAccelParamsSetResponse() {
            UHCAccelParametersSetResponse uHCAccelParametersSetResponse = this.uhcAccelParamsSetResponse_;
            return uHCAccelParametersSetResponse == null ? UHCAccelParametersSetResponse.getDefaultInstance() : uHCAccelParametersSetResponse;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCAccelParametersSetResponseOrBuilder getUhcAccelParamsSetResponseOrBuilder() {
            UHCAccelParametersSetResponse uHCAccelParametersSetResponse = this.uhcAccelParamsSetResponse_;
            return uHCAccelParametersSetResponse == null ? UHCAccelParametersSetResponse.getDefaultInstance() : uHCAccelParametersSetResponse;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCActivationRequest getUhcActivationRequest() {
            UHCActivationRequest uHCActivationRequest = this.uhcActivationRequest_;
            return uHCActivationRequest == null ? UHCActivationRequest.getDefaultInstance() : uHCActivationRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCActivationRequestOrBuilder getUhcActivationRequestOrBuilder() {
            UHCActivationRequest uHCActivationRequest = this.uhcActivationRequest_;
            return uHCActivationRequest == null ? UHCActivationRequest.getDefaultInstance() : uHCActivationRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCActivationResponse getUhcActivationResponse() {
            UHCActivationResponse uHCActivationResponse = this.uhcActivationResponse_;
            return uHCActivationResponse == null ? UHCActivationResponse.getDefaultInstance() : uHCActivationResponse;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCActivationResponseOrBuilder getUhcActivationResponseOrBuilder() {
            UHCActivationResponse uHCActivationResponse = this.uhcActivationResponse_;
            return uHCActivationResponse == null ? UHCActivationResponse.getDefaultInstance() : uHCActivationResponse;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCFitParametersGetRequest getUhcFitParametersGetRequest() {
            UHCFitParametersGetRequest uHCFitParametersGetRequest = this.uhcFitParametersGetRequest_;
            return uHCFitParametersGetRequest == null ? UHCFitParametersGetRequest.getDefaultInstance() : uHCFitParametersGetRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCFitParametersGetRequestOrBuilder getUhcFitParametersGetRequestOrBuilder() {
            UHCFitParametersGetRequest uHCFitParametersGetRequest = this.uhcFitParametersGetRequest_;
            return uHCFitParametersGetRequest == null ? UHCFitParametersGetRequest.getDefaultInstance() : uHCFitParametersGetRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCFitParametersGetResponse getUhcFitParametersGetResponse() {
            UHCFitParametersGetResponse uHCFitParametersGetResponse = this.uhcFitParametersGetResponse_;
            return uHCFitParametersGetResponse == null ? UHCFitParametersGetResponse.getDefaultInstance() : uHCFitParametersGetResponse;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCFitParametersGetResponseOrBuilder getUhcFitParametersGetResponseOrBuilder() {
            UHCFitParametersGetResponse uHCFitParametersGetResponse = this.uhcFitParametersGetResponse_;
            return uHCFitParametersGetResponse == null ? UHCFitParametersGetResponse.getDefaultInstance() : uHCFitParametersGetResponse;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCFitParametersSetRequest getUhcFitParametersSetRequest() {
            UHCFitParametersSetRequest uHCFitParametersSetRequest = this.uhcFitParametersSetRequest_;
            return uHCFitParametersSetRequest == null ? UHCFitParametersSetRequest.getDefaultInstance() : uHCFitParametersSetRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCFitParametersSetRequestOrBuilder getUhcFitParametersSetRequestOrBuilder() {
            UHCFitParametersSetRequest uHCFitParametersSetRequest = this.uhcFitParametersSetRequest_;
            return uHCFitParametersSetRequest == null ? UHCFitParametersSetRequest.getDefaultInstance() : uHCFitParametersSetRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCFitParametersSetResponse getUhcFitParametersSetResponse() {
            UHCFitParametersSetResponse uHCFitParametersSetResponse = this.uhcFitParametersSetResponse_;
            return uHCFitParametersSetResponse == null ? UHCFitParametersSetResponse.getDefaultInstance() : uHCFitParametersSetResponse;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCFitParametersSetResponseOrBuilder getUhcFitParametersSetResponseOrBuilder() {
            UHCFitParametersSetResponse uHCFitParametersSetResponse = this.uhcFitParametersSetResponse_;
            return uHCFitParametersSetResponse == null ? UHCFitParametersSetResponse.getDefaultInstance() : uHCFitParametersSetResponse;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCTimeVarsSetRequest getUhcTimeVarsSetRequest() {
            UHCTimeVarsSetRequest uHCTimeVarsSetRequest = this.uhcTimeVarsSetRequest_;
            return uHCTimeVarsSetRequest == null ? UHCTimeVarsSetRequest.getDefaultInstance() : uHCTimeVarsSetRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCTimeVarsSetRequestOrBuilder getUhcTimeVarsSetRequestOrBuilder() {
            UHCTimeVarsSetRequest uHCTimeVarsSetRequest = this.uhcTimeVarsSetRequest_;
            return uHCTimeVarsSetRequest == null ? UHCTimeVarsSetRequest.getDefaultInstance() : uHCTimeVarsSetRequest;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCTimeVarsSetResponse getUhcTimeVarsSetResponse() {
            UHCTimeVarsSetResponse uHCTimeVarsSetResponse = this.uhcTimeVarsSetResponse_;
            return uHCTimeVarsSetResponse == null ? UHCTimeVarsSetResponse.getDefaultInstance() : uHCTimeVarsSetResponse;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public UHCTimeVarsSetResponseOrBuilder getUhcTimeVarsSetResponseOrBuilder() {
            UHCTimeVarsSetResponse uHCTimeVarsSetResponse = this.uhcTimeVarsSetResponse_;
            return uHCTimeVarsSetResponse == null ? UHCTimeVarsSetResponse.getDefaultInstance() : uHCTimeVarsSetResponse;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasHsaFeaturesRequest() {
            return (this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasHsaFeaturesResponse() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasHsaFileXferNtfctn() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasHsaFileXferRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasHsaFitFileCompressionRequest() {
            return (this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasHsaFitFileCompressionResponse() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasHsaFitLogCapabilitiesRequest() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasHsaFitLogCapabilitiesResponse() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasHsaFitLogConfigRequest() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasHsaFitLogConfigResponse() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasHsaGenericRequest() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasHsaGenericResponse() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasUhcAccelParamsGetRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasUhcAccelParamsGetResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasUhcAccelParamsSetRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasUhcAccelParamsSetResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasUhcActivationRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasUhcActivationResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasUhcFitParametersGetRequest() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasUhcFitParametersGetResponse() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasUhcFitParametersSetRequest() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasUhcFitParametersSetResponse() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasUhcTimeVarsSetRequest() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
        public boolean hasUhcTimeVarsSetResponse() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasHsaFileXferRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getHsaFileXferRequest().hashCode();
            }
            if (hasHsaFileXferNtfctn()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getHsaFileXferNtfctn().hashCode();
            }
            if (hasUhcAccelParamsSetRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getUhcAccelParamsSetRequest().hashCode();
            }
            if (hasUhcAccelParamsSetResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getUhcAccelParamsSetResponse().hashCode();
            }
            if (hasUhcAccelParamsGetRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getUhcAccelParamsGetRequest().hashCode();
            }
            if (hasUhcAccelParamsGetResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getUhcAccelParamsGetResponse().hashCode();
            }
            if (hasUhcActivationRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getUhcActivationRequest().hashCode();
            }
            if (hasUhcActivationResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getUhcActivationResponse().hashCode();
            }
            if (hasUhcFitParametersSetRequest()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getUhcFitParametersSetRequest().hashCode();
            }
            if (hasUhcFitParametersSetResponse()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getUhcFitParametersSetResponse().hashCode();
            }
            if (hasUhcFitParametersGetRequest()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getUhcFitParametersGetRequest().hashCode();
            }
            if (hasUhcFitParametersGetResponse()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getUhcFitParametersGetResponse().hashCode();
            }
            if (hasUhcTimeVarsSetRequest()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getUhcTimeVarsSetRequest().hashCode();
            }
            if (hasUhcTimeVarsSetResponse()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + getUhcTimeVarsSetResponse().hashCode();
            }
            if (hasHsaFitLogConfigRequest()) {
                iHashCode = e5.c(iHashCode, 37, 15, 53) + getHsaFitLogConfigRequest().hashCode();
            }
            if (hasHsaFitLogConfigResponse()) {
                iHashCode = e5.c(iHashCode, 37, 16, 53) + getHsaFitLogConfigResponse().hashCode();
            }
            if (hasHsaFitLogCapabilitiesRequest()) {
                iHashCode = e5.c(iHashCode, 37, 17, 53) + getHsaFitLogCapabilitiesRequest().hashCode();
            }
            if (hasHsaFitLogCapabilitiesResponse()) {
                iHashCode = e5.c(iHashCode, 37, 18, 53) + getHsaFitLogCapabilitiesResponse().hashCode();
            }
            if (hasHsaFeaturesRequest()) {
                iHashCode = e5.c(iHashCode, 37, 19, 53) + getHsaFeaturesRequest().hashCode();
            }
            if (hasHsaFeaturesResponse()) {
                iHashCode = e5.c(iHashCode, 37, 20, 53) + getHsaFeaturesResponse().hashCode();
            }
            if (hasHsaFitFileCompressionRequest()) {
                iHashCode = e5.c(iHashCode, 37, 21, 53) + getHsaFitFileCompressionRequest().hashCode();
            }
            if (hasHsaFitFileCompressionResponse()) {
                iHashCode = e5.c(iHashCode, 37, 22, 53) + getHsaFitFileCompressionResponse().hashCode();
            }
            if (hasHsaGenericRequest()) {
                iHashCode = e5.c(iHashCode, 37, 23, 53) + getHsaGenericRequest().hashCode();
            }
            if (hasHsaGenericResponse()) {
                iHashCode = e5.c(iHashCode, 37, 24, 53) + getHsaGenericResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSADataService_fieldAccessorTable.ensureFieldAccessorsInitialized(HSADataService.class, Builder.class);
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
            if (hasHsaFileXferRequest() && !getHsaFileXferRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasHsaFileXferNtfctn() && !getHsaFileXferNtfctn().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUhcAccelParamsSetRequest() && !getUhcAccelParamsSetRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUhcAccelParamsSetResponse() && !getUhcAccelParamsSetResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUhcAccelParamsGetRequest() && !getUhcAccelParamsGetRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUhcAccelParamsGetResponse() && !getUhcAccelParamsGetResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUhcActivationRequest() && !getUhcActivationRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUhcActivationResponse() && !getUhcActivationResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUhcFitParametersSetRequest() && !getUhcFitParametersSetRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUhcFitParametersSetResponse() && !getUhcFitParametersSetResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUhcFitParametersGetRequest() && !getUhcFitParametersGetRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUhcFitParametersGetResponse() && !getUhcFitParametersGetResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUhcTimeVarsSetRequest() && !getUhcTimeVarsSetRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUhcTimeVarsSetResponse() && !getUhcTimeVarsSetResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasHsaFitLogConfigRequest() && !getHsaFitLogConfigRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasHsaFitLogConfigResponse() && !getHsaFitLogConfigResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasHsaFitLogCapabilitiesResponse() && !getHsaFitLogCapabilitiesResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasHsaFeaturesResponse() && !getHsaFeaturesResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasHsaFitFileCompressionResponse() || getHsaFitFileCompressionResponse().isInitialized()) {
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
            return new HSADataService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getHsaFileXferRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getHsaFileXferNtfctn());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getUhcAccelParamsSetRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getUhcAccelParamsSetResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getUhcAccelParamsGetRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getUhcAccelParamsGetResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getUhcActivationRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getUhcActivationResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getUhcFitParametersSetRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getUhcFitParametersSetResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getUhcFitParametersGetRequest());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(12, getUhcFitParametersGetResponse());
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeMessage(13, getUhcTimeVarsSetRequest());
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeMessage(14, getUhcTimeVarsSetResponse());
            }
            if ((this.bitField0_ & 16384) != 0) {
                codedOutputStream.writeMessage(15, getHsaFitLogConfigRequest());
            }
            if ((this.bitField0_ & 32768) != 0) {
                codedOutputStream.writeMessage(16, getHsaFitLogConfigResponse());
            }
            if ((this.bitField0_ & 65536) != 0) {
                codedOutputStream.writeMessage(17, getHsaFitLogCapabilitiesRequest());
            }
            if ((this.bitField0_ & 131072) != 0) {
                codedOutputStream.writeMessage(18, getHsaFitLogCapabilitiesResponse());
            }
            if ((this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                codedOutputStream.writeMessage(19, getHsaFeaturesRequest());
            }
            if ((this.bitField0_ & 524288) != 0) {
                codedOutputStream.writeMessage(20, getHsaFeaturesResponse());
            }
            if ((this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                codedOutputStream.writeMessage(21, getHsaFitFileCompressionRequest());
            }
            if ((this.bitField0_ & 2097152) != 0) {
                codedOutputStream.writeMessage(22, getHsaFitFileCompressionResponse());
            }
            if ((this.bitField0_ & 4194304) != 0) {
                codedOutputStream.writeMessage(23, getHsaGenericRequest());
            }
            if ((this.bitField0_ & 8388608) != 0) {
                codedOutputStream.writeMessage(24, getHsaGenericResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HSADataServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<HSAFeaturesRequest, HSAFeaturesRequest.Builder, HSAFeaturesRequestOrBuilder> hsaFeaturesRequestBuilder_;
            private HSAFeaturesRequest hsaFeaturesRequest_;
            private SingleFieldBuilderV3<HSAFeaturesResponse, HSAFeaturesResponse.Builder, HSAFeaturesResponseOrBuilder> hsaFeaturesResponseBuilder_;
            private HSAFeaturesResponse hsaFeaturesResponse_;
            private SingleFieldBuilderV3<HSAFileXferNotification, HSAFileXferNotification.Builder, HSAFileXferNotificationOrBuilder> hsaFileXferNtfctnBuilder_;
            private HSAFileXferNotification hsaFileXferNtfctn_;
            private SingleFieldBuilderV3<HSAFileXferRequest, HSAFileXferRequest.Builder, HSAFileXferRequestOrBuilder> hsaFileXferRequestBuilder_;
            private HSAFileXferRequest hsaFileXferRequest_;
            private SingleFieldBuilderV3<HSAFitFileCompressionRequest, HSAFitFileCompressionRequest.Builder, HSAFitFileCompressionRequestOrBuilder> hsaFitFileCompressionRequestBuilder_;
            private HSAFitFileCompressionRequest hsaFitFileCompressionRequest_;
            private SingleFieldBuilderV3<HSAFitFileCompressionResponse, HSAFitFileCompressionResponse.Builder, HSAFitFileCompressionResponseOrBuilder> hsaFitFileCompressionResponseBuilder_;
            private HSAFitFileCompressionResponse hsaFitFileCompressionResponse_;
            private SingleFieldBuilderV3<HSAFitLogCapabilitiesRequest, HSAFitLogCapabilitiesRequest.Builder, HSAFitLogCapabilitiesRequestOrBuilder> hsaFitLogCapabilitiesRequestBuilder_;
            private HSAFitLogCapabilitiesRequest hsaFitLogCapabilitiesRequest_;
            private SingleFieldBuilderV3<HSAFitLogCapabilitiesResponse, HSAFitLogCapabilitiesResponse.Builder, HSAFitLogCapabilitiesResponseOrBuilder> hsaFitLogCapabilitiesResponseBuilder_;
            private HSAFitLogCapabilitiesResponse hsaFitLogCapabilitiesResponse_;
            private SingleFieldBuilderV3<HSAFitLogConfigRequest, HSAFitLogConfigRequest.Builder, HSAFitLogConfigRequestOrBuilder> hsaFitLogConfigRequestBuilder_;
            private HSAFitLogConfigRequest hsaFitLogConfigRequest_;
            private SingleFieldBuilderV3<HSAFitLogConfigResponse, HSAFitLogConfigResponse.Builder, HSAFitLogConfigResponseOrBuilder> hsaFitLogConfigResponseBuilder_;
            private HSAFitLogConfigResponse hsaFitLogConfigResponse_;
            private SingleFieldBuilderV3<HSAGenericRequest, HSAGenericRequest.Builder, HSAGenericRequestOrBuilder> hsaGenericRequestBuilder_;
            private HSAGenericRequest hsaGenericRequest_;
            private SingleFieldBuilderV3<HSAGenericResponse, HSAGenericResponse.Builder, HSAGenericResponseOrBuilder> hsaGenericResponseBuilder_;
            private HSAGenericResponse hsaGenericResponse_;
            private SingleFieldBuilderV3<UHCAccelParametersGetRequest, UHCAccelParametersGetRequest.Builder, UHCAccelParametersGetRequestOrBuilder> uhcAccelParamsGetRequestBuilder_;
            private UHCAccelParametersGetRequest uhcAccelParamsGetRequest_;
            private SingleFieldBuilderV3<UHCAccelParametersGetResponse, UHCAccelParametersGetResponse.Builder, UHCAccelParametersGetResponseOrBuilder> uhcAccelParamsGetResponseBuilder_;
            private UHCAccelParametersGetResponse uhcAccelParamsGetResponse_;
            private SingleFieldBuilderV3<UHCAccelParametersSetRequest, UHCAccelParametersSetRequest.Builder, UHCAccelParametersSetRequestOrBuilder> uhcAccelParamsSetRequestBuilder_;
            private UHCAccelParametersSetRequest uhcAccelParamsSetRequest_;
            private SingleFieldBuilderV3<UHCAccelParametersSetResponse, UHCAccelParametersSetResponse.Builder, UHCAccelParametersSetResponseOrBuilder> uhcAccelParamsSetResponseBuilder_;
            private UHCAccelParametersSetResponse uhcAccelParamsSetResponse_;
            private SingleFieldBuilderV3<UHCActivationRequest, UHCActivationRequest.Builder, UHCActivationRequestOrBuilder> uhcActivationRequestBuilder_;
            private UHCActivationRequest uhcActivationRequest_;
            private SingleFieldBuilderV3<UHCActivationResponse, UHCActivationResponse.Builder, UHCActivationResponseOrBuilder> uhcActivationResponseBuilder_;
            private UHCActivationResponse uhcActivationResponse_;
            private SingleFieldBuilderV3<UHCFitParametersGetRequest, UHCFitParametersGetRequest.Builder, UHCFitParametersGetRequestOrBuilder> uhcFitParametersGetRequestBuilder_;
            private UHCFitParametersGetRequest uhcFitParametersGetRequest_;
            private SingleFieldBuilderV3<UHCFitParametersGetResponse, UHCFitParametersGetResponse.Builder, UHCFitParametersGetResponseOrBuilder> uhcFitParametersGetResponseBuilder_;
            private UHCFitParametersGetResponse uhcFitParametersGetResponse_;
            private SingleFieldBuilderV3<UHCFitParametersSetRequest, UHCFitParametersSetRequest.Builder, UHCFitParametersSetRequestOrBuilder> uhcFitParametersSetRequestBuilder_;
            private UHCFitParametersSetRequest uhcFitParametersSetRequest_;
            private SingleFieldBuilderV3<UHCFitParametersSetResponse, UHCFitParametersSetResponse.Builder, UHCFitParametersSetResponseOrBuilder> uhcFitParametersSetResponseBuilder_;
            private UHCFitParametersSetResponse uhcFitParametersSetResponse_;
            private SingleFieldBuilderV3<UHCTimeVarsSetRequest, UHCTimeVarsSetRequest.Builder, UHCTimeVarsSetRequestOrBuilder> uhcTimeVarsSetRequestBuilder_;
            private UHCTimeVarsSetRequest uhcTimeVarsSetRequest_;
            private SingleFieldBuilderV3<UHCTimeVarsSetResponse, UHCTimeVarsSetResponse.Builder, UHCTimeVarsSetResponseOrBuilder> uhcTimeVarsSetResponseBuilder_;
            private UHCTimeVarsSetResponse uhcTimeVarsSetResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(HSADataService hSADataService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<HSAFileXferRequest, HSAFileXferRequest.Builder, HSAFileXferRequestOrBuilder> singleFieldBuilderV3 = this.hsaFileXferRequestBuilder_;
                    hSADataService.hsaFileXferRequest_ = singleFieldBuilderV3 == null ? this.hsaFileXferRequest_ : (HSAFileXferRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<HSAFileXferNotification, HSAFileXferNotification.Builder, HSAFileXferNotificationOrBuilder> singleFieldBuilderV4 = this.hsaFileXferNtfctnBuilder_;
                    hSADataService.hsaFileXferNtfctn_ = singleFieldBuilderV4 == null ? this.hsaFileXferNtfctn_ : (HSAFileXferNotification) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<UHCAccelParametersSetRequest, UHCAccelParametersSetRequest.Builder, UHCAccelParametersSetRequestOrBuilder> singleFieldBuilderV5 = this.uhcAccelParamsSetRequestBuilder_;
                    hSADataService.uhcAccelParamsSetRequest_ = singleFieldBuilderV5 == null ? this.uhcAccelParamsSetRequest_ : (UHCAccelParametersSetRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<UHCAccelParametersSetResponse, UHCAccelParametersSetResponse.Builder, UHCAccelParametersSetResponseOrBuilder> singleFieldBuilderV6 = this.uhcAccelParamsSetResponseBuilder_;
                    hSADataService.uhcAccelParamsSetResponse_ = singleFieldBuilderV6 == null ? this.uhcAccelParamsSetResponse_ : (UHCAccelParametersSetResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<UHCAccelParametersGetRequest, UHCAccelParametersGetRequest.Builder, UHCAccelParametersGetRequestOrBuilder> singleFieldBuilderV7 = this.uhcAccelParamsGetRequestBuilder_;
                    hSADataService.uhcAccelParamsGetRequest_ = singleFieldBuilderV7 == null ? this.uhcAccelParamsGetRequest_ : (UHCAccelParametersGetRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<UHCAccelParametersGetResponse, UHCAccelParametersGetResponse.Builder, UHCAccelParametersGetResponseOrBuilder> singleFieldBuilderV8 = this.uhcAccelParamsGetResponseBuilder_;
                    hSADataService.uhcAccelParamsGetResponse_ = singleFieldBuilderV8 == null ? this.uhcAccelParamsGetResponse_ : (UHCAccelParametersGetResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<UHCActivationRequest, UHCActivationRequest.Builder, UHCActivationRequestOrBuilder> singleFieldBuilderV9 = this.uhcActivationRequestBuilder_;
                    hSADataService.uhcActivationRequest_ = singleFieldBuilderV9 == null ? this.uhcActivationRequest_ : (UHCActivationRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<UHCActivationResponse, UHCActivationResponse.Builder, UHCActivationResponseOrBuilder> singleFieldBuilderV10 = this.uhcActivationResponseBuilder_;
                    hSADataService.uhcActivationResponse_ = singleFieldBuilderV10 == null ? this.uhcActivationResponse_ : (UHCActivationResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<UHCFitParametersSetRequest, UHCFitParametersSetRequest.Builder, UHCFitParametersSetRequestOrBuilder> singleFieldBuilderV11 = this.uhcFitParametersSetRequestBuilder_;
                    hSADataService.uhcFitParametersSetRequest_ = singleFieldBuilderV11 == null ? this.uhcFitParametersSetRequest_ : (UHCFitParametersSetRequest) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<UHCFitParametersSetResponse, UHCFitParametersSetResponse.Builder, UHCFitParametersSetResponseOrBuilder> singleFieldBuilderV12 = this.uhcFitParametersSetResponseBuilder_;
                    hSADataService.uhcFitParametersSetResponse_ = singleFieldBuilderV12 == null ? this.uhcFitParametersSetResponse_ : (UHCFitParametersSetResponse) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<UHCFitParametersGetRequest, UHCFitParametersGetRequest.Builder, UHCFitParametersGetRequestOrBuilder> singleFieldBuilderV13 = this.uhcFitParametersGetRequestBuilder_;
                    hSADataService.uhcFitParametersGetRequest_ = singleFieldBuilderV13 == null ? this.uhcFitParametersGetRequest_ : (UHCFitParametersGetRequest) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<UHCFitParametersGetResponse, UHCFitParametersGetResponse.Builder, UHCFitParametersGetResponseOrBuilder> singleFieldBuilderV14 = this.uhcFitParametersGetResponseBuilder_;
                    hSADataService.uhcFitParametersGetResponse_ = singleFieldBuilderV14 == null ? this.uhcFitParametersGetResponse_ : (UHCFitParametersGetResponse) singleFieldBuilderV14.build();
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    SingleFieldBuilderV3<UHCTimeVarsSetRequest, UHCTimeVarsSetRequest.Builder, UHCTimeVarsSetRequestOrBuilder> singleFieldBuilderV15 = this.uhcTimeVarsSetRequestBuilder_;
                    hSADataService.uhcTimeVarsSetRequest_ = singleFieldBuilderV15 == null ? this.uhcTimeVarsSetRequest_ : (UHCTimeVarsSetRequest) singleFieldBuilderV15.build();
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    SingleFieldBuilderV3<UHCTimeVarsSetResponse, UHCTimeVarsSetResponse.Builder, UHCTimeVarsSetResponseOrBuilder> singleFieldBuilderV16 = this.uhcTimeVarsSetResponseBuilder_;
                    hSADataService.uhcTimeVarsSetResponse_ = singleFieldBuilderV16 == null ? this.uhcTimeVarsSetResponse_ : (UHCTimeVarsSetResponse) singleFieldBuilderV16.build();
                    i14 |= 8192;
                }
                if ((i15 & 16384) != 0) {
                    SingleFieldBuilderV3<HSAFitLogConfigRequest, HSAFitLogConfigRequest.Builder, HSAFitLogConfigRequestOrBuilder> singleFieldBuilderV17 = this.hsaFitLogConfigRequestBuilder_;
                    hSADataService.hsaFitLogConfigRequest_ = singleFieldBuilderV17 == null ? this.hsaFitLogConfigRequest_ : (HSAFitLogConfigRequest) singleFieldBuilderV17.build();
                    i14 |= 16384;
                }
                if ((i15 & 32768) != 0) {
                    SingleFieldBuilderV3<HSAFitLogConfigResponse, HSAFitLogConfigResponse.Builder, HSAFitLogConfigResponseOrBuilder> singleFieldBuilderV18 = this.hsaFitLogConfigResponseBuilder_;
                    hSADataService.hsaFitLogConfigResponse_ = singleFieldBuilderV18 == null ? this.hsaFitLogConfigResponse_ : (HSAFitLogConfigResponse) singleFieldBuilderV18.build();
                    i14 |= 32768;
                }
                if ((i15 & 65536) != 0) {
                    SingleFieldBuilderV3<HSAFitLogCapabilitiesRequest, HSAFitLogCapabilitiesRequest.Builder, HSAFitLogCapabilitiesRequestOrBuilder> singleFieldBuilderV19 = this.hsaFitLogCapabilitiesRequestBuilder_;
                    hSADataService.hsaFitLogCapabilitiesRequest_ = singleFieldBuilderV19 == null ? this.hsaFitLogCapabilitiesRequest_ : (HSAFitLogCapabilitiesRequest) singleFieldBuilderV19.build();
                    i14 |= 65536;
                }
                if ((i15 & 131072) != 0) {
                    SingleFieldBuilderV3<HSAFitLogCapabilitiesResponse, HSAFitLogCapabilitiesResponse.Builder, HSAFitLogCapabilitiesResponseOrBuilder> singleFieldBuilderV20 = this.hsaFitLogCapabilitiesResponseBuilder_;
                    hSADataService.hsaFitLogCapabilitiesResponse_ = singleFieldBuilderV20 == null ? this.hsaFitLogCapabilitiesResponse_ : (HSAFitLogCapabilitiesResponse) singleFieldBuilderV20.build();
                    i14 |= 131072;
                }
                if ((i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                    SingleFieldBuilderV3<HSAFeaturesRequest, HSAFeaturesRequest.Builder, HSAFeaturesRequestOrBuilder> singleFieldBuilderV21 = this.hsaFeaturesRequestBuilder_;
                    hSADataService.hsaFeaturesRequest_ = singleFieldBuilderV21 == null ? this.hsaFeaturesRequest_ : (HSAFeaturesRequest) singleFieldBuilderV21.build();
                    i14 |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                }
                if ((i15 & 524288) != 0) {
                    SingleFieldBuilderV3<HSAFeaturesResponse, HSAFeaturesResponse.Builder, HSAFeaturesResponseOrBuilder> singleFieldBuilderV22 = this.hsaFeaturesResponseBuilder_;
                    hSADataService.hsaFeaturesResponse_ = singleFieldBuilderV22 == null ? this.hsaFeaturesResponse_ : (HSAFeaturesResponse) singleFieldBuilderV22.build();
                    i14 |= 524288;
                }
                if ((i15 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                    SingleFieldBuilderV3<HSAFitFileCompressionRequest, HSAFitFileCompressionRequest.Builder, HSAFitFileCompressionRequestOrBuilder> singleFieldBuilderV23 = this.hsaFitFileCompressionRequestBuilder_;
                    hSADataService.hsaFitFileCompressionRequest_ = singleFieldBuilderV23 == null ? this.hsaFitFileCompressionRequest_ : (HSAFitFileCompressionRequest) singleFieldBuilderV23.build();
                    i14 |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                }
                if ((i15 & 2097152) != 0) {
                    SingleFieldBuilderV3<HSAFitFileCompressionResponse, HSAFitFileCompressionResponse.Builder, HSAFitFileCompressionResponseOrBuilder> singleFieldBuilderV24 = this.hsaFitFileCompressionResponseBuilder_;
                    hSADataService.hsaFitFileCompressionResponse_ = singleFieldBuilderV24 == null ? this.hsaFitFileCompressionResponse_ : (HSAFitFileCompressionResponse) singleFieldBuilderV24.build();
                    i14 |= 2097152;
                }
                if ((i15 & 4194304) != 0) {
                    SingleFieldBuilderV3<HSAGenericRequest, HSAGenericRequest.Builder, HSAGenericRequestOrBuilder> singleFieldBuilderV25 = this.hsaGenericRequestBuilder_;
                    hSADataService.hsaGenericRequest_ = singleFieldBuilderV25 == null ? this.hsaGenericRequest_ : (HSAGenericRequest) singleFieldBuilderV25.build();
                    i14 |= 4194304;
                }
                if ((i15 & 8388608) != 0) {
                    SingleFieldBuilderV3<HSAGenericResponse, HSAGenericResponse.Builder, HSAGenericResponseOrBuilder> singleFieldBuilderV26 = this.hsaGenericResponseBuilder_;
                    hSADataService.hsaGenericResponse_ = singleFieldBuilderV26 == null ? this.hsaGenericResponse_ : (HSAGenericResponse) singleFieldBuilderV26.build();
                    i14 |= 8388608;
                }
                hSADataService.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSADataService_descriptor;
            }

            private SingleFieldBuilderV3<HSAFeaturesRequest, HSAFeaturesRequest.Builder, HSAFeaturesRequestOrBuilder> getHsaFeaturesRequestFieldBuilder() {
                if (this.hsaFeaturesRequestBuilder_ == null) {
                    this.hsaFeaturesRequestBuilder_ = new SingleFieldBuilderV3<>(getHsaFeaturesRequest(), getParentForChildren(), isClean());
                    this.hsaFeaturesRequest_ = null;
                }
                return this.hsaFeaturesRequestBuilder_;
            }

            private SingleFieldBuilderV3<HSAFeaturesResponse, HSAFeaturesResponse.Builder, HSAFeaturesResponseOrBuilder> getHsaFeaturesResponseFieldBuilder() {
                if (this.hsaFeaturesResponseBuilder_ == null) {
                    this.hsaFeaturesResponseBuilder_ = new SingleFieldBuilderV3<>(getHsaFeaturesResponse(), getParentForChildren(), isClean());
                    this.hsaFeaturesResponse_ = null;
                }
                return this.hsaFeaturesResponseBuilder_;
            }

            private SingleFieldBuilderV3<HSAFileXferNotification, HSAFileXferNotification.Builder, HSAFileXferNotificationOrBuilder> getHsaFileXferNtfctnFieldBuilder() {
                if (this.hsaFileXferNtfctnBuilder_ == null) {
                    this.hsaFileXferNtfctnBuilder_ = new SingleFieldBuilderV3<>(getHsaFileXferNtfctn(), getParentForChildren(), isClean());
                    this.hsaFileXferNtfctn_ = null;
                }
                return this.hsaFileXferNtfctnBuilder_;
            }

            private SingleFieldBuilderV3<HSAFileXferRequest, HSAFileXferRequest.Builder, HSAFileXferRequestOrBuilder> getHsaFileXferRequestFieldBuilder() {
                if (this.hsaFileXferRequestBuilder_ == null) {
                    this.hsaFileXferRequestBuilder_ = new SingleFieldBuilderV3<>(getHsaFileXferRequest(), getParentForChildren(), isClean());
                    this.hsaFileXferRequest_ = null;
                }
                return this.hsaFileXferRequestBuilder_;
            }

            private SingleFieldBuilderV3<HSAFitFileCompressionRequest, HSAFitFileCompressionRequest.Builder, HSAFitFileCompressionRequestOrBuilder> getHsaFitFileCompressionRequestFieldBuilder() {
                if (this.hsaFitFileCompressionRequestBuilder_ == null) {
                    this.hsaFitFileCompressionRequestBuilder_ = new SingleFieldBuilderV3<>(getHsaFitFileCompressionRequest(), getParentForChildren(), isClean());
                    this.hsaFitFileCompressionRequest_ = null;
                }
                return this.hsaFitFileCompressionRequestBuilder_;
            }

            private SingleFieldBuilderV3<HSAFitFileCompressionResponse, HSAFitFileCompressionResponse.Builder, HSAFitFileCompressionResponseOrBuilder> getHsaFitFileCompressionResponseFieldBuilder() {
                if (this.hsaFitFileCompressionResponseBuilder_ == null) {
                    this.hsaFitFileCompressionResponseBuilder_ = new SingleFieldBuilderV3<>(getHsaFitFileCompressionResponse(), getParentForChildren(), isClean());
                    this.hsaFitFileCompressionResponse_ = null;
                }
                return this.hsaFitFileCompressionResponseBuilder_;
            }

            private SingleFieldBuilderV3<HSAFitLogCapabilitiesRequest, HSAFitLogCapabilitiesRequest.Builder, HSAFitLogCapabilitiesRequestOrBuilder> getHsaFitLogCapabilitiesRequestFieldBuilder() {
                if (this.hsaFitLogCapabilitiesRequestBuilder_ == null) {
                    this.hsaFitLogCapabilitiesRequestBuilder_ = new SingleFieldBuilderV3<>(getHsaFitLogCapabilitiesRequest(), getParentForChildren(), isClean());
                    this.hsaFitLogCapabilitiesRequest_ = null;
                }
                return this.hsaFitLogCapabilitiesRequestBuilder_;
            }

            private SingleFieldBuilderV3<HSAFitLogCapabilitiesResponse, HSAFitLogCapabilitiesResponse.Builder, HSAFitLogCapabilitiesResponseOrBuilder> getHsaFitLogCapabilitiesResponseFieldBuilder() {
                if (this.hsaFitLogCapabilitiesResponseBuilder_ == null) {
                    this.hsaFitLogCapabilitiesResponseBuilder_ = new SingleFieldBuilderV3<>(getHsaFitLogCapabilitiesResponse(), getParentForChildren(), isClean());
                    this.hsaFitLogCapabilitiesResponse_ = null;
                }
                return this.hsaFitLogCapabilitiesResponseBuilder_;
            }

            private SingleFieldBuilderV3<HSAFitLogConfigRequest, HSAFitLogConfigRequest.Builder, HSAFitLogConfigRequestOrBuilder> getHsaFitLogConfigRequestFieldBuilder() {
                if (this.hsaFitLogConfigRequestBuilder_ == null) {
                    this.hsaFitLogConfigRequestBuilder_ = new SingleFieldBuilderV3<>(getHsaFitLogConfigRequest(), getParentForChildren(), isClean());
                    this.hsaFitLogConfigRequest_ = null;
                }
                return this.hsaFitLogConfigRequestBuilder_;
            }

            private SingleFieldBuilderV3<HSAFitLogConfigResponse, HSAFitLogConfigResponse.Builder, HSAFitLogConfigResponseOrBuilder> getHsaFitLogConfigResponseFieldBuilder() {
                if (this.hsaFitLogConfigResponseBuilder_ == null) {
                    this.hsaFitLogConfigResponseBuilder_ = new SingleFieldBuilderV3<>(getHsaFitLogConfigResponse(), getParentForChildren(), isClean());
                    this.hsaFitLogConfigResponse_ = null;
                }
                return this.hsaFitLogConfigResponseBuilder_;
            }

            private SingleFieldBuilderV3<HSAGenericRequest, HSAGenericRequest.Builder, HSAGenericRequestOrBuilder> getHsaGenericRequestFieldBuilder() {
                if (this.hsaGenericRequestBuilder_ == null) {
                    this.hsaGenericRequestBuilder_ = new SingleFieldBuilderV3<>(getHsaGenericRequest(), getParentForChildren(), isClean());
                    this.hsaGenericRequest_ = null;
                }
                return this.hsaGenericRequestBuilder_;
            }

            private SingleFieldBuilderV3<HSAGenericResponse, HSAGenericResponse.Builder, HSAGenericResponseOrBuilder> getHsaGenericResponseFieldBuilder() {
                if (this.hsaGenericResponseBuilder_ == null) {
                    this.hsaGenericResponseBuilder_ = new SingleFieldBuilderV3<>(getHsaGenericResponse(), getParentForChildren(), isClean());
                    this.hsaGenericResponse_ = null;
                }
                return this.hsaGenericResponseBuilder_;
            }

            private SingleFieldBuilderV3<UHCAccelParametersGetRequest, UHCAccelParametersGetRequest.Builder, UHCAccelParametersGetRequestOrBuilder> getUhcAccelParamsGetRequestFieldBuilder() {
                if (this.uhcAccelParamsGetRequestBuilder_ == null) {
                    this.uhcAccelParamsGetRequestBuilder_ = new SingleFieldBuilderV3<>(getUhcAccelParamsGetRequest(), getParentForChildren(), isClean());
                    this.uhcAccelParamsGetRequest_ = null;
                }
                return this.uhcAccelParamsGetRequestBuilder_;
            }

            private SingleFieldBuilderV3<UHCAccelParametersGetResponse, UHCAccelParametersGetResponse.Builder, UHCAccelParametersGetResponseOrBuilder> getUhcAccelParamsGetResponseFieldBuilder() {
                if (this.uhcAccelParamsGetResponseBuilder_ == null) {
                    this.uhcAccelParamsGetResponseBuilder_ = new SingleFieldBuilderV3<>(getUhcAccelParamsGetResponse(), getParentForChildren(), isClean());
                    this.uhcAccelParamsGetResponse_ = null;
                }
                return this.uhcAccelParamsGetResponseBuilder_;
            }

            private SingleFieldBuilderV3<UHCAccelParametersSetRequest, UHCAccelParametersSetRequest.Builder, UHCAccelParametersSetRequestOrBuilder> getUhcAccelParamsSetRequestFieldBuilder() {
                if (this.uhcAccelParamsSetRequestBuilder_ == null) {
                    this.uhcAccelParamsSetRequestBuilder_ = new SingleFieldBuilderV3<>(getUhcAccelParamsSetRequest(), getParentForChildren(), isClean());
                    this.uhcAccelParamsSetRequest_ = null;
                }
                return this.uhcAccelParamsSetRequestBuilder_;
            }

            private SingleFieldBuilderV3<UHCAccelParametersSetResponse, UHCAccelParametersSetResponse.Builder, UHCAccelParametersSetResponseOrBuilder> getUhcAccelParamsSetResponseFieldBuilder() {
                if (this.uhcAccelParamsSetResponseBuilder_ == null) {
                    this.uhcAccelParamsSetResponseBuilder_ = new SingleFieldBuilderV3<>(getUhcAccelParamsSetResponse(), getParentForChildren(), isClean());
                    this.uhcAccelParamsSetResponse_ = null;
                }
                return this.uhcAccelParamsSetResponseBuilder_;
            }

            private SingleFieldBuilderV3<UHCActivationRequest, UHCActivationRequest.Builder, UHCActivationRequestOrBuilder> getUhcActivationRequestFieldBuilder() {
                if (this.uhcActivationRequestBuilder_ == null) {
                    this.uhcActivationRequestBuilder_ = new SingleFieldBuilderV3<>(getUhcActivationRequest(), getParentForChildren(), isClean());
                    this.uhcActivationRequest_ = null;
                }
                return this.uhcActivationRequestBuilder_;
            }

            private SingleFieldBuilderV3<UHCActivationResponse, UHCActivationResponse.Builder, UHCActivationResponseOrBuilder> getUhcActivationResponseFieldBuilder() {
                if (this.uhcActivationResponseBuilder_ == null) {
                    this.uhcActivationResponseBuilder_ = new SingleFieldBuilderV3<>(getUhcActivationResponse(), getParentForChildren(), isClean());
                    this.uhcActivationResponse_ = null;
                }
                return this.uhcActivationResponseBuilder_;
            }

            private SingleFieldBuilderV3<UHCFitParametersGetRequest, UHCFitParametersGetRequest.Builder, UHCFitParametersGetRequestOrBuilder> getUhcFitParametersGetRequestFieldBuilder() {
                if (this.uhcFitParametersGetRequestBuilder_ == null) {
                    this.uhcFitParametersGetRequestBuilder_ = new SingleFieldBuilderV3<>(getUhcFitParametersGetRequest(), getParentForChildren(), isClean());
                    this.uhcFitParametersGetRequest_ = null;
                }
                return this.uhcFitParametersGetRequestBuilder_;
            }

            private SingleFieldBuilderV3<UHCFitParametersGetResponse, UHCFitParametersGetResponse.Builder, UHCFitParametersGetResponseOrBuilder> getUhcFitParametersGetResponseFieldBuilder() {
                if (this.uhcFitParametersGetResponseBuilder_ == null) {
                    this.uhcFitParametersGetResponseBuilder_ = new SingleFieldBuilderV3<>(getUhcFitParametersGetResponse(), getParentForChildren(), isClean());
                    this.uhcFitParametersGetResponse_ = null;
                }
                return this.uhcFitParametersGetResponseBuilder_;
            }

            private SingleFieldBuilderV3<UHCFitParametersSetRequest, UHCFitParametersSetRequest.Builder, UHCFitParametersSetRequestOrBuilder> getUhcFitParametersSetRequestFieldBuilder() {
                if (this.uhcFitParametersSetRequestBuilder_ == null) {
                    this.uhcFitParametersSetRequestBuilder_ = new SingleFieldBuilderV3<>(getUhcFitParametersSetRequest(), getParentForChildren(), isClean());
                    this.uhcFitParametersSetRequest_ = null;
                }
                return this.uhcFitParametersSetRequestBuilder_;
            }

            private SingleFieldBuilderV3<UHCFitParametersSetResponse, UHCFitParametersSetResponse.Builder, UHCFitParametersSetResponseOrBuilder> getUhcFitParametersSetResponseFieldBuilder() {
                if (this.uhcFitParametersSetResponseBuilder_ == null) {
                    this.uhcFitParametersSetResponseBuilder_ = new SingleFieldBuilderV3<>(getUhcFitParametersSetResponse(), getParentForChildren(), isClean());
                    this.uhcFitParametersSetResponse_ = null;
                }
                return this.uhcFitParametersSetResponseBuilder_;
            }

            private SingleFieldBuilderV3<UHCTimeVarsSetRequest, UHCTimeVarsSetRequest.Builder, UHCTimeVarsSetRequestOrBuilder> getUhcTimeVarsSetRequestFieldBuilder() {
                if (this.uhcTimeVarsSetRequestBuilder_ == null) {
                    this.uhcTimeVarsSetRequestBuilder_ = new SingleFieldBuilderV3<>(getUhcTimeVarsSetRequest(), getParentForChildren(), isClean());
                    this.uhcTimeVarsSetRequest_ = null;
                }
                return this.uhcTimeVarsSetRequestBuilder_;
            }

            private SingleFieldBuilderV3<UHCTimeVarsSetResponse, UHCTimeVarsSetResponse.Builder, UHCTimeVarsSetResponseOrBuilder> getUhcTimeVarsSetResponseFieldBuilder() {
                if (this.uhcTimeVarsSetResponseBuilder_ == null) {
                    this.uhcTimeVarsSetResponseBuilder_ = new SingleFieldBuilderV3<>(getUhcTimeVarsSetResponse(), getParentForChildren(), isClean());
                    this.uhcTimeVarsSetResponse_ = null;
                }
                return this.uhcTimeVarsSetResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getHsaFileXferRequestFieldBuilder();
                    getHsaFileXferNtfctnFieldBuilder();
                    getUhcAccelParamsSetRequestFieldBuilder();
                    getUhcAccelParamsSetResponseFieldBuilder();
                    getUhcAccelParamsGetRequestFieldBuilder();
                    getUhcAccelParamsGetResponseFieldBuilder();
                    getUhcActivationRequestFieldBuilder();
                    getUhcActivationResponseFieldBuilder();
                    getUhcFitParametersSetRequestFieldBuilder();
                    getUhcFitParametersSetResponseFieldBuilder();
                    getUhcFitParametersGetRequestFieldBuilder();
                    getUhcFitParametersGetResponseFieldBuilder();
                    getUhcTimeVarsSetRequestFieldBuilder();
                    getUhcTimeVarsSetResponseFieldBuilder();
                    getHsaFitLogConfigRequestFieldBuilder();
                    getHsaFitLogConfigResponseFieldBuilder();
                    getHsaFitLogCapabilitiesRequestFieldBuilder();
                    getHsaFitLogCapabilitiesResponseFieldBuilder();
                    getHsaFeaturesRequestFieldBuilder();
                    getHsaFeaturesResponseFieldBuilder();
                    getHsaFitFileCompressionRequestFieldBuilder();
                    getHsaFitFileCompressionResponseFieldBuilder();
                    getHsaGenericRequestFieldBuilder();
                    getHsaGenericResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSADataService build() {
                HSADataService hSADataServiceBuildPartial = buildPartial();
                if (hSADataServiceBuildPartial.isInitialized()) {
                    return hSADataServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) hSADataServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSADataService buildPartial() {
                HSADataService hSADataService = new HSADataService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(hSADataService);
                }
                onBuilt();
                return hSADataService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.hsaFileXferRequest_ = null;
                SingleFieldBuilderV3<HSAFileXferRequest, HSAFileXferRequest.Builder, HSAFileXferRequestOrBuilder> singleFieldBuilderV3 = this.hsaFileXferRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.hsaFileXferRequestBuilder_ = null;
                }
                this.hsaFileXferNtfctn_ = null;
                SingleFieldBuilderV3<HSAFileXferNotification, HSAFileXferNotification.Builder, HSAFileXferNotificationOrBuilder> singleFieldBuilderV4 = this.hsaFileXferNtfctnBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.hsaFileXferNtfctnBuilder_ = null;
                }
                this.uhcAccelParamsSetRequest_ = null;
                SingleFieldBuilderV3<UHCAccelParametersSetRequest, UHCAccelParametersSetRequest.Builder, UHCAccelParametersSetRequestOrBuilder> singleFieldBuilderV5 = this.uhcAccelParamsSetRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.uhcAccelParamsSetRequestBuilder_ = null;
                }
                this.uhcAccelParamsSetResponse_ = null;
                SingleFieldBuilderV3<UHCAccelParametersSetResponse, UHCAccelParametersSetResponse.Builder, UHCAccelParametersSetResponseOrBuilder> singleFieldBuilderV6 = this.uhcAccelParamsSetResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.uhcAccelParamsSetResponseBuilder_ = null;
                }
                this.uhcAccelParamsGetRequest_ = null;
                SingleFieldBuilderV3<UHCAccelParametersGetRequest, UHCAccelParametersGetRequest.Builder, UHCAccelParametersGetRequestOrBuilder> singleFieldBuilderV7 = this.uhcAccelParamsGetRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.uhcAccelParamsGetRequestBuilder_ = null;
                }
                this.uhcAccelParamsGetResponse_ = null;
                SingleFieldBuilderV3<UHCAccelParametersGetResponse, UHCAccelParametersGetResponse.Builder, UHCAccelParametersGetResponseOrBuilder> singleFieldBuilderV8 = this.uhcAccelParamsGetResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.uhcAccelParamsGetResponseBuilder_ = null;
                }
                this.uhcActivationRequest_ = null;
                SingleFieldBuilderV3<UHCActivationRequest, UHCActivationRequest.Builder, UHCActivationRequestOrBuilder> singleFieldBuilderV9 = this.uhcActivationRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.uhcActivationRequestBuilder_ = null;
                }
                this.uhcActivationResponse_ = null;
                SingleFieldBuilderV3<UHCActivationResponse, UHCActivationResponse.Builder, UHCActivationResponseOrBuilder> singleFieldBuilderV10 = this.uhcActivationResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.uhcActivationResponseBuilder_ = null;
                }
                this.uhcFitParametersSetRequest_ = null;
                SingleFieldBuilderV3<UHCFitParametersSetRequest, UHCFitParametersSetRequest.Builder, UHCFitParametersSetRequestOrBuilder> singleFieldBuilderV11 = this.uhcFitParametersSetRequestBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.uhcFitParametersSetRequestBuilder_ = null;
                }
                this.uhcFitParametersSetResponse_ = null;
                SingleFieldBuilderV3<UHCFitParametersSetResponse, UHCFitParametersSetResponse.Builder, UHCFitParametersSetResponseOrBuilder> singleFieldBuilderV12 = this.uhcFitParametersSetResponseBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.uhcFitParametersSetResponseBuilder_ = null;
                }
                this.uhcFitParametersGetRequest_ = null;
                SingleFieldBuilderV3<UHCFitParametersGetRequest, UHCFitParametersGetRequest.Builder, UHCFitParametersGetRequestOrBuilder> singleFieldBuilderV13 = this.uhcFitParametersGetRequestBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.uhcFitParametersGetRequestBuilder_ = null;
                }
                this.uhcFitParametersGetResponse_ = null;
                SingleFieldBuilderV3<UHCFitParametersGetResponse, UHCFitParametersGetResponse.Builder, UHCFitParametersGetResponseOrBuilder> singleFieldBuilderV14 = this.uhcFitParametersGetResponseBuilder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.uhcFitParametersGetResponseBuilder_ = null;
                }
                this.uhcTimeVarsSetRequest_ = null;
                SingleFieldBuilderV3<UHCTimeVarsSetRequest, UHCTimeVarsSetRequest.Builder, UHCTimeVarsSetRequestOrBuilder> singleFieldBuilderV15 = this.uhcTimeVarsSetRequestBuilder_;
                if (singleFieldBuilderV15 != null) {
                    singleFieldBuilderV15.dispose();
                    this.uhcTimeVarsSetRequestBuilder_ = null;
                }
                this.uhcTimeVarsSetResponse_ = null;
                SingleFieldBuilderV3<UHCTimeVarsSetResponse, UHCTimeVarsSetResponse.Builder, UHCTimeVarsSetResponseOrBuilder> singleFieldBuilderV16 = this.uhcTimeVarsSetResponseBuilder_;
                if (singleFieldBuilderV16 != null) {
                    singleFieldBuilderV16.dispose();
                    this.uhcTimeVarsSetResponseBuilder_ = null;
                }
                this.hsaFitLogConfigRequest_ = null;
                SingleFieldBuilderV3<HSAFitLogConfigRequest, HSAFitLogConfigRequest.Builder, HSAFitLogConfigRequestOrBuilder> singleFieldBuilderV17 = this.hsaFitLogConfigRequestBuilder_;
                if (singleFieldBuilderV17 != null) {
                    singleFieldBuilderV17.dispose();
                    this.hsaFitLogConfigRequestBuilder_ = null;
                }
                this.hsaFitLogConfigResponse_ = null;
                SingleFieldBuilderV3<HSAFitLogConfigResponse, HSAFitLogConfigResponse.Builder, HSAFitLogConfigResponseOrBuilder> singleFieldBuilderV18 = this.hsaFitLogConfigResponseBuilder_;
                if (singleFieldBuilderV18 != null) {
                    singleFieldBuilderV18.dispose();
                    this.hsaFitLogConfigResponseBuilder_ = null;
                }
                this.hsaFitLogCapabilitiesRequest_ = null;
                SingleFieldBuilderV3<HSAFitLogCapabilitiesRequest, HSAFitLogCapabilitiesRequest.Builder, HSAFitLogCapabilitiesRequestOrBuilder> singleFieldBuilderV19 = this.hsaFitLogCapabilitiesRequestBuilder_;
                if (singleFieldBuilderV19 != null) {
                    singleFieldBuilderV19.dispose();
                    this.hsaFitLogCapabilitiesRequestBuilder_ = null;
                }
                this.hsaFitLogCapabilitiesResponse_ = null;
                SingleFieldBuilderV3<HSAFitLogCapabilitiesResponse, HSAFitLogCapabilitiesResponse.Builder, HSAFitLogCapabilitiesResponseOrBuilder> singleFieldBuilderV20 = this.hsaFitLogCapabilitiesResponseBuilder_;
                if (singleFieldBuilderV20 != null) {
                    singleFieldBuilderV20.dispose();
                    this.hsaFitLogCapabilitiesResponseBuilder_ = null;
                }
                this.hsaFeaturesRequest_ = null;
                SingleFieldBuilderV3<HSAFeaturesRequest, HSAFeaturesRequest.Builder, HSAFeaturesRequestOrBuilder> singleFieldBuilderV21 = this.hsaFeaturesRequestBuilder_;
                if (singleFieldBuilderV21 != null) {
                    singleFieldBuilderV21.dispose();
                    this.hsaFeaturesRequestBuilder_ = null;
                }
                this.hsaFeaturesResponse_ = null;
                SingleFieldBuilderV3<HSAFeaturesResponse, HSAFeaturesResponse.Builder, HSAFeaturesResponseOrBuilder> singleFieldBuilderV22 = this.hsaFeaturesResponseBuilder_;
                if (singleFieldBuilderV22 != null) {
                    singleFieldBuilderV22.dispose();
                    this.hsaFeaturesResponseBuilder_ = null;
                }
                this.hsaFitFileCompressionRequest_ = null;
                SingleFieldBuilderV3<HSAFitFileCompressionRequest, HSAFitFileCompressionRequest.Builder, HSAFitFileCompressionRequestOrBuilder> singleFieldBuilderV23 = this.hsaFitFileCompressionRequestBuilder_;
                if (singleFieldBuilderV23 != null) {
                    singleFieldBuilderV23.dispose();
                    this.hsaFitFileCompressionRequestBuilder_ = null;
                }
                this.hsaFitFileCompressionResponse_ = null;
                SingleFieldBuilderV3<HSAFitFileCompressionResponse, HSAFitFileCompressionResponse.Builder, HSAFitFileCompressionResponseOrBuilder> singleFieldBuilderV24 = this.hsaFitFileCompressionResponseBuilder_;
                if (singleFieldBuilderV24 != null) {
                    singleFieldBuilderV24.dispose();
                    this.hsaFitFileCompressionResponseBuilder_ = null;
                }
                this.hsaGenericRequest_ = null;
                SingleFieldBuilderV3<HSAGenericRequest, HSAGenericRequest.Builder, HSAGenericRequestOrBuilder> singleFieldBuilderV25 = this.hsaGenericRequestBuilder_;
                if (singleFieldBuilderV25 != null) {
                    singleFieldBuilderV25.dispose();
                    this.hsaGenericRequestBuilder_ = null;
                }
                this.hsaGenericResponse_ = null;
                SingleFieldBuilderV3<HSAGenericResponse, HSAGenericResponse.Builder, HSAGenericResponseOrBuilder> singleFieldBuilderV26 = this.hsaGenericResponseBuilder_;
                if (singleFieldBuilderV26 != null) {
                    singleFieldBuilderV26.dispose();
                    this.hsaGenericResponseBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHsaFeaturesRequest() {
                this.bitField0_ &= -262145;
                this.hsaFeaturesRequest_ = null;
                SingleFieldBuilderV3<HSAFeaturesRequest, HSAFeaturesRequest.Builder, HSAFeaturesRequestOrBuilder> singleFieldBuilderV3 = this.hsaFeaturesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.hsaFeaturesRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearHsaFeaturesResponse() {
                this.bitField0_ &= -524289;
                this.hsaFeaturesResponse_ = null;
                SingleFieldBuilderV3<HSAFeaturesResponse, HSAFeaturesResponse.Builder, HSAFeaturesResponseOrBuilder> singleFieldBuilderV3 = this.hsaFeaturesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.hsaFeaturesResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearHsaFileXferNtfctn() {
                this.bitField0_ &= -3;
                this.hsaFileXferNtfctn_ = null;
                SingleFieldBuilderV3<HSAFileXferNotification, HSAFileXferNotification.Builder, HSAFileXferNotificationOrBuilder> singleFieldBuilderV3 = this.hsaFileXferNtfctnBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.hsaFileXferNtfctnBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearHsaFileXferRequest() {
                this.bitField0_ &= -2;
                this.hsaFileXferRequest_ = null;
                SingleFieldBuilderV3<HSAFileXferRequest, HSAFileXferRequest.Builder, HSAFileXferRequestOrBuilder> singleFieldBuilderV3 = this.hsaFileXferRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.hsaFileXferRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearHsaFitFileCompressionRequest() {
                this.bitField0_ &= -1048577;
                this.hsaFitFileCompressionRequest_ = null;
                SingleFieldBuilderV3<HSAFitFileCompressionRequest, HSAFitFileCompressionRequest.Builder, HSAFitFileCompressionRequestOrBuilder> singleFieldBuilderV3 = this.hsaFitFileCompressionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.hsaFitFileCompressionRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearHsaFitFileCompressionResponse() {
                this.bitField0_ &= -2097153;
                this.hsaFitFileCompressionResponse_ = null;
                SingleFieldBuilderV3<HSAFitFileCompressionResponse, HSAFitFileCompressionResponse.Builder, HSAFitFileCompressionResponseOrBuilder> singleFieldBuilderV3 = this.hsaFitFileCompressionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.hsaFitFileCompressionResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearHsaFitLogCapabilitiesRequest() {
                this.bitField0_ &= -65537;
                this.hsaFitLogCapabilitiesRequest_ = null;
                SingleFieldBuilderV3<HSAFitLogCapabilitiesRequest, HSAFitLogCapabilitiesRequest.Builder, HSAFitLogCapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.hsaFitLogCapabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.hsaFitLogCapabilitiesRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearHsaFitLogCapabilitiesResponse() {
                this.bitField0_ &= -131073;
                this.hsaFitLogCapabilitiesResponse_ = null;
                SingleFieldBuilderV3<HSAFitLogCapabilitiesResponse, HSAFitLogCapabilitiesResponse.Builder, HSAFitLogCapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.hsaFitLogCapabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.hsaFitLogCapabilitiesResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearHsaFitLogConfigRequest() {
                this.bitField0_ &= -16385;
                this.hsaFitLogConfigRequest_ = null;
                SingleFieldBuilderV3<HSAFitLogConfigRequest, HSAFitLogConfigRequest.Builder, HSAFitLogConfigRequestOrBuilder> singleFieldBuilderV3 = this.hsaFitLogConfigRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.hsaFitLogConfigRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearHsaFitLogConfigResponse() {
                this.bitField0_ &= -32769;
                this.hsaFitLogConfigResponse_ = null;
                SingleFieldBuilderV3<HSAFitLogConfigResponse, HSAFitLogConfigResponse.Builder, HSAFitLogConfigResponseOrBuilder> singleFieldBuilderV3 = this.hsaFitLogConfigResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.hsaFitLogConfigResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearHsaGenericRequest() {
                this.bitField0_ &= -4194305;
                this.hsaGenericRequest_ = null;
                SingleFieldBuilderV3<HSAGenericRequest, HSAGenericRequest.Builder, HSAGenericRequestOrBuilder> singleFieldBuilderV3 = this.hsaGenericRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.hsaGenericRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearHsaGenericResponse() {
                this.bitField0_ &= -8388609;
                this.hsaGenericResponse_ = null;
                SingleFieldBuilderV3<HSAGenericResponse, HSAGenericResponse.Builder, HSAGenericResponseOrBuilder> singleFieldBuilderV3 = this.hsaGenericResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.hsaGenericResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearUhcAccelParamsGetRequest() {
                this.bitField0_ &= -17;
                this.uhcAccelParamsGetRequest_ = null;
                SingleFieldBuilderV3<UHCAccelParametersGetRequest, UHCAccelParametersGetRequest.Builder, UHCAccelParametersGetRequestOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsGetRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uhcAccelParamsGetRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUhcAccelParamsGetResponse() {
                this.bitField0_ &= -33;
                this.uhcAccelParamsGetResponse_ = null;
                SingleFieldBuilderV3<UHCAccelParametersGetResponse, UHCAccelParametersGetResponse.Builder, UHCAccelParametersGetResponseOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsGetResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uhcAccelParamsGetResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUhcAccelParamsSetRequest() {
                this.bitField0_ &= -5;
                this.uhcAccelParamsSetRequest_ = null;
                SingleFieldBuilderV3<UHCAccelParametersSetRequest, UHCAccelParametersSetRequest.Builder, UHCAccelParametersSetRequestOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsSetRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uhcAccelParamsSetRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUhcAccelParamsSetResponse() {
                this.bitField0_ &= -9;
                this.uhcAccelParamsSetResponse_ = null;
                SingleFieldBuilderV3<UHCAccelParametersSetResponse, UHCAccelParametersSetResponse.Builder, UHCAccelParametersSetResponseOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsSetResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uhcAccelParamsSetResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUhcActivationRequest() {
                this.bitField0_ &= -65;
                this.uhcActivationRequest_ = null;
                SingleFieldBuilderV3<UHCActivationRequest, UHCActivationRequest.Builder, UHCActivationRequestOrBuilder> singleFieldBuilderV3 = this.uhcActivationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uhcActivationRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUhcActivationResponse() {
                this.bitField0_ &= -129;
                this.uhcActivationResponse_ = null;
                SingleFieldBuilderV3<UHCActivationResponse, UHCActivationResponse.Builder, UHCActivationResponseOrBuilder> singleFieldBuilderV3 = this.uhcActivationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uhcActivationResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUhcFitParametersGetRequest() {
                this.bitField0_ &= -1025;
                this.uhcFitParametersGetRequest_ = null;
                SingleFieldBuilderV3<UHCFitParametersGetRequest, UHCFitParametersGetRequest.Builder, UHCFitParametersGetRequestOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersGetRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uhcFitParametersGetRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUhcFitParametersGetResponse() {
                this.bitField0_ &= -2049;
                this.uhcFitParametersGetResponse_ = null;
                SingleFieldBuilderV3<UHCFitParametersGetResponse, UHCFitParametersGetResponse.Builder, UHCFitParametersGetResponseOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersGetResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uhcFitParametersGetResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUhcFitParametersSetRequest() {
                this.bitField0_ &= -257;
                this.uhcFitParametersSetRequest_ = null;
                SingleFieldBuilderV3<UHCFitParametersSetRequest, UHCFitParametersSetRequest.Builder, UHCFitParametersSetRequestOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersSetRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uhcFitParametersSetRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUhcFitParametersSetResponse() {
                this.bitField0_ &= -513;
                this.uhcFitParametersSetResponse_ = null;
                SingleFieldBuilderV3<UHCFitParametersSetResponse, UHCFitParametersSetResponse.Builder, UHCFitParametersSetResponseOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersSetResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uhcFitParametersSetResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUhcTimeVarsSetRequest() {
                this.bitField0_ &= -4097;
                this.uhcTimeVarsSetRequest_ = null;
                SingleFieldBuilderV3<UHCTimeVarsSetRequest, UHCTimeVarsSetRequest.Builder, UHCTimeVarsSetRequestOrBuilder> singleFieldBuilderV3 = this.uhcTimeVarsSetRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uhcTimeVarsSetRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUhcTimeVarsSetResponse() {
                this.bitField0_ &= -8193;
                this.uhcTimeVarsSetResponse_ = null;
                SingleFieldBuilderV3<UHCTimeVarsSetResponse, UHCTimeVarsSetResponse.Builder, UHCTimeVarsSetResponseOrBuilder> singleFieldBuilderV3 = this.uhcTimeVarsSetResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uhcTimeVarsSetResponseBuilder_ = null;
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
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSADataService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAFeaturesRequest getHsaFeaturesRequest() {
                SingleFieldBuilderV3<HSAFeaturesRequest, HSAFeaturesRequest.Builder, HSAFeaturesRequestOrBuilder> singleFieldBuilderV3 = this.hsaFeaturesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFeaturesRequest) singleFieldBuilderV3.getMessage();
                }
                HSAFeaturesRequest hSAFeaturesRequest = this.hsaFeaturesRequest_;
                return hSAFeaturesRequest == null ? HSAFeaturesRequest.getDefaultInstance() : hSAFeaturesRequest;
            }

            public HSAFeaturesRequest.Builder getHsaFeaturesRequestBuilder() {
                this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                onChanged();
                return (HSAFeaturesRequest.Builder) getHsaFeaturesRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAFeaturesRequestOrBuilder getHsaFeaturesRequestOrBuilder() {
                SingleFieldBuilderV3<HSAFeaturesRequest, HSAFeaturesRequest.Builder, HSAFeaturesRequestOrBuilder> singleFieldBuilderV3 = this.hsaFeaturesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFeaturesRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                HSAFeaturesRequest hSAFeaturesRequest = this.hsaFeaturesRequest_;
                return hSAFeaturesRequest == null ? HSAFeaturesRequest.getDefaultInstance() : hSAFeaturesRequest;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAFeaturesResponse getHsaFeaturesResponse() {
                SingleFieldBuilderV3<HSAFeaturesResponse, HSAFeaturesResponse.Builder, HSAFeaturesResponseOrBuilder> singleFieldBuilderV3 = this.hsaFeaturesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFeaturesResponse) singleFieldBuilderV3.getMessage();
                }
                HSAFeaturesResponse hSAFeaturesResponse = this.hsaFeaturesResponse_;
                return hSAFeaturesResponse == null ? HSAFeaturesResponse.getDefaultInstance() : hSAFeaturesResponse;
            }

            public HSAFeaturesResponse.Builder getHsaFeaturesResponseBuilder() {
                this.bitField0_ |= 524288;
                onChanged();
                return (HSAFeaturesResponse.Builder) getHsaFeaturesResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAFeaturesResponseOrBuilder getHsaFeaturesResponseOrBuilder() {
                SingleFieldBuilderV3<HSAFeaturesResponse, HSAFeaturesResponse.Builder, HSAFeaturesResponseOrBuilder> singleFieldBuilderV3 = this.hsaFeaturesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFeaturesResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                HSAFeaturesResponse hSAFeaturesResponse = this.hsaFeaturesResponse_;
                return hSAFeaturesResponse == null ? HSAFeaturesResponse.getDefaultInstance() : hSAFeaturesResponse;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAFileXferNotification getHsaFileXferNtfctn() {
                SingleFieldBuilderV3<HSAFileXferNotification, HSAFileXferNotification.Builder, HSAFileXferNotificationOrBuilder> singleFieldBuilderV3 = this.hsaFileXferNtfctnBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFileXferNotification) singleFieldBuilderV3.getMessage();
                }
                HSAFileXferNotification hSAFileXferNotification = this.hsaFileXferNtfctn_;
                return hSAFileXferNotification == null ? HSAFileXferNotification.getDefaultInstance() : hSAFileXferNotification;
            }

            public HSAFileXferNotification.Builder getHsaFileXferNtfctnBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (HSAFileXferNotification.Builder) getHsaFileXferNtfctnFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAFileXferNotificationOrBuilder getHsaFileXferNtfctnOrBuilder() {
                SingleFieldBuilderV3<HSAFileXferNotification, HSAFileXferNotification.Builder, HSAFileXferNotificationOrBuilder> singleFieldBuilderV3 = this.hsaFileXferNtfctnBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFileXferNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                HSAFileXferNotification hSAFileXferNotification = this.hsaFileXferNtfctn_;
                return hSAFileXferNotification == null ? HSAFileXferNotification.getDefaultInstance() : hSAFileXferNotification;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAFileXferRequest getHsaFileXferRequest() {
                SingleFieldBuilderV3<HSAFileXferRequest, HSAFileXferRequest.Builder, HSAFileXferRequestOrBuilder> singleFieldBuilderV3 = this.hsaFileXferRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFileXferRequest) singleFieldBuilderV3.getMessage();
                }
                HSAFileXferRequest hSAFileXferRequest = this.hsaFileXferRequest_;
                return hSAFileXferRequest == null ? HSAFileXferRequest.getDefaultInstance() : hSAFileXferRequest;
            }

            public HSAFileXferRequest.Builder getHsaFileXferRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (HSAFileXferRequest.Builder) getHsaFileXferRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAFileXferRequestOrBuilder getHsaFileXferRequestOrBuilder() {
                SingleFieldBuilderV3<HSAFileXferRequest, HSAFileXferRequest.Builder, HSAFileXferRequestOrBuilder> singleFieldBuilderV3 = this.hsaFileXferRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFileXferRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                HSAFileXferRequest hSAFileXferRequest = this.hsaFileXferRequest_;
                return hSAFileXferRequest == null ? HSAFileXferRequest.getDefaultInstance() : hSAFileXferRequest;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAFitFileCompressionRequest getHsaFitFileCompressionRequest() {
                SingleFieldBuilderV3<HSAFitFileCompressionRequest, HSAFitFileCompressionRequest.Builder, HSAFitFileCompressionRequestOrBuilder> singleFieldBuilderV3 = this.hsaFitFileCompressionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFitFileCompressionRequest) singleFieldBuilderV3.getMessage();
                }
                HSAFitFileCompressionRequest hSAFitFileCompressionRequest = this.hsaFitFileCompressionRequest_;
                return hSAFitFileCompressionRequest == null ? HSAFitFileCompressionRequest.getDefaultInstance() : hSAFitFileCompressionRequest;
            }

            public HSAFitFileCompressionRequest.Builder getHsaFitFileCompressionRequestBuilder() {
                this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                onChanged();
                return (HSAFitFileCompressionRequest.Builder) getHsaFitFileCompressionRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAFitFileCompressionRequestOrBuilder getHsaFitFileCompressionRequestOrBuilder() {
                SingleFieldBuilderV3<HSAFitFileCompressionRequest, HSAFitFileCompressionRequest.Builder, HSAFitFileCompressionRequestOrBuilder> singleFieldBuilderV3 = this.hsaFitFileCompressionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFitFileCompressionRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                HSAFitFileCompressionRequest hSAFitFileCompressionRequest = this.hsaFitFileCompressionRequest_;
                return hSAFitFileCompressionRequest == null ? HSAFitFileCompressionRequest.getDefaultInstance() : hSAFitFileCompressionRequest;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAFitFileCompressionResponse getHsaFitFileCompressionResponse() {
                SingleFieldBuilderV3<HSAFitFileCompressionResponse, HSAFitFileCompressionResponse.Builder, HSAFitFileCompressionResponseOrBuilder> singleFieldBuilderV3 = this.hsaFitFileCompressionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFitFileCompressionResponse) singleFieldBuilderV3.getMessage();
                }
                HSAFitFileCompressionResponse hSAFitFileCompressionResponse = this.hsaFitFileCompressionResponse_;
                return hSAFitFileCompressionResponse == null ? HSAFitFileCompressionResponse.getDefaultInstance() : hSAFitFileCompressionResponse;
            }

            public HSAFitFileCompressionResponse.Builder getHsaFitFileCompressionResponseBuilder() {
                this.bitField0_ |= 2097152;
                onChanged();
                return (HSAFitFileCompressionResponse.Builder) getHsaFitFileCompressionResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAFitFileCompressionResponseOrBuilder getHsaFitFileCompressionResponseOrBuilder() {
                SingleFieldBuilderV3<HSAFitFileCompressionResponse, HSAFitFileCompressionResponse.Builder, HSAFitFileCompressionResponseOrBuilder> singleFieldBuilderV3 = this.hsaFitFileCompressionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFitFileCompressionResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                HSAFitFileCompressionResponse hSAFitFileCompressionResponse = this.hsaFitFileCompressionResponse_;
                return hSAFitFileCompressionResponse == null ? HSAFitFileCompressionResponse.getDefaultInstance() : hSAFitFileCompressionResponse;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAFitLogCapabilitiesRequest getHsaFitLogCapabilitiesRequest() {
                SingleFieldBuilderV3<HSAFitLogCapabilitiesRequest, HSAFitLogCapabilitiesRequest.Builder, HSAFitLogCapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.hsaFitLogCapabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFitLogCapabilitiesRequest) singleFieldBuilderV3.getMessage();
                }
                HSAFitLogCapabilitiesRequest hSAFitLogCapabilitiesRequest = this.hsaFitLogCapabilitiesRequest_;
                return hSAFitLogCapabilitiesRequest == null ? HSAFitLogCapabilitiesRequest.getDefaultInstance() : hSAFitLogCapabilitiesRequest;
            }

            public HSAFitLogCapabilitiesRequest.Builder getHsaFitLogCapabilitiesRequestBuilder() {
                this.bitField0_ |= 65536;
                onChanged();
                return (HSAFitLogCapabilitiesRequest.Builder) getHsaFitLogCapabilitiesRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAFitLogCapabilitiesRequestOrBuilder getHsaFitLogCapabilitiesRequestOrBuilder() {
                SingleFieldBuilderV3<HSAFitLogCapabilitiesRequest, HSAFitLogCapabilitiesRequest.Builder, HSAFitLogCapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.hsaFitLogCapabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFitLogCapabilitiesRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                HSAFitLogCapabilitiesRequest hSAFitLogCapabilitiesRequest = this.hsaFitLogCapabilitiesRequest_;
                return hSAFitLogCapabilitiesRequest == null ? HSAFitLogCapabilitiesRequest.getDefaultInstance() : hSAFitLogCapabilitiesRequest;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAFitLogCapabilitiesResponse getHsaFitLogCapabilitiesResponse() {
                SingleFieldBuilderV3<HSAFitLogCapabilitiesResponse, HSAFitLogCapabilitiesResponse.Builder, HSAFitLogCapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.hsaFitLogCapabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFitLogCapabilitiesResponse) singleFieldBuilderV3.getMessage();
                }
                HSAFitLogCapabilitiesResponse hSAFitLogCapabilitiesResponse = this.hsaFitLogCapabilitiesResponse_;
                return hSAFitLogCapabilitiesResponse == null ? HSAFitLogCapabilitiesResponse.getDefaultInstance() : hSAFitLogCapabilitiesResponse;
            }

            public HSAFitLogCapabilitiesResponse.Builder getHsaFitLogCapabilitiesResponseBuilder() {
                this.bitField0_ |= 131072;
                onChanged();
                return (HSAFitLogCapabilitiesResponse.Builder) getHsaFitLogCapabilitiesResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAFitLogCapabilitiesResponseOrBuilder getHsaFitLogCapabilitiesResponseOrBuilder() {
                SingleFieldBuilderV3<HSAFitLogCapabilitiesResponse, HSAFitLogCapabilitiesResponse.Builder, HSAFitLogCapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.hsaFitLogCapabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFitLogCapabilitiesResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                HSAFitLogCapabilitiesResponse hSAFitLogCapabilitiesResponse = this.hsaFitLogCapabilitiesResponse_;
                return hSAFitLogCapabilitiesResponse == null ? HSAFitLogCapabilitiesResponse.getDefaultInstance() : hSAFitLogCapabilitiesResponse;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAFitLogConfigRequest getHsaFitLogConfigRequest() {
                SingleFieldBuilderV3<HSAFitLogConfigRequest, HSAFitLogConfigRequest.Builder, HSAFitLogConfigRequestOrBuilder> singleFieldBuilderV3 = this.hsaFitLogConfigRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFitLogConfigRequest) singleFieldBuilderV3.getMessage();
                }
                HSAFitLogConfigRequest hSAFitLogConfigRequest = this.hsaFitLogConfigRequest_;
                return hSAFitLogConfigRequest == null ? HSAFitLogConfigRequest.getDefaultInstance() : hSAFitLogConfigRequest;
            }

            public HSAFitLogConfigRequest.Builder getHsaFitLogConfigRequestBuilder() {
                this.bitField0_ |= 16384;
                onChanged();
                return (HSAFitLogConfigRequest.Builder) getHsaFitLogConfigRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAFitLogConfigRequestOrBuilder getHsaFitLogConfigRequestOrBuilder() {
                SingleFieldBuilderV3<HSAFitLogConfigRequest, HSAFitLogConfigRequest.Builder, HSAFitLogConfigRequestOrBuilder> singleFieldBuilderV3 = this.hsaFitLogConfigRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFitLogConfigRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                HSAFitLogConfigRequest hSAFitLogConfigRequest = this.hsaFitLogConfigRequest_;
                return hSAFitLogConfigRequest == null ? HSAFitLogConfigRequest.getDefaultInstance() : hSAFitLogConfigRequest;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAFitLogConfigResponse getHsaFitLogConfigResponse() {
                SingleFieldBuilderV3<HSAFitLogConfigResponse, HSAFitLogConfigResponse.Builder, HSAFitLogConfigResponseOrBuilder> singleFieldBuilderV3 = this.hsaFitLogConfigResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFitLogConfigResponse) singleFieldBuilderV3.getMessage();
                }
                HSAFitLogConfigResponse hSAFitLogConfigResponse = this.hsaFitLogConfigResponse_;
                return hSAFitLogConfigResponse == null ? HSAFitLogConfigResponse.getDefaultInstance() : hSAFitLogConfigResponse;
            }

            public HSAFitLogConfigResponse.Builder getHsaFitLogConfigResponseBuilder() {
                this.bitField0_ |= 32768;
                onChanged();
                return (HSAFitLogConfigResponse.Builder) getHsaFitLogConfigResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAFitLogConfigResponseOrBuilder getHsaFitLogConfigResponseOrBuilder() {
                SingleFieldBuilderV3<HSAFitLogConfigResponse, HSAFitLogConfigResponse.Builder, HSAFitLogConfigResponseOrBuilder> singleFieldBuilderV3 = this.hsaFitLogConfigResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFitLogConfigResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                HSAFitLogConfigResponse hSAFitLogConfigResponse = this.hsaFitLogConfigResponse_;
                return hSAFitLogConfigResponse == null ? HSAFitLogConfigResponse.getDefaultInstance() : hSAFitLogConfigResponse;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAGenericRequest getHsaGenericRequest() {
                SingleFieldBuilderV3<HSAGenericRequest, HSAGenericRequest.Builder, HSAGenericRequestOrBuilder> singleFieldBuilderV3 = this.hsaGenericRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAGenericRequest) singleFieldBuilderV3.getMessage();
                }
                HSAGenericRequest hSAGenericRequest = this.hsaGenericRequest_;
                return hSAGenericRequest == null ? HSAGenericRequest.getDefaultInstance() : hSAGenericRequest;
            }

            public HSAGenericRequest.Builder getHsaGenericRequestBuilder() {
                this.bitField0_ |= 4194304;
                onChanged();
                return (HSAGenericRequest.Builder) getHsaGenericRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAGenericRequestOrBuilder getHsaGenericRequestOrBuilder() {
                SingleFieldBuilderV3<HSAGenericRequest, HSAGenericRequest.Builder, HSAGenericRequestOrBuilder> singleFieldBuilderV3 = this.hsaGenericRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAGenericRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                HSAGenericRequest hSAGenericRequest = this.hsaGenericRequest_;
                return hSAGenericRequest == null ? HSAGenericRequest.getDefaultInstance() : hSAGenericRequest;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAGenericResponse getHsaGenericResponse() {
                SingleFieldBuilderV3<HSAGenericResponse, HSAGenericResponse.Builder, HSAGenericResponseOrBuilder> singleFieldBuilderV3 = this.hsaGenericResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAGenericResponse) singleFieldBuilderV3.getMessage();
                }
                HSAGenericResponse hSAGenericResponse = this.hsaGenericResponse_;
                return hSAGenericResponse == null ? HSAGenericResponse.getDefaultInstance() : hSAGenericResponse;
            }

            public HSAGenericResponse.Builder getHsaGenericResponseBuilder() {
                this.bitField0_ |= 8388608;
                onChanged();
                return (HSAGenericResponse.Builder) getHsaGenericResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public HSAGenericResponseOrBuilder getHsaGenericResponseOrBuilder() {
                SingleFieldBuilderV3<HSAGenericResponse, HSAGenericResponse.Builder, HSAGenericResponseOrBuilder> singleFieldBuilderV3 = this.hsaGenericResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAGenericResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                HSAGenericResponse hSAGenericResponse = this.hsaGenericResponse_;
                return hSAGenericResponse == null ? HSAGenericResponse.getDefaultInstance() : hSAGenericResponse;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCAccelParametersGetRequest getUhcAccelParamsGetRequest() {
                SingleFieldBuilderV3<UHCAccelParametersGetRequest, UHCAccelParametersGetRequest.Builder, UHCAccelParametersGetRequestOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsGetRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCAccelParametersGetRequest) singleFieldBuilderV3.getMessage();
                }
                UHCAccelParametersGetRequest uHCAccelParametersGetRequest = this.uhcAccelParamsGetRequest_;
                return uHCAccelParametersGetRequest == null ? UHCAccelParametersGetRequest.getDefaultInstance() : uHCAccelParametersGetRequest;
            }

            public UHCAccelParametersGetRequest.Builder getUhcAccelParamsGetRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (UHCAccelParametersGetRequest.Builder) getUhcAccelParamsGetRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCAccelParametersGetRequestOrBuilder getUhcAccelParamsGetRequestOrBuilder() {
                SingleFieldBuilderV3<UHCAccelParametersGetRequest, UHCAccelParametersGetRequest.Builder, UHCAccelParametersGetRequestOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsGetRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCAccelParametersGetRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UHCAccelParametersGetRequest uHCAccelParametersGetRequest = this.uhcAccelParamsGetRequest_;
                return uHCAccelParametersGetRequest == null ? UHCAccelParametersGetRequest.getDefaultInstance() : uHCAccelParametersGetRequest;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCAccelParametersGetResponse getUhcAccelParamsGetResponse() {
                SingleFieldBuilderV3<UHCAccelParametersGetResponse, UHCAccelParametersGetResponse.Builder, UHCAccelParametersGetResponseOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsGetResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCAccelParametersGetResponse) singleFieldBuilderV3.getMessage();
                }
                UHCAccelParametersGetResponse uHCAccelParametersGetResponse = this.uhcAccelParamsGetResponse_;
                return uHCAccelParametersGetResponse == null ? UHCAccelParametersGetResponse.getDefaultInstance() : uHCAccelParametersGetResponse;
            }

            public UHCAccelParametersGetResponse.Builder getUhcAccelParamsGetResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (UHCAccelParametersGetResponse.Builder) getUhcAccelParamsGetResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCAccelParametersGetResponseOrBuilder getUhcAccelParamsGetResponseOrBuilder() {
                SingleFieldBuilderV3<UHCAccelParametersGetResponse, UHCAccelParametersGetResponse.Builder, UHCAccelParametersGetResponseOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsGetResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCAccelParametersGetResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UHCAccelParametersGetResponse uHCAccelParametersGetResponse = this.uhcAccelParamsGetResponse_;
                return uHCAccelParametersGetResponse == null ? UHCAccelParametersGetResponse.getDefaultInstance() : uHCAccelParametersGetResponse;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCAccelParametersSetRequest getUhcAccelParamsSetRequest() {
                SingleFieldBuilderV3<UHCAccelParametersSetRequest, UHCAccelParametersSetRequest.Builder, UHCAccelParametersSetRequestOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsSetRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCAccelParametersSetRequest) singleFieldBuilderV3.getMessage();
                }
                UHCAccelParametersSetRequest uHCAccelParametersSetRequest = this.uhcAccelParamsSetRequest_;
                return uHCAccelParametersSetRequest == null ? UHCAccelParametersSetRequest.getDefaultInstance() : uHCAccelParametersSetRequest;
            }

            public UHCAccelParametersSetRequest.Builder getUhcAccelParamsSetRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (UHCAccelParametersSetRequest.Builder) getUhcAccelParamsSetRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCAccelParametersSetRequestOrBuilder getUhcAccelParamsSetRequestOrBuilder() {
                SingleFieldBuilderV3<UHCAccelParametersSetRequest, UHCAccelParametersSetRequest.Builder, UHCAccelParametersSetRequestOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsSetRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCAccelParametersSetRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UHCAccelParametersSetRequest uHCAccelParametersSetRequest = this.uhcAccelParamsSetRequest_;
                return uHCAccelParametersSetRequest == null ? UHCAccelParametersSetRequest.getDefaultInstance() : uHCAccelParametersSetRequest;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCAccelParametersSetResponse getUhcAccelParamsSetResponse() {
                SingleFieldBuilderV3<UHCAccelParametersSetResponse, UHCAccelParametersSetResponse.Builder, UHCAccelParametersSetResponseOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsSetResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCAccelParametersSetResponse) singleFieldBuilderV3.getMessage();
                }
                UHCAccelParametersSetResponse uHCAccelParametersSetResponse = this.uhcAccelParamsSetResponse_;
                return uHCAccelParametersSetResponse == null ? UHCAccelParametersSetResponse.getDefaultInstance() : uHCAccelParametersSetResponse;
            }

            public UHCAccelParametersSetResponse.Builder getUhcAccelParamsSetResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (UHCAccelParametersSetResponse.Builder) getUhcAccelParamsSetResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCAccelParametersSetResponseOrBuilder getUhcAccelParamsSetResponseOrBuilder() {
                SingleFieldBuilderV3<UHCAccelParametersSetResponse, UHCAccelParametersSetResponse.Builder, UHCAccelParametersSetResponseOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsSetResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCAccelParametersSetResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UHCAccelParametersSetResponse uHCAccelParametersSetResponse = this.uhcAccelParamsSetResponse_;
                return uHCAccelParametersSetResponse == null ? UHCAccelParametersSetResponse.getDefaultInstance() : uHCAccelParametersSetResponse;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCActivationRequest getUhcActivationRequest() {
                SingleFieldBuilderV3<UHCActivationRequest, UHCActivationRequest.Builder, UHCActivationRequestOrBuilder> singleFieldBuilderV3 = this.uhcActivationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCActivationRequest) singleFieldBuilderV3.getMessage();
                }
                UHCActivationRequest uHCActivationRequest = this.uhcActivationRequest_;
                return uHCActivationRequest == null ? UHCActivationRequest.getDefaultInstance() : uHCActivationRequest;
            }

            public UHCActivationRequest.Builder getUhcActivationRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (UHCActivationRequest.Builder) getUhcActivationRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCActivationRequestOrBuilder getUhcActivationRequestOrBuilder() {
                SingleFieldBuilderV3<UHCActivationRequest, UHCActivationRequest.Builder, UHCActivationRequestOrBuilder> singleFieldBuilderV3 = this.uhcActivationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCActivationRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UHCActivationRequest uHCActivationRequest = this.uhcActivationRequest_;
                return uHCActivationRequest == null ? UHCActivationRequest.getDefaultInstance() : uHCActivationRequest;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCActivationResponse getUhcActivationResponse() {
                SingleFieldBuilderV3<UHCActivationResponse, UHCActivationResponse.Builder, UHCActivationResponseOrBuilder> singleFieldBuilderV3 = this.uhcActivationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCActivationResponse) singleFieldBuilderV3.getMessage();
                }
                UHCActivationResponse uHCActivationResponse = this.uhcActivationResponse_;
                return uHCActivationResponse == null ? UHCActivationResponse.getDefaultInstance() : uHCActivationResponse;
            }

            public UHCActivationResponse.Builder getUhcActivationResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (UHCActivationResponse.Builder) getUhcActivationResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCActivationResponseOrBuilder getUhcActivationResponseOrBuilder() {
                SingleFieldBuilderV3<UHCActivationResponse, UHCActivationResponse.Builder, UHCActivationResponseOrBuilder> singleFieldBuilderV3 = this.uhcActivationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCActivationResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UHCActivationResponse uHCActivationResponse = this.uhcActivationResponse_;
                return uHCActivationResponse == null ? UHCActivationResponse.getDefaultInstance() : uHCActivationResponse;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCFitParametersGetRequest getUhcFitParametersGetRequest() {
                SingleFieldBuilderV3<UHCFitParametersGetRequest, UHCFitParametersGetRequest.Builder, UHCFitParametersGetRequestOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersGetRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCFitParametersGetRequest) singleFieldBuilderV3.getMessage();
                }
                UHCFitParametersGetRequest uHCFitParametersGetRequest = this.uhcFitParametersGetRequest_;
                return uHCFitParametersGetRequest == null ? UHCFitParametersGetRequest.getDefaultInstance() : uHCFitParametersGetRequest;
            }

            public UHCFitParametersGetRequest.Builder getUhcFitParametersGetRequestBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (UHCFitParametersGetRequest.Builder) getUhcFitParametersGetRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCFitParametersGetRequestOrBuilder getUhcFitParametersGetRequestOrBuilder() {
                SingleFieldBuilderV3<UHCFitParametersGetRequest, UHCFitParametersGetRequest.Builder, UHCFitParametersGetRequestOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersGetRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCFitParametersGetRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UHCFitParametersGetRequest uHCFitParametersGetRequest = this.uhcFitParametersGetRequest_;
                return uHCFitParametersGetRequest == null ? UHCFitParametersGetRequest.getDefaultInstance() : uHCFitParametersGetRequest;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCFitParametersGetResponse getUhcFitParametersGetResponse() {
                SingleFieldBuilderV3<UHCFitParametersGetResponse, UHCFitParametersGetResponse.Builder, UHCFitParametersGetResponseOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersGetResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCFitParametersGetResponse) singleFieldBuilderV3.getMessage();
                }
                UHCFitParametersGetResponse uHCFitParametersGetResponse = this.uhcFitParametersGetResponse_;
                return uHCFitParametersGetResponse == null ? UHCFitParametersGetResponse.getDefaultInstance() : uHCFitParametersGetResponse;
            }

            public UHCFitParametersGetResponse.Builder getUhcFitParametersGetResponseBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (UHCFitParametersGetResponse.Builder) getUhcFitParametersGetResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCFitParametersGetResponseOrBuilder getUhcFitParametersGetResponseOrBuilder() {
                SingleFieldBuilderV3<UHCFitParametersGetResponse, UHCFitParametersGetResponse.Builder, UHCFitParametersGetResponseOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersGetResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCFitParametersGetResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UHCFitParametersGetResponse uHCFitParametersGetResponse = this.uhcFitParametersGetResponse_;
                return uHCFitParametersGetResponse == null ? UHCFitParametersGetResponse.getDefaultInstance() : uHCFitParametersGetResponse;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCFitParametersSetRequest getUhcFitParametersSetRequest() {
                SingleFieldBuilderV3<UHCFitParametersSetRequest, UHCFitParametersSetRequest.Builder, UHCFitParametersSetRequestOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersSetRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCFitParametersSetRequest) singleFieldBuilderV3.getMessage();
                }
                UHCFitParametersSetRequest uHCFitParametersSetRequest = this.uhcFitParametersSetRequest_;
                return uHCFitParametersSetRequest == null ? UHCFitParametersSetRequest.getDefaultInstance() : uHCFitParametersSetRequest;
            }

            public UHCFitParametersSetRequest.Builder getUhcFitParametersSetRequestBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (UHCFitParametersSetRequest.Builder) getUhcFitParametersSetRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCFitParametersSetRequestOrBuilder getUhcFitParametersSetRequestOrBuilder() {
                SingleFieldBuilderV3<UHCFitParametersSetRequest, UHCFitParametersSetRequest.Builder, UHCFitParametersSetRequestOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersSetRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCFitParametersSetRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UHCFitParametersSetRequest uHCFitParametersSetRequest = this.uhcFitParametersSetRequest_;
                return uHCFitParametersSetRequest == null ? UHCFitParametersSetRequest.getDefaultInstance() : uHCFitParametersSetRequest;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCFitParametersSetResponse getUhcFitParametersSetResponse() {
                SingleFieldBuilderV3<UHCFitParametersSetResponse, UHCFitParametersSetResponse.Builder, UHCFitParametersSetResponseOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersSetResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCFitParametersSetResponse) singleFieldBuilderV3.getMessage();
                }
                UHCFitParametersSetResponse uHCFitParametersSetResponse = this.uhcFitParametersSetResponse_;
                return uHCFitParametersSetResponse == null ? UHCFitParametersSetResponse.getDefaultInstance() : uHCFitParametersSetResponse;
            }

            public UHCFitParametersSetResponse.Builder getUhcFitParametersSetResponseBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (UHCFitParametersSetResponse.Builder) getUhcFitParametersSetResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCFitParametersSetResponseOrBuilder getUhcFitParametersSetResponseOrBuilder() {
                SingleFieldBuilderV3<UHCFitParametersSetResponse, UHCFitParametersSetResponse.Builder, UHCFitParametersSetResponseOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersSetResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCFitParametersSetResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UHCFitParametersSetResponse uHCFitParametersSetResponse = this.uhcFitParametersSetResponse_;
                return uHCFitParametersSetResponse == null ? UHCFitParametersSetResponse.getDefaultInstance() : uHCFitParametersSetResponse;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCTimeVarsSetRequest getUhcTimeVarsSetRequest() {
                SingleFieldBuilderV3<UHCTimeVarsSetRequest, UHCTimeVarsSetRequest.Builder, UHCTimeVarsSetRequestOrBuilder> singleFieldBuilderV3 = this.uhcTimeVarsSetRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCTimeVarsSetRequest) singleFieldBuilderV3.getMessage();
                }
                UHCTimeVarsSetRequest uHCTimeVarsSetRequest = this.uhcTimeVarsSetRequest_;
                return uHCTimeVarsSetRequest == null ? UHCTimeVarsSetRequest.getDefaultInstance() : uHCTimeVarsSetRequest;
            }

            public UHCTimeVarsSetRequest.Builder getUhcTimeVarsSetRequestBuilder() {
                this.bitField0_ |= 4096;
                onChanged();
                return (UHCTimeVarsSetRequest.Builder) getUhcTimeVarsSetRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCTimeVarsSetRequestOrBuilder getUhcTimeVarsSetRequestOrBuilder() {
                SingleFieldBuilderV3<UHCTimeVarsSetRequest, UHCTimeVarsSetRequest.Builder, UHCTimeVarsSetRequestOrBuilder> singleFieldBuilderV3 = this.uhcTimeVarsSetRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCTimeVarsSetRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UHCTimeVarsSetRequest uHCTimeVarsSetRequest = this.uhcTimeVarsSetRequest_;
                return uHCTimeVarsSetRequest == null ? UHCTimeVarsSetRequest.getDefaultInstance() : uHCTimeVarsSetRequest;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCTimeVarsSetResponse getUhcTimeVarsSetResponse() {
                SingleFieldBuilderV3<UHCTimeVarsSetResponse, UHCTimeVarsSetResponse.Builder, UHCTimeVarsSetResponseOrBuilder> singleFieldBuilderV3 = this.uhcTimeVarsSetResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCTimeVarsSetResponse) singleFieldBuilderV3.getMessage();
                }
                UHCTimeVarsSetResponse uHCTimeVarsSetResponse = this.uhcTimeVarsSetResponse_;
                return uHCTimeVarsSetResponse == null ? UHCTimeVarsSetResponse.getDefaultInstance() : uHCTimeVarsSetResponse;
            }

            public UHCTimeVarsSetResponse.Builder getUhcTimeVarsSetResponseBuilder() {
                this.bitField0_ |= 8192;
                onChanged();
                return (UHCTimeVarsSetResponse.Builder) getUhcTimeVarsSetResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public UHCTimeVarsSetResponseOrBuilder getUhcTimeVarsSetResponseOrBuilder() {
                SingleFieldBuilderV3<UHCTimeVarsSetResponse, UHCTimeVarsSetResponse.Builder, UHCTimeVarsSetResponseOrBuilder> singleFieldBuilderV3 = this.uhcTimeVarsSetResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UHCTimeVarsSetResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UHCTimeVarsSetResponse uHCTimeVarsSetResponse = this.uhcTimeVarsSetResponse_;
                return uHCTimeVarsSetResponse == null ? UHCTimeVarsSetResponse.getDefaultInstance() : uHCTimeVarsSetResponse;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasHsaFeaturesRequest() {
                return (this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasHsaFeaturesResponse() {
                return (this.bitField0_ & 524288) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasHsaFileXferNtfctn() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasHsaFileXferRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasHsaFitFileCompressionRequest() {
                return (this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasHsaFitFileCompressionResponse() {
                return (this.bitField0_ & 2097152) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasHsaFitLogCapabilitiesRequest() {
                return (this.bitField0_ & 65536) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasHsaFitLogCapabilitiesResponse() {
                return (this.bitField0_ & 131072) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasHsaFitLogConfigRequest() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasHsaFitLogConfigResponse() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasHsaGenericRequest() {
                return (this.bitField0_ & 4194304) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasHsaGenericResponse() {
                return (this.bitField0_ & 8388608) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasUhcAccelParamsGetRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasUhcAccelParamsGetResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasUhcAccelParamsSetRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasUhcAccelParamsSetResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasUhcActivationRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasUhcActivationResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasUhcFitParametersGetRequest() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasUhcFitParametersGetResponse() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasUhcFitParametersSetRequest() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasUhcFitParametersSetResponse() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasUhcTimeVarsSetRequest() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSADataServiceOrBuilder
            public boolean hasUhcTimeVarsSetResponse() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSADataService_fieldAccessorTable.ensureFieldAccessorsInitialized(HSADataService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasHsaFileXferRequest() && !getHsaFileXferRequest().isInitialized()) {
                    return false;
                }
                if (hasHsaFileXferNtfctn() && !getHsaFileXferNtfctn().isInitialized()) {
                    return false;
                }
                if (hasUhcAccelParamsSetRequest() && !getUhcAccelParamsSetRequest().isInitialized()) {
                    return false;
                }
                if (hasUhcAccelParamsSetResponse() && !getUhcAccelParamsSetResponse().isInitialized()) {
                    return false;
                }
                if (hasUhcAccelParamsGetRequest() && !getUhcAccelParamsGetRequest().isInitialized()) {
                    return false;
                }
                if (hasUhcAccelParamsGetResponse() && !getUhcAccelParamsGetResponse().isInitialized()) {
                    return false;
                }
                if (hasUhcActivationRequest() && !getUhcActivationRequest().isInitialized()) {
                    return false;
                }
                if (hasUhcActivationResponse() && !getUhcActivationResponse().isInitialized()) {
                    return false;
                }
                if (hasUhcFitParametersSetRequest() && !getUhcFitParametersSetRequest().isInitialized()) {
                    return false;
                }
                if (hasUhcFitParametersSetResponse() && !getUhcFitParametersSetResponse().isInitialized()) {
                    return false;
                }
                if (hasUhcFitParametersGetRequest() && !getUhcFitParametersGetRequest().isInitialized()) {
                    return false;
                }
                if (hasUhcFitParametersGetResponse() && !getUhcFitParametersGetResponse().isInitialized()) {
                    return false;
                }
                if (hasUhcTimeVarsSetRequest() && !getUhcTimeVarsSetRequest().isInitialized()) {
                    return false;
                }
                if (hasUhcTimeVarsSetResponse() && !getUhcTimeVarsSetResponse().isInitialized()) {
                    return false;
                }
                if (hasHsaFitLogConfigRequest() && !getHsaFitLogConfigRequest().isInitialized()) {
                    return false;
                }
                if (hasHsaFitLogConfigResponse() && !getHsaFitLogConfigResponse().isInitialized()) {
                    return false;
                }
                if (hasHsaFitLogCapabilitiesResponse() && !getHsaFitLogCapabilitiesResponse().isInitialized()) {
                    return false;
                }
                if (!hasHsaFeaturesResponse() || getHsaFeaturesResponse().isInitialized()) {
                    return !hasHsaFitFileCompressionResponse() || getHsaFitFileCompressionResponse().isInitialized();
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
                            switch (tag) {
                                case 0:
                                    break;
                                case 10:
                                    codedInputStream.readMessage(getHsaFileXferRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getHsaFileXferNtfctnFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getUhcAccelParamsSetRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getUhcAccelParamsSetResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getUhcAccelParamsGetRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getUhcAccelParamsGetResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getUhcActivationRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getUhcActivationResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getUhcFitParametersSetRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getUhcFitParametersSetResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getUhcFitParametersGetRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 98:
                                    codedInputStream.readMessage(getUhcFitParametersGetResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 106:
                                    codedInputStream.readMessage(getUhcTimeVarsSetRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 114:
                                    codedInputStream.readMessage(getUhcTimeVarsSetResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8192;
                                    continue;
                                case 122:
                                    codedInputStream.readMessage(getHsaFitLogConfigRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16384;
                                    continue;
                                case 130:
                                    codedInputStream.readMessage(getHsaFitLogConfigResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32768;
                                    continue;
                                case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                                    codedInputStream.readMessage(getHsaFitLogCapabilitiesRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 65536;
                                    continue;
                                case 146:
                                    codedInputStream.readMessage(getHsaFitLogCapabilitiesResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 131072;
                                    continue;
                                case 154:
                                    codedInputStream.readMessage(getHsaFeaturesRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                                    continue;
                                case 162:
                                    codedInputStream.readMessage(getHsaFeaturesResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 524288;
                                    continue;
                                case 170:
                                    codedInputStream.readMessage(getHsaFitFileCompressionRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                    continue;
                                case 178:
                                    codedInputStream.readMessage(getHsaFitFileCompressionResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2097152;
                                    continue;
                                case 186:
                                    codedInputStream.readMessage(getHsaGenericRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4194304;
                                    continue;
                                case 194:
                                    codedInputStream.readMessage(getHsaGenericResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8388608;
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

            public Builder mergeHsaFeaturesRequest(HSAFeaturesRequest hSAFeaturesRequest) {
                HSAFeaturesRequest hSAFeaturesRequest2;
                SingleFieldBuilderV3<HSAFeaturesRequest, HSAFeaturesRequest.Builder, HSAFeaturesRequestOrBuilder> singleFieldBuilderV3 = this.hsaFeaturesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(hSAFeaturesRequest);
                } else if ((this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) == 0 || (hSAFeaturesRequest2 = this.hsaFeaturesRequest_) == null || hSAFeaturesRequest2 == HSAFeaturesRequest.getDefaultInstance()) {
                    this.hsaFeaturesRequest_ = hSAFeaturesRequest;
                } else {
                    getHsaFeaturesRequestBuilder().mergeFrom(hSAFeaturesRequest);
                }
                if (this.hsaFeaturesRequest_ != null) {
                    this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                    onChanged();
                }
                return this;
            }

            public Builder mergeHsaFeaturesResponse(HSAFeaturesResponse hSAFeaturesResponse) {
                HSAFeaturesResponse hSAFeaturesResponse2;
                SingleFieldBuilderV3<HSAFeaturesResponse, HSAFeaturesResponse.Builder, HSAFeaturesResponseOrBuilder> singleFieldBuilderV3 = this.hsaFeaturesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(hSAFeaturesResponse);
                } else if ((this.bitField0_ & 524288) == 0 || (hSAFeaturesResponse2 = this.hsaFeaturesResponse_) == null || hSAFeaturesResponse2 == HSAFeaturesResponse.getDefaultInstance()) {
                    this.hsaFeaturesResponse_ = hSAFeaturesResponse;
                } else {
                    getHsaFeaturesResponseBuilder().mergeFrom(hSAFeaturesResponse);
                }
                if (this.hsaFeaturesResponse_ != null) {
                    this.bitField0_ |= 524288;
                    onChanged();
                }
                return this;
            }

            public Builder mergeHsaFileXferNtfctn(HSAFileXferNotification hSAFileXferNotification) {
                HSAFileXferNotification hSAFileXferNotification2;
                SingleFieldBuilderV3<HSAFileXferNotification, HSAFileXferNotification.Builder, HSAFileXferNotificationOrBuilder> singleFieldBuilderV3 = this.hsaFileXferNtfctnBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(hSAFileXferNotification);
                } else if ((this.bitField0_ & 2) == 0 || (hSAFileXferNotification2 = this.hsaFileXferNtfctn_) == null || hSAFileXferNotification2 == HSAFileXferNotification.getDefaultInstance()) {
                    this.hsaFileXferNtfctn_ = hSAFileXferNotification;
                } else {
                    getHsaFileXferNtfctnBuilder().mergeFrom(hSAFileXferNotification);
                }
                if (this.hsaFileXferNtfctn_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeHsaFileXferRequest(HSAFileXferRequest hSAFileXferRequest) {
                HSAFileXferRequest hSAFileXferRequest2;
                SingleFieldBuilderV3<HSAFileXferRequest, HSAFileXferRequest.Builder, HSAFileXferRequestOrBuilder> singleFieldBuilderV3 = this.hsaFileXferRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(hSAFileXferRequest);
                } else if ((this.bitField0_ & 1) == 0 || (hSAFileXferRequest2 = this.hsaFileXferRequest_) == null || hSAFileXferRequest2 == HSAFileXferRequest.getDefaultInstance()) {
                    this.hsaFileXferRequest_ = hSAFileXferRequest;
                } else {
                    getHsaFileXferRequestBuilder().mergeFrom(hSAFileXferRequest);
                }
                if (this.hsaFileXferRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeHsaFitFileCompressionRequest(HSAFitFileCompressionRequest hSAFitFileCompressionRequest) {
                HSAFitFileCompressionRequest hSAFitFileCompressionRequest2;
                SingleFieldBuilderV3<HSAFitFileCompressionRequest, HSAFitFileCompressionRequest.Builder, HSAFitFileCompressionRequestOrBuilder> singleFieldBuilderV3 = this.hsaFitFileCompressionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(hSAFitFileCompressionRequest);
                } else if ((this.bitField0_ & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0 || (hSAFitFileCompressionRequest2 = this.hsaFitFileCompressionRequest_) == null || hSAFitFileCompressionRequest2 == HSAFitFileCompressionRequest.getDefaultInstance()) {
                    this.hsaFitFileCompressionRequest_ = hSAFitFileCompressionRequest;
                } else {
                    getHsaFitFileCompressionRequestBuilder().mergeFrom(hSAFitFileCompressionRequest);
                }
                if (this.hsaFitFileCompressionRequest_ != null) {
                    this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    onChanged();
                }
                return this;
            }

            public Builder mergeHsaFitFileCompressionResponse(HSAFitFileCompressionResponse hSAFitFileCompressionResponse) {
                HSAFitFileCompressionResponse hSAFitFileCompressionResponse2;
                SingleFieldBuilderV3<HSAFitFileCompressionResponse, HSAFitFileCompressionResponse.Builder, HSAFitFileCompressionResponseOrBuilder> singleFieldBuilderV3 = this.hsaFitFileCompressionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(hSAFitFileCompressionResponse);
                } else if ((this.bitField0_ & 2097152) == 0 || (hSAFitFileCompressionResponse2 = this.hsaFitFileCompressionResponse_) == null || hSAFitFileCompressionResponse2 == HSAFitFileCompressionResponse.getDefaultInstance()) {
                    this.hsaFitFileCompressionResponse_ = hSAFitFileCompressionResponse;
                } else {
                    getHsaFitFileCompressionResponseBuilder().mergeFrom(hSAFitFileCompressionResponse);
                }
                if (this.hsaFitFileCompressionResponse_ != null) {
                    this.bitField0_ |= 2097152;
                    onChanged();
                }
                return this;
            }

            public Builder mergeHsaFitLogCapabilitiesRequest(HSAFitLogCapabilitiesRequest hSAFitLogCapabilitiesRequest) {
                HSAFitLogCapabilitiesRequest hSAFitLogCapabilitiesRequest2;
                SingleFieldBuilderV3<HSAFitLogCapabilitiesRequest, HSAFitLogCapabilitiesRequest.Builder, HSAFitLogCapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.hsaFitLogCapabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(hSAFitLogCapabilitiesRequest);
                } else if ((this.bitField0_ & 65536) == 0 || (hSAFitLogCapabilitiesRequest2 = this.hsaFitLogCapabilitiesRequest_) == null || hSAFitLogCapabilitiesRequest2 == HSAFitLogCapabilitiesRequest.getDefaultInstance()) {
                    this.hsaFitLogCapabilitiesRequest_ = hSAFitLogCapabilitiesRequest;
                } else {
                    getHsaFitLogCapabilitiesRequestBuilder().mergeFrom(hSAFitLogCapabilitiesRequest);
                }
                if (this.hsaFitLogCapabilitiesRequest_ != null) {
                    this.bitField0_ |= 65536;
                    onChanged();
                }
                return this;
            }

            public Builder mergeHsaFitLogCapabilitiesResponse(HSAFitLogCapabilitiesResponse hSAFitLogCapabilitiesResponse) {
                HSAFitLogCapabilitiesResponse hSAFitLogCapabilitiesResponse2;
                SingleFieldBuilderV3<HSAFitLogCapabilitiesResponse, HSAFitLogCapabilitiesResponse.Builder, HSAFitLogCapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.hsaFitLogCapabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(hSAFitLogCapabilitiesResponse);
                } else if ((this.bitField0_ & 131072) == 0 || (hSAFitLogCapabilitiesResponse2 = this.hsaFitLogCapabilitiesResponse_) == null || hSAFitLogCapabilitiesResponse2 == HSAFitLogCapabilitiesResponse.getDefaultInstance()) {
                    this.hsaFitLogCapabilitiesResponse_ = hSAFitLogCapabilitiesResponse;
                } else {
                    getHsaFitLogCapabilitiesResponseBuilder().mergeFrom(hSAFitLogCapabilitiesResponse);
                }
                if (this.hsaFitLogCapabilitiesResponse_ != null) {
                    this.bitField0_ |= 131072;
                    onChanged();
                }
                return this;
            }

            public Builder mergeHsaFitLogConfigRequest(HSAFitLogConfigRequest hSAFitLogConfigRequest) {
                HSAFitLogConfigRequest hSAFitLogConfigRequest2;
                SingleFieldBuilderV3<HSAFitLogConfigRequest, HSAFitLogConfigRequest.Builder, HSAFitLogConfigRequestOrBuilder> singleFieldBuilderV3 = this.hsaFitLogConfigRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(hSAFitLogConfigRequest);
                } else if ((this.bitField0_ & 16384) == 0 || (hSAFitLogConfigRequest2 = this.hsaFitLogConfigRequest_) == null || hSAFitLogConfigRequest2 == HSAFitLogConfigRequest.getDefaultInstance()) {
                    this.hsaFitLogConfigRequest_ = hSAFitLogConfigRequest;
                } else {
                    getHsaFitLogConfigRequestBuilder().mergeFrom(hSAFitLogConfigRequest);
                }
                if (this.hsaFitLogConfigRequest_ != null) {
                    this.bitField0_ |= 16384;
                    onChanged();
                }
                return this;
            }

            public Builder mergeHsaFitLogConfigResponse(HSAFitLogConfigResponse hSAFitLogConfigResponse) {
                HSAFitLogConfigResponse hSAFitLogConfigResponse2;
                SingleFieldBuilderV3<HSAFitLogConfigResponse, HSAFitLogConfigResponse.Builder, HSAFitLogConfigResponseOrBuilder> singleFieldBuilderV3 = this.hsaFitLogConfigResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(hSAFitLogConfigResponse);
                } else if ((this.bitField0_ & 32768) == 0 || (hSAFitLogConfigResponse2 = this.hsaFitLogConfigResponse_) == null || hSAFitLogConfigResponse2 == HSAFitLogConfigResponse.getDefaultInstance()) {
                    this.hsaFitLogConfigResponse_ = hSAFitLogConfigResponse;
                } else {
                    getHsaFitLogConfigResponseBuilder().mergeFrom(hSAFitLogConfigResponse);
                }
                if (this.hsaFitLogConfigResponse_ != null) {
                    this.bitField0_ |= 32768;
                    onChanged();
                }
                return this;
            }

            public Builder mergeHsaGenericRequest(HSAGenericRequest hSAGenericRequest) {
                HSAGenericRequest hSAGenericRequest2;
                SingleFieldBuilderV3<HSAGenericRequest, HSAGenericRequest.Builder, HSAGenericRequestOrBuilder> singleFieldBuilderV3 = this.hsaGenericRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(hSAGenericRequest);
                } else if ((this.bitField0_ & 4194304) == 0 || (hSAGenericRequest2 = this.hsaGenericRequest_) == null || hSAGenericRequest2 == HSAGenericRequest.getDefaultInstance()) {
                    this.hsaGenericRequest_ = hSAGenericRequest;
                } else {
                    getHsaGenericRequestBuilder().mergeFrom(hSAGenericRequest);
                }
                if (this.hsaGenericRequest_ != null) {
                    this.bitField0_ |= 4194304;
                    onChanged();
                }
                return this;
            }

            public Builder mergeHsaGenericResponse(HSAGenericResponse hSAGenericResponse) {
                HSAGenericResponse hSAGenericResponse2;
                SingleFieldBuilderV3<HSAGenericResponse, HSAGenericResponse.Builder, HSAGenericResponseOrBuilder> singleFieldBuilderV3 = this.hsaGenericResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(hSAGenericResponse);
                } else if ((this.bitField0_ & 8388608) == 0 || (hSAGenericResponse2 = this.hsaGenericResponse_) == null || hSAGenericResponse2 == HSAGenericResponse.getDefaultInstance()) {
                    this.hsaGenericResponse_ = hSAGenericResponse;
                } else {
                    getHsaGenericResponseBuilder().mergeFrom(hSAGenericResponse);
                }
                if (this.hsaGenericResponse_ != null) {
                    this.bitField0_ |= 8388608;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUhcAccelParamsGetRequest(UHCAccelParametersGetRequest uHCAccelParametersGetRequest) {
                UHCAccelParametersGetRequest uHCAccelParametersGetRequest2;
                SingleFieldBuilderV3<UHCAccelParametersGetRequest, UHCAccelParametersGetRequest.Builder, UHCAccelParametersGetRequestOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsGetRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uHCAccelParametersGetRequest);
                } else if ((this.bitField0_ & 16) == 0 || (uHCAccelParametersGetRequest2 = this.uhcAccelParamsGetRequest_) == null || uHCAccelParametersGetRequest2 == UHCAccelParametersGetRequest.getDefaultInstance()) {
                    this.uhcAccelParamsGetRequest_ = uHCAccelParametersGetRequest;
                } else {
                    getUhcAccelParamsGetRequestBuilder().mergeFrom(uHCAccelParametersGetRequest);
                }
                if (this.uhcAccelParamsGetRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUhcAccelParamsGetResponse(UHCAccelParametersGetResponse uHCAccelParametersGetResponse) {
                UHCAccelParametersGetResponse uHCAccelParametersGetResponse2;
                SingleFieldBuilderV3<UHCAccelParametersGetResponse, UHCAccelParametersGetResponse.Builder, UHCAccelParametersGetResponseOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsGetResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uHCAccelParametersGetResponse);
                } else if ((this.bitField0_ & 32) == 0 || (uHCAccelParametersGetResponse2 = this.uhcAccelParamsGetResponse_) == null || uHCAccelParametersGetResponse2 == UHCAccelParametersGetResponse.getDefaultInstance()) {
                    this.uhcAccelParamsGetResponse_ = uHCAccelParametersGetResponse;
                } else {
                    getUhcAccelParamsGetResponseBuilder().mergeFrom(uHCAccelParametersGetResponse);
                }
                if (this.uhcAccelParamsGetResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUhcAccelParamsSetRequest(UHCAccelParametersSetRequest uHCAccelParametersSetRequest) {
                UHCAccelParametersSetRequest uHCAccelParametersSetRequest2;
                SingleFieldBuilderV3<UHCAccelParametersSetRequest, UHCAccelParametersSetRequest.Builder, UHCAccelParametersSetRequestOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsSetRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uHCAccelParametersSetRequest);
                } else if ((this.bitField0_ & 4) == 0 || (uHCAccelParametersSetRequest2 = this.uhcAccelParamsSetRequest_) == null || uHCAccelParametersSetRequest2 == UHCAccelParametersSetRequest.getDefaultInstance()) {
                    this.uhcAccelParamsSetRequest_ = uHCAccelParametersSetRequest;
                } else {
                    getUhcAccelParamsSetRequestBuilder().mergeFrom(uHCAccelParametersSetRequest);
                }
                if (this.uhcAccelParamsSetRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUhcAccelParamsSetResponse(UHCAccelParametersSetResponse uHCAccelParametersSetResponse) {
                UHCAccelParametersSetResponse uHCAccelParametersSetResponse2;
                SingleFieldBuilderV3<UHCAccelParametersSetResponse, UHCAccelParametersSetResponse.Builder, UHCAccelParametersSetResponseOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsSetResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uHCAccelParametersSetResponse);
                } else if ((this.bitField0_ & 8) == 0 || (uHCAccelParametersSetResponse2 = this.uhcAccelParamsSetResponse_) == null || uHCAccelParametersSetResponse2 == UHCAccelParametersSetResponse.getDefaultInstance()) {
                    this.uhcAccelParamsSetResponse_ = uHCAccelParametersSetResponse;
                } else {
                    getUhcAccelParamsSetResponseBuilder().mergeFrom(uHCAccelParametersSetResponse);
                }
                if (this.uhcAccelParamsSetResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUhcActivationRequest(UHCActivationRequest uHCActivationRequest) {
                UHCActivationRequest uHCActivationRequest2;
                SingleFieldBuilderV3<UHCActivationRequest, UHCActivationRequest.Builder, UHCActivationRequestOrBuilder> singleFieldBuilderV3 = this.uhcActivationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uHCActivationRequest);
                } else if ((this.bitField0_ & 64) == 0 || (uHCActivationRequest2 = this.uhcActivationRequest_) == null || uHCActivationRequest2 == UHCActivationRequest.getDefaultInstance()) {
                    this.uhcActivationRequest_ = uHCActivationRequest;
                } else {
                    getUhcActivationRequestBuilder().mergeFrom(uHCActivationRequest);
                }
                if (this.uhcActivationRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUhcActivationResponse(UHCActivationResponse uHCActivationResponse) {
                UHCActivationResponse uHCActivationResponse2;
                SingleFieldBuilderV3<UHCActivationResponse, UHCActivationResponse.Builder, UHCActivationResponseOrBuilder> singleFieldBuilderV3 = this.uhcActivationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uHCActivationResponse);
                } else if ((this.bitField0_ & 128) == 0 || (uHCActivationResponse2 = this.uhcActivationResponse_) == null || uHCActivationResponse2 == UHCActivationResponse.getDefaultInstance()) {
                    this.uhcActivationResponse_ = uHCActivationResponse;
                } else {
                    getUhcActivationResponseBuilder().mergeFrom(uHCActivationResponse);
                }
                if (this.uhcActivationResponse_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUhcFitParametersGetRequest(UHCFitParametersGetRequest uHCFitParametersGetRequest) {
                UHCFitParametersGetRequest uHCFitParametersGetRequest2;
                SingleFieldBuilderV3<UHCFitParametersGetRequest, UHCFitParametersGetRequest.Builder, UHCFitParametersGetRequestOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersGetRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uHCFitParametersGetRequest);
                } else if ((this.bitField0_ & 1024) == 0 || (uHCFitParametersGetRequest2 = this.uhcFitParametersGetRequest_) == null || uHCFitParametersGetRequest2 == UHCFitParametersGetRequest.getDefaultInstance()) {
                    this.uhcFitParametersGetRequest_ = uHCFitParametersGetRequest;
                } else {
                    getUhcFitParametersGetRequestBuilder().mergeFrom(uHCFitParametersGetRequest);
                }
                if (this.uhcFitParametersGetRequest_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUhcFitParametersGetResponse(UHCFitParametersGetResponse uHCFitParametersGetResponse) {
                UHCFitParametersGetResponse uHCFitParametersGetResponse2;
                SingleFieldBuilderV3<UHCFitParametersGetResponse, UHCFitParametersGetResponse.Builder, UHCFitParametersGetResponseOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersGetResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uHCFitParametersGetResponse);
                } else if ((this.bitField0_ & 2048) == 0 || (uHCFitParametersGetResponse2 = this.uhcFitParametersGetResponse_) == null || uHCFitParametersGetResponse2 == UHCFitParametersGetResponse.getDefaultInstance()) {
                    this.uhcFitParametersGetResponse_ = uHCFitParametersGetResponse;
                } else {
                    getUhcFitParametersGetResponseBuilder().mergeFrom(uHCFitParametersGetResponse);
                }
                if (this.uhcFitParametersGetResponse_ != null) {
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUhcFitParametersSetRequest(UHCFitParametersSetRequest uHCFitParametersSetRequest) {
                UHCFitParametersSetRequest uHCFitParametersSetRequest2;
                SingleFieldBuilderV3<UHCFitParametersSetRequest, UHCFitParametersSetRequest.Builder, UHCFitParametersSetRequestOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersSetRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uHCFitParametersSetRequest);
                } else if ((this.bitField0_ & 256) == 0 || (uHCFitParametersSetRequest2 = this.uhcFitParametersSetRequest_) == null || uHCFitParametersSetRequest2 == UHCFitParametersSetRequest.getDefaultInstance()) {
                    this.uhcFitParametersSetRequest_ = uHCFitParametersSetRequest;
                } else {
                    getUhcFitParametersSetRequestBuilder().mergeFrom(uHCFitParametersSetRequest);
                }
                if (this.uhcFitParametersSetRequest_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUhcFitParametersSetResponse(UHCFitParametersSetResponse uHCFitParametersSetResponse) {
                UHCFitParametersSetResponse uHCFitParametersSetResponse2;
                SingleFieldBuilderV3<UHCFitParametersSetResponse, UHCFitParametersSetResponse.Builder, UHCFitParametersSetResponseOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersSetResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uHCFitParametersSetResponse);
                } else if ((this.bitField0_ & 512) == 0 || (uHCFitParametersSetResponse2 = this.uhcFitParametersSetResponse_) == null || uHCFitParametersSetResponse2 == UHCFitParametersSetResponse.getDefaultInstance()) {
                    this.uhcFitParametersSetResponse_ = uHCFitParametersSetResponse;
                } else {
                    getUhcFitParametersSetResponseBuilder().mergeFrom(uHCFitParametersSetResponse);
                }
                if (this.uhcFitParametersSetResponse_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUhcTimeVarsSetRequest(UHCTimeVarsSetRequest uHCTimeVarsSetRequest) {
                UHCTimeVarsSetRequest uHCTimeVarsSetRequest2;
                SingleFieldBuilderV3<UHCTimeVarsSetRequest, UHCTimeVarsSetRequest.Builder, UHCTimeVarsSetRequestOrBuilder> singleFieldBuilderV3 = this.uhcTimeVarsSetRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uHCTimeVarsSetRequest);
                } else if ((this.bitField0_ & 4096) == 0 || (uHCTimeVarsSetRequest2 = this.uhcTimeVarsSetRequest_) == null || uHCTimeVarsSetRequest2 == UHCTimeVarsSetRequest.getDefaultInstance()) {
                    this.uhcTimeVarsSetRequest_ = uHCTimeVarsSetRequest;
                } else {
                    getUhcTimeVarsSetRequestBuilder().mergeFrom(uHCTimeVarsSetRequest);
                }
                if (this.uhcTimeVarsSetRequest_ != null) {
                    this.bitField0_ |= 4096;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUhcTimeVarsSetResponse(UHCTimeVarsSetResponse uHCTimeVarsSetResponse) {
                UHCTimeVarsSetResponse uHCTimeVarsSetResponse2;
                SingleFieldBuilderV3<UHCTimeVarsSetResponse, UHCTimeVarsSetResponse.Builder, UHCTimeVarsSetResponseOrBuilder> singleFieldBuilderV3 = this.uhcTimeVarsSetResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uHCTimeVarsSetResponse);
                } else if ((this.bitField0_ & 8192) == 0 || (uHCTimeVarsSetResponse2 = this.uhcTimeVarsSetResponse_) == null || uHCTimeVarsSetResponse2 == UHCTimeVarsSetResponse.getDefaultInstance()) {
                    this.uhcTimeVarsSetResponse_ = uHCTimeVarsSetResponse;
                } else {
                    getUhcTimeVarsSetResponseBuilder().mergeFrom(uHCTimeVarsSetResponse);
                }
                if (this.uhcTimeVarsSetResponse_ != null) {
                    this.bitField0_ |= 8192;
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

            public Builder setHsaFeaturesRequest(HSAFeaturesRequest.Builder builder) {
                SingleFieldBuilderV3<HSAFeaturesRequest, HSAFeaturesRequest.Builder, HSAFeaturesRequestOrBuilder> singleFieldBuilderV3 = this.hsaFeaturesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.hsaFeaturesRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                onChanged();
                return this;
            }

            public Builder setHsaFeaturesResponse(HSAFeaturesResponse.Builder builder) {
                SingleFieldBuilderV3<HSAFeaturesResponse, HSAFeaturesResponse.Builder, HSAFeaturesResponseOrBuilder> singleFieldBuilderV3 = this.hsaFeaturesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.hsaFeaturesResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 524288;
                onChanged();
                return this;
            }

            public Builder setHsaFileXferNtfctn(HSAFileXferNotification.Builder builder) {
                SingleFieldBuilderV3<HSAFileXferNotification, HSAFileXferNotification.Builder, HSAFileXferNotificationOrBuilder> singleFieldBuilderV3 = this.hsaFileXferNtfctnBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.hsaFileXferNtfctn_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setHsaFileXferRequest(HSAFileXferRequest.Builder builder) {
                SingleFieldBuilderV3<HSAFileXferRequest, HSAFileXferRequest.Builder, HSAFileXferRequestOrBuilder> singleFieldBuilderV3 = this.hsaFileXferRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.hsaFileXferRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setHsaFitFileCompressionRequest(HSAFitFileCompressionRequest.Builder builder) {
                SingleFieldBuilderV3<HSAFitFileCompressionRequest, HSAFitFileCompressionRequest.Builder, HSAFitFileCompressionRequestOrBuilder> singleFieldBuilderV3 = this.hsaFitFileCompressionRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.hsaFitFileCompressionRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                onChanged();
                return this;
            }

            public Builder setHsaFitFileCompressionResponse(HSAFitFileCompressionResponse.Builder builder) {
                SingleFieldBuilderV3<HSAFitFileCompressionResponse, HSAFitFileCompressionResponse.Builder, HSAFitFileCompressionResponseOrBuilder> singleFieldBuilderV3 = this.hsaFitFileCompressionResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.hsaFitFileCompressionResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2097152;
                onChanged();
                return this;
            }

            public Builder setHsaFitLogCapabilitiesRequest(HSAFitLogCapabilitiesRequest.Builder builder) {
                SingleFieldBuilderV3<HSAFitLogCapabilitiesRequest, HSAFitLogCapabilitiesRequest.Builder, HSAFitLogCapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.hsaFitLogCapabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.hsaFitLogCapabilitiesRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setHsaFitLogCapabilitiesResponse(HSAFitLogCapabilitiesResponse.Builder builder) {
                SingleFieldBuilderV3<HSAFitLogCapabilitiesResponse, HSAFitLogCapabilitiesResponse.Builder, HSAFitLogCapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.hsaFitLogCapabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.hsaFitLogCapabilitiesResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setHsaFitLogConfigRequest(HSAFitLogConfigRequest.Builder builder) {
                SingleFieldBuilderV3<HSAFitLogConfigRequest, HSAFitLogConfigRequest.Builder, HSAFitLogConfigRequestOrBuilder> singleFieldBuilderV3 = this.hsaFitLogConfigRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.hsaFitLogConfigRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setHsaFitLogConfigResponse(HSAFitLogConfigResponse.Builder builder) {
                SingleFieldBuilderV3<HSAFitLogConfigResponse, HSAFitLogConfigResponse.Builder, HSAFitLogConfigResponseOrBuilder> singleFieldBuilderV3 = this.hsaFitLogConfigResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.hsaFitLogConfigResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            public Builder setHsaGenericRequest(HSAGenericRequest.Builder builder) {
                SingleFieldBuilderV3<HSAGenericRequest, HSAGenericRequest.Builder, HSAGenericRequestOrBuilder> singleFieldBuilderV3 = this.hsaGenericRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.hsaGenericRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4194304;
                onChanged();
                return this;
            }

            public Builder setHsaGenericResponse(HSAGenericResponse.Builder builder) {
                SingleFieldBuilderV3<HSAGenericResponse, HSAGenericResponse.Builder, HSAGenericResponseOrBuilder> singleFieldBuilderV3 = this.hsaGenericResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.hsaGenericResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8388608;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setUhcAccelParamsGetRequest(UHCAccelParametersGetRequest.Builder builder) {
                SingleFieldBuilderV3<UHCAccelParametersGetRequest, UHCAccelParametersGetRequest.Builder, UHCAccelParametersGetRequestOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsGetRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.uhcAccelParamsGetRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setUhcAccelParamsGetResponse(UHCAccelParametersGetResponse.Builder builder) {
                SingleFieldBuilderV3<UHCAccelParametersGetResponse, UHCAccelParametersGetResponse.Builder, UHCAccelParametersGetResponseOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsGetResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.uhcAccelParamsGetResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setUhcAccelParamsSetRequest(UHCAccelParametersSetRequest.Builder builder) {
                SingleFieldBuilderV3<UHCAccelParametersSetRequest, UHCAccelParametersSetRequest.Builder, UHCAccelParametersSetRequestOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsSetRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.uhcAccelParamsSetRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setUhcAccelParamsSetResponse(UHCAccelParametersSetResponse.Builder builder) {
                SingleFieldBuilderV3<UHCAccelParametersSetResponse, UHCAccelParametersSetResponse.Builder, UHCAccelParametersSetResponseOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsSetResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.uhcAccelParamsSetResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setUhcActivationRequest(UHCActivationRequest.Builder builder) {
                SingleFieldBuilderV3<UHCActivationRequest, UHCActivationRequest.Builder, UHCActivationRequestOrBuilder> singleFieldBuilderV3 = this.uhcActivationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.uhcActivationRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setUhcActivationResponse(UHCActivationResponse.Builder builder) {
                SingleFieldBuilderV3<UHCActivationResponse, UHCActivationResponse.Builder, UHCActivationResponseOrBuilder> singleFieldBuilderV3 = this.uhcActivationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.uhcActivationResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setUhcFitParametersGetRequest(UHCFitParametersGetRequest.Builder builder) {
                SingleFieldBuilderV3<UHCFitParametersGetRequest, UHCFitParametersGetRequest.Builder, UHCFitParametersGetRequestOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersGetRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.uhcFitParametersGetRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setUhcFitParametersGetResponse(UHCFitParametersGetResponse.Builder builder) {
                SingleFieldBuilderV3<UHCFitParametersGetResponse, UHCFitParametersGetResponse.Builder, UHCFitParametersGetResponseOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersGetResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.uhcFitParametersGetResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setUhcFitParametersSetRequest(UHCFitParametersSetRequest.Builder builder) {
                SingleFieldBuilderV3<UHCFitParametersSetRequest, UHCFitParametersSetRequest.Builder, UHCFitParametersSetRequestOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersSetRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.uhcFitParametersSetRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setUhcFitParametersSetResponse(UHCFitParametersSetResponse.Builder builder) {
                SingleFieldBuilderV3<UHCFitParametersSetResponse, UHCFitParametersSetResponse.Builder, UHCFitParametersSetResponseOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersSetResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.uhcFitParametersSetResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setUhcTimeVarsSetRequest(UHCTimeVarsSetRequest.Builder builder) {
                SingleFieldBuilderV3<UHCTimeVarsSetRequest, UHCTimeVarsSetRequest.Builder, UHCTimeVarsSetRequestOrBuilder> singleFieldBuilderV3 = this.uhcTimeVarsSetRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.uhcTimeVarsSetRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setUhcTimeVarsSetResponse(UHCTimeVarsSetResponse.Builder builder) {
                SingleFieldBuilderV3<UHCTimeVarsSetResponse, UHCTimeVarsSetResponse.Builder, UHCTimeVarsSetResponseOrBuilder> singleFieldBuilderV3 = this.uhcTimeVarsSetResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.uhcTimeVarsSetResponse_ = builder.build();
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
            public HSADataService getDefaultInstanceForType() {
                return HSADataService.getDefaultInstance();
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

            public Builder setHsaFileXferNtfctn(HSAFileXferNotification hSAFileXferNotification) {
                SingleFieldBuilderV3<HSAFileXferNotification, HSAFileXferNotification.Builder, HSAFileXferNotificationOrBuilder> singleFieldBuilderV3 = this.hsaFileXferNtfctnBuilder_;
                if (singleFieldBuilderV3 == null) {
                    hSAFileXferNotification.getClass();
                    this.hsaFileXferNtfctn_ = hSAFileXferNotification;
                } else {
                    singleFieldBuilderV3.setMessage(hSAFileXferNotification);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setHsaFileXferRequest(HSAFileXferRequest hSAFileXferRequest) {
                SingleFieldBuilderV3<HSAFileXferRequest, HSAFileXferRequest.Builder, HSAFileXferRequestOrBuilder> singleFieldBuilderV3 = this.hsaFileXferRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    hSAFileXferRequest.getClass();
                    this.hsaFileXferRequest_ = hSAFileXferRequest;
                } else {
                    singleFieldBuilderV3.setMessage(hSAFileXferRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setHsaFitLogConfigRequest(HSAFitLogConfigRequest hSAFitLogConfigRequest) {
                SingleFieldBuilderV3<HSAFitLogConfigRequest, HSAFitLogConfigRequest.Builder, HSAFitLogConfigRequestOrBuilder> singleFieldBuilderV3 = this.hsaFitLogConfigRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    hSAFitLogConfigRequest.getClass();
                    this.hsaFitLogConfigRequest_ = hSAFitLogConfigRequest;
                } else {
                    singleFieldBuilderV3.setMessage(hSAFitLogConfigRequest);
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setUhcAccelParamsGetRequest(UHCAccelParametersGetRequest uHCAccelParametersGetRequest) {
                SingleFieldBuilderV3<UHCAccelParametersGetRequest, UHCAccelParametersGetRequest.Builder, UHCAccelParametersGetRequestOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsGetRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uHCAccelParametersGetRequest.getClass();
                    this.uhcAccelParamsGetRequest_ = uHCAccelParametersGetRequest;
                } else {
                    singleFieldBuilderV3.setMessage(uHCAccelParametersGetRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setUhcAccelParamsGetResponse(UHCAccelParametersGetResponse uHCAccelParametersGetResponse) {
                SingleFieldBuilderV3<UHCAccelParametersGetResponse, UHCAccelParametersGetResponse.Builder, UHCAccelParametersGetResponseOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsGetResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uHCAccelParametersGetResponse.getClass();
                    this.uhcAccelParamsGetResponse_ = uHCAccelParametersGetResponse;
                } else {
                    singleFieldBuilderV3.setMessage(uHCAccelParametersGetResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setUhcAccelParamsSetRequest(UHCAccelParametersSetRequest uHCAccelParametersSetRequest) {
                SingleFieldBuilderV3<UHCAccelParametersSetRequest, UHCAccelParametersSetRequest.Builder, UHCAccelParametersSetRequestOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsSetRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uHCAccelParametersSetRequest.getClass();
                    this.uhcAccelParamsSetRequest_ = uHCAccelParametersSetRequest;
                } else {
                    singleFieldBuilderV3.setMessage(uHCAccelParametersSetRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setUhcAccelParamsSetResponse(UHCAccelParametersSetResponse uHCAccelParametersSetResponse) {
                SingleFieldBuilderV3<UHCAccelParametersSetResponse, UHCAccelParametersSetResponse.Builder, UHCAccelParametersSetResponseOrBuilder> singleFieldBuilderV3 = this.uhcAccelParamsSetResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uHCAccelParametersSetResponse.getClass();
                    this.uhcAccelParamsSetResponse_ = uHCAccelParametersSetResponse;
                } else {
                    singleFieldBuilderV3.setMessage(uHCAccelParametersSetResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setUhcActivationRequest(UHCActivationRequest uHCActivationRequest) {
                SingleFieldBuilderV3<UHCActivationRequest, UHCActivationRequest.Builder, UHCActivationRequestOrBuilder> singleFieldBuilderV3 = this.uhcActivationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uHCActivationRequest.getClass();
                    this.uhcActivationRequest_ = uHCActivationRequest;
                } else {
                    singleFieldBuilderV3.setMessage(uHCActivationRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setUhcActivationResponse(UHCActivationResponse uHCActivationResponse) {
                SingleFieldBuilderV3<UHCActivationResponse, UHCActivationResponse.Builder, UHCActivationResponseOrBuilder> singleFieldBuilderV3 = this.uhcActivationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uHCActivationResponse.getClass();
                    this.uhcActivationResponse_ = uHCActivationResponse;
                } else {
                    singleFieldBuilderV3.setMessage(uHCActivationResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setUhcFitParametersGetRequest(UHCFitParametersGetRequest uHCFitParametersGetRequest) {
                SingleFieldBuilderV3<UHCFitParametersGetRequest, UHCFitParametersGetRequest.Builder, UHCFitParametersGetRequestOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersGetRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uHCFitParametersGetRequest.getClass();
                    this.uhcFitParametersGetRequest_ = uHCFitParametersGetRequest;
                } else {
                    singleFieldBuilderV3.setMessage(uHCFitParametersGetRequest);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setUhcFitParametersGetResponse(UHCFitParametersGetResponse uHCFitParametersGetResponse) {
                SingleFieldBuilderV3<UHCFitParametersGetResponse, UHCFitParametersGetResponse.Builder, UHCFitParametersGetResponseOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersGetResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uHCFitParametersGetResponse.getClass();
                    this.uhcFitParametersGetResponse_ = uHCFitParametersGetResponse;
                } else {
                    singleFieldBuilderV3.setMessage(uHCFitParametersGetResponse);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setUhcFitParametersSetRequest(UHCFitParametersSetRequest uHCFitParametersSetRequest) {
                SingleFieldBuilderV3<UHCFitParametersSetRequest, UHCFitParametersSetRequest.Builder, UHCFitParametersSetRequestOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersSetRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uHCFitParametersSetRequest.getClass();
                    this.uhcFitParametersSetRequest_ = uHCFitParametersSetRequest;
                } else {
                    singleFieldBuilderV3.setMessage(uHCFitParametersSetRequest);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setUhcFitParametersSetResponse(UHCFitParametersSetResponse uHCFitParametersSetResponse) {
                SingleFieldBuilderV3<UHCFitParametersSetResponse, UHCFitParametersSetResponse.Builder, UHCFitParametersSetResponseOrBuilder> singleFieldBuilderV3 = this.uhcFitParametersSetResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uHCFitParametersSetResponse.getClass();
                    this.uhcFitParametersSetResponse_ = uHCFitParametersSetResponse;
                } else {
                    singleFieldBuilderV3.setMessage(uHCFitParametersSetResponse);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setUhcTimeVarsSetRequest(UHCTimeVarsSetRequest uHCTimeVarsSetRequest) {
                SingleFieldBuilderV3<UHCTimeVarsSetRequest, UHCTimeVarsSetRequest.Builder, UHCTimeVarsSetRequestOrBuilder> singleFieldBuilderV3 = this.uhcTimeVarsSetRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uHCTimeVarsSetRequest.getClass();
                    this.uhcTimeVarsSetRequest_ = uHCTimeVarsSetRequest;
                } else {
                    singleFieldBuilderV3.setMessage(uHCTimeVarsSetRequest);
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setUhcTimeVarsSetResponse(UHCTimeVarsSetResponse uHCTimeVarsSetResponse) {
                SingleFieldBuilderV3<UHCTimeVarsSetResponse, UHCTimeVarsSetResponse.Builder, UHCTimeVarsSetResponseOrBuilder> singleFieldBuilderV3 = this.uhcTimeVarsSetResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uHCTimeVarsSetResponse.getClass();
                    this.uhcTimeVarsSetResponse_ = uHCTimeVarsSetResponse;
                } else {
                    singleFieldBuilderV3.setMessage(uHCTimeVarsSetResponse);
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setHsaFeaturesRequest(HSAFeaturesRequest hSAFeaturesRequest) {
                SingleFieldBuilderV3<HSAFeaturesRequest, HSAFeaturesRequest.Builder, HSAFeaturesRequestOrBuilder> singleFieldBuilderV3 = this.hsaFeaturesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    hSAFeaturesRequest.getClass();
                    this.hsaFeaturesRequest_ = hSAFeaturesRequest;
                } else {
                    singleFieldBuilderV3.setMessage(hSAFeaturesRequest);
                }
                this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                onChanged();
                return this;
            }

            public Builder setHsaFeaturesResponse(HSAFeaturesResponse hSAFeaturesResponse) {
                SingleFieldBuilderV3<HSAFeaturesResponse, HSAFeaturesResponse.Builder, HSAFeaturesResponseOrBuilder> singleFieldBuilderV3 = this.hsaFeaturesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    hSAFeaturesResponse.getClass();
                    this.hsaFeaturesResponse_ = hSAFeaturesResponse;
                } else {
                    singleFieldBuilderV3.setMessage(hSAFeaturesResponse);
                }
                this.bitField0_ |= 524288;
                onChanged();
                return this;
            }

            public Builder setHsaFitFileCompressionRequest(HSAFitFileCompressionRequest hSAFitFileCompressionRequest) {
                SingleFieldBuilderV3<HSAFitFileCompressionRequest, HSAFitFileCompressionRequest.Builder, HSAFitFileCompressionRequestOrBuilder> singleFieldBuilderV3 = this.hsaFitFileCompressionRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    hSAFitFileCompressionRequest.getClass();
                    this.hsaFitFileCompressionRequest_ = hSAFitFileCompressionRequest;
                } else {
                    singleFieldBuilderV3.setMessage(hSAFitFileCompressionRequest);
                }
                this.bitField0_ |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                onChanged();
                return this;
            }

            public Builder setHsaFitFileCompressionResponse(HSAFitFileCompressionResponse hSAFitFileCompressionResponse) {
                SingleFieldBuilderV3<HSAFitFileCompressionResponse, HSAFitFileCompressionResponse.Builder, HSAFitFileCompressionResponseOrBuilder> singleFieldBuilderV3 = this.hsaFitFileCompressionResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    hSAFitFileCompressionResponse.getClass();
                    this.hsaFitFileCompressionResponse_ = hSAFitFileCompressionResponse;
                } else {
                    singleFieldBuilderV3.setMessage(hSAFitFileCompressionResponse);
                }
                this.bitField0_ |= 2097152;
                onChanged();
                return this;
            }

            public Builder setHsaFitLogCapabilitiesRequest(HSAFitLogCapabilitiesRequest hSAFitLogCapabilitiesRequest) {
                SingleFieldBuilderV3<HSAFitLogCapabilitiesRequest, HSAFitLogCapabilitiesRequest.Builder, HSAFitLogCapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.hsaFitLogCapabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    hSAFitLogCapabilitiesRequest.getClass();
                    this.hsaFitLogCapabilitiesRequest_ = hSAFitLogCapabilitiesRequest;
                } else {
                    singleFieldBuilderV3.setMessage(hSAFitLogCapabilitiesRequest);
                }
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setHsaFitLogCapabilitiesResponse(HSAFitLogCapabilitiesResponse hSAFitLogCapabilitiesResponse) {
                SingleFieldBuilderV3<HSAFitLogCapabilitiesResponse, HSAFitLogCapabilitiesResponse.Builder, HSAFitLogCapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.hsaFitLogCapabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    hSAFitLogCapabilitiesResponse.getClass();
                    this.hsaFitLogCapabilitiesResponse_ = hSAFitLogCapabilitiesResponse;
                } else {
                    singleFieldBuilderV3.setMessage(hSAFitLogCapabilitiesResponse);
                }
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setHsaGenericRequest(HSAGenericRequest hSAGenericRequest) {
                SingleFieldBuilderV3<HSAGenericRequest, HSAGenericRequest.Builder, HSAGenericRequestOrBuilder> singleFieldBuilderV3 = this.hsaGenericRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    hSAGenericRequest.getClass();
                    this.hsaGenericRequest_ = hSAGenericRequest;
                } else {
                    singleFieldBuilderV3.setMessage(hSAGenericRequest);
                }
                this.bitField0_ |= 4194304;
                onChanged();
                return this;
            }

            public Builder setHsaGenericResponse(HSAGenericResponse hSAGenericResponse) {
                SingleFieldBuilderV3<HSAGenericResponse, HSAGenericResponse.Builder, HSAGenericResponseOrBuilder> singleFieldBuilderV3 = this.hsaGenericResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    hSAGenericResponse.getClass();
                    this.hsaGenericResponse_ = hSAGenericResponse;
                } else {
                    singleFieldBuilderV3.setMessage(hSAGenericResponse);
                }
                this.bitField0_ |= 8388608;
                onChanged();
                return this;
            }

            public Builder setHsaFitLogConfigResponse(HSAFitLogConfigResponse hSAFitLogConfigResponse) {
                SingleFieldBuilderV3<HSAFitLogConfigResponse, HSAFitLogConfigResponse.Builder, HSAFitLogConfigResponseOrBuilder> singleFieldBuilderV3 = this.hsaFitLogConfigResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    hSAFitLogConfigResponse.getClass();
                    this.hsaFitLogConfigResponse_ = hSAFitLogConfigResponse;
                } else {
                    singleFieldBuilderV3.setMessage(hSAFitLogConfigResponse);
                }
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof HSADataService) {
                    return mergeFrom((HSADataService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HSADataService hSADataService) {
                if (hSADataService == HSADataService.getDefaultInstance()) {
                    return this;
                }
                if (hSADataService.hasHsaFileXferRequest()) {
                    mergeHsaFileXferRequest(hSADataService.getHsaFileXferRequest());
                }
                if (hSADataService.hasHsaFileXferNtfctn()) {
                    mergeHsaFileXferNtfctn(hSADataService.getHsaFileXferNtfctn());
                }
                if (hSADataService.hasUhcAccelParamsSetRequest()) {
                    mergeUhcAccelParamsSetRequest(hSADataService.getUhcAccelParamsSetRequest());
                }
                if (hSADataService.hasUhcAccelParamsSetResponse()) {
                    mergeUhcAccelParamsSetResponse(hSADataService.getUhcAccelParamsSetResponse());
                }
                if (hSADataService.hasUhcAccelParamsGetRequest()) {
                    mergeUhcAccelParamsGetRequest(hSADataService.getUhcAccelParamsGetRequest());
                }
                if (hSADataService.hasUhcAccelParamsGetResponse()) {
                    mergeUhcAccelParamsGetResponse(hSADataService.getUhcAccelParamsGetResponse());
                }
                if (hSADataService.hasUhcActivationRequest()) {
                    mergeUhcActivationRequest(hSADataService.getUhcActivationRequest());
                }
                if (hSADataService.hasUhcActivationResponse()) {
                    mergeUhcActivationResponse(hSADataService.getUhcActivationResponse());
                }
                if (hSADataService.hasUhcFitParametersSetRequest()) {
                    mergeUhcFitParametersSetRequest(hSADataService.getUhcFitParametersSetRequest());
                }
                if (hSADataService.hasUhcFitParametersSetResponse()) {
                    mergeUhcFitParametersSetResponse(hSADataService.getUhcFitParametersSetResponse());
                }
                if (hSADataService.hasUhcFitParametersGetRequest()) {
                    mergeUhcFitParametersGetRequest(hSADataService.getUhcFitParametersGetRequest());
                }
                if (hSADataService.hasUhcFitParametersGetResponse()) {
                    mergeUhcFitParametersGetResponse(hSADataService.getUhcFitParametersGetResponse());
                }
                if (hSADataService.hasUhcTimeVarsSetRequest()) {
                    mergeUhcTimeVarsSetRequest(hSADataService.getUhcTimeVarsSetRequest());
                }
                if (hSADataService.hasUhcTimeVarsSetResponse()) {
                    mergeUhcTimeVarsSetResponse(hSADataService.getUhcTimeVarsSetResponse());
                }
                if (hSADataService.hasHsaFitLogConfigRequest()) {
                    mergeHsaFitLogConfigRequest(hSADataService.getHsaFitLogConfigRequest());
                }
                if (hSADataService.hasHsaFitLogConfigResponse()) {
                    mergeHsaFitLogConfigResponse(hSADataService.getHsaFitLogConfigResponse());
                }
                if (hSADataService.hasHsaFitLogCapabilitiesRequest()) {
                    mergeHsaFitLogCapabilitiesRequest(hSADataService.getHsaFitLogCapabilitiesRequest());
                }
                if (hSADataService.hasHsaFitLogCapabilitiesResponse()) {
                    mergeHsaFitLogCapabilitiesResponse(hSADataService.getHsaFitLogCapabilitiesResponse());
                }
                if (hSADataService.hasHsaFeaturesRequest()) {
                    mergeHsaFeaturesRequest(hSADataService.getHsaFeaturesRequest());
                }
                if (hSADataService.hasHsaFeaturesResponse()) {
                    mergeHsaFeaturesResponse(hSADataService.getHsaFeaturesResponse());
                }
                if (hSADataService.hasHsaFitFileCompressionRequest()) {
                    mergeHsaFitFileCompressionRequest(hSADataService.getHsaFitFileCompressionRequest());
                }
                if (hSADataService.hasHsaFitFileCompressionResponse()) {
                    mergeHsaFitFileCompressionResponse(hSADataService.getHsaFitFileCompressionResponse());
                }
                if (hSADataService.hasHsaGenericRequest()) {
                    mergeHsaGenericRequest(hSADataService.getHsaGenericRequest());
                }
                if (hSADataService.hasHsaGenericResponse()) {
                    mergeHsaGenericResponse(hSADataService.getHsaGenericResponse());
                }
                mergeUnknownFields(hSADataService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HSADataService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ HSADataService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private HSADataService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HSADataService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSADataService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSADataService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static HSADataService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HSADataService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static HSADataService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static HSADataService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static HSADataService parseFrom(InputStream inputStream) {
            return (HSADataService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static HSADataService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSADataService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSADataService parseFrom(CodedInputStream codedInputStream) {
            return (HSADataService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HSADataService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSADataService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class HSAFeaturesResponse extends GeneratedMessageV3 implements HSAFeaturesResponseOrBuilder {
        public static final int FEATURES_BF_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int featuresBf_;
        private byte memoizedIsInitialized;
        private int status_;
        private static final HSAFeaturesResponse DEFAULT_INSTANCE = new HSAFeaturesResponse();

        @Deprecated
        public static final Parser<HSAFeaturesResponse> PARSER = new AbstractParser<HSAFeaturesResponse>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAFeaturesResponse.1
            @Override // com.google.protobuf.Parser
            public HSAFeaturesResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HSAFeaturesResponse.newBuilder();
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

        private HSAFeaturesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.featuresBf_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HSAFeaturesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFeaturesResponse_descriptor;
        }

        public static Builder newBuilder(HSAFeaturesResponse hSAFeaturesResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hSAFeaturesResponse);
        }

        public static HSAFeaturesResponse parseDelimitedFrom(InputStream inputStream) {
            return (HSAFeaturesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HSAFeaturesResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HSAFeaturesResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HSAFeaturesResponse)) {
                return super.equals(obj);
            }
            HSAFeaturesResponse hSAFeaturesResponse = (HSAFeaturesResponse) obj;
            if (hasStatus() != hSAFeaturesResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == hSAFeaturesResponse.status_) && hasFeaturesBf() == hSAFeaturesResponse.hasFeaturesBf()) {
                return (!hasFeaturesBf() || getFeaturesBf() == hSAFeaturesResponse.getFeaturesBf()) && getUnknownFields().equals(hSAFeaturesResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFeaturesResponseOrBuilder
        public int getFeaturesBf() {
            return this.featuresBf_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HSAFeaturesResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.featuresBf_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFeaturesResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFeaturesResponseOrBuilder
        public boolean hasFeaturesBf() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFeaturesResponseOrBuilder
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
            if (hasFeaturesBf()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getFeaturesBf();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFeaturesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAFeaturesResponse.class, Builder.class);
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
            if (!hasStatus()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasFeaturesBf()) {
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
            return new HSAFeaturesResponse();
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
                codedOutputStream.writeUInt32(2, this.featuresBf_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HSAFeaturesResponseOrBuilder {
            private int bitField0_;
            private int featuresBf_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(HSAFeaturesResponse hSAFeaturesResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    hSAFeaturesResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    hSAFeaturesResponse.featuresBf_ = this.featuresBf_;
                    i14 |= 2;
                }
                hSAFeaturesResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFeaturesResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAFeaturesResponse build() {
                HSAFeaturesResponse hSAFeaturesResponseBuildPartial = buildPartial();
                if (hSAFeaturesResponseBuildPartial.isInitialized()) {
                    return hSAFeaturesResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) hSAFeaturesResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAFeaturesResponse buildPartial() {
                HSAFeaturesResponse hSAFeaturesResponse = new HSAFeaturesResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(hSAFeaturesResponse);
                }
                onBuilt();
                return hSAFeaturesResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.featuresBf_ = 0;
                return this;
            }

            public Builder clearFeaturesBf() {
                this.bitField0_ &= -3;
                this.featuresBf_ = 0;
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
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFeaturesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFeaturesResponseOrBuilder
            public int getFeaturesBf() {
                return this.featuresBf_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFeaturesResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFeaturesResponseOrBuilder
            public boolean hasFeaturesBf() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFeaturesResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFeaturesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAFeaturesResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStatus() && hasFeaturesBf();
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
                                    this.featuresBf_ = codedInputStream.readUInt32();
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

            public Builder setFeaturesBf(int i14) {
                this.featuresBf_ = i14;
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
            public HSAFeaturesResponse getDefaultInstanceForType() {
                return HSAFeaturesResponse.getDefaultInstance();
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
                if (message instanceof HSAFeaturesResponse) {
                    return mergeFrom((HSAFeaturesResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HSAFeaturesResponse hSAFeaturesResponse) {
                if (hSAFeaturesResponse == HSAFeaturesResponse.getDefaultInstance()) {
                    return this;
                }
                if (hSAFeaturesResponse.hasStatus()) {
                    setStatus(hSAFeaturesResponse.getStatus());
                }
                if (hSAFeaturesResponse.hasFeaturesBf()) {
                    setFeaturesBf(hSAFeaturesResponse.getFeaturesBf());
                }
                mergeUnknownFields(hSAFeaturesResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HSAFeaturesResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static HSAFeaturesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFeaturesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAFeaturesResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static HSAFeaturesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HSAFeaturesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ HSAFeaturesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static HSAFeaturesResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private HSAFeaturesResponse() {
            this.featuresBf_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static HSAFeaturesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static HSAFeaturesResponse parseFrom(InputStream inputStream) {
            return (HSAFeaturesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static HSAFeaturesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFeaturesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAFeaturesResponse parseFrom(CodedInputStream codedInputStream) {
            return (HSAFeaturesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HSAFeaturesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFeaturesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN_RESPONSE_STATUS(0),
            OK(100),
            ERROR(200),
            UNSUPPORTED(300);

            public static final int ERROR_VALUE = 200;
            public static final int OK_VALUE = 100;
            public static final int UNKNOWN_RESPONSE_STATUS_VALUE = 0;
            public static final int UNSUPPORTED_VALUE = 300;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAFeaturesResponse.ResponseStatus.1
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
                    return UNKNOWN_RESPONSE_STATUS;
                }
                if (i14 == 100) {
                    return OK;
                }
                if (i14 == 200) {
                    return ERROR;
                }
                if (i14 != 300) {
                    return null;
                }
                return UNSUPPORTED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return HSAFeaturesResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class HSAFileXferNotification extends GeneratedMessageV3 implements HSAFileXferNotificationOrBuilder {
        public static final int FILE_XFER_LIST_FIELD_NUMBER = 1;
        public static final int TOTAL_FILE_COUNT_FIELD_NUMBER = 2;
        public static final int TOTAL_FILE_SIZE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private List<HSADataTransferItem> fileXferList_;
        private byte memoizedIsInitialized;
        private int totalFileCount_;
        private int totalFileSize_;
        private static final HSAFileXferNotification DEFAULT_INSTANCE = new HSAFileXferNotification();

        @Deprecated
        public static final Parser<HSAFileXferNotification> PARSER = new AbstractParser<HSAFileXferNotification>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAFileXferNotification.1
            @Override // com.google.protobuf.Parser
            public HSAFileXferNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HSAFileXferNotification.newBuilder();
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

        private HSAFileXferNotification() {
            this.totalFileCount_ = 0;
            this.totalFileSize_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.fileXferList_ = Collections.EMPTY_LIST;
        }

        public static HSAFileXferNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFileXferNotification_descriptor;
        }

        public static Builder newBuilder(HSAFileXferNotification hSAFileXferNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hSAFileXferNotification);
        }

        public static HSAFileXferNotification parseDelimitedFrom(InputStream inputStream) {
            return (HSAFileXferNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HSAFileXferNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HSAFileXferNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HSAFileXferNotification)) {
                return super.equals(obj);
            }
            HSAFileXferNotification hSAFileXferNotification = (HSAFileXferNotification) obj;
            if (!getFileXferListList().equals(hSAFileXferNotification.getFileXferListList()) || hasTotalFileCount() != hSAFileXferNotification.hasTotalFileCount()) {
                return false;
            }
            if ((!hasTotalFileCount() || getTotalFileCount() == hSAFileXferNotification.getTotalFileCount()) && hasTotalFileSize() == hSAFileXferNotification.hasTotalFileSize()) {
                return (!hasTotalFileSize() || getTotalFileSize() == hSAFileXferNotification.getTotalFileSize()) && getUnknownFields().equals(hSAFileXferNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferNotificationOrBuilder
        public HSADataTransferItem getFileXferList(int i14) {
            return this.fileXferList_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferNotificationOrBuilder
        public int getFileXferListCount() {
            return this.fileXferList_.size();
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferNotificationOrBuilder
        public List<HSADataTransferItem> getFileXferListList() {
            return this.fileXferList_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferNotificationOrBuilder
        public HSADataTransferItemOrBuilder getFileXferListOrBuilder(int i14) {
            return this.fileXferList_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferNotificationOrBuilder
        public List<? extends HSADataTransferItemOrBuilder> getFileXferListOrBuilderList() {
            return this.fileXferList_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HSAFileXferNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = 0;
            for (int i15 = 0; i15 < this.fileXferList_.size(); i15++) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(1, this.fileXferList_.get(i15));
            }
            if ((this.bitField0_ & 1) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.totalFileCount_);
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.totalFileSize_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferNotificationOrBuilder
        public int getTotalFileCount() {
            return this.totalFileCount_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferNotificationOrBuilder
        public int getTotalFileSize() {
            return this.totalFileSize_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferNotificationOrBuilder
        public boolean hasTotalFileCount() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferNotificationOrBuilder
        public boolean hasTotalFileSize() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getFileXferListCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getFileXferListList().hashCode();
            }
            if (hasTotalFileCount()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTotalFileCount();
            }
            if (hasTotalFileSize()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getTotalFileSize();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFileXferNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAFileXferNotification.class, Builder.class);
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
            for (int i14 = 0; i14 < getFileXferListCount(); i14++) {
                if (!getFileXferList(i14).isInitialized()) {
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
            return new HSAFileXferNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.fileXferList_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.fileXferList_.get(i14));
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(2, this.totalFileCount_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(3, this.totalFileSize_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HSAFileXferNotificationOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<HSADataTransferItem, HSADataTransferItem.Builder, HSADataTransferItemOrBuilder> fileXferListBuilder_;
            private List<HSADataTransferItem> fileXferList_;
            private int totalFileCount_;
            private int totalFileSize_;

            private Builder() {
                this.fileXferList_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(HSAFileXferNotification hSAFileXferNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 2) != 0) {
                    hSAFileXferNotification.totalFileCount_ = this.totalFileCount_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 4) != 0) {
                    hSAFileXferNotification.totalFileSize_ = this.totalFileSize_;
                    i14 |= 2;
                }
                hSAFileXferNotification.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(HSAFileXferNotification hSAFileXferNotification) {
                RepeatedFieldBuilderV3<HSADataTransferItem, HSADataTransferItem.Builder, HSADataTransferItemOrBuilder> repeatedFieldBuilderV3 = this.fileXferListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    hSAFileXferNotification.fileXferList_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.fileXferList_ = Collections.unmodifiableList(this.fileXferList_);
                    this.bitField0_ &= -2;
                }
                hSAFileXferNotification.fileXferList_ = this.fileXferList_;
            }

            private void ensureFileXferListIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.fileXferList_ = new ArrayList(this.fileXferList_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFileXferNotification_descriptor;
            }

            private RepeatedFieldBuilderV3<HSADataTransferItem, HSADataTransferItem.Builder, HSADataTransferItemOrBuilder> getFileXferListFieldBuilder() {
                if (this.fileXferListBuilder_ == null) {
                    this.fileXferListBuilder_ = new RepeatedFieldBuilderV3<>(this.fileXferList_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.fileXferList_ = null;
                }
                return this.fileXferListBuilder_;
            }

            public Builder addAllFileXferList(Iterable<? extends HSADataTransferItem> iterable) {
                RepeatedFieldBuilderV3<HSADataTransferItem, HSADataTransferItem.Builder, HSADataTransferItemOrBuilder> repeatedFieldBuilderV3 = this.fileXferListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureFileXferListIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.fileXferList_);
                onChanged();
                return this;
            }

            public Builder addFileXferList(HSADataTransferItem.Builder builder) {
                RepeatedFieldBuilderV3<HSADataTransferItem, HSADataTransferItem.Builder, HSADataTransferItemOrBuilder> repeatedFieldBuilderV3 = this.fileXferListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureFileXferListIsMutable();
                this.fileXferList_.add(builder.build());
                onChanged();
                return this;
            }

            public HSADataTransferItem.Builder addFileXferListBuilder() {
                return (HSADataTransferItem.Builder) getFileXferListFieldBuilder().addBuilder(HSADataTransferItem.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAFileXferNotification build() {
                HSAFileXferNotification hSAFileXferNotificationBuildPartial = buildPartial();
                if (hSAFileXferNotificationBuildPartial.isInitialized()) {
                    return hSAFileXferNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) hSAFileXferNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAFileXferNotification buildPartial() {
                HSAFileXferNotification hSAFileXferNotification = new HSAFileXferNotification(this);
                buildPartialRepeatedFields(hSAFileXferNotification);
                if (this.bitField0_ != 0) {
                    buildPartial0(hSAFileXferNotification);
                }
                onBuilt();
                return hSAFileXferNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<HSADataTransferItem, HSADataTransferItem.Builder, HSADataTransferItemOrBuilder> repeatedFieldBuilderV3 = this.fileXferListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.fileXferList_ = Collections.EMPTY_LIST;
                } else {
                    this.fileXferList_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                this.totalFileCount_ = 0;
                this.totalFileSize_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFileXferList() {
                RepeatedFieldBuilderV3<HSADataTransferItem, HSADataTransferItem.Builder, HSADataTransferItemOrBuilder> repeatedFieldBuilderV3 = this.fileXferListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.fileXferList_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearTotalFileCount() {
                this.bitField0_ &= -3;
                this.totalFileCount_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTotalFileSize() {
                this.bitField0_ &= -5;
                this.totalFileSize_ = 0;
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
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFileXferNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferNotificationOrBuilder
            public HSADataTransferItem getFileXferList(int i14) {
                RepeatedFieldBuilderV3<HSADataTransferItem, HSADataTransferItem.Builder, HSADataTransferItemOrBuilder> repeatedFieldBuilderV3 = this.fileXferListBuilder_;
                return repeatedFieldBuilderV3 == null ? this.fileXferList_.get(i14) : (HSADataTransferItem) repeatedFieldBuilderV3.getMessage(i14);
            }

            public HSADataTransferItem.Builder getFileXferListBuilder(int i14) {
                return (HSADataTransferItem.Builder) getFileXferListFieldBuilder().getBuilder(i14);
            }

            public List<HSADataTransferItem.Builder> getFileXferListBuilderList() {
                return getFileXferListFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferNotificationOrBuilder
            public int getFileXferListCount() {
                RepeatedFieldBuilderV3<HSADataTransferItem, HSADataTransferItem.Builder, HSADataTransferItemOrBuilder> repeatedFieldBuilderV3 = this.fileXferListBuilder_;
                return repeatedFieldBuilderV3 == null ? this.fileXferList_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferNotificationOrBuilder
            public List<HSADataTransferItem> getFileXferListList() {
                RepeatedFieldBuilderV3<HSADataTransferItem, HSADataTransferItem.Builder, HSADataTransferItemOrBuilder> repeatedFieldBuilderV3 = this.fileXferListBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.fileXferList_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferNotificationOrBuilder
            public HSADataTransferItemOrBuilder getFileXferListOrBuilder(int i14) {
                RepeatedFieldBuilderV3<HSADataTransferItem, HSADataTransferItem.Builder, HSADataTransferItemOrBuilder> repeatedFieldBuilderV3 = this.fileXferListBuilder_;
                return repeatedFieldBuilderV3 == null ? this.fileXferList_.get(i14) : (HSADataTransferItemOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferNotificationOrBuilder
            public List<? extends HSADataTransferItemOrBuilder> getFileXferListOrBuilderList() {
                RepeatedFieldBuilderV3<HSADataTransferItem, HSADataTransferItem.Builder, HSADataTransferItemOrBuilder> repeatedFieldBuilderV3 = this.fileXferListBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.fileXferList_);
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferNotificationOrBuilder
            public int getTotalFileCount() {
                return this.totalFileCount_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferNotificationOrBuilder
            public int getTotalFileSize() {
                return this.totalFileSize_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferNotificationOrBuilder
            public boolean hasTotalFileCount() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferNotificationOrBuilder
            public boolean hasTotalFileSize() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFileXferNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAFileXferNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getFileXferListCount(); i14++) {
                    if (!getFileXferList(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(HSAFileXferNotification hSAFileXferNotification) {
                if (hSAFileXferNotification == HSAFileXferNotification.getDefaultInstance()) {
                    return this;
                }
                if (this.fileXferListBuilder_ == null) {
                    if (!hSAFileXferNotification.fileXferList_.isEmpty()) {
                        if (this.fileXferList_.isEmpty()) {
                            this.fileXferList_ = hSAFileXferNotification.fileXferList_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureFileXferListIsMutable();
                            this.fileXferList_.addAll(hSAFileXferNotification.fileXferList_);
                        }
                        onChanged();
                    }
                } else if (!hSAFileXferNotification.fileXferList_.isEmpty()) {
                    boolean zIsEmpty = this.fileXferListBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<HSADataTransferItem, HSADataTransferItem.Builder, HSADataTransferItemOrBuilder> repeatedFieldBuilderV3 = this.fileXferListBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.fileXferListBuilder_ = null;
                        this.fileXferList_ = hSAFileXferNotification.fileXferList_;
                        this.bitField0_ &= -2;
                        this.fileXferListBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getFileXferListFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(hSAFileXferNotification.fileXferList_);
                    }
                }
                if (hSAFileXferNotification.hasTotalFileCount()) {
                    setTotalFileCount(hSAFileXferNotification.getTotalFileCount());
                }
                if (hSAFileXferNotification.hasTotalFileSize()) {
                    setTotalFileSize(hSAFileXferNotification.getTotalFileSize());
                }
                mergeUnknownFields(hSAFileXferNotification.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeFileXferList(int i14) {
                RepeatedFieldBuilderV3<HSADataTransferItem, HSADataTransferItem.Builder, HSADataTransferItemOrBuilder> repeatedFieldBuilderV3 = this.fileXferListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureFileXferListIsMutable();
                this.fileXferList_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setFileXferList(int i14, HSADataTransferItem.Builder builder) {
                RepeatedFieldBuilderV3<HSADataTransferItem, HSADataTransferItem.Builder, HSADataTransferItemOrBuilder> repeatedFieldBuilderV3 = this.fileXferListBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureFileXferListIsMutable();
                this.fileXferList_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTotalFileCount(int i14) {
                this.totalFileCount_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTotalFileSize(int i14) {
                this.totalFileSize_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public HSAFileXferNotification getDefaultInstanceForType() {
                return HSAFileXferNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.fileXferList_ = Collections.EMPTY_LIST;
            }

            public HSADataTransferItem.Builder addFileXferListBuilder(int i14) {
                return (HSADataTransferItem.Builder) getFileXferListFieldBuilder().addBuilder(i14, HSADataTransferItem.getDefaultInstance());
            }

            public Builder addFileXferList(int i14, HSADataTransferItem hSADataTransferItem) {
                RepeatedFieldBuilderV3<HSADataTransferItem, HSADataTransferItem.Builder, HSADataTransferItemOrBuilder> repeatedFieldBuilderV3 = this.fileXferListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    hSADataTransferItem.getClass();
                    ensureFileXferListIsMutable();
                    this.fileXferList_.add(i14, hSADataTransferItem);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, hSADataTransferItem);
                return this;
            }

            public Builder setFileXferList(int i14, HSADataTransferItem hSADataTransferItem) {
                RepeatedFieldBuilderV3<HSADataTransferItem, HSADataTransferItem.Builder, HSADataTransferItemOrBuilder> repeatedFieldBuilderV3 = this.fileXferListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    hSADataTransferItem.getClass();
                    ensureFileXferListIsMutable();
                    this.fileXferList_.set(i14, hSADataTransferItem);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, hSADataTransferItem);
                return this;
            }

            public Builder addFileXferList(HSADataTransferItem hSADataTransferItem) {
                RepeatedFieldBuilderV3<HSADataTransferItem, HSADataTransferItem.Builder, HSADataTransferItemOrBuilder> repeatedFieldBuilderV3 = this.fileXferListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    hSADataTransferItem.getClass();
                    ensureFileXferListIsMutable();
                    this.fileXferList_.add(hSADataTransferItem);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(hSADataTransferItem);
                return this;
            }

            public Builder addFileXferList(int i14, HSADataTransferItem.Builder builder) {
                RepeatedFieldBuilderV3<HSADataTransferItem, HSADataTransferItem.Builder, HSADataTransferItemOrBuilder> repeatedFieldBuilderV3 = this.fileXferListBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFileXferListIsMutable();
                    this.fileXferList_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof HSAFileXferNotification) {
                    return mergeFrom((HSAFileXferNotification) message);
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
                                    HSADataTransferItem hSADataTransferItem = (HSADataTransferItem) codedInputStream.readMessage(HSADataTransferItem.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<HSADataTransferItem, HSADataTransferItem.Builder, HSADataTransferItemOrBuilder> repeatedFieldBuilderV3 = this.fileXferListBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureFileXferListIsMutable();
                                        this.fileXferList_.add(hSADataTransferItem);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(hSADataTransferItem);
                                    }
                                } else if (tag == 16) {
                                    this.totalFileCount_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.totalFileSize_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
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
        public HSAFileXferNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static HSAFileXferNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFileXferNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAFileXferNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static HSAFileXferNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HSAFileXferNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static HSAFileXferNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static HSAFileXferNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static HSAFileXferNotification parseFrom(InputStream inputStream) {
            return (HSAFileXferNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private HSAFileXferNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.totalFileCount_ = 0;
            this.totalFileSize_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HSAFileXferNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFileXferNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAFileXferNotification parseFrom(CodedInputStream codedInputStream) {
            return (HSAFileXferNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ HSAFileXferNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static HSAFileXferNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFileXferNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class HSAFileXferRequest extends GeneratedMessageV3 implements HSAFileXferRequestOrBuilder {
        private static final HSAFileXferRequest DEFAULT_INSTANCE = new HSAFileXferRequest();

        @Deprecated
        public static final Parser<HSAFileXferRequest> PARSER = new AbstractParser<HSAFileXferRequest>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAFileXferRequest.1
            @Override // com.google.protobuf.Parser
            public HSAFileXferRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HSAFileXferRequest.newBuilder();
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
        public static final int REQUEST_SYNC_FIELD_NUMBER = 1;
        public static final int REQUEST_TYPE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private boolean requestSync_;
        private int requestType_;

        private HSAFileXferRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.requestSync_ = false;
            this.requestType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HSAFileXferRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFileXferRequest_descriptor;
        }

        public static Builder newBuilder(HSAFileXferRequest hSAFileXferRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hSAFileXferRequest);
        }

        public static HSAFileXferRequest parseDelimitedFrom(InputStream inputStream) {
            return (HSAFileXferRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HSAFileXferRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HSAFileXferRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HSAFileXferRequest)) {
                return super.equals(obj);
            }
            HSAFileXferRequest hSAFileXferRequest = (HSAFileXferRequest) obj;
            if (hasRequestSync() != hSAFileXferRequest.hasRequestSync()) {
                return false;
            }
            if ((!hasRequestSync() || getRequestSync() == hSAFileXferRequest.getRequestSync()) && hasRequestType() == hSAFileXferRequest.hasRequestType()) {
                return (!hasRequestType() || this.requestType_ == hSAFileXferRequest.requestType_) && getUnknownFields().equals(hSAFileXferRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HSAFileXferRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferRequestOrBuilder
        public boolean getRequestSync() {
            return this.requestSync_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferRequestOrBuilder
        public RequestType getRequestType() {
            RequestType requestTypeForNumber = RequestType.forNumber(this.requestType_);
            return requestTypeForNumber == null ? RequestType.UHC : requestTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.requestSync_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(2, this.requestType_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferRequestOrBuilder
        public boolean hasRequestSync() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferRequestOrBuilder
        public boolean hasRequestType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasRequestSync()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getRequestSync());
            }
            if (hasRequestType()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.requestType_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFileXferRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAFileXferRequest.class, Builder.class);
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
            if (hasRequestSync()) {
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
            return new HSAFileXferRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.requestSync_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.requestType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HSAFileXferRequestOrBuilder {
            private int bitField0_;
            private boolean requestSync_;
            private int requestType_;

            private Builder() {
                this.requestType_ = 0;
            }

            private void buildPartial0(HSAFileXferRequest hSAFileXferRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    hSAFileXferRequest.requestSync_ = this.requestSync_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    hSAFileXferRequest.requestType_ = this.requestType_;
                    i14 |= 2;
                }
                hSAFileXferRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFileXferRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAFileXferRequest build() {
                HSAFileXferRequest hSAFileXferRequestBuildPartial = buildPartial();
                if (hSAFileXferRequestBuildPartial.isInitialized()) {
                    return hSAFileXferRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) hSAFileXferRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAFileXferRequest buildPartial() {
                HSAFileXferRequest hSAFileXferRequest = new HSAFileXferRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(hSAFileXferRequest);
                }
                onBuilt();
                return hSAFileXferRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.requestSync_ = false;
                this.requestType_ = 0;
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

            public Builder clearRequestSync() {
                this.bitField0_ &= -2;
                this.requestSync_ = false;
                onChanged();
                return this;
            }

            public Builder clearRequestType() {
                this.bitField0_ &= -3;
                this.requestType_ = 0;
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
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFileXferRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferRequestOrBuilder
            public boolean getRequestSync() {
                return this.requestSync_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferRequestOrBuilder
            public RequestType getRequestType() {
                RequestType requestTypeForNumber = RequestType.forNumber(this.requestType_);
                return requestTypeForNumber == null ? RequestType.UHC : requestTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferRequestOrBuilder
            public boolean hasRequestSync() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFileXferRequestOrBuilder
            public boolean hasRequestType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFileXferRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAFileXferRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasRequestSync();
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
                                    this.requestSync_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (RequestType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.requestType_ = i14;
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

            public Builder setRequestSync(boolean z14) {
                this.requestSync_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setRequestType(RequestType requestType) {
                requestType.getClass();
                this.bitField0_ |= 2;
                this.requestType_ = requestType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public HSAFileXferRequest getDefaultInstanceForType() {
                return HSAFileXferRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.requestType_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof HSAFileXferRequest) {
                    return mergeFrom((HSAFileXferRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HSAFileXferRequest hSAFileXferRequest) {
                if (hSAFileXferRequest == HSAFileXferRequest.getDefaultInstance()) {
                    return this;
                }
                if (hSAFileXferRequest.hasRequestSync()) {
                    setRequestSync(hSAFileXferRequest.getRequestSync());
                }
                if (hSAFileXferRequest.hasRequestType()) {
                    setRequestType(hSAFileXferRequest.getRequestType());
                }
                mergeUnknownFields(hSAFileXferRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HSAFileXferRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static HSAFileXferRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFileXferRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAFileXferRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static HSAFileXferRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HSAFileXferRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ HSAFileXferRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static HSAFileXferRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private HSAFileXferRequest() {
            this.requestSync_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.requestType_ = 0;
        }

        public static HSAFileXferRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static HSAFileXferRequest parseFrom(InputStream inputStream) {
            return (HSAFileXferRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static HSAFileXferRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFileXferRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAFileXferRequest parseFrom(CodedInputStream codedInputStream) {
            return (HSAFileXferRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HSAFileXferRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFileXferRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum RequestType implements ProtocolMessageEnum {
            UHC(0),
            CUSTOM(1),
            ECG_CLINICAL(2);

            public static final int CUSTOM_VALUE = 1;
            public static final int ECG_CLINICAL_VALUE = 2;
            public static final int UHC_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<RequestType> internalValueMap = new Internal.EnumLiteMap<RequestType>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAFileXferRequest.RequestType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public RequestType findValueByNumber(int i14) {
                    return RequestType.forNumber(i14);
                }
            };
            private static final RequestType[] VALUES = values();

            RequestType(int i14) {
                this.value = i14;
            }

            public static RequestType forNumber(int i14) {
                if (i14 == 0) {
                    return UHC;
                }
                if (i14 == 1) {
                    return CUSTOM;
                }
                if (i14 != 2) {
                    return null;
                }
                return ECG_CLINICAL;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return HSAFileXferRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<RequestType> internalGetValueMap() {
                return internalValueMap;
            }

            public static RequestType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static RequestType valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class HSAFitFileCompressionResponse extends GeneratedMessageV3 implements HSAFitFileCompressionResponseOrBuilder {
        public static final int FILES_COMPRESSED_BF_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int filesCompressedBf_;
        private byte memoizedIsInitialized;
        private int status_;
        private static final HSAFitFileCompressionResponse DEFAULT_INSTANCE = new HSAFitFileCompressionResponse();

        @Deprecated
        public static final Parser<HSAFitFileCompressionResponse> PARSER = new AbstractParser<HSAFitFileCompressionResponse>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAFitFileCompressionResponse.1
            @Override // com.google.protobuf.Parser
            public HSAFitFileCompressionResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HSAFitFileCompressionResponse.newBuilder();
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

        private HSAFitFileCompressionResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.filesCompressedBf_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HSAFitFileCompressionResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitFileCompressionResponse_descriptor;
        }

        public static Builder newBuilder(HSAFitFileCompressionResponse hSAFitFileCompressionResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hSAFitFileCompressionResponse);
        }

        public static HSAFitFileCompressionResponse parseDelimitedFrom(InputStream inputStream) {
            return (HSAFitFileCompressionResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HSAFitFileCompressionResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HSAFitFileCompressionResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HSAFitFileCompressionResponse)) {
                return super.equals(obj);
            }
            HSAFitFileCompressionResponse hSAFitFileCompressionResponse = (HSAFitFileCompressionResponse) obj;
            if (hasStatus() != hSAFitFileCompressionResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == hSAFitFileCompressionResponse.status_) && hasFilesCompressedBf() == hSAFitFileCompressionResponse.hasFilesCompressedBf()) {
                return (!hasFilesCompressedBf() || getFilesCompressedBf() == hSAFitFileCompressionResponse.getFilesCompressedBf()) && getUnknownFields().equals(hSAFitFileCompressionResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitFileCompressionResponseOrBuilder
        public int getFilesCompressedBf() {
            return this.filesCompressedBf_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HSAFitFileCompressionResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.filesCompressedBf_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitFileCompressionResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitFileCompressionResponseOrBuilder
        public boolean hasFilesCompressedBf() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitFileCompressionResponseOrBuilder
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
            if (hasFilesCompressedBf()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getFilesCompressedBf();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitFileCompressionResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAFitFileCompressionResponse.class, Builder.class);
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
            if (!hasStatus()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasFilesCompressedBf()) {
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
            return new HSAFitFileCompressionResponse();
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
                codedOutputStream.writeUInt32(2, this.filesCompressedBf_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HSAFitFileCompressionResponseOrBuilder {
            private int bitField0_;
            private int filesCompressedBf_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(HSAFitFileCompressionResponse hSAFitFileCompressionResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    hSAFitFileCompressionResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    hSAFitFileCompressionResponse.filesCompressedBf_ = this.filesCompressedBf_;
                    i14 |= 2;
                }
                hSAFitFileCompressionResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitFileCompressionResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAFitFileCompressionResponse build() {
                HSAFitFileCompressionResponse hSAFitFileCompressionResponseBuildPartial = buildPartial();
                if (hSAFitFileCompressionResponseBuildPartial.isInitialized()) {
                    return hSAFitFileCompressionResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) hSAFitFileCompressionResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAFitFileCompressionResponse buildPartial() {
                HSAFitFileCompressionResponse hSAFitFileCompressionResponse = new HSAFitFileCompressionResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(hSAFitFileCompressionResponse);
                }
                onBuilt();
                return hSAFitFileCompressionResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.filesCompressedBf_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFilesCompressedBf() {
                this.bitField0_ &= -3;
                this.filesCompressedBf_ = 0;
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
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitFileCompressionResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitFileCompressionResponseOrBuilder
            public int getFilesCompressedBf() {
                return this.filesCompressedBf_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitFileCompressionResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitFileCompressionResponseOrBuilder
            public boolean hasFilesCompressedBf() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitFileCompressionResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitFileCompressionResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAFitFileCompressionResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStatus() && hasFilesCompressedBf();
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
                                    this.filesCompressedBf_ = codedInputStream.readUInt32();
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

            public Builder setFilesCompressedBf(int i14) {
                this.filesCompressedBf_ = i14;
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
            public HSAFitFileCompressionResponse getDefaultInstanceForType() {
                return HSAFitFileCompressionResponse.getDefaultInstance();
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
                if (message instanceof HSAFitFileCompressionResponse) {
                    return mergeFrom((HSAFitFileCompressionResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HSAFitFileCompressionResponse hSAFitFileCompressionResponse) {
                if (hSAFitFileCompressionResponse == HSAFitFileCompressionResponse.getDefaultInstance()) {
                    return this;
                }
                if (hSAFitFileCompressionResponse.hasStatus()) {
                    setStatus(hSAFitFileCompressionResponse.getStatus());
                }
                if (hSAFitFileCompressionResponse.hasFilesCompressedBf()) {
                    setFilesCompressedBf(hSAFitFileCompressionResponse.getFilesCompressedBf());
                }
                mergeUnknownFields(hSAFitFileCompressionResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HSAFitFileCompressionResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static HSAFitFileCompressionResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFitFileCompressionResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAFitFileCompressionResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static HSAFitFileCompressionResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HSAFitFileCompressionResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ HSAFitFileCompressionResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static HSAFitFileCompressionResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private HSAFitFileCompressionResponse() {
            this.filesCompressedBf_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static HSAFitFileCompressionResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static HSAFitFileCompressionResponse parseFrom(InputStream inputStream) {
            return (HSAFitFileCompressionResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static HSAFitFileCompressionResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFitFileCompressionResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAFitFileCompressionResponse parseFrom(CodedInputStream codedInputStream) {
            return (HSAFitFileCompressionResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HSAFitFileCompressionResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFitFileCompressionResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN_RESPONSE_STATUS(0),
            OK(100),
            ERROR(200);

            public static final int ERROR_VALUE = 200;
            public static final int OK_VALUE = 100;
            public static final int UNKNOWN_RESPONSE_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAFitFileCompressionResponse.ResponseStatus.1
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
                    return UNKNOWN_RESPONSE_STATUS;
                }
                if (i14 == 100) {
                    return OK;
                }
                if (i14 != 200) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return HSAFitFileCompressionResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class HSAFitLogCapabilitiesResponse extends GeneratedMessageV3 implements HSAFitLogCapabilitiesResponseOrBuilder {
        public static final int CAPABILITIES_BF_FIELD_NUMBER = 2;
        private static final HSAFitLogCapabilitiesResponse DEFAULT_INSTANCE = new HSAFitLogCapabilitiesResponse();

        @Deprecated
        public static final Parser<HSAFitLogCapabilitiesResponse> PARSER = new AbstractParser<HSAFitLogCapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAFitLogCapabilitiesResponse.1
            @Override // com.google.protobuf.Parser
            public HSAFitLogCapabilitiesResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HSAFitLogCapabilitiesResponse.newBuilder();
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
        private int capabilitiesBf_;
        private byte memoizedIsInitialized;
        private int status_;

        private HSAFitLogCapabilitiesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.capabilitiesBf_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HSAFitLogCapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogCapabilitiesResponse_descriptor;
        }

        public static Builder newBuilder(HSAFitLogCapabilitiesResponse hSAFitLogCapabilitiesResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hSAFitLogCapabilitiesResponse);
        }

        public static HSAFitLogCapabilitiesResponse parseDelimitedFrom(InputStream inputStream) {
            return (HSAFitLogCapabilitiesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HSAFitLogCapabilitiesResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HSAFitLogCapabilitiesResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HSAFitLogCapabilitiesResponse)) {
                return super.equals(obj);
            }
            HSAFitLogCapabilitiesResponse hSAFitLogCapabilitiesResponse = (HSAFitLogCapabilitiesResponse) obj;
            if (hasStatus() != hSAFitLogCapabilitiesResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == hSAFitLogCapabilitiesResponse.status_) && hasCapabilitiesBf() == hSAFitLogCapabilitiesResponse.hasCapabilitiesBf()) {
                return (!hasCapabilitiesBf() || getCapabilitiesBf() == hSAFitLogCapabilitiesResponse.getCapabilitiesBf()) && getUnknownFields().equals(hSAFitLogCapabilitiesResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogCapabilitiesResponseOrBuilder
        public int getCapabilitiesBf() {
            return this.capabilitiesBf_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HSAFitLogCapabilitiesResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.capabilitiesBf_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogCapabilitiesResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogCapabilitiesResponseOrBuilder
        public boolean hasCapabilitiesBf() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogCapabilitiesResponseOrBuilder
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
            if (hasCapabilitiesBf()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getCapabilitiesBf();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogCapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAFitLogCapabilitiesResponse.class, Builder.class);
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
            if (!hasStatus()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasCapabilitiesBf()) {
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
            return new HSAFitLogCapabilitiesResponse();
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
                codedOutputStream.writeUInt32(2, this.capabilitiesBf_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HSAFitLogCapabilitiesResponseOrBuilder {
            private int bitField0_;
            private int capabilitiesBf_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(HSAFitLogCapabilitiesResponse hSAFitLogCapabilitiesResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    hSAFitLogCapabilitiesResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    hSAFitLogCapabilitiesResponse.capabilitiesBf_ = this.capabilitiesBf_;
                    i14 |= 2;
                }
                hSAFitLogCapabilitiesResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogCapabilitiesResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAFitLogCapabilitiesResponse build() {
                HSAFitLogCapabilitiesResponse hSAFitLogCapabilitiesResponseBuildPartial = buildPartial();
                if (hSAFitLogCapabilitiesResponseBuildPartial.isInitialized()) {
                    return hSAFitLogCapabilitiesResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) hSAFitLogCapabilitiesResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAFitLogCapabilitiesResponse buildPartial() {
                HSAFitLogCapabilitiesResponse hSAFitLogCapabilitiesResponse = new HSAFitLogCapabilitiesResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(hSAFitLogCapabilitiesResponse);
                }
                onBuilt();
                return hSAFitLogCapabilitiesResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.capabilitiesBf_ = 0;
                return this;
            }

            public Builder clearCapabilitiesBf() {
                this.bitField0_ &= -3;
                this.capabilitiesBf_ = 0;
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

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogCapabilitiesResponseOrBuilder
            public int getCapabilitiesBf() {
                return this.capabilitiesBf_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogCapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogCapabilitiesResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogCapabilitiesResponseOrBuilder
            public boolean hasCapabilitiesBf() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogCapabilitiesResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogCapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAFitLogCapabilitiesResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStatus() && hasCapabilitiesBf();
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
                                    this.capabilitiesBf_ = codedInputStream.readUInt32();
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

            public Builder setCapabilitiesBf(int i14) {
                this.capabilitiesBf_ = i14;
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
            public HSAFitLogCapabilitiesResponse getDefaultInstanceForType() {
                return HSAFitLogCapabilitiesResponse.getDefaultInstance();
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
                if (message instanceof HSAFitLogCapabilitiesResponse) {
                    return mergeFrom((HSAFitLogCapabilitiesResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HSAFitLogCapabilitiesResponse hSAFitLogCapabilitiesResponse) {
                if (hSAFitLogCapabilitiesResponse == HSAFitLogCapabilitiesResponse.getDefaultInstance()) {
                    return this;
                }
                if (hSAFitLogCapabilitiesResponse.hasStatus()) {
                    setStatus(hSAFitLogCapabilitiesResponse.getStatus());
                }
                if (hSAFitLogCapabilitiesResponse.hasCapabilitiesBf()) {
                    setCapabilitiesBf(hSAFitLogCapabilitiesResponse.getCapabilitiesBf());
                }
                mergeUnknownFields(hSAFitLogCapabilitiesResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HSAFitLogCapabilitiesResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static HSAFitLogCapabilitiesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFitLogCapabilitiesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAFitLogCapabilitiesResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static HSAFitLogCapabilitiesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HSAFitLogCapabilitiesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ HSAFitLogCapabilitiesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static HSAFitLogCapabilitiesResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private HSAFitLogCapabilitiesResponse() {
            this.capabilitiesBf_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static HSAFitLogCapabilitiesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static HSAFitLogCapabilitiesResponse parseFrom(InputStream inputStream) {
            return (HSAFitLogCapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static HSAFitLogCapabilitiesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFitLogCapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAFitLogCapabilitiesResponse parseFrom(CodedInputStream codedInputStream) {
            return (HSAFitLogCapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HSAFitLogCapabilitiesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFitLogCapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN_RESPONSE_STATUS(0),
            OK(100),
            ERROR(200);

            public static final int ERROR_VALUE = 200;
            public static final int OK_VALUE = 100;
            public static final int UNKNOWN_RESPONSE_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAFitLogCapabilitiesResponse.ResponseStatus.1
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
                    return UNKNOWN_RESPONSE_STATUS;
                }
                if (i14 == 100) {
                    return OK;
                }
                if (i14 != 200) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return HSAFitLogCapabilitiesResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class HSAFitLogConfig extends GeneratedMessageV3 implements HSAFitLogConfigOrBuilder {
        private static final HSAFitLogConfig DEFAULT_INSTANCE = new HSAFitLogConfig();

        @Deprecated
        public static final Parser<HSAFitLogConfig> PARSER = new AbstractParser<HSAFitLogConfig>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAFitLogConfig.1
            @Override // com.google.protobuf.Parser
            public HSAFitLogConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HSAFitLogConfig.newBuilder();
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
        public static final int PROCESSING_INTERVAL_FIELD_NUMBER = 3;
        public static final int SOURCE_FIELD_NUMBER = 2;
        public static final int STATE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int processingInterval_;
        private int source_;
        private boolean state_;

        private HSAFitLogConfig(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.state_ = false;
            this.source_ = 0;
            this.processingInterval_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HSAFitLogConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogConfig_descriptor;
        }

        public static Builder newBuilder(HSAFitLogConfig hSAFitLogConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hSAFitLogConfig);
        }

        public static HSAFitLogConfig parseDelimitedFrom(InputStream inputStream) {
            return (HSAFitLogConfig) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HSAFitLogConfig parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HSAFitLogConfig> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HSAFitLogConfig)) {
                return super.equals(obj);
            }
            HSAFitLogConfig hSAFitLogConfig = (HSAFitLogConfig) obj;
            if (hasState() != hSAFitLogConfig.hasState()) {
                return false;
            }
            if ((hasState() && getState() != hSAFitLogConfig.getState()) || hasSource() != hSAFitLogConfig.hasSource()) {
                return false;
            }
            if ((!hasSource() || this.source_ == hSAFitLogConfig.source_) && hasProcessingInterval() == hSAFitLogConfig.hasProcessingInterval()) {
                return (!hasProcessingInterval() || getProcessingInterval() == hSAFitLogConfig.getProcessingInterval()) && getUnknownFields().equals(hSAFitLogConfig.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HSAFitLogConfig> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigOrBuilder
        public int getProcessingInterval() {
            return this.processingInterval_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.state_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(2, this.source_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt32Size(3, this.processingInterval_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigOrBuilder
        public SourceType getSource() {
            SourceType sourceTypeForNumber = SourceType.forNumber(this.source_);
            return sourceTypeForNumber == null ? SourceType.HRV : sourceTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigOrBuilder
        public boolean getState() {
            return this.state_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigOrBuilder
        public boolean hasProcessingInterval() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigOrBuilder
        public boolean hasSource() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigOrBuilder
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
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getState());
            }
            if (hasSource()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.source_;
            }
            if (hasProcessingInterval()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getProcessingInterval();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAFitLogConfig.class, Builder.class);
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
            if (hasSource()) {
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
            return new HSAFitLogConfig();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.state_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.source_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.processingInterval_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HSAFitLogConfigOrBuilder {
            private int bitField0_;
            private int processingInterval_;
            private int source_;
            private boolean state_;

            private Builder() {
                this.source_ = 0;
            }

            private void buildPartial0(HSAFitLogConfig hSAFitLogConfig) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    hSAFitLogConfig.state_ = this.state_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    hSAFitLogConfig.source_ = this.source_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    hSAFitLogConfig.processingInterval_ = this.processingInterval_;
                    i14 |= 4;
                }
                hSAFitLogConfig.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogConfig_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAFitLogConfig build() {
                HSAFitLogConfig hSAFitLogConfigBuildPartial = buildPartial();
                if (hSAFitLogConfigBuildPartial.isInitialized()) {
                    return hSAFitLogConfigBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) hSAFitLogConfigBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAFitLogConfig buildPartial() {
                HSAFitLogConfig hSAFitLogConfig = new HSAFitLogConfig(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(hSAFitLogConfig);
                }
                onBuilt();
                return hSAFitLogConfig;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.state_ = false;
                this.source_ = 0;
                this.processingInterval_ = 0;
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

            public Builder clearProcessingInterval() {
                this.bitField0_ &= -5;
                this.processingInterval_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSource() {
                this.bitField0_ &= -3;
                this.source_ = 0;
                onChanged();
                return this;
            }

            public Builder clearState() {
                this.bitField0_ &= -2;
                this.state_ = false;
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
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogConfig_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigOrBuilder
            public int getProcessingInterval() {
                return this.processingInterval_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigOrBuilder
            public SourceType getSource() {
                SourceType sourceTypeForNumber = SourceType.forNumber(this.source_);
                return sourceTypeForNumber == null ? SourceType.HRV : sourceTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigOrBuilder
            public boolean getState() {
                return this.state_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigOrBuilder
            public boolean hasProcessingInterval() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigOrBuilder
            public boolean hasSource() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigOrBuilder
            public boolean hasState() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAFitLogConfig.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSource();
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
                                    this.state_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (SourceType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.source_ = i14;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 24) {
                                    this.processingInterval_ = codedInputStream.readUInt32();
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

            public Builder setProcessingInterval(int i14) {
                this.processingInterval_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSource(SourceType sourceType) {
                sourceType.getClass();
                this.bitField0_ |= 2;
                this.source_ = sourceType.getNumber();
                onChanged();
                return this;
            }

            public Builder setState(boolean z14) {
                this.state_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public HSAFitLogConfig getDefaultInstanceForType() {
                return HSAFitLogConfig.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.source_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof HSAFitLogConfig) {
                    return mergeFrom((HSAFitLogConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HSAFitLogConfig hSAFitLogConfig) {
                if (hSAFitLogConfig == HSAFitLogConfig.getDefaultInstance()) {
                    return this;
                }
                if (hSAFitLogConfig.hasState()) {
                    setState(hSAFitLogConfig.getState());
                }
                if (hSAFitLogConfig.hasSource()) {
                    setSource(hSAFitLogConfig.getSource());
                }
                if (hSAFitLogConfig.hasProcessingInterval()) {
                    setProcessingInterval(hSAFitLogConfig.getProcessingInterval());
                }
                mergeUnknownFields(hSAFitLogConfig.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HSAFitLogConfig getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static HSAFitLogConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFitLogConfig) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAFitLogConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static HSAFitLogConfig parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HSAFitLogConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static HSAFitLogConfig parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static HSAFitLogConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ HSAFitLogConfig(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static HSAFitLogConfig parseFrom(InputStream inputStream) {
            return (HSAFitLogConfig) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private HSAFitLogConfig() {
            this.state_ = false;
            this.processingInterval_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.source_ = 0;
        }

        public static HSAFitLogConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFitLogConfig) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAFitLogConfig parseFrom(CodedInputStream codedInputStream) {
            return (HSAFitLogConfig) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HSAFitLogConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFitLogConfig) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum SourceType implements ProtocolMessageEnum {
            HRV(0),
            ZERO_CROSSING(1),
            HEART_RATE(2),
            RAW_ACCEL(3),
            RAW_PPG(4),
            RESPIRATION(5),
            SPO2(6),
            STEPS(7),
            STRESS(8),
            HYDRATION(9),
            BODY_BATTERY(10),
            RAW_GYRO(11);

            public static final int BODY_BATTERY_VALUE = 10;
            public static final int HEART_RATE_VALUE = 2;
            public static final int HRV_VALUE = 0;
            public static final int HYDRATION_VALUE = 9;
            public static final int RAW_ACCEL_VALUE = 3;
            public static final int RAW_GYRO_VALUE = 11;
            public static final int RAW_PPG_VALUE = 4;
            public static final int RESPIRATION_VALUE = 5;
            public static final int SPO2_VALUE = 6;
            public static final int STEPS_VALUE = 7;
            public static final int STRESS_VALUE = 8;
            public static final int ZERO_CROSSING_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<SourceType> internalValueMap = new Internal.EnumLiteMap<SourceType>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAFitLogConfig.SourceType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SourceType findValueByNumber(int i14) {
                    return SourceType.forNumber(i14);
                }
            };
            private static final SourceType[] VALUES = values();

            SourceType(int i14) {
                this.value = i14;
            }

            public static SourceType forNumber(int i14) {
                switch (i14) {
                    case 0:
                        return HRV;
                    case 1:
                        return ZERO_CROSSING;
                    case 2:
                        return HEART_RATE;
                    case 3:
                        return RAW_ACCEL;
                    case 4:
                        return RAW_PPG;
                    case 5:
                        return RESPIRATION;
                    case 6:
                        return SPO2;
                    case 7:
                        return STEPS;
                    case 8:
                        return STRESS;
                    case 9:
                        return HYDRATION;
                    case 10:
                        return BODY_BATTERY;
                    case 11:
                        return RAW_GYRO;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return HSAFitLogConfig.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<SourceType> internalGetValueMap() {
                return internalValueMap;
            }

            public static SourceType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static SourceType valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class HSAFitLogConfigRequest extends GeneratedMessageV3 implements HSAFitLogConfigRequestOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 1;
        private static final HSAFitLogConfigRequest DEFAULT_INSTANCE = new HSAFitLogConfigRequest();

        @Deprecated
        public static final Parser<HSAFitLogConfigRequest> PARSER = new AbstractParser<HSAFitLogConfigRequest>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigRequest.1
            @Override // com.google.protobuf.Parser
            public HSAFitLogConfigRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HSAFitLogConfigRequest.newBuilder();
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
        private HSAFitLogConfig config_;
        private byte memoizedIsInitialized;

        private HSAFitLogConfigRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HSAFitLogConfigRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogConfigRequest_descriptor;
        }

        public static Builder newBuilder(HSAFitLogConfigRequest hSAFitLogConfigRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hSAFitLogConfigRequest);
        }

        public static HSAFitLogConfigRequest parseDelimitedFrom(InputStream inputStream) {
            return (HSAFitLogConfigRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HSAFitLogConfigRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HSAFitLogConfigRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HSAFitLogConfigRequest)) {
                return super.equals(obj);
            }
            HSAFitLogConfigRequest hSAFitLogConfigRequest = (HSAFitLogConfigRequest) obj;
            if (hasConfig() != hSAFitLogConfigRequest.hasConfig()) {
                return false;
            }
            return (!hasConfig() || getConfig().equals(hSAFitLogConfigRequest.getConfig())) && getUnknownFields().equals(hSAFitLogConfigRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigRequestOrBuilder
        public HSAFitLogConfig getConfig() {
            HSAFitLogConfig hSAFitLogConfig = this.config_;
            return hSAFitLogConfig == null ? HSAFitLogConfig.getDefaultInstance() : hSAFitLogConfig;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigRequestOrBuilder
        public HSAFitLogConfigOrBuilder getConfigOrBuilder() {
            HSAFitLogConfig hSAFitLogConfig = this.config_;
            return hSAFitLogConfig == null ? HSAFitLogConfig.getDefaultInstance() : hSAFitLogConfig;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HSAFitLogConfigRequest> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigRequestOrBuilder
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
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogConfigRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAFitLogConfigRequest.class, Builder.class);
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
            if (!hasConfig() || getConfig().isInitialized()) {
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
            return new HSAFitLogConfigRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HSAFitLogConfigRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<HSAFitLogConfig, HSAFitLogConfig.Builder, HSAFitLogConfigOrBuilder> configBuilder_;
            private HSAFitLogConfig config_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(HSAFitLogConfigRequest hSAFitLogConfigRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<HSAFitLogConfig, HSAFitLogConfig.Builder, HSAFitLogConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                    hSAFitLogConfigRequest.config_ = singleFieldBuilderV3 == null ? this.config_ : (HSAFitLogConfig) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                hSAFitLogConfigRequest.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<HSAFitLogConfig, HSAFitLogConfig.Builder, HSAFitLogConfigOrBuilder> getConfigFieldBuilder() {
                if (this.configBuilder_ == null) {
                    this.configBuilder_ = new SingleFieldBuilderV3<>(getConfig(), getParentForChildren(), isClean());
                    this.config_ = null;
                }
                return this.configBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogConfigRequest_descriptor;
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
            public HSAFitLogConfigRequest build() {
                HSAFitLogConfigRequest hSAFitLogConfigRequestBuildPartial = buildPartial();
                if (hSAFitLogConfigRequestBuildPartial.isInitialized()) {
                    return hSAFitLogConfigRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) hSAFitLogConfigRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAFitLogConfigRequest buildPartial() {
                HSAFitLogConfigRequest hSAFitLogConfigRequest = new HSAFitLogConfigRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(hSAFitLogConfigRequest);
                }
                onBuilt();
                return hSAFitLogConfigRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.config_ = null;
                SingleFieldBuilderV3<HSAFitLogConfig, HSAFitLogConfig.Builder, HSAFitLogConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configBuilder_ = null;
                }
                return this;
            }

            public Builder clearConfig() {
                this.bitField0_ &= -2;
                this.config_ = null;
                SingleFieldBuilderV3<HSAFitLogConfig, HSAFitLogConfig.Builder, HSAFitLogConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
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

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigRequestOrBuilder
            public HSAFitLogConfig getConfig() {
                SingleFieldBuilderV3<HSAFitLogConfig, HSAFitLogConfig.Builder, HSAFitLogConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFitLogConfig) singleFieldBuilderV3.getMessage();
                }
                HSAFitLogConfig hSAFitLogConfig = this.config_;
                return hSAFitLogConfig == null ? HSAFitLogConfig.getDefaultInstance() : hSAFitLogConfig;
            }

            public HSAFitLogConfig.Builder getConfigBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (HSAFitLogConfig.Builder) getConfigFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigRequestOrBuilder
            public HSAFitLogConfigOrBuilder getConfigOrBuilder() {
                SingleFieldBuilderV3<HSAFitLogConfig, HSAFitLogConfig.Builder, HSAFitLogConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFitLogConfigOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                HSAFitLogConfig hSAFitLogConfig = this.config_;
                return hSAFitLogConfig == null ? HSAFitLogConfig.getDefaultInstance() : hSAFitLogConfig;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogConfigRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigRequestOrBuilder
            public boolean hasConfig() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogConfigRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAFitLogConfigRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasConfig() || getConfig().isInitialized();
            }

            public Builder mergeConfig(HSAFitLogConfig hSAFitLogConfig) {
                HSAFitLogConfig hSAFitLogConfig2;
                SingleFieldBuilderV3<HSAFitLogConfig, HSAFitLogConfig.Builder, HSAFitLogConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(hSAFitLogConfig);
                } else if ((this.bitField0_ & 1) == 0 || (hSAFitLogConfig2 = this.config_) == null || hSAFitLogConfig2 == HSAFitLogConfig.getDefaultInstance()) {
                    this.config_ = hSAFitLogConfig;
                } else {
                    getConfigBuilder().mergeFrom(hSAFitLogConfig);
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

            public Builder setConfig(HSAFitLogConfig.Builder builder) {
                SingleFieldBuilderV3<HSAFitLogConfig, HSAFitLogConfig.Builder, HSAFitLogConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
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
            public HSAFitLogConfigRequest getDefaultInstanceForType() {
                return HSAFitLogConfigRequest.getDefaultInstance();
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

            public Builder setConfig(HSAFitLogConfig hSAFitLogConfig) {
                SingleFieldBuilderV3<HSAFitLogConfig, HSAFitLogConfig.Builder, HSAFitLogConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    hSAFitLogConfig.getClass();
                    this.config_ = hSAFitLogConfig;
                } else {
                    singleFieldBuilderV3.setMessage(hSAFitLogConfig);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof HSAFitLogConfigRequest) {
                    return mergeFrom((HSAFitLogConfigRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HSAFitLogConfigRequest hSAFitLogConfigRequest) {
                if (hSAFitLogConfigRequest == HSAFitLogConfigRequest.getDefaultInstance()) {
                    return this;
                }
                if (hSAFitLogConfigRequest.hasConfig()) {
                    mergeConfig(hSAFitLogConfigRequest.getConfig());
                }
                mergeUnknownFields(hSAFitLogConfigRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HSAFitLogConfigRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ HSAFitLogConfigRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private HSAFitLogConfigRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HSAFitLogConfigRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFitLogConfigRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAFitLogConfigRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static HSAFitLogConfigRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HSAFitLogConfigRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static HSAFitLogConfigRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static HSAFitLogConfigRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static HSAFitLogConfigRequest parseFrom(InputStream inputStream) {
            return (HSAFitLogConfigRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static HSAFitLogConfigRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFitLogConfigRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAFitLogConfigRequest parseFrom(CodedInputStream codedInputStream) {
            return (HSAFitLogConfigRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HSAFitLogConfigRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFitLogConfigRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class HSAFitLogConfigResponse extends GeneratedMessageV3 implements HSAFitLogConfigResponseOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 2;
        private static final HSAFitLogConfigResponse DEFAULT_INSTANCE = new HSAFitLogConfigResponse();

        @Deprecated
        public static final Parser<HSAFitLogConfigResponse> PARSER = new AbstractParser<HSAFitLogConfigResponse>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigResponse.1
            @Override // com.google.protobuf.Parser
            public HSAFitLogConfigResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HSAFitLogConfigResponse.newBuilder();
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
        private HSAFitLogConfig config_;
        private byte memoizedIsInitialized;
        private int status_;

        private HSAFitLogConfigResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HSAFitLogConfigResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogConfigResponse_descriptor;
        }

        public static Builder newBuilder(HSAFitLogConfigResponse hSAFitLogConfigResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hSAFitLogConfigResponse);
        }

        public static HSAFitLogConfigResponse parseDelimitedFrom(InputStream inputStream) {
            return (HSAFitLogConfigResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HSAFitLogConfigResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HSAFitLogConfigResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HSAFitLogConfigResponse)) {
                return super.equals(obj);
            }
            HSAFitLogConfigResponse hSAFitLogConfigResponse = (HSAFitLogConfigResponse) obj;
            if (hasStatus() != hSAFitLogConfigResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == hSAFitLogConfigResponse.status_) && hasConfig() == hSAFitLogConfigResponse.hasConfig()) {
                return (!hasConfig() || getConfig().equals(hSAFitLogConfigResponse.getConfig())) && getUnknownFields().equals(hSAFitLogConfigResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigResponseOrBuilder
        public HSAFitLogConfig getConfig() {
            HSAFitLogConfig hSAFitLogConfig = this.config_;
            return hSAFitLogConfig == null ? HSAFitLogConfig.getDefaultInstance() : hSAFitLogConfig;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigResponseOrBuilder
        public HSAFitLogConfigOrBuilder getConfigOrBuilder() {
            HSAFitLogConfig hSAFitLogConfig = this.config_;
            return hSAFitLogConfig == null ? HSAFitLogConfig.getDefaultInstance() : hSAFitLogConfig;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HSAFitLogConfigResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigResponseOrBuilder
        public boolean hasConfig() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigResponseOrBuilder
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
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogConfigResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAFitLogConfigResponse.class, Builder.class);
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
            if (!hasStatus()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasConfig() || getConfig().isInitialized()) {
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
            return new HSAFitLogConfigResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HSAFitLogConfigResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<HSAFitLogConfig, HSAFitLogConfig.Builder, HSAFitLogConfigOrBuilder> configBuilder_;
            private HSAFitLogConfig config_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(HSAFitLogConfigResponse hSAFitLogConfigResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    hSAFitLogConfigResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<HSAFitLogConfig, HSAFitLogConfig.Builder, HSAFitLogConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                    hSAFitLogConfigResponse.config_ = singleFieldBuilderV3 == null ? this.config_ : (HSAFitLogConfig) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                hSAFitLogConfigResponse.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<HSAFitLogConfig, HSAFitLogConfig.Builder, HSAFitLogConfigOrBuilder> getConfigFieldBuilder() {
                if (this.configBuilder_ == null) {
                    this.configBuilder_ = new SingleFieldBuilderV3<>(getConfig(), getParentForChildren(), isClean());
                    this.config_ = null;
                }
                return this.configBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogConfigResponse_descriptor;
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
            public HSAFitLogConfigResponse build() {
                HSAFitLogConfigResponse hSAFitLogConfigResponseBuildPartial = buildPartial();
                if (hSAFitLogConfigResponseBuildPartial.isInitialized()) {
                    return hSAFitLogConfigResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) hSAFitLogConfigResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAFitLogConfigResponse buildPartial() {
                HSAFitLogConfigResponse hSAFitLogConfigResponse = new HSAFitLogConfigResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(hSAFitLogConfigResponse);
                }
                onBuilt();
                return hSAFitLogConfigResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.config_ = null;
                SingleFieldBuilderV3<HSAFitLogConfig, HSAFitLogConfig.Builder, HSAFitLogConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configBuilder_ = null;
                }
                return this;
            }

            public Builder clearConfig() {
                this.bitField0_ &= -3;
                this.config_ = null;
                SingleFieldBuilderV3<HSAFitLogConfig, HSAFitLogConfig.Builder, HSAFitLogConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
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

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigResponseOrBuilder
            public HSAFitLogConfig getConfig() {
                SingleFieldBuilderV3<HSAFitLogConfig, HSAFitLogConfig.Builder, HSAFitLogConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFitLogConfig) singleFieldBuilderV3.getMessage();
                }
                HSAFitLogConfig hSAFitLogConfig = this.config_;
                return hSAFitLogConfig == null ? HSAFitLogConfig.getDefaultInstance() : hSAFitLogConfig;
            }

            public HSAFitLogConfig.Builder getConfigBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (HSAFitLogConfig.Builder) getConfigFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigResponseOrBuilder
            public HSAFitLogConfigOrBuilder getConfigOrBuilder() {
                SingleFieldBuilderV3<HSAFitLogConfig, HSAFitLogConfig.Builder, HSAFitLogConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HSAFitLogConfigOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                HSAFitLogConfig hSAFitLogConfig = this.config_;
                return hSAFitLogConfig == null ? HSAFitLogConfig.getDefaultInstance() : hSAFitLogConfig;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogConfigResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigResponseOrBuilder
            public boolean hasConfig() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAFitLogConfigResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAFitLogConfigResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasStatus()) {
                    return !hasConfig() || getConfig().isInitialized();
                }
                return false;
            }

            public Builder mergeConfig(HSAFitLogConfig hSAFitLogConfig) {
                HSAFitLogConfig hSAFitLogConfig2;
                SingleFieldBuilderV3<HSAFitLogConfig, HSAFitLogConfig.Builder, HSAFitLogConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(hSAFitLogConfig);
                } else if ((this.bitField0_ & 2) == 0 || (hSAFitLogConfig2 = this.config_) == null || hSAFitLogConfig2 == HSAFitLogConfig.getDefaultInstance()) {
                    this.config_ = hSAFitLogConfig;
                } else {
                    getConfigBuilder().mergeFrom(hSAFitLogConfig);
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
                                    if (ResponseStatus.forNumber(i14) == null) {
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

            public Builder setConfig(HSAFitLogConfig.Builder builder) {
                SingleFieldBuilderV3<HSAFitLogConfig, HSAFitLogConfig.Builder, HSAFitLogConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
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
            public HSAFitLogConfigResponse getDefaultInstanceForType() {
                return HSAFitLogConfigResponse.getDefaultInstance();
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

            public Builder setConfig(HSAFitLogConfig hSAFitLogConfig) {
                SingleFieldBuilderV3<HSAFitLogConfig, HSAFitLogConfig.Builder, HSAFitLogConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    hSAFitLogConfig.getClass();
                    this.config_ = hSAFitLogConfig;
                } else {
                    singleFieldBuilderV3.setMessage(hSAFitLogConfig);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof HSAFitLogConfigResponse) {
                    return mergeFrom((HSAFitLogConfigResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HSAFitLogConfigResponse hSAFitLogConfigResponse) {
                if (hSAFitLogConfigResponse == HSAFitLogConfigResponse.getDefaultInstance()) {
                    return this;
                }
                if (hSAFitLogConfigResponse.hasStatus()) {
                    setStatus(hSAFitLogConfigResponse.getStatus());
                }
                if (hSAFitLogConfigResponse.hasConfig()) {
                    mergeConfig(hSAFitLogConfigResponse.getConfig());
                }
                mergeUnknownFields(hSAFitLogConfigResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HSAFitLogConfigResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static HSAFitLogConfigResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFitLogConfigResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAFitLogConfigResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ HSAFitLogConfigResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static HSAFitLogConfigResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private HSAFitLogConfigResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HSAFitLogConfigResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static HSAFitLogConfigResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static HSAFitLogConfigResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static HSAFitLogConfigResponse parseFrom(InputStream inputStream) {
            return (HSAFitLogConfigResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static HSAFitLogConfigResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFitLogConfigResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAFitLogConfigResponse parseFrom(CodedInputStream codedInputStream) {
            return (HSAFitLogConfigResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HSAFitLogConfigResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAFitLogConfigResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN_RESPONSE_STATUS(0),
            OK(100),
            ERROR(200);

            public static final int ERROR_VALUE = 200;
            public static final int OK_VALUE = 100;
            public static final int UNKNOWN_RESPONSE_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAFitLogConfigResponse.ResponseStatus.1
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
                    return UNKNOWN_RESPONSE_STATUS;
                }
                if (i14 == 100) {
                    return OK;
                }
                if (i14 != 200) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return HSAFitLogConfigResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class HSAGenericRequest extends GeneratedMessageV3 implements HSAGenericRequestOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString data_;
        private int id_;
        private byte memoizedIsInitialized;
        private static final HSAGenericRequest DEFAULT_INSTANCE = new HSAGenericRequest();

        @Deprecated
        public static final Parser<HSAGenericRequest> PARSER = new AbstractParser<HSAGenericRequest>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAGenericRequest.1
            @Override // com.google.protobuf.Parser
            public HSAGenericRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HSAGenericRequest.newBuilder();
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

        private HSAGenericRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.data_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HSAGenericRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAGenericRequest_descriptor;
        }

        public static Builder newBuilder(HSAGenericRequest hSAGenericRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hSAGenericRequest);
        }

        public static HSAGenericRequest parseDelimitedFrom(InputStream inputStream) {
            return (HSAGenericRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HSAGenericRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HSAGenericRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HSAGenericRequest)) {
                return super.equals(obj);
            }
            HSAGenericRequest hSAGenericRequest = (HSAGenericRequest) obj;
            if (hasId() != hSAGenericRequest.hasId()) {
                return false;
            }
            if ((!hasId() || getId() == hSAGenericRequest.getId()) && hasData() == hSAGenericRequest.hasData()) {
                return (!hasData() || getData().equals(hSAGenericRequest.getData())) && getUnknownFields().equals(hSAGenericRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAGenericRequestOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAGenericRequestOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HSAGenericRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeInt32Size(1, this.id_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeInt32Size += CodedOutputStream.computeBytesSize(2, this.data_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAGenericRequestOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAGenericRequestOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
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
            if (hasData()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAGenericRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAGenericRequest.class, Builder.class);
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
            return new HSAGenericRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeInt32(1, this.id_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.data_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HSAGenericRequestOrBuilder {
            private int bitField0_;
            private ByteString data_;
            private int id_;

            private Builder() {
                this.data_ = ByteString.EMPTY;
            }

            private void buildPartial0(HSAGenericRequest hSAGenericRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    hSAGenericRequest.id_ = this.id_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    hSAGenericRequest.data_ = this.data_;
                    i14 |= 2;
                }
                hSAGenericRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAGenericRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAGenericRequest build() {
                HSAGenericRequest hSAGenericRequestBuildPartial = buildPartial();
                if (hSAGenericRequestBuildPartial.isInitialized()) {
                    return hSAGenericRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) hSAGenericRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAGenericRequest buildPartial() {
                HSAGenericRequest hSAGenericRequest = new HSAGenericRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(hSAGenericRequest);
                }
                onBuilt();
                return hSAGenericRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                this.data_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearData() {
                this.bitField0_ &= -3;
                this.data_ = HSAGenericRequest.getDefaultInstance().getData();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAGenericRequestOrBuilder
            public ByteString getData() {
                return this.data_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAGenericRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAGenericRequestOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAGenericRequestOrBuilder
            public boolean hasData() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAGenericRequestOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAGenericRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAGenericRequest.class, Builder.class);
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
                                    this.id_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.data_ = codedInputStream.readBytes();
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

            public Builder setData(ByteString byteString) {
                byteString.getClass();
                this.data_ = byteString;
                this.bitField0_ |= 2;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public HSAGenericRequest getDefaultInstanceForType() {
                return HSAGenericRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.data_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof HSAGenericRequest) {
                    return mergeFrom((HSAGenericRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HSAGenericRequest hSAGenericRequest) {
                if (hSAGenericRequest == HSAGenericRequest.getDefaultInstance()) {
                    return this;
                }
                if (hSAGenericRequest.hasId()) {
                    setId(hSAGenericRequest.getId());
                }
                if (hSAGenericRequest.hasData()) {
                    setData(hSAGenericRequest.getData());
                }
                mergeUnknownFields(hSAGenericRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HSAGenericRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static HSAGenericRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAGenericRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAGenericRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static HSAGenericRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HSAGenericRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static HSAGenericRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static HSAGenericRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ HSAGenericRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static HSAGenericRequest parseFrom(InputStream inputStream) {
            return (HSAGenericRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private HSAGenericRequest() {
            this.id_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.data_ = byteString;
        }

        public static HSAGenericRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAGenericRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAGenericRequest parseFrom(CodedInputStream codedInputStream) {
            return (HSAGenericRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HSAGenericRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAGenericRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class HSAGenericResponse extends GeneratedMessageV3 implements HSAGenericResponseOrBuilder {
        public static final int DATA_FIELD_NUMBER = 3;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int STATUS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString data_;
        private int id_;
        private byte memoizedIsInitialized;
        private int status_;
        private static final HSAGenericResponse DEFAULT_INSTANCE = new HSAGenericResponse();

        @Deprecated
        public static final Parser<HSAGenericResponse> PARSER = new AbstractParser<HSAGenericResponse>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAGenericResponse.1
            @Override // com.google.protobuf.Parser
            public HSAGenericResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HSAGenericResponse.newBuilder();
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

        private HSAGenericResponse() {
            this.id_ = 0;
            this.status_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.data_ = byteString;
        }

        public static HSAGenericResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAGenericResponse_descriptor;
        }

        public static Builder newBuilder(HSAGenericResponse hSAGenericResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hSAGenericResponse);
        }

        public static HSAGenericResponse parseDelimitedFrom(InputStream inputStream) {
            return (HSAGenericResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HSAGenericResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HSAGenericResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HSAGenericResponse)) {
                return super.equals(obj);
            }
            HSAGenericResponse hSAGenericResponse = (HSAGenericResponse) obj;
            if (hasId() != hSAGenericResponse.hasId()) {
                return false;
            }
            if ((hasId() && getId() != hSAGenericResponse.getId()) || hasStatus() != hSAGenericResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == hSAGenericResponse.status_) && hasData() == hSAGenericResponse.hasData()) {
                return (!hasData() || getData().equals(hSAGenericResponse.getData())) && getUnknownFields().equals(hSAGenericResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAGenericResponseOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAGenericResponseOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HSAGenericResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeInt32Size(1, this.id_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(2, this.status_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeInt32Size += CodedOutputStream.computeBytesSize(3, this.data_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAGenericResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_STATUS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAGenericResponseOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAGenericResponseOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.HSAGenericResponseOrBuilder
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
            if (hasId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getId();
            }
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.status_;
            }
            if (hasData()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAGenericResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAGenericResponse.class, Builder.class);
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
            return new HSAGenericResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeInt32(1, this.id_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.status_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBytes(3, this.data_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HSAGenericResponseOrBuilder {
            private int bitField0_;
            private ByteString data_;
            private int id_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                this.data_ = ByteString.EMPTY;
            }

            private void buildPartial0(HSAGenericResponse hSAGenericResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    hSAGenericResponse.id_ = this.id_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    hSAGenericResponse.status_ = this.status_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    hSAGenericResponse.data_ = this.data_;
                    i14 |= 4;
                }
                hSAGenericResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAGenericResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAGenericResponse build() {
                HSAGenericResponse hSAGenericResponseBuildPartial = buildPartial();
                if (hSAGenericResponseBuildPartial.isInitialized()) {
                    return hSAGenericResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) hSAGenericResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HSAGenericResponse buildPartial() {
                HSAGenericResponse hSAGenericResponse = new HSAGenericResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(hSAGenericResponse);
                }
                onBuilt();
                return hSAGenericResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                this.status_ = 0;
                this.data_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearData() {
                this.bitField0_ &= -5;
                this.data_ = HSAGenericResponse.getDefaultInstance().getData();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
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

            @Override // com.garmin.proto.generated.GDIHSAData.HSAGenericResponseOrBuilder
            public ByteString getData() {
                return this.data_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAGenericResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAGenericResponseOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAGenericResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_STATUS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAGenericResponseOrBuilder
            public boolean hasData() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAGenericResponseOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.HSAGenericResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_HSAGenericResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(HSAGenericResponse.class, Builder.class);
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
                                    this.id_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 26) {
                                    this.data_ = codedInputStream.readBytes();
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

            public Builder setData(ByteString byteString) {
                byteString.getClass();
                this.data_ = byteString;
                this.bitField0_ |= 4;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 2;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public HSAGenericResponse getDefaultInstanceForType() {
                return HSAGenericResponse.getDefaultInstance();
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
                this.data_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof HSAGenericResponse) {
                    return mergeFrom((HSAGenericResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HSAGenericResponse hSAGenericResponse) {
                if (hSAGenericResponse == HSAGenericResponse.getDefaultInstance()) {
                    return this;
                }
                if (hSAGenericResponse.hasId()) {
                    setId(hSAGenericResponse.getId());
                }
                if (hSAGenericResponse.hasStatus()) {
                    setStatus(hSAGenericResponse.getStatus());
                }
                if (hSAGenericResponse.hasData()) {
                    setData(hSAGenericResponse.getData());
                }
                mergeUnknownFields(hSAGenericResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HSAGenericResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static HSAGenericResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAGenericResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HSAGenericResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static HSAGenericResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HSAGenericResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static HSAGenericResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static HSAGenericResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static HSAGenericResponse parseFrom(InputStream inputStream) {
            return (HSAGenericResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static HSAGenericResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAGenericResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private HSAGenericResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.status_ = 0;
            this.data_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HSAGenericResponse parseFrom(CodedInputStream codedInputStream) {
            return (HSAGenericResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HSAGenericResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HSAGenericResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ HSAGenericResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN_STATUS(0),
            OK(100),
            ERROR(200);

            public static final int ERROR_VALUE = 200;
            public static final int OK_VALUE = 100;
            public static final int UNKNOWN_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAGenericResponse.ResponseStatus.1
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
                    return UNKNOWN_STATUS;
                }
                if (i14 == 100) {
                    return OK;
                }
                if (i14 != 200) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return HSAGenericResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class UHCAccelParametersSetResponse extends GeneratedMessageV3 implements UHCAccelParametersSetResponseOrBuilder {
        private static final UHCAccelParametersSetResponse DEFAULT_INSTANCE = new UHCAccelParametersSetResponse();

        @Deprecated
        public static final Parser<UHCAccelParametersSetResponse> PARSER = new AbstractParser<UHCAccelParametersSetResponse>() { // from class: com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetResponse.1
            @Override // com.google.protobuf.Parser
            public UHCAccelParametersSetResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UHCAccelParametersSetResponse.newBuilder();
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

        private UHCAccelParametersSetResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UHCAccelParametersSetResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCAccelParametersSetResponse_descriptor;
        }

        public static Builder newBuilder(UHCAccelParametersSetResponse uHCAccelParametersSetResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(uHCAccelParametersSetResponse);
        }

        public static UHCAccelParametersSetResponse parseDelimitedFrom(InputStream inputStream) {
            return (UHCAccelParametersSetResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UHCAccelParametersSetResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UHCAccelParametersSetResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UHCAccelParametersSetResponse)) {
                return super.equals(obj);
            }
            UHCAccelParametersSetResponse uHCAccelParametersSetResponse = (UHCAccelParametersSetResponse) obj;
            if (hasStatus() != uHCAccelParametersSetResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == uHCAccelParametersSetResponse.status_) && getUnknownFields().equals(uHCAccelParametersSetResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UHCAccelParametersSetResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetResponseOrBuilder
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
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCAccelParametersSetResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCAccelParametersSetResponse.class, Builder.class);
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
            return new UHCAccelParametersSetResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UHCAccelParametersSetResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(UHCAccelParametersSetResponse uHCAccelParametersSetResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    uHCAccelParametersSetResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                uHCAccelParametersSetResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCAccelParametersSetResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCAccelParametersSetResponse build() {
                UHCAccelParametersSetResponse uHCAccelParametersSetResponseBuildPartial = buildPartial();
                if (uHCAccelParametersSetResponseBuildPartial.isInitialized()) {
                    return uHCAccelParametersSetResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) uHCAccelParametersSetResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCAccelParametersSetResponse buildPartial() {
                UHCAccelParametersSetResponse uHCAccelParametersSetResponse = new UHCAccelParametersSetResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(uHCAccelParametersSetResponse);
                }
                onBuilt();
                return uHCAccelParametersSetResponse;
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
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCAccelParametersSetResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCAccelParametersSetResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCAccelParametersSetResponse.class, Builder.class);
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
            public UHCAccelParametersSetResponse getDefaultInstanceForType() {
                return UHCAccelParametersSetResponse.getDefaultInstance();
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
                if (message instanceof UHCAccelParametersSetResponse) {
                    return mergeFrom((UHCAccelParametersSetResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UHCAccelParametersSetResponse uHCAccelParametersSetResponse) {
                if (uHCAccelParametersSetResponse == UHCAccelParametersSetResponse.getDefaultInstance()) {
                    return this;
                }
                if (uHCAccelParametersSetResponse.hasStatus()) {
                    setStatus(uHCAccelParametersSetResponse.getStatus());
                }
                mergeUnknownFields(uHCAccelParametersSetResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UHCAccelParametersSetResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UHCAccelParametersSetResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCAccelParametersSetResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCAccelParametersSetResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ UHCAccelParametersSetResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UHCAccelParametersSetResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private UHCAccelParametersSetResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UHCAccelParametersSetResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UHCAccelParametersSetResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UHCAccelParametersSetResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UHCAccelParametersSetResponse parseFrom(InputStream inputStream) {
            return (UHCAccelParametersSetResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UHCAccelParametersSetResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCAccelParametersSetResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCAccelParametersSetResponse parseFrom(CodedInputStream codedInputStream) {
            return (UHCAccelParametersSetResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UHCAccelParametersSetResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCAccelParametersSetResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN_RESPONSE_STATUS(0),
            OK(100),
            ERROR(200);

            public static final int ERROR_VALUE = 200;
            public static final int OK_VALUE = 100;
            public static final int UNKNOWN_RESPONSE_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIHSAData.UHCAccelParametersSetResponse.ResponseStatus.1
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
                    return UNKNOWN_RESPONSE_STATUS;
                }
                if (i14 == 100) {
                    return OK;
                }
                if (i14 != 200) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return UHCAccelParametersSetResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class UHCActivationResponse extends GeneratedMessageV3 implements UHCActivationResponseOrBuilder {
        private static final UHCActivationResponse DEFAULT_INSTANCE = new UHCActivationResponse();

        @Deprecated
        public static final Parser<UHCActivationResponse> PARSER = new AbstractParser<UHCActivationResponse>() { // from class: com.garmin.proto.generated.GDIHSAData.UHCActivationResponse.1
            @Override // com.google.protobuf.Parser
            public UHCActivationResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UHCActivationResponse.newBuilder();
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
        public static final int UHC_UUID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int status_;
        private int uhcUUID_;

        private UHCActivationResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.uhcUUID_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UHCActivationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCActivationResponse_descriptor;
        }

        public static Builder newBuilder(UHCActivationResponse uHCActivationResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(uHCActivationResponse);
        }

        public static UHCActivationResponse parseDelimitedFrom(InputStream inputStream) {
            return (UHCActivationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UHCActivationResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UHCActivationResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UHCActivationResponse)) {
                return super.equals(obj);
            }
            UHCActivationResponse uHCActivationResponse = (UHCActivationResponse) obj;
            if (hasStatus() != uHCActivationResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == uHCActivationResponse.status_) && hasUhcUUID() == uHCActivationResponse.hasUhcUUID()) {
                return (!hasUhcUUID() || getUhcUUID() == uHCActivationResponse.getUhcUUID()) && getUnknownFields().equals(uHCActivationResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UHCActivationResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeInt32Size(2, this.uhcUUID_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCActivationResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCActivationResponseOrBuilder
        public int getUhcUUID() {
            return this.uhcUUID_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCActivationResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCActivationResponseOrBuilder
        public boolean hasUhcUUID() {
            return (this.bitField0_ & 2) != 0;
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
            if (hasUhcUUID()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getUhcUUID();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCActivationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCActivationResponse.class, Builder.class);
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
            if (!hasStatus()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasUhcUUID()) {
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
            return new UHCActivationResponse();
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
                codedOutputStream.writeInt32(2, this.uhcUUID_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UHCActivationResponseOrBuilder {
            private int bitField0_;
            private int status_;
            private int uhcUUID_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(UHCActivationResponse uHCActivationResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    uHCActivationResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    uHCActivationResponse.uhcUUID_ = this.uhcUUID_;
                    i14 |= 2;
                }
                uHCActivationResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCActivationResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCActivationResponse build() {
                UHCActivationResponse uHCActivationResponseBuildPartial = buildPartial();
                if (uHCActivationResponseBuildPartial.isInitialized()) {
                    return uHCActivationResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) uHCActivationResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCActivationResponse buildPartial() {
                UHCActivationResponse uHCActivationResponse = new UHCActivationResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(uHCActivationResponse);
                }
                onBuilt();
                return uHCActivationResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.uhcUUID_ = 0;
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

            public Builder clearUhcUUID() {
                this.bitField0_ &= -3;
                this.uhcUUID_ = 0;
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
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCActivationResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCActivationResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCActivationResponseOrBuilder
            public int getUhcUUID() {
                return this.uhcUUID_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCActivationResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCActivationResponseOrBuilder
            public boolean hasUhcUUID() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCActivationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCActivationResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStatus() && hasUhcUUID();
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
                                    this.uhcUUID_ = codedInputStream.readInt32();
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

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            public Builder setUhcUUID(int i14) {
                this.uhcUUID_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public UHCActivationResponse getDefaultInstanceForType() {
                return UHCActivationResponse.getDefaultInstance();
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
                if (message instanceof UHCActivationResponse) {
                    return mergeFrom((UHCActivationResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UHCActivationResponse uHCActivationResponse) {
                if (uHCActivationResponse == UHCActivationResponse.getDefaultInstance()) {
                    return this;
                }
                if (uHCActivationResponse.hasStatus()) {
                    setStatus(uHCActivationResponse.getStatus());
                }
                if (uHCActivationResponse.hasUhcUUID()) {
                    setUhcUUID(uHCActivationResponse.getUhcUUID());
                }
                mergeUnknownFields(uHCActivationResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UHCActivationResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UHCActivationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCActivationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCActivationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UHCActivationResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UHCActivationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ UHCActivationResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UHCActivationResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private UHCActivationResponse() {
            this.uhcUUID_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static UHCActivationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UHCActivationResponse parseFrom(InputStream inputStream) {
            return (UHCActivationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UHCActivationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCActivationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCActivationResponse parseFrom(CodedInputStream codedInputStream) {
            return (UHCActivationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UHCActivationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCActivationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN_RESPONSE_STATUS(0),
            OK(100),
            ERROR(200);

            public static final int ERROR_VALUE = 200;
            public static final int OK_VALUE = 100;
            public static final int UNKNOWN_RESPONSE_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIHSAData.UHCActivationResponse.ResponseStatus.1
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
                    return UNKNOWN_RESPONSE_STATUS;
                }
                if (i14 == 100) {
                    return OK;
                }
                if (i14 != 200) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return UHCActivationResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class UHCFitParametersSetResponse extends GeneratedMessageV3 implements UHCFitParametersSetResponseOrBuilder {
        private static final UHCFitParametersSetResponse DEFAULT_INSTANCE = new UHCFitParametersSetResponse();

        @Deprecated
        public static final Parser<UHCFitParametersSetResponse> PARSER = new AbstractParser<UHCFitParametersSetResponse>() { // from class: com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetResponse.1
            @Override // com.google.protobuf.Parser
            public UHCFitParametersSetResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UHCFitParametersSetResponse.newBuilder();
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

        private UHCFitParametersSetResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UHCFitParametersSetResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCFitParametersSetResponse_descriptor;
        }

        public static Builder newBuilder(UHCFitParametersSetResponse uHCFitParametersSetResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(uHCFitParametersSetResponse);
        }

        public static UHCFitParametersSetResponse parseDelimitedFrom(InputStream inputStream) {
            return (UHCFitParametersSetResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UHCFitParametersSetResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UHCFitParametersSetResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UHCFitParametersSetResponse)) {
                return super.equals(obj);
            }
            UHCFitParametersSetResponse uHCFitParametersSetResponse = (UHCFitParametersSetResponse) obj;
            if (hasStatus() != uHCFitParametersSetResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == uHCFitParametersSetResponse.status_) && getUnknownFields().equals(uHCFitParametersSetResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UHCFitParametersSetResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetResponseOrBuilder
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
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCFitParametersSetResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCFitParametersSetResponse.class, Builder.class);
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
            return new UHCFitParametersSetResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UHCFitParametersSetResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(UHCFitParametersSetResponse uHCFitParametersSetResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    uHCFitParametersSetResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                uHCFitParametersSetResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCFitParametersSetResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCFitParametersSetResponse build() {
                UHCFitParametersSetResponse uHCFitParametersSetResponseBuildPartial = buildPartial();
                if (uHCFitParametersSetResponseBuildPartial.isInitialized()) {
                    return uHCFitParametersSetResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) uHCFitParametersSetResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCFitParametersSetResponse buildPartial() {
                UHCFitParametersSetResponse uHCFitParametersSetResponse = new UHCFitParametersSetResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(uHCFitParametersSetResponse);
                }
                onBuilt();
                return uHCFitParametersSetResponse;
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
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCFitParametersSetResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCFitParametersSetResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCFitParametersSetResponse.class, Builder.class);
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
            public UHCFitParametersSetResponse getDefaultInstanceForType() {
                return UHCFitParametersSetResponse.getDefaultInstance();
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
                if (message instanceof UHCFitParametersSetResponse) {
                    return mergeFrom((UHCFitParametersSetResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UHCFitParametersSetResponse uHCFitParametersSetResponse) {
                if (uHCFitParametersSetResponse == UHCFitParametersSetResponse.getDefaultInstance()) {
                    return this;
                }
                if (uHCFitParametersSetResponse.hasStatus()) {
                    setStatus(uHCFitParametersSetResponse.getStatus());
                }
                mergeUnknownFields(uHCFitParametersSetResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UHCFitParametersSetResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UHCFitParametersSetResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCFitParametersSetResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCFitParametersSetResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ UHCFitParametersSetResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UHCFitParametersSetResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private UHCFitParametersSetResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UHCFitParametersSetResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UHCFitParametersSetResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UHCFitParametersSetResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UHCFitParametersSetResponse parseFrom(InputStream inputStream) {
            return (UHCFitParametersSetResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UHCFitParametersSetResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCFitParametersSetResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCFitParametersSetResponse parseFrom(CodedInputStream codedInputStream) {
            return (UHCFitParametersSetResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UHCFitParametersSetResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCFitParametersSetResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN_RESPONSE_STATUS(0),
            OK(100),
            ERROR(200);

            public static final int ERROR_VALUE = 200;
            public static final int OK_VALUE = 100;
            public static final int UNKNOWN_RESPONSE_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIHSAData.UHCFitParametersSetResponse.ResponseStatus.1
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
                    return UNKNOWN_RESPONSE_STATUS;
                }
                if (i14 == 100) {
                    return OK;
                }
                if (i14 != 200) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return UHCFitParametersSetResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class UHCTimeVarsSetResponse extends GeneratedMessageV3 implements UHCTimeVarsSetResponseOrBuilder {
        private static final UHCTimeVarsSetResponse DEFAULT_INSTANCE = new UHCTimeVarsSetResponse();

        @Deprecated
        public static final Parser<UHCTimeVarsSetResponse> PARSER = new AbstractParser<UHCTimeVarsSetResponse>() { // from class: com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetResponse.1
            @Override // com.google.protobuf.Parser
            public UHCTimeVarsSetResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UHCTimeVarsSetResponse.newBuilder();
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
        public static final int RTC_TIME_SEC_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        public static final int TIME_TO_MIDNIGHT_SEC_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int rtcTimeSec_;
        private int status_;
        private int timeToMidnightSec_;

        private UHCTimeVarsSetResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.rtcTimeSec_ = 0;
            this.timeToMidnightSec_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UHCTimeVarsSetResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCTimeVarsSetResponse_descriptor;
        }

        public static Builder newBuilder(UHCTimeVarsSetResponse uHCTimeVarsSetResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(uHCTimeVarsSetResponse);
        }

        public static UHCTimeVarsSetResponse parseDelimitedFrom(InputStream inputStream) {
            return (UHCTimeVarsSetResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UHCTimeVarsSetResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UHCTimeVarsSetResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UHCTimeVarsSetResponse)) {
                return super.equals(obj);
            }
            UHCTimeVarsSetResponse uHCTimeVarsSetResponse = (UHCTimeVarsSetResponse) obj;
            if (hasStatus() != uHCTimeVarsSetResponse.hasStatus()) {
                return false;
            }
            if ((hasStatus() && this.status_ != uHCTimeVarsSetResponse.status_) || hasRtcTimeSec() != uHCTimeVarsSetResponse.hasRtcTimeSec()) {
                return false;
            }
            if ((!hasRtcTimeSec() || getRtcTimeSec() == uHCTimeVarsSetResponse.getRtcTimeSec()) && hasTimeToMidnightSec() == uHCTimeVarsSetResponse.hasTimeToMidnightSec()) {
                return (!hasTimeToMidnightSec() || getTimeToMidnightSec() == uHCTimeVarsSetResponse.getTimeToMidnightSec()) && getUnknownFields().equals(uHCTimeVarsSetResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UHCTimeVarsSetResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetResponseOrBuilder
        public int getRtcTimeSec() {
            return this.rtcTimeSec_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.rtcTimeSec_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(3, this.timeToMidnightSec_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetResponseOrBuilder
        public int getTimeToMidnightSec() {
            return this.timeToMidnightSec_;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetResponseOrBuilder
        public boolean hasRtcTimeSec() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetResponseOrBuilder
        public boolean hasTimeToMidnightSec() {
            return (this.bitField0_ & 4) != 0;
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
            if (hasRtcTimeSec()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getRtcTimeSec();
            }
            if (hasTimeToMidnightSec()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getTimeToMidnightSec();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCTimeVarsSetResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCTimeVarsSetResponse.class, Builder.class);
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
            if (!hasStatus()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasRtcTimeSec()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasTimeToMidnightSec()) {
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
            return new UHCTimeVarsSetResponse();
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
                codedOutputStream.writeUInt32(2, this.rtcTimeSec_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.timeToMidnightSec_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UHCTimeVarsSetResponseOrBuilder {
            private int bitField0_;
            private int rtcTimeSec_;
            private int status_;
            private int timeToMidnightSec_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(UHCTimeVarsSetResponse uHCTimeVarsSetResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    uHCTimeVarsSetResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    uHCTimeVarsSetResponse.rtcTimeSec_ = this.rtcTimeSec_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    uHCTimeVarsSetResponse.timeToMidnightSec_ = this.timeToMidnightSec_;
                    i14 |= 4;
                }
                uHCTimeVarsSetResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCTimeVarsSetResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCTimeVarsSetResponse build() {
                UHCTimeVarsSetResponse uHCTimeVarsSetResponseBuildPartial = buildPartial();
                if (uHCTimeVarsSetResponseBuildPartial.isInitialized()) {
                    return uHCTimeVarsSetResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) uHCTimeVarsSetResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UHCTimeVarsSetResponse buildPartial() {
                UHCTimeVarsSetResponse uHCTimeVarsSetResponse = new UHCTimeVarsSetResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(uHCTimeVarsSetResponse);
                }
                onBuilt();
                return uHCTimeVarsSetResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.rtcTimeSec_ = 0;
                this.timeToMidnightSec_ = 0;
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

            public Builder clearRtcTimeSec() {
                this.bitField0_ &= -3;
                this.rtcTimeSec_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.bitField0_ &= -2;
                this.status_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTimeToMidnightSec() {
                this.bitField0_ &= -5;
                this.timeToMidnightSec_ = 0;
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
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCTimeVarsSetResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetResponseOrBuilder
            public int getRtcTimeSec() {
                return this.rtcTimeSec_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetResponseOrBuilder
            public int getTimeToMidnightSec() {
                return this.timeToMidnightSec_;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetResponseOrBuilder
            public boolean hasRtcTimeSec() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetResponseOrBuilder
            public boolean hasTimeToMidnightSec() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIHSAData.internal_static_GDI_Proto_HSAData_UHCTimeVarsSetResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UHCTimeVarsSetResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStatus() && hasRtcTimeSec() && hasTimeToMidnightSec();
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
                                    this.rtcTimeSec_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.timeToMidnightSec_ = codedInputStream.readUInt32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setRtcTimeSec(int i14) {
                this.rtcTimeSec_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            public Builder setTimeToMidnightSec(int i14) {
                this.timeToMidnightSec_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public UHCTimeVarsSetResponse getDefaultInstanceForType() {
                return UHCTimeVarsSetResponse.getDefaultInstance();
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
                if (message instanceof UHCTimeVarsSetResponse) {
                    return mergeFrom((UHCTimeVarsSetResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UHCTimeVarsSetResponse uHCTimeVarsSetResponse) {
                if (uHCTimeVarsSetResponse == UHCTimeVarsSetResponse.getDefaultInstance()) {
                    return this;
                }
                if (uHCTimeVarsSetResponse.hasStatus()) {
                    setStatus(uHCTimeVarsSetResponse.getStatus());
                }
                if (uHCTimeVarsSetResponse.hasRtcTimeSec()) {
                    setRtcTimeSec(uHCTimeVarsSetResponse.getRtcTimeSec());
                }
                if (uHCTimeVarsSetResponse.hasTimeToMidnightSec()) {
                    setTimeToMidnightSec(uHCTimeVarsSetResponse.getTimeToMidnightSec());
                }
                mergeUnknownFields(uHCTimeVarsSetResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UHCTimeVarsSetResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UHCTimeVarsSetResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCTimeVarsSetResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCTimeVarsSetResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UHCTimeVarsSetResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UHCTimeVarsSetResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UHCTimeVarsSetResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UHCTimeVarsSetResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ UHCTimeVarsSetResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UHCTimeVarsSetResponse parseFrom(InputStream inputStream) {
            return (UHCTimeVarsSetResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private UHCTimeVarsSetResponse() {
            this.rtcTimeSec_ = 0;
            this.timeToMidnightSec_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static UHCTimeVarsSetResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCTimeVarsSetResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UHCTimeVarsSetResponse parseFrom(CodedInputStream codedInputStream) {
            return (UHCTimeVarsSetResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UHCTimeVarsSetResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UHCTimeVarsSetResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN_RESPONSE_STATUS(0),
            OK(100),
            ERROR(200);

            public static final int ERROR_VALUE = 200;
            public static final int OK_VALUE = 100;
            public static final int UNKNOWN_RESPONSE_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIHSAData.UHCTimeVarsSetResponse.ResponseStatus.1
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
                    return UNKNOWN_RESPONSE_STATUS;
                }
                if (i14 == 100) {
                    return OK;
                }
                if (i14 != 200) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return UHCTimeVarsSetResponse.getDescriptor().getEnumTypes().get(0);
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

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public enum HSAFeatures implements ProtocolMessageEnum {
        UNITED_HEALTHCARE(1),
        CUSTOM_DATA_LOGGING(2),
        CUSTOM_DATA_COMPRESSION(4),
        GENERIC_MSG(8),
        CUSTOM_DATA_SYNC2(16);

        public static final int CUSTOM_DATA_COMPRESSION_VALUE = 4;
        public static final int CUSTOM_DATA_LOGGING_VALUE = 2;
        public static final int CUSTOM_DATA_SYNC2_VALUE = 16;
        public static final int GENERIC_MSG_VALUE = 8;
        public static final int UNITED_HEALTHCARE_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<HSAFeatures> internalValueMap = new Internal.EnumLiteMap<HSAFeatures>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAFeatures.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public HSAFeatures findValueByNumber(int i14) {
                return HSAFeatures.forNumber(i14);
            }
        };
        private static final HSAFeatures[] VALUES = values();

        HSAFeatures(int i14) {
            this.value = i14;
        }

        public static HSAFeatures forNumber(int i14) {
            if (i14 == 1) {
                return UNITED_HEALTHCARE;
            }
            if (i14 == 2) {
                return CUSTOM_DATA_LOGGING;
            }
            if (i14 == 4) {
                return CUSTOM_DATA_COMPRESSION;
            }
            if (i14 == 8) {
                return GENERIC_MSG;
            }
            if (i14 != 16) {
                return null;
            }
            return CUSTOM_DATA_SYNC2;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIHSAData.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<HSAFeatures> internalGetValueMap() {
            return internalValueMap;
        }

        public static HSAFeatures valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static HSAFeatures valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum HSAFitFilesToCompress implements ProtocolMessageEnum {
        UNITED_HEALTHCARE_FILES(1),
        CUSTOM_DATA_LOG_FILES(2);

        public static final int CUSTOM_DATA_LOG_FILES_VALUE = 2;
        public static final int UNITED_HEALTHCARE_FILES_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<HSAFitFilesToCompress> internalValueMap = new Internal.EnumLiteMap<HSAFitFilesToCompress>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAFitFilesToCompress.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public HSAFitFilesToCompress findValueByNumber(int i14) {
                return HSAFitFilesToCompress.forNumber(i14);
            }
        };
        private static final HSAFitFilesToCompress[] VALUES = values();

        HSAFitFilesToCompress(int i14) {
            this.value = i14;
        }

        public static HSAFitFilesToCompress forNumber(int i14) {
            if (i14 == 1) {
                return UNITED_HEALTHCARE_FILES;
            }
            if (i14 != 2) {
                return null;
            }
            return CUSTOM_DATA_LOG_FILES;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIHSAData.getDescriptor().getEnumTypes().get(2);
        }

        public static Internal.EnumLiteMap<HSAFitFilesToCompress> internalGetValueMap() {
            return internalValueMap;
        }

        public static HSAFitFilesToCompress valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static HSAFitFilesToCompress valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum HSAFitLogCapabilities implements ProtocolMessageEnum {
        HRV(1),
        ZERO_CROSSING(2),
        HEART_RATE(4),
        RAW_ACCEL(8),
        RAW_PPG(16),
        RESPIRATION(32),
        SPO2(64),
        STEPS(128),
        STRESS(256),
        HYDRATION(512),
        BODY_BATTERY(1024),
        RAW_GYRO(2048);

        public static final int BODY_BATTERY_VALUE = 1024;
        public static final int HEART_RATE_VALUE = 4;
        public static final int HRV_VALUE = 1;
        public static final int HYDRATION_VALUE = 512;
        public static final int RAW_ACCEL_VALUE = 8;
        public static final int RAW_GYRO_VALUE = 2048;
        public static final int RAW_PPG_VALUE = 16;
        public static final int RESPIRATION_VALUE = 32;
        public static final int SPO2_VALUE = 64;
        public static final int STEPS_VALUE = 128;
        public static final int STRESS_VALUE = 256;
        public static final int ZERO_CROSSING_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap<HSAFitLogCapabilities> internalValueMap = new Internal.EnumLiteMap<HSAFitLogCapabilities>() { // from class: com.garmin.proto.generated.GDIHSAData.HSAFitLogCapabilities.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public HSAFitLogCapabilities findValueByNumber(int i14) {
                return HSAFitLogCapabilities.forNumber(i14);
            }
        };
        private static final HSAFitLogCapabilities[] VALUES = values();

        HSAFitLogCapabilities(int i14) {
            this.value = i14;
        }

        public static HSAFitLogCapabilities forNumber(int i14) {
            if (i14 == 1) {
                return HRV;
            }
            if (i14 == 2) {
                return ZERO_CROSSING;
            }
            if (i14 == 4) {
                return HEART_RATE;
            }
            if (i14 == 8) {
                return RAW_ACCEL;
            }
            if (i14 == 16) {
                return RAW_PPG;
            }
            if (i14 == 32) {
                return RESPIRATION;
            }
            if (i14 == 64) {
                return SPO2;
            }
            if (i14 == 128) {
                return STEPS;
            }
            if (i14 == 256) {
                return STRESS;
            }
            if (i14 == 512) {
                return HYDRATION;
            }
            if (i14 == 1024) {
                return BODY_BATTERY;
            }
            if (i14 != 2048) {
                return null;
            }
            return RAW_GYRO;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIHSAData.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<HSAFitLogCapabilities> internalGetValueMap() {
            return internalValueMap;
        }

        public static HSAFitLogCapabilities valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static HSAFitLogCapabilities valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
